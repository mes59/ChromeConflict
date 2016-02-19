package engine.misc.rand;

import engine.misc.rand.itp.Interpolator;

public abstract class Noise
{
	public abstract int getDimensions();
	
	public abstract double getValue(double[] coords);
	
	public abstract void setInterpolator(Interpolator itp);
}
