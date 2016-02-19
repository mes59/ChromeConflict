package net.packet;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

import main.CCUtils;
import engine.util.IOUtils;

public abstract class Packet
{
	public static final int PROTOCOL = 1;
	public static final IOUtils utils = CCUtils.utils;
	
	private static final Vector<Class<? extends Packet>> classes;
	static
	{
		classes = new Vector<>();
		classes.add(PacketKeepAlive.class);
		classes.add(PacketConnect.class);
		classes.add(PacketLogin.class);
		classes.add(PacketMapChecksum.class);
		classes.add(PacketMapData.class);
		classes.add(PacketSpawnEntity.class);
		classes.add(PacketPosition.class);
		classes.add(PacketSpawnGFX.class);
		classes.add(PacketClientAction.class);
		classes.add(PacketFireWeapon.class);
		classes.add(PacketSentinelState.class);
		classes.add(PacketRemoveEntity.class);
		classes.add(PacketDisconnect.class);
	}
	
	Packet()
	{
	}
	
	public static void writePacket(OutputStream out, Packet packet) throws IOException
	{
		int id = classes.indexOf(packet.getClass());
		if (id == -1) throw new Error("unregistered packet " + packet.getClass().getName());
		utils.writeVarInt(out, id);
		packet.writeData(out);
	}
	
	abstract void writeData(OutputStream out) throws IOException;
	
	public static Packet readPacket(InputStream in) throws IOException
	{
		int id;
		try
		{
			id = utils.readVarInt(in);
		}
		catch (EOFException e)
		{
			return null;
		}
		if (id < 0 || id >= classes.size()) throw new IOException("bad id: " + id);
		
		try
		{
			Class<?> cls = classes.get(id);
			Packet p = (Packet) cls.newInstance();
			p.readData(in);
			return p;
		}
		catch (ReflectiveOperationException e)
		{
			throw new Error("failed to create instance", e);
		}
	}
	
	abstract void readData(InputStream in) throws IOException;
}
