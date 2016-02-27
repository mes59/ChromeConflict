package game;

final class C_100299_kd
{
	int field_107017_E;
	int field_107024_H;
	byte[] field_107025_I;
	int field_107037_l;
	static long field_107029_g;
	int[][] field_107038_m;
	byte[] field_107053_x;
	boolean[] field_107039_j;
	static String field_107027_K;
	byte[][] field_107019_G;
	int[] field_107046_t;
	byte[] field_107031_e;
	int[][] field_107032_b;
	byte field_107047_s;
	int field_107044_v;
	byte[] field_107052_y;
	int field_107016_D;
	int field_107042_i;
	int[] field_107048_r;
	byte[] field_107043_w;
	int field_107020_A;
	int field_107021_B;
	static int field_107051_z;
	int field_107036_o;
	int field_107035_n;
	int[] field_107049_q;
	boolean[] field_107050_p;
	int field_107033_c;
	int field_107026_J;
	static boolean field_107018_F;
	int field_107034_a;
	int[] field_107045_u;
	int field_107030_d;
	static C_100302_ka field_107022_C;
	int[][] field_107028_f;
	byte[] field_107040_k;
	int field_107041_h;
	private static final String field_107023_L;
	
	public static void func_107014_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100299_kd.field_107027_K
		// @04: iload_0
		// @05: bipush -113 (0x8F)
		// @07: if_icmple @13
		// @0A: bipush -20 (0xEC)
		// @0C: putstatic int game.C_100299_kd.field_107051_z
		// @0F: goto @13
		// @12: athrow
		// @13: aconst_null
		// @14: putstatic game.C_100302_ka game.C_100299_kd.field_107022_C
		// @17: goto @39
		// @1A: astore_1
		// @1B: aload_1
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String game.C_100299_kd.field_107023_L
		// @26: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @29: iload_0
		// @2A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2D: bipush 41 (0x29)
		// @2F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @32: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @35: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @38: athrow
		// @39: return
	}
	
	C_100299_kd()
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: bipush 6 (0x06)
		// @07: sipush 258 (0x0102)
		// @0A: multianewarray int[][] (init: 2)
		// @0E: putfield int[][] game.C_100299_kd.field_107038_m
		// @11: aload_0
		// @12: sipush 18002 (0x4652)
		// @15: newarray byte[]
		// @17: putfield byte[] game.C_100299_kd.field_107031_e
		// @1A: aload_0
		// @1B: bipush 6 (0x06)
		// @1D: sipush 258 (0x0102)
		// @20: multianewarray byte[][] (init: 2)
		// @24: putfield byte[][] game.C_100299_kd.field_107019_G
		// @27: aload_0
		// @28: bipush 16 (0x10)
		// @2A: newarray boolean[]
		// @2C: putfield boolean[] game.C_100299_kd.field_107039_j
		// @2F: aload_0
		// @30: bipush 6 (0x06)
		// @32: sipush 258 (0x0102)
		// @35: multianewarray int[][] (init: 2)
		// @39: putfield int[][] game.C_100299_kd.field_107032_b
		// @3C: aload_0
		// @3D: sipush 256 (0x0100)
		// @40: newarray byte[]
		// @42: putfield byte[] game.C_100299_kd.field_107043_w
		// @45: aload_0
		// @46: bipush 16 (0x10)
		// @48: newarray int[]
		// @4A: putfield int[] game.C_100299_kd.field_107046_t
		// @4D: aload_0
		// @4E: sipush 18002 (0x4652)
		// @51: newarray byte[]
		// @53: putfield byte[] game.C_100299_kd.field_107052_y
		// @56: aload_0
		// @57: sipush 256 (0x0100)
		// @5A: newarray boolean[]
		// @5C: putfield boolean[] game.C_100299_kd.field_107050_p
		// @5F: aload_0
		// @60: iconst_0
		// @61: putfield int game.C_100299_kd.field_107035_n
		// @64: aload_0
		// @65: sipush 256 (0x0100)
		// @68: newarray int[]
		// @6A: putfield int[] game.C_100299_kd.field_107049_q
		// @6D: aload_0
		// @6E: bipush 6 (0x06)
		// @70: newarray int[]
		// @72: putfield int[] game.C_100299_kd.field_107045_u
		// @75: aload_0
		// @76: bipush 6 (0x06)
		// @78: sipush 258 (0x0102)
		// @7B: multianewarray int[][] (init: 2)
		// @7F: putfield int[][] game.C_100299_kd.field_107028_f
		// @82: aload_0
		// @83: sipush 4096 (0x1000)
		// @86: newarray byte[]
		// @88: putfield byte[] game.C_100299_kd.field_107040_k
		// @8B: aload_0
		// @8C: iconst_0
		// @8D: putfield int game.C_100299_kd.field_107030_d
		// @90: aload_0
		// @91: sipush 257 (0x0101)
		// @94: newarray int[]
		// @96: putfield int[] game.C_100299_kd.field_107048_r
		// @99: return
	}
	
	static
	{
		// @00: ldc "YUP5Z"
		// @02: invokestatic game.C_100299_kd.func_107015_z(java.lang.String)char[]
		// @05: invokestatic game.C_100299_kd.func_107013_z(char[])java.lang.String
		// @08: putstatic java.lang.String game.C_100299_kd.field_107023_L
		// @0B: ldc "k^\u000bT\u001aSG\u001bT\u0017\\E\u001b\u0006\u0017V\u0011\u001f\u001a\u001dFY\u001b\u0006RUP\u0013\u0011\\"
		// @0D: invokestatic game.C_100299_kd.func_107015_z(java.lang.String)char[]
		// @10: invokestatic game.C_100299_kd.func_107013_z(char[])java.lang.String
		// @13: putstatic java.lang.String game.C_100299_kd.field_107027_K
		// @16: iconst_m1
		// @17: putstatic int game.C_100299_kd.field_107051_z
		// @1A: return
	}
	
	private static char[] func_107015_z(String arg0)
	{
		// @00: aload_0
		// @01: invokevirtual java.lang.String.toCharArray()char[]
		// @04: dup
		// @05: arraylength
		// @06: iconst_2
		// @07: if_icmpge @13
		// @0A: dup
		// @0B: iconst_0
		// @0C: dup2
		// @0D: caload
		// @0E: bipush 114 (0x72)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_107013_z(char[] arg0)
	{
		// @00: aload_0
		// @01: dup
		// @02: arraylength
		// @03: swap
		// @04: iconst_0
		// @05: istore_1
		// @06: goto @4C
		// @09: dup
		// @0A: iload_1
		// @0B: dup2
		// @0C: caload
		// @0D: iload_1
		// @0E: iconst_5
		// @0F: irem
		// @10: tableswitch def: @44, for 0: @30, for 1: @35, for 2: @3A, for 3: @3F
		// @30: bipush 50 (0x32)
		// @32: goto @46
		// @35: bipush 49 (0x31)
		// @37: goto @46
		// @3A: bipush 126 (0x7E)
		// @3C: goto @46
		// @3F: bipush 116 (0x74)
		// @41: goto @46
		// @44: bipush 114 (0x72)
		// @46: ixor
		// @47: i2c
		// @48: castore
		// @49: iinc #1 +1
		// @4C: swap
		// @4D: dup_x1
		// @4E: iload_1
		// @4F: if_icmpgt @09
		// @52: new java.lang.String
		// @55: dup_x1
		// @56: swap
		// @57: invokespecial java.lang.String.<init>(char[])void
		// @5A: invokevirtual java.lang.String.intern()java.lang.String
		// @5D: areturn
	}
}
