package engine.app.graphics;

import static org.lwjgl.opengl.GL11.*;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;

public class TextureLoader
{
	public static final int NEAREST = GL_NEAREST;
	public static final int LINEAR = GL_LINEAR;
	public static int filter = NEAREST;
	
	public static ArrayList<Texture> textures = new ArrayList<>();
	public static ArrayList<String> names = new ArrayList<>();
	
	public static boolean loadTexture(String path, String name) throws IOException
	{
		return loadTexture(new FileInputStream(path), name);
	}
	
	public static boolean loadTexture(InputStream in, String name) throws IOException
	{
		if (names.contains(name.toLowerCase())) throw new IllegalArgumentException("a texture with that name already exists");
		BufferedImage img = ImageIO.read(in);
		if (img == null) return false;
		if (Display.isCreated())
		{
			textures.add(createTexture(img));
			names.add(name.toLowerCase().replace('\\', '/'));
		}
		else
		{
			int imgWidth = img.getWidth();
			int imgHeight = img.getHeight();
			int texWidth = 1;
			while (texWidth < imgWidth)
			{
				texWidth *= 2;
			}
			int texHeight = 1;
			while (texHeight < imgHeight)
			{
				texHeight *= 2;
			}
			textures.add(new Texture(-1, imgWidth, imgHeight, texWidth, texHeight));
			names.add(name.toLowerCase().replace('\\', '/'));
		}
		return true;
	}
	
	public static Texture createTexture(BufferedImage img)
	{
		int texid = glGenTextures();
		glBindTexture(GL_TEXTURE_2D, texid);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, filter);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, filter);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP);
		
		int imgWidth = img.getWidth();
		int imgHeight = img.getHeight();
		int texWidth = 1;
		while (texWidth < imgWidth)
		{
			texWidth *= 2;
		}
		int texHeight = 1;
		while (texHeight < imgHeight)
		{
			texHeight *= 2;
		}
		BufferedImage tex = new BufferedImage(texWidth, texHeight, BufferedImage.TYPE_INT_ARGB);
		Graphics g = tex.getGraphics();
		g.drawImage(img, 0, 0, null);
		
		int[] rgba = new int[texWidth * texHeight];
		tex.getRGB(0, 0, texWidth, texHeight, rgba, 0, texWidth);
		ByteBuffer buffer = BufferUtils.createByteBuffer(rgba.length * 4);
		for (int index = 0; index < rgba.length; index++)
		{
			buffer.put((byte) (rgba[index] >> 16));
			buffer.put((byte) (rgba[index] >> 8));
			buffer.put((byte) rgba[index]);
			buffer.put((byte) (rgba[index] >> 24));
		}
		buffer.flip();
		glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, texWidth, texHeight, 0, GL_RGBA, GL_UNSIGNED_BYTE, buffer);
		return new Texture(texid, imgWidth, imgHeight, texWidth, texHeight);
	}
	
	public static void loadFolder(String path, int depth) throws IOException
	{
		loadFolder(new File(path), depth);
	}
	
	public static void loadFolder(File file, int depth) throws IOException
	{
		if (!file.isDirectory()) throw new IllegalArgumentException("not a folder");
		loadFolder(file, file, depth);
	}
	
	private static void loadFolder(File root, File file, int depth) throws IOException
	{
		if (depth == 0) return;
		File[] files = file.listFiles();
		for (File curr : files)
		{
			if (curr.isFile())
			{
				String name = curr.getPath();
				int len = root.getPath().length();
				name = name.substring(len + 1, name.lastIndexOf("."));
				loadTexture(new FileInputStream(curr.getPath()), name);
			}
			else if (curr.isDirectory())
			{
				loadFolder(root, curr, depth - 1);
			}
		}
	}
	
	public static Texture getTexture(String name)
	{
		int index = names.indexOf(name.toLowerCase().replace('\\', '/'));
		if (index == -1) throw new IllegalArgumentException("texture " + name);
		return textures.get(index);
	}
	
	public static String getName(Texture texture)
	{
		int index = textures.indexOf(texture);
		if (index == -1) return null;
		return names.get(index);
	}
}
