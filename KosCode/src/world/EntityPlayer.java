package world;

import static main.ChromeConflict.*;
import static net.packet.PacketClientAction.*;
import main.ChromeConflict;
import net.client.CCClient;
import net.packet.PacketClientAction;
import net.packet.PacketFireWeapon;

import org.lwjgl.opengl.Display;

import sentinel.Sentinel;
import engine.app.event.KeyEvent;
import engine.app.event.MouseEvent;
import engine.app.graphics.GLBase;
import engine.app.graphics.GLUtils;
import engine.app.graphics.g2d.SpriteSheet;
import engine.app.gui.Interface;
import engine.math.vec.Vec2;
import engine.net.data.IOData;
import engine.net.data.IODataString;
import engine.net.data.IODataTable;

public class EntityPlayer extends EntitySentinel
{
	public String name;
	public int selected;
	
	EntityPlayer(int entityId)
	{
		super(entityId);
		sprite = new Drawable(new SpriteSheet("valhalla", 2, 1), 0, 0);
		bounds.size.set(sprite.getTileWidth(), sprite.getTileHeight());
	}
	
	public EntityPlayer(int entityId, Sentinel sentinel, String name)
	{
		super(entityId, sentinel);
		sprite = new Drawable(new SpriteSheet("valhalla", 2, 1), 0, 0);
		bounds.size.set(sprite.getTileWidth(), sprite.getTileHeight());
		this.name = name;
	}
	
	protected IODataTable createDTable()
	{
		IODataTable table = super.createDTable();
		table.put("name", new IODataString(name));
		return table;
	}
	
	protected void readDTable(IODataTable table)
	{
		super.readDTable(table);
		name = IOData.expect(table.get("name"), IODataString.class).value;
	}
	
	public void update(int delta, double gravity, int mods)
	{
		super.update(delta, gravity, mods);
		if (world instanceof WorldClient)
		{
			CCClient client = ((WorldClient) world).getClient();
			if (client == null) throw new Error("bad context");
			if (client.getPlayer() != this) return;
			int[] keys = ChromeConflict.inst.keys;
			if (Interface.keyboard() > 0)
			{
				for (KeyEvent e : Interface.getKeyboardEvents())
				{
					if (e.key == keys[IDX_JUMP_FLY])
					{
						if (e.state)
						{
							double ang = getMouseDirection();
							client.sendPacket(new PacketClientAction(JUMP_FLY, ang));
						}
					}
					else
					{
						if (e.state)
						{
							if (e.key == keys[IDX_STOP_MOVING]) client.sendPacket(new PacketClientAction(STOP_MOVING));
							else if (e.key == keys[IDX_WALK_LEFT]) client.sendPacket(new PacketClientAction(WALK_LEFT));
							else if (e.key == keys[IDX_WALK_RIGHT]) client.sendPacket(new PacketClientAction(WALK_RIGHT));
							else if (e.key == keys[IDX_ACC_LEFT]) client.sendPacket(new PacketClientAction(ACC_LEFT));
							else if (e.key == keys[IDX_ACC_RIGHT]) client.sendPacket(new PacketClientAction(ACC_RIGHT));
							else if (e.key == keys[IDX_ACC_DOWN]) client.sendPacket(new PacketClientAction(ACC_DOWN));
							else if (e.key == keys[IDX_ACC_UP]) client.sendPacket(new PacketClientAction(ACC_UP));
						}
						else
						{
							if (e.key == keys[IDX_ACC_LEFT]) client.sendPacket(new PacketClientAction(STOP_LEFT));
							else if (e.key == keys[IDX_ACC_RIGHT]) client.sendPacket(new PacketClientAction(STOP_RIGHT));
							else if (e.key == keys[IDX_ACC_DOWN]) client.sendPacket(new PacketClientAction(STOP_DOWN));
							else if (e.key == keys[IDX_ACC_UP]) client.sendPacket(new PacketClientAction(STOP_UP));
						}
					}
				}
			}
			
			int select = 0;
			if (Interface.mouse() > 0)
			{
				for (MouseEvent e : Interface.getMouseEvents())
				{
					if (e.button == 0 && e.state)
					{
						double ang = getMouseDirection();
						client.sendPacket(new PacketFireWeapon(selected, ang));
					}
					else if (e.button == -1) select += e.wheel / 120;
				}
			}
			if (Interface.keyboard() > 0)
			{
				for (KeyEvent e : Interface.getKeyboardEvents())
				{
					if (e.state)
					{
						if (e.key == keys[IDX_SELECT_PREV]) select--;
						if (e.key == keys[IDX_SELECT_NEXT]) select++;
					}
				}
			}
			
			if (select != 0)
			{
				if (select > 0)
				{
					if (selected + select >= weapons.length) select = weapons.length - selected - 1;
				}
				else if (select < 0)
				{
					if (selected + select < 0) select = -selected;
				}
				selected += select;
			}
		}
	}
	
	private double getMouseDirection()
	{
		if (!Display.isCreated()) throw new IllegalStateException("display not created");
		Vec2 off = ((WorldClient) world).getLastDrawingOffset().copy();
		off.x(bounds.pos.x() + bounds.size.x() / 2 + off.x());
		off.y(bounds.pos.y() + bounds.size.y() / 2 + off.y());
		GLUtils.render(off, off, false);
		off.add(1, 1).mul(GLBase.getDisplayMiddle());
		int x = Interface.getMouseX(), y = Interface.getMouseY();
		return Math.atan2(off.y() - y, x - off.x());
	}
}
