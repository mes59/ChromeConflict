package game;

final class C_100036_gg extends C_100218_am
{
	static int field_103152_Q;
	static C_100302_ka field_103156_O;
	static String field_103153_P;
	static String[] field_103155_R;
	static C_100280_nf field_103151_T;
	static String field_103154_S;
	private static final String[] field_103150_U;
	
	final void func_103101_a(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: iload_1
		// @01: sipush 30483 (0x7713)
		// @04: if_icmpeq @08
		// @07: return
		// @08: aload_0
		// @09: aload_0
		// @0A: getfield boolean game.C_100036_gg.field_103120_K
		// @0D: ifne @15
		// @10: iconst_1
		// @11: goto @16
		// @14: athrow
		// @15: iconst_0
		// @16: putfield boolean game.C_100036_gg.field_103120_K
		// @19: aload_0
		// @1A: iload_1
		// @1B: iconst_0
		// @1C: ixor
		// @1D: iload_2
		// @1E: iload_3
		// @1F: iload #4
		// @21: invokespecial game.C_100218_am.func_103101_a(int, int, int, int)void
		// @24: goto @67
		// @27: astore #5
		// @29: aload #5
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @35: bipush 17 (0x11)
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_1
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 44 (0x2C)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: iload_2
		// @45: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @48: bipush 44 (0x2C)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: iload_3
		// @4E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @51: bipush 44 (0x2C)
		// @53: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56: iload #4
		// @58: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5B: bipush 41 (0x29)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @63: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @66: athrow
		// @67: return
	}
	
	private C_100036_gg(String arg0, C_100326_ic arg1, C_100337_in arg2)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: aload_2
		// @03: aload_3
		// @04: invokespecial game.C_100218_am.<init>(java.lang.String, game.C_100326_ic, game.C_100337_in)void
		// @07: aload_0
		// @08: getstatic game.C_100233_oa game.C_100043_vl.field_101945_cc
		// @0B: getfield game.C_100326_ic game.C_100233_oa.field_106255_t
		// @0E: putfield game.C_100326_ic game.C_100036_gg.field_102533_B
		// @11: goto @7C
		// @14: astore #4
		// @16: aload #4
		// @18: new java.lang.StringBuilder
		// @1B: dup
		// @1C: invokespecial java.lang.StringBuilder.<init>()void
		// @1F: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @22: iconst_5
		// @23: aaload
		// @24: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27: aload_1
		// @28: ifnull @34
		// @2B: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @2E: iconst_2
		// @2F: aaload
		// @30: goto @39
		// @33: athrow
		// @34: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @37: iconst_1
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: bipush 44 (0x2C)
		// @3E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @41: aload_2
		// @42: ifnull @4E
		// @45: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @48: iconst_2
		// @49: aaload
		// @4A: goto @53
		// @4D: athrow
		// @4E: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @51: iconst_1
		// @52: aaload
		// @53: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @56: bipush 44 (0x2C)
		// @58: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B: aload_3
		// @5C: ifnull @68
		// @5F: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @62: iconst_2
		// @63: aaload
		// @64: goto @6D
		// @67: athrow
		// @68: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @6B: iconst_1
		// @6C: aaload
		// @6D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @70: bipush 41 (0x29)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @78: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7B: athrow
		// @7C: return
	}
	
	private C_100036_gg(String arg0, C_100337_in arg1)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: getstatic game.C_100233_oa game.C_100043_vl.field_101945_cc
		// @05: getfield game.C_100326_ic game.C_100233_oa.field_106237_d
		// @08: aload_2
		// @09: invokespecial game.C_100036_gg.<init>(java.lang.String, game.C_100326_ic, game.C_100337_in)void
		// @0C: aload_0
		// @0D: getstatic game.C_100233_oa game.C_100043_vl.field_101945_cc
		// @10: getfield game.C_100326_ic game.C_100233_oa.field_106255_t
		// @13: putfield game.C_100326_ic game.C_100036_gg.field_102533_B
		// @16: goto @65
		// @19: astore_3
		// @1A: aload_3
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @25: iconst_5
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: aload_1
		// @2B: ifnull @37
		// @2E: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @31: iconst_2
		// @32: aaload
		// @33: goto @3C
		// @36: athrow
		// @37: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @3A: iconst_1
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: bipush 44 (0x2C)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: aload_2
		// @45: ifnull @51
		// @48: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @4B: iconst_2
		// @4C: aaload
		// @4D: goto @56
		// @50: athrow
		// @51: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @54: iconst_1
		// @55: aaload
		// @56: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @59: bipush 41 (0x29)
		// @5B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @61: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @64: athrow
		// @65: return
	}
	
	static final C_100037_wb[] func_103143_b(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: iload_3
		// @01: iconst_1
		// @02: if_icmpeq @10
		// @05: aconst_null
		// @06: checkcast game.C_100280_nf
		// @09: putstatic game.C_100280_nf game.C_100036_gg.field_103151_T
		// @0C: goto @10
		// @0F: athrow
		// @10: iload_2
		// @11: iload_1
		// @12: iconst_1
		// @13: iload_0
		// @14: sipush -15493 (0xC37B)
		// @17: invokestatic game.C_100314_lf.func_101259_a(int, int, int, int, int)game.C_100037_wb[]
		// @1A: areturn
		// @1B: astore #4
		// @1D: aload #4
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @29: bipush 16 (0x10)
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_0
		// @30: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @33: bipush 44 (0x2C)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: iload_1
		// @39: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3C: bipush 44 (0x2C)
		// @3E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @41: iload_2
		// @42: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @45: bipush 44 (0x2C)
		// @47: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4A: iload_3
		// @4B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4E: bipush 41 (0x29)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @56: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @59: athrow
	}
	
	static final int func_103144_b(int arg0, int arg1)
	{
		// @00: iload_0
		// @01: bipush 73 (0x49)
		// @03: if_icmpge @09
		// @06: bipush 84 (0x54)
		// @08: ireturn
		// @09: iconst_0
		// @0A: istore_2
		// @0B: bipush 7 (0x07)
		// @0D: iload_1
		// @0E: iand
		// @0F: iconst_m1
		// @10: ixor
		// @11: iconst_m1
		// @12: if_icmpne @19
		// @15: goto @22
		// @18: athrow
		// @19: iload_1
		// @1A: bipush 7 (0x07)
		// @1C: iand
		// @1D: ineg
		// @1E: bipush 8 (0x08)
		// @20: iadd
		// @21: istore_2
		// @22: iload_2
		// @23: iload_1
		// @24: iadd
		// @25: istore_3
		// @26: iload_3
		// @27: ireturn
		// @28: astore_2
		// @29: aload_2
		// @2A: new java.lang.StringBuilder
		// @2D: dup
		// @2E: invokespecial java.lang.StringBuilder.<init>()void
		// @31: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @34: iconst_4
		// @35: aaload
		// @36: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @39: iload_0
		// @3A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3D: bipush 44 (0x2C)
		// @3F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @42: iload_1
		// @43: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @46: bipush 41 (0x29)
		// @48: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @51: athrow
	}
	
	static final void func_103147_k(int arg0)
	{
		// @00: bipush 36 (0x24)
		// @02: invokestatic game.C_100033_gj.func_101901_g(byte)int
		// @05: istore_1
		// @06: iconst_1
		// @07: invokestatic game.C_100244_pe.func_106370_a(boolean)int
		// @0A: istore_2
		// @0B: getstatic game.C_100127_tl game.C_100071_va.field_101666_s
		// @0E: getstatic int game.C_100034_gi.field_104032_c
		// @11: ineg
		// @12: getstatic int game.C_100197_ra.field_100866_s
		// @15: iadd
		// @16: iload_2
		// @17: getstatic int game.C_100165_sh.field_100779_k
		// @1A: ldc 1564235969 (0x5d3c58c1)
		// @1C: ishl
		// @1D: ineg
		// @1E: isub
		// @1F: getstatic int game.C_100165_sh.field_100779_k
		// @22: ineg
		// @23: getstatic int game.C_100078_ul.field_103291_rb
		// @26: iadd
		// @27: bipush 11 (0x0B)
		// @29: iload_1
		// @2A: getstatic int game.C_100034_gi.field_104032_c
		// @2D: ldc 958461473 (0x3920f621)
		// @2F: ishl
		// @30: iadd
		// @31: invokevirtual game.C_100127_tl.func_104944_a(int, int, int, int, int)void
		// @34: ldc 459821604 (0x1b685224)
		// @36: invokestatic game.C_100167_sj.func_100784_e(int)void
		// @39: iload_0
		// @3A: bipush 64 (0x40)
		// @3C: if_icmpeq @4A
		// @3F: aconst_null
		// @40: checkcast game.C_100280_nf
		// @43: putstatic game.C_100280_nf game.C_100036_gg.field_103151_T
		// @46: goto @4A
		// @49: athrow
		// @4A: goto @6E
		// @4D: astore_1
		// @4E: aload_1
		// @4F: new java.lang.StringBuilder
		// @52: dup
		// @53: invokespecial java.lang.StringBuilder.<init>()void
		// @56: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @59: iconst_3
		// @5A: aaload
		// @5B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5E: iload_0
		// @5F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @62: bipush 41 (0x29)
		// @64: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @67: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6D: athrow
		// @6E: return
	}
	
	static final void func_103142_a(int arg0, String arg1, Throwable arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: ldc ""
		// @007: astore_3
		// @008: aload_2
		// @009: ifnull @013
		// @00C: aload_2
		// @00D: bipush -126 (0x82)
		// @00F: invokestatic game.C_100034_gi.func_103992_a(java.lang.Throwable, byte)java.lang.String
		// @012: astore_3
		// @013: aconst_null
		// @014: aload_1
		// @015: if_acmpeq @04F
		// @018: aload_2
		// @019: ifnonnull @024
		// @01C: goto @020
		// @01F: athrow
		// @020: goto @03C
		// @023: athrow
		// @024: new java.lang.StringBuilder
		// @027: dup
		// @028: invokespecial java.lang.StringBuilder.<init>()void
		// @02B: aload_3
		// @02C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @02F: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @032: bipush 7 (0x07)
		// @034: aaload
		// @035: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @038: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @03B: astore_3
		// @03C: new java.lang.StringBuilder
		// @03F: dup
		// @040: invokespecial java.lang.StringBuilder.<init>()void
		// @043: aload_3
		// @044: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @047: aload_1
		// @048: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @04B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @04E: astore_3
		// @04F: bipush -57 (0xC7)
		// @051: aload_3
		// @052: invokestatic game.C_100031_gl.func_103960_a(byte, java.lang.String)void
		// @055: iconst_1
		// @056: aload_3
		// @057: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @05A: bipush 9 (0x09)
		// @05C: aaload
		// @05D: ldc ":"
		// @05F: invokestatic game.C_100263_mb.func_106497_a(int, java.lang.String, java.lang.String, java.lang.String)java.lang.String
		// @062: astore_3
		// @063: iload_0
		// @064: iconst_0
		// @065: ixor
		// @066: aload_3
		// @067: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @06A: bipush 6 (0x06)
		// @06C: aaload
		// @06D: ldc "@"
		// @06F: invokestatic game.C_100263_mb.func_106497_a(int, java.lang.String, java.lang.String, java.lang.String)java.lang.String
		// @072: astore_3
		// @073: iload_0
		// @074: iconst_0
		// @075: ixor
		// @076: aload_3
		// @077: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @07A: bipush 15 (0x0F)
		// @07C: aaload
		// @07D: ldc "&"
		// @07F: invokestatic game.C_100263_mb.func_106497_a(int, java.lang.String, java.lang.String, java.lang.String)java.lang.String
		// @082: astore_3
		// @083: iload_0
		// @084: aload_3
		// @085: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @088: bipush 12 (0x0C)
		// @08A: aaload
		// @08B: ldc "#"
		// @08D: invokestatic game.C_100263_mb.func_106497_a(int, java.lang.String, java.lang.String, java.lang.String)java.lang.String
		// @090: astore_3
		// @091: aconst_null
		// @092: getstatic java.applet.Applet game.C_100254_pi.field_106447_g
		// @095: if_acmpeq @09C
		// @098: goto @09D
		// @09B: athrow
		// @09C: return
		// @09D: getstatic game.C_100201_qj game.C_100158_da.field_100593_e
		// @0A0: new java.net.URL
		// @0A3: dup
		// @0A4: getstatic java.applet.Applet game.C_100254_pi.field_106447_g
		// @0A7: invokevirtual java.applet.Applet.getCodeBase()java.net.URL
		// @0AA: new java.lang.StringBuilder
		// @0AD: dup
		// @0AE: invokespecial java.lang.StringBuilder.<init>()void
		// @0B1: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @0B4: bipush 11 (0x0B)
		// @0B6: aaload
		// @0B7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0BA: getstatic int game.C_100095_fe.field_103386_R
		// @0BD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0C0: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @0C3: bipush 8 (0x08)
		// @0C5: aaload
		// @0C6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0C9: aconst_null
		// @0CA: getstatic java.lang.String game.C_100183_cd.field_103416_T
		// @0CD: if_acmpne @0E9
		// @0D0: new java.lang.StringBuilder
		// @0D3: dup
		// @0D4: invokespecial java.lang.StringBuilder.<init>()void
		// @0D7: ldc ""
		// @0D9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0DC: getstatic long game.C_100057_dd.field_104261_h
		// @0DF: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @0E2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0E5: goto @0EC
		// @0E8: athrow
		// @0E9: getstatic java.lang.String game.C_100183_cd.field_103416_T
		// @0EC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0EF: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @0F2: bipush 14 (0x0E)
		// @0F4: aaload
		// @0F5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F8: getstatic java.lang.String game.C_100201_qj.field_105887_u
		// @0FB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0FE: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @101: bipush 10 (0x0A)
		// @103: aaload
		// @104: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @107: getstatic java.lang.String game.C_100201_qj.field_105886_v
		// @10A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @10D: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @110: bipush 13 (0x0D)
		// @112: aaload
		// @113: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @116: aload_3
		// @117: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @11A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @11D: invokespecial java.net.URL.<init>(java.net.URL, java.lang.String)void
		// @120: sipush 2159 (0x086F)
		// @123: invokevirtual game.C_100201_qj.func_105863_a(java.net.URL, int)game.C_100331_ie
		// @126: astore #4
		// @128: iconst_m1
		// @129: aload #4
		// @12B: getfield int game.C_100331_ie.field_107293_f
		// @12E: iconst_m1
		// @12F: ixor
		// @130: if_icmpne @147
		// @133: lconst_1
		// @134: bipush -123 (0x85)
		// @136: invokestatic game.C_100138_bo.func_100396_a(long, int)void
		// @139: iload #6
		// @13B: ifne @168
		// @13E: iload #6
		// @140: ifeq @128
		// @143: goto @147
		// @146: athrow
		// @147: aload #4
		// @149: getfield int game.C_100331_ie.field_107293_f
		// @14C: iconst_m1
		// @14D: ixor
		// @14E: bipush -2 (0xFE)
		// @150: if_icmpne @168
		// @153: aload #4
		// @155: getfield java.lang.Object game.C_100331_ie.field_107294_g
		// @158: checkcast java.io.DataInputStream
		// @15B: astore #5
		// @15D: aload #5
		// @15F: invokevirtual java.io.DataInputStream.read()int
		// @162: pop
		// @163: aload #5
		// @165: invokevirtual java.io.DataInputStream.close()void
		// @168: goto @16C
		// @16B: astore_3
		// @16C: goto @172
		// @16F: astore_3
		// @170: aload_3
		// @171: athrow
		// @172: return
	}
	
	C_100036_gg(String arg0, C_100337_in arg1, boolean arg2)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: aload_2
		// @03: invokespecial game.C_100036_gg.<init>(java.lang.String, game.C_100337_in)void
		// @06: aload_0
		// @07: iload_3
		// @08: putfield boolean game.C_100036_gg.field_103120_K
		// @0B: goto @65
		// @0E: astore #4
		// @10: aload #4
		// @12: new java.lang.StringBuilder
		// @15: dup
		// @16: invokespecial java.lang.StringBuilder.<init>()void
		// @19: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @1C: iconst_5
		// @1D: aaload
		// @1E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @21: aload_1
		// @22: ifnull @2E
		// @25: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @28: iconst_2
		// @29: aaload
		// @2A: goto @33
		// @2D: athrow
		// @2E: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @31: iconst_1
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: bipush 44 (0x2C)
		// @38: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3B: aload_2
		// @3C: ifnull @48
		// @3F: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @42: iconst_2
		// @43: aaload
		// @44: goto @4D
		// @47: athrow
		// @48: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @4B: iconst_1
		// @4C: aaload
		// @4D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @50: bipush 44 (0x2C)
		// @52: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @55: iload_3
		// @56: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @59: bipush 41 (0x29)
		// @5B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @61: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @64: athrow
		// @65: return
	}
	
	static final void func_103149_a(byte arg0, C_100314_lf arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #12
		// @005: iload #4
		// @007: getstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @00A: getfield int game.C_100185_rm.field_105483_g
		// @00D: imul
		// @00E: istore #6
		// @010: iload #4
		// @012: istore #7
		// @014: iload_0
		// @015: bipush 124 (0x7C)
		// @017: if_icmpeq @025
		// @01A: aconst_null
		// @01B: checkcast java.lang.String
		// @01E: putstatic java.lang.String game.C_100036_gg.field_103153_P
		// @021: goto @025
		// @024: athrow
		// @025: iload #7
		// @027: iconst_m1
		// @028: ixor
		// @029: iload #4
		// @02B: iload_3
		// @02C: iadd
		// @02D: iconst_m1
		// @02E: ixor
		// @02F: if_icmple @103
		// @032: iload #12
		// @034: ifne @169
		// @037: iload #5
		// @039: istore #8
		// @03B: iload_2
		// @03C: iload #5
		// @03E: iadd
		// @03F: iload #8
		// @041: if_icmple @0F0
		// @044: getstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @047: getfield int[] game.C_100185_rm.field_105486_b
		// @04A: iload #8
		// @04C: iload #6
		// @04E: ineg
		// @04F: isub
		// @050: iaload
		// @051: istore #9
		// @053: iload #9
		// @055: ldc -114026264 (0xf93418e8)
		// @057: ishr
		// @058: ldc 65535 (0xffff)
		// @05A: iload #9
		// @05C: iand
		// @05D: iload #12
		// @05F: ifne @0F8
		// @062: if_icmpne @0BA
		// @065: goto @069
		// @068: athrow
		// @069: aload_1
		// @06A: iconst_m1
		// @06B: invokevirtual game.C_100314_lf.func_101253_j(int)int
		// @06E: istore #10
		// @070: iload #9
		// @072: sipush 255 (0x00FF)
		// @075: iand
		// @076: istore #11
		// @078: iload #11
		// @07A: bipush 64 (0x40)
		// @07C: if_icmpgt @083
		// @07F: goto @0B5
		// @082: athrow
		// @083: getstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @086: getfield int[] game.C_100185_rm.field_105486_b
		// @089: iload #6
		// @08B: iload #8
		// @08D: iadd
		// @08E: ldc 16711935 (0xff00ff)
		// @090: iload #10
		// @092: ldc 16711935 (0xff00ff)
		// @094: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @097: iload #11
		// @099: imul
		// @09A: ldc -1628479384 (0x9eef6068)
		// @09C: ishr
		// @09D: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @0A0: ldc 65280 (0xff00)
		// @0A2: iload #10
		// @0A4: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @0A7: iload #11
		// @0A9: imul
		// @0AA: ldc 16711756 (0xff004c)
		// @0AC: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @0AF: ldc -289420824 (0xeebfc9e8)
		// @0B1: ishr
		// @0B2: ineg
		// @0B3: isub
		// @0B4: iastore
		// @0B5: iload #12
		// @0B7: ifeq @0E8
		// @0BA: sipush 255 (0x00FF)
		// @0BD: iload #9
		// @0BF: iand
		// @0C0: istore #10
		// @0C2: iload #10
		// @0C4: iconst_2
		// @0C5: idiv
		// @0C6: istore #10
		// @0C8: bipush -33 (0xDF)
		// @0CA: iload #10
		// @0CC: iconst_m1
		// @0CD: ixor
		// @0CE: if_icmple @0E8
		// @0D1: getstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @0D4: getfield int[] game.C_100185_rm.field_105486_b
		// @0D7: iload #6
		// @0D9: iload #8
		// @0DB: iadd
		// @0DC: iload #10
		// @0DE: aload_1
		// @0DF: getfield int game.C_100314_lf.field_101336_Q
		// @0E2: imul
		// @0E3: iastore
		// @0E4: goto @0E8
		// @0E7: athrow
		// @0E8: iinc #8 +1
		// @0EB: iload #12
		// @0ED: ifeq @03B
		// @0F0: iload #6
		// @0F2: getstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @0F5: getfield int game.C_100185_rm.field_105483_g
		// @0F8: iadd
		// @0F9: istore #6
		// @0FB: iinc #7 +1
		// @0FE: iload #12
		// @100: ifeq @025
		// @103: goto @169
		// @106: astore #6
		// @108: aload #6
		// @10A: new java.lang.StringBuilder
		// @10D: dup
		// @10E: invokespecial java.lang.StringBuilder.<init>()void
		// @111: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @114: iconst_0
		// @115: aaload
		// @116: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @119: iload_0
		// @11A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @11D: bipush 44 (0x2C)
		// @11F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @122: aload_1
		// @123: ifnull @12F
		// @126: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @129: iconst_2
		// @12A: aaload
		// @12B: goto @134
		// @12E: athrow
		// @12F: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @132: iconst_1
		// @133: aaload
		// @134: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @137: bipush 44 (0x2C)
		// @139: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13C: iload_2
		// @13D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @140: bipush 44 (0x2C)
		// @142: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @145: iload_3
		// @146: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @149: bipush 44 (0x2C)
		// @14B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @14E: iload #4
		// @150: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @153: bipush 44 (0x2C)
		// @155: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @158: iload #5
		// @15A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @15D: bipush 41 (0x29)
		// @15F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @162: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @165: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @168: athrow
		// @169: return
	}
	
	public static void func_103148_j(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100280_nf game.C_100036_gg.field_103151_T
		// @04: aconst_null
		// @05: putstatic java.lang.String[] game.C_100036_gg.field_103155_R
		// @08: aconst_null
		// @09: putstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @0C: bipush 68 (0x44)
		// @0E: bipush -30 (0xE2)
		// @10: iload_0
		// @11: isub
		// @12: bipush 49 (0x31)
		// @14: idiv
		// @15: irem
		// @16: istore_1
		// @17: aconst_null
		// @18: putstatic java.lang.String game.C_100036_gg.field_103154_S
		// @1B: aconst_null
		// @1C: putstatic java.lang.String game.C_100036_gg.field_103153_P
		// @1F: goto @44
		// @22: astore_1
		// @23: aload_1
		// @24: new java.lang.StringBuilder
		// @27: dup
		// @28: invokespecial java.lang.StringBuilder.<init>()void
		// @2B: getstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @2E: bipush 18 (0x12)
		// @30: aaload
		// @31: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @34: iload_0
		// @35: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @38: bipush 41 (0x29)
		// @3A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @40: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @43: athrow
		// @44: return
	}
	
	static
	{
		// @000: bipush 19 (0x13)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "\u000c\u0014YkR"
		// @009: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "\u0005\u0006\u001bE"
		// @014: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @017: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "\u0010]Y\u0007\u0007"
		// @01F: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @022: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "\u000c\u0014YlR"
		// @02A: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "\u000c\u0014Y`R"
		// @035: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @038: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "\u000c\u0014Y\u0015\u0013\u0005\u001a\u0003\u0017R"
		// @040: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @043: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "NGG"
		// @04C: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "K\u000fW"
		// @058: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "M\u0006J"
		// @064: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @067: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "N@\u0016"
		// @070: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @073: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "M\u0005E\u0014"
		// @07C: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "\u0008\u001f\u001eL\u0014\u001f\u0016\u0005[\u0015\u0019]\u0000ZE\u0008N"
		// @088: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "NAD"
		// @094: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @097: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "M\u0016J"
		// @0A0: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "M\u0005F\u0014"
		// @0AC: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: dup
		// @0B4: bipush 15 (0x0F)
		// @0B6: ldc "NAA"
		// @0B8: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: ldc "\u000c\u0014YmR"
		// @0C4: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @0C7: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 17 (0x11)
		// @0CE: ldc "\u000c\u0014YnR"
		// @0D0: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @0D3: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 18 (0x12)
		// @0DA: ldc "\u000c\u0014YhR"
		// @0DC: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @0DF: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @0E2: aastore
		// @0E3: putstatic java.lang.String[] game.C_100036_gg.field_103150_U
		// @0E6: iconst_0
		// @0E7: putstatic int game.C_100036_gg.field_103152_Q
		// @0EA: ldc "?\u001cWj\u000f\u0018\u0007\u0018D\u001f\u0019S$\\\n\u001b\u001c\u0005]"
		// @0EC: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @0EF: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @0F2: putstatic java.lang.String game.C_100036_gg.field_103153_P
		// @0F5: aconst_null
		// @0F6: putstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @0F9: ldc ".\u001e\u0016@\u0016K\u001a\u0004\t\u000c\n\u001f\u001eM"
		// @0FB: invokestatic game.C_100036_gg.func_103146_z(java.lang.String)char[]
		// @0FE: invokestatic game.C_100036_gg.func_103145_z(char[])java.lang.String
		// @101: putstatic java.lang.String game.C_100036_gg.field_103154_S
		// @104: return
	}
	
	private static char[] func_103146_z(String arg0)
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
		// @0E: bipush 122 (0x7A)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103145_z(char[] arg0)
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
		// @30: bipush 107 (0x6B)
		// @32: goto @46
		// @35: bipush 115 (0x73)
		// @37: goto @46
		// @3A: bipush 119 (0x77)
		// @3C: goto @46
		// @3F: bipush 41 (0x29)
		// @41: goto @46
		// @44: bipush 122 (0x7A)
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
