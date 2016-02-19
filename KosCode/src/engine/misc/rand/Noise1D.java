package engine.misc.rand;

public abstract class Noise1D extends Noise
{
	public final int getDimensions()
	{
		return 1;
	}
	
	public final double getValue(double[] coords)
	{
		if (coords.length < 1) return getValue(0);
		return getValue(coords[0]);
	}
	
	public abstract double getValue(double x);
}
