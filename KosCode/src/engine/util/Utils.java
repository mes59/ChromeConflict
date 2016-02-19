package engine.util;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.nio.file.Paths;
import java.security.CodeSource;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;

import javax.swing.JFrame;

public class Utils
{
	private static Charset charset = Charset.forName("UTF-8");
	public static final Dimension DESKTOP_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
	
	private static volatile byte[] buffer;
	
	/**
	 * gets the buffer and ensures that<br>
	 * it is not null and has a minimum size
	 * @param minSize minimal buffer size
	 * @return the buffer (also sets the field)
	 */
	private static byte[] getBuffer(int minSize)
	{
		if (buffer == null) return buffer = new byte[minSize];
		if (buffer.length < minSize) return buffer = new byte[minSize];
		return buffer;
	}
	
	/**
	 * invokes the Thread.sleep method and discards any exceptions
	 * @param delay delay in ms
	 */
	public static void sleep(long delay)
	{
		try
		{
			Thread.sleep(delay);
		}
		catch (Exception e)
		{
		}
	}
	
	/**
	 * changes a field in a class by using reflection
	 * @param c the class (can be null for objects)
	 * @param inst the instance, null for static context
	 * @param name the name of the field to edit
	 * @param value the new value of the field
	 */
	public static void setField(Class<?> c, Object inst, String name, Object value)
	{
		if (c == null) c = inst.getClass();
		try
		{
			Field field = null;
			while (field == null)
			{
				try
				{
					field = c.getDeclaredField(name);
				}
				catch (NoSuchFieldException e)
				{
					c = c.getSuperclass();
					if (c == null) throw new NoSuchFieldException(name);
				}
			}
			field.setAccessible(true);
			field.set(inst, value);
		}
		catch (Exception e)
		{
		}
	}
	
	/**
	 * same as setField but this one gets the value of the field
	 * @param c the class (can be null for objects)
	 * @param inst the instance, null for static context
	 * @param name the name of the field to get
	 * @return the current value of the field
	 */
	public static Object getField(Class<?> c, Object inst, String name)
	{
		if (c == null) c = inst.getClass();
		try
		{
			Field field = null;
			while (field == null)
			{
				try
				{
					field = c.getDeclaredField(name);
				}
				catch (NoSuchFieldException e)
				{
					c = c.getSuperclass();
					if (c == null) throw new NoSuchFieldException(name);
				}
			}
			field.setAccessible(true);
			return field.get(inst);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * same as setField but this one gets the value of the field
	 * @param c the class (can be null for objects)
	 * @param inst the instance, null for static context
	 * @param name the name of the field to get
	 * @param access true if the method should be made accessible
	 * @return the reflective field instance
	 */
	public static Field getFieldInstance(Class<?> c, Object inst, String name, boolean access)
	{
		if (c == null) c = inst.getClass();
		try
		{
			Field field = null;
			while (field == null)
			{
				try
				{
					field = c.getDeclaredField(name);
				}
				catch (NoSuchFieldException e)
				{
					c = c.getSuperclass();
					if (c == null) throw new NoSuchFieldException(name);
				}
			}
			if (access) field.setAccessible(true);
			return field;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * get and call a method from an instance or class<br>
	 * will return the return value or an InvocationTargetException
	 * @param c the class (can be null for objects)
	 * @param inst the instance, null for static context
	 * @param name the name of the method
	 * @param types the types required for the method
	 * @param args the required arguments (are not checked)
	 * @return the return value or an InvocationTargetException
	 */
	public static Object callMethod(Class<?> c, Object inst, String name, Class<?>[] types, Object[] args)
	{
		if (c == null) c = inst.getClass();
		try
		{
			Method method = null;
			while (method == null)
			{
				try
				{
					method = c.getDeclaredMethod(name, types);
				}
				catch (NoSuchMethodException e)
				{
					c = c.getSuperclass();
					if (c == null) throw new NoSuchMethodException(name);
				}
			}
			method.setAccessible(true);
			return method.invoke(inst, args);
		}
		catch (InvocationTargetException e)
		{
			return e;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * same as callMethod, but only returns a reference
	 * @param c the class (can be null for objects)
	 * @param inst the instance, null for static context
	 * @param name the name of the method
	 * @param types the types required for the method
	 * @param access true if the method should be made accessible
	 * @return a reflective instance of the requested method, or null if it does not exist
	 */
	public static Object getMethodInstace(Class<?> c, Object inst, String name, Class<?>[] types, boolean access)
	{
		if (c == null) c = inst.getClass();
		try
		{
			Method method = null;
			while (method == null)
			{
				try
				{
					method = c.getDeclaredMethod(name, types);
				}
				catch (NoSuchMethodException e)
				{
					c = c.getSuperclass();
					if (c == null) throw new NoSuchMethodException(name);
				}
			}
			if (access) method.setAccessible(true);
			return method;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * adds all objects to the array in correct order
	 * @param arr the array to append to
	 * @param items the keys to add to arr
	 * @return the new array
	 */
	public static Object append(Object arr, Object... items)
	{
		int len1 = Array.getLength(arr);
		int len2 = Array.getLength(items);
		Object array = Array.newInstance(arr.getClass().getComponentType(), len1 + len2);
		for (int i = 0; i < len1; i++)
		{
			Array.set(array, i, Array.get(arr, i));
		}
		for (int i = 0; i < len2; i++)
		{
			Array.set(array, i + len1, Array.get(items, i));
		}
		return array;
	}
	
	/**
	 * sets the specified element in the array to a new value
	 * @param arr the array to edit
	 * @param item the new value
	 * @param pos the index, can be >= arr.length or < 0
	 * @return an array, will be a new instance if pos < 0
	 */
	public static Object set(Object arr, Object item, int pos)
	{
		int len = Array.getLength(arr);
		if (pos < 0) arr = subArray(arr, pos, len);
		Array.set(arr, pos, item);
		return arr;
	}
	
	/**
	 * securely gets the element in an array
	 * @param arr the array to use
	 * @param pos the index, can be >= arr.length
	 * @return the element or null if the index is too high
	 */
	public static Object get(Object arr, int pos)
	{
		int len = Array.getLength(arr);
		if (pos < len)
		{
			return Array.get(arr, pos);
		}
		return null;
	}
	
	/**
	 * checks if the array contains a specific key
	 * @param arr the array to check
	 * @param item the key to search for
	 * @return the index or -1 if the element does not exist
	 */
	public static int contains(Object arr, Object item)
	{
		int len = Array.getLength(arr);
		for (int i = 0; i < len; i++)
		{
			if (item.equals(Array.get(arr, i))) return i;
		}
		return -1;
	}
	
	/**
	 * constructs a new array with length max - min (like String.substring) use with min = 0 and max = arr.length to make a "copy"
	 * @param arr the array to resize
	 * @param min beginning index, can be < 0
	 * @param max the end index, can be > arr.length
	 * @return the new array
	 */
	public static Object subArray(Object arr, int min, int max)
	{
		if (max <= min) throw new IllegalArgumentException("invalid bounds");
		Object array = Array.newInstance(arr.getClass().getComponentType(), max - min);
		int len = Array.getLength(arr);
		int srcmin = min <= 0 ? 0 : -min;
		int dstmin = min >= 0 ? 0 : -min;
		int dstlen = max - srcmin;
		if (dstlen > len - srcmin) dstlen = len;
		System.arraycopy(arr, srcmin, array, dstmin, dstlen);
		return array;
	}
	
	/**
	 * converts the array into a useful string
	 * @param arr the array to convert
	 * @param sep the separator to put between elements, will be ", " if null
	 * @return the converted string
	 */
	public static String toString(Object arr, String sep)
	{
		if (sep == null) sep = ", ";
		String str = "";
		int len = Array.getLength(arr);
		Object item;
		for (int i = 0; i < len; i++)
		{
			item = Array.get(arr, i);
			if (item == null) str += "null";
			else str += item.toString();
			if (i < len - 1)
			{
				str += sep;
			}
		}
		return str;
	}
	
	/**
	 * sets the current charset by name<br>
	 * throwy any exception Charset.forName(String) would throw
	 * @param name name of the charset
	 * @throws  IllegalCharsetNameException
	 *          If the given charset name is illegal
	 * @throws  IllegalArgumentException
	 *          If the given <tt>charsetName</tt> is null
	 * @throws  UnsupportedCharsetException
	 *          If no support for the named charset is available
	 *          in this instance of the Java virtual machine
	 */
	public static void setCharset(String name)
	{
		if (name == null) throw new NullPointerException();
		charset = Charset.forName(name);
	}
	
	/**
	 * sets the current charset by instance
	 * @param charset the new charset
	 */
	public static void setCharset(Charset charset)
	{
		if (charset == null) throw new NullPointerException();
		Utils.charset = charset;
	}
	
	/**
	 * returns the current charset for string / byte converseion
	 * @return current charset
	 */
	public static Charset getCharset()
	{
		return charset;
	}
	
	/**
	 * converts a string into bytes using the current charset
	 * @param str input string
	 * @return str encoded with the current charset
	 */
	public static byte[] getBytes(String str)
	{
		return str.getBytes(charset);
	}
	
	/**
	 * converts a string to bytes and catches any exceptions
	 * @param str input string
	 * @return a byte array or null if an exception occurred
	 */
	public static byte[] getBytes(String str, String encoding)
	{
		try
		{
			return str.getBytes(encoding);
		}
		catch (Exception e)
		{
			return null;
		}
	}
	
	/**
	 * converts bytes into a string using the current charset
	 * @param bytes input bytes
	 * @return bytes decoded with the current charset
	 */
	public static String getString(byte[] bytes)
	{
		return new String(bytes, charset);
	}
	
	/**
	 * converts bytes into a string and catches any exceptions
	 * @param bytes input byte array
	 * @param encoding name of the character encoding to use
	 * @return a string or null if an exception occurred
	 */
	public static String getString(byte[] bytes, String encoding)
	{
		try
		{
			return new String(bytes, encoding);
		}
		catch (Exception e)
		{
			return null;
		}
	}
	
	/**
	 * checks if value is between min and max, exclusive. automatically swaps min and max if needed
	 * @param value the value to check
	 * @param min the minimal possible value
	 * @param max the maximal possible value
	 * @return if value is between min and max
	 */
	public static boolean inrange(double value, double min, double max)
	{
		if (max < min)
		{
			double t = min;
			min = max;
			max = t;
		}
		return value < max && value > min;
	}
	
	/**
	 * checks if value is between min and max, inclusive. automatically swaps min and max if needed
	 * @param value the value to check
	 * @param min the minimal possible value
	 * @param max the maximal possible value
	 * @return if value is between or equal to min and max
	 */
	public static boolean inrange2(double value, double min, double max)
	{
		if (max < min)
		{
			double t = min;
			min = max;
			max = t;
		}
		return value <= max && value >= min;
	}
	
	/**
	 * changes the value to include the binary value of another
	 * @param mask the value to edit
	 * @param flag the binary flag to set
	 * @param value true to add, false to remove
	 * @return the new mask
	 */
	public static int setFlag(int mask, int flag, boolean value)
	{
		if (value)
		{
			mask = mask | flag;
		}
		else
		{
			mask = ~(~mask & flag);
		}
		return mask;
	}
	
	/**
	 * checks if a bitmask contains a specific value
	 * @param mask the mask to check
	 * @param the flag to check for
	 * @return if the mask contains that flag
	 */
	public static boolean getFlag(int mask, int flag)
	{
		return (mask & flag) == flag;
	}
	
	/**
	 * converts a byte array to gzip format
	 * @param arr the bytes to convert
	 * @return the new (gzipped) array
	 */
	public static byte[] toGZIP(byte[] arr) throws IOException
	{
		try
		{
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			GZIPOutputStream gzip = new GZIPOutputStream(stream);
			gzip.write(arr);
			gzip.close();
			return stream.toByteArray();
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			return null;
		}
	}
	
	/**
	 * converts a gzipped byte array to its original form
	 * @param arr the gzipped array to convert
	 * @param buffsize the size of the transfer buffer
	 * @return the original byte array
	 */
	public static byte[] unGZIP(byte[] arr, int buffsize)
	{
		try
		{
			GZIPInputStream in = new GZIPInputStream(new ByteArrayInputStream(arr));
			ByteArrayOutputStream out = new ByteArrayOutputStream(buffsize);
			IOUtils.transfer(in, out, buffsize);
			return out.toByteArray();
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			return null;
		}
	}
	
	/**
	 * compresses the given byte array
	 * @param arr decopressed data
	 * @return compressed data
	 * */
	public static byte[] deflate(Deflater def, byte[] bytes, int buffsize) throws IOException
	{
		def.reset();
		def.setInput(bytes);
		def.finish();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] buffer = getBuffer(buffsize);
		synchronized (buffer)
		{
			while (true)
			{
				int read = def.deflate(buffer);
				if (read == 0) throw new IOException("requires more input");
				out.write(buffer, 0, read);
				if (def.finished()) return out.toByteArray();
			}
		}
	}
	
	/**
	 * decompresses the given byte array
	 * @param arr copressed data
	 * @return decompressed data
	 * */
	public static byte[] inflate(Inflater inf, byte[] bytes, int buffsize) throws IOException
	{
		inf.reset();
		inf.setInput(bytes);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] buffer = getBuffer(buffsize);
		synchronized (buffer)
		{
			while (true)
			{
				try
				{
					int read = inf.inflate(buffer);
					if (read == 0) throw new IOException("requires more input");
					out.write(buffer, 0, read);
				}
				catch (DataFormatException e)
				{
					throw new IOException("invalid input format", e);
				}
				if (inf.finished()) return out.toByteArray();
			}
		}
	}
	
	/**
	 * calculates the crc32 of all byte arrays
	 * @param data 0 or more arrays for the crc
	 * @return the crc as a long (0x00000000XXXXXXXX)
	 */
	public static long crcBytes(byte[]... data)
	{
		CRC32 crc = new CRC32();
		for (int i = 0; i < data.length; i++)
		{
			crc.update(data[i]);
		}
		return crc.getValue();
	}
	
	/**
	 * calculates the the specified file
	 * @param file file input
	 * @param buffsize transfer buffer size
	 * @return the crc as a long (0x00000000XXXXXXXX)
	 */
	public static long crcFile(File file, int buffsize) throws IOException
	{
		CRC32 crc = new CRC32();
		FileInputStream in = new FileInputStream(file);
		byte[] buffer = getBuffer(buffsize);
		synchronized (buffer)
		{
			while (true)
			{
				int read = in.read(buffer);
				if (read == -1)
				{
					in.close();
					return crc.getValue();
				}
				crc.update(buffer, 0, read);
			}
		}
	}
	
	/**
	 * digests all byte arrays via the method provided
	 * @param type desired digest method
	 * @param data 0 or more arrays to digest
	 * @return the output of the digest operation
	 */
	public static byte[] digestBytes(String type, byte[]... data) throws NoSuchAlgorithmException
	{
		MessageDigest md = MessageDigest.getInstance(type);
		for (int i = 0; i < data.length; i++)
		{
			md.update(data[i]);
		}
		return md.digest();
	}
	
	/**
	 * digests a file
	 * @param type digest type
	 * @param file file input
	 * @param buffsize transfer buffer size
	 * @return the checksum of the file
	 */
	public static byte[] digestFile(String type, File file, int buffsize) throws NoSuchAlgorithmException, IOException
	{
		MessageDigest digest = MessageDigest.getInstance(type);
		FileInputStream in = new FileInputStream(file);
		byte[] buffer = getBuffer(buffsize);
		synchronized (buffer)
		{
			while (true)
			{
				int read = in.read(buffer);
				if (read == -1)
				{
					in.close();
					return digest.digest();
				}
				digest.update(buffer, 0, read);
			}
		}
	}
	
	/** converts a byte array into a string
	 * @param data input array (eg from a MD5)
	 * @param radix radix to convert to
	 * @return big-endian string of data
	 */
	public String bytesToString(byte[] data, int radix)
	{
		BigInteger i = new BigInteger(data);
		return i.toString(radix);
	}
	
	/**
	 * generates a random output based on a chance
	 * @param chance chance for a true result (between 0 and 1, automatically clamped)
	 */
	public static boolean randomChance(double chance)
	{
		return Math.random() < chance;
	}
	
	/**
	 * returns the size of the desktop
	 * same as Toolkit.getDefaultToolkit().getScreenSize()
	 */
	public static Dimension getScreenSize()
	{
		return DESKTOP_SIZE;
	}
	
	/**
	 * loops a character count times
	 * @param char character to loop
	 * @param count number of repeats
	 * @return char * count
	 */
	public static String mulChar(char c, int count)
	{
		char[] result = new char[count];
		Arrays.fill(result, c);
		return new String(result);
	}
	
	/**
	 * loops a string count times
	 * @param str string to loop
	 * @param count number of repeats
	 * @return str * count
	 */
	public static String mulString(String str, int count)
	{
		char[] chars = str.toCharArray();
		char[] result = new char[chars.length * count];
		for (int i = 0; i < result.length; i += chars.length)
		{
			System.arraycopy(chars, 0, result, i, chars.length);
		}
		return new String(result);
	}
	
	/**
	 * creates a window with dimensions as component space
	 * @param title the title of the window
	 * @param width width of the component space
	 * @param height height of the component space
	 * @param autoclose if true the default close operation will be set to exit
	 */
	public static JFrame createCenteredJFrame(String title, int width, int height, boolean autoclose)
	{
		JFrame frame = new JFrame(title);
		if (autoclose) frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width + 16, height + 38);
		frame.setLocation((DESKTOP_SIZE.width - width + 16) / 2, (DESKTOP_SIZE.height - height + 38) / 2);
		return frame;
	}
	
	/**
	 * locates the source a class came from<br>
	 * should only be used with local classes
	 * @param cls the class to locate
	 * @return where cls came from
	 */
	public static File getLocation(Class<?> cls)
	{
		try
		{
			CodeSource src = cls.getProtectionDomain().getCodeSource();
			return Paths.get(src.getLocation().toURI()).toFile();
		}
		catch (SecurityException e)
		{
			throw e;
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	private static final char[] HEXCHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	
	/**
	 * returns the hex character from the array
	 * @param value a value between 0 and 15 (inclusive)
	 * @return the corresponding HEX value
	 */
	public static char getHexChar(int value)
	{
		return HEXCHARS[value & 0xF];
	}
	
	/**
	 * returns the value of this hex character
	 * @param ch a digit or a-f or A-F
	 * @return the value of that HEX digit
	 */
	public static int getHexValue(char ch)
	{
		if (ch >= '0' && ch <= '9') return ch - '0';
		if (ch >= 'A' && ch <= 'F') return ch - 'A' + 10;
		if (ch >= 'a' && ch <= 'f') return ch - 'a' + 10;
		throw new IllegalArgumentException("not a HEX digit");
	}
	
	private static int internalHexValue(char ch)
	{
		if (ch >= '0' && ch <= '9') return ch - '0';
		if (ch >= 'A' && ch <= 'F') return ch - 'A' + 10;
		if (ch >= 'a' && ch <= 'f') return ch - 'a' + 10;
		return Character.isWhitespace(ch) ? -1 : -2;
	}
	
	/**
	 * converts a string into a byte array using the radix 16
	 * @param hex hex string, its length must be a power of 2
	 * @return returns a byte array half as long as the string with the decoded value
	 */
	public static byte[] getHexBytes(String hex)
	{
		return getHexBytes(hex, 0);
	}
	
	/**
	 * converts a string into a byte array using the radix 16
	 * @param hex hex string, its length must be a power of 2
	 * @param mode determines how precies the array must be, 0 means only hex,
	 * 1 means spaces are allowed, 2 means ignore all but hex characters
	 * @return returns a byte array half as long as the string with the decoded value
	 */
	public static byte[] getHexBytes(String hex, int mode)
	{
		if (mode < 0 || mode > 2) throw new IllegalArgumentException("invalid mode");
		if (mode == 0 && hex.length() % 2 != 0) throw new IllegalArgumentException("bad hex");
		byte[] data = new byte[hex.length() >> 1];
		for (int i = 0, pos = 0; true; i++)
		{
			int x1 = -1, x2 = -1;
			while (x1 < 0)
			{
				if (pos >= hex.length())
				{
					if (i < data.length) data = Arrays.copyOf(data, i);
					return data;
				}
				x1 = internalHexValue(hex.charAt(pos++));
				if (-x1 > mode) throw new IllegalArgumentException("bad character");
			}
			while (x2 < 0)
			{
				if (pos >= hex.length()) throw new IllegalArgumentException("unfinished byte");
				x2 = internalHexValue(hex.charAt(pos++));
				if (-x2 > mode) throw new IllegalArgumentException("bad character");
			}
			data[i] = (byte) (x1 << 4 | x2);
		}
	}
	
	/**
	 * converts all bytes into a hex string of length bytes.length * 2
	 * @param bytes input bytes
	 * @return a hex representation of bytes
	 */
	public static String toHexString(byte[] bytes)
	{
		return toHexString(bytes, 0, bytes.length, 0);
	}
	
	/**
	 * converts all bytes into a hex string of length bytes.length * 2
	 * @param bytes input bytes
	 * @return a hex representation of bytes
	 */
	public static String toHexString(byte[] bytes, int off, int len)
	{
		return toHexString(bytes, off, len, 0);
	}
	
	/**
	 * converts all bytes into a hex string of length bytes.length * 2
	 * @param bytes input bytes
	 * @param space when to set spaces (byte 1) and when to add newlines (byte 2)
	 * @return a hex representation of bytes
	 */
	public static String toHexString(byte[] bytes, int space)
	{
		return toHexString(bytes, 0, bytes.length, space);
	}
	
	/**
	 * converts all bytes into a hex string of length bytes.length * 2
	 * @param bytes input bytes
	 * @param space when to set spaces (byte 1) and when to add newlines (byte 2)
	 * @return a hex representation of bytes
	 */
	public static String toHexString(byte[] bytes, int off, int len, int space)
	{
		if (bytes.length == 0) return "";
		String LS = System.lineSeparator();
		int s = space & 0xFF, nl = space >> 8 & 0xFF;
		int pos = 0, clen = bytes.length * 2;
		if (s > 0) clen += (bytes.length - 1) / s;
		if (nl > 0) clen += (bytes.length - 1) / nl * LS.length();
		char[] chars = new char[clen];
		for (int i = 0; i < len; i++)
		{
			chars[pos++] = HEXCHARS[bytes[off + i] >> 4 & 0xF];
			chars[pos++] = HEXCHARS[bytes[off + i] & 0xF];
			if (i + 1 < len)
			{
				if (s > 0 && i % s == s - 1)
				{
					if (nl > 0 && i % nl == nl - 1)
					{
						LS.getChars(0, LS.length(), chars, pos);
						pos += LS.length();
					}
					else chars[pos++] = ' ';
				}
				else if (nl > 0 && i % nl == nl - 1)
				{
					LS.getChars(0, LS.length(), chars, pos);
					pos += LS.length();
				}
			}
		}
		return new String(chars, 0, pos);
	}
	
	/**
	 * determines if 2 sequences of characters match in a limited boundary
	 * @param seq1 the first character sequence
	 * @param off1 the offset in seq1
	 * @param seq2 the second character sequence
	 * @param off2 the offset int seq2
	 * @param len the length to check for a match
	 * <br>if len <= 0, then the the longest possible value is used
	 */
	public static boolean matches(CharSequence seq1, int off1, CharSequence seq2, int off2, int len)
	{
		if (len <= 0)
		{
			len = Math.min(seq1.length() - off1, seq2.length() - off2);
			if (len <= 0) return false;
		}
		else
		{
			if (seq1.length() - len < off1) return false;
			if (seq2.length() - len < off2) return false;
		}
		for (int i = 0; i < len; i++)
		{
			if (seq1.charAt(off1 + i) != seq2.charAt(off2 + i)) return false;
		}
		return true;
	}
	
	/**
	 * determines how many bytes a given value occupies
	 * when written as a VarInt integer
	 * @param value the base value
	 * @return the length in bytes
	 */
	public static int getVILength(int value)
	{
		if (value == 0) return 1;
		return (38 - Integer.numberOfLeadingZeros(value)) / 7;
	}
	
	/**
	 * determines how many bytes a given value occupies
	 * when written as a VarInt long (VarLong)
	 * @param value the base value
	 * @return the length in bytes
	 */
	public static int getVLLength(long value)
	{
		if (value == 0) return 1;
		return (70 - Long.numberOfLeadingZeros(value)) / 7;
	}
}
