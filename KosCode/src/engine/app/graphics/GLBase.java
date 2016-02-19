package engine.app.graphics;

import static org.lwjgl.opengl.GL11.*;

import java.util.ArrayList;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import engine.math.vec.Vec2;

public class GLBase
{
	public static DisplayMode[] getSuitableModes() throws LWJGLException
	{
		ArrayList<DisplayMode> modes = new ArrayList<>();
		DisplayMode[] allmodes = Display.getAvailableDisplayModes();
		DisplayMode desktop = Display.getDesktopDisplayMode();
		for (int i = 0; i < allmodes.length; i++)
		{
			if (allmodes[i].getFrequency() == desktop.getFrequency() && allmodes[i].getBitsPerPixel() == desktop.getBitsPerPixel())
			{
				modes.add(allmodes[i]);
			}
		}
		allmodes = new DisplayMode[modes.size()];
		for (int i = 0; i < allmodes.length; i++)
		{
			allmodes[i] = modes.get(i);
		}
		return allmodes;
	}
	
	public static DisplayMode getFullscreen() throws LWJGLException
	{
		DisplayMode desktop = Display.getDesktopDisplayMode();
		int sizex = desktop.getWidth();
		int sizey = desktop.getHeight();
		int colors = desktop.getBitsPerPixel();
		int freq = desktop.getFrequency();
		
		DisplayMode[] modes = Display.getAvailableDisplayModes();
		for (DisplayMode mode : modes)
		{
			if (mode.getWidth() == sizex && mode.getHeight() == sizey && mode.getBitsPerPixel() == colors && mode.getFrequency() == freq)
			{
				return mode;
			}
		}
		return null;
	}
	
	public static void init(DisplayMode mode, boolean fullscreen) throws LWJGLException
	{
		initDisplay(mode, fullscreen);
		initOpenGL(mode.getWidth(), mode.getHeight());
	}
	
	public static void init(int sizex, int sizey) throws LWJGLException
	{
		initDisplay(new DisplayMode(sizex, sizey), false);
		initOpenGL(sizex, sizey);
	}
	
	public static void initDisplay(DisplayMode mode, boolean fullscreen) throws LWJGLException
	{
		Display.setDisplayMode(mode);
		Display.setFullscreen(fullscreen);
		if (!Display.isCreated()) Display.create();
	}
	
	public static void initDisplay(int sizex, int sizey) throws LWJGLException
	{
		Display.setDisplayMode(new DisplayMode(sizex, sizey));
		if (!Display.isCreated()) Display.create();
	}
	
	public static void initOpenGL(int sizex, int sizey)
	{
		initOpenGL(0, sizex, sizey, 0);
	}
	
	public static void initOpenGL(int left, int right, int bottom, int top)
	{
		if (Display.isCreated())
		{
			glMatrixMode(GL_PROJECTION);
			glLoadIdentity();
			GLUtils.Ortho.create(left, right, bottom, top, -1, 1);
			glEnable(GL_TEXTURE_2D);
			glEnable(GL_BLEND);
			glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
			glMatrixMode(GL_MODELVIEW);
			glLoadIdentity();
		}
		else throw new IllegalStateException("display not created");
	}
	
	public static void initOpenGLU(float fov, float aspect, float near, float far)
	{
		if (Display.isCreated())
		{
			glMatrixMode(GL_PROJECTION);
			glLoadIdentity();
			GLUtils.Perspective.create(fov, aspect, near, far);
			glEnable(GL_DEPTH_TEST);
			glEnable(GL_TEXTURE_2D);
			glEnable(GL_BLEND);
			glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
			glMatrixMode(GL_MODELVIEW);
			glLoadIdentity();
		}
		else throw new IllegalStateException("display not created");
	}
	
	public static void updateDisplay(int freq)
	{
		if (Display.isCreated())
		{
			Display.update();
			glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
		}
		Display.sync(freq);
	}
	
	public static Vec2 getDisplaySize()
	{
		DisplayMode mode = Display.getDisplayMode();
		return new Vec2(mode.getWidth(), mode.getHeight());
	}
	
	public static Vec2 getDisplayMiddle()
	{
		Vec2 size = getDisplaySize();
		size.x(size.x() / 2);
		size.y(size.y() / 2);
		return size;
	}
	
	public static boolean closing()
	{
		return Display.isCloseRequested();
	}
}
