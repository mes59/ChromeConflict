package net.packet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import world.Entity;

public class PacketPosition extends Packet
{
	public int entityId;
	public float posx;
	public float posy;
	public float velx;
	public float vely;
	
	PacketPosition()
	{
	}
	
	public PacketPosition(Entity entity)
	{
		entityId = entity.entityId;
		posx = (float) entity.bounds.pos.x();
		posy = (float) entity.bounds.pos.y();
		velx = (float) entity.vel.x();
		vely = (float) entity.vel.y();
	}
	
	void writeData(OutputStream out) throws IOException
	{
		utils.writeInt(out, entityId);
		utils.writeFloat(out, posx);
		utils.writeFloat(out, posy);
		utils.writeFloat(out, velx);
		utils.writeFloat(out, vely);
	}
	
	void readData(InputStream in) throws IOException
	{
		entityId = utils.readInt(in);
		posx = utils.readFloat(in);
		posy = utils.readFloat(in);
		velx = utils.readFloat(in);
		vely = utils.readFloat(in);
	}
}
