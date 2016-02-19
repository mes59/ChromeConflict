package engine.app.gui;

import engine.app.event.MouseEvent;
import engine.app.graphics.g2d.SpriteSheet;
import engine.math.Rect2;

public class GuiBox extends GuiComponent
{
	protected byte active;
	
	public GuiBox(SpriteSheet sprite, Rect2 rect, int[] off, int[] on)
	{
		super(sprite, rect);
		frames = new int[][]{off, on};
		if (sprite == null) return;
	}
	
	public void update(int delta)
	{
		if (parent == null) return;
		if (Interface.mouse() == 0) return;
		
		byte next = 0;
		for (MouseEvent m : Interface.getMouseEvents())
		{
			next = max(next, event(m));
		}
		active = next;
	}
	
	private byte event(MouseEvent event)
	{
		if (bounds.isInside(event.posx, event.posy))
		{
			if (event.state && event.button == 0)
			{
				parent.action(this);
				return 1;
			}
		}
		return 0;
	}
	
	private byte max(byte a, byte b)
	{
		if (b > a) return b;
		return a;
	}
	
	public void draw()
	{
		if (sprite == null || parent == null) return;
		double sx = bounds.size.x() / sprite.getTileWidth();
		double sy = bounds.size.y() / sprite.getTileHeight();
		sprite.drawScaled(bounds.pos.x(), bounds.pos.y(), sx, sy, frames[active][0], frames[active][1], 0, 0, 0);
	}
	
	public boolean checked()
	{
		return active == 1;
	}
}
