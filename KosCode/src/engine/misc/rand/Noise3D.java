package engine.misc.rand;

public abstract class Noise3D extends Noise
{
	public final int getDimensions()
	{
		return 3;
	}
	
	public final double getValue(double[] coords)
	{
		if (coords.length < 1) return getValue(0, 0, 0);
		if (coords.length < 2) return getValue(coords[0], 0, 0);
		if (coords.length < 3) return getValue(coords[0], coords[1], 0);
		return getValue(coords[0], coords[1], coords[2]);
	}
	
	public abstract double getValue(double x, double y, double z);
}
