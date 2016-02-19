package engine.data.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Vector;

public class Configuration implements IConfigurable
{
	private File file;
	private final Vector<ConfigData> dirs;
	private final Vector<ConfigElement> mdata;
	
	public Configuration(File file)
	{
		this.file = file;
		mdata = new Vector<>();
		dirs = new Vector<>();
	}
	
	public synchronized void relocate(File dest)
	{
		if (file != null)
		{
			if (dest == null)
			{
				if (file.exists() && !file.delete()) throw new RuntimeException("failed to relocate config");
			}
			else if (file.exists())
			{
				if (dest.exists()) dest.delete();
				if (!file.renameTo(dest)) throw new RuntimeException("failed to relocate config");
			}
		}
		file = dest;
	}
	
	public File getFile()
	{
		return file;
	}
	
	public synchronized void load() throws IOException
	{
		if (file == null) throw new IllegalStateException("no location specified");
		BufferedReader in = new BufferedReader(new FileReader(file));
		dirs.clear();
		mdata.clear();
		read(in);
		in.close();
	}
	
	public synchronized void read(BufferedReader in) throws IOException
	{
		dirs.clear();
		mdata.clear();
		ConfigData curr = null;
		Vector<ConfigData> stack = new Vector<>();
		
		String line;
		for (int lineNum = 1; (line = in.readLine()) != null; lineNum++)
		{
			int idx = line.indexOf("//");
			if (idx != -1) line = line.substring(0, idx);
			if ((line = line.trim()).length() == 0) continue;
			if (line.charAt(0) == '@')
			{
				ConfigData next = new ConfigData(line.substring(1));
				if (curr == null) dirs.add(next);
				else curr.subdirs.add(next);
				stack.add(curr = next);
			}
			else if (line.charAt(0) == '#')
			{
				line = line.substring(1);
				if (curr != null && curr.name.equals(line))
				{
					stack.remove(stack.size() - 1);
					if (stack.isEmpty()) curr = null;
					else curr = stack.get(stack.size() - 1);
				}
				else throw new IOException("bad format, line " + lineNum);
			}
			else
			{
				try
				{
					ConfigElement e = ConfigElement.parse(line);
					if (curr == null) mdata.add(e);
					else curr.elements.add(e);
				}
				catch (Exception e)
				{
					throw new IOException("corrupt config, line " + lineNum, e);
				}
			}
		}
	}
	
	public synchronized void save() throws FileNotFoundException
	{
		if (file == null) throw new IllegalStateException("no location specified");
		PrintWriter out = new PrintWriter(file);
		write(out);
		out.close();
	}
	
	public synchronized void write(PrintWriter out)
	{
		for (ConfigElement element : mdata)
		{
			element.print(out);
		}
		
		for (ConfigData dir : dirs)
		{
			if (!mdata.isEmpty()) out.println();
			dir.write(out, 0);
		}
	}
	
	public int getSubDirCount()
	{
		return dirs.size();
	}
	
	public IConfigurable addSubDir(String name)
	{
		if (name == null) throw new NullPointerException();
		synchronized (dirs)
		{
			for (int i = 0; i < dirs.size(); i++)
			{
				if (dirs.get(i).name.equals(name)) return dirs.get(i);
			}
			ConfigData sub = new ConfigData(name);
			dirs.add(sub);
			return sub;
		}
	}
	
	public IConfigurable getSubDir(String name)
	{
		if (name == null) throw new NullPointerException();
		synchronized (dirs)
		{
			for (int i = 0; i < dirs.size(); i++)
			{
				if (dirs.get(i).name.equals(name)) return dirs.get(i);
			}
			return null;
		}
	}
	
	public IConfigurable removeSubDir(String name)
	{
		if (name == null) throw new NullPointerException();
		synchronized (dirs)
		{
			for (int i = 0; i < dirs.size(); i++)
			{
				if (dirs.get(i).name.equals(name)) return dirs.remove(i);
			}
			return null;
		}
	}
	
	public int getElementCount()
	{
		return mdata.size();
	}
	
	public void addBool(String name, boolean value)
	{
		if (name == null) throw new NullPointerException();
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
					if (e instanceof ElementBoolean)
					{
						((ElementBoolean) e).value = value;
					}
					else mdata.set(i, new ElementBoolean(name, value));
					return;
				}
			}
			mdata.add(new ElementBoolean(name, value));
		}
	}
	
	public void addInt(String name, int value)
	{
		if (name == null) throw new NullPointerException();
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
					if (e instanceof ElementInteger)
					{
						((ElementInteger) e).value = value;
					}
					else mdata.set(i, new ElementInteger(name, value));
					return;
				}
			}
			mdata.add(new ElementInteger(name, value));
		}
	}
	
	public void addDouble(String name, double value)
	{
		if (name == null) throw new NullPointerException();
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
					if (e instanceof ElementDouble)
					{
						((ElementDouble) e).value = value;
					}
					else mdata.set(i, new ElementDouble(name, value));
					return;
				}
			}
			mdata.add(new ElementDouble(name, value));
		}
	}
	
	public void addString(String name, String value)
	{
		if (name == null) throw new NullPointerException();
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
					if (e instanceof ElementString)
					{
						((ElementString) e).value = value;
					}
					else mdata.set(i, new ElementString(name, value));
					return;
				}
			}
			mdata.add(new ElementString(name, value));
		}
	}
	
	public TYPE getType(String name)
	{
		if (name == null) return null;
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
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
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
					if (e instanceof ElementBoolean)
					{
						return ((ElementBoolean) e).value;
					}
					else if (tolerant)
					{
						mdata.set(i, new ElementBoolean(name, value));
						return value;
					}
					else throw new IllegalStateException("not a boolean: " + name);
				}
			}
			mdata.add(new ElementBoolean(name, value));
			return value;
		}
	}
	
	public int getOrAddInt(String name, int value, boolean tolerant)
	{
		if (name == null) throw new NullPointerException();
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
					if (e instanceof ElementInteger)
					{
						return ((ElementInteger) e).value;
					}
					else if (tolerant)
					{
						mdata.set(i, new ElementInteger(name, value));
						return value;
					}
					else throw new IllegalStateException("not an integer: " + name);
				}
			}
			mdata.add(new ElementInteger(name, value));
			return value;
		}
	}
	
	public double getOrAddDouble(String name, double value, boolean tolerant)
	{
		if (name == null) throw new NullPointerException();
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
					if (e instanceof ElementDouble)
					{
						return ((ElementDouble) e).value;
					}
					else if (tolerant)
					{
						mdata.set(i, new ElementDouble(name, value));
						return value;
					}
					else throw new IllegalStateException("not a double: " + name);
				}
			}
			mdata.add(new ElementDouble(name, value));
			return value;
		}
	}
	
	public String getOrAddString(String name, String value, boolean tolerant)
	{
		if (name == null) throw new NullPointerException();
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
					if (e instanceof ElementString)
					{
						return ((ElementString) e).value;
					}
					else if (tolerant)
					{
						mdata.set(i, new ElementString(name, value));
						return value;
					}
					else throw new IllegalStateException("not a string: " + name);
				}
			}
			mdata.add(new ElementString(name, value));
			return value;
		}
	}
	
	public boolean getBool(String name)
	{
		if (name == null) throw new NoSuchElementException("null");
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
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
		if (name == null) throw new NoSuchElementException("null");
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
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
		if (name == null) throw new NoSuchElementException("null");
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
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
		if (name == null) throw new NoSuchElementException("null");
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
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
		if (name == null) return false;
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					mdata.remove(i);
					return true;
				}
			}
			return false;
		}
	}
	
	public boolean removeBool(String name)
	{
		if (name == null) throw new NoSuchElementException("null");
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
					if (e instanceof ElementBoolean)
					{
						mdata.remove(i);
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
		if (name == null) throw new NoSuchElementException("null");
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
					if (e instanceof ElementInteger)
					{
						mdata.remove(i);
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
		if (name == null) throw new NoSuchElementException("null");
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
					if (e instanceof ElementDouble)
					{
						mdata.remove(i);
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
		if (name == null) throw new NoSuchElementException("null");
		synchronized (mdata)
		{
			for (int i = 0; i < mdata.size(); i++)
			{
				if (mdata.get(i).name.equals(name))
				{
					ConfigElement e = mdata.get(i);
					if (e instanceof ElementString)
					{
						mdata.remove(i);
						return ((ElementString) e).value;
					}
					else throw new IllegalStateException("not a string: " + name);
				}
			}
			throw new NoSuchElementException("for name: " + name);
		}
	}
}
