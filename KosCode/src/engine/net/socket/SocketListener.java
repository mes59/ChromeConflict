package engine.net.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Vector;

public class SocketListener extends Thread
{
	private volatile boolean closed;
	private ServerSocket server;
	
	private final int limit;
	private Vector<Socket> clients;
	
	public SocketListener(ServerSocket server, int limit)
	{
		this.server = server;
		this.limit = limit;
		clients = new Vector<>(limit);
	}
	
	public void run()
	{
		try
		{
			Socket socket;
			while (!server.isClosed())
			{
				try
				{
					socket = server.accept();
					synchronized (clients)
					{
						if (clients.size() < limit)
						{
							clients.add(socket);
						}
					}
				}
				catch (SocketTimeoutException e)
				{
				}
				
				try
				{
					Thread.sleep(10);
				}
				catch (InterruptedException e)
				{
					server.close();
				}
			}
		}
		catch (Throwable t)
		{
			if (!closed)
			{
				t.printStackTrace();
				close();
			}
		}
	}
	
	public boolean hasMore()
	{
		if (closed) return false;
		return !clients.isEmpty();
	}
	
	public Socket getNext()
	{
		if (closed) return null;
		synchronized (clients)
		{
			if (clients.isEmpty()) return null;
			else return clients.remove(0);
		}
	}
	
	public synchronized void close()
	{
		try
		{
			closed = true;
			server.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		synchronized (clients)
		{
			for (Socket client : clients)
			{
				if (client == null) break;
				try
				{
					client.close();
				}
				catch (IOException e)
				{
				}
			}
			clients.clear();
		}
	}
	
	public int getLocalPort()
	{
		return server.getLocalPort();
	}
	
	public boolean isClosed()
	{
		return server.isClosed();
	}
}
