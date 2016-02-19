package engine.net.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import engine.util.IOUtils;

public abstract class IOData
{
	protected static final IOUtils utils = IOUtils.BIG_ENDIAN;
	private static final Vector<Class<? extends IOData>> classes;
	private static final List<Class<? extends IOData>> view;
	static
	{
		classes = new Vector<>();
		classes.add(IODataBool.class);
		classes.add(IODataByte.class);
		classes.add(IODataUByte.class);
		classes.add(IODataShort.class);
		classes.add(IODataUShort.class);
		classes.add(IODataInt.class);
		classes.add(IODataLong.class);
		classes.add(IODataFloat.class);
		classes.add(IODataDouble.class);
		
		classes.add(IODataByteArr.class);
		classes.add(IODataString.class);
		classes.add(IODataArray.class);
		classes.add(IODataTable.class);
		view = Collections.unmodifiableList(classes);
	}
	
	public static List<Class<? extends IOData>> getTypes()
	{
		return view;
	}
	
	public static List<Class<? extends IOData>> copyTypes()
	{
		return new Vector<>(classes);
	}
	
	public static <T extends IOData> T expect(IOData d, Class<T> cls)
	{
		if (d == null) return null;
		if (d.getClass() == cls)
		{
			try
			{
				return cls.cast(d);
			}
			catch (ClassCastException e)
			{
				throw new Error("invalid VM", e);
			}
		}
		else throw new RuntimeException("expected " + cls.getSimpleName() + " but got " + d.getClass().getSimpleName());
	}
	
	protected IOData()
	{
	}
	
	protected abstract void writeData(OutputStream out, List<Class<? extends IOData>> classes) throws IOException;
	
	protected abstract void readData(InputStream in, List<Class<? extends IOData>> classes) throws IOException;
	
	public static void write(OutputStream out, IOData data, boolean header) throws IOException
	{
		write(out, data, classes, header);
	}
	
	public static void write(OutputStream out, IOData data, List<Class<? extends IOData>> classes, boolean header) throws IOException
	{
		if (header)
		{
			utils.writeByte(out, classes.size());
			for (Class<?> cls : classes)
			{
				utils.writeString(out, cls.getName(), -1);
			}
		}
		write(out, data, classes);
	}
	
	protected static void write(OutputStream out, IOData data, List<Class<? extends IOData>> classes) throws IOException
	{
		if (data != null)
		{
			int id = classes.indexOf(data.getClass());
			if (id == -1) throw new IOException("unregistered class");
			utils.writeByte(out, id);
			data.writeData(out, classes);
		}
		else utils.writeByte(out, 255);
	}
	
	private static List<Class<? extends IOData>> readHeader(InputStream in) throws IOException
	{
		List<Class<? extends IOData>> classes = new Vector<>();
		int size = utils.readUByte(in);
		if (size == 255) throw new IOException("class table too large");
		for (int i = 0; i < size; i++)
		{
			String name = utils.readString(in, -1);
			try
			{
				Class<?> cls = Class.forName(name);
				if (cls.isArray()) throw new IOException("bad class (array)");
				classes.add(cls.asSubclass(IOData.class));
			}
			catch (ClassCastException e)
			{
				throw new IOException("not a subclass", e);
			}
			catch (ClassNotFoundException e)
			{
				throw new IOException("unknown class", e);
			}
		}
		return classes;
	}
	
	public static <T extends IOData> T readSpecific(InputStream in, Class<T> cls, boolean header) throws IOException
	{
		int expected = -1;
		List<Class<? extends IOData>> classes = IOData.classes;
		if (header)
		{
			classes = readHeader(in);
			if (classes.contains(cls))
			{
				expected = cls == null ? 255 : classes.indexOf(cls);
			}
			else throw new IOException("header did not contain class");
		}
		else expected = cls == null ? 255 : classes.indexOf(cls);
		
		int id = utils.readUByte(in);
		if (id != expected) throw new IOException("unexpected type");
		if (id == 255) return null;
		try
		{
			T data = cls.newInstance();
			data.readData(in, classes);
			return data;
		}
		catch (ReflectiveOperationException e)
		{
			throw new IOException("bad class table", e);
		}
	}
	
	public static IOData read(InputStream in, boolean header) throws IOException
	{
		if (header)
		{
			List<Class<? extends IOData>> classes = readHeader(in);
			return read(in, classes);
		}
		else return read(in, classes);
	}
	
	public static IOData read(InputStream in, List<Class<? extends IOData>> classes) throws IOException
	{
		int id = utils.readUByte(in);
		if (id == 255) return null;
		if (id >= classes.size()) throw new IOException("invalid id");
		Class<? extends IOData> cls = classes.get(id);
		try
		{
			IOData data = cls.newInstance();
			data.readData(in, classes);
			return data;
		}
		catch (ReflectiveOperationException e)
		{
			throw new IOException("bad class table", e);
		}
	}
}
