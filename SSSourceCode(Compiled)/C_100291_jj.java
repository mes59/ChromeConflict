package game;

final class C_100291_jj
{
	static C_100202_qi field_106877_c;
	static String field_106875_e;
	static String field_106873_g;
	static C_100302_ka field_106874_d;
	static boolean field_106872_f;
	static int field_106876_b;
	static int field_106878_a;
	private static final String[] field_106879_z;
	
	public static void func_106868_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100202_qi game.C_100291_jj.field_106877_c
		// @04: aconst_null
		// @05: putstatic game.C_100302_ka game.C_100291_jj.field_106874_d
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100291_jj.field_106875_e
		// @0C: iload_0
		// @0D: bipush 16 (0x10)
		// @0F: if_icmpgt @13
		// @12: return
		// @13: aconst_null
		// @14: putstatic java.lang.String game.C_100291_jj.field_106873_g
		// @17: goto @3B
		// @1A: astore_1
		// @1B: aload_1
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String[] game.C_100291_jj.field_106879_z
		// @26: iconst_0
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: iload_0
		// @2C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F: bipush 41 (0x29)
		// @31: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @37: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3A: athrow
		// @3B: return
	}
	
	static final void func_106871_a(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #7
		// @05: iload_1
		// @06: iload_2
		// @07: iload_0
		// @08: iload #4
		// @0A: ldc 12105914 (0xb8b8ba)
		// @0C: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @0F: iconst_1
		// @10: iload_1
		// @11: iadd
		// @12: iload_2
		// @13: iconst_1
		// @14: iadd
		// @15: bipush -2 (0xFE)
		// @17: iload_0
		// @18: iadd
		// @19: bipush -2 (0xFE)
		// @1B: iload #4
		// @1D: iadd
		// @1E: ldc 16251129 (0xf7f8f9)
		// @20: ldc 10461345 (0x9fa0a1)
		// @22: invokestatic game.C_100196_rb.func_105798_b(int, int, int, int, int, int)void
		// @25: bipush 64 (0x40)
		// @27: istore #5
		// @29: iconst_1
		// @2A: istore #6
		// @2C: iload #6
		// @2E: iconst_m1
		// @2F: ixor
		// @30: bipush -7 (0xF9)
		// @32: if_icmplt @6A
		// @35: iload_1
		// @36: iload #6
		// @38: iadd
		// @39: iload_2
		// @3A: iload #6
		// @3C: iadd
		// @3D: iload_0
		// @3E: iconst_2
		// @3F: iload #6
		// @41: imul
		// @42: isub
		// @43: iconst_2
		// @44: iload #6
		// @46: imul
		// @47: ineg
		// @48: iload #4
		// @4A: iadd
		// @4B: ldc 16251129 (0xf7f8f9)
		// @4D: iload #5
		// @4F: invokestatic game.C_100196_rb.func_105810_f(int, int, int, int, int, int)void
		// @52: iload #5
		// @54: ldc -954253215 (0xc71f4061)
		// @56: ishr
		// @57: istore #5
		// @59: iinc #6 +1
		// @5C: iload #7
		// @5E: ifne @81
		// @61: iload #7
		// @63: ifeq @2C
		// @66: goto @6A
		// @69: athrow
		// @6A: iload_3
		// @6B: bipush -64 (0xC0)
		// @6D: if_icmplt @81
		// @70: bipush 15 (0x0F)
		// @72: bipush 82 (0x52)
		// @74: bipush 65 (0x41)
		// @76: bipush -16 (0xF0)
		// @78: bipush 74 (0x4A)
		// @7A: invokestatic game.C_100291_jj.func_106871_a(int, int, int, int, int)void
		// @7D: goto @81
		// @80: athrow
		// @81: goto @CC
		// @84: astore #5
		// @86: aload #5
		// @88: new java.lang.StringBuilder
		// @8B: dup
		// @8C: invokespecial java.lang.StringBuilder.<init>()void
		// @8F: getstatic java.lang.String[] game.C_100291_jj.field_106879_z
		// @92: iconst_1
		// @93: aaload
		// @94: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @97: iload_0
		// @98: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9B: bipush 44 (0x2C)
		// @9D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A0: iload_1
		// @A1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A4: bipush 44 (0x2C)
		// @A6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A9: iload_2
		// @AA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AD: bipush 44 (0x2C)
		// @AF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B2: iload_3
		// @B3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B6: bipush 44 (0x2C)
		// @B8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BB: iload #4
		// @BD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C0: bipush 41 (0x29)
		// @C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CB: athrow
		// @CC: return
	}
	
	static
	{
		// @00: iconst_2
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "%ZMl~"
		// @08: invokestatic game.C_100291_jj.func_106870_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100291_jj.func_106869_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "%ZMo~"
		// @13: invokestatic game.C_100291_jj.func_106870_z(java.lang.String)char[]
		// @16: invokestatic game.C_100291_jj.func_106869_z(char[])java.lang.String
		// @19: aastore
		// @1A: putstatic java.lang.String[] game.C_100291_jj.field_106879_z
		// @1D: ldc "\u000bY\u0010M7=TC~$ W\u0011K%<"
		// @1F: invokestatic game.C_100291_jj.func_106870_z(java.lang.String)char[]
		// @22: invokestatic game.C_100291_jj.func_106869_z(char[])java.lang.String
		// @25: putstatic java.lang.String game.C_100291_jj.field_106875_e
		// @28: ldc "\u001bX\u0006\u000ejj\u0000]\u000e?<\u0010\rA!oQ\u0015O?#Q\u0001B3oV\u000c\\v6_\u0016\u000e\" \u0010\u0016]3a\u0010:A#oS\u0002@v<U\u000fK5;\u0010\u0017F?<\u0010\u0000F7<C\n]v&^CZ>*\u0010Dm9!V\nI#=Q\u0017G9!\u0017C]5=U\u0006@x"
		// @2A: invokestatic game.C_100291_jj.func_106870_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100291_jj.func_106869_z(char[])java.lang.String
		// @30: putstatic java.lang.String game.C_100291_jj.field_106873_g
		// @33: new game.C_100202_qi
		// @36: dup
		// @37: invokespecial game.C_100202_qi.<init>()void
		// @3A: putstatic game.C_100202_qi game.C_100291_jj.field_106877_c
		// @3D: iconst_0
		// @3E: putstatic boolean game.C_100291_jj.field_106872_f
		// @41: return
	}
	
	private static char[] func_106870_z(String arg0)
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
		// @0E: bipush 86 (0x56)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_106869_z(char[] arg0)
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
		// @30: bipush 79 (0x4F)
		// @32: goto @46
		// @35: bipush 48 (0x30)
		// @37: goto @46
		// @3A: bipush 99 (0x63)
		// @3C: goto @46
		// @3F: bipush 46 (0x2E)
		// @41: goto @46
		// @44: bipush 86 (0x56)
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
