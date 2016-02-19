package gui;

import java.io.File;
import java.io.IOException;

import main.ChromeConflict;
import net.client.CCClient;
import net.client.ConnectHelper;
import net.server.CCServer;
import world.EntityPlayer;
import engine.app.gui.GuiContainer;

public class GuiSingleplayer extends GuiMultiplayer
{
	protected CCServer server;
	
	private GuiSingleplayer(CCServer server, CCClient client, EntityPlayer player) throws IOException
	{
		super(client, player);
		this.server = server;
	}
	
	public static GuiContainer setup() throws IOException
	{
		String map = ChromeConflict.inst.config.getString("map");
		CCServer server = new CCServer(new File(ChromeConflict.inst.getResDir(), "maps/" + map), 0);
		new ServerThread(server).start();
		System.out.println("launching server on port " + server.getLocalPort());
		System.out.println("loaded map \"" + server.getWorldName() + '"');
		ConnectHelper helper = new ConnectHelper("127.0.0.1", server.getLocalPort());
		if (!helper.initialConnect()) return new GuiMessage("Failed to connect to internal server", "Main Menu", new GuiMainMenu());
		CCClient client = helper.doFinal();
		if (client == null) return new GuiMessage("Communication error with internal server", "Main Menu", new GuiMainMenu());
		return new GuiSingleplayer(server, client, client.getPlayer());
	}
	
	private static class ServerThread extends Thread
	{
		private CCServer server;
		private long time;
		
		private ServerThread(CCServer server)
		{
			this.server = server;
			time = System.currentTimeMillis();
		}
		
		public void run()
		{
			while (!server.isClosing())
			{
				long ctime = System.currentTimeMillis();
				server.update((int) (ctime - time));
				time = ctime;
				try
				{
					Thread.sleep(50);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
					server.close("closing");
				}
			}
		}
	}
	
	public void update(int delta)
	{
		server.update(delta);
		super.update(delta);
	}
	
	public void close()
	{
		server.close("closing");
		super.close();
	}
}
