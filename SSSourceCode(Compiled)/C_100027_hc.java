package game;

final class C_100027_hc extends C_100085_a implements C_100334_ik
{
	private C_100218_am[] field_102600_ab;
	static C_100283_ni field_102603_X;
	static String field_102601_bb;
	static String field_102593_T;
	static String field_102602_Y;
	private int[] field_102590_cb;
	private C_100112_r field_102592_U;
	private int field_102594_W;
	private C_100282_nh field_102589_db;
	static String field_102604_Z;
	static C_100282_nh field_102598_S;
	private String field_102595_V;
	static String field_102597_P;
	static int field_102596_Q;
	static String[] field_102599_R;
	private static final String[] field_102591_eb;
	
	final void func_102586_a(int arg0, String arg1, int arg2)
	{
		// @00: iload_1
		// @01: ifeq @0D
		// @04: bipush -57 (0xC7)
		// @06: putstatic int game.C_100027_hc.field_102596_Q
		// @09: goto @0D
		// @0C: athrow
		// @0D: aload_0
		// @0E: getfield int game.C_100027_hc.field_102594_W
		// @11: istore #4
		// @13: aload_0
		// @14: bipush 126 (0x7E)
		// @16: iconst_1
		// @17: iload #4
		// @19: iadd
		// @1A: invokespecial game.C_100027_hc.func_102585_a(byte, int)void
		// @1D: aload_0
		// @1E: getfield game.C_100218_am[] game.C_100027_hc.field_102600_ab
		// @21: iload #4
		// @23: aload_0
		// @24: aload_0
		// @25: iload_1
		// @26: bipush 90 (0x5A)
		// @28: invokestatic game.C_100089_fa.func_103722_a(int, int)int
		// @2B: aload_2
		// @2C: invokevirtual game.C_100027_hc.func_102588_a(game.C_100337_in, int, java.lang.String)game.C_100218_am
		// @2F: aastore
		// @30: aload_0
		// @31: getfield int[] game.C_100027_hc.field_102590_cb
		// @34: iload #4
		// @36: iload_3
		// @37: iastore
		// @38: goto @82
		// @3B: astore #4
		// @3D: aload #4
		// @3F: new java.lang.StringBuilder
		// @42: dup
		// @43: invokespecial java.lang.StringBuilder.<init>()void
		// @46: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @49: bipush 7 (0x07)
		// @4B: aaload
		// @4C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4F: iload_1
		// @50: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @53: bipush 44 (0x2C)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: aload_2
		// @59: ifnull @65
		// @5C: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @5F: iconst_1
		// @60: aaload
		// @61: goto @6A
		// @64: athrow
		// @65: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @68: iconst_2
		// @69: aaload
		// @6A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6D: bipush 44 (0x2C)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: iload_3
		// @73: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @76: bipush 41 (0x29)
		// @78: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @81: athrow
		// @82: return
	}
	
	private final void func_102585_a(byte arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: iload_2
		// @06: aload_0
		// @07: getfield int game.C_100027_hc.field_102594_W
		// @0A: if_icmple @10
		// @0D: goto @11
		// @10: return
		// @11: iload_2
		// @12: anewarray game.C_100218_am
		// @15: astore_3
		// @16: iload_1
		// @17: bipush 53 (0x35)
		// @19: if_icmpge @1D
		// @1C: return
		// @1D: iload_2
		// @1E: newarray int[]
		// @20: astore #4
		// @22: iconst_0
		// @23: istore #5
		// @25: aload_0
		// @26: getfield int game.C_100027_hc.field_102594_W
		// @29: iload #5
		// @2B: if_icmple @56
		// @2E: aload_3
		// @2F: iload #5
		// @31: aload_0
		// @32: getfield game.C_100218_am[] game.C_100027_hc.field_102600_ab
		// @35: iload #5
		// @37: aaload
		// @38: aastore
		// @39: aload #4
		// @3B: iload #5
		// @3D: aload_0
		// @3E: getfield int[] game.C_100027_hc.field_102590_cb
		// @41: iload #5
		// @43: iaload
		// @44: iastore
		// @45: iinc #5 +1
		// @48: iload #6
		// @4A: ifne @66
		// @4D: iload #6
		// @4F: ifeq @25
		// @52: goto @56
		// @55: athrow
		// @56: aload_0
		// @57: aload #4
		// @59: putfield int[] game.C_100027_hc.field_102590_cb
		// @5C: aload_0
		// @5D: iload_2
		// @5E: putfield int game.C_100027_hc.field_102594_W
		// @61: aload_0
		// @62: aload_3
		// @63: putfield game.C_100218_am[] game.C_100027_hc.field_102600_ab
		// @66: goto @94
		// @69: astore_3
		// @6A: aload_3
		// @6B: new java.lang.StringBuilder
		// @6E: dup
		// @6F: invokespecial java.lang.StringBuilder.<init>()void
		// @72: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @75: bipush 9 (0x09)
		// @77: aaload
		// @78: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7B: iload_1
		// @7C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7F: bipush 44 (0x2C)
		// @81: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @84: iload_2
		// @85: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @88: bipush 41 (0x29)
		// @8A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @90: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @93: athrow
		// @94: return
	}
	
	final C_100218_am func_102588_a(C_100337_in arg0, int arg1, String arg2)
	{
		// @00: new game.C_100218_am
		// @03: dup
		// @04: aload_3
		// @05: aload_1
		// @06: invokespecial game.C_100218_am.<init>(java.lang.String, game.C_100337_in)void
		// @09: astore #4
		// @0B: aload #4
		// @0D: new game.C_100310_lj
		// @10: dup
		// @11: invokespecial game.C_100310_lj.<init>()void
		// @14: putfield game.C_100326_ic game.C_100218_am.field_102533_B
		// @17: aload_0
		// @18: getfield int game.C_100027_hc.field_102544_t
		// @1B: iconst_2
		// @1C: isub
		// @1D: istore #5
		// @1F: iload_2
		// @20: bipush 79 (0x4F)
		// @22: if_icmpge @30
		// @25: aconst_null
		// @26: checkcast java.lang.String
		// @29: putstatic java.lang.String game.C_100027_hc.field_102601_bb
		// @2C: goto @30
		// @2F: athrow
		// @30: aload_0
		// @31: bipush 34 (0x22)
		// @33: aload_0
		// @34: getfield int game.C_100027_hc.field_102544_t
		// @37: iadd
		// @38: iconst_0
		// @39: iconst_0
		// @3A: aload_0
		// @3B: getfield int game.C_100027_hc.field_102537_l
		// @3E: bipush 43 (0x2B)
		// @40: invokevirtual game.C_100027_hc.func_102524_a(int, int, int, int, byte)void
		// @43: aload #4
		// @45: bipush 30 (0x1E)
		// @47: iload #5
		// @49: bipush 7 (0x07)
		// @4B: bipush -14 (0xF2)
		// @4D: aload_0
		// @4E: getfield int game.C_100027_hc.field_102537_l
		// @51: iadd
		// @52: bipush 83 (0x53)
		// @54: invokevirtual game.C_100218_am.func_102524_a(int, int, int, int, byte)void
		// @57: aload_0
		// @58: aload #4
		// @5A: iconst_1
		// @5B: invokevirtual game.C_100027_hc.func_102561_b(game.C_100336_im, int)void
		// @5E: aload #4
		// @60: areturn
		// @61: astore #4
		// @63: aload #4
		// @65: new java.lang.StringBuilder
		// @68: dup
		// @69: invokespecial java.lang.StringBuilder.<init>()void
		// @6C: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @6F: bipush 8 (0x08)
		// @71: aaload
		// @72: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @75: aload_1
		// @76: ifnull @82
		// @79: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @7C: iconst_1
		// @7D: aaload
		// @7E: goto @87
		// @81: athrow
		// @82: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @85: iconst_2
		// @86: aaload
		// @87: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8A: bipush 44 (0x2C)
		// @8C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8F: iload_2
		// @90: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @93: bipush 44 (0x2C)
		// @95: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @98: aload_3
		// @99: ifnull @A5
		// @9C: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @9F: iconst_1
		// @A0: aaload
		// @A1: goto @AA
		// @A4: athrow
		// @A5: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @A8: iconst_2
		// @A9: aaload
		// @AA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AD: bipush 41 (0x29)
		// @AF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B5: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @B8: athrow
	}
	
	C_100027_hc(C_100282_nh arg0, C_100112_r arg1, String arg2)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: iconst_0
		// @03: sipush 288 (0x0120)
		// @06: iconst_0
		// @07: aconst_null
		// @08: invokespecial game.C_100085_a.<init>(int, int, int, int, game.C_100326_ic)void
		// @0B: aload_0
		// @0C: iconst_0
		// @0D: putfield int game.C_100027_hc.field_102594_W
		// @10: aload_0
		// @11: aload_2
		// @12: putfield game.C_100112_r game.C_100027_hc.field_102592_U
		// @15: aload_0
		// @16: aload_1
		// @17: putfield game.C_100282_nh game.C_100027_hc.field_102589_db
		// @1A: aload_0
		// @1B: aload_3
		// @1C: putfield java.lang.String game.C_100027_hc.field_102595_V
		// @1F: aload_0
		// @20: getfield java.lang.String game.C_100027_hc.field_102595_V
		// @23: ifnonnull @2A
		// @26: iconst_0
		// @27: goto @3F
		// @2A: aload_0
		// @2B: getfield game.C_100112_r game.C_100027_hc.field_102592_U
		// @2E: aload_0
		// @2F: getfield java.lang.String game.C_100027_hc.field_102595_V
		// @32: sipush 260 (0x0104)
		// @35: aload_0
		// @36: getfield game.C_100112_r game.C_100027_hc.field_102592_U
		// @39: getfield int game.C_100112_r.field_101772_Q
		// @3C: invokevirtual game.C_100112_r.func_101734_a(java.lang.String, int, int)int
		// @3F: istore #4
		// @41: aload_0
		// @42: bipush 22 (0x16)
		// @44: iload #4
		// @46: ineg
		// @47: isub
		// @48: iconst_0
		// @49: iconst_0
		// @4A: sipush 288 (0x0120)
		// @4D: bipush 90 (0x5A)
		// @4F: invokevirtual game.C_100027_hc.func_102524_a(int, int, int, int, byte)void
		// @52: goto @BD
		// @55: astore #4
		// @57: aload #4
		// @59: new java.lang.StringBuilder
		// @5C: dup
		// @5D: invokespecial java.lang.StringBuilder.<init>()void
		// @60: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @63: iconst_3
		// @64: aaload
		// @65: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @68: aload_1
		// @69: ifnull @75
		// @6C: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @6F: iconst_1
		// @70: aaload
		// @71: goto @7A
		// @74: athrow
		// @75: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @78: iconst_2
		// @79: aaload
		// @7A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7D: bipush 44 (0x2C)
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: aload_2
		// @83: ifnull @8F
		// @86: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @89: iconst_1
		// @8A: aaload
		// @8B: goto @94
		// @8E: athrow
		// @8F: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @92: iconst_2
		// @93: aaload
		// @94: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @97: bipush 44 (0x2C)
		// @99: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9C: aload_3
		// @9D: ifnull @A9
		// @A0: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @A3: iconst_1
		// @A4: aaload
		// @A5: goto @AE
		// @A8: athrow
		// @A9: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @AC: iconst_2
		// @AD: aaload
		// @AE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B1: bipush 41 (0x29)
		// @B3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B9: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @BC: athrow
		// @BD: return
	}
	
	final void func_102528_a(int arg0, int arg1, int arg2, byte arg3)
	{
		// @00: iload #4
		// @02: bipush -126 (0x82)
		// @04: if_icmplt @08
		// @07: return
		// @08: aload_0
		// @09: iload_1
		// @0A: iload_2
		// @0B: iload_3
		// @0C: bipush -128 (0x80)
		// @0E: invokespecial game.C_100085_a.func_102528_a(int, int, int, byte)void
		// @11: aload_0
		// @12: getfield game.C_100112_r game.C_100027_hc.field_102592_U
		// @15: aload_0
		// @16: getfield java.lang.String game.C_100027_hc.field_102595_V
		// @19: bipush 14 (0x0E)
		// @1B: aload_0
		// @1C: getfield int game.C_100027_hc.field_102538_m
		// @1F: iload_3
		// @20: iadd
		// @21: iadd
		// @22: bipush 10 (0x0A)
		// @24: iload_2
		// @25: iadd
		// @26: aload_0
		// @27: getfield int game.C_100027_hc.field_102541_w
		// @2A: ineg
		// @2B: isub
		// @2C: bipush -28 (0xE4)
		// @2E: aload_0
		// @2F: getfield int game.C_100027_hc.field_102537_l
		// @32: iadd
		// @33: aload_0
		// @34: getfield int game.C_100027_hc.field_102544_t
		// @37: ldc 16777215 (0xffffff)
		// @39: iconst_m1
		// @3A: iconst_0
		// @3B: iconst_0
		// @3C: aload_0
		// @3D: getfield game.C_100112_r game.C_100027_hc.field_102592_U
		// @40: getfield int game.C_100112_r.field_101772_Q
		// @43: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @46: pop
		// @47: goto @89
		// @4A: astore #5
		// @4C: aload #5
		// @4E: new java.lang.StringBuilder
		// @51: dup
		// @52: invokespecial java.lang.StringBuilder.<init>()void
		// @55: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @58: iconst_0
		// @59: aaload
		// @5A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5D: iload_1
		// @5E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @61: bipush 44 (0x2C)
		// @63: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @66: iload_2
		// @67: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6A: bipush 44 (0x2C)
		// @6C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6F: iload_3
		// @70: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @73: bipush 44 (0x2C)
		// @75: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @78: iload #4
		// @7A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7D: bipush 41 (0x29)
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @85: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @88: athrow
		// @89: return
	}
	
	static final int func_102587_a(CharSequence arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5)
	{
		// @000: iload_1
		// @001: iload_3
		// @002: ineg
		// @003: iadd
		// @004: istore #6
		// @006: iload #5
		// @008: bipush 115 (0x73)
		// @00A: if_icmpeq @018
		// @00D: aconst_null
		// @00E: checkcast java.lang.String
		// @011: putstatic java.lang.String game.C_100027_hc.field_102602_Y
		// @014: goto @018
		// @017: athrow
		// @018: iconst_0
		// @019: istore #7
		// @01B: iload #7
		// @01D: iconst_m1
		// @01E: ixor
		// @01F: iload #6
		// @021: iconst_m1
		// @022: ixor
		// @023: if_icmple @2F9
		// @026: aload_0
		// @027: iload #7
		// @029: iload_3
		// @02A: iadd
		// @02B: invokeinterface java.lang.CharSequence.charAt(int)char
		// @030: istore #8
		// @032: iload #8
		// @034: ifle @045
		// @037: iload #8
		// @039: iconst_m1
		// @03A: ixor
		// @03B: sipush -129 (0xFF7F)
		// @03E: if_icmpgt @05F
		// @041: goto @045
		// @044: athrow
		// @045: sipush 160 (0x00A0)
		// @048: iload #8
		// @04A: if_icmpgt @06D
		// @04D: goto @051
		// @050: athrow
		// @051: sipush -256 (0xFF00)
		// @054: iload #8
		// @056: iconst_m1
		// @057: ixor
		// @058: if_icmpgt @06D
		// @05B: goto @05F
		// @05E: athrow
		// @05F: aload_2
		// @060: iload #4
		// @062: iload #7
		// @064: iadd
		// @065: iload #8
		// @067: i2b
		// @068: bastore
		// @069: goto @2F3
		// @06C: athrow
		// @06D: iload #8
		// @06F: iconst_m1
		// @070: ixor
		// @071: sipush -8365 (0xDF53)
		// @074: if_icmpeq @2E9
		// @077: iload #8
		// @079: iconst_m1
		// @07A: ixor
		// @07B: sipush -8219 (0xDFE5)
		// @07E: if_icmpeq @2DD
		// @081: goto @085
		// @084: athrow
		// @085: sipush 402 (0x0192)
		// @088: iload #8
		// @08A: if_icmpne @09E
		// @08D: goto @091
		// @090: athrow
		// @091: aload_2
		// @092: iload #7
		// @094: iload #4
		// @096: iadd
		// @097: bipush -125 (0x83)
		// @099: bastore
		// @09A: goto @2F3
		// @09D: athrow
		// @09E: iload #8
		// @0A0: sipush 8222 (0x201E)
		// @0A3: if_icmpne @0B3
		// @0A6: aload_2
		// @0A7: iload #7
		// @0A9: iload #4
		// @0AB: iadd
		// @0AC: bipush -124 (0x84)
		// @0AE: bastore
		// @0AF: goto @2F3
		// @0B2: athrow
		// @0B3: iload #8
		// @0B5: sipush 8230 (0x2026)
		// @0B8: if_icmpeq @2D1
		// @0BB: iload #8
		// @0BD: iconst_m1
		// @0BE: ixor
		// @0BF: sipush -8225 (0xDFDF)
		// @0C2: if_icmpne @0D6
		// @0C5: goto @0C9
		// @0C8: athrow
		// @0C9: aload_2
		// @0CA: iload #7
		// @0CC: iload #4
		// @0CE: iadd
		// @0CF: bipush -122 (0x86)
		// @0D1: bastore
		// @0D2: goto @2F3
		// @0D5: athrow
		// @0D6: sipush -8226 (0xDFDE)
		// @0D9: iload #8
		// @0DB: iconst_m1
		// @0DC: ixor
		// @0DD: if_icmpeq @2C5
		// @0E0: sipush 710 (0x02C6)
		// @0E3: iload #8
		// @0E5: if_icmpeq @2B9
		// @0E8: goto @0EC
		// @0EB: athrow
		// @0EC: iload #8
		// @0EE: sipush 8240 (0x2030)
		// @0F1: if_icmpne @105
		// @0F4: goto @0F8
		// @0F7: athrow
		// @0F8: aload_2
		// @0F9: iload #7
		// @0FB: iload #4
		// @0FD: iadd
		// @0FE: bipush -119 (0x89)
		// @100: bastore
		// @101: goto @2F3
		// @104: athrow
		// @105: sipush -353 (0xFE9F)
		// @108: iload #8
		// @10A: iconst_m1
		// @10B: ixor
		// @10C: if_icmpne @11C
		// @10F: aload_2
		// @110: iload #7
		// @112: iload #4
		// @114: iadd
		// @115: bipush -118 (0x8A)
		// @117: bastore
		// @118: goto @2F3
		// @11B: athrow
		// @11C: iload #8
		// @11E: sipush 8249 (0x2039)
		// @121: if_icmpeq @2AC
		// @124: sipush -339 (0xFEAD)
		// @127: iload #8
		// @129: iconst_m1
		// @12A: ixor
		// @12B: if_icmpeq @2A0
		// @12E: goto @132
		// @131: athrow
		// @132: sipush -382 (0xFE82)
		// @135: iload #8
		// @137: iconst_m1
		// @138: ixor
		// @139: if_icmpne @14D
		// @13C: goto @140
		// @13F: athrow
		// @140: aload_2
		// @141: iload #7
		// @143: iload #4
		// @145: iadd
		// @146: bipush -114 (0x8E)
		// @148: bastore
		// @149: goto @2F3
		// @14C: athrow
		// @14D: iload #8
		// @14F: iconst_m1
		// @150: ixor
		// @151: sipush -8217 (0xDFE7)
		// @154: if_icmpeq @294
		// @157: sipush -8218 (0xDFE6)
		// @15A: iload #8
		// @15C: iconst_m1
		// @15D: ixor
		// @15E: if_icmpeq @288
		// @161: goto @165
		// @164: athrow
		// @165: iload #8
		// @167: sipush 8220 (0x201C)
		// @16A: if_icmpeq @27B
		// @16D: goto @171
		// @170: athrow
		// @171: sipush 8221 (0x201D)
		// @174: iload #8
		// @176: if_icmpeq @26F
		// @179: goto @17D
		// @17C: athrow
		// @17D: iload #8
		// @17F: iconst_m1
		// @180: ixor
		// @181: sipush -8227 (0xDFDD)
		// @184: if_icmpne @198
		// @187: goto @18B
		// @18A: athrow
		// @18B: aload_2
		// @18C: iload #7
		// @18E: iload #4
		// @190: iadd
		// @191: bipush -107 (0x95)
		// @193: bastore
		// @194: goto @2F3
		// @197: athrow
		// @198: iload #8
		// @19A: sipush 8211 (0x2013)
		// @19D: if_icmpne @1AD
		// @1A0: aload_2
		// @1A1: iload #4
		// @1A3: iload #7
		// @1A5: iadd
		// @1A6: bipush -106 (0x96)
		// @1A8: bastore
		// @1A9: goto @2F3
		// @1AC: athrow
		// @1AD: iload #8
		// @1AF: sipush 8212 (0x2014)
		// @1B2: if_icmpne @1C3
		// @1B5: aload_2
		// @1B6: iload #4
		// @1B8: iload #7
		// @1BA: ineg
		// @1BB: isub
		// @1BC: bipush -105 (0x97)
		// @1BE: bastore
		// @1BF: goto @2F3
		// @1C2: athrow
		// @1C3: iload #8
		// @1C5: sipush 732 (0x02DC)
		// @1C8: if_icmpne @1D9
		// @1CB: aload_2
		// @1CC: iload #4
		// @1CE: iload #7
		// @1D0: ineg
		// @1D1: isub
		// @1D2: bipush -104 (0x98)
		// @1D4: bastore
		// @1D5: goto @2F3
		// @1D8: athrow
		// @1D9: sipush 8482 (0x2122)
		// @1DC: iload #8
		// @1DE: if_icmpne @1EE
		// @1E1: aload_2
		// @1E2: iload #4
		// @1E4: iload #7
		// @1E6: iadd
		// @1E7: bipush -103 (0x99)
		// @1E9: bastore
		// @1EA: goto @2F3
		// @1ED: athrow
		// @1EE: sipush 353 (0x0161)
		// @1F1: iload #8
		// @1F3: if_icmpne @203
		// @1F6: aload_2
		// @1F7: iload #4
		// @1F9: iload #7
		// @1FB: iadd
		// @1FC: bipush -102 (0x9A)
		// @1FE: bastore
		// @1FF: goto @2F3
		// @202: athrow
		// @203: iload #8
		// @205: sipush 8250 (0x203A)
		// @208: if_icmpeq @262
		// @20B: iload #8
		// @20D: sipush 339 (0x0153)
		// @210: if_icmpeq @256
		// @213: goto @217
		// @216: athrow
		// @217: iload #8
		// @219: iconst_m1
		// @21A: ixor
		// @21B: sipush -383 (0xFE81)
		// @21E: if_icmpne @232
		// @221: goto @225
		// @224: athrow
		// @225: aload_2
		// @226: iload #7
		// @228: iload #4
		// @22A: iadd
		// @22B: bipush -98 (0x9E)
		// @22D: bastore
		// @22E: goto @2F3
		// @231: athrow
		// @232: iload #8
		// @234: iconst_m1
		// @235: ixor
		// @236: sipush -377 (0xFE87)
		// @239: if_icmpeq @24A
		// @23C: aload_2
		// @23D: iload #4
		// @23F: iload #7
		// @241: ineg
		// @242: isub
		// @243: bipush 63 (0x3F)
		// @245: bastore
		// @246: goto @2F3
		// @249: athrow
		// @24A: aload_2
		// @24B: iload #7
		// @24D: iload #4
		// @24F: iadd
		// @250: bipush -97 (0x9F)
		// @252: bastore
		// @253: goto @2F3
		// @256: aload_2
		// @257: iload #7
		// @259: iload #4
		// @25B: iadd
		// @25C: bipush -100 (0x9C)
		// @25E: bastore
		// @25F: goto @2F3
		// @262: aload_2
		// @263: iload #4
		// @265: iload #7
		// @267: ineg
		// @268: isub
		// @269: bipush -101 (0x9B)
		// @26B: bastore
		// @26C: goto @2F3
		// @26F: aload_2
		// @270: iload #4
		// @272: iload #7
		// @274: iadd
		// @275: bipush -108 (0x94)
		// @277: bastore
		// @278: goto @2F3
		// @27B: aload_2
		// @27C: iload #4
		// @27E: iload #7
		// @280: ineg
		// @281: isub
		// @282: bipush -109 (0x93)
		// @284: bastore
		// @285: goto @2F3
		// @288: aload_2
		// @289: iload #7
		// @28B: iload #4
		// @28D: iadd
		// @28E: bipush -110 (0x92)
		// @290: bastore
		// @291: goto @2F3
		// @294: aload_2
		// @295: iload #7
		// @297: iload #4
		// @299: iadd
		// @29A: bipush -111 (0x91)
		// @29C: bastore
		// @29D: goto @2F3
		// @2A0: aload_2
		// @2A1: iload #4
		// @2A3: iload #7
		// @2A5: iadd
		// @2A6: bipush -116 (0x8C)
		// @2A8: bastore
		// @2A9: goto @2F3
		// @2AC: aload_2
		// @2AD: iload #4
		// @2AF: iload #7
		// @2B1: ineg
		// @2B2: isub
		// @2B3: bipush -117 (0x8B)
		// @2B5: bastore
		// @2B6: goto @2F3
		// @2B9: aload_2
		// @2BA: iload #7
		// @2BC: iload #4
		// @2BE: iadd
		// @2BF: bipush -120 (0x88)
		// @2C1: bastore
		// @2C2: goto @2F3
		// @2C5: aload_2
		// @2C6: iload #4
		// @2C8: iload #7
		// @2CA: iadd
		// @2CB: bipush -121 (0x87)
		// @2CD: bastore
		// @2CE: goto @2F3
		// @2D1: aload_2
		// @2D2: iload #7
		// @2D4: iload #4
		// @2D6: iadd
		// @2D7: bipush -123 (0x85)
		// @2D9: bastore
		// @2DA: goto @2F3
		// @2DD: aload_2
		// @2DE: iload #7
		// @2E0: iload #4
		// @2E2: iadd
		// @2E3: bipush -126 (0x82)
		// @2E5: bastore
		// @2E6: goto @2F3
		// @2E9: aload_2
		// @2EA: iload #4
		// @2EC: iload #7
		// @2EE: ineg
		// @2EF: isub
		// @2F0: bipush -128 (0x80)
		// @2F2: bastore
		// @2F3: iinc #7 +1
		// @2F6: goto @01B
		// @2F9: iload #6
		// @2FB: ireturn
		// @2FC: astore #6
		// @2FE: aload #6
		// @300: new java.lang.StringBuilder
		// @303: dup
		// @304: invokespecial java.lang.StringBuilder.<init>()void
		// @307: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @30A: iconst_4
		// @30B: aaload
		// @30C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30F: aload_0
		// @310: ifnull @31C
		// @313: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @316: iconst_1
		// @317: aaload
		// @318: goto @321
		// @31B: athrow
		// @31C: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @31F: iconst_2
		// @320: aaload
		// @321: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @324: bipush 44 (0x2C)
		// @326: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @329: iload_1
		// @32A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @32D: bipush 44 (0x2C)
		// @32F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @332: aload_2
		// @333: ifnull @33F
		// @336: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @339: iconst_1
		// @33A: aaload
		// @33B: goto @344
		// @33E: athrow
		// @33F: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @342: iconst_2
		// @343: aaload
		// @344: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @347: bipush 44 (0x2C)
		// @349: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34C: iload_3
		// @34D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @350: bipush 44 (0x2C)
		// @352: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @355: iload #4
		// @357: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @35A: bipush 44 (0x2C)
		// @35C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @35F: iload #5
		// @361: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @364: bipush 41 (0x29)
		// @366: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @369: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @36C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @36F: athrow
	}
	
	public final void func_102581_a(int arg0, int arg1, byte arg2, C_100218_am arg3, int arg4)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #9
		// @05: bipush 26 (0x1A)
		// @07: bipush -2 (0xFE)
		// @09: iload_3
		// @0A: isub
		// @0B: bipush 52 (0x34)
		// @0D: idiv
		// @0E: idiv
		// @0F: istore #6
		// @11: iconst_0
		// @12: istore #7
		// @14: aload_0
		// @15: getfield int game.C_100027_hc.field_102594_W
		// @18: iconst_m1
		// @19: ixor
		// @1A: iload #7
		// @1C: iconst_m1
		// @1D: ixor
		// @1E: if_icmpge @81
		// @21: iload #9
		// @23: ifne @DE
		// @26: aload_0
		// @27: getfield game.C_100218_am[] game.C_100027_hc.field_102600_ab
		// @2A: iload #7
		// @2C: aaload
		// @2D: aload #4
		// @2F: if_acmpeq @3F
		// @32: goto @36
		// @35: athrow
		// @36: iload #9
		// @38: ifeq @75
		// @3B: goto @3F
		// @3E: athrow
		// @3F: aload_0
		// @40: getfield int[] game.C_100027_hc.field_102590_cb
		// @43: iload #7
		// @45: iaload
		// @46: istore #8
		// @48: iload #8
		// @4A: iconst_m1
		// @4B: ixor
		// @4C: ifne @61
		// @4F: aload_0
		// @50: getfield game.C_100282_nh game.C_100027_hc.field_102589_db
		// @53: bipush -91 (0xA5)
		// @55: invokevirtual game.C_100282_nh.func_102701_r(int)void
		// @58: iload #9
		// @5A: ifeq @81
		// @5D: goto @61
		// @60: athrow
		// @61: iconst_1
		// @62: aload_0
		// @63: getfield int[] game.C_100027_hc.field_102590_cb
		// @66: iload #7
		// @68: iaload
		// @69: invokestatic game.C_100152_bd.func_105184_a(boolean, int)void
		// @6C: iload #9
		// @6E: ifeq @81
		// @71: goto @75
		// @74: athrow
		// @75: iinc #7 +1
		// @78: iload #9
		// @7A: ifeq @14
		// @7D: goto @81
		// @80: athrow
		// @81: goto @DE
		// @84: astore #6
		// @86: aload #6
		// @88: new java.lang.StringBuilder
		// @8B: dup
		// @8C: invokespecial java.lang.StringBuilder.<init>()void
		// @8F: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @92: iconst_5
		// @93: aaload
		// @94: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @97: iload_1
		// @98: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9B: bipush 44 (0x2C)
		// @9D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A0: iload_2
		// @A1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A4: bipush 44 (0x2C)
		// @A6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A9: iload_3
		// @AA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AD: bipush 44 (0x2C)
		// @AF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B2: aload #4
		// @B4: ifnull @C0
		// @B7: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @BA: iconst_1
		// @BB: aaload
		// @BC: goto @C5
		// @BF: athrow
		// @C0: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @C3: iconst_2
		// @C4: aaload
		// @C5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C8: bipush 44 (0x2C)
		// @CA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CD: iload #5
		// @CF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D2: bipush 41 (0x29)
		// @D4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @DA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @DD: athrow
		// @DE: return
	}
	
	public static void func_102583_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100283_ni game.C_100027_hc.field_102603_X
		// @04: aconst_null
		// @05: putstatic game.C_100282_nh game.C_100027_hc.field_102598_S
		// @08: aconst_null
		// @09: putstatic java.lang.String[] game.C_100027_hc.field_102599_R
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100027_hc.field_102602_Y
		// @10: aconst_null
		// @11: putstatic java.lang.String game.C_100027_hc.field_102593_T
		// @14: iload_0
		// @15: bipush -120 (0x88)
		// @17: if_icmplt @25
		// @1A: aconst_null
		// @1B: checkcast game.C_100283_ni
		// @1E: putstatic game.C_100283_ni game.C_100027_hc.field_102603_X
		// @21: goto @25
		// @24: athrow
		// @25: aconst_null
		// @26: putstatic java.lang.String game.C_100027_hc.field_102604_Z
		// @29: aconst_null
		// @2A: putstatic java.lang.String game.C_100027_hc.field_102601_bb
		// @2D: aconst_null
		// @2E: putstatic java.lang.String game.C_100027_hc.field_102597_P
		// @31: goto @56
		// @34: astore_1
		// @35: aload_1
		// @36: new java.lang.StringBuilder
		// @39: dup
		// @3A: invokespecial java.lang.StringBuilder.<init>()void
		// @3D: getstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @40: bipush 6 (0x06)
		// @42: aaload
		// @43: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @46: iload_0
		// @47: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4A: bipush 41 (0x29)
		// @4C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @52: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @55: athrow
		// @56: return
	}
	
	static
	{
		// @000: bipush 10 (0x0A)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "lSGa\u0016"
		// @009: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "\u007f\u001eG\u000cC"
		// @014: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @017: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "jE\u0005N"
		// @01F: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @022: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "lSG\u001eWjY\u001d\u001c\u0016"
		// @02A: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "lSGi\u007f,"
		// @035: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @038: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "lSGh\u007f,"
		// @040: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @043: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "lSGk\u007f,"
		// @04C: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "lSGe\u007f,"
		// @058: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "lSGj\u007f,"
		// @064: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @067: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "lSGo\u007f,"
		// @070: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @073: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @076: aastore
		// @077: putstatic java.lang.String[] game.C_100027_hc.field_102591_eb
		// @07A: ldc "VU\u001dPG"
		// @07C: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @082: putstatic java.lang.String game.C_100027_hc.field_102601_bb
		// @085: ldc "KV\u000fNWjU"
		// @087: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @08A: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @08D: putstatic java.lang.String game.C_100027_hc.field_102593_T
		// @090: ldc "TQ\u001aQIkB\r\u0002Ww\u0010\u001fCRmT"
		// @092: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @095: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @098: putstatic java.lang.String game.C_100027_hc.field_102604_Z
		// @09B: ldc "G\\\u0008L"
		// @09D: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @0A0: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @0A3: putstatic java.lang.String game.C_100027_hc.field_102602_Y
		// @0A6: bipush 36 (0x24)
		// @0A8: anewarray java.lang.String
		// @0AB: dup
		// @0AC: iconst_0
		// @0AD: ldc "E^\u001dK\u0013v_\nI[p\u0010\u001eG_t_\u0007\u000c\u001eS_\u001bIM$G\u0000VV$q$cl@cG"
		// @0AF: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @0B2: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @0B5: aastore
		// @0B6: dup
		// @0B7: iconst_1
		// @0B8: ldc "GQ\u0007\u0002\\a\u0010\u001dCLcU\u001dGZ*\u0010>MLoCIUWpXIcsEb-q\u0010"
		// @0BA: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @0BD: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @0C0: aastore
		// @0C1: dup
		// @0C2: iconst_2
		// @0C3: ldc ""
		// @0C5: aastore
		// @0C6: dup
		// @0C7: iconst_3
		// @0C8: ldc ""
		// @0CA: aastore
		// @0CB: dup
		// @0CC: iconst_4
		// @0CD: ldc "GQ\u0007\u0002\\a\u0010\u001dCLcU\u001dGZ*\u0010>MLoCIUWpXIcsEb-q\u0010"
		// @0CF: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @0D2: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @0D5: aastore
		// @0D6: dup
		// @0D7: iconst_5
		// @0D8: ldc ""
		// @0DA: aastore
		// @0DB: dup
		// @0DC: bipush 6 (0x06)
		// @0DE: ldc "VU\nMSiU\u0007F[`\u0010\u000fML$E\u001aG\u001esY\u001dJ\u001epQ\u001bE[pU\u001b\u000c"
		// @0E0: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @0E3: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @0E6: aastore
		// @0E7: dup
		// @0E8: bipush 7 (0x07)
		// @0EA: ldc ""
		// @0EC: aastore
		// @0ED: dup
		// @0EE: bipush 8 (0x08)
		// @0F0: ldc ""
		// @0F2: aastore
		// @0F3: dup
		// @0F4: bipush 9 (0x09)
		// @0F6: ldc "E^\u001dK\u0013v_\nI[p\u0010\u001eG_t_\u0007\u000c"
		// @0F8: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @0FB: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @0FE: aastore
		// @0FF: dup
		// @100: bipush 10 (0x0A)
		// @102: ldc ""
		// @104: aastore
		// @105: dup
		// @106: bipush 11 (0x0B)
		// @108: ldc "E^\u001dK\u0013v_\nI[p\u0010\u001eG_t_\u0007\u000c\u001eS_\u001bIM$G\u0000VV$q$cl@cG"
		// @10A: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @10D: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @110: aastore
		// @111: dup
		// @112: bipush 12 (0x0C)
		// @114: ldc "GQ\u0007\u0002\\a\u0010\u001dCLcU\u001dGZ*\u0010>MLoCIUWpXIcsEb-q\u0010"
		// @116: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @119: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @11C: aastore
		// @11D: dup
		// @11E: bipush 13 (0x0D)
		// @120: ldc ""
		// @122: aastore
		// @123: dup
		// @124: bipush 14 (0x0E)
		// @126: ldc ""
		// @128: aastore
		// @129: dup
		// @12A: bipush 15 (0x0F)
		// @12C: ldc ""
		// @12E: aastore
		// @12F: dup
		// @130: bipush 16 (0x10)
		// @132: ldc ""
		// @134: aastore
		// @135: dup
		// @136: bipush 17 (0x11)
		// @138: ldc "GQ\u0007\u0002\\a\u0010\u001dCLcU\u001dGZ*\u0010>MLoCIUWpXIcsEb-q\u0010"
		// @13A: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @13D: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @140: aastore
		// @141: dup
		// @142: bipush 18 (0x12)
		// @144: ldc ""
		// @146: aastore
		// @147: dup
		// @148: bipush 19 (0x13)
		// @14A: ldc ""
		// @14C: aastore
		// @14D: dup
		// @14E: bipush 20 (0x14)
		// @150: ldc ""
		// @152: aastore
		// @153: dup
		// @154: bipush 21 (0x15)
		// @156: ldc ""
		// @158: aastore
		// @159: dup
		// @15A: bipush 22 (0x16)
		// @15C: ldc ""
		// @15E: aastore
		// @15F: dup
		// @160: bipush 23 (0x17)
		// @162: ldc ""
		// @164: aastore
		// @165: dup
		// @166: bipush 24 (0x18)
		// @168: ldc ""
		// @16A: aastore
		// @16B: dup
		// @16C: bipush 25 (0x19)
		// @16E: ldc ""
		// @170: aastore
		// @171: dup
		// @172: bipush 26 (0x1A)
		// @174: ldc "GQ\u0007\u0002\\a\u0010\u001dCLcU\u001dGZ*\u0010>MLoCIUWpXIcsEb-q\u0010"
		// @176: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @179: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @17C: aastore
		// @17D: dup
		// @17E: bipush 27 (0x1B)
		// @180: ldc ""
		// @182: aastore
		// @183: dup
		// @184: bipush 28 (0x1C)
		// @186: ldc ""
		// @188: aastore
		// @189: dup
		// @18A: bipush 29 (0x1D)
		// @18C: ldc ""
		// @18E: aastore
		// @18F: dup
		// @190: bipush 30 (0x1E)
		// @192: ldc "GQ\u0007\u0002\\a\u0010\u001dCLcU\u001dGZ*"
		// @194: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @197: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @19A: aastore
		// @19B: dup
		// @19C: bipush 31 (0x1F)
		// @19E: ldc ""
		// @1A0: aastore
		// @1A1: dup
		// @1A2: bipush 32 (0x20)
		// @1A4: ldc "GQ\u0007\u0002Qj\\\u0010\u0002\\a\u0010\u000fKJpU\r\u0002QjD\u0006\u0002JlUIeQhU\u0004\u0002]lQ\u001aQWw\u001e"
		// @1A6: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @1A9: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @1AC: aastore
		// @1AD: dup
		// @1AE: bipush 33 (0x21)
		// @1B0: ldc ""
		// @1B2: aastore
		// @1B3: dup
		// @1B4: bipush 34 (0x22)
		// @1B6: ldc "VU\nMSiU\u0007F[`\u0010\u000fML$E\u001aG\u001esY\u001dJ\u001epQ\u001bE[pU\u001b\u000c"
		// @1B8: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @1BB: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @1BE: aastore
		// @1BF: dup
		// @1C0: bipush 35 (0x23)
		// @1C2: ldc "GQ\u0007\u0002\\a\u0010\u001dCLcU\u001dGZ*"
		// @1C4: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @1C7: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @1CA: aastore
		// @1CB: putstatic java.lang.String[] game.C_100027_hc.field_102599_R
		// @1CE: iconst_0
		// @1CF: putstatic int game.C_100027_hc.field_102596_Q
		// @1D2: ldc "GQ\u0004GLe\u0010\u000fMRh_\u001eQ\u001ewU\u0007VWjU\u0005\u0018\u001eK^"
		// @1D4: invokestatic game.C_100027_hc.func_102584_z(java.lang.String)char[]
		// @1D7: invokestatic game.C_100027_hc.func_102582_z(char[])java.lang.String
		// @1DA: putstatic java.lang.String game.C_100027_hc.field_102597_P
		// @1DD: return
	}
	
	private static char[] func_102584_z(String arg0)
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
		// @0E: bipush 62 (0x3E)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_102582_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @34, for 2: @39, for 3: @3E
		// @30: iconst_4
		// @31: goto @45
		// @34: bipush 48 (0x30)
		// @36: goto @45
		// @39: bipush 105 (0x69)
		// @3B: goto @45
		// @3E: bipush 34 (0x22)
		// @40: goto @45
		// @43: bipush 62 (0x3E)
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
