package engine.app.graphics.g3d;

import java.util.ArrayList;

import engine.math.vec.Vec3;
import engine.math.vec.Vec4;

public class OBJModel
{
	protected ArrayList<Vec4> vertices;
	protected ArrayList<Vec3> texcrds;
	protected ArrayList<Vec3> normals;
	protected OBJFace[] faces;
	
	public OBJModel()
	{
		vertices = new ArrayList<>();
		texcrds = new ArrayList<>();
		normals = new ArrayList<>();
		faces = new OBJFace[0];
	}
	
	public void draw()
	{
		for (OBJFace face : faces)
		{
			face.draw();
		}
	}
	
	public void add(OBJFace face)
	{
		OBJFace[] temp = new OBJFace[faces.length + 1];
		System.arraycopy(faces, 0, temp, 0, faces.length);
		temp[faces.length] = face;
		faces = temp;
	}
	
	public Vec4 getVertex(int index)
	{
		if (index < 0)
		{
			index = vertices.size() + index;
		}
		return vertices.get(index);
	}
	
	public Vec3 getTexCoord(int index)
	{
		if (index < 0)
		{
			index = texcrds.size() + index;
		}
		return texcrds.get(index);
	}
	
	public Vec3 getNormal(int index)
	{
		if (index < 0)
		{
			index = normals.size() + index;
		}
		return normals.get(index);
	}
}
