package engine.math;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.opengl.GL11;

import engine.math.vec.Vec2;
import engine.util.Utils;

public class Rect2
{
	public final Vec2 pos;
	public final Vec2 size;
	
	public Rect2(double posx, double posy, double width, double height)
	{
		pos = new Vec2(posx, posy);
		size = new Vec2(width, height);
	}
	
	public static Rect2 createCentered(double posx, double posy, double width, double height)
	{
		posx -= width / 2;
		posy -= height / 2;
		return new Rect2(posx, posy, width, height);
	}
	
	public Vec2 getMiddle()
	{
		if (size.x() == 0 && size.y() == 0) return pos;
		return pos.copy().add(size.x() / 2, size.y() / 2);
	}
	
	public void draw(boolean full)
	{
		glDisable(GL_TEXTURE_2D);
		if (full) glBegin(GL_QUADS);
		else glBegin(GL_LINE_LOOP);
		{
			GL11.glVertex2d(pos.x(), pos.y());
			GL11.glVertex2d(pos.x() + size.x(), pos.y());
			GL11.glVertex2d(pos.x() + size.x(), pos.y() + size.y());
			GL11.glVertex2d(pos.x(), pos.y() + size.y());
		}
		glEnd();
	}
	
	public boolean isInside(double x, double y)
	{
		boolean insx = Utils.inrange2(x, pos.x(), pos.x() + size.x());
		boolean insy = Utils.inrange2(y, pos.y(), pos.y() + size.y());
		return insx && insy;
	}
	
	public double getIntersection(Vec2 off, Vec2 dir)
	{
		if (isInside(off.x(), off.y())) return 0;
		double x = Double.NaN, y = Double.NaN, f;
		if (dir.x() > 0)
		{
			f = (pos.x() - off.x()) / dir.x();
			if (f >= 0 && f <= 1)
			{
				if (Utils.inrange2(off.y() + dir.y() * f, pos.y(), pos.y() + size.y())) x = f;
			}
		}
		else if (dir.x() < 0)
		{
			f = (pos.x() + size.x() - off.x()) / dir.x();
			if (f >= 0 && f <= 1)
			{
				if (Utils.inrange2(off.y() + dir.y() * f, pos.y(), pos.y() + size.y())) x = f;
			}
		}
		if (dir.y() > 0)
		{
			f = (pos.y() - off.y()) / dir.y();
			if (f >= 0 && f <= 1)
			{
				if (Utils.inrange2(off.x() + dir.x() * f, pos.x(), pos.x() + size.x())) y = f;
			}
		}
		else if (dir.y() < 0)
		{
			f = (pos.y() + size.y() - off.y()) / dir.y();
			if (f >= 0 && f <= 1)
			{
				if (Utils.inrange2(off.x() + dir.x() * f, pos.x(), pos.x() + size.x())) y = f;
			}
		}
		
		if (Double.isNaN(x)) return y;
		if (Double.isNaN(y)) return x;
		if (x < y) return x;
		return y;
	}
	
	public boolean isColliding(Rect2 other)
	{
		boolean insx = Utils.inrange2(other.pos.x(), pos.x(), pos.x() + size.x());
		boolean insy = Utils.inrange2(other.pos.y(), pos.y(), pos.y() + size.y());
		return insx && insy;
	}
	
	public String toString()
	{
		return pos + " & " + size;
	}
}
