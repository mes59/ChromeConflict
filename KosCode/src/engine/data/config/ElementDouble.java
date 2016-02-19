package engine.data.config;

import java.io.PrintWriter;

class ElementDouble extends ConfigElement
{
	double value;
	
	ElementDouble(String name, double value)
	{
		super(name);
		this.value = value;
	}
	
	protected void print(PrintWriter out)
	{
		out.print("D:");
		out.print(name);
		out.print('=');
		out.println(value);
	}
}