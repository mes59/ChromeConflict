package engine.misc.rand.noise;

import engine.math.SimpleMath;
import engine.misc.rand.Noise1D;
import engine.misc.rand.itp.Interpolator;

public class FractalNoise1D extends Noise1D
{
	private int octaves;
	private Noise1D base;
	
	public FractalNoise1D(int octaves, Noise1D base)
	{
		this.octaves = octaves;
		this.base = base;
	}
	
	public void setInterpolator(Interpolator i)
	{
		base.setInterpolator(i);
	}
	
	public double getValue(double x)
	{
		double value = 0;
		for (int i = 0; i < octaves; i++)
		{
			double factor = Math.pow(2, i);
			value = value - value / factor + base.getValue(x * factor) / factor;
		}
		return SimpleMath.clampd(value, -1, 1);
	}
}
