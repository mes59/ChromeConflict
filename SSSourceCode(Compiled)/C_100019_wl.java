package game;

import java.lang.reflect.Method;

final class C_100019_wl
{
	private C_100202_qi field_103841_g;
	static String field_103843_e;
	private C_100158_da field_103845_c;
	static byte[] field_103840_f;
	static Method field_103846_a;
	static C_100286_nl field_103842_d;
	static C_100302_ka field_103844_b;
	private static final String[] field_103847_z;
	
	public static void func_103838_c(boolean arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100019_wl.field_103843_e
		// @04: aconst_null
		// @05: putstatic game.C_100286_nl game.C_100019_wl.field_103842_d
		// @08: aconst_null
		// @09: putstatic java.lang.reflect.Method game.C_100019_wl.field_103846_a
		// @0C: iload_0
		// @0D: ifeq @1A
		// @10: bipush 110 (0x6E)
		// @12: invokestatic game.C_100019_wl.func_103833_a(int)int
		// @15: pop
		// @16: goto @1A
		// @19: athrow
		// @1A: aconst_null
		// @1B: putstatic byte[] game.C_100019_wl.field_103840_f
		// @1E: aconst_null
		// @1F: putstatic game.C_100302_ka game.C_100019_wl.field_103844_b
		// @22: goto @47
		// @25: astore_1
		// @26: aload_1
		// @27: new java.lang.StringBuilder
		// @2A: dup
		// @2B: invokespecial java.lang.StringBuilder.<init>()void
		// @2E: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @31: bipush 7 (0x07)
		// @33: aaload
		// @34: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @37: iload_0
		// @38: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @3B: bipush 41 (0x29)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @43: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @46: athrow
		// @47: return
	}
	
	static final void func_103834_a(String arg0, int arg1, int arg2, int arg3, String arg4, String arg5)
	{
		// @00: iload_1
		// @01: ldc -1221466785 (0xb731e55f)
		// @03: if_icmpeq @0F
		// @06: iconst_1
		// @07: invokestatic game.C_100019_wl.func_103832_a(boolean)int
		// @0A: pop
		// @0B: goto @0F
		// @0E: athrow
		// @0F: new game.C_100240_oj
		// @12: dup
		// @13: iload_3
		// @14: aload #4
		// @16: iload_2
		// @17: aload_0
		// @18: aload #5
		// @1A: invokespecial game.C_100240_oj.<init>(int, java.lang.String, int, java.lang.String, java.lang.String)void
		// @1D: astore #6
		// @1F: iload_1
		// @20: ldc -1221466768 (0xb731e570)
		// @22: ixor
		// @23: aload #6
		// @25: invokestatic game.C_100332_ii.func_107306_a(int, game.C_100240_oj)void
		// @28: goto @B0
		// @2B: astore #6
		// @2D: aload #6
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @39: iconst_2
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: aload_0
		// @3F: ifnull @4B
		// @42: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @45: iconst_3
		// @46: aaload
		// @47: goto @50
		// @4A: athrow
		// @4B: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @4E: iconst_1
		// @4F: aaload
		// @50: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @53: bipush 44 (0x2C)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: iload_1
		// @59: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5C: bipush 44 (0x2C)
		// @5E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @61: iload_2
		// @62: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @65: bipush 44 (0x2C)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: iload_3
		// @6B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6E: bipush 44 (0x2C)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: aload #4
		// @75: ifnull @81
		// @78: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @7B: iconst_3
		// @7C: aaload
		// @7D: goto @86
		// @80: athrow
		// @81: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @84: iconst_1
		// @85: aaload
		// @86: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @89: bipush 44 (0x2C)
		// @8B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8E: aload #5
		// @90: ifnull @9C
		// @93: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @96: iconst_3
		// @97: aaload
		// @98: goto @A1
		// @9B: athrow
		// @9C: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @9F: iconst_1
		// @A0: aaload
		// @A1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A4: bipush 41 (0x29)
		// @A6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @AC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AF: athrow
		// @B0: return
	}
	
	final C_100158_da func_103837_b(boolean arg0)
	{
		// @00: aload_0
		// @01: getfield game.C_100202_qi game.C_100019_wl.field_103841_g
		// @04: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @07: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @0A: astore_2
		// @0B: aload_0
		// @0C: getfield game.C_100202_qi game.C_100019_wl.field_103841_g
		// @0F: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @12: aload_2
		// @13: if_acmpeq @1A
		// @16: goto @21
		// @19: athrow
		// @1A: aload_0
		// @1B: aconst_null
		// @1C: putfield game.C_100158_da game.C_100019_wl.field_103845_c
		// @1F: aconst_null
		// @20: areturn
		// @21: aload_0
		// @22: aload_2
		// @23: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @26: putfield game.C_100158_da game.C_100019_wl.field_103845_c
		// @29: iload_1
		// @2A: iconst_1
		// @2B: if_icmpeq @33
		// @2E: aconst_null
		// @2F: checkcast game.C_100158_da
		// @32: areturn
		// @33: aload_2
		// @34: areturn
		// @35: astore_2
		// @36: aload_2
		// @37: new java.lang.StringBuilder
		// @3A: dup
		// @3B: invokespecial java.lang.StringBuilder.<init>()void
		// @3E: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @41: bipush 14 (0x0E)
		// @43: aaload
		// @44: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @47: iload_1
		// @48: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @4B: bipush 41 (0x29)
		// @4D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @50: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @53: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @56: athrow
	}
	
	final C_100158_da func_103828_c(int arg0)
	{
		// @00: iload_1
		// @01: sipush -21976 (0xAA28)
		// @04: if_icmpeq @12
		// @07: aconst_null
		// @08: checkcast game.C_100302_ka
		// @0B: putstatic game.C_100302_ka game.C_100019_wl.field_103844_b
		// @0E: goto @12
		// @11: athrow
		// @12: aload_0
		// @13: getfield game.C_100158_da game.C_100019_wl.field_103845_c
		// @16: astore_2
		// @17: aload_0
		// @18: getfield game.C_100202_qi game.C_100019_wl.field_103841_g
		// @1B: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @1E: aload_2
		// @1F: if_acmpeq @26
		// @22: goto @2D
		// @25: athrow
		// @26: aload_0
		// @27: aconst_null
		// @28: putfield game.C_100158_da game.C_100019_wl.field_103845_c
		// @2B: aconst_null
		// @2C: areturn
		// @2D: aload_0
		// @2E: aload_2
		// @2F: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @32: putfield game.C_100158_da game.C_100019_wl.field_103845_c
		// @35: aload_2
		// @36: areturn
		// @37: astore_2
		// @38: aload_2
		// @39: new java.lang.StringBuilder
		// @3C: dup
		// @3D: invokespecial java.lang.StringBuilder.<init>()void
		// @40: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @43: bipush 9 (0x09)
		// @45: aaload
		// @46: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @49: iload_1
		// @4A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4D: bipush 41 (0x29)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @55: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @58: athrow
	}
	
	final C_100158_da func_103835_a(int arg0, C_100158_da arg1)
	{
		// @00: aconst_null
		// @01: aload_2
		// @02: if_acmpeq @0D
		// @05: aload_2
		// @06: astore_3
		// @07: getstatic int game.SteelSentinels.field_105275_O
		// @0A: ifeq @18
		// @0D: aload_0
		// @0E: getfield game.C_100202_qi game.C_100019_wl.field_103841_g
		// @11: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @14: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @17: astore_3
		// @18: aload_0
		// @19: getfield game.C_100202_qi game.C_100019_wl.field_103841_g
		// @1C: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @1F: aload_3
		// @20: if_acmpeq @27
		// @23: goto @2E
		// @26: athrow
		// @27: aload_0
		// @28: aconst_null
		// @29: putfield game.C_100158_da game.C_100019_wl.field_103845_c
		// @2C: aconst_null
		// @2D: areturn
		// @2E: iload_1
		// @2F: bipush -112 (0x90)
		// @31: if_icmple @39
		// @34: aconst_null
		// @35: checkcast game.C_100158_da
		// @38: areturn
		// @39: aload_0
		// @3A: aload_3
		// @3B: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @3E: putfield game.C_100158_da game.C_100019_wl.field_103845_c
		// @41: aload_3
		// @42: areturn
		// @43: astore_3
		// @44: aload_3
		// @45: new java.lang.StringBuilder
		// @48: dup
		// @49: invokespecial java.lang.StringBuilder.<init>()void
		// @4C: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @4F: bipush 13 (0x0D)
		// @51: aaload
		// @52: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @55: iload_1
		// @56: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @59: bipush 44 (0x2C)
		// @5B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5E: aload_2
		// @5F: ifnull @6B
		// @62: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @65: iconst_3
		// @66: aaload
		// @67: goto @70
		// @6A: athrow
		// @6B: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @6E: iconst_1
		// @6F: aaload
		// @70: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @73: bipush 41 (0x29)
		// @75: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @78: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7E: athrow
	}
	
	final C_100158_da func_103839_b(int arg0, C_100158_da arg1)
	{
		// @00: aload_2
		// @01: ifnonnull @15
		// @04: aload_0
		// @05: getfield game.C_100202_qi game.C_100019_wl.field_103841_g
		// @08: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @0B: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @0E: astore_3
		// @0F: getstatic int game.SteelSentinels.field_105275_O
		// @12: ifeq @17
		// @15: aload_2
		// @16: astore_3
		// @17: aload_0
		// @18: getfield game.C_100202_qi game.C_100019_wl.field_103841_g
		// @1B: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @1E: aload_3
		// @1F: if_acmpne @29
		// @22: aload_0
		// @23: aconst_null
		// @24: putfield game.C_100158_da game.C_100019_wl.field_103845_c
		// @27: aconst_null
		// @28: areturn
		// @29: aload_0
		// @2A: aload_3
		// @2B: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @2E: putfield game.C_100158_da game.C_100019_wl.field_103845_c
		// @31: iload_1
		// @32: ldc -1221466785 (0xb731e55f)
		// @34: if_icmpeq @3C
		// @37: aconst_null
		// @38: checkcast game.C_100158_da
		// @3B: areturn
		// @3C: aload_3
		// @3D: areturn
		// @3E: astore_3
		// @3F: aload_3
		// @40: new java.lang.StringBuilder
		// @43: dup
		// @44: invokespecial java.lang.StringBuilder.<init>()void
		// @47: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @4A: bipush 6 (0x06)
		// @4C: aaload
		// @4D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @50: iload_1
		// @51: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @54: bipush 44 (0x2C)
		// @56: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @59: aload_2
		// @5A: ifnull @66
		// @5D: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @60: iconst_3
		// @61: aaload
		// @62: goto @6B
		// @65: athrow
		// @66: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @69: iconst_1
		// @6A: aaload
		// @6B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6E: bipush 41 (0x29)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @76: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @79: athrow
	}
	
	static final int func_103826_a(int arg0, int arg1, int arg2)
	{
		// @00: iload_2
		// @01: iconst_m1
		// @02: iadd
		// @03: iload_0
		// @04: ldc -1221466785 (0xb731e55f)
		// @06: ishr
		// @07: iand
		// @08: istore_3
		// @09: iload_1
		// @0A: bipush 49 (0x31)
		// @0C: if_icmpgt @12
		// @0F: bipush -36 (0xDC)
		// @11: ireturn
		// @12: iload_3
		// @13: iload_0
		// @14: iload_0
		// @15: ldc -1795046081 (0x9501c53f)
		// @17: iushr
		// @18: iadd
		// @19: iload_2
		// @1A: irem
		// @1B: iadd
		// @1C: ireturn
		// @1D: astore_3
		// @1E: aload_3
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @29: iconst_0
		// @2A: aaload
		// @2B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2E: iload_0
		// @2F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @32: bipush 44 (0x2C)
		// @34: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @37: iload_1
		// @38: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3B: bipush 44 (0x2C)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: iload_2
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 41 (0x29)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4F: athrow
	}
	
	final C_100158_da func_103827_a(byte arg0)
	{
		// @00: iload_1
		// @01: bipush -128 (0x80)
		// @03: if_icmpeq @11
		// @06: aload_0
		// @07: bipush 24 (0x18)
		// @09: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @0C: pop
		// @0D: goto @11
		// @10: athrow
		// @11: aload_0
		// @12: getfield game.C_100202_qi game.C_100019_wl.field_103841_g
		// @15: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @18: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @1B: astore_2
		// @1C: aload_2
		// @1D: aload_0
		// @1E: getfield game.C_100202_qi game.C_100019_wl.field_103841_g
		// @21: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @24: if_acmpne @2E
		// @27: aload_0
		// @28: aconst_null
		// @29: putfield game.C_100158_da game.C_100019_wl.field_103845_c
		// @2C: aconst_null
		// @2D: areturn
		// @2E: aload_0
		// @2F: aload_2
		// @30: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @33: putfield game.C_100158_da game.C_100019_wl.field_103845_c
		// @36: aload_2
		// @37: areturn
		// @38: astore_2
		// @39: aload_2
		// @3A: new java.lang.StringBuilder
		// @3D: dup
		// @3E: invokespecial java.lang.StringBuilder.<init>()void
		// @41: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @44: bipush 12 (0x0C)
		// @46: aaload
		// @47: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4A: iload_1
		// @4B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4E: bipush 41 (0x29)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @56: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @59: athrow
	}
	
	final C_100158_da func_103836_b(int arg0)
	{
		// @00: aload_0
		// @01: getfield game.C_100158_da game.C_100019_wl.field_103845_c
		// @04: astore_2
		// @05: aload_2
		// @06: aload_0
		// @07: getfield game.C_100202_qi game.C_100019_wl.field_103841_g
		// @0A: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @0D: if_acmpeq @14
		// @10: goto @1B
		// @13: athrow
		// @14: aload_0
		// @15: aconst_null
		// @16: putfield game.C_100158_da game.C_100019_wl.field_103845_c
		// @19: aconst_null
		// @1A: areturn
		// @1B: aload_0
		// @1C: aload_2
		// @1D: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @20: putfield game.C_100158_da game.C_100019_wl.field_103845_c
		// @23: iload_1
		// @24: sipush -30820 (0x879C)
		// @27: if_icmpeq @36
		// @2A: aload_0
		// @2B: aconst_null
		// @2C: checkcast game.C_100158_da
		// @2F: putfield game.C_100158_da game.C_100019_wl.field_103845_c
		// @32: goto @36
		// @35: athrow
		// @36: aload_2
		// @37: areturn
		// @38: astore_2
		// @39: aload_2
		// @3A: new java.lang.StringBuilder
		// @3D: dup
		// @3E: invokespecial java.lang.StringBuilder.<init>()void
		// @41: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @44: bipush 8 (0x08)
		// @46: aaload
		// @47: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4A: iload_1
		// @4B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4E: bipush 41 (0x29)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @56: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @59: athrow
	}
	
	static final void func_103829_a(C_100117_p arg0, int arg1)
	{
		// @00: getstatic game.C_100026_hb game.C_100059_df.field_101599_L
		// @03: aload_0
		// @04: invokevirtual game.C_100026_hb.func_100925_a(game.C_100261_md)void
		// @07: iload_1
		// @08: bipush 36 (0x24)
		// @0A: if_icmpeq @16
		// @0D: aconst_null
		// @0E: checkcast game.C_100117_p
		// @11: bipush 40 (0x28)
		// @13: invokestatic game.C_100019_wl.func_103829_a(game.C_100117_p, int)void
		// @16: goto @54
		// @19: astore_2
		// @1A: aload_2
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @25: iconst_4
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: aload_0
		// @2B: ifnull @37
		// @2E: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @31: iconst_3
		// @32: aaload
		// @33: goto @3C
		// @36: athrow
		// @37: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @3A: iconst_1
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: bipush 44 (0x2C)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: iload_1
		// @45: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @48: bipush 41 (0x29)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @50: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @53: athrow
		// @54: return
	}
	
	static final int func_103832_a(boolean arg0)
	{
		// @00: iload_0
		// @01: ifeq @0C
		// @04: iconst_0
		// @05: invokestatic game.C_100019_wl.func_103838_c(boolean)void
		// @08: goto @0C
		// @0B: athrow
		// @0C: getstatic int game.C_100089_fa.field_103728_c
		// @0F: ireturn
		// @10: astore_1
		// @11: aload_1
		// @12: new java.lang.StringBuilder
		// @15: dup
		// @16: invokespecial java.lang.StringBuilder.<init>()void
		// @19: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @1C: bipush 10 (0x0A)
		// @1E: aaload
		// @1F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @22: iload_0
		// @23: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @26: bipush 41 (0x29)
		// @28: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @31: athrow
	}
	
	C_100019_wl(C_100202_qi arg0)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: aload_1
		// @06: putfield game.C_100202_qi game.C_100019_wl.field_103841_g
		// @09: goto @3E
		// @0C: astore_2
		// @0D: aload_2
		// @0E: new java.lang.StringBuilder
		// @11: dup
		// @12: invokespecial java.lang.StringBuilder.<init>()void
		// @15: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @18: iconst_5
		// @19: aaload
		// @1A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D: aload_1
		// @1E: ifnull @2A
		// @21: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @24: iconst_3
		// @25: aaload
		// @26: goto @2F
		// @29: athrow
		// @2A: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @2D: iconst_1
		// @2E: aaload
		// @2F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @32: bipush 41 (0x29)
		// @34: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @37: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3D: athrow
		// @3E: return
	}
	
	static final int func_103833_a(int arg0)
	{
		// @00: iconst_0
		// @01: anewarray game.C_100049_vf
		// @04: astore_1
		// @05: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @08: getstatic int game.C_100200_ba.field_105852_c
		// @0B: bipush -123 (0x85)
		// @0D: aload_1
		// @0E: invokevirtual game.C_100327_ib.func_102462_a(int, int, game.C_100049_vf[])game.C_100049_vf[]
		// @11: astore_1
		// @12: iload_0
		// @13: ldc -1221466785 (0xb731e55f)
		// @15: if_icmpeq @23
		// @18: aconst_null
		// @19: checkcast game.C_100302_ka
		// @1C: putstatic game.C_100302_ka game.C_100019_wl.field_103844_b
		// @1F: goto @23
		// @22: athrow
		// @23: bipush 36 (0x24)
		// @25: aload_1
		// @26: arraylength
		// @27: imul
		// @28: ireturn
		// @29: astore_1
		// @2A: aload_1
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @35: bipush 11 (0x0B)
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_0
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 41 (0x29)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @47: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4A: athrow
	}
	
	static
	{
		// @00: bipush 15 (0x0F)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "oavy4"
		// @09: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "vx4_"
		// @14: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @17: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "oavw4"
		// @1F: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @22: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "c#v\u001da"
		// @2A: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "oavr4"
		// @35: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @38: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "oav\u000fuvd,\r4"
		// @40: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @43: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "oavp4"
		// @4C: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "oavu4"
		// @58: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "oavz4"
		// @64: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @67: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "oavx4"
		// @70: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @73: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "oavv4"
		// @7C: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "oav{4"
		// @88: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @8E: aastore
		// @8F: dup
		// @90: bipush 12 (0x0C)
		// @92: ldc "oavt4"
		// @94: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @97: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @9A: aastore
		// @9B: dup
		// @9C: bipush 13 (0x0D)
		// @9E: ldc "oavq4"
		// @A0: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @A3: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @A6: aastore
		// @A7: dup
		// @A8: bipush 14 (0x0E)
		// @AA: ldc "oav\u007f4"
		// @AC: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @AF: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @B2: aastore
		// @B3: putstatic java.lang.String[] game.C_100019_wl.field_103847_z
		// @B6: ldc "Tb9Wuvjx@smc<\u0013y~k=Phk"
		// @B8: invokestatic game.C_100019_wl.func_103831_z(java.lang.String)char[]
		// @BB: invokestatic game.C_100019_wl.func_103830_z(char[])java.lang.String
		// @BE: putstatic java.lang.String game.C_100019_wl.field_103843_e
		// @C1: return
	}
	
	private static char[] func_103831_z(String arg0)
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
		// @0E: bipush 28 (0x1C)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103830_z(char[] arg0)
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
		// @30: bipush 24 (0x18)
		// @32: goto @46
		// @35: bipush 13 (0x0D)
		// @37: goto @46
		// @3A: bipush 88 (0x58)
		// @3C: goto @46
		// @3F: bipush 51 (0x33)
		// @41: goto @46
		// @44: bipush 28 (0x1C)
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
