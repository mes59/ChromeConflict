package engine.app.audio.sampled;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.lwjgl.LWJGLException;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;

public class WaveLoader
{
	public static SampledAudio readWave(File file) throws IOException, UnsupportedAudioFileException
	{
		try
		{
			if (!AL.isCreated()) AL.create();
		}
		catch (LWJGLException e)
		{
			e.printStackTrace();
			return null;
		}
		AudioInputStream in = AudioSystem.getAudioInputStream(file);
		AudioFormat format = in.getFormat();
		int channels = 0, bits = format.getSampleSizeInBits();
		if (format.getChannels() == 1)
		{
			if (bits == 8) channels = AL10.AL_FORMAT_MONO8;
			else if (bits == 16) channels = AL10.AL_FORMAT_MONO16;
			else if (bits == 24) channels = AL10.AL_FORMAT_MONO16;
			else if (bits == 32) channels = AL10.AL_FORMAT_MONO16;
			else throw new RuntimeException("invalid bit rate: " + bits);
		}
		else if (format.getChannels() == 2)
		{
			if (bits == 8) channels = AL10.AL_FORMAT_STEREO8;
			else if (bits == 16) channels = AL10.AL_FORMAT_STEREO16;
			else if (bits == 24) channels = AL10.AL_FORMAT_STEREO16;
			else if (bits == 32) channels = AL10.AL_FORMAT_STEREO16;
			else throw new RuntimeException("invalid bit rate: " + bits);
		}
		if (channels == 0) throw new RuntimeException("invalid amount of channels: " + format.getChannels());
		int available = format.getChannels() * (int) in.getFrameLength() * bits / 8;
		byte[] buff = new byte[available];
		int read = 0, offset = 0;
		while (true)
		{
			read = in.read(buff, offset, buff.length - offset);
			if (read == -1) break;
			offset += read;
			if (offset == buff.length) break;
		}
		
		ByteBuffer src = ByteBuffer.wrap(buff);
		src.order(ByteOrder.LITTLE_ENDIAN);
		int len = buff.length;
		if (bits == 32) len = buff.length >> 1;
		if (bits == 24) len = (buff.length << 1) / 3;
		ByteBuffer data = ByteBuffer.allocateDirect(len);
		data.order(ByteOrder.nativeOrder());
		if (bits == 32)
		{
			while (src.hasRemaining())
			{
				data.putShort(src.getShort());
				src.position(src.position() + 2);
			}
		}
		else if (bits == 24)
		{
			while (src.hasRemaining())
			{
				data.putShort(src.getShort());
				src.position(src.position() + 1);
			}
		}
		else if (bits == 16)
		{
			while (src.hasRemaining())
			{
				data.putShort(src.getShort());
			}
		}
		else
		{
			while (src.hasRemaining())
			{
				data.put(src.get());
			}
		}
		data.rewind();
		
		int buffer = AL10.alGenBuffers();
		AL10.alBufferData(buffer, channels, data, (int) format.getSampleRate());
		int source = AL10.alGenSources();
		float length = in.getFrameLength() / format.getFrameRate();
		return new SampledAudio(source, buffer, length);
	}
}
