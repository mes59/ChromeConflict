package engine.data.config;

import java.io.PrintWriter;

class ElementString extends ConfigElement
{
	String value;
	
	ElementString(String name, String value)
	{
		super(name);
		this.value = value;
	}
	
	static ElementString parse(String name, String line)
	{
		if (line.length() > 0 && line.charAt(0) == '"')
		{
			int idx = 1;
			while (true)
			{
				int end = line.indexOf('"', idx);
				if (end == -1)
				{
					idx = line.length() - 1;
					break;
				}
				if (line.charAt(end - 1) != '\\')
				{
					idx = end;
					break;
				}
				idx = end + 1;
			}
			return new ElementString(name, line.substring(1, idx));
		}
		else throw new IllegalArgumentException("bad format");
	}
	
	protected void print(PrintWriter out)
	{
		out.print("S:");
		out.print(name);
		out.print("=\"");
		out.print(value);
		out.println('"');
	}
}