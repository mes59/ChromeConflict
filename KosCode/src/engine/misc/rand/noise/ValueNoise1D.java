package engine.misc.rand.noise;

import java.util.Random;

import engine.math.SimpleMath;
import engine.misc.rand.Noise1D;
import engine.misc.rand.itp.Interpolator;

public class ValueNoise1D extends Noise1D
{
	private int xFrequency;
	private double[] wave;
	private Interpolator itp;
	
	public ValueNoise1D(Random rand, int xFrequency)
	{
		if (xFrequency < 2) throw new IllegalArgumentException("frequency must be above 1");
		this.xFrequency = xFrequency;
		wave = new double[xFrequency];
		for (int i = 0; i < xFrequency; i++)
		{
			wave[i] = rand.nextDouble() * 2 - 1;
		}
		itp = Interpolator.LINEAR;
	}
	
	public void setInterpolator(Interpolator itp)
	{
		if (itp == null) throw new NullPointerException();
		this.itp = itp;
	}
	
	private double get(int x)
	{
		x = x % xFrequency;
		if (x < 0) x += xFrequency;
		return wave[x];
	}
	
	public double getValue(double x)
	{
		x = x % xFrequency;
		if (x < 0) x += xFrequency;
		int absx = (int) SimpleMath.floord(x);
		double fractx = x - absx;
		double valx = get(absx);
		double valX = get(absx + 1);
		return itp.interpolate(valx, valX, fractx);
	}
}
