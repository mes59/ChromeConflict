package engine.app.gui;

public class GuiMain
{
	private static volatile GuiContainer gui;
	private static volatile GuiContainer queue;
	
	private GuiMain()
	{
	}
	
	public static synchronized void update(int delta, boolean correct)
	{
		Interface.update(correct);
		if (queue != null)
		{
			gui = queue;
			queue = null;
		}
		if (gui != null)
		{
			gui.update(delta);
			gui.draw();
		}
	}
	
	public static synchronized void queue(GuiContainer container)
	{
		queue = container;
	}
	
	public static synchronized boolean isType(Class<? extends GuiContainer> cls)
	{
		// give null to check if there is no gui active
		if (cls == null) return gui == null;
		return cls.isInstance(gui);
	}
	
	public static synchronized void close()
	{
		if (gui != null)
		{
			gui.close();
			gui = null;
		}
	}
}
