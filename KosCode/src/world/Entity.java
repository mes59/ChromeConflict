package world;

import org.lwjgl.opengl.GL11;

import world.field.WorldField;
import engine.math.Rect2;
import engine.math.SimpleMath;
import engine.math.vec.Vec2;
import engine.math.vec.VecUtils;
import engine.net.data.IODataTable;
import engine.util.Utils;

public abstract class Entity
{
	public int entityId;
	public Rect2 bounds;
	public Vec2 vel;
	
	public boolean ground;
	public boolean collideLeft;
	public boolean collideRight;
	public boolean collideBelow;
	public boolean collideAbove;
	public Drawable sprite;
	protected World world;
	
	public Entity(int entityId)
	{
		this.entityId = entityId;
		bounds = new Rect2(0, 0, 0, 0);
		vel = new Vec2(0, 0);
	}
	
	public World getWorld()
	{
		return world;
	}
	
	protected IODataTable createDTable()
	{
		return new IODataTable();
	}
	
	protected void readDTable(IODataTable table)
	{
	}
	
	public boolean isAffectedBy(WorldField field)
	{
		return true;
	}
	
	public void update(int delta, double gravity, int mods)
	{
		float time = delta / 1000f;
		if (sprite != null) sprite.update(delta);
		if (!Utils.getFlag(mods, WorldField.NO_GRAVITY))
		{
			move(vel.x() * time, (vel.y() + 0.5 * gravity * time) * time, 1);
			vel.add(0, time * gravity);
		}
		else move(vel.x() * time, vel.y() * time, 1);
	}
	
	protected void runAdvancedPhysics(int delta)
	{
		if (collideLeft || collideRight) vel.x(0);
		if (collideBelow || collideAbove) vel.y(0);
		if (ground && vel.x() != 0 && vel.y() >= 0)
		{
			double friction = 4.0 * world.gravity * delta / 1000;
			if (friction > Math.abs(vel.x())) vel.x(0);
			else vel.add(vel.x() > 0 ? -friction : friction, 0);
		}
	}
	
	public void move(double x, double y, double prec)
	{
		if (prec < 1) throw new IllegalArgumentException("bad precision");
		double posx = bounds.pos.x();
		double posy = bounds.pos.y();
		collideLeft = collideRight = false;
		collideBelow = collideAbove = false;
		int leftx = (int) SimpleMath.roundd(posx);
		int bottomy = (int) SimpleMath.roundd(posy);
		if (leftx == SimpleMath.roundd(posx + x) && bottomy == SimpleMath.roundd(posy + y))
		{
			bounds.pos.x(Math.round(posx + x));
			bounds.pos.y(Math.round(posy + y));
			return;
		}
		
		int rightx, topy;
		if (x >= 0)
		{
			rightx = (int) SimpleMath.roundd(posx + bounds.size.x() + x);
		}
		else
		{
			leftx = (int) SimpleMath.roundd(posx + x);
			rightx = (int) SimpleMath.roundd(posx + bounds.size.x());
		}
		if (y >= 0)
		{
			topy = (int) SimpleMath.roundd(posy + bounds.size.y() + y);
		}
		else
		{
			bottomy = (int) SimpleMath.roundd(posy + y);
			topy = (int) SimpleMath.roundd(posy + bounds.size.y());
		}
		if (world.collision.getRect(leftx, bottomy, rightx, topy) == 0)
		{
			bounds.pos.add(x, y);
			if (x < 0) rightx = (int) SimpleMath.roundd(posx + bounds.size.x() + x);
			if (y >= 0) bottomy = (int) SimpleMath.roundd(posy + y);
			ground = world.collision.getRect(leftx, topy + 1, rightx, topy + 1) != 0;
			return;
		}
		
		int sgnx = (int) Math.signum(x);
		int sgny = (int) Math.signum(y);
		double offx = sgnx > 0 ? bounds.size.x() : 0;
		double offy = sgny > 0 ? bounds.size.y() : 0;
		double valx = SimpleMath.absd(x);
		double valy = SimpleMath.absd(y);
		double currx = 0, curry = 0;
		double dot1, dot2;
		double lenSqr = x * x + y * y;
		while (valx != 0 || valy != 0)
		{
			double diffx = Math.min(valx, prec) * sgnx;
			double diffy = Math.min(valy, prec) * sgny;
			
			if (sgnx != 0)
			{
				dot1 = VecUtils.dot2(x, y, currx + diffx, curry);
				if (dot1 > 0) dot1 = dot1 * dot1 / (lenSqr * ((currx + diffx) * (currx + diffx) + curry * curry));
			}
			else dot1 = 0;
			if (sgny != 0)
			{
				dot2 = VecUtils.dot2(x, y, currx, curry + diffy);
				if (dot2 > 0) dot2 = dot2 * dot2 / (lenSqr * (currx * currx + (curry + diffy) * (curry + diffy)));
			}
			else dot2 = 0;
			if (dot1 <= 0 && dot2 <= 0) throw new Error("cannot compute line");
			
			if (valx != 0 && (dot1 > dot2 || valy == 0))
			{
				int ix = (int) SimpleMath.roundd(posx + currx + diffx + offx);
				bottomy = (int) SimpleMath.roundd(posy + curry);
				topy = (int) SimpleMath.roundd(posy + curry + bounds.size.y());
				if (world.collision.getRect(ix, bottomy, ix, topy) == 0)
				{
					currx += diffx;
					valx -= SimpleMath.absd(diffx);
				}
				else
				{
					if (x > 0) collideRight = true;
					else collideLeft = true;
					x = currx;
					if (currx == 0) sgnx = 0;
					valx = 0;
				}
			}
			else
			{
				int iy = (int) SimpleMath.roundd(posy + curry + diffy + offy);
				leftx = (int) SimpleMath.roundd(posx + currx);
				rightx = (int) SimpleMath.roundd(posx + currx + bounds.size.x());
				if (world.collision.getRect(leftx, iy, rightx, iy) == 0)
				{
					curry += diffy;
					valy -= SimpleMath.absd(diffy);
				}
				else
				{
					if (y < 0) collideAbove = true;
					else collideBelow = true;
					y = curry;
					if (curry == 0) sgny = 0;
					valy = 0;
				}
			}
		}
		
		bounds.pos.x(Math.round(bounds.pos.x() + currx));
		bounds.pos.y(Math.round(bounds.pos.y() + curry));
		leftx = (int) SimpleMath.roundd(bounds.pos.x());
		rightx = (int) SimpleMath.roundd(bounds.pos.x() + bounds.size.x());
		ground = world.collision.getRect(leftx, topy + 1, rightx, topy + 1) == 1;
	}
	
	public void draw()
	{
		GL11.glColor4f(1, 1, 1, 1);
		sprite.drawPos(bounds.pos.x(), bounds.pos.y(), bounds.size.x(), bounds.size.y(), 0, 0, 0);
	}
}
