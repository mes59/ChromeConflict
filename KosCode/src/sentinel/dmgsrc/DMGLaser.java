package sentinel.dmgsrc;

public class DMGLaser extends DamageSource
{
	public static final DMGLaser LIGHT = new DMGLaser(0);
	public static final DMGLaser HEAVY = new DMGLaser(1);
	public static final DMGLaser ORDNANCE = new DMGLaser(2);
	
	private int type;
	
	private DMGLaser(int type)
	{
		this.type = type;
	}
	
	public String getName()
	{
		switch (type)
		{
			case 0:
				return "Light Laser";
			case 1:
				return "Heavy Laser";
			case 2:
				return "Sunbeam Laser";
			default:
				throw new Error();
		}
	}
	
	public boolean getBypass()
	{
		return false;
	}
	
	public float getShieldMod()
	{
		return 1;
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
				return "%1$s was lasered by %2$s";
			case 1:
				return "%1$s was taught about the power of light by %2$s";
			case 2:
				return "%1$s stared into %2$s's sun too long";
			default:
				throw new Error();
		}
	}
}
