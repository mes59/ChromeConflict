package engine.net.socket;

import java.io.IOException;
import java.io.InputStream;

public interface SocketDataReader
{
	/**
	 * tells the class to read more data from the stream
	 * @param in the stream, may differ from the last one
	 * @returns if it has read all data provided
	 */
	public void read(InputStream in) throws IOException;
	
	/**
	 * returns true if the reader would like to close the connection
	 * if someone said something bad, for example :(
	 * @returns if a close is requested
	 */
	public boolean finished();
}
