package engine.app.audio.midi;

import java.util.ArrayList;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class MidiPlayer
{
	protected static ArrayList<MidiPlayer> registry = new ArrayList<>();
	
	protected MidiSequence s;
	private Sequencer seq;
	
	public MidiPlayer() throws MidiUnavailableException
	{
		seq = MidiSystem.getSequencer();
		seq.open();
		registry.add(this);
	}
	
	public void close()
	{
		seq.close();
		seq = null;
		registry.remove(this);
	}
	
	public Sequence getSequence()
	{
		return seq.getSequence();
	}
	
	public boolean isRunning()
	{
		return seq.isRunning();
	}
	
	public void play(MidiSequence sequence) throws InvalidMidiDataException
	{
		seq.setSequence(sequence.sequence);
		setSpeed(sequence.speed);
		seq.start();
	}
	
	public void pause()
	{
		seq.stop();
	}
	
	public void stop()
	{
		try
		{
			seq.stop();
			seq.setSequence((Sequence) null);
		}
		catch (InvalidMidiDataException e)
		{
		}
	}
	
	public void setSpeed(float speed)
	{
		seq.setTempoFactor(speed);
	}
}
