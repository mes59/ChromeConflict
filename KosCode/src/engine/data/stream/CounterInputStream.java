package engine.data.stream;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class CounterInputStream extends InputStream
{
	private InputStream in;
	private long position;
	
	public CounterInputStream(InputStream in)
	{
		this.in = in;
	}
	
	public long getPosition()
	{
		return position;
	}
	
	public void seek(long target) throws IOException
	{
		if (target > position)
		{
			while (true)
			{
				long read = in.skip(target - position);
				if (read == -1) throw new EOFException("unexpected end of stream");
				position += read;
				if (position == target) return;
			}
		}
		else if (target < position) throw new IllegalArgumentException("already read past mark");
	}
	
	public int read() throws IOException
	{
		int value = in.read();
		if (value != -1) position++;
		return value;
	}
	
	public int read(byte[] b, int off, int len) throws IOException
	{
		int read = in.read(b, off, len);
		if (read != -1) position += read;
		return read;
	}
	
	public long skip(long n) throws IOException
	{
		long read = in.skip(n);
		if (read != -1) position += read;
		return read;
	}
	
	public int available() throws IOException
	{
		return in.available();
	}
	
	public void close() throws IOException
	{
		in.close();
	}
	
	public void mark(int readlimit)
	{
		in.mark(readlimit);
	}
	
	public void reset() throws IOException
	{
		in.reset();
	}
	
	public boolean markSupported()
	{
		return in.markSupported();
	}
}
