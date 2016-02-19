package main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;

import javax.imageio.ImageIO;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class ScreenshotCreator extends Thread
{
	private static final SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
	
	private File dataDir;
	private int width;
	private int height;
	private ByteBuffer buff;
	
	public ScreenshotCreator(File dataDir)
	{
		this.dataDir = dataDir;
		if (!Display.isCreated()) throw new IllegalStateException("display not created");
		System.out.println("creating screenshot");
		width = Display.getWidth();
		height = Display.getHeight();
		buff = BufferUtils.createByteBuffer(3 * width * height);
		GL11.glReadPixels(0, 0, width, height, GL11.GL_RGB, GL11.GL_UNSIGNED_BYTE, buff);
	}
	
	public void run()
	{
		try
		{
			File screen = new File(dataDir, "screenshots");
			if (!screen.exists() && !screen.mkdir()) throw new IOException("failed to create directory");
			int[] rgb = new int[width * height];
			for (int i = 0; i < rgb.length; i++)
			{
				int idx = i % width + (height - 1 - i / width) * width;
				int value = (buff.get() & 0xFF) << 16;
				value |= (buff.get() & 0xFF) << 8;
				rgb[idx] = value | buff.get() & 0xFF;
			}
			BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			img.setRGB(0, 0, width, height, rgb, 0, width);
			String name = "screenshot_" + format.format(System.currentTimeMillis());
			ImageIO.write(img, "png", new File(screen, name + ".png"));
			System.out.println("saved as " + name);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
