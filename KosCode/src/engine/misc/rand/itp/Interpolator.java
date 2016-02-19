package engine.misc.rand.itp;

public abstract class Interpolator
{
	public static final Interpolator CONSTANT = new Constant();
	public static final Interpolator NEAREST = new Nearest();
	public static final Interpolator LINEAR = new Linear();
	public static final Interpolator COSINE = new Cosine();
	public static final Interpolator FOURRIER = new Fourrier();
	
	public abstract double interpolate(double a, double b, double x);
	
	private static class Constant extends Interpolator
	{
		public double interpolate(double a, double b, double x)
		{
			return a;
		}
	}
	
	private static class Nearest extends Interpolator
	{
		public double interpolate(double a, double b, double x)
		{
			if (x < 0.5) return a;
			return b;
		}
	}
	
	private static class Linear extends Interpolator
	{
		public double interpolate(double a, double b, double x)
		{
			return a * (1 - x) + b * x;
		}
	}
	
	private static class Cosine extends Interpolator
	{
		public double interpolate(double a, double b, double x)
		{
			x = (1 - Math.cos(x * Math.PI)) / 2;
			return a * (1 - x) + b * x;
		}
	}
	
	private static class Fourrier extends Interpolator
	{
		public double interpolate(double a, double b, double x)
		{
			x = 3 * x * x - 2 * x * x * x;
			return a * (1 - x) + b * x;
		}
	}
}
