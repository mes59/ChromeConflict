package sentinel.weapon;

import sentinel.Types;
import sentinel.dmgsrc.DamageSource;
import world.Drawable;
import world.EntityPlayer;
import world.EntitySentinel;
import world.EntityWeapon;
import world.WorldServer;
import world.field.WorldField;
import engine.math.vec.Vec2;

public abstract class Weapon
{
	public static final Weapon[] weapons = new Weapon[64];
	public static final Weapon LASER_LIGHT = new WeaponLaser(0, Types.LWEAPON, 0);
	public static final Weapon LASER_HEAVY = new WeaponLaser(1, Types.HWEAPON, 1);
	public static final Weapon LASER_ORD = new WeaponLaser(2, Types.OWEAPON, 2);
	public static final Weapon BOMB_LIGHT = new WeaponBomb(3, Types.LROCKET, 0);
	public static final Weapon BOMB_HEAVY = new WeaponBomb(4, Types.HROCKET, 1);
	public static final Weapon BOMB_INFINI = new WeaponBomb(5, Types.OROCKET, 2);
	public static final Weapon MISSILE_LIGHT = new WeaponMissile(6, Types.LROCKET, 0);
	public static final Weapon MISSILE_HEAVY = new WeaponMissile(7, Types.HROCKET, 1);
	
	public final int id;
	public final int type;
	
	protected Weapon(int id, int type)
	{
		if (weapons[id] != null)
		{
			throw new IllegalArgumentException("id " + id + " is already used");
		}
		this.id = id;
		this.type = type;
		weapons[id] = this;
	}
	
	public int getEnergyCost()
	{
		return 0;
	}
	
	public abstract int getDamage(double distance);
	
	public double getZeroGDist()
	{
		return 0;
	}
	
	public abstract int getFireDelay();
	
	public boolean isAffectedBy(WorldField field, double dist)
	{
		return true;
	}
	
	public abstract DamageSource getDMGSrc();
	
	public abstract Drawable getEditAnim();
	
	public abstract Drawable getFieldAnim();
	
	public abstract Drawable getExplosion();
	
	public Drawable getTrail()
	{
		return null;
	}
	
	protected Vec2 createVelocity(EntityPlayer player, double ang, double sin, double cos)
	{
		return player.vel.copy().add(200 * cos, 200 * sin);
	}
	
	public void onFired(WorldServer world, EntityPlayer player, double offx, double offy, double angle)
	{
		Vec2 mid = player.bounds.getMiddle().add(offx, offy);
		double sin = Math.sin(angle), cos = Math.cos(angle);
		Vec2 vel = createVelocity(player, angle, sin, cos);
		world.add(new EntityWeapon(world.nextEntityId(), mid, vel, this, player));
		player.energy -= getEnergyCost();
	}
	
	public void onUpdate(WorldServer world, EntityWeapon entity, int delta)
	{
	}
	
	public void onHit(WorldServer world, EntitySentinel attacker, EntitySentinel player, double x, double y, double distance)
	{
		int dmg = getDamage(distance);
		DamageSource src = getDMGSrc();
		if (!src.getBypass())
		{
			player.shield -= dmg * src.getShieldMod();
			if (player.shield < 0)
			{
				dmg = (int) (-player.shield / src.getShieldMod());
				player.shield = 0;
			}
			else dmg = 0;
		}
		if (dmg > 0)
		{
			player.hull -= dmg * src.getHullMod();
			if (player.hull < 0) player.hull = 0;
		}
		player.lastHit = this;
		player.attacker = attacker;
	}
	
	public void onImpact(WorldServer world, EntitySentinel attacker, double x, double y, double distance)
	{
	}
}
