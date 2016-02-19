package engine.math.vec;

import org.lwjgl.opengl.GL11;

public class Vec2 extends Vec
{
	private double x;
	private double y;
	
	public Vec2(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Vec2 copy()
	{
		return new Vec2(x, y);
	}
	
	public int getDimensions()
	{
		return 2;
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
	
	public Vec2 set(double x, double y)
	{
		this.x = x;
		this.y = y;
		return this;
	}
	
	public Vec2 set(Vec other)
	{
		x = other.x();
		y = other.y();
		return this;
	}
	
	public Vec2 add(double x, double y)
	{
		this.x += x;
		this.y += y;
		return this;
	}
	
	public Vec2 add(Vec other)
	{
		x += other.x();
		y += other.y();
		return this;
	}
	
	public Vec2 sub(double x, double y)
	{
		this.x -= x;
		this.y -= y;
		return this;
	}
	
	public Vec2 sub(Vec other)
	{
		x -= other.x();
		y -= other.y();
		return this;
	}
	
	public Vec2 mul(double x, double y)
	{
		this.x *= x;
		this.y *= y;
		return this;
	}
	
	public Vec2 mul(Vec other)
	{
		x *= other.x();
		y *= other.y();
		return this;
	}
	
	public Vec2 div(double x, double y)
	{
		this.x /= x;
		this.y /= y;
		return this;
	}
	
	public Vec2 div(Vec other)
	{
		x /= other.x();
		y /= other.y();
		return this;
	}
	
	public Vec2 toUnitVector()
	{
		super.toUnitVector();
		return this;
	}
	
	/**
	 * calculates the cross product of 2 vectors
	 * @param other the other vector to use
	 * @return the cross product
	 */
	public double cross(Vec2 other)
	{
		return x * other.y - y * other.x;
	}
	
	public void glVertex()
	{
		GL11.glVertex2d(x, y);
	}
	
	public void glTexCoord()
	{
		GL11.glTexCoord2d(x, y);
	}
}
