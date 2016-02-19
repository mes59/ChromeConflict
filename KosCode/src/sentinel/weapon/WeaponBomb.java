package sentinel.weapon;

import sentinel.dmgsrc.DMGBomb;
import sentinel.dmgsrc.DamageSource;
import world.Drawable;
import world.EntityPlayer;
import world.EntityWeapon;
import world.WorldServer;
import engine.app.graphics.g2d.Animation;
import engine.math.vec.Vec2;

public class WeaponBomb extends Weapon
{
	private int ver;
	
	WeaponBomb(int id, int type, int ver)
	{
		super(id, type);
		this.ver = ver;
	}
	
	public int getDamage(double distance)
	{
		switch (ver)
		{
			case 0:
				return 250;
			case 1:
				return 500;
			case 2:
				return 1000;
			default:
				throw new Error();
		}
	}
	
	public int getFireDelay()
	{
		return 2000;
	}
	
	public DamageSource getDMGSrc()
	{
		switch (ver)
		{
			case 0:
				return DMGBomb.LIGHT;
			case 1:
				return DMGBomb.HEAVY;
			case 2:
				return DMGBomb.INFINI;
			default:
				throw new Error();
		}
	}
	
	public Drawable getEditAnim()
	{
		switch (ver)
		{
			case 0:
				return new Drawable(new Animation("wep/bomb/light", 11, 1));
			case 1:
				return new Drawable(new Animation("wep/bomb/heavy", 4, 1));
			case 2:
				return new Drawable(new Animation("wep/bomb/infini", 8, 1));
			default:
				throw new Error();
		}
	}
	
	public Drawable getFieldAnim()
	{
		switch (ver)
		{
			case 0:
				return new Drawable(new Animation("wep/bomb/light", 11, 1));
			case 1:
				return new Drawable(new Animation("wep/bomb/heavy", 4, 1));
			case 2:
				return new Drawable(new Animation("wep/bomb/infini", 8, 1));
			default:
				throw new Error();
		}
	}
	
	public Drawable getExplosion()
	{
		switch (ver)
		{
			case 0:
				return new Drawable(new Animation("wep/bomb/heavy_exp", 4, 1).setFlag(Animation.DISAPPEAR, true));
			case 1:
				return new Drawable(new Animation("wep/bomb/light_exp", 7, 1).setFlag(Animation.DISAPPEAR, true));
			case 2:
				return new Drawable(new Animation("wep/bomb/infini_exp", 17, 1).setSpeed(20).setFlag(Animation.DISAPPEAR, true));
			default:
				throw new Error();
		}
	}
	
	public void onFired(WorldServer world, EntityPlayer player, double offx, double offy, double angle)
	{
		Vec2 pos = player.bounds.pos.copy().add(player.bounds.size.x() / 2, player.bounds.size.y()).add(offx, offy);
		Vec2 vel = player.vel.copy().add(0, 50);
		world.add(new EntityWeapon(world.nextEntityId(), pos, vel, this, player));
	}
}
