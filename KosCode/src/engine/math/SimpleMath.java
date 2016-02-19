package engine.math;

/**
 * a class which provides some math methods<br>
 * they are simpler and faster than those in Math
 */
public class SimpleMath
{
	/**
	 * gets the absolute of a number (integer version)
	 * @param i input value
	 * @return i if i >= 0 or -i if not
	 */
	public static int absi(int i)
	{
		return i < 0 ? -i : i;
	}
	
	/**
	 * clamps a value (integer version)<br>
	 * min and max can be in the wrong order
	 * @param i input value
	 * @param min minimal value
	 * @param max maximal value
	 * @return min <= i <= max
	 */
	public static int clampi(int i, int min, int max)
	{
		if (min == max) return min;
		if (min > max)
		{
			int t = max;
			max = min;
			min = t;
		}
		
		if (i < min) return min;
		if (i > max) return max;
		return i;
	}
	
	/**
	 * loops a value (integer version)<br>
	 * min and max can be in the wrong order
	 * @param i input value
	 * @param min minimal value
	 * @param max maximal value
	 * @return min <= i <= max
	 */
	public static int loopi(int i, int min, int max)
	{
		if (min == max) return min;
		if (min > max)
		{
			int t = max;
			max = min;
			min = t;
		}
		
		int value = (i - min) % (max - min);
		if (value < 0) value += max - min;
		return value + min;
	}
	
	/**
	 * gets the absolute of a number (integer version)
	 * @param l input value
	 * @return l if l >= 0 or -l if not
	 */
	public static long absl(long l)
	{
		return l < 0 ? -l : l;
	}
	
	/**
	 * clamps a value (long version)<br>
	 * min and max can be in the wrong order
	 * @param i input value
	 * @param min minimal value
	 * @param max maximal value
	 * @return min <= i <= max
	 */
	public static long clampl(long l, long min, long max)
	{
		if (min == max) return min;
		if (min > max)
		{
			long t = max;
			max = min;
			min = t;
		}
		
		if (l < min) return min;
		if (l > max) return max;
		return l;
	}
	
	/**
	 * loops a value (long version)<br>
	 * min and max can be in the wrong order
	 * @param i input value
	 * @param min minimal value
	 * @param max maximal value
	 * @return min <= i <= max
	 */
	public static long loopl(long l, long min, long max)
	{
		if (min == max) return min;
		if (min > max)
		{
			long t = max;
			max = min;
			min = t;
		}
		
		long value = (l - min) % (max - min);
		if (value < 0) value += max - min;
		return value + min;
	}
	
	/**
	 * gets the absolute of a number (integer version)
	 * @param f input value
	 * @return f if f >= 0 or -f if not
	 */
	public static float absf(float f)
	{
		return f < 0 ? -f : f;
	}
	
	/** rounds down (float version)
	 * @param f input value
	 * @return the highest i <= f
	 */
	public static int floorf(float f)
	{
		if (f < 0) return (int) f - 1;
		return (int) f;
	}
	
	/** rounds up (float version)
	 * @param f input value
	 * @return the lowest i >= f
	 */
	public static int ceilf(float f)
	{
		if (f < 0) return (int) f;
		return (int) f + 1;
	}
	
	/** rounds value (float version)
	 * @param f input value
	 * @return the i nearest to f
	 */
	public static int roundf(float f)
	{
		if (absf(f) % 1 < 0.5f)
		{
			if (f < 0) return (int) f - 1;
			return (int) f;
		}
		if (f < 0) return (int) f;
		return (int) f + 1;
	}
	
	/**
	 * clamps a value (float version)<br>
	 * min and max can be in the wrong order
	 * @param f input value
	 * @param min minimal value
	 * @param max maximal value
	 * @return min <= i <= max
	 */
	public static float clampf(float f, float min, float max)
	{
		if (min == max) return min;
		if (min > max)
		{
			float t = max;
			max = min;
			min = t;
		}
		
		if (f < min) return min;
		if (f > max) return max;
		return f;
	}
	
	/**
	 * loops a value (float version)<br>
	 * min and max can be in the wrong order
	 * @param f input value
	 * @param min minimal value
	 * @param max maximal value
	 * @return min <= i <= max
	 */
	public static float loopf(float f, float min, float max)
	{
		if (min == max) return min;
		if (min > max)
		{
			float t = max;
			max = min;
			min = t;
		}
		
		float value = (f - min) % (max - min);
		if (value < 0) value += max - min;
		return value + min;
	}
	
	/**
	 * gets the absolute of a number (integer version)
	 * @param d input value
	 * @return d if d >= 0 or -d if not
	 */
	public static double absd(double d)
	{
		return d < 0 ? -d : d;
	}
	
	/** rounds down (double version)
	 * @param d input value
	 * @return the highest l <= d
	 */
	public static long floord(double d)
	{
		if (d < 0) return (long) d - 1;
		return (long) d;
	}
	
	/** rounds up (double version)
	 * @param d input value
	 * @return the lowest l >= d
	 */
	public static long ceild(double d)
	{
		if (d < 0) return (long) d;
		return (long) d + 1;
	}
	
	/** rounds value (double version)
	 * @param d input value
	 * @return the l nearest to d
	 */
	public static long roundd(double d)
	{
		if (absd(d) % 1 < 0.5f)
		{
			if (d < 0) return (long) d - 1;
			return (long) d;
		}
		if (d < 0) return (long) d;
		return (long) d + 1;
	}
	
	/**
	 * clamps a value (double version)<br>
	 * min and max can be in the wrong order
	 * @param d input value
	 * @param min minimal value
	 * @param max maximal value
	 * @return min <= d <= max
	 */
	public static double clampd(double d, double min, double max)
	{
		if (min == max) return min;
		if (min > max)
		{
			double t = max;
			max = min;
			min = t;
		}
		
		if (d < min) return min;
		if (d > max) return max;
		return d;
	}
	
	/**
	 * loops a value (double version)<br>
	 * min and max can be in the wrong order
	 * @param d input value
	 * @param min minimal value
	 * @param max maximal value
	 * @return min <= d <= max
	 */
	public static double loopd(double d, double min, double max)
	{
		if (min == max) return min;
		if (min > max)
		{
			double t = max;
			max = min;
			min = t;
		}
		
		double value = (d - min) % (max - min);
		if (value < 0) value += max - min;
		return value + min;
	}
}
