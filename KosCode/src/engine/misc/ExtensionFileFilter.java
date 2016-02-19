package engine.misc;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class ExtensionFileFilter extends FileFilter
{
	private String description;
	private boolean folders;
	private String[] extensions;
	
	public ExtensionFileFilter(String description, boolean folders, String... extensions)
	{
		if (description == null) throw new NullPointerException("description cannot be null");
		this.description = description;
		this.folders = folders;
		if (extensions == null) throw new NullPointerException("invalid extension list");
		if (extensions.length == 0) throw new NullPointerException("invalid extension list");
		int index = 0;
		for (int i = 0; i < extensions.length; i++)
		{
			String curr = extensions[i];
			if (curr == null) continue;
			extensions[index++] = curr.substring(curr.lastIndexOf('.') + 1);
		}
		if (index != extensions.length)
		{
			this.extensions = new String[index];
			System.arraycopy(extensions, 0, this.extensions, 0, index);
		}
		else this.extensions = extensions;
	}
	
	public boolean accept(File f)
	{
		if (folders && f.isDirectory()) return true;
		for (String extension : extensions)
		{
			if (f.getName().endsWith(extension)) return true;
		}
		return false;
	}
	
	public String getDescription()
	{
		return description;
	}
	
}
