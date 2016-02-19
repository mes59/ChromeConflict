package gui;

import java.io.IOException;

import net.client.CCClient;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import sentinel.Sentinel;
import world.Drawable;
import world.EntityPlayer;
import world.WorldClient;
import engine.app.event.KeyEvent;
import engine.app.gui.GuiContainer;
import engine.app.gui.GuiMain;
import engine.app.gui.Interface;

public class GuiMultiplayer extends GuiContainer
{
	protected CCClient client;
	protected WorldClient world;
	protected EntityPlayer player;
	
	private int prevIdx;
	private Drawable left;
	private Drawable draw;
	private Drawable right;
	
	public GuiMultiplayer(CCClient client, EntityPlayer player) throws IOException
	{
		super(null);
		this.client = client;
		world = client.getWorld();
		this.player = player;
		prevIdx = -100;
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
					GuiMain.queue(new GuiMainMenu());
					return;
				}
			}
		}
		if (left != null) left.update(delta);
		if (draw != null) draw.update(delta);
		if (right != null) right.update(delta);
		
		client.update(delta);
		world.update(delta);
	}
	
	public void draw()
	{
		world.drawCentered(player);
		Sentinel sent = player.getSentinel();
		if (prevIdx != player.selected)
		{
			int diff = player.selected - prevIdx;
			prevIdx += diff;
			if (diff == -2)
			{
				right = left;
				if (prevIdx < 1) left = null;
				else left = player.getWeapon(prevIdx - 1).getEditAnim();
				draw = player.getWeapon(prevIdx).getEditAnim();
			}
			else if (diff == -1)
			{
				right = draw;
				draw = left;
				if (prevIdx < 1) left = null;
				else left = player.getWeapon(prevIdx - 1).getEditAnim();
			}
			else if (diff == 1)
			{
				left = draw;
				draw = right;
				if (prevIdx > player.getWeaponCount() - 2) right = null;
				else right = player.getWeapon(prevIdx + 1).getEditAnim();
			}
			else if (diff == 2)
			{
				left = right;
				draw = player.getWeapon(prevIdx).getEditAnim();
				if (prevIdx > player.getWeaponCount() - 2) right = null;
				else right = player.getWeapon(prevIdx + 1).getEditAnim();
			}
			else
			{
				if (prevIdx < 1) left = null;
				else left = player.getWeapon(prevIdx - 1).getEditAnim();
				draw = player.getWeapon(prevIdx).getEditAnim();
				if (prevIdx > player.getWeaponCount() - 2) right = null;
				else right = player.getWeapon(prevIdx + 1).getEditAnim();
			}
		}
		GL11.glColor4f(1, 1, 1, 1);
		if (left != null) left.drawScale(464, 50, 1, 1, 0.5, 0.5, 0);
		if (draw != null) draw.drawScale(564, 50, 2, 2, 0.5, 0.5, 0);
		if (right != null) right.drawScale(664, 50, 1, 1, 0.5, 0.5, 0);
		
		float hull = player.hull / sent.chassis.hull * 390f;
		float shield = player.shield / sent.chassis.shield * 390f;
		float energy = player.energy / sent.chassis.energy * 390f;
		
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glColor3f(0.3f, 0.3f, 0.3f);
		GL11.glVertex2f(20, 20);
		GL11.glVertex2f(420, 20);
		GL11.glVertex2f(420, 80);
		GL11.glVertex2f(20, 80);
		GL11.glColor3f(0, 1f, 0);
		GL11.glVertex2f(25, 25);
		GL11.glVertex2f(25 + hull, 25);
		GL11.glVertex2f(25 + hull, 75);
		GL11.glVertex2f(25, 75);
		GL11.glColor3f(0, 1f, 1f);
		GL11.glVertex2f(25, 25);
		GL11.glVertex2f(25 + shield, 25);
		GL11.glVertex2f(25 + shield, 50);
		GL11.glVertex2f(25, 50);
		
		GL11.glColor3f(0.3f, 0.3f, 0.3f);
		GL11.glVertex2f(1108, 20);
		GL11.glVertex2f(708, 20);
		GL11.glVertex2f(708, 55);
		GL11.glVertex2f(1108, 55);
		GL11.glColor3f(1f, 0.6f, 0);
		GL11.glVertex2f(1103, 25);
		GL11.glVertex2f(1103 - energy, 25);
		GL11.glVertex2f(1103 - energy, 50);
		GL11.glVertex2f(1103, 50);
		GL11.glEnd();
	}
	
	public void close()
	{
		client.disconnect("closing");
	}
}
