package engine.data.config;

import java.io.PrintWriter;

abstract class ConfigElement
{
	protected String name;
	
	ConfigElement(String name)
	{
		this.name = name;
	}
	
	static ConfigElement parse(String line)
	{
		char type = line.charAt(0);
		if (line.charAt(1) == ':')
		{
			int idx = line.indexOf("=");
			String name = line.substring(2, idx);
			line = line.substring(idx + 1);
			
			switch (type)
			{
				case 'B':
					return ElementBoolean.parse(name, line);
				case 'I':
					return new ElementInteger(name, Integer.parseInt(line));
				case 'D':
					return new ElementDouble(name, Double.parseDouble(line));
				case 'S':
					return ElementString.parse(name, line);
				default:
					throw new IllegalArgumentException("bad type");
			}
		}
		else throw new IllegalArgumentException("bad format");
	}
	
	protected abstract void print(PrintWriter out);
}