package game;

final class C_100007_fm
{
	static int field_103630_b;
	static boolean field_103629_d;
	static boolean field_103631_c;
	static String field_103632_a;
	private static final String[] field_103633_z;
	
	static final String func_103628_a(int arg0, boolean arg1)
	{
		// @00: iload_0
		// @01: bipush 60 (0x3C)
		// @03: idiv
		// @04: istore_2
		// @05: iload_0
		// @06: bipush 60 (0x3C)
		// @08: irem
		// @09: istore_0
		// @0A: iload_1
		// @0B: ifeq @13
		// @0E: aconst_null
		// @0F: checkcast java.lang.String
		// @12: areturn
		// @13: sipush -30945 (0x871F)
		// @16: iconst_3
		// @17: anewarray java.lang.String
		// @1A: dup
		// @1B: iconst_0
		// @1C: iload_2
		// @1D: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @20: aastore
		// @21: dup
		// @22: iconst_1
		// @23: iload_0
		// @24: bipush 10 (0x0A)
		// @26: idiv
		// @27: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @2A: aastore
		// @2B: dup
		// @2C: iconst_2
		// @2D: iload_0
		// @2E: bipush 10 (0x0A)
		// @30: irem
		// @31: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @34: aastore
		// @35: getstatic java.lang.String game.C_100068_vc.field_104345_c
		// @38: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @3B: areturn
		// @3C: astore_2
		// @3D: aload_2
		// @3E: new java.lang.StringBuilder
		// @41: dup
		// @42: invokespecial java.lang.StringBuilder.<init>()void
		// @45: getstatic java.lang.String[] game.C_100007_fm.field_103633_z
		// @48: iconst_2
		// @49: aaload
		// @4A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4D: iload_0
		// @4E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @51: bipush 44 (0x2C)
		// @53: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56: iload_1
		// @57: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @5A: bipush 41 (0x29)
		// @5C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @62: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @65: athrow
	}
	
	public static void func_103624_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100007_fm.field_103632_a
		// @04: iload_0
		// @05: sipush 16772 (0x4184)
		// @08: if_icmpeq @12
		// @0B: aconst_null
		// @0C: checkcast java.lang.String
		// @0F: putstatic java.lang.String game.C_100007_fm.field_103632_a
		// @12: goto @36
		// @15: astore_1
		// @16: aload_1
		// @17: new java.lang.StringBuilder
		// @1A: dup
		// @1B: invokespecial java.lang.StringBuilder.<init>()void
		// @1E: getstatic java.lang.String[] game.C_100007_fm.field_103633_z
		// @21: iconst_0
		// @22: aaload
		// @23: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @26: iload_0
		// @27: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2A: bipush 41 (0x29)
		// @2C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @32: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @35: athrow
		// @36: return
	}
	
	static final boolean func_103626_a(char arg0, int arg1)
	{
		// @00: iload_1
		// @01: sipush 28481 (0x6F41)
		// @04: if_icmpeq @13
		// @07: ldc 65485 (0xffcd)
		// @09: bipush 107 (0x6B)
		// @0B: invokestatic game.C_100007_fm.func_103626_a(char, int)boolean
		// @0E: pop
		// @0F: goto @13
		// @12: athrow
		// @13: bipush -49 (0xCF)
		// @15: iload_0
		// @16: iconst_m1
		// @17: ixor
		// @18: if_icmplt @25
		// @1B: bipush 57 (0x39)
		// @1D: iload_0
		// @1E: if_icmpge @4F
		// @21: goto @25
		// @24: athrow
		// @25: bipush 65 (0x41)
		// @27: iload_0
		// @28: if_icmpgt @3B
		// @2B: goto @2F
		// @2E: athrow
		// @2F: iload_0
		// @30: iconst_m1
		// @31: ixor
		// @32: bipush -91 (0xA5)
		// @34: if_icmpge @4F
		// @37: goto @3B
		// @3A: athrow
		// @3B: bipush 97 (0x61)
		// @3D: iload_0
		// @3E: if_icmpgt @54
		// @41: goto @45
		// @44: athrow
		// @45: iload_0
		// @46: bipush 122 (0x7A)
		// @48: if_icmpgt @54
		// @4B: goto @4F
		// @4E: athrow
		// @4F: iconst_1
		// @50: goto @55
		// @53: athrow
		// @54: iconst_0
		// @55: ireturn
		// @56: astore_2
		// @57: aload_2
		// @58: new java.lang.StringBuilder
		// @5B: dup
		// @5C: invokespecial java.lang.StringBuilder.<init>()void
		// @5F: getstatic java.lang.String[] game.C_100007_fm.field_103633_z
		// @62: iconst_1
		// @63: aaload
		// @64: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @67: iload_0
		// @68: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6B: bipush 44 (0x2C)
		// @6D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @70: iload_1
		// @71: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @74: bipush 41 (0x29)
		// @76: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @79: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7F: athrow
	}
	
	static
	{
		// @00: iconst_3
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "j\u0000\u0008vj"
		// @08: invokestatic game.C_100007_fm.func_103627_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100007_fm.func_103625_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "j\u0000\u0008tj"
		// @13: invokestatic game.C_100007_fm.func_103627_z(java.lang.String)char[]
		// @16: invokestatic game.C_100007_fm.func_103625_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "j\u0000\u0008wj"
		// @1E: invokestatic game.C_100007_fm.func_103627_z(java.lang.String)char[]
		// @21: invokestatic game.C_100007_fm.func_103625_z(char[])java.lang.String
		// @24: aastore
		// @25: putstatic java.lang.String[] game.C_100007_fm.field_103633_z
		// @28: iconst_0
		// @29: putstatic int game.C_100007_fm.field_103630_b
		// @2C: iconst_0
		// @2D: putstatic boolean game.C_100007_fm.field_103629_d
		// @30: ldc "A$uf\u000bC#\u0006\tg<S\u0006\tg=S"
		// @32: invokestatic game.C_100007_fm.func_103627_z(java.lang.String)char[]
		// @35: invokestatic game.C_100007_fm.func_103625_z(char[])java.lang.String
		// @38: putstatic java.lang.String game.C_100007_fm.field_103632_a
		// @3B: iconst_0
		// @3C: putstatic boolean game.C_100007_fm.field_103631_c
		// @3F: return
	}
	
	private static char[] func_103627_z(String arg0)
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
		// @0E: bipush 66 (0x42)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103625_z(char[] arg0)
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
		// @30: bipush 12 (0x0C)
		// @32: goto @46
		// @35: bipush 109 (0x6D)
		// @37: goto @46
		// @3A: bipush 38 (0x26)
		// @3C: goto @46
		// @3F: bipush 53 (0x35)
		// @41: goto @46
		// @44: bipush 66 (0x42)
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
