package engine.net.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class IODataByte extends IOData
{
	public int value;
	
	IODataByte()
	{
	}
	
	public IODataByte(int value)
	{
		this.value = (byte) value;
	}
	
	protected void writeData(OutputStream out, List<Class<? extends IOData>> classes) throws IOException
	{
		utils.writeByte(out, value);
	}
	
	protected void readData(InputStream in, List<Class<? extends IOData>> classes) throws IOException
	{
		value = utils.readByte(in);
	}
	
	public String toString()
	{
		return Integer.toString(value);
	}
}
