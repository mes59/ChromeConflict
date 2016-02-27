package game;

final class C_100062_dk
{
	static int field_104280_g;
	static int field_104281_d;
	static C_100302_ka field_104284_c;
	static int field_104285_a;
	static long field_104283_b;
	static volatile int field_104279_f;
	static String field_104282_e;
	private static final String[] field_104286_z;
	
	static final StringBuilder func_104278_a(char arg0, byte arg1, StringBuilder arg2, int arg3)
	{
		// @00: aload_2
		// @01: invokevirtual java.lang.StringBuilder.length()int
		// @04: istore #4
		// @06: aload_2
		// @07: iload_3
		// @08: invokevirtual java.lang.StringBuilder.setLength(int)void
		// @0B: iload #4
		// @0D: istore #5
		// @0F: iload_3
		// @10: iconst_m1
		// @11: ixor
		// @12: iload #5
		// @14: iconst_m1
		// @15: ixor
		// @16: if_icmpge @27
		// @19: aload_2
		// @1A: iload #5
		// @1C: iload_0
		// @1D: invokevirtual java.lang.StringBuilder.setCharAt(int, char)void
		// @20: iinc #5 +1
		// @23: goto @0F
		// @26: athrow
		// @27: iload_1
		// @28: bipush 18 (0x12)
		// @2A: if_icmpge @35
		// @2D: iconst_4
		// @2E: putstatic int game.C_100062_dk.field_104279_f
		// @31: goto @35
		// @34: athrow
		// @35: aload_2
		// @36: areturn
		// @37: astore #4
		// @39: aload #4
		// @3B: new java.lang.StringBuilder
		// @3E: dup
		// @3F: invokespecial java.lang.StringBuilder.<init>()void
		// @42: getstatic java.lang.String[] game.C_100062_dk.field_104286_z
		// @45: iconst_0
		// @46: aaload
		// @47: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4A: iload_0
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: bipush 44 (0x2C)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: iload_1
		// @54: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @57: bipush 44 (0x2C)
		// @59: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C: aload_2
		// @5D: ifnull @69
		// @60: getstatic java.lang.String[] game.C_100062_dk.field_104286_z
		// @63: iconst_1
		// @64: aaload
		// @65: goto @6E
		// @68: athrow
		// @69: getstatic java.lang.String[] game.C_100062_dk.field_104286_z
		// @6C: iconst_2
		// @6D: aaload
		// @6E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @71: bipush 44 (0x2C)
		// @73: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @76: iload_3
		// @77: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7A: bipush 41 (0x29)
		// @7C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @82: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @85: athrow
	}
	
	public static void func_104276_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100302_ka game.C_100062_dk.field_104284_c
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100062_dk.field_104282_e
		// @08: iload_0
		// @09: bipush 39 (0x27)
		// @0B: if_icmpeq @1C
		// @0E: bipush 34 (0x22)
		// @10: bipush -24 (0xE8)
		// @12: aconst_null
		// @13: checkcast java.lang.StringBuilder
		// @16: bipush 37 (0x25)
		// @18: invokestatic game.C_100062_dk.func_104278_a(char, byte, java.lang.StringBuilder, int)java.lang.StringBuilder
		// @1B: pop
		// @1C: goto @40
		// @1F: astore_1
		// @20: aload_1
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100062_dk.field_104286_z
		// @2B: iconst_3
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: iload_0
		// @31: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34: bipush 41 (0x29)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F: athrow
		// @40: return
	}
	
	static
	{
		// @00: iconst_4
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "j\u0019j,S"
		// @08: invokestatic game.C_100062_dk.func_104277_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100062_dk.func_104275_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "u\\j@\u0006"
		// @13: invokestatic game.C_100062_dk.func_104277_z(java.lang.String)char[]
		// @16: invokestatic game.C_100062_dk.func_104275_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "`\u0007(\u0002"
		// @1E: invokestatic game.C_100062_dk.func_104277_z(java.lang.String)char[]
		// @21: invokestatic game.C_100062_dk.func_104275_z(char[])java.lang.String
		// @24: aastore
		// @25: dup
		// @26: iconst_3
		// @27: ldc "j\u0019j/S"
		// @29: invokestatic game.C_100062_dk.func_104277_z(java.lang.String)char[]
		// @2C: invokestatic game.C_100062_dk.func_104275_z(char[])java.lang.String
		// @2F: aastore
		// @30: putstatic java.lang.String[] game.C_100062_dk.field_104286_z
		// @33: iconst_4
		// @34: putstatic int game.C_100062_dk.field_104285_a
		// @37: iconst_0
		// @38: putstatic int game.C_100062_dk.field_104279_f
		// @3B: return
	}
	
	private static char[] func_104277_z(String arg0)
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
		// @0E: bipush 123 (0x7B)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104275_z(char[] arg0)
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
		// @30: bipush 14 (0x0E)
		// @32: goto @46
		// @35: bipush 114 (0x72)
		// @37: goto @46
		// @3A: bipush 68 (0x44)
		// @3C: goto @46
		// @3F: bipush 110 (0x6E)
		// @41: goto @46
		// @44: bipush 123 (0x7B)
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
