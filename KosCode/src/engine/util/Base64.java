package engine.util;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class Base64
{
	public static String encodeStr(byte[] data)
	{
		return new String(encodeChars(data, 0, data.length));
	}
	
	public static String encodeStr(byte[] data, int off, int len)
	{
		return new String(encodeChars(data, off, len));
	}
	
	public static char[] encodeChars(byte[] data)
	{
		return encodeChars(data, 0, data.length);
	}
	
	public static char[] encodeChars(byte[] data, int off, int len)
	{
		if (off < 0 || off >= data.length) throw new ArrayIndexOutOfBoundsException(off);
		if (off + len > data.length) throw new ArrayIndexOutOfBoundsException(off + len - 1);
		int mod = 2, buff = 0, pos = 0;
		int count = (len + 2) / 3 * 4;
		char[] chars = new char[count];
		for (int i = 0; i < len; i++)
		{
			mod = i % 3;
			if (mod == 0)
			{
				buff = data[off + i];
				chars[pos++] = asChar(buff >> 2 & 0x3F);
			}
			else if (mod == 1)
			{
				buff = buff << 8 | data[off + i] & 0xFF;
				chars[pos++] = asChar(buff >> 4 & 0x3F);
			}
			else
			{
				buff = buff << 8 | data[off + i] & 0xFF;
				chars[pos++] = asChar(buff >> 6 & 0x3F);
				chars[pos++] = asChar(buff & 0x3F);
			}
		}
		
		if (mod == 0)
		{
			chars[pos++] = asChar(buff << 4 & 0x3F);
			chars[pos++] = '=';
			chars[pos++] = '=';
		}
		if (mod == 1)
		{
			chars[pos++] = asChar(buff << 2 & 0x3F);
			chars[pos++] = '=';
		}
		return chars;
	}
	
	public static void encodeBuff(ByteBuffer bytes, CharBuffer chars, int len)
	{
		if (len == -1 || len > bytes.remaining()) len = bytes.remaining();
		if ((len + 2) / 3 * 4 > chars.remaining()) throw new BufferUnderflowException();
		int mod = 2, buff = 0;
		for (int i = 0; i < len; i++)
		{
			mod = i % 3;
			if (mod == 0)
			{
				buff = bytes.get();
				chars.put(asChar(buff >> 2 & 0x3F));
			}
			else if (mod == 1)
			{
				buff = buff << 8 | bytes.get() & 0xFF;
				chars.put(asChar(buff >> 4 & 0x3F));
			}
			else
			{
				buff = buff << 8 | bytes.get() & 0xFF;
				chars.put(asChar(buff >> 6 & 0x3F)).put(asChar(buff & 0x3F));
			}
		}
		
		if (mod == 0) chars.put(asChar(buff << 4 & 0x3F)).put('=').put('=');
		if (mod == 1) chars.put(asChar(buff << 2 & 0x3F)).put('=');
	}
	
	public static void encodeStream(InputStream in, Writer out, int len, boolean require) throws IOException
	{
		int mod = 2, buff = 0;
		while (len == -1 || len > 0)
		{
			int b = in.read();
			if (b == -1)
			{
				if (len > 0 && require) throw new EOFException("unexpected end of stream");
				break;
			}
			mod = (mod + 1) % 3;
			if (len != -1) len--;
			
			if (mod == 0)
			{
				buff = b;
				out.write(asChar(buff >> 2 & 0x3F));
			}
			else if (mod == 1)
			{
				buff = buff << 8 | b;
				out.write(asChar(buff >> 4 & 0x3F));
			}
			else
			{
				buff = buff << 8 | b;
				out.write(asChar(buff >> 6 & 0x3F));
				out.write(asChar(buff & 0x3F));
			}
		}
		if (mod == 0)
		{
			out.write(asChar(buff << 4 & 0x3F));
			out.write('=');
			out.write('=');
		}
		if (mod == 1)
		{
			out.write(asChar(buff << 2 & 0x3F));
			out.write('=');
		}
	}
	
	private static char asChar(int b)
	{
		b = b & 0xFF;
		if (b < 26) return (char) (b + 'A');
		if (b < 52) return (char) (b + 'a' - 26);
		if (b < 62) return (char) (b + '0' - 52);
		if (b == 62) return '+';
		if (b == 63) return '/';
		throw new IllegalArgumentException("for byte: " + b);
	}
	
	public static byte[] decodeStr(String encoded)
	{
		return decodeChars(encoded.toCharArray(), 0, encoded.length());
	}
	
	public static byte[] decodeStr(String encoded, int off, int len)
	{
		if (off + len > encoded.length()) throw new StringIndexOutOfBoundsException(off + len - 1);
		return decodeChars(encoded.toCharArray(), off, len);
	}
	
	public static byte[] decodeChars(char[] chars)
	{
		return decodeChars(chars, 0, chars.length);
	}
	
	public static byte[] decodeChars(char[] chars, int off, int len)
	{
		if (off < 0 || off >= chars.length) throw new StringIndexOutOfBoundsException(off);
		if (off + len > chars.length) throw new StringIndexOutOfBoundsException(off + len - 1);
		if (len % 4 != 0) throw new IllegalArgumentException("bad character count");
		int mod, buff = 0, pos = 0;
		char curr = 0;
		int count = len / 4 * 3;
		if (chars[off + len - 1] == '=')
		{
			count--;
			if (chars[off + len - 2] == '=') count--;
		}
		byte[] bytes = new byte[count];
		for (int i = 0; i < len; i++)
		{
			mod = i % 4;
			curr = chars[off + i];
			if (mod == 0) buff = asByte(curr);
			else if (mod == 1)
			{
				buff = buff << 6 | asByte(curr);
				bytes[pos++] = (byte) (buff >> 4);
			}
			else if (mod == 2)
			{
				if (curr != '=')
				{
					buff = buff << 6 | asByte(curr);
					bytes[pos++] = (byte) (buff >> 2);
				}
				else if (i + 2 != len) throw new IllegalArgumentException("bad format");
			}
			else
			{
				if (curr != '=')
				{
					buff = buff << 6 | asByte(curr);
					bytes[pos++] = (byte) buff;
				}
				else if (i + 1 != len) throw new IllegalArgumentException("bad format");
				else break;
			}
		}
		return bytes;
	}
	
	public static void decodeBuff(CharBuffer chars, ByteBuffer bytes, int len)
	{
		if (len == -1) len = chars.remaining();
		else if ((len + 3) / 4 * 3 > bytes.remaining()) throw new BufferUnderflowException();
		if (len % 4 != 0) throw new IllegalArgumentException("bad character count");
		
		int mod, buff = 0;
		for (int i = 0; i < len; i++)
		{
			mod = i % 4;
			if (mod == 0) buff = asByte(chars.get());
			else if (mod == 1)
			{
				buff = buff << 6 | asByte(chars.get());
				bytes.put((byte) (buff >> 4));
			}
			else if (mod == 2)
			{
				char c = chars.get();
				if (c != '=')
				{
					buff = buff << 6 | asByte(c);
					bytes.put((byte) (buff >> 2));
				}
				else if (len - i != 2) throw new IllegalArgumentException("bad format");
			}
			else
			{
				char c = chars.get();
				if (c != '=')
				{
					buff = buff << 6 | asByte(c);
					bytes.put((byte) buff);
				}
				else if (len - i != 1) throw new IllegalArgumentException("bad format");
			}
		}
	}
	
	public static void decodeStream(Reader in, OutputStream out, int len, boolean require) throws IOException
	{
		if (len != -1 && len % 4 != 0) throw new IllegalArgumentException("bad length");
		int mod = 3, buff = 0;
		while (len == -1 || len > 0)
		{
			int c = in.read();
			if (c == -1)
			{
				if (mod != 3 || require && len > 0) throw new EOFException("unexpected end of stream");
				break;
			}
			mod = (mod + 1) % 4;
			if (len != -1) len--;
			if (mod == 0) buff = asByte((char) c);
			else if (mod == 1)
			{
				buff = buff << 6 | asByte((char) c);
				out.write(buff >> 4);
			}
			else if (mod == 2)
			{
				if (c != '=')
				{
					buff = buff << 6 | asByte((char) c);
					out.write(buff >> 2);
				}
				else if (len != -1 && len != 1) throw new IllegalArgumentException("bad format");
			}
			else
			{
				if (c != '=')
				{
					buff = buff << 6 | asByte((char) c);
					out.write(buff);
				}
				else if (len != -1 && len != 0) throw new IllegalArgumentException("bad format");
			}
		}
	}
	
	private static int asByte(char c)
	{
		if (c >= 'A' && c <= 'Z') return c - 'A';
		if (c >= 'a' && c <= 'z') return c - 'a' + 26;
		if (c >= '0' && c <= '9') return c - '0' + 52;
		if (c == '+') return 62;
		if (c == '/') return 63;
		throw new IllegalArgumentException("illegal character: '" + c + "'");
	}
}
