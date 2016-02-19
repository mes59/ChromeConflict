package engine.data.stream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LimitedInputStream extends FilterInputStream
{
	private final long limit;
	private volatile long pos;
	
	public LimitedInputStream(InputStream in, long limit)
	{
		super(in);
		if (in == null) throw new NullPointerException("input stream");
		if (limit < 0) throw new IllegalArgumentException("negative limit");
		this.limit = limit;
	}
	
	public long getRemainingBytes()
	{
		return limit - pos;
	}
	
	public int read() throws IOException
	{
		if (pos == limit) return -1;
		pos++;
		return in.read();
	}
	
	public int read(byte b[], int off, int len) throws IOException
	{
		if (pos == limit) return -1;
		if (len > limit - pos) len = (int) (limit - pos);
		if (off + len > b.length) throw new ArrayIndexOutOfBoundsException(off + len);
		len = in.read(b, off, len);
		pos += len;
		return len;
	}
	
	public long skip(long n) throws IOException
	{
		if (pos == limit) return -1;
		if (n > limit - pos) n = limit - pos;
		n = in.skip(n);
		pos += n;
		return n;
	}
	
	public int available() throws IOException
	{
		int len = in.available();
		if (len > limit - pos) len = (int) (limit - pos);
		return len;
	}
	
	public void close() throws IOException
	{
		in.close();
	}
	
	public synchronized void mark(int readlimit)
	{
		in.mark(readlimit);
	}
	
	public synchronized void reset() throws IOException
	{
		in.reset();
	}
	
	public boolean markSupported()
	{
		return in.markSupported();
	}
}
