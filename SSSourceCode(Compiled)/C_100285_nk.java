package game;

final class C_100285_nk
{
	static String field_106784_c;
	static Boolean field_106783_b;
	int field_106785_a;
	static C_100037_wb[] field_106786_j;
	int field_106780_g;
	static String[] field_106788_h;
	static String field_106782_e;
	int field_106789_i;
	int field_106781_d;
	static String field_106779_f;
	private static final String[] field_106787_z;
	
	static final void func_106776_a(int arg0)
	{
		// @00: bipush -103 (0x99)
		// @02: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @05: putstatic long game.C_100340_je.field_102977_p
		// @08: iload_0
		// @09: putstatic int game.C_100142_bk.field_105087_e
		// @0C: goto @30
		// @0F: astore_1
		// @10: aload_1
		// @11: new java.lang.StringBuilder
		// @14: dup
		// @15: invokespecial java.lang.StringBuilder.<init>()void
		// @18: getstatic java.lang.String[] game.C_100285_nk.field_106787_z
		// @1B: iconst_2
		// @1C: aaload
		// @1D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @20: iload_0
		// @21: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @24: bipush 41 (0x29)
		// @26: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @29: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2F: athrow
		// @30: return
	}
	
	public static void func_106774_b(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100285_nk.field_106779_f
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100285_nk.field_106782_e
		// @08: aconst_null
		// @09: putstatic java.lang.String[] game.C_100285_nk.field_106788_h
		// @0C: iload_0
		// @0D: sipush -13507 (0xCB3D)
		// @10: if_icmpeq @1E
		// @13: aconst_null
		// @14: checkcast game.C_100037_wb[]
		// @17: putstatic game.C_100037_wb[] game.C_100285_nk.field_106786_j
		// @1A: goto @1E
		// @1D: athrow
		// @1E: aconst_null
		// @1F: putstatic java.lang.Boolean game.C_100285_nk.field_106783_b
		// @22: aconst_null
		// @23: putstatic game.C_100037_wb[] game.C_100285_nk.field_106786_j
		// @26: aconst_null
		// @27: putstatic java.lang.String game.C_100285_nk.field_106784_c
		// @2A: goto @4E
		// @2D: astore_1
		// @2E: aload_1
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100285_nk.field_106787_z
		// @39: iconst_0
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: iload_0
		// @3F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @42: bipush 41 (0x29)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4D: athrow
		// @4E: return
	}
	
	static final void func_106775_c(int arg0)
	{
		// @00: iload_0
		// @01: sipush -24528 (0xA030)
		// @04: if_icmpeq @10
		// @07: bipush -16 (0xF0)
		// @09: invokestatic game.C_100285_nk.func_106776_a(int)void
		// @0C: goto @10
		// @0F: athrow
		// @10: getstatic boolean game.C_100021_wn.field_103871_b
		// @13: ifeq @1F
		// @16: bipush 39 (0x27)
		// @18: invokestatic game.C_100128_ca.func_102800_f(byte)void
		// @1B: goto @1F
		// @1E: athrow
		// @1F: goto @43
		// @22: astore_1
		// @23: aload_1
		// @24: new java.lang.StringBuilder
		// @27: dup
		// @28: invokespecial java.lang.StringBuilder.<init>()void
		// @2B: getstatic java.lang.String[] game.C_100285_nk.field_106787_z
		// @2E: iconst_1
		// @2F: aaload
		// @30: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @33: iload_0
		// @34: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @37: bipush 41 (0x29)
		// @39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @42: athrow
		// @43: return
	}
	
	static
	{
		// @00: iconst_3
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "u\u0001!#J"
		// @08: invokestatic game.C_100285_nk.func_106778_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100285_nk.func_106777_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "u\u0001!!J"
		// @13: invokestatic game.C_100285_nk.func_106778_z(java.lang.String)char[]
		// @16: invokestatic game.C_100285_nk.func_106777_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "u\u0001! J"
		// @1E: invokestatic game.C_100285_nk.func_106778_z(java.lang.String)char[]
		// @21: invokestatic game.C_100285_nk.func_106777_z(char[])java.lang.String
		// @24: aastore
		// @25: putstatic java.lang.String[] game.C_100285_nk.field_106787_z
		// @28: ldc "'O>\\Bv\u000f{B^>Z1E\u0011;\u0007n\u0005\u000bxJm\u0017\u000ew\u000f{"
		// @2A: invokestatic game.C_100285_nk.func_106778_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100285_nk.func_106777_z(char[])java.lang.String
		// @30: putstatic java.lang.String game.C_100285_nk.field_106784_c
		// @33: ldc "Z\u000ekB^>Z1B\u0016tJf\u0005\u000ct\u0018jB\u000er\u0019{"
		// @35: invokestatic game.C_100285_nk.func_106778_z(java.lang.String)char[]
		// @38: invokestatic game.C_100285_nk.func_106777_z(char[])java.lang.String
		// @3B: putstatic java.lang.String game.C_100285_nk.field_106779_f
		// @3E: iconst_4
		// @3F: anewarray java.lang.String
		// @42: dup
		// @43: iconst_0
		// @44: ldc "u\u000fy\u0007\u0010"
		// @46: invokestatic game.C_100285_nk.func_106778_z(java.lang.String)char[]
		// @49: invokestatic game.C_100285_nk.func_106777_z(char[])java.lang.String
		// @4C: aastore
		// @4D: dup
		// @4E: iconst_1
		// @4F: ldc "t\u0004l\u0007"
		// @51: invokestatic game.C_100285_nk.func_106778_z(java.lang.String)char[]
		// @54: invokestatic game.C_100285_nk.func_106777_z(char[])java.lang.String
		// @57: aastore
		// @58: dup
		// @59: iconst_2
		// @5A: ldc "o\u001df\u0001\u0007"
		// @5C: invokestatic game.C_100285_nk.func_106778_z(java.lang.String)char[]
		// @5F: invokestatic game.C_100285_nk.func_106777_z(char[])java.lang.String
		// @62: aastore
		// @63: dup
		// @64: iconst_3
		// @65: ldc "'O?\\Bo\u0003b\u0007\u0011"
		// @67: invokestatic game.C_100285_nk.func_106778_z(java.lang.String)char[]
		// @6A: invokestatic game.C_100285_nk.func_106777_z(char[])java.lang.String
		// @6D: aastore
		// @6E: putstatic java.lang.String[] game.C_100285_nk.field_106788_h
		// @71: return
	}
	
	private static char[] func_106778_z(String arg0)
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
		// @0E: bipush 98 (0x62)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_106777_z(char[] arg0)
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
		// @30: bipush 27 (0x1B)
		// @32: goto @46
		// @35: bipush 106 (0x6A)
		// @37: goto @46
		// @3A: bipush 15 (0x0F)
		// @3C: goto @46
		// @3F: bipush 98 (0x62)
		// @41: goto @46
		// @44: bipush 98 (0x62)
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
