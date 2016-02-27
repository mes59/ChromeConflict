package game;

final class C_100162_sc extends C_100085_a implements C_100334_ik
{
	static C_100217_ao field_102861_P;
	private String[] field_102856_U;
	static String[] field_102858_W;
	private C_100218_am[] field_102857_T;
	static int field_102860_Q;
	private C_100276_nb field_102862_S;
	static C_100098_h field_102863_R;
	static String field_102859_V;
	private static final String[] field_102864_X;
	
	static final String func_102849_a(byte arg0, int arg1, CharSequence[] arg2, int arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: iload_1
		// @006: ifne @00C
		// @009: ldc ""
		// @00B: areturn
		// @00C: bipush -2 (0xFE)
		// @00E: iload_1
		// @00F: iconst_m1
		// @010: ixor
		// @011: if_icmpne @02F
		// @014: aload_2
		// @015: iload_3
		// @016: aaload
		// @017: astore #4
		// @019: aconst_null
		// @01A: aload #4
		// @01C: if_acmpeq @023
		// @01F: goto @029
		// @022: athrow
		// @023: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @026: iconst_2
		// @027: aaload
		// @028: areturn
		// @029: aload #4
		// @02B: invokevirtual java.lang.Object.toString()java.lang.String
		// @02E: areturn
		// @02F: bipush 53 (0x35)
		// @031: bipush 28 (0x1C)
		// @033: iload_0
		// @034: isub
		// @035: bipush 42 (0x2A)
		// @037: idiv
		// @038: idiv
		// @039: istore #4
		// @03B: iload_3
		// @03C: iload_1
		// @03D: iadd
		// @03E: istore #5
		// @040: iconst_0
		// @041: istore #6
		// @043: iload_3
		// @044: istore #7
		// @046: iload #5
		// @048: iload #7
		// @04A: if_icmple @078
		// @04D: aload_2
		// @04E: iload #7
		// @050: aaload
		// @051: astore #8
		// @053: aload #8
		// @055: ifnull @069
		// @058: iload #6
		// @05A: aload #8
		// @05C: invokeinterface java.lang.CharSequence.length()int
		// @061: iadd
		// @062: istore #6
		// @064: iload #10
		// @066: ifeq @070
		// @069: iinc #6 +4
		// @06C: goto @070
		// @06F: athrow
		// @070: iinc #7 +1
		// @073: iload #10
		// @075: ifeq @046
		// @078: new java.lang.StringBuilder
		// @07B: dup
		// @07C: iload #6
		// @07E: invokespecial java.lang.StringBuilder.<init>(int)void
		// @081: astore #7
		// @083: iload_3
		// @084: istore #8
		// @086: iload #5
		// @088: iconst_m1
		// @089: ixor
		// @08A: iload #8
		// @08C: iconst_m1
		// @08D: ixor
		// @08E: if_icmpge @0C4
		// @091: aload_2
		// @092: iload #8
		// @094: aaload
		// @095: astore #9
		// @097: aload #9
		// @099: ifnonnull @0B0
		// @09C: aload #7
		// @09E: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @0A1: iconst_2
		// @0A2: aaload
		// @0A3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0A6: pop
		// @0A7: iload #10
		// @0A9: ifeq @0BC
		// @0AC: goto @0B0
		// @0AF: athrow
		// @0B0: aload #7
		// @0B2: aload #9
		// @0B4: invokevirtual java.lang.StringBuilder.append(java.lang.CharSequence)java.lang.StringBuilder
		// @0B7: pop
		// @0B8: goto @0BC
		// @0BB: athrow
		// @0BC: iinc #8 +1
		// @0BF: iload #10
		// @0C1: ifeq @086
		// @0C4: aload #7
		// @0C6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0C9: areturn
		// @0CA: astore #4
		// @0CC: aload #4
		// @0CE: new java.lang.StringBuilder
		// @0D1: dup
		// @0D2: invokespecial java.lang.StringBuilder.<init>()void
		// @0D5: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @0D8: iconst_4
		// @0D9: aaload
		// @0DA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0DD: iload_0
		// @0DE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E1: bipush 44 (0x2C)
		// @0E3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E6: iload_1
		// @0E7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0EA: bipush 44 (0x2C)
		// @0EC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0EF: aload_2
		// @0F0: ifnull @0FC
		// @0F3: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @0F6: iconst_1
		// @0F7: aaload
		// @0F8: goto @101
		// @0FB: athrow
		// @0FC: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @0FF: iconst_2
		// @100: aaload
		// @101: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @104: bipush 44 (0x2C)
		// @106: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @109: iload_3
		// @10A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @10D: bipush 41 (0x29)
		// @10F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @112: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @115: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @118: athrow
	}
	
	static final C_100197_ra func_102848_b(int arg0, byte arg1)
	{
		// @00: new game.C_100197_ra
		// @03: dup
		// @04: invokespecial game.C_100197_ra.<init>()void
		// @07: astore_2
		// @08: iload_1
		// @09: bipush -102 (0x9A)
		// @0B: if_icmpeq @19
		// @0E: aconst_null
		// @0F: checkcast java.lang.String[]
		// @12: putstatic java.lang.String[] game.C_100162_sc.field_102858_W
		// @15: goto @19
		// @18: athrow
		// @19: getstatic game.C_100202_qi game.C_100191_rg.field_100848_j
		// @1C: bipush 127 (0x7F)
		// @1E: aload_2
		// @1F: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @22: iload_0
		// @23: bipush -91 (0xA5)
		// @25: invokestatic game.C_100129_tg.func_102740_b(int, byte)void
		// @28: aload_2
		// @29: areturn
		// @2A: astore_2
		// @2B: aload_2
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @36: bipush 10 (0x0A)
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: iload_0
		// @3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40: bipush 44 (0x2C)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: iload_1
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 41 (0x29)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @51: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @54: athrow
	}
	
	final boolean func_102506_a(char arg0, int arg1, int arg2, C_100336_im arg3)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iload_2
		// @03: iload_3
		// @04: iconst_0
		// @05: iadd
		// @06: aload #4
		// @08: invokespecial game.C_100085_a.func_102506_a(char, int, int, game.C_100336_im)boolean
		// @0B: ifne @12
		// @0E: goto @14
		// @11: athrow
		// @12: iconst_1
		// @13: ireturn
		// @14: iload_3
		// @15: sipush 22545 (0x5811)
		// @18: if_icmpeq @27
		// @1B: aload_0
		// @1C: aconst_null
		// @1D: checkcast java.lang.String[]
		// @20: putfield java.lang.String[] game.C_100162_sc.field_102856_U
		// @23: goto @27
		// @26: athrow
		// @27: bipush 98 (0x62)
		// @29: iload_2
		// @2A: if_icmpne @36
		// @2D: aload_0
		// @2E: aload #4
		// @30: bipush 119 (0x77)
		// @32: invokevirtual game.C_100162_sc.func_102555_a(game.C_100336_im, int)boolean
		// @35: ireturn
		// @36: bipush 99 (0x63)
		// @38: iload_2
		// @39: if_icmpeq @40
		// @3C: goto @4A
		// @3F: athrow
		// @40: aload_0
		// @41: sipush -17543 (0xBB79)
		// @44: aload #4
		// @46: invokevirtual game.C_100162_sc.func_102558_b(int, game.C_100336_im)boolean
		// @49: ireturn
		// @4A: iconst_0
		// @4B: ireturn
		// @4C: astore #5
		// @4E: aload #5
		// @50: new java.lang.StringBuilder
		// @53: dup
		// @54: invokespecial java.lang.StringBuilder.<init>()void
		// @57: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @5A: bipush 11 (0x0B)
		// @5C: aaload
		// @5D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @60: iload_1
		// @61: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @64: bipush 44 (0x2C)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: iload_2
		// @6A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6D: bipush 44 (0x2C)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: iload_3
		// @73: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @76: bipush 44 (0x2C)
		// @78: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7B: aload #4
		// @7D: ifnull @89
		// @80: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @83: iconst_1
		// @84: aaload
		// @85: goto @8E
		// @88: athrow
		// @89: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @8C: iconst_2
		// @8D: aaload
		// @8E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @91: bipush 41 (0x29)
		// @93: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @96: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @99: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9C: athrow
	}
	
	static final int func_102854_k(int arg0)
	{
		// @000: iload_0
		// @001: bipush 80 (0x50)
		// @003: if_icmpeq @00E
		// @006: iconst_1
		// @007: invokestatic game.C_100162_sc.func_102853_a(boolean)void
		// @00A: goto @00E
		// @00D: athrow
		// @00E: getstatic int game.C_100283_ni.field_106760_c
		// @011: iconst_m1
		// @012: ixor
		// @013: bipush -3 (0xFD)
		// @015: if_icmple @01A
		// @018: iconst_0
		// @019: ireturn
		// @01A: iconst_m1
		// @01B: getstatic int game.C_100062_dk.field_104280_g
		// @01E: iconst_m1
		// @01F: ixor
		// @020: if_icmpeq @0CB
		// @023: aconst_null
		// @024: getstatic game.C_100098_h game.C_100162_sc.field_102863_R
		// @027: if_acmpne @032
		// @02A: goto @02E
		// @02D: athrow
		// @02E: goto @05D
		// @031: athrow
		// @032: getstatic game.C_100098_h game.C_100162_sc.field_102863_R
		// @035: iconst_0
		// @036: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @039: ifne @03F
		// @03C: bipush 14 (0x0E)
		// @03E: ireturn
		// @03F: getstatic game.C_100098_h game.C_100162_sc.field_102863_R
		// @042: iconst_m1
		// @043: ldc ""
		// @045: invokevirtual game.C_100098_h.func_104611_a(int, java.lang.String)boolean
		// @048: ifne @04E
		// @04B: bipush 29 (0x1D)
		// @04D: ireturn
		// @04E: getstatic game.C_100098_h game.C_100162_sc.field_102863_R
		// @051: ldc ""
		// @053: iconst_0
		// @054: invokevirtual game.C_100098_h.func_104593_a(java.lang.String, boolean)boolean
		// @057: ifne @05D
		// @05A: bipush 29 (0x1D)
		// @05C: ireturn
		// @05D: getstatic game.C_100098_h game.C_100064_ve.field_103021_y
		// @060: iconst_0
		// @061: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @064: ifeq @06B
		// @067: goto @06E
		// @06A: athrow
		// @06B: bipush 43 (0x2B)
		// @06D: ireturn
		// @06E: getstatic game.C_100098_h game.C_100064_ve.field_103021_y
		// @071: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @074: bipush 7 (0x07)
		// @076: aaload
		// @077: iconst_0
		// @078: invokevirtual game.C_100098_h.func_104593_a(java.lang.String, boolean)boolean
		// @07B: ifeq @082
		// @07E: goto @085
		// @081: athrow
		// @082: bipush 57 (0x39)
		// @084: ireturn
		// @085: getstatic game.C_100098_h game.C_100144_bm.field_102095_Zb
		// @088: iconst_0
		// @089: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @08C: ifeq @093
		// @08F: goto @096
		// @092: athrow
		// @093: bipush 71 (0x47)
		// @095: ireturn
		// @096: getstatic game.C_100098_h game.C_100144_bm.field_102095_Zb
		// @099: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @09C: bipush 7 (0x07)
		// @09E: aaload
		// @09F: iconst_0
		// @0A0: invokevirtual game.C_100098_h.func_104593_a(java.lang.String, boolean)boolean
		// @0A3: ifeq @0AA
		// @0A6: goto @0AD
		// @0A9: athrow
		// @0AA: bipush 80 (0x50)
		// @0AC: ireturn
		// @0AD: getstatic game.C_100098_h game.C_100325_id.field_101482_p
		// @0B0: iconst_0
		// @0B1: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @0B4: ifne @0BA
		// @0B7: bipush 82 (0x52)
		// @0B9: ireturn
		// @0BA: getstatic game.C_100098_h game.C_100325_id.field_101482_p
		// @0BD: iconst_0
		// @0BE: invokevirtual game.C_100098_h.func_104598_a(int)boolean
		// @0C1: ifeq @0C8
		// @0C4: goto @130
		// @0C7: athrow
		// @0C8: bipush 86 (0x56)
		// @0CA: ireturn
		// @0CB: getstatic game.C_100098_h game.C_100064_ve.field_103021_y
		// @0CE: iconst_0
		// @0CF: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @0D2: ifne @0D8
		// @0D5: bipush 20 (0x14)
		// @0D7: ireturn
		// @0D8: getstatic game.C_100098_h game.C_100064_ve.field_103021_y
		// @0DB: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @0DE: bipush 7 (0x07)
		// @0E0: aaload
		// @0E1: iconst_0
		// @0E2: invokevirtual game.C_100098_h.func_104593_a(java.lang.String, boolean)boolean
		// @0E5: ifne @0EB
		// @0E8: bipush 40 (0x28)
		// @0EA: ireturn
		// @0EB: getstatic game.C_100098_h game.C_100144_bm.field_102095_Zb
		// @0EE: iconst_0
		// @0EF: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @0F2: ifeq @0F9
		// @0F5: goto @0FC
		// @0F8: athrow
		// @0F9: bipush 50 (0x32)
		// @0FB: ireturn
		// @0FC: getstatic game.C_100098_h game.C_100144_bm.field_102095_Zb
		// @0FF: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @102: bipush 7 (0x07)
		// @104: aaload
		// @105: iconst_0
		// @106: invokevirtual game.C_100098_h.func_104593_a(java.lang.String, boolean)boolean
		// @109: ifne @10F
		// @10C: bipush 60 (0x3C)
		// @10E: ireturn
		// @10F: getstatic game.C_100098_h game.C_100325_id.field_101482_p
		// @112: iconst_0
		// @113: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @116: ifne @11C
		// @119: bipush 70 (0x46)
		// @11B: ireturn
		// @11C: getstatic game.C_100098_h game.C_100325_id.field_101482_p
		// @11F: iload_0
		// @120: bipush 80 (0x50)
		// @122: ixor
		// @123: invokevirtual game.C_100098_h.func_104598_a(int)boolean
		// @126: ifeq @12D
		// @129: goto @130
		// @12C: athrow
		// @12D: bipush 80 (0x50)
		// @12F: ireturn
		// @130: bipush 100 (0x64)
		// @132: ireturn
		// @133: astore_1
		// @134: aload_1
		// @135: new java.lang.StringBuilder
		// @138: dup
		// @139: invokespecial java.lang.StringBuilder.<init>()void
		// @13C: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @13F: bipush 6 (0x06)
		// @141: aaload
		// @142: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @145: iload_0
		// @146: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @149: bipush 41 (0x29)
		// @14B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @14E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @151: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @154: athrow
	}
	
	public final void func_102581_a(int arg0, int arg1, byte arg2, C_100218_am arg3, int arg4)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #8
		// @05: bipush 18 (0x12)
		// @07: iload_3
		// @08: bipush -2 (0xFE)
		// @0A: isub
		// @0B: bipush 52 (0x34)
		// @0D: idiv
		// @0E: irem
		// @0F: istore #6
		// @11: iconst_0
		// @12: istore #7
		// @14: aload_0
		// @15: getfield java.lang.String[] game.C_100162_sc.field_102856_U
		// @18: arraylength
		// @19: iload #7
		// @1B: if_icmple @50
		// @1E: aload_0
		// @1F: getfield game.C_100218_am[] game.C_100162_sc.field_102857_T
		// @22: iload #7
		// @24: aaload
		// @25: aload #4
		// @27: iload #8
		// @29: ifne @5C
		// @2C: if_acmpne @48
		// @2F: goto @33
		// @32: athrow
		// @33: aload_0
		// @34: getfield game.C_100276_nb game.C_100162_sc.field_102862_S
		// @37: aload_0
		// @38: getfield java.lang.String[] game.C_100162_sc.field_102856_U
		// @3B: iload #7
		// @3D: aaload
		// @3E: iconst_0
		// @3F: invokeinterface game.C_100276_nb.func_102789_a(java.lang.String, boolean)void
		// @44: goto @48
		// @47: athrow
		// @48: iinc #7 +1
		// @4B: iload #8
		// @4D: ifeq @14
		// @50: aload_0
		// @51: getfield game.C_100218_am[] game.C_100162_sc.field_102857_T
		// @54: aload_0
		// @55: getfield java.lang.String[] game.C_100162_sc.field_102856_U
		// @58: arraylength
		// @59: aaload
		// @5A: aload #4
		// @5C: if_acmpne @6E
		// @5F: aload_0
		// @60: getfield game.C_100276_nb game.C_100162_sc.field_102862_S
		// @63: bipush 112 (0x70)
		// @65: invokeinterface game.C_100276_nb.func_102790_a(byte)void
		// @6A: goto @6E
		// @6D: athrow
		// @6E: goto @CB
		// @71: astore #6
		// @73: aload #6
		// @75: new java.lang.StringBuilder
		// @78: dup
		// @79: invokespecial java.lang.StringBuilder.<init>()void
		// @7C: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @7F: iconst_0
		// @80: aaload
		// @81: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
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
		// @9F: aload #4
		// @A1: ifnull @AD
		// @A4: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @A7: iconst_1
		// @A8: aaload
		// @A9: goto @B2
		// @AC: athrow
		// @AD: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @B0: iconst_2
		// @B1: aaload
		// @B2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B5: bipush 44 (0x2C)
		// @B7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BA: iload #5
		// @BC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BF: bipush 41 (0x29)
		// @C1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C7: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CA: athrow
		// @CB: return
	}
	
	static final void func_102853_a(boolean arg0)
	{
		// @00: aconst_null
		// @01: getstatic game.C_100117_p game.C_100146_bf.field_105124_e
		// @04: if_acmpeq @0A
		// @07: goto @0B
		// @0A: return
		// @0B: getstatic game.C_100117_p game.C_100146_bf.field_105124_e
		// @0E: invokevirtual game.C_100117_p.func_100977_f()boolean
		// @11: ifne @18
		// @14: goto @37
		// @17: athrow
		// @18: aconst_null
		// @19: putstatic game.C_100117_p game.C_100146_bf.field_105124_e
		// @1C: iconst_2
		// @1D: getstatic int game.C_100346_ja.field_103498_y
		// @20: imul
		// @21: istore_1
		// @22: sipush 256 (0x0100)
		// @25: iload_1
		// @26: if_icmplt @2D
		// @29: goto @31
		// @2C: athrow
		// @2D: sipush 256 (0x0100)
		// @30: istore_1
		// @31: bipush 123 (0x7B)
		// @33: iload_1
		// @34: invokestatic game.C_100266_me.func_106646_a(int, int)void
		// @37: iload_0
		// @38: iconst_1
		// @39: if_icmpeq @45
		// @3C: bipush -74 (0xB6)
		// @3E: invokestatic game.C_100162_sc.func_102850_l(int)void
		// @41: goto @45
		// @44: athrow
		// @45: goto @6A
		// @48: astore_1
		// @49: aload_1
		// @4A: new java.lang.StringBuilder
		// @4D: dup
		// @4E: invokespecial java.lang.StringBuilder.<init>()void
		// @51: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @54: bipush 9 (0x09)
		// @56: aaload
		// @57: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5A: iload_0
		// @5B: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @5E: bipush 41 (0x29)
		// @60: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @63: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @66: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @69: athrow
		// @6A: return
	}
	
	final void func_102528_a(int arg0, int arg1, int arg2, byte arg3)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iload_2
		// @03: iload_3
		// @04: bipush -127 (0x81)
		// @06: invokespecial game.C_100085_a.func_102528_a(int, int, int, byte)void
		// @09: iconst_m1
		// @0A: iload_1
		// @0B: iconst_m1
		// @0C: ixor
		// @0D: if_icmpne @13
		// @10: goto @14
		// @13: return
		// @14: iload #4
		// @16: bipush -126 (0x82)
		// @18: if_icmple @24
		// @1B: bipush -47 (0xD1)
		// @1D: putstatic int game.C_100162_sc.field_102860_Q
		// @20: goto @24
		// @23: athrow
		// @24: getstatic game.C_100112_r game.C_100230_of.field_106205_g
		// @27: astore #5
		// @29: aconst_null
		// @2A: aload_0
		// @2B: getfield java.lang.String[] game.C_100162_sc.field_102856_U
		// @2E: if_acmpeq @60
		// @31: aload #5
		// @33: getstatic java.lang.String game.C_100044_vm.field_100950_o
		// @36: aload_0
		// @37: getfield int game.C_100162_sc.field_102538_m
		// @3A: iload_3
		// @3B: iadd
		// @3C: aload_0
		// @3D: getfield int game.C_100162_sc.field_102541_w
		// @40: iload_2
		// @41: iadd
		// @42: aload_0
		// @43: getfield int game.C_100162_sc.field_102537_l
		// @46: bipush 20 (0x14)
		// @48: ldc 16777215 (0xffffff)
		// @4A: iconst_m1
		// @4B: iconst_0
		// @4C: iconst_0
		// @4D: aload #5
		// @4F: getfield int game.C_100112_r.field_101772_Q
		// @52: aload #5
		// @54: getfield int game.C_100112_r.field_101763_H
		// @57: iadd
		// @58: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @5B: pop
		// @5C: goto @60
		// @5F: athrow
		// @60: goto @A3
		// @63: astore #5
		// @65: aload #5
		// @67: new java.lang.StringBuilder
		// @6A: dup
		// @6B: invokespecial java.lang.StringBuilder.<init>()void
		// @6E: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @71: bipush 12 (0x0C)
		// @73: aaload
		// @74: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @77: iload_1
		// @78: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7B: bipush 44 (0x2C)
		// @7D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @80: iload_2
		// @81: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @84: bipush 44 (0x2C)
		// @86: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @89: iload_3
		// @8A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8D: bipush 44 (0x2C)
		// @8F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @92: iload #4
		// @94: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @97: bipush 41 (0x29)
		// @99: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A2: athrow
		// @A3: return
	}
	
	public static void func_102850_l(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100098_h game.C_100162_sc.field_102863_R
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100162_sc.field_102859_V
		// @08: aconst_null
		// @09: putstatic game.C_100217_ao game.C_100162_sc.field_102861_P
		// @0C: aconst_null
		// @0D: putstatic java.lang.String[] game.C_100162_sc.field_102858_W
		// @10: bipush 71 (0x47)
		// @12: iload_0
		// @13: bipush 20 (0x14)
		// @15: isub
		// @16: bipush 48 (0x30)
		// @18: idiv
		// @19: idiv
		// @1A: istore_1
		// @1B: goto @40
		// @1E: astore_1
		// @1F: aload_1
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @2A: bipush 8 (0x08)
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: iload_0
		// @31: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34: bipush 41 (0x29)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F: athrow
		// @40: return
	}
	
	final void func_102855_a(String[] arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: aload_0
		// @006: getfield game.C_100202_qi game.C_100162_sc.field_102567_G
		// @009: bipush 112 (0x70)
		// @00B: invokevirtual game.C_100202_qi.func_105905_b(byte)void
		// @00E: aload_1
		// @00F: ifnull @01E
		// @012: iconst_m1
		// @013: aload_1
		// @014: arraylength
		// @015: iconst_m1
		// @016: ixor
		// @017: if_icmpne @024
		// @01A: goto @01E
		// @01D: athrow
		// @01E: aload_0
		// @01F: aconst_null
		// @020: putfield java.lang.String[] game.C_100162_sc.field_102856_U
		// @023: return
		// @024: aload_1
		// @025: arraylength
		// @026: istore_3
		// @027: iload_2
		// @028: sipush 28857 (0x70B9)
		// @02B: if_icmpeq @040
		// @02E: bipush -118 (0x8A)
		// @030: bipush 115 (0x73)
		// @032: aconst_null
		// @033: checkcast java.lang.CharSequence[]
		// @036: bipush 58 (0x3A)
		// @038: invokestatic game.C_100162_sc.func_102849_a(byte, int, java.lang.CharSequence[], int)java.lang.String
		// @03B: pop
		// @03C: goto @040
		// @03F: athrow
		// @040: aload_0
		// @041: iload_3
		// @042: anewarray java.lang.String
		// @045: putfield java.lang.String[] game.C_100162_sc.field_102856_U
		// @048: iconst_0
		// @049: istore #4
		// @04B: iload #4
		// @04D: iconst_m1
		// @04E: ixor
		// @04F: iload_3
		// @050: iconst_m1
		// @051: ixor
		// @052: if_icmple @075
		// @055: aload_0
		// @056: getfield java.lang.String[] game.C_100162_sc.field_102856_U
		// @059: iload #4
		// @05B: bipush 104 (0x68)
		// @05D: aload_1
		// @05E: iload #4
		// @060: aaload
		// @061: invokestatic game.C_100303_kk.func_104779_a(int, java.lang.CharSequence)java.lang.String
		// @064: sipush 160 (0x00A0)
		// @067: bipush 32 (0x20)
		// @069: invokevirtual java.lang.String.replace(char, char)java.lang.String
		// @06C: aastore
		// @06D: iinc #4 +1
		// @070: iload #6
		// @072: ifeq @04B
		// @075: new game.C_100082_uf
		// @078: dup
		// @079: getstatic game.C_100112_r game.C_100230_of.field_106205_g
		// @07C: iconst_0
		// @07D: iconst_1
		// @07E: invokespecial game.C_100082_uf.<init>(game.C_100112_r, int, int)void
		// @081: astore #4
		// @083: aload_0
		// @084: iconst_1
		// @085: iload_3
		// @086: iadd
		// @087: anewarray game.C_100218_am
		// @08A: putfield game.C_100218_am[] game.C_100162_sc.field_102857_T
		// @08D: iconst_0
		// @08E: istore #5
		// @090: iload #5
		// @092: iload_3
		// @093: if_icmpge @0FF
		// @096: aload_0
		// @097: getfield game.C_100218_am[] game.C_100162_sc.field_102857_T
		// @09A: iload #5
		// @09C: new game.C_100218_am
		// @09F: dup
		// @0A0: aload_0
		// @0A1: getfield java.lang.String[] game.C_100162_sc.field_102856_U
		// @0A4: iload #5
		// @0A6: aaload
		// @0A7: aload_0
		// @0A8: invokespecial game.C_100218_am.<init>(java.lang.String, game.C_100337_in)void
		// @0AB: aastore
		// @0AC: aload_0
		// @0AD: getfield game.C_100218_am[] game.C_100162_sc.field_102857_T
		// @0B0: iload #5
		// @0B2: aaload
		// @0B3: aload #4
		// @0B5: putfield game.C_100326_ic game.C_100218_am.field_102533_B
		// @0B8: aload_0
		// @0B9: getfield game.C_100218_am[] game.C_100162_sc.field_102857_T
		// @0BC: iload #5
		// @0BE: aaload
		// @0BF: getstatic java.lang.String game.C_100335_il.field_107366_g
		// @0C2: putfield java.lang.String game.C_100218_am.field_102536_o
		// @0C5: aload_0
		// @0C6: getfield game.C_100218_am[] game.C_100162_sc.field_102857_T
		// @0C9: iload #5
		// @0CB: aaload
		// @0CC: bipush 15 (0x0F)
		// @0CE: bipush 16 (0x10)
		// @0D0: iload #5
		// @0D2: imul
		// @0D3: bipush 20 (0x14)
		// @0D5: iadd
		// @0D6: iconst_0
		// @0D7: bipush 80 (0x50)
		// @0D9: bipush -74 (0xB6)
		// @0DB: invokevirtual game.C_100218_am.func_102524_a(int, int, int, int, byte)void
		// @0DE: aload_0
		// @0DF: aload_0
		// @0E0: getfield game.C_100218_am[] game.C_100162_sc.field_102857_T
		// @0E3: iload #5
		// @0E5: aaload
		// @0E6: iload_2
		// @0E7: sipush -28856 (0x8F48)
		// @0EA: iadd
		// @0EB: invokevirtual game.C_100162_sc.func_102561_b(game.C_100336_im, int)void
		// @0EE: iinc #5 +1
		// @0F1: iload #6
		// @0F3: ifne @141
		// @0F6: iload #6
		// @0F8: ifeq @090
		// @0FB: goto @0FF
		// @0FE: athrow
		// @0FF: aload_0
		// @100: getfield game.C_100218_am[] game.C_100162_sc.field_102857_T
		// @103: iload_3
		// @104: new game.C_100218_am
		// @107: dup
		// @108: getstatic java.lang.String game.C_100306_kn.field_107137_l
		// @10B: aload_0
		// @10C: invokespecial game.C_100218_am.<init>(java.lang.String, game.C_100337_in)void
		// @10F: aastore
		// @110: aload_0
		// @111: getfield game.C_100218_am[] game.C_100162_sc.field_102857_T
		// @114: iload_3
		// @115: aaload
		// @116: aload #4
		// @118: putfield game.C_100326_ic game.C_100218_am.field_102533_B
		// @11B: aload_0
		// @11C: getfield game.C_100218_am[] game.C_100162_sc.field_102857_T
		// @11F: iload_3
		// @120: aaload
		// @121: bipush 15 (0x0F)
		// @123: bipush 16 (0x10)
		// @125: iload_3
		// @126: bipush 16 (0x10)
		// @128: imul
		// @129: ineg
		// @12A: bipush 20 (0x14)
		// @12C: isub
		// @12D: isub
		// @12E: iconst_0
		// @12F: bipush 100 (0x64)
		// @131: bipush -69 (0xBB)
		// @133: invokevirtual game.C_100218_am.func_102524_a(int, int, int, int, byte)void
		// @136: aload_0
		// @137: aload_0
		// @138: getfield game.C_100218_am[] game.C_100162_sc.field_102857_T
		// @13B: iload_3
		// @13C: aaload
		// @13D: iconst_1
		// @13E: invokevirtual game.C_100162_sc.func_102561_b(game.C_100336_im, int)void
		// @141: goto @17F
		// @144: astore_3
		// @145: aload_3
		// @146: new java.lang.StringBuilder
		// @149: dup
		// @14A: invokespecial java.lang.StringBuilder.<init>()void
		// @14D: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @150: iconst_5
		// @151: aaload
		// @152: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @155: aload_1
		// @156: ifnull @162
		// @159: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @15C: iconst_1
		// @15D: aaload
		// @15E: goto @167
		// @161: athrow
		// @162: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @165: iconst_2
		// @166: aaload
		// @167: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16A: bipush 44 (0x2C)
		// @16C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16F: iload_2
		// @170: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @173: bipush 41 (0x29)
		// @175: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @178: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @17B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @17E: athrow
		// @17F: return
	}
	
	C_100162_sc(C_100276_nb arg0)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: iconst_0
		// @03: iconst_0
		// @04: iconst_0
		// @05: aconst_null
		// @06: invokespecial game.C_100085_a.<init>(int, int, int, int, game.C_100326_ic)void
		// @09: aload_0
		// @0A: aload_1
		// @0B: putfield game.C_100276_nb game.C_100162_sc.field_102862_S
		// @0E: goto @43
		// @11: astore_2
		// @12: aload_2
		// @13: new java.lang.StringBuilder
		// @16: dup
		// @17: invokespecial java.lang.StringBuilder.<init>()void
		// @1A: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @1D: iconst_3
		// @1E: aaload
		// @1F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @22: aload_1
		// @23: ifnull @2F
		// @26: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @29: iconst_1
		// @2A: aaload
		// @2B: goto @34
		// @2E: athrow
		// @2F: getstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @32: iconst_2
		// @33: aaload
		// @34: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @37: bipush 41 (0x29)
		// @39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @42: athrow
		// @43: return
	}
	
	static
	{
		// @000: bipush 13 (0x0D)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "\u001c8a [G"
		// @009: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "\u0014uaDg"
		// @014: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @017: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "\u0001.#\u0006"
		// @01F: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @022: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "\u001c8aVs\u00012;T2"
		// @02A: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "\u001c8a\"[G"
		// @035: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @038: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "\u001c8a'[G"
		// @040: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @043: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "\u001c8a$[G"
		// @04C: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "\u000c4\"\u0007u\u0001.&"
		// @058: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "\u001c8a-[G"
		// @064: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @067: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "\u001c8a#[G"
		// @070: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @073: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "\u001c8a![G"
		// @07C: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "\u001c8a,[G"
		// @088: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "\u001c8a)2"
		// @094: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @097: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @09A: aastore
		// @09B: putstatic java.lang.String[] game.C_100162_sc.field_102864_X
		// @09E: iconst_2
		// @09F: putstatic int game.C_100162_sc.field_102860_Q
		// @0A2: bipush 6 (0x06)
		// @0A4: anewarray java.lang.String
		// @0A7: dup
		// @0A8: iconst_0
		// @0A9: ldc "4\u0019\u000e)Q<\u000b\u000e)_2"
		// @0AB: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @0AE: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @0B1: aastore
		// @0B2: dup
		// @0B3: iconst_1
		// @0B4: ldc "4\u0013\u0000'_2"
		// @0B6: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @0B9: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @0BC: aastore
		// @0BD: dup
		// @0BE: iconst_2
		// @0BF: ldc "4\u001dv7"
		// @0C1: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @0C4: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @0C7: aastore
		// @0C8: dup
		// @0C9: iconst_3
		// @0CA: ldc "4\u001d~ZG"
		// @0CC: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @0CF: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @0D2: aastore
		// @0D3: dup
		// @0D4: iconst_4
		// @0D5: ldc "4\u001d~[G"
		// @0D7: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @0DA: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @0DD: aastore
		// @0DE: dup
		// @0DF: iconst_5
		// @0E0: ldc "4\u001e\u001c)G"
		// @0E2: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @0E5: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @0E8: aastore
		// @0E9: putstatic java.lang.String[] game.C_100162_sc.field_102858_W
		// @0EC: new game.C_100217_ao
		// @0EF: dup
		// @0F0: iconst_4
		// @0F1: iconst_1
		// @0F2: iconst_1
		// @0F3: iconst_1
		// @0F4: invokespecial game.C_100217_ao.<init>(int, int, int, int)void
		// @0F7: putstatic game.C_100217_ao game.C_100162_sc.field_102861_P
		// @0FA: ldc "S~~T:\u0018:<J~\n(;\u0018u\u0016>+Jm\u0006/'\u0003tOgjZ$H(o\tu\u001d>o\tu\u0001/.\u0003t\u0002>!\u001e:\n#?\u0006u\u001c2 \u0004"
		// @0FC: invokestatic game.C_100162_sc.func_102852_z(java.lang.String)char[]
		// @0FF: invokestatic game.C_100162_sc.func_102851_z(char[])java.lang.String
		// @102: putstatic java.lang.String game.C_100162_sc.field_102859_V
		// @105: return
	}
	
	private static char[] func_102852_z(String arg0)
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
		// @0E: bipush 26 (0x1A)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_102851_z(char[] arg0)
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
		// @30: bipush 111 (0x6F)
		// @32: goto @46
		// @35: bipush 91 (0x5B)
		// @37: goto @46
		// @3A: bipush 79 (0x4F)
		// @3C: goto @46
		// @3F: bipush 106 (0x6A)
		// @41: goto @46
		// @44: bipush 26 (0x1A)
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
