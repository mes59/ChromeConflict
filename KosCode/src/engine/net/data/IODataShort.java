package engine.net.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class IODataShort extends IOData
{
	public int value;
	
	IODataShort()
	{
	}
	
	public IODataShort(int value)
	{
		this.value = (short) value;
	}
	
	protected void writeData(OutputStream out, List<Class<? extends IOData>> classes) throws IOException
	{
		utils.writeShort(out, value);
	}
	
	protected void readData(InputStream in, List<Class<? extends IOData>> classes) throws IOException
	{
		value = utils.readShort(in);
	}
	
	public String toString()
	{
		return Integer.toString(value);
	}
}
