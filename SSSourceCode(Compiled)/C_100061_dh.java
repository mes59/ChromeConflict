package game;

final class C_100061_dh extends C_100302_ka
{
	static String field_101989_ic;
	static int field_101987_Wb;
	String field_101997_ac;
	static int field_101980_gc;
	static String[] field_101991_Ub;
	static int field_101986_fc;
	C_100302_ka field_101998_lc;
	static String field_101988_jc;
	static C_100302_ka field_101985_ec;
	C_100302_ka field_101982_Xb;
	int field_101984_hc;
	static int[] field_102000_cc;
	C_100302_ka field_101999_bc;
	String field_101996_kc;
	static String field_101994_Vb;
	static int[] field_101979_dc;
	static C_100037_wb field_101981_Zb;
	static C_100129_tg field_101992_mc;
	String field_101993_nc;
	String field_101990_oc;
	static String field_101983_Yb;
	private static final String[] field_101995_pc;
	
	C_100061_dh()
	{
		// @0: aload_0
		// @1: lconst_0
		// @2: aconst_null
		// @3: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @6: return
	}
	
	public static void func_101974_l(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100037_wb game.C_100061_dh.field_101981_Zb
		// @04: aconst_null
		// @05: putstatic game.C_100129_tg game.C_100061_dh.field_101992_mc
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100061_dh.field_101983_Yb
		// @0C: aconst_null
		// @0D: putstatic java.lang.String[] game.C_100061_dh.field_101991_Ub
		// @10: aconst_null
		// @11: putstatic int[] game.C_100061_dh.field_101979_dc
		// @14: aconst_null
		// @15: putstatic game.C_100302_ka game.C_100061_dh.field_101985_ec
		// @18: aconst_null
		// @19: putstatic java.lang.String game.C_100061_dh.field_101988_jc
		// @1C: aconst_null
		// @1D: putstatic java.lang.String game.C_100061_dh.field_101989_ic
		// @20: aconst_null
		// @21: putstatic java.lang.String game.C_100061_dh.field_101994_Vb
		// @24: iload_0
		// @25: sipush 9576 (0x2568)
		// @28: if_icmpeq @2C
		// @2B: return
		// @2C: aconst_null
		// @2D: putstatic int[] game.C_100061_dh.field_102000_cc
		// @30: goto @54
		// @33: astore_1
		// @34: aload_1
		// @35: new java.lang.StringBuilder
		// @38: dup
		// @39: invokespecial java.lang.StringBuilder.<init>()void
		// @3C: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @3F: iconst_2
		// @40: aaload
		// @41: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @44: iload_0
		// @45: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @48: bipush 41 (0x29)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @50: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @53: athrow
		// @54: return
	}
	
	static final void func_101977_a(boolean arg0, C_100112_r arg1, int arg2, C_100037_wb[] arg3, int arg4, C_100037_wb[] arg5, int arg6, C_100037_wb[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, C_100112_r arg18, int arg19, int arg20)
	{
		// @000: iload_0
		// @001: iconst_1
		// @002: if_icmpeq @00E
		// @005: bipush -63 (0xC1)
		// @007: putstatic int game.C_100061_dh.field_101987_Wb
		// @00A: goto @00E
		// @00D: athrow
		// @00E: iload #11
		// @010: sipush 3241 (0x0CA9)
		// @013: iload #17
		// @015: iload #10
		// @017: iload #19
		// @019: iload #20
		// @01B: iload #14
		// @01D: new game.C_100127_tl
		// @020: dup
		// @021: aload_3
		// @022: invokespecial game.C_100127_tl.<init>(game.C_100037_wb[])void
		// @025: iload #6
		// @027: iload #8
		// @029: iload #9
		// @02B: iload #16
		// @02D: new game.C_100127_tl
		// @030: dup
		// @031: aload #7
		// @033: invokespecial game.C_100127_tl.<init>(game.C_100037_wb[])void
		// @036: iload_2
		// @037: iload #13
		// @039: new game.C_100127_tl
		// @03C: dup
		// @03D: aload #5
		// @03F: invokespecial game.C_100127_tl.<init>(game.C_100037_wb[])void
		// @042: iload #12
		// @044: iload #15
		// @046: aload #18
		// @048: aload_1
		// @049: iload #4
		// @04B: invokestatic game.C_100001_ge.func_100559_a(int, int, int, int, int, int, int, game.C_100127_tl, int, int, int, int, game.C_100127_tl, int, int, game.C_100127_tl, int, int, game.C_100112_r, game.C_100112_r, int)void
		// @04E: goto @18F
		// @051: astore #21
		// @053: aload #21
		// @055: new java.lang.StringBuilder
		// @058: dup
		// @059: invokespecial java.lang.StringBuilder.<init>()void
		// @05C: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @05F: bipush 6 (0x06)
		// @061: aaload
		// @062: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @065: iload_0
		// @066: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @069: bipush 44 (0x2C)
		// @06B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @06E: aload_1
		// @06F: ifnull @07B
		// @072: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @075: iconst_5
		// @076: aaload
		// @077: goto @080
		// @07A: athrow
		// @07B: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @07E: iconst_3
		// @07F: aaload
		// @080: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @083: bipush 44 (0x2C)
		// @085: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @088: iload_2
		// @089: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @08C: bipush 44 (0x2C)
		// @08E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @091: aload_3
		// @092: ifnull @09E
		// @095: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @098: iconst_5
		// @099: aaload
		// @09A: goto @0A3
		// @09D: athrow
		// @09E: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @0A1: iconst_3
		// @0A2: aaload
		// @0A3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0A6: bipush 44 (0x2C)
		// @0A8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0AB: iload #4
		// @0AD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0B0: bipush 44 (0x2C)
		// @0B2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0B5: aload #5
		// @0B7: ifnull @0C3
		// @0BA: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @0BD: iconst_5
		// @0BE: aaload
		// @0BF: goto @0C8
		// @0C2: athrow
		// @0C3: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @0C6: iconst_3
		// @0C7: aaload
		// @0C8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0CB: bipush 44 (0x2C)
		// @0CD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D0: iload #6
		// @0D2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D5: bipush 44 (0x2C)
		// @0D7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0DA: aload #7
		// @0DC: ifnull @0E8
		// @0DF: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @0E2: iconst_5
		// @0E3: aaload
		// @0E4: goto @0ED
		// @0E7: athrow
		// @0E8: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @0EB: iconst_3
		// @0EC: aaload
		// @0ED: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F0: bipush 44 (0x2C)
		// @0F2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F5: iload #8
		// @0F7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0FA: bipush 44 (0x2C)
		// @0FC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FF: iload #9
		// @101: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @104: bipush 44 (0x2C)
		// @106: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @109: iload #10
		// @10B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @10E: bipush 44 (0x2C)
		// @110: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @113: iload #11
		// @115: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @118: bipush 44 (0x2C)
		// @11A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @11D: iload #12
		// @11F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @122: bipush 44 (0x2C)
		// @124: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @127: iload #13
		// @129: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @12C: bipush 44 (0x2C)
		// @12E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @131: iload #14
		// @133: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @136: bipush 44 (0x2C)
		// @138: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13B: iload #15
		// @13D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @140: bipush 44 (0x2C)
		// @142: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @145: iload #16
		// @147: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @14A: bipush 44 (0x2C)
		// @14C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @14F: iload #17
		// @151: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @154: bipush 44 (0x2C)
		// @156: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @159: aload #18
		// @15B: ifnull @167
		// @15E: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @161: iconst_5
		// @162: aaload
		// @163: goto @16C
		// @166: athrow
		// @167: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @16A: iconst_3
		// @16B: aaload
		// @16C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16F: bipush 44 (0x2C)
		// @171: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @174: iload #19
		// @176: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @179: bipush 44 (0x2C)
		// @17B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17E: iload #20
		// @180: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @183: bipush 41 (0x29)
		// @185: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @188: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @18B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @18E: athrow
		// @18F: return
	}
	
	static final byte[] func_101973_a(byte[] arg0, C_100278_nd arg1, boolean arg2, int arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: aload_1
		// @006: iload_3
		// @007: sipush 15738 (0x3D7A)
		// @00A: invokevirtual game.C_100278_nd.func_101195_i(int, int)int
		// @00D: istore #4
		// @00F: iload #4
		// @011: iconst_m1
		// @012: ixor
		// @013: iconst_m1
		// @014: if_icmpeq @01B
		// @017: goto @01D
		// @01A: athrow
		// @01B: aconst_null
		// @01C: areturn
		// @01D: aload_0
		// @01E: ifnull @034
		// @021: aload_0
		// @022: arraylength
		// @023: iconst_m1
		// @024: ixor
		// @025: iload #4
		// @027: iconst_m1
		// @028: ixor
		// @029: if_icmpne @034
		// @02C: goto @030
		// @02F: athrow
		// @030: goto @039
		// @033: athrow
		// @034: iload #4
		// @036: newarray byte[]
		// @038: astore_0
		// @039: iload_2
		// @03A: ifeq @042
		// @03D: aconst_null
		// @03E: checkcast byte[]
		// @041: areturn
		// @042: aload_1
		// @043: iconst_3
		// @044: sipush 15738 (0x3D7A)
		// @047: invokevirtual game.C_100278_nd.func_101195_i(int, int)int
		// @04A: istore #5
		// @04C: aload_1
		// @04D: bipush 8 (0x08)
		// @04F: sipush 15738 (0x3D7A)
		// @052: invokevirtual game.C_100278_nd.func_101195_i(int, int)int
		// @055: i2b
		// @056: istore #6
		// @058: iload #5
		// @05A: ifle @092
		// @05D: iconst_0
		// @05E: istore #7
		// @060: iload #7
		// @062: iconst_m1
		// @063: ixor
		// @064: iload #4
		// @066: iconst_m1
		// @067: ixor
		// @068: if_icmple @08D
		// @06B: aload_0
		// @06C: iload #7
		// @06E: iload #6
		// @070: aload_1
		// @071: iload #5
		// @073: sipush 15738 (0x3D7A)
		// @076: invokevirtual game.C_100278_nd.func_101195_i(int, int)int
		// @079: iadd
		// @07A: i2b
		// @07B: bastore
		// @07C: iinc #7 +1
		// @07F: iload #8
		// @081: ifne @0B3
		// @084: iload #8
		// @086: ifeq @060
		// @089: goto @08D
		// @08C: athrow
		// @08D: iload #8
		// @08F: ifeq @0B3
		// @092: iconst_0
		// @093: istore #7
		// @095: iload #4
		// @097: iload #7
		// @099: if_icmple @0B3
		// @09C: aload_0
		// @09D: iload #8
		// @09F: ifne @0B4
		// @0A2: iload #7
		// @0A4: iload #6
		// @0A6: bastore
		// @0A7: iinc #7 +1
		// @0AA: iload #8
		// @0AC: ifeq @095
		// @0AF: goto @0B3
		// @0B2: athrow
		// @0B3: aload_0
		// @0B4: areturn
		// @0B5: astore #4
		// @0B7: aload #4
		// @0B9: new java.lang.StringBuilder
		// @0BC: dup
		// @0BD: invokespecial java.lang.StringBuilder.<init>()void
		// @0C0: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @0C3: iconst_4
		// @0C4: aaload
		// @0C5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0C8: aload_0
		// @0C9: ifnull @0D5
		// @0CC: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @0CF: iconst_5
		// @0D0: aaload
		// @0D1: goto @0DA
		// @0D4: athrow
		// @0D5: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @0D8: iconst_3
		// @0D9: aaload
		// @0DA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0DD: bipush 44 (0x2C)
		// @0DF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E2: aload_1
		// @0E3: ifnull @0EF
		// @0E6: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @0E9: iconst_5
		// @0EA: aaload
		// @0EB: goto @0F4
		// @0EE: athrow
		// @0EF: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @0F2: iconst_3
		// @0F3: aaload
		// @0F4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F7: bipush 44 (0x2C)
		// @0F9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FC: iload_2
		// @0FD: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @100: bipush 44 (0x2C)
		// @102: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @105: iload_3
		// @106: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @109: bipush 41 (0x29)
		// @10B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @111: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @114: athrow
	}
	
	static final void func_101978_a(int arg0, int arg1)
	{
		// @00: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @03: iconst_1
		// @04: aaload
		// @05: iconst_0
		// @06: invokestatic game.C_100206_qe.func_105938_b(boolean)java.applet.Applet
		// @09: bipush -127 (0x81)
		// @0B: iconst_1
		// @0C: anewarray java.lang.Object
		// @0F: dup
		// @10: iconst_0
		// @11: new java.lang.Integer
		// @14: dup
		// @15: iload_0
		// @16: invokespecial java.lang.Integer.<init>(int)void
		// @19: aastore
		// @1A: invokestatic game.C_100175_cl.func_105613_a(java.lang.String, java.applet.Applet, byte, java.lang.Object[])java.lang.Object
		// @1D: pop
		// @1E: goto @22
		// @21: astore_2
		// @22: iload_1
		// @23: bipush 24 (0x18)
		// @25: if_icmpeq @31
		// @28: bipush 114 (0x72)
		// @2A: putstatic int game.C_100061_dh.field_101987_Wb
		// @2D: goto @31
		// @30: athrow
		// @31: goto @5E
		// @34: astore_2
		// @35: aload_2
		// @36: new java.lang.StringBuilder
		// @39: dup
		// @3A: invokespecial java.lang.StringBuilder.<init>()void
		// @3D: getstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @40: iconst_0
		// @41: aaload
		// @42: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @45: iload_0
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 44 (0x2C)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: iload_1
		// @4F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @52: bipush 41 (0x29)
		// @54: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @57: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5D: athrow
		// @5E: return
	}
	
	static
	{
		// @000: bipush 7 (0x07)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "z;\\_\u0010"
		// @009: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "l6\u0001wBw=\u0015"
		// @014: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @017: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "z;\\Z\u0010"
		// @01F: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @022: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "p&\u001er"
		// @02A: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "z;\\\\\u0010"
		// @035: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @038: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "e}\\0E"
		// @040: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @043: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "z;\\]\u0010"
		// @04C: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @052: aastore
		// @053: putstatic java.lang.String[] game.C_100061_dh.field_101995_pc
		// @056: iconst_0
		// @057: putstatic int game.C_100061_dh.field_101986_fc
		// @05A: ldc "]2\u001c}]rs\u0016lYi"
		// @05C: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @05F: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @062: putstatic java.lang.String game.C_100061_dh.field_101988_jc
		// @065: iconst_4
		// @066: newarray int[]
		// @068: dup
		// @069: iconst_0
		// @06A: iconst_3
		// @06B: iastore
		// @06C: dup
		// @06D: iconst_1
		// @06E: iconst_4
		// @06F: iastore
		// @070: dup
		// @071: iconst_2
		// @072: iconst_m1
		// @073: iastore
		// @074: dup
		// @075: iconst_3
		// @076: bipush 8 (0x08)
		// @078: iastore
		// @079: putstatic int[] game.C_100061_dh.field_101979_dc
		// @07C: bipush 20 (0x14)
		// @07E: newarray int[]
		// @080: dup
		// @081: iconst_0
		// @082: bipush 84 (0x54)
		// @084: iastore
		// @085: dup
		// @086: iconst_1
		// @087: bipush 104 (0x68)
		// @089: iastore
		// @08A: dup
		// @08B: iconst_2
		// @08C: bipush 29 (0x1D)
		// @08E: iastore
		// @08F: dup
		// @090: iconst_3
		// @091: bipush 87 (0x57)
		// @093: iastore
		// @094: dup
		// @095: iconst_4
		// @096: bipush 29 (0x1D)
		// @098: iastore
		// @099: dup
		// @09A: iconst_5
		// @09B: bipush 24 (0x18)
		// @09D: iastore
		// @09E: dup
		// @09F: bipush 6 (0x06)
		// @0A1: bipush 24 (0x18)
		// @0A3: iastore
		// @0A4: dup
		// @0A5: bipush 7 (0x07)
		// @0A7: bipush 24 (0x18)
		// @0A9: iastore
		// @0AA: dup
		// @0AB: bipush 8 (0x08)
		// @0AD: bipush 86 (0x56)
		// @0AF: iastore
		// @0B0: dup
		// @0B1: bipush 9 (0x09)
		// @0B3: bipush 85 (0x55)
		// @0B5: iastore
		// @0B6: dup
		// @0B7: bipush 10 (0x0A)
		// @0B9: bipush 47 (0x2F)
		// @0BB: iastore
		// @0BC: dup
		// @0BD: bipush 11 (0x0B)
		// @0BF: bipush 17 (0x11)
		// @0C1: iastore
		// @0C2: dup
		// @0C3: bipush 12 (0x0C)
		// @0C5: iconst_3
		// @0C6: iastore
		// @0C7: dup
		// @0C8: bipush 13 (0x0D)
		// @0CA: bipush 8 (0x08)
		// @0CC: iastore
		// @0CD: dup
		// @0CE: bipush 14 (0x0E)
		// @0D0: bipush 31 (0x1F)
		// @0D2: iastore
		// @0D3: dup
		// @0D4: bipush 15 (0x0F)
		// @0D6: bipush 29 (0x1D)
		// @0D8: iastore
		// @0D9: dup
		// @0DA: bipush 16 (0x10)
		// @0DC: bipush 16 (0x10)
		// @0DE: iastore
		// @0DF: dup
		// @0E0: bipush 17 (0x11)
		// @0E2: bipush 13 (0x0D)
		// @0E4: iastore
		// @0E5: dup
		// @0E6: bipush 18 (0x12)
		// @0E8: bipush 17 (0x11)
		// @0EA: iastore
		// @0EB: dup
		// @0EC: bipush 19 (0x13)
		// @0EE: iconst_m1
		// @0EF: iastore
		// @0F0: putstatic int[] game.C_100061_dh.field_102000_cc
		// @0F3: iconst_m1
		// @0F4: putstatic int game.C_100061_dh.field_101980_gc
		// @0F7: ldc "L2\u0006{\\>4\u0013s]"
		// @0F9: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @0FC: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @0FF: putstatic java.lang.String game.C_100061_dh.field_101994_Vb
		// @102: ldc "X!\u001b{Vz "
		// @104: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @107: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @10A: putstatic java.lang.String game.C_100061_dh.field_101983_Yb
		// @10D: bipush 12 (0x0C)
		// @10F: anewarray java.lang.String
		// @112: dup
		// @113: iconst_0
		// @114: ldc "]\u001b3MkW\u0000"
		// @116: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @119: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @11C: aastore
		// @11D: dup
		// @11E: iconst_1
		// @11F: ldc "V\u00163Z"
		// @121: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @124: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @127: aastore
		// @128: dup
		// @129: iconst_2
		// @12A: ldc "_\u0001?"
		// @12C: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @12F: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @132: aastore
		// @133: dup
		// @134: iconst_3
		// @135: ldc "I\u001a<Y"
		// @137: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @13A: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @13D: aastore
		// @13E: dup
		// @13F: iconst_4
		// @140: ldc "\":\u001fy\u0005&mRRqY\u001b&>o[\u0012\"QvM"
		// @142: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @145: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @148: aastore
		// @149: dup
		// @14A: iconst_5
		// @14B: ldc "\":\u001fy\u0005'mRV}_\u0005+>o[\u0012\"QvM"
		// @14D: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @150: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @153: aastore
		// @154: dup
		// @155: bipush 6 (0x06)
		// @157: ldc "\":\u001fy\u0005/cL>wL\u0017<_v]\u0016RI}_\u0003=Pk"
		// @159: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @15C: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @15F: aastore
		// @160: dup
		// @161: bipush 7 (0x07)
		// @163: ldc "\":\u001fy\u0005/bL>kS\u0012>R\u0018L\u001c1U}J\u0000R_vZs?WkM\u001a>[k"
		// @165: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @168: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @16B: aastore
		// @16C: dup
		// @16D: bipush 8 (0x08)
		// @16F: ldc "\":\u001fy\u0005/aL>t_\u00015[\u0018L\u001c1U}J\u0000R_vZs?WkM\u001a>[k"
		// @171: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @174: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @177: aastore
		// @178: dup
		// @179: bipush 9 (0x09)
		// @17B: ldc "\":\u001fy\u0005/kL>vK\u00187>\u0015>\u0014=R}Ss1VyM\u0000;M\u0018Q\u001d>G"
		// @17D: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @180: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @183: aastore
		// @184: dup
		// @185: bipush 10 (0x0A)
		// @187: ldc "L\u00163L\u0018_\u0001?"
		// @189: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @18C: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @18F: aastore
		// @190: dup
		// @191: bipush 11 (0x0B)
		// @193: ldc "\\\u001a5>yL\u001e"
		// @195: invokestatic game.C_100061_dh.func_101976_z(java.lang.String)char[]
		// @198: invokestatic game.C_100061_dh.func_101975_z(char[])java.lang.String
		// @19B: aastore
		// @19C: putstatic java.lang.String[] game.C_100061_dh.field_101991_Ub
		// @19F: return
	}
	
	private static char[] func_101976_z(String arg0)
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
		// @0E: bipush 56 (0x38)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_101975_z(char[] arg0)
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
		// @30: bipush 30 (0x1E)
		// @32: goto @46
		// @35: bipush 83 (0x53)
		// @37: goto @46
		// @3A: bipush 114 (0x72)
		// @3C: goto @46
		// @3F: bipush 30 (0x1E)
		// @41: goto @46
		// @44: bipush 56 (0x38)
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
