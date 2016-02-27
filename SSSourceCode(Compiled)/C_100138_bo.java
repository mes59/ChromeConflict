package game;

final class C_100138_bo implements C_100326_ic
{
	private int field_100410_m;
	static int field_100411_j;
	static String field_100402_g;
	private C_100112_r field_100404_e;
	private int field_100403_d;
	private int field_100408_n;
	static C_100302_ka field_100414_i;
	private int field_100406_c;
	static C_100270_mi field_100412_k;
	private int field_100407_a;
	static String field_100413_h;
	private int field_100409_l;
	static int field_100401_f;
	static C_100302_ka field_100405_b;
	private static final String[] field_100415_z;
	
	public static void func_100394_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100270_mi game.C_100138_bo.field_100412_k
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100138_bo.field_100413_h
		// @08: aconst_null
		// @09: putstatic game.C_100302_ka game.C_100138_bo.field_100405_b
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100138_bo.field_100402_g
		// @10: aconst_null
		// @11: putstatic game.C_100302_ka game.C_100138_bo.field_100414_i
		// @14: iload_0
		// @15: bipush -23 (0xE9)
		// @17: if_icmple @21
		// @1A: aconst_null
		// @1B: checkcast game.C_100302_ka
		// @1E: putstatic game.C_100302_ka game.C_100138_bo.field_100414_i
		// @21: goto @45
		// @24: astore_1
		// @25: aload_1
		// @26: new java.lang.StringBuilder
		// @29: dup
		// @2A: invokespecial java.lang.StringBuilder.<init>()void
		// @2D: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @30: iconst_0
		// @31: aaload
		// @32: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35: iload_0
		// @36: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @39: bipush 41 (0x29)
		// @3B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @41: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @44: athrow
		// @45: return
	}
	
	public final void func_100362_a(boolean arg0, int arg1, int arg2, int arg3, C_100336_im arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #11
		// @005: aload #5
		// @007: instanceof game.C_100298_ke
		// @00A: ifeq @013
		// @00D: aload #5
		// @00F: goto @014
		// @012: athrow
		// @013: aconst_null
		// @014: checkcast game.C_100298_ke
		// @017: checkcast game.C_100298_ke
		// @01A: astore #6
		// @01C: iload_3
		// @01D: aload #5
		// @01F: getfield int game.C_100336_im.field_102538_m
		// @022: ineg
		// @023: isub
		// @024: iload #4
		// @026: aload #5
		// @028: getfield int game.C_100336_im.field_102541_w
		// @02B: iadd
		// @02C: aload #5
		// @02E: getfield int game.C_100336_im.field_102537_l
		// @031: aload #5
		// @033: getfield int game.C_100336_im.field_102544_t
		// @036: aload_0
		// @037: getfield int game.C_100138_bo.field_100408_n
		// @03A: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @03D: aconst_null
		// @03E: aload #6
		// @040: if_acmpne @043
		// @043: aload #6
		// @045: getfield int game.C_100298_ke.field_103210_U
		// @048: iconst_2
		// @049: imul
		// @04A: ineg
		// @04B: aload #5
		// @04D: getfield int game.C_100336_im.field_102537_l
		// @050: iadd
		// @051: istore #7
		// @053: iload_3
		// @054: aload #5
		// @056: getfield int game.C_100336_im.field_102538_m
		// @059: ineg
		// @05A: isub
		// @05B: aload #6
		// @05D: getfield int game.C_100298_ke.field_103210_U
		// @060: iadd
		// @061: istore #8
		// @063: aload #6
		// @065: getfield int game.C_100298_ke.field_103214_Q
		// @068: aload #5
		// @06A: getfield int game.C_100336_im.field_102541_w
		// @06D: iadd
		// @06E: iload #4
		// @070: iadd
		// @071: istore #9
		// @073: iload #8
		// @075: iload #9
		// @077: iload #8
		// @079: iload #7
		// @07B: ineg
		// @07C: isub
		// @07D: iload #9
		// @07F: aload_0
		// @080: getfield int game.C_100138_bo.field_100407_a
		// @083: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @086: iload_2
		// @087: sipush -26568 (0x9838)
		// @08A: if_icmpeq @097
		// @08D: aload_0
		// @08E: bipush -34 (0xDE)
		// @090: putfield int game.C_100138_bo.field_100410_m
		// @093: goto @097
		// @096: athrow
		// @097: iconst_m1
		// @098: aload #6
		// @09A: bipush -126 (0x82)
		// @09C: invokevirtual game.C_100298_ke.func_103203_a(byte)int
		// @09F: iadd
		// @0A0: istore #10
		// @0A2: iload #10
		// @0A4: iconst_m1
		// @0A5: ixor
		// @0A6: iconst_m1
		// @0A7: if_icmpgt @0DF
		// @0AA: iload #7
		// @0AC: aload #6
		// @0AE: bipush 51 (0x33)
		// @0B0: iload #10
		// @0B2: invokevirtual game.C_100298_ke.func_103208_a(byte, int)int
		// @0B5: imul
		// @0B6: aload #6
		// @0B8: bipush 88 (0x58)
		// @0BA: invokevirtual game.C_100298_ke.func_103202_j(int)int
		// @0BD: idiv
		// @0BE: iload #8
		// @0C0: iadd
		// @0C1: iload #9
		// @0C3: aload_0
		// @0C4: getfield int game.C_100138_bo.field_100410_m
		// @0C7: aload_0
		// @0C8: getfield int game.C_100138_bo.field_100409_l
		// @0CB: invokestatic game.C_100196_rb.func_105795_d(int, int, int, int)void
		// @0CE: iinc #10 +255
		// @0D1: iload #11
		// @0D3: ifne @0EB
		// @0D6: iload #11
		// @0D8: ifeq @0A2
		// @0DB: goto @0DF
		// @0DE: athrow
		// @0DF: aconst_null
		// @0E0: aload_0
		// @0E1: getfield game.C_100112_r game.C_100138_bo.field_100404_e
		// @0E4: if_acmpne @0EB
		// @0E7: goto @118
		// @0EA: athrow
		// @0EB: aload_0
		// @0EC: getfield game.C_100112_r game.C_100138_bo.field_100404_e
		// @0EF: aload #6
		// @0F1: getfield java.lang.String game.C_100298_ke.field_102534_C
		// @0F4: iload #8
		// @0F6: iload #7
		// @0F8: iconst_2
		// @0F9: idiv
		// @0FA: iadd
		// @0FB: iload #9
		// @0FD: aload_0
		// @0FE: getfield game.C_100112_r game.C_100138_bo.field_100404_e
		// @101: getfield int game.C_100112_r.field_101775_y
		// @104: ineg
		// @105: aload #6
		// @107: getfield int game.C_100298_ke.field_103214_Q
		// @10A: ineg
		// @10B: iadd
		// @10C: isub
		// @10D: aload_0
		// @10E: getfield int game.C_100138_bo.field_100406_c
		// @111: aload_0
		// @112: getfield int game.C_100138_bo.field_100403_d
		// @115: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @118: goto @175
		// @11B: astore #6
		// @11D: aload #6
		// @11F: new java.lang.StringBuilder
		// @122: dup
		// @123: invokespecial java.lang.StringBuilder.<init>()void
		// @126: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @129: iconst_2
		// @12A: aaload
		// @12B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @12E: iload_1
		// @12F: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
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
		// @153: aload #5
		// @155: ifnull @161
		// @158: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @15B: iconst_3
		// @15C: aaload
		// @15D: goto @166
		// @160: athrow
		// @161: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @164: iconst_1
		// @165: aaload
		// @166: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @169: bipush 41 (0x29)
		// @16B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @171: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @174: athrow
		// @175: return
	}
	
	static final int func_100397_a(String arg0, int arg1, int arg2, String[] arg3, int arg4, C_100037_wb arg5, int arg6, int arg7, boolean arg8, int arg9)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #17
		// @005: getstatic game.C_100317_lb game.C_100318_hj.field_107197_e
		// @008: astore #10
		// @00A: iconst_2
		// @00B: bipush -8 (0xF8)
		// @00D: iload #4
		// @00F: iadd
		// @010: iadd
		// @011: bipush -8 (0xF8)
		// @013: iload #9
		// @015: iconst_2
		// @016: iadd
		// @017: iadd
		// @018: bipush -4 (0xFC)
		// @01A: bipush 16 (0x10)
		// @01C: iload_1
		// @01D: iadd
		// @01E: iadd
		// @01F: iload #6
		// @021: bipush 16 (0x10)
		// @023: iadd
		// @024: bipush -4 (0xFC)
		// @026: iadd
		// @027: iconst_0
		// @028: sipush 210 (0x00D2)
		// @02B: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @02E: bipush -8 (0xF8)
		// @030: iload #4
		// @032: iadd
		// @033: iload #9
		// @035: bipush 8 (0x08)
		// @037: isub
		// @038: bipush 126 (0x7E)
		// @03A: iload_1
		// @03B: bipush -16 (0xF0)
		// @03D: isub
		// @03E: getstatic game.C_100037_wb[] game.C_100127_tl.field_104949_c
		// @041: bipush 16 (0x10)
		// @043: iload #6
		// @045: iadd
		// @046: invokestatic game.C_100157_db.func_103554_a(int, int, int, int, game.C_100037_wb[], int)void
		// @049: iconst_4
		// @04A: iload #9
		// @04C: iadd
		// @04D: istore #11
		// @04F: aload #5
		// @051: ifnonnull @058
		// @054: goto @078
		// @057: athrow
		// @058: aload #5
		// @05A: iload #4
		// @05C: aload #5
		// @05E: getfield int game.C_100037_wb.field_102339_s
		// @061: ineg
		// @062: iload_1
		// @063: iadd
		// @064: iconst_2
		// @065: idiv
		// @066: iadd
		// @067: iload #11
		// @069: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @06C: iload #11
		// @06E: iconst_2
		// @06F: aload #5
		// @071: getfield int game.C_100037_wb.field_102337_u
		// @074: iadd
		// @075: iadd
		// @076: istore #11
		// @078: aload_0
		// @079: ifnull @0BD
		// @07C: aload #10
		// @07E: aload_0
		// @07F: bipush 8 (0x08)
		// @081: iload #4
		// @083: iadd
		// @084: iload #11
		// @086: iload_1
		// @087: bipush -16 (0xF0)
		// @089: iadd
		// @08A: iload #6
		// @08C: iload #9
		// @08E: iadd
		// @08F: iload #11
		// @091: isub
		// @092: ldc 8421504 (0x808080)
		// @094: iconst_m1
		// @095: iload #8
		// @097: ifne @0A3
		// @09A: goto @09E
		// @09D: athrow
		// @09E: iconst_0
		// @09F: goto @0A4
		// @0A2: athrow
		// @0A3: iconst_1
		// @0A4: iconst_0
		// @0A5: iconst_0
		// @0A6: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @0A9: istore #12
		// @0AB: iload #11
		// @0AD: iload #12
		// @0AF: aload #10
		// @0B1: getfield int game.C_100112_r.field_101775_y
		// @0B4: imul
		// @0B5: bipush -4 (0xFC)
		// @0B7: isub
		// @0B8: iconst_3
		// @0B9: iadd
		// @0BA: iadd
		// @0BB: istore #11
		// @0BD: iload #4
		// @0BF: iload #9
		// @0C1: iload_1
		// @0C2: iload #9
		// @0C4: ineg
		// @0C5: iload #11
		// @0C7: iadd
		// @0C8: iload_2
		// @0C9: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @0CC: bipush 100 (0x64)
		// @0CE: istore #12
		// @0D0: bipush 30 (0x1E)
		// @0D2: istore #13
		// @0D4: aconst_null
		// @0D5: aload_3
		// @0D6: if_acmpeq @0E5
		// @0D9: iconst_m1
		// @0DA: aload_3
		// @0DB: arraylength
		// @0DC: iconst_m1
		// @0DD: ixor
		// @0DE: if_icmpne @0E7
		// @0E1: goto @0E5
		// @0E4: athrow
		// @0E5: iconst_m1
		// @0E6: ireturn
		// @0E7: iload_1
		// @0E8: iconst_5
		// @0E9: iconst_1
		// @0EA: aload_3
		// @0EB: arraylength
		// @0EC: iadd
		// @0ED: imul
		// @0EE: iload #12
		// @0F0: aload_3
		// @0F1: arraylength
		// @0F2: imul
		// @0F3: iadd
		// @0F4: if_icmplt @0FB
		// @0F7: goto @109
		// @0FA: athrow
		// @0FB: iload_1
		// @0FC: aload_3
		// @0FD: arraylength
		// @0FE: iconst_5
		// @0FF: imul
		// @100: isub
		// @101: bipush -5 (0xFB)
		// @103: iadd
		// @104: aload_3
		// @105: arraylength
		// @106: idiv
		// @107: istore #12
		// @109: bipush -5 (0xFB)
		// @10B: iload #6
		// @10D: iadd
		// @10E: iload #9
		// @110: iadd
		// @111: iload #13
		// @113: isub
		// @114: istore #11
		// @116: aload_3
		// @117: arraylength
		// @118: iconst_1
		// @119: isub
		// @11A: iconst_5
		// @11B: imul
		// @11C: ineg
		// @11D: iload_1
		// @11E: iadd
		// @11F: aload_3
		// @120: arraylength
		// @121: iload #12
		// @123: imul
		// @124: ineg
		// @125: iadd
		// @126: iconst_2
		// @127: idiv
		// @128: iload #4
		// @12A: iadd
		// @12B: istore #14
		// @12D: iload #7
		// @12F: istore #15
		// @131: iconst_0
		// @132: istore #16
		// @134: iload #16
		// @136: iconst_m1
		// @137: ixor
		// @138: aload_3
		// @139: arraylength
		// @13A: iconst_m1
		// @13B: ixor
		// @13C: if_icmple @174
		// @13F: aload_3
		// @140: iload #16
		// @142: aaload
		// @143: iload #11
		// @145: iload #14
		// @147: iload #13
		// @149: iload #12
		// @14B: bipush 8 (0x08)
		// @14D: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @150: iload #17
		// @152: ifne @176
		// @155: ifne @15F
		// @158: goto @15C
		// @15B: athrow
		// @15C: goto @163
		// @15F: iload #16
		// @161: istore #15
		// @163: iload #14
		// @165: iconst_5
		// @166: iload #12
		// @168: iadd
		// @169: iadd
		// @16A: istore #14
		// @16C: iinc #16 +1
		// @16F: iload #17
		// @171: ifeq @134
		// @174: iload #15
		// @176: ireturn
		// @177: astore #10
		// @179: aload #10
		// @17B: new java.lang.StringBuilder
		// @17E: dup
		// @17F: invokespecial java.lang.StringBuilder.<init>()void
		// @182: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @185: bipush 6 (0x06)
		// @187: aaload
		// @188: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @18B: aload_0
		// @18C: ifnull @198
		// @18F: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @192: iconst_3
		// @193: aaload
		// @194: goto @19D
		// @197: athrow
		// @198: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @19B: iconst_1
		// @19C: aaload
		// @19D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1A0: bipush 44 (0x2C)
		// @1A2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1A5: iload_1
		// @1A6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1A9: bipush 44 (0x2C)
		// @1AB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1AE: iload_2
		// @1AF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1B2: bipush 44 (0x2C)
		// @1B4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1B7: aload_3
		// @1B8: ifnull @1C4
		// @1BB: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @1BE: iconst_3
		// @1BF: aaload
		// @1C0: goto @1C9
		// @1C3: athrow
		// @1C4: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @1C7: iconst_1
		// @1C8: aaload
		// @1C9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1CC: bipush 44 (0x2C)
		// @1CE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D1: iload #4
		// @1D3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1D6: bipush 44 (0x2C)
		// @1D8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1DB: aload #5
		// @1DD: ifnull @1E9
		// @1E0: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @1E3: iconst_3
		// @1E4: aaload
		// @1E5: goto @1EE
		// @1E8: athrow
		// @1E9: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @1EC: iconst_1
		// @1ED: aaload
		// @1EE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1F1: bipush 44 (0x2C)
		// @1F3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F6: iload #6
		// @1F8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1FB: bipush 44 (0x2C)
		// @1FD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @200: iload #7
		// @202: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @205: bipush 44 (0x2C)
		// @207: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @20A: iload #8
		// @20C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @20F: bipush 44 (0x2C)
		// @211: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @214: iload #9
		// @216: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @219: bipush 41 (0x29)
		// @21B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @21E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @221: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @224: athrow
	}
	
	static final void func_100396_a(long arg0, int arg1)
	{
		// @00: lconst_0
		// @01: lload_0
		// @02: lcmp
		// @03: iflt @07
		// @06: return
		// @07: lload_0
		// @08: ldc2_w 10
		// @0B: lrem
		// @0C: lconst_0
		// @0D: lcmp
		// @0E: ifeq @21
		// @11: lload_0
		// @12: bipush 97 (0x61)
		// @14: invokestatic game.C_100323_hl.func_107245_a(long, int)void
		// @17: getstatic int game.SteelSentinels.field_105275_O
		// @1A: ifeq @35
		// @1D: goto @21
		// @20: athrow
		// @21: lload_0
		// @22: ldc2_w -1
		// @25: ladd
		// @26: bipush -59 (0xC5)
		// @28: invokestatic game.C_100323_hl.func_107245_a(long, int)void
		// @2B: lconst_1
		// @2C: bipush 98 (0x62)
		// @2E: invokestatic game.C_100323_hl.func_107245_a(long, int)void
		// @31: goto @35
		// @34: athrow
		// @35: iload_2
		// @36: bipush -121 (0x87)
		// @38: if_icmple @47
		// @3B: ldc2_w 59
		// @3E: bipush -12 (0xF4)
		// @40: invokestatic game.C_100138_bo.func_100396_a(long, int)void
		// @43: goto @47
		// @46: athrow
		// @47: goto @74
		// @4A: astore_3
		// @4B: aload_3
		// @4C: new java.lang.StringBuilder
		// @4F: dup
		// @50: invokespecial java.lang.StringBuilder.<init>()void
		// @53: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @56: iconst_4
		// @57: aaload
		// @58: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5B: lload_0
		// @5C: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @5F: bipush 44 (0x2C)
		// @61: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @64: iload_2
		// @65: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @68: bipush 41 (0x29)
		// @6A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @70: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @73: athrow
		// @74: return
	}
	
	static final void func_100400_a(int arg0, boolean arg1)
	{
		// @00: iload_1
		// @01: bipush -56 (0xC8)
		// @03: invokestatic game.C_100197_ra.func_100854_a(boolean, int)void
		// @06: iload_0
		// @07: bipush -8 (0xF8)
		// @09: if_icmpeq @17
		// @0C: aconst_null
		// @0D: checkcast game.C_100302_ka
		// @10: putstatic game.C_100302_ka game.C_100138_bo.field_100405_b
		// @13: goto @17
		// @16: athrow
		// @17: sipush 15949 (0x3E4D)
		// @1A: iload_1
		// @1B: invokestatic game.C_100249_pc.func_102323_a(int, boolean)void
		// @1E: goto @4C
		// @21: astore_2
		// @22: aload_2
		// @23: new java.lang.StringBuilder
		// @26: dup
		// @27: invokespecial java.lang.StringBuilder.<init>()void
		// @2A: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @2D: bipush 8 (0x08)
		// @2F: aaload
		// @30: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @33: iload_0
		// @34: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @37: bipush 44 (0x2C)
		// @39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C: iload_1
		// @3D: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @40: bipush 41 (0x29)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @48: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4B: athrow
		// @4C: return
	}
	
	static final void func_100398_a(C_100037_wb arg0, int arg1)
	{
		// @00: bipush -46 (0xD2)
		// @02: invokestatic game.C_100328_ia.func_107254_b(byte)void
		// @05: iload_1
		// @06: bipush -4 (0xFC)
		// @08: if_icmpeq @2C
		// @0B: aconst_null
		// @0C: checkcast java.lang.String
		// @0F: bipush 12 (0x0C)
		// @11: bipush 50 (0x32)
		// @13: aconst_null
		// @14: checkcast java.lang.String[]
		// @17: bipush 107 (0x6B)
		// @19: aconst_null
		// @1A: checkcast game.C_100037_wb
		// @1D: bipush 111 (0x6F)
		// @1F: bipush 49 (0x31)
		// @21: iconst_1
		// @22: bipush 9 (0x09)
		// @24: invokestatic game.C_100138_bo.func_100397_a(java.lang.String, int, int, java.lang.String[], int, game.C_100037_wb, int, int, boolean, int)int
		// @27: pop
		// @28: goto @2C
		// @2B: athrow
		// @2C: aload_0
		// @2D: getfield int[] game.C_100037_wb.field_102388_J
		// @30: aload_0
		// @31: getfield int game.C_100037_wb.field_102341_y
		// @34: aload_0
		// @35: getfield int game.C_100037_wb.field_102340_z
		// @38: invokestatic game.C_100196_rb.func_105808_a(int[], int, int)void
		// @3B: goto @7A
		// @3E: astore_2
		// @3F: aload_2
		// @40: new java.lang.StringBuilder
		// @43: dup
		// @44: invokespecial java.lang.StringBuilder.<init>()void
		// @47: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @4A: bipush 9 (0x09)
		// @4C: aaload
		// @4D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @50: aload_0
		// @51: ifnull @5D
		// @54: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @57: iconst_3
		// @58: aaload
		// @59: goto @62
		// @5C: athrow
		// @5D: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @60: iconst_1
		// @61: aaload
		// @62: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @65: bipush 44 (0x2C)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: iload_1
		// @6B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6E: bipush 41 (0x29)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @76: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @79: athrow
		// @7A: return
	}
	
	static final void func_100399_a(int arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: iconst_m1
		// @02: if_icmpeq @0E
		// @05: bipush 96 (0x60)
		// @07: putstatic int game.C_100138_bo.field_100401_f
		// @0A: goto @0E
		// @0D: athrow
		// @0E: iload_0
		// @0F: putstatic int game.C_100163_sf.field_105436_d
		// @12: iload_2
		// @13: putstatic int game.C_100101_fc.field_103406_X
		// @16: goto @4D
		// @19: astore_3
		// @1A: aload_3
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @25: bipush 7 (0x07)
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: iload_0
		// @2C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F: bipush 44 (0x2C)
		// @31: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34: iload_1
		// @35: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @38: bipush 44 (0x2C)
		// @3A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D: iload_2
		// @3E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @41: bipush 41 (0x29)
		// @43: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @46: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @49: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4C: athrow
		// @4D: return
	}
	
	C_100138_bo(C_100112_r arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iload #5
		// @07: putfield int game.C_100138_bo.field_100408_n
		// @0A: aload_0
		// @0B: aload_1
		// @0C: putfield game.C_100112_r game.C_100138_bo.field_100404_e
		// @0F: aload_0
		// @10: iload #7
		// @12: putfield int game.C_100138_bo.field_100409_l
		// @15: aload_0
		// @16: iload_3
		// @17: putfield int game.C_100138_bo.field_100403_d
		// @1A: aload_0
		// @1B: iload_2
		// @1C: putfield int game.C_100138_bo.field_100406_c
		// @1F: aload_0
		// @20: iload #6
		// @22: putfield int game.C_100138_bo.field_100410_m
		// @25: aload_0
		// @26: iload #4
		// @28: putfield int game.C_100138_bo.field_100407_a
		// @2B: goto @9C
		// @2E: astore #8
		// @30: aload #8
		// @32: new java.lang.StringBuilder
		// @35: dup
		// @36: invokespecial java.lang.StringBuilder.<init>()void
		// @39: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @3C: iconst_5
		// @3D: aaload
		// @3E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @41: aload_1
		// @42: ifnull @4E
		// @45: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @48: iconst_3
		// @49: aaload
		// @4A: goto @53
		// @4D: athrow
		// @4E: getstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @51: iconst_1
		// @52: aaload
		// @53: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @56: bipush 44 (0x2C)
		// @58: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B: iload_2
		// @5C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5F: bipush 44 (0x2C)
		// @61: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @64: iload_3
		// @65: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @68: bipush 44 (0x2C)
		// @6A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6D: iload #4
		// @6F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @72: bipush 44 (0x2C)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: iload #5
		// @79: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7C: bipush 44 (0x2C)
		// @7E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @81: iload #6
		// @83: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @86: bipush 44 (0x2C)
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: iload #7
		// @8D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @90: bipush 41 (0x29)
		// @92: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @95: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @98: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9B: athrow
		// @9C: return
	}
	
	static
	{
		// @00: bipush 10 (0x0A)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "P\u0018yZ,"
		// @09: invokestatic game.C_100138_bo.func_100395_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100138_bo.func_100393_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\\\u0002;t"
		// @14: invokestatic game.C_100138_bo.func_100395_z(java.lang.String)char[]
		// @17: invokestatic game.C_100138_bo.func_100393_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "P\u0018y\\,"
		// @1F: invokestatic game.C_100138_bo.func_100395_z(java.lang.String)char[]
		// @22: invokestatic game.C_100138_bo.func_100393_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "IYy6y"
		// @2A: invokestatic game.C_100138_bo.func_100395_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100138_bo.func_100393_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "P\u0018y_,"
		// @35: invokestatic game.C_100138_bo.func_100395_z(java.lang.String)char[]
		// @38: invokestatic game.C_100138_bo.func_100393_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "P\u0018y$m\\\u001e#&,"
		// @40: invokestatic game.C_100138_bo.func_100395_z(java.lang.String)char[]
		// @43: invokestatic game.C_100138_bo.func_100393_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "P\u0018yY,"
		// @4C: invokestatic game.C_100138_bo.func_100395_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100138_bo.func_100393_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "P\u0018y[,"
		// @58: invokestatic game.C_100138_bo.func_100395_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100138_bo.func_100393_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "P\u0018y^,"
		// @64: invokestatic game.C_100138_bo.func_100395_z(java.lang.String)char[]
		// @67: invokestatic game.C_100138_bo.func_100393_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "P\u0018y],"
		// @70: invokestatic game.C_100138_bo.func_100395_z(java.lang.String)char[]
		// @73: invokestatic game.C_100138_bo.func_100393_z(char[])java.lang.String
		// @76: aastore
		// @77: putstatic java.lang.String[] game.C_100138_bo.field_100415_z
		// @7A: ldc "f\u001f288\u0017Gi8i]\u0013\"ta\u0012\u00146vj]\u0003wza\u0012\u00129\u007fm\\\u00122jaVW6l$F\u001f>k$F\u001e:}*"
		// @7C: invokestatic game.C_100138_bo.func_100395_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100138_bo.func_100393_z(char[])java.lang.String
		// @82: putstatic java.lang.String game.C_100138_bo.field_100402_g
		// @85: ldc "e6\u0004\\>\u0012$4jk^\u001bw7$`:\u001588[\u001a0%6\u0004Im8nG\u001a'"
		// @87: invokestatic game.C_100138_bo.func_100395_z(java.lang.String)char[]
		// @8A: invokestatic game.C_100138_bo.func_100393_z(char[])java.lang.String
		// @8D: putstatic java.lang.String game.C_100138_bo.field_100413_h
		// @90: return
	}
	
	private static char[] func_100395_z(String arg0)
	{
		// @00: aload_0
		// @01: invokevirtual java.lang.String.toCharArray()char[]
		// @04: dup
		// @05: arraylength
		// @06: iconst_2
		// @07: if_icmpge @12
		// @0A: dup
		// @0B: iconst_0
		// @0C: dup2
		// @0D: caload
		// @0E: iconst_4
		// @0F: ixor
		// @10: i2c
		// @11: castore
		// @12: areturn
	}
	
	private static String func_100393_z(char[] arg0)
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
		// @10: tableswitch def: @44, for 0: @30, for 1: @35, for 2: @3A, for 3: @3F
		// @30: bipush 50 (0x32)
		// @32: goto @45
		// @35: bipush 119 (0x77)
		// @37: goto @45
		// @3A: bipush 87 (0x57)
		// @3C: goto @45
		// @3F: bipush 24 (0x18)
		// @41: goto @45
		// @44: iconst_4
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
