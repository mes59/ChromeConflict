package sentinel.chassis;

import engine.util.Utils;

public abstract class Chassis
{
	public static final Chassis[] chassis = new Chassis[16];
	public static final Chassis TEMPLATE = new ChassisTemplate(0);
	public static final Chassis STORMBREAK = new ChassisStormbreaker(1);
	
	public final int id;
	public final int hull;
	public final int shield;
	public final int regen;
	public final int energy;
	public final int recharge;
	public final int slots;
	
	public Chassis(int id, int hull, int shield, int regen, int energy, int recharge, int slots)
	{
		if (Utils.get(chassis, id) != null)
		{
			throw new IllegalArgumentException("this id is already occupied");
		}
		chassis[id] = this;
		this.id = id;
		this.hull = hull;
		this.shield = shield;
		this.regen = regen;
		this.energy = energy;
		this.recharge = recharge;
		this.slots = slots;
	}
}
