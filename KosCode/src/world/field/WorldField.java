package world.field;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import main.CCUtils;
import world.Entity;
import engine.util.IOUtils;

public abstract class WorldField
{
	private static final ArrayList<Class<? extends WorldField>> classes;
	static
	{
		classes = new ArrayList<>();
		classes.add(FieldGravity.class);
		classes.add(FieldWater.class);
	}
	
	protected static final IOUtils utils = CCUtils.utils;
	
	public static final int NO_GRAVITY = 1;
	public static final int NO_REPAIR = 2;
	public static final int NO_RECHARGE = 4;
	public static final int NO_DAMAGE = 8;
	public static final int NO_ENERGYUSE = 16;
	
	WorldField()
	{
	}
	
	public int onEntityUpdated(Entity entity, int delta)
	{
		return 0;
	}
	
	public void write(OutputStream out) throws IOException
	{
		int id = classes.indexOf(getClass());
		if (id == -1) throw new Error("unregistered type: " + getClass().getName());
		utils.writeByte(out, id);
		writeData(out);
	}
	
	protected abstract void writeData(OutputStream out) throws IOException;
	
	public static WorldField read(InputStream in) throws IOException
	{
		int id = utils.readUByte(in);
		if (id < classes.size())
		{
			try
			{
				return classes.get(id).newInstance().readData(in);
			}
			catch (ReflectiveOperationException e)
			{
				throw new Error("failed to create instance", e);
			}
		}
		throw new Error("invalid field ID: " + id);
	}
	
	protected abstract WorldField readData(InputStream in) throws IOException;
	
	public void draw()
	{
	}
}
