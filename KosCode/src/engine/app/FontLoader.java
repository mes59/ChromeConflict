package engine.app;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.TreeMap;

public class FontLoader
{
	private static TreeMap<String, Font> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
	
	public static boolean loadFont(File file) throws IOException
	{
		try
		{
			Font font = Font.createFont(Font.TRUETYPE_FONT, file);
			map.put(font.getName(), font);
			return true;
		}
		catch (FontFormatException e)
		{
			return false;
		}
	}
	
	public static void loadFolder(String path, int depth) throws IOException
	{
		File file = new File(path);
		if (!file.isDirectory()) throw new IOException("not a folder");
		loadFolder(file, depth);
	}
	
	public static void loadFolder(File file, int depth) throws IOException
	{
		if (depth == 0) return;
		File[] files = file.listFiles();
		for (File curr : files)
		{
			if (curr.isFile())
			{
				loadFont(curr);
			}
			else if (curr.isDirectory())
			{
				loadFolder(curr, depth - 1);
			}
		}
	}
	
	public static Font getFont(String name, float size)
	{
		Font font = map.get(name);
		if (font == null) throw new RuntimeException("font not loaded");
		return font.deriveFont(size);
	}
}
