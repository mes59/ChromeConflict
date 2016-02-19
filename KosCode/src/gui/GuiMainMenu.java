package gui;

import java.io.IOException;

import main.ChromeConflict;

import org.lwjgl.input.Keyboard;

import engine.app.event.KeyEvent;
import engine.app.graphics.g2d.SpriteSheet;
import engine.app.gui.GuiButton;
import engine.app.gui.GuiComponent;
import engine.app.gui.GuiContainer;
import engine.app.gui.GuiMain;
import engine.app.gui.Interface;

@SuppressWarnings("unused")
public class GuiMainMenu extends GuiContainer
{
	private GuiButton multiplayer;
	private GuiButton singleplayer;
	private GuiButton rewards;
	private GuiButton manual;
	private GuiButton achievements;
	private GuiButton configuration;
	private GuiButton champions;
	private GuiButton highscores;
	private GuiButton options;
	
	public GuiMainMenu()
	{
		super(new SpriteSheet(GuiFactory.getResource("mainmenu"), 1, 1));
		add(multiplayer = GuiFactory.createCenteredButton(1, 561, 225, 1, "MULTIPLAYER"));
		
		add(singleplayer = GuiFactory.createCenteredButton(1, 421, 419, 1, "SINGLEPLAYER"));
		add(rewards = GuiFactory.createCenteredButton(1, 421, 489, 0, "REWARDS"));
		add(manual = GuiFactory.createCenteredButton(1, 421, 559, 0, "MANUAL"));
		add(achievements = GuiFactory.createCenteredButton(1, 421, 629, 0, "ACHIEVEMENTS"));
		
		add(configuration = GuiFactory.createCenteredButton(1, 701, 419, 0, "CONFIGURATION"));
		add(champions = GuiFactory.createCenteredButton(1, 701, 489, 0, "CHAMPIONS"));
		add(highscores = GuiFactory.createCenteredButton(1, 701, 559, 0, "HIGH-SCORES"));
		add(options = GuiFactory.createCenteredButton(1, 701, 629, 0, "OPTIONS"));
	}
	
	public void update(int delta)
	{
		super.update(delta);
		if (Interface.keyboard() > 0)
		{
			for (KeyEvent event : Interface.getKeyboardEvents())
			{
				if (event.state && event.key == Keyboard.KEY_ESCAPE)
				{
					ChromeConflict.inst.exit = true;
					return;
				}
			}
		}
	}
	
	public void action(GuiComponent component)
	{
		super.action(component);
		if (component == singleplayer)
		{
			try
			{
				GuiMain.queue(GuiSingleplayer.setup());
			}
			catch (IOException e)
			{
				GuiMain.queue(new GuiMessage("Connection failed: java.io.IOException", "Main Menu", this));
			}
		}
		else if (component == multiplayer)
		{
			GuiMain.queue(new GuiConnect());
		}
	}
}
