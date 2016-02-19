package engine.data.stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class IOStreamPipe
{
	/**
	 * if this instance should automatically deallocate old buffer elements
	 */
	public volatile boolean autoCleanup = true;
	
	/**
	 * if the amount of bytes removed is below this, auto cleanup wont do anything
	 */
	public volatile int minCleanup = 1024;
	
	private final Object lock;
	private volatile byte[] buffer;
	private volatile int outIndex;
	private volatile int inIndex;
	private volatile int mark;
	private volatile int limit;
	
	private OutputPart out;
	private InputPart in;
	
	public IOStreamPipe(int cap)
	{
		lock = new Object();
		buffer = new byte[cap];
		out = new OutputPart();
		in = new InputPart();
		mark = limit = -1;
	}
	
	public OutputStream getOutputStream()
	{
		return out;
	}
	
	public InputStream getInputStream()
	{
		return in;
	}
	
	public void cleanup(int min)
	{
		if (outIndex == -1) return;
		synchronized (lock)
		{
			int off = inIndex;
			if (mark != -1) off = mark;
			if (off >= min)
			{
				int len = outIndex - inIndex;
				System.arraycopy(buffer, off, buffer, 0, len);
				outIndex -= off;
				inIndex -= off;
				if (mark != -1) mark -= off;
			}
		}
	}
	
	private class OutputPart extends OutputStream
	{
		public void write(int b) throws IOException
		{
			synchronized (lock)
			{
				if (outIndex == -1) throw new IOException("stream closed");
				if (outIndex >= buffer.length - 1)
				{
					if (autoCleanup) cleanup(minCleanup);
					if (outIndex >= buffer.length - 1)
					{
						buffer = Arrays.copyOf(buffer, outIndex + 1024);
					}
				}
				buffer[outIndex++] = (byte) b;
				lock.notify();
			}
		}
		
		public void write(byte[] b, int off, int len) throws IOException
		{
			if (b.length < off + len) throw new ArrayIndexOutOfBoundsException(off + len);
			synchronized (lock)
			{
				if (outIndex == -1) throw new IOException("stream closed");
				if (outIndex >= buffer.length - len)
				{
					if (autoCleanup) cleanup(minCleanup);
					if (!autoCleanup || outIndex + len >= buffer.length)
					{
						buffer = Arrays.copyOf(buffer, outIndex + len + 1024);
					}
				}
				System.arraycopy(b, off, buffer, outIndex, len);
				outIndex += len;
				lock.notify();
			}
		}
		
		public void close()
		{
			synchronized (lock)
			{
				outIndex = -1;
			}
		}
	}
	
	private class InputPart extends InputStream
	{
		public int read() throws IOException
		{
			synchronized (lock)
			{
				if (outIndex == -1)
				{
					if (inIndex == buffer.length) return -1;
				}
				if (available() == 0)
				{
					try
					{
						lock.wait();
					}
					catch (InterruptedException e)
					{
						throw new IOException(e);
					}
				}
				int value = buffer[inIndex++] & 0xFF;
				if (mark != -1)
				{
					limit--;
					if (limit < 0)
					{
						mark = -1;
						limit = -1;
					}
				}
				lock.notify();
				return value;
			}
		}
		
		public int read(byte[] b, int off, int len) throws IOException
		{
			if (b.length < off + len) throw new ArrayIndexOutOfBoundsException(off + len);
			synchronized (lock)
			{
				if (outIndex == -1)
				{
					if (inIndex == buffer.length) return -1;
				}
				if (available() == 0)
				{
					try
					{
						lock.wait();
					}
					catch (InterruptedException e)
					{
						throw new IOException(e);
					}
				}
				int available = available();
				if (len > available) len = available;
				System.arraycopy(buffer, inIndex, b, off, len);
				inIndex += len;
				if (mark != -1)
				{
					limit -= len;
					if (limit < 0)
					{
						mark = -1;
						limit = -1;
					}
				}
				lock.notify();
				return len;
			}
		}
		
		public long skip(long n)
		{
			if (n < 1) return 0;
			synchronized (lock)
			{
				int available = available();
				if (n > available) n = available;
				inIndex += n;
				return n;
			}
		}
		
		public int available()
		{
			synchronized (lock)
			{
				if (outIndex == -1) return buffer.length - inIndex;
				return outIndex - inIndex;
			}
		}
		
		public void mark(int readlimit)
		{
			synchronized (lock)
			{
				if (readlimit > -1)
				{
					mark = inIndex;
					limit = readlimit;
				}
			}
		}
		
		public void reset() throws IOException
		{
			synchronized (lock)
			{
				if (mark == -1) throw new IOException("no mark set");
				inIndex = mark;
			}
		}
		
		public boolean markSupported()
		{
			return true;
		}
	}
}
