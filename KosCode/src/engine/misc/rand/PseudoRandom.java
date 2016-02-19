package engine.misc.rand;

import java.util.Random;

import engine.util.ByteUtils;

public strictfp class PseudoRandom
{
	private long[] randoms;
	private int[] offsets;
	
	public PseudoRandom(Random rand)
	{
		if (rand == null) rand = new Random();
		randoms = new long[256];
		for (int i = 0; i < randoms.length; i++)
		{
			randoms[i] = rand.nextLong();
		}
		offsets = new int[8];
		byte[] temp = ByteUtils.BIG_ENDIAN.getLBytes(rand.nextLong());
		for (int i = 0; i < 8; i++)
		{
			offsets[i] = temp[i] & 0xFF;
		}
	}
	
	public int randomInt(int x)
	{
		int value = 0;
		for (int i = 0; i < 4; i++)
		{
			value ^= randoms[(x >> i * 8) + offsets[i] & 0xFF];
		}
		return value;
	}
	
	public long randomLong(long x)
	{
		long value = 0;
		for (int i = 0; i < 8; i++)
		{
			value ^= randoms[(int) (x >> i * 8) + offsets[i] & 0xFF];
		}
		return value;
	}
	
	public float randomFloat(int x)
	{
		int rand = randomInt(x) & 0xFFFFFF;
		return rand / (float) (1 << 24);
	}
	
	public double randomDouble(long x)
	{
		long rand = randomLong(x) & 0x1FFFFFFFFFFFFFL;
		return rand / (double) (1L << 53);
	}
}
