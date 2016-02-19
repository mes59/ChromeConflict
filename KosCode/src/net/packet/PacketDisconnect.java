package net.packet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PacketDisconnect extends Packet
{
	public String reason;
	
	PacketDisconnect()
	{
	}
	
	public PacketDisconnect(String reason)
	{
		this.reason = reason;
	}
	
	void writeData(OutputStream out) throws IOException
	{
		utils.writeString(out, reason, 2);
	}
	
	void readData(InputStream in) throws IOException
	{
		reason = utils.readString(in, 2);
	}
}
