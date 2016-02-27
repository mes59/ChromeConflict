package main;

import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.jar.JarFile;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import engine.util.ui.UIUtils;

public class SSLauncher implements ActionListener
{
	private Robot robot;
	public JFrame frame, cntrl;
	private JButton start, pause;
	private JButton capture;
	private Class<?> cls;
	public Applet app;
	public AppletStub stub;
	public AppletContext context;
	private ThreadGroup group;
	
	public static void main(String[] args) throws Exception
	{
		new SSLauncher().launch();
	}
	
	private void launch() throws Exception
	{
		if (robot != null) throw new IllegalStateException("already launched");
		robot = new Robot();
		frame = new JFrame();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cntrl = new JFrame();
		cntrl.setResizable(false);
		cntrl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start = UIUtils.fix(new JButton("Resume"));
		start.addActionListener(this);
		pause = UIUtils.fix(new JButton("Suspend"));
		pause.addActionListener(this);
		capture = UIUtils.fix(new JButton("Screenshot"));
		capture.addActionListener(this);
		JPanel p1 = UIUtils.add(true, 8, start, 4, pause, 8);
		cntrl.setContentPane(UIUtils.add(false, 8, p1, 4, UIUtils.add(true, 8, capture, 8), 8));
		
		File root = new File("C:/Users/David/Desktop/Steel Sentinels/SS2/eclipse/Java/projects/Steel Sentinels/bin");
		JarFile jar = new JarFile("C:/Users/David/Desktop/Steel Sentinels/SS2/client_renamed.jar");
		CombinedClassLoader cl = new CombinedClassLoader(root, jar);
		cls = cl.loadClass("game.SteelSentinels");
		final URL code = new URL("http://steelsentinels2.funorb.com/g=steelsentinels");
		final URL document = new URL("http://steelsentinels2.funorb.com/g=steelsentinels/game.ws?js=1");
		final HashMap<String, String> params = new HashMap<>();
		params.put("servernum", "8171");
		params.put("gamecrc", "979916140");
		params.put("gameport1", "43594");
		params.put("gameport2", "443");
		params.put("instanceid", "-7786379491315466208");
		params.put("member", "no");
		params.put("currency", "1");
		params.put("cookieprefix", "");
		params.put("cookiehost", ".funorb.com");
		params.put("settings", "vMY2S5tgLBN9zysDvKFA5T1Qfh*0CBRU*BvpkrMrcmQ");
		
		stub = new AppletStub()
		{
			public boolean isActive()
			{
				return frame.isActive();
			}
			
			public String getParameter(String name)
			{
				if (!params.containsKey(name)) System.err.println("no property " + name);
				return params.get(name);
			}
			
			public URL getDocumentBase()
			{
				return document;
			}
			
			public URL getCodeBase()
			{
				return code;
			}
			
			public AppletContext getAppletContext()
			{
				return context;
			}
			
			public void appletResize(int width, int height)
			{
				Dimension curr = app.getPreferredSize();
				Dimension next = new Dimension(width, height);
				frame.setLocation(frame.getX() - (next.width - curr.width) / 2, frame.getY() - (next.height - curr.height) / 2);
				app.setMinimumSize(next);
				app.setPreferredSize(next);
				app.setMaximumSize(next);
				frame.pack();
			}
		};
		
		context = new AppletContext()
		{
			private HashMap<String, InputStream> streams = new HashMap<>();
			
			public void showStatus(String status)
			{
				System.out.println("current status: " + status);
			}
			
			public void showDocument(URL url, String target)
			{
				System.out.println("redirect " + target + " to " + url);
				if (target.equals("_top")) System.exit(0);
			}
			
			public void showDocument(URL url)
			{
				System.out.println("redirect to " + url);
				System.exit(0);
			}
			
			public void setStream(String key, InputStream stream) throws IOException
			{
				if (stream == null) streams.remove(key);
				else streams.put(key, stream);
			}
			
			public Iterator<String> getStreamKeys()
			{
				return streams.keySet().iterator();
			}
			
			public InputStream getStream(String key)
			{
				return streams.get(key);
			}
			
			public Image getImage(URL url)
			{
				try
				{
					return ImageIO.read(url);
				}
				catch (Exception e)
				{
					e.printStackTrace();
					return null;
				}
			}
			
			public AudioClip getAudioClip(URL url)
			{
				try
				{
					final Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(url));
					return new AudioClip()
					{
						public void stop()
						{
							clip.stop();
						}
						
						public void play()
						{
							clip.stop();
							clip.setFramePosition(0);
							clip.loop(0);
						}
						
						public void loop()
						{
							clip.stop();
							clip.setFramePosition(0);
							clip.loop(Clip.LOOP_CONTINUOUSLY);
						}
					};
				}
				catch (Exception e)
				{
					return null;
				}
			}
			
			public Enumeration<Applet> getApplets()
			{
				return new Enumeration<Applet>()
				{
					private boolean ready = true;
					
					public boolean hasMoreElements()
					{
						return ready;
					}
					
					public Applet nextElement()
					{
						if (ready)
						{
							ready = false;
							return app;
						}
						throw new NoSuchElementException();
					}
				};
			}
			
			public Applet getApplet(String name)
			{
				if (name.equals(app.getName())) return app;
				return null;
			}
		};
		
		group = new ThreadGroup("appgroup");
		Thread t = new Thread(group, new Runnable()
		{
			public void run()
			{
				Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
				try
				{
					app = (Applet) cls.newInstance();
					frame.setContentPane(app);
					Dimension size = new Dimension(640, 480);
					app.setMinimumSize(size);
					app.setPreferredSize(size);
					app.setMaximumSize(size);
					frame.pack();
					cntrl.pack();
					app.setStub(stub);
					
					size = frame.getSize();
					Dimension pos = new Dimension(size.width + 16 + cntrl.getWidth(), size.height);
					pos.width = (screen.width - pos.width) / 2;
					pos.height = (screen.height - pos.height) / 2;
					frame.setLocation(pos.width, pos.height);
					cntrl.setLocation(pos.width + size.width + 16, pos.height + 64);
					frame.setVisible(true);
					cntrl.setVisible(true);
					app.init();
					app.start();
				}
				catch (Throwable t)
				{
					t.printStackTrace();
					System.exit(1);
				}
			}
		});
		t.start();
	}
	
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e)
	{
		Object src = e.getSource();
		if (src == start)
		{
			group.resume();
		}
		else if (src == pause)
		{
			group.suspend();
		}
		else if (src == capture)
		{
			Rectangle rect = new Rectangle(app.getLocationOnScreen(), app.getSize());
			BufferedImage img = robot.createScreenCapture(rect);
			try
			{
				ImageIO.write(img, "png", new File("screenshot.png"));
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
		else System.err.println("Received event " + e + " from unexpected source");
	}
}
