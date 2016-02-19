package world;

import java.lang.reflect.Constructor;
import java.util.Vector;

import net.packet.PacketSpawnEntity;
import net.packet.PacketSpawnGFX;
import engine.net.data.IODataTable;

public class EntityRegistry
{
	private static final Vector<Class<? extends Entity>> classes;
	static
	{
		classes = new Vector<>();
		classes.add(EntityWeapon.class);
		classes.add(EntityPlayer.class);
	}
	
	public static int getEID(Entity ent)
	{
		return getEID(ent.getClass());
	}
	
	public static int getEID(Class<? extends Entity> cls)
	{
		return classes.indexOf(cls);
	}
	
	public static Class<? extends Entity> getType(int id)
	{
		return classes.get(id);
	}
	
	public static IODataTable createDTable(Entity ent)
	{
		int id = classes.indexOf(ent.getClass());
		if (id == -1) throw new IllegalArgumentException("unregistered entity");
		return ent.createDTable();
	}
	
	public static Entity createEntity(PacketSpawnEntity spawn)
	{
		try
		{
			Class<? extends Entity> cls = classes.get(spawn.type);
			Constructor<? extends Entity> c = cls.getDeclaredConstructor(int.class);
			Entity ent = c.newInstance(spawn.entityId);
			ent.entityId = spawn.entityId;
			ent.readDTable(spawn.data);
			return ent;
		}
		catch (ReflectiveOperationException e)
		{
			throw new Error("bad entity table", e);
		}
	}
	
	public static EntityGFX createGFX(PacketSpawnGFX spawn)
	{
		EntityGFX gfx = new EntityGFX();
		gfx.bounds.pos.set(spawn.posx, spawn.posy);
		gfx.vel.set(spawn.velx, spawn.vely);
		gfx.readDTable(spawn.data);
		return gfx;
	}
}
