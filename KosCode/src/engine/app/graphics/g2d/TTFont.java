package engine.app.graphics.g2d;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import engine.app.graphics.TextureLoader;

public class TTFont
{
	public final Font font;
	protected int[] widthArr;
	protected int height;
	protected SpriteSheet texture;
	
	public TTFont(String encoded)
	{
		this(Font.decode(encoded));
	}
	
	public TTFont(String fontname, int pixels)
	{
		this(new Font(fontname, Font.PLAIN, pixels));
	}
	
	public TTFont(String fontname, int style, int pixels)
	{
		this(new Font(fontname, style, pixels));
	}
	
	public TTFont(Font font)
	{
		this.font = font;
		BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
		FontMetrics metrics = img.createGraphics().getFontMetrics(font);
		widthArr = metrics.getWidths();
		height = metrics.getHeight();
		int width = 0;
		for (int i = 0; i < 256; i++)
		{
			width = Math.max(width, widthArr[i]);
		}
		img = new BufferedImage(width * 16, height * 16, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.createGraphics();
		g.setFont(font);
		int ascent = metrics.getAscent();
		for (int i = 0; i < 256; i++)
		{
			int x = i % 16 * width;
			int y = i / 16 * height;
			g.setClip(x, y, width, height);
			g.drawChars(new char[]{(char) i}, 0, 1, x, y + ascent);
		}
		texture = new SpriteSheet(16, 16, TextureLoader.createTexture(img));
	}
	
	public String getFontName()
	{
		return font.getFontName();
	}
	
	public int getWidth(char c)
	{
		return widthArr[c];
	}
	
	public int getWidth(String str)
	{
		int width = 0;
		for (char c : str.toCharArray())
		{
			width += widthArr[c];
		}
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void drawChar(double posx, double posy, double cx, double cy, char c)
	{
		texture.drawScaled(posx, posy, 1, 1, c % 16, c / 16, cx, cy, 0);
	}
	
	public void drawString(String str, double posx, double posy, double cx, double cy)
	{
		posx -= cx * getWidth(str);
		posy -= cy * getHeight();
		for (char c : str.toCharArray())
		{
			drawChar(posx, posy, 0, 0, c);
			posx += getWidth(c);
		}
	}
}
