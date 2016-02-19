package sentinel.weapon;

import net.packet.PacketSpawnGFX;
import sentinel.dmgsrc.DMGMissile;
import sentinel.dmgsrc.DamageSource;
import world.Drawable;
import world.EntityPlayer;
import world.EntityWeapon;
import world.WorldServer;
import engine.app.graphics.g2d.Animation;
import engine.math.vec.Vec2;
import engine.net.data.IODataTable;
import engine.net.data.IODataUByte;

public class WeaponMissile extends Weapon
{
	private int ver;
	
	WeaponMissile(int id, int type, int ver)
	{
		super(id, type);
		this.ver = ver;
	}
	
	public int getDamage(double distance)
	{
		switch (ver)
		{
			case 0:
				return 200;
			case 1:
				return 400;
			default:
				throw new Error();
		}
	}
	
	public double getZeroGDist()
	{
		return 300;
	}
	
	public int getFireDelay()
	{
		return 1500;
	}
	
	public DamageSource getDMGSrc()
	{
		switch (ver)
		{
			case 0:
				return DMGMissile.LIGHT;
			case 1:
				return DMGMissile.HEAVY;
			default:
				throw new Error();
		}
	}
	
	public Drawable getEditAnim()
	{
		switch (ver)
		{
			case 0:
				return new Drawable(new Animation("wep/missile/light", 2, 1));
			case 1:
				return new Drawable(new Animation("wep/missile/heavy", 2, 1));
			default:
				throw new Error();
		}
	}
	
	public Drawable getFieldAnim()
	{
		switch (ver)
		{
			case 0:
				return new Drawable(new Animation("wep/missile/light", 2, 1));
			case 1:
				return new Drawable(new Animation("wep/missile/heavy", 2, 1));
			default:
				throw new Error();
		}
	}
	
	public Drawable getExplosion()
	{
		switch (ver)
		{
			case 0:
				return new Drawable(new Animation("wep/missile/light_exp", 6, 1).setFlag(Animation.DISAPPEAR, true));
			case 1:
				return new Drawable(new Animation("wep/missile/heavy_exp", 17, 1).setSpeed(20).setFlag(Animation.DISAPPEAR, true));
			default:
				throw new Error();
		}
	}
	
	public Drawable getTrail()
	{
		return new Drawable(new Animation("wep/missile/smoke", 4, 1).setFlag(Animation.DISAPPEAR, true));
	}
	
	protected Vec2 createVelocity(EntityPlayer player, double ang, double sin, double cos)
	{
		return new Vec2(300 * cos, 300 * sin);
	}
	
	public void onUpdate(WorldServer world, EntityWeapon entity, int delta)
	{
		entity.trail += delta;
		if (entity.trail >= 200)
		{
			entity.trail %= 200;
			IODataTable table = new IODataTable();
			table.put("weapon", new IODataUByte(id));
			table.put("mode", new IODataUByte(1));
			PacketSpawnGFX exp = new PacketSpawnGFX(entity.bounds.pos.x(), entity.bounds.pos.y(), 0, 0, table);
			world.getServer().broadcast(exp, null);
		}
	}
}
