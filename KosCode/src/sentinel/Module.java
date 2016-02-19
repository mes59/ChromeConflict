package sentinel;

import sentinel.dmgsrc.DamageSource;

public abstract class Module
{
	public static final Module[] modules = new Module[32];
	public final int id;
	
	public Module(int id)
	{
		if (modules[id] != null)
		{
			throw new IllegalArgumentException("this id is already occupied");
		}
		modules[id] = this;
		this.id = id;
	}
	
	public abstract int getSlotCount();
	
	public abstract Slot getSlot(int slot);
	
	public abstract boolean isCompatible(int module);
	
	public abstract void onTick(Sentinel sent, int delta);
	
	public abstract float getShieldMul(DamageSource source);
	
	public abstract float getDamageMul(DamageSource source);
}
