package engine.misc.rand.itp;

public class RecursiveInterpolator extends Interpolator
{
	private Interpolator base;
	private int depth;
	
	public RecursiveInterpolator(Interpolator base, int depth)
	{
		if (depth < 1) throw new IllegalArgumentException("invalid depth");
		this.base = base;
		this.depth = depth;
	}
	
	public double interpolate(double a, double b, double x)
	{
		for (int i = 0; i < depth; i++)
		{
			x = base.interpolate(0, 1, x);
		}
		return base.interpolate(a, b, x);
	}
}
