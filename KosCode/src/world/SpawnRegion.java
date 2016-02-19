package world;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import main.CCUtils;
import engine.math.Rect2;
import engine.math.vec.Vec2;
import engine.util.IOUtils;

public class SpawnRegion
{
	public final Rect2 bounds;
	public final Vec2 minVel;
	public final Vec2 maxVel;
	public final int weight;
	
	public SpawnRegion(Rect2 bounds, Vec2 minVel, Vec2 maxVel, int weight)
	{
		if (bounds == null) throw new NullPointerException("bounds");
		if (weight <= 0) throw new IllegalArgumentException("weight");
		this.bounds = bounds;
		if (minVel == null) minVel = new Vec2(0, 0);
		if (maxVel == null) maxVel = new Vec2(0, 0);
		this.minVel = minVel;
		this.maxVel = maxVel;
		this.weight = weight;
	}
	
	public void spawn(WorldServer world, Entity ent)
	{
		double x = bounds.size.x() - ent.bounds.size.x();
		double y = bounds.size.y() - ent.bounds.size.y();
		if (x <= 0) x = 0;
		else x *= Math.random();
		if (y <= 0) y = 0;
		else y *= Math.random();
		x += bounds.pos.x();
		y += bounds.pos.y();
		double max = world.collision.getWidth() - ent.bounds.size.x();
		if (x > max) x = max;
		max = world.collision.getTotalHeight() - ent.bounds.size.y();
		if (y > max) y = max;
		ent.bounds.pos.set(x, y);
		x = maxVel.x() - minVel.x();
		y = maxVel.y() - minVel.y();
		x = minVel.x() + Math.random() * x;
		y = minVel.y() + Math.random() * y;
		ent.vel.set(x, y);
	}
	
	public void write(OutputStream out) throws IOException
	{
		CCUtils.writeBounds(out, bounds);
		CCUtils.writeVector(out, minVel);
		CCUtils.writeVector(out, maxVel);
		CCUtils.utils.writeVarInt(out, weight);
	}
	
	public static SpawnRegion read(InputStream in) throws IOException
	{
		Rect2 bounds = CCUtils.readBounds(in);
		Vec2 minVel = CCUtils.readVector(in);
		Vec2 maxVel = CCUtils.readVector(in);
		int weight = CCUtils.utils.readVarInt(in);
		return new SpawnRegion(bounds, minVel, maxVel, weight);
	}
	
	public static void skip(InputStream in) throws IOException
	{
		IOUtils.skipFully(in, 8 * 8);
		CCUtils.utils.readVarInt(in);
	}
}
