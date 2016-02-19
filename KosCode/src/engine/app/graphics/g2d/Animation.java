package engine.app.graphics.g2d;

import engine.app.graphics.Texture;
import engine.math.SimpleMath;
import engine.util.Utils;

public class Animation extends SpriteSheet
{
	private static int supermask = 0;
	public static final int SWAP_DIR = 1;
	public static final int REVERSED = 2;
	public static final int ONLY_ONCE = 4;
	public static final int DISAPPEAR = 8;
	
	public static void setSuperFlag(int flag, boolean value)
	{
		supermask = Utils.setFlag(supermask, flag, value);
	}
	
	public static boolean getSuperFlag(int flag)
	{
		return Utils.getFlag(supermask, flag);
	}
	
	private int off;
	public int vel;
	public int mask;
	public int startx;
	public int starty;
	public int endx;
	public int endy;
	public int framex;
	public int framey;
	
	public Animation(String texture, int xcount, int ycount)
	{
		super(texture, xcount, ycount);
		mask = supermask;
		vel = 100;
		off = -1;
		endx = xcount - 1;
		endy = ycount - 1;
	}
	
	public Animation(Texture texture, int xcount, int ycount)
	{
		super(xcount, ycount, texture);
		mask = supermask;
		vel = 100;
		off = -1;
	}
	
	public Animation(SpriteSheet base)
	{
		super(base.tilesx, base.tilesy, base.texture);
		if (base instanceof Animation)
		{
			Animation abase = (Animation) base;
			vel = abase.vel;
			mask = abase.mask;
			startx = abase.startx;
			starty = abase.starty;
			endx = abase.endx;
			endy = abase.endy;
		}
	}
	
	public Animation setFlag(int flag, boolean value)
	{
		mask = Utils.setFlag(mask, flag, value);
		return this;
	}
	
	public boolean getFlag(int flag)
	{
		return Utils.getFlag(mask, flag);
	}
	
	public Animation setAnimation(int startx, int starty, int endx, int endy)
	{
		this.startx = startx;
		this.starty = starty;
		this.endx = endx;
		this.endy = endy;
		
		framex = SimpleMath.clampi(framex, startx, endx);
		framey = SimpleMath.clampi(framey, starty, endy);
		return this;
	}
	
	public Animation setFrame(int framex, int framey)
	{
		this.framex = framex;
		this.framey = framey;
		return this;
	}
	
	public Animation setSpeed(int speed)
	{
		vel = 1000 / speed;
		return this;
	}
	
	public Animation start()
	{
		off = 0;
		return this;
	}
	
	public boolean running()
	{
		return off != -1;
	}
	
	public void update(int delta)
	{
		if (off >= 0 && vel != 0)
		{
			int cycles = (delta + off) / vel;
			off += delta - cycles * vel;
			
			boolean once = getFlag(ONLY_ONCE);
			for (int c = 0; c < cycles; c++)
			{
				if (!getFlag(SWAP_DIR))
				{
					framex += 1;
					if (framex > endx || framex < startx)
					{
						framex = once ? endx : startx;
						framey += 1;
						if (framey > endy || framey < starty)
						{
							framey = once ? endy : starty;
							if (getFlag(DISAPPEAR))
							{
								stop();
							}
						}
					}
				}
				else
				{
					framey += 1;
					if (framey > endy || framey < starty)
					{
						framey = once ? endy : starty;
						framex += 1;
						if (framex > endx || framex < startx)
						{
							framex = once ? endx : starty;
							if (getFlag(DISAPPEAR))
							{
								stop();
							}
						}
					}
				}
			}
		}
	}
	
	public void drawScaled(double posx, double posy, double stretchx, double stretchy, double centerx, double centery, double angle)
	{
		if (!getFlag(DISAPPEAR) || off >= 0)
		{
			drawScaled(posx, posy, stretchx, stretchy, framex, framey, centerx, centery, angle);
		}
	}
	
	public void drawPositioned(double posx, double posy, double sizex, double sizey, double centerx, double centery, double angle)
	{
		if (!getFlag(DISAPPEAR) || off >= 0)
		{
			drawPositioned(posx, posy, sizex, sizey, framex, framey, centerx, centery, angle);
		}
	}
	
	public Animation stop()
	{
		off = -1;
		return this;
	}
}
