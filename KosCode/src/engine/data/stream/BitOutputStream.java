package engine.data.stream;

import java.io.IOException;
import java.io.OutputStream;

public class BitOutputStream extends OutputStream
{
	private final OutputStream out;
	private int buffer;
	private int bits;
	
	public BitOutputStream(OutputStream out)
	{
		this.out = out;
	}
	
	public void writeBit(int b) throws IOException
	{
		if (bits == -1) throw new IOException("closed");
		if (bits == 32) flush();
		buffer = buffer << 1 | b & 1;
		bits++;
	}
	
	public void writeBits(int b, int count) throws IOException
	{
		if (bits == -1) throw new IOException("closed");
		if (count < 0 || count > 32) throw new IllegalArgumentException();
		if (count + bits > 32) flush();
		if (count + bits > 32)
		{
			writeBits(b, 16);
			flush();
			writeBits(b >> 16, 16);
		}
		else
		{
			b = b & (0xFFFFFFFF << count ^ -1);
			buffer = buffer << count | b;
			bits += count;
		}
	}
	
	public void write(int b) throws IOException
	{
		if (bits == -1) throw new IOException("closed");
		if (bits > 24) flush();
		buffer = buffer << 8 | b & 0xFF;
		bits += 8;
	}
	
	public void flush() throws IOException
	{
		if (bits == -1) throw new IOException("closed");
		int count = bits / 8;
		for (int i = 0; i < count; i++)
		{
			bits -= 8;
			out.write(buffer >> bits);
		}
	}
	
	public void close() throws IOException
	{
		if (bits != -1)
		{
			if (bits > 7) flush();
			if (bits > 0)
			{
				out.write(buffer << 8 - bits);
			}
			out.close();
			bits = -1;
		}
	}
}
