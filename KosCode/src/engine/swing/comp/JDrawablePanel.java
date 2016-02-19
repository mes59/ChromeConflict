package engine.swing.comp;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JDrawablePanel extends JPanel
{
	private static final long serialVersionUID = -1463493652287367497L;
	
	private final boolean fixed;
	private IPanelPainter painter;
	
	public JDrawablePanel(IPanelPainter painter)
	{
		if (painter != null)
		{
			fixed = true;
			this.painter = painter;
		}
		else fixed = false;
	}
	
	public void setPainter(IPanelPainter painter)
	{
		if (!fixed) this.painter = painter;
		else throw new IllegalStateException("this painter is fixed");
	}
	
	public Dimension getMinimumSize()
	{
		Dimension min = null;
		if (painter != null) min = painter.getMinimumSize();
		if (min == null) min = super.getMinimumSize();
		return min;
	}
	
	public Dimension getPreferredSize()
	{
		Dimension min = null;
		if (painter != null) min = painter.getPreferredSize();
		if (min == null) min = super.getPreferredSize();
		return min;
	}
	
	public Dimension getMaximumSize()
	{
		Dimension min = null;
		if (painter != null) min = painter.getMaximumSize();
		if (min == null) min = super.getMaximumSize();
		return min;
	}
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if (painter != null) painter.paint(g, getSize());
	}
}
