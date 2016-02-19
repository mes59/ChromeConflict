package engine.tokens;

import java.util.Vector;

import engine.util.Utils;

final class Sequence
{
	boolean equalDelims;
	final Vector<String> start;
	final Vector<Boolean> addStart;
	final Vector<String> end;
	final Vector<Boolean> addEnd;
	
	Sequence()
	{
		start = new Vector<>();
		addStart = new Vector<>();
		end = new Vector<>();
		addEnd = new Vector<>();
	}
	
	int find(StringBuffer buff)
	{
		int pos = -1, idx;
		for (String s : start)
		{
			idx = buff.indexOf(s);
			if (idx != -1)
			{
				if (pos == -1 || idx < pos) pos = idx;
				if (pos == 0) return 0;
			}
		}
		return pos;
	}
	
	SeqMatch create(StringBuffer buff)
	{
		int idx = -1;
		mloop: for (int n = 0; n < start.size(); n++)
		{
			String str = start.get(n);
			if (buff.length() < str.length()) continue;
			for (int i = 0; i < str.length(); i++)
			{
				if (buff.charAt(i) != str.charAt(i)) continue mloop;
			}
			idx = n;
		}
		if (idx == -1) throw new IllegalStateException("bad position");
		String sdelim = start.get(idx);
		for (int i = sdelim.length(); i < buff.length(); i++)
		{
			char c = buff.charAt(i);
			if (c == '\\')
			{
				c = buff.charAt(i++);
				if (c == 'u') i += 4;
				continue;
			}
			
			if (equalDelims)
			{
				if (buff.length() - i < sdelim.length()) return null;
				if (Utils.matches(sdelim, 0, buff, i, sdelim.length()))
				{
					int len = sdelim.length(), dlen = i - len;
					return new SeqMatch(len, addStart.get(idx), dlen, len, addStart.get(idx));
				}
			}
			else
			{
				boolean possible = false;
				for (int j = 0; j < end.size(); j++)
				{
					String str = end.get(j);
					if (buff.length() - i >= str.length())
					{
						possible = true;
						if (Utils.matches(str, 0, buff, i, str.length()))
						{
							int slen = sdelim.length(), dlen = i - slen, elen = str.length();
							return new SeqMatch(slen, addStart.get(idx), dlen, elen, addEnd.get(j));
						}
					}
				}
				if (!possible) return null;
			}
		}
		return null;
	}
	
	final static class SeqMatch
	{
		public final int slen;
		public final boolean smat;
		public final int dlen;
		public final int elen;
		public final boolean emat;
		
		private SeqMatch(int slen, boolean smat, int dlen, int elen, boolean emat)
		{
			this.slen = slen;
			this.smat = smat;
			this.dlen = dlen;
			this.elen = elen;
			this.emat = emat;
		}
	}
}
