package engine.data.stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BackupInputStream extends InputStream
{
	private InputStream base;
	private OutputStream backup;
	
	public BackupInputStream(InputStream base, OutputStream backup)
	{
		this.base = base;
		this.backup = backup;
	}
	
	public int read() throws IOException
	{
		int i = base.read();
		if (i == -1)
		{
			backup.close();
			return -1;
		}
		backup.write(i);
		return i;
	}
	
	public int read(byte[] b, int off, int len) throws IOException
	{
		int i = base.read(b, off, len);
		if (i == -1)
		{
			backup.close();
			return -1;
		}
		backup.write(b, off, len);
		return i;
	}
	
	public int available() throws IOException
	{
		return base.available();
	}
	
	public void close() throws IOException
	{
		base.close();
		backup.close();
	}
}
