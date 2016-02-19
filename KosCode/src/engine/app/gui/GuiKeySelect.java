package engine.app.gui;

import org.lwjgl.input.Keyboard;

import engine.app.event.KeyEvent;
import engine.app.event.MouseEvent;
import engine.app.graphics.g2d.SpriteSheet;
import engine.app.graphics.g2d.TTFont;
import engine.math.Rect2;

public class GuiKeySelect extends GuiButton
{
	protected byte state;
	protected TTFont font;
	public int key;
	
	public GuiKeySelect(SpriteSheet sprite, Rect2 rect, int state, int size, int defkey, int[][] frames)
	{
		super(sprite, rect, state, frames);
		if (size == -1)
		{
			size = (int) rect.size.y() - 8;
		}
		font = new TTFont("arial", size);
		key = defkey;
	}
	
	public void update(int delta)
	{
		if (state != 2)
		{
			super.update(delta);
		}
		if (state != 2) return;
		
		if (Interface.keyboard() > 0)
		{
			for (KeyEvent k : Interface.getKeyboardEvents())
			{
				key = k.key;
			}
		}
		if (Interface.mouse() > 0)
		{
			for (MouseEvent e : Interface.getMouseEvents())
			{
				if (bounds.isInside(e.posx, e.posy)) state = 1;
				else state = 0;
			}
		}
	}
	
	public void draw()
	{
		if (parent == null) return;
		super.draw();
		String kname = Keyboard.getKeyName(key);
		font.drawString(kname, bounds.pos.x(), bounds.pos.y(), 0.5f, 0.5f);
	}
}
