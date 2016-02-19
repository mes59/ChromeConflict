package engine.misc;

import java.util.Arrays;

public class IDMap<T>
{
	private final int limit;
	private final boolean direct;
	private final boolean multiMap;
	private final boolean removable;
	
	private volatile int size;
	private volatile int[] idArr;
	private volatile Class<? extends T>[] clsArr;
	
	public IDMap(int limit, boolean direct)
	{
		this(limit, direct, false, false);
	}
	
	public IDMap(int limit, boolean direct, boolean multiMap, boolean removable)
	{
		if (limit == 0) throw new IllegalArgumentException("no capacity");
		if (limit < 0) throw new IllegalArgumentException("negative limit");
		this.limit = limit;
		this.direct = direct;
		this.multiMap = multiMap;
		this.removable = removable;
		if (direct) initArrays(limit);
		else initArrays(Math.min(limit, 64));
	}
	
	@SuppressWarnings("unchecked")
	private void initArrays(int capacity)
	{
		if (clsArr == null)
		{
			if (!direct) idArr = new int[capacity];
			clsArr = new Class[capacity];
		}
		else
		{
			if (direct) throw new Error("cannot initialize again");
			idArr = Arrays.copyOf(idArr, capacity);
			clsArr = Arrays.copyOf(clsArr, capacity);
		}
	}
	
	public int getLimit()
	{
		return limit;
	}
	
	public int getCurrentSize()
	{
		return size;
	}
	
	public boolean isDirect()
	{
		return direct;
	}
	
	public boolean canMultiMap()
	{
		return multiMap;
	}
	
	public boolean canRemoveElements()
	{
		return removable;
	}
	
	public synchronized void put(int id, Class<? extends T> cls)
	{
		if (id < 0 || id >= limit) throw new IllegalArgumentException("id");
		if (getClass(id) != null) throw new IllegalStateException("id " + id + " already mapped");
		if (!multiMap)
		{
			for (int i = 0; i < size; i++)
			{
				if (clsArr[i] == cls) throw new IllegalStateException(cls + " already mapped");
			}
		}
		
		if (clsArr.length == size)
		{
			if (direct) throw new Error("arrays alread full");
			initArrays(size + 64);
		}
		if (!direct) idArr[size] = id;
		clsArr[size] = cls;
		size++;
	}
	
	public synchronized Class<? extends T> getClass(int id)
	{
		if (id < 0 || id >= limit) return null;
		if (direct) return clsArr[id];
		for (int i = 0; i < size; i++)
		{
			if (idArr[i] == id) return clsArr[i];
		}
		return null;
	}
	
	public synchronized int getID(Class<? extends T> cls)
	{
		for (int i = 0; i < size; i++)
		{
			if (clsArr[i] == cls)
			{
				if (direct) return i;
				return idArr[i];
			}
		}
		return -1;
	}
	
	public synchronized Class<? extends T> remove(int id)
	{
		if (!removable) throw new IllegalStateException("can not remove");
		if (id < 0 || id >= limit) return null;
		if (direct)
		{
			Class<? extends T> cls = clsArr[id];
			clsArr[id] = null;
			return cls;
		}
		
		for (int i = 0; i < size; i++)
		{
			if (idArr[i] == id)
			{
				Class<? extends T> cls = clsArr[i];
				clsArr[i] = null;
				return cls;
			}
		}
		return null;
	}
}
