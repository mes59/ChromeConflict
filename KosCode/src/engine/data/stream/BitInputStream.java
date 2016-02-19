package engine.data.stream;

import java.io.IOException;
import java.io.InputStream;

public class BitInputStream extends InputStream
{
	private final InputStream in;
	private int buffer;
	private int bits;
	
	public BitInputStream(InputStream in)
	{
		this.in = in;
	}
	
	public int getBitOffset()
	{
		return bits & 7;
	}
	
	public int readBit() throws IOException
	{
		if (bits == -2) throw new IOException("closed");
		if (bits == -1) return -1;
		if (bits == 0) buffer();
		return buffer >>> --bits & 1;
	}
	
	public int readBits(int count) throws IOException
	{
		if (bits == -2) throw new IOException("closed");
		if (count < 0 || count > 32) throw new IllegalArgumentException();
		if (bits == -1) return -1;
		if (bits < count) buffer();
		if (bits < count)
		{
			int value = buffer << count - bits;
			bits = -1;
			return value;
		}
		bits -= count;
		return buffer >> bits & (0xFFFFFFFF << count ^ -1);
	}
	
	public int read() throws IOException
	{
		if (bits == -2) throw new IOException("closed");
		if (bits == -1) return -1;
		if (bits == 0) return in.read();
		if (bits < 8) buffer();
		if (bits < 8)
		{
			int value = buffer << 8 - bits;
			bits = -1;
			return value;
		}
		bits -= 8;
		return buffer >> bits & 0xFF;
	}
	
	public int read(byte[] b, int off, int len) throws IOException
	{
		if (bits == -2) throw new IOException("closed");
		if (off + len > b.length) throw new ArrayIndexOutOfBoundsException(off + len);
		for (int i = 0; i < len; i++)
		{
			if (bits == 0) return i + in.read(b, off + i, len - i);
			int value = read();
			if (value == -1)
			{
				if (i == 0) return -1;
				return i;
			}
			b[off + i] = (byte) value;
		}
		return len;
	}
	
	private void buffer() throws IOException
	{
		if (bits == -2) throw new IOException("closed");
		if (bits == -1) return;
		int count = (32 - bits) / 8;
		for (int i = 0; i < count; i++)
		{
			int read = in.read();
			if (read == -1) break;
			buffer = buffer << 8 | read;
			bits += 8;
		}
	}
	
	public void close() throws IOException
	{
		if (bits != -2)
		{
			bits = -2;
			in.close();
		}
	}
}
