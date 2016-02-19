package world;

import net.packet.PacketSpawnGFX;

import org.lwjgl.opengl.GL11;

import sentinel.weapon.Weapon;
import world.field.WorldField;
import engine.math.vec.Vec2;
import engine.net.data.IOData;
import engine.net.data.IODataDouble;
import engine.net.data.IODataTable;
import engine.net.data.IODataUByte;

public class EntityWeapon extends Entity
{
	private Weapon weapon;
	private EntityPlayer owner;
	
	public double trail;
	private double ang, dist;
	private double pmov, mov;
	private double velx, vely;
	
	EntityWeapon(int entityId)
	{
		super(entityId);
	}
	
	public EntityWeapon(int entityId, Vec2 pos, Vec2 vel, Weapon weapon, EntityPlayer owner)
	{
		super(entityId);
		bounds.pos.set(pos);
		this.vel = vel;
		this.weapon = weapon;
		this.owner = owner;
	}
	
	public Weapon getWeapon()
	{
		return weapon;
	}
	
	public EntityPlayer getOwner()
	{
		return owner;
	}
	
	public double getCurrentAngle()
	{
		return ang;
	}
	
	public double getTravelDist()
	{
		return dist;
	}
	
	public boolean isAffectedBy(WorldField field)
	{
		return weapon.isAffectedBy(field, dist);
	}
	
	protected IODataTable createDTable()
	{
		IODataTable table = super.createDTable();
		table.put("type", new IODataUByte(weapon.id));
		table.put("ang", new IODataDouble(ang));
		return table;
	}
	
	protected void readDTable(IODataTable table)
	{
		super.readDTable(table);
		int id = IOData.expect(table.get("type"), IODataUByte.class).value;
		weapon = Weapon.weapons[id];
		sprite = weapon.getFieldAnim();
		ang = IOData.expect(table.get("ang"), IODataDouble.class).value;
	}
	
	public void update(int delta, double gravity, int mods)
	{
		if (world instanceof WorldClient)
		{
			super.update(delta, gravity, mods | WorldField.NO_GRAVITY);
			if (collideLeft || collideRight || collideBelow || collideAbove) vel.set(0, 0);
			return;
		}
		if (dist < weapon.getZeroGDist()) mods |= WorldField.NO_GRAVITY;
		
		EntitySentinel hit = null;
		float time = delta / 1000f;
		Vec2 rvel = null;
		double mul = 1, temp;
		for (Entity ent : world.entities)
		{
			if (ent instanceof EntitySentinel)
			{
				if (ent == owner && mov != -1)
				{
					if (pmov <= mov) continue;
					else mov = -1;
				}
				
				if (rvel == null) rvel = vel.copy().mul(time, time);
				else rvel.set(vel).mul(time, time);
				rvel.sub(ent.vel.x() * time, ent.vel.y() * time);
				if (rvel.x() == 0 && rvel.y() == 0) continue;
				
				temp = ent.bounds.getIntersection(bounds.pos, rvel);
				if (temp <= mul)
				{
					hit = (EntitySentinel) ent;
					mul = temp;
				}
			}
		}
		
		if (hit != null)
		{
			double x = bounds.pos.x() + vel.x() * mul * time;
			double y = bounds.pos.y() + vel.y() * mul * time;
			WorldServer wsrv = (WorldServer) world;
			weapon.onHit(wsrv, owner, hit, x, y, dist);
			world.destroy(this);
			spawnEXP(wsrv, x, y);
		}
		else
		{
			double x = bounds.pos.x(), y = bounds.pos.y();
			super.update(delta, gravity, mods);
			weapon.onUpdate((WorldServer) world, this, delta);
			x -= bounds.pos.x();
			y -= bounds.pos.y();
			dist += Math.sqrt(x * x + y * y);
			if (owner != null && mov != -1)
			{
				pmov = mov;
				x = Math.max(bounds.pos.x() - owner.bounds.pos.x() - owner.bounds.size.x() / 2, owner.bounds.size.x() / 2);
				y = Math.max(bounds.pos.y() - owner.bounds.pos.y() - owner.bounds.size.y() / 2, owner.bounds.size.y() / 2);
				mov = Math.sqrt(x * x + y * y);
			}
			boolean explode = false;
			if (collideLeft && bounds.pos.x() >= 2) explode = true;
			if (collideRight && bounds.pos.x() + 2 <= world.collision.getWidth()) explode = true;
			if (collideBelow && bounds.pos.y() >= 2) explode = true;
			if (collideAbove && bounds.pos.y() + 2 <= world.collision.getHeight()) explode = true;
			if (explode)
			{
				vel.set(0, 0);
				WorldServer wsrv = (WorldServer) world;
				weapon.onImpact(wsrv, owner, bounds.pos.x(), bounds.pos.y(), dist);
				world.destroy(this);
				spawnEXP(wsrv, bounds.pos.x(), bounds.pos.y());
			}
			else if (collideLeft || collideRight || collideBelow || collideAbove)
			{
				vel.set(0, 0);
				world.destroy(this);
			}
		}
	}
	
	private void spawnEXP(WorldServer world, double x, double y)
	{
		IODataTable table = new IODataTable();
		table.put("weapon", new IODataUByte(weapon.id));
		table.put("mode", new IODataUByte(0));
		PacketSpawnGFX exp = new PacketSpawnGFX(x, y, 0, 0, table);
		world.getServer().broadcast(exp, null);
	}
	
	public void draw()
	{
		if (velx != vel.x() || vely != vel.y())
		{
			if (vel.x() != 0 && vel.y() != 0)
			{
				velx = vel.x();
				vely = vel.y();
				ang = Math.toDegrees(Math.atan2(vely, velx));
			}
		}
		GL11.glColor4f(1, 1, 1, 1);
		sprite.draw(bounds.pos.x(), bounds.pos.y(), 0.5, 0.5, ang);
	}
}
