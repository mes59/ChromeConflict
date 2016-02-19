package sentinel;

public final class Types
{
	public static final int HEAD = -1;
	public static final int ARM = -2;
	public static final int BIGARM = -3;
	public static final int SHOULDER = -4;
	
	public static final int LWEAPON = 1;
	public static final int HWEAPON = 2;
	public static final int OWEAPON = 4;
	public static final int LROCKET = 8;
	public static final int HROCKET = 16;
	public static final int OROCKET = 32;
	
	// REM used for ships (maybe), maybe also for sentinels
	// whatever, just dont forget them :)
	@SuppressWarnings("unused")
	private static final int MEGA = 64;
	@SuppressWarnings("unused")
	private static final int GIGA = 128;
	@SuppressWarnings("unused")
	private static final int TERA = 256;
	@SuppressWarnings("unused")
	private static final int PETA = 512;
	@SuppressWarnings("unused")
	private static final int EXA = 1024;
	@SuppressWarnings("unused")
	private static final int OMEGA = 2048;
}
