package sentinel.weapon;

import sentinel.Types;
import sentinel.dmgsrc.DMGLaser;
import sentinel.dmgsrc.DamageSource;
import world.Drawable;
import world.EntityPlayer;
import world.field.WorldField;
import engine.app.graphics.g2d.Animation;
import engine.math.vec.Vec2;

public class WeaponLaser extends Weapon
{
	private int ver;
	
	WeaponLaser(int id, int type, int ver)
	{
		super(id, type);
		this.ver = ver;
	}
	
	public int getType()
	{
		switch (ver)
		{
			case 0:
				return Types.LWEAPON;
			case 1:
				return Types.HWEAPON;
			case 2:
				return Types.OWEAPON;
			default:
				throw new Error();
		}
	}
	
	public int getEnergyCost()
	{
		switch (ver)
		{
			case 0:
				return 50;
			case 1:
				return 200;
			case 2:
				return 500;
			default:
				throw new Error();
		}
	}
	
	public int getDamage(double distance)
	{
		switch (ver)
		{
			case 0:
				return 100;
			case 1:
				return 200;
			case 2:
				return distance < 100 ? 1000 : 300;
			default:
				throw new Error();
		}
	}
	
	public double getZeroGDist()
	{
		return Double.POSITIVE_INFINITY;
	}
	
	public int getFireDelay()
	{
		switch (ver)
		{
			case 0:
				return 200; // was 1000
			case 1:
				return 500; // was 1000
			case 2:
				return 2000;
			default:
				throw new Error();
		}
	}
	
	public int getRefireCount()
	{
		switch (ver)
		{
			case 0:
				return 5;
			case 1:
				return 10;
			case 2:
				return 20;
			default:
				throw new Error();
		}
	}
	
	public int getRefireDelay()
	{
		switch (ver)
		{
			case 0:
				return 20;
			case 1:
				return 50;
			case 2:
				return 50;
			default:
				throw new Error();
		}
	}
	
	public boolean isAffectedBy(WorldField field, double dist)
	{
		return false;
	}
	
	public DamageSource getDMGSrc()
	{
		switch (ver)
		{
			case 0:
				return DMGLaser.LIGHT;
			case 1:
				return DMGLaser.HEAVY;
			case 2:
				return DMGLaser.ORDNANCE;
			default:
				throw new Error();
		}
	}
	
	public Drawable getEditAnim()
	{
		switch (ver)
		{
			case 0:
				
				return new Drawable(new Animation("wep/pulse/light", 2, 1));
			case 1:
				return new Drawable(new Animation("wep/pulse/heavy", 2, 1));
			case 2:
				return new Drawable(new Animation("wep/pulse/ordnance", 1, 1));
			default:
				throw new Error();
		}
	}
	
	public Drawable getFieldAnim()
	{
		switch (ver)
		{
			case 0:
				
				return new Drawable(new Animation("wep/pulse/light", 2, 1));
			case 1:
				return new Drawable(new Animation("wep/pulse/heavy", 2, 1));
			case 2:
				return new Drawable(new Animation("wep/pulse/ordnance", 1, 1));
			default:
				throw new Error();
		}
	}
	
	public Drawable getExplosion()
	{
		switch (ver)
		{
			case 0:
			case 1:
				return new Drawable(new Animation("wep/pulse/explosion", 5, 1).setFlag(Animation.DISAPPEAR, true));
			case 2:
				return new Drawable(new Animation("wep/pulse/ord_exp", 5, 1).setFlag(Animation.DISAPPEAR, true));
			default:
				throw new Error();
		}
	}
	
	protected Vec2 createVelocity(EntityPlayer player, double ang, double sin, double cos)
	{
		return new Vec2(500 * cos, 500 * sin);
	}
}
