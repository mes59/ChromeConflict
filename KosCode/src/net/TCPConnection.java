package net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Vector;

import net.packet.Packet;
import net.packet.PacketDisconnect;

public class TCPConnection
{
	private static volatile int nextId = 0;
	
	protected final Socket socket;
	protected final OutputStream out;
	protected final InputStream in;
	
	protected volatile boolean closing;
	protected volatile boolean finished;
	
	public final int id;
	protected final TCPWriterThread writer;
	protected final TCPReaderThread reader;
	protected final Vector<Packet> output;
	protected final Vector<Packet> input;
	
	public TCPConnection(Socket socket) throws IOException
	{
		this.socket = socket;
		out = socket.getOutputStream();
		in = socket.getInputStream();
		
		id = nextId++;
		writer = new TCPWriterThread();
		reader = new TCPReaderThread();
		output = new Vector<>();
		input = new Vector<>();
		writer.start();
		reader.start();
	}
	
	public InetAddress getAddress()
	{
		return socket.getInetAddress();
	}
	
	public int countPackets()
	{
		return input.size();
	}
	
	public synchronized void sendPacket(Packet packet)
	{
		if (!closing) output.add(packet);
	}
	
	public synchronized Packet receivePacket()
	{
		if (input.size() == 0) return null;
		return input.remove(0);
	}
	
	public synchronized void disconnect(String reason)
	{
		sendPacket(new PacketDisconnect(reason));
		close();
	}
	
	public void close()
	{
		if (!closing)
		{
			closing = true;
			writer.interrupt();
			reader.interrupt();
			
			new Thread("TCP shutdown")
			{
				public void run()
				{
					try
					{
						long time = System.currentTimeMillis();
						writer.join(2000);
						time = System.currentTimeMillis() - time;
						if (time < 2000) reader.join(2000 - time);
					}
					catch (InterruptedException e)
					{
					}
					
					try
					{
						socket.close();
					}
					catch (IOException e)
					{
					}
					finished = true;
				}
			}.start();
		}
	}
	
	public boolean isClosing()
	{
		return closing;
	}
	
	public boolean isFinished()
	{
		return finished;
	}
	
	private class TCPWriterThread extends Thread
	{
		private TCPWriterThread()
		{
			super("TCP writer " + id);
		}
		
		public void run()
		{
			try
			{
				while (!closing || !output.isEmpty())
				{
					while (!output.isEmpty())
					{
						Packet.writePacket(out, output.remove(0));
					}
					
					try
					{
						Thread.sleep(5);
					}
					catch (InterruptedException e)
					{
					}
				}
			}
			catch (Throwable t)
			{
				if (!closing)
				{
					if (t instanceof Exception) t.printStackTrace();
				}
				if (!(t instanceof Exception))
				{
					t.printStackTrace();
					System.exit(1);
				}
				close();
			}
		}
	}
	
	private class TCPReaderThread extends Thread
	{
		private TCPReaderThread()
		{
			super("TCP reader " + id);
			setDaemon(true);
		}
		
		public void run()
		{
			try
			{
				while (!closing)
				{
					Packet packet = Packet.readPacket(in);
					if (packet != null) input.add(packet);
					else close();
				}
			}
			catch (Throwable t)
			{
				if (!closing)
				{
					if (t instanceof Exception) t.printStackTrace();
				}
				if (!(t instanceof Exception))
				{
					t.printStackTrace();
					System.exit(1);
				}
				close();
			}
		}
	}
}
