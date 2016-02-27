package game;

final class C_100165_sh extends C_100158_da
{
	int field_100770_r;
	byte[] field_100777_j;
	static int[][][] field_100774_o;
	long field_100775_l;
	static String field_100776_m;
	static String field_100773_n;
	static C_100037_wb[] field_100771_q;
	static int field_100779_k;
	static boolean field_100772_p;
	static int field_100769_s;
	private static final String[] field_100778_z;
	
	public static void func_100767_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100037_wb[] game.C_100165_sh.field_100771_q
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100165_sh.field_100776_m
		// @08: aconst_null
		// @09: checkcast int[][][]
		// @0C: putstatic int[][][] game.C_100165_sh.field_100774_o
		// @0F: bipush 51 (0x33)
		// @11: bipush 47 (0x2F)
		// @13: iload_0
		// @14: isub
		// @15: bipush 45 (0x2D)
		// @17: idiv
		// @18: irem
		// @19: istore_1
		// @1A: aconst_null
		// @1B: putstatic java.lang.String game.C_100165_sh.field_100773_n
		// @1E: goto @42
		// @21: astore_1
		// @22: aload_1
		// @23: new java.lang.StringBuilder
		// @26: dup
		// @27: invokespecial java.lang.StringBuilder.<init>()void
		// @2A: getstatic java.lang.String[] game.C_100165_sh.field_100778_z
		// @2D: iconst_3
		// @2E: aaload
		// @2F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @32: iload_0
		// @33: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @36: bipush 41 (0x29)
		// @38: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @41: athrow
		// @42: return
	}
	
	C_100165_sh(long arg0, int arg1, byte[] arg2)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100158_da.<init>()void
		// @04: aload_0
		// @05: lload_1
		// @06: putfield long game.C_100165_sh.field_100775_l
		// @09: aload_0
		// @0A: iload_3
		// @0B: putfield int game.C_100165_sh.field_100770_r
		// @0E: aload_0
		// @0F: aload #4
		// @11: putfield byte[] game.C_100165_sh.field_100777_j
		// @14: goto @5E
		// @17: astore #5
		// @19: aload #5
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100165_sh.field_100778_z
		// @25: iconst_1
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: lload_1
		// @2B: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @2E: bipush 44 (0x2C)
		// @30: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @33: iload_3
		// @34: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @37: bipush 44 (0x2C)
		// @39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C: aload #4
		// @3E: ifnull @4A
		// @41: getstatic java.lang.String[] game.C_100165_sh.field_100778_z
		// @44: iconst_0
		// @45: aaload
		// @46: goto @4F
		// @49: athrow
		// @4A: getstatic java.lang.String[] game.C_100165_sh.field_100778_z
		// @4D: iconst_2
		// @4E: aaload
		// @4F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @52: bipush 41 (0x29)
		// @54: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @57: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5D: athrow
		// @5E: return
	}
	
	static
	{
		// @0000: iconst_4
		// @0001: anewarray java.lang.String
		// @0004: dup
		// @0005: iconst_0
		// @0006: ldc "\u0008*XnY"
		// @0008: invokestatic game.C_100165_sh.func_100768_z(java.lang.String)char[]
		// @000B: invokestatic game.C_100165_sh.func_100766_z(char[])java.lang.String
		// @000E: aastore
		// @000F: dup
		// @0010: iconst_1
		// @0011: ldc "\u0000lX|M\u001dm\u0002~\u000c"
		// @0013: invokestatic game.C_100165_sh.func_100768_z(java.lang.String)char[]
		// @0016: invokestatic game.C_100165_sh.func_100766_z(char[])java.lang.String
		// @0019: aastore
		// @001A: dup
		// @001B: iconst_2
		// @001C: ldc "\u001dq\u001a,"
		// @001E: invokestatic game.C_100165_sh.func_100768_z(java.lang.String)char[]
		// @0021: invokestatic game.C_100165_sh.func_100766_z(char[])java.lang.String
		// @0024: aastore
		// @0025: dup
		// @0026: iconst_3
		// @0027: ldc "\u0000lX\u0001\u000c"
		// @0029: invokestatic game.C_100165_sh.func_100768_z(java.lang.String)char[]
		// @002C: invokestatic game.C_100165_sh.func_100766_z(char[])java.lang.String
		// @002F: aastore
		// @0030: putstatic java.lang.String[] game.C_100165_sh.field_100778_z
		// @0033: bipush 13 (0x0D)
		// @0035: bipush 26 (0x1A)
		// @0037: multianewarray int[][][] (init: 2)
		// @003B: putstatic int[][][] game.C_100165_sh.field_100774_o
		// @003E: iconst_0
		// @003F: istore_0
		// @0040: bipush 13 (0x0D)
		// @0042: iload_0
		// @0043: if_icmple @00BA
		// @0046: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @0049: iload_0
		// @004A: aaload
		// @004B: bipush 25 (0x19)
		// @004D: bipush 8 (0x08)
		// @004F: newarray int[]
		// @0051: aastore
		// @0052: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @0055: iload_0
		// @0056: aaload
		// @0057: bipush 25 (0x19)
		// @0059: aaload
		// @005A: iconst_2
		// @005B: bipush 25 (0x19)
		// @005D: iastore
		// @005E: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @0061: iload_0
		// @0062: aaload
		// @0063: bipush 25 (0x19)
		// @0065: aaload
		// @0066: iconst_3
		// @0067: bipush 8 (0x08)
		// @0069: iastore
		// @006A: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @006D: iload_0
		// @006E: aaload
		// @006F: bipush 25 (0x19)
		// @0071: aaload
		// @0072: iconst_4
		// @0073: iconst_5
		// @0074: iastore
		// @0075: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @0078: iload_0
		// @0079: aaload
		// @007A: bipush 25 (0x19)
		// @007C: aaload
		// @007D: iconst_0
		// @007E: bipush 32 (0x20)
		// @0080: iastore
		// @0081: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @0084: iload_0
		// @0085: aaload
		// @0086: bipush 25 (0x19)
		// @0088: aaload
		// @0089: iconst_1
		// @008A: bipush 10 (0x0A)
		// @008C: iastore
		// @008D: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @0090: iload_0
		// @0091: aaload
		// @0092: bipush 25 (0x19)
		// @0094: aaload
		// @0095: bipush 7 (0x07)
		// @0097: bipush 8 (0x08)
		// @0099: iastore
		// @009A: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @009D: iload_0
		// @009E: aaload
		// @009F: bipush 25 (0x19)
		// @00A1: aaload
		// @00A2: iconst_5
		// @00A3: bipush 32 (0x20)
		// @00A5: iastore
		// @00A6: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @00A9: iload_0
		// @00AA: aaload
		// @00AB: bipush 25 (0x19)
		// @00AD: aaload
		// @00AE: bipush 6 (0x06)
		// @00B0: bipush 10 (0x0A)
		// @00B2: iastore
		// @00B3: iinc #0 +1
		// @00B6: goto @0040
		// @00B9: athrow
		// @00BA: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @00BD: iconst_0
		// @00BE: aaload
		// @00BF: astore_0
		// @00C0: aload_0
		// @00C1: bipush 15 (0x0F)
		// @00C3: iconst_5
		// @00C4: newarray int[]
		// @00C6: dup
		// @00C7: iconst_0
		// @00C8: sipush -5921 (0xE8DF)
		// @00CB: iastore
		// @00CC: dup
		// @00CD: iconst_1
		// @00CE: sipush 4070 (0x0FE6)
		// @00D1: iastore
		// @00D2: dup
		// @00D3: iconst_2
		// @00D4: sipush -1480 (0xFA38)
		// @00D7: iastore
		// @00D8: dup
		// @00D9: iconst_3
		// @00DA: sipush -1041 (0xFBEF)
		// @00DD: iastore
		// @00DE: dup
		// @00DF: iconst_4
		// @00E0: iconst_0
		// @00E1: iastore
		// @00E2: aastore
		// @00E3: aload_0
		// @00E4: bipush 22 (0x16)
		// @00E6: iconst_5
		// @00E7: newarray int[]
		// @00E9: dup
		// @00EA: iconst_0
		// @00EB: iconst_0
		// @00EC: iastore
		// @00ED: dup
		// @00EE: iconst_1
		// @00EF: iconst_0
		// @00F0: iastore
		// @00F1: dup
		// @00F2: iconst_2
		// @00F3: iconst_0
		// @00F4: iastore
		// @00F5: dup
		// @00F6: iconst_3
		// @00F7: iconst_0
		// @00F8: iastore
		// @00F9: dup
		// @00FA: iconst_4
		// @00FB: iconst_0
		// @00FC: iastore
		// @00FD: aastore
		// @00FE: aload_0
		// @00FF: bipush 25 (0x19)
		// @0101: bipush 8 (0x08)
		// @0103: newarray int[]
		// @0105: dup
		// @0106: iconst_0
		// @0107: bipush 70 (0x46)
		// @0109: iastore
		// @010A: dup
		// @010B: iconst_1
		// @010C: bipush 10 (0x0A)
		// @010E: iastore
		// @010F: dup
		// @0110: iconst_2
		// @0111: bipush 25 (0x19)
		// @0113: iastore
		// @0114: dup
		// @0115: iconst_3
		// @0116: iconst_3
		// @0117: iastore
		// @0118: dup
		// @0119: iconst_4
		// @011A: iconst_5
		// @011B: iastore
		// @011C: dup
		// @011D: iconst_5
		// @011E: bipush 50 (0x32)
		// @0120: iastore
		// @0121: dup
		// @0122: bipush 6 (0x06)
		// @0124: bipush 10 (0x0A)
		// @0126: iastore
		// @0127: dup
		// @0128: bipush 7 (0x07)
		// @012A: iconst_3
		// @012B: iastore
		// @012C: aastore
		// @012D: aload_0
		// @012E: bipush 11 (0x0B)
		// @0130: iconst_5
		// @0131: newarray int[]
		// @0133: dup
		// @0134: iconst_0
		// @0135: iconst_0
		// @0136: iastore
		// @0137: dup
		// @0138: iconst_1
		// @0139: sipush 9621 (0x2595)
		// @013C: iastore
		// @013D: dup
		// @013E: iconst_2
		// @013F: sipush -8511 (0xDEC1)
		// @0142: iastore
		// @0143: dup
		// @0144: iconst_3
		// @0145: sipush -364 (0xFE94)
		// @0148: iastore
		// @0149: dup
		// @014A: iconst_4
		// @014B: sipush 1041 (0x0411)
		// @014E: iastore
		// @014F: aastore
		// @0150: aload_0
		// @0151: bipush 12 (0x0C)
		// @0153: iconst_5
		// @0154: newarray int[]
		// @0156: dup
		// @0157: iconst_0
		// @0158: iconst_0
		// @0159: iastore
		// @015A: dup
		// @015B: iconst_1
		// @015C: sipush 12212 (0x2FB4)
		// @015F: iastore
		// @0160: dup
		// @0161: iconst_2
		// @0162: sipush -10731 (0xD615)
		// @0165: iastore
		// @0166: dup
		// @0167: iconst_3
		// @0168: sipush -520 (0xFDF8)
		// @016B: iastore
		// @016C: dup
		// @016D: iconst_4
		// @016E: sipush 1250 (0x04E2)
		// @0171: iastore
		// @0172: aastore
		// @0173: aload_0
		// @0174: bipush 24 (0x18)
		// @0176: iconst_5
		// @0177: newarray int[]
		// @0179: dup
		// @017A: iconst_0
		// @017B: iconst_0
		// @017C: iastore
		// @017D: dup
		// @017E: iconst_1
		// @017F: iconst_0
		// @0180: iastore
		// @0181: dup
		// @0182: iconst_2
		// @0183: iconst_0
		// @0184: iastore
		// @0185: dup
		// @0186: iconst_3
		// @0187: iconst_0
		// @0188: iastore
		// @0189: dup
		// @018A: iconst_4
		// @018B: iconst_0
		// @018C: iastore
		// @018D: aastore
		// @018E: aload_0
		// @018F: bipush 20 (0x14)
		// @0191: iconst_5
		// @0192: newarray int[]
		// @0194: dup
		// @0195: iconst_0
		// @0196: iconst_0
		// @0197: iastore
		// @0198: dup
		// @0199: iconst_1
		// @019A: iconst_0
		// @019B: iastore
		// @019C: dup
		// @019D: iconst_2
		// @019E: iconst_0
		// @019F: iastore
		// @01A0: dup
		// @01A1: iconst_3
		// @01A2: iconst_0
		// @01A3: iastore
		// @01A4: dup
		// @01A5: iconst_4
		// @01A6: iconst_0
		// @01A7: iastore
		// @01A8: aastore
		// @01A9: aload_0
		// @01AA: iconst_2
		// @01AB: iconst_5
		// @01AC: newarray int[]
		// @01AE: dup
		// @01AF: iconst_0
		// @01B0: iconst_0
		// @01B1: iastore
		// @01B2: dup
		// @01B3: iconst_1
		// @01B4: sipush 2960 (0x0B90)
		// @01B7: iastore
		// @01B8: dup
		// @01B9: iconst_2
		// @01BA: iconst_0
		// @01BB: iastore
		// @01BC: dup
		// @01BD: iconst_3
		// @01BE: bipush 104 (0x68)
		// @01C0: iastore
		// @01C1: dup
		// @01C2: iconst_4
		// @01C3: iconst_0
		// @01C4: iastore
		// @01C5: aastore
		// @01C6: aload_0
		// @01C7: bipush 14 (0x0E)
		// @01C9: iconst_5
		// @01CA: newarray int[]
		// @01CC: dup
		// @01CD: iconst_0
		// @01CE: sipush 9621 (0x2595)
		// @01D1: iastore
		// @01D2: dup
		// @01D3: iconst_1
		// @01D4: sipush -2590 (0xF5E2)
		// @01D7: iastore
		// @01D8: dup
		// @01D9: iconst_2
		// @01DA: sipush 2960 (0x0B90)
		// @01DD: iastore
		// @01DE: dup
		// @01DF: iconst_3
		// @01E0: sipush -989 (0xFC23)
		// @01E3: iastore
		// @01E4: dup
		// @01E5: iconst_4
		// @01E6: iconst_0
		// @01E7: iastore
		// @01E8: aastore
		// @01E9: aload_0
		// @01EA: bipush 13 (0x0D)
		// @01EC: iconst_5
		// @01ED: newarray int[]
		// @01EF: dup
		// @01F0: iconst_0
		// @01F1: sipush 2220 (0x08AC)
		// @01F4: iastore
		// @01F5: dup
		// @01F6: iconst_1
		// @01F7: sipush 5550 (0x15AE)
		// @01FA: iastore
		// @01FB: dup
		// @01FC: iconst_2
		// @01FD: sipush 3700 (0x0E74)
		// @0200: iastore
		// @0201: dup
		// @0202: iconst_3
		// @0203: sipush -208 (0xFF30)
		// @0206: iastore
		// @0207: dup
		// @0208: iconst_4
		// @0209: sipush -208 (0xFF30)
		// @020C: iastore
		// @020D: aastore
		// @020E: aload_0
		// @020F: bipush 23 (0x17)
		// @0211: iconst_5
		// @0212: newarray int[]
		// @0214: dup
		// @0215: iconst_0
		// @0216: iconst_0
		// @0217: iastore
		// @0218: dup
		// @0219: iconst_1
		// @021A: iconst_0
		// @021B: iastore
		// @021C: dup
		// @021D: iconst_2
		// @021E: iconst_0
		// @021F: iastore
		// @0220: dup
		// @0221: iconst_3
		// @0222: iconst_0
		// @0223: iastore
		// @0224: dup
		// @0225: iconst_4
		// @0226: iconst_0
		// @0227: iastore
		// @0228: aastore
		// @0229: aload_0
		// @022A: bipush 18 (0x12)
		// @022C: iconst_5
		// @022D: newarray int[]
		// @022F: dup
		// @0230: iconst_0
		// @0231: sipush -8511 (0xDEC1)
		// @0234: iastore
		// @0235: dup
		// @0236: iconst_1
		// @0237: sipush 5921 (0x1721)
		// @023A: iastore
		// @023B: dup
		// @023C: iconst_2
		// @023D: iconst_0
		// @023E: iastore
		// @023F: dup
		// @0240: iconst_3
		// @0241: iconst_0
		// @0242: iastore
		// @0243: dup
		// @0244: iconst_4
		// @0245: sipush -572 (0xFDC4)
		// @0248: iastore
		// @0249: aastore
		// @024A: aload_0
		// @024B: iconst_3
		// @024C: iconst_5
		// @024D: newarray int[]
		// @024F: dup
		// @0250: iconst_0
		// @0251: iconst_0
		// @0252: iastore
		// @0253: dup
		// @0254: iconst_1
		// @0255: sipush 3330 (0x0D02)
		// @0258: iastore
		// @0259: dup
		// @025A: iconst_2
		// @025B: iconst_0
		// @025C: iastore
		// @025D: dup
		// @025E: iconst_3
		// @025F: iconst_0
		// @0260: iastore
		// @0261: dup
		// @0262: iconst_4
		// @0263: iconst_0
		// @0264: iastore
		// @0265: aastore
		// @0266: aload_0
		// @0267: bipush 16 (0x10)
		// @0269: iconst_5
		// @026A: newarray int[]
		// @026C: dup
		// @026D: iconst_0
		// @026E: sipush -6291 (0xE76D)
		// @0271: iastore
		// @0272: dup
		// @0273: iconst_1
		// @0274: sipush 4810 (0x12CA)
		// @0277: iastore
		// @0278: dup
		// @0279: iconst_2
		// @027A: sipush -2220 (0xF754)
		// @027D: iastore
		// @027E: dup
		// @027F: iconst_3
		// @0280: sipush -416 (0xFE60)
		// @0283: iastore
		// @0284: dup
		// @0285: iconst_4
		// @0286: iconst_0
		// @0287: iastore
		// @0288: aastore
		// @0289: aload_0
		// @028A: bipush 10 (0x0A)
		// @028C: iconst_5
		// @028D: newarray int[]
		// @028F: dup
		// @0290: iconst_0
		// @0291: iconst_0
		// @0292: iastore
		// @0293: dup
		// @0294: iconst_1
		// @0295: sipush 5921 (0x1721)
		// @0298: iastore
		// @0299: dup
		// @029A: iconst_2
		// @029B: sipush -5550 (0xEA52)
		// @029E: iastore
		// @029F: dup
		// @02A0: iconst_3
		// @02A1: bipush -104 (0x98)
		// @02A3: iastore
		// @02A4: dup
		// @02A5: iconst_4
		// @02A6: sipush 729 (0x02D9)
		// @02A9: iastore
		// @02AA: aastore
		// @02AB: aload_0
		// @02AC: iconst_1
		// @02AD: iconst_5
		// @02AE: newarray int[]
		// @02B0: dup
		// @02B1: iconst_0
		// @02B2: iconst_0
		// @02B3: iastore
		// @02B4: dup
		// @02B5: iconst_1
		// @02B6: sipush 2960 (0x0B90)
		// @02B9: iastore
		// @02BA: dup
		// @02BB: iconst_2
		// @02BC: iconst_0
		// @02BD: iastore
		// @02BE: dup
		// @02BF: iconst_3
		// @02C0: iconst_0
		// @02C1: iastore
		// @02C2: dup
		// @02C3: iconst_4
		// @02C4: iconst_0
		// @02C5: iastore
		// @02C6: aastore
		// @02C7: aload_0
		// @02C8: iconst_4
		// @02C9: iconst_5
		// @02CA: newarray int[]
		// @02CC: dup
		// @02CD: iconst_0
		// @02CE: iconst_0
		// @02CF: iastore
		// @02D0: dup
		// @02D1: iconst_1
		// @02D2: sipush 1850 (0x073A)
		// @02D5: iastore
		// @02D6: dup
		// @02D7: iconst_2
		// @02D8: iconst_0
		// @02D9: iastore
		// @02DA: dup
		// @02DB: iconst_3
		// @02DC: iconst_0
		// @02DD: iastore
		// @02DE: dup
		// @02DF: iconst_4
		// @02E0: iconst_0
		// @02E1: iastore
		// @02E2: aastore
		// @02E3: aload_0
		// @02E4: bipush 9 (0x09)
		// @02E6: iconst_5
		// @02E7: newarray int[]
		// @02E9: dup
		// @02EA: iconst_0
		// @02EB: iconst_0
		// @02EC: iastore
		// @02ED: dup
		// @02EE: iconst_1
		// @02EF: sipush 2960 (0x0B90)
		// @02F2: iastore
		// @02F3: dup
		// @02F4: iconst_2
		// @02F5: sipush -2960 (0xF470)
		// @02F8: iastore
		// @02F9: dup
		// @02FA: iconst_3
		// @02FB: iconst_0
		// @02FC: iastore
		// @02FD: dup
		// @02FE: iconst_4
		// @02FF: sipush 416 (0x01A0)
		// @0302: iastore
		// @0303: aastore
		// @0304: aload_0
		// @0305: bipush 21 (0x15)
		// @0307: iconst_5
		// @0308: newarray int[]
		// @030A: dup
		// @030B: iconst_0
		// @030C: iconst_0
		// @030D: iastore
		// @030E: dup
		// @030F: iconst_1
		// @0310: iconst_0
		// @0311: iastore
		// @0312: dup
		// @0313: iconst_2
		// @0314: iconst_0
		// @0315: iastore
		// @0316: dup
		// @0317: iconst_3
		// @0318: iconst_0
		// @0319: iastore
		// @031A: dup
		// @031B: iconst_4
		// @031C: iconst_0
		// @031D: iastore
		// @031E: aastore
		// @031F: aload_0
		// @0320: bipush 19 (0x13)
		// @0322: iconst_5
		// @0323: newarray int[]
		// @0325: dup
		// @0326: iconst_0
		// @0327: sipush -8511 (0xDEC1)
		// @032A: iastore
		// @032B: dup
		// @032C: iconst_1
		// @032D: sipush 5921 (0x1721)
		// @0330: iastore
		// @0331: dup
		// @0332: iconst_2
		// @0333: iconst_0
		// @0334: iastore
		// @0335: dup
		// @0336: iconst_3
		// @0337: iconst_0
		// @0338: iastore
		// @0339: dup
		// @033A: iconst_4
		// @033B: sipush -572 (0xFDC4)
		// @033E: iastore
		// @033F: aastore
		// @0340: aload_0
		// @0341: bipush 6 (0x06)
		// @0343: iconst_5
		// @0344: newarray int[]
		// @0346: dup
		// @0347: iconst_0
		// @0348: iconst_0
		// @0349: iastore
		// @034A: dup
		// @034B: iconst_1
		// @034C: iconst_0
		// @034D: iastore
		// @034E: dup
		// @034F: iconst_2
		// @0350: iconst_0
		// @0351: iastore
		// @0352: dup
		// @0353: iconst_3
		// @0354: iconst_0
		// @0355: iastore
		// @0356: dup
		// @0357: iconst_4
		// @0358: iconst_0
		// @0359: iastore
		// @035A: aastore
		// @035B: aload_0
		// @035C: bipush 7 (0x07)
		// @035E: iconst_5
		// @035F: newarray int[]
		// @0361: dup
		// @0362: iconst_0
		// @0363: iconst_0
		// @0364: iastore
		// @0365: dup
		// @0366: iconst_1
		// @0367: iconst_0
		// @0368: iastore
		// @0369: dup
		// @036A: iconst_2
		// @036B: iconst_0
		// @036C: iastore
		// @036D: dup
		// @036E: iconst_3
		// @036F: iconst_0
		// @0370: iastore
		// @0371: dup
		// @0372: iconst_4
		// @0373: iconst_0
		// @0374: iastore
		// @0375: aastore
		// @0376: aload_0
		// @0377: bipush 8 (0x08)
		// @0379: iconst_5
		// @037A: newarray int[]
		// @037C: dup
		// @037D: iconst_0
		// @037E: iconst_0
		// @037F: iastore
		// @0380: dup
		// @0381: iconst_1
		// @0382: iconst_0
		// @0383: iastore
		// @0384: dup
		// @0385: iconst_2
		// @0386: iconst_0
		// @0387: iastore
		// @0388: dup
		// @0389: iconst_3
		// @038A: iconst_0
		// @038B: iastore
		// @038C: dup
		// @038D: iconst_4
		// @038E: iconst_0
		// @038F: iastore
		// @0390: aastore
		// @0391: aload_0
		// @0392: iconst_5
		// @0393: iconst_5
		// @0394: newarray int[]
		// @0396: dup
		// @0397: iconst_0
		// @0398: iconst_0
		// @0399: iastore
		// @039A: dup
		// @039B: iconst_1
		// @039C: iconst_0
		// @039D: iastore
		// @039E: dup
		// @039F: iconst_2
		// @03A0: iconst_0
		// @03A1: iastore
		// @03A2: dup
		// @03A3: iconst_3
		// @03A4: iconst_0
		// @03A5: iastore
		// @03A6: dup
		// @03A7: iconst_4
		// @03A8: iconst_0
		// @03A9: iastore
		// @03AA: aastore
		// @03AB: aload_0
		// @03AC: iconst_0
		// @03AD: iconst_5
		// @03AE: newarray int[]
		// @03B0: dup
		// @03B1: iconst_0
		// @03B2: iconst_0
		// @03B3: iastore
		// @03B4: dup
		// @03B5: iconst_1
		// @03B6: sipush 1850 (0x073A)
		// @03B9: iastore
		// @03BA: dup
		// @03BB: iconst_2
		// @03BC: iconst_0
		// @03BD: iastore
		// @03BE: dup
		// @03BF: iconst_3
		// @03C0: iconst_0
		// @03C1: iastore
		// @03C2: dup
		// @03C3: iconst_4
		// @03C4: iconst_0
		// @03C5: iastore
		// @03C6: aastore
		// @03C7: aload_0
		// @03C8: bipush 17 (0x11)
		// @03CA: iconst_5
		// @03CB: newarray int[]
		// @03CD: dup
		// @03CE: iconst_0
		// @03CF: sipush -8511 (0xDEC1)
		// @03D2: iastore
		// @03D3: dup
		// @03D4: iconst_1
		// @03D5: sipush 5180 (0x143C)
		// @03D8: iastore
		// @03D9: dup
		// @03DA: iconst_2
		// @03DB: iconst_0
		// @03DC: iastore
		// @03DD: dup
		// @03DE: iconst_3
		// @03DF: iconst_0
		// @03E0: iastore
		// @03E1: dup
		// @03E2: iconst_4
		// @03E3: sipush -572 (0xFDC4)
		// @03E6: iastore
		// @03E7: aastore
		// @03E8: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @03EB: iconst_1
		// @03EC: aaload
		// @03ED: astore_0
		// @03EE: aload_0
		// @03EF: iconst_2
		// @03F0: bipush 13 (0x0D)
		// @03F2: newarray int[]
		// @03F4: dup
		// @03F5: iconst_0
		// @03F6: sipush 1850 (0x073A)
		// @03F9: iastore
		// @03FA: dup
		// @03FB: iconst_1
		// @03FC: sipush -2590 (0xF5E2)
		// @03FF: iastore
		// @0400: dup
		// @0401: iconst_2
		// @0402: iconst_0
		// @0403: iastore
		// @0404: dup
		// @0405: iconst_3
		// @0406: sipush -740 (0xFD1C)
		// @0409: iastore
		// @040A: dup
		// @040B: iconst_4
		// @040C: sipush 1110 (0x0456)
		// @040F: iastore
		// @0410: dup
		// @0411: iconst_5
		// @0412: sipush 5921 (0x1721)
		// @0415: iastore
		// @0416: dup
		// @0417: bipush 6 (0x06)
		// @0419: sipush 11471 (0x2CCF)
		// @041C: iastore
		// @041D: dup
		// @041E: bipush 7 (0x07)
		// @0420: sipush 740 (0x02E4)
		// @0423: iastore
		// @0424: dup
		// @0425: bipush 8 (0x08)
		// @0427: sipush 3700 (0x0E74)
		// @042A: iastore
		// @042B: dup
		// @042C: bipush 9 (0x09)
		// @042E: iconst_0
		// @042F: iastore
		// @0430: dup
		// @0431: bipush 10 (0x0A)
		// @0433: sipush 1110 (0x0456)
		// @0436: iastore
		// @0437: dup
		// @0438: bipush 11 (0x0B)
		// @043A: sipush 677 (0x02A5)
		// @043D: iastore
		// @043E: dup
		// @043F: bipush 12 (0x0C)
		// @0441: sipush -1145 (0xFB87)
		// @0444: iastore
		// @0445: aastore
		// @0446: aload_0
		// @0447: bipush 18 (0x12)
		// @0449: bipush 13 (0x0D)
		// @044B: newarray int[]
		// @044D: dup
		// @044E: iconst_0
		// @044F: sipush -2220 (0xF754)
		// @0452: iastore
		// @0453: dup
		// @0454: iconst_1
		// @0455: sipush 9991 (0x2707)
		// @0458: iastore
		// @0459: dup
		// @045A: iconst_2
		// @045B: sipush -3330 (0xF2FE)
		// @045E: iastore
		// @045F: dup
		// @0460: iconst_3
		// @0461: sipush -10731 (0xD615)
		// @0464: iastore
		// @0465: dup
		// @0466: iconst_4
		// @0467: sipush -5921 (0xE8DF)
		// @046A: iastore
		// @046B: dup
		// @046C: iconst_5
		// @046D: sipush 1110 (0x0456)
		// @0470: iastore
		// @0471: dup
		// @0472: bipush 6 (0x06)
		// @0474: sipush -8881 (0xDD4F)
		// @0477: iastore
		// @0478: dup
		// @0479: bipush 7 (0x07)
		// @047B: sipush -8881 (0xDD4F)
		// @047E: iastore
		// @047F: dup
		// @0480: bipush 8 (0x08)
		// @0482: sipush -14432 (0xC7A0)
		// @0485: iastore
		// @0486: dup
		// @0487: bipush 9 (0x09)
		// @0489: sipush -1110 (0xFBAA)
		// @048C: iastore
		// @048D: dup
		// @048E: bipush 10 (0x0A)
		// @0490: iconst_0
		// @0491: iastore
		// @0492: dup
		// @0493: bipush 11 (0x0B)
		// @0495: sipush -364 (0xFE94)
		// @0498: iastore
		// @0499: dup
		// @049A: bipush 12 (0x0C)
		// @049C: bipush 104 (0x68)
		// @049E: iastore
		// @049F: aastore
		// @04A0: aload_0
		// @04A1: iconst_3
		// @04A2: bipush 13 (0x0D)
		// @04A4: newarray int[]
		// @04A6: dup
		// @04A7: iconst_0
		// @04A8: sipush 5180 (0x143C)
		// @04AB: iastore
		// @04AC: dup
		// @04AD: iconst_1
		// @04AE: sipush 2220 (0x08AC)
		// @04B1: iastore
		// @04B2: dup
		// @04B3: iconst_2
		// @04B4: iconst_0
		// @04B5: iastore
		// @04B6: dup
		// @04B7: iconst_3
		// @04B8: iconst_0
		// @04B9: iastore
		// @04BA: dup
		// @04BB: iconst_4
		// @04BC: iconst_0
		// @04BD: iastore
		// @04BE: dup
		// @04BF: iconst_5
		// @04C0: sipush 9621 (0x2595)
		// @04C3: iastore
		// @04C4: dup
		// @04C5: bipush 6 (0x06)
		// @04C7: sipush 4440 (0x1158)
		// @04CA: iastore
		// @04CB: dup
		// @04CC: bipush 7 (0x07)
		// @04CE: sipush 1480 (0x05C8)
		// @04D1: iastore
		// @04D2: dup
		// @04D3: bipush 8 (0x08)
		// @04D5: sipush -7771 (0xE1A5)
		// @04D8: iastore
		// @04D9: dup
		// @04DA: bipush 9 (0x09)
		// @04DC: sipush 12952 (0x3298)
		// @04DF: iastore
		// @04E0: dup
		// @04E1: bipush 10 (0x0A)
		// @04E3: sipush 740 (0x02E4)
		// @04E6: iastore
		// @04E7: dup
		// @04E8: bipush 11 (0x0B)
		// @04EA: sipush 729 (0x02D9)
		// @04ED: iastore
		// @04EE: dup
		// @04EF: bipush 12 (0x0C)
		// @04F1: sipush -885 (0xFC8B)
		// @04F4: iastore
		// @04F5: aastore
		// @04F6: aload_0
		// @04F7: bipush 21 (0x15)
		// @04F9: bipush 13 (0x0D)
		// @04FB: newarray int[]
		// @04FD: dup
		// @04FE: iconst_0
		// @04FF: sipush 1480 (0x05C8)
		// @0502: iastore
		// @0503: dup
		// @0504: iconst_1
		// @0505: sipush -9251 (0xDBDD)
		// @0508: iastore
		// @0509: dup
		// @050A: iconst_2
		// @050B: sipush -7031 (0xE489)
		// @050E: iastore
		// @050F: dup
		// @0510: iconst_3
		// @0511: sipush -11471 (0xD331)
		// @0514: iastore
		// @0515: dup
		// @0516: iconst_4
		// @0517: sipush -5550 (0xEA52)
		// @051A: iastore
		// @051B: dup
		// @051C: iconst_5
		// @051D: sipush -2220 (0xF754)
		// @0520: iastore
		// @0521: dup
		// @0522: bipush 6 (0x06)
		// @0524: sipush 5921 (0x1721)
		// @0527: iastore
		// @0528: dup
		// @0529: bipush 7 (0x07)
		// @052B: sipush -10361 (0xD787)
		// @052E: iastore
		// @052F: dup
		// @0530: bipush 8 (0x08)
		// @0532: sipush -5921 (0xE8DF)
		// @0535: iastore
		// @0536: dup
		// @0537: bipush 9 (0x09)
		// @0539: sipush -6291 (0xE76D)
		// @053C: iastore
		// @053D: dup
		// @053E: bipush 10 (0x0A)
		// @0540: iconst_0
		// @0541: iastore
		// @0542: dup
		// @0543: bipush 11 (0x0B)
		// @0545: bipush 104 (0x68)
		// @0547: iastore
		// @0548: dup
		// @0549: bipush 12 (0x0C)
		// @054B: sipush -937 (0xFC57)
		// @054E: iastore
		// @054F: aastore
		// @0550: aload_0
		// @0551: iconst_0
		// @0552: bipush 13 (0x0D)
		// @0554: newarray int[]
		// @0556: dup
		// @0557: iconst_0
		// @0558: iconst_0
		// @0559: iastore
		// @055A: dup
		// @055B: iconst_1
		// @055C: iconst_0
		// @055D: iastore
		// @055E: dup
		// @055F: iconst_2
		// @0560: iconst_0
		// @0561: iastore
		// @0562: dup
		// @0563: iconst_3
		// @0564: iconst_0
		// @0565: iastore
		// @0566: dup
		// @0567: iconst_4
		// @0568: iconst_0
		// @0569: iastore
		// @056A: dup
		// @056B: iconst_5
		// @056C: sipush 2960 (0x0B90)
		// @056F: iastore
		// @0570: dup
		// @0571: bipush 6 (0x06)
		// @0573: sipush 5921 (0x1721)
		// @0576: iastore
		// @0577: dup
		// @0578: bipush 7 (0x07)
		// @057A: sipush -740 (0xFD1C)
		// @057D: iastore
		// @057E: dup
		// @057F: bipush 8 (0x08)
		// @0581: iconst_0
		// @0582: iastore
		// @0583: dup
		// @0584: bipush 9 (0x09)
		// @0586: iconst_0
		// @0587: iastore
		// @0588: dup
		// @0589: bipush 10 (0x0A)
		// @058B: iconst_0
		// @058C: iastore
		// @058D: dup
		// @058E: bipush 11 (0x0B)
		// @0590: bipush 104 (0x68)
		// @0592: iastore
		// @0593: dup
		// @0594: bipush 12 (0x0C)
		// @0596: sipush -1145 (0xFB87)
		// @0599: iastore
		// @059A: aastore
		// @059B: aload_0
		// @059C: bipush 14 (0x0E)
		// @059E: bipush 13 (0x0D)
		// @05A0: newarray int[]
		// @05A2: dup
		// @05A3: iconst_0
		// @05A4: iconst_0
		// @05A5: iastore
		// @05A6: dup
		// @05A7: iconst_1
		// @05A8: sipush 11101 (0x2B5D)
		// @05AB: iastore
		// @05AC: dup
		// @05AD: iconst_2
		// @05AE: sipush 4810 (0x12CA)
		// @05B1: iastore
		// @05B2: dup
		// @05B3: iconst_3
		// @05B4: sipush -8511 (0xDEC1)
		// @05B7: iastore
		// @05B8: dup
		// @05B9: iconst_4
		// @05BA: sipush 17392 (0x43F0)
		// @05BD: iastore
		// @05BE: dup
		// @05BF: iconst_5
		// @05C0: sipush -1110 (0xFBAA)
		// @05C3: iastore
		// @05C4: dup
		// @05C5: bipush 6 (0x06)
		// @05C7: sipush 12582 (0x3126)
		// @05CA: iastore
		// @05CB: dup
		// @05CC: bipush 7 (0x07)
		// @05CE: sipush 5921 (0x1721)
		// @05D1: iastore
		// @05D2: dup
		// @05D3: bipush 8 (0x08)
		// @05D5: sipush -10361 (0xD787)
		// @05D8: iastore
		// @05D9: dup
		// @05DA: bipush 9 (0x09)
		// @05DC: sipush 16652 (0x410C)
		// @05DF: iastore
		// @05E0: dup
		// @05E1: bipush 10 (0x0A)
		// @05E3: sipush -2960 (0xF470)
		// @05E6: iastore
		// @05E7: dup
		// @05E8: bipush 11 (0x0B)
		// @05EA: sipush -1979 (0xF845)
		// @05ED: iastore
		// @05EE: dup
		// @05EF: bipush 12 (0x0C)
		// @05F1: sipush 1562 (0x061A)
		// @05F4: iastore
		// @05F5: aastore
		// @05F6: aload_0
		// @05F7: bipush 15 (0x0F)
		// @05F9: bipush 13 (0x0D)
		// @05FB: newarray int[]
		// @05FD: dup
		// @05FE: iconst_0
		// @05FF: sipush 5180 (0x143C)
		// @0602: iastore
		// @0603: dup
		// @0604: iconst_1
		// @0605: sipush -1110 (0xFBAA)
		// @0608: iastore
		// @0609: dup
		// @060A: iconst_2
		// @060B: iconst_0
		// @060C: iastore
		// @060D: dup
		// @060E: iconst_3
		// @060F: sipush -4070 (0xF01A)
		// @0612: iastore
		// @0613: dup
		// @0614: iconst_4
		// @0615: sipush 3000 (0x0BB8)
		// @0618: iastore
		// @0619: dup
		// @061A: iconst_5
		// @061B: sipush 6661 (0x1A05)
		// @061E: iastore
		// @061F: dup
		// @0620: bipush 6 (0x06)
		// @0622: iconst_0
		// @0623: iastore
		// @0624: dup
		// @0625: bipush 7 (0x07)
		// @0627: sipush 5000 (0x1388)
		// @062A: iastore
		// @062B: dup
		// @062C: bipush 8 (0x08)
		// @062E: sipush -3330 (0xF2FE)
		// @0631: iastore
		// @0632: dup
		// @0633: bipush 9 (0x09)
		// @0635: sipush 6000 (0x1770)
		// @0638: iastore
		// @0639: dup
		// @063A: bipush 10 (0x0A)
		// @063C: sipush 740 (0x02E4)
		// @063F: iastore
		// @0640: dup
		// @0641: bipush 11 (0x0B)
		// @0643: sipush -1510 (0xFA1A)
		// @0646: iastore
		// @0647: dup
		// @0648: bipush 12 (0x0C)
		// @064A: bipush -104 (0x98)
		// @064C: iastore
		// @064D: aastore
		// @064E: aload_0
		// @064F: bipush 20 (0x14)
		// @0651: bipush 13 (0x0D)
		// @0653: newarray int[]
		// @0655: dup
		// @0656: iconst_0
		// @0657: sipush 2220 (0x08AC)
		// @065A: iastore
		// @065B: dup
		// @065C: iconst_1
		// @065D: sipush 3700 (0x0E74)
		// @0660: iastore
		// @0661: dup
		// @0662: iconst_2
		// @0663: sipush 2960 (0x0B90)
		// @0666: iastore
		// @0667: dup
		// @0668: iconst_3
		// @0669: sipush -10731 (0xD615)
		// @066C: iastore
		// @066D: dup
		// @066E: iconst_4
		// @066F: sipush 17392 (0x43F0)
		// @0672: iastore
		// @0673: dup
		// @0674: iconst_5
		// @0675: sipush -1480 (0xFA38)
		// @0678: iastore
		// @0679: dup
		// @067A: bipush 6 (0x06)
		// @067C: sipush 1850 (0x073A)
		// @067F: iastore
		// @0680: dup
		// @0681: bipush 7 (0x07)
		// @0683: sipush -7771 (0xE1A5)
		// @0686: iastore
		// @0687: dup
		// @0688: bipush 8 (0x08)
		// @068A: sipush -12212 (0xD04C)
		// @068D: iastore
		// @068E: dup
		// @068F: bipush 9 (0x09)
		// @0691: sipush -7401 (0xE317)
		// @0694: iastore
		// @0695: dup
		// @0696: bipush 10 (0x0A)
		// @0698: sipush 1850 (0x073A)
		// @069B: iastore
		// @069C: dup
		// @069D: bipush 11 (0x0B)
		// @069F: sipush -364 (0xFE94)
		// @06A2: iastore
		// @06A3: dup
		// @06A4: bipush 12 (0x0C)
		// @06A6: sipush -520 (0xFDF8)
		// @06A9: iastore
		// @06AA: aastore
		// @06AB: aload_0
		// @06AC: bipush 22 (0x16)
		// @06AE: bipush 13 (0x0D)
		// @06B0: newarray int[]
		// @06B2: dup
		// @06B3: iconst_0
		// @06B4: sipush -1850 (0xF8C6)
		// @06B7: iastore
		// @06B8: dup
		// @06B9: iconst_1
		// @06BA: sipush -11471 (0xD331)
		// @06BD: iastore
		// @06BE: dup
		// @06BF: iconst_2
		// @06C0: sipush -6661 (0xE5FB)
		// @06C3: iastore
		// @06C4: dup
		// @06C5: iconst_3
		// @06C6: sipush -16282 (0xC066)
		// @06C9: iastore
		// @06CA: dup
		// @06CB: iconst_4
		// @06CC: iconst_0
		// @06CD: iastore
		// @06CE: dup
		// @06CF: iconst_5
		// @06D0: sipush -1850 (0xF8C6)
		// @06D3: iastore
		// @06D4: dup
		// @06D5: bipush 6 (0x06)
		// @06D7: sipush 8511 (0x213F)
		// @06DA: iastore
		// @06DB: dup
		// @06DC: bipush 7 (0x07)
		// @06DE: sipush -2590 (0xF5E2)
		// @06E1: iastore
		// @06E2: dup
		// @06E3: bipush 8 (0x08)
		// @06E5: sipush -14432 (0xC7A0)
		// @06E8: iastore
		// @06E9: dup
		// @06EA: bipush 9 (0x09)
		// @06EC: sipush -2960 (0xF470)
		// @06EF: iastore
		// @06F0: dup
		// @06F1: bipush 10 (0x0A)
		// @06F3: iconst_0
		// @06F4: iastore
		// @06F5: dup
		// @06F6: bipush 11 (0x0B)
		// @06F8: iconst_0
		// @06F9: iastore
		// @06FA: dup
		// @06FB: bipush 12 (0x0C)
		// @06FD: sipush -781 (0xFCF3)
		// @0700: iastore
		// @0701: aastore
		// @0702: aload_0
		// @0703: iconst_4
		// @0704: bipush 13 (0x0D)
		// @0706: newarray int[]
		// @0708: dup
		// @0709: iconst_0
		// @070A: sipush 3700 (0x0E74)
		// @070D: iastore
		// @070E: dup
		// @070F: iconst_1
		// @0710: sipush 6291 (0x1893)
		// @0713: iastore
		// @0714: dup
		// @0715: iconst_2
		// @0716: sipush 740 (0x02E4)
		// @0719: iastore
		// @071A: dup
		// @071B: iconst_3
		// @071C: sipush -740 (0xFD1C)
		// @071F: iastore
		// @0720: dup
		// @0721: iconst_4
		// @0722: iconst_0
		// @0723: iastore
		// @0724: dup
		// @0725: iconst_5
		// @0726: iconst_0
		// @0727: iastore
		// @0728: dup
		// @0729: bipush 6 (0x06)
		// @072B: sipush -6291 (0xE76D)
		// @072E: iastore
		// @072F: dup
		// @0730: bipush 7 (0x07)
		// @0732: sipush -740 (0xFD1C)
		// @0735: iastore
		// @0736: dup
		// @0737: bipush 8 (0x08)
		// @0739: sipush -4810 (0xED36)
		// @073C: iastore
		// @073D: dup
		// @073E: bipush 9 (0x09)
		// @0740: sipush -2960 (0xF470)
		// @0743: iastore
		// @0744: dup
		// @0745: bipush 10 (0x0A)
		// @0747: iconst_0
		// @0748: iastore
		// @0749: dup
		// @074A: bipush 11 (0x0B)
		// @074C: sipush 156 (0x009C)
		// @074F: iastore
		// @0750: dup
		// @0751: bipush 12 (0x0C)
		// @0753: sipush -989 (0xFC23)
		// @0756: iastore
		// @0757: aastore
		// @0758: aload_0
		// @0759: iconst_5
		// @075A: bipush 13 (0x0D)
		// @075C: newarray int[]
		// @075E: dup
		// @075F: iconst_0
		// @0760: sipush 5550 (0x15AE)
		// @0763: iastore
		// @0764: dup
		// @0765: iconst_1
		// @0766: sipush 11101 (0x2B5D)
		// @0769: iastore
		// @076A: dup
		// @076B: iconst_2
		// @076C: iconst_0
		// @076D: iastore
		// @076E: dup
		// @076F: iconst_3
		// @0770: sipush 4070 (0x0FE6)
		// @0773: iastore
		// @0774: dup
		// @0775: iconst_4
		// @0776: sipush 740 (0x02E4)
		// @0779: iastore
		// @077A: dup
		// @077B: iconst_5
		// @077C: iconst_0
		// @077D: iastore
		// @077E: dup
		// @077F: bipush 6 (0x06)
		// @0781: sipush -3330 (0xF2FE)
		// @0784: iastore
		// @0785: dup
		// @0786: bipush 7 (0x07)
		// @0788: sipush 740 (0x02E4)
		// @078B: iastore
		// @078C: dup
		// @078D: bipush 8 (0x08)
		// @078F: iconst_0
		// @0790: iastore
		// @0791: dup
		// @0792: bipush 9 (0x09)
		// @0794: iconst_0
		// @0795: iastore
		// @0796: dup
		// @0797: bipush 10 (0x0A)
		// @0799: sipush 1110 (0x0456)
		// @079C: iastore
		// @079D: dup
		// @079E: bipush 11 (0x0B)
		// @07A0: sipush 520 (0x0208)
		// @07A3: iastore
		// @07A4: dup
		// @07A5: bipush 12 (0x0C)
		// @07A7: sipush -885 (0xFC8B)
		// @07AA: iastore
		// @07AB: aastore
		// @07AC: aload_0
		// @07AD: bipush 11 (0x0B)
		// @07AF: bipush 13 (0x0D)
		// @07B1: newarray int[]
		// @07B3: dup
		// @07B4: iconst_0
		// @07B5: sipush 1480 (0x05C8)
		// @07B8: iastore
		// @07B9: dup
		// @07BA: iconst_1
		// @07BB: sipush 7771 (0x1E5B)
		// @07BE: iastore
		// @07BF: dup
		// @07C0: iconst_2
		// @07C1: iconst_0
		// @07C2: iastore
		// @07C3: dup
		// @07C4: iconst_3
		// @07C5: iconst_0
		// @07C6: iastore
		// @07C7: dup
		// @07C8: iconst_4
		// @07C9: iconst_0
		// @07CA: iastore
		// @07CB: dup
		// @07CC: iconst_5
		// @07CD: sipush 1480 (0x05C8)
		// @07D0: iastore
		// @07D1: dup
		// @07D2: bipush 6 (0x06)
		// @07D4: sipush 7401 (0x1CE9)
		// @07D7: iastore
		// @07D8: dup
		// @07D9: bipush 7 (0x07)
		// @07DB: sipush 1110 (0x0456)
		// @07DE: iastore
		// @07DF: dup
		// @07E0: bipush 8 (0x08)
		// @07E2: iconst_0
		// @07E3: iastore
		// @07E4: dup
		// @07E5: bipush 9 (0x09)
		// @07E7: iconst_0
		// @07E8: iastore
		// @07E9: dup
		// @07EA: bipush 10 (0x0A)
		// @07EC: sipush 740 (0x02E4)
		// @07EF: iastore
		// @07F0: dup
		// @07F1: bipush 11 (0x0B)
		// @07F3: sipush -156 (0xFF64)
		// @07F6: iastore
		// @07F7: dup
		// @07F8: bipush 12 (0x0C)
		// @07FA: sipush 1302 (0x0516)
		// @07FD: iastore
		// @07FE: aastore
		// @07FF: aload_0
		// @0800: bipush 9 (0x09)
		// @0802: bipush 13 (0x0D)
		// @0804: newarray int[]
		// @0806: dup
		// @0807: iconst_0
		// @0808: sipush 3330 (0x0D02)
		// @080B: iastore
		// @080C: dup
		// @080D: iconst_1
		// @080E: iconst_0
		// @080F: iastore
		// @0810: dup
		// @0811: iconst_2
		// @0812: iconst_0
		// @0813: iastore
		// @0814: dup
		// @0815: iconst_3
		// @0816: iconst_0
		// @0817: iastore
		// @0818: dup
		// @0819: iconst_4
		// @081A: iconst_0
		// @081B: iastore
		// @081C: dup
		// @081D: iconst_5
		// @081E: sipush 1110 (0x0456)
		// @0821: iastore
		// @0822: dup
		// @0823: bipush 6 (0x06)
		// @0825: sipush -2000 (0xF830)
		// @0828: iastore
		// @0829: dup
		// @082A: bipush 7 (0x07)
		// @082C: iconst_0
		// @082D: iastore
		// @082E: dup
		// @082F: bipush 8 (0x08)
		// @0831: iconst_0
		// @0832: iastore
		// @0833: dup
		// @0834: bipush 9 (0x09)
		// @0836: sipush -740 (0xFD1C)
		// @0839: iastore
		// @083A: dup
		// @083B: bipush 10 (0x0A)
		// @083D: sipush 1480 (0x05C8)
		// @0840: iastore
		// @0841: dup
		// @0842: bipush 11 (0x0B)
		// @0844: sipush 572 (0x023C)
		// @0847: iastore
		// @0848: dup
		// @0849: bipush 12 (0x0C)
		// @084B: sipush -416 (0xFE60)
		// @084E: iastore
		// @084F: aastore
		// @0850: aload_0
		// @0851: bipush 16 (0x10)
		// @0853: bipush 13 (0x0D)
		// @0855: newarray int[]
		// @0857: dup
		// @0858: iconst_0
		// @0859: sipush -5000 (0xEC78)
		// @085C: iastore
		// @085D: dup
		// @085E: iconst_1
		// @085F: sipush 3700 (0x0E74)
		// @0862: iastore
		// @0863: dup
		// @0864: iconst_2
		// @0865: sipush -4810 (0xED36)
		// @0868: iastore
		// @0869: dup
		// @086A: iconst_3
		// @086B: sipush -10731 (0xD615)
		// @086E: iastore
		// @086F: dup
		// @0870: iconst_4
		// @0871: iconst_0
		// @0872: iastore
		// @0873: dup
		// @0874: iconst_5
		// @0875: sipush -1480 (0xFA38)
		// @0878: iastore
		// @0879: dup
		// @087A: bipush 6 (0x06)
		// @087C: iconst_0
		// @087D: iastore
		// @087E: dup
		// @087F: bipush 7 (0x07)
		// @0881: sipush -6661 (0xE5FB)
		// @0884: iastore
		// @0885: dup
		// @0886: bipush 8 (0x08)
		// @0888: sipush -8881 (0xDD4F)
		// @088B: iastore
		// @088C: dup
		// @088D: bipush 9 (0x09)
		// @088F: sipush -740 (0xFD1C)
		// @0892: iastore
		// @0893: dup
		// @0894: bipush 10 (0x0A)
		// @0896: sipush -6661 (0xE5FB)
		// @0899: iastore
		// @089A: dup
		// @089B: bipush 11 (0x0B)
		// @089D: sipush -1822 (0xF8E2)
		// @08A0: iastore
		// @08A1: dup
		// @08A2: bipush 12 (0x0C)
		// @08A4: sipush 2500 (0x09C4)
		// @08A7: iastore
		// @08A8: aastore
		// @08A9: aload_0
		// @08AA: bipush 25 (0x19)
		// @08AC: bipush 8 (0x08)
		// @08AE: newarray int[]
		// @08B0: dup
		// @08B1: iconst_0
		// @08B2: bipush 32 (0x20)
		// @08B4: iastore
		// @08B5: dup
		// @08B6: iconst_1
		// @08B7: iconst_5
		// @08B8: iastore
		// @08B9: dup
		// @08BA: iconst_2
		// @08BB: bipush 25 (0x19)
		// @08BD: iastore
		// @08BE: dup
		// @08BF: iconst_3
		// @08C0: bipush 7 (0x07)
		// @08C2: iastore
		// @08C3: dup
		// @08C4: iconst_4
		// @08C5: iconst_3
		// @08C6: iastore
		// @08C7: dup
		// @08C8: iconst_5
		// @08C9: bipush 26 (0x1A)
		// @08CB: iastore
		// @08CC: dup
		// @08CD: bipush 6 (0x06)
		// @08CF: iconst_4
		// @08D0: iastore
		// @08D1: dup
		// @08D2: bipush 7 (0x07)
		// @08D4: bipush 7 (0x07)
		// @08D6: iastore
		// @08D7: aastore
		// @08D8: aload_0
		// @08D9: bipush 7 (0x07)
		// @08DB: bipush 13 (0x0D)
		// @08DD: newarray int[]
		// @08DF: dup
		// @08E0: iconst_0
		// @08E1: sipush -740 (0xFD1C)
		// @08E4: iastore
		// @08E5: dup
		// @08E6: iconst_1
		// @08E7: sipush -7031 (0xE489)
		// @08EA: iastore
		// @08EB: dup
		// @08EC: iconst_2
		// @08ED: sipush 1480 (0x05C8)
		// @08F0: iastore
		// @08F1: dup
		// @08F2: iconst_3
		// @08F3: sipush -5180 (0xEBC4)
		// @08F6: iastore
		// @08F7: dup
		// @08F8: iconst_4
		// @08F9: sipush 12212 (0x2FB4)
		// @08FC: iastore
		// @08FD: dup
		// @08FE: iconst_5
		// @08FF: sipush 1850 (0x073A)
		// @0902: iastore
		// @0903: dup
		// @0904: bipush 6 (0x06)
		// @0906: sipush 3330 (0x0D02)
		// @0909: iastore
		// @090A: dup
		// @090B: bipush 7 (0x07)
		// @090D: iconst_0
		// @090E: iastore
		// @090F: dup
		// @0910: bipush 8 (0x08)
		// @0912: iconst_0
		// @0913: iastore
		// @0914: dup
		// @0915: bipush 9 (0x09)
		// @0917: iconst_0
		// @0918: iastore
		// @0919: dup
		// @091A: bipush 10 (0x0A)
		// @091C: iconst_0
		// @091D: iastore
		// @091E: dup
		// @091F: bipush 11 (0x0B)
		// @0921: iconst_0
		// @0922: iastore
		// @0923: dup
		// @0924: bipush 12 (0x0C)
		// @0926: sipush -1458 (0xFA4E)
		// @0929: iastore
		// @092A: aastore
		// @092B: aload_0
		// @092C: bipush 8 (0x08)
		// @092E: bipush 13 (0x0D)
		// @0930: newarray int[]
		// @0932: dup
		// @0933: iconst_0
		// @0934: iconst_0
		// @0935: iastore
		// @0936: dup
		// @0937: iconst_1
		// @0938: iconst_0
		// @0939: iastore
		// @093A: dup
		// @093B: iconst_2
		// @093C: iconst_0
		// @093D: iastore
		// @093E: dup
		// @093F: iconst_3
		// @0940: iconst_0
		// @0941: iastore
		// @0942: dup
		// @0943: iconst_4
		// @0944: iconst_0
		// @0945: iastore
		// @0946: dup
		// @0947: iconst_5
		// @0948: iconst_0
		// @0949: iastore
		// @094A: dup
		// @094B: bipush 6 (0x06)
		// @094D: iconst_0
		// @094E: iastore
		// @094F: dup
		// @0950: bipush 7 (0x07)
		// @0952: iconst_0
		// @0953: iastore
		// @0954: dup
		// @0955: bipush 8 (0x08)
		// @0957: iconst_0
		// @0958: iastore
		// @0959: dup
		// @095A: bipush 9 (0x09)
		// @095C: iconst_0
		// @095D: iastore
		// @095E: dup
		// @095F: bipush 10 (0x0A)
		// @0961: iconst_0
		// @0962: iastore
		// @0963: dup
		// @0964: bipush 11 (0x0B)
		// @0966: iconst_0
		// @0967: iastore
		// @0968: dup
		// @0969: bipush 12 (0x0C)
		// @096B: iconst_0
		// @096C: iastore
		// @096D: aastore
		// @096E: aload_0
		// @096F: bipush 10 (0x0A)
		// @0971: bipush 13 (0x0D)
		// @0973: newarray int[]
		// @0975: dup
		// @0976: iconst_0
		// @0977: sipush 4000 (0x0FA0)
		// @097A: iastore
		// @097B: dup
		// @097C: iconst_1
		// @097D: sipush -4000 (0xF060)
		// @0980: iastore
		// @0981: dup
		// @0982: iconst_2
		// @0983: iconst_0
		// @0984: iastore
		// @0985: dup
		// @0986: iconst_3
		// @0987: iconst_0
		// @0988: iastore
		// @0989: dup
		// @098A: iconst_4
		// @098B: iconst_0
		// @098C: iastore
		// @098D: dup
		// @098E: iconst_5
		// @098F: sipush 4000 (0x0FA0)
		// @0992: iastore
		// @0993: dup
		// @0994: bipush 6 (0x06)
		// @0996: sipush -4000 (0xF060)
		// @0999: iastore
		// @099A: dup
		// @099B: bipush 7 (0x07)
		// @099D: iconst_0
		// @099E: iastore
		// @099F: dup
		// @09A0: bipush 8 (0x08)
		// @09A2: iconst_0
		// @09A3: iastore
		// @09A4: dup
		// @09A5: bipush 9 (0x09)
		// @09A7: sipush -740 (0xFD1C)
		// @09AA: iastore
		// @09AB: dup
		// @09AC: bipush 10 (0x0A)
		// @09AE: sipush 2960 (0x0B90)
		// @09B1: iastore
		// @09B2: dup
		// @09B3: bipush 11 (0x0B)
		// @09B5: sipush 1041 (0x0411)
		// @09B8: iastore
		// @09B9: dup
		// @09BA: bipush 12 (0x0C)
		// @09BC: sipush -1197 (0xFB53)
		// @09BF: iastore
		// @09C0: aastore
		// @09C1: aload_0
		// @09C2: bipush 17 (0x11)
		// @09C4: bipush 13 (0x0D)
		// @09C6: newarray int[]
		// @09C8: dup
		// @09C9: iconst_0
		// @09CA: sipush -1850 (0xF8C6)
		// @09CD: iastore
		// @09CE: dup
		// @09CF: iconst_1
		// @09D0: sipush 4810 (0x12CA)
		// @09D3: iastore
		// @09D4: dup
		// @09D5: iconst_2
		// @09D6: sipush -6291 (0xE76D)
		// @09D9: iastore
		// @09DA: dup
		// @09DB: iconst_3
		// @09DC: sipush -13692 (0xCA84)
		// @09DF: iastore
		// @09E0: dup
		// @09E1: iconst_4
		// @09E2: sipush -7771 (0xE1A5)
		// @09E5: iastore
		// @09E6: dup
		// @09E7: iconst_5
		// @09E8: sipush 5921 (0x1721)
		// @09EB: iastore
		// @09EC: dup
		// @09ED: bipush 6 (0x06)
		// @09EF: sipush 4810 (0x12CA)
		// @09F2: iastore
		// @09F3: dup
		// @09F4: bipush 7 (0x07)
		// @09F6: iconst_0
		// @09F7: iastore
		// @09F8: dup
		// @09F9: bipush 8 (0x08)
		// @09FB: sipush -12582 (0xCEDA)
		// @09FE: iastore
		// @09FF: dup
		// @0A00: bipush 9 (0x09)
		// @0A02: sipush 12952 (0x3298)
		// @0A05: iastore
		// @0A06: dup
		// @0A07: bipush 10 (0x0A)
		// @0A09: sipush 1110 (0x0456)
		// @0A0C: iastore
		// @0A0D: dup
		// @0A0E: bipush 11 (0x0B)
		// @0A10: bipush -104 (0x98)
		// @0A12: iastore
		// @0A13: dup
		// @0A14: bipush 12 (0x0C)
		// @0A16: sipush -729 (0xFD27)
		// @0A19: iastore
		// @0A1A: aastore
		// @0A1B: aload_0
		// @0A1C: bipush 24 (0x18)
		// @0A1E: bipush 13 (0x0D)
		// @0A20: newarray int[]
		// @0A22: dup
		// @0A23: iconst_0
		// @0A24: iconst_0
		// @0A25: iastore
		// @0A26: dup
		// @0A27: iconst_1
		// @0A28: iconst_0
		// @0A29: iastore
		// @0A2A: dup
		// @0A2B: iconst_2
		// @0A2C: iconst_0
		// @0A2D: iastore
		// @0A2E: dup
		// @0A2F: iconst_3
		// @0A30: iconst_0
		// @0A31: iastore
		// @0A32: dup
		// @0A33: iconst_4
		// @0A34: iconst_0
		// @0A35: iastore
		// @0A36: dup
		// @0A37: iconst_5
		// @0A38: iconst_0
		// @0A39: iastore
		// @0A3A: dup
		// @0A3B: bipush 6 (0x06)
		// @0A3D: iconst_0
		// @0A3E: iastore
		// @0A3F: dup
		// @0A40: bipush 7 (0x07)
		// @0A42: iconst_0
		// @0A43: iastore
		// @0A44: dup
		// @0A45: bipush 8 (0x08)
		// @0A47: iconst_0
		// @0A48: iastore
		// @0A49: dup
		// @0A4A: bipush 9 (0x09)
		// @0A4C: iconst_0
		// @0A4D: iastore
		// @0A4E: dup
		// @0A4F: bipush 10 (0x0A)
		// @0A51: iconst_0
		// @0A52: iastore
		// @0A53: dup
		// @0A54: bipush 11 (0x0B)
		// @0A56: iconst_0
		// @0A57: iastore
		// @0A58: dup
		// @0A59: bipush 12 (0x0C)
		// @0A5B: iconst_0
		// @0A5C: iastore
		// @0A5D: aastore
		// @0A5E: aload_0
		// @0A5F: bipush 13 (0x0D)
		// @0A61: bipush 13 (0x0D)
		// @0A63: newarray int[]
		// @0A65: dup
		// @0A66: iconst_0
		// @0A67: iconst_0
		// @0A68: iastore
		// @0A69: dup
		// @0A6A: iconst_1
		// @0A6B: iconst_0
		// @0A6C: iastore
		// @0A6D: dup
		// @0A6E: iconst_2
		// @0A6F: iconst_0
		// @0A70: iastore
		// @0A71: dup
		// @0A72: iconst_3
		// @0A73: iconst_0
		// @0A74: iastore
		// @0A75: dup
		// @0A76: iconst_4
		// @0A77: iconst_0
		// @0A78: iastore
		// @0A79: dup
		// @0A7A: iconst_5
		// @0A7B: iconst_0
		// @0A7C: iastore
		// @0A7D: dup
		// @0A7E: bipush 6 (0x06)
		// @0A80: iconst_0
		// @0A81: iastore
		// @0A82: dup
		// @0A83: bipush 7 (0x07)
		// @0A85: iconst_0
		// @0A86: iastore
		// @0A87: dup
		// @0A88: bipush 8 (0x08)
		// @0A8A: iconst_0
		// @0A8B: iastore
		// @0A8C: dup
		// @0A8D: bipush 9 (0x09)
		// @0A8F: iconst_0
		// @0A90: iastore
		// @0A91: dup
		// @0A92: bipush 10 (0x0A)
		// @0A94: iconst_0
		// @0A95: iastore
		// @0A96: dup
		// @0A97: bipush 11 (0x0B)
		// @0A99: iconst_0
		// @0A9A: iastore
		// @0A9B: dup
		// @0A9C: bipush 12 (0x0C)
		// @0A9E: iconst_0
		// @0A9F: iastore
		// @0AA0: aastore
		// @0AA1: aload_0
		// @0AA2: iconst_1
		// @0AA3: bipush 13 (0x0D)
		// @0AA5: newarray int[]
		// @0AA7: dup
		// @0AA8: iconst_0
		// @0AA9: sipush -4070 (0xF01A)
		// @0AAC: iastore
		// @0AAD: dup
		// @0AAE: iconst_1
		// @0AAF: sipush -7771 (0xE1A5)
		// @0AB2: iastore
		// @0AB3: dup
		// @0AB4: iconst_2
		// @0AB5: sipush -1480 (0xFA38)
		// @0AB8: iastore
		// @0AB9: dup
		// @0ABA: iconst_3
		// @0ABB: sipush -3330 (0xF2FE)
		// @0ABE: iastore
		// @0ABF: dup
		// @0AC0: iconst_4
		// @0AC1: sipush -1850 (0xF8C6)
		// @0AC4: iastore
		// @0AC5: dup
		// @0AC6: iconst_5
		// @0AC7: sipush 5180 (0x143C)
		// @0ACA: iastore
		// @0ACB: dup
		// @0ACC: bipush 6 (0x06)
		// @0ACE: sipush 6661 (0x1A05)
		// @0AD1: iastore
		// @0AD2: dup
		// @0AD3: bipush 7 (0x07)
		// @0AD5: sipush 740 (0x02E4)
		// @0AD8: iastore
		// @0AD9: dup
		// @0ADA: bipush 8 (0x08)
		// @0ADC: sipush -740 (0xFD1C)
		// @0ADF: iastore
		// @0AE0: dup
		// @0AE1: bipush 9 (0x09)
		// @0AE3: iconst_0
		// @0AE4: iastore
		// @0AE5: dup
		// @0AE6: bipush 10 (0x0A)
		// @0AE8: iconst_0
		// @0AE9: iastore
		// @0AEA: dup
		// @0AEB: bipush 11 (0x0B)
		// @0AED: sipush 416 (0x01A0)
		// @0AF0: iastore
		// @0AF1: dup
		// @0AF2: bipush 12 (0x0C)
		// @0AF4: sipush -1458 (0xFA4E)
		// @0AF7: iastore
		// @0AF8: aastore
		// @0AF9: aload_0
		// @0AFA: bipush 12 (0x0C)
		// @0AFC: bipush 13 (0x0D)
		// @0AFE: newarray int[]
		// @0B00: dup
		// @0B01: iconst_0
		// @0B02: sipush 1500 (0x05DC)
		// @0B05: iastore
		// @0B06: dup
		// @0B07: iconst_1
		// @0B08: sipush 4000 (0x0FA0)
		// @0B0B: iastore
		// @0B0C: dup
		// @0B0D: iconst_2
		// @0B0E: sipush 4000 (0x0FA0)
		// @0B11: iastore
		// @0B12: dup
		// @0B13: iconst_3
		// @0B14: sipush 3000 (0x0BB8)
		// @0B17: iastore
		// @0B18: dup
		// @0B19: iconst_4
		// @0B1A: iconst_0
		// @0B1B: iastore
		// @0B1C: dup
		// @0B1D: iconst_5
		// @0B1E: sipush 1500 (0x05DC)
		// @0B21: iastore
		// @0B22: dup
		// @0B23: bipush 6 (0x06)
		// @0B25: sipush 3500 (0x0DAC)
		// @0B28: iastore
		// @0B29: dup
		// @0B2A: bipush 7 (0x07)
		// @0B2C: sipush 3000 (0x0BB8)
		// @0B2F: iastore
		// @0B30: dup
		// @0B31: bipush 8 (0x08)
		// @0B33: sipush 3500 (0x0DAC)
		// @0B36: iastore
		// @0B37: dup
		// @0B38: bipush 9 (0x09)
		// @0B3A: iconst_0
		// @0B3B: iastore
		// @0B3C: dup
		// @0B3D: bipush 10 (0x0A)
		// @0B3F: sipush -3000 (0xF448)
		// @0B42: iastore
		// @0B43: dup
		// @0B44: bipush 11 (0x0B)
		// @0B46: bipush -100 (0x9C)
		// @0B48: iastore
		// @0B49: dup
		// @0B4A: bipush 12 (0x0C)
		// @0B4C: sipush 2100 (0x0834)
		// @0B4F: iastore
		// @0B50: aastore
		// @0B51: aload_0
		// @0B52: bipush 19 (0x13)
		// @0B54: bipush 13 (0x0D)
		// @0B56: newarray int[]
		// @0B58: dup
		// @0B59: iconst_0
		// @0B5A: sipush -1480 (0xFA38)
		// @0B5D: iastore
		// @0B5E: dup
		// @0B5F: iconst_1
		// @0B60: sipush 8511 (0x213F)
		// @0B63: iastore
		// @0B64: dup
		// @0B65: iconst_2
		// @0B66: sipush -7771 (0xE1A5)
		// @0B69: iastore
		// @0B6A: dup
		// @0B6B: iconst_3
		// @0B6C: sipush -5921 (0xE8DF)
		// @0B6F: iastore
		// @0B70: dup
		// @0B71: iconst_4
		// @0B72: sipush -5921 (0xE8DF)
		// @0B75: iastore
		// @0B76: dup
		// @0B77: iconst_5
		// @0B78: sipush -1850 (0xF8C6)
		// @0B7B: iastore
		// @0B7C: dup
		// @0B7D: bipush 6 (0x06)
		// @0B7F: sipush -8881 (0xDD4F)
		// @0B82: iastore
		// @0B83: dup
		// @0B84: bipush 7 (0x07)
		// @0B86: sipush -8511 (0xDEC1)
		// @0B89: iastore
		// @0B8A: dup
		// @0B8B: bipush 8 (0x08)
		// @0B8D: sipush -8881 (0xDD4F)
		// @0B90: iastore
		// @0B91: dup
		// @0B92: bipush 9 (0x09)
		// @0B94: sipush -6661 (0xE5FB)
		// @0B97: iastore
		// @0B98: dup
		// @0B99: bipush 10 (0x0A)
		// @0B9B: sipush -740 (0xFD1C)
		// @0B9E: iastore
		// @0B9F: dup
		// @0BA0: bipush 11 (0x0B)
		// @0BA2: sipush 520 (0x0208)
		// @0BA5: iastore
		// @0BA6: dup
		// @0BA7: bipush 12 (0x0C)
		// @0BA9: sipush -260 (0xFEFC)
		// @0BAC: iastore
		// @0BAD: aastore
		// @0BAE: aload_0
		// @0BAF: bipush 6 (0x06)
		// @0BB1: bipush 13 (0x0D)
		// @0BB3: newarray int[]
		// @0BB5: dup
		// @0BB6: iconst_0
		// @0BB7: sipush 10361 (0x2879)
		// @0BBA: iastore
		// @0BBB: dup
		// @0BBC: iconst_1
		// @0BBD: sipush 6661 (0x1A05)
		// @0BC0: iastore
		// @0BC1: dup
		// @0BC2: iconst_2
		// @0BC3: sipush 2590 (0x0A1E)
		// @0BC6: iastore
		// @0BC7: dup
		// @0BC8: iconst_3
		// @0BC9: sipush -4440 (0xEEA8)
		// @0BCC: iastore
		// @0BCD: dup
		// @0BCE: iconst_4
		// @0BCF: sipush 8511 (0x213F)
		// @0BD2: iastore
		// @0BD3: dup
		// @0BD4: iconst_5
		// @0BD5: sipush 2960 (0x0B90)
		// @0BD8: iastore
		// @0BD9: dup
		// @0BDA: bipush 6 (0x06)
		// @0BDC: sipush -740 (0xFD1C)
		// @0BDF: iastore
		// @0BE0: dup
		// @0BE1: bipush 7 (0x07)
		// @0BE3: iconst_0
		// @0BE4: iastore
		// @0BE5: dup
		// @0BE6: bipush 8 (0x08)
		// @0BE8: iconst_0
		// @0BE9: iastore
		// @0BEA: dup
		// @0BEB: bipush 9 (0x09)
		// @0BED: iconst_0
		// @0BEE: iastore
		// @0BEF: dup
		// @0BF0: bipush 10 (0x0A)
		// @0BF2: sipush 1480 (0x05C8)
		// @0BF5: iastore
		// @0BF6: dup
		// @0BF7: bipush 11 (0x0B)
		// @0BF9: sipush 625 (0x0271)
		// @0BFC: iastore
		// @0BFD: dup
		// @0BFE: bipush 12 (0x0C)
		// @0C00: sipush -1093 (0xFBBB)
		// @0C03: iastore
		// @0C04: aastore
		// @0C05: aload_0
		// @0C06: bipush 23 (0x17)
		// @0C08: bipush 13 (0x0D)
		// @0C0A: newarray int[]
		// @0C0C: dup
		// @0C0D: iconst_0
		// @0C0E: sipush -2220 (0xF754)
		// @0C11: iastore
		// @0C12: dup
		// @0C13: iconst_1
		// @0C14: sipush -7031 (0xE489)
		// @0C17: iastore
		// @0C18: dup
		// @0C19: iconst_2
		// @0C1A: sipush -8511 (0xDEC1)
		// @0C1D: iastore
		// @0C1E: dup
		// @0C1F: iconst_3
		// @0C20: sipush -8881 (0xDD4F)
		// @0C23: iastore
		// @0C24: dup
		// @0C25: iconst_4
		// @0C26: sipush -7031 (0xE489)
		// @0C29: iastore
		// @0C2A: dup
		// @0C2B: iconst_5
		// @0C2C: sipush 3700 (0x0E74)
		// @0C2F: iastore
		// @0C30: dup
		// @0C31: bipush 6 (0x06)
		// @0C33: sipush 6291 (0x1893)
		// @0C36: iastore
		// @0C37: dup
		// @0C38: bipush 7 (0x07)
		// @0C3A: sipush -740 (0xFD1C)
		// @0C3D: iastore
		// @0C3E: dup
		// @0C3F: bipush 8 (0x08)
		// @0C41: sipush -11101 (0xD4A3)
		// @0C44: iastore
		// @0C45: dup
		// @0C46: bipush 9 (0x09)
		// @0C48: sipush 7401 (0x1CE9)
		// @0C4B: iastore
		// @0C4C: dup
		// @0C4D: bipush 10 (0x0A)
		// @0C4F: iconst_0
		// @0C50: iastore
		// @0C51: dup
		// @0C52: bipush 11 (0x0B)
		// @0C54: sipush 677 (0x02A5)
		// @0C57: iastore
		// @0C58: dup
		// @0C59: bipush 12 (0x0C)
		// @0C5B: sipush -937 (0xFC57)
		// @0C5E: iastore
		// @0C5F: aastore
		// @0C60: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @0C63: iconst_2
		// @0C64: aaload
		// @0C65: astore_0
		// @0C66: aload_0
		// @0C67: bipush 10 (0x0A)
		// @0C69: bipush 8 (0x08)
		// @0C6B: newarray int[]
		// @0C6D: dup
		// @0C6E: iconst_0
		// @0C6F: sipush 10361 (0x2879)
		// @0C72: iastore
		// @0C73: dup
		// @0C74: iconst_1
		// @0C75: sipush 1850 (0x073A)
		// @0C78: iastore
		// @0C79: dup
		// @0C7A: iconst_2
		// @0C7B: sipush -3330 (0xF2FE)
		// @0C7E: iastore
		// @0C7F: dup
		// @0C80: iconst_3
		// @0C81: sipush 3330 (0x0D02)
		// @0C84: iastore
		// @0C85: dup
		// @0C86: iconst_4
		// @0C87: sipush -17763 (0xBA9D)
		// @0C8A: iastore
		// @0C8B: dup
		// @0C8C: iconst_5
		// @0C8D: iconst_0
		// @0C8E: iastore
		// @0C8F: dup
		// @0C90: bipush 6 (0x06)
		// @0C92: sipush -677 (0xFD5B)
		// @0C95: iastore
		// @0C96: dup
		// @0C97: bipush 7 (0x07)
		// @0C99: sipush -1875 (0xF8AD)
		// @0C9C: iastore
		// @0C9D: aastore
		// @0C9E: aload_0
		// @0C9F: bipush 21 (0x15)
		// @0CA1: bipush 8 (0x08)
		// @0CA3: newarray int[]
		// @0CA5: dup
		// @0CA6: iconst_0
		// @0CA7: sipush 11842 (0x2E42)
		// @0CAA: iastore
		// @0CAB: dup
		// @0CAC: iconst_1
		// @0CAD: sipush 4070 (0x0FE6)
		// @0CB0: iastore
		// @0CB1: dup
		// @0CB2: iconst_2
		// @0CB3: sipush -5921 (0xE8DF)
		// @0CB6: iastore
		// @0CB7: dup
		// @0CB8: iconst_3
		// @0CB9: sipush 2590 (0x0A1E)
		// @0CBC: iastore
		// @0CBD: dup
		// @0CBE: iconst_4
		// @0CBF: sipush -24424 (0xA098)
		// @0CC2: iastore
		// @0CC3: dup
		// @0CC4: iconst_5
		// @0CC5: sipush -9621 (0xDA6B)
		// @0CC8: iastore
		// @0CC9: dup
		// @0CCA: bipush 6 (0x06)
		// @0CCC: sipush -156 (0xFF64)
		// @0CCF: iastore
		// @0CD0: dup
		// @0CD1: bipush 7 (0x07)
		// @0CD3: sipush -1875 (0xF8AD)
		// @0CD6: iastore
		// @0CD7: aastore
		// @0CD8: aload_0
		// @0CD9: iconst_4
		// @0CDA: bipush 8 (0x08)
		// @0CDC: newarray int[]
		// @0CDE: dup
		// @0CDF: iconst_0
		// @0CE0: sipush 15172 (0x3B44)
		// @0CE3: iastore
		// @0CE4: dup
		// @0CE5: iconst_1
		// @0CE6: sipush 8141 (0x1FCD)
		// @0CE9: iastore
		// @0CEA: dup
		// @0CEB: iconst_2
		// @0CEC: sipush -13692 (0xCA84)
		// @0CEF: iastore
		// @0CF0: dup
		// @0CF1: iconst_3
		// @0CF2: sipush 3330 (0x0D02)
		// @0CF5: iastore
		// @0CF6: dup
		// @0CF7: iconst_4
		// @0CF8: sipush 9251 (0x2423)
		// @0CFB: iastore
		// @0CFC: dup
		// @0CFD: iconst_5
		// @0CFE: sipush 7401 (0x1CE9)
		// @0D01: iastore
		// @0D02: dup
		// @0D03: bipush 6 (0x06)
		// @0D05: sipush -520 (0xFDF8)
		// @0D08: iastore
		// @0D09: dup
		// @0D0A: bipush 7 (0x07)
		// @0D0C: sipush -2395 (0xF6A5)
		// @0D0F: iastore
		// @0D10: aastore
		// @0D11: aload_0
		// @0D12: iconst_3
		// @0D13: bipush 8 (0x08)
		// @0D15: newarray int[]
		// @0D17: dup
		// @0D18: iconst_0
		// @0D19: sipush 15172 (0x3B44)
		// @0D1C: iastore
		// @0D1D: dup
		// @0D1E: iconst_1
		// @0D1F: sipush 9621 (0x2595)
		// @0D22: iastore
		// @0D23: dup
		// @0D24: iconst_2
		// @0D25: sipush -12582 (0xCEDA)
		// @0D28: iastore
		// @0D29: dup
		// @0D2A: iconst_3
		// @0D2B: iconst_0
		// @0D2C: iastore
		// @0D2D: dup
		// @0D2E: iconst_4
		// @0D2F: sipush -7031 (0xE489)
		// @0D32: iastore
		// @0D33: dup
		// @0D34: iconst_5
		// @0D35: sipush 9251 (0x2423)
		// @0D38: iastore
		// @0D39: dup
		// @0D3A: bipush 6 (0x06)
		// @0D3C: sipush -364 (0xFE94)
		// @0D3F: iastore
		// @0D40: dup
		// @0D41: bipush 7 (0x07)
		// @0D43: sipush -2395 (0xF6A5)
		// @0D46: iastore
		// @0D47: aastore
		// @0D48: aload_0
		// @0D49: bipush 7 (0x07)
		// @0D4B: bipush 8 (0x08)
		// @0D4D: newarray int[]
		// @0D4F: dup
		// @0D50: iconst_0
		// @0D51: sipush 15172 (0x3B44)
		// @0D54: iastore
		// @0D55: dup
		// @0D56: iconst_1
		// @0D57: sipush 6291 (0x1893)
		// @0D5A: iastore
		// @0D5B: dup
		// @0D5C: iconst_2
		// @0D5D: sipush -11101 (0xD4A3)
		// @0D60: iastore
		// @0D61: dup
		// @0D62: iconst_3
		// @0D63: sipush 6661 (0x1A05)
		// @0D66: iastore
		// @0D67: dup
		// @0D68: iconst_4
		// @0D69: sipush -14062 (0xC912)
		// @0D6C: iastore
		// @0D6D: dup
		// @0D6E: iconst_5
		// @0D6F: sipush 9621 (0x2595)
		// @0D72: iastore
		// @0D73: dup
		// @0D74: bipush 6 (0x06)
		// @0D76: sipush -260 (0xFEFC)
		// @0D79: iastore
		// @0D7A: dup
		// @0D7B: bipush 7 (0x07)
		// @0D7D: sipush -2395 (0xF6A5)
		// @0D80: iastore
		// @0D81: aastore
		// @0D82: aload_0
		// @0D83: bipush 24 (0x18)
		// @0D85: bipush 8 (0x08)
		// @0D87: newarray int[]
		// @0D89: dup
		// @0D8A: iconst_0
		// @0D8B: sipush 11842 (0x2E42)
		// @0D8E: iastore
		// @0D8F: dup
		// @0D90: iconst_1
		// @0D91: sipush 4070 (0x0FE6)
		// @0D94: iastore
		// @0D95: dup
		// @0D96: iconst_2
		// @0D97: sipush 740 (0x02E4)
		// @0D9A: iastore
		// @0D9B: dup
		// @0D9C: iconst_3
		// @0D9D: sipush 5921 (0x1721)
		// @0DA0: iastore
		// @0DA1: dup
		// @0DA2: iconst_4
		// @0DA3: sipush -21463 (0xAC29)
		// @0DA6: iastore
		// @0DA7: dup
		// @0DA8: iconst_5
		// @0DA9: sipush -6291 (0xE76D)
		// @0DAC: iastore
		// @0DAD: dup
		// @0DAE: bipush 6 (0x06)
		// @0DB0: sipush -2187 (0xF775)
		// @0DB3: iastore
		// @0DB4: dup
		// @0DB5: bipush 7 (0x07)
		// @0DB7: sipush -2500 (0xF63C)
		// @0DBA: iastore
		// @0DBB: aastore
		// @0DBC: aload_0
		// @0DBD: iconst_0
		// @0DBE: bipush 8 (0x08)
		// @0DC0: newarray int[]
		// @0DC2: dup
		// @0DC3: iconst_0
		// @0DC4: sipush 2220 (0x08AC)
		// @0DC7: iastore
		// @0DC8: dup
		// @0DC9: iconst_1
		// @0DCA: sipush 3330 (0x0D02)
		// @0DCD: iastore
		// @0DCE: dup
		// @0DCF: iconst_2
		// @0DD0: sipush -8141 (0xE033)
		// @0DD3: iastore
		// @0DD4: dup
		// @0DD5: iconst_3
		// @0DD6: sipush -2590 (0xF5E2)
		// @0DD9: iastore
		// @0DDA: dup
		// @0DDB: iconst_4
		// @0DDC: sipush -740 (0xFD1C)
		// @0DDF: iastore
		// @0DE0: dup
		// @0DE1: iconst_5
		// @0DE2: sipush 7401 (0x1CE9)
		// @0DE5: iastore
		// @0DE6: dup
		// @0DE7: bipush 6 (0x06)
		// @0DE9: sipush 364 (0x016C)
		// @0DEC: iastore
		// @0DED: dup
		// @0DEE: bipush 7 (0x07)
		// @0DF0: sipush -989 (0xFC23)
		// @0DF3: iastore
		// @0DF4: aastore
		// @0DF5: aload_0
		// @0DF6: bipush 17 (0x11)
		// @0DF8: bipush 8 (0x08)
		// @0DFA: newarray int[]
		// @0DFC: dup
		// @0DFD: iconst_0
		// @0DFE: sipush 11842 (0x2E42)
		// @0E01: iastore
		// @0E02: dup
		// @0E03: iconst_1
		// @0E04: sipush 4070 (0x0FE6)
		// @0E07: iastore
		// @0E08: dup
		// @0E09: iconst_2
		// @0E0A: sipush 740 (0x02E4)
		// @0E0D: iastore
		// @0E0E: dup
		// @0E0F: iconst_3
		// @0E10: sipush 5921 (0x1721)
		// @0E13: iastore
		// @0E14: dup
		// @0E15: iconst_4
		// @0E16: sipush -21463 (0xAC29)
		// @0E19: iastore
		// @0E1A: dup
		// @0E1B: iconst_5
		// @0E1C: sipush -6291 (0xE76D)
		// @0E1F: iastore
		// @0E20: dup
		// @0E21: bipush 6 (0x06)
		// @0E23: sipush -520 (0xFDF8)
		// @0E26: iastore
		// @0E27: dup
		// @0E28: bipush 7 (0x07)
		// @0E2A: sipush -1250 (0xFB1E)
		// @0E2D: iastore
		// @0E2E: aastore
		// @0E2F: aload_0
		// @0E30: iconst_5
		// @0E31: bipush 8 (0x08)
		// @0E33: newarray int[]
		// @0E35: dup
		// @0E36: iconst_0
		// @0E37: sipush 14802 (0x39D2)
		// @0E3A: iastore
		// @0E3B: dup
		// @0E3C: iconst_1
		// @0E3D: sipush 6661 (0x1A05)
		// @0E40: iastore
		// @0E41: dup
		// @0E42: iconst_2
		// @0E43: sipush -17763 (0xBA9D)
		// @0E46: iastore
		// @0E47: dup
		// @0E48: iconst_3
		// @0E49: sipush -5921 (0xE8DF)
		// @0E4C: iastore
		// @0E4D: dup
		// @0E4E: iconst_4
		// @0E4F: sipush 8881 (0x22B1)
		// @0E52: iastore
		// @0E53: dup
		// @0E54: iconst_5
		// @0E55: sipush 10361 (0x2879)
		// @0E58: iastore
		// @0E59: dup
		// @0E5A: bipush 6 (0x06)
		// @0E5C: sipush -677 (0xFD5B)
		// @0E5F: iastore
		// @0E60: dup
		// @0E61: bipush 7 (0x07)
		// @0E63: sipush -2343 (0xF6D9)
		// @0E66: iastore
		// @0E67: aastore
		// @0E68: aload_0
		// @0E69: bipush 18 (0x12)
		// @0E6B: bipush 8 (0x08)
		// @0E6D: newarray int[]
		// @0E6F: dup
		// @0E70: iconst_0
		// @0E71: sipush 11842 (0x2E42)
		// @0E74: iastore
		// @0E75: dup
		// @0E76: iconst_1
		// @0E77: sipush 4070 (0x0FE6)
		// @0E7A: iastore
		// @0E7B: dup
		// @0E7C: iconst_2
		// @0E7D: sipush -5921 (0xE8DF)
		// @0E80: iastore
		// @0E81: dup
		// @0E82: iconst_3
		// @0E83: sipush 14432 (0x3860)
		// @0E86: iastore
		// @0E87: dup
		// @0E88: iconst_4
		// @0E89: sipush -17392 (0xBC10)
		// @0E8C: iastore
		// @0E8D: dup
		// @0E8E: iconst_5
		// @0E8F: sipush -740 (0xFD1C)
		// @0E92: iastore
		// @0E93: dup
		// @0E94: bipush 6 (0x06)
		// @0E96: sipush -989 (0xFC23)
		// @0E99: iastore
		// @0E9A: dup
		// @0E9B: bipush 7 (0x07)
		// @0E9D: sipush -781 (0xFCF3)
		// @0EA0: iastore
		// @0EA1: aastore
		// @0EA2: aload_0
		// @0EA3: bipush 22 (0x16)
		// @0EA5: bipush 8 (0x08)
		// @0EA7: newarray int[]
		// @0EA9: dup
		// @0EAA: iconst_0
		// @0EAB: sipush 11842 (0x2E42)
		// @0EAE: iastore
		// @0EAF: dup
		// @0EB0: iconst_1
		// @0EB1: sipush 4070 (0x0FE6)
		// @0EB4: iastore
		// @0EB5: dup
		// @0EB6: iconst_2
		// @0EB7: sipush 740 (0x02E4)
		// @0EBA: iastore
		// @0EBB: dup
		// @0EBC: iconst_3
		// @0EBD: sipush 5921 (0x1721)
		// @0EC0: iastore
		// @0EC1: dup
		// @0EC2: iconst_4
		// @0EC3: sipush -21463 (0xAC29)
		// @0EC6: iastore
		// @0EC7: dup
		// @0EC8: iconst_5
		// @0EC9: sipush -6291 (0xE76D)
		// @0ECC: iastore
		// @0ECD: dup
		// @0ECE: bipush 6 (0x06)
		// @0ED0: sipush -2187 (0xF775)
		// @0ED3: iastore
		// @0ED4: dup
		// @0ED5: bipush 7 (0x07)
		// @0ED7: sipush -2500 (0xF63C)
		// @0EDA: iastore
		// @0EDB: aastore
		// @0EDC: aload_0
		// @0EDD: bipush 23 (0x17)
		// @0EDF: bipush 8 (0x08)
		// @0EE1: newarray int[]
		// @0EE3: dup
		// @0EE4: iconst_0
		// @0EE5: sipush 11842 (0x2E42)
		// @0EE8: iastore
		// @0EE9: dup
		// @0EEA: iconst_1
		// @0EEB: sipush 4070 (0x0FE6)
		// @0EEE: iastore
		// @0EEF: dup
		// @0EF0: iconst_2
		// @0EF1: sipush 740 (0x02E4)
		// @0EF4: iastore
		// @0EF5: dup
		// @0EF6: iconst_3
		// @0EF7: sipush 5921 (0x1721)
		// @0EFA: iastore
		// @0EFB: dup
		// @0EFC: iconst_4
		// @0EFD: sipush -21463 (0xAC29)
		// @0F00: iastore
		// @0F01: dup
		// @0F02: iconst_5
		// @0F03: sipush -6291 (0xE76D)
		// @0F06: iastore
		// @0F07: dup
		// @0F08: bipush 6 (0x06)
		// @0F0A: sipush -2187 (0xF775)
		// @0F0D: iastore
		// @0F0E: dup
		// @0F0F: bipush 7 (0x07)
		// @0F11: sipush -2500 (0xF63C)
		// @0F14: iastore
		// @0F15: aastore
		// @0F16: aload_0
		// @0F17: bipush 16 (0x10)
		// @0F19: bipush 8 (0x08)
		// @0F1B: newarray int[]
		// @0F1D: dup
		// @0F1E: iconst_0
		// @0F1F: sipush -1850 (0xF8C6)
		// @0F22: iastore
		// @0F23: dup
		// @0F24: iconst_1
		// @0F25: sipush -1850 (0xF8C6)
		// @0F28: iastore
		// @0F29: dup
		// @0F2A: iconst_2
		// @0F2B: sipush -17763 (0xBA9D)
		// @0F2E: iastore
		// @0F2F: dup
		// @0F30: iconst_3
		// @0F31: sipush -4070 (0xF01A)
		// @0F34: iastore
		// @0F35: dup
		// @0F36: iconst_4
		// @0F37: sipush -2220 (0xF754)
		// @0F3A: iastore
		// @0F3B: dup
		// @0F3C: iconst_5
		// @0F3D: sipush 2590 (0x0A1E)
		// @0F40: iastore
		// @0F41: dup
		// @0F42: bipush 6 (0x06)
		// @0F44: sipush -156 (0xFF64)
		// @0F47: iastore
		// @0F48: dup
		// @0F49: bipush 7 (0x07)
		// @0F4B: sipush 364 (0x016C)
		// @0F4E: iastore
		// @0F4F: aastore
		// @0F50: aload_0
		// @0F51: bipush 14 (0x0E)
		// @0F53: bipush 8 (0x08)
		// @0F55: newarray int[]
		// @0F57: dup
		// @0F58: iconst_0
		// @0F59: sipush 7401 (0x1CE9)
		// @0F5C: iastore
		// @0F5D: dup
		// @0F5E: iconst_1
		// @0F5F: sipush -1110 (0xFBAA)
		// @0F62: iastore
		// @0F63: dup
		// @0F64: iconst_2
		// @0F65: sipush -1110 (0xFBAA)
		// @0F68: iastore
		// @0F69: dup
		// @0F6A: iconst_3
		// @0F6B: sipush 4810 (0x12CA)
		// @0F6E: iastore
		// @0F6F: dup
		// @0F70: iconst_4
		// @0F71: sipush -17392 (0xBC10)
		// @0F74: iastore
		// @0F75: dup
		// @0F76: iconst_5
		// @0F77: iconst_0
		// @0F78: iastore
		// @0F79: dup
		// @0F7A: bipush 6 (0x06)
		// @0F7C: sipush -989 (0xFC23)
		// @0F7F: iastore
		// @0F80: dup
		// @0F81: bipush 7 (0x07)
		// @0F83: sipush -833 (0xFCBF)
		// @0F86: iastore
		// @0F87: aastore
		// @0F88: aload_0
		// @0F89: iconst_1
		// @0F8A: bipush 8 (0x08)
		// @0F8C: newarray int[]
		// @0F8E: dup
		// @0F8F: iconst_0
		// @0F90: sipush 15172 (0x3B44)
		// @0F93: iastore
		// @0F94: dup
		// @0F95: iconst_1
		// @0F96: sipush 6291 (0x1893)
		// @0F99: iastore
		// @0F9A: dup
		// @0F9B: iconst_2
		// @0F9C: sipush 9251 (0x2423)
		// @0F9F: iastore
		// @0FA0: dup
		// @0FA1: iconst_3
		// @0FA2: sipush 12212 (0x2FB4)
		// @0FA5: iastore
		// @0FA6: dup
		// @0FA7: iconst_4
		// @0FA8: sipush -17763 (0xBA9D)
		// @0FAB: iastore
		// @0FAC: dup
		// @0FAD: iconst_5
		// @0FAE: sipush -6661 (0xE5FB)
		// @0FB1: iastore
		// @0FB2: dup
		// @0FB3: bipush 6 (0x06)
		// @0FB5: sipush -781 (0xFCF3)
		// @0FB8: iastore
		// @0FB9: dup
		// @0FBA: bipush 7 (0x07)
		// @0FBC: sipush -2500 (0xF63C)
		// @0FBF: iastore
		// @0FC0: aastore
		// @0FC1: aload_0
		// @0FC2: bipush 19 (0x13)
		// @0FC4: bipush 8 (0x08)
		// @0FC6: newarray int[]
		// @0FC8: dup
		// @0FC9: iconst_0
		// @0FCA: sipush 10361 (0x2879)
		// @0FCD: iastore
		// @0FCE: dup
		// @0FCF: iconst_1
		// @0FD0: sipush 4070 (0x0FE6)
		// @0FD3: iastore
		// @0FD4: dup
		// @0FD5: iconst_2
		// @0FD6: sipush -22943 (0xA661)
		// @0FD9: iastore
		// @0FDA: dup
		// @0FDB: iconst_3
		// @0FDC: sipush -6291 (0xE76D)
		// @0FDF: iastore
		// @0FE0: dup
		// @0FE1: iconst_4
		// @0FE2: sipush -1850 (0xF8C6)
		// @0FE5: iastore
		// @0FE6: dup
		// @0FE7: iconst_5
		// @0FE8: sipush 2220 (0x08AC)
		// @0FEB: iastore
		// @0FEC: dup
		// @0FED: bipush 6 (0x06)
		// @0FEF: bipush -104 (0x98)
		// @0FF1: iastore
		// @0FF2: dup
		// @0FF3: bipush 7 (0x07)
		// @0FF5: sipush -1093 (0xFBBB)
		// @0FF8: iastore
		// @0FF9: aastore
		// @0FFA: aload_0
		// @0FFB: bipush 25 (0x19)
		// @0FFD: bipush 8 (0x08)
		// @0FFF: newarray int[]
		// @1001: dup
		// @1002: iconst_0
		// @1003: sipush 128 (0x0080)
		// @1006: iastore
		// @1007: dup
		// @1008: iconst_1
		// @1009: bipush 7 (0x07)
		// @100B: iastore
		// @100C: dup
		// @100D: iconst_2
		// @100E: bipush 28 (0x1C)
		// @1010: iastore
		// @1011: dup
		// @1012: iconst_3
		// @1013: bipush 8 (0x08)
		// @1015: iastore
		// @1016: dup
		// @1017: iconst_4
		// @1018: iconst_2
		// @1019: iastore
		// @101A: dup
		// @101B: iconst_5
		// @101C: bipush 100 (0x64)
		// @101E: iastore
		// @101F: dup
		// @1020: bipush 6 (0x06)
		// @1022: iconst_5
		// @1023: iastore
		// @1024: dup
		// @1025: bipush 7 (0x07)
		// @1027: iconst_5
		// @1028: iastore
		// @1029: aastore
		// @102A: aload_0
		// @102B: bipush 20 (0x14)
		// @102D: bipush 8 (0x08)
		// @102F: newarray int[]
		// @1031: dup
		// @1032: iconst_0
		// @1033: sipush 11842 (0x2E42)
		// @1036: iastore
		// @1037: dup
		// @1038: iconst_1
		// @1039: sipush 4070 (0x0FE6)
		// @103C: iastore
		// @103D: dup
		// @103E: iconst_2
		// @103F: sipush -17763 (0xBA9D)
		// @1042: iastore
		// @1043: dup
		// @1044: iconst_3
		// @1045: sipush -1480 (0xFA38)
		// @1048: iastore
		// @1049: dup
		// @104A: iconst_4
		// @104B: sipush -3330 (0xF2FE)
		// @104E: iastore
		// @104F: dup
		// @1050: iconst_5
		// @1051: sipush 11471 (0x2CCF)
		// @1054: iastore
		// @1055: dup
		// @1056: bipush 6 (0x06)
		// @1058: sipush -937 (0xFC57)
		// @105B: iastore
		// @105C: dup
		// @105D: bipush 7 (0x07)
		// @105F: sipush -781 (0xFCF3)
		// @1062: iastore
		// @1063: aastore
		// @1064: aload_0
		// @1065: bipush 12 (0x0C)
		// @1067: bipush 8 (0x08)
		// @1069: newarray int[]
		// @106B: dup
		// @106C: iconst_0
		// @106D: iconst_0
		// @106E: iastore
		// @106F: dup
		// @1070: iconst_1
		// @1071: iconst_0
		// @1072: iastore
		// @1073: dup
		// @1074: iconst_2
		// @1075: iconst_0
		// @1076: iastore
		// @1077: dup
		// @1078: iconst_3
		// @1079: iconst_0
		// @107A: iastore
		// @107B: dup
		// @107C: iconst_4
		// @107D: iconst_0
		// @107E: iastore
		// @107F: dup
		// @1080: iconst_5
		// @1081: iconst_0
		// @1082: iastore
		// @1083: dup
		// @1084: bipush 6 (0x06)
		// @1086: iconst_0
		// @1087: iastore
		// @1088: dup
		// @1089: bipush 7 (0x07)
		// @108B: iconst_0
		// @108C: iastore
		// @108D: aastore
		// @108E: aload_0
		// @108F: bipush 8 (0x08)
		// @1091: bipush 8 (0x08)
		// @1093: newarray int[]
		// @1095: dup
		// @1096: iconst_0
		// @1097: sipush 14802 (0x39D2)
		// @109A: iastore
		// @109B: dup
		// @109C: iconst_1
		// @109D: sipush 6291 (0x1893)
		// @10A0: iastore
		// @10A1: dup
		// @10A2: iconst_2
		// @10A3: sipush 6291 (0x1893)
		// @10A6: iastore
		// @10A7: dup
		// @10A8: iconst_3
		// @10A9: sipush 7031 (0x1B77)
		// @10AC: iastore
		// @10AD: dup
		// @10AE: iconst_4
		// @10AF: sipush -14432 (0xC7A0)
		// @10B2: iastore
		// @10B3: dup
		// @10B4: iconst_5
		// @10B5: iconst_0
		// @10B6: iastore
		// @10B7: dup
		// @10B8: bipush 6 (0x06)
		// @10BA: sipush -625 (0xFD8F)
		// @10BD: iastore
		// @10BE: dup
		// @10BF: bipush 7 (0x07)
		// @10C1: sipush -2395 (0xF6A5)
		// @10C4: iastore
		// @10C5: aastore
		// @10C6: aload_0
		// @10C7: iconst_2
		// @10C8: bipush 8 (0x08)
		// @10CA: newarray int[]
		// @10CC: dup
		// @10CD: iconst_0
		// @10CE: sipush 13322 (0x340A)
		// @10D1: iastore
		// @10D2: dup
		// @10D3: iconst_1
		// @10D4: sipush 7771 (0x1E5B)
		// @10D7: iastore
		// @10D8: dup
		// @10D9: iconst_2
		// @10DA: sipush -4440 (0xEEA8)
		// @10DD: iastore
		// @10DE: dup
		// @10DF: iconst_3
		// @10E0: sipush 15912 (0x3E28)
		// @10E3: iastore
		// @10E4: dup
		// @10E5: iconst_4
		// @10E6: sipush -14802 (0xC62E)
		// @10E9: iastore
		// @10EA: dup
		// @10EB: iconst_5
		// @10EC: sipush -1480 (0xFA38)
		// @10EF: iastore
		// @10F0: dup
		// @10F1: bipush 6 (0x06)
		// @10F3: iconst_0
		// @10F4: iastore
		// @10F5: dup
		// @10F6: bipush 7 (0x07)
		// @10F8: sipush -2500 (0xF63C)
		// @10FB: iastore
		// @10FC: aastore
		// @10FD: aload_0
		// @10FE: bipush 13 (0x0D)
		// @1100: bipush 8 (0x08)
		// @1102: newarray int[]
		// @1104: dup
		// @1105: iconst_0
		// @1106: iconst_0
		// @1107: iastore
		// @1108: dup
		// @1109: iconst_1
		// @110A: iconst_0
		// @110B: iastore
		// @110C: dup
		// @110D: iconst_2
		// @110E: iconst_0
		// @110F: iastore
		// @1110: dup
		// @1111: iconst_3
		// @1112: iconst_0
		// @1113: iastore
		// @1114: dup
		// @1115: iconst_4
		// @1116: iconst_0
		// @1117: iastore
		// @1118: dup
		// @1119: iconst_5
		// @111A: iconst_0
		// @111B: iastore
		// @111C: dup
		// @111D: bipush 6 (0x06)
		// @111F: iconst_0
		// @1120: iastore
		// @1121: dup
		// @1122: bipush 7 (0x07)
		// @1124: iconst_0
		// @1125: iastore
		// @1126: aastore
		// @1127: aload_0
		// @1128: bipush 6 (0x06)
		// @112A: bipush 8 (0x08)
		// @112C: newarray int[]
		// @112E: dup
		// @112F: iconst_0
		// @1130: sipush 15912 (0x3E28)
		// @1133: iastore
		// @1134: dup
		// @1135: iconst_1
		// @1136: sipush 7771 (0x1E5B)
		// @1139: iastore
		// @113A: dup
		// @113B: iconst_2
		// @113C: sipush -13322 (0xCBF6)
		// @113F: iastore
		// @1140: dup
		// @1141: iconst_3
		// @1142: sipush -2960 (0xF470)
		// @1145: iastore
		// @1146: dup
		// @1147: iconst_4
		// @1148: sipush 6661 (0x1A05)
		// @114B: iastore
		// @114C: dup
		// @114D: iconst_5
		// @114E: sipush 15172 (0x3B44)
		// @1151: iastore
		// @1152: dup
		// @1153: bipush 6 (0x06)
		// @1155: sipush -572 (0xFDC4)
		// @1158: iastore
		// @1159: dup
		// @115A: bipush 7 (0x07)
		// @115C: sipush -2395 (0xF6A5)
		// @115F: iastore
		// @1160: aastore
		// @1161: aload_0
		// @1162: bipush 11 (0x0B)
		// @1164: bipush 8 (0x08)
		// @1166: newarray int[]
		// @1168: dup
		// @1169: iconst_0
		// @116A: iconst_0
		// @116B: iastore
		// @116C: dup
		// @116D: iconst_1
		// @116E: iconst_0
		// @116F: iastore
		// @1170: dup
		// @1171: iconst_2
		// @1172: iconst_0
		// @1173: iastore
		// @1174: dup
		// @1175: iconst_3
		// @1176: iconst_0
		// @1177: iastore
		// @1178: dup
		// @1179: iconst_4
		// @117A: iconst_0
		// @117B: iastore
		// @117C: dup
		// @117D: iconst_5
		// @117E: iconst_0
		// @117F: iastore
		// @1180: dup
		// @1181: bipush 6 (0x06)
		// @1183: iconst_0
		// @1184: iastore
		// @1185: dup
		// @1186: bipush 7 (0x07)
		// @1188: iconst_0
		// @1189: iastore
		// @118A: aastore
		// @118B: aload_0
		// @118C: bipush 9 (0x09)
		// @118E: bipush 8 (0x08)
		// @1190: newarray int[]
		// @1192: dup
		// @1193: iconst_0
		// @1194: sipush 9991 (0x2707)
		// @1197: iastore
		// @1198: dup
		// @1199: iconst_1
		// @119A: sipush 6291 (0x1893)
		// @119D: iastore
		// @119E: dup
		// @119F: iconst_2
		// @11A0: sipush -5180 (0xEBC4)
		// @11A3: iastore
		// @11A4: dup
		// @11A5: iconst_3
		// @11A6: sipush 10731 (0x29EB)
		// @11A9: iastore
		// @11AA: dup
		// @11AB: iconst_4
		// @11AC: sipush -15542 (0xC34A)
		// @11AF: iastore
		// @11B0: dup
		// @11B1: iconst_5
		// @11B2: sipush -1850 (0xF8C6)
		// @11B5: iastore
		// @11B6: dup
		// @11B7: bipush 6 (0x06)
		// @11B9: sipush 572 (0x023C)
		// @11BC: iastore
		// @11BD: dup
		// @11BE: bipush 7 (0x07)
		// @11C0: sipush -1822 (0xF8E2)
		// @11C3: iastore
		// @11C4: aastore
		// @11C5: aload_0
		// @11C6: bipush 15 (0x0F)
		// @11C8: bipush 8 (0x08)
		// @11CA: newarray int[]
		// @11CC: dup
		// @11CD: iconst_0
		// @11CE: sipush -2960 (0xF470)
		// @11D1: iastore
		// @11D2: dup
		// @11D3: iconst_1
		// @11D4: iconst_0
		// @11D5: iastore
		// @11D6: dup
		// @11D7: iconst_2
		// @11D8: sipush -9621 (0xDA6B)
		// @11DB: iastore
		// @11DC: dup
		// @11DD: iconst_3
		// @11DE: sipush 5180 (0x143C)
		// @11E1: iastore
		// @11E2: dup
		// @11E3: iconst_4
		// @11E4: iconst_0
		// @11E5: iastore
		// @11E6: dup
		// @11E7: iconst_5
		// @11E8: sipush 1480 (0x05C8)
		// @11EB: iastore
		// @11EC: dup
		// @11ED: bipush 6 (0x06)
		// @11EF: sipush -364 (0xFE94)
		// @11F2: iastore
		// @11F3: dup
		// @11F4: bipush 7 (0x07)
		// @11F6: sipush 572 (0x023C)
		// @11F9: iastore
		// @11FA: aastore
		// @11FB: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @11FE: iconst_3
		// @11FF: aaload
		// @1200: astore_0
		// @1201: aload_0
		// @1202: bipush 7 (0x07)
		// @1204: bipush 21 (0x15)
		// @1206: newarray int[]
		// @1208: dup
		// @1209: iconst_0
		// @120A: sipush 1110 (0x0456)
		// @120D: iastore
		// @120E: dup
		// @120F: iconst_1
		// @1210: sipush -5180 (0xEBC4)
		// @1213: iastore
		// @1214: dup
		// @1215: iconst_2
		// @1216: sipush -3330 (0xF2FE)
		// @1219: iastore
		// @121A: dup
		// @121B: iconst_3
		// @121C: iconst_0
		// @121D: iastore
		// @121E: dup
		// @121F: iconst_4
		// @1220: iconst_0
		// @1221: iastore
		// @1222: dup
		// @1223: iconst_5
		// @1224: sipush 740 (0x02E4)
		// @1227: iastore
		// @1228: dup
		// @1229: bipush 6 (0x06)
		// @122B: sipush 8511 (0x213F)
		// @122E: iastore
		// @122F: dup
		// @1230: bipush 7 (0x07)
		// @1232: sipush 11842 (0x2E42)
		// @1235: iastore
		// @1236: dup
		// @1237: bipush 8 (0x08)
		// @1239: sipush 4440 (0x1158)
		// @123C: iastore
		// @123D: dup
		// @123E: bipush 9 (0x09)
		// @1240: sipush 4440 (0x1158)
		// @1243: iastore
		// @1244: dup
		// @1245: bipush 10 (0x0A)
		// @1247: sipush 6661 (0x1A05)
		// @124A: iastore
		// @124B: dup
		// @124C: bipush 11 (0x0B)
		// @124E: sipush 8511 (0x213F)
		// @1251: iastore
		// @1252: dup
		// @1253: bipush 12 (0x0C)
		// @1255: sipush -3330 (0xF2FE)
		// @1258: iastore
		// @1259: dup
		// @125A: bipush 13 (0x0D)
		// @125C: iconst_0
		// @125D: iastore
		// @125E: dup
		// @125F: bipush 14 (0x0E)
		// @1261: sipush -1110 (0xFBAA)
		// @1264: iastore
		// @1265: dup
		// @1266: bipush 15 (0x0F)
		// @1268: sipush -3700 (0xF18C)
		// @126B: iastore
		// @126C: dup
		// @126D: bipush 16 (0x10)
		// @126F: iconst_0
		// @1270: iastore
		// @1271: dup
		// @1272: bipush 17 (0x11)
		// @1274: iconst_0
		// @1275: iastore
		// @1276: dup
		// @1277: bipush 18 (0x12)
		// @1279: sipush -1110 (0xFBAA)
		// @127C: iastore
		// @127D: dup
		// @127E: bipush 19 (0x13)
		// @1280: iconst_0
		// @1281: iastore
		// @1282: dup
		// @1283: bipush 20 (0x14)
		// @1285: iconst_0
		// @1286: iastore
		// @1287: aastore
		// @1288: aload_0
		// @1289: bipush 8 (0x08)
		// @128B: bipush 21 (0x15)
		// @128D: newarray int[]
		// @128F: dup
		// @1290: iconst_0
		// @1291: sipush 1110 (0x0456)
		// @1294: iastore
		// @1295: dup
		// @1296: iconst_1
		// @1297: sipush -2220 (0xF754)
		// @129A: iastore
		// @129B: dup
		// @129C: iconst_2
		// @129D: sipush 1110 (0x0456)
		// @12A0: iastore
		// @12A1: dup
		// @12A2: iconst_3
		// @12A3: iconst_0
		// @12A4: iastore
		// @12A5: dup
		// @12A6: iconst_4
		// @12A7: iconst_0
		// @12A8: iastore
		// @12A9: dup
		// @12AA: iconst_5
		// @12AB: iconst_0
		// @12AC: iastore
		// @12AD: dup
		// @12AE: bipush 6 (0x06)
		// @12B0: sipush 5921 (0x1721)
		// @12B3: iastore
		// @12B4: dup
		// @12B5: bipush 7 (0x07)
		// @12B7: sipush 4810 (0x12CA)
		// @12BA: iastore
		// @12BB: dup
		// @12BC: bipush 8 (0x08)
		// @12BE: sipush -2220 (0xF754)
		// @12C1: iastore
		// @12C2: dup
		// @12C3: bipush 9 (0x09)
		// @12C5: sipush 1110 (0x0456)
		// @12C8: iastore
		// @12C9: dup
		// @12CA: bipush 10 (0x0A)
		// @12CC: iconst_0
		// @12CD: iastore
		// @12CE: dup
		// @12CF: bipush 11 (0x0B)
		// @12D1: iconst_0
		// @12D2: iastore
		// @12D3: dup
		// @12D4: bipush 12 (0x0C)
		// @12D6: sipush -2960 (0xF470)
		// @12D9: iastore
		// @12DA: dup
		// @12DB: bipush 13 (0x0D)
		// @12DD: sipush -1480 (0xFA38)
		// @12E0: iastore
		// @12E1: dup
		// @12E2: bipush 14 (0x0E)
		// @12E4: iconst_0
		// @12E5: iastore
		// @12E6: dup
		// @12E7: bipush 15 (0x0F)
		// @12E9: iconst_0
		// @12EA: iastore
		// @12EB: dup
		// @12EC: bipush 16 (0x10)
		// @12EE: iconst_0
		// @12EF: iastore
		// @12F0: dup
		// @12F1: bipush 17 (0x11)
		// @12F3: iconst_0
		// @12F4: iastore
		// @12F5: dup
		// @12F6: bipush 18 (0x12)
		// @12F8: sipush -1110 (0xFBAA)
		// @12FB: iastore
		// @12FC: dup
		// @12FD: bipush 19 (0x13)
		// @12FF: sipush -208 (0xFF30)
		// @1302: iastore
		// @1303: dup
		// @1304: bipush 20 (0x14)
		// @1306: iconst_0
		// @1307: iastore
		// @1308: aastore
		// @1309: aload_0
		// @130A: bipush 25 (0x19)
		// @130C: bipush 8 (0x08)
		// @130E: newarray int[]
		// @1310: dup
		// @1311: iconst_0
		// @1312: bipush 20 (0x14)
		// @1314: iastore
		// @1315: dup
		// @1316: iconst_1
		// @1317: iconst_5
		// @1318: iastore
		// @1319: dup
		// @131A: iconst_2
		// @131B: bipush 40 (0x28)
		// @131D: iastore
		// @131E: dup
		// @131F: iconst_3
		// @1320: bipush 8 (0x08)
		// @1322: iastore
		// @1323: dup
		// @1324: iconst_4
		// @1325: iconst_3
		// @1326: iastore
		// @1327: dup
		// @1328: iconst_5
		// @1329: bipush 10 (0x0A)
		// @132B: iastore
		// @132C: dup
		// @132D: bipush 6 (0x06)
		// @132F: iconst_5
		// @1330: iastore
		// @1331: dup
		// @1332: bipush 7 (0x07)
		// @1334: bipush 8 (0x08)
		// @1336: iastore
		// @1337: aastore
		// @1338: aload_0
		// @1339: bipush 24 (0x18)
		// @133B: bipush 21 (0x15)
		// @133D: newarray int[]
		// @133F: dup
		// @1340: iconst_0
		// @1341: sipush -9251 (0xDBDD)
		// @1344: iastore
		// @1345: dup
		// @1346: iconst_1
		// @1347: sipush 2220 (0x08AC)
		// @134A: iastore
		// @134B: dup
		// @134C: iconst_2
		// @134D: iconst_0
		// @134E: iastore
		// @134F: dup
		// @1350: iconst_3
		// @1351: sipush -5180 (0xEBC4)
		// @1354: iastore
		// @1355: dup
		// @1356: iconst_4
		// @1357: sipush -9251 (0xDBDD)
		// @135A: iastore
		// @135B: dup
		// @135C: iconst_5
		// @135D: sipush -5921 (0xE8DF)
		// @1360: iastore
		// @1361: dup
		// @1362: bipush 6 (0x06)
		// @1364: sipush -740 (0xFD1C)
		// @1367: iastore
		// @1368: dup
		// @1369: bipush 7 (0x07)
		// @136B: sipush 1850 (0x073A)
		// @136E: iastore
		// @136F: dup
		// @1370: bipush 8 (0x08)
		// @1372: sipush -1850 (0xF8C6)
		// @1375: iastore
		// @1376: dup
		// @1377: bipush 9 (0x09)
		// @1379: sipush 1480 (0x05C8)
		// @137C: iastore
		// @137D: dup
		// @137E: bipush 10 (0x0A)
		// @1380: sipush -2590 (0xF5E2)
		// @1383: iastore
		// @1384: dup
		// @1385: bipush 11 (0x0B)
		// @1387: sipush -17763 (0xBA9D)
		// @138A: iastore
		// @138B: dup
		// @138C: bipush 12 (0x0C)
		// @138E: sipush -8881 (0xDD4F)
		// @1391: iastore
		// @1392: dup
		// @1393: bipush 13 (0x0D)
		// @1395: sipush -6291 (0xE76D)
		// @1398: iastore
		// @1399: dup
		// @139A: bipush 14 (0x0E)
		// @139C: sipush 6661 (0x1A05)
		// @139F: iastore
		// @13A0: dup
		// @13A1: bipush 15 (0x0F)
		// @13A3: sipush 1850 (0x073A)
		// @13A6: iastore
		// @13A7: dup
		// @13A8: bipush 16 (0x10)
		// @13AA: sipush -3330 (0xF2FE)
		// @13AD: iastore
		// @13AE: dup
		// @13AF: bipush 17 (0x11)
		// @13B1: sipush -740 (0xFD1C)
		// @13B4: iastore
		// @13B5: dup
		// @13B6: bipush 18 (0x12)
		// @13B8: sipush -7771 (0xE1A5)
		// @13BB: iastore
		// @13BC: dup
		// @13BD: bipush 19 (0x13)
		// @13BF: sipush 208 (0x00D0)
		// @13C2: iastore
		// @13C3: dup
		// @13C4: bipush 20 (0x14)
		// @13C6: iconst_0
		// @13C7: iastore
		// @13C8: aastore
		// @13C9: aload_0
		// @13CA: bipush 6 (0x06)
		// @13CC: bipush 21 (0x15)
		// @13CE: newarray int[]
		// @13D0: dup
		// @13D1: iconst_0
		// @13D2: iconst_0
		// @13D3: iastore
		// @13D4: dup
		// @13D5: iconst_1
		// @13D6: sipush -8881 (0xDD4F)
		// @13D9: iastore
		// @13DA: dup
		// @13DB: iconst_2
		// @13DC: sipush -7031 (0xE489)
		// @13DF: iastore
		// @13E0: dup
		// @13E1: iconst_3
		// @13E2: sipush -1110 (0xFBAA)
		// @13E5: iastore
		// @13E6: dup
		// @13E7: iconst_4
		// @13E8: iconst_0
		// @13E9: iastore
		// @13EA: dup
		// @13EB: iconst_5
		// @13EC: sipush 1110 (0x0456)
		// @13EF: iastore
		// @13F0: dup
		// @13F1: bipush 6 (0x06)
		// @13F3: sipush 6661 (0x1A05)
		// @13F6: iastore
		// @13F7: dup
		// @13F8: bipush 7 (0x07)
		// @13FA: sipush 9991 (0x2707)
		// @13FD: iastore
		// @13FE: dup
		// @13FF: bipush 8 (0x08)
		// @1401: iconst_0
		// @1402: iastore
		// @1403: dup
		// @1404: bipush 9 (0x09)
		// @1406: iconst_0
		// @1407: iastore
		// @1408: dup
		// @1409: bipush 10 (0x0A)
		// @140B: sipush 5550 (0x15AE)
		// @140E: iastore
		// @140F: dup
		// @1410: bipush 11 (0x0B)
		// @1412: sipush 7771 (0x1E5B)
		// @1415: iastore
		// @1416: dup
		// @1417: bipush 12 (0x0C)
		// @1419: sipush 1480 (0x05C8)
		// @141C: iastore
		// @141D: dup
		// @141E: bipush 13 (0x0D)
		// @1420: iconst_0
		// @1421: iastore
		// @1422: dup
		// @1423: bipush 14 (0x0E)
		// @1425: sipush -3700 (0xF18C)
		// @1428: iastore
		// @1429: dup
		// @142A: bipush 15 (0x0F)
		// @142C: sipush -6291 (0xE76D)
		// @142F: iastore
		// @1430: dup
		// @1431: bipush 16 (0x10)
		// @1433: sipush 740 (0x02E4)
		// @1436: iastore
		// @1437: dup
		// @1438: bipush 17 (0x11)
		// @143A: iconst_0
		// @143B: iastore
		// @143C: dup
		// @143D: bipush 18 (0x12)
		// @143F: sipush -740 (0xFD1C)
		// @1442: iastore
		// @1443: dup
		// @1444: bipush 19 (0x13)
		// @1446: sipush 208 (0x00D0)
		// @1449: iastore
		// @144A: dup
		// @144B: bipush 20 (0x14)
		// @144D: iconst_0
		// @144E: iastore
		// @144F: aastore
		// @1450: aload_0
		// @1451: bipush 11 (0x0B)
		// @1453: bipush 21 (0x15)
		// @1455: newarray int[]
		// @1457: dup
		// @1458: iconst_0
		// @1459: sipush -3700 (0xF18C)
		// @145C: iastore
		// @145D: dup
		// @145E: iconst_1
		// @145F: sipush 2220 (0x08AC)
		// @1462: iastore
		// @1463: dup
		// @1464: iconst_2
		// @1465: sipush -4440 (0xEEA8)
		// @1468: iastore
		// @1469: dup
		// @146A: iconst_3
		// @146B: sipush -2590 (0xF5E2)
		// @146E: iastore
		// @146F: dup
		// @1470: iconst_4
		// @1471: sipush 2590 (0x0A1E)
		// @1474: iastore
		// @1475: dup
		// @1476: iconst_5
		// @1477: iconst_0
		// @1478: iastore
		// @1479: dup
		// @147A: bipush 6 (0x06)
		// @147C: sipush -5550 (0xEA52)
		// @147F: iastore
		// @1480: dup
		// @1481: bipush 7 (0x07)
		// @1483: sipush -7031 (0xE489)
		// @1486: iastore
		// @1487: dup
		// @1488: bipush 8 (0x08)
		// @148A: sipush 1480 (0x05C8)
		// @148D: iastore
		// @148E: dup
		// @148F: bipush 9 (0x09)
		// @1491: sipush 3700 (0x0E74)
		// @1494: iastore
		// @1495: dup
		// @1496: bipush 10 (0x0A)
		// @1498: sipush -740 (0xFD1C)
		// @149B: iastore
		// @149C: dup
		// @149D: bipush 11 (0x0B)
		// @149F: sipush 740 (0x02E4)
		// @14A2: iastore
		// @14A3: dup
		// @14A4: bipush 12 (0x0C)
		// @14A6: iconst_0
		// @14A7: iastore
		// @14A8: dup
		// @14A9: bipush 13 (0x0D)
		// @14AB: iconst_0
		// @14AC: iastore
		// @14AD: dup
		// @14AE: bipush 14 (0x0E)
		// @14B0: sipush 740 (0x02E4)
		// @14B3: iastore
		// @14B4: dup
		// @14B5: bipush 15 (0x0F)
		// @14B7: sipush 7401 (0x1CE9)
		// @14BA: iastore
		// @14BB: dup
		// @14BC: bipush 16 (0x10)
		// @14BE: iconst_0
		// @14BF: iastore
		// @14C0: dup
		// @14C1: bipush 17 (0x11)
		// @14C3: iconst_0
		// @14C4: iastore
		// @14C5: dup
		// @14C6: bipush 18 (0x12)
		// @14C8: sipush 1110 (0x0456)
		// @14CB: iastore
		// @14CC: dup
		// @14CD: bipush 19 (0x13)
		// @14CF: sipush -208 (0xFF30)
		// @14D2: iastore
		// @14D3: dup
		// @14D4: bipush 20 (0x14)
		// @14D6: iconst_0
		// @14D7: iastore
		// @14D8: aastore
		// @14D9: aload_0
		// @14DA: iconst_5
		// @14DB: bipush 21 (0x15)
		// @14DD: newarray int[]
		// @14DF: dup
		// @14E0: iconst_0
		// @14E1: iconst_0
		// @14E2: iastore
		// @14E3: dup
		// @14E4: iconst_1
		// @14E5: sipush -12212 (0xD04C)
		// @14E8: iastore
		// @14E9: dup
		// @14EA: iconst_2
		// @14EB: sipush -3700 (0xF18C)
		// @14EE: iastore
		// @14EF: dup
		// @14F0: iconst_3
		// @14F1: iconst_0
		// @14F2: iastore
		// @14F3: dup
		// @14F4: iconst_4
		// @14F5: iconst_0
		// @14F6: iastore
		// @14F7: dup
		// @14F8: iconst_5
		// @14F9: sipush 1480 (0x05C8)
		// @14FC: iastore
		// @14FD: dup
		// @14FE: bipush 6 (0x06)
		// @1500: sipush 4070 (0x0FE6)
		// @1503: iastore
		// @1504: dup
		// @1505: bipush 7 (0x07)
		// @1507: sipush 4070 (0x0FE6)
		// @150A: iastore
		// @150B: dup
		// @150C: bipush 8 (0x08)
		// @150E: iconst_0
		// @150F: iastore
		// @1510: dup
		// @1511: bipush 9 (0x09)
		// @1513: iconst_0
		// @1514: iastore
		// @1515: dup
		// @1516: bipush 10 (0x0A)
		// @1518: sipush 3700 (0x0E74)
		// @151B: iastore
		// @151C: dup
		// @151D: bipush 11 (0x0B)
		// @151F: sipush 3330 (0x0D02)
		// @1522: iastore
		// @1523: dup
		// @1524: bipush 12 (0x0C)
		// @1526: iconst_0
		// @1527: iastore
		// @1528: dup
		// @1529: bipush 13 (0x0D)
		// @152B: iconst_0
		// @152C: iastore
		// @152D: dup
		// @152E: bipush 14 (0x0E)
		// @1530: sipush 4070 (0x0FE6)
		// @1533: iastore
		// @1534: dup
		// @1535: bipush 15 (0x0F)
		// @1537: sipush -3330 (0xF2FE)
		// @153A: iastore
		// @153B: dup
		// @153C: bipush 16 (0x10)
		// @153E: sipush -740 (0xFD1C)
		// @1541: iastore
		// @1542: dup
		// @1543: bipush 17 (0x11)
		// @1545: sipush 3700 (0x0E74)
		// @1548: iastore
		// @1549: dup
		// @154A: bipush 18 (0x12)
		// @154C: sipush -740 (0xFD1C)
		// @154F: iastore
		// @1550: dup
		// @1551: bipush 19 (0x13)
		// @1553: iconst_0
		// @1554: iastore
		// @1555: dup
		// @1556: bipush 20 (0x14)
		// @1558: iconst_0
		// @1559: iastore
		// @155A: aastore
		// @155B: aload_0
		// @155C: bipush 9 (0x09)
		// @155E: bipush 21 (0x15)
		// @1560: newarray int[]
		// @1562: dup
		// @1563: iconst_0
		// @1564: iconst_0
		// @1565: iastore
		// @1566: dup
		// @1567: iconst_1
		// @1568: sipush 1850 (0x073A)
		// @156B: iastore
		// @156C: dup
		// @156D: iconst_2
		// @156E: sipush 13692 (0x357C)
		// @1571: iastore
		// @1572: dup
		// @1573: iconst_3
		// @1574: iconst_0
		// @1575: iastore
		// @1576: dup
		// @1577: iconst_4
		// @1578: iconst_0
		// @1579: iastore
		// @157A: dup
		// @157B: iconst_5
		// @157C: iconst_0
		// @157D: iastore
		// @157E: dup
		// @157F: bipush 6 (0x06)
		// @1581: sipush -4810 (0xED36)
		// @1584: iastore
		// @1585: dup
		// @1586: bipush 7 (0x07)
		// @1588: sipush -2590 (0xF5E2)
		// @158B: iastore
		// @158C: dup
		// @158D: bipush 8 (0x08)
		// @158F: iconst_0
		// @1590: iastore
		// @1591: dup
		// @1592: bipush 9 (0x09)
		// @1594: iconst_0
		// @1595: iastore
		// @1596: dup
		// @1597: bipush 10 (0x0A)
		// @1599: sipush -5180 (0xEBC4)
		// @159C: iastore
		// @159D: dup
		// @159E: bipush 11 (0x0B)
		// @15A0: sipush -3330 (0xF2FE)
		// @15A3: iastore
		// @15A4: dup
		// @15A5: bipush 12 (0x0C)
		// @15A7: iconst_0
		// @15A8: iastore
		// @15A9: dup
		// @15AA: bipush 13 (0x0D)
		// @15AC: iconst_0
		// @15AD: iastore
		// @15AE: dup
		// @15AF: bipush 14 (0x0E)
		// @15B1: sipush -740 (0xFD1C)
		// @15B4: iastore
		// @15B5: dup
		// @15B6: bipush 15 (0x0F)
		// @15B8: iconst_0
		// @15B9: iastore
		// @15BA: dup
		// @15BB: bipush 16 (0x10)
		// @15BD: iconst_0
		// @15BE: iastore
		// @15BF: dup
		// @15C0: bipush 17 (0x11)
		// @15C2: iconst_0
		// @15C3: iastore
		// @15C4: dup
		// @15C5: bipush 18 (0x12)
		// @15C7: sipush 1110 (0x0456)
		// @15CA: iastore
		// @15CB: dup
		// @15CC: bipush 19 (0x13)
		// @15CE: sipush -156 (0xFF64)
		// @15D1: iastore
		// @15D2: dup
		// @15D3: bipush 20 (0x14)
		// @15D5: iconst_0
		// @15D6: iastore
		// @15D7: aastore
		// @15D8: aload_0
		// @15D9: bipush 14 (0x0E)
		// @15DB: bipush 21 (0x15)
		// @15DD: newarray int[]
		// @15DF: dup
		// @15E0: iconst_0
		// @15E1: sipush -7031 (0xE489)
		// @15E4: iastore
		// @15E5: dup
		// @15E6: iconst_1
		// @15E7: sipush -4440 (0xEEA8)
		// @15EA: iastore
		// @15EB: dup
		// @15EC: iconst_2
		// @15ED: sipush -7401 (0xE317)
		// @15F0: iastore
		// @15F1: dup
		// @15F2: iconst_3
		// @15F3: iconst_0
		// @15F4: iastore
		// @15F5: dup
		// @15F6: iconst_4
		// @15F7: sipush -1480 (0xFA38)
		// @15FA: iastore
		// @15FB: dup
		// @15FC: iconst_5
		// @15FD: sipush -1110 (0xFBAA)
		// @1600: iastore
		// @1601: dup
		// @1602: bipush 6 (0x06)
		// @1604: sipush 1850 (0x073A)
		// @1607: iastore
		// @1608: dup
		// @1609: bipush 7 (0x07)
		// @160B: sipush 14062 (0x36EE)
		// @160E: iastore
		// @160F: dup
		// @1610: bipush 8 (0x08)
		// @1612: sipush 11842 (0x2E42)
		// @1615: iastore
		// @1616: dup
		// @1617: bipush 9 (0x09)
		// @1619: sipush 15542 (0x3CB6)
		// @161C: iastore
		// @161D: dup
		// @161E: bipush 10 (0x0A)
		// @1620: sipush -740 (0xFD1C)
		// @1623: iastore
		// @1624: dup
		// @1625: bipush 11 (0x0B)
		// @1627: sipush 6661 (0x1A05)
		// @162A: iastore
		// @162B: dup
		// @162C: bipush 12 (0x0C)
		// @162E: sipush 5921 (0x1721)
		// @1631: iastore
		// @1632: dup
		// @1633: bipush 13 (0x0D)
		// @1635: sipush 11471 (0x2CCF)
		// @1638: iastore
		// @1639: dup
		// @163A: bipush 14 (0x0E)
		// @163C: sipush 4440 (0x1158)
		// @163F: iastore
		// @1640: dup
		// @1641: bipush 15 (0x0F)
		// @1643: sipush 3330 (0x0D02)
		// @1646: iastore
		// @1647: dup
		// @1648: bipush 16 (0x10)
		// @164A: sipush 9251 (0x2423)
		// @164D: iastore
		// @164E: dup
		// @164F: bipush 17 (0x11)
		// @1651: sipush 13322 (0x340A)
		// @1654: iastore
		// @1655: dup
		// @1656: bipush 18 (0x12)
		// @1658: sipush 1480 (0x05C8)
		// @165B: iastore
		// @165C: dup
		// @165D: bipush 19 (0x13)
		// @165F: sipush -989 (0xFC23)
		// @1662: iastore
		// @1663: dup
		// @1664: bipush 20 (0x14)
		// @1666: iconst_0
		// @1667: iastore
		// @1668: aastore
		// @1669: aload_0
		// @166A: bipush 16 (0x10)
		// @166C: bipush 21 (0x15)
		// @166E: newarray int[]
		// @1670: dup
		// @1671: iconst_0
		// @1672: sipush 2220 (0x08AC)
		// @1675: iastore
		// @1676: dup
		// @1677: iconst_1
		// @1678: iconst_0
		// @1679: iastore
		// @167A: dup
		// @167B: iconst_2
		// @167C: sipush 1480 (0x05C8)
		// @167F: iastore
		// @1680: dup
		// @1681: iconst_3
		// @1682: sipush 1480 (0x05C8)
		// @1685: iastore
		// @1686: dup
		// @1687: iconst_4
		// @1688: sipush -1850 (0xF8C6)
		// @168B: iastore
		// @168C: dup
		// @168D: iconst_5
		// @168E: sipush 2220 (0x08AC)
		// @1691: iastore
		// @1692: dup
		// @1693: bipush 6 (0x06)
		// @1695: sipush -5921 (0xE8DF)
		// @1698: iastore
		// @1699: dup
		// @169A: bipush 7 (0x07)
		// @169C: sipush -1850 (0xF8C6)
		// @169F: iastore
		// @16A0: dup
		// @16A1: bipush 8 (0x08)
		// @16A3: iconst_0
		// @16A4: iastore
		// @16A5: dup
		// @16A6: bipush 9 (0x09)
		// @16A8: iconst_0
		// @16A9: iastore
		// @16AA: dup
		// @16AB: bipush 10 (0x0A)
		// @16AD: sipush -9621 (0xDA6B)
		// @16B0: iastore
		// @16B1: dup
		// @16B2: bipush 11 (0x0B)
		// @16B4: sipush -4810 (0xED36)
		// @16B7: iastore
		// @16B8: dup
		// @16B9: bipush 12 (0x0C)
		// @16BB: sipush 4440 (0x1158)
		// @16BE: iastore
		// @16BF: dup
		// @16C0: bipush 13 (0x0D)
		// @16C2: iconst_0
		// @16C3: iastore
		// @16C4: dup
		// @16C5: bipush 14 (0x0E)
		// @16C7: iconst_0
		// @16C8: iastore
		// @16C9: dup
		// @16CA: bipush 15 (0x0F)
		// @16CC: sipush 2960 (0x0B90)
		// @16CF: iastore
		// @16D0: dup
		// @16D1: bipush 16 (0x10)
		// @16D3: sipush -1110 (0xFBAA)
		// @16D6: iastore
		// @16D7: dup
		// @16D8: bipush 17 (0x11)
		// @16DA: sipush -1850 (0xF8C6)
		// @16DD: iastore
		// @16DE: dup
		// @16DF: bipush 18 (0x12)
		// @16E1: sipush -1110 (0xFBAA)
		// @16E4: iastore
		// @16E5: dup
		// @16E6: bipush 19 (0x13)
		// @16E8: sipush -208 (0xFF30)
		// @16EB: iastore
		// @16EC: dup
		// @16ED: bipush 20 (0x14)
		// @16EF: iconst_0
		// @16F0: iastore
		// @16F1: aastore
		// @16F2: aload_0
		// @16F3: bipush 18 (0x12)
		// @16F5: bipush 21 (0x15)
		// @16F7: newarray int[]
		// @16F9: dup
		// @16FA: iconst_0
		// @16FB: sipush -7401 (0xE317)
		// @16FE: iastore
		// @16FF: dup
		// @1700: iconst_1
		// @1701: sipush 1480 (0x05C8)
		// @1704: iastore
		// @1705: dup
		// @1706: iconst_2
		// @1707: iconst_0
		// @1708: iastore
		// @1709: dup
		// @170A: iconst_3
		// @170B: sipush -2960 (0xF470)
		// @170E: iastore
		// @170F: dup
		// @1710: iconst_4
		// @1711: sipush -5550 (0xEA52)
		// @1714: iastore
		// @1715: dup
		// @1716: iconst_5
		// @1717: sipush -8511 (0xDEC1)
		// @171A: iastore
		// @171B: dup
		// @171C: bipush 6 (0x06)
		// @171E: sipush -1850 (0xF8C6)
		// @1721: iastore
		// @1722: dup
		// @1723: bipush 7 (0x07)
		// @1725: sipush -5921 (0xE8DF)
		// @1728: iastore
		// @1729: dup
		// @172A: bipush 8 (0x08)
		// @172C: sipush -9251 (0xDBDD)
		// @172F: iastore
		// @1730: dup
		// @1731: bipush 9 (0x09)
		// @1733: sipush -8881 (0xDD4F)
		// @1736: iastore
		// @1737: dup
		// @1738: bipush 10 (0x0A)
		// @173A: sipush -8881 (0xDD4F)
		// @173D: iastore
		// @173E: dup
		// @173F: bipush 11 (0x0B)
		// @1741: sipush -14432 (0xC7A0)
		// @1744: iastore
		// @1745: dup
		// @1746: bipush 12 (0x0C)
		// @1748: sipush -7401 (0xE317)
		// @174B: iastore
		// @174C: dup
		// @174D: bipush 13 (0x0D)
		// @174F: sipush -8141 (0xE033)
		// @1752: iastore
		// @1753: dup
		// @1754: bipush 14 (0x0E)
		// @1756: sipush 12952 (0x3298)
		// @1759: iastore
		// @175A: dup
		// @175B: bipush 15 (0x0F)
		// @175D: iconst_0
		// @175E: iastore
		// @175F: dup
		// @1760: bipush 16 (0x10)
		// @1762: sipush -5921 (0xE8DF)
		// @1765: iastore
		// @1766: dup
		// @1767: bipush 17 (0x11)
		// @1769: sipush 740 (0x02E4)
		// @176C: iastore
		// @176D: dup
		// @176E: bipush 18 (0x12)
		// @1770: sipush -7771 (0xE1A5)
		// @1773: iastore
		// @1774: dup
		// @1775: bipush 19 (0x13)
		// @1777: sipush -156 (0xFF64)
		// @177A: iastore
		// @177B: dup
		// @177C: bipush 20 (0x14)
		// @177E: iconst_0
		// @177F: iastore
		// @1780: aastore
		// @1781: aload_0
		// @1782: iconst_0
		// @1783: bipush 21 (0x15)
		// @1785: newarray int[]
		// @1787: dup
		// @1788: iconst_0
		// @1789: sipush -740 (0xFD1C)
		// @178C: iastore
		// @178D: dup
		// @178E: iconst_1
		// @178F: iconst_0
		// @1790: iastore
		// @1791: dup
		// @1792: iconst_2
		// @1793: sipush -1110 (0xFBAA)
		// @1796: iastore
		// @1797: dup
		// @1798: iconst_3
		// @1799: iconst_0
		// @179A: iastore
		// @179B: dup
		// @179C: iconst_4
		// @179D: iconst_0
		// @179E: iastore
		// @179F: dup
		// @17A0: iconst_5
		// @17A1: sipush 1110 (0x0456)
		// @17A4: iastore
		// @17A5: dup
		// @17A6: bipush 6 (0x06)
		// @17A8: sipush 3700 (0x0E74)
		// @17AB: iastore
		// @17AC: dup
		// @17AD: bipush 7 (0x07)
		// @17AF: sipush 9251 (0x2423)
		// @17B2: iastore
		// @17B3: dup
		// @17B4: bipush 8 (0x08)
		// @17B6: iconst_0
		// @17B7: iastore
		// @17B8: dup
		// @17B9: bipush 9 (0x09)
		// @17BB: iconst_0
		// @17BC: iastore
		// @17BD: dup
		// @17BE: bipush 10 (0x0A)
		// @17C0: iconst_0
		// @17C1: iastore
		// @17C2: dup
		// @17C3: bipush 11 (0x0B)
		// @17C5: iconst_0
		// @17C6: iastore
		// @17C7: dup
		// @17C8: bipush 12 (0x0C)
		// @17CA: iconst_0
		// @17CB: iastore
		// @17CC: dup
		// @17CD: bipush 13 (0x0D)
		// @17CF: iconst_0
		// @17D0: iastore
		// @17D1: dup
		// @17D2: bipush 14 (0x0E)
		// @17D4: sipush -2220 (0xF754)
		// @17D7: iastore
		// @17D8: dup
		// @17D9: bipush 15 (0x0F)
		// @17DB: sipush -2960 (0xF470)
		// @17DE: iastore
		// @17DF: dup
		// @17E0: bipush 16 (0x10)
		// @17E2: sipush 1110 (0x0456)
		// @17E5: iastore
		// @17E6: dup
		// @17E7: bipush 17 (0x11)
		// @17E9: iconst_0
		// @17EA: iastore
		// @17EB: dup
		// @17EC: bipush 18 (0x12)
		// @17EE: iconst_0
		// @17EF: iastore
		// @17F0: dup
		// @17F1: bipush 19 (0x13)
		// @17F3: bipush -104 (0x98)
		// @17F5: iastore
		// @17F6: dup
		// @17F7: bipush 20 (0x14)
		// @17F9: iconst_0
		// @17FA: iastore
		// @17FB: aastore
		// @17FC: aload_0
		// @17FD: bipush 17 (0x11)
		// @17FF: bipush 21 (0x15)
		// @1801: newarray int[]
		// @1803: dup
		// @1804: iconst_0
		// @1805: sipush -9251 (0xDBDD)
		// @1808: iastore
		// @1809: dup
		// @180A: iconst_1
		// @180B: iconst_0
		// @180C: iastore
		// @180D: dup
		// @180E: iconst_2
		// @180F: sipush 9991 (0x2707)
		// @1812: iastore
		// @1813: dup
		// @1814: iconst_3
		// @1815: sipush -3700 (0xF18C)
		// @1818: iastore
		// @1819: dup
		// @181A: iconst_4
		// @181B: sipush -5180 (0xEBC4)
		// @181E: iastore
		// @181F: dup
		// @1820: iconst_5
		// @1821: sipush -5921 (0xE8DF)
		// @1824: iastore
		// @1825: dup
		// @1826: bipush 6 (0x06)
		// @1828: sipush -740 (0xFD1C)
		// @182B: iastore
		// @182C: dup
		// @182D: bipush 7 (0x07)
		// @182F: sipush 1850 (0x073A)
		// @1832: iastore
		// @1833: dup
		// @1834: bipush 8 (0x08)
		// @1836: sipush -1850 (0xF8C6)
		// @1839: iastore
		// @183A: dup
		// @183B: bipush 9 (0x09)
		// @183D: sipush 1480 (0x05C8)
		// @1840: iastore
		// @1841: dup
		// @1842: bipush 10 (0x0A)
		// @1844: sipush -8881 (0xDD4F)
		// @1847: iastore
		// @1848: dup
		// @1849: bipush 11 (0x0B)
		// @184B: sipush -17392 (0xBC10)
		// @184E: iastore
		// @184F: dup
		// @1850: bipush 12 (0x0C)
		// @1852: sipush -8881 (0xDD4F)
		// @1855: iastore
		// @1856: dup
		// @1857: bipush 13 (0x0D)
		// @1859: sipush -6291 (0xE76D)
		// @185C: iastore
		// @185D: dup
		// @185E: bipush 14 (0x0E)
		// @1860: sipush 6661 (0x1A05)
		// @1863: iastore
		// @1864: dup
		// @1865: bipush 15 (0x0F)
		// @1867: sipush 1850 (0x073A)
		// @186A: iastore
		// @186B: dup
		// @186C: bipush 16 (0x10)
		// @186E: sipush -3330 (0xF2FE)
		// @1871: iastore
		// @1872: dup
		// @1873: bipush 17 (0x11)
		// @1875: sipush -740 (0xFD1C)
		// @1878: iastore
		// @1879: dup
		// @187A: bipush 18 (0x12)
		// @187C: sipush -7771 (0xE1A5)
		// @187F: iastore
		// @1880: dup
		// @1881: bipush 19 (0x13)
		// @1883: sipush 208 (0x00D0)
		// @1886: iastore
		// @1887: dup
		// @1888: bipush 20 (0x14)
		// @188A: iconst_0
		// @188B: iastore
		// @188C: aastore
		// @188D: aload_0
		// @188E: iconst_3
		// @188F: bipush 21 (0x15)
		// @1891: newarray int[]
		// @1893: dup
		// @1894: iconst_0
		// @1895: iconst_0
		// @1896: iastore
		// @1897: dup
		// @1898: iconst_1
		// @1899: sipush -1110 (0xFBAA)
		// @189C: iastore
		// @189D: dup
		// @189E: iconst_2
		// @189F: sipush -2590 (0xF5E2)
		// @18A2: iastore
		// @18A3: dup
		// @18A4: iconst_3
		// @18A5: sipush -3330 (0xF2FE)
		// @18A8: iastore
		// @18A9: dup
		// @18AA: iconst_4
		// @18AB: sipush -1480 (0xFA38)
		// @18AE: iastore
		// @18AF: dup
		// @18B0: iconst_5
		// @18B1: sipush 740 (0x02E4)
		// @18B4: iastore
		// @18B5: dup
		// @18B6: bipush 6 (0x06)
		// @18B8: sipush -2220 (0xF754)
		// @18BB: iastore
		// @18BC: dup
		// @18BD: bipush 7 (0x07)
		// @18BF: sipush -4070 (0xF01A)
		// @18C2: iastore
		// @18C3: dup
		// @18C4: bipush 8 (0x08)
		// @18C6: iconst_0
		// @18C7: iastore
		// @18C8: dup
		// @18C9: bipush 9 (0x09)
		// @18CB: iconst_0
		// @18CC: iastore
		// @18CD: dup
		// @18CE: bipush 10 (0x0A)
		// @18D0: sipush -4440 (0xEEA8)
		// @18D3: iastore
		// @18D4: dup
		// @18D5: bipush 11 (0x0B)
		// @18D7: sipush -1850 (0xF8C6)
		// @18DA: iastore
		// @18DB: dup
		// @18DC: bipush 12 (0x0C)
		// @18DE: iconst_0
		// @18DF: iastore
		// @18E0: dup
		// @18E1: bipush 13 (0x0D)
		// @18E3: iconst_0
		// @18E4: iastore
		// @18E5: dup
		// @18E6: bipush 14 (0x0E)
		// @18E8: sipush 5550 (0x15AE)
		// @18EB: iastore
		// @18EC: dup
		// @18ED: bipush 15 (0x0F)
		// @18EF: sipush 9991 (0x2707)
		// @18F2: iastore
		// @18F3: dup
		// @18F4: bipush 16 (0x10)
		// @18F6: sipush 3330 (0x0D02)
		// @18F9: iastore
		// @18FA: dup
		// @18FB: bipush 17 (0x11)
		// @18FD: sipush 5550 (0x15AE)
		// @1900: iastore
		// @1901: dup
		// @1902: bipush 18 (0x12)
		// @1904: sipush -740 (0xFD1C)
		// @1907: iastore
		// @1908: dup
		// @1909: bipush 19 (0x13)
		// @190B: iconst_0
		// @190C: iastore
		// @190D: dup
		// @190E: bipush 20 (0x14)
		// @1910: iconst_0
		// @1911: iastore
		// @1912: aastore
		// @1913: aload_0
		// @1914: iconst_4
		// @1915: bipush 21 (0x15)
		// @1917: newarray int[]
		// @1919: dup
		// @191A: iconst_0
		// @191B: iconst_0
		// @191C: iastore
		// @191D: dup
		// @191E: iconst_1
		// @191F: sipush -2960 (0xF470)
		// @1922: iastore
		// @1923: dup
		// @1924: iconst_2
		// @1925: sipush -5550 (0xEA52)
		// @1928: iastore
		// @1929: dup
		// @192A: iconst_3
		// @192B: sipush -4070 (0xF01A)
		// @192E: iastore
		// @192F: dup
		// @1930: iconst_4
		// @1931: sipush -1480 (0xFA38)
		// @1934: iastore
		// @1935: dup
		// @1936: iconst_5
		// @1937: sipush 2220 (0x08AC)
		// @193A: iastore
		// @193B: dup
		// @193C: bipush 6 (0x06)
		// @193E: sipush -2590 (0xF5E2)
		// @1941: iastore
		// @1942: dup
		// @1943: bipush 7 (0x07)
		// @1945: sipush 1850 (0x073A)
		// @1948: iastore
		// @1949: dup
		// @194A: bipush 8 (0x08)
		// @194C: iconst_0
		// @194D: iastore
		// @194E: dup
		// @194F: bipush 9 (0x09)
		// @1951: iconst_0
		// @1952: iastore
		// @1953: dup
		// @1954: bipush 10 (0x0A)
		// @1956: sipush -3330 (0xF2FE)
		// @1959: iastore
		// @195A: dup
		// @195B: bipush 11 (0x0B)
		// @195D: iconst_0
		// @195E: iastore
		// @195F: dup
		// @1960: bipush 12 (0x0C)
		// @1962: iconst_0
		// @1963: iastore
		// @1964: dup
		// @1965: bipush 13 (0x0D)
		// @1967: iconst_0
		// @1968: iastore
		// @1969: dup
		// @196A: bipush 14 (0x0E)
		// @196C: sipush 5550 (0x15AE)
		// @196F: iastore
		// @1970: dup
		// @1971: bipush 15 (0x0F)
		// @1973: sipush 7771 (0x1E5B)
		// @1976: iastore
		// @1977: dup
		// @1978: bipush 16 (0x10)
		// @197A: iconst_0
		// @197B: iastore
		// @197C: dup
		// @197D: bipush 17 (0x11)
		// @197F: sipush 1480 (0x05C8)
		// @1982: iastore
		// @1983: dup
		// @1984: bipush 18 (0x12)
		// @1986: sipush -740 (0xFD1C)
		// @1989: iastore
		// @198A: dup
		// @198B: bipush 19 (0x13)
		// @198D: sipush -312 (0xFEC8)
		// @1990: iastore
		// @1991: dup
		// @1992: bipush 20 (0x14)
		// @1994: iconst_0
		// @1995: iastore
		// @1996: aastore
		// @1997: aload_0
		// @1998: iconst_1
		// @1999: bipush 21 (0x15)
		// @199B: newarray int[]
		// @199D: dup
		// @199E: iconst_0
		// @199F: sipush 1480 (0x05C8)
		// @19A2: iastore
		// @19A3: dup
		// @19A4: iconst_1
		// @19A5: sipush 2590 (0x0A1E)
		// @19A8: iastore
		// @19A9: dup
		// @19AA: iconst_2
		// @19AB: sipush 4440 (0x1158)
		// @19AE: iastore
		// @19AF: dup
		// @19B0: iconst_3
		// @19B1: iconst_0
		// @19B2: iastore
		// @19B3: dup
		// @19B4: iconst_4
		// @19B5: iconst_0
		// @19B6: iastore
		// @19B7: dup
		// @19B8: iconst_5
		// @19B9: iconst_0
		// @19BA: iastore
		// @19BB: dup
		// @19BC: bipush 6 (0x06)
		// @19BE: sipush 4440 (0x1158)
		// @19C1: iastore
		// @19C2: dup
		// @19C3: bipush 7 (0x07)
		// @19C5: sipush -1480 (0xFA38)
		// @19C8: iastore
		// @19C9: dup
		// @19CA: bipush 8 (0x08)
		// @19CC: sipush -3330 (0xF2FE)
		// @19CF: iastore
		// @19D0: dup
		// @19D1: bipush 9 (0x09)
		// @19D3: sipush 1110 (0x0456)
		// @19D6: iastore
		// @19D7: dup
		// @19D8: bipush 10 (0x0A)
		// @19DA: sipush -5921 (0xE8DF)
		// @19DD: iastore
		// @19DE: dup
		// @19DF: bipush 11 (0x0B)
		// @19E1: sipush -8511 (0xDEC1)
		// @19E4: iastore
		// @19E5: dup
		// @19E6: bipush 12 (0x0C)
		// @19E8: sipush -4070 (0xF01A)
		// @19EB: iastore
		// @19EC: dup
		// @19ED: bipush 13 (0x0D)
		// @19EF: sipush -2960 (0xF470)
		// @19F2: iastore
		// @19F3: dup
		// @19F4: bipush 14 (0x0E)
		// @19F6: sipush 5550 (0x15AE)
		// @19F9: iastore
		// @19FA: dup
		// @19FB: bipush 15 (0x0F)
		// @19FD: sipush 5921 (0x1721)
		// @1A00: iastore
		// @1A01: dup
		// @1A02: bipush 16 (0x10)
		// @1A04: iconst_0
		// @1A05: iastore
		// @1A06: dup
		// @1A07: bipush 17 (0x11)
		// @1A09: iconst_0
		// @1A0A: iastore
		// @1A0B: dup
		// @1A0C: bipush 18 (0x12)
		// @1A0E: iconst_0
		// @1A0F: iastore
		// @1A10: dup
		// @1A11: bipush 19 (0x13)
		// @1A13: iconst_0
		// @1A14: iastore
		// @1A15: dup
		// @1A16: bipush 20 (0x14)
		// @1A18: iconst_0
		// @1A19: iastore
		// @1A1A: aastore
		// @1A1B: aload_0
		// @1A1C: bipush 19 (0x13)
		// @1A1E: bipush 21 (0x15)
		// @1A20: newarray int[]
		// @1A22: dup
		// @1A23: iconst_0
		// @1A24: sipush -9621 (0xDA6B)
		// @1A27: iastore
		// @1A28: dup
		// @1A29: iconst_1
		// @1A2A: sipush 4810 (0x12CA)
		// @1A2D: iastore
		// @1A2E: dup
		// @1A2F: iconst_2
		// @1A30: sipush -3700 (0xF18C)
		// @1A33: iastore
		// @1A34: dup
		// @1A35: iconst_3
		// @1A36: sipush -1110 (0xFBAA)
		// @1A39: iastore
		// @1A3A: dup
		// @1A3B: iconst_4
		// @1A3C: sipush -8511 (0xDEC1)
		// @1A3F: iastore
		// @1A40: dup
		// @1A41: iconst_5
		// @1A42: sipush -3330 (0xF2FE)
		// @1A45: iastore
		// @1A46: dup
		// @1A47: bipush 6 (0x06)
		// @1A49: sipush -740 (0xFD1C)
		// @1A4C: iastore
		// @1A4D: dup
		// @1A4E: bipush 7 (0x07)
		// @1A50: sipush 3700 (0x0E74)
		// @1A53: iastore
		// @1A54: dup
		// @1A55: bipush 8 (0x08)
		// @1A57: sipush -8141 (0xE033)
		// @1A5A: iastore
		// @1A5B: dup
		// @1A5C: bipush 9 (0x09)
		// @1A5E: sipush -3700 (0xF18C)
		// @1A61: iastore
		// @1A62: dup
		// @1A63: bipush 10 (0x0A)
		// @1A65: sipush -3700 (0xF18C)
		// @1A68: iastore
		// @1A69: dup
		// @1A6A: bipush 11 (0x0B)
		// @1A6C: sipush -11101 (0xD4A3)
		// @1A6F: iastore
		// @1A70: dup
		// @1A71: bipush 12 (0x0C)
		// @1A73: sipush -8881 (0xDD4F)
		// @1A76: iastore
		// @1A77: dup
		// @1A78: bipush 13 (0x0D)
		// @1A7A: sipush -7031 (0xE489)
		// @1A7D: iastore
		// @1A7E: dup
		// @1A7F: bipush 14 (0x0E)
		// @1A81: sipush 2960 (0x0B90)
		// @1A84: iastore
		// @1A85: dup
		// @1A86: bipush 15 (0x0F)
		// @1A88: sipush -7771 (0xE1A5)
		// @1A8B: iastore
		// @1A8C: dup
		// @1A8D: bipush 16 (0x10)
		// @1A8F: sipush 4070 (0x0FE6)
		// @1A92: iastore
		// @1A93: dup
		// @1A94: bipush 17 (0x11)
		// @1A96: sipush 740 (0x02E4)
		// @1A99: iastore
		// @1A9A: dup
		// @1A9B: bipush 18 (0x12)
		// @1A9D: sipush -7771 (0xE1A5)
		// @1AA0: iastore
		// @1AA1: dup
		// @1AA2: bipush 19 (0x13)
		// @1AA4: bipush -104 (0x98)
		// @1AA6: iastore
		// @1AA7: dup
		// @1AA8: bipush 20 (0x14)
		// @1AAA: iconst_0
		// @1AAB: iastore
		// @1AAC: aastore
		// @1AAD: aload_0
		// @1AAE: bipush 15 (0x0F)
		// @1AB0: bipush 21 (0x15)
		// @1AB2: newarray int[]
		// @1AB4: dup
		// @1AB5: iconst_0
		// @1AB6: sipush -3330 (0xF2FE)
		// @1AB9: iastore
		// @1ABA: dup
		// @1ABB: iconst_1
		// @1ABC: sipush -4810 (0xED36)
		// @1ABF: iastore
		// @1AC0: dup
		// @1AC1: iconst_2
		// @1AC2: sipush 2220 (0x08AC)
		// @1AC5: iastore
		// @1AC6: dup
		// @1AC7: iconst_3
		// @1AC8: sipush 2960 (0x0B90)
		// @1ACB: iastore
		// @1ACC: dup
		// @1ACD: iconst_4
		// @1ACE: iconst_0
		// @1ACF: iastore
		// @1AD0: dup
		// @1AD1: iconst_5
		// @1AD2: sipush -1480 (0xFA38)
		// @1AD5: iastore
		// @1AD6: dup
		// @1AD7: bipush 6 (0x06)
		// @1AD9: sipush 2960 (0x0B90)
		// @1ADC: iastore
		// @1ADD: dup
		// @1ADE: bipush 7 (0x07)
		// @1AE0: sipush 9251 (0x2423)
		// @1AE3: iastore
		// @1AE4: dup
		// @1AE5: bipush 8 (0x08)
		// @1AE7: sipush -2220 (0xF754)
		// @1AEA: iastore
		// @1AEB: dup
		// @1AEC: bipush 9 (0x09)
		// @1AEE: sipush -1850 (0xF8C6)
		// @1AF1: iastore
		// @1AF2: dup
		// @1AF3: bipush 10 (0x0A)
		// @1AF5: sipush 740 (0x02E4)
		// @1AF8: iastore
		// @1AF9: dup
		// @1AFA: bipush 11 (0x0B)
		// @1AFC: sipush -2220 (0xF754)
		// @1AFF: iastore
		// @1B00: dup
		// @1B01: bipush 12 (0x0C)
		// @1B03: sipush 2590 (0x0A1E)
		// @1B06: iastore
		// @1B07: dup
		// @1B08: bipush 13 (0x0D)
		// @1B0A: sipush 740 (0x02E4)
		// @1B0D: iastore
		// @1B0E: dup
		// @1B0F: bipush 14 (0x0E)
		// @1B11: sipush -9991 (0xD8F9)
		// @1B14: iastore
		// @1B15: dup
		// @1B16: bipush 15 (0x0F)
		// @1B18: sipush -3700 (0xF18C)
		// @1B1B: iastore
		// @1B1C: dup
		// @1B1D: bipush 16 (0x10)
		// @1B1F: sipush -1850 (0xF8C6)
		// @1B22: iastore
		// @1B23: dup
		// @1B24: bipush 17 (0x11)
		// @1B26: sipush 1850 (0x073A)
		// @1B29: iastore
		// @1B2A: dup
		// @1B2B: bipush 18 (0x12)
		// @1B2D: sipush 740 (0x02E4)
		// @1B30: iastore
		// @1B31: dup
		// @1B32: bipush 19 (0x13)
		// @1B34: sipush -468 (0xFE2C)
		// @1B37: iastore
		// @1B38: dup
		// @1B39: bipush 20 (0x14)
		// @1B3B: iconst_0
		// @1B3C: iastore
		// @1B3D: aastore
		// @1B3E: aload_0
		// @1B3F: bipush 22 (0x16)
		// @1B41: bipush 21 (0x15)
		// @1B43: newarray int[]
		// @1B45: dup
		// @1B46: iconst_0
		// @1B47: sipush -9251 (0xDBDD)
		// @1B4A: iastore
		// @1B4B: dup
		// @1B4C: iconst_1
		// @1B4D: sipush -8511 (0xDEC1)
		// @1B50: iastore
		// @1B51: dup
		// @1B52: iconst_2
		// @1B53: sipush -17392 (0xBC10)
		// @1B56: iastore
		// @1B57: dup
		// @1B58: iconst_3
		// @1B59: sipush -3700 (0xF18C)
		// @1B5C: iastore
		// @1B5D: dup
		// @1B5E: iconst_4
		// @1B5F: sipush -7401 (0xE317)
		// @1B62: iastore
		// @1B63: dup
		// @1B64: iconst_5
		// @1B65: sipush -7401 (0xE317)
		// @1B68: iastore
		// @1B69: dup
		// @1B6A: bipush 6 (0x06)
		// @1B6C: sipush -2590 (0xF5E2)
		// @1B6F: iastore
		// @1B70: dup
		// @1B71: bipush 7 (0x07)
		// @1B73: sipush 1850 (0x073A)
		// @1B76: iastore
		// @1B77: dup
		// @1B78: bipush 8 (0x08)
		// @1B7A: sipush -3330 (0xF2FE)
		// @1B7D: iastore
		// @1B7E: dup
		// @1B7F: bipush 9 (0x09)
		// @1B81: sipush -7771 (0xE1A5)
		// @1B84: iastore
		// @1B85: dup
		// @1B86: bipush 10 (0x0A)
		// @1B88: sipush -24424 (0xA098)
		// @1B8B: iastore
		// @1B8C: dup
		// @1B8D: bipush 11 (0x0B)
		// @1B8F: sipush -17392 (0xBC10)
		// @1B92: iastore
		// @1B93: dup
		// @1B94: bipush 12 (0x0C)
		// @1B96: sipush -9621 (0xDA6B)
		// @1B99: iastore
		// @1B9A: dup
		// @1B9B: bipush 13 (0x0D)
		// @1B9D: sipush -7401 (0xE317)
		// @1BA0: iastore
		// @1BA1: dup
		// @1BA2: bipush 14 (0x0E)
		// @1BA4: sipush 6661 (0x1A05)
		// @1BA7: iastore
		// @1BA8: dup
		// @1BA9: bipush 15 (0x0F)
		// @1BAB: sipush -740 (0xFD1C)
		// @1BAE: iastore
		// @1BAF: dup
		// @1BB0: bipush 16 (0x10)
		// @1BB2: sipush -3330 (0xF2FE)
		// @1BB5: iastore
		// @1BB6: dup
		// @1BB7: bipush 17 (0x11)
		// @1BB9: sipush -740 (0xFD1C)
		// @1BBC: iastore
		// @1BBD: dup
		// @1BBE: bipush 18 (0x12)
		// @1BC0: sipush -7771 (0xE1A5)
		// @1BC3: iastore
		// @1BC4: dup
		// @1BC5: bipush 19 (0x13)
		// @1BC7: sipush 208 (0x00D0)
		// @1BCA: iastore
		// @1BCB: dup
		// @1BCC: bipush 20 (0x14)
		// @1BCE: iconst_0
		// @1BCF: iastore
		// @1BD0: aastore
		// @1BD1: aload_0
		// @1BD2: bipush 23 (0x17)
		// @1BD4: bipush 21 (0x15)
		// @1BD6: newarray int[]
		// @1BD8: dup
		// @1BD9: iconst_0
		// @1BDA: sipush -9251 (0xDBDD)
		// @1BDD: iastore
		// @1BDE: dup
		// @1BDF: iconst_1
		// @1BE0: sipush -740 (0xFD1C)
		// @1BE3: iastore
		// @1BE4: dup
		// @1BE5: iconst_2
		// @1BE6: sipush -9251 (0xDBDD)
		// @1BE9: iastore
		// @1BEA: dup
		// @1BEB: iconst_3
		// @1BEC: sipush -5921 (0xE8DF)
		// @1BEF: iastore
		// @1BF0: dup
		// @1BF1: iconst_4
		// @1BF2: sipush -8881 (0xDD4F)
		// @1BF5: iastore
		// @1BF6: dup
		// @1BF7: iconst_5
		// @1BF8: sipush -5921 (0xE8DF)
		// @1BFB: iastore
		// @1BFC: dup
		// @1BFD: bipush 6 (0x06)
		// @1BFF: sipush -740 (0xFD1C)
		// @1C02: iastore
		// @1C03: dup
		// @1C04: bipush 7 (0x07)
		// @1C06: sipush 1850 (0x073A)
		// @1C09: iastore
		// @1C0A: dup
		// @1C0B: bipush 8 (0x08)
		// @1C0D: sipush -1850 (0xF8C6)
		// @1C10: iastore
		// @1C11: dup
		// @1C12: bipush 9 (0x09)
		// @1C14: sipush 1480 (0x05C8)
		// @1C17: iastore
		// @1C18: dup
		// @1C19: bipush 10 (0x0A)
		// @1C1B: sipush -7771 (0xE1A5)
		// @1C1E: iastore
		// @1C1F: dup
		// @1C20: bipush 11 (0x0B)
		// @1C22: sipush -17763 (0xBA9D)
		// @1C25: iastore
		// @1C26: dup
		// @1C27: bipush 12 (0x0C)
		// @1C29: sipush -8881 (0xDD4F)
		// @1C2C: iastore
		// @1C2D: dup
		// @1C2E: bipush 13 (0x0D)
		// @1C30: sipush -6291 (0xE76D)
		// @1C33: iastore
		// @1C34: dup
		// @1C35: bipush 14 (0x0E)
		// @1C37: sipush 6661 (0x1A05)
		// @1C3A: iastore
		// @1C3B: dup
		// @1C3C: bipush 15 (0x0F)
		// @1C3E: sipush 1850 (0x073A)
		// @1C41: iastore
		// @1C42: dup
		// @1C43: bipush 16 (0x10)
		// @1C45: sipush -3330 (0xF2FE)
		// @1C48: iastore
		// @1C49: dup
		// @1C4A: bipush 17 (0x11)
		// @1C4C: sipush -740 (0xFD1C)
		// @1C4F: iastore
		// @1C50: dup
		// @1C51: bipush 18 (0x12)
		// @1C53: sipush -7771 (0xE1A5)
		// @1C56: iastore
		// @1C57: dup
		// @1C58: bipush 19 (0x13)
		// @1C5A: sipush 208 (0x00D0)
		// @1C5D: iastore
		// @1C5E: dup
		// @1C5F: bipush 20 (0x14)
		// @1C61: iconst_0
		// @1C62: iastore
		// @1C63: aastore
		// @1C64: aload_0
		// @1C65: bipush 10 (0x0A)
		// @1C67: bipush 21 (0x15)
		// @1C69: newarray int[]
		// @1C6B: dup
		// @1C6C: iconst_0
		// @1C6D: iconst_0
		// @1C6E: iastore
		// @1C6F: dup
		// @1C70: iconst_1
		// @1C71: sipush 4440 (0x1158)
		// @1C74: iastore
		// @1C75: dup
		// @1C76: iconst_2
		// @1C77: sipush 9251 (0x2423)
		// @1C7A: iastore
		// @1C7B: dup
		// @1C7C: iconst_3
		// @1C7D: sipush 3330 (0x0D02)
		// @1C80: iastore
		// @1C81: dup
		// @1C82: iconst_4
		// @1C83: sipush 5550 (0x15AE)
		// @1C86: iastore
		// @1C87: dup
		// @1C88: iconst_5
		// @1C89: iconst_0
		// @1C8A: iastore
		// @1C8B: dup
		// @1C8C: bipush 6 (0x06)
		// @1C8E: sipush -1110 (0xFBAA)
		// @1C91: iastore
		// @1C92: dup
		// @1C93: bipush 7 (0x07)
		// @1C95: sipush 740 (0x02E4)
		// @1C98: iastore
		// @1C99: dup
		// @1C9A: bipush 8 (0x08)
		// @1C9C: iconst_0
		// @1C9D: iastore
		// @1C9E: dup
		// @1C9F: bipush 9 (0x09)
		// @1CA1: iconst_0
		// @1CA2: iastore
		// @1CA3: dup
		// @1CA4: bipush 10 (0x0A)
		// @1CA6: sipush -1850 (0xF8C6)
		// @1CA9: iastore
		// @1CAA: dup
		// @1CAB: bipush 11 (0x0B)
		// @1CAD: sipush -3330 (0xF2FE)
		// @1CB0: iastore
		// @1CB1: dup
		// @1CB2: bipush 12 (0x0C)
		// @1CB4: sipush -1850 (0xF8C6)
		// @1CB7: iastore
		// @1CB8: dup
		// @1CB9: bipush 13 (0x0D)
		// @1CBB: iconst_0
		// @1CBC: iastore
		// @1CBD: dup
		// @1CBE: bipush 14 (0x0E)
		// @1CC0: sipush 740 (0x02E4)
		// @1CC3: iastore
		// @1CC4: dup
		// @1CC5: bipush 15 (0x0F)
		// @1CC7: sipush 6291 (0x1893)
		// @1CCA: iastore
		// @1CCB: dup
		// @1CCC: bipush 16 (0x10)
		// @1CCE: iconst_0
		// @1CCF: iastore
		// @1CD0: dup
		// @1CD1: bipush 17 (0x11)
		// @1CD3: iconst_0
		// @1CD4: iastore
		// @1CD5: dup
		// @1CD6: bipush 18 (0x12)
		// @1CD8: sipush 3700 (0x0E74)
		// @1CDB: iastore
		// @1CDC: dup
		// @1CDD: bipush 19 (0x13)
		// @1CDF: sipush -156 (0xFF64)
		// @1CE2: iastore
		// @1CE3: dup
		// @1CE4: bipush 20 (0x14)
		// @1CE6: iconst_0
		// @1CE7: iastore
		// @1CE8: aastore
		// @1CE9: aload_0
		// @1CEA: bipush 13 (0x0D)
		// @1CEC: bipush 21 (0x15)
		// @1CEE: newarray int[]
		// @1CF0: dup
		// @1CF1: iconst_0
		// @1CF2: iconst_0
		// @1CF3: iastore
		// @1CF4: dup
		// @1CF5: iconst_1
		// @1CF6: iconst_0
		// @1CF7: iastore
		// @1CF8: dup
		// @1CF9: iconst_2
		// @1CFA: iconst_0
		// @1CFB: iastore
		// @1CFC: dup
		// @1CFD: iconst_3
		// @1CFE: iconst_0
		// @1CFF: iastore
		// @1D00: dup
		// @1D01: iconst_4
		// @1D02: iconst_0
		// @1D03: iastore
		// @1D04: dup
		// @1D05: iconst_5
		// @1D06: iconst_0
		// @1D07: iastore
		// @1D08: dup
		// @1D09: bipush 6 (0x06)
		// @1D0B: iconst_0
		// @1D0C: iastore
		// @1D0D: dup
		// @1D0E: bipush 7 (0x07)
		// @1D10: iconst_0
		// @1D11: iastore
		// @1D12: dup
		// @1D13: bipush 8 (0x08)
		// @1D15: iconst_0
		// @1D16: iastore
		// @1D17: dup
		// @1D18: bipush 9 (0x09)
		// @1D1A: iconst_0
		// @1D1B: iastore
		// @1D1C: dup
		// @1D1D: bipush 10 (0x0A)
		// @1D1F: iconst_0
		// @1D20: iastore
		// @1D21: dup
		// @1D22: bipush 11 (0x0B)
		// @1D24: iconst_0
		// @1D25: iastore
		// @1D26: dup
		// @1D27: bipush 12 (0x0C)
		// @1D29: iconst_0
		// @1D2A: iastore
		// @1D2B: dup
		// @1D2C: bipush 13 (0x0D)
		// @1D2E: iconst_0
		// @1D2F: iastore
		// @1D30: dup
		// @1D31: bipush 14 (0x0E)
		// @1D33: iconst_0
		// @1D34: iastore
		// @1D35: dup
		// @1D36: bipush 15 (0x0F)
		// @1D38: iconst_0
		// @1D39: iastore
		// @1D3A: dup
		// @1D3B: bipush 16 (0x10)
		// @1D3D: iconst_0
		// @1D3E: iastore
		// @1D3F: dup
		// @1D40: bipush 17 (0x11)
		// @1D42: iconst_0
		// @1D43: iastore
		// @1D44: dup
		// @1D45: bipush 18 (0x12)
		// @1D47: sipush -2220 (0xF754)
		// @1D4A: iastore
		// @1D4B: dup
		// @1D4C: bipush 19 (0x13)
		// @1D4E: iconst_0
		// @1D4F: iastore
		// @1D50: dup
		// @1D51: bipush 20 (0x14)
		// @1D53: iconst_0
		// @1D54: iastore
		// @1D55: aastore
		// @1D56: aload_0
		// @1D57: bipush 20 (0x14)
		// @1D59: bipush 21 (0x15)
		// @1D5B: newarray int[]
		// @1D5D: dup
		// @1D5E: iconst_0
		// @1D5F: sipush -9251 (0xDBDD)
		// @1D62: iastore
		// @1D63: dup
		// @1D64: iconst_1
		// @1D65: sipush -17763 (0xBA9D)
		// @1D68: iastore
		// @1D69: dup
		// @1D6A: iconst_2
		// @1D6B: sipush -17763 (0xBA9D)
		// @1D6E: iastore
		// @1D6F: dup
		// @1D70: iconst_3
		// @1D71: sipush -5921 (0xE8DF)
		// @1D74: iastore
		// @1D75: dup
		// @1D76: iconst_4
		// @1D77: sipush -5550 (0xEA52)
		// @1D7A: iastore
		// @1D7B: dup
		// @1D7C: iconst_5
		// @1D7D: sipush -7031 (0xE489)
		// @1D80: iastore
		// @1D81: dup
		// @1D82: bipush 6 (0x06)
		// @1D84: sipush -1110 (0xFBAA)
		// @1D87: iastore
		// @1D88: dup
		// @1D89: bipush 7 (0x07)
		// @1D8B: sipush -7771 (0xE1A5)
		// @1D8E: iastore
		// @1D8F: dup
		// @1D90: bipush 8 (0x08)
		// @1D92: sipush -1480 (0xFA38)
		// @1D95: iastore
		// @1D96: dup
		// @1D97: bipush 9 (0x09)
		// @1D99: sipush -4440 (0xEEA8)
		// @1D9C: iastore
		// @1D9D: dup
		// @1D9E: bipush 10 (0x0A)
		// @1DA0: sipush -2220 (0xF754)
		// @1DA3: iastore
		// @1DA4: dup
		// @1DA5: bipush 11 (0x0B)
		// @1DA7: sipush -2960 (0xF470)
		// @1DAA: iastore
		// @1DAB: dup
		// @1DAC: bipush 12 (0x0C)
		// @1DAE: sipush -9621 (0xDA6B)
		// @1DB1: iastore
		// @1DB2: dup
		// @1DB3: bipush 13 (0x0D)
		// @1DB5: sipush -6291 (0xE76D)
		// @1DB8: iastore
		// @1DB9: dup
		// @1DBA: bipush 14 (0x0E)
		// @1DBC: iconst_0
		// @1DBD: iastore
		// @1DBE: dup
		// @1DBF: bipush 15 (0x0F)
		// @1DC1: sipush 3700 (0x0E74)
		// @1DC4: iastore
		// @1DC5: dup
		// @1DC6: bipush 16 (0x10)
		// @1DC8: sipush 3700 (0x0E74)
		// @1DCB: iastore
		// @1DCC: dup
		// @1DCD: bipush 17 (0x11)
		// @1DCF: sipush -740 (0xFD1C)
		// @1DD2: iastore
		// @1DD3: dup
		// @1DD4: bipush 18 (0x12)
		// @1DD6: sipush -7771 (0xE1A5)
		// @1DD9: iastore
		// @1DDA: dup
		// @1DDB: bipush 19 (0x13)
		// @1DDD: sipush -468 (0xFE2C)
		// @1DE0: iastore
		// @1DE1: dup
		// @1DE2: bipush 20 (0x14)
		// @1DE4: iconst_0
		// @1DE5: iastore
		// @1DE6: aastore
		// @1DE7: aload_0
		// @1DE8: bipush 12 (0x0C)
		// @1DEA: bipush 21 (0x15)
		// @1DEC: newarray int[]
		// @1DEE: dup
		// @1DEF: iconst_0
		// @1DF0: sipush -3330 (0xF2FE)
		// @1DF3: iastore
		// @1DF4: dup
		// @1DF5: iconst_1
		// @1DF6: sipush -9251 (0xDBDD)
		// @1DF9: iastore
		// @1DFA: dup
		// @1DFB: iconst_2
		// @1DFC: sipush -5180 (0xEBC4)
		// @1DFF: iastore
		// @1E00: dup
		// @1E01: iconst_3
		// @1E02: iconst_0
		// @1E03: iastore
		// @1E04: dup
		// @1E05: iconst_4
		// @1E06: iconst_0
		// @1E07: iastore
		// @1E08: dup
		// @1E09: iconst_5
		// @1E0A: iconst_0
		// @1E0B: iastore
		// @1E0C: dup
		// @1E0D: bipush 6 (0x06)
		// @1E0F: sipush -4070 (0xF01A)
		// @1E12: iastore
		// @1E13: dup
		// @1E14: bipush 7 (0x07)
		// @1E16: sipush -1480 (0xFA38)
		// @1E19: iastore
		// @1E1A: dup
		// @1E1B: bipush 8 (0x08)
		// @1E1D: iconst_0
		// @1E1E: iastore
		// @1E1F: dup
		// @1E20: bipush 9 (0x09)
		// @1E22: iconst_0
		// @1E23: iastore
		// @1E24: dup
		// @1E25: bipush 10 (0x0A)
		// @1E27: sipush 2590 (0x0A1E)
		// @1E2A: iastore
		// @1E2B: dup
		// @1E2C: bipush 11 (0x0B)
		// @1E2E: sipush 6291 (0x1893)
		// @1E31: iastore
		// @1E32: dup
		// @1E33: bipush 12 (0x0C)
		// @1E35: iconst_0
		// @1E36: iastore
		// @1E37: dup
		// @1E38: bipush 13 (0x0D)
		// @1E3A: iconst_0
		// @1E3B: iastore
		// @1E3C: dup
		// @1E3D: bipush 14 (0x0E)
		// @1E3F: sipush 740 (0x02E4)
		// @1E42: iastore
		// @1E43: dup
		// @1E44: bipush 15 (0x0F)
		// @1E46: sipush 9251 (0x2423)
		// @1E49: iastore
		// @1E4A: dup
		// @1E4B: bipush 16 (0x10)
		// @1E4D: iconst_0
		// @1E4E: iastore
		// @1E4F: dup
		// @1E50: bipush 17 (0x11)
		// @1E52: iconst_0
		// @1E53: iastore
		// @1E54: dup
		// @1E55: bipush 18 (0x12)
		// @1E57: sipush 3330 (0x0D02)
		// @1E5A: iastore
		// @1E5B: dup
		// @1E5C: bipush 19 (0x13)
		// @1E5E: iconst_0
		// @1E5F: iastore
		// @1E60: dup
		// @1E61: bipush 20 (0x14)
		// @1E63: iconst_0
		// @1E64: iastore
		// @1E65: aastore
		// @1E66: aload_0
		// @1E67: iconst_2
		// @1E68: bipush 21 (0x15)
		// @1E6A: newarray int[]
		// @1E6C: dup
		// @1E6D: iconst_0
		// @1E6E: iconst_0
		// @1E6F: iastore
		// @1E70: dup
		// @1E71: iconst_1
		// @1E72: sipush 6291 (0x1893)
		// @1E75: iastore
		// @1E76: dup
		// @1E77: iconst_2
		// @1E78: sipush 8141 (0x1FCD)
		// @1E7B: iastore
		// @1E7C: dup
		// @1E7D: iconst_3
		// @1E7E: iconst_0
		// @1E7F: iastore
		// @1E80: dup
		// @1E81: iconst_4
		// @1E82: sipush 2590 (0x0A1E)
		// @1E85: iastore
		// @1E86: dup
		// @1E87: iconst_5
		// @1E88: sipush 740 (0x02E4)
		// @1E8B: iastore
		// @1E8C: dup
		// @1E8D: bipush 6 (0x06)
		// @1E8F: sipush 1110 (0x0456)
		// @1E92: iastore
		// @1E93: dup
		// @1E94: bipush 7 (0x07)
		// @1E96: sipush -5550 (0xEA52)
		// @1E99: iastore
		// @1E9A: dup
		// @1E9B: bipush 8 (0x08)
		// @1E9D: sipush -2220 (0xF754)
		// @1EA0: iastore
		// @1EA1: dup
		// @1EA2: bipush 9 (0x09)
		// @1EA4: iconst_0
		// @1EA5: iastore
		// @1EA6: dup
		// @1EA7: bipush 10 (0x0A)
		// @1EA9: sipush -6661 (0xE5FB)
		// @1EAC: iastore
		// @1EAD: dup
		// @1EAE: bipush 11 (0x0B)
		// @1EB0: sipush -5921 (0xE8DF)
		// @1EB3: iastore
		// @1EB4: dup
		// @1EB5: bipush 12 (0x0C)
		// @1EB7: sipush -740 (0xFD1C)
		// @1EBA: iastore
		// @1EBB: dup
		// @1EBC: bipush 13 (0x0D)
		// @1EBE: iconst_0
		// @1EBF: iastore
		// @1EC0: dup
		// @1EC1: bipush 14 (0x0E)
		// @1EC3: sipush 7031 (0x1B77)
		// @1EC6: iastore
		// @1EC7: dup
		// @1EC8: bipush 15 (0x0F)
		// @1ECA: sipush 10361 (0x2879)
		// @1ECD: iastore
		// @1ECE: dup
		// @1ECF: bipush 16 (0x10)
		// @1ED1: iconst_0
		// @1ED2: iastore
		// @1ED3: dup
		// @1ED4: bipush 17 (0x11)
		// @1ED6: iconst_0
		// @1ED7: iastore
		// @1ED8: dup
		// @1ED9: bipush 18 (0x12)
		// @1EDB: sipush -740 (0xFD1C)
		// @1EDE: iastore
		// @1EDF: dup
		// @1EE0: bipush 19 (0x13)
		// @1EE2: sipush 208 (0x00D0)
		// @1EE5: iastore
		// @1EE6: dup
		// @1EE7: bipush 20 (0x14)
		// @1EE9: iconst_0
		// @1EEA: iastore
		// @1EEB: aastore
		// @1EEC: aload_0
		// @1EED: bipush 21 (0x15)
		// @1EEF: bipush 21 (0x15)
		// @1EF1: newarray int[]
		// @1EF3: dup
		// @1EF4: iconst_0
		// @1EF5: sipush -9251 (0xDBDD)
		// @1EF8: iastore
		// @1EF9: dup
		// @1EFA: iconst_1
		// @1EFB: sipush -13322 (0xCBF6)
		// @1EFE: iastore
		// @1EFF: dup
		// @1F00: iconst_2
		// @1F01: sipush -17763 (0xBA9D)
		// @1F04: iastore
		// @1F05: dup
		// @1F06: iconst_3
		// @1F07: sipush -9251 (0xDBDD)
		// @1F0A: iastore
		// @1F0B: dup
		// @1F0C: iconst_4
		// @1F0D: sipush -8881 (0xDD4F)
		// @1F10: iastore
		// @1F11: dup
		// @1F12: iconst_5
		// @1F13: sipush -5921 (0xE8DF)
		// @1F16: iastore
		// @1F17: dup
		// @1F18: bipush 6 (0x06)
		// @1F1A: sipush -740 (0xFD1C)
		// @1F1D: iastore
		// @1F1E: dup
		// @1F1F: bipush 7 (0x07)
		// @1F21: sipush 1850 (0x073A)
		// @1F24: iastore
		// @1F25: dup
		// @1F26: bipush 8 (0x08)
		// @1F28: sipush -1850 (0xF8C6)
		// @1F2B: iastore
		// @1F2C: dup
		// @1F2D: bipush 9 (0x09)
		// @1F2F: sipush 1480 (0x05C8)
		// @1F32: iastore
		// @1F33: dup
		// @1F34: bipush 10 (0x0A)
		// @1F36: sipush 2590 (0x0A1E)
		// @1F39: iastore
		// @1F3A: dup
		// @1F3B: bipush 11 (0x0B)
		// @1F3D: sipush -3700 (0xF18C)
		// @1F40: iastore
		// @1F41: dup
		// @1F42: bipush 12 (0x0C)
		// @1F44: sipush -8881 (0xDD4F)
		// @1F47: iastore
		// @1F48: dup
		// @1F49: bipush 13 (0x0D)
		// @1F4B: sipush -6291 (0xE76D)
		// @1F4E: iastore
		// @1F4F: dup
		// @1F50: bipush 14 (0x0E)
		// @1F52: sipush 6661 (0x1A05)
		// @1F55: iastore
		// @1F56: dup
		// @1F57: bipush 15 (0x0F)
		// @1F59: sipush 1850 (0x073A)
		// @1F5C: iastore
		// @1F5D: dup
		// @1F5E: bipush 16 (0x10)
		// @1F60: sipush -3330 (0xF2FE)
		// @1F63: iastore
		// @1F64: dup
		// @1F65: bipush 17 (0x11)
		// @1F67: sipush -740 (0xFD1C)
		// @1F6A: iastore
		// @1F6B: dup
		// @1F6C: bipush 18 (0x12)
		// @1F6E: sipush -7771 (0xE1A5)
		// @1F71: iastore
		// @1F72: dup
		// @1F73: bipush 19 (0x13)
		// @1F75: sipush 208 (0x00D0)
		// @1F78: iastore
		// @1F79: dup
		// @1F7A: bipush 20 (0x14)
		// @1F7C: iconst_0
		// @1F7D: iastore
		// @1F7E: aastore
		// @1F7F: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @1F82: iconst_4
		// @1F83: aaload
		// @1F84: astore_0
		// @1F85: aload_0
		// @1F86: bipush 25 (0x19)
		// @1F88: bipush 8 (0x08)
		// @1F8A: newarray int[]
		// @1F8C: dup
		// @1F8D: iconst_0
		// @1F8E: bipush 23 (0x17)
		// @1F90: iastore
		// @1F91: dup
		// @1F92: iconst_1
		// @1F93: iconst_5
		// @1F94: iastore
		// @1F95: dup
		// @1F96: iconst_2
		// @1F97: bipush 10 (0x0A)
		// @1F99: iastore
		// @1F9A: dup
		// @1F9B: iconst_3
		// @1F9C: bipush 8 (0x08)
		// @1F9E: iastore
		// @1F9F: dup
		// @1FA0: iconst_4
		// @1FA1: iconst_3
		// @1FA2: iastore
		// @1FA3: dup
		// @1FA4: iconst_5
		// @1FA5: bipush 10 (0x0A)
		// @1FA7: iastore
		// @1FA8: dup
		// @1FA9: bipush 6 (0x06)
		// @1FAB: iconst_5
		// @1FAC: iastore
		// @1FAD: dup
		// @1FAE: bipush 7 (0x07)
		// @1FB0: bipush 8 (0x08)
		// @1FB2: iastore
		// @1FB3: aastore
		// @1FB4: aload_0
		// @1FB5: bipush 6 (0x06)
		// @1FB7: bipush 9 (0x09)
		// @1FB9: newarray int[]
		// @1FBB: dup
		// @1FBC: iconst_0
		// @1FBD: sipush -4070 (0xF01A)
		// @1FC0: iastore
		// @1FC1: dup
		// @1FC2: iconst_1
		// @1FC3: sipush 10731 (0x29EB)
		// @1FC6: iastore
		// @1FC7: dup
		// @1FC8: iconst_2
		// @1FC9: sipush 15542 (0x3CB6)
		// @1FCC: iastore
		// @1FCD: dup
		// @1FCE: iconst_3
		// @1FCF: sipush -5921 (0xE8DF)
		// @1FD2: iastore
		// @1FD3: dup
		// @1FD4: iconst_4
		// @1FD5: sipush 3330 (0x0D02)
		// @1FD8: iastore
		// @1FD9: dup
		// @1FDA: iconst_5
		// @1FDB: iconst_0
		// @1FDC: iastore
		// @1FDD: dup
		// @1FDE: bipush 6 (0x06)
		// @1FE0: sipush 364 (0x016C)
		// @1FE3: iastore
		// @1FE4: dup
		// @1FE5: bipush 7 (0x07)
		// @1FE7: sipush 468 (0x01D4)
		// @1FEA: iastore
		// @1FEB: dup
		// @1FEC: bipush 8 (0x08)
		// @1FEE: sipush 1041 (0x0411)
		// @1FF1: iastore
		// @1FF2: aastore
		// @1FF3: aload_0
		// @1FF4: bipush 17 (0x11)
		// @1FF6: bipush 9 (0x09)
		// @1FF8: newarray int[]
		// @1FFA: dup
		// @1FFB: iconst_0
		// @1FFC: sipush -11842 (0xD1BE)
		// @1FFF: iastore
		// @2000: dup
		// @2001: iconst_1
		// @2002: sipush -1110 (0xFBAA)
		// @2005: iastore
		// @2006: dup
		// @2007: iconst_2
		// @2008: sipush -7771 (0xE1A5)
		// @200B: iastore
		// @200C: dup
		// @200D: iconst_3
		// @200E: sipush -2960 (0xF470)
		// @2011: iastore
		// @2012: dup
		// @2013: iconst_4
		// @2014: sipush -740 (0xFD1C)
		// @2017: iastore
		// @2018: dup
		// @2019: iconst_5
		// @201A: sipush -6661 (0xE5FB)
		// @201D: iastore
		// @201E: dup
		// @201F: bipush 6 (0x06)
		// @2021: sipush 5180 (0x143C)
		// @2024: iastore
		// @2025: dup
		// @2026: bipush 7 (0x07)
		// @2028: sipush -885 (0xFC8B)
		// @202B: iastore
		// @202C: dup
		// @202D: bipush 8 (0x08)
		// @202F: sipush -1718 (0xF94A)
		// @2032: iastore
		// @2033: aastore
		// @2034: aload_0
		// @2035: bipush 14 (0x0E)
		// @2037: bipush 9 (0x09)
		// @2039: newarray int[]
		// @203B: dup
		// @203C: iconst_0
		// @203D: sipush 4810 (0x12CA)
		// @2040: iastore
		// @2041: dup
		// @2042: iconst_1
		// @2043: sipush 4440 (0x1158)
		// @2046: iastore
		// @2047: dup
		// @2048: iconst_2
		// @2049: sipush 12952 (0x3298)
		// @204C: iastore
		// @204D: dup
		// @204E: iconst_3
		// @204F: sipush -11101 (0xD4A3)
		// @2052: iastore
		// @2053: dup
		// @2054: iconst_4
		// @2055: sipush 740 (0x02E4)
		// @2058: iastore
		// @2059: dup
		// @205A: iconst_5
		// @205B: sipush 12582 (0x3126)
		// @205E: iastore
		// @205F: dup
		// @2060: bipush 6 (0x06)
		// @2062: sipush -885 (0xFC8B)
		// @2065: iastore
		// @2066: dup
		// @2067: bipush 7 (0x07)
		// @2069: iconst_0
		// @206A: iastore
		// @206B: dup
		// @206C: bipush 8 (0x08)
		// @206E: iconst_0
		// @206F: iastore
		// @2070: aastore
		// @2071: aload_0
		// @2072: bipush 21 (0x15)
		// @2074: bipush 9 (0x09)
		// @2076: newarray int[]
		// @2078: dup
		// @2079: iconst_0
		// @207A: sipush -2960 (0xF470)
		// @207D: iastore
		// @207E: dup
		// @207F: iconst_1
		// @2080: sipush 1110 (0x0456)
		// @2083: iastore
		// @2084: dup
		// @2085: iconst_2
		// @2086: sipush -6661 (0xE5FB)
		// @2089: iastore
		// @208A: dup
		// @208B: iconst_3
		// @208C: sipush -12952 (0xCD68)
		// @208F: iastore
		// @2090: dup
		// @2091: iconst_4
		// @2092: sipush -4070 (0xF01A)
		// @2095: iastore
		// @2096: dup
		// @2097: iconst_5
		// @2098: sipush -8141 (0xE033)
		// @209B: iastore
		// @209C: dup
		// @209D: bipush 6 (0x06)
		// @209F: sipush 7401 (0x1CE9)
		// @20A2: iastore
		// @20A3: dup
		// @20A4: bipush 7 (0x07)
		// @20A6: sipush -937 (0xFC57)
		// @20A9: iastore
		// @20AA: dup
		// @20AB: bipush 8 (0x08)
		// @20AD: sipush -2500 (0xF63C)
		// @20B0: iastore
		// @20B1: aastore
		// @20B2: aload_0
		// @20B3: bipush 23 (0x17)
		// @20B5: bipush 9 (0x09)
		// @20B7: newarray int[]
		// @20B9: dup
		// @20BA: iconst_0
		// @20BB: sipush -9621 (0xDA6B)
		// @20BE: iastore
		// @20BF: dup
		// @20C0: iconst_1
		// @20C1: sipush 4070 (0x0FE6)
		// @20C4: iastore
		// @20C5: dup
		// @20C6: iconst_2
		// @20C7: sipush 10731 (0x29EB)
		// @20CA: iastore
		// @20CB: dup
		// @20CC: iconst_3
		// @20CD: sipush -8881 (0xDD4F)
		// @20D0: iastore
		// @20D1: dup
		// @20D2: iconst_4
		// @20D3: sipush -1110 (0xFBAA)
		// @20D6: iastore
		// @20D7: dup
		// @20D8: iconst_5
		// @20D9: sipush -7771 (0xE1A5)
		// @20DC: iastore
		// @20DD: dup
		// @20DE: bipush 6 (0x06)
		// @20E0: sipush 4440 (0x1158)
		// @20E3: iastore
		// @20E4: dup
		// @20E5: bipush 7 (0x07)
		// @20E7: sipush -625 (0xFD8F)
		// @20EA: iastore
		// @20EB: dup
		// @20EC: bipush 8 (0x08)
		// @20EE: sipush -1770 (0xF916)
		// @20F1: iastore
		// @20F2: aastore
		// @20F3: aload_0
		// @20F4: bipush 11 (0x0B)
		// @20F6: bipush 9 (0x09)
		// @20F8: newarray int[]
		// @20FA: dup
		// @20FB: iconst_0
		// @20FC: sipush 1110 (0x0456)
		// @20FF: iastore
		// @2100: dup
		// @2101: iconst_1
		// @2102: sipush 7031 (0x1B77)
		// @2105: iastore
		// @2106: dup
		// @2107: iconst_2
		// @2108: iconst_0
		// @2109: iastore
		// @210A: dup
		// @210B: iconst_3
		// @210C: sipush -3330 (0xF2FE)
		// @210F: iastore
		// @2110: dup
		// @2111: iconst_4
		// @2112: sipush 10361 (0x2879)
		// @2115: iastore
		// @2116: dup
		// @2117: iconst_5
		// @2118: sipush 17763 (0x4563)
		// @211B: iastore
		// @211C: dup
		// @211D: bipush 6 (0x06)
		// @211F: iconst_0
		// @2120: iastore
		// @2121: dup
		// @2122: bipush 7 (0x07)
		// @2124: sipush 156 (0x009C)
		// @2127: iastore
		// @2128: dup
		// @2129: bipush 8 (0x08)
		// @212B: sipush 677 (0x02A5)
		// @212E: iastore
		// @212F: aastore
		// @2130: aload_0
		// @2131: bipush 18 (0x12)
		// @2133: bipush 9 (0x09)
		// @2135: newarray int[]
		// @2137: dup
		// @2138: iconst_0
		// @2139: sipush -11471 (0xD331)
		// @213C: iastore
		// @213D: dup
		// @213E: iconst_1
		// @213F: sipush -1850 (0xF8C6)
		// @2142: iastore
		// @2143: dup
		// @2144: iconst_2
		// @2145: sipush -8141 (0xE033)
		// @2148: iastore
		// @2149: dup
		// @214A: iconst_3
		// @214B: sipush -8511 (0xDEC1)
		// @214E: iastore
		// @214F: dup
		// @2150: iconst_4
		// @2151: sipush 3330 (0x0D02)
		// @2154: iastore
		// @2155: dup
		// @2156: iconst_5
		// @2157: sipush 11471 (0x2CCF)
		// @215A: iastore
		// @215B: dup
		// @215C: bipush 6 (0x06)
		// @215E: sipush 7031 (0x1B77)
		// @2161: iastore
		// @2162: dup
		// @2163: bipush 7 (0x07)
		// @2165: sipush -885 (0xFC8B)
		// @2168: iastore
		// @2169: dup
		// @216A: bipush 8 (0x08)
		// @216C: sipush -2500 (0xF63C)
		// @216F: iastore
		// @2170: aastore
		// @2171: aload_0
		// @2172: iconst_2
		// @2173: bipush 9 (0x09)
		// @2175: newarray int[]
		// @2177: dup
		// @2178: iconst_0
		// @2179: sipush -8141 (0xE033)
		// @217C: iastore
		// @217D: dup
		// @217E: iconst_1
		// @217F: sipush 1480 (0x05C8)
		// @2182: iastore
		// @2183: dup
		// @2184: iconst_2
		// @2185: iconst_0
		// @2186: iastore
		// @2187: dup
		// @2188: iconst_3
		// @2189: sipush 1480 (0x05C8)
		// @218C: iastore
		// @218D: dup
		// @218E: iconst_4
		// @218F: sipush 12952 (0x3298)
		// @2192: iastore
		// @2193: dup
		// @2194: iconst_5
		// @2195: sipush 11471 (0x2CCF)
		// @2198: iastore
		// @2199: dup
		// @219A: bipush 6 (0x06)
		// @219C: sipush 1850 (0x073A)
		// @219F: iastore
		// @21A0: dup
		// @21A1: bipush 7 (0x07)
		// @21A3: sipush 520 (0x0208)
		// @21A6: iastore
		// @21A7: dup
		// @21A8: bipush 8 (0x08)
		// @21AA: bipush 104 (0x68)
		// @21AC: iastore
		// @21AD: aastore
		// @21AE: aload_0
		// @21AF: bipush 7 (0x07)
		// @21B1: bipush 9 (0x09)
		// @21B3: newarray int[]
		// @21B5: dup
		// @21B6: iconst_0
		// @21B7: sipush -6291 (0xE76D)
		// @21BA: iastore
		// @21BB: dup
		// @21BC: iconst_1
		// @21BD: sipush 7771 (0x1E5B)
		// @21C0: iastore
		// @21C1: dup
		// @21C2: iconst_2
		// @21C3: sipush 11471 (0x2CCF)
		// @21C6: iastore
		// @21C7: dup
		// @21C8: iconst_3
		// @21C9: sipush -2220 (0xF754)
		// @21CC: iastore
		// @21CD: dup
		// @21CE: iconst_4
		// @21CF: sipush 3330 (0x0D02)
		// @21D2: iastore
		// @21D3: dup
		// @21D4: iconst_5
		// @21D5: iconst_0
		// @21D6: iastore
		// @21D7: dup
		// @21D8: bipush 6 (0x06)
		// @21DA: sipush -740 (0xFD1C)
		// @21DD: iastore
		// @21DE: dup
		// @21DF: bipush 7 (0x07)
		// @21E1: bipush 104 (0x68)
		// @21E3: iastore
		// @21E4: dup
		// @21E5: bipush 8 (0x08)
		// @21E7: sipush 1250 (0x04E2)
		// @21EA: iastore
		// @21EB: aastore
		// @21EC: aload_0
		// @21ED: bipush 12 (0x0C)
		// @21EF: bipush 8 (0x08)
		// @21F1: newarray int[]
		// @21F3: dup
		// @21F4: iconst_0
		// @21F5: iconst_0
		// @21F6: iastore
		// @21F7: dup
		// @21F8: iconst_1
		// @21F9: iconst_0
		// @21FA: iastore
		// @21FB: dup
		// @21FC: iconst_2
		// @21FD: iconst_0
		// @21FE: iastore
		// @21FF: dup
		// @2200: iconst_3
		// @2201: iconst_0
		// @2202: iastore
		// @2203: dup
		// @2204: iconst_4
		// @2205: iconst_0
		// @2206: iastore
		// @2207: dup
		// @2208: iconst_5
		// @2209: iconst_0
		// @220A: iastore
		// @220B: dup
		// @220C: bipush 6 (0x06)
		// @220E: iconst_0
		// @220F: iastore
		// @2210: dup
		// @2211: bipush 7 (0x07)
		// @2213: iconst_0
		// @2214: iastore
		// @2215: aastore
		// @2216: aload_0
		// @2217: bipush 22 (0x16)
		// @2219: bipush 9 (0x09)
		// @221B: newarray int[]
		// @221D: dup
		// @221E: iconst_0
		// @221F: sipush -5921 (0xE8DF)
		// @2222: iastore
		// @2223: dup
		// @2224: iconst_1
		// @2225: sipush 2590 (0x0A1E)
		// @2228: iastore
		// @2229: dup
		// @222A: iconst_2
		// @222B: iconst_0
		// @222C: iastore
		// @222D: dup
		// @222E: iconst_3
		// @222F: sipush -12212 (0xD04C)
		// @2232: iastore
		// @2233: dup
		// @2234: iconst_4
		// @2235: sipush -5921 (0xE8DF)
		// @2238: iastore
		// @2239: dup
		// @223A: iconst_5
		// @223B: sipush -7771 (0xE1A5)
		// @223E: iastore
		// @223F: dup
		// @2240: bipush 6 (0x06)
		// @2242: sipush 6661 (0x1A05)
		// @2245: iastore
		// @2246: dup
		// @2247: bipush 7 (0x07)
		// @2249: sipush -677 (0xFD5B)
		// @224C: iastore
		// @224D: dup
		// @224E: bipush 8 (0x08)
		// @2250: sipush -2500 (0xF63C)
		// @2253: iastore
		// @2254: aastore
		// @2255: aload_0
		// @2256: bipush 15 (0x0F)
		// @2258: bipush 8 (0x08)
		// @225A: newarray int[]
		// @225C: dup
		// @225D: iconst_0
		// @225E: sipush 2960 (0x0B90)
		// @2261: iastore
		// @2262: dup
		// @2263: iconst_1
		// @2264: sipush 17763 (0x4563)
		// @2267: iastore
		// @2268: dup
		// @2269: iconst_2
		// @226A: sipush 25904 (0x6530)
		// @226D: iastore
		// @226E: dup
		// @226F: iconst_3
		// @2270: sipush -13322 (0xCBF6)
		// @2273: iastore
		// @2274: dup
		// @2275: iconst_4
		// @2276: sipush -2960 (0xF470)
		// @2279: iastore
		// @227A: dup
		// @227B: iconst_5
		// @227C: sipush 740 (0x02E4)
		// @227F: iastore
		// @2280: dup
		// @2281: bipush 6 (0x06)
		// @2283: sipush -1093 (0xFBBB)
		// @2286: iastore
		// @2287: dup
		// @2288: bipush 7 (0x07)
		// @228A: iconst_0
		// @228B: iastore
		// @228C: aastore
		// @228D: aload_0
		// @228E: bipush 9 (0x09)
		// @2290: bipush 9 (0x09)
		// @2292: newarray int[]
		// @2294: dup
		// @2295: iconst_0
		// @2296: sipush -10731 (0xD615)
		// @2299: iastore
		// @229A: dup
		// @229B: iconst_1
		// @229C: iconst_0
		// @229D: iastore
		// @229E: dup
		// @229F: iconst_2
		// @22A0: iconst_0
		// @22A1: iastore
		// @22A2: dup
		// @22A3: iconst_3
		// @22A4: sipush -1110 (0xFBAA)
		// @22A7: iastore
		// @22A8: dup
		// @22A9: iconst_4
		// @22AA: sipush 12582 (0x3126)
		// @22AD: iastore
		// @22AE: dup
		// @22AF: iconst_5
		// @22B0: iconst_0
		// @22B1: iastore
		// @22B2: dup
		// @22B3: bipush 6 (0x06)
		// @22B5: sipush 677 (0x02A5)
		// @22B8: iastore
		// @22B9: dup
		// @22BA: bipush 7 (0x07)
		// @22BC: sipush 885 (0x0375)
		// @22BF: iastore
		// @22C0: dup
		// @22C1: bipush 8 (0x08)
		// @22C3: sipush -1614 (0xF9B2)
		// @22C6: iastore
		// @22C7: aastore
		// @22C8: aload_0
		// @22C9: bipush 20 (0x14)
		// @22CB: bipush 9 (0x09)
		// @22CD: newarray int[]
		// @22CF: dup
		// @22D0: iconst_0
		// @22D1: sipush -4810 (0xED36)
		// @22D4: iastore
		// @22D5: dup
		// @22D6: iconst_1
		// @22D7: sipush 2590 (0x0A1E)
		// @22DA: iastore
		// @22DB: dup
		// @22DC: iconst_2
		// @22DD: sipush -8881 (0xDD4F)
		// @22E0: iastore
		// @22E1: dup
		// @22E2: iconst_3
		// @22E3: sipush -17392 (0xBC10)
		// @22E6: iastore
		// @22E7: dup
		// @22E8: iconst_4
		// @22E9: sipush -2590 (0xF5E2)
		// @22EC: iastore
		// @22ED: dup
		// @22EE: iconst_5
		// @22EF: sipush -2590 (0xF5E2)
		// @22F2: iastore
		// @22F3: dup
		// @22F4: bipush 6 (0x06)
		// @22F6: sipush 6661 (0x1A05)
		// @22F9: iastore
		// @22FA: dup
		// @22FB: bipush 7 (0x07)
		// @22FD: sipush -989 (0xFC23)
		// @2300: iastore
		// @2301: dup
		// @2302: bipush 8 (0x08)
		// @2304: sipush -1979 (0xF845)
		// @2307: iastore
		// @2308: aastore
		// @2309: aload_0
		// @230A: bipush 19 (0x13)
		// @230C: bipush 9 (0x09)
		// @230E: newarray int[]
		// @2310: dup
		// @2311: iconst_0
		// @2312: sipush -7771 (0xE1A5)
		// @2315: iastore
		// @2316: dup
		// @2317: iconst_1
		// @2318: sipush -1480 (0xFA38)
		// @231B: iastore
		// @231C: dup
		// @231D: iconst_2
		// @231E: sipush -7401 (0xE317)
		// @2321: iastore
		// @2322: dup
		// @2323: iconst_3
		// @2324: sipush -7401 (0xE317)
		// @2327: iastore
		// @2328: dup
		// @2329: iconst_4
		// @232A: sipush -740 (0xFD1C)
		// @232D: iastore
		// @232E: dup
		// @232F: iconst_5
		// @2330: sipush 8881 (0x22B1)
		// @2333: iastore
		// @2334: dup
		// @2335: bipush 6 (0x06)
		// @2337: sipush 7031 (0x1B77)
		// @233A: iastore
		// @233B: dup
		// @233C: bipush 7 (0x07)
		// @233E: sipush -1145 (0xFB87)
		// @2341: iastore
		// @2342: dup
		// @2343: bipush 8 (0x08)
		// @2345: sipush -2500 (0xF63C)
		// @2348: iastore
		// @2349: aastore
		// @234A: aload_0
		// @234B: iconst_1
		// @234C: bipush 9 (0x09)
		// @234E: newarray int[]
		// @2350: dup
		// @2351: iconst_0
		// @2352: sipush -8141 (0xE033)
		// @2355: iastore
		// @2356: dup
		// @2357: iconst_1
		// @2358: sipush -740 (0xFD1C)
		// @235B: iastore
		// @235C: dup
		// @235D: iconst_2
		// @235E: iconst_0
		// @235F: iastore
		// @2360: dup
		// @2361: iconst_3
		// @2362: sipush 2220 (0x08AC)
		// @2365: iastore
		// @2366: dup
		// @2367: iconst_4
		// @2368: sipush 9621 (0x2595)
		// @236B: iastore
		// @236C: dup
		// @236D: iconst_5
		// @236E: iconst_0
		// @236F: iastore
		// @2370: dup
		// @2371: bipush 6 (0x06)
		// @2373: sipush 2220 (0x08AC)
		// @2376: iastore
		// @2377: dup
		// @2378: bipush 7 (0x07)
		// @237A: sipush 572 (0x023C)
		// @237D: iastore
		// @237E: dup
		// @237F: bipush 8 (0x08)
		// @2381: sipush 468 (0x01D4)
		// @2384: iastore
		// @2385: aastore
		// @2386: aload_0
		// @2387: bipush 13 (0x0D)
		// @2389: bipush 8 (0x08)
		// @238B: newarray int[]
		// @238D: dup
		// @238E: iconst_0
		// @238F: iconst_0
		// @2390: iastore
		// @2391: dup
		// @2392: iconst_1
		// @2393: iconst_0
		// @2394: iastore
		// @2395: dup
		// @2396: iconst_2
		// @2397: iconst_0
		// @2398: iastore
		// @2399: dup
		// @239A: iconst_3
		// @239B: iconst_0
		// @239C: iastore
		// @239D: dup
		// @239E: iconst_4
		// @239F: iconst_0
		// @23A0: iastore
		// @23A1: dup
		// @23A2: iconst_5
		// @23A3: iconst_0
		// @23A4: iastore
		// @23A5: dup
		// @23A6: bipush 6 (0x06)
		// @23A8: iconst_0
		// @23A9: iastore
		// @23AA: dup
		// @23AB: bipush 7 (0x07)
		// @23AD: iconst_0
		// @23AE: iastore
		// @23AF: aastore
		// @23B0: aload_0
		// @23B1: iconst_3
		// @23B2: bipush 9 (0x09)
		// @23B4: newarray int[]
		// @23B6: dup
		// @23B7: iconst_0
		// @23B8: sipush -3700 (0xF18C)
		// @23BB: iastore
		// @23BC: dup
		// @23BD: iconst_1
		// @23BE: sipush 3700 (0x0E74)
		// @23C1: iastore
		// @23C2: dup
		// @23C3: iconst_2
		// @23C4: iconst_0
		// @23C5: iastore
		// @23C6: dup
		// @23C7: iconst_3
		// @23C8: sipush -5921 (0xE8DF)
		// @23CB: iastore
		// @23CC: dup
		// @23CD: iconst_4
		// @23CE: sipush 9621 (0x2595)
		// @23D1: iastore
		// @23D2: dup
		// @23D3: iconst_5
		// @23D4: sipush 17022 (0x427E)
		// @23D7: iastore
		// @23D8: dup
		// @23D9: bipush 6 (0x06)
		// @23DB: sipush 740 (0x02E4)
		// @23DE: iastore
		// @23DF: dup
		// @23E0: bipush 7 (0x07)
		// @23E2: sipush 208 (0x00D0)
		// @23E5: iastore
		// @23E6: dup
		// @23E7: bipush 8 (0x08)
		// @23E9: sipush 625 (0x0271)
		// @23EC: iastore
		// @23ED: aastore
		// @23EE: aload_0
		// @23EF: bipush 8 (0x08)
		// @23F1: bipush 9 (0x09)
		// @23F3: newarray int[]
		// @23F5: dup
		// @23F6: iconst_0
		// @23F7: sipush -10361 (0xD787)
		// @23FA: iastore
		// @23FB: dup
		// @23FC: iconst_1
		// @23FD: sipush 4440 (0x1158)
		// @2400: iastore
		// @2401: dup
		// @2402: iconst_2
		// @2403: iconst_0
		// @2404: iastore
		// @2405: dup
		// @2406: iconst_3
		// @2407: sipush -2590 (0xF5E2)
		// @240A: iastore
		// @240B: dup
		// @240C: iconst_4
		// @240D: sipush 7031 (0x1B77)
		// @2410: iastore
		// @2411: dup
		// @2412: iconst_5
		// @2413: iconst_0
		// @2414: iastore
		// @2415: dup
		// @2416: bipush 6 (0x06)
		// @2418: sipush 208 (0x00D0)
		// @241B: iastore
		// @241C: dup
		// @241D: bipush 7 (0x07)
		// @241F: sipush 416 (0x01A0)
		// @2422: iastore
		// @2423: dup
		// @2424: bipush 8 (0x08)
		// @2426: sipush 677 (0x02A5)
		// @2429: iastore
		// @242A: aastore
		// @242B: aload_0
		// @242C: iconst_4
		// @242D: bipush 9 (0x09)
		// @242F: newarray int[]
		// @2431: dup
		// @2432: iconst_0
		// @2433: sipush -1480 (0xFA38)
		// @2436: iastore
		// @2437: dup
		// @2438: iconst_1
		// @2439: sipush 10731 (0x29EB)
		// @243C: iastore
		// @243D: dup
		// @243E: iconst_2
		// @243F: iconst_0
		// @2440: iastore
		// @2441: dup
		// @2442: iconst_3
		// @2443: sipush -9621 (0xDA6B)
		// @2446: iastore
		// @2447: dup
		// @2448: iconst_4
		// @2449: sipush -1110 (0xFBAA)
		// @244C: iastore
		// @244D: dup
		// @244E: iconst_5
		// @244F: sipush -4070 (0xF01A)
		// @2452: iastore
		// @2453: dup
		// @2454: bipush 6 (0x06)
		// @2456: sipush 364 (0x016C)
		// @2459: iastore
		// @245A: dup
		// @245B: bipush 7 (0x07)
		// @245D: sipush 572 (0x023C)
		// @2460: iastore
		// @2461: dup
		// @2462: bipush 8 (0x08)
		// @2464: sipush 937 (0x03A9)
		// @2467: iastore
		// @2468: aastore
		// @2469: aload_0
		// @246A: bipush 10 (0x0A)
		// @246C: bipush 9 (0x09)
		// @246E: newarray int[]
		// @2470: dup
		// @2471: iconst_0
		// @2472: sipush -7771 (0xE1A5)
		// @2475: iastore
		// @2476: dup
		// @2477: iconst_1
		// @2478: sipush 9251 (0x2423)
		// @247B: iastore
		// @247C: dup
		// @247D: iconst_2
		// @247E: iconst_0
		// @247F: iastore
		// @2480: dup
		// @2481: iconst_3
		// @2482: iconst_0
		// @2483: iastore
		// @2484: dup
		// @2485: iconst_4
		// @2486: sipush 17763 (0x4563)
		// @2489: iastore
		// @248A: dup
		// @248B: iconst_5
		// @248C: sipush 12212 (0x2FB4)
		// @248F: iastore
		// @2490: dup
		// @2491: bipush 6 (0x06)
		// @2493: sipush 885 (0x0375)
		// @2496: iastore
		// @2497: dup
		// @2498: bipush 7 (0x07)
		// @249A: sipush 989 (0x03DD)
		// @249D: iastore
		// @249E: dup
		// @249F: bipush 8 (0x08)
		// @24A1: sipush -625 (0xFD8F)
		// @24A4: iastore
		// @24A5: aastore
		// @24A6: aload_0
		// @24A7: bipush 24 (0x18)
		// @24A9: bipush 9 (0x09)
		// @24AB: newarray int[]
		// @24AD: dup
		// @24AE: iconst_0
		// @24AF: sipush -15172 (0xC4BC)
		// @24B2: iastore
		// @24B3: dup
		// @24B4: iconst_1
		// @24B5: iconst_0
		// @24B6: iastore
		// @24B7: dup
		// @24B8: iconst_2
		// @24B9: sipush -3700 (0xF18C)
		// @24BC: iastore
		// @24BD: dup
		// @24BE: iconst_3
		// @24BF: sipush -6291 (0xE76D)
		// @24C2: iastore
		// @24C3: dup
		// @24C4: iconst_4
		// @24C5: sipush -1110 (0xFBAA)
		// @24C8: iastore
		// @24C9: dup
		// @24CA: iconst_5
		// @24CB: sipush -8141 (0xE033)
		// @24CE: iastore
		// @24CF: dup
		// @24D0: bipush 6 (0x06)
		// @24D2: sipush 5550 (0x15AE)
		// @24D5: iastore
		// @24D6: dup
		// @24D7: bipush 7 (0x07)
		// @24D9: sipush -781 (0xFCF3)
		// @24DC: iastore
		// @24DD: dup
		// @24DE: bipush 8 (0x08)
		// @24E0: sipush -2083 (0xF7DD)
		// @24E3: iastore
		// @24E4: aastore
		// @24E5: aload_0
		// @24E6: iconst_0
		// @24E7: bipush 9 (0x09)
		// @24E9: newarray int[]
		// @24EB: dup
		// @24EC: iconst_0
		// @24ED: sipush -8511 (0xDEC1)
		// @24F0: iastore
		// @24F1: dup
		// @24F2: iconst_1
		// @24F3: sipush -1480 (0xFA38)
		// @24F6: iastore
		// @24F7: dup
		// @24F8: iconst_2
		// @24F9: iconst_0
		// @24FA: iastore
		// @24FB: dup
		// @24FC: iconst_3
		// @24FD: sipush 1110 (0x0456)
		// @2500: iastore
		// @2501: dup
		// @2502: iconst_4
		// @2503: sipush 10361 (0x2879)
		// @2506: iastore
		// @2507: dup
		// @2508: iconst_5
		// @2509: iconst_0
		// @250A: iastore
		// @250B: dup
		// @250C: bipush 6 (0x06)
		// @250E: sipush 416 (0x01A0)
		// @2511: iastore
		// @2512: dup
		// @2513: bipush 7 (0x07)
		// @2515: sipush 520 (0x0208)
		// @2518: iastore
		// @2519: dup
		// @251A: bipush 8 (0x08)
		// @251C: sipush 729 (0x02D9)
		// @251F: iastore
		// @2520: aastore
		// @2521: aload_0
		// @2522: iconst_5
		// @2523: bipush 9 (0x09)
		// @2525: newarray int[]
		// @2527: dup
		// @2528: iconst_0
		// @2529: iconst_0
		// @252A: iastore
		// @252B: dup
		// @252C: iconst_1
		// @252D: sipush 14062 (0x36EE)
		// @2530: iastore
		// @2531: dup
		// @2532: iconst_2
		// @2533: sipush 7401 (0x1CE9)
		// @2536: iastore
		// @2537: dup
		// @2538: iconst_3
		// @2539: sipush -7401 (0xE317)
		// @253C: iastore
		// @253D: dup
		// @253E: iconst_4
		// @253F: sipush -1110 (0xFBAA)
		// @2542: iastore
		// @2543: dup
		// @2544: iconst_5
		// @2545: sipush 740 (0x02E4)
		// @2548: iastore
		// @2549: dup
		// @254A: bipush 6 (0x06)
		// @254C: sipush 3330 (0x0D02)
		// @254F: iastore
		// @2550: dup
		// @2551: bipush 7 (0x07)
		// @2553: sipush 468 (0x01D4)
		// @2556: iastore
		// @2557: dup
		// @2558: bipush 8 (0x08)
		// @255A: sipush 208 (0x00D0)
		// @255D: iastore
		// @255E: aastore
		// @255F: aload_0
		// @2560: bipush 16 (0x10)
		// @2562: bipush 8 (0x08)
		// @2564: newarray int[]
		// @2566: dup
		// @2567: iconst_0
		// @2568: sipush 2960 (0x0B90)
		// @256B: iastore
		// @256C: dup
		// @256D: iconst_1
		// @256E: sipush 23684 (0x5C84)
		// @2571: iastore
		// @2572: dup
		// @2573: iconst_2
		// @2574: sipush 28864 (0x70C0)
		// @2577: iastore
		// @2578: dup
		// @2579: iconst_3
		// @257A: sipush -6291 (0xE76D)
		// @257D: iastore
		// @257E: dup
		// @257F: iconst_4
		// @2580: sipush -5921 (0xE8DF)
		// @2583: iastore
		// @2584: dup
		// @2585: iconst_5
		// @2586: sipush -7771 (0xE1A5)
		// @2589: iastore
		// @258A: dup
		// @258B: bipush 6 (0x06)
		// @258D: sipush -1041 (0xFBEF)
		// @2590: iastore
		// @2591: dup
		// @2592: bipush 7 (0x07)
		// @2594: iconst_0
		// @2595: iastore
		// @2596: aastore
		// @2597: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @259A: iconst_5
		// @259B: aaload
		// @259C: astore_0
		// @259D: aload_0
		// @259E: bipush 25 (0x19)
		// @25A0: bipush 8 (0x08)
		// @25A2: newarray int[]
		// @25A4: dup
		// @25A5: iconst_0
		// @25A6: bipush 35 (0x23)
		// @25A8: iastore
		// @25A9: dup
		// @25AA: iconst_1
		// @25AB: bipush 7 (0x07)
		// @25AD: iastore
		// @25AE: dup
		// @25AF: iconst_2
		// @25B0: bipush 52 (0x34)
		// @25B2: iastore
		// @25B3: dup
		// @25B4: iconst_3
		// @25B5: bipush 7 (0x07)
		// @25B7: iastore
		// @25B8: dup
		// @25B9: iconst_4
		// @25BA: iconst_5
		// @25BB: iastore
		// @25BC: dup
		// @25BD: iconst_5
		// @25BE: bipush 35 (0x23)
		// @25C0: iastore
		// @25C1: dup
		// @25C2: bipush 6 (0x06)
		// @25C4: bipush 7 (0x07)
		// @25C6: iastore
		// @25C7: dup
		// @25C8: bipush 7 (0x07)
		// @25CA: bipush 7 (0x07)
		// @25CC: iastore
		// @25CD: aastore
		// @25CE: aload_0
		// @25CF: bipush 24 (0x18)
		// @25D1: bipush 16 (0x10)
		// @25D3: newarray int[]
		// @25D5: dup
		// @25D6: iconst_0
		// @25D7: sipush 740 (0x02E4)
		// @25DA: iastore
		// @25DB: dup
		// @25DC: iconst_1
		// @25DD: iconst_0
		// @25DE: iastore
		// @25DF: dup
		// @25E0: iconst_2
		// @25E1: sipush -5550 (0xEA52)
		// @25E4: iastore
		// @25E5: dup
		// @25E6: iconst_3
		// @25E7: sipush -2960 (0xF470)
		// @25EA: iastore
		// @25EB: dup
		// @25EC: iconst_4
		// @25ED: sipush -4070 (0xF01A)
		// @25F0: iastore
		// @25F1: dup
		// @25F2: iconst_5
		// @25F3: sipush -8141 (0xE033)
		// @25F6: iastore
		// @25F7: dup
		// @25F8: bipush 6 (0x06)
		// @25FA: sipush 1480 (0x05C8)
		// @25FD: iastore
		// @25FE: dup
		// @25FF: bipush 7 (0x07)
		// @2601: sipush -5180 (0xEBC4)
		// @2604: iastore
		// @2605: dup
		// @2606: bipush 8 (0x08)
		// @2608: sipush 6291 (0x1893)
		// @260B: iastore
		// @260C: dup
		// @260D: bipush 9 (0x09)
		// @260F: iconst_0
		// @2610: iastore
		// @2611: dup
		// @2612: bipush 10 (0x0A)
		// @2614: sipush 2220 (0x08AC)
		// @2617: iastore
		// @2618: dup
		// @2619: bipush 11 (0x0B)
		// @261B: sipush -3700 (0xF18C)
		// @261E: iastore
		// @261F: dup
		// @2620: bipush 12 (0x0C)
		// @2622: sipush 1110 (0x0456)
		// @2625: iastore
		// @2626: dup
		// @2627: bipush 13 (0x0D)
		// @2629: iconst_0
		// @262A: iastore
		// @262B: dup
		// @262C: bipush 14 (0x0E)
		// @262E: iconst_0
		// @262F: iastore
		// @2630: dup
		// @2631: bipush 15 (0x0F)
		// @2633: iconst_0
		// @2634: iastore
		// @2635: aastore
		// @2636: aload_0
		// @2637: iconst_1
		// @2638: bipush 16 (0x10)
		// @263A: newarray int[]
		// @263C: dup
		// @263D: iconst_0
		// @263E: iconst_0
		// @263F: iastore
		// @2640: dup
		// @2641: iconst_1
		// @2642: sipush -1480 (0xFA38)
		// @2645: iastore
		// @2646: dup
		// @2647: iconst_2
		// @2648: sipush -2220 (0xF754)
		// @264B: iastore
		// @264C: dup
		// @264D: iconst_3
		// @264E: sipush -2590 (0xF5E2)
		// @2651: iastore
		// @2652: dup
		// @2653: iconst_4
		// @2654: sipush 2220 (0x08AC)
		// @2657: iastore
		// @2658: dup
		// @2659: iconst_5
		// @265A: sipush -11471 (0xD331)
		// @265D: iastore
		// @265E: dup
		// @265F: bipush 6 (0x06)
		// @2661: sipush -740 (0xFD1C)
		// @2664: iastore
		// @2665: dup
		// @2666: bipush 7 (0x07)
		// @2668: sipush 11471 (0x2CCF)
		// @266B: iastore
		// @266C: dup
		// @266D: bipush 8 (0x08)
		// @266F: sipush 5550 (0x15AE)
		// @2672: iastore
		// @2673: dup
		// @2674: bipush 9 (0x09)
		// @2676: sipush 2960 (0x0B90)
		// @2679: iastore
		// @267A: dup
		// @267B: bipush 10 (0x0A)
		// @267D: sipush 10731 (0x29EB)
		// @2680: iastore
		// @2681: dup
		// @2682: bipush 11 (0x0B)
		// @2684: sipush 5921 (0x1721)
		// @2687: iastore
		// @2688: dup
		// @2689: bipush 12 (0x0C)
		// @268B: sipush 1110 (0x0456)
		// @268E: iastore
		// @268F: dup
		// @2690: bipush 13 (0x0D)
		// @2692: sipush 740 (0x02E4)
		// @2695: iastore
		// @2696: dup
		// @2697: bipush 14 (0x0E)
		// @2699: sipush 520 (0x0208)
		// @269C: iastore
		// @269D: dup
		// @269E: bipush 15 (0x0F)
		// @26A0: sipush -1145 (0xFB87)
		// @26A3: iastore
		// @26A4: aastore
		// @26A5: aload_0
		// @26A6: bipush 13 (0x0D)
		// @26A8: bipush 16 (0x10)
		// @26AA: newarray int[]
		// @26AC: dup
		// @26AD: iconst_0
		// @26AE: sipush 4440 (0x1158)
		// @26B1: iastore
		// @26B2: dup
		// @26B3: iconst_1
		// @26B4: sipush 7401 (0x1CE9)
		// @26B7: iastore
		// @26B8: dup
		// @26B9: iconst_2
		// @26BA: sipush 3700 (0x0E74)
		// @26BD: iastore
		// @26BE: dup
		// @26BF: iconst_3
		// @26C0: iconst_0
		// @26C1: iastore
		// @26C2: dup
		// @26C3: iconst_4
		// @26C4: sipush -17022 (0xBD82)
		// @26C7: iastore
		// @26C8: dup
		// @26C9: iconst_5
		// @26CA: sipush -740 (0xFD1C)
		// @26CD: iastore
		// @26CE: dup
		// @26CF: bipush 6 (0x06)
		// @26D1: sipush 2960 (0x0B90)
		// @26D4: iastore
		// @26D5: dup
		// @26D6: bipush 7 (0x07)
		// @26D8: sipush 8881 (0x22B1)
		// @26DB: iastore
		// @26DC: dup
		// @26DD: bipush 8 (0x08)
		// @26DF: ldc -35526 (0xffff753a)
		// @26E1: iastore
		// @26E2: dup
		// @26E3: bipush 9 (0x09)
		// @26E5: sipush 4070 (0x0FE6)
		// @26E8: iastore
		// @26E9: dup
		// @26EA: bipush 10 (0x0A)
		// @26EC: sipush -1480 (0xFA38)
		// @26EF: iastore
		// @26F0: dup
		// @26F1: bipush 11 (0x0B)
		// @26F3: sipush -12212 (0xD04C)
		// @26F6: iastore
		// @26F7: dup
		// @26F8: bipush 12 (0x0C)
		// @26FA: sipush 5180 (0x143C)
		// @26FD: iastore
		// @26FE: dup
		// @26FF: bipush 13 (0x0D)
		// @2701: iconst_0
		// @2702: iastore
		// @2703: dup
		// @2704: bipush 14 (0x0E)
		// @2706: sipush -1197 (0xFB53)
		// @2709: iastore
		// @270A: dup
		// @270B: bipush 15 (0x0F)
		// @270D: sipush 260 (0x0104)
		// @2710: iastore
		// @2711: aastore
		// @2712: aload_0
		// @2713: bipush 19 (0x13)
		// @2715: bipush 16 (0x10)
		// @2717: newarray int[]
		// @2719: dup
		// @271A: iconst_0
		// @271B: sipush 740 (0x02E4)
		// @271E: iastore
		// @271F: dup
		// @2720: iconst_1
		// @2721: sipush -13322 (0xCBF6)
		// @2724: iastore
		// @2725: dup
		// @2726: iconst_2
		// @2727: sipush -17763 (0xBA9D)
		// @272A: iastore
		// @272B: dup
		// @272C: iconst_3
		// @272D: sipush -1480 (0xFA38)
		// @2730: iastore
		// @2731: dup
		// @2732: iconst_4
		// @2733: sipush -15542 (0xC34A)
		// @2736: iastore
		// @2737: dup
		// @2738: iconst_5
		// @2739: sipush -4070 (0xF01A)
		// @273C: iastore
		// @273D: dup
		// @273E: bipush 6 (0x06)
		// @2740: iconst_0
		// @2741: iastore
		// @2742: dup
		// @2743: bipush 7 (0x07)
		// @2745: sipush -17763 (0xBA9D)
		// @2748: iastore
		// @2749: dup
		// @274A: bipush 8 (0x08)
		// @274C: sipush -11471 (0xD331)
		// @274F: iastore
		// @2750: dup
		// @2751: bipush 9 (0x09)
		// @2753: sipush -7401 (0xE317)
		// @2756: iastore
		// @2757: dup
		// @2758: bipush 10 (0x0A)
		// @275A: sipush 3330 (0x0D02)
		// @275D: iastore
		// @275E: dup
		// @275F: bipush 11 (0x0B)
		// @2761: sipush 6291 (0x1893)
		// @2764: iastore
		// @2765: dup
		// @2766: bipush 12 (0x0C)
		// @2768: sipush -1110 (0xFBAA)
		// @276B: iastore
		// @276C: dup
		// @276D: bipush 13 (0x0D)
		// @276F: iconst_0
		// @2770: iastore
		// @2771: dup
		// @2772: bipush 14 (0x0E)
		// @2774: sipush 520 (0x0208)
		// @2777: iastore
		// @2778: dup
		// @2779: bipush 15 (0x0F)
		// @277B: sipush -1145 (0xFB87)
		// @277E: iastore
		// @277F: aastore
		// @2780: aload_0
		// @2781: bipush 7 (0x07)
		// @2783: bipush 16 (0x10)
		// @2785: newarray int[]
		// @2787: dup
		// @2788: iconst_0
		// @2789: sipush 1110 (0x0456)
		// @278C: iastore
		// @278D: dup
		// @278E: iconst_1
		// @278F: sipush -3330 (0xF2FE)
		// @2792: iastore
		// @2793: dup
		// @2794: iconst_2
		// @2795: sipush -1850 (0xF8C6)
		// @2798: iastore
		// @2799: dup
		// @279A: iconst_3
		// @279B: sipush -3700 (0xF18C)
		// @279E: iastore
		// @279F: dup
		// @27A0: iconst_4
		// @27A1: sipush 7401 (0x1CE9)
		// @27A4: iastore
		// @27A5: dup
		// @27A6: iconst_5
		// @27A7: sipush -17392 (0xBC10)
		// @27AA: iastore
		// @27AB: dup
		// @27AC: bipush 6 (0x06)
		// @27AE: sipush -1850 (0xF8C6)
		// @27B1: iastore
		// @27B2: dup
		// @27B3: bipush 7 (0x07)
		// @27B5: sipush 14062 (0x36EE)
		// @27B8: iastore
		// @27B9: dup
		// @27BA: bipush 8 (0x08)
		// @27BC: sipush 7771 (0x1E5B)
		// @27BF: iastore
		// @27C0: dup
		// @27C1: bipush 9 (0x09)
		// @27C3: iconst_0
		// @27C4: iastore
		// @27C5: dup
		// @27C6: bipush 10 (0x0A)
		// @27C8: sipush 8141 (0x1FCD)
		// @27CB: iastore
		// @27CC: dup
		// @27CD: bipush 11 (0x0B)
		// @27CF: sipush 6661 (0x1A05)
		// @27D2: iastore
		// @27D3: dup
		// @27D4: bipush 12 (0x0C)
		// @27D6: sipush 4440 (0x1158)
		// @27D9: iastore
		// @27DA: dup
		// @27DB: bipush 13 (0x0D)
		// @27DD: iconst_0
		// @27DE: iastore
		// @27DF: dup
		// @27E0: bipush 14 (0x0E)
		// @27E2: sipush 520 (0x0208)
		// @27E5: iastore
		// @27E6: dup
		// @27E7: bipush 15 (0x0F)
		// @27E9: sipush -1458 (0xFA4E)
		// @27EC: iastore
		// @27ED: aastore
		// @27EE: aload_0
		// @27EF: bipush 9 (0x09)
		// @27F1: bipush 16 (0x10)
		// @27F3: newarray int[]
		// @27F5: dup
		// @27F6: iconst_0
		// @27F7: iconst_0
		// @27F8: iastore
		// @27F9: dup
		// @27FA: iconst_1
		// @27FB: sipush -1850 (0xF8C6)
		// @27FE: iastore
		// @27FF: dup
		// @2800: iconst_2
		// @2801: sipush -1850 (0xF8C6)
		// @2804: iastore
		// @2805: dup
		// @2806: iconst_3
		// @2807: sipush -2960 (0xF470)
		// @280A: iastore
		// @280B: dup
		// @280C: iconst_4
		// @280D: sipush 2220 (0x08AC)
		// @2810: iastore
		// @2811: dup
		// @2812: iconst_5
		// @2813: sipush -11101 (0xD4A3)
		// @2816: iastore
		// @2817: dup
		// @2818: bipush 6 (0x06)
		// @281A: sipush -1110 (0xFBAA)
		// @281D: iastore
		// @281E: dup
		// @281F: bipush 7 (0x07)
		// @2821: sipush 12212 (0x2FB4)
		// @2824: iastore
		// @2825: dup
		// @2826: bipush 8 (0x08)
		// @2828: sipush 7401 (0x1CE9)
		// @282B: iastore
		// @282C: dup
		// @282D: bipush 9 (0x09)
		// @282F: sipush -740 (0xFD1C)
		// @2832: iastore
		// @2833: dup
		// @2834: bipush 10 (0x0A)
		// @2836: iconst_0
		// @2837: iastore
		// @2838: dup
		// @2839: bipush 11 (0x0B)
		// @283B: sipush 5180 (0x143C)
		// @283E: iastore
		// @283F: dup
		// @2840: bipush 12 (0x0C)
		// @2842: sipush 1850 (0x073A)
		// @2845: iastore
		// @2846: dup
		// @2847: bipush 13 (0x0D)
		// @2849: iconst_0
		// @284A: iastore
		// @284B: dup
		// @284C: bipush 14 (0x0E)
		// @284E: sipush 416 (0x01A0)
		// @2851: iastore
		// @2852: dup
		// @2853: bipush 15 (0x0F)
		// @2855: sipush -1197 (0xFB53)
		// @2858: iastore
		// @2859: aastore
		// @285A: aload_0
		// @285B: bipush 20 (0x14)
		// @285D: bipush 16 (0x10)
		// @285F: newarray int[]
		// @2861: dup
		// @2862: iconst_0
		// @2863: sipush 1110 (0x0456)
		// @2866: iastore
		// @2867: dup
		// @2868: iconst_1
		// @2869: sipush -22943 (0xA661)
		// @286C: iastore
		// @286D: dup
		// @286E: iconst_2
		// @286F: sipush -4810 (0xED36)
		// @2872: iastore
		// @2873: dup
		// @2874: iconst_3
		// @2875: sipush -11101 (0xD4A3)
		// @2878: iastore
		// @2879: dup
		// @287A: iconst_4
		// @287B: sipush -7401 (0xE317)
		// @287E: iastore
		// @287F: dup
		// @2880: iconst_5
		// @2881: sipush -5180 (0xEBC4)
		// @2884: iastore
		// @2885: dup
		// @2886: bipush 6 (0x06)
		// @2888: sipush 1110 (0x0456)
		// @288B: iastore
		// @288C: dup
		// @288D: bipush 7 (0x07)
		// @288F: sipush -10361 (0xD787)
		// @2892: iastore
		// @2893: dup
		// @2894: bipush 8 (0x08)
		// @2896: sipush -740 (0xFD1C)
		// @2899: iastore
		// @289A: dup
		// @289B: bipush 9 (0x09)
		// @289D: sipush -3330 (0xF2FE)
		// @28A0: iastore
		// @28A1: dup
		// @28A2: bipush 10 (0x0A)
		// @28A4: iconst_0
		// @28A5: iastore
		// @28A6: dup
		// @28A7: bipush 11 (0x0B)
		// @28A9: sipush 6291 (0x1893)
		// @28AC: iastore
		// @28AD: dup
		// @28AE: bipush 12 (0x0C)
		// @28B0: sipush -5550 (0xEA52)
		// @28B3: iastore
		// @28B4: dup
		// @28B5: bipush 13 (0x0D)
		// @28B7: sipush -740 (0xFD1C)
		// @28BA: iastore
		// @28BB: dup
		// @28BC: bipush 14 (0x0E)
		// @28BE: sipush 260 (0x0104)
		// @28C1: iastore
		// @28C2: dup
		// @28C3: bipush 15 (0x0F)
		// @28C5: sipush -1614 (0xF9B2)
		// @28C8: iastore
		// @28C9: aastore
		// @28CA: aload_0
		// @28CB: bipush 6 (0x06)
		// @28CD: bipush 16 (0x10)
		// @28CF: newarray int[]
		// @28D1: dup
		// @28D2: iconst_0
		// @28D3: iconst_0
		// @28D4: iastore
		// @28D5: dup
		// @28D6: iconst_1
		// @28D7: sipush -7771 (0xE1A5)
		// @28DA: iastore
		// @28DB: dup
		// @28DC: iconst_2
		// @28DD: sipush -1850 (0xF8C6)
		// @28E0: iastore
		// @28E1: dup
		// @28E2: iconst_3
		// @28E3: sipush -3700 (0xF18C)
		// @28E6: iastore
		// @28E7: dup
		// @28E8: iconst_4
		// @28E9: sipush 1850 (0x073A)
		// @28EC: iastore
		// @28ED: dup
		// @28EE: iconst_5
		// @28EF: sipush -14062 (0xC912)
		// @28F2: iastore
		// @28F3: dup
		// @28F4: bipush 6 (0x06)
		// @28F6: sipush 1110 (0x0456)
		// @28F9: iastore
		// @28FA: dup
		// @28FB: bipush 7 (0x07)
		// @28FD: sipush -10361 (0xD787)
		// @2900: iastore
		// @2901: dup
		// @2902: bipush 8 (0x08)
		// @2904: sipush -2220 (0xF754)
		// @2907: iastore
		// @2908: dup
		// @2909: bipush 9 (0x09)
		// @290B: sipush 740 (0x02E4)
		// @290E: iastore
		// @290F: dup
		// @2910: bipush 10 (0x0A)
		// @2912: sipush 2590 (0x0A1E)
		// @2915: iastore
		// @2916: dup
		// @2917: bipush 11 (0x0B)
		// @2919: sipush 5180 (0x143C)
		// @291C: iastore
		// @291D: dup
		// @291E: bipush 12 (0x0C)
		// @2920: sipush 5180 (0x143C)
		// @2923: iastore
		// @2924: dup
		// @2925: bipush 13 (0x0D)
		// @2927: sipush -1480 (0xFA38)
		// @292A: iastore
		// @292B: dup
		// @292C: bipush 14 (0x0E)
		// @292E: sipush 416 (0x01A0)
		// @2931: iastore
		// @2932: dup
		// @2933: bipush 15 (0x0F)
		// @2935: sipush -1510 (0xFA1A)
		// @2938: iastore
		// @2939: aastore
		// @293A: aload_0
		// @293B: iconst_0
		// @293C: bipush 16 (0x10)
		// @293E: newarray int[]
		// @2940: dup
		// @2941: iconst_0
		// @2942: iconst_0
		// @2943: iastore
		// @2944: dup
		// @2945: iconst_1
		// @2946: sipush -1850 (0xF8C6)
		// @2949: iastore
		// @294A: dup
		// @294B: iconst_2
		// @294C: sipush -2220 (0xF754)
		// @294F: iastore
		// @2950: dup
		// @2951: iconst_3
		// @2952: sipush -2960 (0xF470)
		// @2955: iastore
		// @2956: dup
		// @2957: iconst_4
		// @2958: sipush 2220 (0x08AC)
		// @295B: iastore
		// @295C: dup
		// @295D: iconst_5
		// @295E: sipush -11101 (0xD4A3)
		// @2961: iastore
		// @2962: dup
		// @2963: bipush 6 (0x06)
		// @2965: sipush -1110 (0xFBAA)
		// @2968: iastore
		// @2969: dup
		// @296A: bipush 7 (0x07)
		// @296C: sipush 12212 (0x2FB4)
		// @296F: iastore
		// @2970: dup
		// @2971: bipush 8 (0x08)
		// @2973: sipush 7401 (0x1CE9)
		// @2976: iastore
		// @2977: dup
		// @2978: bipush 9 (0x09)
		// @297A: sipush -1110 (0xFBAA)
		// @297D: iastore
		// @297E: dup
		// @297F: bipush 10 (0x0A)
		// @2981: sipush 740 (0x02E4)
		// @2984: iastore
		// @2985: dup
		// @2986: bipush 11 (0x0B)
		// @2988: sipush 5180 (0x143C)
		// @298B: iastore
		// @298C: dup
		// @298D: bipush 12 (0x0C)
		// @298F: sipush 2220 (0x08AC)
		// @2992: iastore
		// @2993: dup
		// @2994: bipush 13 (0x0D)
		// @2996: sipush 1110 (0x0456)
		// @2999: iastore
		// @299A: dup
		// @299B: bipush 14 (0x0E)
		// @299D: sipush 416 (0x01A0)
		// @29A0: iastore
		// @29A1: dup
		// @29A2: bipush 15 (0x0F)
		// @29A4: sipush -1302 (0xFAEA)
		// @29A7: iastore
		// @29A8: aastore
		// @29A9: aload_0
		// @29AA: bipush 11 (0x0B)
		// @29AC: bipush 16 (0x10)
		// @29AE: newarray int[]
		// @29B0: dup
		// @29B1: iconst_0
		// @29B2: sipush 3700 (0x0E74)
		// @29B5: iastore
		// @29B6: dup
		// @29B7: iconst_1
		// @29B8: sipush -9251 (0xDBDD)
		// @29BB: iastore
		// @29BC: dup
		// @29BD: iconst_2
		// @29BE: sipush -7771 (0xE1A5)
		// @29C1: iastore
		// @29C2: dup
		// @29C3: iconst_3
		// @29C4: sipush -5921 (0xE8DF)
		// @29C7: iastore
		// @29C8: dup
		// @29C9: iconst_4
		// @29CA: sipush 1480 (0x05C8)
		// @29CD: iastore
		// @29CE: dup
		// @29CF: iconst_5
		// @29D0: sipush -17763 (0xBA9D)
		// @29D3: iastore
		// @29D4: dup
		// @29D5: bipush 6 (0x06)
		// @29D7: iconst_0
		// @29D8: iastore
		// @29D9: dup
		// @29DA: bipush 7 (0x07)
		// @29DC: sipush -17763 (0xBA9D)
		// @29DF: iastore
		// @29E0: dup
		// @29E1: bipush 8 (0x08)
		// @29E3: sipush -4440 (0xEEA8)
		// @29E6: iastore
		// @29E7: dup
		// @29E8: bipush 9 (0x09)
		// @29EA: iconst_0
		// @29EB: iastore
		// @29EC: dup
		// @29ED: bipush 10 (0x0A)
		// @29EF: sipush 8511 (0x213F)
		// @29F2: iastore
		// @29F3: dup
		// @29F4: bipush 11 (0x0B)
		// @29F6: sipush 12952 (0x3298)
		// @29F9: iastore
		// @29FA: dup
		// @29FB: bipush 12 (0x0C)
		// @29FD: sipush 4070 (0x0FE6)
		// @2A00: iastore
		// @2A01: dup
		// @2A02: bipush 13 (0x0D)
		// @2A04: iconst_0
		// @2A05: iastore
		// @2A06: dup
		// @2A07: bipush 14 (0x0E)
		// @2A09: sipush 1562 (0x061A)
		// @2A0C: iastore
		// @2A0D: dup
		// @2A0E: bipush 15 (0x0F)
		// @2A10: sipush -1875 (0xF8AD)
		// @2A13: iastore
		// @2A14: aastore
		// @2A15: aload_0
		// @2A16: bipush 22 (0x16)
		// @2A18: bipush 16 (0x10)
		// @2A1A: newarray int[]
		// @2A1C: dup
		// @2A1D: iconst_0
		// @2A1E: sipush -2960 (0xF470)
		// @2A21: iastore
		// @2A22: dup
		// @2A23: iconst_1
		// @2A24: sipush -11101 (0xD4A3)
		// @2A27: iastore
		// @2A28: dup
		// @2A29: iconst_2
		// @2A2A: sipush -4440 (0xEEA8)
		// @2A2D: iastore
		// @2A2E: dup
		// @2A2F: iconst_3
		// @2A30: sipush -11101 (0xD4A3)
		// @2A33: iastore
		// @2A34: dup
		// @2A35: iconst_4
		// @2A36: sipush -7031 (0xE489)
		// @2A39: iastore
		// @2A3A: dup
		// @2A3B: iconst_5
		// @2A3C: sipush -17763 (0xBA9D)
		// @2A3F: iastore
		// @2A40: dup
		// @2A41: bipush 6 (0x06)
		// @2A43: sipush -7771 (0xE1A5)
		// @2A46: iastore
		// @2A47: dup
		// @2A48: bipush 7 (0x07)
		// @2A4A: sipush -7401 (0xE317)
		// @2A4D: iastore
		// @2A4E: dup
		// @2A4F: bipush 8 (0x08)
		// @2A51: sipush -26644 (0x97EC)
		// @2A54: iastore
		// @2A55: dup
		// @2A56: bipush 9 (0x09)
		// @2A58: iconst_0
		// @2A59: iastore
		// @2A5A: dup
		// @2A5B: bipush 10 (0x0A)
		// @2A5D: sipush -12952 (0xCD68)
		// @2A60: iastore
		// @2A61: dup
		// @2A62: bipush 11 (0x0B)
		// @2A64: sipush -9251 (0xDBDD)
		// @2A67: iastore
		// @2A68: dup
		// @2A69: bipush 12 (0x0C)
		// @2A6B: sipush -4810 (0xED36)
		// @2A6E: iastore
		// @2A6F: dup
		// @2A70: bipush 13 (0x0D)
		// @2A72: sipush -1850 (0xF8C6)
		// @2A75: iastore
		// @2A76: dup
		// @2A77: bipush 14 (0x0E)
		// @2A79: iconst_0
		// @2A7A: iastore
		// @2A7B: dup
		// @2A7C: bipush 15 (0x0F)
		// @2A7E: sipush -468 (0xFE2C)
		// @2A81: iastore
		// @2A82: aastore
		// @2A83: aload_0
		// @2A84: iconst_2
		// @2A85: bipush 16 (0x10)
		// @2A87: newarray int[]
		// @2A89: dup
		// @2A8A: iconst_0
		// @2A8B: sipush 1110 (0x0456)
		// @2A8E: iastore
		// @2A8F: dup
		// @2A90: iconst_1
		// @2A91: sipush -1850 (0xF8C6)
		// @2A94: iastore
		// @2A95: dup
		// @2A96: iconst_2
		// @2A97: sipush -2590 (0xF5E2)
		// @2A9A: iastore
		// @2A9B: dup
		// @2A9C: iconst_3
		// @2A9D: sipush -740 (0xFD1C)
		// @2AA0: iastore
		// @2AA1: dup
		// @2AA2: iconst_4
		// @2AA3: iconst_0
		// @2AA4: iastore
		// @2AA5: dup
		// @2AA6: iconst_5
		// @2AA7: sipush -9621 (0xDA6B)
		// @2AAA: iastore
		// @2AAB: dup
		// @2AAC: bipush 6 (0x06)
		// @2AAE: iconst_0
		// @2AAF: iastore
		// @2AB0: dup
		// @2AB1: bipush 7 (0x07)
		// @2AB3: sipush 17392 (0x43F0)
		// @2AB6: iastore
		// @2AB7: dup
		// @2AB8: bipush 8 (0x08)
		// @2ABA: sipush 6291 (0x1893)
		// @2ABD: iastore
		// @2ABE: dup
		// @2ABF: bipush 9 (0x09)
		// @2AC1: sipush 2590 (0x0A1E)
		// @2AC4: iastore
		// @2AC5: dup
		// @2AC6: bipush 10 (0x0A)
		// @2AC8: sipush 6661 (0x1A05)
		// @2ACB: iastore
		// @2ACC: dup
		// @2ACD: bipush 11 (0x0B)
		// @2ACF: sipush 5921 (0x1721)
		// @2AD2: iastore
		// @2AD3: dup
		// @2AD4: bipush 12 (0x0C)
		// @2AD6: iconst_0
		// @2AD7: iastore
		// @2AD8: dup
		// @2AD9: bipush 13 (0x0D)
		// @2ADB: sipush 1480 (0x05C8)
		// @2ADE: iastore
		// @2ADF: dup
		// @2AE0: bipush 14 (0x0E)
		// @2AE2: sipush 364 (0x016C)
		// @2AE5: iastore
		// @2AE6: dup
		// @2AE7: bipush 15 (0x0F)
		// @2AE9: sipush -1562 (0xF9E6)
		// @2AEC: iastore
		// @2AED: aastore
		// @2AEE: aload_0
		// @2AEF: bipush 12 (0x0C)
		// @2AF1: bipush 16 (0x10)
		// @2AF3: newarray int[]
		// @2AF5: dup
		// @2AF6: iconst_0
		// @2AF7: sipush 2960 (0x0B90)
		// @2AFA: iastore
		// @2AFB: dup
		// @2AFC: iconst_1
		// @2AFD: sipush -17022 (0xBD82)
		// @2B00: iastore
		// @2B01: dup
		// @2B02: iconst_2
		// @2B03: sipush 5180 (0x143C)
		// @2B06: iastore
		// @2B07: dup
		// @2B08: iconst_3
		// @2B09: sipush -1110 (0xFBAA)
		// @2B0C: iastore
		// @2B0D: dup
		// @2B0E: iconst_4
		// @2B0F: sipush -6661 (0xE5FB)
		// @2B12: iastore
		// @2B13: dup
		// @2B14: iconst_5
		// @2B15: sipush -16282 (0xC066)
		// @2B18: iastore
		// @2B19: dup
		// @2B1A: bipush 6 (0x06)
		// @2B1C: sipush 1850 (0x073A)
		// @2B1F: iastore
		// @2B20: dup
		// @2B21: bipush 7 (0x07)
		// @2B23: sipush -17763 (0xBA9D)
		// @2B26: iastore
		// @2B27: dup
		// @2B28: bipush 8 (0x08)
		// @2B2A: sipush -4810 (0xED36)
		// @2B2D: iastore
		// @2B2E: dup
		// @2B2F: bipush 9 (0x09)
		// @2B31: sipush 2220 (0x08AC)
		// @2B34: iastore
		// @2B35: dup
		// @2B36: bipush 10 (0x0A)
		// @2B38: sipush 6291 (0x1893)
		// @2B3B: iastore
		// @2B3C: dup
		// @2B3D: bipush 11 (0x0B)
		// @2B3F: sipush 6291 (0x1893)
		// @2B42: iastore
		// @2B43: dup
		// @2B44: bipush 12 (0x0C)
		// @2B46: sipush 3330 (0x0D02)
		// @2B49: iastore
		// @2B4A: dup
		// @2B4B: bipush 13 (0x0D)
		// @2B4D: iconst_0
		// @2B4E: iastore
		// @2B4F: dup
		// @2B50: bipush 14 (0x0E)
		// @2B52: sipush 1250 (0x04E2)
		// @2B55: iastore
		// @2B56: dup
		// @2B57: bipush 15 (0x0F)
		// @2B59: sipush -1041 (0xFBEF)
		// @2B5C: iastore
		// @2B5D: aastore
		// @2B5E: aload_0
		// @2B5F: bipush 8 (0x08)
		// @2B61: bipush 16 (0x10)
		// @2B63: newarray int[]
		// @2B65: dup
		// @2B66: iconst_0
		// @2B67: sipush 740 (0x02E4)
		// @2B6A: iastore
		// @2B6B: dup
		// @2B6C: iconst_1
		// @2B6D: iconst_0
		// @2B6E: iastore
		// @2B6F: dup
		// @2B70: iconst_2
		// @2B71: sipush -5550 (0xEA52)
		// @2B74: iastore
		// @2B75: dup
		// @2B76: iconst_3
		// @2B77: sipush -2960 (0xF470)
		// @2B7A: iastore
		// @2B7B: dup
		// @2B7C: iconst_4
		// @2B7D: sipush -4070 (0xF01A)
		// @2B80: iastore
		// @2B81: dup
		// @2B82: iconst_5
		// @2B83: sipush -8141 (0xE033)
		// @2B86: iastore
		// @2B87: dup
		// @2B88: bipush 6 (0x06)
		// @2B8A: sipush 1480 (0x05C8)
		// @2B8D: iastore
		// @2B8E: dup
		// @2B8F: bipush 7 (0x07)
		// @2B91: sipush -5180 (0xEBC4)
		// @2B94: iastore
		// @2B95: dup
		// @2B96: bipush 8 (0x08)
		// @2B98: sipush 6291 (0x1893)
		// @2B9B: iastore
		// @2B9C: dup
		// @2B9D: bipush 9 (0x09)
		// @2B9F: iconst_0
		// @2BA0: iastore
		// @2BA1: dup
		// @2BA2: bipush 10 (0x0A)
		// @2BA4: sipush 2220 (0x08AC)
		// @2BA7: iastore
		// @2BA8: dup
		// @2BA9: bipush 11 (0x0B)
		// @2BAB: sipush -3700 (0xF18C)
		// @2BAE: iastore
		// @2BAF: dup
		// @2BB0: bipush 12 (0x0C)
		// @2BB2: sipush 1110 (0x0456)
		// @2BB5: iastore
		// @2BB6: dup
		// @2BB7: bipush 13 (0x0D)
		// @2BB9: iconst_0
		// @2BBA: iastore
		// @2BBB: dup
		// @2BBC: bipush 14 (0x0E)
		// @2BBE: iconst_0
		// @2BBF: iastore
		// @2BC0: dup
		// @2BC1: bipush 15 (0x0F)
		// @2BC3: iconst_0
		// @2BC4: iastore
		// @2BC5: aastore
		// @2BC6: aload_0
		// @2BC7: iconst_5
		// @2BC8: bipush 16 (0x10)
		// @2BCA: newarray int[]
		// @2BCC: dup
		// @2BCD: iconst_0
		// @2BCE: iconst_0
		// @2BCF: iastore
		// @2BD0: dup
		// @2BD1: iconst_1
		// @2BD2: sipush -5550 (0xEA52)
		// @2BD5: iastore
		// @2BD6: dup
		// @2BD7: iconst_2
		// @2BD8: sipush -3700 (0xF18C)
		// @2BDB: iastore
		// @2BDC: dup
		// @2BDD: iconst_3
		// @2BDE: sipush -2220 (0xF754)
		// @2BE1: iastore
		// @2BE2: dup
		// @2BE3: iconst_4
		// @2BE4: sipush -6661 (0xE5FB)
		// @2BE7: iastore
		// @2BE8: dup
		// @2BE9: iconst_5
		// @2BEA: sipush -15912 (0xC1D8)
		// @2BED: iastore
		// @2BEE: dup
		// @2BEF: bipush 6 (0x06)
		// @2BF1: sipush 2590 (0x0A1E)
		// @2BF4: iastore
		// @2BF5: dup
		// @2BF6: bipush 7 (0x07)
		// @2BF8: sipush -9621 (0xDA6B)
		// @2BFB: iastore
		// @2BFC: dup
		// @2BFD: bipush 8 (0x08)
		// @2BFF: sipush 2590 (0x0A1E)
		// @2C02: iastore
		// @2C03: dup
		// @2C04: bipush 9 (0x09)
		// @2C06: sipush -740 (0xFD1C)
		// @2C09: iastore
		// @2C0A: dup
		// @2C0B: bipush 10 (0x0A)
		// @2C0D: iconst_0
		// @2C0E: iastore
		// @2C0F: dup
		// @2C10: bipush 11 (0x0B)
		// @2C12: sipush 1110 (0x0456)
		// @2C15: iastore
		// @2C16: dup
		// @2C17: bipush 12 (0x0C)
		// @2C19: sipush 3330 (0x0D02)
		// @2C1C: iastore
		// @2C1D: dup
		// @2C1E: bipush 13 (0x0D)
		// @2C20: iconst_0
		// @2C21: iastore
		// @2C22: dup
		// @2C23: bipush 14 (0x0E)
		// @2C25: sipush 364 (0x016C)
		// @2C28: iastore
		// @2C29: dup
		// @2C2A: bipush 15 (0x0F)
		// @2C2C: sipush -1354 (0xFAB6)
		// @2C2F: iastore
		// @2C30: aastore
		// @2C31: aload_0
		// @2C32: bipush 17 (0x11)
		// @2C34: bipush 16 (0x10)
		// @2C36: newarray int[]
		// @2C38: dup
		// @2C39: iconst_0
		// @2C3A: sipush -2220 (0xF754)
		// @2C3D: iastore
		// @2C3E: dup
		// @2C3F: iconst_1
		// @2C40: sipush -15912 (0xC1D8)
		// @2C43: iastore
		// @2C44: dup
		// @2C45: iconst_2
		// @2C46: sipush -8881 (0xDD4F)
		// @2C49: iastore
		// @2C4A: dup
		// @2C4B: iconst_3
		// @2C4C: sipush -5550 (0xEA52)
		// @2C4F: iastore
		// @2C50: dup
		// @2C51: iconst_4
		// @2C52: sipush 2220 (0x08AC)
		// @2C55: iastore
		// @2C56: dup
		// @2C57: iconst_5
		// @2C58: sipush -11471 (0xD331)
		// @2C5B: iastore
		// @2C5C: dup
		// @2C5D: bipush 6 (0x06)
		// @2C5F: sipush -1110 (0xFBAA)
		// @2C62: iastore
		// @2C63: dup
		// @2C64: bipush 7 (0x07)
		// @2C66: sipush -22943 (0xA661)
		// @2C69: iastore
		// @2C6A: dup
		// @2C6B: bipush 8 (0x08)
		// @2C6D: sipush -8141 (0xE033)
		// @2C70: iastore
		// @2C71: dup
		// @2C72: bipush 9 (0x09)
		// @2C74: sipush -5180 (0xEBC4)
		// @2C77: iastore
		// @2C78: dup
		// @2C79: bipush 10 (0x0A)
		// @2C7B: sipush -9991 (0xD8F9)
		// @2C7E: iastore
		// @2C7F: dup
		// @2C80: bipush 11 (0x0B)
		// @2C82: sipush -13692 (0xCA84)
		// @2C85: iastore
		// @2C86: dup
		// @2C87: bipush 12 (0x0C)
		// @2C89: sipush -2220 (0xF754)
		// @2C8C: iastore
		// @2C8D: dup
		// @2C8E: bipush 13 (0x0D)
		// @2C90: sipush -1850 (0xF8C6)
		// @2C93: iastore
		// @2C94: dup
		// @2C95: bipush 14 (0x0E)
		// @2C97: sipush 520 (0x0208)
		// @2C9A: iastore
		// @2C9B: dup
		// @2C9C: bipush 15 (0x0F)
		// @2C9E: sipush -677 (0xFD5B)
		// @2CA1: iastore
		// @2CA2: aastore
		// @2CA3: aload_0
		// @2CA4: iconst_4
		// @2CA5: bipush 16 (0x10)
		// @2CA7: newarray int[]
		// @2CA9: dup
		// @2CAA: iconst_0
		// @2CAB: sipush 1110 (0x0456)
		// @2CAE: iastore
		// @2CAF: dup
		// @2CB0: iconst_1
		// @2CB1: sipush -7771 (0xE1A5)
		// @2CB4: iastore
		// @2CB5: dup
		// @2CB6: iconst_2
		// @2CB7: sipush -4810 (0xED36)
		// @2CBA: iastore
		// @2CBB: dup
		// @2CBC: iconst_3
		// @2CBD: sipush 1110 (0x0456)
		// @2CC0: iastore
		// @2CC1: dup
		// @2CC2: iconst_4
		// @2CC3: sipush -7401 (0xE317)
		// @2CC6: iastore
		// @2CC7: dup
		// @2CC8: iconst_5
		// @2CC9: sipush -10731 (0xD615)
		// @2CCC: iastore
		// @2CCD: dup
		// @2CCE: bipush 6 (0x06)
		// @2CD0: sipush 3330 (0x0D02)
		// @2CD3: iastore
		// @2CD4: dup
		// @2CD5: bipush 7 (0x07)
		// @2CD7: sipush -11471 (0xD331)
		// @2CDA: iastore
		// @2CDB: dup
		// @2CDC: bipush 8 (0x08)
		// @2CDE: sipush 8141 (0x1FCD)
		// @2CE1: iastore
		// @2CE2: dup
		// @2CE3: bipush 9 (0x09)
		// @2CE5: sipush -1480 (0xFA38)
		// @2CE8: iastore
		// @2CE9: dup
		// @2CEA: bipush 10 (0x0A)
		// @2CEC: sipush 1850 (0x073A)
		// @2CEF: iastore
		// @2CF0: dup
		// @2CF1: bipush 11 (0x0B)
		// @2CF3: sipush 2220 (0x08AC)
		// @2CF6: iastore
		// @2CF7: dup
		// @2CF8: bipush 12 (0x0C)
		// @2CFA: sipush 740 (0x02E4)
		// @2CFD: iastore
		// @2CFE: dup
		// @2CFF: bipush 13 (0x0D)
		// @2D01: sipush 2220 (0x08AC)
		// @2D04: iastore
		// @2D05: dup
		// @2D06: bipush 14 (0x0E)
		// @2D08: sipush 364 (0x016C)
		// @2D0B: iastore
		// @2D0C: dup
		// @2D0D: bipush 15 (0x0F)
		// @2D0F: sipush -1614 (0xF9B2)
		// @2D12: iastore
		// @2D13: aastore
		// @2D14: aload_0
		// @2D15: bipush 16 (0x10)
		// @2D17: bipush 16 (0x10)
		// @2D19: newarray int[]
		// @2D1B: dup
		// @2D1C: iconst_0
		// @2D1D: sipush 740 (0x02E4)
		// @2D20: iastore
		// @2D21: dup
		// @2D22: iconst_1
		// @2D23: sipush -12952 (0xCD68)
		// @2D26: iastore
		// @2D27: dup
		// @2D28: iconst_2
		// @2D29: sipush -2590 (0xF5E2)
		// @2D2C: iastore
		// @2D2D: dup
		// @2D2E: iconst_3
		// @2D2F: sipush -9251 (0xDBDD)
		// @2D32: iastore
		// @2D33: dup
		// @2D34: iconst_4
		// @2D35: sipush -1850 (0xF8C6)
		// @2D38: iastore
		// @2D39: dup
		// @2D3A: iconst_5
		// @2D3B: ldc 35526 (0x8ac6)
		// @2D3D: iastore
		// @2D3E: dup
		// @2D3F: bipush 6 (0x06)
		// @2D41: sipush -1480 (0xFA38)
		// @2D44: iastore
		// @2D45: dup
		// @2D46: bipush 7 (0x07)
		// @2D48: sipush 28864 (0x70C0)
		// @2D4B: iastore
		// @2D4C: dup
		// @2D4D: bipush 8 (0x08)
		// @2D4F: sipush 7031 (0x1B77)
		// @2D52: iastore
		// @2D53: dup
		// @2D54: bipush 9 (0x09)
		// @2D56: sipush 1110 (0x0456)
		// @2D59: iastore
		// @2D5A: dup
		// @2D5B: bipush 10 (0x0A)
		// @2D5D: sipush 13322 (0x340A)
		// @2D60: iastore
		// @2D61: dup
		// @2D62: bipush 11 (0x0B)
		// @2D64: sipush 11842 (0x2E42)
		// @2D67: iastore
		// @2D68: dup
		// @2D69: bipush 12 (0x0C)
		// @2D6B: sipush 6661 (0x1A05)
		// @2D6E: iastore
		// @2D6F: dup
		// @2D70: bipush 13 (0x0D)
		// @2D72: sipush -1110 (0xFBAA)
		// @2D75: iastore
		// @2D76: dup
		// @2D77: bipush 14 (0x0E)
		// @2D79: sipush 1562 (0x061A)
		// @2D7C: iastore
		// @2D7D: dup
		// @2D7E: bipush 15 (0x0F)
		// @2D80: sipush -260 (0xFEFC)
		// @2D83: iastore
		// @2D84: aastore
		// @2D85: aload_0
		// @2D86: bipush 18 (0x12)
		// @2D88: bipush 16 (0x10)
		// @2D8A: newarray int[]
		// @2D8C: dup
		// @2D8D: iconst_0
		// @2D8E: sipush 1110 (0x0456)
		// @2D91: iastore
		// @2D92: dup
		// @2D93: iconst_1
		// @2D94: sipush -15912 (0xC1D8)
		// @2D97: iastore
		// @2D98: dup
		// @2D99: iconst_2
		// @2D9A: sipush -15172 (0xC4BC)
		// @2D9D: iastore
		// @2D9E: dup
		// @2D9F: iconst_3
		// @2DA0: sipush -5550 (0xEA52)
		// @2DA3: iastore
		// @2DA4: dup
		// @2DA5: iconst_4
		// @2DA6: sipush -9621 (0xDA6B)
		// @2DA9: iastore
		// @2DAA: dup
		// @2DAB: iconst_5
		// @2DAC: sipush -7031 (0xE489)
		// @2DAF: iastore
		// @2DB0: dup
		// @2DB1: bipush 6 (0x06)
		// @2DB3: sipush -1480 (0xFA38)
		// @2DB6: iastore
		// @2DB7: dup
		// @2DB8: bipush 7 (0x07)
		// @2DBA: ldc -35526 (0xffff753a)
		// @2DBC: iastore
		// @2DBD: dup
		// @2DBE: bipush 8 (0x08)
		// @2DC0: sipush 14802 (0x39D2)
		// @2DC3: iastore
		// @2DC4: dup
		// @2DC5: bipush 9 (0x09)
		// @2DC7: sipush -9251 (0xDBDD)
		// @2DCA: iastore
		// @2DCB: dup
		// @2DCC: bipush 10 (0x0A)
		// @2DCE: sipush -1110 (0xFBAA)
		// @2DD1: iastore
		// @2DD2: dup
		// @2DD3: bipush 11 (0x0B)
		// @2DD5: sipush 1850 (0x073A)
		// @2DD8: iastore
		// @2DD9: dup
		// @2DDA: bipush 12 (0x0C)
		// @2DDC: sipush -1480 (0xFA38)
		// @2DDF: iastore
		// @2DE0: dup
		// @2DE1: bipush 13 (0x0D)
		// @2DE3: sipush -740 (0xFD1C)
		// @2DE6: iastore
		// @2DE7: dup
		// @2DE8: bipush 14 (0x0E)
		// @2DEA: sipush 781 (0x030D)
		// @2DED: iastore
		// @2DEE: dup
		// @2DEF: bipush 15 (0x0F)
		// @2DF1: sipush -1562 (0xF9E6)
		// @2DF4: iastore
		// @2DF5: aastore
		// @2DF6: aload_0
		// @2DF7: bipush 21 (0x15)
		// @2DF9: bipush 16 (0x10)
		// @2DFB: newarray int[]
		// @2DFD: dup
		// @2DFE: iconst_0
		// @2DFF: sipush -4810 (0xED36)
		// @2E02: iastore
		// @2E03: dup
		// @2E04: iconst_1
		// @2E05: sipush -14802 (0xC62E)
		// @2E08: iastore
		// @2E09: dup
		// @2E0A: iconst_2
		// @2E0B: sipush -3330 (0xF2FE)
		// @2E0E: iastore
		// @2E0F: dup
		// @2E10: iconst_3
		// @2E11: sipush -16282 (0xC066)
		// @2E14: iastore
		// @2E15: dup
		// @2E16: iconst_4
		// @2E17: sipush 6291 (0x1893)
		// @2E1A: iastore
		// @2E1B: dup
		// @2E1C: iconst_5
		// @2E1D: sipush -28124 (0x9224)
		// @2E20: iastore
		// @2E21: dup
		// @2E22: bipush 6 (0x06)
		// @2E24: sipush -5550 (0xEA52)
		// @2E27: iastore
		// @2E28: dup
		// @2E29: bipush 7 (0x07)
		// @2E2B: sipush -5550 (0xEA52)
		// @2E2E: iastore
		// @2E2F: dup
		// @2E30: bipush 8 (0x08)
		// @2E32: sipush 8511 (0x213F)
		// @2E35: iastore
		// @2E36: dup
		// @2E37: bipush 9 (0x09)
		// @2E39: sipush -1110 (0xFBAA)
		// @2E3C: iastore
		// @2E3D: dup
		// @2E3E: bipush 10 (0x0A)
		// @2E40: sipush -13322 (0xCBF6)
		// @2E43: iastore
		// @2E44: dup
		// @2E45: bipush 11 (0x0B)
		// @2E47: sipush 4440 (0x1158)
		// @2E4A: iastore
		// @2E4B: dup
		// @2E4C: bipush 12 (0x0C)
		// @2E4E: sipush -7771 (0xE1A5)
		// @2E51: iastore
		// @2E52: dup
		// @2E53: bipush 13 (0x0D)
		// @2E55: iconst_0
		// @2E56: iastore
		// @2E57: dup
		// @2E58: bipush 14 (0x0E)
		// @2E5A: sipush 208 (0x00D0)
		// @2E5D: iastore
		// @2E5E: dup
		// @2E5F: bipush 15 (0x0F)
		// @2E61: sipush -260 (0xFEFC)
		// @2E64: iastore
		// @2E65: aastore
		// @2E66: aload_0
		// @2E67: bipush 10 (0x0A)
		// @2E69: bipush 16 (0x10)
		// @2E6B: newarray int[]
		// @2E6D: dup
		// @2E6E: iconst_0
		// @2E6F: iconst_0
		// @2E70: iastore
		// @2E71: dup
		// @2E72: iconst_1
		// @2E73: sipush -9251 (0xDBDD)
		// @2E76: iastore
		// @2E77: dup
		// @2E78: iconst_2
		// @2E79: sipush 4440 (0x1158)
		// @2E7C: iastore
		// @2E7D: dup
		// @2E7E: iconst_3
		// @2E7F: sipush -2220 (0xF754)
		// @2E82: iastore
		// @2E83: dup
		// @2E84: iconst_4
		// @2E85: sipush -3700 (0xF18C)
		// @2E88: iastore
		// @2E89: dup
		// @2E8A: iconst_5
		// @2E8B: sipush -17022 (0xBD82)
		// @2E8E: iastore
		// @2E8F: dup
		// @2E90: bipush 6 (0x06)
		// @2E92: iconst_0
		// @2E93: iastore
		// @2E94: dup
		// @2E95: bipush 7 (0x07)
		// @2E97: sipush -15912 (0xC1D8)
		// @2E9A: iastore
		// @2E9B: dup
		// @2E9C: bipush 8 (0x08)
		// @2E9E: sipush -3330 (0xF2FE)
		// @2EA1: iastore
		// @2EA2: dup
		// @2EA3: bipush 9 (0x09)
		// @2EA5: sipush 1480 (0x05C8)
		// @2EA8: iastore
		// @2EA9: dup
		// @2EAA: bipush 10 (0x0A)
		// @2EAC: sipush 3700 (0x0E74)
		// @2EAF: iastore
		// @2EB0: dup
		// @2EB1: bipush 11 (0x0B)
		// @2EB3: sipush 8511 (0x213F)
		// @2EB6: iastore
		// @2EB7: dup
		// @2EB8: bipush 12 (0x0C)
		// @2EBA: sipush 2590 (0x0A1E)
		// @2EBD: iastore
		// @2EBE: dup
		// @2EBF: bipush 13 (0x0D)
		// @2EC1: iconst_0
		// @2EC2: iastore
		// @2EC3: dup
		// @2EC4: bipush 14 (0x0E)
		// @2EC6: sipush 885 (0x0375)
		// @2EC9: iastore
		// @2ECA: dup
		// @2ECB: bipush 15 (0x0F)
		// @2ECD: sipush -625 (0xFD8F)
		// @2ED0: iastore
		// @2ED1: aastore
		// @2ED2: aload_0
		// @2ED3: bipush 15 (0x0F)
		// @2ED5: bipush 16 (0x10)
		// @2ED7: newarray int[]
		// @2ED9: dup
		// @2EDA: iconst_0
		// @2EDB: iconst_0
		// @2EDC: iastore
		// @2EDD: dup
		// @2EDE: iconst_1
		// @2EDF: sipush -4440 (0xEEA8)
		// @2EE2: iastore
		// @2EE3: dup
		// @2EE4: iconst_2
		// @2EE5: sipush 4070 (0x0FE6)
		// @2EE8: iastore
		// @2EE9: dup
		// @2EEA: iconst_3
		// @2EEB: sipush -5180 (0xEBC4)
		// @2EEE: iastore
		// @2EEF: dup
		// @2EF0: iconst_4
		// @2EF1: sipush 8141 (0x1FCD)
		// @2EF4: iastore
		// @2EF5: dup
		// @2EF6: iconst_5
		// @2EF7: sipush -1480 (0xFA38)
		// @2EFA: iastore
		// @2EFB: dup
		// @2EFC: bipush 6 (0x06)
		// @2EFE: iconst_0
		// @2EFF: iastore
		// @2F00: dup
		// @2F01: bipush 7 (0x07)
		// @2F03: sipush -4070 (0xF01A)
		// @2F06: iastore
		// @2F07: dup
		// @2F08: bipush 8 (0x08)
		// @2F0A: sipush 1110 (0x0456)
		// @2F0D: iastore
		// @2F0E: dup
		// @2F0F: bipush 9 (0x09)
		// @2F11: sipush -740 (0xFD1C)
		// @2F14: iastore
		// @2F15: dup
		// @2F16: bipush 10 (0x0A)
		// @2F18: sipush 1480 (0x05C8)
		// @2F1B: iastore
		// @2F1C: dup
		// @2F1D: bipush 11 (0x0B)
		// @2F1F: sipush 1850 (0x073A)
		// @2F22: iastore
		// @2F23: dup
		// @2F24: bipush 12 (0x0C)
		// @2F26: sipush 6291 (0x1893)
		// @2F29: iastore
		// @2F2A: dup
		// @2F2B: bipush 13 (0x0D)
		// @2F2D: sipush -2590 (0xF5E2)
		// @2F30: iastore
		// @2F31: dup
		// @2F32: bipush 14 (0x0E)
		// @2F34: sipush -2500 (0xF63C)
		// @2F37: iastore
		// @2F38: dup
		// @2F39: bipush 15 (0x0F)
		// @2F3B: sipush 572 (0x023C)
		// @2F3E: iastore
		// @2F3F: aastore
		// @2F40: aload_0
		// @2F41: bipush 23 (0x17)
		// @2F43: bipush 16 (0x10)
		// @2F45: newarray int[]
		// @2F47: dup
		// @2F48: iconst_0
		// @2F49: sipush -4810 (0xED36)
		// @2F4C: iastore
		// @2F4D: dup
		// @2F4E: iconst_1
		// @2F4F: sipush -17392 (0xBC10)
		// @2F52: iastore
		// @2F53: dup
		// @2F54: iconst_2
		// @2F55: sipush -8141 (0xE033)
		// @2F58: iastore
		// @2F59: dup
		// @2F5A: iconst_3
		// @2F5B: sipush -8141 (0xE033)
		// @2F5E: iastore
		// @2F5F: dup
		// @2F60: iconst_4
		// @2F61: sipush 5180 (0x143C)
		// @2F64: iastore
		// @2F65: dup
		// @2F66: iconst_5
		// @2F67: sipush -23684 (0xA37C)
		// @2F6A: iastore
		// @2F6B: dup
		// @2F6C: bipush 6 (0x06)
		// @2F6E: sipush -1480 (0xFA38)
		// @2F71: iastore
		// @2F72: dup
		// @2F73: bipush 7 (0x07)
		// @2F75: sipush 6291 (0x1893)
		// @2F78: iastore
		// @2F79: dup
		// @2F7A: bipush 8 (0x08)
		// @2F7C: sipush 3700 (0x0E74)
		// @2F7F: iastore
		// @2F80: dup
		// @2F81: bipush 9 (0x09)
		// @2F83: sipush 2590 (0x0A1E)
		// @2F86: iastore
		// @2F87: dup
		// @2F88: bipush 10 (0x0A)
		// @2F8A: sipush -4810 (0xED36)
		// @2F8D: iastore
		// @2F8E: dup
		// @2F8F: bipush 11 (0x0B)
		// @2F91: sipush -7031 (0xE489)
		// @2F94: iastore
		// @2F95: dup
		// @2F96: bipush 12 (0x0C)
		// @2F98: sipush -4070 (0xF01A)
		// @2F9B: iastore
		// @2F9C: dup
		// @2F9D: bipush 13 (0x0D)
		// @2F9F: sipush -3700 (0xF18C)
		// @2FA2: iastore
		// @2FA3: dup
		// @2FA4: bipush 14 (0x0E)
		// @2FA6: sipush 520 (0x0208)
		// @2FA9: iastore
		// @2FAA: dup
		// @2FAB: bipush 15 (0x0F)
		// @2FAD: sipush 364 (0x016C)
		// @2FB0: iastore
		// @2FB1: aastore
		// @2FB2: aload_0
		// @2FB3: bipush 14 (0x0E)
		// @2FB5: bipush 16 (0x10)
		// @2FB7: newarray int[]
		// @2FB9: dup
		// @2FBA: iconst_0
		// @2FBB: sipush 1850 (0x073A)
		// @2FBE: iastore
		// @2FBF: dup
		// @2FC0: iconst_1
		// @2FC1: sipush 9621 (0x2595)
		// @2FC4: iastore
		// @2FC5: dup
		// @2FC6: iconst_2
		// @2FC7: sipush 27384 (0x6AF8)
		// @2FCA: iastore
		// @2FCB: dup
		// @2FCC: iconst_3
		// @2FCD: sipush 7031 (0x1B77)
		// @2FD0: iastore
		// @2FD1: dup
		// @2FD2: iconst_4
		// @2FD3: sipush -27384 (0x9508)
		// @2FD6: iastore
		// @2FD7: dup
		// @2FD8: iconst_5
		// @2FD9: iconst_0
		// @2FDA: iastore
		// @2FDB: dup
		// @2FDC: bipush 6 (0x06)
		// @2FDE: sipush 2960 (0x0B90)
		// @2FE1: iastore
		// @2FE2: dup
		// @2FE3: bipush 7 (0x07)
		// @2FE5: sipush 1480 (0x05C8)
		// @2FE8: iastore
		// @2FE9: dup
		// @2FEA: bipush 8 (0x08)
		// @2FEC: ldc 34785 (0x87e1)
		// @2FEE: iastore
		// @2FEF: dup
		// @2FF0: bipush 9 (0x09)
		// @2FF2: sipush 2590 (0x0A1E)
		// @2FF5: iastore
		// @2FF6: dup
		// @2FF7: bipush 10 (0x0A)
		// @2FF9: sipush -5550 (0xEA52)
		// @2FFC: iastore
		// @2FFD: dup
		// @2FFE: bipush 11 (0x0B)
		// @3000: sipush -24424 (0xA098)
		// @3003: iastore
		// @3004: dup
		// @3005: bipush 12 (0x0C)
		// @3007: sipush -740 (0xFD1C)
		// @300A: iastore
		// @300B: dup
		// @300C: bipush 13 (0x0D)
		// @300E: sipush 3330 (0x0D02)
		// @3011: iastore
		// @3012: dup
		// @3013: bipush 14 (0x0E)
		// @3015: sipush -2500 (0xF63C)
		// @3018: iastore
		// @3019: dup
		// @301A: bipush 15 (0x0F)
		// @301C: sipush 833 (0x0341)
		// @301F: iastore
		// @3020: aastore
		// @3021: aload_0
		// @3022: iconst_3
		// @3023: bipush 16 (0x10)
		// @3025: newarray int[]
		// @3027: dup
		// @3028: iconst_0
		// @3029: sipush 2220 (0x08AC)
		// @302C: iastore
		// @302D: dup
		// @302E: iconst_1
		// @302F: iconst_0
		// @3030: iastore
		// @3031: dup
		// @3032: iconst_2
		// @3033: sipush -6661 (0xE5FB)
		// @3036: iastore
		// @3037: dup
		// @3038: iconst_3
		// @3039: sipush -740 (0xFD1C)
		// @303C: iastore
		// @303D: dup
		// @303E: iconst_4
		// @303F: sipush -2960 (0xF470)
		// @3042: iastore
		// @3043: dup
		// @3044: iconst_5
		// @3045: sipush -8881 (0xDD4F)
		// @3048: iastore
		// @3049: dup
		// @304A: bipush 6 (0x06)
		// @304C: sipush 1480 (0x05C8)
		// @304F: iastore
		// @3050: dup
		// @3051: bipush 7 (0x07)
		// @3053: sipush -17763 (0xBA9D)
		// @3056: iastore
		// @3057: dup
		// @3058: bipush 8 (0x08)
		// @305A: iconst_0
		// @305B: iastore
		// @305C: dup
		// @305D: bipush 9 (0x09)
		// @305F: sipush -1480 (0xFA38)
		// @3062: iastore
		// @3063: dup
		// @3064: bipush 10 (0x0A)
		// @3066: iconst_0
		// @3067: iastore
		// @3068: dup
		// @3069: bipush 11 (0x0B)
		// @306B: sipush 2960 (0x0B90)
		// @306E: iastore
		// @306F: dup
		// @3070: bipush 12 (0x0C)
		// @3072: sipush -1110 (0xFBAA)
		// @3075: iastore
		// @3076: dup
		// @3077: bipush 13 (0x0D)
		// @3079: sipush 1850 (0x073A)
		// @307C: iastore
		// @307D: dup
		// @307E: bipush 14 (0x0E)
		// @3080: sipush 208 (0x00D0)
		// @3083: iastore
		// @3084: dup
		// @3085: bipush 15 (0x0F)
		// @3087: sipush -1927 (0xF879)
		// @308A: iastore
		// @308B: aastore
		// @308C: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @308F: bipush 6 (0x06)
		// @3091: aaload
		// @3092: astore_0
		// @3093: aload_0
		// @3094: iconst_2
		// @3095: bipush 13 (0x0D)
		// @3097: newarray int[]
		// @3099: dup
		// @309A: iconst_0
		// @309B: sipush -2590 (0xF5E2)
		// @309E: iastore
		// @309F: dup
		// @30A0: iconst_1
		// @30A1: sipush 2960 (0x0B90)
		// @30A4: iastore
		// @30A5: dup
		// @30A6: iconst_2
		// @30A7: sipush 1480 (0x05C8)
		// @30AA: iastore
		// @30AB: dup
		// @30AC: iconst_3
		// @30AD: sipush -740 (0xFD1C)
		// @30B0: iastore
		// @30B1: dup
		// @30B2: iconst_4
		// @30B3: sipush -9251 (0xDBDD)
		// @30B6: iastore
		// @30B7: dup
		// @30B8: iconst_5
		// @30B9: sipush -740 (0xFD1C)
		// @30BC: iastore
		// @30BD: dup
		// @30BE: bipush 6 (0x06)
		// @30C0: iconst_0
		// @30C1: iastore
		// @30C2: dup
		// @30C3: bipush 7 (0x07)
		// @30C5: sipush 1850 (0x073A)
		// @30C8: iastore
		// @30C9: dup
		// @30CA: bipush 8 (0x08)
		// @30CC: sipush -2960 (0xF470)
		// @30CF: iastore
		// @30D0: dup
		// @30D1: bipush 9 (0x09)
		// @30D3: sipush -1480 (0xFA38)
		// @30D6: iastore
		// @30D7: dup
		// @30D8: bipush 10 (0x0A)
		// @30DA: iconst_0
		// @30DB: iastore
		// @30DC: dup
		// @30DD: bipush 11 (0x0B)
		// @30DF: sipush -1562 (0xF9E6)
		// @30E2: iastore
		// @30E3: dup
		// @30E4: bipush 12 (0x0C)
		// @30E6: iconst_0
		// @30E7: iastore
		// @30E8: aastore
		// @30E9: aload_0
		// @30EA: bipush 18 (0x12)
		// @30EC: bipush 13 (0x0D)
		// @30EE: newarray int[]
		// @30F0: dup
		// @30F1: iconst_0
		// @30F2: sipush -9621 (0xDA6B)
		// @30F5: iastore
		// @30F6: dup
		// @30F7: iconst_1
		// @30F8: sipush -1110 (0xFBAA)
		// @30FB: iastore
		// @30FC: dup
		// @30FD: iconst_2
		// @30FE: sipush 2960 (0x0B90)
		// @3101: iastore
		// @3102: dup
		// @3103: iconst_3
		// @3104: sipush -5921 (0xE8DF)
		// @3107: iastore
		// @3108: dup
		// @3109: iconst_4
		// @310A: sipush -9991 (0xD8F9)
		// @310D: iastore
		// @310E: dup
		// @310F: iconst_5
		// @3110: sipush -1110 (0xFBAA)
		// @3113: iastore
		// @3114: dup
		// @3115: bipush 6 (0x06)
		// @3117: sipush 3700 (0x0E74)
		// @311A: iastore
		// @311B: dup
		// @311C: bipush 7 (0x07)
		// @311E: sipush -9251 (0xDBDD)
		// @3121: iastore
		// @3122: dup
		// @3123: bipush 8 (0x08)
		// @3125: sipush -11101 (0xD4A3)
		// @3128: iastore
		// @3129: dup
		// @312A: bipush 9 (0x09)
		// @312C: sipush 2220 (0x08AC)
		// @312F: iastore
		// @3130: dup
		// @3131: bipush 10 (0x0A)
		// @3133: sipush -7401 (0xE317)
		// @3136: iastore
		// @3137: dup
		// @3138: bipush 11 (0x0B)
		// @313A: sipush -1927 (0xF879)
		// @313D: iastore
		// @313E: dup
		// @313F: bipush 12 (0x0C)
		// @3141: iconst_0
		// @3142: iastore
		// @3143: aastore
		// @3144: aload_0
		// @3145: iconst_0
		// @3146: bipush 13 (0x0D)
		// @3148: newarray int[]
		// @314A: dup
		// @314B: iconst_0
		// @314C: sipush -740 (0xFD1C)
		// @314F: iastore
		// @3150: dup
		// @3151: iconst_1
		// @3152: sipush -3700 (0xF18C)
		// @3155: iastore
		// @3156: dup
		// @3157: iconst_2
		// @3158: iconst_0
		// @3159: iastore
		// @315A: dup
		// @315B: iconst_3
		// @315C: iconst_0
		// @315D: iastore
		// @315E: dup
		// @315F: iconst_4
		// @3160: sipush -18503 (0xB7B9)
		// @3163: iastore
		// @3164: dup
		// @3165: iconst_5
		// @3166: iconst_0
		// @3167: iastore
		// @3168: dup
		// @3169: bipush 6 (0x06)
		// @316B: iconst_0
		// @316C: iastore
		// @316D: dup
		// @316E: bipush 7 (0x07)
		// @3170: iconst_0
		// @3171: iastore
		// @3172: dup
		// @3173: bipush 8 (0x08)
		// @3175: sipush -740 (0xFD1C)
		// @3178: iastore
		// @3179: dup
		// @317A: bipush 9 (0x09)
		// @317C: iconst_0
		// @317D: iastore
		// @317E: dup
		// @317F: bipush 10 (0x0A)
		// @3181: iconst_0
		// @3182: iastore
		// @3183: dup
		// @3184: bipush 11 (0x0B)
		// @3186: sipush -729 (0xFD27)
		// @3189: iastore
		// @318A: dup
		// @318B: bipush 12 (0x0C)
		// @318D: sipush -312 (0xFEC8)
		// @3190: iastore
		// @3191: aastore
		// @3192: aload_0
		// @3193: bipush 7 (0x07)
		// @3195: iconst_2
		// @3196: newarray int[]
		// @3198: dup
		// @3199: iconst_0
		// @319A: iconst_0
		// @319B: iastore
		// @319C: dup
		// @319D: iconst_1
		// @319E: iconst_0
		// @319F: iastore
		// @31A0: aastore
		// @31A1: aload_0
		// @31A2: bipush 11 (0x0B)
		// @31A4: bipush 13 (0x0D)
		// @31A6: newarray int[]
		// @31A8: dup
		// @31A9: iconst_0
		// @31AA: sipush -6291 (0xE76D)
		// @31AD: iastore
		// @31AE: dup
		// @31AF: iconst_1
		// @31B0: sipush -1480 (0xFA38)
		// @31B3: iastore
		// @31B4: dup
		// @31B5: iconst_2
		// @31B6: sipush -4070 (0xF01A)
		// @31B9: iastore
		// @31BA: dup
		// @31BB: iconst_3
		// @31BC: iconst_0
		// @31BD: iastore
		// @31BE: dup
		// @31BF: iconst_4
		// @31C0: sipush -11101 (0xD4A3)
		// @31C3: iastore
		// @31C4: dup
		// @31C5: iconst_5
		// @31C6: sipush 740 (0x02E4)
		// @31C9: iastore
		// @31CA: dup
		// @31CB: bipush 6 (0x06)
		// @31CD: sipush 740 (0x02E4)
		// @31D0: iastore
		// @31D1: dup
		// @31D2: bipush 7 (0x07)
		// @31D4: sipush 740 (0x02E4)
		// @31D7: iastore
		// @31D8: dup
		// @31D9: bipush 8 (0x08)
		// @31DB: sipush -740 (0xFD1C)
		// @31DE: iastore
		// @31DF: dup
		// @31E0: bipush 9 (0x09)
		// @31E2: sipush 7771 (0x1E5B)
		// @31E5: iastore
		// @31E6: dup
		// @31E7: bipush 10 (0x0A)
		// @31E9: sipush -1110 (0xFBAA)
		// @31EC: iastore
		// @31ED: dup
		// @31EE: bipush 11 (0x0B)
		// @31F0: sipush -2500 (0xF63C)
		// @31F3: iastore
		// @31F4: dup
		// @31F5: bipush 12 (0x0C)
		// @31F7: iconst_0
		// @31F8: iastore
		// @31F9: aastore
		// @31FA: aload_0
		// @31FB: bipush 16 (0x10)
		// @31FD: bipush 13 (0x0D)
		// @31FF: newarray int[]
		// @3201: dup
		// @3202: iconst_0
		// @3203: sipush -2220 (0xF754)
		// @3206: iastore
		// @3207: dup
		// @3208: iconst_1
		// @3209: sipush 4810 (0x12CA)
		// @320C: iastore
		// @320D: dup
		// @320E: iconst_2
		// @320F: sipush -1110 (0xFBAA)
		// @3212: iastore
		// @3213: dup
		// @3214: iconst_3
		// @3215: iconst_0
		// @3216: iastore
		// @3217: dup
		// @3218: iconst_4
		// @3219: sipush -6661 (0xE5FB)
		// @321C: iastore
		// @321D: dup
		// @321E: iconst_5
		// @321F: sipush 3330 (0x0D02)
		// @3222: iastore
		// @3223: dup
		// @3224: bipush 6 (0x06)
		// @3226: iconst_0
		// @3227: iastore
		// @3228: dup
		// @3229: bipush 7 (0x07)
		// @322B: sipush 1110 (0x0456)
		// @322E: iastore
		// @322F: dup
		// @3230: bipush 8 (0x08)
		// @3232: sipush -5180 (0xEBC4)
		// @3235: iastore
		// @3236: dup
		// @3237: bipush 9 (0x09)
		// @3239: sipush -1480 (0xFA38)
		// @323C: iastore
		// @323D: dup
		// @323E: bipush 10 (0x0A)
		// @3240: iconst_0
		// @3241: iastore
		// @3242: dup
		// @3243: bipush 11 (0x0B)
		// @3245: sipush -1666 (0xF97E)
		// @3248: iastore
		// @3249: dup
		// @324A: bipush 12 (0x0C)
		// @324C: iconst_0
		// @324D: iastore
		// @324E: aastore
		// @324F: aload_0
		// @3250: bipush 14 (0x0E)
		// @3252: bipush 13 (0x0D)
		// @3254: newarray int[]
		// @3256: dup
		// @3257: iconst_0
		// @3258: sipush -8141 (0xE033)
		// @325B: iastore
		// @325C: dup
		// @325D: iconst_1
		// @325E: sipush 5921 (0x1721)
		// @3261: iastore
		// @3262: dup
		// @3263: iconst_2
		// @3264: sipush -2590 (0xF5E2)
		// @3267: iastore
		// @3268: dup
		// @3269: iconst_3
		// @326A: iconst_0
		// @326B: iastore
		// @326C: dup
		// @326D: iconst_4
		// @326E: sipush -6661 (0xE5FB)
		// @3271: iastore
		// @3272: dup
		// @3273: iconst_5
		// @3274: sipush 3330 (0x0D02)
		// @3277: iastore
		// @3278: dup
		// @3279: bipush 6 (0x06)
		// @327B: sipush 1480 (0x05C8)
		// @327E: iastore
		// @327F: dup
		// @3280: bipush 7 (0x07)
		// @3282: sipush 1110 (0x0456)
		// @3285: iastore
		// @3286: dup
		// @3287: bipush 8 (0x08)
		// @3289: sipush -3700 (0xF18C)
		// @328C: iastore
		// @328D: dup
		// @328E: bipush 9 (0x09)
		// @3290: sipush 1480 (0x05C8)
		// @3293: iastore
		// @3294: dup
		// @3295: bipush 10 (0x0A)
		// @3297: iconst_0
		// @3298: iastore
		// @3299: dup
		// @329A: bipush 11 (0x0B)
		// @329C: sipush -2031 (0xF811)
		// @329F: iastore
		// @32A0: dup
		// @32A1: bipush 12 (0x0C)
		// @32A3: iconst_0
		// @32A4: iastore
		// @32A5: aastore
		// @32A6: aload_0
		// @32A7: bipush 10 (0x0A)
		// @32A9: bipush 13 (0x0D)
		// @32AB: newarray int[]
		// @32AD: dup
		// @32AE: iconst_0
		// @32AF: sipush -6291 (0xE76D)
		// @32B2: iastore
		// @32B3: dup
		// @32B4: iconst_1
		// @32B5: sipush -9621 (0xDA6B)
		// @32B8: iastore
		// @32B9: dup
		// @32BA: iconst_2
		// @32BB: iconst_0
		// @32BC: iastore
		// @32BD: dup
		// @32BE: iconst_3
		// @32BF: iconst_0
		// @32C0: iastore
		// @32C1: dup
		// @32C2: iconst_4
		// @32C3: sipush -17763 (0xBA9D)
		// @32C6: iastore
		// @32C7: dup
		// @32C8: iconst_5
		// @32C9: sipush -740 (0xFD1C)
		// @32CC: iastore
		// @32CD: dup
		// @32CE: bipush 6 (0x06)
		// @32D0: sipush 1480 (0x05C8)
		// @32D3: iastore
		// @32D4: dup
		// @32D5: bipush 7 (0x07)
		// @32D7: sipush 1110 (0x0456)
		// @32DA: iastore
		// @32DB: dup
		// @32DC: bipush 8 (0x08)
		// @32DE: sipush 8141 (0x1FCD)
		// @32E1: iastore
		// @32E2: dup
		// @32E3: bipush 9 (0x09)
		// @32E5: sipush 1480 (0x05C8)
		// @32E8: iastore
		// @32E9: dup
		// @32EA: bipush 10 (0x0A)
		// @32EC: iconst_0
		// @32ED: iastore
		// @32EE: dup
		// @32EF: bipush 11 (0x0B)
		// @32F1: sipush -2239 (0xF741)
		// @32F4: iastore
		// @32F5: dup
		// @32F6: bipush 12 (0x0C)
		// @32F8: iconst_0
		// @32F9: iastore
		// @32FA: aastore
		// @32FB: aload_0
		// @32FC: iconst_5
		// @32FD: iconst_2
		// @32FE: newarray int[]
		// @3300: dup
		// @3301: iconst_0
		// @3302: iconst_0
		// @3303: iastore
		// @3304: dup
		// @3305: iconst_1
		// @3306: iconst_0
		// @3307: iastore
		// @3308: aastore
		// @3309: aload_0
		// @330A: bipush 9 (0x09)
		// @330C: bipush 13 (0x0D)
		// @330E: newarray int[]
		// @3310: dup
		// @3311: iconst_0
		// @3312: sipush -6291 (0xE76D)
		// @3315: iastore
		// @3316: dup
		// @3317: iconst_1
		// @3318: sipush -5921 (0xE8DF)
		// @331B: iastore
		// @331C: dup
		// @331D: iconst_2
		// @331E: sipush 5921 (0x1721)
		// @3321: iastore
		// @3322: dup
		// @3323: iconst_3
		// @3324: iconst_0
		// @3325: iastore
		// @3326: dup
		// @3327: iconst_4
		// @3328: sipush -17392 (0xBC10)
		// @332B: iastore
		// @332C: dup
		// @332D: iconst_5
		// @332E: sipush -740 (0xFD1C)
		// @3331: iastore
		// @3332: dup
		// @3333: bipush 6 (0x06)
		// @3335: sipush 740 (0x02E4)
		// @3338: iastore
		// @3339: dup
		// @333A: bipush 7 (0x07)
		// @333C: sipush 1110 (0x0456)
		// @333F: iastore
		// @3340: dup
		// @3341: bipush 8 (0x08)
		// @3343: sipush 3330 (0x0D02)
		// @3346: iastore
		// @3347: dup
		// @3348: bipush 9 (0x09)
		// @334A: sipush 3700 (0x0E74)
		// @334D: iastore
		// @334E: dup
		// @334F: bipush 10 (0x0A)
		// @3351: iconst_0
		// @3352: iastore
		// @3353: dup
		// @3354: bipush 11 (0x0B)
		// @3356: sipush -1666 (0xF97E)
		// @3359: iastore
		// @335A: dup
		// @335B: bipush 12 (0x0C)
		// @335D: iconst_0
		// @335E: iastore
		// @335F: aastore
		// @3360: aload_0
		// @3361: iconst_3
		// @3362: bipush 13 (0x0D)
		// @3364: newarray int[]
		// @3366: dup
		// @3367: iconst_0
		// @3368: sipush -1480 (0xFA38)
		// @336B: iastore
		// @336C: dup
		// @336D: iconst_1
		// @336E: sipush 1850 (0x073A)
		// @3371: iastore
		// @3372: dup
		// @3373: iconst_2
		// @3374: sipush 1110 (0x0456)
		// @3377: iastore
		// @3378: dup
		// @3379: iconst_3
		// @337A: sipush -740 (0xFD1C)
		// @337D: iastore
		// @337E: dup
		// @337F: iconst_4
		// @3380: sipush -11101 (0xD4A3)
		// @3383: iastore
		// @3384: dup
		// @3385: iconst_5
		// @3386: sipush -2220 (0xF754)
		// @3389: iastore
		// @338A: dup
		// @338B: bipush 6 (0x06)
		// @338D: sipush 740 (0x02E4)
		// @3390: iastore
		// @3391: dup
		// @3392: bipush 7 (0x07)
		// @3394: iconst_0
		// @3395: iastore
		// @3396: dup
		// @3397: bipush 8 (0x08)
		// @3399: sipush -3330 (0xF2FE)
		// @339C: iastore
		// @339D: dup
		// @339E: bipush 9 (0x09)
		// @33A0: sipush -1480 (0xFA38)
		// @33A3: iastore
		// @33A4: dup
		// @33A5: bipush 10 (0x0A)
		// @33A7: iconst_0
		// @33A8: iastore
		// @33A9: dup
		// @33AA: bipush 11 (0x0B)
		// @33AC: sipush -1354 (0xFAB6)
		// @33AF: iastore
		// @33B0: dup
		// @33B1: bipush 12 (0x0C)
		// @33B3: iconst_0
		// @33B4: iastore
		// @33B5: aastore
		// @33B6: aload_0
		// @33B7: iconst_4
		// @33B8: bipush 13 (0x0D)
		// @33BA: newarray int[]
		// @33BC: dup
		// @33BD: iconst_0
		// @33BE: sipush -5921 (0xE8DF)
		// @33C1: iastore
		// @33C2: dup
		// @33C3: iconst_1
		// @33C4: sipush -1110 (0xFBAA)
		// @33C7: iastore
		// @33C8: dup
		// @33C9: iconst_2
		// @33CA: iconst_0
		// @33CB: iastore
		// @33CC: dup
		// @33CD: iconst_3
		// @33CE: sipush -740 (0xFD1C)
		// @33D1: iastore
		// @33D2: dup
		// @33D3: iconst_4
		// @33D4: sipush -17763 (0xBA9D)
		// @33D7: iastore
		// @33D8: dup
		// @33D9: iconst_5
		// @33DA: sipush -1480 (0xFA38)
		// @33DD: iastore
		// @33DE: dup
		// @33DF: bipush 6 (0x06)
		// @33E1: iconst_0
		// @33E2: iastore
		// @33E3: dup
		// @33E4: bipush 7 (0x07)
		// @33E6: sipush 2220 (0x08AC)
		// @33E9: iastore
		// @33EA: dup
		// @33EB: bipush 8 (0x08)
		// @33ED: sipush -1480 (0xFA38)
		// @33F0: iastore
		// @33F1: dup
		// @33F2: bipush 9 (0x09)
		// @33F4: sipush -1850 (0xF8C6)
		// @33F7: iastore
		// @33F8: dup
		// @33F9: bipush 10 (0x0A)
		// @33FB: iconst_0
		// @33FC: iastore
		// @33FD: dup
		// @33FE: bipush 11 (0x0B)
		// @3400: sipush -1510 (0xFA1A)
		// @3403: iastore
		// @3404: dup
		// @3405: bipush 12 (0x0C)
		// @3407: iconst_0
		// @3408: iastore
		// @3409: aastore
		// @340A: aload_0
		// @340B: bipush 23 (0x17)
		// @340D: iconst_2
		// @340E: newarray int[]
		// @3410: dup
		// @3411: iconst_0
		// @3412: iconst_0
		// @3413: iastore
		// @3414: dup
		// @3415: iconst_1
		// @3416: iconst_0
		// @3417: iastore
		// @3418: aastore
		// @3419: aload_0
		// @341A: bipush 22 (0x16)
		// @341C: iconst_2
		// @341D: newarray int[]
		// @341F: dup
		// @3420: iconst_0
		// @3421: iconst_0
		// @3422: iastore
		// @3423: dup
		// @3424: iconst_1
		// @3425: iconst_0
		// @3426: iastore
		// @3427: aastore
		// @3428: aload_0
		// @3429: iconst_1
		// @342A: bipush 13 (0x0D)
		// @342C: newarray int[]
		// @342E: dup
		// @342F: iconst_0
		// @3430: sipush -3700 (0xF18C)
		// @3433: iastore
		// @3434: dup
		// @3435: iconst_1
		// @3436: sipush -1110 (0xFBAA)
		// @3439: iastore
		// @343A: dup
		// @343B: iconst_2
		// @343C: sipush 1850 (0x073A)
		// @343F: iastore
		// @3440: dup
		// @3441: iconst_3
		// @3442: sipush -740 (0xFD1C)
		// @3445: iastore
		// @3446: dup
		// @3447: iconst_4
		// @3448: sipush -15542 (0xC34A)
		// @344B: iastore
		// @344C: dup
		// @344D: iconst_5
		// @344E: sipush -740 (0xFD1C)
		// @3451: iastore
		// @3452: dup
		// @3453: bipush 6 (0x06)
		// @3455: sipush 740 (0x02E4)
		// @3458: iastore
		// @3459: dup
		// @345A: bipush 7 (0x07)
		// @345C: sipush 3330 (0x0D02)
		// @345F: iastore
		// @3460: dup
		// @3461: bipush 8 (0x08)
		// @3463: sipush -1480 (0xFA38)
		// @3466: iastore
		// @3467: dup
		// @3468: bipush 9 (0x09)
		// @346A: sipush -1110 (0xFBAA)
		// @346D: iastore
		// @346E: dup
		// @346F: bipush 10 (0x0A)
		// @3471: iconst_0
		// @3472: iastore
		// @3473: dup
		// @3474: bipush 11 (0x0B)
		// @3476: sipush -1666 (0xF97E)
		// @3479: iastore
		// @347A: dup
		// @347B: bipush 12 (0x0C)
		// @347D: iconst_0
		// @347E: iastore
		// @347F: aastore
		// @3480: aload_0
		// @3481: bipush 24 (0x18)
		// @3483: iconst_2
		// @3484: newarray int[]
		// @3486: dup
		// @3487: iconst_0
		// @3488: iconst_0
		// @3489: iastore
		// @348A: dup
		// @348B: iconst_1
		// @348C: iconst_0
		// @348D: iastore
		// @348E: aastore
		// @348F: aload_0
		// @3490: bipush 13 (0x0D)
		// @3492: iconst_2
		// @3493: newarray int[]
		// @3495: dup
		// @3496: iconst_0
		// @3497: iconst_0
		// @3498: iastore
		// @3499: dup
		// @349A: iconst_1
		// @349B: iconst_0
		// @349C: iastore
		// @349D: aastore
		// @349E: aload_0
		// @349F: bipush 12 (0x0C)
		// @34A1: iconst_2
		// @34A2: newarray int[]
		// @34A4: dup
		// @34A5: iconst_0
		// @34A6: iconst_0
		// @34A7: iastore
		// @34A8: dup
		// @34A9: iconst_1
		// @34AA: iconst_0
		// @34AB: iastore
		// @34AC: aastore
		// @34AD: aload_0
		// @34AE: bipush 6 (0x06)
		// @34B0: iconst_2
		// @34B1: newarray int[]
		// @34B3: dup
		// @34B4: iconst_0
		// @34B5: iconst_0
		// @34B6: iastore
		// @34B7: dup
		// @34B8: iconst_1
		// @34B9: iconst_0
		// @34BA: iastore
		// @34BB: aastore
		// @34BC: aload_0
		// @34BD: bipush 20 (0x14)
		// @34BF: bipush 13 (0x0D)
		// @34C1: newarray int[]
		// @34C3: dup
		// @34C4: iconst_0
		// @34C5: sipush -9991 (0xD8F9)
		// @34C8: iastore
		// @34C9: dup
		// @34CA: iconst_1
		// @34CB: sipush -5921 (0xE8DF)
		// @34CE: iastore
		// @34CF: dup
		// @34D0: iconst_2
		// @34D1: sipush -5180 (0xEBC4)
		// @34D4: iastore
		// @34D5: dup
		// @34D6: iconst_3
		// @34D7: sipush -5921 (0xE8DF)
		// @34DA: iastore
		// @34DB: dup
		// @34DC: iconst_4
		// @34DD: sipush -3700 (0xF18C)
		// @34E0: iastore
		// @34E1: dup
		// @34E2: iconst_5
		// @34E3: sipush -4810 (0xED36)
		// @34E6: iastore
		// @34E7: dup
		// @34E8: bipush 6 (0x06)
		// @34EA: iconst_0
		// @34EB: iastore
		// @34EC: dup
		// @34ED: bipush 7 (0x07)
		// @34EF: sipush -12212 (0xD04C)
		// @34F2: iastore
		// @34F3: dup
		// @34F4: bipush 8 (0x08)
		// @34F6: sipush -12582 (0xCEDA)
		// @34F9: iastore
		// @34FA: dup
		// @34FB: bipush 9 (0x09)
		// @34FD: iconst_0
		// @34FE: iastore
		// @34FF: dup
		// @3500: bipush 10 (0x0A)
		// @3502: sipush -6661 (0xE5FB)
		// @3505: iastore
		// @3506: dup
		// @3507: bipush 11 (0x0B)
		// @3509: sipush -2239 (0xF741)
		// @350C: iastore
		// @350D: dup
		// @350E: bipush 12 (0x0C)
		// @3510: iconst_0
		// @3511: iastore
		// @3512: aastore
		// @3513: aload_0
		// @3514: bipush 19 (0x13)
		// @3516: bipush 13 (0x0D)
		// @3518: newarray int[]
		// @351A: dup
		// @351B: iconst_0
		// @351C: sipush -11471 (0xD331)
		// @351F: iastore
		// @3520: dup
		// @3521: iconst_1
		// @3522: sipush -5550 (0xEA52)
		// @3525: iastore
		// @3526: dup
		// @3527: iconst_2
		// @3528: sipush -2960 (0xF470)
		// @352B: iastore
		// @352C: dup
		// @352D: iconst_3
		// @352E: sipush -5921 (0xE8DF)
		// @3531: iastore
		// @3532: dup
		// @3533: iconst_4
		// @3534: sipush -2960 (0xF470)
		// @3537: iastore
		// @3538: dup
		// @3539: iconst_5
		// @353A: sipush -3700 (0xF18C)
		// @353D: iastore
		// @353E: dup
		// @353F: bipush 6 (0x06)
		// @3541: iconst_0
		// @3542: iastore
		// @3543: dup
		// @3544: bipush 7 (0x07)
		// @3546: sipush -11471 (0xD331)
		// @3549: iastore
		// @354A: dup
		// @354B: bipush 8 (0x08)
		// @354D: sipush -13322 (0xCBF6)
		// @3550: iastore
		// @3551: dup
		// @3552: bipush 9 (0x09)
		// @3554: sipush 2220 (0x08AC)
		// @3557: iastore
		// @3558: dup
		// @3559: bipush 10 (0x0A)
		// @355B: sipush -7031 (0xE489)
		// @355E: iastore
		// @355F: dup
		// @3560: bipush 11 (0x0B)
		// @3562: sipush -2135 (0xF7A9)
		// @3565: iastore
		// @3566: dup
		// @3567: bipush 12 (0x0C)
		// @3569: iconst_0
		// @356A: iastore
		// @356B: aastore
		// @356C: aload_0
		// @356D: bipush 8 (0x08)
		// @356F: bipush 12 (0x0C)
		// @3571: newarray int[]
		// @3573: dup
		// @3574: iconst_0
		// @3575: iconst_0
		// @3576: iastore
		// @3577: dup
		// @3578: iconst_1
		// @3579: iconst_0
		// @357A: iastore
		// @357B: dup
		// @357C: iconst_2
		// @357D: iconst_0
		// @357E: iastore
		// @357F: dup
		// @3580: iconst_3
		// @3581: iconst_0
		// @3582: iastore
		// @3583: dup
		// @3584: iconst_4
		// @3585: iconst_0
		// @3586: iastore
		// @3587: dup
		// @3588: iconst_5
		// @3589: iconst_0
		// @358A: iastore
		// @358B: dup
		// @358C: bipush 6 (0x06)
		// @358E: iconst_0
		// @358F: iastore
		// @3590: dup
		// @3591: bipush 7 (0x07)
		// @3593: iconst_0
		// @3594: iastore
		// @3595: dup
		// @3596: bipush 8 (0x08)
		// @3598: iconst_0
		// @3599: iastore
		// @359A: dup
		// @359B: bipush 9 (0x09)
		// @359D: iconst_0
		// @359E: iastore
		// @359F: dup
		// @35A0: bipush 10 (0x0A)
		// @35A2: iconst_0
		// @35A3: iastore
		// @35A4: dup
		// @35A5: bipush 11 (0x0B)
		// @35A7: iconst_0
		// @35A8: iastore
		// @35A9: aastore
		// @35AA: aload_0
		// @35AB: bipush 25 (0x19)
		// @35AD: bipush 8 (0x08)
		// @35AF: newarray int[]
		// @35B1: dup
		// @35B2: iconst_0
		// @35B3: bipush 80 (0x50)
		// @35B5: iastore
		// @35B6: dup
		// @35B7: iconst_1
		// @35B8: iconst_2
		// @35B9: iastore
		// @35BA: dup
		// @35BB: iconst_2
		// @35BC: bipush 25 (0x19)
		// @35BE: iastore
		// @35BF: dup
		// @35C0: iconst_3
		// @35C1: iconst_4
		// @35C2: iastore
		// @35C3: dup
		// @35C4: iconst_4
		// @35C5: iconst_3
		// @35C6: iastore
		// @35C7: dup
		// @35C8: iconst_5
		// @35C9: bipush 80 (0x50)
		// @35CB: iastore
		// @35CC: dup
		// @35CD: bipush 6 (0x06)
		// @35CF: iconst_2
		// @35D0: iastore
		// @35D1: dup
		// @35D2: bipush 7 (0x07)
		// @35D4: iconst_4
		// @35D5: iastore
		// @35D6: aastore
		// @35D7: aload_0
		// @35D8: bipush 21 (0x15)
		// @35DA: iconst_2
		// @35DB: newarray int[]
		// @35DD: dup
		// @35DE: iconst_0
		// @35DF: iconst_0
		// @35E0: iastore
		// @35E1: dup
		// @35E2: iconst_1
		// @35E3: iconst_0
		// @35E4: iastore
		// @35E5: aastore
		// @35E6: aload_0
		// @35E7: bipush 15 (0x0F)
		// @35E9: bipush 13 (0x0D)
		// @35EB: newarray int[]
		// @35ED: dup
		// @35EE: iconst_0
		// @35EF: sipush 4070 (0x0FE6)
		// @35F2: iastore
		// @35F3: dup
		// @35F4: iconst_1
		// @35F5: sipush 8881 (0x22B1)
		// @35F8: iastore
		// @35F9: dup
		// @35FA: iconst_2
		// @35FB: sipush 1480 (0x05C8)
		// @35FE: iastore
		// @35FF: dup
		// @3600: iconst_3
		// @3601: iconst_0
		// @3602: iastore
		// @3603: dup
		// @3604: iconst_4
		// @3605: sipush -6661 (0xE5FB)
		// @3608: iastore
		// @3609: dup
		// @360A: iconst_5
		// @360B: sipush 5180 (0x143C)
		// @360E: iastore
		// @360F: dup
		// @3610: bipush 6 (0x06)
		// @3612: sipush -740 (0xFD1C)
		// @3615: iastore
		// @3616: dup
		// @3617: bipush 7 (0x07)
		// @3619: sipush 1110 (0x0456)
		// @361C: iastore
		// @361D: dup
		// @361E: bipush 8 (0x08)
		// @3620: sipush -7771 (0xE1A5)
		// @3623: iastore
		// @3624: dup
		// @3625: bipush 9 (0x09)
		// @3627: sipush -2590 (0xF5E2)
		// @362A: iastore
		// @362B: dup
		// @362C: bipush 10 (0x0A)
		// @362E: iconst_0
		// @362F: iastore
		// @3630: dup
		// @3631: bipush 11 (0x0B)
		// @3633: sipush -1666 (0xF97E)
		// @3636: iastore
		// @3637: dup
		// @3638: bipush 12 (0x0C)
		// @363A: iconst_0
		// @363B: iastore
		// @363C: aastore
		// @363D: aload_0
		// @363E: bipush 17 (0x11)
		// @3640: bipush 13 (0x0D)
		// @3642: newarray int[]
		// @3644: dup
		// @3645: iconst_0
		// @3646: sipush -6661 (0xE5FB)
		// @3649: iastore
		// @364A: dup
		// @364B: iconst_1
		// @364C: sipush -3700 (0xF18C)
		// @364F: iastore
		// @3650: dup
		// @3651: iconst_2
		// @3652: sipush -1850 (0xF8C6)
		// @3655: iastore
		// @3656: dup
		// @3657: iconst_3
		// @3658: sipush -5921 (0xE8DF)
		// @365B: iastore
		// @365C: dup
		// @365D: iconst_4
		// @365E: sipush -7771 (0xE1A5)
		// @3661: iastore
		// @3662: dup
		// @3663: iconst_5
		// @3664: sipush -2220 (0xF754)
		// @3667: iastore
		// @3668: dup
		// @3669: bipush 6 (0x06)
		// @366B: iconst_0
		// @366C: iastore
		// @366D: dup
		// @366E: bipush 7 (0x07)
		// @3670: sipush -9991 (0xD8F9)
		// @3673: iastore
		// @3674: dup
		// @3675: bipush 8 (0x08)
		// @3677: sipush -12582 (0xCEDA)
		// @367A: iastore
		// @367B: dup
		// @367C: bipush 9 (0x09)
		// @367E: iconst_0
		// @367F: iastore
		// @3680: dup
		// @3681: bipush 10 (0x0A)
		// @3683: sipush -7771 (0xE1A5)
		// @3686: iastore
		// @3687: dup
		// @3688: bipush 11 (0x0B)
		// @368A: sipush -1979 (0xF845)
		// @368D: iastore
		// @368E: dup
		// @368F: bipush 12 (0x0C)
		// @3691: iconst_0
		// @3692: iastore
		// @3693: aastore
		// @3694: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @3697: bipush 7 (0x07)
		// @3699: aaload
		// @369A: astore_0
		// @369B: aload_0
		// @369C: bipush 13 (0x0D)
		// @369E: bipush 13 (0x0D)
		// @36A0: newarray int[]
		// @36A2: dup
		// @36A3: iconst_0
		// @36A4: sipush -740 (0xFD1C)
		// @36A7: iastore
		// @36A8: dup
		// @36A9: iconst_1
		// @36AA: sipush 1480 (0x05C8)
		// @36AD: iastore
		// @36AE: dup
		// @36AF: iconst_2
		// @36B0: sipush 9251 (0x2423)
		// @36B3: iastore
		// @36B4: dup
		// @36B5: iconst_3
		// @36B6: sipush 2220 (0x08AC)
		// @36B9: iastore
		// @36BA: dup
		// @36BB: iconst_4
		// @36BC: iconst_0
		// @36BD: iastore
		// @36BE: dup
		// @36BF: iconst_5
		// @36C0: iconst_0
		// @36C1: iastore
		// @36C2: dup
		// @36C3: bipush 6 (0x06)
		// @36C5: sipush -3700 (0xF18C)
		// @36C8: iastore
		// @36C9: dup
		// @36CA: bipush 7 (0x07)
		// @36CC: sipush -4810 (0xED36)
		// @36CF: iastore
		// @36D0: dup
		// @36D1: bipush 8 (0x08)
		// @36D3: sipush -3330 (0xF2FE)
		// @36D6: iastore
		// @36D7: dup
		// @36D8: bipush 9 (0x09)
		// @36DA: iconst_0
		// @36DB: iastore
		// @36DC: dup
		// @36DD: bipush 10 (0x0A)
		// @36DF: sipush 740 (0x02E4)
		// @36E2: iastore
		// @36E3: dup
		// @36E4: bipush 11 (0x0B)
		// @36E6: iconst_0
		// @36E7: iastore
		// @36E8: dup
		// @36E9: bipush 12 (0x0C)
		// @36EB: sipush 1197 (0x04AD)
		// @36EE: iastore
		// @36EF: aastore
		// @36F0: aload_0
		// @36F1: bipush 21 (0x15)
		// @36F3: bipush 13 (0x0D)
		// @36F5: newarray int[]
		// @36F7: dup
		// @36F8: iconst_0
		// @36F9: sipush -740 (0xFD1C)
		// @36FC: iastore
		// @36FD: dup
		// @36FE: iconst_1
		// @36FF: sipush 1110 (0x0456)
		// @3702: iastore
		// @3703: dup
		// @3704: iconst_2
		// @3705: sipush -10361 (0xD787)
		// @3708: iastore
		// @3709: dup
		// @370A: iconst_3
		// @370B: sipush -6661 (0xE5FB)
		// @370E: iastore
		// @370F: dup
		// @3710: iconst_4
		// @3711: sipush -8141 (0xE033)
		// @3714: iastore
		// @3715: dup
		// @3716: iconst_5
		// @3717: sipush -7031 (0xE489)
		// @371A: iastore
		// @371B: dup
		// @371C: bipush 6 (0x06)
		// @371E: sipush 4070 (0x0FE6)
		// @3721: iastore
		// @3722: dup
		// @3723: bipush 7 (0x07)
		// @3725: sipush -1110 (0xFBAA)
		// @3728: iastore
		// @3729: dup
		// @372A: bipush 8 (0x08)
		// @372C: iconst_0
		// @372D: iastore
		// @372E: dup
		// @372F: bipush 9 (0x09)
		// @3731: iconst_0
		// @3732: iastore
		// @3733: dup
		// @3734: bipush 10 (0x0A)
		// @3736: sipush 10731 (0x29EB)
		// @3739: iastore
		// @373A: dup
		// @373B: bipush 11 (0x0B)
		// @373D: sipush -416 (0xFE60)
		// @3740: iastore
		// @3741: dup
		// @3742: bipush 12 (0x0C)
		// @3744: sipush -156 (0xFF64)
		// @3747: iastore
		// @3748: aastore
		// @3749: aload_0
		// @374A: bipush 14 (0x0E)
		// @374C: bipush 13 (0x0D)
		// @374E: newarray int[]
		// @3750: dup
		// @3751: iconst_0
		// @3752: iconst_0
		// @3753: iastore
		// @3754: dup
		// @3755: iconst_1
		// @3756: iconst_0
		// @3757: iastore
		// @3758: dup
		// @3759: iconst_2
		// @375A: sipush 5550 (0x15AE)
		// @375D: iastore
		// @375E: dup
		// @375F: iconst_3
		// @3760: sipush -1110 (0xFBAA)
		// @3763: iastore
		// @3764: dup
		// @3765: iconst_4
		// @3766: sipush 1850 (0x073A)
		// @3769: iastore
		// @376A: dup
		// @376B: iconst_5
		// @376C: sipush 17392 (0x43F0)
		// @376F: iastore
		// @3770: dup
		// @3771: bipush 6 (0x06)
		// @3773: sipush -7401 (0xE317)
		// @3776: iastore
		// @3777: dup
		// @3778: bipush 7 (0x07)
		// @377A: sipush -8141 (0xE033)
		// @377D: iastore
		// @377E: dup
		// @377F: bipush 8 (0x08)
		// @3781: sipush -3330 (0xF2FE)
		// @3784: iastore
		// @3785: dup
		// @3786: bipush 9 (0x09)
		// @3788: sipush 5550 (0x15AE)
		// @378B: iastore
		// @378C: dup
		// @378D: bipush 10 (0x0A)
		// @378F: sipush 7401 (0x1CE9)
		// @3792: iastore
		// @3793: dup
		// @3794: bipush 11 (0x0B)
		// @3796: sipush -1354 (0xFAB6)
		// @3799: iastore
		// @379A: dup
		// @379B: bipush 12 (0x0C)
		// @379D: iconst_0
		// @379E: iastore
		// @379F: aastore
		// @37A0: aload_0
		// @37A1: iconst_3
		// @37A2: bipush 13 (0x0D)
		// @37A4: newarray int[]
		// @37A6: dup
		// @37A7: iconst_0
		// @37A8: sipush -740 (0xFD1C)
		// @37AB: iastore
		// @37AC: dup
		// @37AD: iconst_1
		// @37AE: sipush 1480 (0x05C8)
		// @37B1: iastore
		// @37B2: dup
		// @37B3: iconst_2
		// @37B4: iconst_0
		// @37B5: iastore
		// @37B6: dup
		// @37B7: iconst_3
		// @37B8: sipush 4070 (0x0FE6)
		// @37BB: iastore
		// @37BC: dup
		// @37BD: iconst_4
		// @37BE: sipush 6291 (0x1893)
		// @37C1: iastore
		// @37C2: dup
		// @37C3: iconst_5
		// @37C4: sipush 5180 (0x143C)
		// @37C7: iastore
		// @37C8: dup
		// @37C9: bipush 6 (0x06)
		// @37CB: sipush -740 (0xFD1C)
		// @37CE: iastore
		// @37CF: dup
		// @37D0: bipush 7 (0x07)
		// @37D2: sipush -6661 (0xE5FB)
		// @37D5: iastore
		// @37D6: dup
		// @37D7: bipush 8 (0x08)
		// @37D9: sipush -2960 (0xF470)
		// @37DC: iastore
		// @37DD: dup
		// @37DE: bipush 9 (0x09)
		// @37E0: iconst_0
		// @37E1: iastore
		// @37E2: dup
		// @37E3: bipush 10 (0x0A)
		// @37E5: sipush 6661 (0x1A05)
		// @37E8: iastore
		// @37E9: dup
		// @37EA: bipush 11 (0x0B)
		// @37EC: sipush -208 (0xFF30)
		// @37EF: iastore
		// @37F0: dup
		// @37F1: bipush 12 (0x0C)
		// @37F3: sipush 208 (0x00D0)
		// @37F6: iastore
		// @37F7: aastore
		// @37F8: aload_0
		// @37F9: bipush 7 (0x07)
		// @37FB: bipush 13 (0x0D)
		// @37FD: newarray int[]
		// @37FF: dup
		// @3800: iconst_0
		// @3801: sipush -740 (0xFD1C)
		// @3804: iastore
		// @3805: dup
		// @3806: iconst_1
		// @3807: sipush 1480 (0x05C8)
		// @380A: iastore
		// @380B: dup
		// @380C: iconst_2
		// @380D: sipush -5921 (0xE8DF)
		// @3810: iastore
		// @3811: dup
		// @3812: iconst_3
		// @3813: sipush -4440 (0xEEA8)
		// @3816: iastore
		// @3817: dup
		// @3818: iconst_4
		// @3819: sipush -4070 (0xF01A)
		// @381C: iastore
		// @381D: dup
		// @381E: iconst_5
		// @381F: iconst_0
		// @3820: iastore
		// @3821: dup
		// @3822: bipush 6 (0x06)
		// @3824: sipush -1850 (0xF8C6)
		// @3827: iastore
		// @3828: dup
		// @3829: bipush 7 (0x07)
		// @382B: sipush 2590 (0x0A1E)
		// @382E: iastore
		// @382F: dup
		// @3830: bipush 8 (0x08)
		// @3832: sipush 12212 (0x2FB4)
		// @3835: iastore
		// @3836: dup
		// @3837: bipush 9 (0x09)
		// @3839: sipush 9251 (0x2423)
		// @383C: iastore
		// @383D: dup
		// @383E: bipush 10 (0x0A)
		// @3840: sipush 5180 (0x143C)
		// @3843: iastore
		// @3844: dup
		// @3845: bipush 11 (0x0B)
		// @3847: sipush 208 (0x00D0)
		// @384A: iastore
		// @384B: dup
		// @384C: bipush 12 (0x0C)
		// @384E: iconst_0
		// @384F: iastore
		// @3850: aastore
		// @3851: aload_0
		// @3852: bipush 19 (0x13)
		// @3854: bipush 13 (0x0D)
		// @3856: newarray int[]
		// @3858: dup
		// @3859: iconst_0
		// @385A: sipush -740 (0xFD1C)
		// @385D: iastore
		// @385E: dup
		// @385F: iconst_1
		// @3860: sipush 1480 (0x05C8)
		// @3863: iastore
		// @3864: dup
		// @3865: iconst_2
		// @3866: sipush -4070 (0xF01A)
		// @3869: iastore
		// @386A: dup
		// @386B: iconst_3
		// @386C: iconst_0
		// @386D: iastore
		// @386E: dup
		// @386F: iconst_4
		// @3870: sipush 2220 (0x08AC)
		// @3873: iastore
		// @3874: dup
		// @3875: iconst_5
		// @3876: sipush -2590 (0xF5E2)
		// @3879: iastore
		// @387A: dup
		// @387B: bipush 6 (0x06)
		// @387D: sipush 2220 (0x08AC)
		// @3880: iastore
		// @3881: dup
		// @3882: bipush 7 (0x07)
		// @3884: sipush -4070 (0xF01A)
		// @3887: iastore
		// @3888: dup
		// @3889: bipush 8 (0x08)
		// @388B: sipush -2960 (0xF470)
		// @388E: iastore
		// @388F: dup
		// @3890: bipush 9 (0x09)
		// @3892: sipush -7401 (0xE317)
		// @3895: iastore
		// @3896: dup
		// @3897: bipush 10 (0x0A)
		// @3899: sipush 7031 (0x1B77)
		// @389C: iastore
		// @389D: dup
		// @389E: bipush 11 (0x0B)
		// @38A0: sipush -937 (0xFC57)
		// @38A3: iastore
		// @38A4: dup
		// @38A5: bipush 12 (0x0C)
		// @38A7: sipush 208 (0x00D0)
		// @38AA: iastore
		// @38AB: aastore
		// @38AC: aload_0
		// @38AD: bipush 12 (0x0C)
		// @38AF: bipush 13 (0x0D)
		// @38B1: newarray int[]
		// @38B3: dup
		// @38B4: iconst_0
		// @38B5: sipush -740 (0xFD1C)
		// @38B8: iastore
		// @38B9: dup
		// @38BA: iconst_1
		// @38BB: sipush 3700 (0x0E74)
		// @38BE: iastore
		// @38BF: dup
		// @38C0: iconst_2
		// @38C1: sipush 9621 (0x2595)
		// @38C4: iastore
		// @38C5: dup
		// @38C6: iconst_3
		// @38C7: iconst_0
		// @38C8: iastore
		// @38C9: dup
		// @38CA: iconst_4
		// @38CB: sipush 11471 (0x2CCF)
		// @38CE: iastore
		// @38CF: dup
		// @38D0: iconst_5
		// @38D1: sipush 1480 (0x05C8)
		// @38D4: iastore
		// @38D5: dup
		// @38D6: bipush 6 (0x06)
		// @38D8: sipush -7031 (0xE489)
		// @38DB: iastore
		// @38DC: dup
		// @38DD: bipush 7 (0x07)
		// @38DF: sipush -6291 (0xE76D)
		// @38E2: iastore
		// @38E3: dup
		// @38E4: bipush 8 (0x08)
		// @38E6: sipush 8141 (0x1FCD)
		// @38E9: iastore
		// @38EA: dup
		// @38EB: bipush 9 (0x09)
		// @38ED: sipush 7031 (0x1B77)
		// @38F0: iastore
		// @38F1: dup
		// @38F2: bipush 10 (0x0A)
		// @38F4: sipush 8511 (0x213F)
		// @38F7: iastore
		// @38F8: dup
		// @38F9: bipush 11 (0x0B)
		// @38FB: sipush -364 (0xFE94)
		// @38FE: iastore
		// @38FF: dup
		// @3900: bipush 12 (0x0C)
		// @3902: sipush 2239 (0x08BF)
		// @3905: iastore
		// @3906: aastore
		// @3907: aload_0
		// @3908: bipush 25 (0x19)
		// @390A: bipush 8 (0x08)
		// @390C: newarray int[]
		// @390E: dup
		// @390F: iconst_0
		// @3910: bipush 33 (0x21)
		// @3912: iastore
		// @3913: dup
		// @3914: iconst_1
		// @3915: bipush 6 (0x06)
		// @3917: iastore
		// @3918: dup
		// @3919: iconst_2
		// @391A: bipush 25 (0x19)
		// @391C: iastore
		// @391D: dup
		// @391E: iconst_3
		// @391F: bipush 8 (0x08)
		// @3921: iastore
		// @3922: dup
		// @3923: iconst_4
		// @3924: iconst_4
		// @3925: iastore
		// @3926: dup
		// @3927: iconst_5
		// @3928: bipush 22 (0x16)
		// @392A: iastore
		// @392B: dup
		// @392C: bipush 6 (0x06)
		// @392E: bipush 6 (0x06)
		// @3930: iastore
		// @3931: dup
		// @3932: bipush 7 (0x07)
		// @3934: bipush 8 (0x08)
		// @3936: iastore
		// @3937: aastore
		// @3938: aload_0
		// @3939: bipush 20 (0x14)
		// @393B: bipush 13 (0x0D)
		// @393D: newarray int[]
		// @393F: dup
		// @3940: iconst_0
		// @3941: sipush -1850 (0xF8C6)
		// @3944: iastore
		// @3945: dup
		// @3946: iconst_1
		// @3947: sipush 1110 (0x0456)
		// @394A: iastore
		// @394B: dup
		// @394C: iconst_2
		// @394D: sipush -13692 (0xCA84)
		// @3950: iastore
		// @3951: dup
		// @3952: iconst_3
		// @3953: sipush -9621 (0xDA6B)
		// @3956: iastore
		// @3957: dup
		// @3958: iconst_4
		// @3959: sipush -10361 (0xD787)
		// @395C: iastore
		// @395D: dup
		// @395E: iconst_5
		// @395F: sipush -8881 (0xDD4F)
		// @3962: iastore
		// @3963: dup
		// @3964: bipush 6 (0x06)
		// @3966: sipush 1110 (0x0456)
		// @3969: iastore
		// @396A: dup
		// @396B: bipush 7 (0x07)
		// @396D: sipush -2960 (0xF470)
		// @3970: iastore
		// @3971: dup
		// @3972: bipush 8 (0x08)
		// @3974: sipush 1480 (0x05C8)
		// @3977: iastore
		// @3978: dup
		// @3979: bipush 9 (0x09)
		// @397B: sipush -7031 (0xE489)
		// @397E: iastore
		// @397F: dup
		// @3980: bipush 10 (0x0A)
		// @3982: sipush 5550 (0x15AE)
		// @3985: iastore
		// @3986: dup
		// @3987: bipush 11 (0x0B)
		// @3989: sipush -364 (0xFE94)
		// @398C: iastore
		// @398D: dup
		// @398E: bipush 12 (0x0C)
		// @3990: sipush 156 (0x009C)
		// @3993: iastore
		// @3994: aastore
		// @3995: aload_0
		// @3996: iconst_2
		// @3997: bipush 13 (0x0D)
		// @3999: newarray int[]
		// @399B: dup
		// @399C: iconst_0
		// @399D: sipush -740 (0xFD1C)
		// @39A0: iastore
		// @39A1: dup
		// @39A2: iconst_1
		// @39A3: sipush 1480 (0x05C8)
		// @39A6: iastore
		// @39A7: dup
		// @39A8: iconst_2
		// @39A9: iconst_0
		// @39AA: iastore
		// @39AB: dup
		// @39AC: iconst_3
		// @39AD: sipush 4440 (0x1158)
		// @39B0: iastore
		// @39B1: dup
		// @39B2: iconst_4
		// @39B3: sipush 8881 (0x22B1)
		// @39B6: iastore
		// @39B7: dup
		// @39B8: iconst_5
		// @39B9: sipush 2590 (0x0A1E)
		// @39BC: iastore
		// @39BD: dup
		// @39BE: bipush 6 (0x06)
		// @39C0: sipush -5921 (0xE8DF)
		// @39C3: iastore
		// @39C4: dup
		// @39C5: bipush 7 (0x07)
		// @39C7: sipush -4810 (0xED36)
		// @39CA: iastore
		// @39CB: dup
		// @39CC: bipush 8 (0x08)
		// @39CE: sipush -3330 (0xF2FE)
		// @39D1: iastore
		// @39D2: dup
		// @39D3: bipush 9 (0x09)
		// @39D5: iconst_0
		// @39D6: iastore
		// @39D7: dup
		// @39D8: bipush 10 (0x0A)
		// @39DA: sipush 5180 (0x143C)
		// @39DD: iastore
		// @39DE: dup
		// @39DF: bipush 11 (0x0B)
		// @39E1: sipush 364 (0x016C)
		// @39E4: iastore
		// @39E5: dup
		// @39E6: bipush 12 (0x0C)
		// @39E8: sipush 572 (0x023C)
		// @39EB: iastore
		// @39EC: aastore
		// @39ED: aload_0
		// @39EE: iconst_0
		// @39EF: bipush 13 (0x0D)
		// @39F1: newarray int[]
		// @39F3: dup
		// @39F4: iconst_0
		// @39F5: sipush -740 (0xFD1C)
		// @39F8: iastore
		// @39F9: dup
		// @39FA: iconst_1
		// @39FB: sipush 1480 (0x05C8)
		// @39FE: iastore
		// @39FF: dup
		// @3A00: iconst_2
		// @3A01: sipush 9251 (0x2423)
		// @3A04: iastore
		// @3A05: dup
		// @3A06: iconst_3
		// @3A07: sipush 2220 (0x08AC)
		// @3A0A: iastore
		// @3A0B: dup
		// @3A0C: iconst_4
		// @3A0D: iconst_0
		// @3A0E: iastore
		// @3A0F: dup
		// @3A10: iconst_5
		// @3A11: iconst_0
		// @3A12: iastore
		// @3A13: dup
		// @3A14: bipush 6 (0x06)
		// @3A16: sipush -3700 (0xF18C)
		// @3A19: iastore
		// @3A1A: dup
		// @3A1B: bipush 7 (0x07)
		// @3A1D: sipush -4810 (0xED36)
		// @3A20: iastore
		// @3A21: dup
		// @3A22: bipush 8 (0x08)
		// @3A24: sipush -3330 (0xF2FE)
		// @3A27: iastore
		// @3A28: dup
		// @3A29: bipush 9 (0x09)
		// @3A2B: iconst_0
		// @3A2C: iastore
		// @3A2D: dup
		// @3A2E: bipush 10 (0x0A)
		// @3A30: sipush 740 (0x02E4)
		// @3A33: iastore
		// @3A34: dup
		// @3A35: bipush 11 (0x0B)
		// @3A37: iconst_0
		// @3A38: iastore
		// @3A39: dup
		// @3A3A: bipush 12 (0x0C)
		// @3A3C: sipush 1197 (0x04AD)
		// @3A3F: iastore
		// @3A40: aastore
		// @3A41: aload_0
		// @3A42: bipush 10 (0x0A)
		// @3A44: bipush 13 (0x0D)
		// @3A46: newarray int[]
		// @3A48: dup
		// @3A49: iconst_0
		// @3A4A: sipush -740 (0xFD1C)
		// @3A4D: iastore
		// @3A4E: dup
		// @3A4F: iconst_1
		// @3A50: sipush 1480 (0x05C8)
		// @3A53: iastore
		// @3A54: dup
		// @3A55: iconst_2
		// @3A56: iconst_0
		// @3A57: iastore
		// @3A58: dup
		// @3A59: iconst_3
		// @3A5A: sipush 7031 (0x1B77)
		// @3A5D: iastore
		// @3A5E: dup
		// @3A5F: iconst_4
		// @3A60: sipush 9621 (0x2595)
		// @3A63: iastore
		// @3A64: dup
		// @3A65: iconst_5
		// @3A66: iconst_0
		// @3A67: iastore
		// @3A68: dup
		// @3A69: bipush 6 (0x06)
		// @3A6B: sipush -9991 (0xD8F9)
		// @3A6E: iastore
		// @3A6F: dup
		// @3A70: bipush 7 (0x07)
		// @3A72: sipush -4070 (0xF01A)
		// @3A75: iastore
		// @3A76: dup
		// @3A77: bipush 8 (0x08)
		// @3A79: sipush -3330 (0xF2FE)
		// @3A7C: iastore
		// @3A7D: dup
		// @3A7E: bipush 9 (0x09)
		// @3A80: iconst_0
		// @3A81: iastore
		// @3A82: dup
		// @3A83: bipush 10 (0x0A)
		// @3A85: sipush 8511 (0x213F)
		// @3A88: iastore
		// @3A89: dup
		// @3A8A: bipush 11 (0x0B)
		// @3A8C: sipush 885 (0x0375)
		// @3A8F: iastore
		// @3A90: dup
		// @3A91: bipush 12 (0x0C)
		// @3A93: sipush 1197 (0x04AD)
		// @3A96: iastore
		// @3A97: aastore
		// @3A98: aload_0
		// @3A99: bipush 22 (0x16)
		// @3A9B: bipush 13 (0x0D)
		// @3A9D: newarray int[]
		// @3A9F: dup
		// @3AA0: iconst_0
		// @3AA1: sipush -740 (0xFD1C)
		// @3AA4: iastore
		// @3AA5: dup
		// @3AA6: iconst_1
		// @3AA7: sipush 3700 (0x0E74)
		// @3AAA: iastore
		// @3AAB: dup
		// @3AAC: iconst_2
		// @3AAD: sipush -11842 (0xD1BE)
		// @3AB0: iastore
		// @3AB1: dup
		// @3AB2: iconst_3
		// @3AB3: sipush -5550 (0xEA52)
		// @3AB6: iastore
		// @3AB7: dup
		// @3AB8: iconst_4
		// @3AB9: sipush -3700 (0xF18C)
		// @3ABC: iastore
		// @3ABD: dup
		// @3ABE: iconst_5
		// @3ABF: sipush -8141 (0xE033)
		// @3AC2: iastore
		// @3AC3: dup
		// @3AC4: bipush 6 (0x06)
		// @3AC6: sipush 7031 (0x1B77)
		// @3AC9: iastore
		// @3ACA: dup
		// @3ACB: bipush 7 (0x07)
		// @3ACD: sipush 1110 (0x0456)
		// @3AD0: iastore
		// @3AD1: dup
		// @3AD2: bipush 8 (0x08)
		// @3AD4: sipush 2220 (0x08AC)
		// @3AD7: iastore
		// @3AD8: dup
		// @3AD9: bipush 9 (0x09)
		// @3ADB: sipush 5180 (0x143C)
		// @3ADE: iastore
		// @3ADF: dup
		// @3AE0: bipush 10 (0x0A)
		// @3AE2: sipush 9621 (0x2595)
		// @3AE5: iastore
		// @3AE6: dup
		// @3AE7: bipush 11 (0x0B)
		// @3AE9: iconst_0
		// @3AEA: iastore
		// @3AEB: dup
		// @3AEC: bipush 12 (0x0C)
		// @3AEE: iconst_0
		// @3AEF: iastore
		// @3AF0: aastore
		// @3AF1: aload_0
		// @3AF2: bipush 6 (0x06)
		// @3AF4: bipush 13 (0x0D)
		// @3AF6: newarray int[]
		// @3AF8: dup
		// @3AF9: iconst_0
		// @3AFA: sipush -740 (0xFD1C)
		// @3AFD: iastore
		// @3AFE: dup
		// @3AFF: iconst_1
		// @3B00: sipush 3700 (0x0E74)
		// @3B03: iastore
		// @3B04: dup
		// @3B05: iconst_2
		// @3B06: sipush -7031 (0xE489)
		// @3B09: iastore
		// @3B0A: dup
		// @3B0B: iconst_3
		// @3B0C: sipush -9621 (0xDA6B)
		// @3B0F: iastore
		// @3B10: dup
		// @3B11: iconst_4
		// @3B12: iconst_0
		// @3B13: iastore
		// @3B14: dup
		// @3B15: iconst_5
		// @3B16: sipush -1110 (0xFBAA)
		// @3B19: iastore
		// @3B1A: dup
		// @3B1B: bipush 6 (0x06)
		// @3B1D: sipush 5550 (0x15AE)
		// @3B20: iastore
		// @3B21: dup
		// @3B22: bipush 7 (0x07)
		// @3B24: sipush 1850 (0x073A)
		// @3B27: iastore
		// @3B28: dup
		// @3B29: bipush 8 (0x08)
		// @3B2B: sipush -1110 (0xFBAA)
		// @3B2E: iastore
		// @3B2F: dup
		// @3B30: bipush 9 (0x09)
		// @3B32: iconst_0
		// @3B33: iastore
		// @3B34: dup
		// @3B35: bipush 10 (0x0A)
		// @3B37: sipush 5921 (0x1721)
		// @3B3A: iastore
		// @3B3B: dup
		// @3B3C: bipush 11 (0x0B)
		// @3B3E: iconst_0
		// @3B3F: iastore
		// @3B40: dup
		// @3B41: bipush 12 (0x0C)
		// @3B43: iconst_0
		// @3B44: iastore
		// @3B45: aastore
		// @3B46: aload_0
		// @3B47: iconst_5
		// @3B48: bipush 13 (0x0D)
		// @3B4A: newarray int[]
		// @3B4C: dup
		// @3B4D: iconst_0
		// @3B4E: sipush -740 (0xFD1C)
		// @3B51: iastore
		// @3B52: dup
		// @3B53: iconst_1
		// @3B54: sipush 1110 (0x0456)
		// @3B57: iastore
		// @3B58: dup
		// @3B59: iconst_2
		// @3B5A: sipush -6661 (0xE5FB)
		// @3B5D: iastore
		// @3B5E: dup
		// @3B5F: iconst_3
		// @3B60: sipush -10731 (0xD615)
		// @3B63: iastore
		// @3B64: dup
		// @3B65: iconst_4
		// @3B66: sipush -6291 (0xE76D)
		// @3B69: iastore
		// @3B6A: dup
		// @3B6B: iconst_5
		// @3B6C: sipush 3330 (0x0D02)
		// @3B6F: iastore
		// @3B70: dup
		// @3B71: bipush 6 (0x06)
		// @3B73: sipush 2590 (0x0A1E)
		// @3B76: iastore
		// @3B77: dup
		// @3B78: bipush 7 (0x07)
		// @3B7A: sipush -1110 (0xFBAA)
		// @3B7D: iastore
		// @3B7E: dup
		// @3B7F: bipush 8 (0x08)
		// @3B81: iconst_0
		// @3B82: iastore
		// @3B83: dup
		// @3B84: bipush 9 (0x09)
		// @3B86: iconst_0
		// @3B87: iastore
		// @3B88: dup
		// @3B89: bipush 10 (0x0A)
		// @3B8B: sipush 5550 (0x15AE)
		// @3B8E: iastore
		// @3B8F: dup
		// @3B90: bipush 11 (0x0B)
		// @3B92: sipush -260 (0xFEFC)
		// @3B95: iastore
		// @3B96: dup
		// @3B97: bipush 12 (0x0C)
		// @3B99: iconst_0
		// @3B9A: iastore
		// @3B9B: aastore
		// @3B9C: aload_0
		// @3B9D: iconst_1
		// @3B9E: bipush 13 (0x0D)
		// @3BA0: newarray int[]
		// @3BA2: dup
		// @3BA3: iconst_0
		// @3BA4: sipush -740 (0xFD1C)
		// @3BA7: iastore
		// @3BA8: dup
		// @3BA9: iconst_1
		// @3BAA: sipush -4440 (0xEEA8)
		// @3BAD: iastore
		// @3BAE: dup
		// @3BAF: iconst_2
		// @3BB0: sipush 5180 (0x143C)
		// @3BB3: iastore
		// @3BB4: dup
		// @3BB5: iconst_3
		// @3BB6: sipush 2220 (0x08AC)
		// @3BB9: iastore
		// @3BBA: dup
		// @3BBB: iconst_4
		// @3BBC: iconst_0
		// @3BBD: iastore
		// @3BBE: dup
		// @3BBF: iconst_5
		// @3BC0: iconst_0
		// @3BC1: iastore
		// @3BC2: dup
		// @3BC3: bipush 6 (0x06)
		// @3BC5: sipush -2960 (0xF470)
		// @3BC8: iastore
		// @3BC9: dup
		// @3BCA: bipush 7 (0x07)
		// @3BCC: sipush -9991 (0xD8F9)
		// @3BCF: iastore
		// @3BD0: dup
		// @3BD1: bipush 8 (0x08)
		// @3BD3: sipush -3700 (0xF18C)
		// @3BD6: iastore
		// @3BD7: dup
		// @3BD8: bipush 9 (0x09)
		// @3BDA: iconst_0
		// @3BDB: iastore
		// @3BDC: dup
		// @3BDD: bipush 10 (0x0A)
		// @3BDF: sipush 5550 (0x15AE)
		// @3BE2: iastore
		// @3BE3: dup
		// @3BE4: bipush 11 (0x0B)
		// @3BE6: iconst_0
		// @3BE7: iastore
		// @3BE8: dup
		// @3BE9: bipush 12 (0x0C)
		// @3BEB: sipush 572 (0x023C)
		// @3BEE: iastore
		// @3BEF: aastore
		// @3BF0: aload_0
		// @3BF1: bipush 17 (0x11)
		// @3BF3: bipush 13 (0x0D)
		// @3BF5: newarray int[]
		// @3BF7: dup
		// @3BF8: iconst_0
		// @3BF9: sipush -2220 (0xF754)
		// @3BFC: iastore
		// @3BFD: dup
		// @3BFE: iconst_1
		// @3BFF: sipush -4440 (0xEEA8)
		// @3C02: iastore
		// @3C03: dup
		// @3C04: iconst_2
		// @3C05: sipush 2960 (0x0B90)
		// @3C08: iastore
		// @3C09: dup
		// @3C0A: iconst_3
		// @3C0B: sipush -1110 (0xFBAA)
		// @3C0E: iastore
		// @3C0F: dup
		// @3C10: iconst_4
		// @3C11: sipush 5550 (0x15AE)
		// @3C14: iastore
		// @3C15: dup
		// @3C16: iconst_5
		// @3C17: sipush -7031 (0xE489)
		// @3C1A: iastore
		// @3C1B: dup
		// @3C1C: bipush 6 (0x06)
		// @3C1E: sipush -10731 (0xD615)
		// @3C21: iastore
		// @3C22: dup
		// @3C23: bipush 7 (0x07)
		// @3C25: sipush -4440 (0xEEA8)
		// @3C28: iastore
		// @3C29: dup
		// @3C2A: bipush 8 (0x08)
		// @3C2C: sipush -8511 (0xDEC1)
		// @3C2F: iastore
		// @3C30: dup
		// @3C31: bipush 9 (0x09)
		// @3C33: sipush -7401 (0xE317)
		// @3C36: iastore
		// @3C37: dup
		// @3C38: bipush 10 (0x0A)
		// @3C3A: sipush 9251 (0x2423)
		// @3C3D: iastore
		// @3C3E: dup
		// @3C3F: bipush 11 (0x0B)
		// @3C41: sipush -156 (0xFF64)
		// @3C44: iastore
		// @3C45: dup
		// @3C46: bipush 12 (0x0C)
		// @3C48: sipush 312 (0x0138)
		// @3C4B: iastore
		// @3C4C: aastore
		// @3C4D: aload_0
		// @3C4E: bipush 24 (0x18)
		// @3C50: bipush 13 (0x0D)
		// @3C52: newarray int[]
		// @3C54: dup
		// @3C55: iconst_0
		// @3C56: sipush -740 (0xFD1C)
		// @3C59: iastore
		// @3C5A: dup
		// @3C5B: iconst_1
		// @3C5C: iconst_0
		// @3C5D: iastore
		// @3C5E: dup
		// @3C5F: iconst_2
		// @3C60: sipush 2960 (0x0B90)
		// @3C63: iastore
		// @3C64: dup
		// @3C65: iconst_3
		// @3C66: sipush -3330 (0xF2FE)
		// @3C69: iastore
		// @3C6A: dup
		// @3C6B: iconst_4
		// @3C6C: sipush -740 (0xFD1C)
		// @3C6F: iastore
		// @3C70: dup
		// @3C71: iconst_5
		// @3C72: sipush -8881 (0xDD4F)
		// @3C75: iastore
		// @3C76: dup
		// @3C77: bipush 6 (0x06)
		// @3C79: sipush -11842 (0xD1BE)
		// @3C7C: iastore
		// @3C7D: dup
		// @3C7E: bipush 7 (0x07)
		// @3C80: sipush -5550 (0xEA52)
		// @3C83: iastore
		// @3C84: dup
		// @3C85: bipush 8 (0x08)
		// @3C87: sipush -12212 (0xD04C)
		// @3C8A: iastore
		// @3C8B: dup
		// @3C8C: bipush 9 (0x09)
		// @3C8E: sipush -7031 (0xE489)
		// @3C91: iastore
		// @3C92: dup
		// @3C93: bipush 10 (0x0A)
		// @3C95: sipush 4440 (0x1158)
		// @3C98: iastore
		// @3C99: dup
		// @3C9A: bipush 11 (0x0B)
		// @3C9C: sipush -416 (0xFE60)
		// @3C9F: iastore
		// @3CA0: dup
		// @3CA1: bipush 12 (0x0C)
		// @3CA3: iconst_0
		// @3CA4: iastore
		// @3CA5: aastore
		// @3CA6: aload_0
		// @3CA7: bipush 16 (0x10)
		// @3CA9: bipush 13 (0x0D)
		// @3CAB: newarray int[]
		// @3CAD: dup
		// @3CAE: iconst_0
		// @3CAF: iconst_0
		// @3CB0: iastore
		// @3CB1: dup
		// @3CB2: iconst_1
		// @3CB3: iconst_0
		// @3CB4: iastore
		// @3CB5: dup
		// @3CB6: iconst_2
		// @3CB7: sipush -4810 (0xED36)
		// @3CBA: iastore
		// @3CBB: dup
		// @3CBC: iconst_3
		// @3CBD: sipush 5180 (0x143C)
		// @3CC0: iastore
		// @3CC1: dup
		// @3CC2: iconst_4
		// @3CC3: sipush 9621 (0x2595)
		// @3CC6: iastore
		// @3CC7: dup
		// @3CC8: iconst_5
		// @3CC9: sipush 10361 (0x2879)
		// @3CCC: iastore
		// @3CCD: dup
		// @3CCE: bipush 6 (0x06)
		// @3CD0: sipush 2220 (0x08AC)
		// @3CD3: iastore
		// @3CD4: dup
		// @3CD5: bipush 7 (0x07)
		// @3CD7: sipush -12952 (0xCD68)
		// @3CDA: iastore
		// @3CDB: dup
		// @3CDC: bipush 8 (0x08)
		// @3CDE: sipush -3700 (0xF18C)
		// @3CE1: iastore
		// @3CE2: dup
		// @3CE3: bipush 9 (0x09)
		// @3CE5: sipush 4070 (0x0FE6)
		// @3CE8: iastore
		// @3CE9: dup
		// @3CEA: bipush 10 (0x0A)
		// @3CEC: sipush 5550 (0x15AE)
		// @3CEF: iastore
		// @3CF0: dup
		// @3CF1: bipush 11 (0x0B)
		// @3CF3: sipush -937 (0xFC57)
		// @3CF6: iastore
		// @3CF7: dup
		// @3CF8: bipush 12 (0x0C)
		// @3CFA: iconst_0
		// @3CFB: iastore
		// @3CFC: aastore
		// @3CFD: aload_0
		// @3CFE: bipush 8 (0x08)
		// @3D00: bipush 13 (0x0D)
		// @3D02: newarray int[]
		// @3D04: dup
		// @3D05: iconst_0
		// @3D06: sipush -740 (0xFD1C)
		// @3D09: iastore
		// @3D0A: dup
		// @3D0B: iconst_1
		// @3D0C: iconst_0
		// @3D0D: iastore
		// @3D0E: dup
		// @3D0F: iconst_2
		// @3D10: sipush 2960 (0x0B90)
		// @3D13: iastore
		// @3D14: dup
		// @3D15: iconst_3
		// @3D16: sipush -3330 (0xF2FE)
		// @3D19: iastore
		// @3D1A: dup
		// @3D1B: iconst_4
		// @3D1C: sipush -740 (0xFD1C)
		// @3D1F: iastore
		// @3D20: dup
		// @3D21: iconst_5
		// @3D22: iconst_0
		// @3D23: iastore
		// @3D24: dup
		// @3D25: bipush 6 (0x06)
		// @3D27: sipush -6661 (0xE5FB)
		// @3D2A: iastore
		// @3D2B: dup
		// @3D2C: bipush 7 (0x07)
		// @3D2E: sipush -2220 (0xF754)
		// @3D31: iastore
		// @3D32: dup
		// @3D33: bipush 8 (0x08)
		// @3D35: sipush 4070 (0x0FE6)
		// @3D38: iastore
		// @3D39: dup
		// @3D3A: bipush 9 (0x09)
		// @3D3C: sipush 8881 (0x22B1)
		// @3D3F: iastore
		// @3D40: dup
		// @3D41: bipush 10 (0x0A)
		// @3D43: sipush 5921 (0x1721)
		// @3D46: iastore
		// @3D47: dup
		// @3D48: bipush 11 (0x0B)
		// @3D4A: sipush -572 (0xFDC4)
		// @3D4D: iastore
		// @3D4E: dup
		// @3D4F: bipush 12 (0x0C)
		// @3D51: sipush 416 (0x01A0)
		// @3D54: iastore
		// @3D55: aastore
		// @3D56: aload_0
		// @3D57: bipush 23 (0x17)
		// @3D59: bipush 13 (0x0D)
		// @3D5B: newarray int[]
		// @3D5D: dup
		// @3D5E: iconst_0
		// @3D5F: sipush -740 (0xFD1C)
		// @3D62: iastore
		// @3D63: dup
		// @3D64: iconst_1
		// @3D65: sipush 1480 (0x05C8)
		// @3D68: iastore
		// @3D69: dup
		// @3D6A: iconst_2
		// @3D6B: sipush -7401 (0xE317)
		// @3D6E: iastore
		// @3D6F: dup
		// @3D70: iconst_3
		// @3D71: sipush -3700 (0xF18C)
		// @3D74: iastore
		// @3D75: dup
		// @3D76: iconst_4
		// @3D77: sipush 1110 (0x0456)
		// @3D7A: iastore
		// @3D7B: dup
		// @3D7C: iconst_5
		// @3D7D: sipush -7401 (0xE317)
		// @3D80: iastore
		// @3D81: dup
		// @3D82: bipush 6 (0x06)
		// @3D84: sipush -1850 (0xF8C6)
		// @3D87: iastore
		// @3D88: dup
		// @3D89: bipush 7 (0x07)
		// @3D8B: sipush 2590 (0x0A1E)
		// @3D8E: iastore
		// @3D8F: dup
		// @3D90: bipush 8 (0x08)
		// @3D92: sipush 12212 (0x2FB4)
		// @3D95: iastore
		// @3D96: dup
		// @3D97: bipush 9 (0x09)
		// @3D99: sipush 9251 (0x2423)
		// @3D9C: iastore
		// @3D9D: dup
		// @3D9E: bipush 10 (0x0A)
		// @3DA0: sipush 5550 (0x15AE)
		// @3DA3: iastore
		// @3DA4: dup
		// @3DA5: bipush 11 (0x0B)
		// @3DA7: bipush -104 (0x98)
		// @3DA9: iastore
		// @3DAA: dup
		// @3DAB: bipush 12 (0x0C)
		// @3DAD: iconst_0
		// @3DAE: iastore
		// @3DAF: aastore
		// @3DB0: aload_0
		// @3DB1: bipush 18 (0x12)
		// @3DB3: bipush 13 (0x0D)
		// @3DB5: newarray int[]
		// @3DB7: dup
		// @3DB8: iconst_0
		// @3DB9: sipush -740 (0xFD1C)
		// @3DBC: iastore
		// @3DBD: dup
		// @3DBE: iconst_1
		// @3DBF: sipush 1480 (0x05C8)
		// @3DC2: iastore
		// @3DC3: dup
		// @3DC4: iconst_2
		// @3DC5: sipush 740 (0x02E4)
		// @3DC8: iastore
		// @3DC9: dup
		// @3DCA: iconst_3
		// @3DCB: sipush 4440 (0x1158)
		// @3DCE: iastore
		// @3DCF: dup
		// @3DD0: iconst_4
		// @3DD1: sipush 8881 (0x22B1)
		// @3DD4: iastore
		// @3DD5: dup
		// @3DD6: iconst_5
		// @3DD7: sipush 2590 (0x0A1E)
		// @3DDA: iastore
		// @3DDB: dup
		// @3DDC: bipush 6 (0x06)
		// @3DDE: sipush -13692 (0xCA84)
		// @3DE1: iastore
		// @3DE2: dup
		// @3DE3: bipush 7 (0x07)
		// @3DE5: sipush -4070 (0xF01A)
		// @3DE8: iastore
		// @3DE9: dup
		// @3DEA: bipush 8 (0x08)
		// @3DEC: iconst_0
		// @3DED: iastore
		// @3DEE: dup
		// @3DEF: bipush 9 (0x09)
		// @3DF1: sipush -7771 (0xE1A5)
		// @3DF4: iastore
		// @3DF5: dup
		// @3DF6: bipush 10 (0x0A)
		// @3DF8: sipush 9991 (0x2707)
		// @3DFB: iastore
		// @3DFC: dup
		// @3DFD: bipush 11 (0x0B)
		// @3DFF: sipush -156 (0xFF64)
		// @3E02: iastore
		// @3E03: dup
		// @3E04: bipush 12 (0x0C)
		// @3E06: sipush 572 (0x023C)
		// @3E09: iastore
		// @3E0A: aastore
		// @3E0B: aload_0
		// @3E0C: bipush 15 (0x0F)
		// @3E0E: bipush 13 (0x0D)
		// @3E10: newarray int[]
		// @3E12: dup
		// @3E13: iconst_0
		// @3E14: iconst_0
		// @3E15: iastore
		// @3E16: dup
		// @3E17: iconst_1
		// @3E18: iconst_0
		// @3E19: iastore
		// @3E1A: dup
		// @3E1B: iconst_2
		// @3E1C: sipush -4440 (0xEEA8)
		// @3E1F: iastore
		// @3E20: dup
		// @3E21: iconst_3
		// @3E22: sipush 2220 (0x08AC)
		// @3E25: iastore
		// @3E26: dup
		// @3E27: iconst_4
		// @3E28: sipush -2220 (0xF754)
		// @3E2B: iastore
		// @3E2C: dup
		// @3E2D: iconst_5
		// @3E2E: sipush 740 (0x02E4)
		// @3E31: iastore
		// @3E32: dup
		// @3E33: bipush 6 (0x06)
		// @3E35: sipush -9621 (0xDA6B)
		// @3E38: iastore
		// @3E39: dup
		// @3E3A: bipush 7 (0x07)
		// @3E3C: sipush -8881 (0xDD4F)
		// @3E3F: iastore
		// @3E40: dup
		// @3E41: bipush 8 (0x08)
		// @3E43: sipush -8141 (0xE033)
		// @3E46: iastore
		// @3E47: dup
		// @3E48: bipush 9 (0x09)
		// @3E4A: sipush -3330 (0xF2FE)
		// @3E4D: iastore
		// @3E4E: dup
		// @3E4F: bipush 10 (0x0A)
		// @3E51: sipush 10361 (0x2879)
		// @3E54: iastore
		// @3E55: dup
		// @3E56: bipush 11 (0x0B)
		// @3E58: sipush -1979 (0xF845)
		// @3E5B: iastore
		// @3E5C: dup
		// @3E5D: bipush 12 (0x0C)
		// @3E5F: iconst_0
		// @3E60: iastore
		// @3E61: aastore
		// @3E62: aload_0
		// @3E63: bipush 9 (0x09)
		// @3E65: bipush 13 (0x0D)
		// @3E67: newarray int[]
		// @3E69: dup
		// @3E6A: iconst_0
		// @3E6B: sipush -740 (0xFD1C)
		// @3E6E: iastore
		// @3E6F: dup
		// @3E70: iconst_1
		// @3E71: sipush 1480 (0x05C8)
		// @3E74: iastore
		// @3E75: dup
		// @3E76: iconst_2
		// @3E77: sipush 9251 (0x2423)
		// @3E7A: iastore
		// @3E7B: dup
		// @3E7C: iconst_3
		// @3E7D: sipush 2220 (0x08AC)
		// @3E80: iastore
		// @3E81: dup
		// @3E82: iconst_4
		// @3E83: iconst_0
		// @3E84: iastore
		// @3E85: dup
		// @3E86: iconst_5
		// @3E87: iconst_0
		// @3E88: iastore
		// @3E89: dup
		// @3E8A: bipush 6 (0x06)
		// @3E8C: sipush -3330 (0xF2FE)
		// @3E8F: iastore
		// @3E90: dup
		// @3E91: bipush 7 (0x07)
		// @3E93: sipush -4810 (0xED36)
		// @3E96: iastore
		// @3E97: dup
		// @3E98: bipush 8 (0x08)
		// @3E9A: sipush -3330 (0xF2FE)
		// @3E9D: iastore
		// @3E9E: dup
		// @3E9F: bipush 9 (0x09)
		// @3EA1: iconst_0
		// @3EA2: iastore
		// @3EA3: dup
		// @3EA4: bipush 10 (0x0A)
		// @3EA6: sipush 740 (0x02E4)
		// @3EA9: iastore
		// @3EAA: dup
		// @3EAB: bipush 11 (0x0B)
		// @3EAD: iconst_0
		// @3EAE: iastore
		// @3EAF: dup
		// @3EB0: bipush 12 (0x0C)
		// @3EB2: sipush 1197 (0x04AD)
		// @3EB5: iastore
		// @3EB6: aastore
		// @3EB7: aload_0
		// @3EB8: bipush 11 (0x0B)
		// @3EBA: bipush 13 (0x0D)
		// @3EBC: newarray int[]
		// @3EBE: dup
		// @3EBF: iconst_0
		// @3EC0: sipush -740 (0xFD1C)
		// @3EC3: iastore
		// @3EC4: dup
		// @3EC5: iconst_1
		// @3EC6: sipush 1480 (0x05C8)
		// @3EC9: iastore
		// @3ECA: dup
		// @3ECB: iconst_2
		// @3ECC: sipush 5550 (0x15AE)
		// @3ECF: iastore
		// @3ED0: dup
		// @3ED1: iconst_3
		// @3ED2: sipush 4810 (0x12CA)
		// @3ED5: iastore
		// @3ED6: dup
		// @3ED7: iconst_4
		// @3ED8: sipush 9621 (0x2595)
		// @3EDB: iastore
		// @3EDC: dup
		// @3EDD: iconst_5
		// @3EDE: iconst_0
		// @3EDF: iastore
		// @3EE0: dup
		// @3EE1: bipush 6 (0x06)
		// @3EE3: sipush -7031 (0xE489)
		// @3EE6: iastore
		// @3EE7: dup
		// @3EE8: bipush 7 (0x07)
		// @3EEA: sipush -3700 (0xF18C)
		// @3EED: iastore
		// @3EEE: dup
		// @3EEF: bipush 8 (0x08)
		// @3EF1: sipush 3330 (0x0D02)
		// @3EF4: iastore
		// @3EF5: dup
		// @3EF6: bipush 9 (0x09)
		// @3EF8: iconst_0
		// @3EF9: iastore
		// @3EFA: dup
		// @3EFB: bipush 10 (0x0A)
		// @3EFD: sipush 8511 (0x213F)
		// @3F00: iastore
		// @3F01: dup
		// @3F02: bipush 11 (0x0B)
		// @3F04: sipush 260 (0x0104)
		// @3F07: iastore
		// @3F08: dup
		// @3F09: bipush 12 (0x0C)
		// @3F0B: sipush 1614 (0x064E)
		// @3F0E: iastore
		// @3F0F: aastore
		// @3F10: aload_0
		// @3F11: iconst_4
		// @3F12: bipush 13 (0x0D)
		// @3F14: newarray int[]
		// @3F16: dup
		// @3F17: iconst_0
		// @3F18: sipush -1850 (0xF8C6)
		// @3F1B: iastore
		// @3F1C: dup
		// @3F1D: iconst_1
		// @3F1E: sipush 1110 (0x0456)
		// @3F21: iastore
		// @3F22: dup
		// @3F23: iconst_2
		// @3F24: sipush -7031 (0xE489)
		// @3F27: iastore
		// @3F28: dup
		// @3F29: iconst_3
		// @3F2A: sipush -4070 (0xF01A)
		// @3F2D: iastore
		// @3F2E: dup
		// @3F2F: iconst_4
		// @3F30: sipush -2590 (0xF5E2)
		// @3F33: iastore
		// @3F34: dup
		// @3F35: iconst_5
		// @3F36: sipush 7771 (0x1E5B)
		// @3F39: iastore
		// @3F3A: dup
		// @3F3B: bipush 6 (0x06)
		// @3F3D: sipush -1480 (0xFA38)
		// @3F40: iastore
		// @3F41: dup
		// @3F42: bipush 7 (0x07)
		// @3F44: sipush -4070 (0xF01A)
		// @3F47: iastore
		// @3F48: dup
		// @3F49: bipush 8 (0x08)
		// @3F4B: sipush 1480 (0x05C8)
		// @3F4E: iastore
		// @3F4F: dup
		// @3F50: bipush 9 (0x09)
		// @3F52: iconst_0
		// @3F53: iastore
		// @3F54: dup
		// @3F55: bipush 10 (0x0A)
		// @3F57: sipush 5550 (0x15AE)
		// @3F5A: iastore
		// @3F5B: dup
		// @3F5C: bipush 11 (0x0B)
		// @3F5E: sipush -312 (0xFEC8)
		// @3F61: iastore
		// @3F62: dup
		// @3F63: bipush 12 (0x0C)
		// @3F65: sipush 416 (0x01A0)
		// @3F68: iastore
		// @3F69: aastore
		// @3F6A: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @3F6D: bipush 8 (0x08)
		// @3F6F: aaload
		// @3F70: astore_0
		// @3F71: aload_0
		// @3F72: bipush 19 (0x13)
		// @3F74: iconst_4
		// @3F75: newarray int[]
		// @3F77: dup
		// @3F78: iconst_0
		// @3F79: sipush -8511 (0xDEC1)
		// @3F7C: iastore
		// @3F7D: dup
		// @3F7E: iconst_1
		// @3F7F: sipush -1850 (0xF8C6)
		// @3F82: iastore
		// @3F83: dup
		// @3F84: iconst_2
		// @3F85: iconst_0
		// @3F86: iastore
		// @3F87: dup
		// @3F88: iconst_3
		// @3F89: iconst_0
		// @3F8A: iastore
		// @3F8B: aastore
		// @3F8C: aload_0
		// @3F8D: iconst_1
		// @3F8E: iconst_4
		// @3F8F: newarray int[]
		// @3F91: dup
		// @3F92: iconst_0
		// @3F93: iconst_0
		// @3F94: iastore
		// @3F95: dup
		// @3F96: iconst_1
		// @3F97: iconst_0
		// @3F98: iastore
		// @3F99: dup
		// @3F9A: iconst_2
		// @3F9B: bipush 104 (0x68)
		// @3F9D: iastore
		// @3F9E: dup
		// @3F9F: iconst_3
		// @3FA0: iconst_0
		// @3FA1: iastore
		// @3FA2: aastore
		// @3FA3: aload_0
		// @3FA4: bipush 15 (0x0F)
		// @3FA6: iconst_4
		// @3FA7: newarray int[]
		// @3FA9: dup
		// @3FAA: iconst_0
		// @3FAB: sipush 1480 (0x05C8)
		// @3FAE: iastore
		// @3FAF: dup
		// @3FB0: iconst_1
		// @3FB1: sipush -740 (0xFD1C)
		// @3FB4: iastore
		// @3FB5: dup
		// @3FB6: iconst_2
		// @3FB7: sipush -468 (0xFE2C)
		// @3FBA: iastore
		// @3FBB: dup
		// @3FBC: iconst_3
		// @3FBD: iconst_0
		// @3FBE: iastore
		// @3FBF: aastore
		// @3FC0: aload_0
		// @3FC1: bipush 14 (0x0E)
		// @3FC3: iconst_4
		// @3FC4: newarray int[]
		// @3FC6: dup
		// @3FC7: iconst_0
		// @3FC8: sipush 1480 (0x05C8)
		// @3FCB: iastore
		// @3FCC: dup
		// @3FCD: iconst_1
		// @3FCE: sipush 2220 (0x08AC)
		// @3FD1: iastore
		// @3FD2: dup
		// @3FD3: iconst_2
		// @3FD4: bipush -104 (0x98)
		// @3FD6: iastore
		// @3FD7: dup
		// @3FD8: iconst_3
		// @3FD9: iconst_0
		// @3FDA: iastore
		// @3FDB: aastore
		// @3FDC: aload_0
		// @3FDD: bipush 9 (0x09)
		// @3FDF: iconst_4
		// @3FE0: newarray int[]
		// @3FE2: dup
		// @3FE3: iconst_0
		// @3FE4: iconst_0
		// @3FE5: iastore
		// @3FE6: dup
		// @3FE7: iconst_1
		// @3FE8: sipush 3330 (0x0D02)
		// @3FEB: iastore
		// @3FEC: dup
		// @3FED: iconst_2
		// @3FEE: sipush 208 (0x00D0)
		// @3FF1: iastore
		// @3FF2: dup
		// @3FF3: iconst_3
		// @3FF4: iconst_0
		// @3FF5: iastore
		// @3FF6: aastore
		// @3FF7: aload_0
		// @3FF8: iconst_5
		// @3FF9: iconst_4
		// @3FFA: newarray int[]
		// @3FFC: dup
		// @3FFD: iconst_0
		// @3FFE: iconst_0
		// @3FFF: iastore
		// @4000: dup
		// @4001: iconst_1
		// @4002: iconst_0
		// @4003: iastore
		// @4004: dup
		// @4005: iconst_2
		// @4006: iconst_0
		// @4007: iastore
		// @4008: dup
		// @4009: iconst_3
		// @400A: iconst_0
		// @400B: iastore
		// @400C: aastore
		// @400D: aload_0
		// @400E: bipush 20 (0x14)
		// @4010: iconst_4
		// @4011: newarray int[]
		// @4013: dup
		// @4014: iconst_0
		// @4015: iconst_0
		// @4016: iastore
		// @4017: dup
		// @4018: iconst_1
		// @4019: iconst_0
		// @401A: iastore
		// @401B: dup
		// @401C: iconst_2
		// @401D: iconst_0
		// @401E: iastore
		// @401F: dup
		// @4020: iconst_3
		// @4021: iconst_0
		// @4022: iastore
		// @4023: aastore
		// @4024: aload_0
		// @4025: bipush 21 (0x15)
		// @4027: iconst_4
		// @4028: newarray int[]
		// @402A: dup
		// @402B: iconst_0
		// @402C: iconst_0
		// @402D: iastore
		// @402E: dup
		// @402F: iconst_1
		// @4030: iconst_0
		// @4031: iastore
		// @4032: dup
		// @4033: iconst_2
		// @4034: iconst_0
		// @4035: iastore
		// @4036: dup
		// @4037: iconst_3
		// @4038: iconst_0
		// @4039: iastore
		// @403A: aastore
		// @403B: aload_0
		// @403C: bipush 22 (0x16)
		// @403E: iconst_4
		// @403F: newarray int[]
		// @4041: dup
		// @4042: iconst_0
		// @4043: iconst_0
		// @4044: iastore
		// @4045: dup
		// @4046: iconst_1
		// @4047: iconst_0
		// @4048: iastore
		// @4049: dup
		// @404A: iconst_2
		// @404B: iconst_0
		// @404C: iastore
		// @404D: dup
		// @404E: iconst_3
		// @404F: iconst_0
		// @4050: iastore
		// @4051: aastore
		// @4052: aload_0
		// @4053: iconst_4
		// @4054: iconst_4
		// @4055: newarray int[]
		// @4057: dup
		// @4058: iconst_0
		// @4059: iconst_0
		// @405A: iastore
		// @405B: dup
		// @405C: iconst_1
		// @405D: iconst_0
		// @405E: iastore
		// @405F: dup
		// @4060: iconst_2
		// @4061: iconst_0
		// @4062: iastore
		// @4063: dup
		// @4064: iconst_3
		// @4065: iconst_0
		// @4066: iastore
		// @4067: aastore
		// @4068: aload_0
		// @4069: iconst_2
		// @406A: iconst_4
		// @406B: newarray int[]
		// @406D: dup
		// @406E: iconst_0
		// @406F: iconst_0
		// @4070: iastore
		// @4071: dup
		// @4072: iconst_1
		// @4073: sipush 740 (0x02E4)
		// @4076: iastore
		// @4077: dup
		// @4078: iconst_2
		// @4079: bipush 104 (0x68)
		// @407B: iastore
		// @407C: dup
		// @407D: iconst_3
		// @407E: iconst_0
		// @407F: iastore
		// @4080: aastore
		// @4081: aload_0
		// @4082: bipush 18 (0x12)
		// @4084: iconst_4
		// @4085: newarray int[]
		// @4087: dup
		// @4088: iconst_0
		// @4089: sipush -8511 (0xDEC1)
		// @408C: iastore
		// @408D: dup
		// @408E: iconst_1
		// @408F: sipush -2590 (0xF5E2)
		// @4092: iastore
		// @4093: dup
		// @4094: iconst_2
		// @4095: iconst_0
		// @4096: iastore
		// @4097: dup
		// @4098: iconst_3
		// @4099: iconst_0
		// @409A: iastore
		// @409B: aastore
		// @409C: aload_0
		// @409D: bipush 6 (0x06)
		// @409F: iconst_4
		// @40A0: newarray int[]
		// @40A2: dup
		// @40A3: iconst_0
		// @40A4: iconst_0
		// @40A5: iastore
		// @40A6: dup
		// @40A7: iconst_1
		// @40A8: iconst_0
		// @40A9: iastore
		// @40AA: dup
		// @40AB: iconst_2
		// @40AC: iconst_0
		// @40AD: iastore
		// @40AE: dup
		// @40AF: iconst_3
		// @40B0: iconst_0
		// @40B1: iastore
		// @40B2: aastore
		// @40B3: aload_0
		// @40B4: iconst_3
		// @40B5: iconst_4
		// @40B6: newarray int[]
		// @40B8: dup
		// @40B9: iconst_0
		// @40BA: iconst_0
		// @40BB: iastore
		// @40BC: dup
		// @40BD: iconst_1
		// @40BE: sipush -740 (0xFD1C)
		// @40C1: iastore
		// @40C2: dup
		// @40C3: iconst_2
		// @40C4: bipush 104 (0x68)
		// @40C6: iastore
		// @40C7: dup
		// @40C8: iconst_3
		// @40C9: iconst_0
		// @40CA: iastore
		// @40CB: aastore
		// @40CC: aload_0
		// @40CD: bipush 25 (0x19)
		// @40CF: bipush 8 (0x08)
		// @40D1: newarray int[]
		// @40D3: dup
		// @40D4: iconst_0
		// @40D5: bipush 32 (0x20)
		// @40D7: iastore
		// @40D8: dup
		// @40D9: iconst_1
		// @40DA: iconst_3
		// @40DB: iastore
		// @40DC: dup
		// @40DD: iconst_2
		// @40DE: bipush 85 (0x55)
		// @40E0: iastore
		// @40E1: dup
		// @40E2: iconst_3
		// @40E3: iconst_3
		// @40E4: iastore
		// @40E5: dup
		// @40E6: iconst_4
		// @40E7: iconst_1
		// @40E8: iastore
		// @40E9: dup
		// @40EA: iconst_5
		// @40EB: bipush 32 (0x20)
		// @40ED: iastore
		// @40EE: dup
		// @40EF: bipush 6 (0x06)
		// @40F1: iconst_3
		// @40F2: iastore
		// @40F3: dup
		// @40F4: bipush 7 (0x07)
		// @40F6: iconst_3
		// @40F7: iastore
		// @40F8: aastore
		// @40F9: aload_0
		// @40FA: bipush 10 (0x0A)
		// @40FC: iconst_4
		// @40FD: newarray int[]
		// @40FF: dup
		// @4100: iconst_0
		// @4101: iconst_0
		// @4102: iastore
		// @4103: dup
		// @4104: iconst_1
		// @4105: iconst_0
		// @4106: iastore
		// @4107: dup
		// @4108: iconst_2
		// @4109: iconst_0
		// @410A: iastore
		// @410B: dup
		// @410C: iconst_3
		// @410D: iconst_0
		// @410E: iastore
		// @410F: aastore
		// @4110: aload_0
		// @4111: bipush 13 (0x0D)
		// @4113: iconst_4
		// @4114: newarray int[]
		// @4116: dup
		// @4117: iconst_0
		// @4118: iconst_0
		// @4119: iastore
		// @411A: dup
		// @411B: iconst_1
		// @411C: iconst_0
		// @411D: iastore
		// @411E: dup
		// @411F: iconst_2
		// @4120: iconst_0
		// @4121: iastore
		// @4122: dup
		// @4123: iconst_3
		// @4124: iconst_0
		// @4125: iastore
		// @4126: aastore
		// @4127: aload_0
		// @4128: bipush 16 (0x10)
		// @412A: iconst_4
		// @412B: newarray int[]
		// @412D: dup
		// @412E: iconst_0
		// @412F: sipush -1850 (0xF8C6)
		// @4132: iastore
		// @4133: dup
		// @4134: iconst_1
		// @4135: sipush 1110 (0x0456)
		// @4138: iastore
		// @4139: dup
		// @413A: iconst_2
		// @413B: bipush -104 (0x98)
		// @413D: iastore
		// @413E: dup
		// @413F: iconst_3
		// @4140: iconst_0
		// @4141: iastore
		// @4142: aastore
		// @4143: aload_0
		// @4144: bipush 12 (0x0C)
		// @4146: iconst_4
		// @4147: newarray int[]
		// @4149: dup
		// @414A: iconst_0
		// @414B: iconst_0
		// @414C: iastore
		// @414D: dup
		// @414E: iconst_1
		// @414F: iconst_0
		// @4150: iastore
		// @4151: dup
		// @4152: iconst_2
		// @4153: iconst_0
		// @4154: iastore
		// @4155: dup
		// @4156: iconst_3
		// @4157: iconst_0
		// @4158: iastore
		// @4159: aastore
		// @415A: aload_0
		// @415B: bipush 23 (0x17)
		// @415D: iconst_4
		// @415E: newarray int[]
		// @4160: dup
		// @4161: iconst_0
		// @4162: iconst_0
		// @4163: iastore
		// @4164: dup
		// @4165: iconst_1
		// @4166: iconst_0
		// @4167: iastore
		// @4168: dup
		// @4169: iconst_2
		// @416A: iconst_0
		// @416B: iastore
		// @416C: dup
		// @416D: iconst_3
		// @416E: iconst_0
		// @416F: iastore
		// @4170: aastore
		// @4171: aload_0
		// @4172: bipush 11 (0x0B)
		// @4174: iconst_4
		// @4175: newarray int[]
		// @4177: dup
		// @4178: iconst_0
		// @4179: iconst_0
		// @417A: iastore
		// @417B: dup
		// @417C: iconst_1
		// @417D: iconst_0
		// @417E: iastore
		// @417F: dup
		// @4180: iconst_2
		// @4181: iconst_0
		// @4182: iastore
		// @4183: dup
		// @4184: iconst_3
		// @4185: iconst_0
		// @4186: iastore
		// @4187: aastore
		// @4188: aload_0
		// @4189: bipush 7 (0x07)
		// @418B: iconst_4
		// @418C: newarray int[]
		// @418E: dup
		// @418F: iconst_0
		// @4190: sipush 1110 (0x0456)
		// @4193: iastore
		// @4194: dup
		// @4195: iconst_1
		// @4196: sipush 740 (0x02E4)
		// @4199: iastore
		// @419A: dup
		// @419B: iconst_2
		// @419C: iconst_0
		// @419D: iastore
		// @419E: dup
		// @419F: iconst_3
		// @41A0: iconst_0
		// @41A1: iastore
		// @41A2: aastore
		// @41A3: aload_0
		// @41A4: iconst_0
		// @41A5: iconst_4
		// @41A6: newarray int[]
		// @41A8: dup
		// @41A9: iconst_0
		// @41AA: iconst_0
		// @41AB: iastore
		// @41AC: dup
		// @41AD: iconst_1
		// @41AE: iconst_0
		// @41AF: iastore
		// @41B0: dup
		// @41B1: iconst_2
		// @41B2: bipush 104 (0x68)
		// @41B4: iastore
		// @41B5: dup
		// @41B6: iconst_3
		// @41B7: iconst_0
		// @41B8: iastore
		// @41B9: aastore
		// @41BA: aload_0
		// @41BB: bipush 17 (0x11)
		// @41BD: iconst_4
		// @41BE: newarray int[]
		// @41C0: dup
		// @41C1: iconst_0
		// @41C2: sipush -8141 (0xE033)
		// @41C5: iastore
		// @41C6: dup
		// @41C7: iconst_1
		// @41C8: sipush -3330 (0xF2FE)
		// @41CB: iastore
		// @41CC: dup
		// @41CD: iconst_2
		// @41CE: iconst_0
		// @41CF: iastore
		// @41D0: dup
		// @41D1: iconst_3
		// @41D2: iconst_0
		// @41D3: iastore
		// @41D4: aastore
		// @41D5: aload_0
		// @41D6: bipush 8 (0x08)
		// @41D8: iconst_4
		// @41D9: newarray int[]
		// @41DB: dup
		// @41DC: iconst_0
		// @41DD: iconst_0
		// @41DE: iastore
		// @41DF: dup
		// @41E0: iconst_1
		// @41E1: iconst_0
		// @41E2: iastore
		// @41E3: dup
		// @41E4: iconst_2
		// @41E5: iconst_0
		// @41E6: iastore
		// @41E7: dup
		// @41E8: iconst_3
		// @41E9: iconst_0
		// @41EA: iastore
		// @41EB: aastore
		// @41EC: aload_0
		// @41ED: bipush 24 (0x18)
		// @41EF: iconst_4
		// @41F0: newarray int[]
		// @41F2: dup
		// @41F3: iconst_0
		// @41F4: iconst_0
		// @41F5: iastore
		// @41F6: dup
		// @41F7: iconst_1
		// @41F8: iconst_0
		// @41F9: iastore
		// @41FA: dup
		// @41FB: iconst_2
		// @41FC: iconst_0
		// @41FD: iastore
		// @41FE: dup
		// @41FF: iconst_3
		// @4200: iconst_0
		// @4201: iastore
		// @4202: aastore
		// @4203: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @4206: bipush 9 (0x09)
		// @4208: aaload
		// @4209: astore_0
		// @420A: aload_0
		// @420B: bipush 6 (0x06)
		// @420D: bipush 8 (0x08)
		// @420F: newarray int[]
		// @4211: dup
		// @4212: iconst_0
		// @4213: sipush 9251 (0x2423)
		// @4216: iastore
		// @4217: dup
		// @4218: iconst_1
		// @4219: sipush 4810 (0x12CA)
		// @421C: iastore
		// @421D: dup
		// @421E: iconst_2
		// @421F: sipush 1110 (0x0456)
		// @4222: iastore
		// @4223: dup
		// @4224: iconst_3
		// @4225: sipush 5550 (0x15AE)
		// @4228: iastore
		// @4229: dup
		// @422A: iconst_4
		// @422B: sipush 2590 (0x0A1E)
		// @422E: iastore
		// @422F: dup
		// @4230: iconst_5
		// @4231: sipush -3330 (0xF2FE)
		// @4234: iastore
		// @4235: dup
		// @4236: bipush 6 (0x06)
		// @4238: sipush 208 (0x00D0)
		// @423B: iastore
		// @423C: dup
		// @423D: bipush 7 (0x07)
		// @423F: iconst_0
		// @4240: iastore
		// @4241: aastore
		// @4242: aload_0
		// @4243: iconst_1
		// @4244: bipush 8 (0x08)
		// @4246: newarray int[]
		// @4248: dup
		// @4249: iconst_0
		// @424A: sipush 8511 (0x213F)
		// @424D: iastore
		// @424E: dup
		// @424F: iconst_1
		// @4250: sipush 4810 (0x12CA)
		// @4253: iastore
		// @4254: dup
		// @4255: iconst_2
		// @4256: sipush 1480 (0x05C8)
		// @4259: iastore
		// @425A: dup
		// @425B: iconst_3
		// @425C: sipush 4070 (0x0FE6)
		// @425F: iastore
		// @4260: dup
		// @4261: iconst_4
		// @4262: sipush 2960 (0x0B90)
		// @4265: iastore
		// @4266: dup
		// @4267: iconst_5
		// @4268: sipush 1850 (0x073A)
		// @426B: iastore
		// @426C: dup
		// @426D: bipush 6 (0x06)
		// @426F: iconst_0
		// @4270: iastore
		// @4271: dup
		// @4272: bipush 7 (0x07)
		// @4274: iconst_0
		// @4275: iastore
		// @4276: aastore
		// @4277: aload_0
		// @4278: iconst_3
		// @4279: bipush 8 (0x08)
		// @427B: newarray int[]
		// @427D: dup
		// @427E: iconst_0
		// @427F: sipush 5921 (0x1721)
		// @4282: iastore
		// @4283: dup
		// @4284: iconst_1
		// @4285: sipush 740 (0x02E4)
		// @4288: iastore
		// @4289: dup
		// @428A: iconst_2
		// @428B: sipush 4070 (0x0FE6)
		// @428E: iastore
		// @428F: dup
		// @4290: iconst_3
		// @4291: sipush 1110 (0x0456)
		// @4294: iastore
		// @4295: dup
		// @4296: iconst_4
		// @4297: iconst_0
		// @4298: iastore
		// @4299: dup
		// @429A: iconst_5
		// @429B: sipush 2220 (0x08AC)
		// @429E: iastore
		// @429F: dup
		// @42A0: bipush 6 (0x06)
		// @42A2: sipush 156 (0x009C)
		// @42A5: iastore
		// @42A6: dup
		// @42A7: bipush 7 (0x07)
		// @42A9: iconst_0
		// @42AA: iastore
		// @42AB: aastore
		// @42AC: aload_0
		// @42AD: bipush 14 (0x0E)
		// @42AF: bipush 8 (0x08)
		// @42B1: newarray int[]
		// @42B3: dup
		// @42B4: iconst_0
		// @42B5: sipush 1480 (0x05C8)
		// @42B8: iastore
		// @42B9: dup
		// @42BA: iconst_1
		// @42BB: sipush 6291 (0x1893)
		// @42BE: iastore
		// @42BF: dup
		// @42C0: iconst_2
		// @42C1: sipush 7401 (0x1CE9)
		// @42C4: iastore
		// @42C5: dup
		// @42C6: iconst_3
		// @42C7: iconst_0
		// @42C8: iastore
		// @42C9: dup
		// @42CA: iconst_4
		// @42CB: sipush 4810 (0x12CA)
		// @42CE: iastore
		// @42CF: dup
		// @42D0: iconst_5
		// @42D1: sipush 4810 (0x12CA)
		// @42D4: iastore
		// @42D5: dup
		// @42D6: bipush 6 (0x06)
		// @42D8: sipush -416 (0xFE60)
		// @42DB: iastore
		// @42DC: dup
		// @42DD: bipush 7 (0x07)
		// @42DF: sipush 2031 (0x07EF)
		// @42E2: iastore
		// @42E3: aastore
		// @42E4: aload_0
		// @42E5: iconst_4
		// @42E6: bipush 8 (0x08)
		// @42E8: newarray int[]
		// @42EA: dup
		// @42EB: iconst_0
		// @42EC: sipush 8511 (0x213F)
		// @42EF: iastore
		// @42F0: dup
		// @42F1: iconst_1
		// @42F2: sipush 740 (0x02E4)
		// @42F5: iastore
		// @42F6: dup
		// @42F7: iconst_2
		// @42F8: iconst_0
		// @42F9: iastore
		// @42FA: dup
		// @42FB: iconst_3
		// @42FC: sipush 1850 (0x073A)
		// @42FF: iastore
		// @4300: dup
		// @4301: iconst_4
		// @4302: iconst_0
		// @4303: iastore
		// @4304: dup
		// @4305: iconst_5
		// @4306: iconst_0
		// @4307: iastore
		// @4308: dup
		// @4309: bipush 6 (0x06)
		// @430B: sipush 208 (0x00D0)
		// @430E: iastore
		// @430F: dup
		// @4310: bipush 7 (0x07)
		// @4312: iconst_0
		// @4313: iastore
		// @4314: aastore
		// @4315: aload_0
		// @4316: bipush 8 (0x08)
		// @4318: bipush 8 (0x08)
		// @431A: newarray int[]
		// @431C: dup
		// @431D: iconst_0
		// @431E: sipush 9991 (0x2707)
		// @4321: iastore
		// @4322: dup
		// @4323: iconst_1
		// @4324: sipush 4810 (0x12CA)
		// @4327: iastore
		// @4328: dup
		// @4329: iconst_2
		// @432A: sipush 4810 (0x12CA)
		// @432D: iastore
		// @432E: dup
		// @432F: iconst_3
		// @4330: sipush 5550 (0x15AE)
		// @4333: iastore
		// @4334: dup
		// @4335: iconst_4
		// @4336: sipush 2960 (0x0B90)
		// @4339: iastore
		// @433A: dup
		// @433B: iconst_5
		// @433C: sipush 4440 (0x1158)
		// @433F: iastore
		// @4340: dup
		// @4341: bipush 6 (0x06)
		// @4343: bipush 104 (0x68)
		// @4345: iastore
		// @4346: dup
		// @4347: bipush 7 (0x07)
		// @4349: iconst_0
		// @434A: iastore
		// @434B: aastore
		// @434C: aload_0
		// @434D: bipush 23 (0x17)
		// @434F: bipush 8 (0x08)
		// @4351: newarray int[]
		// @4353: dup
		// @4354: iconst_0
		// @4355: sipush 8881 (0x22B1)
		// @4358: iastore
		// @4359: dup
		// @435A: iconst_1
		// @435B: sipush 5921 (0x1721)
		// @435E: iastore
		// @435F: dup
		// @4360: iconst_2
		// @4361: sipush 4070 (0x0FE6)
		// @4364: iastore
		// @4365: dup
		// @4366: iconst_3
		// @4367: sipush 6291 (0x1893)
		// @436A: iastore
		// @436B: dup
		// @436C: iconst_4
		// @436D: sipush 2590 (0x0A1E)
		// @4370: iastore
		// @4371: dup
		// @4372: iconst_5
		// @4373: sipush 2590 (0x0A1E)
		// @4376: iastore
		// @4377: dup
		// @4378: bipush 6 (0x06)
		// @437A: iconst_0
		// @437B: iastore
		// @437C: dup
		// @437D: bipush 7 (0x07)
		// @437F: iconst_0
		// @4380: iastore
		// @4381: aastore
		// @4382: aload_0
		// @4383: bipush 17 (0x11)
		// @4385: bipush 8 (0x08)
		// @4387: newarray int[]
		// @4389: dup
		// @438A: iconst_0
		// @438B: sipush 8511 (0x213F)
		// @438E: iastore
		// @438F: dup
		// @4390: iconst_1
		// @4391: sipush 4810 (0x12CA)
		// @4394: iastore
		// @4395: dup
		// @4396: iconst_2
		// @4397: sipush 1480 (0x05C8)
		// @439A: iastore
		// @439B: dup
		// @439C: iconst_3
		// @439D: sipush 4070 (0x0FE6)
		// @43A0: iastore
		// @43A1: dup
		// @43A2: iconst_4
		// @43A3: sipush 2960 (0x0B90)
		// @43A6: iastore
		// @43A7: dup
		// @43A8: iconst_5
		// @43A9: sipush 1850 (0x073A)
		// @43AC: iastore
		// @43AD: dup
		// @43AE: bipush 6 (0x06)
		// @43B0: sipush -312 (0xFEC8)
		// @43B3: iastore
		// @43B4: dup
		// @43B5: bipush 7 (0x07)
		// @43B7: iconst_0
		// @43B8: iastore
		// @43B9: aastore
		// @43BA: aload_0
		// @43BB: bipush 10 (0x0A)
		// @43BD: bipush 8 (0x08)
		// @43BF: newarray int[]
		// @43C1: dup
		// @43C2: iconst_0
		// @43C3: sipush 12212 (0x2FB4)
		// @43C6: iastore
		// @43C7: dup
		// @43C8: iconst_1
		// @43C9: sipush -1110 (0xFBAA)
		// @43CC: iastore
		// @43CD: dup
		// @43CE: iconst_2
		// @43CF: sipush 3700 (0x0E74)
		// @43D2: iastore
		// @43D3: dup
		// @43D4: iconst_3
		// @43D5: sipush 1850 (0x073A)
		// @43D8: iastore
		// @43D9: dup
		// @43DA: iconst_4
		// @43DB: sipush -1110 (0xFBAA)
		// @43DE: iastore
		// @43DF: dup
		// @43E0: iconst_5
		// @43E1: sipush -1110 (0xFBAA)
		// @43E4: iastore
		// @43E5: dup
		// @43E6: bipush 6 (0x06)
		// @43E8: sipush 572 (0x023C)
		// @43EB: iastore
		// @43EC: dup
		// @43ED: bipush 7 (0x07)
		// @43EF: sipush 520 (0x0208)
		// @43F2: iastore
		// @43F3: aastore
		// @43F4: aload_0
		// @43F5: iconst_5
		// @43F6: bipush 8 (0x08)
		// @43F8: newarray int[]
		// @43FA: dup
		// @43FB: iconst_0
		// @43FC: sipush 9251 (0x2423)
		// @43FF: iastore
		// @4400: dup
		// @4401: iconst_1
		// @4402: sipush 3330 (0x0D02)
		// @4405: iastore
		// @4406: dup
		// @4407: iconst_2
		// @4408: sipush -1850 (0xF8C6)
		// @440B: iastore
		// @440C: dup
		// @440D: iconst_3
		// @440E: sipush 4810 (0x12CA)
		// @4411: iastore
		// @4412: dup
		// @4413: iconst_4
		// @4414: sipush 740 (0x02E4)
		// @4417: iastore
		// @4418: dup
		// @4419: iconst_5
		// @441A: sipush -3330 (0xF2FE)
		// @441D: iastore
		// @441E: dup
		// @441F: bipush 6 (0x06)
		// @4421: sipush 260 (0x0104)
		// @4424: iastore
		// @4425: dup
		// @4426: bipush 7 (0x07)
		// @4428: iconst_0
		// @4429: iastore
		// @442A: aastore
		// @442B: aload_0
		// @442C: bipush 15 (0x0F)
		// @442E: bipush 8 (0x08)
		// @4430: newarray int[]
		// @4432: dup
		// @4433: iconst_0
		// @4434: sipush 8511 (0x213F)
		// @4437: iastore
		// @4438: dup
		// @4439: iconst_1
		// @443A: sipush 1850 (0x073A)
		// @443D: iastore
		// @443E: dup
		// @443F: iconst_2
		// @4440: sipush 2590 (0x0A1E)
		// @4443: iastore
		// @4444: dup
		// @4445: iconst_3
		// @4446: iconst_0
		// @4447: iastore
		// @4448: dup
		// @4449: iconst_4
		// @444A: sipush -1480 (0xFA38)
		// @444D: iastore
		// @444E: dup
		// @444F: iconst_5
		// @4450: sipush -3330 (0xF2FE)
		// @4453: iastore
		// @4454: dup
		// @4455: bipush 6 (0x06)
		// @4457: sipush -364 (0xFE94)
		// @445A: iastore
		// @445B: dup
		// @445C: bipush 7 (0x07)
		// @445E: sipush 1041 (0x0411)
		// @4461: iastore
		// @4462: aastore
		// @4463: aload_0
		// @4464: bipush 20 (0x14)
		// @4466: bipush 8 (0x08)
		// @4468: newarray int[]
		// @446A: dup
		// @446B: iconst_0
		// @446C: sipush 8511 (0x213F)
		// @446F: iastore
		// @4470: dup
		// @4471: iconst_1
		// @4472: sipush 740 (0x02E4)
		// @4475: iastore
		// @4476: dup
		// @4477: iconst_2
		// @4478: iconst_0
		// @4479: iastore
		// @447A: dup
		// @447B: iconst_3
		// @447C: sipush 1850 (0x073A)
		// @447F: iastore
		// @4480: dup
		// @4481: iconst_4
		// @4482: iconst_0
		// @4483: iastore
		// @4484: dup
		// @4485: iconst_5
		// @4486: iconst_0
		// @4487: iastore
		// @4488: dup
		// @4489: bipush 6 (0x06)
		// @448B: sipush 208 (0x00D0)
		// @448E: iastore
		// @448F: dup
		// @4490: bipush 7 (0x07)
		// @4492: iconst_0
		// @4493: iastore
		// @4494: aastore
		// @4495: aload_0
		// @4496: bipush 19 (0x13)
		// @4498: bipush 8 (0x08)
		// @449A: newarray int[]
		// @449C: dup
		// @449D: iconst_0
		// @449E: sipush 5921 (0x1721)
		// @44A1: iastore
		// @44A2: dup
		// @44A3: iconst_1
		// @44A4: sipush 740 (0x02E4)
		// @44A7: iastore
		// @44A8: dup
		// @44A9: iconst_2
		// @44AA: sipush 4070 (0x0FE6)
		// @44AD: iastore
		// @44AE: dup
		// @44AF: iconst_3
		// @44B0: sipush 1110 (0x0456)
		// @44B3: iastore
		// @44B4: dup
		// @44B5: iconst_4
		// @44B6: iconst_0
		// @44B7: iastore
		// @44B8: dup
		// @44B9: iconst_5
		// @44BA: sipush 2220 (0x08AC)
		// @44BD: iastore
		// @44BE: dup
		// @44BF: bipush 6 (0x06)
		// @44C1: bipush -104 (0x98)
		// @44C3: iastore
		// @44C4: dup
		// @44C5: bipush 7 (0x07)
		// @44C7: iconst_0
		// @44C8: iastore
		// @44C9: aastore
		// @44CA: aload_0
		// @44CB: iconst_2
		// @44CC: bipush 8 (0x08)
		// @44CE: newarray int[]
		// @44D0: dup
		// @44D1: iconst_0
		// @44D2: sipush 7401 (0x1CE9)
		// @44D5: iastore
		// @44D6: dup
		// @44D7: iconst_1
		// @44D8: sipush 2960 (0x0B90)
		// @44DB: iastore
		// @44DC: dup
		// @44DD: iconst_2
		// @44DE: sipush 3330 (0x0D02)
		// @44E1: iastore
		// @44E2: dup
		// @44E3: iconst_3
		// @44E4: sipush 2960 (0x0B90)
		// @44E7: iastore
		// @44E8: dup
		// @44E9: iconst_4
		// @44EA: sipush 1850 (0x073A)
		// @44ED: iastore
		// @44EE: dup
		// @44EF: iconst_5
		// @44F0: sipush 1110 (0x0456)
		// @44F3: iastore
		// @44F4: dup
		// @44F5: bipush 6 (0x06)
		// @44F7: bipush 104 (0x68)
		// @44F9: iastore
		// @44FA: dup
		// @44FB: bipush 7 (0x07)
		// @44FD: iconst_0
		// @44FE: iastore
		// @44FF: aastore
		// @4500: aload_0
		// @4501: bipush 9 (0x09)
		// @4503: bipush 8 (0x08)
		// @4505: newarray int[]
		// @4507: dup
		// @4508: iconst_0
		// @4509: sipush 8511 (0x213F)
		// @450C: iastore
		// @450D: dup
		// @450E: iconst_1
		// @450F: sipush 2590 (0x0A1E)
		// @4512: iastore
		// @4513: dup
		// @4514: iconst_2
		// @4515: iconst_0
		// @4516: iastore
		// @4517: dup
		// @4518: iconst_3
		// @4519: sipush 3700 (0x0E74)
		// @451C: iastore
		// @451D: dup
		// @451E: iconst_4
		// @451F: sipush 1480 (0x05C8)
		// @4522: iastore
		// @4523: dup
		// @4524: iconst_5
		// @4525: sipush -1110 (0xFBAA)
		// @4528: iastore
		// @4529: dup
		// @452A: bipush 6 (0x06)
		// @452C: iconst_0
		// @452D: iastore
		// @452E: dup
		// @452F: bipush 7 (0x07)
		// @4531: iconst_0
		// @4532: iastore
		// @4533: aastore
		// @4534: aload_0
		// @4535: bipush 7 (0x07)
		// @4537: bipush 8 (0x08)
		// @4539: newarray int[]
		// @453B: dup
		// @453C: iconst_0
		// @453D: sipush 8881 (0x22B1)
		// @4540: iastore
		// @4541: dup
		// @4542: iconst_1
		// @4543: sipush 5921 (0x1721)
		// @4546: iastore
		// @4547: dup
		// @4548: iconst_2
		// @4549: sipush 4070 (0x0FE6)
		// @454C: iastore
		// @454D: dup
		// @454E: iconst_3
		// @454F: sipush 6291 (0x1893)
		// @4552: iastore
		// @4553: dup
		// @4554: iconst_4
		// @4555: sipush 2590 (0x0A1E)
		// @4558: iastore
		// @4559: dup
		// @455A: iconst_5
		// @455B: sipush 2590 (0x0A1E)
		// @455E: iastore
		// @455F: dup
		// @4560: bipush 6 (0x06)
		// @4562: sipush 156 (0x009C)
		// @4565: iastore
		// @4566: dup
		// @4567: bipush 7 (0x07)
		// @4569: iconst_0
		// @456A: iastore
		// @456B: aastore
		// @456C: aload_0
		// @456D: bipush 12 (0x0C)
		// @456F: bipush 8 (0x08)
		// @4571: newarray int[]
		// @4573: dup
		// @4574: iconst_0
		// @4575: sipush 6661 (0x1A05)
		// @4578: iastore
		// @4579: dup
		// @457A: iconst_1
		// @457B: sipush 6291 (0x1893)
		// @457E: iastore
		// @457F: dup
		// @4580: iconst_2
		// @4581: sipush 5921 (0x1721)
		// @4584: iastore
		// @4585: dup
		// @4586: iconst_3
		// @4587: sipush 2960 (0x0B90)
		// @458A: iastore
		// @458B: dup
		// @458C: iconst_4
		// @458D: sipush 4810 (0x12CA)
		// @4590: iastore
		// @4591: dup
		// @4592: iconst_5
		// @4593: sipush 4810 (0x12CA)
		// @4596: iastore
		// @4597: dup
		// @4598: bipush 6 (0x06)
		// @459A: sipush 468 (0x01D4)
		// @459D: iastore
		// @459E: dup
		// @459F: bipush 7 (0x07)
		// @45A1: sipush 2135 (0x0857)
		// @45A4: iastore
		// @45A5: aastore
		// @45A6: aload_0
		// @45A7: bipush 25 (0x19)
		// @45A9: bipush 8 (0x08)
		// @45AB: newarray int[]
		// @45AD: dup
		// @45AE: iconst_0
		// @45AF: bipush 32 (0x20)
		// @45B1: iastore
		// @45B2: dup
		// @45B3: iconst_1
		// @45B4: bipush 8 (0x08)
		// @45B6: iastore
		// @45B7: dup
		// @45B8: iconst_2
		// @45B9: bipush 25 (0x19)
		// @45BB: iastore
		// @45BC: dup
		// @45BD: iconst_3
		// @45BE: bipush 8 (0x08)
		// @45C0: iastore
		// @45C1: dup
		// @45C2: iconst_4
		// @45C3: iconst_4
		// @45C4: iastore
		// @45C5: dup
		// @45C6: iconst_5
		// @45C7: bipush 32 (0x20)
		// @45C9: iastore
		// @45CA: dup
		// @45CB: bipush 6 (0x06)
		// @45CD: bipush 8 (0x08)
		// @45CF: iastore
		// @45D0: dup
		// @45D1: bipush 7 (0x07)
		// @45D3: bipush 8 (0x08)
		// @45D5: iastore
		// @45D6: aastore
		// @45D7: aload_0
		// @45D8: bipush 11 (0x0B)
		// @45DA: bipush 8 (0x08)
		// @45DC: newarray int[]
		// @45DE: dup
		// @45DF: iconst_0
		// @45E0: sipush 16652 (0x410C)
		// @45E3: iastore
		// @45E4: dup
		// @45E5: iconst_1
		// @45E6: sipush 2960 (0x0B90)
		// @45E9: iastore
		// @45EA: dup
		// @45EB: iconst_2
		// @45EC: sipush 3330 (0x0D02)
		// @45EF: iastore
		// @45F0: dup
		// @45F1: iconst_3
		// @45F2: sipush 6291 (0x1893)
		// @45F5: iastore
		// @45F6: dup
		// @45F7: iconst_4
		// @45F8: sipush -2220 (0xF754)
		// @45FB: iastore
		// @45FC: dup
		// @45FD: iconst_5
		// @45FE: sipush 3330 (0x0D02)
		// @4601: iastore
		// @4602: dup
		// @4603: bipush 6 (0x06)
		// @4605: sipush 1250 (0x04E2)
		// @4608: iastore
		// @4609: dup
		// @460A: bipush 7 (0x07)
		// @460C: sipush 1250 (0x04E2)
		// @460F: iastore
		// @4610: aastore
		// @4611: aload_0
		// @4612: bipush 13 (0x0D)
		// @4614: bipush 8 (0x08)
		// @4616: newarray int[]
		// @4618: dup
		// @4619: iconst_0
		// @461A: iconst_0
		// @461B: iastore
		// @461C: dup
		// @461D: iconst_1
		// @461E: iconst_0
		// @461F: iastore
		// @4620: dup
		// @4621: iconst_2
		// @4622: iconst_0
		// @4623: iastore
		// @4624: dup
		// @4625: iconst_3
		// @4626: iconst_0
		// @4627: iastore
		// @4628: dup
		// @4629: iconst_4
		// @462A: iconst_0
		// @462B: iastore
		// @462C: dup
		// @462D: iconst_5
		// @462E: iconst_0
		// @462F: iastore
		// @4630: dup
		// @4631: bipush 6 (0x06)
		// @4633: iconst_0
		// @4634: iastore
		// @4635: dup
		// @4636: bipush 7 (0x07)
		// @4638: iconst_0
		// @4639: iastore
		// @463A: aastore
		// @463B: aload_0
		// @463C: bipush 24 (0x18)
		// @463E: bipush 8 (0x08)
		// @4640: newarray int[]
		// @4642: dup
		// @4643: iconst_0
		// @4644: sipush 9991 (0x2707)
		// @4647: iastore
		// @4648: dup
		// @4649: iconst_1
		// @464A: sipush 4810 (0x12CA)
		// @464D: iastore
		// @464E: dup
		// @464F: iconst_2
		// @4650: sipush 4810 (0x12CA)
		// @4653: iastore
		// @4654: dup
		// @4655: iconst_3
		// @4656: sipush 5550 (0x15AE)
		// @4659: iastore
		// @465A: dup
		// @465B: iconst_4
		// @465C: sipush 2960 (0x0B90)
		// @465F: iastore
		// @4660: dup
		// @4661: iconst_5
		// @4662: sipush 4440 (0x1158)
		// @4665: iastore
		// @4666: dup
		// @4667: bipush 6 (0x06)
		// @4669: sipush -156 (0xFF64)
		// @466C: iastore
		// @466D: dup
		// @466E: bipush 7 (0x07)
		// @4670: iconst_0
		// @4671: iastore
		// @4672: aastore
		// @4673: aload_0
		// @4674: bipush 21 (0x15)
		// @4676: bipush 8 (0x08)
		// @4678: newarray int[]
		// @467A: dup
		// @467B: iconst_0
		// @467C: sipush 9251 (0x2423)
		// @467F: iastore
		// @4680: dup
		// @4681: iconst_1
		// @4682: sipush 3330 (0x0D02)
		// @4685: iastore
		// @4686: dup
		// @4687: iconst_2
		// @4688: sipush -1850 (0xF8C6)
		// @468B: iastore
		// @468C: dup
		// @468D: iconst_3
		// @468E: sipush 4810 (0x12CA)
		// @4691: iastore
		// @4692: dup
		// @4693: iconst_4
		// @4694: sipush 740 (0x02E4)
		// @4697: iastore
		// @4698: dup
		// @4699: iconst_5
		// @469A: sipush -3330 (0xF2FE)
		// @469D: iastore
		// @469E: dup
		// @469F: bipush 6 (0x06)
		// @46A1: sipush 364 (0x016C)
		// @46A4: iastore
		// @46A5: dup
		// @46A6: bipush 7 (0x07)
		// @46A8: iconst_0
		// @46A9: iastore
		// @46AA: aastore
		// @46AB: aload_0
		// @46AC: bipush 16 (0x10)
		// @46AE: bipush 8 (0x08)
		// @46B0: newarray int[]
		// @46B2: dup
		// @46B3: iconst_0
		// @46B4: sipush 9991 (0x2707)
		// @46B7: iastore
		// @46B8: dup
		// @46B9: iconst_1
		// @46BA: sipush 2590 (0x0A1E)
		// @46BD: iastore
		// @46BE: dup
		// @46BF: iconst_2
		// @46C0: sipush 1850 (0x073A)
		// @46C3: iastore
		// @46C4: dup
		// @46C5: iconst_3
		// @46C6: sipush 3700 (0x0E74)
		// @46C9: iastore
		// @46CA: dup
		// @46CB: iconst_4
		// @46CC: iconst_0
		// @46CD: iastore
		// @46CE: dup
		// @46CF: iconst_5
		// @46D0: iconst_0
		// @46D1: iastore
		// @46D2: dup
		// @46D3: bipush 6 (0x06)
		// @46D5: bipush 104 (0x68)
		// @46D7: iastore
		// @46D8: dup
		// @46D9: bipush 7 (0x07)
		// @46DB: iconst_0
		// @46DC: iastore
		// @46DD: aastore
		// @46DE: aload_0
		// @46DF: iconst_0
		// @46E0: bipush 8 (0x08)
		// @46E2: newarray int[]
		// @46E4: dup
		// @46E5: iconst_0
		// @46E6: sipush 8511 (0x213F)
		// @46E9: iastore
		// @46EA: dup
		// @46EB: iconst_1
		// @46EC: sipush 2590 (0x0A1E)
		// @46EF: iastore
		// @46F0: dup
		// @46F1: iconst_2
		// @46F2: iconst_0
		// @46F3: iastore
		// @46F4: dup
		// @46F5: iconst_3
		// @46F6: sipush 3700 (0x0E74)
		// @46F9: iastore
		// @46FA: dup
		// @46FB: iconst_4
		// @46FC: sipush 1480 (0x05C8)
		// @46FF: iastore
		// @4700: dup
		// @4701: iconst_5
		// @4702: sipush -1110 (0xFBAA)
		// @4705: iastore
		// @4706: dup
		// @4707: bipush 6 (0x06)
		// @4709: iconst_0
		// @470A: iastore
		// @470B: dup
		// @470C: bipush 7 (0x07)
		// @470E: iconst_0
		// @470F: iastore
		// @4710: aastore
		// @4711: aload_0
		// @4712: bipush 18 (0x12)
		// @4714: bipush 8 (0x08)
		// @4716: newarray int[]
		// @4718: dup
		// @4719: iconst_0
		// @471A: sipush 7401 (0x1CE9)
		// @471D: iastore
		// @471E: dup
		// @471F: iconst_1
		// @4720: sipush 2960 (0x0B90)
		// @4723: iastore
		// @4724: dup
		// @4725: iconst_2
		// @4726: sipush 3330 (0x0D02)
		// @4729: iastore
		// @472A: dup
		// @472B: iconst_3
		// @472C: sipush 2960 (0x0B90)
		// @472F: iastore
		// @4730: dup
		// @4731: iconst_4
		// @4732: sipush 1850 (0x073A)
		// @4735: iastore
		// @4736: dup
		// @4737: iconst_5
		// @4738: sipush 1110 (0x0456)
		// @473B: iastore
		// @473C: dup
		// @473D: bipush 6 (0x06)
		// @473F: sipush -156 (0xFF64)
		// @4742: iastore
		// @4743: dup
		// @4744: bipush 7 (0x07)
		// @4746: iconst_0
		// @4747: iastore
		// @4748: aastore
		// @4749: aload_0
		// @474A: bipush 22 (0x16)
		// @474C: bipush 8 (0x08)
		// @474E: newarray int[]
		// @4750: dup
		// @4751: iconst_0
		// @4752: sipush 9251 (0x2423)
		// @4755: iastore
		// @4756: dup
		// @4757: iconst_1
		// @4758: sipush 4810 (0x12CA)
		// @475B: iastore
		// @475C: dup
		// @475D: iconst_2
		// @475E: sipush 1110 (0x0456)
		// @4761: iastore
		// @4762: dup
		// @4763: iconst_3
		// @4764: sipush 5550 (0x15AE)
		// @4767: iastore
		// @4768: dup
		// @4769: iconst_4
		// @476A: sipush 2590 (0x0A1E)
		// @476D: iastore
		// @476E: dup
		// @476F: iconst_5
		// @4770: sipush -3330 (0xF2FE)
		// @4773: iastore
		// @4774: dup
		// @4775: bipush 6 (0x06)
		// @4777: sipush 208 (0x00D0)
		// @477A: iastore
		// @477B: dup
		// @477C: bipush 7 (0x07)
		// @477E: iconst_0
		// @477F: iastore
		// @4780: aastore
		// @4781: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @4784: bipush 10 (0x0A)
		// @4786: aaload
		// @4787: astore_0
		// @4788: aload_0
		// @4789: iconst_4
		// @478A: bipush 14 (0x0E)
		// @478C: newarray int[]
		// @478E: dup
		// @478F: iconst_0
		// @4790: sipush 3330 (0x0D02)
		// @4793: iastore
		// @4794: dup
		// @4795: iconst_1
		// @4796: sipush 5550 (0x15AE)
		// @4799: iastore
		// @479A: dup
		// @479B: iconst_2
		// @479C: sipush -3330 (0xF2FE)
		// @479F: iastore
		// @47A0: dup
		// @47A1: iconst_3
		// @47A2: sipush 5921 (0x1721)
		// @47A5: iastore
		// @47A6: dup
		// @47A7: iconst_4
		// @47A8: iconst_0
		// @47A9: iastore
		// @47AA: dup
		// @47AB: iconst_5
		// @47AC: sipush -6661 (0xE5FB)
		// @47AF: iastore
		// @47B0: dup
		// @47B1: bipush 6 (0x06)
		// @47B3: sipush -1110 (0xFBAA)
		// @47B6: iastore
		// @47B7: dup
		// @47B8: bipush 7 (0x07)
		// @47BA: sipush -2590 (0xF5E2)
		// @47BD: iastore
		// @47BE: dup
		// @47BF: bipush 8 (0x08)
		// @47C1: sipush -1850 (0xF8C6)
		// @47C4: iastore
		// @47C5: dup
		// @47C6: bipush 9 (0x09)
		// @47C8: sipush -4440 (0xEEA8)
		// @47CB: iastore
		// @47CC: dup
		// @47CD: bipush 10 (0x0A)
		// @47CF: iconst_0
		// @47D0: iastore
		// @47D1: dup
		// @47D2: bipush 11 (0x0B)
		// @47D4: iconst_0
		// @47D5: iastore
		// @47D6: dup
		// @47D7: bipush 12 (0x0C)
		// @47D9: bipush 104 (0x68)
		// @47DB: iastore
		// @47DC: dup
		// @47DD: bipush 13 (0x0D)
		// @47DF: iconst_0
		// @47E0: iastore
		// @47E1: aastore
		// @47E2: aload_0
		// @47E3: bipush 11 (0x0B)
		// @47E5: bipush 14 (0x0E)
		// @47E7: newarray int[]
		// @47E9: dup
		// @47EA: iconst_0
		// @47EB: sipush -2590 (0xF5E2)
		// @47EE: iastore
		// @47EF: dup
		// @47F0: iconst_1
		// @47F1: sipush 2960 (0x0B90)
		// @47F4: iastore
		// @47F5: dup
		// @47F6: iconst_2
		// @47F7: iconst_0
		// @47F8: iastore
		// @47F9: dup
		// @47FA: iconst_3
		// @47FB: iconst_0
		// @47FC: iastore
		// @47FD: dup
		// @47FE: iconst_4
		// @47FF: iconst_0
		// @4800: iastore
		// @4801: dup
		// @4802: iconst_5
		// @4803: sipush 1850 (0x073A)
		// @4806: iastore
		// @4807: dup
		// @4808: bipush 6 (0x06)
		// @480A: sipush 9991 (0x2707)
		// @480D: iastore
		// @480E: dup
		// @480F: bipush 7 (0x07)
		// @4811: sipush 3700 (0x0E74)
		// @4814: iastore
		// @4815: dup
		// @4816: bipush 8 (0x08)
		// @4818: sipush 8881 (0x22B1)
		// @481B: iastore
		// @481C: dup
		// @481D: bipush 9 (0x09)
		// @481F: sipush 11842 (0x2E42)
		// @4822: iastore
		// @4823: dup
		// @4824: bipush 10 (0x0A)
		// @4826: iconst_0
		// @4827: iastore
		// @4828: dup
		// @4829: bipush 11 (0x0B)
		// @482B: sipush 2220 (0x08AC)
		// @482E: iastore
		// @482F: dup
		// @4830: bipush 12 (0x0C)
		// @4832: sipush 520 (0x0208)
		// @4835: iastore
		// @4836: dup
		// @4837: bipush 13 (0x0D)
		// @4839: sipush 1197 (0x04AD)
		// @483C: iastore
		// @483D: aastore
		// @483E: aload_0
		// @483F: iconst_2
		// @4840: bipush 14 (0x0E)
		// @4842: newarray int[]
		// @4844: dup
		// @4845: iconst_0
		// @4846: sipush -5180 (0xEBC4)
		// @4849: iastore
		// @484A: dup
		// @484B: iconst_1
		// @484C: sipush -1480 (0xFA38)
		// @484F: iastore
		// @4850: dup
		// @4851: iconst_2
		// @4852: sipush -3330 (0xF2FE)
		// @4855: iastore
		// @4856: dup
		// @4857: iconst_3
		// @4858: iconst_0
		// @4859: iastore
		// @485A: dup
		// @485B: iconst_4
		// @485C: iconst_0
		// @485D: iastore
		// @485E: dup
		// @485F: iconst_5
		// @4860: sipush 5550 (0x15AE)
		// @4863: iastore
		// @4864: dup
		// @4865: bipush 6 (0x06)
		// @4867: sipush 8141 (0x1FCD)
		// @486A: iastore
		// @486B: dup
		// @486C: bipush 7 (0x07)
		// @486E: iconst_0
		// @486F: iastore
		// @4870: dup
		// @4871: bipush 8 (0x08)
		// @4873: sipush 5921 (0x1721)
		// @4876: iastore
		// @4877: dup
		// @4878: bipush 9 (0x09)
		// @487A: iconst_0
		// @487B: iastore
		// @487C: dup
		// @487D: bipush 10 (0x0A)
		// @487F: iconst_0
		// @4880: iastore
		// @4881: dup
		// @4882: bipush 11 (0x0B)
		// @4884: sipush 1850 (0x073A)
		// @4887: iastore
		// @4888: dup
		// @4889: bipush 12 (0x0C)
		// @488B: sipush 520 (0x0208)
		// @488E: iastore
		// @488F: dup
		// @4890: bipush 13 (0x0D)
		// @4892: sipush -989 (0xFC23)
		// @4895: iastore
		// @4896: aastore
		// @4897: aload_0
		// @4898: bipush 24 (0x18)
		// @489A: bipush 14 (0x0E)
		// @489C: newarray int[]
		// @489E: dup
		// @489F: iconst_0
		// @48A0: sipush -8881 (0xDD4F)
		// @48A3: iastore
		// @48A4: dup
		// @48A5: iconst_1
		// @48A6: sipush -740 (0xFD1C)
		// @48A9: iastore
		// @48AA: dup
		// @48AB: iconst_2
		// @48AC: sipush 740 (0x02E4)
		// @48AF: iastore
		// @48B0: dup
		// @48B1: iconst_3
		// @48B2: sipush -8511 (0xDEC1)
		// @48B5: iastore
		// @48B6: dup
		// @48B7: iconst_4
		// @48B8: sipush -7771 (0xE1A5)
		// @48BB: iastore
		// @48BC: dup
		// @48BD: iconst_5
		// @48BE: sipush 1110 (0x0456)
		// @48C1: iastore
		// @48C2: dup
		// @48C3: bipush 6 (0x06)
		// @48C5: sipush 5921 (0x1721)
		// @48C8: iastore
		// @48C9: dup
		// @48CA: bipush 7 (0x07)
		// @48CC: sipush 5921 (0x1721)
		// @48CF: iastore
		// @48D0: dup
		// @48D1: bipush 8 (0x08)
		// @48D3: sipush 7401 (0x1CE9)
		// @48D6: iastore
		// @48D7: dup
		// @48D8: bipush 9 (0x09)
		// @48DA: sipush -2960 (0xF470)
		// @48DD: iastore
		// @48DE: dup
		// @48DF: bipush 10 (0x0A)
		// @48E1: iconst_0
		// @48E2: iastore
		// @48E3: dup
		// @48E4: bipush 11 (0x0B)
		// @48E6: sipush 3700 (0x0E74)
		// @48E9: iastore
		// @48EA: dup
		// @48EB: bipush 12 (0x0C)
		// @48ED: sipush 833 (0x0341)
		// @48F0: iastore
		// @48F1: dup
		// @48F2: bipush 13 (0x0D)
		// @48F4: iconst_0
		// @48F5: iastore
		// @48F6: aastore
		// @48F7: aload_0
		// @48F8: bipush 23 (0x17)
		// @48FA: bipush 14 (0x0E)
		// @48FC: newarray int[]
		// @48FE: dup
		// @48FF: iconst_0
		// @4900: sipush -10731 (0xD615)
		// @4903: iastore
		// @4904: dup
		// @4905: iconst_1
		// @4906: sipush -4810 (0xED36)
		// @4909: iastore
		// @490A: dup
		// @490B: iconst_2
		// @490C: sipush 1110 (0x0456)
		// @490F: iastore
		// @4910: dup
		// @4911: iconst_3
		// @4912: sipush -7771 (0xE1A5)
		// @4915: iastore
		// @4916: dup
		// @4917: iconst_4
		// @4918: sipush -8881 (0xDD4F)
		// @491B: iastore
		// @491C: dup
		// @491D: iconst_5
		// @491E: sipush 2960 (0x0B90)
		// @4921: iastore
		// @4922: dup
		// @4923: bipush 6 (0x06)
		// @4925: sipush -1480 (0xFA38)
		// @4928: iastore
		// @4929: dup
		// @492A: bipush 7 (0x07)
		// @492C: sipush -2590 (0xF5E2)
		// @492F: iastore
		// @4930: dup
		// @4931: bipush 8 (0x08)
		// @4933: iconst_0
		// @4934: iastore
		// @4935: dup
		// @4936: bipush 9 (0x09)
		// @4938: iconst_0
		// @4939: iastore
		// @493A: dup
		// @493B: bipush 10 (0x0A)
		// @493D: iconst_0
		// @493E: iastore
		// @493F: dup
		// @4940: bipush 11 (0x0B)
		// @4942: sipush 5550 (0x15AE)
		// @4945: iastore
		// @4946: dup
		// @4947: bipush 12 (0x0C)
		// @4949: sipush 468 (0x01D4)
		// @494C: iastore
		// @494D: dup
		// @494E: bipush 13 (0x0D)
		// @4950: bipush -104 (0x98)
		// @4952: iastore
		// @4953: aastore
		// @4954: aload_0
		// @4955: bipush 13 (0x0D)
		// @4957: bipush 14 (0x0E)
		// @4959: newarray int[]
		// @495B: dup
		// @495C: iconst_0
		// @495D: sipush 8881 (0x22B1)
		// @4960: iastore
		// @4961: dup
		// @4962: iconst_1
		// @4963: sipush -2590 (0xF5E2)
		// @4966: iastore
		// @4967: dup
		// @4968: iconst_2
		// @4969: sipush 1480 (0x05C8)
		// @496C: iastore
		// @496D: dup
		// @496E: iconst_3
		// @496F: sipush 10361 (0x2879)
		// @4972: iastore
		// @4973: dup
		// @4974: iconst_4
		// @4975: sipush 1850 (0x073A)
		// @4978: iastore
		// @4979: dup
		// @497A: iconst_5
		// @497B: sipush -9621 (0xDA6B)
		// @497E: iastore
		// @497F: dup
		// @4980: bipush 6 (0x06)
		// @4982: sipush -740 (0xFD1C)
		// @4985: iastore
		// @4986: dup
		// @4987: bipush 7 (0x07)
		// @4989: sipush -4440 (0xEEA8)
		// @498C: iastore
		// @498D: dup
		// @498E: bipush 8 (0x08)
		// @4990: sipush 14062 (0x36EE)
		// @4993: iastore
		// @4994: dup
		// @4995: bipush 9 (0x09)
		// @4997: sipush 17763 (0x4563)
		// @499A: iastore
		// @499B: dup
		// @499C: bipush 10 (0x0A)
		// @499E: iconst_0
		// @499F: iastore
		// @49A0: dup
		// @49A1: bipush 11 (0x0B)
		// @49A3: sipush 2220 (0x08AC)
		// @49A6: iastore
		// @49A7: dup
		// @49A8: bipush 12 (0x0C)
		// @49AA: sipush -1510 (0xFA1A)
		// @49AD: iastore
		// @49AE: dup
		// @49AF: bipush 13 (0x0D)
		// @49B1: sipush 2500 (0x09C4)
		// @49B4: iastore
		// @49B5: aastore
		// @49B6: aload_0
		// @49B7: bipush 22 (0x16)
		// @49B9: bipush 14 (0x0E)
		// @49BB: newarray int[]
		// @49BD: dup
		// @49BE: iconst_0
		// @49BF: sipush -7031 (0xE489)
		// @49C2: iastore
		// @49C3: dup
		// @49C4: iconst_1
		// @49C5: sipush 1850 (0x073A)
		// @49C8: iastore
		// @49C9: dup
		// @49CA: iconst_2
		// @49CB: sipush -1480 (0xFA38)
		// @49CE: iastore
		// @49CF: dup
		// @49D0: iconst_3
		// @49D1: sipush -7401 (0xE317)
		// @49D4: iastore
		// @49D5: dup
		// @49D6: iconst_4
		// @49D7: sipush -6661 (0xE5FB)
		// @49DA: iastore
		// @49DB: dup
		// @49DC: iconst_5
		// @49DD: sipush 740 (0x02E4)
		// @49E0: iastore
		// @49E1: dup
		// @49E2: bipush 6 (0x06)
		// @49E4: iconst_0
		// @49E5: iastore
		// @49E6: dup
		// @49E7: bipush 7 (0x07)
		// @49E9: sipush -2590 (0xF5E2)
		// @49EC: iastore
		// @49ED: dup
		// @49EE: bipush 8 (0x08)
		// @49F0: sipush -8881 (0xDD4F)
		// @49F3: iastore
		// @49F4: dup
		// @49F5: bipush 9 (0x09)
		// @49F7: sipush -8141 (0xE033)
		// @49FA: iastore
		// @49FB: dup
		// @49FC: bipush 10 (0x0A)
		// @49FE: iconst_0
		// @49FF: iastore
		// @4A00: dup
		// @4A01: bipush 11 (0x0B)
		// @4A03: sipush 2590 (0x0A1E)
		// @4A06: iastore
		// @4A07: dup
		// @4A08: bipush 12 (0x0C)
		// @4A0A: sipush 1458 (0x05B2)
		// @4A0D: iastore
		// @4A0E: dup
		// @4A0F: bipush 13 (0x0D)
		// @4A11: sipush -364 (0xFE94)
		// @4A14: iastore
		// @4A15: aastore
		// @4A16: aload_0
		// @4A17: bipush 18 (0x12)
		// @4A19: bipush 14 (0x0E)
		// @4A1B: newarray int[]
		// @4A1D: dup
		// @4A1E: iconst_0
		// @4A1F: sipush -3700 (0xF18C)
		// @4A22: iastore
		// @4A23: dup
		// @4A24: iconst_1
		// @4A25: sipush 2590 (0x0A1E)
		// @4A28: iastore
		// @4A29: dup
		// @4A2A: iconst_2
		// @4A2B: sipush -3330 (0xF2FE)
		// @4A2E: iastore
		// @4A2F: dup
		// @4A30: iconst_3
		// @4A31: sipush -8141 (0xE033)
		// @4A34: iastore
		// @4A35: dup
		// @4A36: iconst_4
		// @4A37: sipush -7401 (0xE317)
		// @4A3A: iastore
		// @4A3B: dup
		// @4A3C: iconst_5
		// @4A3D: sipush -7401 (0xE317)
		// @4A40: iastore
		// @4A41: dup
		// @4A42: bipush 6 (0x06)
		// @4A44: sipush 4440 (0x1158)
		// @4A47: iastore
		// @4A48: dup
		// @4A49: bipush 7 (0x07)
		// @4A4B: iconst_0
		// @4A4C: iastore
		// @4A4D: dup
		// @4A4E: bipush 8 (0x08)
		// @4A50: sipush 5921 (0x1721)
		// @4A53: iastore
		// @4A54: dup
		// @4A55: bipush 9 (0x09)
		// @4A57: iconst_0
		// @4A58: iastore
		// @4A59: dup
		// @4A5A: bipush 10 (0x0A)
		// @4A5C: iconst_0
		// @4A5D: iastore
		// @4A5E: dup
		// @4A5F: bipush 11 (0x0B)
		// @4A61: sipush 2590 (0x0A1E)
		// @4A64: iastore
		// @4A65: dup
		// @4A66: bipush 12 (0x0C)
		// @4A68: sipush 1979 (0x07BB)
		// @4A6B: iastore
		// @4A6C: dup
		// @4A6D: bipush 13 (0x0D)
		// @4A6F: sipush -520 (0xFDF8)
		// @4A72: iastore
		// @4A73: aastore
		// @4A74: aload_0
		// @4A75: bipush 7 (0x07)
		// @4A77: bipush 14 (0x0E)
		// @4A79: newarray int[]
		// @4A7B: dup
		// @4A7C: iconst_0
		// @4A7D: sipush -2220 (0xF754)
		// @4A80: iastore
		// @4A81: dup
		// @4A82: iconst_1
		// @4A83: sipush 4070 (0x0FE6)
		// @4A86: iastore
		// @4A87: dup
		// @4A88: iconst_2
		// @4A89: sipush 1110 (0x0456)
		// @4A8C: iastore
		// @4A8D: dup
		// @4A8E: iconst_3
		// @4A8F: sipush 2960 (0x0B90)
		// @4A92: iastore
		// @4A93: dup
		// @4A94: iconst_4
		// @4A95: sipush 5180 (0x143C)
		// @4A98: iastore
		// @4A99: dup
		// @4A9A: iconst_5
		// @4A9B: sipush 1480 (0x05C8)
		// @4A9E: iastore
		// @4A9F: dup
		// @4AA0: bipush 6 (0x06)
		// @4AA2: sipush 1110 (0x0456)
		// @4AA5: iastore
		// @4AA6: dup
		// @4AA7: bipush 7 (0x07)
		// @4AA9: sipush -2590 (0xF5E2)
		// @4AAC: iastore
		// @4AAD: dup
		// @4AAE: bipush 8 (0x08)
		// @4AB0: iconst_0
		// @4AB1: iastore
		// @4AB2: dup
		// @4AB3: bipush 9 (0x09)
		// @4AB5: iconst_0
		// @4AB6: iastore
		// @4AB7: dup
		// @4AB8: bipush 10 (0x0A)
		// @4ABA: iconst_0
		// @4ABB: iastore
		// @4ABC: dup
		// @4ABD: bipush 11 (0x0B)
		// @4ABF: sipush 1850 (0x073A)
		// @4AC2: iastore
		// @4AC3: dup
		// @4AC4: bipush 12 (0x0C)
		// @4AC6: bipush -104 (0x98)
		// @4AC8: iastore
		// @4AC9: dup
		// @4ACA: bipush 13 (0x0D)
		// @4ACC: sipush -625 (0xFD8F)
		// @4ACF: iastore
		// @4AD0: aastore
		// @4AD1: aload_0
		// @4AD2: iconst_1
		// @4AD3: bipush 14 (0x0E)
		// @4AD5: newarray int[]
		// @4AD7: dup
		// @4AD8: iconst_0
		// @4AD9: sipush -4070 (0xF01A)
		// @4ADC: iastore
		// @4ADD: dup
		// @4ADE: iconst_1
		// @4ADF: sipush -6291 (0xE76D)
		// @4AE2: iastore
		// @4AE3: dup
		// @4AE4: iconst_2
		// @4AE5: sipush -3330 (0xF2FE)
		// @4AE8: iastore
		// @4AE9: dup
		// @4AEA: iconst_3
		// @4AEB: sipush -3330 (0xF2FE)
		// @4AEE: iastore
		// @4AEF: dup
		// @4AF0: iconst_4
		// @4AF1: sipush -6291 (0xE76D)
		// @4AF4: iastore
		// @4AF5: dup
		// @4AF6: iconst_5
		// @4AF7: sipush 5921 (0x1721)
		// @4AFA: iastore
		// @4AFB: dup
		// @4AFC: bipush 6 (0x06)
		// @4AFE: sipush 2960 (0x0B90)
		// @4B01: iastore
		// @4B02: dup
		// @4B03: bipush 7 (0x07)
		// @4B05: iconst_0
		// @4B06: iastore
		// @4B07: dup
		// @4B08: bipush 8 (0x08)
		// @4B0A: iconst_0
		// @4B0B: iastore
		// @4B0C: dup
		// @4B0D: bipush 9 (0x09)
		// @4B0F: iconst_0
		// @4B10: iastore
		// @4B11: dup
		// @4B12: bipush 10 (0x0A)
		// @4B14: iconst_0
		// @4B15: iastore
		// @4B16: dup
		// @4B17: bipush 11 (0x0B)
		// @4B19: sipush 740 (0x02E4)
		// @4B1C: iastore
		// @4B1D: dup
		// @4B1E: bipush 12 (0x0C)
		// @4B20: iconst_0
		// @4B21: iastore
		// @4B22: dup
		// @4B23: bipush 13 (0x0D)
		// @4B25: sipush -1041 (0xFBEF)
		// @4B28: iastore
		// @4B29: aastore
		// @4B2A: aload_0
		// @4B2B: bipush 21 (0x15)
		// @4B2D: bipush 14 (0x0E)
		// @4B2F: newarray int[]
		// @4B31: dup
		// @4B32: iconst_0
		// @4B33: sipush 740 (0x02E4)
		// @4B36: iastore
		// @4B37: dup
		// @4B38: iconst_1
		// @4B39: sipush 5921 (0x1721)
		// @4B3C: iastore
		// @4B3D: dup
		// @4B3E: iconst_2
		// @4B3F: sipush -3330 (0xF2FE)
		// @4B42: iastore
		// @4B43: dup
		// @4B44: iconst_3
		// @4B45: sipush 5550 (0x15AE)
		// @4B48: iastore
		// @4B49: dup
		// @4B4A: iconst_4
		// @4B4B: sipush 9991 (0x2707)
		// @4B4E: iastore
		// @4B4F: dup
		// @4B50: iconst_5
		// @4B51: sipush -4070 (0xF01A)
		// @4B54: iastore
		// @4B55: dup
		// @4B56: bipush 6 (0x06)
		// @4B58: sipush 2590 (0x0A1E)
		// @4B5B: iastore
		// @4B5C: dup
		// @4B5D: bipush 7 (0x07)
		// @4B5F: sipush -6291 (0xE76D)
		// @4B62: iastore
		// @4B63: dup
		// @4B64: bipush 8 (0x08)
		// @4B66: sipush -8141 (0xE033)
		// @4B69: iastore
		// @4B6A: dup
		// @4B6B: bipush 9 (0x09)
		// @4B6D: sipush -8141 (0xE033)
		// @4B70: iastore
		// @4B71: dup
		// @4B72: bipush 10 (0x0A)
		// @4B74: iconst_0
		// @4B75: iastore
		// @4B76: dup
		// @4B77: bipush 11 (0x0B)
		// @4B79: sipush 5180 (0x143C)
		// @4B7C: iastore
		// @4B7D: dup
		// @4B7E: bipush 12 (0x0C)
		// @4B80: sipush 1354 (0x054A)
		// @4B83: iastore
		// @4B84: dup
		// @4B85: bipush 13 (0x0D)
		// @4B87: iconst_0
		// @4B88: iastore
		// @4B89: aastore
		// @4B8A: aload_0
		// @4B8B: iconst_3
		// @4B8C: bipush 14 (0x0E)
		// @4B8E: newarray int[]
		// @4B90: dup
		// @4B91: iconst_0
		// @4B92: sipush -1850 (0xF8C6)
		// @4B95: iastore
		// @4B96: dup
		// @4B97: iconst_1
		// @4B98: sipush 1480 (0x05C8)
		// @4B9B: iastore
		// @4B9C: dup
		// @4B9D: iconst_2
		// @4B9E: sipush -3330 (0xF2FE)
		// @4BA1: iastore
		// @4BA2: dup
		// @4BA3: iconst_3
		// @4BA4: iconst_0
		// @4BA5: iastore
		// @4BA6: dup
		// @4BA7: iconst_4
		// @4BA8: iconst_0
		// @4BA9: iastore
		// @4BAA: dup
		// @4BAB: iconst_5
		// @4BAC: iconst_0
		// @4BAD: iastore
		// @4BAE: dup
		// @4BAF: bipush 6 (0x06)
		// @4BB1: sipush 7031 (0x1B77)
		// @4BB4: iastore
		// @4BB5: dup
		// @4BB6: bipush 7 (0x07)
		// @4BB8: sipush 2960 (0x0B90)
		// @4BBB: iastore
		// @4BBC: dup
		// @4BBD: bipush 8 (0x08)
		// @4BBF: sipush 10731 (0x29EB)
		// @4BC2: iastore
		// @4BC3: dup
		// @4BC4: bipush 9 (0x09)
		// @4BC6: sipush 13322 (0x340A)
		// @4BC9: iastore
		// @4BCA: dup
		// @4BCB: bipush 10 (0x0A)
		// @4BCD: iconst_0
		// @4BCE: iastore
		// @4BCF: dup
		// @4BD0: bipush 11 (0x0B)
		// @4BD2: sipush 1110 (0x0456)
		// @4BD5: iastore
		// @4BD6: dup
		// @4BD7: bipush 12 (0x0C)
		// @4BD9: sipush 208 (0x00D0)
		// @4BDC: iastore
		// @4BDD: dup
		// @4BDE: bipush 13 (0x0D)
		// @4BE0: sipush -885 (0xFC8B)
		// @4BE3: iastore
		// @4BE4: aastore
		// @4BE5: aload_0
		// @4BE6: bipush 25 (0x19)
		// @4BE8: bipush 8 (0x08)
		// @4BEA: newarray int[]
		// @4BEC: dup
		// @4BED: iconst_0
		// @4BEE: bipush 47 (0x2F)
		// @4BF0: iastore
		// @4BF1: dup
		// @4BF2: iconst_1
		// @4BF3: bipush 6 (0x06)
		// @4BF5: iastore
		// @4BF6: dup
		// @4BF7: iconst_2
		// @4BF8: bipush 25 (0x19)
		// @4BFA: iastore
		// @4BFB: dup
		// @4BFC: iconst_3
		// @4BFD: bipush 8 (0x08)
		// @4BFF: iastore
		// @4C00: dup
		// @4C01: iconst_4
		// @4C02: iconst_5
		// @4C03: iastore
		// @4C04: dup
		// @4C05: iconst_5
		// @4C06: bipush 47 (0x2F)
		// @4C08: iastore
		// @4C09: dup
		// @4C0A: bipush 6 (0x06)
		// @4C0C: bipush 6 (0x06)
		// @4C0E: iastore
		// @4C0F: dup
		// @4C10: bipush 7 (0x07)
		// @4C12: bipush 8 (0x08)
		// @4C14: iastore
		// @4C15: aastore
		// @4C16: aload_0
		// @4C17: bipush 9 (0x09)
		// @4C19: bipush 14 (0x0E)
		// @4C1B: newarray int[]
		// @4C1D: dup
		// @4C1E: iconst_0
		// @4C1F: sipush -2590 (0xF5E2)
		// @4C22: iastore
		// @4C23: dup
		// @4C24: iconst_1
		// @4C25: sipush -3330 (0xF2FE)
		// @4C28: iastore
		// @4C29: dup
		// @4C2A: iconst_2
		// @4C2B: iconst_0
		// @4C2C: iastore
		// @4C2D: dup
		// @4C2E: iconst_3
		// @4C2F: iconst_0
		// @4C30: iastore
		// @4C31: dup
		// @4C32: iconst_4
		// @4C33: iconst_0
		// @4C34: iastore
		// @4C35: dup
		// @4C36: iconst_5
		// @4C37: sipush 5921 (0x1721)
		// @4C3A: iastore
		// @4C3B: dup
		// @4C3C: bipush 6 (0x06)
		// @4C3E: sipush 2960 (0x0B90)
		// @4C41: iastore
		// @4C42: dup
		// @4C43: bipush 7 (0x07)
		// @4C45: iconst_0
		// @4C46: iastore
		// @4C47: dup
		// @4C48: bipush 8 (0x08)
		// @4C4A: iconst_0
		// @4C4B: iastore
		// @4C4C: dup
		// @4C4D: bipush 9 (0x09)
		// @4C4F: iconst_0
		// @4C50: iastore
		// @4C51: dup
		// @4C52: bipush 10 (0x0A)
		// @4C54: iconst_0
		// @4C55: iastore
		// @4C56: dup
		// @4C57: bipush 11 (0x0B)
		// @4C59: sipush -1480 (0xFA38)
		// @4C5C: iastore
		// @4C5D: dup
		// @4C5E: bipush 12 (0x0C)
		// @4C60: iconst_0
		// @4C61: iastore
		// @4C62: dup
		// @4C63: bipush 13 (0x0D)
		// @4C65: sipush -156 (0xFF64)
		// @4C68: iastore
		// @4C69: aastore
		// @4C6A: aload_0
		// @4C6B: bipush 20 (0x14)
		// @4C6D: bipush 14 (0x0E)
		// @4C6F: newarray int[]
		// @4C71: dup
		// @4C72: iconst_0
		// @4C73: sipush 1850 (0x073A)
		// @4C76: iastore
		// @4C77: dup
		// @4C78: iconst_1
		// @4C79: iconst_0
		// @4C7A: iastore
		// @4C7B: dup
		// @4C7C: iconst_2
		// @4C7D: sipush -3330 (0xF2FE)
		// @4C80: iastore
		// @4C81: dup
		// @4C82: iconst_3
		// @4C83: sipush 5921 (0x1721)
		// @4C86: iastore
		// @4C87: dup
		// @4C88: iconst_4
		// @4C89: iconst_0
		// @4C8A: iastore
		// @4C8B: dup
		// @4C8C: iconst_5
		// @4C8D: sipush -12212 (0xD04C)
		// @4C90: iastore
		// @4C91: dup
		// @4C92: bipush 6 (0x06)
		// @4C94: sipush -1480 (0xFA38)
		// @4C97: iastore
		// @4C98: dup
		// @4C99: bipush 7 (0x07)
		// @4C9B: sipush -2590 (0xF5E2)
		// @4C9E: iastore
		// @4C9F: dup
		// @4CA0: bipush 8 (0x08)
		// @4CA2: sipush -8141 (0xE033)
		// @4CA5: iastore
		// @4CA6: dup
		// @4CA7: bipush 9 (0x09)
		// @4CA9: sipush -7401 (0xE317)
		// @4CAC: iastore
		// @4CAD: dup
		// @4CAE: bipush 10 (0x0A)
		// @4CB0: iconst_0
		// @4CB1: iastore
		// @4CB2: dup
		// @4CB3: bipush 11 (0x0B)
		// @4CB5: sipush 4810 (0x12CA)
		// @4CB8: iastore
		// @4CB9: dup
		// @4CBA: bipush 12 (0x0C)
		// @4CBC: sipush 1562 (0x061A)
		// @4CBF: iastore
		// @4CC0: dup
		// @4CC1: bipush 13 (0x0D)
		// @4CC3: sipush -312 (0xFEC8)
		// @4CC6: iastore
		// @4CC7: aastore
		// @4CC8: aload_0
		// @4CC9: bipush 19 (0x13)
		// @4CCB: bipush 14 (0x0E)
		// @4CCD: newarray int[]
		// @4CCF: dup
		// @4CD0: iconst_0
		// @4CD1: sipush -1850 (0xF8C6)
		// @4CD4: iastore
		// @4CD5: dup
		// @4CD6: iconst_1
		// @4CD7: sipush 1480 (0x05C8)
		// @4CDA: iastore
		// @4CDB: dup
		// @4CDC: iconst_2
		// @4CDD: sipush -3330 (0xF2FE)
		// @4CE0: iastore
		// @4CE1: dup
		// @4CE2: iconst_3
		// @4CE3: sipush -8141 (0xE033)
		// @4CE6: iastore
		// @4CE7: dup
		// @4CE8: iconst_4
		// @4CE9: sipush -7771 (0xE1A5)
		// @4CEC: iastore
		// @4CED: dup
		// @4CEE: iconst_5
		// @4CEF: sipush -15172 (0xC4BC)
		// @4CF2: iastore
		// @4CF3: dup
		// @4CF4: bipush 6 (0x06)
		// @4CF6: sipush -1480 (0xFA38)
		// @4CF9: iastore
		// @4CFA: dup
		// @4CFB: bipush 7 (0x07)
		// @4CFD: sipush -4810 (0xED36)
		// @4D00: iastore
		// @4D01: dup
		// @4D02: bipush 8 (0x08)
		// @4D04: sipush -4070 (0xF01A)
		// @4D07: iastore
		// @4D08: dup
		// @4D09: bipush 9 (0x09)
		// @4D0B: sipush -11101 (0xD4A3)
		// @4D0E: iastore
		// @4D0F: dup
		// @4D10: bipush 10 (0x0A)
		// @4D12: iconst_0
		// @4D13: iastore
		// @4D14: dup
		// @4D15: bipush 11 (0x0B)
		// @4D17: sipush 1110 (0x0456)
		// @4D1A: iastore
		// @4D1B: dup
		// @4D1C: bipush 12 (0x0C)
		// @4D1E: sipush 2187 (0x088B)
		// @4D21: iastore
		// @4D22: dup
		// @4D23: bipush 13 (0x0D)
		// @4D25: sipush -885 (0xFC8B)
		// @4D28: iastore
		// @4D29: aastore
		// @4D2A: aload_0
		// @4D2B: bipush 14 (0x0E)
		// @4D2D: bipush 14 (0x0E)
		// @4D2F: newarray int[]
		// @4D31: dup
		// @4D32: iconst_0
		// @4D33: sipush 8141 (0x1FCD)
		// @4D36: iastore
		// @4D37: dup
		// @4D38: iconst_1
		// @4D39: sipush 3700 (0x0E74)
		// @4D3C: iastore
		// @4D3D: dup
		// @4D3E: iconst_2
		// @4D3F: sipush 8141 (0x1FCD)
		// @4D42: iastore
		// @4D43: dup
		// @4D44: iconst_3
		// @4D45: sipush 17392 (0x43F0)
		// @4D48: iastore
		// @4D49: dup
		// @4D4A: iconst_4
		// @4D4B: sipush 17392 (0x43F0)
		// @4D4E: iastore
		// @4D4F: dup
		// @4D50: iconst_5
		// @4D51: sipush -11842 (0xD1BE)
		// @4D54: iastore
		// @4D55: dup
		// @4D56: bipush 6 (0x06)
		// @4D58: sipush -6291 (0xE76D)
		// @4D5B: iastore
		// @4D5C: dup
		// @4D5D: bipush 7 (0x07)
		// @4D5F: sipush -4440 (0xEEA8)
		// @4D62: iastore
		// @4D63: dup
		// @4D64: bipush 8 (0x08)
		// @4D66: sipush 11842 (0x2E42)
		// @4D69: iastore
		// @4D6A: dup
		// @4D6B: bipush 9 (0x09)
		// @4D6D: sipush 18503 (0x4847)
		// @4D70: iastore
		// @4D71: dup
		// @4D72: bipush 10 (0x0A)
		// @4D74: iconst_0
		// @4D75: iastore
		// @4D76: dup
		// @4D77: bipush 11 (0x0B)
		// @4D79: sipush 2220 (0x08AC)
		// @4D7C: iastore
		// @4D7D: dup
		// @4D7E: bipush 12 (0x0C)
		// @4D80: sipush -1510 (0xFA1A)
		// @4D83: iastore
		// @4D84: dup
		// @4D85: bipush 13 (0x0D)
		// @4D87: sipush 1093 (0x0445)
		// @4D8A: iastore
		// @4D8B: aastore
		// @4D8C: aload_0
		// @4D8D: iconst_5
		// @4D8E: bipush 14 (0x0E)
		// @4D90: newarray int[]
		// @4D92: dup
		// @4D93: iconst_0
		// @4D94: sipush 5921 (0x1721)
		// @4D97: iastore
		// @4D98: dup
		// @4D99: iconst_1
		// @4D9A: sipush 5550 (0x15AE)
		// @4D9D: iastore
		// @4D9E: dup
		// @4D9F: iconst_2
		// @4DA0: sipush -3330 (0xF2FE)
		// @4DA3: iastore
		// @4DA4: dup
		// @4DA5: iconst_3
		// @4DA6: sipush 5921 (0x1721)
		// @4DA9: iastore
		// @4DAA: dup
		// @4DAB: iconst_4
		// @4DAC: iconst_0
		// @4DAD: iastore
		// @4DAE: dup
		// @4DAF: iconst_5
		// @4DB0: sipush -2960 (0xF470)
		// @4DB3: iastore
		// @4DB4: dup
		// @4DB5: bipush 6 (0x06)
		// @4DB7: sipush -3700 (0xF18C)
		// @4DBA: iastore
		// @4DBB: dup
		// @4DBC: bipush 7 (0x07)
		// @4DBE: sipush -2590 (0xF5E2)
		// @4DC1: iastore
		// @4DC2: dup
		// @4DC3: bipush 8 (0x08)
		// @4DC5: iconst_0
		// @4DC6: iastore
		// @4DC7: dup
		// @4DC8: bipush 9 (0x09)
		// @4DCA: sipush -7771 (0xE1A5)
		// @4DCD: iastore
		// @4DCE: dup
		// @4DCF: bipush 10 (0x0A)
		// @4DD1: iconst_0
		// @4DD2: iastore
		// @4DD3: dup
		// @4DD4: bipush 11 (0x0B)
		// @4DD6: sipush 1850 (0x073A)
		// @4DD9: iastore
		// @4DDA: dup
		// @4DDB: bipush 12 (0x0C)
		// @4DDD: bipush 104 (0x68)
		// @4DDF: iastore
		// @4DE0: dup
		// @4DE1: bipush 13 (0x0D)
		// @4DE3: sipush -260 (0xFEFC)
		// @4DE6: iastore
		// @4DE7: aastore
		// @4DE8: aload_0
		// @4DE9: iconst_0
		// @4DEA: bipush 14 (0x0E)
		// @4DEC: newarray int[]
		// @4DEE: dup
		// @4DEF: iconst_0
		// @4DF0: sipush -2590 (0xF5E2)
		// @4DF3: iastore
		// @4DF4: dup
		// @4DF5: iconst_1
		// @4DF6: sipush -3330 (0xF2FE)
		// @4DF9: iastore
		// @4DFA: dup
		// @4DFB: iconst_2
		// @4DFC: iconst_0
		// @4DFD: iastore
		// @4DFE: dup
		// @4DFF: iconst_3
		// @4E00: iconst_0
		// @4E01: iastore
		// @4E02: dup
		// @4E03: iconst_4
		// @4E04: iconst_0
		// @4E05: iastore
		// @4E06: dup
		// @4E07: iconst_5
		// @4E08: sipush 5921 (0x1721)
		// @4E0B: iastore
		// @4E0C: dup
		// @4E0D: bipush 6 (0x06)
		// @4E0F: sipush 2960 (0x0B90)
		// @4E12: iastore
		// @4E13: dup
		// @4E14: bipush 7 (0x07)
		// @4E16: iconst_0
		// @4E17: iastore
		// @4E18: dup
		// @4E19: bipush 8 (0x08)
		// @4E1B: iconst_0
		// @4E1C: iastore
		// @4E1D: dup
		// @4E1E: bipush 9 (0x09)
		// @4E20: iconst_0
		// @4E21: iastore
		// @4E22: dup
		// @4E23: bipush 10 (0x0A)
		// @4E25: iconst_0
		// @4E26: iastore
		// @4E27: dup
		// @4E28: bipush 11 (0x0B)
		// @4E2A: sipush -1480 (0xFA38)
		// @4E2D: iastore
		// @4E2E: dup
		// @4E2F: bipush 12 (0x0C)
		// @4E31: iconst_0
		// @4E32: iastore
		// @4E33: dup
		// @4E34: bipush 13 (0x0D)
		// @4E36: iconst_0
		// @4E37: iastore
		// @4E38: aastore
		// @4E39: aload_0
		// @4E3A: bipush 12 (0x0C)
		// @4E3C: bipush 14 (0x0E)
		// @4E3E: newarray int[]
		// @4E40: dup
		// @4E41: iconst_0
		// @4E42: sipush 2220 (0x08AC)
		// @4E45: iastore
		// @4E46: dup
		// @4E47: iconst_1
		// @4E48: sipush 2960 (0x0B90)
		// @4E4B: iastore
		// @4E4C: dup
		// @4E4D: iconst_2
		// @4E4E: iconst_0
		// @4E4F: iastore
		// @4E50: dup
		// @4E51: iconst_3
		// @4E52: sipush 10361 (0x2879)
		// @4E55: iastore
		// @4E56: dup
		// @4E57: iconst_4
		// @4E58: sipush 1850 (0x073A)
		// @4E5B: iastore
		// @4E5C: dup
		// @4E5D: iconst_5
		// @4E5E: sipush -3700 (0xF18C)
		// @4E61: iastore
		// @4E62: dup
		// @4E63: bipush 6 (0x06)
		// @4E65: sipush 11471 (0x2CCF)
		// @4E68: iastore
		// @4E69: dup
		// @4E6A: bipush 7 (0x07)
		// @4E6C: sipush 1110 (0x0456)
		// @4E6F: iastore
		// @4E70: dup
		// @4E71: bipush 8 (0x08)
		// @4E73: sipush 9991 (0x2707)
		// @4E76: iastore
		// @4E77: dup
		// @4E78: bipush 9 (0x09)
		// @4E7A: sipush 17763 (0x4563)
		// @4E7D: iastore
		// @4E7E: dup
		// @4E7F: bipush 10 (0x0A)
		// @4E81: iconst_0
		// @4E82: iastore
		// @4E83: dup
		// @4E84: bipush 11 (0x0B)
		// @4E86: sipush 2220 (0x08AC)
		// @4E89: iastore
		// @4E8A: dup
		// @4E8B: bipush 12 (0x0C)
		// @4E8D: sipush -468 (0xFE2C)
		// @4E90: iastore
		// @4E91: dup
		// @4E92: bipush 13 (0x0D)
		// @4E94: sipush 2395 (0x095B)
		// @4E97: iastore
		// @4E98: aastore
		// @4E99: aload_0
		// @4E9A: bipush 16 (0x10)
		// @4E9C: bipush 14 (0x0E)
		// @4E9E: newarray int[]
		// @4EA0: dup
		// @4EA1: iconst_0
		// @4EA2: sipush 6291 (0x1893)
		// @4EA5: iastore
		// @4EA6: dup
		// @4EA7: iconst_1
		// @4EA8: sipush 16282 (0x3F9A)
		// @4EAB: iastore
		// @4EAC: dup
		// @4EAD: iconst_2
		// @4EAE: sipush 13692 (0x357C)
		// @4EB1: iastore
		// @4EB2: dup
		// @4EB3: iconst_3
		// @4EB4: sipush 22943 (0x599F)
		// @4EB7: iastore
		// @4EB8: dup
		// @4EB9: iconst_4
		// @4EBA: sipush 28124 (0x6DDC)
		// @4EBD: iastore
		// @4EBE: dup
		// @4EBF: iconst_5
		// @4EC0: iconst_0
		// @4EC1: iastore
		// @4EC2: dup
		// @4EC3: bipush 6 (0x06)
		// @4EC5: sipush -8141 (0xE033)
		// @4EC8: iastore
		// @4EC9: dup
		// @4ECA: bipush 7 (0x07)
		// @4ECC: sipush -1850 (0xF8C6)
		// @4ECF: iastore
		// @4ED0: dup
		// @4ED1: bipush 8 (0x08)
		// @4ED3: sipush -4440 (0xEEA8)
		// @4ED6: iastore
		// @4ED7: dup
		// @4ED8: bipush 9 (0x09)
		// @4EDA: sipush -7771 (0xE1A5)
		// @4EDD: iastore
		// @4EDE: dup
		// @4EDF: bipush 10 (0x0A)
		// @4EE1: iconst_0
		// @4EE2: iastore
		// @4EE3: dup
		// @4EE4: bipush 11 (0x0B)
		// @4EE6: sipush -5550 (0xEA52)
		// @4EE9: iastore
		// @4EEA: dup
		// @4EEB: bipush 12 (0x0C)
		// @4EED: sipush -1510 (0xFA1A)
		// @4EF0: iastore
		// @4EF1: dup
		// @4EF2: bipush 13 (0x0D)
		// @4EF4: sipush 1093 (0x0445)
		// @4EF7: iastore
		// @4EF8: aastore
		// @4EF9: aload_0
		// @4EFA: bipush 8 (0x08)
		// @4EFC: bipush 14 (0x0E)
		// @4EFE: newarray int[]
		// @4F00: dup
		// @4F01: iconst_0
		// @4F02: sipush -5180 (0xEBC4)
		// @4F05: iastore
		// @4F06: dup
		// @4F07: iconst_1
		// @4F08: sipush -740 (0xFD1C)
		// @4F0B: iastore
		// @4F0C: dup
		// @4F0D: iconst_2
		// @4F0E: sipush 740 (0x02E4)
		// @4F11: iastore
		// @4F12: dup
		// @4F13: iconst_3
		// @4F14: sipush -1850 (0xF8C6)
		// @4F17: iastore
		// @4F18: dup
		// @4F19: iconst_4
		// @4F1A: sipush 2220 (0x08AC)
		// @4F1D: iastore
		// @4F1E: dup
		// @4F1F: iconst_5
		// @4F20: sipush 7031 (0x1B77)
		// @4F23: iastore
		// @4F24: dup
		// @4F25: bipush 6 (0x06)
		// @4F27: sipush 3330 (0x0D02)
		// @4F2A: iastore
		// @4F2B: dup
		// @4F2C: bipush 7 (0x07)
		// @4F2E: sipush 2590 (0x0A1E)
		// @4F31: iastore
		// @4F32: dup
		// @4F33: bipush 8 (0x08)
		// @4F35: iconst_0
		// @4F36: iastore
		// @4F37: dup
		// @4F38: bipush 9 (0x09)
		// @4F3A: iconst_0
		// @4F3B: iastore
		// @4F3C: dup
		// @4F3D: bipush 10 (0x0A)
		// @4F3F: iconst_0
		// @4F40: iastore
		// @4F41: dup
		// @4F42: bipush 11 (0x0B)
		// @4F44: iconst_0
		// @4F45: iastore
		// @4F46: dup
		// @4F47: bipush 12 (0x0C)
		// @4F49: iconst_0
		// @4F4A: iastore
		// @4F4B: dup
		// @4F4C: bipush 13 (0x0D)
		// @4F4E: sipush -156 (0xFF64)
		// @4F51: iastore
		// @4F52: aastore
		// @4F53: aload_0
		// @4F54: bipush 10 (0x0A)
		// @4F56: bipush 14 (0x0E)
		// @4F58: newarray int[]
		// @4F5A: dup
		// @4F5B: iconst_0
		// @4F5C: sipush -7771 (0xE1A5)
		// @4F5F: iastore
		// @4F60: dup
		// @4F61: iconst_1
		// @4F62: iconst_0
		// @4F63: iastore
		// @4F64: dup
		// @4F65: iconst_2
		// @4F66: iconst_0
		// @4F67: iastore
		// @4F68: dup
		// @4F69: iconst_3
		// @4F6A: iconst_0
		// @4F6B: iastore
		// @4F6C: dup
		// @4F6D: iconst_4
		// @4F6E: iconst_0
		// @4F6F: iastore
		// @4F70: dup
		// @4F71: iconst_5
		// @4F72: sipush 1850 (0x073A)
		// @4F75: iastore
		// @4F76: dup
		// @4F77: bipush 6 (0x06)
		// @4F79: sipush 9991 (0x2707)
		// @4F7C: iastore
		// @4F7D: dup
		// @4F7E: bipush 7 (0x07)
		// @4F80: sipush 3700 (0x0E74)
		// @4F83: iastore
		// @4F84: dup
		// @4F85: bipush 8 (0x08)
		// @4F87: sipush 4070 (0x0FE6)
		// @4F8A: iastore
		// @4F8B: dup
		// @4F8C: bipush 9 (0x09)
		// @4F8E: iconst_0
		// @4F8F: iastore
		// @4F90: dup
		// @4F91: bipush 10 (0x0A)
		// @4F93: iconst_0
		// @4F94: iastore
		// @4F95: dup
		// @4F96: bipush 11 (0x0B)
		// @4F98: sipush 8141 (0x1FCD)
		// @4F9B: iastore
		// @4F9C: dup
		// @4F9D: bipush 12 (0x0C)
		// @4F9F: sipush 1145 (0x0479)
		// @4FA2: iastore
		// @4FA3: dup
		// @4FA4: bipush 13 (0x0D)
		// @4FA6: iconst_0
		// @4FA7: iastore
		// @4FA8: aastore
		// @4FA9: aload_0
		// @4FAA: bipush 15 (0x0F)
		// @4FAC: bipush 14 (0x0E)
		// @4FAE: newarray int[]
		// @4FB0: dup
		// @4FB1: iconst_0
		// @4FB2: sipush -2960 (0xF470)
		// @4FB5: iastore
		// @4FB6: dup
		// @4FB7: iconst_1
		// @4FB8: sipush 8511 (0x213F)
		// @4FBB: iastore
		// @4FBC: dup
		// @4FBD: iconst_2
		// @4FBE: sipush 4440 (0x1158)
		// @4FC1: iastore
		// @4FC2: dup
		// @4FC3: iconst_3
		// @4FC4: sipush 20723 (0x50F3)
		// @4FC7: iastore
		// @4FC8: dup
		// @4FC9: iconst_4
		// @4FCA: sipush 23684 (0x5C84)
		// @4FCD: iastore
		// @4FCE: dup
		// @4FCF: iconst_5
		// @4FD0: sipush -11842 (0xD1BE)
		// @4FD3: iastore
		// @4FD4: dup
		// @4FD5: bipush 6 (0x06)
		// @4FD7: sipush -7771 (0xE1A5)
		// @4FDA: iastore
		// @4FDB: dup
		// @4FDC: bipush 7 (0x07)
		// @4FDE: sipush -7771 (0xE1A5)
		// @4FE1: iastore
		// @4FE2: dup
		// @4FE3: bipush 8 (0x08)
		// @4FE5: sipush 4070 (0x0FE6)
		// @4FE8: iastore
		// @4FE9: dup
		// @4FEA: bipush 9 (0x09)
		// @4FEC: sipush 12212 (0x2FB4)
		// @4FEF: iastore
		// @4FF0: dup
		// @4FF1: bipush 10 (0x0A)
		// @4FF3: iconst_0
		// @4FF4: iastore
		// @4FF5: dup
		// @4FF6: bipush 11 (0x0B)
		// @4FF8: sipush -1850 (0xF8C6)
		// @4FFB: iastore
		// @4FFC: dup
		// @4FFD: bipush 12 (0x0C)
		// @4FFF: sipush -1510 (0xFA1A)
		// @5002: iastore
		// @5003: dup
		// @5004: bipush 13 (0x0D)
		// @5006: sipush 1093 (0x0445)
		// @5009: iastore
		// @500A: aastore
		// @500B: aload_0
		// @500C: bipush 6 (0x06)
		// @500E: bipush 14 (0x0E)
		// @5010: newarray int[]
		// @5012: dup
		// @5013: iconst_0
		// @5014: sipush 3700 (0x0E74)
		// @5017: iastore
		// @5018: dup
		// @5019: iconst_1
		// @501A: sipush 10361 (0x2879)
		// @501D: iastore
		// @501E: dup
		// @501F: iconst_2
		// @5020: sipush -1480 (0xFA38)
		// @5023: iastore
		// @5024: dup
		// @5025: iconst_3
		// @5026: sipush 9251 (0x2423)
		// @5029: iastore
		// @502A: dup
		// @502B: iconst_4
		// @502C: sipush 9251 (0x2423)
		// @502F: iastore
		// @5030: dup
		// @5031: iconst_5
		// @5032: sipush -2960 (0xF470)
		// @5035: iastore
		// @5036: dup
		// @5037: bipush 6 (0x06)
		// @5039: sipush 1110 (0x0456)
		// @503C: iastore
		// @503D: dup
		// @503E: bipush 7 (0x07)
		// @5040: sipush -2590 (0xF5E2)
		// @5043: iastore
		// @5044: dup
		// @5045: bipush 8 (0x08)
		// @5047: iconst_0
		// @5048: iastore
		// @5049: dup
		// @504A: bipush 9 (0x09)
		// @504C: iconst_0
		// @504D: iastore
		// @504E: dup
		// @504F: bipush 10 (0x0A)
		// @5051: iconst_0
		// @5052: iastore
		// @5053: dup
		// @5054: bipush 11 (0x0B)
		// @5056: sipush 2590 (0x0A1E)
		// @5059: iastore
		// @505A: dup
		// @505B: bipush 12 (0x0C)
		// @505D: sipush 364 (0x016C)
		// @5060: iastore
		// @5061: dup
		// @5062: bipush 13 (0x0D)
		// @5064: sipush -416 (0xFE60)
		// @5067: iastore
		// @5068: aastore
		// @5069: aload_0
		// @506A: bipush 17 (0x11)
		// @506C: bipush 14 (0x0E)
		// @506E: newarray int[]
		// @5070: dup
		// @5071: iconst_0
		// @5072: sipush -5921 (0xE8DF)
		// @5075: iastore
		// @5076: dup
		// @5077: iconst_1
		// @5078: iconst_0
		// @5079: iastore
		// @507A: dup
		// @507B: iconst_2
		// @507C: sipush -3330 (0xF2FE)
		// @507F: iastore
		// @5080: dup
		// @5081: iconst_3
		// @5082: sipush -7771 (0xE1A5)
		// @5085: iastore
		// @5086: dup
		// @5087: iconst_4
		// @5088: sipush -8141 (0xE033)
		// @508B: iastore
		// @508C: dup
		// @508D: iconst_5
		// @508E: sipush -2220 (0xF754)
		// @5091: iastore
		// @5092: dup
		// @5093: bipush 6 (0x06)
		// @5095: sipush 5550 (0x15AE)
		// @5098: iastore
		// @5099: dup
		// @509A: bipush 7 (0x07)
		// @509C: iconst_0
		// @509D: iastore
		// @509E: dup
		// @509F: bipush 8 (0x08)
		// @50A1: iconst_0
		// @50A2: iastore
		// @50A3: dup
		// @50A4: bipush 9 (0x09)
		// @50A6: iconst_0
		// @50A7: iastore
		// @50A8: dup
		// @50A9: bipush 10 (0x0A)
		// @50AB: iconst_0
		// @50AC: iastore
		// @50AD: dup
		// @50AE: bipush 11 (0x0B)
		// @50B0: sipush 3700 (0x0E74)
		// @50B3: iastore
		// @50B4: dup
		// @50B5: bipush 12 (0x0C)
		// @50B7: sipush 1197 (0x04AD)
		// @50BA: iastore
		// @50BB: dup
		// @50BC: bipush 13 (0x0D)
		// @50BE: sipush -364 (0xFE94)
		// @50C1: iastore
		// @50C2: aastore
		// @50C3: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @50C6: bipush 11 (0x0B)
		// @50C8: aaload
		// @50C9: astore_0
		// @50CA: aload_0
		// @50CB: iconst_2
		// @50CC: bipush 15 (0x0F)
		// @50CE: newarray int[]
		// @50D0: dup
		// @50D1: iconst_0
		// @50D2: sipush 3330 (0x0D02)
		// @50D5: iastore
		// @50D6: dup
		// @50D7: iconst_1
		// @50D8: sipush 2960 (0x0B90)
		// @50DB: iastore
		// @50DC: dup
		// @50DD: iconst_2
		// @50DE: sipush 1480 (0x05C8)
		// @50E1: iastore
		// @50E2: dup
		// @50E3: iconst_3
		// @50E4: iconst_0
		// @50E5: iastore
		// @50E6: dup
		// @50E7: iconst_4
		// @50E8: iconst_0
		// @50E9: iastore
		// @50EA: dup
		// @50EB: iconst_5
		// @50EC: sipush 1850 (0x073A)
		// @50EF: iastore
		// @50F0: dup
		// @50F1: bipush 6 (0x06)
		// @50F3: iconst_0
		// @50F4: iastore
		// @50F5: dup
		// @50F6: bipush 7 (0x07)
		// @50F8: iconst_0
		// @50F9: iastore
		// @50FA: dup
		// @50FB: bipush 8 (0x08)
		// @50FD: sipush -2220 (0xF754)
		// @5100: iastore
		// @5101: dup
		// @5102: bipush 9 (0x09)
		// @5104: sipush 8511 (0x213F)
		// @5107: iastore
		// @5108: dup
		// @5109: bipush 10 (0x0A)
		// @510B: sipush 740 (0x02E4)
		// @510E: iastore
		// @510F: dup
		// @5110: bipush 11 (0x0B)
		// @5112: sipush 7031 (0x1B77)
		// @5115: iastore
		// @5116: dup
		// @5117: bipush 12 (0x0C)
		// @5119: iconst_0
		// @511A: iastore
		// @511B: dup
		// @511C: bipush 13 (0x0D)
		// @511E: iconst_0
		// @511F: iastore
		// @5120: dup
		// @5121: bipush 14 (0x0E)
		// @5123: sipush -1354 (0xFAB6)
		// @5126: iastore
		// @5127: aastore
		// @5128: aload_0
		// @5129: bipush 11 (0x0B)
		// @512B: bipush 15 (0x0F)
		// @512D: newarray int[]
		// @512F: dup
		// @5130: iconst_0
		// @5131: sipush 5921 (0x1721)
		// @5134: iastore
		// @5135: dup
		// @5136: iconst_1
		// @5137: sipush 2590 (0x0A1E)
		// @513A: iastore
		// @513B: dup
		// @513C: iconst_2
		// @513D: sipush 3330 (0x0D02)
		// @5140: iastore
		// @5141: dup
		// @5142: iconst_3
		// @5143: sipush -9991 (0xD8F9)
		// @5146: iastore
		// @5147: dup
		// @5148: iconst_4
		// @5149: sipush -1480 (0xFA38)
		// @514C: iastore
		// @514D: dup
		// @514E: iconst_5
		// @514F: sipush 4070 (0x0FE6)
		// @5152: iastore
		// @5153: dup
		// @5154: bipush 6 (0x06)
		// @5156: iconst_0
		// @5157: iastore
		// @5158: dup
		// @5159: bipush 7 (0x07)
		// @515B: iconst_0
		// @515C: iastore
		// @515D: dup
		// @515E: bipush 8 (0x08)
		// @5160: iconst_0
		// @5161: iastore
		// @5162: dup
		// @5163: bipush 9 (0x09)
		// @5165: sipush 12952 (0x3298)
		// @5168: iastore
		// @5169: dup
		// @516A: bipush 10 (0x0A)
		// @516C: sipush 740 (0x02E4)
		// @516F: iastore
		// @5170: dup
		// @5171: bipush 11 (0x0B)
		// @5173: iconst_0
		// @5174: iastore
		// @5175: dup
		// @5176: bipush 12 (0x0C)
		// @5178: iconst_0
		// @5179: iastore
		// @517A: dup
		// @517B: bipush 13 (0x0D)
		// @517D: sipush 1145 (0x0479)
		// @5180: iastore
		// @5181: dup
		// @5182: bipush 14 (0x0E)
		// @5184: sipush -2187 (0xF775)
		// @5187: iastore
		// @5188: aastore
		// @5189: aload_0
		// @518A: bipush 13 (0x0D)
		// @518C: bipush 15 (0x0F)
		// @518E: newarray int[]
		// @5190: dup
		// @5191: iconst_0
		// @5192: sipush 5921 (0x1721)
		// @5195: iastore
		// @5196: dup
		// @5197: iconst_1
		// @5198: sipush 2590 (0x0A1E)
		// @519B: iastore
		// @519C: dup
		// @519D: iconst_2
		// @519E: sipush 3330 (0x0D02)
		// @51A1: iastore
		// @51A2: dup
		// @51A3: iconst_3
		// @51A4: sipush 2590 (0x0A1E)
		// @51A7: iastore
		// @51A8: dup
		// @51A9: iconst_4
		// @51AA: sipush 3700 (0x0E74)
		// @51AD: iastore
		// @51AE: dup
		// @51AF: iconst_5
		// @51B0: sipush 3700 (0x0E74)
		// @51B3: iastore
		// @51B4: dup
		// @51B5: bipush 6 (0x06)
		// @51B7: sipush 5180 (0x143C)
		// @51BA: iastore
		// @51BB: dup
		// @51BC: bipush 7 (0x07)
		// @51BE: iconst_0
		// @51BF: iastore
		// @51C0: dup
		// @51C1: bipush 8 (0x08)
		// @51C3: sipush -10361 (0xD787)
		// @51C6: iastore
		// @51C7: dup
		// @51C8: bipush 9 (0x09)
		// @51CA: sipush -3700 (0xF18C)
		// @51CD: iastore
		// @51CE: dup
		// @51CF: bipush 10 (0x0A)
		// @51D1: sipush 740 (0x02E4)
		// @51D4: iastore
		// @51D5: dup
		// @51D6: bipush 11 (0x0B)
		// @51D8: sipush 5921 (0x1721)
		// @51DB: iastore
		// @51DC: dup
		// @51DD: bipush 12 (0x0C)
		// @51DF: sipush 9251 (0x2423)
		// @51E2: iastore
		// @51E3: dup
		// @51E4: bipush 13 (0x0D)
		// @51E6: sipush -364 (0xFE94)
		// @51E9: iastore
		// @51EA: dup
		// @51EB: bipush 14 (0x0E)
		// @51ED: sipush 468 (0x01D4)
		// @51F0: iastore
		// @51F1: aastore
		// @51F2: aload_0
		// @51F3: bipush 16 (0x10)
		// @51F5: bipush 15 (0x0F)
		// @51F7: newarray int[]
		// @51F9: dup
		// @51FA: iconst_0
		// @51FB: sipush 4070 (0x0FE6)
		// @51FE: iastore
		// @51FF: dup
		// @5200: iconst_1
		// @5201: sipush 2590 (0x0A1E)
		// @5204: iastore
		// @5205: dup
		// @5206: iconst_2
		// @5207: sipush 3330 (0x0D02)
		// @520A: iastore
		// @520B: dup
		// @520C: iconst_3
		// @520D: sipush 2960 (0x0B90)
		// @5210: iastore
		// @5211: dup
		// @5212: iconst_4
		// @5213: sipush 10361 (0x2879)
		// @5216: iastore
		// @5217: dup
		// @5218: iconst_5
		// @5219: sipush 4070 (0x0FE6)
		// @521C: iastore
		// @521D: dup
		// @521E: bipush 6 (0x06)
		// @5220: sipush 15542 (0x3CB6)
		// @5223: iastore
		// @5224: dup
		// @5225: bipush 7 (0x07)
		// @5227: sipush 17763 (0x4563)
		// @522A: iastore
		// @522B: dup
		// @522C: bipush 8 (0x08)
		// @522E: sipush 740 (0x02E4)
		// @5231: iastore
		// @5232: dup
		// @5233: bipush 9 (0x09)
		// @5235: sipush -9251 (0xDBDD)
		// @5238: iastore
		// @5239: dup
		// @523A: bipush 10 (0x0A)
		// @523C: sipush -5180 (0xEBC4)
		// @523F: iastore
		// @5240: dup
		// @5241: bipush 11 (0x0B)
		// @5243: sipush -4810 (0xED36)
		// @5246: iastore
		// @5247: dup
		// @5248: bipush 12 (0x0C)
		// @524A: sipush -5550 (0xEA52)
		// @524D: iastore
		// @524E: dup
		// @524F: bipush 13 (0x0D)
		// @5251: sipush -572 (0xFDC4)
		// @5254: iastore
		// @5255: dup
		// @5256: bipush 14 (0x0E)
		// @5258: sipush -1666 (0xF97E)
		// @525B: iastore
		// @525C: aastore
		// @525D: aload_0
		// @525E: bipush 19 (0x13)
		// @5260: bipush 15 (0x0F)
		// @5262: newarray int[]
		// @5264: dup
		// @5265: iconst_0
		// @5266: sipush 4810 (0x12CA)
		// @5269: iastore
		// @526A: dup
		// @526B: iconst_1
		// @526C: sipush 2960 (0x0B90)
		// @526F: iastore
		// @5270: dup
		// @5271: iconst_2
		// @5272: sipush 1480 (0x05C8)
		// @5275: iastore
		// @5276: dup
		// @5277: iconst_3
		// @5278: sipush -2960 (0xF470)
		// @527B: iastore
		// @527C: dup
		// @527D: iconst_4
		// @527E: iconst_0
		// @527F: iastore
		// @5280: dup
		// @5281: iconst_5
		// @5282: sipush 1850 (0x073A)
		// @5285: iastore
		// @5286: dup
		// @5287: bipush 6 (0x06)
		// @5289: iconst_0
		// @528A: iastore
		// @528B: dup
		// @528C: bipush 7 (0x07)
		// @528E: sipush -8881 (0xDD4F)
		// @5291: iastore
		// @5292: dup
		// @5293: bipush 8 (0x08)
		// @5295: sipush -12952 (0xCD68)
		// @5298: iastore
		// @5299: dup
		// @529A: bipush 9 (0x09)
		// @529C: sipush -13322 (0xCBF6)
		// @529F: iastore
		// @52A0: dup
		// @52A1: bipush 10 (0x0A)
		// @52A3: sipush 1480 (0x05C8)
		// @52A6: iastore
		// @52A7: dup
		// @52A8: bipush 11 (0x0B)
		// @52AA: sipush -8511 (0xDEC1)
		// @52AD: iastore
		// @52AE: dup
		// @52AF: bipush 12 (0x0C)
		// @52B1: sipush -7031 (0xE489)
		// @52B4: iastore
		// @52B5: dup
		// @52B6: bipush 13 (0x0D)
		// @52B8: sipush -260 (0xFEFC)
		// @52BB: iastore
		// @52BC: dup
		// @52BD: bipush 14 (0x0E)
		// @52BF: sipush -1718 (0xF94A)
		// @52C2: iastore
		// @52C3: aastore
		// @52C4: aload_0
		// @52C5: bipush 24 (0x18)
		// @52C7: bipush 15 (0x0F)
		// @52C9: newarray int[]
		// @52CB: dup
		// @52CC: iconst_0
		// @52CD: sipush 6661 (0x1A05)
		// @52D0: iastore
		// @52D1: dup
		// @52D2: iconst_1
		// @52D3: sipush 2590 (0x0A1E)
		// @52D6: iastore
		// @52D7: dup
		// @52D8: iconst_2
		// @52D9: sipush 3330 (0x0D02)
		// @52DC: iastore
		// @52DD: dup
		// @52DE: iconst_3
		// @52DF: sipush -7401 (0xE317)
		// @52E2: iastore
		// @52E3: dup
		// @52E4: iconst_4
		// @52E5: sipush -6661 (0xE5FB)
		// @52E8: iastore
		// @52E9: dup
		// @52EA: iconst_5
		// @52EB: sipush 5180 (0x143C)
		// @52EE: iastore
		// @52EF: dup
		// @52F0: bipush 6 (0x06)
		// @52F2: sipush -8141 (0xE033)
		// @52F5: iastore
		// @52F6: dup
		// @52F7: bipush 7 (0x07)
		// @52F9: sipush -8141 (0xE033)
		// @52FC: iastore
		// @52FD: dup
		// @52FE: bipush 8 (0x08)
		// @5300: sipush 2590 (0x0A1E)
		// @5303: iastore
		// @5304: dup
		// @5305: bipush 9 (0x09)
		// @5307: sipush 4070 (0x0FE6)
		// @530A: iastore
		// @530B: dup
		// @530C: bipush 10 (0x0A)
		// @530E: sipush 5180 (0x143C)
		// @5311: iastore
		// @5312: dup
		// @5313: bipush 11 (0x0B)
		// @5315: sipush 4440 (0x1158)
		// @5318: iastore
		// @5319: dup
		// @531A: bipush 12 (0x0C)
		// @531C: sipush 8141 (0x1FCD)
		// @531F: iastore
		// @5320: dup
		// @5321: bipush 13 (0x0D)
		// @5323: sipush -781 (0xFCF3)
		// @5326: iastore
		// @5327: dup
		// @5328: bipush 14 (0x0E)
		// @532A: sipush -1927 (0xF879)
		// @532D: iastore
		// @532E: aastore
		// @532F: aload_0
		// @5330: bipush 15 (0x0F)
		// @5332: bipush 15 (0x0F)
		// @5334: newarray int[]
		// @5336: dup
		// @5337: iconst_0
		// @5338: sipush 3330 (0x0D02)
		// @533B: iastore
		// @533C: dup
		// @533D: iconst_1
		// @533E: sipush 2590 (0x0A1E)
		// @5341: iastore
		// @5342: dup
		// @5343: iconst_2
		// @5344: sipush 3330 (0x0D02)
		// @5347: iastore
		// @5348: dup
		// @5349: iconst_3
		// @534A: sipush -2960 (0xF470)
		// @534D: iastore
		// @534E: dup
		// @534F: iconst_4
		// @5350: sipush 1850 (0x073A)
		// @5353: iastore
		// @5354: dup
		// @5355: iconst_5
		// @5356: sipush 6291 (0x1893)
		// @5359: iastore
		// @535A: dup
		// @535B: bipush 6 (0x06)
		// @535D: sipush 11101 (0x2B5D)
		// @5360: iastore
		// @5361: dup
		// @5362: bipush 7 (0x07)
		// @5364: sipush 17763 (0x4563)
		// @5367: iastore
		// @5368: dup
		// @5369: bipush 8 (0x08)
		// @536B: sipush -7401 (0xE317)
		// @536E: iastore
		// @536F: dup
		// @5370: bipush 9 (0x09)
		// @5372: sipush -17763 (0xBA9D)
		// @5375: iastore
		// @5376: dup
		// @5377: bipush 10 (0x0A)
		// @5379: iconst_0
		// @537A: iastore
		// @537B: dup
		// @537C: bipush 11 (0x0B)
		// @537E: sipush -1850 (0xF8C6)
		// @5381: iastore
		// @5382: dup
		// @5383: bipush 12 (0x0C)
		// @5385: sipush -1110 (0xFBAA)
		// @5388: iastore
		// @5389: dup
		// @538A: bipush 13 (0x0D)
		// @538C: sipush -937 (0xFC57)
		// @538F: iastore
		// @5390: dup
		// @5391: bipush 14 (0x0E)
		// @5393: sipush -989 (0xFC23)
		// @5396: iastore
		// @5397: aastore
		// @5398: aload_0
		// @5399: bipush 10 (0x0A)
		// @539B: bipush 15 (0x0F)
		// @539D: newarray int[]
		// @539F: dup
		// @53A0: iconst_0
		// @53A1: sipush 2960 (0x0B90)
		// @53A4: iastore
		// @53A5: dup
		// @53A6: iconst_1
		// @53A7: sipush 2590 (0x0A1E)
		// @53AA: iastore
		// @53AB: dup
		// @53AC: iconst_2
		// @53AD: sipush 3330 (0x0D02)
		// @53B0: iastore
		// @53B1: dup
		// @53B2: iconst_3
		// @53B3: sipush -8141 (0xE033)
		// @53B6: iastore
		// @53B7: dup
		// @53B8: iconst_4
		// @53B9: sipush -1480 (0xFA38)
		// @53BC: iastore
		// @53BD: dup
		// @53BE: iconst_5
		// @53BF: sipush 4070 (0x0FE6)
		// @53C2: iastore
		// @53C3: dup
		// @53C4: bipush 6 (0x06)
		// @53C6: iconst_0
		// @53C7: iastore
		// @53C8: dup
		// @53C9: bipush 7 (0x07)
		// @53CB: iconst_0
		// @53CC: iastore
		// @53CD: dup
		// @53CE: bipush 8 (0x08)
		// @53D0: sipush -1850 (0xF8C6)
		// @53D3: iastore
		// @53D4: dup
		// @53D5: bipush 9 (0x09)
		// @53D7: sipush 7401 (0x1CE9)
		// @53DA: iastore
		// @53DB: dup
		// @53DC: bipush 10 (0x0A)
		// @53DE: sipush 740 (0x02E4)
		// @53E1: iastore
		// @53E2: dup
		// @53E3: bipush 11 (0x0B)
		// @53E5: iconst_0
		// @53E6: iastore
		// @53E7: dup
		// @53E8: bipush 12 (0x0C)
		// @53EA: iconst_0
		// @53EB: iastore
		// @53EC: dup
		// @53ED: bipush 13 (0x0D)
		// @53EF: sipush 1145 (0x0479)
		// @53F2: iastore
		// @53F3: dup
		// @53F4: bipush 14 (0x0E)
		// @53F6: sipush -1302 (0xFAEA)
		// @53F9: iastore
		// @53FA: aastore
		// @53FB: aload_0
		// @53FC: bipush 20 (0x14)
		// @53FE: bipush 15 (0x0F)
		// @5400: newarray int[]
		// @5402: dup
		// @5403: iconst_0
		// @5404: sipush 5180 (0x143C)
		// @5407: iastore
		// @5408: dup
		// @5409: iconst_1
		// @540A: sipush 2960 (0x0B90)
		// @540D: iastore
		// @540E: dup
		// @540F: iconst_2
		// @5410: sipush 1480 (0x05C8)
		// @5413: iastore
		// @5414: dup
		// @5415: iconst_3
		// @5416: iconst_0
		// @5417: iastore
		// @5418: dup
		// @5419: iconst_4
		// @541A: sipush 1110 (0x0456)
		// @541D: iastore
		// @541E: dup
		// @541F: iconst_5
		// @5420: sipush 3330 (0x0D02)
		// @5423: iastore
		// @5424: dup
		// @5425: bipush 6 (0x06)
		// @5427: sipush 1110 (0x0456)
		// @542A: iastore
		// @542B: dup
		// @542C: bipush 7 (0x07)
		// @542E: iconst_0
		// @542F: iastore
		// @5430: dup
		// @5431: bipush 8 (0x08)
		// @5433: sipush -8141 (0xE033)
		// @5436: iastore
		// @5437: dup
		// @5438: bipush 9 (0x09)
		// @543A: sipush -10731 (0xD615)
		// @543D: iastore
		// @543E: dup
		// @543F: bipush 10 (0x0A)
		// @5441: sipush -4070 (0xF01A)
		// @5444: iastore
		// @5445: dup
		// @5446: bipush 11 (0x0B)
		// @5448: sipush -7771 (0xE1A5)
		// @544B: iastore
		// @544C: dup
		// @544D: bipush 12 (0x0C)
		// @544F: sipush -7771 (0xE1A5)
		// @5452: iastore
		// @5453: dup
		// @5454: bipush 13 (0x0D)
		// @5456: sipush -520 (0xFDF8)
		// @5459: iastore
		// @545A: dup
		// @545B: bipush 14 (0x0E)
		// @545D: sipush -2083 (0xF7DD)
		// @5460: iastore
		// @5461: aastore
		// @5462: aload_0
		// @5463: bipush 12 (0x0C)
		// @5465: bipush 15 (0x0F)
		// @5467: newarray int[]
		// @5469: dup
		// @546A: iconst_0
		// @546B: sipush 5921 (0x1721)
		// @546E: iastore
		// @546F: dup
		// @5470: iconst_1
		// @5471: sipush 2590 (0x0A1E)
		// @5474: iastore
		// @5475: dup
		// @5476: iconst_2
		// @5477: sipush 3330 (0x0D02)
		// @547A: iastore
		// @547B: dup
		// @547C: iconst_3
		// @547D: sipush -3700 (0xF18C)
		// @5480: iastore
		// @5481: dup
		// @5482: iconst_4
		// @5483: sipush 1480 (0x05C8)
		// @5486: iastore
		// @5487: dup
		// @5488: iconst_5
		// @5489: sipush 4070 (0x0FE6)
		// @548C: iastore
		// @548D: dup
		// @548E: bipush 6 (0x06)
		// @5490: iconst_0
		// @5491: iastore
		// @5492: dup
		// @5493: bipush 7 (0x07)
		// @5495: iconst_0
		// @5496: iastore
		// @5497: dup
		// @5498: bipush 8 (0x08)
		// @549A: sipush -2960 (0xF470)
		// @549D: iastore
		// @549E: dup
		// @549F: bipush 9 (0x09)
		// @54A1: sipush 5550 (0x15AE)
		// @54A4: iastore
		// @54A5: dup
		// @54A6: bipush 10 (0x0A)
		// @54A8: sipush 740 (0x02E4)
		// @54AB: iastore
		// @54AC: dup
		// @54AD: bipush 11 (0x0B)
		// @54AF: iconst_0
		// @54B0: iastore
		// @54B1: dup
		// @54B2: bipush 12 (0x0C)
		// @54B4: iconst_0
		// @54B5: iastore
		// @54B6: dup
		// @54B7: bipush 13 (0x0D)
		// @54B9: sipush 312 (0x0138)
		// @54BC: iastore
		// @54BD: dup
		// @54BE: bipush 14 (0x0E)
		// @54C0: sipush -1406 (0xFA82)
		// @54C3: iastore
		// @54C4: aastore
		// @54C5: aload_0
		// @54C6: bipush 9 (0x09)
		// @54C8: bipush 15 (0x0F)
		// @54CA: newarray int[]
		// @54CC: dup
		// @54CD: iconst_0
		// @54CE: iconst_0
		// @54CF: iastore
		// @54D0: dup
		// @54D1: iconst_1
		// @54D2: sipush 2590 (0x0A1E)
		// @54D5: iastore
		// @54D6: dup
		// @54D7: iconst_2
		// @54D8: sipush 3330 (0x0D02)
		// @54DB: iastore
		// @54DC: dup
		// @54DD: iconst_3
		// @54DE: sipush -3330 (0xF2FE)
		// @54E1: iastore
		// @54E2: dup
		// @54E3: iconst_4
		// @54E4: sipush -4440 (0xEEA8)
		// @54E7: iastore
		// @54E8: dup
		// @54E9: iconst_5
		// @54EA: sipush 2220 (0x08AC)
		// @54ED: iastore
		// @54EE: dup
		// @54EF: bipush 6 (0x06)
		// @54F1: sipush -1480 (0xFA38)
		// @54F4: iastore
		// @54F5: dup
		// @54F6: bipush 7 (0x07)
		// @54F8: iconst_0
		// @54F9: iastore
		// @54FA: dup
		// @54FB: bipush 8 (0x08)
		// @54FD: sipush 1110 (0x0456)
		// @5500: iastore
		// @5501: dup
		// @5502: bipush 9 (0x09)
		// @5504: sipush 4070 (0x0FE6)
		// @5507: iastore
		// @5508: dup
		// @5509: bipush 10 (0x0A)
		// @550B: sipush 740 (0x02E4)
		// @550E: iastore
		// @550F: dup
		// @5510: bipush 11 (0x0B)
		// @5512: iconst_0
		// @5513: iastore
		// @5514: dup
		// @5515: bipush 12 (0x0C)
		// @5517: iconst_0
		// @5518: iastore
		// @5519: dup
		// @551A: bipush 13 (0x0D)
		// @551C: sipush 364 (0x016C)
		// @551F: iastore
		// @5520: dup
		// @5521: bipush 14 (0x0E)
		// @5523: sipush 156 (0x009C)
		// @5526: iastore
		// @5527: aastore
		// @5528: aload_0
		// @5529: bipush 17 (0x11)
		// @552B: bipush 15 (0x0F)
		// @552D: newarray int[]
		// @552F: dup
		// @5530: iconst_0
		// @5531: sipush 5550 (0x15AE)
		// @5534: iastore
		// @5535: dup
		// @5536: iconst_1
		// @5537: sipush 2960 (0x0B90)
		// @553A: iastore
		// @553B: dup
		// @553C: iconst_2
		// @553D: sipush 1480 (0x05C8)
		// @5540: iastore
		// @5541: dup
		// @5542: iconst_3
		// @5543: sipush -6291 (0xE76D)
		// @5546: iastore
		// @5547: dup
		// @5548: iconst_4
		// @5549: iconst_0
		// @554A: iastore
		// @554B: dup
		// @554C: iconst_5
		// @554D: iconst_0
		// @554E: iastore
		// @554F: dup
		// @5550: bipush 6 (0x06)
		// @5552: sipush -7771 (0xE1A5)
		// @5555: iastore
		// @5556: dup
		// @5557: bipush 7 (0x07)
		// @5559: sipush -8141 (0xE033)
		// @555C: iastore
		// @555D: dup
		// @555E: bipush 8 (0x08)
		// @5560: sipush 4070 (0x0FE6)
		// @5563: iastore
		// @5564: dup
		// @5565: bipush 9 (0x09)
		// @5567: sipush 14062 (0x36EE)
		// @556A: iastore
		// @556B: dup
		// @556C: bipush 10 (0x0A)
		// @556E: sipush 740 (0x02E4)
		// @5571: iastore
		// @5572: dup
		// @5573: bipush 11 (0x0B)
		// @5575: sipush 11471 (0x2CCF)
		// @5578: iastore
		// @5579: dup
		// @557A: bipush 12 (0x0C)
		// @557C: sipush 12212 (0x2FB4)
		// @557F: iastore
		// @5580: dup
		// @5581: bipush 13 (0x0D)
		// @5583: sipush -312 (0xFEC8)
		// @5586: iastore
		// @5587: dup
		// @5588: bipush 14 (0x0E)
		// @558A: sipush -1354 (0xFAB6)
		// @558D: iastore
		// @558E: aastore
		// @558F: aload_0
		// @5590: iconst_1
		// @5591: bipush 15 (0x0F)
		// @5593: newarray int[]
		// @5595: dup
		// @5596: iconst_0
		// @5597: sipush 2220 (0x08AC)
		// @559A: iastore
		// @559B: dup
		// @559C: iconst_1
		// @559D: sipush 2960 (0x0B90)
		// @55A0: iastore
		// @55A1: dup
		// @55A2: iconst_2
		// @55A3: sipush 1480 (0x05C8)
		// @55A6: iastore
		// @55A7: dup
		// @55A8: iconst_3
		// @55A9: sipush -6291 (0xE76D)
		// @55AC: iastore
		// @55AD: dup
		// @55AE: iconst_4
		// @55AF: iconst_0
		// @55B0: iastore
		// @55B1: dup
		// @55B2: iconst_5
		// @55B3: sipush 1110 (0x0456)
		// @55B6: iastore
		// @55B7: dup
		// @55B8: bipush 6 (0x06)
		// @55BA: sipush 1110 (0x0456)
		// @55BD: iastore
		// @55BE: dup
		// @55BF: bipush 7 (0x07)
		// @55C1: sipush -740 (0xFD1C)
		// @55C4: iastore
		// @55C5: dup
		// @55C6: bipush 8 (0x08)
		// @55C8: sipush 4070 (0x0FE6)
		// @55CB: iastore
		// @55CC: dup
		// @55CD: bipush 9 (0x09)
		// @55CF: sipush 14062 (0x36EE)
		// @55D2: iastore
		// @55D3: dup
		// @55D4: bipush 10 (0x0A)
		// @55D6: sipush 740 (0x02E4)
		// @55D9: iastore
		// @55DA: dup
		// @55DB: bipush 11 (0x0B)
		// @55DD: sipush 11471 (0x2CCF)
		// @55E0: iastore
		// @55E1: dup
		// @55E2: bipush 12 (0x0C)
		// @55E4: sipush 12212 (0x2FB4)
		// @55E7: iastore
		// @55E8: dup
		// @55E9: bipush 13 (0x0D)
		// @55EB: sipush 781 (0x030D)
		// @55EE: iastore
		// @55EF: dup
		// @55F0: bipush 14 (0x0E)
		// @55F2: sipush -364 (0xFE94)
		// @55F5: iastore
		// @55F6: aastore
		// @55F7: aload_0
		// @55F8: bipush 6 (0x06)
		// @55FA: bipush 15 (0x0F)
		// @55FC: newarray int[]
		// @55FE: dup
		// @55FF: iconst_0
		// @5600: sipush 3330 (0x0D02)
		// @5603: iastore
		// @5604: dup
		// @5605: iconst_1
		// @5606: sipush 2960 (0x0B90)
		// @5609: iastore
		// @560A: dup
		// @560B: iconst_2
		// @560C: sipush 1480 (0x05C8)
		// @560F: iastore
		// @5610: dup
		// @5611: iconst_3
		// @5612: sipush -4070 (0xF01A)
		// @5615: iastore
		// @5616: dup
		// @5617: iconst_4
		// @5618: sipush 5180 (0x143C)
		// @561B: iastore
		// @561C: dup
		// @561D: iconst_5
		// @561E: sipush 8141 (0x1FCD)
		// @5621: iastore
		// @5622: dup
		// @5623: bipush 6 (0x06)
		// @5625: sipush 5921 (0x1721)
		// @5628: iastore
		// @5629: dup
		// @562A: bipush 7 (0x07)
		// @562C: sipush 9251 (0x2423)
		// @562F: iastore
		// @5630: dup
		// @5631: bipush 8 (0x08)
		// @5633: sipush -4070 (0xF01A)
		// @5636: iastore
		// @5637: dup
		// @5638: bipush 9 (0x09)
		// @563A: sipush -5180 (0xEBC4)
		// @563D: iastore
		// @563E: dup
		// @563F: bipush 10 (0x0A)
		// @5641: sipush -6661 (0xE5FB)
		// @5644: iastore
		// @5645: dup
		// @5646: bipush 11 (0x0B)
		// @5648: sipush -740 (0xFD1C)
		// @564B: iastore
		// @564C: dup
		// @564D: bipush 12 (0x0C)
		// @564F: iconst_0
		// @5650: iastore
		// @5651: dup
		// @5652: bipush 13 (0x0D)
		// @5654: sipush 364 (0x016C)
		// @5657: iastore
		// @5658: dup
		// @5659: bipush 14 (0x0E)
		// @565B: sipush -2500 (0xF63C)
		// @565E: iastore
		// @565F: aastore
		// @5660: aload_0
		// @5661: iconst_5
		// @5662: bipush 15 (0x0F)
		// @5664: newarray int[]
		// @5666: dup
		// @5667: iconst_0
		// @5668: sipush 3330 (0x0D02)
		// @566B: iastore
		// @566C: dup
		// @566D: iconst_1
		// @566E: sipush 2960 (0x0B90)
		// @5671: iastore
		// @5672: dup
		// @5673: iconst_2
		// @5674: sipush 1480 (0x05C8)
		// @5677: iastore
		// @5678: dup
		// @5679: iconst_3
		// @567A: sipush 12212 (0x2FB4)
		// @567D: iastore
		// @567E: dup
		// @567F: iconst_4
		// @5680: sipush 9621 (0x2595)
		// @5683: iastore
		// @5684: dup
		// @5685: iconst_5
		// @5686: sipush 5550 (0x15AE)
		// @5689: iastore
		// @568A: dup
		// @568B: bipush 6 (0x06)
		// @568D: sipush 7031 (0x1B77)
		// @5690: iastore
		// @5691: dup
		// @5692: bipush 7 (0x07)
		// @5694: iconst_0
		// @5695: iastore
		// @5696: dup
		// @5697: bipush 8 (0x08)
		// @5699: sipush -7401 (0xE317)
		// @569C: iastore
		// @569D: dup
		// @569E: bipush 9 (0x09)
		// @56A0: sipush -5180 (0xEBC4)
		// @56A3: iastore
		// @56A4: dup
		// @56A5: bipush 10 (0x0A)
		// @56A7: sipush -6661 (0xE5FB)
		// @56AA: iastore
		// @56AB: dup
		// @56AC: bipush 11 (0x0B)
		// @56AE: sipush -740 (0xFD1C)
		// @56B1: iastore
		// @56B2: dup
		// @56B3: bipush 12 (0x0C)
		// @56B5: iconst_0
		// @56B6: iastore
		// @56B7: dup
		// @56B8: bipush 13 (0x0D)
		// @56BA: sipush 885 (0x0375)
		// @56BD: iastore
		// @56BE: dup
		// @56BF: bipush 14 (0x0E)
		// @56C1: sipush -1666 (0xF97E)
		// @56C4: iastore
		// @56C5: aastore
		// @56C6: aload_0
		// @56C7: bipush 18 (0x12)
		// @56C9: bipush 15 (0x0F)
		// @56CB: newarray int[]
		// @56CD: dup
		// @56CE: iconst_0
		// @56CF: sipush 4440 (0x1158)
		// @56D2: iastore
		// @56D3: dup
		// @56D4: iconst_1
		// @56D5: sipush 2960 (0x0B90)
		// @56D8: iastore
		// @56D9: dup
		// @56DA: iconst_2
		// @56DB: sipush 1480 (0x05C8)
		// @56DE: iastore
		// @56DF: dup
		// @56E0: iconst_3
		// @56E1: iconst_0
		// @56E2: iastore
		// @56E3: dup
		// @56E4: iconst_4
		// @56E5: iconst_0
		// @56E6: iastore
		// @56E7: dup
		// @56E8: iconst_5
		// @56E9: sipush 1850 (0x073A)
		// @56EC: iastore
		// @56ED: dup
		// @56EE: bipush 6 (0x06)
		// @56F0: sipush -7771 (0xE1A5)
		// @56F3: iastore
		// @56F4: dup
		// @56F5: bipush 7 (0x07)
		// @56F7: sipush -7771 (0xE1A5)
		// @56FA: iastore
		// @56FB: dup
		// @56FC: bipush 8 (0x08)
		// @56FE: sipush -2220 (0xF754)
		// @5701: iastore
		// @5702: dup
		// @5703: bipush 9 (0x09)
		// @5705: sipush 8511 (0x213F)
		// @5708: iastore
		// @5709: dup
		// @570A: bipush 10 (0x0A)
		// @570C: sipush 740 (0x02E4)
		// @570F: iastore
		// @5710: dup
		// @5711: bipush 11 (0x0B)
		// @5713: sipush 7031 (0x1B77)
		// @5716: iastore
		// @5717: dup
		// @5718: bipush 12 (0x0C)
		// @571A: iconst_0
		// @571B: iastore
		// @571C: dup
		// @571D: bipush 13 (0x0D)
		// @571F: sipush -520 (0xFDF8)
		// @5722: iastore
		// @5723: dup
		// @5724: bipush 14 (0x0E)
		// @5726: sipush -416 (0xFE60)
		// @5729: iastore
		// @572A: aastore
		// @572B: aload_0
		// @572C: iconst_3
		// @572D: bipush 15 (0x0F)
		// @572F: newarray int[]
		// @5731: dup
		// @5732: iconst_0
		// @5733: sipush 3700 (0x0E74)
		// @5736: iastore
		// @5737: dup
		// @5738: iconst_1
		// @5739: sipush 2960 (0x0B90)
		// @573C: iastore
		// @573D: dup
		// @573E: iconst_2
		// @573F: sipush 1480 (0x05C8)
		// @5742: iastore
		// @5743: dup
		// @5744: iconst_3
		// @5745: sipush 1850 (0x073A)
		// @5748: iastore
		// @5749: dup
		// @574A: iconst_4
		// @574B: sipush 2220 (0x08AC)
		// @574E: iastore
		// @574F: dup
		// @5750: iconst_5
		// @5751: sipush 1850 (0x073A)
		// @5754: iastore
		// @5755: dup
		// @5756: bipush 6 (0x06)
		// @5758: iconst_0
		// @5759: iastore
		// @575A: dup
		// @575B: bipush 7 (0x07)
		// @575D: sipush 1110 (0x0456)
		// @5760: iastore
		// @5761: dup
		// @5762: bipush 8 (0x08)
		// @5764: sipush -7401 (0xE317)
		// @5767: iastore
		// @5768: dup
		// @5769: bipush 9 (0x09)
		// @576B: sipush -2220 (0xF754)
		// @576E: iastore
		// @576F: dup
		// @5770: bipush 10 (0x0A)
		// @5772: sipush 1480 (0x05C8)
		// @5775: iastore
		// @5776: dup
		// @5777: bipush 11 (0x0B)
		// @5779: sipush 1110 (0x0456)
		// @577C: iastore
		// @577D: dup
		// @577E: bipush 12 (0x0C)
		// @5780: sipush 7031 (0x1B77)
		// @5783: iastore
		// @5784: dup
		// @5785: bipush 13 (0x0D)
		// @5787: iconst_0
		// @5788: iastore
		// @5789: dup
		// @578A: bipush 14 (0x0E)
		// @578C: sipush -2500 (0xF63C)
		// @578F: iastore
		// @5790: aastore
		// @5791: aload_0
		// @5792: bipush 22 (0x16)
		// @5794: bipush 15 (0x0F)
		// @5796: newarray int[]
		// @5798: dup
		// @5799: iconst_0
		// @579A: sipush 4440 (0x1158)
		// @579D: iastore
		// @579E: dup
		// @579F: iconst_1
		// @57A0: sipush 2960 (0x0B90)
		// @57A3: iastore
		// @57A4: dup
		// @57A5: iconst_2
		// @57A6: sipush 1480 (0x05C8)
		// @57A9: iastore
		// @57AA: dup
		// @57AB: iconst_3
		// @57AC: sipush -5921 (0xE8DF)
		// @57AF: iastore
		// @57B0: dup
		// @57B1: iconst_4
		// @57B2: sipush 5180 (0x143C)
		// @57B5: iastore
		// @57B6: dup
		// @57B7: iconst_5
		// @57B8: sipush 8141 (0x1FCD)
		// @57BB: iastore
		// @57BC: dup
		// @57BD: bipush 6 (0x06)
		// @57BF: sipush 5921 (0x1721)
		// @57C2: iastore
		// @57C3: dup
		// @57C4: bipush 7 (0x07)
		// @57C6: sipush 9251 (0x2423)
		// @57C9: iastore
		// @57CA: dup
		// @57CB: bipush 8 (0x08)
		// @57CD: sipush -4070 (0xF01A)
		// @57D0: iastore
		// @57D1: dup
		// @57D2: bipush 9 (0x09)
		// @57D4: sipush -5180 (0xEBC4)
		// @57D7: iastore
		// @57D8: dup
		// @57D9: bipush 10 (0x0A)
		// @57DB: sipush -6661 (0xE5FB)
		// @57DE: iastore
		// @57DF: dup
		// @57E0: bipush 11 (0x0B)
		// @57E2: sipush -7771 (0xE1A5)
		// @57E5: iastore
		// @57E6: dup
		// @57E7: bipush 12 (0x0C)
		// @57E9: sipush -8141 (0xE033)
		// @57EC: iastore
		// @57ED: dup
		// @57EE: bipush 13 (0x0D)
		// @57F0: bipush -104 (0x98)
		// @57F2: iastore
		// @57F3: dup
		// @57F4: bipush 14 (0x0E)
		// @57F6: sipush -1770 (0xF916)
		// @57F9: iastore
		// @57FA: aastore
		// @57FB: aload_0
		// @57FC: bipush 23 (0x17)
		// @57FE: bipush 15 (0x0F)
		// @5800: newarray int[]
		// @5802: dup
		// @5803: iconst_0
		// @5804: sipush 5180 (0x143C)
		// @5807: iastore
		// @5808: dup
		// @5809: iconst_1
		// @580A: sipush 1850 (0x073A)
		// @580D: iastore
		// @580E: dup
		// @580F: iconst_2
		// @5810: sipush 1480 (0x05C8)
		// @5813: iastore
		// @5814: dup
		// @5815: iconst_3
		// @5816: sipush -12212 (0xD04C)
		// @5819: iastore
		// @581A: dup
		// @581B: iconst_4
		// @581C: sipush -7031 (0xE489)
		// @581F: iastore
		// @5820: dup
		// @5821: iconst_5
		// @5822: sipush 5180 (0x143C)
		// @5825: iastore
		// @5826: dup
		// @5827: bipush 6 (0x06)
		// @5829: sipush -5180 (0xEBC4)
		// @582C: iastore
		// @582D: dup
		// @582E: bipush 7 (0x07)
		// @5830: sipush -7401 (0xE317)
		// @5833: iastore
		// @5834: dup
		// @5835: bipush 8 (0x08)
		// @5837: sipush 3330 (0x0D02)
		// @583A: iastore
		// @583B: dup
		// @583C: bipush 9 (0x09)
		// @583E: sipush -3330 (0xF2FE)
		// @5841: iastore
		// @5842: dup
		// @5843: bipush 10 (0x0A)
		// @5845: sipush -2960 (0xF470)
		// @5848: iastore
		// @5849: dup
		// @584A: bipush 11 (0x0B)
		// @584C: sipush -1850 (0xF8C6)
		// @584F: iastore
		// @5850: dup
		// @5851: bipush 12 (0x0C)
		// @5853: sipush -7401 (0xE317)
		// @5856: iastore
		// @5857: dup
		// @5858: bipush 13 (0x0D)
		// @585A: sipush -781 (0xFCF3)
		// @585D: iastore
		// @585E: dup
		// @585F: bipush 14 (0x0E)
		// @5861: sipush -1354 (0xFAB6)
		// @5864: iastore
		// @5865: aastore
		// @5866: aload_0
		// @5867: bipush 14 (0x0E)
		// @5869: bipush 15 (0x0F)
		// @586B: newarray int[]
		// @586D: dup
		// @586E: iconst_0
		// @586F: sipush 5921 (0x1721)
		// @5872: iastore
		// @5873: dup
		// @5874: iconst_1
		// @5875: sipush 2590 (0x0A1E)
		// @5878: iastore
		// @5879: dup
		// @587A: iconst_2
		// @587B: sipush 3330 (0x0D02)
		// @587E: iastore
		// @587F: dup
		// @5880: iconst_3
		// @5881: sipush 8511 (0x213F)
		// @5884: iastore
		// @5885: dup
		// @5886: iconst_4
		// @5887: iconst_0
		// @5888: iastore
		// @5889: dup
		// @588A: iconst_5
		// @588B: sipush 7401 (0x1CE9)
		// @588E: iastore
		// @588F: dup
		// @5890: bipush 6 (0x06)
		// @5892: sipush 9621 (0x2595)
		// @5895: iastore
		// @5896: dup
		// @5897: bipush 7 (0x07)
		// @5899: sipush 12582 (0x3126)
		// @589C: iastore
		// @589D: dup
		// @589E: bipush 8 (0x08)
		// @58A0: sipush -11842 (0xD1BE)
		// @58A3: iastore
		// @58A4: dup
		// @58A5: bipush 9 (0x09)
		// @58A7: sipush -9621 (0xDA6B)
		// @58AA: iastore
		// @58AB: dup
		// @58AC: bipush 10 (0x0A)
		// @58AE: iconst_0
		// @58AF: iastore
		// @58B0: dup
		// @58B1: bipush 11 (0x0B)
		// @58B3: sipush 2960 (0x0B90)
		// @58B6: iastore
		// @58B7: dup
		// @58B8: bipush 12 (0x0C)
		// @58BA: sipush 12952 (0x3298)
		// @58BD: iastore
		// @58BE: dup
		// @58BF: bipush 13 (0x0D)
		// @58C1: sipush -2291 (0xF70D)
		// @58C4: iastore
		// @58C5: dup
		// @58C6: bipush 14 (0x0E)
		// @58C8: sipush -1822 (0xF8E2)
		// @58CB: iastore
		// @58CC: aastore
		// @58CD: aload_0
		// @58CE: bipush 8 (0x08)
		// @58D0: bipush 15 (0x0F)
		// @58D2: newarray int[]
		// @58D4: dup
		// @58D5: iconst_0
		// @58D6: sipush 4070 (0x0FE6)
		// @58D9: iastore
		// @58DA: dup
		// @58DB: iconst_1
		// @58DC: sipush 2590 (0x0A1E)
		// @58DF: iastore
		// @58E0: dup
		// @58E1: iconst_2
		// @58E2: sipush 3330 (0x0D02)
		// @58E5: iastore
		// @58E6: dup
		// @58E7: iconst_3
		// @58E8: sipush -7401 (0xE317)
		// @58EB: iastore
		// @58EC: dup
		// @58ED: iconst_4
		// @58EE: sipush -8511 (0xDEC1)
		// @58F1: iastore
		// @58F2: dup
		// @58F3: iconst_5
		// @58F4: sipush 2220 (0x08AC)
		// @58F7: iastore
		// @58F8: dup
		// @58F9: bipush 6 (0x06)
		// @58FB: sipush -5180 (0xEBC4)
		// @58FE: iastore
		// @58FF: dup
		// @5900: bipush 7 (0x07)
		// @5902: sipush -10731 (0xD615)
		// @5905: iastore
		// @5906: dup
		// @5907: bipush 8 (0x08)
		// @5909: sipush 5180 (0x143C)
		// @590C: iastore
		// @590D: dup
		// @590E: bipush 9 (0x09)
		// @5910: sipush 9991 (0x2707)
		// @5913: iastore
		// @5914: dup
		// @5915: bipush 10 (0x0A)
		// @5917: sipush 5180 (0x143C)
		// @591A: iastore
		// @591B: dup
		// @591C: bipush 11 (0x0B)
		// @591E: sipush 8881 (0x22B1)
		// @5921: iastore
		// @5922: dup
		// @5923: bipush 12 (0x0C)
		// @5925: sipush 8141 (0x1FCD)
		// @5928: iastore
		// @5929: dup
		// @592A: bipush 13 (0x0D)
		// @592C: sipush 364 (0x016C)
		// @592F: iastore
		// @5930: dup
		// @5931: bipush 14 (0x0E)
		// @5933: sipush -1927 (0xF879)
		// @5936: iastore
		// @5937: aastore
		// @5938: aload_0
		// @5939: iconst_0
		// @593A: bipush 15 (0x0F)
		// @593C: newarray int[]
		// @593E: dup
		// @593F: iconst_0
		// @5940: iconst_0
		// @5941: iastore
		// @5942: dup
		// @5943: iconst_1
		// @5944: sipush 2590 (0x0A1E)
		// @5947: iastore
		// @5948: dup
		// @5949: iconst_2
		// @594A: sipush 3330 (0x0D02)
		// @594D: iastore
		// @594E: dup
		// @594F: iconst_3
		// @5950: sipush -3330 (0xF2FE)
		// @5953: iastore
		// @5954: dup
		// @5955: iconst_4
		// @5956: sipush -4440 (0xEEA8)
		// @5959: iastore
		// @595A: dup
		// @595B: iconst_5
		// @595C: sipush 2220 (0x08AC)
		// @595F: iastore
		// @5960: dup
		// @5961: bipush 6 (0x06)
		// @5963: sipush -1480 (0xFA38)
		// @5966: iastore
		// @5967: dup
		// @5968: bipush 7 (0x07)
		// @596A: iconst_0
		// @596B: iastore
		// @596C: dup
		// @596D: bipush 8 (0x08)
		// @596F: sipush 1110 (0x0456)
		// @5972: iastore
		// @5973: dup
		// @5974: bipush 9 (0x09)
		// @5976: sipush 4070 (0x0FE6)
		// @5979: iastore
		// @597A: dup
		// @597B: bipush 10 (0x0A)
		// @597D: sipush 740 (0x02E4)
		// @5980: iastore
		// @5981: dup
		// @5982: bipush 11 (0x0B)
		// @5984: iconst_0
		// @5985: iastore
		// @5986: dup
		// @5987: bipush 12 (0x0C)
		// @5989: iconst_0
		// @598A: iastore
		// @598B: dup
		// @598C: bipush 13 (0x0D)
		// @598E: sipush 364 (0x016C)
		// @5991: iastore
		// @5992: dup
		// @5993: bipush 14 (0x0E)
		// @5995: sipush 156 (0x009C)
		// @5998: iastore
		// @5999: aastore
		// @599A: aload_0
		// @599B: bipush 25 (0x19)
		// @599D: bipush 8 (0x08)
		// @599F: newarray int[]
		// @59A1: dup
		// @59A2: iconst_0
		// @59A3: bipush 43 (0x2B)
		// @59A5: iastore
		// @59A6: dup
		// @59A7: iconst_1
		// @59A8: iconst_4
		// @59A9: iastore
		// @59AA: dup
		// @59AB: iconst_2
		// @59AC: bipush 90 (0x5A)
		// @59AE: iastore
		// @59AF: dup
		// @59B0: iconst_3
		// @59B1: bipush 8 (0x08)
		// @59B3: iastore
		// @59B4: dup
		// @59B5: iconst_4
		// @59B6: iconst_5
		// @59B7: iastore
		// @59B8: dup
		// @59B9: iconst_5
		// @59BA: bipush 12 (0x0C)
		// @59BC: iastore
		// @59BD: dup
		// @59BE: bipush 6 (0x06)
		// @59C0: iconst_4
		// @59C1: iastore
		// @59C2: dup
		// @59C3: bipush 7 (0x07)
		// @59C5: bipush 8 (0x08)
		// @59C7: iastore
		// @59C8: aastore
		// @59C9: aload_0
		// @59CA: bipush 7 (0x07)
		// @59CC: bipush 15 (0x0F)
		// @59CE: newarray int[]
		// @59D0: dup
		// @59D1: iconst_0
		// @59D2: sipush 3330 (0x0D02)
		// @59D5: iastore
		// @59D6: dup
		// @59D7: iconst_1
		// @59D8: sipush 1850 (0x073A)
		// @59DB: iastore
		// @59DC: dup
		// @59DD: iconst_2
		// @59DE: sipush 1480 (0x05C8)
		// @59E1: iastore
		// @59E2: dup
		// @59E3: iconst_3
		// @59E4: sipush -8511 (0xDEC1)
		// @59E7: iastore
		// @59E8: dup
		// @59E9: iconst_4
		// @59EA: sipush -3700 (0xF18C)
		// @59ED: iastore
		// @59EE: dup
		// @59EF: iconst_5
		// @59F0: sipush 5180 (0x143C)
		// @59F3: iastore
		// @59F4: dup
		// @59F5: bipush 6 (0x06)
		// @59F7: sipush -740 (0xFD1C)
		// @59FA: iastore
		// @59FB: dup
		// @59FC: bipush 7 (0x07)
		// @59FE: sipush -1850 (0xF8C6)
		// @5A01: iastore
		// @5A02: dup
		// @5A03: bipush 8 (0x08)
		// @5A05: sipush 3330 (0x0D02)
		// @5A08: iastore
		// @5A09: dup
		// @5A0A: bipush 9 (0x09)
		// @5A0C: sipush 4810 (0x12CA)
		// @5A0F: iastore
		// @5A10: dup
		// @5A11: bipush 10 (0x0A)
		// @5A13: sipush -2960 (0xF470)
		// @5A16: iastore
		// @5A17: dup
		// @5A18: bipush 11 (0x0B)
		// @5A1A: sipush -740 (0xFD1C)
		// @5A1D: iastore
		// @5A1E: dup
		// @5A1F: bipush 12 (0x0C)
		// @5A21: iconst_0
		// @5A22: iastore
		// @5A23: dup
		// @5A24: bipush 13 (0x0D)
		// @5A26: sipush 312 (0x0138)
		// @5A29: iastore
		// @5A2A: dup
		// @5A2B: bipush 14 (0x0E)
		// @5A2D: sipush -1927 (0xF879)
		// @5A30: iastore
		// @5A31: aastore
		// @5A32: aload_0
		// @5A33: bipush 21 (0x15)
		// @5A35: bipush 15 (0x0F)
		// @5A37: newarray int[]
		// @5A39: dup
		// @5A3A: iconst_0
		// @5A3B: sipush 4070 (0x0FE6)
		// @5A3E: iastore
		// @5A3F: dup
		// @5A40: iconst_1
		// @5A41: sipush 2960 (0x0B90)
		// @5A44: iastore
		// @5A45: dup
		// @5A46: iconst_2
		// @5A47: sipush 1480 (0x05C8)
		// @5A4A: iastore
		// @5A4B: dup
		// @5A4C: iconst_3
		// @5A4D: sipush -740 (0xFD1C)
		// @5A50: iastore
		// @5A51: dup
		// @5A52: iconst_4
		// @5A53: sipush 9621 (0x2595)
		// @5A56: iastore
		// @5A57: dup
		// @5A58: iconst_5
		// @5A59: sipush 5550 (0x15AE)
		// @5A5C: iastore
		// @5A5D: dup
		// @5A5E: bipush 6 (0x06)
		// @5A60: sipush 7031 (0x1B77)
		// @5A63: iastore
		// @5A64: dup
		// @5A65: bipush 7 (0x07)
		// @5A67: iconst_0
		// @5A68: iastore
		// @5A69: dup
		// @5A6A: bipush 8 (0x08)
		// @5A6C: sipush -7401 (0xE317)
		// @5A6F: iastore
		// @5A70: dup
		// @5A71: bipush 9 (0x09)
		// @5A73: sipush -5180 (0xEBC4)
		// @5A76: iastore
		// @5A77: dup
		// @5A78: bipush 10 (0x0A)
		// @5A7A: sipush -6661 (0xE5FB)
		// @5A7D: iastore
		// @5A7E: dup
		// @5A7F: bipush 11 (0x0B)
		// @5A81: sipush -7771 (0xE1A5)
		// @5A84: iastore
		// @5A85: dup
		// @5A86: bipush 12 (0x0C)
		// @5A88: sipush -7031 (0xE489)
		// @5A8B: iastore
		// @5A8C: dup
		// @5A8D: bipush 13 (0x0D)
		// @5A8F: bipush -104 (0x98)
		// @5A91: iastore
		// @5A92: dup
		// @5A93: bipush 14 (0x0E)
		// @5A95: sipush -1458 (0xFA4E)
		// @5A98: iastore
		// @5A99: aastore
		// @5A9A: aload_0
		// @5A9B: iconst_4
		// @5A9C: bipush 15 (0x0F)
		// @5A9E: newarray int[]
		// @5AA0: dup
		// @5AA1: iconst_0
		// @5AA2: sipush 3330 (0x0D02)
		// @5AA5: iastore
		// @5AA6: dup
		// @5AA7: iconst_1
		// @5AA8: sipush 2960 (0x0B90)
		// @5AAB: iastore
		// @5AAC: dup
		// @5AAD: iconst_2
		// @5AAE: sipush 1480 (0x05C8)
		// @5AB1: iastore
		// @5AB2: dup
		// @5AB3: iconst_3
		// @5AB4: sipush 8141 (0x1FCD)
		// @5AB7: iastore
		// @5AB8: dup
		// @5AB9: iconst_4
		// @5ABA: sipush 5180 (0x143C)
		// @5ABD: iastore
		// @5ABE: dup
		// @5ABF: iconst_5
		// @5AC0: sipush 3330 (0x0D02)
		// @5AC3: iastore
		// @5AC4: dup
		// @5AC5: bipush 6 (0x06)
		// @5AC7: sipush 1480 (0x05C8)
		// @5ACA: iastore
		// @5ACB: dup
		// @5ACC: bipush 7 (0x07)
		// @5ACE: iconst_0
		// @5ACF: iastore
		// @5AD0: dup
		// @5AD1: bipush 8 (0x08)
		// @5AD3: sipush -8141 (0xE033)
		// @5AD6: iastore
		// @5AD7: dup
		// @5AD8: bipush 9 (0x09)
		// @5ADA: sipush -10731 (0xD615)
		// @5ADD: iastore
		// @5ADE: dup
		// @5ADF: bipush 10 (0x0A)
		// @5AE1: sipush -4070 (0xF01A)
		// @5AE4: iastore
		// @5AE5: dup
		// @5AE6: bipush 11 (0x0B)
		// @5AE8: sipush -5550 (0xEA52)
		// @5AEB: iastore
		// @5AEC: dup
		// @5AED: bipush 12 (0x0C)
		// @5AEF: sipush -8881 (0xDD4F)
		// @5AF2: iastore
		// @5AF3: dup
		// @5AF4: bipush 13 (0x0D)
		// @5AF6: sipush 260 (0x0104)
		// @5AF9: iastore
		// @5AFA: dup
		// @5AFB: bipush 14 (0x0E)
		// @5AFD: sipush -2343 (0xF6D9)
		// @5B00: iastore
		// @5B01: aastore
		// @5B02: ldc "'l\u001f3\u0004\u0014e\u001b%\u0004\u001be\u0005`W\u0007e\u00044A\u0017*"
		// @5B04: invokestatic game.C_100165_sh.func_100768_z(java.lang.String)char[]
		// @5B07: invokestatic game.C_100165_sh.func_100766_z(char[])java.lang.String
		// @5B0A: putstatic java.lang.String game.C_100165_sh.field_100773_n
		// @5B0D: ldc "#A$`i<J\"\u0008"
		// @5B0F: invokestatic game.C_100165_sh.func_100768_z(java.lang.String)char[]
		// @5B12: invokestatic game.C_100165_sh.func_100766_z(char[])java.lang.String
		// @5B15: putstatic java.lang.String game.C_100165_sh.field_100776_m
		// @5B18: return
	}
	
	private static char[] func_100768_z(String arg0)
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
		// @0E: bipush 36 (0x24)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100766_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @39, for 3: @3E
		// @30: bipush 115 (0x73)
		// @32: goto @45
		// @35: iconst_4
		// @36: goto @45
		// @39: bipush 118 (0x76)
		// @3B: goto @45
		// @3E: bipush 64 (0x40)
		// @40: goto @45
		// @43: bipush 36 (0x24)
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
