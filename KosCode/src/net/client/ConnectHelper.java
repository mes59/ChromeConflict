package net.client;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.Arrays;

import main.ChromeConflict;
import net.TCPConnection;
import net.packet.Packet;
import net.packet.PacketConnect;
import net.packet.PacketDisconnect;
import net.packet.PacketLogin;
import net.packet.PacketMapChecksum;
import net.packet.PacketMapData;
import net.packet.PacketSpawnEntity;
import world.Entity;
import world.EntityPlayer;
import world.EntityRegistry;
import world.WorldClient;
import world.WorldIO;
import engine.app.gui.GuiMain;
import engine.util.Utils;
import gui.GuiMainMenu;
import gui.GuiMessage;

public class ConnectHelper
{
	protected String host;
	protected int port;
	
	private TCPConnection conn;
	private byte[] checksum;
	private File tempMap;
	private RandomAccessFile map;
	private volatile boolean abort;
	private boolean finished, mapDone;
	
	public ConnectHelper(String host, int port)
	{
		this.host = host;
		this.port = port;
	}
	
	public boolean initialConnect()
	{
		try
		{
			System.out.println("connecting to " + host + ":" + port);
			Socket socket = new Socket(host, port);
			if (!abort)
			{
				if (socket.isConnected())
				{
					conn = new TCPConnection(socket);
					conn.sendPacket(new PacketConnect());
					conn.sendPacket(new PacketLogin(ChromeConflict.inst.config.getString("username"), ChromeConflict.inst.sent));
					return true;
				}
				else
				{
					System.err.println("could not connect to server");
					socket.close();
				}
			}
			else
			{
				System.out.println("connection aborted");
				socket.close();
			}
		}
		catch (IOException e)
		{
			if (!abort) e.printStackTrace();
		}
		return false;
	}
	
	public CCClient doFinal()
	{
		if (!abort && !finished && conn != null)
		{
			while (!conn.isClosing())
			{
				if (abort)
				{
					conn.disconnect("abort");
					return null;
				}
				
				Packet p = conn.receivePacket();
				if (p == null)
				{
					try
					{
						Thread.sleep(100);
					}
					catch (InterruptedException e)
					{
						return null;
					}
					continue;
				}
				
				if (p instanceof PacketMapChecksum)
				{
					if (mapDone)
					{
						conn.disconnect("double map data");
						System.err.println("server wanted checksum after map completion");
						return null;
					}
					
					PacketMapChecksum pc = (PacketMapChecksum) p;
					if (checksum != null)
					{
						if (Arrays.equals(checksum, pc.checksum)) mapDone = true;
						else
						{
							conn.disconnect("bad checksum (changed)");
							System.err.println("server changed world's checksum");
							GuiMain.queue(new GuiMessage("Map changed while connecting", "Main Menu", new GuiMainMenu()));
							return null;
						}
					}
					else
					{
						try
						{
							tempMap = new File(ChromeConflict.inst.getDataDir(), "maps/" + pc.name + ".iwm");
							if (!tempMap.exists())
							{
								tempMap = new File(ChromeConflict.inst.getResDir(), "maps/" + pc.name + ".iwm");
								if (tempMap.exists()) System.out.println("found map " + pc.name + " as resource");
							}
							else System.out.println("found map " + pc.name + " already downloaded");
							if (!tempMap.exists()) checksum = new byte[0];
							else checksum = Utils.digestFile("MD5", tempMap, 2048);
							pc.checksum = checksum;
							conn.sendPacket(pc);
						}
						catch (Exception e)
						{
							conn.disconnect("internal error");
							e.printStackTrace();
							return null;
						}
					}
				}
				else if (p instanceof PacketMapData)
				{
					if (mapDone)
					{
						conn.disconnect("double map data");
						System.err.println("server sent map data after map completion");
						return null;
					}
					
					PacketMapData data = (PacketMapData) p;
					if (data.name == null)
					{
						conn.disconnect("bad map data");
						System.err.println("server sent a bad map data packet");
						return null;
					}
					if (map == null)
					{
						File maps = new File(ChromeConflict.inst.getDataDir(), "maps");
						if (!maps.exists())
						{
							if (!maps.mkdirs())
							{
								conn.disconnect("internal error");
								System.err.println("failed to create map dir: " + maps);
								return null;
							}
						}
						
						try
						{
							tempMap = new File(maps, data.name + ".iwm");
							map = new RandomAccessFile(tempMap, "rw");
						}
						catch (Exception e)
						{
							conn.disconnect("internal error");
							e.printStackTrace();
							return null;
						}
					}
					
					if (data.chunk == null)
					{
						try
						{
							map.close();
							map = null;
							mapDone = true;
						}
						catch (IOException e)
						{
							conn.disconnect("internal error");
							e.printStackTrace();
							return null;
						}
					}
					else
					{
						try
						{
							map.write(data.chunk);
						}
						catch (IOException e)
						{
							conn.disconnect("internal error");
							e.printStackTrace();
							GuiMain.queue(new GuiMessage("Internal Error", "Main Menu", new GuiMainMenu()));
							return null;
						}
					}
				}
				else if (p instanceof PacketSpawnEntity)
				{
					if (!mapDone)
					{
						conn.disconnect("no map received");
						System.err.println("server did not send map before spawn");
						return null;
					}
					
					try
					{
						Entity player = EntityRegistry.createEntity((PacketSpawnEntity) p);
						if (player instanceof EntityPlayer)
						{
							WorldClient world = (WorldClient) WorldIO.read(tempMap, true);
							CCClient client = new CCClient(conn, world, (EntityPlayer) player);
							world.setClient(client);
							return client;
						}
						else
						{
							conn.disconnect("bad player entity");
							System.err.println("bad player entity: " + player.getClass().getName());
							return null;
						}
					}
					catch (IOException e)
					{
						conn.disconnect("internal error");
						e.printStackTrace();
						return null;
					}
				}
				else if (p instanceof PacketDisconnect)
				{
					PacketDisconnect disc = (PacketDisconnect) p;
					System.out.println("server disconnected: " + disc.reason);
					conn.close();
				}
			}
			
			if (conn.isClosing())
			{
				System.out.println("connection closed");
			}
		}
		return null;
	}
	
	public boolean isAborted()
	{
		return abort;
	}
}
