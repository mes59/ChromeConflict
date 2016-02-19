package engine.app.gui;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import engine.app.event.KeyEvent;
import engine.app.event.MouseEvent;
import engine.app.graphics.g2d.SpriteSheet;
import engine.app.graphics.g2d.TTFont;
import engine.math.Rect2;
import engine.math.vec.Vec2;

public class GuiTextBox extends GuiComponent
{
	protected int state;
	protected boolean focus;
	protected int[] colors;
	protected TTFont font;
	
	protected StringBuffer buff;
	private boolean changed;
	private String text;
	
	private int repeat;
	private int repkey;
	private char repchar;
	
	public GuiTextBox(SpriteSheet sprite, Rect2 rect, int state, int[][] frames)
	{
		super(sprite, rect);
		this.state = state;
		if (frames.length != 3) throw new IllegalArgumentException("frames");
		for (int i = 0; i < 3; i++)
		{
			if (frames[i].length != 2) throw new IllegalArgumentException("frames");
		}
		this.frames = frames;
		font = new TTFont("arial", (int) (rect.size.y() / 1.5f));
		buff = new StringBuffer();
		changed = true;
	}
	
	public GuiTextBox setState(int state)
	{
		this.state = state;
		return this;
	}
	
	public int getState()
	{
		return state;
	}
	
	public GuiTextBox setFont(TTFont font)
	{
		this.font = font;
		return this;
	}
	
	public TTFont getFont()
	{
		return font;
	}
	
	public GuiTextBox setColors(int[] colors)
	{
		if (colors.length != 3) throw new IllegalArgumentException();
		this.colors = colors;
		return this;
	}
	
	public GuiTextBox setText(String text)
	{
		buff.delete(0, buff.length());
		buff.append(text);
		return this;
	}
	
	public StringBuffer getBuffer()
	{
		return buff;
	}
	
	public String getText()
	{
		if (changed)
		{
			text = buff.toString();
			changed = false;
		}
		return text;
	}
	
	public void update(int delta)
	{
		if (parent == null) return;
		if (Interface.mouse() > 0)
		{
			int next = 0;
			for (MouseEvent m : Interface.getMouseEvents())
			{
				next = max(next, event(m));
			}
			if (state != 0) state = next;
		}
		
		if (state != 2 || !focus) return;
		if (repkey != -1)
		{
			if (!Keyboard.isKeyDown(repkey))
			{
				repkey = -1;
			}
			else
			{
				if (repeat > 0)
				{
					repeat += delta;
					if (repeat > 500)
					{
						repeat = 500 - repeat;
					}
				}
				else
				{
					repeat -= delta;
					int count = repeat / -50;
					if (count > 0)
					{
						repeat += count * 50;
						for (int i = 0; i < count; i++)
						{
							keypress(0, repkey, repchar);
						}
					}
				}
			}
		}
		
		if (Interface.keyboard() > 0)
		{
			for (KeyEvent event : Interface.getKeyboardEvents())
			{
				if (!event.state) continue;
				keypress(delta, event.key, event.ch);
			}
		}
	}
	
	private int event(MouseEvent event)
	{
		if (bounds == null)
		{
			focus = false;
			return 0;
		}
		
		if (event.state && event.button == 0)
		{
			if (bounds.isInside(event.posx, event.posy)) focus = true;
			else focus = false;
		}
		if (focus) return 2;
		if (state == 0) return 0;
		if (bounds.isInside(event.posx, event.posy)) return 2;
		return 1;
	}
	
	private void keypress(int delta, int key, char c)
	{
		if (repkey != key)
		{
			repeat = delta;
			repkey = key;
			repchar = c;
		}
		
		if (key == Keyboard.KEY_BACK)
		{
			if (buff.length() == 0) return;
			buff.setLength(buff.length() - 1);
		}
		else if (key == Keyboard.KEY_RETURN)
		{
			float x = Interface.getMouseX();
			float y = Interface.getMouseY();
			if (bounds.isInside(x, y)) state = 2;
			else state = 1;
			focus = false;
			parent.action(this);
		}
		else if (Character.getType(c) != 15) buff.append(c);
		changed = true;
	}
	
	private int max(int a, int b)
	{
		if (b > a) return b;
		return a;
	}
	
	public void draw()
	{
		if (font == null || parent == null) return;
		double sx = bounds.size.x() / sprite.getTileWidth();
		double sy = bounds.size.y() / sprite.getTileHeight();
		int framex = frames[state][0];
		int framey = frames[state][1];
		GL11.glColor4f(1, 1, 1, 1);
		sprite.drawScaled(bounds.pos.x(), bounds.pos.y(), sx, sy, framex, framey, 0, 0, 0);
		Vec2 pos = bounds.getMiddle();
		if (colors != null)
		{
			int color = colors[state];
			GL11.glColor4ub((byte) (color >> 16), (byte) (color >> 8), (byte) color, (byte) -1);
		}
		else GL11.glColor4f(1, 1, 1, 1);
		font.drawString(getText(), pos.x(), pos.y(), 0.5f, 0.5f);
	}
}
