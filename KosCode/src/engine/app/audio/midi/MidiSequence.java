package engine.app.audio.midi;

import static engine.app.audio.midi.MidiUtils.*;

import javax.sound.midi.Sequence;

import engine.app.audio.Audio;

public class MidiSequence implements Audio
{
	protected Sequence sequence;
	protected String name;
	protected float speed;
	protected float volume;
	
	protected MidiSequence(Sequence sequence, String name)
	{
		this.sequence = sequence;
		this.name = name;
		speed = 1;
		volume = 100;
	}
	
	public void setSpeed(float speed)
	{
		this.speed = speed;
		if (player == null) return;
		if (player.s == this)
		{
			player.setSpeed(speed);
		}
	}
	
	public void setVolume(float volume)
	{
		this.volume = volume;
		System.err.println("cannot set volume for MIDI file");
	}
	
	public void setLooping(boolean loop)
	{
	}
	
	public void play()
	{
		if (player == null) return;
		try
		{
			player.play(this);
		}
		catch (Exception e)
		{
		}
	}
	
	public void pause()
	{
		if (player == null) return;
		if (player.s == this)
		{
			player.pause();
		}
	}
	
	public void stop()
	{
		if (player == null) return;
		if (player.s == this)
		{
			player.stop();
		}
	}
	
	public boolean isPlaying()
	{
		if (player == null) return false;
		if (player.s == this && player.isRunning()) return true;
		return false;
	}
	
	public String getName()
	{
		return name;
	}
	
	public float getLength()
	{
		return sequence.getMicrosecondLength() / 1000f;
	}
}
