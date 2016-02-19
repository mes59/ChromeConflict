package engine.app.gui;

import engine.app.graphics.g2d.SpriteSheet;
import engine.math.Rect2;

public abstract class GuiComponent
{
	protected SpriteSheet sprite;
	protected int[][] frames;
	public Rect2 bounds;
	protected GuiContainer parent;
	
	protected GuiComponent(SpriteSheet sprite, Rect2 bounds)
	{
		this.sprite = sprite;
		this.bounds = bounds;
	}
	
	public abstract void update(int delta);
	
	public abstract void draw();
}
