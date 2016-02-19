package engine.app.gui;

import engine.app.graphics.g2d.Animation;
import engine.app.graphics.g2d.SpriteSheet;
import engine.math.Rect2;

public class GuiImage extends GuiComponent
{
	protected GuiImage(SpriteSheet sprite, Rect2 bounds)
	{
		super(sprite, bounds);
		frames = new int[0][0];
	}
	
	public void update(int delta)
	{
		((Animation) sprite).update(delta);
	}
	
	public void draw()
	{
		if (sprite == null || parent == null) return;
		double sx = bounds.size.x() / sprite.getTileWidth();
		double sy = bounds.size.y() / sprite.getTileHeight();
		((Animation) sprite).drawScaled(bounds.pos.x(), bounds.pos.y(), sx, sy, 0, 0, 0);
	}
}
