package engine.data.xml;

public class XMLTagList implements XMLTag
{
	private String name;
	private XMLTag[] tags;
	
	public XMLTagList(String name, XMLTag... tags)
	{
		this.name = name;
		this.tags = tags;
	}
	
	public String getName()
	{
		return name;
	}
	
	public XMLTag[] getData()
	{
		return tags;
	}
	
	public XMLTag getTag(String name)
	{
		for (XMLTag tag : tags)
		{
			if (tag.getName().equals(name))
			{
				return tag;
			}
		}
		return null;
	}
	
	public String getTagData(String name)
	{
		XMLTag tag = getTag(name);
		if (tag == null) return null;
		if (tag instanceof XMLTagList) return null;
		return (String) tag.getData();
	}
	
	public String toString()
	{
		return "XMLTagList " + name + " with " + tags.length + " tags";
	}
}
