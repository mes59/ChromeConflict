package dev;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;

import engine.math.Rect2;
import engine.math.vec.Vec2;
import main.ChromeConflict;
import world.SpawnRegion;
import world.WorldIO;
import world.field.FieldGravity;
import world.field.FieldWater;
import world.field.WorldField;

public class CCEclipse
{
	public static void main(String[] args)
	{
		System.out.print("compiling map 1... ");
		try
		{
			File file = new File("res/maps/testmap.iwm");
			BufferedImage[] layers = new BufferedImage[4];
			layers[0] = ImageIO.read(new File("res/maps/test_0.png"));
			layers[1] = ImageIO.read(new File("res/maps/test_1.png"));
			layers[2] = ImageIO.read(new File("res/maps/test_2.png"));
			WorldField[] fields = new WorldField[2];
			Rect2 bounds = new Rect2(710, 146, 495, 622);
			fields[0] = new FieldGravity(bounds, 0);
			bounds = new Rect2(0, 648, 300, 120);
			fields[1] = new FieldWater(bounds, 0.01);
			float[] bgc = {0.5f, 0.5f, 0.5f};
			WorldIO.create(file, 512, 240, null, bgc, layers, fields);
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.exit(2);
		}
		System.out.println("done");
		
		System.out.print("compiling map 2... ");
		try
		{
			File file = new File("res/maps/spaaace.iwm");
			BufferedImage[] layers = new BufferedImage[4];
			layers[0] = ImageIO.read(new File("res/maps/space_0.png"));
			layers[1] = ImageIO.read(new File("res/maps/space_1.png"));
			layers[2] = ImageIO.read(new File("res/maps/space_2.png"));
			layers[3] = ImageIO.read(new File("res/Space.png"));
			Vector<SpawnRegion> spawns = new Vector<>();
			spawns.add(new SpawnRegion(new Rect2(532, 677, 216, 39), new Vec2(0, 0), new Vec2(0, 0), 1));
			WorldIO.create(file, 0, 100, spawns, null, layers, new WorldField[0]);
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.exit(2);
		}
		System.out.println("done");
		ChromeConflict.main(args);
	}
}
