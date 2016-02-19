package engine.app.event;

import java.util.Vector;

import org.lwjgl.input.Mouse;

public class MouseEvent
{
	/** the button which was changed (-1 if this event indicates mouse movement) */
	public int button;
	/** true if button was pressed, false otherwise */
	public boolean state;
	/** indicates mouse wheel change */
	public int wheel;
	
	/** x position of the mouse on screen */
	public int posx;
	/** y position of the mouse on screen */
	public int posy;
	/** x movement since the last event */
	public int diffx;
	/** y movement since the last event */
	public int diffy;
	
	private MouseEvent(int button, boolean state, int wheel, int posx, int posy, int diffx, int diffy)
	{
		this.button = button;
		this.state = state;
		this.wheel = wheel;
		
		this.posx = posx;
		this.posy = posy;
		this.diffx = diffx;
		this.diffy = diffy;
	}
	
	public static void readAll(Vector<MouseEvent> list)
	{
		list.clear();
		while (true)
		{
			MouseEvent event = read();
			if (event == null) break;
			list.add(event);
		}
	}
	
	private static MouseEvent read()
	{
		if (Mouse.next())
		{
			int button = Mouse.getEventButton();
			boolean state = Mouse.getEventButtonState();
			int wheel = Mouse.getEventDWheel();
			
			int posx = Mouse.getEventX();
			int posy = Mouse.getEventY();
			int difx = Mouse.getEventDX();
			int dify = Mouse.getEventDY();
			return new MouseEvent(button, state, wheel, posx, posy, difx, dify);
		}
		return null;
	}
	
	public String toString()
	{
		if (button == -1)
		{
			return "Moved to " + posx + " " + posy + " (by " + diffx + " " + diffy + ") pixels";
		}
		else return "Button " + button + (state ? " pressed" : " released");
	}
}
