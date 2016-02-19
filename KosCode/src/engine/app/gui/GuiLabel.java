package engine.app.gui;

import org.lwjgl.opengl.GL11;

import engine.app.graphics.g2d.TTFont;
import engine.math.vec.Vec2;

public class GuiLabel extends GuiComponent
{
	protected Vec2 pos;
	protected int hAlign;
	protected int vAlign;
	protected String text;
	protected float[] color;
	protected TTFont font;
	
	public GuiLabel(TTFont font, Vec2 pos)
	{
		super(null, null);
		this.pos = pos;
		text = "";
		color = new float[3];
		this.font = font;
	}
	
	public GuiLabel setColor(int color)
	{
		this.color[0] = (color >> 16 & 0xFF) / 255f;
		this.color[1] = (color >> 8 & 0xFF) / 255f;
		this.color[2] = (color & 0xFF) / 255f;
		return this;
	}
	
	public GuiLabel setAlignment(int hAlign, int vAlign)
	{
		if (hAlign < 0) hAlign = 0;
		if (hAlign > 2) hAlign = 2;
		if (vAlign < 0) vAlign = 0;
		if (vAlign > 2) vAlign = 2;
		this.hAlign = hAlign;
		this.vAlign = vAlign;
		return this;
	}
	
	public GuiLabel setText(String text)
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
	}
	
	public void draw()
	{
		if (parent == null || text == null) return;
		GL11.glColor4f(color[0], color[1], color[2], 1);
		font.drawString(text, pos.x(), pos.y(), hAlign / 2d, vAlign / 2d);
	}
}
