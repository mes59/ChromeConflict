package game;

final class C_100072_ui
{
	private static int[] field_104398_s;
	private C_100150_bb field_104390_j;
	private C_100150_bb field_104399_r;
	private C_100150_bb field_104396_u;
	private C_100150_bb field_104382_e;
	private C_100150_bb field_104385_a;
	private int field_104392_h;
	private int[] field_104395_v;
	private int[] field_104383_b;
	private C_100150_bb field_104401_p;
	private C_100150_bb field_104397_t;
	private C_100150_bb field_104388_l;
	int field_104386_n;
	private int[] field_104384_c;
	private static int[] field_104394_w;
	private C_100035_gh field_104379_f;
	private C_100150_bb field_104391_k;
	private int field_104393_i;
	private static int[] field_104400_q;
	private static int[] field_104402_y;
	private static int[] field_104389_m;
	private static int[] field_104387_o;
	int field_104381_d;
	private static int[] field_104403_x;
	private static int[] field_104380_g;
	
	final int[] func_104378_a(int arg0, int arg1)
	{
		// @000: getstatic int[] game.C_100072_ui.field_104398_s
		// @003: iconst_0
		// @004: iload_1
		// @005: invokestatic game.C_100120_en.func_104910_a(int[], int, int)void
		// @008: iload_2
		// @009: bipush 10 (0x0A)
		// @00B: if_icmpge @012
		// @00E: getstatic int[] game.C_100072_ui.field_104398_s
		// @011: areturn
		// @012: iload_1
		// @013: i2d
		// @014: iload_2
		// @015: i2d
		// @016: dconst_0
		// @017: dadd
		// @018: ddiv
		// @019: dstore_3
		// @01A: aload_0
		// @01B: getfield game.C_100150_bb game.C_100072_ui.field_104390_j
		// @01E: invokevirtual game.C_100150_bb.func_105160_a()void
		// @021: aload_0
		// @022: getfield game.C_100150_bb game.C_100072_ui.field_104385_a
		// @025: invokevirtual game.C_100150_bb.func_105160_a()void
		// @028: iconst_0
		// @029: istore #5
		// @02B: iconst_0
		// @02C: istore #6
		// @02E: iconst_0
		// @02F: istore #7
		// @031: aload_0
		// @032: getfield game.C_100150_bb game.C_100072_ui.field_104396_u
		// @035: ifnull @070
		// @038: aload_0
		// @039: getfield game.C_100150_bb game.C_100072_ui.field_104396_u
		// @03C: invokevirtual game.C_100150_bb.func_105160_a()void
		// @03F: aload_0
		// @040: getfield game.C_100150_bb game.C_100072_ui.field_104399_r
		// @043: invokevirtual game.C_100150_bb.func_105160_a()void
		// @046: aload_0
		// @047: getfield game.C_100150_bb game.C_100072_ui.field_104396_u
		// @04A: getfield int game.C_100150_bb.field_105167_e
		// @04D: aload_0
		// @04E: getfield game.C_100150_bb game.C_100072_ui.field_104396_u
		// @051: getfield int game.C_100150_bb.field_105171_j
		// @054: isub
		// @055: i2d
		// @056: ldc2_w 32.768
		// @059: dmul
		// @05A: dload_3
		// @05B: ddiv
		// @05C: d2i
		// @05D: istore #5
		// @05F: aload_0
		// @060: getfield game.C_100150_bb game.C_100072_ui.field_104396_u
		// @063: getfield int game.C_100150_bb.field_105171_j
		// @066: i2d
		// @067: ldc2_w 32.768
		// @06A: dmul
		// @06B: dload_3
		// @06C: ddiv
		// @06D: d2i
		// @06E: istore #6
		// @070: iconst_0
		// @071: istore #8
		// @073: iconst_0
		// @074: istore #9
		// @076: iconst_0
		// @077: istore #10
		// @079: aload_0
		// @07A: getfield game.C_100150_bb game.C_100072_ui.field_104397_t
		// @07D: ifnull @0B8
		// @080: aload_0
		// @081: getfield game.C_100150_bb game.C_100072_ui.field_104397_t
		// @084: invokevirtual game.C_100150_bb.func_105160_a()void
		// @087: aload_0
		// @088: getfield game.C_100150_bb game.C_100072_ui.field_104382_e
		// @08B: invokevirtual game.C_100150_bb.func_105160_a()void
		// @08E: aload_0
		// @08F: getfield game.C_100150_bb game.C_100072_ui.field_104397_t
		// @092: getfield int game.C_100150_bb.field_105167_e
		// @095: aload_0
		// @096: getfield game.C_100150_bb game.C_100072_ui.field_104397_t
		// @099: getfield int game.C_100150_bb.field_105171_j
		// @09C: isub
		// @09D: i2d
		// @09E: ldc2_w 32.768
		// @0A1: dmul
		// @0A2: dload_3
		// @0A3: ddiv
		// @0A4: d2i
		// @0A5: istore #8
		// @0A7: aload_0
		// @0A8: getfield game.C_100150_bb game.C_100072_ui.field_104397_t
		// @0AB: getfield int game.C_100150_bb.field_105171_j
		// @0AE: i2d
		// @0AF: ldc2_w 32.768
		// @0B2: dmul
		// @0B3: dload_3
		// @0B4: ddiv
		// @0B5: d2i
		// @0B6: istore #9
		// @0B8: iconst_0
		// @0B9: istore #11
		// @0BB: iload #11
		// @0BD: iconst_5
		// @0BE: if_icmpge @140
		// @0C1: aload_0
		// @0C2: getfield int[] game.C_100072_ui.field_104395_v
		// @0C5: iload #11
		// @0C7: iaload
		// @0C8: ifne @0CE
		// @0CB: goto @13A
		// @0CE: getstatic int[] game.C_100072_ui.field_104380_g
		// @0D1: iload #11
		// @0D3: iconst_0
		// @0D4: iastore
		// @0D5: getstatic int[] game.C_100072_ui.field_104402_y
		// @0D8: iload #11
		// @0DA: aload_0
		// @0DB: getfield int[] game.C_100072_ui.field_104383_b
		// @0DE: iload #11
		// @0E0: iaload
		// @0E1: i2d
		// @0E2: dload_3
		// @0E3: dmul
		// @0E4: d2i
		// @0E5: iastore
		// @0E6: getstatic int[] game.C_100072_ui.field_104387_o
		// @0E9: iload #11
		// @0EB: aload_0
		// @0EC: getfield int[] game.C_100072_ui.field_104395_v
		// @0EF: iload #11
		// @0F1: iaload
		// @0F2: bipush 14 (0x0E)
		// @0F4: ishl
		// @0F5: bipush 100 (0x64)
		// @0F7: idiv
		// @0F8: iastore
		// @0F9: getstatic int[] game.C_100072_ui.field_104403_x
		// @0FC: iload #11
		// @0FE: aload_0
		// @0FF: getfield game.C_100150_bb game.C_100072_ui.field_104390_j
		// @102: getfield int game.C_100150_bb.field_105167_e
		// @105: aload_0
		// @106: getfield game.C_100150_bb game.C_100072_ui.field_104390_j
		// @109: getfield int game.C_100150_bb.field_105171_j
		// @10C: isub
		// @10D: i2d
		// @10E: ldc2_w 32.768
		// @111: dmul
		// @112: ldc2_w 1.0057929410678534
		// @115: aload_0
		// @116: getfield int[] game.C_100072_ui.field_104384_c
		// @119: iload #11
		// @11B: iaload
		// @11C: i2d
		// @11D: invokestatic java.lang.Math.pow(double, double)double
		// @120: dmul
		// @121: dload_3
		// @122: ddiv
		// @123: d2i
		// @124: iastore
		// @125: getstatic int[] game.C_100072_ui.field_104389_m
		// @128: iload #11
		// @12A: aload_0
		// @12B: getfield game.C_100150_bb game.C_100072_ui.field_104390_j
		// @12E: getfield int game.C_100150_bb.field_105171_j
		// @131: i2d
		// @132: ldc2_w 32.768
		// @135: dmul
		// @136: dload_3
		// @137: ddiv
		// @138: d2i
		// @139: iastore
		// @13A: iinc #11 +1
		// @13D: goto @0BB
		// @140: iconst_0
		// @141: istore #11
		// @143: iload #11
		// @145: iload_1
		// @146: if_icmpge @25A
		// @149: aload_0
		// @14A: getfield game.C_100150_bb game.C_100072_ui.field_104390_j
		// @14D: iload_1
		// @14E: invokevirtual game.C_100150_bb.func_105161_a(int)int
		// @151: istore #12
		// @153: aload_0
		// @154: getfield game.C_100150_bb game.C_100072_ui.field_104385_a
		// @157: iload_1
		// @158: invokevirtual game.C_100150_bb.func_105161_a(int)int
		// @15B: istore #13
		// @15D: aload_0
		// @15E: getfield game.C_100150_bb game.C_100072_ui.field_104396_u
		// @161: ifnull @19E
		// @164: aload_0
		// @165: getfield game.C_100150_bb game.C_100072_ui.field_104396_u
		// @168: iload_1
		// @169: invokevirtual game.C_100150_bb.func_105161_a(int)int
		// @16C: istore #14
		// @16E: aload_0
		// @16F: getfield game.C_100150_bb game.C_100072_ui.field_104399_r
		// @172: iload_1
		// @173: invokevirtual game.C_100150_bb.func_105161_a(int)int
		// @176: istore #15
		// @178: iload #12
		// @17A: aload_0
		// @17B: iload #7
		// @17D: iload #15
		// @17F: aload_0
		// @180: getfield game.C_100150_bb game.C_100072_ui.field_104396_u
		// @183: getfield int game.C_100150_bb.field_105169_c
		// @186: invokespecial game.C_100072_ui.func_104375_a(int, int, int)int
		// @189: iconst_1
		// @18A: ishr
		// @18B: iadd
		// @18C: istore #12
		// @18E: iload #7
		// @190: iload #14
		// @192: iload #5
		// @194: imul
		// @195: bipush 16 (0x10)
		// @197: ishr
		// @198: iload #6
		// @19A: iadd
		// @19B: iadd
		// @19C: istore #7
		// @19E: aload_0
		// @19F: getfield game.C_100150_bb game.C_100072_ui.field_104397_t
		// @1A2: ifnull @1E5
		// @1A5: aload_0
		// @1A6: getfield game.C_100150_bb game.C_100072_ui.field_104397_t
		// @1A9: iload_1
		// @1AA: invokevirtual game.C_100150_bb.func_105161_a(int)int
		// @1AD: istore #14
		// @1AF: aload_0
		// @1B0: getfield game.C_100150_bb game.C_100072_ui.field_104382_e
		// @1B3: iload_1
		// @1B4: invokevirtual game.C_100150_bb.func_105161_a(int)int
		// @1B7: istore #15
		// @1B9: iload #13
		// @1BB: aload_0
		// @1BC: iload #10
		// @1BE: iload #15
		// @1C0: aload_0
		// @1C1: getfield game.C_100150_bb game.C_100072_ui.field_104397_t
		// @1C4: getfield int game.C_100150_bb.field_105169_c
		// @1C7: invokespecial game.C_100072_ui.func_104375_a(int, int, int)int
		// @1CA: iconst_1
		// @1CB: ishr
		// @1CC: ldc 32768 (0x8000)
		// @1CE: iadd
		// @1CF: imul
		// @1D0: bipush 15 (0x0F)
		// @1D2: ishr
		// @1D3: istore #13
		// @1D5: iload #10
		// @1D7: iload #14
		// @1D9: iload #8
		// @1DB: imul
		// @1DC: bipush 16 (0x10)
		// @1DE: ishr
		// @1DF: iload #9
		// @1E1: iadd
		// @1E2: iadd
		// @1E3: istore #10
		// @1E5: iconst_0
		// @1E6: istore #14
		// @1E8: iload #14
		// @1EA: iconst_5
		// @1EB: if_icmpge @254
		// @1EE: aload_0
		// @1EF: getfield int[] game.C_100072_ui.field_104395_v
		// @1F2: iload #14
		// @1F4: iaload
		// @1F5: ifne @1FB
		// @1F8: goto @24E
		// @1FB: iload #11
		// @1FD: getstatic int[] game.C_100072_ui.field_104402_y
		// @200: iload #14
		// @202: iaload
		// @203: iadd
		// @204: istore #15
		// @206: iload #15
		// @208: iload_1
		// @209: if_icmpge @24E
		// @20C: getstatic int[] game.C_100072_ui.field_104398_s
		// @20F: iload #15
		// @211: dup2
		// @212: iaload
		// @213: aload_0
		// @214: getstatic int[] game.C_100072_ui.field_104380_g
		// @217: iload #14
		// @219: iaload
		// @21A: iload #13
		// @21C: getstatic int[] game.C_100072_ui.field_104387_o
		// @21F: iload #14
		// @221: iaload
		// @222: imul
		// @223: bipush 15 (0x0F)
		// @225: ishr
		// @226: aload_0
		// @227: getfield game.C_100150_bb game.C_100072_ui.field_104390_j
		// @22A: getfield int game.C_100150_bb.field_105169_c
		// @22D: invokespecial game.C_100072_ui.func_104375_a(int, int, int)int
		// @230: iadd
		// @231: iastore
		// @232: getstatic int[] game.C_100072_ui.field_104380_g
		// @235: iload #14
		// @237: dup2
		// @238: iaload
		// @239: iload #12
		// @23B: getstatic int[] game.C_100072_ui.field_104403_x
		// @23E: iload #14
		// @240: iaload
		// @241: imul
		// @242: bipush 16 (0x10)
		// @244: ishr
		// @245: getstatic int[] game.C_100072_ui.field_104389_m
		// @248: iload #14
		// @24A: iaload
		// @24B: iadd
		// @24C: iadd
		// @24D: iastore
		// @24E: iinc #14 +1
		// @251: goto @1E8
		// @254: iinc #11 +1
		// @257: goto @143
		// @25A: aload_0
		// @25B: getfield game.C_100150_bb game.C_100072_ui.field_104391_k
		// @25E: ifnull @309
		// @261: aload_0
		// @262: getfield game.C_100150_bb game.C_100072_ui.field_104391_k
		// @265: invokevirtual game.C_100150_bb.func_105160_a()void
		// @268: aload_0
		// @269: getfield game.C_100150_bb game.C_100072_ui.field_104388_l
		// @26C: invokevirtual game.C_100150_bb.func_105160_a()void
		// @26F: iconst_0
		// @270: istore #11
		// @272: iconst_0
		// @273: istore #12
		// @275: iconst_1
		// @276: istore #13
		// @278: iconst_0
		// @279: istore #14
		// @27B: iload #14
		// @27D: iload_1
		// @27E: if_icmpge @309
		// @281: aload_0
		// @282: getfield game.C_100150_bb game.C_100072_ui.field_104391_k
		// @285: iload_1
		// @286: invokevirtual game.C_100150_bb.func_105161_a(int)int
		// @289: istore #15
		// @28B: aload_0
		// @28C: getfield game.C_100150_bb game.C_100072_ui.field_104388_l
		// @28F: iload_1
		// @290: invokevirtual game.C_100150_bb.func_105161_a(int)int
		// @293: istore #16
		// @295: iload #13
		// @297: ifeq @2BC
		// @29A: aload_0
		// @29B: getfield game.C_100150_bb game.C_100072_ui.field_104391_k
		// @29E: getfield int game.C_100150_bb.field_105171_j
		// @2A1: aload_0
		// @2A2: getfield game.C_100150_bb game.C_100072_ui.field_104391_k
		// @2A5: getfield int game.C_100150_bb.field_105167_e
		// @2A8: aload_0
		// @2A9: getfield game.C_100150_bb game.C_100072_ui.field_104391_k
		// @2AC: getfield int game.C_100150_bb.field_105171_j
		// @2AF: isub
		// @2B0: iload #15
		// @2B2: imul
		// @2B3: bipush 8 (0x08)
		// @2B5: ishr
		// @2B6: iadd
		// @2B7: istore #12
		// @2B9: goto @2DB
		// @2BC: aload_0
		// @2BD: getfield game.C_100150_bb game.C_100072_ui.field_104391_k
		// @2C0: getfield int game.C_100150_bb.field_105171_j
		// @2C3: aload_0
		// @2C4: getfield game.C_100150_bb game.C_100072_ui.field_104391_k
		// @2C7: getfield int game.C_100150_bb.field_105167_e
		// @2CA: aload_0
		// @2CB: getfield game.C_100150_bb game.C_100072_ui.field_104391_k
		// @2CE: getfield int game.C_100150_bb.field_105171_j
		// @2D1: isub
		// @2D2: iload #16
		// @2D4: imul
		// @2D5: bipush 8 (0x08)
		// @2D7: ishr
		// @2D8: iadd
		// @2D9: istore #12
		// @2DB: wide (iinc) #11 +256
		// @2E1: iload #11
		// @2E3: iload #12
		// @2E5: if_icmplt @2F7
		// @2E8: iconst_0
		// @2E9: istore #11
		// @2EB: iload #13
		// @2ED: ifne @2F4
		// @2F0: iconst_1
		// @2F1: goto @2F5
		// @2F4: iconst_0
		// @2F5: istore #13
		// @2F7: iload #13
		// @2F9: ifeq @303
		// @2FC: getstatic int[] game.C_100072_ui.field_104398_s
		// @2FF: iload #14
		// @301: iconst_0
		// @302: iastore
		// @303: iinc #14 +1
		// @306: goto @27B
		// @309: aload_0
		// @30A: getfield int game.C_100072_ui.field_104393_i
		// @30D: ifle @34B
		// @310: aload_0
		// @311: getfield int game.C_100072_ui.field_104392_h
		// @314: ifle @34B
		// @317: aload_0
		// @318: getfield int game.C_100072_ui.field_104393_i
		// @31B: i2d
		// @31C: dload_3
		// @31D: dmul
		// @31E: d2i
		// @31F: istore #11
		// @321: iload #11
		// @323: istore #12
		// @325: iload #12
		// @327: iload_1
		// @328: if_icmpge @34B
		// @32B: getstatic int[] game.C_100072_ui.field_104398_s
		// @32E: iload #12
		// @330: dup2
		// @331: iaload
		// @332: getstatic int[] game.C_100072_ui.field_104398_s
		// @335: iload #12
		// @337: iload #11
		// @339: isub
		// @33A: iaload
		// @33B: aload_0
		// @33C: getfield int game.C_100072_ui.field_104392_h
		// @33F: imul
		// @340: bipush 100 (0x64)
		// @342: idiv
		// @343: iadd
		// @344: iastore
		// @345: iinc #12 +1
		// @348: goto @325
		// @34B: aload_0
		// @34C: getfield game.C_100035_gh game.C_100072_ui.field_104379_f
		// @34F: getfield int[] game.C_100035_gh.field_104047_f
		// @352: iconst_0
		// @353: iaload
		// @354: ifgt @363
		// @357: aload_0
		// @358: getfield game.C_100035_gh game.C_100072_ui.field_104379_f
		// @35B: getfield int[] game.C_100035_gh.field_104047_f
		// @35E: iconst_1
		// @35F: iaload
		// @360: ifle @5B6
		// @363: aload_0
		// @364: getfield game.C_100150_bb game.C_100072_ui.field_104401_p
		// @367: invokevirtual game.C_100150_bb.func_105160_a()void
		// @36A: aload_0
		// @36B: getfield game.C_100150_bb game.C_100072_ui.field_104401_p
		// @36E: iload_1
		// @36F: iconst_1
		// @370: iadd
		// @371: invokevirtual game.C_100150_bb.func_105161_a(int)int
		// @374: istore #11
		// @376: aload_0
		// @377: getfield game.C_100035_gh game.C_100072_ui.field_104379_f
		// @37A: iconst_0
		// @37B: iload #11
		// @37D: i2f
		// @37E: ldc 65536.0
		// @380: fdiv
		// @381: invokevirtual game.C_100035_gh.func_104045_a(int, float)int
		// @384: istore #12
		// @386: aload_0
		// @387: getfield game.C_100035_gh game.C_100072_ui.field_104379_f
		// @38A: iconst_1
		// @38B: iload #11
		// @38D: i2f
		// @38E: ldc 65536.0
		// @390: fdiv
		// @391: invokevirtual game.C_100035_gh.func_104045_a(int, float)int
		// @394: istore #13
		// @396: iload_1
		// @397: iload #12
		// @399: iload #13
		// @39B: iadd
		// @39C: if_icmplt @5B6
		// @39F: iconst_0
		// @3A0: istore #14
		// @3A2: iload #13
		// @3A4: istore #15
		// @3A6: iload #15
		// @3A8: iload_1
		// @3A9: iload #12
		// @3AB: isub
		// @3AC: if_icmple @3B5
		// @3AF: iload_1
		// @3B0: iload #12
		// @3B2: isub
		// @3B3: istore #15
		// @3B5: iload #14
		// @3B7: iload #15
		// @3B9: if_icmpge @44C
		// @3BC: getstatic int[] game.C_100072_ui.field_104398_s
		// @3BF: iload #14
		// @3C1: iload #12
		// @3C3: iadd
		// @3C4: iaload
		// @3C5: i2l
		// @3C6: getstatic int game.C_100035_gh.field_104049_d
		// @3C9: i2l
		// @3CA: lmul
		// @3CB: bipush 16 (0x10)
		// @3CD: lshr
		// @3CE: l2i
		// @3CF: istore #16
		// @3D1: iconst_0
		// @3D2: istore #17
		// @3D4: iload #17
		// @3D6: iload #12
		// @3D8: if_icmpge @403
		// @3DB: iload #16
		// @3DD: getstatic int[] game.C_100072_ui.field_104398_s
		// @3E0: iload #14
		// @3E2: iload #12
		// @3E4: iadd
		// @3E5: iconst_1
		// @3E6: isub
		// @3E7: iload #17
		// @3E9: isub
		// @3EA: iaload
		// @3EB: i2l
		// @3EC: getstatic int[][] game.C_100035_gh.field_104051_b
		// @3EF: iconst_0
		// @3F0: aaload
		// @3F1: iload #17
		// @3F3: iaload
		// @3F4: i2l
		// @3F5: lmul
		// @3F6: bipush 16 (0x10)
		// @3F8: lshr
		// @3F9: l2i
		// @3FA: iadd
		// @3FB: istore #16
		// @3FD: iinc #17 +1
		// @400: goto @3D4
		// @403: iconst_0
		// @404: istore #17
		// @406: iload #17
		// @408: iload #14
		// @40A: if_icmpge @432
		// @40D: iload #16
		// @40F: getstatic int[] game.C_100072_ui.field_104398_s
		// @412: iload #14
		// @414: iconst_1
		// @415: isub
		// @416: iload #17
		// @418: isub
		// @419: iaload
		// @41A: i2l
		// @41B: getstatic int[][] game.C_100035_gh.field_104051_b
		// @41E: iconst_1
		// @41F: aaload
		// @420: iload #17
		// @422: iaload
		// @423: i2l
		// @424: lmul
		// @425: bipush 16 (0x10)
		// @427: lshr
		// @428: l2i
		// @429: isub
		// @42A: istore #16
		// @42C: iinc #17 +1
		// @42F: goto @406
		// @432: getstatic int[] game.C_100072_ui.field_104398_s
		// @435: iload #14
		// @437: iload #16
		// @439: iastore
		// @43A: aload_0
		// @43B: getfield game.C_100150_bb game.C_100072_ui.field_104401_p
		// @43E: iload_1
		// @43F: iconst_1
		// @440: iadd
		// @441: invokevirtual game.C_100150_bb.func_105161_a(int)int
		// @444: istore #11
		// @446: iinc #14 +1
		// @449: goto @3B5
		// @44C: sipush 128 (0x0080)
		// @44F: istore #15
		// @451: iload #15
		// @453: iload_1
		// @454: iload #12
		// @456: isub
		// @457: if_icmple @460
		// @45A: iload_1
		// @45B: iload #12
		// @45D: isub
		// @45E: istore #15
		// @460: iload #14
		// @462: iload #15
		// @464: if_icmpge @4F7
		// @467: getstatic int[] game.C_100072_ui.field_104398_s
		// @46A: iload #14
		// @46C: iload #12
		// @46E: iadd
		// @46F: iaload
		// @470: i2l
		// @471: getstatic int game.C_100035_gh.field_104049_d
		// @474: i2l
		// @475: lmul
		// @476: bipush 16 (0x10)
		// @478: lshr
		// @479: l2i
		// @47A: istore #16
		// @47C: iconst_0
		// @47D: istore #17
		// @47F: iload #17
		// @481: iload #12
		// @483: if_icmpge @4AE
		// @486: iload #16
		// @488: getstatic int[] game.C_100072_ui.field_104398_s
		// @48B: iload #14
		// @48D: iload #12
		// @48F: iadd
		// @490: iconst_1
		// @491: isub
		// @492: iload #17
		// @494: isub
		// @495: iaload
		// @496: i2l
		// @497: getstatic int[][] game.C_100035_gh.field_104051_b
		// @49A: iconst_0
		// @49B: aaload
		// @49C: iload #17
		// @49E: iaload
		// @49F: i2l
		// @4A0: lmul
		// @4A1: bipush 16 (0x10)
		// @4A3: lshr
		// @4A4: l2i
		// @4A5: iadd
		// @4A6: istore #16
		// @4A8: iinc #17 +1
		// @4AB: goto @47F
		// @4AE: iconst_0
		// @4AF: istore #17
		// @4B1: iload #17
		// @4B3: iload #13
		// @4B5: if_icmpge @4DD
		// @4B8: iload #16
		// @4BA: getstatic int[] game.C_100072_ui.field_104398_s
		// @4BD: iload #14
		// @4BF: iconst_1
		// @4C0: isub
		// @4C1: iload #17
		// @4C3: isub
		// @4C4: iaload
		// @4C5: i2l
		// @4C6: getstatic int[][] game.C_100035_gh.field_104051_b
		// @4C9: iconst_1
		// @4CA: aaload
		// @4CB: iload #17
		// @4CD: iaload
		// @4CE: i2l
		// @4CF: lmul
		// @4D0: bipush 16 (0x10)
		// @4D2: lshr
		// @4D3: l2i
		// @4D4: isub
		// @4D5: istore #16
		// @4D7: iinc #17 +1
		// @4DA: goto @4B1
		// @4DD: getstatic int[] game.C_100072_ui.field_104398_s
		// @4E0: iload #14
		// @4E2: iload #16
		// @4E4: iastore
		// @4E5: aload_0
		// @4E6: getfield game.C_100150_bb game.C_100072_ui.field_104401_p
		// @4E9: iload_1
		// @4EA: iconst_1
		// @4EB: iadd
		// @4EC: invokevirtual game.C_100150_bb.func_105161_a(int)int
		// @4EF: istore #11
		// @4F1: iinc #14 +1
		// @4F4: goto @460
		// @4F7: iload #14
		// @4F9: iload_1
		// @4FA: iload #12
		// @4FC: isub
		// @4FD: if_icmplt @503
		// @500: goto @52C
		// @503: aload_0
		// @504: getfield game.C_100035_gh game.C_100072_ui.field_104379_f
		// @507: iconst_0
		// @508: iload #11
		// @50A: i2f
		// @50B: ldc 65536.0
		// @50D: fdiv
		// @50E: invokevirtual game.C_100035_gh.func_104045_a(int, float)int
		// @511: istore #12
		// @513: aload_0
		// @514: getfield game.C_100035_gh game.C_100072_ui.field_104379_f
		// @517: iconst_1
		// @518: iload #11
		// @51A: i2f
		// @51B: ldc 65536.0
		// @51D: fdiv
		// @51E: invokevirtual game.C_100035_gh.func_104045_a(int, float)int
		// @521: istore #13
		// @523: wide (iinc) #15 +128
		// @529: goto @451
		// @52C: iload #14
		// @52E: iload_1
		// @52F: if_icmpge @5B6
		// @532: iconst_0
		// @533: istore #16
		// @535: iload #14
		// @537: iload #12
		// @539: iadd
		// @53A: iload_1
		// @53B: isub
		// @53C: istore #17
		// @53E: iload #17
		// @540: iload #12
		// @542: if_icmpge @56D
		// @545: iload #16
		// @547: getstatic int[] game.C_100072_ui.field_104398_s
		// @54A: iload #14
		// @54C: iload #12
		// @54E: iadd
		// @54F: iconst_1
		// @550: isub
		// @551: iload #17
		// @553: isub
		// @554: iaload
		// @555: i2l
		// @556: getstatic int[][] game.C_100035_gh.field_104051_b
		// @559: iconst_0
		// @55A: aaload
		// @55B: iload #17
		// @55D: iaload
		// @55E: i2l
		// @55F: lmul
		// @560: bipush 16 (0x10)
		// @562: lshr
		// @563: l2i
		// @564: iadd
		// @565: istore #16
		// @567: iinc #17 +1
		// @56A: goto @53E
		// @56D: iconst_0
		// @56E: istore #17
		// @570: iload #17
		// @572: iload #13
		// @574: if_icmpge @59C
		// @577: iload #16
		// @579: getstatic int[] game.C_100072_ui.field_104398_s
		// @57C: iload #14
		// @57E: iconst_1
		// @57F: isub
		// @580: iload #17
		// @582: isub
		// @583: iaload
		// @584: i2l
		// @585: getstatic int[][] game.C_100035_gh.field_104051_b
		// @588: iconst_1
		// @589: aaload
		// @58A: iload #17
		// @58C: iaload
		// @58D: i2l
		// @58E: lmul
		// @58F: bipush 16 (0x10)
		// @591: lshr
		// @592: l2i
		// @593: isub
		// @594: istore #16
		// @596: iinc #17 +1
		// @599: goto @570
		// @59C: getstatic int[] game.C_100072_ui.field_104398_s
		// @59F: iload #14
		// @5A1: iload #16
		// @5A3: iastore
		// @5A4: aload_0
		// @5A5: getfield game.C_100150_bb game.C_100072_ui.field_104401_p
		// @5A8: iload_1
		// @5A9: iconst_1
		// @5AA: iadd
		// @5AB: invokevirtual game.C_100150_bb.func_105161_a(int)int
		// @5AE: istore #11
		// @5B0: iinc #14 +1
		// @5B3: goto @52C
		// @5B6: iconst_0
		// @5B7: istore #11
		// @5B9: iload #11
		// @5BB: iload_1
		// @5BC: if_icmpge @5EF
		// @5BF: getstatic int[] game.C_100072_ui.field_104398_s
		// @5C2: iload #11
		// @5C4: iaload
		// @5C5: sipush -32768 (0x8000)
		// @5C8: if_icmpge @5D4
		// @5CB: getstatic int[] game.C_100072_ui.field_104398_s
		// @5CE: iload #11
		// @5D0: sipush -32768 (0x8000)
		// @5D3: iastore
		// @5D4: getstatic int[] game.C_100072_ui.field_104398_s
		// @5D7: iload #11
		// @5D9: iaload
		// @5DA: sipush 32767 (0x7FFF)
		// @5DD: if_icmple @5E9
		// @5E0: getstatic int[] game.C_100072_ui.field_104398_s
		// @5E3: iload #11
		// @5E5: sipush 32767 (0x7FFF)
		// @5E8: iastore
		// @5E9: iinc #11 +1
		// @5EC: goto @5B9
		// @5EF: getstatic int[] game.C_100072_ui.field_104398_s
		// @5F2: areturn
	}
	
	final void func_104377_a(C_100280_nf arg0)
	{
		// @000: aload_0
		// @001: new game.C_100150_bb
		// @004: dup
		// @005: invokespecial game.C_100150_bb.<init>()void
		// @008: putfield game.C_100150_bb game.C_100072_ui.field_104390_j
		// @00B: aload_0
		// @00C: getfield game.C_100150_bb game.C_100072_ui.field_104390_j
		// @00F: aload_1
		// @010: invokevirtual game.C_100150_bb.func_105162_b(game.C_100280_nf)void
		// @013: aload_0
		// @014: new game.C_100150_bb
		// @017: dup
		// @018: invokespecial game.C_100150_bb.<init>()void
		// @01B: putfield game.C_100150_bb game.C_100072_ui.field_104385_a
		// @01E: aload_0
		// @01F: getfield game.C_100150_bb game.C_100072_ui.field_104385_a
		// @022: aload_1
		// @023: invokevirtual game.C_100150_bb.func_105162_b(game.C_100280_nf)void
		// @026: aload_1
		// @027: iconst_0
		// @028: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @02B: istore_2
		// @02C: iload_2
		// @02D: ifeq @060
		// @030: aload_1
		// @031: dup
		// @032: getfield int game.C_100280_nf.field_101177_n
		// @035: iconst_1
		// @036: isub
		// @037: putfield int game.C_100280_nf.field_101177_n
		// @03A: aload_0
		// @03B: new game.C_100150_bb
		// @03E: dup
		// @03F: invokespecial game.C_100150_bb.<init>()void
		// @042: putfield game.C_100150_bb game.C_100072_ui.field_104396_u
		// @045: aload_0
		// @046: getfield game.C_100150_bb game.C_100072_ui.field_104396_u
		// @049: aload_1
		// @04A: invokevirtual game.C_100150_bb.func_105162_b(game.C_100280_nf)void
		// @04D: aload_0
		// @04E: new game.C_100150_bb
		// @051: dup
		// @052: invokespecial game.C_100150_bb.<init>()void
		// @055: putfield game.C_100150_bb game.C_100072_ui.field_104399_r
		// @058: aload_0
		// @059: getfield game.C_100150_bb game.C_100072_ui.field_104399_r
		// @05C: aload_1
		// @05D: invokevirtual game.C_100150_bb.func_105162_b(game.C_100280_nf)void
		// @060: aload_1
		// @061: iconst_0
		// @062: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @065: istore_2
		// @066: iload_2
		// @067: ifeq @09A
		// @06A: aload_1
		// @06B: dup
		// @06C: getfield int game.C_100280_nf.field_101177_n
		// @06F: iconst_1
		// @070: isub
		// @071: putfield int game.C_100280_nf.field_101177_n
		// @074: aload_0
		// @075: new game.C_100150_bb
		// @078: dup
		// @079: invokespecial game.C_100150_bb.<init>()void
		// @07C: putfield game.C_100150_bb game.C_100072_ui.field_104397_t
		// @07F: aload_0
		// @080: getfield game.C_100150_bb game.C_100072_ui.field_104397_t
		// @083: aload_1
		// @084: invokevirtual game.C_100150_bb.func_105162_b(game.C_100280_nf)void
		// @087: aload_0
		// @088: new game.C_100150_bb
		// @08B: dup
		// @08C: invokespecial game.C_100150_bb.<init>()void
		// @08F: putfield game.C_100150_bb game.C_100072_ui.field_104382_e
		// @092: aload_0
		// @093: getfield game.C_100150_bb game.C_100072_ui.field_104382_e
		// @096: aload_1
		// @097: invokevirtual game.C_100150_bb.func_105162_b(game.C_100280_nf)void
		// @09A: aload_1
		// @09B: iconst_0
		// @09C: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @09F: istore_2
		// @0A0: iload_2
		// @0A1: ifeq @0D4
		// @0A4: aload_1
		// @0A5: dup
		// @0A6: getfield int game.C_100280_nf.field_101177_n
		// @0A9: iconst_1
		// @0AA: isub
		// @0AB: putfield int game.C_100280_nf.field_101177_n
		// @0AE: aload_0
		// @0AF: new game.C_100150_bb
		// @0B2: dup
		// @0B3: invokespecial game.C_100150_bb.<init>()void
		// @0B6: putfield game.C_100150_bb game.C_100072_ui.field_104391_k
		// @0B9: aload_0
		// @0BA: getfield game.C_100150_bb game.C_100072_ui.field_104391_k
		// @0BD: aload_1
		// @0BE: invokevirtual game.C_100150_bb.func_105162_b(game.C_100280_nf)void
		// @0C1: aload_0
		// @0C2: new game.C_100150_bb
		// @0C5: dup
		// @0C6: invokespecial game.C_100150_bb.<init>()void
		// @0C9: putfield game.C_100150_bb game.C_100072_ui.field_104388_l
		// @0CC: aload_0
		// @0CD: getfield game.C_100150_bb game.C_100072_ui.field_104388_l
		// @0D0: aload_1
		// @0D1: invokevirtual game.C_100150_bb.func_105162_b(game.C_100280_nf)void
		// @0D4: iconst_0
		// @0D5: istore_3
		// @0D6: iload_3
		// @0D7: bipush 10 (0x0A)
		// @0D9: if_icmpge @110
		// @0DC: aload_1
		// @0DD: iconst_0
		// @0DE: invokevirtual game.C_100280_nf.func_101135_b(boolean)int
		// @0E1: istore #4
		// @0E3: iload #4
		// @0E5: ifne @0EB
		// @0E8: goto @110
		// @0EB: aload_0
		// @0EC: getfield int[] game.C_100072_ui.field_104395_v
		// @0EF: iload_3
		// @0F0: iload #4
		// @0F2: iastore
		// @0F3: aload_0
		// @0F4: getfield int[] game.C_100072_ui.field_104384_c
		// @0F7: iload_3
		// @0F8: aload_1
		// @0F9: bipush 39 (0x27)
		// @0FB: invokevirtual game.C_100280_nf.func_101138_a(byte)int
		// @0FE: iastore
		// @0FF: aload_0
		// @100: getfield int[] game.C_100072_ui.field_104383_b
		// @103: iload_3
		// @104: aload_1
		// @105: iconst_0
		// @106: invokevirtual game.C_100280_nf.func_101135_b(boolean)int
		// @109: iastore
		// @10A: iinc #3 +1
		// @10D: goto @0D6
		// @110: aload_0
		// @111: aload_1
		// @112: iconst_0
		// @113: invokevirtual game.C_100280_nf.func_101135_b(boolean)int
		// @116: putfield int game.C_100072_ui.field_104393_i
		// @119: aload_0
		// @11A: aload_1
		// @11B: iconst_0
		// @11C: invokevirtual game.C_100280_nf.func_101135_b(boolean)int
		// @11F: putfield int game.C_100072_ui.field_104392_h
		// @122: aload_0
		// @123: aload_1
		// @124: bipush -2 (0xFE)
		// @126: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @129: putfield int game.C_100072_ui.field_104386_n
		// @12C: aload_0
		// @12D: aload_1
		// @12E: bipush -2 (0xFE)
		// @130: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @133: putfield int game.C_100072_ui.field_104381_d
		// @136: aload_0
		// @137: new game.C_100035_gh
		// @13A: dup
		// @13B: invokespecial game.C_100035_gh.<init>()void
		// @13E: putfield game.C_100035_gh game.C_100072_ui.field_104379_f
		// @141: aload_0
		// @142: new game.C_100150_bb
		// @145: dup
		// @146: invokespecial game.C_100150_bb.<init>()void
		// @149: putfield game.C_100150_bb game.C_100072_ui.field_104401_p
		// @14C: aload_0
		// @14D: getfield game.C_100035_gh game.C_100072_ui.field_104379_f
		// @150: aload_1
		// @151: aload_0
		// @152: getfield game.C_100150_bb game.C_100072_ui.field_104401_p
		// @155: invokevirtual game.C_100035_gh.func_104041_a(game.C_100280_nf, game.C_100150_bb)void
		// @158: return
	}
	
	public static void func_104376_a()
	{
		// @00: aconst_null
		// @01: putstatic int[] game.C_100072_ui.field_104398_s
		// @04: aconst_null
		// @05: putstatic int[] game.C_100072_ui.field_104394_w
		// @08: aconst_null
		// @09: putstatic int[] game.C_100072_ui.field_104400_q
		// @0C: aconst_null
		// @0D: putstatic int[] game.C_100072_ui.field_104380_g
		// @10: aconst_null
		// @11: putstatic int[] game.C_100072_ui.field_104402_y
		// @14: aconst_null
		// @15: putstatic int[] game.C_100072_ui.field_104387_o
		// @18: aconst_null
		// @19: putstatic int[] game.C_100072_ui.field_104403_x
		// @1C: aconst_null
		// @1D: putstatic int[] game.C_100072_ui.field_104389_m
		// @20: return
	}
	
	private final int func_104375_a(int arg0, int arg1, int arg2)
	{
		// @00: iload_3
		// @01: iconst_1
		// @02: if_icmpne @15
		// @05: iload_1
		// @06: sipush 32767 (0x7FFF)
		// @09: iand
		// @0A: sipush 16384 (0x4000)
		// @0D: if_icmpge @12
		// @10: iload_2
		// @11: ireturn
		// @12: iload_2
		// @13: ineg
		// @14: ireturn
		// @15: iload_3
		// @16: iconst_2
		// @17: if_icmpne @29
		// @1A: getstatic int[] game.C_100072_ui.field_104400_q
		// @1D: iload_1
		// @1E: sipush 32767 (0x7FFF)
		// @21: iand
		// @22: iaload
		// @23: iload_2
		// @24: imul
		// @25: bipush 14 (0x0E)
		// @27: ishr
		// @28: ireturn
		// @29: iload_3
		// @2A: iconst_3
		// @2B: if_icmpne @3B
		// @2E: iload_1
		// @2F: sipush 32767 (0x7FFF)
		// @32: iand
		// @33: iload_2
		// @34: imul
		// @35: bipush 14 (0x0E)
		// @37: ishr
		// @38: iload_2
		// @39: isub
		// @3A: ireturn
		// @3B: iload_3
		// @3C: iconst_4
		// @3D: if_icmpne @50
		// @40: getstatic int[] game.C_100072_ui.field_104394_w
		// @43: iload_1
		// @44: sipush 2607 (0x0A2F)
		// @47: idiv
		// @48: sipush 32767 (0x7FFF)
		// @4B: iand
		// @4C: iaload
		// @4D: iload_2
		// @4E: imul
		// @4F: ireturn
		// @50: iconst_0
		// @51: ireturn
	}
	
	C_100072_ui()
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: bipush 100 (0x64)
		// @07: putfield int game.C_100072_ui.field_104392_h
		// @0A: aload_0
		// @0B: iconst_5
		// @0C: newarray int[]
		// @0E: dup
		// @0F: iconst_0
		// @10: iconst_0
		// @11: iastore
		// @12: dup
		// @13: iconst_1
		// @14: iconst_0
		// @15: iastore
		// @16: dup
		// @17: iconst_2
		// @18: iconst_0
		// @19: iastore
		// @1A: dup
		// @1B: iconst_3
		// @1C: iconst_0
		// @1D: iastore
		// @1E: dup
		// @1F: iconst_4
		// @20: iconst_0
		// @21: iastore
		// @22: putfield int[] game.C_100072_ui.field_104384_c
		// @25: aload_0
		// @26: sipush 500 (0x01F4)
		// @29: putfield int game.C_100072_ui.field_104386_n
		// @2C: aload_0
		// @2D: iconst_0
		// @2E: putfield int game.C_100072_ui.field_104393_i
		// @31: aload_0
		// @32: iconst_5
		// @33: newarray int[]
		// @35: dup
		// @36: iconst_0
		// @37: iconst_0
		// @38: iastore
		// @39: dup
		// @3A: iconst_1
		// @3B: iconst_0
		// @3C: iastore
		// @3D: dup
		// @3E: iconst_2
		// @3F: iconst_0
		// @40: iastore
		// @41: dup
		// @42: iconst_3
		// @43: iconst_0
		// @44: iastore
		// @45: dup
		// @46: iconst_4
		// @47: iconst_0
		// @48: iastore
		// @49: putfield int[] game.C_100072_ui.field_104383_b
		// @4C: aload_0
		// @4D: iconst_5
		// @4E: newarray int[]
		// @50: dup
		// @51: iconst_0
		// @52: iconst_0
		// @53: iastore
		// @54: dup
		// @55: iconst_1
		// @56: iconst_0
		// @57: iastore
		// @58: dup
		// @59: iconst_2
		// @5A: iconst_0
		// @5B: iastore
		// @5C: dup
		// @5D: iconst_3
		// @5E: iconst_0
		// @5F: iastore
		// @60: dup
		// @61: iconst_4
		// @62: iconst_0
		// @63: iastore
		// @64: putfield int[] game.C_100072_ui.field_104395_v
		// @67: aload_0
		// @68: iconst_0
		// @69: putfield int game.C_100072_ui.field_104381_d
		// @6C: return
	}
	
	static
	{
		// @00: ldc 32768 (0x8000)
		// @02: newarray int[]
		// @04: putstatic int[] game.C_100072_ui.field_104394_w
		// @07: new java.util.Random
		// @0A: dup
		// @0B: lconst_0
		// @0C: invokespecial java.util.Random.<init>(long)void
		// @0F: astore_0
		// @10: iconst_0
		// @11: istore_1
		// @12: iload_1
		// @13: ldc 32768 (0x8000)
		// @15: if_icmpge @2B
		// @18: getstatic int[] game.C_100072_ui.field_104394_w
		// @1B: iload_1
		// @1C: aload_0
		// @1D: invokevirtual java.util.Random.nextInt()int
		// @20: iconst_2
		// @21: iand
		// @22: iconst_1
		// @23: isub
		// @24: iastore
		// @25: iinc #1 +1
		// @28: goto @12
		// @2B: ldc 32768 (0x8000)
		// @2D: newarray int[]
		// @2F: putstatic int[] game.C_100072_ui.field_104400_q
		// @32: iconst_0
		// @33: istore_1
		// @34: iload_1
		// @35: ldc 32768 (0x8000)
		// @37: if_icmpge @53
		// @3A: getstatic int[] game.C_100072_ui.field_104400_q
		// @3D: iload_1
		// @3E: iload_1
		// @3F: i2d
		// @40: ldc2_w 5215.1903
		// @43: ddiv
		// @44: invokestatic java.lang.Math.sin(double)double
		// @47: ldc2_w 16384.0
		// @4A: dmul
		// @4B: d2i
		// @4C: iastore
		// @4D: iinc #1 +1
		// @50: goto @34
		// @53: ldc 220500 (0x35d54)
		// @55: newarray int[]
		// @57: putstatic int[] game.C_100072_ui.field_104398_s
		// @5A: iconst_5
		// @5B: newarray int[]
		// @5D: putstatic int[] game.C_100072_ui.field_104402_y
		// @60: iconst_5
		// @61: newarray int[]
		// @63: putstatic int[] game.C_100072_ui.field_104389_m
		// @66: iconst_5
		// @67: newarray int[]
		// @69: putstatic int[] game.C_100072_ui.field_104387_o
		// @6C: iconst_5
		// @6D: newarray int[]
		// @6F: putstatic int[] game.C_100072_ui.field_104403_x
		// @72: iconst_5
		// @73: newarray int[]
		// @75: putstatic int[] game.C_100072_ui.field_104380_g
		// @78: return
	}
}
