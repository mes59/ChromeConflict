package sentinel;

import main.CCUtils;
import sentinel.chassis.Chassis;
import sentinel.weapon.Weapon;
import engine.data.json.JSONArray;
import engine.data.json.JSONObject;
import engine.net.data.IOData;
import engine.net.data.IODataByteArr;
import engine.net.data.IODataTable;
import engine.net.data.IODataUByte;
import engine.util.IOUtils;

public class Sentinel
{
	protected static final IOUtils utils = CCUtils.utils;
	
	public final Chassis chassis;
	protected Weapon[] weapons;
	
	public Sentinel(Chassis chassis)
	{
		this.chassis = chassis;
		weapons = new Weapon[chassis.slots];
	}
	
	public void setWeapon(int slot, Weapon weapon)
	{
		weapons[slot] = weapon;
	}
	
	public Weapon getWeapon(int slot)
	{
		return weapons[slot];
	}
	
	public IODataTable writeDTable()
	{
		IODataTable table = new IODataTable();
		table.put("chassis", new IODataUByte(chassis.id));
		byte[] weps = new byte[weapons.length];
		for (int i = 0; i < weapons.length; i++)
		{
			if (weapons[i] == null) weps[i] = (byte) -1;
			else weps[i] = (byte) weapons[i].id;
		}
		table.put("weapons", new IODataByteArr(weps));
		return table;
	}
	
	public static Sentinel readDTable(IODataTable table)
	{
		int chassis = IOData.expect(table.get("chassis"), IODataUByte.class).value;
		Sentinel sent = new Sentinel(Chassis.chassis[chassis]);
		byte[] weapons = IOData.expect(table.get("weapons"), IODataByteArr.class).value;
		if (weapons.length != sent.chassis.slots) throw new RuntimeException("bad weapon count");
		for (int i = 0; i < weapons.length; i++)
		{
			int idx = weapons[i] & 0xFF;
			if (idx != 255) sent.weapons[i] = Weapon.weapons[idx];
		}
		return sent;
	}
	
	public void writeConfig(JSONObject json)
	{
		json.putInt("chassis", chassis.id);
		JSONArray arr = new JSONArray();
		for (int i = 0; i < weapons.length; i++)
		{
			if (weapons[i] == null) arr.addInt(-1);
			else arr.addInt(weapons[i].id);
		}
		if (arr.size() != chassis.slots) throw new Error("internal");
		json.put("weapons", arr);
	}
	
	public static Sentinel readConfig(JSONObject json)
	{
		int idx = json.getInt("chassis");
		Chassis chassis = Chassis.chassis[idx];
		JSONArray arr = json.getArray("weapons");
		if (chassis.slots != arr.size()) throw new RuntimeException("bad length");
		Sentinel sent = new Sentinel(chassis);
		for (int i = 0; i < chassis.slots; i++)
		{
			int id = arr.getInt(i);
			if (id >= 0) sent.weapons[i] = Weapon.weapons[id];
		}
		return sent;
	}
}
