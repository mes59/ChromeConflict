package engine.data.json;

import java.util.Enumeration;
import java.util.Vector;

public class JSONArray
{
	private Vector<Object> values;
	
	public JSONArray()
	{
		values = new Vector<>();
	}
	
	public JSONArray(int capacity)
	{
		values = new Vector<>(capacity);
	}
	
	public int size()
	{
		return values.size();
	}
	
	public boolean isEmpty()
	{
		return values.isEmpty();
	}
	
	public synchronized int getType(int idx)
	{
		if (idx < 0 || idx >= values.size()) return JSONUtils.TYPE_INVALID;
		return JSONUtils.getType(values.get(idx));
	}
	
	public synchronized boolean isNull(int idx)
	{
		return getType(idx) == JSONUtils.TYPE_NULL;
	}
	
	public synchronized boolean isBoolean(int idx)
	{
		return getType(idx) == JSONUtils.TYPE_BOOLEAN;
	}
	
	public synchronized boolean isNumber(int idx)
	{
		return getType(idx) == JSONUtils.TYPE_NUMBER;
	}
	
	public synchronized boolean isString(int idx)
	{
		return getType(idx) == JSONUtils.TYPE_STRING;
	}
	
	public synchronized boolean isArray(int idx)
	{
		return getType(idx) == JSONUtils.TYPE_ARRAY;
	}
	
	public synchronized boolean isObject(int idx)
	{
		return getType(idx) == JSONUtils.TYPE_OBJECT;
	}
	
	protected synchronized void add(Object value)
	{
		if (JSONUtils.getType(value) == JSONUtils.TYPE_INVALID)
		{
			throw new IllegalArgumentException("bad type");
		}
		values.add(value);
	}
	
	public synchronized void addBoolean(boolean value)
	{
		values.add(Boolean.valueOf(value));
	}
	
	public synchronized void addInt(int value)
	{
		values.add(Double.valueOf(value));
	}
	
	public synchronized void addBoolean(double value)
	{
		values.add(Double.valueOf(value));
	}
	
	public synchronized void insert(int idx, Object value)
	{
		if (idx < 0 || idx > values.size()) throw new IllegalArgumentException("index");
		if (JSONUtils.getType(value) == JSONUtils.TYPE_INVALID)
		{
			throw new IllegalArgumentException("bad type");
		}
		values.add(idx, value);
	}
	
	public synchronized void insertBoolean(int idx, boolean value)
	{
		if (idx < 0 || idx > values.size()) throw new IllegalArgumentException("index");
		values.add(idx, Boolean.valueOf(value));
	}
	
	public synchronized void insertInt(int idx, int value)
	{
		if (idx < 0 || idx > values.size()) throw new IllegalArgumentException("index");
		values.add(idx, Double.valueOf(value));
	}
	
	public synchronized void insertBoolean(int idx, double value)
	{
		if (idx < 0 || idx > values.size()) throw new IllegalArgumentException("index");
		values.add(idx, Double.valueOf(value));
	}
	
	public synchronized void set(int idx, Object value)
	{
		if (idx < 0 || idx >= values.size()) throw new IllegalArgumentException("index");
		if (JSONUtils.getType(value) == JSONUtils.TYPE_INVALID)
		{
			throw new IllegalArgumentException("bad type");
		}
		values.set(idx, value);
	}
	
	public synchronized void setBoolean(int idx, boolean value)
	{
		if (idx < 0 || idx >= values.size()) throw new IllegalArgumentException("index");
		values.set(idx, Boolean.valueOf(value));
	}
	
	public synchronized void setInt(int idx, int value)
	{
		if (idx < 0 || idx >= values.size()) throw new IllegalArgumentException("index");
		values.set(idx, Double.valueOf(value));
	}
	
	public synchronized void setBoolean(int idx, double value)
	{
		if (idx < 0 || idx >= values.size()) throw new IllegalArgumentException("index");
		values.set(idx, Double.valueOf(value));
	}
	
	protected synchronized Object get(int idx)
	{
		if (idx < 0 || idx >= values.size()) throw new IllegalArgumentException("index");
		return values.get(idx);
	}
	
	public synchronized boolean getBoolean(int idx)
	{
		return JSONUtils.asBoolean(get(idx));
	}
	
	public synchronized boolean getBoolean(int idx, boolean def)
	{
		return JSONUtils.asBoolean(get(idx), def);
	}
	
	public synchronized int getInt(int idx)
	{
		return JSONUtils.asInt(get(idx));
	}
	
	public synchronized int getInt(int idx, int def)
	{
		return JSONUtils.asInt(get(idx), def);
	}
	
	public synchronized double getDouble(int idx)
	{
		return JSONUtils.asDouble(get(idx));
	}
	
	public synchronized double getDouble(int idx, double def)
	{
		return JSONUtils.asDouble(get(idx), def);
	}
	
	public synchronized String getString(int idx)
	{
		return JSONUtils.asString(get(idx));
	}
	
	public synchronized String getString(int idx, String def)
	{
		return JSONUtils.asString(get(idx), def);
	}
	
	public synchronized JSONArray getArray(int idx)
	{
		return JSONUtils.asArray(get(idx));
	}
	
	public synchronized JSONObject getObject(int idx)
	{
		return JSONUtils.asObject(get(idx));
	}
	
	public synchronized Enumeration<Object> getValues()
	{
		return values.elements();
	}
	
	public synchronized Object remove(int idx)
	{
		return values.remove(idx);
	}
	
	public synchronized void clear()
	{
		values.clear();
	}
}
