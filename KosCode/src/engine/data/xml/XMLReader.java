package engine.data.xml;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLReader
{
	public static XMLTagList read(URL url) throws IOException
	{
		Node main = getDoc(url).getFirstChild();
		return (XMLTagList) reformat(main);
	}
	
	private static XMLTag reformat(Node node)
	{
		ArrayList<XMLTag> tags = new ArrayList<>();
		NodeList list = node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++)
		{
			Node curr = list.item(i);
			if (curr.getNodeType() == Node.ELEMENT_NODE)
			{
				tags.add(reformat(curr));
			}
		}
		
		NamedNodeMap map = node.getAttributes();
		if (map != null)
		{
			for (int i = 0; i < map.getLength(); i++)
			{
				Node curr = map.item(i);
				tags.add(new XMLData(curr.getNodeName(), curr.getNodeValue()));
			}
		}
		
		String text = node.getTextContent();
		if (tags.size() == 0)
		{
			if (text != null) return new XMLData(node.getNodeName(), text);
			else return null;
		}
		if (tags.size() == 1) return tags.get(0);
		XMLTag[] contents = tags.toArray(new XMLTag[0]);
		return new XMLTagList(node.getNodeName(), contents);
	}
	
	private static Document getDoc(URL url) throws IOException
	{
		try
		{
			InputStream stream = url.openStream();
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(stream);
			stream.close();
			return doc;
		}
		catch (SAXException e)
		{
			throw new IOException(e);
		}
		catch (ParserConfigurationException e)
		{
			throw new Error("no XML parser found", e);
		}
	}
}
