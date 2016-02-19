package net.packet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PacketFireWeapon extends Packet
{
	public int index;
	public double angle;
	
	PacketFireWeapon()
	{
	}
	
	public PacketFireWeapon(int index, double angle)
	{
		this.index = index & 0xFF;
		this.angle = angle;
	}
	
	void writeData(OutputStream out) throws IOException
	{
		utils.writeByte(out, index);
		utils.writeDouble(out, angle);
	}
	
	void readData(InputStream in) throws IOException
	{
		index = utils.readUByte(in);
		angle = utils.readDouble(in);
	}
}
