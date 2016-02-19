package engine.util;

import java.nio.ByteOrder;
import java.util.Arrays;

public class ByteUtils
{
	public static final ByteUtils BIG_ENDIAN = new ByteUtils(true);
	public static final ByteUtils LITTLE_ENDIAN = new ByteUtils(false);
	public static final ByteUtils NATIVE = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? BIG_ENDIAN : LITTLE_ENDIAN;
	
	private boolean bigEndian;
	
	private ByteUtils(boolean bigEndian)
	{
		this.bigEndian = bigEndian;
	}
	
	public byte[] getSBytes(int value)
	{
		byte[] bytes = new byte[2];
		setSBytes(bytes, 0, value);
		return bytes;
	}
	
	public byte[] get3Bytes(int value)
	{
		byte[] bytes = new byte[3];
		set3Bytes(bytes, 0, value);
		return bytes;
	}
	
	public byte[] getIBytes(int value)
	{
		byte[] bytes = new byte[4];
		setIBytes(bytes, 0, value);
		return bytes;
	}
	
	public byte[] getFBytes(float value)
	{
		byte[] bytes = new byte[4];
		setFBytes(bytes, 0, value);
		return bytes;
	}
	
	public byte[] getLBytes(long value)
	{
		byte[] bytes = new byte[8];
		setLBytes(bytes, 0, value);
		return bytes;
	}
	
	public byte[] getDBytes(double value)
	{
		byte[] bytes = new byte[4];
		setDBytes(bytes, 0, value);
		return bytes;
	}
	
	public byte[] getArrayBytes(byte[] value, int header)
	{
		if (value == null)
		{
			if (header < 1 || header > 4) throw new IllegalArgumentException("illegal type " + header + 'b');
			byte[] bytes = new byte[header];
			Arrays.fill(bytes, (byte) -1);
			return bytes;
		}
		else if (header == 1)
		{
			if (value.length > 0xFE) throw new IllegalArgumentException("string too long for 1b header");
			byte[] bytes = new byte[value.length + 1];
			setArrayBytes(bytes, 0, value, header);
			return bytes;
		}
		else if (header == 2)
		{
			if (value.length > 0xFFFE) throw new IllegalArgumentException("string too long for 2b header");
			byte[] bytes = new byte[value.length + 2];
			setArrayBytes(bytes, 0, value, header);
			return bytes;
		}
		else if (header == 3)
		{
			if (value.length > 0xFFFFFE) throw new IllegalArgumentException("string too long for 3b header");
			byte[] bytes = new byte[value.length + 3];
			setArrayBytes(bytes, 0, value, header);
			return bytes;
		}
		else if (header == 4)
		{
			byte[] bytes = new byte[value.length + 4];
			setArrayBytes(bytes, 0, value, header);
			return bytes;
		}
		else throw new IllegalArgumentException("illegal type " + header + 'b');
	}
	
	public byte[] getStringBytes(String value, int header)
	{
		return getArrayBytes(Utils.getBytes(value), header);
	}
	
	public void setSBytes(byte[] bytes, int off, int value)
	{
		if (bigEndian)
		{
			bytes[off] = (byte) (value >> 8);
			bytes[off + 1] = (byte) value;
		}
		else
		{
			bytes[off + 1] = (byte) (value >> 8);
			bytes[off] = (byte) value;
		}
	}
	
	public void set3Bytes(byte[] bytes, int off, int value)
	{
		if (bigEndian)
		{
			bytes[off] = (byte) (value >> 16);
			bytes[off + 1] = (byte) (value >> 8);
			bytes[off + 2] = (byte) value;
		}
		else
		{
			bytes[off + 2] = (byte) (value >> 16);
			bytes[off + 1] = (byte) (value >> 8);
			bytes[off] = (byte) value;
		}
	}
	
	public void setIBytes(byte[] bytes, int off, int value)
	{
		if (bigEndian)
		{
			bytes[off] = (byte) (value >> 24);
			bytes[off + 1] = (byte) (value >> 16);
			bytes[off + 2] = (byte) (value >> 8);
			bytes[off + 3] = (byte) value;
		}
		else
		{
			bytes[off + 3] = (byte) (value >> 24);
			bytes[off + 2] = (byte) (value >> 16);
			bytes[off + 1] = (byte) (value >> 8);
			bytes[off] = (byte) value;
		}
	}
	
	public void setFBytes(byte[] bytes, int off, float value)
	{
		setIBytes(bytes, off, Float.floatToRawIntBits(value));
	}
	
	public void setLBytes(byte[] bytes, int off, long value)
	{
		if (bigEndian)
		{
			bytes[off] = (byte) (value >> 56);
			bytes[off + 1] = (byte) (value >> 48);
			bytes[off + 2] = (byte) (value >> 40);
			bytes[off + 3] = (byte) (value >> 32);
			bytes[off + 4] = (byte) (value >> 24);
			bytes[off + 5] = (byte) (value >> 16);
			bytes[off + 6] = (byte) (value >> 8);
			bytes[off + 7] = (byte) value;
		}
		else
		{
			bytes[off + 7] = (byte) (value >> 56);
			bytes[off + 6] = (byte) (value >> 48);
			bytes[off + 5] = (byte) (value >> 40);
			bytes[off + 4] = (byte) (value >> 32);
			bytes[off + 3] = (byte) (value >> 24);
			bytes[off + 2] = (byte) (value >> 16);
			bytes[off + 1] = (byte) (value >> 8);
			bytes[off] = (byte) value;
		}
	}
	
	public void setDBytes(byte[] bytes, int off, double value)
	{
		setLBytes(bytes, off, Double.doubleToRawLongBits(value));
	}
	
	public void setArrayBytes(byte[] bytes, int off, byte[] value, int header)
	{
		if (value == null)
		{
			if (header < 1 || header > 4) throw new IllegalArgumentException("illegal type " + header + 'b');
			Arrays.fill(bytes, off, off + header, (byte) -1);
		}
		else if (header == 1)
		{
			if (value.length > 0xFE) throw new IllegalArgumentException("string too long for 1b header");
			bytes[off] = (byte) value.length;
			System.arraycopy(value, 0, bytes, off + 1, value.length);
		}
		else if (header == 2)
		{
			if (value.length > 0xFFFE) throw new IllegalArgumentException("string too long for 2b header");
			setSBytes(bytes, off, value.length);
			System.arraycopy(value, 0, bytes, off + 2, value.length);
		}
		else if (header == 3)
		{
			if (value.length > 0xFFFFFE) throw new IllegalArgumentException("string too long for 3b header");
			set3Bytes(bytes, off, value.length);
			System.arraycopy(value, 0, bytes, off + 3, value.length);
		}
		else if (header == 4)
		{
			setIBytes(bytes, off, value.length);
			System.arraycopy(value, 0, bytes, off + 4, value.length);
		}
		else throw new IllegalArgumentException("illegal type " + header + 'b');
	}
	
	public void setStringBytes(byte[] bytes, int off, String value, int header)
	{
		setArrayBytes(bytes, off, Utils.getBytes(value), header);
	}
	
	public short getShort(byte[] bytes, int off)
	{
		short value = 0;
		if (bigEndian)
		{
			value |= bytes[off] << 8;
			value |= bytes[off + 1] & 0xFF;
		}
		else
		{
			value |= bytes[off + 1] << 8;
			value |= bytes[off] & 0xFF;
		}
		return value;
	}
	
	public int getUShort(byte[] bytes, int off)
	{
		int value = 0;
		if (bigEndian)
		{
			value |= (bytes[off] & 0xFF) << 8;
			value |= bytes[off + 1] & 0xFF;
		}
		else
		{
			value |= (bytes[off + 1] & 0xFF) << 8;
			value |= bytes[off] & 0xFF;
		}
		return value;
	}
	
	public int get3Byte(byte[] bytes, int off)
	{
		int value = 0;
		if (bigEndian)
		{
			value |= (bytes[off] & 0xFF) << 16;
			value |= (bytes[off + 1] & 0xFF) << 8;
			value |= bytes[off + 2] & 0xFF;
		}
		else
		{
			value |= (bytes[off + 2] & 0xFF) << 16;
			value |= (bytes[off + 1] & 0xFF) << 8;
			value |= bytes[off] & 0xFF;
		}
		return value;
	}
	
	public int getInt(byte[] bytes, int off)
	{
		int value = 0;
		if (bigEndian)
		{
			value |= bytes[off] << 24;
			value |= (bytes[off + 1] & 0xFF) << 16;
			value |= (bytes[off + 2] & 0xFF) << 8;
			value |= bytes[off + 3] & 0xFF;
		}
		else
		{
			value |= bytes[off + 3] << 24;
			value |= (bytes[off + 2] & 0xFF) << 16;
			value |= (bytes[off + 1] & 0xFF) << 8;
			value |= bytes[off] & 0xFF;
		}
		return value;
	}
	
	public float getFloat(byte[] bytes, int off)
	{
		return Float.intBitsToFloat(getInt(bytes, off));
	}
	
	public long getLong(byte[] bytes, int off)
	{
		long value;
		if (bigEndian)
		{
			value = (long) bytes[off] << 56;
			value |= (bytes[off + 1] & 0xFFl) << 48;
			value |= (bytes[off + 2] & 0xFFl) << 40;
			value |= (bytes[off + 3] & 0xFFl) << 32;
			value |= (bytes[off + 4] & 0xFFl) << 24;
			value |= (bytes[off + 5] & 0xFFl) << 16;
			value |= (bytes[off + 6] & 0xFFl) << 8;
			value |= bytes[off + 7] & 0xFFl;
		}
		else
		{
			value = (long) bytes[off + 7] << 56;
			value |= (bytes[off + 6] & 0xFFl) << 48;
			value |= (bytes[off + 5] & 0xFFl) << 40;
			value |= (bytes[off + 4] & 0xFFl) << 32;
			value |= (bytes[off + 3] & 0xFFl) << 24;
			value |= (bytes[off + 2] & 0xFFl) << 16;
			value |= (bytes[off + 1] & 0xFFl) << 8;
			value |= bytes[off] & 0xFFl;
		}
		return value;
	}
	
	public double getDouble(byte[] bytes, int off)
	{
		return Double.longBitsToDouble(getLong(bytes, off));
	}
	
	public byte[] getByteArray(byte[] bytes, int off, int header)
	{
		int len;
		if (header == 1)
		{
			len = bytes[off] & 0xFF;
			if (len == 0xFF) return null;
		}
		else if (header == 2)
		{
			len = getShort(bytes, off) & 0xFFFF;
			if (len == 0xFFFF) return null;
		}
		else if (header == 3)
		{
			len = get3Byte(bytes, off) & 0xFFFFFF;
			if (len == 0xFFFFFF) return null;
		}
		else if (header == 4)
		{
			len = getInt(bytes, off);
			if (len == -1) return null;
		}
		else throw new IllegalArgumentException("illegal type " + header + 'b');
		
		byte[] value = new byte[len];
		System.arraycopy(bytes, off + header, value, 0, len);
		return value;
	}
	
	public String getString(byte[] bytes, int off, int header)
	{
		return Utils.getString(getByteArray(bytes, off, header));
	}
	
	public static void reverseBytes(byte[] bytes)
	{
		reverseBytes(bytes, 0, bytes.length);
	}
	
	public static void reverseBytes(byte[] bytes, int off, int len)
	{
		byte temp;
		for (int i = 0; i < len / 2; i++)
		{
			temp = bytes[off + i];
			bytes[off + i] = bytes[off + len - i - 1];
			bytes[off + len - i - 1] = temp;
		}
	}
}
