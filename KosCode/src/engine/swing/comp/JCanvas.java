package engine.swing.comp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ObjectInputStream;

import javax.swing.JPanel;

/**
 * simple class that does not change in size and can be drawn on<br>
 * changes are not applied automatically, to avoid partial drawings
 */
public class JCanvas extends JPanel
{
	// because java kept complaining :(
	private static final long serialVersionUID = 450773860746246107L;
	
	private BufferedImage img;
	private transient Graphics graphics;
	
	/**
	 * constructs a new canvas with the specified bounds
	 * @param width the width of the canvas
	 * @param height the height of the canvas
	 */
	public JCanvas(int width, int height)
	{
		img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		graphics = img.getGraphics();
		Dimension size = new Dimension(width, height);
		setMinimumSize(size);
		setPreferredSize(size);
	}
	
	/**
	 * sets the current drawing color<br>
	 * {@link JCanvas#setColor(Color)} should be preferred because this creates a new instance of {@link Color}
	 * @param rgb the new color in 24-bit RGB
	 * @see JCanvas#getRGB()
	 */
	public void setRGB(int rgb)
	{
		synchronized (graphics)
		{
			graphics.setColor(new Color(rgb));
		}
	}
	
	/**
	 * gets the current drawing color
	 * @return the color in 24-bit RGB
	 * @see JCanvas#setRGB(int)
	 */
	public int getRGB()
	{
		synchronized (graphics)
		{
			return graphics.getColor().getRGB();
		}
	}
	
	/**
	 * sets the current drawing color
	 * @see JCanvas#getColor()
	 */
	public void setColor(Color color)
	{
		synchronized (graphics)
		{
			graphics.setColor(color);
		}
	}
	
	/**
	 * gets the current drawing color
	 * @see JCanvas#setColor(Color)
	 */
	public Color getColor()
	{
		synchronized (graphics)
		{
			return graphics.getColor();
		}
	}
	
	/**
	 * clears the canvas (fills it with the default background color)
	 */
	public void clear()
	{
		synchronized (graphics)
		{
			graphics.clearRect(0, 0, img.getWidth(), img.getHeight());
		}
	}
	
	/**
	 * sets the color of the pixel specified
	 * @param x x coordinate of the pixel
	 * @param y y coordinate of the pixel
	 * @see JCanvas#setRGB(int)
	 * @see JCanvas#getRGB()
	 * @see JCanvas#setColor(Color)
	 * @see JCanvas#getColor()
	 */
	public void drawPixel(int x, int y)
	{
		synchronized (graphics)
		{
			img.setRGB(x, y, graphics.getColor().getRGB());
		}
	}
	
	/**
	 * draws a line between 2 colors
	 * @param x1 x coordinate of the first point
	 * @param y1 y coordinate of the first point
	 * @param x2 x coordinate of the second point
	 * @param y2 y coordinate of the second point
	 * @see JCanvas#setRGB(int)
	 * @see JCanvas#getRGB()
	 * @see JCanvas#setColor(Color)
	 * @see JCanvas#getColor()
	 */
	public void drawLine(int x1, int y1, int x2, int y2)
	{
		synchronized (graphics)
		{
			graphics.drawLine(x1, y1, x2, y2);
		}
	}
	
	/**
	 * draws a rectangle
	 * @param x x coordinate the top left corner
	 * @param y y coordinate the top left corner
	 * @param width width of the rectangle
	 * @param height height of the rectangle
	 * @see JCanvas#setRGB(int)
	 * @see JCanvas#getRGB()
	 * @see JCanvas#setColor(Color)
	 * @see JCanvas#getColor()
	 */
	public void drawRect(int x, int y, int width, int height)
	{
		synchronized (graphics)
		{
			graphics.drawRect(x, y, width, height);
		}
	}
	
	/**
	 * fills a rectangle
	 * @param x x coordinate the top left corner
	 * @param y y coordinate the top left corner
	 * @param width width of the rectangle
	 * @param height height of the rectangle
	 * @see JCanvas#setRGB(int)
	 * @see JCanvas#getRGB()
	 * @see JCanvas#setColor(Color)
	 * @see JCanvas#getColor()
	 */
	public void fillRect(int x, int y, int width, int height)
	{
		synchronized (graphics)
		{
			graphics.fillRect(x, y, width, height);
		}
	}
	
	/**
	 * draws an oval, specified is its bounding box
	 * @param x x coordinate the top left corner
	 * @param y y coordinate the top left corner
	 * @param width width of the rectangle
	 * @param height height of the rectangle
	 * @see JCanvas#setRGB(int)
	 * @see JCanvas#getRGB()
	 * @see JCanvas#setColor(Color)
	 * @see JCanvas#getColor()
	 */
	public void drawOval(int x, int y, int width, int height)
	{
		synchronized (graphics)
		{
			graphics.drawOval(x, y, width, height);
		}
	}
	
	/**
	 * fills an oval, specified is its bounding box
	 * @param x x coordinate the top left corner
	 * @param y y coordinate the top left corner
	 * @param width width of the rectangle
	 * @param height height of the rectangle
	 * @see JCanvas#setRGB(int)
	 * @see JCanvas#getRGB()
	 * @see JCanvas#setColor(Color)
	 * @see JCanvas#getColor()
	 */
	public void fillOval(int x, int y, int width, int height)
	{
		synchronized (graphics)
		{
			graphics.fillOval(x, y, width, height);
		}
	}
	
	/**
	 * draws a polygon
	 * @param x array containing the x coordinates of all points
	 * @param y array containing the y coordinates of all points
	 * @see JCanvas#setRGB(int)
	 * @see JCanvas#getRGB()
	 * @see JCanvas#setColor(Color)
	 * @see JCanvas#getColor()
	 */
	public void drawPoly(int[] x, int[] y)
	{
		synchronized (graphics)
		{
			if (x.length != y.length) throw new IllegalArgumentException("array mismatch");
			graphics.drawPolygon(x, y, x.length);
		}
	}
	
	/**
	 * fills a polygon
	 * @param x array containing the x coordinates of all points
	 * @param y array containing the y coordinates of all points
	 * @see JCanvas#setRGB(int)
	 * @see JCanvas#getRGB()
	 * @see JCanvas#setColor(Color)
	 * @see JCanvas#getColor()
	 */
	public void fillPoly(int[] x, int[] y)
	{
		synchronized (graphics)
		{
			if (x.length != y.length) throw new IllegalArgumentException("array mismatch");
			graphics.fillPolygon(x, y, x.length);
		}
	}
	
	/**
	 * draws an image onto the canvas
	 * @param img image to draw
	 * @param x the x coordinate of the top left corner on the canvas
	 * @param y the y coordinate of the top left corner on the canvas
	 */
	public void drawImage(Image img, int x, int y)
	{
		synchronized (graphics)
		{
			graphics.drawImage(img, x, y, null);
		}
	}
	
	/**
	 * draws an image partially onto the canvas
	 * @param img image to draw
	 * @param x the x coordinate of the top left corner on the canvas
	 * @param y the y coordinate of the top left corner on the canvas
	 * @param width how much of the image to draw (width)
	 * @param height how much of the image to draw (height)
	 */
	public void drawImage(Image img, int x, int y, int width, int height)
	{
		synchronized (graphics)
		{
			graphics.drawImage(img, x, y, width, height, null);
		}
	}
	
	protected void paintComponent(Graphics g)
	{
		synchronized (graphics)
		{
			super.paintComponent(g);
			int x = (getWidth() - img.getWidth()) / 2;
			int y = (getHeight() - img.getHeight()) / 2;
			g.drawImage(img, x, y, null);
		}
	}
	
	private void readObject(ObjectInputStream in) throws Exception
	{
		in.defaultReadObject();
		graphics = img.getGraphics();
	}
}
