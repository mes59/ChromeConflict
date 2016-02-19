package engine.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Paths;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

public class URLUtils
{
	public static String userAgent;
	static
	{
		StringBuilder build = new StringBuilder();
		build.append("JavaSE/").append(System.getProperty("java.version"));
		build.append(" (").append(System.getProperty("os.name"));
		build.append("; ").append(System.getProperty("os.version"));
		userAgent = build.append(')').toString();
	}
	
	/**
	 * converts a string into an url via the utf-8 encoder
	 * @param url url string {@link URL#URL(String)}
	 * @return a wrapped url or null if an exception was thrown
	 */
	public static URL createURL(String url)
	{
		try
		{
			return new URL(url);
		}
		catch (Exception e)
		{
			return null;
		}
	}
	
	/**
	 * tries to convert an url into a file
	 * @param url the url to convert
	 * @return the file this url points to
	 */
	public static File getFile(URL url)
	{
		try
		{
			return Paths.get(url.toURI()).toFile();
		}
		catch (Exception e)
		{
			return null;
		}
	}
	
	/**
	 * adds headers to the url to make it look less like a bot
	 * @param conn the connection to modify
	 */
	public static void addHeaders(URLConnection conn) throws IOException
	{
		conn.addRequestProperty("User-Agent", userAgent);
		conn.addRequestProperty("Accept-Language", "en-US,en;q=0.5");
		conn.addRequestProperty("Accept-Encoding", "gzip,deflate");
		conn.addRequestProperty("DNT", "1");
	}
	
	/**
	 * opens a connection to a url and adds the headers (see below) you should use this instead of the method in the URL class
	 * @param url the url to connect to
	 * @return the set up connection
	 */
	public static URLConnection openConnection(URL url) throws IOException
	{
		URLConnection conn = url.openConnection();
		addHeaders(conn);
		return conn;
	}
	
	/**
	 * gets the input stream from an url connection
	 * @param connection connection which supplies the stream
	 * @return connection.getInputStream() which may be wrapped in a decoder
	 */
	public static InputStream getInputStream(URLConnection connection) throws IOException
	{
		InputStream in = connection.getInputStream();
		String encoding = connection.getContentEncoding();
		if (encoding != null)
		{
			if (encoding.equals("deflate")) return new InflaterInputStream(in);
			else if (encoding.equals("gzip")) return new GZIPInputStream(in);
			else throw new IOException("unexpected encoding: " + encoding);
		}
		return in;
	}
	
	/**
	 * convenience method, directly returns a prepared stream
	 * @param url connection target
	 * @return input stream to that url
	 */
	public static InputStream openStream(URL url) throws IOException
	{
		return getInputStream(openConnection(url));
	}
}
