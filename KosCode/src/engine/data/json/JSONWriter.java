package engine.data.json;

import static engine.data.json.JSONFormat.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import engine.util.Utils;

public class JSONWriter
{
	private static final Pattern p;
	private static char[] SPACES, TABS;
	private static final int SEP_DEL = SEP_DEL_SPACE | SEP_DEL_NEWLINE;
	
	private static final char[] NULL;
	private static final char[] TRUE;
	private static final char[] FALSE;
	static
	{
		p = Pattern.compile("(.*?)([\"\\\\\\u0000-\\u001F])");
		SPACES = new char[256];
		Arrays.fill(SPACES, ' ');
		TABS = new char[128];
		Arrays.fill(TABS, '\t');
		NULL = "null".toCharArray();
		TRUE = "true".toCharArray();
		FALSE = "false".toCharArray();
	}
	
	private static char[] getSpaces(int count)
	{
		while (SPACES.length < count)
		{
			char[] temp = new char[SPACES.length * 2];
			System.arraycopy(SPACES, 0, temp, 0, SPACES.length);
			System.arraycopy(SPACES, 0, temp, SPACES.length, SPACES.length);
			SPACES = temp;
		}
		return SPACES;
	}
	
	private static char[] getTabs(int count)
	{
		while (TABS.length < count)
		{
			char[] temp = new char[TABS.length * 2];
			System.arraycopy(TABS, 0, temp, 0, TABS.length);
			System.arraycopy(TABS, 0, temp, TABS.length, TABS.length);
			TABS = temp;
		}
		return TABS;
	}
	
	private BufferedWriter out;
	private JSONFormat format;
	
	public JSONWriter(Writer out, JSONFormat format)
	{
		if (out instanceof BufferedWriter)
		{
			this.out = (BufferedWriter) out;
		}
		else this.out = new BufferedWriter(out);
		this.format = format;
	}
	
	public BufferedWriter getWriter()
	{
		return out;
	}
	
	public void writeJSON(Object element, boolean newline) throws IOException
	{
		synchronized (format)
		{
			writeElement(SEP_DEL, SEP_DEL, element, 0);
			if (newline) out.newLine();
			out.flush();
		}
	}
	
	private void writeIndent(int count) throws IOException
	{
		if (count > 0 && format.indent > 1)
		{
			count *= format.indent >> 1;
			if ((format.indent & INDENT_TAB) != 0) out.write(getTabs(count), 0, count);
			else out.write(getSpaces(count), 0, count);
		}
	}
	
	private void writeSpacing(int before, int after, int count, boolean empty) throws IOException
	{
		int add = 0, del = 0, action;
		if (!empty || (before & CHK_EMPTY_SPACE) == 0)
		{
			if ((before & SEP_ADD_SPACE) != 0) add |= 1;
			else if ((before & SEP_DEL_SPACE) != 0) del |= 1;
		}
		
		if (!empty || (before & CHK_EMPTY_NEWLINE) == 0)
		{
			if ((before & SEP_ADD_NEWLINE) != 0) add |= 2;
			else if ((before & SEP_DEL_NEWLINE) != 0) del |= 2;
		}
		
		if (!empty || (after & CHK_EMPTY_SPACE) == 0)
		{
			if ((after & SEP_ADD_SPACE) != 0) add |= 1;
			else if ((after & SEP_DEL_SPACE) != 0) del |= 1;
		}
		
		if (!empty || (after & CHK_EMPTY_NEWLINE) == 0)
		{
			if ((after & SEP_ADD_NEWLINE) != 0) add |= 2;
			else if ((after & SEP_DEL_NEWLINE) != 0) del |= 2;
		}
		
		action = add & ~del;
		if ((action & 2) != 0)
		{
			out.newLine();
			writeIndent(count);
		}
		else if ((action & 1) != 0) out.write(' ');
	}
	
	private void writeElement(int before, int after, Object element, int count) throws IOException
	{
		int type = JSONUtils.getType(element);
		if (type == JSONUtils.TYPE_INVALID)
		{
			throw new IllegalArgumentException("");
		}
		else if (type == JSONUtils.TYPE_NULL)
		{
			writeSpacing(before, 0, count, false);
			out.write(NULL);
			writeSpacing(0, after, count - 1, false);
		}
		else if (type == JSONUtils.TYPE_BOOLEAN)
		{
			writeSpacing(before, 0, count, false);
			if (((Boolean) element).booleanValue()) out.write(TRUE);
			else out.write(FALSE);
			writeSpacing(0, after, count - 1, false);
		}
		else if (type == JSONUtils.TYPE_NUMBER)
		{
			writeSpacing(before, 0, count, false);
			double value = ((Number) element).doubleValue();
			if ((int) value == value) out.write(Integer.toString((int) value));
			else out.write(Double.toString(value));
			writeSpacing(0, after, count - 1, false);
		}
		else if (type == JSONUtils.TYPE_STRING)
		{
			writeSpacing(before, 0, count, false);
			writeString((String) element);
			writeSpacing(0, after, count - 1, false);
		}
		else if (type == JSONUtils.TYPE_ARRAY)
		{
			writeArray(before, after, (JSONArray) element, count);
		}
		else if (type == JSONUtils.TYPE_OBJECT)
		{
			writeObject(before, after, (JSONObject) element, count);
		}
		else throw new Error("unknown type: " + element.getClass());
	}
	
	private void writeString(String str) throws IOException
	{
		out.write('"');
		Matcher m = p.matcher(str);
		int pos = 0;
		while (m.find())
		{
			pos = m.end(2);
			m.group(2);
			out.write(str, m.start(1), m.end(1));
			out.write('\\');
			char c = str.charAt(m.start(2));
			if (c == '\\') out.write('\\');
			else if (c == '"') out.write('"');
			else if (c == '\t') out.write('t');
			else if (c == '\r') out.write('r');
			else if (c == '\n') out.write('n');
			else
			{
				out.write('u');
				int i = c & 0xFFFF;
				for (int p = 3; p >= 0; p--)
				{
					out.write(Utils.getHexChar(i >> p * 4 & 15));
				}
			}
		}
		if (pos < str.length())
		{
			out.write(str, pos, str.length() - pos);
		}
		out.write('"');
	}
	
	private void writeArray(int before, int after, JSONArray array, int count) throws IOException
	{
		synchronized (array)
		{
			int size = array.size();
			writeSpacing(before, format.props[CHAR_START_ARR], count, size == 0);
			out.write('[');
			before = format.props[6 + CHAR_START_ARR];
			if (size != 0)
			{
				Object element = array.get(0);
				for (int i = 0; i < size; i++)
				{
					int next = i == size - 1 ? format.props[CHAR_END_ARR] : format.props[CHAR_COMMA];
					writeElement(before, next, element, count + 1);
					if (i < size - 1)
					{
						out.write(',');
						element = array.get(i + 1);
						before = format.props[6 + CHAR_COMMA];
					}
				}
			}
			else writeSpacing(before, format.props[CHAR_END_ARR], count, true);
			out.write(']');
			writeSpacing(format.props[6 + CHAR_END_ARR], after, count - 1, size == 0);
		}
	}
	
	private void writeObject(int before, int after, JSONObject obj, int count) throws IOException
	{
		synchronized (obj)
		{
			String[] keys = obj.getKeys(new String[obj.size()]);
			int size = keys.length;
			writeSpacing(before, format.props[CHAR_START_OBJ], count, keys.length == 0);
			out.write('{');
			int next = 0;
			before = format.props[6 + CHAR_START_OBJ];
			if (size != 0)
			{
				String key = keys[0];
				Object element = obj.get(key);
				for (int i = 0; i < keys.length; i++)
				{
					writeSpacing(before, 0, count + 1, false);
					writeString(key);
					writeSpacing(0, format.props[CHAR_COLON], count + 1, false);
					out.write(':');
					before = format.props[6 + CHAR_COLON];
					next = i == size - 1 ? format.props[CHAR_END_OBJ] : format.props[CHAR_COMMA];
					writeElement(before, next, element, count + 1);
					if (i < keys.length - 1)
					{
						out.write(',');
						key = keys[i + 1];
						element = obj.get(key);
						before = format.props[6 + CHAR_COMMA];
					}
				}
			}
			else writeSpacing(before, format.props[CHAR_END_OBJ], count, keys.length == 0);
			out.write('}');
			writeSpacing(format.props[6 + CHAR_END_OBJ], after, count - 1, keys.length == 0);
		}
	}
}
