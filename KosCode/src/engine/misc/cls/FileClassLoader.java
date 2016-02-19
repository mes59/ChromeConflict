package engine.misc.cls;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import engine.util.IOUtils;

public class FileClassLoader extends ClassLoader
{
	public FileClassLoader()
	{
	}
	
	public FileClassLoader(ClassLoader parent)
	{
		super(parent);
	}
	
	private byte[] readFile(File file) throws IOException
	{
		if (file.length() < Integer.MAX_VALUE)
		{
			byte[] b = new byte[(int) file.length()];
			FileInputStream in = new FileInputStream(file);
			IOUtils.readFully(in, b);
			in.close();
			return b;
		}
		else throw new IOException("file too large");
	}
	
	public Class<?> loadClass(File file) throws IOException
	{
		byte[] b = readFile(file);
		return defineClass(null, b, 0, b.length);
	}
	
	public Class<?> loadClass(String name, File file) throws IOException
	{
		byte[] b = readFile(file);
		return defineClass(name, b, 0, b.length);
	}
}
