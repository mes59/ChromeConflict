package main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CloseListener extends WindowAdapter
{
	public boolean closing;
	
	public void windowClosing(WindowEvent e)
	{
		closing = true;
	}
}
