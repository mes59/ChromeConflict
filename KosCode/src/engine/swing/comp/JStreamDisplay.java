package engine.swing.comp;

import java.awt.Container;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.Document;
import javax.swing.text.Element;

public class JStreamDisplay extends JTextArea
{
	private static final long serialVersionUID = -6839668712921360986L;
	
	public int maxLines = 128;
	private Updater updater;
	private InputStream in;
	private OutputPart out;
	
	public JStreamDisplay(Container target, InputStream in, int width, int height)
	{
		super(height, width);
		setEditable(false);
		target.add(new JScrollPane(this, 22, 31));
		if (in != null)
		{
			this.in = in;
			updater = new Updater();
			updater.start();
		}
		else out = new OutputPart();
	}
	
	public OutputStream getOutputPart()
	{
		return out;
	}
	
	public void setEditable(boolean b)
	{
	}
	
	private void cleanup()
	{
		Document doc = getDocument();
		Element root = doc.getDefaultRootElement();
		int count = root.getElementCount();
		if (count > maxLines)
		{
			int off = root.getElement(count - maxLines).getStartOffset();
			setText(getText().substring(off));
		}
	}
	
	private class OutputPart extends OutputStream
	{
		public void write(int b) throws IOException
		{
			append(Character.toString((char) (b & 0xFF)));
			cleanup();
		}
		
		public void write(byte[] b, int off, int len) throws IOException
		{
			append(new String(b, off, len));
			cleanup();
		}
	}
	
	private class Updater extends Thread
	{
		private Updater()
		{
			setDaemon(true);
		}
		
		public void run()
		{
			byte[] buffer = new byte[1024];
			ByteArrayOutputStream out = new ByteArrayOutputStream(1024);
			while (!isInterrupted())
			{
				try
				{
					if (in.available() > 0)
					{
						while (in.available() > 0)
						{
							int read = in.read(buffer);
							out.write(buffer, 0, read);
						}
						append(new String(out.toByteArray()));
						out.reset();
						cleanup();
					}
				}
				catch (IOException e)
				{
					System.err.println(e.getMessage());
				}
				
				try
				{
					Thread.sleep(10);
				}
				catch (InterruptedException e)
				{
					break;
				}
			}
		}
	}
}
