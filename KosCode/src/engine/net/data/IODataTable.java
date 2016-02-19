package engine.net.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class IODataTable extends IOData
{
	private Vector<String> keys;
	private Vector<IOData> values;
	
	public IODataTable()
	{
		keys = new Vector<>();
		values = new Vector<>();
	}
	
	public boolean isEmpty()
	{
		return keys.isEmpty();
	}
	
	public int size()
	{
		return keys.size();
	}
	
	public Collection<String> keys()
	{
		return Collections.unmodifiableCollection(keys);
	}
	
	public synchronized IOData put(String key, IOData d)
	{
		if (key == null) throw new IllegalArgumentException("null key");
		int idx = keys.indexOf(key);
		if (idx == -1)
		{
			keys.add(key);
			values.add(d);
			return null;
		}
		else return values.set(idx, d);
	}
	
	public boolean contains(String key)
	{
		if (key == null) return false;
		return keys.contains(key);
	}
	
	public Class<? extends IOData> getType(String key)
	{
		int idx = keys.indexOf(key);
		if (idx == -1) return null;
		IOData d = values.get(idx);
		if (d == null) return null;
		return d.getClass();
	}
	
	public IOData get(String key)
	{
		if (key == null) return null;
		int idx = keys.indexOf(key);
		if (idx == -1) return null;
		return values.get(idx);
	}
	
	public synchronized IOData pop(String key)
	{
		if (key == null) return null;
		int idx = keys.indexOf(key);
		if (idx == -1) return null;
		keys.remove(idx);
		return values.remove(idx);
	}
	
	public synchronized void clear()
	{
		keys.clear();
		values.clear();
	}
	
	protected void writeData(OutputStream out, List<Class<? extends IOData>> classes) throws IOException
	{
		utils.writeVarInt(out, keys.size());
		for (int i = 0; i < keys.size(); i++)
		{
			utils.writeString(out, keys.get(i), -1);
			IOData.write(out, values.get(i), classes);
		}
	}
	
	protected void readData(InputStream in, List<Class<? extends IOData>> classes) throws IOException
	{
		int size = utils.readVarInt(in);
		keys.clear();
		values.clear();
		keys.ensureCapacity(size);
		values.ensureCapacity(size);
		for (int i = 0; i < size; i++)
		{
			String key = utils.readString(in, -1);
			if (key == null) break;
			IOData d = IOData.read(in, classes);
			keys.add(key);
			values.add(d);
		}
	}
}
