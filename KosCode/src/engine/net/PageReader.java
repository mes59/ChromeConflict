package engine.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import engine.util.IOUtils;
import engine.util.Utils;

public class PageReader
{
	public String protocol;
	public String host;
	public String file;
	
	public String address;
	public String contents;
	
	public PageReader(URL target) throws IOException
	{
		protocol = target.getProtocol();
		host = target.getHost();
		file = target.getFile();
		address = target.toString();
		
		InputStream in = target.openStream();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		IOUtils.transfer(in, out, 8 * 1024);
		in.close();
		contents = Utils.getString(out.toByteArray());
	}
	
	public static String read(URL target) throws IOException
	{
		InputStream in = target.openStream();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		IOUtils.transfer(in, out, 8 * 1024);
		in.close();
		return out.toString(Utils.getCharset().name());
	}
}
