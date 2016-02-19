package engine.tokens;

public class TokenResult
{
	public static final int TYPE_STRING = 1;
	public static final int TYPE_SEPARATOR = 2;
	public static final int TYPE_SEQ_START = 3;
	public static final int TYPE_SEQUENCE = 4;
	public static final int TYPE_SEQ_END = 5;
	
	public final int type;
	public final String data;
	
	public TokenResult(int type, String data)
	{
		if (type < 1 || type > 5) throw new IllegalArgumentException("type");
		if (data == null) throw new NullPointerException("data");
		this.type = type;
		this.data = data;
	}
	
	public String toString()
	{
		return data;
	}
}
