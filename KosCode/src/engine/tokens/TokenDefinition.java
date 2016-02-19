package engine.tokens;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class TokenDefinition
{
	final Vector<String> separators;
	final Vector<Boolean> sepMatters;
	final Map<Integer, Sequence> sequences;
	private int nextSeqId;
	
	public TokenDefinition()
	{
		separators = new Vector<>();
		sepMatters = new Vector<>();
		sequences = new HashMap<>();
	}
	
	public synchronized void addSeparator(String sep, boolean matters)
	{
		if (sep == null) throw new NullPointerException();
		separators.add(sep);
		sepMatters.add(matters);
	}
	
	public synchronized int createSequence()
	{
		int id = nextSeqId++;
		sequences.put(id, new Sequence());
		return id;
	}
	
	public synchronized void setEqualDelimeters(int id, boolean value)
	{
		Sequence s = sequences.get(id);
		if (s == null) throw new IllegalArgumentException("id");
		s.equalDelims = value;
	}
	
	public synchronized boolean removeSequence(int id)
	{
		return sequences.remove(id) != null;
	}
	
	public synchronized void addSequenceStart(int id, String sep, boolean matters)
	{
		Sequence s = sequences.get(id);
		if (s == null) throw new IllegalArgumentException("id");
		int idx = s.start.indexOf(sep);
		if (idx == -1)
		{
			s.start.add(sep);
			s.addStart.add(matters);
		}
		else s.addStart.set(idx, matters);
	}
	
	public synchronized void addSequenceEnd(int id, String sep, boolean matters)
	{
		Sequence s = sequences.get(id);
		if (s == null) throw new IllegalArgumentException("id");
		int idx = s.start.indexOf(sep);
		if (idx == -1)
		{
			s.end.add(sep);
			s.addEnd.add(matters);
		}
		else s.addEnd.set(idx, matters);
	}
}
