package game;

final class C_100134_tj
{
	static C_100217_ao field_105007_d;
	static String field_105009_b;
	static String field_105010_c;
	static C_100302_ka field_105006_f;
	static String field_105008_e;
	static String field_105011_a;
	private static final String field_105012_z;
	
	public static void func_105003_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100134_tj.field_105010_c
		// @04: aconst_null
		// @05: putstatic game.C_100217_ao game.C_100134_tj.field_105007_d
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100134_tj.field_105008_e
		// @0C: iload_0
		// @0D: sipush 6311 (0x18A7)
		// @10: if_icmpeq @14
		// @13: return
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100134_tj.field_105011_a
		// @18: aconst_null
		// @19: putstatic game.C_100302_ka game.C_100134_tj.field_105006_f
		// @1C: aconst_null
		// @1D: putstatic java.lang.String game.C_100134_tj.field_105009_b
		// @20: goto @42
		// @23: astore_1
		// @24: aload_1
		// @25: new java.lang.StringBuilder
		// @28: dup
		// @29: invokespecial java.lang.StringBuilder.<init>()void
		// @2C: getstatic java.lang.String game.C_100134_tj.field_105012_z
		// @2F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @32: iload_0
		// @33: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @36: bipush 41 (0x29)
		// @38: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @41: athrow
		// @42: return
	}
	
	static
	{
		// @00: ldc "\u0019@[=/"
		// @02: invokestatic game.C_100134_tj.func_105005_z(java.lang.String)char[]
		// @05: invokestatic game.C_100134_tj.func_105004_z(char[])java.lang.String
		// @08: putstatic java.lang.String game.C_100134_tj.field_105012_z
		// @0B: new game.C_100217_ao
		// @0E: dup
		// @0F: bipush 11 (0x0B)
		// @11: iconst_0
		// @12: iconst_1
		// @13: iconst_2
		// @14: invokespecial game.C_100217_ao.<init>(int, int, int, int)void
		// @17: putstatic game.C_100217_ao game.C_100134_tj.field_105007_d
		// @1A: ldc "&C\u0016\u0017"
		// @1C: invokestatic game.C_100134_tj.func_105005_z(java.lang.String)char[]
		// @1F: invokestatic game.C_100134_tj.func_105004_z(char[])java.lang.String
		// @22: putstatic java.lang.String game.C_100134_tj.field_105009_b
		// @25: ldc "$D\u0003\u0015s\u0008\n\u0005\u0010f\u0014O\u0007\u000f"
		// @27: invokestatic game.C_100134_tj.func_105005_z(java.lang.String)char[]
		// @2A: invokestatic game.C_100134_tj.func_105004_z(char[])java.lang.String
		// @2D: putstatic java.lang.String game.C_100134_tj.field_105010_c
		// @30: ldc "\u000bE\u0010"
		// @32: invokestatic game.C_100134_tj.func_105005_z(java.lang.String)char[]
		// @35: invokestatic game.C_100134_tj.func_105004_z(char[])java.lang.String
		// @38: putstatic java.lang.String game.C_100134_tj.field_105008_e
		// @3B: ldc "+\u0018"
		// @3D: invokestatic game.C_100134_tj.func_105005_z(java.lang.String)char[]
		// @40: invokestatic game.C_100134_tj.func_105004_z(char[])java.lang.String
		// @43: putstatic java.lang.String game.C_100134_tj.field_105011_a
		// @46: return
	}
	
	private static char[] func_105005_z(String arg0)
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
		// @0E: bipush 7 (0x07)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105004_z(char[] arg0)
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
		// @30: bipush 109 (0x6D)
		// @32: goto @46
		// @35: bipush 42 (0x2A)
		// @37: goto @46
		// @3A: bipush 117 (0x75)
		// @3C: goto @46
		// @3F: bipush 124 (0x7C)
		// @41: goto @46
		// @44: bipush 7 (0x07)
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
