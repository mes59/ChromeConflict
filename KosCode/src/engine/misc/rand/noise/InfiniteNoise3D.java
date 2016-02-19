package engine.misc.rand.noise;

import java.util.Random;

import engine.math.SimpleMath;
import engine.misc.rand.Noise3D;
import engine.misc.rand.PseudoRandom;
import engine.misc.rand.itp.Interpolator;

public class InfiniteNoise3D extends Noise3D
{
	private PseudoRandom rng;
	private Interpolator itp;
	
	public InfiniteNoise3D(Random rand)
	{
		rng = new PseudoRandom(rand);
		itp = Interpolator.LINEAR;
	}
	
	public void setInterpolator(Interpolator itp)
	{
		if (itp == null) throw new NullPointerException();
		this.itp = itp;
	}
	
	private double get(int x, int y, int z)
	{
		return 2 * rng.randomDouble(rng.randomInt(rng.randomInt(x) ^ y) ^ z) - 1;
	}
	
	public double getValue(double x, double y, double z)
	{
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
