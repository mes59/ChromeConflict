package engine.app.event;

import java.util.Vector;

import org.lwjgl.input.Keyboard;

public class KeyEvent
{
	/** key which has changed */
	public int key;
	/** character on that key (0x00 if none) */
	public char ch;
	/** true if button was pressed, false otherwise */
	public boolean state;
	
	private KeyEvent(int key, char ch, boolean down)
	{
		this.key = key;
		this.ch = ch;
		state = down;
	}
	
	public static void readAll(Vector<KeyEvent> list)
	{
		list.clear();
		while (true)
		{
			KeyEvent event = read();
			if (event == null) break;
			list.add(event);
		}
	}
	
	public static KeyEvent read()
	{
		if (Keyboard.next())
		{
			int key = Keyboard.getEventKey();
			char ch = Keyboard.getEventCharacter();
			boolean state = Keyboard.getEventKeyState();
			return new KeyEvent(key, ch, state);
		}
		return null;
	}
}
