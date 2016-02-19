package engine.net.socket;

import java.io.IOException;
import java.io.OutputStream;

public interface SocketDataWriter
{
	/**
	 * returns if the writer currently has data and the write method should be called
	 * @returns if the write method should be called
	 */
	public boolean hasData();
	
	/**
	 * allows the writer to write data to the socket output
	 * implementations should be prepared for unexpected invocation of this method
	 * @param out the socket output stream
	 */
	public void write(OutputStream out) throws IOException;
	
	/**
	 * returns true if the writer would like to close the connection
	 * @returns if a close is requested
	 */
	public boolean finished();
}
