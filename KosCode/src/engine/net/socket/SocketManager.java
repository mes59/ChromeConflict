package engine.net.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketManager extends Thread
{
	private Socket socket;
	private Exception exception;
	
	private OutputStream out;
	private InputStream in;
	private SocketDataWriter writer;
	private SocketDataReader reader;
	
	public SocketManager(Socket base) throws IOException
	{
		if (base == null) throw new NullPointerException("socket cant be null");
		socket = base;
		out = socket.getOutputStream();
		in = socket.getInputStream();
	}
	
	public void setWriter(SocketDataWriter writer)
	{
		this.writer = writer;
	}
	
	public void setReader(SocketDataReader reader)
	{
		this.reader = reader;
	}
	
	public void run()
	{
		while (!socket.isClosed())
		{
			if (writer != null)
			{
				try
				{
					while (writer.hasData())
					{
						writer.write(out);
						if (writer.finished()) break;
					}
				}
				catch (IOException e)
				{
					exception = e;
					if (!socket.isClosed())
					{
						try
						{
							socket.close();
						}
						catch (IOException io)
						{
							io.printStackTrace();
						}
					}
					break;
				}
				
				if (writer.finished())
				{
					close();
					break;
				}
			}
			
			if (reader != null)
			{
				try
				{
					while (in.available() > 0)
					{
						reader.read(in);
						if (reader.finished()) break;
					}
				}
				catch (IOException e)
				{
					exception = e;
					if (!socket.isClosed())
					{
						try
						{
							socket.close();
						}
						catch (IOException io)
						{
							io.printStackTrace();
						}
					}
					break;
				}
				
				if (reader.finished())
				{
					close();
					break;
				}
			}
			
			try
			{
				Thread.sleep(5);
			}
			catch (InterruptedException e)
			{
				// we expect someone to interrupt us if we want to close the connection
				if (writer.finished() || reader.finished())
				{
					close();
					break;
				}
			}
		}
	}
	
	public Exception getException()
	{
		return exception;
	}
	
	public void close()
	{
		try
		{
			socket.close();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public boolean isClosed()
	{
		return socket.isClosed();
	}
}
