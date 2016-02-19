package net.packet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PacketClientAction extends Packet
{
	public static final int STOP_MOVING = 0;
	public static final int WALK_LEFT = 1;
	public static final int WALK_RIGHT = 2;
	public static final int JUMP_FLY = 3;
	
	public static final int ACC_LEFT = 4;
	public static final int ACC_RIGHT = 5;
	public static final int ACC_DOWN = 6;
	public static final int ACC_UP = 7;
	public static final int STOP_LEFT = 8;
	public static final int STOP_RIGHT = 9;
	public static final int STOP_DOWN = 10;
	public static final int STOP_UP = 11;
	
	public int action;
	public float angle;
	
	PacketClientAction()
	{
	}
	
	public PacketClientAction(int action)
	{
		this.action = action;
	}
	
	public PacketClientAction(int action, double ang)
	{
		this.action = action;
		angle = (float) ang;
	}
	
	void writeData(OutputStream out) throws IOException
	{
		utils.writeByte(out, action);
		if (action == JUMP_FLY) utils.writeFloat(out, angle);
	}
	
	void readData(InputStream in) throws IOException
	{
		action = utils.readUByte(in);
		if (action == JUMP_FLY) angle = utils.readFloat(in);
	}
}
