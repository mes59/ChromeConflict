package engine.data.json;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

public class JSONUtils
{
	public static final int TYPE_INVALID = -1;
	public static final int TYPE_NULL = 0;
	public static final int TYPE_BOOLEAN = 1;
	public static final int TYPE_NUMBER = 2;
	public static final int TYPE_STRING = 3;
	public static final int TYPE_ARRAY = 4;
	public static final int TYPE_OBJECT = 5;
	
	public static int getType(Object value)
	{
		if (value == null) return TYPE_NULL;
		if (value instanceof Boolean) return TYPE_BOOLEAN;
		if (value instanceof Double) return TYPE_NUMBER;
		if (value instanceof String) return TYPE_STRING;
		if (value instanceof JSONArray) return TYPE_ARRAY;
		if (value instanceof JSONObject) return TYPE_OBJECT;
		return TYPE_INVALID;
	}
	
	public static boolean asBoolean(Object value)
	{
		if (value == null) throw new NullPointerException("value is null");
		if (value instanceof Boolean)
		{
			return ((Boolean) value).booleanValue();
		}
		throw new IllegalArgumentException("not a boolean");
	}
	
	public static boolean asBoolean(Object value, boolean def)
	{
		if (value == null) return def;
		if (value instanceof Boolean)
		{
			return ((Boolean) value).booleanValue();
		}
		throw new IllegalArgumentException("not a boolean");
	}
	
	public static int asInt(Object value)
	{
		if (value instanceof Double)
		{
			return ((Double) value).intValue();
		}
		throw new IllegalArgumentException("not a number");
	}
	
	public static int asInt(Object value, int def)
	{
		if (value instanceof Double)
		{
			return ((Double) value).intValue();
		}
		return def;
	}
	
	public static double asDouble(Object value)
	{
		if (value instanceof Double)
		{
			return ((Double) value).doubleValue();
		}
		throw new IllegalArgumentException("not a number");
	}
	
	public static double asDouble(Object value, double def)
	{
		if (value instanceof Double)
		{
			return ((Double) value).doubleValue();
		}
		return def;
	}
	
	public static String asString(Object value)
	{
		if (value instanceof String)
		{
			return (String) value;
		}
		throw new IllegalArgumentException("not a string");
	}
	
	public static String asString(Object value, String def)
	{
		if (value instanceof String)
		{
			return (String) value;
		}
		return def;
	}
	
	public static JSONArray asArray(Object value)
	{
		if (value instanceof JSONArray)
		{
			return (JSONArray) value;
		}
		throw new IllegalArgumentException("not an array");
	}
	
	public static JSONObject asObject(Object value)
	{
		if (value instanceof JSONObject)
		{
			return (JSONObject) value;
		}
		throw new IllegalArgumentException("not an object");
	}
	
	public static void write(Object obj, OutputStream out, boolean newline) throws IOException
	{
		int type = getType(obj);
		if (type == TYPE_INVALID) throw new IllegalArgumentException("invalid type");
		else if (type >= 0 && type <= 5) write(obj, new OutputStreamWriter(out), JSONFormat.DEFAULT, newline);
		else throw new Error("internal");
	}
	
	public static void write(Object obj, Writer out, boolean newline) throws IOException
	{
		write(obj, out, JSONFormat.DEFAULT, newline);
	}
	
	public static void write(Object obj, Writer out, JSONFormat format, boolean newline) throws IOException
	{
		new JSONWriter(out, format).writeJSON(obj, newline);
		out.flush();
	}
	
	public static String serialize(Object obj, boolean newline)
	{
		return serialize(obj, JSONFormat.DEFAULT, newline);
	}
	
	public static String serialize(Object obj, JSONFormat format, boolean newline)
	{
		try
		{
			StringWriter out = new StringWriter(128);
			write(obj, out, format, newline);
			return out.toString();
		}
		catch (IOException e)
		{
			throw new Error("unexpected exception", e);
		}
	}
}
