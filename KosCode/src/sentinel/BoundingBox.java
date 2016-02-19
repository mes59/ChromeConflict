package sentinel;

public class BoundingBox
{
	@SuppressWarnings("unused")
	// TODO complete and use class
	private double left, right, top, bottom;
	
	public BoundingBox(double x, double y, double w, double h)
	{
		left = x;
		right = x + w;
		top = y;
		bottom = y + h;
	}
}
