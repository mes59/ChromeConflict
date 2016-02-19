package engine.data.config;

import java.io.PrintWriter;

class ElementInteger extends ConfigElement
{
	int value;
	
	ElementInteger(String name, int value)
	{
		super(name);
		this.value = value;
	}
	
	protected void print(PrintWriter out)
	{
		out.print("I:");
		out.print(name);
		out.print('=');
		out.println(value);
	}
}