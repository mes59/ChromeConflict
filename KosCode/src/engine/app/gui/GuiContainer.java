package engine.app.gui;

import java.util.Vector;

import org.lwjgl.opengl.GL11;

import engine.app.event.EventListener;
import engine.app.graphics.g2d.SpriteSheet;

public class GuiContainer
{
	protected SpriteSheet skin;
	protected Vector<GuiComponent> adding;
	protected Vector<GuiComponent> components;
	protected Vector<GuiComponent> removing;
	protected EventListener listener;
	
	public GuiContainer(SpriteSheet skin)
	{
		this.skin = skin;
		adding = new Vector<>();
		components = new Vector<>();
		removing = new Vector<>();
	}
	
	public synchronized void add(GuiComponent component)
	{
		if (component == null) return;
		if (adding.contains(component)) return;
		adding.add(component);
	}
	
	public synchronized void remove(GuiComponent component)
	{
		if (component == null) return;
		if (removing.contains(component)) return;
		removing.add(component);
	}
	
	public synchronized void setListener(EventListener listener)
	{
		this.listener = listener;
	}
	
	public void action(GuiComponent component)
	{
		if (listener == null) return;
		listener.action(component);
	}
	
	public synchronized void update(int delta)
	{
		addRemoveComponents();
		for (GuiComponent component : components)
		{
			if (component == null) continue;
			component.update(delta);
		}
		addRemoveComponents();
	}
	
	private void addRemoveComponents()
	{
		for (GuiComponent component : adding)
		{
			if (component.parent == null)
			{
				components.add(component);
				component.parent = this;
			}
		}
		adding.clear();
		for (GuiComponent component : removing)
		{
			if (component.parent == this)
			{
				components.remove(component);
				component.parent = null;
			}
		}
		removing.clear();
	}
	
	public synchronized void draw()
	{
		if (skin != null)
		{
			GL11.glColor4f(1, 1, 1, 1);
			skin.drawScaled(0, 0, 1, 1, 0, 0, 0, 0, 0);
		}
		else if (components.size() > 0) GL11.glColor4f(1, 1, 1, 1);
		for (GuiComponent component : components)
		{
			if (component == null) continue;
			component.draw();
		}
	}
	
	public void close()
	{
	}
}
