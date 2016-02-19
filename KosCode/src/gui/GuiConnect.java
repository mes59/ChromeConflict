package gui;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.Arrays;

import main.ChromeConflict;
import net.TCPConnection;
import net.client.CCClient;
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
import engine.app.gui.GuiButton;
import engine.app.gui.GuiComponent;
import engine.app.gui.GuiContainer;
import engine.app.gui.GuiLabel;
import engine.app.gui.GuiMain;
import engine.app.gui.GuiTextBox;
import engine.util.Utils;

public class GuiConnect extends GuiContainer
{
	protected String host;
	protected int port;
	private volatile boolean abort;
	
	private GuiButton back;
	private GuiTextBox input;
	private GuiButton connect;
	private GuiLabel status;
	
	private TCPConnection conn;
	private File tempMap;
	private byte[] checksum;
	private boolean mapDone;
	private RandomAccessFile map;
	private CCClient client;
	
	public GuiConnect()
	{
		super(null);
		add(back = GuiFactory.createCenteredButton(1, 564, 400, 1, "Main Menu"));
		add(input = GuiFactory.createTextBox(1, 564, 328, 1));
		add(connect = GuiFactory.createCenteredButton(1, 564, 280, 0, "Connect"));
		status = GuiFactory.createCenteredLabel(0, 564, 280, 0xFF0000, "Connecting...");
	}
	
	public void action(GuiComponent component)
	{
		super.action(component);
		if (component == back) GuiMain.queue(new GuiMainMenu());
		else if (component == connect || component == input)
		{
			remove(connect);
			host = input.getText();
			int idx = host.indexOf(':');
			if (idx != -1)
			{
				try
				{
					port = Integer.parseInt(host.substring(idx + 1));
				}
				catch (RuntimeException e)
				{
					e.printStackTrace();
					port = ChromeConflict.inst.config.getInt("port");
				}
				host = host.substring(0, idx);
			}
			else port = ChromeConflict.inst.config.getInt("port");
			input.setState(0);
			add(status);
			connect();
		}
	}
	
	public void update(int delta)
	{
		super.update(delta);
		if (input.getBuffer().length() > 0)
		{
			if (connect.getState() == 0) connect.setState(1);
		}
		else if (connect.getState() > 0) connect.setState(0);
		
		if (conn != null)
		{
			while (true)
			{
				if (abort)
				{
					conn.disconnect("abort");
					return;
				}
				
				Packet p = conn.receivePacket();
				if (p == null) break;
				
				if (p instanceof PacketMapChecksum)
				{
					if (mapDone)
					{
						conn.disconnect("double map data");
						System.err.println("server wanted checksum after map completion");
						GuiMain.queue(new GuiMessage("Server is forgetful", "Main Menu", new GuiMainMenu()));
						return;
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
							return;
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
							GuiMain.queue(new GuiMessage("Interal Error", "Main Menu", new GuiMainMenu()));
							return;
						}
					}
				}
				else if (p instanceof PacketMapData)
				{
					if (mapDone)
					{
						conn.disconnect("double map data");
						System.err.println("server sent map data after map completion");
						GuiMain.queue(new GuiMessage("Server sent map twice", "Main Menu", new GuiMainMenu()));
						return;
					}
					
					PacketMapData data = (PacketMapData) p;
					if (data.name == null)
					{
						conn.disconnect("bad map data");
						System.err.println("server sent a bad map data packet");
						GuiMain.queue(new GuiMessage("Server sent invalid data", "Main Menu", new GuiMainMenu()));
						return;
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
								GuiMain.queue(new GuiMessage("Interal Error", "Main Menu", new GuiMainMenu()));
								return;
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
							GuiMain.queue(new GuiMessage("Internal Error", "Main Menu", new GuiMainMenu()));
							return;
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
							GuiMain.queue(new GuiMessage("Internal Error", "Main Menu", new GuiMainMenu()));
							return;
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
							return;
						}
					}
				}
				else if (p instanceof PacketSpawnEntity)
				{
					if (!mapDone)
					{
						conn.disconnect("no map received");
						System.err.println("server did not send map before spawn");
						GuiMain.queue(new GuiMessage("Server sent invalid data", "Main Menu", new GuiMainMenu()));
						return;
					}
					
					try
					{
						Entity player = EntityRegistry.createEntity((PacketSpawnEntity) p);
						if (player instanceof EntityPlayer)
						{
							WorldClient world = (WorldClient) WorldIO.read(tempMap, true);
							world.setClient(client = new CCClient(conn, world, (EntityPlayer) player));
							GuiMain.queue(new GuiMultiplayer(client, (EntityPlayer) player));
							return;
						}
						else
						{
							conn.disconnect("bad player entity");
							System.err.println("bad player entity: " + player.getClass().getName());
							GuiMain.queue(new GuiMessage("Spawing Failed", "Main Menu", new GuiMainMenu()));
						}
					}
					catch (IOException e)
					{
						conn.disconnect("internal error");
						e.printStackTrace();
						GuiMain.queue(new GuiMessage("Internal Error", "Main Menu", new GuiMainMenu()));
						return;
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
				GuiMain.queue(new GuiMessage("Connection closed", "Main Menu", new GuiMainMenu()));
			}
		}
	}
	
	public void connect()
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
					System.out.println("connection successful, logging in");
				}
				else
				{
					System.err.println("could not connect to server");
					GuiMain.queue(new GuiMessage("Failed to connect to server", "Main Menu", new GuiMainMenu()));
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
			if (!abort)
			{
				e.printStackTrace();
				GuiMain.queue(new GuiMessage("Failed to connect to server", "Main Menu", new GuiMainMenu()));
			}
		}
	}
	
	public void close()
	{
		abort = true;
	}
}
