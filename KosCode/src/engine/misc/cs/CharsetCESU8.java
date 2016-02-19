package engine.misc.cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class CharsetCESU8 extends Charset
{
	public static final CharsetCESU8 CESU8 = new CharsetCESU8();
	
	private CharsetCESU8()
	{
		super("CESU-8", new String[]{"CESU8"});
	}
	
	public String historicalName()
	{
		return "CESU8";
	}
	
	public boolean contains(Charset cs)
	{
		return this == cs;
	}
	
	public CharsetDecoder newDecoder()
	{
		return new CharsetDecoderCESU8();
	}
	
	public CharsetEncoder newEncoder()
	{
		return new CharsetEncoderCESU8();
	}
	
	private class CharsetDecoderCESU8 extends CharsetDecoder
	{
		protected CharsetDecoderCESU8()
		{
			super(CESU8, 1, 6);
		}
		
		protected CoderResult decodeLoop(ByteBuffer in, CharBuffer out)
		{
			int pos = in.position();
			int byte1, byte2, byte3;
			try
			{
				while (pos < in.limit())
				{
					if (!out.hasRemaining()) return CoderResult.OVERFLOW;
					byte1 = in.get(pos) & 0xFF;
					if (byte1 < 128)
					{
						if (byte1 == 0) return CoderResult.unmappableForLength(1);
						out.put((char) byte1);
						pos++;
					}
					else
					{
						if ((byte1 & 0xE0) == 0xC0)
						{
							if (pos + 1 >= in.limit()) return CoderResult.UNDERFLOW;
							byte2 = in.get(pos + 1) & 0xFF;
							if ((byte2 & 0xC0) == 0x80)
							{
								out.put((char) ((byte1 & 0x1F) << 6 | byte2 & 0x3F));
								pos += 2;
							}
							else return CoderResult.unmappableForLength(2);
						}
						else if ((byte1 & 0xF0) == 0xE0)
						{
							if (pos + 2 >= in.limit()) return CoderResult.UNDERFLOW;
							byte2 = in.get(pos + 1) & 0xFF;
							byte3 = in.get(pos + 2) & 0xFF;
							if ((byte2 & 0xC0) == 0x80 && (byte3 & 0xC0) == 0x80)
							{
								out.put((char) ((byte1 & 0xF) << 12 | (byte2 & 0x3F) << 6 | byte3 & 0x3F));
								pos += 3;
							}
							else return CoderResult.unmappableForLength(3);
						}
						else return CoderResult.unmappableForLength(1);
					}
				}
				return CoderResult.UNDERFLOW;
			}
			finally
			{
				in.position(pos);
			}
		}
	}
	
	private class CharsetEncoderCESU8 extends CharsetEncoder
	{
		protected CharsetEncoderCESU8()
		{
			super(CESU8, 1, 6);
		}
		
		protected CoderResult encodeLoop(CharBuffer in, ByteBuffer out)
		{
			int pos = in.position();
			char c;
			try
			{
				while (pos < in.limit())
				{
					c = in.get(pos);
					if (c < 0x80 && c != 0)
					{
						if (out.remaining() > 0)
						{
							out.put((byte) c);
							pos++;
						}
						else return CoderResult.OVERFLOW;
					}
					else if (c < 0x800)
					{
						if (out.remaining() > 1)
						{
							out.put((byte) (0xC0 | c >> 6 & 0x1F));
							out.put((byte) (0x80 | c & 0x3F));
							pos++;
						}
						else return CoderResult.OVERFLOW;
					}
					else
					{
						if (out.remaining() > 2)
						{
							out.put((byte) (0xE0 | c >> 12 & 0xF));
							out.put((byte) (0x80 | c >> 6 & 0x3F));
							out.put((byte) (0x80 | c & 0x3F));
							pos++;
						}
						else return CoderResult.OVERFLOW;
					}
				}
				return CoderResult.UNDERFLOW;
			}
			finally
			{
				in.position(pos);
			}
		}
	}
}
