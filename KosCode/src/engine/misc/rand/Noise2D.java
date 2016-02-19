package engine.misc.rand;

public abstract class Noise2D extends Noise
{
	public final int getDimensions()
	{
		return 2;
	}
	
	public final double getValue(double[] coords)
	{
		if (coords.length < 1) return getValue(0, 0);
		if (coords.length < 2) return getValue(coords[0], 0);
		return getValue(coords[0], coords[1]);
	}
	
	public abstract double getValue(double x, double y);
}
