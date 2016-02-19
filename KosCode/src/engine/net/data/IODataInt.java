package engine.net.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class IODataInt extends IOData
{
	public int value;
	
	IODataInt()
	{
	}
	
	public IODataInt(int value)
	{
		this.value = value;
	}
	
	protected void writeData(OutputStream out, List<Class<? extends IOData>> classes) throws IOException
	{
		utils.writeInt(out, value);
	}
	
	protected void readData(InputStream in, List<Class<? extends IOData>> classes) throws IOException
	{
		value = utils.readInt(in);
	}
	
	public String toString()
	{
		return Integer.toString(value);
	}
}
