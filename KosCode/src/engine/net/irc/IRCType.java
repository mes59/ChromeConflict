package engine.net.irc;

public enum IRCType
{
	PASS(false);
	
	public final boolean lastSpace;
	protected final String[] fields;
	
	private IRCType(boolean lastSpace, String... fields)
	{
		this.lastSpace = lastSpace;
		this.fields = fields;
	}
	
	public static IRCType get(String name)
	{
		if (name == null) return null;
		for (IRCType curr : values())
		{
			if (curr.name().equals(name)) return curr;
		}
		return null;
	}
	
	public int fieldCount()
	{
		return fields.length;
	}
	
	public int getField(String name)
	{
		for (int i = 0; i < fields.length; i++)
		{
			if (fields[i].equals(name)) return i;
		}
		return -1;
	}
}
