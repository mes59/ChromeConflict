package engine.data.config;

import java.io.PrintWriter;

class ElementBoolean extends ConfigElement
{
	boolean value;
	
	ElementBoolean(String name, boolean value)
	{
		super(name);
		this.value = value;
	}
	
	static ElementBoolean parse(String name, String line)
	{
		if ("false".equals(line)) return new ElementBoolean(name, false);
		else if ("true".equals(line)) return new ElementBoolean(name, true);
		else throw new IllegalArgumentException("not a boolean");
	}
	
	protected void print(PrintWriter out)
	{
		out.print("B:");
		out.print(name);
		out.print('=');
		out.println(value);
	}
}