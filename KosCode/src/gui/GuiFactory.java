package gui;

import java.awt.Font;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import main.ChromeConflict;
import engine.app.graphics.Texture;
import engine.app.graphics.TextureLoader;
import engine.app.graphics.g2d.SpriteSheet;
import engine.app.graphics.g2d.TTFont;
import engine.app.gui.GuiButton;
import engine.app.gui.GuiLabel;
import engine.app.gui.GuiTextBox;
import engine.data.json.JSONArray;
import engine.data.json.JSONObject;
import engine.data.json.JSONParser;
import engine.data.json.JSONUtils;
import engine.math.Rect2;
import engine.math.vec.Vec2;

public class GuiFactory
{
	private static String skin;
	private static Vector<TTFont> fonts;
	private static Vector<ButtonStruct> buttons;
	private static JSONObject root;
	
	public static synchronized boolean init(String skin)
	{
		GuiFactory.skin = skin;
		fonts = new Vector<>();
		buttons = new Vector<>();
		try
		{
			File file = new File(ChromeConflict.inst.getResDir(), getResource("style.json"));
			Object obj = JSONParser.parse(new FileReader(file));
			if (obj instanceof JSONObject) readStyles((JSONObject) obj);
			else throw new IOException("malformed style JSON");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	private static void readStyles(JSONObject root)
	{
		GuiFactory.root = root;
		JSONArray arr = root.getArray("buttons");
		for (int i = 0; i < arr.size(); i++)
		{
			JSONObject obj = arr.getObject(i);
			if (obj.getBoolean("placeholder", false)) buttons.add(null);
			else buttons.add(new ButtonStruct(obj));
		}
	}
	
	private static class ButtonStruct
	{
		public final SpriteSheet sprite;
		public final TTFont font;
		public final int[] colors;
		public final int[][] frames;
		
		public ButtonStruct(JSONObject button)
		{
			Texture tex = TextureLoader.getTexture(getResource(button.getString("name")));
			sprite = new SpriteSheet(button.getInt("width"), button.getInt("height"), tex);
			String fs = button.getString("font", null);
			if (fs == null) font = null;
			else
			{
				Font f = Font.decode(fs);
				TTFont font = null;
				for (TTFont curr : fonts)
				{
					if (curr.font.equals(f))
					{
						font = curr;
						break;
					}
				}
				if (font == null)
				{
					font = new TTFont(f);
					fonts.add(font);
				}
				this.font = font;
			}
			
			JSONArray colArr = button.getArray("colors");
			if (colArr.size() != 3) throw new RuntimeException("invalid format");
			colors = new int[3];
			for (int i = 0; i < 3; i++)
			{
				int t = colArr.getType(i);
				if (t == JSONUtils.TYPE_NUMBER)
				{
					colors[i] = colArr.getInt(i);
				}
				else if (t == JSONUtils.TYPE_STRING)
				{
					try
					{
						colors[i] = Integer.parseInt(colArr.getString(i), 16);
					}
					catch (NumberFormatException e)
					{
						throw new RuntimeException("bad color string, must be HEX", e);
					}
				}
				else throw new RuntimeException("color must be number or string");
			}
			
			JSONArray frmArr = button.getArray("frames");
			if (frmArr.size() != 3) throw new RuntimeException("invalid format");
			frames = new int[3][2];
			for (int i = 0; i < 3; i++)
			{
				frames[i][0] = frmArr.getObject(i).getInt("x");
				frames[i][1] = frmArr.getObject(i).getInt("y");
			}
		}
	}
	
	public static String getSkin()
	{
		return skin;
	}
	
	public static String getResource(String name)
	{
		return "skins/" + skin + '/' + name;
	}
	
	public static int getTextureWidth(int idx)
	{
		return buttons.get(idx).sprite.getTileWidth();
	}
	
	public static int getTextureHeight(int idx)
	{
		return buttons.get(idx).sprite.getTileHeight();
	}
	
	public static GuiLabel createLabel(int idx, double posx, double posy, int color, String text)
	{
		return new GuiLabel(buttons.get(idx).font, new Vec2(posx, posy)).setText(text).setColor(color);
	}
	
	public static GuiLabel createCenteredLabel(int idx, double posx, double posy, int color, String text)
	{
		return new GuiLabel(buttons.get(idx).font, new Vec2(posx, posy)).setAlignment(1, 1).setText(text).setColor(color);
	}
	
	public static GuiLabel createOffsetLabel(int idx, double posx, double posy, int color, String text)
	{
		return new GuiLabel(buttons.get(idx).font, new Vec2(posx, posy)).setAlignment(2, 2).setText(text).setColor(color);
	}
	
	public static GuiButton createButton(int idx, double posx, double posy, int state, String text)
	{
		ButtonStruct s = buttons.get(idx);
		Rect2 rect = new Rect2(posx, posy, getTextureWidth(idx), getTextureHeight(idx));
		GuiButton button = new GuiButton(s.sprite, rect, state, s.frames);
		return button.setText(text).setFont(s.font).setColors(s.colors);
	}
	
	public static GuiButton createCenteredButton(int idx, double posx, double posy, int state, String text)
	{
		ButtonStruct s = buttons.get(idx);
		Rect2 rect = Rect2.createCentered(posx, posy, getTextureWidth(idx), getTextureHeight(idx));
		GuiButton button = new GuiButton(s.sprite, rect, state, s.frames);
		return button.setText(text).setFont(s.font).setColors(s.colors);
	}
	
	public static GuiTextBox createTextBox(int idx, double posx, double posy, int state)
	{
		ButtonStruct s = buttons.get(idx);
		Rect2 rect = new Rect2(posx, posy, getTextureWidth(idx), getTextureHeight(idx));
		GuiTextBox box = new GuiTextBox(s.sprite, rect, state, s.frames);
		return box.setFont(s.font).setColors(s.colors);
	}
	
	public static GuiTextBox createCenteredTextBox(int idx, double posx, double posy, int state)
	{
		ButtonStruct s = buttons.get(idx);
		Rect2 rect = Rect2.createCentered(posx, posy, getTextureWidth(idx), getTextureHeight(idx));
		GuiTextBox box = new GuiTextBox(s.sprite, rect, state, s.frames);
		return box.setFont(s.font).setColors(s.colors);
	}
	
	public static JSONObject getPage(String name)
	{
		return root.getObject(name);
	}
}
