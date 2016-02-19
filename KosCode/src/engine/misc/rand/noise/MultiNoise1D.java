package engine.misc.rand.noise;

import engine.math.SimpleMath;
import engine.misc.rand.Noise1D;
import engine.misc.rand.itp.Interpolator;

public class MultiNoise1D extends Noise1D
{
	private Noise1D[] base;
	
	public MultiNoise1D(Noise1D... base)
	{
		this.base = base;
	}
	
	public void setInterpolator(Interpolator i)
	{
		for (Noise1D curr : base)
		{
			curr.setInterpolator(i);
		}
	}
	
	public double getValue(double x)
	{
		double value = 0;
		for (int i = 0; i < base.length; i++)
		{
			double factor = Math.pow(2, i);
			value = value - value / factor + base[i].getValue(x * factor) / factor;
		}
		return SimpleMath.clampd(value, -1, 1);
	}
}
