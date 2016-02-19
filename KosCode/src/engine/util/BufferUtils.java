package engine.util;

import java.io.UnsupportedEncodingException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class BufferUtils
{
	public static final BufferUtils BIG_ENDIAN = new BufferUtils(false, true);
	public static final BufferUtils LITTLE_ENDIAN = new BufferUtils(false, false);
	public static final BufferUtils NATIVE = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? BIG_ENDIAN : LITTLE_ENDIAN;
	public static final BufferUtils ADAPTIVE = new BufferUtils(true, true);
	
	private boolean adapt, bigEndian;
	
	private BufferUtils(boolean adapt, boolean bigEndian)
	{
		this.adapt = adapt;
		this.bigEndian = bigEndian;
	}
	
	private boolean getEndian(ByteOrder order)
	{
		if (adapt) return order == ByteOrder.BIG_ENDIAN;
		else return bigEndian;
	}
	
	public void putBoolean(ByteBuffer buff, boolean value)
	{
		buff.put((byte) (value ? 1 : 0));
	}
	
	public void putByte(ByteBuffer buff, int value)
	{
		buff.put((byte) value);
	}
	
	public void putShort(ByteBuffer buff, int value)
	{
		if (buff.remaining() < 2) throw new BufferOverflowException();
		if (getEndian(buff.order()))
		{
			buff.put((byte) (value >> 8));
			buff.put((byte) value);
		}
		else
		{
			buff.put((byte) value);
			buff.put((byte) (value >> 8));
		}
	}
	
	public void put3Byte(ByteBuffer buff, int value)
	{
		if (buff.remaining() < 4) throw new BufferOverflowException();
		if (getEndian(buff.order()))
		{
			buff.put((byte) (value >> 16));
			buff.put((byte) (value >> 8));
			buff.put((byte) value);
		}
		else
		{
			buff.put((byte) value);
			buff.put((byte) (value >> 8));
			buff.put((byte) (value >> 16));
		}
	}
	
	public void putInt(ByteBuffer buff, int value)
	{
		if (buff.remaining() < 4) throw new BufferOverflowException();
		if (getEndian(buff.order()))
		{
			buff.put((byte) (value >> 24));
			buff.put((byte) (value >> 16));
			buff.put((byte) (value >> 8));
			buff.put((byte) value);
		}
		else
		{
			buff.put((byte) value);
			buff.put((byte) (value >> 8));
			buff.put((byte) (value >> 16));
			buff.put((byte) (value >> 24));
		}
	}
	
	public void putFloat(ByteBuffer buff, float value)
	{
		putInt(buff, Float.floatToRawIntBits(value));
	}
	
	public void putLong(ByteBuffer buff, long value)
	{
		if (buff.remaining() < 8) throw new BufferOverflowException();
		if (getEndian(buff.order()))
		{
			buff.put((byte) (value >> 56));
			buff.put((byte) (value >> 48));
			buff.put((byte) (value >> 40));
			buff.put((byte) (value >> 32));
			buff.put((byte) (value >> 24));
			buff.put((byte) (value >> 16));
			buff.put((byte) (value >> 8));
			buff.put((byte) value);
		}
		else
		{
			buff.put((byte) value);
			buff.put((byte) (value >> 8));
			buff.put((byte) (value >> 16));
			buff.put((byte) (value >> 24));
			buff.put((byte) (value >> 32));
			buff.put((byte) (value >> 40));
			buff.put((byte) (value >> 48));
			buff.put((byte) (value >> 56));
		}
	}
	
	public void putDouble(ByteBuffer buff, double value)
	{
		putLong(buff, Double.doubleToRawLongBits(value));
	}
	
	public void putVarInt(ByteBuffer buff, int value)
	{
		if (buff.remaining() < Utils.getVILength(value)) throw new BufferOverflowException();
		if (getEndian(buff.order()))
		{
			int count = 31 - Integer.numberOfLeadingZeros(value);
			count -= count % 7;
			while (true)
			{
				if (count == 0)
				{
					buff.put((byte) (value >>> count & 0x7F));
					break;
				}
				buff.put((byte) (value >>> count | 0x80));
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
					buff.put((byte) num);
					break;
				}
				buff.put((byte) (num | 0x80));
			}
		}
	}
	
	public void putVarLong(ByteBuffer buff, long value)
	{
		if (buff.remaining() < Utils.getVLLength(value)) throw new BufferOverflowException();
		if (getEndian(buff.order()))
		{
			int count = 63 - Long.numberOfLeadingZeros(value);
			count -= count % 7;
			while (true)
			{
				if (count == 0) buff.put((byte) (value >>> count));
				buff.put((byte) (value >>> count | 0x80));
				if (count == 0) break;
				count -= 7;
			}
		}
		else
		{
			int num;
			while (true)
			{
				num = (int) value & 0x7F;
				value >>>= 7;
				if (value == 0)
				{
					buff.put((byte) num);
					break;
				}
				else buff.put((byte) (num | 0x80));
			}
		}
	}
	
	public void putByteArray(ByteBuffer buff, byte[] value, int header)
	{
		if (value == null)
		{
			if (header == -2) throw new NullPointerException("not supported");
			if (header == -1)
			{
				if (buff.remaining() < 1) throw new BufferOverflowException();
				buff.put((byte) 0);
			}
			else
			{
				if (buff.remaining() < header) throw new BufferOverflowException();
				if (header < 1 || header > 4) throw new IllegalArgumentException("illegal type: " + header + 'b');
				for (int i = 0; i <= header; i++)
				{
					buff.put((byte) -1);
				}
			}
		}
		else if (header == -2)
		{
			if (buff.remaining() < value.length + Utils.getVILength(value.length)) throw new BufferOverflowException();
			putVarInt(buff, value.length);
			buff.put(value);
		}
		else if (header == -1)
		{
			if (buff.remaining() < value.length + Utils.getVILength(value.length + 1)) throw new BufferOverflowException();
			putVarInt(buff, value.length + 1);
			buff.put(value);
		}
		else if (header == 1)
		{
			if (buff.remaining() < value.length + 1) throw new BufferOverflowException();
			if (value.length > 0xFE) throw new IllegalArgumentException("string too long for 1b header");
			buff.put((byte) value.length);
			buff.put(value);
		}
		else if (header == 2)
		{
			if (buff.remaining() < value.length + 2) throw new BufferOverflowException();
			if (value.length > 0xFFFE) throw new IllegalArgumentException("string too long for 2b header");
			putShort(buff, value.length);
			buff.put(value);
		}
		else if (header == 3)
		{
			if (buff.remaining() < value.length + 3) throw new BufferOverflowException();
			if (value.length > 0xFFFFFE) throw new IllegalArgumentException("string too long for 3b header");
			put3Byte(buff, value.length);
			buff.put(value);
		}
		else if (header == 4)
		{
			if (buff.remaining() < value.length + 4) throw new BufferOverflowException();
			putInt(buff, value.length);
			buff.put(value);
		}
		else throw new IllegalArgumentException("illegal type: " + header);
	}
	
	public void putString(ByteBuffer buff, String value, int header)
	{
		try
		{
			if (value == null) putByteArray(buff, null, header);
			else putByteArray(buff, value.getBytes("UTF-8"), header);
		}
		catch (UnsupportedEncodingException e)
		{
			throw new Error("internal error", e);
		}
	}
	
	public void putString(ByteBuffer buff, String value, int header, String cs)
	{
		try
		{
			if (value == null) putByteArray(buff, null, header);
			else putByteArray(buff, value.getBytes(cs), header);
		}
		catch (UnsupportedEncodingException e)
		{
			throw new RuntimeException("bad encoding", e);
		}
	}
	
	public boolean getBoolean(ByteBuffer buff)
	{
		if (buff.remaining() < 1) throw new BufferUnderflowException();
		return buff.get() != 0;
	}
	
	public byte getByte(ByteBuffer buff)
	{
		if (buff.remaining() < 1) throw new BufferUnderflowException();
		return buff.get();
	}
	
	public int getUByte(ByteBuffer buff)
	{
		if (buff.remaining() < 1) throw new BufferUnderflowException();
		return buff.get() & 0xFF;
	}
	
	public short getShort(ByteBuffer buff)
	{
		if (buff.remaining() < 2) throw new BufferUnderflowException();
		int value;
		if (getEndian(buff.order()))
		{
			value = (buff.get() & 0xFF) << 8;
			value |= buff.get() & 0xFF;
		}
		else
		{
			value = buff.get() & 0xFF;
			value |= (buff.get() & 0xFF) << 8;
		}
		return (short) value;
	}
	
	public int getUShort(ByteBuffer buff)
	{
		if (buff.remaining() < 2) throw new BufferUnderflowException();
		int value;
		if (getEndian(buff.order()))
		{
			value = (buff.get() & 0xFF) << 8;
			value |= buff.get() & 0xFF;
		}
		else
		{
			value = buff.get() & 0xFF;
			value |= (buff.get() & 0xFF) << 8;
		}
		return value;
	}
	
	public int get3Byte(ByteBuffer buff)
	{
		if (buff.remaining() < 3) throw new BufferUnderflowException();
		int value;
		if (getEndian(buff.order()))
		{
			value = (buff.get() & 0xFF) << 8;
			value |= buff.get() & 0xFF;
		}
		else
		{
			value = buff.get() & 0xFF;
			value |= (buff.get() & 0xFF) << 8;
		}
		return value;
	}
	
	public int getInt(ByteBuffer buff)
	{
		if (buff.remaining() < 4) throw new BufferUnderflowException();
		int value;
		if (getEndian(buff.order()))
		{
			value = (buff.get() & 0xFF) << 24;
			value |= (buff.get() & 0xFF) << 16;
			value |= (buff.get() & 0xFF) << 8;
			value |= buff.get() & 0xFF;
		}
		else
		{
			value = buff.get() & 0xFF;
			value |= (buff.get() & 0xFF) << 8;
			value |= (buff.get() & 0xFF) << 16;
			value |= (buff.get() & 0xFF) << 24;
		}
		return value;
	}
	
	public float getFloat(ByteBuffer buff)
	{
		return Float.intBitsToFloat(getInt(buff));
	}
	
	public int getLong(ByteBuffer buff)
	{
		if (buff.remaining() < 8) throw new BufferUnderflowException();
		int value;
		if (getEndian(buff.order()))
		{
			value = (buff.get() & 0xFF) << 56;
			value |= (buff.get() & 0xFF) << 48;
			value |= (buff.get() & 0xFF) << 40;
			value |= (buff.get() & 0xFF) << 32;
			value |= (buff.get() & 0xFF) << 24;
			value |= (buff.get() & 0xFF) << 16;
			value |= (buff.get() & 0xFF) << 8;
			value |= buff.get() & 0xFF;
		}
		else
		{
			value = buff.get() & 0xFF;
			value |= (buff.get() & 0xFF) << 8;
			value |= (buff.get() & 0xFF) << 16;
			value |= (buff.get() & 0xFF) << 24;
			value |= (buff.get() & 0xFF) << 32;
			value |= (buff.get() & 0xFF) << 40;
			value |= (buff.get() & 0xFF) << 48;
			value |= (buff.get() & 0xFF) << 56;
		}
		return value;
	}
	
	public double getDouble(ByteBuffer buff)
	{
		return Double.longBitsToDouble(getLong(buff));
	}
	
	public int getVarInt(ByteBuffer buff)
	{
		int pos = buff.position();
		try
		{
			byte read;
			int value = 0;
			if (getEndian(buff.order()))
			{
				while (true)
				{
					read = buff.get();
					value = value << 7 | read & 0x7F;
					if (read >= 0) return value;
				}
			}
			else
			{
				int bits = 0;
				while (true)
				{
					read = buff.get();
					value = value | (read & 0x7F) << bits;
					if (read >= 0) return value;
					bits += 7;
				}
			}
		}
		catch (BufferUnderflowException e)
		{
			buff.position(pos);
			throw e;
		}
	}
	
	public long getVarLong(ByteBuffer buff)
	{
		int pos = buff.position();
		try
		{
			byte read;
			long value = 0;
			if (getEndian(buff.order()))
			{
				while (true)
				{
					read = buff.get();
					value = value << 7 | read & 0x7F;
					if (read >= 0) return value;
				}
			}
			else
			{
				int bits = 0;
				while (true)
				{
					read = buff.get();
					value = value | (read & 0x7F) << bits;
					if (read >= 0) return value;
					bits += 7;
				}
			}
		}
		catch (BufferUnderflowException e)
		{
			buff.position(pos);
			throw e;
		}
	}
	
	public byte[] getByteArray(ByteBuffer buff, int header)
	{
		int len, pos = buff.position();
		if (header == -2)
		{
			len = getVarInt(buff);
		}
		else if (header == -1)
		{
			len = getVarInt(buff) - 1;
			if (len == -1) return null;
		}
		else if (header == 1)
		{
			if (buff.remaining() < 1) throw new BufferUnderflowException();
			len = getUByte(buff);
			if (len == 0xFF) return null;
		}
		else if (header == 2)
		{
			if (buff.remaining() < 2) throw new BufferUnderflowException();
			len = getUShort(buff);
			if (len == 0xFFFF) return null;
		}
		else if (header == 3)
		{
			if (buff.remaining() < 3) throw new BufferUnderflowException();
			len = get3Byte(buff);
			if (len == 0xFFFFFF) return null;
		}
		else if (header == 4)
		{
			if (buff.remaining() < 4) throw new BufferUnderflowException();
			len = getInt(buff);
			if (len == -1) return null;
		}
		else throw new IllegalArgumentException("illegal type: " + header);
		if (len < 0)
		{
			buff.position(pos);
			throw new NegativeArraySizeException();
		}
		if (buff.remaining() < len)
		{
			buff.position(pos);
			throw new BufferUnderflowException();
		}
		byte[] data = new byte[len];
		buff.get(data);
		return data;
	}
	
	public String getString(ByteBuffer buff, int header)
	{
		try
		{
			byte[] bytes = getByteArray(buff, header);
			if (bytes == null) return null;
			return new String(bytes, "UTF-8");
		}
		catch (UnsupportedEncodingException e)
		{
			throw new Error("internal error", e);
		}
	}
	
	public String getString(ByteBuffer buff, int header, String cs)
	{
		try
		{
			byte[] bytes = getByteArray(buff, header);
			if (bytes == null) return null;
			return new String(bytes, cs);
		}
		catch (UnsupportedEncodingException e)
		{
			throw new RuntimeException("bad encoding", e);
		}
	}
}
