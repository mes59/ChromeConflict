package main;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import engine.data.json.JSONObject;
import engine.math.Rect2;
import engine.math.vec.Vec2;
import engine.util.IOUtils;

public class CCUtils
{
	public static final IOUtils utils = IOUtils.BIG_ENDIAN;
	
	public static boolean hasCommand(String[] args, String name)
	{
		if (args == null || name == null) return false;
		for (int i = 0; i < args.length; i++)
		{
			String curr = args[i];
			if (curr != null && curr.equals(name))
			{
				return true;
			}
		}
		return false;
	}
	
	public static String getArgument(String[] args, String name)
	{
		if (args == null || name == null) return null;
		if (name.indexOf('=') != -1) throw new IllegalArgumentException("invalid name");
		for (String arg : args)
		{
			if (arg == null || arg.length() < name.length() + 2) continue;
			if (arg.startsWith(name) && arg.charAt(name.length()) == '=')
			{
				return arg.substring(name.length() + 1);
			}
		}
		return null;
	}
	
	public static int getArgInt(String[] args, String key, int def)
	{
		try
		{
			String value = getArgument(args, key);
			if (value == null) return def;
			return Integer.parseInt(value);
		}
		catch (NumberFormatException e)
		{
			return def;
		}
	}
	
	public static float getArgFloat(String[] args, String key, float def)
	{
		try
		{
			String value = getArgument(args, key);
			if (value == null) return def;
			return Float.parseFloat(value);
		}
		catch (NumberFormatException e)
		{
			return def;
		}
	}
	
	public static boolean getOrAddBoolean(JSONObject obj, String key, boolean value)
	{
		if (!obj.isBoolean(key))
		{
			obj.putBoolean(key, value);
			return value;
		}
		return obj.getBoolean(key);
	}
	
	public static int getOrAddInt(JSONObject obj, String key, int value)
	{
		if (!obj.isNumber(key))
		{
			obj.putInt(key, value);
			return value;
		}
		return obj.getInt(key);
	}
	
	public static double getOrAddDouble(JSONObject obj, String key, double value)
	{
		if (!obj.isNumber(key))
		{
			obj.putDouble(key, value);
			return value;
		}
		return obj.getDouble(key);
	}
	
	public static String getOrAddString(JSONObject obj, String key, String value)
	{
		if (!obj.isString(key))
		{
			obj.put(key, value);
			return value;
		}
		return obj.getString(key);
	}
	
	public static void writeVector(OutputStream out, Vec2 vec) throws IOException
	{
		utils.writeDouble(out, vec.x());
		utils.writeDouble(out, vec.y());
	}
	
	public static Vec2 readVector(InputStream in) throws IOException
	{
		double x, y;
		x = utils.readDouble(in);
		y = utils.readDouble(in);
		return new Vec2(x, y);
	}
	
	public static void writeBounds(OutputStream out, Rect2 bounds) throws IOException
	{
		utils.writeDouble(out, bounds.pos.x());
		utils.writeDouble(out, bounds.pos.y());
		utils.writeDouble(out, bounds.size.x());
		utils.writeDouble(out, bounds.size.y());
	}
	
	public static Rect2 readBounds(InputStream in) throws IOException
	{
		double x1, y1, x2, y2;
		x1 = utils.readDouble(in);
		y1 = utils.readDouble(in);
		x2 = utils.readDouble(in);
		y2 = utils.readDouble(in);
		return new Rect2(x1, y1, x2, y2);
	}
}
