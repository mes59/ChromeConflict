package engine.swing.comp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import javax.swing.JTextField;

public class JStreamInput extends JTextField
{
	private static final long serialVersionUID = 2722603424284253210L;
	private static final byte[] LSB = System.lineSeparator().getBytes();
	
	private boolean newline;
	private InputPart in;
	private OutputStream out;
	
	public JStreamInput(OutputStream out, int width, boolean newline)
	{
		super(width);
		if (out != null) this.out = out;
		else in = new InputPart();
		this.newline = newline;
		addActionListener(new Listener());
	}
	
	public InputStream getInputPart()
	{
		return in;
	}
	
	private class InputPart extends InputStream
	{
		private volatile int pos;
		private volatile byte[] buffer;
		
		private InputPart()
		{
			buffer = new byte[1024];
		}
		
		private void write(byte[] data)
		{
			if (pos + data.length > buffer.length)
			{
				buffer = Arrays.copyOf(buffer, pos + data.length);
			}
			System.arraycopy(data, 0, buffer, pos, data.length);
		}
		
		private void cleanup()
		{
			synchronized (buffer)
			{
				if (pos > 1024)
				{
					System.arraycopy(buffer, pos, buffer, 0, buffer.length - pos);
					pos = 0;
				}
			}
		}
		
		public int available()
		{
			return buffer.length - pos;
		}
		
		public int read()
		{
			synchronized (buffer)
			{
				cleanup();
				if (pos == -1) return -1;
				while (pos == buffer.length)
				{
					try
					{
						buffer.wait();
					}
					catch (InterruptedException e)
					{
					}
				}
				return buffer[pos++];
			}
		}
		
		public int read(byte[] b, int off, int len)
		{
			synchronized (buffer)
			{
				cleanup();
				if (off + len > b.length) throw new ArrayIndexOutOfBoundsException(off + len - 1);
				while (pos == buffer.length)
				{
					try
					{
						buffer.wait();
					}
					catch (InterruptedException e)
					{
					}
				}
				len = Math.min(len, buffer.length - pos);
				System.arraycopy(buffer, pos, b, off, len);
				return len;
			}
		}
	}
	
	private class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == JStreamInput.this)
			{
				try
				{
					if (out != null)
					{
						out.write(getText().getBytes());
						if (newline) out.write(LSB);
						out.flush();
					}
					else
					{
						in.write(getText().getBytes());
						if (newline) in.write(LSB);
					}
					setText(null);
				}
				catch (IOException ex)
				{
					System.out.println(ex.getMessage());
				}
			}
			else throw new Error("unexpected action source");
		}
	}
}
