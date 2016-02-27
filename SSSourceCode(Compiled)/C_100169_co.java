package game;

final class C_100169_co
{
	static int[] field_105526_b;
	static String field_105523_f;
	static String field_105528_a;
	static String field_105524_d;
	static C_100302_ka field_105527_c;
	static C_100280_nf field_105525_e;
	private static final String[] field_105529_z;
	
	static final C_100302_ka func_105522_a(int arg0)
	{
		// @00: iload_0
		// @01: sipush -14277 (0xC83B)
		// @04: if_icmpeq @12
		// @07: aconst_null
		// @08: checkcast java.lang.String
		// @0B: putstatic java.lang.String game.C_100169_co.field_105528_a
		// @0E: goto @12
		// @11: athrow
		// @12: getstatic game.C_100115_ej game.C_100156_sk.field_105389_r
		// @15: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @18: areturn
		// @19: astore_1
		// @1A: aload_1
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100169_co.field_105529_z
		// @25: iconst_0
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: iload_0
		// @2B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2E: bipush 41 (0x29)
		// @30: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @33: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @36: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @39: athrow
	}
	
	public static void func_105519_b(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100169_co.field_105523_f
		// @04: iload_0
		// @05: iconst_1
		// @06: if_icmpeq @12
		// @09: bipush 50 (0x32)
		// @0B: invokestatic game.C_100169_co.func_105519_b(int)void
		// @0E: goto @12
		// @11: athrow
		// @12: aconst_null
		// @13: putstatic game.C_100302_ka game.C_100169_co.field_105527_c
		// @16: aconst_null
		// @17: putstatic int[] game.C_100169_co.field_105526_b
		// @1A: aconst_null
		// @1B: putstatic game.C_100280_nf game.C_100169_co.field_105525_e
		// @1E: aconst_null
		// @1F: putstatic java.lang.String game.C_100169_co.field_105524_d
		// @22: aconst_null
		// @23: putstatic java.lang.String game.C_100169_co.field_105528_a
		// @26: goto @4A
		// @29: astore_1
		// @2A: aload_1
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100169_co.field_105529_z
		// @35: iconst_1
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: iload_0
		// @3B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E: bipush 41 (0x29)
		// @40: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @46: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @49: athrow
		// @4A: return
	}
	
	static final C_100037_wb func_105518_a(byte arg0, int arg1, int arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: new game.C_100037_wb
		// @08: dup
		// @09: iload_1
		// @0A: iload_1
		// @0B: invokespecial game.C_100037_wb.<init>(int, int)void
		// @0E: astore_3
		// @0F: iload_0
		// @10: bipush 73 (0x49)
		// @12: if_icmpeq @1A
		// @15: aconst_null
		// @16: checkcast game.C_100037_wb
		// @19: areturn
		// @1A: iconst_0
		// @1B: istore #4
		// @1D: iload #4
		// @1F: iconst_m1
		// @20: ixor
		// @21: aload_3
		// @22: getfield int[] game.C_100037_wb.field_102388_J
		// @25: arraylength
		// @26: iconst_m1
		// @27: ixor
		// @28: if_icmple @44
		// @2B: aload_3
		// @2C: iload #5
		// @2E: ifne @45
		// @31: getfield int[] game.C_100037_wb.field_102388_J
		// @34: iload #4
		// @36: iload_2
		// @37: iastore
		// @38: iinc #4 +1
		// @3B: iload #5
		// @3D: ifeq @1D
		// @40: goto @44
		// @43: athrow
		// @44: aload_3
		// @45: areturn
		// @46: astore_3
		// @47: aload_3
		// @48: new java.lang.StringBuilder
		// @4B: dup
		// @4C: invokespecial java.lang.StringBuilder.<init>()void
		// @4F: getstatic java.lang.String[] game.C_100169_co.field_105529_z
		// @52: iconst_2
		// @53: aaload
		// @54: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @57: iload_0
		// @58: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5B: bipush 44 (0x2C)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: iload_1
		// @61: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @64: bipush 44 (0x2C)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: iload_2
		// @6A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6D: bipush 41 (0x29)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @75: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @78: athrow
	}
	
	static
	{
		// @000: iconst_3
		// @001: anewarray java.lang.String
		// @004: dup
		// @005: iconst_0
		// @006: ldc "ZY44\u0007"
		// @008: invokestatic game.C_100169_co.func_105521_z(java.lang.String)char[]
		// @00B: invokestatic game.C_100169_co.func_105520_z(char[])java.lang.String
		// @00E: aastore
		// @00F: dup
		// @010: iconst_1
		// @011: ldc "ZY46\u0007"
		// @013: invokestatic game.C_100169_co.func_105521_z(java.lang.String)char[]
		// @016: invokestatic game.C_100169_co.func_105520_z(char[])java.lang.String
		// @019: aastore
		// @01A: dup
		// @01B: iconst_2
		// @01C: ldc "ZY47\u0007"
		// @01E: invokestatic game.C_100169_co.func_105521_z(java.lang.String)char[]
		// @021: invokestatic game.C_100169_co.func_105520_z(char[])java.lang.String
		// @024: aastore
		// @025: putstatic java.lang.String[] game.C_100169_co.field_105529_z
		// @028: bipush 105 (0x69)
		// @02A: newarray int[]
		// @02C: putstatic int[] game.C_100169_co.field_105526_b
		// @02F: getstatic int[] game.C_100169_co.field_105526_b
		// @032: bipush 26 (0x1A)
		// @034: bipush 90 (0x5A)
		// @036: iastore
		// @037: getstatic int[] game.C_100169_co.field_105526_b
		// @03A: bipush 40 (0x28)
		// @03C: bipush 20 (0x14)
		// @03E: iastore
		// @03F: getstatic int[] game.C_100169_co.field_105526_b
		// @042: bipush 98 (0x62)
		// @044: sipush 256 (0x0100)
		// @047: iastore
		// @048: getstatic int[] game.C_100169_co.field_105526_b
		// @04B: bipush 64 (0x40)
		// @04D: bipush 114 (0x72)
		// @04F: iastore
		// @050: getstatic int[] game.C_100169_co.field_105526_b
		// @053: bipush 41 (0x29)
		// @055: sipush 256 (0x0100)
		// @058: iastore
		// @059: getstatic int[] game.C_100169_co.field_105526_b
		// @05C: bipush 6 (0x06)
		// @05E: sipush 256 (0x0100)
		// @061: iastore
		// @062: getstatic int[] game.C_100169_co.field_105526_b
		// @065: bipush 34 (0x22)
		// @067: sipush 150 (0x0096)
		// @06A: iastore
		// @06B: getstatic int[] game.C_100169_co.field_105526_b
		// @06E: bipush 67 (0x43)
		// @070: bipush 40 (0x28)
		// @072: iastore
		// @073: getstatic int[] game.C_100169_co.field_105526_b
		// @076: bipush 82 (0x52)
		// @078: sipush 128 (0x0080)
		// @07B: iastore
		// @07C: getstatic int[] game.C_100169_co.field_105526_b
		// @07F: bipush 83 (0x53)
		// @081: sipush 128 (0x0080)
		// @084: iastore
		// @085: getstatic int[] game.C_100169_co.field_105526_b
		// @088: bipush 14 (0x0E)
		// @08A: sipush 150 (0x0096)
		// @08D: iastore
		// @08E: getstatic int[] game.C_100169_co.field_105526_b
		// @091: bipush 16 (0x10)
		// @093: bipush 32 (0x20)
		// @095: iastore
		// @096: getstatic int[] game.C_100169_co.field_105526_b
		// @099: bipush 33 (0x21)
		// @09B: sipush 148 (0x0094)
		// @09E: iastore
		// @09F: getstatic int[] game.C_100169_co.field_105526_b
		// @0A2: bipush 47 (0x2F)
		// @0A4: sipush 150 (0x0096)
		// @0A7: iastore
		// @0A8: getstatic int[] game.C_100169_co.field_105526_b
		// @0AB: bipush 17 (0x11)
		// @0AD: sipush 256 (0x0100)
		// @0B0: iastore
		// @0B1: getstatic int[] game.C_100169_co.field_105526_b
		// @0B4: bipush 42 (0x2A)
		// @0B6: bipush 105 (0x69)
		// @0B8: iastore
		// @0B9: getstatic int[] game.C_100169_co.field_105526_b
		// @0BC: bipush 11 (0x0B)
		// @0BE: bipush 110 (0x6E)
		// @0C0: iastore
		// @0C1: getstatic int[] game.C_100169_co.field_105526_b
		// @0C4: bipush 96 (0x60)
		// @0C6: sipush 256 (0x0100)
		// @0C9: iastore
		// @0CA: getstatic int[] game.C_100169_co.field_105526_b
		// @0CD: bipush 36 (0x24)
		// @0CF: bipush 16 (0x10)
		// @0D1: iastore
		// @0D2: getstatic int[] game.C_100169_co.field_105526_b
		// @0D5: bipush 48 (0x30)
		// @0D7: sipush 150 (0x0096)
		// @0DA: iastore
		// @0DB: getstatic int[] game.C_100169_co.field_105526_b
		// @0DE: bipush 93 (0x5D)
		// @0E0: sipush 256 (0x0100)
		// @0E3: iastore
		// @0E4: getstatic int[] game.C_100169_co.field_105526_b
		// @0E7: bipush 15 (0x0F)
		// @0E9: bipush 118 (0x76)
		// @0EB: iastore
		// @0EC: getstatic int[] game.C_100169_co.field_105526_b
		// @0EF: bipush 80 (0x50)
		// @0F1: sipush 128 (0x0080)
		// @0F4: iastore
		// @0F5: getstatic int[] game.C_100169_co.field_105526_b
		// @0F8: bipush 24 (0x18)
		// @0FA: sipush 155 (0x009B)
		// @0FD: iastore
		// @0FE: getstatic int[] game.C_100169_co.field_105526_b
		// @101: bipush 20 (0x14)
		// @103: sipush 179 (0x00B3)
		// @106: iastore
		// @107: getstatic int[] game.C_100169_co.field_105526_b
		// @10A: bipush 73 (0x49)
		// @10C: sipush 128 (0x0080)
		// @10F: iastore
		// @110: getstatic int[] game.C_100169_co.field_105526_b
		// @113: bipush 44 (0x2C)
		// @115: bipush 89 (0x59)
		// @117: iastore
		// @118: getstatic int[] game.C_100169_co.field_105526_b
		// @11B: bipush 95 (0x5F)
		// @11D: sipush 256 (0x0100)
		// @120: iastore
		// @121: getstatic int[] game.C_100169_co.field_105526_b
		// @124: bipush 103 (0x67)
		// @126: sipush 256 (0x0100)
		// @129: iastore
		// @12A: getstatic int[] game.C_100169_co.field_105526_b
		// @12D: bipush 53 (0x35)
		// @12F: sipush 150 (0x0096)
		// @132: iastore
		// @133: getstatic int[] game.C_100169_co.field_105526_b
		// @136: bipush 32 (0x20)
		// @138: sipush 150 (0x0096)
		// @13B: iastore
		// @13C: getstatic int[] game.C_100169_co.field_105526_b
		// @13F: bipush 63 (0x3F)
		// @141: bipush 100 (0x64)
		// @143: iastore
		// @144: getstatic int[] game.C_100169_co.field_105526_b
		// @147: bipush 49 (0x31)
		// @149: bipush 40 (0x28)
		// @14B: iastore
		// @14C: getstatic int[] game.C_100169_co.field_105526_b
		// @14F: bipush 27 (0x1B)
		// @151: sipush 256 (0x0100)
		// @154: iastore
		// @155: getstatic int[] game.C_100169_co.field_105526_b
		// @158: bipush 79 (0x4F)
		// @15A: sipush 128 (0x0080)
		// @15D: iastore
		// @15E: getstatic int[] game.C_100169_co.field_105526_b
		// @161: bipush 71 (0x47)
		// @163: sipush 128 (0x0080)
		// @166: iastore
		// @167: getstatic int[] game.C_100169_co.field_105526_b
		// @16A: bipush 7 (0x07)
		// @16C: sipush 256 (0x0100)
		// @16F: iastore
		// @170: getstatic int[] game.C_100169_co.field_105526_b
		// @173: bipush 30 (0x1E)
		// @175: sipush 256 (0x0100)
		// @178: iastore
		// @179: getstatic int[] game.C_100169_co.field_105526_b
		// @17C: bipush 37 (0x25)
		// @17E: bipush 52 (0x34)
		// @180: iastore
		// @181: getstatic int[] game.C_100169_co.field_105526_b
		// @184: bipush 104 (0x68)
		// @186: sipush 256 (0x0100)
		// @189: iastore
		// @18A: getstatic int[] game.C_100169_co.field_105526_b
		// @18D: bipush 59 (0x3B)
		// @18F: bipush 25 (0x19)
		// @191: iastore
		// @192: getstatic int[] game.C_100169_co.field_105526_b
		// @195: bipush 100 (0x64)
		// @197: sipush 256 (0x0100)
		// @19A: iastore
		// @19B: getstatic int[] game.C_100169_co.field_105526_b
		// @19E: bipush 75 (0x4B)
		// @1A0: sipush 128 (0x0080)
		// @1A3: iastore
		// @1A4: getstatic int[] game.C_100169_co.field_105526_b
		// @1A7: bipush 72 (0x48)
		// @1A9: sipush 128 (0x0080)
		// @1AC: iastore
		// @1AD: getstatic int[] game.C_100169_co.field_105526_b
		// @1B0: bipush 51 (0x33)
		// @1B2: sipush 170 (0x00AA)
		// @1B5: iastore
		// @1B6: getstatic int[] game.C_100169_co.field_105526_b
		// @1B9: bipush 46 (0x2E)
		// @1BB: sipush 149 (0x0095)
		// @1BE: iastore
		// @1BF: getstatic int[] game.C_100169_co.field_105526_b
		// @1C2: bipush 13 (0x0D)
		// @1C4: bipush 120 (0x78)
		// @1C6: iastore
		// @1C7: getstatic int[] game.C_100169_co.field_105526_b
		// @1CA: bipush 76 (0x4C)
		// @1CC: sipush 128 (0x0080)
		// @1CF: iastore
		// @1D0: getstatic int[] game.C_100169_co.field_105526_b
		// @1D3: iconst_2
		// @1D4: sipush 256 (0x0100)
		// @1D7: iastore
		// @1D8: getstatic int[] game.C_100169_co.field_105526_b
		// @1DB: iconst_5
		// @1DC: sipush 256 (0x0100)
		// @1DF: iastore
		// @1E0: getstatic int[] game.C_100169_co.field_105526_b
		// @1E3: bipush 25 (0x19)
		// @1E5: sipush 150 (0x0096)
		// @1E8: iastore
		// @1E9: getstatic int[] game.C_100169_co.field_105526_b
		// @1EC: bipush 89 (0x59)
		// @1EE: sipush 150 (0x0096)
		// @1F1: iastore
		// @1F2: getstatic int[] game.C_100169_co.field_105526_b
		// @1F5: bipush 9 (0x09)
		// @1F7: sipush 200 (0x00C8)
		// @1FA: iastore
		// @1FB: getstatic int[] game.C_100169_co.field_105526_b
		// @1FE: bipush 102 (0x66)
		// @200: sipush 256 (0x0100)
		// @203: iastore
		// @204: getstatic int[] game.C_100169_co.field_105526_b
		// @207: bipush 19 (0x13)
		// @209: sipush 177 (0x00B1)
		// @20C: iastore
		// @20D: getstatic int[] game.C_100169_co.field_105526_b
		// @210: bipush 68 (0x44)
		// @212: bipush 16 (0x10)
		// @214: iastore
		// @215: getstatic int[] game.C_100169_co.field_105526_b
		// @218: bipush 45 (0x2D)
		// @21A: sipush 150 (0x0096)
		// @21D: iastore
		// @21E: getstatic int[] game.C_100169_co.field_105526_b
		// @221: bipush 28 (0x1C)
		// @223: bipush 90 (0x5A)
		// @225: iastore
		// @226: getstatic int[] game.C_100169_co.field_105526_b
		// @229: bipush 85 (0x55)
		// @22B: sipush 150 (0x0096)
		// @22E: iastore
		// @22F: getstatic int[] game.C_100169_co.field_105526_b
		// @232: bipush 88 (0x58)
		// @234: sipush 150 (0x0096)
		// @237: iastore
		// @238: getstatic int[] game.C_100169_co.field_105526_b
		// @23B: bipush 18 (0x12)
		// @23D: sipush 256 (0x0100)
		// @240: iastore
		// @241: getstatic int[] game.C_100169_co.field_105526_b
		// @244: bipush 29 (0x1D)
		// @246: sipush 256 (0x0100)
		// @249: iastore
		// @24A: getstatic int[] game.C_100169_co.field_105526_b
		// @24D: bipush 77 (0x4D)
		// @24F: sipush 128 (0x0080)
		// @252: iastore
		// @253: getstatic int[] game.C_100169_co.field_105526_b
		// @256: bipush 97 (0x61)
		// @258: sipush 256 (0x0100)
		// @25B: iastore
		// @25C: getstatic int[] game.C_100169_co.field_105526_b
		// @25F: bipush 22 (0x16)
		// @261: sipush 144 (0x0090)
		// @264: iastore
		// @265: getstatic int[] game.C_100169_co.field_105526_b
		// @268: iconst_1
		// @269: sipush 256 (0x0100)
		// @26C: iastore
		// @26D: getstatic int[] game.C_100169_co.field_105526_b
		// @270: bipush 62 (0x3E)
		// @272: bipush 73 (0x49)
		// @274: iastore
		// @275: getstatic int[] game.C_100169_co.field_105526_b
		// @278: iconst_4
		// @279: sipush 200 (0x00C8)
		// @27C: iastore
		// @27D: getstatic int[] game.C_100169_co.field_105526_b
		// @280: bipush 35 (0x23)
		// @282: sipush 256 (0x0100)
		// @285: iastore
		// @286: getstatic int[] game.C_100169_co.field_105526_b
		// @289: bipush 69 (0x45)
		// @28B: sipush 256 (0x0100)
		// @28E: iastore
		// @28F: getstatic int[] game.C_100169_co.field_105526_b
		// @292: bipush 38 (0x26)
		// @294: bipush 16 (0x10)
		// @296: iastore
		// @297: getstatic int[] game.C_100169_co.field_105526_b
		// @29A: bipush 56 (0x38)
		// @29C: sipush 150 (0x0096)
		// @29F: iastore
		// @2A0: getstatic int[] game.C_100169_co.field_105526_b
		// @2A3: bipush 21 (0x15)
		// @2A5: sipush 200 (0x00C8)
		// @2A8: iastore
		// @2A9: getstatic int[] game.C_100169_co.field_105526_b
		// @2AC: iconst_0
		// @2AD: sipush 200 (0x00C8)
		// @2B0: iastore
		// @2B1: getstatic int[] game.C_100169_co.field_105526_b
		// @2B4: bipush 50 (0x32)
		// @2B6: sipush 137 (0x0089)
		// @2B9: iastore
		// @2BA: getstatic int[] game.C_100169_co.field_105526_b
		// @2BD: bipush 23 (0x17)
		// @2BF: sipush 256 (0x0100)
		// @2C2: iastore
		// @2C3: getstatic int[] game.C_100169_co.field_105526_b
		// @2C6: bipush 8 (0x08)
		// @2C8: sipush 200 (0x00C8)
		// @2CB: iastore
		// @2CC: getstatic int[] game.C_100169_co.field_105526_b
		// @2CF: bipush 12 (0x0C)
		// @2D1: sipush 256 (0x0100)
		// @2D4: iastore
		// @2D5: getstatic int[] game.C_100169_co.field_105526_b
		// @2D8: bipush 31 (0x1F)
		// @2DA: sipush 137 (0x0089)
		// @2DD: iastore
		// @2DE: getstatic int[] game.C_100169_co.field_105526_b
		// @2E1: bipush 57 (0x39)
		// @2E3: sipush 150 (0x0096)
		// @2E6: iastore
		// @2E7: getstatic int[] game.C_100169_co.field_105526_b
		// @2EA: bipush 87 (0x57)
		// @2EC: sipush 150 (0x0096)
		// @2EF: iastore
		// @2F0: getstatic int[] game.C_100169_co.field_105526_b
		// @2F3: bipush 84 (0x54)
		// @2F5: sipush 150 (0x0096)
		// @2F8: iastore
		// @2F9: getstatic int[] game.C_100169_co.field_105526_b
		// @2FC: bipush 65 (0x41)
		// @2FE: sipush 256 (0x0100)
		// @301: iastore
		// @302: getstatic int[] game.C_100169_co.field_105526_b
		// @305: bipush 52 (0x34)
		// @307: sipush 150 (0x0096)
		// @30A: iastore
		// @30B: getstatic int[] game.C_100169_co.field_105526_b
		// @30E: bipush 39 (0x27)
		// @310: sipush 148 (0x0094)
		// @313: iastore
		// @314: getstatic int[] game.C_100169_co.field_105526_b
		// @317: bipush 94 (0x5E)
		// @319: sipush 166 (0x00A6)
		// @31C: iastore
		// @31D: getstatic int[] game.C_100169_co.field_105526_b
		// @320: bipush 43 (0x2B)
		// @322: sipush 139 (0x008B)
		// @325: iastore
		// @326: getstatic int[] game.C_100169_co.field_105526_b
		// @329: iconst_3
		// @32A: sipush 256 (0x0100)
		// @32D: iastore
		// @32E: getstatic int[] game.C_100169_co.field_105526_b
		// @331: bipush 90 (0x5A)
		// @333: sipush 200 (0x00C8)
		// @336: iastore
		// @337: getstatic int[] game.C_100169_co.field_105526_b
		// @33A: bipush 92 (0x5C)
		// @33C: sipush 256 (0x0100)
		// @33F: iastore
		// @340: getstatic int[] game.C_100169_co.field_105526_b
		// @343: bipush 91 (0x5B)
		// @345: sipush 256 (0x0100)
		// @348: iastore
		// @349: getstatic int[] game.C_100169_co.field_105526_b
		// @34C: bipush 99 (0x63)
		// @34E: sipush 256 (0x0100)
		// @351: iastore
		// @352: getstatic int[] game.C_100169_co.field_105526_b
		// @355: bipush 54 (0x36)
		// @357: sipush 150 (0x0096)
		// @35A: iastore
		// @35B: getstatic int[] game.C_100169_co.field_105526_b
		// @35E: bipush 10 (0x0A)
		// @360: sipush 256 (0x0100)
		// @363: iastore
		// @364: getstatic int[] game.C_100169_co.field_105526_b
		// @367: bipush 60 (0x3C)
		// @369: sipush 256 (0x0100)
		// @36C: iastore
		// @36D: getstatic int[] game.C_100169_co.field_105526_b
		// @370: bipush 61 (0x3D)
		// @372: sipush 160 (0x00A0)
		// @375: iastore
		// @376: getstatic int[] game.C_100169_co.field_105526_b
		// @379: bipush 55 (0x37)
		// @37B: bipush 100 (0x64)
		// @37D: iastore
		// @37E: getstatic int[] game.C_100169_co.field_105526_b
		// @381: bipush 78 (0x4E)
		// @383: sipush 128 (0x0080)
		// @386: iastore
		// @387: getstatic int[] game.C_100169_co.field_105526_b
		// @38A: bipush 58 (0x3A)
		// @38C: sipush 256 (0x0100)
		// @38F: iastore
		// @390: getstatic int[] game.C_100169_co.field_105526_b
		// @393: bipush 81 (0x51)
		// @395: sipush 128 (0x0080)
		// @398: iastore
		// @399: getstatic int[] game.C_100169_co.field_105526_b
		// @39C: bipush 86 (0x56)
		// @39E: sipush 150 (0x0096)
		// @3A1: iastore
		// @3A2: getstatic int[] game.C_100169_co.field_105526_b
		// @3A5: bipush 66 (0x42)
		// @3A7: bipush 25 (0x19)
		// @3A9: iastore
		// @3AA: getstatic int[] game.C_100169_co.field_105526_b
		// @3AD: bipush 74 (0x4A)
		// @3AF: sipush 128 (0x0080)
		// @3B2: iastore
		// @3B3: iconst_0
		// @3B4: istore_0
		// @3B5: iload_0
		// @3B6: getstatic int[] game.C_100169_co.field_105526_b
		// @3B9: arraylength
		// @3BA: if_icmpge @3D2
		// @3BD: getstatic int[] game.C_100169_co.field_105526_b
		// @3C0: iload_0
		// @3C1: iconst_3
		// @3C2: getstatic int[] game.C_100169_co.field_105526_b
		// @3C5: iload_0
		// @3C6: iaload
		// @3C7: imul
		// @3C8: iconst_4
		// @3C9: idiv
		// @3CA: iastore
		// @3CB: iinc #0 +1
		// @3CE: goto @3B5
		// @3D1: athrow
		// @3D2: ldc "zD\u007f\u0014[\\\u0016c\u001aZK\u0016u\u0002A\u0019Ph\u0010J\u0019|{\u0012JA\u0016{\u0016LVCt\u0001"
		// @3D4: invokestatic game.C_100169_co.func_105521_z(java.lang.String)char[]
		// @3D7: invokestatic game.C_100169_co.func_105520_z(char[])java.lang.String
		// @3DA: putstatic java.lang.String game.C_100169_co.field_105528_a
		// @3DD: ldc "jF\u007f\u0016[XBs\u001bH"
		// @3DF: invokestatic game.C_100169_co.func_105521_z(java.lang.String)char[]
		// @3E2: invokestatic game.C_100169_co.func_105520_z(char[])java.lang.String
		// @3E5: putstatic java.lang.String game.C_100169_co.field_105523_f
		// @3E8: ldc "jC}\u0012JJB:\u0018ZM_t\u0012\u000fM^s\u0006\u000fIZ{\u000cJK"
		// @3EA: invokestatic game.C_100169_co.func_105521_z(java.lang.String)char[]
		// @3ED: invokestatic game.C_100169_co.func_105520_z(char[])java.lang.String
		// @3F0: putstatic java.lang.String game.C_100169_co.field_105524_d
		// @3F3: return
	}
	
	private static char[] func_105521_z(String arg0)
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
		// @0E: bipush 47 (0x2F)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105520_z(char[] arg0)
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
		// @30: bipush 57 (0x39)
		// @32: goto @46
		// @35: bipush 54 (0x36)
		// @37: goto @46
		// @3A: bipush 26 (0x1A)
		// @3C: goto @46
		// @3F: bipush 117 (0x75)
		// @41: goto @46
		// @44: bipush 47 (0x2F)
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
