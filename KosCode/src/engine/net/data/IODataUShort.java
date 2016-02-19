package engine.net.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class IODataUShort extends IOData
{
	public int value;
	
	IODataUShort()
	{
	}
	
	public IODataUShort(int value)
	{
		this.value = value & 0xFFFF;
	}
	
	protected void writeData(OutputStream out, List<Class<? extends IOData>> classes) throws IOException
	{
		utils.writeShort(out, value);
	}
	
	protected void readData(InputStream in, List<Class<? extends IOData>> classes) throws IOException
	{
		value = utils.readUShort(in);
	}
	
	public String toString()
	{
		return Integer.toString(value);
	}
}
