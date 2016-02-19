package net.packet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PacketConnect extends Packet
{
	public int protocol;
	
	public PacketConnect()
	{
		protocol = PROTOCOL;
	}
	
	void writeData(OutputStream out) throws IOException
	{
		utils.writeVarInt(out, protocol);
	}
	
	void readData(InputStream in) throws IOException
	{
		protocol = utils.readVarInt(in);
	}
}
