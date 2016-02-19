package engine.app.audio.midi;

import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;

public class MidiUtils
{
	protected static MidiPlayer player;
	
	public static void init()
	{
		if (player == null)
		{
			try
			{
				player = new MidiPlayer();
			}
			catch (Exception e)
			{
				close();
				System.err.println("cannot initialize synthesizer");
			}
		}
	}
	
	public static void close()
	{
		if (player != null)
		{
			player.close();
			player = null;
		}
	}
	
	public static MidiSequence read(String path) throws IOException
	{
		try
		{
			File file = new File(path);
			String name = file.getName();
			name = name.substring(0, name.lastIndexOf('.'));
			Sequence seq = MidiSystem.getSequence(file);
			return new MidiSequence(seq, name);
		}
		catch (InvalidMidiDataException e)
		{
			throw new IOException(e);
		}
	}
}
