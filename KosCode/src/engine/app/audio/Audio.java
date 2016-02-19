package engine.app.audio;

public interface Audio
{
	public void setSpeed(float speed);
	
	public void setVolume(float volume);
	
	public void setLooping(boolean loop);
	
	public void play();
	
	public void pause();
	
	public void stop();
	
	public boolean isPlaying();
	
	public float getLength();
}
