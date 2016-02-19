package engine.app.event;

import engine.app.gui.GuiComponent;

/** simple class to indicate gui action */
public interface EventListener
{
	/**
	 * indicates that the gui component got used
	 * @param element the component which was used
	 */
	public void action(GuiComponent element);
}
