package engine.misc.rand.noise;

import java.util.Random;

import engine.misc.rand.Noise2D;
import engine.misc.rand.itp.Interpolator;

public class ValueNoise2D extends Noise2D
{
	private int xFrequency;
	private int yFrequency;
	private double[][] field;
	private Interpolator itp;
	
	public ValueNoise2D(Random rand, int xFrequency, int yFrequency)
	{
		if (xFrequency < 2 || yFrequency < 2) throw new IllegalArgumentException("frequency must be above 1");
		this.xFrequency = xFrequency;
		this.yFrequency = yFrequency;
		field = new double[xFrequency][yFrequency];
		for (int x = 0; x < xFrequency; x++)
		{
			for (int y = 0; y < yFrequency; y++)
			{
				field[x][y] = rand.nextDouble() * 2 - 1;
			}
		}
		itp = Interpolator.LINEAR;
	}
	
	public void setInterpolator(Interpolator itp)
	{
		if (itp == null) throw new NullPointerException();
		this.itp = itp;
	}
	
	private double get(int x, int y)
	{
		x = x % xFrequency;
		if (x < 0) x += xFrequency;
		y = y % yFrequency;
		if (y < 0) y += yFrequency;
		return field[x][y];
	}
	
	public double getValue(double x, double y)
	{
		x = x % xFrequency;
		if (x < 0) x += xFrequency;
		y = y % yFrequency;
		if (y < 0) y += yFrequency;
		int absx = (int) x;
		int absy = (int) y;
		double fractx = x - absx;
		double fracty = y - absy;
		
		double valxy = get(absx, absy);
		double valxY = get(absx, absy + 1);
		double valXy = get(absx + 1, absy);
		double valXY = get(absx + 1, absy + 1);
		
		double valy = itp.interpolate(valxy, valXy, fractx);
		double valY = itp.interpolate(valxY, valXY, fractx);
		return itp.interpolate(valy, valY, fracty);
	}
}
