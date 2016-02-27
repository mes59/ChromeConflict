package game;

final class C_100141_tc
{
	static String field_105057_f;
	static int field_105065_o;
	private long[] field_105061_b;
	static C_100230_of field_105068_j;
	static String field_105070_h;
	static String field_105060_e;
	private long[] field_105073_q;
	private long[] field_105066_l;
	static String field_105062_c;
	private long[] field_105063_a;
	static String field_105071_i;
	private byte[] field_105072_r;
	private byte[] field_105074_p;
	private long[] field_105058_g;
	static int[] field_105069_k;
	private int field_105067_m;
	static String field_105059_d;
	private int field_105064_n;
	private static final String[] field_105075_z;
	
	private final void func_105049_a(byte arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: iload_1
		// @006: bipush 64 (0x40)
		// @008: if_icmpeq @015
		// @00B: iconst_0
		// @00C: bipush -12 (0xF4)
		// @00E: invokestatic game.C_100141_tc.func_105053_a(boolean, int)void
		// @011: goto @015
		// @014: athrow
		// @015: iconst_0
		// @016: istore_2
		// @017: iconst_0
		// @018: istore_3
		// @019: iload_2
		// @01A: bipush 8 (0x08)
		// @01C: if_icmpge @0D6
		// @01F: aload_0
		// @020: getfield long[] game.C_100141_tc.field_105058_g
		// @023: iload_2
		// @024: ldc2_w 255
		// @027: aload_0
		// @028: getfield byte[] game.C_100141_tc.field_105074_p
		// @02B: iload_3
		// @02C: bipush -6 (0xFA)
		// @02E: isub
		// @02F: baload
		// @030: i2l
		// @031: invokestatic game.C_100336_im.func_102514_a(long, long)long
		// @034: ldc -1307351224 (0xb2136748)
		// @036: lshl
		// @037: aload_0
		// @038: getfield byte[] game.C_100141_tc.field_105074_p
		// @03B: iload_3
		// @03C: baload
		// @03D: i2l
		// @03E: ldc -645633992 (0xd9846838)
		// @040: lshl
		// @041: aload_0
		// @042: getfield byte[] game.C_100141_tc.field_105074_p
		// @045: iconst_1
		// @046: iload_3
		// @047: iadd
		// @048: baload
		// @049: i2l
		// @04A: ldc 1877698672 (0x6feb6870)
		// @04C: lshl
		// @04D: ldc2_w 71776119061217280
		// @050: invokestatic game.C_100336_im.func_102514_a(long, long)long
		// @053: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @056: aload_0
		// @057: getfield byte[] game.C_100141_tc.field_105074_p
		// @05A: iload_3
		// @05B: bipush -2 (0xFE)
		// @05D: isub
		// @05E: baload
		// @05F: i2l
		// @060: ldc2_w 255
		// @063: invokestatic game.C_100336_im.func_102514_a(long, long)long
		// @066: ldc 612708648 (0x24853128)
		// @068: lshl
		// @069: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @06C: aload_0
		// @06D: getfield byte[] game.C_100141_tc.field_105074_p
		// @070: iconst_3
		// @071: iload_3
		// @072: iadd
		// @073: baload
		// @074: i2l
		// @075: ldc2_w 255
		// @078: invokestatic game.C_100336_im.func_102514_a(long, long)long
		// @07B: ldc -1554621536 (0xa3565ba0)
		// @07D: lshl
		// @07E: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @081: ldc2_w 255
		// @084: aload_0
		// @085: getfield byte[] game.C_100141_tc.field_105074_p
		// @088: iconst_4
		// @089: iload_3
		// @08A: iadd
		// @08B: baload
		// @08C: i2l
		// @08D: invokestatic game.C_100336_im.func_102514_a(long, long)long
		// @090: ldc 1512640856 (0x5a291158)
		// @092: lshl
		// @093: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @096: ldc2_w 16711680
		// @099: aload_0
		// @09A: getfield byte[] game.C_100141_tc.field_105074_p
		// @09D: iconst_5
		// @09E: iload_3
		// @09F: iadd
		// @0A0: baload
		// @0A1: i2l
		// @0A2: ldc -87775344 (0xfac4a790)
		// @0A4: lshl
		// @0A5: invokestatic game.C_100336_im.func_102514_a(long, long)long
		// @0A8: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @0AB: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @0AE: ldc2_w 255
		// @0B1: aload_0
		// @0B2: getfield byte[] game.C_100141_tc.field_105074_p
		// @0B5: bipush 7 (0x07)
		// @0B7: iload_3
		// @0B8: iadd
		// @0B9: baload
		// @0BA: i2l
		// @0BB: invokestatic game.C_100336_im.func_102514_a(long, long)long
		// @0BE: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @0C1: lastore
		// @0C2: iinc #3 +8
		// @0C5: iinc #2 +1
		// @0C8: iload #6
		// @0CA: ifne @0D8
		// @0CD: iload #6
		// @0CF: ifeq @019
		// @0D2: goto @0D6
		// @0D5: athrow
		// @0D6: iconst_0
		// @0D7: istore_2
		// @0D8: iload_2
		// @0D9: bipush 8 (0x08)
		// @0DB: if_icmpge @10F
		// @0DE: aload_0
		// @0DF: getfield long[] game.C_100141_tc.field_105073_q
		// @0E2: iload_2
		// @0E3: aload_0
		// @0E4: getfield long[] game.C_100141_tc.field_105058_g
		// @0E7: iload_2
		// @0E8: laload
		// @0E9: aload_0
		// @0EA: getfield long[] game.C_100141_tc.field_105063_a
		// @0ED: iload_2
		// @0EE: aload_0
		// @0EF: getfield long[] game.C_100141_tc.field_105061_b
		// @0F2: iload_2
		// @0F3: laload
		// @0F4: dup2_x2
		// @0F5: lastore
		// @0F6: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @0F9: lastore
		// @0FA: iinc #2 +1
		// @0FD: iload #6
		// @0FF: ifne @111
		// @102: goto @106
		// @105: athrow
		// @106: iload #6
		// @108: ifeq @0D8
		// @10B: goto @10F
		// @10E: athrow
		// @10F: iconst_1
		// @110: istore_2
		// @111: bipush 10 (0x0A)
		// @113: iload_2
		// @114: if_icmplt @26D
		// @117: iconst_0
		// @118: iload #6
		// @11A: ifne @26E
		// @11D: goto @121
		// @120: athrow
		// @121: istore_3
		// @122: bipush -9 (0xF7)
		// @124: iload_3
		// @125: iconst_m1
		// @126: ixor
		// @127: if_icmpge @191
		// @12A: aload_0
		// @12B: getfield long[] game.C_100141_tc.field_105066_l
		// @12E: iload_3
		// @12F: lconst_0
		// @130: lastore
		// @131: iconst_0
		// @132: istore #4
		// @134: bipush 56 (0x38)
		// @136: iload #6
		// @138: ifne @192
		// @13B: istore #5
		// @13D: bipush -9 (0xF7)
		// @13F: iload #4
		// @141: iconst_m1
		// @142: ixor
		// @143: if_icmpge @189
		// @146: aload_0
		// @147: getfield long[] game.C_100141_tc.field_105066_l
		// @14A: iload_3
		// @14B: aload_0
		// @14C: getfield long[] game.C_100141_tc.field_105066_l
		// @14F: iload_3
		// @150: laload
		// @151: getstatic long[][] game.C_100304_kl.field_107119_k
		// @154: iload #4
		// @156: aaload
		// @157: sipush 255 (0x00FF)
		// @15A: aload_0
		// @15B: getfield long[] game.C_100141_tc.field_105063_a
		// @15E: iload_3
		// @15F: iload #4
		// @161: ineg
		// @162: iadd
		// @163: bipush 7 (0x07)
		// @165: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @168: laload
		// @169: iload #5
		// @16B: lushr
		// @16C: l2i
		// @16D: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @170: laload
		// @171: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @174: lastore
		// @175: iinc #4 +1
		// @178: iinc #5 +248
		// @17B: iload #6
		// @17D: ifne @18C
		// @180: iload #6
		// @182: ifeq @13D
		// @185: goto @189
		// @188: athrow
		// @189: iinc #3 +1
		// @18C: iload #6
		// @18E: ifeq @122
		// @191: iconst_0
		// @192: istore_3
		// @193: iload_3
		// @194: bipush 8 (0x08)
		// @196: if_icmpge @1B6
		// @199: aload_0
		// @19A: getfield long[] game.C_100141_tc.field_105063_a
		// @19D: iload_3
		// @19E: aload_0
		// @19F: getfield long[] game.C_100141_tc.field_105066_l
		// @1A2: iload_3
		// @1A3: laload
		// @1A4: lastore
		// @1A5: iinc #3 +1
		// @1A8: iload #6
		// @1AA: ifne @1CA
		// @1AD: iload #6
		// @1AF: ifeq @193
		// @1B2: goto @1B6
		// @1B5: athrow
		// @1B6: aload_0
		// @1B7: getfield long[] game.C_100141_tc.field_105063_a
		// @1BA: iconst_0
		// @1BB: aload_0
		// @1BC: getfield long[] game.C_100141_tc.field_105063_a
		// @1BF: iconst_0
		// @1C0: laload
		// @1C1: getstatic long[] game.C_100304_kl.field_107114_b
		// @1C4: iload_2
		// @1C5: laload
		// @1C6: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @1C9: lastore
		// @1CA: iconst_0
		// @1CB: istore_3
		// @1CC: iload_3
		// @1CD: bipush 8 (0x08)
		// @1CF: if_icmpge @23E
		// @1D2: aload_0
		// @1D3: getfield long[] game.C_100141_tc.field_105066_l
		// @1D6: iload_3
		// @1D7: aload_0
		// @1D8: getfield long[] game.C_100141_tc.field_105063_a
		// @1DB: iload_3
		// @1DC: laload
		// @1DD: lastore
		// @1DE: iconst_0
		// @1DF: istore #4
		// @1E1: bipush 56 (0x38)
		// @1E3: iload #6
		// @1E5: ifne @23F
		// @1E8: istore #5
		// @1EA: bipush -9 (0xF7)
		// @1EC: iload #4
		// @1EE: iconst_m1
		// @1EF: ixor
		// @1F0: if_icmpge @236
		// @1F3: aload_0
		// @1F4: getfield long[] game.C_100141_tc.field_105066_l
		// @1F7: iload_3
		// @1F8: aload_0
		// @1F9: getfield long[] game.C_100141_tc.field_105066_l
		// @1FC: iload_3
		// @1FD: laload
		// @1FE: getstatic long[][] game.C_100304_kl.field_107119_k
		// @201: iload #4
		// @203: aaload
		// @204: aload_0
		// @205: getfield long[] game.C_100141_tc.field_105073_q
		// @208: iload #4
		// @20A: ineg
		// @20B: iload_3
		// @20C: iadd
		// @20D: bipush 7 (0x07)
		// @20F: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @212: laload
		// @213: iload #5
		// @215: lushr
		// @216: l2i
		// @217: sipush 255 (0x00FF)
		// @21A: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @21D: laload
		// @21E: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @221: lastore
		// @222: iinc #4 +1
		// @225: iinc #5 +248
		// @228: iload #6
		// @22A: ifne @239
		// @22D: iload #6
		// @22F: ifeq @1EA
		// @232: goto @236
		// @235: athrow
		// @236: iinc #3 +1
		// @239: iload #6
		// @23B: ifeq @1CC
		// @23E: iconst_0
		// @23F: istore_3
		// @240: bipush -9 (0xF7)
		// @242: iload_3
		// @243: iconst_m1
		// @244: ixor
		// @245: if_icmpge @265
		// @248: aload_0
		// @249: getfield long[] game.C_100141_tc.field_105073_q
		// @24C: iload_3
		// @24D: aload_0
		// @24E: getfield long[] game.C_100141_tc.field_105066_l
		// @251: iload_3
		// @252: laload
		// @253: lastore
		// @254: iinc #3 +1
		// @257: iload #6
		// @259: ifne @268
		// @25C: iload #6
		// @25E: ifeq @240
		// @261: goto @265
		// @264: athrow
		// @265: iinc #2 +1
		// @268: iload #6
		// @26A: ifeq @111
		// @26D: iconst_0
		// @26E: istore_2
		// @26F: iload_2
		// @270: iconst_m1
		// @271: ixor
		// @272: bipush -9 (0xF7)
		// @274: if_icmple @2A6
		// @277: aload_0
		// @278: getfield long[] game.C_100141_tc.field_105061_b
		// @27B: iload_2
		// @27C: aload_0
		// @27D: getfield long[] game.C_100141_tc.field_105061_b
		// @280: iload_2
		// @281: laload
		// @282: aload_0
		// @283: getfield long[] game.C_100141_tc.field_105058_g
		// @286: iload_2
		// @287: laload
		// @288: aload_0
		// @289: getfield long[] game.C_100141_tc.field_105073_q
		// @28C: iload_2
		// @28D: laload
		// @28E: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @291: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @294: lastore
		// @295: iinc #2 +1
		// @298: iload #6
		// @29A: ifne @2CB
		// @29D: iload #6
		// @29F: ifeq @26F
		// @2A2: goto @2A6
		// @2A5: athrow
		// @2A6: goto @2CB
		// @2A9: astore_2
		// @2AA: aload_2
		// @2AB: new java.lang.StringBuilder
		// @2AE: dup
		// @2AF: invokespecial java.lang.StringBuilder.<init>()void
		// @2B2: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @2B5: bipush 7 (0x07)
		// @2B7: aaload
		// @2B8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2BB: iload_1
		// @2BC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2BF: bipush 41 (0x29)
		// @2C1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2C7: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2CA: athrow
		// @2CB: return
	}
	
	final void func_105045_a(byte[] arg0, int arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: aload_0
		// @006: getfield byte[] game.C_100141_tc.field_105074_p
		// @009: aload_0
		// @00A: getfield int game.C_100141_tc.field_105064_n
		// @00D: aload_0
		// @00E: getfield byte[] game.C_100141_tc.field_105074_p
		// @011: aload_0
		// @012: getfield int game.C_100141_tc.field_105064_n
		// @015: baload
		// @016: sipush 128 (0x0080)
		// @019: bipush 7 (0x07)
		// @01B: aload_0
		// @01C: getfield int game.C_100141_tc.field_105067_m
		// @01F: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @022: iushr
		// @023: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @026: i2b
		// @027: bastore
		// @028: aload_0
		// @029: dup
		// @02A: getfield int game.C_100141_tc.field_105064_n
		// @02D: iconst_1
		// @02E: iadd
		// @02F: putfield int game.C_100141_tc.field_105064_n
		// @032: aload_0
		// @033: getfield int game.C_100141_tc.field_105064_n
		// @036: iconst_m1
		// @037: ixor
		// @038: bipush -33 (0xDF)
		// @03A: if_icmpge @076
		// @03D: aload_0
		// @03E: getfield int game.C_100141_tc.field_105064_n
		// @041: iconst_m1
		// @042: ixor
		// @043: bipush -65 (0xBF)
		// @045: if_icmple @06B
		// @048: goto @04C
		// @04B: athrow
		// @04C: aload_0
		// @04D: getfield byte[] game.C_100141_tc.field_105074_p
		// @050: aload_0
		// @051: dup
		// @052: getfield int game.C_100141_tc.field_105064_n
		// @055: dup_x1
		// @056: iconst_1
		// @057: iadd
		// @058: putfield int game.C_100141_tc.field_105064_n
		// @05B: iconst_0
		// @05C: bastore
		// @05D: iload #8
		// @05F: ifne @071
		// @062: iload #8
		// @064: ifeq @03D
		// @067: goto @06B
		// @06A: athrow
		// @06B: aload_0
		// @06C: bipush 64 (0x40)
		// @06E: invokespecial game.C_100141_tc.func_105049_a(byte)void
		// @071: aload_0
		// @072: iconst_0
		// @073: putfield int game.C_100141_tc.field_105064_n
		// @076: bipush -33 (0xDF)
		// @078: aload_0
		// @079: getfield int game.C_100141_tc.field_105064_n
		// @07C: iconst_m1
		// @07D: ixor
		// @07E: if_icmpge @0A0
		// @081: aload_0
		// @082: getfield byte[] game.C_100141_tc.field_105074_p
		// @085: aload_0
		// @086: dup
		// @087: getfield int game.C_100141_tc.field_105064_n
		// @08A: dup_x1
		// @08B: iconst_1
		// @08C: iadd
		// @08D: putfield int game.C_100141_tc.field_105064_n
		// @090: iconst_0
		// @091: bastore
		// @092: iload #8
		// @094: ifne @0B6
		// @097: iload #8
		// @099: ifeq @076
		// @09C: goto @0A0
		// @09F: athrow
		// @0A0: aload_0
		// @0A1: getfield byte[] game.C_100141_tc.field_105072_r
		// @0A4: iconst_0
		// @0A5: aload_0
		// @0A6: getfield byte[] game.C_100141_tc.field_105074_p
		// @0A9: bipush 32 (0x20)
		// @0AB: bipush 32 (0x20)
		// @0AD: invokestatic game.C_100120_en.func_104911_a(byte[], int, byte[], int, int)void
		// @0B0: aload_0
		// @0B1: bipush 64 (0x40)
		// @0B3: invokespecial game.C_100141_tc.func_105049_a(byte)void
		// @0B6: iconst_0
		// @0B7: istore #4
		// @0B9: iload_3
		// @0BA: sipush 3677 (0x0E5D)
		// @0BD: if_icmpeq @0CB
		// @0C0: aconst_null
		// @0C1: checkcast game.C_100230_of
		// @0C4: putstatic game.C_100230_of game.C_100141_tc.field_105068_j
		// @0C7: goto @0CB
		// @0CA: athrow
		// @0CB: iload_2
		// @0CC: istore #5
		// @0CE: bipush -9 (0xF7)
		// @0D0: iload #4
		// @0D2: iconst_m1
		// @0D3: ixor
		// @0D4: if_icmpge @15B
		// @0D7: aload_0
		// @0D8: getfield long[] game.C_100141_tc.field_105061_b
		// @0DB: iload #4
		// @0DD: laload
		// @0DE: lstore #6
		// @0E0: aload_1
		// @0E1: iload #5
		// @0E3: lload #6
		// @0E5: ldc -1610534152 (0xa00132f8)
		// @0E7: lushr
		// @0E8: l2i
		// @0E9: i2b
		// @0EA: bastore
		// @0EB: aload_1
		// @0EC: iload #5
		// @0EE: iconst_1
		// @0EF: iadd
		// @0F0: lload #6
		// @0F2: ldc -522021264 (0xe0e29670)
		// @0F4: lushr
		// @0F5: l2i
		// @0F6: i2b
		// @0F7: bastore
		// @0F8: aload_1
		// @0F9: iload #5
		// @0FB: bipush -2 (0xFE)
		// @0FD: isub
		// @0FE: lload #6
		// @100: ldc 1896812264 (0x710f0ee8)
		// @102: lushr
		// @103: l2i
		// @104: i2b
		// @105: bastore
		// @106: aload_1
		// @107: iconst_3
		// @108: iload #5
		// @10A: iadd
		// @10B: lload #6
		// @10D: ldc -1102935712 (0xbe428960)
		// @10F: lushr
		// @110: l2i
		// @111: i2b
		// @112: bastore
		// @113: aload_1
		// @114: iconst_4
		// @115: iload #5
		// @117: iadd
		// @118: lload #6
		// @11A: ldc -211270632 (0xf3684418)
		// @11C: lushr
		// @11D: l2i
		// @11E: i2b
		// @11F: bastore
		// @120: aload_1
		// @121: iload #5
		// @123: bipush -5 (0xFB)
		// @125: isub
		// @126: lload #6
		// @128: ldc -1518563184 (0xa57c9090)
		// @12A: lushr
		// @12B: l2i
		// @12C: i2b
		// @12D: bastore
		// @12E: aload_1
		// @12F: bipush 6 (0x06)
		// @131: iload #5
		// @133: iadd
		// @134: lload #6
		// @136: ldc 1390784520 (0x52e5b008)
		// @138: lushr
		// @139: l2i
		// @13A: i2b
		// @13B: bastore
		// @13C: aload_1
		// @13D: bipush 7 (0x07)
		// @13F: iload #5
		// @141: iadd
		// @142: lload #6
		// @144: l2i
		// @145: i2b
		// @146: bastore
		// @147: iinc #5 +8
		// @14A: iinc #4 +1
		// @14D: iload #8
		// @14F: ifne @1A4
		// @152: iload #8
		// @154: ifeq @0CE
		// @157: goto @15B
		// @15A: athrow
		// @15B: goto @1A4
		// @15E: astore #4
		// @160: aload #4
		// @162: new java.lang.StringBuilder
		// @165: dup
		// @166: invokespecial java.lang.StringBuilder.<init>()void
		// @169: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @16C: iconst_0
		// @16D: aaload
		// @16E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @171: aload_1
		// @172: ifnull @17E
		// @175: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @178: iconst_1
		// @179: aaload
		// @17A: goto @183
		// @17D: athrow
		// @17E: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @181: iconst_2
		// @182: aaload
		// @183: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @186: bipush 44 (0x2C)
		// @188: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @18B: iload_2
		// @18C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @18F: bipush 44 (0x2C)
		// @191: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @194: iload_3
		// @195: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @198: bipush 41 (0x29)
		// @19A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @19D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1A0: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1A3: athrow
		// @1A4: return
	}
	
	static final int func_105046_a(int arg0, int arg1, int arg2)
	{
		// @00: getstatic game.C_100037_wb game.C_100061_dh.field_101981_Zb
		// @03: ifnonnull @08
		// @06: iconst_m1
		// @07: ireturn
		// @08: iload_1
		// @09: bipush 7 (0x07)
		// @0B: if_icmpeq @11
		// @0E: bipush 127 (0x7F)
		// @10: ireturn
		// @11: iload_2
		// @12: iconst_m1
		// @13: ixor
		// @14: getstatic int game.C_100200_ba.field_105849_d
		// @17: iconst_m1
		// @18: ixor
		// @19: if_icmpgt @55
		// @1C: getstatic int game.C_100200_ba.field_105849_d
		// @1F: getstatic game.C_100037_wb game.C_100061_dh.field_101981_Zb
		// @22: getfield int game.C_100037_wb.field_102339_s
		// @25: iadd
		// @26: iload_2
		// @27: if_icmple @55
		// @2A: goto @2E
		// @2D: athrow
		// @2E: iload_0
		// @2F: getstatic int game.C_100006_fj.field_103616_f
		// @32: if_icmplt @55
		// @35: goto @39
		// @38: athrow
		// @39: iload_0
		// @3A: iconst_m1
		// @3B: ixor
		// @3C: getstatic int game.C_100006_fj.field_103616_f
		// @3F: getstatic game.C_100037_wb game.C_100061_dh.field_101981_Zb
		// @42: getfield int game.C_100037_wb.field_102337_u
		// @45: iadd
		// @46: iconst_m1
		// @47: ixor
		// @48: if_icmpgt @53
		// @4B: goto @4F
		// @4E: athrow
		// @4F: goto @55
		// @52: athrow
		// @53: iconst_0
		// @54: ireturn
		// @55: iload_2
		// @56: iconst_m1
		// @57: ixor
		// @58: getstatic int game.C_100114_q.field_100488_w
		// @5B: iconst_m1
		// @5C: ixor
		// @5D: if_icmpgt @96
		// @60: getstatic int game.C_100114_q.field_100488_w
		// @63: getstatic game.C_100037_wb game.C_100061_dh.field_101981_Zb
		// @66: getfield int game.C_100037_wb.field_102339_s
		// @69: ineg
		// @6A: isub
		// @6B: iload_2
		// @6C: if_icmple @96
		// @6F: goto @73
		// @72: athrow
		// @73: getstatic int game.C_100310_lj.field_100548_z
		// @76: iload_0
		// @77: if_icmpgt @96
		// @7A: goto @7E
		// @7D: athrow
		// @7E: getstatic int game.C_100310_lj.field_100548_z
		// @81: getstatic game.C_100037_wb game.C_100061_dh.field_101981_Zb
		// @84: getfield int game.C_100037_wb.field_102337_u
		// @87: iadd
		// @88: iload_0
		// @89: if_icmpgt @94
		// @8C: goto @90
		// @8F: athrow
		// @90: goto @96
		// @93: athrow
		// @94: iconst_1
		// @95: ireturn
		// @96: iconst_m1
		// @97: ireturn
		// @98: astore_3
		// @99: aload_3
		// @9A: new java.lang.StringBuilder
		// @9D: dup
		// @9E: invokespecial java.lang.StringBuilder.<init>()void
		// @A1: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @A4: bipush 6 (0x06)
		// @A6: aaload
		// @A7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AA: iload_0
		// @AB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AE: bipush 44 (0x2C)
		// @B0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B3: iload_1
		// @B4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B7: bipush 44 (0x2C)
		// @B9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BC: iload_2
		// @BD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C0: bipush 41 (0x29)
		// @C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CB: athrow
	}
	
	static final void func_105052_a(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: iinc #4 +255
		// @03: iinc #0 +1
		// @06: iload_2
		// @07: iload #4
		// @09: iload_2
		// @0A: iload_3
		// @0B: iadd
		// @0C: iload_0
		// @0D: iload #4
		// @0F: iadd
		// @10: invokestatic game.C_100196_rb.func_105815_h(int, int, int, int)void
		// @13: getstatic game.C_100037_wb game.C_100309_lk.field_103255_db
		// @16: iload_2
		// @17: iload #4
		// @19: bipush 17 (0x11)
		// @1B: isub
		// @1C: invokevirtual game.C_100037_wb.func_102386_f(int, int)void
		// @1F: invokestatic game.C_100196_rb.func_105781_a()void
		// @22: iload_2
		// @23: iload #4
		// @25: iload_3
		// @26: iconst_0
		// @27: sipush 128 (0x0080)
		// @2A: invokestatic game.C_100196_rb.func_105800_f(int, int, int, int, int)void
		// @2D: iload_2
		// @2E: iload #4
		// @30: iconst_1
		// @31: iadd
		// @32: iload_3
		// @33: iconst_0
		// @34: bipush 96 (0x60)
		// @36: invokestatic game.C_100196_rb.func_105800_f(int, int, int, int, int)void
		// @39: iload_2
		// @3A: iconst_2
		// @3B: iload #4
		// @3D: iadd
		// @3E: iload_3
		// @3F: iconst_0
		// @40: bipush 64 (0x40)
		// @42: invokestatic game.C_100196_rb.func_105800_f(int, int, int, int, int)void
		// @45: iload_2
		// @46: iload #4
		// @48: iload_1
		// @49: isub
		// @4A: iload_3
		// @4B: iconst_0
		// @4C: bipush 32 (0x20)
		// @4E: invokestatic game.C_100196_rb.func_105800_f(int, int, int, int, int)void
		// @51: return
		// @52: astore #5
		// @54: aload #5
		// @56: new java.lang.StringBuilder
		// @59: dup
		// @5A: invokespecial java.lang.StringBuilder.<init>()void
		// @5D: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @60: iconst_3
		// @61: aaload
		// @62: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @65: iload_0
		// @66: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @69: bipush 44 (0x2C)
		// @6B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6E: iload_1
		// @6F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @72: bipush 44 (0x2C)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: iload_2
		// @78: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7B: bipush 44 (0x2C)
		// @7D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @80: iload_3
		// @81: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @84: bipush 44 (0x2C)
		// @86: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @89: iload #4
		// @8B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8E: bipush 41 (0x29)
		// @90: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @93: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @96: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @99: athrow
	}
	
	final void func_105047_a(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: iconst_0
		// @05: istore_2
		// @06: bipush 32 (0x20)
		// @08: iload_2
		// @09: if_icmple @22
		// @0C: aload_0
		// @0D: getfield byte[] game.C_100141_tc.field_105072_r
		// @10: iload_2
		// @11: iconst_0
		// @12: bastore
		// @13: iinc #2 +1
		// @16: iload_3
		// @17: ifne @45
		// @1A: iload_3
		// @1B: ifeq @06
		// @1E: goto @22
		// @21: athrow
		// @22: iload_1
		// @23: bipush 98 (0x62)
		// @25: if_icmpgt @34
		// @28: aload_0
		// @29: aconst_null
		// @2A: checkcast long[]
		// @2D: putfield long[] game.C_100141_tc.field_105066_l
		// @30: goto @34
		// @33: athrow
		// @34: aload_0
		// @35: iconst_0
		// @36: putfield int game.C_100141_tc.field_105067_m
		// @39: aload_0
		// @3A: iconst_0
		// @3B: putfield int game.C_100141_tc.field_105064_n
		// @3E: aload_0
		// @3F: getfield byte[] game.C_100141_tc.field_105074_p
		// @42: iconst_0
		// @43: iconst_0
		// @44: bastore
		// @45: iconst_0
		// @46: istore_2
		// @47: bipush 8 (0x08)
		// @49: iload_2
		// @4A: if_icmple @63
		// @4D: aload_0
		// @4E: getfield long[] game.C_100141_tc.field_105061_b
		// @51: iload_2
		// @52: lconst_0
		// @53: lastore
		// @54: iinc #2 +1
		// @57: iload_3
		// @58: ifne @88
		// @5B: iload_3
		// @5C: ifeq @47
		// @5F: goto @63
		// @62: athrow
		// @63: goto @88
		// @66: astore_2
		// @67: aload_2
		// @68: new java.lang.StringBuilder
		// @6B: dup
		// @6C: invokespecial java.lang.StringBuilder.<init>()void
		// @6F: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @72: bipush 8 (0x08)
		// @74: aaload
		// @75: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @78: iload_1
		// @79: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7C: bipush 41 (0x29)
		// @7E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @81: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @84: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @87: athrow
		// @88: return
	}
	
	final void func_105055_a(int arg0, long arg1, byte[] arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #13
		// @005: iconst_0
		// @006: istore #5
		// @008: lload_2
		// @009: l2i
		// @00A: bipush 7 (0x07)
		// @00C: iand
		// @00D: ineg
		// @00E: bipush 8 (0x08)
		// @010: iadd
		// @011: bipush 7 (0x07)
		// @013: iand
		// @014: istore #6
		// @016: bipush 7 (0x07)
		// @018: aload_0
		// @019: getfield int game.C_100141_tc.field_105067_m
		// @01C: iand
		// @01D: istore #7
		// @01F: lload_2
		// @020: lstore #9
		// @022: bipush 31 (0x1F)
		// @024: istore #11
		// @026: iconst_0
		// @027: istore #12
		// @029: iconst_m1
		// @02A: iload #11
		// @02C: iconst_m1
		// @02D: ixor
		// @02E: if_icmplt @072
		// @031: iload #12
		// @033: lload #9
		// @035: l2i
		// @036: sipush 255 (0x00FF)
		// @039: iand
		// @03A: aload_0
		// @03B: getfield byte[] game.C_100141_tc.field_105072_r
		// @03E: iload #11
		// @040: baload
		// @041: sipush 255 (0x00FF)
		// @044: iand
		// @045: iadd
		// @046: iadd
		// @047: istore #12
		// @049: aload_0
		// @04A: getfield byte[] game.C_100141_tc.field_105072_r
		// @04D: iload #11
		// @04F: iload #12
		// @051: i2b
		// @052: bastore
		// @053: lload #9
		// @055: bipush 8 (0x08)
		// @057: lushr
		// @058: lstore #9
		// @05A: iload #12
		// @05C: bipush 8 (0x08)
		// @05E: iushr
		// @05F: istore #12
		// @061: iinc #11 +255
		// @064: iload #13
		// @066: ifne @150
		// @069: iload #13
		// @06B: ifeq @029
		// @06E: goto @072
		// @071: athrow
		// @072: ldc2_w 8
		// @075: lload_2
		// @076: lcmp
		// @077: ifge @150
		// @07A: sipush 255 (0x00FF)
		// @07D: aload #4
		// @07F: iload #5
		// @081: baload
		// @082: iload #6
		// @084: ishl
		// @085: iand
		// @086: sipush 255 (0x00FF)
		// @089: aload #4
		// @08B: iconst_1
		// @08C: iload #5
		// @08E: iadd
		// @08F: baload
		// @090: iand
		// @091: iload #6
		// @093: ineg
		// @094: bipush 8 (0x08)
		// @096: iadd
		// @097: iushr
		// @098: ior
		// @099: istore #8
		// @09B: iload #8
		// @09D: iconst_m1
		// @09E: ixor
		// @09F: iconst_m1
		// @0A0: iload #13
		// @0A2: ifne @18B
		// @0A5: if_icmpgt @0BC
		// @0A8: goto @0AC
		// @0AB: athrow
		// @0AC: iload #8
		// @0AE: sipush 256 (0x0100)
		// @0B1: if_icmpge @0BC
		// @0B4: goto @0B8
		// @0B7: athrow
		// @0B8: goto @0CA
		// @0BB: athrow
		// @0BC: new java.lang.RuntimeException
		// @0BF: dup
		// @0C0: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @0C3: bipush 11 (0x0B)
		// @0C5: aaload
		// @0C6: invokespecial java.lang.RuntimeException.<init>(java.lang.String)void
		// @0C9: athrow
		// @0CA: aload_0
		// @0CB: getfield byte[] game.C_100141_tc.field_105074_p
		// @0CE: aload_0
		// @0CF: getfield int game.C_100141_tc.field_105064_n
		// @0D2: aload_0
		// @0D3: getfield byte[] game.C_100141_tc.field_105074_p
		// @0D6: aload_0
		// @0D7: getfield int game.C_100141_tc.field_105064_n
		// @0DA: baload
		// @0DB: iload #8
		// @0DD: iload #7
		// @0DF: iushr
		// @0E0: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @0E3: i2b
		// @0E4: bastore
		// @0E5: aload_0
		// @0E6: dup
		// @0E7: getfield int game.C_100141_tc.field_105064_n
		// @0EA: iconst_1
		// @0EB: iadd
		// @0EC: putfield int game.C_100141_tc.field_105064_n
		// @0EF: aload_0
		// @0F0: dup
		// @0F1: getfield int game.C_100141_tc.field_105067_m
		// @0F4: iload #7
		// @0F6: ineg
		// @0F7: bipush 8 (0x08)
		// @0F9: iadd
		// @0FA: iadd
		// @0FB: putfield int game.C_100141_tc.field_105067_m
		// @0FE: aload_0
		// @0FF: getfield int game.C_100141_tc.field_105067_m
		// @102: iconst_m1
		// @103: ixor
		// @104: sipush -513 (0xFDFF)
		// @107: if_icmpeq @10E
		// @10A: goto @11E
		// @10D: athrow
		// @10E: aload_0
		// @10F: bipush 64 (0x40)
		// @111: invokespecial game.C_100141_tc.func_105049_a(byte)void
		// @114: aload_0
		// @115: iconst_0
		// @116: putfield int game.C_100141_tc.field_105067_m
		// @119: aload_0
		// @11A: iconst_0
		// @11B: putfield int game.C_100141_tc.field_105064_n
		// @11E: aload_0
		// @11F: getfield byte[] game.C_100141_tc.field_105074_p
		// @122: aload_0
		// @123: getfield int game.C_100141_tc.field_105064_n
		// @126: iload #8
		// @128: bipush 8 (0x08)
		// @12A: iload #7
		// @12C: ineg
		// @12D: iadd
		// @12E: ishl
		// @12F: sipush 255 (0x00FF)
		// @132: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @135: i2b
		// @136: bastore
		// @137: aload_0
		// @138: dup
		// @139: getfield int game.C_100141_tc.field_105067_m
		// @13C: iload #7
		// @13E: iadd
		// @13F: putfield int game.C_100141_tc.field_105067_m
		// @142: iinc #5 +1
		// @145: lload_2
		// @146: ldc2_w 8
		// @149: lsub
		// @14A: lstore_2
		// @14B: iload #13
		// @14D: ifeq @072
		// @150: lload_2
		// @151: lconst_0
		// @152: lcmp
		// @153: ifle @184
		// @156: aload #4
		// @158: iload #5
		// @15A: baload
		// @15B: iload #6
		// @15D: ishl
		// @15E: sipush 255 (0x00FF)
		// @161: iand
		// @162: istore #8
		// @164: aload_0
		// @165: getfield byte[] game.C_100141_tc.field_105074_p
		// @168: aload_0
		// @169: getfield int game.C_100141_tc.field_105064_n
		// @16C: aload_0
		// @16D: getfield byte[] game.C_100141_tc.field_105074_p
		// @170: aload_0
		// @171: getfield int game.C_100141_tc.field_105064_n
		// @174: baload
		// @175: iload #8
		// @177: iload #7
		// @179: iushr
		// @17A: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @17D: i2b
		// @17E: bastore
		// @17F: iload #13
		// @181: ifeq @187
		// @184: iconst_0
		// @185: istore #8
		// @187: iload_1
		// @188: sipush 256 (0x0100)
		// @18B: if_icmpeq @19E
		// @18E: aconst_null
		// @18F: checkcast java.lang.String
		// @192: bipush 50 (0x32)
		// @194: bipush 12 (0x0C)
		// @196: invokestatic game.C_100141_tc.func_105056_a(java.lang.String, byte, int)game.C_100157_db
		// @199: pop
		// @19A: goto @19E
		// @19D: athrow
		// @19E: ldc2_w 8
		// @1A1: iload #7
		// @1A3: i2l
		// @1A4: lload_2
		// @1A5: ladd
		// @1A6: lcmp
		// @1A7: ifle @1BF
		// @1AA: aload_0
		// @1AB: dup
		// @1AC: getfield int game.C_100141_tc.field_105067_m
		// @1AF: i2l
		// @1B0: lload_2
		// @1B1: ladd
		// @1B2: l2i
		// @1B3: putfield int game.C_100141_tc.field_105067_m
		// @1B6: iload #13
		// @1B8: ifeq @226
		// @1BB: goto @1BF
		// @1BE: athrow
		// @1BF: aload_0
		// @1C0: dup
		// @1C1: getfield int game.C_100141_tc.field_105067_m
		// @1C4: iload #7
		// @1C6: ineg
		// @1C7: bipush 8 (0x08)
		// @1C9: iadd
		// @1CA: iadd
		// @1CB: putfield int game.C_100141_tc.field_105067_m
		// @1CE: lload_2
		// @1CF: iload #7
		// @1D1: ineg
		// @1D2: bipush 8 (0x08)
		// @1D4: iadd
		// @1D5: i2l
		// @1D6: lsub
		// @1D7: lstore_2
		// @1D8: aload_0
		// @1D9: dup
		// @1DA: getfield int game.C_100141_tc.field_105064_n
		// @1DD: iconst_1
		// @1DE: iadd
		// @1DF: putfield int game.C_100141_tc.field_105064_n
		// @1E2: sipush -513 (0xFDFF)
		// @1E5: aload_0
		// @1E6: getfield int game.C_100141_tc.field_105067_m
		// @1E9: iconst_m1
		// @1EA: ixor
		// @1EB: if_icmpeq @1F2
		// @1EE: goto @202
		// @1F1: athrow
		// @1F2: aload_0
		// @1F3: bipush 64 (0x40)
		// @1F5: invokespecial game.C_100141_tc.func_105049_a(byte)void
		// @1F8: aload_0
		// @1F9: iconst_0
		// @1FA: putfield int game.C_100141_tc.field_105067_m
		// @1FD: aload_0
		// @1FE: iconst_0
		// @1FF: putfield int game.C_100141_tc.field_105064_n
		// @202: aload_0
		// @203: getfield byte[] game.C_100141_tc.field_105074_p
		// @206: aload_0
		// @207: getfield int game.C_100141_tc.field_105064_n
		// @20A: sipush 255 (0x00FF)
		// @20D: iload #8
		// @20F: iload #7
		// @211: ineg
		// @212: bipush 8 (0x08)
		// @214: iadd
		// @215: ishl
		// @216: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @219: i2b
		// @21A: bastore
		// @21B: aload_0
		// @21C: dup
		// @21D: getfield int game.C_100141_tc.field_105067_m
		// @220: lload_2
		// @221: l2i
		// @222: iadd
		// @223: putfield int game.C_100141_tc.field_105067_m
		// @226: goto @271
		// @229: astore #5
		// @22B: aload #5
		// @22D: new java.lang.StringBuilder
		// @230: dup
		// @231: invokespecial java.lang.StringBuilder.<init>()void
		// @234: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @237: bipush 12 (0x0C)
		// @239: aaload
		// @23A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23D: iload_1
		// @23E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @241: bipush 44 (0x2C)
		// @243: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @246: lload_2
		// @247: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @24A: bipush 44 (0x2C)
		// @24C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @24F: aload #4
		// @251: ifnull @25D
		// @254: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @257: iconst_1
		// @258: aaload
		// @259: goto @262
		// @25C: athrow
		// @25D: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @260: iconst_2
		// @261: aaload
		// @262: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @265: bipush 41 (0x29)
		// @267: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @26A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @26D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @270: athrow
		// @271: return
	}
	
	static final C_100157_db func_105056_a(String arg0, byte arg1, int arg2)
	{
		// @00: new game.C_100004_gb
		// @03: dup
		// @04: invokespecial game.C_100004_gb.<init>()void
		// @07: astore_3
		// @08: iload_1
		// @09: bipush -91 (0xA5)
		// @0B: if_icmpeq @1C
		// @0E: bipush 45 (0x2D)
		// @10: bipush 28 (0x1C)
		// @12: bipush 73 (0x49)
		// @14: invokestatic game.C_100141_tc.func_105046_a(int, int, int)int
		// @17: pop
		// @18: goto @1C
		// @1B: athrow
		// @1C: aload_3
		// @1D: aload_0
		// @1E: putfield java.lang.String game.C_100157_db.field_103561_a
		// @21: aload_3
		// @22: iload_2
		// @23: putfield int game.C_100157_db.field_103557_d
		// @26: aload_3
		// @27: areturn
		// @28: astore_3
		// @29: aload_3
		// @2A: new java.lang.StringBuilder
		// @2D: dup
		// @2E: invokespecial java.lang.StringBuilder.<init>()void
		// @31: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @34: bipush 9 (0x09)
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: aload_0
		// @3B: ifnull @47
		// @3E: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @41: iconst_1
		// @42: aaload
		// @43: goto @4C
		// @46: athrow
		// @47: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @4A: iconst_2
		// @4B: aaload
		// @4C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4F: bipush 44 (0x2C)
		// @51: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @54: iload_1
		// @55: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @58: bipush 44 (0x2C)
		// @5A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5D: iload_2
		// @5E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @61: bipush 41 (0x29)
		// @63: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @66: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @69: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6C: athrow
	}
	
	static final byte[] func_105054_a(int arg0, boolean arg1, Object arg2)
	{
		// @00: aconst_null
		// @01: aload_2
		// @02: if_acmpeq @09
		// @05: goto @0B
		// @08: athrow
		// @09: aconst_null
		// @0A: areturn
		// @0B: iload_0
		// @0C: bipush 27 (0x1B)
		// @0E: if_icmpgt @16
		// @11: aconst_null
		// @12: checkcast byte[]
		// @15: areturn
		// @16: aload_2
		// @17: instanceof byte[]
		// @1A: ifeq @31
		// @1D: aload_2
		// @1E: checkcast byte[]
		// @21: checkcast byte[]
		// @24: astore_3
		// @25: iload_1
		// @26: ifeq @2F
		// @29: iconst_0
		// @2A: aload_3
		// @2B: invokestatic game.C_100157_db.func_103547_a(int, byte[])byte[]
		// @2E: areturn
		// @2F: aload_3
		// @30: areturn
		// @31: aload_2
		// @32: instanceof game.C_100116_ei
		// @35: ifne @3C
		// @38: goto @49
		// @3B: athrow
		// @3C: aload_2
		// @3D: checkcast game.C_100116_ei
		// @40: astore_3
		// @41: aload_3
		// @42: sipush 200 (0x00C8)
		// @45: invokevirtual game.C_100116_ei.func_104115_a(int)byte[]
		// @48: areturn
		// @49: new java.lang.IllegalArgumentException
		// @4C: dup
		// @4D: invokespecial java.lang.IllegalArgumentException.<init>()void
		// @50: athrow
		// @51: astore_3
		// @52: aload_3
		// @53: new java.lang.StringBuilder
		// @56: dup
		// @57: invokespecial java.lang.StringBuilder.<init>()void
		// @5A: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @5D: bipush 10 (0x0A)
		// @5F: aaload
		// @60: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @63: iload_0
		// @64: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @67: bipush 44 (0x2C)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: iload_1
		// @6D: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @70: bipush 44 (0x2C)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: aload_2
		// @76: ifnull @82
		// @79: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @7C: iconst_1
		// @7D: aaload
		// @7E: goto @87
		// @81: athrow
		// @82: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @85: iconst_2
		// @86: aaload
		// @87: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8A: bipush 41 (0x29)
		// @8C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @92: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @95: athrow
	}
	
	public static void func_105051_a(boolean arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100141_tc.field_105062_c
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100141_tc.field_105057_f
		// @08: iload_0
		// @09: iconst_1
		// @0A: if_icmpeq @1A
		// @0D: bipush -89 (0xA7)
		// @0F: iconst_4
		// @10: bipush -125 (0x83)
		// @12: invokestatic game.C_100141_tc.func_105046_a(int, int, int)int
		// @15: pop
		// @16: goto @1A
		// @19: athrow
		// @1A: aconst_null
		// @1B: putstatic java.lang.String game.C_100141_tc.field_105059_d
		// @1E: aconst_null
		// @1F: putstatic int[] game.C_100141_tc.field_105069_k
		// @22: aconst_null
		// @23: putstatic java.lang.String game.C_100141_tc.field_105071_i
		// @26: aconst_null
		// @27: putstatic game.C_100230_of game.C_100141_tc.field_105068_j
		// @2A: aconst_null
		// @2B: putstatic java.lang.String game.C_100141_tc.field_105060_e
		// @2E: aconst_null
		// @2F: putstatic java.lang.String game.C_100141_tc.field_105070_h
		// @32: goto @56
		// @35: astore_1
		// @36: aload_1
		// @37: new java.lang.StringBuilder
		// @3A: dup
		// @3B: invokespecial java.lang.StringBuilder.<init>()void
		// @3E: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @41: iconst_4
		// @42: aaload
		// @43: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @46: iload_0
		// @47: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @4A: bipush 41 (0x29)
		// @4C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @52: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @55: athrow
		// @56: return
	}
	
	static final void func_105053_a(boolean arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: getstatic game.C_100202_qi game.C_100133_tk.field_105000_c
		// @07: bipush 116 (0x74)
		// @09: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @0C: checkcast game.C_100075_uj
		// @0F: astore_2
		// @10: aconst_null
		// @11: aload_2
		// @12: if_acmpeq @33
		// @15: iconst_m1
		// @16: aload_2
		// @17: iload_1
		// @18: invokestatic game.C_100082_uf.func_100363_a(int, game.C_100075_uj, int)void
		// @1B: getstatic game.C_100202_qi game.C_100133_tk.field_105000_c
		// @1E: bipush 122 (0x7A)
		// @20: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @23: checkcast game.C_100075_uj
		// @26: astore_2
		// @27: iload_3
		// @28: ifne @3C
		// @2B: iload_3
		// @2C: ifeq @10
		// @2F: goto @33
		// @32: athrow
		// @33: getstatic game.C_100202_qi game.C_100249_pc.field_102342_x
		// @36: bipush 58 (0x3A)
		// @38: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @3B: astore_2
		// @3C: aload_2
		// @3D: ifnull @5B
		// @40: iload_1
		// @41: bipush -95 (0xA1)
		// @43: invokestatic game.C_100298_ke.func_103204_c(int, byte)void
		// @46: getstatic game.C_100202_qi game.C_100249_pc.field_102342_x
		// @49: bipush 73 (0x49)
		// @4B: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @4E: astore_2
		// @4F: iload_3
		// @50: ifne @70
		// @53: iload_3
		// @54: ifeq @3C
		// @57: goto @5B
		// @5A: athrow
		// @5B: iload_0
		// @5C: ifeq @70
		// @5F: bipush 118 (0x76)
		// @61: bipush 28 (0x1C)
		// @63: bipush 88 (0x58)
		// @65: bipush -96 (0xA0)
		// @67: bipush 95 (0x5F)
		// @69: invokestatic game.C_100141_tc.func_105052_a(int, int, int, int, int)void
		// @6C: goto @70
		// @6F: athrow
		// @70: goto @9D
		// @73: astore_2
		// @74: aload_2
		// @75: new java.lang.StringBuilder
		// @78: dup
		// @79: invokespecial java.lang.StringBuilder.<init>()void
		// @7C: getstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @7F: iconst_5
		// @80: aaload
		// @81: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @84: iload_0
		// @85: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @88: bipush 44 (0x2C)
		// @8A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8D: iload_1
		// @8E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @91: bipush 41 (0x29)
		// @93: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @96: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @99: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9C: athrow
		// @9D: return
	}
	
	C_100141_tc()
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: bipush 8 (0x08)
		// @07: newarray long[]
		// @09: putfield long[] game.C_100141_tc.field_105061_b
		// @0C: aload_0
		// @0D: bipush 8 (0x08)
		// @0F: newarray long[]
		// @11: putfield long[] game.C_100141_tc.field_105066_l
		// @14: aload_0
		// @15: bipush 8 (0x08)
		// @17: newarray long[]
		// @19: putfield long[] game.C_100141_tc.field_105073_q
		// @1C: aload_0
		// @1D: bipush 8 (0x08)
		// @1F: newarray long[]
		// @21: putfield long[] game.C_100141_tc.field_105058_g
		// @24: aload_0
		// @25: bipush 64 (0x40)
		// @27: newarray byte[]
		// @29: putfield byte[] game.C_100141_tc.field_105074_p
		// @2C: aload_0
		// @2D: bipush 8 (0x08)
		// @2F: newarray long[]
		// @31: putfield long[] game.C_100141_tc.field_105063_a
		// @34: aload_0
		// @35: iconst_0
		// @36: putfield int game.C_100141_tc.field_105064_n
		// @39: aload_0
		// @3A: bipush 32 (0x20)
		// @3C: newarray byte[]
		// @3E: putfield byte[] game.C_100141_tc.field_105072_r
		// @41: aload_0
		// @42: iconst_0
		// @43: putfield int game.C_100141_tc.field_105067_m
		// @46: return
	}
	
	static
	{
		// @00: bipush 13 (0x0D)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "<\u000fS\u001d\u0007"
		// @09: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "3BS{R"
		// @14: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @17: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "&\u0019\u00119"
		// @1F: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @22: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "<\u000fS\u0010\u0007"
		// @2A: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "<\u000fS\u0011\u0007"
		// @35: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @38: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "<\u000fS\u001c\u0007"
		// @40: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @43: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "<\u000fS\u0012\u0007"
		// @4C: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "<\u000fS\u0014\u0007"
		// @58: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "<\u000fS\u0017\u0007"
		// @64: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @67: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "<\u000fS\u001f\u0007"
		// @70: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @73: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "<\u000fS\u0016\u0007"
		// @7C: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "\u0004#:\u001clh)/\u0007`\u001a"
		// @88: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @8E: aastore
		// @8F: dup
		// @90: bipush 12 (0x0C)
		// @92: ldc "<\u000fS\u0013\u0007"
		// @94: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @97: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @9A: aastore
		// @9B: putstatic java.lang.String[] game.C_100141_tc.field_105075_z
		// @9E: ldc "\t\u0000\u0011:Xh\u001f\r0L<\r\t:];S"
		// @A0: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @A3: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @A6: putstatic java.lang.String game.C_100141_tc.field_105060_e
		// @A9: ldc "\u001b99\u0011j\u0006L9\u0010n\u001c$]\u001cahPXe\u0011h?8\u0016`\u0006(."
		// @AB: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @AE: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @B1: putstatic java.lang.String game.C_100141_tc.field_105071_i
		// @B4: bipush 65 (0x41)
		// @B6: putstatic int game.C_100141_tc.field_105065_o
		// @B9: sipush 8192 (0x2000)
		// @BC: newarray int[]
		// @BE: putstatic int[] game.C_100141_tc.field_105069_k
		// @C1: ldc "\t\u001f\u0016<A/L\t:\u000f\"\u0003\u0014;\u000ftIMk\u0008;L\u001a4B-BS{"
		// @C3: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @C6: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @C9: putstatic java.lang.String game.C_100141_tc.field_105070_h
		// @CC: ldc "\u000b\r\u00100])L\u00110I<C\u000f<H \u0018Gua'\u001e\u00104C"
		// @CE: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @D1: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @D4: putstatic java.lang.String game.C_100141_tc.field_105057_f
		// @D7: ldc "\u0001\u0002\u000b<[!\u0002\u001au\u0013m\\C"
		// @D9: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @DC: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @DF: putstatic java.lang.String game.C_100141_tc.field_105059_d
		// @E2: ldc "tIMk\u000f \r\u000euE'\u0005\u00130Kh\u0015\u0012 ]h\u000b\u001c8Jf"
		// @E4: invokestatic game.C_100141_tc.func_105050_z(java.lang.String)char[]
		// @E7: invokestatic game.C_100141_tc.func_105048_z(char[])java.lang.String
		// @EA: putstatic java.lang.String game.C_100141_tc.field_105062_c
		// @ED: return
	}
	
	private static char[] func_105050_z(String arg0)
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
	
	private static String func_105048_z(char[] arg0)
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
		// @30: bipush 72 (0x48)
		// @32: goto @46
		// @35: bipush 108 (0x6C)
		// @37: goto @46
		// @3A: bipush 125 (0x7D)
		// @3C: goto @46
		// @3F: bipush 85 (0x55)
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
