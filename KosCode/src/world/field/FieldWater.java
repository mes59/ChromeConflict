package world.field;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import main.CCUtils;

import org.lwjgl.opengl.GL11;

import world.Entity;
import engine.math.Rect2;

public class FieldWater extends WorldField
{
	// used to avoid repetitive calculation of slowing factor
	private volatile int delta;
	private volatile double factor;
	public Rect2 bounds;
	public double base;
	
	FieldWater()
	{
	}
	
	public FieldWater(Rect2 bounds, double base)
	{
		delta = 0;
		factor = 1;
		this.bounds = bounds;
		this.base = base;
	}
	
	public synchronized int onEntityUpdated(Entity entity, int delta)
	{
		if (bounds.isColliding(entity.bounds))
		{
			if (this.delta != delta)
			{
				factor = Math.pow(base, delta / 1000d);
				this.delta = delta;
			}
			entity.vel.mul(factor, factor);
		}
		return 0;
	}
	
	protected void writeData(OutputStream out) throws IOException
	{
		CCUtils.writeBounds(out, bounds);
		utils.writeDouble(out, base);
	}
	
	protected WorldField readData(InputStream in) throws IOException
	{
		bounds = CCUtils.readBounds(in);
		base = utils.readDouble(in);
		return this;
	}
	
	public void draw()
	{
		GL11.glColor4f(0.1f, 0.1f, 0.8f, 0.8f);
		bounds.draw(true);
	}
}
