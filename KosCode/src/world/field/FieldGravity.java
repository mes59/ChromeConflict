package world.field;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import main.CCUtils;

import org.lwjgl.opengl.GL11;

import world.Entity;
import engine.math.Rect2;

public class FieldGravity extends WorldField
{
	public Rect2 bounds;
	public double gravity;
	
	FieldGravity()
	{
	}
	
	public FieldGravity(Rect2 bounds, double gravity)
	{
		this.bounds = bounds;
		this.gravity = gravity;
	}
	
	public int onEntityUpdated(Entity entity, int delta)
	{
		if (bounds.isColliding(entity.bounds))
		{
//			entity.vel.add(0, delta * gravity / 1000);
			return NO_GRAVITY;
		}
		else return 0;
	}
	
	protected void writeData(OutputStream out) throws IOException
	{
		CCUtils.writeBounds(out, bounds);
		utils.writeDouble(out, gravity);
	}
	
	protected WorldField readData(InputStream in) throws IOException
	{
		bounds = CCUtils.readBounds(in);
		gravity = utils.readDouble(in);
		return this;
	}
	
	public void draw()
	{
		GL11.glColor4f(0.8f, 0.8f, 0.1f, 0.5f);
		bounds.draw(true);
	}
}
