package gui;

import engine.app.gui.GuiButton;
import engine.app.gui.GuiComponent;
import engine.app.gui.GuiContainer;
import engine.app.gui.GuiMain;

public class GuiMessage extends GuiContainer
{
	private GuiButton button;
	private GuiContainer next;
	
	public GuiMessage(String message, String button, GuiContainer next)
	{
		super(null);
		add(GuiFactory.createCenteredLabel(0, 564, 333, 0xFF0000, message));
		add(this.button = GuiFactory.createCenteredButton(1, 564, 381, 1, button));
		this.next = next;
	}
	
	public void action(GuiComponent component)
	{
		super.action(component);
		if (component == button) GuiMain.queue(next);
	}
}
