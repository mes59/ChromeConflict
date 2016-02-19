package engine.misc.rand.noise;

import java.util.Random;

import engine.math.SimpleMath;
import engine.misc.rand.Noise1D;
import engine.misc.rand.PseudoRandom;
import engine.misc.rand.itp.Interpolator;

public class InfiniteNoise1D extends Noise1D
{
	private PseudoRandom rng;
	private Interpolator itp;
	
	public InfiniteNoise1D(Random rand)
	{
		rng = new PseudoRandom(rand);
		itp = Interpolator.LINEAR;
	}
	
	public void setInterpolator(Interpolator itp)
	{
		if (itp == null) throw new NullPointerException();
		this.itp = itp;
	}
	
	public double getValue(double x)
	{
		int absx = (int) SimpleMath.floord(x);
		double fractx = x - absx;
		double valx = rng.randomDouble(absx);
		double valX = rng.randomDouble(absx + 1);
		return itp.interpolate(valx, valX, fractx) * 2 - 1;
	}
}
