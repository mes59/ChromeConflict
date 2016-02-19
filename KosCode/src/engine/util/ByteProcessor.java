package engine.util;


public abstract class ByteProcessor
{
	public int getPreferredBufferSize()
	{
		return 1024;
	}
	
	public abstract void processBytes(byte[] b, int off, int len);
	
	public void processCompleted()
	{
	}
}
