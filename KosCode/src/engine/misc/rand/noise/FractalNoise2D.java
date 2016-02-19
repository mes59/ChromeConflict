package engine.misc.rand.noise;

import engine.misc.rand.Noise2D;
import engine.misc.rand.itp.Interpolator;

public class FractalNoise2D extends Noise2D
{
	private int octaves;
	private Noise2D base;
	
	public FractalNoise2D(int octaves, Noise2D base)
	{
		this.octaves = octaves;
		this.base = base;
	}
	
	public void setInterpolator(Interpolator i)
	{
		base.setInterpolator(i);
	}
	
	public double getValue(double x, double y)
	{
		double value = 0;
		for (int i = 0; i < octaves; i++)
		{
			double factor = Math.pow(2, i);
			value = value - value / factor + base.getValue(x * factor, y * factor) / factor;
		}
		return value;
	}
}
