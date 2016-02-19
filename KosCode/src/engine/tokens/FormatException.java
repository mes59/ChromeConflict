package engine.tokens;

public class FormatException extends IllegalArgumentException
{
	private static final long serialVersionUID = 3242190008509985425L;
	
	public FormatException(String str)
	{
		super(str);
	}
	
	public FormatException(String str, Throwable cause)
	{
		super(str, cause);
	}
}
