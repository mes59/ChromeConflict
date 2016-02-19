package engine.util;

import java.util.Random;

public class RandUtils
{
	private static Random random = new Random();
	
	public static long randSeed()
	{
		return random.nextLong() ^ System.nanoTime();
	}
	
	public static int randInt()
	{
		return random.nextInt();
	}
	
	public static long randLong()
	{
		return random.nextLong();
	}
	
	public static float randFloat()
	{
		return random.nextFloat();
	}
	
	public static double randDouble()
	{
		return random.nextDouble();
	}
}
