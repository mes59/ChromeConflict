package engine.app.graphics.g3d;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import engine.math.vec.Vec3;
import engine.math.vec.Vec4;

public class OBJReader
{
	public static OBJModel read(String path) throws IOException
	{
		FileInputStream stream = new FileInputStream(path);
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		OBJModel model = new OBJModel();
		
		while (true)
		{
			String line = in.readLine();
			if (line == null) break;
			line = line.replaceAll("\r", "");
			
			if (line.startsWith("v "))
			{
				line = line.substring(2);
				StringTokenizer tokens = new StringTokenizer(line);
				float[] data = new float[4];
				int count = tokens.countTokens();
				
				for (int i = 0; i < count; i++)
				{
					data[i] = Float.parseFloat(tokens.nextToken());
				}
				if (count < 4)
				{
					data[3] = 1;
				}
				model.vertices.add(new Vec4(data[0], data[1], data[2], data[3]));
			}
			else if (line.startsWith("vt "))
			{
				line = line.substring(3);
				StringTokenizer tokens = new StringTokenizer(line);
				float[] data = new float[3];
				int count = tokens.countTokens();
				
				for (int i = 0; i < count; i++)
				{
					data[i] = Float.parseFloat(tokens.nextToken());
				}
				if (count < 3)
				{
					data[2] = 0;
				}
				model.texcrds.add(new Vec3(data[0], data[1], data[2]));
			}
			else if (line.startsWith("vn "))
			{
				line = line.substring(3);
				StringTokenizer tokens = new StringTokenizer(line);
				float[] data = new float[3];
				int count = tokens.countTokens();
				
				for (int i = 0; i < count; i++)
				{
					data[i] = Float.parseFloat(tokens.nextToken());
				}
				model.normals.add(new Vec3(data[0], data[1], data[2]));
			}
			else if (line.startsWith("f "))
			{
				line = line.substring(2);
				String[] tokens = split(line, " ");
				
				ArrayList<Integer> vertices = new ArrayList<>();
				ArrayList<Integer> texcrds = new ArrayList<>();
				ArrayList<Integer> normals = new ArrayList<>();
				
				for (String token : tokens)
				{
					String[] items = split(token, "/");
					if (items.length == 1)
					{
						vertices.add(Integer.parseInt(token));
					}
					else if (items.length == 3)
					{
						vertices.add(Integer.parseInt(items[0]));
						texcrds.add(Integer.parseInt(items[1]));
						normals.add(Integer.parseInt(items[2]));
					}
					else
					{
						if (token.indexOf("//") == -1)
						{
							vertices.add(Integer.parseInt(items[0]));
							texcrds.add(Integer.parseInt(items[1]));
						}
						else
						{
							vertices.add(Integer.parseInt(items[0]));
							normals.add(Integer.parseInt(items[1]));
						}
					}
				}
				
				int[] verts = vertices.size() == 0 ? null : toArray(vertices);
				int[] tcrds = texcrds.size() == 0 ? null : toArray(texcrds);
				int[] norms = normals.size() == 0 ? null : toArray(normals);
				model.add(new OBJFace(model, verts, tcrds, norms));
			}
		}
		in.close();
		return model;
	}
	
	private static int[] toArray(ArrayList<Integer> list)
	{
		int[] arr = new int[list.size()];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = list.get(i);
		}
		return arr;
	}
	
	private static String[] split(String str, String delim)
	{
		StringTokenizer tokens = new StringTokenizer(str, delim);
		String[] arr = new String[tokens.countTokens()];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = tokens.nextToken();
		}
		return arr;
	}
}
