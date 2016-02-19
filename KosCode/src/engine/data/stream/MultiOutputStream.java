package engine.data.stream;

import java.io.IOException;
import java.io.OutputStream;

public class MultiOutputStream extends OutputStream
{
	private volatile boolean closed;
	private OutputStream[] children;
	
	public MultiOutputStream(OutputStream... children)
	{
		if (children == null) throw new NullPointerException();
		this.children = children;
		for (OutputStream out : children)
		{
			if (out == null) throw new NullPointerException();
		}
	}
	
	public synchronized void write(int b) throws IOException
	{
		if (closed) throw new IOException("stream closed");
		for (OutputStream out : children)
		{
			out.write(b);
		}
	}
	
	public synchronized void write(byte[] b, int off, int len) throws IOException
	{
		if (closed) throw new IOException("stream closed");
		for (OutputStream out : children)
		{
			out.write(b, off, len);
		}
	}
	
	public synchronized void close()
	{
		closed = true;
	}
}
