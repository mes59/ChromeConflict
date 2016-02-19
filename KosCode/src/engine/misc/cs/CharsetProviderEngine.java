package engine.misc.cs;

import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CharsetProviderEngine extends CharsetProvider
{
	private final List<Charset> charsets;
	
	public CharsetProviderEngine()
	{
		charsets = new ArrayList<>();
		charsets.add(CharsetCESU8.CESU8);
	}
	
	public Iterator<Charset> charsets()
	{
		return charsets.iterator();
	}
	
	public Charset charsetForName(String charsetName)
	{
		for (Charset charset : charsets)
		{
			if (charset == null) continue;
			if (charset.name().equals(charsetName)) return charset;
			for (String alias : charset.aliases())
			{
				if (alias == null) continue;
				if (alias.equals(charsetName)) return charset;
			}
		}
		return null;
	}
}
