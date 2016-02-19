package engine.app.gui;

import org.lwjgl.opengl.GL11;

import engine.app.event.MouseEvent;
import engine.app.graphics.g2d.SpriteSheet;
import engine.app.graphics.g2d.TTFont;
import engine.math.Rect2;
import engine.math.vec.Vec2;

public class GuiButton extends GuiComponent
{
	protected int state;
	protected int[] colors;
	protected TTFont font;
	protected String text;
	
	public GuiButton(SpriteSheet sprite, Rect2 rect, int state, int[][] frames)
	{
		super(sprite, rect);
		this.state = state;
		if (frames.length != 3) throw new IllegalArgumentException("frames");
		for (int i = 0; i < 3; i++)
		{
			if (frames[i].length != 2) throw new IllegalArgumentException("frames");
		}
		this.frames = frames;
	}
	
	public GuiButton setState(int state)
	{
		this.state = state;
		return this;
	}
	
	public int getState()
	{
		return state;
	}
	
	public GuiButton setFont(TTFont font)
	{
		this.font = font;
		return this;
	}
	
	public TTFont getFont()
	{
		return font;
	}
	
	public GuiButton setColors(int[] colors)
	{
		if (colors.length != 3) throw new IllegalArgumentException();
		this.colors = colors;
		return this;
	}
	
	public GuiButton setText(String text)
	{
		this.text = text;
		return this;
	}
	
	public String getText()
	{
		return text;
	}
	
	public void update(int delta)
	{
		if (parent == null) return;
		if (Interface.mouse() > 0 && state != 0)
		{
			int next = 1;
			for (MouseEvent m : Interface.getMouseEvents())
			{
				next = max(next, event(m));
			}
			if (state != 0) state = next;
		}
	}
	
	private int event(MouseEvent event)
	{
		if (bounds == null) return 0;
		if (bounds.isInside(event.posx, event.posy))
		{
			if (event.state && event.button == 0)
			{
				parent.action(this);
			}
			return 2;
		}
		return 1;
	}
	
	private int max(int a, int b)
	{
		if (b > a) return b;
		return a;
	}
	
	public void draw()
	{
		if (parent == null) return;
		if (sprite != null)
		{
			GL11.glColor4f(1, 1, 1, 1);
			int framex = frames[state][0];
			int framey = frames[state][1];
			sprite.drawPositioned(bounds.pos.x(), bounds.pos.y(), bounds.size.x(), bounds.size.y(), framex, framey, 0, 0, 0);
		}
		if (font != null && text != null)
		{
			if (colors != null)
			{
				int color = colors[state];
				GL11.glColor4ub((byte) (color >> 16), (byte) (color >> 8), (byte) color, (byte) -1);
			}
			else GL11.glColor4f(1, 1, 1, 1);
			Vec2 middle = bounds.getMiddle();
			font.drawString(text, middle.x(), middle.y(), 0.5f, 0.5f);
		}
	}
}
