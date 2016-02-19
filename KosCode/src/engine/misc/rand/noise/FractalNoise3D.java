package engine.misc.rand.noise;

import engine.misc.rand.Noise3D;
import engine.misc.rand.itp.Interpolator;

public class FractalNoise3D extends Noise3D
{
	private int octaves;
	private Noise3D base;
	
	public FractalNoise3D(int octaves, Noise3D base)
	{
		this.octaves = octaves;
		this.base = base;
	}
	
	public void setInterpolator(Interpolator i)
	{
		base.setInterpolator(i);
	}
	
	public double getValue(double x, double y, double z)
	{
		double value = 0;
		for (int i = 0; i < octaves; i++)
		{
			double factor = Math.pow(2, i);
			value = value - value / factor + base.getValue(x * factor, y * factor, z * factor) / factor;
		}
		return value;
	}
}
