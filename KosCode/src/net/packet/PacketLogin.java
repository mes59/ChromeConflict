package net.packet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import sentinel.Sentinel;
import engine.net.data.IOData;
import engine.net.data.IODataTable;

public class PacketLogin extends Packet
{
	public String name;
	public IODataTable sent;
	
	PacketLogin()
	{
	}
	
	public PacketLogin(String name, Sentinel sent)
	{
		this.name = name;
		this.sent = sent.writeDTable();
	}
	
	void writeData(OutputStream out) throws IOException
	{
		utils.writeString(out, name, 1);
		IOData.write(out, sent, false);
	}
	
	void readData(InputStream in) throws IOException
	{
		name = utils.readString(in, 1);
		sent = IOData.readSpecific(in, IODataTable.class, false);
	}
}
