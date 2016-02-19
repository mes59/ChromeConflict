package engine.net.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class IODataFloat extends IOData
{
	public float value;
	
	IODataFloat()
	{
	}
	
	public IODataFloat(float value)
	{
		this.value = value;
	}
	
	protected void writeData(OutputStream out, List<Class<? extends IOData>> classes) throws IOException
	{
		utils.writeFloat(out, value);
	}
	
	protected void readData(InputStream in, List<Class<? extends IOData>> classes) throws IOException
	{
		value = utils.readFloat(in);
	}
	
	public String toString()
	{
		return Float.toString(value);
	}
}
