package net.server;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.TCPConnection;
import net.packet.Packet;
import world.EntityPlayer;
import world.WorldIO;
import world.WorldServer;
import engine.net.socket.SocketListener;
import engine.util.Utils;

public class CCServer
{
	private SocketListener listener;
	private Vector<CCManager> inbound;
	private Vector<CCManager> clients;
	private List<CCManager> view;
	private File worldFile;
	private byte[] checksum;
	private String worldName;
	private WorldServer world;
	
	public CCServer(File world, int port) throws IOException
	{
		worldFile = world;
		try
		{
			checksum = Utils.digestFile("MD5", worldFile, 2048);
		}
		catch (Exception e)
		{
			throw new IOException("md5 failed", e);
		}
		
		this.world = (WorldServer) WorldIO.read(world, false);
		this.world.setServer(this);
		ServerSocket server = new ServerSocket(port);
		listener = new SocketListener(server, 8);
		listener.start();
		inbound = new Vector<>();
		clients = new Vector<>();
		view = Collections.unmodifiableList(clients);
	}
	
	public int getLocalPort()
	{
		return listener.getLocalPort();
	}
	
	byte[] getWorldChecksum()
	{
		return checksum;
	}
	
	File getWorldFile()
	{
		return worldFile;
	}
	
	public String getWorldName()
	{
		if (worldName == null)
		{
			worldName = worldFile.getName();
			int idx = worldName.lastIndexOf('.');
			if (idx != -1) worldName = worldName.substring(0, idx);
		}
		return worldName;
	}
	
	public WorldServer getWorld()
	{
		return world;
	}
	
	public List<CCManager> getClients()
	{
		return view;
	}
	
	public CCManager getByName(String name, boolean full)
	{
		if (name == null) return null;
		synchronized (clients)
		{
			for (CCManager client : clients)
			{
				if (full)
				{
					if (client.getUsername().equals(name)) return client;
				}
				else
				{
					if (client.getUsername().contains(name)) return client;
				}
			}
		}
		return null;
	}
	
	public boolean isNameUsed(String name)
	{
		if (name == null) throw new NullPointerException();
		synchronized (clients)
		{
			for (CCManager client : clients)
			{
				if (client.getUsername().equals(name)) return true;
			}
		}
		return false;
	}
	
	public void getByName(List<CCManager> list, Pattern name, boolean full)
	{
		if (list == null || name == null) throw new NullPointerException();
		Matcher m = null;
		synchronized (clients)
		{
			for (CCManager client : clients)
			{
				if (m == null) m = name.matcher(client.getUsername());
				else m.reset(client.getUsername());
				if (full)
				{
					if (m.matches()) list.add(client);
				}
				else
				{
					if (m.find()) list.add(client);
				}
			}
		}
	}
	
	public void broadcast(Packet packet, EntityPlayer exception)
	{
		synchronized (clients)
		{
			for (CCManager client : clients)
			{
				if (client.getPlayer() != exception)
				{
					client.sendPacket(packet);
				}
			}
		}
	}
	
	public void update(int delta)
	{
		if (listener.isClosed()) return;
		while (listener.hasMore())
		{
			Socket s = listener.getNext();
			try
			{
				System.out.println("connection from " + s.getInetAddress());
				if (clients.size() >= 8)
				{
					new TCPConnection(s).disconnect("server full");
					System.err.println("server already full!");
				}
				else
				{
					while (inbound.size() >= 16)
					{
						inbound.remove(0).kick("login timeout");
					}
					inbound.add(new CCManager(this, s));
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
				try
				{
					s.close();
				}
				catch (IOException ex)
				{
					ex.printStackTrace();
				}
			}
		}
		
		synchronized (clients)
		{
			for (int i = 0; i < inbound.size(); i++)
			{
				CCManager client = inbound.get(i);
				try
				{
					client.update(0, 5);
					if (client.isClosing())
					{
						inbound.remove(i--);
						System.out.println("dropping connection to " + client.getAddress());
					}
					if (client.isReady())
					{
						clients.add(inbound.remove(i--));
						System.out.println(client.getAddress() + " logged in as " + client.getUsername());
					}
				}
				catch (Exception e)
				{
					e.printStackTrace();
					client.kick("internal error");
					inbound.remove(i--);
				}
			}
			
			for (int i = 0; i < clients.size(); i++)
			{
				CCManager client = clients.get(i);
				try
				{
					client.update(delta, delta);
					if (client.isClosing())
					{
						clients.remove(i--);
						world.destroy(client.getPlayer());
						System.out.println("dropping client " + client.getUsername());
					}
				}
				catch (Exception e)
				{
					e.printStackTrace();
					client.kick("internal error");
					clients.remove(i--);
				}
			}
		}
		
		try
		{
			world.update(delta);
		}
		catch (Throwable t)
		{
			close("internal error");
			if (t instanceof Exception)
			{
				t.printStackTrace();
			}
			else throw t;
		}
	}
	
	public void runServerCmd(String cmd, List<String> args)
	{
		if (cmd == null || args == null) throw new NullPointerException();
		if (cmd.equals("help"))
		{
			System.out.println("available commands: kick, list");
			System.out.println("<example> is a required parameter and [example] is not");
			System.out.println("a parameter is normally separated using spaces");
			System.out.println("but you can also use \"abc def\" if you need spaces");
			System.out.println("    kick <pattern> [reason], kick a player from the server");
			System.out.println("    list (no args), lists all players connected to the server");
		}
		if (cmd.equals("kick"))
		{
			if (args.size() < 1) throw new IllegalArgumentException("not enough arguments");
			Pattern name = Pattern.compile(args.get(0));
			String reason = null;
			if (args.size() > 1) reason = args.get(1);
			if (reason == null) reason = "kicked by console";
			else reason = "kicked: " + reason;
			Matcher m = null;
			synchronized (clients)
			{
				for (CCManager client : clients)
				{
					if (m == null) m = name.matcher(client.getUsername());
					else m.reset(client.getUsername());
					if (m.find()) client.kick(reason);
				}
			}
		}
		else if (cmd.equals("list"))
		{
			synchronized (clients)
			{
				System.out.println("currently " + clients.size() + " players are connected");
				for (CCManager client : clients)
				{
					System.out.println("from " + client.getAddress() + " as " + client.getUsername());
				}
			}
		}
		else System.err.println("unknown command: " + cmd);
	}
	
	public boolean isClosing()
	{
		return listener.isClosed();
	}
	
	public boolean isFinished()
	{
		return listener.isClosed() && clients.size() == 0;
	}
	
	public void close(String reason)
	{
		listener.close();
		for (CCManager client : inbound)
		{
			client.kick(reason);
		}
		for (CCManager client : clients)
		{
			client.kick(reason);
		}
	}
}
