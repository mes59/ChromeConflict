package net.packet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PacketMapData extends Packet
{
	public String name;
	public byte[] chunk;
	
	PacketMapData()
	{
	}
	
	public PacketMapData(String name, byte[] chunk)
	{
		this.name = name;
		this.chunk = chunk;
	}
	
	void writeData(OutputStream out) throws IOException
	{
		utils.writeString(out, name, 1);
		utils.writeByteArray(out, chunk, -1);
	}
	
	void readData(InputStream in) throws IOException
	{
		name = utils.readString(in, 1);
		chunk = utils.readByteArray(in, -1);
	}
}
