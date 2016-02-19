package engine.data;

public class DataFormatException extends RuntimeException
{
	private static final long serialVersionUID = 272621406479996760L;
	
	public DataFormatException()
	{
	}
	
	public DataFormatException(String message)
	{
		super(message);
	}
	
	public DataFormatException(Throwable cause)
	{
		super(cause);
	}
	
	public DataFormatException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
