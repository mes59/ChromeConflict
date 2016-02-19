package engine.tokens;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import engine.tokens.Sequence.SeqMatch;

public class Tokenizer
{
	private TokenDefinition def;
	private Reader read;
	private char[] chars;
	
	private StringBuffer out;
	private SeqMatch match;
	private int matchmode;
	
	public Tokenizer(TokenDefinition def)
	{
		this(def, 1024);
	}
	
	public Tokenizer(TokenDefinition def, int buffsize)
	{
		this.def = def;
		chars = new char[buffsize];
		out = new StringBuffer();
	}
	
	public synchronized void setInput(Reader read)
	{
		if (read == null) throw new NullPointerException();
		this.read = read;
	}
	
	public synchronized void setInput(String data)
	{
		if (data == null) throw new NullPointerException();
		read = new StringReader(data);
	}
	
	public TokenResult nextToken() throws IOException
	{
		if (matchmode == 1)
		{
			String str = out.substring(0, match.dlen);
			out.delete(0, match.dlen);
			if (!match.emat)
			{
				match = null;
				matchmode = 0;
			}
			else matchmode = 2;
			return new TokenResult(TokenResult.TYPE_SEQUENCE, str);
		}
		else if (matchmode == 2)
		{
			String str = out.substring(0, match.elen);
			out.delete(0, match.elen);
			match = null;
			matchmode = 0;
			return new TokenResult(TokenResult.TYPE_SEQ_END, str);
		}
		
		if (out.length() < chars.length)
		{
			if (moreChars() && out.length() == 0) return null;
		}
		while (true)
		{
			synchronized (def)
			{
				int pos = Integer.MAX_VALUE, sep = -1, seq = -1;
				for (int i = 0; i < def.separators.size(); i++)
				{
					int idx = out.indexOf(def.separators.get(i));
					if (idx == 0)
					{
						String str = def.separators.get(i);
						out.delete(0, str.length());
						if (!def.sepMatters.get(i))
						{
							pos = -1;
							break;
						}
						return new TokenResult(TokenResult.TYPE_SEPARATOR, str);
					}
					if (idx != -1 && idx < pos)
					{
						pos = idx;
						sep = i;
					}
				}
				if (pos == -1) continue;
				for (int i = 0; i < def.sequences.size(); i++)
				{
					int idx = def.sequences.get(i).find(out);
					if (idx == 0)
					{
						match = def.sequences.get(i).create(out);
						if (match.smat)
						{
							matchmode = 1;
							String str = out.substring(0, match.slen);
							out.delete(0, match.slen);
							return new TokenResult(TokenResult.TYPE_SEQ_START, str);
						}
						else
						{
							int end = match.slen + match.dlen;
							String str = out.substring(match.slen, end);
							out.delete(match.slen, end);
							if (!match.emat)
							{
								match = null;
								matchmode = 0;
							}
							else matchmode = 2;
							return new TokenResult(TokenResult.TYPE_SEQUENCE, str);
						}
					}
					if (idx != -1 && idx < pos)
					{
						pos = idx;
						sep = -1;
						seq = i;
					}
				}
				
				if (sep == -1 && seq == -1)
				{
					if (moreChars())
					{
						if (out.length() > 0)
						{
							String str = out.toString();
							out.delete(0, str.length());
							return new TokenResult(TokenResult.TYPE_STRING, str);
						}
						else return null;
					}
					else continue;
				}
				else
				{
					String str = out.substring(0, pos);
					out.delete(0, pos);
					return new TokenResult(TokenResult.TYPE_STRING, str);
				}
			}
		}
	}
	
	private boolean moreChars() throws IOException
	{
		int cnt = read.read(chars);
		if (cnt == -1) return true;
		out.append(chars, 0, cnt);
		return false;
	}
}
