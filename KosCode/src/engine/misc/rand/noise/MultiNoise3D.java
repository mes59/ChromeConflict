package engine.misc.rand.noise;

import engine.misc.rand.Noise3D;
import engine.misc.rand.itp.Interpolator;

public class MultiNoise3D extends Noise3D
{
	private Noise3D[] base;
	private double complex;
	
	public MultiNoise3D(Noise3D... base)
	{
		if (base.length > 10) throw new IllegalArgumentException("too complex");
		this.base = base;
		complex = 2 - Math.pow(0.5, base.length - 1);
	}
	
	public void setInterpolator(Interpolator i)
	{
		for (Noise3D curr : base)
		{
			curr.setInterpolator(i);
		}
	}
	
	public double getValue(double x, double y, double z)
	{
		double value = 0;
		for (int i = 0; i < base.length; i++)
		{
			double factor = Math.pow(2, i);
			value += base[i].getValue(x * factor, y * factor, z * factor) / factor;
		}
		return value / complex;
	}
}
