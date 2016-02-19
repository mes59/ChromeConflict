package world;

import java.util.Vector;

import net.server.CCServer;
import engine.math.Rect2;
import engine.math.vec.Vec2;

public class WorldServer extends World
{
	private int nextEntityId;
	protected Vector<SpawnRegion> spawners;
	private int totalWeight;
	protected Vector<Entity> adding;
	protected Vector<Entity> removing;
	private CCServer server;
	
	WorldServer(double gravity)
	{
		super(gravity);
		spawners = new Vector<>();
		adding = new Vector<>();
		removing = new Vector<>();
	}
	
	private void addBasicSpawn()
	{
		totalWeight = 0;
		Rect2 bounds = new Rect2(0, 0, collision.getWidth(), 0);
		Vec2 vel = new Vec2(0, 20);
		spawners.add(new SpawnRegion(bounds, vel, vel, 100));
	}
	
	public void setServer(CCServer server)
	{
		if (server == null) throw new NullPointerException();
		if (this.server != null) throw new IllegalStateException("already configured");
		this.server = server;
	}
	
	public CCServer getServer()
	{
		return server;
	}
	
	public int nextEntityId()
	{
		return nextEntityId++;
	}
	
	public void add(Entity ent)
	{
		if (ent == null) return;
		if (adding.contains(ent)) return;
		adding.add(ent);
	}
	
	public void spawn(Entity ent)
	{
		if (ent == null) return;
		if (adding.contains(ent)) return;
		if (ent.world != null && ent.world != this) return;
		if (spawners.isEmpty()) addBasicSpawn();
		SpawnRegion spawn = null;
		if (spawners.size() == 1) spawn = spawners.get(0);
		else
		{
			if (totalWeight == 0)
			{
				totalWeight = spawners.get(0).weight;
				for (int i = 1; i < spawners.size(); i++)
				{
					if (spawners.get(i).weight <= 0)
					{
						spawners.remove(i--);
						continue;
					}
					totalWeight += spawners.get(i).weight;
					if (totalWeight < 0) throw new Error("unbearable");
				}
			}
			int weight = (int) (totalWeight * Math.random());
			for (int i = 1; i < spawners.size(); i++)
			{
				int curr = spawners.get(i).weight;
				if (weight < curr)
				{
					spawn = spawners.get(i);
					break;
				}
				else weight -= curr;
			}
			if (spawn == null) throw new Error("arithmetic failed");
		}
		spawn.spawn(this, ent);
		if (ent.world != this) adding.add(ent);
	}
	
	public void destroy(Entity ent)
	{
		if (ent == null) return;
		if (removing.contains(ent)) return;
		removing.add(ent);
	}
	
	public synchronized Entity getEntityFromId(int id)
	{
		for (Entity ent : entities)
		{
			if (ent.entityId == id) return ent;
		}
		for (Entity ent : adding)
		{
			if (ent.entityId == id) return ent;
		}
		return null;
	}
	
	public synchronized void update(int delta)
	{
		addRemoveEntities();
		super.update(delta);
		addRemoveEntities();
	}
	
	private void addRemoveEntities()
	{
		for (Entity ent : adding)
		{
			if (ent.world == null)
			{
				entities.add(ent);
				ent.world = this;
			}
		}
		adding.clear();
		for (Entity ent : removing)
		{
			if (ent.world == this)
			{
				entities.remove(ent);
				ent.world = null;
			}
		}
		removing.clear();
	}
}
