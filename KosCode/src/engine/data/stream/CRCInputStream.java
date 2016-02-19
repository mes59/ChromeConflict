package engine.data.stream;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

public class CRCInputStream extends InputStream
{
	private InputStream in;
	private CRC32 crc;
	
	public CRCInputStream(InputStream in)
	{
		this.in = in;
		crc = new CRC32();
	}
	
	public CRCInputStream(InputStream in, CRC32 crc)
	{
		this.in = in;
		this.crc = crc;
	}
	
	public int read() throws IOException
	{
		int b = in.read();
		if (b != -1) crc.update(b);
		return b;
	}
	
	public int read(byte[] b, int off, int len) throws IOException
	{
		int amt = in.read(b, off, len);
		if (amt > -1) crc.update(b, off, amt);
		return amt;
	}
	
	public long getCRCValue()
	{
		return crc.getValue();
	}
}
