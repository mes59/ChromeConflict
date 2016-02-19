package engine.net.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class IODataDouble extends IOData
{
	public double value;
	
	IODataDouble()
	{
	}
	
	public IODataDouble(double value)
	{
		this.value = value;
	}
	
	protected void writeData(OutputStream out, List<Class<? extends IOData>> classes) throws IOException
	{
		utils.writeDouble(out, value);
	}
	
	protected void readData(InputStream in, List<Class<? extends IOData>> classes) throws IOException
	{
		value = utils.readDouble(in);
	}
	
	public String toString()
	{
		return Double.toString(value);
	}
}
