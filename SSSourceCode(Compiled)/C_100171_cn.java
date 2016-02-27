package game;

final class C_100171_cn
{
	int[] field_105578_i;
	static int field_105573_l;
	static String field_105564_f;
	int[] field_105575_j;
	int field_105576_k;
	int[] field_105580_p;
	private int field_105572_o;
	private int field_105565_g;
	private int field_105579_q;
	int field_105569_c;
	static int[] field_105571_n;
	int[] field_105574_m;
	int[] field_105577_h;
	static String field_105568_b;
	static C_100098_h field_105566_d;
	int[] field_105567_e;
	static boolean field_105570_a;
	private static final String[] field_105581_z;
	
	static final long func_105553_a(CharSequence arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: iload_1
		// @06: sipush 4000 (0x0FA0)
		// @09: if_icmpeq @15
		// @0C: bipush -54 (0xCA)
		// @0E: putstatic int game.C_100171_cn.field_105573_l
		// @11: goto @15
		// @14: athrow
		// @15: aload_0
		// @16: invokeinterface java.lang.CharSequence.length()int
		// @1B: istore_2
		// @1C: lconst_0
		// @1D: lstore_3
		// @1E: iconst_0
		// @1F: istore #5
		// @21: iload #5
		// @23: iconst_m1
		// @24: ixor
		// @25: iload_2
		// @26: iconst_m1
		// @27: ixor
		// @28: if_icmple @4A
		// @2B: aload_0
		// @2C: iload #5
		// @2E: invokeinterface java.lang.CharSequence.charAt(int)char
		// @33: i2l
		// @34: lload_3
		// @35: lneg
		// @36: ladd
		// @37: lload_3
		// @38: ldc -170480315 (0xf5d6ad45)
		// @3A: lshl
		// @3B: ladd
		// @3C: iload #6
		// @3E: ifne @4B
		// @41: lstore_3
		// @42: iinc #5 +1
		// @45: iload #6
		// @47: ifeq @21
		// @4A: lload_3
		// @4B: lreturn
		// @4C: astore_2
		// @4D: aload_2
		// @4E: new java.lang.StringBuilder
		// @51: dup
		// @52: invokespecial java.lang.StringBuilder.<init>()void
		// @55: getstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @58: bipush 9 (0x09)
		// @5A: aaload
		// @5B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5E: aload_0
		// @5F: ifnull @6B
		// @62: getstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @65: iconst_3
		// @66: aaload
		// @67: goto @70
		// @6A: athrow
		// @6B: getstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @6E: iconst_1
		// @6F: aaload
		// @70: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @73: bipush 44 (0x2C)
		// @75: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @78: iload_1
		// @79: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7C: bipush 41 (0x29)
		// @7E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @81: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @84: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @87: athrow
	}
	
	final int func_105560_c(int arg0, int arg1)
	{
		// @00: bipush -93 (0xA3)
		// @02: bipush 16 (0x10)
		// @04: iload_1
		// @05: isub
		// @06: bipush 44 (0x2C)
		// @08: idiv
		// @09: idiv
		// @0A: istore_3
		// @0B: iconst_m1
		// @0C: iload_2
		// @0D: iconst_m1
		// @0E: ixor
		// @0F: if_icmplt @16
		// @12: goto @1D
		// @15: athrow
		// @16: aload_0
		// @17: getfield int[] game.C_100171_cn.field_105574_m
		// @1A: iconst_0
		// @1B: iaload
		// @1C: ireturn
		// @1D: aload_0
		// @1E: getfield int game.C_100171_cn.field_105576_k
		// @21: iload_2
		// @22: if_icmple @29
		// @25: goto @35
		// @28: athrow
		// @29: aload_0
		// @2A: getfield int[] game.C_100171_cn.field_105574_m
		// @2D: iconst_m1
		// @2E: aload_0
		// @2F: getfield int game.C_100171_cn.field_105576_k
		// @32: iadd
		// @33: iaload
		// @34: ireturn
		// @35: aload_0
		// @36: getfield int[] game.C_100171_cn.field_105574_m
		// @39: iload_2
		// @3A: iaload
		// @3B: ireturn
		// @3C: astore_3
		// @3D: aload_3
		// @3E: new java.lang.StringBuilder
		// @41: dup
		// @42: invokespecial java.lang.StringBuilder.<init>()void
		// @45: getstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @48: bipush 7 (0x07)
		// @4A: aaload
		// @4B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4E: iload_1
		// @4F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @52: bipush 44 (0x2C)
		// @54: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @57: iload_2
		// @58: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5B: bipush 41 (0x29)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @63: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @66: athrow
	}
	
	final void func_105562_a(int arg0, int arg1, int arg2)
	{
		// @0000: getstatic int game.SteelSentinels.field_105275_O
		// @0003: istore #22
		// @0005: aload_0
		// @0006: bipush 100 (0x64)
		// @0008: putfield int game.C_100171_cn.field_105565_g
		// @000B: aload_0
		// @000C: iconst_0
		// @000D: putfield int game.C_100171_cn.field_105569_c
		// @0010: aload_0
		// @0011: iload_2
		// @0012: putfield int game.C_100171_cn.field_105579_q
		// @0015: aload_0
		// @0016: aload_0
		// @0017: getfield int game.C_100171_cn.field_105565_g
		// @001A: newarray int[]
		// @001C: putfield int[] game.C_100171_cn.field_105580_p
		// @001F: aload_0
		// @0020: dup
		// @0021: getfield int game.C_100171_cn.field_105579_q
		// @0024: bipush -9 (0xF7)
		// @0026: iand
		// @0027: putfield int game.C_100171_cn.field_105579_q
		// @002A: aload_0
		// @002B: aload_0
		// @002C: getfield int game.C_100171_cn.field_105579_q
		// @002F: bipush 8 (0x08)
		// @0031: irem
		// @0032: putfield int game.C_100171_cn.field_105572_o
		// @0035: aload_0
		// @0036: getfield int game.C_100171_cn.field_105572_o
		// @0039: iconst_m1
		// @003A: ixor
		// @003B: bipush -6 (0xFA)
		// @003D: if_icmpne @0049
		// @0040: aload_0
		// @0041: iconst_0
		// @0042: putfield int game.C_100171_cn.field_105572_o
		// @0045: goto @0049
		// @0048: athrow
		// @0049: aload_0
		// @004A: getfield int game.C_100171_cn.field_105579_q
		// @004D: iconst_m1
		// @004E: ixor
		// @004F: ifeq @0056
		// @0052: goto @005B
		// @0055: athrow
		// @0056: aload_0
		// @0057: iconst_0
		// @0058: putfield int game.C_100171_cn.field_105572_o
		// @005B: sipush 20000 (0x4E20)
		// @005E: istore #4
		// @0060: sipush 8000 (0x1F40)
		// @0063: istore #4
		// @0065: iconst_2
		// @0066: iload_1
		// @0067: if_icmplt @006E
		// @006A: goto @0073
		// @006D: athrow
		// @006E: sipush 16000 (0x3E80)
		// @0071: istore #4
		// @0073: bipush 6 (0x06)
		// @0075: iload_1
		// @0076: if_icmpgt @007E
		// @0079: sipush 24000 (0x5DC0)
		// @007C: istore #4
		// @007E: iload_1
		// @007F: bipush 12 (0x0C)
		// @0081: if_icmpge @0088
		// @0084: goto @008D
		// @0087: athrow
		// @0088: sipush 32000 (0x7D00)
		// @008B: istore #4
		// @008D: sipush 32000 (0x7D00)
		// @0090: iload #4
		// @0092: iadd
		// @0093: iconst_2
		// @0094: idiv
		// @0095: istore #4
		// @0097: iconst_m1
		// @0098: aload_0
		// @0099: getfield int game.C_100171_cn.field_105572_o
		// @009C: iconst_m1
		// @009D: ixor
		// @009E: if_icmpeq @00A5
		// @00A1: goto @00AB
		// @00A4: athrow
		// @00A5: wide (iinc) #4 +4000
		// @00AB: aload_0
		// @00AC: getfield int game.C_100171_cn.field_105572_o
		// @00AF: iload_3
		// @00B0: if_icmpne @00B8
		// @00B3: sipush 32000 (0x7D00)
		// @00B6: istore #4
		// @00B8: iload_2
		// @00B9: iconst_m1
		// @00BA: if_icmpne @00C2
		// @00BD: sipush 6528 (0x1980)
		// @00C0: istore #4
		// @00C2: getstatic int game.C_100218_am.field_103115_N
		// @00C5: bipush 10 (0x0A)
		// @00C7: if_icmpne @00DC
		// @00CA: getstatic int[][] game.C_100005_fk.field_103596_n
		// @00CD: getstatic int game.C_100197_ra.field_100867_r
		// @00D0: bipush 10 (0x0A)
		// @00D2: getstatic int game.C_100194_rd.field_103072_v
		// @00D5: imul
		// @00D6: iadd
		// @00D7: aaload
		// @00D8: iconst_2
		// @00D9: iaload
		// @00DA: istore #4
		// @00DC: aload_0
		// @00DD: bipush 15 (0x0F)
		// @00DF: putfield int game.C_100171_cn.field_105576_k
		// @00E2: aload_0
		// @00E3: aload_0
		// @00E4: getfield int game.C_100171_cn.field_105576_k
		// @00E7: newarray int[]
		// @00E9: putfield int[] game.C_100171_cn.field_105574_m
		// @00EC: aload_0
		// @00ED: aload_0
		// @00EE: getfield int game.C_100171_cn.field_105576_k
		// @00F1: newarray int[]
		// @00F3: putfield int[] game.C_100171_cn.field_105567_e
		// @00F6: new game.C_100038_wa
		// @00F9: dup
		// @00FA: iconst_2
		// @00FB: newarray int[]
		// @00FD: dup
		// @00FE: iconst_0
		// @00FF: aload_0
		// @0100: getfield int game.C_100171_cn.field_105579_q
		// @0103: iastore
		// @0104: dup
		// @0105: iconst_1
		// @0106: bipush -2 (0xFE)
		// @0108: iastore
		// @0109: invokespecial game.C_100038_wa.<init>(int[])void
		// @010C: astore #5
		// @010E: iconst_0
		// @010F: istore #6
		// @0111: iload #6
		// @0113: iconst_m1
		// @0114: ixor
		// @0115: bipush -16 (0xF0)
		// @0117: if_icmple @0160
		// @011A: aload_0
		// @011B: getfield int[] game.C_100171_cn.field_105567_e
		// @011E: iload #6
		// @0120: aload #5
		// @0122: bipush -4 (0xFC)
		// @0124: iload #4
		// @0126: bipush 60 (0x3C)
		// @0128: imul
		// @0129: sipush 640 (0x0280)
		// @012C: idiv
		// @012D: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @0130: sipush 128 (0x0080)
		// @0133: iadd
		// @0134: iastore
		// @0135: aload_0
		// @0136: getfield int[] game.C_100171_cn.field_105574_m
		// @0139: iload #6
		// @013B: aload #5
		// @013D: bipush -4 (0xFC)
		// @013F: iload #4
		// @0141: bipush 60 (0x3C)
		// @0143: imul
		// @0144: sipush 640 (0x0280)
		// @0147: idiv
		// @0148: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @014B: bipush -128 (0x80)
		// @014D: isub
		// @014E: iastore
		// @014F: iinc #6 +1
		// @0152: iload #22
		// @0154: ifne @018F
		// @0157: iload #22
		// @0159: ifeq @0111
		// @015C: goto @0160
		// @015F: athrow
		// @0160: bipush 16 (0x10)
		// @0162: aload_0
		// @0163: getfield int game.C_100171_cn.field_105579_q
		// @0166: if_icmpne @017B
		// @0169: getstatic int[][] game.C_100005_fk.field_103596_n
		// @016C: getstatic int game.C_100197_ra.field_100867_r
		// @016F: getstatic int game.C_100194_rd.field_103072_v
		// @0172: bipush 10 (0x0A)
		// @0174: imul
		// @0175: iadd
		// @0176: aaload
		// @0177: iconst_2
		// @0178: iaload
		// @0179: istore #4
		// @017B: iconst_0
		// @017C: putstatic int game.C_100328_ia.field_107258_e
		// @017F: iconst_0
		// @0180: putstatic int game.C_100305_km.field_103229_Q
		// @0183: iconst_0
		// @0184: putstatic boolean game.C_100005_fk.field_103590_g
		// @0187: iconst_0
		// @0188: putstatic int game.C_100058_dg.field_101574_J
		// @018B: iconst_0
		// @018C: putstatic boolean game.C_100066_dl.field_101637_I
		// @018F: bipush -17 (0xEF)
		// @0191: aload_0
		// @0192: getfield int game.C_100171_cn.field_105579_q
		// @0195: iconst_m1
		// @0196: ixor
		// @0197: if_icmpne @0418
		// @019A: getstatic int game.C_100218_am.field_103115_N
		// @019D: iconst_1
		// @019E: if_icmpne @027F
		// @01A1: goto @01A5
		// @01A4: athrow
		// @01A5: bipush 10 (0x0A)
		// @01A7: getstatic int game.C_100181_cf.field_105704_e
		// @01AA: if_icmpgt @027F
		// @01AD: goto @01B1
		// @01B0: athrow
		// @01B1: aload_0
		// @01B2: getfield int[] game.C_100171_cn.field_105574_m
		// @01B5: iconst_0
		// @01B6: sipush 3000 (0x0BB8)
		// @01B9: iastore
		// @01BA: aload_0
		// @01BB: getfield int[] game.C_100171_cn.field_105567_e
		// @01BE: iconst_0
		// @01BF: sipush 4300 (0x10CC)
		// @01C2: iastore
		// @01C3: aload_0
		// @01C4: getfield int[] game.C_100171_cn.field_105574_m
		// @01C7: iconst_1
		// @01C8: sipush 1000 (0x03E8)
		// @01CB: iastore
		// @01CC: aload_0
		// @01CD: getfield int[] game.C_100171_cn.field_105574_m
		// @01D0: iconst_3
		// @01D1: sipush 900 (0x0384)
		// @01D4: iastore
		// @01D5: aload_0
		// @01D6: getfield int[] game.C_100171_cn.field_105574_m
		// @01D9: bipush 6 (0x06)
		// @01DB: sipush 1200 (0x04B0)
		// @01DE: iastore
		// @01DF: aload_0
		// @01E0: getfield int[] game.C_100171_cn.field_105574_m
		// @01E3: bipush 9 (0x09)
		// @01E5: sipush 1600 (0x0640)
		// @01E8: iastore
		// @01E9: aload_0
		// @01EA: getfield int[] game.C_100171_cn.field_105574_m
		// @01ED: iconst_4
		// @01EE: sipush 1100 (0x044C)
		// @01F1: iastore
		// @01F2: aload_0
		// @01F3: getfield int[] game.C_100171_cn.field_105574_m
		// @01F6: iconst_5
		// @01F7: sipush 900 (0x0384)
		// @01FA: iastore
		// @01FB: aload_0
		// @01FC: getfield int[] game.C_100171_cn.field_105574_m
		// @01FF: bipush 8 (0x08)
		// @0201: sipush 2400 (0x0960)
		// @0204: iastore
		// @0205: aload_0
		// @0206: getfield int[] game.C_100171_cn.field_105574_m
		// @0209: bipush 7 (0x07)
		// @020B: sipush 2000 (0x07D0)
		// @020E: iastore
		// @020F: aload_0
		// @0210: getfield int[] game.C_100171_cn.field_105567_e
		// @0213: iconst_1
		// @0214: sipush 4000 (0x0FA0)
		// @0217: iastore
		// @0218: aload_0
		// @0219: getfield int[] game.C_100171_cn.field_105574_m
		// @021C: iconst_2
		// @021D: sipush 1200 (0x04B0)
		// @0220: iastore
		// @0221: aload_0
		// @0222: getfield int[] game.C_100171_cn.field_105567_e
		// @0225: bipush 9 (0x09)
		// @0227: sipush 5000 (0x1388)
		// @022A: iastore
		// @022B: aload_0
		// @022C: getfield int[] game.C_100171_cn.field_105574_m
		// @022F: bipush 10 (0x0A)
		// @0231: sipush 1200 (0x04B0)
		// @0234: iastore
		// @0235: aload_0
		// @0236: getfield int[] game.C_100171_cn.field_105574_m
		// @0239: bipush 12 (0x0C)
		// @023B: sipush 900 (0x0384)
		// @023E: iastore
		// @023F: aload_0
		// @0240: getfield int[] game.C_100171_cn.field_105574_m
		// @0243: bipush 11 (0x0B)
		// @0245: sipush 1000 (0x03E8)
		// @0248: iastore
		// @0249: aload_0
		// @024A: getfield int[] game.C_100171_cn.field_105567_e
		// @024D: bipush 10 (0x0A)
		// @024F: sipush 2500 (0x09C4)
		// @0252: iastore
		// @0253: aload_0
		// @0254: getfield int[] game.C_100171_cn.field_105567_e
		// @0257: bipush 12 (0x0C)
		// @0259: sipush 3000 (0x0BB8)
		// @025C: iastore
		// @025D: aload_0
		// @025E: getfield int[] game.C_100171_cn.field_105574_m
		// @0261: bipush 13 (0x0D)
		// @0263: sipush 800 (0x0320)
		// @0266: iastore
		// @0267: aload_0
		// @0268: getfield int[] game.C_100171_cn.field_105567_e
		// @026B: bipush 13 (0x0D)
		// @026D: sipush 2800 (0x0AF0)
		// @0270: iastore
		// @0271: aload_0
		// @0272: getfield int[] game.C_100171_cn.field_105574_m
		// @0275: bipush 14 (0x0E)
		// @0277: sipush 900 (0x0384)
		// @027A: iastore
		// @027B: goto @027F
		// @027E: athrow
		// @027F: getstatic int game.C_100218_am.field_103115_N
		// @0282: iconst_m1
		// @0283: ixor
		// @0284: iconst_m1
		// @0285: if_icmpeq @02A2
		// @0288: getstatic int game.C_100218_am.field_103115_N
		// @028B: iconst_m1
		// @028C: ixor
		// @028D: bipush -2 (0xFE)
		// @028F: if_icmpeq @02A2
		// @0292: goto @0296
		// @0295: athrow
		// @0296: bipush 7 (0x07)
		// @0298: getstatic int game.C_100218_am.field_103115_N
		// @029B: if_icmpne @03B3
		// @029E: goto @02A2
		// @02A1: athrow
		// @02A2: aload_0
		// @02A3: getfield int[] game.C_100171_cn.field_105574_m
		// @02A6: iconst_5
		// @02A7: sipush 3400 (0x0D48)
		// @02AA: iastore
		// @02AB: aload_0
		// @02AC: getfield int[] game.C_100171_cn.field_105574_m
		// @02AF: iconst_0
		// @02B0: sipush 4000 (0x0FA0)
		// @02B3: iastore
		// @02B4: aload_0
		// @02B5: getfield int[] game.C_100171_cn.field_105574_m
		// @02B8: bipush 7 (0x07)
		// @02BA: sipush 1000 (0x03E8)
		// @02BD: iastore
		// @02BE: aload_0
		// @02BF: getfield int[] game.C_100171_cn.field_105574_m
		// @02C2: iconst_2
		// @02C3: sipush 1100 (0x044C)
		// @02C6: iastore
		// @02C7: aload_0
		// @02C8: getfield int[] game.C_100171_cn.field_105574_m
		// @02CB: iconst_4
		// @02CC: sipush 3000 (0x0BB8)
		// @02CF: iastore
		// @02D0: aload_0
		// @02D1: getfield int[] game.C_100171_cn.field_105574_m
		// @02D4: bipush 6 (0x06)
		// @02D6: sipush 3000 (0x0BB8)
		// @02D9: iastore
		// @02DA: aload_0
		// @02DB: getfield int[] game.C_100171_cn.field_105574_m
		// @02DE: iconst_3
		// @02DF: sipush 3200 (0x0C80)
		// @02E2: iastore
		// @02E3: aload_0
		// @02E4: getfield int[] game.C_100171_cn.field_105574_m
		// @02E7: iconst_1
		// @02E8: sipush 1000 (0x03E8)
		// @02EB: iastore
		// @02EC: aload_0
		// @02ED: getfield int[] game.C_100171_cn.field_105567_e
		// @02F0: bipush 7 (0x07)
		// @02F2: sipush 3000 (0x0BB8)
		// @02F5: iastore
		// @02F6: aload_0
		// @02F7: getfield int[] game.C_100171_cn.field_105574_m
		// @02FA: bipush 8 (0x08)
		// @02FC: sipush 1200 (0x04B0)
		// @02FF: iastore
		// @0300: aload_0
		// @0301: getfield int[] game.C_100171_cn.field_105567_e
		// @0304: bipush 8 (0x08)
		// @0306: sipush 2900 (0x0B54)
		// @0309: iastore
		// @030A: aload_0
		// @030B: getfield int[] game.C_100171_cn.field_105574_m
		// @030E: bipush 10 (0x0A)
		// @0310: sipush 860 (0x035C)
		// @0313: iastore
		// @0314: aload_0
		// @0315: getfield int[] game.C_100171_cn.field_105574_m
		// @0318: bipush 9 (0x09)
		// @031A: sipush 900 (0x0384)
		// @031D: iastore
		// @031E: aload_0
		// @031F: getfield int[] game.C_100171_cn.field_105567_e
		// @0322: bipush 10 (0x0A)
		// @0324: sipush 3200 (0x0C80)
		// @0327: iastore
		// @0328: aload_0
		// @0329: getfield int[] game.C_100171_cn.field_105574_m
		// @032C: bipush 11 (0x0B)
		// @032E: sipush 800 (0x0320)
		// @0331: iastore
		// @0332: aload_0
		// @0333: getfield int[] game.C_100171_cn.field_105567_e
		// @0336: bipush 11 (0x0B)
		// @0338: sipush 3600 (0x0E10)
		// @033B: iastore
		// @033C: aload_0
		// @033D: getfield int[] game.C_100171_cn.field_105574_m
		// @0340: bipush 12 (0x0C)
		// @0342: sipush 860 (0x035C)
		// @0345: iastore
		// @0346: aload_0
		// @0347: getfield int[] game.C_100171_cn.field_105574_m
		// @034A: bipush 13 (0x0D)
		// @034C: sipush 800 (0x0320)
		// @034F: iastore
		// @0350: aload_0
		// @0351: getfield int[] game.C_100171_cn.field_105567_e
		// @0354: bipush 12 (0x0C)
		// @0356: sipush 700 (0x02BC)
		// @0359: iastore
		// @035A: iconst_1
		// @035B: getstatic int game.C_100218_am.field_103115_N
		// @035E: if_icmpeq @0373
		// @0361: goto @0365
		// @0364: athrow
		// @0365: getstatic int game.C_100218_am.field_103115_N
		// @0368: iconst_m1
		// @0369: ixor
		// @036A: bipush -8 (0xF8)
		// @036C: if_icmpne @039A
		// @036F: goto @0373
		// @0372: athrow
		// @0373: ldc 180000 (0x2bf20)
		// @0375: putstatic int game.C_100328_ia.field_107258_e
		// @0378: aload_0
		// @0379: getfield int[] game.C_100171_cn.field_105567_e
		// @037C: bipush 11 (0x0B)
		// @037E: sipush 3200 (0x0C80)
		// @0381: iastore
		// @0382: aload_0
		// @0383: getfield int[] game.C_100171_cn.field_105567_e
		// @0386: bipush 12 (0x0C)
		// @0388: sipush 4000 (0x0FA0)
		// @038B: iastore
		// @038C: aload_0
		// @038D: getfield int[] game.C_100171_cn.field_105567_e
		// @0390: bipush 10 (0x0A)
		// @0392: sipush 700 (0x02BC)
		// @0395: iastore
		// @0396: goto @039A
		// @0399: athrow
		// @039A: aload_0
		// @039B: getfield int[] game.C_100171_cn.field_105567_e
		// @039E: bipush 14 (0x0E)
		// @03A0: sipush 4600 (0x11F8)
		// @03A3: iastore
		// @03A4: aload_0
		// @03A5: getfield int[] game.C_100171_cn.field_105567_e
		// @03A8: bipush 13 (0x0D)
		// @03AA: sipush 4500 (0x1194)
		// @03AD: iastore
		// @03AE: iload #22
		// @03B0: ifeq @0418
		// @03B3: aload_0
		// @03B4: getfield int[] game.C_100171_cn.field_105574_m
		// @03B7: bipush 11 (0x0B)
		// @03B9: sipush 3400 (0x0D48)
		// @03BC: iastore
		// @03BD: aload_0
		// @03BE: getfield int[] game.C_100171_cn.field_105574_m
		// @03C1: bipush 9 (0x09)
		// @03C3: sipush 4000 (0x0FA0)
		// @03C6: iastore
		// @03C7: aload_0
		// @03C8: getfield int[] game.C_100171_cn.field_105574_m
		// @03CB: bipush 13 (0x0D)
		// @03CD: sipush 1200 (0x04B0)
		// @03D0: iastore
		// @03D1: aload_0
		// @03D2: getfield int[] game.C_100171_cn.field_105574_m
		// @03D5: bipush 7 (0x07)
		// @03D7: sipush 2000 (0x07D0)
		// @03DA: iastore
		// @03DB: aload_0
		// @03DC: getfield int[] game.C_100171_cn.field_105574_m
		// @03DF: bipush 10 (0x0A)
		// @03E1: sipush 3000 (0x0BB8)
		// @03E4: iastore
		// @03E5: aload_0
		// @03E6: getfield int[] game.C_100171_cn.field_105567_e
		// @03E9: iconst_2
		// @03EA: sipush 3000 (0x0BB8)
		// @03ED: iastore
		// @03EE: aload_0
		// @03EF: getfield int[] game.C_100171_cn.field_105574_m
		// @03F2: bipush 12 (0x0C)
		// @03F4: sipush 3200 (0x0C80)
		// @03F7: iastore
		// @03F8: aload_0
		// @03F9: getfield int[] game.C_100171_cn.field_105574_m
		// @03FC: iconst_4
		// @03FD: sipush 800 (0x0320)
		// @0400: iastore
		// @0401: aload_0
		// @0402: getfield int[] game.C_100171_cn.field_105574_m
		// @0405: iconst_5
		// @0406: sipush 800 (0x0320)
		// @0409: iastore
		// @040A: aload_0
		// @040B: getfield int[] game.C_100171_cn.field_105574_m
		// @040E: bipush 8 (0x08)
		// @0410: sipush 3000 (0x0BB8)
		// @0413: iastore
		// @0414: goto @0418
		// @0417: athrow
		// @0418: bipush 9 (0x09)
		// @041A: getstatic int game.C_100218_am.field_103115_N
		// @041D: if_icmpne @0476
		// @0420: aload_0
		// @0421: getfield int[] game.C_100171_cn.field_105574_m
		// @0424: iconst_0
		// @0425: sipush 4000 (0x0FA0)
		// @0428: iastore
		// @0429: aload_0
		// @042A: getfield int[] game.C_100171_cn.field_105574_m
		// @042D: bipush 14 (0x0E)
		// @042F: sipush 4000 (0x0FA0)
		// @0432: iastore
		// @0433: aload_0
		// @0434: getfield int[] game.C_100171_cn.field_105574_m
		// @0437: iconst_1
		// @0438: sipush 3000 (0x0BB8)
		// @043B: iastore
		// @043C: aload_0
		// @043D: getfield int[] game.C_100171_cn.field_105574_m
		// @0440: bipush 13 (0x0D)
		// @0442: sipush 3000 (0x0BB8)
		// @0445: iastore
		// @0446: iconst_1
		// @0447: istore #6
		// @0449: bipush -14 (0xF2)
		// @044B: iload #6
		// @044D: iconst_m1
		// @044E: ixor
		// @044F: if_icmpgt @0476
		// @0452: aload_0
		// @0453: getfield int[] game.C_100171_cn.field_105574_m
		// @0456: iload #6
		// @0458: invokestatic java.lang.Math.random()double
		// @045B: ldc2_w 600.0
		// @045E: dmul
		// @045F: d2i
		// @0460: sipush 700 (0x02BC)
		// @0463: iadd
		// @0464: iastore
		// @0465: iinc #6 +1
		// @0468: iload #22
		// @046A: ifne @0484
		// @046D: iload #22
		// @046F: ifeq @0449
		// @0472: goto @0476
		// @0475: athrow
		// @0476: bipush -6 (0xFA)
		// @0478: getstatic int game.C_100218_am.field_103115_N
		// @047B: iconst_m1
		// @047C: ixor
		// @047D: if_icmpeq @0484
		// @0480: goto @0489
		// @0483: athrow
		// @0484: ldc 180000 (0x2bf20)
		// @0486: putstatic int game.C_100328_ia.field_107258_e
		// @0489: bipush 6 (0x06)
		// @048B: istore #6
		// @048D: bipush 6 (0x06)
		// @048F: istore #7
		// @0491: iload #4
		// @0493: sipush 8000 (0x1F40)
		// @0496: if_icmple @049D
		// @0499: goto @04A3
		// @049C: athrow
		// @049D: iinc #7 +255
		// @04A0: iinc #6 +255
		// @04A3: bipush -3 (0xFD)
		// @04A5: aload_0
		// @04A6: getfield int game.C_100171_cn.field_105572_o
		// @04A9: iconst_m1
		// @04AA: ixor
		// @04AB: if_icmpne @04C3
		// @04AE: iconst_0
		// @04AF: istore #7
		// @04B1: iconst_0
		// @04B2: istore #6
		// @04B4: aload_0
		// @04B5: getfield int[] game.C_100171_cn.field_105567_e
		// @04B8: bipush 14 (0x0E)
		// @04BA: iconst_0
		// @04BB: iastore
		// @04BC: aload_0
		// @04BD: getfield int[] game.C_100171_cn.field_105567_e
		// @04C0: iconst_0
		// @04C1: iconst_0
		// @04C2: iastore
		// @04C3: aload_0
		// @04C4: getfield int game.C_100171_cn.field_105576_k
		// @04C7: iload #4
		// @04C9: if_icmpge @065E
		// @04CC: aload_0
		// @04CD: getfield int[] game.C_100171_cn.field_105574_m
		// @04D0: astore #8
		// @04D2: aload_0
		// @04D3: getfield int[] game.C_100171_cn.field_105567_e
		// @04D6: astore #9
		// @04D8: aload_0
		// @04D9: getfield int game.C_100171_cn.field_105576_k
		// @04DC: istore #10
		// @04DE: aload_0
		// @04DF: iconst_m1
		// @04E0: aload_0
		// @04E1: getfield int game.C_100171_cn.field_105576_k
		// @04E4: iconst_2
		// @04E5: imul
		// @04E6: iadd
		// @04E7: putfield int game.C_100171_cn.field_105576_k
		// @04EA: aload_0
		// @04EB: aload_0
		// @04EC: getfield int game.C_100171_cn.field_105576_k
		// @04EF: newarray int[]
		// @04F1: putfield int[] game.C_100171_cn.field_105567_e
		// @04F4: aload_0
		// @04F5: aload_0
		// @04F6: getfield int game.C_100171_cn.field_105576_k
		// @04F9: newarray int[]
		// @04FB: putfield int[] game.C_100171_cn.field_105574_m
		// @04FE: iconst_m1
		// @04FF: iload #22
		// @0501: ifne @065F
		// @0504: iload #7
		// @0506: iconst_m1
		// @0507: ixor
		// @0508: if_icmpgt @0513
		// @050B: goto @050F
		// @050E: athrow
		// @050F: goto @0516
		// @0512: athrow
		// @0513: iinc #7 +255
		// @0516: iload #6
		// @0518: iconst_m1
		// @0519: ixor
		// @051A: iconst_m1
		// @051B: if_icmpge @0525
		// @051E: iinc #6 +255
		// @0521: goto @0525
		// @0524: athrow
		// @0525: iconst_0
		// @0526: istore #11
		// @0528: iload #11
		// @052A: iload #10
		// @052C: iconst_1
		// @052D: isub
		// @052E: if_icmpge @0635
		// @0531: aload_0
		// @0532: getfield int[] game.C_100171_cn.field_105574_m
		// @0535: iconst_2
		// @0536: iload #11
		// @0538: imul
		// @0539: aload #8
		// @053B: iload #11
		// @053D: iaload
		// @053E: iastore
		// @053F: aload_0
		// @0540: getfield int[] game.C_100171_cn.field_105567_e
		// @0543: iload #11
		// @0545: iconst_2
		// @0546: imul
		// @0547: aload #9
		// @0549: iload #11
		// @054B: iaload
		// @054C: iastore
		// @054D: iload #6
		// @054F: aload #8
		// @0551: iload #11
		// @0553: iaload
		// @0554: aload #8
		// @0556: iload #11
		// @0558: iconst_1
		// @0559: iadd
		// @055A: iaload
		// @055B: ineg
		// @055C: iadd
		// @055D: invokestatic java.lang.Math.abs(int)int
		// @0560: bipush 24 (0x18)
		// @0562: idiv
		// @0563: iadd
		// @0564: istore #6
		// @0566: iload #7
		// @0568: aload #9
		// @056A: iload #11
		// @056C: iconst_1
		// @056D: iadd
		// @056E: iaload
		// @056F: ineg
		// @0570: aload #9
		// @0572: iload #11
		// @0574: iaload
		// @0575: iadd
		// @0576: invokestatic java.lang.Math.abs(int)int
		// @0579: bipush 24 (0x18)
		// @057B: idiv
		// @057C: iadd
		// @057D: istore #7
		// @057F: aload_0
		// @0580: getfield int[] game.C_100171_cn.field_105574_m
		// @0583: iconst_1
		// @0584: iload #11
		// @0586: iconst_2
		// @0587: imul
		// @0588: iadd
		// @0589: aload #8
		// @058B: iload #11
		// @058D: iaload
		// @058E: aload #8
		// @0590: iload #11
		// @0592: iconst_m1
		// @0593: isub
		// @0594: iaload
		// @0595: ineg
		// @0596: isub
		// @0597: iconst_2
		// @0598: idiv
		// @0599: iload #22
		// @059B: ifne @0658
		// @059E: iconst_4
		// @059F: iconst_0
		// @05A0: iload #6
		// @05A2: if_icmplt @05AE
		// @05A5: goto @05A9
		// @05A8: athrow
		// @05A9: iconst_0
		// @05AA: goto @05BF
		// @05AD: athrow
		// @05AE: aload #5
		// @05B0: bipush -4 (0xFC)
		// @05B2: iconst_2
		// @05B3: iload #6
		// @05B5: imul
		// @05B6: iconst_1
		// @05B7: iadd
		// @05B8: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @05BB: iload #6
		// @05BD: ineg
		// @05BE: iadd
		// @05BF: imul
		// @05C0: iadd
		// @05C1: iastore
		// @05C2: aload_0
		// @05C3: getfield int[] game.C_100171_cn.field_105567_e
		// @05C6: iconst_1
		// @05C7: iconst_2
		// @05C8: iload #11
		// @05CA: imul
		// @05CB: iadd
		// @05CC: aload #9
		// @05CE: iload #11
		// @05D0: iconst_1
		// @05D1: iadd
		// @05D2: iaload
		// @05D3: aload #9
		// @05D5: iload #11
		// @05D7: iaload
		// @05D8: iadd
		// @05D9: iconst_2
		// @05DA: idiv
		// @05DB: iconst_4
		// @05DC: iconst_0
		// @05DD: iload #7
		// @05DF: if_icmplt @05E7
		// @05E2: iconst_0
		// @05E3: goto @05F8
		// @05E6: athrow
		// @05E7: iload #7
		// @05E9: ineg
		// @05EA: aload #5
		// @05EC: bipush -4 (0xFC)
		// @05EE: iconst_1
		// @05EF: iconst_2
		// @05F0: iload #7
		// @05F2: imul
		// @05F3: iadd
		// @05F4: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @05F7: iadd
		// @05F8: imul
		// @05F9: ineg
		// @05FA: isub
		// @05FB: iastore
		// @05FC: iload #6
		// @05FE: aload #8
		// @0600: iload #11
		// @0602: iconst_1
		// @0603: iadd
		// @0604: iaload
		// @0605: ineg
		// @0606: aload #8
		// @0608: iload #11
		// @060A: iaload
		// @060B: iadd
		// @060C: invokestatic java.lang.Math.abs(int)int
		// @060F: bipush 24 (0x18)
		// @0611: idiv
		// @0612: isub
		// @0613: istore #6
		// @0615: iload #7
		// @0617: aload #9
		// @0619: iload #11
		// @061B: iaload
		// @061C: aload #9
		// @061E: iload #11
		// @0620: iconst_1
		// @0621: iadd
		// @0622: iaload
		// @0623: isub
		// @0624: invokestatic java.lang.Math.abs(int)int
		// @0627: bipush 24 (0x18)
		// @0629: idiv
		// @062A: isub
		// @062B: istore #7
		// @062D: iinc #11 +1
		// @0630: iload #22
		// @0632: ifeq @0528
		// @0635: aload_0
		// @0636: getfield int[] game.C_100171_cn.field_105574_m
		// @0639: iconst_m1
		// @063A: aload_0
		// @063B: getfield int game.C_100171_cn.field_105576_k
		// @063E: iadd
		// @063F: aload #8
		// @0641: iload #10
		// @0643: iconst_1
		// @0644: isub
		// @0645: iaload
		// @0646: iastore
		// @0647: aload_0
		// @0648: getfield int[] game.C_100171_cn.field_105567_e
		// @064B: iconst_m1
		// @064C: aload_0
		// @064D: getfield int game.C_100171_cn.field_105576_k
		// @0650: iadd
		// @0651: aload #9
		// @0653: iconst_m1
		// @0654: iload #10
		// @0656: iadd
		// @0657: iaload
		// @0658: iastore
		// @0659: iload #22
		// @065B: ifeq @04C3
		// @065E: iconst_0
		// @065F: istore #8
		// @0661: sipush 10000 (0x2710)
		// @0664: istore #9
		// @0666: iconst_0
		// @0667: istore #10
		// @0669: iload #10
		// @066B: iconst_m1
		// @066C: ixor
		// @066D: aload_0
		// @066E: getfield int game.C_100171_cn.field_105576_k
		// @0671: iconst_m1
		// @0672: ixor
		// @0673: if_icmple @06E3
		// @0676: aload_0
		// @0677: getfield int[] game.C_100171_cn.field_105574_m
		// @067A: iload #10
		// @067C: iaload
		// @067D: iload #9
		// @067F: iload #22
		// @0681: ifne @06E5
		// @0684: if_icmpge @0694
		// @0687: goto @068B
		// @068A: athrow
		// @068B: aload_0
		// @068C: getfield int[] game.C_100171_cn.field_105574_m
		// @068F: iload #10
		// @0691: iaload
		// @0692: istore #9
		// @0694: aload_0
		// @0695: getfield int[] game.C_100171_cn.field_105574_m
		// @0698: iload #10
		// @069A: iaload
		// @069B: iconst_m1
		// @069C: ixor
		// @069D: iload #8
		// @069F: iconst_m1
		// @06A0: ixor
		// @06A1: if_icmplt @06A8
		// @06A4: goto @06B1
		// @06A7: athrow
		// @06A8: aload_0
		// @06A9: getfield int[] game.C_100171_cn.field_105574_m
		// @06AC: iload #10
		// @06AE: iaload
		// @06AF: istore #8
		// @06B1: iload #8
		// @06B3: aload_0
		// @06B4: getfield int[] game.C_100171_cn.field_105567_e
		// @06B7: iload #10
		// @06B9: iaload
		// @06BA: if_icmpge @06C6
		// @06BD: aload_0
		// @06BE: getfield int[] game.C_100171_cn.field_105567_e
		// @06C1: iload #10
		// @06C3: iaload
		// @06C4: istore #8
		// @06C6: iload #9
		// @06C8: aload_0
		// @06C9: getfield int[] game.C_100171_cn.field_105567_e
		// @06CC: iload #10
		// @06CE: iaload
		// @06CF: if_icmple @06DB
		// @06D2: aload_0
		// @06D3: getfield int[] game.C_100171_cn.field_105567_e
		// @06D6: iload #10
		// @06D8: iaload
		// @06D9: istore #9
		// @06DB: iinc #10 +1
		// @06DE: iload #22
		// @06E0: ifeq @0669
		// @06E3: iload_2
		// @06E4: iconst_m1
		// @06E5: ixor
		// @06E6: ifne @071E
		// @06E9: iconst_0
		// @06EA: istore #10
		// @06EC: iload #10
		// @06EE: aload_0
		// @06EF: getfield int game.C_100171_cn.field_105576_k
		// @06F2: if_icmpge @071E
		// @06F5: aload_0
		// @06F6: getfield int[] game.C_100171_cn.field_105574_m
		// @06F9: astore #11
		// @06FB: aload_0
		// @06FC: getfield int[] game.C_100171_cn.field_105567_e
		// @06FF: iload #10
		// @0701: iconst_0
		// @0702: iastore
		// @0703: iload #10
		// @0705: istore #12
		// @0707: aload #11
		// @0709: iload #12
		// @070B: iconst_0
		// @070C: iastore
		// @070D: iinc #10 +1
		// @0710: iload #22
		// @0712: ifne @0728
		// @0715: iload #22
		// @0717: ifeq @06EC
		// @071A: goto @071E
		// @071D: athrow
		// @071E: aload_0
		// @071F: aload_0
		// @0720: getfield int game.C_100171_cn.field_105576_k
		// @0723: newarray int[]
		// @0725: putfield int[] game.C_100171_cn.field_105575_j
		// @0728: iconst_m1
		// @0729: iload_2
		// @072A: if_icmpne @0731
		// @072D: goto @0C2F
		// @0730: athrow
		// @0731: sipush 2048 (0x0800)
		// @0734: istore #10
		// @0736: sipush 2400 (0x0960)
		// @0739: istore #11
		// @073B: aload_0
		// @073C: getfield int game.C_100171_cn.field_105572_o
		// @073F: iconst_3
		// @0740: if_icmpne @086A
		// @0743: aload_0
		// @0744: getfield int game.C_100171_cn.field_105576_k
		// @0747: iconst_2
		// @0748: idiv
		// @0749: istore #12
		// @074B: sipush 5000 (0x1388)
		// @074E: istore #13
		// @0750: iload #13
		// @0752: iconst_m1
		// @0753: ixor
		// @0754: aload_0
		// @0755: getfield int game.C_100171_cn.field_105576_k
		// @0758: iconst_4
		// @0759: idiv
		// @075A: iconst_m1
		// @075B: ixor
		// @075C: if_icmplt @0763
		// @075F: goto @0766
		// @0762: athrow
		// @0763: iconst_4
		// @0764: istore #13
		// @0766: iload #12
		// @0768: iload #13
		// @076A: isub
		// @076B: istore #14
		// @076D: iload #13
		// @076F: iload #12
		// @0771: iadd
		// @0772: iload #14
		// @0774: if_icmplt @07A1
		// @0777: aload_0
		// @0778: getfield int[] game.C_100171_cn.field_105574_m
		// @077B: iload #14
		// @077D: dup2
		// @077E: iaload
		// @077F: iconst_2
		// @0780: idiv
		// @0781: iastore
		// @0782: aload_0
		// @0783: getfield int[] game.C_100171_cn.field_105567_e
		// @0786: iload #14
		// @0788: aload_0
		// @0789: getfield int[] game.C_100171_cn.field_105574_m
		// @078C: iload #14
		// @078E: iaload
		// @078F: iastore
		// @0790: iinc #14 +1
		// @0793: iload #22
		// @0795: ifne @07A4
		// @0798: iload #22
		// @079A: ifeq @076D
		// @079D: goto @07A1
		// @07A0: athrow
		// @07A1: iconst_0
		// @07A2: istore #14
		// @07A4: iload #14
		// @07A6: sipush 1000 (0x03E8)
		// @07A9: if_icmpge @086A
		// @07AC: iload #13
		// @07AE: ineg
		// @07AF: iload #12
		// @07B1: iadd
		// @07B2: iload #14
		// @07B4: isub
		// @07B5: istore #15
		// @07B7: aload_0
		// @07B8: getfield int[] game.C_100171_cn.field_105574_m
		// @07BB: iload #15
		// @07BD: aload_0
		// @07BE: getfield int[] game.C_100171_cn.field_105574_m
		// @07C1: iload #15
		// @07C3: iaload
		// @07C4: iload #14
		// @07C6: ineg
		// @07C7: sipush 1000 (0x03E8)
		// @07CA: iadd
		// @07CB: imul
		// @07CC: iconst_2
		// @07CD: idiv
		// @07CE: iload #14
		// @07D0: aload_0
		// @07D1: getfield int[] game.C_100171_cn.field_105574_m
		// @07D4: iload #15
		// @07D6: iaload
		// @07D7: imul
		// @07D8: ineg
		// @07D9: isub
		// @07DA: sipush 1000 (0x03E8)
		// @07DD: idiv
		// @07DE: iastore
		// @07DF: aload_0
		// @07E0: getfield int[] game.C_100171_cn.field_105567_e
		// @07E3: iload #15
		// @07E5: iload #14
		// @07E7: aload_0
		// @07E8: getfield int[] game.C_100171_cn.field_105567_e
		// @07EB: iload #15
		// @07ED: iaload
		// @07EE: imul
		// @07EF: sipush 1000 (0x03E8)
		// @07F2: iload #14
		// @07F4: isub
		// @07F5: aload_0
		// @07F6: getfield int[] game.C_100171_cn.field_105574_m
		// @07F9: iload #15
		// @07FB: iaload
		// @07FC: imul
		// @07FD: iadd
		// @07FE: sipush 1000 (0x03E8)
		// @0801: idiv
		// @0802: iastore
		// @0803: iload #14
		// @0805: iload #13
		// @0807: iload #12
		// @0809: iadd
		// @080A: iadd
		// @080B: istore #15
		// @080D: aload_0
		// @080E: getfield int[] game.C_100171_cn.field_105574_m
		// @0811: iload #15
		// @0813: aload_0
		// @0814: getfield int[] game.C_100171_cn.field_105574_m
		// @0817: iload #15
		// @0819: iaload
		// @081A: sipush 1000 (0x03E8)
		// @081D: iload #14
		// @081F: ineg
		// @0820: iadd
		// @0821: imul
		// @0822: iconst_2
		// @0823: idiv
		// @0824: iload #14
		// @0826: aload_0
		// @0827: getfield int[] game.C_100171_cn.field_105574_m
		// @082A: iload #15
		// @082C: iaload
		// @082D: imul
		// @082E: ineg
		// @082F: isub
		// @0830: sipush 1000 (0x03E8)
		// @0833: idiv
		// @0834: iastore
		// @0835: aload_0
		// @0836: getfield int[] game.C_100171_cn.field_105567_e
		// @0839: iload #15
		// @083B: aload_0
		// @083C: getfield int[] game.C_100171_cn.field_105574_m
		// @083F: iload #15
		// @0841: iaload
		// @0842: sipush 1000 (0x03E8)
		// @0845: iload #14
		// @0847: isub
		// @0848: imul
		// @0849: aload_0
		// @084A: getfield int[] game.C_100171_cn.field_105567_e
		// @084D: iload #15
		// @084F: iaload
		// @0850: iload #14
		// @0852: imul
		// @0853: iadd
		// @0854: sipush 1000 (0x03E8)
		// @0857: idiv
		// @0858: iastore
		// @0859: iinc #14 +1
		// @085C: iload #22
		// @085E: ifne @086D
		// @0861: iload #22
		// @0863: ifeq @07A4
		// @0866: goto @086A
		// @0869: athrow
		// @086A: iconst_0
		// @086B: istore #12
		// @086D: aload_0
		// @086E: getfield int game.C_100171_cn.field_105576_k
		// @0871: iconst_m1
		// @0872: ixor
		// @0873: iload #12
		// @0875: iconst_m1
		// @0876: ixor
		// @0877: if_icmpge @09DB
		// @087A: aload_0
		// @087B: getfield int[] game.C_100171_cn.field_105574_m
		// @087E: iload #12
		// @0880: iload #10
		// @0882: aload_0
		// @0883: getfield int[] game.C_100171_cn.field_105574_m
		// @0886: iload #12
		// @0888: iaload
		// @0889: iload #9
		// @088B: ineg
		// @088C: iadd
		// @088D: bipush -64 (0xC0)
		// @088F: iadd
		// @0890: imul
		// @0891: iload #8
		// @0893: iload #9
		// @0895: ineg
		// @0896: iadd
		// @0897: idiv
		// @0898: iastore
		// @0899: aload_0
		// @089A: getfield int[] game.C_100171_cn.field_105567_e
		// @089D: iload #12
		// @089F: iload #9
		// @08A1: ineg
		// @08A2: aload_0
		// @08A3: getfield int[] game.C_100171_cn.field_105567_e
		// @08A6: iload #12
		// @08A8: iaload
		// @08A9: bipush -64 (0xC0)
		// @08AB: iadd
		// @08AC: iadd
		// @08AD: iload #11
		// @08AF: imul
		// @08B0: iload #8
		// @08B2: iload #9
		// @08B4: isub
		// @08B5: idiv
		// @08B6: iastore
		// @08B7: aload_0
		// @08B8: getfield int game.C_100171_cn.field_105572_o
		// @08BB: iconst_2
		// @08BC: iload #22
		// @08BE: ifne @09E3
		// @08C1: goto @08C5
		// @08C4: athrow
		// @08C5: if_icmpne @08CF
		// @08C8: goto @08CC
		// @08CB: athrow
		// @08CC: goto @09A3
		// @08CF: sipush -513 (0xFDFF)
		// @08D2: aload_0
		// @08D3: getfield int[] game.C_100171_cn.field_105574_m
		// @08D6: iload #12
		// @08D8: iaload
		// @08D9: iconst_m1
		// @08DA: ixor
		// @08DB: if_icmplt @08E2
		// @08DE: goto @08FC
		// @08E1: athrow
		// @08E2: aload_0
		// @08E3: getfield int[] game.C_100171_cn.field_105574_m
		// @08E6: iload #12
		// @08E8: aload_0
		// @08E9: getfield int[] game.C_100171_cn.field_105574_m
		// @08EC: iload #12
		// @08EE: iaload
		// @08EF: aload_0
		// @08F0: getfield int[] game.C_100171_cn.field_105574_m
		// @08F3: iload #12
		// @08F5: iaload
		// @08F6: imul
		// @08F7: sipush 512 (0x0200)
		// @08FA: idiv
		// @08FB: iastore
		// @08FC: aload_0
		// @08FD: getfield int[] game.C_100171_cn.field_105567_e
		// @0900: iload #12
		// @0902: iaload
		// @0903: iconst_m1
		// @0904: ixor
		// @0905: aload_0
		// @0906: getfield int[] game.C_100171_cn.field_105574_m
		// @0909: iload #12
		// @090B: iaload
		// @090C: iconst_m1
		// @090D: ixor
		// @090E: if_icmpgt @0915
		// @0911: goto @0923
		// @0914: athrow
		// @0915: aload_0
		// @0916: getfield int[] game.C_100171_cn.field_105567_e
		// @0919: iload #12
		// @091B: aload_0
		// @091C: getfield int[] game.C_100171_cn.field_105574_m
		// @091F: iload #12
		// @0921: iaload
		// @0922: iastore
		// @0923: aload_0
		// @0924: getfield int[] game.C_100171_cn.field_105567_e
		// @0927: iload #12
		// @0929: iaload
		// @092A: iconst_m1
		// @092B: ixor
		// @092C: aload_0
		// @092D: getfield int[] game.C_100171_cn.field_105574_m
		// @0930: iload #12
		// @0932: iaload
		// @0933: sipush -1024 (0xFC00)
		// @0936: isub
		// @0937: iconst_m1
		// @0938: ixor
		// @0939: if_icmple @094E
		// @093C: aload_0
		// @093D: getfield int[] game.C_100171_cn.field_105567_e
		// @0940: iload #12
		// @0942: aload_0
		// @0943: getfield int[] game.C_100171_cn.field_105574_m
		// @0946: iload #12
		// @0948: iaload
		// @0949: iastore
		// @094A: goto @094E
		// @094D: athrow
		// @094E: aload_0
		// @094F: getfield int[] game.C_100171_cn.field_105574_m
		// @0952: iload #12
		// @0954: iaload
		// @0955: aload_0
		// @0956: getfield int[] game.C_100171_cn.field_105567_e
		// @0959: iload #12
		// @095B: iaload
		// @095C: if_icmplt @0976
		// @095F: aload_0
		// @0960: getfield int[] game.C_100171_cn.field_105575_j
		// @0963: iload #12
		// @0965: aload_0
		// @0966: getfield int[] game.C_100171_cn.field_105574_m
		// @0969: iload #12
		// @096B: iaload
		// @096C: iastore
		// @096D: iload #22
		// @096F: ifeq @09A3
		// @0972: goto @0976
		// @0975: athrow
		// @0976: aload_0
		// @0977: getfield int[] game.C_100171_cn.field_105574_m
		// @097A: iload #12
		// @097C: iaload
		// @097D: ineg
		// @097E: aload_0
		// @097F: getfield int[] game.C_100171_cn.field_105567_e
		// @0982: iload #12
		// @0984: iaload
		// @0985: iadd
		// @0986: istore #13
		// @0988: aload_0
		// @0989: getfield int[] game.C_100171_cn.field_105575_j
		// @098C: iload #12
		// @098E: iload #13
		// @0990: sipush -1024 (0xFC00)
		// @0993: iadd
		// @0994: iconst_2
		// @0995: idiv
		// @0996: ineg
		// @0997: aload_0
		// @0998: getfield int[] game.C_100171_cn.field_105567_e
		// @099B: iload #12
		// @099D: iaload
		// @099E: iadd
		// @099F: bipush 80 (0x50)
		// @09A1: isub
		// @09A2: iastore
		// @09A3: iconst_4
		// @09A4: aload_0
		// @09A5: getfield int game.C_100171_cn.field_105572_o
		// @09A8: if_icmpne @09D3
		// @09AB: aload_0
		// @09AC: getfield int[] game.C_100171_cn.field_105574_m
		// @09AF: astore #13
		// @09B1: iload #12
		// @09B3: istore #14
		// @09B5: aload_0
		// @09B6: getfield int[] game.C_100171_cn.field_105575_j
		// @09B9: astore #15
		// @09BB: iload #12
		// @09BD: istore #16
		// @09BF: aload_0
		// @09C0: getfield int[] game.C_100171_cn.field_105567_e
		// @09C3: iload #12
		// @09C5: iconst_0
		// @09C6: iastore
		// @09C7: aload #15
		// @09C9: iload #16
		// @09CB: iconst_0
		// @09CC: iastore
		// @09CD: aload #13
		// @09CF: iload #14
		// @09D1: iconst_0
		// @09D2: iastore
		// @09D3: iinc #12 +1
		// @09D6: iload #22
		// @09D8: ifeq @086D
		// @09DB: aload_0
		// @09DC: getfield int game.C_100171_cn.field_105572_o
		// @09DF: iconst_m1
		// @09E0: ixor
		// @09E1: bipush -3 (0xFD)
		// @09E3: if_icmpeq @0B84
		// @09E6: iconst_1
		// @09E7: istore #12
		// @09E9: iload #12
		// @09EB: iconst_m1
		// @09EC: ixor
		// @09ED: iconst_m1
		// @09EE: aload_0
		// @09EF: getfield int game.C_100171_cn.field_105576_k
		// @09F2: iadd
		// @09F3: iconst_m1
		// @09F4: ixor
		// @09F5: if_icmple @0B7F
		// @09F8: aload_0
		// @09F9: getfield int[] game.C_100171_cn.field_105575_j
		// @09FC: iload #12
		// @09FE: iaload
		// @09FF: aload_0
		// @0A00: getfield int[] game.C_100171_cn.field_105567_e
		// @0A03: iload #12
		// @0A05: iaload
		// @0A06: iload #22
		// @0A08: ifne @0C4B
		// @0A0B: if_icmpge @0B77
		// @0A0E: goto @0A12
		// @0A11: athrow
		// @0A12: aload_0
		// @0A13: getfield int[] game.C_100171_cn.field_105574_m
		// @0A16: iload #12
		// @0A18: iaload
		// @0A19: ineg
		// @0A1A: aload_0
		// @0A1B: getfield int[] game.C_100171_cn.field_105567_e
		// @0A1E: iload #12
		// @0A20: iaload
		// @0A21: iadd
		// @0A22: istore #13
		// @0A24: aload_0
		// @0A25: getfield int[] game.C_100171_cn.field_105567_e
		// @0A28: iconst_m1
		// @0A29: iload #12
		// @0A2B: iadd
		// @0A2C: iaload
		// @0A2D: aload_0
		// @0A2E: getfield int[] game.C_100171_cn.field_105575_j
		// @0A31: iconst_m1
		// @0A32: iload #12
		// @0A34: iadd
		// @0A35: iaload
		// @0A36: if_icmpne @0ACC
		// @0A39: iconst_1
		// @0A3A: istore #14
		// @0A3C: iload #14
		// @0A3E: iconst_m1
		// @0A3F: ixor
		// @0A40: iload #13
		// @0A42: iconst_m1
		// @0A43: ixor
		// @0A44: if_icmple @0ACC
		// @0A47: iload #12
		// @0A49: iload #14
		// @0A4B: isub
		// @0A4C: iload #22
		// @0A4E: ifne @0AD5
		// @0A51: iflt @0ACC
		// @0A54: goto @0A58
		// @0A57: athrow
		// @0A58: iload #14
		// @0A5A: ineg
		// @0A5B: iload #13
		// @0A5D: iadd
		// @0A5E: iconst_2
		// @0A5F: imul
		// @0A60: iload #13
		// @0A62: idiv
		// @0A63: ineg
		// @0A64: aload_0
		// @0A65: getfield int[] game.C_100171_cn.field_105574_m
		// @0A68: iload #12
		// @0A6A: iload #14
		// @0A6C: isub
		// @0A6D: iaload
		// @0A6E: iload #14
		// @0A70: ineg
		// @0A71: iload #13
		// @0A73: iadd
		// @0A74: iload #14
		// @0A76: ineg
		// @0A77: iload #13
		// @0A79: iadd
		// @0A7A: imul
		// @0A7B: iload #13
		// @0A7D: idiv
		// @0A7E: ineg
		// @0A7F: isub
		// @0A80: iadd
		// @0A81: istore #15
		// @0A83: aload_0
		// @0A84: getfield int[] game.C_100171_cn.field_105575_j
		// @0A87: iload #14
		// @0A89: ineg
		// @0A8A: iload #12
		// @0A8C: iadd
		// @0A8D: iaload
		// @0A8E: iload #15
		// @0A90: if_icmpge @0AA4
		// @0A93: aload_0
		// @0A94: getfield int[] game.C_100171_cn.field_105575_j
		// @0A97: iload #14
		// @0A99: ineg
		// @0A9A: iload #12
		// @0A9C: iadd
		// @0A9D: iload #15
		// @0A9F: iastore
		// @0AA0: goto @0AA4
		// @0AA3: athrow
		// @0AA4: aload_0
		// @0AA5: getfield int[] game.C_100171_cn.field_105567_e
		// @0AA8: iload #14
		// @0AAA: ineg
		// @0AAB: iload #12
		// @0AAD: iadd
		// @0AAE: iaload
		// @0AAF: iload #15
		// @0AB1: if_icmpge @0AC4
		// @0AB4: aload_0
		// @0AB5: getfield int[] game.C_100171_cn.field_105567_e
		// @0AB8: iload #12
		// @0ABA: iload #14
		// @0ABC: isub
		// @0ABD: iload #15
		// @0ABF: iastore
		// @0AC0: goto @0AC4
		// @0AC3: athrow
		// @0AC4: iinc #14 +1
		// @0AC7: iload #22
		// @0AC9: ifeq @0A3C
		// @0ACC: aload_0
		// @0ACD: getfield int[] game.C_100171_cn.field_105567_e
		// @0AD0: iconst_1
		// @0AD1: iload #12
		// @0AD3: iadd
		// @0AD4: iaload
		// @0AD5: aload_0
		// @0AD6: getfield int[] game.C_100171_cn.field_105575_j
		// @0AD9: iload #12
		// @0ADB: iconst_m1
		// @0ADC: isub
		// @0ADD: iaload
		// @0ADE: if_icmpeq @0AE5
		// @0AE1: goto @0B77
		// @0AE4: athrow
		// @0AE5: iconst_1
		// @0AE6: istore #14
		// @0AE8: iload #13
		// @0AEA: iload #14
		// @0AEC: if_icmple @0B77
		// @0AEF: iload #14
		// @0AF1: iload #12
		// @0AF3: iadd
		// @0AF4: aload_0
		// @0AF5: getfield int game.C_100171_cn.field_105576_k
		// @0AF8: iload #22
		// @0AFA: ifne @09F5
		// @0AFD: if_icmpge @0B77
		// @0B00: aload_0
		// @0B01: getfield int[] game.C_100171_cn.field_105574_m
		// @0B04: iload #14
		// @0B06: iload #12
		// @0B08: iadd
		// @0B09: iaload
		// @0B0A: iload #14
		// @0B0C: ineg
		// @0B0D: iload #13
		// @0B0F: iadd
		// @0B10: iload #13
		// @0B12: iload #14
		// @0B14: ineg
		// @0B15: iadd
		// @0B16: imul
		// @0B17: iload #13
		// @0B19: idiv
		// @0B1A: iload #13
		// @0B1C: iload #14
		// @0B1E: ineg
		// @0B1F: iadd
		// @0B20: iconst_2
		// @0B21: imul
		// @0B22: iload #13
		// @0B24: idiv
		// @0B25: isub
		// @0B26: iadd
		// @0B27: istore #15
		// @0B29: iload #15
		// @0B2B: iconst_m1
		// @0B2C: ixor
		// @0B2D: aload_0
		// @0B2E: getfield int[] game.C_100171_cn.field_105575_j
		// @0B31: iload #14
		// @0B33: iload #12
		// @0B35: iadd
		// @0B36: iaload
		// @0B37: iconst_m1
		// @0B38: ixor
		// @0B39: if_icmplt @0B40
		// @0B3C: goto @0B4C
		// @0B3F: athrow
		// @0B40: aload_0
		// @0B41: getfield int[] game.C_100171_cn.field_105575_j
		// @0B44: iload #14
		// @0B46: iload #12
		// @0B48: iadd
		// @0B49: iload #15
		// @0B4B: iastore
		// @0B4C: iload #15
		// @0B4E: iconst_m1
		// @0B4F: ixor
		// @0B50: aload_0
		// @0B51: getfield int[] game.C_100171_cn.field_105567_e
		// @0B54: iload #14
		// @0B56: iload #12
		// @0B58: iadd
		// @0B59: iaload
		// @0B5A: iconst_m1
		// @0B5B: ixor
		// @0B5C: if_icmplt @0B63
		// @0B5F: goto @0B6F
		// @0B62: athrow
		// @0B63: aload_0
		// @0B64: getfield int[] game.C_100171_cn.field_105567_e
		// @0B67: iload #12
		// @0B69: iload #14
		// @0B6B: iadd
		// @0B6C: iload #15
		// @0B6E: iastore
		// @0B6F: iinc #14 +1
		// @0B72: iload #22
		// @0B74: ifeq @0AE8
		// @0B77: iinc #12 +1
		// @0B7A: iload #22
		// @0B7C: ifeq @09E9
		// @0B7F: iload #22
		// @0B81: ifeq @0C2F
		// @0B84: iconst_1
		// @0B85: istore #12
		// @0B87: iconst_m1
		// @0B88: aload_0
		// @0B89: getfield int game.C_100171_cn.field_105576_k
		// @0B8C: iadd
		// @0B8D: iload #12
		// @0B8F: if_icmple @0C2F
		// @0B92: aload_0
		// @0B93: getfield int[] game.C_100171_cn.field_105574_m
		// @0B96: iload #12
		// @0B98: iaload
		// @0B99: aload_0
		// @0B9A: getfield int[] game.C_100171_cn.field_105567_e
		// @0B9D: iload #12
		// @0B9F: iaload
		// @0BA0: iload #22
		// @0BA2: ifne @0C4B
		// @0BA5: if_icmple @0BBE
		// @0BA8: goto @0BAC
		// @0BAB: athrow
		// @0BAC: aload_0
		// @0BAD: getfield int[] game.C_100171_cn.field_105574_m
		// @0BB0: iload #12
		// @0BB2: aload_0
		// @0BB3: getfield int[] game.C_100171_cn.field_105567_e
		// @0BB6: iload #12
		// @0BB8: iaload
		// @0BB9: iastore
		// @0BBA: goto @0BBE
		// @0BBD: athrow
		// @0BBE: aload_0
		// @0BBF: getfield int[] game.C_100171_cn.field_105574_m
		// @0BC2: iload #12
		// @0BC4: iaload
		// @0BC5: sipush 1000 (0x03E8)
		// @0BC8: if_icmpge @0BE5
		// @0BCB: aload_0
		// @0BCC: getfield int[] game.C_100171_cn.field_105574_m
		// @0BCF: iload #12
		// @0BD1: aload_0
		// @0BD2: getfield int[] game.C_100171_cn.field_105574_m
		// @0BD5: iload #12
		// @0BD7: iaload
		// @0BD8: sipush 1000 (0x03E8)
		// @0BDB: isub
		// @0BDC: sipush 1000 (0x03E8)
		// @0BDF: iadd
		// @0BE0: iastore
		// @0BE1: goto @0BE5
		// @0BE4: athrow
		// @0BE5: sipush -1001 (0xFC17)
		// @0BE8: aload_0
		// @0BE9: getfield int[] game.C_100171_cn.field_105574_m
		// @0BEC: iload #12
		// @0BEE: iaload
		// @0BEF: iconst_m1
		// @0BF0: ixor
		// @0BF1: if_icmpgt @0BF8
		// @0BF4: goto @0C11
		// @0BF7: athrow
		// @0BF8: aload_0
		// @0BF9: getfield int[] game.C_100171_cn.field_105574_m
		// @0BFC: iload #12
		// @0BFE: sipush 1000 (0x03E8)
		// @0C01: aload_0
		// @0C02: getfield int[] game.C_100171_cn.field_105574_m
		// @0C05: iload #12
		// @0C07: iaload
		// @0C08: sipush 1000 (0x03E8)
		// @0C0B: isub
		// @0C0C: iconst_5
		// @0C0D: idiv
		// @0C0E: ineg
		// @0C0F: isub
		// @0C10: iastore
		// @0C11: aload_0
		// @0C12: getfield int[] game.C_100171_cn.field_105575_j
		// @0C15: iload #12
		// @0C17: aload_0
		// @0C18: getfield int[] game.C_100171_cn.field_105567_e
		// @0C1B: iload #12
		// @0C1D: aload_0
		// @0C1E: getfield int[] game.C_100171_cn.field_105574_m
		// @0C21: iload #12
		// @0C23: iaload
		// @0C24: dup_x2
		// @0C25: iastore
		// @0C26: iastore
		// @0C27: iinc #12 +1
		// @0C2A: iload #22
		// @0C2C: ifeq @0B87
		// @0C2F: aload_0
		// @0C30: aload_0
		// @0C31: getfield int game.C_100171_cn.field_105565_g
		// @0C34: newarray int[]
		// @0C36: putfield int[] game.C_100171_cn.field_105577_h
		// @0C39: aload_0
		// @0C3A: aload_0
		// @0C3B: getfield int game.C_100171_cn.field_105565_g
		// @0C3E: newarray int[]
		// @0C40: putfield int[] game.C_100171_cn.field_105578_i
		// @0C43: bipush -5 (0xFB)
		// @0C45: aload_0
		// @0C46: getfield int game.C_100171_cn.field_105572_o
		// @0C49: iconst_m1
		// @0C4A: ixor
		// @0C4B: if_icmpeq @0C51
		// @0C4E: goto @1238
		// @0C51: iconst_0
		// @0C52: istore #10
		// @0C54: iload #10
		// @0C56: iconst_2
		// @0C57: if_icmpge @0F1F
		// @0C5A: sipush 6000 (0x1770)
		// @0C5D: istore #11
		// @0C5F: sipush 1200 (0x04B0)
		// @0C62: istore #12
		// @0C64: aload_0
		// @0C65: getfield int game.C_100171_cn.field_105576_k
		// @0C68: bipush 6 (0x06)
		// @0C6A: idiv
		// @0C6B: istore #13
		// @0C6D: iload #10
		// @0C6F: iconst_m1
		// @0C70: ixor
		// @0C71: iconst_m1
		// @0C72: iload #22
		// @0C74: ifne @0F28
		// @0C77: if_icmpeq @0C81
		// @0C7A: goto @0C7E
		// @0C7D: athrow
		// @0C7E: goto @0C8A
		// @0C81: aload_0
		// @0C82: getfield int game.C_100171_cn.field_105576_k
		// @0C85: iload #13
		// @0C87: isub
		// @0C88: istore #13
		// @0C8A: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @0C8D: iconst_4
		// @0C8E: aaload
		// @0C8F: iconst_0
		// @0C90: aaload
		// @0C91: getfield int game.C_100037_wb.field_102341_y
		// @0C94: istore #14
		// @0C96: aload_0
		// @0C97: getfield int[] game.C_100171_cn.field_105580_p
		// @0C9A: aload_0
		// @0C9B: getfield int game.C_100171_cn.field_105569_c
		// @0C9E: iload #13
		// @0CA0: iastore
		// @0CA1: aload_0
		// @0CA2: getfield int[] game.C_100171_cn.field_105578_i
		// @0CA5: aload_0
		// @0CA6: getfield int game.C_100171_cn.field_105569_c
		// @0CA9: iconst_m1
		// @0CAA: iastore
		// @0CAB: bipush 16 (0x10)
		// @0CAD: iload #14
		// @0CAF: imul
		// @0CB0: istore #12
		// @0CB2: iload #13
		// @0CB4: iload #12
		// @0CB6: iconst_2
		// @0CB7: idiv
		// @0CB8: isub
		// @0CB9: istore #13
		// @0CBB: aload_0
		// @0CBC: getfield int[] game.C_100171_cn.field_105577_h
		// @0CBF: aload_0
		// @0CC0: getfield int game.C_100171_cn.field_105569_c
		// @0CC3: iload #11
		// @0CC5: iastore
		// @0CC6: iload #13
		// @0CC8: istore #15
		// @0CCA: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @0CCD: iconst_4
		// @0CCE: aaload
		// @0CCF: iconst_0
		// @0CD0: aaload
		// @0CD1: astore #16
		// @0CD3: aload #16
		// @0CD5: getfield int game.C_100037_wb.field_102339_s
		// @0CD8: ldc -1915492732 (0x8dd3e684)
		// @0CDA: ishl
		// @0CDB: istore #12
		// @0CDD: iload #10
		// @0CDF: ifne @0CF4
		// @0CE2: iload #13
		// @0CE4: aload #16
		// @0CE6: getfield int game.C_100037_wb.field_102335_w
		// @0CE9: ldc -1779842268 (0x95e9c324)
		// @0CEB: ishl
		// @0CEC: iadd
		// @0CED: istore #13
		// @0CEF: iload #22
		// @0CF1: ifeq @0D0F
		// @0CF4: iload #13
		// @0CF6: aload #16
		// @0CF8: getfield int game.C_100037_wb.field_102335_w
		// @0CFB: ineg
		// @0CFC: aload #16
		// @0CFE: getfield int game.C_100037_wb.field_102339_s
		// @0D01: ineg
		// @0D02: iadd
		// @0D03: aload #16
		// @0D05: getfield int game.C_100037_wb.field_102341_y
		// @0D08: iadd
		// @0D09: ldc 1535297124 (0x5b82c664)
		// @0D0B: ishl
		// @0D0C: iadd
		// @0D0D: istore #13
		// @0D0F: bipush -2 (0xFE)
		// @0D11: iload #10
		// @0D13: iconst_m1
		// @0D14: ixor
		// @0D15: if_icmpeq @0D1C
		// @0D18: goto @0D23
		// @0D1B: athrow
		// @0D1C: iload #13
		// @0D1E: iload #12
		// @0D20: iadd
		// @0D21: istore #13
		// @0D23: iconst_0
		// @0D24: istore #17
		// @0D26: iload #12
		// @0D28: iconst_m1
		// @0D29: ixor
		// @0D2A: iload #17
		// @0D2C: iconst_m1
		// @0D2D: ixor
		// @0D2E: if_icmpge @0DEE
		// @0D31: iload #17
		// @0D33: ldc 830205956 (0x317bf004)
		// @0D35: ishr
		// @0D36: istore #18
		// @0D38: iconst_0
		// @0D39: iload #22
		// @0D3B: ifne @0E07
		// @0D3E: istore #19
		// @0D40: iload #19
		// @0D42: iconst_m1
		// @0D43: ixor
		// @0D44: aload #16
		// @0D46: getfield int game.C_100037_wb.field_102337_u
		// @0D49: iconst_m1
		// @0D4A: ixor
		// @0D4B: if_icmple @0D94
		// @0D4E: aload #16
		// @0D50: getfield int[] game.C_100037_wb.field_102388_J
		// @0D53: arraylength
		// @0D54: iconst_m1
		// @0D55: ixor
		// @0D56: iload #18
		// @0D58: iload #19
		// @0D5A: iload #12
		// @0D5C: ldc -1534000380 (0xa4910304)
		// @0D5E: ishr
		// @0D5F: imul
		// @0D60: ineg
		// @0D61: isub
		// @0D62: iconst_m1
		// @0D63: ixor
		// @0D64: iload #22
		// @0D66: ifne @0D9B
		// @0D69: if_icmpge @0D94
		// @0D6C: goto @0D70
		// @0D6F: athrow
		// @0D70: aload #16
		// @0D72: getfield int[] game.C_100037_wb.field_102388_J
		// @0D75: iload #18
		// @0D77: iload #19
		// @0D79: iload #12
		// @0D7B: ldc -2113728060 (0x820311c4)
		// @0D7D: ishr
		// @0D7E: imul
		// @0D7F: iadd
		// @0D80: iaload
		// @0D81: ifne @0D94
		// @0D84: goto @0D88
		// @0D87: athrow
		// @0D88: iinc #19 +1
		// @0D8B: iload #22
		// @0D8D: ifeq @0D40
		// @0D90: goto @0D94
		// @0D93: athrow
		// @0D94: iload #19
		// @0D96: aload #16
		// @0D98: getfield int game.C_100037_wb.field_102337_u
		// @0D9B: if_icmplt @0DA1
		// @0D9E: goto @0DCD
		// @0DA1: aload_0
		// @0DA2: getfield int[] game.C_100171_cn.field_105574_m
		// @0DA5: iload #13
		// @0DA7: iload #11
		// @0DA9: aload #16
		// @0DAB: getfield int game.C_100037_wb.field_102332_H
		// @0DAE: iload #19
		// @0DB0: iadd
		// @0DB1: ineg
		// @0DB2: bipush 16 (0x10)
		// @0DB4: imul
		// @0DB5: iadd
		// @0DB6: iastore
		// @0DB7: aload_0
		// @0DB8: getfield int[] game.C_100171_cn.field_105575_j
		// @0DBB: iload #13
		// @0DBD: aload_0
		// @0DBE: getfield int[] game.C_100171_cn.field_105567_e
		// @0DC1: iload #13
		// @0DC3: aload_0
		// @0DC4: getfield int[] game.C_100171_cn.field_105574_m
		// @0DC7: iload #13
		// @0DC9: iaload
		// @0DCA: dup_x2
		// @0DCB: iastore
		// @0DCC: iastore
		// @0DCD: iconst_0
		// @0DCE: iload #10
		// @0DD0: if_icmpne @0DDF
		// @0DD3: iinc #13 +1
		// @0DD6: iload #22
		// @0DD8: ifeq @0DE6
		// @0DDB: goto @0DDF
		// @0DDE: athrow
		// @0DDF: iinc #13 +255
		// @0DE2: goto @0DE6
		// @0DE5: athrow
		// @0DE6: iinc #17 +1
		// @0DE9: iload #22
		// @0DEB: ifeq @0D26
		// @0DEE: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @0DF1: iconst_4
		// @0DF2: aaload
		// @0DF3: iconst_1
		// @0DF4: aaload
		// @0DF5: astore #16
		// @0DF7: iload #15
		// @0DF9: istore #13
		// @0DFB: aload #16
		// @0DFD: getfield int game.C_100037_wb.field_102339_s
		// @0E00: ldc -300579900 (0xee1583c4)
		// @0E02: ishl
		// @0E03: istore #12
		// @0E05: iload #10
		// @0E07: ifeq @0E2A
		// @0E0A: iload #13
		// @0E0C: aload #16
		// @0E0E: getfield int game.C_100037_wb.field_102335_w
		// @0E11: ineg
		// @0E12: aload #16
		// @0E14: getfield int game.C_100037_wb.field_102339_s
		// @0E17: ineg
		// @0E18: aload #16
		// @0E1A: getfield int game.C_100037_wb.field_102341_y
		// @0E1D: iadd
		// @0E1E: iadd
		// @0E1F: ldc -2048806524 (0x85e1b184)
		// @0E21: ishl
		// @0E22: iadd
		// @0E23: istore #13
		// @0E25: iload #22
		// @0E27: ifeq @0E37
		// @0E2A: iload #13
		// @0E2C: aload #16
		// @0E2E: getfield int game.C_100037_wb.field_102335_w
		// @0E31: ldc 56857092 (0x3639204)
		// @0E33: ishl
		// @0E34: iadd
		// @0E35: istore #13
		// @0E37: iload #10
		// @0E39: iconst_m1
		// @0E3A: ixor
		// @0E3B: bipush -2 (0xFE)
		// @0E3D: if_icmpeq @0E44
		// @0E40: goto @0E4B
		// @0E43: athrow
		// @0E44: iload #13
		// @0E46: iload #12
		// @0E48: iadd
		// @0E49: istore #13
		// @0E4B: iconst_0
		// @0E4C: istore #17
		// @0E4E: iload #12
		// @0E50: iload #17
		// @0E52: if_icmple @0F0D
		// @0E55: iload #17
		// @0E57: ldc -501381884 (0xe21d8504)
		// @0E59: ishr
		// @0E5A: istore #18
		// @0E5C: iconst_0
		// @0E5D: iload #22
		// @0E5F: ifne @0C56
		// @0E62: istore #19
		// @0E64: aload #16
		// @0E66: getfield int game.C_100037_wb.field_102337_u
		// @0E69: iload #19
		// @0E6B: if_icmple @0EB2
		// @0E6E: aload #16
		// @0E70: getfield int[] game.C_100037_wb.field_102388_J
		// @0E73: arraylength
		// @0E74: iload #19
		// @0E76: iload #12
		// @0E78: ldc 89642468 (0x557d5e4)
		// @0E7A: ishr
		// @0E7B: imul
		// @0E7C: iload #18
		// @0E7E: iadd
		// @0E7F: iload #22
		// @0E81: ifne @0EBD
		// @0E84: if_icmple @0EB2
		// @0E87: goto @0E8B
		// @0E8A: athrow
		// @0E8B: aload #16
		// @0E8D: getfield int[] game.C_100037_wb.field_102388_J
		// @0E90: iload #18
		// @0E92: iload #12
		// @0E94: ldc 420254724 (0x190c9404)
		// @0E96: ishr
		// @0E97: iload #19
		// @0E99: imul
		// @0E9A: iadd
		// @0E9B: iaload
		// @0E9C: iconst_m1
		// @0E9D: ixor
		// @0E9E: iconst_m1
		// @0E9F: if_icmpne @0EB2
		// @0EA2: goto @0EA6
		// @0EA5: athrow
		// @0EA6: iinc #19 +1
		// @0EA9: iload #22
		// @0EAB: ifeq @0E64
		// @0EAE: goto @0EB2
		// @0EB1: athrow
		// @0EB2: iload #19
		// @0EB4: iconst_m1
		// @0EB5: ixor
		// @0EB6: aload #16
		// @0EB8: getfield int game.C_100037_wb.field_102337_u
		// @0EBB: iconst_m1
		// @0EBC: ixor
		// @0EBD: if_icmpgt @0EC3
		// @0EC0: goto @0EEA
		// @0EC3: aload_0
		// @0EC4: getfield int[] game.C_100171_cn.field_105567_e
		// @0EC7: iload #13
		// @0EC9: iload #11
		// @0ECB: bipush 16 (0x10)
		// @0ECD: aload #16
		// @0ECF: getfield int game.C_100037_wb.field_102332_H
		// @0ED2: iload #19
		// @0ED4: iadd
		// @0ED5: ineg
		// @0ED6: imul
		// @0ED7: ineg
		// @0ED8: isub
		// @0ED9: iastore
		// @0EDA: aload_0
		// @0EDB: getfield int[] game.C_100171_cn.field_105575_j
		// @0EDE: iload #13
		// @0EE0: aload_0
		// @0EE1: getfield int[] game.C_100171_cn.field_105567_e
		// @0EE4: iload #13
		// @0EE6: iaload
		// @0EE7: iconst_1
		// @0EE8: isub
		// @0EE9: iastore
		// @0EEA: iload #10
		// @0EEC: iconst_m1
		// @0EED: ixor
		// @0EEE: iconst_m1
		// @0EEF: if_icmpeq @0EFE
		// @0EF2: iinc #13 +255
		// @0EF5: iload #22
		// @0EF7: ifeq @0F05
		// @0EFA: goto @0EFE
		// @0EFD: athrow
		// @0EFE: iinc #13 +1
		// @0F01: goto @0F05
		// @0F04: athrow
		// @0F05: iinc #17 +1
		// @0F08: iload #22
		// @0F0A: ifeq @0E4E
		// @0F0D: aload_0
		// @0F0E: dup
		// @0F0F: getfield int game.C_100171_cn.field_105569_c
		// @0F12: iconst_1
		// @0F13: iadd
		// @0F14: putfield int game.C_100171_cn.field_105569_c
		// @0F17: iinc #10 +1
		// @0F1A: iload #22
		// @0F1C: ifeq @0C54
		// @0F1F: iconst_0
		// @0F20: istore #10
		// @0F22: bipush -12 (0xF4)
		// @0F24: iload #10
		// @0F26: iconst_m1
		// @0F27: ixor
		// @0F28: if_icmpge @10DF
		// @0F2B: aload #5
		// @0F2D: bipush -4 (0xFC)
		// @0F2F: sipush 6000 (0x1770)
		// @0F32: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @0F35: ineg
		// @0F36: sipush 8000 (0x1F40)
		// @0F39: iadd
		// @0F3A: istore #11
		// @0F3C: sipush 1200 (0x04B0)
		// @0F3F: istore #12
		// @0F41: sipush 2150 (0x0866)
		// @0F44: iload #10
		// @0F46: imul
		// @0F47: sipush -10750 (0xD602)
		// @0F4A: aload_0
		// @0F4B: getfield int game.C_100171_cn.field_105576_k
		// @0F4E: iconst_2
		// @0F4F: idiv
		// @0F50: iadd
		// @0F51: iadd
		// @0F52: istore #13
		// @0F54: aload #5
		// @0F56: bipush -4 (0xFC)
		// @0F58: iconst_5
		// @0F59: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @0F5C: iconst_m1
		// @0F5D: isub
		// @0F5E: istore #14
		// @0F60: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @0F63: iconst_1
		// @0F64: aaload
		// @0F65: iload #14
		// @0F67: aaload
		// @0F68: getfield int game.C_100037_wb.field_102341_y
		// @0F6B: istore #15
		// @0F6D: aload_0
		// @0F6E: getfield int[] game.C_100171_cn.field_105580_p
		// @0F71: aload_0
		// @0F72: getfield int game.C_100171_cn.field_105569_c
		// @0F75: iload #13
		// @0F77: iastore
		// @0F78: iload #15
		// @0F7A: bipush 16 (0x10)
		// @0F7C: imul
		// @0F7D: istore #12
		// @0F7F: aload_0
		// @0F80: getfield int[] game.C_100171_cn.field_105578_i
		// @0F83: aload_0
		// @0F84: getfield int game.C_100171_cn.field_105569_c
		// @0F87: iload #14
		// @0F89: iastore
		// @0F8A: iload #13
		// @0F8C: iload #12
		// @0F8E: bipush 8 (0x08)
		// @0F90: idiv
		// @0F91: isub
		// @0F92: istore #13
		// @0F94: aload_0
		// @0F95: getfield int[] game.C_100171_cn.field_105577_h
		// @0F98: aload_0
		// @0F99: getfield int game.C_100171_cn.field_105569_c
		// @0F9C: iload #11
		// @0F9E: iastore
		// @0F9F: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @0FA2: iconst_1
		// @0FA3: aaload
		// @0FA4: iload #14
		// @0FA6: aaload
		// @0FA7: astore #16
		// @0FA9: iconst_2
		// @0FAA: istore #17
		// @0FAC: aload #16
		// @0FAE: getfield int game.C_100037_wb.field_102339_s
		// @0FB1: iload #17
		// @0FB3: ishl
		// @0FB4: istore #12
		// @0FB6: iload #13
		// @0FB8: aload #16
		// @0FBA: getfield int game.C_100037_wb.field_102335_w
		// @0FBD: iload #17
		// @0FBF: ishl
		// @0FC0: iadd
		// @0FC1: istore #13
		// @0FC3: iconst_0
		// @0FC4: iload #22
		// @0FC6: ifne @10E0
		// @0FC9: istore #18
		// @0FCB: iload #12
		// @0FCD: iload #18
		// @0FCF: if_icmple @10CD
		// @0FD2: iload #18
		// @0FD4: iload #17
		// @0FD6: ishr
		// @0FD7: istore #19
		// @0FD9: iconst_0
		// @0FDA: iload #22
		// @0FDC: ifne @0F24
		// @0FDF: istore #20
		// @0FE1: iload #20
		// @0FE3: iconst_m1
		// @0FE4: ixor
		// @0FE5: aload #16
		// @0FE7: getfield int game.C_100037_wb.field_102337_u
		// @0FEA: iconst_m1
		// @0FEB: ixor
		// @0FEC: if_icmple @1030
		// @0FEF: aload #16
		// @0FF1: getfield int[] game.C_100037_wb.field_102388_J
		// @0FF4: arraylength
		// @0FF5: iload #19
		// @0FF7: iload #20
		// @0FF9: iload #12
		// @0FFB: iload #17
		// @0FFD: ishr
		// @0FFE: imul
		// @0FFF: iadd
		// @1000: iload #22
		// @1002: ifne @0FCF
		// @1005: if_icmple @1030
		// @1008: iconst_0
		// @1009: aload #16
		// @100B: getfield int[] game.C_100037_wb.field_102388_J
		// @100E: iload #19
		// @1010: iload #20
		// @1012: iload #12
		// @1014: iload #17
		// @1016: ishr
		// @1017: imul
		// @1018: iadd
		// @1019: iaload
		// @101A: ldc -16777216 (0xff000000)
		// @101C: iand
		// @101D: if_icmpne @1030
		// @1020: goto @1024
		// @1023: athrow
		// @1024: iinc #20 +1
		// @1027: iload #22
		// @1029: ifeq @0FE1
		// @102C: goto @1030
		// @102F: athrow
		// @1030: iload #20
		// @1032: istore #21
		// @1034: iload #21
		// @1036: aload #16
		// @1038: getfield int game.C_100037_wb.field_102337_u
		// @103B: if_icmpge @1087
		// @103E: aload #16
		// @1040: getfield int[] game.C_100037_wb.field_102388_J
		// @1043: arraylength
		// @1044: iconst_m1
		// @1045: ixor
		// @1046: iload #19
		// @1048: iload #21
		// @104A: iload #12
		// @104C: iload #17
		// @104E: ishr
		// @104F: imul
		// @1050: iadd
		// @1051: iconst_m1
		// @1052: ixor
		// @1053: iload #22
		// @1055: ifne @108E
		// @1058: if_icmpge @1087
		// @105B: goto @105F
		// @105E: athrow
		// @105F: iconst_0
		// @1060: ldc -16777216 (0xff000000)
		// @1062: aload #16
		// @1064: getfield int[] game.C_100037_wb.field_102388_J
		// @1067: iload #12
		// @1069: iload #17
		// @106B: ishr
		// @106C: iload #21
		// @106E: imul
		// @106F: iload #19
		// @1071: iadd
		// @1072: iaload
		// @1073: iand
		// @1074: if_icmpeq @1087
		// @1077: goto @107B
		// @107A: athrow
		// @107B: iinc #21 +1
		// @107E: iload #22
		// @1080: ifeq @1034
		// @1083: goto @1087
		// @1086: athrow
		// @1087: aload #16
		// @1089: getfield int game.C_100037_wb.field_102337_u
		// @108C: iload #20
		// @108E: if_icmple @10C2
		// @1091: aload_0
		// @1092: getfield int[] game.C_100171_cn.field_105567_e
		// @1095: iload #13
		// @1097: iload #11
		// @1099: aload #16
		// @109B: getfield int game.C_100037_wb.field_102332_H
		// @109E: iload #20
		// @10A0: iadd
		// @10A1: ineg
		// @10A2: iload #17
		// @10A4: ishl
		// @10A5: ineg
		// @10A6: isub
		// @10A7: iastore
		// @10A8: aload_0
		// @10A9: getfield int[] game.C_100171_cn.field_105575_j
		// @10AC: iload #13
		// @10AE: iload #11
		// @10B0: aload #16
		// @10B2: getfield int game.C_100037_wb.field_102332_H
		// @10B5: iload #21
		// @10B7: iadd
		// @10B8: ineg
		// @10B9: iload #17
		// @10BB: ishl
		// @10BC: iadd
		// @10BD: iastore
		// @10BE: goto @10C2
		// @10C1: athrow
		// @10C2: iinc #13 +1
		// @10C5: iinc #18 +1
		// @10C8: iload #22
		// @10CA: ifeq @0FCB
		// @10CD: aload_0
		// @10CE: dup
		// @10CF: getfield int game.C_100171_cn.field_105569_c
		// @10D2: iconst_1
		// @10D3: iadd
		// @10D4: putfield int game.C_100171_cn.field_105569_c
		// @10D7: iinc #10 +1
		// @10DA: iload #22
		// @10DC: ifeq @0F22
		// @10DF: iconst_1
		// @10E0: istore #10
		// @10E2: iload #10
		// @10E4: aload_0
		// @10E5: getfield int game.C_100171_cn.field_105576_k
		// @10E8: iconst_m1
		// @10E9: iadd
		// @10EA: if_icmpge @1238
		// @10ED: aload_0
		// @10EE: getfield int[] game.C_100171_cn.field_105567_e
		// @10F1: iload #10
		// @10F3: iaload
		// @10F4: iconst_m1
		// @10F5: ixor
		// @10F6: aload_0
		// @10F7: getfield int[] game.C_100171_cn.field_105575_j
		// @10FA: iload #10
		// @10FC: iaload
		// @10FD: iconst_m1
		// @10FE: ixor
		// @10FF: iload #22
		// @1101: ifne @123F
		// @1104: if_icmpge @1230
		// @1107: goto @110B
		// @110A: athrow
		// @110B: sipush 200 (0x00C8)
		// @110E: istore #11
		// @1110: aload_0
		// @1111: getfield int[] game.C_100171_cn.field_105567_e
		// @1114: iload #10
		// @1116: iaload
		// @1117: istore #12
		// @1119: aload_0
		// @111A: getfield int[] game.C_100171_cn.field_105567_e
		// @111D: iconst_m1
		// @111E: iload #10
		// @1120: iadd
		// @1121: iaload
		// @1122: iconst_m1
		// @1123: ixor
		// @1124: aload_0
		// @1125: getfield int[] game.C_100171_cn.field_105575_j
		// @1128: iconst_m1
		// @1129: iload #10
		// @112B: iadd
		// @112C: iaload
		// @112D: iconst_m1
		// @112E: ixor
		// @112F: if_icmpne @11A2
		// @1132: iconst_1
		// @1133: istore #13
		// @1135: iload #13
		// @1137: iconst_m1
		// @1138: ixor
		// @1139: iload #11
		// @113B: iconst_m1
		// @113C: ixor
		// @113D: if_icmple @11A2
		// @1140: iconst_m1
		// @1141: iload #10
		// @1143: iload #13
		// @1145: isub
		// @1146: iconst_m1
		// @1147: ixor
		// @1148: iload #22
		// @114A: ifne @11B8
		// @114D: if_icmplt @11A2
		// @1150: goto @1154
		// @1153: athrow
		// @1154: aload_0
		// @1155: getfield int[] game.C_100171_cn.field_105575_j
		// @1158: iload #10
		// @115A: iload #13
		// @115C: ineg
		// @115D: iadd
		// @115E: iaload
		// @115F: iload #12
		// @1161: if_icmpge @1179
		// @1164: goto @1168
		// @1167: athrow
		// @1168: aload_0
		// @1169: getfield int[] game.C_100171_cn.field_105575_j
		// @116C: iload #13
		// @116E: ineg
		// @116F: iload #10
		// @1171: iadd
		// @1172: iload #12
		// @1174: iastore
		// @1175: goto @1179
		// @1178: athrow
		// @1179: aload_0
		// @117A: getfield int[] game.C_100171_cn.field_105567_e
		// @117D: iload #13
		// @117F: ineg
		// @1180: iload #10
		// @1182: iadd
		// @1183: iaload
		// @1184: iload #12
		// @1186: if_icmpge @119A
		// @1189: aload_0
		// @118A: getfield int[] game.C_100171_cn.field_105567_e
		// @118D: iload #10
		// @118F: iload #13
		// @1191: ineg
		// @1192: iadd
		// @1193: iload #12
		// @1195: iastore
		// @1196: goto @119A
		// @1199: athrow
		// @119A: iinc #13 +1
		// @119D: iload #22
		// @119F: ifeq @1135
		// @11A2: aload_0
		// @11A3: getfield int[] game.C_100171_cn.field_105575_j
		// @11A6: iconst_1
		// @11A7: iload #10
		// @11A9: iadd
		// @11AA: iaload
		// @11AB: iconst_m1
		// @11AC: ixor
		// @11AD: aload_0
		// @11AE: getfield int[] game.C_100171_cn.field_105567_e
		// @11B1: iload #10
		// @11B3: iconst_1
		// @11B4: iadd
		// @11B5: iaload
		// @11B6: iconst_m1
		// @11B7: ixor
		// @11B8: if_icmpeq @11BE
		// @11BB: goto @1230
		// @11BE: iconst_1
		// @11BF: istore #13
		// @11C1: iload #13
		// @11C3: iconst_m1
		// @11C4: ixor
		// @11C5: iload #11
		// @11C7: iconst_m1
		// @11C8: ixor
		// @11C9: if_icmple @1230
		// @11CC: aload_0
		// @11CD: getfield int game.C_100171_cn.field_105576_k
		// @11D0: iconst_m1
		// @11D1: ixor
		// @11D2: iload #10
		// @11D4: iload #13
		// @11D6: ineg
		// @11D7: isub
		// @11D8: iconst_m1
		// @11D9: ixor
		// @11DA: iload #22
		// @11DC: ifne @10EA
		// @11DF: if_icmpge @1230
		// @11E2: iload #12
		// @11E4: aload_0
		// @11E5: getfield int[] game.C_100171_cn.field_105575_j
		// @11E8: iload #13
		// @11EA: iload #10
		// @11EC: iadd
		// @11ED: iaload
		// @11EE: if_icmple @1205
		// @11F1: goto @11F5
		// @11F4: athrow
		// @11F5: aload_0
		// @11F6: getfield int[] game.C_100171_cn.field_105575_j
		// @11F9: iload #13
		// @11FB: iload #10
		// @11FD: iadd
		// @11FE: iload #12
		// @1200: iastore
		// @1201: goto @1205
		// @1204: athrow
		// @1205: iload #12
		// @1207: iconst_m1
		// @1208: ixor
		// @1209: aload_0
		// @120A: getfield int[] game.C_100171_cn.field_105567_e
		// @120D: iload #10
		// @120F: iload #13
		// @1211: iadd
		// @1212: iaload
		// @1213: iconst_m1
		// @1214: ixor
		// @1215: if_icmpge @1228
		// @1218: aload_0
		// @1219: getfield int[] game.C_100171_cn.field_105567_e
		// @121C: iload #10
		// @121E: iload #13
		// @1220: iadd
		// @1221: iload #12
		// @1223: iastore
		// @1224: goto @1228
		// @1227: athrow
		// @1228: iinc #13 +1
		// @122B: iload #22
		// @122D: ifeq @11C1
		// @1230: iinc #10 +1
		// @1233: iload #22
		// @1235: ifeq @10E2
		// @1238: iconst_m1
		// @1239: aload_0
		// @123A: getfield int game.C_100171_cn.field_105572_o
		// @123D: iconst_m1
		// @123E: ixor
		// @123F: if_icmpeq @16CF
		// @1242: bipush -3 (0xFD)
		// @1244: aload_0
		// @1245: getfield int game.C_100171_cn.field_105572_o
		// @1248: iconst_m1
		// @1249: ixor
		// @124A: if_icmpeq @1255
		// @124D: goto @1251
		// @1250: athrow
		// @1251: goto @1867
		// @1254: athrow
		// @1255: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @1258: aload_0
		// @1259: getfield int game.C_100171_cn.field_105572_o
		// @125C: aaload
		// @125D: arraylength
		// @125E: istore #10
		// @1260: iconst_0
		// @1261: istore #11
		// @1263: aload_0
		// @1264: getfield int game.C_100171_cn.field_105576_k
		// @1267: bipush 8 (0x08)
		// @1269: idiv
		// @126A: istore #12
		// @126C: aload_0
		// @126D: getfield int game.C_100171_cn.field_105576_k
		// @1270: aload_0
		// @1271: getfield int game.C_100171_cn.field_105576_k
		// @1274: bipush 8 (0x08)
		// @1276: idiv
		// @1277: isub
		// @1278: iconst_m1
		// @1279: ixor
		// @127A: iload #12
		// @127C: iconst_m1
		// @127D: ixor
		// @127E: if_icmpge @16CA
		// @1281: aload_0
		// @1282: getfield int[] game.C_100171_cn.field_105567_e
		// @1285: iload #12
		// @1287: iaload
		// @1288: istore #13
		// @128A: iload #22
		// @128C: ifne @1867
		// @128F: aload_0
		// @1290: getfield int game.C_100171_cn.field_105576_k
		// @1293: aload_0
		// @1294: getfield int game.C_100171_cn.field_105576_k
		// @1297: bipush 16 (0x10)
		// @1299: idiv
		// @129A: isub
		// @129B: iload #12
		// @129D: if_icmple @16C2
		// @12A0: goto @12A4
		// @12A3: athrow
		// @12A4: aload_0
		// @12A5: getfield int game.C_100171_cn.field_105569_c
		// @12A8: iconst_m1
		// @12A9: ixor
		// @12AA: aload_0
		// @12AB: getfield int game.C_100171_cn.field_105565_g
		// @12AE: iconst_m1
		// @12AF: ixor
		// @12B0: if_icmpgt @12BB
		// @12B3: goto @12B7
		// @12B6: athrow
		// @12B7: goto @16C2
		// @12BA: athrow
		// @12BB: aload_0
		// @12BC: getfield int[] game.C_100171_cn.field_105580_p
		// @12BF: aload_0
		// @12C0: getfield int game.C_100171_cn.field_105569_c
		// @12C3: iload #12
		// @12C5: iastore
		// @12C6: aload #5
		// @12C8: bipush -4 (0xFC)
		// @12CA: iload #10
		// @12CC: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @12CF: istore #14
		// @12D1: iinc #11 +255
		// @12D4: iload #14
		// @12D6: iconst_m1
		// @12D7: ixor
		// @12D8: bipush -3 (0xFD)
		// @12DA: if_icmplt @12FA
		// @12DD: iconst_m1
		// @12DE: iload #11
		// @12E0: iconst_m1
		// @12E1: ixor
		// @12E2: if_icmple @12FA
		// @12E5: goto @12E9
		// @12E8: athrow
		// @12E9: aload #5
		// @12EB: bipush -4 (0xFC)
		// @12ED: iload #10
		// @12EF: bipush -2 (0xFE)
		// @12F1: iadd
		// @12F2: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @12F5: bipush -2 (0xFE)
		// @12F7: isub
		// @12F8: istore #14
		// @12FA: aload_0
		// @12FB: getfield int[] game.C_100171_cn.field_105578_i
		// @12FE: aload_0
		// @12FF: getfield int game.C_100171_cn.field_105569_c
		// @1302: iload #14
		// @1304: iastore
		// @1305: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @1308: aload_0
		// @1309: getfield int game.C_100171_cn.field_105572_o
		// @130C: aaload
		// @130D: iload #14
		// @130F: aaload
		// @1310: astore #15
		// @1312: iload #12
		// @1314: aload #15
		// @1316: getfield int game.C_100037_wb.field_102341_y
		// @1319: iconst_2
		// @131A: imul
		// @131B: isub
		// @131C: istore #12
		// @131E: aload #15
		// @1320: getfield int game.C_100037_wb.field_102339_s
		// @1323: iconst_4
		// @1324: imul
		// @1325: istore #16
		// @1327: iload #12
		// @1329: iconst_4
		// @132A: aload #15
		// @132C: getfield int game.C_100037_wb.field_102335_w
		// @132F: imul
		// @1330: iadd
		// @1331: istore #12
		// @1333: iconst_0
		// @1334: istore #17
		// @1336: iload #17
		// @1338: iconst_m1
		// @1339: ixor
		// @133A: iload #16
		// @133C: iconst_m1
		// @133D: ixor
		// @133E: if_icmple @1371
		// @1341: iload #13
		// @1343: iconst_m1
		// @1344: ixor
		// @1345: aload_0
		// @1346: getfield int[] game.C_100171_cn.field_105567_e
		// @1349: iload #17
		// @134B: iload #12
		// @134D: iadd
		// @134E: iaload
		// @134F: iconst_m1
		// @1350: ixor
		// @1351: iload #22
		// @1353: ifne @139F
		// @1356: if_icmpge @1369
		// @1359: goto @135D
		// @135C: athrow
		// @135D: aload_0
		// @135E: getfield int[] game.C_100171_cn.field_105567_e
		// @1361: iload #17
		// @1363: iload #12
		// @1365: iadd
		// @1366: iaload
		// @1367: istore #13
		// @1369: iinc #17 +1
		// @136C: iload #22
		// @136E: ifeq @1336
		// @1371: aload_0
		// @1372: getfield int[] game.C_100171_cn.field_105577_h
		// @1375: aload_0
		// @1376: getfield int game.C_100171_cn.field_105569_c
		// @1379: bipush 8 (0x08)
		// @137B: aload #15
		// @137D: getfield int game.C_100037_wb.field_102332_H
		// @1380: imul
		// @1381: bipush 8 (0x08)
		// @1383: aload #15
		// @1385: getfield int game.C_100037_wb.field_102337_u
		// @1388: imul
		// @1389: ineg
		// @138A: isub
		// @138B: iload #13
		// @138D: iadd
		// @138E: iastore
		// @138F: iload #13
		// @1391: bipush 8 (0x08)
		// @1393: aload #15
		// @1395: getfield int game.C_100037_wb.field_102340_z
		// @1398: aload #15
		// @139A: getfield int game.C_100037_wb.field_102337_u
		// @139D: iadd
		// @139E: imul
		// @139F: iadd
		// @13A0: istore #13
		// @13A2: iconst_0
		// @13A3: istore #17
		// @13A5: iload #17
		// @13A7: iconst_m1
		// @13A8: ixor
		// @13A9: iload #16
		// @13AB: iconst_m1
		// @13AC: ixor
		// @13AD: if_icmple @1406
		// @13B0: iload #17
		// @13B2: iconst_4
		// @13B3: idiv
		// @13B4: istore #18
		// @13B6: iconst_0
		// @13B7: istore #19
		// @13B9: iload #22
		// @13BB: ifne @1413
		// @13BE: iinc #12 +1
		// @13C1: goto @13C5
		// @13C4: athrow
		// @13C5: iload #19
		// @13C7: aload #15
		// @13C9: getfield int game.C_100037_wb.field_102337_u
		// @13CC: if_icmpge @13FE
		// @13CF: iconst_0
		// @13D0: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @13D3: aload_0
		// @13D4: getfield int game.C_100171_cn.field_105572_o
		// @13D7: aaload
		// @13D8: iload #14
		// @13DA: aaload
		// @13DB: getfield int[] game.C_100037_wb.field_102388_J
		// @13DE: aload #15
		// @13E0: getfield int game.C_100037_wb.field_102339_s
		// @13E3: iload #19
		// @13E5: imul
		// @13E6: iload #18
		// @13E8: iadd
		// @13E9: iaload
		// @13EA: iload #22
		// @13EC: ifne @13AD
		// @13EF: if_icmpne @13FE
		// @13F2: iinc #19 +1
		// @13F5: iload #22
		// @13F7: ifeq @13C5
		// @13FA: goto @13FE
		// @13FD: athrow
		// @13FE: iinc #17 +1
		// @1401: iload #22
		// @1403: ifeq @13A5
		// @1406: bipush -2 (0xFE)
		// @1408: iload #14
		// @140A: iconst_m1
		// @140B: ixor
		// @140C: if_icmple @1413
		// @140F: goto @169A
		// @1412: athrow
		// @1413: iconst_0
		// @1414: istore #17
		// @1416: sipush 1000 (0x03E8)
		// @1419: iload #17
		// @141B: if_icmple @1571
		// @141E: iload #17
		// @1420: ineg
		// @1421: sipush -1000 (0xFC18)
		// @1424: iadd
		// @1425: aload_0
		// @1426: getfield int[] game.C_100171_cn.field_105580_p
		// @1429: aload_0
		// @142A: getfield int game.C_100171_cn.field_105569_c
		// @142D: iaload
		// @142E: iadd
		// @142F: istore #18
		// @1431: iload #18
		// @1433: iload #22
		// @1435: ifne @1572
		// @1438: iflt @14CA
		// @143B: goto @143F
		// @143E: athrow
		// @143F: iload #18
		// @1441: iconst_m1
		// @1442: ixor
		// @1443: aload_0
		// @1444: getfield int game.C_100171_cn.field_105576_k
		// @1447: iconst_m1
		// @1448: ixor
		// @1449: if_icmpgt @1454
		// @144C: goto @1450
		// @144F: athrow
		// @1450: goto @14CA
		// @1453: athrow
		// @1454: aload_0
		// @1455: getfield int[] game.C_100171_cn.field_105567_e
		// @1458: iload #18
		// @145A: sipush 1000 (0x03E8)
		// @145D: iload #17
		// @145F: ineg
		// @1460: iadd
		// @1461: sipush 1124 (0x0464)
		// @1464: imul
		// @1465: aload_0
		// @1466: getfield int[] game.C_100171_cn.field_105567_e
		// @1469: iload #18
		// @146B: iaload
		// @146C: iload #17
		// @146E: imul
		// @146F: iadd
		// @1470: sipush 1000 (0x03E8)
		// @1473: idiv
		// @1474: iastore
		// @1475: aload_0
		// @1476: getfield int[] game.C_100171_cn.field_105574_m
		// @1479: iload #18
		// @147B: iconst_0
		// @147C: iload #17
		// @147E: imul
		// @147F: ineg
		// @1480: iconst_0
		// @1481: aload_0
		// @1482: getfield int[] game.C_100171_cn.field_105574_m
		// @1485: iload #18
		// @1487: iaload
		// @1488: iload #17
		// @148A: imul
		// @148B: iadd
		// @148C: iadd
		// @148D: sipush 1000 (0x03E8)
		// @1490: idiv
		// @1491: iastore
		// @1492: aload_0
		// @1493: getfield int[] game.C_100171_cn.field_105575_j
		// @1496: iload #18
		// @1498: bipush -100 (0x9C)
		// @149A: aload_0
		// @149B: getfield int[] game.C_100171_cn.field_105567_e
		// @149E: iload #18
		// @14A0: iaload
		// @14A1: iadd
		// @14A2: iastore
		// @14A3: aload_0
		// @14A4: getfield int[] game.C_100171_cn.field_105574_m
		// @14A7: iload #18
		// @14A9: iaload
		// @14AA: sipush -1024 (0xFC00)
		// @14AD: isub
		// @14AE: aload_0
		// @14AF: getfield int[] game.C_100171_cn.field_105575_j
		// @14B2: iload #18
		// @14B4: iaload
		// @14B5: if_icmpgt @14BC
		// @14B8: goto @14CA
		// @14BB: athrow
		// @14BC: aload_0
		// @14BD: getfield int[] game.C_100171_cn.field_105575_j
		// @14C0: iload #18
		// @14C2: aload_0
		// @14C3: getfield int[] game.C_100171_cn.field_105567_e
		// @14C6: iload #18
		// @14C8: iaload
		// @14C9: iastore
		// @14CA: iload #17
		// @14CC: aload_0
		// @14CD: getfield int[] game.C_100171_cn.field_105580_p
		// @14D0: aload_0
		// @14D1: getfield int game.C_100171_cn.field_105569_c
		// @14D4: iaload
		// @14D5: sipush 1000 (0x03E8)
		// @14D8: iadd
		// @14D9: iadd
		// @14DA: istore #18
		// @14DC: iload #18
		// @14DE: iflt @1569
		// @14E1: aload_0
		// @14E2: getfield int game.C_100171_cn.field_105576_k
		// @14E5: iconst_m1
		// @14E6: ixor
		// @14E7: iload #18
		// @14E9: iconst_m1
		// @14EA: ixor
		// @14EB: if_icmpge @1569
		// @14EE: goto @14F2
		// @14F1: athrow
		// @14F2: aload_0
		// @14F3: getfield int[] game.C_100171_cn.field_105567_e
		// @14F6: iload #18
		// @14F8: sipush 1124 (0x0464)
		// @14FB: iload #17
		// @14FD: ineg
		// @14FE: sipush 1000 (0x03E8)
		// @1501: iadd
		// @1502: imul
		// @1503: iload #17
		// @1505: aload_0
		// @1506: getfield int[] game.C_100171_cn.field_105567_e
		// @1509: iload #18
		// @150B: iaload
		// @150C: imul
		// @150D: iadd
		// @150E: sipush 1000 (0x03E8)
		// @1511: idiv
		// @1512: iastore
		// @1513: aload_0
		// @1514: getfield int[] game.C_100171_cn.field_105574_m
		// @1517: iload #18
		// @1519: iload #17
		// @151B: aload_0
		// @151C: getfield int[] game.C_100171_cn.field_105574_m
		// @151F: iload #18
		// @1521: iaload
		// @1522: imul
		// @1523: iload #17
		// @1525: iconst_0
		// @1526: imul
		// @1527: ineg
		// @1528: iconst_0
		// @1529: iadd
		// @152A: iadd
		// @152B: sipush 1000 (0x03E8)
		// @152E: idiv
		// @152F: iastore
		// @1530: aload_0
		// @1531: getfield int[] game.C_100171_cn.field_105575_j
		// @1534: iload #18
		// @1536: sipush 1024 (0x0400)
		// @1539: iastore
		// @153A: aload_0
		// @153B: getfield int[] game.C_100171_cn.field_105575_j
		// @153E: iload #18
		// @1540: iaload
		// @1541: iconst_m1
		// @1542: ixor
		// @1543: sipush 1024 (0x0400)
		// @1546: aload_0
		// @1547: getfield int[] game.C_100171_cn.field_105574_m
		// @154A: iload #18
		// @154C: iaload
		// @154D: iadd
		// @154E: iconst_m1
		// @154F: ixor
		// @1550: if_icmple @1569
		// @1553: goto @1557
		// @1556: athrow
		// @1557: aload_0
		// @1558: getfield int[] game.C_100171_cn.field_105575_j
		// @155B: iload #18
		// @155D: aload_0
		// @155E: getfield int[] game.C_100171_cn.field_105567_e
		// @1561: iload #18
		// @1563: iaload
		// @1564: iastore
		// @1565: goto @1569
		// @1568: athrow
		// @1569: iinc #17 +1
		// @156C: iload #22
		// @156E: ifeq @1416
		// @1571: iconst_0
		// @1572: istore #17
		// @1574: iload #17
		// @1576: iconst_m1
		// @1577: ixor
		// @1578: sipush -2001 (0xF82F)
		// @157B: if_icmple @15D4
		// @157E: sipush -1000 (0xFC18)
		// @1581: aload_0
		// @1582: getfield int[] game.C_100171_cn.field_105580_p
		// @1585: aload_0
		// @1586: getfield int game.C_100171_cn.field_105569_c
		// @1589: iaload
		// @158A: iadd
		// @158B: iload #17
		// @158D: iadd
		// @158E: istore #18
		// @1590: iconst_0
		// @1591: iload #18
		// @1593: iload #22
		// @1595: ifne @15E0
		// @1598: if_icmpgt @15CC
		// @159B: goto @159F
		// @159E: athrow
		// @159F: aload_0
		// @15A0: getfield int game.C_100171_cn.field_105576_k
		// @15A3: iload #18
		// @15A5: if_icmple @15CC
		// @15A8: goto @15AC
		// @15AB: athrow
		// @15AC: aload_0
		// @15AD: getfield int[] game.C_100171_cn.field_105567_e
		// @15B0: iload #18
		// @15B2: sipush 1124 (0x0464)
		// @15B5: iastore
		// @15B6: aload_0
		// @15B7: getfield int[] game.C_100171_cn.field_105575_j
		// @15BA: iload #18
		// @15BC: sipush 1024 (0x0400)
		// @15BF: iastore
		// @15C0: aload_0
		// @15C1: getfield int[] game.C_100171_cn.field_105574_m
		// @15C4: iload #18
		// @15C6: iconst_0
		// @15C7: iastore
		// @15C8: goto @15CC
		// @15CB: athrow
		// @15CC: iinc #17 +1
		// @15CF: iload #22
		// @15D1: ifeq @1574
		// @15D4: aload_0
		// @15D5: getfield int[] game.C_100171_cn.field_105580_p
		// @15D8: aload_0
		// @15D9: getfield int game.C_100171_cn.field_105569_c
		// @15DC: iaload
		// @15DD: iload #16
		// @15DF: ineg
		// @15E0: iadd
		// @15E1: istore #17
		// @15E3: iconst_0
		// @15E4: istore #18
		// @15E6: iload #18
		// @15E8: iload #16
		// @15EA: ldc 221447105 (0xd3303c1)
		// @15EC: ishl
		// @15ED: if_icmpge @1697
		// @15F0: iload #18
		// @15F2: bipush 8 (0x08)
		// @15F4: idiv
		// @15F5: istore #19
		// @15F7: iconst_0
		// @15F8: iload #22
		// @15FA: ifne @1698
		// @15FD: istore #20
		// @15FF: iload #20
		// @1601: aload #15
		// @1603: getfield int game.C_100037_wb.field_102337_u
		// @1606: if_icmpge @163E
		// @1609: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @160C: aload_0
		// @160D: getfield int game.C_100171_cn.field_105572_o
		// @1610: aaload
		// @1611: iload #14
		// @1613: aaload
		// @1614: getfield int[] game.C_100037_wb.field_102388_J
		// @1617: aload #15
		// @1619: getfield int game.C_100037_wb.field_102339_s
		// @161C: iload #20
		// @161E: imul
		// @161F: iload #19
		// @1621: iadd
		// @1622: iaload
		// @1623: iconst_m1
		// @1624: ixor
		// @1625: iconst_m1
		// @1626: iload #22
		// @1628: ifne @1643
		// @162B: if_icmpne @163E
		// @162E: goto @1632
		// @1631: athrow
		// @1632: iinc #20 +1
		// @1635: iload #22
		// @1637: ifeq @15FF
		// @163A: goto @163E
		// @163D: athrow
		// @163E: iload #17
		// @1640: iconst_m1
		// @1641: ixor
		// @1642: iconst_m1
		// @1643: if_icmpgt @168C
		// @1646: aload_0
		// @1647: getfield int game.C_100171_cn.field_105576_k
		// @164A: iconst_m1
		// @164B: ixor
		// @164C: iload #17
		// @164E: iconst_m1
		// @164F: ixor
		// @1650: if_icmple @165B
		// @1653: goto @1657
		// @1656: athrow
		// @1657: goto @168C
		// @165A: athrow
		// @165B: aload_0
		// @165C: getfield int[] game.C_100171_cn.field_105567_e
		// @165F: iload #17
		// @1661: aload_0
		// @1662: getfield int[] game.C_100171_cn.field_105577_h
		// @1665: aload_0
		// @1666: getfield int game.C_100171_cn.field_105569_c
		// @1669: iaload
		// @166A: iload #20
		// @166C: ldc 805153027 (0x2ffda903)
		// @166E: ishl
		// @166F: isub
		// @1670: iastore
		// @1671: sipush 1124 (0x0464)
		// @1674: aload_0
		// @1675: getfield int[] game.C_100171_cn.field_105567_e
		// @1678: iload #17
		// @167A: iaload
		// @167B: if_icmpgt @1682
		// @167E: goto @168C
		// @1681: athrow
		// @1682: aload_0
		// @1683: getfield int[] game.C_100171_cn.field_105567_e
		// @1686: iload #17
		// @1688: sipush 1124 (0x0464)
		// @168B: iastore
		// @168C: iinc #17 +1
		// @168F: iinc #18 +1
		// @1692: iload #22
		// @1694: ifeq @15E6
		// @1697: iconst_2
		// @1698: istore #11
		// @169A: aload_0
		// @169B: getfield int game.C_100171_cn.field_105572_o
		// @169E: iconst_2
		// @169F: if_icmpeq @16A6
		// @16A2: goto @16B8
		// @16A5: athrow
		// @16A6: iload #12
		// @16A8: aload #5
		// @16AA: bipush -4 (0xFC)
		// @16AC: sipush 128 (0x0080)
		// @16AF: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @16B2: iload #16
		// @16B4: iadd
		// @16B5: iadd
		// @16B6: istore #12
		// @16B8: aload_0
		// @16B9: dup
		// @16BA: getfield int game.C_100171_cn.field_105569_c
		// @16BD: iconst_1
		// @16BE: iadd
		// @16BF: putfield int game.C_100171_cn.field_105569_c
		// @16C2: iinc #12 +1
		// @16C5: iload #22
		// @16C7: ifeq @126C
		// @16CA: iload #22
		// @16CC: ifeq @1867
		// @16CF: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @16D2: aload_0
		// @16D3: getfield int game.C_100171_cn.field_105572_o
		// @16D6: aaload
		// @16D7: arraylength
		// @16D8: istore #10
		// @16DA: aload_0
		// @16DB: getfield int game.C_100171_cn.field_105576_k
		// @16DE: bipush 8 (0x08)
		// @16E0: idiv
		// @16E1: istore #11
		// @16E3: iload #11
		// @16E5: aload_0
		// @16E6: getfield int game.C_100171_cn.field_105576_k
		// @16E9: aload_0
		// @16EA: getfield int game.C_100171_cn.field_105576_k
		// @16ED: bipush 8 (0x08)
		// @16EF: idiv
		// @16F0: isub
		// @16F1: if_icmpge @1867
		// @16F4: aload_0
		// @16F5: getfield int[] game.C_100171_cn.field_105567_e
		// @16F8: iload #11
		// @16FA: iaload
		// @16FB: istore #12
		// @16FD: iload #22
		// @16FF: ifne @189F
		// @1702: aload_0
		// @1703: getfield int game.C_100171_cn.field_105576_k
		// @1706: aload_0
		// @1707: getfield int game.C_100171_cn.field_105576_k
		// @170A: bipush 16 (0x10)
		// @170C: idiv
		// @170D: ineg
		// @170E: iadd
		// @170F: iconst_m1
		// @1710: ixor
		// @1711: iload #11
		// @1713: iconst_m1
		// @1714: ixor
		// @1715: if_icmpge @185F
		// @1718: goto @171C
		// @171B: athrow
		// @171C: aload_0
		// @171D: getfield int game.C_100171_cn.field_105569_c
		// @1720: iconst_m1
		// @1721: ixor
		// @1722: aload_0
		// @1723: getfield int game.C_100171_cn.field_105565_g
		// @1726: iconst_m1
		// @1727: ixor
		// @1728: if_icmple @185F
		// @172B: goto @172F
		// @172E: athrow
		// @172F: aload_0
		// @1730: getfield int[] game.C_100171_cn.field_105580_p
		// @1733: aload_0
		// @1734: getfield int game.C_100171_cn.field_105569_c
		// @1737: iload #11
		// @1739: iastore
		// @173A: aload #5
		// @173C: bipush -4 (0xFC)
		// @173E: iload #10
		// @1740: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @1743: istore #13
		// @1745: aload_0
		// @1746: getfield int[] game.C_100171_cn.field_105578_i
		// @1749: aload_0
		// @174A: getfield int game.C_100171_cn.field_105569_c
		// @174D: iload #13
		// @174F: iastore
		// @1750: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @1753: aload_0
		// @1754: getfield int game.C_100171_cn.field_105572_o
		// @1757: aaload
		// @1758: iload #13
		// @175A: aaload
		// @175B: astore #14
		// @175D: aload #14
		// @175F: getfield int game.C_100037_wb.field_102339_s
		// @1762: iconst_4
		// @1763: imul
		// @1764: istore #15
		// @1766: iload #11
		// @1768: aload #14
		// @176A: getfield int game.C_100037_wb.field_102341_y
		// @176D: iconst_2
		// @176E: imul
		// @176F: isub
		// @1770: istore #11
		// @1772: iload #11
		// @1774: iconst_4
		// @1775: aload #14
		// @1777: getfield int game.C_100037_wb.field_102335_w
		// @177A: imul
		// @177B: iadd
		// @177C: istore #11
		// @177E: iconst_0
		// @177F: istore #16
		// @1781: iload #15
		// @1783: iload #16
		// @1785: if_icmple @17B8
		// @1788: aload_0
		// @1789: getfield int[] game.C_100171_cn.field_105567_e
		// @178C: iload #16
		// @178E: iload #11
		// @1790: iadd
		// @1791: iaload
		// @1792: iload #12
		// @1794: iload #22
		// @1796: ifne @17E2
		// @1799: if_icmplt @17A3
		// @179C: goto @17A0
		// @179F: athrow
		// @17A0: goto @17B0
		// @17A3: aload_0
		// @17A4: getfield int[] game.C_100171_cn.field_105567_e
		// @17A7: iload #11
		// @17A9: iload #16
		// @17AB: ineg
		// @17AC: isub
		// @17AD: iaload
		// @17AE: istore #12
		// @17B0: iinc #16 +1
		// @17B3: iload #22
		// @17B5: ifeq @1781
		// @17B8: aload_0
		// @17B9: getfield int[] game.C_100171_cn.field_105577_h
		// @17BC: aload_0
		// @17BD: getfield int game.C_100171_cn.field_105569_c
		// @17C0: iload #12
		// @17C2: iconst_4
		// @17C3: aload #14
		// @17C5: getfield int game.C_100037_wb.field_102332_H
		// @17C8: imul
		// @17C9: iadd
		// @17CA: aload #14
		// @17CC: getfield int game.C_100037_wb.field_102337_u
		// @17CF: iconst_4
		// @17D0: imul
		// @17D1: iadd
		// @17D2: iastore
		// @17D3: iload #12
		// @17D5: iconst_4
		// @17D6: aload #14
		// @17D8: getfield int game.C_100037_wb.field_102340_z
		// @17DB: aload #14
		// @17DD: getfield int game.C_100037_wb.field_102337_u
		// @17E0: iadd
		// @17E1: imul
		// @17E2: iadd
		// @17E3: istore #12
		// @17E5: iconst_0
		// @17E6: istore #16
		// @17E8: iload #15
		// @17EA: iload #16
		// @17EC: if_icmple @1841
		// @17EF: iload #16
		// @17F1: iconst_4
		// @17F2: idiv
		// @17F3: istore #17
		// @17F5: iconst_0
		// @17F6: iload #22
		// @17F8: ifne @1853
		// @17FB: istore #18
		// @17FD: iload #18
		// @17FF: aload #14
		// @1801: getfield int game.C_100037_wb.field_102337_u
		// @1804: if_icmpge @1836
		// @1807: iconst_0
		// @1808: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @180B: aload_0
		// @180C: getfield int game.C_100171_cn.field_105572_o
		// @180F: aaload
		// @1810: iload #13
		// @1812: aaload
		// @1813: getfield int[] game.C_100037_wb.field_102388_J
		// @1816: iload #17
		// @1818: iload #18
		// @181A: aload #14
		// @181C: getfield int game.C_100037_wb.field_102339_s
		// @181F: imul
		// @1820: iadd
		// @1821: iaload
		// @1822: iload #22
		// @1824: ifne @17EC
		// @1827: if_icmpne @1836
		// @182A: iinc #18 +1
		// @182D: iload #22
		// @182F: ifeq @17FD
		// @1832: goto @1836
		// @1835: athrow
		// @1836: iinc #11 +1
		// @1839: iinc #16 +1
		// @183C: iload #22
		// @183E: ifeq @17E8
		// @1841: iload #11
		// @1843: aload #5
		// @1845: bipush -4 (0xFC)
		// @1847: sipush 2048 (0x0800)
		// @184A: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @184D: iload #15
		// @184F: iconst_2
		// @1850: idiv
		// @1851: iadd
		// @1852: iadd
		// @1853: istore #11
		// @1855: aload_0
		// @1856: dup
		// @1857: getfield int game.C_100171_cn.field_105569_c
		// @185A: iconst_1
		// @185B: iadd
		// @185C: putfield int game.C_100171_cn.field_105569_c
		// @185F: iinc #11 +1
		// @1862: iload #22
		// @1864: ifeq @16E3
		// @1867: goto @189F
		// @186A: astore #4
		// @186C: aload #4
		// @186E: new java.lang.StringBuilder
		// @1871: dup
		// @1872: invokespecial java.lang.StringBuilder.<init>()void
		// @1875: getstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @1878: iconst_5
		// @1879: aaload
		// @187A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @187D: iload_1
		// @187E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1881: bipush 44 (0x2C)
		// @1883: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1886: iload_2
		// @1887: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @188A: bipush 44 (0x2C)
		// @188C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @188F: iload_3
		// @1890: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1893: bipush 41 (0x29)
		// @1895: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1898: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @189B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @189E: athrow
		// @189F: return
	}
	
	final int func_105552_b(int arg0)
	{
		// @00: iload_1
		// @01: sipush 23156 (0x5A74)
		// @04: if_icmpeq @13
		// @07: iconst_1
		// @08: bipush -15 (0xF1)
		// @0A: bipush -32 (0xE0)
		// @0C: invokestatic game.C_100171_cn.func_105554_a(boolean, int, int)void
		// @0F: goto @13
		// @12: athrow
		// @13: aload_0
		// @14: getfield int game.C_100171_cn.field_105576_k
		// @17: ireturn
		// @18: astore_2
		// @19: aload_2
		// @1A: new java.lang.StringBuilder
		// @1D: dup
		// @1E: invokespecial java.lang.StringBuilder.<init>()void
		// @21: getstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @24: bipush 8 (0x08)
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: iload_1
		// @2B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2E: bipush 41 (0x29)
		// @30: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @33: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @36: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @39: athrow
	}
	
	final int func_105563_a(int arg0, int arg1)
	{
		// @00: iconst_0
		// @01: iload_2
		// @02: if_icmpgt @09
		// @05: goto @10
		// @08: athrow
		// @09: aload_0
		// @0A: getfield int[] game.C_100171_cn.field_105575_j
		// @0D: iconst_0
		// @0E: iaload
		// @0F: ireturn
		// @10: aload_0
		// @11: getfield int game.C_100171_cn.field_105576_k
		// @14: iload_2
		// @15: if_icmpgt @24
		// @18: aload_0
		// @19: getfield int[] game.C_100171_cn.field_105575_j
		// @1C: aload_0
		// @1D: getfield int game.C_100171_cn.field_105576_k
		// @20: iconst_1
		// @21: isub
		// @22: iaload
		// @23: ireturn
		// @24: iload_1
		// @25: ldc 830205956 (0x317bf004)
		// @27: if_icmpeq @2D
		// @2A: bipush 16 (0x10)
		// @2C: ireturn
		// @2D: aload_0
		// @2E: getfield int[] game.C_100171_cn.field_105575_j
		// @31: iload_2
		// @32: iaload
		// @33: ireturn
		// @34: astore_3
		// @35: aload_3
		// @36: new java.lang.StringBuilder
		// @39: dup
		// @3A: invokespecial java.lang.StringBuilder.<init>()void
		// @3D: getstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @40: bipush 11 (0x0B)
		// @42: aaload
		// @43: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @46: iload_1
		// @47: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4A: bipush 44 (0x2C)
		// @4C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F: iload_2
		// @50: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @53: bipush 41 (0x29)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5E: athrow
	}
	
	public static void func_105557_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic int[] game.C_100171_cn.field_105571_n
		// @04: aconst_null
		// @05: putstatic game.C_100098_h game.C_100171_cn.field_105566_d
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100171_cn.field_105564_f
		// @0C: iload_0
		// @0D: bipush -87 (0xA9)
		// @0F: if_icmpeq @13
		// @12: return
		// @13: aconst_null
		// @14: putstatic java.lang.String game.C_100171_cn.field_105568_b
		// @17: goto @3C
		// @1A: astore_1
		// @1B: aload_1
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @26: bipush 10 (0x0A)
		// @28: aaload
		// @29: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C: iload_0
		// @2D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @30: bipush 41 (0x29)
		// @32: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @35: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @38: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3B: athrow
		// @3C: return
	}
	
	final int func_105555_b(int arg0, int arg1)
	{
		// @00: iload_2
		// @01: iconst_m1
		// @02: ixor
		// @03: iconst_m1
		// @04: if_icmple @0E
		// @07: aload_0
		// @08: getfield int[] game.C_100171_cn.field_105567_e
		// @0B: iconst_0
		// @0C: iaload
		// @0D: ireturn
		// @0E: iload_1
		// @0F: sipush -25357 (0x9CF3)
		// @12: if_icmpeq @1F
		// @15: aload_0
		// @16: bipush -97 (0x9F)
		// @18: putfield int game.C_100171_cn.field_105565_g
		// @1B: goto @1F
		// @1E: athrow
		// @1F: iload_2
		// @20: aload_0
		// @21: getfield int game.C_100171_cn.field_105576_k
		// @24: if_icmplt @33
		// @27: aload_0
		// @28: getfield int[] game.C_100171_cn.field_105567_e
		// @2B: iconst_m1
		// @2C: aload_0
		// @2D: getfield int game.C_100171_cn.field_105576_k
		// @30: iadd
		// @31: iaload
		// @32: ireturn
		// @33: aload_0
		// @34: getfield int[] game.C_100171_cn.field_105567_e
		// @37: iload_2
		// @38: iaload
		// @39: ireturn
		// @3A: astore_3
		// @3B: aload_3
		// @3C: new java.lang.StringBuilder
		// @3F: dup
		// @40: invokespecial java.lang.StringBuilder.<init>()void
		// @43: getstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @46: bipush 6 (0x06)
		// @48: aaload
		// @49: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4C: iload_1
		// @4D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @50: bipush 44 (0x2C)
		// @52: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @55: iload_2
		// @56: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @59: bipush 41 (0x29)
		// @5B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @61: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @64: athrow
	}
	
	static final void func_105554_a(boolean arg0, int arg1, int arg2)
	{
		// @000: getstatic game.C_100118_ub game.C_100038_wa.field_104073_n
		// @003: ifnull @0E9
		// @006: getstatic game.C_100118_ub game.C_100038_wa.field_104073_n
		// @009: iload_0
		// @00A: bipush 13 (0x0D)
		// @00C: invokevirtual game.C_100118_ub.func_102052_b(boolean, byte)int
		// @00F: istore_3
		// @010: iload_3
		// @011: iconst_m1
		// @012: ixor
		// @013: iconst_m1
		// @014: if_icmpeq @0E9
		// @017: bipush -3 (0xFD)
		// @019: iload_3
		// @01A: iconst_m1
		// @01B: ixor
		// @01C: if_icmpne @0E1
		// @01F: goto @023
		// @022: athrow
		// @023: getstatic game.C_100118_ub game.C_100038_wa.field_104073_n
		// @026: getfield java.lang.String game.C_100118_ub.field_101890_ab
		// @029: ifnull @0E1
		// @02C: goto @030
		// @02F: athrow
		// @030: getstatic game.C_100118_ub game.C_100038_wa.field_104073_n
		// @033: getfield java.lang.String game.C_100118_ub.field_101890_ab
		// @036: ldc ""
		// @038: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @03B: ifne @0E1
		// @03E: goto @042
		// @041: athrow
		// @042: bipush -92 (0xA4)
		// @044: getstatic game.C_100118_ub game.C_100038_wa.field_104073_n
		// @047: getfield java.lang.String game.C_100118_ub.field_101890_ab
		// @04A: iconst_0
		// @04B: invokevirtual java.lang.String.charAt(int)char
		// @04E: iconst_m1
		// @04F: ixor
		// @050: if_icmpne @065
		// @053: goto @057
		// @056: athrow
		// @057: getstatic game.C_100118_ub game.C_100038_wa.field_104073_n
		// @05A: getfield java.lang.String game.C_100118_ub.field_101890_ab
		// @05D: astore #4
		// @05F: getstatic int game.SteelSentinels.field_105275_O
		// @062: ifeq @072
		// @065: bipush -81 (0xAF)
		// @067: getstatic game.C_100118_ub game.C_100038_wa.field_104073_n
		// @06A: getfield java.lang.String game.C_100118_ub.field_101890_ab
		// @06D: invokestatic game.C_100106_ef.func_104742_a(byte, java.lang.CharSequence)java.lang.String
		// @070: astore #4
		// @072: aconst_null
		// @073: astore #5
		// @075: iconst_m1
		// @076: getstatic int game.C_100209_qb.field_102688_Kb
		// @079: iconst_m1
		// @07A: ixor
		// @07B: if_icmpne @089
		// @07E: iload_1
		// @07F: aload #4
		// @081: sipush -1064 (0xFBD8)
		// @084: invokestatic game.C_100240_oj.func_106303_a(int, java.lang.String, int)java.lang.String
		// @087: astore #5
		// @089: bipush -2 (0xFE)
		// @08B: getstatic int game.C_100209_qb.field_102688_Kb
		// @08E: iconst_m1
		// @08F: ixor
		// @090: if_icmpeq @097
		// @093: goto @0A0
		// @096: athrow
		// @097: aload #4
		// @099: iconst_0
		// @09A: iload_1
		// @09B: invokestatic game.C_100215_ai.func_106008_a(java.lang.String, boolean, int)java.lang.String
		// @09E: astore #5
		// @0A0: getstatic int game.C_100209_qb.field_102688_Kb
		// @0A3: iconst_2
		// @0A4: if_icmpne @0B1
		// @0A7: bipush 125 (0x7D)
		// @0A9: aload #4
		// @0AB: iload_1
		// @0AC: invokestatic game.C_100207_qh.func_102866_a(byte, java.lang.String, int)java.lang.String
		// @0AF: astore #5
		// @0B1: bipush -4 (0xFC)
		// @0B3: getstatic int game.C_100209_qb.field_102688_Kb
		// @0B6: iconst_m1
		// @0B7: ixor
		// @0B8: if_icmpeq @0BF
		// @0BB: goto @0CB
		// @0BE: athrow
		// @0BF: iload_1
		// @0C0: aload #4
		// @0C2: aload #4
		// @0C4: bipush 106 (0x6A)
		// @0C6: invokestatic game.C_100269_ml.func_101119_a(int, java.lang.String, java.lang.String, int)java.lang.String
		// @0C9: astore #5
		// @0CB: aconst_null
		// @0CC: aload #5
		// @0CE: if_acmpne @0D5
		// @0D1: goto @0E1
		// @0D4: athrow
		// @0D5: aconst_null
		// @0D6: ldc -1221466785 (0xb731e55f)
		// @0D8: iconst_0
		// @0D9: iconst_2
		// @0DA: aload #4
		// @0DC: aload #5
		// @0DE: invokestatic game.C_100019_wl.func_103834_a(java.lang.String, int, int, int, java.lang.String, java.lang.String)void
		// @0E1: iconst_m1
		// @0E2: putstatic int game.C_100209_qb.field_102688_Kb
		// @0E5: aconst_null
		// @0E6: putstatic game.C_100118_ub game.C_100038_wa.field_104073_n
		// @0E9: bipush 41 (0x29)
		// @0EB: bipush -36 (0xDC)
		// @0ED: iload_2
		// @0EE: isub
		// @0EF: bipush 54 (0x36)
		// @0F1: idiv
		// @0F2: irem
		// @0F3: istore_3
		// @0F4: goto @12A
		// @0F7: astore_3
		// @0F8: aload_3
		// @0F9: new java.lang.StringBuilder
		// @0FC: dup
		// @0FD: invokespecial java.lang.StringBuilder.<init>()void
		// @100: getstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @103: iconst_4
		// @104: aaload
		// @105: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @108: iload_0
		// @109: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @10C: bipush 44 (0x2C)
		// @10E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @111: iload_1
		// @112: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @115: bipush 44 (0x2C)
		// @117: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @11A: iload_2
		// @11B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @11E: bipush 41 (0x29)
		// @120: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @123: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @126: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @129: athrow
		// @12A: return
	}
	
	final int func_105559_a(int arg0)
	{
		// @00: iload_1
		// @01: sipush 26294 (0x66B6)
		// @04: if_icmpeq @12
		// @07: aconst_null
		// @08: checkcast java.lang.String
		// @0B: putstatic java.lang.String game.C_100171_cn.field_105568_b
		// @0E: goto @12
		// @11: athrow
		// @12: aload_0
		// @13: getfield int game.C_100171_cn.field_105572_o
		// @16: ireturn
		// @17: astore_2
		// @18: aload_2
		// @19: new java.lang.StringBuilder
		// @1C: dup
		// @1D: invokespecial java.lang.StringBuilder.<init>()void
		// @20: getstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @23: iconst_0
		// @24: aaload
		// @25: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @28: iload_1
		// @29: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2C: bipush 41 (0x29)
		// @2E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @31: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @34: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @37: athrow
	}
	
	static final boolean func_105561_a(boolean arg0, int[] arg1, int arg2, boolean arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: iload_2
		// @006: iconst_m1
		// @007: invokestatic game.C_100152_bd.func_105179_a(int, int)int
		// @00A: istore #4
		// @00C: iload #4
		// @00E: ifge @013
		// @011: iconst_0
		// @012: ireturn
		// @013: iload #4
		// @015: iconst_3
		// @016: if_icmplt @01D
		// @019: goto @01F
		// @01C: athrow
		// @01D: iconst_1
		// @01E: ireturn
		// @01F: iload #4
		// @021: bipush 6 (0x06)
		// @023: if_icmplt @034
		// @026: iload_0
		// @027: ifeq @032
		// @02A: goto @02E
		// @02D: athrow
		// @02E: goto @034
		// @031: athrow
		// @032: iconst_0
		// @033: ireturn
		// @034: iconst_0
		// @035: istore #5
		// @037: iconst_0
		// @038: istore #6
		// @03A: iload #6
		// @03C: iconst_m1
		// @03D: ixor
		// @03E: bipush -7 (0xF9)
		// @040: if_icmple @069
		// @043: getstatic int[] game.C_100017_wj.field_103821_j
		// @046: iload #6
		// @048: iaload
		// @049: aload_1
		// @04A: bipush -96 (0xA0)
		// @04C: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @04F: iload #8
		// @051: ifne @06A
		// @054: ifne @05E
		// @057: goto @05B
		// @05A: athrow
		// @05B: goto @061
		// @05E: iinc #5 +1
		// @061: iinc #6 +1
		// @064: iload #8
		// @066: ifeq @03A
		// @069: iload_3
		// @06A: ifeq @06F
		// @06D: iconst_1
		// @06E: ireturn
		// @06F: iload #4
		// @071: iconst_m1
		// @072: ixor
		// @073: bipush -7 (0xF9)
		// @075: if_icmpgt @07C
		// @078: goto @090
		// @07B: athrow
		// @07C: iconst_2
		// @07D: iload #5
		// @07F: iadd
		// @080: iconst_m1
		// @081: ixor
		// @082: iload #4
		// @084: iconst_m1
		// @085: ixor
		// @086: if_icmpge @08E
		// @089: iconst_1
		// @08A: goto @08F
		// @08D: athrow
		// @08E: iconst_0
		// @08F: ireturn
		// @090: iconst_0
		// @091: istore #6
		// @093: bipush 6 (0x06)
		// @095: istore #7
		// @097: iload #7
		// @099: getstatic int[] game.C_100017_wj.field_103821_j
		// @09C: arraylength
		// @09D: if_icmpge @0C6
		// @0A0: getstatic int[] game.C_100017_wj.field_103821_j
		// @0A3: iload #7
		// @0A5: iaload
		// @0A6: aload_1
		// @0A7: bipush -105 (0x97)
		// @0A9: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @0AC: iload #8
		// @0AE: ifne @0CF
		// @0B1: ifne @0BB
		// @0B4: goto @0B8
		// @0B7: athrow
		// @0B8: goto @0BE
		// @0BB: iinc #6 +1
		// @0BE: iinc #7 +1
		// @0C1: iload #8
		// @0C3: ifeq @097
		// @0C6: bipush 7 (0x07)
		// @0C8: iload #6
		// @0CA: iadd
		// @0CB: istore #7
		// @0CD: bipush -7 (0xF9)
		// @0CF: iload #5
		// @0D1: iconst_m1
		// @0D2: ixor
		// @0D3: if_icmpeq @0DA
		// @0D6: goto @0DD
		// @0D9: athrow
		// @0DA: iinc #7 +1
		// @0DD: iload #7
		// @0DF: iconst_m1
		// @0E0: ixor
		// @0E1: iload #4
		// @0E3: iconst_m1
		// @0E4: ixor
		// @0E5: if_icmpge @0ED
		// @0E8: iconst_1
		// @0E9: goto @0EE
		// @0EC: athrow
		// @0ED: iconst_0
		// @0EE: ireturn
		// @0EF: astore #4
		// @0F1: aload #4
		// @0F3: new java.lang.StringBuilder
		// @0F6: dup
		// @0F7: invokespecial java.lang.StringBuilder.<init>()void
		// @0FA: getstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @0FD: iconst_2
		// @0FE: aaload
		// @0FF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @102: iload_0
		// @103: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @106: bipush 44 (0x2C)
		// @108: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10B: aload_1
		// @10C: ifnull @118
		// @10F: getstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @112: iconst_3
		// @113: aaload
		// @114: goto @11D
		// @117: athrow
		// @118: getstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @11B: iconst_1
		// @11C: aaload
		// @11D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @120: bipush 44 (0x2C)
		// @122: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @125: iload_2
		// @126: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @129: bipush 44 (0x2C)
		// @12B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @12E: iload_3
		// @12F: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @132: bipush 41 (0x29)
		// @134: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @137: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @13A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @13D: athrow
	}
	
	C_100171_cn(int arg0, int arg1)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iload_2
		// @06: iload_1
		// @07: iconst_4
		// @08: invokevirtual game.C_100171_cn.func_105562_a(int, int, int)void
		// @0B: goto @39
		// @0E: astore_3
		// @0F: aload_3
		// @10: new java.lang.StringBuilder
		// @13: dup
		// @14: invokespecial java.lang.StringBuilder.<init>()void
		// @17: getstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @1A: bipush 12 (0x0C)
		// @1C: aaload
		// @1D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @20: iload_1
		// @21: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @24: bipush 44 (0x2C)
		// @26: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @29: iload_2
		// @2A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2D: bipush 41 (0x29)
		// @2F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @32: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @35: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @38: athrow
		// @39: return
	}
	
	static
	{
		// @00: bipush 13 (0x0D)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "9 ]o?"
		// @09: invokestatic game.C_100171_cn.func_105558_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100171_cn.func_105556_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "4;\u001fB"
		// @14: invokestatic game.C_100171_cn.func_105558_z(java.lang.String)char[]
		// @17: invokestatic game.C_100171_cn.func_105556_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "9 ]l?"
		// @1F: invokestatic game.C_100171_cn.func_105558_z(java.lang.String)char[]
		// @22: invokestatic game.C_100171_cn.func_105556_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "!`]\u0000j"
		// @2A: invokestatic game.C_100171_cn.func_105558_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100171_cn.func_105556_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "9 ]i?"
		// @35: invokestatic game.C_100171_cn.func_105558_z(java.lang.String)char[]
		// @38: invokestatic game.C_100171_cn.func_105556_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "9 ]m?"
		// @40: invokestatic game.C_100171_cn.func_105558_z(java.lang.String)char[]
		// @43: invokestatic game.C_100171_cn.func_105556_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "9 ]f?"
		// @4C: invokestatic game.C_100171_cn.func_105558_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100171_cn.func_105556_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "9 ]j?"
		// @58: invokestatic game.C_100171_cn.func_105558_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100171_cn.func_105556_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "9 ]h?"
		// @64: invokestatic game.C_100171_cn.func_105558_z(java.lang.String)char[]
		// @67: invokestatic game.C_100171_cn.func_105556_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "9 ]g?"
		// @70: invokestatic game.C_100171_cn.func_105558_z(java.lang.String)char[]
		// @73: invokestatic game.C_100171_cn.func_105556_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "9 ]k?"
		// @7C: invokestatic game.C_100171_cn.func_105558_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100171_cn.func_105556_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "9 ]d?"
		// @88: invokestatic game.C_100171_cn.func_105558_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100171_cn.func_105556_z(char[])java.lang.String
		// @8E: aastore
		// @8F: dup
		// @90: bipush 12 (0x0C)
		// @92: ldc "9 ]\u0012~4'\u0007\u0010?"
		// @94: invokestatic game.C_100171_cn.func_105558_z(java.lang.String)char[]
		// @97: invokestatic game.C_100171_cn.func_105556_z(char[])java.lang.String
		// @9A: aastore
		// @9B: putstatic java.lang.String[] game.C_100171_cn.field_105581_z
		// @9E: ldc ";,\u0010Jr<)\u001bG}1\"\u001e@x*?\u0001]c/8\u0004Vn \u000f1mS\u001f\u00084f^\u0010\u0005?cY\u0015\u001e\"|D\u000e\u001b%yO\u0003\u0014C\u001f%izF\u0018 bwR\r3\u007fhT\u0004<waN\u0011I\u00055\u000eP"
		// @A0: invokestatic game.C_100171_cn.func_105558_z(java.lang.String)char[]
		// @A3: invokestatic game.C_100171_cn.func_105556_z(char[])java.lang.String
		// @A6: putstatic java.lang.String game.C_100171_cn.field_105568_b
		// @A9: iconst_0
		// @AA: putstatic boolean game.C_100171_cn.field_105570_a
		// @AD: return
	}
	
	private static char[] func_105558_z(String arg0)
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
		// @0E: bipush 23 (0x17)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105556_z(char[] arg0)
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
		// @30: bipush 90 (0x5A)
		// @32: goto @46
		// @35: bipush 78 (0x4E)
		// @37: goto @46
		// @3A: bipush 115 (0x73)
		// @3C: goto @46
		// @3F: bipush 46 (0x2E)
		// @41: goto @46
		// @44: bipush 23 (0x17)
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
