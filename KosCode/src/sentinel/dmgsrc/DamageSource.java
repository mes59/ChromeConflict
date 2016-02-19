package sentinel.dmgsrc;

public abstract class DamageSource
{
	public abstract String getName();
	
	public abstract boolean getBypass();
	
	public abstract float getShieldMod();
	
	public abstract float getHullMod();
	
	public abstract String getEpitaph();
}
