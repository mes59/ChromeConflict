package engine.swing.comp;

import java.awt.Dimension;
import java.awt.Graphics;

public interface IPanelPainter
{
	public void paint(Graphics g, Dimension bounds);
	
	public Dimension getMinimumSize();
	
	public Dimension getPreferredSize();
	
	public Dimension getMaximumSize();
}
