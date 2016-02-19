package engine.app.gui;

import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import org.lwjgl.BufferUtils;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector4f;

import engine.app.event.KeyEvent;
import engine.app.event.MouseEvent;
import engine.app.graphics.GLBase;
import engine.math.SimpleMath;
import engine.math.vec.Vec2;

public class Interface
{
	private static FloatBuffer buff = BufferUtils.createFloatBuffer(16);
	private static Matrix4f matrix = new Matrix4f();
	private static Vector4f vector = new Vector4f();
	
	private static final Vector<KeyEvent> keyboard = new Vector<>();
	private static final Vector<MouseEvent> mouse = new Vector<>();
	private static final List<KeyEvent> sKeys = Collections.unmodifiableList(keyboard);
	private static final List<MouseEvent> sMouse = Collections.unmodifiableList(mouse);
	
	/**
	 * updates the event list, removes the current ones and gets the new ones<br>
	 * @param correct if true the mouse events will be "reverted" so that they
	 * 		represent GL coordinates and not window coordinates
	 */
	public static void update(boolean correct)
	{
		if (Keyboard.isCreated()) KeyEvent.readAll(keyboard);
		if (Mouse.isCreated())
		{
			MouseEvent.readAll(mouse);
			if (correct)
			{
				GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, buff);
				matrix.load(buff).invert();
				buff.rewind();
				float x, y;
				Vec2 displayMid = GLBase.getDisplayMiddle();
				for (MouseEvent e : mouse)
				{
					x = (float) (e.posx / displayMid.x()) - 1f;
					y = (float) (e.posy / displayMid.y()) - 1f;
					vector.set(x, y, 0, 1);
					Matrix4f.transform(matrix, vector, vector);
					if (!Double.isNaN(vector.x) && !Double.isNaN(vector.y))
					{
						e.posx = SimpleMath.roundf(vector.x);
						e.posy = SimpleMath.roundf(vector.y);
						
						x = (float) (e.diffx / displayMid.x()) - 1f;
						y = (float) (e.diffy / displayMid.y()) - 1f;
						vector.set(x, y, 0, 1);
						Matrix4f.transform(matrix, vector, vector);
						if (!Double.isNaN(vector.x) && !Double.isNaN(vector.y))
						{
							e.diffx = SimpleMath.roundf(vector.x);
							e.diffy = SimpleMath.roundf(vector.y);
						}
					}
				}
			}
		}
	}
	
	/** returns a write-protected list for all keyboard events */
	public static List<KeyEvent> getKeyboardEvents()
	{
		return sKeys;
	}
	
	/** returns a write-protected list for all mouse events */
	public static List<MouseEvent> getMouseEvents()
	{
		return sMouse;
	}
	
	/** how many events the last update yielded */
	public static int events()
	{
		return mouse.size() + keyboard.size();
	}
	
	/** how many keyboard events the last update yielded */
	public static int keyboard()
	{
		return keyboard.size();
	}
	
	/** how many mouse events the last update yielded */
	public static int mouse()
	{
		return mouse.size();
	}
	
	public static int getMouseX()
	{
		return Mouse.getX();
	}
	
	public static int getMouseY()
	{
		return Mouse.getY();
	}
	
	public static int getDeltaX()
	{
		return Mouse.getDX();
	}
	
	public static int getDeltaY()
	{
		return Mouse.getDY();
	}
}
