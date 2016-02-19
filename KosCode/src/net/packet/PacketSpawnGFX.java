package net.packet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import engine.net.data.IOData;
import engine.net.data.IODataTable;

public class PacketSpawnGFX extends Packet
{
	public float posx;
	public float posy;
	public float velx;
	public float vely;
	public IODataTable data;
	
	PacketSpawnGFX()
	{
	}
	
	public PacketSpawnGFX(double posx, double posy, double velx, double vely, IODataTable data)
	{
		this.posx = (float) posx;
		this.posy = (float) posy;
		this.velx = (float) velx;
		this.vely = (float) vely;
		this.data = data;
	}
	
	void writeData(OutputStream out) throws IOException
	{
		utils.writeFloat(out, posx);
		utils.writeFloat(out, posy);
		utils.writeFloat(out, velx);
		utils.writeFloat(out, vely);
		IOData.write(out, data, false);
	}
	
	void readData(InputStream in) throws IOException
	{
		posx = utils.readFloat(in);
		posy = utils.readFloat(in);
		velx = utils.readFloat(in);
		vely = utils.readFloat(in);
		data = IOData.readSpecific(in, IODataTable.class, false);
	}
}
