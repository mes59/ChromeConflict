package engine.data.stream;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;

public class CRCOutputStream extends OutputStream
{
	private OutputStream out;
	private CRC32 crc;
	
	public CRCOutputStream(OutputStream out)
	{
		this.out = out;
		crc = new CRC32();
	}
	
	public CRCOutputStream(OutputStream out, CRC32 crc)
	{
		this.out = out;
		this.crc = crc;
	}
	
	public void write(int b) throws IOException
	{
		out.write(b);
		crc.update(b);
	}
	
	public void write(byte[] b, int off, int len) throws IOException
	{
		out.write(b, off, len);
		crc.update(b, off, len);
	}
	
	public long getCRCValue()
	{
		return crc.getValue();
	}
}
