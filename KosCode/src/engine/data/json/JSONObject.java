package engine.data.json;

import java.util.NoSuchElementException;
import java.util.Vector;

public class JSONObject
{
	private Vector<String> keys;
	private Vector<Object> values;
	
	public JSONObject()
	{
		keys = new Vector<>();
		values = new Vector<>();
	}
	
	public JSONObject(int capacity)
	{
		keys = new Vector<>(capacity);
		values = new Vector<>(capacity);
	}
	
	public int size()
	{
		return keys.size();
	}
	
	public boolean isEmpty()
	{
		return keys.isEmpty();
	}
	
	public boolean contains(String key)
	{
		return keys.contains(key);
	}
	
	public int getType(String key)
	{
		int idx = keys.indexOf(key);
		if (idx == -1) return JSONUtils.TYPE_INVALID;
		return JSONUtils.getType(values.get(idx));
	}
	
	public boolean isNull(String key)
	{
		return getType(key) == JSONUtils.TYPE_NULL;
	}
	
	public boolean isBoolean(String key)
	{
		return getType(key) == JSONUtils.TYPE_BOOLEAN;
	}
	
	public boolean isNumber(String key)
	{
		return getType(key) == JSONUtils.TYPE_NUMBER;
	}
	
	public boolean isString(String key)
	{
		return getType(key) == JSONUtils.TYPE_STRING;
	}
	
	public boolean isArray(String key)
	{
		return getType(key) == JSONUtils.TYPE_ARRAY;
	}
	
	public boolean isObject(String key)
	{
		return getType(key) == JSONUtils.TYPE_OBJECT;
	}
	
	public synchronized void put(String key, Object value)
	{
		if (JSONUtils.getType(value) == JSONUtils.TYPE_INVALID)
		{
			throw new IllegalArgumentException("bad type");
		}
		int idx = keys.indexOf(key);
		if (idx == -1)
		{
			keys.add(key);
			values.add(value);
		}
		else values.set(idx, value);
	}
	
	public synchronized void putBoolean(String key, boolean value)
	{
		put(key, Boolean.valueOf(value));
	}
	
	public synchronized void putInt(String key, int value)
	{
		put(key, Double.valueOf(value));
	}
	
	public synchronized void putDouble(String key, double value)
	{
		put(key, Double.valueOf(value));
	}
	
	public synchronized Object get(String key)
	{
		int idx = keys.indexOf(key);
		if (idx == -1) throw new NoSuchElementException("for key " + key);
		return values.get(idx);
	}
	
	public synchronized boolean getBoolean(String key)
	{
		int idx = keys.indexOf(key);
		if (idx == -1) throw new NoSuchElementException("for key " + key);
		Object obj = values.get(idx);
		if (obj instanceof Boolean) return ((Boolean) obj).booleanValue();
		throw new NoSuchElementException("boolean " + key);
	}
	
	public synchronized boolean getBoolean(String key, boolean def)
	{
		int idx = keys.indexOf(key);
		if (idx == -1) return def;
		Object obj = values.get(idx);
		if (obj instanceof Boolean) return ((Boolean) obj).booleanValue();
		return def;
	}
	
	public synchronized int getInt(String key)
	{
		int idx = keys.indexOf(key);
		if (idx == -1) throw new NoSuchElementException("for key " + key);
		Object obj = values.get(idx);
		if (obj instanceof Number) return ((Number) obj).intValue();
		throw new NoSuchElementException("number " + key);
	}
	
	public synchronized int getInt(String key, int def)
	{
		int idx = keys.indexOf(key);
		if (idx == -1) return def;
		Object obj = values.get(idx);
		if (obj instanceof Number) return ((Number) obj).intValue();
		return def;
	}
	
	public synchronized double getDouble(String key)
	{
		int idx = keys.indexOf(key);
		if (idx == -1) throw new NoSuchElementException("for key " + key);
		Object obj = values.get(idx);
		if (obj instanceof Number) return ((Number) obj).doubleValue();
		throw new NoSuchElementException("number " + key);
	}
	
	public synchronized double getDouble(String key, double def)
	{
		int idx = keys.indexOf(key);
		if (idx == -1) return def;
		Object obj = values.get(idx);
		if (obj instanceof Number) return ((Number) obj).doubleValue();
		return def;
	}
	
	public synchronized String getString(String key)
	{
		int idx = keys.indexOf(key);
		if (idx == -1) throw new NoSuchElementException("for key " + key);
		Object obj = values.get(idx);
		if (obj instanceof String) return (String) obj;
		throw new NoSuchElementException("string " + key);
	}
	
	public synchronized String getString(String key, String def)
	{
		int idx = keys.indexOf(key);
		if (idx == -1) return def;
		Object obj = values.get(idx);
		if (obj instanceof String) return (String) obj;
		return def;
	}
	
	public synchronized JSONArray getArray(String key)
	{
		int idx = keys.indexOf(key);
		if (idx == -1) throw new NoSuchElementException("for key " + key);
		Object obj = values.get(idx);
		if (obj instanceof JSONArray) return (JSONArray) obj;
		throw new NoSuchElementException("array " + key);
	}
	
	public synchronized JSONObject getObject(String key)
	{
		int idx = keys.indexOf(key);
		if (idx == -1) throw new NoSuchElementException("for key " + key);
		Object obj = values.get(idx);
		if (obj instanceof JSONObject) return (JSONObject) obj;
		throw new NoSuchElementException("object " + key);
	}
	
	public synchronized Object remove(String key, boolean require)
	{
		int idx = keys.indexOf(key);
		if (idx == -1)
		{
			if (require) throw new NoSuchElementException("for key " + key);
			return null;
		}
		keys.remove(idx);
		return values.remove(idx);
	}
	
	public synchronized String[] getKeys(String[] array)
	{
		return keys.toArray(array);
	}
	
	public synchronized void clear()
	{
		keys.clear();
		values.clear();
	}
}
