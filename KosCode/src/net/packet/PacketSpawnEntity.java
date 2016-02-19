package net.packet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import world.Entity;
import world.EntityRegistry;
import engine.net.data.IOData;
import engine.net.data.IODataTable;

public class PacketSpawnEntity extends Packet
{
	public int entityId;
	public int type;
	public IODataTable data;
	
	PacketSpawnEntity()
	{
	}
	
	public PacketSpawnEntity(Entity ent)
	{
		entityId = ent.entityId;
		type = EntityRegistry.getEID(ent);
		data = EntityRegistry.createDTable(ent);
	}
	
	void writeData(OutputStream out) throws IOException
	{
		utils.writeInt(out, entityId);
		utils.writeByte(out, type);
		IOData.write(out, data, false);
	}
	
	void readData(InputStream in) throws IOException
	{
		entityId = utils.readInt(in);
		type = utils.readUByte(in);
		data = IOData.readSpecific(in, IODataTable.class, false);
	}
}
