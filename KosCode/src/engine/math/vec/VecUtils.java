package engine.math.vec;

public class VecUtils
{
	public static double distSqr2(double x1, double y1, double x2, double y2)
	{
		x1 -= x2;
		y1 -= y2;
		return x1 * x1 + y1 * y1;
	}
	
	public static double dist2(double x1, double y1, double x2, double y2)
	{
		x1 -= x2;
		y1 -= y2;
		return Math.sqrt(x1 * x1 + y1 * y1);
	}
	
	public static double distSqr3(double x1, double y1, double z1, double x2, double y2, double z2)
	{
		x1 -= x2;
		y1 -= y2;
		z1 -= z2;
		return x1 * x1 + y1 * y1 + z1 * z1;
	}
	
	public static double dist3(double x1, double y1, double z1, double x2, double y2, double z2)
	{
		x1 -= x2;
		y1 -= y2;
		z1 -= z2;
		return Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1);
	}
	
	public static double dot2(double x1, double y1, double x2, double y2)
	{
		return x1 * x2 + y1 * y2;
	}
	
	public static double dot3(double x1, double y1, double z1, double x2, double y2, double z2)
	{
		return x1 * x2 + y1 * y2 + z1 * z2;
	}
	
	public static double dot(double[] v1, double[] v2)
	{
		if (v1 == null) throw new NullPointerException("vec 1");
		if (v2 == null) throw new NullPointerException("vec 2");
		double v = 0;
		for (int i = 0; i < v1.length && i < v2.length; i++)
		{
			v += v1[i] * v2[i];
		}
		return v;
	}
	
	public static double[] cross3(double x1, double y1, double z1, double x2, double y2, double z2)
	{
		double[] v = new double[3];
		v[0] = y1 * z2 - z1 * y2;
		v[1] = z1 * x2 - x1 * z2;
		v[2] = x1 * y2 - y1 * x2;
		return v;
	}
	
	public static double[] cross3(double[] v1, double[] v2)
	{
		if (v1 == null) throw new NullPointerException("vec 1");
		if (v2 == null) throw new NullPointerException("vec 2");
		if (v1.length != 3) throw new IllegalArgumentException("vec 1");
		if (v2.length != 3) throw new IllegalArgumentException("vec 2");
		double[] v = new double[3];
		v[0] = v1[1] * v2[2] - v1[2] * v2[1];
		v[1] = v1[2] * v2[0] - v1[0] * v2[2];
		v[2] = v1[0] * v2[1] - v1[1] * v2[0];
		return v;
	}
}
