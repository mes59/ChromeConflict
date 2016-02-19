package engine.net.irc;

public class IRCMessage
{
	public String prefix;
	public final IRCType type;
	protected final String[] fields;
	
	public IRCMessage(IRCType type)
	{
		this.type = type;
		fields = new String[type.fieldCount()];
	}
	
	public void setField(String name, String value)
	{
		int field = type.getField(name);
		if (field != -1)
		{
			if ((field & 1) == 0)
			{
				if (value.indexOf(' ') != -1) throw new IllegalArgumentException("field " + name + " does not allow spaces");
			}
			else if (value.startsWith(" ")) throw new IllegalArgumentException("value must not start with a space");
			fields[field >> 1] = value;
		}
	}
	
	public String getField(String name)
	{
		int field = type.getField(name);
		if (field == -1) return null;
		return fields[field >> 1];
	}
}
