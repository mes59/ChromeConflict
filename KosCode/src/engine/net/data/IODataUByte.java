package engine.net.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class IODataUByte extends IOData
{
	public int value;
	
	IODataUByte()
	{
	}
	
	public IODataUByte(int value)
	{
		this.value = value & 0xFF;
	}
	
	protected void writeData(OutputStream out, List<Class<? extends IOData>> classes) throws IOException
	{
		utils.writeByte(out, value);
	}
	
	protected void readData(InputStream in, List<Class<? extends IOData>> classes) throws IOException
	{
		value = utils.readUByte(in);
	}
	
	public String toString()
	{
		return Integer.toString(value);
	}
}
