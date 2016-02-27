package game;

final class C_100288_jn
{
	static boolean field_106842_e;
	static C_100278_nd field_106839_f;
	static boolean field_106840_g;
	static String field_106841_d;
	static String field_106844_c;
	static C_100037_wb field_106843_b;
	static C_100302_ka[] field_106845_a;
	private static final String[] field_106846_z;
	
	static final boolean func_106838_b(int arg0)
	{
		// @00: bipush -45 (0xD3)
		// @02: iload_0
		// @03: bipush 14 (0x0E)
		// @05: isub
		// @06: bipush 46 (0x2E)
		// @08: idiv
		// @09: irem
		// @0A: istore_1
		// @0B: iconst_2
		// @0C: getstatic int game.C_100103_eh.field_104672_h
		// @0F: if_icmpgt @17
		// @12: iconst_1
		// @13: goto @18
		// @16: athrow
		// @17: iconst_0
		// @18: ireturn
		// @19: astore_1
		// @1A: aload_1
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100288_jn.field_106846_z
		// @25: iconst_0
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: iload_0
		// @2B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2E: bipush 41 (0x29)
		// @30: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @33: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @36: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @39: athrow
	}
	
	public static void func_106835_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100288_jn.field_106844_c
		// @04: iload_0
		// @05: bipush 21 (0x15)
		// @07: if_icmpge @0B
		// @0A: return
		// @0B: aconst_null
		// @0C: putstatic game.C_100037_wb game.C_100288_jn.field_106843_b
		// @0F: aconst_null
		// @10: putstatic java.lang.String game.C_100288_jn.field_106841_d
		// @13: aconst_null
		// @14: putstatic game.C_100302_ka[] game.C_100288_jn.field_106845_a
		// @17: aconst_null
		// @18: putstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @1B: goto @3F
		// @1E: astore_1
		// @1F: aload_1
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100288_jn.field_106846_z
		// @2A: iconst_1
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_0
		// @30: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @33: bipush 41 (0x29)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3E: athrow
		// @3F: return
	}
	
	static
	{
		// @00: iconst_2
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "}\u0013C{*"
		// @08: invokestatic game.C_100288_jn.func_106837_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100288_jn.func_106836_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "}\u0013Cx*"
		// @13: invokestatic game.C_100288_jn.func_106837_z(java.lang.String)char[]
		// @16: invokestatic game.C_100288_jn.func_106836_z(char[])java.lang.String
		// @19: aastore
		// @1A: putstatic java.lang.String[] game.C_100288_jn.field_106846_z
		// @1D: ldc "U2>i\""
		// @1F: invokestatic game.C_100288_jn.func_106837_z(java.lang.String)char[]
		// @22: invokestatic game.C_100288_jn.func_106836_z(char[])java.lang.String
		// @25: putstatic java.lang.String game.C_100288_jn.field_106844_c
		// @28: ldc "G\u001c\n_\"+X]\u0004\"x\u001bM\u0006'&C"
		// @2A: invokestatic game.C_100288_jn.func_106837_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100288_jn.func_106836_z(char[])java.lang.String
		// @30: putstatic java.lang.String game.C_100288_jn.field_106841_d
		// @33: return
	}
	
	private static char[] func_106837_z(String arg0)
	{
		// @00: aload_0
		// @01: invokevirtual java.lang.String.toCharArray()char[]
		// @04: dup
		// @05: arraylength
		// @06: iconst_2
		// @07: if_icmpge @12
		// @0A: dup
		// @0B: iconst_0
		// @0C: dup2
		// @0D: caload
		// @0E: iconst_2
		// @0F: ixor
		// @10: i2c
		// @11: castore
		// @12: areturn
	}
	
	private static String func_106836_z(char[] arg0)
	{
		// @00: aload_0
		// @01: dup
		// @02: arraylength
		// @03: swap
		// @04: iconst_0
		// @05: istore_1
		// @06: goto @4B
		// @09: dup
		// @0A: iload_1
		// @0B: dup2
		// @0C: caload
		// @0D: iload_1
		// @0E: iconst_5
		// @0F: irem
		// @10: tableswitch def: @44, for 0: @30, for 1: @35, for 2: @3A, for 3: @3F
		// @30: bipush 23 (0x17)
		// @32: goto @45
		// @35: bipush 125 (0x7D)
		// @37: goto @45
		// @3A: bipush 109 (0x6D)
		// @3C: goto @45
		// @3F: bipush 58 (0x3A)
		// @41: goto @45
		// @44: iconst_2
		// @45: ixor
		// @46: i2c
		// @47: castore
		// @48: iinc #1 +1
		// @4B: swap
		// @4C: dup_x1
		// @4D: iload_1
		// @4E: if_icmpgt @09
		// @51: new java.lang.String
		// @54: dup_x1
		// @55: swap
		// @56: invokespecial java.lang.String.<init>(char[])void
		// @59: invokevirtual java.lang.String.intern()java.lang.String
		// @5C: areturn
	}
}
