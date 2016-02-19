package sentinel;

import engine.math.SimpleMath;

public class Slot
{
	public int weapons;
	public int offset;
	public int arcsize;
	
	public Slot(int weapons, int offset, int arcsize)
	{
		this.weapons = weapons;
		this.offset = SimpleMath.clampi(offset, 0, 180);
		this.arcsize = SimpleMath.absi(arcsize);
	}
}
