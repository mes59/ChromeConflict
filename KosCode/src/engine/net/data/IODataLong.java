package engine.net.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class IODataLong extends IOData
{
	public long value;
	
	IODataLong()
	{
	}
	
	public IODataLong(long value)
	{
		this.value = value;
	}
	
	protected void writeData(OutputStream out, List<Class<? extends IOData>> classes) throws IOException
	{
		utils.writeLong(out, value);
	}
	
	protected void readData(InputStream in, List<Class<? extends IOData>> classes) throws IOException
	{
		value = utils.readLong(in);
	}
	
	public String toString()
	{
		return Long.toString(value);
	}
}
