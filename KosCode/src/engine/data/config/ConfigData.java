package engine.data.config;

import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Vector;

import engine.util.Utils;

public class ConfigData implements IConfigurable
{
	public final String name;
	final Vector<ConfigData> subdirs;
	final Vector<ConfigElement> elements;
	
	public ConfigData(String name)
	{
		this.name = name;
		subdirs = new Vector<>();
		elements = new Vector<>();
	}
	
	void write(PrintWriter out, int depth)
	{
		if (depth > 0) out.print(Utils.mulChar('\t', depth));
		out.print('@');
		out.println(name);
		String tab = Utils.mulChar('\t', depth + 1);
		synchronized (elements)
		{
			for (ConfigElement element : elements)
			{
				out.print(tab);
				element.print(out);
			}
		}
		
		synchronized (subdirs)
		{
			for (ConfigData subdir : subdirs)
			{
				if (!elements.isEmpty()) out.println(tab);
				subdir.write(out, depth + 1);
			}
			if (depth > 0) out.print(Utils.mulChar('\t', depth));
		}
		out.print('#');
		out.println(name);
	}
	
	public int getSubDirCount()
	{
		return subdirs.size();
	}
	
	public IConfigurable addSubDir(String name)
	{
		if (name == null) throw new NullPointerException("name");
		synchronized (subdirs)
		{
			for (int i = 0; i < subdirs.size(); i++)
			{
				if (subdirs.get(i).name.equals(name)) return subdirs.get(i);
			}
			ConfigData sub = new ConfigData(name);
			subdirs.add(sub);
			return sub;
		}
	}
	
	public IConfigurable getSubDir(String name)
	{
		if (name == null) return null;
		synchronized (subdirs)
		{
			for (int i = 0; i < subdirs.size(); i++)
			{
				if (subdirs.get(i).name.equals(name)) return subdirs.get(i);
			}
			return null;
		}
	}
	
	public IConfigurable removeSubDir(String name)
	{
		if (name == null) return null;
		synchronized (subdirs)
		{
			for (int i = 0; i < subdirs.size(); i++)
			{
				if (subdirs.get(i).name.equals(name)) return subdirs.remove(i);
			}
			return null;
		}
	}
	
	public int getElementCount()
	{
		return elements.size();
	}
	
	public void addBool(String name, boolean value)
	{
		if (name == null) throw new NullPointerException();
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementBoolean)
					{
						((ElementBoolean) e).value = value;
					}
					else elements.set(i, new ElementBoolean(name, value));
					return;
				}
			}
			elements.add(new ElementBoolean(name, value));
		}
	}
	
	public void addInt(String name, int value)
	{
		if (name == null) throw new NullPointerException();
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementInteger)
					{
						((ElementInteger) e).value = value;
					}
					else elements.set(i, new ElementInteger(name, value));
					return;
				}
			}
			elements.add(new ElementInteger(name, value));
		}
	}
	
	public void addDouble(String name, double value)
	{
		if (name == null) throw new NullPointerException();
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementDouble)
					{
						((ElementDouble) e).value = value;
					}
					else elements.set(i, new ElementDouble(name, value));
					return;
				}
			}
			elements.add(new ElementDouble(name, value));
		}
	}
	
	public void addString(String name, String value)
	{
		if (name == null) throw new NullPointerException();
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementString)
					{
						((ElementString) e).value = value;
					}
					else elements.set(i, new ElementString(name, value));
					return;
				}
			}
			elements.add(new ElementString(name, value));
		}
	}
	
	public TYPE getType(String name)
	{
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementBoolean) return TYPE.BOOLEAN;
					if (e instanceof ElementInteger) return TYPE.INTEGER;
					if (e instanceof ElementDouble) return TYPE.DOUBLE;
					if (e instanceof ElementString) return TYPE.STRING;
					throw new Error("bad type: " + e.getClass().getName());
				}
			}
			return null;
		}
	}
	
	public boolean getOrAddBool(String name, boolean value, boolean tolerant)
	{
		if (name == null) throw new NullPointerException();
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementBoolean)
					{
						return ((ElementBoolean) e).value;
					}
					else if (tolerant)
					{
						elements.set(i, new ElementBoolean(name, value));
						return value;
					}
					else throw new IllegalStateException("not a boolean: " + name);
				}
			}
			elements.add(new ElementBoolean(name, value));
			return value;
		}
	}
	
	public int getOrAddInt(String name, int value, boolean tolerant)
	{
		if (name == null) throw new NullPointerException();
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementInteger)
					{
						return ((ElementInteger) e).value;
					}
					else if (tolerant)
					{
						elements.set(i, new ElementInteger(name, value));
						return value;
					}
					else throw new IllegalStateException("not an integer: " + name);
				}
			}
			elements.add(new ElementInteger(name, value));
			return value;
		}
	}
	
	public double getOrAddDouble(String name, double value, boolean tolerant)
	{
		if (name == null) throw new NullPointerException();
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementDouble)
					{
						return ((ElementDouble) e).value;
					}
					else if (tolerant)
					{
						elements.set(i, new ElementDouble(name, value));
						return value;
					}
					else throw new IllegalStateException("not a double: " + name);
				}
			}
			elements.add(new ElementDouble(name, value));
			return value;
		}
	}
	
	public String getOrAddString(String name, String value, boolean tolerant)
	{
		if (name == null) throw new NullPointerException();
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementString)
					{
						return ((ElementString) e).value;
					}
					else if (tolerant)
					{
						elements.set(i, new ElementString(name, value));
						return value;
					}
					else throw new IllegalStateException("not a string: " + name);
				}
			}
			elements.add(new ElementString(name, value));
			return value;
		}
	}
	
	public boolean getBool(String name)
	{
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementBoolean)
					{
						return ((ElementBoolean) e).value;
					}
					else throw new IllegalStateException("not a boolean: " + name);
				}
			}
			throw new NoSuchElementException("for name: " + name);
		}
	}
	
	public int getInt(String name)
	{
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementInteger)
					{
						return ((ElementInteger) e).value;
					}
					else throw new IllegalStateException("not an integer: " + name);
				}
			}
			throw new NoSuchElementException("for name: " + name);
		}
	}
	
	public double getDouble(String name)
	{
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementDouble)
					{
						return ((ElementDouble) e).value;
					}
					else throw new IllegalStateException("not a double: " + name);
				}
			}
			throw new NoSuchElementException("for name: " + name);
		}
	}
	
	public String getString(String name)
	{
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementString)
					{
						return ((ElementString) e).value;
					}
					else throw new IllegalStateException("not a string: " + name);
				}
			}
			throw new NoSuchElementException("for name: " + name);
		}
	}
	
	public boolean remove(String name)
	{
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					elements.remove(i);
					return true;
				}
			}
			return false;
		}
	}
	
	public boolean removeBool(String name)
	{
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementBoolean)
					{
						elements.remove(i);
						return ((ElementBoolean) e).value;
					}
					else throw new IllegalStateException("not a boolean: " + name);
				}
			}
			throw new NoSuchElementException("for name: " + name);
		}
	}
	
	public int removeInt(String name)
	{
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementInteger)
					{
						elements.remove(i);
						return ((ElementInteger) e).value;
					}
					else throw new IllegalStateException("not an integer: " + name);
				}
			}
			throw new NoSuchElementException("for name: " + name);
		}
	}
	
	public double removeDouble(String name)
	{
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementDouble)
					{
						elements.remove(i);
						return ((ElementDouble) e).value;
					}
					else throw new IllegalStateException("not a double: " + name);
				}
			}
			throw new NoSuchElementException("for name: " + name);
		}
	}
	
	public String removeString(String name)
	{
		synchronized (elements)
		{
			for (int i = 0; i < elements.size(); i++)
			{
				if (elements.get(i).name.equals(name))
				{
					ConfigElement e = elements.get(i);
					if (e instanceof ElementString)
					{
						elements.remove(i);
						return ((ElementString) e).value;
					}
					else throw new IllegalStateException("not a string: " + name);
				}
			}
			throw new NoSuchElementException("for name: " + name);
		}
	}
}