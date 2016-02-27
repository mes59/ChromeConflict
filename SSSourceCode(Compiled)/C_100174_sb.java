package game;

final class C_100174_sb
{
	static long field_105606_f;
	static int[] field_105607_d;
	static boolean field_105610_c;
	static int field_105609_b;
	static String field_105608_e;
	static boolean field_105611_a;
	private static final String[] field_105612_z;
	
	public static void func_105605_a(boolean arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100174_sb.field_105608_e
		// @04: aconst_null
		// @05: putstatic int[] game.C_100174_sb.field_105607_d
		// @08: iload_0
		// @09: iconst_1
		// @0A: if_icmpeq @11
		// @0D: iconst_0
		// @0E: invokestatic game.C_100174_sb.func_105605_a(boolean)void
		// @11: goto @35
		// @14: astore_1
		// @15: aload_1
		// @16: new java.lang.StringBuilder
		// @19: dup
		// @1A: invokespecial java.lang.StringBuilder.<init>()void
		// @1D: getstatic java.lang.String[] game.C_100174_sb.field_105612_z
		// @20: iconst_3
		// @21: aaload
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: iload_0
		// @26: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @29: bipush 41 (0x29)
		// @2B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @31: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @34: athrow
		// @35: return
	}
	
	static final boolean func_105602_a(CharSequence arg0, int arg1)
	{
		// @00: iload_1
		// @01: bipush 38 (0x26)
		// @03: if_icmpeq @08
		// @06: iconst_1
		// @07: ireturn
		// @08: iconst_0
		// @09: bipush -121 (0x87)
		// @0B: aload_0
		// @0C: invokestatic game.C_100106_ef.func_104749_a(boolean, int, java.lang.CharSequence)boolean
		// @0F: ireturn
		// @10: astore_2
		// @11: aload_2
		// @12: new java.lang.StringBuilder
		// @15: dup
		// @16: invokespecial java.lang.StringBuilder.<init>()void
		// @19: getstatic java.lang.String[] game.C_100174_sb.field_105612_z
		// @1C: iconst_1
		// @1D: aaload
		// @1E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @21: aload_0
		// @22: ifnull @2E
		// @25: getstatic java.lang.String[] game.C_100174_sb.field_105612_z
		// @28: iconst_0
		// @29: aaload
		// @2A: goto @33
		// @2D: athrow
		// @2E: getstatic java.lang.String[] game.C_100174_sb.field_105612_z
		// @31: iconst_2
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: bipush 44 (0x2C)
		// @38: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3B: iload_1
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 41 (0x29)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @47: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4A: athrow
	}
	
	static
	{
		// @00: iconst_4
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "X6,3~"
		// @08: invokestatic game.C_100174_sb.func_105604_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100174_sb.func_105603_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "Pz,\\+"
		// @13: invokestatic game.C_100174_sb.func_105604_z(java.lang.String)char[]
		// @16: invokestatic game.C_100174_sb.func_105603_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "Mmnq"
		// @1E: invokestatic game.C_100174_sb.func_105604_z(java.lang.String)char[]
		// @21: invokestatic game.C_100174_sb.func_105603_z(char[])java.lang.String
		// @24: aastore
		// @25: dup
		// @26: iconst_3
		// @27: ldc "Pz,_+"
		// @29: invokestatic game.C_100174_sb.func_105604_z(java.lang.String)char[]
		// @2C: invokestatic game.C_100174_sb.func_105603_z(char[])java.lang.String
		// @2F: aastore
		// @30: putstatic java.lang.String[] game.C_100174_sb.field_105612_z
		// @33: bipush 24 (0x18)
		// @35: newarray int[]
		// @37: dup
		// @38: iconst_0
		// @39: bipush 38 (0x26)
		// @3B: iastore
		// @3C: dup
		// @3D: iconst_1
		// @3E: bipush 38 (0x26)
		// @40: iastore
		// @41: dup
		// @42: iconst_2
		// @43: bipush 38 (0x26)
		// @45: iastore
		// @46: dup
		// @47: iconst_3
		// @48: bipush 38 (0x26)
		// @4A: iastore
		// @4B: dup
		// @4C: iconst_4
		// @4D: bipush 38 (0x26)
		// @4F: iastore
		// @50: dup
		// @51: iconst_5
		// @52: bipush 38 (0x26)
		// @54: iastore
		// @55: dup
		// @56: bipush 6 (0x06)
		// @58: bipush 38 (0x26)
		// @5A: iastore
		// @5B: dup
		// @5C: bipush 7 (0x07)
		// @5E: bipush 38 (0x26)
		// @60: iastore
		// @61: dup
		// @62: bipush 8 (0x08)
		// @64: bipush 38 (0x26)
		// @66: iastore
		// @67: dup
		// @68: bipush 9 (0x09)
		// @6A: bipush 38 (0x26)
		// @6C: iastore
		// @6D: dup
		// @6E: bipush 10 (0x0A)
		// @70: bipush 38 (0x26)
		// @72: iastore
		// @73: dup
		// @74: bipush 11 (0x0B)
		// @76: bipush 38 (0x26)
		// @78: iastore
		// @79: dup
		// @7A: bipush 12 (0x0C)
		// @7C: bipush 38 (0x26)
		// @7E: iastore
		// @7F: dup
		// @80: bipush 13 (0x0D)
		// @82: bipush 38 (0x26)
		// @84: iastore
		// @85: dup
		// @86: bipush 14 (0x0E)
		// @88: bipush 38 (0x26)
		// @8A: iastore
		// @8B: dup
		// @8C: bipush 15 (0x0F)
		// @8E: bipush 38 (0x26)
		// @90: iastore
		// @91: dup
		// @92: bipush 16 (0x10)
		// @94: bipush 38 (0x26)
		// @96: iastore
		// @97: dup
		// @98: bipush 17 (0x11)
		// @9A: bipush 38 (0x26)
		// @9C: iastore
		// @9D: dup
		// @9E: bipush 18 (0x12)
		// @A0: bipush 38 (0x26)
		// @A2: iastore
		// @A3: dup
		// @A4: bipush 19 (0x13)
		// @A6: bipush 38 (0x26)
		// @A8: iastore
		// @A9: dup
		// @AA: bipush 20 (0x14)
		// @AC: iconst_m1
		// @AD: iastore
		// @AE: dup
		// @AF: bipush 21 (0x15)
		// @B1: iconst_m1
		// @B2: iastore
		// @B3: dup
		// @B4: bipush 22 (0x16)
		// @B6: iconst_m1
		// @B7: iastore
		// @B8: dup
		// @B9: bipush 23 (0x17)
		// @BB: bipush 7 (0x07)
		// @BD: iastore
		// @BE: putstatic int[] game.C_100174_sb.field_105607_d
		// @C1: ldc "wpkn#Fvvoz\u0003|mxpM?v=nBlau"
		// @C3: invokestatic game.C_100174_sb.func_105604_z(java.lang.String)char[]
		// @C6: invokestatic game.C_100174_sb.func_105603_z(char[])java.lang.String
		// @C9: putstatic java.lang.String game.C_100174_sb.field_105608_e
		// @CC: iconst_m1
		// @CD: putstatic int game.C_100174_sb.field_105609_b
		// @D0: iconst_1
		// @D1: putstatic boolean game.C_100174_sb.field_105610_c
		// @D4: return
	}
	
	private static char[] func_105604_z(String arg0)
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
		// @0E: iconst_3
		// @0F: ixor
		// @10: i2c
		// @11: castore
		// @12: areturn
	}
	
	private static String func_105603_z(char[] arg0)
	{
		// @00: aload_0
		// @01: dup
		// @02: arraylength
		// @03: swap
		// @04: iconst_0
		// @05: istore_1
		// @06: goto @4A
		// @09: dup
		// @0A: iload_1
		// @0B: dup2
		// @0C: caload
		// @0D: iload_1
		// @0E: iconst_5
		// @0F: irem
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @3A, for 3: @3E
		// @30: bipush 35 (0x23)
		// @32: goto @44
		// @35: bipush 24 (0x18)
		// @37: goto @44
		// @3A: iconst_2
		// @3B: goto @44
		// @3E: bipush 29 (0x1D)
		// @40: goto @44
		// @43: iconst_3
		// @44: ixor
		// @45: i2c
		// @46: castore
		// @47: iinc #1 +1
		// @4A: swap
		// @4B: dup_x1
		// @4C: iload_1
		// @4D: if_icmpgt @09
		// @50: new java.lang.String
		// @53: dup_x1
		// @54: swap
		// @55: invokespecial java.lang.String.<init>(char[])void
		// @58: invokevirtual java.lang.String.intern()java.lang.String
		// @5B: areturn
	}
}
