package game;

import java.math.BigInteger;

final class C_100155_dc
{
	static C_100098_h field_105351_b;
	private static long[] field_105353_a;
	static String field_105349_d;
	static C_100037_wb[] field_105352_c;
	static String field_105350_e;
	static String field_105347_f;
	static String field_105348_g;
	private static final String[] field_105354_z;
	
	static final void func_105346_a(BigInteger arg0, byte arg1, int arg2, C_100280_nf arg3, byte[] arg4, BigInteger arg5, int arg6)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: iload_1
		// @006: bipush 83 (0x53)
		// @008: ixor
		// @009: iload_2
		// @00A: invokestatic game.C_100036_gg.func_103144_b(int, int)int
		// @00D: istore #7
		// @00F: iload_1
		// @010: bipush 50 (0x32)
		// @012: if_icmpeq @016
		// @015: return
		// @016: aconst_null
		// @017: getstatic java.security.SecureRandom game.C_100304_kl.field_107117_j
		// @01A: if_acmpne @02B
		// @01D: new java.security.SecureRandom
		// @020: dup
		// @021: invokespecial java.security.SecureRandom.<init>()void
		// @024: putstatic java.security.SecureRandom game.C_100304_kl.field_107117_j
		// @027: goto @02B
		// @02A: athrow
		// @02B: iconst_4
		// @02C: newarray int[]
		// @02E: astore #8
		// @030: iconst_0
		// @031: istore #9
		// @033: iload #9
		// @035: iconst_4
		// @036: if_icmpge @055
		// @039: aload #8
		// @03B: iload #9
		// @03D: getstatic java.security.SecureRandom game.C_100304_kl.field_107117_j
		// @040: invokevirtual java.security.SecureRandom.nextInt()int
		// @043: iastore
		// @044: iinc #9 +1
		// @047: iload #10
		// @049: ifne @06B
		// @04C: iload #10
		// @04E: ifeq @033
		// @051: goto @055
		// @054: athrow
		// @055: getstatic game.C_100280_nf game.C_100169_co.field_105525_e
		// @058: ifnull @06B
		// @05B: getstatic game.C_100280_nf game.C_100169_co.field_105525_e
		// @05E: getfield byte[] game.C_100280_nf.field_101179_l
		// @061: arraylength
		// @062: iload #7
		// @064: if_icmpge @077
		// @067: goto @06B
		// @06A: athrow
		// @06B: new game.C_100280_nf
		// @06E: dup
		// @06F: iload #7
		// @071: invokespecial game.C_100280_nf.<init>(int)void
		// @074: putstatic game.C_100280_nf game.C_100169_co.field_105525_e
		// @077: getstatic game.C_100280_nf game.C_100169_co.field_105525_e
		// @07A: iconst_0
		// @07B: putfield int game.C_100280_nf.field_101177_n
		// @07E: getstatic game.C_100280_nf game.C_100169_co.field_105525_e
		// @081: aload #4
		// @083: iload #6
		// @085: iload_2
		// @086: bipush -88 (0xA8)
		// @088: invokevirtual game.C_100280_nf.func_101165_b(byte[], int, int, int)void
		// @08B: getstatic game.C_100280_nf game.C_100169_co.field_105525_e
		// @08E: iload #7
		// @090: bipush 127 (0x7F)
		// @092: invokevirtual game.C_100280_nf.func_101170_b(int, byte)void
		// @095: getstatic game.C_100280_nf game.C_100169_co.field_105525_e
		// @098: bipush 29 (0x1D)
		// @09A: aload #8
		// @09C: invokevirtual game.C_100280_nf.func_101147_a(byte, int[])void
		// @09F: aconst_null
		// @0A0: getstatic game.C_100280_nf game.C_100036_gg.field_103151_T
		// @0A3: if_acmpeq @0B8
		// @0A6: getstatic game.C_100280_nf game.C_100036_gg.field_103151_T
		// @0A9: getfield byte[] game.C_100280_nf.field_101179_l
		// @0AC: arraylength
		// @0AD: iconst_m1
		// @0AE: ixor
		// @0AF: bipush -101 (0x9B)
		// @0B1: if_icmple @0C8
		// @0B4: goto @0B8
		// @0B7: athrow
		// @0B8: new game.C_100280_nf
		// @0BB: dup
		// @0BC: bipush 100 (0x64)
		// @0BE: invokespecial game.C_100280_nf.<init>(int)void
		// @0C1: putstatic game.C_100280_nf game.C_100036_gg.field_103151_T
		// @0C4: goto @0C8
		// @0C7: athrow
		// @0C8: getstatic game.C_100280_nf game.C_100036_gg.field_103151_T
		// @0CB: iconst_0
		// @0CC: putfield int game.C_100280_nf.field_101177_n
		// @0CF: getstatic game.C_100280_nf game.C_100036_gg.field_103151_T
		// @0D2: sipush 7838 (0x1E9E)
		// @0D5: bipush 10 (0x0A)
		// @0D7: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @0DA: iconst_0
		// @0DB: istore #9
		// @0DD: bipush -5 (0xFB)
		// @0DF: iload #9
		// @0E1: iconst_m1
		// @0E2: ixor
		// @0E3: if_icmpge @104
		// @0E6: getstatic game.C_100280_nf game.C_100036_gg.field_103151_T
		// @0E9: aload #8
		// @0EB: iload #9
		// @0ED: iaload
		// @0EE: bipush -128 (0x80)
		// @0F0: invokevirtual game.C_100280_nf.func_101154_d(int, int)void
		// @0F3: iinc #9 +1
		// @0F6: iload #10
		// @0F8: ifne @13E
		// @0FB: iload #10
		// @0FD: ifeq @0DD
		// @100: goto @104
		// @103: athrow
		// @104: getstatic game.C_100280_nf game.C_100036_gg.field_103151_T
		// @107: iload_2
		// @108: bipush -64 (0xC0)
		// @10A: invokevirtual game.C_100280_nf.func_101141_d(int, byte)void
		// @10D: getstatic game.C_100280_nf game.C_100036_gg.field_103151_T
		// @110: aload_0
		// @111: aload #5
		// @113: bipush 21 (0x15)
		// @115: invokevirtual game.C_100280_nf.func_101132_a(java.math.BigInteger, java.math.BigInteger, byte)void
		// @118: aload_3
		// @119: getstatic game.C_100280_nf game.C_100036_gg.field_103151_T
		// @11C: getfield byte[] game.C_100280_nf.field_101179_l
		// @11F: iconst_0
		// @120: getstatic game.C_100280_nf game.C_100036_gg.field_103151_T
		// @123: getfield int game.C_100280_nf.field_101177_n
		// @126: bipush -44 (0xD4)
		// @128: invokevirtual game.C_100280_nf.func_101165_b(byte[], int, int, int)void
		// @12B: aload_3
		// @12C: getstatic game.C_100280_nf game.C_100169_co.field_105525_e
		// @12F: getfield byte[] game.C_100280_nf.field_101179_l
		// @132: iconst_0
		// @133: getstatic game.C_100280_nf game.C_100169_co.field_105525_e
		// @136: getfield int game.C_100280_nf.field_101177_n
		// @139: bipush -88 (0xA8)
		// @13B: invokevirtual game.C_100280_nf.func_101165_b(byte[], int, int, int)void
		// @13E: goto @1E1
		// @141: astore #7
		// @143: aload #7
		// @145: new java.lang.StringBuilder
		// @148: dup
		// @149: invokespecial java.lang.StringBuilder.<init>()void
		// @14C: getstatic java.lang.String[] game.C_100155_dc.field_105354_z
		// @14F: iconst_2
		// @150: aaload
		// @151: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @154: aload_0
		// @155: ifnull @161
		// @158: getstatic java.lang.String[] game.C_100155_dc.field_105354_z
		// @15B: iconst_0
		// @15C: aaload
		// @15D: goto @166
		// @160: athrow
		// @161: getstatic java.lang.String[] game.C_100155_dc.field_105354_z
		// @164: iconst_1
		// @165: aaload
		// @166: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @169: bipush 44 (0x2C)
		// @16B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16E: iload_1
		// @16F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @172: bipush 44 (0x2C)
		// @174: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @177: iload_2
		// @178: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @17B: bipush 44 (0x2C)
		// @17D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @180: aload_3
		// @181: ifnull @18D
		// @184: getstatic java.lang.String[] game.C_100155_dc.field_105354_z
		// @187: iconst_0
		// @188: aaload
		// @189: goto @192
		// @18C: athrow
		// @18D: getstatic java.lang.String[] game.C_100155_dc.field_105354_z
		// @190: iconst_1
		// @191: aaload
		// @192: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @195: bipush 44 (0x2C)
		// @197: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @19A: aload #4
		// @19C: ifnull @1A8
		// @19F: getstatic java.lang.String[] game.C_100155_dc.field_105354_z
		// @1A2: iconst_0
		// @1A3: aaload
		// @1A4: goto @1AD
		// @1A7: athrow
		// @1A8: getstatic java.lang.String[] game.C_100155_dc.field_105354_z
		// @1AB: iconst_1
		// @1AC: aaload
		// @1AD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1B0: bipush 44 (0x2C)
		// @1B2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1B5: aload #5
		// @1B7: ifnull @1C3
		// @1BA: getstatic java.lang.String[] game.C_100155_dc.field_105354_z
		// @1BD: iconst_0
		// @1BE: aaload
		// @1BF: goto @1C8
		// @1C2: athrow
		// @1C3: getstatic java.lang.String[] game.C_100155_dc.field_105354_z
		// @1C6: iconst_1
		// @1C7: aaload
		// @1C8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1CB: bipush 44 (0x2C)
		// @1CD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D0: iload #6
		// @1D2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1D5: bipush 41 (0x29)
		// @1D7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1DA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1DD: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1E0: athrow
		// @1E1: return
	}
	
	static final C_100233_oa func_105344_a(int arg0)
	{
		// @00: getstatic game.C_100233_oa game.C_100256_pk.field_100478_r
		// @03: ifnull @0A
		// @06: goto @5C
		// @09: athrow
		// @0A: new game.C_100233_oa
		// @0D: dup
		// @0E: invokespecial game.C_100233_oa.<init>()void
		// @11: putstatic game.C_100233_oa game.C_100256_pk.field_100478_r
		// @14: getstatic game.C_100233_oa game.C_100256_pk.field_100478_r
		// @17: iconst_m1
		// @18: getstatic game.C_100112_r game.C_100230_of.field_106205_g
		// @1B: invokevirtual game.C_100233_oa.func_106232_a(int, game.C_100112_r)void
		// @1E: getstatic game.C_100233_oa game.C_100256_pk.field_100478_r
		// @21: iconst_4
		// @22: putfield int game.C_100233_oa.field_106241_A
		// @25: getstatic game.C_100233_oa game.C_100256_pk.field_100478_r
		// @28: iconst_5
		// @29: putfield int game.C_100233_oa.field_106254_u
		// @2C: getstatic game.C_100233_oa game.C_100256_pk.field_100478_r
		// @2F: bipush 14 (0x0E)
		// @31: putfield int game.C_100233_oa.field_106243_a
		// @34: getstatic game.C_100233_oa game.C_100256_pk.field_100478_r
		// @37: ldc 7697781 (0x757575)
		// @39: putfield int game.C_100233_oa.field_106251_i
		// @3C: getstatic game.C_100233_oa game.C_100256_pk.field_100478_r
		// @3F: bipush 6 (0x06)
		// @41: putfield int game.C_100233_oa.field_106248_j
		// @44: getstatic game.C_100233_oa game.C_100256_pk.field_100478_r
		// @47: ldc 2763306 (0x2a2a2a)
		// @49: putfield int game.C_100233_oa.field_106240_c
		// @4C: getstatic game.C_100233_oa game.C_100256_pk.field_100478_r
		// @4F: iconst_0
		// @50: putfield int game.C_100233_oa.field_106249_k
		// @53: getstatic game.C_100233_oa game.C_100256_pk.field_100478_r
		// @56: getstatic game.C_100112_r game.C_100318_hj.field_107198_b
		// @59: putfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @5C: iload_0
		// @5D: sipush -16966 (0xBDBA)
		// @60: if_icmpeq @71
		// @63: bipush 53 (0x35)
		// @65: aconst_null
		// @66: checkcast java.lang.String
		// @69: invokestatic game.C_100155_dc.func_105342_a(int, java.lang.String)java.lang.String
		// @6C: pop
		// @6D: goto @71
		// @70: athrow
		// @71: getstatic game.C_100233_oa game.C_100256_pk.field_100478_r
		// @74: areturn
		// @75: astore_1
		// @76: aload_1
		// @77: new java.lang.StringBuilder
		// @7A: dup
		// @7B: invokespecial java.lang.StringBuilder.<init>()void
		// @7E: getstatic java.lang.String[] game.C_100155_dc.field_105354_z
		// @81: iconst_4
		// @82: aaload
		// @83: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @86: iload_0
		// @87: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8A: bipush 41 (0x29)
		// @8C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @92: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @95: athrow
	}
	
	public static void func_105341_b(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic long[] game.C_100155_dc.field_105353_a
		// @04: iload_0
		// @05: sipush -27018 (0x9676)
		// @08: if_icmpeq @28
		// @0B: aconst_null
		// @0C: checkcast java.math.BigInteger
		// @0F: bipush 114 (0x72)
		// @11: bipush 122 (0x7A)
		// @13: aconst_null
		// @14: checkcast game.C_100280_nf
		// @17: aconst_null
		// @18: checkcast byte[]
		// @1B: aconst_null
		// @1C: checkcast java.math.BigInteger
		// @1F: bipush 101 (0x65)
		// @21: invokestatic game.C_100155_dc.func_105346_a(java.math.BigInteger, byte, int, game.C_100280_nf, byte[], java.math.BigInteger, int)void
		// @24: goto @28
		// @27: athrow
		// @28: aconst_null
		// @29: putstatic java.lang.String game.C_100155_dc.field_105349_d
		// @2C: aconst_null
		// @2D: putstatic game.C_100037_wb[] game.C_100155_dc.field_105352_c
		// @30: aconst_null
		// @31: putstatic java.lang.String game.C_100155_dc.field_105350_e
		// @34: aconst_null
		// @35: putstatic java.lang.String game.C_100155_dc.field_105347_f
		// @38: aconst_null
		// @39: putstatic java.lang.String game.C_100155_dc.field_105348_g
		// @3C: aconst_null
		// @3D: putstatic game.C_100098_h game.C_100155_dc.field_105351_b
		// @40: goto @64
		// @43: astore_1
		// @44: aload_1
		// @45: new java.lang.StringBuilder
		// @48: dup
		// @49: invokespecial java.lang.StringBuilder.<init>()void
		// @4C: getstatic java.lang.String[] game.C_100155_dc.field_105354_z
		// @4F: iconst_3
		// @50: aaload
		// @51: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @54: iload_0
		// @55: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @58: bipush 41 (0x29)
		// @5A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @60: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @63: athrow
		// @64: return
	}
	
	static final String func_105342_a(int arg0, String arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: aload_1
		// @06: invokevirtual java.lang.String.length()int
		// @09: istore_2
		// @0A: iload_2
		// @0B: newarray char[]
		// @0D: astore_3
		// @0E: iload_0
		// @0F: istore #4
		// @11: iload #4
		// @13: iconst_m1
		// @14: ixor
		// @15: iload_2
		// @16: iconst_m1
		// @17: ixor
		// @18: if_icmple @32
		// @1B: aload_3
		// @1C: iload #4
		// @1E: ineg
		// @1F: iload_2
		// @20: iadd
		// @21: iconst_m1
		// @22: iadd
		// @23: aload_1
		// @24: iload #4
		// @26: invokevirtual java.lang.String.charAt(int)char
		// @29: castore
		// @2A: iinc #4 +1
		// @2D: iload #5
		// @2F: ifeq @11
		// @32: new java.lang.String
		// @35: dup
		// @36: aload_3
		// @37: invokespecial java.lang.String.<init>(char[])void
		// @3A: areturn
		// @3B: astore_2
		// @3C: aload_2
		// @3D: new java.lang.StringBuilder
		// @40: dup
		// @41: invokespecial java.lang.StringBuilder.<init>()void
		// @44: getstatic java.lang.String[] game.C_100155_dc.field_105354_z
		// @47: iconst_5
		// @48: aaload
		// @49: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4C: iload_0
		// @4D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @50: bipush 44 (0x2C)
		// @52: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @55: aload_1
		// @56: ifnull @62
		// @59: getstatic java.lang.String[] game.C_100155_dc.field_105354_z
		// @5C: iconst_0
		// @5D: aaload
		// @5E: goto @67
		// @61: athrow
		// @62: getstatic java.lang.String[] game.C_100155_dc.field_105354_z
		// @65: iconst_1
		// @66: aaload
		// @67: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6A: bipush 41 (0x29)
		// @6C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @72: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @75: athrow
	}
	
	static
	{
		// @00: bipush 6 (0x06)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "G\u0003-\u0019b"
		// @09: invokestatic game.C_100155_dc.func_105345_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100155_dc.func_105343_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "RXo["
		// @14: invokestatic game.C_100155_dc.func_105345_z(java.lang.String)char[]
		// @17: invokestatic game.C_100155_dc.func_105343_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "XN-s7"
		// @1F: invokestatic game.C_100155_dc.func_105345_z(java.lang.String)char[]
		// @22: invokestatic game.C_100155_dc.func_105343_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "XN-u7"
		// @2A: invokestatic game.C_100155_dc.func_105345_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100155_dc.func_105343_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "XN-t7"
		// @35: invokestatic game.C_100155_dc.func_105345_z(java.lang.String)char[]
		// @38: invokestatic game.C_100155_dc.func_105343_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "XN-v7"
		// @40: invokestatic game.C_100155_dc.func_105345_z(java.lang.String)char[]
		// @43: invokestatic game.C_100155_dc.func_105343_z(char[])java.lang.String
		// @46: aastore
		// @47: putstatic java.lang.String[] game.C_100155_dc.field_105354_z
		// @4A: sipush 256 (0x0100)
		// @4D: newarray long[]
		// @4F: putstatic long[] game.C_100155_dc.field_105353_a
		// @52: iconst_0
		// @53: istore_2
		// @54: sipush -257 (0xFEFF)
		// @57: iload_2
		// @58: iconst_m1
		// @59: ixor
		// @5A: if_icmpge @9E
		// @5D: iload_2
		// @5E: i2l
		// @5F: lstore_0
		// @60: iconst_0
		// @61: istore_3
		// @62: bipush -9 (0xF7)
		// @64: iload_3
		// @65: iconst_m1
		// @66: ixor
		// @67: if_icmpge @92
		// @6A: lload_0
		// @6B: lconst_1
		// @6C: land
		// @6D: ldc2_w -1
		// @70: lxor
		// @71: ldc2_w -2
		// @74: lcmp
		// @75: ifeq @83
		// @78: goto @7C
		// @7B: athrow
		// @7C: lload_0
		// @7D: iconst_1
		// @7E: lushr
		// @7F: lstore_0
		// @80: goto @8C
		// @83: lload_0
		// @84: ldc -866123775 (0xcc600001)
		// @86: lushr
		// @87: ldc2_w -3932672073523589310
		// @8A: lxor
		// @8B: lstore_0
		// @8C: iinc #3 +1
		// @8F: goto @62
		// @92: getstatic long[] game.C_100155_dc.field_105353_a
		// @95: iload_2
		// @96: lload_0
		// @97: lastore
		// @98: iinc #2 +1
		// @9B: goto @54
		// @9E: ldc "y_qXm\u001cNlYqYNw^q[\rwX?OHqAzN\u0003#gsYLpR?H_z\u0017jODmP?]\rg^yZHqRqH\rpRmJHq\u0019"
		// @A0: invokestatic game.C_100155_dc.func_105345_z(java.lang.String)char[]
		// @A3: invokestatic game.C_100155_dc.func_105343_z(char[])java.lang.String
		// @A6: putstatic java.lang.String game.C_100155_dc.field_105350_e
		// @A9: ldc "eBv\u0017w][f\u0017kTH#Z~DDnBr\u001cCvZ}Y_#Xy\u001cKbApI_jCzO\rb[mYLgN?OLuR{\u0012\rZXj\u001c@vDk\u001cIf[zHH#XqY\raRyS_f\u0017fSX#T~R\rpViY\rbYf\u001c@lEz\u0012"
		// @AB: invokestatic game.C_100155_dc.func_105345_z(java.lang.String)char[]
		// @AE: invokestatic game.C_100155_dc.func_105343_z(char[])java.lang.String
		// @B1: putstatic java.lang.String game.C_100155_dc.field_105349_d
		// @B4: ldc "iCbUsY\rwX?XHoRkY\rmVrY\r.\u0017lE^wRr\u001cOvDf"
		// @B6: invokestatic game.C_100155_dc.func_105345_z(java.lang.String)char[]
		// @B9: invokestatic game.C_100155_dc.func_105343_z(char[])java.lang.String
		// @BC: putstatic java.lang.String game.C_100155_dc.field_105347_f
		// @BF: ldc "lAbN?HEf\u0017x]@f\u0017hUYkXjH\roXx[DmP?UC#]jOY#NzH"
		// @C1: invokestatic game.C_100155_dc.func_105345_z(java.lang.String)char[]
		// @C4: invokestatic game.C_100155_dc.func_105343_z(char[])java.lang.String
		// @C7: putstatic java.lang.String game.C_100155_dc.field_105348_g
		// @CA: return
	}
	
	private static char[] func_105345_z(String arg0)
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
		// @0E: bipush 31 (0x1F)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105343_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @3A, for 3: @3E
		// @30: bipush 60 (0x3C)
		// @32: goto @45
		// @35: bipush 45 (0x2D)
		// @37: goto @45
		// @3A: iconst_3
		// @3B: goto @45
		// @3E: bipush 55 (0x37)
		// @40: goto @45
		// @43: bipush 31 (0x1F)
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
