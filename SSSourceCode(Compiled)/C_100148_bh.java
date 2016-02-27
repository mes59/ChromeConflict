package game;

import java.lang.reflect.Method;

class C_100148_bh extends C_100325_id
{
	static int field_101799_H;
	static String field_101807_y;
	static C_100068_vc field_101797_B;
	static Method field_101793_E;
	static int field_101798_C;
	static C_100302_ka field_101802_v;
	static C_100037_wb field_101794_F;
	static C_100302_ka field_101808_x;
	static int[] field_101795_G;
	static int field_101803_u;
	static C_100037_wb field_101796_A;
	static String field_101792_D;
	static C_100098_h field_101804_t;
	static String field_101805_s;
	static int field_101806_z;
	static C_100098_h field_101801_w;
	private static final String field_101800_I;
	
	public static void func_101789_i(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100302_ka game.C_100148_bh.field_101808_x
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100148_bh.field_101805_s
		// @08: aconst_null
		// @09: putstatic game.C_100302_ka game.C_100148_bh.field_101802_v
		// @0C: aconst_null
		// @0D: putstatic java.lang.reflect.Method game.C_100148_bh.field_101793_E
		// @10: aconst_null
		// @11: putstatic game.C_100037_wb game.C_100148_bh.field_101794_F
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100148_bh.field_101792_D
		// @18: aconst_null
		// @19: putstatic int[] game.C_100148_bh.field_101795_G
		// @1C: aconst_null
		// @1D: putstatic game.C_100037_wb game.C_100148_bh.field_101796_A
		// @20: aconst_null
		// @21: putstatic game.C_100068_vc game.C_100148_bh.field_101797_B
		// @24: iload_0
		// @25: sipush -8027 (0xE0A5)
		// @28: if_icmpeq @2C
		// @2B: return
		// @2C: aconst_null
		// @2D: putstatic game.C_100098_h game.C_100148_bh.field_101801_w
		// @30: aconst_null
		// @31: putstatic java.lang.String game.C_100148_bh.field_101807_y
		// @34: aconst_null
		// @35: putstatic game.C_100098_h game.C_100148_bh.field_101804_t
		// @38: goto @5A
		// @3B: astore_1
		// @3C: aload_1
		// @3D: new java.lang.StringBuilder
		// @40: dup
		// @41: invokespecial java.lang.StringBuilder.<init>()void
		// @44: getstatic java.lang.String game.C_100148_bh.field_101800_I
		// @47: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4A: iload_0
		// @4B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4E: bipush 41 (0x29)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @56: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @59: athrow
		// @5A: return
	}
	
	static
	{
		// @00: ldc "\u0004X\u0006e:N"
		// @02: invokestatic game.C_100148_bh.func_101791_z(java.lang.String)char[]
		// @05: invokestatic game.C_100148_bh.func_101790_z(char[])java.lang.String
		// @08: putstatic java.lang.String game.C_100148_bh.field_101800_I
		// @0B: ldc "'TL\u0007\u001e\u0014YMI\u001c"
		// @0D: invokestatic game.C_100148_bh.func_101791_z(java.lang.String)char[]
		// @10: invokestatic game.C_100148_bh.func_101790_z(char[])java.lang.String
		// @13: putstatic java.lang.String game.C_100148_bh.field_101807_y
		// @16: new game.C_100068_vc
		// @19: dup
		// @1A: invokespecial game.C_100068_vc.<init>()void
		// @1D: putstatic game.C_100068_vc game.C_100148_bh.field_101797_B
		// @20: iconst_m1
		// @21: putstatic int game.C_100148_bh.field_101798_C
		// @24: ldc "?_]\u0007\u001b\u0007^\u0008T\u0008\u0003S\\F\u000c\u0003\u0010\\O\u0011\u0015\u0010OF\u0015\u0003"
		// @26: invokestatic game.C_100148_bh.func_101791_z(java.lang.String)char[]
		// @29: invokestatic game.C_100148_bh.func_101790_z(char[])java.lang.String
		// @2C: putstatic java.lang.String game.C_100148_bh.field_101792_D
		// @2F: sipush 8192 (0x2000)
		// @32: newarray int[]
		// @34: putstatic int[] game.C_100148_bh.field_101795_G
		// @37: iconst_3
		// @38: putstatic int game.C_100148_bh.field_101803_u
		// @3B: ldc "4UXH\n\u0012\u0010IE\r\u0015U"
		// @3D: invokestatic game.C_100148_bh.func_101791_z(java.lang.String)char[]
		// @40: invokestatic game.C_100148_bh.func_101790_z(char[])java.lang.String
		// @43: putstatic java.lang.String game.C_100148_bh.field_101805_s
		// @46: return
	}
	
	private static char[] func_101791_z(String arg0)
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
		// @0E: bipush 120 (0x78)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_101790_z(char[] arg0)
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
		// @30: bipush 102 (0x66)
		// @32: goto @46
		// @35: bipush 48 (0x30)
		// @37: goto @46
		// @3A: bipush 40 (0x28)
		// @3C: goto @46
		// @3F: bipush 39 (0x27)
		// @41: goto @46
		// @44: bipush 120 (0x78)
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
