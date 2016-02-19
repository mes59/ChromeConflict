package engine.net.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class IODataByteArr extends IOData
{
	public byte[] value;
	
	IODataByteArr()
	{
	}
	
	public IODataByteArr(byte[] value)
	{
		this.value = value;
	}
	
	protected void writeData(OutputStream out, List<Class<? extends IOData>> classes) throws IOException
	{
		utils.writeByteArray(out, value, -1);
	}
	
	protected void readData(InputStream in, List<Class<? extends IOData>> classes) throws IOException
	{
		value = utils.readByteArray(in, -1);
	}
}
