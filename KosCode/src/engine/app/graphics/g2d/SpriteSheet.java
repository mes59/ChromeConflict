package engine.app.graphics.g2d;

import static org.lwjgl.opengl.GL11.*;
import engine.app.graphics.Texture;
import engine.app.graphics.TextureLoader;
import engine.math.SimpleMath;
import engine.math.vec.Vec2;

public class SpriteSheet
{
	public final int tilesx;
	public final int tilesy;
	public final Texture texture;
	public final String texName;
	
	public SpriteSheet(String texName, int xcount, int ycount)
	{
		texture = TextureLoader.getTexture(texName);
		if (xcount <= 0) tilesx = texture.imgWidth;
		else tilesx = xcount;
		if (ycount <= 0) tilesy = texture.imgHeight;
		else tilesy = ycount;
		this.texName = texName;
	}
	
	public boolean isDrawable()
	{
		return texture.id != -1;
	}
	
	public SpriteSheet(int xcount, int ycount, Texture texture)
	{
		if (xcount <= 0) tilesx = texture.imgWidth;
		else tilesx = xcount;
		if (ycount <= 0) tilesy = texture.imgHeight;
		else tilesy = ycount;
		this.texture = texture;
		texName = TextureLoader.getName(texture);
	}
	
	public void drawScaled(double posx, double posy, double stretchx, double stretchy, int tilex, int tiley, double centerx, double centery, double angle)
	{
		if (stretchx == 0 || stretchy == 0) return;
		double sizex = stretchx * getTileWidth();
		double sizey = stretchy * getTileHeight();
		drawPositioned(posx, posy, sizex, sizey, tilex, tiley, centerx, centery, angle);
	}
	
	public void drawPositioned(double posx, double posy, double sizex, double sizey, int tilex, int tiley, double centerx, double centery, double angle)
	{
		if (sizex == 0 || sizey == 0) return;
		tilex = SimpleMath.clampi(tilex, 0, tilesx - 1);
		tiley = SimpleMath.clampi(tiley, 0, tilesy - 1);
		
		double xlim = (double) texture.imgWidth / texture.texWidth;
		double ylim = (double) texture.imgHeight / texture.texHeight;
		double tx1 = xlim * tilex / tilesx;
		double tx2 = xlim * (tilex + 1) / tilesx;
		double ty1 = ylim * tiley / tilesy;
		double ty2 = ylim * (tiley + 1) / tilesy;
		
		glEnable(GL_TEXTURE_2D);
		glBindTexture(GL_TEXTURE_2D, texture.id);
		glPushMatrix();
		{
			glTranslated(posx, posy, 0);
			glRotated(angle, 0, 0, 1);
			glTranslated(-centerx * sizex, -centery * sizey, 0);
			glBegin(GL_QUADS);
			{
				glTexCoord2d(tx1, ty2);
				glVertex2d(0, sizey);
				
				glTexCoord2d(tx2, ty2);
				glVertex2d(sizex, sizey);
				
				glTexCoord2d(tx2, ty1);
				glVertex2d(sizex, 0);
				
				glTexCoord2d(tx1, ty1);
				glVertex2d(0, 0);
			}
			glEnd();
		}
		glPopMatrix();
	}
	
	public int getTileWidth()
	{
		return texture.imgWidth / tilesx;
	}
	
	public int getTileHeight()
	{
		return texture.imgHeight / tilesy;
	}
	
	public Vec2 getTileBounds()
	{
		return new Vec2(getTileWidth(), getTileHeight());
	}
}
