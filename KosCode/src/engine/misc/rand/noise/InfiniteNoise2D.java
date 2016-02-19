package engine.misc.rand.noise;

import java.util.Random;

import engine.math.SimpleMath;
import engine.misc.rand.Noise2D;
import engine.misc.rand.PseudoRandom;
import engine.misc.rand.itp.Interpolator;

public class InfiniteNoise2D extends Noise2D
{
	private PseudoRandom rng;
	private Interpolator itp;
	
	public InfiniteNoise2D(Random rand)
	{
		rng = new PseudoRandom(rand);
		itp = Interpolator.LINEAR;
	}
	
	public void setInterpolator(Interpolator itp)
	{
		if (itp == null) throw new NullPointerException();
		this.itp = itp;
	}
	
	private double get(int x, int y)
	{
		return 2 * rng.randomDouble(rng.randomInt(x) ^ y) - 1;
	}
	
	public double getValue(double x, double y)
	{
		int absx = (int) SimpleMath.floord(x);
		int absy = (int) SimpleMath.floord(y);
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
