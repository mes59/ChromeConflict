package world;

import java.util.Arrays;
import java.util.Vector;

import org.lwjgl.opengl.GL11;

import sentinel.Sentinel;
import sentinel.weapon.Weapon;
import engine.math.SimpleMath;
import engine.net.data.IOData;
import engine.net.data.IODataInt;
import engine.net.data.IODataTable;

public abstract class EntitySentinel extends Entity
{
	private Sentinel sent;
	public float hull;
	public float shield;
	public float energy;
	public int eloss;
	public int walkDir;
	
	protected int[] amount;
	protected Weapon[] weapons;
	
	public Weapon lastHit;
	public EntitySentinel attacker;
	
	EntitySentinel(int entityId)
	{
		super(entityId);
	}
	
	public EntitySentinel(int entityId, Sentinel sentinel)
	{
		super(entityId);
		sent = sentinel;
		hull = sent.chassis.hull;
		shield = sent.chassis.shield;
		energy = sent.chassis.energy;
		buildWeaponTable();
	}
	
	private void buildWeaponTable()
	{
		amount = new int[sent.chassis.slots];
		Vector<Weapon> weapons = new Vector<>(amount.length);
		for (int i = 0; i < amount.length; i++)
		{
			Weapon w = sent.getWeapon(i);
			if (w == null) continue;
			int idx = weapons.indexOf(w);
			if (idx == -1)
			{
				amount[weapons.size()] = 1;
				weapons.add(w);
			}
			else amount[idx] += 1;
		}
		amount = Arrays.copyOf(amount, weapons.size());
		this.weapons = weapons.toArray(new Weapon[weapons.size()]);
	}
	
	protected IODataTable createDTable()
	{
		IODataTable table = super.createDTable();
		table.put("eloss", new IODataInt(eloss));
		table.put("sent", sent.writeDTable());
		return table;
	}
	
	protected void readDTable(IODataTable table)
	{
		super.readDTable(table);
		eloss = IOData.expect(table.get("eloss"), IODataInt.class).value;
		sent = Sentinel.readDTable(IOData.expect(table.get("sent"), IODataTable.class));
		hull = sent.chassis.hull;
		shield = sent.chassis.shield;
		energy = sent.chassis.energy;
		buildWeaponTable();
	}
	
	public Sentinel getSentinel()
	{
		return sent;
	}
	
	public int getWeaponCount()
	{
		return amount.length;
	}
	
	public int getTypeCount(int idx)
	{
		return amount[idx];
	}
	
	public Weapon getWeapon(int idx)
	{
		return weapons[idx];
	}
	
	public void update(int delta, double gravity, int mods)
	{
		super.update(delta, gravity, mods);
		runAdvancedPhysics(delta);
		if (world instanceof WorldClient)
		{
			walk(walkDir * 5, 2);
			return;
		}
		float time = delta / 1000f;
		if (eloss > 0) eloss -= delta;
		if (eloss < 0) eloss = 0;
		if (shield < sent.chassis.shield)
		{
			shield += sent.chassis.regen * time;
			if (shield > sent.chassis.shield)
			{
				shield = sent.chassis.shield;
			}
		}
		if (energy < sent.chassis.energy)
		{
			float regen = sent.chassis.recharge * time;
			if (eloss > 0)
			{
				eloss -= regen / 2;
				if (eloss < 0)
				{
					regen = -eloss * 2;
					eloss = 0;
				}
				else regen = 0;
			}
			if (regen > 0)
			{
				energy += regen;
				if (energy > sent.chassis.energy) energy = sent.chassis.energy;
			}
		}
		walk(walkDir, 2);
	}
	
	public void walk(double value, int acc)
	{
		int remain = (int) (value - value % acc);
		if (value != 0) value -= value % acc;
		if (!ground || value == 0 || acc <= 0) return;
		double posx = bounds.pos.x(), posy = bounds.pos.y();
		if (SimpleMath.roundd(posx) == SimpleMath.roundd(posx + value))
		{
			bounds.pos.add(value, 0);
			return;
		}
		int leftx = (int) SimpleMath.roundd(posx);
		int rightx = (int) SimpleMath.roundd(posx + bounds.size.x());
		int topy = (int) SimpleMath.roundd(posy);
		int bottomy = (int) SimpleMath.roundd(posy + bounds.size.y());
		
		do
		{
			int x = value > 0 ? rightx : leftx;
			if (world.collision.getRect(x + acc, topy, x, bottomy) == 0)
			{
				if (value > 0)
				{
					posx += acc;
					leftx += acc;
					rightx += acc;
				}
				else
				{
					posx -= acc;
					leftx -= acc;
					rightx -= acc;
				}
				
				if (world.collision.getRect(leftx, bottomy + 1, rightx, bottomy + 1) == 0)
				{
					if (world.collision.getRect(leftx, bottomy + 2, rightx, bottomy + 2) != 0)
					{
						posy += 1;
						topy += 1;
						bottomy += 1;
					}
				}
				else if (world.collision.getRect(leftx, topy - 1, rightx, topy - 1) == 0)
				{
					if (world.collision.getRect(leftx, topy - 2, rightx, topy - 2) == 0)
					{
						if (world.collision.getRect(leftx, topy - 3, rightx, topy - 3) != 0)
						{
							posy += 2;
							topy += 2;
							bottomy += 2;
						}
					}
					else
					{
						posy += 1;
						topy += 1;
						bottomy += 1;
					}
				}
			}
			else
			{
				posx = Math.round(posx);
				remain = 0;
				vel.set(0, 0);
			}
			ground = world.collision.getRect(leftx, bottomy + 1, rightx, bottomy + 1) != 0;
		}
		while (ground && remain != 0);
		bounds.pos.set(posx, Math.ceil(posy));
		if (!ground) vel.set(value, 0);
	}
	
	public void draw()
	{
		GL11.glColor4f(1, 1, 1, 1);
		if (vel.x() < 0) sprite.setFrame(1, 0);
		if (vel.x() > 0) sprite.setFrame(0, 0);
		sprite.drawPos(bounds.pos.x(), bounds.pos.y(), bounds.size.x(), bounds.size.y(), 0, 0, 0);
	}
	
	public void drawOverlay()
	{
		double width = 2 * bounds.size.x();
		double hull = this.hull / sent.chassis.hull * width;
		double shield = this.shield / sent.chassis.shield * width;
		
		GL11.glPushMatrix();
		GL11.glTranslated(bounds.pos.x() - width / 4, bounds.pos.y() + bounds.size.y() + 20, 0);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glBegin(GL11.GL_QUADS);
		
		GL11.glColor3f(1f, 0, 0);
		GL11.glVertex2d(0, 0);
		GL11.glVertex2d(width, 0);
		GL11.glVertex2d(width, 10);
		GL11.glVertex2d(0, 10);
		GL11.glColor3f(0, 1f, 0);
		GL11.glVertex2d(0, 0);
		GL11.glVertex2d(hull, 0);
		GL11.glVertex2d(hull, 10);
		GL11.glVertex2d(0, 10);
		GL11.glColor3f(0, 1f, 1f);
		GL11.glVertex2d(0, 0);
		GL11.glVertex2d(shield, 0);
		GL11.glVertex2d(shield, 5);
		GL11.glVertex2d(0, 5);
		
		GL11.glEnd();
		GL11.glPopMatrix();
	}
}
