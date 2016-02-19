package world;

import java.util.List;
import java.util.Vector;

import world.field.WorldField;

public abstract class World
{
	protected CollisionMap collision;
	public final double gravity;
	
	protected Vector<Entity> entities;
	protected Vector<WorldField> fields;
	
	World(double gravity)
	{
		this.gravity = gravity;
		entities = new Vector<>();
		fields = new Vector<>();
	}
	
	public CollisionMap getCollisionMap()
	{
		return collision;
	}
	
	public abstract void add(Entity ent);
	
	public abstract void destroy(Entity ent);
	
	public List<Entity> getEntityList()
	{
		return entities;
	}
	
	public List<WorldField> getFieldList()
	{
		return fields;
	}
	
	public synchronized Entity getEntityFromId(int id)
	{
		for (Entity ent : entities)
		{
			if (ent.entityId == id) return ent;
		}
		return null;
	}
	
	public synchronized void update(int delta)
	{
		int mods;
		for (Entity ent : entities)
		{
			mods = 0;
			for (WorldField field : fields)
			{
				if (ent instanceof EntityWeapon)
				{
					if (((EntityWeapon) ent).isAffectedBy(field)) mods |= field.onEntityUpdated(ent, delta);
				}
				else mods |= field.onEntityUpdated(ent, delta);
			}
			ent.update(delta, gravity, mods);
		}
	}
}
