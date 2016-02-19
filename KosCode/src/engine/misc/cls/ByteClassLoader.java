package engine.misc.cls;

public class ByteClassLoader extends ClassLoader
{
	public ByteClassLoader()
	{
	}
	
	public ByteClassLoader(ClassLoader parent)
	{
		super(parent);
	}
	
	public Class<?> loadClass(byte[] b)
	{
		return defineClass(null, b, 0, b.length);
	}
	
	public Class<?> loadClass(String name, byte[] b)
	{
		return defineClass(name, b, 0, b.length);
	}
	
	public Class<?> loadClass(String name, byte[] b, int off, int len)
	{
		return defineClass(name, b, off, len);
	}
}