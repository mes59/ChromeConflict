package engine.data.xml;

public class XMLData implements XMLTag
{
	private String name;
	private String data;
	
	public XMLData(String name, String data)
	{
		this.name = name;
		this.data = data;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getData()
	{
		return data;
	}
	
	public String toString()
	{
		return "XMLData " + name + " with data " + data;
	}
}
