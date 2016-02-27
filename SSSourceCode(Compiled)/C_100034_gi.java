package game;

import java.io.IOException;
import java.awt.Canvas;

final class C_100034_gi
{
	static C_100133_tk field_104034_l;
	static int field_104032_c;
	private int field_104031_b;
	private int field_104030_e;
	private C_100333_ij field_104035_m;
	static boolean field_104036_j;
	private int field_104037_k;
	static byte[][] field_104039_i;
	private static C_100102_w field_104028_g;
	static long field_104038_h;
	static int[] field_104027_f;
	static Canvas field_104033_a;
	static boolean field_104029_d;
	private static final String[] field_104040_z;
	
	public static void func_104020_c(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.awt.Canvas game.C_100034_gi.field_104033_a
		// @04: aconst_null
		// @05: checkcast byte[][]
		// @08: putstatic byte[][] game.C_100034_gi.field_104039_i
		// @0B: aconst_null
		// @0C: putstatic int[] game.C_100034_gi.field_104027_f
		// @0F: aconst_null
		// @10: putstatic game.C_100133_tk game.C_100034_gi.field_104034_l
		// @13: aconst_null
		// @14: putstatic game.C_100102_w game.C_100034_gi.field_104028_g
		// @17: iload_0
		// @18: ifeq @22
		// @1B: aconst_null
		// @1C: checkcast int[]
		// @1F: putstatic int[] game.C_100034_gi.field_104027_f
		// @22: goto @47
		// @25: astore_1
		// @26: aload_1
		// @27: new java.lang.StringBuilder
		// @2A: dup
		// @2B: invokespecial java.lang.StringBuilder.<init>()void
		// @2E: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @31: bipush 119 (0x77)
		// @33: aaload
		// @34: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @37: iload_0
		// @38: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3B: bipush 41 (0x29)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @43: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @46: athrow
		// @47: return
	}
	
	final void func_104013_a(byte arg0)
	{
		// @0000: getstatic int game.SteelSentinels.field_105275_O
		// @0003: istore #19
		// @0005: getstatic int[] game.C_100275_na.field_103087_l
		// @0008: iconst_0
		// @0009: iaload
		// @000A: iconst_3
		// @000B: if_icmpge @001F
		// @000E: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @0011: iconst_0
		// @0012: getstatic java.lang.String game.C_100176_ci.field_105621_f
		// @0015: aastore
		// @0016: iload #19
		// @0018: ifeq @002B
		// @001B: goto @001F
		// @001E: athrow
		// @001F: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @0022: iconst_0
		// @0023: getstatic java.lang.String game.C_100236_on.field_100898_m
		// @0026: aastore
		// @0027: goto @002B
		// @002A: athrow
		// @002B: aload_0
		// @002C: bipush -54 (0xCA)
		// @002E: invokespecial game.C_100034_gi.func_104017_c(byte)void
		// @0031: bipush -13 (0xF3)
		// @0033: aload_0
		// @0034: getfield int game.C_100034_gi.field_104030_e
		// @0037: iconst_m1
		// @0038: ixor
		// @0039: if_icmpne @0053
		// @003C: sipush 30452 (0x76F4)
		// @003F: invokestatic game.C_100000_gd.func_100353_b(int)boolean
		// @0042: ifeq @0052
		// @0045: goto @0049
		// @0048: athrow
		// @0049: bipush -54 (0xCA)
		// @004B: invokestatic game.C_100293_kj.func_106881_b(int)void
		// @004E: goto @0052
		// @0051: athrow
		// @0052: return
		// @0053: bipush 21 (0x15)
		// @0055: aload_0
		// @0056: getfield int game.C_100034_gi.field_104030_e
		// @0059: if_icmpne @0114
		// @005C: getstatic boolean game.C_100270_mi.field_102276_Vb
		// @005F: ifne @0102
		// @0062: goto @0066
		// @0065: athrow
		// @0066: getstatic game.C_100098_h game.C_100148_bh.field_101801_w
		// @0069: ifnull @0102
		// @006C: goto @0070
		// @006F: athrow
		// @0070: getstatic game.C_100098_h game.C_100148_bh.field_101801_w
		// @0073: iconst_0
		// @0074: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @0077: ifeq @0102
		// @007A: goto @007E
		// @007D: athrow
		// @007E: getstatic game.C_100098_h game.C_100148_bh.field_101801_w
		// @0081: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @0084: bipush 72 (0x48)
		// @0086: aaload
		// @0087: iconst_0
		// @0088: invokevirtual game.C_100098_h.func_104593_a(java.lang.String, boolean)boolean
		// @008B: ifeq @0102
		// @008E: goto @0092
		// @0091: athrow
		// @0092: getstatic game.C_100098_h game.C_100148_bh.field_101801_w
		// @0095: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @0098: bipush 67 (0x43)
		// @009A: aaload
		// @009B: iconst_0
		// @009C: invokevirtual game.C_100098_h.func_104593_a(java.lang.String, boolean)boolean
		// @009F: ifeq @0102
		// @00A2: goto @00A6
		// @00A5: athrow
		// @00A6: getstatic game.C_100098_h game.C_100148_bh.field_101801_w
		// @00A9: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @00AC: bipush 69 (0x45)
		// @00AE: aaload
		// @00AF: iconst_0
		// @00B0: invokevirtual game.C_100098_h.func_104593_a(java.lang.String, boolean)boolean
		// @00B3: ifeq @0102
		// @00B6: goto @00BA
		// @00B9: athrow
		// @00BA: getstatic game.C_100098_h game.C_100086_uh.field_103028_u
		// @00BD: ifnull @0102
		// @00C0: goto @00C4
		// @00C3: athrow
		// @00C4: getstatic game.C_100098_h game.C_100086_uh.field_103028_u
		// @00C7: iconst_0
		// @00C8: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @00CB: ifeq @0102
		// @00CE: goto @00D2
		// @00D1: athrow
		// @00D2: getstatic game.C_100098_h game.C_100086_uh.field_103028_u
		// @00D5: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @00D8: bipush 67 (0x43)
		// @00DA: aaload
		// @00DB: iconst_0
		// @00DC: invokevirtual game.C_100098_h.func_104593_a(java.lang.String, boolean)boolean
		// @00DF: ifeq @0102
		// @00E2: goto @00E6
		// @00E5: athrow
		// @00E6: getstatic game.C_100098_h game.C_100086_uh.field_103028_u
		// @00E9: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @00EC: bipush 69 (0x45)
		// @00EE: aaload
		// @00EF: iconst_0
		// @00F0: invokevirtual game.C_100098_h.func_104593_a(java.lang.String, boolean)boolean
		// @00F3: ifne @00FE
		// @00F6: goto @00FA
		// @00F9: athrow
		// @00FA: goto @0102
		// @00FD: athrow
		// @00FE: iconst_1
		// @00FF: putstatic boolean game.C_100270_mi.field_102276_Vb
		// @0102: getstatic boolean game.C_100270_mi.field_102276_Vb
		// @0105: ifne @010C
		// @0108: goto @0113
		// @010B: athrow
		// @010C: getstatic game.C_100146_bf game.C_100300_kc.field_107069_e
		// @010F: iconst_1
		// @0110: invokevirtual game.C_100146_bf.func_105117_a(boolean)void
		// @0113: return
		// @0114: iconst_0
		// @0115: aload_0
		// @0116: getfield int game.C_100034_gi.field_104030_e
		// @0119: if_icmpne @02FA
		// @011C: getstatic game.C_100251_pm game.C_100038_wa.field_104068_d
		// @011F: iconst_0
		// @0120: aload_0
		// @0121: getfield int game.C_100034_gi.field_104037_k
		// @0124: ineg
		// @0125: iconst_0
		// @0126: iadd
		// @0127: invokevirtual game.C_100251_pm.func_102353_h(int, int)void
		// @012A: getstatic game.C_100251_pm game.C_100114_q.field_100495_x
		// @012D: iconst_0
		// @012E: aload_0
		// @012F: getfield int game.C_100034_gi.field_104031_b
		// @0132: bipush 60 (0x3C)
		// @0134: iadd
		// @0135: invokevirtual game.C_100251_pm.func_102353_h(int, int)void
		// @0138: iconst_0
		// @0139: istore_2
		// @013A: iload_2
		// @013B: iconst_0
		// @013C: invokestatic game.C_100009_fg.func_103648_a(int)int
		// @013F: iadd
		// @0140: istore_2
		// @0141: iload_2
		// @0142: getstatic int[] game.C_100275_na.field_103087_l
		// @0145: iconst_1
		// @0146: iaload
		// @0147: getstatic int[] game.C_100275_na.field_103087_l
		// @014A: iconst_0
		// @014B: iaload
		// @014C: iadd
		// @014D: getstatic int[] game.C_100275_na.field_103087_l
		// @0150: iconst_2
		// @0151: iaload
		// @0152: iadd
		// @0153: bipush 10 (0x0A)
		// @0155: imul
		// @0156: iadd
		// @0157: istore_2
		// @0158: iload_2
		// @0159: bipush 10 (0x0A)
		// @015B: bipush 106 (0x6A)
		// @015D: getstatic int[] game.C_100066_dl.field_101632_G
		// @0160: invokestatic game.C_100252_pn.func_105493_a(int, int[])int
		// @0163: imul
		// @0164: iadd
		// @0165: istore_2
		// @0166: iload_2
		// @0167: bipush 25 (0x19)
		// @0169: bipush 31 (0x1F)
		// @016B: getstatic int[] game.C_100066_dl.field_101632_G
		// @016E: invokestatic game.C_100189_ri.func_105742_a(int, int, int[])boolean
		// @0171: ifne @0179
		// @0174: iconst_0
		// @0175: goto @017B
		// @0178: athrow
		// @0179: bipush 10 (0x0A)
		// @017B: iadd
		// @017C: istore_2
		// @017D: sipush 811 (0x032B)
		// @0180: istore_3
		// @0181: iconst_m1
		// @0182: bipush 10 (0x0A)
		// @0184: iload_2
		// @0185: imul
		// @0186: iload_3
		// @0187: idiv
		// @0188: iadd
		// @0189: istore #4
		// @018B: bipush 9 (0x09)
		// @018D: iload #4
		// @018F: if_icmpge @0196
		// @0192: bipush 9 (0x09)
		// @0194: istore #4
		// @0196: bipush 30 (0x1E)
		// @0198: iload_2
		// @0199: ineg
		// @019A: iload_3
		// @019B: iadd
		// @019C: imul
		// @019D: iload_3
		// @019E: idiv
		// @019F: iconst_2
		// @01A0: iadd
		// @01A1: istore #5
		// @01A3: iload_3
		// @01A4: iload_2
		// @01A5: if_icmpne @01AD
		// @01A8: iconst_1
		// @01A9: goto @01AE
		// @01AC: athrow
		// @01AD: iconst_0
		// @01AE: istore #6
		// @01B0: iload #6
		// @01B2: ifne @01B9
		// @01B5: goto @01BC
		// @01B8: athrow
		// @01B9: iconst_0
		// @01BA: istore #5
		// @01BC: iload_2
		// @01BD: sipush 279 (0x0117)
		// @01C0: imul
		// @01C1: iload_3
		// @01C2: idiv
		// @01C3: istore_2
		// @01C4: sipush 14419 (0x3853)
		// @01C7: istore #7
		// @01C9: aload_0
		// @01CA: getfield int game.C_100034_gi.field_104031_b
		// @01CD: sipush 450 (0x01C2)
		// @01D0: iadd
		// @01D1: iload_2
		// @01D2: ineg
		// @01D3: iadd
		// @01D4: istore #8
		// @01D6: sipush 550 (0x0226)
		// @01D9: sipush 171 (0x00AB)
		// @01DC: aload_0
		// @01DD: getfield int game.C_100034_gi.field_104031_b
		// @01E0: iadd
		// @01E1: sipush 560 (0x0230)
		// @01E4: sipush 450 (0x01C2)
		// @01E7: aload_0
		// @01E8: getfield int game.C_100034_gi.field_104031_b
		// @01EB: iadd
		// @01EC: invokestatic game.C_100196_rb.func_105815_h(int, int, int, int)void
		// @01EF: sipush 192 (0x00C0)
		// @01F2: iconst_0
		// @01F3: iload #5
		// @01F5: iload #7
		// @01F7: bipush -98 (0x9E)
		// @01F9: iload #8
		// @01FB: sipush 550 (0x0226)
		// @01FE: bipush 10 (0x0A)
		// @0200: iload #7
		// @0202: invokestatic game.C_100246_pg.func_106396_a(int, int, int, int, int, int, int, int, int)void
		// @0205: aload_0
		// @0206: getfield int game.C_100034_gi.field_104031_b
		// @0209: sipush 450 (0x01C2)
		// @020C: iadd
		// @020D: iload #5
		// @020F: iload #8
		// @0211: iadd
		// @0212: if_icmple @023A
		// @0215: sipush 550 (0x0226)
		// @0218: iload #8
		// @021A: iload #5
		// @021C: iadd
		// @021D: bipush 10 (0x0A)
		// @021F: aload_0
		// @0220: getfield int game.C_100034_gi.field_104031_b
		// @0223: sipush 450 (0x01C2)
		// @0226: iadd
		// @0227: iload #8
		// @0229: iload #5
		// @022B: ineg
		// @022C: isub
		// @022D: isub
		// @022E: iload #7
		// @0230: sipush 192 (0x00C0)
		// @0233: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @0236: goto @023A
		// @0239: athrow
		// @023A: invokestatic game.C_100196_rb.func_105781_a()void
		// @023D: getstatic game.C_100037_wb game.C_100178_cg.field_105686_f
		// @0240: sipush 640 (0x0280)
		// @0243: getstatic game.C_100037_wb game.C_100178_cg.field_105686_f
		// @0246: getfield int game.C_100037_wb.field_102341_y
		// @0249: ineg
		// @024A: iadd
		// @024B: iconst_2
		// @024C: idiv
		// @024D: aload_0
		// @024E: getfield int game.C_100034_gi.field_104037_k
		// @0251: ineg
		// @0252: bipush 15 (0x0F)
		// @0254: iadd
		// @0255: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @0258: bipush -25 (0xE7)
		// @025A: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @025D: ifne @02FA
		// @0260: iconst_2
		// @0261: getstatic int game.C_100107_u.field_104770_g
		// @0264: if_icmple @026F
		// @0267: goto @026B
		// @026A: athrow
		// @026B: goto @02FA
		// @026E: athrow
		// @026F: sipush 520 (0x0208)
		// @0272: istore #9
		// @0274: aload_0
		// @0275: getfield int game.C_100034_gi.field_104031_b
		// @0278: bipush 100 (0x64)
		// @027A: iadd
		// @027B: istore #10
		// @027D: bipush 100 (0x64)
		// @027F: istore #11
		// @0281: bipush 34 (0x22)
		// @0283: istore #12
		// @0285: getstatic int game.C_100015_wh.field_103781_g
		// @0288: iload #9
		// @028A: if_icmplt @02C4
		// @028D: iload #9
		// @028F: iload #11
		// @0291: iadd
		// @0292: getstatic int game.C_100015_wh.field_103781_g
		// @0295: if_icmple @02C4
		// @0298: goto @029C
		// @029B: athrow
		// @029C: iload #10
		// @029E: iconst_m1
		// @029F: ixor
		// @02A0: getstatic int game.C_100338_jc.field_105370_l
		// @02A3: iconst_m1
		// @02A4: ixor
		// @02A5: if_icmplt @02C4
		// @02A8: goto @02AC
		// @02AB: athrow
		// @02AC: getstatic int game.C_100338_jc.field_105370_l
		// @02AF: iconst_m1
		// @02B0: ixor
		// @02B1: iload #12
		// @02B3: iload #10
		// @02B5: iadd
		// @02B6: iconst_m1
		// @02B7: ixor
		// @02B8: if_icmple @02C4
		// @02BB: goto @02BF
		// @02BE: athrow
		// @02BF: iconst_1
		// @02C0: goto @02C5
		// @02C3: athrow
		// @02C4: iconst_0
		// @02C5: istore #13
		// @02C7: iload #11
		// @02C9: bipush -123 (0x85)
		// @02CB: iload #12
		// @02CD: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @02D0: bipush 73 (0x49)
		// @02D2: aaload
		// @02D3: iload #9
		// @02D5: iload #10
		// @02D7: invokestatic game.C_100240_oj.func_106304_a(int, byte, int, java.lang.String, int, int)boolean
		// @02DA: pop
		// @02DB: iload #13
		// @02DD: ifeq @02F5
		// @02E0: getstatic boolean game.C_100312_ld.field_107154_e
		// @02E3: ifeq @02EE
		// @02E6: goto @02EA
		// @02E9: athrow
		// @02EA: goto @02F5
		// @02ED: athrow
		// @02EE: bipush 97 (0x61)
		// @02F0: bipush 8 (0x08)
		// @02F2: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @02F5: iload #13
		// @02F7: putstatic boolean game.C_100312_ld.field_107154_e
		// @02FA: aconst_null
		// @02FB: astore_2
		// @02FC: iconst_0
		// @02FD: istore_3
		// @02FE: iconst_0
		// @02FF: istore #4
		// @0301: aload_0
		// @0302: getfield int game.C_100034_gi.field_104030_e
		// @0305: istore #5
		// @0307: iconst_0
		// @0308: iload #5
		// @030A: if_icmpne @0316
		// @030D: iload #19
		// @030F: ifeq @0477
		// @0312: goto @0316
		// @0315: athrow
		// @0316: bipush 14 (0x0E)
		// @0318: iload #5
		// @031A: if_icmpne @032A
		// @031D: goto @0321
		// @0320: athrow
		// @0321: iload #19
		// @0323: ifeq @0406
		// @0326: goto @032A
		// @0329: athrow
		// @032A: iload #5
		// @032C: bipush 13 (0x0D)
		// @032E: if_icmpeq @0410
		// @0331: goto @0335
		// @0334: athrow
		// @0335: iload #5
		// @0337: bipush 7 (0x07)
		// @0339: if_icmpeq @041A
		// @033C: goto @0340
		// @033F: athrow
		// @0340: bipush 6 (0x06)
		// @0342: iload #5
		// @0344: if_icmpne @0354
		// @0347: goto @034B
		// @034A: athrow
		// @034B: iload #19
		// @034D: ifeq @0423
		// @0350: goto @0354
		// @0353: athrow
		// @0354: iload #5
		// @0356: iconst_5
		// @0357: if_icmpne @0367
		// @035A: goto @035E
		// @035D: athrow
		// @035E: iload #19
		// @0360: ifeq @042C
		// @0363: goto @0367
		// @0366: athrow
		// @0367: iload #5
		// @0369: bipush 8 (0x08)
		// @036B: if_icmpeq @0433
		// @036E: goto @0372
		// @0371: athrow
		// @0372: bipush 19 (0x13)
		// @0374: iload #5
		// @0376: if_icmpeq @043D
		// @0379: goto @037D
		// @037C: athrow
		// @037D: bipush -21 (0xEB)
		// @037F: iload #5
		// @0381: iconst_m1
		// @0382: ixor
		// @0383: if_icmpeq @0446
		// @0386: goto @038A
		// @0389: athrow
		// @038A: iload #5
		// @038C: iconst_m1
		// @038D: ixor
		// @038E: bipush -2 (0xFE)
		// @0390: if_icmpeq @0451
		// @0393: goto @0397
		// @0396: athrow
		// @0397: iload #5
		// @0399: iconst_m1
		// @039A: ixor
		// @039B: bipush -3 (0xFD)
		// @039D: if_icmpne @03AD
		// @03A0: goto @03A4
		// @03A3: athrow
		// @03A4: iload #19
		// @03A6: ifeq @0451
		// @03A9: goto @03AD
		// @03AC: athrow
		// @03AD: bipush -4 (0xFC)
		// @03AF: iload #5
		// @03B1: iconst_m1
		// @03B2: ixor
		// @03B3: if_icmpne @03C3
		// @03B6: goto @03BA
		// @03B9: athrow
		// @03BA: iload #19
		// @03BC: ifeq @0451
		// @03BF: goto @03C3
		// @03C2: athrow
		// @03C3: iconst_4
		// @03C4: iload #5
		// @03C6: if_icmpeq @0451
		// @03C9: goto @03CD
		// @03CC: athrow
		// @03CD: bipush -23 (0xE9)
		// @03CF: iload #5
		// @03D1: iconst_m1
		// @03D2: ixor
		// @03D3: if_icmpne @03E3
		// @03D6: goto @03DA
		// @03D9: athrow
		// @03DA: iload #19
		// @03DC: ifeq @045D
		// @03DF: goto @03E3
		// @03E2: athrow
		// @03E3: bipush 17 (0x11)
		// @03E5: iload #5
		// @03E7: if_icmpne @03F7
		// @03EA: goto @03EE
		// @03ED: athrow
		// @03EE: iload #19
		// @03F0: ifeq @0469
		// @03F3: goto @03F7
		// @03F6: athrow
		// @03F7: iload #5
		// @03F9: bipush 18 (0x12)
		// @03FB: if_icmpeq @0470
		// @03FE: goto @0402
		// @0401: athrow
		// @0402: goto @0477
		// @0405: athrow
		// @0406: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @0409: bipush 28 (0x1C)
		// @040B: aaload
		// @040C: astore_2
		// @040D: goto @0477
		// @0410: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @0413: bipush 27 (0x1B)
		// @0415: aaload
		// @0416: astore_2
		// @0417: goto @0477
		// @041A: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @041D: iconst_5
		// @041E: aaload
		// @041F: astore_2
		// @0420: goto @0477
		// @0423: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @0426: iconst_4
		// @0427: aaload
		// @0428: astore_2
		// @0429: goto @0477
		// @042C: getstatic java.lang.String game.C_100205_qf.field_103682_a
		// @042F: astore_2
		// @0430: goto @0477
		// @0433: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @0436: bipush 22 (0x16)
		// @0438: aaload
		// @0439: astore_2
		// @043A: goto @0477
		// @043D: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @0440: iconst_0
		// @0441: aaload
		// @0442: astore_2
		// @0443: goto @0477
		// @0446: getstatic java.lang.String[] game.C_100333_ij.field_107349_a
		// @0449: getstatic int game.C_100194_rd.field_103072_v
		// @044C: aaload
		// @044D: astore_2
		// @044E: goto @0477
		// @0451: iconst_1
		// @0452: istore #4
		// @0454: iconst_1
		// @0455: istore_3
		// @0456: getstatic java.lang.String game.C_100343_jf.field_104827_j
		// @0459: astore_2
		// @045A: goto @0477
		// @045D: iconst_1
		// @045E: istore #4
		// @0460: getstatic java.lang.String game.C_100016_wi.field_103803_e
		// @0463: astore_2
		// @0464: iconst_1
		// @0465: istore_3
		// @0466: goto @0477
		// @0469: getstatic java.lang.String game.C_100215_ai.field_106018_a
		// @046C: astore_2
		// @046D: goto @0477
		// @0470: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @0473: bipush 68 (0x44)
		// @0475: aaload
		// @0476: astore_2
		// @0477: iload_1
		// @0478: bipush 45 (0x2D)
		// @047A: if_icmpgt @0487
		// @047D: ldc2_w -50
		// @0480: putstatic long game.C_100034_gi.field_104038_h
		// @0483: goto @0487
		// @0486: athrow
		// @0487: iload #4
		// @0489: ifne @0490
		// @048C: goto @04D8
		// @048F: athrow
		// @0490: bipush 60 (0x3C)
		// @0492: istore #5
		// @0494: iload #5
		// @0496: bipush 30 (0x1E)
		// @0498: getstatic int[][] game.C_100012_fh.field_100515_K
		// @049B: aload_0
		// @049C: getfield int game.C_100034_gi.field_104030_e
		// @049F: aaload
		// @04A0: arraylength
		// @04A1: imul
		// @04A2: iadd
		// @04A3: istore #5
		// @04A5: aload_0
		// @04A6: bipush -4 (0xFC)
		// @04A8: iconst_0
		// @04A9: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @04AC: bipush 30 (0x1E)
		// @04AE: isub
		// @04AF: istore #6
		// @04B1: bipush -25 (0xE7)
		// @04B3: aload_0
		// @04B4: bipush 92 (0x5C)
		// @04B6: iconst_0
		// @04B7: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @04BA: iadd
		// @04BB: istore #7
		// @04BD: iconst_2
		// @04BE: iload #7
		// @04C0: imul
		// @04C1: ineg
		// @04C2: sipush 640 (0x0280)
		// @04C5: iadd
		// @04C6: istore #8
		// @04C8: iload #7
		// @04CA: iload #6
		// @04CC: bipush 125 (0x7D)
		// @04CE: iload #8
		// @04D0: getstatic game.C_100037_wb[] game.C_100068_vc.field_104344_b
		// @04D3: iload #5
		// @04D5: invokestatic game.C_100157_db.func_103554_a(int, int, int, int, game.C_100037_wb[], int)void
		// @04D8: aload_0
		// @04D9: getfield int game.C_100034_gi.field_104030_e
		// @04DC: ifne @04E3
		// @04DF: goto @07D1
		// @04E2: athrow
		// @04E3: aload_0
		// @04E4: sipush -21394 (0xAC6E)
		// @04E7: invokespecial game.C_100034_gi.func_103978_l(int)int
		// @04EA: istore #5
		// @04EC: getstatic game.C_100037_wb game.C_100284_nj.field_106769_d
		// @04EF: iconst_0
		// @04F0: bipush -5 (0xFB)
		// @04F2: bipush 80 (0x50)
		// @04F4: bipush 7 (0x07)
		// @04F6: invokevirtual game.C_100037_wb.func_102343_b(int, int, int, int)void
		// @04F9: getstatic game.C_100037_wb game.C_100284_nj.field_106769_d
		// @04FC: iconst_0
		// @04FD: sipush 474 (0x01DA)
		// @0500: iload #5
		// @0502: isub
		// @0503: bipush 80 (0x50)
		// @0505: iload #5
		// @0507: bipush 8 (0x08)
		// @0509: idiv
		// @050A: iconst_2
		// @050B: iadd
		// @050C: invokevirtual game.C_100037_wb.func_102343_b(int, int, int, int)void
		// @050F: iconst_0
		// @0510: invokestatic game.C_100005_fk.func_103583_a(boolean)void
		// @0513: iload_3
		// @0514: ifne @0583
		// @0517: bipush 7 (0x07)
		// @0519: aload_0
		// @051A: getfield int game.C_100034_gi.field_104030_e
		// @051D: if_icmpne @053B
		// @0520: goto @0524
		// @0523: athrow
		// @0524: getstatic boolean game.C_100301_kb.field_107100_k
		// @0527: ifne @053B
		// @052A: goto @052E
		// @052D: athrow
		// @052E: iconst_m1
		// @052F: getstatic int game.C_100052_eb.field_104231_b
		// @0532: iconst_m1
		// @0533: ixor
		// @0534: if_icmpeq @0583
		// @0537: goto @053B
		// @053A: athrow
		// @053B: bipush 14 (0x0E)
		// @053D: aload_0
		// @053E: getfield int game.C_100034_gi.field_104030_e
		// @0541: if_icmpne @0569
		// @0544: goto @0548
		// @0547: athrow
		// @0548: iconst_m1
		// @0549: getstatic int game.C_100052_eb.field_104231_b
		// @054C: iconst_m1
		// @054D: ixor
		// @054E: if_icmpne @0569
		// @0551: goto @0555
		// @0554: athrow
		// @0555: getstatic boolean game.C_100309_lk.field_103271_ab
		// @0558: ifeq @0583
		// @055B: goto @055F
		// @055E: athrow
		// @055F: getstatic boolean game.C_100034_gi.field_104029_d
		// @0562: ifeq @0583
		// @0565: goto @0569
		// @0568: athrow
		// @0569: iconst_0
		// @056A: bipush 50 (0x32)
		// @056C: sipush 640 (0x0280)
		// @056F: iload #5
		// @0571: ineg
		// @0572: sipush 430 (0x01AE)
		// @0575: iadd
		// @0576: iconst_0
		// @0577: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @057A: iload #19
		// @057C: ifeq @0778
		// @057F: goto @0583
		// @0582: athrow
		// @0583: aload_0
		// @0584: getfield int game.C_100034_gi.field_104030_e
		// @0587: iconst_m1
		// @0588: ixor
		// @0589: bipush -15 (0xF1)
		// @058B: if_icmpne @0778
		// @058E: goto @0592
		// @0591: athrow
		// @0592: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @0595: astore #6
		// @0597: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @059A: astore #7
		// @059C: bipush -2 (0xFE)
		// @059E: getstatic int game.C_100200_ba.field_105852_c
		// @05A1: iconst_m1
		// @05A2: ixor
		// @05A3: if_icmpne @05A9
		// @05A6: aconst_null
		// @05A7: astore #7
		// @05A9: aload #6
		// @05AB: ifnonnull @05B2
		// @05AE: goto @069D
		// @05B1: athrow
		// @05B2: iconst_0
		// @05B3: bipush 50 (0x32)
		// @05B5: aload #6
		// @05B7: getfield int game.C_100302_ka.field_101840_Eb
		// @05BA: sipush 430 (0x01AE)
		// @05BD: iload #5
		// @05BF: ineg
		// @05C0: iadd
		// @05C1: iconst_0
		// @05C2: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @05C5: bipush -51 (0xCD)
		// @05C7: aload #6
		// @05C9: getfield int game.C_100302_ka.field_101835_xb
		// @05CC: iconst_m1
		// @05CD: ixor
		// @05CE: if_icmpgt @05D5
		// @05D1: goto @05ED
		// @05D4: athrow
		// @05D5: aload #6
		// @05D7: getfield int game.C_100302_ka.field_101840_Eb
		// @05DA: bipush 50 (0x32)
		// @05DC: aload #6
		// @05DE: getfield int game.C_100302_ka.field_101886_Kb
		// @05E1: bipush -50 (0xCE)
		// @05E3: aload #6
		// @05E5: getfield int game.C_100302_ka.field_101835_xb
		// @05E8: iadd
		// @05E9: iconst_0
		// @05EA: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @05ED: aload #6
		// @05EF: getfield int game.C_100302_ka.field_101848_lb
		// @05F2: aload #6
		// @05F4: getfield int game.C_100302_ka.field_101835_xb
		// @05F7: iadd
		// @05F8: iconst_m1
		// @05F9: ixor
		// @05FA: iload #5
		// @05FC: ineg
		// @05FD: sipush 430 (0x01AE)
		// @0600: iadd
		// @0601: iconst_m1
		// @0602: ixor
		// @0603: if_icmpgt @060A
		// @0606: goto @0637
		// @0609: athrow
		// @060A: aload #6
		// @060C: getfield int game.C_100302_ka.field_101840_Eb
		// @060F: aload #6
		// @0611: getfield int game.C_100302_ka.field_101848_lb
		// @0614: aload #6
		// @0616: getfield int game.C_100302_ka.field_101835_xb
		// @0619: iadd
		// @061A: aload #6
		// @061C: getfield int game.C_100302_ka.field_101886_Kb
		// @061F: aload #6
		// @0621: getfield int game.C_100302_ka.field_101835_xb
		// @0624: ineg
		// @0625: iload #5
		// @0627: ineg
		// @0628: sipush 430 (0x01AE)
		// @062B: aload #6
		// @062D: getfield int game.C_100302_ka.field_101848_lb
		// @0630: isub
		// @0631: iadd
		// @0632: iadd
		// @0633: iconst_0
		// @0634: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @0637: aconst_null
		// @0638: aload #7
		// @063A: if_acmpne @066F
		// @063D: aload #6
		// @063F: getfield int game.C_100302_ka.field_101886_Kb
		// @0642: aload #6
		// @0644: getfield int game.C_100302_ka.field_101840_Eb
		// @0647: iadd
		// @0648: bipush 50 (0x32)
		// @064A: aload #6
		// @064C: getfield int game.C_100302_ka.field_101886_Kb
		// @064F: ineg
		// @0650: aload #6
		// @0652: getfield int game.C_100302_ka.field_101840_Eb
		// @0655: ineg
		// @0656: iadd
		// @0657: sipush 640 (0x0280)
		// @065A: iadd
		// @065B: iload #5
		// @065D: ineg
		// @065E: sipush 430 (0x01AE)
		// @0661: iadd
		// @0662: iconst_0
		// @0663: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @0666: iload #19
		// @0668: ifeq @069D
		// @066B: goto @066F
		// @066E: athrow
		// @066F: aload #6
		// @0671: getfield int game.C_100302_ka.field_101886_Kb
		// @0674: aload #6
		// @0676: getfield int game.C_100302_ka.field_101840_Eb
		// @0679: iadd
		// @067A: bipush 50 (0x32)
		// @067C: aload #6
		// @067E: getfield int game.C_100302_ka.field_101886_Kb
		// @0681: ineg
		// @0682: aload #7
		// @0684: getfield int game.C_100302_ka.field_101840_Eb
		// @0687: aload #6
		// @0689: getfield int game.C_100302_ka.field_101840_Eb
		// @068C: isub
		// @068D: iadd
		// @068E: iload #5
		// @0690: ineg
		// @0691: sipush 430 (0x01AE)
		// @0694: iadd
		// @0695: iconst_0
		// @0696: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @0699: goto @069D
		// @069C: athrow
		// @069D: aload #7
		// @069F: ifnull @0754
		// @06A2: aload #6
		// @06A4: ifnonnull @06C1
		// @06A7: goto @06AB
		// @06AA: athrow
		// @06AB: iconst_0
		// @06AC: bipush 50 (0x32)
		// @06AE: aload #7
		// @06B0: getfield int game.C_100302_ka.field_101840_Eb
		// @06B3: sipush 430 (0x01AE)
		// @06B6: iload #5
		// @06B8: isub
		// @06B9: iconst_0
		// @06BA: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @06BD: goto @06C1
		// @06C0: athrow
		// @06C1: aload #7
		// @06C3: getfield int game.C_100302_ka.field_101835_xb
		// @06C6: bipush 50 (0x32)
		// @06C8: if_icmple @06E3
		// @06CB: aload #7
		// @06CD: getfield int game.C_100302_ka.field_101840_Eb
		// @06D0: iconst_0
		// @06D1: aload #7
		// @06D3: getfield int game.C_100302_ka.field_101886_Kb
		// @06D6: aload #7
		// @06D8: getfield int game.C_100302_ka.field_101835_xb
		// @06DB: iconst_0
		// @06DC: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @06DF: goto @06E3
		// @06E2: athrow
		// @06E3: aload #7
		// @06E5: getfield int game.C_100302_ka.field_101835_xb
		// @06E8: aload #7
		// @06EA: getfield int game.C_100302_ka.field_101848_lb
		// @06ED: ineg
		// @06EE: isub
		// @06EF: iconst_m1
		// @06F0: ixor
		// @06F1: sipush 430 (0x01AE)
		// @06F4: iload #5
		// @06F6: ineg
		// @06F7: iadd
		// @06F8: iconst_m1
		// @06F9: ixor
		// @06FA: if_icmple @072B
		// @06FD: aload #7
		// @06FF: getfield int game.C_100302_ka.field_101840_Eb
		// @0702: aload #7
		// @0704: getfield int game.C_100302_ka.field_101835_xb
		// @0707: aload #7
		// @0709: getfield int game.C_100302_ka.field_101848_lb
		// @070C: iadd
		// @070D: aload #7
		// @070F: getfield int game.C_100302_ka.field_101886_Kb
		// @0712: aload #7
		// @0714: getfield int game.C_100302_ka.field_101848_lb
		// @0717: ineg
		// @0718: aload #7
		// @071A: getfield int game.C_100302_ka.field_101835_xb
		// @071D: ineg
		// @071E: iadd
		// @071F: sipush 480 (0x01E0)
		// @0722: iadd
		// @0723: iconst_0
		// @0724: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @0727: goto @072B
		// @072A: athrow
		// @072B: aload #7
		// @072D: getfield int game.C_100302_ka.field_101886_Kb
		// @0730: aload #7
		// @0732: getfield int game.C_100302_ka.field_101840_Eb
		// @0735: iadd
		// @0736: bipush 50 (0x32)
		// @0738: aload #7
		// @073A: getfield int game.C_100302_ka.field_101886_Kb
		// @073D: ineg
		// @073E: aload #7
		// @0740: getfield int game.C_100302_ka.field_101840_Eb
		// @0743: ineg
		// @0744: iadd
		// @0745: sipush 640 (0x0280)
		// @0748: iadd
		// @0749: sipush 430 (0x01AE)
		// @074C: iload #5
		// @074E: ineg
		// @074F: iadd
		// @0750: iconst_0
		// @0751: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @0754: aconst_null
		// @0755: aload #6
		// @0757: if_acmpne @0778
		// @075A: aload #7
		// @075C: ifnull @0767
		// @075F: goto @0763
		// @0762: athrow
		// @0763: goto @0778
		// @0766: athrow
		// @0767: iconst_0
		// @0768: bipush 50 (0x32)
		// @076A: sipush 640 (0x0280)
		// @076D: iload #5
		// @076F: ineg
		// @0770: sipush 630 (0x0276)
		// @0773: iadd
		// @0774: iconst_0
		// @0775: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @0778: iconst_m1
		// @0779: sipush 640 (0x0280)
		// @077C: getstatic game.C_100037_wb[] game.C_100015_wh.field_103785_c
		// @077F: iconst_0
		// @0780: sipush 431 (0x01AF)
		// @0783: iload #5
		// @0785: ineg
		// @0786: iadd
		// @0787: bipush 49 (0x31)
		// @0789: invokestatic game.C_100100_i.func_102009_a(int, int, game.C_100037_wb[], int, int, int)void
		// @078C: getstatic game.C_100037_wb game.C_100309_lk.field_103255_db
		// @078F: getfield int game.C_100037_wb.field_102340_z
		// @0792: ineg
		// @0793: bipush 50 (0x32)
		// @0795: iadd
		// @0796: istore #6
		// @0798: getstatic game.C_100037_wb game.C_100309_lk.field_103255_db
		// @079B: iconst_0
		// @079C: aload_0
		// @079D: getfield int game.C_100034_gi.field_104037_k
		// @07A0: ineg
		// @07A1: iload #6
		// @07A3: iadd
		// @07A4: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @07A7: iconst_0
		// @07A8: aload_0
		// @07A9: getfield int game.C_100034_gi.field_104037_k
		// @07AC: ineg
		// @07AD: bipush 49 (0x31)
		// @07AF: iadd
		// @07B0: sipush 640 (0x0280)
		// @07B3: iconst_0
		// @07B4: sipush 128 (0x0080)
		// @07B7: invokestatic game.C_100196_rb.func_105800_f(int, int, int, int, int)void
		// @07BA: iload #5
		// @07BC: bipush -3 (0xFD)
		// @07BE: iconst_0
		// @07BF: sipush 640 (0x0280)
		// @07C2: sipush 480 (0x01E0)
		// @07C5: iload #5
		// @07C7: aload_0
		// @07C8: getfield int game.C_100034_gi.field_104031_b
		// @07CB: ineg
		// @07CC: iadd
		// @07CD: isub
		// @07CE: invokestatic game.C_100141_tc.func_105052_a(int, int, int, int, int)void
		// @07D1: bipush -18 (0xEE)
		// @07D3: aload_0
		// @07D4: getfield int game.C_100034_gi.field_104030_e
		// @07D7: iconst_m1
		// @07D8: ixor
		// @07D9: if_icmpeq @07E0
		// @07DC: goto @082D
		// @07DF: athrow
		// @07E0: bipush -30 (0xE2)
		// @07E2: aload_0
		// @07E3: bipush -4 (0xFC)
		// @07E5: iconst_0
		// @07E6: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @07E9: iadd
		// @07EA: istore #5
		// @07EC: bipush 30 (0x1E)
		// @07EE: aload_0
		// @07EF: bipush -4 (0xFC)
		// @07F1: getstatic int[][] game.C_100012_fh.field_100515_K
		// @07F4: aload_0
		// @07F5: getfield int game.C_100034_gi.field_104030_e
		// @07F8: aaload
		// @07F9: arraylength
		// @07FA: iconst_5
		// @07FB: isub
		// @07FC: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @07FF: iadd
		// @0800: aload_0
		// @0801: getstatic int[][] game.C_100012_fh.field_100515_K
		// @0804: aload_0
		// @0805: getfield int game.C_100034_gi.field_104030_e
		// @0808: aaload
		// @0809: arraylength
		// @080A: bipush -5 (0xFB)
		// @080C: iadd
		// @080D: sipush -22631 (0xA799)
		// @0810: invokespecial game.C_100034_gi.func_103985_b(int, int)int
		// @0813: ineg
		// @0814: isub
		// @0815: istore #6
		// @0817: sipush 170 (0x00AA)
		// @081A: iload #5
		// @081C: bipush -22 (0xEA)
		// @081E: sipush 300 (0x012C)
		// @0821: getstatic game.C_100037_wb[] game.C_100068_vc.field_104344_b
		// @0824: iload #5
		// @0826: ineg
		// @0827: iload #6
		// @0829: iadd
		// @082A: invokestatic game.C_100157_db.func_103554_a(int, int, int, int, game.C_100037_wb[], int)void
		// @082D: aconst_null
		// @082E: aload_2
		// @082F: if_acmpeq @0856
		// @0832: getstatic game.C_100182_cc game.C_100227_af.field_106170_a
		// @0835: aload_2
		// @0836: iconst_0
		// @0837: invokestatic game.C_100096_un.func_104560_a(java.lang.String, boolean)java.lang.String
		// @083A: sipush 320 (0x0140)
		// @083D: getstatic game.C_100182_cc game.C_100227_af.field_106170_a
		// @0840: getfield int game.C_100182_cc.field_101772_Q
		// @0843: iconst_2
		// @0844: idiv
		// @0845: bipush 18 (0x12)
		// @0847: iadd
		// @0848: aload_0
		// @0849: getfield int game.C_100034_gi.field_104037_k
		// @084C: isub
		// @084D: iconst_0
		// @084E: iconst_m1
		// @084F: invokevirtual game.C_100182_cc.func_101744_b(java.lang.String, int, int, int, int)void
		// @0852: goto @0856
		// @0855: athrow
		// @0856: iconst_0
		// @0857: istore #5
		// @0859: aload_0
		// @085A: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @085D: getfield int game.C_100333_ij.field_107344_g
		// @0860: iconst_m1
		// @0861: ixor
		// @0862: iload #5
		// @0864: iconst_m1
		// @0865: ixor
		// @0866: if_icmpge @08D5
		// @0869: aload_0
		// @086A: iload #5
		// @086C: bipush -117 (0x8B)
		// @086E: invokespecial game.C_100034_gi.func_104003_a(int, byte)boolean
		// @0871: iload #19
		// @0873: ifne @08DD
		// @0876: ifeq @08CD
		// @0879: goto @087D
		// @087C: athrow
		// @087D: aload_0
		// @087E: bipush -124 (0x84)
		// @0880: iload #5
		// @0882: invokespecial game.C_100034_gi.func_104011_b(byte, int)int
		// @0885: iflt @08AF
		// @0888: goto @088C
		// @088B: athrow
		// @088C: aload_0
		// @088D: bipush 97 (0x61)
		// @088F: iload #5
		// @0891: iload #5
		// @0893: aload_0
		// @0894: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0897: getfield int game.C_100333_ij.field_107347_b
		// @089A: if_icmpne @08A6
		// @089D: goto @08A1
		// @08A0: athrow
		// @08A1: iconst_1
		// @08A2: goto @08A7
		// @08A5: athrow
		// @08A6: iconst_0
		// @08A7: invokespecial game.C_100034_gi.func_104001_a(byte, int, boolean)void
		// @08AA: iload #19
		// @08AC: ifeq @08CD
		// @08AF: aload_0
		// @08B0: bipush -121 (0x87)
		// @08B2: aload_0
		// @08B3: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @08B6: getfield int game.C_100333_ij.field_107347_b
		// @08B9: iload #5
		// @08BB: if_icmpne @08C7
		// @08BE: goto @08C2
		// @08C1: athrow
		// @08C2: iconst_1
		// @08C3: goto @08C8
		// @08C6: athrow
		// @08C7: iconst_0
		// @08C8: iload #5
		// @08CA: invokespecial game.C_100034_gi.func_103980_a(int, boolean, int)void
		// @08CD: iinc #5 +1
		// @08D0: iload #19
		// @08D2: ifeq @0859
		// @08D5: aload_0
		// @08D6: getfield int game.C_100034_gi.field_104030_e
		// @08D9: istore #5
		// @08DB: bipush -6 (0xFA)
		// @08DD: iload #5
		// @08DF: iconst_m1
		// @08E0: ixor
		// @08E1: if_icmpne @08ED
		// @08E4: iload #19
		// @08E6: ifeq @09C0
		// @08E9: goto @08ED
		// @08EC: athrow
		// @08ED: bipush -7 (0xF9)
		// @08EF: iload #5
		// @08F1: iconst_m1
		// @08F2: ixor
		// @08F3: if_icmpne @0903
		// @08F6: goto @08FA
		// @08F9: athrow
		// @08FA: iload #19
		// @08FC: ifeq @09CE
		// @08FF: goto @0903
		// @0902: athrow
		// @0903: iload #5
		// @0905: bipush 7 (0x07)
		// @0907: if_icmpeq @09DE
		// @090A: goto @090E
		// @090D: athrow
		// @090E: bipush 8 (0x08)
		// @0910: iload #5
		// @0912: if_icmpeq @09ED
		// @0915: goto @0919
		// @0918: athrow
		// @0919: bipush -10 (0xF6)
		// @091B: iload #5
		// @091D: iconst_m1
		// @091E: ixor
		// @091F: if_icmpne @092F
		// @0922: goto @0926
		// @0925: athrow
		// @0926: iload #19
		// @0928: ifeq @09FC
		// @092B: goto @092F
		// @092E: athrow
		// @092F: bipush -11 (0xF5)
		// @0931: iload #5
		// @0933: iconst_m1
		// @0934: ixor
		// @0935: if_icmpeq @0A0B
		// @0938: goto @093C
		// @093B: athrow
		// @093C: bipush -14 (0xF2)
		// @093E: iload #5
		// @0940: iconst_m1
		// @0941: ixor
		// @0942: if_icmpne @0952
		// @0945: goto @0949
		// @0948: athrow
		// @0949: iload #19
		// @094B: ifeq @0E2C
		// @094E: goto @0952
		// @0951: athrow
		// @0952: bipush 14 (0x0E)
		// @0954: iload #5
		// @0956: if_icmpne @0966
		// @0959: goto @095D
		// @095C: athrow
		// @095D: iload #19
		// @095F: ifeq @0A1B
		// @0962: goto @0966
		// @0965: athrow
		// @0966: iload #5
		// @0968: iconst_m1
		// @0969: ixor
		// @096A: bipush -12 (0xF4)
		// @096C: if_icmpeq @0A6B
		// @096F: goto @0973
		// @0972: athrow
		// @0973: bipush 16 (0x10)
		// @0975: iload #5
		// @0977: if_icmpne @0987
		// @097A: goto @097E
		// @097D: athrow
		// @097E: iload #19
		// @0980: ifeq @0A8B
		// @0983: goto @0987
		// @0986: athrow
		// @0987: iload #5
		// @0989: iconst_m1
		// @098A: ixor
		// @098B: bipush -18 (0xEE)
		// @098D: if_icmpeq @0E2C
		// @0990: goto @0994
		// @0993: athrow
		// @0994: bipush 18 (0x12)
		// @0996: iload #5
		// @0998: if_icmpeq @0A9A
		// @099B: goto @099F
		// @099E: athrow
		// @099F: bipush 19 (0x13)
		// @09A1: iload #5
		// @09A3: if_icmpeq @0AA9
		// @09A6: goto @09AA
		// @09A9: athrow
		// @09AA: bipush -21 (0xEB)
		// @09AC: iload #5
		// @09AE: iconst_m1
		// @09AF: ixor
		// @09B0: if_icmpne @0E2C
		// @09B3: goto @09B7
		// @09B6: athrow
		// @09B7: iload #19
		// @09B9: ifeq @0E26
		// @09BC: goto @09C0
		// @09BF: athrow
		// @09C0: aload_0
		// @09C1: iconst_1
		// @09C2: invokespecial game.C_100034_gi.func_103988_e(boolean)void
		// @09C5: iload #19
		// @09C7: ifeq @0E2C
		// @09CA: goto @09CE
		// @09CD: athrow
		// @09CE: aload_0
		// @09CF: sipush 20834 (0x5162)
		// @09D2: invokespecial game.C_100034_gi.func_103981_j(int)void
		// @09D5: iload #19
		// @09D7: ifeq @0E2C
		// @09DA: goto @09DE
		// @09DD: athrow
		// @09DE: aload_0
		// @09DF: bipush -126 (0x82)
		// @09E1: invokespecial game.C_100034_gi.func_103998_b(int)void
		// @09E4: iload #19
		// @09E6: ifeq @0E2C
		// @09E9: goto @09ED
		// @09EC: athrow
		// @09ED: aload_0
		// @09EE: iconst_0
		// @09EF: iconst_0
		// @09F0: invokespecial game.C_100034_gi.func_104015_b(boolean, int)void
		// @09F3: iload #19
		// @09F5: ifeq @0E2C
		// @09F8: goto @09FC
		// @09FB: athrow
		// @09FC: aload_0
		// @09FD: iconst_1
		// @09FE: iconst_0
		// @09FF: invokespecial game.C_100034_gi.func_104015_b(boolean, int)void
		// @0A02: iload #19
		// @0A04: ifeq @0E2C
		// @0A07: goto @0A0B
		// @0A0A: athrow
		// @0A0B: aload_0
		// @0A0C: sipush 12601 (0x3139)
		// @0A0F: invokespecial game.C_100034_gi.func_104018_g(int)void
		// @0A12: iload #19
		// @0A14: ifeq @0E2C
		// @0A17: goto @0A1B
		// @0A1A: athrow
		// @0A1B: iconst_1
		// @0A1C: invokestatic game.C_100216_aj.func_104445_d(int)void
		// @0A1F: goto @0E2C
		// @0A22: astore #5
		// @0A24: getstatic int[] game.C_100005_fk.field_103605_u
		// @0A27: bipush 95 (0x5F)
		// @0A29: getstatic int[] game.C_100301_kb.field_107089_g
		// @0A2C: invokestatic game.C_100157_db.func_103546_a(int[], byte, int[])game.C_100327_ib
		// @0A2F: putstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0A32: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0A35: getstatic int[] game.C_100301_kb.field_107089_g
		// @0A38: bipush -125 (0x83)
		// @0A3A: invokestatic game.C_100260_mc.func_102219_a(game.C_100327_ib, int[], byte)int[]
		// @0A3D: putstatic int[] game.C_100280_nf.field_101178_o
		// @0A40: bipush -33 (0xDF)
		// @0A42: invokestatic game.C_100203_ql.func_105921_a(int)void
		// @0A45: getstatic java.io.PrintStream java.lang.System.err
		// @0A48: new java.lang.StringBuilder
		// @0A4B: dup
		// @0A4C: invokespecial java.lang.StringBuilder.<init>()void
		// @0A4F: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @0A52: bipush 66 (0x42)
		// @0A54: aaload
		// @0A55: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0A58: aload #5
		// @0A5A: invokevirtual java.lang.StringBuilder.append(java.lang.Object)java.lang.StringBuilder
		// @0A5D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0A60: invokevirtual java.io.PrintStream.println(java.lang.String)void
		// @0A63: aload #5
		// @0A65: invokevirtual java.lang.RuntimeException.printStackTrace()void
		// @0A68: goto @0E2C
		// @0A6B: getstatic game.C_100317_lb game.C_100265_mh.field_106605_Q
		// @0A6E: getstatic java.lang.String game.C_100048_vi.field_104175_c
		// @0A71: bipush 40 (0x28)
		// @0A73: sipush 150 (0x0096)
		// @0A76: sipush 600 (0x0258)
		// @0A79: sipush 1000 (0x03E8)
		// @0A7C: ldc 1021128 (0xf94c8)
		// @0A7E: iconst_m1
		// @0A7F: iconst_0
		// @0A80: iconst_0
		// @0A81: iconst_0
		// @0A82: invokevirtual game.C_100317_lb.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @0A85: pop
		// @0A86: iload #19
		// @0A88: ifeq @0E2C
		// @0A8B: aload_0
		// @0A8C: bipush -89 (0xA7)
		// @0A8E: invokespecial game.C_100034_gi.func_104012_d(byte)void
		// @0A91: iload #19
		// @0A93: ifeq @0E2C
		// @0A96: goto @0A9A
		// @0A99: athrow
		// @0A9A: aload_0
		// @0A9B: bipush -22 (0xEA)
		// @0A9D: invokespecial game.C_100034_gi.func_104005_k(int)void
		// @0AA0: iload #19
		// @0AA2: ifeq @0E2C
		// @0AA5: goto @0AA9
		// @0AA8: athrow
		// @0AA9: getstatic int[][] game.C_100012_fh.field_100515_K
		// @0AAC: aload_0
		// @0AAD: getfield int game.C_100034_gi.field_104030_e
		// @0AB0: aaload
		// @0AB1: getstatic int[] game.C_100333_ij.field_107345_d
		// @0AB4: if_acmpeq @0C1B
		// @0AB7: goto @0ABB
		// @0ABA: athrow
		// @0ABB: getstatic game.C_100193_re game.C_100029_gn.field_103368_S
		// @0ABE: getstatic java.lang.String[] game.C_100333_ij.field_107349_a
		// @0AC1: iconst_0
		// @0AC2: aaload
		// @0AC3: iconst_0
		// @0AC4: invokestatic game.C_100096_un.func_104560_a(java.lang.String, boolean)java.lang.String
		// @0AC7: sipush 180 (0x00B4)
		// @0ACA: bipush 98 (0x62)
		// @0ACC: ldc 1021128 (0xf94c8)
		// @0ACE: iconst_m1
		// @0ACF: invokevirtual game.C_100193_re.func_101744_b(java.lang.String, int, int, int, int)void
		// @0AD2: getstatic game.C_100193_re game.C_100029_gn.field_103368_S
		// @0AD5: getstatic java.lang.String[] game.C_100333_ij.field_107349_a
		// @0AD8: iconst_1
		// @0AD9: aaload
		// @0ADA: iconst_0
		// @0ADB: invokestatic game.C_100096_un.func_104560_a(java.lang.String, boolean)java.lang.String
		// @0ADE: sipush 460 (0x01CC)
		// @0AE1: bipush 98 (0x62)
		// @0AE3: ldc 1021128 (0xf94c8)
		// @0AE5: iconst_m1
		// @0AE6: invokevirtual game.C_100193_re.func_101744_b(java.lang.String, int, int, int, int)void
		// @0AE9: iconst_0
		// @0AEA: istore #5
		// @0AEC: iload #5
		// @0AEE: bipush 20 (0x14)
		// @0AF0: if_icmpge @0B7C
		// @0AF3: bipush -11 (0xF5)
		// @0AF5: iload #5
		// @0AF7: iconst_m1
		// @0AF8: ixor
		// @0AF9: iload #19
		// @0AFB: ifne @0B84
		// @0AFE: if_icmplt @0B1E
		// @0B01: goto @0B05
		// @0B04: athrow
		// @0B05: iconst_m1
		// @0B06: getstatic int[] game.C_100275_na.field_103087_l
		// @0B09: iload #5
		// @0B0B: bipush 10 (0x0A)
		// @0B0D: idiv
		// @0B0E: iaload
		// @0B0F: iconst_m1
		// @0B10: ixor
		// @0B11: if_icmple @0B1E
		// @0B14: goto @0B18
		// @0B17: athrow
		// @0B18: bipush 21 (0x15)
		// @0B1A: goto @0B1F
		// @0B1D: athrow
		// @0B1E: iconst_0
		// @0B1F: istore #6
		// @0B21: bipush 74 (0x4A)
		// @0B23: istore #7
		// @0B25: bipush -4 (0xFC)
		// @0B27: aload_0
		// @0B28: bipush 122 (0x7A)
		// @0B2A: iconst_0
		// @0B2B: iload #5
		// @0B2D: iadd
		// @0B2E: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @0B31: iadd
		// @0B32: iload #7
		// @0B34: bipush 8 (0x08)
		// @0B36: aload_0
		// @0B37: iload #5
		// @0B39: iconst_0
		// @0B3A: isub
		// @0B3B: bipush 127 (0x7F)
		// @0B3D: invokespecial game.C_100034_gi.func_104002_b(int, byte)int
		// @0B40: aload_0
		// @0B41: bipush 122 (0x7A)
		// @0B43: iload #5
		// @0B45: iconst_0
		// @0B46: isub
		// @0B47: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @0B4A: ineg
		// @0B4B: iadd
		// @0B4C: iadd
		// @0B4D: iload #6
		// @0B4F: aload_0
		// @0B50: bipush -4 (0xFC)
		// @0B52: iload #5
		// @0B54: bipush 9 (0x09)
		// @0B56: iadd
		// @0B57: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @0B5A: iadd
		// @0B5B: aload_0
		// @0B5C: iload #5
		// @0B5E: bipush 9 (0x09)
		// @0B60: iadd
		// @0B61: sipush -22631 (0xA799)
		// @0B64: invokespecial game.C_100034_gi.func_103985_b(int, int)int
		// @0B67: ineg
		// @0B68: isub
		// @0B69: iconst_4
		// @0B6A: iload #7
		// @0B6C: ineg
		// @0B6D: iadd
		// @0B6E: iadd
		// @0B6F: ldc 3158064 (0x303030)
		// @0B71: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @0B74: iinc #5 +10
		// @0B77: iload #19
		// @0B79: ifeq @0AEC
		// @0B7C: getstatic int[] game.C_100275_na.field_103087_l
		// @0B7F: iconst_1
		// @0B80: iaload
		// @0B81: iconst_m1
		// @0B82: ixor
		// @0B83: iconst_m1
		// @0B84: if_icmplt @0B8A
		// @0B87: goto @0E2C
		// @0B8A: bipush 10 (0x0A)
		// @0B8C: getstatic int[] game.C_100275_na.field_103087_l
		// @0B8F: iconst_1
		// @0B90: iaload
		// @0B91: if_icmpne @0B9A
		// @0B94: ldc 1021128 (0xf94c8)
		// @0B96: goto @0B9C
		// @0B99: athrow
		// @0B9A: ldc 1656673 (0x194761)
		// @0B9C: istore #5
		// @0B9E: iconst_0
		// @0B9F: istore #6
		// @0BA1: iconst_0
		// @0BA2: istore #7
		// @0BA4: iload #7
		// @0BA6: getstatic int[] game.C_100275_na.field_103087_l
		// @0BA9: iconst_1
		// @0BAA: iaload
		// @0BAB: if_icmpge @0BCA
		// @0BAE: iload #6
		// @0BB0: getstatic int[] game.C_100164_se.field_105454_a
		// @0BB3: iload #7
		// @0BB5: iaload
		// @0BB6: iadd
		// @0BB7: istore #6
		// @0BB9: iinc #7 +1
		// @0BBC: iload #19
		// @0BBE: ifne @0C16
		// @0BC1: iload #19
		// @0BC3: ifeq @0BA4
		// @0BC6: goto @0BCA
		// @0BC9: athrow
		// @0BCA: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @0BCD: new java.lang.StringBuilder
		// @0BD0: dup
		// @0BD1: invokespecial java.lang.StringBuilder.<init>()void
		// @0BD4: getstatic java.lang.String game.C_100295_kh.field_105306_p
		// @0BD7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0BDA: iload #6
		// @0BDC: iconst_0
		// @0BDD: invokestatic game.C_100007_fm.func_103628_a(int, boolean)java.lang.String
		// @0BE0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0BE3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0BE6: aload_0
		// @0BE7: bipush 98 (0x62)
		// @0BE9: bipush 19 (0x13)
		// @0BEB: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @0BEE: aload_0
		// @0BEF: bipush 19 (0x13)
		// @0BF1: bipush 123 (0x7B)
		// @0BF3: invokespecial game.C_100034_gi.func_104002_b(int, byte)int
		// @0BF6: ineg
		// @0BF7: isub
		// @0BF8: iconst_2
		// @0BF9: idiv
		// @0BFA: aload_0
		// @0BFB: bipush -4 (0xFC)
		// @0BFD: bipush 19 (0x13)
		// @0BFF: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @0C02: aload_0
		// @0C03: bipush 19 (0x13)
		// @0C05: sipush -22631 (0xA799)
		// @0C08: invokespecial game.C_100034_gi.func_103985_b(int, int)int
		// @0C0B: ineg
		// @0C0C: isub
		// @0C0D: bipush -17 (0xEF)
		// @0C0F: isub
		// @0C10: iload #5
		// @0C12: iconst_m1
		// @0C13: invokevirtual game.C_100193_re.func_101744_b(java.lang.String, int, int, int, int)void
		// @0C16: iload #19
		// @0C18: ifeq @0E2C
		// @0C1B: iconst_3
		// @0C1C: newarray int[]
		// @0C1E: astore #5
		// @0C20: iconst_0
		// @0C21: istore #6
		// @0C23: bipush -4 (0xFC)
		// @0C25: iload #6
		// @0C27: iconst_m1
		// @0C28: ixor
		// @0C29: if_icmpge @0C75
		// @0C2C: aload #5
		// @0C2E: iload #6
		// @0C30: aload_0
		// @0C31: bipush 97 (0x61)
		// @0C33: iload #6
		// @0C35: bipush 10 (0x0A)
		// @0C37: imul
		// @0C38: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @0C3B: aload_0
		// @0C3C: bipush 10 (0x0A)
		// @0C3E: iload #6
		// @0C40: imul
		// @0C41: bipush 113 (0x71)
		// @0C43: invokespecial game.C_100034_gi.func_104002_b(int, byte)int
		// @0C46: iadd
		// @0C47: iconst_2
		// @0C48: idiv
		// @0C49: iastore
		// @0C4A: getstatic game.C_100193_re game.C_100029_gn.field_103368_S
		// @0C4D: getstatic java.lang.String[] game.C_100333_ij.field_107349_a
		// @0C50: iload #6
		// @0C52: aaload
		// @0C53: iconst_0
		// @0C54: invokestatic game.C_100096_un.func_104560_a(java.lang.String, boolean)java.lang.String
		// @0C57: aload #5
		// @0C59: iload #6
		// @0C5B: iaload
		// @0C5C: bipush 98 (0x62)
		// @0C5E: ldc 1021128 (0xf94c8)
		// @0C60: iconst_m1
		// @0C61: invokevirtual game.C_100193_re.func_101744_b(java.lang.String, int, int, int, int)void
		// @0C64: iinc #6 +1
		// @0C67: iload #19
		// @0C69: ifne @0C78
		// @0C6C: iload #19
		// @0C6E: ifeq @0C23
		// @0C71: goto @0C75
		// @0C74: athrow
		// @0C75: iconst_0
		// @0C76: istore #6
		// @0C78: iload #6
		// @0C7A: iconst_m1
		// @0C7B: ixor
		// @0C7C: bipush -31 (0xE1)
		// @0C7E: if_icmple @0D0B
		// @0C81: bipush -11 (0xF5)
		// @0C83: iload #6
		// @0C85: iconst_m1
		// @0C86: ixor
		// @0C87: iload #19
		// @0C89: ifne @0D13
		// @0C8C: goto @0C90
		// @0C8F: athrow
		// @0C90: if_icmplt @0CA7
		// @0C93: goto @0C97
		// @0C96: athrow
		// @0C97: getstatic int[] game.C_100275_na.field_103087_l
		// @0C9A: iload #6
		// @0C9C: bipush 10 (0x0A)
		// @0C9E: idiv
		// @0C9F: iaload
		// @0CA0: ifgt @0CAC
		// @0CA3: goto @0CA7
		// @0CA6: athrow
		// @0CA7: iconst_0
		// @0CA8: goto @0CAE
		// @0CAB: athrow
		// @0CAC: bipush 21 (0x15)
		// @0CAE: istore #7
		// @0CB0: bipush 74 (0x4A)
		// @0CB2: istore #8
		// @0CB4: bipush -4 (0xFC)
		// @0CB6: aload_0
		// @0CB7: bipush 89 (0x59)
		// @0CB9: iload #6
		// @0CBB: iconst_0
		// @0CBC: iadd
		// @0CBD: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @0CC0: iadd
		// @0CC1: iload #8
		// @0CC3: bipush 8 (0x08)
		// @0CC5: aload_0
		// @0CC6: iconst_0
		// @0CC7: iload #6
		// @0CC9: iadd
		// @0CCA: bipush 55 (0x37)
		// @0CCC: invokespecial game.C_100034_gi.func_104002_b(int, byte)int
		// @0CCF: iadd
		// @0CD0: aload_0
		// @0CD1: bipush 111 (0x6F)
		// @0CD3: iload #6
		// @0CD5: iconst_0
		// @0CD6: isub
		// @0CD7: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @0CDA: ineg
		// @0CDB: iadd
		// @0CDC: iconst_4
		// @0CDD: aload_0
		// @0CDE: bipush -4 (0xFC)
		// @0CE0: bipush 9 (0x09)
		// @0CE2: iload #6
		// @0CE4: iadd
		// @0CE5: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @0CE8: aload_0
		// @0CE9: bipush 9 (0x09)
		// @0CEB: iload #6
		// @0CED: iadd
		// @0CEE: sipush -22631 (0xA799)
		// @0CF1: invokespecial game.C_100034_gi.func_103985_b(int, int)int
		// @0CF4: ineg
		// @0CF5: isub
		// @0CF6: iload #8
		// @0CF8: isub
		// @0CF9: iadd
		// @0CFA: iload #7
		// @0CFC: ineg
		// @0CFD: isub
		// @0CFE: ldc 3158064 (0x303030)
		// @0D00: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @0D03: iinc #6 +10
		// @0D06: iload #19
		// @0D08: ifeq @0C78
		// @0D0B: iconst_m1
		// @0D0C: getstatic int[] game.C_100275_na.field_103087_l
		// @0D0F: iconst_1
		// @0D10: iaload
		// @0D11: iconst_m1
		// @0D12: ixor
		// @0D13: if_icmpgt @0D19
		// @0D16: goto @0D94
		// @0D19: getstatic int[] game.C_100275_na.field_103087_l
		// @0D1C: iconst_1
		// @0D1D: iaload
		// @0D1E: bipush 10 (0x0A)
		// @0D20: if_icmpeq @0D29
		// @0D23: ldc 1656673 (0x194761)
		// @0D25: goto @0D2B
		// @0D28: athrow
		// @0D29: ldc 1021128 (0xf94c8)
		// @0D2B: istore #6
		// @0D2D: iconst_0
		// @0D2E: istore #7
		// @0D30: iconst_0
		// @0D31: istore #8
		// @0D33: getstatic int[] game.C_100275_na.field_103087_l
		// @0D36: iconst_1
		// @0D37: iaload
		// @0D38: iload #8
		// @0D3A: if_icmple @0D59
		// @0D3D: iload #7
		// @0D3F: getstatic int[] game.C_100164_se.field_105454_a
		// @0D42: iload #8
		// @0D44: iaload
		// @0D45: iadd
		// @0D46: istore #7
		// @0D48: iinc #8 +1
		// @0D4B: iload #19
		// @0D4D: ifne @0D94
		// @0D50: iload #19
		// @0D52: ifeq @0D33
		// @0D55: goto @0D59
		// @0D58: athrow
		// @0D59: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @0D5C: new java.lang.StringBuilder
		// @0D5F: dup
		// @0D60: invokespecial java.lang.StringBuilder.<init>()void
		// @0D63: getstatic java.lang.String game.C_100295_kh.field_105306_p
		// @0D66: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D69: iload #7
		// @0D6B: iconst_0
		// @0D6C: invokestatic game.C_100007_fm.func_103628_a(int, boolean)java.lang.String
		// @0D6F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D72: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0D75: aload #5
		// @0D77: iconst_1
		// @0D78: iaload
		// @0D79: aload_0
		// @0D7A: bipush -4 (0xFC)
		// @0D7C: bipush 19 (0x13)
		// @0D7E: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @0D81: aload_0
		// @0D82: bipush 19 (0x13)
		// @0D84: sipush -22631 (0xA799)
		// @0D87: invokespecial game.C_100034_gi.func_103985_b(int, int)int
		// @0D8A: bipush -17 (0xEF)
		// @0D8C: isub
		// @0D8D: iadd
		// @0D8E: iload #6
		// @0D90: iconst_m1
		// @0D91: invokevirtual game.C_100193_re.func_101744_b(java.lang.String, int, int, int, int)void
		// @0D94: getstatic int[] game.C_100275_na.field_103087_l
		// @0D97: iconst_2
		// @0D98: iaload
		// @0D99: iconst_m1
		// @0D9A: ixor
		// @0D9B: iconst_m1
		// @0D9C: if_icmplt @0DA3
		// @0D9F: goto @0E23
		// @0DA2: athrow
		// @0DA3: getstatic int[] game.C_100275_na.field_103087_l
		// @0DA6: iconst_2
		// @0DA7: iaload
		// @0DA8: iconst_m1
		// @0DA9: ixor
		// @0DAA: bipush -11 (0xF5)
		// @0DAC: if_icmpeq @0DB5
		// @0DAF: ldc 1656673 (0x194761)
		// @0DB1: goto @0DB7
		// @0DB4: athrow
		// @0DB5: ldc 1021128 (0xf94c8)
		// @0DB7: istore #6
		// @0DB9: iconst_0
		// @0DBA: istore #7
		// @0DBC: iconst_0
		// @0DBD: istore #8
		// @0DBF: iload #8
		// @0DC1: getstatic int[] game.C_100275_na.field_103087_l
		// @0DC4: iconst_2
		// @0DC5: iaload
		// @0DC6: if_icmpge @0DE8
		// @0DC9: iload #7
		// @0DCB: getstatic int[] game.C_100164_se.field_105454_a
		// @0DCE: bipush 10 (0x0A)
		// @0DD0: iload #8
		// @0DD2: iadd
		// @0DD3: iaload
		// @0DD4: iadd
		// @0DD5: istore #7
		// @0DD7: iinc #8 +1
		// @0DDA: iload #19
		// @0DDC: ifne @0E23
		// @0DDF: iload #19
		// @0DE1: ifeq @0DBF
		// @0DE4: goto @0DE8
		// @0DE7: athrow
		// @0DE8: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @0DEB: new java.lang.StringBuilder
		// @0DEE: dup
		// @0DEF: invokespecial java.lang.StringBuilder.<init>()void
		// @0DF2: getstatic java.lang.String game.C_100295_kh.field_105306_p
		// @0DF5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0DF8: iload #7
		// @0DFA: iconst_0
		// @0DFB: invokestatic game.C_100007_fm.func_103628_a(int, boolean)java.lang.String
		// @0DFE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0E01: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0E04: aload #5
		// @0E06: iconst_2
		// @0E07: iaload
		// @0E08: bipush 17 (0x11)
		// @0E0A: aload_0
		// @0E0B: bipush -4 (0xFC)
		// @0E0D: bipush 29 (0x1D)
		// @0E0F: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @0E12: aload_0
		// @0E13: bipush 29 (0x1D)
		// @0E15: sipush -22631 (0xA799)
		// @0E18: invokespecial game.C_100034_gi.func_103985_b(int, int)int
		// @0E1B: iadd
		// @0E1C: iadd
		// @0E1D: iload #6
		// @0E1F: iconst_m1
		// @0E20: invokevirtual game.C_100193_re.func_101744_b(java.lang.String, int, int, int, int)void
		// @0E23: goto @0E2C
		// @0E26: aload_0
		// @0E27: bipush 125 (0x7D)
		// @0E29: invokespecial game.C_100034_gi.func_103991_b(byte)void
		// @0E2C: bipush 14 (0x0E)
		// @0E2E: aload_0
		// @0E2F: getfield int game.C_100034_gi.field_104030_e
		// @0E32: if_icmpeq @0E3D
		// @0E35: iconst_m1
		// @0E36: putstatic int game.C_100075_uj.field_100647_n
		// @0E39: goto @0E3D
		// @0E3C: athrow
		// @0E3D: iconst_0
		// @0E3E: getstatic int game.C_100075_uj.field_100647_n
		// @0E41: if_icmpgt @0F3D
		// @0E44: iload #4
		// @0E46: ifne @0F3D
		// @0E49: goto @0E4D
		// @0E4C: athrow
		// @0E4D: getstatic java.lang.String game.C_100010_ff.field_103701_h
		// @0E50: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @0E53: getstatic game.C_100037_wb[] game.C_100058_dg.field_101562_E
		// @0E56: iconst_1
		// @0E57: aaload
		// @0E58: putstatic game.C_100037_wb game.C_100144_bm.field_102094_ac
		// @0E5B: aconst_null
		// @0E5C: astore #5
		// @0E5E: iconst_0
		// @0E5F: sipush 128 (0x0080)
		// @0E62: getstatic int game.C_100075_uj.field_100647_n
		// @0E65: iand
		// @0E66: if_icmpeq @0E78
		// @0E69: getstatic java.lang.String[] game.C_100176_ci.field_105623_e
		// @0E6C: bipush -128 (0x80)
		// @0E6E: getstatic int game.C_100075_uj.field_100647_n
		// @0E71: iadd
		// @0E72: aaload
		// @0E73: astore #5
		// @0E75: goto @0E91
		// @0E78: bipush 34 (0x22)
		// @0E7A: getstatic int game.C_100075_uj.field_100647_n
		// @0E7D: if_icmpne @0E88
		// @0E80: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @0E83: bipush 71 (0x47)
		// @0E85: aaload
		// @0E86: astore #5
		// @0E88: getstatic java.lang.String[] game.C_100167_sj.field_100794_t
		// @0E8B: getstatic int game.C_100075_uj.field_100647_n
		// @0E8E: aaload
		// @0E8F: astore #5
		// @0E91: sipush -30945 (0x871F)
		// @0E94: iconst_3
		// @0E95: anewarray java.lang.String
		// @0E98: dup
		// @0E99: iconst_0
		// @0E9A: aload #5
		// @0E9C: aastore
		// @0E9D: dup
		// @0E9E: iconst_1
		// @0E9F: getstatic int game.C_100008_fl.field_103639_a
		// @0EA2: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @0EA5: aastore
		// @0EA6: dup
		// @0EA7: iconst_2
		// @0EA8: getstatic int game.C_100096_un.field_104563_d
		// @0EAB: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @0EAE: aastore
		// @0EAF: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @0EB2: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0EB5: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @0EB8: iconst_0
		// @0EB9: iconst_0
		// @0EBA: sipush 640 (0x0280)
		// @0EBD: sipush 480 (0x01E0)
		// @0EC0: iconst_0
		// @0EC1: sipush 128 (0x0080)
		// @0EC4: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @0EC7: getstatic game.C_100317_lb game.C_100318_hj.field_107197_e
		// @0ECA: astore #6
		// @0ECC: getstatic game.C_100037_wb game.C_100144_bm.field_102094_ac
		// @0ECF: getfield int game.C_100037_wb.field_102337_u
		// @0ED2: istore #7
		// @0ED4: aload #6
		// @0ED6: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @0ED9: sipush 284 (0x011C)
		// @0EDC: bipush 16 (0x10)
		// @0EDE: invokevirtual game.C_100112_r.func_101734_a(java.lang.String, int, int)int
		// @0EE1: istore #8
		// @0EE3: iload #8
		// @0EE5: iload #7
		// @0EE7: bipush 50 (0x32)
		// @0EE9: iadd
		// @0EEA: iadd
		// @0EEB: istore #8
		// @0EED: iload #8
		// @0EEF: ineg
		// @0EF0: sipush 480 (0x01E0)
		// @0EF3: iadd
		// @0EF4: iconst_2
		// @0EF5: idiv
		// @0EF6: istore #9
		// @0EF8: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @0EFB: sipush 300 (0x012C)
		// @0EFE: ldc 1071146 (0x10582a)
		// @0F00: getstatic java.lang.String[] game.C_100066_dl.field_101644_z
		// @0F03: sipush 170 (0x00AA)
		// @0F06: getstatic game.C_100037_wb game.C_100144_bm.field_102094_ac
		// @0F09: iload #8
		// @0F0B: iconst_m1
		// @0F0C: iconst_1
		// @0F0D: iload #9
		// @0F0F: invokestatic game.C_100138_bo.func_100397_a(java.lang.String, int, int, java.lang.String[], int, game.C_100037_wb, int, int, boolean, int)int
		// @0F12: istore #10
		// @0F14: iload #10
		// @0F16: iconst_m1
		// @0F17: ixor
		// @0F18: iconst_m1
		// @0F19: if_icmpgt @0F33
		// @0F1C: iload #10
		// @0F1E: getstatic int game.C_100067_vd.field_104324_i
		// @0F21: if_icmpeq @0F33
		// @0F24: goto @0F28
		// @0F27: athrow
		// @0F28: bipush 97 (0x61)
		// @0F2A: bipush 8 (0x08)
		// @0F2C: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @0F2F: goto @0F33
		// @0F32: athrow
		// @0F33: iload #10
		// @0F35: putstatic int game.C_100067_vd.field_104324_i
		// @0F38: iload #19
		// @0F3A: ifeq @1209
		// @0F3D: getstatic boolean game.C_100197_ra.field_100862_w
		// @0F40: ifeq @0F50
		// @0F43: goto @0F47
		// @0F46: athrow
		// @0F47: iload #4
		// @0F49: ifeq @110E
		// @0F4C: goto @0F50
		// @0F4F: athrow
		// @0F50: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @0F53: ifnull @1209
		// @0F56: goto @0F5A
		// @0F59: athrow
		// @0F5A: iload #4
		// @0F5C: ifeq @0F67
		// @0F5F: goto @0F63
		// @0F62: athrow
		// @0F63: goto @1209
		// @0F66: athrow
		// @0F67: sipush 300 (0x012C)
		// @0F6A: istore #5
		// @0F6C: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @0F6F: getstatic java.lang.String game.C_100047_vh.field_104152_b
		// @0F72: if_acmpeq @0F86
		// @0F75: getstatic java.lang.String game.C_100163_sf.field_105442_h
		// @0F78: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @0F7B: if_acmpeq @0F86
		// @0F7E: goto @0F82
		// @0F81: athrow
		// @0F82: goto @0F8B
		// @0F85: athrow
		// @0F86: sipush 330 (0x014A)
		// @0F89: istore #5
		// @0F8B: sipush 640 (0x0280)
		// @0F8E: iload #5
		// @0F90: isub
		// @0F91: iconst_2
		// @0F92: idiv
		// @0F93: istore #6
		// @0F95: iconst_0
		// @0F96: iconst_0
		// @0F97: sipush 640 (0x0280)
		// @0F9A: sipush 480 (0x01E0)
		// @0F9D: iconst_0
		// @0F9E: sipush 128 (0x0080)
		// @0FA1: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @0FA4: getstatic game.C_100317_lb game.C_100318_hj.field_107197_e
		// @0FA7: astore #7
		// @0FA9: aload #7
		// @0FAB: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @0FAE: iload #5
		// @0FB0: bipush 16 (0x10)
		// @0FB2: isub
		// @0FB3: iconst_0
		// @0FB4: invokevirtual game.C_100112_r.func_101734_a(java.lang.String, int, int)int
		// @0FB7: istore #8
		// @0FB9: iconst_0
		// @0FBA: istore #9
		// @0FBC: getstatic game.C_100037_wb game.C_100144_bm.field_102094_ac
		// @0FBF: ifnonnull @0FC6
		// @0FC2: goto @0FD1
		// @0FC5: athrow
		// @0FC6: getstatic game.C_100037_wb game.C_100144_bm.field_102094_ac
		// @0FC9: getfield int game.C_100037_wb.field_102337_u
		// @0FCC: bipush -4 (0xFC)
		// @0FCE: isub
		// @0FCF: istore #9
		// @0FD1: iload #8
		// @0FD3: iload #9
		// @0FD5: bipush 52 (0x34)
		// @0FD7: iadd
		// @0FD8: iadd
		// @0FD9: istore #8
		// @0FDB: iload #8
		// @0FDD: ineg
		// @0FDE: sipush 480 (0x01E0)
		// @0FE1: iadd
		// @0FE2: iconst_2
		// @0FE3: idiv
		// @0FE4: istore #10
		// @0FE6: getstatic java.lang.String[] game.C_100136_th.field_102616_U
		// @0FE9: astore #11
		// @0FEB: getstatic java.lang.String game.C_100047_vh.field_104152_b
		// @0FEE: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @0FF1: if_acmpeq @1001
		// @0FF4: getstatic java.lang.String game.C_100163_sf.field_105442_h
		// @0FF7: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @0FFA: if_acmpne @1004
		// @0FFD: goto @1001
		// @1000: athrow
		// @1001: aconst_null
		// @1002: astore #11
		// @1004: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @1007: iload #5
		// @1009: ldc 1071146 (0x10582a)
		// @100B: aload #11
		// @100D: iload #6
		// @100F: getstatic game.C_100037_wb game.C_100144_bm.field_102094_ac
		// @1012: iload #8
		// @1014: iconst_m1
		// @1015: iconst_1
		// @1016: iload #10
		// @1018: invokestatic game.C_100138_bo.func_100397_a(java.lang.String, int, int, java.lang.String[], int, game.C_100037_wb, int, int, boolean, int)int
		// @101B: istore #12
		// @101D: bipush 30 (0x1E)
		// @101F: istore #13
		// @1021: bipush 100 (0x64)
		// @1023: istore #14
		// @1025: sipush 640 (0x0280)
		// @1028: iload #14
		// @102A: ineg
		// @102B: iadd
		// @102C: iconst_2
		// @102D: idiv
		// @102E: istore #15
		// @1030: iload #8
		// @1032: iload #10
		// @1034: iadd
		// @1035: bipush -8 (0xF8)
		// @1037: iload #13
		// @1039: isub
		// @103A: iadd
		// @103B: istore #16
		// @103D: getstatic java.lang.String game.C_100047_vh.field_104152_b
		// @1040: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @1043: if_acmpeq @1088
		// @1046: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @1049: getstatic java.lang.String game.C_100163_sf.field_105442_h
		// @104C: if_acmpeq @1088
		// @104F: goto @1053
		// @1052: athrow
		// @1053: iconst_m1
		// @1054: iload #12
		// @1056: iconst_m1
		// @1057: ixor
		// @1058: if_icmplt @1074
		// @105B: goto @105F
		// @105E: athrow
		// @105F: getstatic boolean game.C_100209_qb.field_102690_Ib
		// @1062: ifne @1074
		// @1065: goto @1069
		// @1068: athrow
		// @1069: bipush 97 (0x61)
		// @106B: bipush 8 (0x08)
		// @106D: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @1070: goto @1074
		// @1073: athrow
		// @1074: iconst_0
		// @1075: iload #12
		// @1077: if_icmpgt @107F
		// @107A: iconst_1
		// @107B: goto @1080
		// @107E: athrow
		// @107F: iconst_0
		// @1080: putstatic boolean game.C_100209_qb.field_102690_Ib
		// @1083: iload #19
		// @1085: ifeq @1109
		// @1088: getstatic int game.C_100100_i.field_102012_Zb
		// @108B: istore #17
		// @108D: iconst_m1
		// @108E: putstatic int game.C_100100_i.field_102012_Zb
		// @1091: sipush 165 (0x00A5)
		// @1094: istore #15
		// @1096: bipush 100 (0x64)
		// @1098: istore #14
		// @109A: getstatic java.lang.String game.C_100170_cm.field_105537_g
		// @109D: iload #16
		// @109F: iload #15
		// @10A1: iload #13
		// @10A3: iload #14
		// @10A5: bipush 8 (0x08)
		// @10A7: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @10AA: istore #18
		// @10AC: iload #18
		// @10AE: ifeq @10C6
		// @10B1: getstatic boolean game.C_100209_qb.field_102690_Ib
		// @10B4: ifeq @10BF
		// @10B7: goto @10BB
		// @10BA: athrow
		// @10BB: goto @10C6
		// @10BE: athrow
		// @10BF: bipush 97 (0x61)
		// @10C1: bipush 8 (0x08)
		// @10C3: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @10C6: iload #15
		// @10C8: iload #14
		// @10CA: bipush -10 (0xF6)
		// @10CC: isub
		// @10CD: iadd
		// @10CE: istore #15
		// @10D0: iload #18
		// @10D2: putstatic boolean game.C_100209_qb.field_102690_Ib
		// @10D5: sipush 200 (0x00C8)
		// @10D8: istore #14
		// @10DA: getstatic java.lang.String game.C_100091_m.field_104519_h
		// @10DD: iload #16
		// @10DF: iload #15
		// @10E1: iload #13
		// @10E3: iload #14
		// @10E5: bipush 8 (0x08)
		// @10E7: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @10EA: istore #18
		// @10EC: iload #18
		// @10EE: ifeq @1109
		// @10F1: iconst_0
		// @10F2: putstatic int game.C_100100_i.field_102012_Zb
		// @10F5: iload #17
		// @10F7: ifeq @1109
		// @10FA: goto @10FE
		// @10FD: athrow
		// @10FE: bipush 97 (0x61)
		// @1100: bipush 8 (0x08)
		// @1102: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @1105: goto @1109
		// @1108: athrow
		// @1109: iload #19
		// @110B: ifeq @1209
		// @110E: getstatic java.lang.String game.C_100164_se.field_105448_f
		// @1111: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @1114: iconst_0
		// @1115: iconst_0
		// @1116: sipush 640 (0x0280)
		// @1119: sipush 480 (0x01E0)
		// @111C: iconst_0
		// @111D: sipush 128 (0x0080)
		// @1120: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @1123: getstatic game.C_100317_lb game.C_100318_hj.field_107197_e
		// @1126: astore #5
		// @1128: aload #5
		// @112A: getstatic java.lang.String game.C_100164_se.field_105448_f
		// @112D: sipush 424 (0x01A8)
		// @1130: iconst_0
		// @1131: invokevirtual game.C_100112_r.func_101734_a(java.lang.String, int, int)int
		// @1134: istore #6
		// @1136: iinc #6 +54
		// @1139: iload #6
		// @113B: ineg
		// @113C: sipush 480 (0x01E0)
		// @113F: iadd
		// @1140: iconst_2
		// @1141: idiv
		// @1142: istore #7
		// @1144: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @1147: sipush 440 (0x01B8)
		// @114A: ldc 1071146 (0x10582a)
		// @114C: aconst_null
		// @114D: bipush 100 (0x64)
		// @114F: aconst_null
		// @1150: iload #6
		// @1152: iconst_m1
		// @1153: iconst_1
		// @1154: iload #7
		// @1156: invokestatic game.C_100138_bo.func_100397_a(java.lang.String, int, int, java.lang.String[], int, game.C_100037_wb, int, int, boolean, int)int
		// @1159: pop
		// @115A: bipush 30 (0x1E)
		// @115C: istore #8
		// @115E: bipush 100 (0x64)
		// @1160: istore #9
		// @1162: bipush 110 (0x6E)
		// @1164: istore #10
		// @1166: iload #6
		// @1168: iload #7
		// @116A: bipush 8 (0x08)
		// @116C: isub
		// @116D: iadd
		// @116E: iload #8
		// @1170: isub
		// @1171: istore #11
		// @1173: getstatic int game.C_100100_i.field_102012_Zb
		// @1176: istore #12
		// @1178: iconst_m1
		// @1179: putstatic int game.C_100100_i.field_102012_Zb
		// @117C: getstatic java.lang.String game.C_100217_ao.field_106044_h
		// @117F: iload #11
		// @1181: iload #10
		// @1183: iload #8
		// @1185: iload #9
		// @1187: bipush 8 (0x08)
		// @1189: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @118C: ifeq @1197
		// @118F: iconst_0
		// @1190: putstatic int game.C_100100_i.field_102012_Zb
		// @1193: goto @1197
		// @1196: athrow
		// @1197: iload #10
		// @1199: iload #9
		// @119B: bipush 10 (0x0A)
		// @119D: iadd
		// @119E: iadd
		// @119F: istore #10
		// @11A1: sipush 200 (0x00C8)
		// @11A4: istore #9
		// @11A6: getstatic java.lang.String game.C_100091_m.field_104519_h
		// @11A9: iload #11
		// @11AB: iload #10
		// @11AD: iload #8
		// @11AF: iload #9
		// @11B1: bipush 8 (0x08)
		// @11B3: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @11B6: ifne @11BD
		// @11B9: goto @11C1
		// @11BC: athrow
		// @11BD: iconst_1
		// @11BE: putstatic int game.C_100100_i.field_102012_Zb
		// @11C1: iload #10
		// @11C3: bipush 10 (0x0A)
		// @11C5: iload #9
		// @11C7: iadd
		// @11C8: iadd
		// @11C9: istore #10
		// @11CB: bipush 100 (0x64)
		// @11CD: istore #9
		// @11CF: getstatic java.lang.String game.C_100246_pg.field_106400_f
		// @11D2: iload #11
		// @11D4: iload #10
		// @11D6: iload #8
		// @11D8: iload #9
		// @11DA: bipush 8 (0x08)
		// @11DC: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @11DF: ifeq @11EA
		// @11E2: iconst_2
		// @11E3: putstatic int game.C_100100_i.field_102012_Zb
		// @11E6: goto @11EA
		// @11E9: athrow
		// @11EA: iload #12
		// @11EC: getstatic int game.C_100100_i.field_102012_Zb
		// @11EF: if_icmpeq @1209
		// @11F2: getstatic int game.C_100100_i.field_102012_Zb
		// @11F5: iconst_m1
		// @11F6: ixor
		// @11F7: ifne @1202
		// @11FA: goto @11FE
		// @11FD: athrow
		// @11FE: goto @1209
		// @1201: athrow
		// @1202: bipush 97 (0x61)
		// @1204: bipush 8 (0x08)
		// @1206: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @1209: goto @122E
		// @120C: astore_2
		// @120D: aload_2
		// @120E: new java.lang.StringBuilder
		// @1211: dup
		// @1212: invokespecial java.lang.StringBuilder.<init>()void
		// @1215: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @1218: bipush 70 (0x46)
		// @121A: aaload
		// @121B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @121E: iload_1
		// @121F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1222: bipush 41 (0x29)
		// @1224: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1227: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @122A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @122D: athrow
		// @122E: return
	}
	
	private final void func_104023_h(int arg0)
	{
		// @00: aconst_null
		// @01: getstatic game.C_100102_w game.C_100034_gi.field_104028_g
		// @04: if_acmpeq @0A
		// @07: goto @0B
		// @0A: return
		// @0B: iload_1
		// @0C: sipush 3881 (0x0F29)
		// @0F: if_icmpeq @1E
		// @12: aload_0
		// @13: aconst_null
		// @14: checkcast game.C_100333_ij
		// @17: putfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @1A: goto @1E
		// @1D: athrow
		// @1E: getstatic game.C_100102_w game.C_100034_gi.field_104028_g
		// @21: sipush 320 (0x0140)
		// @24: invokevirtual game.C_100102_w.func_104624_a(int)void
		// @27: goto @4C
		// @2A: astore_2
		// @2B: aload_2
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @36: bipush 117 (0x75)
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: iload_1
		// @3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40: bipush 41 (0x29)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @48: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4B: athrow
		// @4C: return
	}
	
	private final int func_104026_a(byte arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: aload_0
		// @006: bipush -124 (0x84)
		// @008: iload_2
		// @009: invokespecial game.C_100034_gi.func_104011_b(byte, int)int
		// @00C: istore_3
		// @00D: iload_3
		// @00E: iconst_m1
		// @00F: ixor
		// @010: iconst_m1
		// @011: if_icmpgt @01C
		// @014: iload_3
		// @015: sipush 159 (0x009F)
		// @018: imul
		// @019: iconst_1
		// @01A: iadd
		// @01B: ireturn
		// @01C: aload_0
		// @01D: getfield int game.C_100034_gi.field_104030_e
		// @020: iconst_5
		// @021: if_icmpne @04C
		// @024: bipush -25 (0xE7)
		// @026: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @029: ifne @04C
		// @02C: goto @030
		// @02F: athrow
		// @030: iload_2
		// @031: iconst_m1
		// @032: ixor
		// @033: bipush -4 (0xFC)
		// @035: if_icmple @048
		// @038: goto @03C
		// @03B: athrow
		// @03C: iload_2
		// @03D: sipush 150 (0x0096)
		// @040: imul
		// @041: bipush 100 (0x64)
		// @043: iadd
		// @044: goto @04B
		// @047: athrow
		// @048: sipush 260 (0x0104)
		// @04B: ireturn
		// @04C: aload_0
		// @04D: getfield int game.C_100034_gi.field_104030_e
		// @050: bipush 17 (0x11)
		// @052: if_icmpne @059
		// @055: sipush 195 (0x00C3)
		// @058: ireturn
		// @059: aload_0
		// @05A: bipush 112 (0x70)
		// @05C: invokespecial game.C_100034_gi.func_103976_d(int)boolean
		// @05F: ifeq @066
		// @062: sipush 195 (0x00C3)
		// @065: ireturn
		// @066: iload_1
		// @067: bipush 88 (0x58)
		// @069: if_icmpge @077
		// @06C: aconst_null
		// @06D: checkcast game.C_100133_tk
		// @070: putstatic game.C_100133_tk game.C_100034_gi.field_104034_l
		// @073: goto @077
		// @076: athrow
		// @077: bipush -7 (0xF9)
		// @079: aload_0
		// @07A: getfield int game.C_100034_gi.field_104030_e
		// @07D: iconst_m1
		// @07E: ixor
		// @07F: if_icmpne @0A9
		// @082: bipush -25 (0xE7)
		// @084: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @087: ifeq @092
		// @08A: goto @08E
		// @08D: athrow
		// @08E: goto @0A9
		// @091: athrow
		// @092: iload_2
		// @093: iconst_2
		// @094: if_icmpge @0A5
		// @097: sipush 155 (0x009B)
		// @09A: iload_2
		// @09B: sipush 170 (0x00AA)
		// @09E: imul
		// @09F: ineg
		// @0A0: isub
		// @0A1: goto @0A8
		// @0A4: athrow
		// @0A5: sipush 260 (0x0104)
		// @0A8: ireturn
		// @0A9: bipush 7 (0x07)
		// @0AB: aload_0
		// @0AC: getfield int game.C_100034_gi.field_104030_e
		// @0AF: if_icmpeq @0B6
		// @0B2: goto @0C5
		// @0B5: athrow
		// @0B6: iload_2
		// @0B7: sipush 180 (0x00B4)
		// @0BA: imul
		// @0BB: getstatic int[] game.C_100012_fh.field_100519_S
		// @0BE: aload_0
		// @0BF: getfield int game.C_100034_gi.field_104030_e
		// @0C2: iaload
		// @0C3: iadd
		// @0C4: ireturn
		// @0C5: aload_0
		// @0C6: getfield int game.C_100034_gi.field_104030_e
		// @0C9: iconst_m1
		// @0CA: ixor
		// @0CB: bipush -14 (0xF2)
		// @0CD: if_icmpne @0FC
		// @0D0: bipush -25 (0xE7)
		// @0D2: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @0D5: ifeq @0EC
		// @0D8: goto @0DC
		// @0DB: athrow
		// @0DC: sipush 320 (0x0140)
		// @0DF: sipush 800 (0x0320)
		// @0E2: iload_2
		// @0E3: imul
		// @0E4: sipush -1200 (0xFB50)
		// @0E7: iadd
		// @0E8: iconst_5
		// @0E9: idiv
		// @0EA: iadd
		// @0EB: ireturn
		// @0EC: sipush 320 (0x0140)
		// @0EF: sipush -800 (0xFCE0)
		// @0F2: iload_2
		// @0F3: sipush 800 (0x0320)
		// @0F6: imul
		// @0F7: iadd
		// @0F8: iconst_5
		// @0F9: idiv
		// @0FA: iadd
		// @0FB: ireturn
		// @0FC: bipush 14 (0x0E)
		// @0FE: aload_0
		// @0FF: getfield int game.C_100034_gi.field_104030_e
		// @102: if_icmpeq @109
		// @105: goto @131
		// @108: athrow
		// @109: bipush -25 (0xE7)
		// @10B: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @10E: ifne @121
		// @111: sipush 240 (0x00F0)
		// @114: iload_2
		// @115: sipush 800 (0x0320)
		// @118: imul
		// @119: sipush 800 (0x0320)
		// @11C: isub
		// @11D: iconst_5
		// @11E: idiv
		// @11F: iadd
		// @120: ireturn
		// @121: sipush -1200 (0xFB50)
		// @124: iload_2
		// @125: sipush 800 (0x0320)
		// @128: imul
		// @129: iadd
		// @12A: iconst_5
		// @12B: idiv
		// @12C: sipush -240 (0xFF10)
		// @12F: isub
		// @130: ireturn
		// @131: aload_0
		// @132: getfield int game.C_100034_gi.field_104030_e
		// @135: ifeq @13C
		// @138: goto @15C
		// @13B: athrow
		// @13C: getstatic int[][] game.C_100012_fh.field_100515_K
		// @13F: aload_0
		// @140: getfield int game.C_100034_gi.field_104030_e
		// @143: aaload
		// @144: iload_2
		// @145: iaload
		// @146: istore #4
		// @148: bipush -35 (0xDD)
		// @14A: iload #4
		// @14C: iconst_m1
		// @14D: ixor
		// @14E: if_icmpeq @155
		// @151: goto @158
		// @154: athrow
		// @155: bipush 19 (0x13)
		// @157: ireturn
		// @158: sipush 190 (0x00BE)
		// @15B: ireturn
		// @15C: aload_0
		// @15D: getfield int game.C_100034_gi.field_104030_e
		// @160: iconst_m1
		// @161: ixor
		// @162: bipush -16 (0xF0)
		// @164: if_icmpeq @16B
		// @167: goto @16F
		// @16A: athrow
		// @16B: sipush 350 (0x015E)
		// @16E: ireturn
		// @16F: bipush -20 (0xEC)
		// @171: aload_0
		// @172: getfield int game.C_100034_gi.field_104030_e
		// @175: iconst_m1
		// @176: ixor
		// @177: if_icmpne @1FE
		// @17A: getstatic int[][] game.C_100012_fh.field_100515_K
		// @17D: aload_0
		// @17E: getfield int game.C_100034_gi.field_104030_e
		// @181: aaload
		// @182: getstatic int[] game.C_100333_ij.field_107345_d
		// @185: if_acmpne @1D6
		// @188: goto @18C
		// @18B: athrow
		// @18C: iconst_0
		// @18D: iload_2
		// @18E: if_icmpgt @1A4
		// @191: goto @195
		// @194: athrow
		// @195: iload_2
		// @196: iconst_m1
		// @197: ixor
		// @198: bipush -11 (0xF5)
		// @19A: if_icmple @1A4
		// @19D: goto @1A1
		// @1A0: athrow
		// @1A1: bipush 30 (0x1E)
		// @1A3: ireturn
		// @1A4: iload_2
		// @1A5: bipush 10 (0x0A)
		// @1A7: if_icmplt @1BC
		// @1AA: iload_2
		// @1AB: bipush 20 (0x14)
		// @1AD: if_icmplt @1B8
		// @1B0: goto @1B4
		// @1B3: athrow
		// @1B4: goto @1BC
		// @1B7: athrow
		// @1B8: sipush 230 (0x00E6)
		// @1BB: ireturn
		// @1BC: bipush 20 (0x14)
		// @1BE: iload_2
		// @1BF: if_icmpgt @1FE
		// @1C2: bipush -31 (0xE1)
		// @1C4: iload_2
		// @1C5: iconst_m1
		// @1C6: ixor
		// @1C7: if_icmplt @1D2
		// @1CA: goto @1CE
		// @1CD: athrow
		// @1CE: goto @1FE
		// @1D1: athrow
		// @1D2: sipush 430 (0x01AE)
		// @1D5: ireturn
		// @1D6: iconst_m1
		// @1D7: iload_2
		// @1D8: iconst_m1
		// @1D9: ixor
		// @1DA: if_icmplt @1EA
		// @1DD: bipush 10 (0x0A)
		// @1DF: iload_2
		// @1E0: if_icmple @1EA
		// @1E3: goto @1E7
		// @1E6: athrow
		// @1E7: bipush 50 (0x32)
		// @1E9: ireturn
		// @1EA: bipush 10 (0x0A)
		// @1EC: iload_2
		// @1ED: if_icmpgt @1FE
		// @1F0: iload_2
		// @1F1: bipush 20 (0x14)
		// @1F3: if_icmpge @1FE
		// @1F6: goto @1FA
		// @1F9: athrow
		// @1FA: sipush 330 (0x014A)
		// @1FD: ireturn
		// @1FE: aload_0
		// @1FF: getfield int game.C_100034_gi.field_104030_e
		// @202: bipush 20 (0x14)
		// @204: if_icmpeq @20B
		// @207: goto @257
		// @20A: athrow
		// @20B: getstatic int[][] game.C_100012_fh.field_100515_K
		// @20E: aload_0
		// @20F: getfield int game.C_100034_gi.field_104030_e
		// @212: aaload
		// @213: iload_2
		// @214: iaload
		// @215: istore #4
		// @217: bipush -26 (0xE6)
		// @219: iload #4
		// @21B: iconst_m1
		// @21C: ixor
		// @21D: if_icmpne @229
		// @220: iload #5
		// @222: ifeq @24C
		// @225: goto @229
		// @228: athrow
		// @229: bipush 26 (0x1A)
		// @22B: iload #4
		// @22D: if_icmpne @23D
		// @230: goto @234
		// @233: athrow
		// @234: iload #5
		// @236: ifeq @24F
		// @239: goto @23D
		// @23C: athrow
		// @23D: iload #4
		// @23F: bipush 39 (0x27)
		// @241: if_icmpeq @253
		// @244: goto @248
		// @247: athrow
		// @248: goto @257
		// @24B: athrow
		// @24C: bipush 40 (0x28)
		// @24E: ireturn
		// @24F: sipush 540 (0x021C)
		// @252: ireturn
		// @253: sipush 196 (0x00C4)
		// @256: ireturn
		// @257: getstatic int[] game.C_100012_fh.field_100519_S
		// @25A: aload_0
		// @25B: getfield int game.C_100034_gi.field_104030_e
		// @25E: iaload
		// @25F: ireturn
		// @260: astore_3
		// @261: aload_3
		// @262: new java.lang.StringBuilder
		// @265: dup
		// @266: invokespecial java.lang.StringBuilder.<init>()void
		// @269: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @26C: bipush 63 (0x3F)
		// @26E: aaload
		// @26F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @272: iload_1
		// @273: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @276: bipush 44 (0x2C)
		// @278: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @27B: iload_2
		// @27C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @27F: bipush 41 (0x29)
		// @281: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @284: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @287: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @28A: athrow
	}
	
	private final int func_103973_a(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: aload_0
		// @006: getfield int game.C_100034_gi.field_104030_e
		// @009: bipush 7 (0x07)
		// @00B: if_icmpne @010
		// @00E: iconst_m1
		// @00F: ireturn
		// @010: aload_0
		// @011: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @014: getfield int game.C_100333_ij.field_107347_b
		// @017: istore_2
		// @018: aload_0
		// @019: bipush -124 (0x84)
		// @01B: iload_2
		// @01C: invokespecial game.C_100034_gi.func_104011_b(byte, int)int
		// @01F: istore_3
		// @020: iload_2
		// @021: iconst_m1
		// @022: ixor
		// @023: iconst_m1
		// @024: if_icmpgt @050
		// @027: getstatic int[][] game.C_100012_fh.field_100515_K
		// @02A: aload_0
		// @02B: getfield int game.C_100034_gi.field_104030_e
		// @02E: aaload
		// @02F: arraylength
		// @030: iconst_m1
		// @031: ixor
		// @032: iload_2
		// @033: iconst_m1
		// @034: ixor
		// @035: if_icmpge @050
		// @038: goto @03C
		// @03B: athrow
		// @03C: iconst_0
		// @03D: getstatic int[][] game.C_100012_fh.field_100515_K
		// @040: aload_0
		// @041: getfield int game.C_100034_gi.field_104030_e
		// @044: aaload
		// @045: iload_2
		// @046: iaload
		// @047: iconst_m1
		// @048: ixor
		// @049: if_icmpne @09A
		// @04C: goto @050
		// @04F: athrow
		// @050: iconst_0
		// @051: istore_2
		// @052: getstatic int[][] game.C_100012_fh.field_100515_K
		// @055: aload_0
		// @056: getfield int game.C_100034_gi.field_104030_e
		// @059: aaload
		// @05A: arraylength
		// @05B: iconst_m1
		// @05C: ixor
		// @05D: iload_2
		// @05E: iconst_m1
		// @05F: ixor
		// @060: if_icmpge @086
		// @063: getstatic int[][] game.C_100012_fh.field_100515_K
		// @066: aload_0
		// @067: getfield int game.C_100034_gi.field_104030_e
		// @06A: aaload
		// @06B: iload_2
		// @06C: iaload
		// @06D: iconst_m1
		// @06E: iload #5
		// @070: ifne @090
		// @073: if_icmpne @086
		// @076: goto @07A
		// @079: athrow
		// @07A: iinc #2 +1
		// @07D: iload #5
		// @07F: ifeq @052
		// @082: goto @086
		// @085: athrow
		// @086: getstatic int[][] game.C_100012_fh.field_100515_K
		// @089: aload_0
		// @08A: getfield int game.C_100034_gi.field_104030_e
		// @08D: aaload
		// @08E: arraylength
		// @08F: iload_2
		// @090: if_icmpeq @096
		// @093: goto @098
		// @096: iconst_m1
		// @097: ireturn
		// @098: iload_2
		// @099: ireturn
		// @09A: iload_1
		// @09B: iconst_2
		// @09C: if_icmpeq @0A2
		// @09F: bipush -108 (0x94)
		// @0A1: ireturn
		// @0A2: aload_0
		// @0A3: getfield int game.C_100034_gi.field_104030_e
		// @0A6: iconst_m1
		// @0A7: ixor
		// @0A8: bipush -21 (0xEB)
		// @0AA: if_icmpne @0DC
		// @0AD: iload_2
		// @0AE: iconst_m1
		// @0AF: ixor
		// @0B0: iconst_m1
		// @0B1: if_icmpgt @0C3
		// @0B4: goto @0B8
		// @0B7: athrow
		// @0B8: iconst_2
		// @0B9: iload_2
		// @0BA: if_icmple @0C3
		// @0BD: goto @0C1
		// @0C0: athrow
		// @0C1: iconst_2
		// @0C2: ireturn
		// @0C3: iconst_m1
		// @0C4: iload_3
		// @0C5: iconst_m1
		// @0C6: ixor
		// @0C7: if_icmplt @0DC
		// @0CA: aload_0
		// @0CB: iconst_0
		// @0CC: bipush -4 (0xFC)
		// @0CE: invokespecial game.C_100034_gi.func_103977_a(int, int)boolean
		// @0D1: ifeq @0DA
		// @0D4: goto @0D8
		// @0D7: athrow
		// @0D8: iconst_0
		// @0D9: ireturn
		// @0DA: iconst_1
		// @0DB: ireturn
		// @0DC: iconst_m1
		// @0DD: aload_0
		// @0DE: getfield int game.C_100034_gi.field_104030_e
		// @0E1: iconst_m1
		// @0E2: ixor
		// @0E3: if_icmpne @125
		// @0E6: bipush -35 (0xDD)
		// @0E8: getstatic int[][] game.C_100012_fh.field_100515_K
		// @0EB: aload_0
		// @0EC: getfield int game.C_100034_gi.field_104030_e
		// @0EF: aaload
		// @0F0: iload_2
		// @0F1: iaload
		// @0F2: iconst_m1
		// @0F3: ixor
		// @0F4: if_icmpne @0FD
		// @0F7: goto @0FB
		// @0FA: athrow
		// @0FB: iload_2
		// @0FC: ireturn
		// @0FD: getstatic int[][] game.C_100012_fh.field_100515_K
		// @100: aload_0
		// @101: getfield int game.C_100034_gi.field_104030_e
		// @104: aaload
		// @105: iload_2
		// @106: iaload
		// @107: bipush 19 (0x13)
		// @109: if_icmpeq @11F
		// @10C: getstatic int[][] game.C_100012_fh.field_100515_K
		// @10F: aload_0
		// @110: getfield int game.C_100034_gi.field_104030_e
		// @113: aaload
		// @114: arraylength
		// @115: iconst_1
		// @116: iload_2
		// @117: iadd
		// @118: if_icmpgt @121
		// @11B: goto @11F
		// @11E: athrow
		// @11F: iconst_0
		// @120: ireturn
		// @121: iload_2
		// @122: iconst_m1
		// @123: isub
		// @124: ireturn
		// @125: bipush 17 (0x11)
		// @127: aload_0
		// @128: getfield int game.C_100034_gi.field_104030_e
		// @12B: if_icmpeq @132
		// @12E: goto @168
		// @131: athrow
		// @132: bipush -5 (0xFB)
		// @134: getstatic int[][] game.C_100012_fh.field_100515_K
		// @137: aload_0
		// @138: getfield int game.C_100034_gi.field_104030_e
		// @13B: aaload
		// @13C: arraylength
		// @13D: iadd
		// @13E: iload_2
		// @13F: if_icmpeq @146
		// @142: goto @152
		// @145: athrow
		// @146: iconst_m1
		// @147: getstatic int[][] game.C_100012_fh.field_100515_K
		// @14A: aload_0
		// @14B: getfield int game.C_100034_gi.field_104030_e
		// @14E: aaload
		// @14F: arraylength
		// @150: iadd
		// @151: ireturn
		// @152: iload_2
		// @153: bipush -5 (0xFB)
		// @155: getstatic int[][] game.C_100012_fh.field_100515_K
		// @158: aload_0
		// @159: getfield int game.C_100034_gi.field_104030_e
		// @15C: aaload
		// @15D: arraylength
		// @15E: iadd
		// @15F: if_icmpge @166
		// @162: iconst_1
		// @163: iload_2
		// @164: iadd
		// @165: ireturn
		// @166: iconst_0
		// @167: ireturn
		// @168: aload_0
		// @169: getfield int game.C_100034_gi.field_104030_e
		// @16C: iconst_m1
		// @16D: ixor
		// @16E: bipush -6 (0xFA)
		// @170: if_icmpne @1A1
		// @173: iload_3
		// @174: iconst_m1
		// @175: ixor
		// @176: ifne @1A1
		// @179: goto @17D
		// @17C: athrow
		// @17D: iconst_m1
		// @17E: iload_2
		// @17F: iconst_m1
		// @180: ixor
		// @181: if_icmpeq @18C
		// @184: goto @188
		// @187: athrow
		// @188: goto @18E
		// @18B: athrow
		// @18C: iconst_3
		// @18D: ireturn
		// @18E: iconst_1
		// @18F: iload_2
		// @190: if_icmpeq @197
		// @193: goto @199
		// @196: athrow
		// @197: iconst_4
		// @198: ireturn
		// @199: iconst_2
		// @19A: iload_2
		// @19B: if_icmpne @1A1
		// @19E: bipush 6 (0x06)
		// @1A0: ireturn
		// @1A1: bipush -7 (0xF9)
		// @1A3: aload_0
		// @1A4: getfield int game.C_100034_gi.field_104030_e
		// @1A7: iconst_m1
		// @1A8: ixor
		// @1A9: if_icmpne @1CE
		// @1AC: iload_3
		// @1AD: iconst_m1
		// @1AE: ixor
		// @1AF: ifeq @1BA
		// @1B2: goto @1B6
		// @1B5: athrow
		// @1B6: goto @1CE
		// @1B9: athrow
		// @1BA: iload_2
		// @1BB: ifeq @1C2
		// @1BE: goto @1C4
		// @1C1: athrow
		// @1C2: iconst_2
		// @1C3: ireturn
		// @1C4: iload_2
		// @1C5: iconst_m1
		// @1C6: ixor
		// @1C7: bipush -2 (0xFE)
		// @1C9: if_icmpne @1CE
		// @1CC: iconst_5
		// @1CD: ireturn
		// @1CE: bipush 19 (0x13)
		// @1D0: aload_0
		// @1D1: getfield int game.C_100034_gi.field_104030_e
		// @1D4: if_icmpeq @1DB
		// @1D7: goto @212
		// @1DA: athrow
		// @1DB: iconst_0
		// @1DC: iload_3
		// @1DD: if_icmpgt @1E2
		// @1E0: iconst_0
		// @1E1: ireturn
		// @1E2: getstatic int[][] game.C_100012_fh.field_100515_K
		// @1E5: aload_0
		// @1E6: getfield int game.C_100034_gi.field_104030_e
		// @1E9: aaload
		// @1EA: getstatic int[] game.C_100333_ij.field_107345_d
		// @1ED: if_acmpne @1F6
		// @1F0: bipush 30 (0x1E)
		// @1F2: goto @1F8
		// @1F5: athrow
		// @1F6: bipush 20 (0x14)
		// @1F8: istore #4
		// @1FA: iload_2
		// @1FB: iconst_m1
		// @1FC: ixor
		// @1FD: iconst_m1
		// @1FE: iload #4
		// @200: iadd
		// @201: iconst_m1
		// @202: ixor
		// @203: if_icmpne @212
		// @206: getstatic int[][] game.C_100012_fh.field_100515_K
		// @209: aload_0
		// @20A: getfield int game.C_100034_gi.field_104030_e
		// @20D: aaload
		// @20E: arraylength
		// @20F: iconst_1
		// @210: isub
		// @211: ireturn
		// @212: iconst_m1
		// @213: ireturn
		// @214: astore_2
		// @215: aload_2
		// @216: new java.lang.StringBuilder
		// @219: dup
		// @21A: invokespecial java.lang.StringBuilder.<init>()void
		// @21D: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @220: bipush 109 (0x6D)
		// @222: aaload
		// @223: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @226: iload_1
		// @227: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @22A: bipush 41 (0x29)
		// @22C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @22F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @232: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @235: athrow
	}
	
	private final void func_103991_b(byte arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #30
		// @005: aload_0
		// @006: bipush -4 (0xFC)
		// @008: iconst_0
		// @009: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @00C: istore_2
		// @00D: aload_0
		// @00E: bipush 112 (0x70)
		// @010: iconst_0
		// @011: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @014: istore_3
		// @015: aload_0
		// @016: iconst_1
		// @017: bipush 76 (0x4C)
		// @019: invokespecial game.C_100034_gi.func_104002_b(int, byte)int
		// @01C: istore #4
		// @01E: iinc #2 +248
		// @021: aload_0
		// @022: bipush -4 (0xFC)
		// @024: iconst_2
		// @025: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @028: aload_0
		// @029: iconst_2
		// @02A: sipush -22631 (0xA799)
		// @02D: invokespecial game.C_100034_gi.func_103985_b(int, int)int
		// @030: ineg
		// @031: isub
		// @032: istore #5
		// @034: iinc #4 +8
		// @037: iinc #3 +248
		// @03A: iinc #5 +8
		// @03D: iload_3
		// @03E: iload_2
		// @03F: iload #4
		// @041: iload_3
		// @042: isub
		// @043: iload_2
		// @044: ineg
		// @045: iload #5
		// @047: iadd
		// @048: ldc 6316128 (0x606060)
		// @04A: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @04D: aload_0
		// @04E: iconst_0
		// @04F: bipush 103 (0x67)
		// @051: invokespecial game.C_100034_gi.func_104002_b(int, byte)int
		// @054: iconst_4
		// @055: iadd
		// @056: istore #6
		// @058: aload_0
		// @059: bipush 101 (0x65)
		// @05B: iconst_1
		// @05C: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @05F: iconst_4
		// @060: isub
		// @061: iload #6
		// @063: ineg
		// @064: iadd
		// @065: istore #7
		// @067: iconst_m1
		// @068: iload_1
		// @069: bipush 9 (0x09)
		// @06B: isub
		// @06C: bipush 58 (0x3A)
		// @06E: idiv
		// @06F: irem
		// @070: istore #8
		// @072: aload_0
		// @073: bipush -4 (0xFC)
		// @075: iconst_0
		// @076: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @079: istore #9
		// @07B: aload_0
		// @07C: iconst_0
		// @07D: sipush -22631 (0xA799)
		// @080: invokespecial game.C_100034_gi.func_103985_b(int, int)int
		// @083: istore #10
		// @085: ldc 1064792 (0x103f58)
		// @087: istore #11
		// @089: getstatic java.lang.String[] game.C_100289_jl.field_102904_J
		// @08C: iconst_0
		// @08D: aaload
		// @08E: astore #12
		// @090: getstatic int[] game.C_100275_na.field_103087_l
		// @093: getstatic int game.C_100194_rd.field_103072_v
		// @096: iaload
		// @097: iconst_m1
		// @098: ixor
		// @099: getstatic int game.C_100197_ra.field_100867_r
		// @09C: iconst_m1
		// @09D: ixor
		// @09E: if_icmplt @0C0
		// @0A1: aload_0
		// @0A2: getstatic int game.C_100194_rd.field_103072_v
		// @0A5: bipush -4 (0xFC)
		// @0A7: getstatic int game.C_100197_ra.field_100867_r
		// @0AA: invokespecial game.C_100034_gi.func_104007_b(int, int, int)boolean
		// @0AD: ifeq @144
		// @0B0: goto @0B4
		// @0B3: athrow
		// @0B4: getstatic java.lang.String[] game.C_100289_jl.field_102904_J
		// @0B7: iconst_3
		// @0B8: aaload
		// @0B9: astore #12
		// @0BB: iload #30
		// @0BD: ifeq @144
		// @0C0: getstatic int game.C_100194_rd.field_103072_v
		// @0C3: istore #13
		// @0C5: iconst_0
		// @0C6: iload #13
		// @0C8: if_icmpeq @0F2
		// @0CB: iload #13
		// @0CD: iconst_m1
		// @0CE: ixor
		// @0CF: bipush -2 (0xFE)
		// @0D1: if_icmpne @0E1
		// @0D4: goto @0D8
		// @0D7: athrow
		// @0D8: iload #30
		// @0DA: ifeq @0FE
		// @0DD: goto @0E1
		// @0E0: athrow
		// @0E1: bipush -3 (0xFD)
		// @0E3: iload #13
		// @0E5: iconst_m1
		// @0E6: ixor
		// @0E7: if_icmpeq @122
		// @0EA: goto @0EE
		// @0ED: athrow
		// @0EE: goto @144
		// @0F1: athrow
		// @0F2: getstatic java.lang.String[] game.C_100289_jl.field_102904_J
		// @0F5: iconst_1
		// @0F6: aaload
		// @0F7: astore #12
		// @0F9: iload #30
		// @0FB: ifeq @144
		// @0FE: sipush -30945 (0x871F)
		// @101: iconst_1
		// @102: anewarray java.lang.String
		// @105: dup
		// @106: iconst_0
		// @107: getstatic int[] game.C_100164_se.field_105454_a
		// @10A: getstatic int game.C_100197_ra.field_100867_r
		// @10D: iaload
		// @10E: iconst_0
		// @10F: invokestatic game.C_100007_fm.func_103628_a(int, boolean)java.lang.String
		// @112: aastore
		// @113: getstatic java.lang.String[] game.C_100289_jl.field_102904_J
		// @116: iconst_2
		// @117: aaload
		// @118: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @11B: astore #12
		// @11D: iload #30
		// @11F: ifeq @144
		// @122: sipush -30945 (0x871F)
		// @125: iconst_1
		// @126: anewarray java.lang.String
		// @129: dup
		// @12A: iconst_0
		// @12B: getstatic int[] game.C_100164_se.field_105454_a
		// @12E: getstatic int game.C_100197_ra.field_100867_r
		// @131: bipush -10 (0xF6)
		// @133: isub
		// @134: iaload
		// @135: iconst_0
		// @136: invokestatic game.C_100007_fm.func_103628_a(int, boolean)java.lang.String
		// @139: aastore
		// @13A: getstatic java.lang.String[] game.C_100289_jl.field_102904_J
		// @13D: iconst_2
		// @13E: aaload
		// @13F: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @142: astore #12
		// @144: sipush -30945 (0x871F)
		// @147: iconst_2
		// @148: anewarray java.lang.String
		// @14B: dup
		// @14C: iconst_0
		// @14D: iconst_1
		// @14E: getstatic int game.C_100197_ra.field_100867_r
		// @151: iadd
		// @152: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @155: aastore
		// @156: dup
		// @157: iconst_1
		// @158: aload #12
		// @15A: aastore
		// @15B: getstatic int game.C_100194_rd.field_103072_v
		// @15E: ifne @168
		// @161: getstatic java.lang.String game.C_100222_aa.field_106084_b
		// @164: goto @16B
		// @167: athrow
		// @168: getstatic java.lang.String game.C_100007_fm.field_103632_a
		// @16B: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @16E: astore #13
		// @170: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @173: aload #13
		// @175: iload #6
		// @177: iload #7
		// @179: iconst_2
		// @17A: idiv
		// @17B: iadd
		// @17C: bipush 16 (0x10)
		// @17E: iload #9
		// @180: iadd
		// @181: ldc 1021128 (0xf94c8)
		// @183: iconst_m1
		// @184: invokevirtual game.C_100193_re.func_101744_b(java.lang.String, int, int, int, int)void
		// @187: iconst_0
		// @188: getstatic int game.C_100194_rd.field_103072_v
		// @18B: if_icmpge @243
		// @18E: getstatic int game.C_100197_ra.field_100867_r
		// @191: getstatic int[] game.C_100275_na.field_103087_l
		// @194: getstatic int game.C_100194_rd.field_103072_v
		// @197: iaload
		// @198: if_icmpge @243
		// @19B: goto @19F
		// @19E: athrow
		// @19F: getstatic int[][] game.C_100306_kn.field_107131_d
		// @1A2: getstatic int game.C_100194_rd.field_103072_v
		// @1A5: aaload
		// @1A6: getstatic int game.C_100197_ra.field_100867_r
		// @1A9: iaload
		// @1AA: istore #14
		// @1AC: iload #14
		// @1AE: iconst_3
		// @1AF: imul
		// @1B0: iconst_2
		// @1B1: idiv
		// @1B2: istore #15
		// @1B4: getstatic int[] game.C_100164_se.field_105454_a
		// @1B7: getstatic int game.C_100197_ra.field_100867_r
		// @1BA: bipush -10 (0xF6)
		// @1BC: iadd
		// @1BD: getstatic int game.C_100194_rd.field_103072_v
		// @1C0: bipush 10 (0x0A)
		// @1C2: imul
		// @1C3: iadd
		// @1C4: iaload
		// @1C5: istore #16
		// @1C7: iload #16
		// @1C9: iconst_m1
		// @1CA: ixor
		// @1CB: iload #15
		// @1CD: iconst_m1
		// @1CE: ixor
		// @1CF: if_icmplt @243
		// @1D2: bipush 20 (0x14)
		// @1D4: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @1D7: aload #13
		// @1D9: invokevirtual game.C_100193_re.func_101739_b(java.lang.String)int
		// @1DC: iconst_2
		// @1DD: idiv
		// @1DE: iadd
		// @1DF: istore #17
		// @1E1: getstatic game.C_100037_wb[] game.C_100004_gb.field_103577_h
		// @1E4: iload #16
		// @1E6: iconst_m1
		// @1E7: ixor
		// @1E8: iload #14
		// @1EA: iconst_m1
		// @1EB: ixor
		// @1EC: if_icmplt @1F5
		// @1EF: bipush 8 (0x08)
		// @1F1: goto @1F7
		// @1F4: athrow
		// @1F5: bipush 25 (0x19)
		// @1F7: aaload
		// @1F8: astore #18
		// @1FA: iload #16
		// @1FC: iconst_m1
		// @1FD: ixor
		// @1FE: iload #14
		// @200: iconst_m1
		// @201: ixor
		// @202: if_icmpge @20C
		// @205: sipush 150 (0x0096)
		// @208: goto @20F
		// @20B: athrow
		// @20C: sipush 192 (0x00C0)
		// @20F: istore #19
		// @211: iload #7
		// @213: iconst_2
		// @214: idiv
		// @215: iload #6
		// @217: iadd
		// @218: istore #20
		// @21A: iload #9
		// @21C: iconst_2
		// @21D: iadd
		// @21E: istore #21
		// @220: aload #18
		// @222: iload #17
		// @224: iload #20
		// @226: iadd
		// @227: iload #21
		// @229: iload #19
		// @22B: invokevirtual game.C_100037_wb.func_102367_c(int, int, int)void
		// @22E: aload #18
		// @230: iload #17
		// @232: ineg
		// @233: iload #20
		// @235: iadd
		// @236: aload #18
		// @238: getfield int game.C_100037_wb.field_102341_y
		// @23B: isub
		// @23C: iload #21
		// @23E: iload #19
		// @240: invokevirtual game.C_100037_wb.func_102367_c(int, int, int)void
		// @243: iinc #4 +248
		// @246: iload #6
		// @248: iload #9
		// @24A: iload #7
		// @24C: iload #10
		// @24E: iload #11
		// @250: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @253: bipush 6 (0x06)
		// @255: iload #10
		// @257: iload #9
		// @259: iadd
		// @25A: iadd
		// @25B: istore_2
		// @25C: iinc #3 +8
		// @25F: bipush -8 (0xF8)
		// @261: aload_0
		// @262: bipush -4 (0xFC)
		// @264: iconst_2
		// @265: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @268: iadd
		// @269: istore #5
		// @26B: iload_3
		// @26C: iload_2
		// @26D: iload_3
		// @26E: ineg
		// @26F: iload #4
		// @271: iadd
		// @272: iload #5
		// @274: iload_2
		// @275: ineg
		// @276: iadd
		// @277: ldc 2061990 (0x1f76a6)
		// @279: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @27C: bipush 100 (0x64)
		// @27E: istore #14
		// @280: bipush 110 (0x6E)
		// @282: istore #15
		// @284: bipush 20 (0x14)
		// @286: iload_2
		// @287: iadd
		// @288: istore #16
		// @28A: iload_3
		// @28B: bipush -10 (0xF6)
		// @28D: isub
		// @28E: istore #17
		// @290: iload #17
		// @292: iload #16
		// @294: iload #14
		// @296: iload #15
		// @298: iload #11
		// @29A: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @29D: iload #17
		// @29F: iload #14
		// @2A1: ineg
		// @2A2: isub
		// @2A3: bipush 10 (0x0A)
		// @2A5: iadd
		// @2A6: istore #18
		// @2A8: iload #16
		// @2AA: bipush 10 (0x0A)
		// @2AC: isub
		// @2AD: istore #19
		// @2AF: bipush -10 (0xF6)
		// @2B1: iload #4
		// @2B3: iload #18
		// @2B5: isub
		// @2B6: iadd
		// @2B7: istore #20
		// @2B9: iload #5
		// @2BB: iload #19
		// @2BD: ineg
		// @2BE: iadd
		// @2BF: istore #21
		// @2C1: iconst_0
		// @2C2: istore #22
		// @2C4: getstatic int[] game.C_100017_wj.field_103821_j
		// @2C7: astore #23
		// @2C9: iconst_0
		// @2CA: istore #24
		// @2CC: iload #24
		// @2CE: aload #23
		// @2D0: arraylength
		// @2D1: if_icmpge @31E
		// @2D4: aload #23
		// @2D6: iload #24
		// @2D8: iaload
		// @2D9: istore #25
		// @2DB: iload #25
		// @2DD: sipush -23881 (0xA2B7)
		// @2E0: invokestatic game.C_100272_mn.func_102423_a(int, int)int
		// @2E3: istore #26
		// @2E5: iload #26
		// @2E7: iconst_m1
		// @2E8: ixor
		// @2E9: iconst_m1
		// @2EA: iload #30
		// @2EC: ifne @327
		// @2EF: if_icmpgt @316
		// @2F2: goto @2F6
		// @2F5: athrow
		// @2F6: iload #26
		// @2F8: bipush 10 (0x0A)
		// @2FA: irem
		// @2FB: iconst_m1
		// @2FC: ixor
		// @2FD: getstatic int[] game.C_100275_na.field_103087_l
		// @300: iload #26
		// @302: bipush 10 (0x0A)
		// @304: idiv
		// @305: iaload
		// @306: iconst_m1
		// @307: ixor
		// @308: if_icmple @316
		// @30B: goto @30F
		// @30E: athrow
		// @30F: iinc #22 +1
		// @312: goto @316
		// @315: athrow
		// @316: iinc #24 +1
		// @319: iload #30
		// @31B: ifeq @2CC
		// @31E: bipush -11 (0xF5)
		// @320: getstatic int[] game.C_100275_na.field_103087_l
		// @323: iconst_2
		// @324: iaload
		// @325: iconst_m1
		// @326: ixor
		// @327: if_icmpne @32D
		// @32A: iinc #22 +1
		// @32D: bipush 60 (0x3C)
		// @32F: invokestatic game.C_100121_ud.func_100707_a(byte)boolean
		// @332: ifne @339
		// @335: goto @33C
		// @338: athrow
		// @339: iinc #22 +1
		// @33C: sipush -30945 (0x871F)
		// @33F: iconst_2
		// @340: anewarray java.lang.String
		// @343: dup
		// @344: iconst_0
		// @345: getstatic java.lang.String[] game.C_100335_il.field_107373_h
		// @348: iload #22
		// @34A: aaload
		// @34B: aastore
		// @34C: dup
		// @34D: iconst_1
		// @34E: bipush 33 (0x21)
		// @350: getstatic java.lang.String[] game.C_100335_il.field_107373_h
		// @353: iload #22
		// @355: aaload
		// @356: invokestatic game.C_100067_vd.func_104308_a(byte, java.lang.String)java.lang.String
		// @359: aastore
		// @35A: getstatic java.lang.String[] game.C_100125_tm.field_100752_k
		// @35D: getstatic int game.C_100197_ra.field_100867_r
		// @360: getstatic int game.C_100194_rd.field_103072_v
		// @363: bipush 10 (0x0A)
		// @365: imul
		// @366: iadd
		// @367: aaload
		// @368: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @36B: astore #23
		// @36D: aload_0
		// @36E: getstatic int game.C_100197_ra.field_100867_r
		// @371: bipush 92 (0x5C)
		// @373: getstatic int game.C_100194_rd.field_103072_v
		// @376: invokespecial game.C_100034_gi.func_103984_a(int, int, int)int
		// @379: istore #24
		// @37B: bipush 15 (0x0F)
		// @37D: getstatic int[] game.C_100275_na.field_103087_l
		// @380: iconst_0
		// @381: iaload
		// @382: iand
		// @383: iconst_m1
		// @384: ixor
		// @385: iload #24
		// @387: iconst_m1
		// @388: ixor
		// @389: if_icmple @3F9
		// @38C: getstatic int game.C_100197_ra.field_100867_r
		// @38F: getstatic int[] game.C_100275_na.field_103087_l
		// @392: getstatic int game.C_100194_rd.field_103072_v
		// @395: iaload
		// @396: if_icmplt @3F9
		// @399: goto @39D
		// @39C: athrow
		// @39D: iload #24
		// @39F: bipush 10 (0x0A)
		// @3A1: if_icmpeq @3CC
		// @3A4: goto @3A8
		// @3A7: athrow
		// @3A8: sipush -30945 (0x871F)
		// @3AB: iconst_2
		// @3AC: anewarray java.lang.String
		// @3AF: dup
		// @3B0: iconst_0
		// @3B1: iload #24
		// @3B3: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @3B6: aastore
		// @3B7: dup
		// @3B8: iconst_1
		// @3B9: getstatic java.lang.String[] game.C_100260_mc.field_102226_Zb
		// @3BC: iconst_m1
		// @3BD: iload #24
		// @3BF: iadd
		// @3C0: aaload
		// @3C1: aastore
		// @3C2: getstatic java.lang.String game.C_100006_fj.field_103619_e
		// @3C5: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @3C8: goto @3CF
		// @3CB: athrow
		// @3CC: getstatic java.lang.String game.C_100114_q.field_100492_C
		// @3CF: astore #25
		// @3D1: new java.lang.StringBuilder
		// @3D4: dup
		// @3D5: invokespecial java.lang.StringBuilder.<init>()void
		// @3D8: aload #23
		// @3DA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3DD: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @3E0: bipush 57 (0x39)
		// @3E2: aaload
		// @3E3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E6: aload #25
		// @3E8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3EB: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @3EE: bipush 38 (0x26)
		// @3F0: aaload
		// @3F1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F7: astore #23
		// @3F9: getstatic game.C_100317_lb game.C_100318_hj.field_107197_e
		// @3FC: aload #23
		// @3FE: iload #20
		// @400: bipush 16 (0x10)
		// @402: invokevirtual game.C_100317_lb.func_101734_a(java.lang.String, int, int)int
		// @405: iload #19
		// @407: iadd
		// @408: bipush -30 (0xE2)
		// @40A: isub
		// @40B: iconst_m1
		// @40C: ixor
		// @40D: iload #5
		// @40F: iconst_m1
		// @410: ixor
		// @411: if_icmpgt @419
		// @414: iconst_1
		// @415: goto @41A
		// @418: athrow
		// @419: iconst_0
		// @41A: istore #25
		// @41C: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @41F: getstatic java.lang.String[] game.C_100260_mc.field_102226_Zb
		// @422: getstatic int game.C_100197_ra.field_100867_r
		// @425: bipush 10 (0x0A)
		// @427: getstatic int game.C_100194_rd.field_103072_v
		// @42A: imul
		// @42B: iadd
		// @42C: aaload
		// @42D: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @430: iload #18
		// @432: bipush 20 (0x14)
		// @434: iload #19
		// @436: iadd
		// @437: ldc 16777215 (0xffffff)
		// @439: iconst_m1
		// @43A: invokevirtual game.C_100193_re.func_101749_c(java.lang.String, int, int, int, int)void
		// @43D: getstatic game.C_100317_lb game.C_100318_hj.field_107197_e
		// @440: aload #23
		// @442: iload #18
		// @444: bipush 30 (0x1E)
		// @446: iload #19
		// @448: iadd
		// @449: iload #20
		// @44B: iload #21
		// @44D: ldc 1021128 (0xf94c8)
		// @44F: iconst_m1
		// @450: iconst_0
		// @451: iconst_0
		// @452: iload #25
		// @454: ifne @45D
		// @457: bipush 16 (0x10)
		// @459: goto @45F
		// @45C: athrow
		// @45D: bipush 15 (0x0F)
		// @45F: invokevirtual game.C_100317_lb.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @462: pop
		// @463: getstatic game.C_100037_wb[] game.C_100053_vn.field_102833_T
		// @466: astore #26
		// @468: getstatic int game.C_100043_vl.field_101943_Yb
		// @46B: iconst_m1
		// @46C: ixor
		// @46D: iconst_m1
		// @46E: if_icmpeq @475
		// @471: goto @47A
		// @474: athrow
		// @475: getstatic game.C_100037_wb[] game.C_100071_va.field_101667_z
		// @478: astore #26
		// @47A: bipush 8 (0x08)
		// @47C: istore #27
		// @47E: getstatic int game.C_100066_dl.field_101636_H
		// @481: iload #27
		// @483: imul
		// @484: bipush 50 (0x32)
		// @486: idiv
		// @487: aload #26
		// @489: arraylength
		// @48A: irem
		// @48B: istore #28
		// @48D: aload #26
		// @48F: iload #28
		// @491: aaload
		// @492: astore #29
		// @494: iload #16
		// @496: iload #15
		// @498: aload #29
		// @49A: getfield int game.C_100037_wb.field_102340_z
		// @49D: bipush -2 (0xFE)
		// @49F: isub
		// @4A0: isub
		// @4A1: iadd
		// @4A2: istore #16
		// @4A4: aload #26
		// @4A6: iload #28
		// @4A8: aaload
		// @4A9: iconst_2
		// @4AA: iload #17
		// @4AC: iadd
		// @4AD: iload #16
		// @4AF: invokevirtual game.C_100037_wb.func_102386_f(int, int)void
		// @4B2: goto @4D7
		// @4B5: astore_2
		// @4B6: aload_2
		// @4B7: new java.lang.StringBuilder
		// @4BA: dup
		// @4BB: invokespecial java.lang.StringBuilder.<init>()void
		// @4BE: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @4C1: bipush 56 (0x38)
		// @4C3: aaload
		// @4C4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4C7: iload_1
		// @4C8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4CB: bipush 41 (0x29)
		// @4CD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4D3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4D6: athrow
		// @4D7: return
	}
	
	private final void func_103995_f(int arg0)
	{
		// @00: getstatic game.C_100102_w game.C_100034_gi.field_104028_g
		// @03: ifnull @09
		// @06: goto @0A
		// @09: return
		// @0A: iload_1
		// @0B: bipush -40 (0xD8)
		// @0D: if_icmpeq @11
		// @10: return
		// @11: getstatic game.C_100102_w game.C_100034_gi.field_104028_g
		// @14: iload_1
		// @15: bipush 57 (0x39)
		// @17: iadd
		// @18: invokevirtual game.C_100102_w.func_104622_b(int)void
		// @1B: goto @40
		// @1E: astore_2
		// @1F: aload_2
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @2A: bipush 100 (0x64)
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: iload_1
		// @31: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34: bipush 41 (0x29)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F: athrow
		// @40: return
	}
	
	private final void func_104017_c(byte arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: getstatic int game.C_100052_eb.field_104231_b
		// @008: iconst_m1
		// @009: ixor
		// @00A: iconst_m1
		// @00B: if_icmpne @02B
		// @00E: aload_0
		// @00F: getfield int game.C_100034_gi.field_104030_e
		// @012: getstatic int game.C_100252_pn.field_105503_o
		// @015: if_icmpeq @020
		// @018: goto @01C
		// @01B: athrow
		// @01C: goto @02B
		// @01F: athrow
		// @020: aload_0
		// @021: iconst_0
		// @022: putfield int game.C_100034_gi.field_104037_k
		// @025: aload_0
		// @026: iconst_0
		// @027: putfield int game.C_100034_gi.field_104031_b
		// @02A: return
		// @02B: iconst_0
		// @02C: aload_0
		// @02D: getfield int game.C_100034_gi.field_104030_e
		// @030: if_icmpeq @05C
		// @033: iconst_m1
		// @034: getstatic int game.C_100252_pn.field_105503_o
		// @037: iconst_m1
		// @038: ixor
		// @039: if_icmpeq @051
		// @03C: goto @040
		// @03F: athrow
		// @040: getstatic int game.C_100050_vg.field_100632_k
		// @043: iconst_m1
		// @044: ixor
		// @045: iconst_m1
		// @046: if_icmpeq @051
		// @049: goto @04D
		// @04C: athrow
		// @04D: goto @05C
		// @050: athrow
		// @051: aload_0
		// @052: iconst_0
		// @053: putfield int game.C_100034_gi.field_104037_k
		// @056: aload_0
		// @057: iconst_0
		// @058: putfield int game.C_100034_gi.field_104031_b
		// @05B: return
		// @05C: aload_0
		// @05D: sipush 480 (0x01E0)
		// @060: putfield int game.C_100034_gi.field_104031_b
		// @063: aload_0
		// @064: sipush 480 (0x01E0)
		// @067: putfield int game.C_100034_gi.field_104037_k
		// @06A: iload_1
		// @06B: bipush -54 (0xCA)
		// @06D: if_icmpeq @07B
		// @070: aconst_null
		// @071: checkcast java.awt.Canvas
		// @074: putstatic java.awt.Canvas game.C_100034_gi.field_104033_a
		// @077: goto @07B
		// @07A: athrow
		// @07B: iconst_0
		// @07C: istore_2
		// @07D: bipush -21 (0xEB)
		// @07F: iconst_2
		// @080: getstatic int game.C_100052_eb.field_104231_b
		// @083: imul
		// @084: iconst_m1
		// @085: ixor
		// @086: if_icmplt @0B7
		// @089: iconst_m1
		// @08A: aload_0
		// @08B: getfield int game.C_100034_gi.field_104030_e
		// @08E: iconst_m1
		// @08F: ixor
		// @090: if_icmpeq @0AA
		// @093: goto @097
		// @096: athrow
		// @097: getstatic int game.C_100050_vg.field_100632_k
		// @09A: aload_0
		// @09B: getfield int game.C_100034_gi.field_104030_e
		// @09E: if_icmpne @0A9
		// @0A1: goto @0A5
		// @0A4: athrow
		// @0A5: goto @0AA
		// @0A8: athrow
		// @0A9: return
		// @0AA: getstatic int game.C_100052_eb.field_104231_b
		// @0AD: ineg
		// @0AE: bipush 20 (0x14)
		// @0B0: iadd
		// @0B1: istore_2
		// @0B2: iload #5
		// @0B4: ifeq @0DC
		// @0B7: iconst_m1
		// @0B8: aload_0
		// @0B9: getfield int game.C_100034_gi.field_104030_e
		// @0BC: iconst_m1
		// @0BD: ixor
		// @0BE: if_icmpeq @0D8
		// @0C1: goto @0C5
		// @0C4: athrow
		// @0C5: getstatic int game.C_100252_pn.field_105503_o
		// @0C8: iconst_m1
		// @0C9: ixor
		// @0CA: aload_0
		// @0CB: getfield int game.C_100034_gi.field_104030_e
		// @0CE: iconst_m1
		// @0CF: ixor
		// @0D0: if_icmpeq @0D8
		// @0D3: goto @0D7
		// @0D6: athrow
		// @0D7: return
		// @0D8: getstatic int game.C_100052_eb.field_104231_b
		// @0DB: istore_2
		// @0DC: iconst_0
		// @0DD: istore_3
		// @0DE: bipush -2 (0xFE)
		// @0E0: aload_0
		// @0E1: getfield int game.C_100034_gi.field_104030_e
		// @0E4: iconst_m1
		// @0E5: ixor
		// @0E6: if_icmpeq @120
		// @0E9: aload_0
		// @0EA: getfield int game.C_100034_gi.field_104030_e
		// @0ED: iconst_m1
		// @0EE: ixor
		// @0EF: bipush -3 (0xFD)
		// @0F1: if_icmpeq @120
		// @0F4: goto @0F8
		// @0F7: athrow
		// @0F8: aload_0
		// @0F9: getfield int game.C_100034_gi.field_104030_e
		// @0FC: iconst_3
		// @0FD: if_icmpeq @120
		// @100: goto @104
		// @103: athrow
		// @104: bipush -5 (0xFB)
		// @106: aload_0
		// @107: getfield int game.C_100034_gi.field_104030_e
		// @10A: iconst_m1
		// @10B: ixor
		// @10C: if_icmpeq @120
		// @10F: goto @113
		// @112: athrow
		// @113: aload_0
		// @114: sipush -21394 (0xAC6E)
		// @117: invokespecial game.C_100034_gi.func_103978_l(int)int
		// @11A: istore_3
		// @11B: iload #5
		// @11D: ifeq @124
		// @120: sipush 200 (0x00C8)
		// @123: istore_3
		// @124: bipush 50 (0x32)
		// @126: istore #4
		// @128: aload_0
		// @129: getfield int game.C_100034_gi.field_104030_e
		// @12C: ifne @137
		// @12F: getstatic game.C_100251_pm game.C_100038_wa.field_104068_d
		// @132: getfield int game.C_100251_pm.field_102340_z
		// @135: istore #4
		// @137: aload_0
		// @138: iload_2
		// @139: iload #4
		// @13B: imul
		// @13C: bipush 10 (0x0A)
		// @13E: idiv
		// @13F: putfield int game.C_100034_gi.field_104037_k
		// @142: aload_0
		// @143: getfield int game.C_100034_gi.field_104030_e
		// @146: ifne @1C1
		// @149: aload_0
		// @14A: iload #4
		// @14C: getstatic int game.C_100052_eb.field_104231_b
		// @14F: imul
		// @150: bipush 20 (0x14)
		// @152: idiv
		// @153: putfield int game.C_100034_gi.field_104037_k
		// @156: bipush -11 (0xF5)
		// @158: getstatic int game.C_100052_eb.field_104231_b
		// @15B: iconst_m1
		// @15C: ixor
		// @15D: if_icmplt @184
		// @160: goto @164
		// @163: athrow
		// @164: aload_0
		// @165: bipush -50 (0xCE)
		// @167: iload_3
		// @168: iadd
		// @169: bipush 50 (0x32)
		// @16B: getstatic int game.C_100052_eb.field_104231_b
		// @16E: imul
		// @16F: sipush -500 (0xFE0C)
		// @172: iadd
		// @173: bipush 10 (0x0A)
		// @175: idiv
		// @176: ineg
		// @177: isub
		// @178: putfield int game.C_100034_gi.field_104031_b
		// @17B: iload #5
		// @17D: ifeq @197
		// @180: goto @184
		// @183: athrow
		// @184: aload_0
		// @185: iload_3
		// @186: bipush -50 (0xCE)
		// @188: iadd
		// @189: getstatic int game.C_100052_eb.field_104231_b
		// @18C: imul
		// @18D: bipush 10 (0x0A)
		// @18F: idiv
		// @190: putfield int game.C_100034_gi.field_104031_b
		// @193: goto @197
		// @196: athrow
		// @197: getstatic int game.C_100252_pn.field_105503_o
		// @19A: iconst_m1
		// @19B: ixor
		// @19C: aload_0
		// @19D: getfield int game.C_100034_gi.field_104030_e
		// @1A0: iconst_m1
		// @1A1: ixor
		// @1A2: if_icmpne @1A9
		// @1A5: goto @1C0
		// @1A8: athrow
		// @1A9: aload_0
		// @1AA: aload_0
		// @1AB: getfield int game.C_100034_gi.field_104037_k
		// @1AE: ineg
		// @1AF: iload #4
		// @1B1: iadd
		// @1B2: putfield int game.C_100034_gi.field_104037_k
		// @1B5: aload_0
		// @1B6: iload_3
		// @1B7: aload_0
		// @1B8: getfield int game.C_100034_gi.field_104031_b
		// @1BB: ineg
		// @1BC: iadd
		// @1BD: putfield int game.C_100034_gi.field_104031_b
		// @1C0: return
		// @1C1: aload_0
		// @1C2: getfield int game.C_100034_gi.field_104030_e
		// @1C5: ifne @261
		// @1C8: bipush -21 (0xEB)
		// @1CA: getstatic int game.C_100052_eb.field_104231_b
		// @1CD: iconst_2
		// @1CE: imul
		// @1CF: iconst_m1
		// @1D0: ixor
		// @1D1: if_icmplt @1EA
		// @1D4: goto @1D8
		// @1D7: athrow
		// @1D8: aload_0
		// @1D9: getfield int game.C_100034_gi.field_104030_e
		// @1DC: iconst_m1
		// @1DD: ixor
		// @1DE: getstatic int game.C_100050_vg.field_100632_k
		// @1E1: iconst_m1
		// @1E2: ixor
		// @1E3: if_icmpeq @226
		// @1E6: goto @1EA
		// @1E9: athrow
		// @1EA: bipush 9 (0x09)
		// @1EC: iload_2
		// @1ED: if_icmple @20A
		// @1F0: goto @1F4
		// @1F3: athrow
		// @1F4: aload_0
		// @1F5: iload_3
		// @1F6: bipush 60 (0x3C)
		// @1F8: isub
		// @1F9: iload_2
		// @1FA: imul
		// @1FB: bipush 9 (0x09)
		// @1FD: idiv
		// @1FE: putfield int game.C_100034_gi.field_104031_b
		// @201: iload #5
		// @203: ifeq @26A
		// @206: goto @20A
		// @209: athrow
		// @20A: aload_0
		// @20B: sipush -333 (0xFEB3)
		// @20E: bipush 37 (0x25)
		// @210: iload_2
		// @211: imul
		// @212: iadd
		// @213: iconst_1
		// @214: idiv
		// @215: iload_3
		// @216: iadd
		// @217: bipush 60 (0x3C)
		// @219: isub
		// @21A: putfield int game.C_100034_gi.field_104031_b
		// @21D: iload #5
		// @21F: ifeq @26A
		// @222: goto @226
		// @225: athrow
		// @226: iconst_1
		// @227: iload_2
		// @228: if_icmple @242
		// @22B: goto @22F
		// @22E: athrow
		// @22F: aload_0
		// @230: iload_2
		// @231: bipush 60 (0x3C)
		// @233: imul
		// @234: iconst_1
		// @235: idiv
		// @236: putfield int game.C_100034_gi.field_104031_b
		// @239: iload #5
		// @23B: ifeq @26A
		// @23E: goto @242
		// @241: athrow
		// @242: aload_0
		// @243: iload_3
		// @244: bipush 60 (0x3C)
		// @246: isub
		// @247: bipush -10 (0xF6)
		// @249: bipush 9 (0x09)
		// @24B: iload_2
		// @24C: iadd
		// @24D: iadd
		// @24E: imul
		// @24F: bipush 9 (0x09)
		// @251: idiv
		// @252: bipush 60 (0x3C)
		// @254: iadd
		// @255: putfield int game.C_100034_gi.field_104031_b
		// @258: iload #5
		// @25A: ifeq @26A
		// @25D: goto @261
		// @260: athrow
		// @261: aload_0
		// @262: iconst_0
		// @263: putfield int game.C_100034_gi.field_104031_b
		// @266: goto @26A
		// @269: athrow
		// @26A: goto @28F
		// @26D: astore_2
		// @26E: aload_2
		// @26F: new java.lang.StringBuilder
		// @272: dup
		// @273: invokespecial java.lang.StringBuilder.<init>()void
		// @276: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @279: bipush 108 (0x6C)
		// @27B: aaload
		// @27C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27F: iload_1
		// @280: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @283: bipush 41 (0x29)
		// @285: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @288: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @28B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @28E: athrow
		// @28F: return
	}
	
	private final int func_103983_c(boolean arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: aload_0
		// @006: getfield int game.C_100034_gi.field_104030_e
		// @009: bipush 16 (0x10)
		// @00B: if_icmpeq @012
		// @00E: goto @014
		// @011: athrow
		// @012: iconst_m1
		// @013: ireturn
		// @014: aload_0
		// @015: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @018: getfield int game.C_100333_ij.field_107347_b
		// @01B: istore_2
		// @01C: iload_1
		// @01D: iconst_1
		// @01E: if_icmpeq @02C
		// @021: aconst_null
		// @022: checkcast java.awt.Canvas
		// @025: putstatic java.awt.Canvas game.C_100034_gi.field_104033_a
		// @028: goto @02C
		// @02B: athrow
		// @02C: aload_0
		// @02D: bipush -124 (0x84)
		// @02F: iload_2
		// @030: invokespecial game.C_100034_gi.func_104011_b(byte, int)int
		// @033: istore_3
		// @034: iconst_m1
		// @035: iload_2
		// @036: iconst_m1
		// @037: ixor
		// @038: if_icmplt @063
		// @03B: getstatic int[][] game.C_100012_fh.field_100515_K
		// @03E: aload_0
		// @03F: getfield int game.C_100034_gi.field_104030_e
		// @042: aaload
		// @043: arraylength
		// @044: iload_2
		// @045: if_icmple @063
		// @048: goto @04C
		// @04B: athrow
		// @04C: getstatic int[][] game.C_100012_fh.field_100515_K
		// @04F: aload_0
		// @050: getfield int game.C_100034_gi.field_104030_e
		// @053: aaload
		// @054: iload_2
		// @055: iaload
		// @056: iconst_m1
		// @057: ixor
		// @058: ifeq @063
		// @05B: goto @05F
		// @05E: athrow
		// @05F: goto @0AC
		// @062: athrow
		// @063: iconst_0
		// @064: istore_2
		// @065: getstatic int[][] game.C_100012_fh.field_100515_K
		// @068: aload_0
		// @069: getfield int game.C_100034_gi.field_104030_e
		// @06C: aaload
		// @06D: arraylength
		// @06E: iconst_m1
		// @06F: ixor
		// @070: iload_2
		// @071: iconst_m1
		// @072: ixor
		// @073: if_icmpge @09B
		// @076: iconst_0
		// @077: getstatic int[][] game.C_100012_fh.field_100515_K
		// @07A: aload_0
		// @07B: getfield int game.C_100034_gi.field_104030_e
		// @07E: aaload
		// @07F: iload_2
		// @080: iaload
		// @081: iconst_m1
		// @082: ixor
		// @083: iload #5
		// @085: ifne @0A5
		// @088: if_icmpne @09B
		// @08B: goto @08F
		// @08E: athrow
		// @08F: iinc #2 +1
		// @092: iload #5
		// @094: ifeq @065
		// @097: goto @09B
		// @09A: athrow
		// @09B: iload_2
		// @09C: getstatic int[][] game.C_100012_fh.field_100515_K
		// @09F: aload_0
		// @0A0: getfield int game.C_100034_gi.field_104030_e
		// @0A3: aaload
		// @0A4: arraylength
		// @0A5: if_icmpne @0AA
		// @0A8: iconst_m1
		// @0A9: ireturn
		// @0AA: iload_2
		// @0AB: ireturn
		// @0AC: bipush -21 (0xEB)
		// @0AE: aload_0
		// @0AF: getfield int game.C_100034_gi.field_104030_e
		// @0B2: iconst_m1
		// @0B3: ixor
		// @0B4: if_icmpne @0CA
		// @0B7: iload_2
		// @0B8: iflt @0CA
		// @0BB: goto @0BF
		// @0BE: athrow
		// @0BF: iload_2
		// @0C0: iconst_3
		// @0C1: if_icmpge @0CA
		// @0C4: goto @0C8
		// @0C7: athrow
		// @0C8: iconst_1
		// @0C9: ireturn
		// @0CA: aload_0
		// @0CB: getfield int game.C_100034_gi.field_104030_e
		// @0CE: iconst_m1
		// @0CF: ixor
		// @0D0: iconst_m1
		// @0D1: if_icmpeq @0D8
		// @0D4: goto @0F1
		// @0D7: athrow
		// @0D8: getstatic int[][] game.C_100012_fh.field_100515_K
		// @0DB: aload_0
		// @0DC: getfield int game.C_100034_gi.field_104030_e
		// @0DF: aaload
		// @0E0: iload_2
		// @0E1: iaload
		// @0E2: bipush 34 (0x22)
		// @0E4: if_icmpeq @0EB
		// @0E7: goto @0EF
		// @0EA: athrow
		// @0EB: getstatic int game.C_100043_vl.field_101937_Wb
		// @0EE: ireturn
		// @0EF: iload_2
		// @0F0: ireturn
		// @0F1: iload_3
		// @0F2: ifge @0F9
		// @0F5: goto @14D
		// @0F8: athrow
		// @0F9: iinc #2 +1
		// @0FC: iinc #3 +1
		// @0FF: iconst_4
		// @100: iload_3
		// @101: if_icmpeq @108
		// @104: goto @10D
		// @107: athrow
		// @108: iconst_0
		// @109: istore_3
		// @10A: iinc #2 +252
		// @10D: iconst_0
		// @10E: getstatic int[][] game.C_100012_fh.field_100515_K
		// @111: aload_0
		// @112: getfield int game.C_100034_gi.field_104030_e
		// @115: aaload
		// @116: iload_2
		// @117: iaload
		// @118: iconst_m1
		// @119: ixor
		// @11A: if_icmpne @14B
		// @11D: iinc #2 +1
		// @120: iinc #3 +1
		// @123: iload_3
		// @124: iload #5
		// @126: ifne @14C
		// @129: goto @12D
		// @12C: athrow
		// @12D: iconst_4
		// @12E: if_icmpne @13A
		// @131: goto @135
		// @134: athrow
		// @135: iinc #2 +252
		// @138: iconst_0
		// @139: istore_3
		// @13A: aload_0
		// @13B: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @13E: getfield int game.C_100333_ij.field_107347_b
		// @141: iload_2
		// @142: if_icmpeq @149
		// @145: goto @10D
		// @148: athrow
		// @149: iload_2
		// @14A: ireturn
		// @14B: iload_2
		// @14C: ireturn
		// @14D: bipush -6 (0xFA)
		// @14F: aload_0
		// @150: getfield int game.C_100034_gi.field_104030_e
		// @153: iconst_m1
		// @154: ixor
		// @155: if_icmpne @176
		// @158: iload_2
		// @159: iconst_3
		// @15A: if_icmpge @176
		// @15D: goto @161
		// @160: athrow
		// @161: iinc #2 +1
		// @164: iload_2
		// @165: iconst_3
		// @166: if_icmplt @174
		// @169: goto @16D
		// @16C: athrow
		// @16D: iinc #2 +253
		// @170: goto @174
		// @173: athrow
		// @174: iload_2
		// @175: ireturn
		// @176: aload_0
		// @177: getfield int game.C_100034_gi.field_104030_e
		// @17A: bipush 6 (0x06)
		// @17C: if_icmpne @1A0
		// @17F: bipush -3 (0xFD)
		// @181: iload_2
		// @182: iconst_m1
		// @183: ixor
		// @184: if_icmplt @18F
		// @187: goto @18B
		// @18A: athrow
		// @18B: goto @1A0
		// @18E: athrow
		// @18F: iinc #2 +1
		// @192: iload_2
		// @193: iconst_2
		// @194: if_icmpge @19B
		// @197: goto @19E
		// @19A: athrow
		// @19B: iinc #2 +254
		// @19E: iload_2
		// @19F: ireturn
		// @1A0: bipush -20 (0xEC)
		// @1A2: aload_0
		// @1A3: getfield int game.C_100034_gi.field_104030_e
		// @1A6: iconst_m1
		// @1A7: ixor
		// @1A8: if_icmpne @1F5
		// @1AB: aload_0
		// @1AC: getfield int game.C_100034_gi.field_104030_e
		// @1AF: iconst_m1
		// @1B0: ixor
		// @1B1: bipush -20 (0xEC)
		// @1B3: if_icmpeq @1BE
		// @1B6: goto @1BA
		// @1B9: athrow
		// @1BA: goto @1F5
		// @1BD: athrow
		// @1BE: getstatic int[][] game.C_100012_fh.field_100515_K
		// @1C1: aload_0
		// @1C2: getfield int game.C_100034_gi.field_104030_e
		// @1C5: aaload
		// @1C6: getstatic int[] game.C_100333_ij.field_107345_d
		// @1C9: if_acmpeq @1D2
		// @1CC: bipush 20 (0x14)
		// @1CE: goto @1D4
		// @1D1: athrow
		// @1D2: bipush 30 (0x1E)
		// @1D4: istore #4
		// @1D6: iconst_0
		// @1D7: iload_2
		// @1D8: if_icmpgt @1F5
		// @1DB: iload_2
		// @1DC: iconst_m1
		// @1DD: ixor
		// @1DE: iload #4
		// @1E0: bipush 10 (0x0A)
		// @1E2: isub
		// @1E3: iconst_m1
		// @1E4: ixor
		// @1E5: if_icmpgt @1F0
		// @1E8: goto @1EC
		// @1EB: athrow
		// @1EC: goto @1F5
		// @1EF: athrow
		// @1F0: iload_2
		// @1F1: bipush 10 (0x0A)
		// @1F3: iadd
		// @1F4: ireturn
		// @1F5: iconst_m1
		// @1F6: ireturn
		// @1F7: astore_2
		// @1F8: aload_2
		// @1F9: new java.lang.StringBuilder
		// @1FC: dup
		// @1FD: invokespecial java.lang.StringBuilder.<init>()void
		// @200: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @203: bipush 118 (0x76)
		// @205: aaload
		// @206: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @209: iload_1
		// @20A: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @20D: bipush 41 (0x29)
		// @20F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @212: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @215: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @218: athrow
	}
	
	private final void func_103974_m(int arg0)
	{
		// @00: iload_1
		// @01: sipush 150 (0x0096)
		// @04: if_icmpeq @10
		// @07: bipush 12 (0x0C)
		// @09: putstatic int game.C_100034_gi.field_104032_c
		// @0C: goto @10
		// @0F: athrow
		// @10: aload_0
		// @11: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @14: bipush -80 (0xB0)
		// @16: invokevirtual game.C_100333_ij.func_107334_b(byte)void
		// @19: goto @3E
		// @1C: astore_2
		// @1D: aload_2
		// @1E: new java.lang.StringBuilder
		// @21: dup
		// @22: invokespecial java.lang.StringBuilder.<init>()void
		// @25: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @28: bipush 62 (0x3E)
		// @2A: aaload
		// @2B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2E: iload_1
		// @2F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @32: bipush 41 (0x29)
		// @34: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @37: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3D: athrow
		// @3E: return
	}
	
	private final void func_103996_g(byte arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #16
		// @005: iload_1
		// @006: bipush 18 (0x12)
		// @008: if_icmpgt @015
		// @00B: aload_0
		// @00C: bipush -46 (0xD2)
		// @00E: invokevirtual game.C_100034_gi.func_104009_e(byte)void
		// @011: goto @015
		// @014: athrow
		// @015: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @018: astore_2
		// @019: iconst_1
		// @01A: istore_3
		// @01B: getstatic game.C_100187_rk game.C_100111_el.field_104864_a
		// @01E: ifnull @033
		// @021: getstatic game.C_100187_rk game.C_100111_el.field_104864_a
		// @024: getfield int game.C_100187_rk.field_100831_u
		// @027: iload_3
		// @028: if_icmpne @033
		// @02B: goto @02F
		// @02E: athrow
		// @02F: goto @041
		// @032: athrow
		// @033: iconst_1
		// @034: bipush 10 (0x0A)
		// @036: iload_3
		// @037: iconst_3
		// @038: sipush 29717 (0x7415)
		// @03B: invokestatic game.C_100294_ki.func_106898_a(int, int, int, int, int)game.C_100187_rk
		// @03E: putstatic game.C_100187_rk game.C_100111_el.field_104864_a
		// @041: getstatic int game.C_100025_he.field_103934_b
		// @044: istore #4
		// @046: getstatic game.C_100292_jk game.C_100067_vd.field_104315_c
		// @049: getstatic game.C_100187_rk game.C_100111_el.field_104864_a
		// @04C: bipush -104 (0x98)
		// @04E: iload #4
		// @050: invokestatic game.SteelSentinels.func_105268_a(game.C_100292_jk, game.C_100187_rk, byte, int)int
		// @053: istore #5
		// @055: aconst_null
		// @056: getstatic game.C_100292_jk game.C_100067_vd.field_104315_c
		// @059: if_acmpeq @076
		// @05C: getstatic game.C_100292_jk game.C_100067_vd.field_104315_c
		// @05F: getfield int game.C_100292_jk.field_101222_j
		// @062: iconst_m1
		// @063: ixor
		// @064: iload_3
		// @065: iconst_m1
		// @066: ixor
		// @067: if_icmpne @072
		// @06A: goto @06E
		// @06D: athrow
		// @06E: goto @076
		// @071: athrow
		// @072: bipush 100 (0x64)
		// @074: istore #5
		// @076: aconst_null
		// @077: getstatic game.C_100292_jk game.C_100067_vd.field_104315_c
		// @07A: if_acmpeq @089
		// @07D: iload #5
		// @07F: iconst_m1
		// @080: ixor
		// @081: iconst_m1
		// @082: if_icmple @089
		// @085: goto @089
		// @088: athrow
		// @089: getstatic game.C_100187_rk game.C_100111_el.field_104864_a
		// @08C: getfield boolean game.C_100187_rk.field_100829_j
		// @08F: ifne @09C
		// @092: getstatic java.lang.String game.C_100306_kn.field_107139_j
		// @095: astore #6
		// @097: iload #16
		// @099: ifeq @2AA
		// @09C: aconst_null
		// @09D: getstatic game.C_100187_rk game.C_100111_el.field_104864_a
		// @0A0: getfield java.lang.String[][] game.C_100187_rk.field_100825_n
		// @0A3: if_acmpeq @0B7
		// @0A6: goto @0AA
		// @0A9: athrow
		// @0AA: getstatic game.C_100187_rk game.C_100111_el.field_104864_a
		// @0AD: getfield int[][] game.C_100187_rk.field_100832_t
		// @0B0: ifnonnull @0C1
		// @0B3: goto @0B7
		// @0B6: athrow
		// @0B7: getstatic java.lang.String game.C_100332_ii.field_107314_n
		// @0BA: astore #6
		// @0BC: iload #16
		// @0BE: ifeq @2AA
		// @0C1: ldc 1021128 (0xf94c8)
		// @0C3: istore #8
		// @0C5: getstatic game.C_100187_rk game.C_100111_el.field_104864_a
		// @0C8: getfield java.lang.String[][] game.C_100187_rk.field_100825_n
		// @0CB: iload #4
		// @0CD: aaload
		// @0CE: astore #9
		// @0D0: getstatic game.C_100187_rk game.C_100111_el.field_104864_a
		// @0D3: getfield int[][] game.C_100187_rk.field_100832_t
		// @0D6: iload #4
		// @0D8: aaload
		// @0D9: astore #10
		// @0DB: bipush 48 (0x30)
		// @0DD: bipush 88 (0x58)
		// @0DF: sipush 544 (0x0220)
		// @0E2: sipush 286 (0x011E)
		// @0E5: ldc 1130327 (0x113f57)
		// @0E7: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @0EA: iconst_1
		// @0EB: istore #11
		// @0ED: getstatic int[] game.C_100111_el.field_104862_b
		// @0F0: arraylength
		// @0F1: iconst_m1
		// @0F2: ixor
		// @0F3: iload #11
		// @0F5: iconst_m1
		// @0F6: ixor
		// @0F7: if_icmpge @11B
		// @0FA: getstatic int[] game.C_100111_el.field_104862_b
		// @0FD: iload #11
		// @0FF: iaload
		// @100: bipush 88 (0x58)
		// @102: sipush 265 (0x0109)
		// @105: iload #16
		// @107: ifne @125
		// @10A: ldc 1130327 (0x113f57)
		// @10C: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @10F: iinc #11 +1
		// @112: iload #16
		// @114: ifeq @0ED
		// @117: goto @11B
		// @11A: athrow
		// @11B: bipush 88 (0x58)
		// @11D: bipush 21 (0x15)
		// @11F: aload_2
		// @120: getfield int game.C_100112_r.field_101772_Q
		// @123: iadd
		// @124: iconst_2
		// @125: idiv
		// @126: ineg
		// @127: isub
		// @128: istore #7
		// @12A: aload_2
		// @12B: getstatic java.lang.String[] game.C_100252_pn.field_105505_m
		// @12E: iconst_0
		// @12F: aaload
		// @130: getstatic int[] game.C_100111_el.field_104862_b
		// @133: iconst_0
		// @134: iaload
		// @135: bipush -5 (0xFB)
		// @137: isub
		// @138: iload #7
		// @13A: iload #8
		// @13C: iconst_m1
		// @13D: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @140: aload_2
		// @141: getstatic java.lang.String[] game.C_100252_pn.field_105505_m
		// @144: iconst_1
		// @145: aaload
		// @146: iconst_5
		// @147: getstatic int[] game.C_100111_el.field_104862_b
		// @14A: iconst_1
		// @14B: iaload
		// @14C: iadd
		// @14D: iload #7
		// @14F: iload #8
		// @151: iconst_m1
		// @152: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @155: aload_2
		// @156: getstatic java.lang.String[] game.C_100252_pn.field_105505_m
		// @159: iconst_2
		// @15A: aaload
		// @15B: bipush -6 (0xFA)
		// @15D: getstatic int[] game.C_100111_el.field_104862_b
		// @160: iconst_3
		// @161: iaload
		// @162: iadd
		// @163: iload #7
		// @165: iload #8
		// @167: iconst_m1
		// @168: invokevirtual game.C_100112_r.func_101746_a(java.lang.String, int, int, int, int)void
		// @16B: aload_2
		// @16C: getstatic java.lang.String[] game.C_100252_pn.field_105505_m
		// @16F: iconst_3
		// @170: aaload
		// @171: getstatic int[] game.C_100111_el.field_104862_b
		// @174: iconst_4
		// @175: iaload
		// @176: bipush 6 (0x06)
		// @178: isub
		// @179: iload #7
		// @17B: iload #8
		// @17D: iconst_m1
		// @17E: invokevirtual game.C_100112_r.func_101746_a(java.lang.String, int, int, int, int)void
		// @181: bipush 48 (0x30)
		// @183: bipush 109 (0x6D)
		// @185: sipush 544 (0x0220)
		// @188: ldc 1130327 (0x113f57)
		// @18A: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @18D: bipush 48 (0x30)
		// @18F: sipush 353 (0x0161)
		// @192: sipush 544 (0x0220)
		// @195: ldc 1130327 (0x113f57)
		// @197: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @19A: getstatic java.lang.String game.C_100298_ke.field_103215_P
		// @19D: astore #6
		// @19F: bipush 126 (0x7E)
		// @1A1: istore #7
		// @1A3: iconst_0
		// @1A4: istore #11
		// @1A6: bipush -11 (0xF5)
		// @1A8: iload #11
		// @1AA: iconst_m1
		// @1AB: ixor
		// @1AC: if_icmpge @23A
		// @1AF: aload #9
		// @1B1: iload #11
		// @1B3: aaload
		// @1B4: iload #16
		// @1B6: ifne @260
		// @1B9: ifnull @22F
		// @1BC: goto @1C0
		// @1BF: athrow
		// @1C0: aload #9
		// @1C2: iload #11
		// @1C4: aaload
		// @1C5: astore #12
		// @1C7: ldc 1021128 (0xf94c8)
		// @1C9: istore #8
		// @1CB: iload #5
		// @1CD: iload #11
		// @1CF: if_icmpne @1D6
		// @1D2: ldc 1044724 (0xff0f4)
		// @1D4: istore #8
		// @1D6: aload #10
		// @1D8: iload #11
		// @1DA: iaload
		// @1DB: bipush 69 (0x45)
		// @1DD: bipush 12 (0x0C)
		// @1DF: invokestatic game.C_100019_wl.func_103826_a(int, int, int)int
		// @1E2: istore #13
		// @1E4: bipush 12 (0x0C)
		// @1E6: bipush -123 (0x85)
		// @1E8: aload #10
		// @1EA: iload #11
		// @1EC: iaload
		// @1ED: invokestatic game.C_100339_jb.func_107378_a(int, byte, int)int
		// @1F0: bipush 105 (0x69)
		// @1F2: bipush 43 (0x2B)
		// @1F4: invokestatic game.C_100019_wl.func_103826_a(int, int, int)int
		// @1F7: istore #14
		// @1F9: sipush 516 (0x0204)
		// @1FC: bipush -115 (0x8D)
		// @1FE: aload #10
		// @200: iload #11
		// @202: iaload
		// @203: invokestatic game.C_100339_jb.func_107378_a(int, byte, int)int
		// @206: istore #15
		// @208: aload_0
		// @209: aload #12
		// @20B: iload #11
		// @20D: iload #5
		// @20F: if_icmpne @217
		// @212: iconst_1
		// @213: goto @218
		// @216: athrow
		// @217: iconst_0
		// @218: iload #7
		// @21A: iload #13
		// @21C: sipush -25278 (0x9D42)
		// @21F: iload #14
		// @221: iload #15
		// @223: iconst_1
		// @224: iload #11
		// @226: iadd
		// @227: invokespecial game.C_100034_gi.func_103989_a(java.lang.String, boolean, int, int, int, int, int, int)void
		// @22A: getstatic java.lang.String game.C_100166_sg.field_105462_f
		// @22D: astore #6
		// @22F: iinc #7 +17
		// @232: iinc #11 +1
		// @235: iload #16
		// @237: ifeq @1A6
		// @23A: getstatic game.C_100292_jk game.C_100067_vd.field_104315_c
		// @23D: ifnull @2AA
		// @240: iconst_m1
		// @241: iload #5
		// @243: iconst_m1
		// @244: ixor
		// @245: if_icmplt @250
		// @248: goto @24C
		// @24B: athrow
		// @24C: goto @2AA
		// @24F: athrow
		// @250: sipush 345 (0x0159)
		// @253: istore #7
		// @255: getstatic game.C_100292_jk game.C_100067_vd.field_104315_c
		// @258: getfield int[] game.C_100292_jk.field_101224_k
		// @25B: astore #10
		// @25D: getstatic java.lang.String game.C_100339_jb.field_107391_h
		// @260: astore #11
		// @262: iconst_0
		// @263: istore #12
		// @265: aload #10
		// @267: iload #12
		// @269: iaload
		// @26A: bipush 92 (0x5C)
		// @26C: bipush 12 (0x0C)
		// @26E: invokestatic game.C_100019_wl.func_103826_a(int, int, int)int
		// @271: istore #13
		// @273: bipush 12 (0x0C)
		// @275: bipush -74 (0xB6)
		// @277: aload #10
		// @279: iload #12
		// @27B: iaload
		// @27C: invokestatic game.C_100339_jb.func_107378_a(int, byte, int)int
		// @27F: bipush 69 (0x45)
		// @281: bipush 43 (0x2B)
		// @283: invokestatic game.C_100019_wl.func_103826_a(int, int, int)int
		// @286: istore #14
		// @288: sipush 516 (0x0204)
		// @28B: bipush -105 (0x97)
		// @28D: aload #10
		// @28F: iload #12
		// @291: iaload
		// @292: invokestatic game.C_100339_jb.func_107378_a(int, byte, int)int
		// @295: istore #15
		// @297: aload_0
		// @298: aload #11
		// @29A: iconst_1
		// @29B: iload #7
		// @29D: iload #13
		// @29F: sipush -25278 (0x9D42)
		// @2A2: iload #14
		// @2A4: iload #15
		// @2A6: iconst_0
		// @2A7: invokespecial game.C_100034_gi.func_103989_a(java.lang.String, boolean, int, int, int, int, int, int)void
		// @2AA: sipush 368 (0x0170)
		// @2AD: istore #7
		// @2AF: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @2B2: aload #6
		// @2B4: getstatic int[] game.C_100111_el.field_104862_b
		// @2B7: iconst_0
		// @2B8: iaload
		// @2B9: iconst_5
		// @2BA: iadd
		// @2BB: iload #7
		// @2BD: ldc 1130327 (0x113f57)
		// @2BF: iconst_m1
		// @2C0: invokevirtual game.C_100193_re.func_101749_c(java.lang.String, int, int, int, int)void
		// @2C3: goto @2E8
		// @2C6: astore_2
		// @2C7: aload_2
		// @2C8: new java.lang.StringBuilder
		// @2CB: dup
		// @2CC: invokespecial java.lang.StringBuilder.<init>()void
		// @2CF: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @2D2: bipush 58 (0x3A)
		// @2D4: aaload
		// @2D5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D8: iload_1
		// @2D9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2DC: bipush 41 (0x29)
		// @2DE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E1: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2E4: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2E7: athrow
		// @2E8: return
	}
	
	private final void func_104014_q(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #31
		// @005: getstatic int game.C_100149_bi.field_105152_f
		// @008: istore_2
		// @009: iconst_0
		// @00A: putstatic boolean game.C_100301_kb.field_107100_k
		// @00D: iconst_m1
		// @00E: putstatic int game.C_100149_bi.field_105152_f
		// @011: getstatic int game.C_100052_eb.field_104231_b
		// @014: ifne @01B
		// @017: goto @01F
		// @01A: athrow
		// @01B: iconst_1
		// @01C: putstatic boolean game.C_100301_kb.field_107100_k
		// @01F: aconst_null
		// @020: getstatic game.C_100302_ka game.C_100145_ta.field_100429_j
		// @023: if_acmpne @02A
		// @026: goto @401
		// @029: athrow
		// @02A: getstatic game.C_100115_ej game.C_100295_kh.field_105299_j
		// @02D: astore_3
		// @02E: aload_3
		// @02F: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @032: getfield int game.C_100302_ka.field_101880_Gb
		// @035: istore #4
		// @037: getstatic int game.C_100298_ke.field_103218_O
		// @03A: istore #5
		// @03C: iload #5
		// @03E: iconst_m1
		// @03F: ixor
		// @040: bipush -105 (0x97)
		// @042: if_icmpeq @05B
		// @045: bipush -106 (0x96)
		// @047: iload #5
		// @049: iconst_m1
		// @04A: ixor
		// @04B: if_icmpne @0B1
		// @04E: goto @052
		// @051: athrow
		// @052: iload #31
		// @054: ifeq @082
		// @057: goto @05B
		// @05A: athrow
		// @05B: aload_3
		// @05C: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @05F: dup
		// @060: getfield int game.C_100302_ka.field_101843_Tb
		// @063: bipush -20 (0xEC)
		// @065: aload_3
		// @066: getfield int game.C_100115_ej.field_101848_lb
		// @069: iadd
		// @06A: aload_3
		// @06B: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @06E: getfield int game.C_100302_ka.field_101880_Gb
		// @071: ineg
		// @072: invokestatic java.lang.Math.min(int, int)int
		// @075: iadd
		// @076: putfield int game.C_100302_ka.field_101843_Tb
		// @079: iload #31
		// @07B: ifeq @0B1
		// @07E: goto @082
		// @081: athrow
		// @082: aload_3
		// @083: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @086: dup
		// @087: getfield int game.C_100302_ka.field_101843_Tb
		// @08A: bipush -20 (0xEC)
		// @08C: aload_3
		// @08D: getfield int game.C_100115_ej.field_101848_lb
		// @090: iadd
		// @091: aload_3
		// @092: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @095: getfield int game.C_100302_ka.field_101848_lb
		// @098: aload_3
		// @099: getfield int game.C_100115_ej.field_101848_lb
		// @09C: ineg
		// @09D: aload_3
		// @09E: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @0A1: getfield int game.C_100302_ka.field_101880_Gb
		// @0A4: iadd
		// @0A5: iadd
		// @0A6: invokestatic java.lang.Math.min(int, int)int
		// @0A9: isub
		// @0AA: putfield int game.C_100302_ka.field_101843_Tb
		// @0AD: goto @0B1
		// @0B0: athrow
		// @0B1: getstatic game.C_100302_ka game.C_100145_ta.field_100429_j
		// @0B4: iconst_1
		// @0B5: bipush -123 (0x85)
		// @0B7: invokevirtual game.C_100302_ka.func_101819_a(boolean, byte)void
		// @0BA: iconst_m1
		// @0BB: istore #5
		// @0BD: aconst_null
		// @0BE: aload_3
		// @0BF: if_acmpeq @1FA
		// @0C2: aload_3
		// @0C3: bipush 32 (0x20)
		// @0C5: bipush -108 (0x94)
		// @0C7: iconst_0
		// @0C8: sipush 128 (0x0080)
		// @0CB: getstatic int game.C_100242_oh.field_106344_e
		// @0CE: bipush 32 (0x20)
		// @0D0: imul
		// @0D1: invokevirtual game.C_100115_ej.func_102025_a(int, int, boolean, int, int)void
		// @0D4: aload_3
		// @0D5: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @0D8: getfield int game.C_100302_ka.field_101880_Gb
		// @0DB: istore #6
		// @0DD: aconst_null
		// @0DE: astore #7
		// @0E0: iconst_0
		// @0E1: istore #8
		// @0E3: bipush -33 (0xDF)
		// @0E5: iload #8
		// @0E7: iconst_m1
		// @0E8: ixor
		// @0E9: if_icmpge @1E8
		// @0EC: getstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @0EF: iload #8
		// @0F1: aaload
		// @0F2: iload #31
		// @0F4: ifne @228
		// @0F7: ifnull @1E8
		// @0FA: goto @0FE
		// @0FD: athrow
		// @0FE: getstatic game.C_100317_lb game.C_100318_hj.field_107197_e
		// @101: getfield int game.C_100317_lb.field_101775_y
		// @104: iconst_2
		// @105: idiv
		// @106: bipush 10 (0x0A)
		// @108: getstatic int[] game.C_100133_tk.field_104996_g
		// @10B: iload #8
		// @10D: iaload
		// @10E: iadd
		// @10F: iadd
		// @110: istore #9
		// @112: iload #6
		// @114: ineg
		// @115: iconst_m1
		// @116: ixor
		// @117: iload #9
		// @119: iconst_m1
		// @11A: ixor
		// @11B: if_icmplt @176
		// @11E: aload_3
		// @11F: getfield game.C_100302_ka game.C_100115_ej.field_102040_Zb
		// @122: getfield int game.C_100302_ka.field_101848_lb
		// @125: iload #6
		// @127: ineg
		// @128: iadd
		// @129: iconst_m1
		// @12A: ixor
		// @12B: iload #9
		// @12D: iconst_m1
		// @12E: ixor
		// @12F: if_icmplt @164
		// @132: goto @136
		// @135: athrow
		// @136: getstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @139: iload #8
		// @13B: aaload
		// @13C: ldc 2061990 (0x1f76a6)
		// @13E: putfield int game.C_100302_ka.field_101830_gb
		// @141: getstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @144: iload #8
		// @146: aaload
		// @147: getfield boolean game.C_100302_ka.field_101839_db
		// @14A: ifne @155
		// @14D: goto @151
		// @150: athrow
		// @151: goto @1B5
		// @154: athrow
		// @155: getstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @158: iload #8
		// @15A: aaload
		// @15B: iconst_0
		// @15C: putfield int game.C_100302_ka.field_101830_gb
		// @15F: iload #31
		// @161: ifeq @1B5
		// @164: aconst_null
		// @165: astore #7
		// @167: getstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @16A: iload #8
		// @16C: aaload
		// @16D: ldc_w 10526880 (0xa0a0a0)
		// @170: putfield int game.C_100302_ka.field_101830_gb
		// @173: goto @1B5
		// @176: bipush -99 (0x9D)
		// @178: getstatic int game.C_100298_ke.field_103218_O
		// @17B: iconst_m1
		// @17C: ixor
		// @17D: if_icmpeq @184
		// @180: goto @188
		// @183: athrow
		// @184: iload #8
		// @186: istore #5
		// @188: getstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @18B: iload #8
		// @18D: aaload
		// @18E: astore #7
		// @190: getstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @193: iload #8
		// @195: aaload
		// @196: ldc 2061990 (0x1f76a6)
		// @198: putfield int game.C_100302_ka.field_101830_gb
		// @19B: getstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @19E: iload #8
		// @1A0: aaload
		// @1A1: getfield boolean game.C_100302_ka.field_101839_db
		// @1A4: ifne @1AB
		// @1A7: goto @1B5
		// @1AA: athrow
		// @1AB: getstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @1AE: iload #8
		// @1B0: aaload
		// @1B1: iconst_0
		// @1B2: putfield int game.C_100302_ka.field_101830_gb
		// @1B5: getstatic int game.C_100298_ke.field_103218_O
		// @1B8: iconst_m1
		// @1B9: ixor
		// @1BA: bipush -100 (0x9C)
		// @1BC: if_icmpne @1E0
		// @1BF: iconst_0
		// @1C0: iload #5
		// @1C2: if_icmple @1E0
		// @1C5: goto @1C9
		// @1C8: athrow
		// @1C9: iload #9
		// @1CB: bipush 20 (0x14)
		// @1CD: iload #6
		// @1CF: ineg
		// @1D0: iadd
		// @1D1: if_icmpgt @1DC
		// @1D4: goto @1D8
		// @1D7: athrow
		// @1D8: goto @1E0
		// @1DB: athrow
		// @1DC: iload #8
		// @1DE: istore #5
		// @1E0: iinc #8 +1
		// @1E3: iload #31
		// @1E5: ifeq @0E3
		// @1E8: aconst_null
		// @1E9: aload #7
		// @1EB: if_acmpeq @1FA
		// @1EE: aload #7
		// @1F0: ldc_w 10526880 (0xa0a0a0)
		// @1F3: putfield int game.C_100302_ka.field_101830_gb
		// @1F6: goto @1FA
		// @1F9: athrow
		// @1FA: iconst_0
		// @1FB: putstatic int game.C_100298_ke.field_103218_O
		// @1FE: iload #5
		// @200: iconst_m1
		// @201: ixor
		// @202: iconst_m1
		// @203: if_icmple @20A
		// @206: goto @2AB
		// @209: athrow
		// @20A: aload_3
		// @20B: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @20E: bipush -4 (0xFC)
		// @210: aload_3
		// @211: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @214: getfield int game.C_100302_ka.field_101880_Gb
		// @217: ineg
		// @218: getstatic int[] game.C_100133_tk.field_104996_g
		// @21B: iload #5
		// @21D: iaload
		// @21E: ineg
		// @21F: iadd
		// @220: iadd
		// @221: putfield int game.C_100302_ka.field_101843_Tb
		// @224: aload_3
		// @225: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @228: getfield int game.C_100302_ka.field_101843_Tb
		// @22B: iconst_m1
		// @22C: ixor
		// @22D: aload_3
		// @22E: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @231: getfield int game.C_100302_ka.field_101880_Gb
		// @234: ineg
		// @235: iconst_m1
		// @236: ixor
		// @237: if_icmplt @23E
		// @23A: goto @24D
		// @23D: athrow
		// @23E: aload_3
		// @23F: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @242: aload_3
		// @243: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @246: getfield int game.C_100302_ka.field_101880_Gb
		// @249: ineg
		// @24A: putfield int game.C_100302_ka.field_101843_Tb
		// @24D: aload_3
		// @24E: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @251: getfield int game.C_100302_ka.field_101843_Tb
		// @254: iconst_m1
		// @255: ixor
		// @256: aload_3
		// @257: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @25A: getfield int game.C_100302_ka.field_101832_tb
		// @25D: ineg
		// @25E: aload_3
		// @25F: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @262: getfield int game.C_100302_ka.field_101848_lb
		// @265: ineg
		// @266: iadd
		// @267: aload_3
		// @268: getfield game.C_100302_ka game.C_100115_ej.field_102040_Zb
		// @26B: getfield int game.C_100302_ka.field_101848_lb
		// @26E: ineg
		// @26F: aload_3
		// @270: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @273: getfield int game.C_100302_ka.field_101880_Gb
		// @276: ineg
		// @277: isub
		// @278: isub
		// @279: iconst_m1
		// @27A: ixor
		// @27B: if_icmple @2AB
		// @27E: aload_3
		// @27F: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @282: aload_3
		// @283: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @286: getfield int game.C_100302_ka.field_101880_Gb
		// @289: ineg
		// @28A: aload_3
		// @28B: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @28E: getfield int game.C_100302_ka.field_101848_lb
		// @291: ineg
		// @292: aload_3
		// @293: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @296: getfield int game.C_100302_ka.field_101832_tb
		// @299: aload_3
		// @29A: getfield game.C_100302_ka game.C_100115_ej.field_102040_Zb
		// @29D: getfield int game.C_100302_ka.field_101848_lb
		// @2A0: ineg
		// @2A1: iadd
		// @2A2: isub
		// @2A3: iadd
		// @2A4: putfield int game.C_100302_ka.field_101843_Tb
		// @2A7: goto @2AB
		// @2AA: athrow
		// @2AB: getstatic game.C_100302_ka game.C_100145_ta.field_100429_j
		// @2AE: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @2B1: bipush 99 (0x63)
		// @2B3: aaload
		// @2B4: bipush -75 (0xB5)
		// @2B6: invokevirtual game.C_100302_ka.func_101822_a(java.lang.String, byte)game.C_100302_ka
		// @2B9: astore #6
		// @2BB: aconst_null
		// @2BC: aload #6
		// @2BE: if_acmpeq @3E9
		// @2C1: aconst_null
		// @2C2: aload_3
		// @2C3: if_acmpeq @3E9
		// @2C6: goto @2CA
		// @2C9: athrow
		// @2CA: aload #6
		// @2CC: getfield boolean game.C_100302_ka.field_101839_db
		// @2CF: ifeq @3E9
		// @2D2: goto @2D6
		// @2D5: athrow
		// @2D6: iconst_0
		// @2D7: istore #7
		// @2D9: iload #7
		// @2DB: bipush 32 (0x20)
		// @2DD: if_icmpge @3E9
		// @2E0: getstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @2E3: iload #7
		// @2E5: aaload
		// @2E6: iload #31
		// @2E8: ifne @3ED
		// @2EB: ifnull @3E9
		// @2EE: goto @2F2
		// @2F1: athrow
		// @2F2: getstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @2F5: iload #7
		// @2F7: aaload
		// @2F8: getfield boolean game.C_100302_ka.field_101839_db
		// @2FB: ifne @306
		// @2FE: goto @302
		// @301: athrow
		// @302: goto @3DD
		// @305: athrow
		// @306: iload #7
		// @308: putstatic int game.C_100149_bi.field_105152_f
		// @30B: iconst_1
		// @30C: getstatic int game.C_100102_w.field_104636_c
		// @30F: if_icmpeq @32F
		// @312: iload #7
		// @314: iconst_m1
		// @315: ixor
		// @316: iload_2
		// @317: iconst_m1
		// @318: ixor
		// @319: if_icmpeq @3DD
		// @31C: goto @320
		// @31F: athrow
		// @320: bipush 97 (0x61)
		// @322: bipush 8 (0x08)
		// @324: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @327: iload #7
		// @329: istore_2
		// @32A: iload #31
		// @32C: ifeq @3DD
		// @32F: bipush 95 (0x5F)
		// @331: bipush 8 (0x08)
		// @333: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @336: aload_3
		// @337: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @33A: bipush -4 (0xFC)
		// @33C: aload_3
		// @33D: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @340: getfield int game.C_100302_ka.field_101880_Gb
		// @343: ineg
		// @344: iadd
		// @345: getstatic int[] game.C_100133_tk.field_104996_g
		// @348: iload #7
		// @34A: iaload
		// @34B: ineg
		// @34C: iadd
		// @34D: putfield int game.C_100302_ka.field_101843_Tb
		// @350: aload_3
		// @351: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @354: getfield int game.C_100302_ka.field_101843_Tb
		// @357: iconst_m1
		// @358: ixor
		// @359: aload_3
		// @35A: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @35D: getfield int game.C_100302_ka.field_101880_Gb
		// @360: ineg
		// @361: iconst_m1
		// @362: ixor
		// @363: if_icmpge @37D
		// @366: goto @36A
		// @369: athrow
		// @36A: aload_3
		// @36B: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @36E: aload_3
		// @36F: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @372: getfield int game.C_100302_ka.field_101880_Gb
		// @375: ineg
		// @376: putfield int game.C_100302_ka.field_101843_Tb
		// @379: goto @37D
		// @37C: athrow
		// @37D: aload_3
		// @37E: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @381: getfield int game.C_100302_ka.field_101848_lb
		// @384: ineg
		// @385: aload_3
		// @386: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @389: getfield int game.C_100302_ka.field_101832_tb
		// @38C: aload_3
		// @38D: getfield game.C_100302_ka game.C_100115_ej.field_102040_Zb
		// @390: getfield int game.C_100302_ka.field_101848_lb
		// @393: ineg
		// @394: aload_3
		// @395: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @398: getfield int game.C_100302_ka.field_101880_Gb
		// @39B: ineg
		// @39C: isub
		// @39D: iadd
		// @39E: isub
		// @39F: iconst_m1
		// @3A0: ixor
		// @3A1: aload_3
		// @3A2: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @3A5: getfield int game.C_100302_ka.field_101843_Tb
		// @3A8: iconst_m1
		// @3A9: ixor
		// @3AA: if_icmpge @3E9
		// @3AD: aload_3
		// @3AE: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @3B1: aload_3
		// @3B2: getfield game.C_100302_ka game.C_100115_ej.field_102040_Zb
		// @3B5: getfield int game.C_100302_ka.field_101848_lb
		// @3B8: aload_3
		// @3B9: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @3BC: getfield int game.C_100302_ka.field_101848_lb
		// @3BF: ineg
		// @3C0: iadd
		// @3C1: aload_3
		// @3C2: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @3C5: getfield int game.C_100302_ka.field_101832_tb
		// @3C8: isub
		// @3C9: aload_3
		// @3CA: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @3CD: getfield int game.C_100302_ka.field_101880_Gb
		// @3D0: isub
		// @3D1: putfield int game.C_100302_ka.field_101843_Tb
		// @3D4: iload #31
		// @3D6: ifeq @3E9
		// @3D9: goto @3DD
		// @3DC: athrow
		// @3DD: iinc #7 +1
		// @3E0: iload #31
		// @3E2: ifeq @2D9
		// @3E5: goto @3E9
		// @3E8: athrow
		// @3E9: aload_3
		// @3EA: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @3ED: getfield int game.C_100302_ka.field_101880_Gb
		// @3F0: iconst_m1
		// @3F1: ixor
		// @3F2: iload #4
		// @3F4: iconst_m1
		// @3F5: ixor
		// @3F6: if_icmpeq @401
		// @3F9: iconst_1
		// @3FA: putstatic boolean game.C_100301_kb.field_107100_k
		// @3FD: goto @401
		// @400: athrow
		// @401: getstatic game.C_100302_ka game.C_100145_ta.field_100429_j
		// @404: ifnull @408
		// @407: return
		// @408: iconst_1
		// @409: putstatic boolean game.C_100301_kb.field_107100_k
		// @40C: new game.C_100302_ka
		// @40F: dup
		// @410: invokespecial game.C_100302_ka.<init>()void
		// @413: putstatic game.C_100302_ka game.C_100145_ta.field_100429_j
		// @416: getstatic game.C_100302_ka game.C_100145_ta.field_100429_j
		// @419: iconst_0
		// @41A: sipush 480 (0x01E0)
		// @41D: iconst_m1
		// @41E: iconst_0
		// @41F: sipush 640 (0x0280)
		// @422: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @425: new game.C_100302_ka
		// @428: dup
		// @429: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @42C: bipush 98 (0x62)
		// @42E: aaload
		// @42F: aconst_null
		// @430: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @433: astore_3
		// @434: bipush 15 (0x0F)
		// @436: putstatic int game.C_100104_v.field_104692_c
		// @439: iconst_4
		// @43A: putstatic int game.C_100055_ed.field_104242_e
		// @43D: iconst_4
		// @43E: putstatic int game.C_100016_wi.field_103806_a
		// @441: new game.C_100302_ka
		// @444: dup
		// @445: invokespecial game.C_100302_ka.<init>()void
		// @448: astore #4
		// @44A: aload #4
		// @44C: getstatic game.C_100317_lb game.C_100318_hj.field_107197_e
		// @44F: putfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @452: aload #4
		// @454: ldc_w 10526880 (0xa0a0a0)
		// @457: putfield int game.C_100302_ka.field_101830_gb
		// @45A: new game.C_100302_ka
		// @45D: dup
		// @45E: ldc2_w -1
		// @461: aload #4
		// @463: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @466: astore #5
		// @468: aload #5
		// @46A: iconst_0
		// @46B: putfield int game.C_100302_ka.field_101830_gb
		// @46E: aload #5
		// @470: getstatic game.C_100037_wb[] game.C_100330_ig.field_107285_d
		// @473: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @476: new game.C_100302_ka
		// @479: dup
		// @47A: invokespecial game.C_100302_ka.<init>()void
		// @47D: astore #6
		// @47F: aload #6
		// @481: iconst_1
		// @482: putfield int game.C_100302_ka.field_101858_J
		// @485: aload #6
		// @487: getstatic game.C_100037_wb[] game.C_100090_l.field_104497_c
		// @48A: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @48D: aload #6
		// @48F: iconst_1
		// @490: putfield int game.C_100302_ka.field_101850_Fb
		// @493: new game.C_100302_ka
		// @496: dup
		// @497: ldc2_w -1
		// @49A: aload #5
		// @49C: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @49F: astore #7
		// @4A1: aload #7
		// @4A3: getstatic game.C_100037_wb[] game.C_100252_pn.field_105511_t
		// @4A6: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @4A9: aload #7
		// @4AB: iconst_1
		// @4AC: putfield int game.C_100302_ka.field_101850_Fb
		// @4AF: aload #7
		// @4B1: iconst_3
		// @4B2: putfield int game.C_100302_ka.field_101829_Db
		// @4B5: aload #7
		// @4B7: bipush 10 (0x0A)
		// @4B9: putfield int game.C_100302_ka.field_101833_ob
		// @4BC: aload #7
		// @4BE: ldc 2061990 (0x1f76a6)
		// @4C0: putfield int game.C_100302_ka.field_101830_gb
		// @4C3: aload #7
		// @4C5: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @4C8: putfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @4CB: aload #7
		// @4CD: getstatic game.C_100037_wb[] game.C_100073_f.field_101717_A
		// @4D0: putfield game.C_100037_wb[] game.C_100302_ka.field_101883_qb
		// @4D3: aload #7
		// @4D5: iconst_0
		// @4D6: putfield int game.C_100302_ka.field_101875_X
		// @4D9: aload #5
		// @4DB: iconst_1
		// @4DC: putfield int game.C_100302_ka.field_101850_Fb
		// @4DF: aload #5
		// @4E1: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @4E4: putfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @4E7: new game.C_100302_ka
		// @4EA: dup
		// @4EB: invokespecial game.C_100302_ka.<init>()void
		// @4EE: astore #8
		// @4F0: aload #8
		// @4F2: getstatic game.C_100037_wb[] game.C_100200_ba.field_105851_b
		// @4F5: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @4F8: aload #4
		// @4FA: iconst_1
		// @4FB: putfield int game.C_100302_ka.field_101858_J
		// @4FE: new game.C_100302_ka
		// @501: dup
		// @502: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @505: bipush 99 (0x63)
		// @507: aaload
		// @508: aconst_null
		// @509: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @50C: astore #9
		// @50E: aload #9
		// @510: putstatic game.C_100302_ka game.C_100220_ac.field_106057_b
		// @513: aload #9
		// @515: bipush 16 (0x10)
		// @517: sipush 370 (0x0172)
		// @51A: iconst_m1
		// @51B: bipush 60 (0x3C)
		// @51D: bipush 106 (0x6A)
		// @51F: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @522: iconst_4
		// @523: istore #10
		// @525: iconst_0
		// @526: istore #11
		// @528: bipush -5 (0xFB)
		// @52A: istore #12
		// @52C: iconst_0
		// @52D: istore #13
		// @52F: iload #13
		// @531: getstatic java.lang.String[][] game.C_100320_hh.field_102914_Q
		// @534: arraylength
		// @535: if_icmpge @B77
		// @538: getstatic java.lang.String[][] game.C_100320_hh.field_102914_Q
		// @53B: iload #13
		// @53D: aaload
		// @53E: astore #14
		// @540: iconst_0
		// @541: istore #15
		// @543: bipush -114 (0x8E)
		// @545: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @548: iload #31
		// @54A: ifne @B84
		// @54D: ifne @58B
		// @550: goto @554
		// @553: athrow
		// @554: iload #13
		// @556: iconst_m1
		// @557: ixor
		// @558: bipush -63 (0xC1)
		// @55A: if_icmpgt @56C
		// @55D: goto @561
		// @560: athrow
		// @561: bipush 63 (0x3F)
		// @563: iload #13
		// @565: if_icmpge @B6F
		// @568: goto @56C
		// @56B: athrow
		// @56C: iload #13
		// @56E: bipush 65 (0x41)
		// @570: if_icmplt @58B
		// @573: goto @577
		// @576: athrow
		// @577: iload #13
		// @579: bipush 67 (0x43)
		// @57B: if_icmpgt @58B
		// @57E: goto @582
		// @581: athrow
		// @582: iload #31
		// @584: ifeq @B6F
		// @587: goto @58B
		// @58A: athrow
		// @58B: iconst_0
		// @58C: istore #16
		// @58E: aload #14
		// @590: ifnull @B6F
		// @593: aload #14
		// @595: arraylength
		// @596: ifeq @B6F
		// @599: goto @59D
		// @59C: athrow
		// @59D: iconst_0
		// @59E: istore #17
		// @5A0: aload #14
		// @5A2: arraylength
		// @5A3: anewarray game.C_100302_ka
		// @5A6: astore #18
		// @5A8: iconst_0
		// @5A9: istore #19
		// @5AB: iconst_0
		// @5AC: istore #20
		// @5AE: iconst_0
		// @5AF: istore #21
		// @5B1: iconst_0
		// @5B2: istore #22
		// @5B4: iconst_0
		// @5B5: istore #23
		// @5B7: aload #14
		// @5B9: arraylength
		// @5BA: iconst_m1
		// @5BB: ixor
		// @5BC: iload #23
		// @5BE: iconst_m1
		// @5BF: ixor
		// @5C0: if_icmpge @998
		// @5C3: iconst_m1
		// @5C4: istore #24
		// @5C6: aload #14
		// @5C8: iload #23
		// @5CA: aaload
		// @5CB: astore #25
		// @5CD: iconst_0
		// @5CE: istore #26
		// @5D0: aload #25
		// @5D2: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @5D5: bipush 97 (0x61)
		// @5D7: aaload
		// @5D8: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @5DB: iload #31
		// @5DD: ifne @9B0
		// @5E0: ifeq @5FB
		// @5E3: goto @5E7
		// @5E6: athrow
		// @5E7: aload #25
		// @5E9: bipush 6 (0x06)
		// @5EB: invokevirtual java.lang.String.substring(int)java.lang.String
		// @5EE: astore #25
		// @5F0: bipush -42 (0xD6)
		// @5F2: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @5F5: ifne @5FB
		// @5F8: iconst_1
		// @5F9: istore #26
		// @5FB: aload #25
		// @5FD: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @600: bipush 93 (0x5D)
		// @602: aaload
		// @603: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @606: ifne @653
		// @609: aload #25
		// @60B: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @60E: bipush 96 (0x60)
		// @610: aaload
		// @611: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @614: ifeq @62C
		// @617: goto @61B
		// @61A: athrow
		// @61B: aload #25
		// @61D: bipush 8 (0x08)
		// @61F: invokevirtual java.lang.String.substring(int)java.lang.String
		// @622: astore #25
		// @624: iconst_1
		// @625: istore #24
		// @627: iload #31
		// @629: ifeq @65E
		// @62C: aload #25
		// @62E: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @631: bipush 94 (0x5E)
		// @633: aaload
		// @634: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @637: ifne @642
		// @63A: goto @63E
		// @63D: athrow
		// @63E: goto @65E
		// @641: athrow
		// @642: aload #25
		// @644: bipush 8 (0x08)
		// @646: invokevirtual java.lang.String.substring(int)java.lang.String
		// @649: astore #25
		// @64B: iconst_2
		// @64C: istore #24
		// @64E: iload #31
		// @650: ifeq @65E
		// @653: iconst_0
		// @654: istore #24
		// @656: aload #25
		// @658: iconst_5
		// @659: invokevirtual java.lang.String.substring(int)java.lang.String
		// @65C: astore #25
		// @65E: aload #25
		// @660: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @663: bipush 90 (0x5A)
		// @665: aaload
		// @666: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @669: ifne @924
		// @66C: aload #25
		// @66E: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @671: bipush 88 (0x58)
		// @673: aaload
		// @674: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @677: ifeq @690
		// @67A: goto @67E
		// @67D: athrow
		// @67E: aload #14
		// @680: iload #23
		// @682: aaload
		// @683: ldc_w ">"
		// @686: invokevirtual java.lang.String.endsWith(java.lang.String)boolean
		// @689: ifne @815
		// @68C: goto @690
		// @68F: athrow
		// @690: aload #25
		// @692: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @695: bipush 87 (0x57)
		// @697: aaload
		// @698: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @69B: ifeq @753
		// @69E: goto @6A2
		// @6A1: athrow
		// @6A2: aload #18
		// @6A4: iload #23
		// @6A6: new game.C_100302_ka
		// @6A9: dup
		// @6AA: iload #11
		// @6AC: i2l
		// @6AD: aload #5
		// @6AF: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @6B2: aastore
		// @6B3: iload #16
		// @6B5: ifne @6C2
		// @6B8: goto @6BC
		// @6BB: athrow
		// @6BC: iinc #12 +10
		// @6BF: iconst_1
		// @6C0: istore #16
		// @6C2: aload #18
		// @6C4: iload #23
		// @6C6: aaload
		// @6C7: aload #25
		// @6C9: iconst_3
		// @6CA: invokevirtual java.lang.String.substring(int)java.lang.String
		// @6CD: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @6D0: new game.C_100302_ka
		// @6D3: dup
		// @6D4: iload #11
		// @6D6: i2l
		// @6D7: aload #7
		// @6D9: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @6DC: astore #27
		// @6DE: aload #27
		// @6E0: aload #18
		// @6E2: iload #23
		// @6E4: aaload
		// @6E5: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @6E8: iconst_0
		// @6E9: invokestatic game.C_100096_un.func_104560_a(java.lang.String, boolean)java.lang.String
		// @6EC: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @6EF: iconst_3
		// @6F0: aload #27
		// @6F2: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @6F5: aload #27
		// @6F7: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @6FA: iconst_2
		// @6FB: aload #27
		// @6FD: getfield int game.C_100302_ka.field_101829_Db
		// @700: imul
		// @701: ineg
		// @702: bipush 106 (0x6A)
		// @704: iadd
		// @705: aload #27
		// @707: getfield int game.C_100302_ka.field_101833_ob
		// @70A: invokevirtual game.C_100112_r.func_101734_a(java.lang.String, int, int)int
		// @70D: iadd
		// @70E: istore #28
		// @710: aload #27
		// @712: iconst_0
		// @713: iload #28
		// @715: iload_1
		// @716: bipush -2 (0xFE)
		// @718: ixor
		// @719: iload #10
		// @71B: bipush 106 (0x6A)
		// @71D: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @720: aload #9
		// @722: iload_1
		// @723: bipush -74 (0xB6)
		// @725: ixor
		// @726: aload #27
		// @728: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @72B: iload #10
		// @72D: iload #28
		// @72F: bipush -4 (0xFC)
		// @731: isub
		// @732: iadd
		// @733: istore #10
		// @735: getstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @738: iload #11
		// @73A: aload #27
		// @73C: aastore
		// @73D: getstatic int[] game.C_100133_tk.field_104996_g
		// @740: iload #11
		// @742: iload #12
		// @744: bipush 10 (0x0A)
		// @746: isub
		// @747: iastore
		// @748: iinc #21 +1
		// @74B: iinc #11 +1
		// @74E: iload #31
		// @750: ifeq @96D
		// @753: getstatic boolean game.C_100216_aj.field_104462_t
		// @756: ifeq @770
		// @759: goto @75D
		// @75C: athrow
		// @75D: ldc_w ""
		// @760: aload #25
		// @762: sipush 25557 (0x63D5)
		// @765: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @768: bipush 95 (0x5F)
		// @76A: aaload
		// @76B: invokestatic game.C_100018_wk.func_101497_a(java.lang.String, java.lang.String, int, java.lang.String)java.lang.String
		// @76E: astore #25
		// @770: getstatic boolean game.C_100247_pa.field_106414_d
		// @773: ifne @78E
		// @776: getstatic java.lang.String game.C_100281_ng.field_103465_K
		// @779: aload #25
		// @77B: sipush 25557 (0x63D5)
		// @77E: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @781: bipush 92 (0x5C)
		// @783: aaload
		// @784: invokestatic game.C_100018_wk.func_101497_a(java.lang.String, java.lang.String, int, java.lang.String)java.lang.String
		// @787: astore #25
		// @789: iload #31
		// @78B: ifeq @7A3
		// @78E: getstatic java.lang.String game.C_100104_v.field_104698_j
		// @791: aload #25
		// @793: iload_1
		// @794: sipush 25556 (0x63D4)
		// @797: ixor
		// @798: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @79B: bipush 92 (0x5C)
		// @79D: aaload
		// @79E: invokestatic game.C_100018_wk.func_101497_a(java.lang.String, java.lang.String, int, java.lang.String)java.lang.String
		// @7A1: astore #25
		// @7A3: aload #18
		// @7A5: iload #23
		// @7A7: new game.C_100302_ka
		// @7AA: dup
		// @7AB: ldc2_w -1
		// @7AE: aload #4
		// @7B0: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @7B3: aastore
		// @7B4: aload #18
		// @7B6: iload #23
		// @7B8: aaload
		// @7B9: aload #25
		// @7BB: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @7BE: iload #19
		// @7C0: ifne @7C7
		// @7C3: goto @7D1
		// @7C6: athrow
		// @7C7: aload #18
		// @7C9: iload #23
		// @7CB: aaload
		// @7CC: bipush 19 (0x13)
		// @7CE: putfield int game.C_100302_ka.field_101833_ob
		// @7D1: iload #15
		// @7D3: ifne @7DA
		// @7D6: goto @7F9
		// @7D9: athrow
		// @7DA: aload #18
		// @7DC: iload #23
		// @7DE: aaload
		// @7DF: getstatic game.C_100037_wb[] game.C_100090_l.field_104497_c
		// @7E2: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @7E5: aload #18
		// @7E7: iload #23
		// @7E9: aaload
		// @7EA: bipush 8 (0x08)
		// @7EC: putfield int game.C_100302_ka.field_101829_Db
		// @7EF: aload #18
		// @7F1: iload #23
		// @7F3: aaload
		// @7F4: bipush 6 (0x06)
		// @7F6: putfield int game.C_100302_ka.field_101875_X
		// @7F9: iinc #21 +1
		// @7FC: iload #26
		// @7FE: ifne @805
		// @801: goto @96D
		// @804: athrow
		// @805: aload #18
		// @807: iload #23
		// @809: aaload
		// @80A: getstatic game.C_100037_wb game.C_100244_pe.field_106376_e
		// @80D: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @810: iload #31
		// @812: ifeq @96D
		// @815: aload #18
		// @817: iload #23
		// @819: new game.C_100302_ka
		// @81C: dup
		// @81D: ldc2_w -1
		// @820: aload #6
		// @822: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @825: aastore
		// @826: aload #25
		// @828: iconst_4
		// @829: iconst_m1
		// @82A: aload #25
		// @82C: invokevirtual java.lang.String.length()int
		// @82F: iadd
		// @830: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @833: invokestatic java.lang.Integer.parseInt(java.lang.String)int
		// @836: istore #27
		// @838: aload #18
		// @83A: iload #23
		// @83C: aaload
		// @83D: iload #27
		// @83F: iconst_1
		// @840: invokestatic game.C_100280_nf.func_101140_b(int, boolean)game.C_100037_wb
		// @843: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @846: iconst_0
		// @847: istore #28
		// @849: iconst_4
		// @84A: istore #29
		// @84C: bipush -101 (0x9B)
		// @84E: iload #27
		// @850: iconst_m1
		// @851: ixor
		// @852: if_icmplt @870
		// @855: iload #27
		// @857: iconst_m1
		// @858: ixor
		// @859: sipush -201 (0xFF37)
		// @85C: if_icmpgt @867
		// @85F: goto @863
		// @862: athrow
		// @863: goto @870
		// @866: athrow
		// @867: aload #18
		// @869: iload #23
		// @86B: aaload
		// @86C: aconst_null
		// @86D: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @870: iload #27
		// @872: iconst_m1
		// @873: ixor
		// @874: sipush -201 (0xFF37)
		// @877: if_icmple @8B7
		// @87A: iload #27
		// @87C: iconst_m1
		// @87D: ixor
		// @87E: bipush -6 (0xFA)
		// @880: if_icmpeq @8B7
		// @883: goto @887
		// @886: athrow
		// @887: iload #27
		// @889: bipush 7 (0x07)
		// @88B: if_icmpeq @8B7
		// @88E: goto @892
		// @891: athrow
		// @892: iload #27
		// @894: iconst_m1
		// @895: ixor
		// @896: bipush -10 (0xF6)
		// @898: if_icmpgt @8AC
		// @89B: goto @89F
		// @89E: athrow
		// @89F: bipush -13 (0xF3)
		// @8A1: iload #27
		// @8A3: iconst_m1
		// @8A4: ixor
		// @8A5: if_icmple @8B7
		// @8A8: goto @8AC
		// @8AB: athrow
		// @8AC: bipush 22 (0x16)
		// @8AE: iload #27
		// @8B0: if_icmpne @8C8
		// @8B3: goto @8B7
		// @8B6: athrow
		// @8B7: bipush 12 (0x0C)
		// @8B9: istore #29
		// @8BB: iload #20
		// @8BD: iconst_1
		// @8BE: iload #23
		// @8C0: ishl
		// @8C1: ior
		// @8C2: istore #20
		// @8C4: bipush 48 (0x30)
		// @8C6: istore #28
		// @8C8: iload #27
		// @8CA: iconst_m1
		// @8CB: ixor
		// @8CC: bipush -4 (0xFC)
		// @8CE: if_icmpne @8D4
		// @8D1: iconst_1
		// @8D2: istore #19
		// @8D4: aload #18
		// @8D6: iload #23
		// @8D8: aaload
		// @8D9: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @8DC: ifnonnull @8EE
		// @8DF: aload #18
		// @8E1: iload #23
		// @8E3: aaload
		// @8E4: getstatic game.C_100037_wb game.C_100042_we.field_104141_h
		// @8E7: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @8EA: goto @8EE
		// @8ED: athrow
		// @8EE: iload #26
		// @8F0: ifne @8F7
		// @8F3: goto @902
		// @8F6: athrow
		// @8F7: aload #18
		// @8F9: iload #23
		// @8FB: aaload
		// @8FC: getstatic game.C_100037_wb game.C_100136_th.field_102627_X
		// @8FF: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @902: iconst_0
		// @903: iload #28
		// @905: if_icmpne @918
		// @908: aload #18
		// @90A: iload #23
		// @90C: aaload
		// @90D: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @910: getfield int game.C_100037_wb.field_102339_s
		// @913: iload #29
		// @915: iadd
		// @916: istore #28
		// @918: iload #22
		// @91A: iload #28
		// @91C: iadd
		// @91D: istore #22
		// @91F: iload #31
		// @921: ifeq @96D
		// @924: iload_1
		// @925: bipush -112 (0x90)
		// @927: ixor
		// @928: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @92B: ifeq @93E
		// @92E: goto @932
		// @931: athrow
		// @932: iinc #17 +1
		// @935: iload #31
		// @937: ifeq @96D
		// @93A: goto @93E
		// @93D: athrow
		// @93E: aload #18
		// @940: iload #23
		// @942: new game.C_100302_ka
		// @945: dup
		// @946: ldc2_w -1
		// @949: aload #6
		// @94B: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @94E: aastore
		// @94F: aload #18
		// @951: iload #23
		// @953: aaload
		// @954: getstatic game.C_100037_wb game.C_100244_pe.field_106376_e
		// @957: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @95A: iload #22
		// @95C: aload #18
		// @95E: iload #23
		// @960: aaload
		// @961: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @964: getfield int game.C_100037_wb.field_102339_s
		// @967: bipush -4 (0xFC)
		// @969: isub
		// @96A: iadd
		// @96B: istore #22
		// @96D: iconst_0
		// @96E: iload #24
		// @970: iconst_m1
		// @971: ixor
		// @972: if_icmpeq @990
		// @975: aconst_null
		// @976: aload #18
		// @978: iload #23
		// @97A: aaload
		// @97B: if_acmpne @986
		// @97E: goto @982
		// @981: athrow
		// @982: goto @990
		// @985: athrow
		// @986: aload #18
		// @988: iload #23
		// @98A: aaload
		// @98B: iload #24
		// @98D: putfield int game.C_100302_ka.field_101858_J
		// @990: iinc #23 +1
		// @993: iload #31
		// @995: ifeq @5B7
		// @998: iload #22
		// @99A: iload #17
		// @99C: ineg
		// @99D: aload #14
		// @99F: arraylength
		// @9A0: iadd
		// @9A1: iconst_1
		// @9A2: iadd
		// @9A3: bipush 8 (0x08)
		// @9A5: imul
		// @9A6: iadd
		// @9A7: istore #22
		// @9A9: iconst_0
		// @9AA: istore #23
		// @9AC: iload #21
		// @9AE: iconst_m1
		// @9AF: ixor
		// @9B0: iconst_m1
		// @9B1: if_icmplt @9B8
		// @9B4: goto @9C3
		// @9B7: athrow
		// @9B8: sipush 470 (0x01D6)
		// @9BB: iload #22
		// @9BD: isub
		// @9BE: iload #21
		// @9C0: idiv
		// @9C1: istore #23
		// @9C3: iload #16
		// @9C5: ifne @9CC
		// @9C8: goto @9D1
		// @9CB: athrow
		// @9CC: sipush 464 (0x01D0)
		// @9CF: istore #23
		// @9D1: iconst_0
		// @9D2: istore #24
		// @9D4: iconst_0
		// @9D5: istore #25
		// @9D7: aload #18
		// @9D9: arraylength
		// @9DA: iconst_m1
		// @9DB: ixor
		// @9DC: iload #25
		// @9DE: iconst_m1
		// @9DF: ixor
		// @9E0: if_icmpge @A83
		// @9E3: aload #18
		// @9E5: iload #25
		// @9E7: aaload
		// @9E8: astore #26
		// @9EA: aload #26
		// @9EC: iload #31
		// @9EE: ifne @B78
		// @9F1: ifnull @A7B
		// @9F4: goto @9F8
		// @9F7: athrow
		// @9F8: iconst_0
		// @9F9: istore #27
		// @9FB: aconst_null
		// @9FC: aload #26
		// @9FE: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @A01: if_acmpeq @A36
		// @A04: iconst_0
		// @A05: iload #20
		// @A07: iconst_1
		// @A08: iload #25
		// @A0A: ishl
		// @A0B: iand
		// @A0C: if_icmpne @A24
		// @A0F: goto @A13
		// @A12: athrow
		// @A13: iconst_4
		// @A14: aload #26
		// @A16: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @A19: getfield int game.C_100037_wb.field_102337_u
		// @A1C: iadd
		// @A1D: istore #27
		// @A1F: iload #31
		// @A21: ifeq @A68
		// @A24: aload #26
		// @A26: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @A29: getfield int game.C_100037_wb.field_102337_u
		// @A2C: bipush 12 (0x0C)
		// @A2E: iadd
		// @A2F: istore #27
		// @A31: iload #31
		// @A33: ifeq @A68
		// @A36: iload #23
		// @A38: istore #28
		// @A3A: iload #15
		// @A3C: ifeq @A46
		// @A3F: iinc #28 +240
		// @A42: goto @A46
		// @A45: athrow
		// @A46: aload #26
		// @A48: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @A4B: aload #26
		// @A4D: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @A50: iload #28
		// @A52: aload #26
		// @A54: getfield int game.C_100302_ka.field_101833_ob
		// @A57: invokevirtual game.C_100112_r.func_101734_a(java.lang.String, int, int)int
		// @A5A: istore #27
		// @A5C: iload #15
		// @A5E: ifne @A65
		// @A61: goto @A68
		// @A64: athrow
		// @A65: iinc #27 +16
		// @A68: iload #27
		// @A6A: iconst_m1
		// @A6B: ixor
		// @A6C: iload #24
		// @A6E: iconst_m1
		// @A6F: ixor
		// @A70: if_icmplt @A77
		// @A73: goto @A7B
		// @A76: athrow
		// @A77: iload #27
		// @A79: istore #24
		// @A7B: iinc #25 +1
		// @A7E: iload #31
		// @A80: ifeq @9D7
		// @A83: bipush 8 (0x08)
		// @A85: istore #25
		// @A87: iload #16
		// @A89: ifne @A93
		// @A8C: iinc #25 +4
		// @A8F: goto @A93
		// @A92: athrow
		// @A93: bipush -2 (0xFE)
		// @A95: aload #18
		// @A97: arraylength
		// @A98: iconst_m1
		// @A99: ixor
		// @A9A: if_icmpne @ACD
		// @A9D: aload #18
		// @A9F: iconst_0
		// @AA0: aaload
		// @AA1: ifnull @ACD
		// @AA4: goto @AA8
		// @AA7: athrow
		// @AA8: aload #18
		// @AAA: iconst_0
		// @AAB: aaload
		// @AAC: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @AAF: ifnonnull @ABA
		// @AB2: goto @AB6
		// @AB5: athrow
		// @AB6: goto @ACD
		// @AB9: athrow
		// @ABA: aload #18
		// @ABC: iconst_0
		// @ABD: aaload
		// @ABE: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @AC1: getfield int game.C_100037_wb.field_102339_s
		// @AC4: ineg
		// @AC5: sipush 480 (0x01E0)
		// @AC8: iadd
		// @AC9: iconst_2
		// @ACA: idiv
		// @ACB: istore #25
		// @ACD: iconst_0
		// @ACE: istore #26
		// @AD0: aload #18
		// @AD2: arraylength
		// @AD3: iconst_m1
		// @AD4: ixor
		// @AD5: iload #26
		// @AD7: iconst_m1
		// @AD8: ixor
		// @AD9: if_icmpge @B66
		// @ADC: aload #18
		// @ADE: iload #26
		// @AE0: aaload
		// @AE1: astore #27
		// @AE3: aload #27
		// @AE5: iload #31
		// @AE7: ifne @B78
		// @AEA: ifnull @B5E
		// @AED: goto @AF1
		// @AF0: athrow
		// @AF1: iload #23
		// @AF3: istore #28
		// @AF5: iload #24
		// @AF7: istore #29
		// @AF9: aload #27
		// @AFB: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @AFE: ifnonnull @B05
		// @B01: goto @B35
		// @B04: athrow
		// @B05: iconst_4
		// @B06: istore #30
		// @B08: iload #30
		// @B0A: aload #27
		// @B0C: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @B0F: getfield int game.C_100037_wb.field_102339_s
		// @B12: iadd
		// @B13: istore #28
		// @B15: iload #30
		// @B17: aload #27
		// @B19: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @B1C: getfield int game.C_100037_wb.field_102337_u
		// @B1F: iadd
		// @B20: istore #29
		// @B22: iconst_0
		// @B23: iload #20
		// @B25: iconst_1
		// @B26: iload #26
		// @B28: ishl
		// @B29: iand
		// @B2A: if_icmpeq @B35
		// @B2D: bipush 48 (0x30)
		// @B2F: istore #29
		// @B31: bipush 48 (0x30)
		// @B33: istore #28
		// @B35: aload #27
		// @B37: iload #25
		// @B39: iload #29
		// @B3B: iconst_m1
		// @B3C: iload #24
		// @B3E: iload #29
		// @B40: ineg
		// @B41: iadd
		// @B42: iconst_2
		// @B43: idiv
		// @B44: iload #12
		// @B46: iadd
		// @B47: iload #28
		// @B49: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @B4C: iload #25
		// @B4E: iload #28
		// @B50: bipush 8 (0x08)
		// @B52: iadd
		// @B53: iadd
		// @B54: istore #25
		// @B56: aload_3
		// @B57: bipush -111 (0x91)
		// @B59: aload #27
		// @B5B: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @B5E: iinc #26 +1
		// @B61: iload #31
		// @B63: ifeq @AD0
		// @B66: iload #12
		// @B68: iconst_4
		// @B69: iload #24
		// @B6B: iadd
		// @B6C: iadd
		// @B6D: istore #12
		// @B6F: iinc #13 +1
		// @B72: iload #31
		// @B74: ifeq @52F
		// @B77: aload_3
		// @B78: iconst_0
		// @B79: iload #12
		// @B7B: iconst_m1
		// @B7C: iconst_0
		// @B7D: sipush 480 (0x01E0)
		// @B80: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @B83: iconst_0
		// @B84: istore #13
		// @B86: iload #13
		// @B88: iload #11
		// @B8A: if_icmpge @BE7
		// @B8D: new game.C_100302_ka
		// @B90: dup
		// @B91: ldc2_w -1
		// @B94: aload #8
		// @B96: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @B99: iload #31
		// @B9B: ifne @BEE
		// @B9E: astore #14
		// @BA0: iconst_0
		// @BA1: iconst_5
		// @BA2: getstatic int[] game.C_100133_tk.field_104996_g
		// @BA5: iload #13
		// @BA7: iaload
		// @BA8: iadd
		// @BA9: iadd
		// @BAA: istore #15
		// @BAC: iload #11
		// @BAE: iconst_1
		// @BAF: iload #13
		// @BB1: iadd
		// @BB2: if_icmpgt @BBB
		// @BB5: iload #12
		// @BB7: goto @BC3
		// @BBA: athrow
		// @BBB: getstatic int[] game.C_100133_tk.field_104996_g
		// @BBE: iconst_1
		// @BBF: iload #13
		// @BC1: iadd
		// @BC2: iaload
		// @BC3: istore #16
		// @BC5: aload #14
		// @BC7: iconst_4
		// @BC8: iload #15
		// @BCA: ineg
		// @BCB: iload #16
		// @BCD: iadd
		// @BCE: iconst_m1
		// @BCF: iload #15
		// @BD1: sipush 472 (0x01D8)
		// @BD4: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @BD7: aload_3
		// @BD8: bipush -83 (0xAD)
		// @BDA: aload #14
		// @BDC: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @BDF: iinc #13 +1
		// @BE2: iload #31
		// @BE4: ifeq @B86
		// @BE7: new game.C_100302_ka
		// @BEA: dup
		// @BEB: invokespecial game.C_100302_ka.<init>()void
		// @BEE: astore #13
		// @BF0: aload #13
		// @BF2: getstatic game.C_100037_wb[] game.C_100025_he.field_103935_c
		// @BF5: iconst_0
		// @BF6: aaload
		// @BF7: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @BFA: aload #13
		// @BFC: getstatic game.C_100037_wb[] game.C_100025_he.field_103935_c
		// @BFF: iconst_1
		// @C00: aaload
		// @C01: putfield game.C_100037_wb game.C_100302_ka.field_101844_pb
		// @C04: new game.C_100302_ka
		// @C07: dup
		// @C08: invokespecial game.C_100302_ka.<init>()void
		// @C0B: astore #14
		// @C0D: aload #14
		// @C0F: getstatic game.C_100037_wb[] game.C_100249_pc.field_102328_G
		// @C12: iconst_1
		// @C13: aaload
		// @C14: putfield game.C_100037_wb game.C_100302_ka.field_101844_pb
		// @C17: aload #14
		// @C19: getstatic game.C_100037_wb[] game.C_100249_pc.field_102328_G
		// @C1C: iconst_0
		// @C1D: aaload
		// @C1E: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @C21: new game.C_100302_ka
		// @C24: dup
		// @C25: invokespecial game.C_100302_ka.<init>()void
		// @C28: astore #15
		// @C2A: aload #15
		// @C2C: getstatic game.C_100037_wb[] game.C_100056_de.field_103188_nb
		// @C2F: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @C32: new game.C_100302_ka
		// @C35: dup
		// @C36: invokespecial game.C_100302_ka.<init>()void
		// @C39: astore #16
		// @C3B: aload #16
		// @C3D: getstatic game.C_100037_wb[] game.C_100189_ri.field_105755_c
		// @C40: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @C43: new game.C_100231_oc
		// @C46: dup
		// @C47: ldc_w ""
		// @C4A: aload #13
		// @C4C: aload #14
		// @C4E: aload #15
		// @C50: aload #16
		// @C52: invokespecial game.C_100231_oc.<init>(java.lang.String, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka)void
		// @C55: astore #17
		// @C57: new game.C_100115_ej
		// @C5A: dup
		// @C5B: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @C5E: bipush 91 (0x5B)
		// @C60: aaload
		// @C61: aload_3
		// @C62: aconst_null
		// @C63: aload #17
		// @C65: invokespecial game.C_100115_ej.<init>(java.lang.String, game.C_100302_ka, game.C_100302_ka, game.C_100231_oc)void
		// @C68: astore #18
		// @C6A: aload #18
		// @C6C: putstatic game.C_100115_ej game.C_100295_kh.field_105299_j
		// @C6F: aload #18
		// @C71: getstatic int game.C_100016_wi.field_103806_a
		// @C74: sipush 358 (0x0166)
		// @C77: iconst_0
		// @C78: iconst_0
		// @C79: sipush 480 (0x01E0)
		// @C7C: getstatic int game.C_100104_v.field_104692_c
		// @C7F: iadd
		// @C80: iconst_4
		// @C81: getstatic int game.C_100104_v.field_104692_c
		// @C84: invokevirtual game.C_100115_ej.func_102030_a(int, int, int, int, int, int, int)void
		// @C87: aload #18
		// @C89: aconst_null
		// @C8A: putfield game.C_100037_wb[] game.C_100115_ej.field_101862_T
		// @C8D: new game.C_100302_ka
		// @C90: dup
		// @C91: ldc2_w -1
		// @C94: aconst_null
		// @C95: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @C98: astore #19
		// @C9A: aload #19
		// @C9C: getstatic game.C_100037_wb[] game.C_100090_l.field_104497_c
		// @C9F: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @CA2: aload #19
		// @CA4: bipush -117 (0x8B)
		// @CA6: aload #18
		// @CA8: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @CAB: aload #19
		// @CAD: bipush 126 (0x7E)
		// @CAF: sipush 366 (0x016E)
		// @CB2: iload_1
		// @CB3: bipush -2 (0xFE)
		// @CB5: iadd
		// @CB6: bipush 64 (0x40)
		// @CB8: iconst_4
		// @CB9: sipush 480 (0x01E0)
		// @CBC: getstatic int game.C_100104_v.field_104692_c
		// @CBF: iadd
		// @CC0: iadd
		// @CC1: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @CC4: getstatic game.C_100302_ka game.C_100145_ta.field_100429_j
		// @CC7: iload_1
		// @CC8: bipush -111 (0x91)
		// @CCA: iadd
		// @CCB: aload #19
		// @CCD: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @CD0: getstatic game.C_100302_ka game.C_100145_ta.field_100429_j
		// @CD3: bipush -119 (0x89)
		// @CD5: aload #9
		// @CD7: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @CDA: bipush -2 (0xFE)
		// @CDC: iload #10
		// @CDE: ineg
		// @CDF: aload #9
		// @CE1: getfield int game.C_100302_ka.field_101848_lb
		// @CE4: iadd
		// @CE5: iadd
		// @CE6: iload #11
		// @CE8: ineg
		// @CE9: isub
		// @CEA: istore #20
		// @CEC: iload_1
		// @CED: iload #11
		// @CEF: if_icmplt @CF6
		// @CF2: goto @D59
		// @CF5: athrow
		// @CF6: iload #20
		// @CF8: iconst_m1
		// @CF9: iload #11
		// @CFB: iadd
		// @CFC: idiv
		// @CFD: istore #20
		// @CFF: iconst_0
		// @D00: istore #21
		// @D02: aload #9
		// @D04: getfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @D07: iload_1
		// @D08: bipush 87 (0x57)
		// @D0A: iadd
		// @D0B: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @D0E: checkcast game.C_100302_ka
		// @D11: astore #22
		// @D13: aload #22
		// @D15: ifnull @D59
		// @D18: aload #22
		// @D1A: aload #22
		// @D1C: getfield int game.C_100302_ka.field_101841_Pb
		// @D1F: aload #22
		// @D21: getfield int game.C_100302_ka.field_101848_lb
		// @D24: iconst_m1
		// @D25: iload #21
		// @D27: aload #22
		// @D29: getfield int game.C_100302_ka.field_101880_Gb
		// @D2C: iadd
		// @D2D: aload #22
		// @D2F: getfield int game.C_100302_ka.field_101886_Kb
		// @D32: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @D35: iload #21
		// @D37: iload #20
		// @D39: iadd
		// @D3A: istore #21
		// @D3C: aload #9
		// @D3E: getfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @D41: bipush 110 (0x6E)
		// @D43: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @D46: checkcast game.C_100302_ka
		// @D49: astore #22
		// @D4B: iload #31
		// @D4D: ifne @D7E
		// @D50: iload #31
		// @D52: ifeq @D13
		// @D55: goto @D59
		// @D58: athrow
		// @D59: goto @D7E
		// @D5C: astore_2
		// @D5D: aload_2
		// @D5E: new java.lang.StringBuilder
		// @D61: dup
		// @D62: invokespecial java.lang.StringBuilder.<init>()void
		// @D65: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @D68: bipush 89 (0x59)
		// @D6A: aaload
		// @D6B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D6E: iload_1
		// @D6F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D72: bipush 41 (0x29)
		// @D74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D77: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D7A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D7D: athrow
		// @D7E: return
	}
	
	private final void func_104010_a(byte arg0, boolean arg1, int arg2)
	{
		// @0000: getstatic int game.SteelSentinels.field_105275_O
		// @0003: istore #10
		// @0005: iload_1
		// @0006: iconst_5
		// @0007: if_icmpeq @0016
		// @000A: aload_0
		// @000B: iconst_1
		// @000C: bipush 114 (0x72)
		// @000E: invokespecial game.C_100034_gi.func_104003_a(int, byte)boolean
		// @0011: pop
		// @0012: goto @0016
		// @0015: athrow
		// @0016: aload_0
		// @0017: getfield int game.C_100034_gi.field_104030_e
		// @001A: iconst_m1
		// @001B: ixor
		// @001C: bipush -19 (0xED)
		// @001E: if_icmpeq @0025
		// @0021: goto @0026
		// @0024: athrow
		// @0025: return
		// @0026: aload_0
		// @0027: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @002A: iconst_1
		// @002B: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @002E: istore #4
		// @0030: getstatic int[][] game.C_100012_fh.field_100515_K
		// @0033: aload_0
		// @0034: getfield int game.C_100034_gi.field_104030_e
		// @0037: aaload
		// @0038: iload_3
		// @0039: iaload
		// @003A: istore #5
		// @003C: iconst_0
		// @003D: iload #5
		// @003F: iconst_m1
		// @0040: ixor
		// @0041: if_icmpeq @006B
		// @0044: aload_0
		// @0045: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0048: getfield boolean game.C_100333_ij.field_107356_i
		// @004B: ifeq @006B
		// @004E: goto @0052
		// @0051: athrow
		// @0052: aload_0
		// @0053: iload_3
		// @0054: bipush -4 (0xFC)
		// @0056: invokespecial game.C_100034_gi.func_103977_a(int, int)boolean
		// @0059: ifeq @006B
		// @005C: goto @0060
		// @005F: athrow
		// @0060: bipush 97 (0x61)
		// @0062: bipush 8 (0x08)
		// @0064: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @0067: goto @006B
		// @006A: athrow
		// @006B: iload #5
		// @006D: istore #6
		// @006F: iconst_m1
		// @0070: iload #6
		// @0072: if_icmpne @007E
		// @0075: iload #10
		// @0077: ifeq @032F
		// @007A: goto @007E
		// @007D: athrow
		// @007E: bipush 38 (0x26)
		// @0080: iload #6
		// @0082: if_icmpeq @0337
		// @0085: goto @0089
		// @0088: athrow
		// @0089: iload #6
		// @008B: iconst_m1
		// @008C: ixor
		// @008D: bipush -40 (0xD8)
		// @008F: if_icmpeq @038F
		// @0092: goto @0096
		// @0095: athrow
		// @0096: iload #6
		// @0098: bipush 37 (0x25)
		// @009A: if_icmpne @00AA
		// @009D: goto @00A1
		// @00A0: athrow
		// @00A1: iload #10
		// @00A3: ifeq @03A5
		// @00A6: goto @00AA
		// @00A9: athrow
		// @00AA: iload #6
		// @00AC: iconst_m1
		// @00AD: ixor
		// @00AE: bipush -42 (0xD6)
		// @00B0: if_icmpeq @03F3
		// @00B3: goto @00B7
		// @00B6: athrow
		// @00B7: iload #6
		// @00B9: ifeq @0422
		// @00BC: goto @00C0
		// @00BF: athrow
		// @00C0: bipush -47 (0xD1)
		// @00C2: iload #6
		// @00C4: iconst_m1
		// @00C5: ixor
		// @00C6: if_icmpne @00D6
		// @00C9: goto @00CD
		// @00CC: athrow
		// @00CD: iload #10
		// @00CF: ifeq @04C2
		// @00D2: goto @00D6
		// @00D5: athrow
		// @00D6: bipush 33 (0x21)
		// @00D8: iload #6
		// @00DA: if_icmpeq @04F8
		// @00DD: goto @00E1
		// @00E0: athrow
		// @00E1: bipush -2 (0xFE)
		// @00E3: iload #6
		// @00E5: iconst_m1
		// @00E6: ixor
		// @00E7: if_icmpne @00F7
		// @00EA: goto @00EE
		// @00ED: athrow
		// @00EE: iload #10
		// @00F0: ifeq @0573
		// @00F3: goto @00F7
		// @00F6: athrow
		// @00F7: bipush -3 (0xFD)
		// @00F9: iload #6
		// @00FB: iconst_m1
		// @00FC: ixor
		// @00FD: if_icmpeq @0621
		// @0100: goto @0104
		// @0103: athrow
		// @0104: iload #6
		// @0106: iconst_m1
		// @0107: ixor
		// @0108: bipush -8 (0xF8)
		// @010A: if_icmpeq @0647
		// @010D: goto @0111
		// @0110: athrow
		// @0111: iload #6
		// @0113: bipush 24 (0x18)
		// @0115: if_icmpeq @06F0
		// @0118: goto @011C
		// @011B: athrow
		// @011C: iload #6
		// @011E: bipush 22 (0x16)
		// @0120: if_icmpeq @0744
		// @0123: goto @0127
		// @0126: athrow
		// @0127: bipush 27 (0x1B)
		// @0129: iload #6
		// @012B: if_icmpne @013B
		// @012E: goto @0132
		// @0131: athrow
		// @0132: iload #10
		// @0134: ifeq @0794
		// @0137: goto @013B
		// @013A: athrow
		// @013B: iload #6
		// @013D: bipush 28 (0x1C)
		// @013F: if_icmpne @014F
		// @0142: goto @0146
		// @0145: athrow
		// @0146: iload #10
		// @0148: ifeq @07FF
		// @014B: goto @014F
		// @014E: athrow
		// @014F: iload #6
		// @0151: iconst_m1
		// @0152: ixor
		// @0153: bipush -6 (0xFA)
		// @0155: if_icmpne @0165
		// @0158: goto @015C
		// @015B: athrow
		// @015C: iload #10
		// @015E: ifeq @08F1
		// @0161: goto @0165
		// @0164: athrow
		// @0165: iload #6
		// @0167: bipush 8 (0x08)
		// @0169: if_icmpeq @0948
		// @016C: goto @0170
		// @016F: athrow
		// @0170: iload #6
		// @0172: iconst_4
		// @0173: if_icmpeq @09D3
		// @0176: goto @017A
		// @0179: athrow
		// @017A: bipush -4 (0xFC)
		// @017C: iload #6
		// @017E: iconst_m1
		// @017F: ixor
		// @0180: if_icmpne @0190
		// @0183: goto @0187
		// @0186: athrow
		// @0187: iload #10
		// @0189: ifeq @0A22
		// @018C: goto @0190
		// @018F: athrow
		// @0190: bipush 20 (0x14)
		// @0192: iload #6
		// @0194: if_icmpeq @0A8B
		// @0197: goto @019B
		// @019A: athrow
		// @019B: bipush -22 (0xEA)
		// @019D: iload #6
		// @019F: iconst_m1
		// @01A0: ixor
		// @01A1: if_icmpeq @0BE0
		// @01A4: goto @01A8
		// @01A7: athrow
		// @01A8: bipush -7 (0xF9)
		// @01AA: iload #6
		// @01AC: iconst_m1
		// @01AD: ixor
		// @01AE: if_icmpne @01BE
		// @01B1: goto @01B5
		// @01B4: athrow
		// @01B5: iload #10
		// @01B7: ifeq @0CD2
		// @01BA: goto @01BE
		// @01BD: athrow
		// @01BE: bipush -10 (0xF6)
		// @01C0: iload #6
		// @01C2: iconst_m1
		// @01C3: ixor
		// @01C4: if_icmpeq @0D0E
		// @01C7: goto @01CB
		// @01CA: athrow
		// @01CB: iload #6
		// @01CD: iconst_m1
		// @01CE: ixor
		// @01CF: bipush -11 (0xF5)
		// @01D1: if_icmpne @01E1
		// @01D4: goto @01D8
		// @01D7: athrow
		// @01D8: iload #10
		// @01DA: ifeq @0E0F
		// @01DD: goto @01E1
		// @01E0: athrow
		// @01E1: iload #6
		// @01E3: iconst_m1
		// @01E4: ixor
		// @01E5: bipush -12 (0xF4)
		// @01E7: if_icmpne @01F7
		// @01EA: goto @01EE
		// @01ED: athrow
		// @01EE: iload #10
		// @01F0: ifeq @0E37
		// @01F3: goto @01F7
		// @01F6: athrow
		// @01F7: iload #6
		// @01F9: bipush 12 (0x0C)
		// @01FB: if_icmpne @020B
		// @01FE: goto @0202
		// @0201: athrow
		// @0202: iload #10
		// @0204: ifeq @0E5F
		// @0207: goto @020B
		// @020A: athrow
		// @020B: bipush 13 (0x0D)
		// @020D: iload #6
		// @020F: if_icmpeq @0E87
		// @0212: goto @0216
		// @0215: athrow
		// @0216: iload #6
		// @0218: iconst_m1
		// @0219: ixor
		// @021A: bipush -15 (0xF1)
		// @021C: if_icmpeq @0EF7
		// @021F: goto @0223
		// @0222: athrow
		// @0223: iload #6
		// @0225: iconst_m1
		// @0226: ixor
		// @0227: bipush -16 (0xF0)
		// @0229: if_icmpeq @0F13
		// @022C: goto @0230
		// @022F: athrow
		// @0230: bipush 16 (0x10)
		// @0232: iload #6
		// @0234: if_icmpeq @0F2F
		// @0237: goto @023B
		// @023A: athrow
		// @023B: bipush -18 (0xEE)
		// @023D: iload #6
		// @023F: iconst_m1
		// @0240: ixor
		// @0241: if_icmpeq @0F4B
		// @0244: goto @0248
		// @0247: athrow
		// @0248: iload #6
		// @024A: iconst_m1
		// @024B: ixor
		// @024C: bipush -19 (0xED)
		// @024E: if_icmpeq @0F67
		// @0251: goto @0255
		// @0254: athrow
		// @0255: bipush -24 (0xE8)
		// @0257: iload #6
		// @0259: iconst_m1
		// @025A: ixor
		// @025B: if_icmpeq @0F83
		// @025E: goto @0262
		// @0261: athrow
		// @0262: bipush 25 (0x19)
		// @0264: iload #6
		// @0266: if_icmpne @0276
		// @0269: goto @026D
		// @026C: athrow
		// @026D: iload #10
		// @026F: ifeq @103A
		// @0272: goto @0276
		// @0275: athrow
		// @0276: bipush -27 (0xE5)
		// @0278: iload #6
		// @027A: iconst_m1
		// @027B: ixor
		// @027C: if_icmpne @028C
		// @027F: goto @0283
		// @0282: athrow
		// @0283: iload #10
		// @0285: ifeq @1076
		// @0288: goto @028C
		// @028B: athrow
		// @028C: bipush 19 (0x13)
		// @028E: iload #6
		// @0290: if_icmpne @02A0
		// @0293: goto @0297
		// @0296: athrow
		// @0297: iload #10
		// @0299: ifeq @10B4
		// @029C: goto @02A0
		// @029F: athrow
		// @02A0: iload #6
		// @02A2: bipush 34 (0x22)
		// @02A4: if_icmpne @02B4
		// @02A7: goto @02AB
		// @02AA: athrow
		// @02AB: iload #10
		// @02AD: ifeq @10D7
		// @02B0: goto @02B4
		// @02B3: athrow
		// @02B4: iload #6
		// @02B6: bipush 40 (0x28)
		// @02B8: if_icmpeq @113A
		// @02BB: goto @02BF
		// @02BE: athrow
		// @02BF: bipush 35 (0x23)
		// @02C1: iload #6
		// @02C3: if_icmpeq @119A
		// @02C6: goto @02CA
		// @02C9: athrow
		// @02CA: bipush -46 (0xD2)
		// @02CC: iload #6
		// @02CE: iconst_m1
		// @02CF: ixor
		// @02D0: if_icmpne @02E0
		// @02D3: goto @02D7
		// @02D6: athrow
		// @02D7: iload #10
		// @02D9: ifeq @11F1
		// @02DC: goto @02E0
		// @02DF: athrow
		// @02E0: bipush -43 (0xD5)
		// @02E2: iload #6
		// @02E4: iconst_m1
		// @02E5: ixor
		// @02E6: if_icmpeq @1241
		// @02E9: goto @02ED
		// @02EC: athrow
		// @02ED: iload #6
		// @02EF: iconst_m1
		// @02F0: ixor
		// @02F1: bipush -44 (0xD4)
		// @02F3: if_icmpne @0303
		// @02F6: goto @02FA
		// @02F9: athrow
		// @02FA: iload #10
		// @02FC: ifeq @1293
		// @02FF: goto @0303
		// @0302: athrow
		// @0303: bipush -45 (0xD3)
		// @0305: iload #6
		// @0307: iconst_m1
		// @0308: ixor
		// @0309: if_icmpne @0319
		// @030C: goto @0310
		// @030F: athrow
		// @0310: iload #10
		// @0312: ifeq @12F9
		// @0315: goto @0319
		// @0318: athrow
		// @0319: iload #6
		// @031B: iconst_m1
		// @031C: ixor
		// @031D: bipush -48 (0xD0)
		// @031F: if_icmpne @13C2
		// @0322: goto @0326
		// @0325: athrow
		// @0326: iload #10
		// @0328: ifeq @135D
		// @032B: goto @032F
		// @032E: athrow
		// @032F: iconst_0
		// @0330: istore #4
		// @0332: iload #10
		// @0334: ifeq @13C2
		// @0337: aload_0
		// @0338: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @033B: iconst_1
		// @033C: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @033F: ifeq @13C2
		// @0342: goto @0346
		// @0345: athrow
		// @0346: bipush -20 (0xEC)
		// @0348: aload_0
		// @0349: getfield int game.C_100034_gi.field_104030_e
		// @034C: iconst_m1
		// @034D: ixor
		// @034E: if_icmpne @0360
		// @0351: goto @0355
		// @0354: athrow
		// @0355: iload_3
		// @0356: bipush 10 (0x0A)
		// @0358: idiv
		// @0359: putstatic int game.C_100194_rd.field_103072_v
		// @035C: goto @0360
		// @035F: athrow
		// @0360: aload_0
		// @0361: getstatic int game.C_100194_rd.field_103072_v
		// @0364: bipush -4 (0xFC)
		// @0366: iload_3
		// @0367: bipush 10 (0x0A)
		// @0369: irem
		// @036A: invokespecial game.C_100034_gi.func_104007_b(int, int, int)boolean
		// @036D: ifeq @13C2
		// @0370: iload_3
		// @0371: bipush 10 (0x0A)
		// @0373: irem
		// @0374: putstatic int game.C_100197_ra.field_100867_r
		// @0377: sipush 500 (0x01F4)
		// @037A: putstatic int game.C_100043_vl.field_101943_Yb
		// @037D: iload_2
		// @037E: istore #6
		// @0380: iload #6
		// @0382: bipush 20 (0x14)
		// @0384: bipush -105 (0x97)
		// @0386: iconst_0
		// @0387: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @038A: iload #10
		// @038C: ifeq @13C2
		// @038F: iconst_0
		// @0390: iload_2
		// @0391: aload_0
		// @0392: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0395: iconst_1
		// @0396: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0399: invokestatic game.C_100004_gb.func_103565_a(boolean, boolean, boolean)void
		// @039C: iload #10
		// @039E: ifeq @13C2
		// @03A1: goto @03A5
		// @03A4: athrow
		// @03A5: aload_0
		// @03A6: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @03A9: iconst_1
		// @03AA: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @03AD: ifne @03B8
		// @03B0: goto @03B4
		// @03B3: athrow
		// @03B4: goto @13C2
		// @03B7: athrow
		// @03B8: getstatic boolean game.C_100050_vg.field_100637_q
		// @03BB: ifne @03C3
		// @03BE: iconst_1
		// @03BF: goto @03C4
		// @03C2: athrow
		// @03C3: iconst_0
		// @03C4: putstatic boolean game.C_100050_vg.field_100637_q
		// @03C7: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @03CA: bipush 37 (0x25)
		// @03CC: getstatic boolean game.C_100050_vg.field_100637_q
		// @03CF: ifne @03D9
		// @03D2: getstatic java.lang.String game.C_100081_ue.field_100675_m
		// @03D5: goto @03DC
		// @03D8: athrow
		// @03D9: getstatic java.lang.String game.C_100316_lc.field_102413_t
		// @03DC: aastore
		// @03DD: bipush -25 (0xE7)
		// @03DF: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @03E2: ifeq @03E9
		// @03E5: goto @13C2
		// @03E8: athrow
		// @03E9: bipush 124 (0x7C)
		// @03EB: invokestatic game.C_100017_wj.func_103813_b(byte)void
		// @03EE: iload #10
		// @03F0: ifeq @13C2
		// @03F3: aload_0
		// @03F4: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @03F7: iconst_1
		// @03F8: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @03FB: ifne @0406
		// @03FE: goto @0402
		// @0401: athrow
		// @0402: goto @13C2
		// @0405: athrow
		// @0406: sipush -22169 (0xA967)
		// @0409: invokestatic game.C_100185_rm.func_105473_b(int)void
		// @040C: bipush -25 (0xE7)
		// @040E: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @0411: ifne @13C2
		// @0414: bipush 109 (0x6D)
		// @0416: invokestatic game.C_100017_wj.func_103813_b(byte)void
		// @0419: iload #10
		// @041B: ifeq @13C2
		// @041E: goto @0422
		// @0421: athrow
		// @0422: aload_0
		// @0423: iload_3
		// @0424: bipush -4 (0xFC)
		// @0426: invokespecial game.C_100034_gi.func_103977_a(int, int)boolean
		// @0429: ifeq @04BA
		// @042C: goto @0430
		// @042F: athrow
		// @0430: aload_0
		// @0431: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0434: iconst_1
		// @0435: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0438: ifeq @13C2
		// @043B: goto @043F
		// @043E: athrow
		// @043F: aload_0
		// @0440: iconst_1
		// @0441: bipush -4 (0xFC)
		// @0443: iconst_0
		// @0444: invokespecial game.C_100034_gi.func_104007_b(int, int, int)boolean
		// @0447: ifne @045B
		// @044A: goto @044E
		// @044D: athrow
		// @044E: aload_0
		// @044F: getfield int game.C_100034_gi.field_104030_e
		// @0452: bipush 20 (0x14)
		// @0454: if_icmpne @046D
		// @0457: goto @045B
		// @045A: athrow
		// @045B: iload_2
		// @045C: istore #6
		// @045E: iload #6
		// @0460: bipush 19 (0x13)
		// @0462: bipush -113 (0x8F)
		// @0464: iconst_0
		// @0465: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @0468: iload #10
		// @046A: ifeq @13C2
		// @046D: getstatic int[] game.C_100275_na.field_103087_l
		// @0470: iconst_0
		// @0471: iaload
		// @0472: putstatic int game.C_100197_ra.field_100867_r
		// @0475: iconst_0
		// @0476: putstatic int game.C_100194_rd.field_103072_v
		// @0479: iload_2
		// @047A: istore #6
		// @047C: getstatic int game.C_100050_vg.field_100632_k
		// @047F: istore #7
		// @0481: iconst_5
		// @0482: iload #7
		// @0484: if_icmpeq @04A3
		// @0487: iload #7
		// @0489: bipush 6 (0x06)
		// @048B: if_icmpeq @04A3
		// @048E: goto @0492
		// @0491: athrow
		// @0492: iload #7
		// @0494: iconst_m1
		// @0495: ixor
		// @0496: bipush -9 (0xF7)
		// @0498: if_icmpeq @04A3
		// @049B: goto @049F
		// @049E: athrow
		// @049F: goto @04A8
		// @04A2: athrow
		// @04A3: getstatic int game.C_100069_vb.field_104357_e
		// @04A6: istore #7
		// @04A8: iload #6
		// @04AA: bipush 20 (0x14)
		// @04AC: iload_1
		// @04AD: bipush -96 (0xA0)
		// @04AF: iadd
		// @04B0: iload #7
		// @04B2: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @04B5: iload #10
		// @04B7: ifeq @13C2
		// @04BA: iconst_0
		// @04BB: istore #4
		// @04BD: iload #10
		// @04BF: ifeq @13C2
		// @04C2: aload_0
		// @04C3: iload_3
		// @04C4: iload_1
		// @04C5: bipush -9 (0xF7)
		// @04C7: iadd
		// @04C8: invokespecial game.C_100034_gi.func_103977_a(int, int)boolean
		// @04CB: ifne @04DA
		// @04CE: goto @04D2
		// @04D1: athrow
		// @04D2: iconst_0
		// @04D3: istore #4
		// @04D5: iload #10
		// @04D7: ifeq @13C2
		// @04DA: aload_0
		// @04DB: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @04DE: iconst_1
		// @04DF: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @04E2: ifne @04ED
		// @04E5: goto @04E9
		// @04E8: athrow
		// @04E9: goto @13C2
		// @04EC: athrow
		// @04ED: bipush 66 (0x42)
		// @04EF: invokestatic game.C_100029_gn.func_103356_l(int)boolean
		// @04F2: pop
		// @04F3: iload #10
		// @04F5: ifeq @13C2
		// @04F8: aload_0
		// @04F9: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @04FC: iconst_1
		// @04FD: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0500: ifeq @13C2
		// @0503: goto @0507
		// @0506: athrow
		// @0507: iconst_m1
		// @0508: putstatic int game.C_100068_vc.field_104343_e
		// @050B: iload_1
		// @050C: bipush -89 (0xA7)
		// @050E: iadd
		// @050F: invokestatic game.C_100288_jn.func_106838_b(int)boolean
		// @0512: ifne @0528
		// @0515: goto @0519
		// @0518: athrow
		// @0519: getstatic java.lang.String game.C_100125_tm.field_100749_m
		// @051C: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @051F: iload #10
		// @0521: ifeq @13C2
		// @0524: goto @0528
		// @0527: athrow
		// @0528: iconst_4
		// @0529: putstatic int game.C_100218_am.field_103115_N
		// @052C: iconst_0
		// @052D: putstatic int game.C_100181_cf.field_105704_e
		// @0530: bipush -15 (0xF1)
		// @0532: aload_0
		// @0533: getfield int game.C_100034_gi.field_104030_e
		// @0536: iconst_m1
		// @0537: ixor
		// @0538: if_icmpne @055F
		// @053B: goto @053F
		// @053E: athrow
		// @053F: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0542: getstatic int[] game.C_100301_kb.field_107089_g
		// @0545: bipush -125 (0x83)
		// @0547: invokestatic game.C_100260_mc.func_102219_a(game.C_100327_ib, int[], byte)int[]
		// @054A: putstatic int[] game.C_100280_nf.field_101178_o
		// @054D: getstatic int[] game.C_100280_nf.field_101178_o
		// @0550: bipush -66 (0xBE)
		// @0552: getstatic int[] game.C_100301_kb.field_107089_g
		// @0555: invokestatic game.C_100157_db.func_103546_a(int[], byte, int[])game.C_100327_ib
		// @0558: putstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @055B: goto @055F
		// @055E: athrow
		// @055F: iload_2
		// @0560: istore #6
		// @0562: iload #6
		// @0564: bipush -3 (0xFD)
		// @0566: iload_1
		// @0567: bipush -99 (0x9D)
		// @0569: iadd
		// @056A: iconst_0
		// @056B: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @056E: iload #10
		// @0570: ifeq @13C2
		// @0573: aload_0
		// @0574: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0577: iconst_1
		// @0578: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @057B: ifeq @13C2
		// @057E: goto @0582
		// @0581: athrow
		// @0582: bipush -25 (0xE7)
		// @0584: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @0587: ifeq @05A7
		// @058A: goto @058E
		// @058D: athrow
		// @058E: iconst_0
		// @058F: putstatic boolean game.C_100198_qn.field_105833_d
		// @0592: iconst_0
		// @0593: istore #6
		// @0595: iconst_1
		// @0596: iload #6
		// @0598: iload_2
		// @0599: ldc_w -69723423 (0xfbd81ae1)
		// @059C: getstatic java.lang.String game.C_100207_qh.field_102878_P
		// @059F: invokestatic game.C_100075_uj.func_100646_a(boolean, int, boolean, int, java.lang.String)void
		// @05A2: iload #10
		// @05A4: ifeq @13C2
		// @05A7: aload_0
		// @05A8: iload_3
		// @05A9: bipush -4 (0xFC)
		// @05AB: invokespecial game.C_100034_gi.func_103977_a(int, int)boolean
		// @05AE: ifeq @0613
		// @05B1: goto @05B5
		// @05B4: athrow
		// @05B5: iload_1
		// @05B6: sipush -131 (0xFF7D)
		// @05B9: iadd
		// @05BA: invokestatic game.C_100288_jn.func_106838_b(int)boolean
		// @05BD: ifne @05D3
		// @05C0: goto @05C4
		// @05C3: athrow
		// @05C4: getstatic java.lang.String game.C_100125_tm.field_100749_m
		// @05C7: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @05CA: iload #10
		// @05CC: ifeq @13C2
		// @05CF: goto @05D3
		// @05D2: athrow
		// @05D3: iload_2
		// @05D4: istore #6
		// @05D6: getstatic int game.C_100050_vg.field_100632_k
		// @05D9: istore #7
		// @05DB: bipush -6 (0xFA)
		// @05DD: iload #7
		// @05DF: iconst_m1
		// @05E0: ixor
		// @05E1: if_icmpeq @05FE
		// @05E4: bipush 6 (0x06)
		// @05E6: iload #7
		// @05E8: if_icmpeq @05FE
		// @05EB: goto @05EF
		// @05EE: athrow
		// @05EF: bipush 8 (0x08)
		// @05F1: iload #7
		// @05F3: if_icmpeq @05FE
		// @05F6: goto @05FA
		// @05F9: athrow
		// @05FA: goto @0603
		// @05FD: athrow
		// @05FE: getstatic int game.C_100069_vb.field_104357_e
		// @0601: istore #7
		// @0603: iload #6
		// @0605: bipush -4 (0xFC)
		// @0607: bipush -101 (0x9B)
		// @0609: iload #7
		// @060B: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @060E: iload #10
		// @0610: ifeq @13C2
		// @0613: iconst_0
		// @0614: istore #4
		// @0616: getstatic java.lang.String game.C_100009_fg.field_103656_e
		// @0619: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @061C: iload #10
		// @061E: ifeq @13C2
		// @0621: aload_0
		// @0622: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0625: iconst_1
		// @0626: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0629: ifne @0634
		// @062C: goto @0630
		// @062F: athrow
		// @0630: goto @13C2
		// @0633: athrow
		// @0634: iload_2
		// @0635: istore #6
		// @0637: iload #6
		// @0639: iconst_m1
		// @063A: iload_1
		// @063B: bipush -109 (0x93)
		// @063D: ixor
		// @063E: iconst_0
		// @063F: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @0642: iload #10
		// @0644: ifeq @13C2
		// @0647: iconst_m1
		// @0648: iload_1
		// @0649: bipush -3 (0xFD)
		// @064B: iadd
		// @064C: invokestatic game.C_100030_gm.func_103334_a(int, int)void
		// @064F: aload_0
		// @0650: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0653: iconst_1
		// @0654: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0657: ifne @0662
		// @065A: goto @065E
		// @065D: athrow
		// @065E: goto @13C2
		// @0661: athrow
		// @0662: getstatic int game.C_100252_pn.field_105503_o
		// @0665: bipush 14 (0x0E)
		// @0667: if_icmpne @067C
		// @066A: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @066D: getstatic int[] game.C_100301_kb.field_107089_g
		// @0670: bipush -125 (0x83)
		// @0672: invokestatic game.C_100260_mc.func_102219_a(game.C_100327_ib, int[], byte)int[]
		// @0675: putstatic int[] game.C_100280_nf.field_101178_o
		// @0678: goto @067C
		// @067B: athrow
		// @067C: getstatic int game.C_100252_pn.field_105503_o
		// @067F: iconst_m1
		// @0680: ixor
		// @0681: bipush -21 (0xEB)
		// @0683: if_icmpne @06A1
		// @0686: bipush -25 (0xE7)
		// @0688: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @068B: ifeq @06A1
		// @068E: goto @0692
		// @0691: athrow
		// @0692: iconst_m1
		// @0693: getstatic int[] game.C_100275_na.field_103087_l
		// @0696: iconst_0
		// @0697: iaload
		// @0698: iconst_m1
		// @0699: ixor
		// @069A: if_icmpgt @06DF
		// @069D: goto @06A1
		// @06A0: athrow
		// @06A1: iload_2
		// @06A2: istore #6
		// @06A4: getstatic int game.C_100050_vg.field_100632_k
		// @06A7: istore #7
		// @06A9: iconst_5
		// @06AA: iload #7
		// @06AC: if_icmpeq @06CB
		// @06AF: bipush 6 (0x06)
		// @06B1: iload #7
		// @06B3: if_icmpeq @06CB
		// @06B6: goto @06BA
		// @06B9: athrow
		// @06BA: iload #7
		// @06BC: iconst_m1
		// @06BD: ixor
		// @06BE: bipush -9 (0xF7)
		// @06C0: if_icmpeq @06CB
		// @06C3: goto @06C7
		// @06C6: athrow
		// @06C7: goto @06D0
		// @06CA: athrow
		// @06CB: getstatic int game.C_100069_vb.field_104357_e
		// @06CE: istore #7
		// @06D0: iload #6
		// @06D2: iconst_0
		// @06D3: bipush -107 (0x95)
		// @06D5: iload #7
		// @06D7: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @06DA: iload #10
		// @06DC: ifeq @13C2
		// @06DF: iconst_1
		// @06E0: putstatic boolean game.C_100197_ra.field_100862_w
		// @06E3: iconst_m1
		// @06E4: putstatic int game.C_100100_i.field_102012_Zb
		// @06E7: iload #10
		// @06E9: ifeq @13C2
		// @06EC: goto @06F0
		// @06EF: athrow
		// @06F0: aload_0
		// @06F1: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @06F4: iconst_1
		// @06F5: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @06F8: ifne @0703
		// @06FB: goto @06FF
		// @06FE: athrow
		// @06FF: goto @13C2
		// @0702: athrow
		// @0703: iload_2
		// @0704: istore #6
		// @0706: getstatic int game.C_100050_vg.field_100632_k
		// @0709: istore #7
		// @070B: iconst_5
		// @070C: iload #7
		// @070E: if_icmpeq @0729
		// @0711: bipush 6 (0x06)
		// @0713: iload #7
		// @0715: if_icmpeq @0729
		// @0718: goto @071C
		// @071B: athrow
		// @071C: iload #7
		// @071E: iconst_m1
		// @071F: ixor
		// @0720: bipush -9 (0xF7)
		// @0722: if_icmpne @072E
		// @0725: goto @0729
		// @0728: athrow
		// @0729: getstatic int game.C_100069_vb.field_104357_e
		// @072C: istore #7
		// @072E: iload #6
		// @0730: bipush 12 (0x0C)
		// @0732: iload_1
		// @0733: bipush -110 (0x92)
		// @0735: iadd
		// @0736: iload #7
		// @0738: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @073B: iconst_1
		// @073C: putstatic boolean game.C_100095_fe.field_103387_O
		// @073F: iload #10
		// @0741: ifeq @13C2
		// @0744: aload_0
		// @0745: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0748: iconst_1
		// @0749: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @074C: ifeq @13C2
		// @074F: goto @0753
		// @0752: athrow
		// @0753: iload_2
		// @0754: istore #6
		// @0756: getstatic int game.C_100050_vg.field_100632_k
		// @0759: istore #7
		// @075B: iconst_5
		// @075C: iload #7
		// @075E: if_icmpeq @077D
		// @0761: iload #7
		// @0763: iconst_m1
		// @0764: ixor
		// @0765: bipush -7 (0xF9)
		// @0767: if_icmpeq @077D
		// @076A: goto @076E
		// @076D: athrow
		// @076E: bipush 8 (0x08)
		// @0770: iload #7
		// @0772: if_icmpeq @077D
		// @0775: goto @0779
		// @0778: athrow
		// @0779: goto @0782
		// @077C: athrow
		// @077D: getstatic int game.C_100069_vb.field_104357_e
		// @0780: istore #7
		// @0782: iload #6
		// @0784: bipush 8 (0x08)
		// @0786: iload_1
		// @0787: bipush -123 (0x85)
		// @0789: ixor
		// @078A: iload #7
		// @078C: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @078F: iload #10
		// @0791: ifeq @13C2
		// @0794: aload_0
		// @0795: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0798: iconst_1
		// @0799: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @079C: ifne @07A7
		// @079F: goto @07A3
		// @07A2: athrow
		// @07A3: goto @13C2
		// @07A6: athrow
		// @07A7: iload_2
		// @07A8: istore #6
		// @07AA: getstatic int game.C_100050_vg.field_100632_k
		// @07AD: istore #7
		// @07AF: iload #7
		// @07B1: iconst_m1
		// @07B2: ixor
		// @07B3: bipush -6 (0xFA)
		// @07B5: if_icmpeq @07CE
		// @07B8: bipush 6 (0x06)
		// @07BA: iload #7
		// @07BC: if_icmpeq @07CE
		// @07BF: goto @07C3
		// @07C2: athrow
		// @07C3: bipush 8 (0x08)
		// @07C5: iload #7
		// @07C7: if_icmpne @07D3
		// @07CA: goto @07CE
		// @07CD: athrow
		// @07CE: getstatic int game.C_100069_vb.field_104357_e
		// @07D1: istore #7
		// @07D3: iload #6
		// @07D5: bipush 13 (0x0D)
		// @07D7: iload_1
		// @07D8: bipush -123 (0x85)
		// @07DA: ixor
		// @07DB: iload #7
		// @07DD: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @07E0: bipush 14 (0x0E)
		// @07E2: getstatic int game.C_100252_pn.field_105503_o
		// @07E5: if_icmpne @13C2
		// @07E8: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @07EB: getstatic int[] game.C_100301_kb.field_107089_g
		// @07EE: bipush -125 (0x83)
		// @07F0: invokestatic game.C_100260_mc.func_102219_a(game.C_100327_ib, int[], byte)int[]
		// @07F3: putstatic int[] game.C_100280_nf.field_101178_o
		// @07F6: iload #10
		// @07F8: ifeq @13C2
		// @07FB: goto @07FF
		// @07FE: athrow
		// @07FF: aload_0
		// @0800: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0803: iconst_1
		// @0804: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0807: ifeq @13C2
		// @080A: goto @080E
		// @080D: athrow
		// @080E: aload_0
		// @080F: iload_3
		// @0810: bipush -4 (0xFC)
		// @0812: invokespecial game.C_100034_gi.func_103977_a(int, int)boolean
		// @0815: ifne @0846
		// @0818: goto @081C
		// @081B: athrow
		// @081C: iconst_0
		// @081D: istore #4
		// @081F: new java.lang.StringBuilder
		// @0822: dup
		// @0823: invokespecial java.lang.StringBuilder.<init>()void
		// @0826: getstatic java.lang.String game.C_100043_vl.field_101938_Ub
		// @0829: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @082C: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @082F: bipush 78 (0x4E)
		// @0831: aaload
		// @0832: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0835: getstatic java.lang.String game.C_100009_fg.field_103656_e
		// @0838: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @083B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @083E: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @0841: iload #10
		// @0843: ifeq @13C2
		// @0846: bipush 82 (0x52)
		// @0848: invokestatic game.C_100335_il.func_107358_a(byte)boolean
		// @084B: ifeq @0895
		// @084E: goto @0852
		// @0851: athrow
		// @0852: iconst_1
		// @0853: putstatic int game.C_100200_ba.field_105852_c
		// @0856: iconst_m1
		// @0857: putstatic int game.C_100174_sb.field_105609_b
		// @085A: aconst_null
		// @085B: putstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @085E: aconst_null
		// @085F: putstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @0862: bipush -86 (0xAA)
		// @0864: invokestatic game.C_100203_ql.func_105921_a(int)void
		// @0867: iconst_0
		// @0868: istore #6
		// @086A: iload #6
		// @086C: iconst_m1
		// @086D: ixor
		// @086E: getstatic int[] game.C_100074_g.field_104410_e
		// @0871: arraylength
		// @0872: iconst_m1
		// @0873: ixor
		// @0874: if_icmple @088F
		// @0877: getstatic int[] game.C_100074_g.field_104410_e
		// @087A: iload #6
		// @087C: iconst_0
		// @087D: iastore
		// @087E: iinc #6 +1
		// @0881: iload #10
		// @0883: ifne @0891
		// @0886: iload #10
		// @0888: ifeq @086A
		// @088B: goto @088F
		// @088E: athrow
		// @088F: iconst_1
		// @0890: istore_2
		// @0891: iconst_0
		// @0892: putstatic int game.C_100068_vc.field_104343_e
		// @0895: iconst_m1
		// @0896: putstatic int game.C_100013_fn.field_103743_a
		// @0899: iload_2
		// @089A: istore #6
		// @089C: getstatic int game.C_100050_vg.field_100632_k
		// @089F: istore #7
		// @08A1: iconst_5
		// @08A2: iload #7
		// @08A4: if_icmpeq @08C3
		// @08A7: bipush -7 (0xF9)
		// @08A9: iload #7
		// @08AB: iconst_m1
		// @08AC: ixor
		// @08AD: if_icmpeq @08C3
		// @08B0: goto @08B4
		// @08B3: athrow
		// @08B4: bipush 8 (0x08)
		// @08B6: iload #7
		// @08B8: if_icmpeq @08C3
		// @08BB: goto @08BF
		// @08BE: athrow
		// @08BF: goto @08C8
		// @08C2: athrow
		// @08C3: getstatic int game.C_100069_vb.field_104357_e
		// @08C6: istore #7
		// @08C8: iload #6
		// @08CA: bipush 14 (0x0E)
		// @08CC: bipush -99 (0x9D)
		// @08CE: iload #7
		// @08D0: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @08D3: getstatic int[] game.C_100280_nf.field_101178_o
		// @08D6: bipush 119 (0x77)
		// @08D8: getstatic int[] game.C_100301_kb.field_107089_g
		// @08DB: invokestatic game.C_100157_db.func_103546_a(int[], byte, int[])game.C_100327_ib
		// @08DE: putstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @08E1: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @08E4: bipush 46 (0x2E)
		// @08E6: ldc_w 6993661 (0x6ab6fd)
		// @08E9: invokevirtual game.C_100327_ib.func_102465_a(byte, int)void
		// @08EC: iload #10
		// @08EE: ifeq @13C2
		// @08F1: aload_0
		// @08F2: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @08F5: iconst_1
		// @08F6: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @08F9: ifne @0904
		// @08FC: goto @0900
		// @08FF: athrow
		// @0900: goto @13C2
		// @0903: athrow
		// @0904: iconst_0
		// @0905: putstatic boolean game.C_100174_sb.field_105611_a
		// @0908: iload_2
		// @0909: istore #6
		// @090B: getstatic int game.C_100050_vg.field_100632_k
		// @090E: istore #7
		// @0910: iload #7
		// @0912: iconst_m1
		// @0913: ixor
		// @0914: bipush -6 (0xFA)
		// @0916: if_icmpeq @0933
		// @0919: bipush 6 (0x06)
		// @091B: iload #7
		// @091D: if_icmpeq @0933
		// @0920: goto @0924
		// @0923: athrow
		// @0924: iload #7
		// @0926: bipush 8 (0x08)
		// @0928: if_icmpeq @0933
		// @092B: goto @092F
		// @092E: athrow
		// @092F: goto @0938
		// @0932: athrow
		// @0933: getstatic int game.C_100069_vb.field_104357_e
		// @0936: istore #7
		// @0938: iload #6
		// @093A: bipush 7 (0x07)
		// @093C: bipush -94 (0xA2)
		// @093E: iload #7
		// @0940: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @0943: iload #10
		// @0945: ifeq @13C2
		// @0948: bipush -20 (0xEC)
		// @094A: aload_0
		// @094B: getfield int game.C_100034_gi.field_104030_e
		// @094E: iconst_m1
		// @094F: ixor
		// @0950: if_icmpne @095F
		// @0953: goto @0957
		// @0956: athrow
		// @0957: iconst_0
		// @0958: putstatic int game.C_100069_vb.field_104357_e
		// @095B: goto @095F
		// @095E: athrow
		// @095F: aload_0
		// @0960: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0963: iconst_1
		// @0964: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0967: ifne @096E
		// @096A: goto @13C2
		// @096D: athrow
		// @096E: aload_0
		// @096F: getfield int game.C_100034_gi.field_104030_e
		// @0972: iconst_m1
		// @0973: ixor
		// @0974: bipush -8 (0xF8)
		// @0976: if_icmpne @098E
		// @0979: getstatic int game.C_100069_vb.field_104357_e
		// @097C: iconst_m1
		// @097D: ixor
		// @097E: iconst_m1
		// @097F: if_icmpeq @098E
		// @0982: goto @0986
		// @0985: athrow
		// @0986: iconst_1
		// @0987: putstatic boolean game.C_100174_sb.field_105611_a
		// @098A: goto @098E
		// @098D: athrow
		// @098E: getstatic int game.C_100069_vb.field_104357_e
		// @0991: istore #6
		// @0993: iload_2
		// @0994: istore #7
		// @0996: getstatic int game.C_100050_vg.field_100632_k
		// @0999: istore #8
		// @099B: iload #8
		// @099D: iconst_m1
		// @099E: ixor
		// @099F: bipush -6 (0xFA)
		// @09A1: if_icmpeq @09BE
		// @09A4: iload #8
		// @09A6: iconst_m1
		// @09A7: ixor
		// @09A8: bipush -7 (0xF9)
		// @09AA: if_icmpeq @09BE
		// @09AD: goto @09B1
		// @09B0: athrow
		// @09B1: iload #8
		// @09B3: iconst_m1
		// @09B4: ixor
		// @09B5: bipush -9 (0xF7)
		// @09B7: if_icmpne @09C3
		// @09BA: goto @09BE
		// @09BD: athrow
		// @09BE: getstatic int game.C_100069_vb.field_104357_e
		// @09C1: istore #8
		// @09C3: iload #7
		// @09C5: iload #6
		// @09C7: bipush -102 (0x9A)
		// @09C9: iload #8
		// @09CB: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @09CE: iload #10
		// @09D0: ifeq @13C2
		// @09D3: aload_0
		// @09D4: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @09D7: iconst_1
		// @09D8: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @09DB: ifeq @13C2
		// @09DE: goto @09E2
		// @09E1: athrow
		// @09E2: iload_2
		// @09E3: istore #6
		// @09E5: getstatic int game.C_100050_vg.field_100632_k
		// @09E8: istore #7
		// @09EA: iload #7
		// @09EC: iconst_m1
		// @09ED: ixor
		// @09EE: bipush -6 (0xFA)
		// @09F0: if_icmpeq @0A0D
		// @09F3: iload #7
		// @09F5: bipush 6 (0x06)
		// @09F7: if_icmpeq @0A0D
		// @09FA: goto @09FE
		// @09FD: athrow
		// @09FE: bipush 8 (0x08)
		// @0A00: iload #7
		// @0A02: if_icmpeq @0A0D
		// @0A05: goto @0A09
		// @0A08: athrow
		// @0A09: goto @0A12
		// @0A0C: athrow
		// @0A0D: getstatic int game.C_100069_vb.field_104357_e
		// @0A10: istore #7
		// @0A12: iload #6
		// @0A14: bipush 6 (0x06)
		// @0A16: bipush -113 (0x8F)
		// @0A18: iload #7
		// @0A1A: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @0A1D: iload #10
		// @0A1F: ifeq @13C2
		// @0A22: aload_0
		// @0A23: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0A26: iconst_1
		// @0A27: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0A2A: ifeq @13C2
		// @0A2D: goto @0A31
		// @0A30: athrow
		// @0A31: aload_0
		// @0A32: getfield int game.C_100034_gi.field_104030_e
		// @0A35: iconst_m1
		// @0A36: ixor
		// @0A37: bipush -10 (0xF6)
		// @0A39: if_icmpeq @0A7A
		// @0A3C: goto @0A40
		// @0A3F: athrow
		// @0A40: iload_2
		// @0A41: istore #6
		// @0A43: getstatic int game.C_100050_vg.field_100632_k
		// @0A46: istore #7
		// @0A48: iload #7
		// @0A4A: iconst_5
		// @0A4B: if_icmpeq @0A66
		// @0A4E: bipush 6 (0x06)
		// @0A50: iload #7
		// @0A52: if_icmpeq @0A66
		// @0A55: goto @0A59
		// @0A58: athrow
		// @0A59: iload #7
		// @0A5B: iconst_m1
		// @0A5C: ixor
		// @0A5D: bipush -9 (0xF7)
		// @0A5F: if_icmpne @0A6B
		// @0A62: goto @0A66
		// @0A65: athrow
		// @0A66: getstatic int game.C_100069_vb.field_104357_e
		// @0A69: istore #7
		// @0A6B: iload #6
		// @0A6D: iconst_5
		// @0A6E: bipush -92 (0xA4)
		// @0A70: iload #7
		// @0A72: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @0A75: iload #10
		// @0A77: ifeq @13C2
		// @0A7A: iload_2
		// @0A7B: istore #6
		// @0A7D: iload #6
		// @0A7F: iconst_5
		// @0A80: bipush -103 (0x99)
		// @0A82: iconst_0
		// @0A83: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @0A86: iload #10
		// @0A88: ifeq @13C2
		// @0A8B: iconst_0
		// @0A8C: istore #6
		// @0A8E: iconst_0
		// @0A8F: istore #4
		// @0A91: aload_0
		// @0A92: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0A95: bipush -127 (0x81)
		// @0A97: invokevirtual game.C_100333_ij.func_107324_a(byte)boolean
		// @0A9A: ifeq @0AB3
		// @0A9D: iconst_m1
		// @0A9E: getstatic int game.C_100216_aj.field_104467_z
		// @0AA1: iconst_m1
		// @0AA2: ixor
		// @0AA3: if_icmple @0AB3
		// @0AA6: goto @0AAA
		// @0AA9: athrow
		// @0AAA: iconst_1
		// @0AAB: istore #6
		// @0AAD: iconst_0
		// @0AAE: bipush 88 (0x58)
		// @0AB0: invokestatic game.C_100310_lj.func_100542_a(int, byte)void
		// @0AB3: aload_0
		// @0AB4: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0AB7: iconst_0
		// @0AB8: invokevirtual game.C_100333_ij.func_107337_a(boolean)boolean
		// @0ABB: ifeq @0ADC
		// @0ABE: sipush -257 (0xFEFF)
		// @0AC1: getstatic int game.C_100216_aj.field_104467_z
		// @0AC4: iconst_m1
		// @0AC5: ixor
		// @0AC6: if_icmplt @0AD1
		// @0AC9: goto @0ACD
		// @0ACC: athrow
		// @0ACD: goto @0ADC
		// @0AD0: athrow
		// @0AD1: iconst_1
		// @0AD2: istore #6
		// @0AD4: sipush 256 (0x0100)
		// @0AD7: bipush 101 (0x65)
		// @0AD9: invokestatic game.C_100310_lj.func_100542_a(int, byte)void
		// @0ADC: aload_0
		// @0ADD: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0AE0: iconst_0
		// @0AE1: invokevirtual game.C_100333_ij.func_107338_f(int)boolean
		// @0AE4: ifne @0AEB
		// @0AE7: goto @0B61
		// @0AEA: athrow
		// @0AEB: aload_0
		// @0AEC: bipush 123 (0x7B)
		// @0AEE: iload_3
		// @0AEF: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @0AF2: aload_0
		// @0AF3: iload_3
		// @0AF4: bipush 84 (0x54)
		// @0AF6: invokespecial game.C_100034_gi.func_104002_b(int, byte)int
		// @0AF9: ineg
		// @0AFA: getstatic int game.C_100171_cn.field_105573_l
		// @0AFD: ineg
		// @0AFE: iadd
		// @0AFF: isub
		// @0B00: sipush 170 (0x00AA)
		// @0B03: isub
		// @0B04: ldc_w 521121505 (0x1f0faee1)
		// @0B07: ishr
		// @0B08: istore #7
		// @0B0A: iconst_2
		// @0B0B: iload #7
		// @0B0D: ineg
		// @0B0E: getstatic int game.C_100015_wh.field_103781_g
		// @0B11: iadd
		// @0B12: iadd
		// @0B13: istore #8
		// @0B15: iload #8
		// @0B17: sipush 256 (0x0100)
		// @0B1A: imul
		// @0B1B: sipush 170 (0x00AA)
		// @0B1E: idiv
		// @0B1F: istore #9
		// @0B21: iconst_0
		// @0B22: iload #9
		// @0B24: if_icmplt @0B36
		// @0B27: iconst_0
		// @0B28: bipush 105 (0x69)
		// @0B2A: invokestatic game.C_100310_lj.func_100542_a(int, byte)void
		// @0B2D: iload #10
		// @0B2F: ifeq @0B5E
		// @0B32: goto @0B36
		// @0B35: athrow
		// @0B36: iload #9
		// @0B38: sipush 256 (0x0100)
		// @0B3B: if_icmpge @0B52
		// @0B3E: goto @0B42
		// @0B41: athrow
		// @0B42: iload #9
		// @0B44: bipush 125 (0x7D)
		// @0B46: invokestatic game.C_100310_lj.func_100542_a(int, byte)void
		// @0B49: iload #10
		// @0B4B: ifeq @0B5E
		// @0B4E: goto @0B52
		// @0B51: athrow
		// @0B52: sipush 256 (0x0100)
		// @0B55: bipush 89 (0x59)
		// @0B57: invokestatic game.C_100310_lj.func_100542_a(int, byte)void
		// @0B5A: goto @0B5E
		// @0B5D: athrow
		// @0B5E: iconst_1
		// @0B5F: istore #6
		// @0B61: aload_0
		// @0B62: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0B65: sipush -27943 (0x92D9)
		// @0B68: invokevirtual game.C_100333_ij.func_107336_c(int)boolean
		// @0B6B: ifeq @0B83
		// @0B6E: getstatic int game.C_100216_aj.field_104467_z
		// @0B71: iconst_m1
		// @0B72: ixor
		// @0B73: iconst_m1
		// @0B74: if_icmpge @0B83
		// @0B77: goto @0B7B
		// @0B7A: athrow
		// @0B7B: iconst_1
		// @0B7C: istore #6
		// @0B7E: bipush 98 (0x62)
		// @0B80: invokestatic game.C_100017_wj.func_103809_a(int)void
		// @0B83: aload_0
		// @0B84: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0B87: iconst_0
		// @0B88: invokevirtual game.C_100333_ij.func_107333_d(int)boolean
		// @0B8B: ifeq @0BA4
		// @0B8E: getstatic int game.C_100216_aj.field_104467_z
		// @0B91: sipush 256 (0x0100)
		// @0B94: if_icmpge @0BA4
		// @0B97: goto @0B9B
		// @0B9A: athrow
		// @0B9B: sipush -225 (0xFF1F)
		// @0B9E: invokestatic game.C_100215_ai.func_106006_a(int)void
		// @0BA1: iconst_1
		// @0BA2: istore #6
		// @0BA4: iload #6
		// @0BA6: ifne @0BAD
		// @0BA9: goto @0BDB
		// @0BAC: athrow
		// @0BAD: aload_0
		// @0BAE: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0BB1: iload_1
		// @0BB2: bipush -5 (0xFB)
		// @0BB4: iadd
		// @0BB5: invokevirtual game.C_100333_ij.func_107338_f(int)boolean
		// @0BB8: ifeq @0BCC
		// @0BBB: getstatic int game.C_100066_dl.field_101636_H
		// @0BBE: getstatic int game.C_100005_fk.field_103603_i
		// @0BC1: if_icmpgt @0BCC
		// @0BC4: goto @0BC8
		// @0BC7: athrow
		// @0BC8: goto @0BDB
		// @0BCB: athrow
		// @0BCC: iconst_0
		// @0BCD: bipush 8 (0x08)
		// @0BCF: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @0BD2: bipush 20 (0x14)
		// @0BD4: getstatic int game.C_100066_dl.field_101636_H
		// @0BD7: iadd
		// @0BD8: putstatic int game.C_100005_fk.field_103603_i
		// @0BDB: iload #10
		// @0BDD: ifeq @13C2
		// @0BE0: aload_0
		// @0BE1: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0BE4: bipush -99 (0x9D)
		// @0BE6: invokevirtual game.C_100333_ij.func_107324_a(byte)boolean
		// @0BE9: ifne @0BF4
		// @0BEC: goto @0BF0
		// @0BEF: athrow
		// @0BF0: goto @0BFA
		// @0BF3: athrow
		// @0BF4: bipush 125 (0x7D)
		// @0BF6: iconst_0
		// @0BF7: invokestatic game.C_100266_me.func_106646_a(int, int)void
		// @0BFA: iconst_0
		// @0BFB: istore #4
		// @0BFD: aload_0
		// @0BFE: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0C01: iconst_0
		// @0C02: invokevirtual game.C_100333_ij.func_107337_a(boolean)boolean
		// @0C05: ifeq @0C14
		// @0C08: bipush 107 (0x6B)
		// @0C0A: sipush 256 (0x0100)
		// @0C0D: invokestatic game.C_100266_me.func_106646_a(int, int)void
		// @0C10: goto @0C14
		// @0C13: athrow
		// @0C14: aload_0
		// @0C15: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0C18: iload_1
		// @0C19: bipush -5 (0xFB)
		// @0C1B: iadd
		// @0C1C: invokevirtual game.C_100333_ij.func_107338_f(int)boolean
		// @0C1F: ifne @0C26
		// @0C22: goto @0CA2
		// @0C25: athrow
		// @0C26: sipush -170 (0xFF56)
		// @0C29: aload_0
		// @0C2A: bipush 115 (0x73)
		// @0C2C: iload_3
		// @0C2D: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @0C30: aload_0
		// @0C31: iload_3
		// @0C32: bipush 120 (0x78)
		// @0C34: invokespecial game.C_100034_gi.func_104002_b(int, byte)int
		// @0C37: ineg
		// @0C38: getstatic int game.C_100171_cn.field_105573_l
		// @0C3B: ineg
		// @0C3C: iadd
		// @0C3D: isub
		// @0C3E: iadd
		// @0C3F: ldc_w -1133012415 (0xbc779a41)
		// @0C42: ishr
		// @0C43: istore #6
		// @0C45: getstatic int game.C_100015_wh.field_103781_g
		// @0C48: iload #6
		// @0C4A: ineg
		// @0C4B: iadd
		// @0C4C: bipush -2 (0xFE)
		// @0C4E: isub
		// @0C4F: istore #7
		// @0C51: iload #7
		// @0C53: sipush 256 (0x0100)
		// @0C56: imul
		// @0C57: sipush 170 (0x00AA)
		// @0C5A: idiv
		// @0C5B: istore #8
		// @0C5D: iconst_m1
		// @0C5E: iload #8
		// @0C60: iconst_m1
		// @0C61: ixor
		// @0C62: if_icmple @0C96
		// @0C65: iload #8
		// @0C67: iconst_m1
		// @0C68: ixor
		// @0C69: sipush -257 (0xFEFF)
		// @0C6C: if_icmple @0C83
		// @0C6F: goto @0C73
		// @0C72: athrow
		// @0C73: bipush 123 (0x7B)
		// @0C75: iload #8
		// @0C77: invokestatic game.C_100266_me.func_106646_a(int, int)void
		// @0C7A: iload #10
		// @0C7C: ifeq @0CA2
		// @0C7F: goto @0C83
		// @0C82: athrow
		// @0C83: iload_1
		// @0C84: bipush 118 (0x76)
		// @0C86: iadd
		// @0C87: sipush 256 (0x0100)
		// @0C8A: invokestatic game.C_100266_me.func_106646_a(int, int)void
		// @0C8D: iload #10
		// @0C8F: ifeq @0CA2
		// @0C92: goto @0C96
		// @0C95: athrow
		// @0C96: iload_1
		// @0C97: bipush 122 (0x7A)
		// @0C99: iadd
		// @0C9A: iconst_0
		// @0C9B: invokestatic game.C_100266_me.func_106646_a(int, int)void
		// @0C9E: goto @0CA2
		// @0CA1: athrow
		// @0CA2: aload_0
		// @0CA3: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0CA6: sipush -27943 (0x92D9)
		// @0CA9: invokevirtual game.C_100333_ij.func_107336_c(int)boolean
		// @0CAC: ifne @0CB3
		// @0CAF: goto @0CB7
		// @0CB2: athrow
		// @0CB3: iconst_0
		// @0CB4: invokestatic game.C_100215_ai.func_106005_c(int)void
		// @0CB7: aload_0
		// @0CB8: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0CBB: iload_1
		// @0CBC: iconst_5
		// @0CBD: ixor
		// @0CBE: invokevirtual game.C_100333_ij.func_107333_d(int)boolean
		// @0CC1: ifne @0CC8
		// @0CC4: goto @13C2
		// @0CC7: athrow
		// @0CC8: bipush -110 (0x92)
		// @0CCA: invokestatic game.C_100195_rc.func_105764_b(int)void
		// @0CCD: iload #10
		// @0CCF: ifeq @13C2
		// @0CD2: aload_0
		// @0CD3: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0CD6: iconst_1
		// @0CD7: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0CDA: ifne @0CE5
		// @0CDD: goto @0CE1
		// @0CE0: athrow
		// @0CE1: goto @13C2
		// @0CE4: athrow
		// @0CE5: aconst_null
		// @0CE6: getstatic game.C_100009_fg game.C_100146_bf.field_105128_n
		// @0CE9: if_acmpeq @0CFA
		// @0CEC: bipush 12 (0x0C)
		// @0CEE: invokestatic game.C_100123_uc.func_104914_b(int)void
		// @0CF1: iload #10
		// @0CF3: ifeq @13C2
		// @0CF6: goto @0CFA
		// @0CF9: athrow
		// @0CFA: iload_2
		// @0CFB: istore #6
		// @0CFD: iconst_0
		// @0CFE: putstatic boolean game.C_100198_qn.field_105833_d
		// @0D01: iload #6
		// @0D03: sipush -10365 (0xD783)
		// @0D06: invokestatic game.C_100071_va.func_101656_a(boolean, int)void
		// @0D09: iload #10
		// @0D0B: ifeq @13C2
		// @0D0E: aload_0
		// @0D0F: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0D12: iconst_1
		// @0D13: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0D16: ifne @0D21
		// @0D19: goto @0D1D
		// @0D1C: athrow
		// @0D1D: goto @13C2
		// @0D20: athrow
		// @0D21: iconst_0
		// @0D22: istore #6
		// @0D24: getstatic int game.C_100218_am.field_103115_N
		// @0D27: istore #7
		// @0D29: iconst_m1
		// @0D2A: iload #7
		// @0D2C: iconst_m1
		// @0D2D: ixor
		// @0D2E: if_icmpeq @0D80
		// @0D31: iconst_1
		// @0D32: iload #7
		// @0D34: if_icmpeq @0D80
		// @0D37: goto @0D3B
		// @0D3A: athrow
		// @0D3B: bipush 7 (0x07)
		// @0D3D: iload #7
		// @0D3F: if_icmpeq @0D80
		// @0D42: goto @0D46
		// @0D45: athrow
		// @0D46: iload #7
		// @0D48: iconst_3
		// @0D49: if_icmpne @0D59
		// @0D4C: goto @0D50
		// @0D4F: athrow
		// @0D50: iload #10
		// @0D52: ifeq @0D80
		// @0D55: goto @0D59
		// @0D58: athrow
		// @0D59: bipush -6 (0xFA)
		// @0D5B: iload #7
		// @0D5D: iconst_m1
		// @0D5E: ixor
		// @0D5F: if_icmpeq @0D80
		// @0D62: goto @0D66
		// @0D65: athrow
		// @0D66: iload #7
		// @0D68: bipush 9 (0x09)
		// @0D6A: if_icmpeq @0D80
		// @0D6D: goto @0D71
		// @0D70: athrow
		// @0D71: bipush 10 (0x0A)
		// @0D73: iload #7
		// @0D75: if_icmpeq @0D80
		// @0D78: goto @0D7C
		// @0D7B: athrow
		// @0D7C: goto @0D83
		// @0D7F: athrow
		// @0D80: iconst_1
		// @0D81: istore #6
		// @0D83: iload #6
		// @0D85: ifeq @0D98
		// @0D88: getstatic game.C_100265_mh game.C_100127_tl.field_104948_b
		// @0D8B: iconst_2
		// @0D8C: invokevirtual game.C_100265_mh.func_106579_c(int)void
		// @0D8F: iload #10
		// @0D91: ifeq @0E0A
		// @0D94: goto @0D98
		// @0D97: athrow
		// @0D98: getstatic int game.C_100218_am.field_103115_N
		// @0D9B: iconst_m1
		// @0D9C: ixor
		// @0D9D: bipush -5 (0xFB)
		// @0D9F: if_icmpne @0DF5
		// @0DA2: goto @0DA6
		// @0DA5: athrow
		// @0DA6: getstatic int[] game.C_100280_nf.field_101178_o
		// @0DA9: bipush 80 (0x50)
		// @0DAB: getstatic int[] game.C_100301_kb.field_107089_g
		// @0DAE: invokestatic game.C_100157_db.func_103546_a(int[], byte, int[])game.C_100327_ib
		// @0DB1: putstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0DB4: iconst_0
		// @0DB5: putstatic boolean game.C_100174_sb.field_105611_a
		// @0DB8: iconst_1
		// @0DB9: putstatic boolean game.C_100126_cb.field_103061_u
		// @0DBC: getstatic int game.C_100050_vg.field_100632_k
		// @0DBF: istore #7
		// @0DC1: iconst_5
		// @0DC2: iload #7
		// @0DC4: if_icmpeq @0DE1
		// @0DC7: bipush -7 (0xF9)
		// @0DC9: iload #7
		// @0DCB: iconst_m1
		// @0DCC: ixor
		// @0DCD: if_icmpeq @0DE1
		// @0DD0: goto @0DD4
		// @0DD3: athrow
		// @0DD4: bipush -9 (0xF7)
		// @0DD6: iload #7
		// @0DD8: iconst_m1
		// @0DD9: ixor
		// @0DDA: if_icmpne @0DE6
		// @0DDD: goto @0DE1
		// @0DE0: athrow
		// @0DE1: getstatic int game.C_100069_vb.field_104357_e
		// @0DE4: istore #7
		// @0DE6: iconst_0
		// @0DE7: bipush 14 (0x0E)
		// @0DE9: bipush -93 (0xA3)
		// @0DEB: iload #7
		// @0DED: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @0DF0: iload #10
		// @0DF2: ifeq @0E0A
		// @0DF5: getstatic game.C_100265_mh game.C_100127_tl.field_104948_b
		// @0DF8: iload_2
		// @0DF9: bipush 112 (0x70)
		// @0DFB: invokevirtual game.C_100265_mh.func_106569_a(boolean, int)void
		// @0DFE: iconst_0
		// @0DFF: putstatic boolean game.C_100174_sb.field_105611_a
		// @0E02: iconst_1
		// @0E03: putstatic boolean game.C_100126_cb.field_103061_u
		// @0E06: goto @0E0A
		// @0E09: athrow
		// @0E0A: iload #10
		// @0E0C: ifeq @13C2
		// @0E0F: aload_0
		// @0E10: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0E13: iconst_1
		// @0E14: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0E17: ifeq @13C2
		// @0E1A: goto @0E1E
		// @0E1D: athrow
		// @0E1E: getstatic game.C_100265_mh game.C_100127_tl.field_104948_b
		// @0E21: bipush 65 (0x41)
		// @0E23: invokevirtual game.C_100265_mh.func_106568_h(byte)void
		// @0E26: iload_2
		// @0E27: istore #6
		// @0E29: iload #6
		// @0E2B: iconst_m1
		// @0E2C: bipush -105 (0x97)
		// @0E2E: iconst_0
		// @0E2F: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @0E32: iload #10
		// @0E34: ifeq @13C2
		// @0E37: aload_0
		// @0E38: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0E3B: iconst_1
		// @0E3C: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0E3F: ifeq @13C2
		// @0E42: goto @0E46
		// @0E45: athrow
		// @0E46: getstatic game.C_100265_mh game.C_100127_tl.field_104948_b
		// @0E49: bipush 115 (0x73)
		// @0E4B: invokevirtual game.C_100265_mh.func_106556_g(byte)void
		// @0E4E: iload_2
		// @0E4F: istore #6
		// @0E51: iload #6
		// @0E53: iconst_m1
		// @0E54: bipush -99 (0x9D)
		// @0E56: iconst_0
		// @0E57: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @0E5A: iload #10
		// @0E5C: ifeq @13C2
		// @0E5F: aload_0
		// @0E60: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0E63: iconst_1
		// @0E64: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0E67: ifeq @13C2
		// @0E6A: goto @0E6E
		// @0E6D: athrow
		// @0E6E: getstatic game.C_100265_mh game.C_100127_tl.field_104948_b
		// @0E71: bipush 81 (0x51)
		// @0E73: invokevirtual game.C_100265_mh.func_106572_a(byte)void
		// @0E76: iload_2
		// @0E77: istore #6
		// @0E79: iload #6
		// @0E7B: iconst_m1
		// @0E7C: bipush -110 (0x92)
		// @0E7E: iconst_0
		// @0E7F: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @0E82: iload #10
		// @0E84: ifeq @13C2
		// @0E87: aload_0
		// @0E88: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0E8B: iconst_1
		// @0E8C: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0E8F: ifeq @13C2
		// @0E92: goto @0E96
		// @0E95: athrow
		// @0E96: getstatic boolean game.C_100192_rf.field_101680_H
		// @0E99: ifeq @0EDF
		// @0E9C: goto @0EA0
		// @0E9F: athrow
		// @0EA0: iload_2
		// @0EA1: istore #6
		// @0EA3: getstatic int game.C_100050_vg.field_100632_k
		// @0EA6: istore #7
		// @0EA8: iload #7
		// @0EAA: iconst_m1
		// @0EAB: ixor
		// @0EAC: bipush -6 (0xFA)
		// @0EAE: if_icmpeq @0ECD
		// @0EB1: iload #7
		// @0EB3: bipush 6 (0x06)
		// @0EB5: if_icmpeq @0ECD
		// @0EB8: goto @0EBC
		// @0EBB: athrow
		// @0EBC: bipush -9 (0xF7)
		// @0EBE: iload #7
		// @0EC0: iconst_m1
		// @0EC1: ixor
		// @0EC2: if_icmpeq @0ECD
		// @0EC5: goto @0EC9
		// @0EC8: athrow
		// @0EC9: goto @0ED2
		// @0ECC: athrow
		// @0ECD: getstatic int game.C_100069_vb.field_104357_e
		// @0ED0: istore #7
		// @0ED2: iload #6
		// @0ED4: bipush -5 (0xFB)
		// @0ED6: iload_1
		// @0ED7: bipush -121 (0x87)
		// @0ED9: ixor
		// @0EDA: iload #7
		// @0EDC: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @0EDF: getstatic boolean game.C_100205_qf.field_103681_c
		// @0EE2: ifeq @13C2
		// @0EE5: iconst_0
		// @0EE6: sipush -1999 (0xF831)
		// @0EE9: bipush 11 (0x0B)
		// @0EEB: invokestatic game.C_100335_il.func_107364_a(int, int, int)void
		// @0EEE: iload #10
		// @0EF0: ifeq @13C2
		// @0EF3: goto @0EF7
		// @0EF6: athrow
		// @0EF7: aload_0
		// @0EF8: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0EFB: iconst_1
		// @0EFC: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0EFF: ifeq @13C2
		// @0F02: goto @0F06
		// @0F05: athrow
		// @0F06: iconst_0
		// @0F07: putstatic int game.C_100025_he.field_103934_b
		// @0F0A: iload #10
		// @0F0C: ifeq @13C2
		// @0F0F: goto @0F13
		// @0F12: athrow
		// @0F13: aload_0
		// @0F14: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0F17: iconst_1
		// @0F18: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0F1B: ifne @0F26
		// @0F1E: goto @0F22
		// @0F21: athrow
		// @0F22: goto @13C2
		// @0F25: athrow
		// @0F26: iconst_1
		// @0F27: putstatic int game.C_100025_he.field_103934_b
		// @0F2A: iload #10
		// @0F2C: ifeq @13C2
		// @0F2F: aload_0
		// @0F30: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0F33: iconst_1
		// @0F34: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0F37: ifne @0F42
		// @0F3A: goto @0F3E
		// @0F3D: athrow
		// @0F3E: goto @13C2
		// @0F41: athrow
		// @0F42: iconst_2
		// @0F43: putstatic int game.C_100025_he.field_103934_b
		// @0F46: iload #10
		// @0F48: ifeq @13C2
		// @0F4B: aload_0
		// @0F4C: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0F4F: iconst_1
		// @0F50: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0F53: ifeq @13C2
		// @0F56: goto @0F5A
		// @0F59: athrow
		// @0F5A: iconst_0
		// @0F5B: putstatic int game.C_100118_ub.field_102054_Wb
		// @0F5E: iload #10
		// @0F60: ifeq @13C2
		// @0F63: goto @0F67
		// @0F66: athrow
		// @0F67: aload_0
		// @0F68: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0F6B: iconst_1
		// @0F6C: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0F6F: ifne @0F7A
		// @0F72: goto @0F76
		// @0F75: athrow
		// @0F76: goto @13C2
		// @0F79: athrow
		// @0F7A: iconst_1
		// @0F7B: putstatic int game.C_100118_ub.field_102054_Wb
		// @0F7E: iload #10
		// @0F80: ifeq @13C2
		// @0F83: aload_0
		// @0F84: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0F87: iconst_1
		// @0F88: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @0F8B: ifeq @13C2
		// @0F8E: goto @0F92
		// @0F91: athrow
		// @0F92: iconst_0
		// @0F93: putstatic boolean game.C_100198_qn.field_105833_d
		// @0F96: bipush 20 (0x14)
		// @0F98: aload_0
		// @0F99: getfield int game.C_100034_gi.field_104030_e
		// @0F9C: if_icmpeq @0FB2
		// @0F9F: goto @0FA3
		// @0FA2: athrow
		// @0FA3: aload_0
		// @0FA4: getfield int game.C_100034_gi.field_104030_e
		// @0FA7: iconst_m1
		// @0FA8: ixor
		// @0FA9: bipush -20 (0xEC)
		// @0FAB: if_icmpne @0FD5
		// @0FAE: goto @0FB2
		// @0FB1: athrow
		// @0FB2: getstatic int[] game.C_100275_na.field_103087_l
		// @0FB5: iconst_0
		// @0FB6: iaload
		// @0FB7: iconst_m1
		// @0FB8: ixor
		// @0FB9: bipush -4 (0xFC)
		// @0FBB: if_icmpgt @0FC8
		// @0FBE: goto @0FC2
		// @0FC1: athrow
		// @0FC2: bipush 19 (0x13)
		// @0FC4: goto @0FCA
		// @0FC7: athrow
		// @0FC8: bipush 20 (0x14)
		// @0FCA: bipush -112 (0x90)
		// @0FCC: aconst_null
		// @0FCD: invokestatic game.C_100316_lc.func_102397_a(int, int, java.lang.String)void
		// @0FD0: iload #10
		// @0FD2: ifeq @13C2
		// @0FD5: aload_0
		// @0FD6: getfield int game.C_100034_gi.field_104030_e
		// @0FD9: bipush 10 (0x0A)
		// @0FDB: if_icmpne @0FF3
		// @0FDE: goto @0FE2
		// @0FE1: athrow
		// @0FE2: bipush 9 (0x09)
		// @0FE4: bipush -118 (0x8A)
		// @0FE6: aconst_null
		// @0FE7: invokestatic game.C_100316_lc.func_102397_a(int, int, java.lang.String)void
		// @0FEA: iload #10
		// @0FEC: ifeq @13C2
		// @0FEF: goto @0FF3
		// @0FF2: athrow
		// @0FF3: aload_0
		// @0FF4: getfield int game.C_100034_gi.field_104030_e
		// @0FF7: bipush 8 (0x08)
		// @0FF9: if_icmpeq @1025
		// @0FFC: goto @1000
		// @0FFF: athrow
		// @1000: iconst_5
		// @1001: getstatic int game.C_100252_pn.field_105503_o
		// @1004: if_icmpeq @1025
		// @1007: goto @100B
		// @100A: athrow
		// @100B: bipush -7 (0xF9)
		// @100D: getstatic int game.C_100252_pn.field_105503_o
		// @1010: iconst_m1
		// @1011: ixor
		// @1012: if_icmpeq @1025
		// @1015: goto @1019
		// @1018: athrow
		// @1019: bipush 14 (0x0E)
		// @101B: getstatic int game.C_100252_pn.field_105503_o
		// @101E: if_icmpne @13C2
		// @1021: goto @1025
		// @1024: athrow
		// @1025: aload_0
		// @1026: getfield int game.C_100034_gi.field_104030_e
		// @1029: bipush -114 (0x8E)
		// @102B: getstatic java.lang.String game.C_100325_id.field_101485_l
		// @102E: invokestatic game.C_100316_lc.func_102397_a(int, int, java.lang.String)void
		// @1031: iload #10
		// @1033: ifeq @13C2
		// @1036: goto @103A
		// @1039: athrow
		// @103A: aload_0
		// @103B: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @103E: iconst_1
		// @103F: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @1042: ifeq @106E
		// @1045: goto @1049
		// @1048: athrow
		// @1049: aload_0
		// @104A: iload_3
		// @104B: bipush -4 (0xFC)
		// @104D: invokespecial game.C_100034_gi.func_103977_a(int, int)boolean
		// @1050: ifeq @106E
		// @1053: goto @1057
		// @1056: athrow
		// @1057: getstatic int game.C_100197_ra.field_100867_r
		// @105A: iconst_1
		// @105B: isub
		// @105C: putstatic int game.C_100197_ra.field_100867_r
		// @105F: sipush 500 (0x01F4)
		// @1062: putstatic int game.C_100043_vl.field_101943_Yb
		// @1065: iload #10
		// @1067: ifeq @13C2
		// @106A: goto @106E
		// @106D: athrow
		// @106E: iconst_0
		// @106F: istore #4
		// @1071: iload #10
		// @1073: ifeq @13C2
		// @1076: aload_0
		// @1077: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @107A: iconst_1
		// @107B: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @107E: ifeq @10AC
		// @1081: goto @1085
		// @1084: athrow
		// @1085: aload_0
		// @1086: iload_3
		// @1087: iload_1
		// @1088: bipush -7 (0xF9)
		// @108A: ixor
		// @108B: invokespecial game.C_100034_gi.func_103977_a(int, int)boolean
		// @108E: ifeq @10AC
		// @1091: goto @1095
		// @1094: athrow
		// @1095: getstatic int game.C_100197_ra.field_100867_r
		// @1098: iconst_1
		// @1099: iadd
		// @109A: putstatic int game.C_100197_ra.field_100867_r
		// @109D: sipush 500 (0x01F4)
		// @10A0: putstatic int game.C_100043_vl.field_101943_Yb
		// @10A3: iload #10
		// @10A5: ifeq @13C2
		// @10A8: goto @10AC
		// @10AB: athrow
		// @10AC: iconst_0
		// @10AD: istore #4
		// @10AF: iload #10
		// @10B1: ifeq @13C2
		// @10B4: aload_0
		// @10B5: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @10B8: iconst_1
		// @10B9: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @10BC: ifne @10C7
		// @10BF: goto @10C3
		// @10C2: athrow
		// @10C3: goto @13C2
		// @10C6: athrow
		// @10C7: iload_1
		// @10C8: bipush 41 (0x29)
		// @10CA: iadd
		// @10CB: iconst_0
		// @10CC: invokestatic game.C_100206_qe.func_105938_b(boolean)java.applet.Applet
		// @10CF: invokestatic game.C_100266_me.func_106640_a(int, java.applet.Applet)void
		// @10D2: iload #10
		// @10D4: ifeq @13C2
		// @10D7: aload_0
		// @10D8: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @10DB: iconst_1
		// @10DC: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @10DF: ifeq @13C2
		// @10E2: goto @10E6
		// @10E5: athrow
		// @10E6: bipush -83 (0xAD)
		// @10E8: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @10EB: ifeq @10F6
		// @10EE: goto @10F2
		// @10F1: athrow
		// @10F2: goto @13C2
		// @10F5: athrow
		// @10F6: iload_2
		// @10F7: istore #6
		// @10F9: getstatic int game.C_100050_vg.field_100632_k
		// @10FC: istore #7
		// @10FE: iload #7
		// @1100: iconst_m1
		// @1101: ixor
		// @1102: bipush -6 (0xFA)
		// @1104: if_icmpeq @1125
		// @1107: bipush -7 (0xF9)
		// @1109: iload #7
		// @110B: iconst_m1
		// @110C: ixor
		// @110D: if_icmpeq @1125
		// @1110: goto @1114
		// @1113: athrow
		// @1114: bipush -9 (0xF7)
		// @1116: iload #7
		// @1118: iconst_m1
		// @1119: ixor
		// @111A: if_icmpeq @1125
		// @111D: goto @1121
		// @1120: athrow
		// @1121: goto @112A
		// @1124: athrow
		// @1125: getstatic int game.C_100069_vb.field_104357_e
		// @1128: istore #7
		// @112A: iload #6
		// @112C: bipush 21 (0x15)
		// @112E: bipush -123 (0x85)
		// @1130: iload #7
		// @1132: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @1135: iload #10
		// @1137: ifeq @13C2
		// @113A: aload_0
		// @113B: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @113E: iconst_1
		// @113F: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @1142: ifne @114D
		// @1145: goto @1149
		// @1148: athrow
		// @1149: goto @13C2
		// @114C: athrow
		// @114D: iload_1
		// @114E: bipush 112 (0x70)
		// @1150: iadd
		// @1151: invokestatic game.C_100218_am.func_103103_i(int)void
		// @1154: iconst_1
		// @1155: putstatic int game.C_100200_ba.field_105852_c
		// @1158: aconst_null
		// @1159: putstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @115C: iconst_m1
		// @115D: putstatic int game.C_100174_sb.field_105609_b
		// @1160: aconst_null
		// @1161: putstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @1164: bipush -74 (0xB6)
		// @1166: invokestatic game.C_100203_ql.func_105921_a(int)void
		// @1169: iconst_0
		// @116A: istore #6
		// @116C: iload #6
		// @116E: iconst_m1
		// @116F: ixor
		// @1170: getstatic int[] game.C_100074_g.field_104410_e
		// @1173: arraylength
		// @1174: iconst_m1
		// @1175: ixor
		// @1176: if_icmple @1191
		// @1179: getstatic int[] game.C_100074_g.field_104410_e
		// @117C: iload #6
		// @117E: iconst_0
		// @117F: iastore
		// @1180: iinc #6 +1
		// @1183: iload #10
		// @1185: ifne @1195
		// @1188: iload #10
		// @118A: ifeq @116C
		// @118D: goto @1191
		// @1190: athrow
		// @1191: iconst_0
		// @1192: putstatic int game.C_100068_vc.field_104343_e
		// @1195: iload #10
		// @1197: ifeq @13C2
		// @119A: aload_0
		// @119B: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @119E: iconst_1
		// @119F: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @11A2: ifne @11AD
		// @11A5: goto @11A9
		// @11A8: athrow
		// @11A9: goto @13C2
		// @11AC: athrow
		// @11AD: iload_2
		// @11AE: istore #6
		// @11B0: getstatic int game.C_100050_vg.field_100632_k
		// @11B3: istore #7
		// @11B5: iload #7
		// @11B7: iconst_m1
		// @11B8: ixor
		// @11B9: bipush -6 (0xFA)
		// @11BB: if_icmpeq @11DC
		// @11BE: bipush -7 (0xF9)
		// @11C0: iload #7
		// @11C2: iconst_m1
		// @11C3: ixor
		// @11C4: if_icmpeq @11DC
		// @11C7: goto @11CB
		// @11CA: athrow
		// @11CB: iload #7
		// @11CD: iconst_m1
		// @11CE: ixor
		// @11CF: bipush -9 (0xF7)
		// @11D1: if_icmpeq @11DC
		// @11D4: goto @11D8
		// @11D7: athrow
		// @11D8: goto @11E1
		// @11DB: athrow
		// @11DC: getstatic int game.C_100069_vb.field_104357_e
		// @11DF: istore #7
		// @11E1: iload #6
		// @11E3: bipush 17 (0x11)
		// @11E5: bipush -118 (0x8A)
		// @11E7: iload #7
		// @11E9: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @11EC: iload #10
		// @11EE: ifeq @13C2
		// @11F1: aload_0
		// @11F2: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @11F5: iconst_1
		// @11F6: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @11F9: ifne @1204
		// @11FC: goto @1200
		// @11FF: athrow
		// @1200: goto @13C2
		// @1203: athrow
		// @1204: iload_2
		// @1205: istore #6
		// @1207: getstatic int game.C_100050_vg.field_100632_k
		// @120A: istore #7
		// @120C: iconst_5
		// @120D: iload #7
		// @120F: if_icmpeq @122C
		// @1212: iload #7
		// @1214: bipush 6 (0x06)
		// @1216: if_icmpeq @122C
		// @1219: goto @121D
		// @121C: athrow
		// @121D: iload #7
		// @121F: bipush 8 (0x08)
		// @1221: if_icmpeq @122C
		// @1224: goto @1228
		// @1227: athrow
		// @1228: goto @1231
		// @122B: athrow
		// @122C: getstatic int game.C_100069_vb.field_104357_e
		// @122F: istore #7
		// @1231: iload #6
		// @1233: bipush 22 (0x16)
		// @1235: bipush -123 (0x85)
		// @1237: iload #7
		// @1239: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @123C: iload #10
		// @123E: ifeq @13C2
		// @1241: aload_0
		// @1242: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @1245: iconst_1
		// @1246: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @1249: ifeq @13C2
		// @124C: goto @1250
		// @124F: athrow
		// @1250: getstatic boolean game.C_100216_aj.field_104462_t
		// @1253: ifne @125F
		// @1256: goto @125A
		// @1259: athrow
		// @125A: iconst_1
		// @125B: goto @1260
		// @125E: athrow
		// @125F: iconst_0
		// @1260: putstatic boolean game.C_100216_aj.field_104462_t
		// @1263: aconst_null
		// @1264: putstatic game.C_100302_ka game.C_100145_ta.field_100429_j
		// @1267: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @126A: bipush 42 (0x2A)
		// @126C: getstatic boolean game.C_100216_aj.field_104462_t
		// @126F: ifeq @1279
		// @1272: getstatic java.lang.String game.C_100164_se.field_105453_c
		// @1275: goto @127C
		// @1278: athrow
		// @1279: getstatic java.lang.String game.C_100138_bo.field_100413_h
		// @127C: aastore
		// @127D: bipush -25 (0xE7)
		// @127F: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @1282: ifne @13C2
		// @1285: bipush 126 (0x7E)
		// @1287: invokestatic game.C_100017_wj.func_103813_b(byte)void
		// @128A: iload #10
		// @128C: ifeq @13C2
		// @128F: goto @1293
		// @1292: athrow
		// @1293: aload_0
		// @1294: iload_3
		// @1295: iload_1
		// @1296: bipush -7 (0xF9)
		// @1298: ixor
		// @1299: invokespecial game.C_100034_gi.func_103977_a(int, int)boolean
		// @129C: ifeq @12F1
		// @129F: goto @12A3
		// @12A2: athrow
		// @12A3: aload_0
		// @12A4: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @12A7: iconst_1
		// @12A8: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @12AB: ifeq @12F1
		// @12AE: goto @12B2
		// @12B1: athrow
		// @12B2: getstatic boolean game.C_100094_j.field_104552_j
		// @12B5: ifne @12C1
		// @12B8: goto @12BC
		// @12BB: athrow
		// @12BC: iconst_1
		// @12BD: goto @12C2
		// @12C0: athrow
		// @12C1: iconst_0
		// @12C2: putstatic boolean game.C_100094_j.field_104552_j
		// @12C5: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @12C8: bipush 43 (0x2B)
		// @12CA: getstatic boolean game.C_100094_j.field_104552_j
		// @12CD: ifne @12D7
		// @12D0: getstatic java.lang.String game.C_100141_tc.field_105057_f
		// @12D3: goto @12DA
		// @12D6: athrow
		// @12D7: getstatic java.lang.String game.C_100151_bc.field_102941_P
		// @12DA: aastore
		// @12DB: bipush -25 (0xE7)
		// @12DD: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @12E0: ifne @13C2
		// @12E3: bipush 127 (0x7F)
		// @12E5: invokestatic game.C_100017_wj.func_103813_b(byte)void
		// @12E8: iload #10
		// @12EA: ifeq @13C2
		// @12ED: goto @12F1
		// @12F0: athrow
		// @12F1: iconst_0
		// @12F2: istore #4
		// @12F4: iload #10
		// @12F6: ifeq @13C2
		// @12F9: aload_0
		// @12FA: iload_3
		// @12FB: bipush -4 (0xFC)
		// @12FD: invokespecial game.C_100034_gi.func_103977_a(int, int)boolean
		// @1300: ifeq @1316
		// @1303: goto @1307
		// @1306: athrow
		// @1307: aload_0
		// @1308: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @130B: iconst_1
		// @130C: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @130F: ifne @131E
		// @1312: goto @1316
		// @1315: athrow
		// @1316: iconst_0
		// @1317: istore #4
		// @1319: iload #10
		// @131B: ifeq @13C2
		// @131E: getstatic boolean game.C_100102_w.field_104632_g
		// @1321: ifne @132D
		// @1324: goto @1328
		// @1327: athrow
		// @1328: iconst_1
		// @1329: goto @132E
		// @132C: athrow
		// @132D: iconst_0
		// @132E: putstatic boolean game.C_100102_w.field_104632_g
		// @1331: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @1334: bipush 44 (0x2C)
		// @1336: getstatic boolean game.C_100102_w.field_104632_g
		// @1339: ifne @1343
		// @133C: getstatic java.lang.String game.C_100059_df.field_101606_K
		// @133F: goto @1346
		// @1342: athrow
		// @1343: getstatic java.lang.String game.C_100041_wf.field_104105_e
		// @1346: aastore
		// @1347: bipush -25 (0xE7)
		// @1349: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @134C: ifne @13C2
		// @134F: bipush 113 (0x71)
		// @1351: invokestatic game.C_100017_wj.func_103813_b(byte)void
		// @1354: iload #10
		// @1356: ifeq @13C2
		// @1359: goto @135D
		// @135C: athrow
		// @135D: aload_0
		// @135E: iload_3
		// @135F: iload_1
		// @1360: bipush -7 (0xF9)
		// @1362: ixor
		// @1363: invokespecial game.C_100034_gi.func_103977_a(int, int)boolean
		// @1366: ifeq @137C
		// @1369: goto @136D
		// @136C: athrow
		// @136D: aload_0
		// @136E: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @1371: iconst_1
		// @1372: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @1375: ifne @1384
		// @1378: goto @137C
		// @137B: athrow
		// @137C: iconst_0
		// @137D: istore #4
		// @137F: iload #10
		// @1381: ifeq @13C2
		// @1384: getstatic boolean game.C_100247_pa.field_106414_d
		// @1387: ifne @1393
		// @138A: goto @138E
		// @138D: athrow
		// @138E: iconst_1
		// @138F: goto @1394
		// @1392: athrow
		// @1393: iconst_0
		// @1394: putstatic boolean game.C_100247_pa.field_106414_d
		// @1397: aconst_null
		// @1398: putstatic game.C_100302_ka game.C_100145_ta.field_100429_j
		// @139B: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @139E: bipush 47 (0x2F)
		// @13A0: getstatic boolean game.C_100247_pa.field_106414_d
		// @13A3: ifne @13AD
		// @13A6: getstatic java.lang.String game.C_100220_ac.field_106063_k
		// @13A9: goto @13B0
		// @13AC: athrow
		// @13AD: getstatic java.lang.String game.C_100033_gj.field_101922_mc
		// @13B0: aastore
		// @13B1: bipush -25 (0xE7)
		// @13B3: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @13B6: ifne @13C2
		// @13B9: bipush 122 (0x7A)
		// @13BB: invokestatic game.C_100017_wj.func_103813_b(byte)void
		// @13BE: goto @13C2
		// @13C1: athrow
		// @13C2: iload #4
		// @13C4: ifne @13CB
		// @13C7: goto @13D4
		// @13CA: athrow
		// @13CB: bipush 95 (0x5F)
		// @13CD: iload_1
		// @13CE: bipush 13 (0x0D)
		// @13D0: ixor
		// @13D1: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @13D4: goto @140D
		// @13D7: astore #4
		// @13D9: aload #4
		// @13DB: new java.lang.StringBuilder
		// @13DE: dup
		// @13DF: invokespecial java.lang.StringBuilder.<init>()void
		// @13E2: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @13E5: bipush 77 (0x4D)
		// @13E7: aaload
		// @13E8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @13EB: iload_1
		// @13EC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @13EF: bipush 44 (0x2C)
		// @13F1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13F4: iload_2
		// @13F5: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @13F8: bipush 44 (0x2C)
		// @13FA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13FD: iload_3
		// @13FE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1401: bipush 41 (0x29)
		// @1403: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1406: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1409: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @140C: athrow
		// @140D: return
	}
	
	private final void func_104015_b(boolean arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #24
		// @005: bipush 30 (0x1E)
		// @007: bipush 70 (0x46)
		// @009: sipush 580 (0x0244)
		// @00C: sipush 350 (0x015E)
		// @00F: ldc_w 5789784 (0x585858)
		// @012: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @015: bipush 34 (0x22)
		// @017: bipush 74 (0x4A)
		// @019: bipush 60 (0x3C)
		// @01B: sipush 342 (0x0156)
		// @01E: ldc_w 930889 (0xe3449)
		// @021: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @024: sipush 546 (0x0222)
		// @027: bipush 74 (0x4A)
		// @029: bipush 60 (0x3C)
		// @02B: sipush 342 (0x0156)
		// @02E: ldc_w 930889 (0xe3449)
		// @031: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @034: bipush 98 (0x62)
		// @036: bipush 74 (0x4A)
		// @038: bipush 61 (0x3D)
		// @03A: bipush 23 (0x17)
		// @03C: ldc_w 930889 (0xe3449)
		// @03F: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @042: sipush 481 (0x01E1)
		// @045: bipush 74 (0x4A)
		// @047: bipush 61 (0x3D)
		// @049: bipush 23 (0x17)
		// @04B: ldc_w 930889 (0xe3449)
		// @04E: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @051: ldc_w 930889 (0xe3449)
		// @054: istore_3
		// @055: getstatic int game.C_100273_mm.field_106684_c
		// @058: istore #4
		// @05A: iconst_0
		// @05B: putstatic int game.C_100273_mm.field_106684_c
		// @05E: getstatic int game.C_100096_un.field_104561_f
		// @061: iconst_m1
		// @062: ixor
		// @063: iconst_m1
		// @064: if_icmplt @06B
		// @067: goto @0B9
		// @06A: athrow
		// @06B: getstatic int game.C_100015_wh.field_103781_g
		// @06E: bipush 98 (0x62)
		// @070: if_icmplt @0B5
		// @073: sipush 159 (0x009F)
		// @076: getstatic int game.C_100015_wh.field_103781_g
		// @079: if_icmple @0B5
		// @07C: goto @080
		// @07F: athrow
		// @080: getstatic int game.C_100338_jc.field_105370_l
		// @083: bipush 74 (0x4A)
		// @085: if_icmplt @0B5
		// @088: goto @08C
		// @08B: athrow
		// @08C: bipush -98 (0x9E)
		// @08E: getstatic int game.C_100338_jc.field_105370_l
		// @091: iconst_m1
		// @092: ixor
		// @093: if_icmpge @0B5
		// @096: goto @09A
		// @099: athrow
		// @09A: bipush 98 (0x62)
		// @09C: bipush 73 (0x49)
		// @09E: bipush 126 (0x7E)
		// @0A0: bipush 61 (0x3D)
		// @0A2: getstatic game.C_100037_wb[] game.C_100073_f.field_101717_A
		// @0A5: bipush 24 (0x18)
		// @0A7: invokestatic game.C_100157_db.func_103554_a(int, int, int, int, game.C_100037_wb[], int)void
		// @0AA: iconst_0
		// @0AB: istore_3
		// @0AC: iconst_m1
		// @0AD: putstatic int game.C_100273_mm.field_106684_c
		// @0B0: iload #24
		// @0B2: ifeq @0B9
		// @0B5: ldc_w 1146810 (0x117fba)
		// @0B8: istore_3
		// @0B9: ldc_w 930889 (0xe3449)
		// @0BC: istore #5
		// @0BE: getstatic int game.C_100096_un.field_104561_f
		// @0C1: iconst_m1
		// @0C2: getstatic int[][][] game.C_100203_ql.field_105931_c
		// @0C5: arraylength
		// @0C6: iadd
		// @0C7: if_icmpge @120
		// @0CA: sipush 481 (0x01E1)
		// @0CD: getstatic int game.C_100015_wh.field_103781_g
		// @0D0: if_icmpgt @0FE
		// @0D3: goto @0D7
		// @0D6: athrow
		// @0D7: sipush 542 (0x021E)
		// @0DA: getstatic int game.C_100015_wh.field_103781_g
		// @0DD: if_icmple @0FE
		// @0E0: goto @0E4
		// @0E3: athrow
		// @0E4: getstatic int game.C_100338_jc.field_105370_l
		// @0E7: iconst_m1
		// @0E8: ixor
		// @0E9: bipush -75 (0xB5)
		// @0EB: if_icmpgt @0FE
		// @0EE: goto @0F2
		// @0F1: athrow
		// @0F2: bipush 97 (0x61)
		// @0F4: getstatic int game.C_100338_jc.field_105370_l
		// @0F7: if_icmpgt @108
		// @0FA: goto @0FE
		// @0FD: athrow
		// @0FE: ldc_w 1146810 (0x117fba)
		// @101: istore #5
		// @103: iload #24
		// @105: ifeq @120
		// @108: sipush 481 (0x01E1)
		// @10B: bipush 73 (0x49)
		// @10D: bipush 126 (0x7E)
		// @10F: bipush 61 (0x3D)
		// @111: getstatic game.C_100037_wb[] game.C_100073_f.field_101717_A
		// @114: bipush 24 (0x18)
		// @116: invokestatic game.C_100157_db.func_103554_a(int, int, int, int, game.C_100037_wb[], int)void
		// @119: iconst_0
		// @11A: istore #5
		// @11C: iconst_1
		// @11D: putstatic int game.C_100273_mm.field_106684_c
		// @120: getstatic int game.C_100273_mm.field_106684_c
		// @123: iconst_m1
		// @124: ixor
		// @125: iload #4
		// @127: iconst_m1
		// @128: ixor
		// @129: if_icmpeq @144
		// @12C: getstatic int game.C_100273_mm.field_106684_c
		// @12F: iconst_m1
		// @130: ixor
		// @131: iconst_m1
		// @132: if_icmpeq @144
		// @135: goto @139
		// @138: athrow
		// @139: bipush 97 (0x61)
		// @13B: bipush 8 (0x08)
		// @13D: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @140: goto @144
		// @143: athrow
		// @144: getstatic game.C_100037_wb game.C_100257_ln.field_106482_e
		// @147: bipush 98 (0x62)
		// @149: bipush 61 (0x3D)
		// @14B: getstatic game.C_100037_wb game.C_100257_ln.field_106482_e
		// @14E: getfield int game.C_100037_wb.field_102339_s
		// @151: ineg
		// @152: iadd
		// @153: iconst_2
		// @154: idiv
		// @155: ineg
		// @156: isub
		// @157: bipush 23 (0x17)
		// @159: getstatic game.C_100037_wb game.C_100257_ln.field_106482_e
		// @15C: getfield int game.C_100037_wb.field_102337_u
		// @15F: isub
		// @160: iconst_2
		// @161: idiv
		// @162: bipush 74 (0x4A)
		// @164: iadd
		// @165: iload_3
		// @166: invokevirtual game.C_100037_wb.func_102383_f(int, int, int)void
		// @169: getstatic game.C_100037_wb game.C_100071_va.field_101665_t
		// @16C: sipush 481 (0x01E1)
		// @16F: bipush 61 (0x3D)
		// @171: getstatic game.C_100037_wb game.C_100071_va.field_101665_t
		// @174: getfield int game.C_100037_wb.field_102339_s
		// @177: isub
		// @178: iconst_2
		// @179: idiv
		// @17A: iadd
		// @17B: bipush 74 (0x4A)
		// @17D: bipush 23 (0x17)
		// @17F: getstatic game.C_100037_wb game.C_100071_va.field_101665_t
		// @182: getfield int game.C_100037_wb.field_102337_u
		// @185: isub
		// @186: iconst_2
		// @187: idiv
		// @188: ineg
		// @189: isub
		// @18A: iload #5
		// @18C: invokevirtual game.C_100037_wb.func_102383_f(int, int, int)void
		// @18F: sipush 163 (0x00A3)
		// @192: bipush 74 (0x4A)
		// @194: sipush 314 (0x013A)
		// @197: bipush 23 (0x17)
		// @199: ldc_w 930889 (0xe3449)
		// @19C: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @19F: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @1A2: sipush -30945 (0x871F)
		// @1A5: iconst_2
		// @1A6: anewarray java.lang.String
		// @1A9: dup
		// @1AA: iconst_0
		// @1AB: getstatic int game.C_100096_un.field_104561_f
		// @1AE: iconst_1
		// @1AF: iadd
		// @1B0: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @1B3: aastore
		// @1B4: dup
		// @1B5: iconst_1
		// @1B6: getstatic int[][][] game.C_100203_ql.field_105931_c
		// @1B9: arraylength
		// @1BA: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @1BD: aastore
		// @1BE: getstatic java.lang.String game.C_100288_jn.field_106841_d
		// @1C1: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @1C4: sipush 320 (0x0140)
		// @1C7: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @1CA: getfield int game.C_100193_re.field_101769_u
		// @1CD: bipush 23 (0x17)
		// @1CF: iadd
		// @1D0: iconst_2
		// @1D1: idiv
		// @1D2: bipush 74 (0x4A)
		// @1D4: iadd
		// @1D5: ldc 1021128 (0xf94c8)
		// @1D7: iconst_m1
		// @1D8: invokevirtual game.C_100193_re.func_101744_b(java.lang.String, int, int, int, int)void
		// @1DB: bipush 98 (0x62)
		// @1DD: bipush 101 (0x65)
		// @1DF: sipush 444 (0x01BC)
		// @1E2: sipush 154 (0x009A)
		// @1E5: ldc_w 5789784 (0x585858)
		// @1E8: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @1EB: sipush 262 (0x0106)
		// @1EE: sipush 259 (0x0103)
		// @1F1: sipush 157 (0x009D)
		// @1F4: ldc_w 930889 (0xe3449)
		// @1F7: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @1FA: bipush 98 (0x62)
		// @1FC: sipush 259 (0x0103)
		// @1FF: sipush 444 (0x01BC)
		// @202: sipush 157 (0x009D)
		// @205: ldc 1130327 (0x113f57)
		// @207: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @20A: sipush 266 (0x010A)
		// @20D: sipush 263 (0x0107)
		// @210: sipush 272 (0x0110)
		// @213: bipush 23 (0x17)
		// @215: ldc 1130327 (0x113f57)
		// @217: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @21A: sipush 266 (0x010A)
		// @21D: sipush 290 (0x0122)
		// @220: sipush 272 (0x0110)
		// @223: bipush 122 (0x7A)
		// @225: ldc_w 2697513 (0x292929)
		// @228: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @22B: bipush 78 (0x4E)
		// @22D: istore #6
		// @22F: iconst_0
		// @230: istore #7
		// @232: iload #7
		// @234: bipush 16 (0x10)
		// @236: if_icmpge @26A
		// @239: bipush 37 (0x25)
		// @23B: iload #6
		// @23D: bipush 54 (0x36)
		// @23F: bipush 18 (0x12)
		// @241: ldc_w 2697513 (0x292929)
		// @244: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @247: sipush 549 (0x0225)
		// @24A: iload #6
		// @24C: bipush 54 (0x36)
		// @24E: bipush 18 (0x12)
		// @250: ldc_w 2697513 (0x292929)
		// @253: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @256: iinc #6 +21
		// @259: iinc #7 +1
		// @25C: iload #24
		// @25E: ifne @26E
		// @261: iload #24
		// @263: ifeq @232
		// @266: goto @26A
		// @269: athrow
		// @26A: bipush 120 (0x78)
		// @26C: istore #7
		// @26E: bipush 106 (0x6A)
		// @270: istore #8
		// @272: iconst_m1
		// @273: putstatic int game.C_100220_ac.field_106053_f
		// @276: iload_1
		// @277: ifne @281
		// @27A: getstatic int[] game.C_100066_dl.field_101632_G
		// @27D: goto @284
		// @280: athrow
		// @281: getstatic int[] game.C_100139_tb.field_100529_w
		// @284: astore #9
		// @286: iconst_0
		// @287: istore #10
		// @289: getstatic int[][][] game.C_100203_ql.field_105931_c
		// @28C: getstatic int game.C_100096_un.field_104561_f
		// @28F: aaload
		// @290: astore #11
		// @292: iconst_0
		// @293: istore #12
		// @295: aload #11
		// @297: arraylength
		// @298: iconst_m1
		// @299: ixor
		// @29A: iload #12
		// @29C: iconst_m1
		// @29D: ixor
		// @29E: if_icmpge @2FD
		// @2A1: aload #11
		// @2A3: iload #12
		// @2A5: aaload
		// @2A6: astore #13
		// @2A8: iconst_0
		// @2A9: istore #14
		// @2AB: aload #13
		// @2AD: astore #15
		// @2AF: iconst_0
		// @2B0: iload #24
		// @2B2: ifne @30F
		// @2B5: istore #16
		// @2B7: iload #16
		// @2B9: aload #15
		// @2BB: arraylength
		// @2BC: if_icmpge @2ED
		// @2BF: aload #15
		// @2C1: iload #16
		// @2C3: iaload
		// @2C4: istore #17
		// @2C6: aload_0
		// @2C7: iconst_0
		// @2C8: iload #17
		// @2CA: invokespecial game.C_100034_gi.func_104006_a(boolean, int)boolean
		// @2CD: iload #24
		// @2CF: ifne @2EF
		// @2D2: ifeq @2E1
		// @2D5: goto @2D9
		// @2D8: athrow
		// @2D9: iconst_1
		// @2DA: istore #14
		// @2DC: iload #24
		// @2DE: ifeq @2ED
		// @2E1: iinc #16 +1
		// @2E4: iload #24
		// @2E6: ifeq @2B7
		// @2E9: goto @2ED
		// @2EC: athrow
		// @2ED: iload #14
		// @2EF: ifeq @2F5
		// @2F2: iinc #10 +1
		// @2F5: iinc #12 +1
		// @2F8: iload #24
		// @2FA: ifeq @295
		// @2FD: bipush 30 (0x1E)
		// @2FF: iload #10
		// @301: bipush 30 (0x1E)
		// @303: imul
		// @304: ineg
		// @305: sipush 154 (0x009A)
		// @308: iadd
		// @309: iconst_1
		// @30A: iload #10
		// @30C: iadd
		// @30D: idiv
		// @30E: iadd
		// @30F: istore #11
		// @311: bipush -30 (0xE2)
		// @313: bipush 101 (0x65)
		// @315: iload #11
		// @317: iadd
		// @318: iadd
		// @319: istore #8
		// @31B: getstatic int[][][] game.C_100203_ql.field_105931_c
		// @31E: getstatic int game.C_100096_un.field_104561_f
		// @321: aaload
		// @322: astore #12
		// @324: iload_2
		// @325: istore #13
		// @327: aload #12
		// @329: arraylength
		// @32A: iload #13
		// @32C: if_icmple @4E1
		// @32F: aload #12
		// @331: iload #13
		// @333: aaload
		// @334: astore #14
		// @336: iconst_0
		// @337: istore #15
		// @339: aload #14
		// @33B: astore #16
		// @33D: iconst_0
		// @33E: iload #24
		// @340: ifne @4E6
		// @343: istore #17
		// @345: iload #17
		// @347: iconst_m1
		// @348: ixor
		// @349: aload #16
		// @34B: arraylength
		// @34C: iconst_m1
		// @34D: ixor
		// @34E: if_icmple @379
		// @351: aload #16
		// @353: iload #17
		// @355: iaload
		// @356: istore #18
		// @358: aload_0
		// @359: iconst_0
		// @35A: iload #18
		// @35C: invokespecial game.C_100034_gi.func_104006_a(boolean, int)boolean
		// @35F: iload #24
		// @361: ifne @37A
		// @364: ifne @36E
		// @367: goto @36B
		// @36A: athrow
		// @36B: goto @371
		// @36E: iinc #15 +1
		// @371: iinc #17 +1
		// @374: iload #24
		// @376: ifeq @345
		// @379: iconst_m1
		// @37A: iload #15
		// @37C: iconst_m1
		// @37D: ixor
		// @37E: if_icmpeq @4D9
		// @381: bipush 30 (0x1E)
		// @383: iload #15
		// @385: bipush 30 (0x1E)
		// @387: imul
		// @388: ineg
		// @389: sipush 444 (0x01BC)
		// @38C: iadd
		// @38D: iload #15
		// @38F: iconst_m1
		// @390: isub
		// @391: idiv
		// @392: iadd
		// @393: istore #16
		// @395: bipush -30 (0xE2)
		// @397: bipush 98 (0x62)
		// @399: iload #16
		// @39B: ineg
		// @39C: isub
		// @39D: iadd
		// @39E: istore #7
		// @3A0: aload #14
		// @3A2: astore #17
		// @3A4: iconst_0
		// @3A5: istore #18
		// @3A7: iload #18
		// @3A9: aload #17
		// @3AB: arraylength
		// @3AC: if_icmpge @4D2
		// @3AF: aload #17
		// @3B1: iload #18
		// @3B3: iaload
		// @3B4: istore #19
		// @3B6: getstatic int game.C_100015_wh.field_103781_g
		// @3B9: iload #7
		// @3BB: iload #24
		// @3BD: ifne @4D6
		// @3C0: if_icmplt @3FE
		// @3C3: goto @3C7
		// @3C6: athrow
		// @3C7: getstatic int game.C_100015_wh.field_103781_g
		// @3CA: iload #7
		// @3CC: bipush 30 (0x1E)
		// @3CE: iadd
		// @3CF: if_icmpge @3FE
		// @3D2: goto @3D6
		// @3D5: athrow
		// @3D6: iload #8
		// @3D8: iconst_m1
		// @3D9: ixor
		// @3DA: getstatic int game.C_100338_jc.field_105370_l
		// @3DD: iconst_m1
		// @3DE: ixor
		// @3DF: if_icmplt @3FE
		// @3E2: goto @3E6
		// @3E5: athrow
		// @3E6: getstatic int game.C_100338_jc.field_105370_l
		// @3E9: bipush 30 (0x1E)
		// @3EB: iload #8
		// @3ED: iadd
		// @3EE: if_icmpge @3FE
		// @3F1: goto @3F5
		// @3F4: athrow
		// @3F5: iload #19
		// @3F7: putstatic int game.C_100220_ac.field_106053_f
		// @3FA: goto @3FE
		// @3FD: athrow
		// @3FE: getstatic game.C_100037_wb game.C_100225_ah.field_106129_m
		// @401: astore #20
		// @403: iload #19
		// @405: bipush 31 (0x1F)
		// @407: aload #9
		// @409: invokestatic game.C_100189_ri.func_105742_a(int, int, int[])boolean
		// @40C: ifeq @41C
		// @40F: getstatic game.C_100037_wb[] game.C_100042_we.field_104136_l
		// @412: iload #19
		// @414: aaload
		// @415: astore #20
		// @417: iload #24
		// @419: ifeq @463
		// @41C: iload #19
		// @41E: bipush 31 (0x1F)
		// @420: getstatic int[] game.C_100275_na.field_103095_q
		// @423: invokestatic game.C_100189_ri.func_105742_a(int, int, int[])boolean
		// @426: ifne @460
		// @429: goto @42D
		// @42C: athrow
		// @42D: iload #19
		// @42F: iload_2
		// @430: bipush 31 (0x1F)
		// @432: ixor
		// @433: getstatic int[] game.C_100275_na.field_103086_o
		// @436: invokestatic game.C_100189_ri.func_105742_a(int, int, int[])boolean
		// @439: ifeq @463
		// @43C: goto @440
		// @43F: athrow
		// @440: bipush -25 (0xE7)
		// @442: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @445: ifne @45A
		// @448: goto @44C
		// @44B: athrow
		// @44C: getstatic int game.C_100212_qc.field_105976_b
		// @44F: ifle @45A
		// @452: goto @456
		// @455: athrow
		// @456: goto @463
		// @459: athrow
		// @45A: aconst_null
		// @45B: astore #20
		// @45D: goto @463
		// @460: aconst_null
		// @461: astore #20
		// @463: aload #20
		// @465: ifnull @4B2
		// @468: iconst_0
		// @469: istore #21
		// @46B: iload #19
		// @46D: iconst_m1
		// @46E: ixor
		// @46F: getstatic int game.C_100103_eh.field_104667_c
		// @472: iconst_m1
		// @473: ixor
		// @474: if_icmpeq @493
		// @477: iload #19
		// @479: iconst_m1
		// @47A: ixor
		// @47B: getstatic int game.C_100220_ac.field_106053_f
		// @47E: iconst_m1
		// @47F: ixor
		// @480: if_icmpeq @48B
		// @483: goto @487
		// @486: athrow
		// @487: goto @496
		// @48A: athrow
		// @48B: iconst_2
		// @48C: istore #21
		// @48E: iload #24
		// @490: ifeq @496
		// @493: iconst_4
		// @494: istore #21
		// @496: aload #20
		// @498: iload #21
		// @49A: iload #7
		// @49C: iadd
		// @49D: iload #21
		// @49F: ineg
		// @4A0: iload #8
		// @4A2: iadd
		// @4A3: invokevirtual game.C_100037_wb.func_102378_b(int, int)void
		// @4A6: iload #7
		// @4A8: iload #16
		// @4AA: iadd
		// @4AB: istore #7
		// @4AD: iload #24
		// @4AF: ifeq @4CA
		// @4B2: getstatic int game.C_100220_ac.field_106053_f
		// @4B5: iconst_m1
		// @4B6: ixor
		// @4B7: iload #19
		// @4B9: iconst_m1
		// @4BA: ixor
		// @4BB: if_icmpeq @4C6
		// @4BE: goto @4C2
		// @4C1: athrow
		// @4C2: goto @4CA
		// @4C5: athrow
		// @4C6: iconst_m1
		// @4C7: putstatic int game.C_100220_ac.field_106053_f
		// @4CA: iinc #18 +1
		// @4CD: iload #24
		// @4CF: ifeq @3A7
		// @4D2: iload #8
		// @4D4: iload #11
		// @4D6: iadd
		// @4D7: istore #8
		// @4D9: iinc #13 +1
		// @4DC: iload #24
		// @4DE: ifeq @327
		// @4E1: getstatic int game.C_100103_eh.field_104667_c
		// @4E4: iconst_m1
		// @4E5: ixor
		// @4E6: ifne @4F0
		// @4E9: getstatic int game.C_100220_ac.field_106053_f
		// @4EC: goto @4F3
		// @4EF: athrow
		// @4F0: getstatic int game.C_100103_eh.field_104667_c
		// @4F3: istore #12
		// @4F5: iload #12
		// @4F7: iconst_m1
		// @4F8: if_icmpne @51F
		// @4FB: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @4FE: getstatic java.lang.String game.C_100233_oa.field_106261_y
		// @501: sipush 276 (0x0114)
		// @504: sipush 300 (0x012C)
		// @507: sipush 252 (0x00FC)
		// @50A: bipush 102 (0x66)
		// @50C: ldc 1021128 (0xf94c8)
		// @50E: iconst_m1
		// @50F: iconst_1
		// @510: iconst_1
		// @511: iconst_0
		// @512: invokevirtual game.C_100193_re.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @515: pop
		// @516: iload #24
		// @518: ifeq @77F
		// @51B: goto @51F
		// @51E: athrow
		// @51F: sipush 402 (0x0192)
		// @522: istore #13
		// @524: getstatic game.C_100193_re game.C_100029_gn.field_103368_S
		// @527: getfield int game.C_100193_re.field_101769_u
		// @52A: bipush 23 (0x17)
		// @52C: iadd
		// @52D: iconst_2
		// @52E: idiv
		// @52F: sipush 263 (0x0107)
		// @532: iadd
		// @533: istore #14
		// @535: getstatic game.C_100193_re game.C_100029_gn.field_103368_S
		// @538: getstatic java.lang.String[] game.C_100281_ng.field_103455_E
		// @53B: iload #12
		// @53D: aaload
		// @53E: iconst_0
		// @53F: invokestatic game.C_100096_un.func_104560_a(java.lang.String, boolean)java.lang.String
		// @542: iload #13
		// @544: iload #14
		// @546: ldc 1021128 (0xf94c8)
		// @548: iconst_m1
		// @549: invokevirtual game.C_100193_re.func_101744_b(java.lang.String, int, int, int, int)void
		// @54C: sipush 306 (0x0132)
		// @54F: istore #14
		// @551: iload #12
		// @553: bipush 31 (0x1F)
		// @555: aload #9
		// @557: invokestatic game.C_100189_ri.func_105742_a(int, int, int[])boolean
		// @55A: istore #15
		// @55C: iload #15
		// @55E: ifeq @57A
		// @561: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @564: getstatic java.lang.String game.C_100217_ao.field_106034_g
		// @567: iload #13
		// @569: iload #14
		// @56B: ldc 16777215 (0xffffff)
		// @56D: iconst_m1
		// @56E: invokevirtual game.C_100193_re.func_101744_b(java.lang.String, int, int, int, int)void
		// @571: iload #24
		// @573: ifeq @58F
		// @576: goto @57A
		// @579: athrow
		// @57A: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @57D: getstatic java.lang.String game.C_100021_wn.field_103869_d
		// @580: iload #13
		// @582: iload #14
		// @584: ldc_w 8421504 (0x808080)
		// @587: iconst_m1
		// @588: invokevirtual game.C_100193_re.func_101744_b(java.lang.String, int, int, int, int)void
		// @58B: goto @58F
		// @58E: athrow
		// @58F: iload #15
		// @591: ifeq @5AB
		// @594: getstatic game.C_100037_wb[] game.C_100042_we.field_104136_l
		// @597: iload #12
		// @599: aaload
		// @59A: bipush 120 (0x78)
		// @59C: sipush 277 (0x0115)
		// @59F: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @5A2: iload #24
		// @5A4: ifeq @5BA
		// @5A7: goto @5AB
		// @5AA: athrow
		// @5AB: getstatic game.C_100037_wb game.C_100225_ah.field_106129_m
		// @5AE: bipush 120 (0x78)
		// @5B0: sipush 277 (0x0115)
		// @5B3: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @5B6: goto @5BA
		// @5B9: athrow
		// @5BA: iload #15
		// @5BC: ifne @5D0
		// @5BF: iload #12
		// @5C1: bipush 31 (0x1F)
		// @5C3: getstatic int[] game.C_100275_na.field_103092_i
		// @5C6: invokestatic game.C_100189_ri.func_105742_a(int, int, int[])boolean
		// @5C9: ifne @760
		// @5CC: goto @5D0
		// @5CF: athrow
		// @5D0: getstatic java.lang.String[] game.C_100215_ai.field_106016_b
		// @5D3: iload #12
		// @5D5: aaload
		// @5D6: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @5D9: astore #16
		// @5DB: sipush 330 (0x014A)
		// @5DE: istore #17
		// @5E0: iload #17
		// @5E2: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @5E5: aload #16
		// @5E7: sipush 252 (0x00FC)
		// @5EA: iconst_0
		// @5EB: invokevirtual game.C_100317_lb.func_101734_a(java.lang.String, int, int)int
		// @5EE: iadd
		// @5EF: istore #18
		// @5F1: sipush 382 (0x017E)
		// @5F4: iload #18
		// @5F6: if_icmpge @605
		// @5F9: iinc #17 +238
		// @5FC: iload #24
		// @5FE: ifeq @618
		// @601: goto @605
		// @604: athrow
		// @605: sipush 362 (0x016A)
		// @608: iload #18
		// @60A: if_icmpge @618
		// @60D: goto @611
		// @610: athrow
		// @611: iinc #17 +248
		// @614: goto @618
		// @617: athrow
		// @618: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @61B: aload #16
		// @61D: sipush 276 (0x0114)
		// @620: iload #17
		// @622: sipush 252 (0x00FC)
		// @625: bipush 122 (0x7A)
		// @627: ldc 1021128 (0xf94c8)
		// @629: iconst_m1
		// @62A: iconst_1
		// @62B: iconst_0
		// @62C: iconst_0
		// @62D: invokevirtual game.C_100317_lb.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @630: pop
		// @631: sipush 392 (0x0188)
		// @634: istore #14
		// @636: sipush 276 (0x0114)
		// @639: istore #13
		// @63B: sipush -383 (0xFE81)
		// @63E: iload #18
		// @640: iconst_m1
		// @641: ixor
		// @642: if_icmpgt @649
		// @645: goto @64C
		// @648: athrow
		// @649: iinc #14 +10
		// @64C: wide (iinc) #13 +130
		// @652: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @655: new java.lang.StringBuilder
		// @658: dup
		// @659: invokespecial java.lang.StringBuilder.<init>()void
		// @65C: getstatic java.lang.String game.C_100238_ol.field_101701_I
		// @65F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @662: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @665: bipush 39 (0x27)
		// @667: aaload
		// @668: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @66B: getstatic int[] game.C_100028_ha.field_103950_a
		// @66E: iload #12
		// @670: iaload
		// @671: bipush 100 (0x64)
		// @673: imul
		// @674: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @677: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @67A: bipush 38 (0x26)
		// @67C: aaload
		// @67D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @680: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @683: iconst_0
		// @684: invokestatic game.C_100096_un.func_104560_a(java.lang.String, boolean)java.lang.String
		// @687: sipush 276 (0x0114)
		// @68A: iload #14
		// @68C: ldc 1021128 (0xf94c8)
		// @68E: iconst_m1
		// @68F: invokevirtual game.C_100317_lb.func_101749_c(java.lang.String, int, int, int, int)void
		// @692: getstatic game.C_100037_wb game.C_100052_eb.field_104228_f
		// @695: getfield int game.C_100037_wb.field_102339_s
		// @698: ineg
		// @699: sipush 528 (0x0210)
		// @69C: iadd
		// @69D: istore #19
		// @69F: bipush 10 (0x0A)
		// @6A1: iload #14
		// @6A3: getstatic game.C_100037_wb game.C_100052_eb.field_104228_f
		// @6A6: getfield int game.C_100037_wb.field_102337_u
		// @6A9: isub
		// @6AA: iadd
		// @6AB: istore #20
		// @6AD: bipush -11 (0xF5)
		// @6AF: getstatic int[] game.C_100028_ha.field_103950_a
		// @6B2: iload #12
		// @6B4: iaload
		// @6B5: iconst_m1
		// @6B6: ixor
		// @6B7: if_icmpeq @6F9
		// @6BA: iconst_0
		// @6BB: istore #21
		// @6BD: iload #21
		// @6BF: iconst_m1
		// @6C0: ixor
		// @6C1: getstatic int[] game.C_100028_ha.field_103950_a
		// @6C4: iload #12
		// @6C6: iaload
		// @6C7: iconst_m1
		// @6C8: ixor
		// @6C9: if_icmple @6F4
		// @6CC: getstatic game.C_100037_wb game.C_100052_eb.field_104228_f
		// @6CF: iload #19
		// @6D1: iload #20
		// @6D3: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @6D6: iload #19
		// @6D8: getstatic game.C_100037_wb game.C_100052_eb.field_104228_f
		// @6DB: getfield int game.C_100037_wb.field_102339_s
		// @6DE: iconst_3
		// @6DF: idiv
		// @6E0: isub
		// @6E1: istore #19
		// @6E3: iinc #21 +1
		// @6E6: iload #24
		// @6E8: ifne @75B
		// @6EB: iload #24
		// @6ED: ifeq @6BD
		// @6F0: goto @6F4
		// @6F3: athrow
		// @6F4: iload #24
		// @6F6: ifeq @73D
		// @6F9: iinc #20 +246
		// @6FC: iconst_0
		// @6FD: istore #21
		// @6FF: bipush -6 (0xFA)
		// @701: iload #21
		// @703: iconst_m1
		// @704: ixor
		// @705: if_icmpge @73D
		// @708: getstatic game.C_100037_wb game.C_100052_eb.field_104228_f
		// @70B: iload #19
		// @70D: iload #20
		// @70F: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @712: getstatic game.C_100037_wb game.C_100052_eb.field_104228_f
		// @715: iload #19
		// @717: bipush 20 (0x14)
		// @719: iload #20
		// @71B: iadd
		// @71C: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @71F: iload #19
		// @721: getstatic game.C_100037_wb game.C_100052_eb.field_104228_f
		// @724: getfield int game.C_100037_wb.field_102339_s
		// @727: iconst_3
		// @728: idiv
		// @729: isub
		// @72A: istore #19
		// @72C: iinc #21 +1
		// @72F: iload #24
		// @731: ifne @75B
		// @734: iload #24
		// @736: ifeq @6FF
		// @739: goto @73D
		// @73C: athrow
		// @73D: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @740: getstatic java.lang.String game.C_100275_na.field_103091_h
		// @743: iconst_0
		// @744: invokestatic game.C_100096_un.func_104560_a(java.lang.String, boolean)java.lang.String
		// @747: iload #19
		// @749: getstatic game.C_100037_wb game.C_100052_eb.field_104228_f
		// @74C: getfield int game.C_100037_wb.field_102339_s
		// @74F: iconst_3
		// @750: idiv
		// @751: ineg
		// @752: isub
		// @753: iload #14
		// @755: ldc 1021128 (0xf94c8)
		// @757: iconst_m1
		// @758: invokevirtual game.C_100317_lb.func_101746_a(java.lang.String, int, int, int, int)void
		// @75B: iload #24
		// @75D: ifeq @77F
		// @760: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @763: getstatic java.lang.String game.C_100077_d.field_103318_db
		// @766: sipush 276 (0x0114)
		// @769: sipush 345 (0x0159)
		// @76C: sipush 252 (0x00FC)
		// @76F: bipush 122 (0x7A)
		// @771: ldc 1021128 (0xf94c8)
		// @773: iconst_m1
		// @774: iconst_1
		// @775: iconst_0
		// @776: iconst_0
		// @777: invokevirtual game.C_100193_re.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @77A: pop
		// @77B: goto @77F
		// @77E: athrow
		// @77F: getstatic int[] game.C_100246_pg.field_106402_d
		// @782: ifnonnull @789
		// @785: goto @996
		// @788: athrow
		// @789: getstatic game.C_100037_wb game.C_100148_bh.field_101796_A
		// @78C: astore #13
		// @78E: aload #13
		// @790: invokevirtual game.C_100037_wb.func_102371_f()game.C_100037_wb
		// @793: astore #14
		// @795: bipush 79 (0x4F)
		// @797: istore #6
		// @799: bipush 38 (0x26)
		// @79B: istore #15
		// @79D: iconst_0
		// @79E: istore #16
		// @7A0: iload #16
		// @7A2: bipush 32 (0x20)
		// @7A4: if_icmpge @996
		// @7A7: iload #24
		// @7A9: ifne @9C4
		// @7AC: getstatic int[] game.C_100246_pg.field_106402_d
		// @7AF: arraylength
		// @7B0: iconst_m1
		// @7B1: ixor
		// @7B2: iload #16
		// @7B4: iconst_m1
		// @7B5: ixor
		// @7B6: if_icmpge @98E
		// @7B9: goto @7BD
		// @7BC: athrow
		// @7BD: iconst_0
		// @7BE: getstatic int[] game.C_100246_pg.field_106402_d
		// @7C1: iload #16
		// @7C3: iaload
		// @7C4: if_icmplt @7CF
		// @7C7: goto @7CB
		// @7CA: athrow
		// @7CB: goto @98E
		// @7CE: athrow
		// @7CF: iload #15
		// @7D1: iconst_m1
		// @7D2: ixor
		// @7D3: sipush -321 (0xFEBF)
		// @7D6: if_icmple @7EF
		// @7D9: aload #14
		// @7DB: iconst_m1
		// @7DC: iload #15
		// @7DE: iadd
		// @7DF: iconst_m1
		// @7E0: iload #6
		// @7E2: iadd
		// @7E3: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @7E6: iload #24
		// @7E8: ifeq @7FE
		// @7EB: goto @7EF
		// @7EE: athrow
		// @7EF: aload #13
		// @7F1: iload #15
		// @7F3: iconst_m1
		// @7F4: iload #6
		// @7F6: iadd
		// @7F7: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @7FA: goto @7FE
		// @7FD: athrow
		// @7FE: getstatic game.C_100037_wb[] game.C_100004_gb.field_103577_h
		// @801: iload #16
		// @803: aaload
		// @804: iload #15
		// @806: iconst_m1
		// @807: iload #6
		// @809: iadd
		// @80A: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @80D: getstatic int game.C_100015_wh.field_103781_g
		// @810: iload #15
		// @812: if_icmplt @850
		// @815: getstatic int game.C_100015_wh.field_103781_g
		// @818: iconst_m1
		// @819: ixor
		// @81A: iload #15
		// @81C: bipush 28 (0x1C)
		// @81E: iadd
		// @81F: iconst_m1
		// @820: ixor
		// @821: if_icmple @850
		// @824: goto @828
		// @827: athrow
		// @828: iload #6
		// @82A: iconst_m1
		// @82B: ixor
		// @82C: getstatic int game.C_100338_jc.field_105370_l
		// @82F: iconst_m1
		// @830: ixor
		// @831: if_icmplt @850
		// @834: goto @838
		// @837: athrow
		// @838: getstatic int game.C_100338_jc.field_105370_l
		// @83B: iconst_m1
		// @83C: ixor
		// @83D: iload #6
		// @83F: bipush 18 (0x12)
		// @841: iadd
		// @842: iconst_m1
		// @843: ixor
		// @844: if_icmple @850
		// @847: goto @84B
		// @84A: athrow
		// @84B: iconst_1
		// @84C: goto @851
		// @84F: athrow
		// @850: iconst_0
		// @851: istore #17
		// @853: getstatic int[] game.C_100246_pg.field_106402_d
		// @856: iload #16
		// @858: iaload
		// @859: istore #18
		// @85B: iconst_m1
		// @85C: iload #18
		// @85E: iconst_m1
		// @85F: ixor
		// @860: if_icmple @8E0
		// @863: iload #18
		// @865: iconst_m1
		// @866: ixor
		// @867: sipush -251 (0xFF05)
		// @86A: if_icmpgt @878
		// @86D: goto @871
		// @870: athrow
		// @871: getstatic java.lang.String game.C_100290_jm.field_106857_g
		// @874: goto @87D
		// @877: athrow
		// @878: iload #18
		// @87A: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @87D: astore #19
		// @87F: iload #18
		// @881: sipush 255 (0x00FF)
		// @884: invokestatic java.lang.Math.min(int, int)int
		// @887: bipush 6 (0x06)
		// @889: idiv
		// @88A: ldc_w 262657 (0x40201)
		// @88D: imul
		// @88E: sipush -24736 (0x9F60)
		// @891: isub
		// @892: istore #20
		// @894: sipush 250 (0x00FA)
		// @897: iload #18
		// @899: if_icmple @8A0
		// @89C: goto @8A4
		// @89F: athrow
		// @8A0: ldc 16777215 (0xffffff)
		// @8A2: istore #20
		// @8A4: sipush -321 (0xFEBF)
		// @8A7: iload #15
		// @8A9: iconst_m1
		// @8AA: ixor
		// @8AB: if_icmplt @8CA
		// @8AE: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @8B1: aload #19
		// @8B3: sipush 553 (0x0229)
		// @8B6: iload #6
		// @8B8: bipush 12 (0x0C)
		// @8BA: iadd
		// @8BB: iload #20
		// @8BD: iconst_m1
		// @8BE: invokevirtual game.C_100317_lb.func_101749_c(java.lang.String, int, int, int, int)void
		// @8C1: iload #24
		// @8C3: ifeq @8E0
		// @8C6: goto @8CA
		// @8C9: athrow
		// @8CA: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @8CD: aload #19
		// @8CF: bipush 88 (0x58)
		// @8D1: iload #6
		// @8D3: bipush -12 (0xF4)
		// @8D5: isub
		// @8D6: iload #20
		// @8D8: iconst_m1
		// @8D9: invokevirtual game.C_100317_lb.func_101746_a(java.lang.String, int, int, int, int)void
		// @8DC: goto @8E0
		// @8DF: athrow
		// @8E0: iload #17
		// @8E2: ifne @8E9
		// @8E5: goto @973
		// @8E8: athrow
		// @8E9: getstatic java.lang.String[] game.C_100278_nd.field_101204_z
		// @8EC: iload #16
		// @8EE: iconst_2
		// @8EF: imul
		// @8F0: aaload
		// @8F1: astore #19
		// @8F3: bipush 8 (0x08)
		// @8F5: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @8F8: aload #19
		// @8FA: invokevirtual game.C_100317_lb.func_101739_b(java.lang.String)int
		// @8FD: iadd
		// @8FE: istore #20
		// @900: iload #15
		// @902: bipush 8 (0x08)
		// @904: iadd
		// @905: iload #20
		// @907: iconst_2
		// @908: idiv
		// @909: ineg
		// @90A: iadd
		// @90B: istore #21
		// @90D: sipush -321 (0xFEBF)
		// @910: iload #15
		// @912: iconst_m1
		// @913: ixor
		// @914: if_icmpge @925
		// @917: iload #21
		// @919: bipush 10 (0x0A)
		// @91B: invokestatic java.lang.Math.max(int, int)int
		// @91E: istore #21
		// @920: iload #24
		// @922: ifeq @933
		// @925: iload #21
		// @927: sipush 630 (0x0276)
		// @92A: iload #20
		// @92C: ineg
		// @92D: iadd
		// @92E: invokestatic java.lang.Math.min(int, int)int
		// @931: istore #21
		// @933: bipush 15 (0x0F)
		// @935: istore #22
		// @937: iload #22
		// @939: ineg
		// @93A: iload #6
		// @93C: iadd
		// @93D: istore #23
		// @93F: iload #21
		// @941: iload #23
		// @943: iload #20
		// @945: iload #22
		// @947: ldc 16777215 (0xffffff)
		// @949: sipush 192 (0x00C0)
		// @94C: invokestatic game.C_100196_rb.func_105810_f(int, int, int, int, int, int)void
		// @94F: iload #21
		// @951: iload #23
		// @953: iload #20
		// @955: iload #22
		// @957: iconst_0
		// @958: sipush 192 (0x00C0)
		// @95B: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @95E: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @961: aload #19
		// @963: iload #21
		// @965: bipush -4 (0xFC)
		// @967: isub
		// @968: iload #23
		// @96A: bipush -11 (0xF5)
		// @96C: isub
		// @96D: ldc 16777215 (0xffffff)
		// @96F: iconst_m1
		// @970: invokevirtual game.C_100317_lb.func_101749_c(java.lang.String, int, int, int, int)void
		// @973: sipush -321 (0xFEBF)
		// @976: iload #15
		// @978: iconst_m1
		// @979: ixor
		// @97A: if_icmplt @989
		// @97D: iinc #6 +21
		// @980: bipush 38 (0x26)
		// @982: istore #15
		// @984: iload #24
		// @986: ifeq @98E
		// @989: sipush 575 (0x023F)
		// @98C: istore #15
		// @98E: iinc #16 +1
		// @991: iload #24
		// @993: ifeq @7A0
		// @996: goto @9C4
		// @999: astore_3
		// @99A: aload_3
		// @99B: new java.lang.StringBuilder
		// @99E: dup
		// @99F: invokespecial java.lang.StringBuilder.<init>()void
		// @9A2: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @9A5: bipush 40 (0x28)
		// @9A7: aaload
		// @9A8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9AB: iload_1
		// @9AC: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @9AF: bipush 44 (0x2C)
		// @9B1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9B4: iload_2
		// @9B5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9B8: bipush 41 (0x29)
		// @9BA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9BD: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9C0: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9C3: athrow
		// @9C4: return
	}
	
	private final int func_104008_n(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #4
		// @005: bipush 7 (0x07)
		// @007: aload_0
		// @008: getfield int game.C_100034_gi.field_104030_e
		// @00B: if_icmpne @010
		// @00E: iconst_m1
		// @00F: ireturn
		// @010: aload_0
		// @011: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @014: getfield int game.C_100333_ij.field_107347_b
		// @017: istore_2
		// @018: aload_0
		// @019: bipush -124 (0x84)
		// @01B: iload_2
		// @01C: invokespecial game.C_100034_gi.func_104011_b(byte, int)int
		// @01F: istore_3
		// @020: iload_2
		// @021: iflt @04B
		// @024: getstatic int[][] game.C_100012_fh.field_100515_K
		// @027: aload_0
		// @028: getfield int game.C_100034_gi.field_104030_e
		// @02B: aaload
		// @02C: arraylength
		// @02D: iconst_m1
		// @02E: ixor
		// @02F: iload_2
		// @030: iconst_m1
		// @031: ixor
		// @032: if_icmpge @04B
		// @035: goto @039
		// @038: athrow
		// @039: iconst_m1
		// @03A: getstatic int[][] game.C_100012_fh.field_100515_K
		// @03D: aload_0
		// @03E: getfield int game.C_100034_gi.field_104030_e
		// @041: aaload
		// @042: iload_2
		// @043: iaload
		// @044: if_icmpne @0A5
		// @047: goto @04B
		// @04A: athrow
		// @04B: iconst_m1
		// @04C: getstatic int[][] game.C_100012_fh.field_100515_K
		// @04F: aload_0
		// @050: getfield int game.C_100034_gi.field_104030_e
		// @053: aaload
		// @054: arraylength
		// @055: iadd
		// @056: istore_2
		// @057: iload_2
		// @058: iconst_m1
		// @059: ixor
		// @05A: iconst_m1
		// @05B: if_icmpgt @082
		// @05E: getstatic int[][] game.C_100012_fh.field_100515_K
		// @061: aload_0
		// @062: getfield int game.C_100034_gi.field_104030_e
		// @065: aaload
		// @066: iload_2
		// @067: iaload
		// @068: iconst_m1
		// @069: ixor
		// @06A: iload #4
		// @06C: ifne @083
		// @06F: ifne @082
		// @072: goto @076
		// @075: athrow
		// @076: iinc #2 +255
		// @079: iload #4
		// @07B: ifeq @057
		// @07E: goto @082
		// @081: athrow
		// @082: iconst_m1
		// @083: iload_2
		// @084: iconst_m1
		// @085: ixor
		// @086: if_icmplt @0A3
		// @089: bipush 34 (0x22)
		// @08B: getstatic int[][] game.C_100012_fh.field_100515_K
		// @08E: aload_0
		// @08F: getfield int game.C_100034_gi.field_104030_e
		// @092: aaload
		// @093: iload_2
		// @094: iaload
		// @095: if_icmpeq @0A0
		// @098: goto @09C
		// @09B: athrow
		// @09C: goto @0A3
		// @09F: athrow
		// @0A0: iinc #2 +255
		// @0A3: iload_2
		// @0A4: ireturn
		// @0A5: bipush -20 (0xEC)
		// @0A7: aload_0
		// @0A8: getfield int game.C_100034_gi.field_104030_e
		// @0AB: iconst_m1
		// @0AC: ixor
		// @0AD: if_icmpeq @0B4
		// @0B0: goto @0D6
		// @0B3: athrow
		// @0B4: iload_3
		// @0B5: iconst_m1
		// @0B6: ixor
		// @0B7: iconst_m1
		// @0B8: if_icmple @0BF
		// @0BB: goto @0D6
		// @0BE: athrow
		// @0BF: getstatic int[][] game.C_100012_fh.field_100515_K
		// @0C2: aload_0
		// @0C3: getfield int game.C_100034_gi.field_104030_e
		// @0C6: aaload
		// @0C7: getstatic int[] game.C_100333_ij.field_107345_d
		// @0CA: if_acmpeq @0D3
		// @0CD: bipush 19 (0x13)
		// @0CF: goto @0D5
		// @0D2: athrow
		// @0D3: bipush 29 (0x1D)
		// @0D5: ireturn
		// @0D6: bipush 20 (0x14)
		// @0D8: aload_0
		// @0D9: getfield int game.C_100034_gi.field_104030_e
		// @0DC: if_icmpeq @0E3
		// @0DF: goto @10F
		// @0E2: athrow
		// @0E3: iconst_0
		// @0E4: iload_3
		// @0E5: if_icmpgt @0EA
		// @0E8: iconst_2
		// @0E9: ireturn
		// @0EA: iload_2
		// @0EB: iconst_1
		// @0EC: if_icmpne @10F
		// @0EF: aload_0
		// @0F0: iconst_0
		// @0F1: iload_1
		// @0F2: bipush -16 (0xF0)
		// @0F4: ixor
		// @0F5: invokespecial game.C_100034_gi.func_103977_a(int, int)boolean
		// @0F8: ifeq @103
		// @0FB: goto @0FF
		// @0FE: athrow
		// @0FF: goto @10F
		// @102: athrow
		// @103: iconst_m1
		// @104: getstatic int[][] game.C_100012_fh.field_100515_K
		// @107: aload_0
		// @108: getfield int game.C_100034_gi.field_104030_e
		// @10B: aaload
		// @10C: arraylength
		// @10D: iadd
		// @10E: ireturn
		// @10F: iload_1
		// @110: bipush 12 (0x0C)
		// @112: if_icmpeq @11F
		// @115: aload_0
		// @116: bipush 105 (0x69)
		// @118: invokespecial game.C_100034_gi.func_104012_d(byte)void
		// @11B: goto @11F
		// @11E: athrow
		// @11F: bipush -6 (0xFA)
		// @121: aload_0
		// @122: getfield int game.C_100034_gi.field_104030_e
		// @125: iconst_m1
		// @126: ixor
		// @127: if_icmpne @161
		// @12A: iload_3
		// @12B: iload_2
		// @12C: if_icmplt @137
		// @12F: goto @133
		// @132: athrow
		// @133: goto @161
		// @136: athrow
		// @137: iconst_m1
		// @138: iload_3
		// @139: iconst_m1
		// @13A: ixor
		// @13B: if_icmpeq @142
		// @13E: goto @144
		// @141: athrow
		// @142: iconst_0
		// @143: ireturn
		// @144: iconst_1
		// @145: iload_3
		// @146: if_icmpeq @155
		// @149: bipush -3 (0xFD)
		// @14B: iload_3
		// @14C: iconst_m1
		// @14D: ixor
		// @14E: if_icmpne @157
		// @151: goto @155
		// @154: athrow
		// @155: iconst_1
		// @156: ireturn
		// @157: iload_3
		// @158: iconst_m1
		// @159: ixor
		// @15A: bipush -4 (0xFC)
		// @15C: if_icmpne @161
		// @15F: iconst_2
		// @160: ireturn
		// @161: bipush 6 (0x06)
		// @163: aload_0
		// @164: getfield int game.C_100034_gi.field_104030_e
		// @167: if_icmpne @1A7
		// @16A: iload_2
		// @16B: iconst_m1
		// @16C: ixor
		// @16D: iload_3
		// @16E: iconst_m1
		// @16F: ixor
		// @170: if_icmpge @1A7
		// @173: goto @177
		// @176: athrow
		// @177: iload_3
		// @178: iconst_m1
		// @179: ixor
		// @17A: iconst_m1
		// @17B: if_icmpeq @18E
		// @17E: goto @182
		// @181: athrow
		// @182: iload_3
		// @183: iconst_m1
		// @184: ixor
		// @185: bipush -2 (0xFE)
		// @187: if_icmpne @190
		// @18A: goto @18E
		// @18D: athrow
		// @18E: iconst_0
		// @18F: ireturn
		// @190: iload_3
		// @191: iconst_m1
		// @192: ixor
		// @193: bipush -3 (0xFD)
		// @195: if_icmpeq @1A5
		// @198: iload_3
		// @199: iconst_3
		// @19A: if_icmpeq @1A5
		// @19D: goto @1A1
		// @1A0: athrow
		// @1A1: goto @1A7
		// @1A4: athrow
		// @1A5: iconst_1
		// @1A6: ireturn
		// @1A7: iconst_0
		// @1A8: aload_0
		// @1A9: getfield int game.C_100034_gi.field_104030_e
		// @1AC: if_icmpeq @1B3
		// @1AF: goto @1FA
		// @1B2: athrow
		// @1B3: bipush 34 (0x22)
		// @1B5: getstatic int[][] game.C_100012_fh.field_100515_K
		// @1B8: aload_0
		// @1B9: getfield int game.C_100034_gi.field_104030_e
		// @1BC: aaload
		// @1BD: iload_2
		// @1BE: iaload
		// @1BF: if_icmpne @1C6
		// @1C2: goto @1F8
		// @1C5: athrow
		// @1C6: iinc #2 +255
		// @1C9: iconst_0
		// @1CA: iload_2
		// @1CB: if_icmple @1D2
		// @1CE: goto @1D4
		// @1D1: athrow
		// @1D2: iload_2
		// @1D3: ireturn
		// @1D4: iload_2
		// @1D5: getstatic int[][] game.C_100012_fh.field_100515_K
		// @1D8: aload_0
		// @1D9: getfield int game.C_100034_gi.field_104030_e
		// @1DC: aaload
		// @1DD: arraylength
		// @1DE: iadd
		// @1DF: istore_2
		// @1E0: getstatic int[][] game.C_100012_fh.field_100515_K
		// @1E3: aload_0
		// @1E4: getfield int game.C_100034_gi.field_104030_e
		// @1E7: aaload
		// @1E8: iload_2
		// @1E9: iaload
		// @1EA: iconst_m1
		// @1EB: ixor
		// @1EC: bipush -35 (0xDD)
		// @1EE: if_icmpne @1F8
		// @1F1: iinc #2 +255
		// @1F4: goto @1F8
		// @1F7: athrow
		// @1F8: iload_2
		// @1F9: ireturn
		// @1FA: bipush 17 (0x11)
		// @1FC: aload_0
		// @1FD: getfield int game.C_100034_gi.field_104030_e
		// @200: if_icmpne @23E
		// @203: iload_2
		// @204: iconst_m1
		// @205: ixor
		// @206: iconst_m1
		// @207: if_icmpne @21A
		// @20A: goto @20E
		// @20D: athrow
		// @20E: getstatic int[][] game.C_100012_fh.field_100515_K
		// @211: aload_0
		// @212: getfield int game.C_100034_gi.field_104030_e
		// @215: aaload
		// @216: arraylength
		// @217: iconst_1
		// @218: isub
		// @219: ireturn
		// @21A: getstatic int[][] game.C_100012_fh.field_100515_K
		// @21D: aload_0
		// @21E: getfield int game.C_100034_gi.field_104030_e
		// @221: aaload
		// @222: arraylength
		// @223: iconst_4
		// @224: isub
		// @225: iconst_m1
		// @226: ixor
		// @227: iload_2
		// @228: iconst_m1
		// @229: ixor
		// @22A: if_icmpge @231
		// @22D: iconst_m1
		// @22E: iload_2
		// @22F: iadd
		// @230: ireturn
		// @231: getstatic int[][] game.C_100012_fh.field_100515_K
		// @234: aload_0
		// @235: getfield int game.C_100034_gi.field_104030_e
		// @238: aaload
		// @239: arraylength
		// @23A: bipush -5 (0xFB)
		// @23C: iadd
		// @23D: ireturn
		// @23E: iconst_m1
		// @23F: ireturn
		// @240: astore_2
		// @241: aload_2
		// @242: new java.lang.StringBuilder
		// @245: dup
		// @246: invokespecial java.lang.StringBuilder.<init>()void
		// @249: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @24C: bipush 86 (0x56)
		// @24E: aaload
		// @24F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @252: iload_1
		// @253: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @256: bipush 41 (0x29)
		// @258: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @25B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @25E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @261: athrow
	}
	
	static final String func_103992_a(Throwable arg0, byte arg1) throws IOException
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #13
		// @005: aload_0
		// @006: instanceof game.C_100170_cm
		// @009: ifeq @036
		// @00C: aload_0
		// @00D: checkcast game.C_100170_cm
		// @010: astore_3
		// @011: new java.lang.StringBuilder
		// @014: dup
		// @015: invokespecial java.lang.StringBuilder.<init>()void
		// @018: aload_3
		// @019: getfield java.lang.String game.C_100170_cm.field_105542_a
		// @01C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @01F: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @022: bipush 105 (0x69)
		// @024: aaload
		// @025: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @028: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @02B: astore_2
		// @02C: aload_3
		// @02D: getfield java.lang.Throwable game.C_100170_cm.field_105548_k
		// @030: astore_0
		// @031: iload #13
		// @033: ifeq @03A
		// @036: ldc_w ""
		// @039: astore_2
		// @03A: new java.io.StringWriter
		// @03D: dup
		// @03E: invokespecial java.io.StringWriter.<init>()void
		// @041: astore_3
		// @042: new java.io.PrintWriter
		// @045: dup
		// @046: aload_3
		// @047: invokespecial java.io.PrintWriter.<init>(java.io.Writer)void
		// @04A: astore #4
		// @04C: aload_0
		// @04D: aload #4
		// @04F: invokevirtual java.lang.Throwable.printStackTrace(java.io.PrintWriter)void
		// @052: aload #4
		// @054: invokevirtual java.io.PrintWriter.close()void
		// @057: aload_3
		// @058: invokevirtual java.io.StringWriter.toString()java.lang.String
		// @05B: astore #5
		// @05D: new java.io.BufferedReader
		// @060: dup
		// @061: new java.io.StringReader
		// @064: dup
		// @065: aload #5
		// @067: invokespecial java.io.StringReader.<init>(java.lang.String)void
		// @06A: invokespecial java.io.BufferedReader.<init>(java.io.Reader)void
		// @06D: astore #6
		// @06F: aload #6
		// @071: invokevirtual java.io.BufferedReader.readLine()java.lang.String
		// @074: astore #7
		// @076: aload #6
		// @078: invokevirtual java.io.BufferedReader.readLine()java.lang.String
		// @07B: astore #8
		// @07D: aconst_null
		// @07E: aload #8
		// @080: if_acmpne @088
		// @083: iload #13
		// @085: ifeq @151
		// @088: aload #8
		// @08A: bipush 40 (0x28)
		// @08C: invokevirtual java.lang.String.indexOf(int)int
		// @08F: istore #9
		// @091: aload #8
		// @093: bipush 41 (0x29)
		// @095: iconst_1
		// @096: iload #9
		// @098: iadd
		// @099: invokevirtual java.lang.String.indexOf(int, int)int
		// @09C: istore #10
		// @09E: iload #9
		// @0A0: iconst_m1
		// @0A1: if_icmpeq @0B3
		// @0A4: aload #8
		// @0A6: iconst_0
		// @0A7: iload #9
		// @0A9: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @0AC: astore #11
		// @0AE: iload #13
		// @0B0: ifeq @0B7
		// @0B3: aload #8
		// @0B5: astore #11
		// @0B7: aload #11
		// @0B9: invokevirtual java.lang.String.trim()java.lang.String
		// @0BC: astore #11
		// @0BE: aload #11
		// @0C0: aload #11
		// @0C2: bipush 32 (0x20)
		// @0C4: invokevirtual java.lang.String.lastIndexOf(int)int
		// @0C7: iconst_m1
		// @0C8: isub
		// @0C9: invokevirtual java.lang.String.substring(int)java.lang.String
		// @0CC: astore #11
		// @0CE: aload #11
		// @0D0: aload #11
		// @0D2: bipush 9 (0x09)
		// @0D4: invokevirtual java.lang.String.lastIndexOf(int)int
		// @0D7: iconst_1
		// @0D8: iadd
		// @0D9: invokevirtual java.lang.String.substring(int)java.lang.String
		// @0DC: astore #11
		// @0DE: new java.lang.StringBuilder
		// @0E1: dup
		// @0E2: invokespecial java.lang.StringBuilder.<init>()void
		// @0E5: aload_2
		// @0E6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0E9: aload #11
		// @0EB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0EE: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0F1: astore_2
		// @0F2: iload #9
		// @0F4: iconst_m1
		// @0F5: ixor
		// @0F6: ifeq @138
		// @0F9: iload #10
		// @0FB: iconst_m1
		// @0FC: if_icmpne @107
		// @0FF: goto @103
		// @102: athrow
		// @103: goto @138
		// @106: athrow
		// @107: aload #8
		// @109: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @10C: bipush 107 (0x6B)
		// @10E: aaload
		// @10F: iload #9
		// @111: invokevirtual java.lang.String.indexOf(java.lang.String, int)int
		// @114: istore #12
		// @116: iload #12
		// @118: iflt @138
		// @11B: new java.lang.StringBuilder
		// @11E: dup
		// @11F: invokespecial java.lang.StringBuilder.<init>()void
		// @122: aload_2
		// @123: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @126: aload #8
		// @128: iconst_5
		// @129: iload #12
		// @12B: iadd
		// @12C: iload #10
		// @12E: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @131: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @134: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @137: astore_2
		// @138: new java.lang.StringBuilder
		// @13B: dup
		// @13C: invokespecial java.lang.StringBuilder.<init>()void
		// @13F: aload_2
		// @140: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @143: bipush 32 (0x20)
		// @145: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @148: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @14B: astore_2
		// @14C: iload #13
		// @14E: ifeq @076
		// @151: bipush -102 (0x9A)
		// @153: iload_1
		// @154: bipush -83 (0xAD)
		// @156: isub
		// @157: bipush 33 (0x21)
		// @159: idiv
		// @15A: irem
		// @15B: istore #8
		// @15D: new java.lang.StringBuilder
		// @160: dup
		// @161: invokespecial java.lang.StringBuilder.<init>()void
		// @164: aload_2
		// @165: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @168: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @16B: bipush 106 (0x6A)
		// @16D: aaload
		// @16E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @171: aload #7
		// @173: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @176: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @179: astore_2
		// @17A: aload_2
		// @17B: areturn
		// @17C: astore_2
		// @17D: aload_2
		// @17E: athrow
	}
	
	private final void func_104005_k(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #13
		// @005: getstatic int game.C_100094_j.field_104549_b
		// @008: istore_2
		// @009: iconst_m1
		// @00A: putstatic int game.C_100094_j.field_104549_b
		// @00D: iconst_0
		// @00E: bipush 50 (0x32)
		// @010: sipush 640 (0x0280)
		// @013: sipush 430 (0x01AE)
		// @016: iconst_0
		// @017: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @01A: bipush 100 (0x64)
		// @01C: istore_3
		// @01D: bipush 55 (0x37)
		// @01F: istore #4
		// @021: sipush 200 (0x00C8)
		// @024: istore #5
		// @026: bipush 30 (0x1E)
		// @028: istore #6
		// @02A: getstatic game.C_100317_lb game.C_100318_hj.field_107197_e
		// @02D: astore #7
		// @02F: ldc_w ""
		// @032: astore #8
		// @034: iconst_0
		// @035: istore #9
		// @037: bipush -4 (0xFC)
		// @039: iload #9
		// @03B: iconst_m1
		// @03C: ixor
		// @03D: if_icmpge @084
		// @040: getstatic int[] game.C_100017_wj.field_103821_j
		// @043: iload #9
		// @045: iaload
		// @046: getstatic int[] game.C_100257_ln.field_106481_d
		// @049: bipush -110 (0x92)
		// @04B: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @04E: iload #13
		// @050: ifne @085
		// @053: ifeq @07C
		// @056: goto @05A
		// @059: athrow
		// @05A: new java.lang.StringBuilder
		// @05D: dup
		// @05E: invokespecial java.lang.StringBuilder.<init>()void
		// @061: aload #8
		// @063: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @066: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @069: iconst_5
		// @06A: aaload
		// @06B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @06E: getstatic java.lang.String[] game.C_100179_ch.field_100813_l
		// @071: iload #9
		// @073: aaload
		// @074: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @077: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @07A: astore #8
		// @07C: iinc #9 +1
		// @07F: iload #13
		// @081: ifeq @037
		// @084: iconst_m1
		// @085: aload #8
		// @087: invokevirtual java.lang.String.length()int
		// @08A: iconst_m1
		// @08B: ixor
		// @08C: if_icmpne @09C
		// @08F: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @092: bipush 33 (0x21)
		// @094: aaload
		// @095: astore #8
		// @097: iload #13
		// @099: ifeq @0A4
		// @09C: aload #8
		// @09E: iconst_2
		// @09F: invokevirtual java.lang.String.substring(int)java.lang.String
		// @0A2: astore #8
		// @0A4: new java.lang.StringBuilder
		// @0A7: dup
		// @0A8: invokespecial java.lang.StringBuilder.<init>()void
		// @0AB: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @0AE: bipush 7 (0x07)
		// @0B0: aaload
		// @0B1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0B4: aload #8
		// @0B6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0B9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0BC: astore #8
		// @0BE: iload #4
		// @0C0: aload #7
		// @0C2: getfield int game.C_100112_r.field_101772_Q
		// @0C5: iadd
		// @0C6: istore #4
		// @0C8: aload #7
		// @0CA: aload #8
		// @0CC: sipush 320 (0x0140)
		// @0CF: iload #4
		// @0D1: ldc 16777215 (0xffffff)
		// @0D3: iconst_m1
		// @0D4: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @0D7: iinc #4 +5
		// @0DA: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @0DD: bipush 15 (0x0F)
		// @0DF: aaload
		// @0E0: iload #4
		// @0E2: iload_3
		// @0E3: iload #6
		// @0E5: iload #5
		// @0E7: bipush 8 (0x08)
		// @0E9: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @0EC: ifne @0F3
		// @0EF: goto @0F7
		// @0F2: athrow
		// @0F3: iconst_0
		// @0F4: putstatic int game.C_100094_j.field_104549_b
		// @0F7: iload_3
		// @0F8: iload #5
		// @0FA: bipush -20 (0xEC)
		// @0FC: isub
		// @0FD: iadd
		// @0FE: istore_3
		// @0FF: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @102: bipush 17 (0x11)
		// @104: aaload
		// @105: iload #4
		// @107: iload_3
		// @108: iload #6
		// @10A: iload #5
		// @10C: bipush 8 (0x08)
		// @10E: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @111: ifeq @11C
		// @114: iconst_1
		// @115: putstatic int game.C_100094_j.field_104549_b
		// @118: goto @11C
		// @11B: athrow
		// @11C: iload_3
		// @11D: bipush 20 (0x14)
		// @11F: iload #5
		// @121: iadd
		// @122: isub
		// @123: istore_3
		// @124: ldc_w ""
		// @127: astore #8
		// @129: iload #4
		// @12B: iload #6
		// @12D: iconst_5
		// @12E: iadd
		// @12F: iadd
		// @130: istore #4
		// @132: iconst_3
		// @133: istore #9
		// @135: iload #9
		// @137: iconst_m1
		// @138: ixor
		// @139: bipush -7 (0xF9)
		// @13B: if_icmple @185
		// @13E: getstatic int[] game.C_100017_wj.field_103821_j
		// @141: iload #9
		// @143: iaload
		// @144: getstatic int[] game.C_100257_ln.field_106481_d
		// @147: bipush -104 (0x98)
		// @149: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @14C: iload #13
		// @14E: ifne @18C
		// @151: ifne @15B
		// @154: goto @158
		// @157: athrow
		// @158: goto @17D
		// @15B: new java.lang.StringBuilder
		// @15E: dup
		// @15F: invokespecial java.lang.StringBuilder.<init>()void
		// @162: aload #8
		// @164: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @167: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @16A: iconst_5
		// @16B: aaload
		// @16C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16F: getstatic java.lang.String[] game.C_100179_ch.field_100813_l
		// @172: iload #9
		// @174: aaload
		// @175: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @178: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @17B: astore #8
		// @17D: iinc #9 +1
		// @180: iload #13
		// @182: ifeq @135
		// @185: aload #8
		// @187: invokevirtual java.lang.String.length()int
		// @18A: iconst_m1
		// @18B: ixor
		// @18C: iconst_m1
		// @18D: if_icmpne @19D
		// @190: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @193: bipush 33 (0x21)
		// @195: aaload
		// @196: astore #8
		// @198: iload #13
		// @19A: ifeq @1A5
		// @19D: aload #8
		// @19F: iconst_2
		// @1A0: invokevirtual java.lang.String.substring(int)java.lang.String
		// @1A3: astore #8
		// @1A5: new java.lang.StringBuilder
		// @1A8: dup
		// @1A9: invokespecial java.lang.StringBuilder.<init>()void
		// @1AC: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @1AF: bipush 7 (0x07)
		// @1B1: aaload
		// @1B2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1B5: aload #8
		// @1B7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1BA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1BD: astore #8
		// @1BF: iload #4
		// @1C1: aload #7
		// @1C3: getfield int game.C_100112_r.field_101772_Q
		// @1C6: iadd
		// @1C7: istore #4
		// @1C9: aload #7
		// @1CB: aload #8
		// @1CD: sipush 320 (0x0140)
		// @1D0: iload #4
		// @1D2: ldc 16777215 (0xffffff)
		// @1D4: iconst_m1
		// @1D5: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @1D8: iinc #4 +5
		// @1DB: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @1DE: bipush 11 (0x0B)
		// @1E0: aaload
		// @1E1: iload #4
		// @1E3: iload_3
		// @1E4: iload #6
		// @1E6: iload #5
		// @1E8: bipush 8 (0x08)
		// @1EA: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @1ED: ifeq @1F8
		// @1F0: iconst_2
		// @1F1: putstatic int game.C_100094_j.field_104549_b
		// @1F4: goto @1F8
		// @1F7: athrow
		// @1F8: iload_3
		// @1F9: bipush 20 (0x14)
		// @1FB: iload #5
		// @1FD: iadd
		// @1FE: iadd
		// @1FF: istore_3
		// @200: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @203: bipush 21 (0x15)
		// @205: aaload
		// @206: iload #4
		// @208: iload_3
		// @209: iload #6
		// @20B: iload #5
		// @20D: bipush 8 (0x08)
		// @20F: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @212: ifne @219
		// @215: goto @21D
		// @218: athrow
		// @219: iconst_3
		// @21A: putstatic int game.C_100094_j.field_104549_b
		// @21D: ldc_w ""
		// @220: astore #8
		// @222: iload #4
		// @224: iload #6
		// @226: iconst_5
		// @227: iadd
		// @228: iadd
		// @229: istore #4
		// @22B: iload_3
		// @22C: bipush 20 (0x14)
		// @22E: iload #5
		// @230: iadd
		// @231: isub
		// @232: istore_3
		// @233: bipush 6 (0x06)
		// @235: istore #9
		// @237: bipush -13 (0xF3)
		// @239: iload #9
		// @23B: iconst_m1
		// @23C: ixor
		// @23D: if_icmpge @284
		// @240: getstatic int[] game.C_100017_wj.field_103821_j
		// @243: iload #9
		// @245: iaload
		// @246: getstatic int[] game.C_100257_ln.field_106481_d
		// @249: bipush -126 (0x82)
		// @24B: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @24E: iload #13
		// @250: ifne @285
		// @253: ifeq @27C
		// @256: goto @25A
		// @259: athrow
		// @25A: new java.lang.StringBuilder
		// @25D: dup
		// @25E: invokespecial java.lang.StringBuilder.<init>()void
		// @261: aload #8
		// @263: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @266: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @269: iconst_5
		// @26A: aaload
		// @26B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @26E: getstatic java.lang.String[] game.C_100179_ch.field_100813_l
		// @271: iload #9
		// @273: aaload
		// @274: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @277: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @27A: astore #8
		// @27C: iinc #9 +1
		// @27F: iload #13
		// @281: ifeq @237
		// @284: iconst_0
		// @285: aload #8
		// @287: invokevirtual java.lang.String.length()int
		// @28A: if_icmpne @29A
		// @28D: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @290: bipush 33 (0x21)
		// @292: aaload
		// @293: astore #8
		// @295: iload #13
		// @297: ifeq @2A2
		// @29A: aload #8
		// @29C: iconst_2
		// @29D: invokevirtual java.lang.String.substring(int)java.lang.String
		// @2A0: astore #8
		// @2A2: iload #4
		// @2A4: aload #7
		// @2A6: getfield int game.C_100112_r.field_101772_Q
		// @2A9: iadd
		// @2AA: istore #4
		// @2AC: new java.lang.StringBuilder
		// @2AF: dup
		// @2B0: invokespecial java.lang.StringBuilder.<init>()void
		// @2B3: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @2B6: bipush 7 (0x07)
		// @2B8: aaload
		// @2B9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2BC: aload #8
		// @2BE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C1: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2C4: astore #8
		// @2C6: aload #7
		// @2C8: aload #8
		// @2CA: sipush 320 (0x0140)
		// @2CD: iload #4
		// @2CF: ldc 16777215 (0xffffff)
		// @2D1: iconst_m1
		// @2D2: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @2D5: iinc #4 +5
		// @2D8: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @2DB: bipush 30 (0x1E)
		// @2DD: aaload
		// @2DE: iload #4
		// @2E0: iload_3
		// @2E1: iload #6
		// @2E3: iload #5
		// @2E5: bipush 8 (0x08)
		// @2E7: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @2EA: ifeq @2F5
		// @2ED: iconst_4
		// @2EE: putstatic int game.C_100094_j.field_104549_b
		// @2F1: goto @2F5
		// @2F4: athrow
		// @2F5: iload_3
		// @2F6: bipush 20 (0x14)
		// @2F8: iload #5
		// @2FA: iadd
		// @2FB: iadd
		// @2FC: istore_3
		// @2FD: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @300: iconst_2
		// @301: aaload
		// @302: iload #4
		// @304: iload_3
		// @305: iload #6
		// @307: iload #5
		// @309: bipush 8 (0x08)
		// @30B: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @30E: ifne @315
		// @311: goto @319
		// @314: athrow
		// @315: iconst_5
		// @316: putstatic int game.C_100094_j.field_104549_b
		// @319: iload_3
		// @31A: iload #5
		// @31C: bipush 20 (0x14)
		// @31E: iadd
		// @31F: isub
		// @320: istore_3
		// @321: iload #4
		// @323: iconst_5
		// @324: iload #6
		// @326: iadd
		// @327: iadd
		// @328: istore #4
		// @32A: iload #4
		// @32C: aload #7
		// @32E: getfield int game.C_100112_r.field_101772_Q
		// @331: iadd
		// @332: istore #4
		// @334: aload #7
		// @336: new java.lang.StringBuilder
		// @339: dup
		// @33A: invokespecial java.lang.StringBuilder.<init>()void
		// @33D: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @340: bipush 32 (0x20)
		// @342: aaload
		// @343: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @346: getstatic int game.C_100096_un.field_104563_d
		// @349: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @34F: sipush 320 (0x0140)
		// @352: iload #4
		// @354: ldc 16777215 (0xffffff)
		// @356: iconst_m1
		// @357: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @35A: iinc #4 +5
		// @35D: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @360: bipush 29 (0x1D)
		// @362: aaload
		// @363: iload #4
		// @365: iload_3
		// @366: iload #6
		// @368: iload #5
		// @36A: bipush 8 (0x08)
		// @36C: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @36F: ifne @376
		// @372: goto @37B
		// @375: athrow
		// @376: bipush 6 (0x06)
		// @378: putstatic int game.C_100094_j.field_104549_b
		// @37B: iload_3
		// @37C: iload #5
		// @37E: bipush 20 (0x14)
		// @380: iadd
		// @381: iadd
		// @382: istore_3
		// @383: bipush 11 (0x0B)
		// @385: bipush 52 (0x34)
		// @387: iload_1
		// @388: isub
		// @389: bipush 49 (0x31)
		// @38B: idiv
		// @38C: irem
		// @38D: istore #9
		// @38F: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @392: bipush 27 (0x1B)
		// @394: aaload
		// @395: iload #4
		// @397: iload_3
		// @398: iload #6
		// @39A: iload #5
		// @39C: bipush 8 (0x08)
		// @39E: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @3A1: ifeq @3AD
		// @3A4: bipush 7 (0x07)
		// @3A6: putstatic int game.C_100094_j.field_104549_b
		// @3A9: goto @3AD
		// @3AC: athrow
		// @3AD: iload_3
		// @3AE: bipush 20 (0x14)
		// @3B0: iload #5
		// @3B2: iadd
		// @3B3: isub
		// @3B4: istore_3
		// @3B5: iload #4
		// @3B7: iload #6
		// @3B9: bipush 10 (0x0A)
		// @3BB: iadd
		// @3BC: iadd
		// @3BD: istore #4
		// @3BF: iload #4
		// @3C1: aload #7
		// @3C3: getfield int game.C_100112_r.field_101772_Q
		// @3C6: iadd
		// @3C7: istore #4
		// @3C9: aload #7
		// @3CB: new java.lang.StringBuilder
		// @3CE: dup
		// @3CF: invokespecial java.lang.StringBuilder.<init>()void
		// @3D2: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @3D5: bipush 8 (0x08)
		// @3D7: aaload
		// @3D8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3DB: iconst_0
		// @3DC: invokestatic game.C_100009_fg.func_103648_a(int)int
		// @3DF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3E5: sipush 320 (0x0140)
		// @3E8: iload #4
		// @3EA: ldc 16777215 (0xffffff)
		// @3EC: iconst_m1
		// @3ED: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @3F0: iinc #4 +5
		// @3F3: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @3F6: bipush 19 (0x13)
		// @3F8: aaload
		// @3F9: iload #4
		// @3FB: iload_3
		// @3FC: iload #6
		// @3FE: iload #5
		// @400: bipush 8 (0x08)
		// @402: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @405: ifeq @411
		// @408: bipush 8 (0x08)
		// @40A: putstatic int game.C_100094_j.field_104549_b
		// @40D: goto @411
		// @410: athrow
		// @411: iload_3
		// @412: iload #5
		// @414: bipush -20 (0xEC)
		// @416: isub
		// @417: iadd
		// @418: istore_3
		// @419: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @41C: bipush 9 (0x09)
		// @41E: aaload
		// @41F: iload #4
		// @421: iload_3
		// @422: iload #6
		// @424: iload #5
		// @426: bipush 8 (0x08)
		// @428: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @42B: ifne @432
		// @42E: goto @437
		// @431: athrow
		// @432: bipush 9 (0x09)
		// @434: putstatic int game.C_100094_j.field_104549_b
		// @437: iload #4
		// @439: bipush 10 (0x0A)
		// @43B: iload #6
		// @43D: iadd
		// @43E: iadd
		// @43F: istore #4
		// @441: sipush 200 (0x00C8)
		// @444: istore_3
		// @445: bipush 30 (0x1E)
		// @447: istore #6
		// @449: iinc #4 +10
		// @44C: bipush 80 (0x50)
		// @44E: istore #5
		// @450: aload #7
		// @452: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @455: bipush 24 (0x18)
		// @457: aaload
		// @458: bipush 50 (0x32)
		// @45A: bipush 20 (0x14)
		// @45C: iload #4
		// @45E: iadd
		// @45F: ldc 1021128 (0xf94c8)
		// @461: iconst_m1
		// @462: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @465: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @468: bipush 28 (0x1C)
		// @46A: aaload
		// @46B: iload #4
		// @46D: iload_3
		// @46E: iload #6
		// @470: iload #5
		// @472: bipush 8 (0x08)
		// @474: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @477: ifne @47E
		// @47A: goto @483
		// @47D: athrow
		// @47E: bipush 24 (0x18)
		// @480: putstatic int game.C_100094_j.field_104549_b
		// @483: aload #7
		// @485: getstatic int[] game.C_100275_na.field_103087_l
		// @488: iconst_0
		// @489: iaload
		// @48A: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @48D: iload_3
		// @48E: iload #5
		// @490: iconst_2
		// @491: idiv
		// @492: iadd
		// @493: iload #4
		// @495: iconst_2
		// @496: isub
		// @497: ldc 16777215 (0xffffff)
		// @499: iconst_m1
		// @49A: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @49D: iload_3
		// @49E: iload #5
		// @4A0: bipush 10 (0x0A)
		// @4A2: iadd
		// @4A3: iadd
		// @4A4: istore_3
		// @4A5: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @4A8: bipush 12 (0x0C)
		// @4AA: aaload
		// @4AB: iload #4
		// @4AD: iload_3
		// @4AE: iload #6
		// @4B0: iload #5
		// @4B2: bipush 8 (0x08)
		// @4B4: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @4B7: ifeq @4C3
		// @4BA: bipush 25 (0x19)
		// @4BC: putstatic int game.C_100094_j.field_104549_b
		// @4BF: goto @4C3
		// @4C2: athrow
		// @4C3: aload #7
		// @4C5: getstatic int[] game.C_100275_na.field_103087_l
		// @4C8: iconst_1
		// @4C9: iaload
		// @4CA: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @4CD: iload_3
		// @4CE: iload #5
		// @4D0: iconst_2
		// @4D1: idiv
		// @4D2: ineg
		// @4D3: isub
		// @4D4: iload #4
		// @4D6: bipush -2 (0xFE)
		// @4D8: iadd
		// @4D9: ldc 16777215 (0xffffff)
		// @4DB: iconst_m1
		// @4DC: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @4DF: iload_3
		// @4E0: bipush 10 (0x0A)
		// @4E2: iload #5
		// @4E4: iadd
		// @4E5: iadd
		// @4E6: istore_3
		// @4E7: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @4EA: bipush 10 (0x0A)
		// @4EC: aaload
		// @4ED: iload #4
		// @4EF: iload_3
		// @4F0: iload #6
		// @4F2: iload #5
		// @4F4: bipush 8 (0x08)
		// @4F6: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @4F9: ifeq @505
		// @4FC: bipush 26 (0x1A)
		// @4FE: putstatic int game.C_100094_j.field_104549_b
		// @501: goto @505
		// @504: athrow
		// @505: aload #7
		// @507: getstatic int[] game.C_100275_na.field_103087_l
		// @50A: iconst_2
		// @50B: iaload
		// @50C: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @50F: iload #5
		// @511: iconst_2
		// @512: idiv
		// @513: iload_3
		// @514: iadd
		// @515: iload #4
		// @517: iconst_2
		// @518: isub
		// @519: ldc 16777215 (0xffffff)
		// @51B: iconst_m1
		// @51C: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @51F: iinc #4 +34
		// @522: sipush 170 (0x00AA)
		// @525: istore_3
		// @526: bipush 30 (0x1E)
		// @528: istore #6
		// @52A: iload #4
		// @52C: iconst_5
		// @52D: aload #7
		// @52F: getfield int game.C_100112_r.field_101772_Q
		// @532: iadd
		// @533: iadd
		// @534: istore #4
		// @536: bipush 30 (0x1E)
		// @538: istore_3
		// @539: aload #7
		// @53B: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @53E: iconst_4
		// @53F: aaload
		// @540: iload_3
		// @541: bipush 20 (0x14)
		// @543: iload #4
		// @545: iadd
		// @546: ldc 1021128 (0xf94c8)
		// @548: iconst_m1
		// @549: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @54C: iinc #3 +70
		// @54F: bipush 60 (0x3C)
		// @551: istore #5
		// @553: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @556: bipush 26 (0x1A)
		// @558: aaload
		// @559: iload #4
		// @55B: iload_3
		// @55C: iload #6
		// @55E: iload #5
		// @560: bipush 8 (0x08)
		// @562: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @565: ifeq @571
		// @568: bipush 10 (0x0A)
		// @56A: putstatic int game.C_100094_j.field_104549_b
		// @56D: goto @571
		// @570: athrow
		// @571: iload_3
		// @572: bipush 10 (0x0A)
		// @574: iload #5
		// @576: iadd
		// @577: iadd
		// @578: istore_3
		// @579: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @57C: bipush 16 (0x10)
		// @57E: aaload
		// @57F: iload #4
		// @581: iload_3
		// @582: iload #6
		// @584: iload #5
		// @586: bipush 8 (0x08)
		// @588: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @58B: ifne @592
		// @58E: goto @597
		// @591: athrow
		// @592: bipush 11 (0x0B)
		// @594: putstatic int game.C_100094_j.field_104549_b
		// @597: iload_3
		// @598: iload #5
		// @59A: bipush 10 (0x0A)
		// @59C: iadd
		// @59D: iadd
		// @59E: istore_3
		// @59F: bipush 90 (0x5A)
		// @5A1: istore #5
		// @5A3: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @5A6: iconst_3
		// @5A7: aaload
		// @5A8: iload #4
		// @5AA: iload_3
		// @5AB: iload #6
		// @5AD: iload #5
		// @5AF: bipush 8 (0x08)
		// @5B1: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @5B4: ifne @5BB
		// @5B7: goto @5C0
		// @5BA: athrow
		// @5BB: bipush 12 (0x0C)
		// @5BD: putstatic int game.C_100094_j.field_104549_b
		// @5C0: iload_3
		// @5C1: iload #5
		// @5C3: bipush -10 (0xF6)
		// @5C5: isub
		// @5C6: iadd
		// @5C7: istore_3
		// @5C8: bipush 90 (0x5A)
		// @5CA: istore #5
		// @5CC: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @5CF: bipush 6 (0x06)
		// @5D1: aaload
		// @5D2: iload #4
		// @5D4: iload_3
		// @5D5: iload #6
		// @5D7: iload #5
		// @5D9: bipush 8 (0x08)
		// @5DB: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @5DE: ifne @5E5
		// @5E1: goto @5EA
		// @5E4: athrow
		// @5E5: bipush 13 (0x0D)
		// @5E7: putstatic int game.C_100094_j.field_104549_b
		// @5EA: iload_3
		// @5EB: bipush 40 (0x28)
		// @5ED: iload #5
		// @5EF: iadd
		// @5F0: iadd
		// @5F1: istore_3
		// @5F2: bipush 100 (0x64)
		// @5F4: istore #5
		// @5F6: iconst_m1
		// @5F7: getstatic int game.C_100249_pc.field_102333_I
		// @5FA: bipush 8 (0x08)
		// @5FC: iand
		// @5FD: iconst_m1
		// @5FE: ixor
		// @5FF: if_icmpeq @60C
		// @602: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @605: bipush 25 (0x19)
		// @607: aaload
		// @608: goto @612
		// @60B: athrow
		// @60C: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @60F: bipush 20 (0x14)
		// @611: aaload
		// @612: astore #10
		// @614: aload #7
		// @616: aload #10
		// @618: bipush -10 (0xF6)
		// @61A: iload_3
		// @61B: iadd
		// @61C: iload #4
		// @61E: bipush -3 (0xFD)
		// @620: iadd
		// @621: ldc 16777215 (0xffffff)
		// @623: iconst_m1
		// @624: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @627: iconst_m1
		// @628: getstatic int game.C_100249_pc.field_102333_I
		// @62B: bipush 8 (0x08)
		// @62D: iand
		// @62E: iconst_m1
		// @62F: ixor
		// @630: if_icmpne @63D
		// @633: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @636: bipush 18 (0x12)
		// @638: aaload
		// @639: goto @643
		// @63C: athrow
		// @63D: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @640: bipush 14 (0x0E)
		// @642: aaload
		// @643: astore #11
		// @645: aload #11
		// @647: iload #4
		// @649: iload_3
		// @64A: iload #6
		// @64C: iload #5
		// @64E: bipush 8 (0x08)
		// @650: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @653: ifne @65A
		// @656: goto @65F
		// @659: athrow
		// @65A: bipush 16 (0x10)
		// @65C: putstatic int game.C_100094_j.field_104549_b
		// @65F: iinc #4 +46
		// @662: bipush 20 (0x14)
		// @664: istore_3
		// @665: bipush 30 (0x1E)
		// @667: istore #5
		// @669: aload #7
		// @66B: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @66E: bipush 23 (0x17)
		// @670: aaload
		// @671: bipush 122 (0x7A)
		// @673: iload #4
		// @675: bipush -3 (0xFD)
		// @677: iadd
		// @678: ldc 1021128 (0xf94c8)
		// @67A: iconst_m1
		// @67B: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @67E: iconst_0
		// @67F: istore #12
		// @681: iload #12
		// @683: iconst_m1
		// @684: ixor
		// @685: bipush -6 (0xFA)
		// @687: if_icmplt @6D1
		// @68A: new java.lang.StringBuilder
		// @68D: dup
		// @68E: invokespecial java.lang.StringBuilder.<init>()void
		// @691: ldc_w ""
		// @694: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @697: iload #12
		// @699: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @69C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @69F: iload #4
		// @6A1: iload_3
		// @6A2: iload #6
		// @6A4: iload #5
		// @6A6: bipush 8 (0x08)
		// @6A8: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @6AB: iload #13
		// @6AD: ifne @6F5
		// @6B0: ifne @6BA
		// @6B3: goto @6B7
		// @6B6: athrow
		// @6B7: goto @6C2
		// @6BA: bipush 17 (0x11)
		// @6BC: iload #12
		// @6BE: iadd
		// @6BF: putstatic int game.C_100094_j.field_104549_b
		// @6C2: iload_3
		// @6C3: iload #5
		// @6C5: iconst_5
		// @6C6: iadd
		// @6C7: iadd
		// @6C8: istore_3
		// @6C9: iinc #12 +1
		// @6CC: iload #13
		// @6CE: ifeq @681
		// @6D1: bipush 30 (0x1E)
		// @6D3: istore #6
		// @6D5: bipush 100 (0x64)
		// @6D7: istore #5
		// @6D9: iload #5
		// @6DB: ineg
		// @6DC: sipush 640 (0x0280)
		// @6DF: iadd
		// @6E0: iconst_2
		// @6E1: idiv
		// @6E2: istore_3
		// @6E3: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @6E6: bipush 22 (0x16)
		// @6E8: aaload
		// @6E9: iload #4
		// @6EB: iload_3
		// @6EC: iload #6
		// @6EE: iload #5
		// @6F0: bipush 8 (0x08)
		// @6F2: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @6F5: ifeq @701
		// @6F8: bipush 14 (0x0E)
		// @6FA: putstatic int game.C_100094_j.field_104549_b
		// @6FD: goto @701
		// @700: athrow
		// @701: iload_3
		// @702: iload #5
		// @704: bipush -40 (0xD8)
		// @706: isub
		// @707: iadd
		// @708: istore_3
		// @709: sipush 140 (0x008C)
		// @70C: istore #5
		// @70E: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @711: bipush 13 (0x0D)
		// @713: aaload
		// @714: iload #4
		// @716: iload_3
		// @717: iload #6
		// @719: iload #5
		// @71B: bipush 8 (0x08)
		// @71D: invokestatic game.C_100049_vf.func_104189_a(java.lang.String, int, int, int, int, byte)boolean
		// @720: ifne @751
		// @723: getstatic boolean game.C_100255_pj.field_105257_q
		// @726: ifeq @75A
		// @729: goto @72D
		// @72C: athrow
		// @72D: iconst_0
		// @72E: getstatic int game.C_100066_dl.field_101636_H
		// @731: bipush 16 (0x10)
		// @733: iand
		// @734: if_icmpne @75A
		// @737: goto @73B
		// @73A: athrow
		// @73B: iload_3
		// @73C: iload #4
		// @73E: iload #5
		// @740: iload #6
		// @742: ldc_w 32896 (0x8080)
		// @745: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @748: iload #13
		// @74A: ifeq @75A
		// @74D: goto @751
		// @750: athrow
		// @751: bipush 15 (0x0F)
		// @753: putstatic int game.C_100094_j.field_104549_b
		// @756: goto @75A
		// @759: athrow
		// @75A: getstatic int game.C_100094_j.field_104549_b
		// @75D: iconst_m1
		// @75E: if_icmpeq @777
		// @761: iload_2
		// @762: getstatic int game.C_100094_j.field_104549_b
		// @765: if_icmpne @770
		// @768: goto @76C
		// @76B: athrow
		// @76C: goto @777
		// @76F: athrow
		// @770: bipush 97 (0x61)
		// @772: bipush 8 (0x08)
		// @774: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @777: goto @79C
		// @77A: astore_2
		// @77B: aload_2
		// @77C: new java.lang.StringBuilder
		// @77F: dup
		// @780: invokespecial java.lang.StringBuilder.<init>()void
		// @783: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @786: bipush 31 (0x1F)
		// @788: aaload
		// @789: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @78C: iload_1
		// @78D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @790: bipush 41 (0x29)
		// @792: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @795: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @798: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @79B: athrow
		// @79C: return
	}
	
	private final boolean func_103977_a(int arg0, int arg1)
	{
		// @000: getstatic int[][] game.C_100012_fh.field_100515_K
		// @003: aload_0
		// @004: getfield int game.C_100034_gi.field_104030_e
		// @007: aaload
		// @008: iload_1
		// @009: iaload
		// @00A: istore_3
		// @00B: iload_3
		// @00C: iconst_m1
		// @00D: ixor
		// @00E: bipush -44 (0xD4)
		// @010: if_icmpeq @01F
		// @013: iload_3
		// @014: iconst_m1
		// @015: ixor
		// @016: bipush -45 (0xD3)
		// @018: if_icmpne @02F
		// @01B: goto @01F
		// @01E: athrow
		// @01F: getstatic boolean game.C_100216_aj.field_104462_t
		// @022: ifeq @02D
		// @025: goto @029
		// @028: athrow
		// @029: goto @02F
		// @02C: athrow
		// @02D: iconst_0
		// @02E: ireturn
		// @02F: bipush 40 (0x28)
		// @031: iload_3
		// @032: if_icmpne @044
		// @035: iconst_m1
		// @036: getstatic int game.C_100068_vc.field_104343_e
		// @039: iconst_m1
		// @03A: ixor
		// @03B: if_icmplt @044
		// @03E: goto @042
		// @041: athrow
		// @042: iconst_0
		// @043: ireturn
		// @044: iconst_m1
		// @045: iload_3
		// @046: if_icmpne @04B
		// @049: iconst_0
		// @04A: ireturn
		// @04B: iload_2
		// @04C: bipush -4 (0xFC)
		// @04E: if_icmpeq @053
		// @051: iconst_1
		// @052: ireturn
		// @053: iload_3
		// @054: iconst_m1
		// @055: ixor
		// @056: bipush -29 (0xE3)
		// @058: if_icmpne @06C
		// @05B: iconst_1
		// @05C: invokestatic game.C_100254_pi.func_106444_a(int)boolean
		// @05F: ifeq @06A
		// @062: goto @066
		// @065: athrow
		// @066: goto @06C
		// @069: athrow
		// @06A: iconst_0
		// @06B: ireturn
		// @06C: iconst_1
		// @06D: iload_3
		// @06E: if_icmpne @082
		// @071: iconst_1
		// @072: invokestatic game.C_100254_pi.func_106444_a(int)boolean
		// @075: ifeq @080
		// @078: goto @07C
		// @07B: athrow
		// @07C: goto @082
		// @07F: athrow
		// @080: iconst_0
		// @081: ireturn
		// @082: bipush 25 (0x19)
		// @084: iload_3
		// @085: if_icmpne @0A9
		// @088: aload_0
		// @089: getfield int game.C_100034_gi.field_104030_e
		// @08C: iconst_m1
		// @08D: ixor
		// @08E: bipush -21 (0xEB)
		// @090: if_icmpeq @09B
		// @093: goto @097
		// @096: athrow
		// @097: goto @0A9
		// @09A: athrow
		// @09B: iconst_0
		// @09C: getstatic int game.C_100197_ra.field_100867_r
		// @09F: if_icmpge @0A7
		// @0A2: iconst_1
		// @0A3: goto @0A8
		// @0A6: athrow
		// @0A7: iconst_0
		// @0A8: ireturn
		// @0A9: bipush 26 (0x1A)
		// @0AB: iload_3
		// @0AC: if_icmpne @0E6
		// @0AF: aload_0
		// @0B0: getfield int game.C_100034_gi.field_104030_e
		// @0B3: bipush 20 (0x14)
		// @0B5: if_icmpeq @0C0
		// @0B8: goto @0BC
		// @0BB: athrow
		// @0BC: goto @0E6
		// @0BF: athrow
		// @0C0: getstatic int game.C_100197_ra.field_100867_r
		// @0C3: iconst_m1
		// @0C4: ixor
		// @0C5: bipush -10 (0xF6)
		// @0C7: if_icmple @0E4
		// @0CA: getstatic int[] game.C_100275_na.field_103087_l
		// @0CD: getstatic int game.C_100194_rd.field_103072_v
		// @0D0: iaload
		// @0D1: iconst_m1
		// @0D2: ixor
		// @0D3: getstatic int game.C_100197_ra.field_100867_r
		// @0D6: iconst_m1
		// @0D7: ixor
		// @0D8: if_icmpge @0E4
		// @0DB: goto @0DF
		// @0DE: athrow
		// @0DF: iconst_1
		// @0E0: goto @0E5
		// @0E3: athrow
		// @0E4: iconst_0
		// @0E5: ireturn
		// @0E6: iload_3
		// @0E7: iconst_m1
		// @0E8: ixor
		// @0E9: iconst_m1
		// @0EA: if_icmpne @118
		// @0ED: bipush 20 (0x14)
		// @0EF: aload_0
		// @0F0: getfield int game.C_100034_gi.field_104030_e
		// @0F3: if_icmpne @118
		// @0F6: goto @0FA
		// @0F9: athrow
		// @0FA: iconst_1
		// @0FB: invokestatic game.C_100254_pi.func_106444_a(int)boolean
		// @0FE: ifeq @116
		// @101: goto @105
		// @104: athrow
		// @105: bipush -25 (0xE7)
		// @107: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @10A: ifne @116
		// @10D: goto @111
		// @110: athrow
		// @111: iconst_1
		// @112: goto @117
		// @115: athrow
		// @116: iconst_0
		// @117: ireturn
		// @118: aload_0
		// @119: getfield int game.C_100034_gi.field_104030_e
		// @11C: bipush 14 (0x0E)
		// @11E: if_icmpne @13E
		// @121: iload_3
		// @122: bipush 46 (0x2E)
		// @124: if_icmpne @13E
		// @127: goto @12B
		// @12A: athrow
		// @12B: iconst_m1
		// @12C: getstatic int game.C_100068_vc.field_104343_e
		// @12F: iconst_m1
		// @130: ixor
		// @131: if_icmpge @13C
		// @134: goto @138
		// @137: athrow
		// @138: goto @13E
		// @13B: athrow
		// @13C: iconst_0
		// @13D: ireturn
		// @13E: iconst_1
		// @13F: ireturn
		// @140: astore_3
		// @141: aload_3
		// @142: new java.lang.StringBuilder
		// @145: dup
		// @146: invokespecial java.lang.StringBuilder.<init>()void
		// @149: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @14C: bipush 102 (0x66)
		// @14E: aaload
		// @14F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @152: iload_1
		// @153: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @156: bipush 44 (0x2C)
		// @158: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @15B: iload_2
		// @15C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @15F: bipush 41 (0x29)
		// @161: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @164: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @167: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @16A: athrow
	}
	
	private final void func_103989_a(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #16
		// @005: ldc 1021128 (0xf94c8)
		// @007: istore #9
		// @009: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @00C: astore #10
		// @00E: iload_2
		// @00F: ifeq @060
		// @012: iload_3
		// @013: bipush -11 (0xF5)
		// @015: iadd
		// @016: istore #11
		// @018: bipush 13 (0x0D)
		// @01A: istore #12
		// @01C: iconst_0
		// @01D: istore #13
		// @01F: iload #13
		// @021: iconst_m1
		// @022: ixor
		// @023: bipush -5 (0xFB)
		// @025: if_icmple @060
		// @028: getstatic int[] game.C_100111_el.field_104862_b
		// @02B: iload #13
		// @02D: iaload
		// @02E: istore #14
		// @030: getstatic int[] game.C_100111_el.field_104862_b
		// @033: iload #13
		// @035: iconst_m1
		// @036: isub
		// @037: iaload
		// @038: istore #15
		// @03A: iconst_3
		// @03B: iload #14
		// @03D: iadd
		// @03E: iload #11
		// @040: iload #15
		// @042: iload #14
		// @044: iconst_5
		// @045: iadd
		// @046: isub
		// @047: iload #12
		// @049: sipush 12105 (0x2F49)
		// @04C: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @04F: iinc #13 +1
		// @052: iload #16
		// @054: ifne @075
		// @057: iload #16
		// @059: ifeq @01F
		// @05C: goto @060
		// @05F: athrow
		// @060: aload #10
		// @062: aload_1
		// @063: getstatic int[] game.C_100111_el.field_104862_b
		// @066: iconst_0
		// @067: iaload
		// @068: bipush -5 (0xFB)
		// @06A: isub
		// @06B: iload_3
		// @06C: iload #9
		// @06E: iconst_m1
		// @06F: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @072: iinc #6 +1
		// @075: iload #5
		// @077: sipush -25278 (0x9D42)
		// @07A: if_icmpeq @07E
		// @07D: return
		// @07E: aload #10
		// @080: getstatic java.lang.String[] game.C_100179_ch.field_100813_l
		// @083: iload #4
		// @085: aaload
		// @086: getstatic int[] game.C_100111_el.field_104862_b
		// @089: iconst_1
		// @08A: iaload
		// @08B: bipush -5 (0xFB)
		// @08D: isub
		// @08E: iload_3
		// @08F: iload #9
		// @091: iconst_m1
		// @092: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @095: iload #6
		// @097: iconst_m1
		// @098: ixor
		// @099: bipush -44 (0xD4)
		// @09B: if_icmpeq @0CC
		// @09E: bipush 42 (0x2A)
		// @0A0: iload #6
		// @0A2: if_icmpeq @0C6
		// @0A5: goto @0A9
		// @0A8: athrow
		// @0A9: bipush 41 (0x29)
		// @0AB: iload #6
		// @0AD: if_icmpeq @0BD
		// @0B0: goto @0B4
		// @0B3: athrow
		// @0B4: iload #6
		// @0B6: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @0B9: goto @0CF
		// @0BC: athrow
		// @0BD: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @0C0: bipush 45 (0x2D)
		// @0C2: aaload
		// @0C3: goto @0CF
		// @0C6: getstatic java.lang.String game.C_100288_jn.field_106844_c
		// @0C9: goto @0CF
		// @0CC: getstatic java.lang.String game.C_100020_wm.field_103855_e
		// @0CF: astore #11
		// @0D1: aload #10
		// @0D3: aload #11
		// @0D5: getstatic int[] game.C_100111_el.field_104862_b
		// @0D8: iconst_3
		// @0D9: iaload
		// @0DA: bipush 6 (0x06)
		// @0DC: isub
		// @0DD: iload_3
		// @0DE: iload #9
		// @0E0: iconst_m1
		// @0E1: invokevirtual game.C_100112_r.func_101746_a(java.lang.String, int, int, int, int)void
		// @0E4: aload #10
		// @0E6: iload #7
		// @0E8: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @0EB: bipush -6 (0xFA)
		// @0ED: getstatic int[] game.C_100111_el.field_104862_b
		// @0F0: iconst_4
		// @0F1: iaload
		// @0F2: iadd
		// @0F3: iload_3
		// @0F4: iload #9
		// @0F6: iconst_m1
		// @0F7: invokevirtual game.C_100112_r.func_101746_a(java.lang.String, int, int, int, int)void
		// @0FA: goto @178
		// @0FD: astore #9
		// @0FF: aload #9
		// @101: new java.lang.StringBuilder
		// @104: dup
		// @105: invokespecial java.lang.StringBuilder.<init>()void
		// @108: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @10B: bipush 44 (0x2C)
		// @10D: aaload
		// @10E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @111: aload_1
		// @112: ifnull @11F
		// @115: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @118: bipush 46 (0x2E)
		// @11A: aaload
		// @11B: goto @125
		// @11E: athrow
		// @11F: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @122: bipush 43 (0x2B)
		// @124: aaload
		// @125: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @128: bipush 44 (0x2C)
		// @12A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @12D: iload_2
		// @12E: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @131: bipush 44 (0x2C)
		// @133: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @136: iload_3
		// @137: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @13A: bipush 44 (0x2C)
		// @13C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13F: iload #4
		// @141: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @144: bipush 44 (0x2C)
		// @146: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @149: iload #5
		// @14B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @14E: bipush 44 (0x2C)
		// @150: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @153: iload #6
		// @155: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @158: bipush 44 (0x2C)
		// @15A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @15D: iload #7
		// @15F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @162: bipush 44 (0x2C)
		// @164: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @167: iload #8
		// @169: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @16C: bipush 41 (0x29)
		// @16E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @171: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @174: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @177: athrow
		// @178: return
	}
	
	private final int func_103975_c(int arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: aload_0
		// @006: bipush -124 (0x84)
		// @008: iload_2
		// @009: invokespecial game.C_100034_gi.func_104011_b(byte, int)int
		// @00C: istore_3
		// @00D: iconst_0
		// @00E: iload_3
		// @00F: if_icmpgt @016
		// @012: sipush 448 (0x01C0)
		// @015: ireturn
		// @016: iload_1
		// @017: bipush -4 (0xFC)
		// @019: if_icmpeq @027
		// @01C: aconst_null
		// @01D: checkcast game.C_100102_w
		// @020: putstatic game.C_100102_w game.C_100034_gi.field_104028_g
		// @023: goto @027
		// @026: athrow
		// @027: iconst_0
		// @028: istore_3
		// @029: aload_0
		// @02A: getfield int game.C_100034_gi.field_104030_e
		// @02D: istore #5
		// @02F: iload #5
		// @031: iconst_5
		// @032: if_icmpeq @0E0
		// @035: iload #5
		// @037: bipush 6 (0x06)
		// @039: if_icmpne @049
		// @03C: goto @040
		// @03F: athrow
		// @040: iload #6
		// @042: ifeq @0E0
		// @045: goto @049
		// @048: athrow
		// @049: bipush -9 (0xF7)
		// @04B: iload #5
		// @04D: iconst_m1
		// @04E: ixor
		// @04F: if_icmpeq @0F9
		// @052: goto @056
		// @055: athrow
		// @056: bipush 7 (0x07)
		// @058: iload #5
		// @05A: if_icmpeq @10E
		// @05D: goto @061
		// @060: athrow
		// @061: bipush 14 (0x0E)
		// @063: iload #5
		// @065: if_icmpeq @10E
		// @068: goto @06C
		// @06B: athrow
		// @06C: iload #5
		// @06E: bipush 13 (0x0D)
		// @070: if_icmpeq @10E
		// @073: goto @077
		// @076: athrow
		// @077: iconst_0
		// @078: iload #5
		// @07A: if_icmpne @08A
		// @07D: goto @081
		// @080: athrow
		// @081: iload #6
		// @083: ifeq @117
		// @086: goto @08A
		// @089: athrow
		// @08A: bipush 17 (0x11)
		// @08C: iload #5
		// @08E: if_icmpne @09E
		// @091: goto @095
		// @094: athrow
		// @095: iload #6
		// @097: ifeq @154
		// @09A: goto @09E
		// @09D: athrow
		// @09E: bipush -20 (0xEC)
		// @0A0: iload #5
		// @0A2: iconst_m1
		// @0A3: ixor
		// @0A4: if_icmpne @0B4
		// @0A7: goto @0AB
		// @0AA: athrow
		// @0AB: iload #6
		// @0AD: ifeq @187
		// @0B0: goto @0B4
		// @0B3: athrow
		// @0B4: iload #5
		// @0B6: iconst_m1
		// @0B7: ixor
		// @0B8: bipush -21 (0xEB)
		// @0BA: if_icmpne @0CA
		// @0BD: goto @0C1
		// @0C0: athrow
		// @0C1: iload #6
		// @0C3: ifeq @193
		// @0C6: goto @0CA
		// @0C9: athrow
		// @0CA: iload #5
		// @0CC: iconst_m1
		// @0CD: ixor
		// @0CE: bipush -23 (0xE9)
		// @0D0: if_icmpne @1F8
		// @0D3: goto @0D7
		// @0D6: athrow
		// @0D7: iload #6
		// @0D9: ifeq @1EE
		// @0DC: goto @0E0
		// @0DF: athrow
		// @0E0: bipush -25 (0xE7)
		// @0E2: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @0E5: ifeq @0F0
		// @0E8: goto @0EC
		// @0EB: athrow
		// @0EC: goto @1F8
		// @0EF: athrow
		// @0F0: sipush 379 (0x017B)
		// @0F3: istore_3
		// @0F4: iload #6
		// @0F6: ifeq @1F8
		// @0F9: bipush -25 (0xE7)
		// @0FB: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @0FE: ifne @1F8
		// @101: goto @105
		// @104: athrow
		// @105: sipush 448 (0x01C0)
		// @108: istore_3
		// @109: iload #6
		// @10B: ifeq @1F8
		// @10E: sipush 448 (0x01C0)
		// @111: istore_3
		// @112: iload #6
		// @114: ifeq @1F8
		// @117: getstatic int[] game.C_100012_fh.field_100508_L
		// @11A: aload_0
		// @11B: getfield int game.C_100034_gi.field_104030_e
		// @11E: iaload
		// @11F: iload_2
		// @120: imul
		// @121: sipush 175 (0x00AF)
		// @124: iadd
		// @125: istore_3
		// @126: bipush -65 (0xBF)
		// @128: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @12B: ifeq @132
		// @12E: goto @138
		// @131: athrow
		// @132: iload_3
		// @133: iconst_4
		// @134: iload_2
		// @135: imul
		// @136: iadd
		// @137: istore_3
		// @138: getstatic int[][] game.C_100012_fh.field_100515_K
		// @13B: aload_0
		// @13C: getfield int game.C_100034_gi.field_104030_e
		// @13F: aaload
		// @140: iload_2
		// @141: iaload
		// @142: istore #4
		// @144: iload #4
		// @146: bipush 34 (0x22)
		// @148: if_icmpne @1F8
		// @14B: sipush 350 (0x015E)
		// @14E: istore_3
		// @14F: iload #6
		// @151: ifeq @1F8
		// @154: sipush 130 (0x0082)
		// @157: istore_3
		// @158: iconst_m1
		// @159: iload_2
		// @15A: iconst_m1
		// @15B: ixor
		// @15C: if_icmple @1F8
		// @15F: iload_2
		// @160: iconst_m1
		// @161: ixor
		// @162: bipush -4 (0xFC)
		// @164: getstatic int[][] game.C_100012_fh.field_100515_K
		// @167: aload_0
		// @168: getfield int game.C_100034_gi.field_104030_e
		// @16B: aaload
		// @16C: arraylength
		// @16D: iadd
		// @16E: iconst_m1
		// @16F: ixor
		// @170: if_icmpgt @17B
		// @173: goto @177
		// @176: athrow
		// @177: goto @1F8
		// @17A: athrow
		// @17B: iload_3
		// @17C: iload_2
		// @17D: bipush 30 (0x1E)
		// @17F: imul
		// @180: iadd
		// @181: istore_3
		// @182: iload #6
		// @184: ifeq @1F8
		// @187: bipush 111 (0x6F)
		// @189: iload_2
		// @18A: bipush 10 (0x0A)
		// @18C: irem
		// @18D: bipush 29 (0x1D)
		// @18F: imul
		// @190: ineg
		// @191: isub
		// @192: ireturn
		// @193: getstatic int[][] game.C_100012_fh.field_100515_K
		// @196: aload_0
		// @197: getfield int game.C_100034_gi.field_104030_e
		// @19A: aaload
		// @19B: iload_2
		// @19C: iaload
		// @19D: istore #5
		// @19F: iload #5
		// @1A1: iconst_m1
		// @1A2: ixor
		// @1A3: bipush -26 (0xE6)
		// @1A5: if_icmpne @1B1
		// @1A8: iload #6
		// @1AA: ifeq @1DD
		// @1AD: goto @1B1
		// @1B0: athrow
		// @1B1: bipush -27 (0xE5)
		// @1B3: iload #5
		// @1B5: iconst_m1
		// @1B6: ixor
		// @1B7: if_icmpne @1C7
		// @1BA: goto @1BE
		// @1BD: athrow
		// @1BE: iload #6
		// @1C0: ifeq @1DD
		// @1C3: goto @1C7
		// @1C6: athrow
		// @1C7: bipush -40 (0xD8)
		// @1C9: iload #5
		// @1CB: iconst_m1
		// @1CC: ixor
		// @1CD: if_icmpne @1F8
		// @1D0: goto @1D4
		// @1D3: athrow
		// @1D4: iload #6
		// @1D6: ifeq @1E5
		// @1D9: goto @1DD
		// @1DC: athrow
		// @1DD: bipush 95 (0x5F)
		// @1DF: istore_3
		// @1E0: iload #6
		// @1E2: ifeq @1F8
		// @1E5: sipush 376 (0x0178)
		// @1E8: istore_3
		// @1E9: iload #6
		// @1EB: ifeq @1F8
		// @1EE: sipush 150 (0x0096)
		// @1F1: bipush 30 (0x1E)
		// @1F3: iload_2
		// @1F4: imul
		// @1F5: ineg
		// @1F6: isub
		// @1F7: ireturn
		// @1F8: aload_0
		// @1F9: bipush 126 (0x7E)
		// @1FB: invokespecial game.C_100034_gi.func_103976_d(int)boolean
		// @1FE: ifne @205
		// @201: goto @227
		// @204: athrow
		// @205: bipush -9 (0xF7)
		// @207: getstatic int[][] game.C_100012_fh.field_100515_K
		// @20A: aload_0
		// @20B: getfield int game.C_100034_gi.field_104030_e
		// @20E: aaload
		// @20F: arraylength
		// @210: iconst_m1
		// @211: ixor
		// @212: if_icmplt @21E
		// @215: bipush 90 (0x5A)
		// @217: iload_2
		// @218: bipush 30 (0x1E)
		// @21A: imul
		// @21B: ineg
		// @21C: isub
		// @21D: ireturn
		// @21E: bipush 120 (0x78)
		// @220: iload_2
		// @221: bipush 30 (0x1E)
		// @223: imul
		// @224: ineg
		// @225: isub
		// @226: ireturn
		// @227: iconst_0
		// @228: iload_3
		// @229: if_icmpeq @230
		// @22C: goto @244
		// @22F: athrow
		// @230: getstatic int[] game.C_100012_fh.field_100508_L
		// @233: aload_0
		// @234: getfield int game.C_100034_gi.field_104030_e
		// @237: iaload
		// @238: iload_2
		// @239: imul
		// @23A: getstatic int[] game.C_100012_fh.field_100504_D
		// @23D: aload_0
		// @23E: getfield int game.C_100034_gi.field_104030_e
		// @241: iaload
		// @242: iadd
		// @243: istore_3
		// @244: aload_0
		// @245: getfield int game.C_100034_gi.field_104031_b
		// @248: iload_3
		// @249: iadd
		// @24A: ireturn
		// @24B: astore_3
		// @24C: aload_3
		// @24D: new java.lang.StringBuilder
		// @250: dup
		// @251: invokespecial java.lang.StringBuilder.<init>()void
		// @254: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @257: bipush 35 (0x23)
		// @259: aaload
		// @25A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25D: iload_1
		// @25E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @261: bipush 44 (0x2C)
		// @263: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @266: iload_2
		// @267: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @26A: bipush 41 (0x29)
		// @26C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @26F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @272: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @275: athrow
	}
	
	private final boolean func_104006_a(boolean arg0, int arg1)
	{
		// @00: iload_2
		// @01: bipush 31 (0x1F)
		// @03: getstatic int[] game.C_100066_dl.field_101632_G
		// @06: invokestatic game.C_100189_ri.func_105742_a(int, int, int[])boolean
		// @09: ifeq @0E
		// @0C: iconst_1
		// @0D: ireturn
		// @0E: iload_1
		// @0F: ifeq @1C
		// @12: aload_0
		// @13: bipush -35 (0xDD)
		// @15: putfield int game.C_100034_gi.field_104031_b
		// @18: goto @1C
		// @1B: athrow
		// @1C: iload_2
		// @1D: bipush 31 (0x1F)
		// @1F: getstatic int[] game.C_100275_na.field_103095_q
		// @22: invokestatic game.C_100189_ri.func_105742_a(int, int, int[])boolean
		// @25: ifeq @2A
		// @28: iconst_0
		// @29: ireturn
		// @2A: iload_2
		// @2B: bipush 31 (0x1F)
		// @2D: getstatic int[] game.C_100275_na.field_103086_o
		// @30: invokestatic game.C_100189_ri.func_105742_a(int, int, int[])boolean
		// @33: ifeq @55
		// @36: bipush -25 (0xE7)
		// @38: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @3B: ifne @53
		// @3E: goto @42
		// @41: athrow
		// @42: iconst_m1
		// @43: getstatic int game.C_100212_qc.field_105976_b
		// @46: iconst_m1
		// @47: ixor
		// @48: if_icmple @53
		// @4B: goto @4F
		// @4E: athrow
		// @4F: goto @55
		// @52: athrow
		// @53: iconst_0
		// @54: ireturn
		// @55: iconst_1
		// @56: ireturn
		// @57: astore_3
		// @58: aload_3
		// @59: new java.lang.StringBuilder
		// @5C: dup
		// @5D: invokespecial java.lang.StringBuilder.<init>()void
		// @60: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @63: bipush 54 (0x36)
		// @65: aaload
		// @66: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @69: iload_1
		// @6A: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @6D: bipush 44 (0x2C)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: iload_2
		// @73: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @76: bipush 41 (0x29)
		// @78: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @81: athrow
	}
	
	private final int func_103982_p(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: aload_0
		// @006: getfield int game.C_100034_gi.field_104030_e
		// @009: bipush 16 (0x10)
		// @00B: if_icmpne @010
		// @00E: iconst_m1
		// @00F: ireturn
		// @010: aload_0
		// @011: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @014: getfield int game.C_100333_ij.field_107347_b
		// @017: istore_2
		// @018: iconst_0
		// @019: iload_2
		// @01A: if_icmpgt @02E
		// @01D: getstatic int[][] game.C_100012_fh.field_100515_K
		// @020: aload_0
		// @021: getfield int game.C_100034_gi.field_104030_e
		// @024: aaload
		// @025: arraylength
		// @026: iload_2
		// @027: if_icmple @02E
		// @02A: goto @02E
		// @02D: athrow
		// @02E: aload_0
		// @02F: bipush -124 (0x84)
		// @031: iload_2
		// @032: invokespecial game.C_100034_gi.func_104011_b(byte, int)int
		// @035: istore_3
		// @036: iload_2
		// @037: iflt @061
		// @03A: getstatic int[][] game.C_100012_fh.field_100515_K
		// @03D: aload_0
		// @03E: getfield int game.C_100034_gi.field_104030_e
		// @041: aaload
		// @042: arraylength
		// @043: iconst_m1
		// @044: ixor
		// @045: iload_2
		// @046: iconst_m1
		// @047: ixor
		// @048: if_icmpge @061
		// @04B: goto @04F
		// @04E: athrow
		// @04F: getstatic int[][] game.C_100012_fh.field_100515_K
		// @052: aload_0
		// @053: getfield int game.C_100034_gi.field_104030_e
		// @056: aaload
		// @057: iload_2
		// @058: iaload
		// @059: iconst_m1
		// @05A: if_icmpne @096
		// @05D: goto @061
		// @060: athrow
		// @061: getstatic int[][] game.C_100012_fh.field_100515_K
		// @064: aload_0
		// @065: getfield int game.C_100034_gi.field_104030_e
		// @068: aaload
		// @069: arraylength
		// @06A: iconst_1
		// @06B: isub
		// @06C: istore_2
		// @06D: iload_2
		// @06E: iflt @094
		// @071: getstatic int[][] game.C_100012_fh.field_100515_K
		// @074: aload_0
		// @075: getfield int game.C_100034_gi.field_104030_e
		// @078: aaload
		// @079: iload_2
		// @07A: iaload
		// @07B: iload #5
		// @07D: ifne @095
		// @080: iconst_m1
		// @081: if_icmpne @094
		// @084: goto @088
		// @087: athrow
		// @088: iinc #2 +255
		// @08B: iload #5
		// @08D: ifeq @06D
		// @090: goto @094
		// @093: athrow
		// @094: iload_2
		// @095: ireturn
		// @096: aload_0
		// @097: getfield int game.C_100034_gi.field_104030_e
		// @09A: iconst_m1
		// @09B: ixor
		// @09C: iload_1
		// @09D: if_icmpne @0EA
		// @0A0: bipush -35 (0xDD)
		// @0A2: getstatic int[][] game.C_100012_fh.field_100515_K
		// @0A5: aload_0
		// @0A6: getfield int game.C_100034_gi.field_104030_e
		// @0A9: aaload
		// @0AA: iload_2
		// @0AB: iaload
		// @0AC: iconst_m1
		// @0AD: ixor
		// @0AE: if_icmpeq @0E8
		// @0B1: goto @0B5
		// @0B4: athrow
		// @0B5: getstatic int[][] game.C_100012_fh.field_100515_K
		// @0B8: aload_0
		// @0B9: getfield int game.C_100034_gi.field_104030_e
		// @0BC: aaload
		// @0BD: iconst_m1
		// @0BE: getstatic int[][] game.C_100012_fh.field_100515_K
		// @0C1: aload_0
		// @0C2: getfield int game.C_100034_gi.field_104030_e
		// @0C5: aaload
		// @0C6: arraylength
		// @0C7: iadd
		// @0C8: iaload
		// @0C9: iconst_m1
		// @0CA: ixor
		// @0CB: bipush -35 (0xDD)
		// @0CD: if_icmpeq @0D8
		// @0D0: goto @0D4
		// @0D3: athrow
		// @0D4: goto @0E8
		// @0D7: athrow
		// @0D8: iload_2
		// @0D9: putstatic int game.C_100043_vl.field_101937_Wb
		// @0DC: getstatic int[][] game.C_100012_fh.field_100515_K
		// @0DF: aload_0
		// @0E0: getfield int game.C_100034_gi.field_104030_e
		// @0E3: aaload
		// @0E4: arraylength
		// @0E5: iconst_1
		// @0E6: isub
		// @0E7: ireturn
		// @0E8: iload_2
		// @0E9: ireturn
		// @0EA: bipush -21 (0xEB)
		// @0EC: aload_0
		// @0ED: getfield int game.C_100034_gi.field_104030_e
		// @0F0: iconst_m1
		// @0F1: ixor
		// @0F2: if_icmpne @110
		// @0F5: iconst_0
		// @0F6: iload_2
		// @0F7: if_icmpgt @110
		// @0FA: goto @0FE
		// @0FD: athrow
		// @0FE: iload_2
		// @0FF: iconst_m1
		// @100: ixor
		// @101: bipush -4 (0xFC)
		// @103: if_icmpgt @10E
		// @106: goto @10A
		// @109: athrow
		// @10A: goto @110
		// @10D: athrow
		// @10E: iconst_0
		// @10F: ireturn
		// @110: iload_3
		// @111: iflt @178
		// @114: iinc #2 +255
		// @117: iinc #3 +255
		// @11A: iconst_m1
		// @11B: iload_3
		// @11C: iconst_m1
		// @11D: ixor
		// @11E: if_icmplt @129
		// @121: goto @125
		// @124: athrow
		// @125: goto @12F
		// @128: athrow
		// @129: iinc #2 +4
		// @12C: iinc #3 +4
		// @12F: iconst_m1
		// @130: getstatic int[][] game.C_100012_fh.field_100515_K
		// @133: aload_0
		// @134: getfield int game.C_100034_gi.field_104030_e
		// @137: aaload
		// @138: iload_2
		// @139: iaload
		// @13A: if_icmpne @176
		// @13D: iinc #3 +255
		// @140: iinc #2 +255
		// @143: iload_3
		// @144: iconst_m1
		// @145: ixor
		// @146: iload #5
		// @148: ifne @177
		// @14B: goto @14F
		// @14E: athrow
		// @14F: iconst_m1
		// @150: if_icmpgt @15B
		// @153: goto @157
		// @156: athrow
		// @157: goto @161
		// @15A: athrow
		// @15B: iinc #3 +4
		// @15E: iinc #2 +4
		// @161: iload_2
		// @162: iconst_m1
		// @163: ixor
		// @164: aload_0
		// @165: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @168: getfield int game.C_100333_ij.field_107347_b
		// @16B: iconst_m1
		// @16C: ixor
		// @16D: if_icmpeq @174
		// @170: goto @12F
		// @173: athrow
		// @174: iload_2
		// @175: ireturn
		// @176: iload_2
		// @177: ireturn
		// @178: bipush -6 (0xFA)
		// @17A: aload_0
		// @17B: getfield int game.C_100034_gi.field_104030_e
		// @17E: iconst_m1
		// @17F: ixor
		// @180: if_icmpne @1A1
		// @183: iload_2
		// @184: iconst_3
		// @185: if_icmpge @1A1
		// @188: goto @18C
		// @18B: athrow
		// @18C: iinc #2 +255
		// @18F: iconst_0
		// @190: iload_2
		// @191: if_icmpgt @19C
		// @194: goto @198
		// @197: athrow
		// @198: goto @19F
		// @19B: athrow
		// @19C: iinc #2 +3
		// @19F: iload_2
		// @1A0: ireturn
		// @1A1: aload_0
		// @1A2: getfield int game.C_100034_gi.field_104030_e
		// @1A5: iconst_m1
		// @1A6: ixor
		// @1A7: bipush -7 (0xF9)
		// @1A9: if_icmpne @1CC
		// @1AC: iconst_2
		// @1AD: iload_2
		// @1AE: if_icmpgt @1B9
		// @1B1: goto @1B5
		// @1B4: athrow
		// @1B5: goto @1CC
		// @1B8: athrow
		// @1B9: iinc #2 +255
		// @1BC: iconst_m1
		// @1BD: iload_2
		// @1BE: iconst_m1
		// @1BF: ixor
		// @1C0: if_icmplt @1C7
		// @1C3: goto @1CA
		// @1C6: athrow
		// @1C7: iinc #2 +2
		// @1CA: iload_2
		// @1CB: ireturn
		// @1CC: aload_0
		// @1CD: getfield int game.C_100034_gi.field_104030_e
		// @1D0: iconst_m1
		// @1D1: ixor
		// @1D2: bipush -20 (0xEC)
		// @1D4: if_icmpeq @1DB
		// @1D7: goto @20C
		// @1DA: athrow
		// @1DB: getstatic int[] game.C_100333_ij.field_107345_d
		// @1DE: getstatic int[][] game.C_100012_fh.field_100515_K
		// @1E1: aload_0
		// @1E2: getfield int game.C_100034_gi.field_104030_e
		// @1E5: aaload
		// @1E6: if_acmpeq @1EF
		// @1E9: bipush 20 (0x14)
		// @1EB: goto @1F1
		// @1EE: athrow
		// @1EF: bipush 30 (0x1E)
		// @1F1: istore #4
		// @1F3: bipush 10 (0x0A)
		// @1F5: iload_2
		// @1F6: if_icmpgt @20C
		// @1F9: iload #4
		// @1FB: iload_2
		// @1FC: if_icmpgt @207
		// @1FF: goto @203
		// @202: athrow
		// @203: goto @20C
		// @206: athrow
		// @207: bipush -10 (0xF6)
		// @209: iload_2
		// @20A: iadd
		// @20B: ireturn
		// @20C: iconst_m1
		// @20D: ireturn
		// @20E: astore_2
		// @20F: aload_2
		// @210: new java.lang.StringBuilder
		// @213: dup
		// @214: invokespecial java.lang.StringBuilder.<init>()void
		// @217: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @21A: bipush 111 (0x6F)
		// @21C: aaload
		// @21D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @220: iload_1
		// @221: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @224: bipush 41 (0x29)
		// @226: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @229: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @22C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @22F: athrow
	}
	
	private final void func_104016_r(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: iload_1
		// @006: bipush 8 (0x08)
		// @008: if_icmpeq @014
		// @00B: bipush 36 (0x24)
		// @00D: invokestatic game.C_100034_gi.func_104020_c(int)void
		// @010: goto @014
		// @013: athrow
		// @014: aload_0
		// @015: iconst_0
		// @016: bipush -111 (0x91)
		// @018: invokespecial game.C_100034_gi.func_104003_a(int, byte)boolean
		// @01B: ifne @023
		// @01E: iconst_1
		// @01F: goto @024
		// @022: athrow
		// @023: iconst_0
		// @024: istore_2
		// @025: aload_0
		// @026: iconst_2
		// @027: bipush -82 (0xAE)
		// @029: invokespecial game.C_100034_gi.func_104003_a(int, byte)boolean
		// @02C: ifne @034
		// @02F: iconst_1
		// @030: goto @035
		// @033: athrow
		// @034: iconst_2
		// @035: istore_3
		// @036: aload_0
		// @037: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @03A: iload_1
		// @03B: bipush -8 (0xF8)
		// @03D: iadd
		// @03E: invokevirtual game.C_100333_ij.func_107338_f(int)boolean
		// @041: ifne @0DE
		// @044: getstatic int game.C_100293_kj.field_106890_c
		// @047: bipush 96 (0x60)
		// @049: if_icmpne @08B
		// @04C: goto @050
		// @04F: athrow
		// @050: aload_0
		// @051: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @054: getfield int game.C_100333_ij.field_107347_b
		// @057: iload_2
		// @058: if_icmpgt @075
		// @05B: goto @05F
		// @05E: athrow
		// @05F: aload_0
		// @060: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @063: iload_3
		// @064: iload_1
		// @065: sipush -134 (0xFF7A)
		// @068: iadd
		// @069: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @06C: iload #5
		// @06E: ifeq @08B
		// @071: goto @075
		// @074: athrow
		// @075: aload_0
		// @076: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @079: iconst_m1
		// @07A: aload_0
		// @07B: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @07E: getfield int game.C_100333_ij.field_107347_b
		// @081: iadd
		// @082: bipush -44 (0xD4)
		// @084: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @087: goto @08B
		// @08A: athrow
		// @08B: bipush 97 (0x61)
		// @08D: getstatic int game.C_100293_kj.field_106890_c
		// @090: if_icmpne @0DE
		// @093: aload_0
		// @094: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @097: getfield int game.C_100333_ij.field_107347_b
		// @09A: iconst_m1
		// @09B: ixor
		// @09C: iconst_m1
		// @09D: if_icmpgt @0CE
		// @0A0: goto @0A4
		// @0A3: athrow
		// @0A4: aload_0
		// @0A5: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0A8: getfield int game.C_100333_ij.field_107347_b
		// @0AB: iload_3
		// @0AC: if_icmpge @0CE
		// @0AF: goto @0B3
		// @0B2: athrow
		// @0B3: aload_0
		// @0B4: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0B7: iconst_1
		// @0B8: aload_0
		// @0B9: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0BC: getfield int game.C_100333_ij.field_107347_b
		// @0BF: iadd
		// @0C0: bipush -115 (0x8D)
		// @0C2: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @0C5: iload #5
		// @0C7: ifeq @0DE
		// @0CA: goto @0CE
		// @0CD: athrow
		// @0CE: aload_0
		// @0CF: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0D2: iload_2
		// @0D3: iload_1
		// @0D4: bipush -50 (0xCE)
		// @0D6: ixor
		// @0D7: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @0DA: goto @0DE
		// @0DD: athrow
		// @0DE: aconst_null
		// @0DF: getstatic game.C_100115_ej game.C_100295_kh.field_105299_j
		// @0E2: if_acmpeq @139
		// @0E5: aconst_null
		// @0E6: getstatic game.C_100115_ej game.C_100295_kh.field_105299_j
		// @0E9: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @0EC: if_acmpne @0F7
		// @0EF: goto @0F3
		// @0F2: athrow
		// @0F3: goto @139
		// @0F6: athrow
		// @0F7: getstatic int game.C_100293_kj.field_106890_c
		// @0FA: istore #4
		// @0FC: iload #4
		// @0FE: bipush 105 (0x69)
		// @100: if_icmpeq @133
		// @103: bipush -105 (0x97)
		// @105: iload #4
		// @107: iconst_m1
		// @108: ixor
		// @109: if_icmpeq @133
		// @10C: goto @110
		// @10F: athrow
		// @110: iload #4
		// @112: bipush 98 (0x62)
		// @114: if_icmpne @124
		// @117: goto @11B
		// @11A: athrow
		// @11B: iload #5
		// @11D: ifeq @133
		// @120: goto @124
		// @123: athrow
		// @124: bipush 99 (0x63)
		// @126: iload #4
		// @128: if_icmpne @139
		// @12B: goto @12F
		// @12E: athrow
		// @12F: goto @133
		// @132: athrow
		// @133: getstatic int game.C_100293_kj.field_106890_c
		// @136: putstatic int game.C_100298_ke.field_103218_O
		// @139: aload_0
		// @13A: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @13D: bipush -105 (0x97)
		// @13F: invokevirtual game.C_100333_ij.func_107334_b(byte)void
		// @142: goto @167
		// @145: astore_2
		// @146: aload_2
		// @147: new java.lang.StringBuilder
		// @14A: dup
		// @14B: invokespecial java.lang.StringBuilder.<init>()void
		// @14E: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @151: bipush 76 (0x4C)
		// @153: aaload
		// @154: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @157: iload_1
		// @158: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @15B: bipush 41 (0x29)
		// @15D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @160: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @163: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @166: athrow
		// @167: return
	}
	
	private final void func_104025_d(boolean arg0)
	{
		// @00: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @03: astore_2
		// @04: iload_1
		// @05: iconst_1
		// @06: if_icmpeq @0A
		// @09: return
		// @0A: getstatic java.lang.String game.C_100060_di.field_104270_e
		// @0D: astore_3
		// @0E: aload_2
		// @0F: aload_3
		// @10: sipush 320 (0x0140)
		// @13: sipush 240 (0x00F0)
		// @16: ldc 1021128 (0xf94c8)
		// @18: iconst_m1
		// @19: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @1C: goto @41
		// @1F: astore_2
		// @20: aload_2
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @2B: bipush 85 (0x55)
		// @2D: aaload
		// @2E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @31: iload_1
		// @32: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @35: bipush 41 (0x29)
		// @37: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @40: athrow
		// @41: return
	}
	
	private final void func_103990_e(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore_3
		// @004: getstatic int game.C_100293_kj.field_106890_c
		// @007: bipush 96 (0x60)
		// @009: if_icmpne @054
		// @00C: iconst_m1
		// @00D: aload_0
		// @00E: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @011: getfield int game.C_100333_ij.field_107347_b
		// @014: iconst_m1
		// @015: ixor
		// @016: if_icmple @046
		// @019: goto @01D
		// @01C: athrow
		// @01D: aload_0
		// @01E: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @021: getfield int game.C_100333_ij.field_107347_b
		// @024: iconst_3
		// @025: if_icmpeq @054
		// @028: goto @02C
		// @02B: athrow
		// @02C: aload_0
		// @02D: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @030: aload_0
		// @031: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @034: getfield int game.C_100333_ij.field_107347_b
		// @037: iconst_1
		// @038: isub
		// @039: bipush -126 (0x82)
		// @03B: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @03E: iload_3
		// @03F: ifeq @054
		// @042: goto @046
		// @045: athrow
		// @046: aload_0
		// @047: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @04A: iconst_2
		// @04B: bipush -80 (0xB0)
		// @04D: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @050: goto @054
		// @053: athrow
		// @054: bipush 97 (0x61)
		// @056: getstatic int game.C_100293_kj.field_106890_c
		// @059: if_icmpne @0A2
		// @05C: iconst_2
		// @05D: aload_0
		// @05E: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @061: getfield int game.C_100333_ij.field_107347_b
		// @064: if_icmple @085
		// @067: goto @06B
		// @06A: athrow
		// @06B: aload_0
		// @06C: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @06F: iconst_1
		// @070: aload_0
		// @071: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @074: getfield int game.C_100333_ij.field_107347_b
		// @077: iadd
		// @078: bipush -68 (0xBC)
		// @07A: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @07D: iload_3
		// @07E: ifeq @0A2
		// @081: goto @085
		// @084: athrow
		// @085: iconst_2
		// @086: aload_0
		// @087: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @08A: getfield int game.C_100333_ij.field_107347_b
		// @08D: if_icmpne @0A2
		// @090: goto @094
		// @093: athrow
		// @094: aload_0
		// @095: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @098: iconst_0
		// @099: bipush -124 (0x84)
		// @09B: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @09E: goto @0A2
		// @0A1: athrow
		// @0A2: getstatic int game.C_100293_kj.field_106890_c
		// @0A5: iconst_m1
		// @0A6: ixor
		// @0A7: bipush -100 (0x9C)
		// @0A9: if_icmpeq @0B0
		// @0AC: goto @0EE
		// @0AF: athrow
		// @0B0: aload_0
		// @0B1: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0B4: getfield int game.C_100333_ij.field_107347_b
		// @0B7: iflt @0CC
		// @0BA: bipush -3 (0xFD)
		// @0BC: aload_0
		// @0BD: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0C0: getfield int game.C_100333_ij.field_107347_b
		// @0C3: iconst_m1
		// @0C4: ixor
		// @0C5: if_icmple @0E0
		// @0C8: goto @0CC
		// @0CB: athrow
		// @0CC: aload_0
		// @0CD: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0D0: getstatic int game.C_100025_he.field_103934_b
		// @0D3: bipush -108 (0x94)
		// @0D5: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @0D8: iload_3
		// @0D9: ifeq @0EE
		// @0DC: goto @0E0
		// @0DF: athrow
		// @0E0: aload_0
		// @0E1: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0E4: iconst_3
		// @0E5: bipush -63 (0xC1)
		// @0E7: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @0EA: goto @0EE
		// @0ED: athrow
		// @0EE: getstatic int game.C_100293_kj.field_106890_c
		// @0F1: bipush 98 (0x62)
		// @0F3: if_icmpne @12A
		// @0F6: bipush -4 (0xFC)
		// @0F8: aload_0
		// @0F9: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0FC: getfield int game.C_100333_ij.field_107347_b
		// @0FF: iconst_m1
		// @100: ixor
		// @101: if_icmpne @11C
		// @104: goto @108
		// @107: athrow
		// @108: aload_0
		// @109: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @10C: getstatic int game.C_100025_he.field_103934_b
		// @10F: bipush -79 (0xB1)
		// @111: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @114: iload_3
		// @115: ifeq @12A
		// @118: goto @11C
		// @11B: athrow
		// @11C: aload_0
		// @11D: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @120: iconst_3
		// @121: bipush -48 (0xD0)
		// @123: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @126: goto @12A
		// @129: athrow
		// @12A: aload_0
		// @12B: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @12E: bipush 115 (0x73)
		// @130: invokevirtual game.C_100333_ij.func_107334_b(byte)void
		// @133: iload_1
		// @134: bipush 18 (0x12)
		// @136: if_icmpge @143
		// @139: aload_0
		// @13A: bipush -55 (0xC9)
		// @13C: putfield int game.C_100034_gi.field_104031_b
		// @13F: goto @143
		// @142: athrow
		// @143: goto @168
		// @146: astore_2
		// @147: aload_2
		// @148: new java.lang.StringBuilder
		// @14B: dup
		// @14C: invokespecial java.lang.StringBuilder.<init>()void
		// @14F: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @152: bipush 121 (0x79)
		// @154: aaload
		// @155: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @158: iload_1
		// @159: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @15C: bipush 41 (0x29)
		// @15E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @161: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @164: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @167: athrow
		// @168: return
	}
	
	private final void func_104019_s(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #4
		// @005: iconst_m1
		// @006: istore_2
		// @007: getstatic int game.C_100293_kj.field_106890_c
		// @00A: istore_3
		// @00B: iload_3
		// @00C: bipush 96 (0x60)
		// @00E: if_icmpeq @045
		// @011: iload_3
		// @012: bipush 97 (0x61)
		// @014: if_icmpne @024
		// @017: goto @01B
		// @01A: athrow
		// @01B: iload #4
		// @01D: ifeq @050
		// @020: goto @024
		// @023: athrow
		// @024: iload_3
		// @025: bipush 99 (0x63)
		// @027: if_icmpne @037
		// @02A: goto @02E
		// @02D: athrow
		// @02E: iload #4
		// @030: ifeq @05B
		// @033: goto @037
		// @036: athrow
		// @037: iload_3
		// @038: bipush 98 (0x62)
		// @03A: if_icmpeq @066
		// @03D: goto @041
		// @040: athrow
		// @041: goto @06D
		// @044: athrow
		// @045: aload_0
		// @046: iconst_m1
		// @047: invokespecial game.C_100034_gi.func_103982_p(int)int
		// @04A: istore_2
		// @04B: iload #4
		// @04D: ifeq @06D
		// @050: aload_0
		// @051: iconst_1
		// @052: invokespecial game.C_100034_gi.func_103983_c(boolean)int
		// @055: istore_2
		// @056: iload #4
		// @058: ifeq @06D
		// @05B: aload_0
		// @05C: iconst_2
		// @05D: invokespecial game.C_100034_gi.func_103973_a(int)int
		// @060: istore_2
		// @061: iload #4
		// @063: ifeq @06D
		// @066: aload_0
		// @067: bipush 12 (0x0C)
		// @069: invokespecial game.C_100034_gi.func_104008_n(int)int
		// @06C: istore_2
		// @06D: iconst_0
		// @06E: iload_2
		// @06F: iconst_m1
		// @070: ixor
		// @071: if_icmpeq @07F
		// @074: aload_0
		// @075: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @078: iload_2
		// @079: bipush -43 (0xD5)
		// @07B: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @07E: return
		// @07F: bipush -8 (0xF8)
		// @081: getstatic int game.C_100252_pn.field_105503_o
		// @084: iconst_m1
		// @085: ixor
		// @086: if_icmpne @098
		// @089: aload_0
		// @08A: bipush 8 (0x08)
		// @08C: invokespecial game.C_100034_gi.func_104016_r(int)void
		// @08F: iload #4
		// @091: ifeq @259
		// @094: goto @098
		// @097: athrow
		// @098: getstatic int game.C_100252_pn.field_105503_o
		// @09B: iconst_m1
		// @09C: ixor
		// @09D: bipush -6 (0xFA)
		// @09F: if_icmpne @0B2
		// @0A2: goto @0A6
		// @0A5: athrow
		// @0A6: bipush -25 (0xE7)
		// @0A8: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @0AB: ifeq @24F
		// @0AE: goto @0B2
		// @0B1: athrow
		// @0B2: bipush 6 (0x06)
		// @0B4: getstatic int game.C_100252_pn.field_105503_o
		// @0B7: if_icmpne @0D9
		// @0BA: goto @0BE
		// @0BD: athrow
		// @0BE: bipush -25 (0xE7)
		// @0C0: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @0C3: ifne @0D9
		// @0C6: goto @0CA
		// @0C9: athrow
		// @0CA: aload_0
		// @0CB: bipush -30 (0xE2)
		// @0CD: invokespecial game.C_100034_gi.func_104021_i(int)void
		// @0D0: iload #4
		// @0D2: ifeq @259
		// @0D5: goto @0D9
		// @0D8: athrow
		// @0D9: bipush -15 (0xF1)
		// @0DB: getstatic int game.C_100252_pn.field_105503_o
		// @0DE: iconst_m1
		// @0DF: ixor
		// @0E0: if_icmpne @0F7
		// @0E3: goto @0E7
		// @0E6: athrow
		// @0E7: aload_0
		// @0E8: sipush 150 (0x0096)
		// @0EB: invokespecial game.C_100034_gi.func_103974_m(int)void
		// @0EE: iload #4
		// @0F0: ifeq @259
		// @0F3: goto @0F7
		// @0F6: athrow
		// @0F7: getstatic int game.C_100252_pn.field_105503_o
		// @0FA: iconst_m1
		// @0FB: ixor
		// @0FC: bipush -14 (0xF2)
		// @0FE: if_icmpeq @241
		// @101: goto @105
		// @104: athrow
		// @105: getstatic int game.C_100252_pn.field_105503_o
		// @108: bipush 16 (0x10)
		// @10A: if_icmpne @121
		// @10D: goto @111
		// @110: athrow
		// @111: aload_0
		// @112: sipush 3881 (0x0F29)
		// @115: invokespecial game.C_100034_gi.func_104023_h(int)void
		// @118: iload #4
		// @11A: ifeq @259
		// @11D: goto @121
		// @120: athrow
		// @121: iconst_0
		// @122: getstatic int game.C_100252_pn.field_105503_o
		// @125: if_icmpne @22F
		// @128: goto @12C
		// @12B: athrow
		// @12C: aload_0
		// @12D: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @130: getfield int game.C_100333_ij.field_107347_b
		// @133: iconst_m1
		// @134: ixor
		// @135: iconst_m1
		// @136: if_icmpgt @17B
		// @139: goto @13D
		// @13C: athrow
		// @13D: getstatic int[][] game.C_100012_fh.field_100515_K
		// @140: getstatic int game.C_100252_pn.field_105503_o
		// @143: aaload
		// @144: arraylength
		// @145: aload_0
		// @146: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @149: getfield int game.C_100333_ij.field_107347_b
		// @14C: if_icmple @17B
		// @14F: goto @153
		// @152: athrow
		// @153: getstatic int[][] game.C_100012_fh.field_100515_K
		// @156: getstatic int game.C_100252_pn.field_105503_o
		// @159: aaload
		// @15A: aload_0
		// @15B: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @15E: getfield int game.C_100333_ij.field_107347_b
		// @161: iaload
		// @162: iconst_m1
		// @163: ixor
		// @164: bipush -35 (0xDD)
		// @166: if_icmpeq @17B
		// @169: goto @16D
		// @16C: athrow
		// @16D: aload_0
		// @16E: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @171: getfield int game.C_100333_ij.field_107347_b
		// @174: putstatic int game.C_100043_vl.field_101937_Wb
		// @177: goto @17B
		// @17A: athrow
		// @17B: getstatic int game.C_100293_kj.field_106890_c
		// @17E: iconst_m1
		// @17F: ixor
		// @180: bipush -97 (0x9F)
		// @182: if_icmpne @1D5
		// @185: getstatic int game.C_100212_qc.field_105976_b
		// @188: ifgt @1D5
		// @18B: goto @18F
		// @18E: athrow
		// @18F: iconst_0
		// @190: istore_3
		// @191: getstatic int[][] game.C_100012_fh.field_100515_K
		// @194: getstatic int game.C_100252_pn.field_105503_o
		// @197: aaload
		// @198: arraylength
		// @199: iconst_m1
		// @19A: ixor
		// @19B: iload_3
		// @19C: iconst_m1
		// @19D: ixor
		// @19E: if_icmpge @1D5
		// @1A1: getstatic int[][] game.C_100012_fh.field_100515_K
		// @1A4: getstatic int game.C_100252_pn.field_105503_o
		// @1A7: aaload
		// @1A8: iload_3
		// @1A9: iaload
		// @1AA: iconst_m1
		// @1AB: ixor
		// @1AC: bipush -35 (0xDD)
		// @1AE: iload #4
		// @1B0: ifne @1DC
		// @1B3: if_icmpne @1CD
		// @1B6: goto @1BA
		// @1B9: athrow
		// @1BA: aload_0
		// @1BB: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @1BE: getfield int game.C_100333_ij.field_107347_b
		// @1C1: putstatic int game.C_100043_vl.field_101937_Wb
		// @1C4: aload_0
		// @1C5: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @1C8: iload_3
		// @1C9: putfield int game.C_100333_ij.field_107347_b
		// @1CC: return
		// @1CD: iinc #3 +1
		// @1D0: iload #4
		// @1D2: ifeq @191
		// @1D5: getstatic int game.C_100293_kj.field_106890_c
		// @1D8: iconst_m1
		// @1D9: ixor
		// @1DA: bipush -98 (0x9E)
		// @1DC: if_icmpeq @1E2
		// @1DF: goto @21F
		// @1E2: aload_0
		// @1E3: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @1E6: getfield int game.C_100333_ij.field_107347_b
		// @1E9: istore_3
		// @1EA: iload_3
		// @1EB: iflt @21F
		// @1EE: iload_3
		// @1EF: iconst_m1
		// @1F0: ixor
		// @1F1: getstatic int[][] game.C_100012_fh.field_100515_K
		// @1F4: getstatic int game.C_100252_pn.field_105503_o
		// @1F7: aaload
		// @1F8: arraylength
		// @1F9: iconst_m1
		// @1FA: ixor
		// @1FB: if_icmple @21F
		// @1FE: goto @202
		// @201: athrow
		// @202: getstatic int[][] game.C_100012_fh.field_100515_K
		// @205: getstatic int game.C_100252_pn.field_105503_o
		// @208: aaload
		// @209: iload_3
		// @20A: iaload
		// @20B: bipush 34 (0x22)
		// @20D: if_icmpne @21F
		// @210: goto @214
		// @213: athrow
		// @214: aload_0
		// @215: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @218: getstatic int game.C_100043_vl.field_101937_Wb
		// @21B: putfield int game.C_100333_ij.field_107347_b
		// @21E: return
		// @21F: aload_0
		// @220: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @223: iload_1
		// @224: bipush -40 (0xD8)
		// @226: ixor
		// @227: invokevirtual game.C_100333_ij.func_107328_a(int)void
		// @22A: iload #4
		// @22C: ifeq @259
		// @22F: aload_0
		// @230: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @233: bipush -122 (0x86)
		// @235: invokevirtual game.C_100333_ij.func_107328_a(int)void
		// @238: iload #4
		// @23A: ifeq @259
		// @23D: goto @241
		// @240: athrow
		// @241: aload_0
		// @242: iconst_0
		// @243: invokespecial game.C_100034_gi.func_104004_a(boolean)void
		// @246: iload #4
		// @248: ifeq @259
		// @24B: goto @24F
		// @24E: athrow
		// @24F: aload_0
		// @250: bipush 87 (0x57)
		// @252: invokespecial game.C_100034_gi.func_103990_e(int)void
		// @255: goto @259
		// @258: athrow
		// @259: iload_1
		// @25A: bipush 99 (0x63)
		// @25C: if_icmpeq @269
		// @25F: aload_0
		// @260: bipush 13 (0x0D)
		// @262: invokespecial game.C_100034_gi.func_103974_m(int)void
		// @265: goto @269
		// @268: athrow
		// @269: goto @28E
		// @26C: astore_2
		// @26D: aload_2
		// @26E: new java.lang.StringBuilder
		// @271: dup
		// @272: invokespecial java.lang.StringBuilder.<init>()void
		// @275: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @278: bipush 36 (0x24)
		// @27A: aaload
		// @27B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27E: iload_1
		// @27F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @282: bipush 41 (0x29)
		// @284: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @287: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @28A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @28D: athrow
		// @28E: return
	}
	
	private final int func_103978_l(int arg0)
	{
		// @00: aload_0
		// @01: getfield int game.C_100034_gi.field_104030_e
		// @04: iconst_m1
		// @05: ixor
		// @06: iconst_m1
		// @07: if_icmpne @11
		// @0A: getstatic game.C_100251_pm game.C_100114_q.field_100495_x
		// @0D: getfield int game.C_100251_pm.field_102340_z
		// @10: ireturn
		// @11: iload_1
		// @12: sipush -21394 (0xAC6E)
		// @15: if_icmpeq @1B
		// @18: bipush -52 (0xCC)
		// @1A: ireturn
		// @1B: bipush 37 (0x25)
		// @1D: ireturn
		// @1E: astore_2
		// @1F: aload_2
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @2A: bipush 75 (0x4B)
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: iload_1
		// @31: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34: bipush 41 (0x29)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F: athrow
	}
	
	private final void func_103981_j(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #12
		// @005: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @008: astore_2
		// @009: bipush 40 (0x28)
		// @00B: bipush 80 (0x50)
		// @00D: sipush 560 (0x0230)
		// @010: sipush 330 (0x014A)
		// @013: ldc_w 3487029 (0x353535)
		// @016: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @019: bipush 41 (0x29)
		// @01B: bipush 81 (0x51)
		// @01D: sipush 558 (0x022E)
		// @020: sipush 328 (0x0148)
		// @023: ldc_w 3487029 (0x353535)
		// @026: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @029: bipush -25 (0xE7)
		// @02B: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @02E: ifeq @037
		// @031: aload_0
		// @032: iconst_1
		// @033: invokespecial game.C_100034_gi.func_103993_b(boolean)void
		// @036: return
		// @037: aconst_null
		// @038: getstatic game.C_100346_ja game.C_100126_cb.field_103062_t
		// @03B: if_acmpeq @042
		// @03E: goto @04E
		// @041: athrow
		// @042: iconst_0
		// @043: iconst_0
		// @044: bipush 10 (0x0A)
		// @046: bipush 7 (0x07)
		// @048: invokestatic game.C_100044_vm.func_100932_a(boolean, int, int, int)game.C_100346_ja
		// @04B: putstatic game.C_100346_ja game.C_100126_cb.field_103062_t
		// @04E: ldc 1021128 (0xf94c8)
		// @050: istore_3
		// @051: bipush 105 (0x69)
		// @053: istore #4
		// @055: getstatic int[] game.C_100093_fd.field_102784_P
		// @058: iconst_5
		// @059: iaload
		// @05A: iconst_m1
		// @05B: ixor
		// @05C: iconst_m1
		// @05D: if_icmpne @0AF
		// @060: aload_2
		// @061: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @064: bipush 61 (0x3D)
		// @066: aaload
		// @067: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @06A: istore #5
		// @06C: iconst_5
		// @06D: istore #6
		// @06F: iconst_0
		// @070: iload #6
		// @072: if_icmpge @0AF
		// @075: bipush 8 (0x08)
		// @077: aload_2
		// @078: getstatic java.lang.String[] game.C_100059_df.field_101597_B
		// @07B: iload #6
		// @07D: aaload
		// @07E: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @081: iadd
		// @082: istore #7
		// @084: iload #7
		// @086: iload #5
		// @088: invokestatic java.lang.Math.max(int, int)int
		// @08B: istore #7
		// @08D: getstatic int[] game.C_100093_fd.field_102784_P
		// @090: iload #6
		// @092: getstatic int[] game.C_100093_fd.field_102784_P
		// @095: iload #6
		// @097: iconst_m1
		// @098: isub
		// @099: iaload
		// @09A: iload #7
		// @09C: isub
		// @09D: iastore
		// @09E: iinc #6 +255
		// @0A1: iload #12
		// @0A3: ifne @0C0
		// @0A6: iload #12
		// @0A8: ifeq @06F
		// @0AB: goto @0AF
		// @0AE: athrow
		// @0AF: iload_1
		// @0B0: sipush 20834 (0x5162)
		// @0B3: if_icmpeq @0C0
		// @0B6: aload_0
		// @0B7: iconst_0
		// @0B8: invokespecial game.C_100034_gi.func_103983_c(boolean)int
		// @0BB: pop
		// @0BC: goto @0C0
		// @0BF: athrow
		// @0C0: getstatic game.C_100346_ja game.C_100126_cb.field_103062_t
		// @0C3: getfield boolean game.C_100346_ja.field_103499_x
		// @0C6: ifeq @290
		// @0C9: aconst_null
		// @0CA: getstatic game.C_100346_ja game.C_100126_cb.field_103062_t
		// @0CD: getfield java.lang.String[][] game.C_100346_ja.field_103480_A
		// @0D0: if_acmpne @0E1
		// @0D3: goto @0D7
		// @0D6: athrow
		// @0D7: getstatic java.lang.String game.C_100332_ii.field_107314_n
		// @0DA: astore #5
		// @0DC: iload #12
		// @0DE: ifeq @295
		// @0E1: getstatic java.lang.String game.SteelSentinels.field_105272_L
		// @0E4: astore #5
		// @0E6: getstatic game.C_100346_ja game.C_100126_cb.field_103062_t
		// @0E9: getfield java.lang.String[][] game.C_100346_ja.field_103480_A
		// @0EC: getstatic int game.C_100118_ub.field_102054_Wb
		// @0EF: aaload
		// @0F0: astore #6
		// @0F2: getstatic game.C_100346_ja game.C_100126_cb.field_103062_t
		// @0F5: getfield int[][] game.C_100346_ja.field_103495_q
		// @0F8: getstatic int game.C_100118_ub.field_102054_Wb
		// @0FB: aaload
		// @0FC: astore #7
		// @0FE: bipush 48 (0x30)
		// @100: bipush 88 (0x58)
		// @102: sipush 544 (0x0220)
		// @105: sipush 286 (0x011E)
		// @108: ldc 1130327 (0x113f57)
		// @10A: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @10D: bipush 48 (0x30)
		// @10F: bipush 109 (0x6D)
		// @111: sipush 544 (0x0220)
		// @114: ldc 1130327 (0x113f57)
		// @116: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @119: iconst_1
		// @11A: istore #8
		// @11C: iload #8
		// @11E: getstatic int[] game.C_100093_fd.field_102784_P
		// @121: arraylength
		// @122: iconst_m1
		// @123: iadd
		// @124: if_icmpge @148
		// @127: getstatic int[] game.C_100093_fd.field_102784_P
		// @12A: iload #8
		// @12C: iaload
		// @12D: bipush 88 (0x58)
		// @12F: sipush 286 (0x011E)
		// @132: ldc 1130327 (0x113f57)
		// @134: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @137: iinc #8 +1
		// @13A: iload #12
		// @13C: ifne @1D7
		// @13F: iload #12
		// @141: ifeq @11C
		// @144: goto @148
		// @147: athrow
		// @148: aload_2
		// @149: getstatic java.lang.String[] game.C_100059_df.field_101597_B
		// @14C: iconst_0
		// @14D: aaload
		// @14E: iconst_2
		// @14F: getstatic int[] game.C_100093_fd.field_102784_P
		// @152: iconst_0
		// @153: iaload
		// @154: iadd
		// @155: iload #4
		// @157: iload_3
		// @158: iconst_m1
		// @159: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @15C: aload_2
		// @15D: getstatic java.lang.String[] game.C_100059_df.field_101597_B
		// @160: iconst_1
		// @161: aaload
		// @162: bipush -2 (0xFE)
		// @164: getstatic int[] game.C_100093_fd.field_102784_P
		// @167: iconst_2
		// @168: iaload
		// @169: iadd
		// @16A: iconst_m1
		// @16B: iadd
		// @16C: iload #4
		// @16E: iload_3
		// @16F: iconst_m1
		// @170: invokevirtual game.C_100112_r.func_101746_a(java.lang.String, int, int, int, int)void
		// @173: aload_2
		// @174: getstatic java.lang.String[] game.C_100059_df.field_101597_B
		// @177: iconst_2
		// @178: aaload
		// @179: bipush -2 (0xFE)
		// @17B: getstatic int[] game.C_100093_fd.field_102784_P
		// @17E: iconst_3
		// @17F: iaload
		// @180: iconst_m1
		// @181: iadd
		// @182: iadd
		// @183: iload #4
		// @185: iload_3
		// @186: iconst_m1
		// @187: invokevirtual game.C_100112_r.func_101746_a(java.lang.String, int, int, int, int)void
		// @18A: aload_2
		// @18B: getstatic java.lang.String[] game.C_100059_df.field_101597_B
		// @18E: iconst_3
		// @18F: aaload
		// @190: getstatic int[] game.C_100093_fd.field_102784_P
		// @193: iconst_4
		// @194: iaload
		// @195: bipush -2 (0xFE)
		// @197: iadd
		// @198: iconst_1
		// @199: isub
		// @19A: iload #4
		// @19C: iload_3
		// @19D: iconst_m1
		// @19E: invokevirtual game.C_100112_r.func_101746_a(java.lang.String, int, int, int, int)void
		// @1A1: aload_2
		// @1A2: getstatic java.lang.String[] game.C_100059_df.field_101597_B
		// @1A5: iconst_4
		// @1A6: aaload
		// @1A7: bipush -2 (0xFE)
		// @1A9: getstatic int[] game.C_100093_fd.field_102784_P
		// @1AC: iconst_5
		// @1AD: iaload
		// @1AE: iadd
		// @1AF: iconst_m1
		// @1B0: iadd
		// @1B1: iload #4
		// @1B3: iload_3
		// @1B4: iconst_m1
		// @1B5: invokevirtual game.C_100112_r.func_101746_a(java.lang.String, int, int, int, int)void
		// @1B8: aload_2
		// @1B9: getstatic java.lang.String[] game.C_100059_df.field_101597_B
		// @1BC: iconst_5
		// @1BD: aaload
		// @1BE: bipush -2 (0xFE)
		// @1C0: getstatic int[] game.C_100093_fd.field_102784_P
		// @1C3: bipush 6 (0x06)
		// @1C5: iaload
		// @1C6: iconst_m1
		// @1C7: iadd
		// @1C8: iadd
		// @1C9: iload #4
		// @1CB: iload_3
		// @1CC: iconst_m1
		// @1CD: invokevirtual game.C_100112_r.func_101746_a(java.lang.String, int, int, int, int)void
		// @1D0: bipush 126 (0x7E)
		// @1D2: istore #4
		// @1D4: iconst_0
		// @1D5: istore #8
		// @1D7: iconst_0
		// @1D8: istore #9
		// @1DA: bipush 10 (0x0A)
		// @1DC: iload #9
		// @1DE: if_icmple @25A
		// @1E1: iload #12
		// @1E3: ifne @28B
		// @1E6: aconst_null
		// @1E7: aload #6
		// @1E9: iload #9
		// @1EB: aaload
		// @1EC: if_acmpeq @24F
		// @1EF: goto @1F3
		// @1F2: athrow
		// @1F3: ldc 1021128 (0xf94c8)
		// @1F5: istore_3
		// @1F6: aload #6
		// @1F8: iload #9
		// @1FA: aaload
		// @1FB: astore #10
		// @1FD: aload #10
		// @1FF: sipush -7290 (0xE386)
		// @202: invokestatic game.C_100050_vg.func_100621_a(java.lang.String, int)boolean
		// @205: istore #11
		// @207: ldc_w ""
		// @20A: astore #5
		// @20C: iload #11
		// @20E: ifne @215
		// @211: goto @21B
		// @214: athrow
		// @215: iconst_1
		// @216: istore #8
		// @218: ldc 1044724 (0xff0f4)
		// @21A: istore_3
		// @21B: aload_0
		// @21C: aload #10
		// @21E: aload #7
		// @220: iconst_4
		// @221: iload #9
		// @223: imul
		// @224: bipush -2 (0xFE)
		// @226: isub
		// @227: iaload
		// @228: iload #9
		// @22A: aload #7
		// @22C: iconst_4
		// @22D: iload #9
		// @22F: imul
		// @230: iconst_3
		// @231: iadd
		// @232: iaload
		// @233: iload_1
		// @234: sipush -20835 (0xAE9D)
		// @237: ixor
		// @238: aload #7
		// @23A: iload #9
		// @23C: iconst_4
		// @23D: imul
		// @23E: iconst_m1
		// @23F: isub
		// @240: iaload
		// @241: aload #7
		// @243: iconst_4
		// @244: iload #9
		// @246: imul
		// @247: iaload
		// @248: iload #11
		// @24A: iload #4
		// @24C: invokespecial game.C_100034_gi.func_104000_a(java.lang.String, int, int, int, int, int, int, boolean, int)void
		// @24F: iinc #4 +17
		// @252: iinc #9 +1
		// @255: iload #12
		// @257: ifeq @1DA
		// @25A: iload #8
		// @25C: ifne @28B
		// @25F: sipush 369 (0x0171)
		// @262: istore #4
		// @264: ldc 1021128 (0xf94c8)
		// @266: istore_3
		// @267: aload_0
		// @268: getstatic java.lang.String game.C_100339_jb.field_107391_h
		// @26B: getstatic game.C_100346_ja game.C_100126_cb.field_103062_t
		// @26E: getfield int game.C_100346_ja.field_103492_t
		// @271: iconst_m1
		// @272: getstatic game.C_100346_ja game.C_100126_cb.field_103062_t
		// @275: getfield int game.C_100346_ja.field_103483_n
		// @278: iconst_m1
		// @279: getstatic game.C_100346_ja game.C_100126_cb.field_103062_t
		// @27C: getfield int game.C_100346_ja.field_103494_r
		// @27F: getstatic game.C_100346_ja game.C_100126_cb.field_103062_t
		// @282: getfield int game.C_100346_ja.field_103484_o
		// @285: iconst_1
		// @286: iload #4
		// @288: invokespecial game.C_100034_gi.func_104000_a(java.lang.String, int, int, int, int, int, int, boolean, int)void
		// @28B: iload #12
		// @28D: ifeq @295
		// @290: getstatic java.lang.String game.C_100306_kn.field_107139_j
		// @293: astore #5
		// @295: sipush 231 (0x00E7)
		// @298: istore #4
		// @29A: aload_2
		// @29B: aload #5
		// @29D: sipush 320 (0x0140)
		// @2A0: iload #4
		// @2A2: ldc 1021128 (0xf94c8)
		// @2A4: iconst_m1
		// @2A5: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @2A8: goto @2CD
		// @2AB: astore_2
		// @2AC: aload_2
		// @2AD: new java.lang.StringBuilder
		// @2B0: dup
		// @2B1: invokespecial java.lang.StringBuilder.<init>()void
		// @2B4: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @2B7: bipush 60 (0x3C)
		// @2B9: aaload
		// @2BA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2BD: iload_1
		// @2BE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2C1: bipush 41 (0x29)
		// @2C3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2C9: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2CC: athrow
		// @2CD: return
	}
	
	private final int func_103984_a(int arg0, int arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: bipush -2 (0xFE)
		// @007: iload_3
		// @008: iconst_m1
		// @009: ixor
		// @00A: if_icmplt @01A
		// @00D: iconst_2
		// @00E: iload_3
		// @00F: if_icmplt @01A
		// @012: goto @016
		// @015: athrow
		// @016: goto @01C
		// @019: athrow
		// @01A: iconst_m1
		// @01B: ireturn
		// @01C: iload_2
		// @01D: bipush 53 (0x35)
		// @01F: if_icmpge @025
		// @022: bipush -78 (0xB2)
		// @024: ireturn
		// @025: iload_3
		// @026: iconst_m1
		// @027: ixor
		// @028: bipush -2 (0xFE)
		// @02A: if_icmpeq @0D8
		// @02D: iload_1
		// @02E: istore #4
		// @030: iload #4
		// @032: ifeq @0BB
		// @035: iconst_1
		// @036: iload #4
		// @038: if_icmpne @048
		// @03B: goto @03F
		// @03E: athrow
		// @03F: iload #5
		// @041: ifeq @0BD
		// @044: goto @048
		// @047: athrow
		// @048: iload #4
		// @04A: iconst_m1
		// @04B: ixor
		// @04C: bipush -3 (0xFD)
		// @04E: if_icmpne @05E
		// @051: goto @055
		// @054: athrow
		// @055: iload #5
		// @057: ifeq @0C0
		// @05A: goto @05E
		// @05D: athrow
		// @05E: iload #4
		// @060: iconst_m1
		// @061: ixor
		// @062: bipush -4 (0xFC)
		// @064: if_icmpeq @0C3
		// @067: goto @06B
		// @06A: athrow
		// @06B: iconst_4
		// @06C: iload #4
		// @06E: if_icmpeq @0C6
		// @071: goto @075
		// @074: athrow
		// @075: bipush -6 (0xFA)
		// @077: iload #4
		// @079: iconst_m1
		// @07A: ixor
		// @07B: if_icmpeq @0C9
		// @07E: goto @082
		// @081: athrow
		// @082: bipush 6 (0x06)
		// @084: iload #4
		// @086: if_icmpeq @0CC
		// @089: goto @08D
		// @08C: athrow
		// @08D: iload #4
		// @08F: iconst_m1
		// @090: ixor
		// @091: bipush -8 (0xF8)
		// @093: if_icmpeq @0CF
		// @096: goto @09A
		// @099: athrow
		// @09A: bipush 8 (0x08)
		// @09C: iload #4
		// @09E: if_icmpeq @0D2
		// @0A1: goto @0A5
		// @0A4: athrow
		// @0A5: iload #4
		// @0A7: iconst_m1
		// @0A8: ixor
		// @0A9: bipush -10 (0xF6)
		// @0AB: if_icmpne @17A
		// @0AE: goto @0B2
		// @0B1: athrow
		// @0B2: iload #5
		// @0B4: ifeq @0D5
		// @0B7: goto @0BB
		// @0BA: athrow
		// @0BB: iconst_5
		// @0BC: ireturn
		// @0BD: bipush 7 (0x07)
		// @0BF: ireturn
		// @0C0: bipush 7 (0x07)
		// @0C2: ireturn
		// @0C3: bipush 7 (0x07)
		// @0C5: ireturn
		// @0C6: bipush 7 (0x07)
		// @0C8: ireturn
		// @0C9: bipush 7 (0x07)
		// @0CB: ireturn
		// @0CC: bipush 10 (0x0A)
		// @0CE: ireturn
		// @0CF: bipush 7 (0x07)
		// @0D1: ireturn
		// @0D2: bipush 10 (0x0A)
		// @0D4: ireturn
		// @0D5: bipush 7 (0x07)
		// @0D7: ireturn
		// @0D8: iload_1
		// @0D9: istore #4
		// @0DB: iload #4
		// @0DD: iconst_m1
		// @0DE: ixor
		// @0DF: iconst_m1
		// @0E0: if_icmpeq @161
		// @0E3: bipush -2 (0xFE)
		// @0E5: iload #4
		// @0E7: iconst_m1
		// @0E8: ixor
		// @0E9: if_icmpne @0F9
		// @0EC: goto @0F0
		// @0EF: athrow
		// @0F0: iload #5
		// @0F2: ifeq @163
		// @0F5: goto @0F9
		// @0F8: athrow
		// @0F9: iload #4
		// @0FB: iconst_2
		// @0FC: if_icmpeq @166
		// @0FF: goto @103
		// @102: athrow
		// @103: iconst_3
		// @104: iload #4
		// @106: if_icmpeq @169
		// @109: goto @10D
		// @10C: athrow
		// @10D: iload #4
		// @10F: iconst_m1
		// @110: ixor
		// @111: bipush -5 (0xFB)
		// @113: if_icmpeq @16C
		// @116: goto @11A
		// @119: athrow
		// @11A: iconst_5
		// @11B: iload #4
		// @11D: if_icmpeq @16E
		// @120: goto @124
		// @123: athrow
		// @124: iload #4
		// @126: iconst_m1
		// @127: ixor
		// @128: bipush -7 (0xF9)
		// @12A: if_icmpeq @170
		// @12D: goto @131
		// @130: athrow
		// @131: iload #4
		// @133: iconst_m1
		// @134: ixor
		// @135: bipush -8 (0xF8)
		// @137: if_icmpeq @172
		// @13A: goto @13E
		// @13D: athrow
		// @13E: bipush -9 (0xF7)
		// @140: iload #4
		// @142: iconst_m1
		// @143: ixor
		// @144: if_icmpeq @175
		// @147: goto @14B
		// @14A: athrow
		// @14B: iload #4
		// @14D: iconst_m1
		// @14E: ixor
		// @14F: bipush -10 (0xF6)
		// @151: if_icmpne @17A
		// @154: goto @158
		// @157: athrow
		// @158: iload #5
		// @15A: ifeq @177
		// @15D: goto @161
		// @160: athrow
		// @161: iconst_3
		// @162: ireturn
		// @163: bipush 6 (0x06)
		// @165: ireturn
		// @166: bipush 9 (0x09)
		// @168: ireturn
		// @169: bipush 9 (0x09)
		// @16B: ireturn
		// @16C: iconst_3
		// @16D: ireturn
		// @16E: iconst_5
		// @16F: ireturn
		// @170: iconst_5
		// @171: ireturn
		// @172: bipush 9 (0x09)
		// @174: ireturn
		// @175: iconst_5
		// @176: ireturn
		// @177: bipush 7 (0x07)
		// @179: ireturn
		// @17A: iconst_0
		// @17B: ireturn
		// @17C: astore #4
		// @17E: aload #4
		// @180: new java.lang.StringBuilder
		// @183: dup
		// @184: invokespecial java.lang.StringBuilder.<init>()void
		// @187: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @18A: bipush 47 (0x2F)
		// @18C: aaload
		// @18D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @190: iload_1
		// @191: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @194: bipush 44 (0x2C)
		// @196: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @199: iload_2
		// @19A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @19D: bipush 44 (0x2C)
		// @19F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1A2: iload_3
		// @1A3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1A6: bipush 41 (0x29)
		// @1A8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1AB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1AE: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1B1: athrow
	}
	
	private final void func_104012_d(byte arg0)
	{
		// @00: iload_1
		// @01: bipush -89 (0xA7)
		// @03: if_icmpeq @12
		// @06: aload_0
		// @07: aconst_null
		// @08: checkcast game.C_100333_ij
		// @0B: putfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0E: goto @12
		// @11: athrow
		// @12: aconst_null
		// @13: getstatic game.C_100102_w game.C_100034_gi.field_104028_g
		// @16: if_acmpeq @1D
		// @19: goto @1E
		// @1C: athrow
		// @1D: return
		// @1E: getstatic game.C_100102_w game.C_100034_gi.field_104028_g
		// @21: bipush -104 (0x98)
		// @23: invokevirtual game.C_100102_w.func_104630_b(byte)void
		// @26: goto @4B
		// @29: astore_2
		// @2A: aload_2
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @35: bipush 103 (0x67)
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_1
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 41 (0x29)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @47: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4A: athrow
		// @4B: return
	}
	
	final void func_104009_e(byte arg0)
	{
		// @00: bipush -7 (0xF9)
		// @02: aload_0
		// @03: getfield int game.C_100034_gi.field_104030_e
		// @06: iconst_m1
		// @07: ixor
		// @08: if_icmpne @13
		// @0B: aconst_null
		// @0C: putstatic game.C_100346_ja game.C_100126_cb.field_103062_t
		// @0F: goto @13
		// @12: athrow
		// @13: iload_1
		// @14: bipush 93 (0x5D)
		// @16: if_icmpeq @23
		// @19: aload_0
		// @1A: iconst_1
		// @1B: invokespecial game.C_100034_gi.func_103983_c(boolean)int
		// @1E: pop
		// @1F: goto @23
		// @22: athrow
		// @23: aload_0
		// @24: getfield int game.C_100034_gi.field_104030_e
		// @27: iconst_m1
		// @28: ixor
		// @29: bipush -6 (0xFA)
		// @2B: if_icmpne @36
		// @2E: aconst_null
		// @2F: putstatic game.C_100187_rk game.C_100111_el.field_104864_a
		// @32: goto @36
		// @35: athrow
		// @36: goto @5B
		// @39: astore_2
		// @3A: aload_2
		// @3B: new java.lang.StringBuilder
		// @3E: dup
		// @3F: invokespecial java.lang.StringBuilder.<init>()void
		// @42: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @45: bipush 120 (0x78)
		// @47: aaload
		// @48: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4B: iload_1
		// @4C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4F: bipush 41 (0x29)
		// @51: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @54: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @57: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5A: athrow
		// @5B: return
	}
	
	private final boolean func_104003_a(int arg0, byte arg1)
	{
		// @00: iload_2
		// @01: bipush -50 (0xCE)
		// @03: if_icmplt @10
		// @06: aload_0
		// @07: bipush 64 (0x40)
		// @09: putfield int game.C_100034_gi.field_104037_k
		// @0C: goto @10
		// @0F: athrow
		// @10: iconst_1
		// @11: ireturn
		// @12: astore_3
		// @13: aload_3
		// @14: new java.lang.StringBuilder
		// @17: dup
		// @18: invokespecial java.lang.StringBuilder.<init>()void
		// @1B: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @1E: iconst_0
		// @1F: aaload
		// @20: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23: iload_1
		// @24: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @27: bipush 44 (0x2C)
		// @29: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C: iload_2
		// @2D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @30: bipush 41 (0x29)
		// @32: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @35: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @38: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3B: athrow
	}
	
	final void func_103979_f(byte arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: iconst_0
		// @006: getstatic int game.C_100043_vl.field_101943_Yb
		// @009: if_icmplt @010
		// @00C: goto @018
		// @00F: athrow
		// @010: getstatic int game.C_100043_vl.field_101943_Yb
		// @013: iconst_1
		// @014: isub
		// @015: putstatic int game.C_100043_vl.field_101943_Yb
		// @018: getstatic boolean game.C_100197_ra.field_100862_w
		// @01B: ifeq @036
		// @01E: bipush -25 (0xE7)
		// @020: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @023: ifne @036
		// @026: goto @02A
		// @029: athrow
		// @02A: aconst_null
		// @02B: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @02E: iconst_0
		// @02F: putstatic boolean game.C_100197_ra.field_100862_w
		// @032: goto @036
		// @035: athrow
		// @036: bipush 21 (0x15)
		// @038: aload_0
		// @039: getfield int game.C_100034_gi.field_104030_e
		// @03C: if_icmpeq @043
		// @03F: goto @0CC
		// @042: athrow
		// @043: getstatic game.C_100146_bf game.C_100300_kc.field_107069_e
		// @046: astore_2
		// @047: aload_2
		// @048: iconst_m1
		// @049: invokestatic game.C_100230_of.func_106202_b(int)boolean
		// @04C: ifne @062
		// @04F: aload_0
		// @050: getfield int game.C_100034_gi.field_104030_e
		// @053: getstatic int game.C_100050_vg.field_100632_k
		// @056: if_icmpne @062
		// @059: goto @05D
		// @05C: athrow
		// @05D: iconst_1
		// @05E: goto @063
		// @061: athrow
		// @062: iconst_0
		// @063: bipush 31 (0x1F)
		// @065: invokevirtual game.C_100146_bf.func_105112_a(boolean, byte)int
		// @068: istore_3
		// @069: bipush -4 (0xFC)
		// @06B: iload_3
		// @06C: iconst_m1
		// @06D: ixor
		// @06E: if_icmpeq @0CC
		// @071: bipush -2 (0xFE)
		// @073: iload_3
		// @074: iconst_m1
		// @075: ixor
		// @076: if_icmpeq @086
		// @079: goto @07D
		// @07C: athrow
		// @07D: iconst_2
		// @07E: iload_3
		// @07F: if_icmpne @0CC
		// @082: goto @086
		// @085: athrow
		// @086: bipush -3 (0xFD)
		// @088: iload_3
		// @089: iconst_m1
		// @08A: ixor
		// @08B: if_icmpne @097
		// @08E: goto @092
		// @091: athrow
		// @092: iconst_1
		// @093: goto @098
		// @096: athrow
		// @097: iconst_0
		// @098: istore #4
		// @09A: getstatic int game.C_100050_vg.field_100632_k
		// @09D: istore #5
		// @09F: iconst_5
		// @0A0: iload #5
		// @0A2: if_icmpeq @0BD
		// @0A5: bipush 6 (0x06)
		// @0A7: iload #5
		// @0A9: if_icmpeq @0BD
		// @0AC: goto @0B0
		// @0AF: athrow
		// @0B0: bipush -9 (0xF7)
		// @0B2: iload #5
		// @0B4: iconst_m1
		// @0B5: ixor
		// @0B6: if_icmpne @0C2
		// @0B9: goto @0BD
		// @0BC: athrow
		// @0BD: getstatic int game.C_100069_vb.field_104357_e
		// @0C0: istore #5
		// @0C2: iload #4
		// @0C4: iconst_0
		// @0C5: bipush -122 (0x86)
		// @0C7: iload #5
		// @0C9: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @0CC: aload_0
		// @0CD: bipush 121 (0x79)
		// @0CF: invokespecial game.C_100034_gi.func_103976_d(int)boolean
		// @0D2: ifeq @0D9
		// @0D5: goto @41D
		// @0D8: athrow
		// @0D9: getstatic int game.C_100075_uj.field_100647_n
		// @0DC: iconst_m1
		// @0DD: if_icmpeq @1D9
		// @0E0: iconst_1
		// @0E1: getstatic int game.C_100102_w.field_104636_c
		// @0E4: if_icmpne @1D9
		// @0E7: goto @0EB
		// @0EA: athrow
		// @0EB: iconst_m1
		// @0EC: getstatic int game.C_100067_vd.field_104324_i
		// @0EF: iconst_m1
		// @0F0: ixor
		// @0F1: if_icmpne @1A9
		// @0F4: goto @0F8
		// @0F7: athrow
		// @0F8: bipush -25 (0xE7)
		// @0FA: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @0FD: ifeq @108
		// @100: goto @104
		// @103: athrow
		// @104: goto @1A9
		// @107: athrow
		// @108: getstatic int game.C_100075_uj.field_100647_n
		// @10B: sipush 128 (0x0080)
		// @10E: if_icmpge @160
		// @111: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @114: bipush 66 (0x42)
		// @116: bipush 118 (0x76)
		// @118: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @11B: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @11E: sipush 7838 (0x1E9E)
		// @121: iconst_1
		// @122: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @125: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @128: sipush 7838 (0x1E9E)
		// @12B: getstatic int game.C_100075_uj.field_100647_n
		// @12E: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @131: iconst_0
		// @132: istore_2
		// @133: getstatic int[] game.C_100074_g.field_104410_e
		// @136: arraylength
		// @137: iconst_m1
		// @138: ixor
		// @139: iload_2
		// @13A: iconst_m1
		// @13B: ixor
		// @13C: if_icmpge @156
		// @13F: getstatic int[] game.C_100074_g.field_104410_e
		// @142: iload_2
		// @143: iconst_0
		// @144: iastore
		// @145: iinc #2 +1
		// @148: iload #6
		// @14A: ifne @15B
		// @14D: iload #6
		// @14F: ifeq @133
		// @152: goto @156
		// @155: athrow
		// @156: bipush -64 (0xC0)
		// @158: invokestatic game.C_100203_ql.func_105921_a(int)void
		// @15B: iload #6
		// @15D: ifeq @1A9
		// @160: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @163: bipush 66 (0x42)
		// @165: bipush 118 (0x76)
		// @167: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @16A: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @16D: sipush 7838 (0x1E9E)
		// @170: iconst_0
		// @171: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @174: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @177: sipush 7838 (0x1E9E)
		// @17A: bipush -128 (0x80)
		// @17C: getstatic int game.C_100075_uj.field_100647_n
		// @17F: iadd
		// @180: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @183: iconst_0
		// @184: istore_2
		// @185: iload_2
		// @186: getstatic int[] game.C_100074_g.field_104410_e
		// @189: arraylength
		// @18A: if_icmpge @1A4
		// @18D: getstatic int[] game.C_100074_g.field_104410_e
		// @190: iload_2
		// @191: iconst_0
		// @192: iastore
		// @193: iinc #2 +1
		// @196: iload #6
		// @198: ifne @1A9
		// @19B: iload #6
		// @19D: ifeq @185
		// @1A0: goto @1A4
		// @1A3: athrow
		// @1A4: bipush -45 (0xD3)
		// @1A6: invokestatic game.C_100203_ql.func_105921_a(int)void
		// @1A9: getstatic int game.C_100067_vd.field_104324_i
		// @1AC: iconst_m1
		// @1AD: ixor
		// @1AE: iconst_m1
		// @1AF: if_icmpgt @1D9
		// @1B2: bipush 95 (0x5F)
		// @1B4: bipush 8 (0x08)
		// @1B6: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @1B9: iconst_m1
		// @1BA: putstatic int game.C_100067_vd.field_104324_i
		// @1BD: iconst_m1
		// @1BE: putstatic int game.C_100075_uj.field_100647_n
		// @1C1: iconst_0
		// @1C2: putstatic int game.C_100102_w.field_104636_c
		// @1C5: iconst_1
		// @1C6: putstatic boolean game.C_100034_gi.field_104029_d
		// @1C9: iconst_1
		// @1CA: putstatic boolean game.C_100309_lk.field_103271_ab
		// @1CD: aconst_null
		// @1CE: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @1D1: aconst_null
		// @1D2: putstatic game.C_100037_wb game.C_100144_bm.field_102094_ac
		// @1D5: goto @1D9
		// @1D8: athrow
		// @1D9: getstatic boolean game.C_100197_ra.field_100862_w
		// @1DC: ifeq @302
		// @1DF: getstatic int game.C_100102_w.field_104636_c
		// @1E2: iconst_1
		// @1E3: if_icmpne @302
		// @1E6: goto @1EA
		// @1E9: athrow
		// @1EA: getstatic int game.C_100100_i.field_102012_Zb
		// @1ED: istore_2
		// @1EE: iconst_m1
		// @1EF: iload_2
		// @1F0: iconst_m1
		// @1F1: ixor
		// @1F2: if_icmpeq @213
		// @1F5: iload_2
		// @1F6: iconst_1
		// @1F7: if_icmpeq @2CF
		// @1FA: goto @1FE
		// @1FD: athrow
		// @1FE: iload_2
		// @1FF: iconst_m1
		// @200: ixor
		// @201: bipush -3 (0xFD)
		// @203: if_icmpne @302
		// @206: goto @20A
		// @209: athrow
		// @20A: iload #6
		// @20C: ifeq @2E7
		// @20F: goto @213
		// @212: athrow
		// @213: bipush 95 (0x5F)
		// @215: bipush 8 (0x08)
		// @217: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @21A: getstatic int game.C_100050_vg.field_100632_k
		// @21D: istore_2
		// @21E: iconst_5
		// @21F: iload_2
		// @220: if_icmpeq @23F
		// @223: bipush -7 (0xF9)
		// @225: iload_2
		// @226: iconst_m1
		// @227: ixor
		// @228: if_icmpeq @23F
		// @22B: goto @22F
		// @22E: athrow
		// @22F: iload_2
		// @230: iconst_m1
		// @231: ixor
		// @232: bipush -9 (0xF7)
		// @234: if_icmpeq @23F
		// @237: goto @23B
		// @23A: athrow
		// @23B: goto @243
		// @23E: athrow
		// @23F: getstatic int game.C_100069_vb.field_104357_e
		// @242: istore_2
		// @243: iconst_1
		// @244: iconst_0
		// @245: bipush -102 (0x9A)
		// @247: iload_2
		// @248: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @24B: iconst_1
		// @24C: putstatic boolean game.C_100309_lk.field_103271_ab
		// @24F: iconst_0
		// @250: putstatic boolean game.C_100197_ra.field_100862_w
		// @253: aconst_null
		// @254: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @257: iconst_1
		// @258: putstatic boolean game.C_100034_gi.field_104029_d
		// @25B: iconst_0
		// @25C: istore_2
		// @25D: bipush -4 (0xFC)
		// @25F: iload_2
		// @260: iconst_m1
		// @261: ixor
		// @262: if_icmpge @27C
		// @265: getstatic int[] game.C_100275_na.field_103087_l
		// @268: iload_2
		// @269: iconst_0
		// @26A: iastore
		// @26B: iinc #2 +1
		// @26E: iload #6
		// @270: ifne @284
		// @273: iload #6
		// @275: ifeq @25D
		// @278: goto @27C
		// @27B: athrow
		// @27C: iconst_0
		// @27D: putstatic int game.C_100205_qf.field_103678_d
		// @280: iconst_0
		// @281: putstatic int game.C_100269_ml.field_101127_j
		// @284: iconst_0
		// @285: istore_2
		// @286: getstatic int[] game.C_100257_ln.field_106481_d
		// @289: arraylength
		// @28A: iload_2
		// @28B: if_icmple @2A5
		// @28E: getstatic int[] game.C_100257_ln.field_106481_d
		// @291: iload_2
		// @292: iconst_0
		// @293: iastore
		// @294: iinc #2 +1
		// @297: iload #6
		// @299: ifne @2A7
		// @29C: iload #6
		// @29E: ifeq @286
		// @2A1: goto @2A5
		// @2A4: athrow
		// @2A5: iconst_0
		// @2A6: istore_2
		// @2A7: getstatic int[] game.C_100075_uj.field_100655_u
		// @2AA: arraylength
		// @2AB: iload_2
		// @2AC: if_icmple @2CA
		// @2AF: getstatic int[] game.C_100075_uj.field_100655_u
		// @2B2: iload_2
		// @2B3: iconst_0
		// @2B4: iastore
		// @2B5: iinc #2 +1
		// @2B8: iload #6
		// @2BA: ifne @302
		// @2BD: goto @2C1
		// @2C0: athrow
		// @2C1: iload #6
		// @2C3: ifeq @2A7
		// @2C6: goto @2CA
		// @2C9: athrow
		// @2CA: iload #6
		// @2CC: ifeq @302
		// @2CF: bipush 95 (0x5F)
		// @2D1: bipush 8 (0x08)
		// @2D3: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @2D6: bipush 20 (0x14)
		// @2D8: bipush -127 (0x81)
		// @2DA: aconst_null
		// @2DB: invokestatic game.C_100316_lc.func_102397_a(int, int, java.lang.String)void
		// @2DE: iload #6
		// @2E0: ifeq @302
		// @2E3: goto @2E7
		// @2E6: athrow
		// @2E7: bipush 95 (0x5F)
		// @2E9: bipush 8 (0x08)
		// @2EB: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @2EE: iconst_1
		// @2EF: putstatic boolean game.C_100034_gi.field_104029_d
		// @2F2: aconst_null
		// @2F3: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @2F6: iconst_1
		// @2F7: putstatic boolean game.C_100309_lk.field_103271_ab
		// @2FA: iconst_0
		// @2FB: putstatic boolean game.C_100197_ra.field_100862_w
		// @2FE: goto @302
		// @301: athrow
		// @302: getstatic boolean game.C_100209_qb.field_102690_Ib
		// @305: ifeq @31A
		// @308: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @30B: ifnonnull @31A
		// @30E: goto @312
		// @311: athrow
		// @312: iconst_0
		// @313: putstatic boolean game.C_100209_qb.field_102690_Ib
		// @316: goto @31A
		// @319: athrow
		// @31A: getstatic boolean game.C_100209_qb.field_102690_Ib
		// @31D: ifeq @347
		// @320: iconst_1
		// @321: getstatic int game.C_100102_w.field_104636_c
		// @324: if_icmpne @347
		// @327: goto @32B
		// @32A: athrow
		// @32B: iconst_1
		// @32C: putstatic boolean game.C_100309_lk.field_103271_ab
		// @32F: iconst_0
		// @330: putstatic int game.C_100102_w.field_104636_c
		// @333: aconst_null
		// @334: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @337: iconst_1
		// @338: putstatic boolean game.C_100034_gi.field_104029_d
		// @33B: aconst_null
		// @33C: putstatic game.C_100037_wb game.C_100144_bm.field_102094_ac
		// @33F: iconst_0
		// @340: putstatic boolean game.C_100209_qb.field_102690_Ib
		// @343: goto @347
		// @346: athrow
		// @347: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @34A: getstatic java.lang.String game.C_100047_vh.field_104152_b
		// @34D: if_acmpeq @35D
		// @350: getstatic java.lang.String game.C_100163_sf.field_105442_h
		// @353: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @356: if_acmpne @379
		// @359: goto @35D
		// @35C: athrow
		// @35D: bipush -25 (0xE7)
		// @35F: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @362: ifeq @36D
		// @365: goto @369
		// @368: athrow
		// @369: goto @379
		// @36C: athrow
		// @36D: aconst_null
		// @36E: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @371: iconst_1
		// @372: putstatic boolean game.C_100034_gi.field_104029_d
		// @375: iconst_1
		// @376: putstatic boolean game.C_100309_lk.field_103271_ab
		// @379: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @37C: getstatic java.lang.String game.C_100047_vh.field_104152_b
		// @37F: if_acmpeq @38F
		// @382: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @385: getstatic java.lang.String game.C_100163_sf.field_105442_h
		// @388: if_acmpne @3BD
		// @38B: goto @38F
		// @38E: athrow
		// @38F: bipush -2 (0xFE)
		// @391: getstatic int game.C_100102_w.field_104636_c
		// @394: iconst_m1
		// @395: ixor
		// @396: if_icmpne @3BD
		// @399: goto @39D
		// @39C: athrow
		// @39D: iconst_m1
		// @39E: getstatic int game.C_100100_i.field_102012_Zb
		// @3A1: iconst_m1
		// @3A2: ixor
		// @3A3: if_icmpeq @3AE
		// @3A6: goto @3AA
		// @3A9: athrow
		// @3AA: goto @3BD
		// @3AD: athrow
		// @3AE: bipush 95 (0x5F)
		// @3B0: bipush 8 (0x08)
		// @3B2: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @3B5: bipush 20 (0x14)
		// @3B7: bipush -124 (0x84)
		// @3B9: aconst_null
		// @3BA: invokestatic game.C_100316_lc.func_102397_a(int, int, java.lang.String)void
		// @3BD: aconst_null
		// @3BE: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @3C1: if_acmpeq @41D
		// @3C4: bipush 64 (0x40)
		// @3C6: invokestatic game.C_100189_ri.func_105748_a(int)boolean
		// @3C9: ifeq @416
		// @3CC: goto @3D0
		// @3CF: athrow
		// @3D0: iload #6
		// @3D2: ifne @41D
		// @3D5: goto @3D9
		// @3D8: athrow
		// @3D9: bipush 13 (0x0D)
		// @3DB: getstatic int game.C_100293_kj.field_106890_c
		// @3DE: if_icmpeq @403
		// @3E1: goto @3E5
		// @3E4: athrow
		// @3E5: bipush 84 (0x54)
		// @3E7: getstatic int game.C_100293_kj.field_106890_c
		// @3EA: if_icmpeq @403
		// @3ED: goto @3F1
		// @3F0: athrow
		// @3F1: bipush -84 (0xAC)
		// @3F3: getstatic int game.C_100293_kj.field_106890_c
		// @3F6: iconst_m1
		// @3F7: ixor
		// @3F8: if_icmpeq @403
		// @3FB: goto @3FF
		// @3FE: athrow
		// @3FF: goto @3C4
		// @402: athrow
		// @403: iconst_1
		// @404: putstatic boolean game.C_100034_gi.field_104029_d
		// @407: aconst_null
		// @408: putstatic game.C_100037_wb game.C_100144_bm.field_102094_ac
		// @40B: iconst_1
		// @40C: putstatic boolean game.C_100309_lk.field_103271_ab
		// @40F: aconst_null
		// @410: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @413: goto @416
		// @416: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @419: ifnull @41D
		// @41C: return
		// @41D: aconst_null
		// @41E: astore_2
		// @41F: getstatic int game.C_100068_vc.field_104343_e
		// @422: iconst_m1
		// @423: ixor
		// @424: iconst_m1
		// @425: if_icmpgt @430
		// @428: getstatic game.C_100067_vd[] game.C_100066_dl.field_101641_u
		// @42B: getstatic int game.C_100068_vc.field_104343_e
		// @42E: aaload
		// @42F: astore_2
		// @430: aconst_null
		// @431: aload_2
		// @432: if_acmpeq @4F7
		// @435: bipush 64 (0x40)
		// @437: invokestatic game.C_100189_ri.func_105748_a(int)boolean
		// @43A: ifeq @4BB
		// @43D: goto @441
		// @440: athrow
		// @441: getstatic int game.C_100293_kj.field_106890_c
		// @444: iconst_m1
		// @445: ixor
		// @446: bipush -14 (0xF2)
		// @448: if_icmpeq @482
		// @44B: bipush -85 (0xAB)
		// @44D: getstatic int game.C_100293_kj.field_106890_c
		// @450: iconst_m1
		// @451: ixor
		// @452: if_icmpne @435
		// @455: goto @459
		// @458: athrow
		// @459: bipush 7 (0x07)
		// @45B: aload_0
		// @45C: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @45F: getfield int game.C_100333_ij.field_107347_b
		// @462: iload #6
		// @464: ifne @4BF
		// @467: if_icmpeq @482
		// @46A: goto @46E
		// @46D: athrow
		// @46E: bipush 8 (0x08)
		// @470: aload_0
		// @471: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @474: getfield int game.C_100333_ij.field_107347_b
		// @477: if_icmpeq @482
		// @47A: goto @47E
		// @47D: athrow
		// @47E: goto @435
		// @481: athrow
		// @482: iconst_m1
		// @483: putstatic int game.C_100068_vc.field_104343_e
		// @486: aload_2
		// @487: bipush 87 (0x57)
		// @489: invokevirtual game.C_100067_vd.func_104307_c(byte)void
		// @48C: getstatic int game.C_100050_vg.field_100632_k
		// @48F: istore_3
		// @490: bipush -6 (0xFA)
		// @492: iload_3
		// @493: iconst_m1
		// @494: ixor
		// @495: if_icmpeq @4AC
		// @498: iload_3
		// @499: bipush 6 (0x06)
		// @49B: if_icmpeq @4AC
		// @49E: goto @4A2
		// @4A1: athrow
		// @4A2: bipush 8 (0x08)
		// @4A4: iload_3
		// @4A5: if_icmpne @4B0
		// @4A8: goto @4AC
		// @4AB: athrow
		// @4AC: getstatic int game.C_100069_vb.field_104357_e
		// @4AF: istore_3
		// @4B0: iconst_0
		// @4B1: iconst_0
		// @4B2: bipush -119 (0x89)
		// @4B4: iload_3
		// @4B5: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @4B8: goto @4BB
		// @4BB: getstatic int game.C_100102_w.field_104636_c
		// @4BE: iconst_2
		// @4BF: if_icmpne @4D7
		// @4C2: aload_2
		// @4C3: bipush -107 (0x95)
		// @4C5: invokevirtual game.C_100067_vd.func_104300_a(byte)boolean
		// @4C8: ifne @4D7
		// @4CB: goto @4CF
		// @4CE: athrow
		// @4CF: iconst_0
		// @4D0: putstatic int game.C_100102_w.field_104636_c
		// @4D3: goto @4D7
		// @4D6: athrow
		// @4D7: getstatic int game.C_100102_w.field_104636_c
		// @4DA: iconst_1
		// @4DB: if_icmpne @4F7
		// @4DE: aload_2
		// @4DF: bipush -4 (0xFC)
		// @4E1: aload_0
		// @4E2: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @4E5: invokevirtual game.C_100067_vd.func_104302_a(int, game.C_100333_ij)boolean
		// @4E8: ifeq @4F3
		// @4EB: goto @4EF
		// @4EE: athrow
		// @4EF: goto @4F7
		// @4F2: athrow
		// @4F3: iconst_0
		// @4F4: putstatic int game.C_100102_w.field_104636_c
		// @4F7: getstatic game.C_100009_fg game.C_100146_bf.field_105128_n
		// @4FA: ifnull @50D
		// @4FD: getstatic game.C_100009_fg game.C_100146_bf.field_105128_n
		// @500: aconst_null
		// @501: invokevirtual game.C_100009_fg.setCursor(java.awt.Cursor)void
		// @504: iload #6
		// @506: ifeq @518
		// @509: goto @50D
		// @50C: athrow
		// @50D: getstatic java.awt.Canvas game.C_100034_gi.field_104033_a
		// @510: aconst_null
		// @511: invokevirtual java.awt.Canvas.setCursor(java.awt.Cursor)void
		// @514: goto @518
		// @517: athrow
		// @518: bipush 12 (0x0C)
		// @51A: aload_0
		// @51B: getfield int game.C_100034_gi.field_104030_e
		// @51E: if_icmpne @5DC
		// @521: iconst_m1
		// @522: invokestatic game.C_100230_of.func_106202_b(int)boolean
		// @525: ifne @531
		// @528: goto @52C
		// @52B: athrow
		// @52C: iconst_1
		// @52D: goto @532
		// @530: athrow
		// @531: iconst_0
		// @532: bipush -104 (0x98)
		// @534: invokestatic game.C_100049_vf.func_104196_a(boolean, int)int
		// @537: istore_3
		// @538: bipush -4 (0xFC)
		// @53A: iload_3
		// @53B: iconst_m1
		// @53C: ixor
		// @53D: if_icmpeq @544
		// @540: goto @55E
		// @543: athrow
		// @544: aconst_null
		// @545: getstatic game.C_100009_fg game.C_100146_bf.field_105128_n
		// @548: if_acmpeq @554
		// @54B: bipush 12 (0x0C)
		// @54D: invokestatic game.C_100123_uc.func_104914_b(int)void
		// @550: goto @554
		// @553: athrow
		// @554: sipush 360 (0x0168)
		// @557: iconst_0
		// @558: invokestatic game.C_100206_qe.func_105938_b(boolean)java.applet.Applet
		// @55B: invokestatic game.C_100303_kk.func_104780_a(int, java.applet.Applet)void
		// @55E: bipush -2 (0xFE)
		// @560: iload_3
		// @561: iconst_m1
		// @562: ixor
		// @563: if_icmpeq @56A
		// @566: goto @59B
		// @569: athrow
		// @56A: getstatic int game.C_100050_vg.field_100632_k
		// @56D: istore #4
		// @56F: iconst_5
		// @570: iload #4
		// @572: if_icmpeq @58D
		// @575: iload #4
		// @577: bipush 6 (0x06)
		// @579: if_icmpeq @58D
		// @57C: goto @580
		// @57F: athrow
		// @580: bipush -9 (0xF7)
		// @582: iload #4
		// @584: iconst_m1
		// @585: ixor
		// @586: if_icmpne @592
		// @589: goto @58D
		// @58C: athrow
		// @58D: getstatic int game.C_100069_vb.field_104357_e
		// @590: istore #4
		// @592: iconst_0
		// @593: iconst_0
		// @594: bipush -128 (0x80)
		// @596: iload #4
		// @598: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @59B: iload_3
		// @59C: iconst_2
		// @59D: if_icmpeq @5A4
		// @5A0: goto @5DB
		// @5A3: athrow
		// @5A4: getstatic int game.C_100050_vg.field_100632_k
		// @5A7: istore #4
		// @5A9: iconst_5
		// @5AA: iload #4
		// @5AC: if_icmpeq @5CD
		// @5AF: iload #4
		// @5B1: iconst_m1
		// @5B2: ixor
		// @5B3: bipush -7 (0xF9)
		// @5B5: if_icmpeq @5CD
		// @5B8: goto @5BC
		// @5BB: athrow
		// @5BC: iload #4
		// @5BE: iconst_m1
		// @5BF: ixor
		// @5C0: bipush -9 (0xF7)
		// @5C2: if_icmpeq @5CD
		// @5C5: goto @5C9
		// @5C8: athrow
		// @5C9: goto @5D2
		// @5CC: athrow
		// @5CD: getstatic int game.C_100069_vb.field_104357_e
		// @5D0: istore #4
		// @5D2: iconst_1
		// @5D3: iconst_0
		// @5D4: bipush -117 (0x8B)
		// @5D6: iload #4
		// @5D8: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @5DB: return
		// @5DC: iload_1
		// @5DD: bipush 24 (0x18)
		// @5DF: if_icmpgt @5E3
		// @5E2: return
		// @5E3: getstatic boolean game.C_100029_gn.field_103363_U
		// @5E6: ifne @83B
		// @5E9: getstatic boolean game.C_100239_oi.field_102299_L
		// @5EC: ifeq @5F7
		// @5EF: goto @5F3
		// @5F2: athrow
		// @5F3: goto @83B
		// @5F6: athrow
		// @5F7: bipush 64 (0x40)
		// @5F9: invokestatic game.C_100189_ri.func_105748_a(int)boolean
		// @5FC: ifeq @7FE
		// @5FF: getstatic int game.C_100293_kj.field_106890_c
		// @602: bipush 13 (0x0D)
		// @604: iload #6
		// @606: ifne @827
		// @609: if_icmpeq @63B
		// @60C: goto @610
		// @60F: athrow
		// @610: aload_0
		// @611: bipush 99 (0x63)
		// @613: invokespecial game.C_100034_gi.func_104019_s(int)void
		// @616: aload_0
		// @617: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @61A: getfield int game.C_100333_ij.field_107347_b
		// @61D: iconst_m1
		// @61E: if_icmpne @629
		// @621: goto @625
		// @624: athrow
		// @625: goto @5F7
		// @628: athrow
		// @629: aload_0
		// @62A: iconst_5
		// @62B: iconst_0
		// @62C: aload_0
		// @62D: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @630: getfield int game.C_100333_ij.field_107347_b
		// @633: invokespecial game.C_100034_gi.func_104010_a(byte, boolean, int)void
		// @636: iload #6
		// @638: ifeq @5F7
		// @63B: aload_0
		// @63C: getfield int game.C_100034_gi.field_104030_e
		// @63F: iconst_m1
		// @640: ixor
		// @641: bipush -8 (0xF8)
		// @643: if_icmpne @659
		// @646: iconst_0
		// @647: getstatic int game.C_100069_vb.field_104357_e
		// @64A: if_icmpeq @659
		// @64D: goto @651
		// @650: athrow
		// @651: iconst_1
		// @652: putstatic boolean game.C_100174_sb.field_105611_a
		// @655: goto @659
		// @658: athrow
		// @659: aload_0
		// @65A: getfield int game.C_100034_gi.field_104030_e
		// @65D: iconst_m1
		// @65E: ixor
		// @65F: bipush -21 (0xEB)
		// @661: if_icmpne @68E
		// @664: iconst_0
		// @665: getstatic int[] game.C_100275_na.field_103087_l
		// @668: iconst_0
		// @669: iaload
		// @66A: if_icmpge @68E
		// @66D: goto @671
		// @670: athrow
		// @671: bipush -25 (0xE7)
		// @673: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @676: ifeq @68E
		// @679: goto @67D
		// @67C: athrow
		// @67D: iconst_m1
		// @67E: putstatic int game.C_100100_i.field_102012_Zb
		// @681: iconst_1
		// @682: putstatic boolean game.C_100197_ra.field_100862_w
		// @685: iload #6
		// @687: ifeq @5F7
		// @68A: goto @68E
		// @68D: athrow
		// @68E: bipush 18 (0x12)
		// @690: aload_0
		// @691: getfield int game.C_100034_gi.field_104030_e
		// @694: if_icmpne @6F3
		// @697: iconst_0
		// @698: istore_3
		// @699: iload_3
		// @69A: iconst_m1
		// @69B: ixor
		// @69C: getstatic int[] game.C_100074_g.field_104410_e
		// @69F: arraylength
		// @6A0: iconst_m1
		// @6A1: ixor
		// @6A2: if_icmple @6BC
		// @6A5: getstatic int[] game.C_100074_g.field_104410_e
		// @6A8: iload_3
		// @6A9: iconst_0
		// @6AA: iastore
		// @6AB: iinc #3 +1
		// @6AE: iload #6
		// @6B0: ifne @6C5
		// @6B3: iload #6
		// @6B5: ifeq @699
		// @6B8: goto @6BC
		// @6BB: athrow
		// @6BC: bipush -48 (0xD0)
		// @6BE: invokestatic game.C_100203_ql.func_105921_a(int)void
		// @6C1: getstatic int game.C_100050_vg.field_100632_k
		// @6C4: istore_3
		// @6C5: iconst_5
		// @6C6: iload_3
		// @6C7: if_icmpeq @6E2
		// @6CA: bipush -7 (0xF9)
		// @6CC: iload_3
		// @6CD: iconst_m1
		// @6CE: ixor
		// @6CF: if_icmpeq @6E2
		// @6D2: goto @6D6
		// @6D5: athrow
		// @6D6: iload_3
		// @6D7: iconst_m1
		// @6D8: ixor
		// @6D9: bipush -9 (0xF7)
		// @6DB: if_icmpne @6E6
		// @6DE: goto @6E2
		// @6E1: athrow
		// @6E2: getstatic int game.C_100069_vb.field_104357_e
		// @6E5: istore_3
		// @6E6: iconst_0
		// @6E7: iconst_0
		// @6E8: bipush -98 (0x9E)
		// @6EA: iload_3
		// @6EB: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @6EE: iload #6
		// @6F0: ifeq @5F7
		// @6F3: bipush -2 (0xFE)
		// @6F5: aload_0
		// @6F6: getfield int game.C_100034_gi.field_104030_e
		// @6F9: iconst_m1
		// @6FA: ixor
		// @6FB: if_icmpeq @7EA
		// @6FE: bipush -3 (0xFD)
		// @700: aload_0
		// @701: getfield int game.C_100034_gi.field_104030_e
		// @704: iconst_m1
		// @705: ixor
		// @706: if_icmpeq @7EA
		// @709: goto @70D
		// @70C: athrow
		// @70D: iconst_3
		// @70E: aload_0
		// @70F: getfield int game.C_100034_gi.field_104030_e
		// @712: if_icmpeq @7EA
		// @715: goto @719
		// @718: athrow
		// @719: aload_0
		// @71A: getfield int game.C_100034_gi.field_104030_e
		// @71D: iconst_m1
		// @71E: ixor
		// @71F: bipush -5 (0xFB)
		// @721: if_icmpeq @7EA
		// @724: goto @728
		// @727: athrow
		// @728: getstatic int game.C_100252_pn.field_105503_o
		// @72B: bipush 10 (0x0A)
		// @72D: if_icmpeq @5F7
		// @730: goto @734
		// @733: athrow
		// @734: iconst_m1
		// @735: getstatic int game.C_100252_pn.field_105503_o
		// @738: iconst_m1
		// @739: ixor
		// @73A: if_icmpne @741
		// @73D: goto @5F7
		// @740: athrow
		// @741: bipush 14 (0x0E)
		// @743: getstatic int game.C_100252_pn.field_105503_o
		// @746: if_icmpne @756
		// @749: iconst_0
		// @74A: putstatic int game.C_100069_vb.field_104357_e
		// @74D: iload #6
		// @74F: ifeq @7C9
		// @752: goto @756
		// @755: athrow
		// @756: getstatic int game.C_100252_pn.field_105503_o
		// @759: bipush 20 (0x14)
		// @75B: if_icmpeq @797
		// @75E: goto @762
		// @761: athrow
		// @762: aload_0
		// @763: getfield int game.C_100034_gi.field_104030_e
		// @766: getstatic int game.C_100069_vb.field_104357_e
		// @769: if_icmpne @7C9
		// @76C: goto @770
		// @76F: athrow
		// @770: bipush 14 (0x0E)
		// @772: aload_0
		// @773: getfield int game.C_100034_gi.field_104030_e
		// @776: if_icmpeq @78A
		// @779: goto @77D
		// @77C: athrow
		// @77D: bipush 13 (0x0D)
		// @77F: aload_0
		// @780: getfield int game.C_100034_gi.field_104030_e
		// @783: if_icmpne @7C9
		// @786: goto @78A
		// @789: athrow
		// @78A: iconst_0
		// @78B: putstatic int game.C_100069_vb.field_104357_e
		// @78E: iload #6
		// @790: ifeq @7C9
		// @793: goto @797
		// @796: athrow
		// @797: bipush -11 (0xF5)
		// @799: getstatic int[] game.C_100275_na.field_103087_l
		// @79C: iconst_0
		// @79D: iaload
		// @79E: iconst_m1
		// @79F: ixor
		// @7A0: if_icmplt @7C1
		// @7A3: goto @7A7
		// @7A6: athrow
		// @7A7: bipush -25 (0xE7)
		// @7A9: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @7AC: ifne @7C1
		// @7AF: goto @7B3
		// @7B2: athrow
		// @7B3: bipush 19 (0x13)
		// @7B5: putstatic int game.C_100069_vb.field_104357_e
		// @7B8: iload #6
		// @7BA: ifeq @7C9
		// @7BD: goto @7C1
		// @7C0: athrow
		// @7C1: iconst_0
		// @7C2: putstatic int game.C_100069_vb.field_104357_e
		// @7C5: goto @7C9
		// @7C8: athrow
		// @7C9: getstatic int game.C_100252_pn.field_105503_o
		// @7CC: bipush 19 (0x13)
		// @7CE: if_icmpne @7D9
		// @7D1: iconst_0
		// @7D2: putstatic int game.C_100069_vb.field_104357_e
		// @7D5: goto @7D9
		// @7D8: athrow
		// @7D9: iconst_0
		// @7DA: getstatic int game.C_100069_vb.field_104357_e
		// @7DD: bipush -109 (0x93)
		// @7DF: getstatic int game.C_100069_vb.field_104357_e
		// @7E2: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @7E5: iload #6
		// @7E7: ifeq @5F7
		// @7EA: bipush 85 (0x55)
		// @7EC: bipush 8 (0x08)
		// @7EE: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @7F1: iconst_0
		// @7F2: iconst_m1
		// @7F3: bipush -104 (0x98)
		// @7F5: iconst_0
		// @7F6: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @7F9: iload #6
		// @7FB: ifeq @5F7
		// @7FE: aload_0
		// @7FF: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @802: bipush 60 (0x3C)
		// @804: aload_0
		// @805: getstatic int game.C_100340_je.field_102981_m
		// @808: getstatic int game.C_100125_tm.field_100745_p
		// @80B: bipush -87 (0xA9)
		// @80D: invokespecial game.C_100034_gi.func_103986_a(int, int, byte)int
		// @810: aload_0
		// @811: getstatic int game.C_100015_wh.field_103781_g
		// @814: getstatic int game.C_100338_jc.field_105370_l
		// @817: bipush -119 (0x89)
		// @819: invokespecial game.C_100034_gi.func_103986_a(int, int, byte)int
		// @81C: invokevirtual game.C_100333_ij.func_107335_a(int, int, int)void
		// @81F: aload_0
		// @820: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @823: getfield int game.C_100333_ij.field_107347_b
		// @826: iconst_m1
		// @827: if_icmpeq @83B
		// @82A: aload_0
		// @82B: iconst_5
		// @82C: iconst_1
		// @82D: aload_0
		// @82E: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @831: getfield int game.C_100333_ij.field_107347_b
		// @834: invokespecial game.C_100034_gi.func_104010_a(byte, boolean, int)void
		// @837: goto @83B
		// @83A: athrow
		// @83B: iconst_m1
		// @83C: aload_0
		// @83D: getfield int game.C_100034_gi.field_104030_e
		// @840: iconst_m1
		// @841: ixor
		// @842: if_icmpne @898
		// @845: getstatic boolean game.C_100312_ld.field_107154_e
		// @848: ifeq @898
		// @84B: goto @84F
		// @84E: athrow
		// @84F: iconst_1
		// @850: getstatic int game.C_100102_w.field_104636_c
		// @853: if_icmpne @898
		// @856: goto @85A
		// @859: athrow
		// @85A: bipush 95 (0x5F)
		// @85C: bipush 8 (0x08)
		// @85E: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @861: getstatic int game.C_100050_vg.field_100632_k
		// @864: istore_3
		// @865: iload_3
		// @866: iconst_5
		// @867: if_icmpeq @886
		// @86A: bipush -7 (0xF9)
		// @86C: iload_3
		// @86D: iconst_m1
		// @86E: ixor
		// @86F: if_icmpeq @886
		// @872: goto @876
		// @875: athrow
		// @876: iload_3
		// @877: iconst_m1
		// @878: ixor
		// @879: bipush -9 (0xF7)
		// @87B: if_icmpeq @886
		// @87E: goto @882
		// @881: athrow
		// @882: goto @88A
		// @885: athrow
		// @886: getstatic int game.C_100069_vb.field_104357_e
		// @889: istore_3
		// @88A: iconst_1
		// @88B: bipush 18 (0x12)
		// @88D: bipush -121 (0x87)
		// @88F: iload_3
		// @890: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @893: iload #6
		// @895: ifeq @9C5
		// @898: bipush -19 (0xED)
		// @89A: aload_0
		// @89B: getfield int game.C_100034_gi.field_104030_e
		// @89E: iconst_m1
		// @89F: ixor
		// @8A0: if_icmpeq @9BB
		// @8A3: goto @8A7
		// @8A6: athrow
		// @8A7: aload_0
		// @8A8: getfield int game.C_100034_gi.field_104030_e
		// @8AB: bipush 8 (0x08)
		// @8AD: if_icmpne @8C4
		// @8B0: goto @8B4
		// @8B3: athrow
		// @8B4: aload_0
		// @8B5: bipush 96 (0x60)
		// @8B7: iconst_0
		// @8B8: invokespecial game.C_100034_gi.func_103997_a(byte, boolean)void
		// @8BB: iload #6
		// @8BD: ifeq @9C5
		// @8C0: goto @8C4
		// @8C3: athrow
		// @8C4: aload_0
		// @8C5: getfield int game.C_100034_gi.field_104030_e
		// @8C8: iconst_m1
		// @8C9: ixor
		// @8CA: bipush -10 (0xF6)
		// @8CC: if_icmpeq @9AB
		// @8CF: goto @8D3
		// @8D2: athrow
		// @8D3: bipush -11 (0xF5)
		// @8D5: getstatic int game.C_100252_pn.field_105503_o
		// @8D8: iconst_m1
		// @8D9: ixor
		// @8DA: if_icmpeq @9AB
		// @8DD: goto @8E1
		// @8E0: athrow
		// @8E1: bipush -15 (0xF1)
		// @8E3: aload_0
		// @8E4: getfield int game.C_100034_gi.field_104030_e
		// @8E7: iconst_m1
		// @8E8: ixor
		// @8E9: if_icmpeq @936
		// @8EC: goto @8F0
		// @8EF: athrow
		// @8F0: bipush 13 (0x0D)
		// @8F2: aload_0
		// @8F3: getfield int game.C_100034_gi.field_104030_e
		// @8F6: if_icmpne @901
		// @8F9: goto @8FD
		// @8FC: athrow
		// @8FD: goto @9C5
		// @900: athrow
		// @901: aload_0
		// @902: getfield int game.C_100034_gi.field_104030_e
		// @905: iconst_m1
		// @906: ixor
		// @907: bipush -8 (0xF8)
		// @909: if_icmpeq @928
		// @90C: aload_0
		// @90D: getfield int game.C_100034_gi.field_104030_e
		// @910: bipush 16 (0x10)
		// @912: if_icmpne @9C5
		// @915: goto @919
		// @918: athrow
		// @919: aload_0
		// @91A: bipush -40 (0xD8)
		// @91C: invokespecial game.C_100034_gi.func_103995_f(int)void
		// @91F: iload #6
		// @921: ifeq @9C5
		// @924: goto @928
		// @927: athrow
		// @928: aload_0
		// @929: iconst_1
		// @92A: invokespecial game.C_100034_gi.func_104014_q(int)void
		// @92D: iload #6
		// @92F: ifeq @9C5
		// @932: goto @936
		// @935: athrow
		// @936: sipush -27924 (0x92EC)
		// @939: invokestatic game.C_100271_mj.func_103428_k(int)void
		// @93C: goto @9C5
		// @93F: astore_3
		// @940: getstatic java.io.PrintStream java.lang.System.err
		// @943: new java.lang.StringBuilder
		// @946: dup
		// @947: invokespecial java.lang.StringBuilder.<init>()void
		// @94A: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @94D: bipush 41 (0x29)
		// @94F: aaload
		// @950: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @953: aload_3
		// @954: invokevirtual java.lang.StringBuilder.append(java.lang.Object)java.lang.StringBuilder
		// @957: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @95A: invokevirtual java.io.PrintStream.println(java.lang.String)void
		// @95D: aload_3
		// @95E: invokevirtual java.lang.RuntimeException.printStackTrace()void
		// @961: bipush -55 (0xC9)
		// @963: invokestatic game.C_100203_ql.func_105921_a(int)void
		// @966: iconst_0
		// @967: istore #4
		// @969: getstatic int[] game.C_100074_g.field_104410_e
		// @96C: arraylength
		// @96D: iload #4
		// @96F: if_icmple @98A
		// @972: getstatic int[] game.C_100074_g.field_104410_e
		// @975: iload #4
		// @977: iconst_0
		// @978: iastore
		// @979: iinc #4 +1
		// @97C: iload #6
		// @97E: ifne @9A6
		// @981: iload #6
		// @983: ifeq @969
		// @986: goto @98A
		// @989: athrow
		// @98A: getstatic int[] game.C_100005_fk.field_103605_u
		// @98D: bipush -60 (0xC4)
		// @98F: getstatic int[] game.C_100301_kb.field_107089_g
		// @992: invokestatic game.C_100157_db.func_103546_a(int[], byte, int[])game.C_100327_ib
		// @995: putstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @998: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @99B: getstatic int[] game.C_100301_kb.field_107089_g
		// @99E: bipush -125 (0x83)
		// @9A0: invokestatic game.C_100260_mc.func_102219_a(game.C_100327_ib, int[], byte)int[]
		// @9A3: putstatic int[] game.C_100280_nf.field_101178_o
		// @9A6: iload #6
		// @9A8: ifeq @9C5
		// @9AB: aload_0
		// @9AC: bipush 96 (0x60)
		// @9AE: iconst_1
		// @9AF: invokespecial game.C_100034_gi.func_103997_a(byte, boolean)void
		// @9B2: iload #6
		// @9B4: ifeq @9C5
		// @9B7: goto @9BB
		// @9BA: athrow
		// @9BB: aload_0
		// @9BC: bipush 104 (0x68)
		// @9BE: invokespecial game.C_100034_gi.func_104024_o(int)void
		// @9C1: goto @9C5
		// @9C4: athrow
		// @9C5: goto @9EA
		// @9C8: astore_2
		// @9C9: aload_2
		// @9CA: new java.lang.StringBuilder
		// @9CD: dup
		// @9CE: invokespecial java.lang.StringBuilder.<init>()void
		// @9D1: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @9D4: bipush 42 (0x2A)
		// @9D6: aaload
		// @9D7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9DA: iload_1
		// @9DB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9DE: bipush 41 (0x29)
		// @9E0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9E3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9E6: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9E9: athrow
		// @9EA: return
	}
	
	private final void func_103980_a(int arg0, boolean arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #25
		// @005: getstatic int[][] game.C_100012_fh.field_100515_K
		// @008: aload_0
		// @009: getfield int game.C_100034_gi.field_104030_e
		// @00C: aaload
		// @00D: iload_3
		// @00E: iaload
		// @00F: istore #4
		// @011: iconst_0
		// @012: istore #5
		// @014: iconst_0
		// @015: istore #6
		// @017: bipush -2 (0xFE)
		// @019: iload #4
		// @01B: iconst_m1
		// @01C: ixor
		// @01D: if_icmpeq @03E
		// @020: iload #4
		// @022: iconst_m1
		// @023: ixor
		// @024: bipush -34 (0xDE)
		// @026: if_icmpeq @03E
		// @029: goto @02D
		// @02C: athrow
		// @02D: bipush -40 (0xD8)
		// @02F: iload #4
		// @031: iconst_m1
		// @032: ixor
		// @033: if_icmpeq @03E
		// @036: goto @03A
		// @039: athrow
		// @03A: goto @04E
		// @03D: athrow
		// @03E: bipush -40 (0xD8)
		// @040: invokestatic game.C_100288_jn.func_106838_b(int)boolean
		// @043: ifne @04B
		// @046: iconst_1
		// @047: goto @04C
		// @04A: athrow
		// @04B: iconst_0
		// @04C: istore #6
		// @04E: iload #4
		// @050: iconst_m1
		// @051: ixor
		// @052: bipush -29 (0xE3)
		// @054: if_icmpne @07C
		// @057: bipush 84 (0x54)
		// @059: invokestatic game.C_100335_il.func_107358_a(byte)boolean
		// @05C: ifne @067
		// @05F: goto @063
		// @062: athrow
		// @063: goto @07C
		// @066: athrow
		// @067: iconst_m1
		// @068: bipush 32 (0x20)
		// @06A: getstatic int game.C_100066_dl.field_101636_H
		// @06D: iand
		// @06E: iconst_m1
		// @06F: ixor
		// @070: if_icmpne @077
		// @073: goto @07C
		// @076: athrow
		// @077: ldc_w 13548069 (0xceba25)
		// @07A: istore #5
		// @07C: iload #6
		// @07E: ifne @0AF
		// @081: iload #4
		// @083: iconst_m1
		// @084: ixor
		// @085: iconst_m1
		// @086: if_icmpne @0AF
		// @089: goto @08D
		// @08C: athrow
		// @08D: iconst_1
		// @08E: invokestatic game.C_100254_pi.func_106444_a(int)boolean
		// @091: ifeq @09C
		// @094: goto @098
		// @097: athrow
		// @098: goto @0AF
		// @09B: athrow
		// @09C: iconst_0
		// @09D: bipush 32 (0x20)
		// @09F: getstatic int game.C_100066_dl.field_101636_H
		// @0A2: iand
		// @0A3: if_icmpeq @0AA
		// @0A6: goto @0AF
		// @0A9: athrow
		// @0AA: ldc_w 13696896 (0xd0ff80)
		// @0AD: istore #5
		// @0AF: iload #4
		// @0B1: ifge @0B9
		// @0B4: aconst_null
		// @0B5: goto @0BF
		// @0B8: athrow
		// @0B9: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @0BC: iload #4
		// @0BE: aaload
		// @0BF: astore #7
		// @0C1: iconst_0
		// @0C2: istore #8
		// @0C4: getstatic int game.C_100218_am.field_103115_N
		// @0C7: istore #9
		// @0C9: iconst_0
		// @0CA: iload #9
		// @0CC: if_icmpeq @134
		// @0CF: iload #9
		// @0D1: iconst_m1
		// @0D2: ixor
		// @0D3: bipush -2 (0xFE)
		// @0D5: if_icmpeq @134
		// @0D8: goto @0DC
		// @0DB: athrow
		// @0DC: iload #9
		// @0DE: iconst_m1
		// @0DF: ixor
		// @0E0: bipush -8 (0xF8)
		// @0E2: if_icmpeq @134
		// @0E5: goto @0E9
		// @0E8: athrow
		// @0E9: iload #9
		// @0EB: iconst_3
		// @0EC: if_icmpne @0FC
		// @0EF: goto @0F3
		// @0F2: athrow
		// @0F3: iload #25
		// @0F5: ifeq @134
		// @0F8: goto @0FC
		// @0FB: athrow
		// @0FC: iconst_5
		// @0FD: iload #9
		// @0FF: if_icmpne @10F
		// @102: goto @106
		// @105: athrow
		// @106: iload #25
		// @108: ifeq @134
		// @10B: goto @10F
		// @10E: athrow
		// @10F: bipush -10 (0xF6)
		// @111: iload #9
		// @113: iconst_m1
		// @114: ixor
		// @115: if_icmpne @125
		// @118: goto @11C
		// @11B: athrow
		// @11C: iload #25
		// @11E: ifeq @134
		// @121: goto @125
		// @124: athrow
		// @125: bipush 10 (0x0A)
		// @127: iload #9
		// @129: if_icmpne @137
		// @12C: goto @130
		// @12F: athrow
		// @130: goto @134
		// @133: athrow
		// @134: iconst_1
		// @135: istore #8
		// @137: bipush 9 (0x09)
		// @139: iload #4
		// @13B: if_icmpne @147
		// @13E: iload #8
		// @140: ifne @16D
		// @143: goto @147
		// @146: athrow
		// @147: bipush -10 (0xF6)
		// @149: iload #4
		// @14B: iconst_m1
		// @14C: ixor
		// @14D: if_icmpne @172
		// @150: goto @154
		// @153: athrow
		// @154: iconst_4
		// @155: getstatic int game.C_100218_am.field_103115_N
		// @158: if_icmpeq @163
		// @15B: goto @15F
		// @15E: athrow
		// @15F: goto @172
		// @162: athrow
		// @163: getstatic java.lang.String game.C_100186_rl.field_105721_g
		// @166: astore #7
		// @168: iload #25
		// @16A: ifeq @172
		// @16D: getstatic java.lang.String game.C_100144_bm.field_102091_Wb
		// @170: astore #7
		// @172: iload #6
		// @174: ifne @17B
		// @177: goto @1AC
		// @17A: athrow
		// @17B: new java.lang.StringBuilder
		// @17E: dup
		// @17F: invokespecial java.lang.StringBuilder.<init>()void
		// @182: aload #7
		// @184: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @187: ldc_w " "
		// @18A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @18D: getstatic int game.C_100103_eh.field_104672_h
		// @190: bipush 33 (0x21)
		// @192: imul
		// @193: bipush 33 (0x21)
		// @195: getstatic int game.C_100036_gg.field_103152_Q
		// @198: imul
		// @199: getstatic int game.C_100215_ai.field_106021_k
		// @19C: idiv
		// @19D: iadd
		// @19E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1A1: ldc_w "%"
		// @1A4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1A7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1AA: astore #7
		// @1AC: iload #4
		// @1AE: bipush 8 (0x08)
		// @1B0: if_icmpeq @1B7
		// @1B3: goto @26D
		// @1B6: athrow
		// @1B7: iconst_m1
		// @1B8: getstatic int game.C_100069_vb.field_104357_e
		// @1BB: iconst_m1
		// @1BC: ixor
		// @1BD: if_icmpeq @265
		// @1C0: iconst_m1
		// @1C1: getstatic int game.C_100050_vg.field_100632_k
		// @1C4: iconst_m1
		// @1C5: ixor
		// @1C6: if_icmpeq @265
		// @1C9: goto @1CD
		// @1CC: athrow
		// @1CD: bipush -13 (0xF3)
		// @1CF: getstatic int game.C_100069_vb.field_104357_e
		// @1D2: iconst_m1
		// @1D3: ixor
		// @1D4: if_icmpeq @265
		// @1D7: goto @1DB
		// @1DA: athrow
		// @1DB: bipush -13 (0xF3)
		// @1DD: getstatic int game.C_100050_vg.field_100632_k
		// @1E0: iconst_m1
		// @1E1: ixor
		// @1E2: if_icmpeq @265
		// @1E5: goto @1E9
		// @1E8: athrow
		// @1E9: bipush -2 (0xFE)
		// @1EB: getstatic int game.C_100069_vb.field_104357_e
		// @1EE: iconst_m1
		// @1EF: ixor
		// @1F0: if_icmpeq @25B
		// @1F3: goto @1F7
		// @1F6: athrow
		// @1F7: getstatic int game.C_100050_vg.field_100632_k
		// @1FA: iconst_m1
		// @1FB: ixor
		// @1FC: bipush -2 (0xFE)
		// @1FE: if_icmpeq @25B
		// @201: goto @205
		// @204: athrow
		// @205: bipush -3 (0xFD)
		// @207: getstatic int game.C_100069_vb.field_104357_e
		// @20A: iconst_m1
		// @20B: ixor
		// @20C: if_icmpeq @251
		// @20F: goto @213
		// @212: athrow
		// @213: iconst_2
		// @214: getstatic int game.C_100050_vg.field_100632_k
		// @217: if_icmpeq @251
		// @21A: goto @21E
		// @21D: athrow
		// @21E: bipush -4 (0xFC)
		// @220: getstatic int game.C_100069_vb.field_104357_e
		// @223: iconst_m1
		// @224: ixor
		// @225: if_icmpeq @251
		// @228: goto @22C
		// @22B: athrow
		// @22C: getstatic int game.C_100050_vg.field_100632_k
		// @22F: iconst_3
		// @230: if_icmpeq @251
		// @233: goto @237
		// @236: athrow
		// @237: getstatic int game.C_100069_vb.field_104357_e
		// @23A: iconst_4
		// @23B: if_icmpeq @251
		// @23E: goto @242
		// @241: athrow
		// @242: getstatic int game.C_100050_vg.field_100632_k
		// @245: iconst_4
		// @246: if_icmpeq @251
		// @249: goto @24D
		// @24C: athrow
		// @24D: goto @26D
		// @250: athrow
		// @251: getstatic java.lang.String game.C_100282_nh.field_102710_Nb
		// @254: astore #7
		// @256: iload #25
		// @258: ifeq @26D
		// @25B: getstatic java.lang.String game.C_100343_jf.field_104827_j
		// @25E: astore #7
		// @260: iload #25
		// @262: ifeq @26D
		// @265: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @268: bipush 7 (0x07)
		// @26A: aaload
		// @26B: astore #7
		// @26D: bipush 48 (0x30)
		// @26F: bipush -17 (0xEF)
		// @271: iload_1
		// @272: isub
		// @273: bipush 53 (0x35)
		// @275: idiv
		// @276: idiv
		// @277: istore #10
		// @279: iconst_m1
		// @27A: istore #9
		// @27C: iload #4
		// @27E: iconst_m1
		// @27F: ixor
		// @280: bipush -39 (0xD9)
		// @282: if_icmpne @411
		// @285: getstatic java.lang.String game.C_100158_da.field_100594_b
		// @288: astore #7
		// @28A: iload_3
		// @28B: bipush 10 (0x0A)
		// @28D: idiv
		// @28E: istore #11
		// @290: iload_3
		// @291: bipush 10 (0x0A)
		// @293: irem
		// @294: istore #12
		// @296: aconst_null
		// @297: astore #13
		// @299: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @29C: bipush 114 (0x72)
		// @29E: aaload
		// @29F: astore #14
		// @2A1: aload #14
		// @2A3: astore #15
		// @2A5: iconst_0
		// @2A6: istore #16
		// @2A8: iconst_m1
		// @2A9: istore #17
		// @2AB: iconst_0
		// @2AC: istore #5
		// @2AE: iload #12
		// @2B0: iconst_m1
		// @2B1: ixor
		// @2B2: getstatic int[] game.C_100275_na.field_103087_l
		// @2B5: iload #11
		// @2B7: iaload
		// @2B8: iconst_m1
		// @2B9: ixor
		// @2BA: if_icmpgt @2F3
		// @2BD: aload_0
		// @2BE: iload #11
		// @2C0: bipush -4 (0xFC)
		// @2C2: iload #12
		// @2C4: invokespecial game.C_100034_gi.func_104007_b(int, int, int)boolean
		// @2C7: ifeq @2E1
		// @2CA: goto @2CE
		// @2CD: athrow
		// @2CE: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @2D1: bipush 116 (0x74)
		// @2D3: aaload
		// @2D4: astore #15
		// @2D6: getstatic java.lang.String[] game.C_100289_jl.field_102904_J
		// @2D9: bipush 6 (0x06)
		// @2DB: aaload
		// @2DC: astore #13
		// @2DE: goto @375
		// @2E1: getstatic java.lang.String[] game.C_100289_jl.field_102904_J
		// @2E4: iconst_4
		// @2E5: aaload
		// @2E6: astore #13
		// @2E8: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @2EB: bipush 112 (0x70)
		// @2ED: aaload
		// @2EE: astore #15
		// @2F0: goto @375
		// @2F3: iload #11
		// @2F5: istore #18
		// @2F7: iconst_0
		// @2F8: iload #18
		// @2FA: if_icmpeq @326
		// @2FD: iconst_1
		// @2FE: iload #18
		// @300: if_icmpne @310
		// @303: goto @307
		// @306: athrow
		// @307: iload #25
		// @309: ifeq @330
		// @30C: goto @310
		// @30F: athrow
		// @310: bipush -3 (0xFD)
		// @312: iload #18
		// @314: iconst_m1
		// @315: ixor
		// @316: if_icmpne @375
		// @319: goto @31D
		// @31C: athrow
		// @31D: iload #25
		// @31F: ifeq @351
		// @322: goto @326
		// @325: athrow
		// @326: getstatic java.lang.String[] game.C_100289_jl.field_102904_J
		// @329: iconst_5
		// @32A: aaload
		// @32B: astore #13
		// @32D: goto @375
		// @330: getstatic int[] game.C_100164_se.field_105454_a
		// @333: iload #12
		// @335: iaload
		// @336: iconst_0
		// @337: invokestatic game.C_100007_fm.func_103628_a(int, boolean)java.lang.String
		// @33A: astore #13
		// @33C: getstatic int[] game.C_100164_se.field_105454_a
		// @33F: iload #12
		// @341: iaload
		// @342: istore #16
		// @344: getstatic int[][] game.C_100306_kn.field_107131_d
		// @347: iconst_1
		// @348: aaload
		// @349: iload #12
		// @34B: iaload
		// @34C: istore #17
		// @34E: goto @375
		// @351: getstatic int[] game.C_100164_se.field_105454_a
		// @354: bipush 10 (0x0A)
		// @356: iload #12
		// @358: iadd
		// @359: iaload
		// @35A: iconst_0
		// @35B: invokestatic game.C_100007_fm.func_103628_a(int, boolean)java.lang.String
		// @35E: astore #13
		// @360: getstatic int[] game.C_100164_se.field_105454_a
		// @363: bipush 10 (0x0A)
		// @365: iload #12
		// @367: iadd
		// @368: iaload
		// @369: istore #16
		// @36B: getstatic int[][] game.C_100306_kn.field_107131_d
		// @36E: iconst_2
		// @36F: aaload
		// @370: iload #12
		// @372: iaload
		// @373: istore #17
		// @375: iload_2
		// @376: ifne @37D
		// @379: goto @389
		// @37C: athrow
		// @37D: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @380: bipush 113 (0x71)
		// @382: aaload
		// @383: astore #14
		// @385: aload #14
		// @387: astore #15
		// @389: iconst_m1
		// @38A: iload #17
		// @38C: if_icmpne @393
		// @38F: goto @3BE
		// @392: athrow
		// @393: iload #17
		// @395: iconst_m1
		// @396: ixor
		// @397: iload #16
		// @399: iconst_m1
		// @39A: ixor
		// @39B: if_icmpgt @3A7
		// @39E: bipush 8 (0x08)
		// @3A0: istore #9
		// @3A2: iload #25
		// @3A4: ifeq @3BE
		// @3A7: iload #16
		// @3A9: iload #17
		// @3AB: iconst_3
		// @3AC: imul
		// @3AD: iconst_2
		// @3AE: idiv
		// @3AF: if_icmple @3BA
		// @3B2: goto @3B6
		// @3B5: athrow
		// @3B6: goto @3BE
		// @3B9: athrow
		// @3BA: bipush 25 (0x19)
		// @3BC: istore #9
		// @3BE: sipush -30945 (0x871F)
		// @3C1: iconst_4
		// @3C2: anewarray java.lang.String
		// @3C5: dup
		// @3C6: iconst_0
		// @3C7: iconst_1
		// @3C8: iload #12
		// @3CA: iadd
		// @3CB: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @3CE: aastore
		// @3CF: dup
		// @3D0: iconst_1
		// @3D1: aload #13
		// @3D3: aastore
		// @3D4: dup
		// @3D5: iconst_2
		// @3D6: aload #14
		// @3D8: aastore
		// @3D9: dup
		// @3DA: iconst_3
		// @3DB: aload #15
		// @3DD: aastore
		// @3DE: aload #7
		// @3E0: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @3E3: astore #7
		// @3E5: iload_2
		// @3E6: ifeq @411
		// @3E9: getstatic int[] game.C_100275_na.field_103087_l
		// @3EC: iload #11
		// @3EE: iaload
		// @3EF: iconst_m1
		// @3F0: ixor
		// @3F1: iload #12
		// @3F3: iconst_m1
		// @3F4: ixor
		// @3F5: if_icmple @400
		// @3F8: goto @3FC
		// @3FB: athrow
		// @3FC: goto @411
		// @3FF: athrow
		// @400: iconst_m1
		// @401: istore #9
		// @403: getstatic java.lang.String[] game.C_100260_mc.field_102226_Zb
		// @406: iload #12
		// @408: bipush 10 (0x0A)
		// @40A: iload #11
		// @40C: imul
		// @40D: iadd
		// @40E: aaload
		// @40F: astore #7
		// @411: aload #7
		// @413: iconst_0
		// @414: invokestatic game.C_100096_un.func_104560_a(java.lang.String, boolean)java.lang.String
		// @417: astore #7
		// @419: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @41C: astore #11
		// @41E: iconst_m1
		// @41F: aload_0
		// @420: getfield int game.C_100034_gi.field_104030_e
		// @423: iconst_m1
		// @424: ixor
		// @425: if_icmpeq @42C
		// @428: goto @431
		// @42B: athrow
		// @42C: getstatic game.C_100193_re game.C_100029_gn.field_103368_S
		// @42F: astore #11
		// @431: iconst_0
		// @432: istore #12
		// @434: iload #4
		// @436: bipush 39 (0x27)
		// @438: if_icmpeq @43F
		// @43B: goto @453
		// @43E: athrow
		// @43F: iload #6
		// @441: ifne @44B
		// @444: getstatic game.C_100193_re game.C_100029_gn.field_103368_S
		// @447: goto @44E
		// @44A: athrow
		// @44B: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @44E: astore #11
		// @450: iconst_1
		// @451: istore #12
		// @453: aload #11
		// @455: aload #7
		// @457: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @45A: istore #13
		// @45C: aload_0
		// @45D: bipush 123 (0x7B)
		// @45F: iload_3
		// @460: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @463: istore #14
		// @465: aload_0
		// @466: iload_3
		// @467: bipush 127 (0x7F)
		// @469: invokespecial game.C_100034_gi.func_104002_b(int, byte)int
		// @46C: istore #15
		// @46E: aload_0
		// @46F: bipush -4 (0xFC)
		// @471: iload_3
		// @472: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @475: istore #16
		// @477: iload #4
		// @479: bipush 20 (0x14)
		// @47B: if_icmpeq @48D
		// @47E: bipush 21 (0x15)
		// @480: iload #4
		// @482: if_icmpeq @48D
		// @485: goto @489
		// @488: athrow
		// @489: goto @496
		// @48C: athrow
		// @48D: getstatic int game.C_100171_cn.field_105573_l
		// @490: sipush 170 (0x00AA)
		// @493: iadd
		// @494: istore #13
		// @496: iload #15
		// @498: iload #14
		// @49A: iadd
		// @49B: iload #13
		// @49D: isub
		// @49E: ldc_w 1092548097 (0x411ef601)
		// @4A1: ishr
		// @4A2: istore #17
		// @4A4: aload_0
		// @4A5: iload_3
		// @4A6: sipush -22631 (0xA799)
		// @4A9: invokespecial game.C_100034_gi.func_103985_b(int, int)int
		// @4AC: istore #18
		// @4AE: iload #14
		// @4B0: ineg
		// @4B1: iload #15
		// @4B3: iadd
		// @4B4: istore #19
		// @4B6: aload_0
		// @4B7: iload_3
		// @4B8: sipush -22631 (0xA799)
		// @4BB: invokespecial game.C_100034_gi.func_103985_b(int, int)int
		// @4BE: istore #20
		// @4C0: getstatic game.C_100037_wb[] game.C_100060_di.field_104271_b
		// @4C3: astore #21
		// @4C5: iload_2
		// @4C6: ifne @4CD
		// @4C9: goto @4D2
		// @4CC: athrow
		// @4CD: getstatic game.C_100037_wb[] game.C_100100_i.field_102017_fc
		// @4D0: astore #21
		// @4D2: bipush 14 (0x0E)
		// @4D4: iload #4
		// @4D6: if_icmpne @4E4
		// @4D9: iconst_0
		// @4DA: getstatic int game.C_100025_he.field_103934_b
		// @4DD: if_icmpeq @549
		// @4E0: goto @4E4
		// @4E3: athrow
		// @4E4: iload #4
		// @4E6: iconst_m1
		// @4E7: ixor
		// @4E8: bipush -16 (0xF0)
		// @4EA: if_icmpne @4FF
		// @4ED: goto @4F1
		// @4F0: athrow
		// @4F1: bipush -2 (0xFE)
		// @4F3: getstatic int game.C_100025_he.field_103934_b
		// @4F6: iconst_m1
		// @4F7: ixor
		// @4F8: if_icmpeq @549
		// @4FB: goto @4FF
		// @4FE: athrow
		// @4FF: iload #4
		// @501: iconst_m1
		// @502: ixor
		// @503: bipush -17 (0xEF)
		// @505: if_icmpne @517
		// @508: goto @50C
		// @50B: athrow
		// @50C: iconst_0
		// @50D: getstatic int game.C_100025_he.field_103934_b
		// @510: if_icmpeq @549
		// @513: goto @517
		// @516: athrow
		// @517: bipush 17 (0x11)
		// @519: iload #4
		// @51B: if_icmpne @52F
		// @51E: goto @522
		// @521: athrow
		// @522: getstatic int game.C_100118_ub.field_102054_Wb
		// @525: iconst_m1
		// @526: ixor
		// @527: iconst_m1
		// @528: if_icmpeq @549
		// @52B: goto @52F
		// @52E: athrow
		// @52F: bipush 18 (0x12)
		// @531: iload #4
		// @533: if_icmpne @54E
		// @536: goto @53A
		// @539: athrow
		// @53A: getstatic int game.C_100118_ub.field_102054_Wb
		// @53D: iconst_1
		// @53E: if_icmpeq @549
		// @541: goto @545
		// @544: athrow
		// @545: goto @54E
		// @548: athrow
		// @549: getstatic game.C_100037_wb[] game.C_100213_ak.field_105998_a
		// @54C: astore #21
		// @54E: getstatic game.C_100037_wb[] game.C_100285_nk.field_106786_j
		// @551: astore #21
		// @553: bipush -39 (0xD9)
		// @555: iload #4
		// @557: iconst_m1
		// @558: ixor
		// @559: if_icmpeq @585
		// @55C: bipush -26 (0xE6)
		// @55E: iload #4
		// @560: iconst_m1
		// @561: ixor
		// @562: if_icmpeq @585
		// @565: goto @569
		// @568: athrow
		// @569: bipush 26 (0x1A)
		// @56B: iload #4
		// @56D: if_icmpeq @585
		// @570: goto @574
		// @573: athrow
		// @574: bipush -40 (0xD8)
		// @576: iload #4
		// @578: iconst_m1
		// @579: ixor
		// @57A: if_icmpeq @585
		// @57D: goto @581
		// @580: athrow
		// @581: goto @58A
		// @584: athrow
		// @585: getstatic game.C_100037_wb[] game.C_100252_pn.field_105511_t
		// @588: astore #21
		// @58A: iload_2
		// @58B: ifeq @594
		// @58E: ldc 1044724 (0xff0f4)
		// @590: goto @596
		// @593: athrow
		// @594: ldc 1021128 (0xf94c8)
		// @596: istore #22
		// @598: iload #4
		// @59A: bipush 38 (0x26)
		// @59C: if_icmpeq @5B5
		// @59F: bipush 25 (0x19)
		// @5A1: iload #4
		// @5A3: if_icmpeq @5B5
		// @5A6: goto @5AA
		// @5A9: athrow
		// @5AA: bipush 26 (0x1A)
		// @5AC: iload #4
		// @5AE: if_icmpne @5D7
		// @5B1: goto @5B5
		// @5B4: athrow
		// @5B5: aload_0
		// @5B6: iload_3
		// @5B7: bipush -4 (0xFC)
		// @5B9: invokespecial game.C_100034_gi.func_103977_a(int, int)boolean
		// @5BC: ifeq @5D7
		// @5BF: goto @5C3
		// @5C2: athrow
		// @5C3: iload_2
		// @5C4: ifne @5CF
		// @5C7: goto @5CB
		// @5CA: athrow
		// @5CB: goto @5D7
		// @5CE: athrow
		// @5CF: getstatic game.C_100037_wb[] game.C_100073_f.field_101717_A
		// @5D2: astore #21
		// @5D4: iconst_0
		// @5D5: istore #22
		// @5D7: aload_0
		// @5D8: bipush 119 (0x77)
		// @5DA: invokespecial game.C_100034_gi.func_103976_d(int)boolean
		// @5DD: ifne @642
		// @5E0: bipush 17 (0x11)
		// @5E2: aload_0
		// @5E3: getfield int game.C_100034_gi.field_104030_e
		// @5E6: if_icmpne @5FC
		// @5E9: goto @5ED
		// @5EC: athrow
		// @5ED: iconst_0
		// @5EE: aload_0
		// @5EF: bipush -124 (0x84)
		// @5F1: iload_3
		// @5F2: invokespecial game.C_100034_gi.func_104011_b(byte, int)int
		// @5F5: if_icmpgt @642
		// @5F8: goto @5FC
		// @5FB: athrow
		// @5FC: bipush 39 (0x27)
		// @5FE: iload #4
		// @600: if_icmpeq @642
		// @603: goto @607
		// @606: athrow
		// @607: iconst_5
		// @608: aload_0
		// @609: getfield int game.C_100034_gi.field_104030_e
		// @60C: if_icmpne @622
		// @60F: goto @613
		// @612: athrow
		// @613: iconst_0
		// @614: aload_0
		// @615: bipush -124 (0x84)
		// @617: iload_3
		// @618: invokespecial game.C_100034_gi.func_104011_b(byte, int)int
		// @61B: if_icmpgt @642
		// @61E: goto @622
		// @621: athrow
		// @622: aload_0
		// @623: getfield int game.C_100034_gi.field_104030_e
		// @626: bipush 6 (0x06)
		// @628: if_icmpne @660
		// @62B: goto @62F
		// @62E: athrow
		// @62F: iconst_0
		// @630: aload_0
		// @631: bipush -124 (0x84)
		// @633: iload_3
		// @634: invokespecial game.C_100034_gi.func_104011_b(byte, int)int
		// @637: if_icmpgt @642
		// @63A: goto @63E
		// @63D: athrow
		// @63E: goto @660
		// @641: athrow
		// @642: iload_2
		// @643: ifeq @64D
		// @646: getstatic game.C_100037_wb[] game.C_100073_f.field_101717_A
		// @649: goto @650
		// @64C: athrow
		// @64D: getstatic game.C_100037_wb[] game.C_100106_ef.field_104759_i
		// @650: astore #21
		// @652: iload_2
		// @653: ifne @65D
		// @656: ldc_w 1146810 (0x117fba)
		// @659: goto @65E
		// @65C: athrow
		// @65D: iconst_0
		// @65E: istore #22
		// @660: bipush -21 (0xEB)
		// @662: iload #4
		// @664: iconst_m1
		// @665: ixor
		// @666: if_icmpeq @68C
		// @669: bipush 21 (0x15)
		// @66B: iload #4
		// @66D: if_icmpeq @68C
		// @670: goto @674
		// @673: athrow
		// @674: iload #14
		// @676: iload #16
		// @678: bipush -4 (0xFC)
		// @67A: iload #19
		// @67C: aload #21
		// @67E: iload #20
		// @680: invokestatic game.C_100157_db.func_103554_a(int, int, int, int, game.C_100037_wb[], int)void
		// @683: iload #25
		// @685: ifeq @6A6
		// @688: goto @68C
		// @68B: athrow
		// @68C: getstatic int game.C_100171_cn.field_105573_l
		// @68F: iload #14
		// @691: iconst_3
		// @692: isub
		// @693: iadd
		// @694: iload #16
		// @696: bipush 125 (0x7D)
		// @698: sipush 176 (0x00B0)
		// @69B: aload #21
		// @69D: iload #20
		// @69F: invokestatic game.C_100157_db.func_103554_a(int, int, int, int, game.C_100037_wb[], int)void
		// @6A2: goto @6A6
		// @6A5: athrow
		// @6A6: iconst_m1
		// @6A7: iload #5
		// @6A9: iconst_m1
		// @6AA: ixor
		// @6AB: if_icmpeq @6BE
		// @6AE: iload #5
		// @6B0: istore #22
		// @6B2: iload_2
		// @6B3: ifeq @6BE
		// @6B6: iload #22
		// @6B8: ldc_w 8978312 (0x88ff88)
		// @6BB: ior
		// @6BC: istore #22
		// @6BE: aload_0
		// @6BF: iload_3
		// @6C0: bipush -4 (0xFC)
		// @6C2: invokespecial game.C_100034_gi.func_103977_a(int, int)boolean
		// @6C5: ifne @6EE
		// @6C8: ldc_w 7829367 (0x777777)
		// @6CB: istore #22
		// @6CD: iload_2
		// @6CE: ifeq @6EE
		// @6D1: iload #4
		// @6D3: iconst_m1
		// @6D4: ixor
		// @6D5: bipush -26 (0xE6)
		// @6D7: if_icmpeq @6EE
		// @6DA: goto @6DE
		// @6DD: athrow
		// @6DE: bipush 26 (0x1A)
		// @6E0: iload #4
		// @6E2: if_icmpeq @6EE
		// @6E5: goto @6E9
		// @6E8: athrow
		// @6E9: ldc_w 11184895 (0xaaaaff)
		// @6EC: istore #22
		// @6EE: bipush 25 (0x19)
		// @6F0: iload #4
		// @6F2: if_icmpne @752
		// @6F5: getstatic game.C_100037_wb game.C_100257_ln.field_106482_e
		// @6F8: getfield int game.C_100037_wb.field_102339_s
		// @6FB: ineg
		// @6FC: iload #15
		// @6FE: iadd
		// @6FF: iload #14
		// @701: ineg
		// @702: iadd
		// @703: iconst_2
		// @704: idiv
		// @705: iload #14
		// @707: iadd
		// @708: istore #23
		// @70A: ldc_w ""
		// @70D: astore #7
		// @70F: iload #16
		// @711: iload #20
		// @713: getstatic game.C_100037_wb game.C_100257_ln.field_106482_e
		// @716: getfield int game.C_100037_wb.field_102337_u
		// @719: ineg
		// @71A: iadd
		// @71B: iconst_2
		// @71C: idiv
		// @71D: ineg
		// @71E: isub
		// @71F: istore #24
		// @721: iload #22
		// @723: ldc 1021128 (0xf94c8)
		// @725: if_icmpeq @72C
		// @728: goto @730
		// @72B: athrow
		// @72C: ldc 2061990 (0x1f76a6)
		// @72E: istore #22
		// @730: iload #22
		// @732: ldc_w 7829367 (0x777777)
		// @735: if_icmpeq @73C
		// @738: goto @741
		// @73B: athrow
		// @73C: ldc_w 930889 (0xe3449)
		// @73F: istore #22
		// @741: getstatic game.C_100037_wb game.C_100257_ln.field_106482_e
		// @744: iload #23
		// @746: iload #24
		// @748: iload #22
		// @74A: invokevirtual game.C_100037_wb.func_102383_f(int, int, int)void
		// @74D: iload #25
		// @74F: ifeq @8C6
		// @752: iload #4
		// @754: bipush 26 (0x1A)
		// @756: if_icmpne @7BA
		// @759: goto @75D
		// @75C: athrow
		// @75D: iload #14
		// @75F: getstatic game.C_100037_wb game.C_100071_va.field_101665_t
		// @762: getfield int game.C_100037_wb.field_102339_s
		// @765: ineg
		// @766: iload #14
		// @768: ineg
		// @769: iload #15
		// @76B: iadd
		// @76C: iadd
		// @76D: iconst_2
		// @76E: idiv
		// @76F: iadd
		// @770: istore #23
		// @772: ldc_w ""
		// @775: astore #7
		// @777: ldc_w -1021129 (0xfff06b37)
		// @77A: iload #22
		// @77C: iconst_m1
		// @77D: ixor
		// @77E: if_icmpne @785
		// @781: ldc 2061990 (0x1f76a6)
		// @783: istore #22
		// @785: getstatic game.C_100037_wb game.C_100071_va.field_101665_t
		// @788: getfield int game.C_100037_wb.field_102337_u
		// @78B: ineg
		// @78C: iload #20
		// @78E: iadd
		// @78F: iconst_2
		// @790: idiv
		// @791: iload #16
		// @793: iadd
		// @794: istore #24
		// @796: ldc_w -7829368 (0xff888888)
		// @799: iload #22
		// @79B: iconst_m1
		// @79C: ixor
		// @79D: if_icmpeq @7A4
		// @7A0: goto @7A9
		// @7A3: athrow
		// @7A4: ldc_w 930889 (0xe3449)
		// @7A7: istore #22
		// @7A9: getstatic game.C_100037_wb game.C_100071_va.field_101665_t
		// @7AC: iload #23
		// @7AE: iload #24
		// @7B0: iload #22
		// @7B2: invokevirtual game.C_100037_wb.func_102383_f(int, int, int)void
		// @7B5: iload #25
		// @7B7: ifeq @8C6
		// @7BA: iload #4
		// @7BC: bipush 20 (0x14)
		// @7BE: if_icmpeq @7D0
		// @7C1: goto @7C5
		// @7C4: athrow
		// @7C5: iload #4
		// @7C7: bipush 21 (0x15)
		// @7C9: if_icmpne @7F6
		// @7CC: goto @7D0
		// @7CF: athrow
		// @7D0: aload #11
		// @7D2: aload #7
		// @7D4: iload #14
		// @7D6: bipush 14 (0x0E)
		// @7D8: iadd
		// @7D9: iload #18
		// @7DB: iconst_5
		// @7DC: idiv
		// @7DD: aload #11
		// @7DF: getfield int game.C_100112_r.field_101772_Q
		// @7E2: iadd
		// @7E3: iload #16
		// @7E5: iadd
		// @7E6: ldc_w 1146810 (0x117fba)
		// @7E9: iconst_m1
		// @7EA: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @7ED: iload #25
		// @7EF: ifeq @8C6
		// @7F2: goto @7F6
		// @7F5: athrow
		// @7F6: iload #13
		// @7F8: iload #15
		// @7FA: iload #14
		// @7FC: ineg
		// @7FD: iadd
		// @7FE: if_icmpgt @8A2
		// @801: goto @805
		// @804: athrow
		// @805: iload #12
		// @807: ifne @8A2
		// @80A: goto @80E
		// @80D: athrow
		// @80E: iload #6
		// @810: ifeq @81C
		// @813: goto @817
		// @816: athrow
		// @817: ldc_w 11417637 (0xae3825)
		// @81A: istore #22
		// @81C: aload #11
		// @81E: aload #7
		// @820: iload #17
		// @822: iload #16
		// @824: aload #11
		// @826: getfield int game.C_100112_r.field_101772_Q
		// @829: iadd
		// @82A: iload #18
		// @82C: iconst_5
		// @82D: idiv
		// @82E: ineg
		// @82F: isub
		// @830: iload #22
		// @832: iconst_m1
		// @833: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @836: iconst_m1
		// @837: iload #9
		// @839: if_icmpeq @8C6
		// @83C: iconst_2
		// @83D: iload #14
		// @83F: iadd
		// @840: iconst_0
		// @841: iload #15
		// @843: iconst_2
		// @844: isub
		// @845: sipush 480 (0x01E0)
		// @848: invokestatic game.C_100196_rb.func_105815_h(int, int, int, int)void
		// @84B: getstatic game.C_100037_wb[] game.C_100004_gb.field_103577_h
		// @84E: iload #9
		// @850: aaload
		// @851: iload #13
		// @853: iload #17
		// @855: iadd
		// @856: iload #16
		// @858: bipush -2 (0xFE)
		// @85A: isub
		// @85B: bipush -9 (0xF7)
		// @85D: iload #9
		// @85F: iconst_m1
		// @860: ixor
		// @861: if_icmpeq @86F
		// @864: goto @868
		// @867: athrow
		// @868: sipush 150 (0x0096)
		// @86B: goto @872
		// @86E: athrow
		// @86F: sipush 192 (0x00C0)
		// @872: invokevirtual game.C_100037_wb.func_102367_c(int, int, int)void
		// @875: getstatic game.C_100037_wb[] game.C_100004_gb.field_103577_h
		// @878: iload #9
		// @87A: aaload
		// @87B: bipush -28 (0xE4)
		// @87D: iload #17
		// @87F: iadd
		// @880: iconst_2
		// @881: iload #16
		// @883: iadd
		// @884: bipush -9 (0xF7)
		// @886: iload #9
		// @888: iconst_m1
		// @889: ixor
		// @88A: if_icmpeq @894
		// @88D: sipush 150 (0x0096)
		// @890: goto @897
		// @893: athrow
		// @894: sipush 192 (0x00C0)
		// @897: invokevirtual game.C_100037_wb.func_102367_c(int, int, int)void
		// @89A: invokestatic game.C_100196_rb.func_105781_a()void
		// @89D: iload #25
		// @89F: ifeq @8C6
		// @8A2: iload #6
		// @8A4: ifeq @8B0
		// @8A7: goto @8AB
		// @8AA: athrow
		// @8AB: ldc_w 11417637 (0xae3825)
		// @8AE: istore #22
		// @8B0: aload #11
		// @8B2: aload #7
		// @8B4: iload #14
		// @8B6: iload #16
		// @8B8: iload #19
		// @8BA: iload #18
		// @8BC: iload #22
		// @8BE: iconst_m1
		// @8BF: iconst_1
		// @8C0: iconst_1
		// @8C1: iconst_0
		// @8C2: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @8C5: pop
		// @8C6: bipush -21 (0xEB)
		// @8C8: iload #4
		// @8CA: iconst_m1
		// @8CB: ixor
		// @8CC: if_icmpeq @8DA
		// @8CF: bipush 21 (0x15)
		// @8D1: iload #4
		// @8D3: if_icmpne @925
		// @8D6: goto @8DA
		// @8D9: athrow
		// @8DA: iload #17
		// @8DC: getstatic int game.C_100171_cn.field_105573_l
		// @8DF: iadd
		// @8E0: istore #17
		// @8E2: bipush -21 (0xEB)
		// @8E4: iload #4
		// @8E6: iconst_m1
		// @8E7: ixor
		// @8E8: if_icmpeq @8FA
		// @8EB: getstatic int game.C_100346_ja.field_103498_y
		// @8EE: sipush 170 (0x00AA)
		// @8F1: imul
		// @8F2: sipush 256 (0x0100)
		// @8F5: idiv
		// @8F6: goto @905
		// @8F9: athrow
		// @8FA: sipush 170 (0x00AA)
		// @8FD: getstatic int game.C_100216_aj.field_104467_z
		// @900: imul
		// @901: sipush 256 (0x0100)
		// @904: idiv
		// @905: istore #23
		// @907: iload #23
		// @909: iload #17
		// @90B: iadd
		// @90C: iconst_1
		// @90D: isub
		// @90E: iload #16
		// @910: bipush -3 (0xFD)
		// @912: isub
		// @913: iconst_1
		// @914: iload #23
		// @916: ineg
		// @917: iadd
		// @918: sipush 170 (0x00AA)
		// @91B: iadd
		// @91C: bipush -6 (0xFA)
		// @91E: iload #18
		// @920: iadd
		// @921: iconst_0
		// @922: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @925: goto @95E
		// @928: astore #4
		// @92A: aload #4
		// @92C: new java.lang.StringBuilder
		// @92F: dup
		// @930: invokespecial java.lang.StringBuilder.<init>()void
		// @933: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @936: bipush 115 (0x73)
		// @938: aaload
		// @939: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @93C: iload_1
		// @93D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @940: bipush 44 (0x2C)
		// @942: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @945: iload_2
		// @946: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @949: bipush 44 (0x2C)
		// @94B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @94E: iload_3
		// @94F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @952: bipush 41 (0x29)
		// @954: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @957: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @95A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @95D: athrow
		// @95E: return
	}
	
	private final void func_104000_a(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #18
		// @005: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @008: astore #10
		// @00A: ldc 1021128 (0xf94c8)
		// @00C: istore #11
		// @00E: iload_2
		// @00F: iload #4
		// @011: iload #6
		// @013: iadd
		// @014: iadd
		// @015: istore #12
		// @017: iload #8
		// @019: ifeq @06E
		// @01C: iload #9
		// @01E: bipush 11 (0x0B)
		// @020: isub
		// @021: istore #13
		// @023: bipush 13 (0x0D)
		// @025: istore #14
		// @027: iconst_0
		// @028: istore #15
		// @02A: iconst_m1
		// @02B: getstatic int[] game.C_100093_fd.field_102784_P
		// @02E: arraylength
		// @02F: iadd
		// @030: iload #15
		// @032: if_icmple @06E
		// @035: getstatic int[] game.C_100093_fd.field_102784_P
		// @038: iload #15
		// @03A: iaload
		// @03B: istore #16
		// @03D: getstatic int[] game.C_100093_fd.field_102784_P
		// @040: iconst_1
		// @041: iload #15
		// @043: iadd
		// @044: iaload
		// @045: istore #17
		// @047: iconst_3
		// @048: iload #16
		// @04A: iadd
		// @04B: iload #13
		// @04D: bipush -5 (0xFB)
		// @04F: iload #17
		// @051: iadd
		// @052: iload #16
		// @054: isub
		// @055: iload #14
		// @057: sipush 12105 (0x2F49)
		// @05A: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @05D: iinc #15 +1
		// @060: iload #18
		// @062: ifne @095
		// @065: iload #18
		// @067: ifeq @02A
		// @06A: goto @06E
		// @06D: athrow
		// @06E: iload #12
		// @070: ifne @077
		// @073: goto @0A6
		// @076: athrow
		// @077: iload #12
		// @079: iload #6
		// @07B: sipush 200 (0x00C8)
		// @07E: imul
		// @07F: iadd
		// @080: iload #12
		// @082: iconst_2
		// @083: imul
		// @084: idiv
		// @085: istore #6
		// @087: sipush 200 (0x00C8)
		// @08A: iload_2
		// @08B: imul
		// @08C: iload #12
		// @08E: iadd
		// @08F: iload #12
		// @091: iconst_2
		// @092: imul
		// @093: idiv
		// @094: istore_2
		// @095: sipush 200 (0x00C8)
		// @098: iload #4
		// @09A: imul
		// @09B: iload #12
		// @09D: ineg
		// @09E: isub
		// @09F: iconst_2
		// @0A0: iload #12
		// @0A2: imul
		// @0A3: idiv
		// @0A4: istore #4
		// @0A6: aload_1
		// @0A7: astore #13
		// @0A9: aload #10
		// @0AB: aload #13
		// @0AD: iconst_5
		// @0AE: getstatic int[] game.C_100093_fd.field_102784_P
		// @0B1: iconst_0
		// @0B2: iaload
		// @0B3: iadd
		// @0B4: iload #9
		// @0B6: iload #11
		// @0B8: iconst_m1
		// @0B9: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @0BC: iload #7
		// @0BE: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @0C1: astore #13
		// @0C3: aload #10
		// @0C5: aload #13
		// @0C7: getstatic int[] game.C_100093_fd.field_102784_P
		// @0CA: iconst_2
		// @0CB: iaload
		// @0CC: bipush -5 (0xFB)
		// @0CE: iadd
		// @0CF: iconst_m1
		// @0D0: iadd
		// @0D1: iload #9
		// @0D3: iload #11
		// @0D5: iconst_m1
		// @0D6: invokevirtual game.C_100112_r.func_101746_a(java.lang.String, int, int, int, int)void
		// @0D9: iload #12
		// @0DB: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @0DE: astore #13
		// @0E0: aload #10
		// @0E2: aload #13
		// @0E4: iconst_m1
		// @0E5: bipush -5 (0xFB)
		// @0E7: getstatic int[] game.C_100093_fd.field_102784_P
		// @0EA: iconst_3
		// @0EB: iaload
		// @0EC: iadd
		// @0ED: iadd
		// @0EE: iload #9
		// @0F0: iload #11
		// @0F2: iconst_m1
		// @0F3: invokevirtual game.C_100112_r.func_101746_a(java.lang.String, int, int, int, int)void
		// @0F6: new java.lang.StringBuilder
		// @0F9: dup
		// @0FA: invokespecial java.lang.StringBuilder.<init>()void
		// @0FD: iload #6
		// @0FF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @102: ldc_w "%"
		// @105: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @108: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @10B: astore #13
		// @10D: aload #10
		// @10F: aload #13
		// @111: bipush -5 (0xFB)
		// @113: getstatic int[] game.C_100093_fd.field_102784_P
		// @116: iconst_4
		// @117: iaload
		// @118: iconst_1
		// @119: isub
		// @11A: iadd
		// @11B: iload #9
		// @11D: iload #11
		// @11F: iconst_m1
		// @120: invokevirtual game.C_100112_r.func_101746_a(java.lang.String, int, int, int, int)void
		// @123: new java.lang.StringBuilder
		// @126: dup
		// @127: invokespecial java.lang.StringBuilder.<init>()void
		// @12A: iload_2
		// @12B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @12E: ldc_w "%"
		// @131: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @134: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @137: astore #13
		// @139: aload #10
		// @13B: aload #13
		// @13D: iconst_m1
		// @13E: bipush -5 (0xFB)
		// @140: getstatic int[] game.C_100093_fd.field_102784_P
		// @143: iconst_5
		// @144: iaload
		// @145: iadd
		// @146: iadd
		// @147: iload #9
		// @149: iload #11
		// @14B: iconst_m1
		// @14C: invokevirtual game.C_100112_r.func_101746_a(java.lang.String, int, int, int, int)void
		// @14F: new java.lang.StringBuilder
		// @152: dup
		// @153: invokespecial java.lang.StringBuilder.<init>()void
		// @156: iload #4
		// @158: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @15B: ldc_w "%"
		// @15E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @161: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @164: astore #13
		// @166: aload #10
		// @168: aload #13
		// @16A: bipush -6 (0xFA)
		// @16C: getstatic int[] game.C_100093_fd.field_102784_P
		// @16F: bipush 6 (0x06)
		// @171: iaload
		// @172: iadd
		// @173: iload #9
		// @175: iload #11
		// @177: iload #5
		// @179: invokevirtual game.C_100112_r.func_101746_a(java.lang.String, int, int, int, int)void
		// @17C: goto @204
		// @17F: astore #10
		// @181: aload #10
		// @183: new java.lang.StringBuilder
		// @186: dup
		// @187: invokespecial java.lang.StringBuilder.<init>()void
		// @18A: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @18D: bipush 80 (0x50)
		// @18F: aaload
		// @190: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @193: aload_1
		// @194: ifnull @1A1
		// @197: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @19A: bipush 46 (0x2E)
		// @19C: aaload
		// @19D: goto @1A7
		// @1A0: athrow
		// @1A1: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @1A4: bipush 43 (0x2B)
		// @1A6: aaload
		// @1A7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1AA: bipush 44 (0x2C)
		// @1AC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1AF: iload_2
		// @1B0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1B3: bipush 44 (0x2C)
		// @1B5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1B8: iload_3
		// @1B9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1BC: bipush 44 (0x2C)
		// @1BE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1C1: iload #4
		// @1C3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1C6: bipush 44 (0x2C)
		// @1C8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1CB: iload #5
		// @1CD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1D0: bipush 44 (0x2C)
		// @1D2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D5: iload #6
		// @1D7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1DA: bipush 44 (0x2C)
		// @1DC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1DF: iload #7
		// @1E1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1E4: bipush 44 (0x2C)
		// @1E6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1E9: iload #8
		// @1EB: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @1EE: bipush 44 (0x2C)
		// @1F0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F3: iload #9
		// @1F5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1F8: bipush 41 (0x29)
		// @1FA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1FD: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @200: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @203: athrow
		// @204: return
	}
	
	private final void func_103997_a(byte arg0, boolean arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #4
		// @005: bipush -2 (0xFE)
		// @007: getstatic int game.C_100102_w.field_104636_c
		// @00A: iconst_m1
		// @00B: ixor
		// @00C: if_icmpne @04B
		// @00F: getstatic int game.C_100273_mm.field_106684_c
		// @012: ifle @04B
		// @015: goto @019
		// @018: athrow
		// @019: getstatic int game.C_100096_un.field_104561_f
		// @01C: iconst_m1
		// @01D: ixor
		// @01E: iconst_m1
		// @01F: getstatic int[][][] game.C_100203_ql.field_105931_c
		// @022: arraylength
		// @023: iadd
		// @024: iconst_m1
		// @025: ixor
		// @026: if_icmple @04B
		// @029: goto @02D
		// @02C: athrow
		// @02D: bipush 95 (0x5F)
		// @02F: iload_1
		// @030: bipush 104 (0x68)
		// @032: ixor
		// @033: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @036: iconst_m1
		// @037: putstatic int game.C_100103_eh.field_104667_c
		// @03A: getstatic int game.C_100096_un.field_104561_f
		// @03D: iconst_1
		// @03E: iadd
		// @03F: putstatic int game.C_100096_un.field_104561_f
		// @042: iload #4
		// @044: ifeq @083
		// @047: goto @04B
		// @04A: athrow
		// @04B: iconst_1
		// @04C: getstatic int game.C_100102_w.field_104636_c
		// @04F: if_icmpne @083
		// @052: goto @056
		// @055: athrow
		// @056: iconst_0
		// @057: getstatic int game.C_100273_mm.field_106684_c
		// @05A: if_icmple @083
		// @05D: goto @061
		// @060: athrow
		// @061: iconst_0
		// @062: getstatic int game.C_100096_un.field_104561_f
		// @065: if_icmplt @070
		// @068: goto @06C
		// @06B: athrow
		// @06C: goto @083
		// @06F: athrow
		// @070: bipush 95 (0x5F)
		// @072: bipush 8 (0x08)
		// @074: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @077: iconst_m1
		// @078: putstatic int game.C_100103_eh.field_104667_c
		// @07B: getstatic int game.C_100096_un.field_104561_f
		// @07E: iconst_1
		// @07F: isub
		// @080: putstatic int game.C_100096_un.field_104561_f
		// @083: iload_1
		// @084: bipush 96 (0x60)
		// @086: if_icmpeq @091
		// @089: iconst_1
		// @08A: putstatic boolean game.C_100034_gi.field_104036_j
		// @08D: goto @091
		// @090: athrow
		// @091: iconst_4
		// @092: putstatic int game.C_100097_k.field_104581_e
		// @095: iload_2
		// @096: ifne @0A0
		// @099: getstatic int[] game.C_100066_dl.field_101632_G
		// @09C: goto @0A3
		// @09F: athrow
		// @0A0: getstatic int[] game.C_100139_tb.field_100529_w
		// @0A3: astore_3
		// @0A4: getstatic int game.C_100220_ac.field_106053_f
		// @0A7: iflt @0D4
		// @0AA: bipush 31 (0x1F)
		// @0AC: aload_3
		// @0AD: getstatic int game.C_100220_ac.field_106053_f
		// @0B0: invokestatic game.C_100111_el.func_104850_a(int, int[], int)boolean
		// @0B3: ifeq @0D4
		// @0B6: goto @0BA
		// @0B9: athrow
		// @0BA: getstatic int game.C_100220_ac.field_106053_f
		// @0BD: bipush 31 (0x1F)
		// @0BF: getstatic int[] game.C_100275_na.field_103095_q
		// @0C2: invokestatic game.C_100189_ri.func_105742_a(int, int, int[])boolean
		// @0C5: ifeq @0D4
		// @0C8: goto @0CC
		// @0CB: athrow
		// @0CC: iconst_m1
		// @0CD: putstatic int game.C_100220_ac.field_106053_f
		// @0D0: goto @0D4
		// @0D3: athrow
		// @0D4: iconst_1
		// @0D5: getstatic int game.C_100102_w.field_104636_c
		// @0D8: if_icmpne @122
		// @0DB: getstatic int game.C_100220_ac.field_106053_f
		// @0DE: iconst_m1
		// @0DF: if_icmpeq @0F0
		// @0E2: goto @0E6
		// @0E5: athrow
		// @0E6: iconst_0
		// @0E7: bipush 8 (0x08)
		// @0E9: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @0EC: goto @0F0
		// @0EF: athrow
		// @0F0: getstatic int game.C_100103_eh.field_104667_c
		// @0F3: getstatic int game.C_100220_ac.field_106053_f
		// @0F6: if_icmpeq @115
		// @0F9: iconst_0
		// @0FA: getstatic int game.C_100220_ac.field_106053_f
		// @0FD: iconst_m1
		// @0FE: ixor
		// @0FF: if_icmpeq @152
		// @102: goto @106
		// @105: athrow
		// @106: getstatic int game.C_100220_ac.field_106053_f
		// @109: putstatic int game.C_100103_eh.field_104667_c
		// @10C: iload #4
		// @10E: ifeq @152
		// @111: goto @115
		// @114: athrow
		// @115: iconst_m1
		// @116: putstatic int game.C_100103_eh.field_104667_c
		// @119: iload #4
		// @11B: ifeq @152
		// @11E: goto @122
		// @121: athrow
		// @122: iconst_0
		// @123: getstatic int game.C_100220_ac.field_106053_f
		// @126: if_icmpgt @152
		// @129: goto @12D
		// @12C: athrow
		// @12D: getstatic int game.C_100252_pn.field_105512_s
		// @130: getstatic int game.C_100220_ac.field_106053_f
		// @133: if_icmpeq @152
		// @136: goto @13A
		// @139: athrow
		// @13A: getstatic int game.C_100103_eh.field_104667_c
		// @13D: getstatic int game.C_100220_ac.field_106053_f
		// @140: if_icmpne @14B
		// @143: goto @147
		// @146: athrow
		// @147: goto @152
		// @14A: athrow
		// @14B: bipush 97 (0x61)
		// @14D: bipush 8 (0x08)
		// @14F: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @152: getstatic int game.C_100220_ac.field_106053_f
		// @155: putstatic int game.C_100252_pn.field_105512_s
		// @158: goto @186
		// @15B: astore_3
		// @15C: aload_3
		// @15D: new java.lang.StringBuilder
		// @160: dup
		// @161: invokespecial java.lang.StringBuilder.<init>()void
		// @164: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @167: bipush 48 (0x30)
		// @169: aaload
		// @16A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16D: iload_1
		// @16E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @171: bipush 44 (0x2C)
		// @173: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @176: iload_2
		// @177: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @17A: bipush 41 (0x29)
		// @17C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @182: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @185: athrow
		// @186: return
	}
	
	static final void func_103994_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		// @00: getstatic game.C_100302_ka game.C_100245_pf.field_106388_b
		// @03: iload_1
		// @04: iload_2
		// @05: iconst_m1
		// @06: iload #4
		// @08: iload_0
		// @09: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0C: iload #6
		// @0E: ifeq @26
		// @11: bipush 67 (0x43)
		// @13: bipush -116 (0x8C)
		// @15: bipush 90 (0x5A)
		// @17: bipush 54 (0x36)
		// @19: bipush 33 (0x21)
		// @1B: bipush -71 (0xB9)
		// @1D: bipush -13 (0xF3)
		// @1F: invokestatic game.C_100034_gi.func_103994_a(int, int, int, int, int, int, int)void
		// @22: goto @26
		// @25: athrow
		// @26: aconst_null
		// @27: getstatic game.C_100033_gj game.C_100159_sn.field_105401_e
		// @2A: if_acmpeq @45
		// @2D: getstatic game.C_100033_gj game.C_100159_sn.field_105401_e
		// @30: bipush 84 (0x54)
		// @32: getstatic int game.C_100231_oc.field_102200_Wb
		// @35: ineg
		// @36: iload #5
		// @38: iadd
		// @39: iload_2
		// @3A: iload_2
		// @3B: iload #5
		// @3D: iload_3
		// @3E: invokevirtual game.C_100033_gj.func_101892_a(byte, int, int, int, int, int)void
		// @41: goto @45
		// @44: athrow
		// @45: goto @A5
		// @48: astore #7
		// @4A: aload #7
		// @4C: new java.lang.StringBuilder
		// @4F: dup
		// @50: invokespecial java.lang.StringBuilder.<init>()void
		// @53: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @56: bipush 37 (0x25)
		// @58: aaload
		// @59: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5C: iload_0
		// @5D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @60: bipush 44 (0x2C)
		// @62: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @65: iload_1
		// @66: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @69: bipush 44 (0x2C)
		// @6B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6E: iload_2
		// @6F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @72: bipush 44 (0x2C)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: iload_3
		// @78: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7B: bipush 44 (0x2C)
		// @7D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @80: iload #4
		// @82: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @85: bipush 44 (0x2C)
		// @87: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8A: iload #5
		// @8C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8F: bipush 44 (0x2C)
		// @91: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @94: iload #6
		// @96: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @99: bipush 41 (0x29)
		// @9B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A1: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A4: athrow
		// @A5: return
	}
	
	private final void func_104001_a(byte arg0, int arg1, boolean arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #14
		// @005: getstatic int[][] game.C_100012_fh.field_100515_K
		// @008: aload_0
		// @009: getfield int game.C_100034_gi.field_104030_e
		// @00C: aaload
		// @00D: iload_2
		// @00E: iaload
		// @00F: istore #4
		// @011: iload #4
		// @013: iconst_m1
		// @014: ixor
		// @015: ifeq @01C
		// @018: goto @01E
		// @01B: athrow
		// @01C: iconst_0
		// @01D: istore_3
		// @01E: iconst_0
		// @01F: istore #5
		// @021: iload #4
		// @023: iconst_m1
		// @024: ixor
		// @025: bipush -2 (0xFE)
		// @027: if_icmpeq @042
		// @02A: bipush 33 (0x21)
		// @02C: iload #4
		// @02E: if_icmpeq @042
		// @031: goto @035
		// @034: athrow
		// @035: bipush -40 (0xD8)
		// @037: iload #4
		// @039: iconst_m1
		// @03A: ixor
		// @03B: if_icmpne @056
		// @03E: goto @042
		// @041: athrow
		// @042: bipush 66 (0x42)
		// @044: invokestatic game.C_100288_jn.func_106838_b(int)boolean
		// @047: ifne @053
		// @04A: goto @04E
		// @04D: athrow
		// @04E: iconst_1
		// @04F: goto @054
		// @052: athrow
		// @053: iconst_0
		// @054: istore #5
		// @056: getstatic game.C_100037_wb[] game.C_100285_nk.field_106786_j
		// @059: astore #6
		// @05B: aload_0
		// @05C: bipush 122 (0x7A)
		// @05E: iload_2
		// @05F: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @062: istore #7
		// @064: aload_0
		// @065: bipush -4 (0xFC)
		// @067: iload_2
		// @068: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @06B: istore #8
		// @06D: aload_0
		// @06E: iload_2
		// @06F: bipush 106 (0x6A)
		// @071: invokespecial game.C_100034_gi.func_104002_b(int, byte)int
		// @074: iload #7
		// @076: isub
		// @077: istore #9
		// @079: iload_1
		// @07A: bipush 88 (0x58)
		// @07C: if_icmpgt @080
		// @07F: return
		// @080: aload_0
		// @081: iload_2
		// @082: sipush -22631 (0xA799)
		// @085: invokespecial game.C_100034_gi.func_103985_b(int, int)int
		// @088: istore #10
		// @08A: iload #7
		// @08C: iload #8
		// @08E: bipush -103 (0x99)
		// @090: iload #9
		// @092: aload #6
		// @094: iload #10
		// @096: invokestatic game.C_100157_db.func_103554_a(int, int, int, int, game.C_100037_wb[], int)void
		// @099: iload #4
		// @09B: iflt @2E4
		// @09E: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @0A1: iload #4
		// @0A3: aaload
		// @0A4: astore #11
		// @0A6: bipush -9 (0xF7)
		// @0A8: iload #4
		// @0AA: iconst_m1
		// @0AB: ixor
		// @0AC: if_icmpne @161
		// @0AF: getstatic int game.C_100069_vb.field_104357_e
		// @0B2: iconst_m1
		// @0B3: ixor
		// @0B4: iconst_m1
		// @0B5: if_icmpeq @159
		// @0B8: goto @0BC
		// @0BB: athrow
		// @0BC: iconst_m1
		// @0BD: getstatic int game.C_100050_vg.field_100632_k
		// @0C0: iconst_m1
		// @0C1: ixor
		// @0C2: if_icmpeq @159
		// @0C5: goto @0C9
		// @0C8: athrow
		// @0C9: bipush -13 (0xF3)
		// @0CB: getstatic int game.C_100069_vb.field_104357_e
		// @0CE: iconst_m1
		// @0CF: ixor
		// @0D0: if_icmpeq @159
		// @0D3: goto @0D7
		// @0D6: athrow
		// @0D7: getstatic int game.C_100050_vg.field_100632_k
		// @0DA: bipush 12 (0x0C)
		// @0DC: if_icmpeq @159
		// @0DF: goto @0E3
		// @0E2: athrow
		// @0E3: bipush -2 (0xFE)
		// @0E5: getstatic int game.C_100069_vb.field_104357_e
		// @0E8: iconst_m1
		// @0E9: ixor
		// @0EA: if_icmpeq @0FC
		// @0ED: goto @0F1
		// @0F0: athrow
		// @0F1: getstatic int game.C_100050_vg.field_100632_k
		// @0F4: iconst_1
		// @0F5: if_icmpne @106
		// @0F8: goto @0FC
		// @0FB: athrow
		// @0FC: getstatic java.lang.String game.C_100343_jf.field_104827_j
		// @0FF: astore #11
		// @101: iload #14
		// @103: ifeq @161
		// @106: iconst_2
		// @107: getstatic int game.C_100069_vb.field_104357_e
		// @10A: if_icmpeq @14F
		// @10D: goto @111
		// @110: athrow
		// @111: getstatic int game.C_100050_vg.field_100632_k
		// @114: iconst_2
		// @115: if_icmpeq @14F
		// @118: goto @11C
		// @11B: athrow
		// @11C: getstatic int game.C_100069_vb.field_104357_e
		// @11F: iconst_3
		// @120: if_icmpeq @14F
		// @123: goto @127
		// @126: athrow
		// @127: getstatic int game.C_100050_vg.field_100632_k
		// @12A: iconst_3
		// @12B: if_icmpeq @14F
		// @12E: goto @132
		// @131: athrow
		// @132: bipush -5 (0xFB)
		// @134: getstatic int game.C_100069_vb.field_104357_e
		// @137: iconst_m1
		// @138: ixor
		// @139: if_icmpeq @14F
		// @13C: goto @140
		// @13F: athrow
		// @140: getstatic int game.C_100050_vg.field_100632_k
		// @143: iconst_4
		// @144: if_icmpeq @14F
		// @147: goto @14B
		// @14A: athrow
		// @14B: goto @161
		// @14E: athrow
		// @14F: getstatic java.lang.String game.C_100282_nh.field_102710_Nb
		// @152: astore #11
		// @154: iload #14
		// @156: ifeq @161
		// @159: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @15C: bipush 7 (0x07)
		// @15E: aaload
		// @15F: astore #11
		// @161: iload #4
		// @163: iconst_m1
		// @164: ixor
		// @165: iconst_m1
		// @166: if_icmpne @181
		// @169: bipush -21 (0xEB)
		// @16B: aload_0
		// @16C: getfield int game.C_100034_gi.field_104030_e
		// @16F: iconst_m1
		// @170: ixor
		// @171: if_icmpeq @17C
		// @174: goto @178
		// @177: athrow
		// @178: goto @181
		// @17B: athrow
		// @17C: getstatic java.lang.String game.C_100236_on.field_100898_m
		// @17F: astore #11
		// @181: aload #11
		// @183: iconst_0
		// @184: invokestatic game.C_100096_un.func_104560_a(java.lang.String, boolean)java.lang.String
		// @187: astore #11
		// @189: iload #5
		// @18B: ifne @192
		// @18E: goto @1C3
		// @191: athrow
		// @192: new java.lang.StringBuilder
		// @195: dup
		// @196: invokespecial java.lang.StringBuilder.<init>()void
		// @199: aload #11
		// @19B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @19E: ldc_w " "
		// @1A1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1A4: getstatic int game.C_100103_eh.field_104672_h
		// @1A7: bipush 33 (0x21)
		// @1A9: imul
		// @1AA: bipush 33 (0x21)
		// @1AC: getstatic int game.C_100036_gg.field_103152_Q
		// @1AF: imul
		// @1B0: getstatic int game.C_100215_ai.field_106021_k
		// @1B3: idiv
		// @1B4: iadd
		// @1B5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1B8: ldc_w "%"
		// @1BB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1BE: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1C1: astore #11
		// @1C3: iload_3
		// @1C4: ifeq @1CD
		// @1C7: ldc 1044724 (0xff0f4)
		// @1C9: goto @1CF
		// @1CC: athrow
		// @1CD: ldc 1021128 (0xf94c8)
		// @1CF: istore #12
		// @1D1: aload_0
		// @1D2: iload_2
		// @1D3: bipush -4 (0xFC)
		// @1D5: invokespecial game.C_100034_gi.func_103977_a(int, int)boolean
		// @1D8: ifeq @1DF
		// @1DB: goto @209
		// @1DE: athrow
		// @1DF: iload_3
		// @1E0: ifeq @1FD
		// @1E3: bipush -27 (0xE5)
		// @1E5: iload #4
		// @1E7: iconst_m1
		// @1E8: ixor
		// @1E9: if_icmpeq @1FD
		// @1EC: goto @1F0
		// @1EF: athrow
		// @1F0: iload #4
		// @1F2: iconst_m1
		// @1F3: ixor
		// @1F4: bipush -26 (0xE6)
		// @1F6: if_icmpne @204
		// @1F9: goto @1FD
		// @1FC: athrow
		// @1FD: ldc_w 7829367 (0x777777)
		// @200: goto @207
		// @203: athrow
		// @204: ldc_w 11184895 (0xaaaaff)
		// @207: istore #12
		// @209: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @20C: aload #11
		// @20E: invokevirtual game.C_100193_re.func_101739_b(java.lang.String)int
		// @211: istore #13
		// @213: iload #5
		// @215: ifne @21C
		// @218: goto @221
		// @21B: athrow
		// @21C: ldc_w 11417637 (0xae3825)
		// @21F: istore #12
		// @221: aconst_null
		// @222: aload #6
		// @224: iconst_0
		// @225: aaload
		// @226: if_acmpne @22D
		// @229: goto @247
		// @22C: athrow
		// @22D: iload #7
		// @22F: aload #6
		// @231: iconst_0
		// @232: aaload
		// @233: getfield int game.C_100037_wb.field_102341_y
		// @236: iadd
		// @237: istore #7
		// @239: iload #9
		// @23B: iconst_2
		// @23C: aload #6
		// @23E: iconst_0
		// @23F: aaload
		// @240: getfield int game.C_100037_wb.field_102341_y
		// @243: imul
		// @244: isub
		// @245: istore #9
		// @247: bipush -34 (0xDE)
		// @249: iload #4
		// @24B: iconst_m1
		// @24C: ixor
		// @24D: if_icmpeq @25B
		// @250: iload #4
		// @252: bipush 40 (0x28)
		// @254: if_icmpne @28A
		// @257: goto @25B
		// @25A: athrow
		// @25B: bipush -17 (0xEF)
		// @25D: getstatic int game.C_100068_vc.field_104343_e
		// @260: iconst_m1
		// @261: ixor
		// @262: if_icmpne @28A
		// @265: goto @269
		// @268: athrow
		// @269: iload_3
		// @26A: ifne @28A
		// @26D: goto @271
		// @270: athrow
		// @271: bipush 32 (0x20)
		// @273: getstatic int game.C_100066_dl.field_101636_H
		// @276: iand
		// @277: iconst_m1
		// @278: ixor
		// @279: iconst_m1
		// @27A: if_icmpeq @285
		// @27D: goto @281
		// @280: athrow
		// @281: goto @28A
		// @284: athrow
		// @285: ldc_w 13696896 (0xd0ff80)
		// @288: istore #12
		// @28A: iload #9
		// @28C: iload #13
		// @28E: if_icmpge @2C0
		// @291: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @294: aload #11
		// @296: iload #7
		// @298: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @29B: getfield int game.C_100193_re.field_101772_Q
		// @29E: ineg
		// @29F: iload #8
		// @2A1: iload #10
		// @2A3: iconst_2
		// @2A4: idiv
		// @2A5: ineg
		// @2A6: isub
		// @2A7: iadd
		// @2A8: iload #9
		// @2AA: iload #10
		// @2AC: iload #12
		// @2AE: iconst_m1
		// @2AF: iconst_1
		// @2B0: iconst_0
		// @2B1: bipush 10 (0x0A)
		// @2B3: invokevirtual game.C_100193_re.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @2B6: pop
		// @2B7: iload #14
		// @2B9: ifeq @2DF
		// @2BC: goto @2C0
		// @2BF: athrow
		// @2C0: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @2C3: aload #11
		// @2C5: iload #9
		// @2C7: iconst_2
		// @2C8: idiv
		// @2C9: iload #7
		// @2CB: iadd
		// @2CC: iload #10
		// @2CE: iconst_2
		// @2CF: idiv
		// @2D0: iload #8
		// @2D2: iconst_4
		// @2D3: iadd
		// @2D4: iadd
		// @2D5: iload #12
		// @2D7: iconst_m1
		// @2D8: invokevirtual game.C_100193_re.func_101744_b(java.lang.String, int, int, int, int)void
		// @2DB: goto @2DF
		// @2DE: athrow
		// @2DF: iload #14
		// @2E1: ifeq @2F6
		// @2E4: getstatic game.C_100037_wb game.C_100018_wk.field_101550_s
		// @2E7: iconst_3
		// @2E8: iload #7
		// @2EA: iadd
		// @2EB: iconst_2
		// @2EC: iload #8
		// @2EE: iadd
		// @2EF: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @2F2: goto @2F6
		// @2F5: athrow
		// @2F6: goto @32F
		// @2F9: astore #4
		// @2FB: aload #4
		// @2FD: new java.lang.StringBuilder
		// @300: dup
		// @301: invokespecial java.lang.StringBuilder.<init>()void
		// @304: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @307: bipush 110 (0x6E)
		// @309: aaload
		// @30A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30D: iload_1
		// @30E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @311: bipush 44 (0x2C)
		// @313: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @316: iload_2
		// @317: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @31A: bipush 44 (0x2C)
		// @31C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @31F: iload_3
		// @320: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @323: bipush 41 (0x29)
		// @325: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @328: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @32B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @32E: athrow
		// @32F: return
	}
	
	private final int func_104002_b(int arg0, byte arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: aload_0
		// @006: bipush -124 (0x84)
		// @008: iload_1
		// @009: invokespecial game.C_100034_gi.func_104011_b(byte, int)int
		// @00C: istore_3
		// @00D: iconst_0
		// @00E: iload_3
		// @00F: if_icmpgt @01A
		// @012: iconst_1
		// @013: iload_3
		// @014: iadd
		// @015: sipush 159 (0x009F)
		// @018: imul
		// @019: ireturn
		// @01A: bipush -6 (0xFA)
		// @01C: aload_0
		// @01D: getfield int game.C_100034_gi.field_104030_e
		// @020: iconst_m1
		// @021: ixor
		// @022: if_icmpne @050
		// @025: bipush -25 (0xE7)
		// @027: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @02A: ifne @050
		// @02D: goto @031
		// @030: athrow
		// @031: iload_1
		// @032: iconst_m1
		// @033: ixor
		// @034: bipush -4 (0xFC)
		// @036: if_icmpgt @044
		// @039: goto @03D
		// @03C: athrow
		// @03D: sipush 380 (0x017C)
		// @040: goto @04F
		// @043: athrow
		// @044: sipush 144 (0x0090)
		// @047: aload_0
		// @048: bipush 104 (0x68)
		// @04A: iload_1
		// @04B: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @04E: iadd
		// @04F: ireturn
		// @050: aload_0
		// @051: getfield int game.C_100034_gi.field_104030_e
		// @054: bipush 6 (0x06)
		// @056: if_icmpne @081
		// @059: bipush -25 (0xE7)
		// @05B: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @05E: ifne @081
		// @061: goto @065
		// @064: athrow
		// @065: iconst_2
		// @066: iload_1
		// @067: if_icmple @07D
		// @06A: goto @06E
		// @06D: athrow
		// @06E: sipush 160 (0x00A0)
		// @071: aload_0
		// @072: bipush 107 (0x6B)
		// @074: iload_1
		// @075: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @078: iadd
		// @079: goto @080
		// @07C: athrow
		// @07D: sipush 380 (0x017C)
		// @080: ireturn
		// @081: aload_0
		// @082: getfield int game.C_100034_gi.field_104030_e
		// @085: iconst_m1
		// @086: ixor
		// @087: bipush -8 (0xF8)
		// @089: if_icmpne @098
		// @08C: sipush 140 (0x008C)
		// @08F: aload_0
		// @090: bipush 113 (0x71)
		// @092: iload_1
		// @093: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @096: iadd
		// @097: ireturn
		// @098: bipush 14 (0x0E)
		// @09A: aload_0
		// @09B: getfield int game.C_100034_gi.field_104030_e
		// @09E: if_icmpeq @0B0
		// @0A1: bipush -14 (0xF2)
		// @0A3: aload_0
		// @0A4: getfield int game.C_100034_gi.field_104030_e
		// @0A7: iconst_m1
		// @0A8: ixor
		// @0A9: if_icmpne @0BC
		// @0AC: goto @0B0
		// @0AF: athrow
		// @0B0: sipush 160 (0x00A0)
		// @0B3: aload_0
		// @0B4: bipush 117 (0x75)
		// @0B6: iload_1
		// @0B7: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @0BA: iadd
		// @0BB: ireturn
		// @0BC: iconst_0
		// @0BD: aload_0
		// @0BE: getfield int game.C_100034_gi.field_104030_e
		// @0C1: if_icmpne @0E3
		// @0C4: getstatic int[][] game.C_100012_fh.field_100515_K
		// @0C7: aload_0
		// @0C8: getfield int game.C_100034_gi.field_104030_e
		// @0CB: aaload
		// @0CC: iload_1
		// @0CD: iaload
		// @0CE: istore #4
		// @0D0: bipush 34 (0x22)
		// @0D2: iload #4
		// @0D4: if_icmpeq @0DB
		// @0D7: goto @0DF
		// @0DA: athrow
		// @0DB: sipush 150 (0x0096)
		// @0DE: ireturn
		// @0DF: sipush 450 (0x01C2)
		// @0E2: ireturn
		// @0E3: aload_0
		// @0E4: getfield int game.C_100034_gi.field_104030_e
		// @0E7: iconst_m1
		// @0E8: ixor
		// @0E9: bipush -18 (0xEE)
		// @0EB: if_icmpeq @0F2
		// @0EE: goto @0FF
		// @0F1: athrow
		// @0F2: aload_0
		// @0F3: bipush 109 (0x6D)
		// @0F5: iload_1
		// @0F6: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @0F9: ineg
		// @0FA: sipush 640 (0x0280)
		// @0FD: iadd
		// @0FE: ireturn
		// @0FF: aload_0
		// @100: bipush 122 (0x7A)
		// @102: invokespecial game.C_100034_gi.func_103976_d(int)boolean
		// @105: ifeq @115
		// @108: aload_0
		// @109: bipush 91 (0x5B)
		// @10B: iload_1
		// @10C: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @10F: ineg
		// @110: sipush 640 (0x0280)
		// @113: iadd
		// @114: ireturn
		// @115: bipush -16 (0xF0)
		// @117: aload_0
		// @118: getfield int game.C_100034_gi.field_104030_e
		// @11B: iconst_m1
		// @11C: ixor
		// @11D: if_icmpeq @124
		// @120: goto @128
		// @123: athrow
		// @124: sipush 600 (0x0258)
		// @127: ireturn
		// @128: bipush -20 (0xEC)
		// @12A: aload_0
		// @12B: getfield int game.C_100034_gi.field_104030_e
		// @12E: iconst_m1
		// @12F: ixor
		// @130: if_icmpeq @137
		// @133: goto @158
		// @136: athrow
		// @137: aload_0
		// @138: bipush 93 (0x5D)
		// @13A: iload_1
		// @13B: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @13E: getstatic int[] game.C_100333_ij.field_107345_d
		// @141: getstatic int[][] game.C_100012_fh.field_100515_K
		// @144: aload_0
		// @145: getfield int game.C_100034_gi.field_104030_e
		// @148: aaload
		// @149: if_acmpne @153
		// @14C: sipush 180 (0x00B4)
		// @14F: goto @156
		// @152: athrow
		// @153: sipush 260 (0x0104)
		// @156: iadd
		// @157: ireturn
		// @158: iload_2
		// @159: bipush 53 (0x35)
		// @15B: if_icmpgt @16A
		// @15E: aload_0
		// @15F: aconst_null
		// @160: checkcast game.C_100333_ij
		// @163: putfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @166: goto @16A
		// @169: athrow
		// @16A: aload_0
		// @16B: getfield int game.C_100034_gi.field_104030_e
		// @16E: iconst_m1
		// @16F: ixor
		// @170: bipush -21 (0xEB)
		// @172: if_icmpne @1CA
		// @175: getstatic int[][] game.C_100012_fh.field_100515_K
		// @178: aload_0
		// @179: getfield int game.C_100034_gi.field_104030_e
		// @17C: aaload
		// @17D: iload_1
		// @17E: iaload
		// @17F: istore #4
		// @181: iload #4
		// @183: bipush 25 (0x19)
		// @185: if_icmpeq @1B2
		// @188: bipush -27 (0xE5)
		// @18A: iload #4
		// @18C: iconst_m1
		// @18D: ixor
		// @18E: if_icmpne @19E
		// @191: goto @195
		// @194: athrow
		// @195: iload #5
		// @197: ifeq @1B2
		// @19A: goto @19E
		// @19D: athrow
		// @19E: bipush 39 (0x27)
		// @1A0: iload #4
		// @1A2: if_icmpne @1CA
		// @1A5: goto @1A9
		// @1A8: athrow
		// @1A9: iload #5
		// @1AB: ifeq @1BD
		// @1AE: goto @1B2
		// @1B1: athrow
		// @1B2: aload_0
		// @1B3: bipush 105 (0x69)
		// @1B5: iload_1
		// @1B6: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @1B9: bipush -60 (0xC4)
		// @1BB: isub
		// @1BC: ireturn
		// @1BD: aload_0
		// @1BE: bipush 89 (0x59)
		// @1C0: iload_1
		// @1C1: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @1C4: ineg
		// @1C5: sipush 640 (0x0280)
		// @1C8: iadd
		// @1C9: ireturn
		// @1CA: getstatic int[] game.C_100012_fh.field_100513_I
		// @1CD: aload_0
		// @1CE: getfield int game.C_100034_gi.field_104030_e
		// @1D1: iaload
		// @1D2: ireturn
		// @1D3: astore_3
		// @1D4: aload_3
		// @1D5: new java.lang.StringBuilder
		// @1D8: dup
		// @1D9: invokespecial java.lang.StringBuilder.<init>()void
		// @1DC: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @1DF: bipush 64 (0x40)
		// @1E1: aaload
		// @1E2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1E5: iload_1
		// @1E6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1E9: bipush 44 (0x2C)
		// @1EB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1EE: iload_2
		// @1EF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1F2: bipush 41 (0x29)
		// @1F4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1FA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1FD: athrow
	}
	
	private final boolean func_103976_d(int arg0)
	{
		// @00: iload_1
		// @01: bipush 108 (0x6C)
		// @03: if_icmpge @08
		// @06: iconst_1
		// @07: ireturn
		// @08: iconst_1
		// @09: aload_0
		// @0A: getfield int game.C_100034_gi.field_104030_e
		// @0D: if_icmpeq @4A
		// @10: bipush -3 (0xFD)
		// @12: aload_0
		// @13: getfield int game.C_100034_gi.field_104030_e
		// @16: iconst_m1
		// @17: ixor
		// @18: if_icmpeq @4A
		// @1B: goto @1F
		// @1E: athrow
		// @1F: aload_0
		// @20: getfield int game.C_100034_gi.field_104030_e
		// @23: iconst_m1
		// @24: ixor
		// @25: bipush -4 (0xFC)
		// @27: if_icmpeq @4A
		// @2A: goto @2E
		// @2D: athrow
		// @2E: aload_0
		// @2F: getfield int game.C_100034_gi.field_104030_e
		// @32: iconst_m1
		// @33: ixor
		// @34: bipush -5 (0xFB)
		// @36: if_icmpeq @4A
		// @39: goto @3D
		// @3C: athrow
		// @3D: aload_0
		// @3E: getfield int game.C_100034_gi.field_104030_e
		// @41: bipush 22 (0x16)
		// @43: if_icmpne @4F
		// @46: goto @4A
		// @49: athrow
		// @4A: iconst_1
		// @4B: goto @50
		// @4E: athrow
		// @4F: iconst_0
		// @50: ireturn
		// @51: astore_2
		// @52: aload_2
		// @53: new java.lang.StringBuilder
		// @56: dup
		// @57: invokespecial java.lang.StringBuilder.<init>()void
		// @5A: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @5D: bipush 53 (0x35)
		// @5F: aaload
		// @60: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @63: iload_1
		// @64: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @67: bipush 41 (0x29)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @72: athrow
	}
	
	private final int func_103986_a(int arg0, int arg1, byte arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: iload_3
		// @06: bipush -57 (0xC7)
		// @08: if_icmple @15
		// @0B: aload_0
		// @0C: bipush -63 (0xC1)
		// @0E: invokespecial game.C_100034_gi.func_104012_d(byte)void
		// @11: goto @15
		// @14: athrow
		// @15: iconst_0
		// @16: istore #4
		// @18: getstatic int[][] game.C_100012_fh.field_100515_K
		// @1B: aload_0
		// @1C: getfield int game.C_100034_gi.field_104030_e
		// @1F: aaload
		// @20: arraylength
		// @21: iload #4
		// @23: if_icmple @92
		// @26: aload_0
		// @27: bipush -4 (0xFC)
		// @29: iload #4
		// @2B: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @2E: istore #5
		// @30: aload_0
		// @31: iload #4
		// @33: bipush -67 (0xBD)
		// @35: invokespecial game.C_100034_gi.func_104003_a(int, byte)boolean
		// @38: iload #6
		// @3A: ifne @93
		// @3D: ifeq @8A
		// @40: goto @44
		// @43: athrow
		// @44: aload_0
		// @45: bipush 94 (0x5E)
		// @47: iload #4
		// @49: invokespecial game.C_100034_gi.func_104026_a(byte, int)int
		// @4C: iconst_m1
		// @4D: ixor
		// @4E: iload_1
		// @4F: iconst_m1
		// @50: ixor
		// @51: if_icmplt @8A
		// @54: goto @58
		// @57: athrow
		// @58: aload_0
		// @59: iload #4
		// @5B: bipush 64 (0x40)
		// @5D: invokespecial game.C_100034_gi.func_104002_b(int, byte)int
		// @60: iload_1
		// @61: if_icmple @8A
		// @64: goto @68
		// @67: athrow
		// @68: iload #5
		// @6A: iload_2
		// @6B: if_icmpgt @8A
		// @6E: goto @72
		// @71: athrow
		// @72: iload #5
		// @74: aload_0
		// @75: iload #4
		// @77: sipush -22631 (0xA799)
		// @7A: invokespecial game.C_100034_gi.func_103985_b(int, int)int
		// @7D: ineg
		// @7E: isub
		// @7F: iload_2
		// @80: if_icmple @8A
		// @83: goto @87
		// @86: athrow
		// @87: iload #4
		// @89: ireturn
		// @8A: iinc #4 +1
		// @8D: iload #6
		// @8F: ifeq @18
		// @92: iconst_m1
		// @93: ireturn
		// @94: astore #4
		// @96: aload #4
		// @98: new java.lang.StringBuilder
		// @9B: dup
		// @9C: invokespecial java.lang.StringBuilder.<init>()void
		// @9F: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @A2: bipush 49 (0x31)
		// @A4: aaload
		// @A5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A8: iload_1
		// @A9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AC: bipush 44 (0x2C)
		// @AE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B1: iload_2
		// @B2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B5: bipush 44 (0x2C)
		// @B7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BA: iload_3
		// @BB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BE: bipush 41 (0x29)
		// @C0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C6: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C9: athrow
	}
	
	final void func_104022_a(boolean arg0, boolean arg1, int arg2)
	{
		// @00: aload_0
		// @01: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @04: getfield int game.C_100333_ij.field_107347_b
		// @07: iconst_m1
		// @08: ixor
		// @09: ifeq @14
		// @0C: aload_0
		// @0D: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @10: getfield int game.C_100333_ij.field_107347_b
		// @13: istore_3
		// @14: aload_0
		// @15: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @18: iconst_0
		// @19: aload_0
		// @1A: getstatic int game.C_100015_wh.field_103781_g
		// @1D: getstatic int game.C_100338_jc.field_105370_l
		// @20: bipush -94 (0xA2)
		// @22: invokespecial game.C_100034_gi.func_103986_a(int, int, byte)int
		// @25: iload_3
		// @26: iload_2
		// @27: invokevirtual game.C_100333_ij.func_107340_a(int, int, int, boolean)void
		// @2A: iconst_m1
		// @2B: putstatic int game.C_100220_ac.field_106053_f
		// @2E: iconst_m1
		// @2F: putstatic int game.C_100103_eh.field_104667_c
		// @32: iload_1
		// @33: ifeq @40
		// @36: aload_0
		// @37: bipush 106 (0x6A)
		// @39: invokespecial game.C_100034_gi.func_103995_f(int)void
		// @3C: goto @40
		// @3F: athrow
		// @40: getstatic int game.C_100066_dl.field_101636_H
		// @43: putstatic int game.C_100005_fk.field_103603_i
		// @46: goto @7F
		// @49: astore #4
		// @4B: aload #4
		// @4D: new java.lang.StringBuilder
		// @50: dup
		// @51: invokespecial java.lang.StringBuilder.<init>()void
		// @54: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @57: bipush 104 (0x68)
		// @59: aaload
		// @5A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5D: iload_1
		// @5E: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @61: bipush 44 (0x2C)
		// @63: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @66: iload_2
		// @67: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @6A: bipush 44 (0x2C)
		// @6C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6F: iload_3
		// @70: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @73: bipush 41 (0x29)
		// @75: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @78: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7E: athrow
		// @7F: return
	}
	
	private final void func_104024_o(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #12
		// @005: bipush -2 (0xFE)
		// @007: getstatic int game.C_100102_w.field_104636_c
		// @00A: iconst_m1
		// @00B: ixor
		// @00C: if_icmpne @B10
		// @00F: getstatic int game.C_100094_j.field_104549_b
		// @012: bipush 17 (0x11)
		// @014: isub
		// @015: istore_2
		// @016: iconst_0
		// @017: iload_2
		// @018: if_icmpgt @02B
		// @01B: iload_2
		// @01C: iconst_m1
		// @01D: ixor
		// @01E: bipush -6 (0xFA)
		// @020: if_icmplt @02B
		// @023: goto @027
		// @026: athrow
		// @027: goto @044
		// @02A: athrow
		// @02B: getstatic int game.C_100094_j.field_104549_b
		// @02E: bipush -24 (0xE8)
		// @030: iadd
		// @031: istore_2
		// @032: iload_2
		// @033: iconst_m1
		// @034: ixor
		// @035: iconst_m1
		// @036: if_icmpgt @042
		// @039: iconst_3
		// @03A: iload_2
		// @03B: if_icmpgt @044
		// @03E: goto @042
		// @041: athrow
		// @042: iconst_0
		// @043: istore_2
		// @044: iconst_0
		// @045: istore_3
		// @046: iconst_0
		// @047: istore #4
		// @049: getstatic int game.C_100094_j.field_104549_b
		// @04C: istore #5
		// @04E: iconst_m1
		// @04F: iload #5
		// @051: iconst_m1
		// @052: ixor
		// @053: if_icmpeq @0B7
		// @056: iconst_2
		// @057: iload #5
		// @059: if_icmpne @069
		// @05C: goto @060
		// @05F: athrow
		// @060: iload #12
		// @062: ifeq @0C3
		// @065: goto @069
		// @068: athrow
		// @069: iload #5
		// @06B: iconst_4
		// @06C: if_icmpeq @0D0
		// @06F: goto @073
		// @072: athrow
		// @073: iload #5
		// @075: iconst_m1
		// @076: ixor
		// @077: bipush -2 (0xFE)
		// @079: if_icmpne @089
		// @07C: goto @080
		// @07F: athrow
		// @080: iload #12
		// @082: ifeq @0DE
		// @085: goto @089
		// @088: athrow
		// @089: iload #5
		// @08B: iconst_3
		// @08C: if_icmpeq @0EA
		// @08F: goto @093
		// @092: athrow
		// @093: iload #5
		// @095: iconst_5
		// @096: if_icmpeq @0F7
		// @099: goto @09D
		// @09C: athrow
		// @09D: bipush 9 (0x09)
		// @09F: iload #5
		// @0A1: if_icmpeq @105
		// @0A4: goto @0A8
		// @0A7: athrow
		// @0A8: iload #5
		// @0AA: bipush 13 (0x0D)
		// @0AC: if_icmpeq @105
		// @0AF: goto @0B3
		// @0B2: athrow
		// @0B3: goto @15F
		// @0B6: athrow
		// @0B7: iconst_3
		// @0B8: istore #4
		// @0BA: iconst_0
		// @0BB: istore_3
		// @0BC: iconst_0
		// @0BD: istore_2
		// @0BE: iload #12
		// @0C0: ifeq @15F
		// @0C3: bipush 6 (0x06)
		// @0C5: istore #4
		// @0C7: iconst_2
		// @0C8: istore_2
		// @0C9: iconst_3
		// @0CA: istore_3
		// @0CB: iload #12
		// @0CD: ifeq @15F
		// @0D0: iconst_4
		// @0D1: istore_2
		// @0D2: bipush 6 (0x06)
		// @0D4: istore_3
		// @0D5: bipush 12 (0x0C)
		// @0D7: istore #4
		// @0D9: iload #12
		// @0DB: ifeq @15F
		// @0DE: iconst_3
		// @0DF: istore #4
		// @0E1: iconst_0
		// @0E2: istore_2
		// @0E3: iconst_0
		// @0E4: istore_3
		// @0E5: iload #12
		// @0E7: ifeq @15F
		// @0EA: iconst_3
		// @0EB: istore_3
		// @0EC: iconst_2
		// @0ED: istore_2
		// @0EE: bipush 6 (0x06)
		// @0F0: istore #4
		// @0F2: iload #12
		// @0F4: ifeq @15F
		// @0F7: iconst_4
		// @0F8: istore_2
		// @0F9: bipush 6 (0x06)
		// @0FB: istore_3
		// @0FC: bipush 12 (0x0C)
		// @0FE: istore #4
		// @100: iload #12
		// @102: ifeq @15F
		// @105: iconst_m1
		// @106: getstatic int game.C_100094_j.field_104549_b
		// @109: iadd
		// @10A: istore_2
		// @10B: getstatic int[] game.C_100075_uj.field_100655_u
		// @10E: iconst_1
		// @10F: getstatic int[] game.C_100075_uj.field_100655_u
		// @112: iconst_1
		// @113: iaload
		// @114: iconst_1
		// @115: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @118: iastore
		// @119: iconst_0
		// @11A: istore_3
		// @11B: getstatic int[] game.C_100075_uj.field_100655_u
		// @11E: iconst_0
		// @11F: getstatic int[] game.C_100075_uj.field_100655_u
		// @122: iconst_0
		// @123: iaload
		// @124: ldc_w 67108864 (0x4000000)
		// @127: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @12A: iastore
		// @12B: bipush 12 (0x0C)
		// @12D: istore #4
		// @12F: getstatic int[] game.C_100075_uj.field_100655_u
		// @132: iconst_0
		// @133: getstatic int[] game.C_100075_uj.field_100655_u
		// @136: iconst_0
		// @137: iaload
		// @138: ldc_w 1073741824 (0x40000000)
		// @13B: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @13E: iastore
		// @13F: getstatic int[] game.C_100257_ln.field_106481_d
		// @142: iconst_1
		// @143: getstatic int[] game.C_100257_ln.field_106481_d
		// @146: iconst_1
		// @147: iaload
		// @148: ldc_w 131072 (0x20000)
		// @14B: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @14E: iastore
		// @14F: getstatic int[] game.C_100075_uj.field_100655_u
		// @152: iconst_0
		// @153: getstatic int[] game.C_100075_uj.field_100655_u
		// @156: iconst_0
		// @157: iaload
		// @158: ldc_w 16777216 (0x1000000)
		// @15B: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @15E: iastore
		// @15F: getstatic int game.C_100094_j.field_104549_b
		// @162: bipush 13 (0x0D)
		// @164: if_icmpne @195
		// @167: sipush 1000 (0x03E8)
		// @16A: putstatic int game.C_100024_hd.field_102999_s
		// @16D: bipush 8 (0x08)
		// @16F: putstatic int game.C_100249_pc.field_102333_I
		// @172: sipush 1000 (0x03E8)
		// @175: putstatic int game.C_100096_un.field_104563_d
		// @178: getstatic int[] game.C_100275_na.field_103087_l
		// @17B: iconst_1
		// @17C: bipush 10 (0x0A)
		// @17E: iastore
		// @17F: getstatic int[] game.C_100275_na.field_103087_l
		// @182: iconst_2
		// @183: bipush 10 (0x0A)
		// @185: iastore
		// @186: getstatic int[] game.C_100275_na.field_103087_l
		// @189: iconst_0
		// @18A: bipush 10 (0x0A)
		// @18C: iastore
		// @18D: iconst_2
		// @18E: putstatic int game.C_100269_ml.field_101127_j
		// @191: goto @195
		// @194: athrow
		// @195: getstatic int game.C_100094_j.field_104549_b
		// @198: iload_2
		// @199: isub
		// @19A: istore #5
		// @19C: iconst_m1
		// @19D: iload #5
		// @19F: iconst_m1
		// @1A0: ixor
		// @1A1: if_icmpeq @275
		// @1A4: bipush -2 (0xFE)
		// @1A6: iload #5
		// @1A8: iconst_m1
		// @1A9: ixor
		// @1AA: if_icmpeq @32B
		// @1AD: goto @1B1
		// @1B0: athrow
		// @1B1: iload #5
		// @1B3: iconst_m1
		// @1B4: ixor
		// @1B5: bipush -9 (0xF7)
		// @1B7: if_icmpeq @416
		// @1BA: goto @1BE
		// @1BD: athrow
		// @1BE: iload #5
		// @1C0: bipush 7 (0x07)
		// @1C2: if_icmpne @1D2
		// @1C5: goto @1C9
		// @1C8: athrow
		// @1C9: iload #12
		// @1CB: ifeq @46F
		// @1CE: goto @1D2
		// @1D1: athrow
		// @1D2: bipush -7 (0xF9)
		// @1D4: iload #5
		// @1D6: iconst_m1
		// @1D7: ixor
		// @1D8: if_icmpne @1E8
		// @1DB: goto @1DF
		// @1DE: athrow
		// @1DF: iload #12
		// @1E1: ifeq @494
		// @1E4: goto @1E8
		// @1E7: athrow
		// @1E8: bipush 10 (0x0A)
		// @1EA: iload #5
		// @1EC: if_icmpne @1FC
		// @1EF: goto @1F3
		// @1F2: athrow
		// @1F3: iload #12
		// @1F5: ifeq @4BB
		// @1F8: goto @1FC
		// @1FB: athrow
		// @1FC: bipush -12 (0xF4)
		// @1FE: iload #5
		// @200: iconst_m1
		// @201: ixor
		// @202: if_icmpne @212
		// @205: goto @209
		// @208: athrow
		// @209: iload #12
		// @20B: ifeq @536
		// @20E: goto @212
		// @211: athrow
		// @212: iload #5
		// @214: iconst_m1
		// @215: ixor
		// @216: bipush -13 (0xF3)
		// @218: if_icmpne @228
		// @21B: goto @21F
		// @21E: athrow
		// @21F: iload #12
		// @221: ifeq @692
		// @224: goto @228
		// @227: athrow
		// @228: bipush -17 (0xEF)
		// @22A: iload #5
		// @22C: iconst_m1
		// @22D: ixor
		// @22E: if_icmpeq @812
		// @231: goto @235
		// @234: athrow
		// @235: iload #5
		// @237: bipush 15 (0x0F)
		// @239: if_icmpeq @846
		// @23C: goto @240
		// @23F: athrow
		// @240: iload #5
		// @242: bipush 14 (0x0E)
		// @244: if_icmpeq @950
		// @247: goto @24B
		// @24A: athrow
		// @24B: iload #5
		// @24D: iconst_m1
		// @24E: ixor
		// @24F: bipush -18 (0xEE)
		// @251: if_icmpne @261
		// @254: goto @258
		// @257: athrow
		// @258: iload #12
		// @25A: ifeq @9BA
		// @25D: goto @261
		// @260: athrow
		// @261: bipush 24 (0x18)
		// @263: iload #5
		// @265: if_icmpne @B08
		// @268: goto @26C
		// @26B: athrow
		// @26C: iload #12
		// @26E: ifeq @AA4
		// @271: goto @275
		// @274: athrow
		// @275: iconst_1
		// @276: putstatic boolean game.C_100255_pj.field_105257_q
		// @279: iload_3
		// @27A: istore #5
		// @27C: iload #5
		// @27E: iconst_m1
		// @27F: ixor
		// @280: iload #4
		// @282: iconst_m1
		// @283: ixor
		// @284: if_icmple @326
		// @287: getstatic int[] game.C_100017_wj.field_103821_j
		// @28A: iload #5
		// @28C: iaload
		// @28D: istore #6
		// @28F: getstatic int[] game.C_100257_ln.field_106481_d
		// @292: iload #6
		// @294: ldc_w -1055521211 (0xc1160645)
		// @297: ishr
		// @298: getstatic int[] game.C_100257_ln.field_106481_d
		// @29B: iload #6
		// @29D: ldc_w -1055521211 (0xc1160645)
		// @2A0: ishr
		// @2A1: iaload
		// @2A2: iconst_1
		// @2A3: iload #6
		// @2A5: bipush 31 (0x1F)
		// @2A7: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @2AA: ishl
		// @2AB: iconst_m1
		// @2AC: ixor
		// @2AD: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @2B0: iastore
		// @2B1: iconst_1
		// @2B2: iload #6
		// @2B4: invokestatic game.C_100233_oa.func_106233_a(boolean, int)int[]
		// @2B7: astore #7
		// @2B9: aload #7
		// @2BB: astore #8
		// @2BD: iconst_0
		// @2BE: iload #12
		// @2C0: ifne @B0B
		// @2C3: istore #9
		// @2C5: aload #8
		// @2C7: arraylength
		// @2C8: iload #9
		// @2CA: if_icmple @31E
		// @2CD: aload #8
		// @2CF: iload #9
		// @2D1: iaload
		// @2D2: istore #10
		// @2D4: iload #10
		// @2D6: bipush 113 (0x71)
		// @2D8: invokestatic game.C_100209_qb.func_102686_b(int, byte)game.C_100327_ib
		// @2DB: astore #11
		// @2DD: aload #11
		// @2DF: getfield int game.C_100327_ib.field_102497_w
		// @2E2: sipush 2055 (0x0807)
		// @2E5: iand
		// @2E6: iconst_m1
		// @2E7: ixor
		// @2E8: iconst_m1
		// @2E9: iload #12
		// @2EB: ifne @284
		// @2EE: if_icmpne @2F4
		// @2F1: goto @316
		// @2F4: getstatic int[] game.C_100257_ln.field_106481_d
		// @2F7: iload #10
		// @2F9: ldc_w -1450609083 (0xa9897645)
		// @2FC: ishr
		// @2FD: getstatic int[] game.C_100257_ln.field_106481_d
		// @300: iload #10
		// @302: ldc_w -1450609083 (0xa9897645)
		// @305: ishr
		// @306: iaload
		// @307: iconst_1
		// @308: bipush 31 (0x1F)
		// @30A: iload #10
		// @30C: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @30F: ishl
		// @310: iconst_m1
		// @311: ixor
		// @312: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @315: iastore
		// @316: iinc #9 +1
		// @319: iload #12
		// @31B: ifeq @2C5
		// @31E: iinc #5 +1
		// @321: iload #12
		// @323: ifeq @27C
		// @326: iload #12
		// @328: ifeq @B09
		// @32B: iconst_1
		// @32C: putstatic boolean game.C_100255_pj.field_105257_q
		// @32F: iload_3
		// @330: istore #5
		// @332: iload #4
		// @334: iload #5
		// @336: if_icmple @411
		// @339: getstatic int[] game.C_100017_wj.field_103821_j
		// @33C: iload #5
		// @33E: iaload
		// @33F: istore #6
		// @341: getstatic int[] game.C_100257_ln.field_106481_d
		// @344: iload #6
		// @346: ldc_w 926529349 (0x3739b745)
		// @349: ishr
		// @34A: getstatic int[] game.C_100257_ln.field_106481_d
		// @34D: iload #6
		// @34F: ldc_w 926529349 (0x3739b745)
		// @352: ishr
		// @353: iaload
		// @354: iconst_1
		// @355: bipush 31 (0x1F)
		// @357: iload #6
		// @359: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @35C: ishl
		// @35D: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @360: iastore
		// @361: iconst_1
		// @362: iload #6
		// @364: invokestatic game.C_100233_oa.func_106233_a(boolean, int)int[]
		// @367: astore #7
		// @369: aload #7
		// @36B: astore #8
		// @36D: iconst_0
		// @36E: iload #12
		// @370: ifne @B0B
		// @373: istore #9
		// @375: aload #8
		// @377: arraylength
		// @378: iconst_m1
		// @379: ixor
		// @37A: iload #9
		// @37C: iconst_m1
		// @37D: ixor
		// @37E: if_icmpge @3B9
		// @381: aload #8
		// @383: iload #9
		// @385: iaload
		// @386: istore #10
		// @388: getstatic int[] game.C_100257_ln.field_106481_d
		// @38B: iload #10
		// @38D: ldc_w 1745986597 (0x6811a425)
		// @390: ishr
		// @391: getstatic int[] game.C_100257_ln.field_106481_d
		// @394: iload #10
		// @396: ldc_w 1745986597 (0x6811a425)
		// @399: ishr
		// @39A: iaload
		// @39B: iconst_1
		// @39C: bipush 31 (0x1F)
		// @39E: iload #10
		// @3A0: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @3A3: ishl
		// @3A4: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @3A7: iastore
		// @3A8: iinc #9 +1
		// @3AB: iload #12
		// @3AD: ifne @3C2
		// @3B0: iload #12
		// @3B2: ifeq @375
		// @3B5: goto @3B9
		// @3B8: athrow
		// @3B9: iload #6
		// @3BB: bipush -87 (0xA9)
		// @3BD: invokestatic game.C_100192_rf.func_101670_b(int, byte)int[]
		// @3C0: astore #8
		// @3C2: aload #8
		// @3C4: astore #9
		// @3C6: iconst_0
		// @3C7: istore #10
		// @3C9: aload #9
		// @3CB: arraylength
		// @3CC: iload #10
		// @3CE: if_icmple @409
		// @3D1: aload #9
		// @3D3: iload #10
		// @3D5: iaload
		// @3D6: istore #11
		// @3D8: getstatic int[] game.C_100075_uj.field_100655_u
		// @3DB: iload #11
		// @3DD: ldc_w 83657957 (0x4fc84e5)
		// @3E0: ishr
		// @3E1: getstatic int[] game.C_100075_uj.field_100655_u
		// @3E4: iload #11
		// @3E6: ldc_w 83657957 (0x4fc84e5)
		// @3E9: ishr
		// @3EA: iaload
		// @3EB: iconst_1
		// @3EC: bipush 31 (0x1F)
		// @3EE: iload #11
		// @3F0: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @3F3: ishl
		// @3F4: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @3F7: iastore
		// @3F8: iinc #10 +1
		// @3FB: iload #12
		// @3FD: ifne @40C
		// @400: iload #12
		// @402: ifeq @3C9
		// @405: goto @409
		// @408: athrow
		// @409: iinc #5 +1
		// @40C: iload #12
		// @40E: ifeq @332
		// @411: iload #12
		// @413: ifeq @B09
		// @416: iconst_1
		// @417: putstatic boolean game.C_100255_pj.field_105257_q
		// @41A: iconst_0
		// @41B: istore #5
		// @41D: iload #5
		// @41F: iconst_m1
		// @420: ixor
		// @421: getstatic int[] game.C_100257_ln.field_106481_d
		// @424: arraylength
		// @425: iconst_m1
		// @426: ixor
		// @427: if_icmple @442
		// @42A: getstatic int[] game.C_100257_ln.field_106481_d
		// @42D: iload #5
		// @42F: iconst_0
		// @430: iastore
		// @431: iinc #5 +1
		// @434: iload #12
		// @436: ifne @445
		// @439: iload #12
		// @43B: ifeq @41D
		// @43E: goto @442
		// @441: athrow
		// @442: iconst_0
		// @443: istore #5
		// @445: getstatic int[] game.C_100075_uj.field_100655_u
		// @448: arraylength
		// @449: iload #5
		// @44B: if_icmple @46A
		// @44E: getstatic int[] game.C_100075_uj.field_100655_u
		// @451: iload #5
		// @453: iconst_0
		// @454: iastore
		// @455: iinc #5 +1
		// @458: iload #12
		// @45A: ifne @B09
		// @45D: goto @461
		// @460: athrow
		// @461: iload #12
		// @463: ifeq @445
		// @466: goto @46A
		// @469: athrow
		// @46A: iload #12
		// @46C: ifeq @B09
		// @46F: iconst_1
		// @470: putstatic boolean game.C_100255_pj.field_105257_q
		// @473: bipush 100 (0x64)
		// @475: getstatic int game.C_100096_un.field_104563_d
		// @478: iadd
		// @479: sipush 1000 (0x03E8)
		// @47C: invokestatic java.lang.Math.min(int, int)int
		// @47F: putstatic int game.C_100096_un.field_104563_d
		// @482: getstatic int game.C_100024_hd.field_102999_s
		// @485: bipush 100 (0x64)
		// @487: iadd
		// @488: putstatic int game.C_100024_hd.field_102999_s
		// @48B: iload #12
		// @48D: ifeq @B09
		// @490: goto @494
		// @493: athrow
		// @494: iconst_1
		// @495: putstatic boolean game.C_100255_pj.field_105257_q
		// @498: bipush -100 (0x9C)
		// @49A: getstatic int game.C_100096_un.field_104563_d
		// @49D: iadd
		// @49E: iconst_0
		// @49F: invokestatic java.lang.Math.max(int, int)int
		// @4A2: putstatic int game.C_100096_un.field_104563_d
		// @4A5: getstatic int game.C_100024_hd.field_102999_s
		// @4A8: bipush 100 (0x64)
		// @4AA: isub
		// @4AB: iconst_0
		// @4AC: invokestatic java.lang.Math.max(int, int)int
		// @4AF: putstatic int game.C_100024_hd.field_102999_s
		// @4B2: iload #12
		// @4B4: ifeq @B09
		// @4B7: goto @4BB
		// @4BA: athrow
		// @4BB: iconst_1
		// @4BC: putstatic boolean game.C_100255_pj.field_105257_q
		// @4BF: iconst_0
		// @4C0: putstatic int game.C_100269_ml.field_101127_j
		// @4C3: iconst_0
		// @4C4: istore #5
		// @4C6: iload #5
		// @4C8: iconst_m1
		// @4C9: ixor
		// @4CA: getstatic int[] game.C_100257_ln.field_106481_d
		// @4CD: arraylength
		// @4CE: iconst_m1
		// @4CF: ixor
		// @4D0: if_icmple @4EB
		// @4D3: getstatic int[] game.C_100257_ln.field_106481_d
		// @4D6: iload #5
		// @4D8: iconst_0
		// @4D9: iastore
		// @4DA: iinc #5 +1
		// @4DD: iload #12
		// @4DF: ifne @4EE
		// @4E2: iload #12
		// @4E4: ifeq @4C6
		// @4E7: goto @4EB
		// @4EA: athrow
		// @4EB: iconst_0
		// @4EC: istore #5
		// @4EE: iload #5
		// @4F0: getstatic int[] game.C_100075_uj.field_100655_u
		// @4F3: arraylength
		// @4F4: if_icmpge @513
		// @4F7: getstatic int[] game.C_100075_uj.field_100655_u
		// @4FA: iload #5
		// @4FC: iconst_0
		// @4FD: iastore
		// @4FE: iinc #5 +1
		// @501: iload #12
		// @503: ifne @531
		// @506: goto @50A
		// @509: athrow
		// @50A: iload #12
		// @50C: ifeq @4EE
		// @50F: goto @513
		// @512: athrow
		// @513: iconst_0
		// @514: putstatic int game.C_100249_pc.field_102333_I
		// @517: getstatic int[] game.C_100275_na.field_103087_l
		// @51A: iconst_2
		// @51B: iconst_0
		// @51C: iastore
		// @51D: getstatic int[] game.C_100275_na.field_103087_l
		// @520: iconst_1
		// @521: iconst_0
		// @522: iastore
		// @523: getstatic int[] game.C_100275_na.field_103087_l
		// @526: iconst_0
		// @527: iconst_0
		// @528: iastore
		// @529: iconst_0
		// @52A: putstatic int game.C_100024_hd.field_102999_s
		// @52D: iconst_0
		// @52E: putstatic int game.C_100096_un.field_104563_d
		// @531: iload #12
		// @533: ifeq @B09
		// @536: iconst_1
		// @537: putstatic boolean game.C_100255_pj.field_105257_q
		// @53A: iconst_1
		// @53B: putstatic int game.C_100269_ml.field_101127_j
		// @53E: iconst_0
		// @53F: putstatic int game.C_100249_pc.field_102333_I
		// @542: iconst_0
		// @543: istore #5
		// @545: iload #5
		// @547: getstatic int[] game.C_100257_ln.field_106481_d
		// @54A: arraylength
		// @54B: if_icmpge @566
		// @54E: getstatic int[] game.C_100257_ln.field_106481_d
		// @551: iload #5
		// @553: iconst_0
		// @554: iastore
		// @555: iinc #5 +1
		// @558: iload #12
		// @55A: ifne @569
		// @55D: iload #12
		// @55F: ifeq @545
		// @562: goto @566
		// @565: athrow
		// @566: iconst_0
		// @567: istore #5
		// @569: getstatic int[] game.C_100075_uj.field_100655_u
		// @56C: arraylength
		// @56D: iconst_m1
		// @56E: ixor
		// @56F: iload #5
		// @571: iconst_m1
		// @572: ixor
		// @573: if_icmpge @592
		// @576: getstatic int[] game.C_100075_uj.field_100655_u
		// @579: iload #5
		// @57B: iconst_0
		// @57C: iastore
		// @57D: iinc #5 +1
		// @580: iload #12
		// @582: ifne @5BE
		// @585: goto @589
		// @588: athrow
		// @589: iload #12
		// @58B: ifeq @569
		// @58E: goto @592
		// @591: athrow
		// @592: iconst_0
		// @593: putstatic int game.C_100096_un.field_104563_d
		// @596: iconst_0
		// @597: putstatic int game.C_100024_hd.field_102999_s
		// @59A: bipush 55 (0x37)
		// @59C: istore #5
		// @59E: getstatic int[] game.C_100257_ln.field_106481_d
		// @5A1: iload #5
		// @5A3: ldc_w 879927685 (0x3472a185)
		// @5A6: ishr
		// @5A7: getstatic int[] game.C_100257_ln.field_106481_d
		// @5AA: iload #5
		// @5AC: ldc_w 879927685 (0x3472a185)
		// @5AF: ishr
		// @5B0: iaload
		// @5B1: iconst_1
		// @5B2: iload #5
		// @5B4: bipush 31 (0x1F)
		// @5B6: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @5B9: ishl
		// @5BA: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @5BD: iastore
		// @5BE: iconst_1
		// @5BF: iload #5
		// @5C1: invokestatic game.C_100233_oa.func_106233_a(boolean, int)int[]
		// @5C4: astore #6
		// @5C6: aload #6
		// @5C8: astore #7
		// @5CA: iconst_0
		// @5CB: istore #8
		// @5CD: iload #8
		// @5CF: iconst_m1
		// @5D0: ixor
		// @5D1: aload #7
		// @5D3: arraylength
		// @5D4: iconst_m1
		// @5D5: ixor
		// @5D6: if_icmple @61E
		// @5D9: aload #7
		// @5DB: iload #8
		// @5DD: iaload
		// @5DE: istore #9
		// @5E0: getstatic int[] game.C_100257_ln.field_106481_d
		// @5E3: iload #9
		// @5E5: ldc_w -298373531 (0xee372e65)
		// @5E8: ishr
		// @5E9: getstatic int[] game.C_100257_ln.field_106481_d
		// @5EC: iload #9
		// @5EE: ldc_w -298373531 (0xee372e65)
		// @5F1: ishr
		// @5F2: iaload
		// @5F3: iconst_1
		// @5F4: bipush 31 (0x1F)
		// @5F6: iload #9
		// @5F8: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @5FB: ishl
		// @5FC: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @5FF: iastore
		// @600: getstatic int game.C_100024_hd.field_102999_s
		// @603: getstatic int[] game.C_100242_oh.field_106342_g
		// @606: iload #9
		// @608: iaload
		// @609: iadd
		// @60A: putstatic int game.C_100024_hd.field_102999_s
		// @60D: iinc #8 +1
		// @610: iload #12
		// @612: ifne @627
		// @615: iload #12
		// @617: ifeq @5CD
		// @61A: goto @61E
		// @61D: athrow
		// @61E: iload #5
		// @620: bipush -113 (0x8F)
		// @622: invokestatic game.C_100192_rf.func_101670_b(int, byte)int[]
		// @625: astore #7
		// @627: aload #7
		// @629: astore #8
		// @62B: iconst_0
		// @62C: istore #9
		// @62E: iload #9
		// @630: aload #8
		// @632: arraylength
		// @633: if_icmpge @67B
		// @636: aload #8
		// @638: iload #9
		// @63A: iaload
		// @63B: istore #10
		// @63D: getstatic int[] game.C_100075_uj.field_100655_u
		// @640: iload #10
		// @642: ldc_w -1994004155 (0x8925e945)
		// @645: ishr
		// @646: getstatic int[] game.C_100075_uj.field_100655_u
		// @649: iload #10
		// @64B: ldc_w -1994004155 (0x8925e945)
		// @64E: ishr
		// @64F: iaload
		// @650: iconst_1
		// @651: bipush 31 (0x1F)
		// @653: iload #10
		// @655: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @658: ishl
		// @659: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @65C: iastore
		// @65D: getstatic int game.C_100024_hd.field_102999_s
		// @660: getstatic int[] game.C_100328_ia.field_107259_b
		// @663: iload #10
		// @665: iaload
		// @666: iadd
		// @667: putstatic int game.C_100024_hd.field_102999_s
		// @66A: iinc #9 +1
		// @66D: iload #12
		// @66F: ifne @68D
		// @672: iload #12
		// @674: ifeq @62E
		// @677: goto @67B
		// @67A: athrow
		// @67B: getstatic int[] game.C_100275_na.field_103087_l
		// @67E: iconst_0
		// @67F: iconst_3
		// @680: iastore
		// @681: getstatic int[] game.C_100275_na.field_103087_l
		// @684: iconst_2
		// @685: iconst_0
		// @686: iastore
		// @687: getstatic int[] game.C_100275_na.field_103087_l
		// @68A: iconst_1
		// @68B: iconst_0
		// @68C: iastore
		// @68D: iload #12
		// @68F: ifeq @B09
		// @692: bipush 8 (0x08)
		// @694: putstatic int game.C_100249_pc.field_102333_I
		// @697: iconst_2
		// @698: putstatic int game.C_100269_ml.field_101127_j
		// @69B: iconst_1
		// @69C: putstatic boolean game.C_100255_pj.field_105257_q
		// @69F: iconst_0
		// @6A0: istore #5
		// @6A2: iload #5
		// @6A4: iconst_m1
		// @6A5: ixor
		// @6A6: getstatic int[] game.C_100257_ln.field_106481_d
		// @6A9: arraylength
		// @6AA: iconst_m1
		// @6AB: ixor
		// @6AC: if_icmple @6C7
		// @6AF: getstatic int[] game.C_100257_ln.field_106481_d
		// @6B2: iload #5
		// @6B4: iconst_0
		// @6B5: iastore
		// @6B6: iinc #5 +1
		// @6B9: iload #12
		// @6BB: ifne @6CA
		// @6BE: iload #12
		// @6C0: ifeq @6A2
		// @6C3: goto @6C7
		// @6C6: athrow
		// @6C7: iconst_0
		// @6C8: istore #5
		// @6CA: iload #5
		// @6CC: iconst_m1
		// @6CD: ixor
		// @6CE: getstatic int[] game.C_100075_uj.field_100655_u
		// @6D1: arraylength
		// @6D2: iconst_m1
		// @6D3: ixor
		// @6D4: if_icmple @6F3
		// @6D7: getstatic int[] game.C_100075_uj.field_100655_u
		// @6DA: iload #5
		// @6DC: iconst_0
		// @6DD: iastore
		// @6DE: iinc #5 +1
		// @6E1: iload #12
		// @6E3: ifne @6FB
		// @6E6: goto @6EA
		// @6E9: athrow
		// @6EA: iload #12
		// @6EC: ifeq @6CA
		// @6EF: goto @6F3
		// @6F2: athrow
		// @6F3: iconst_0
		// @6F4: putstatic int game.C_100096_un.field_104563_d
		// @6F7: iconst_0
		// @6F8: putstatic int game.C_100024_hd.field_102999_s
		// @6FB: iconst_0
		// @6FC: istore #5
		// @6FE: iconst_3
		// @6FF: iload #5
		// @701: if_icmple @7FA
		// @704: getstatic int[] game.C_100017_wj.field_103821_j
		// @707: iload #5
		// @709: iaload
		// @70A: istore #6
		// @70C: getstatic int[] game.C_100257_ln.field_106481_d
		// @70F: iload #6
		// @711: ldc_w 1006504997 (0x3bfe0c25)
		// @714: ishr
		// @715: getstatic int[] game.C_100257_ln.field_106481_d
		// @718: iload #6
		// @71A: ldc_w 1006504997 (0x3bfe0c25)
		// @71D: ishr
		// @71E: iaload
		// @71F: iconst_1
		// @720: iload #6
		// @722: bipush 31 (0x1F)
		// @724: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @727: ishl
		// @728: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @72B: iastore
		// @72C: iconst_1
		// @72D: iload #6
		// @72F: invokestatic game.C_100233_oa.func_106233_a(boolean, int)int[]
		// @732: astore #7
		// @734: aload #7
		// @736: astore #8
		// @738: iconst_0
		// @739: iload #12
		// @73B: ifne @B0B
		// @73E: istore #9
		// @740: aload #8
		// @742: arraylength
		// @743: iconst_m1
		// @744: ixor
		// @745: iload #9
		// @747: iconst_m1
		// @748: ixor
		// @749: if_icmpge @791
		// @74C: aload #8
		// @74E: iload #9
		// @750: iaload
		// @751: istore #10
		// @753: getstatic int[] game.C_100257_ln.field_106481_d
		// @756: iload #10
		// @758: ldc_w -1390622715 (0xad1cc805)
		// @75B: ishr
		// @75C: getstatic int[] game.C_100257_ln.field_106481_d
		// @75F: iload #10
		// @761: ldc_w -1390622715 (0xad1cc805)
		// @764: ishr
		// @765: iaload
		// @766: iconst_1
		// @767: iload #10
		// @769: bipush 31 (0x1F)
		// @76B: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @76E: ishl
		// @76F: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @772: iastore
		// @773: getstatic int game.C_100024_hd.field_102999_s
		// @776: getstatic int[] game.C_100242_oh.field_106342_g
		// @779: iload #10
		// @77B: iaload
		// @77C: iadd
		// @77D: putstatic int game.C_100024_hd.field_102999_s
		// @780: iinc #9 +1
		// @783: iload #12
		// @785: ifne @79A
		// @788: iload #12
		// @78A: ifeq @740
		// @78D: goto @791
		// @790: athrow
		// @791: iload #6
		// @793: bipush -85 (0xAB)
		// @795: invokestatic game.C_100192_rf.func_101670_b(int, byte)int[]
		// @798: astore #8
		// @79A: aload #8
		// @79C: astore #9
		// @79E: iconst_0
		// @79F: istore #10
		// @7A1: iload #10
		// @7A3: iconst_m1
		// @7A4: ixor
		// @7A5: aload #9
		// @7A7: arraylength
		// @7A8: iconst_m1
		// @7A9: ixor
		// @7AA: if_icmple @7F2
		// @7AD: aload #9
		// @7AF: iload #10
		// @7B1: iaload
		// @7B2: istore #11
		// @7B4: getstatic int[] game.C_100075_uj.field_100655_u
		// @7B7: iload #11
		// @7B9: ldc_w -89355835 (0xfaac89c5)
		// @7BC: ishr
		// @7BD: getstatic int[] game.C_100075_uj.field_100655_u
		// @7C0: iload #11
		// @7C2: ldc_w -89355835 (0xfaac89c5)
		// @7C5: ishr
		// @7C6: iaload
		// @7C7: iconst_1
		// @7C8: iload #11
		// @7CA: bipush 31 (0x1F)
		// @7CC: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @7CF: ishl
		// @7D0: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @7D3: iastore
		// @7D4: getstatic int game.C_100024_hd.field_102999_s
		// @7D7: getstatic int[] game.C_100328_ia.field_107259_b
		// @7DA: iload #11
		// @7DC: iaload
		// @7DD: iadd
		// @7DE: putstatic int game.C_100024_hd.field_102999_s
		// @7E1: iinc #10 +1
		// @7E4: iload #12
		// @7E6: ifne @7F5
		// @7E9: iload #12
		// @7EB: ifeq @7A1
		// @7EE: goto @7F2
		// @7F1: athrow
		// @7F2: iinc #5 +1
		// @7F5: iload #12
		// @7F7: ifeq @6FE
		// @7FA: getstatic int[] game.C_100275_na.field_103087_l
		// @7FD: iconst_2
		// @7FE: iconst_0
		// @7FF: iastore
		// @800: getstatic int[] game.C_100275_na.field_103087_l
		// @803: iconst_1
		// @804: iconst_0
		// @805: iastore
		// @806: getstatic int[] game.C_100275_na.field_103087_l
		// @809: iconst_0
		// @80A: bipush 10 (0x0A)
		// @80C: iastore
		// @80D: iload #12
		// @80F: ifeq @B09
		// @812: iconst_m1
		// @813: getstatic int game.C_100249_pc.field_102333_I
		// @816: bipush 8 (0x08)
		// @818: iand
		// @819: iconst_m1
		// @81A: ixor
		// @81B: if_icmpeq @834
		// @81E: goto @822
		// @821: athrow
		// @822: getstatic int game.C_100249_pc.field_102333_I
		// @825: bipush -9 (0xF7)
		// @827: iand
		// @828: putstatic int game.C_100249_pc.field_102333_I
		// @82B: iload #12
		// @82D: ifeq @B09
		// @830: goto @834
		// @833: athrow
		// @834: getstatic int game.C_100249_pc.field_102333_I
		// @837: bipush 8 (0x08)
		// @839: ior
		// @83A: putstatic int game.C_100249_pc.field_102333_I
		// @83D: iload #12
		// @83F: ifeq @B09
		// @842: goto @846
		// @845: athrow
		// @846: bipush -25 (0xE7)
		// @848: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @84B: ifeq @864
		// @84E: goto @852
		// @851: athrow
		// @852: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @855: bipush 82 (0x52)
		// @857: aaload
		// @858: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @85B: iload #12
		// @85D: ifeq @B09
		// @860: goto @864
		// @863: athrow
		// @864: iconst_0
		// @865: putstatic boolean game.C_100255_pj.field_105257_q
		// @868: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @86B: bipush 69 (0x45)
		// @86D: bipush 111 (0x6F)
		// @86F: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @872: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @875: getstatic int game.C_100096_un.field_104563_d
		// @878: bipush 121 (0x79)
		// @87A: invokevirtual game.C_100278_nd.func_101154_d(int, int)void
		// @87D: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @880: getstatic int game.C_100024_hd.field_102999_s
		// @883: bipush 42 (0x2A)
		// @885: invokevirtual game.C_100278_nd.func_101154_d(int, int)void
		// @888: iconst_0
		// @889: istore #5
		// @88B: iload #5
		// @88D: iconst_m1
		// @88E: ixor
		// @88F: bipush -5 (0xFB)
		// @891: if_icmple @8B3
		// @894: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @897: getstatic int[] game.C_100257_ln.field_106481_d
		// @89A: iload #5
		// @89C: iaload
		// @89D: bipush 17 (0x11)
		// @89F: invokevirtual game.C_100278_nd.func_101154_d(int, int)void
		// @8A2: iinc #5 +1
		// @8A5: iload #12
		// @8A7: ifne @8B6
		// @8AA: iload #12
		// @8AC: ifeq @88B
		// @8AF: goto @8B3
		// @8B2: athrow
		// @8B3: iconst_0
		// @8B4: istore #5
		// @8B6: iload #5
		// @8B8: iconst_m1
		// @8B9: ixor
		// @8BA: bipush -3 (0xFD)
		// @8BC: if_icmple @8E2
		// @8BF: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @8C2: getstatic int[] game.C_100075_uj.field_100655_u
		// @8C5: iload #5
		// @8C7: iaload
		// @8C8: bipush 41 (0x29)
		// @8CA: invokevirtual game.C_100278_nd.func_101154_d(int, int)void
		// @8CD: iinc #5 +1
		// @8D0: iload #12
		// @8D2: ifne @8E5
		// @8D5: goto @8D9
		// @8D8: athrow
		// @8D9: iload #12
		// @8DB: ifeq @8B6
		// @8DE: goto @8E2
		// @8E1: athrow
		// @8E2: iconst_0
		// @8E3: istore #5
		// @8E5: iload #5
		// @8E7: iconst_3
		// @8E8: if_icmpge @90F
		// @8EB: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @8EE: sipush 7838 (0x1E9E)
		// @8F1: getstatic int[] game.C_100275_na.field_103087_l
		// @8F4: iload #5
		// @8F6: iaload
		// @8F7: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @8FA: iinc #5 +1
		// @8FD: iload #12
		// @8FF: ifne @924
		// @902: goto @906
		// @905: athrow
		// @906: iload #12
		// @908: ifeq @8E5
		// @90B: goto @90F
		// @90E: athrow
		// @90F: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @912: sipush 7838 (0x1E9E)
		// @915: getstatic int game.C_100269_ml.field_101127_j
		// @918: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @91B: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @91E: bipush 84 (0x54)
		// @920: aaload
		// @921: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @924: getstatic int game.C_100107_u.field_104770_g
		// @927: iconst_2
		// @928: if_icmplt @92F
		// @92B: goto @B09
		// @92E: athrow
		// @92F: new java.lang.StringBuilder
		// @932: dup
		// @933: invokespecial java.lang.StringBuilder.<init>()void
		// @936: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @939: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @93C: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @93F: bipush 81 (0x51)
		// @941: aaload
		// @942: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @945: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @948: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @94B: iload #12
		// @94D: ifeq @B09
		// @950: bipush -91 (0xA5)
		// @952: invokestatic game.C_100203_ql.func_105921_a(int)void
		// @955: iconst_0
		// @956: istore #5
		// @958: getstatic int[] game.C_100074_g.field_104410_e
		// @95B: arraylength
		// @95C: iconst_m1
		// @95D: ixor
		// @95E: iload #5
		// @960: iconst_m1
		// @961: ixor
		// @962: if_icmpge @97D
		// @965: getstatic int[] game.C_100074_g.field_104410_e
		// @968: iload #5
		// @96A: iconst_0
		// @96B: iastore
		// @96C: iinc #5 +1
		// @96F: iload #12
		// @971: ifne @982
		// @974: iload #12
		// @976: ifeq @958
		// @979: goto @97D
		// @97C: athrow
		// @97D: getstatic int game.C_100050_vg.field_100632_k
		// @980: istore #5
		// @982: bipush -6 (0xFA)
		// @984: iload #5
		// @986: iconst_m1
		// @987: ixor
		// @988: if_icmpeq @9A7
		// @98B: bipush 6 (0x06)
		// @98D: iload #5
		// @98F: if_icmpeq @9A7
		// @992: goto @996
		// @995: athrow
		// @996: iload #5
		// @998: iconst_m1
		// @999: ixor
		// @99A: bipush -9 (0xF7)
		// @99C: if_icmpeq @9A7
		// @99F: goto @9A3
		// @9A2: athrow
		// @9A3: goto @9AC
		// @9A6: athrow
		// @9A7: getstatic int game.C_100069_vb.field_104357_e
		// @9AA: istore #5
		// @9AC: iconst_1
		// @9AD: iconst_0
		// @9AE: bipush -123 (0x85)
		// @9B0: iload #5
		// @9B2: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @9B5: iload #12
		// @9B7: ifeq @B09
		// @9BA: iload_2
		// @9BB: istore #5
		// @9BD: iload #5
		// @9BF: iconst_m1
		// @9C0: ixor
		// @9C1: iconst_m1
		// @9C2: if_icmpne @9CE
		// @9C5: iload #12
		// @9C7: ifeq @A28
		// @9CA: goto @9CE
		// @9CD: athrow
		// @9CE: iload #5
		// @9D0: iconst_m1
		// @9D1: ixor
		// @9D2: bipush -2 (0xFE)
		// @9D4: if_icmpne @9E4
		// @9D7: goto @9DB
		// @9DA: athrow
		// @9DB: iload #12
		// @9DD: ifeq @A3A
		// @9E0: goto @9E4
		// @9E3: athrow
		// @9E4: iconst_2
		// @9E5: iload #5
		// @9E7: if_icmpeq @A50
		// @9EA: goto @9EE
		// @9ED: athrow
		// @9EE: iload #5
		// @9F0: iconst_3
		// @9F1: if_icmpne @A01
		// @9F4: goto @9F8
		// @9F7: athrow
		// @9F8: iload #12
		// @9FA: ifeq @A66
		// @9FD: goto @A01
		// @A00: athrow
		// @A01: bipush -5 (0xFB)
		// @A03: iload #5
		// @A05: iconst_m1
		// @A06: ixor
		// @A07: if_icmpne @A17
		// @A0A: goto @A0E
		// @A0D: athrow
		// @A0E: iload #12
		// @A10: ifeq @A7C
		// @A13: goto @A17
		// @A16: athrow
		// @A17: bipush -6 (0xFA)
		// @A19: iload #5
		// @A1B: iconst_m1
		// @A1C: ixor
		// @A1D: if_icmpeq @A92
		// @A20: goto @A24
		// @A23: athrow
		// @A24: goto @AA3
		// @A27: athrow
		// @A28: sipush 200 (0x00C8)
		// @A2B: ldc_w 1048576 (0x100000)
		// @A2E: getstatic game.C_100002_gf game.C_100086_uh.field_103027_v
		// @A31: iconst_1
		// @A32: invokestatic game.C_100154_sl.func_105327_a(int, int, game.C_100002_gf, boolean)void
		// @A35: iload #12
		// @A37: ifeq @AA3
		// @A3A: sipush 200 (0x00C8)
		// @A3D: ldc_w 1048576 (0x100000)
		// @A40: getstatic game.C_100002_gf game.C_100298_ke.field_103217_R
		// @A43: iconst_1
		// @A44: invokestatic game.C_100154_sl.func_105327_a(int, int, game.C_100002_gf, boolean)void
		// @A47: iload #12
		// @A49: ifeq @AA3
		// @A4C: goto @A50
		// @A4F: athrow
		// @A50: sipush 200 (0x00C8)
		// @A53: ldc_w 1048576 (0x100000)
		// @A56: getstatic game.C_100002_gf game.C_100042_we.field_104134_n
		// @A59: iconst_1
		// @A5A: invokestatic game.C_100154_sl.func_105327_a(int, int, game.C_100002_gf, boolean)void
		// @A5D: iload #12
		// @A5F: ifeq @AA3
		// @A62: goto @A66
		// @A65: athrow
		// @A66: sipush 200 (0x00C8)
		// @A69: ldc_w 1048576 (0x100000)
		// @A6C: getstatic game.C_100002_gf game.C_100187_rk.field_100835_q
		// @A6F: iconst_1
		// @A70: invokestatic game.C_100154_sl.func_105327_a(int, int, game.C_100002_gf, boolean)void
		// @A73: iload #12
		// @A75: ifeq @AA3
		// @A78: goto @A7C
		// @A7B: athrow
		// @A7C: sipush 200 (0x00C8)
		// @A7F: ldc_w 1048576 (0x100000)
		// @A82: getstatic game.C_100002_gf game.C_100084_ug.field_104489_i
		// @A85: iconst_1
		// @A86: invokestatic game.C_100154_sl.func_105327_a(int, int, game.C_100002_gf, boolean)void
		// @A89: iload #12
		// @A8B: ifeq @AA3
		// @A8E: goto @A92
		// @A91: athrow
		// @A92: sipush 200 (0x00C8)
		// @A95: ldc_w 1048576 (0x100000)
		// @A98: getstatic game.C_100002_gf game.C_100283_ni.field_106759_b
		// @A9B: iconst_1
		// @A9C: invokestatic game.C_100154_sl.func_105327_a(int, int, game.C_100002_gf, boolean)void
		// @A9F: goto @AA3
		// @AA2: athrow
		// @AA3: return
		// @AA4: iconst_1
		// @AA5: putstatic boolean game.C_100255_pj.field_105257_q
		// @AA8: bipush -11 (0xF5)
		// @AAA: getstatic int[] game.C_100275_na.field_103087_l
		// @AAD: iload_2
		// @AAE: iaload
		// @AAF: iconst_m1
		// @AB0: ixor
		// @AB1: if_icmpne @ADC
		// @AB4: getstatic int[] game.C_100275_na.field_103087_l
		// @AB7: iload_2
		// @AB8: iconst_0
		// @AB9: iastore
		// @ABA: iload_2
		// @ABB: iconst_m1
		// @ABC: ixor
		// @ABD: iconst_m1
		// @ABE: if_icmpne @B09
		// @AC1: goto @AC5
		// @AC4: athrow
		// @AC5: getstatic int game.C_100269_ml.field_101127_j
		// @AC8: ifgt @AD3
		// @ACB: goto @ACF
		// @ACE: athrow
		// @ACF: goto @B09
		// @AD2: athrow
		// @AD3: iconst_0
		// @AD4: putstatic int game.C_100269_ml.field_101127_j
		// @AD7: iload #12
		// @AD9: ifeq @B09
		// @ADC: getstatic int[] game.C_100275_na.field_103087_l
		// @ADF: iload_2
		// @AE0: bipush 10 (0x0A)
		// @AE2: iastore
		// @AE3: iload_2
		// @AE4: iconst_m1
		// @AE5: ixor
		// @AE6: iconst_m1
		// @AE7: if_icmpne @B09
		// @AEA: goto @AEE
		// @AED: athrow
		// @AEE: getstatic int game.C_100269_ml.field_101127_j
		// @AF1: iconst_m1
		// @AF2: ixor
		// @AF3: iconst_m1
		// @AF4: if_icmpne @B09
		// @AF7: goto @AFB
		// @AFA: athrow
		// @AFB: iconst_1
		// @AFC: putstatic int game.C_100269_ml.field_101127_j
		// @AFF: iload #12
		// @B01: ifeq @B09
		// @B04: goto @B08
		// @B07: athrow
		// @B08: return
		// @B09: bipush 95 (0x5F)
		// @B0B: bipush 8 (0x08)
		// @B0D: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @B10: iload_1
		// @B11: bipush 89 (0x59)
		// @B13: if_icmpge @B21
		// @B16: aconst_null
		// @B17: checkcast int[]
		// @B1A: putstatic int[] game.C_100034_gi.field_104027_f
		// @B1D: goto @B21
		// @B20: athrow
		// @B21: goto @B46
		// @B24: astore_2
		// @B25: aload_2
		// @B26: new java.lang.StringBuilder
		// @B29: dup
		// @B2A: invokespecial java.lang.StringBuilder.<init>()void
		// @B2D: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @B30: bipush 83 (0x53)
		// @B32: aaload
		// @B33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B36: iload_1
		// @B37: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B3A: bipush 41 (0x29)
		// @B3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B3F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B42: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @B45: athrow
		// @B46: return
	}
	
	private final void func_103993_b(boolean arg0)
	{
		// @00: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @03: astore_2
		// @04: getstatic java.lang.String game.C_100060_di.field_104270_e
		// @07: astore_3
		// @08: aload_2
		// @09: aload_3
		// @0A: sipush 320 (0x0140)
		// @0D: sipush 240 (0x00F0)
		// @10: ldc 1021128 (0xf94c8)
		// @12: iconst_m1
		// @13: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @16: iload_1
		// @17: iconst_1
		// @18: if_icmpeq @29
		// @1B: aload_0
		// @1C: bipush -65 (0xBF)
		// @1E: bipush -120 (0x88)
		// @20: iconst_1
		// @21: invokespecial game.C_100034_gi.func_103984_a(int, int, int)int
		// @24: pop
		// @25: goto @29
		// @28: athrow
		// @29: goto @4E
		// @2C: astore_2
		// @2D: aload_2
		// @2E: new java.lang.StringBuilder
		// @31: dup
		// @32: invokespecial java.lang.StringBuilder.<init>()void
		// @35: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @38: bipush 55 (0x37)
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: iload_1
		// @3F: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @42: bipush 41 (0x29)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4D: athrow
		// @4E: return
	}
	
	private final void func_103988_e(boolean arg0)
	{
		// @00: bipush 40 (0x28)
		// @02: bipush 80 (0x50)
		// @04: sipush 560 (0x0230)
		// @07: sipush 330 (0x014A)
		// @0A: ldc_w 3487029 (0x353535)
		// @0D: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @10: bipush 41 (0x29)
		// @12: bipush 81 (0x51)
		// @14: sipush 558 (0x022E)
		// @17: sipush 328 (0x0148)
		// @1A: ldc_w 3487029 (0x353535)
		// @1D: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @20: bipush -25 (0xE7)
		// @22: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @25: ifne @38
		// @28: aload_0
		// @29: bipush 110 (0x6E)
		// @2B: invokespecial game.C_100034_gi.func_103996_g(byte)void
		// @2E: getstatic int game.SteelSentinels.field_105275_O
		// @31: ifeq @41
		// @34: goto @38
		// @37: athrow
		// @38: aload_0
		// @39: iconst_1
		// @3A: invokespecial game.C_100034_gi.func_104025_d(boolean)void
		// @3D: goto @41
		// @40: athrow
		// @41: iload_1
		// @42: iconst_1
		// @43: if_icmpeq @53
		// @46: aload_0
		// @47: bipush -62 (0xC2)
		// @49: bipush -24 (0xE8)
		// @4B: invokespecial game.C_100034_gi.func_103975_c(int, int)int
		// @4E: pop
		// @4F: goto @53
		// @52: athrow
		// @53: goto @78
		// @56: astore_2
		// @57: aload_2
		// @58: new java.lang.StringBuilder
		// @5B: dup
		// @5C: invokespecial java.lang.StringBuilder.<init>()void
		// @5F: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @62: bipush 34 (0x22)
		// @64: aaload
		// @65: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @68: iload_1
		// @69: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @6C: bipush 41 (0x29)
		// @6E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @71: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @74: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @77: athrow
		// @78: return
	}
	
	private final int func_103985_b(int arg0, int arg1)
	{
		// @000: bipush 17 (0x11)
		// @002: aload_0
		// @003: getfield int game.C_100034_gi.field_104030_e
		// @006: if_icmpne @023
		// @009: getstatic int[][] game.C_100012_fh.field_100515_K
		// @00C: aload_0
		// @00D: getfield int game.C_100034_gi.field_104030_e
		// @010: aaload
		// @011: arraylength
		// @012: iconst_4
		// @013: isub
		// @014: iload_1
		// @015: if_icmpgt @020
		// @018: goto @01C
		// @01B: athrow
		// @01C: goto @023
		// @01F: athrow
		// @020: bipush 25 (0x19)
		// @022: ireturn
		// @023: aload_0
		// @024: iload_2
		// @025: sipush -22545 (0xA7EF)
		// @028: ixor
		// @029: invokespecial game.C_100034_gi.func_103976_d(int)boolean
		// @02C: ifeq @032
		// @02F: bipush 25 (0x19)
		// @031: ireturn
		// @032: aload_0
		// @033: getfield int game.C_100034_gi.field_104030_e
		// @036: iconst_m1
		// @037: ixor
		// @038: iconst_m1
		// @039: if_icmpne @054
		// @03C: getstatic int[][] game.C_100012_fh.field_100515_K
		// @03F: aload_0
		// @040: getfield int game.C_100034_gi.field_104030_e
		// @043: aaload
		// @044: iload_1
		// @045: iaload
		// @046: iconst_m1
		// @047: ixor
		// @048: bipush -35 (0xDD)
		// @04A: if_icmpne @054
		// @04D: goto @051
		// @050: athrow
		// @051: bipush 65 (0x41)
		// @053: ireturn
		// @054: iload_2
		// @055: sipush -22631 (0xA799)
		// @058: if_icmpeq @067
		// @05B: aload_0
		// @05C: aconst_null
		// @05D: checkcast game.C_100333_ij
		// @060: putfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @063: goto @067
		// @066: athrow
		// @067: bipush 19 (0x13)
		// @069: aload_0
		// @06A: getfield int game.C_100034_gi.field_104030_e
		// @06D: if_icmpne @08C
		// @070: getstatic int[][] game.C_100012_fh.field_100515_K
		// @073: aload_0
		// @074: getfield int game.C_100034_gi.field_104030_e
		// @077: aaload
		// @078: iload_1
		// @079: iaload
		// @07A: iconst_m1
		// @07B: ixor
		// @07C: bipush -39 (0xD9)
		// @07E: if_icmpeq @089
		// @081: goto @085
		// @084: athrow
		// @085: goto @08C
		// @088: athrow
		// @089: bipush 24 (0x18)
		// @08B: ireturn
		// @08C: bipush 20 (0x14)
		// @08E: aload_0
		// @08F: getfield int game.C_100034_gi.field_104030_e
		// @092: if_icmpne @0D0
		// @095: getstatic int[][] game.C_100012_fh.field_100515_K
		// @098: aload_0
		// @099: getfield int game.C_100034_gi.field_104030_e
		// @09C: aaload
		// @09D: iload_1
		// @09E: iaload
		// @09F: istore_3
		// @0A0: bipush 25 (0x19)
		// @0A2: iload_3
		// @0A3: if_icmpeq @0CA
		// @0A6: bipush -27 (0xE5)
		// @0A8: iload_3
		// @0A9: iconst_m1
		// @0AA: ixor
		// @0AB: if_icmpne @0BC
		// @0AE: goto @0B2
		// @0B1: athrow
		// @0B2: getstatic int game.SteelSentinels.field_105275_O
		// @0B5: ifeq @0CA
		// @0B8: goto @0BC
		// @0BB: athrow
		// @0BC: bipush 39 (0x27)
		// @0BE: iload_3
		// @0BF: if_icmpeq @0CD
		// @0C2: goto @0C6
		// @0C5: athrow
		// @0C6: goto @0D0
		// @0C9: athrow
		// @0CA: bipush 24 (0x18)
		// @0CC: ireturn
		// @0CD: bipush 26 (0x1A)
		// @0CF: ireturn
		// @0D0: bipush -6 (0xFA)
		// @0D2: aload_0
		// @0D3: getfield int game.C_100034_gi.field_104030_e
		// @0D6: iconst_m1
		// @0D7: ixor
		// @0D8: if_icmpne @0F7
		// @0DB: bipush -25 (0xE7)
		// @0DD: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @0E0: ifne @0F7
		// @0E3: goto @0E7
		// @0E6: athrow
		// @0E7: iload_1
		// @0E8: iconst_3
		// @0E9: if_icmplt @0F4
		// @0EC: goto @0F0
		// @0EF: athrow
		// @0F0: goto @0F7
		// @0F3: athrow
		// @0F4: bipush 25 (0x19)
		// @0F6: ireturn
		// @0F7: aload_0
		// @0F8: getfield int game.C_100034_gi.field_104030_e
		// @0FB: bipush 6 (0x06)
		// @0FD: if_icmpne @11F
		// @100: bipush -25 (0xE7)
		// @102: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @105: ifne @11F
		// @108: goto @10C
		// @10B: athrow
		// @10C: bipush -3 (0xFD)
		// @10E: iload_1
		// @10F: iconst_m1
		// @110: ixor
		// @111: if_icmplt @11C
		// @114: goto @118
		// @117: athrow
		// @118: goto @11F
		// @11B: athrow
		// @11C: bipush 25 (0x19)
		// @11E: ireturn
		// @11F: bipush 30 (0x1E)
		// @121: ireturn
		// @122: astore_3
		// @123: aload_3
		// @124: new java.lang.StringBuilder
		// @127: dup
		// @128: invokespecial java.lang.StringBuilder.<init>()void
		// @12B: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @12E: bipush 59 (0x3B)
		// @130: aaload
		// @131: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @134: iload_1
		// @135: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @138: bipush 44 (0x2C)
		// @13A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13D: iload_2
		// @13E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @141: bipush 41 (0x29)
		// @143: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @146: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @149: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @14C: athrow
	}
	
	private final int func_104011_b(byte arg0, int arg1)
	{
		// @00: aload_0
		// @01: getfield int game.C_100034_gi.field_104030_e
		// @04: iconst_m1
		// @05: ixor
		// @06: bipush -15 (0xF1)
		// @08: if_icmpeq @77
		// @0B: bipush 13 (0x0D)
		// @0D: aload_0
		// @0E: getfield int game.C_100034_gi.field_104030_e
		// @11: if_icmpeq @77
		// @14: goto @18
		// @17: athrow
		// @18: bipush 7 (0x07)
		// @1A: aload_0
		// @1B: getfield int game.C_100034_gi.field_104030_e
		// @1E: if_icmpeq @77
		// @21: goto @25
		// @24: athrow
		// @25: aload_0
		// @26: getfield int game.C_100034_gi.field_104030_e
		// @29: bipush 17 (0x11)
		// @2B: if_icmpeq @77
		// @2E: goto @32
		// @31: athrow
		// @32: aload_0
		// @33: getfield int game.C_100034_gi.field_104030_e
		// @36: iconst_m1
		// @37: ixor
		// @38: bipush -7 (0xF9)
		// @3A: if_icmpeq @77
		// @3D: goto @41
		// @40: athrow
		// @41: bipush -6 (0xFA)
		// @43: aload_0
		// @44: getfield int game.C_100034_gi.field_104030_e
		// @47: iconst_m1
		// @48: ixor
		// @49: if_icmpeq @77
		// @4C: goto @50
		// @4F: athrow
		// @50: bipush 8 (0x08)
		// @52: aload_0
		// @53: getfield int game.C_100034_gi.field_104030_e
		// @56: if_icmpeq @77
		// @59: goto @5D
		// @5C: athrow
		// @5D: aload_0
		// @5E: getfield int game.C_100034_gi.field_104030_e
		// @61: bipush 19 (0x13)
		// @63: if_icmpeq @77
		// @66: goto @6A
		// @69: athrow
		// @6A: bipush 20 (0x14)
		// @6C: aload_0
		// @6D: getfield int game.C_100034_gi.field_104030_e
		// @70: if_icmpne @A2
		// @73: goto @77
		// @76: athrow
		// @77: iload_2
		// @78: iconst_m1
		// @79: ixor
		// @7A: getstatic int[][] game.C_100012_fh.field_100515_K
		// @7D: aload_0
		// @7E: getfield int game.C_100034_gi.field_104030_e
		// @81: aaload
		// @82: arraylength
		// @83: bipush -4 (0xFC)
		// @85: iadd
		// @86: iconst_m1
		// @87: ixor
		// @88: if_icmple @93
		// @8B: goto @8F
		// @8E: athrow
		// @8F: goto @A2
		// @92: athrow
		// @93: iconst_4
		// @94: getstatic int[][] game.C_100012_fh.field_100515_K
		// @97: aload_0
		// @98: getfield int game.C_100034_gi.field_104030_e
		// @9B: aaload
		// @9C: arraylength
		// @9D: ineg
		// @9E: iload_2
		// @9F: iadd
		// @A0: iadd
		// @A1: ireturn
		// @A2: iload_1
		// @A3: bipush -124 (0x84)
		// @A5: if_icmpeq @AB
		// @A8: bipush 127 (0x7F)
		// @AA: ireturn
		// @AB: iconst_m1
		// @AC: ireturn
		// @AD: astore_3
		// @AE: aload_3
		// @AF: new java.lang.StringBuilder
		// @B2: dup
		// @B3: invokespecial java.lang.StringBuilder.<init>()void
		// @B6: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @B9: bipush 74 (0x4A)
		// @BB: aaload
		// @BC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BF: iload_1
		// @C0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C3: bipush 44 (0x2C)
		// @C5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C8: iload_2
		// @C9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CC: bipush 41 (0x29)
		// @CE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D1: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D4: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D7: athrow
	}
	
	private final void func_104021_i(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore_3
		// @004: bipush 96 (0x60)
		// @006: getstatic int game.C_100293_kj.field_106890_c
		// @009: if_icmpne @04C
		// @00C: iconst_m1
		// @00D: aload_0
		// @00E: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @011: getfield int game.C_100333_ij.field_107347_b
		// @014: iconst_m1
		// @015: ixor
		// @016: if_icmple @03E
		// @019: goto @01D
		// @01C: athrow
		// @01D: aload_0
		// @01E: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @021: getfield int game.C_100333_ij.field_107347_b
		// @024: iconst_2
		// @025: if_icmpne @030
		// @028: goto @02C
		// @02B: athrow
		// @02C: goto @04C
		// @02F: athrow
		// @030: aload_0
		// @031: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @034: iconst_0
		// @035: bipush -96 (0xA0)
		// @037: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @03A: iload_3
		// @03B: ifeq @04C
		// @03E: aload_0
		// @03F: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @042: iconst_1
		// @043: bipush -50 (0xCE)
		// @045: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @048: goto @04C
		// @04B: athrow
		// @04C: iload_1
		// @04D: bipush -30 (0xE2)
		// @04F: if_icmpeq @05C
		// @052: aload_0
		// @053: bipush 101 (0x65)
		// @055: invokespecial game.C_100034_gi.func_104016_r(int)void
		// @058: goto @05C
		// @05B: athrow
		// @05C: bipush 97 (0x61)
		// @05E: getstatic int game.C_100293_kj.field_106890_c
		// @061: if_icmpne @0A7
		// @064: aload_0
		// @065: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @068: getfield int game.C_100333_ij.field_107347_b
		// @06B: iconst_m1
		// @06C: ixor
		// @06D: bipush -2 (0xFE)
		// @06F: if_icmpne @088
		// @072: goto @076
		// @075: athrow
		// @076: aload_0
		// @077: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @07A: iconst_0
		// @07B: bipush -69 (0xBB)
		// @07D: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @080: iload_3
		// @081: ifeq @0A7
		// @084: goto @088
		// @087: athrow
		// @088: iconst_2
		// @089: aload_0
		// @08A: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @08D: getfield int game.C_100333_ij.field_107347_b
		// @090: if_icmpne @09B
		// @093: goto @097
		// @096: athrow
		// @097: goto @0A7
		// @09A: athrow
		// @09B: aload_0
		// @09C: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @09F: iconst_1
		// @0A0: iload_1
		// @0A1: bipush -96 (0xA0)
		// @0A3: iadd
		// @0A4: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @0A7: getstatic int game.C_100293_kj.field_106890_c
		// @0AA: bipush 99 (0x63)
		// @0AC: if_icmpeq @0B3
		// @0AF: goto @0F8
		// @0B2: athrow
		// @0B3: aload_0
		// @0B4: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0B7: getfield int game.C_100333_ij.field_107347_b
		// @0BA: iconst_m1
		// @0BB: ixor
		// @0BC: iconst_m1
		// @0BD: if_icmpgt @0E6
		// @0C0: bipush -2 (0xFE)
		// @0C2: aload_0
		// @0C3: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0C6: getfield int game.C_100333_ij.field_107347_b
		// @0C9: iconst_m1
		// @0CA: ixor
		// @0CB: if_icmpgt @0E6
		// @0CE: goto @0D2
		// @0D1: athrow
		// @0D2: aload_0
		// @0D3: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0D6: iconst_2
		// @0D7: iload_1
		// @0D8: bipush 94 (0x5E)
		// @0DA: ixor
		// @0DB: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @0DE: iload_3
		// @0DF: ifeq @0F8
		// @0E2: goto @0E6
		// @0E5: athrow
		// @0E6: aload_0
		// @0E7: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @0EA: getstatic int game.C_100118_ub.field_102054_Wb
		// @0ED: iload_1
		// @0EE: bipush -34 (0xDE)
		// @0F0: iadd
		// @0F1: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @0F4: goto @0F8
		// @0F7: athrow
		// @0F8: getstatic int game.C_100293_kj.field_106890_c
		// @0FB: iconst_m1
		// @0FC: ixor
		// @0FD: bipush -99 (0x9D)
		// @0FF: if_icmpne @135
		// @102: iconst_2
		// @103: aload_0
		// @104: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @107: getfield int game.C_100333_ij.field_107347_b
		// @10A: if_icmpne @125
		// @10D: goto @111
		// @110: athrow
		// @111: aload_0
		// @112: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @115: getstatic int game.C_100118_ub.field_102054_Wb
		// @118: bipush -75 (0xB5)
		// @11A: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @11D: iload_3
		// @11E: ifeq @135
		// @121: goto @125
		// @124: athrow
		// @125: aload_0
		// @126: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @129: iconst_2
		// @12A: iload_1
		// @12B: bipush -96 (0xA0)
		// @12D: iadd
		// @12E: invokevirtual game.C_100333_ij.func_107342_a(int, int)void
		// @131: goto @135
		// @134: athrow
		// @135: aload_0
		// @136: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @139: bipush -108 (0x94)
		// @13B: invokevirtual game.C_100333_ij.func_107334_b(byte)void
		// @13E: goto @163
		// @141: astore_2
		// @142: aload_2
		// @143: new java.lang.StringBuilder
		// @146: dup
		// @147: invokespecial java.lang.StringBuilder.<init>()void
		// @14A: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @14D: bipush 101 (0x65)
		// @14F: aaload
		// @150: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @153: iload_1
		// @154: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @157: bipush 41 (0x29)
		// @159: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @15C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @15F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @162: athrow
		// @163: return
	}
	
	private final void func_104004_a(boolean arg0)
	{
		// @00: iload_1
		// @01: ifeq @0E
		// @04: aload_0
		// @05: iconst_0
		// @06: invokespecial game.C_100034_gi.func_103982_p(int)int
		// @09: pop
		// @0A: goto @0E
		// @0D: athrow
		// @0E: aload_0
		// @0F: getfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @12: bipush 110 (0x6E)
		// @14: invokevirtual game.C_100333_ij.func_107334_b(byte)void
		// @17: goto @3C
		// @1A: astore_2
		// @1B: aload_2
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @26: bipush 52 (0x34)
		// @28: aaload
		// @29: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C: iload_1
		// @2D: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @30: bipush 41 (0x29)
		// @32: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @35: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @38: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3B: athrow
		// @3C: return
	}
	
	private final boolean func_104007_b(int arg0, int arg1, int arg2)
	{
		// @00: iconst_m1
		// @01: iload_3
		// @02: iconst_m1
		// @03: ixor
		// @04: if_icmplt @11
		// @07: bipush 10 (0x0A)
		// @09: iload_3
		// @0A: if_icmpgt @13
		// @0D: goto @11
		// @10: athrow
		// @11: iconst_0
		// @12: ireturn
		// @13: iconst_m1
		// @14: iload_1
		// @15: iconst_m1
		// @16: ixor
		// @17: if_icmplt @2A
		// @1A: iload_1
		// @1B: iconst_m1
		// @1C: ixor
		// @1D: bipush -4 (0xFC)
		// @1F: if_icmple @2A
		// @22: goto @26
		// @25: athrow
		// @26: goto @2C
		// @29: athrow
		// @2A: iconst_0
		// @2B: ireturn
		// @2C: iload_1
		// @2D: iconst_m1
		// @2E: ixor
		// @2F: bipush -3 (0xFD)
		// @31: if_icmpne @43
		// @34: iconst_m1
		// @35: getstatic int game.C_100212_qc.field_105976_b
		// @38: iconst_m1
		// @39: ixor
		// @3A: if_icmpgt @43
		// @3D: goto @41
		// @40: athrow
		// @41: iconst_0
		// @42: ireturn
		// @43: iconst_m1
		// @44: iload_1
		// @45: iconst_m1
		// @46: ixor
		// @47: if_icmple @5C
		// @4A: getstatic int[] game.C_100275_na.field_103087_l
		// @4D: iconst_0
		// @4E: iaload
		// @4F: iconst_m1
		// @50: ixor
		// @51: bipush -4 (0xFC)
		// @53: if_icmple @5C
		// @56: goto @5A
		// @59: athrow
		// @5A: iconst_0
		// @5B: ireturn
		// @5C: iload_2
		// @5D: bipush -4 (0xFC)
		// @5F: if_icmpeq @6E
		// @62: aload_0
		// @63: aconst_null
		// @64: checkcast game.C_100333_ij
		// @67: putfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @6A: goto @6E
		// @6D: athrow
		// @6E: getstatic int[] game.C_100275_na.field_103087_l
		// @71: iload_1
		// @72: iaload
		// @73: iconst_m1
		// @74: ixor
		// @75: iload_3
		// @76: iconst_m1
		// @77: ixor
		// @78: if_icmple @7D
		// @7B: iconst_0
		// @7C: ireturn
		// @7D: iconst_1
		// @7E: ireturn
		// @7F: astore #4
		// @81: aload #4
		// @83: new java.lang.StringBuilder
		// @86: dup
		// @87: invokespecial java.lang.StringBuilder.<init>()void
		// @8A: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @8D: bipush 65 (0x41)
		// @8F: aaload
		// @90: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @93: iload_1
		// @94: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @97: bipush 44 (0x2C)
		// @99: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9C: iload_2
		// @9D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A0: bipush 44 (0x2C)
		// @A2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A5: iload_3
		// @A6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A9: bipush 41 (0x29)
		// @AB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AE: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B1: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @B4: athrow
	}
	
	private final void func_104018_g(int arg0)
	{
		// @00: sipush 16586 (0x40CA)
		// @03: getstatic int[] game.C_100139_tb.field_100529_w
		// @06: invokestatic game.C_100200_ba.func_105839_a(int, int[])boolean
		// @09: istore_2
		// @0A: aconst_null
		// @0B: getstatic game.C_100292_jk game.C_100067_vd.field_104315_c
		// @0E: if_acmpeq @16
		// @11: iconst_1
		// @12: goto @17
		// @15: athrow
		// @16: iconst_0
		// @17: istore_3
		// @18: getstatic java.lang.String game.C_100216_aj.field_104455_j
		// @1B: astore #4
		// @1D: new java.lang.StringBuilder
		// @20: dup
		// @21: invokespecial java.lang.StringBuilder.<init>()void
		// @24: aload #4
		// @26: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @29: ldc_w " "
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_1
		// @30: sipush -18906 (0xB626)
		// @33: ixor
		// @34: iconst_1
		// @35: anewarray java.lang.String
		// @38: dup
		// @39: iconst_0
		// @3A: getstatic java.lang.String game.C_100217_ao.field_106044_h
		// @3D: aastore
		// @3E: iconst_0
		// @3F: iload_2
		// @40: bipush 89 (0x59)
		// @42: iload_3
		// @43: invokestatic game.C_100327_ib.func_102476_a(boolean, boolean, byte, boolean)java.lang.String
		// @46: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @49: bipush 35 (0x23)
		// @4B: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @4E: bipush 51 (0x33)
		// @50: aaload
		// @51: iload_1
		// @52: iload_1
		// @53: ixor
		// @54: invokestatic game.C_100118_ub.func_102051_a(java.lang.String, char, java.lang.String, int)java.lang.String
		// @57: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5D: astore #4
		// @5F: getstatic game.C_100317_lb game.C_100265_mh.field_106605_Q
		// @62: aload #4
		// @64: bipush 10 (0x0A)
		// @66: bipush 70 (0x46)
		// @68: sipush 620 (0x026C)
		// @6B: sipush 180 (0x00B4)
		// @6E: ldc 1021128 (0xf94c8)
		// @70: iconst_m1
		// @71: iconst_1
		// @72: iconst_0
		// @73: bipush 18 (0x12)
		// @75: invokevirtual game.C_100317_lb.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @78: pop
		// @79: goto @9E
		// @7C: astore_2
		// @7D: aload_2
		// @7E: new java.lang.StringBuilder
		// @81: dup
		// @82: invokespecial java.lang.StringBuilder.<init>()void
		// @85: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @88: bipush 50 (0x32)
		// @8A: aaload
		// @8B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8E: iload_1
		// @8F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @92: bipush 41 (0x29)
		// @94: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @97: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9D: athrow
		// @9E: return
	}
	
	C_100034_gi(int arg0)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iconst_0
		// @06: putfield int game.C_100034_gi.field_104031_b
		// @09: aload_0
		// @0A: iconst_0
		// @0B: putfield int game.C_100034_gi.field_104037_k
		// @0E: aload_0
		// @0F: iload_1
		// @10: putfield int game.C_100034_gi.field_104030_e
		// @13: aload_0
		// @14: new game.C_100333_ij
		// @17: dup
		// @18: getstatic int[][] game.C_100012_fh.field_100515_K
		// @1B: aload_0
		// @1C: getfield int game.C_100034_gi.field_104030_e
		// @1F: aaload
		// @20: arraylength
		// @21: invokespecial game.C_100333_ij.<init>(int)void
		// @24: putfield game.C_100333_ij game.C_100034_gi.field_104035_m
		// @27: goto @4C
		// @2A: astore_2
		// @2B: aload_2
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @36: bipush 79 (0x4F)
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: iload_1
		// @3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40: bipush 41 (0x29)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @48: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4B: athrow
		// @4C: return
	}
	
	private final void func_103998_b(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: iload_1
		// @05: bipush -123 (0x85)
		// @07: if_icmple @14
		// @0A: aload_0
		// @0B: bipush -10 (0xF6)
		// @0D: invokespecial game.C_100034_gi.func_104021_i(int)void
		// @10: goto @14
		// @13: athrow
		// @14: aconst_null
		// @15: getstatic game.C_100302_ka game.C_100145_ta.field_100429_j
		// @18: if_acmpeq @A2
		// @1B: getstatic boolean game.C_100216_aj.field_104462_t
		// @1E: ifne @39
		// @21: goto @25
		// @24: athrow
		// @25: getstatic game.C_100317_lb game.C_100318_hj.field_107197_e
		// @28: getstatic game.C_100153_be[] game.C_100312_ld.field_107157_a
		// @2B: getstatic int[] game.C_100004_gb.field_103574_j
		// @2E: invokevirtual game.C_100317_lb.func_101728_a(game.C_100295_kh[], int[])void
		// @31: iload_3
		// @32: ifeq @49
		// @35: goto @39
		// @38: athrow
		// @39: getstatic game.C_100317_lb game.C_100318_hj.field_107197_e
		// @3C: getstatic game.C_100153_be[] game.C_100094_j.field_104548_e
		// @3F: getstatic int[] game.C_100004_gb.field_103574_j
		// @42: invokevirtual game.C_100317_lb.func_101728_a(game.C_100295_kh[], int[])void
		// @45: goto @49
		// @48: athrow
		// @49: getstatic boolean game.C_100301_kb.field_107100_k
		// @4C: ifne @5C
		// @4F: iconst_m1
		// @50: getstatic int game.C_100052_eb.field_104231_b
		// @53: iconst_m1
		// @54: ixor
		// @55: if_icmpeq @79
		// @58: goto @5C
		// @5B: athrow
		// @5C: getstatic game.C_100302_ka game.C_100145_ta.field_100429_j
		// @5F: bipush -127 (0x81)
		// @61: iconst_1
		// @62: invokevirtual game.C_100302_ka.func_101809_a(byte, boolean)void
		// @65: getstatic game.C_100317_lb game.C_100318_hj.field_107197_e
		// @68: getstatic game.C_100153_be[] game.C_100038_wa.field_104072_a
		// @6B: getstatic int[] game.C_100171_cn.field_105571_n
		// @6E: invokevirtual game.C_100317_lb.func_101728_a(game.C_100295_kh[], int[])void
		// @71: iload_3
		// @72: ifeq @A2
		// @75: goto @79
		// @78: athrow
		// @79: getstatic game.C_100302_ka game.C_100220_ac.field_106057_b
		// @7C: getfield int game.C_100302_ka.field_101840_Eb
		// @7F: getstatic game.C_100302_ka game.C_100220_ac.field_106057_b
		// @82: getfield int game.C_100302_ka.field_101835_xb
		// @85: getstatic game.C_100302_ka game.C_100220_ac.field_106057_b
		// @88: getfield int game.C_100302_ka.field_101886_Kb
		// @8B: getstatic game.C_100302_ka game.C_100220_ac.field_106057_b
		// @8E: getfield int game.C_100302_ka.field_101848_lb
		// @91: iconst_0
		// @92: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @95: getstatic game.C_100302_ka game.C_100220_ac.field_106057_b
		// @98: bipush -126 (0x82)
		// @9A: iconst_1
		// @9B: invokevirtual game.C_100302_ka.func_101809_a(byte, boolean)void
		// @9E: goto @A2
		// @A1: athrow
		// @A2: goto @C6
		// @A5: astore_2
		// @A6: aload_2
		// @A7: new java.lang.StringBuilder
		// @AA: dup
		// @AB: invokespecial java.lang.StringBuilder.<init>()void
		// @AE: getstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @B1: iconst_1
		// @B2: aaload
		// @B3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B6: iload_1
		// @B7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BA: bipush 41 (0x29)
		// @BC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BF: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C2: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C5: athrow
		// @C6: return
	}
	
	static
	{
		// @000: bipush 122 (0x7A)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc_w "yb^O 6"
		// @00A: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @00D: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @010: aastore
		// @011: dup
		// @012: iconst_1
		// @013: ldc_w "yb^_I"
		// @016: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @019: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @01C: aastore
		// @01D: dup
		// @01E: iconst_2
		// @01F: ldc_w "Ke\u001cg\u0002u+\u001dm\u0002vxP?L/9"
		// @022: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @025: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @028: aastore
		// @029: dup
		// @02A: iconst_3
		// @02B: ldc_w "_o\u0006i\u000f}n\u0014"
		// @02E: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @031: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @034: aastore
		// @035: dup
		// @036: iconst_4
		// @037: ldc_w "MN$(2JJ$M["
		// @03A: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @03D: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @040: aastore
		// @041: dup
		// @042: iconst_5
		// @043: ldc_w "2+"
		// @046: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @049: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @04C: aastore
		// @04D: dup
		// @04E: bipush 6 (0x06)
		// @050: ldc_w "Sb\u0017`\u0015g+7g\u0005"
		// @053: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @056: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @059: aastore
		// @05A: dup
		// @05B: bipush 7 (0x07)
		// @05D: ldc_w "]~\u0002z\u0004p\u007f\u001cqAke\u001cg\u0002un\u00142A"
		// @060: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @063: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @066: aastore
		// @067: dup
		// @068: bipush 8 (0x08)
		// @06A: ldc_w "Jd\u0004i\r>b\u0004m\u000cm+\u0015f\u0006we\u0015m\u0013{oJ("
		// @06D: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @070: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @073: aastore
		// @074: dup
		// @075: bipush 9 (0x09)
		// @077: ldc_w "[e\u0017a\u000f{n\u0002(\u0000rg"
		// @07A: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @07D: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @080: aastore
		// @081: dup
		// @082: bipush 10 (0x0A)
		// @084: ldc_w "Sn\u001dj\u0004l"
		// @087: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @08A: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @08D: aastore
		// @08E: dup
		// @08F: bipush 11 (0x0B)
		// @091: ldc_w "Rd\u0013cAsn\u0013`\u0012>?\\=M("
		// @094: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @097: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 12 (0x0C)
		// @09E: ldc_w "Xy\u0015m"
		// @0A1: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @0A4: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @0A7: aastore
		// @0A8: dup
		// @0A9: bipush 13 (0x0D)
		// @0AB: ldc_w "K{\u0014i\u0015{+\u0003m\u0013hn\u0002"
		// @0AE: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @0B1: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @0B4: aastore
		// @0B5: dup
		// @0B6: bipush 14 (0x0E)
		// @0B8: ldc_w "Ln\u0003m\u0015"
		// @0BB: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @0BE: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @0C1: aastore
		// @0C2: dup
		// @0C3: bipush 15 (0x0F)
		// @0C5: ldc_w "Rd\u0013cAsn\u0013`\u0012>:\\:M-"
		// @0C8: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @0CB: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @0CE: aastore
		// @0CF: dup
		// @0D0: bipush 16 (0x10)
		// @0D2: ldc_w "\\j\u0003a\u0002"
		// @0D5: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @0D8: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @0DB: aastore
		// @0DC: dup
		// @0DD: bipush 17 (0x11)
		// @0DF: ldc_w "Ke\u001cg\u0002u+\u001dm\u0002vxP9M,'C"
		// @0E2: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @0E5: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @0E8: aastore
		// @0E9: dup
		// @0EA: bipush 18 (0x12)
		// @0EC: ldc_w "M`\u0019x"
		// @0EF: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @0F2: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @0F5: aastore
		// @0F6: dup
		// @0F7: bipush 19 (0x13)
		// @0F9: ldc_w "Ke\u0015f\u0006we\u0015m\u0013>j\u001cd"
		// @0FC: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @0FF: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @102: aastore
		// @103: dup
		// @104: bipush 20 (0x14)
		// @106: ldc_w "]d\u001en\u0008y+\u0004}\u0015qy\u0019i\r>7\u0013g\r#;@n\u0007.;Nx\u0004po\u0019f\u0006\"$\u0013g\r "
		// @109: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @10C: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @10F: aastore
		// @110: dup
		// @111: bipush 21 (0x15)
		// @113: ldc_w "Ke\u001cg\u0002u+\u001dm\u0002vxP<M+'F"
		// @116: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @119: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @11C: aastore
		// @11D: dup
		// @11E: bipush 22 (0x16)
		// @120: ldc_w "SJ9FASN>]"
		// @123: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @126: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @129: aastore
		// @12A: dup
		// @12B: bipush 23 (0x17)
		// @12D: ldc_w "S^#A\""
		// @130: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @133: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @136: aastore
		// @137: dup
		// @138: bipush 24 (0x18)
		// @13A: ldc_w "]D=X-[_5(\"_F I(YEJ"
		// @13D: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @140: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @143: aastore
		// @144: dup
		// @145: bipush 25 (0x19)
		// @147: ldc_w "]d\u001en\u0008y+\u0004}\u0015qy\u0019i\r>}\u0019m\u0016{o"
		// @14A: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @14D: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @150: aastore
		// @151: dup
		// @152: bipush 26 (0x1A)
		// @154: ldc_w "Pd\u001fj"
		// @157: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @15A: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @15D: aastore
		// @15E: dup
		// @15F: bipush 27 (0x1B)
		// @161: ldc_w "Yn\u0004(P.;P[\u000erj\u0002a\u0015{"
		// @164: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @167: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @16A: aastore
		// @16B: dup
		// @16C: bipush 28 (0x1C)
		// @16E: ldc_w "Jy\u0011a\u000fwe\u0017"
		// @171: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @174: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @177: aastore
		// @178: dup
		// @179: bipush 29 (0x1D)
		// @17B: ldc_w "Ln\u0006g\n{+A8Q>X\u001fd\u0000lb\u0004m"
		// @17E: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @181: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @184: aastore
		// @185: dup
		// @186: bipush 30 (0x1E)
		// @188: ldc_w "Rd\u0013cAsn\u0013`\u0012><]9S"
		// @18B: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @18E: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @191: aastore
		// @192: dup
		// @193: bipush 31 (0x1F)
		// @195: ldc_w "yb^]I"
		// @198: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @19B: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @19E: aastore
		// @19F: dup
		// @1A0: bipush 32 (0x20)
		// @1A2: ldc_w "Md\u001ci\u0013w\u007f\u00152A"
		// @1A5: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @1A8: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @1AB: aastore
		// @1AC: dup
		// @1AD: bipush 33 (0x21)
		// @1AF: ldc_w "pd\u001em"
		// @1B2: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @1B5: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @1B8: aastore
		// @1B9: dup
		// @1BA: bipush 34 (0x22)
		// @1BC: ldc_w "yb^ZI"
		// @1BF: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @1C2: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @1C5: aastore
		// @1C6: dup
		// @1C7: bipush 35 (0x23)
		// @1C9: ldc_w "yb^M#6"
		// @1CC: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @1CF: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @1D2: aastore
		// @1D3: dup
		// @1D4: bipush 36 (0x24)
		// @1D6: ldc_w "yb^[ 6"
		// @1D9: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @1DC: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @1DF: aastore
		// @1E0: dup
		// @1E1: bipush 37 (0x25)
		// @1E3: ldc_w "yb^E 6"
		// @1E6: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @1E9: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @1EC: aastore
		// @1ED: dup
		// @1EE: bipush 38 (0x26)
		// @1F0: ldc "\"$\u0013g\r "
		// @1F2: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @1F5: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @1F8: aastore
		// @1F9: dup
		// @1FA: bipush 39 (0x27)
		// @1FC: ldc_w "\"h\u001fd\\xm\u0016n\u0007x5"
		// @1FF: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @202: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @205: aastore
		// @206: dup
		// @207: bipush 40 (0x28)
		// @209: ldc_w "yb^NI"
		// @20C: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @20F: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @212: aastore
		// @213: dup
		// @214: bipush 41 (0x29)
		// @216: ldc_w "K{\u0014i\u0015{+\u0013g\u000fm\u007f\u00022A"
		// @219: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @21C: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @21F: aastore
		// @220: dup
		// @221: bipush 42 (0x2A)
		// @223: ldc_w "yb^J 6"
		// @226: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @229: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @22C: aastore
		// @22D: dup
		// @22E: bipush 43 (0x2B)
		// @230: ldc_w "p~\u001cd"
		// @233: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @236: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @239: aastore
		// @23A: dup
		// @23B: bipush 44 (0x2C)
		// @23D: ldc_w "yb^B 6"
		// @240: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @243: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @246: aastore
		// @247: dup
		// @248: bipush 45 (0x2D)
		// @24A: ldc_w "*;["
		// @24D: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @250: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @253: aastore
		// @254: dup
		// @255: bipush 46 (0x2E)
		// @257: ldc_w "e%^&\u001c"
		// @25A: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @25D: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @260: aastore
		// @261: dup
		// @262: bipush 47 (0x2F)
		// @264: ldc_w "yb^L#6"
		// @267: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @26A: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @26D: aastore
		// @26E: dup
		// @26F: bipush 48 (0x30)
		// @271: ldc_w "yb^N#6"
		// @274: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @277: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @27A: aastore
		// @27B: dup
		// @27C: bipush 49 (0x31)
		// @27E: ldc_w "yb^C 6"
		// @281: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @284: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @287: aastore
		// @288: dup
		// @289: bipush 50 (0x32)
		// @28B: ldc_w "yb^_ 6"
		// @28E: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @291: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @294: aastore
		// @295: dup
		// @296: bipush 51 (0x33)
		// @298: ldc_w "\"i\u00026]|yN"
		// @29B: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @29E: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @2A1: aastore
		// @2A2: dup
		// @2A3: bipush 52 (0x34)
		// @2A5: ldc_w "yb^II"
		// @2A8: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @2AB: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @2AE: aastore
		// @2AF: dup
		// @2B0: bipush 53 (0x35)
		// @2B2: ldc_w "yb^^ 6"
		// @2B5: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @2B8: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @2BB: aastore
		// @2BC: dup
		// @2BD: bipush 54 (0x36)
		// @2BF: ldc_w "yb^@I"
		// @2C2: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @2C5: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @2C8: aastore
		// @2C9: dup
		// @2CA: bipush 55 (0x37)
		// @2CC: ldc_w "yb^DI"
		// @2CF: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @2D2: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @2D5: aastore
		// @2D6: dup
		// @2D7: bipush 56 (0x38)
		// @2D9: ldc "yb^^I"
		// @2DB: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @2DE: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @2E1: aastore
		// @2E2: dup
		// @2E3: bipush 57 (0x39)
		// @2E5: ldc "\"i\u00026]|yN4\u0002qgMn\u0007.;@8_"
		// @2E7: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @2EA: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @2ED: aastore
		// @2EE: dup
		// @2EF: bipush 58 (0x3A)
		// @2F1: ldc_w "yb^[I"
		// @2F4: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @2F7: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @2FA: aastore
		// @2FB: dup
		// @2FC: bipush 59 (0x3B)
		// @2FE: ldc_w "yb^I#6"
		// @301: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @304: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @307: aastore
		// @308: dup
		// @309: bipush 60 (0x3C)
		// @30B: ldc_w "yb^M 6"
		// @30E: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @311: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @314: aastore
		// @315: dup
		// @316: bipush 61 (0x3D)
		// @318: ldc_w "/;@8Q;"
		// @31B: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @31E: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @321: aastore
		// @322: dup
		// @323: bipush 62 (0x3E)
		// @325: ldc "yb^YI"
		// @327: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @32A: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @32D: aastore
		// @32E: dup
		// @32F: bipush 63 (0x3F)
		// @331: ldc "yb^N 6"
		// @333: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @336: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @339: aastore
		// @33A: dup
		// @33B: bipush 64 (0x40)
		// @33D: ldc_w "yb^MI"
		// @340: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @343: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @346: aastore
		// @347: dup
		// @348: bipush 65 (0x41)
		// @34A: ldc_w "yb^@ 6"
		// @34D: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @350: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @353: aastore
		// @354: dup
		// @355: bipush 66 (0x42)
		// @357: ldc "Zy\u0011\u007fA}d\u001en\u0008y1P"
		// @359: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @35C: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @35F: aastore
		// @360: dup
		// @361: bipush 67 (0x43)
		// @363: ldc "\u007fy\u0019i\rwx\u00189S"
		// @365: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @368: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @36B: aastore
		// @36C: dup
		// @36D: bipush 68 (0x44)
		// @36F: ldc "JN#\\(PLPG/RR"
		// @371: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @374: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @377: aastore
		// @378: dup
		// @379: bipush 69 (0x45)
		// @37B: ldc "n~\u001dxR,"
		// @37D: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @380: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @383: aastore
		// @384: dup
		// @385: bipush 70 (0x46)
		// @387: ldc "yb^XI"
		// @389: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @38C: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @38F: aastore
		// @390: dup
		// @391: bipush 71 (0x47)
		// @393: ldc "YD4]-["
		// @395: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @398: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @39B: aastore
		// @39C: dup
		// @39D: bipush 72 (0x48)
		// @39F: ldc "sn\u001dj\u0004lx/m\u0019nj\u001e{\u0008qe/{\u0002ln\u0015f"
		// @3A1: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @3A4: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @3A7: aastore
		// @3A8: dup
		// @3A9: bipush 73 (0x49)
		// @3AB: ldc "JN#\\(PL"
		// @3AD: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @3B0: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @3B3: aastore
		// @3B4: dup
		// @3B5: bipush 74 (0x4A)
		// @3B7: ldc_w "yb^K#6"
		// @3BA: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @3BD: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @3C0: aastore
		// @3C1: dup
		// @3C2: bipush 75 (0x4B)
		// @3C4: ldc_w "yb^FI"
		// @3C7: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @3CA: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @3CD: aastore
		// @3CE: dup
		// @3CF: bipush 76 (0x4C)
		// @3D1: ldc_w "yb^L 6"
		// @3D4: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @3D7: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @3DA: aastore
		// @3DB: dup
		// @3DC: bipush 77 (0x4D)
		// @3DE: ldc_w "yb^BI"
		// @3E1: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @3E4: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @3E7: aastore
		// @3E8: dup
		// @3E9: bipush 78 (0x4E)
		// @3EB: ldc_w "\"i\u00026"
		// @3EE: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @3F1: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @3F4: aastore
		// @3F5: dup
		// @3F6: bipush 79 (0x4F)
		// @3F8: ldc_w "yb^4\u0008pb\u00046I"
		// @3FB: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @3FE: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @401: aastore
		// @402: dup
		// @403: bipush 80 (0x50)
		// @405: ldc_w "yb^\\ 6"
		// @408: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @40B: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @40E: aastore
		// @40F: dup
		// @410: bipush 81 (0x51)
		// @412: ldc_w ">#5p\u0011{h\u0004(\u0008j+\u0004gA|nPa\u0006pd\u0002m\u00050\""
		// @415: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @418: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @41B: aastore
		// @41C: dup
		// @41D: bipush 82 (0x52)
		// @41F: ldc_w "Pd\u0004(\rql\u0017m\u0005>b\u001e&"
		// @422: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @425: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @428: aastore
		// @429: dup
		// @42A: bipush 83 (0x53)
		// @42C: ldc_w "yb^X 6"
		// @42F: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @432: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @435: aastore
		// @436: dup
		// @437: bipush 84 (0x54)
		// @439: ldc_w "Zj\u0004iAmn\u001e|O"
		// @43C: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @43F: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @442: aastore
		// @443: dup
		// @444: bipush 85 (0x55)
		// @446: ldc_w "yb^CI"
		// @449: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @44C: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @44F: aastore
		// @450: dup
		// @451: bipush 86 (0x56)
		// @453: ldc_w "yb^AI"
		// @456: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @459: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @45C: aastore
		// @45D: dup
		// @45E: bipush 87 (0x57)
		// @460: ldc_w "\"cN"
		// @463: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @466: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @469: aastore
		// @46A: dup
		// @46B: bipush 88 (0x58)
		// @46D: ldc_w "\"{\u0019k"
		// @470: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @473: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @476: aastore
		// @477: dup
		// @478: bipush 89 (0x59)
		// @47A: ldc_w "yb^LI"
		// @47D: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @480: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @483: aastore
		// @484: dup
		// @485: bipush 90 (0x5A)
		// @487: ldc_w "\"g\u001fk\nnb\u00136"
		// @48A: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @48D: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @490: aastore
		// @491: dup
		// @492: bipush 91 (0x5B)
		// @494: ldc_w "Mh\u0002g\rrb\u001eo\u0017wn\u0007"
		// @497: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @49A: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @49D: aastore
		// @49E: dup
		// @49F: bipush 92 (0x5C)
		// @4A1: ldc_w "\"y\u001dj\u0002\u007fe\u0013m\rqe\u001fn\u0007 "
		// @4A4: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @4A7: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @4AA: aastore
		// @4AB: dup
		// @4AC: bipush 93 (0x5D)
		// @4AE: ldc_w "\"\u007f\u001fx_"
		// @4B1: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @4B4: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @4B7: aastore
		// @4B8: dup
		// @4B9: bipush 94 (0x5E)
		// @4BB: ldc_w "\"i\u001f|\u0015qfN"
		// @4BE: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @4C1: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @4C4: aastore
		// @4C5: dup
		// @4C6: bipush 95 (0x5F)
		// @4C8: ldc_w ">7\u0019e\u0006#:C6A\"b\u001do\\/?N(]wf\u00175P+5"
		// @4CB: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @4CE: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @4D1: aastore
		// @4D2: dup
		// @4D3: bipush 96 (0x60)
		// @4D5: ldc_w "\"h\u0015f\u0015lnN"
		// @4D8: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @4DB: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @4DE: aastore
		// @4DF: dup
		// @4E0: bipush 97 (0x61)
		// @4E2: ldc_w "\"g\u001fk\n "
		// @4E5: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @4E8: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @4EB: aastore
		// @4EC: dup
		// @4ED: bipush 98 (0x62)
		// @4EF: ldc_w "Zj\u0004i7wn\u0007"
		// @4F2: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @4F5: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @4F8: aastore
		// @4F9: dup
		// @4FA: bipush 99 (0x63)
		// @4FC: ldc_w "Vn\u0011l\u0008pl\u0003X\u0000pn"
		// @4FF: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @502: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @505: aastore
		// @506: dup
		// @507: bipush 100 (0x64)
		// @509: ldc "yb^Y 6"
		// @50B: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @50E: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @511: aastore
		// @512: dup
		// @513: bipush 101 (0x65)
		// @515: ldc_w "yb^G 6"
		// @518: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @51B: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @51E: aastore
		// @51F: dup
		// @520: bipush 102 (0x66)
		// @522: ldc_w "yb^OI"
		// @525: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @528: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @52B: aastore
		// @52C: dup
		// @52D: bipush 103 (0x67)
		// @52F: ldc_w "yb^KI"
		// @532: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @535: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @538: aastore
		// @539: dup
		// @53A: bipush 104 (0x68)
		// @53C: ldc_w "yb^] 6"
		// @53F: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @542: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @545: aastore
		// @546: dup
		// @547: bipush 105 (0x69)
		// @549: ldc_w ">wP"
		// @54C: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @54F: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @552: aastore
		// @553: dup
		// @554: bipush 106 (0x6A)
		// @556: ldc_w "b+"
		// @559: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @55C: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @55F: aastore
		// @560: dup
		// @561: bipush 107 (0x6B)
		// @563: ldc_w "0a\u0011~\u0000$"
		// @566: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @569: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @56C: aastore
		// @56D: dup
		// @56E: bipush 108 (0x6C)
		// @570: ldc "yb^EI"
		// @572: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @575: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @578: aastore
		// @579: dup
		// @57A: bipush 109 (0x6D)
		// @57C: ldc "yb^I 6"
		// @57E: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @581: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @584: aastore
		// @585: dup
		// @586: bipush 110 (0x6E)
		// @588: ldc_w "yb^F 6"
		// @58B: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @58E: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @591: aastore
		// @592: dup
		// @593: bipush 111 (0x6F)
		// @595: ldc_w "yb^GI"
		// @598: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @59B: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @59E: aastore
		// @59F: dup
		// @5A0: bipush 112 (0x70)
		// @5A2: ldc_w "/2D?W/"
		// @5A5: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @5A8: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @5AB: aastore
		// @5AC: dup
		// @5AD: bipush 113 (0x71)
		// @5AF: ldc_w ".;@8Q."
		// @5B2: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @5B5: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @5B8: aastore
		// @5B9: dup
		// @5BA: bipush 114 (0x72)
		// @5BC: ldc_w ".mI<\u0002&"
		// @5BF: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @5C2: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @5C5: aastore
		// @5C6: dup
		// @5C7: bipush 115 (0x73)
		// @5C9: ldc_w "yb^A 6"
		// @5CC: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @5CF: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @5D2: aastore
		// @5D3: dup
		// @5D4: bipush 116 (0x74)
		// @5D6: ldc_w "&m\u0014n\u0007x"
		// @5D9: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @5DC: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @5DF: aastore
		// @5E0: dup
		// @5E1: bipush 117 (0x75)
		// @5E3: ldc "yb^D 6"
		// @5E5: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @5E8: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @5EB: aastore
		// @5EC: dup
		// @5ED: bipush 118 (0x76)
		// @5EF: ldc "yb^Z 6"
		// @5F1: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @5F4: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @5F7: aastore
		// @5F8: dup
		// @5F9: bipush 119 (0x77)
		// @5FB: ldc "yb^J#6"
		// @5FD: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @600: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @603: aastore
		// @604: dup
		// @605: bipush 120 (0x78)
		// @607: ldc_w "yb^K 6"
		// @60A: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @60D: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @610: aastore
		// @611: dup
		// @612: bipush 121 (0x79)
		// @614: ldc_w "yb^\\I"
		// @617: invokestatic game.C_100034_gi.func_103987_z(java.lang.String)char[]
		// @61A: invokestatic game.C_100034_gi.func_103999_z(char[])java.lang.String
		// @61D: aastore
		// @61E: putstatic java.lang.String[] game.C_100034_gi.field_104040_z
		// @621: iconst_1
		// @622: putstatic boolean game.C_100034_gi.field_104036_j
		// @625: new game.C_100133_tk
		// @628: dup
		// @629: invokespecial game.C_100133_tk.<init>()void
		// @62C: putstatic game.C_100133_tk game.C_100034_gi.field_104034_l
		// @62F: iconst_4
		// @630: newarray int[]
		// @632: putstatic int[] game.C_100034_gi.field_104027_f
		// @635: return
	}
	
	private static char[] func_103987_z(String arg0)
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
		// @0E: bipush 97 (0x61)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103999_z(char[] arg0)
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
		// @35: bipush 11 (0x0B)
		// @37: goto @46
		// @3A: bipush 112 (0x70)
		// @3C: goto @46
		// @3F: bipush 8 (0x08)
		// @41: goto @46
		// @44: bipush 97 (0x61)
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
