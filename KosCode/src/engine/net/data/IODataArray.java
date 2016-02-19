package engine.net.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import engine.util.IOUtils;

public class IODataArray extends IOData
{
	private Class<? extends IOData> type;
	private Vector<IOData> array;
	
	IODataArray()
	{
		array = new Vector<>();
	}
	
	public IODataArray(IOData... value)
	{
		array = new Vector<>(Arrays.asList(value));
	}
	
	public boolean isEmpty()
	{
		return array.isEmpty();
	}
	
	public int size()
	{
		return array.size();
	}
	
	public synchronized void add(IOData d)
	{
		if (d != null)
		{
			Class<? extends IOData> cls = d.getClass();
			if (type == null || cls == type)
			{
				if (type == null) type = cls;
				array.add(d);
			}
			else throw new IllegalArgumentException("bad type");
		}
		else array.add(null);
	}
	
	public synchronized void add(int index, IOData d)
	{
		if (d != null)
		{
			Class<? extends IOData> cls = d.getClass();
			if (type == null || cls == type)
			{
				if (type == null) type = cls;
				array.add(index, d);
			}
			else throw new IllegalArgumentException("bad type");
		}
		else array.add(index, null);
	}
	
	public synchronized IOData set(int index, IOData d)
	{
		if (d != null)
		{
			Class<? extends IOData> cls = d.getClass();
			if (type == null || cls == type)
			{
				if (type == null) type = cls;
				return array.set(index, d);
			}
			else throw new IllegalArgumentException("bad type");
		}
		else
		{
			d = array.set(index, d);
			for (IOData tmp : array)
			{
				if (tmp != null) return d;
			}
			type = null;
			return d;
		}
	}
	
	public boolean contains(IOData d)
	{
		if (type != null && type.isInstance(d))
		{
			return array.contains(d);
		}
		return false;
	}
	
	public IOData get(int index)
	{
		return array.get(index);
	}
	
	public int indexOf(IOData d)
	{
		if (type != null && type.isInstance(d))
		{
			return array.indexOf(d);
		}
		return -1;
	}
	
	public synchronized IOData remove(int index)
	{
		IOData d = array.remove(index);
		if (d != null && array.isEmpty()) type = null;
		return d;
	}
	
	public synchronized boolean remove(IOData d)
	{
		if (array.remove(d))
		{
			if (array.isEmpty()) type = null;
		}
		return false;
	}
	
	public synchronized void clear()
	{
		type = null;
		array.clear();
	}
	
	protected void writeData(OutputStream out, List<Class<? extends IOData>> classes) throws IOException
	{
		if (type != null)
		{
			int id = classes.indexOf(type);
			if (id == -1) throw new IOException("unregistered class");
			utils.writeByte(out, id);
			int size = array.size();
			utils.writeVarInt(out, size);
			int len = size / 8;
			if (size % 8 != 0) len++;
			byte[] idx = new byte[len];
			for (int i = 0; i < array.size(); i++)
			{
				if (array.get(i) == null) continue;
				idx[i / 8] = (byte) (idx[i / 8] | 1 << i % 8);
			}
			for (int i = 0; i < array.size(); i++)
			{
				array.get(i).writeData(out, classes);
			}
		}
		else
		{
			utils.writeByte(out, 255);
			utils.writeVarInt(out, array.size());
		}
	}
	
	protected void readData(InputStream in, List<Class<? extends IOData>> classes) throws IOException
	{
		int id = utils.readUByte(in);
		if (id == 255)
		{
			type = null;
			array.clear();
			int size = utils.readVarInt(in);
			array.ensureCapacity(size);
			for (int i = 0; i < size; i++)
			{
				array.add(null);
			}
		}
		else
		{
			if (id >= classes.size()) throw new IOException("invalid id");
			type = classes.get(id);
			array.clear();
			int size = utils.readVarInt(in);
			array.ensureCapacity(size);
			int len = size / 8;
			if (size % 8 != 0) len++;
			byte[] idx = IOUtils.readBytes(in, len);
			for (int i = 0; i < size; i++)
			{
				if ((idx[i / 8] >>> i % 8 & 1) != 0)
				{
					try
					{
						IOData data = type.newInstance();
						data.readData(in, classes);
						array.add(data);
					}
					catch (ReflectiveOperationException e)
					{
						throw new IOException("bad class table", e);
					}
				}
				else array.add(null);
			}
		}
	}
}
