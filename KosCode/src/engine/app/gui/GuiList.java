package engine.app.gui;

import engine.app.graphics.g2d.SpriteSheet;
import engine.math.Rect2;

public class GuiList extends GuiComponent
{
	protected GuiList(SpriteSheet sprite, Rect2 bounds, int[] frames)
	{
		super(sprite, bounds);
		this.frames = new int[][]{frames};
	}
	
	public void update(int delta)
	{
	}
	
	public void draw()
	{
		if (parent == null) return;
	}
}
