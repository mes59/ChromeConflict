package engine.math.vec;

public abstract class Vec
{
	// package private constructor to avoid third party vector types
	Vec()
	{
	}
	
	/**
	 * copy this vector, this means youll get a new instance with all values set the same
	 * <br>maybe should have called this clone() but whatever :)
	 * @return a copy of this vector
	 */
	public abstract Vec copy();
	
	/**
	 * returns a number indicating how many dimensions this vector has
	 * <br>this should be a number between 1 and 4 inclusive, since third party vectors are not expected
	 * @return dimension count
	 */
	public abstract int getDimensions();
	
	/**
	 * gets the x component of this vector, or 0 if none exists
	 * @return the x component
	 */
	public double x()
	{
		return 0;
	}
	
	/**
	 * sets the x component of this vector or does nothing if none exists
	 * @param x the new x component
	 */
	public void x(double x)
	{
	}
	
	/**
	 * gets the y component of this vector, or 0 if none exists
	 * @return the y component
	 */
	public double y()
	{
		return 0;
	}
	
	/**
	 * sets the y component of this vector or does nothing if none exists
	 * @param y the new y component
	 */
	public void y(double y)
	{
	}
	
	/**
	 * gets the z component of this vector, or 0 if none exists
	 * @return the z component
	 */
	public double z()
	{
		return 0;
	}
	
	/**
	 * sets the z component of this vector or does nothing if none exists
	 * @param z the new z component
	 */
	public void z(double z)
	{
	}
	
	/**
	 * gets the w component of this vector, or 0 if none exists
	 * @return the w component
	 */
	public double w()
	{
		return 0;
	}
	
	/**
	 * sets the w component of this vector or does nothing if none exists
	 * @param w the new w component
	 */
	public void w(double w)
	{
	}
	
	/**
	 * sets this vectors components
	 * @param x new x coordinate
	 * @param y new y coordinate
	 * @param z new z coordinate
	 * @param w new w coordinate
	 */
	public Vec set(double x, double y, double z, double w)
	{
		x(x);
		y(y);
		z(z);
		w(w);
		return this;
	}
	
	/**
	 * translates this vector
	 * @param x the x offset
	 * @param y the y offset
	 * @param z the z offset
	 * @param w the w offset
	 */
	public Vec add(double x, double y, double z, double w)
	{
		x(x() + x);
		y(y() + y);
		z(z() + z);
		w(w() + w);
		return this;
	}
	
	/**
	 * translates this vector
	 * @param x the x offset
	 * @param y the y offset
	 * @param z the z offset
	 * @param w the w offset
	 */
	public Vec sub(double x, double y, double z, double w)
	{
		x(x() - x);
		y(y() - y);
		z(z() - z);
		w(w() - w);
		return this;
	}
	
	/**
	 * scales this vector
	 * @param x the x factor
	 * @param y the y factor
	 * @param z the z factor
	 * @param w the w factor
	 */
	public Vec mul(double x, double y, double z, double w)
	{
		x(x() * x);
		y(y() * y);
		z(z() * z);
		w(w() * w);
		return this;
	}
	
	/**
	 * scales this vector
	 * @param x the x factor
	 * @param y the y factor
	 * @param z the z factor
	 * @param w the w factor
	 */
	public Vec div(double x, double y, double z, double w)
	{
		x(x() / x);
		y(y() / y);
		z(z() / z);
		w(w() / w);
		return this;
	}
	
	/**
	 * returns the square of the length of this vector
	 * <br>should be used instad of getLength() if possible
	 * @return the square of the length of this vector
	 */
	public double getLength2()
	{
		double value = 0;
		value += Math.pow(x(), 2);
		value += Math.pow(y(), 2);
		value += Math.pow(z(), 2);
		value += Math.pow(w(), 2);
		return value;
	}
	
	/**
	 * returns the length of this vector
	 * <br>getLength2() should be preferred if possible
	 * @return the length of this vector
	 */
	public double getLength()
	{
		return Math.sqrt(getLength2());
	}
	
	/**
	 * returns the square of the distance between this vector and vec
	 * <br>should be used instad of getDistance() if possible
	 * @return the square of the distance to vec
	 */
	public double getDistance2(Vec vec)
	{
		double value = 0;
		value += Math.pow(vec.x() - x(), 2);
		value += Math.pow(vec.y() - y(), 2);
		value += Math.pow(vec.z() - z(), 2);
		value += Math.pow(vec.w() - w(), 2);
		return value;
	}
	
	/**
	 * returns the distance between this vector and vec
	 * <br>getDistance2() should be used if possible
	 * @return the distance to vec
	 */
	public double getDistance(Vec vec)
	{
		return Math.sqrt(getDistance2(vec));
	}
	
	/**
	 * turns this vector into a unit vector and returns the instance
	 * <br>if you want a new instance use .copy().toUnitVector();
	 * @return the unit vector, which may be the same instance
	 */
	public Vec toUnitVector()
	{
		double len = getLength();
		if (len == 1) return this;
		if (len == 0)
		{
			set(1, 0, 0, 0);
			return this;
		}
		if (Double.isInfinite(len))
		{
			if (Double.isInfinite(x())) x(1);
			else x(0);
			if (Double.isInfinite(y())) y(1);
			else y(0);
			if (Double.isInfinite(z())) z(1);
			else z(0);
			if (Double.isInfinite(w())) w(1);
			else w(0);
			return toUnitVector();
		}
		x(x() / len);
		y(y() / len);
		z(z() / len);
		w(w() / len);
		return this;
	}
	
	/**
	 * calculates the dot product of 2 vectors
	 * @param other the other vector to use
	 * @return the dot product
	 */
	public double dot(Vec other)
	{
		double value = x() * other.x();
		value += y() * other.y();
		value += z() * other.z();
		return value + w() * other.w();
	}
	
	/**
	 * returns a readable version of this vector
	 * <br>the components will be separated by spaces
	 * @return this vector in string form;
	 */
	public final String toString()
	{
		String str = "";
		int dims = getDimensions();
		if (dims >= 1) str += x();
		if (dims >= 2) str += " " + y();
		if (dims >= 3) str += " " + z();
		if (dims >= 4) str += " " + w();
		return str.trim();
	}
	
	/**
	 * checks if this vector is equal to another object
	 * <br>this is true if and only if either this vector is the same instance as other
	 * <br>or if other is a vector with all of its components equal to the ones of this vector
	 * <br>this means that new Vec3(4, 5, 0) and new Vec2(4, 5) are equal, as any component defaults to 0
	 * @param other the instance to check
	 * @return if this and other are equal
	 */
	public final boolean equals(Object other)
	{
		if (other == this) return true;
		if (other instanceof Vec)
		{
			Vec vec = (Vec) other;
			if (vec.x() != x()) return false;
			if (vec.y() != y()) return false;
			if (vec.z() != z()) return false;
			return vec.w() == w();
		}
		return false;
	}
}
