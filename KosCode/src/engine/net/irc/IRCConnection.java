package engine.net.irc;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import java.nio.CharBuffer;
import java.util.Vector;

public class IRCConnection
{
	private Socket s;
	private Writer out;
	private Reader in;
	
	private volatile boolean closing, closed;
	private final IRCSender sender;
	private final Vector<IRCMessage> output;
	private final IRCListener listener;
	private final Vector<IRCMessage> input;
	
	public IRCConnection(String host, int port) throws IOException
	{
		this(new Socket(host, port));
	}
	
	public IRCConnection(Socket s) throws IOException
	{
		this(s.getOutputStream(), s.getInputStream());
		this.s = s;
	}
	
	public IRCConnection(OutputStream out, InputStream in)
	{
		this.out = new OutputStreamWriter(out);
		this.in = new InputStreamReader(in);
		listener = new IRCListener();
		input = new Vector<>();
		sender = new IRCSender();
		output = new Vector<>();
	}
	
	public void send(IRCMessage msg)
	{
		if (!closing)
		{
			if (msg == null) throw new NullPointerException();
			synchronized (output)
			{
				output.add(msg);
				output.notify();
			}
		}
	}
	
	public IRCMessage get()
	{
		if (input.isEmpty()) return null;
		else return input.remove(0);
	}
	
	public IRCMessage receive() throws InterruptedException
	{
		if (closing) return null;
		synchronized (input)
		{
			if (input.isEmpty()) input.wait();
			return input.remove(0);
		}
	}
	
	public boolean closed()
	{
		return closed;
	}
	
	public void close()
	{
		if (!closing)
		{
			closing = true;
			Thread curr = Thread.currentThread();
			if (curr == sender || curr == listener)
			{
				new Thread()
				{
					public void run()
					{
						doClose();
					}
				}.start();
			}
			else doClose();
		}
	}
	
	private void doClose()
	{
		try
		{
			long time = System.currentTimeMillis() + 2000;
			sender.interrupt();
			sender.join(2000);
			time = time - System.currentTimeMillis();
			if (time > 0)
			{
				listener.interrupt();
				listener.join(time);
			}
		}
		catch (InterruptedException e)
		{
		}
		
		try
		{
			in.close();
			out.close();
			if (s != null) s.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
			s = null;
			in = null;
			out = null;
		}
		closed = true;
	}
	
	private final class IRCSender extends Thread
	{
		public void run()
		{
			try
			{
				while (!closing)
				{
					IRCMessage msg = null;
					synchronized (output)
					{
						if (output.isEmpty())
						{
							try
							{
								output.wait();
							}
							catch (InterruptedException e)
							{
								if (closing) break;
								throw e;
							}
						}
						msg = output.remove(0);
					}
					
					if (msg != null)
					{
						try
						{
							write(msg);
							out.write('\r');
							out.write('\n');
							out.flush();
						}
						catch (IOException e)
						{
							if (!closing) close();
						}
					}
				}
			}
			catch (Throwable t)
			{
				if (t instanceof Exception)
				{
					if (!closing)
					{
						t.printStackTrace();
						close();
					}
				}
				else
				{
					t.printStackTrace();
					System.exit(1);
				}
			}
		}
		
		private void write(IRCMessage msg) throws IOException
		{
			if (msg.prefix != null)
			{
				out.write(':');
				out.write(msg.prefix);
				out.write(' ');
			}
			out.write(msg.type.name());
			for (int i = 0; i < msg.type.fieldCount(); i++)
			{
				String val = msg.fields[i];
				if (val == null) throw new IOException("bad message, missing field");
				if (i == msg.fields.length - 1 && msg.type.lastSpace) out.write(':');
				out.write(val);
			}
		}
	}
	
	private final class IRCListener extends Thread
	{
		private CharBuffer buff;
		
		public IRCListener()
		{
			buff = CharBuffer.allocate(1024);
		}
		
		public void run()
		{
			try
			{
				while (!closing)
				{
					try
					{
						IRCMessage msg = read();
						if (msg == null)
						{
							System.out.println("reached end of stream");
							close();
						}
						else
						{
							synchronized (input)
							{
								input.add(msg);
								input.notify();
							}
						}
					}
					catch (IOException e)
					{
						if (!closing) close();
					}
				}
			}
			catch (Throwable t)
			{
				if (t instanceof Exception)
				{
					if (!closing)
					{
						t.printStackTrace();
						close();
					}
				}
				else
				{
					t.printStackTrace();
					System.exit(1);
				}
			}
		}
		
		private IRCMessage read() throws IOException
		{
			int c = in.read();
			if (c == -1) return null;
			String prefix = null;
			boolean eol;
			if (c == ':')
			{
				eol = parse(false);
				if (eol) throw new IOException("unexpected end of line");
				prefix = buff.toString();
			}
			else buff.put((char) c);
			eol = parse(false);
			IRCType type = IRCType.get(buff.toString());
			if (eol ^ type.fieldCount() == 0) throw new IOException("bad message format");
			
			IRCMessage msg = new IRCMessage(type);
			if (prefix != null) msg.prefix = prefix;
			for (int i = 0; i < type.fieldCount(); i++)
			{
				boolean t = i == type.fieldCount() - 1;
				eol = parse(t);
				if (eol != t) throw new IOException("bad message format");
				msg.fields[i] = buff.toString();
			}
			return msg;
		}
		
		private boolean parse(boolean needEOL) throws IOException
		{
			int prev = 0, c;
			while (true)
			{
				c = in.read();
				if (c == -1) break;
				if (!needEOL && c == ' ') break;
				if (c == '\n')
				{
					if (prev == '\r') break;
					else throw new IOException("bad newline");
				}
				else if (c != '\r')
				{
					if (prev == '\r') throw new IOException("bad newline");
					buff.append((char) c);
				}
				prev = c;
			}
			buff.flip();
			return false;
		}
	}
	
	protected void finalize()
	{
		close();
	}
}
