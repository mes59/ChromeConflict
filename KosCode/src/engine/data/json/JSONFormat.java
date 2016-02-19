package engine.data.json;

public class JSONFormat
{
	public static final int INDENT_SPACE = 0;
	public static final int INDENT_TAB = 1;
	
	public static final int CHAR_START_OBJ = 0;
	public static final int CHAR_END_OBJ = 1;
	public static final int CHAR_START_ARR = 2;
	public static final int CHAR_END_ARR = 3;
	public static final int CHAR_COLON = 4;
	public static final int CHAR_COMMA = 5;
	
	public static final int SEP_ADD_SPACE = 1;
	public static final int SEP_DEL_SPACE = 2;
	public static final int CHK_EMPTY_SPACE = 4;
	public static final int SEP_ADD_NEWLINE = 8;
	public static final int SEP_DEL_NEWLINE = 16;
	public static final int CHK_EMPTY_NEWLINE = 32;
	
	static final int SEP_SPACE = SEP_ADD_SPACE | SEP_DEL_SPACE;
	static final int SEP_NEWLINE = SEP_ADD_NEWLINE | SEP_DEL_NEWLINE;
	
	public static final JSONFormat SMALLEST, COMPACT, DEFAULT, FLOWING;
	static
	{
		SMALLEST = new JSONFormat();
		
		COMPACT = new JSONFormat();
		COMPACT.setPolicy(CHAR_START_OBJ, SEP_ADD_SPACE, 0);
		COMPACT.setPolicy(CHAR_START_ARR, SEP_ADD_SPACE, 0);
		COMPACT.setPolicy(CHAR_COLON, 0, SEP_ADD_SPACE);
		COMPACT.setPolicy(CHAR_COMMA, 0, SEP_ADD_SPACE);
		
		DEFAULT = new JSONFormat();
		DEFAULT.setIndentation(INDENT_SPACE, 2);
		DEFAULT.setPolicy(CHAR_START_OBJ, 0, SEP_ADD_NEWLINE | CHK_EMPTY_NEWLINE);
		DEFAULT.setPolicy(CHAR_END_OBJ, SEP_ADD_NEWLINE | CHK_EMPTY_NEWLINE, 0);
		DEFAULT.setPolicy(CHAR_START_ARR, 0, SEP_ADD_NEWLINE | CHK_EMPTY_NEWLINE);
		DEFAULT.setPolicy(CHAR_END_ARR, SEP_ADD_NEWLINE | CHK_EMPTY_NEWLINE, 0);
		DEFAULT.setPolicy(CHAR_COLON, 0, SEP_ADD_SPACE);
		DEFAULT.setPolicy(CHAR_COMMA, 0, SEP_ADD_NEWLINE);
		
		FLOWING = new JSONFormat();
		FLOWING.setIndentation(INDENT_TAB, 1);
		int start = SEP_DEL_SPACE | CHK_EMPTY_SPACE | SEP_ADD_NEWLINE;
		FLOWING.setPolicy(CHAR_START_OBJ, start, SEP_ADD_NEWLINE | CHK_EMPTY_NEWLINE);
		FLOWING.setPolicy(CHAR_END_OBJ, SEP_ADD_NEWLINE, 0);
		FLOWING.setPolicy(CHAR_START_ARR, start, SEP_ADD_NEWLINE | CHK_EMPTY_NEWLINE);
		FLOWING.setPolicy(CHAR_END_ARR, SEP_ADD_NEWLINE, 0);
		FLOWING.setPolicy(CHAR_COLON, 0, SEP_ADD_SPACE);
		FLOWING.setPolicy(CHAR_COMMA, 0, SEP_ADD_NEWLINE);
	}
	
	protected int indent;
	protected int[] props;
	
	public JSONFormat()
	{
		props = new int[12];
	}
	
	public synchronized void setIndentation(int type, int count)
	{
		if (type < 0 || type > 1) throw new IllegalArgumentException("type");
		if (count < 0 || count > 128) throw new IllegalArgumentException("count");
		indent = type | count << 1;
	}
	
	public int getIndentationType()
	{
		return indent & 1;
	}
	
	public int getIndentationCount()
	{
		return indent >> 1;
	}
	
	public void setPolicy(int ch, int before, int after)
	{
		if (ch < 0 || ch > 5) throw new IllegalArgumentException("char");
		if (before == -1) before = props[ch];
		if (after == -1) after = props[6 + ch];
		if (before < 0 || before > 63) throw new IllegalArgumentException("value");
		props[ch] = before;
		props[6 + ch] = after;
	}
	
	public int getPolicy(int ch, boolean before)
	{
		if (ch < 0 || ch > 5) throw new IllegalArgumentException("char");
		if (before) return props[ch];
		return props[6 + ch];
	}
}
