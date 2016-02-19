package engine.math;

import engine.math.vec.Vec2;

public class Line2
{
	private Vec2 start;
	private Vec2 off;
	
	private Line2()
	{
	}
	
	public static Line2 create(Vec2 start, Vec2 end)
	{
		Line2 line = new Line2();
		line.start = start.copy();
		line.off = end.copy().sub(start);
		line.off.toUnitVector();
		return line;
	}
	
	public Line2(Line2 src)
	{
		if (src != null)
		{
			start = src.start.copy();
			off = src.off.copy();
		}
	}
	
	public Line2(Vec2 start, Vec2 off)
	{
		this.start = start.copy();
		this.off = off.copy();
		this.off.toUnitVector();
	}
	
	public Vec2 getStartVec()
	{
		return start.copy();
	}
	
	public Vec2 getOffsetVec()
	{
		return off.copy();
	}
	
	public Vec2 getForX(double x)
	{
		if (off.x() == 0)
		{
			if (start.x() != x) return null;
			else return start.copy();
		}
		double factor = (x - start.x()) / off.x();
		return new Vec2(x, start.y() + off.y() * factor);
	}
	
	public Vec2 getForY(double y)
	{
		if (off.y() == 0)
		{
			if (start.y() != y) return null;
			else return start.copy();
		}
		double factor = (y - start.y()) / off.y();
		return new Vec2(start.x() + off.x() * factor, y);
	}
	
	public Vec2 getProjection(Vec2 vec)
	{
		Vec2 temp = vec.copy().add(-start.x(), -start.y());
		double factor = off.dot(temp);
		temp = off.copy().mul(factor, factor);
		return temp.add(start.x(), start.y());
	}
	
	public Line2 getVertical(Vec2 vec)
	{
		Line2 line = new Line2();
		line.start = vec.copy();
		line.off = new Vec2(off.y(), -off.x());
		return line;
	}
	
	public Vec2 getIntersection(Line2 line)
	{
		if (off.equals(line.off)) return null;
		double dist = line.start.copy().sub(start).cross(line.off);
		dist = dist / off.cross(line.off);
		return new Vec2(start.x() + dist * off.x(), start.y() + dist * off.y());
	}
	
	public double getDistance2(Vec2 vec)
	{
		return vec.getDistance2(getProjection(vec));
	}
	
	public double getDistance(Vec2 vec)
	{
		return vec.getDistance(getProjection(vec));
	}
	
	public Line2 getParallel(Vec2 vec)
	{
		Line2 line = new Line2();
		line.start = vec.copy();
		line.off = off.copy();
		return line;
	}
	
	public Line2 getParallel(double dist)
	{
		Line2 line = new Line2();
		line.start = start.copy();
		line.start.add(-off.y() * dist, off.x() * dist);
		line.off = off.copy();
		return line;
	}
}
