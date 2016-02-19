package engine.app;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLDecoder;

public class Environment
{
	private boolean ready;
	private File codeSrc;
	protected long last;
	
	public void init(Class<?> main, String logFile)
	{
		if (!ready)
		{
			if (logFile != null)
			{
				PrintStream out = System.out, err = System.err;
				try
				{
					PrintStream stream = new PrintStream(logFile);
					System.setOut(stream);
					System.setErr(stream);
				}
				catch (Exception e)
				{
					if (out != System.out) System.setOut(out);
					if (err != System.err) System.setErr(err);
					e.printStackTrace(out);
					System.exit(1);
				}
			}
			
			try
			{
				URL url = main.getProtectionDomain().getCodeSource().getLocation();
				codeSrc = new File(URLDecoder.decode(url.getPath(), "UTF-8"));
			}
			catch (Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
			ready = true;
		}
		else throw new IllegalStateException("already initialized");
	}
	
	public void release() throws Exception
	{
		if (ready)
		{
			codeSrc = null;
			ready = false;
		}
		else throw new IllegalStateException("not initialized");
	}
	
	public boolean isInitialized()
	{
		return ready;
	}
	
	public File getCodeSource()
	{
		if (!ready) throw new IllegalStateException("not initialized");
		return codeSrc;
	}
	
	protected int getDelta()
	{
		if (last == 0)
		{
			last = System.currentTimeMillis();
			return 0;
		}
		
		long curr = System.currentTimeMillis();
		int delta = (int) (curr - last);
		last = curr;
		return delta;
	}
}
