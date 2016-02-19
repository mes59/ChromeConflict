package world;

import sentinel.weapon.Weapon;
import world.field.WorldField;
import engine.net.data.IOData;
import engine.net.data.IODataTable;
import engine.net.data.IODataUByte;

public class EntityGFX extends Entity
{
	public EntityGFX()
	{
		super(-1);
	}
	
	protected void readDTable(IODataTable table)
	{
		Weapon wep = Weapon.weapons[IOData.expect(table.get("weapon"), IODataUByte.class).value];
		int mode = IOData.expect(table.get("mode"), IODataUByte.class).value;
		if (mode == 0) sprite = wep.getExplosion();
		else if (mode == 1) sprite = wep.getTrail();
		else throw new RuntimeException("bad format");
		bounds.size.set(sprite.getTileWidth(), sprite.getTileHeight());
	}
	
	public boolean isAffectedBy(WorldField field)
	{
		return false;
	}
	
	public void update(int delta, double gravity, int mods)
	{
		super.update(delta, gravity, mods | WorldField.NO_GRAVITY);
		if (!sprite.isRunning()) world.destroy(this);
	}
	
	public void draw()
	{
		if (sprite != null)
		{
			sprite.drawPos(bounds.pos.x(), bounds.pos.y(), bounds.size.x(), bounds.size.y(), 0.5, 0.5, 0);
		}
	}
}
