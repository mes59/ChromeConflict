package sentinel.dmgsrc;

public class DMGMissile extends DamageSource
{
	public static final DMGMissile LIGHT = new DMGMissile(0);
	public static final DMGMissile HEAVY = new DMGMissile(1);
	
	private int type;
	
	private DMGMissile(int type)
	{
		this.type = type;
	}
	
	public String getName()
	{
		switch (type)
		{
			case 0:
				return "Light Missile";
			case 1:
				return "Heavy Missile";
			default:
				throw new Error();
		}
	}
	
	public boolean getBypass()
	{
		return true;
	}
	
	public float getShieldMod()
	{
		return 0;
	}
	
	public float getHullMod()
	{
		return 1;
	}
	
	public String getEpitaph()
	{
		switch (type)
		{
			case 0:
				return "%1$s couldn't dodge %2$s's missile";
			case 1:
				return "%1$s failed to avoid %2$s's missile";
			default:
				throw new Error();
		}
	}
	
}
