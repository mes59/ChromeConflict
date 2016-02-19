package engine.app.audio.sampled;

import org.lwjgl.openal.AL10;

import engine.app.audio.Audio;

public class SampledAudio implements Audio
{
	private int source;
	private int buffer;
	private float length;
	
	protected SampledAudio(int source, int buffer, float length)
	{
		this.source = source;
		this.length = length;
		AL10.alSourcei(source, AL10.AL_BUFFER, buffer);
		AL10.alSourcef(source, AL10.AL_PITCH, 1);
		AL10.alSourcef(source, AL10.AL_GAIN, 1);
	}
	
	public void setSpeed(float speed)
	{
		AL10.alSourcef(source, AL10.AL_PITCH, speed);
	}
	
	public void setVolume(float volume)
	{
		AL10.alSourcef(source, AL10.AL_GAIN, volume);
	}
	
	public void setLooping(boolean loop)
	{
		if (loop) AL10.alSourcei(source, AL10.AL_LOOPING, AL10.AL_TRUE);
		else AL10.alSourcei(source, AL10.AL_LOOPING, AL10.AL_FALSE);
	}
	
	public void play()
	{
		AL10.alSourcePlay(source);
	}
	
	public void pause()
	{
		AL10.alSourcePause(source);
	}
	
	public void stop()
	{
		AL10.alSourceStop(source);
	}
	
	public boolean isPlaying()
	{
		return AL10.alGetSourcei(source, AL10.AL_SOURCE_STATE) == AL10.AL_PLAYING;
	}
	
	public float getLength()
	{
		return length;
	}
	
	public int getSrcBuffer()
	{
		return source;
	}
	
	public int getDataBuffer()
	{
		return buffer;
	}
	
	public void dispose()
	{
		AL10.alSourceStop(source);
		AL10.alDeleteSources(source);
		AL10.alDeleteBuffers(buffer);
	}
}
