package game;

final class C_100055_ed
{
	static String[] field_104243_b;
	static int field_104245_a;
	static int field_104240_g;
	static int field_104242_e;
	static int field_104239_f;
	static int field_104241_d;
	static int field_104244_c;
	private static final String[] field_104246_z;
	
	static final String func_104238_a(int arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: bipush 6 (0x06)
		// @07: newarray int[]
		// @09: dup
		// @0A: iconst_0
		// @0B: bipush 16 (0x10)
		// @0D: iastore
		// @0E: dup
		// @0F: iconst_1
		// @10: bipush 32 (0x20)
		// @12: iastore
		// @13: dup
		// @14: iconst_2
		// @15: bipush 64 (0x40)
		// @17: iastore
		// @18: dup
		// @19: iconst_3
		// @1A: sipush 128 (0x0080)
		// @1D: iastore
		// @1E: dup
		// @1F: iconst_4
		// @20: sipush 256 (0x0100)
		// @23: iastore
		// @24: dup
		// @25: iconst_5
		// @26: sipush 512 (0x0200)
		// @29: iastore
		// @2A: astore_2
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: astore_3
		// @33: iload_1
		// @34: istore #4
		// @36: iload #4
		// @38: iconst_m1
		// @39: ixor
		// @3A: aload_2
		// @3B: arraylength
		// @3C: iconst_m1
		// @3D: ixor
		// @3E: if_icmple @75
		// @41: iconst_0
		// @42: iload_0
		// @43: aload_2
		// @44: iload #4
		// @46: iaload
		// @47: iand
		// @48: if_icmpne @4F
		// @4B: goto @6D
		// @4E: athrow
		// @4F: iconst_0
		// @50: aload_3
		// @51: invokevirtual java.lang.StringBuilder.length()int
		// @54: if_icmpge @62
		// @57: aload_3
		// @58: bipush 47 (0x2F)
		// @5A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5D: pop
		// @5E: goto @62
		// @61: athrow
		// @62: aload_3
		// @63: getstatic java.lang.String[] game.C_100213_ak.field_105992_f
		// @66: iload #4
		// @68: aaload
		// @69: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6C: pop
		// @6D: iinc #4 +1
		// @70: iload #5
		// @72: ifeq @36
		// @75: aload_3
		// @76: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @79: areturn
		// @7A: astore_2
		// @7B: aload_2
		// @7C: new java.lang.StringBuilder
		// @7F: dup
		// @80: invokespecial java.lang.StringBuilder.<init>()void
		// @83: getstatic java.lang.String[] game.C_100055_ed.field_104246_z
		// @86: iconst_1
		// @87: aaload
		// @88: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8B: iload_0
		// @8C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8F: bipush 44 (0x2C)
		// @91: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @94: iload_1
		// @95: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @98: bipush 41 (0x29)
		// @9A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A0: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A3: athrow
	}
	
	public static void func_104235_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String[] game.C_100055_ed.field_104243_b
		// @04: iload_0
		// @05: bipush 32 (0x20)
		// @07: if_icmpeq @0F
		// @0A: bipush -93 (0xA3)
		// @0C: putstatic int game.C_100055_ed.field_104244_c
		// @0F: goto @33
		// @12: astore_1
		// @13: aload_1
		// @14: new java.lang.StringBuilder
		// @17: dup
		// @18: invokespecial java.lang.StringBuilder.<init>()void
		// @1B: getstatic java.lang.String[] game.C_100055_ed.field_104246_z
		// @1E: iconst_0
		// @1F: aaload
		// @20: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23: iload_0
		// @24: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @27: bipush 41 (0x29)
		// @29: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @32: athrow
		// @33: return
	}
	
	static
	{
		// @00: iconst_2
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "\u0010R\u0019&\u001a"
		// @08: invokestatic game.C_100055_ed.func_104237_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100055_ed.func_104236_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "\u0010R\u0019%\u001a"
		// @13: invokestatic game.C_100055_ed.func_104237_z(java.lang.String)char[]
		// @16: invokestatic game.C_100055_ed.func_104236_z(char[])java.lang.String
		// @19: aastore
		// @1A: putstatic java.lang.String[] game.C_100055_ed.field_104246_z
		// @1D: bipush 6 (0x06)
		// @1F: anewarray java.lang.String
		// @22: dup
		// @23: iconst_0
		// @24: ldc "\"W^\u0010[\u001bQ\u0017\u0002]\u0007\u0016C\u0001J\u0001"
		// @26: invokestatic game.C_100055_ed.func_104237_z(java.lang.String)char[]
		// @29: invokestatic game.C_100055_ed.func_104236_z(char[])java.lang.String
		// @2C: aastore
		// @2D: dup
		// @2E: iconst_1
		// @2F: ldc "\"WE\u0010WUWB\u0002\u0012!SO\u0010"
		// @31: invokestatic game.C_100055_ed.func_104237_z(java.lang.String)char[]
		// @34: invokestatic game.C_100055_ed.func_104236_z(char[])java.lang.String
		// @37: aastore
		// @38: dup
		// @39: iconst_2
		// @3A: ldc "0X\u0017\u0005F\u0001SY\u0010WURBDF\u0010NC\u0001"
		// @3C: invokestatic game.C_100055_ed.func_104237_z(java.lang.String)char[]
		// @3F: invokestatic game.C_100055_ed.func_104236_z(char[])java.lang.String
		// @42: aastore
		// @43: dup
		// @44: iconst_3
		// @45: ldc "4QB\u0005@\u0011WY\u0000]UBR\u001cF\u001aE"
		// @47: invokestatic game.C_100055_ed.func_104237_z(java.lang.String)char[]
		// @4A: invokestatic game.C_100055_ed.func_104236_z(char[])java.lang.String
		// @4D: aastore
		// @4E: dup
		// @4F: iconst_4
		// @50: ldc ":F\u0017\u0010W\u001eECDE\u0014U_\u0010W\u001b"
		// @52: invokestatic game.C_100055_ed.func_104237_z(java.lang.String)char[]
		// @55: invokestatic game.C_100055_ed.func_104236_z(char[])java.lang.String
		// @58: aastore
		// @59: dup
		// @5A: iconst_5
		// @5B: ldc "0EG\u0001@\u0014XS\u000b\u0012\u0014\u0016C\u0001J\u0001Y"
		// @5D: invokestatic game.C_100055_ed.func_104237_z(java.lang.String)char[]
		// @60: invokestatic game.C_100055_ed.func_104236_z(char[])java.lang.String
		// @63: aastore
		// @64: putstatic java.lang.String[] game.C_100055_ed.field_104243_b
		// @67: iconst_m1
		// @68: putstatic int game.C_100055_ed.field_104244_c
		// @6B: return
	}
	
	private static char[] func_104237_z(String arg0)
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
		// @0E: bipush 50 (0x32)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104236_z(char[] arg0)
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
		// @30: bipush 117 (0x75)
		// @32: goto @46
		// @35: bipush 54 (0x36)
		// @37: goto @46
		// @3A: bipush 55 (0x37)
		// @3C: goto @46
		// @3F: bipush 100 (0x64)
		// @41: goto @46
		// @44: bipush 50 (0x32)
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
