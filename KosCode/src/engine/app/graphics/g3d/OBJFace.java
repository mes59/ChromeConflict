package engine.app.graphics.g3d;

import org.lwjgl.opengl.GL11;

public class OBJFace
{
	protected OBJModel parent;
	protected int[] vertices;
	protected int[] texcrds;
	protected int[] normals;
	
	public OBJFace(OBJModel parent, int[] vertices, int[] texcrds, int[] normals)
	{
		this.parent = parent;
		
		if (vertices == null) throw new IllegalArgumentException("vertices must not be null");
		if (texcrds != null)
		{
			if (texcrds.length > vertices.length)
			{
				int[] temp = new int[vertices.length];
				System.arraycopy(texcrds, 0, temp, 0, temp.length);
				texcrds = temp;
			}
			else if (texcrds.length < vertices.length)
			{
				texcrds = null;
			}
		}
		if (normals != null)
		{
			if (normals.length > vertices.length)
			{
				int[] temp = new int[vertices.length];
				System.arraycopy(normals, 0, temp, 0, temp.length);
				normals = temp;
			}
			else if (normals.length < vertices.length)
			{
				normals = null;
			}
		}
		
		this.vertices = vertices;
		this.texcrds = texcrds;
		this.normals = normals;
	}
	
	public OBJModel getParent()
	{
		return parent;
	}
	
	public void draw()
	{
		GL11.glBegin(GL11.GL_POLYGON);
		{
			for (int i = 0; i < vertices.length; i++)
			{
				if (texcrds != null) parent.getTexCoord(texcrds[i]).glTexCoord();
				if (normals != null) parent.getNormal(normals[i]).glNormal();
				parent.getVertex(vertices[i]).glVertex();
			}
		}
		GL11.glEnd();
	}
}
