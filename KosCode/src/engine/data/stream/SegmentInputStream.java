package engine.data.stream;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SegmentInputStream extends BufferedInputStream
{
	private volatile long currPos, markPos;
	private volatile long currLimit, markLimit;
	
	public SegmentInputStream(InputStream in)
	{
		super(in);
		markPos = currLimit = markLimit = -1;
	}
	
	public long getPosition()
	{
		return currPos;
	}
	
	public void setLimit(long newLimit)
	{
		if (newLimit < 0) currLimit = -1;
		else
		{
			if (newLimit < currPos) throw new IllegalArgumentException("new limit " + newLimit + " is smaller than position");
			currLimit = newLimit;
		}
	}
	
	public long getLimit()
	{
		return currLimit;
	}
	
	public int canRead(int count)
	{
		if (count <= 0) throw new IllegalArgumentException("bad length: " + count);
		if (currLimit == -1 || currPos == -1 || currLimit - currPos > Integer.MAX_VALUE) return count;
		if (count > currLimit - currPos) return (int) (currLimit - currPos);
		return count;
	}
	
	public long canReadLong(long count)
	{
		if (count <= 0) throw new IllegalArgumentException("bad length: " + count);
		if (currLimit == -1 || currPos == -1) return count;
		if (count > currLimit - currPos) return currLimit - currPos;
		return count;
	}
	
	public int read() throws IOException
	{
		if (canRead(1) == 1)
		{
			int r = super.read();
			if (r != -1) currPos++;
			return r;
		}
		return -1;
	}
	
	public int read(byte[] b, int off, int len) throws IOException
	{
		if (len == 0) return 0;
		len = canRead(len);
		if (len == 0) return -1;
		len = super.read(b, off, len);
		currPos += len;
		return len;
	}
	
	public long skip(long n) throws IOException
	{
		if (n == 0) return 0;
		n = canReadLong(n);
		n = super.skip(n);
		currPos += n;
		return n;
	}
	
	public void mark(int readlimit)
	{
		super.mark(readlimit);
		markPos = currPos;
		markLimit = currLimit;
	}
	
	public void reset() throws IOException
	{
		super.reset();
		currPos = markPos;
		currLimit = markLimit;
	}
}
