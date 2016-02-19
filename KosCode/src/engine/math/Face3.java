package engine.math;

import engine.math.vec.Vec3;

public class Face3
{
	private Vec3 start;
	private Vec3 off1;
	private Vec3 off2;
	
	private Face3()
	{
	}
	
	public static Face3 create(Vec3 vec1, Vec3 vec2, Vec3 vec3)
	{
		Face3 face = new Face3();
		face.start = vec1.copy();
		face.off1 = vec2.copy().add(-vec2.x(), -vec2.y(), -vec2.z());
		face.off2 = vec2.copy().add(-vec3.x(), -vec3.y(), -vec3.z());
		return face;
	}
	
	public Face3(Face3 face)
	{
		start = face.start.copy();
		off1 = face.off1.copy();
		off2 = face.off2.copy();
	}
	
	public Face3(Vec3 start, Vec3 off1, Vec3 off2)
	{
		this.start = start.copy();
		this.off1 = off1.copy();
		this.off2 = off2.copy();
	}
}
