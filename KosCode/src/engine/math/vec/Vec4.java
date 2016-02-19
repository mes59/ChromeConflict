package engine.math.vec;

import org.lwjgl.opengl.GL11;

public class Vec4 extends Vec
{
	private double x;
	private double y;
	private double z;
	private double w;
	
	public Vec4(double x, double y, double z, double w)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public Vec4 copy()
	{
		return new Vec4(x, y, z, w);
	}
	
	public int getDimensions()
	{
		return 4;
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
	
	public double w()
	{
		return w;
	}
	
	public void w(double w)
	{
		this.w = w;
	}
	
	public Vec4 set(double x, double y, double z, double w)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
		return this;
	}
	
	public Vec4 set(Vec other)
	{
		x = other.x();
		y = other.y();
		z = other.z();
		w = other.w();
		return this;
	}
	
	public Vec4 add(double x, double y, double z, double w)
	{
		this.x += x;
		this.y += y;
		this.z += z;
		this.w += w;
		return this;
	}
	
	public Vec4 sub(double x, double y, double z, double w)
	{
		this.x -= x;
		this.y -= y;
		this.z -= z;
		this.w -= w;
		return this;
	}
	
	public Vec4 mul(double x, double y, double z, double w)
	{
		this.x *= x;
		this.y *= y;
		this.z *= z;
		this.w *= w;
		return this;
	}
	
	public Vec4 div(double x, double y, double z, double w)
	{
		this.x /= x;
		this.y /= y;
		this.z /= z;
		this.w /= w;
		return this;
	}
	
	public Vec4 toUnitVector()
	{
		super.toUnitVector();
		return this;
	}
	
	public void glVertex()
	{
		GL11.glVertex4d(x, y, z, w);
	}
	
	public void glTexCoord()
	{
		GL11.glTexCoord4d(x, y, z, w);
	}
}
