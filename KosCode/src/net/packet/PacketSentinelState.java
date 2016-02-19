package net.packet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import world.EntitySentinel;

public class PacketSentinelState extends Packet
{
	public int entityId;
	public float hull;
	public float shield;
	public float energy;
	public int eloss;
	
	PacketSentinelState()
	{
	}
	
	public PacketSentinelState(EntitySentinel entity)
	{
		entityId = entity.entityId;
		hull = entity.hull;
		shield = entity.shield;
		energy = entity.energy;
		eloss = entity.eloss;
	}
	
	void writeData(OutputStream out) throws IOException
	{
		utils.writeInt(out, entityId);
		utils.writeFloat(out, hull);
		utils.writeFloat(out, shield);
		utils.writeFloat(out, energy);
		utils.writeInt(out, eloss);
	}
	
	void readData(InputStream in) throws IOException
	{
		entityId = utils.readInt(in);
		hull = utils.readFloat(in);
		shield = utils.readFloat(in);
		energy = utils.readFloat(in);
		eloss = utils.readInt(in);
	}
}
