package world;

import java.util.Vector;

import net.client.CCClient;

import org.lwjgl.opengl.GL11;

import world.field.WorldField;
import engine.app.graphics.g2d.SpriteSheet;
import engine.math.vec.Vec2;

public class WorldClient extends World
{
	protected SpriteSheet terrain;
	protected SpriteSheet cavebg;
	protected SpriteSheet background;
	protected float[] bgcolor;
	protected boolean imageBackground;
	protected Vec2 drawOffset = new Vec2(0, 0);
	private CCClient client;
	
	protected Vector<Entity> adding;
	protected Vector<Entity> removing;
	
	WorldClient(double gravity)
	{
		super(gravity);
		bgcolor = new float[3];
		adding = new Vector<>();
		removing = new Vector<>();
	}
	
	public void setBackground(float[] color)
	{
		if (color == null)
		{
			if (background == null) throw new NullPointerException("color");
			else imageBackground = true;
		}
		else
		{
			imageBackground = false;
			System.arraycopy(color, 0, bgcolor, 0, 3);
		}
	}
	
	public void setClient(CCClient client)
	{
		if (client == null) throw new NullPointerException();
		if (this.client != null) throw new IllegalStateException("already configured");
		this.client = client;
	}
	
	public CCClient getClient()
	{
		return client;
	}
	
	public synchronized void add(Entity ent)
	{
		if (ent == null) return;
		adding.add(ent);
	}
	
	public synchronized void destroy(Entity ent)
	{
		if (ent == null) return;
		if (removing.contains(ent)) return;
		if (ent.world == this) removing.add(ent);
	}
	
	public synchronized Entity getEntityFromId(int id)
	{
		for (Entity ent : entities)
		{
			if (ent.entityId == id) return ent;
		}
		for (Entity ent : adding)
		{
			if (ent.entityId == id) return ent;
		}
		return null;
	}
	
	public synchronized void update(int delta)
	{
		addRemoveEnts();
		super.update(delta);
		addRemoveEnts();
	}
	
	private void addRemoveEnts()
	{
		for (Entity ent : adding)
		{
			if (ent.world == null)
			{
				entities.add(ent);
				ent.world = this;
			}
		}
		adding.clear();
		for (Entity ent : removing)
		{
			if (ent.world == this)
			{
				entities.remove(ent);
				ent.world = null;
			}
		}
		removing.clear();
	}
	
	public void draw(double offx, double offy)
	{
		int air = collision.getAir();
		if (imageBackground)
		{
			GL11.glColor4f(1, 1, 1, 1);
			background.drawPositioned(0, air, 1128, 705, 0, 0, 0, 0, 0);
		}
		else
		{
			GL11.glColor4f(bgcolor[0], bgcolor[1], bgcolor[2], 1);
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2d(0, 0);
			GL11.glVertex2d(1128, 0);
			GL11.glVertex2d(1128, 705);
			GL11.glVertex2d(0, 705);
			GL11.glEnd();
		}
		
		GL11.glPushMatrix();
		GL11.glTranslated(offx, offy, 0);
		drawOffset.set(offx, offy);
		GL11.glColor4f(1, 1, 1, 1);
		cavebg.drawScaled(0, air, 1, 1, 0, 0, 0, 0, 0);
		for (Entity entity : entities)
		{
			entity.draw();
		}
		for (WorldField field : fields)
		{
			field.draw();
		}
		GL11.glColor4f(1, 1, 1, 1);
		terrain.drawScaled(0, air, 1, 1, 0, 0, 0, 0, 0);
		for (Entity entity : entities)
		{
			if (entity instanceof EntitySentinel) ((EntitySentinel) entity).drawOverlay();
		}
		GL11.glPopMatrix();
	}
	
	public synchronized void drawCentered(Entity focus)
	{
		if (focus == null) return;
		Vec2 fpos = focus.bounds.getMiddle();
		double offx = 564 - fpos.x();
		double offy = 352.5 - fpos.y();
		
		double minx = 1128 - collision.getWidth();
		if (offx < minx) offx = minx;
		if (offx > 0) offx = 0;
		if (offy > 0) offy = 0;
		else
		{
			double miny = 705 - collision.getTotalHeight();
			if (offy < miny) offy = miny;
		}
		draw(offx, offy);
	}
	
	public synchronized Vec2 getLastDrawingOffset()
	{
		return drawOffset;
	}
}
