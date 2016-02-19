package engine.data;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

import engine.util.Utils;

public class DataBuffer
{
	private static final Field strChars;
	private static final Constructor<String> strConst;
	static
	{
		try
		{
			strChars = String.class.getDeclaredField("value");
			strChars.setAccessible(true);
			strConst = String.class.getDeclaredConstructor(char[].class, boolean.class);
			strConst.setAccessible(true);
		}
		catch (ReflectiveOperationException e)
		{
			throw new Error("reflection error", e);
		}
	}
	
	private static char[] retrieveChars(String str)
	{
		try
		{
			return (char[]) strChars.get(str);
		}
		catch (ReflectiveOperationException e)
		{
			throw new Error("reflection error", e);
		}
	}
	
	private static final String makeString(char[] chars)
	{
		try
		{
			return strConst.newInstance(chars, Boolean.TRUE);
		}
		catch (ReflectiveOperationException e)
		{
			throw new Error("reflection error", e);
		}
	}
	
	public static int getStringLength(String value)
	{
		if (value == null) throw new NullPointerException();
		char[] chars = retrieveChars(value);
		int length = 0;
		for (int i = 0; i < chars.length; i++)
		{
			char c = chars[i];
			if (c < 0x80) length++;
			else if (c < 0x800) length += 2;
			else if (Character.isSurrogate(c))
			{
				if (Character.isHighSurrogate(c) && i + 1 < chars.length)
				{
					char c2 = chars[++i];
					if (Character.isLowSurrogate(c2)) length += 4;
					else throw new DataFormatException("bad surrogate");
				}
				else throw new DataFormatException("bad surrogate");
			}
			else length += 3;
		}
		return length;
	}
	
	private volatile byte[] buffer;
	private volatile int position;
	private volatile int limit;
	private volatile boolean bigEndian;
	
	public DataBuffer(byte[] buffer)
	{
		this(buffer, 0, -1);
	}
	
	public DataBuffer(byte[] buffer, int position, int limit)
	{
		if (buffer == null) throw new NullPointerException();
		if (position < 0) throw new IndexOutOfBoundsException("position " + position);
		if (limit < 0) limit = -1;
		else if (position >= limit) throw new IndexOutOfBoundsException("position " + position + " in " + limit);
		this.buffer = buffer;
		this.position = position;
		this.limit = limit;
		bigEndian = true;
	}
	
	public DataBuffer(int size)
	{
		this(new byte[size], 0, -1);
	}
	
	public int position()
	{
		return position;
	}
	
	public DataBuffer position(int position)
	{
		if (position < 0) throw new IndexOutOfBoundsException("position " + position);
		if (limit != -1 && position > limit) throw new IndexOutOfBoundsException("position " + position + " in " + limit);
		this.position = position;
		return this;
	}
	
	public DataBuffer move(int offset)
	{
		if (position + offset < 0) throw new IndexOutOfBoundsException("position " + position);
		if (limit != -1 && position + offset > limit) throw new IndexOutOfBoundsException("position " + position + " in " + limit);
		position += offset;
		return this;
	}
	
	public int limit()
	{
		return limit;
	}
	
	public DataBuffer limit(int limit)
	{
		if (limit < 0) this.limit = -1;
		else
		{
			this.limit = limit;
			if (position > limit) position = limit;
		}
		return this;
	}
	
	public boolean getBigEndian()
	{
		return bigEndian;
	}
	
	public DataBuffer setBigEndian()
	{
		bigEndian = true;
		return this;
	}
	
	public DataBuffer setLittleEndian()
	{
		bigEndian = false;
		return this;
	}
	
	public DataBuffer setEndianness(boolean bigEndian)
	{
		this.bigEndian = bigEndian;
		return this;
	}
	
	public DataBuffer flip()
	{
		limit = position;
		position = 0;
		return this;
	}
	
	public DataBuffer rewind()
	{
		limit = -1;
		position = 0;
		return this;
	}
	
	public DataBuffer buffer(byte[] data, int off, int len, boolean limit)
	{
		if (data == null) throw new NullPointerException();
		if (off < 0) throw new ArrayIndexOutOfBoundsException(off);
		if (len < 0) throw new ArrayIndexOutOfBoundsException(len);
		if (off + len > data.length) throw new ArrayIndexOutOfBoundsException(off + len);
		if (len > 0)
		{
			ensureCap(len);
			System.arraycopy(data, off, buffer, position, len);
			if (limit) this.limit = position + len;
		}
		return this;
	}
	
	public DataBuffer put(byte[] data, int off, int len)
	{
		return put(data, off, len, true, false);
	}
	
	public DataBuffer put(byte[] data, int off, int len, boolean advance, boolean unlimited)
	{
		if (data == null) throw new NullPointerException();
		if (off < 0) throw new ArrayIndexOutOfBoundsException(off);
		if (len < 0) throw new ArrayIndexOutOfBoundsException(len);
		if (off + len > data.length) throw new ArrayIndexOutOfBoundsException(off + len);
		if (len > 0)
		{
			if (!unlimited && len > remaining()) throw new BufferOverflowException();
			ensureCap(position + len);
			System.arraycopy(data, off, buffer, position, len);
			if (advance) position += len;
		}
		return this;
	}
	
	public DataBuffer get(byte[] data, int off, int len)
	{
		return get(data, off, len, true, false);
	}
	
	public DataBuffer get(byte[] data, int off, int len, boolean advance, boolean unlimited)
	{
		if (data == null) throw new NullPointerException();
		if (off < 0) throw new ArrayIndexOutOfBoundsException(off);
		if (len < 0) throw new ArrayIndexOutOfBoundsException(len);
		if (off + len > data.length) throw new ArrayIndexOutOfBoundsException(off + len);
		if (len > 0)
		{
			if (!unlimited && len > remaining()) throw new BufferUnderflowException();
			int cnt = Math.min(buffer.length - position, len);
			System.arraycopy(buffer, position, data, off, cnt);
			if (cnt < len)
			{
				for (int i = cnt; i < len; i++)
				{
					data[i] = 0;
				}
			}
			if (advance) position += len;
		}
		return this;
	}
	
	public byte[] getBuffer()
	{
		return buffer;
	}
	
	public DataBuffer ensureCap(int capacity)
	{
		if (buffer.length < capacity)
		{
			capacity += 1024 - (capacity & 0x3FF);
			if (capacity < 0) capacity = Integer.MAX_VALUE;
			byte[] temp = new byte[capacity];
			System.arraycopy(buffer, 0, temp, 0, buffer.length);
			buffer = temp;
		}
		return this;
	}
	
	public int remaining()
	{
		if (limit == -1) return buffer.length - position;
		return limit - position;
	}
	
	public void checkWrite(int count)
	{
		if (limit != -1)
		{
			if (position + count > limit) throw new BufferOverflowException();
		}
		else ensureCap(position + count);
	}
	
	public void checkRead(int count)
	{
		if (limit != -1)
		{
			if (position + count > limit) throw new BufferUnderflowException();
		}
		else if (position + count > buffer.length) throw new BufferUnderflowException();
	}
	
	public DataBuffer putByte(int value)
	{
		checkWrite(1);
		buffer[position++] = (byte) value;
		return this;
	}
	
	public DataBuffer putShort(int value)
	{
		checkWrite(2);
		if (bigEndian)
		{
			buffer[position++] = (byte) (value >> 8);
			buffer[position++] = (byte) value;
		}
		else
		{
			buffer[position++] = (byte) value;
			buffer[position++] = (byte) (value >> 8);
		}
		return this;
	}
	
	public DataBuffer put3Byte(int value)
	{
		checkWrite(3);
		if (bigEndian)
		{
			buffer[position++] = (byte) (value >> 16);
			buffer[position++] = (byte) (value >> 8);
			buffer[position++] = (byte) value;
		}
		else
		{
			buffer[position++] = (byte) value;
			buffer[position++] = (byte) (value >> 8);
			buffer[position++] = (byte) (value >> 16);
		}
		return this;
	}
	
	public DataBuffer putInt(int value)
	{
		checkWrite(4);
		if (bigEndian)
		{
			buffer[position++] = (byte) (value >> 24);
			buffer[position++] = (byte) (value >> 16);
			buffer[position++] = (byte) (value >> 8);
			buffer[position++] = (byte) value;
		}
		else
		{
			buffer[position++] = (byte) value;
			buffer[position++] = (byte) (value >> 8);
			buffer[position++] = (byte) (value >> 16);
			buffer[position++] = (byte) (value >> 24);
		}
		return this;
	}
	
	public DataBuffer putFloat(float value)
	{
		return putInt(Float.floatToRawIntBits(value));
	}
	
	public DataBuffer putLong(long value)
	{
		checkWrite(8);
		if (bigEndian)
		{
			buffer[position++] = (byte) (value >> 56);
			buffer[position++] = (byte) (value >> 48);
			buffer[position++] = (byte) (value >> 40);
			buffer[position++] = (byte) (value >> 32);
			buffer[position++] = (byte) (value >> 24);
			buffer[position++] = (byte) (value >> 16);
			buffer[position++] = (byte) (value >> 8);
			buffer[position++] = (byte) value;
		}
		else
		{
			buffer[position++] = (byte) value;
			buffer[position++] = (byte) (value >> 8);
			buffer[position++] = (byte) (value >> 16);
			buffer[position++] = (byte) (value >> 24);
			buffer[position++] = (byte) (value >> 32);
			buffer[position++] = (byte) (value >> 40);
			buffer[position++] = (byte) (value >> 48);
			buffer[position++] = (byte) (value >> 56);
		}
		return this;
	}
	
	public DataBuffer putDouble(double value)
	{
		return putLong(Double.doubleToRawLongBits(value));
	}
	
	public DataBuffer putVarInt(int value)
	{
		int len = Utils.getVILength(value);
		checkWrite(len);
		if (bigEndian)
		{
			int count = 31 - Integer.numberOfLeadingZeros(value);
			count -= count % 7;
			while (count > 0)
			{
				buffer[position++] = (byte) (value >>> count | 0x80);
				count -= 7;
			}
			buffer[position++] = (byte) (value >>> count & 0x7F);
		}
		else
		{
			while ((value | 0x7F) != 0x7F)
			{
				buffer[position++] = (byte) (value & 0x7F | 0x80);
				value >>>= 7;
			}
			buffer[position++] = (byte) value;
		}
		return this;
	}
	
	public DataBuffer putVarLong(long value)
	{
		int len = Utils.getVLLength(value);
		checkWrite(len);
		if (bigEndian)
		{
			int count = 63 - Long.numberOfLeadingZeros(value);
			count -= count % 7;
			while (true)
			{
				if (count == 0)
				{
					buffer[position++] = (byte) (value >>> count | 0x80);
					break;
				}
				buffer[position++] = (byte) (value >>> count & 0x7F);
				count -= 7;
			}
		}
		else
		{
			while ((value | 0x7F) != 0x7F)
			{
				buffer[position++] = (byte) (value & 0x7F | 0x80);
				value >>>= 7;
			}
			buffer[position++] = (byte) value;
		}
		return this;
	}
	
	public DataBuffer putByteArray(byte[] value)
	{
		if (value == null) throw new NullPointerException();
		if (value.length > 0)
		{
			int pre = Utils.getVILength(value.length);
			checkWrite(pre + value.length);
			putVarInt(value.length);
			System.arraycopy(value, 0, buffer, position, value.length);
			position += value.length;
		}
		else
		{
			checkWrite(1);
			putVarInt(0);
		}
		return this;
	}
	
	public DataBuffer putString(String value, int max)
	{
		if (value == null) throw new NullPointerException();
		if (max != -1 && value.length() > max) throw new DataFormatException("string length " + value.length() + " exceeds max " + max);
		int length = getStringLength(value);
		int pre = Utils.getVILength(length);
		checkWrite(pre + length);
		putVarInt(length);
		return encodeString(value);
	}
	
	public DataBuffer encodeString(String value)
	{
		if (value == null) throw new NullPointerException();
		char[] chars = retrieveChars(value);
		for (int i = 0; i < chars.length; i++)
		{
			char c = chars[i];
			if (c < 0x80)
			{
				buffer[position++] = (byte) c;
			}
			else if (c < 0x800)
			{
				buffer[position++] = (byte) (0xC0 | c >>> 6);
				buffer[position++] = (byte) (0x80 | c & 0x3F);
			}
			else if (Character.isSurrogate(c))
			{
				if (Character.isHighSurrogate(c) && i + 1 < chars.length)
				{
					char c2 = chars[++i];
					if (Character.isLowSurrogate(c2))
					{
						int code = Character.toCodePoint(c, c2);
						buffer[position++] = (byte) (0xF0 | code >>> 18);
						buffer[position++] = (byte) (0x80 | code >>> 12 & 0x3F);
						buffer[position++] = (byte) (0x80 | code >>> 6 & 0x3F);
						buffer[position++] = (byte) (0x80 | code & 0x3F);
					}
					else throw new DataFormatException("bad surrogate");
				}
				else throw new DataFormatException("bad surrogate");
			}
			else
			{
				buffer[position++] = (byte) (0xE0 | c >>> 12);
				buffer[position++] = (byte) (0x80 | c >>> 6 & 0x3F);
				buffer[position++] = (byte) (0x80 | c & 0x3F);
			}
		}
		return this;
	}
	
	public byte peekByte()
	{
		checkRead(1);
		return buffer[position];
	}
	
	public int peekUByte()
	{
		checkRead(1);
		return buffer[position] & 0xFF;
	}
	
	public short peekShort()
	{
		checkRead(2);
		int value;
		if (bigEndian)
		{
			value = buffer[position] << 8;
			value |= buffer[position + 1] & 0xFF;
		}
		else
		{
			value = buffer[position] & 0xFF;
			value |= buffer[position + 1] << 8;
		}
		return (short) value;
	}
	
	public int peekUShort()
	{
		checkRead(2);
		int value;
		if (bigEndian)
		{
			value = buffer[position] << 8;
			value |= buffer[position + 1] & 0xFF;
		}
		else
		{
			value = buffer[position] & 0xFF;
			value |= buffer[position + 1] << 8;
		}
		return value & 0xFFFF;
	}
	
	public int peek3Byte()
	{
		checkRead(3);
		int value;
		if (bigEndian)
		{
			value = (buffer[position] & 0xFF) << 16;
			value |= (buffer[position + 1] & 0xFF) << 8;
			value |= buffer[position + 2] & 0xFF;
		}
		else
		{
			value = buffer[position] & 0xFF;
			value |= (buffer[position + 1] & 0xFF) << 8;
			value |= (buffer[position + 2] & 0xFF) << 16;
		}
		return value & 0xFFFFFF;
	}
	
	public int peekInt()
	{
		checkRead(4);
		int value;
		if (bigEndian)
		{
			value = (buffer[position] & 0xFF) << 24;
			value |= (buffer[position + 1] & 0xFF) << 16;
			value |= (buffer[position + 2] & 0xFF) << 8;
			value |= buffer[position + 3] & 0xFF;
		}
		else
		{
			value = buffer[position] & 0xFF;
			value |= (buffer[position + 1] & 0xFF) << 8;
			value |= (buffer[position + 2] & 0xFF) << 16;
			value |= (buffer[position + 3] & 0xFF) << 24;
		}
		return value;
	}
	
	public float peekFloat()
	{
		return Float.intBitsToFloat(getInt());
	}
	
	public long peekLong()
	{
		checkRead(8);
		long value;
		if (bigEndian)
		{
			value = (long) (buffer[position] & 0xFF) << 56;
			value |= (long) (buffer[position + 1] & 0xFF) << 48;
			value |= (long) (buffer[position + 2] & 0xFF) << 40;
			value |= (long) (buffer[position + 3] & 0xFF) << 32;
			value |= (long) (buffer[position + 4] & 0xFF) << 24;
			value |= (long) (buffer[position + 5] & 0xFF) << 16;
			value |= (long) (buffer[position + 6] & 0xFF) << 8;
			value |= buffer[position + 7] & 0xFF;
		}
		else
		{
			value = buffer[position] & 0xFF;
			value |= (long) (buffer[position + 1] & 0xFF) << 8;
			value |= (long) (buffer[position + 2] & 0xFF) << 16;
			value |= (long) (buffer[position + 3] & 0xFF) << 24;
			value |= (long) (buffer[position + 4] & 0xFF) << 32;
			value |= (long) (buffer[position + 5] & 0xFF) << 40;
			value |= (long) (buffer[position + 6] & 0xFF) << 48;
			value |= (long) (buffer[position + 7] & 0xFF) << 56;
		}
		return value;
	}
	
	public double peekDouble()
	{
		return Double.longBitsToDouble(getLong());
	}
	
	public byte getByte()
	{
		checkRead(1);
		return buffer[position++];
	}
	
	public int getUByte()
	{
		checkRead(1);
		return buffer[position++] & 0xFF;
	}
	
	public short getShort()
	{
		checkRead(2);
		int value;
		if (bigEndian)
		{
			value = buffer[position++] << 8;
			value |= buffer[position++] & 0xFF;
		}
		else
		{
			value = buffer[position++] & 0xFF;
			value |= buffer[position++] << 8;
		}
		return (short) value;
	}
	
	public int getUShort()
	{
		checkRead(2);
		int value;
		if (bigEndian)
		{
			value = buffer[position++] << 8;
			value |= buffer[position++] & 0xFF;
		}
		else
		{
			value = buffer[position++] & 0xFF;
			value |= buffer[position++] << 8;
		}
		return value & 0xFFFF;
	}
	
	public int get3Byte()
	{
		checkRead(3);
		int value;
		if (bigEndian)
		{
			value = (buffer[position++] & 0xFF) << 16;
			value |= (buffer[position++] & 0xFF) << 8;
			value |= buffer[position++] & 0xFF;
		}
		else
		{
			value = buffer[position++] & 0xFF;
			value |= (buffer[position++] & 0xFF) << 8;
			value |= (buffer[position++] & 0xFF) << 16;
		}
		return value & 0xFFFFFF;
	}
	
	public int getInt()
	{
		checkRead(4);
		int value;
		if (bigEndian)
		{
			value = (buffer[position++] & 0xFF) << 24;
			value |= (buffer[position++] & 0xFF) << 16;
			value |= (buffer[position++] & 0xFF) << 8;
			value |= buffer[position++] & 0xFF;
		}
		else
		{
			value = buffer[position++] & 0xFF;
			value |= (buffer[position++] & 0xFF) << 8;
			value |= (buffer[position++] & 0xFF) << 16;
			value |= (buffer[position++] & 0xFF) << 24;
		}
		return value;
	}
	
	public float getFloat()
	{
		return Float.intBitsToFloat(getInt());
	}
	
	public long getLong()
	{
		checkRead(8);
		long value;
		if (bigEndian)
		{
			value = (long) (buffer[position++] & 0xFF) << 56;
			value |= (long) (buffer[position++] & 0xFF) << 48;
			value |= (long) (buffer[position++] & 0xFF) << 40;
			value |= (long) (buffer[position++] & 0xFF) << 32;
			value |= (long) (buffer[position++] & 0xFF) << 24;
			value |= (long) (buffer[position++] & 0xFF) << 16;
			value |= (long) (buffer[position++] & 0xFF) << 8;
			value |= buffer[position++] & 0xFF;
		}
		else
		{
			value = buffer[position++] & 0xFF;
			value |= (long) (buffer[position++] & 0xFF) << 8;
			value |= (long) (buffer[position++] & 0xFF) << 16;
			value |= (long) (buffer[position++] & 0xFF) << 24;
			value |= (long) (buffer[position++] & 0xFF) << 32;
			value |= (long) (buffer[position++] & 0xFF) << 40;
			value |= (long) (buffer[position++] & 0xFF) << 48;
			value |= (long) (buffer[position++] & 0xFF) << 56;
		}
		return value;
	}
	
	public double getDouble()
	{
		return Double.longBitsToDouble(getLong());
	}
	
	public int getVarInt()
	{
		int value = 0;
		if (bigEndian)
		{
			for (int bit = 0; bit <= 5; bit++)
			{
				if (remaining() < 1) throw new BufferUnderflowException();
				byte b = buffer[position++];
				value = value << 7 | b & 0x7F;
				if (b >= 0) return value;
			}
		}
		else
		{
			for (int bit = 0; bit <= 5; bit++)
			{
				if (remaining() < 1) throw new BufferUnderflowException();
				byte b = buffer[position++];
				value |= (b & 0x7F) << bit * 7;
				if (b >= 0) return value;
			}
		}
		throw new DataFormatException("varint too long");
	}
	
	public long getVarLong()
	{
		long value = 0;
		if (bigEndian)
		{
			for (int bit = 0; bit <= 9; bit++)
			{
				if (remaining() < 1) throw new BufferUnderflowException();
				byte b = buffer[position++];
				value = value << 7 | b & 0x7F;
				if (b >= 0) return value;
			}
		}
		else
		{
			for (int bit = 0; bit <= 9; bit++)
			{
				if (remaining() < 1) throw new BufferUnderflowException();
				byte b = buffer[position++];
				value |= (b & 0x7Fl) << bit * 7;
				if (b >= 0) return value;
			}
		}
		throw new DataFormatException("varlong too long");
	}
	
	public byte[] getByteArray()
	{
		int len = getVarInt();
		if (len < 0) throw new DataFormatException("negative array length");
		checkRead(len);
		byte[] value = new byte[len];
		System.arraycopy(buffer, position, value, 0, len);
		position += len;
		return value;
	}
	
	public String getString(int max)
	{
		if (max != -1 && max <= 0) throw new IllegalArgumentException();
		int len = getVarInt();
		if (len < 0) throw new DataFormatException("negative string length");
		if (max != -1 && len > 4 * max) throw new DataFormatException("encoded string length " + len + " exceeds max " + 4 * max);
		checkRead(len);
		return decodeString(len, max);
	}
	
	public String decodeString(int length)
	{
		return decodeString(length, -1);
	}
	
	private String decodeString(int len, int max)
	{
		int slen = 0;
		for (int i = 0; i < len; i++)
		{
			byte b = buffer[position + i];
			if (b < 0)
			{
				if ((b & 0xE0) == 0xC0)
				{
					if (i + 1 >= len) throw new DataFormatException("invalid unicode");
					if ((buffer[position + ++i] & 0xC0) != 0x80) throw new DataFormatException("invalid unicode");
				}
				else if ((b & 0xF0) == 0xE0)
				{
					if (i + 2 >= len) throw new DataFormatException("invalid unicode");
					if ((buffer[position + ++i] & 0xC0) != 0x80) throw new DataFormatException("invalid unicode");
					if ((buffer[position + ++i] & 0xC0) != 0x80) throw new DataFormatException("invalid unicode");
				}
				else if ((b & 0xF8) == 0xF0)
				{
					
					if (i + 3 >= len) throw new DataFormatException("invalid unicode");
					if ((buffer[position + ++i] & 0xC0) != 0x80) throw new DataFormatException("invalid unicode");
					if ((buffer[position + ++i] & 0xC0) != 0x80) throw new DataFormatException("invalid unicode");
					if ((buffer[position + ++i] & 0xC0) != 0x80) throw new DataFormatException("invalid unicode");
					slen++;
				}
				else throw new DataFormatException("invalid unicode: 0x" + Utils.getHexChar(b >> 4) + Utils.getHexChar(b));
			}
			slen++;
		}
		if (max != -1 && slen > max) throw new DataFormatException("string length " + len + " exceeds max " + max);
		
		char[] chars = new char[slen];
		for (int i = 0; i < slen; i++)
		{
			byte b = buffer[position++];
			if (b < 0)
			{
				if ((b & 0xE0) == 0xC0)
				{
					char c = (char) ((b & 0x1F) << 6);
					c |= buffer[position++] & 0x3F;
					chars[i] = c;
				}
				else if ((b & 0xF0) == 0xE0)
				{
					char c = (char) ((b & 0xF) << 12);
					c |= (buffer[position++] & 0x3F) << 6;
					c |= buffer[position++] & 0x3F;
					chars[i] = c;
				}
				else if ((b & 0xF8) == 0xF0)
				{
					int code = (b & 7) << 18;
					code |= (buffer[position++] & 0x3F) << 12;
					code |= (buffer[position++] & 0x3F) << 6;
					code |= buffer[position++] & 0x3F;
					chars[i++] = Character.highSurrogate(code);
					chars[i] = Character.lowSurrogate(code);
				}
			}
			else chars[i] = (char) (b & 0x7F);
		}
		return makeString(chars);
	}
}
