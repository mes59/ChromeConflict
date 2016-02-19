package net.client;

import java.io.IOException;

import net.TCPConnection;
import net.packet.Packet;
import net.packet.PacketDisconnect;
import net.packet.PacketKeepAlive;
import net.packet.PacketPosition;
import net.packet.PacketRemoveEntity;
import net.packet.PacketSentinelState;
import net.packet.PacketSpawnEntity;
import net.packet.PacketSpawnGFX;
import world.Entity;
import world.EntityPlayer;
import world.EntityRegistry;
import world.EntitySentinel;
import world.WorldClient;
import engine.app.gui.GuiMain;
import gui.GuiMainMenu;
import gui.GuiMessage;

public class CCClient
{
	public static int STD_TIMEOUT = 10000;
	
	protected TCPConnection conn;
	private WorldClient world;
	private EntityPlayer player;
	private int pingtime;
	private long timeout;
	
	public CCClient(TCPConnection conn, WorldClient world, EntityPlayer player) throws IOException
	{
		this.conn = conn;
		this.world = world;
		this.player = player;
		world.add(player);
		timeout = System.currentTimeMillis();
	}
	
	public void sendPacket(Packet packet)
	{
		conn.sendPacket(packet);
	}
	
	public WorldClient getWorld()
	{
		return world;
	}
	
	public EntityPlayer getPlayer()
	{
		return player;
	}
	
	public void update(int delta)
	{
		pingtime += delta;
		if (pingtime > STD_TIMEOUT / 2)
		{
			pingtime -= STD_TIMEOUT / 2;
			conn.sendPacket(new PacketKeepAlive());
		}
		
		int i;
		for (i = 0; i < delta; i++)
		{
			Packet p = conn.receivePacket();
			if (p == null) break;
			if (p instanceof PacketKeepAlive) continue;
			
			if (p instanceof PacketSpawnEntity)
			{
				PacketSpawnEntity spawn = (PacketSpawnEntity) p;
				Entity ent = world.getEntityFromId(spawn.entityId);
				if (ent != null)
				{
					disconnect("entity already exists");
					System.err.println("server respawned entity: " + ent.entityId);
					GuiMain.queue(new GuiMessage("Server protocol error", "Main Menu", new GuiMainMenu()));
				}
				else world.add(EntityRegistry.createEntity(spawn));
			}
			else if (p instanceof PacketPosition)
			{
				PacketPosition pos = (PacketPosition) p;
				synchronized (world)
				{
					Entity ent = world.getEntityFromId(pos.entityId);
					if (ent != null)
					{
						ent.bounds.pos.x(pos.posx);
						ent.bounds.pos.y(pos.posy);
						ent.vel.x(pos.velx);
						ent.vel.y(pos.vely);
					}
					else
					{
						disconnect("entity does not exist");
						System.err.println("server moved unknown entity: " + pos.entityId);
						GuiMain.queue(new GuiMessage("Server protocol error", "Main Menu", new GuiMainMenu()));
					}
				}
			}
			else if (p instanceof PacketSpawnGFX)
			{
				world.add(EntityRegistry.createGFX((PacketSpawnGFX) p));
			}
			else if (p instanceof PacketSentinelState)
			{
				PacketSentinelState state = (PacketSentinelState) p;
				Entity ent = world.getEntityFromId(state.entityId);
				if (ent instanceof EntitySentinel)
				{
					EntitySentinel sent = (EntitySentinel) ent;
					sent.hull = state.hull;
					sent.shield = state.shield;
					sent.energy = state.energy;
					sent.eloss = state.eloss;
				}
				else if (ent == null)
				{
					disconnect("entity does not exist");
					System.err.println("server updated unknown entity: " + state.entityId);
					GuiMain.queue(new GuiMessage("Server protocol error", "Main Menu", new GuiMainMenu()));
				}
				else
				{
					disconnect("entity not a sentinel");
					System.err.println("server updated entity: " + state.entityId);
					GuiMain.queue(new GuiMessage("Server protocol error", "Main Menu", new GuiMainMenu()));
				}
			}
			else if (p instanceof PacketRemoveEntity)
			{
				PacketRemoveEntity remove = (PacketRemoveEntity) p;
				Entity ent = world.getEntityFromId(remove.entityId);
				if (ent != null) world.destroy(ent);
				else
				{
					disconnect("entity does not exist");
					System.err.println("server removed unknown entity: " + remove.entityId);
					GuiMain.queue(new GuiMessage("Server protocol error", "Main Menu", new GuiMainMenu()));
				}
			}
			else if (p instanceof PacketDisconnect)
			{
				PacketDisconnect d = (PacketDisconnect) p;
				System.out.println("server disconnected: " + d.reason);
				GuiMain.queue(new GuiMessage("Disconnected: " + d.reason, "Main Menu", new GuiMainMenu()));
				conn.close();
				return;
			}
			else
			{
				conn.disconnect("bad packet");
				System.err.println("unexpected packet: " + p.getClass().getName());
				GuiMain.queue(new GuiMessage("Server protocol error", "Main Menu", new GuiMainMenu()));
			}
			
			if (conn.isClosing())
			{
				System.out.println("connection closed");
				return;
			}
		}
		
		if (i != 0)
		{
			timeout = System.currentTimeMillis();
		}
		else
		{
			if (System.currentTimeMillis() - timeout > STD_TIMEOUT)
			{
				disconnect("connection lost");
				System.err.println(conn.getAddress() + " (server) timed out");
			}
		}
	}
	
	public void disconnect(String reason)
	{
		conn.disconnect(reason);
	}
}
