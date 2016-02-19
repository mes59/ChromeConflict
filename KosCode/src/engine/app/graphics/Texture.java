package engine.app.graphics;

import org.lwjgl.opengl.GL11;

public class Texture
{
	public final int id;
	public final int imgWidth;
	public final int imgHeight;
	public final int texWidth;
	public final int texHeight;
	
	public Texture(int id, int imgWidth, int imgHeight, int texWidth, int texHeight)
	{
		this.id = id;
		this.imgWidth = imgWidth;
		this.imgHeight = imgHeight;
		this.texWidth = texWidth;
		this.texHeight = texHeight;
	}
	
	protected void finalize()
	{
		GL11.glDeleteTextures(id);
	}
}
