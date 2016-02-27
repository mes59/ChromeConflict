package game;

final class C_100202_qi
{
	static C_100100_i field_105913_f;
	static boolean field_105917_c;
	static int[] field_105916_b;
	static int field_105918_a;
	C_100158_da field_105915_e;
	private C_100158_da field_105914_d;
	private static final String[] field_105919_z;
	
	final C_100158_da func_105906_b(int arg0)
	{
		// @00: bipush -51 (0xCD)
		// @02: bipush -12 (0xF4)
		// @04: iload_1
		// @05: isub
		// @06: bipush 51 (0x33)
		// @08: idiv
		// @09: irem
		// @0A: istore_3
		// @0B: aload_0
		// @0C: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @0F: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @12: astore_2
		// @13: aload_2
		// @14: aload_0
		// @15: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @18: if_acmpeq @1F
		// @1B: goto @26
		// @1E: athrow
		// @1F: aload_0
		// @20: aconst_null
		// @21: putfield game.C_100158_da game.C_100202_qi.field_105914_d
		// @24: aconst_null
		// @25: areturn
		// @26: aload_0
		// @27: aload_2
		// @28: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @2B: putfield game.C_100158_da game.C_100202_qi.field_105914_d
		// @2E: aload_2
		// @2F: areturn
		// @30: astore_2
		// @31: aload_2
		// @32: new java.lang.StringBuilder
		// @35: dup
		// @36: invokespecial java.lang.StringBuilder.<init>()void
		// @39: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @3C: bipush 15 (0x0F)
		// @3E: aaload
		// @3F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @42: iload_1
		// @43: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @46: bipush 41 (0x29)
		// @48: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @51: athrow
	}
	
	final C_100158_da func_105908_a(int arg0)
	{
		// @00: aload_0
		// @01: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @04: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @07: astore_2
		// @08: iload_1
		// @09: ldc 37091 (0x90e3)
		// @0B: if_icmpeq @19
		// @0E: aload_0
		// @0F: bipush 16 (0x10)
		// @11: invokevirtual game.C_100202_qi.func_105896_e(int)game.C_100158_da
		// @14: pop
		// @15: goto @19
		// @18: athrow
		// @19: aload_0
		// @1A: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @1D: aload_2
		// @1E: if_acmpne @23
		// @21: aconst_null
		// @22: areturn
		// @23: aload_2
		// @24: iload_1
		// @25: ldc -37046 (0xffff6f4a)
		// @27: iadd
		// @28: invokevirtual game.C_100158_da.func_100583_c(int)void
		// @2B: aload_2
		// @2C: areturn
		// @2D: astore_2
		// @2E: aload_2
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @39: bipush 8 (0x08)
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: iload_1
		// @40: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @43: bipush 41 (0x29)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4E: athrow
	}
	
	private final void func_105897_a(C_100158_da arg0, C_100202_qi arg1, int arg2)
	{
		// @00: aload_0
		// @01: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @04: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @07: astore #4
		// @09: aload_0
		// @0A: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @0D: aload_1
		// @0E: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @11: putfield game.C_100158_da game.C_100158_da.field_100599_i
		// @14: aload_1
		// @15: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @18: aload_0
		// @19: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @1C: putfield game.C_100158_da game.C_100158_da.field_100590_f
		// @1F: aload_0
		// @20: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @23: aload_1
		// @24: if_acmpne @2B
		// @27: goto @50
		// @2A: athrow
		// @2B: aload_1
		// @2C: aload_2
		// @2D: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @30: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @33: putfield game.C_100158_da game.C_100158_da.field_100599_i
		// @36: aload_1
		// @37: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @3A: aload_1
		// @3B: putfield game.C_100158_da game.C_100158_da.field_100590_f
		// @3E: aload_2
		// @3F: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @42: aload #4
		// @44: putfield game.C_100158_da game.C_100158_da.field_100599_i
		// @47: aload #4
		// @49: aload_2
		// @4A: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @4D: putfield game.C_100158_da game.C_100158_da.field_100590_f
		// @50: iload_3
		// @51: sipush 19194 (0x4AFA)
		// @54: if_icmpeq @5F
		// @57: iconst_1
		// @58: putstatic boolean game.C_100202_qi.field_105917_c
		// @5B: goto @5F
		// @5E: athrow
		// @5F: goto @BC
		// @62: astore #4
		// @64: aload #4
		// @66: new java.lang.StringBuilder
		// @69: dup
		// @6A: invokespecial java.lang.StringBuilder.<init>()void
		// @6D: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @70: bipush 18 (0x12)
		// @72: aaload
		// @73: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @76: aload_1
		// @77: ifnull @83
		// @7A: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @7D: iconst_5
		// @7E: aaload
		// @7F: goto @89
		// @82: athrow
		// @83: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @86: bipush 6 (0x06)
		// @88: aaload
		// @89: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8C: bipush 44 (0x2C)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: aload_2
		// @92: ifnull @9E
		// @95: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @98: iconst_5
		// @99: aaload
		// @9A: goto @A4
		// @9D: athrow
		// @9E: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @A1: bipush 6 (0x06)
		// @A3: aaload
		// @A4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A7: bipush 44 (0x2C)
		// @A9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AC: iload_3
		// @AD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B0: bipush 41 (0x29)
		// @B2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @BB: athrow
		// @BC: return
	}
	
	final C_100158_da func_105896_e(int arg0)
	{
		// @00: aload_0
		// @01: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @04: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @07: astore_2
		// @08: aload_2
		// @09: aload_0
		// @0A: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @0D: if_acmpeq @14
		// @10: goto @16
		// @13: athrow
		// @14: aconst_null
		// @15: areturn
		// @16: aload_2
		// @17: bipush 45 (0x2D)
		// @19: invokevirtual game.C_100158_da.func_100583_c(int)void
		// @1C: iload_1
		// @1D: sipush -28022 (0x928A)
		// @20: if_icmpeq @2B
		// @23: iconst_1
		// @24: putstatic int game.C_100202_qi.field_105918_a
		// @27: goto @2B
		// @2A: athrow
		// @2B: aload_2
		// @2C: areturn
		// @2D: astore_2
		// @2E: aload_2
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @39: iconst_2
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: iload_1
		// @3F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @42: bipush 41 (0x29)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4D: athrow
	}
	
	final void func_105901_a(int arg0, C_100158_da arg1)
	{
		// @00: iload_1
		// @01: bipush 122 (0x7A)
		// @03: if_icmpgt @07
		// @06: return
		// @07: aconst_null
		// @08: aload_2
		// @09: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @0C: if_acmpeq @19
		// @0F: aload_2
		// @10: bipush 45 (0x2D)
		// @12: invokevirtual game.C_100158_da.func_100583_c(int)void
		// @15: goto @19
		// @18: athrow
		// @19: aload_2
		// @1A: aload_0
		// @1B: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @1E: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @21: putfield game.C_100158_da game.C_100158_da.field_100599_i
		// @24: aload_2
		// @25: aload_0
		// @26: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @29: putfield game.C_100158_da game.C_100158_da.field_100590_f
		// @2C: aload_2
		// @2D: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @30: aload_2
		// @31: putfield game.C_100158_da game.C_100158_da.field_100590_f
		// @34: aload_2
		// @35: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @38: aload_2
		// @39: putfield game.C_100158_da game.C_100158_da.field_100599_i
		// @3C: goto @7C
		// @3F: astore_3
		// @40: aload_3
		// @41: new java.lang.StringBuilder
		// @44: dup
		// @45: invokespecial java.lang.StringBuilder.<init>()void
		// @48: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @4B: bipush 9 (0x09)
		// @4D: aaload
		// @4E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @51: iload_1
		// @52: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @55: bipush 44 (0x2C)
		// @57: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5A: aload_2
		// @5B: ifnull @67
		// @5E: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @61: iconst_5
		// @62: aaload
		// @63: goto @6D
		// @66: athrow
		// @67: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @6A: bipush 6 (0x06)
		// @6C: aaload
		// @6D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @70: bipush 41 (0x29)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @78: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7B: athrow
		// @7C: return
	}
	
	final C_100158_da func_105898_a(byte arg0)
	{
		// @00: aload_0
		// @01: getfield game.C_100158_da game.C_100202_qi.field_105914_d
		// @04: astore_2
		// @05: bipush -51 (0xCD)
		// @07: bipush 21 (0x15)
		// @09: iload_1
		// @0A: isub
		// @0B: bipush 50 (0x32)
		// @0D: idiv
		// @0E: idiv
		// @0F: istore_3
		// @10: aload_2
		// @11: aload_0
		// @12: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @15: if_acmpne @1F
		// @18: aload_0
		// @19: aconst_null
		// @1A: putfield game.C_100158_da game.C_100202_qi.field_105914_d
		// @1D: aconst_null
		// @1E: areturn
		// @1F: aload_0
		// @20: aload_2
		// @21: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @24: putfield game.C_100158_da game.C_100202_qi.field_105914_d
		// @27: aload_2
		// @28: areturn
		// @29: astore_2
		// @2A: aload_2
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @35: bipush 13 (0x0D)
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_1
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 41 (0x29)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @47: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4A: athrow
	}
	
	final void func_105902_a(boolean arg0, C_100202_qi arg1)
	{
		// @00: iload_1
		// @01: ifeq @05
		// @04: return
		// @05: aload_0
		// @06: aload_0
		// @07: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @0A: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @0D: aload_2
		// @0E: sipush 19194 (0x4AFA)
		// @11: invokespecial game.C_100202_qi.func_105897_a(game.C_100158_da, game.C_100202_qi, int)void
		// @14: goto @54
		// @17: astore_3
		// @18: aload_3
		// @19: new java.lang.StringBuilder
		// @1C: dup
		// @1D: invokespecial java.lang.StringBuilder.<init>()void
		// @20: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @23: bipush 17 (0x11)
		// @25: aaload
		// @26: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @29: iload_1
		// @2A: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @2D: bipush 44 (0x2C)
		// @2F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @32: aload_2
		// @33: ifnull @3F
		// @36: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @39: iconst_5
		// @3A: aaload
		// @3B: goto @45
		// @3E: athrow
		// @3F: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @42: bipush 6 (0x06)
		// @44: aaload
		// @45: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @48: bipush 41 (0x29)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @50: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @53: athrow
		// @54: return
	}
	
	final int func_105912_d(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iconst_0
		// @06: istore_2
		// @07: aload_0
		// @08: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @0B: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @0E: astore_3
		// @0F: iload_1
		// @10: sipush -14829 (0xC613)
		// @13: if_icmpeq @19
		// @16: bipush 79 (0x4F)
		// @18: ireturn
		// @19: aload_3
		// @1A: aload_0
		// @1B: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @1E: if_acmpeq @2E
		// @21: iinc #2 +1
		// @24: aload_3
		// @25: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @28: astore_3
		// @29: iload #4
		// @2B: ifeq @19
		// @2E: iload_2
		// @2F: ireturn
		// @30: astore_2
		// @31: aload_2
		// @32: new java.lang.StringBuilder
		// @35: dup
		// @36: invokespecial java.lang.StringBuilder.<init>()void
		// @39: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @3C: bipush 10 (0x0A)
		// @3E: aaload
		// @3F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @42: iload_1
		// @43: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @46: bipush 41 (0x29)
		// @48: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @51: athrow
	}
	
	final C_100158_da func_105907_c(byte arg0)
	{
		// @00: aload_0
		// @01: getfield game.C_100158_da game.C_100202_qi.field_105914_d
		// @04: astore_2
		// @05: aload_0
		// @06: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @09: aload_2
		// @0A: if_acmpeq @11
		// @0D: goto @18
		// @10: athrow
		// @11: aload_0
		// @12: aconst_null
		// @13: putfield game.C_100158_da game.C_100202_qi.field_105914_d
		// @16: aconst_null
		// @17: areturn
		// @18: iload_1
		// @19: bipush 21 (0x15)
		// @1B: if_icmpgt @23
		// @1E: aconst_null
		// @1F: checkcast game.C_100158_da
		// @22: areturn
		// @23: aload_0
		// @24: aload_2
		// @25: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @28: putfield game.C_100158_da game.C_100202_qi.field_105914_d
		// @2B: aload_2
		// @2C: areturn
		// @2D: astore_2
		// @2E: aload_2
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @39: iconst_3
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: iload_1
		// @3F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @42: bipush 41 (0x29)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4D: athrow
	}
	
	final C_100158_da func_105899_c(int arg0)
	{
		// @00: aload_0
		// @01: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @04: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @07: astore_2
		// @08: aload_0
		// @09: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @0C: aload_2
		// @0D: if_acmpne @17
		// @10: aload_0
		// @11: aconst_null
		// @12: putfield game.C_100158_da game.C_100202_qi.field_105914_d
		// @15: aconst_null
		// @16: areturn
		// @17: aload_0
		// @18: aload_2
		// @19: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @1C: putfield game.C_100158_da game.C_100202_qi.field_105914_d
		// @1F: iload_1
		// @20: bipush 9 (0x09)
		// @22: if_icmpge @2A
		// @25: aconst_null
		// @26: checkcast game.C_100158_da
		// @29: areturn
		// @2A: aload_2
		// @2B: areturn
		// @2C: astore_2
		// @2D: aload_2
		// @2E: new java.lang.StringBuilder
		// @31: dup
		// @32: invokespecial java.lang.StringBuilder.<init>()void
		// @35: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @38: bipush 7 (0x07)
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: iload_1
		// @3F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @42: bipush 41 (0x29)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4D: athrow
	}
	
	final C_100158_da func_105909_a(byte arg0, C_100158_da arg1)
	{
		// @00: aload_2
		// @01: ifnonnull @12
		// @04: aload_0
		// @05: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @08: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @0B: astore_3
		// @0C: getstatic int game.SteelSentinels.field_105275_O
		// @0F: ifeq @14
		// @12: aload_2
		// @13: astore_3
		// @14: aload_0
		// @15: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @18: aload_3
		// @19: if_acmpne @23
		// @1C: aload_0
		// @1D: aconst_null
		// @1E: putfield game.C_100158_da game.C_100202_qi.field_105914_d
		// @21: aconst_null
		// @22: areturn
		// @23: iload_1
		// @24: bipush 8 (0x08)
		// @26: if_icmpeq @2E
		// @29: aconst_null
		// @2A: checkcast game.C_100158_da
		// @2D: areturn
		// @2E: aload_0
		// @2F: aload_3
		// @30: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @33: putfield game.C_100158_da game.C_100202_qi.field_105914_d
		// @36: aload_3
		// @37: areturn
		// @38: astore_3
		// @39: aload_3
		// @3A: new java.lang.StringBuilder
		// @3D: dup
		// @3E: invokespecial java.lang.StringBuilder.<init>()void
		// @41: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @44: iconst_4
		// @45: aaload
		// @46: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @49: iload_1
		// @4A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4D: bipush 44 (0x2C)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: aload_2
		// @53: ifnull @5F
		// @56: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @59: iconst_5
		// @5A: aaload
		// @5B: goto @65
		// @5E: athrow
		// @5F: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @62: bipush 6 (0x06)
		// @64: aaload
		// @65: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @68: bipush 41 (0x29)
		// @6A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @70: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @73: athrow
	}
	
	final void func_105903_b(int arg0, C_100158_da arg1)
	{
		// @00: aload_2
		// @01: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @04: ifnull @11
		// @07: aload_2
		// @08: bipush 45 (0x2D)
		// @0A: invokevirtual game.C_100158_da.func_100583_c(int)void
		// @0D: goto @11
		// @10: athrow
		// @11: aload_2
		// @12: aload_0
		// @13: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @16: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @19: putfield game.C_100158_da game.C_100158_da.field_100590_f
		// @1C: aload_2
		// @1D: aload_0
		// @1E: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @21: putfield game.C_100158_da game.C_100158_da.field_100599_i
		// @24: aload_2
		// @25: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @28: aload_2
		// @29: putfield game.C_100158_da game.C_100158_da.field_100590_f
		// @2C: aload_2
		// @2D: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @30: aload_2
		// @31: putfield game.C_100158_da game.C_100158_da.field_100599_i
		// @34: iload_1
		// @35: sipush 15828 (0x3DD4)
		// @38: if_icmpeq @46
		// @3B: aload_0
		// @3C: bipush 54 (0x36)
		// @3E: invokevirtual game.C_100202_qi.func_105896_e(int)game.C_100158_da
		// @41: pop
		// @42: goto @46
		// @45: athrow
		// @46: goto @86
		// @49: astore_3
		// @4A: aload_3
		// @4B: new java.lang.StringBuilder
		// @4E: dup
		// @4F: invokespecial java.lang.StringBuilder.<init>()void
		// @52: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @55: bipush 12 (0x0C)
		// @57: aaload
		// @58: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5B: iload_1
		// @5C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5F: bipush 44 (0x2C)
		// @61: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @64: aload_2
		// @65: ifnull @71
		// @68: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @6B: iconst_5
		// @6C: aaload
		// @6D: goto @77
		// @70: athrow
		// @71: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @74: bipush 6 (0x06)
		// @76: aaload
		// @77: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7A: bipush 41 (0x29)
		// @7C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @82: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @85: athrow
		// @86: return
	}
	
	final boolean func_105895_d(byte arg0)
	{
		// @00: iload_1
		// @01: bipush 43 (0x2B)
		// @03: if_icmpgt @08
		// @06: iconst_1
		// @07: ireturn
		// @08: aload_0
		// @09: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @0C: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @0F: aload_0
		// @10: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @13: if_acmpne @1B
		// @16: iconst_1
		// @17: goto @1C
		// @1A: athrow
		// @1B: iconst_0
		// @1C: ireturn
		// @1D: astore_2
		// @1E: aload_2
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @29: bipush 11 (0x0B)
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_1
		// @30: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @33: bipush 41 (0x29)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3E: athrow
	}
	
	static final void func_105911_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, C_100037_wb arg7)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #19
		// @005: getstatic int game.C_100196_rb.field_105827_i
		// @008: iload_2
		// @009: if_icmple @01B
		// @00C: iload #5
		// @00E: iload_2
		// @00F: ineg
		// @010: getstatic int game.C_100196_rb.field_105827_i
		// @013: iadd
		// @014: isub
		// @015: istore #5
		// @017: getstatic int game.C_100196_rb.field_105827_i
		// @01A: istore_2
		// @01B: getstatic int game.C_100196_rb.field_105820_b
		// @01E: iload #5
		// @020: iload_2
		// @021: iadd
		// @022: if_icmplt @029
		// @025: goto @030
		// @028: athrow
		// @029: getstatic int game.C_100196_rb.field_105820_b
		// @02C: iload_2
		// @02D: isub
		// @02E: istore #5
		// @030: iload_0
		// @031: getstatic int game.C_100196_rb.field_105816_f
		// @034: if_icmplt @03B
		// @037: goto @048
		// @03A: athrow
		// @03B: iload_3
		// @03C: iload_0
		// @03D: ineg
		// @03E: getstatic int game.C_100196_rb.field_105816_f
		// @041: iadd
		// @042: isub
		// @043: istore_3
		// @044: getstatic int game.C_100196_rb.field_105816_f
		// @047: istore_0
		// @048: getstatic int game.C_100196_rb.field_105823_l
		// @04B: iconst_m1
		// @04C: ixor
		// @04D: iload_3
		// @04E: iload_0
		// @04F: iadd
		// @050: iconst_m1
		// @051: ixor
		// @052: if_icmple @05C
		// @055: getstatic int game.C_100196_rb.field_105823_l
		// @058: iload_0
		// @059: ineg
		// @05A: iadd
		// @05B: istore_3
		// @05C: iload #5
		// @05E: ifle @06C
		// @061: iconst_m1
		// @062: iload_3
		// @063: iconst_m1
		// @064: ixor
		// @065: if_icmpgt @06D
		// @068: goto @06C
		// @06B: athrow
		// @06C: return
		// @06D: aload #7
		// @06F: invokevirtual game.C_100037_wb.func_102381_e()game.C_100037_wb
		// @072: astore #8
		// @074: getstatic int[] game.C_100196_rb.field_105818_d
		// @077: astore #9
		// @079: getstatic int game.C_100196_rb.field_105819_e
		// @07C: istore #10
		// @07E: getstatic int game.C_100196_rb.field_105821_c
		// @081: istore #11
		// @083: iconst_4
		// @084: newarray int[]
		// @086: astore #12
		// @088: aload #12
		// @08A: invokestatic game.C_100196_rb.func_105801_a(int[])void
		// @08D: aload #7
		// @08F: invokevirtual game.C_100037_wb.func_102379_d()void
		// @092: aload #12
		// @094: iconst_0
		// @095: iaload
		// @096: aload #12
		// @098: iconst_1
		// @099: iaload
		// @09A: aload #12
		// @09C: iconst_2
		// @09D: iaload
		// @09E: aload #12
		// @0A0: iconst_3
		// @0A1: iaload
		// @0A2: invokestatic game.C_100196_rb.func_105779_e(int, int, int, int)void
		// @0A5: iload_0
		// @0A6: aload #7
		// @0A8: getfield int game.C_100037_wb.field_102339_s
		// @0AB: imul
		// @0AC: iload_2
		// @0AD: iadd
		// @0AE: istore #13
		// @0B0: iload #5
		// @0B2: ineg
		// @0B3: aload #7
		// @0B5: getfield int game.C_100037_wb.field_102339_s
		// @0B8: iadd
		// @0B9: istore #14
		// @0BB: aload #8
		// @0BD: getfield int[] game.C_100037_wb.field_102388_J
		// @0C0: astore #15
		// @0C2: iload_0
		// @0C3: istore #16
		// @0C5: iload #16
		// @0C7: iconst_m1
		// @0C8: ixor
		// @0C9: iload_3
		// @0CA: iload_0
		// @0CB: ineg
		// @0CC: isub
		// @0CD: iconst_m1
		// @0CE: ixor
		// @0CF: if_icmple @1AB
		// @0D2: iload_2
		// @0D3: iload #19
		// @0D5: ifne @1BE
		// @0D8: istore #17
		// @0DA: iload #17
		// @0DC: iconst_m1
		// @0DD: ixor
		// @0DE: iload #5
		// @0E0: iload_2
		// @0E1: iadd
		// @0E2: iconst_m1
		// @0E3: ixor
		// @0E4: if_icmple @19C
		// @0E7: aload #15
		// @0E9: iload #13
		// @0EB: iaload
		// @0EC: istore #18
		// @0EE: iconst_m1
		// @0EF: iload #18
		// @0F1: iconst_m1
		// @0F2: ixor
		// @0F3: iload #19
		// @0F5: ifne @1A0
		// @0F8: if_icmpeq @191
		// @0FB: goto @0FF
		// @0FE: athrow
		// @0FF: iconst_m1
		// @100: iload #17
		// @102: iconst_m1
		// @103: ixor
		// @104: if_icmple @11A
		// @107: goto @10B
		// @10A: athrow
		// @10B: iconst_0
		// @10C: aload #15
		// @10E: iload #13
		// @110: iconst_1
		// @111: isub
		// @112: iaload
		// @113: if_icmpeq @187
		// @116: goto @11A
		// @119: athrow
		// @11A: iload #16
		// @11C: ifle @137
		// @11F: goto @123
		// @122: athrow
		// @123: iconst_0
		// @124: aload #15
		// @126: aload #7
		// @128: getfield int game.C_100037_wb.field_102339_s
		// @12B: ineg
		// @12C: iload #13
		// @12E: iadd
		// @12F: iaload
		// @130: if_icmpeq @187
		// @133: goto @137
		// @136: athrow
		// @137: iconst_m1
		// @138: aload #7
		// @13A: getfield int game.C_100037_wb.field_102339_s
		// @13D: iadd
		// @13E: iconst_m1
		// @13F: ixor
		// @140: iload #17
		// @142: iconst_m1
		// @143: ixor
		// @144: if_icmpge @15A
		// @147: goto @14B
		// @14A: athrow
		// @14B: iconst_0
		// @14C: aload #15
		// @14E: iload #13
		// @150: iconst_m1
		// @151: isub
		// @152: iaload
		// @153: if_icmpeq @187
		// @156: goto @15A
		// @159: athrow
		// @15A: iload #16
		// @15C: iconst_m1
		// @15D: ixor
		// @15E: iconst_m1
		// @15F: aload #7
		// @161: getfield int game.C_100037_wb.field_102337_u
		// @164: iadd
		// @165: iconst_m1
		// @166: ixor
		// @167: if_icmple @191
		// @16A: goto @16E
		// @16D: athrow
		// @16E: aload #15
		// @170: aload #7
		// @172: getfield int game.C_100037_wb.field_102339_s
		// @175: iload #13
		// @177: iadd
		// @178: iaload
		// @179: iconst_m1
		// @17A: ixor
		// @17B: iconst_m1
		// @17C: if_icmpeq @187
		// @17F: goto @183
		// @182: athrow
		// @183: goto @191
		// @186: athrow
		// @187: iload #17
		// @189: iload #16
		// @18B: iload_1
		// @18C: iload #4
		// @18E: invokestatic game.C_100196_rb.func_105795_d(int, int, int, int)void
		// @191: iinc #13 +1
		// @194: iinc #17 +1
		// @197: iload #19
		// @199: ifeq @0DA
		// @19C: iload #13
		// @19E: iload #14
		// @1A0: iadd
		// @1A1: istore #13
		// @1A3: iinc #16 +1
		// @1A6: iload #19
		// @1A8: ifeq @0C5
		// @1AB: aload #8
		// @1AD: aload #7
		// @1AF: getfield int game.C_100037_wb.field_102335_w
		// @1B2: ineg
		// @1B3: aload #7
		// @1B5: getfield int game.C_100037_wb.field_102332_H
		// @1B8: ineg
		// @1B9: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @1BC: iload #6
		// @1BE: ldc 38642 (0x96f2)
		// @1C0: if_icmpeq @1C4
		// @1C3: return
		// @1C4: aload #9
		// @1C6: iload #10
		// @1C8: iload #11
		// @1CA: invokestatic game.C_100196_rb.func_105808_a(int[], int, int)void
		// @1CD: aload #12
		// @1CF: invokestatic game.C_100196_rb.func_105777_b(int[])void
		// @1D2: goto @24E
		// @1D5: astore #8
		// @1D7: aload #8
		// @1D9: new java.lang.StringBuilder
		// @1DC: dup
		// @1DD: invokespecial java.lang.StringBuilder.<init>()void
		// @1E0: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @1E3: bipush 16 (0x10)
		// @1E5: aaload
		// @1E6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1E9: iload_0
		// @1EA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1ED: bipush 44 (0x2C)
		// @1EF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F2: iload_1
		// @1F3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1F6: bipush 44 (0x2C)
		// @1F8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1FB: iload_2
		// @1FC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1FF: bipush 44 (0x2C)
		// @201: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @204: iload_3
		// @205: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @208: bipush 44 (0x2C)
		// @20A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @20D: iload #4
		// @20F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @212: bipush 44 (0x2C)
		// @214: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @217: iload #5
		// @219: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @21C: bipush 44 (0x2C)
		// @21E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @221: iload #6
		// @223: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @226: bipush 44 (0x2C)
		// @228: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @22B: aload #7
		// @22D: ifnull @239
		// @230: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @233: iconst_5
		// @234: aaload
		// @235: goto @23F
		// @238: athrow
		// @239: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @23C: bipush 6 (0x06)
		// @23E: aaload
		// @23F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @242: bipush 41 (0x29)
		// @244: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @247: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @24A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @24D: athrow
		// @24E: return
	}
	
	final void func_105905_b(byte arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: bipush 17 (0x11)
		// @07: bipush -23 (0xE9)
		// @09: iload_1
		// @0A: isub
		// @0B: bipush 52 (0x34)
		// @0D: idiv
		// @0E: idiv
		// @0F: istore_2
		// @10: aload_0
		// @11: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @14: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @17: astore_3
		// @18: aload_3
		// @19: aload_0
		// @1A: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @1D: if_acmpne @2E
		// @20: iload #4
		// @22: ifne @38
		// @25: iload #4
		// @27: ifeq @3D
		// @2A: goto @2E
		// @2D: athrow
		// @2E: aload_3
		// @2F: bipush 45 (0x2D)
		// @31: invokevirtual game.C_100158_da.func_100583_c(int)void
		// @34: goto @38
		// @37: athrow
		// @38: iload #4
		// @3A: ifeq @10
		// @3D: aload_0
		// @3E: aconst_null
		// @3F: putfield game.C_100158_da game.C_100202_qi.field_105914_d
		// @42: goto @66
		// @45: astore_2
		// @46: aload_2
		// @47: new java.lang.StringBuilder
		// @4A: dup
		// @4B: invokespecial java.lang.StringBuilder.<init>()void
		// @4E: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @51: iconst_0
		// @52: aaload
		// @53: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @56: iload_1
		// @57: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5A: bipush 41 (0x29)
		// @5C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @62: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @65: athrow
		// @66: return
	}
	
	public static void func_105910_f(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic int[] game.C_100202_qi.field_105916_b
		// @04: aconst_null
		// @05: putstatic game.C_100100_i game.C_100202_qi.field_105913_f
		// @08: iload_0
		// @09: sipush -31728 (0x8410)
		// @0C: if_icmpeq @14
		// @0F: bipush 55 (0x37)
		// @11: invokestatic game.C_100202_qi.func_105910_f(int)void
		// @14: goto @39
		// @17: astore_1
		// @18: aload_1
		// @19: new java.lang.StringBuilder
		// @1C: dup
		// @1D: invokespecial java.lang.StringBuilder.<init>()void
		// @20: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @23: bipush 14 (0x0E)
		// @25: aaload
		// @26: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @29: iload_0
		// @2A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2D: bipush 41 (0x29)
		// @2F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @32: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @35: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @38: athrow
		// @39: return
	}
	
	public C_100202_qi()
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: new game.C_100158_da
		// @08: dup
		// @09: invokespecial game.C_100158_da.<init>()void
		// @0C: putfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @0F: aload_0
		// @10: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @13: aload_0
		// @14: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @17: putfield game.C_100158_da game.C_100158_da.field_100590_f
		// @1A: aload_0
		// @1B: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @1E: aload_0
		// @1F: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @22: putfield game.C_100158_da game.C_100158_da.field_100599_i
		// @25: goto @33
		// @28: astore_1
		// @29: aload_1
		// @2A: getstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @2D: iconst_1
		// @2E: aaload
		// @2F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @32: athrow
		// @33: return
	}
	
	static
	{
		// @000: bipush 19 (0x13)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "?H+@^"
		// @009: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "?H+3\u001f Hq1^g"
		// @014: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @017: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "?H+E^"
		// @01F: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @022: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "?H+L^"
		// @02A: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "?H+J^"
		// @035: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @038: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "5\u000f+!\u000b"
		// @040: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @043: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc " Tic"
		// @04C: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "?H+N^"
		// @058: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "?H+K^"
		// @064: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @067: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "?H+C^"
		// @070: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @073: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "?H+F^"
		// @07C: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "?H+_^"
		// @088: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "?H+D^"
		// @094: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @097: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "?H+A^"
		// @0A0: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "?H+H^"
		// @0AC: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: dup
		// @0B4: bipush 15 (0x0F)
		// @0B6: ldc "?H+I^"
		// @0B8: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: ldc "?H+B^"
		// @0C4: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @0C7: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 17 (0x11)
		// @0CE: ldc "?H+M^"
		// @0D0: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @0D3: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 18 (0x12)
		// @0DA: ldc "?H+G^"
		// @0DC: invokestatic game.C_100202_qi.func_105904_z(java.lang.String)char[]
		// @0DF: invokestatic game.C_100202_qi.func_105900_z(char[])java.lang.String
		// @0E2: aastore
		// @0E3: putstatic java.lang.String[] game.C_100202_qi.field_105919_z
		// @0E6: iconst_0
		// @0E7: putstatic boolean game.C_100202_qi.field_105917_c
		// @0EA: sipush 256 (0x0100)
		// @0ED: newarray int[]
		// @0EF: dup
		// @0F0: iconst_0
		// @0F1: iconst_0
		// @0F2: iastore
		// @0F3: dup
		// @0F4: iconst_1
		// @0F5: sipush 4096 (0x1000)
		// @0F8: iastore
		// @0F9: dup
		// @0FA: iconst_2
		// @0FB: sipush 5793 (0x16A1)
		// @0FE: iastore
		// @0FF: dup
		// @100: iconst_3
		// @101: sipush 7094 (0x1BB6)
		// @104: iastore
		// @105: dup
		// @106: iconst_4
		// @107: sipush 8192 (0x2000)
		// @10A: iastore
		// @10B: dup
		// @10C: iconst_5
		// @10D: sipush 9159 (0x23C7)
		// @110: iastore
		// @111: dup
		// @112: bipush 6 (0x06)
		// @114: sipush 10033 (0x2731)
		// @117: iastore
		// @118: dup
		// @119: bipush 7 (0x07)
		// @11B: sipush 10837 (0x2A55)
		// @11E: iastore
		// @11F: dup
		// @120: bipush 8 (0x08)
		// @122: sipush 11585 (0x2D41)
		// @125: iastore
		// @126: dup
		// @127: bipush 9 (0x09)
		// @129: sipush 12288 (0x3000)
		// @12C: iastore
		// @12D: dup
		// @12E: bipush 10 (0x0A)
		// @130: sipush 12953 (0x3299)
		// @133: iastore
		// @134: dup
		// @135: bipush 11 (0x0B)
		// @137: sipush 13585 (0x3511)
		// @13A: iastore
		// @13B: dup
		// @13C: bipush 12 (0x0C)
		// @13E: sipush 14189 (0x376D)
		// @141: iastore
		// @142: dup
		// @143: bipush 13 (0x0D)
		// @145: sipush 14768 (0x39B0)
		// @148: iastore
		// @149: dup
		// @14A: bipush 14 (0x0E)
		// @14C: sipush 15326 (0x3BDE)
		// @14F: iastore
		// @150: dup
		// @151: bipush 15 (0x0F)
		// @153: sipush 15864 (0x3DF8)
		// @156: iastore
		// @157: dup
		// @158: bipush 16 (0x10)
		// @15A: sipush 16384 (0x4000)
		// @15D: iastore
		// @15E: dup
		// @15F: bipush 17 (0x11)
		// @161: sipush 16888 (0x41F8)
		// @164: iastore
		// @165: dup
		// @166: bipush 18 (0x12)
		// @168: sipush 17378 (0x43E2)
		// @16B: iastore
		// @16C: dup
		// @16D: bipush 19 (0x13)
		// @16F: sipush 17854 (0x45BE)
		// @172: iastore
		// @173: dup
		// @174: bipush 20 (0x14)
		// @176: sipush 18318 (0x478E)
		// @179: iastore
		// @17A: dup
		// @17B: bipush 21 (0x15)
		// @17D: sipush 18770 (0x4952)
		// @180: iastore
		// @181: dup
		// @182: bipush 22 (0x16)
		// @184: sipush 19212 (0x4B0C)
		// @187: iastore
		// @188: dup
		// @189: bipush 23 (0x17)
		// @18B: sipush 19644 (0x4CBC)
		// @18E: iastore
		// @18F: dup
		// @190: bipush 24 (0x18)
		// @192: sipush 20066 (0x4E62)
		// @195: iastore
		// @196: dup
		// @197: bipush 25 (0x19)
		// @199: sipush 20480 (0x5000)
		// @19C: iastore
		// @19D: dup
		// @19E: bipush 26 (0x1A)
		// @1A0: sipush 20886 (0x5196)
		// @1A3: iastore
		// @1A4: dup
		// @1A5: bipush 27 (0x1B)
		// @1A7: sipush 21283 (0x5323)
		// @1AA: iastore
		// @1AB: dup
		// @1AC: bipush 28 (0x1C)
		// @1AE: sipush 21674 (0x54AA)
		// @1B1: iastore
		// @1B2: dup
		// @1B3: bipush 29 (0x1D)
		// @1B5: sipush 22058 (0x562A)
		// @1B8: iastore
		// @1B9: dup
		// @1BA: bipush 30 (0x1E)
		// @1BC: sipush 22435 (0x57A3)
		// @1BF: iastore
		// @1C0: dup
		// @1C1: bipush 31 (0x1F)
		// @1C3: sipush 22806 (0x5916)
		// @1C6: iastore
		// @1C7: dup
		// @1C8: bipush 32 (0x20)
		// @1CA: sipush 23170 (0x5A82)
		// @1CD: iastore
		// @1CE: dup
		// @1CF: bipush 33 (0x21)
		// @1D1: sipush 23530 (0x5BEA)
		// @1D4: iastore
		// @1D5: dup
		// @1D6: bipush 34 (0x22)
		// @1D8: sipush 23884 (0x5D4C)
		// @1DB: iastore
		// @1DC: dup
		// @1DD: bipush 35 (0x23)
		// @1DF: sipush 24232 (0x5EA8)
		// @1E2: iastore
		// @1E3: dup
		// @1E4: bipush 36 (0x24)
		// @1E6: sipush 24576 (0x6000)
		// @1E9: iastore
		// @1EA: dup
		// @1EB: bipush 37 (0x25)
		// @1ED: sipush 24915 (0x6153)
		// @1F0: iastore
		// @1F1: dup
		// @1F2: bipush 38 (0x26)
		// @1F4: sipush 25249 (0x62A1)
		// @1F7: iastore
		// @1F8: dup
		// @1F9: bipush 39 (0x27)
		// @1FB: sipush 25580 (0x63EC)
		// @1FE: iastore
		// @1FF: dup
		// @200: bipush 40 (0x28)
		// @202: sipush 25905 (0x6531)
		// @205: iastore
		// @206: dup
		// @207: bipush 41 (0x29)
		// @209: sipush 26227 (0x6673)
		// @20C: iastore
		// @20D: dup
		// @20E: bipush 42 (0x2A)
		// @210: sipush 26545 (0x67B1)
		// @213: iastore
		// @214: dup
		// @215: bipush 43 (0x2B)
		// @217: sipush 26859 (0x68EB)
		// @21A: iastore
		// @21B: dup
		// @21C: bipush 44 (0x2C)
		// @21E: sipush 27170 (0x6A22)
		// @221: iastore
		// @222: dup
		// @223: bipush 45 (0x2D)
		// @225: sipush 27477 (0x6B55)
		// @228: iastore
		// @229: dup
		// @22A: bipush 46 (0x2E)
		// @22C: sipush 27780 (0x6C84)
		// @22F: iastore
		// @230: dup
		// @231: bipush 47 (0x2F)
		// @233: sipush 28081 (0x6DB1)
		// @236: iastore
		// @237: dup
		// @238: bipush 48 (0x30)
		// @23A: sipush 28378 (0x6EDA)
		// @23D: iastore
		// @23E: dup
		// @23F: bipush 49 (0x31)
		// @241: sipush 28672 (0x7000)
		// @244: iastore
		// @245: dup
		// @246: bipush 50 (0x32)
		// @248: sipush 28963 (0x7123)
		// @24B: iastore
		// @24C: dup
		// @24D: bipush 51 (0x33)
		// @24F: sipush 29251 (0x7243)
		// @252: iastore
		// @253: dup
		// @254: bipush 52 (0x34)
		// @256: sipush 29537 (0x7361)
		// @259: iastore
		// @25A: dup
		// @25B: bipush 53 (0x35)
		// @25D: sipush 29819 (0x747B)
		// @260: iastore
		// @261: dup
		// @262: bipush 54 (0x36)
		// @264: sipush 30099 (0x7593)
		// @267: iastore
		// @268: dup
		// @269: bipush 55 (0x37)
		// @26B: sipush 30377 (0x76A9)
		// @26E: iastore
		// @26F: dup
		// @270: bipush 56 (0x38)
		// @272: sipush 30652 (0x77BC)
		// @275: iastore
		// @276: dup
		// @277: bipush 57 (0x39)
		// @279: sipush 30924 (0x78CC)
		// @27C: iastore
		// @27D: dup
		// @27E: bipush 58 (0x3A)
		// @280: sipush 31194 (0x79DA)
		// @283: iastore
		// @284: dup
		// @285: bipush 59 (0x3B)
		// @287: sipush 31462 (0x7AE6)
		// @28A: iastore
		// @28B: dup
		// @28C: bipush 60 (0x3C)
		// @28E: sipush 31727 (0x7BEF)
		// @291: iastore
		// @292: dup
		// @293: bipush 61 (0x3D)
		// @295: sipush 31991 (0x7CF7)
		// @298: iastore
		// @299: dup
		// @29A: bipush 62 (0x3E)
		// @29C: sipush 32252 (0x7DFC)
		// @29F: iastore
		// @2A0: dup
		// @2A1: bipush 63 (0x3F)
		// @2A3: sipush 32511 (0x7EFF)
		// @2A6: iastore
		// @2A7: dup
		// @2A8: bipush 64 (0x40)
		// @2AA: ldc 32768 (0x8000)
		// @2AC: iastore
		// @2AD: dup
		// @2AE: bipush 65 (0x41)
		// @2B0: ldc 33023 (0x80ff)
		// @2B2: iastore
		// @2B3: dup
		// @2B4: bipush 66 (0x42)
		// @2B6: ldc 33276 (0x81fc)
		// @2B8: iastore
		// @2B9: dup
		// @2BA: bipush 67 (0x43)
		// @2BC: ldc 33527 (0x82f7)
		// @2BE: iastore
		// @2BF: dup
		// @2C0: bipush 68 (0x44)
		// @2C2: ldc 33776 (0x83f0)
		// @2C4: iastore
		// @2C5: dup
		// @2C6: bipush 69 (0x45)
		// @2C8: ldc 34024 (0x84e8)
		// @2CA: iastore
		// @2CB: dup
		// @2CC: bipush 70 (0x46)
		// @2CE: ldc 34270 (0x85de)
		// @2D0: iastore
		// @2D1: dup
		// @2D2: bipush 71 (0x47)
		// @2D4: ldc 34514 (0x86d2)
		// @2D6: iastore
		// @2D7: dup
		// @2D8: bipush 72 (0x48)
		// @2DA: ldc 34756 (0x87c4)
		// @2DC: iastore
		// @2DD: dup
		// @2DE: bipush 73 (0x49)
		// @2E0: ldc 34996 (0x88b4)
		// @2E2: iastore
		// @2E3: dup
		// @2E4: bipush 74 (0x4A)
		// @2E6: ldc 35235 (0x89a3)
		// @2E8: iastore
		// @2E9: dup
		// @2EA: bipush 75 (0x4B)
		// @2EC: ldc 35472 (0x8a90)
		// @2EE: iastore
		// @2EF: dup
		// @2F0: bipush 76 (0x4C)
		// @2F2: ldc 35708 (0x8b7c)
		// @2F4: iastore
		// @2F5: dup
		// @2F6: bipush 77 (0x4D)
		// @2F8: ldc 35942 (0x8c66)
		// @2FA: iastore
		// @2FB: dup
		// @2FC: bipush 78 (0x4E)
		// @2FE: ldc 36175 (0x8d4f)
		// @300: iastore
		// @301: dup
		// @302: bipush 79 (0x4F)
		// @304: ldc 36406 (0x8e36)
		// @306: iastore
		// @307: dup
		// @308: bipush 80 (0x50)
		// @30A: ldc 36636 (0x8f1c)
		// @30C: iastore
		// @30D: dup
		// @30E: bipush 81 (0x51)
		// @310: ldc 36864 (0x9000)
		// @312: iastore
		// @313: dup
		// @314: bipush 82 (0x52)
		// @316: ldc 37091 (0x90e3)
		// @318: iastore
		// @319: dup
		// @31A: bipush 83 (0x53)
		// @31C: ldc 37316 (0x91c4)
		// @31E: iastore
		// @31F: dup
		// @320: bipush 84 (0x54)
		// @322: ldc 37540 (0x92a4)
		// @324: iastore
		// @325: dup
		// @326: bipush 85 (0x55)
		// @328: ldc 37763 (0x9383)
		// @32A: iastore
		// @32B: dup
		// @32C: bipush 86 (0x56)
		// @32E: ldc 37985 (0x9461)
		// @330: iastore
		// @331: dup
		// @332: bipush 87 (0x57)
		// @334: ldc 38205 (0x953d)
		// @336: iastore
		// @337: dup
		// @338: bipush 88 (0x58)
		// @33A: ldc 38424 (0x9618)
		// @33C: iastore
		// @33D: dup
		// @33E: bipush 89 (0x59)
		// @340: ldc 38642 (0x96f2)
		// @342: iastore
		// @343: dup
		// @344: bipush 90 (0x5A)
		// @346: ldc 38858 (0x97ca)
		// @348: iastore
		// @349: dup
		// @34A: bipush 91 (0x5B)
		// @34C: ldc 39073 (0x98a1)
		// @34E: iastore
		// @34F: dup
		// @350: bipush 92 (0x5C)
		// @352: ldc 39287 (0x9977)
		// @354: iastore
		// @355: dup
		// @356: bipush 93 (0x5D)
		// @358: ldc 39500 (0x9a4c)
		// @35A: iastore
		// @35B: dup
		// @35C: bipush 94 (0x5E)
		// @35E: ldc 39712 (0x9b20)
		// @360: iastore
		// @361: dup
		// @362: bipush 95 (0x5F)
		// @364: ldc 39923 (0x9bf3)
		// @366: iastore
		// @367: dup
		// @368: bipush 96 (0x60)
		// @36A: ldc 40132 (0x9cc4)
		// @36C: iastore
		// @36D: dup
		// @36E: bipush 97 (0x61)
		// @370: ldc 40341 (0x9d95)
		// @372: iastore
		// @373: dup
		// @374: bipush 98 (0x62)
		// @376: ldc 40548 (0x9e64)
		// @378: iastore
		// @379: dup
		// @37A: bipush 99 (0x63)
		// @37C: ldc 40755 (0x9f33)
		// @37E: iastore
		// @37F: dup
		// @380: bipush 100 (0x64)
		// @382: ldc 40960 (0xa000)
		// @384: iastore
		// @385: dup
		// @386: bipush 101 (0x65)
		// @388: ldc 41164 (0xa0cc)
		// @38A: iastore
		// @38B: dup
		// @38C: bipush 102 (0x66)
		// @38E: ldc 41368 (0xa198)
		// @390: iastore
		// @391: dup
		// @392: bipush 103 (0x67)
		// @394: ldc 41570 (0xa262)
		// @396: iastore
		// @397: dup
		// @398: bipush 104 (0x68)
		// @39A: ldc 41771 (0xa32b)
		// @39C: iastore
		// @39D: dup
		// @39E: bipush 105 (0x69)
		// @3A0: ldc 41972 (0xa3f4)
		// @3A2: iastore
		// @3A3: dup
		// @3A4: bipush 106 (0x6A)
		// @3A6: ldc 42171 (0xa4bb)
		// @3A8: iastore
		// @3A9: dup
		// @3AA: bipush 107 (0x6B)
		// @3AC: ldc 42369 (0xa581)
		// @3AE: iastore
		// @3AF: dup
		// @3B0: bipush 108 (0x6C)
		// @3B2: ldc 42567 (0xa647)
		// @3B4: iastore
		// @3B5: dup
		// @3B6: bipush 109 (0x6D)
		// @3B8: ldc 42763 (0xa70b)
		// @3BA: iastore
		// @3BB: dup
		// @3BC: bipush 110 (0x6E)
		// @3BE: ldc 42959 (0xa7cf)
		// @3C0: iastore
		// @3C1: dup
		// @3C2: bipush 111 (0x6F)
		// @3C4: ldc 43154 (0xa892)
		// @3C6: iastore
		// @3C7: dup
		// @3C8: bipush 112 (0x70)
		// @3CA: ldc 43348 (0xa954)
		// @3CC: iastore
		// @3CD: dup
		// @3CE: bipush 113 (0x71)
		// @3D0: ldc 43541 (0xaa15)
		// @3D2: iastore
		// @3D3: dup
		// @3D4: bipush 114 (0x72)
		// @3D6: ldc 43733 (0xaad5)
		// @3D8: iastore
		// @3D9: dup
		// @3DA: bipush 115 (0x73)
		// @3DC: ldc 43925 (0xab95)
		// @3DE: iastore
		// @3DF: dup
		// @3E0: bipush 116 (0x74)
		// @3E2: ldc 44115 (0xac53)
		// @3E4: iastore
		// @3E5: dup
		// @3E6: bipush 117 (0x75)
		// @3E8: ldc 44305 (0xad11)
		// @3EA: iastore
		// @3EB: dup
		// @3EC: bipush 118 (0x76)
		// @3EE: ldc 44494 (0xadce)
		// @3F0: iastore
		// @3F1: dup
		// @3F2: bipush 119 (0x77)
		// @3F4: ldc 44682 (0xae8a)
		// @3F6: iastore
		// @3F7: dup
		// @3F8: bipush 120 (0x78)
		// @3FA: ldc 44869 (0xaf45)
		// @3FC: iastore
		// @3FD: dup
		// @3FE: bipush 121 (0x79)
		// @400: ldc 45056 (0xb000)
		// @402: iastore
		// @403: dup
		// @404: bipush 122 (0x7A)
		// @406: ldc 45242 (0xb0ba)
		// @408: iastore
		// @409: dup
		// @40A: bipush 123 (0x7B)
		// @40C: ldc 45427 (0xb173)
		// @40E: iastore
		// @40F: dup
		// @410: bipush 124 (0x7C)
		// @412: ldc 45611 (0xb22b)
		// @414: iastore
		// @415: dup
		// @416: bipush 125 (0x7D)
		// @418: ldc 45795 (0xb2e3)
		// @41A: iastore
		// @41B: dup
		// @41C: bipush 126 (0x7E)
		// @41E: ldc 45977 (0xb399)
		// @420: iastore
		// @421: dup
		// @422: bipush 127 (0x7F)
		// @424: ldc 46160 (0xb450)
		// @426: iastore
		// @427: dup
		// @428: sipush 128 (0x0080)
		// @42B: ldc 46341 (0xb505)
		// @42D: iastore
		// @42E: dup
		// @42F: sipush 129 (0x0081)
		// @432: ldc 46522 (0xb5ba)
		// @434: iastore
		// @435: dup
		// @436: sipush 130 (0x0082)
		// @439: ldc 46702 (0xb66e)
		// @43B: iastore
		// @43C: dup
		// @43D: sipush 131 (0x0083)
		// @440: ldc 46881 (0xb721)
		// @442: iastore
		// @443: dup
		// @444: sipush 132 (0x0084)
		// @447: ldc 47059 (0xb7d3)
		// @449: iastore
		// @44A: dup
		// @44B: sipush 133 (0x0085)
		// @44E: ldc 47237 (0xb885)
		// @450: iastore
		// @451: dup
		// @452: sipush 134 (0x0086)
		// @455: ldc 47415 (0xb937)
		// @457: iastore
		// @458: dup
		// @459: sipush 135 (0x0087)
		// @45C: ldc 47591 (0xb9e7)
		// @45E: iastore
		// @45F: dup
		// @460: sipush 136 (0x0088)
		// @463: ldc 47767 (0xba97)
		// @465: iastore
		// @466: dup
		// @467: sipush 137 (0x0089)
		// @46A: ldc 47942 (0xbb46)
		// @46C: iastore
		// @46D: dup
		// @46E: sipush 138 (0x008A)
		// @471: ldc 48117 (0xbbf5)
		// @473: iastore
		// @474: dup
		// @475: sipush 139 (0x008B)
		// @478: ldc 48291 (0xbca3)
		// @47A: iastore
		// @47B: dup
		// @47C: sipush 140 (0x008C)
		// @47F: ldc 48465 (0xbd51)
		// @481: iastore
		// @482: dup
		// @483: sipush 141 (0x008D)
		// @486: ldc 48637 (0xbdfd)
		// @488: iastore
		// @489: dup
		// @48A: sipush 142 (0x008E)
		// @48D: ldc 48809 (0xbea9)
		// @48F: iastore
		// @490: dup
		// @491: sipush 143 (0x008F)
		// @494: ldc 48981 (0xbf55)
		// @496: iastore
		// @497: dup
		// @498: sipush 144 (0x0090)
		// @49B: ldc 49152 (0xc000)
		// @49D: iastore
		// @49E: dup
		// @49F: sipush 145 (0x0091)
		// @4A2: ldc 49322 (0xc0aa)
		// @4A4: iastore
		// @4A5: dup
		// @4A6: sipush 146 (0x0092)
		// @4A9: ldc 49492 (0xc154)
		// @4AB: iastore
		// @4AC: dup
		// @4AD: sipush 147 (0x0093)
		// @4B0: ldc 49661 (0xc1fd)
		// @4B2: iastore
		// @4B3: dup
		// @4B4: sipush 148 (0x0094)
		// @4B7: ldc 49830 (0xc2a6)
		// @4B9: iastore
		// @4BA: dup
		// @4BB: sipush 149 (0x0095)
		// @4BE: ldc 49998 (0xc34e)
		// @4C0: iastore
		// @4C1: dup
		// @4C2: sipush 150 (0x0096)
		// @4C5: ldc 50166 (0xc3f6)
		// @4C7: iastore
		// @4C8: dup
		// @4C9: sipush 151 (0x0097)
		// @4CC: ldc 50332 (0xc49c)
		// @4CE: iastore
		// @4CF: dup
		// @4D0: sipush 152 (0x0098)
		// @4D3: ldc 50499 (0xc543)
		// @4D5: iastore
		// @4D6: dup
		// @4D7: sipush 153 (0x0099)
		// @4DA: ldc 50665 (0xc5e9)
		// @4DC: iastore
		// @4DD: dup
		// @4DE: sipush 154 (0x009A)
		// @4E1: ldc 50830 (0xc68e)
		// @4E3: iastore
		// @4E4: dup
		// @4E5: sipush 155 (0x009B)
		// @4E8: ldc 50995 (0xc733)
		// @4EA: iastore
		// @4EB: dup
		// @4EC: sipush 156 (0x009C)
		// @4EF: ldc 51159 (0xc7d7)
		// @4F1: iastore
		// @4F2: dup
		// @4F3: sipush 157 (0x009D)
		// @4F6: ldc 51323 (0xc87b)
		// @4F8: iastore
		// @4F9: dup
		// @4FA: sipush 158 (0x009E)
		// @4FD: ldc 51486 (0xc91e)
		// @4FF: iastore
		// @500: dup
		// @501: sipush 159 (0x009F)
		// @504: ldc 51649 (0xc9c1)
		// @506: iastore
		// @507: dup
		// @508: sipush 160 (0x00A0)
		// @50B: ldc 51811 (0xca63)
		// @50D: iastore
		// @50E: dup
		// @50F: sipush 161 (0x00A1)
		// @512: ldc 51972 (0xcb04)
		// @514: iastore
		// @515: dup
		// @516: sipush 162 (0x00A2)
		// @519: ldc 52134 (0xcba6)
		// @51B: iastore
		// @51C: dup
		// @51D: sipush 163 (0x00A3)
		// @520: ldc 52294 (0xcc46)
		// @522: iastore
		// @523: dup
		// @524: sipush 164 (0x00A4)
		// @527: ldc 52454 (0xcce6)
		// @529: iastore
		// @52A: dup
		// @52B: sipush 165 (0x00A5)
		// @52E: ldc 52614 (0xcd86)
		// @530: iastore
		// @531: dup
		// @532: sipush 166 (0x00A6)
		// @535: ldc 52773 (0xce25)
		// @537: iastore
		// @538: dup
		// @539: sipush 167 (0x00A7)
		// @53C: ldc 52932 (0xcec4)
		// @53E: iastore
		// @53F: dup
		// @540: sipush 168 (0x00A8)
		// @543: ldc 53090 (0xcf62)
		// @545: iastore
		// @546: dup
		// @547: sipush 169 (0x00A9)
		// @54A: ldc 53248 (0xd000)
		// @54C: iastore
		// @54D: dup
		// @54E: sipush 170 (0x00AA)
		// @551: ldc 53405 (0xd09d)
		// @553: iastore
		// @554: dup
		// @555: sipush 171 (0x00AB)
		// @558: ldc 53562 (0xd13a)
		// @55A: iastore
		// @55B: dup
		// @55C: sipush 172 (0x00AC)
		// @55F: ldc 53719 (0xd1d7)
		// @561: iastore
		// @562: dup
		// @563: sipush 173 (0x00AD)
		// @566: ldc 53874 (0xd272)
		// @568: iastore
		// @569: dup
		// @56A: sipush 174 (0x00AE)
		// @56D: ldc 54030 (0xd30e)
		// @56F: iastore
		// @570: dup
		// @571: sipush 175 (0x00AF)
		// @574: ldc 54185 (0xd3a9)
		// @576: iastore
		// @577: dup
		// @578: sipush 176 (0x00B0)
		// @57B: ldc 54340 (0xd444)
		// @57D: iastore
		// @57E: dup
		// @57F: sipush 177 (0x00B1)
		// @582: ldc 54494 (0xd4de)
		// @584: iastore
		// @585: dup
		// @586: sipush 178 (0x00B2)
		// @589: ldc 54647 (0xd577)
		// @58B: iastore
		// @58C: dup
		// @58D: sipush 179 (0x00B3)
		// @590: ldc 54801 (0xd611)
		// @592: iastore
		// @593: dup
		// @594: sipush 180 (0x00B4)
		// @597: ldc 54954 (0xd6aa)
		// @599: iastore
		// @59A: dup
		// @59B: sipush 181 (0x00B5)
		// @59E: ldc 55106 (0xd742)
		// @5A0: iastore
		// @5A1: dup
		// @5A2: sipush 182 (0x00B6)
		// @5A5: ldc 55258 (0xd7da)
		// @5A7: iastore
		// @5A8: dup
		// @5A9: sipush 183 (0x00B7)
		// @5AC: ldc 55410 (0xd872)
		// @5AE: iastore
		// @5AF: dup
		// @5B0: sipush 184 (0x00B8)
		// @5B3: ldc 55561 (0xd909)
		// @5B5: iastore
		// @5B6: dup
		// @5B7: sipush 185 (0x00B9)
		// @5BA: ldc 55712 (0xd9a0)
		// @5BC: iastore
		// @5BD: dup
		// @5BE: sipush 186 (0x00BA)
		// @5C1: ldc 55862 (0xda36)
		// @5C3: iastore
		// @5C4: dup
		// @5C5: sipush 187 (0x00BB)
		// @5C8: ldc 56012 (0xdacc)
		// @5CA: iastore
		// @5CB: dup
		// @5CC: sipush 188 (0x00BC)
		// @5CF: ldc 56162 (0xdb62)
		// @5D1: iastore
		// @5D2: dup
		// @5D3: sipush 189 (0x00BD)
		// @5D6: ldc 56311 (0xdbf7)
		// @5D8: iastore
		// @5D9: dup
		// @5DA: sipush 190 (0x00BE)
		// @5DD: ldc 56459 (0xdc8b)
		// @5DF: iastore
		// @5E0: dup
		// @5E1: sipush 191 (0x00BF)
		// @5E4: ldc 56608 (0xdd20)
		// @5E6: iastore
		// @5E7: dup
		// @5E8: sipush 192 (0x00C0)
		// @5EB: ldc 56756 (0xddb4)
		// @5ED: iastore
		// @5EE: dup
		// @5EF: sipush 193 (0x00C1)
		// @5F2: ldc 56903 (0xde47)
		// @5F4: iastore
		// @5F5: dup
		// @5F6: sipush 194 (0x00C2)
		// @5F9: ldc 57051 (0xdedb)
		// @5FB: iastore
		// @5FC: dup
		// @5FD: sipush 195 (0x00C3)
		// @600: ldc 57198 (0xdf6e)
		// @602: iastore
		// @603: dup
		// @604: sipush 196 (0x00C4)
		// @607: ldc 57344 (0xe000)
		// @609: iastore
		// @60A: dup
		// @60B: sipush 197 (0x00C5)
		// @60E: ldc 57490 (0xe092)
		// @610: iastore
		// @611: dup
		// @612: sipush 198 (0x00C6)
		// @615: ldc 57636 (0xe124)
		// @617: iastore
		// @618: dup
		// @619: sipush 199 (0x00C7)
		// @61C: ldc 57781 (0xe1b5)
		// @61E: iastore
		// @61F: dup
		// @620: sipush 200 (0x00C8)
		// @623: ldc 57926 (0xe246)
		// @625: iastore
		// @626: dup
		// @627: sipush 201 (0x00C9)
		// @62A: ldc 58071 (0xe2d7)
		// @62C: iastore
		// @62D: dup
		// @62E: sipush 202 (0x00CA)
		// @631: ldc 58215 (0xe367)
		// @633: iastore
		// @634: dup
		// @635: sipush 203 (0x00CB)
		// @638: ldc 58359 (0xe3f7)
		// @63A: iastore
		// @63B: dup
		// @63C: sipush 204 (0x00CC)
		// @63F: ldc 58503 (0xe487)
		// @641: iastore
		// @642: dup
		// @643: sipush 205 (0x00CD)
		// @646: ldc 58646 (0xe516)
		// @648: iastore
		// @649: dup
		// @64A: sipush 206 (0x00CE)
		// @64D: ldc 58789 (0xe5a5)
		// @64F: iastore
		// @650: dup
		// @651: sipush 207 (0x00CF)
		// @654: ldc 58931 (0xe633)
		// @656: iastore
		// @657: dup
		// @658: sipush 208 (0x00D0)
		// @65B: ldc 59073 (0xe6c1)
		// @65D: iastore
		// @65E: dup
		// @65F: sipush 209 (0x00D1)
		// @662: ldc 59215 (0xe74f)
		// @664: iastore
		// @665: dup
		// @666: sipush 210 (0x00D2)
		// @669: ldc 59357 (0xe7dd)
		// @66B: iastore
		// @66C: dup
		// @66D: sipush 211 (0x00D3)
		// @670: ldc 59498 (0xe86a)
		// @672: iastore
		// @673: dup
		// @674: sipush 212 (0x00D4)
		// @677: ldc 59639 (0xe8f7)
		// @679: iastore
		// @67A: dup
		// @67B: sipush 213 (0x00D5)
		// @67E: ldc 59779 (0xe983)
		// @680: iastore
		// @681: dup
		// @682: sipush 214 (0x00D6)
		// @685: ldc 59919 (0xea0f)
		// @687: iastore
		// @688: dup
		// @689: sipush 215 (0x00D7)
		// @68C: ldc 60059 (0xea9b)
		// @68E: iastore
		// @68F: dup
		// @690: sipush 216 (0x00D8)
		// @693: ldc 60199 (0xeb27)
		// @695: iastore
		// @696: dup
		// @697: sipush 217 (0x00D9)
		// @69A: ldc 60338 (0xebb2)
		// @69C: iastore
		// @69D: dup
		// @69E: sipush 218 (0x00DA)
		// @6A1: ldc 60477 (0xec3d)
		// @6A3: iastore
		// @6A4: dup
		// @6A5: sipush 219 (0x00DB)
		// @6A8: ldc 60615 (0xecc7)
		// @6AA: iastore
		// @6AB: dup
		// @6AC: sipush 220 (0x00DC)
		// @6AF: ldc 60753 (0xed51)
		// @6B1: iastore
		// @6B2: dup
		// @6B3: sipush 221 (0x00DD)
		// @6B6: ldc 60891 (0xeddb)
		// @6B8: iastore
		// @6B9: dup
		// @6BA: sipush 222 (0x00DE)
		// @6BD: ldc 61029 (0xee65)
		// @6BF: iastore
		// @6C0: dup
		// @6C1: sipush 223 (0x00DF)
		// @6C4: ldc 61166 (0xeeee)
		// @6C6: iastore
		// @6C7: dup
		// @6C8: sipush 224 (0x00E0)
		// @6CB: ldc 61303 (0xef77)
		// @6CD: iastore
		// @6CE: dup
		// @6CF: sipush 225 (0x00E1)
		// @6D2: ldc 61440 (0xf000)
		// @6D4: iastore
		// @6D5: dup
		// @6D6: sipush 226 (0x00E2)
		// @6D9: ldc 61576 (0xf088)
		// @6DB: iastore
		// @6DC: dup
		// @6DD: sipush 227 (0x00E3)
		// @6E0: ldc 61712 (0xf110)
		// @6E2: iastore
		// @6E3: dup
		// @6E4: sipush 228 (0x00E4)
		// @6E7: ldc 61848 (0xf198)
		// @6E9: iastore
		// @6EA: dup
		// @6EB: sipush 229 (0x00E5)
		// @6EE: ldc 61984 (0xf220)
		// @6F0: iastore
		// @6F1: dup
		// @6F2: sipush 230 (0x00E6)
		// @6F5: ldc 62119 (0xf2a7)
		// @6F7: iastore
		// @6F8: dup
		// @6F9: sipush 231 (0x00E7)
		// @6FC: ldc 62254 (0xf32e)
		// @6FE: iastore
		// @6FF: dup
		// @700: sipush 232 (0x00E8)
		// @703: ldc 62388 (0xf3b4)
		// @705: iastore
		// @706: dup
		// @707: sipush 233 (0x00E9)
		// @70A: ldc 62523 (0xf43b)
		// @70C: iastore
		// @70D: dup
		// @70E: sipush 234 (0x00EA)
		// @711: ldc 62657 (0xf4c1)
		// @713: iastore
		// @714: dup
		// @715: sipush 235 (0x00EB)
		// @718: ldc 62790 (0xf546)
		// @71A: iastore
		// @71B: dup
		// @71C: sipush 236 (0x00EC)
		// @71F: ldc 62924 (0xf5cc)
		// @721: iastore
		// @722: dup
		// @723: sipush 237 (0x00ED)
		// @726: ldc 63057 (0xf651)
		// @728: iastore
		// @729: dup
		// @72A: sipush 238 (0x00EE)
		// @72D: ldc 63190 (0xf6d6)
		// @72F: iastore
		// @730: dup
		// @731: sipush 239 (0x00EF)
		// @734: ldc 63323 (0xf75b)
		// @736: iastore
		// @737: dup
		// @738: sipush 240 (0x00F0)
		// @73B: ldc 63455 (0xf7df)
		// @73D: iastore
		// @73E: dup
		// @73F: sipush 241 (0x00F1)
		// @742: ldc 63587 (0xf863)
		// @744: iastore
		// @745: dup
		// @746: sipush 242 (0x00F2)
		// @749: ldc 63719 (0xf8e7)
		// @74B: iastore
		// @74C: dup
		// @74D: sipush 243 (0x00F3)
		// @750: ldc 63850 (0xf96a)
		// @752: iastore
		// @753: dup
		// @754: sipush 244 (0x00F4)
		// @757: ldc 63982 (0xf9ee)
		// @759: iastore
		// @75A: dup
		// @75B: sipush 245 (0x00F5)
		// @75E: ldc 64113 (0xfa71)
		// @760: iastore
		// @761: dup
		// @762: sipush 246 (0x00F6)
		// @765: ldc 64243 (0xfaf3)
		// @767: iastore
		// @768: dup
		// @769: sipush 247 (0x00F7)
		// @76C: ldc 64374 (0xfb76)
		// @76E: iastore
		// @76F: dup
		// @770: sipush 248 (0x00F8)
		// @773: ldc 64504 (0xfbf8)
		// @775: iastore
		// @776: dup
		// @777: sipush 249 (0x00F9)
		// @77A: ldc 64634 (0xfc7a)
		// @77C: iastore
		// @77D: dup
		// @77E: sipush 250 (0x00FA)
		// @781: ldc 64763 (0xfcfb)
		// @783: iastore
		// @784: dup
		// @785: sipush 251 (0x00FB)
		// @788: ldc 64893 (0xfd7d)
		// @78A: iastore
		// @78B: dup
		// @78C: sipush 252 (0x00FC)
		// @78F: ldc 65022 (0xfdfe)
		// @791: iastore
		// @792: dup
		// @793: sipush 253 (0x00FD)
		// @796: ldc 65151 (0xfe7f)
		// @798: iastore
		// @799: dup
		// @79A: sipush 254 (0x00FE)
		// @79D: ldc 65279 (0xfeff)
		// @79F: iastore
		// @7A0: dup
		// @7A1: sipush 255 (0x00FF)
		// @7A4: ldc_w 65408 (0xff80)
		// @7A7: iastore
		// @7A8: putstatic int[] game.C_100202_qi.field_105916_b
		// @7AB: iconst_4
		// @7AC: putstatic int game.C_100202_qi.field_105918_a
		// @7AF: return
	}
	
	private static char[] func_105904_z(String arg0)
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
		// @0E: bipush 118 (0x76)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105900_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @3A, for 3: @3E
		// @30: bipush 78 (0x4E)
		// @32: goto @45
		// @35: bipush 33 (0x21)
		// @37: goto @45
		// @3A: iconst_5
		// @3B: goto @45
		// @3E: bipush 15 (0x0F)
		// @40: goto @45
		// @43: bipush 118 (0x76)
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
