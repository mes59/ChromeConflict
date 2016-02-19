package net.server;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.Vector;

import net.TCPConnection;
import net.packet.*;
import sentinel.Sentinel;
import sentinel.weapon.Weapon;
import world.Entity;
import world.EntityPlayer;
import world.EntitySentinel;
import world.WorldServer;

public class CCManager
{
	public static int LOGIN_TIMEOUT = 1000;
	public static int STD_TIMEOUT = 10000;
	
	private final CCServer server;
	private final TCPConnection conn;
	private boolean pver;
	private int pingtime;
	private long timeout;
	private String name;
	
	private int transfer;
	private RandomAccessFile map;
	private String mapName;
	private byte[] mapBuffer;
	
	private Vector<Entity> sent;
	private WorldServer world;
	private EntityPlayer player;
	private Sentinel sentinel;
	private boolean left, right;
	private boolean down, up;
	
	private int queuedWep;
	private double queueAng;
	private int cooldown;
	
	public CCManager(CCServer server, Socket socket) throws IOException
	{
		this.server = server;
		conn = new TCPConnection(socket);
		timeout = System.currentTimeMillis();
		queuedWep = -1;
	}
	
	public void sendPacket(Packet packet)
	{
		conn.sendPacket(packet);
	}
	
	public void kick(String reason)
	{
		conn.disconnect(reason);
		if (world != null && player != null)
		{
			world.destroy(player);
		}
	}
	
	public void update(int delta, int max)
	{
		if (conn.isClosing())
		{
			if (map != null)
			{
				try
				{
					map.close();
					map = null;
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		if (map != null)
		{
			transfer += delta;
			while (transfer >= 50)
			{
				try
				{
					transfer -= 50;
					int read = map.read(mapBuffer);
					conn.sendPacket(new PacketMapData(mapName, Arrays.copyOfRange(mapBuffer, 0, read)));
					if (map.getFilePointer() == map.length())
					{
						conn.sendPacket(new PacketMapData(mapName, null));
						map.close();
						map = null;
						mapName = null;
						mapBuffer = null;
						
						player = new EntityPlayer(world.nextEntityId(), sentinel, name);
						world.spawn(player);
						conn.sendPacket(new PacketSpawnEntity(player));
						sent.add(player);
						break;
					}
				}
				catch (IOException e)
				{
					e.printStackTrace();
					kick("internal error");
					return;
				}
			}
		}
		else if (player != null)
		{
			if (player.hull <= 0)
			{
				String epitaph = player.lastHit.getDMGSrc().getEpitaph();
				if (player.attacker != null)
				{
					if (player.attacker instanceof EntityPlayer)
					{
						String attacker = ((EntityPlayer) player.attacker).name;
						System.out.println(String.format(epitaph, name, attacker));
					}
					else System.err.println("bad attacker for " + name + " (" + player.attacker + ")");
					player.attacker = null;
				}
				else System.err.println("bad attacker for " + name + " (null)");
				
				Sentinel sent = player.getSentinel();
				player.hull = sent.chassis.hull;
				player.shield = sent.chassis.shield;
				player.energy = sent.chassis.energy;
				cooldown = 0;
				queuedWep = -1;
				world.spawn(player);
			}
			
			for (Entity ent : world.getEntityList())
			{
				if (!sent.contains(ent))
				{
					conn.sendPacket(new PacketSpawnEntity(ent));
					sent.add(ent);
				}
			}
			
			for (int i = 0; i < sent.size(); i++)
			{
				Entity ent = sent.get(i);
				if (!world.getEntityList().contains(ent))
				{
					sent.remove(i--);
					conn.sendPacket(new PacketRemoveEntity(ent.entityId));
				}
				else
				{
					conn.sendPacket(new PacketPosition(ent));
					if (ent instanceof EntitySentinel)
					{
						conn.sendPacket(new PacketSentinelState((EntitySentinel) ent));
					}
				}
			}
		}
		
		if (cooldown > 0)
		{
			cooldown -= delta;
			if (cooldown <= 0)
			{
				cooldown = 0;
				if (queuedWep != -1)
				{
					weaponFired(queuedWep, queueAng);
					queuedWep = -1;
				}
			}
		}
		
		int i;
		for (i = 0; i < max; i++)
		{
			Packet p = conn.receivePacket();
			if (p == null) break;
			if (p instanceof PacketKeepAlive) continue;
			
			if (p instanceof PacketConnect)
			{
				if (pver)
				{
					System.out.println(conn.getAddress() + " uses a bad protocol");
					conn.close();
					return;
				}
				PacketConnect pc = (PacketConnect) p;
				if (pc.protocol != Packet.PROTOCOL)
				{
					System.out.println(conn.getAddress() + " is version " + pc.protocol + " / " + Packet.PROTOCOL);
					kick("version: " + Packet.PROTOCOL);
					return;
				}
				pver = true;
				continue;
			}
			else if (!pver)
			{
				System.out.println(conn.getAddress() + " uses a bad protocol");
				conn.close();
				return;
			}
			
			if (p instanceof PacketLogin)
			{
				if (name != null)
				{
					kick("double login");
					System.out.println(name + " logged in twice");
					return;
				}
				PacketLogin login = (PacketLogin) p;
				name = login.name;
				if (server.isNameUsed(name))
				{
					System.out.println(conn.getAddress() + " logged in as " + login.name + " (already exists)");
					kick("name already taken");
					return;
				}
				sentinel = Sentinel.readDTable(login.sent);
				mapName = server.getWorldName();
				conn.sendPacket(new PacketMapChecksum(mapName, server.getWorldChecksum()));
				continue;
			}
			else if (name == null)
			{
				kick("not logged in");
				return;
			}
			
			if (p instanceof PacketDisconnect)
			{
				if (map != null)
				{
					try
					{
						map.close();
						map = null;
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				if (name == null) System.out.println(conn.getAddress() + " disconnected (" + ((PacketDisconnect) p).reason + ")");
				else System.out.println(name + " disconnected (" + ((PacketDisconnect) p).reason + ")");
				conn.close();
				return;
			}
			else if (p instanceof PacketMapChecksum)
			{
				PacketMapChecksum pc = (PacketMapChecksum) p;
				if (Arrays.equals(pc.checksum, server.getWorldChecksum()))
				{
					conn.sendPacket(pc);
					world = server.getWorld();
					sent = new Vector<>();
					player = new EntityPlayer(world.nextEntityId(), sentinel, name);
					world.spawn(player);
					conn.sendPacket(new PacketSpawnEntity(player));
					sent.add(player);
				}
				else
				{
					try
					{
						world = server.getWorld();
						sent = new Vector<>();
						map = new RandomAccessFile(server.getWorldFile(), "r");
						mapBuffer = new byte[64 * 1024];
					}
					catch (IOException e)
					{
						e.printStackTrace();
						kick("internal error");
						return;
					}
				}
			}
			else if (p instanceof PacketClientAction)
			{
				PacketClientAction action = (PacketClientAction) p;
				switch (action.action)
				{
					case PacketClientAction.STOP_MOVING:
						player.walkDir = 0;
						break;
					case PacketClientAction.WALK_LEFT:
						player.walkDir = -1;
						break;
					case PacketClientAction.WALK_RIGHT:
						player.walkDir = 1;
						break;
					case PacketClientAction.JUMP_FLY:
					{
						if (player.ground)
						{
							player.vel.add(200 * Math.cos(action.angle), 200 * Math.sin(action.angle));
						}
						break;
					}
					case PacketClientAction.ACC_LEFT:
					{
						left = true;
						break;
					}
					case PacketClientAction.ACC_RIGHT:
					{
						right = true;
						break;
					}
					case PacketClientAction.ACC_DOWN:
					{
						down = true;
						break;
					}
					case PacketClientAction.ACC_UP:
					{
						up = true;
						break;
					}
					case PacketClientAction.STOP_LEFT:
					{
						left = false;
						break;
					}
					case PacketClientAction.STOP_RIGHT:
					{
						right = false;
						break;
					}
					case PacketClientAction.STOP_DOWN:
					{
						down = false;
						break;
					}
					case PacketClientAction.STOP_UP:
					{
						up = false;
						break;
					}
					default:
					{
						kick("bad packet");
						System.out.println(name + " sent packet " + p.getClass().getName());
						System.out.println("  action: " + action.action + ", ang: " + action.angle);
						return;
					}
				}
			}
			else if (p instanceof PacketFireWeapon)
			{
				PacketFireWeapon fire = (PacketFireWeapon) p;
				if (cooldown == 0) weaponFired(fire.index, fire.angle);
				else if (cooldown <= 100)
				{
					queuedWep = fire.index;
					queueAng = fire.angle;
				}
			}
			else
			{
				kick("bad packet");
				System.out.println(name + " sent packet " + p.getClass().getName());
				return;
			}
		}
		
		if (name != null)
		{
			pingtime += delta;
			if (pingtime > STD_TIMEOUT / 2)
			{
				pingtime -= STD_TIMEOUT / 2;
				conn.sendPacket(new PacketKeepAlive());
			}
		}
		if (player != null)
		{
			int x = (left ? -1 : 0) + (right ? 1 : 0);
			int y = (down ? 1 : 0) + (up ? -1 : 0);
			if (x != 0)
			{
				double fx = player.vel.x() / 200 * Math.signum(x);
				if (fx < 1)
				{
					if (fx < -1) x *= 2;
					player.vel.add(x * delta / 2d, 0);
				}
			}
			if (y != 0)
			{
				double fy = player.vel.y() / 200 * Math.signum(y);
				if (fy < 1)
				{
					if (fy < -1) y *= 2;
					player.vel.add(0, y * delta / 2d);
				}
			}
		}
		
		if (i != 0)
		{
			timeout = System.currentTimeMillis();
		}
		else
		{
			if (name == null)
			{
				if (System.currentTimeMillis() - timeout > LOGIN_TIMEOUT)
				{
					kick("bad connection");
					System.out.println(conn.getAddress() + " timed out (login)");
				}
			}
			else
			{
				if (System.currentTimeMillis() - timeout > STD_TIMEOUT)
				{
					kick("connection lost");
					System.out.println(conn.getAddress() + " (" + name + ") timed out");
				}
			}
		}
	}
	
	private void weaponFired(int index, double ang)
	{
		Weapon w = player.getWeapon(index);
		int count = player.getTypeCount(index);
		int max = (int) (player.energy / w.getEnergyCost());
		if (count > max)
		{
			if (max == 0) return;
			count = max;
		}
		
		for (int x = index; x < index + count; x++)
		{
			switch (x % 8)
			{
				case 0:
					w.onFired(world, player, 5, 0, ang);
					break;
				case 1:
					w.onFired(world, player, 3, 4, ang);
					break;
				case 2:
					w.onFired(world, player, 0, 5, ang);
					break;
				case 3:
					w.onFired(world, player, -4, 3, ang);
					break;
				case 4:
					w.onFired(world, player, -5, 0, ang);
					break;
				case 5:
					w.onFired(world, player, -3, -4, ang);
					break;
				case 6:
					w.onFired(world, player, 0, -5, ang);
					break;
				case 7:
					w.onFired(world, player, 4, -3, ang);
					break;
			}
		}
		cooldown += w.getFireDelay();
	}
	
	public InetAddress getAddress()
	{
		return conn.getAddress();
	}
	
	public String getUsername()
	{
		return name;
	}
	
	public EntityPlayer getPlayer()
	{
		return player;
	}
	
	public boolean isReady()
	{
		return name != null && !conn.isClosing();
	}
	
	public boolean isClosing()
	{
		return conn.isClosing();
	}
}
