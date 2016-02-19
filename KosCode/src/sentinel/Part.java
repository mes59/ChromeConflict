package sentinel;

public abstract class Part
{
	public static final Part[] parts = new Part[64];
	public final int id;
	
	public Part(int id)
	{
		if (parts[id] != null)
		{
			throw new IllegalArgumentException("this id is already occupied");
		}
		parts[id] = this;
		this.id = id;
	}
	
	public abstract int getType();
	
	public abstract int getSlotCount();
	
	public abstract Slot getSlot(int slot);
	
	public abstract int getModuleCount();
}
