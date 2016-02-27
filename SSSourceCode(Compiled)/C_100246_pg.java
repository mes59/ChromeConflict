package game;

final class C_100246_pg
{
	static String field_106400_f;
	static int[] field_106402_d;
	static int field_106403_e;
	static String field_106408_h;
	static String field_106406_a;
	static int[] field_106405_c;
	static int field_106401_g;
	static volatile boolean field_106404_b;
	private static final String[] field_106407_z;
	
	public static void func_106397_a(int arg0)
	{
		// @00: iload_0
		// @01: bipush 14 (0x0E)
		// @03: if_icmpeq @0F
		// @06: bipush 74 (0x4A)
		// @08: putstatic int game.C_100246_pg.field_106403_e
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aconst_null
		// @10: putstatic int[] game.C_100246_pg.field_106405_c
		// @13: aconst_null
		// @14: putstatic java.lang.String game.C_100246_pg.field_106408_h
		// @17: aconst_null
		// @18: putstatic int[] game.C_100246_pg.field_106402_d
		// @1B: aconst_null
		// @1C: putstatic java.lang.String game.C_100246_pg.field_106400_f
		// @1F: aconst_null
		// @20: putstatic java.lang.String game.C_100246_pg.field_106406_a
		// @23: goto @47
		// @26: astore_1
		// @27: aload_1
		// @28: new java.lang.StringBuilder
		// @2B: dup
		// @2C: invokespecial java.lang.StringBuilder.<init>()void
		// @2F: getstatic java.lang.String[] game.C_100246_pg.field_106407_z
		// @32: iconst_0
		// @33: aaload
		// @34: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @37: iload_0
		// @38: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3B: bipush 41 (0x29)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @43: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @46: athrow
		// @47: return
	}
	
	static final void func_106396_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #13
		// @05: bipush -74 (0xB6)
		// @07: iload #4
		// @09: bipush 6 (0x06)
		// @0B: isub
		// @0C: bipush 38 (0x26)
		// @0E: idiv
		// @0F: idiv
		// @10: istore #10
		// @12: iload #5
		// @14: istore #12
		// @16: iload #12
		// @18: iconst_m1
		// @19: ixor
		// @1A: iload_2
		// @1B: iload #5
		// @1D: iadd
		// @1E: iconst_m1
		// @1F: ixor
		// @20: if_icmple @65
		// @23: iload_3
		// @24: iload #8
		// @26: ineg
		// @27: iadd
		// @28: iload #12
		// @2A: iload #5
		// @2C: ineg
		// @2D: iadd
		// @2E: imul
		// @2F: iload_2
		// @30: idiv
		// @31: iload #8
		// @33: iadd
		// @34: istore #9
		// @36: iload_1
		// @37: iload_1
		// @38: ineg
		// @39: iload_0
		// @3A: iadd
		// @3B: iload #12
		// @3D: iload #5
		// @3F: isub
		// @40: imul
		// @41: iload_2
		// @42: idiv
		// @43: ineg
		// @44: isub
		// @45: istore #11
		// @47: iload #6
		// @49: iload #12
		// @4B: iload #7
		// @4D: iload #9
		// @4F: iload #11
		// @51: invokestatic game.C_100196_rb.func_105800_f(int, int, int, int, int)void
		// @54: iinc #12 +1
		// @57: iload #13
		// @59: ifne @D8
		// @5C: iload #13
		// @5E: ifeq @16
		// @61: goto @65
		// @64: athrow
		// @65: goto @D8
		// @68: astore #9
		// @6A: aload #9
		// @6C: new java.lang.StringBuilder
		// @6F: dup
		// @70: invokespecial java.lang.StringBuilder.<init>()void
		// @73: getstatic java.lang.String[] game.C_100246_pg.field_106407_z
		// @76: iconst_1
		// @77: aaload
		// @78: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7B: iload_0
		// @7C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7F: bipush 44 (0x2C)
		// @81: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @84: iload_1
		// @85: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @88: bipush 44 (0x2C)
		// @8A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8D: iload_2
		// @8E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @91: bipush 44 (0x2C)
		// @93: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @96: iload_3
		// @97: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9A: bipush 44 (0x2C)
		// @9C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9F: iload #4
		// @A1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A4: bipush 44 (0x2C)
		// @A6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A9: iload #5
		// @AB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AE: bipush 44 (0x2C)
		// @B0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B3: iload #6
		// @B5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B8: bipush 44 (0x2C)
		// @BA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BD: iload #7
		// @BF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C2: bipush 44 (0x2C)
		// @C4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C7: iload #8
		// @C9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CC: bipush 41 (0x29)
		// @CE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D1: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D4: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D7: athrow
		// @D8: return
	}
	
	static
	{
		// @00: iconst_2
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "\"$xy@"
		// @08: invokestatic game.C_100246_pg.func_106399_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100246_pg.func_106398_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "\"$xz@"
		// @13: invokestatic game.C_100246_pg.func_106399_z(java.lang.String)char[]
		// @16: invokestatic game.C_100246_pg.func_106398_z(char[])java.lang.String
		// @19: aastore
		// @1A: putstatic java.lang.String[] game.C_100246_pg.field_106407_z
		// @1D: ldc "\u0011\"8[\r>"
		// @1F: invokestatic game.C_100246_pg.func_106399_z(java.lang.String)char[]
		// @22: invokestatic game.C_100246_pg.func_106398_z(char[])java.lang.String
		// @25: putstatic java.lang.String game.C_100246_pg.field_106400_f
		// @28: ldc "\u00130=\u0018\u001c=c<W\u0001<cj\u001dXld%\u0018\u000f3.3"
		// @2A: invokestatic game.C_100246_pg.func_106399_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100246_pg.func_106398_z(char[])java.lang.String
		// @30: putstatic java.lang.String game.C_100246_pg.field_106408_h
		// @33: bipush 10 (0x0A)
		// @35: newarray int[]
		// @37: dup
		// @38: iconst_0
		// @39: bipush 11 (0x0B)
		// @3B: iastore
		// @3C: dup
		// @3D: iconst_1
		// @3E: bipush 14 (0x0E)
		// @40: iastore
		// @41: dup
		// @42: iconst_2
		// @43: iconst_m1
		// @44: iastore
		// @45: dup
		// @46: iconst_3
		// @47: bipush 6 (0x06)
		// @49: iastore
		// @4A: dup
		// @4B: iconst_4
		// @4C: iconst_m1
		// @4D: iastore
		// @4E: dup
		// @4F: iconst_5
		// @50: iconst_3
		// @51: iastore
		// @52: dup
		// @53: bipush 6 (0x06)
		// @55: iconst_m1
		// @56: iastore
		// @57: dup
		// @58: bipush 7 (0x07)
		// @5A: bipush 6 (0x06)
		// @5C: iastore
		// @5D: dup
		// @5E: bipush 8 (0x08)
		// @60: iconst_m1
		// @61: iastore
		// @62: dup
		// @63: bipush 9 (0x09)
		// @65: bipush 6 (0x06)
		// @67: iastore
		// @68: putstatic int[] game.C_100246_pg.field_106405_c
		// @6B: ldc "nff\u0006Rr\u007fs\tV"
		// @6D: invokestatic game.C_100246_pg.func_106399_z(java.lang.String)char[]
		// @70: invokestatic game.C_100246_pg.func_106398_z(char[])java.lang.String
		// @73: putstatic java.lang.String game.C_100246_pg.field_106406_a
		// @76: iconst_3
		// @77: putstatic int game.C_100246_pg.field_106401_g
		// @7A: iconst_1
		// @7B: putstatic int game.C_100246_pg.field_106403_e
		// @7E: iconst_0
		// @7F: putstatic boolean game.C_100246_pg.field_106404_b
		// @82: return
	}
	
	private static char[] func_106399_z(String arg0)
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
		// @0E: bipush 104 (0x68)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_106398_z(char[] arg0)
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
		// @30: bipush 82 (0x52)
		// @32: goto @46
		// @35: bipush 67 (0x43)
		// @37: goto @46
		// @3A: bipush 86 (0x56)
		// @3C: goto @46
		// @3F: bipush 56 (0x38)
		// @41: goto @46
		// @44: bipush 104 (0x68)
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
