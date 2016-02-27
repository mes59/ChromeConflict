package game;

final class C_100242_oh
{
	static C_100153_be[] field_106347_a;
	static int field_106343_d;
	static String field_106345_b;
	static int field_106341_f;
	static int field_106344_e;
	static int[] field_106342_g;
	static int[] field_106346_c;
	private static final String[] field_106348_z;
	
	static final void func_106340_a(int arg0, C_100037_wb arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #12
		// @005: iload #4
		// @007: sipush 255 (0x00FF)
		// @00A: iand
		// @00B: istore #4
		// @00D: iload_2
		// @00E: sipush 255 (0x00FF)
		// @011: iand
		// @012: istore_2
		// @013: aload_1
		// @014: getfield int game.C_100037_wb.field_102341_y
		// @017: istore #7
		// @019: iload_0
		// @01A: iload #7
		// @01C: imul
		// @01D: istore #8
		// @01F: iload_0
		// @020: istore #11
		// @022: iload #6
		// @024: iload #11
		// @026: if_icmple @0A0
		// @029: iload #4
		// @02B: iload #11
		// @02D: ineg
		// @02E: iload #6
		// @030: iadd
		// @031: imul
		// @032: iload_0
		// @033: ineg
		// @034: iload #11
		// @036: iadd
		// @037: iload_2
		// @038: imul
		// @039: ineg
		// @03A: isub
		// @03B: iload_0
		// @03C: ineg
		// @03D: iload #6
		// @03F: iadd
		// @040: idiv
		// @041: istore #9
		// @043: iload #9
		// @045: ldc 65793 (0x10101)
		// @047: imul
		// @048: istore #9
		// @04A: iconst_0
		// @04B: iload #12
		// @04D: ifne @0A1
		// @050: istore #10
		// @052: iload #10
		// @054: iconst_m1
		// @055: ixor
		// @056: iload #7
		// @058: iconst_m1
		// @059: ixor
		// @05A: if_icmple @091
		// @05D: aload_1
		// @05E: getfield int[] game.C_100037_wb.field_102388_J
		// @061: iload #10
		// @063: iload #8
		// @065: iadd
		// @066: iaload
		// @067: iconst_m1
		// @068: ixor
		// @069: iload #5
		// @06B: iconst_m1
		// @06C: ixor
		// @06D: iload #12
		// @06F: ifne @095
		// @072: if_icmpne @089
		// @075: goto @079
		// @078: athrow
		// @079: aload_1
		// @07A: getfield int[] game.C_100037_wb.field_102388_J
		// @07D: iload #10
		// @07F: iload #8
		// @081: iadd
		// @082: iload #9
		// @084: iastore
		// @085: goto @089
		// @088: athrow
		// @089: iinc #10 +1
		// @08C: iload #12
		// @08E: ifeq @052
		// @091: iload #8
		// @093: iload #7
		// @095: iadd
		// @096: istore #8
		// @098: iinc #11 +1
		// @09B: iload #12
		// @09D: ifeq @022
		// @0A0: iload_3
		// @0A1: iconst_1
		// @0A2: if_icmpeq @0BB
		// @0A5: bipush 107 (0x6B)
		// @0A7: aconst_null
		// @0A8: checkcast game.C_100037_wb
		// @0AB: bipush -66 (0xBE)
		// @0AD: iconst_1
		// @0AE: bipush -25 (0xE7)
		// @0B0: bipush 39 (0x27)
		// @0B2: bipush 81 (0x51)
		// @0B4: invokestatic game.C_100242_oh.func_106340_a(int, game.C_100037_wb, int, boolean, int, int, int)void
		// @0B7: goto @0BB
		// @0BA: athrow
		// @0BB: goto @12B
		// @0BE: astore #7
		// @0C0: aload #7
		// @0C2: new java.lang.StringBuilder
		// @0C5: dup
		// @0C6: invokespecial java.lang.StringBuilder.<init>()void
		// @0C9: getstatic java.lang.String[] game.C_100242_oh.field_106348_z
		// @0CC: iconst_1
		// @0CD: aaload
		// @0CE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D1: iload_0
		// @0D2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D5: bipush 44 (0x2C)
		// @0D7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0DA: aload_1
		// @0DB: ifnull @0E7
		// @0DE: getstatic java.lang.String[] game.C_100242_oh.field_106348_z
		// @0E1: iconst_2
		// @0E2: aaload
		// @0E3: goto @0EC
		// @0E6: athrow
		// @0E7: getstatic java.lang.String[] game.C_100242_oh.field_106348_z
		// @0EA: iconst_0
		// @0EB: aaload
		// @0EC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0EF: bipush 44 (0x2C)
		// @0F1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F4: iload_2
		// @0F5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F8: bipush 44 (0x2C)
		// @0FA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FD: iload_3
		// @0FE: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @101: bipush 44 (0x2C)
		// @103: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @106: iload #4
		// @108: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @10B: bipush 44 (0x2C)
		// @10D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @110: iload #5
		// @112: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @115: bipush 44 (0x2C)
		// @117: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @11A: iload #6
		// @11C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @11F: bipush 41 (0x29)
		// @121: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @124: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @127: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @12A: athrow
		// @12B: return
	}
	
	static final C_100153_be func_106339_a(byte arg0, int arg1)
	{
		// @00: iload_0
		// @01: bipush -76 (0xB4)
		// @03: if_icmple @12
		// @06: bipush 126 (0x7E)
		// @08: bipush -125 (0x83)
		// @0A: invokestatic game.C_100242_oh.func_106339_a(byte, int)game.C_100153_be
		// @0D: pop
		// @0E: goto @12
		// @11: athrow
		// @12: iload_1
		// @13: iconst_m1
		// @14: ixor
		// @15: bipush -36 (0xDC)
		// @17: if_icmple @1E
		// @1A: goto @27
		// @1D: athrow
		// @1E: getstatic game.C_100153_be[] game.C_100260_mc.field_102235_Wb
		// @21: iload_1
		// @22: bipush -35 (0xDD)
		// @24: iadd
		// @25: aaload
		// @26: areturn
		// @27: getstatic game.C_100153_be[] game.C_100242_oh.field_106347_a
		// @2A: iload_1
		// @2B: aaload
		// @2C: areturn
		// @2D: astore_2
		// @2E: aload_2
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100242_oh.field_106348_z
		// @39: iconst_3
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: iload_0
		// @3F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @42: bipush 44 (0x2C)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: iload_1
		// @48: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4B: bipush 41 (0x29)
		// @4D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @50: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @53: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @56: athrow
	}
	
	public static void func_106337_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100153_be[] game.C_100242_oh.field_106347_a
		// @04: aconst_null
		// @05: putstatic int[] game.C_100242_oh.field_106346_c
		// @08: aconst_null
		// @09: putstatic int[] game.C_100242_oh.field_106342_g
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100242_oh.field_106345_b
		// @10: bipush -26 (0xE6)
		// @12: iload_0
		// @13: bipush 36 (0x24)
		// @15: isub
		// @16: bipush 63 (0x3F)
		// @18: idiv
		// @19: idiv
		// @1A: istore_1
		// @1B: goto @3F
		// @1E: astore_1
		// @1F: aload_1
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100242_oh.field_106348_z
		// @2A: iconst_4
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_0
		// @30: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @33: bipush 41 (0x29)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3E: athrow
		// @3F: return
	}
	
	static
	{
		// @000: iconst_5
		// @001: anewarray java.lang.String
		// @004: dup
		// @005: iconst_0
		// @006: ldc " k.F"
		// @008: invokestatic game.C_100242_oh.func_106338_z(java.lang.String)char[]
		// @00B: invokestatic game.C_100242_oh.func_106336_z(char[])java.lang.String
		// @00E: aastore
		// @00F: dup
		// @010: iconst_1
		// @011: ldc "!vli,"
		// @013: invokestatic game.C_100242_oh.func_106338_z(java.lang.String)char[]
		// @016: invokestatic game.C_100242_oh.func_106336_z(char[])java.lang.String
		// @019: aastore
		// @01A: dup
		// @01B: iconst_2
		// @01C: ldc "50l\u0004y"
		// @01E: invokestatic game.C_100242_oh.func_106338_z(java.lang.String)char[]
		// @021: invokestatic game.C_100242_oh.func_106336_z(char[])java.lang.String
		// @024: aastore
		// @025: dup
		// @026: iconst_3
		// @027: ldc "!vlk,"
		// @029: invokestatic game.C_100242_oh.func_106338_z(java.lang.String)char[]
		// @02C: invokestatic game.C_100242_oh.func_106336_z(char[])java.lang.String
		// @02F: aastore
		// @030: dup
		// @031: iconst_4
		// @032: ldc "!vlh,"
		// @034: invokestatic game.C_100242_oh.func_106338_z(java.lang.String)char[]
		// @037: invokestatic game.C_100242_oh.func_106336_z(char[])java.lang.String
		// @03A: aastore
		// @03B: putstatic java.lang.String[] game.C_100242_oh.field_106348_z
		// @03E: ldc "\u001d{,^m {.Y$\u000bf2Kj=w-D$'p1^e\"r'N"
		// @040: invokestatic game.C_100242_oh.func_106338_z(java.lang.String)char[]
		// @043: invokestatic game.C_100242_oh.func_106336_z(char[])java.lang.String
		// @046: putstatic java.lang.String game.C_100242_oh.field_106345_b
		// @049: iconst_m1
		// @04A: putstatic int game.C_100242_oh.field_106343_d
		// @04D: bipush 110 (0x6E)
		// @04F: newarray int[]
		// @051: putstatic int[] game.C_100242_oh.field_106342_g
		// @054: getstatic int[] game.C_100242_oh.field_106342_g
		// @057: bipush 30 (0x1E)
		// @059: bipush 75 (0x4B)
		// @05B: iastore
		// @05C: getstatic int[] game.C_100242_oh.field_106342_g
		// @05F: bipush 20 (0x14)
		// @061: sipush 200 (0x00C8)
		// @064: iastore
		// @065: getstatic int[] game.C_100242_oh.field_106342_g
		// @068: bipush 93 (0x5D)
		// @06A: sipush 1000 (0x03E8)
		// @06D: iastore
		// @06E: getstatic int[] game.C_100242_oh.field_106342_g
		// @071: bipush 31 (0x1F)
		// @073: sipush 200 (0x00C8)
		// @076: iastore
		// @077: getstatic int[] game.C_100242_oh.field_106342_g
		// @07A: bipush 19 (0x13)
		// @07C: sipush 400 (0x0190)
		// @07F: iastore
		// @080: getstatic int[] game.C_100242_oh.field_106342_g
		// @083: bipush 79 (0x4F)
		// @085: sipush 700 (0x02BC)
		// @088: iastore
		// @089: getstatic int[] game.C_100242_oh.field_106342_g
		// @08C: bipush 33 (0x21)
		// @08E: sipush 400 (0x0190)
		// @091: iastore
		// @092: getstatic int[] game.C_100242_oh.field_106342_g
		// @095: bipush 64 (0x40)
		// @097: sipush 300 (0x012C)
		// @09A: iastore
		// @09B: getstatic int[] game.C_100242_oh.field_106342_g
		// @09E: bipush 24 (0x18)
		// @0A0: bipush 75 (0x4B)
		// @0A2: iastore
		// @0A3: getstatic int[] game.C_100242_oh.field_106342_g
		// @0A6: bipush 48 (0x30)
		// @0A8: sipush 1000 (0x03E8)
		// @0AB: iastore
		// @0AC: getstatic int[] game.C_100242_oh.field_106342_g
		// @0AF: bipush 62 (0x3E)
		// @0B1: sipush 200 (0x00C8)
		// @0B4: iastore
		// @0B5: getstatic int[] game.C_100242_oh.field_106342_g
		// @0B8: iconst_3
		// @0B9: bipush 75 (0x4B)
		// @0BB: iastore
		// @0BC: getstatic int[] game.C_100242_oh.field_106342_g
		// @0BF: bipush 53 (0x35)
		// @0C1: bipush 75 (0x4B)
		// @0C3: iastore
		// @0C4: getstatic int[] game.C_100242_oh.field_106342_g
		// @0C7: bipush 22 (0x16)
		// @0C9: sipush 300 (0x012C)
		// @0CC: iastore
		// @0CD: getstatic int[] game.C_100242_oh.field_106342_g
		// @0D0: bipush 49 (0x31)
		// @0D2: sipush 1000 (0x03E8)
		// @0D5: iastore
		// @0D6: getstatic int[] game.C_100242_oh.field_106342_g
		// @0D9: bipush 92 (0x5C)
		// @0DB: sipush 1000 (0x03E8)
		// @0DE: iastore
		// @0DF: getstatic int[] game.C_100242_oh.field_106342_g
		// @0E2: bipush 87 (0x57)
		// @0E4: sipush 800 (0x0320)
		// @0E7: iastore
		// @0E8: getstatic int[] game.C_100242_oh.field_106342_g
		// @0EB: bipush 59 (0x3B)
		// @0ED: bipush 75 (0x4B)
		// @0EF: iastore
		// @0F0: getstatic int[] game.C_100242_oh.field_106342_g
		// @0F3: bipush 36 (0x24)
		// @0F5: sipush 700 (0x02BC)
		// @0F8: iastore
		// @0F9: getstatic int[] game.C_100242_oh.field_106342_g
		// @0FC: bipush 71 (0x47)
		// @0FE: sipush 400 (0x0190)
		// @101: iastore
		// @102: getstatic int[] game.C_100242_oh.field_106342_g
		// @105: bipush 76 (0x4C)
		// @107: sipush 600 (0x0258)
		// @10A: iastore
		// @10B: getstatic int[] game.C_100242_oh.field_106342_g
		// @10E: bipush 32 (0x20)
		// @110: sipush 300 (0x012C)
		// @113: iastore
		// @114: getstatic int[] game.C_100242_oh.field_106342_g
		// @117: bipush 23 (0x17)
		// @119: bipush 75 (0x4B)
		// @11B: iastore
		// @11C: getstatic int[] game.C_100242_oh.field_106342_g
		// @11F: bipush 81 (0x51)
		// @121: sipush 700 (0x02BC)
		// @124: iastore
		// @125: getstatic int[] game.C_100242_oh.field_106342_g
		// @128: bipush 89 (0x59)
		// @12A: sipush 900 (0x0384)
		// @12D: iastore
		// @12E: getstatic int[] game.C_100242_oh.field_106342_g
		// @131: bipush 50 (0x32)
		// @133: sipush 1000 (0x03E8)
		// @136: iastore
		// @137: getstatic int[] game.C_100242_oh.field_106342_g
		// @13A: bipush 75 (0x4B)
		// @13C: sipush 600 (0x0258)
		// @13F: iastore
		// @140: getstatic int[] game.C_100242_oh.field_106342_g
		// @143: bipush 68 (0x44)
		// @145: sipush 400 (0x0190)
		// @148: iastore
		// @149: getstatic int[] game.C_100242_oh.field_106342_g
		// @14C: bipush 83 (0x53)
		// @14E: sipush 600 (0x0258)
		// @151: iastore
		// @152: getstatic int[] game.C_100242_oh.field_106342_g
		// @155: bipush 61 (0x3D)
		// @157: sipush 200 (0x00C8)
		// @15A: iastore
		// @15B: getstatic int[] game.C_100242_oh.field_106342_g
		// @15E: bipush 88 (0x58)
		// @160: sipush 900 (0x0384)
		// @163: iastore
		// @164: getstatic int[] game.C_100242_oh.field_106342_g
		// @167: bipush 77 (0x4D)
		// @169: sipush 600 (0x0258)
		// @16C: iastore
		// @16D: getstatic int[] game.C_100242_oh.field_106342_g
		// @170: bipush 45 (0x2D)
		// @172: sipush 600 (0x0258)
		// @175: iastore
		// @176: getstatic int[] game.C_100242_oh.field_106342_g
		// @179: bipush 25 (0x19)
		// @17B: sipush 300 (0x012C)
		// @17E: iastore
		// @17F: getstatic int[] game.C_100242_oh.field_106342_g
		// @182: bipush 26 (0x1A)
		// @184: bipush 75 (0x4B)
		// @186: iastore
		// @187: getstatic int[] game.C_100242_oh.field_106342_g
		// @18A: bipush 56 (0x38)
		// @18C: bipush 75 (0x4B)
		// @18E: iastore
		// @18F: getstatic int[] game.C_100242_oh.field_106342_g
		// @192: bipush 73 (0x49)
		// @194: sipush 500 (0x01F4)
		// @197: iastore
		// @198: getstatic int[] game.C_100242_oh.field_106342_g
		// @19B: bipush 72 (0x48)
		// @19D: sipush 500 (0x01F4)
		// @1A0: iastore
		// @1A1: getstatic int[] game.C_100242_oh.field_106342_g
		// @1A4: bipush 95 (0x5F)
		// @1A6: sipush 1000 (0x03E8)
		// @1A9: iastore
		// @1AA: getstatic int[] game.C_100242_oh.field_106342_g
		// @1AD: bipush 28 (0x1C)
		// @1AF: sipush 600 (0x0258)
		// @1B2: iastore
		// @1B3: getstatic int[] game.C_100242_oh.field_106342_g
		// @1B6: iconst_1
		// @1B7: bipush 75 (0x4B)
		// @1B9: iastore
		// @1BA: getstatic int[] game.C_100242_oh.field_106342_g
		// @1BD: bipush 65 (0x41)
		// @1BF: sipush 300 (0x012C)
		// @1C2: iastore
		// @1C3: getstatic int[] game.C_100242_oh.field_106342_g
		// @1C6: bipush 52 (0x34)
		// @1C8: sipush 1000 (0x03E8)
		// @1CB: iastore
		// @1CC: getstatic int[] game.C_100242_oh.field_106342_g
		// @1CF: bipush 74 (0x4A)
		// @1D1: sipush 500 (0x01F4)
		// @1D4: iastore
		// @1D5: getstatic int[] game.C_100242_oh.field_106342_g
		// @1D8: bipush 86 (0x56)
		// @1DA: sipush 800 (0x0320)
		// @1DD: iastore
		// @1DE: getstatic int[] game.C_100242_oh.field_106342_g
		// @1E1: bipush 37 (0x25)
		// @1E3: sipush 200 (0x00C8)
		// @1E6: iastore
		// @1E7: getstatic int[] game.C_100242_oh.field_106342_g
		// @1EA: bipush 43 (0x2B)
		// @1EC: sipush 500 (0x01F4)
		// @1EF: iastore
		// @1F0: getstatic int[] game.C_100242_oh.field_106342_g
		// @1F3: bipush 47 (0x2F)
		// @1F5: sipush 800 (0x0320)
		// @1F8: iastore
		// @1F9: getstatic int[] game.C_100242_oh.field_106342_g
		// @1FC: bipush 51 (0x33)
		// @1FE: sipush 700 (0x02BC)
		// @201: iastore
		// @202: getstatic int[] game.C_100242_oh.field_106342_g
		// @205: bipush 58 (0x3A)
		// @207: bipush 75 (0x4B)
		// @209: iastore
		// @20A: getstatic int[] game.C_100242_oh.field_106342_g
		// @20D: bipush 91 (0x5B)
		// @20F: sipush 900 (0x0384)
		// @212: iastore
		// @213: getstatic int[] game.C_100242_oh.field_106342_g
		// @216: bipush 84 (0x54)
		// @218: sipush 800 (0x0320)
		// @21B: iastore
		// @21C: getstatic int[] game.C_100242_oh.field_106342_g
		// @21F: iconst_2
		// @220: bipush 75 (0x4B)
		// @222: iastore
		// @223: getstatic int[] game.C_100242_oh.field_106342_g
		// @226: bipush 90 (0x5A)
		// @228: sipush 900 (0x0384)
		// @22B: iastore
		// @22C: getstatic int[] game.C_100242_oh.field_106342_g
		// @22F: bipush 46 (0x2E)
		// @231: sipush 900 (0x0384)
		// @234: iastore
		// @235: getstatic int[] game.C_100242_oh.field_106342_g
		// @238: bipush 82 (0x52)
		// @23A: sipush 700 (0x02BC)
		// @23D: iastore
		// @23E: getstatic int[] game.C_100242_oh.field_106342_g
		// @241: bipush 17 (0x11)
		// @243: bipush 75 (0x4B)
		// @245: iastore
		// @246: getstatic int[] game.C_100242_oh.field_106342_g
		// @249: bipush 29 (0x1D)
		// @24B: bipush 75 (0x4B)
		// @24D: iastore
		// @24E: getstatic int[] game.C_100242_oh.field_106342_g
		// @251: bipush 70 (0x46)
		// @253: sipush 400 (0x0190)
		// @256: iastore
		// @257: getstatic int[] game.C_100242_oh.field_106342_g
		// @25A: bipush 63 (0x3F)
		// @25C: sipush 200 (0x00C8)
		// @25F: iastore
		// @260: getstatic int[] game.C_100242_oh.field_106342_g
		// @263: bipush 66 (0x42)
		// @265: sipush 300 (0x012C)
		// @268: iastore
		// @269: getstatic int[] game.C_100242_oh.field_106342_g
		// @26C: bipush 69 (0x45)
		// @26E: sipush 400 (0x0190)
		// @271: iastore
		// @272: getstatic int[] game.C_100242_oh.field_106342_g
		// @275: bipush 35 (0x23)
		// @277: sipush 900 (0x0384)
		// @27A: iastore
		// @27B: getstatic int[] game.C_100242_oh.field_106342_g
		// @27E: bipush 18 (0x12)
		// @280: bipush 75 (0x4B)
		// @282: iastore
		// @283: getstatic int[] game.C_100242_oh.field_106342_g
		// @286: bipush 27 (0x1B)
		// @288: sipush 600 (0x0258)
		// @28B: iastore
		// @28C: getstatic int[] game.C_100242_oh.field_106342_g
		// @28F: bipush 21 (0x15)
		// @291: bipush 75 (0x4B)
		// @293: iastore
		// @294: getstatic int[] game.C_100242_oh.field_106342_g
		// @297: bipush 44 (0x2C)
		// @299: sipush 700 (0x02BC)
		// @29C: iastore
		// @29D: getstatic int[] game.C_100242_oh.field_106342_g
		// @2A0: bipush 34 (0x22)
		// @2A2: sipush 500 (0x01F4)
		// @2A5: iastore
		// @2A6: getstatic int[] game.C_100242_oh.field_106342_g
		// @2A9: bipush 67 (0x43)
		// @2AB: sipush 300 (0x012C)
		// @2AE: iastore
		// @2AF: getstatic int[] game.C_100242_oh.field_106342_g
		// @2B2: bipush 85 (0x55)
		// @2B4: sipush 800 (0x0320)
		// @2B7: iastore
		// @2B8: getstatic int[] game.C_100242_oh.field_106342_g
		// @2BB: bipush 80 (0x50)
		// @2BD: sipush 700 (0x02BC)
		// @2C0: iastore
		// @2C1: getstatic int[] game.C_100242_oh.field_106342_g
		// @2C4: bipush 78 (0x4E)
		// @2C6: sipush 600 (0x0258)
		// @2C9: iastore
		// @2CA: getstatic int[] game.C_100242_oh.field_106342_g
		// @2CD: bipush 60 (0x3C)
		// @2CF: bipush 75 (0x4B)
		// @2D1: iastore
		// @2D2: getstatic int[] game.C_100242_oh.field_106342_g
		// @2D5: bipush 54 (0x36)
		// @2D7: bipush 75 (0x4B)
		// @2D9: iastore
		// @2DA: getstatic int[] game.C_100242_oh.field_106342_g
		// @2DD: bipush 38 (0x26)
		// @2DF: sipush 700 (0x02BC)
		// @2E2: iastore
		// @2E3: bipush 11 (0x0B)
		// @2E5: newarray int[]
		// @2E7: dup
		// @2E8: iconst_0
		// @2E9: bipush 109 (0x6D)
		// @2EB: iastore
		// @2EC: dup
		// @2ED: iconst_1
		// @2EE: bipush 23 (0x17)
		// @2F0: iastore
		// @2F1: dup
		// @2F2: iconst_2
		// @2F3: bipush 18 (0x12)
		// @2F5: iastore
		// @2F6: dup
		// @2F7: iconst_3
		// @2F8: bipush 16 (0x10)
		// @2FA: iastore
		// @2FB: dup
		// @2FC: iconst_4
		// @2FD: iconst_m1
		// @2FE: iastore
		// @2FF: dup
		// @300: iconst_5
		// @301: iconst_m1
		// @302: iastore
		// @303: dup
		// @304: bipush 6 (0x06)
		// @306: iconst_m1
		// @307: iastore
		// @308: dup
		// @309: bipush 7 (0x07)
		// @30B: iconst_m1
		// @30C: iastore
		// @30D: dup
		// @30E: bipush 8 (0x08)
		// @310: iconst_m1
		// @311: iastore
		// @312: dup
		// @313: bipush 9 (0x09)
		// @315: iconst_m1
		// @316: iastore
		// @317: dup
		// @318: bipush 10 (0x0A)
		// @31A: iconst_m1
		// @31B: iastore
		// @31C: putstatic int[] game.C_100242_oh.field_106346_c
		// @31F: return
	}
	
	private static char[] func_106338_z(String arg0)
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
	
	private static String func_106336_z(char[] arg0)
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
		// @30: bipush 78 (0x4E)
		// @32: goto @45
		// @35: bipush 30 (0x1E)
		// @37: goto @45
		// @3A: bipush 66 (0x42)
		// @3C: goto @45
		// @3F: bipush 42 (0x2A)
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
