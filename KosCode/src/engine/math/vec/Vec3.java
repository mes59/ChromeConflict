package engine.math.vec;

import org.lwjgl.opengl.GL11;

public class Vec3 extends Vec
{
	private double x;
	private double y;
	private double z;
	
	public Vec3(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vec3 copy()
	{
		return new Vec3(x, y, z);
	}
	
	public int getDimensions()
	{
		return 3;
	}
	
	public double x()
	{
		return x;
	}
	
	public void x(double x)
	{
		this.x = x;
	}
	
	public double y()
	{
		return y;
	}
	
	public void y(double y)
	{
		this.y = y;
	}
	
	public double z()
	{
		return z;
	}
	
	public void z(double z)
	{
		this.z = z;
	}
	
	public Vec3 set(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		return this;
	}
	
	public Vec3 set(Vec other)
	{
		x = other.x();
		y = other.y();
		z = other.z();
		return this;
	}
	
	public Vec3 add(double x, double y, double z)
	{
		this.x += x;
		this.y += y;
		this.z += z;
		return this;
	}
	
	public Vec3 add(Vec3 other)
	{
		x += other.x;
		y += other.y;
		z += other.z;
		return this;
	}
	
	public Vec3 sub(double x, double y, double z)
	{
		this.x -= x;
		this.y -= y;
		this.z -= z;
		return this;
	}
	
	public Vec3 sub(Vec3 other)
	{
		x -= other.x;
		y -= other.y;
		z -= other.z;
		return this;
	}
	
	public Vec3 mul(double x, double y, double z)
	{
		this.x *= x;
		this.y *= y;
		this.z *= z;
		return this;
	}
	
	public Vec3 mul(Vec3 other)
	{
		x *= other.x;
		y *= other.y;
		z *= other.z;
		return this;
	}
	
	public Vec3 div(double x, double y, double z)
	{
		this.x /= x;
		this.y /= y;
		this.z /= z;
		return this;
	}
	
	public Vec3 div(Vec3 other)
	{
		x /= other.x;
		y /= other.y;
		z /= other.z;
		return this;
	}
	
	public Vec3 toUnitVector()
	{
		super.toUnitVector();
		return this;
	}
	
	/**
	 * calculates the cross product of 2 vectors
	 * @param other the other vector to use
	 * @return the cross product
	 */
	public Vec3 cross(Vec3 other)
	{
		double x = y() * other.z() - z() * other.y();
		double y = z() * other.x() - x() * other.z();
		double z = x() * other.y() - y() * other.x();
		return new Vec3(x, y, z);
	}
	
	public void glVertex()
	{
		GL11.glVertex3d(x, y, z);
	}
	
	public void glTexCoord()
	{
		GL11.glTexCoord3d(x, y, z);
	}
	
	public void glNormal()
	{
		GL11.glNormal3d(x, y, z);
	}
}
