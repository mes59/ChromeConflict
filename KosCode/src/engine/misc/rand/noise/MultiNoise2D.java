package engine.misc.rand.noise;

import engine.misc.rand.Noise2D;
import engine.misc.rand.itp.Interpolator;

public class MultiNoise2D extends Noise2D
{
	private Noise2D[] base;
	
	public MultiNoise2D(Noise2D... base)
	{
		this.base = base;
	}
	
	public void setInterpolator(Interpolator i)
	{
		for (Noise2D curr : base)
		{
			curr.setInterpolator(i);
		}
	}
	
	public double getValue(double x, double y)
	{
		double value = 0;
		for (int i = 0; i < base.length; i++)
		{
			double factor = Math.pow(2, i);
			value = value - value / factor + base[i].getValue(x * factor, y * factor) / factor;
		}
		return value;
	}
}
