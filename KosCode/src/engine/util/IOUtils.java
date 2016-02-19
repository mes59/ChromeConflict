package engine.util;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class IOUtils
{
	public static final IOUtils BIG_ENDIAN = new IOUtils(true);
	public static final IOUtils LITTLE_ENDIAN = new IOUtils(false);
	public static final IOUtils NATIVE = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? BIG_ENDIAN : LITTLE_ENDIAN;
	
	private boolean bigEndian;
	
	private IOUtils(boolean bigEndian)
	{
		this.bigEndian = bigEndian;
	}
	
	public void writeBoolean(OutputStream out, boolean value) throws IOException
	{
		out.write(value ? 1 : 0);
	}
	
	public void writeByte(OutputStream out, int value) throws IOException
	{
		out.write(value); // for completeness
	}
	
	public void writeShort(OutputStream out, int value) throws IOException
	{
		if (bigEndian)
		{
			out.write(value >> 8);
			out.write(value);
		}
		else
		{
			out.write(value);
			out.write(value >> 8);
		}
	}
	
	public void write3Byte(OutputStream out, int value) throws IOException
	{
		if (bigEndian)
		{
			out.write(value >> 16);
			out.write(value >> 8);
			out.write(value);
		}
		else
		{
			out.write(value);
			out.write(value >> 8);
			out.write(value >> 16);
		}
	}
	
	public void writeInt(OutputStream out, int value) throws IOException
	{
		if (bigEndian)
		{
			out.write(value >> 24);
			out.write(value >> 16);
			out.write(value >> 8);
			out.write(value);
		}
		else
		{
			out.write(value);
			out.write(value >> 8);
			out.write(value >> 16);
			out.write(value >> 24);
		}
	}
	
	public void writeFloat(OutputStream out, float value) throws IOException
	{
		writeInt(out, Float.floatToRawIntBits(value));
	}
	
	public void writeLong(OutputStream out, long value) throws IOException
	{
		if (bigEndian)
		{
			out.write((byte) (value >> 56));
			out.write((byte) (value >> 48));
			out.write((byte) (value >> 40));
			out.write((byte) (value >> 32));
			out.write((byte) (value >> 24));
			out.write((byte) (value >> 16));
			out.write((byte) (value >> 8));
			out.write((byte) value);
		}
		else
		{
			out.write((byte) value);
			out.write((byte) (value >> 8));
			out.write((byte) (value >> 16));
			out.write((byte) (value >> 24));
			out.write((byte) (value >> 32));
			out.write((byte) (value >> 40));
			out.write((byte) (value >> 48));
			out.write((byte) (value >> 56));
		}
	}
	
	public void writeDouble(OutputStream out, double value) throws IOException
	{
		writeLong(out, Double.doubleToRawLongBits(value));
	}
	
	public void writeVarInt(OutputStream out, int value) throws IOException
	{
		if (bigEndian)
		{
			int count = 31 - Integer.numberOfLeadingZeros(value);
			count -= count % 7;
			while (true)
			{
				if (count == 0)
				{
					out.write(value >>> count & 0x7F);
					break;
				}
				out.write(value >>> count | 0x80);
				count -= 7;
			}
		}
		else
		{
			int num;
			while (true)
			{
				num = value & 0x7F;
				value >>>= 7;
				if (value == 0)
				{
					out.write(num);
					break;
				}
				else out.write(num | 0x80);
			}
		}
	}
	
	public void writeVarLong(OutputStream out, long value) throws IOException
	{
		if (bigEndian)
		{
			int count = 63 - Long.numberOfLeadingZeros(value);
			count -= count % 7;
			while (true)
			{
				if (count == 0)
				{
					out.write((int) (value >>> count) & 0x7F);
					break;
				}
				out.write((int) (value >>> count | 0x80));
				count -= 7;
			}
		}
		else
		{
			int num;
			while (true)
			{
				num = (int) (value & 0x7F);
				value >>>= 7;
				if (value == 0)
				{
					out.write(num);
					break;
				}
				else out.write(num | 0x80);
			}
		}
	}
	
	public void writeByteArray(OutputStream out, byte[] value, int header) throws IOException
	{
		if (value == null)
		{
			if (header == -2) throw new NullPointerException("not supported");
			if (header == -1) writeVarInt(out, 0);
			else
			{
				if (header < 1 || header > 4) throw new IllegalArgumentException("illegal type: " + header + 'b');
				for (int i = 0; i <= header; i++)
				{
					out.write(-1);
				}
			}
		}
		else if (header == -2)
		{
			writeVarInt(out, value.length);
			out.write(value);
		}
		else if (header == -1)
		{
			writeVarInt(out, value.length + 1);
			out.write(value);
		}
		else if (header == 1)
		{
			if (value.length > 0xFE) throw new IllegalArgumentException("string too long for 1b header");
			out.write(value.length);
			out.write(value);
		}
		else if (header == 2)
		{
			if (value.length > 0xFFFE) throw new IllegalArgumentException("string too long for 2b header");
			writeShort(out, value.length);
			out.write(value);
		}
		else if (header == 3)
		{
			if (value.length > 0xFFFFFE) throw new IllegalArgumentException("string too long for 3b header");
			writeShort(out, value.length);
			out.write(value);
		}
		else if (header == 4)
		{
			writeInt(out, value.length);
			out.write(value);
		}
		else throw new IllegalArgumentException("illegal type: " + header);
	}
	
	public void writeString(OutputStream out, String value, int header) throws IOException
	{
		if (value == null) writeByteArray(out, null, header);
		else writeByteArray(out, value.getBytes("UTF-8"), header);
	}
	
	public void writeString(OutputStream out, String value, int header, String cs) throws IOException
	{
		if (value == null) writeByteArray(out, null, header);
		else writeByteArray(out, value.getBytes(cs), header);
	}
	
	public void writeCString(OutputStream out, String value) throws IOException
	{
		char[] chars = value.toCharArray();
		int index = 0;
		for (char c : chars)
		{
			if (c == 0 || c > 255) throw new IllegalArgumentException("at index " + index + ": " + (int) c);
			index++;
		}
		for (char c : chars)
		{
			out.write(c);
		}
		out.write(0);
	}
	
	public boolean readBoolean(InputStream in) throws IOException
	{
		return readUByte(in) != 0;
	}
	
	public byte readByte(InputStream in) throws IOException
	{
		int b = in.read();
		if (b == -1) throw new EOFException();
		return (byte) b;
	}
	
	public int readUByte(InputStream in) throws IOException
	{
		int b = in.read();
		if (b == -1) throw new EOFException();
		return b;
	}
	
	public short readShort(InputStream in) throws IOException
	{
		if (bigEndian)
		{
			int s = readUByte(in) << 8;
			s |= readUByte(in);
			return (short) s;
		}
		else
		{
			int s = readUByte(in);
			s |= readUByte(in) << 8;
			return (short) s;
		}
	}
	
	public int readUShort(InputStream in) throws IOException
	{
		if (bigEndian)
		{
			int s = readUByte(in) << 8;
			s |= readUByte(in);
			return s;
		}
		else
		{
			int s = readUByte(in);
			s |= readUByte(in) << 8;
			return s;
		}
	}
	
	public int read3Byte(InputStream in) throws IOException
	{
		if (bigEndian)
		{
			int i = readUByte(in) << 16;
			i |= readUByte(in) << 8;
			i |= readUByte(in);
			return i;
		}
		else
		{
			int i = readUByte(in);
			i |= readUByte(in) << 8;
			i |= readUByte(in) << 16;
			return i;
		}
	}
	
	public int readInt(InputStream in) throws IOException
	{
		if (bigEndian)
		{
			int i = readUByte(in) << 24;
			i |= readUByte(in) << 16;
			i |= readUByte(in) << 8;
			i |= readUByte(in);
			return i;
		}
		else
		{
			int i = readUByte(in);
			i |= readUByte(in) << 8;
			i |= readUByte(in) << 16;
			i |= readUByte(in) << 24;
			return i;
		}
	}
	
	public float readFloat(InputStream in) throws IOException
	{
		return Float.intBitsToFloat(readInt(in));
	}
	
	public long readLong(InputStream in) throws IOException
	{
		if (bigEndian)
		{
			long l = (long) readUByte(in) << 56;
			l |= (long) readUByte(in) << 48;
			l |= (long) readUByte(in) << 40;
			l |= (long) readUByte(in) << 32;
			l |= (long) readUByte(in) << 24;
			l |= readUByte(in) << 16;
			l |= readUByte(in) << 8;
			l |= readUByte(in);
			return l;
		}
		else
		{
			long l = readUByte(in);
			l |= readUByte(in) << 8;
			l |= readUByte(in) << 16;
			l |= (long) readUByte(in) << 24;
			l |= (long) readUByte(in) << 32;
			l |= (long) readUByte(in) << 40;
			l |= (long) readUByte(in) << 48;
			l |= (long) readUByte(in) << 56;
			return l;
		}
	}
	
	public double readDouble(InputStream in) throws IOException
	{
		return Double.longBitsToDouble(readLong(in));
	}
	
	public int readVarInt(InputStream in) throws IOException
	{
		int bits = 0;
		int value = 0;
		if (bigEndian)
		{
			while (bits < 32)
			{
				int read = readByte(in);
				value = value << 7 | read & 0x7F;
				if (read >= 0) return value;
				bits += 7;
			}
			throw new IOException("VarInt overflow");
		}
		else
		{
			while (bits < 32)
			{
				int read = readByte(in);
				value = value | (read & 0x7F) << bits;
				if (read >= 0) return value;
				bits += 7;
			}
			throw new IOException("VarInt overflow");
		}
	}
	
	public long readVarLong(InputStream in) throws IOException
	{
		int bits = 0;
		long value = 0;
		if (bigEndian)
		{
			while (bits < 64)
			{
				int read = readByte(in);
				value = value << 7 | read & 0x7F;
				if (read >= 0) return value;
				bits += 7;
			}
			throw new IOException("VarLong overflow");
		}
		else
		{
			while (bits < 64)
			{
				int read = readByte(in);
				value = value | (long) (read & 0x7F) << bits;
				if (read >= 0) return value;
				bits += 7;
			}
			throw new IOException("VarLong overflow");
		}
	}
	
	public byte[] readByteArray(InputStream in, int header) throws IOException
	{
		int len;
		if (header == -2)
		{
			len = readVarInt(in);
		}
		else if (header == -1)
		{
			len = readVarInt(in) - 1;
			if (len == -1) return null;
		}
		else if (header == 1)
		{
			len = readUByte(in);
			if (len == 0xFF) return null;
		}
		else if (header == 2)
		{
			len = readUShort(in);
			if (len == 0xFFFF) return null;
		}
		else if (header == 3)
		{
			len = read3Byte(in);
			if (len == 0xFFFFFF) return null;
		}
		else if (header == 4)
		{
			len = readInt(in);
			if (len == -1) return null;
			if (len < 0) throw new IOException("negative array length");
		}
		else throw new IllegalArgumentException("illegal type: " + header);
		return readBytes(in, len);
	}
	
	public String readString(InputStream in, int header) throws IOException
	{
		byte[] bytes = readByteArray(in, header);
		if (bytes == null) return null;
		return new String(bytes, "UTF-8");
	}
	
	public String readString(InputStream in, int header, String cs) throws IOException
	{
		byte[] bytes = readByteArray(in, header);
		if (bytes == null) return null;
		return new String(bytes, cs);
	}
	
	public static String readCString(InputStream in, int expected, int max) throws IOException
	{
		if (max >= 0 && max < expected) expected = max;
		if (expected < 1)
		{
			if (expected == 0 && max == 0)
			{
				if (in.read() == 0) return "";
				else throw new IOException("not an empty string");
			}
			else throw new IllegalArgumentException("expected size");
		}
		char[] buffer = new char[expected];
		int c, index = 0;
		while (true)
		{
			c = in.read();
			if (c == -1) throw new EOFException();
			if (c == 0) return new String(buffer, 0, index);
			if (index == buffer.length)
			{
				if (index == max) throw new IOException("string longer than " + expected + " bytes");
				char[] temp = new char[Math.min(buffer.length * 2, max >= 0 ? max : Integer.MAX_VALUE)];
				System.arraycopy(buffer, 0, temp, 0, index);
				buffer = temp;
			}
			buffer[index++] = (char) c;
		}
	}
	
	/**
	 * skips length bytes from in or throws an EOFException
	 * @param in skipping bytes of this stream
	 * @param length amount of bytes to skip
	 * @throws EOFException if end of stream is reached
	 */
	public static void skipFully(InputStream in, int length) throws IOException
	{
		if (length < 1) return;
		while (length > 0)
		{
			int result = (int) in.skip(length);
			if (result == 0)
			{
				if (in.read() == -1) throw new EOFException();
				else length--;
			}
			else length -= result;
		}
	}
	
	/**
	 * reads bytes.length bytes or throws an EOFException
	 * @param in data is read from this InputStream
	 * @param bytes data is read into this array
	 * @return the the byte array
	 * @throws EOFException if end of stream is reached
	 */
	public static byte[] readFully(InputStream in, byte[] bytes) throws IOException
	{
		return readFully(in, bytes, 0, bytes.length);
	}
	
	/**
	 * fills the array with len bytes starting from off
	 * @param in data is read from this InputStream
	 * @param bytes data is read into this array
	 * @param off starting point of data
	 * @param len amount of bytes to read
	 * @return the the byte array
	 * @throws EOFException if end of stream is reached
	 */
	public static byte[] readFully(InputStream in, byte[] bytes, int off, int len) throws IOException
	{
		if (len == 0) return bytes;
		if (off < 0 | off > bytes.length) throw new IllegalArgumentException("offset");
		if (len < 0 | len > bytes.length) throw new IllegalArgumentException("length");
		if (len + off > bytes.length) throw new IllegalArgumentException("range");
		int end = off + len;
		while (off != end)
		{
			int read = in.read(bytes, off, end - off);
			if (read == -1) throw new EOFException();
			off += read;
		}
		return bytes;
	}
	
	/**
	 * simple method to read some bytes
	 * @param in data is read from this InputStream
	 * @param length amount of bytes to read
	 * @throws EOFException if end of stream is reached
	 * */
	
	public static byte[] readBytes(InputStream in, int length) throws IOException
	{
		byte[] data = new byte[length];
		readFully(in, data, 0, length);
		return data;
	}
	
	/**
	 * transfers bytes until end of stream is reached
	 * @param in bytes are read from this InputStream
	 * @param out and written to this OutputStream
	 * @param buffsize how big the buffer should be in bytes
	 */
	public static void transfer(InputStream in, OutputStream out, int buffsize) throws IOException
	{
		byte[] buffer = new byte[buffsize];
		while (true)
		{
			int read = in.read(buffer);
			if (read == -1) return;
			out.write(buffer, 0, read);
		}
	}
	
	/**
	 * transfers bytes until end of stream is reached
	 * @param in bytes are read from this InputStream
	 * @param out and written to this OutputStream
	 * @param buffer the array to read and write with
	 * @param listener a listener that is notified of progress
	 */
	public static void transfer(InputStream in, OutputStream out, byte[] buffer) throws IOException
	{
		while (true)
		{
			int read = in.read(buffer);
			if (read == -1) return;
			out.write(buffer, 0, read);
		}
	}
	
	public static void transfer(InputStream in, OutputStream out, int buffsize, int bytesSecond) throws IOException
	{
		int count = 0, rate = bytesSecond / 10;
		byte[] buffer = new byte[buffsize];
		while (true)
		{
			int read = in.read(buffer, 0, Math.min(rate - count, buffsize));
			if (read == -1) return;
			out.write(buffer, 0, read);
			count += read;
			if (count >= rate)
			{
				count = 0;
				Utils.sleep(100);
			}
		}
	}
	
	/**
	 * transfers a certain amount of bytes
	 * @param in bytes are read from this InputStream
	 * @param out and written to this OutputStream
	 * @param buffsize how big the buffer should be in bytes
	 */
	public static void transferLimited(InputStream in, OutputStream out, int count, int buffsize) throws IOException
	{
		if (buffsize > count) buffsize = count;
		byte[] buffer = new byte[buffsize];
		while (count > 0)
		{
			int read = in.read(buffer, 0, count > buffsize ? buffsize : count);
			if (read == -1) throw new EOFException();
			out.write(buffer, 0, read);
			count -= read;
		}
	}
	
	public static void process(InputStream in, ByteProcessor proc, int count) throws IOException
	{
		int buffsize = proc.getPreferredBufferSize();
		if (buffsize < 256) buffsize = 256;
		if (buffsize > count) buffsize = count;
		byte[] buffer = new byte[buffsize];
		while (count > 0)
		{
			int read = in.read(buffer, 0, count > buffsize ? buffsize : count);
			if (read == -1) throw new EOFException();
			try
			{
				proc.processBytes(buffer, 0, read);
			}
			catch (RuntimeException e)
			{
				throw new IOException("exception in data processor", e);
			}
			count -= read;
		}
		proc.processCompleted();
	}
	
	/**
	 * Read and buffer bytes until end of line is detected (the newline sequence is not included).<br>
	 * if {@code buff} is {@code null} no bytes are buffered but the end of line is still searched for.<br>
	 * This method does not deal with decoding characters to avoid buffering unused bytes.
	 * @param in input stream
	 * @param buff buffer to put bytes, can be null
	 * @param acceptEOF if true, EOF will be treated as a valid new line sequence (with or without CR)
	 * @param requireCR require a carriage return character (0x0C) to be before the newline character
	 * @return how many bytes were placed (or would have been placed) in buff
	 */
	public static int readNextLine(InputStream in, ByteBuffer buff, boolean acceptEOF, boolean requireCR) throws IOException
	{
		int count = 0, curr, cr = 0;
		while (true)
		{
			curr = in.read();
			if (curr == -1)
			{
				if (acceptEOF) return count;
				throw new EOFException();
			}
			if (curr == 10)
			{
				if (!requireCR || cr == 1) return count;
				count++;
				if (buff != null) buff.put((byte) 10);
			}
			else if (curr == 13)
			{
				if (cr == 0) cr = 1;
				else
				{
					count++;
					if (buff != null) buff.put((byte) 13);
				}
			}
			else
			{
				count++;
				if (cr == 1) count++;
				if (buff != null)
				{
					if (cr == 1) buff.put((byte) 13);
					buff.put((byte) curr);
				}
			}
		}
	}
}
