package net.packet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PacketMapChecksum extends Packet
{
	public String name;
	public byte[] checksum;
	
	PacketMapChecksum()
	{
	}
	
	public PacketMapChecksum(String name, byte[] checksum)
	{
		this.name = name;
		this.checksum = checksum;
	}
	
	void writeData(OutputStream out) throws IOException
	{
		utils.writeString(out, name, 1);
		utils.writeByteArray(out, checksum, 1);
	}
	
	void readData(InputStream in) throws IOException
	{
		name = utils.readString(in, 1);
		checksum = utils.readByteArray(in, 1);
	}
}
