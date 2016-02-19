package engine.net.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class IODataString extends IOData
{
	public String value;
	
	IODataString()
	{
	}
	
	public IODataString(String value)
	{
		if (value != null && value.length() >= 0xFE) throw new IllegalArgumentException("string too long");
		this.value = value;
	}
	
	protected void writeData(OutputStream out, List<Class<? extends IOData>> classes) throws IOException
	{
		utils.writeString(out, value, -1);
	}
	
	protected void readData(InputStream in, List<Class<? extends IOData>> classes) throws IOException
	{
		value = utils.readString(in, -1);
	}
	
	public String toString()
	{
		return value;
	}
}
