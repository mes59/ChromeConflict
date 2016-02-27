package game;

final class C_100010_ff extends C_100205_qf
{
	static String field_103703_w;
	private int field_103708_r;
	static String[] field_103700_k;
	private C_100112_r field_103707_s;
	static String field_103701_h;
	static String field_103705_u;
	static String field_103709_q;
	static int field_103699_j;
	private int field_103706_t;
	private int field_103695_n;
	static String field_103710_p;
	static boolean field_103697_l;
	private String field_103702_i;
	private int field_103704_v;
	private boolean field_103698_m;
	private int field_103696_o;
	private static final String[] field_103711_z;
	
	static final boolean func_103694_e(int arg0)
	{
		// @00: bipush -45 (0xD3)
		// @02: iload_0
		// @03: iconst_3
		// @04: isub
		// @05: bipush 55 (0x37)
		// @07: idiv
		// @08: idiv
		// @09: istore_1
		// @0A: aconst_null
		// @0B: getstatic game.C_100009_fg game.C_100146_bf.field_105128_n
		// @0E: if_acmpne @18
		// @11: getstatic boolean game.C_100299_kd.field_107018_F
		// @14: goto @19
		// @17: athrow
		// @18: iconst_1
		// @19: ireturn
		// @1A: astore_1
		// @1B: aload_1
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @26: bipush 7 (0x07)
		// @28: aaload
		// @29: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C: iload_0
		// @2D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @30: bipush 41 (0x29)
		// @32: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @35: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @38: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3B: athrow
	}
	
	final void func_103691_a(int arg0, int arg1, int arg2, String arg3, int arg4, byte arg5, C_100112_r arg6, int arg7)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #15
		// @005: iconst_m1
		// @006: iload_2
		// @007: iconst_m1
		// @008: ixor
		// @009: if_icmpeq @010
		// @00C: goto @016
		// @00F: athrow
		// @010: aload #7
		// @012: getfield int game.C_100112_r.field_101775_y
		// @015: istore_2
		// @016: aconst_null
		// @017: aload #4
		// @019: if_acmpeq @020
		// @01C: goto @026
		// @01F: athrow
		// @020: aload_0
		// @021: aconst_null
		// @022: putfield game.C_100306_kn[] game.C_100010_ff.field_103677_g
		// @025: return
		// @026: aload #7
		// @028: aload_0
		// @029: getfield game.C_100112_r game.C_100010_ff.field_103707_s
		// @02C: if_acmpne @09D
		// @02F: aload_0
		// @030: getfield boolean game.C_100010_ff.field_103698_m
		// @033: ifne @09D
		// @036: goto @03A
		// @039: athrow
		// @03A: iload #5
		// @03C: aload_0
		// @03D: getfield int game.C_100010_ff.field_103708_r
		// @040: if_icmpne @09D
		// @043: goto @047
		// @046: athrow
		// @047: aload_0
		// @048: getfield int game.C_100010_ff.field_103696_o
		// @04B: iload_1
		// @04C: if_icmpne @09D
		// @04F: goto @053
		// @052: athrow
		// @053: aload_0
		// @054: getfield int game.C_100010_ff.field_103704_v
		// @057: iload_2
		// @058: if_icmpne @09D
		// @05B: goto @05F
		// @05E: athrow
		// @05F: iload #8
		// @061: aload_0
		// @062: getfield int game.C_100010_ff.field_103695_n
		// @065: if_icmpne @09D
		// @068: goto @06C
		// @06B: athrow
		// @06C: iload_3
		// @06D: iconst_m1
		// @06E: ixor
		// @06F: aload_0
		// @070: getfield int game.C_100010_ff.field_103706_t
		// @073: iconst_m1
		// @074: ixor
		// @075: if_icmpne @09D
		// @078: goto @07C
		// @07B: athrow
		// @07C: aconst_null
		// @07D: aload_0
		// @07E: getfield java.lang.String game.C_100010_ff.field_103702_i
		// @081: if_acmpeq @09D
		// @084: goto @088
		// @087: athrow
		// @088: aload_0
		// @089: getfield java.lang.String game.C_100010_ff.field_103702_i
		// @08C: aload #4
		// @08E: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @091: ifne @09C
		// @094: goto @098
		// @097: athrow
		// @098: goto @09D
		// @09B: athrow
		// @09C: return
		// @09D: aload_0
		// @09E: aload #4
		// @0A0: putfield java.lang.String game.C_100010_ff.field_103702_i
		// @0A3: aload_0
		// @0A4: aload #7
		// @0A6: putfield game.C_100112_r game.C_100010_ff.field_103707_s
		// @0A9: aload_0
		// @0AA: iload_1
		// @0AB: putfield int game.C_100010_ff.field_103696_o
		// @0AE: aload_0
		// @0AF: iload #8
		// @0B1: putfield int game.C_100010_ff.field_103695_n
		// @0B4: aload_0
		// @0B5: iload #5
		// @0B7: putfield int game.C_100010_ff.field_103708_r
		// @0BA: iload #6
		// @0BC: bipush -4 (0xFC)
		// @0BE: if_icmpeq @0D7
		// @0C1: aload_0
		// @0C2: bipush -11 (0xF5)
		// @0C4: bipush -54 (0xCA)
		// @0C6: aconst_null
		// @0C7: checkcast java.lang.String
		// @0CA: bipush 62 (0x3E)
		// @0CC: aconst_null
		// @0CD: checkcast game.C_100112_r
		// @0D0: invokevirtual game.C_100010_ff.func_103685_a(byte, int, java.lang.String, int, game.C_100112_r)void
		// @0D3: goto @0D7
		// @0D6: athrow
		// @0D7: aload_0
		// @0D8: iconst_0
		// @0D9: putfield boolean game.C_100010_ff.field_103698_m
		// @0DC: aload_0
		// @0DD: iload_3
		// @0DE: putfield int game.C_100010_ff.field_103706_t
		// @0E1: aload_0
		// @0E2: iload_2
		// @0E3: putfield int game.C_100010_ff.field_103704_v
		// @0E6: iconst_1
		// @0E7: aload #7
		// @0E9: aload #4
		// @0EB: iload_3
		// @0EC: invokevirtual game.C_100112_r.func_101724_c(java.lang.String, int)int
		// @0EF: iadd
		// @0F0: anewarray java.lang.String
		// @0F3: astore #9
		// @0F5: iconst_1
		// @0F6: aload #7
		// @0F8: aload #4
		// @0FA: iconst_1
		// @0FB: newarray int[]
		// @0FD: dup
		// @0FE: iconst_0
		// @0FF: iload_3
		// @100: iastore
		// @101: aload #9
		// @103: invokevirtual game.C_100112_r.func_101730_a(java.lang.String, int[], java.lang.String[])int
		// @106: invokestatic java.lang.Math.max(int, int)int
		// @109: istore #10
		// @10B: iconst_3
		// @10C: aload_0
		// @10D: getfield int game.C_100010_ff.field_103696_o
		// @110: if_icmpne @129
		// @113: bipush -2 (0xFE)
		// @115: iload #10
		// @117: iconst_m1
		// @118: ixor
		// @119: if_icmpeq @124
		// @11C: goto @120
		// @11F: athrow
		// @120: goto @129
		// @123: athrow
		// @124: aload_0
		// @125: iconst_1
		// @126: putfield int game.C_100010_ff.field_103696_o
		// @129: aload_0
		// @12A: getfield int game.C_100010_ff.field_103696_o
		// @12D: ifne @13C
		// @130: aload #7
		// @132: getfield int game.C_100112_r.field_101772_Q
		// @135: istore #11
		// @137: iload #15
		// @139: ifeq @1C7
		// @13C: bipush -2 (0xFE)
		// @13E: aload_0
		// @13F: getfield int game.C_100010_ff.field_103696_o
		// @142: iconst_m1
		// @143: ixor
		// @144: if_icmpne @168
		// @147: goto @14B
		// @14A: athrow
		// @14B: aload #7
		// @14D: getfield int game.C_100112_r.field_101772_Q
		// @150: aload_0
		// @151: getfield int game.C_100010_ff.field_103695_n
		// @154: iload #10
		// @156: aload_0
		// @157: getfield int game.C_100010_ff.field_103704_v
		// @15A: imul
		// @15B: isub
		// @15C: ldc 1323211329 (0x4ede9a41)
		// @15E: ishr
		// @15F: ineg
		// @160: isub
		// @161: istore #11
		// @163: iload #15
		// @165: ifeq @1C7
		// @168: iconst_2
		// @169: aload_0
		// @16A: getfield int game.C_100010_ff.field_103696_o
		// @16D: if_icmpne @18F
		// @170: goto @174
		// @173: athrow
		// @174: iload #10
		// @176: aload_0
		// @177: getfield int game.C_100010_ff.field_103704_v
		// @17A: imul
		// @17B: ineg
		// @17C: aload #7
		// @17E: getfield int game.C_100112_r.field_101763_H
		// @181: ineg
		// @182: iadd
		// @183: aload_0
		// @184: getfield int game.C_100010_ff.field_103695_n
		// @187: iadd
		// @188: istore #11
		// @18A: iload #15
		// @18C: ifeq @1C7
		// @18F: aload_0
		// @190: getfield int game.C_100010_ff.field_103704_v
		// @193: iload #10
		// @195: imul
		// @196: ineg
		// @197: aload_0
		// @198: getfield int game.C_100010_ff.field_103695_n
		// @19B: iadd
		// @19C: iload #10
		// @19E: iconst_m1
		// @19F: isub
		// @1A0: idiv
		// @1A1: istore #12
		// @1A3: iload #12
		// @1A5: iconst_m1
		// @1A6: ixor
		// @1A7: iconst_m1
		// @1A8: if_icmpgt @1AF
		// @1AB: goto @1B2
		// @1AE: athrow
		// @1AF: iconst_0
		// @1B0: istore #12
		// @1B2: aload_0
		// @1B3: dup
		// @1B4: getfield int game.C_100010_ff.field_103704_v
		// @1B7: iload #12
		// @1B9: iadd
		// @1BA: putfield int game.C_100010_ff.field_103704_v
		// @1BD: aload #7
		// @1BF: getfield int game.C_100112_r.field_101772_Q
		// @1C2: iload #12
		// @1C4: iadd
		// @1C5: istore #11
		// @1C7: aload_0
		// @1C8: iload #10
		// @1CA: anewarray game.C_100306_kn
		// @1CD: putfield game.C_100306_kn[] game.C_100010_ff.field_103677_g
		// @1D0: iconst_0
		// @1D1: istore #12
		// @1D3: iload #12
		// @1D5: iconst_m1
		// @1D6: ixor
		// @1D7: iload #10
		// @1D9: iconst_m1
		// @1DA: ixor
		// @1DB: if_icmple @276
		// @1DE: aload #9
		// @1E0: iload #12
		// @1E2: aaload
		// @1E3: astore #13
		// @1E5: iload #15
		// @1E7: ifne @302
		// @1EA: new game.C_100306_kn
		// @1ED: dup
		// @1EE: iload #11
		// @1F0: aload #7
		// @1F2: getfield int game.C_100112_r.field_101772_Q
		// @1F5: isub
		// @1F6: iload #11
		// @1F8: aload #7
		// @1FA: getfield int game.C_100112_r.field_101763_H
		// @1FD: ineg
		// @1FE: isub
		// @1FF: aload #13
		// @201: ifnonnull @20C
		// @204: goto @208
		// @207: athrow
		// @208: iconst_0
		// @209: goto @211
		// @20C: aload #13
		// @20E: invokevirtual java.lang.String.length()int
		// @211: invokespecial game.C_100306_kn.<init>(int, int, int)void
		// @214: astore #14
		// @216: aload #14
		// @218: getfield int[] game.C_100306_kn.field_107130_g
		// @21B: iconst_0
		// @21C: iconst_0
		// @21D: iastore
		// @21E: aload #13
		// @220: ifnull @25F
		// @223: aload #14
		// @225: getfield int[] game.C_100306_kn.field_107130_g
		// @228: aload #13
		// @22A: invokevirtual java.lang.String.length()int
		// @22D: aload #7
		// @22F: aload #13
		// @231: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @234: iastore
		// @235: aload #7
		// @237: aload #13
		// @239: iconst_3
		// @23A: iload #5
		// @23C: if_icmpne @257
		// @23F: goto @243
		// @242: athrow
		// @243: aload_0
		// @244: aload #7
		// @246: aload #13
		// @248: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @24B: bipush 117 (0x75)
		// @24D: aload #13
		// @24F: iload_3
		// @250: invokevirtual game.C_100010_ff.func_103666_a(int, byte, java.lang.String, int)int
		// @253: goto @258
		// @256: athrow
		// @257: iconst_0
		// @258: aload #14
		// @25A: bipush -124 (0x84)
		// @25C: invokestatic game.C_100025_he.func_103930_a(game.C_100112_r, java.lang.String, int, game.C_100306_kn, byte)void
		// @25F: iload #11
		// @261: iload_2
		// @262: iadd
		// @263: istore #11
		// @265: aload_0
		// @266: getfield game.C_100306_kn[] game.C_100010_ff.field_103677_g
		// @269: iload #12
		// @26B: aload #14
		// @26D: aastore
		// @26E: iinc #12 +1
		// @271: iload #15
		// @273: ifeq @1D3
		// @276: goto @302
		// @279: astore #9
		// @27B: aload #9
		// @27D: new java.lang.StringBuilder
		// @280: dup
		// @281: invokespecial java.lang.StringBuilder.<init>()void
		// @284: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @287: iconst_3
		// @288: aaload
		// @289: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @28C: iload_1
		// @28D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @290: bipush 44 (0x2C)
		// @292: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @295: iload_2
		// @296: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @299: bipush 44 (0x2C)
		// @29B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @29E: iload_3
		// @29F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2A2: bipush 44 (0x2C)
		// @2A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2A7: aload #4
		// @2A9: ifnull @2B5
		// @2AC: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @2AF: iconst_4
		// @2B0: aaload
		// @2B1: goto @2BA
		// @2B4: athrow
		// @2B5: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @2B8: iconst_5
		// @2B9: aaload
		// @2BA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2BD: bipush 44 (0x2C)
		// @2BF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C2: iload #5
		// @2C4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2C7: bipush 44 (0x2C)
		// @2C9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2CC: iload #6
		// @2CE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2D1: bipush 44 (0x2C)
		// @2D3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2D6: aload #7
		// @2D8: ifnull @2E4
		// @2DB: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @2DE: iconst_4
		// @2DF: aaload
		// @2E0: goto @2E9
		// @2E3: athrow
		// @2E4: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @2E7: iconst_5
		// @2E8: aaload
		// @2E9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2EC: bipush 44 (0x2C)
		// @2EE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2F1: iload #8
		// @2F3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F6: bipush 41 (0x29)
		// @2F8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2FB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2FE: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @301: athrow
		// @302: return
	}
	
	public static void func_103690_f(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100010_ff.field_103709_q
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100010_ff.field_103703_w
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100010_ff.field_103710_p
		// @0C: iload_0
		// @0D: ifeq @1A
		// @10: bipush 63 (0x3F)
		// @12: invokestatic game.C_100010_ff.func_103694_e(int)boolean
		// @15: pop
		// @16: goto @1A
		// @19: athrow
		// @1A: aconst_null
		// @1B: putstatic java.lang.String[] game.C_100010_ff.field_103700_k
		// @1E: aconst_null
		// @1F: putstatic java.lang.String game.C_100010_ff.field_103705_u
		// @22: aconst_null
		// @23: putstatic java.lang.String game.C_100010_ff.field_103701_h
		// @26: goto @4B
		// @29: astore_1
		// @2A: aload_1
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @35: bipush 8 (0x08)
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_0
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 41 (0x29)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @47: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4A: athrow
		// @4B: return
	}
	
	final void func_103685_a(byte arg0, int arg1, String arg2, int arg3, C_100112_r arg4)
	{
		// @000: aconst_null
		// @001: aload_3
		// @002: if_acmpeq @009
		// @005: goto @00F
		// @008: athrow
		// @009: aload_0
		// @00A: aconst_null
		// @00B: putfield game.C_100306_kn[] game.C_100010_ff.field_103677_g
		// @00E: return
		// @00F: iload_1
		// @010: bipush 115 (0x73)
		// @012: if_icmpgt @02B
		// @015: aload_0
		// @016: bipush -92 (0xA4)
		// @018: bipush -66 (0xBE)
		// @01A: bipush 41 (0x29)
		// @01C: aconst_null
		// @01D: checkcast java.lang.String
		// @020: aconst_null
		// @021: checkcast game.C_100112_r
		// @024: invokevirtual game.C_100010_ff.func_103688_a(int, int, byte, java.lang.String, game.C_100112_r)void
		// @027: goto @02B
		// @02A: athrow
		// @02B: aload #5
		// @02D: aload_0
		// @02E: getfield game.C_100112_r game.C_100010_ff.field_103707_s
		// @031: if_acmpne @06A
		// @034: aload_0
		// @035: getfield boolean game.C_100010_ff.field_103698_m
		// @038: ifeq @06A
		// @03B: goto @03F
		// @03E: athrow
		// @03F: bipush -2 (0xFE)
		// @041: aload_0
		// @042: getfield int game.C_100010_ff.field_103708_r
		// @045: iconst_m1
		// @046: ixor
		// @047: if_icmpne @06A
		// @04A: goto @04E
		// @04D: athrow
		// @04E: aconst_null
		// @04F: aload_0
		// @050: getfield java.lang.String game.C_100010_ff.field_103702_i
		// @053: if_acmpeq @06A
		// @056: goto @05A
		// @059: athrow
		// @05A: aload_0
		// @05B: getfield java.lang.String game.C_100010_ff.field_103702_i
		// @05E: aload_3
		// @05F: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @062: ifeq @06A
		// @065: goto @069
		// @068: athrow
		// @069: return
		// @06A: aload_0
		// @06B: iconst_1
		// @06C: putfield int game.C_100010_ff.field_103708_r
		// @06F: aload_0
		// @070: iconst_1
		// @071: putfield boolean game.C_100010_ff.field_103698_m
		// @074: aload_0
		// @075: aload #5
		// @077: putfield game.C_100112_r game.C_100010_ff.field_103707_s
		// @07A: aload_0
		// @07B: aload #5
		// @07D: aload_3
		// @07E: iload_2
		// @07F: iconst_1
		// @080: invokespecial game.C_100010_ff.func_103689_a(game.C_100112_r, java.lang.String, int, boolean)game.C_100306_kn
		// @083: astore #6
		// @085: aload #5
		// @087: aload_3
		// @088: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @08B: istore #7
		// @08D: aload #6
		// @08F: getfield int[] game.C_100306_kn.field_107130_g
		// @092: iconst_0
		// @093: iload #7
		// @095: ldc -1750554719 (0x97a8a7a1)
		// @097: ishr
		// @098: ineg
		// @099: iload #4
		// @09B: iadd
		// @09C: iastore
		// @09D: aload #6
		// @09F: getfield int[] game.C_100306_kn.field_107130_g
		// @0A2: aload_3
		// @0A3: invokevirtual java.lang.String.length()int
		// @0A6: iload #7
		// @0A8: ldc -569937183 (0xde0772e1)
		// @0AA: ishr
		// @0AB: iload #4
		// @0AD: iadd
		// @0AE: iastore
		// @0AF: aload #5
		// @0B1: aload_3
		// @0B2: iconst_0
		// @0B3: aload #6
		// @0B5: bipush -13 (0xF3)
		// @0B7: invokestatic game.C_100025_he.func_103930_a(game.C_100112_r, java.lang.String, int, game.C_100306_kn, byte)void
		// @0BA: goto @129
		// @0BD: astore #6
		// @0BF: aload #6
		// @0C1: new java.lang.StringBuilder
		// @0C4: dup
		// @0C5: invokespecial java.lang.StringBuilder.<init>()void
		// @0C8: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @0CB: bipush 11 (0x0B)
		// @0CD: aaload
		// @0CE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D1: iload_1
		// @0D2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D5: bipush 44 (0x2C)
		// @0D7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0DA: iload_2
		// @0DB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0DE: bipush 44 (0x2C)
		// @0E0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E3: aload_3
		// @0E4: ifnull @0F0
		// @0E7: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @0EA: iconst_4
		// @0EB: aaload
		// @0EC: goto @0F5
		// @0EF: athrow
		// @0F0: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @0F3: iconst_5
		// @0F4: aaload
		// @0F5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F8: bipush 44 (0x2C)
		// @0FA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FD: iload #4
		// @0FF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @102: bipush 44 (0x2C)
		// @104: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @107: aload #5
		// @109: ifnull @115
		// @10C: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @10F: iconst_4
		// @110: aaload
		// @111: goto @11A
		// @114: athrow
		// @115: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @118: iconst_5
		// @119: aaload
		// @11A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @11D: bipush 41 (0x29)
		// @11F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @122: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @125: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @128: athrow
		// @129: return
	}
	
	static final boolean func_103693_b(int arg0, int arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #11
		// @005: iconst_1
		// @006: istore_3
		// @007: getstatic boolean game.C_100149_bi.field_105158_a
		// @00A: ifne @01D
		// @00D: getstatic game.C_100302_ka game.C_100154_sl.field_105332_e
		// @010: ifnull @01B
		// @013: goto @017
		// @016: athrow
		// @017: goto @01D
		// @01A: athrow
		// @01B: iconst_0
		// @01C: istore_3
		// @01D: iconst_0
		// @01E: getstatic int game.C_100113_ek.field_104880_b
		// @021: if_icmpne @031
		// @024: aconst_null
		// @025: getstatic game.C_100211_qd game.SteelSentinels.field_105274_N
		// @028: if_acmpeq @031
		// @02B: goto @02F
		// @02E: athrow
		// @02F: iconst_0
		// @030: istore_3
		// @031: iconst_2
		// @032: getstatic int game.C_100113_ek.field_104880_b
		// @035: if_icmpne @046
		// @038: bipush -42 (0xD6)
		// @03A: invokestatic game.C_100286_nl.func_106795_b(byte)boolean
		// @03D: ifne @046
		// @040: goto @044
		// @043: athrow
		// @044: iconst_0
		// @045: istore_3
		// @046: iload_1
		// @047: sipush -32533 (0x80EB)
		// @04A: if_icmpeq @056
		// @04D: bipush 67 (0x43)
		// @04F: putstatic int game.C_100010_ff.field_103699_j
		// @052: goto @056
		// @055: athrow
		// @056: bipush -85 (0xAB)
		// @058: getstatic int game.C_100293_kj.field_106890_c
		// @05B: iconst_m1
		// @05C: ixor
		// @05D: if_icmpne @11B
		// @060: iload_3
		// @061: ifeq @100
		// @064: goto @068
		// @067: athrow
		// @068: getstatic java.lang.StringBuilder game.C_100183_cd.field_103422_O
		// @06B: invokevirtual java.lang.StringBuilder.length()int
		// @06E: ifgt @079
		// @071: goto @075
		// @074: athrow
		// @075: goto @0F3
		// @078: athrow
		// @079: getstatic java.lang.StringBuilder game.C_100183_cd.field_103422_O
		// @07C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @07F: astore #4
		// @081: bipush -66 (0xBE)
		// @083: aload #4
		// @085: invokestatic game.C_100004_gb.func_103571_a(byte, java.lang.String)boolean
		// @088: ifne @0D7
		// @08B: getstatic int game.C_100113_ek.field_104880_b
		// @08E: istore #5
		// @090: iload #5
		// @092: iconst_m1
		// @093: ixor
		// @094: iconst_m1
		// @095: if_icmpne @0A9
		// @098: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @09B: ifnonnull @0A6
		// @09E: goto @0A2
		// @0A1: athrow
		// @0A2: goto @0A9
		// @0A5: athrow
		// @0A6: iconst_1
		// @0A7: istore #5
		// @0A9: iload_1
		// @0AA: ldc 37841 (0x93d1)
		// @0AC: iadd
		// @0AD: iload #5
		// @0AF: invokestatic game.C_100218_am.func_103108_a(int, int)int
		// @0B2: iconst_2
		// @0B3: if_icmpeq @0BA
		// @0B6: goto @0C3
		// @0B9: athrow
		// @0BA: iload #5
		// @0BC: bipush -127 (0x81)
		// @0BE: iconst_1
		// @0BF: iload_2
		// @0C0: invokestatic game.C_100290_jm.func_106850_a(int, int, int, int)void
		// @0C3: getstatic java.lang.String game.C_100050_vg.field_100630_m
		// @0C6: getstatic int game.C_100113_ek.field_104880_b
		// @0C9: bipush 6 (0x06)
		// @0CB: aload #4
		// @0CD: iload_0
		// @0CE: iconst_m1
		// @0CF: invokestatic game.C_100263_mb.func_106503_a(java.lang.String, int, byte, java.lang.String, int, int)void
		// @0D2: iload #11
		// @0D4: ifeq @0F3
		// @0D7: aconst_null
		// @0D8: ldc -1221466785 (0xb731e55f)
		// @0DA: iconst_0
		// @0DB: iconst_2
		// @0DC: aconst_null
		// @0DD: getstatic java.lang.String game.C_100151_bc.field_102936_U
		// @0E0: invokestatic game.C_100019_wl.func_103834_a(java.lang.String, int, int, int, java.lang.String, java.lang.String)void
		// @0E3: aconst_null
		// @0E4: ldc -1221466785 (0xb731e55f)
		// @0E6: iconst_0
		// @0E7: iconst_2
		// @0E8: aconst_null
		// @0E9: getstatic java.lang.String game.C_100203_ql.field_105929_e
		// @0EC: invokestatic game.C_100019_wl.func_103834_a(java.lang.String, int, int, int, java.lang.String, java.lang.String)void
		// @0EF: goto @0F3
		// @0F2: athrow
		// @0F3: iload_1
		// @0F4: sipush -32624 (0x8090)
		// @0F7: ixor
		// @0F8: invokestatic game.C_100233_oa.func_106223_b(int)void
		// @0FB: iload #11
		// @0FD: ifeq @119
		// @100: getstatic int game.C_100113_ek.field_104880_b
		// @103: iconst_m1
		// @104: ixor
		// @105: iconst_m1
		// @106: if_icmpne @111
		// @109: goto @10D
		// @10C: athrow
		// @10D: goto @119
		// @110: athrow
		// @111: iload_1
		// @112: sipush -32633 (0x8087)
		// @115: ixor
		// @116: invokestatic game.C_100233_oa.func_106223_b(int)void
		// @119: iconst_1
		// @11A: ireturn
		// @11B: bipush 85 (0x55)
		// @11D: getstatic int game.C_100293_kj.field_106890_c
		// @120: if_icmpne @151
		// @123: iload_3
		// @124: ifeq @14F
		// @127: goto @12B
		// @12A: athrow
		// @12B: getstatic java.lang.StringBuilder game.C_100183_cd.field_103422_O
		// @12E: invokevirtual java.lang.StringBuilder.length()int
		// @131: ifgt @13C
		// @134: goto @138
		// @137: athrow
		// @138: goto @14F
		// @13B: athrow
		// @13C: bipush 32 (0x20)
		// @13E: bipush 69 (0x45)
		// @140: getstatic java.lang.StringBuilder game.C_100183_cd.field_103422_O
		// @143: getstatic java.lang.StringBuilder game.C_100183_cd.field_103422_O
		// @146: invokevirtual java.lang.StringBuilder.length()int
		// @149: iconst_m1
		// @14A: iadd
		// @14B: invokestatic game.C_100062_dk.func_104278_a(char, byte, java.lang.StringBuilder, int)java.lang.StringBuilder
		// @14E: pop
		// @14F: iconst_1
		// @150: ireturn
		// @151: getstatic char game.C_100012_fh.field_100517_Q
		// @154: istore #4
		// @156: iload #4
		// @158: sipush 339 (0x0153)
		// @15B: invokestatic game.C_100024_hd.func_102988_a(char, int)boolean
		// @15E: ifeq @314
		// @161: iload_3
		// @162: ifeq @312
		// @165: goto @169
		// @168: athrow
		// @169: bipush -81 (0xAF)
		// @16B: getstatic java.lang.StringBuilder game.C_100183_cd.field_103422_O
		// @16E: invokevirtual java.lang.StringBuilder.length()int
		// @171: iconst_m1
		// @172: ixor
		// @173: if_icmpge @312
		// @176: goto @17A
		// @179: athrow
		// @17A: getstatic java.lang.StringBuilder game.C_100183_cd.field_103422_O
		// @17D: iload #4
		// @17F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @182: pop
		// @183: sipush 485 (0x01E5)
		// @186: istore #5
		// @188: getstatic java.lang.String game.C_100339_jb.field_107391_h
		// @18B: astore #6
		// @18D: aload #6
		// @18F: bipush -99 (0x9D)
		// @191: invokestatic game.C_100161_sd.func_105419_a(java.lang.String, int)java.lang.String
		// @194: astore #6
		// @196: getstatic int game.C_100113_ek.field_104880_b
		// @199: iconst_m1
		// @19A: ixor
		// @19B: bipush -3 (0xFD)
		// @19D: if_icmpne @205
		// @1A0: sipush -30945 (0x871F)
		// @1A3: iconst_1
		// @1A4: anewarray java.lang.String
		// @1A7: dup
		// @1A8: iconst_0
		// @1A9: bipush 125 (0x7D)
		// @1AB: getstatic java.lang.String game.C_100050_vg.field_100630_m
		// @1AE: invokestatic game.C_100303_kk.func_104779_a(int, java.lang.CharSequence)java.lang.String
		// @1B1: aastore
		// @1B2: getstatic java.lang.String game.C_100249_pc.field_102331_C
		// @1B5: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @1B8: astore #7
		// @1BA: sipush -30945 (0x871F)
		// @1BD: iconst_1
		// @1BE: anewarray java.lang.String
		// @1C1: dup
		// @1C2: iconst_0
		// @1C3: aload #6
		// @1C5: aastore
		// @1C6: getstatic java.lang.String game.C_100278_nd.field_101205_y
		// @1C9: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @1CC: astore #8
		// @1CE: getstatic game.C_100112_r game.C_100053_vn.field_102827_cb
		// @1D1: aload #7
		// @1D3: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @1D6: istore #9
		// @1D8: getstatic game.C_100112_r game.C_100053_vn.field_102827_cb
		// @1DB: aload #8
		// @1DD: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @1E0: istore #10
		// @1E2: iload #10
		// @1E4: iconst_m1
		// @1E5: ixor
		// @1E6: iload #9
		// @1E8: iconst_m1
		// @1E9: ixor
		// @1EA: if_icmpgt @1F9
		// @1ED: iload #5
		// @1EF: iload #10
		// @1F1: isub
		// @1F2: istore #5
		// @1F4: iload #11
		// @1F6: ifeq @200
		// @1F9: iload #5
		// @1FB: iload #9
		// @1FD: isub
		// @1FE: istore #5
		// @200: iload #11
		// @202: ifeq @2E6
		// @205: ldc ""
		// @207: astore #7
		// @209: getstatic int game.C_100113_ek.field_104880_b
		// @20C: iconst_m1
		// @20D: ixor
		// @20E: iconst_m1
		// @20F: if_icmpeq @216
		// @212: goto @2BB
		// @215: athrow
		// @216: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @219: ifnonnull @249
		// @21C: getstatic boolean game.C_100024_hd.field_103002_x
		// @21F: ifne @22A
		// @222: goto @226
		// @225: athrow
		// @226: goto @249
		// @229: athrow
		// @22A: new java.lang.StringBuilder
		// @22D: dup
		// @22E: invokespecial java.lang.StringBuilder.<init>()void
		// @231: ldc "["
		// @233: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @236: getstatic java.lang.String game.C_100272_mn.field_102432_H
		// @239: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23C: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @23F: iconst_0
		// @240: aaload
		// @241: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @244: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @247: astore #7
		// @249: aconst_null
		// @24A: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @24D: if_acmpne @254
		// @250: goto @2BB
		// @253: athrow
		// @254: getstatic boolean game.C_100069_vb.field_104356_d
		// @257: ifeq @289
		// @25A: aconst_null
		// @25B: getstatic java.lang.String game.C_100281_ng.field_103461_O
		// @25E: if_acmpeq @289
		// @261: goto @265
		// @264: athrow
		// @265: new java.lang.StringBuilder
		// @268: dup
		// @269: invokespecial java.lang.StringBuilder.<init>()void
		// @26C: ldc "["
		// @26E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @271: getstatic java.lang.String game.C_100281_ng.field_103461_O
		// @274: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @277: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @27A: iconst_0
		// @27B: aaload
		// @27C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @282: astore #7
		// @284: iload #11
		// @286: ifeq @2BB
		// @289: new java.lang.StringBuilder
		// @28C: dup
		// @28D: invokespecial java.lang.StringBuilder.<init>()void
		// @290: ldc "["
		// @292: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @295: sipush -30945 (0x871F)
		// @298: iconst_1
		// @299: anewarray java.lang.String
		// @29C: dup
		// @29D: iconst_0
		// @29E: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @2A1: getfield java.lang.String game.C_100211_qd.field_102155_dc
		// @2A4: aastore
		// @2A5: getstatic java.lang.String game.C_100287_nm.field_106823_g
		// @2A8: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @2AB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2AE: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @2B1: iconst_0
		// @2B2: aaload
		// @2B3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2B9: astore #7
		// @2BB: new java.lang.StringBuilder
		// @2BE: dup
		// @2BF: invokespecial java.lang.StringBuilder.<init>()void
		// @2C2: aload #7
		// @2C4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C7: aload #6
		// @2C9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2CC: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @2CF: iconst_1
		// @2D0: aaload
		// @2D1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2D7: astore #7
		// @2D9: iload #5
		// @2DB: getstatic game.C_100112_r game.C_100053_vn.field_102827_cb
		// @2DE: aload #7
		// @2E0: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @2E3: isub
		// @2E4: istore #5
		// @2E6: iload #5
		// @2E8: iconst_m1
		// @2E9: ixor
		// @2EA: getstatic game.C_100112_r game.C_100053_vn.field_102827_cb
		// @2ED: getstatic java.lang.StringBuilder game.C_100183_cd.field_103422_O
		// @2F0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2F3: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @2F6: iconst_m1
		// @2F7: ixor
		// @2F8: if_icmple @312
		// @2FB: bipush 32 (0x20)
		// @2FD: bipush 21 (0x15)
		// @2FF: getstatic java.lang.StringBuilder game.C_100183_cd.field_103422_O
		// @302: getstatic java.lang.StringBuilder game.C_100183_cd.field_103422_O
		// @305: invokevirtual java.lang.StringBuilder.length()int
		// @308: iconst_m1
		// @309: iadd
		// @30A: invokestatic game.C_100062_dk.func_104278_a(char, byte, java.lang.StringBuilder, int)java.lang.StringBuilder
		// @30D: pop
		// @30E: goto @312
		// @311: athrow
		// @312: iconst_1
		// @313: ireturn
		// @314: iconst_0
		// @315: ireturn
		// @316: astore_3
		// @317: aload_3
		// @318: new java.lang.StringBuilder
		// @31B: dup
		// @31C: invokespecial java.lang.StringBuilder.<init>()void
		// @31F: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @322: iconst_2
		// @323: aaload
		// @324: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @327: iload_0
		// @328: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @32B: bipush 44 (0x2C)
		// @32D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @330: iload_1
		// @331: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @334: bipush 44 (0x2C)
		// @336: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @339: iload_2
		// @33A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @33D: bipush 41 (0x29)
		// @33F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @342: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @345: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @348: athrow
	}
	
	static final void func_103692_a(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #13
		// @005: iload_1
		// @006: iload_3
		// @007: ineg
		// @008: isub
		// @009: istore #5
		// @00B: iload_0
		// @00C: iload #4
		// @00E: iadd
		// @00F: istore #6
		// @011: iload_1
		// @012: getstatic int game.C_100196_rb.field_105827_i
		// @015: if_icmple @01D
		// @018: iload_1
		// @019: goto @020
		// @01C: athrow
		// @01D: getstatic int game.C_100196_rb.field_105827_i
		// @020: istore #7
		// @022: getstatic int game.C_100196_rb.field_105816_f
		// @025: iload #4
		// @027: if_icmpge @030
		// @02A: iload #4
		// @02C: goto @033
		// @02F: athrow
		// @030: getstatic int game.C_100196_rb.field_105816_f
		// @033: istore #8
		// @035: getstatic int game.C_100196_rb.field_105820_b
		// @038: iconst_m1
		// @039: ixor
		// @03A: iload #5
		// @03C: iconst_m1
		// @03D: ixor
		// @03E: if_icmplt @048
		// @041: getstatic int game.C_100196_rb.field_105820_b
		// @044: goto @04A
		// @047: athrow
		// @048: iload #5
		// @04A: istore #9
		// @04C: iload #6
		// @04E: getstatic int game.C_100196_rb.field_105823_l
		// @051: if_icmpge @05A
		// @054: iload #6
		// @056: goto @05D
		// @059: athrow
		// @05A: getstatic int game.C_100196_rb.field_105823_l
		// @05D: istore #10
		// @05F: getstatic int game.C_100196_rb.field_105827_i
		// @062: iconst_m1
		// @063: ixor
		// @064: iload_1
		// @065: iconst_m1
		// @066: ixor
		// @067: if_icmplt @0C0
		// @06A: iload_1
		// @06B: iconst_m1
		// @06C: ixor
		// @06D: getstatic int game.C_100196_rb.field_105820_b
		// @070: iconst_m1
		// @071: ixor
		// @072: if_icmpgt @07D
		// @075: goto @079
		// @078: athrow
		// @079: goto @0C0
		// @07C: athrow
		// @07D: iload_1
		// @07E: getstatic int game.C_100196_rb.field_105819_e
		// @081: iload #8
		// @083: imul
		// @084: iadd
		// @085: istore #11
		// @087: iload #8
		// @089: ineg
		// @08A: iconst_1
		// @08B: iload #10
		// @08D: ineg
		// @08E: isub
		// @08F: iadd
		// @090: ldc -1822641823 (0x935cb161)
		// @092: ishr
		// @093: istore #12
		// @095: iconst_m1
		// @096: iinc #12 +255
		// @099: iload #12
		// @09B: iconst_m1
		// @09C: ixor
		// @09D: if_icmplt @0C0
		// @0A0: getstatic int[] game.C_100196_rb.field_105818_d
		// @0A3: iload #11
		// @0A5: ldc 16777215 (0xffffff)
		// @0A7: iastore
		// @0A8: iload #11
		// @0AA: getstatic int game.C_100196_rb.field_105819_e
		// @0AD: iconst_2
		// @0AE: imul
		// @0AF: iadd
		// @0B0: istore #11
		// @0B2: iload #13
		// @0B4: ifne @112
		// @0B7: iload #13
		// @0B9: ifeq @095
		// @0BC: goto @0C0
		// @0BF: athrow
		// @0C0: getstatic int game.C_100196_rb.field_105816_f
		// @0C3: iconst_m1
		// @0C4: ixor
		// @0C5: iload #4
		// @0C7: iconst_m1
		// @0C8: ixor
		// @0C9: if_icmplt @112
		// @0CC: getstatic int game.C_100196_rb.field_105823_l
		// @0CF: iload #6
		// @0D1: if_icmple @112
		// @0D4: goto @0D8
		// @0D7: athrow
		// @0D8: iload #4
		// @0DA: getstatic int game.C_100196_rb.field_105819_e
		// @0DD: imul
		// @0DE: iload #7
		// @0E0: iadd
		// @0E1: istore #11
		// @0E3: iload #7
		// @0E5: ineg
		// @0E6: iconst_1
		// @0E7: iload #9
		// @0E9: ineg
		// @0EA: isub
		// @0EB: iadd
		// @0EC: ldc 1153902177 (0x44c72661)
		// @0EE: ishr
		// @0EF: istore #12
		// @0F1: iinc #12 +255
		// @0F4: iload #12
		// @0F6: iflt @112
		// @0F9: getstatic int[] game.C_100196_rb.field_105818_d
		// @0FC: iload #11
		// @0FE: ldc 16777215 (0xffffff)
		// @100: iastore
		// @101: iinc #11 +2
		// @104: iload #13
		// @106: ifne @124
		// @109: iload #13
		// @10B: ifeq @0F1
		// @10E: goto @112
		// @111: athrow
		// @112: iload_2
		// @113: sipush 11534 (0x2D0E)
		// @116: if_icmpeq @124
		// @119: aconst_null
		// @11A: checkcast java.lang.String
		// @11D: putstatic java.lang.String game.C_100010_ff.field_103705_u
		// @120: goto @124
		// @123: athrow
		// @124: iload #5
		// @126: getstatic int game.C_100196_rb.field_105827_i
		// @129: if_icmplt @189
		// @12C: getstatic int game.C_100196_rb.field_105820_b
		// @12F: iload #5
		// @131: if_icmpgt @13C
		// @134: goto @138
		// @137: athrow
		// @138: goto @189
		// @13B: athrow
		// @13C: getstatic int game.C_100196_rb.field_105819_e
		// @13F: iconst_1
		// @140: iload_1
		// @141: ineg
		// @142: iload #5
		// @144: iadd
		// @145: iand
		// @146: iload #8
		// @148: iadd
		// @149: imul
		// @14A: iload #5
		// @14C: ineg
		// @14D: isub
		// @14E: istore #11
		// @150: iconst_1
		// @151: iload #10
		// @153: ineg
		// @154: isub
		// @155: iload #8
		// @157: ineg
		// @158: iadd
		// @159: ldc -1436817055 (0xaa5be961)
		// @15B: ishr
		// @15C: istore #12
		// @15E: iconst_m1
		// @15F: iinc #12 +255
		// @162: iload #12
		// @164: iconst_m1
		// @165: ixor
		// @166: if_icmplt @189
		// @169: getstatic int[] game.C_100196_rb.field_105818_d
		// @16C: iload #11
		// @16E: ldc 16777215 (0xffffff)
		// @170: iastore
		// @171: iload #11
		// @173: iconst_2
		// @174: getstatic int game.C_100196_rb.field_105819_e
		// @177: imul
		// @178: iadd
		// @179: istore #11
		// @17B: iload #13
		// @17D: ifne @1E4
		// @180: iload #13
		// @182: ifeq @15E
		// @185: goto @189
		// @188: athrow
		// @189: iload #4
		// @18B: iconst_m1
		// @18C: ixor
		// @18D: getstatic int game.C_100196_rb.field_105816_f
		// @190: iconst_m1
		// @191: ixor
		// @192: if_icmpgt @1E4
		// @195: iload #6
		// @197: getstatic int game.C_100196_rb.field_105823_l
		// @19A: if_icmpge @1E4
		// @19D: goto @1A1
		// @1A0: athrow
		// @1A1: iload #7
		// @1A3: iload #6
		// @1A5: getstatic int game.C_100196_rb.field_105819_e
		// @1A8: imul
		// @1A9: iconst_1
		// @1AA: iload #4
		// @1AC: ineg
		// @1AD: iload #6
		// @1AF: iadd
		// @1B0: iand
		// @1B1: iadd
		// @1B2: iadd
		// @1B3: istore #11
		// @1B5: iload #7
		// @1B7: ineg
		// @1B8: iconst_1
		// @1B9: iload #9
		// @1BB: iadd
		// @1BC: iadd
		// @1BD: ldc 458531169 (0x1b54a161)
		// @1BF: ishr
		// @1C0: istore #12
		// @1C2: iconst_0
		// @1C3: iinc #12 +255
		// @1C6: iload #12
		// @1C8: if_icmpgt @1E4
		// @1CB: getstatic int[] game.C_100196_rb.field_105818_d
		// @1CE: iload #11
		// @1D0: ldc 16777215 (0xffffff)
		// @1D2: iastore
		// @1D3: iinc #11 +2
		// @1D6: iload #13
		// @1D8: ifne @230
		// @1DB: iload #13
		// @1DD: ifeq @1C2
		// @1E0: goto @1E4
		// @1E3: athrow
		// @1E4: goto @230
		// @1E7: astore #5
		// @1E9: aload #5
		// @1EB: new java.lang.StringBuilder
		// @1EE: dup
		// @1EF: invokespecial java.lang.StringBuilder.<init>()void
		// @1F2: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @1F5: bipush 6 (0x06)
		// @1F7: aaload
		// @1F8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1FB: iload_0
		// @1FC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1FF: bipush 44 (0x2C)
		// @201: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @204: iload_1
		// @205: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @208: bipush 44 (0x2C)
		// @20A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @20D: iload_2
		// @20E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @211: bipush 44 (0x2C)
		// @213: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @216: iload_3
		// @217: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @21A: bipush 44 (0x2C)
		// @21C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @21F: iload #4
		// @221: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @224: bipush 41 (0x29)
		// @226: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @229: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @22C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @22F: athrow
		// @230: return
	}
	
	private final C_100306_kn func_103689_a(C_100112_r arg0, String arg1, int arg2, boolean arg3)
	{
		// @00: new game.C_100306_kn
		// @03: dup
		// @04: iload_3
		// @05: aload_1
		// @06: getfield int game.C_100112_r.field_101772_Q
		// @09: ineg
		// @0A: iadd
		// @0B: iload_3
		// @0C: aload_1
		// @0D: getfield int game.C_100112_r.field_101763_H
		// @10: ineg
		// @11: isub
		// @12: aload_2
		// @13: invokevirtual java.lang.String.length()int
		// @16: invokespecial game.C_100306_kn.<init>(int, int, int)void
		// @19: astore #5
		// @1B: aload_0
		// @1C: iconst_1
		// @1D: anewarray game.C_100306_kn
		// @20: dup
		// @21: iconst_0
		// @22: aload #5
		// @24: aastore
		// @25: putfield game.C_100306_kn[] game.C_100010_ff.field_103677_g
		// @28: iload #4
		// @2A: iconst_1
		// @2B: if_icmpeq @33
		// @2E: aconst_null
		// @2F: checkcast game.C_100306_kn
		// @32: areturn
		// @33: aload #5
		// @35: areturn
		// @36: astore #5
		// @38: aload #5
		// @3A: new java.lang.StringBuilder
		// @3D: dup
		// @3E: invokespecial java.lang.StringBuilder.<init>()void
		// @41: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @44: bipush 9 (0x09)
		// @46: aaload
		// @47: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4A: aload_1
		// @4B: ifnull @57
		// @4E: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @51: iconst_4
		// @52: aaload
		// @53: goto @5C
		// @56: athrow
		// @57: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @5A: iconst_5
		// @5B: aaload
		// @5C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5F: bipush 44 (0x2C)
		// @61: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @64: aload_2
		// @65: ifnull @71
		// @68: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @6B: iconst_4
		// @6C: aaload
		// @6D: goto @76
		// @70: athrow
		// @71: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @74: iconst_5
		// @75: aaload
		// @76: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @79: bipush 44 (0x2C)
		// @7B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7E: iload_3
		// @7F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @82: bipush 44 (0x2C)
		// @84: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @87: iload #4
		// @89: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @8C: bipush 41 (0x29)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @94: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @97: athrow
	}
	
	final void func_103684_a(int arg0, byte arg1, String arg2, int arg3, C_100112_r arg4)
	{
		// @000: aload_3
		// @001: ifnonnull @00A
		// @004: aload_0
		// @005: aconst_null
		// @006: putfield game.C_100306_kn[] game.C_100010_ff.field_103677_g
		// @009: return
		// @00A: iload_2
		// @00B: bipush -94 (0xA2)
		// @00D: if_icmple @01B
		// @010: aconst_null
		// @011: checkcast java.lang.String
		// @014: putstatic java.lang.String game.C_100010_ff.field_103709_q
		// @017: goto @01B
		// @01A: athrow
		// @01B: aload #5
		// @01D: aload_0
		// @01E: getfield game.C_100112_r game.C_100010_ff.field_103707_s
		// @021: if_acmpne @057
		// @024: aload_0
		// @025: getfield boolean game.C_100010_ff.field_103698_m
		// @028: ifeq @057
		// @02B: goto @02F
		// @02E: athrow
		// @02F: iconst_2
		// @030: aload_0
		// @031: getfield int game.C_100010_ff.field_103708_r
		// @034: if_icmpne @057
		// @037: goto @03B
		// @03A: athrow
		// @03B: aconst_null
		// @03C: aload_0
		// @03D: getfield java.lang.String game.C_100010_ff.field_103702_i
		// @040: if_acmpeq @057
		// @043: goto @047
		// @046: athrow
		// @047: aload_0
		// @048: getfield java.lang.String game.C_100010_ff.field_103702_i
		// @04B: aload_3
		// @04C: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @04F: ifeq @057
		// @052: goto @056
		// @055: athrow
		// @056: return
		// @057: aload_0
		// @058: iconst_2
		// @059: putfield int game.C_100010_ff.field_103708_r
		// @05C: aload_0
		// @05D: aload #5
		// @05F: putfield game.C_100112_r game.C_100010_ff.field_103707_s
		// @062: aload_0
		// @063: aload_3
		// @064: putfield java.lang.String game.C_100010_ff.field_103702_i
		// @067: aload_0
		// @068: iconst_1
		// @069: putfield boolean game.C_100010_ff.field_103698_m
		// @06C: aload_0
		// @06D: aload #5
		// @06F: aload_3
		// @070: iload #4
		// @072: iconst_1
		// @073: invokespecial game.C_100010_ff.func_103689_a(game.C_100112_r, java.lang.String, int, boolean)game.C_100306_kn
		// @076: astore #6
		// @078: aload #6
		// @07A: getfield int[] game.C_100306_kn.field_107130_g
		// @07D: iconst_0
		// @07E: aload #5
		// @080: aload_3
		// @081: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @084: ineg
		// @085: iload_1
		// @086: iadd
		// @087: iastore
		// @088: aload #6
		// @08A: getfield int[] game.C_100306_kn.field_107130_g
		// @08D: aload_3
		// @08E: invokevirtual java.lang.String.length()int
		// @091: iload_1
		// @092: iastore
		// @093: aload #5
		// @095: aload_3
		// @096: iconst_0
		// @097: aload #6
		// @099: bipush -26 (0xE6)
		// @09B: invokestatic game.C_100025_he.func_103930_a(game.C_100112_r, java.lang.String, int, game.C_100306_kn, byte)void
		// @09E: goto @10D
		// @0A1: astore #6
		// @0A3: aload #6
		// @0A5: new java.lang.StringBuilder
		// @0A8: dup
		// @0A9: invokespecial java.lang.StringBuilder.<init>()void
		// @0AC: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @0AF: bipush 10 (0x0A)
		// @0B1: aaload
		// @0B2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0B5: iload_1
		// @0B6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0B9: bipush 44 (0x2C)
		// @0BB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0BE: iload_2
		// @0BF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0C2: bipush 44 (0x2C)
		// @0C4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0C7: aload_3
		// @0C8: ifnull @0D4
		// @0CB: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @0CE: iconst_4
		// @0CF: aaload
		// @0D0: goto @0D9
		// @0D3: athrow
		// @0D4: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @0D7: iconst_5
		// @0D8: aaload
		// @0D9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0DC: bipush 44 (0x2C)
		// @0DE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E1: iload #4
		// @0E3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E6: bipush 44 (0x2C)
		// @0E8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0EB: aload #5
		// @0ED: ifnull @0F9
		// @0F0: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @0F3: iconst_4
		// @0F4: aaload
		// @0F5: goto @0FE
		// @0F8: athrow
		// @0F9: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @0FC: iconst_5
		// @0FD: aaload
		// @0FE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @101: bipush 41 (0x29)
		// @103: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @106: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @109: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @10C: athrow
		// @10D: return
	}
	
	final void func_103688_a(int arg0, int arg1, byte arg2, String arg3, C_100112_r arg4)
	{
		// @000: aconst_null
		// @001: aload #4
		// @003: if_acmpne @00C
		// @006: aload_0
		// @007: aconst_null
		// @008: putfield game.C_100306_kn[] game.C_100010_ff.field_103677_g
		// @00B: return
		// @00C: aload #5
		// @00E: aload_0
		// @00F: getfield game.C_100112_r game.C_100010_ff.field_103707_s
		// @012: if_acmpne @048
		// @015: aload_0
		// @016: getfield boolean game.C_100010_ff.field_103698_m
		// @019: ifeq @048
		// @01C: goto @020
		// @01F: athrow
		// @020: iconst_0
		// @021: aload_0
		// @022: getfield int game.C_100010_ff.field_103708_r
		// @025: if_icmpne @048
		// @028: goto @02C
		// @02B: athrow
		// @02C: aload_0
		// @02D: getfield java.lang.String game.C_100010_ff.field_103702_i
		// @030: ifnull @048
		// @033: goto @037
		// @036: athrow
		// @037: aload_0
		// @038: getfield java.lang.String game.C_100010_ff.field_103702_i
		// @03B: aload #4
		// @03D: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @040: ifeq @048
		// @043: goto @047
		// @046: athrow
		// @047: return
		// @048: aload_0
		// @049: aload #5
		// @04B: putfield game.C_100112_r game.C_100010_ff.field_103707_s
		// @04E: aload_0
		// @04F: iconst_1
		// @050: putfield boolean game.C_100010_ff.field_103698_m
		// @053: aload_0
		// @054: iconst_0
		// @055: putfield int game.C_100010_ff.field_103708_r
		// @058: aload_0
		// @059: aload #4
		// @05B: putfield java.lang.String game.C_100010_ff.field_103702_i
		// @05E: iload_3
		// @05F: bipush 23 (0x17)
		// @061: if_icmpeq @080
		// @064: aload_0
		// @065: bipush 127 (0x7F)
		// @067: bipush 100 (0x64)
		// @069: bipush 68 (0x44)
		// @06B: aconst_null
		// @06C: checkcast java.lang.String
		// @06F: bipush 35 (0x23)
		// @071: bipush -115 (0x8D)
		// @073: aconst_null
		// @074: checkcast game.C_100112_r
		// @077: bipush -124 (0x84)
		// @079: invokevirtual game.C_100010_ff.func_103691_a(int, int, int, java.lang.String, int, byte, game.C_100112_r, int)void
		// @07C: goto @080
		// @07F: athrow
		// @080: aload_0
		// @081: aload #5
		// @083: aload #4
		// @085: iload_1
		// @086: iconst_1
		// @087: invokespecial game.C_100010_ff.func_103689_a(game.C_100112_r, java.lang.String, int, boolean)game.C_100306_kn
		// @08A: astore #6
		// @08C: aload #6
		// @08E: getfield int[] game.C_100306_kn.field_107130_g
		// @091: iconst_0
		// @092: iload_2
		// @093: iastore
		// @094: aload #6
		// @096: getfield int[] game.C_100306_kn.field_107130_g
		// @099: aload #4
		// @09B: invokevirtual java.lang.String.length()int
		// @09E: iload_2
		// @09F: aload #5
		// @0A1: aload #4
		// @0A3: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @0A6: ineg
		// @0A7: isub
		// @0A8: iastore
		// @0A9: aload #5
		// @0AB: aload #4
		// @0AD: iconst_0
		// @0AE: aload #6
		// @0B0: bipush -15 (0xF1)
		// @0B2: invokestatic game.C_100025_he.func_103930_a(game.C_100112_r, java.lang.String, int, game.C_100306_kn, byte)void
		// @0B5: goto @124
		// @0B8: astore #6
		// @0BA: aload #6
		// @0BC: new java.lang.StringBuilder
		// @0BF: dup
		// @0C0: invokespecial java.lang.StringBuilder.<init>()void
		// @0C3: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @0C6: bipush 12 (0x0C)
		// @0C8: aaload
		// @0C9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0CC: iload_1
		// @0CD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D0: bipush 44 (0x2C)
		// @0D2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D5: iload_2
		// @0D6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D9: bipush 44 (0x2C)
		// @0DB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0DE: iload_3
		// @0DF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E2: bipush 44 (0x2C)
		// @0E4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E7: aload #4
		// @0E9: ifnull @0F5
		// @0EC: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @0EF: iconst_4
		// @0F0: aaload
		// @0F1: goto @0FA
		// @0F4: athrow
		// @0F5: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @0F8: iconst_5
		// @0F9: aaload
		// @0FA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0FD: bipush 44 (0x2C)
		// @0FF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @102: aload #5
		// @104: ifnull @110
		// @107: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @10A: iconst_4
		// @10B: aaload
		// @10C: goto @115
		// @10F: athrow
		// @110: getstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @113: iconst_5
		// @114: aaload
		// @115: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @118: bipush 41 (0x29)
		// @11A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @11D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @120: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @123: athrow
		// @124: return
	}
	
	static
	{
		// @000: bipush 13 (0x0D)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "\u0002J"
		// @009: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "eJ"
		// @014: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @017: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "9\u000cQ,T"
		// @01F: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @022: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "9\u000cQ.T"
		// @02A: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "$DQA\u0001"
		// @035: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @038: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "1\u001f\u0013\u0003"
		// @040: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @043: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "9\u000cQ)T"
		// @04C: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "9\u000cQ'T"
		// @058: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "9\u000cQ&T"
		// @064: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @067: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "9\u000cQ-T"
		// @070: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @073: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "9\u000cQ*T"
		// @07C: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "9\u000cQ(T"
		// @088: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "9\u000cQ+T"
		// @094: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @097: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @09A: aastore
		// @09B: putstatic java.lang.String[] game.C_100010_ff.field_103711_z
		// @09E: ldc "\u000b\u0002\u0016\u001c\\8\u000b\u0012\n\\0\u001a\u000b\u0006\u00131J\u0016\u001c\\1\u0005\u000bO\u001d)\u000b\u0016\u0003\u001d=\u0006\u001aO\u00151J\r\u000e\u0008:\u000e_\u0008\u001d2\u000f\u000cA"
		// @0A0: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @0A6: putstatic java.lang.String game.C_100010_ff.field_103703_w
		// @0A9: ldc "\u001a\u0004\u0018\u0006\u0012:\u000f\r\u0006\u00128J\u000b\u0007\u0019\u007fV\u001c\u0000\u0010b\u000c\u0019\t\u001a9\u000cASYoTC@\u001f0\u0006AO\u000b6\u0006\u0013O\u0019'\u001a\u001a\u0001\u0018\u007fV\u001c\u0000\u0010b[NYLlZASYnTC\u0001\u001e,\u001aA\u001c\u00133\u000b\r\u0006\u0008:V\u0011\r\u000f/T\u001c\u001a\u001e:\u0019QS\u001e-TC\r\u000ea3\u0010\u001a\\<\u001f\r\u001d\u00191\u001e\u0013\u0016\\7\u000b\t\n\\c\t\u0010\u0003An[I_OoTCJNaVP\u000c\u00133TC\u0001\u001e,\u001aA\u001c\u00133\u000b\r\u0006\u0008:V\u0011\r\u000f/T\u001c\u001a\u001e:\u0019QS\u001e-TC\r\u000ea)\u0010\u0001\u00086\u0004\n\nC"
		// @0AB: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @0AE: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @0B1: putstatic java.lang.String game.C_100010_ff.field_103701_h
		// @0B4: iconst_4
		// @0B5: anewarray java.lang.String
		// @0B8: dup
		// @0B9: iconst_0
		// @0BA: ldc "\u0008%:O(\u0010J+'9\u007f)0!-\n/-*8~"
		// @0BC: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @0BF: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @0C2: aastore
		// @0C3: dup
		// @0C4: iconst_1
		// @0C5: ldc "\u000f80,9\u001a._ 2\u007f30:.\u007f=>6\\\u000b%_ >\u0013#)&3\u0011D"
		// @0C7: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @0CA: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @0CD: aastore
		// @0CE: dup
		// @0CF: iconst_2
		// @0D0: ldc "\u0017+)*\\\u0006%*O2\u0010>7&2\u0018J:#/\u001aU"
		// @0D2: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @0D5: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @0D8: aastore
		// @0D9: dup
		// @0DA: iconst_3
		// @0DB: ldc "\u000b\"6<\\\u0008%-#8\u007f#,O1\u0016$:A"
		// @0DD: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @0E0: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @0E3: aastore
		// @0E4: putstatic java.lang.String[] game.C_100010_ff.field_103700_k
		// @0E7: ldc "\u001a\u0006\u001e\u001f\u000f:\u000e_\u001b\u00152\u000f"
		// @0E9: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @0EC: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @0EF: putstatic java.lang.String game.C_100010_ff.field_103705_u
		// @0F2: iconst_0
		// @0F3: putstatic int game.C_100010_ff.field_103699_j
		// @0F6: ldc "\u0008\u000b\r\u0001\u00151\rEO\u000f:\u0004\u000b\u0006\u0012:\u0006_\u000c\u00132\u0007\u001e\u0001\u0018\u007f\r\n\u0006\u0018:\u0006\u0016\u0001\u0019,J\u001a\u0001\u001f0\u001f\r\u000e\u001b:J\u0006\u0000\t\u007f\u001e\u0010O\u001f0\u0007\u000f\u0003\u0019+\u000f_\u0016\u0013*\u0018_\u001b\u000e>\u0003\u0011\u0006\u00128J\u001d\n\u001a0\u0018\u001aO\u001d+\u001e\u001a\u0002\u000c+\u0003\u0011\u0008\\+\u0005_\u0000\u000c:\u0018\u001e\u001b\u0019\u007f\u001e\u0017\n\\2\u0005\r\n\\,\u0005\u000f\u0007\u0015,\u001e\u0016\u000c\u001d+\u000f\u001bO\u001f7\u000b\u000c\u001c\u0015,D"
		// @0F8: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @0FB: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @0FE: putstatic java.lang.String game.C_100010_ff.field_103710_p
		// @101: iconst_1
		// @102: putstatic boolean game.C_100010_ff.field_103697_l
		// @105: ldc "\u0013\u0005\u001c\u000e\u00086\u0005\u0011"
		// @107: invokestatic game.C_100010_ff.func_103687_z(java.lang.String)char[]
		// @10A: invokestatic game.C_100010_ff.func_103686_z(char[])java.lang.String
		// @10D: putstatic java.lang.String game.C_100010_ff.field_103709_q
		// @110: return
	}
	
	private static char[] func_103687_z(String arg0)
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
		// @0E: bipush 124 (0x7C)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103686_z(char[] arg0)
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
		// @30: bipush 95 (0x5F)
		// @32: goto @46
		// @35: bipush 106 (0x6A)
		// @37: goto @46
		// @3A: bipush 127 (0x7F)
		// @3C: goto @46
		// @3F: bipush 111 (0x6F)
		// @41: goto @46
		// @44: bipush 124 (0x7C)
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
