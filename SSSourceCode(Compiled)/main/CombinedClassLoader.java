package main;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class CombinedClassLoader extends ClassLoader
{
	private final File root;
	private final JarFile jar;
	private final HashMap<String, Class<?>> classes;
	private byte[] buffer;
	
	public CombinedClassLoader(File root, JarFile jar)
	{
		this.root = root;
		this.jar = jar;
		classes = new HashMap<>();
		buffer = new byte[0];
	}
	
	protected Class<?> findClass(String name) throws ClassNotFoundException
	{
		Class<?> cls = classes.get(name);
		if (cls != null) return cls;
		String path = name.replace('.', '/') + ".class";
		File prefer = new File(root, path);
		JarEntry entry = jar.getJarEntry(path);
		int size;
		
		if (prefer.exists())
		{
			System.out.println("found " + name);
			size = (int) prefer.length();
			try
			{
				FileInputStream in = new FileInputStream(prefer);
				int pos = 0;
				while (pos < size)
				{
					int cnt = in.read(buffer, pos, size - pos);
					if (cnt == -1)
					{
						in.close();
						throw new EOFException();
					}
					pos += cnt;
				}
				in.close();
			}
			catch (IOException e)
			{
				throw new ClassNotFoundException("unable to load class", e);
			}
		}
		else if (entry != null)
		{
			if (entry.getSize() > buffer.length)
			{
				size = (int) entry.getSize();
				if ((size & 0x1FFF) != 0) size = (size | 0x1FFF) + 1;
				buffer = new byte[size];
			}
			size = (int) entry.getSize();
			try
			{
				InputStream in = jar.getInputStream(entry);
				int pos = 0;
				while (pos < size)
				{
					int cnt = in.read(buffer, pos, size - pos);
					if (cnt == -1) throw new EOFException();
					pos += cnt;
				}
			}
			catch (IOException e)
			{
				throw new ClassNotFoundException("unable to load class", e);
			}
		}
		else throw new ClassNotFoundException(name);
		cls = defineClass(name, buffer, 0, size, null);
		classes.put(name, cls);
		return cls;
	}
}
