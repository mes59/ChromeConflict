package world;

import static org.lwjgl.opengl.GL11.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Vector;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import main.CCUtils;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;

import world.field.WorldField;
import engine.app.graphics.Texture;
import engine.app.graphics.g2d.SpriteSheet;
import engine.util.IOUtils;

public class WorldIO
{
	private static final IOUtils utils = CCUtils.utils;
	public static final int MAGIC = 0x49574D46;
	public static final int VERSION = 1;
	
	private static byte[] imgBuff = null;
	private static byte[] cmpBuff = null;
	
	public static synchronized void create(File file, int air, double gravity, Vector<SpawnRegion> spawns,
			float[] bgc, BufferedImage[] layers, WorldField[] fields) throws IOException
	{
		if (layers.length < 4) throw new IllegalArgumentException("not enough layers");
		BufferedImage collision = layers[0];
		BufferedImage terrain = layers[1];
		BufferedImage cavebg = layers[2];
		BufferedImage background = layers[3];
		
		if (terrain.getWidth() != cavebg.getWidth()) throw new IllegalArgumentException("width");
		if (terrain.getHeight() != cavebg.getHeight()) throw new IllegalArgumentException("height");
		if (terrain.getWidth() != collision.getWidth()) throw new IllegalArgumentException("width");
		if (terrain.getHeight() != collision.getHeight()) throw new IllegalArgumentException("height");
		if (bgc != null && bgc.length != 3) bgc = null;
		int width = 2;
		while (width < terrain.getWidth())
		{
			width *= 2;
		}
		int height = 2;
		while (height < terrain.getHeight())
		{
			height *= 2;
		}
		
		FileOutputStream out = new FileOutputStream(file);
		utils.writeInt(out, MAGIC);
		utils.writeVarInt(out, VERSION);
		utils.writeInt(out, terrain.getWidth());
		utils.writeInt(out, terrain.getHeight());
		utils.writeInt(out, width);
		utils.writeInt(out, height);
		utils.writeInt(out, air);
		utils.writeDouble(out, gravity);
		if (spawns == null || spawns.isEmpty()) utils.writeVarInt(out, 0);
		else
		{
			utils.writeVarInt(out, spawns.size());
			for (SpawnRegion region : spawns)
			{
				region.write(out);
			}
		}
		if (bgc == null)
		{
			utils.writeFloat(out, 0f);
			utils.writeFloat(out, 0f);
			utils.writeFloat(out, 0f);
		}
		else
		{
			utils.writeFloat(out, bgc[0]);
			utils.writeFloat(out, bgc[1]);
			utils.writeFloat(out, bgc[2]);
		}
		
		int[] rgb = new int[collision.getWidth() * collision.getHeight()];
		collision.getRGB(0, 0, collision.getWidth(), collision.getHeight(), rgb, 0, collision.getWidth());
		if (imgBuff == null || imgBuff.length < rgb.length) imgBuff = new byte[rgb.length];
		if (cmpBuff == null || cmpBuff.length < rgb.length + 32) cmpBuff = new byte[rgb.length + 32];
		for (int i = 0; i < rgb.length; i++)
		{
			int value = rgb[i] & 0xFFFFFF;
			value = Math.min(Math.min(value >> 16 & 0xFF, value >> 8 & 0xFF), value & 0xFF);
			imgBuff[i] = (byte) (value < 0x80 ? 0 : -1);
		}
		Deflater def = new Deflater();
		def.setInput(imgBuff, 0, rgb.length);
		def.finish();
		int cmp = def.deflate(cmpBuff);
		if (!def.finished())
		{
			out.close();
			file.delete();
			throw new IOException("compression failed");
		}
		utils.writeInt(out, cmp);
		out.write(cmpBuff, 0, cmp);
		
		int exp = 4 * width * height;
		format(terrain, width, height);
		if (cmpBuff.length < exp + 32) cmpBuff = new byte[exp + 32];
		def.reset();
		def.setInput(imgBuff, 0, exp);
		def.finish();
		cmp = def.deflate(cmpBuff);
		if (!def.finished())
		{
			out.close();
			file.delete();
			throw new IOException("compression failed");
		}
		utils.writeInt(out, cmp);
		out.write(cmpBuff, 0, cmp);
		
		format(cavebg, width, height);
		if (cmpBuff.length < exp + 32) cmpBuff = new byte[exp + 32];
		def.reset();
		def.setInput(imgBuff, 0, exp);
		def.finish();
		cmp = def.deflate(cmpBuff);
		if (!def.finished())
		{
			out.close();
			file.delete();
			throw new IOException("compression failed");
		}
		utils.writeInt(out, cmp);
		out.write(cmpBuff, 0, cmp);
		
		if (background != null)
		{
			width = 2;
			while (width < background.getWidth())
			{
				width *= 2;
			}
			height = 2;
			while (height < background.getHeight())
			{
				height *= 2;
			}
			exp = 4 * width * height;
			format(background, width, height);
			if (cmpBuff.length < exp + 32) cmpBuff = new byte[exp + 32];
			def.reset();
			def.setInput(imgBuff, 0, exp);
			def.finish();
			cmp = def.deflate(cmpBuff);
			if (!def.finished())
			{
				out.close();
				file.delete();
				throw new IOException("compression failed");
			}
			
			utils.writeInt(out, cmp);
			utils.writeInt(out, background.getWidth());
			utils.writeInt(out, background.getHeight());
			utils.writeInt(out, width);
			utils.writeInt(out, height);
			out.write(cmpBuff, 0, cmp);
		}
		else utils.writeInt(out, 0);
		
		if (fields != null)
		{
			utils.writeVarInt(out, fields.length);
			for (WorldField field : fields)
			{
				field.write(out);
			}
		}
		else utils.writeVarInt(out, 0);
		out.close();
	}
	
	private static void format(BufferedImage img, int twidth, int theight) throws IOException
	{
		int width = img.getWidth();
		int height = img.getHeight();
		int tsize = 4 * twidth * theight;
		if (imgBuff.length < tsize) imgBuff = new byte[tsize];
		int[] rgba = img.getRGB(0, 0, width, height, null, 0, width);
		
		int tpos, rgb;
		for (int y = 0; y < theight; y++)
		{
			for (int x = 0; x < twidth; x++)
			{
				tpos = 4 * (y * twidth + x);
				if (x < width && y < height)
				{
					rgb = rgba[y * width + x];
					imgBuff[tpos] = (byte) (rgb >> 16);
					imgBuff[tpos + 1] = (byte) (rgb >> 8);
					imgBuff[tpos + 2] = (byte) rgb;
					imgBuff[tpos + 3] = (byte) (rgb >> 24);
				}
				else Arrays.fill(imgBuff, tpos, tpos + 4, (byte) 0);
			}
		}
	}
	
	public static synchronized World read(File file, boolean client) throws IOException
	{
		try
		{
			if (Display.isCreated() && !Display.isCurrent())
			{
				throw new IllegalStateException("no OGL context");
			}
		}
		catch (LWJGLException e)
		{
			throw new IllegalStateException("no OGL context", e);
		}
		
		FileInputStream in = new FileInputStream(file);
		int magic = utils.readInt(in);
		if (magic != MAGIC) throw new IOException("invalid format");
		int version = utils.readVarInt(in);
		if (version < 0) throw new IOException("invalid version");
		if (version > VERSION) throw new IOException("unknown version");
		int imgWidth = utils.readInt(in);
		int imgHeight = utils.readInt(in);
		int texWidth = utils.readInt(in);
		int texHeight = utils.readInt(in);
		int size = 4 * texWidth * texHeight;
		int air = utils.readInt(in);
		double gravity = utils.readDouble(in);
		World world;
		if (client)
		{
			world = new WorldClient(gravity);
			int count = utils.readVarInt(in);
			for (int i = 0; i < count; i++)
			{
				SpawnRegion.skip(in);
			}
			float[] bgc = new float[3];
			bgc[0] = utils.readFloat(in);
			bgc[1] = utils.readFloat(in);
			bgc[2] = utils.readFloat(in);
			((WorldClient) world).setBackground(bgc);
		}
		else
		{
			WorldServer sworld = new WorldServer(gravity);
			int count = utils.readVarInt(in);
			sworld.spawners.ensureCapacity(count);
			for (int i = 0; i < count; i++)
			{
				sworld.spawners.add(SpawnRegion.read(in));
			}
			world = sworld;
			IOUtils.skipFully(in, 12);
		}
		
		int cmp = utils.readInt(in);
		if (imgBuff == null || imgBuff.length < size) imgBuff = new byte[size];
		if (cmpBuff == null || cmpBuff.length < cmp) cmpBuff = new byte[cmp];
		IOUtils.readFully(in, cmpBuff, 0, cmp);
		Inflater inf = new Inflater();
		inf.setInput(cmpBuff, 0, cmp);
		try
		{
			inf.inflate(imgBuff, 0, size / 4);
		}
		catch (DataFormatException e)
		{
			throw new IOException("decompression failed", e);
		}
		if (!inf.finished()) throw new IOException("decompression failed");
		world.collision = new CollisionMap(imgWidth, imgHeight, imgBuff, air);
		
		cmp = utils.readInt(in);
		if (client)
		{
			if (imgBuff.length < size) imgBuff = new byte[size];
			if (cmpBuff.length < cmp) cmpBuff = new byte[cmp];
			IOUtils.readFully(in, cmpBuff, 0, cmp);
			inf.reset();
			inf.setInput(cmpBuff, 0, cmp);
			try
			{
				inf.inflate(imgBuff, 0, size);
			}
			catch (DataFormatException e)
			{
				throw new IOException("decompression failed", e);
			}
			if (!inf.finished()) throw new IOException("decompression failed");
			ByteBuffer buff = ByteBuffer.allocateDirect(size);
			buff.put(imgBuff, 0, size);
			buff.flip();
			
			int texid = glGenTextures();
			glBindTexture(GL_TEXTURE_2D, texid);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP);
			glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, texWidth, texHeight, 0, GL_RGBA, GL_UNSIGNED_BYTE, buff);
			WorldClient cworld = (WorldClient) world;
			cworld.terrain = new SpriteSheet(1, 1, new Texture(texid, imgWidth, imgHeight, texWidth, texHeight));
		}
		else IOUtils.skipFully(in, cmp);
		
		cmp = utils.readInt(in);
		if (client)
		{
			WorldClient cworld = (WorldClient) world;
			if (imgBuff.length < size) imgBuff = new byte[size];
			if (cmpBuff.length < cmp) cmpBuff = new byte[cmp];
			IOUtils.readFully(in, cmpBuff, 0, cmp);
			inf.reset();
			inf.setInput(cmpBuff, 0, cmp);
			try
			{
				inf.inflate(imgBuff, 0, size);
			}
			catch (DataFormatException e)
			{
				throw new IOException("decompression failed", e);
			}
			if (!inf.finished()) throw new IOException("decompression failed");
			ByteBuffer buff = ByteBuffer.allocateDirect(size);
			buff.put(imgBuff, 0, size);
			buff.flip();
			int texid = glGenTextures();
			glBindTexture(GL_TEXTURE_2D, texid);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP);
			glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, texWidth, texHeight, 0, GL_RGBA, GL_UNSIGNED_BYTE, buff);
			cworld.cavebg = new SpriteSheet(1, 1, new Texture(texid, imgWidth, imgHeight, texWidth, texHeight));
		}
		else IOUtils.skipFully(in, cmp);
		
		cmp = utils.readInt(in);
		if (client && cmp != 0)
		{
			int iwidth = utils.readInt(in);
			int iheight = utils.readInt(in);
			int twidth = utils.readInt(in);
			int theight = utils.readInt(in);
			int csize = 4 * twidth * theight;
			
			WorldClient cworld = (WorldClient) world;
			if (imgBuff.length < csize) imgBuff = new byte[csize];
			if (cmpBuff.length < cmp) cmpBuff = new byte[cmp];
			IOUtils.readFully(in, cmpBuff, 0, cmp);
			inf.reset();
			inf.setInput(cmpBuff, 0, cmp);
			try
			{
				inf.inflate(imgBuff, 0, csize);
			}
			catch (DataFormatException e)
			{
				throw new IOException("decompression failed", e);
			}
			if (!inf.finished()) throw new IOException("decompression failed");
			ByteBuffer buff = ByteBuffer.allocateDirect(csize);
			buff.put(imgBuff, 0, csize);
			buff.flip();
			int texid = glGenTextures();
			glBindTexture(GL_TEXTURE_2D, texid);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP);
			glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, twidth, theight, 0, GL_RGBA, GL_UNSIGNED_BYTE, buff);
			cworld.background = new SpriteSheet(1, 1, new Texture(texid, iwidth, iheight, twidth, theight));
			cworld.imageBackground = true;
		}
		else if (cmp != 0) IOUtils.skipFully(in, cmp);
		
		int fields = utils.readVarInt(in);
		world.fields.ensureCapacity(fields);
		for (int i = 0; i < fields; i++)
		{
			world.fields.add(WorldField.read(in));
		}
		return world;
	}
}
