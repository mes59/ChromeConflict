package game;

final class C_100033_gj extends C_100302_ka
{
	private C_100144_bm[] field_101924_nc;
	private int[] field_101911_hc;
	private C_100033_gj field_101909_Zb;
	static long field_101912_Yb;
	private int field_101927_ac;
	private C_100033_gj[] field_101914_ec;
	private int field_101915_qc;
	private int field_101921_Ub;
	private int field_101916_fc;
	private int field_101925_kc;
	private char[] field_101910_Xb;
	static C_100302_ka field_101926_pc;
	static int[] field_101918_Wb;
	private int field_101907_dc;
	static int field_101920_oc;
	private int field_101908_gc;
	static String field_101922_mc;
	static C_100130_tf field_101930_cc;
	private int field_101923_Vb;
	static int field_101917_jc;
	static C_100302_ka field_101928_lc;
	static String field_101929_bc;
	static String field_101919_ic;
	private static final String[] field_101913_rc;
	
	static final String func_101898_a(C_100240_oj arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #4
		// @005: aconst_null
		// @006: astore_2
		// @007: aconst_null
		// @008: aload_0
		// @009: getfield java.lang.String game.C_100240_oj.field_106321_m
		// @00C: if_acmpeq @061
		// @00F: aload_0
		// @010: getfield java.lang.String game.C_100240_oj.field_106321_m
		// @013: astore_2
		// @014: aload_0
		// @015: getfield int game.C_100240_oj.field_106315_b
		// @018: iconst_m1
		// @019: ixor
		// @01A: bipush -2 (0xFE)
		// @01C: if_icmpeq @023
		// @01F: goto @03A
		// @022: athrow
		// @023: new java.lang.StringBuilder
		// @026: dup
		// @027: invokespecial java.lang.StringBuilder.<init>()void
		// @02A: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @02D: iconst_5
		// @02E: aaload
		// @02F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @032: aload_2
		// @033: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @036: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @039: astore_2
		// @03A: aload_0
		// @03B: getfield int game.C_100240_oj.field_106315_b
		// @03E: iconst_m1
		// @03F: ixor
		// @040: bipush -3 (0xFD)
		// @042: if_icmpeq @049
		// @045: goto @061
		// @048: athrow
		// @049: new java.lang.StringBuilder
		// @04C: dup
		// @04D: invokespecial java.lang.StringBuilder.<init>()void
		// @050: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @053: bipush 7 (0x07)
		// @055: aaload
		// @056: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @059: aload_2
		// @05A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @05D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @060: astore_2
		// @061: iload_1
		// @062: bipush -2 (0xFE)
		// @064: if_icmpeq @071
		// @067: bipush -107 (0x95)
		// @069: invokestatic game.C_100033_gj.func_101899_m(int)boolean
		// @06C: pop
		// @06D: goto @071
		// @070: athrow
		// @071: ldc ""
		// @073: astore_3
		// @074: iconst_2
		// @075: aload_0
		// @076: getfield int game.C_100240_oj.field_106317_a
		// @079: if_icmpne @0CB
		// @07C: aload_0
		// @07D: getfield boolean game.C_100240_oj.field_106311_f
		// @080: ifne @1C7
		// @083: goto @087
		// @086: athrow
		// @087: aload_0
		// @088: getfield int game.C_100240_oj.field_106312_g
		// @08B: ifne @0B4
		// @08E: goto @092
		// @091: athrow
		// @092: aload_0
		// @093: getfield int game.C_100240_oj.field_106323_k
		// @096: ifne @0B4
		// @099: goto @09D
		// @09C: athrow
		// @09D: sipush -30945 (0x871F)
		// @0A0: iconst_1
		// @0A1: anewarray java.lang.String
		// @0A4: dup
		// @0A5: iconst_0
		// @0A6: aload_2
		// @0A7: aastore
		// @0A8: getstatic java.lang.String game.C_100249_pc.field_102331_C
		// @0AB: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0AE: astore_3
		// @0AF: iload #4
		// @0B1: ifeq @1C7
		// @0B4: sipush -30945 (0x871F)
		// @0B7: iconst_1
		// @0B8: anewarray java.lang.String
		// @0BB: dup
		// @0BC: iconst_0
		// @0BD: aload_2
		// @0BE: aastore
		// @0BF: getstatic java.lang.String game.C_100278_nd.field_101205_y
		// @0C2: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0C5: astore_3
		// @0C6: iload #4
		// @0C8: ifeq @1C7
		// @0CB: iconst_0
		// @0CC: aload_0
		// @0CD: getfield int game.C_100240_oj.field_106317_a
		// @0D0: if_icmpne @103
		// @0D3: goto @0D7
		// @0D6: athrow
		// @0D7: getstatic boolean game.C_100024_hd.field_103002_x
		// @0DA: ifne @0E5
		// @0DD: goto @0E1
		// @0E0: athrow
		// @0E1: goto @103
		// @0E4: athrow
		// @0E5: new java.lang.StringBuilder
		// @0E8: dup
		// @0E9: invokespecial java.lang.StringBuilder.<init>()void
		// @0EC: ldc "["
		// @0EE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F1: getstatic java.lang.String game.C_100272_mn.field_102432_H
		// @0F4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F7: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @0FA: iconst_4
		// @0FB: aaload
		// @0FC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0FF: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @102: astore_3
		// @103: iconst_1
		// @104: aload_0
		// @105: getfield int game.C_100240_oj.field_106317_a
		// @108: if_icmpne @13A
		// @10B: new java.lang.StringBuilder
		// @10E: dup
		// @10F: invokespecial java.lang.StringBuilder.<init>()void
		// @112: ldc "["
		// @114: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @117: sipush -30945 (0x871F)
		// @11A: iconst_1
		// @11B: anewarray java.lang.String
		// @11E: dup
		// @11F: iconst_0
		// @120: aload_0
		// @121: getfield java.lang.String game.C_100240_oj.field_106325_i
		// @124: aastore
		// @125: getstatic java.lang.String game.C_100287_nm.field_106823_g
		// @128: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @12B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @12E: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @131: iconst_4
		// @132: aaload
		// @133: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @136: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @139: astore_3
		// @13A: aload_0
		// @13B: getfield int game.C_100240_oj.field_106317_a
		// @13E: iconst_m1
		// @13F: ixor
		// @140: bipush -5 (0xFB)
		// @142: if_icmpne @16E
		// @145: aconst_null
		// @146: getstatic java.lang.String game.C_100281_ng.field_103461_O
		// @149: if_acmpeq @16E
		// @14C: goto @150
		// @14F: athrow
		// @150: new java.lang.StringBuilder
		// @153: dup
		// @154: invokespecial java.lang.StringBuilder.<init>()void
		// @157: ldc "["
		// @159: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @15C: getstatic java.lang.String game.C_100281_ng.field_103461_O
		// @15F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @162: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @165: iconst_4
		// @166: aaload
		// @167: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @16D: astore_3
		// @16E: bipush -4 (0xFC)
		// @170: aload_0
		// @171: getfield int game.C_100240_oj.field_106317_a
		// @174: iconst_m1
		// @175: ixor
		// @176: if_icmpeq @17D
		// @179: goto @1A0
		// @17C: athrow
		// @17D: new java.lang.StringBuilder
		// @180: dup
		// @181: invokespecial java.lang.StringBuilder.<init>()void
		// @184: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @187: bipush 6 (0x06)
		// @189: aaload
		// @18A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @18D: aload_0
		// @18E: getfield java.lang.String game.C_100240_oj.field_106325_i
		// @191: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @194: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @197: iconst_4
		// @198: aaload
		// @199: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @19C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @19F: astore_3
		// @1A0: aload_0
		// @1A1: getfield boolean game.C_100240_oj.field_106311_f
		// @1A4: ifeq @1AB
		// @1A7: goto @1C7
		// @1AA: athrow
		// @1AB: new java.lang.StringBuilder
		// @1AE: dup
		// @1AF: invokespecial java.lang.StringBuilder.<init>()void
		// @1B2: aload_3
		// @1B3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1B6: aload_2
		// @1B7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1BA: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @1BD: bipush 11 (0x0B)
		// @1BF: aaload
		// @1C0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1C3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1C6: astore_3
		// @1C7: aload_3
		// @1C8: areturn
		// @1C9: astore_2
		// @1CA: aload_2
		// @1CB: new java.lang.StringBuilder
		// @1CE: dup
		// @1CF: invokespecial java.lang.StringBuilder.<init>()void
		// @1D2: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @1D5: bipush 8 (0x08)
		// @1D7: aaload
		// @1D8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1DB: aload_0
		// @1DC: ifnull @1E9
		// @1DF: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @1E2: bipush 9 (0x09)
		// @1E4: aaload
		// @1E5: goto @1EF
		// @1E8: athrow
		// @1E9: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @1EC: bipush 10 (0x0A)
		// @1EE: aaload
		// @1EF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1F2: bipush 44 (0x2C)
		// @1F4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F7: iload_1
		// @1F8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1FB: bipush 41 (0x29)
		// @1FD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @200: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @203: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @206: athrow
	}
	
	static final boolean func_101899_m(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: getstatic game.C_100202_qi game.C_100132_td.field_104979_l
		// @07: bipush 18 (0x12)
		// @09: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @0C: checkcast game.C_100167_sj
		// @0F: astore_1
		// @10: aload_1
		// @11: ifnull @18
		// @14: goto @1A
		// @17: athrow
		// @18: iconst_0
		// @19: ireturn
		// @1A: iload_0
		// @1B: istore_2
		// @1C: iload_2
		// @1D: iconst_m1
		// @1E: ixor
		// @1F: aload_1
		// @20: getfield int game.C_100167_sj.field_100800_y
		// @23: iconst_m1
		// @24: ixor
		// @25: if_icmple @75
		// @28: aconst_null
		// @29: aload_1
		// @2A: getfield game.C_100331_ie[] game.C_100167_sj.field_100798_p
		// @2D: iload_2
		// @2E: aaload
		// @2F: if_acmpeq @4B
		// @32: iconst_m1
		// @33: aload_1
		// @34: getfield game.C_100331_ie[] game.C_100167_sj.field_100798_p
		// @37: iload_2
		// @38: aaload
		// @39: getfield int game.C_100331_ie.field_107293_f
		// @3C: iconst_m1
		// @3D: ixor
		// @3E: if_icmpeq @49
		// @41: goto @45
		// @44: athrow
		// @45: goto @4B
		// @48: athrow
		// @49: iconst_0
		// @4A: ireturn
		// @4B: aconst_null
		// @4C: aload_1
		// @4D: getfield game.C_100331_ie[] game.C_100167_sj.field_100795_s
		// @50: iload_2
		// @51: aaload
		// @52: if_acmpeq @6E
		// @55: aload_1
		// @56: getfield game.C_100331_ie[] game.C_100167_sj.field_100795_s
		// @59: iload_2
		// @5A: aaload
		// @5B: getfield int game.C_100331_ie.field_107293_f
		// @5E: iconst_m1
		// @5F: ixor
		// @60: iconst_m1
		// @61: if_icmpeq @6C
		// @64: goto @68
		// @67: athrow
		// @68: goto @6E
		// @6B: athrow
		// @6C: iconst_0
		// @6D: ireturn
		// @6E: iinc #2 +1
		// @71: iload_3
		// @72: ifeq @1C
		// @75: iconst_1
		// @76: ireturn
		// @77: astore_1
		// @78: aload_1
		// @79: new java.lang.StringBuilder
		// @7C: dup
		// @7D: invokespecial java.lang.StringBuilder.<init>()void
		// @80: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @83: bipush 18 (0x12)
		// @85: aaload
		// @86: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @89: iload_0
		// @8A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8D: bipush 41 (0x29)
		// @8F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @92: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @95: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @98: athrow
	}
	
	final boolean func_101893_c(int arg0, int arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: bipush 10 (0x0A)
		// @007: iload_2
		// @008: iconst_0
		// @009: isub
		// @00A: bipush 49 (0x31)
		// @00C: idiv
		// @00D: idiv
		// @00E: istore #5
		// @010: getstatic int game.C_100293_kj.field_106890_c
		// @013: bipush 85 (0x55)
		// @015: if_icmpne @01D
		// @018: iconst_1
		// @019: goto @01E
		// @01C: athrow
		// @01D: iconst_0
		// @01E: istore #4
		// @020: aload_0
		// @021: getfield game.C_100033_gj game.C_100033_gj.field_101909_Zb
		// @024: ifnull @05B
		// @027: iload #4
		// @029: ifeq @04F
		// @02C: goto @030
		// @02F: athrow
		// @030: aload_0
		// @031: getfield game.C_100033_gj game.C_100033_gj.field_101909_Zb
		// @034: getfield int game.C_100033_gj.field_101907_dc
		// @037: iconst_m1
		// @038: if_icmpne @04F
		// @03B: goto @03F
		// @03E: athrow
		// @03F: aload_0
		// @040: sipush -21723 (0xAB25)
		// @043: invokevirtual game.C_100033_gj.func_101904_o(int)void
		// @046: aload_0
		// @047: iconst_0
		// @048: bipush 67 (0x43)
		// @04A: invokespecial game.C_100033_gj.func_101906_a(int, int)void
		// @04D: iconst_1
		// @04E: ireturn
		// @04F: aload_0
		// @050: getfield game.C_100033_gj game.C_100033_gj.field_101909_Zb
		// @053: iload_1
		// @054: bipush 86 (0x56)
		// @056: iload_3
		// @057: invokevirtual game.C_100033_gj.func_101893_c(int, int, int)boolean
		// @05A: ireturn
		// @05B: aconst_null
		// @05C: aload_0
		// @05D: getfield game.C_100033_gj game.C_100033_gj.field_101909_Zb
		// @060: if_acmpne @082
		// @063: aload_0
		// @064: getstatic game.C_100033_gj game.C_100159_sn.field_105401_e
		// @067: if_acmpne @082
		// @06A: goto @06E
		// @06D: athrow
		// @06E: iload #4
		// @070: ifne @07B
		// @073: goto @077
		// @076: athrow
		// @077: goto @082
		// @07A: athrow
		// @07B: bipush 39 (0x27)
		// @07D: invokestatic game.C_100128_ca.func_102800_f(byte)void
		// @080: iconst_1
		// @081: ireturn
		// @082: getstatic char game.C_100012_fh.field_100517_Q
		// @085: istore #6
		// @087: iconst_m1
		// @088: iload #6
		// @08A: iconst_m1
		// @08B: ixor
		// @08C: if_icmpgt @093
		// @08F: goto @0E1
		// @092: athrow
		// @093: iload #6
		// @095: iconst_m1
		// @096: ixor
		// @097: getstatic char game.C_100321_hi.field_107218_e
		// @09A: iconst_m1
		// @09B: ixor
		// @09C: if_icmpeq @0A3
		// @09F: goto @0A7
		// @0A2: athrow
		// @0A3: bipush 63 (0x3F)
		// @0A5: istore #6
		// @0A7: iconst_0
		// @0A8: istore #7
		// @0AA: iload #7
		// @0AC: aload_0
		// @0AD: getfield char[] game.C_100033_gj.field_101910_Xb
		// @0B0: arraylength
		// @0B1: if_icmpge @0E1
		// @0B4: iload #6
		// @0B6: iload #8
		// @0B8: ifne @0E2
		// @0BB: aload_0
		// @0BC: getfield char[] game.C_100033_gj.field_101910_Xb
		// @0BF: iload #7
		// @0C1: caload
		// @0C2: if_icmpeq @0CD
		// @0C5: goto @0C9
		// @0C8: athrow
		// @0C9: goto @0D9
		// @0CC: athrow
		// @0CD: aload_0
		// @0CE: bipush -24 (0xE8)
		// @0D0: iload_1
		// @0D1: iload_3
		// @0D2: iload #7
		// @0D4: invokespecial game.C_100033_gj.func_101902_a(byte, int, int, int)void
		// @0D7: iconst_1
		// @0D8: ireturn
		// @0D9: iinc #7 +1
		// @0DC: iload #8
		// @0DE: ifeq @0AA
		// @0E1: iconst_0
		// @0E2: ireturn
		// @0E3: astore #4
		// @0E5: aload #4
		// @0E7: new java.lang.StringBuilder
		// @0EA: dup
		// @0EB: invokespecial java.lang.StringBuilder.<init>()void
		// @0EE: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @0F1: bipush 15 (0x0F)
		// @0F3: aaload
		// @0F4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F7: iload_1
		// @0F8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0FB: bipush 44 (0x2C)
		// @0FD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @100: iload_2
		// @101: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
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
	
	final int func_101905_n(int arg0)
	{
		// @00: bipush 92 (0x5C)
		// @02: iconst_1
		// @03: iload_1
		// @04: isub
		// @05: bipush 32 (0x20)
		// @07: idiv
		// @08: idiv
		// @09: istore_2
		// @0A: aload_0
		// @0B: getfield int game.C_100033_gj.field_101927_ac
		// @0E: aload_0
		// @0F: getfield game.C_100033_gj game.C_100033_gj.field_101909_Zb
		// @12: ifnull @22
		// @15: aload_0
		// @16: getfield game.C_100033_gj game.C_100033_gj.field_101909_Zb
		// @19: bipush -100 (0x9C)
		// @1B: invokevirtual game.C_100033_gj.func_101905_n(int)int
		// @1E: goto @23
		// @21: athrow
		// @22: iconst_0
		// @23: iadd
		// @24: ireturn
		// @25: astore_2
		// @26: aload_2
		// @27: new java.lang.StringBuilder
		// @2A: dup
		// @2B: invokespecial java.lang.StringBuilder.<init>()void
		// @2E: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @31: bipush 17 (0x11)
		// @33: aaload
		// @34: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @37: iload_1
		// @38: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3B: bipush 41 (0x29)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @43: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @46: athrow
	}
	
	final void func_101892_a(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #9
		// @005: aload_0
		// @006: iload #5
		// @008: iconst_2
		// @009: imul
		// @00A: aload_0
		// @00B: getfield int game.C_100033_gj.field_101925_kc
		// @00E: iadd
		// @00F: putfield int game.C_100033_gj.field_101927_ac
		// @012: aload_0
		// @013: iload_2
		// @014: aload_0
		// @015: getfield int game.C_100033_gj.field_101915_qc
		// @018: iconst_m1
		// @019: iload_3
		// @01A: aload_0
		// @01B: getfield int game.C_100033_gj.field_101915_qc
		// @01E: ineg
		// @01F: iadd
		// @020: aload_0
		// @021: getfield int game.C_100033_gj.field_101927_ac
		// @024: invokevirtual game.C_100033_gj.func_101825_a(int, int, int, int, int)void
		// @027: iload_1
		// @028: bipush 84 (0x54)
		// @02A: if_icmpeq @02E
		// @02D: return
		// @02E: aload_0
		// @02F: getfield int game.C_100033_gj.field_101921_Ub
		// @032: iconst_m1
		// @033: ixor
		// @034: iload #4
		// @036: iconst_m1
		// @037: ixor
		// @038: if_icmpne @03F
		// @03B: goto @04F
		// @03E: athrow
		// @03F: aload_0
		// @040: iload #4
		// @042: putfield int game.C_100033_gj.field_101921_Ub
		// @045: aload_0
		// @046: aload_0
		// @047: getfield int game.C_100033_gj.field_101923_Vb
		// @04A: bipush -70 (0xBA)
		// @04C: invokespecial game.C_100033_gj.func_101906_a(int, int)void
		// @04F: iconst_0
		// @050: istore #7
		// @052: aload_0
		// @053: getfield int game.C_100033_gj.field_101908_gc
		// @056: iconst_m1
		// @057: ixor
		// @058: iload #7
		// @05A: iconst_m1
		// @05B: ixor
		// @05C: if_icmpge @096
		// @05F: aload_0
		// @060: getfield game.C_100144_bm[] game.C_100033_gj.field_101924_nc
		// @063: iload #7
		// @065: aaload
		// @066: iconst_0
		// @067: iload #5
		// @069: aload_0
		// @06A: getfield int game.C_100033_gj.field_101916_fc
		// @06D: iload #6
		// @06F: iload_1
		// @070: sipush 2448 (0x0990)
		// @073: iadd
		// @074: aload_0
		// @075: getfield int game.C_100033_gj.field_101927_ac
		// @078: aload_0
		// @079: getfield game.C_100144_bm[] game.C_100033_gj.field_101924_nc
		// @07C: iload #7
		// @07E: aaload
		// @07F: getfield int game.C_100144_bm.field_101880_Gb
		// @082: invokevirtual game.C_100144_bm.func_102086_a(int, int, int, int, int, int, int)void
		// @085: iinc #7 +1
		// @088: iload #9
		// @08A: ifne @118
		// @08D: iload #9
		// @08F: ifeq @052
		// @092: goto @096
		// @095: athrow
		// @096: iconst_m1
		// @097: aload_0
		// @098: getfield int game.C_100033_gj.field_101907_dc
		// @09B: if_icmpeq @118
		// @09E: aload_0
		// @09F: getfield game.C_100033_gj[] game.C_100033_gj.field_101914_ec
		// @0A2: aload_0
		// @0A3: getfield int game.C_100033_gj.field_101907_dc
		// @0A6: aaload
		// @0A7: ifnull @118
		// @0AA: goto @0AE
		// @0AD: athrow
		// @0AE: aload_0
		// @0AF: getfield game.C_100033_gj[] game.C_100033_gj.field_101914_ec
		// @0B2: aload_0
		// @0B3: getfield int game.C_100033_gj.field_101907_dc
		// @0B6: aaload
		// @0B7: getfield int game.C_100033_gj.field_101908_gc
		// @0BA: istore #7
		// @0BC: aload_0
		// @0BD: getfield int game.C_100033_gj.field_101880_Gb
		// @0C0: aload_0
		// @0C1: getfield int game.C_100033_gj.field_101907_dc
		// @0C4: iload #7
		// @0C6: iadd
		// @0C7: aload_0
		// @0C8: getfield int game.C_100033_gj.field_101916_fc
		// @0CB: imul
		// @0CC: ineg
		// @0CD: isub
		// @0CE: istore #8
		// @0D0: iload_3
		// @0D1: iconst_m1
		// @0D2: ixor
		// @0D3: iload #8
		// @0D5: iconst_m1
		// @0D6: ixor
		// @0D7: if_icmple @0F1
		// @0DA: iload #8
		// @0DC: aload_0
		// @0DD: getfield int game.C_100033_gj.field_101916_fc
		// @0E0: isub
		// @0E1: istore #8
		// @0E3: iload #9
		// @0E5: ifne @118
		// @0E8: iload #9
		// @0EA: ifeq @0D0
		// @0ED: goto @0F1
		// @0F0: athrow
		// @0F1: aload_0
		// @0F2: getfield game.C_100033_gj[] game.C_100033_gj.field_101914_ec
		// @0F5: aload_0
		// @0F6: getfield int game.C_100033_gj.field_101907_dc
		// @0F9: aaload
		// @0FA: bipush 84 (0x54)
		// @0FC: iload_2
		// @0FD: aload_0
		// @0FE: getfield int game.C_100033_gj.field_101927_ac
		// @101: ineg
		// @102: isub
		// @103: iload #8
		// @105: aload_0
		// @106: getfield game.C_100144_bm[] game.C_100033_gj.field_101924_nc
		// @109: aload_0
		// @10A: getfield int game.C_100033_gj.field_101907_dc
		// @10D: aaload
		// @10E: getfield int game.C_100144_bm.field_101835_xb
		// @111: iload #5
		// @113: iload #6
		// @115: invokevirtual game.C_100033_gj.func_101892_a(byte, int, int, int, int, int)void
		// @118: goto @16E
		// @11B: astore #7
		// @11D: aload #7
		// @11F: new java.lang.StringBuilder
		// @122: dup
		// @123: invokespecial java.lang.StringBuilder.<init>()void
		// @126: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @129: iconst_2
		// @12A: aaload
		// @12B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @12E: iload_1
		// @12F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @132: bipush 44 (0x2C)
		// @134: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @137: iload_2
		// @138: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @13B: bipush 44 (0x2C)
		// @13D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @140: iload_3
		// @141: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @144: bipush 44 (0x2C)
		// @146: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @149: iload #4
		// @14B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @14E: bipush 44 (0x2C)
		// @150: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @153: iload #5
		// @155: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @158: bipush 44 (0x2C)
		// @15A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @15D: iload #6
		// @15F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @162: bipush 41 (0x29)
		// @164: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @167: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @16A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @16D: athrow
		// @16E: return
	}
	
	final boolean func_101895_l(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: iconst_0
		// @06: istore_2
		// @07: aload_0
		// @08: getfield game.C_100144_bm[] game.C_100033_gj.field_101924_nc
		// @0B: astore_3
		// @0C: iload_1
		// @0D: istore #4
		// @0F: aload_3
		// @10: arraylength
		// @11: iload #4
		// @13: if_icmple @3F
		// @16: aload_3
		// @17: iload #4
		// @19: aaload
		// @1A: astore #5
		// @1C: iload_2
		// @1D: iconst_0
		// @1E: iload #6
		// @20: ifne @4C
		// @23: aload #5
		// @25: getfield int game.C_100144_bm.field_101854_N
		// @28: if_icmpeq @34
		// @2B: goto @2F
		// @2E: athrow
		// @2F: iconst_1
		// @30: goto @35
		// @33: athrow
		// @34: iconst_0
		// @35: ior
		// @36: istore_2
		// @37: iinc #4 +1
		// @3A: iload #6
		// @3C: ifeq @0F
		// @3F: iload_2
		// @40: ifne @74
		// @43: aload_0
		// @44: getfield int game.C_100033_gj.field_101907_dc
		// @47: iconst_m1
		// @48: goto @4C
		// @4B: athrow
		// @4C: ixor
		// @4D: ifeq @74
		// @50: aload_0
		// @51: getfield game.C_100033_gj[] game.C_100033_gj.field_101914_ec
		// @54: aload_0
		// @55: getfield int game.C_100033_gj.field_101907_dc
		// @58: aaload
		// @59: ifnonnull @64
		// @5C: goto @60
		// @5F: athrow
		// @60: goto @74
		// @63: athrow
		// @64: aload_0
		// @65: getfield game.C_100033_gj[] game.C_100033_gj.field_101914_ec
		// @68: aload_0
		// @69: getfield int game.C_100033_gj.field_101907_dc
		// @6C: aaload
		// @6D: iload_1
		// @6E: iconst_0
		// @6F: ixor
		// @70: invokevirtual game.C_100033_gj.func_101895_l(int)boolean
		// @73: istore_2
		// @74: iload_2
		// @75: ireturn
		// @76: astore_2
		// @77: aload_2
		// @78: new java.lang.StringBuilder
		// @7B: dup
		// @7C: invokespecial java.lang.StringBuilder.<init>()void
		// @7F: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @82: bipush 13 (0x0D)
		// @84: aaload
		// @85: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @88: iload_1
		// @89: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8C: bipush 41 (0x29)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @94: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @97: athrow
	}
	
	static final int[] func_101896_b(int arg0, int arg1, int arg2)
	{
		// @00: iconst_3
		// @01: iload_2
		// @02: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @05: istore_3
		// @06: iload_2
		// @07: iconst_0
		// @08: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @0B: istore #4
		// @0D: iload_0
		// @0E: bipush 35 (0x23)
		// @10: if_icmpgt @18
		// @13: aconst_null
		// @14: checkcast int[]
		// @17: areturn
		// @18: iconst_3
		// @19: iload_1
		// @1A: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @1D: istore #5
		// @1F: iload_1
		// @20: iconst_0
		// @21: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @24: istore #6
		// @26: iload #5
		// @28: i2l
		// @29: iload_3
		// @2A: i2l
		// @2B: lmul
		// @2C: ldc 435759952 (0x19f92b50)
		// @2E: lshr
		// @2F: l2i
		// @30: istore #7
		// @32: iload #6
		// @34: i2l
		// @35: iload_3
		// @36: i2l
		// @37: lmul
		// @38: ldc -116653488 (0xf90c0250)
		// @3A: lshr
		// @3B: l2i
		// @3C: istore #8
		// @3E: iload #5
		// @40: i2l
		// @41: iload #4
		// @43: i2l
		// @44: lmul
		// @45: ldc -750651760 (0xd341f690)
		// @47: lshr
		// @48: l2i
		// @49: istore #9
		// @4B: iload #4
		// @4D: i2l
		// @4E: iload #6
		// @50: i2l
		// @51: lmul
		// @52: ldc 1845826064 (0x6e051210)
		// @54: lshr
		// @55: l2i
		// @56: istore #10
		// @58: bipush 12 (0x0C)
		// @5A: newarray int[]
		// @5C: dup
		// @5D: iconst_0
		// @5E: iconst_0
		// @5F: iastore
		// @60: dup
		// @61: iconst_1
		// @62: iconst_0
		// @63: iastore
		// @64: dup
		// @65: iconst_2
		// @66: iconst_0
		// @67: iastore
		// @68: dup
		// @69: iconst_3
		// @6A: iload #6
		// @6C: iastore
		// @6D: dup
		// @6E: iconst_4
		// @6F: iconst_0
		// @70: iastore
		// @71: dup
		// @72: iconst_5
		// @73: iload #5
		// @75: iastore
		// @76: dup
		// @77: bipush 6 (0x06)
		// @79: iload #7
		// @7B: iastore
		// @7C: dup
		// @7D: bipush 7 (0x07)
		// @7F: iload #4
		// @81: iastore
		// @82: dup
		// @83: bipush 8 (0x08)
		// @85: iload #8
		// @87: ineg
		// @88: iastore
		// @89: dup
		// @8A: bipush 9 (0x09)
		// @8C: iload #9
		// @8E: ineg
		// @8F: iastore
		// @90: dup
		// @91: bipush 10 (0x0A)
		// @93: iload_3
		// @94: iastore
		// @95: dup
		// @96: bipush 11 (0x0B)
		// @98: iload #10
		// @9A: iastore
		// @9B: areturn
		// @9C: astore_3
		// @9D: aload_3
		// @9E: new java.lang.StringBuilder
		// @A1: dup
		// @A2: invokespecial java.lang.StringBuilder.<init>()void
		// @A5: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @A8: iconst_3
		// @A9: aaload
		// @AA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AD: iload_0
		// @AE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B1: bipush 44 (0x2C)
		// @B3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B6: iload_1
		// @B7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BA: bipush 44 (0x2C)
		// @BC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BF: iload_2
		// @C0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C3: bipush 41 (0x29)
		// @C5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C8: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CB: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CE: athrow
	}
	
	private final void func_101906_a(int arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: aload_0
		// @06: iload_1
		// @07: putfield int game.C_100033_gj.field_101923_Vb
		// @0A: iconst_0
		// @0B: istore #5
		// @0D: aload_0
		// @0E: getfield int game.C_100033_gj.field_101908_gc
		// @11: iconst_m1
		// @12: ixor
		// @13: iload #5
		// @15: iconst_m1
		// @16: ixor
		// @17: if_icmpge @62
		// @1A: aload_0
		// @1B: getfield int game.C_100033_gj.field_101916_fc
		// @1E: iload #5
		// @20: imul
		// @21: istore_3
		// @22: aload_0
		// @23: getfield int game.C_100033_gj.field_101923_Vb
		// @26: aload_0
		// @27: getfield int game.C_100033_gj.field_101923_Vb
		// @2A: imul
		// @2B: istore #4
		// @2D: aload_0
		// @2E: getfield game.C_100144_bm[] game.C_100033_gj.field_101924_nc
		// @31: iload #5
		// @33: aaload
		// @34: iload_3
		// @35: sipush 144 (0x0090)
		// @38: iload #4
		// @3A: isub
		// @3B: imul
		// @3C: aload_0
		// @3D: getfield int game.C_100033_gj.field_101835_xb
		// @40: ineg
		// @41: aload_0
		// @42: getfield int game.C_100033_gj.field_101921_Ub
		// @45: iadd
		// @46: iload #4
		// @48: imul
		// @49: iadd
		// @4A: sipush 144 (0x0090)
		// @4D: idiv
		// @4E: putfield int game.C_100144_bm.field_101880_Gb
		// @51: iinc #5 +1
		// @54: iload #6
		// @56: ifne @6E
		// @59: iload #6
		// @5B: ifeq @0D
		// @5E: goto @62
		// @61: athrow
		// @62: bipush 73 (0x49)
		// @64: bipush 14 (0x0E)
		// @66: iload_2
		// @67: isub
		// @68: bipush 52 (0x34)
		// @6A: idiv
		// @6B: irem
		// @6C: istore #5
		// @6E: goto @9B
		// @71: astore_3
		// @72: aload_3
		// @73: new java.lang.StringBuilder
		// @76: dup
		// @77: invokespecial java.lang.StringBuilder.<init>()void
		// @7A: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @7D: iconst_0
		// @7E: aaload
		// @7F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @82: iload_1
		// @83: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @86: bipush 44 (0x2C)
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: iload_2
		// @8C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8F: bipush 41 (0x29)
		// @91: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @94: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @97: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9A: athrow
		// @9B: return
	}
	
	public static void func_101903_f(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100033_gj.field_101929_bc
		// @04: iload_0
		// @05: bipush 56 (0x38)
		// @07: if_icmpeq @13
		// @0A: bipush 52 (0x34)
		// @0C: invokestatic game.C_100033_gj.func_101903_f(byte)void
		// @0F: goto @13
		// @12: athrow
		// @13: aconst_null
		// @14: putstatic game.C_100302_ka game.C_100033_gj.field_101926_pc
		// @17: aconst_null
		// @18: putstatic int[] game.C_100033_gj.field_101918_Wb
		// @1B: aconst_null
		// @1C: putstatic game.C_100302_ka game.C_100033_gj.field_101928_lc
		// @1F: aconst_null
		// @20: putstatic java.lang.String game.C_100033_gj.field_101919_ic
		// @23: aconst_null
		// @24: putstatic java.lang.String game.C_100033_gj.field_101922_mc
		// @27: aconst_null
		// @28: putstatic game.C_100130_tf game.C_100033_gj.field_101930_cc
		// @2B: goto @50
		// @2E: astore_1
		// @2F: aload_1
		// @30: new java.lang.StringBuilder
		// @33: dup
		// @34: invokespecial java.lang.StringBuilder.<init>()void
		// @37: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @3A: bipush 16 (0x10)
		// @3C: aaload
		// @3D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @40: iload_0
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 41 (0x29)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4F: athrow
		// @50: return
	}
	
	final void func_101904_o(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: aload_0
		// @06: getfield game.C_100144_bm[] game.C_100033_gj.field_101924_nc
		// @09: astore_2
		// @0A: iload_1
		// @0B: sipush -21723 (0xAB25)
		// @0E: if_icmpeq @12
		// @11: return
		// @12: iconst_0
		// @13: istore_3
		// @14: iload_3
		// @15: iconst_m1
		// @16: ixor
		// @17: aload_2
		// @18: arraylength
		// @19: iconst_m1
		// @1A: ixor
		// @1B: if_icmple @40
		// @1E: aload_2
		// @1F: iload_3
		// @20: aaload
		// @21: astore #4
		// @23: aload #4
		// @25: iconst_0
		// @26: putfield int game.C_100144_bm.field_101854_N
		// @29: aload #4
		// @2B: iconst_0
		// @2C: putfield boolean game.C_100144_bm.field_101861_U
		// @2F: iinc #3 +1
		// @32: iload #5
		// @34: ifne @55
		// @37: iload #5
		// @39: ifeq @14
		// @3C: goto @40
		// @3F: athrow
		// @40: aload_0
		// @41: getfield game.C_100033_gj game.C_100033_gj.field_101909_Zb
		// @44: ifnonnull @4B
		// @47: goto @61
		// @4A: athrow
		// @4B: aload_0
		// @4C: getfield game.C_100033_gj game.C_100033_gj.field_101909_Zb
		// @4F: sipush -21723 (0xAB25)
		// @52: invokevirtual game.C_100033_gj.func_101904_o(int)void
		// @55: aload_0
		// @56: getfield game.C_100033_gj game.C_100033_gj.field_101909_Zb
		// @59: iload_1
		// @5A: sipush 21768 (0x5508)
		// @5D: iadd
		// @5E: invokevirtual game.C_100033_gj.func_100583_c(int)void
		// @61: aload_0
		// @62: aconst_null
		// @63: putfield game.C_100033_gj game.C_100033_gj.field_101909_Zb
		// @66: aload_0
		// @67: iconst_m1
		// @68: putfield int game.C_100033_gj.field_101907_dc
		// @6B: aload_0
		// @6C: bipush 12 (0x0C)
		// @6E: bipush -76 (0xB4)
		// @70: invokespecial game.C_100033_gj.func_101906_a(int, int)void
		// @73: goto @98
		// @76: astore_2
		// @77: aload_2
		// @78: new java.lang.StringBuilder
		// @7B: dup
		// @7C: invokespecial java.lang.StringBuilder.<init>()void
		// @7F: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @82: bipush 14 (0x0E)
		// @84: aaload
		// @85: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @88: iload_1
		// @89: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8C: bipush 41 (0x29)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @94: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @97: athrow
		// @98: return
	}
	
	static final int func_101901_g(byte arg0)
	{
		// @00: bipush -125 (0x83)
		// @02: bipush -42 (0xD6)
		// @04: iload_0
		// @05: isub
		// @06: bipush 37 (0x25)
		// @08: idiv
		// @09: irem
		// @0A: istore_1
		// @0B: getstatic int game.C_100033_gj.field_101920_oc
		// @0E: getstatic int game.C_100197_ra.field_100866_s
		// @11: isub
		// @12: ireturn
		// @13: astore_1
		// @14: aload_1
		// @15: new java.lang.StringBuilder
		// @18: dup
		// @19: invokespecial java.lang.StringBuilder.<init>()void
		// @1C: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @1F: bipush 12 (0x0C)
		// @21: aaload
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: iload_0
		// @26: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @29: bipush 41 (0x29)
		// @2B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @31: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @34: athrow
	}
	
	final void func_101900_a(int arg0, int arg1, int arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: iconst_0
		// @06: istore #4
		// @08: aload_0
		// @09: getfield game.C_100144_bm[] game.C_100033_gj.field_101924_nc
		// @0C: arraylength
		// @0D: iconst_m1
		// @0E: ixor
		// @0F: iload #4
		// @11: iconst_m1
		// @12: ixor
		// @13: if_icmpge @5A
		// @16: aload_0
		// @17: getfield game.C_100144_bm[] game.C_100033_gj.field_101924_nc
		// @1A: iload #4
		// @1C: aaload
		// @1D: astore #5
		// @1F: iconst_1
		// @20: aload #5
		// @22: getfield int game.C_100144_bm.field_101854_N
		// @25: iload #6
		// @27: ifne @5F
		// @2A: if_icmpeq @34
		// @2D: goto @31
		// @30: athrow
		// @31: goto @52
		// @34: aload_0
		// @35: bipush -24 (0xE8)
		// @37: iload_2
		// @38: iload_3
		// @39: iload #4
		// @3B: invokespecial game.C_100033_gj.func_101902_a(byte, int, int, int)void
		// @3E: aload #5
		// @40: iload #4
		// @42: aload_0
		// @43: getfield int game.C_100033_gj.field_101907_dc
		// @46: if_icmpne @4E
		// @49: iconst_1
		// @4A: goto @4F
		// @4D: athrow
		// @4E: iconst_0
		// @4F: putfield boolean game.C_100144_bm.field_101861_U
		// @52: iinc #4 +1
		// @55: iload #6
		// @57: ifeq @08
		// @5A: aload_0
		// @5B: getfield int game.C_100033_gj.field_101907_dc
		// @5E: iload_1
		// @5F: if_icmpeq @7E
		// @62: aload_0
		// @63: getfield game.C_100033_gj[] game.C_100033_gj.field_101914_ec
		// @66: aload_0
		// @67: getfield int game.C_100033_gj.field_101907_dc
		// @6A: aaload
		// @6B: astore #4
		// @6D: aload #4
		// @6F: ifnull @7E
		// @72: aload #4
		// @74: iconst_m1
		// @75: iload_2
		// @76: iload_3
		// @77: invokevirtual game.C_100033_gj.func_101900_a(int, int, int)void
		// @7A: goto @7E
		// @7D: athrow
		// @7E: aload_0
		// @7F: getfield int game.C_100033_gj.field_101923_Vb
		// @82: iconst_m1
		// @83: ixor
		// @84: iconst_m1
		// @85: if_icmpge @98
		// @88: aload_0
		// @89: iconst_m1
		// @8A: aload_0
		// @8B: getfield int game.C_100033_gj.field_101923_Vb
		// @8E: iadd
		// @8F: bipush -87 (0xA9)
		// @91: invokespecial game.C_100033_gj.func_101906_a(int, int)void
		// @94: goto @98
		// @97: athrow
		// @98: goto @D1
		// @9B: astore #4
		// @9D: aload #4
		// @9F: new java.lang.StringBuilder
		// @A2: dup
		// @A3: invokespecial java.lang.StringBuilder.<init>()void
		// @A6: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @A9: bipush 22 (0x16)
		// @AB: aaload
		// @AC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AF: iload_1
		// @B0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B3: bipush 44 (0x2C)
		// @B5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B8: iload_2
		// @B9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BC: bipush 44 (0x2C)
		// @BE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C1: iload_3
		// @C2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C5: bipush 41 (0x29)
		// @C7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CD: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D0: athrow
		// @D1: return
	}
	
	private final void func_101902_a(byte arg0, int arg1, int arg2, int arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: aload_0
		// @006: getfield int game.C_100033_gj.field_101907_dc
		// @009: iconst_m1
		// @00A: ixor
		// @00B: iload #4
		// @00D: iconst_m1
		// @00E: ixor
		// @00F: if_icmpne @02B
		// @012: aload_0
		// @013: iload_1
		// @014: sipush -21699 (0xAB3D)
		// @017: iadd
		// @018: invokevirtual game.C_100033_gj.func_101904_o(int)void
		// @01B: aload_0
		// @01C: iconst_0
		// @01D: bipush 126 (0x7E)
		// @01F: invokespecial game.C_100033_gj.func_101906_a(int, int)void
		// @022: iload #7
		// @024: ifeq @103
		// @027: goto @02B
		// @02A: athrow
		// @02B: aconst_null
		// @02C: aload_0
		// @02D: getfield game.C_100033_gj[] game.C_100033_gj.field_101914_ec
		// @030: iload #4
		// @032: aaload
		// @033: if_acmpeq @078
		// @036: goto @03A
		// @039: athrow
		// @03A: aload_0
		// @03B: sipush -21723 (0xAB25)
		// @03E: invokevirtual game.C_100033_gj.func_101904_o(int)void
		// @041: aload_0
		// @042: iconst_0
		// @043: bipush -50 (0xCE)
		// @045: invokespecial game.C_100033_gj.func_101906_a(int, int)void
		// @048: aload_0
		// @049: iload #4
		// @04B: putfield int game.C_100033_gj.field_101907_dc
		// @04E: aload_0
		// @04F: aload_0
		// @050: getfield game.C_100033_gj[] game.C_100033_gj.field_101914_ec
		// @053: aload_0
		// @054: getfield int game.C_100033_gj.field_101907_dc
		// @057: aaload
		// @058: putfield game.C_100033_gj game.C_100033_gj.field_101909_Zb
		// @05B: aload_0
		// @05C: getfield game.C_100033_gj game.C_100033_gj.field_101909_Zb
		// @05F: bipush -116 (0x8C)
		// @061: invokestatic game.C_100116_ei.func_104116_a(game.C_100033_gj, int)void
		// @064: aload_0
		// @065: getfield game.C_100033_gj game.C_100033_gj.field_101909_Zb
		// @068: bipush 12 (0x0C)
		// @06A: bipush 78 (0x4E)
		// @06C: invokespecial game.C_100033_gj.func_101906_a(int, int)void
		// @06F: iload #7
		// @071: ifeq @103
		// @074: goto @078
		// @077: athrow
		// @078: iconst_m1
		// @079: aload_0
		// @07A: getfield int[] game.C_100033_gj.field_101911_hc
		// @07D: iload #4
		// @07F: iaload
		// @080: if_icmpne @09A
		// @083: goto @087
		// @086: athrow
		// @087: bipush -102 (0x9A)
		// @089: invokestatic game.C_100084_ug.func_104472_b(int)void
		// @08C: bipush 39 (0x27)
		// @08E: invokestatic game.C_100128_ca.func_102800_f(byte)void
		// @091: iload #7
		// @093: ifeq @103
		// @096: goto @09A
		// @099: athrow
		// @09A: aload_0
		// @09B: getfield int[] game.C_100033_gj.field_101911_hc
		// @09E: iload #4
		// @0A0: iaload
		// @0A1: ldc 32768 (0x8000)
		// @0A3: ior
		// @0A4: istore #5
		// @0A6: getstatic int game.C_100113_ek.field_104880_b
		// @0A9: istore #6
		// @0AB: iload #6
		// @0AD: ifne @0BD
		// @0B0: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @0B3: ifnull @0BD
		// @0B6: goto @0BA
		// @0B9: athrow
		// @0BA: iconst_1
		// @0BB: istore #6
		// @0BD: iload_1
		// @0BE: sipush -5292 (0xEB54)
		// @0C1: ixor
		// @0C2: iload #6
		// @0C4: invokestatic game.C_100218_am.func_103108_a(int, int)int
		// @0C7: iconst_2
		// @0C8: if_icmpeq @0CF
		// @0CB: goto @0D8
		// @0CE: athrow
		// @0CF: iload #6
		// @0D1: bipush 63 (0x3F)
		// @0D3: iconst_1
		// @0D4: iload_3
		// @0D5: invokestatic game.C_100290_jm.func_106850_a(int, int, int, int)void
		// @0D8: getstatic java.lang.String game.C_100050_vg.field_100630_m
		// @0DB: getstatic int game.C_100113_ek.field_104880_b
		// @0DE: bipush 6 (0x06)
		// @0E0: aconst_null
		// @0E1: iload_2
		// @0E2: iload #5
		// @0E4: invokestatic game.C_100263_mb.func_106503_a(java.lang.String, int, byte, java.lang.String, int, int)void
		// @0E7: getstatic int game.C_100113_ek.field_104880_b
		// @0EA: bipush -53 (0xCB)
		// @0EC: iload #5
		// @0EE: getstatic java.lang.String game.C_100050_vg.field_100630_m
		// @0F1: getstatic long game.C_100290_jm.field_106867_i
		// @0F4: invokestatic game.C_100018_wk.func_101502_a(int, byte, int, java.lang.String, long)void
		// @0F7: bipush 39 (0x27)
		// @0F9: invokestatic game.C_100128_ca.func_102800_f(byte)void
		// @0FC: iload_1
		// @0FD: bipush 24 (0x18)
		// @0FF: iadd
		// @100: invokestatic game.C_100285_nk.func_106776_a(int)void
		// @103: iload_1
		// @104: bipush -24 (0xE8)
		// @106: if_icmpeq @112
		// @109: bipush 123 (0x7B)
		// @10B: putstatic int game.C_100033_gj.field_101920_oc
		// @10E: goto @112
		// @111: athrow
		// @112: goto @154
		// @115: astore #5
		// @117: aload #5
		// @119: new java.lang.StringBuilder
		// @11C: dup
		// @11D: invokespecial java.lang.StringBuilder.<init>()void
		// @120: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @123: iconst_1
		// @124: aaload
		// @125: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @128: iload_1
		// @129: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @12C: bipush 44 (0x2C)
		// @12E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @131: iload_2
		// @132: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @135: bipush 44 (0x2C)
		// @137: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13A: iload_3
		// @13B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @13E: bipush 44 (0x2C)
		// @140: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @143: iload #4
		// @145: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @148: bipush 41 (0x29)
		// @14A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @14D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @150: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @153: athrow
		// @154: return
	}
	
	C_100033_gj(long arg0, C_100302_ka arg1, C_100302_ka arg2, C_100302_ka arg3, C_100033_gj[] arg4, int[] arg5, String[] arg6, char[] arg7)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #16
		// @005: aload_0
		// @006: lload_1
		// @007: aload_3
		// @008: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @00B: aload_0
		// @00C: iconst_m1
		// @00D: putfield int game.C_100033_gj.field_101907_dc
		// @010: aload_0
		// @011: aload #9
		// @013: putfield char[] game.C_100033_gj.field_101910_Xb
		// @016: aload_0
		// @017: aload #6
		// @019: putfield game.C_100033_gj[] game.C_100033_gj.field_101914_ec
		// @01C: aload_0
		// @01D: aload #7
		// @01F: putfield int[] game.C_100033_gj.field_101911_hc
		// @022: aload_0
		// @023: aload_0
		// @024: getfield int[] game.C_100033_gj.field_101911_hc
		// @027: arraylength
		// @028: putfield int game.C_100033_gj.field_101908_gc
		// @02B: aload #5
		// @02D: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @030: astore #10
		// @032: aload_0
		// @033: aload #10
		// @035: getfield int game.C_100112_r.field_101772_Q
		// @038: iconst_2
		// @039: aload #10
		// @03B: getfield int game.C_100112_r.field_101763_H
		// @03E: iadd
		// @03F: iadd
		// @040: putfield int game.C_100033_gj.field_101916_fc
		// @043: aload_0
		// @044: aload_0
		// @045: getfield int game.C_100033_gj.field_101908_gc
		// @048: anewarray game.C_100144_bm
		// @04B: putfield game.C_100144_bm[] game.C_100033_gj.field_101924_nc
		// @04E: aload_0
		// @04F: iconst_0
		// @050: putfield int game.C_100033_gj.field_101925_kc
		// @053: aload_0
		// @054: aload_0
		// @055: getfield int game.C_100033_gj.field_101908_gc
		// @058: aload_0
		// @059: getfield int game.C_100033_gj.field_101916_fc
		// @05C: imul
		// @05D: putfield int game.C_100033_gj.field_101915_qc
		// @060: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @063: bipush 19 (0x13)
		// @065: aaload
		// @066: astore #11
		// @068: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @06B: bipush 20 (0x14)
		// @06D: aaload
		// @06E: astore #12
		// @070: iconst_0
		// @071: istore #13
		// @073: aload_0
		// @074: getfield int game.C_100033_gj.field_101908_gc
		// @077: iload #13
		// @079: if_icmple @144
		// @07C: iload #16
		// @07E: ifne @15E
		// @081: iconst_0
		// @082: aload_0
		// @083: getfield char[] game.C_100033_gj.field_101910_Xb
		// @086: iload #13
		// @088: caload
		// @089: if_icmpge @0D0
		// @08C: goto @090
		// @08F: athrow
		// @090: aload #8
		// @092: iload #13
		// @094: new java.lang.StringBuilder
		// @097: dup
		// @098: invokespecial java.lang.StringBuilder.<init>()void
		// @09B: aload #11
		// @09D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0A0: bipush 60 (0x3C)
		// @0A2: aload_0
		// @0A3: getfield char[] game.C_100033_gj.field_101910_Xb
		// @0A6: iload #13
		// @0A8: caload
		// @0A9: invokestatic game.C_100101_fc.func_103393_a(byte, char)java.lang.String
		// @0AC: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @0AF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0B2: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @0B5: bipush 11 (0x0B)
		// @0B7: aaload
		// @0B8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0BB: aload #12
		// @0BD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0C0: aload #8
		// @0C2: iload #13
		// @0C4: aaload
		// @0C5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0C8: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0CB: aastore
		// @0CC: goto @0D0
		// @0CF: athrow
		// @0D0: aconst_null
		// @0D1: astore #14
		// @0D3: aload_0
		// @0D4: getfield game.C_100033_gj[] game.C_100033_gj.field_101914_ec
		// @0D7: iload #13
		// @0D9: aaload
		// @0DA: ifnonnull @0F0
		// @0DD: iconst_m1
		// @0DE: aload_0
		// @0DF: getfield int[] game.C_100033_gj.field_101911_hc
		// @0E2: iload #13
		// @0E4: iaload
		// @0E5: if_icmpeq @0F0
		// @0E8: goto @0EC
		// @0EB: athrow
		// @0EC: goto @0F5
		// @0EF: athrow
		// @0F0: getstatic game.C_100037_wb game.C_100087_n.field_100705_y
		// @0F3: astore #14
		// @0F5: aload_0
		// @0F6: getfield game.C_100144_bm[] game.C_100033_gj.field_101924_nc
		// @0F9: iload #13
		// @0FB: new game.C_100144_bm
		// @0FE: dup
		// @0FF: lconst_0
		// @100: aload #4
		// @102: aconst_null
		// @103: aload #5
		// @105: aload #14
		// @107: aload #8
		// @109: iload #13
		// @10B: aaload
		// @10C: invokespecial game.C_100144_bm.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100037_wb, java.lang.String)void
		// @10F: aastore
		// @110: aload_0
		// @111: bipush -75 (0xB5)
		// @113: aload_0
		// @114: getfield game.C_100144_bm[] game.C_100033_gj.field_101924_nc
		// @117: iload #13
		// @119: aaload
		// @11A: invokevirtual game.C_100033_gj.func_101824_b(int, game.C_100302_ka)void
		// @11D: aload #10
		// @11F: aload #8
		// @121: iload #13
		// @123: aaload
		// @124: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @127: istore #15
		// @129: iload #15
		// @12B: aload_0
		// @12C: getfield int game.C_100033_gj.field_101925_kc
		// @12F: if_icmple @13C
		// @132: aload_0
		// @133: iload #15
		// @135: putfield int game.C_100033_gj.field_101925_kc
		// @138: goto @13C
		// @13B: athrow
		// @13C: iinc #13 +1
		// @13F: iload #16
		// @141: ifeq @073
		// @144: aload_0
		// @145: dup
		// @146: getfield int game.C_100033_gj.field_101925_kc
		// @149: getstatic game.C_100037_wb game.C_100087_n.field_100705_y
		// @14C: getfield int game.C_100037_wb.field_102341_y
		// @14F: bipush -10 (0xF6)
		// @151: isub
		// @152: iadd
		// @153: putfield int game.C_100033_gj.field_101925_kc
		// @156: aload_0
		// @157: bipush 12 (0x0C)
		// @159: bipush -63 (0xC1)
		// @15B: invokespecial game.C_100033_gj.func_101906_a(int, int)void
		// @15E: goto @24F
		// @161: astore #10
		// @163: aload #10
		// @165: new java.lang.StringBuilder
		// @168: dup
		// @169: invokespecial java.lang.StringBuilder.<init>()void
		// @16C: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @16F: bipush 21 (0x15)
		// @171: aaload
		// @172: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @175: lload_1
		// @176: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @179: bipush 44 (0x2C)
		// @17B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17E: aload_3
		// @17F: ifnull @18C
		// @182: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @185: bipush 9 (0x09)
		// @187: aaload
		// @188: goto @192
		// @18B: athrow
		// @18C: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @18F: bipush 10 (0x0A)
		// @191: aaload
		// @192: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @195: bipush 44 (0x2C)
		// @197: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @19A: aload #4
		// @19C: ifnull @1A9
		// @19F: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @1A2: bipush 9 (0x09)
		// @1A4: aaload
		// @1A5: goto @1AF
		// @1A8: athrow
		// @1A9: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @1AC: bipush 10 (0x0A)
		// @1AE: aaload
		// @1AF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1B2: bipush 44 (0x2C)
		// @1B4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1B7: aload #5
		// @1B9: ifnull @1C6
		// @1BC: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @1BF: bipush 9 (0x09)
		// @1C1: aaload
		// @1C2: goto @1CC
		// @1C5: athrow
		// @1C6: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @1C9: bipush 10 (0x0A)
		// @1CB: aaload
		// @1CC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1CF: bipush 44 (0x2C)
		// @1D1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D4: aload #6
		// @1D6: ifnull @1E3
		// @1D9: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @1DC: bipush 9 (0x09)
		// @1DE: aaload
		// @1DF: goto @1E9
		// @1E2: athrow
		// @1E3: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @1E6: bipush 10 (0x0A)
		// @1E8: aaload
		// @1E9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1EC: bipush 44 (0x2C)
		// @1EE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F1: aload #7
		// @1F3: ifnull @200
		// @1F6: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @1F9: bipush 9 (0x09)
		// @1FB: aaload
		// @1FC: goto @206
		// @1FF: athrow
		// @200: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @203: bipush 10 (0x0A)
		// @205: aaload
		// @206: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @209: bipush 44 (0x2C)
		// @20B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @20E: aload #8
		// @210: ifnull @21D
		// @213: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @216: bipush 9 (0x09)
		// @218: aaload
		// @219: goto @223
		// @21C: athrow
		// @21D: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @220: bipush 10 (0x0A)
		// @222: aaload
		// @223: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @226: bipush 44 (0x2C)
		// @228: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @22B: aload #9
		// @22D: ifnull @23A
		// @230: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @233: bipush 9 (0x09)
		// @235: aaload
		// @236: goto @240
		// @239: athrow
		// @23A: getstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @23D: bipush 10 (0x0A)
		// @23F: aaload
		// @240: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @243: bipush 41 (0x29)
		// @245: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @248: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @24B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @24E: athrow
		// @24F: return
	}
	
	static
	{
		// @000: bipush 23 (0x17)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "\u001f'<7R"
		// @009: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "\u001f'<:R"
		// @014: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @017: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "\u001f'<,R"
		// @01F: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @022: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "\u001f'<.R"
		// @02A: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "%m"
		// @035: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @038: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "D$\u007f\u0018GHs"
		// @040: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @043: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "#n"
		// @04C: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "D$\u007f\u0018GIs"
		// @058: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "\u001f'<8R"
		// @064: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @067: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "\u0003c<Q\u0007"
		// @070: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @073: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "\u00168~\u0013"
		// @07C: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "Bm"
		// @088: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "\u001f'<6R"
		// @094: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @097: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "\u001f'<9R"
		// @0A0: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "\u001f'<=R"
		// @0AC: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: dup
		// @0B4: bipush 15 (0x0F)
		// @0B6: ldc "\u001f'<+R"
		// @0B8: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: ldc "\u001f'<>R"
		// @0C4: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @0C7: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 17 (0x11)
		// @0CE: ldc "\u001f'<-R"
		// @0D0: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @0D3: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 18 (0x12)
		// @0DA: ldc "\u001f'<;R"
		// @0DC: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @0DF: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @0E2: aastore
		// @0E3: dup
		// @0E4: bipush 19 (0x13)
		// @0E6: ldc "D.}\u0013GAt+FCAs"
		// @0E8: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @0EB: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @0EE: aastore
		// @0EF: dup
		// @0F0: bipush 20 (0x14)
		// @0F2: ldc "Dbq\u0010\u0016F"
		// @0F4: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @0F7: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @0FA: aastore
		// @0FB: dup
		// @0FC: bipush 21 (0x15)
		// @0FE: ldc "\u001f'<C\u0013\u0016$fAR"
		// @100: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @103: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @106: aastore
		// @107: dup
		// @108: bipush 22 (0x16)
		// @10A: ldc "\u001f'<<R"
		// @10C: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @10F: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @112: aastore
		// @113: putstatic java.lang.String[] game.C_100033_gj.field_101913_rc
		// @116: ldc "9\u0001FTF\u0011 uBHNs2\u001b\u0008\u0017=a_\u000e\u0019?u\u001a\u000eX!}\u001c\u0011Bm]\u0011"
		// @118: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @11B: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @11E: putstatic java.lang.String game.C_100033_gj.field_101922_mc
		// @121: ldc "9.q\u001a\n\u000cmg\u0011\u0008\u00199w\u001bZ\n(\u007f\u001e\u000e\u001b%"
		// @123: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @126: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @129: putstatic java.lang.String game.C_100033_gj.field_101929_bc
		// @12C: ldc "!\"g_\u0014\u001d(v_\u000e\u0017mb\u0013\u001b\u0001m#_\u0017\u0017?w_\u0008\u00199w\u001bZ\u001f,\u007f\u001aZ\u000c\"2\n\u0014\u0014\"q\u0014Z\u000c%{\u000cZ\u0017=f\u0016\u0015\u0016c"
		// @12E: invokestatic game.C_100033_gj.func_101897_z(java.lang.String)char[]
		// @131: invokestatic game.C_100033_gj.func_101894_z(char[])java.lang.String
		// @134: putstatic java.lang.String game.C_100033_gj.field_101919_ic
		// @137: new game.C_100130_tf
		// @13A: dup
		// @13B: invokespecial game.C_100130_tf.<init>()void
		// @13E: putstatic game.C_100130_tf game.C_100033_gj.field_101930_cc
		// @141: return
	}
	
	private static char[] func_101897_z(String arg0)
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
	
	private static String func_101894_z(char[] arg0)
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
		// @30: bipush 120 (0x78)
		// @32: goto @46
		// @35: bipush 77 (0x4D)
		// @37: goto @46
		// @3A: bipush 18 (0x12)
		// @3C: goto @46
		// @3F: bipush 127 (0x7F)
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
