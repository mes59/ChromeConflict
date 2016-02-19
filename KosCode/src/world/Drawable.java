package world;

import engine.app.graphics.g2d.Animation;
import engine.app.graphics.g2d.SpriteSheet;

public class Drawable
{
	private SpriteSheet sprite;
	private int framex, framey;
	private Animation anim;
	
	public Drawable(SpriteSheet sprite, int framex, int framey)
	{
		this.sprite = sprite;
		this.framex = framex;
		this.framey = framey;
	}
	
	public Drawable(Animation anim)
	{
		sprite = this.anim = anim.start();
	}
	
	public void update(int delta)
	{
		if (anim != null) anim.update(delta);
	}
	
	public void setFrame(int framex, int framey)
	{
		if (anim != null) anim.setFrame(framex, framey);
		else
		{
			this.framex = framex;
			this.framey = framey;
		}
	}
	
	public void draw(double x, double y, double cx, double cy, double ang)
	{
		if (anim != null) anim.drawScaled(x, y, 1, 1, cx, cy, ang);
		else sprite.drawScaled(x, y, 1, 1, framex, framey, cx, cy, ang);
	}
	
	public void drawPos(double x, double y, double sx, double sy, double cx, double cy, double ang)
	{
		if (anim != null) anim.drawPositioned(x, y, sx, sy, cx, cy, ang);
		else sprite.drawPositioned(x, y, sx, sy, framex, framey, cx, cy, ang);
	}
	
	public void drawScale(double x, double y, double sx, double sy, double cx, double cy, double ang)
	{
		if (anim != null) anim.drawScaled(x, y, sx, sy, cx, cy, ang);
		else sprite.drawScaled(x, y, sx, sy, framex, framey, cx, cy, ang);
	}
	
	public boolean isDrawable()
	{
		return sprite.isDrawable();
	}
	
	public boolean isRunning()
	{
		if (anim != null) return anim.running();
		return false;
	}
	
	public double getTileWidth()
	{
		return sprite.getTileWidth();
	}
	
	public double getTileHeight()
	{
		return sprite.getTileHeight();
	}
}
