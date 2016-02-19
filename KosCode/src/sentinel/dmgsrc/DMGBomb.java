package sentinel.dmgsrc;

public class DMGBomb extends DamageSource
{
	public static final DMGBomb LIGHT = new DMGBomb(0);
	public static final DMGBomb HEAVY = new DMGBomb(1);
	public static final DMGBomb INFINI = new DMGBomb(2);
	
	private int type;
	
	private DMGBomb(int type)
	{
		this.type = type;
	}
	
	public String getName()
	{
		switch (type)
		{
			case 0:
				return "Light Bomb";
			case 1:
				return "Heavy Bomb";
			case 2:
				return "Infinity Bomb";
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
				return "%1$s was bombed by %2$s";
			case 1:
				return "%1$s was bombarded by %2$s";
			case 2:
				return "%1$s was deleted by %2$s";
			default:
				throw new Error();
		}
	}
	
}
