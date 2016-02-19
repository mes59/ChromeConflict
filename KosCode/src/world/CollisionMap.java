package world;

public class CollisionMap
{
	private int width;
	private int height;
	private boolean[][] map;
	private int air;
	
	public CollisionMap(int imgWidth, int imgHeight, byte[] buffer, int air)
	{
		width = imgWidth;
		height = imgHeight;
		map = new boolean[imgWidth][imgHeight];
		for (int x = 0; x < imgWidth; x++)
		{
			for (int y = 0; y < imgHeight; y++)
			{
				map[x][y] = buffer[x + y * imgWidth] < 0;
			}
		}
		if (air < 0) air = 0;
		this.air = air;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getAir()
	{
		return air;
	}
	
	public int getTotalHeight()
	{
		return height + air;
	}
	
	public int get(int x, int y)
	{
		if (x < 0 || x >= width) return 2;
		if (y < 0 || y >= height + air) return 2;
		if (y < air) return 0;
		return map[x][y - air] ? 0 : 1;
	}
	
	public int getRect(int startx, int starty, int endx, int endy)
	{
		if (startx > endx)
		{
			int tmp = startx;
			startx = endx;
			endx = tmp;
		}
		if (starty > endy)
		{
			int tmp = starty;
			starty = endy;
			endy = tmp;
		}
		
		if (startx < 0 || endx >= width) return 2;
		if (starty < 0 || endy >= height + air) return 2;
		if (endy < air) return 0;
		if (starty <= air) starty = 0;
		else starty -= air;
		endy -= air;
		for (int y = starty; y <= endy; y++)
		{
			for (int x = startx; x <= endx; x++)
			{
				if (!map[x][y]) return 1;
			}
		}
		return 0;
	}
}
