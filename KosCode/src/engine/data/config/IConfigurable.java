package engine.data.config;

public interface IConfigurable
{
	public int getSubDirCount();
	
	public IConfigurable addSubDir(String name);
	
	public IConfigurable getSubDir(String name);
	
	public IConfigurable removeSubDir(String name);
	
	public int getElementCount();
	
	public void addBool(String name, boolean value);
	
	public void addInt(String name, int value);
	
	public void addDouble(String name, double value);
	
	public void addString(String name, String value);
	
	public TYPE getType(String name);
	
	public boolean getOrAddBool(String name, boolean value, boolean tolerant);
	
	public int getOrAddInt(String name, int value, boolean tolerant);
	
	public double getOrAddDouble(String name, double value, boolean tolerant);
	
	public String getOrAddString(String name, String value, boolean tolerant);
	
	public boolean getBool(String name);
	
	public int getInt(String name);
	
	public double getDouble(String name);
	
	public String getString(String name);
	
	public boolean remove(String name);
	
	public boolean removeBool(String name);
	
	public int removeInt(String name);
	
	public double removeDouble(String name);
	
	public String removeString(String name);
	
	public static enum TYPE
	{
		BOOLEAN, INTEGER, DOUBLE, STRING;
	}
}
