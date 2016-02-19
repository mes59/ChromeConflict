package engine.net.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class IODataBool extends IOData
{
	public boolean value;
	
	IODataBool()
	{
	}
	
	public IODataBool(boolean value)
	{
		this.value = value;
	}
	
	protected void writeData(OutputStream out, List<Class<? extends IOData>> classes) throws IOException
	{
		utils.writeBoolean(out, value);
	}
	
	protected void readData(InputStream in, List<Class<? extends IOData>> classes) throws IOException
	{
		value = utils.readBoolean(in);
	}
	
	public String toString()
	{
		return Boolean.toString(value);
	}
}
