package net.packet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PacketRemoveEntity extends Packet
{
	public int entityId;
	
	PacketRemoveEntity()
	{
	}
	
	public PacketRemoveEntity(int entityId)
	{
		this.entityId = entityId;
	}
	
	void writeData(OutputStream out) throws IOException
	{
		utils.writeInt(out, entityId);
	}
	
	void readData(InputStream in) throws IOException
	{
		entityId = utils.readInt(in);
	}
}
