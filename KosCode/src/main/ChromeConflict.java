package main;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import engine.app.Environment;
import engine.app.FontLoader;
import engine.app.event.KeyEvent;
import engine.app.graphics.GLBase;
import engine.app.graphics.TextureLoader;
import engine.app.gui.GuiMain;
import engine.app.gui.Interface;
import engine.data.json.JSONFormat;
import engine.data.json.JSONObject;
import engine.data.json.JSONParser;
import engine.data.json.JSONUtils;
import engine.data.json.JSONWriter;
import engine.data.stream.IOStreamPipe;
import engine.data.stream.MultiOutputStream;
import engine.math.SimpleMath;
import engine.swing.comp.JStreamDisplay;
import engine.swing.comp.JStreamInput;
import engine.util.Utils;
import gui.GuiFactory;
import gui.GuiMainMenu;
import net.server.CCServer;
import sentinel.Sentinel;
import sentinel.chassis.Chassis;
import sentinel.weapon.Weapon;

public class ChromeConflict extends Environment
{
	public static final String VERSION = "Beta 0.2.0";
	
	public static final int IDX_STOP_MOVING = 0;
	public static final int IDX_WALK_LEFT = 1;
	public static final int IDX_WALK_RIGHT = 2;
	public static final int IDX_JUMP_FLY = 3;
	public static final int IDX_ACC_LEFT = 4;
	public static final int IDX_ACC_RIGHT = 5;
	public static final int IDX_ACC_DOWN = 6;
	public static final int IDX_ACC_UP = 7;
	public static final int IDX_SELECT_PREV = 8;
	public static final int IDX_SELECT_NEXT = 9;
	
	public static ChromeConflict inst;
	public boolean fullscreen;
	public boolean keepAspect;
	public boolean isClient;
	public boolean isServer;
	
	public File configFile;
	public JSONObject config;
	
	public int[] keys;
	public Sentinel sent;
	public boolean exit;
	
	private File baseDir;
	private File dataDir;
	private File resDir;
	
	public static void main(String[] args)
	{
		try
		{
			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			JCheckBox fullscreen = new JCheckBox("Use fullscreen");
			{
				JPanel temp = new JPanel();
				temp.setLayout(new BoxLayout(temp, BoxLayout.X_AXIS));
				temp.add(fullscreen);
				temp.add(Box.createHorizontalGlue());
				panel.add(temp);
			}
			JCheckBox keepAspect = new JCheckBox("Keep aspect ratio");
			{
				JPanel temp = new JPanel();
				temp.setLayout(new BoxLayout(temp, BoxLayout.X_AXIS));
				temp.add(keepAspect);
				temp.add(Box.createHorizontalGlue());
				panel.add(temp);
			}
			
			ButtonGroup group = new ButtonGroup();
			JRadioButton client = new JRadioButton("Client");
			client.setSelected(true);
			JRadioButton server = new JRadioButton("Server");
			{
				JPanel temp = new JPanel();
				temp.setLayout(new BoxLayout(temp, BoxLayout.X_AXIS));
				temp.add(client);
				temp.add(Box.createHorizontalStrut(10));
				temp.add(server);
				temp.add(Box.createHorizontalGlue());
				panel.add(temp);
				group.add(client);
				group.add(server);
			}
			int op = JOptionPane.showConfirmDialog(null, panel, "CC Launcher", JOptionPane.OK_CANCEL_OPTION);
			if (op != JOptionPane.OK_OPTION)
			{
				System.out.println("instance closed by user");
				System.exit(0);
			}
			if (!client.isSelected() && !server.isSelected())
			{
				System.out.println("no side selected");
				System.exit(0);
			}
			
			inst = new ChromeConflict();
			inst.fullscreen = fullscreen.isSelected();
			inst.keepAspect = keepAspect.isSelected();
			inst.isClient = client.isSelected();
			inst.isServer = server.isSelected();
			inst.launch(args);
			Thread.sleep(100);
			System.exit(0);
		}
		catch (InterruptedException e)
		{
			System.out.println("why, just why");
			System.exit(-1);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.exit(4);
		}
	}
	
	private void launch(String[] args) throws IOException
	{
		boolean ide = CCUtils.hasCommand(args, "-ide");
		if (ide) init(ChromeConflict.class, null);
		else init(ChromeConflict.class, "sysout.log");
		System.out.println("Chrome Conflict " + VERSION);
		
		String value = CCUtils.getArgument(args, "-base");
		if (value != null) baseDir = new File(value);
		else
		{
			baseDir = getCodeSource().getParentFile();
			if (!ide) baseDir = baseDir.getParentFile();
		}
		value = CCUtils.getArgument(args, "-res");
		if (value != null) resDir = new File(value);
		else resDir = new File(baseDir, "res");
		value = CCUtils.getArgument(args, "-data");
		if (value != null) dataDir = new File(value);
		else dataDir = new File(baseDir, "data");
		
		File file = new File(dataDir, "/config.cfg");
		if (!dataDir.exists()) Files.createDirectory(dataDir.toPath());
		if (config == null) configFile = file;
		if (file.exists())
		{
			FileInputStream in = new FileInputStream(file);
			config = JSONUtils.asObject(JSONParser.parse(in));
			in.close();
		}
		else config = new JSONObject();
		
		if (!config.contains("username"))
		{
			int rand = (int) System.nanoTime();
			char[] name = new char[11];
			"Player_XXXX".getChars(0, 7, name, 0);
			for (int i = 0; i < 4; i++)
			{
				name[i + 7] = Utils.getHexChar(rand >> (3 - i) * 4);
			}
			config.put("username", new String(name));
		}
		CCUtils.getOrAddInt(config, "port", 9001);
		if (config.isString("map"))
		{
			String map = config.getString("map");
			if (!new File(resDir, "maps/" + map).exists()) config.put("map", "testmap.iwm");
		}
		else config.put("map", "testmap.iwm");
		
		JSONObject obj = new JSONObject();
		CCUtils.getOrAddInt(obj, "key_mvstop", Keyboard.KEY_S);
		CCUtils.getOrAddInt(obj, "key_mvleft", Keyboard.KEY_A);
		CCUtils.getOrAddInt(obj, "key_mvright", Keyboard.KEY_D);
		CCUtils.getOrAddInt(obj, "key_jump", Keyboard.KEY_W);
		CCUtils.getOrAddInt(obj, "key_left", Keyboard.KEY_J);
		CCUtils.getOrAddInt(obj, "key_right", Keyboard.KEY_L);
		CCUtils.getOrAddInt(obj, "key_down", Keyboard.KEY_K);
		CCUtils.getOrAddInt(obj, "key_up", Keyboard.KEY_I);
		CCUtils.getOrAddInt(obj, "key_prev", Keyboard.KEY_Q);
		CCUtils.getOrAddInt(obj, "key_next", Keyboard.KEY_E);
		config.put("controls", obj);
		
		if (!config.isObject("sentinel"))
		{
			obj = new JSONObject();
			config.put("sentinel", obj);
		}
		else obj = config.getObject("sentinel");
		try
		{
			sent = Sentinel.readConfig(obj);
		}
		catch (RuntimeException e)
		{
			System.err.println("bad sentinel config");
			sent = new Sentinel(Chassis.TEMPLATE);
			sent.setWeapon(0, Weapon.LASER_LIGHT);
			sent.setWeapon(1, Weapon.LASER_LIGHT);
			sent.writeConfig(obj);
		}
		FileOutputStream out = new FileOutputStream(configFile);
		new JSONWriter(new OutputStreamWriter(out), JSONFormat.FLOWING).writeJSON(config, false);
		out.close();
		
		if (isClient) runClient(args);
		else if (isServer) runServer(args);
		else throw new Error("no state");
	}
	
	private void runClient(String[] args) throws IOException
	{
		try
		{
			System.out.println("launching client as " + config.getString("username"));
			if (fullscreen)
			{
				DisplayMode full = GLBase.getFullscreen();
				GLBase.initDisplay(full, true);
				if (keepAspect)
				{
					float aspect = (float) full.getWidth() / full.getHeight();
					System.out.println("Creating borders for aspect ratio: " + aspect);
					if (aspect < 1.6f) // (eg 4 : 3 = 1.333) more height at equal width: borders above & below
					{
						int borders = SimpleMath.roundf(full.getWidth() / 1.6f);
						borders = (full.getHeight() - borders) / 2;
						GLBase.initOpenGL(0, 1128, -borders, 705 + borders);
						GL11.glEnable(GL11.GL_SCISSOR_TEST);
						GL11.glScissor(0, borders, 1128, 705);
					}
					else if (aspect > 1.6f) // (eg 16 : 9 = 1.778) more width at equal height: borders left & right
					{
						int borders = SimpleMath.roundf(full.getHeight() * 1.6f);
						borders = (full.getWidth() - borders) / 2;
						GLBase.initOpenGL(-borders, 1128 + borders, 0, 705);
						GL11.glEnable(GL11.GL_SCISSOR_TEST);
						GL11.glScissor(borders, 0, 1128, 705);
					}
					else GLBase.initOpenGL(1128, 705);
				}
				else GLBase.initOpenGL(1128, 705);
			}
			else GLBase.init(1128, 705);
			Display.setTitle("Chrome Conflict " + VERSION);
		}
		catch (LWJGLException e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		TextureLoader.loadFolder(resDir, -1);
		FontLoader.loadFolder(resDir, -1);
		if (!GuiFactory.init("lense"))
		{
			System.err.println("GUI initialization failed");
			return;
		}
		
		JSONObject obj = config.getObject("controls");
		keys = new int[10];
		keys[IDX_STOP_MOVING] = obj.getInt("key_mvstop");
		keys[IDX_WALK_LEFT] = obj.getInt("key_mvleft");
		keys[IDX_WALK_RIGHT] = obj.getInt("key_mvright");
		keys[IDX_JUMP_FLY] = obj.getInt("key_jump");
		keys[IDX_ACC_LEFT] = obj.getInt("key_left");
		keys[IDX_ACC_RIGHT] = obj.getInt("key_right");
		keys[IDX_ACC_DOWN] = obj.getInt("key_down");
		keys[IDX_ACC_UP] = obj.getInt("key_up");
		keys[IDX_SELECT_PREV] = obj.getInt("key_prev");
		keys[IDX_SELECT_NEXT] = obj.getInt("key_next");
		
		GuiMain.queue(new GuiMainMenu());
		while (!GLBase.closing() && !exit)
		{
			int delta = getDelta();
			GuiMain.update(delta, true);
			if (Interface.keyboard() > 0)
			{
				for (KeyEvent e : Interface.getKeyboardEvents())
				{
					if (e.key == Keyboard.KEY_F2 && e.state) new ScreenshotCreator(dataDir).start();
				}
			}
			GLBase.updateDisplay(50);
		}
		GuiMain.close();
		Display.destroy();
	}
	
	private void runServer(String[] args) throws IOException
	{
		TextureLoader.loadFolder(resDir, -1);
		FontLoader.loadFolder(resDir, -1);
		
		CloseListener listener = new CloseListener();
		JFrame frame = new JFrame("Chrome Conflict Server");
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(listener);
		Container pane = frame.getContentPane();
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		IOStreamPipe pipe = new IOStreamPipe(1024);
		OutputStream out = new MultiOutputStream(System.out, pipe.getOutputStream());
		OutputStream err = null;
		if (CCUtils.hasCommand(args, "-ide"))
		{
			err = new MultiOutputStream(System.err, pipe.getOutputStream());
		}
		PrintStream print = new PrintStream(out);
		Font font = Font.decode("lucida console");
		new JStreamDisplay(pane, pipe.getInputStream(), 128, 32).setFont(font);
		pipe = new IOStreamPipe(1024);
		JStreamInput input = new JStreamInput(pipe.getOutputStream(), 128, true);
		input.setFont(font);
		pane.add(input);
		frame.pack();
		Dimension size = frame.getSize();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((screen.width - size.width) / 2, (screen.height - size.height) / 2);
		frame.setVisible(true);
		InputStream stdin = pipe.getInputStream();
		Scanner in = new Scanner(stdin);
		System.setOut(print);
		if (CCUtils.hasCommand(args, "-ide"))
		{
			System.setErr(new PrintStream(err));
		}
		else System.setErr(print);
		
		int port = config.getInt("port");
		port = CCUtils.getArgInt(args, "-port", port);
		
		System.out.println("launching server on port " + port);
		String map = config.getString("map");
		CCServer server = new CCServer(new File(resDir, "maps/" + map), port);
		System.out.println("loaded map \"" + server.getWorldName() + '"');
		while (!listener.closing)
		{
			if (!server.isFinished())
			{
				if (stdin.available() > 0 && in.hasNextLine())
				{
					try
					{
						StringBuffer buff = new StringBuffer(in.nextLine());
						int idx = buff.indexOf(" ");
						if (idx == -1) idx = buff.length();
						String cmd = buff.substring(0, idx);
						buff.delete(0, cmd.length() + 1);
						Vector<String> tokens = new Vector<>();
						while (true)
						{
							String next = getNextToken(buff);
							if (next == null) break;
							tokens.add(next);
						}
						server.runServerCmd(cmd, tokens);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
				
				int delta = getDelta();
				server.update(delta);
				GLBase.updateDisplay(20);
			}
		}
		server.close("closing");
		System.out.println("server closed");
		in.close();
	}
	
	private String getNextToken(StringBuffer buff)
	{
		for (int i = 0; i < buff.length(); i++)
		{
			char c = buff.charAt(i);
			if (Character.isWhitespace(c)) continue;
			else if (c == '"')
			{
				int idx = i + 1;
				int end = idx;
				while (true)
				{
					end = buff.indexOf("\"", end);
					if (end == -1)
					{
						System.out.println("missing terminator");
						return null;
					}
					if (buff.charAt(end - 1) != '\\') break;
				}
				String str = buff.substring(idx, end);
				buff.delete(0, end + 1);
				return str;
			}
			else
			{
				int idx = buff.indexOf(" ", i);
				if (idx == -1)
				{
					String str = buff.substring(i);
					buff.delete(0, str.length());
					return str;
				}
				else
				{
					String str = buff.substring(i, idx);
					buff.delete(0, idx + 1);
					return str;
				}
			}
		}
		return null;
	}
	
	public File getBaseDir()
	{
		return baseDir;
	}
	
	public File getResDir()
	{
		return resDir;
	}
	
	public File getDataDir()
	{
		return dataDir;
	}
}