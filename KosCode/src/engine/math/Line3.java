package engine.math;

import engine.math.vec.Vec3;

public class Line3
{
	private Vec3 start;
	private Vec3 off;
	
	private Line3()
	{
	}
	
	public static Line3 create(Vec3 start, Vec3 end)
	{
		Line3 line = new Line3();
		line.start = start.copy();
		line.off = end.copy().add(-start.x(), -start.y(), -start.z());
		line.off.toUnitVector();
		return line;
	}
	
	public Line3(Line3 src)
	{
		if (src != null)
		{
			start = src.start.copy();
			off = src.off.copy();
		}
	}
	
	public Line3(Vec3 start, Vec3 off)
	{
		this.start = start.copy();
		this.off = off.copy();
		this.off.toUnitVector();
	}
	
	public Vec3 getStartVec()
	{
		return start.copy();
	}
	
	public Vec3 getOffsetVec()
	{
		return off.copy();
	}
	
	public Vec3 getVecByX(double x)
	{
		if (off.x() == 0) return null;
		double factor = (x - start.x()) / off.x();
		return new Vec3(x, start.y() + off.y() * factor, start.z() + off.z() * factor);
	}
	
	public Vec3 getVecByY(double y)
	{
		if (off.y() == 0) return null;
		double factor = (y - start.y()) / off.y();
		return new Vec3(start.x() + off.x() * factor, y, start.z() + off.z() * factor);
	}
	
	public Vec3 getVecByZ(double z)
	{
		if (off.z() == 0) return null;
		double factor = (z - start.z()) / off.z();
		return new Vec3(start.x() + off.x() * factor, start.y() + off.y() * factor, z);
	}
	
	// TODO fix everything, check everything
	
	public Vec3 getProjection(Vec3 vec)
	{
		Vec3 temp = vec.copy().sub(start);
		double factor = off.dot(temp);
		temp = off.copy().mul(factor, factor, factor);
		return temp.add(start);
	}
	
	public Face3 getVertical(Vec3 vec)
	{
		return null;
	}
	
	public Vec3 getIntersection(Line3 line)
	{
		if (off.equals(line.off)) return null;
		Vec3 temp = line.start.copy().sub(start).cross(line.off);
		temp = temp.div(off.cross(line.off));
		Vec3 test = line.start.copy().sub(start).cross(off);
		test = test.div(off.cross(line.off));
		return temp;
	}
	
	public double getDistance2(Vec3 vec)
	{
		return vec.getDistance2(getProjection(vec));
	}
	
	public double getDistance(Vec3 vec)
	{
		return Math.sqrt(getDistance2(vec));
	}
	
	public Line3 getParallel(Vec3 vec)
	{
		Line3 line = new Line3();
		line.start = vec.copy();
		line.off = off.copy();
		return line;
	}
}
