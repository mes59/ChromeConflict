package engine.data.json;

public class JSONFormatException extends RuntimeException
{
	private static final long serialVersionUID = 8417727122818440217L;
	
	public JSONFormatException()
	{
		super();
	}
	
	public JSONFormatException(int index, int c)
	{
		super("JSON Format Error at index " + index + " ('" + (char) c + "')");
	}
	
	public JSONFormatException(String msg, int index, int c)
	{
		super(msg + " at index " + index + " ('" + (char) c + "')");
	}
	
	public JSONFormatException(String message)
	{
		super(message);
	}
	
	public JSONFormatException(Throwable cause)
	{
		super(cause);
	}
	
	public JSONFormatException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
