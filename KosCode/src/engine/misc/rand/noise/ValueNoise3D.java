package engine.misc.rand.noise;

import java.util.Random;

import engine.math.SimpleMath;
import engine.misc.rand.Noise3D;
import engine.misc.rand.itp.Interpolator;

public class ValueNoise3D extends Noise3D
{
	private int xFrequency;
	private int yFrequency;
	private int zFrequency;
	private double[][][] volume;
	private Interpolator itp;
	
	public ValueNoise3D(Random rand, int xFrequency, int yFrequency, int zFrequency)
	{
		if (xFrequency < 2 || yFrequency < 2 || zFrequency < 2) throw new IllegalArgumentException("frequency must be above 1");
		this.xFrequency = xFrequency;
		this.yFrequency = yFrequency;
		this.zFrequency = zFrequency;
		volume = new double[xFrequency][yFrequency][zFrequency];
		for (int x = 0; x < xFrequency; x++)
		{
			for (int y = 0; y < yFrequency; y++)
			{
				for (int z = 0; z < zFrequency; z++)
				{
					volume[x][y][z] = rand.nextDouble() * 2 - 1;
				}
			}
		}
		itp = Interpolator.LINEAR;
	}
	
	public void setInterpolator(Interpolator itp)
	{
		if (itp == null) throw new NullPointerException();
		this.itp = itp;
	}
	
	private double get(int x, int y, int z)
	{
		x = x % xFrequency;
		if (x < 0) x += xFrequency;
		y = y % yFrequency;
		if (y < 0) y += yFrequency;
		z = z % yFrequency;
		if (z < 0) z += zFrequency;
		return volume[x][y][z];
	}
	
	public double getValue(double x, double y, double z)
	{
		x = x % xFrequency;
		if (x < 0) x += xFrequency;
		y = y % yFrequency;
		if (y < 0) y += yFrequency;
		z = z % yFrequency;
		if (z < 0) z += zFrequency;
		int absx = (int) SimpleMath.floord(x);
		int absy = (int) SimpleMath.floord(y);
		int absz = (int) SimpleMath.floord(z);
		double fractx = x - absx;
		double fracty = y - absy;
		double fractz = z - absz;
		
		double valxyz = get(absx, absy, absz);
		double valXyz = get(absx + 1, absy, absz);
		double valxYz = get(absx, absy + 1, absz);
		double valXYz = get(absx + 1, absy + 1, absz);
		double valxyZ = get(absx, absy, absz + 1);
		double valXyZ = get(absx + 1, absy, absz + 1);
		double valxYZ = get(absx, absy + 1, absz + 1);
		double valXYZ = get(absx + 1, absy + 1, absz + 1);
		
		double valyz = itp.interpolate(valxyz, valXyz, fractx);
		double valYz = itp.interpolate(valxYz, valXYz, fractx);
		double valyZ = itp.interpolate(valxyZ, valXyZ, fractx);
		double valYZ = itp.interpolate(valxYZ, valXYZ, fractx);
		double valz = itp.interpolate(valyz, valYz, fracty);
		double valZ = itp.interpolate(valyZ, valYZ, fracty);
		return itp.interpolate(valz, valZ, fractz);
	}
}
