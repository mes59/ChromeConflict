package engine.data.json;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class JSONParser
{
	public static Charset cs = Charset.forName("UTF-8");
	
	public static Object parse(InputStream in) throws IOException
	{
		return parse(new InputStreamReader(in, cs));
	}
	
	public static Object parse(Reader in) throws IOException
	{
		String key = null;
		String value = null;
		CharBuffer word = CharBuffer.allocate(256);
		
		boolean inString = false;
		boolean atValue = true;
		boolean parsed = false;
		boolean wasWhite = false;
		
		Object root = null;
		Object current = null;
		ArrayList<Object> stack = new ArrayList<>();
		
		int index = -1, c;
		while (true)
		{
			index++;
			c = in.read();
			if (c == -1) throw new EOFException("near " + index);
			if (root != null && current == null)
			{
				if (Character.isWhitespace(c)) continue;
				throw new JSONFormatException(index, c);
			}
			
			if (inString)
			{
				if (c == '"')
				{
					word.flip();
					if (atValue) value = word.toString();
					else key = word.toString();
					word.clear();
					inString = false;
				}
				else if (c == '\\')
				{
					index++;
					int n = in.read();
					if (n == -1) throw new EOFException("near " + index);
					if (n == '\\') word = append(word, '\\');
					else if (n == 'b') word = append(word, '\b');
					else if (n == 't') word = append(word, '\t');
					else if (n == 'r') word = append(word, '\r');
					else if (n == 'n') word = append(word, '\n');
					else if (n == 'f') word = append(word, '\f');
					else if (n == 'u')
					{
						char[] buffer = new char[4];
						for (int off = 0; off < buffer.length;)
						{
							int read = in.read(buffer, off, buffer.length - off);
							if (read == -1) throw new EOFException("near " + index);
							off += read;
							index += read;
						}
						
						try
						{
							String sub = new String(buffer);
							word = append(word, (char) Integer.parseInt(sub, 16));
						}
						catch (NumberFormatException e)
						{
							throw new JSONFormatException(index - 1, c);
						}
					}
					else word = append(word, n);
				}
				else word = append(word, (char) c);
			}
			else
			{
				if (c == '"')
				{
					if (atValue)
					{
						if (value != null) throw new JSONFormatException(index, c);
					}
					else if (key != null) throw new JSONFormatException(index, c);
					inString = true;
				}
				else if (c == ':')
				{
					if (current == null) throw new JSONFormatException(index, c);
					if (atValue) throw new JSONFormatException(index, c);
					atValue = true;
				}
				else if (c == ',')
				{
					if (current == null) throw new JSONFormatException(index, c);
					if (!parsed)
					{
						if (!atValue) throw new JSONFormatException(index, c);
						atValue = current instanceof JSONArray;
						
						Object element;
						if (value != null)
						{
							element = value;
							value = null;
						}
						else
						{
							if (word.position() == 0) throw new JSONFormatException(index, c);
							word.flip();
							String str = word.toString();
							word.clear();
							if (str.equals("null")) element = null;
							else if (str.equals("true")) element = Boolean.TRUE;
							else if (str.equals("false")) element = Boolean.FALSE;
							else
							{
								try
								{
									element = Double.valueOf(str);
								}
								catch (NumberFormatException e)
								{
									throw new JSONFormatException(index, c);
								}
							}
						}
						
						if (key == null && current instanceof JSONArray)
						{
							((JSONArray) current).add(element);
						}
						else if (key != null && current instanceof JSONObject)
						{
							((JSONObject) current).put(key, element);
							key = null;
						}
						else throw new JSONFormatException(index, c);
					}
					else parsed = false;
				}
				else if (c == '{' || c == '[')
				{
					Object next;
					if (c == '{') next = new JSONObject();
					else next = new JSONArray();
					if (root == null)
					{
						root = next;
						current = next;
						stack.add(next);
					}
					else
					{
						if (key == null && current instanceof JSONArray)
						{
							((JSONArray) current).add(next);
							stack.add(next);
							current = next;
						}
						else if (key != null && current instanceof JSONObject)
						{
							((JSONObject) current).put(key, next);
							stack.add(next);
							current = next;
							key = null;
						}
						else throw new JSONFormatException(index, c);
					}
					
					atValue = current instanceof JSONArray;
					parsed = false;
					wasWhite = false;
				}
				else if (c == '}' || c == ']')
				{
					if (current == null || c == '}' != current instanceof JSONObject)
					{
						throw new JSONFormatException(index, c);
					}
					
					if (!parsed)
					{
						Object element = null;
						if (value != null)
						{
							element = value;
							value = null;
						}
						else
						{
							if (word.position() != 0)
							{
								word.flip();
								String str = word.toString();
								word.clear();
								if (str.equals("null")) element = Void.TYPE;
								else if (str.equals("true")) element = Boolean.TRUE;
								else if (str.equals("false")) element = Boolean.FALSE;
								else
								{
									try
									{
										element = Double.valueOf(str);
									}
									catch (NumberFormatException e)
									{
										throw new JSONFormatException(index, c);
									}
								}
							}
						}
						
						if (element != null)
						{
							if (element == Void.TYPE) element = null;
							if (key == null && current instanceof JSONArray)
							{
								((JSONArray) current).add(element);
							}
							else if (key != null && current instanceof JSONObject)
							{
								((JSONObject) current).put(key, element);
								key = null;
							}
							else throw new JSONFormatException(index, c);
						}
					}
					
					if (stack.size() > 1)
					{
						stack.remove(stack.size() - 1);
						current = stack.get(stack.size() - 1);
					}
					else return root;
					atValue = current instanceof JSONArray;
					parsed = true;
					wasWhite = false;
				}
				else
				{
					if (Character.isWhitespace(c))
					{
						if (word.position() != 0) wasWhite = true;
					}
					else
					{
						if (!atValue || value != null || wasWhite) throw new JSONFormatException(index, c);
						word = append(word, c);
					}
				}
			}
		}
	}
	
	private static CharBuffer append(CharBuffer buff, int c)
	{
		if (buff.remaining() == 0)
		{
			CharBuffer temp = CharBuffer.allocate(buff.capacity() * 2);
			temp.put((CharBuffer) buff.flip());
			buff = temp;
		}
		return buff.append((char) c);
	}
}
