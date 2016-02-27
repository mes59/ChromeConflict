package game;

final class C_100187_rk extends C_100158_da
{
	static int field_100834_r;
	static int field_100828_m;
	static boolean field_100827_l;
	int field_100833_s;
	int field_100831_u;
	static String field_100836_p;
	String[][] field_100825_n;
	boolean field_100829_j;
	int field_100826_o;
	int[][] field_100832_t;
	static C_100002_gf field_100835_q;
	long[][] field_100830_k;
	private static final String[] field_100837_z;
	
	static final int func_100820_a(int arg0, int arg1, byte arg2)
	{
		// @00: iload_2
		// @01: bipush -60 (0xC4)
		// @03: if_icmple @0F
		// @06: bipush -33 (0xDF)
		// @08: putstatic int game.C_100187_rk.field_100834_r
		// @0B: goto @0F
		// @0E: athrow
		// @0F: iconst_1
		// @10: iload_1
		// @11: if_icmpne @23
		// @14: iload_0
		// @15: iconst_0
		// @16: invokestatic game.C_100227_af.func_106158_a(int, boolean)boolean
		// @19: ifeq @23
		// @1C: goto @20
		// @1F: athrow
		// @20: bipush 29 (0x1D)
		// @22: ireturn
		// @23: getstatic int[] game.C_100295_kh.field_105290_d
		// @26: iload_1
		// @27: iaload
		// @28: ireturn
		// @29: astore_3
		// @2A: aload_3
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100187_rk.field_100837_z
		// @35: iconst_5
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: iload_0
		// @3B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E: bipush 44 (0x2C)
		// @40: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43: iload_1
		// @44: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @47: bipush 44 (0x2C)
		// @49: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C: iload_2
		// @4D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @50: bipush 41 (0x29)
		// @52: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @55: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @58: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5B: athrow
	}
	
	public static void func_100823_e(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100002_gf game.C_100187_rk.field_100835_q
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100187_rk.field_100836_p
		// @08: iload_0
		// @09: iconst_1
		// @0A: if_icmpeq @13
		// @0D: bipush 70 (0x46)
		// @0F: invokestatic game.C_100187_rk.func_100822_c(byte)game.C_100302_ka
		// @12: pop
		// @13: goto @37
		// @16: astore_1
		// @17: aload_1
		// @18: new java.lang.StringBuilder
		// @1B: dup
		// @1C: invokespecial java.lang.StringBuilder.<init>()void
		// @1F: getstatic java.lang.String[] game.C_100187_rk.field_100837_z
		// @22: iconst_4
		// @23: aaload
		// @24: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27: iload_0
		// @28: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2B: bipush 41 (0x29)
		// @2D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @30: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @33: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @36: athrow
		// @37: return
	}
	
	static final String func_100824_a(byte arg0, String arg1, String arg2, C_100098_h arg3, String arg4)
	{
		// @00: iload_0
		// @01: bipush 63 (0x3F)
		// @03: if_icmpeq @0F
		// @06: bipush 77 (0x4D)
		// @08: invokestatic game.C_100187_rk.func_100823_e(int)void
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aload_3
		// @10: iconst_0
		// @11: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @14: ifne @19
		// @17: aload_1
		// @18: areturn
		// @19: new java.lang.StringBuilder
		// @1C: dup
		// @1D: invokespecial java.lang.StringBuilder.<init>()void
		// @20: aload #4
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: getstatic java.lang.String[] game.C_100187_rk.field_100837_z
		// @28: iconst_3
		// @29: aaload
		// @2A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D: aload_3
		// @2E: bipush 97 (0x61)
		// @30: aload_2
		// @31: invokevirtual game.C_100098_h.func_104602_a(byte, java.lang.String)int
		// @34: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @37: ldc "%"
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F: areturn
		// @40: astore #5
		// @42: aload #5
		// @44: new java.lang.StringBuilder
		// @47: dup
		// @48: invokespecial java.lang.StringBuilder.<init>()void
		// @4B: getstatic java.lang.String[] game.C_100187_rk.field_100837_z
		// @4E: iconst_2
		// @4F: aaload
		// @50: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @53: iload_0
		// @54: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @57: bipush 44 (0x2C)
		// @59: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C: aload_1
		// @5D: ifnull @69
		// @60: getstatic java.lang.String[] game.C_100187_rk.field_100837_z
		// @63: iconst_1
		// @64: aaload
		// @65: goto @6E
		// @68: athrow
		// @69: getstatic java.lang.String[] game.C_100187_rk.field_100837_z
		// @6C: iconst_0
		// @6D: aaload
		// @6E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @71: bipush 44 (0x2C)
		// @73: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @76: aload_2
		// @77: ifnull @83
		// @7A: getstatic java.lang.String[] game.C_100187_rk.field_100837_z
		// @7D: iconst_1
		// @7E: aaload
		// @7F: goto @88
		// @82: athrow
		// @83: getstatic java.lang.String[] game.C_100187_rk.field_100837_z
		// @86: iconst_0
		// @87: aaload
		// @88: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8B: bipush 44 (0x2C)
		// @8D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @90: aload_3
		// @91: ifnull @9D
		// @94: getstatic java.lang.String[] game.C_100187_rk.field_100837_z
		// @97: iconst_1
		// @98: aaload
		// @99: goto @A2
		// @9C: athrow
		// @9D: getstatic java.lang.String[] game.C_100187_rk.field_100837_z
		// @A0: iconst_0
		// @A1: aaload
		// @A2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A5: bipush 44 (0x2C)
		// @A7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AA: aload #4
		// @AC: ifnull @B8
		// @AF: getstatic java.lang.String[] game.C_100187_rk.field_100837_z
		// @B2: iconst_1
		// @B3: aaload
		// @B4: goto @BD
		// @B7: athrow
		// @B8: getstatic java.lang.String[] game.C_100187_rk.field_100837_z
		// @BB: iconst_0
		// @BC: aaload
		// @BD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C0: bipush 41 (0x29)
		// @C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CB: athrow
	}
	
	static final C_100302_ka func_100822_c(byte arg0)
	{
		// @00: iload_0
		// @01: bipush -65 (0xBF)
		// @03: if_icmpeq @0B
		// @06: aconst_null
		// @07: checkcast game.C_100302_ka
		// @0A: areturn
		// @0B: getstatic game.C_100100_i game.C_100012_fh.field_100507_G
		// @0E: getfield game.C_100302_ka game.C_100100_i.field_102015_Yb
		// @11: areturn
		// @12: astore_1
		// @13: aload_1
		// @14: new java.lang.StringBuilder
		// @17: dup
		// @18: invokespecial java.lang.StringBuilder.<init>()void
		// @1B: getstatic java.lang.String[] game.C_100187_rk.field_100837_z
		// @1E: bipush 6 (0x06)
		// @20: aaload
		// @21: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @24: iload_0
		// @25: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @28: bipush 41 (0x29)
		// @2A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @30: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @33: athrow
	}
	
	static final void func_100819_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush -32 (0xE0)
		// @03: if_icmpeq @0E
		// @06: iconst_1
		// @07: putstatic boolean game.C_100187_rk.field_100827_l
		// @0A: goto @0E
		// @0D: athrow
		// @0E: iconst_0
		// @0F: putstatic boolean game.C_100341_jd.field_102647_nb
		// @12: goto @37
		// @15: astore_1
		// @16: aload_1
		// @17: new java.lang.StringBuilder
		// @1A: dup
		// @1B: invokespecial java.lang.StringBuilder.<init>()void
		// @1E: getstatic java.lang.String[] game.C_100187_rk.field_100837_z
		// @21: bipush 7 (0x07)
		// @23: aaload
		// @24: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27: iload_0
		// @28: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2B: bipush 41 (0x29)
		// @2D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @30: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @33: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @36: athrow
		// @37: return
	}
	
	static
	{
		// @00: bipush 8 (0x08)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "FAw>"
		// @09: invokestatic game.C_100187_rk.func_100821_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100187_rk.func_100818_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "S\u001a5|Y"
		// @14: invokestatic game.C_100187_rk.func_100821_z(java.lang.String)char[]
		// @17: invokestatic game.C_100187_rk.func_100818_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "Z_5\u0013\u000c"
		// @1F: invokestatic game.C_100187_rk.func_100821_z(java.lang.String)char[]
		// @22: invokestatic game.C_100187_rk.func_100818_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\u0008\u0019;"
		// @2A: invokestatic game.C_100187_rk.func_100821_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100187_rk.func_100818_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "Z_5\u0017\u000c"
		// @35: invokestatic game.C_100187_rk.func_100821_z(java.lang.String)char[]
		// @38: invokestatic game.C_100187_rk.func_100818_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "Z_5\u0016\u000c"
		// @40: invokestatic game.C_100187_rk.func_100821_z(java.lang.String)char[]
		// @43: invokestatic game.C_100187_rk.func_100818_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "Z_5\u0011\u000c"
		// @4C: invokestatic game.C_100187_rk.func_100821_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100187_rk.func_100818_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "Z_5\u0010\u000c"
		// @58: invokestatic game.C_100187_rk.func_100821_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100187_rk.func_100818_z(char[])java.lang.String
		// @5E: aastore
		// @5F: putstatic java.lang.String[] game.C_100187_rk.field_100837_z
		// @62: iconst_0
		// @63: putstatic boolean game.C_100187_rk.field_100827_l
		// @66: bipush 20 (0x14)
		// @68: putstatic int game.C_100187_rk.field_100828_m
		// @6B: ldc "g\u007f"
		// @6D: invokestatic game.C_100187_rk.func_100821_z(java.lang.String)char[]
		// @70: invokestatic game.C_100187_rk.func_100818_z(char[])java.lang.String
		// @73: putstatic java.lang.String game.C_100187_rk.field_100836_p
		// @76: return
	}
	
	private static char[] func_100821_z(String arg0)
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
		// @0E: bipush 36 (0x24)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100818_z(char[] arg0)
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
		// @30: bipush 40 (0x28)
		// @32: goto @46
		// @35: bipush 52 (0x34)
		// @37: goto @46
		// @3A: bipush 27 (0x1B)
		// @3C: goto @46
		// @3F: bipush 82 (0x52)
		// @41: goto @46
		// @44: bipush 36 (0x24)
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
