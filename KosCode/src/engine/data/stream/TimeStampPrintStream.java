package engine.data.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampPrintStream extends PrintStream
{
	protected static final SimpleDateFormat format = new SimpleDateFormat("[HH:mm:ss]");
	protected final Date date;
	
	public TimeStampPrintStream(File file) throws FileNotFoundException
	{
		super(file);
		date = new Date(0);
	}
	
	public void print(String str)
	{
		date.setTime(System.currentTimeMillis());
		str = format.format(date) + str;
		super.print(str);
	}
	
	public void print(boolean b)
	{
		print(Boolean.toString(b));
	}
	
	public void print(char c)
	{
		print(Character.toString(c));
	}
	
	public void print(int i)
	{
		print(Integer.toString(i));
	}
	
	public void print(long l)
	{
		print(Long.toString(l));
	}
	
	public void print(float f)
	{
		print(Float.toString(f));
	}
	
	public void print(double d)
	{
		print(Double.toString(d));
	}
	
	public void print(char[] c)
	{
		print(new String(c));
	}
	
	public void print(Object o)
	{
		print(o.toString());
	}
}
