package game;

final class C_100271_mj extends C_100030_gm
{
	static int field_103437_P;
	static C_100294_ki field_103433_T;
	static C_100208_qg field_103440_O;
	private int field_103441_Y;
	static int field_103432_U;
	private C_100112_r field_103436_Q;
	private int field_103442_X;
	private String field_103434_W;
	static int[][] field_103438_S;
	private boolean field_103439_R;
	private int field_103435_V;
	private static final String[] field_103443_Z;
	
	static final void func_103430_a(byte arg0, int arg1, int arg2, C_100153_be arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #20
		// @005: iload_2
		// @006: iload_1
		// @007: isub
		// @008: ldc 1004761512 (0x3be371a8)
		// @00A: ishl
		// @00B: aload_3
		// @00C: getfield int game.C_100153_be.field_105301_h
		// @00F: idiv
		// @010: istore #6
		// @012: aload_3
		// @013: getfield int game.C_100153_be.field_105297_l
		// @016: iload #6
		// @018: imul
		// @019: iload_1
		// @01A: ldc -1415226520 (0xaba55b68)
		// @01C: ishl
		// @01D: iadd
		// @01E: istore #7
		// @020: iload #4
		// @022: aload_3
		// @023: getfield int game.C_100153_be.field_105300_k
		// @026: iadd
		// @027: istore #4
		// @029: iload #5
		// @02B: aload_3
		// @02C: getfield int game.C_100153_be.field_105297_l
		// @02F: iadd
		// @030: istore #5
		// @032: iload #5
		// @034: iload #4
		// @036: getstatic int game.C_100196_rb.field_105819_e
		// @039: imul
		// @03A: iadd
		// @03B: istore #8
		// @03D: iconst_0
		// @03E: istore #9
		// @040: aload_3
		// @041: getfield int game.C_100153_be.field_105304_r
		// @044: istore #10
		// @046: aload_3
		// @047: getfield int game.C_100153_be.field_105298_m
		// @04A: istore #11
		// @04C: iload #11
		// @04E: ineg
		// @04F: getstatic int game.C_100196_rb.field_105819_e
		// @052: iadd
		// @053: istore #12
		// @055: getstatic int game.C_100196_rb.field_105816_f
		// @058: iconst_m1
		// @059: ixor
		// @05A: iload #4
		// @05C: iconst_m1
		// @05D: ixor
		// @05E: if_icmplt @065
		// @061: goto @08F
		// @064: athrow
		// @065: getstatic int game.C_100196_rb.field_105816_f
		// @068: iload #4
		// @06A: ineg
		// @06B: iadd
		// @06C: istore #14
		// @06E: iload #10
		// @070: iload #14
		// @072: isub
		// @073: istore #10
		// @075: iload #9
		// @077: iload #14
		// @079: iload #11
		// @07B: imul
		// @07C: iadd
		// @07D: istore #9
		// @07F: getstatic int game.C_100196_rb.field_105816_f
		// @082: istore #4
		// @084: iload #8
		// @086: getstatic int game.C_100196_rb.field_105819_e
		// @089: iload #14
		// @08B: imul
		// @08C: iadd
		// @08D: istore #8
		// @08F: iconst_0
		// @090: istore #13
		// @092: getstatic int game.C_100196_rb.field_105823_l
		// @095: iload #10
		// @097: iload #4
		// @099: iadd
		// @09A: if_icmplt @0A1
		// @09D: goto @0AF
		// @0A0: athrow
		// @0A1: iload #10
		// @0A3: iload #10
		// @0A5: iload #4
		// @0A7: iadd
		// @0A8: getstatic int game.C_100196_rb.field_105823_l
		// @0AB: isub
		// @0AC: isub
		// @0AD: istore #10
		// @0AF: getstatic int game.C_100196_rb.field_105827_i
		// @0B2: iconst_m1
		// @0B3: ixor
		// @0B4: iload #5
		// @0B6: iconst_m1
		// @0B7: ixor
		// @0B8: if_icmplt @0BF
		// @0BB: goto @0FA
		// @0BE: athrow
		// @0BF: iload #5
		// @0C1: ineg
		// @0C2: getstatic int game.C_100196_rb.field_105827_i
		// @0C5: iadd
		// @0C6: istore #14
		// @0C8: iload #11
		// @0CA: iload #14
		// @0CC: isub
		// @0CD: istore #11
		// @0CF: iload #13
		// @0D1: iload #14
		// @0D3: iadd
		// @0D4: istore #13
		// @0D6: iload #12
		// @0D8: iload #14
		// @0DA: iadd
		// @0DB: istore #12
		// @0DD: getstatic int game.C_100196_rb.field_105827_i
		// @0E0: istore #5
		// @0E2: iload #8
		// @0E4: iload #14
		// @0E6: iadd
		// @0E7: istore #8
		// @0E9: iload #9
		// @0EB: iload #14
		// @0ED: iadd
		// @0EE: istore #9
		// @0F0: iload #7
		// @0F2: iload #14
		// @0F4: iload #6
		// @0F6: imul
		// @0F7: iadd
		// @0F8: istore #7
		// @0FA: getstatic int game.C_100196_rb.field_105820_b
		// @0FD: iload #5
		// @0FF: iload #11
		// @101: ineg
		// @102: isub
		// @103: if_icmplt @10A
		// @106: goto @12A
		// @109: athrow
		// @10A: iload #5
		// @10C: iload #11
		// @10E: getstatic int game.C_100196_rb.field_105820_b
		// @111: isub
		// @112: iadd
		// @113: istore #14
		// @115: iload #11
		// @117: iload #14
		// @119: isub
		// @11A: istore #11
		// @11C: iload #12
		// @11E: iload #14
		// @120: iadd
		// @121: istore #12
		// @123: iload #13
		// @125: iload #14
		// @127: iadd
		// @128: istore #13
		// @12A: iload #11
		// @12C: ifle @13F
		// @12F: iconst_m1
		// @130: iload #10
		// @132: iconst_m1
		// @133: ixor
		// @134: if_icmple @13F
		// @137: goto @13B
		// @13A: athrow
		// @13B: goto @140
		// @13E: athrow
		// @13F: return
		// @140: iload #10
		// @142: ineg
		// @143: istore #4
		// @145: iload #4
		// @147: ifge @238
		// @14A: iload #7
		// @14C: istore #14
		// @14E: iload #11
		// @150: ineg
		// @151: iload #20
		// @153: ifne @239
		// @156: istore #5
		// @158: iconst_m1
		// @159: iload #5
		// @15B: iconst_m1
		// @15C: ixor
		// @15D: if_icmpge @222
		// @160: iload #14
		// @162: ldc -1883153784 (0x8fc15a88)
		// @164: ishr
		// @165: istore #15
		// @167: sipush 256 (0x0100)
		// @16A: iload #15
		// @16C: ineg
		// @16D: iadd
		// @16E: istore #16
		// @170: iload #14
		// @172: iload #6
		// @174: iadd
		// @175: istore #14
		// @177: iconst_m1
		// @178: iload #15
		// @17A: iconst_m1
		// @17B: ixor
		// @17C: iload #20
		// @17E: ifne @22D
		// @181: if_icmpge @197
		// @184: goto @188
		// @187: athrow
		// @188: iinc #8 +1
		// @18B: iinc #9 +1
		// @18E: iload #20
		// @190: ifeq @21A
		// @193: goto @197
		// @196: athrow
		// @197: aload_3
		// @198: getfield int[] game.C_100153_be.field_105320_t
		// @19B: aload_3
		// @19C: getfield byte[] game.C_100153_be.field_105319_u
		// @19F: iload #9
		// @1A1: iinc #9 +1
		// @1A4: baload
		// @1A5: sipush 255 (0x00FF)
		// @1A8: iand
		// @1A9: iaload
		// @1AA: istore #17
		// @1AC: iload #17
		// @1AE: ifne @1B5
		// @1B1: goto @217
		// @1B4: athrow
		// @1B5: iload #15
		// @1B7: iconst_m1
		// @1B8: ixor
		// @1B9: sipush -256 (0xFF00)
		// @1BC: if_icmplt @20B
		// @1BF: getstatic int[] game.C_100196_rb.field_105818_d
		// @1C2: iload #8
		// @1C4: iaload
		// @1C5: istore #18
		// @1C7: iload #15
		// @1C9: ldc 16711935 (0xff00ff)
		// @1CB: iload #17
		// @1CD: iand
		// @1CE: imul
		// @1CF: iload #16
		// @1D1: ldc 16711935 (0xff00ff)
		// @1D3: iload #18
		// @1D5: iand
		// @1D6: imul
		// @1D7: iadd
		// @1D8: ldc -1074073016 (0xbffaf248)
		// @1DA: ishr
		// @1DB: ldc 16711935 (0xff00ff)
		// @1DD: iand
		// @1DE: istore #19
		// @1E0: getstatic int[] game.C_100196_rb.field_105818_d
		// @1E3: iload #8
		// @1E5: ldc 65280 (0xff00)
		// @1E7: ldc 65280 (0xff00)
		// @1E9: iload #17
		// @1EB: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @1EE: iload #15
		// @1F0: imul
		// @1F1: iload #16
		// @1F3: iload #18
		// @1F5: ldc 65280 (0xff00)
		// @1F7: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @1FA: imul
		// @1FB: iadd
		// @1FC: ldc -1299865912 (0xb2859ec8)
		// @1FE: ishr
		// @1FF: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @202: iload #19
		// @204: iadd
		// @205: iastore
		// @206: iload #20
		// @208: ifeq @217
		// @20B: getstatic int[] game.C_100196_rb.field_105818_d
		// @20E: iload #8
		// @210: iload #17
		// @212: iastore
		// @213: goto @217
		// @216: athrow
		// @217: iinc #8 +1
		// @21A: iinc #5 +1
		// @21D: iload #20
		// @21F: ifeq @158
		// @222: iload #9
		// @224: iload #13
		// @226: iadd
		// @227: istore #9
		// @229: iload #8
		// @22B: iload #12
		// @22D: iadd
		// @22E: istore #8
		// @230: iinc #4 +1
		// @233: iload #20
		// @235: ifeq @145
		// @238: iload_0
		// @239: bipush -34 (0xDE)
		// @23B: if_icmpeq @247
		// @23E: bipush -35 (0xDD)
		// @240: putstatic int game.C_100271_mj.field_103432_U
		// @243: goto @247
		// @246: athrow
		// @247: goto @2AE
		// @24A: astore #6
		// @24C: aload #6
		// @24E: new java.lang.StringBuilder
		// @251: dup
		// @252: invokespecial java.lang.StringBuilder.<init>()void
		// @255: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @258: bipush 23 (0x17)
		// @25A: aaload
		// @25B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25E: iload_0
		// @25F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @262: bipush 44 (0x2C)
		// @264: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @267: iload_1
		// @268: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @26B: bipush 44 (0x2C)
		// @26D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @270: iload_2
		// @271: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @274: bipush 44 (0x2C)
		// @276: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @279: aload_3
		// @27A: ifnull @286
		// @27D: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @280: iconst_2
		// @281: aaload
		// @282: goto @28B
		// @285: athrow
		// @286: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @289: iconst_1
		// @28A: aaload
		// @28B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @28E: bipush 44 (0x2C)
		// @290: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @293: iload #4
		// @295: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @298: bipush 44 (0x2C)
		// @29A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @29D: iload #5
		// @29F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2A2: bipush 41 (0x29)
		// @2A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2A7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2AA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2AD: athrow
		// @2AE: return
	}
	
	static final void func_103428_k(int arg0)
	{
		// @0000: getstatic int game.SteelSentinels.field_105275_O
		// @0003: istore #32
		// @0005: iconst_0
		// @0006: istore_1
		// @0007: iconst_0
		// @0008: istore_2
		// @0009: aconst_null
		// @000A: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @000D: if_acmpne @0027
		// @0010: iconst_0
		// @0011: getstatic int game.C_100174_sb.field_105609_b
		// @0014: if_icmple @001F
		// @0017: goto @001B
		// @001A: athrow
		// @001B: goto @002A
		// @001E: athrow
		// @001F: bipush 16 (0x10)
		// @0021: istore_2
		// @0022: iload #32
		// @0024: ifeq @002A
		// @0027: bipush 100 (0x64)
		// @0029: istore_2
		// @002A: aconst_null
		// @002B: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @002E: if_acmpeq @008F
		// @0031: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @0034: getfield int game.C_100302_ka.field_101840_Eb
		// @0037: getstatic int game.C_100015_wh.field_103781_g
		// @003A: if_icmpgt @008F
		// @003D: goto @0041
		// @0040: athrow
		// @0041: getstatic int game.C_100015_wh.field_103781_g
		// @0044: iconst_m1
		// @0045: ixor
		// @0046: iload_2
		// @0047: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @004A: getfield int game.C_100302_ka.field_101840_Eb
		// @004D: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @0050: getfield int game.C_100302_ka.field_101886_Kb
		// @0053: iadd
		// @0054: iadd
		// @0055: iconst_m1
		// @0056: ixor
		// @0057: if_icmple @008F
		// @005A: goto @005E
		// @005D: athrow
		// @005E: getstatic int game.C_100338_jc.field_105370_l
		// @0061: iconst_m1
		// @0062: ixor
		// @0063: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @0066: getfield int game.C_100302_ka.field_101835_xb
		// @0069: iconst_m1
		// @006A: ixor
		// @006B: if_icmpgt @008F
		// @006E: goto @0072
		// @0071: athrow
		// @0072: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @0075: getfield int game.C_100302_ka.field_101835_xb
		// @0078: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @007B: getfield int game.C_100302_ka.field_101848_lb
		// @007E: ineg
		// @007F: isub
		// @0080: getstatic int game.C_100338_jc.field_105370_l
		// @0083: if_icmple @008F
		// @0086: goto @008A
		// @0089: athrow
		// @008A: iconst_1
		// @008B: goto @0090
		// @008E: athrow
		// @008F: iconst_0
		// @0090: istore_3
		// @0091: iload_3
		// @0092: ifne @009F
		// @0095: getstatic boolean game.C_100236_on.field_100899_j
		// @0098: ifeq @00A7
		// @009B: goto @009F
		// @009E: athrow
		// @009F: iconst_1
		// @00A0: putstatic boolean game.C_100309_lk.field_103271_ab
		// @00A3: goto @00A7
		// @00A6: athrow
		// @00A7: iload_3
		// @00A8: putstatic boolean game.C_100236_on.field_100899_j
		// @00AB: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @00AE: ifnull @0110
		// @00B1: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @00B4: getfield int game.C_100302_ka.field_101840_Eb
		// @00B7: iconst_m1
		// @00B8: ixor
		// @00B9: getstatic int game.C_100015_wh.field_103781_g
		// @00BC: iconst_m1
		// @00BD: ixor
		// @00BE: if_icmplt @0110
		// @00C1: goto @00C5
		// @00C4: athrow
		// @00C5: getstatic int game.C_100015_wh.field_103781_g
		// @00C8: iconst_m1
		// @00C9: ixor
		// @00CA: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @00CD: getfield int game.C_100302_ka.field_101886_Kb
		// @00D0: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @00D3: getfield int game.C_100302_ka.field_101840_Eb
		// @00D6: iadd
		// @00D7: iconst_m1
		// @00D8: ixor
		// @00D9: if_icmple @0110
		// @00DC: goto @00E0
		// @00DF: athrow
		// @00E0: getstatic int game.C_100338_jc.field_105370_l
		// @00E3: iconst_m1
		// @00E4: ixor
		// @00E5: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @00E8: getfield int game.C_100302_ka.field_101835_xb
		// @00EB: iconst_m1
		// @00EC: ixor
		// @00ED: if_icmpgt @0110
		// @00F0: goto @00F4
		// @00F3: athrow
		// @00F4: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @00F7: getfield int game.C_100302_ka.field_101848_lb
		// @00FA: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @00FD: getfield int game.C_100302_ka.field_101835_xb
		// @0100: iadd
		// @0101: getstatic int game.C_100338_jc.field_105370_l
		// @0104: if_icmple @0110
		// @0107: goto @010B
		// @010A: athrow
		// @010B: iconst_1
		// @010C: goto @0111
		// @010F: athrow
		// @0110: iconst_0
		// @0111: istore #4
		// @0113: iload #4
		// @0115: ifne @0126
		// @0118: getstatic boolean game.C_100082_uf.field_100369_g
		// @011B: ifne @0126
		// @011E: goto @0122
		// @0121: athrow
		// @0122: goto @012A
		// @0125: athrow
		// @0126: iconst_1
		// @0127: putstatic boolean game.C_100034_gi.field_104029_d
		// @012A: getstatic int game.C_100068_vc.field_104343_e
		// @012D: iconst_m1
		// @012E: ixor
		// @012F: iconst_m1
		// @0130: if_icmpgt @013F
		// @0133: iconst_1
		// @0134: putstatic boolean game.C_100034_gi.field_104029_d
		// @0137: iconst_1
		// @0138: putstatic boolean game.C_100309_lk.field_103271_ab
		// @013B: goto @013F
		// @013E: athrow
		// @013F: iload #4
		// @0141: putstatic boolean game.C_100082_uf.field_100369_g
		// @0144: getstatic int game.C_100338_jc.field_105363_f
		// @0147: iconst_m1
		// @0148: ixor
		// @0149: iconst_m1
		// @014A: if_icmpeq @0163
		// @014D: getstatic int game.C_100338_jc.field_105363_f
		// @0150: iconst_m1
		// @0151: ixor
		// @0152: bipush -58 (0xC6)
		// @0154: if_icmpeq @0163
		// @0157: goto @015B
		// @015A: athrow
		// @015B: iconst_1
		// @015C: putstatic boolean game.C_100034_gi.field_104029_d
		// @015F: goto @0163
		// @0162: athrow
		// @0163: getstatic int game.C_100200_ba.field_105852_c
		// @0166: iconst_m1
		// @0167: ixor
		// @0168: bipush -2 (0xFE)
		// @016A: if_icmpeq @0183
		// @016D: getstatic int game.C_100338_jc.field_105363_f
		// @0170: bipush 6 (0x06)
		// @0172: isub
		// @0173: iconst_0
		// @0174: invokestatic java.lang.Math.max(int, int)int
		// @0177: putstatic int game.C_100338_jc.field_105363_f
		// @017A: iload #32
		// @017C: ifeq @0195
		// @017F: goto @0183
		// @0182: athrow
		// @0183: bipush 6 (0x06)
		// @0185: getstatic int game.C_100338_jc.field_105363_f
		// @0188: iadd
		// @0189: bipush 57 (0x39)
		// @018B: invokestatic java.lang.Math.min(int, int)int
		// @018E: putstatic int game.C_100338_jc.field_105363_f
		// @0191: goto @0195
		// @0194: athrow
		// @0195: getstatic int game.C_100338_jc.field_105363_f
		// @0198: ifeq @01AF
		// @019B: bipush 57 (0x39)
		// @019D: getstatic int game.C_100338_jc.field_105363_f
		// @01A0: if_icmpne @01AB
		// @01A3: goto @01A7
		// @01A6: athrow
		// @01A7: goto @01AF
		// @01AA: athrow
		// @01AB: iconst_1
		// @01AC: putstatic boolean game.C_100034_gi.field_104029_d
		// @01AF: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @01B2: ifnull @0213
		// @01B5: getstatic game.C_100327_ib game.C_100254_pi.field_106459_h
		// @01B8: ifnull @01D2
		// @01BB: goto @01BF
		// @01BE: athrow
		// @01BF: getstatic game.C_100327_ib game.C_100254_pi.field_106459_h
		// @01C2: getfield int game.C_100327_ib.field_102494_P
		// @01C5: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @01C8: getfield int game.C_100327_ib.field_102494_P
		// @01CB: if_icmpeq @0213
		// @01CE: goto @01D2
		// @01D1: athrow
		// @01D2: getstatic int[] game.C_100280_nf.field_101178_o
		// @01D5: iconst_0
		// @01D6: iaload
		// @01D7: istore #5
		// @01D9: bipush 69 (0x45)
		// @01DB: iload #5
		// @01DD: invokestatic game.C_100042_we.func_104129_b(int, int)int[]
		// @01E0: astore #6
		// @01E2: iconst_0
		// @01E3: istore #7
		// @01E5: iload #7
		// @01E7: getstatic int[] game.C_100132_td.field_104986_p
		// @01EA: arraylength
		// @01EB: if_icmpge @0206
		// @01EE: getstatic int[] game.C_100132_td.field_104986_p
		// @01F1: iload #7
		// @01F3: iconst_m1
		// @01F4: iastore
		// @01F5: iinc #7 +1
		// @01F8: iload #32
		// @01FA: ifne @0213
		// @01FD: iload #32
		// @01FF: ifeq @01E5
		// @0202: goto @0206
		// @0205: athrow
		// @0206: aload #6
		// @0208: bipush 70 (0x46)
		// @020A: getstatic int[] game.C_100132_td.field_104986_p
		// @020D: invokestatic game.C_100157_db.func_103546_a(int[], byte, int[])game.C_100327_ib
		// @0210: putstatic game.C_100327_ib game.C_100254_pi.field_106459_h
		// @0213: getstatic int game.C_100017_wj.field_103815_g
		// @0216: iconst_m1
		// @0217: ixor
		// @0218: iconst_1
		// @0219: if_icmpne @0264
		// @021C: iconst_1
		// @021D: getstatic int game.C_100102_w.field_104636_c
		// @0220: if_icmpne @0264
		// @0223: goto @0227
		// @0226: athrow
		// @0227: bipush 82 (0x52)
		// @0229: invokestatic game.C_100044_vm.func_100933_a(byte)boolean
		// @022C: ifne @0237
		// @022F: goto @0233
		// @0232: athrow
		// @0233: goto @0264
		// @0236: athrow
		// @0237: iconst_0
		// @0238: istore #5
		// @023A: getstatic int[] game.C_100301_kb.field_107089_g
		// @023D: arraylength
		// @023E: iconst_m1
		// @023F: ixor
		// @0240: iload #5
		// @0242: iconst_m1
		// @0243: ixor
		// @0244: if_icmpge @0264
		// @0247: getstatic int[] game.C_100301_kb.field_107089_g
		// @024A: iload #5
		// @024C: getstatic int[] game.C_100132_td.field_104986_p
		// @024F: iload #5
		// @0251: iaload
		// @0252: iastore
		// @0253: iinc #5 +1
		// @0256: iload #32
		// @0258: ifne @0279
		// @025B: iload #32
		// @025D: ifeq @023A
		// @0260: goto @0264
		// @0263: athrow
		// @0264: iconst_m1
		// @0265: getstatic int game.C_100017_wj.field_103815_g
		// @0268: iconst_m1
		// @0269: ixor
		// @026A: if_icmplt @0279
		// @026D: bipush 82 (0x52)
		// @026F: invokestatic game.C_100044_vm.func_100933_a(byte)boolean
		// @0272: ifne @0626
		// @0275: goto @0279
		// @0278: athrow
		// @0279: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @027C: ifnonnull @0283
		// @027F: goto @06B1
		// @0282: athrow
		// @0283: iconst_1
		// @0284: getstatic int game.C_100102_w.field_104636_c
		// @0287: if_icmpne @02A3
		// @028A: getstatic boolean[] game.C_100309_lk.field_103258_hb
		// @028D: bipush 81 (0x51)
		// @028F: baload
		// @0290: ifeq @02A3
		// @0293: goto @0297
		// @0296: athrow
		// @0297: bipush 82 (0x52)
		// @0299: invokestatic game.C_100044_vm.func_100933_a(byte)boolean
		// @029C: ifne @056A
		// @029F: goto @02A3
		// @02A2: athrow
		// @02A3: bipush -3 (0xFD)
		// @02A5: getstatic int game.C_100102_w.field_104636_c
		// @02A8: iconst_m1
		// @02A9: ixor
		// @02AA: if_icmpne @02BD
		// @02AD: goto @02B1
		// @02B0: athrow
		// @02B1: bipush 82 (0x52)
		// @02B3: invokestatic game.C_100044_vm.func_100933_a(byte)boolean
		// @02B6: ifne @04D9
		// @02B9: goto @02BD
		// @02BC: athrow
		// @02BD: iconst_1
		// @02BE: getstatic int game.C_100102_w.field_104636_c
		// @02C1: if_icmpne @06B1
		// @02C4: goto @02C8
		// @02C7: athrow
		// @02C8: bipush 82 (0x52)
		// @02CA: invokestatic game.C_100044_vm.func_100933_a(byte)boolean
		// @02CD: ifne @02D8
		// @02D0: goto @02D4
		// @02D3: athrow
		// @02D4: goto @06B1
		// @02D7: athrow
		// @02D8: iconst_0
		// @02D9: getstatic int game.C_100200_ba.field_105852_c
		// @02DC: bipush 16 (0x10)
		// @02DE: iand
		// @02DF: if_icmpeq @0334
		// @02E2: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @02E5: ifnull @0334
		// @02E8: goto @02EC
		// @02EB: athrow
		// @02EC: iconst_0
		// @02ED: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @02F0: getfield int game.C_100049_vf.field_104203_a
		// @02F3: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @02F6: getfield int game.C_100327_ib.field_102497_w
		// @02F9: iand
		// @02FA: if_icmplt @0305
		// @02FD: goto @0301
		// @0300: athrow
		// @0301: goto @06B1
		// @0304: athrow
		// @0305: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0308: getfield int game.C_100327_ib.field_102494_P
		// @030B: iconst_m1
		// @030C: ixor
		// @030D: bipush -84 (0xAC)
		// @030F: if_icmpeq @0316
		// @0312: goto @0318
		// @0315: athrow
		// @0316: iconst_1
		// @0317: istore_1
		// @0318: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @031B: new game.C_100327_ib
		// @031E: dup
		// @031F: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0322: invokespecial game.C_100327_ib.<init>(game.C_100327_ib)void
		// @0325: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0328: bipush 25 (0x19)
		// @032A: bipush 8 (0x08)
		// @032C: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @032F: iload #32
		// @0331: ifeq @06B1
		// @0334: aconst_null
		// @0335: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @0338: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @033B: if_acmpeq @0461
		// @033E: goto @0342
		// @0341: athrow
		// @0342: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0345: ifnull @03B8
		// @0348: goto @034C
		// @034B: athrow
		// @034C: iconst_0
		// @034D: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0350: getfield int game.C_100327_ib.field_102497_w
		// @0353: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @0356: getfield int game.C_100049_vf.field_104203_a
		// @0359: iand
		// @035A: if_icmpge @03B8
		// @035D: goto @0361
		// @0360: athrow
		// @0361: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @0364: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0367: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @036A: bipush -84 (0xAC)
		// @036C: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @036F: getfield int game.C_100327_ib.field_102494_P
		// @0372: iconst_m1
		// @0373: ixor
		// @0374: if_icmpne @037D
		// @0377: goto @037B
		// @037A: athrow
		// @037B: iconst_1
		// @037C: istore_1
		// @037D: bipush 25 (0x19)
		// @037F: bipush 8 (0x08)
		// @0381: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @0384: getstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @0387: ifnull @03AB
		// @038A: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @038D: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @0390: getfield int game.C_100049_vf.field_104209_k
		// @0393: bipush 108 (0x6C)
		// @0395: invokevirtual game.C_100327_ib.func_102443_c(int, byte)game.C_100049_vf
		// @0398: astore #5
		// @039A: aload #5
		// @039C: ifnonnull @03A3
		// @039F: goto @03AB
		// @03A2: athrow
		// @03A3: aload #5
		// @03A5: getstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @03A8: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @03AB: aconst_null
		// @03AC: putstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @03AF: aconst_null
		// @03B0: putstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @03B3: iload #32
		// @03B5: ifeq @06B1
		// @03B8: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @03BB: ifnonnull @06B1
		// @03BE: goto @03C2
		// @03C1: athrow
		// @03C2: aconst_null
		// @03C3: putstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @03C6: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @03C9: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @03CC: putstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @03CF: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @03D2: getfield int game.C_100327_ib.field_102497_w
		// @03D5: iconst_4
		// @03D6: if_icmpeq @03EF
		// @03D9: goto @03DD
		// @03DC: athrow
		// @03DD: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @03E0: getfield int game.C_100327_ib.field_102497_w
		// @03E3: iconst_m1
		// @03E4: ixor
		// @03E5: sipush -2049 (0xF7FF)
		// @03E8: if_icmpne @0423
		// @03EB: goto @03EF
		// @03EE: athrow
		// @03EF: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @03F2: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @03F5: getfield int game.C_100049_vf.field_104209_k
		// @03F8: bipush -100 (0x9C)
		// @03FA: invokevirtual game.C_100327_ib.func_102443_c(int, byte)game.C_100049_vf
		// @03FD: astore #5
		// @03FF: aload #5
		// @0401: ifnonnull @0411
		// @0404: aconst_null
		// @0405: putstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @0408: iload #32
		// @040A: ifeq @0423
		// @040D: goto @0411
		// @0410: athrow
		// @0411: aload #5
		// @0413: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0416: putstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @0419: aload #5
		// @041B: aconst_null
		// @041C: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @041F: goto @0423
		// @0422: athrow
		// @0423: aconst_null
		// @0424: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @0427: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @042A: if_acmpeq @0443
		// @042D: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @0430: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0433: getfield int game.C_100327_ib.field_102494_P
		// @0436: iconst_m1
		// @0437: ixor
		// @0438: bipush -84 (0xAC)
		// @043A: if_icmpne @0443
		// @043D: goto @0441
		// @0440: athrow
		// @0441: iconst_1
		// @0442: istore_1
		// @0443: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0446: ifnonnull @0455
		// @0449: aconst_null
		// @044A: putstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @044D: aconst_null
		// @044E: putstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0451: goto @0455
		// @0454: athrow
		// @0455: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @0458: aconst_null
		// @0459: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @045C: iload #32
		// @045E: ifeq @06B1
		// @0461: aconst_null
		// @0462: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0465: if_acmpeq @06B1
		// @0468: goto @046C
		// @046B: athrow
		// @046C: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @046F: getfield int game.C_100049_vf.field_104203_a
		// @0472: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0475: getfield int game.C_100327_ib.field_102497_w
		// @0478: iand
		// @0479: ifgt @0484
		// @047C: goto @0480
		// @047F: athrow
		// @0480: goto @06B1
		// @0483: athrow
		// @0484: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @0487: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @048A: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @048D: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0490: getfield int game.C_100327_ib.field_102494_P
		// @0493: bipush 83 (0x53)
		// @0495: if_icmpne @049A
		// @0498: iconst_1
		// @0499: istore_1
		// @049A: bipush 25 (0x19)
		// @049C: bipush 8 (0x08)
		// @049E: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @04A1: getstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @04A4: ifnonnull @04AB
		// @04A7: goto @04CC
		// @04AA: athrow
		// @04AB: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @04AE: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @04B1: getfield int game.C_100049_vf.field_104209_k
		// @04B4: bipush 68 (0x44)
		// @04B6: invokevirtual game.C_100327_ib.func_102443_c(int, byte)game.C_100049_vf
		// @04B9: astore #5
		// @04BB: aload #5
		// @04BD: ifnull @04CC
		// @04C0: aload #5
		// @04C2: getstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @04C5: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @04C8: goto @04CC
		// @04CB: athrow
		// @04CC: aconst_null
		// @04CD: putstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @04D0: aconst_null
		// @04D1: putstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @04D4: iload #32
		// @04D6: ifeq @06B1
		// @04D9: aconst_null
		// @04DA: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @04DD: if_acmpne @0559
		// @04E0: goto @04E4
		// @04E3: athrow
		// @04E4: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @04E7: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @04EA: astore #5
		// @04EC: aconst_null
		// @04ED: aload #5
		// @04EF: if_acmpeq @0534
		// @04F2: iconst_4
		// @04F3: aload #5
		// @04F5: getfield int game.C_100327_ib.field_102497_w
		// @04F8: if_icmpeq @0514
		// @04FB: goto @04FF
		// @04FE: athrow
		// @04FF: aload #5
		// @0501: getfield int game.C_100327_ib.field_102497_w
		// @0504: iconst_m1
		// @0505: ixor
		// @0506: sipush -2049 (0xF7FF)
		// @0509: if_icmpeq @0514
		// @050C: goto @0510
		// @050F: athrow
		// @0510: goto @0534
		// @0513: athrow
		// @0514: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0517: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @051A: getfield int game.C_100049_vf.field_104209_k
		// @051D: bipush -72 (0xB8)
		// @051F: invokevirtual game.C_100327_ib.func_102443_c(int, byte)game.C_100049_vf
		// @0522: astore #6
		// @0524: aconst_null
		// @0525: aload #6
		// @0527: if_acmpne @052E
		// @052A: goto @0534
		// @052D: athrow
		// @052E: aload #6
		// @0530: aconst_null
		// @0531: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0534: aload #5
		// @0536: ifnull @054D
		// @0539: bipush 83 (0x53)
		// @053B: aload #5
		// @053D: getfield int game.C_100327_ib.field_102494_P
		// @0540: if_icmpeq @054B
		// @0543: goto @0547
		// @0546: athrow
		// @0547: goto @054D
		// @054A: athrow
		// @054B: iconst_1
		// @054C: istore_1
		// @054D: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @0550: aconst_null
		// @0551: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0554: iload #32
		// @0556: ifeq @06B1
		// @0559: aconst_null
		// @055A: putstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @055D: aconst_null
		// @055E: putstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0561: iload #32
		// @0563: ifeq @06B1
		// @0566: goto @056A
		// @0569: athrow
		// @056A: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @056D: astore #5
		// @056F: getstatic game.C_100327_ib game.C_100254_pi.field_106459_h
		// @0572: iconst_0
		// @0573: aload #5
		// @0575: invokevirtual game.C_100327_ib.func_102450_a(boolean, game.C_100049_vf)int
		// @0578: istore #6
		// @057A: iconst_0
		// @057B: iload #6
		// @057D: if_icmpgt @0621
		// @0580: aload #5
		// @0582: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0585: ifnull @05A1
		// @0588: goto @058C
		// @058B: athrow
		// @058C: iload #6
		// @058E: aload #5
		// @0590: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0593: getfield int game.C_100327_ib.field_102494_P
		// @0596: if_icmpne @05A1
		// @0599: goto @059D
		// @059C: athrow
		// @059D: goto @0621
		// @05A0: athrow
		// @05A1: aconst_null
		// @05A2: aload #5
		// @05A4: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @05A7: if_acmpeq @05BF
		// @05AA: aload #5
		// @05AC: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @05AF: getfield int game.C_100327_ib.field_102494_P
		// @05B2: iconst_m1
		// @05B3: ixor
		// @05B4: bipush -84 (0xAC)
		// @05B6: if_icmpne @05BF
		// @05B9: goto @05BD
		// @05BC: athrow
		// @05BD: iconst_1
		// @05BE: istore_1
		// @05BF: aload #5
		// @05C1: new game.C_100327_ib
		// @05C4: dup
		// @05C5: iload #6
		// @05C7: bipush 95 (0x5F)
		// @05C9: invokestatic game.C_100209_qb.func_102686_b(int, byte)game.C_100327_ib
		// @05CC: invokespecial game.C_100327_ib.<init>(game.C_100327_ib)void
		// @05CF: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @05D2: bipush -51 (0xCD)
		// @05D4: iload #6
		// @05D6: invokestatic game.C_100073_f.func_101710_a(byte, int)int
		// @05D9: istore #7
		// @05DB: iload #6
		// @05DD: bipush 83 (0x53)
		// @05DF: if_icmpeq @05E6
		// @05E2: goto @05E8
		// @05E5: athrow
		// @05E6: iconst_1
		// @05E7: istore_1
		// @05E8: iload #7
		// @05EA: iflt @061A
		// @05ED: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @05F0: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @05F3: getfield int game.C_100049_vf.field_104209_k
		// @05F6: bipush -57 (0xC7)
		// @05F8: invokevirtual game.C_100327_ib.func_102443_c(int, byte)game.C_100049_vf
		// @05FB: astore #8
		// @05FD: aconst_null
		// @05FE: aload #8
		// @0600: if_acmpeq @061A
		// @0603: aload #8
		// @0605: new game.C_100327_ib
		// @0608: dup
		// @0609: iload #7
		// @060B: bipush 123 (0x7B)
		// @060D: invokestatic game.C_100209_qb.func_102686_b(int, byte)game.C_100327_ib
		// @0610: invokespecial game.C_100327_ib.<init>(game.C_100327_ib)void
		// @0613: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0616: goto @061A
		// @0619: athrow
		// @061A: bipush 25 (0x19)
		// @061C: bipush 8 (0x08)
		// @061E: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @0621: iload #32
		// @0623: ifeq @06B1
		// @0626: getstatic int game.C_100102_w.field_104636_c
		// @0629: iconst_2
		// @062A: if_icmpne @0660
		// @062D: goto @0631
		// @0630: athrow
		// @0631: iconst_m1
		// @0632: getstatic int game.C_100174_sb.field_105609_b
		// @0635: iconst_m1
		// @0636: ixor
		// @0637: if_icmpge @064F
		// @063A: goto @063E
		// @063D: athrow
		// @063E: getstatic int[] game.C_100301_kb.field_107089_g
		// @0641: getstatic int game.C_100017_wj.field_103815_g
		// @0644: iconst_m1
		// @0645: iastore
		// @0646: iload #32
		// @0648: ifeq @06B1
		// @064B: goto @064F
		// @064E: athrow
		// @064F: iconst_m1
		// @0650: putstatic int game.C_100174_sb.field_105609_b
		// @0653: iconst_1
		// @0654: putstatic boolean game.C_100034_gi.field_104029_d
		// @0657: iload #32
		// @0659: ifeq @06B1
		// @065C: goto @0660
		// @065F: athrow
		// @0660: bipush -2 (0xFE)
		// @0662: getstatic int game.C_100102_w.field_104636_c
		// @0665: iconst_m1
		// @0666: ixor
		// @0667: if_icmpne @06B1
		// @066A: goto @066E
		// @066D: athrow
		// @066E: getstatic int[] game.C_100301_kb.field_107089_g
		// @0671: getstatic int game.C_100017_wj.field_103815_g
		// @0674: iaload
		// @0675: istore #5
		// @0677: getstatic int[] game.C_100301_kb.field_107089_g
		// @067A: getstatic int game.C_100017_wj.field_103815_g
		// @067D: getstatic int game.C_100174_sb.field_105609_b
		// @0680: iastore
		// @0681: getstatic int game.C_100174_sb.field_105609_b
		// @0684: iflt @0694
		// @0687: iconst_m1
		// @0688: putstatic int game.C_100174_sb.field_105609_b
		// @068B: iload #32
		// @068D: ifeq @069D
		// @0690: goto @0694
		// @0693: athrow
		// @0694: iload #5
		// @0696: putstatic int game.C_100174_sb.field_105609_b
		// @0699: goto @069D
		// @069C: athrow
		// @069D: getstatic int game.C_100200_ba.field_105852_c
		// @06A0: ifeq @06B1
		// @06A3: iconst_1
		// @06A4: putstatic boolean game.C_100034_gi.field_104029_d
		// @06A7: iconst_0
		// @06A8: putstatic int game.C_100200_ba.field_105852_c
		// @06AB: iconst_1
		// @06AC: putstatic boolean game.C_100309_lk.field_103271_ab
		// @06AF: iconst_1
		// @06B0: istore_1
		// @06B1: getstatic game.C_100302_ka game.C_100189_ri.field_105752_d
		// @06B4: ifnonnull @06BB
		// @06B7: goto @1323
		// @06BA: athrow
		// @06BB: aconst_null
		// @06BC: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @06BF: if_acmpeq @06DC
		// @06C2: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @06C5: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @06C8: ifnull @06DC
		// @06CB: goto @06CF
		// @06CE: athrow
		// @06CF: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @06D2: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @06D5: getfield int game.C_100302_ka.field_101880_Gb
		// @06D8: goto @06DE
		// @06DB: athrow
		// @06DC: ldc -2147483648 (0x80000000)
		// @06DE: istore #5
		// @06E0: getstatic game.C_100115_ej game.C_100316_lc.field_102410_w
		// @06E3: ifnull @0701
		// @06E6: aconst_null
		// @06E7: getstatic game.C_100115_ej game.C_100316_lc.field_102410_w
		// @06EA: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @06ED: if_acmpeq @0701
		// @06F0: goto @06F4
		// @06F3: athrow
		// @06F4: getstatic game.C_100115_ej game.C_100316_lc.field_102410_w
		// @06F7: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @06FA: getfield int game.C_100302_ka.field_101880_Gb
		// @06FD: goto @0703
		// @0700: athrow
		// @0701: ldc -2147483648 (0x80000000)
		// @0703: istore #6
		// @0705: getstatic game.C_100302_ka game.C_100189_ri.field_105752_d
		// @0708: iconst_1
		// @0709: bipush 31 (0x1F)
		// @070B: invokevirtual game.C_100302_ka.func_101819_a(boolean, byte)void
		// @070E: aconst_null
		// @070F: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @0712: if_acmpeq @072F
		// @0715: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @0718: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @071B: ifnull @072F
		// @071E: goto @0722
		// @0721: athrow
		// @0722: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @0725: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @0728: getfield int game.C_100302_ka.field_101880_Gb
		// @072B: goto @0731
		// @072E: athrow
		// @072F: ldc -2147483648 (0x80000000)
		// @0731: istore #7
		// @0733: iload #7
		// @0735: iload #5
		// @0737: if_icmpeq @0742
		// @073A: iconst_1
		// @073B: putstatic boolean game.C_100309_lk.field_103271_ab
		// @073E: goto @0742
		// @0741: athrow
		// @0742: getstatic game.C_100115_ej game.C_100316_lc.field_102410_w
		// @0745: ifnull @0763
		// @0748: aconst_null
		// @0749: getstatic game.C_100115_ej game.C_100316_lc.field_102410_w
		// @074C: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @074F: if_acmpeq @0763
		// @0752: goto @0756
		// @0755: athrow
		// @0756: getstatic game.C_100115_ej game.C_100316_lc.field_102410_w
		// @0759: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @075C: getfield int game.C_100302_ka.field_101880_Gb
		// @075F: goto @0765
		// @0762: athrow
		// @0763: ldc -2147483648 (0x80000000)
		// @0765: istore #8
		// @0767: iload #6
		// @0769: iload #8
		// @076B: if_icmpeq @0776
		// @076E: iconst_1
		// @076F: putstatic boolean game.C_100034_gi.field_104029_d
		// @0772: goto @0776
		// @0775: athrow
		// @0776: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @0779: astore #9
		// @077B: aload #9
		// @077D: ifnull @0845
		// @0780: aload #9
		// @0782: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @0785: ifnull @0798
		// @0788: goto @078C
		// @078B: athrow
		// @078C: aload #9
		// @078E: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @0791: getfield int game.C_100302_ka.field_101880_Gb
		// @0794: goto @079A
		// @0797: athrow
		// @0798: ldc -2147483648 (0x80000000)
		// @079A: istore #10
		// @079C: aload #9
		// @079E: bipush 32 (0x20)
		// @07A0: bipush -89 (0xA7)
		// @07A2: iconst_0
		// @07A3: sipush 128 (0x0080)
		// @07A6: getstatic int game.C_100242_oh.field_106344_e
		// @07A9: bipush 32 (0x20)
		// @07AB: imul
		// @07AC: invokevirtual game.C_100115_ej.func_102025_a(int, int, boolean, int, int)void
		// @07AF: aconst_null
		// @07B0: aload #9
		// @07B2: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @07B5: if_acmpne @07BE
		// @07B8: ldc -2147483648 (0x80000000)
		// @07BA: goto @07C6
		// @07BD: athrow
		// @07BE: aload #9
		// @07C0: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @07C3: getfield int game.C_100302_ka.field_101880_Gb
		// @07C6: istore #11
		// @07C8: iload #11
		// @07CA: iload #10
		// @07CC: if_icmpne @07D3
		// @07CF: goto @07D7
		// @07D2: athrow
		// @07D3: iconst_1
		// @07D4: putstatic boolean game.C_100309_lk.field_103271_ab
		// @07D7: iconst_m1
		// @07D8: istore #12
		// @07DA: iconst_m1
		// @07DB: getstatic int game.C_100200_ba.field_105852_c
		// @07DE: iconst_m1
		// @07DF: ixor
		// @07E0: if_icmpne @07EB
		// @07E3: iconst_3
		// @07E4: istore #12
		// @07E6: iload #32
		// @07E8: ifeq @082B
		// @07EB: iconst_m1
		// @07EC: getstatic int game.C_100200_ba.field_105852_c
		// @07EF: iconst_1
		// @07F0: iand
		// @07F1: iconst_m1
		// @07F2: ixor
		// @07F3: if_icmpne @0828
		// @07F6: goto @07FA
		// @07F9: athrow
		// @07FA: iconst_2
		// @07FB: getstatic int game.C_100200_ba.field_105852_c
		// @07FE: iand
		// @07FF: ifeq @080E
		// @0802: goto @0806
		// @0805: athrow
		// @0806: iconst_1
		// @0807: istore #12
		// @0809: iload #32
		// @080B: ifeq @082B
		// @080E: iconst_0
		// @080F: getstatic int game.C_100200_ba.field_105852_c
		// @0812: bipush 16 (0x10)
		// @0814: iand
		// @0815: if_icmpne @0820
		// @0818: goto @081C
		// @081B: athrow
		// @081C: goto @082B
		// @081F: athrow
		// @0820: iconst_2
		// @0821: istore #12
		// @0823: iload #32
		// @0825: ifeq @082B
		// @0828: iconst_0
		// @0829: istore #12
		// @082B: iconst_m1
		// @082C: iload #12
		// @082E: iconst_m1
		// @082F: ixor
		// @0830: if_icmpge @0837
		// @0833: goto @0845
		// @0836: athrow
		// @0837: getstatic int[] game.C_100074_g.field_104410_e
		// @083A: iload #12
		// @083C: aload #9
		// @083E: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @0841: getfield int game.C_100302_ka.field_101880_Gb
		// @0844: iastore
		// @0845: getstatic game.C_100115_ej game.C_100316_lc.field_102410_w
		// @0848: astore #10
		// @084A: aload #10
		// @084C: ifnull @08A6
		// @084F: aload #10
		// @0851: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @0854: ifnonnull @0861
		// @0857: goto @085B
		// @085A: athrow
		// @085B: ldc -2147483648 (0x80000000)
		// @085D: goto @0869
		// @0860: athrow
		// @0861: aload #10
		// @0863: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @0866: getfield int game.C_100302_ka.field_101880_Gb
		// @0869: istore #11
		// @086B: aload #10
		// @086D: bipush 32 (0x20)
		// @086F: bipush -105 (0x97)
		// @0871: iconst_0
		// @0872: sipush 128 (0x0080)
		// @0875: bipush 32 (0x20)
		// @0877: getstatic int game.C_100242_oh.field_106344_e
		// @087A: imul
		// @087B: invokevirtual game.C_100115_ej.func_102025_a(int, int, boolean, int, int)void
		// @087E: aconst_null
		// @087F: aload #10
		// @0881: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @0884: if_acmpne @088D
		// @0887: ldc -2147483648 (0x80000000)
		// @0889: goto @0895
		// @088C: athrow
		// @088D: aload #10
		// @088F: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @0892: getfield int game.C_100302_ka.field_101880_Gb
		// @0895: istore #12
		// @0897: iload #12
		// @0899: iload #11
		// @089B: if_icmpne @08A2
		// @089E: goto @08A6
		// @08A1: athrow
		// @08A2: iconst_1
		// @08A3: putstatic boolean game.C_100034_gi.field_104029_d
		// @08A6: getstatic int game.C_100102_w.field_104636_c
		// @08A9: iconst_m1
		// @08AA: ixor
		// @08AB: bipush -2 (0xFE)
		// @08AD: if_icmpne @09B4
		// @08B0: getstatic int game.C_100200_ba.field_105852_c
		// @08B3: istore #11
		// @08B5: getstatic game.C_100302_ka[] game.C_100103_eh.field_104669_j
		// @08B8: iconst_0
		// @08B9: aaload
		// @08BA: astore #12
		// @08BC: aconst_null
		// @08BD: aload #12
		// @08BF: if_acmpeq @08D8
		// @08C2: aload #12
		// @08C4: getfield boolean game.C_100302_ka.field_101839_db
		// @08C7: ifne @08D2
		// @08CA: goto @08CE
		// @08CD: athrow
		// @08CE: goto @08D8
		// @08D1: athrow
		// @08D2: iconst_1
		// @08D3: istore_1
		// @08D4: iconst_1
		// @08D5: putstatic int game.C_100200_ba.field_105852_c
		// @08D8: getstatic game.C_100302_ka[] game.C_100103_eh.field_104669_j
		// @08DB: iconst_1
		// @08DC: aaload
		// @08DD: astore #12
		// @08DF: aload #12
		// @08E1: ifnull @08F8
		// @08E4: aload #12
		// @08E6: getfield boolean game.C_100302_ka.field_101839_db
		// @08E9: ifeq @08F8
		// @08EC: goto @08F0
		// @08EF: athrow
		// @08F0: iconst_1
		// @08F1: istore_1
		// @08F2: sipush 2062 (0x080E)
		// @08F5: putstatic int game.C_100200_ba.field_105852_c
		// @08F8: getstatic game.C_100302_ka[] game.C_100103_eh.field_104669_j
		// @08FB: iconst_2
		// @08FC: aaload
		// @08FD: astore #12
		// @08FF: aconst_null
		// @0900: aload #12
		// @0902: if_acmpeq @0919
		// @0905: aload #12
		// @0907: getfield boolean game.C_100302_ka.field_101839_db
		// @090A: ifeq @0919
		// @090D: goto @0911
		// @0910: athrow
		// @0911: sipush 1008 (0x03F0)
		// @0914: putstatic int game.C_100200_ba.field_105852_c
		// @0917: iconst_1
		// @0918: istore_1
		// @0919: getstatic game.C_100302_ka[] game.C_100103_eh.field_104669_j
		// @091C: iconst_3
		// @091D: aaload
		// @091E: astore #12
		// @0920: aload #12
		// @0922: ifnull @0937
		// @0925: aload #12
		// @0927: getfield boolean game.C_100302_ka.field_101839_db
		// @092A: ifeq @0937
		// @092D: goto @0931
		// @0930: athrow
		// @0931: iconst_1
		// @0932: istore_1
		// @0933: iconst_0
		// @0934: putstatic int game.C_100200_ba.field_105852_c
		// @0937: iload #11
		// @0939: getstatic int game.C_100200_ba.field_105852_c
		// @093C: if_icmpeq @09B4
		// @093F: aconst_null
		// @0940: aload #9
		// @0942: if_acmpne @094D
		// @0945: goto @0949
		// @0948: athrow
		// @0949: goto @099E
		// @094C: athrow
		// @094D: iconst_m1
		// @094E: istore #13
		// @0950: iload #11
		// @0952: iconst_1
		// @0953: iand
		// @0954: iconst_m1
		// @0955: ixor
		// @0956: iconst_m1
		// @0957: if_icmpne @095E
		// @095A: goto @0961
		// @095D: athrow
		// @095E: iconst_0
		// @095F: istore #13
		// @0961: iload #11
		// @0963: iconst_2
		// @0964: iand
		// @0965: iconst_m1
		// @0966: ixor
		// @0967: iconst_m1
		// @0968: if_icmpne @096F
		// @096B: goto @0972
		// @096E: athrow
		// @096F: iconst_1
		// @0970: istore #13
		// @0972: iconst_0
		// @0973: iload #11
		// @0975: bipush 16 (0x10)
		// @0977: iand
		// @0978: if_icmpeq @097E
		// @097B: iconst_2
		// @097C: istore #13
		// @097E: iconst_0
		// @097F: iload #11
		// @0981: if_icmpne @0987
		// @0984: iconst_3
		// @0985: istore #13
		// @0987: iload #13
		// @0989: ifge @0990
		// @098C: goto @099E
		// @098F: athrow
		// @0990: getstatic int[] game.C_100074_g.field_104410_e
		// @0993: iload #13
		// @0995: aload #9
		// @0997: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @099A: getfield int game.C_100302_ka.field_101880_Gb
		// @099D: iastore
		// @099E: iconst_m1
		// @099F: putstatic int game.C_100174_sb.field_105609_b
		// @09A2: aconst_null
		// @09A3: putstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @09A6: aconst_null
		// @09A7: putstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @09AA: bipush 95 (0x5F)
		// @09AC: iload_0
		// @09AD: sipush -27932 (0x92E4)
		// @09B0: ixor
		// @09B1: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @09B4: iconst_0
		// @09B5: putstatic boolean game.C_100064_ve.field_103011_A
		// @09B8: aconst_null
		// @09B9: putstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @09BC: getstatic game.C_100302_ka game.C_100145_ta.field_100422_e
		// @09BF: astore #11
		// @09C1: iconst_m1
		// @09C2: putstatic int game.C_100242_oh.field_106343_d
		// @09C5: aload #11
		// @09C7: ifnonnull @09CE
		// @09CA: goto @1300
		// @09CD: athrow
		// @09CE: iconst_m1
		// @09CF: getstatic int game.C_100200_ba.field_105852_c
		// @09D2: iconst_m1
		// @09D3: ixor
		// @09D4: if_icmpne @0CB0
		// @09D7: iconst_0
		// @09D8: istore #12
		// @09DA: bipush -36 (0xDC)
		// @09DC: iload #12
		// @09DE: iconst_m1
		// @09DF: ixor
		// @09E0: if_icmpge @0CAB
		// @09E3: getstatic game.C_100302_ka[] game.C_100063_dj.field_104290_f
		// @09E6: iload #12
		// @09E8: aaload
		// @09E9: astore #13
		// @09EB: aload #13
		// @09ED: iload #32
		// @09EF: ifne @1433
		// @09F2: ifnull @0CA3
		// @09F5: goto @09F9
		// @09F8: athrow
		// @09F9: aload #13
		// @09FB: getfield boolean game.C_100302_ka.field_101839_db
		// @09FE: ifeq @0CA3
		// @0A01: goto @0A05
		// @0A04: athrow
		// @0A05: aload #13
		// @0A07: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @0A0A: bipush 6 (0x06)
		// @0A0C: aaload
		// @0A0D: bipush -111 (0x91)
		// @0A0F: invokevirtual game.C_100302_ka.func_101822_a(java.lang.String, byte)game.C_100302_ka
		// @0A12: astore #14
		// @0A14: aconst_null
		// @0A15: aload #14
		// @0A17: if_acmpeq @0A2E
		// @0A1A: aload #14
		// @0A1C: getfield boolean game.C_100302_ka.field_101839_db
		// @0A1F: ifeq @0A2E
		// @0A22: goto @0A26
		// @0A25: athrow
		// @0A26: iconst_1
		// @0A27: putstatic boolean game.C_100064_ve.field_103011_A
		// @0A2A: goto @0A2E
		// @0A2D: athrow
		// @0A2E: iconst_1
		// @0A2F: getstatic int game.C_100102_w.field_104636_c
		// @0A32: if_icmpne @0A4B
		// @0A35: getstatic boolean game.C_100064_ve.field_103011_A
		// @0A38: ifeq @0A4B
		// @0A3B: goto @0A3F
		// @0A3E: athrow
		// @0A3F: bipush 82 (0x52)
		// @0A41: invokestatic game.C_100044_vm.func_100933_a(byte)boolean
		// @0A44: ifne @0A90
		// @0A47: goto @0A4B
		// @0A4A: athrow
		// @0A4B: bipush -2 (0xFE)
		// @0A4D: getstatic int game.C_100102_w.field_104636_c
		// @0A50: iconst_m1
		// @0A51: ixor
		// @0A52: if_icmpne @0C15
		// @0A55: goto @0A59
		// @0A58: athrow
		// @0A59: iload #12
		// @0A5B: bipush -128 (0x80)
		// @0A5D: invokestatic game.C_100016_wi.func_103796_a(int, byte)boolean
		// @0A60: ifeq @0C15
		// @0A63: goto @0A67
		// @0A66: athrow
		// @0A67: bipush 82 (0x52)
		// @0A69: invokestatic game.C_100044_vm.func_100933_a(byte)boolean
		// @0A6C: ifeq @0C15
		// @0A6F: goto @0A73
		// @0A72: athrow
		// @0A73: aconst_null
		// @0A74: putstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @0A77: iload #12
		// @0A79: putstatic int game.C_100174_sb.field_105609_b
		// @0A7C: aconst_null
		// @0A7D: putstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0A80: bipush 100 (0x64)
		// @0A82: bipush 8 (0x08)
		// @0A84: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @0A87: iload #32
		// @0A89: ifeq @0C15
		// @0A8C: goto @0A90
		// @0A8F: athrow
		// @0A90: aconst_null
		// @0A91: astore #15
		// @0A93: iload #12
		// @0A95: getstatic int[] game.C_100075_uj.field_100655_u
		// @0A98: bipush -122 (0x86)
		// @0A9A: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @0A9D: ifne @0BA6
		// @0AA0: getstatic int[] game.C_100257_ln.field_106481_d
		// @0AA3: getstatic int[] game.C_100075_uj.field_100655_u
		// @0AA6: iload #12
		// @0AA8: getstatic int[] game.C_100066_dl.field_101632_G
		// @0AAB: bipush 100 (0x64)
		// @0AAD: bipush -128 (0x80)
		// @0AAF: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @0AB2: invokestatic game.C_100235_om.func_106281_a(int[], int[], int, int[], byte, boolean)boolean
		// @0AB5: ifne @0B82
		// @0AB8: goto @0ABC
		// @0ABB: athrow
		// @0ABC: getstatic java.lang.String game.C_100138_bo.field_100402_g
		// @0ABF: astore #15
		// @0AC1: getstatic game.C_100037_wb[] game.C_100058_dg.field_101562_E
		// @0AC4: iconst_2
		// @0AC5: aaload
		// @0AC6: putstatic game.C_100037_wb game.C_100144_bm.field_102094_ac
		// @0AC9: iload #12
		// @0ACB: bipush 90 (0x5A)
		// @0ACD: invokestatic game.C_100009_fg.func_103641_a(int, byte)int
		// @0AD0: istore #16
		// @0AD2: iconst_0
		// @0AD3: iload #16
		// @0AD5: if_icmpgt @0B15
		// @0AD8: iload #16
		// @0ADA: getstatic int[] game.C_100075_uj.field_100655_u
		// @0ADD: iload_0
		// @0ADE: sipush 28009 (0x6D69)
		// @0AE1: ixor
		// @0AE2: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @0AE5: ifeq @0AF0
		// @0AE8: goto @0AEC
		// @0AEB: athrow
		// @0AEC: goto @0B15
		// @0AEF: athrow
		// @0AF0: getstatic java.lang.String game.C_100254_pi.field_106463_u
		// @0AF3: astore #15
		// @0AF5: sipush -30945 (0x871F)
		// @0AF8: iconst_2
		// @0AF9: anewarray java.lang.String
		// @0AFC: dup
		// @0AFD: iconst_0
		// @0AFE: getstatic java.lang.String[] game.C_100167_sj.field_100794_t
		// @0B01: iload #16
		// @0B03: aaload
		// @0B04: aastore
		// @0B05: dup
		// @0B06: iconst_1
		// @0B07: getstatic java.lang.String[] game.C_100167_sj.field_100794_t
		// @0B0A: iload #12
		// @0B0C: aaload
		// @0B0D: aastore
		// @0B0E: aload #15
		// @0B10: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0B13: astore #15
		// @0B15: iload #12
		// @0B17: istore #17
		// @0B19: iload #17
		// @0B1B: bipush 26 (0x1A)
		// @0B1D: if_icmpne @0B29
		// @0B20: iload #32
		// @0B22: ifeq @0B5C
		// @0B25: goto @0B29
		// @0B28: athrow
		// @0B29: bipush 23 (0x17)
		// @0B2B: iload #17
		// @0B2D: if_icmpne @0B3D
		// @0B30: goto @0B34
		// @0B33: athrow
		// @0B34: iload #32
		// @0B36: ifeq @0B66
		// @0B39: goto @0B3D
		// @0B3C: athrow
		// @0B3D: iload #17
		// @0B3F: bipush 25 (0x19)
		// @0B41: if_icmpeq @0B70
		// @0B44: goto @0B48
		// @0B47: athrow
		// @0B48: bipush 27 (0x1B)
		// @0B4A: iload #17
		// @0B4C: if_icmpne @0B7F
		// @0B4F: goto @0B53
		// @0B52: athrow
		// @0B53: iload #32
		// @0B55: ifeq @0B7A
		// @0B58: goto @0B5C
		// @0B5B: athrow
		// @0B5C: getstatic java.lang.String game.C_100092_um.field_104528_f
		// @0B5F: astore #15
		// @0B61: iload #32
		// @0B63: ifeq @0B7F
		// @0B66: getstatic java.lang.String game.C_100253_ph.field_101110_q
		// @0B69: astore #15
		// @0B6B: iload #32
		// @0B6D: ifeq @0B7F
		// @0B70: getstatic java.lang.String game.C_100028_ha.field_103949_c
		// @0B73: astore #15
		// @0B75: iload #32
		// @0B77: ifeq @0B7F
		// @0B7A: getstatic java.lang.String game.C_100313_lg.field_107167_c
		// @0B7D: astore #15
		// @0B7F: goto @0BB3
		// @0B82: getstatic int[] game.C_100328_ia.field_107259_b
		// @0B85: iload #12
		// @0B87: iaload
		// @0B88: iconst_m1
		// @0B89: ixor
		// @0B8A: getstatic int game.C_100096_un.field_104563_d
		// @0B8D: iconst_m1
		// @0B8E: ixor
		// @0B8F: if_icmplt @0B96
		// @0B92: goto @0BB3
		// @0B95: athrow
		// @0B96: getstatic game.C_100037_wb[] game.C_100058_dg.field_101562_E
		// @0B99: iconst_2
		// @0B9A: aaload
		// @0B9B: putstatic game.C_100037_wb game.C_100144_bm.field_102094_ac
		// @0B9E: getstatic java.lang.String game.C_100225_ah.field_106126_n
		// @0BA1: astore #15
		// @0BA3: goto @0BB3
		// @0BA6: getstatic java.lang.String game.C_100108_ee.field_100387_b
		// @0BA9: astore #15
		// @0BAB: getstatic game.C_100037_wb[] game.C_100058_dg.field_101562_E
		// @0BAE: iconst_0
		// @0BAF: aaload
		// @0BB0: putstatic game.C_100037_wb game.C_100144_bm.field_102094_ac
		// @0BB3: aload #15
		// @0BB5: ifnonnull @0BE0
		// @0BB8: bipush -25 (0xE7)
		// @0BBA: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @0BBD: ifeq @0BC8
		// @0BC0: goto @0BC4
		// @0BC3: athrow
		// @0BC4: goto @0BE0
		// @0BC7: athrow
		// @0BC8: iload #12
		// @0BCA: putstatic int game.C_100075_uj.field_100647_n
		// @0BCD: getstatic int[] game.C_100328_ia.field_107259_b
		// @0BD0: iload #12
		// @0BD2: iaload
		// @0BD3: putstatic int game.C_100008_fl.field_103639_a
		// @0BD6: bipush 95 (0x5F)
		// @0BD8: iload_0
		// @0BD9: sipush 27932 (0x6D1C)
		// @0BDC: iadd
		// @0BDD: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @0BE0: aconst_null
		// @0BE1: aload #15
		// @0BE3: if_acmpne @0BEA
		// @0BE6: goto @0C15
		// @0BE9: athrow
		// @0BEA: iload_0
		// @0BEB: sipush 5619 (0x15F3)
		// @0BEE: ixor
		// @0BEF: iconst_1
		// @0BF0: anewarray java.lang.String
		// @0BF3: dup
		// @0BF4: iconst_0
		// @0BF5: iload #12
		// @0BF7: bipush 34 (0x22)
		// @0BF9: if_icmpne @0C06
		// @0BFC: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @0BFF: bipush 18 (0x12)
		// @0C01: aaload
		// @0C02: goto @0C0C
		// @0C05: athrow
		// @0C06: getstatic java.lang.String[] game.C_100167_sj.field_100794_t
		// @0C09: iload #12
		// @0C0B: aaload
		// @0C0C: aastore
		// @0C0D: aload #15
		// @0C0F: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0C12: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @0C15: iload #12
		// @0C17: putstatic int game.C_100242_oh.field_106343_d
		// @0C1A: aconst_null
		// @0C1B: getstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @0C1E: if_acmpne @0CA3
		// @0C21: new game.C_100019_wl
		// @0C24: dup
		// @0C25: aload #13
		// @0C27: getfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @0C2A: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @0C2D: astore #15
		// @0C2F: aload #15
		// @0C31: bipush -128 (0x80)
		// @0C33: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @0C36: checkcast game.C_100302_ka
		// @0C39: astore #16
		// @0C3B: aconst_null
		// @0C3C: aload #16
		// @0C3E: if_acmpeq @0CA3
		// @0C41: aload #16
		// @0C43: getfield boolean game.C_100302_ka.field_101839_db
		// @0C46: iload #32
		// @0C48: ifne @09DC
		// @0C4B: ifeq @0C91
		// @0C4E: aconst_null
		// @0C4F: aload #16
		// @0C51: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @0C54: if_acmpeq @0C91
		// @0C57: goto @0C5B
		// @0C5A: athrow
		// @0C5B: aload #16
		// @0C5D: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @0C60: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @0C63: bipush 14 (0x0E)
		// @0C65: aaload
		// @0C66: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @0C69: ifeq @0C91
		// @0C6C: goto @0C70
		// @0C6F: athrow
		// @0C70: bipush -8 (0xF8)
		// @0C72: aload #16
		// @0C74: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @0C77: invokevirtual java.lang.String.length()int
		// @0C7A: iconst_m1
		// @0C7B: ixor
		// @0C7C: if_icmpne @0C91
		// @0C7F: goto @0C83
		// @0C82: athrow
		// @0C83: aload #16
		// @0C85: putstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @0C88: iload #32
		// @0C8A: ifeq @0CA3
		// @0C8D: goto @0C91
		// @0C90: athrow
		// @0C91: aload #15
		// @0C93: sipush -30820 (0x879C)
		// @0C96: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @0C99: checkcast game.C_100302_ka
		// @0C9C: astore #16
		// @0C9E: iload #32
		// @0CA0: ifeq @0C3B
		// @0CA3: iinc #12 +1
		// @0CA6: iload #32
		// @0CA8: ifeq @09DA
		// @0CAB: iload #32
		// @0CAD: ifeq @1300
		// @0CB0: iconst_0
		// @0CB1: istore #12
		// @0CB3: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @0CB6: bipush 71 (0x47)
		// @0CB8: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @0CBB: checkcast game.C_100327_ib
		// @0CBE: astore #13
		// @0CC0: aconst_null
		// @0CC1: aload #13
		// @0CC3: if_acmpeq @113C
		// @0CC6: aconst_null
		// @0CC7: astore #14
		// @0CC9: iconst_0
		// @0CCA: aload #13
		// @0CCC: getfield int game.C_100327_ib.field_102494_P
		// @0CCF: iload #32
		// @0CD1: ifne @1140
		// @0CD4: if_icmpgt @0D0A
		// @0CD7: goto @0CDB
		// @0CDA: athrow
		// @0CDB: getstatic game.C_100302_ka[] game.C_100063_dj.field_104290_f
		// @0CDE: arraylength
		// @0CDF: iconst_m1
		// @0CE0: ixor
		// @0CE1: aload #13
		// @0CE3: getfield int game.C_100327_ib.field_102494_P
		// @0CE6: iconst_m1
		// @0CE7: ixor
		// @0CE8: if_icmpge @0D0A
		// @0CEB: goto @0CEF
		// @0CEE: athrow
		// @0CEF: getstatic int game.C_100200_ba.field_105852_c
		// @0CF2: aload #13
		// @0CF4: getfield int game.C_100327_ib.field_102497_w
		// @0CF7: iand
		// @0CF8: ifeq @0D0A
		// @0CFB: goto @0CFF
		// @0CFE: athrow
		// @0CFF: getstatic game.C_100302_ka[] game.C_100063_dj.field_104290_f
		// @0D02: aload #13
		// @0D04: getfield int game.C_100327_ib.field_102494_P
		// @0D07: aaload
		// @0D08: astore #14
		// @0D0A: aconst_null
		// @0D0B: aload #14
		// @0D0D: if_acmpeq @112A
		// @0D10: aload #14
		// @0D12: getfield boolean game.C_100302_ka.field_101839_db
		// @0D15: ifne @0D20
		// @0D18: goto @0D1C
		// @0D1B: athrow
		// @0D1C: goto @112A
		// @0D1F: athrow
		// @0D20: aload #14
		// @0D22: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @0D25: bipush 6 (0x06)
		// @0D27: aaload
		// @0D28: bipush -88 (0xA8)
		// @0D2A: invokevirtual game.C_100302_ka.func_101822_a(java.lang.String, byte)game.C_100302_ka
		// @0D2D: astore #15
		// @0D2F: aload #15
		// @0D31: ifnull @0D48
		// @0D34: aload #15
		// @0D36: getfield boolean game.C_100302_ka.field_101839_db
		// @0D39: ifeq @0D48
		// @0D3C: goto @0D40
		// @0D3F: athrow
		// @0D40: iconst_1
		// @0D41: putstatic boolean game.C_100064_ve.field_103011_A
		// @0D44: goto @0D48
		// @0D47: athrow
		// @0D48: getstatic int game.C_100102_w.field_104636_c
		// @0D4B: iconst_1
		// @0D4C: if_icmpne @0D65
		// @0D4F: getstatic boolean game.C_100064_ve.field_103011_A
		// @0D52: ifeq @0D65
		// @0D55: goto @0D59
		// @0D58: athrow
		// @0D59: bipush 82 (0x52)
		// @0D5B: invokestatic game.C_100044_vm.func_100933_a(byte)boolean
		// @0D5E: ifne @0F05
		// @0D61: goto @0D65
		// @0D64: athrow
		// @0D65: getstatic int game.C_100102_w.field_104636_c
		// @0D68: iconst_m1
		// @0D69: ixor
		// @0D6A: bipush -2 (0xFE)
		// @0D6C: if_icmpne @1053
		// @0D6F: goto @0D73
		// @0D72: athrow
		// @0D73: iload_0
		// @0D74: sipush 29875 (0x74B3)
		// @0D77: iadd
		// @0D78: aload #13
		// @0D7A: invokestatic game.C_100207_qh.func_102872_a(int, game.C_100327_ib)boolean
		// @0D7D: ifeq @1053
		// @0D80: goto @0D84
		// @0D83: athrow
		// @0D84: iconst_1
		// @0D85: aload #13
		// @0D87: getfield int game.C_100327_ib.field_102497_w
		// @0D8A: if_icmpeq @0DB3
		// @0D8D: goto @0D91
		// @0D90: athrow
		// @0D91: bipush 82 (0x52)
		// @0D93: invokestatic game.C_100044_vm.func_100933_a(byte)boolean
		// @0D96: ifeq @1053
		// @0D99: goto @0D9D
		// @0D9C: athrow
		// @0D9D: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0DA0: aload #13
		// @0DA2: getfield int game.C_100327_ib.field_102497_w
		// @0DA5: iload_0
		// @0DA6: ldc -93460 (0xfffe92ec)
		// @0DA8: ixor
		// @0DA9: invokevirtual game.C_100327_ib.func_102461_d(int, int)boolean
		// @0DAC: ifeq @1053
		// @0DAF: goto @0DB3
		// @0DB2: athrow
		// @0DB3: iconst_1
		// @0DB4: aload #13
		// @0DB6: getfield int game.C_100327_ib.field_102497_w
		// @0DB9: if_icmpne @0E2E
		// @0DBC: goto @0DC0
		// @0DBF: athrow
		// @0DC0: bipush 55 (0x37)
		// @0DC2: aload #13
		// @0DC4: getfield int game.C_100327_ib.field_102494_P
		// @0DC7: if_icmpeq @0E2E
		// @0DCA: goto @0DCE
		// @0DCD: athrow
		// @0DCE: iconst_4
		// @0DCF: getstatic int game.C_100249_pc.field_102333_I
		// @0DD2: iand
		// @0DD3: ifne @0E2E
		// @0DD6: goto @0DDA
		// @0DD9: athrow
		// @0DDA: bipush 82 (0x52)
		// @0DDC: invokestatic game.C_100044_vm.func_100933_a(byte)boolean
		// @0DDF: ifne @0E2E
		// @0DE2: goto @0DE6
		// @0DE5: athrow
		// @0DE6: getstatic int[] game.C_100275_na.field_103087_l
		// @0DE9: iconst_0
		// @0DEA: iaload
		// @0DEB: bipush -58 (0xC6)
		// @0DED: aload #13
		// @0DEF: getfield int game.C_100327_ib.field_102494_P
		// @0DF2: iconst_m1
		// @0DF3: ixor
		// @0DF4: if_icmpne @0E01
		// @0DF7: goto @0DFB
		// @0DFA: athrow
		// @0DFB: bipush 6 (0x06)
		// @0DFD: goto @0E03
		// @0E00: athrow
		// @0E01: bipush 10 (0x0A)
		// @0E03: if_icmpge @0E2E
		// @0E06: getstatic int game.C_100249_pc.field_102333_I
		// @0E09: iconst_4
		// @0E0A: ior
		// @0E0B: putstatic int game.C_100249_pc.field_102333_I
		// @0E0E: getstatic java.lang.String game.C_100010_ff.field_103710_p
		// @0E11: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @0E14: bipush -25 (0xE7)
		// @0E16: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @0E19: ifne @1053
		// @0E1C: goto @0E20
		// @0E1F: athrow
		// @0E20: bipush 102 (0x66)
		// @0E22: invokestatic game.C_100017_wj.func_103813_b(byte)void
		// @0E25: iload #32
		// @0E27: ifeq @1053
		// @0E2A: goto @0E2E
		// @0E2D: athrow
		// @0E2E: aload #13
		// @0E30: getfield int game.C_100327_ib.field_102497_w
		// @0E33: iconst_m1
		// @0E34: ixor
		// @0E35: bipush -2 (0xFE)
		// @0E37: if_icmpeq @0E8D
		// @0E3A: goto @0E3E
		// @0E3D: athrow
		// @0E3E: bipush 100 (0x64)
		// @0E40: bipush 8 (0x08)
		// @0E42: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @0E45: aload #13
		// @0E47: getfield int game.C_100327_ib.field_102494_P
		// @0E4A: putstatic int game.C_100242_oh.field_106343_d
		// @0E4D: new game.C_100327_ib
		// @0E50: dup
		// @0E51: aload #13
		// @0E53: invokespecial game.C_100327_ib.<init>(game.C_100327_ib)void
		// @0E56: putstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0E59: aconst_null
		// @0E5A: putstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @0E5D: bipush -51 (0xCD)
		// @0E5F: aload #13
		// @0E61: getfield int game.C_100327_ib.field_102494_P
		// @0E64: invokestatic game.C_100073_f.func_101710_a(byte, int)int
		// @0E67: istore #16
		// @0E69: iconst_0
		// @0E6A: iload #16
		// @0E6C: if_icmpgt @0E84
		// @0E6F: new game.C_100327_ib
		// @0E72: dup
		// @0E73: iload #16
		// @0E75: bipush 110 (0x6E)
		// @0E77: invokestatic game.C_100209_qb.func_102686_b(int, byte)game.C_100327_ib
		// @0E7A: invokespecial game.C_100327_ib.<init>(game.C_100327_ib)void
		// @0E7D: putstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @0E80: goto @0E84
		// @0E83: athrow
		// @0E84: iconst_m1
		// @0E85: putstatic int game.C_100174_sb.field_105609_b
		// @0E88: iload #32
		// @0E8A: ifeq @1053
		// @0E8D: bipush 99 (0x63)
		// @0E8F: bipush 8 (0x08)
		// @0E91: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @0E94: bipush 8 (0x08)
		// @0E96: newarray int[]
		// @0E98: putstatic int[] game.C_100301_kb.field_107089_g
		// @0E9B: iconst_1
		// @0E9C: putstatic boolean game.C_100089_fa.field_103726_e
		// @0E9F: iconst_1
		// @0EA0: istore #12
		// @0EA2: iconst_0
		// @0EA3: istore #16
		// @0EA5: iload #16
		// @0EA7: iconst_m1
		// @0EA8: ixor
		// @0EA9: bipush -9 (0xF7)
		// @0EAB: if_icmple @0EC6
		// @0EAE: getstatic int[] game.C_100301_kb.field_107089_g
		// @0EB1: iload #16
		// @0EB3: iconst_m1
		// @0EB4: iastore
		// @0EB5: iinc #16 +1
		// @0EB8: iload #32
		// @0EBA: ifne @105B
		// @0EBD: iload #32
		// @0EBF: ifeq @0EA5
		// @0EC2: goto @0EC6
		// @0EC5: athrow
		// @0EC6: iload_0
		// @0EC7: sipush 28025 (0x6D79)
		// @0ECA: ixor
		// @0ECB: aload #13
		// @0ECD: getfield int game.C_100327_ib.field_102494_P
		// @0ED0: invokestatic game.C_100042_we.func_104129_b(int, int)int[]
		// @0ED3: astore #16
		// @0ED5: aconst_null
		// @0ED6: aload #16
		// @0ED8: if_acmpeq @0EE9
		// @0EDB: aload #16
		// @0EDD: putstatic int[] game.C_100280_nf.field_101178_o
		// @0EE0: iload #32
		// @0EE2: ifeq @0EF8
		// @0EE5: goto @0EE9
		// @0EE8: athrow
		// @0EE9: iconst_0
		// @0EEA: istore #12
		// @0EEC: new game.C_100327_ib
		// @0EEF: dup
		// @0EF0: aload #13
		// @0EF2: invokespecial game.C_100327_ib.<init>(game.C_100327_ib)void
		// @0EF5: putstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0EF8: aconst_null
		// @0EF9: putstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0EFC: iconst_m1
		// @0EFD: putstatic int game.C_100174_sb.field_105609_b
		// @0F00: iload #32
		// @0F02: ifeq @1053
		// @0F05: iconst_0
		// @0F06: istore #16
		// @0F08: aload #13
		// @0F0A: getfield int game.C_100327_ib.field_102497_w
		// @0F0D: iconst_m1
		// @0F0E: ixor
		// @0F0F: bipush -2 (0xFE)
		// @0F11: if_icmpne @0FB9
		// @0F14: aload #13
		// @0F16: getfield int game.C_100327_ib.field_102494_P
		// @0F19: bipush -123 (0x85)
		// @0F1B: invokestatic game.C_100192_rf.func_101670_b(int, byte)int[]
		// @0F1E: astore #17
		// @0F20: iconst_1
		// @0F21: aload #13
		// @0F23: getfield int game.C_100327_ib.field_102494_P
		// @0F26: invokestatic game.C_100233_oa.func_106233_a(boolean, int)int[]
		// @0F29: astore #18
		// @0F2B: aload #17
		// @0F2D: astore #19
		// @0F2F: iconst_0
		// @0F30: istore #20
		// @0F32: iload #20
		// @0F34: iconst_m1
		// @0F35: ixor
		// @0F36: aload #19
		// @0F38: arraylength
		// @0F39: iconst_m1
		// @0F3A: ixor
		// @0F3B: if_icmple @0F71
		// @0F3E: aload #19
		// @0F40: iload #20
		// @0F42: iaload
		// @0F43: istore #21
		// @0F45: iload #21
		// @0F47: getstatic int[] game.C_100075_uj.field_100655_u
		// @0F4A: iload_0
		// @0F4B: sipush 28017 (0x6D71)
		// @0F4E: ixor
		// @0F4F: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @0F52: iload #32
		// @0F54: ifne @0F76
		// @0F57: ifne @0F69
		// @0F5A: goto @0F5E
		// @0F5D: athrow
		// @0F5E: iload #16
		// @0F60: getstatic int[] game.C_100328_ia.field_107259_b
		// @0F63: iload #21
		// @0F65: iaload
		// @0F66: iadd
		// @0F67: istore #16
		// @0F69: iinc #20 +1
		// @0F6C: iload #32
		// @0F6E: ifeq @0F32
		// @0F71: aload #18
		// @0F73: astore #19
		// @0F75: iconst_0
		// @0F76: istore #20
		// @0F78: iload #20
		// @0F7A: iconst_m1
		// @0F7B: ixor
		// @0F7C: aload #19
		// @0F7E: arraylength
		// @0F7F: iconst_m1
		// @0F80: ixor
		// @0F81: if_icmple @0FB4
		// @0F84: aload #19
		// @0F86: iload #20
		// @0F88: iaload
		// @0F89: istore #21
		// @0F8B: iload #21
		// @0F8D: getstatic int[] game.C_100257_ln.field_106481_d
		// @0F90: bipush -120 (0x88)
		// @0F92: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @0F95: iload #32
		// @0F97: ifne @1058
		// @0F9A: ifne @0FAC
		// @0F9D: goto @0FA1
		// @0FA0: athrow
		// @0FA1: iload #16
		// @0FA3: getstatic int[] game.C_100242_oh.field_106342_g
		// @0FA6: iload #21
		// @0FA8: iaload
		// @0FA9: iadd
		// @0FAA: istore #16
		// @0FAC: iinc #20 +1
		// @0FAF: iload #32
		// @0FB1: ifeq @0F78
		// @0FB4: iload #32
		// @0FB6: ifeq @0FC4
		// @0FB9: getstatic int[] game.C_100242_oh.field_106342_g
		// @0FBC: aload #13
		// @0FBE: getfield int game.C_100327_ib.field_102494_P
		// @0FC1: iaload
		// @0FC2: istore #16
		// @0FC4: aconst_null
		// @0FC5: astore #17
		// @0FC7: aload #13
		// @0FC9: getfield int game.C_100327_ib.field_102494_P
		// @0FCC: getstatic int[] game.C_100257_ln.field_106481_d
		// @0FCF: bipush -125 (0x83)
		// @0FD1: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @0FD4: ifne @0FF3
		// @0FD7: getstatic int game.C_100096_un.field_104563_d
		// @0FDA: iload #16
		// @0FDC: if_icmpge @1000
		// @0FDF: goto @0FE3
		// @0FE2: athrow
		// @0FE3: getstatic java.lang.String game.C_100016_wi.field_103805_c
		// @0FE6: astore #17
		// @0FE8: getstatic game.C_100037_wb[] game.C_100058_dg.field_101562_E
		// @0FEB: iconst_2
		// @0FEC: aaload
		// @0FED: putstatic game.C_100037_wb game.C_100144_bm.field_102094_ac
		// @0FF0: goto @1000
		// @0FF3: getstatic java.lang.String game.C_100336_im.field_102548_p
		// @0FF6: astore #17
		// @0FF8: getstatic game.C_100037_wb[] game.C_100058_dg.field_101562_E
		// @0FFB: iconst_0
		// @0FFC: aaload
		// @0FFD: putstatic game.C_100037_wb game.C_100144_bm.field_102094_ac
		// @1000: aconst_null
		// @1001: aload #17
		// @1003: if_acmpne @102F
		// @1006: bipush -25 (0xE7)
		// @1008: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @100B: ifne @102F
		// @100E: goto @1012
		// @1011: athrow
		// @1012: sipush 128 (0x0080)
		// @1015: aload #13
		// @1017: getfield int game.C_100327_ib.field_102494_P
		// @101A: ineg
		// @101B: isub
		// @101C: putstatic int game.C_100075_uj.field_100647_n
		// @101F: iload #16
		// @1021: putstatic int game.C_100008_fl.field_103639_a
		// @1024: bipush 95 (0x5F)
		// @1026: bipush 8 (0x08)
		// @1028: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @102B: goto @102F
		// @102E: athrow
		// @102F: aload #17
		// @1031: ifnonnull @1038
		// @1034: goto @1053
		// @1037: athrow
		// @1038: sipush -30945 (0x871F)
		// @103B: iconst_1
		// @103C: anewarray java.lang.String
		// @103F: dup
		// @1040: iconst_0
		// @1041: getstatic java.lang.String[] game.C_100176_ci.field_105623_e
		// @1044: aload #13
		// @1046: getfield int game.C_100327_ib.field_102494_P
		// @1049: aaload
		// @104A: aastore
		// @104B: aload #17
		// @104D: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @1050: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @1053: aload #13
		// @1055: getfield int game.C_100327_ib.field_102494_P
		// @1058: putstatic int game.C_100242_oh.field_106343_d
		// @105B: aconst_null
		// @105C: getstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @105F: if_acmpeq @1066
		// @1062: goto @112A
		// @1065: athrow
		// @1066: new game.C_100019_wl
		// @1069: dup
		// @106A: aload #14
		// @106C: getfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @106F: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @1072: astore #16
		// @1074: aload #16
		// @1076: bipush -128 (0x80)
		// @1078: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @107B: checkcast game.C_100302_ka
		// @107E: astore #17
		// @1080: aload #17
		// @1082: ifnull @112A
		// @1085: aload #17
		// @1087: getfield boolean game.C_100302_ka.field_101839_db
		// @108A: iload #32
		// @108C: ifne @113F
		// @108F: ifeq @1118
		// @1092: goto @1096
		// @1095: athrow
		// @1096: aconst_null
		// @1097: aload #17
		// @1099: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @109C: if_acmpeq @1118
		// @109F: goto @10A3
		// @10A2: athrow
		// @10A3: aload #17
		// @10A5: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @10A8: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @10AB: bipush 8 (0x08)
		// @10AD: aaload
		// @10AE: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @10B1: ifne @110A
		// @10B4: goto @10B8
		// @10B7: athrow
		// @10B8: aload #17
		// @10BA: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @10BD: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @10C0: bipush 9 (0x09)
		// @10C2: aaload
		// @10C3: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @10C6: ifne @110A
		// @10C9: goto @10CD
		// @10CC: athrow
		// @10CD: aload #17
		// @10CF: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @10D2: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @10D5: bipush 17 (0x11)
		// @10D7: aaload
		// @10D8: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @10DB: ifne @110A
		// @10DE: goto @10E2
		// @10E1: athrow
		// @10E2: aload #17
		// @10E4: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @10E7: invokevirtual java.lang.String.length()int
		// @10EA: iconst_m1
		// @10EB: ixor
		// @10EC: bipush -8 (0xF8)
		// @10EE: if_icmpne @1118
		// @10F1: goto @10F5
		// @10F4: athrow
		// @10F5: aload #17
		// @10F7: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @10FA: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @10FD: bipush 14 (0x0E)
		// @10FF: aaload
		// @1100: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @1103: ifeq @1118
		// @1106: goto @110A
		// @1109: athrow
		// @110A: aload #17
		// @110C: putstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @110F: iload #32
		// @1111: ifeq @112A
		// @1114: goto @1118
		// @1117: athrow
		// @1118: aload #16
		// @111A: sipush -30820 (0x879C)
		// @111D: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @1120: checkcast game.C_100302_ka
		// @1123: astore #17
		// @1125: iload #32
		// @1127: ifeq @1080
		// @112A: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @112D: bipush 42 (0x2A)
		// @112F: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @1132: checkcast game.C_100327_ib
		// @1135: astore #13
		// @1137: iload #32
		// @1139: ifeq @0CC0
		// @113C: getstatic int game.C_100200_ba.field_105852_c
		// @113F: iconst_1
		// @1140: if_icmpeq @1146
		// @1143: goto @12DF
		// @1146: iconst_0
		// @1147: istore #13
		// @1149: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @114C: arraylength
		// @114D: iload #13
		// @114F: if_icmple @12DF
		// @1152: bipush 101 (0x65)
		// @1154: iload #13
		// @1156: iadd
		// @1157: istore #14
		// @1159: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @115C: iload #13
		// @115E: aaload
		// @115F: iload #32
		// @1161: ifne @12EB
		// @1164: ifnonnull @1170
		// @1167: goto @116B
		// @116A: athrow
		// @116B: aconst_null
		// @116C: goto @1176
		// @116F: athrow
		// @1170: getstatic game.C_100302_ka[] game.C_100063_dj.field_104290_f
		// @1173: iload #14
		// @1175: aaload
		// @1176: astore #15
		// @1178: aconst_null
		// @1179: aload #15
		// @117B: if_acmpeq @12D7
		// @117E: aload #15
		// @1180: getfield boolean game.C_100302_ka.field_101839_db
		// @1183: ifeq @12D7
		// @1186: goto @118A
		// @1189: athrow
		// @118A: bipush -2 (0xFE)
		// @118C: getstatic int game.C_100102_w.field_104636_c
		// @118F: iconst_m1
		// @1190: ixor
		// @1191: if_icmpeq @119C
		// @1194: goto @1198
		// @1197: athrow
		// @1198: goto @12D7
		// @119B: athrow
		// @119C: aload #15
		// @119E: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @11A1: bipush 7 (0x07)
		// @11A3: aaload
		// @11A4: bipush -81 (0xAF)
		// @11A6: invokevirtual game.C_100302_ka.func_101822_a(java.lang.String, byte)game.C_100302_ka
		// @11A9: astore #16
		// @11AB: aload #16
		// @11AD: ifnull @121C
		// @11B0: aload #16
		// @11B2: getfield boolean game.C_100302_ka.field_101839_db
		// @11B5: ifeq @121C
		// @11B8: goto @11BC
		// @11BB: athrow
		// @11BC: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @11BF: iload #13
		// @11C1: aconst_null
		// @11C2: aastore
		// @11C3: iload #13
		// @11C5: istore #17
		// @11C7: iload #17
		// @11C9: iconst_m1
		// @11CA: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @11CD: arraylength
		// @11CE: iadd
		// @11CF: if_icmpge @11FF
		// @11D2: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @11D5: iload #17
		// @11D7: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @11DA: iconst_1
		// @11DB: iload #17
		// @11DD: iadd
		// @11DE: aaload
		// @11DF: aastore
		// @11E0: getstatic game.C_100037_wb[] game.C_100122_em.field_102075_ec
		// @11E3: iload #17
		// @11E5: getstatic game.C_100037_wb[] game.C_100122_em.field_102075_ec
		// @11E8: iload #17
		// @11EA: iconst_m1
		// @11EB: isub
		// @11EC: aaload
		// @11ED: aastore
		// @11EE: iinc #17 +1
		// @11F1: iload #32
		// @11F3: ifne @1217
		// @11F6: iload #32
		// @11F8: ifeq @11C7
		// @11FB: goto @11FF
		// @11FE: athrow
		// @11FF: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @1202: iconst_m1
		// @1203: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @1206: arraylength
		// @1207: iadd
		// @1208: aconst_null
		// @1209: aastore
		// @120A: iconst_1
		// @120B: istore_1
		// @120C: getstatic game.C_100037_wb[] game.C_100122_em.field_102075_ec
		// @120F: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @1212: arraylength
		// @1213: iconst_1
		// @1214: isub
		// @1215: aconst_null
		// @1216: aastore
		// @1217: iload #32
		// @1219: ifeq @12D7
		// @121C: iconst_0
		// @121D: istore #17
		// @121F: bipush -37 (0xDB)
		// @1221: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @1224: ifeq @122B
		// @1227: goto @127E
		// @122A: athrow
		// @122B: iconst_0
		// @122C: istore #18
		// @122E: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @1231: iload #13
		// @1233: aaload
		// @1234: arraylength
		// @1235: iload #18
		// @1237: if_icmple @127E
		// @123A: iload #18
		// @123C: iconst_m1
		// @123D: ixor
		// @123E: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @1241: iload #13
		// @1243: aaload
		// @1244: arraylength
		// @1245: bipush -8 (0xF8)
		// @1247: iadd
		// @1248: iconst_m1
		// @1249: ixor
		// @124A: iload #32
		// @124C: ifne @114F
		// @124F: if_icmpgt @1257
		// @1252: iconst_1
		// @1253: goto @1258
		// @1256: athrow
		// @1257: iconst_0
		// @1258: sipush -11145 (0xD477)
		// @125B: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @125E: iload #13
		// @1260: aaload
		// @1261: iload #18
		// @1263: iaload
		// @1264: invokestatic game.C_100080_b.func_104421_a(boolean, int, int)boolean
		// @1267: ifeq @1272
		// @126A: iconst_1
		// @126B: istore #17
		// @126D: iload #32
		// @126F: ifeq @127E
		// @1272: iinc #18 +1
		// @1275: iload #32
		// @1277: ifeq @122E
		// @127A: goto @127E
		// @127D: athrow
		// @127E: iload #17
		// @1280: ifne @12D7
		// @1283: bipush 99 (0x63)
		// @1285: iload_0
		// @1286: sipush 27932 (0x6D1C)
		// @1289: iadd
		// @128A: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @128D: bipush 8 (0x08)
		// @128F: newarray int[]
		// @1291: putstatic int[] game.C_100301_kb.field_107089_g
		// @1294: iconst_0
		// @1295: istore #18
		// @1297: iload #18
		// @1299: bipush 8 (0x08)
		// @129B: if_icmpge @12B6
		// @129E: getstatic int[] game.C_100301_kb.field_107089_g
		// @12A1: iload #18
		// @12A3: iconst_m1
		// @12A4: iastore
		// @12A5: iinc #18 +1
		// @12A8: iload #32
		// @12AA: ifne @12B9
		// @12AD: iload #32
		// @12AF: ifeq @1297
		// @12B2: goto @12B6
		// @12B5: athrow
		// @12B6: iconst_1
		// @12B7: istore #12
		// @12B9: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @12BC: iload #13
		// @12BE: aaload
		// @12BF: astore #18
		// @12C1: aload #18
		// @12C3: ifnonnull @12CA
		// @12C6: goto @12CF
		// @12C9: athrow
		// @12CA: aload #18
		// @12CC: putstatic int[] game.C_100280_nf.field_101178_o
		// @12CF: iconst_m1
		// @12D0: putstatic int game.C_100174_sb.field_105609_b
		// @12D3: aconst_null
		// @12D4: putstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @12D7: iinc #13 +1
		// @12DA: iload #32
		// @12DC: ifeq @1149
		// @12DF: iload #12
		// @12E1: ifne @12E8
		// @12E4: goto @1300
		// @12E7: athrow
		// @12E8: getstatic int[] game.C_100280_nf.field_101178_o
		// @12EB: bipush 73 (0x49)
		// @12ED: getstatic int[] game.C_100301_kb.field_107089_g
		// @12F0: invokestatic game.C_100157_db.func_103546_a(int[], byte, int[])game.C_100327_ib
		// @12F3: putstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @12F6: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @12F9: bipush 46 (0x2E)
		// @12FB: ldc 6993661 (0x6ab6fd)
		// @12FD: invokevirtual game.C_100327_ib.func_102465_a(byte, int)void
		// @1300: getstatic int game.C_100102_w.field_104636_c
		// @1303: iconst_2
		// @1304: if_icmpne @1323
		// @1307: bipush 82 (0x52)
		// @1309: invokestatic game.C_100044_vm.func_100933_a(byte)boolean
		// @130C: ifne @1317
		// @130F: goto @1313
		// @1312: athrow
		// @1313: goto @1323
		// @1316: athrow
		// @1317: iconst_m1
		// @1318: putstatic int game.C_100174_sb.field_105609_b
		// @131B: aconst_null
		// @131C: putstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @131F: aconst_null
		// @1320: putstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @1323: iload_0
		// @1324: sipush -27924 (0x92EC)
		// @1327: if_icmpeq @133D
		// @132A: aconst_null
		// @132B: checkcast int[]
		// @132E: bipush -20 (0xEC)
		// @1330: bipush -5 (0xFB)
		// @1332: bipush 38 (0x26)
		// @1334: bipush 116 (0x74)
		// @1336: invokestatic game.C_100271_mj.func_103423_a(int[], byte, int, int, int)void
		// @1339: goto @133D
		// @133C: athrow
		// @133D: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @1340: ifnull @134D
		// @1343: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @1346: getfield int game.C_100327_ib.field_102494_P
		// @1349: goto @134E
		// @134C: athrow
		// @134D: iconst_m1
		// @134E: istore #5
		// @1350: iconst_0
		// @1351: iload #5
		// @1353: if_icmple @1365
		// @1356: getstatic int game.C_100174_sb.field_105609_b
		// @1359: iflt @1365
		// @135C: goto @1360
		// @135F: athrow
		// @1360: getstatic int game.C_100174_sb.field_105609_b
		// @1363: istore #5
		// @1365: getstatic int game.C_100032_gk.field_103132_V
		// @1368: iload #5
		// @136A: if_icmpne @1371
		// @136D: goto @1382
		// @1370: athrow
		// @1371: iload #5
		// @1373: putstatic int game.C_100032_gk.field_103132_V
		// @1376: iconst_1
		// @1377: putstatic boolean game.C_100247_pa.field_106415_b
		// @137A: iconst_1
		// @137B: putstatic boolean game.C_100034_gi.field_104029_d
		// @137E: iconst_1
		// @137F: putstatic boolean game.C_100309_lk.field_103271_ab
		// @1382: iload_1
		// @1383: ifeq @139A
		// @1386: aconst_null
		// @1387: getstatic game.C_100302_ka game.C_100189_ri.field_105752_d
		// @138A: if_acmpeq @139A
		// @138D: goto @1391
		// @1390: athrow
		// @1391: bipush -53 (0xCB)
		// @1393: invokestatic game.C_100203_ql.func_105921_a(int)void
		// @1396: goto @139A
		// @1399: athrow
		// @139A: aconst_null
		// @139B: getstatic game.C_100302_ka game.C_100189_ri.field_105752_d
		// @139E: if_acmpne @1D59
		// @13A1: iconst_0
		// @13A2: istore #6
		// @13A4: getstatic game.C_100302_ka[] game.C_100123_uc.field_104925_a
		// @13A7: arraylength
		// @13A8: iload #6
		// @13AA: if_icmple @13C5
		// @13AD: getstatic game.C_100302_ka[] game.C_100123_uc.field_104925_a
		// @13B0: iload #6
		// @13B2: aconst_null
		// @13B3: aastore
		// @13B4: iinc #6 +1
		// @13B7: iload #32
		// @13B9: ifne @13DD
		// @13BC: iload #32
		// @13BE: ifeq @13A4
		// @13C1: goto @13C5
		// @13C4: athrow
		// @13C5: getstatic game.C_100037_wb game.C_100254_pi.field_106457_j
		// @13C8: getfield int game.C_100037_wb.field_102341_y
		// @13CB: istore #6
		// @13CD: getstatic game.C_100037_wb game.C_100254_pi.field_106457_j
		// @13D0: invokevirtual game.C_100037_wb.func_102379_d()void
		// @13D3: iconst_0
		// @13D4: iconst_0
		// @13D5: iload #6
		// @13D7: iload #6
		// @13D9: iconst_0
		// @13DA: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @13DD: getstatic int[] game.C_100280_nf.field_101178_o
		// @13E0: iconst_0
		// @13E1: iaload
		// @13E2: iconst_m1
		// @13E3: invokestatic game.C_100152_bd.func_105179_a(int, int)int
		// @13E6: istore #7
		// @13E8: iconst_0
		// @13E9: iload #7
		// @13EB: if_icmpgt @1403
		// @13EE: getstatic game.C_100037_wb[] game.C_100124_tn.field_104936_c
		// @13F1: arraylength
		// @13F2: iconst_m1
		// @13F3: ixor
		// @13F4: iload #7
		// @13F6: iconst_m1
		// @13F7: ixor
		// @13F8: if_icmpge @1403
		// @13FB: goto @13FF
		// @13FE: athrow
		// @13FF: goto @1406
		// @1402: athrow
		// @1403: iconst_0
		// @1404: istore #7
		// @1406: getstatic game.C_100037_wb[] game.C_100124_tn.field_104936_c
		// @1409: iload #7
		// @140B: aaload
		// @140C: iconst_0
		// @140D: iconst_0
		// @140E: iload #6
		// @1410: iconst_4
		// @1411: imul
		// @1412: iconst_4
		// @1413: iload #6
		// @1415: imul
		// @1416: invokevirtual game.C_100037_wb.func_102364_d(int, int, int, int)void
		// @1419: getstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @141C: bipush 126 (0x7E)
		// @141E: invokevirtual game.C_100185_rm.func_105476_a(byte)void
		// @1421: getstatic int game.C_100270_mi.field_102270_jc
		// @1424: istore #6
		// @1426: sipush 4096 (0x1000)
		// @1429: putstatic int game.C_100270_mi.field_102270_jc
		// @142C: new game.C_100302_ka
		// @142F: dup
		// @1430: invokespecial game.C_100302_ka.<init>()void
		// @1433: astore #7
		// @1435: aload #7
		// @1437: getstatic game.C_100037_wb[] game.C_100106_ef.field_104752_d
		// @143A: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @143D: aload #7
		// @143F: iconst_1
		// @1440: putfield int game.C_100302_ka.field_101858_J
		// @1443: aload #7
		// @1445: iconst_1
		// @1446: putfield int game.C_100302_ka.field_101850_Fb
		// @1449: aload #7
		// @144B: ldc 16777215 (0xffffff)
		// @144D: putfield int game.C_100302_ka.field_101830_gb
		// @1450: aload #7
		// @1452: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @1455: putfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @1458: new game.C_100302_ka
		// @145B: dup
		// @145C: ldc ""
		// @145E: aload #7
		// @1460: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @1463: astore #8
		// @1465: aload #8
		// @1467: getstatic game.C_100037_wb[] game.C_100095_fe.field_103383_Q
		// @146A: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @146D: new game.C_100302_ka
		// @1470: dup
		// @1471: ldc ""
		// @1473: aload #7
		// @1475: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @1478: putstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @147B: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @147E: bipush 17 (0x11)
		// @1480: putfield int game.C_100302_ka.field_101833_ob
		// @1483: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @1486: iconst_0
		// @1487: putfield int game.C_100302_ka.field_101850_Fb
		// @148A: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @148D: aconst_null
		// @148E: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @1491: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @1494: ldc 16777215 (0xffffff)
		// @1496: putfield int game.C_100302_ka.field_101830_gb
		// @1499: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @149C: iconst_4
		// @149D: putfield int game.C_100302_ka.field_101829_Db
		// @14A0: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @14A3: iconst_0
		// @14A4: putfield int game.C_100302_ka.field_101858_J
		// @14A7: new game.C_100302_ka
		// @14AA: dup
		// @14AB: ldc ""
		// @14AD: aload #7
		// @14AF: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @14B2: astore #9
		// @14B4: aload #9
		// @14B6: getstatic game.C_100037_wb[] game.C_100050_vg.field_100638_p
		// @14B9: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @14BC: new game.C_100302_ka
		// @14BF: dup
		// @14C0: ldc ""
		// @14C2: aload #7
		// @14C4: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @14C7: putstatic game.C_100302_ka game.C_100134_tj.field_105006_f
		// @14CA: getstatic game.C_100302_ka game.C_100134_tj.field_105006_f
		// @14CD: getstatic game.C_100037_wb[] game.C_100154_sl.field_105329_f
		// @14D0: putfield game.C_100037_wb[] game.C_100302_ka.field_101883_qb
		// @14D3: getstatic game.C_100302_ka game.C_100134_tj.field_105006_f
		// @14D6: getstatic game.C_100037_wb[] game.C_100217_ao.field_106038_c
		// @14D9: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @14DC: new game.C_100302_ka
		// @14DF: dup
		// @14E0: ldc ""
		// @14E2: aload #7
		// @14E4: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @14E7: astore #10
		// @14E9: aload #10
		// @14EB: getstatic game.C_100037_wb[] game.C_100059_df.field_101604_I
		// @14EE: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @14F1: aload #10
		// @14F3: ldc 16777215 (0xffffff)
		// @14F5: putfield int game.C_100302_ka.field_101830_gb
		// @14F8: aload #10
		// @14FA: sipush 192 (0x00C0)
		// @14FD: putfield int game.C_100302_ka.field_101871_mb
		// @1500: aload #10
		// @1502: getstatic game.C_100037_wb[] game.C_100263_mb.field_106505_f
		// @1505: putfield game.C_100037_wb[] game.C_100302_ka.field_101883_qb
		// @1508: new game.C_100302_ka
		// @150B: dup
		// @150C: ldc ""
		// @150E: aload #7
		// @1510: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @1513: astore #11
		// @1515: aload #11
		// @1517: getstatic game.C_100037_wb[] game.C_100263_mb.field_106505_f
		// @151A: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @151D: aload #11
		// @151F: ldc 16777215 (0xffffff)
		// @1521: putfield int game.C_100302_ka.field_101830_gb
		// @1524: aload #11
		// @1526: sipush 192 (0x00C0)
		// @1529: putfield int game.C_100302_ka.field_101871_mb
		// @152C: new game.C_100302_ka
		// @152F: dup
		// @1530: ldc ""
		// @1532: aload #7
		// @1534: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @1537: astore #12
		// @1539: aload #12
		// @153B: getstatic game.C_100037_wb[] game.C_100059_df.field_101604_I
		// @153E: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @1541: aload #12
		// @1543: getstatic game.C_100037_wb[] game.C_100263_mb.field_106505_f
		// @1546: putfield game.C_100037_wb[] game.C_100302_ka.field_101883_qb
		// @1549: new game.C_100302_ka
		// @154C: dup
		// @154D: ldc ""
		// @154F: aload #7
		// @1551: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @1554: astore #13
		// @1556: aload #13
		// @1558: getstatic game.C_100037_wb[] game.C_100339_jb.field_107382_e
		// @155B: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @155E: new game.C_100302_ka
		// @1561: dup
		// @1562: ldc ""
		// @1564: aload #7
		// @1566: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @1569: astore #14
		// @156B: aload #14
		// @156D: getstatic game.C_100037_wb[] game.C_100020_wm.field_103856_b
		// @1570: putfield game.C_100037_wb[] game.C_100302_ka.field_101883_qb
		// @1573: aload #14
		// @1575: getstatic game.C_100037_wb[] game.C_100318_hj.field_107204_h
		// @1578: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @157B: new game.C_100302_ka
		// @157E: dup
		// @157F: ldc ""
		// @1581: aload #7
		// @1583: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @1586: putstatic game.C_100302_ka game.C_100132_td.field_104976_a
		// @1589: getstatic game.C_100302_ka game.C_100132_td.field_104976_a
		// @158C: getstatic game.C_100037_wb[] game.C_100287_nm.field_106829_l
		// @158F: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @1592: new game.C_100302_ka
		// @1595: dup
		// @1596: ldc ""
		// @1598: aload #7
		// @159A: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @159D: putstatic game.C_100302_ka game.C_100042_we.field_104131_r
		// @15A0: getstatic game.C_100302_ka game.C_100042_we.field_104131_r
		// @15A3: getstatic game.C_100037_wb[] game.C_100316_lc.field_102411_v
		// @15A6: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @15A9: new game.C_100302_ka
		// @15AC: dup
		// @15AD: ldc ""
		// @15AF: aload #7
		// @15B1: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @15B4: putstatic game.C_100302_ka game.C_100215_ai.field_106017_c
		// @15B7: getstatic game.C_100302_ka game.C_100215_ai.field_106017_c
		// @15BA: iconst_0
		// @15BB: putfield int game.C_100302_ka.field_101850_Fb
		// @15BE: getstatic game.C_100302_ka game.C_100215_ai.field_106017_c
		// @15C1: getstatic game.C_100037_wb[] game.C_100321_hi.field_107228_h
		// @15C4: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @15C7: new game.C_100302_ka
		// @15CA: dup
		// @15CB: ldc ""
		// @15CD: aload #7
		// @15CF: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @15D2: astore #15
		// @15D4: aload #15
		// @15D6: getstatic game.C_100037_wb[] game.C_100235_om.field_106293_n
		// @15D9: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @15DC: new game.C_100302_ka
		// @15DF: dup
		// @15E0: ldc ""
		// @15E2: aload #7
		// @15E4: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @15E7: astore #16
		// @15E9: aload #16
		// @15EB: getstatic game.C_100037_wb[] game.C_100167_sj.field_100796_r
		// @15EE: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @15F1: aload #16
		// @15F3: bipush 15 (0x0F)
		// @15F5: putfield int game.C_100302_ka.field_101833_ob
		// @15F8: aload #16
		// @15FA: iconst_0
		// @15FB: putfield int game.C_100302_ka.field_101858_J
		// @15FE: aload #16
		// @1600: iconst_0
		// @1601: putfield int game.C_100302_ka.field_101830_gb
		// @1604: aload #16
		// @1606: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @1609: putfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @160C: aload #16
		// @160E: iconst_1
		// @160F: putfield int game.C_100302_ka.field_101850_Fb
		// @1612: aload #16
		// @1614: iconst_4
		// @1615: putfield int game.C_100302_ka.field_101829_Db
		// @1618: new game.C_100302_ka
		// @161B: dup
		// @161C: invokespecial game.C_100302_ka.<init>()void
		// @161F: putstatic game.C_100302_ka game.C_100189_ri.field_105752_d
		// @1622: getstatic game.C_100302_ka game.C_100189_ri.field_105752_d
		// @1625: iconst_0
		// @1626: sipush 480 (0x01E0)
		// @1629: iload_0
		// @162A: sipush 27923 (0x6D13)
		// @162D: iadd
		// @162E: iconst_0
		// @162F: sipush 640 (0x0280)
		// @1632: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1635: getstatic java.lang.String[] game.C_100212_qc.field_105979_l
		// @1638: arraylength
		// @1639: istore #17
		// @163B: sipush 204 (0x00CC)
		// @163E: iload #17
		// @1640: idiv
		// @1641: istore #18
		// @1643: bipush 10 (0x0A)
		// @1645: istore #19
		// @1647: iconst_0
		// @1648: istore #20
		// @164A: iload #17
		// @164C: iload #20
		// @164E: if_icmple @1731
		// @1651: iconst_0
		// @1652: istore #21
		// @1654: iload #20
		// @1656: iconst_m1
		// @1657: ixor
		// @1658: iload #32
		// @165A: ifne @1769
		// @165D: iconst_m1
		// @165E: if_icmpne @167A
		// @1661: goto @1665
		// @1664: athrow
		// @1665: bipush -2 (0xFE)
		// @1667: getstatic int game.C_100200_ba.field_105852_c
		// @166A: iconst_m1
		// @166B: ixor
		// @166C: if_icmpeq @1677
		// @166F: goto @1673
		// @1672: athrow
		// @1673: goto @167A
		// @1676: athrow
		// @1677: iconst_1
		// @1678: istore #21
		// @167A: iload #20
		// @167C: iconst_1
		// @167D: if_icmpne @1692
		// @1680: getstatic int game.C_100200_ba.field_105852_c
		// @1683: iconst_2
		// @1684: iand
		// @1685: iconst_m1
		// @1686: ixor
		// @1687: iconst_m1
		// @1688: if_icmpge @1692
		// @168B: goto @168F
		// @168E: athrow
		// @168F: iconst_1
		// @1690: istore #21
		// @1692: iload #20
		// @1694: iconst_2
		// @1695: if_icmpne @16AB
		// @1698: getstatic int game.C_100200_ba.field_105852_c
		// @169B: bipush 16 (0x10)
		// @169D: iand
		// @169E: iconst_m1
		// @169F: ixor
		// @16A0: iconst_m1
		// @16A1: if_icmpge @16AB
		// @16A4: goto @16A8
		// @16A7: athrow
		// @16A8: iconst_1
		// @16A9: istore #21
		// @16AB: bipush -4 (0xFC)
		// @16AD: iload #20
		// @16AF: iconst_m1
		// @16B0: ixor
		// @16B1: if_icmpne @16C2
		// @16B4: iconst_0
		// @16B5: getstatic int game.C_100200_ba.field_105852_c
		// @16B8: if_icmpne @16C2
		// @16BB: goto @16BF
		// @16BE: athrow
		// @16BF: iconst_1
		// @16C0: istore #21
		// @16C2: new game.C_100302_ka
		// @16C5: dup
		// @16C6: getstatic java.lang.String[] game.C_100212_qc.field_105979_l
		// @16C9: iload #20
		// @16CB: aaload
		// @16CC: iload #21
		// @16CE: ifne @16D7
		// @16D1: aload #14
		// @16D3: goto @16D9
		// @16D6: athrow
		// @16D7: aload #13
		// @16D9: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @16DC: astore #22
		// @16DE: getstatic game.C_100302_ka[] game.C_100103_eh.field_104669_j
		// @16E1: iload #20
		// @16E3: aload #22
		// @16E5: aastore
		// @16E6: aload #22
		// @16E8: getstatic game.C_100037_wb[] game.C_100287_nm.field_106830_j
		// @16EB: iload #20
		// @16ED: iload #21
		// @16EF: ifeq @16F7
		// @16F2: iconst_0
		// @16F3: goto @16F8
		// @16F6: athrow
		// @16F7: iconst_4
		// @16F8: ineg
		// @16F9: isub
		// @16FA: aaload
		// @16FB: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @16FE: aload #22
		// @1700: iload #19
		// @1702: bipush 25 (0x19)
		// @1704: iload_0
		// @1705: sipush 27923 (0x6D13)
		// @1708: iadd
		// @1709: bipush 59 (0x3B)
		// @170B: iload #18
		// @170D: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1710: getstatic game.C_100302_ka game.C_100189_ri.field_105752_d
		// @1713: bipush -71 (0xB9)
		// @1715: aload #22
		// @1717: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @171A: getstatic game.C_100302_ka[] game.C_100136_th.field_102618_W
		// @171D: iload #20
		// @171F: aload #22
		// @1721: aastore
		// @1722: iload #19
		// @1724: iload #18
		// @1726: iadd
		// @1727: istore #19
		// @1729: iinc #20 +1
		// @172C: iload #32
		// @172E: ifeq @164A
		// @1731: new game.C_100302_ka
		// @1734: dup
		// @1735: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @1738: bipush 11 (0x0B)
		// @173A: aaload
		// @173B: aload #15
		// @173D: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @1740: putstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @1743: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @1746: bipush 10 (0x0A)
		// @1748: sipush 349 (0x015D)
		// @174B: iconst_m1
		// @174C: bipush 84 (0x54)
		// @174E: sipush 204 (0x00CC)
		// @1751: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1754: getstatic game.C_100302_ka game.C_100189_ri.field_105752_d
		// @1757: bipush -102 (0x9A)
		// @1759: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @175C: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @175F: iconst_4
		// @1760: putstatic int game.C_100016_wi.field_103806_a
		// @1763: bipush 15 (0x0F)
		// @1765: putstatic int game.C_100104_v.field_104692_c
		// @1768: iconst_4
		// @1769: putstatic int game.C_100055_ed.field_104242_e
		// @176C: new game.C_100302_ka
		// @176F: dup
		// @1770: invokespecial game.C_100302_ka.<init>()void
		// @1773: astore #19
		// @1775: aload #19
		// @1777: getstatic game.C_100037_wb[] game.C_100025_he.field_103935_c
		// @177A: iconst_0
		// @177B: aaload
		// @177C: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @177F: aload #19
		// @1781: getstatic game.C_100037_wb[] game.C_100025_he.field_103935_c
		// @1784: iconst_1
		// @1785: aaload
		// @1786: putfield game.C_100037_wb game.C_100302_ka.field_101844_pb
		// @1789: new game.C_100302_ka
		// @178C: dup
		// @178D: invokespecial game.C_100302_ka.<init>()void
		// @1790: astore #20
		// @1792: aload #20
		// @1794: getstatic game.C_100037_wb[] game.C_100249_pc.field_102328_G
		// @1797: iconst_1
		// @1798: aaload
		// @1799: putfield game.C_100037_wb game.C_100302_ka.field_101844_pb
		// @179C: aload #20
		// @179E: getstatic game.C_100037_wb[] game.C_100249_pc.field_102328_G
		// @17A1: iconst_0
		// @17A2: aaload
		// @17A3: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @17A6: new game.C_100302_ka
		// @17A9: dup
		// @17AA: invokespecial game.C_100302_ka.<init>()void
		// @17AD: astore #21
		// @17AF: aload #21
		// @17B1: getstatic game.C_100037_wb[] game.C_100056_de.field_103188_nb
		// @17B4: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @17B7: new game.C_100302_ka
		// @17BA: dup
		// @17BB: invokespecial game.C_100302_ka.<init>()void
		// @17BE: astore #22
		// @17C0: aload #22
		// @17C2: getstatic game.C_100037_wb[] game.C_100189_ri.field_105755_c
		// @17C5: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @17C8: new game.C_100231_oc
		// @17CB: dup
		// @17CC: ldc ""
		// @17CE: aload #19
		// @17D0: aload #20
		// @17D2: aload #21
		// @17D4: aload #22
		// @17D6: invokespecial game.C_100231_oc.<init>(java.lang.String, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka)void
		// @17D9: astore #23
		// @17DB: new game.C_100302_ka
		// @17DE: dup
		// @17DF: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @17E2: bipush 16 (0x10)
		// @17E4: aaload
		// @17E5: aconst_null
		// @17E6: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @17E9: astore #24
		// @17EB: aload #24
		// @17ED: putstatic game.C_100302_ka game.C_100145_ta.field_100422_e
		// @17F0: iconst_0
		// @17F1: istore #25
		// @17F3: getstatic game.C_100302_ka[] game.C_100063_dj.field_104290_f
		// @17F6: arraylength
		// @17F7: iload #25
		// @17F9: if_icmple @1814
		// @17FC: getstatic game.C_100302_ka[] game.C_100063_dj.field_104290_f
		// @17FF: iload #25
		// @1801: aconst_null
		// @1802: aastore
		// @1803: iinc #25 +1
		// @1806: iload #32
		// @1808: ifne @1832
		// @180B: iload #32
		// @180D: ifeq @17F3
		// @1810: goto @1814
		// @1813: athrow
		// @1814: getstatic int game.C_100016_wi.field_103806_a
		// @1817: ineg
		// @1818: getstatic int game.C_100104_v.field_104692_c
		// @181B: ineg
		// @181C: getstatic int game.C_100055_ed.field_104242_e
		// @181F: iconst_2
		// @1820: imul
		// @1821: ineg
		// @1822: iadd
		// @1823: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @1826: getfield int game.C_100302_ka.field_101886_Kb
		// @1829: iadd
		// @182A: iadd
		// @182B: istore #25
		// @182D: iload #25
		// @182F: putstatic int game.C_100233_oa.field_106250_h
		// @1832: bipush -2 (0xFE)
		// @1834: istore #26
		// @1836: getstatic int game.C_100200_ba.field_105852_c
		// @1839: iconst_m1
		// @183A: ixor
		// @183B: iconst_m1
		// @183C: if_icmpne @1850
		// @183F: iload #26
		// @1841: bipush 15 (0x0F)
		// @1843: iconst_1
		// @1844: aload #24
		// @1846: invokestatic game.C_100119_ua.func_104895_a(int, int, boolean, game.C_100302_ka)int
		// @1849: istore #26
		// @184B: iload #32
		// @184D: ifeq @185C
		// @1850: iconst_1
		// @1851: iload #26
		// @1853: aload #24
		// @1855: bipush 88 (0x58)
		// @1857: invokestatic game.C_100179_ch.func_100807_a(boolean, int, game.C_100302_ka, int)int
		// @185A: istore #26
		// @185C: aconst_null
		// @185D: astore #27
		// @185F: iconst_1
		// @1860: getstatic int game.C_100200_ba.field_105852_c
		// @1863: if_icmpeq @18BC
		// @1866: bipush 82 (0x52)
		// @1868: invokestatic game.C_100044_vm.func_100933_a(byte)boolean
		// @186B: ifne @187A
		// @186E: goto @1872
		// @1871: athrow
		// @1872: getstatic java.lang.String game.C_100032_gk.field_103135_S
		// @1875: astore #27
		// @1877: goto @18C1
		// @187A: iconst_m1
		// @187B: iconst_2
		// @187C: getstatic int game.C_100200_ba.field_105852_c
		// @187F: iand
		// @1880: iconst_m1
		// @1881: ixor
		// @1882: if_icmpne @18B4
		// @1885: getstatic int game.C_100200_ba.field_105852_c
		// @1888: bipush 16 (0x10)
		// @188A: iand
		// @188B: iconst_m1
		// @188C: ixor
		// @188D: iconst_m1
		// @188E: if_icmpne @18AC
		// @1891: goto @1895
		// @1894: athrow
		// @1895: iconst_0
		// @1896: getstatic int game.C_100200_ba.field_105852_c
		// @1899: if_icmpeq @18A4
		// @189C: goto @18A0
		// @189F: athrow
		// @18A0: goto @18C1
		// @18A3: athrow
		// @18A4: getstatic java.lang.String game.C_100000_gd.field_100356_d
		// @18A7: astore #27
		// @18A9: goto @18C1
		// @18AC: getstatic java.lang.String game.C_100306_kn.field_107134_c
		// @18AF: astore #27
		// @18B1: goto @18C1
		// @18B4: getstatic java.lang.String game.C_100172_ck.field_102122_cc
		// @18B7: astore #27
		// @18B9: goto @18C1
		// @18BC: getstatic java.lang.String game.C_100110_s.field_104846_b
		// @18BF: astore #27
		// @18C1: aconst_null
		// @18C2: aload #27
		// @18C4: if_acmpne @18CB
		// @18C7: goto @1960
		// @18CA: athrow
		// @18CB: new game.C_100302_ka
		// @18CE: dup
		// @18CF: ldc2_w -1
		// @18D2: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @18D5: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @18D8: astore #28
		// @18DA: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @18DD: aload #27
		// @18DF: aload #28
		// @18E1: getfield int game.C_100302_ka.field_101829_Db
		// @18E4: iconst_2
		// @18E5: imul
		// @18E6: ineg
		// @18E7: iload #25
		// @18E9: iconst_2
		// @18EA: aload #28
		// @18EC: getfield int game.C_100302_ka.field_101846_Ib
		// @18EF: imul
		// @18F0: isub
		// @18F1: iadd
		// @18F2: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @18F5: getfield int game.C_100302_ka.field_101833_ob
		// @18F8: invokevirtual game.C_100317_lb.func_101734_a(java.lang.String, int, int)int
		// @18FB: istore #29
		// @18FD: new game.C_100302_ka
		// @1900: dup
		// @1901: ldc2_w -1
		// @1904: aconst_null
		// @1905: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @1908: astore #30
		// @190A: aload #24
		// @190C: bipush -109 (0x93)
		// @190E: aload #30
		// @1910: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @1913: iinc #26 +2
		// @1916: aload #30
		// @1918: iconst_0
		// @1919: iload #29
		// @191B: iload_0
		// @191C: sipush 27923 (0x6D13)
		// @191F: iadd
		// @1920: iload #26
		// @1922: iload #25
		// @1924: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1927: aload #28
		// @1929: aload #27
		// @192B: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @192E: aload #28
		// @1930: iconst_0
		// @1931: iload #29
		// @1933: iload_0
		// @1934: sipush 27923 (0x6D13)
		// @1937: ixor
		// @1938: iconst_0
		// @1939: iconst_2
		// @193A: aload #28
		// @193C: getfield int game.C_100302_ka.field_101846_Ib
		// @193F: imul
		// @1940: ineg
		// @1941: iload #25
		// @1943: iadd
		// @1944: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1947: iload #26
		// @1949: iload #29
		// @194B: iadd
		// @194C: istore #26
		// @194E: aload #30
		// @1950: iload_0
		// @1951: sipush 28004 (0x6D64)
		// @1954: ixor
		// @1955: aload #28
		// @1957: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @195A: iinc #26 +254
		// @195D: iinc #26 +8
		// @1960: iload #26
		// @1962: putstatic int game.C_100294_ki.field_106971_P
		// @1965: getstatic int game.C_100200_ba.field_105852_c
		// @1968: ifne @197C
		// @196B: iload #26
		// @196D: bipush 15 (0x0F)
		// @196F: iconst_0
		// @1970: aload #24
		// @1972: invokestatic game.C_100119_ua.func_104895_a(int, int, boolean, game.C_100302_ka)int
		// @1975: istore #26
		// @1977: iload #32
		// @1979: ifeq @1988
		// @197C: iconst_0
		// @197D: iload #26
		// @197F: aload #24
		// @1981: bipush 112 (0x70)
		// @1983: invokestatic game.C_100179_ch.func_100807_a(boolean, int, game.C_100302_ka, int)int
		// @1986: istore #26
		// @1988: iconst_0
		// @1989: istore #28
		// @198B: getstatic int game.C_100200_ba.field_105852_c
		// @198E: iconst_m1
		// @198F: ixor
		// @1990: bipush -2 (0xFE)
		// @1992: if_icmpeq @1999
		// @1995: goto @19EA
		// @1998: athrow
		// @1999: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @199C: astore #29
		// @199E: iconst_0
		// @199F: istore #30
		// @19A1: aload #29
		// @19A3: arraylength
		// @19A4: iconst_m1
		// @19A5: ixor
		// @19A6: iload #30
		// @19A8: iconst_m1
		// @19A9: ixor
		// @19AA: if_icmpge @19D1
		// @19AD: aload #29
		// @19AF: iload #30
		// @19B1: aaload
		// @19B2: astore #31
		// @19B4: iload #32
		// @19B6: ifne @19DD
		// @19B9: aload #31
		// @19BB: ifnonnull @19C6
		// @19BE: goto @19C2
		// @19C1: athrow
		// @19C2: goto @19C9
		// @19C5: athrow
		// @19C6: iinc #28 +1
		// @19C9: iinc #30 +1
		// @19CC: iload #32
		// @19CE: ifeq @19A1
		// @19D1: iload #28
		// @19D3: iconst_m1
		// @19D4: ixor
		// @19D5: iconst_m1
		// @19D6: if_icmplt @19DD
		// @19D9: goto @19EA
		// @19DC: athrow
		// @19DD: aload #24
		// @19DF: bipush -103 (0x99)
		// @19E1: iconst_4
		// @19E2: iload #26
		// @19E4: iadd
		// @19E5: invokestatic game.C_100119_ua.func_104897_a(game.C_100302_ka, int, int)int
		// @19E8: istore #26
		// @19EA: aload #27
		// @19EC: ifnull @19F6
		// @19EF: iinc #26 +2
		// @19F2: goto @19F6
		// @19F5: athrow
		// @19F6: aload #24
		// @19F8: iconst_0
		// @19F9: iload #26
		// @19FB: iconst_m1
		// @19FC: iconst_0
		// @19FD: iconst_0
		// @19FE: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1A01: new game.C_100115_ej
		// @1A04: dup
		// @1A05: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @1A08: iconst_5
		// @1A09: aaload
		// @1A0A: iload_0
		// @1A0B: sipush -25268 (0x9D4C)
		// @1A0E: ixor
		// @1A0F: invokestatic game.C_100171_cn.func_105553_a(java.lang.CharSequence, int)long
		// @1A12: aload #24
		// @1A14: aconst_null
		// @1A15: aload #23
		// @1A17: invokespecial game.C_100115_ej.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100231_oc)void
		// @1A1A: astore #29
		// @1A1C: aload #29
		// @1A1E: putstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @1A21: aload #29
		// @1A23: getstatic int game.C_100016_wi.field_103806_a
		// @1A26: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @1A29: getfield int game.C_100302_ka.field_101848_lb
		// @1A2C: iconst_2
		// @1A2D: getstatic int game.C_100055_ed.field_104242_e
		// @1A30: imul
		// @1A31: ineg
		// @1A32: iadd
		// @1A33: getstatic int game.C_100055_ed.field_104242_e
		// @1A36: iconst_0
		// @1A37: iconst_2
		// @1A38: getstatic int game.C_100055_ed.field_104242_e
		// @1A3B: imul
		// @1A3C: ineg
		// @1A3D: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @1A40: getfield int game.C_100302_ka.field_101886_Kb
		// @1A43: iadd
		// @1A44: getstatic int game.C_100055_ed.field_104242_e
		// @1A47: getstatic int game.C_100104_v.field_104692_c
		// @1A4A: invokevirtual game.C_100115_ej.func_102030_a(int, int, int, int, int, int, int)void
		// @1A4D: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @1A50: bipush -77 (0xB3)
		// @1A52: aload #29
		// @1A54: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @1A57: iconst_m1
		// @1A58: istore #30
		// @1A5A: getstatic int game.C_100200_ba.field_105852_c
		// @1A5D: iconst_m1
		// @1A5E: ixor
		// @1A5F: iconst_m1
		// @1A60: if_icmpne @1A6B
		// @1A63: iconst_3
		// @1A64: istore #30
		// @1A66: iload #32
		// @1A68: ifeq @1AA4
		// @1A6B: iconst_0
		// @1A6C: iconst_1
		// @1A6D: getstatic int game.C_100200_ba.field_105852_c
		// @1A70: iand
		// @1A71: if_icmpeq @1A80
		// @1A74: goto @1A78
		// @1A77: athrow
		// @1A78: iconst_0
		// @1A79: istore #30
		// @1A7B: iload #32
		// @1A7D: ifeq @1AA4
		// @1A80: getstatic int game.C_100200_ba.field_105852_c
		// @1A83: bipush 16 (0x10)
		// @1A85: iand
		// @1A86: ifeq @1A95
		// @1A89: goto @1A8D
		// @1A8C: athrow
		// @1A8D: iconst_2
		// @1A8E: istore #30
		// @1A90: iload #32
		// @1A92: ifeq @1AA4
		// @1A95: iconst_2
		// @1A96: getstatic int game.C_100200_ba.field_105852_c
		// @1A99: iand
		// @1A9A: ifeq @1AA4
		// @1A9D: goto @1AA1
		// @1AA0: athrow
		// @1AA1: iconst_1
		// @1AA2: istore #30
		// @1AA4: iload #30
		// @1AA6: iconst_m1
		// @1AA7: ixor
		// @1AA8: iconst_m1
		// @1AA9: if_icmple @1AB0
		// @1AAC: goto @1ADF
		// @1AAF: athrow
		// @1AB0: aload #29
		// @1AB2: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @1AB5: getstatic int[] game.C_100074_g.field_104410_e
		// @1AB8: iload #30
		// @1ABA: iaload
		// @1ABB: putfield int game.C_100302_ka.field_101880_Gb
		// @1ABE: aload #29
		// @1AC0: getfield game.C_100231_oc game.C_100115_ej.field_102038_Vb
		// @1AC3: aload #29
		// @1AC5: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @1AC8: getfield int game.C_100302_ka.field_101848_lb
		// @1ACB: bipush -63 (0xC1)
		// @1ACD: aload #29
		// @1ACF: getfield game.C_100302_ka game.C_100115_ej.field_102040_Zb
		// @1AD2: getfield int game.C_100302_ka.field_101848_lb
		// @1AD5: getstatic int[] game.C_100074_g.field_104410_e
		// @1AD8: iload #30
		// @1ADA: iaload
		// @1ADB: ineg
		// @1ADC: invokevirtual game.C_100231_oc.func_102179_a(int, byte, int, int)void
		// @1ADF: iload #6
		// @1AE1: putstatic int game.C_100270_mi.field_102270_jc
		// @1AE4: new game.C_100302_ka
		// @1AE7: dup
		// @1AE8: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @1AEB: bipush 13 (0x0D)
		// @1AED: aaload
		// @1AEE: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @1AF1: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @1AF4: putstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @1AF7: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @1AFA: sipush 518 (0x0206)
		// @1AFD: sipush 280 (0x0118)
		// @1B00: iconst_m1
		// @1B01: bipush 64 (0x40)
		// @1B03: bipush 110 (0x6E)
		// @1B05: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1B08: getstatic game.C_100302_ka game.C_100189_ri.field_105752_d
		// @1B0B: bipush -90 (0xA6)
		// @1B0D: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @1B10: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @1B13: new game.C_100302_ka
		// @1B16: dup
		// @1B17: ldc2_w -1
		// @1B1A: aconst_null
		// @1B1B: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @1B1E: astore #24
		// @1B20: aload #24
		// @1B22: getstatic game.C_100037_wb[] game.C_100200_ba.field_105851_b
		// @1B25: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @1B28: aload #24
		// @1B2A: iconst_0
		// @1B2B: sipush 257 (0x0101)
		// @1B2E: iconst_m1
		// @1B2F: bipush 20 (0x14)
		// @1B31: bipush 110 (0x6E)
		// @1B33: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1B36: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @1B39: bipush -90 (0xA6)
		// @1B3B: aload #24
		// @1B3D: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @1B40: bipush -2 (0xFE)
		// @1B42: getstatic int game.C_100200_ba.field_105852_c
		// @1B45: iconst_m1
		// @1B46: ixor
		// @1B47: if_icmpeq @1D40
		// @1B4A: iconst_2
		// @1B4B: getstatic int game.C_100200_ba.field_105852_c
		// @1B4E: iand
		// @1B4F: ifgt @1C7F
		// @1B52: goto @1B56
		// @1B55: athrow
		// @1B56: bipush 16 (0x10)
		// @1B58: getstatic int game.C_100200_ba.field_105852_c
		// @1B5B: iand
		// @1B5C: ifle @1C66
		// @1B5F: goto @1B63
		// @1B62: athrow
		// @1B63: new game.C_100302_ka
		// @1B66: dup
		// @1B67: ldc ""
		// @1B69: aload #16
		// @1B6B: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @1B6E: astore #25
		// @1B70: aload #25
		// @1B72: getstatic java.lang.String game.C_100339_jb.field_107392_i
		// @1B75: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @1B78: aload #25
		// @1B7A: iconst_0
		// @1B7B: bipush 18 (0x12)
		// @1B7D: iconst_m1
		// @1B7E: iconst_0
		// @1B7F: bipush 110 (0x6E)
		// @1B81: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1B84: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @1B87: bipush -73 (0xB7)
		// @1B89: aload #25
		// @1B8B: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @1B8E: iload_0
		// @1B8F: ldc -1221438861 (0xb7325273)
		// @1B91: iadd
		// @1B92: invokestatic game.C_100019_wl.func_103833_a(int)int
		// @1B95: istore #26
		// @1B97: sipush 254 (0x00FE)
		// @1B9A: istore #27
		// @1B9C: iload #27
		// @1B9E: iconst_m1
		// @1B9F: ixor
		// @1BA0: iload #26
		// @1BA2: iconst_m1
		// @1BA3: ixor
		// @1BA4: if_icmple @1BAC
		// @1BA7: iconst_1
		// @1BA8: goto @1BAD
		// @1BAB: athrow
		// @1BAC: iconst_0
		// @1BAD: putstatic boolean game.C_100006_fj.field_103621_c
		// @1BB0: new game.C_100302_ka
		// @1BB3: dup
		// @1BB4: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @1BB7: bipush 12 (0x0C)
		// @1BB9: aaload
		// @1BBA: aconst_null
		// @1BBB: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @1BBE: astore #28
		// @1BC0: aload #28
		// @1BC2: putstatic game.C_100302_ka game.C_100226_ae.field_106147_g
		// @1BC5: getstatic boolean game.C_100006_fj.field_103621_c
		// @1BC8: ifne @1BD7
		// @1BCB: aload #28
		// @1BCD: getstatic game.C_100037_wb[] game.C_100200_ba.field_105851_b
		// @1BD0: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @1BD3: goto @1BD7
		// @1BD6: athrow
		// @1BD7: aload #28
		// @1BD9: iconst_0
		// @1BDA: invokestatic game.C_100290_jm.func_106848_a(game.C_100302_ka, boolean)int
		// @1BDD: istore #29
		// @1BDF: iconst_1
		// @1BE0: putstatic boolean game.C_100034_gi.field_104029_d
		// @1BE3: aload #28
		// @1BE5: getstatic boolean game.C_100006_fj.field_103621_c
		// @1BE8: ifne @1BF0
		// @1BEB: iconst_0
		// @1BEC: goto @1BF7
		// @1BEF: athrow
		// @1BF0: iconst_2
		// @1BF1: getstatic int game.C_100104_v.field_104692_c
		// @1BF4: iconst_2
		// @1BF5: idiv
		// @1BF6: iadd
		// @1BF7: iload #29
		// @1BF9: iconst_m1
		// @1BFA: bipush 20 (0x14)
		// @1BFC: bipush 110 (0x6E)
		// @1BFE: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1C01: getstatic boolean game.C_100006_fj.field_103621_c
		// @1C04: ifne @1C20
		// @1C07: aload #24
		// @1C09: aconst_null
		// @1C0A: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @1C0D: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @1C10: bipush -80 (0xB0)
		// @1C12: aload #28
		// @1C14: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @1C17: iload #32
		// @1C19: ifeq @1C63
		// @1C1C: goto @1C20
		// @1C1F: athrow
		// @1C20: new game.C_100115_ej
		// @1C23: dup
		// @1C24: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @1C27: bipush 15 (0x0F)
		// @1C29: aaload
		// @1C2A: iload_0
		// @1C2B: sipush -25268 (0x9D4C)
		// @1C2E: ixor
		// @1C2F: invokestatic game.C_100171_cn.func_105553_a(java.lang.CharSequence, int)long
		// @1C32: aload #28
		// @1C34: aconst_null
		// @1C35: aload #23
		// @1C37: invokespecial game.C_100115_ej.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100231_oc)void
		// @1C3A: astore #30
		// @1C3C: aload #30
		// @1C3E: putstatic game.C_100115_ej game.C_100316_lc.field_102410_w
		// @1C41: aload #30
		// @1C43: getstatic int game.C_100016_wi.field_103806_a
		// @1C46: iload #27
		// @1C48: iconst_2
		// @1C49: isub
		// @1C4A: iconst_0
		// @1C4B: iconst_0
		// @1C4C: bipush 107 (0x6B)
		// @1C4E: bipush 23 (0x17)
		// @1C50: getstatic int game.C_100104_v.field_104692_c
		// @1C53: invokevirtual game.C_100115_ej.func_102030_a(int, int, int, int, int, int, int)void
		// @1C56: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @1C59: iload_0
		// @1C5A: sipush 28013 (0x6D6D)
		// @1C5D: ixor
		// @1C5E: aload #30
		// @1C60: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @1C63: goto @1D48
		// @1C66: iconst_0
		// @1C67: getstatic int game.C_100200_ba.field_105852_c
		// @1C6A: if_icmpne @1D48
		// @1C6D: ldc_w 1021128 (0xf94c8)
		// @1C70: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @1C73: invokestatic game.C_100284_nj.func_106763_a(int, game.C_100302_ka)void
		// @1C76: iload #32
		// @1C78: ifeq @1D48
		// @1C7B: goto @1C7F
		// @1C7E: athrow
		// @1C7F: new game.C_100302_ka
		// @1C82: dup
		// @1C83: ldc ""
		// @1C85: aload #16
		// @1C87: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @1C8A: astore #25
		// @1C8C: aload #25
		// @1C8E: getstatic java.lang.String game.C_100121_ud.field_100734_q
		// @1C91: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @1C94: aload #25
		// @1C96: iconst_0
		// @1C97: bipush 18 (0x12)
		// @1C99: iconst_m1
		// @1C9A: iconst_0
		// @1C9B: bipush 110 (0x6E)
		// @1C9D: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1CA0: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @1CA3: iload_0
		// @1CA4: sipush 27988 (0x6D54)
		// @1CA7: ixor
		// @1CA8: aload #25
		// @1CAA: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @1CAD: new game.C_100302_ka
		// @1CB0: dup
		// @1CB1: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @1CB4: bipush 12 (0x0C)
		// @1CB6: aaload
		// @1CB7: aconst_null
		// @1CB8: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @1CBB: astore #26
		// @1CBD: aload #26
		// @1CBF: putstatic game.C_100302_ka game.C_100226_ae.field_106147_g
		// @1CC2: iconst_4
		// @1CC3: iconst_4
		// @1CC4: aload #26
		// @1CC6: invokestatic game.C_100028_ha.func_103938_a(int, game.C_100302_ka)int
		// @1CC9: iadd
		// @1CCA: istore #27
		// @1CCC: aload #26
		// @1CCE: getstatic game.C_100037_wb[] game.C_100200_ba.field_105851_b
		// @1CD1: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @1CD4: aload #26
		// @1CD6: iconst_0
		// @1CD7: iload #27
		// @1CD9: iload_0
		// @1CDA: sipush 27923 (0x6D13)
		// @1CDD: ixor
		// @1CDE: bipush 20 (0x14)
		// @1CE0: bipush 110 (0x6E)
		// @1CE2: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1CE5: sipush 284 (0x011C)
		// @1CE8: iload #27
		// @1CEA: if_icmpge @1D2D
		// @1CED: new game.C_100115_ej
		// @1CF0: dup
		// @1CF1: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @1CF4: bipush 15 (0x0F)
		// @1CF6: aaload
		// @1CF7: sipush 4000 (0x0FA0)
		// @1CFA: invokestatic game.C_100171_cn.func_105553_a(java.lang.CharSequence, int)long
		// @1CFD: aload #26
		// @1CFF: aconst_null
		// @1D00: aload #23
		// @1D02: invokespecial game.C_100115_ej.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100231_oc)void
		// @1D05: astore #28
		// @1D07: aload #28
		// @1D09: putstatic game.C_100115_ej game.C_100316_lc.field_102410_w
		// @1D0C: aload #28
		// @1D0E: getstatic int game.C_100016_wi.field_103806_a
		// @1D11: sipush 301 (0x012D)
		// @1D14: iconst_0
		// @1D15: iconst_0
		// @1D16: bipush 110 (0x6E)
		// @1D18: bipush 21 (0x15)
		// @1D1A: getstatic int game.C_100104_v.field_104692_c
		// @1D1D: invokevirtual game.C_100115_ej.func_102030_a(int, int, int, int, int, int, int)void
		// @1D20: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @1D23: bipush -108 (0x94)
		// @1D25: aload #28
		// @1D27: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @1D2A: goto @1D3D
		// @1D2D: aload #24
		// @1D2F: aconst_null
		// @1D30: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @1D33: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @1D36: bipush -118 (0x8A)
		// @1D38: aload #26
		// @1D3A: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @1D3D: goto @1D48
		// @1D40: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @1D43: ldc ""
		// @1D45: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @1D48: getstatic int game.C_100200_ba.field_105852_c
		// @1D4B: iconst_1
		// @1D4C: if_icmpne @1D59
		// @1D4F: aload #24
		// @1D51: aconst_null
		// @1D52: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @1D55: goto @1D59
		// @1D58: athrow
		// @1D59: iconst_0
		// @1D5A: invokestatic game.C_100024_hd.func_102991_h(int)void
		// @1D5D: goto @1D82
		// @1D60: astore_1
		// @1D61: aload_1
		// @1D62: new java.lang.StringBuilder
		// @1D65: dup
		// @1D66: invokespecial java.lang.StringBuilder.<init>()void
		// @1D69: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @1D6C: bipush 10 (0x0A)
		// @1D6E: aaload
		// @1D6F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D72: iload_0
		// @1D73: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1D76: bipush 41 (0x29)
		// @1D78: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D7B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1D7E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1D81: athrow
		// @1D82: return
	}
	
	static final void func_103429_a(String arg0, int arg1)
	{
		// @00: iload_1
		// @01: sipush 16676 (0x4124)
		// @04: if_icmpeq @0B
		// @07: iconst_1
		// @08: invokestatic game.C_100271_mj.func_103426_a(boolean)void
		// @0B: goto @4A
		// @0E: astore_2
		// @0F: aload_2
		// @10: new java.lang.StringBuilder
		// @13: dup
		// @14: invokespecial java.lang.StringBuilder.<init>()void
		// @17: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @1A: bipush 19 (0x13)
		// @1C: aaload
		// @1D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @20: aload_0
		// @21: ifnull @2D
		// @24: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @27: iconst_2
		// @28: aaload
		// @29: goto @32
		// @2C: athrow
		// @2D: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @30: iconst_1
		// @31: aaload
		// @32: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35: bipush 44 (0x2C)
		// @37: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3A: iload_1
		// @3B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E: bipush 41 (0x29)
		// @40: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @46: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @49: athrow
		// @4A: return
	}
	
	static final long func_103427_a(int arg0, CharSequence arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: lconst_0
		// @006: lstore_2
		// @007: aload_1
		// @008: invokeinterface java.lang.CharSequence.length()int
		// @00D: istore #4
		// @00F: iload_0
		// @010: bipush 97 (0x61)
		// @012: if_icmpeq @019
		// @015: ldc2_w -57
		// @018: lreturn
		// @019: iconst_0
		// @01A: istore #5
		// @01C: iload #4
		// @01E: iconst_m1
		// @01F: ixor
		// @020: iload #5
		// @022: iconst_m1
		// @023: ixor
		// @024: if_icmpge @0C5
		// @027: lload_2
		// @028: ldc2_w 37
		// @02B: lmul
		// @02C: lstore_2
		// @02D: aload_1
		// @02E: iload #5
		// @030: invokeinterface java.lang.CharSequence.charAt(int)char
		// @035: istore #6
		// @037: iload #6
		// @039: iconst_m1
		// @03A: ixor
		// @03B: iload #7
		// @03D: ifne @0D2
		// @040: bipush -66 (0xBE)
		// @042: if_icmpgt @065
		// @045: goto @049
		// @048: athrow
		// @049: iload #6
		// @04B: iconst_m1
		// @04C: ixor
		// @04D: bipush -91 (0xA5)
		// @04F: if_icmplt @065
		// @052: goto @056
		// @055: athrow
		// @056: lload_2
		// @057: bipush -64 (0xC0)
		// @059: iload #6
		// @05B: ineg
		// @05C: isub
		// @05D: i2l
		// @05E: ladd
		// @05F: lstore_2
		// @060: iload #7
		// @062: ifeq @0AD
		// @065: bipush 97 (0x61)
		// @067: iload #6
		// @069: if_icmpgt @08E
		// @06C: goto @070
		// @06F: athrow
		// @070: bipush -123 (0x85)
		// @072: iload #6
		// @074: iconst_m1
		// @075: ixor
		// @076: if_icmpgt @08E
		// @079: goto @07D
		// @07C: athrow
		// @07D: lload_2
		// @07E: iconst_1
		// @07F: iload #6
		// @081: ineg
		// @082: bipush 97 (0x61)
		// @084: iadd
		// @085: isub
		// @086: i2l
		// @087: ladd
		// @088: lstore_2
		// @089: iload #7
		// @08B: ifeq @0AD
		// @08E: bipush 48 (0x30)
		// @090: iload #6
		// @092: if_icmpgt @0AD
		// @095: goto @099
		// @098: athrow
		// @099: iload #6
		// @09B: bipush 57 (0x39)
		// @09D: if_icmpgt @0AD
		// @0A0: goto @0A4
		// @0A3: athrow
		// @0A4: lload_2
		// @0A5: iload #6
		// @0A7: bipush -21 (0xEB)
		// @0A9: iadd
		// @0AA: i2l
		// @0AB: ladd
		// @0AC: lstore_2
		// @0AD: ldc2_w -177917621779460414
		// @0B0: lload_2
		// @0B1: ldc2_w -1
		// @0B4: lxor
		// @0B5: lcmp
		// @0B6: ifge @0C5
		// @0B9: iinc #5 +1
		// @0BC: iload #7
		// @0BE: ifeq @01C
		// @0C1: goto @0C5
		// @0C4: athrow
		// @0C5: ldc2_w -1
		// @0C8: lload_2
		// @0C9: ldc2_w 37
		// @0CC: lrem
		// @0CD: ldc2_w -1
		// @0D0: lxor
		// @0D1: lcmp
		// @0D2: ifne @0F9
		// @0D5: lload_2
		// @0D6: ldc2_w -1
		// @0D9: lxor
		// @0DA: iload #7
		// @0DC: ifne @0FA
		// @0DF: goto @0E3
		// @0E2: athrow
		// @0E3: ldc2_w -1
		// @0E6: lcmp
		// @0E7: ifeq @0F9
		// @0EA: goto @0EE
		// @0ED: athrow
		// @0EE: lload_2
		// @0EF: ldc2_w 37
		// @0F2: ldiv
		// @0F3: lstore_2
		// @0F4: iload #7
		// @0F6: ifeq @0C5
		// @0F9: lload_2
		// @0FA: lreturn
		// @0FB: astore_2
		// @0FC: aload_2
		// @0FD: new java.lang.StringBuilder
		// @100: dup
		// @101: invokespecial java.lang.StringBuilder.<init>()void
		// @104: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @107: bipush 21 (0x15)
		// @109: aaload
		// @10A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @10D: iload_0
		// @10E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @111: bipush 44 (0x2C)
		// @113: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @116: aload_1
		// @117: ifnull @123
		// @11A: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @11D: iconst_2
		// @11E: aaload
		// @11F: goto @128
		// @122: athrow
		// @123: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @126: iconst_1
		// @127: aaload
		// @128: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @12B: bipush 41 (0x29)
		// @12D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @130: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @133: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @136: athrow
	}
	
	static final void func_103423_a(int[] arg0, byte arg1, int arg2, int arg3, int arg4)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #8
		// @05: iinc #3 +255
		// @08: iload_3
		// @09: iflt @3A
		// @0C: aload_0
		// @0D: astore #5
		// @0F: iload_2
		// @10: istore #6
		// @12: iload #4
		// @14: iload #8
		// @16: ifne @44
		// @19: istore #7
		// @1B: aload #5
		// @1D: iload #6
		// @1F: iload #7
		// @21: aload #5
		// @23: iload #6
		// @25: iaload
		// @26: ldc_w 16711422 (0xfefefe)
		// @29: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @2C: ldc_w -641073535 (0xd9c9fe81)
		// @2F: ishr
		// @30: iadd
		// @31: iastore
		// @32: iinc #2 +1
		// @35: iload #8
		// @37: ifeq @05
		// @3A: bipush 51 (0x33)
		// @3C: iload_1
		// @3D: bipush 92 (0x5C)
		// @3F: isub
		// @40: bipush 34 (0x22)
		// @42: idiv
		// @43: idiv
		// @44: istore #5
		// @46: goto @A3
		// @49: astore #5
		// @4B: aload #5
		// @4D: new java.lang.StringBuilder
		// @50: dup
		// @51: invokespecial java.lang.StringBuilder.<init>()void
		// @54: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @57: bipush 22 (0x16)
		// @59: aaload
		// @5A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5D: aload_0
		// @5E: ifnull @6A
		// @61: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @64: iconst_2
		// @65: aaload
		// @66: goto @6F
		// @69: athrow
		// @6A: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @6D: iconst_1
		// @6E: aaload
		// @6F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @72: bipush 44 (0x2C)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: iload_1
		// @78: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7B: bipush 44 (0x2C)
		// @7D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @80: iload_2
		// @81: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @84: bipush 44 (0x2C)
		// @86: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @89: iload_3
		// @8A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8D: bipush 44 (0x2C)
		// @8F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @92: iload #4
		// @94: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @97: bipush 41 (0x29)
		// @99: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A2: athrow
		// @A3: return
	}
	
	final String func_102525_c(byte arg0)
	{
		// @00: aload_0
		// @01: getfield game.C_100336_im game.C_100271_mj.field_103351_J
		// @04: getfield boolean game.C_100336_im.field_102539_j
		// @07: istore_2
		// @08: aload_0
		// @09: getfield game.C_100336_im game.C_100271_mj.field_103351_J
		// @0C: aload_0
		// @0D: getfield boolean game.C_100271_mj.field_102539_j
		// @10: putfield boolean game.C_100336_im.field_102539_j
		// @13: aload_0
		// @14: getfield game.C_100336_im game.C_100271_mj.field_103351_J
		// @17: bipush 121 (0x79)
		// @19: invokevirtual game.C_100336_im.func_102525_c(byte)java.lang.String
		// @1C: astore_3
		// @1D: iload_1
		// @1E: bipush 34 (0x22)
		// @20: if_icmpgt @35
		// @23: bipush -76 (0xB4)
		// @25: aconst_null
		// @26: checkcast game.C_100037_wb
		// @29: aconst_null
		// @2A: checkcast java.lang.String
		// @2D: invokestatic game.C_100271_mj.func_103431_a(int, game.C_100037_wb, java.lang.String)game.C_100153_be
		// @30: pop
		// @31: goto @35
		// @34: athrow
		// @35: aload_0
		// @36: getfield game.C_100336_im game.C_100271_mj.field_103351_J
		// @39: iload_2
		// @3A: putfield boolean game.C_100336_im.field_102539_j
		// @3D: aload_3
		// @3E: areturn
		// @3F: astore_2
		// @40: aload_2
		// @41: new java.lang.StringBuilder
		// @44: dup
		// @45: invokespecial java.lang.StringBuilder.<init>()void
		// @48: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @4B: iconst_4
		// @4C: aaload
		// @4D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @50: iload_1
		// @51: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @54: bipush 41 (0x29)
		// @56: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @59: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5F: athrow
	}
	
	static final C_100153_be func_103431_a(int arg0, C_100037_wb arg1, String arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #13
		// @005: iconst_0
		// @006: istore_3
		// @007: aload_1
		// @008: getfield int[] game.C_100037_wb.field_102388_J
		// @00B: arraylength
		// @00C: iload_3
		// @00D: if_icmple @028
		// @010: aload_1
		// @011: getfield int[] game.C_100037_wb.field_102388_J
		// @014: iload_3
		// @015: iconst_0
		// @016: iastore
		// @017: iinc #3 +1
		// @01A: iload #13
		// @01C: ifne @051
		// @01F: iload #13
		// @021: ifeq @007
		// @024: goto @028
		// @027: athrow
		// @028: aload_1
		// @029: invokevirtual game.C_100037_wb.func_102379_d()void
		// @02C: getstatic game.C_100317_lb game.C_100318_hj.field_107197_e
		// @02F: aload_2
		// @030: aload_1
		// @031: getfield int game.C_100037_wb.field_102341_y
		// @034: iconst_2
		// @035: idiv
		// @036: aload_1
		// @037: getfield int game.C_100037_wb.field_102340_z
		// @03A: bipush 10 (0x0A)
		// @03C: isub
		// @03D: ldc_w 10790052 (0xa4a4a4)
		// @040: iconst_m1
		// @041: invokevirtual game.C_100317_lb.func_101744_b(java.lang.String, int, int, int, int)void
		// @044: getstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @047: bipush 126 (0x7E)
		// @049: invokevirtual game.C_100185_rm.func_105476_a(byte)void
		// @04C: aload_1
		// @04D: getfield int game.C_100037_wb.field_102341_y
		// @050: istore_3
		// @051: aload_1
		// @052: getfield int game.C_100037_wb.field_102340_z
		// @055: istore #4
		// @057: iconst_0
		// @058: istore #5
		// @05A: iconst_0
		// @05B: istore #6
		// @05D: iconst_0
		// @05E: istore #7
		// @060: iconst_0
		// @061: istore #8
		// @063: iload #8
		// @065: aload_1
		// @066: getfield int game.C_100037_wb.field_102340_z
		// @069: if_icmpge @0E6
		// @06C: iload #13
		// @06E: ifne @0EC
		// @071: iconst_0
		// @072: istore #9
		// @074: aload_1
		// @075: getfield int game.C_100037_wb.field_102341_y
		// @078: iconst_m1
		// @079: ixor
		// @07A: iload #9
		// @07C: iconst_m1
		// @07D: ixor
		// @07E: if_icmpge @0D5
		// @081: iconst_0
		// @082: aload_1
		// @083: getfield int[] game.C_100037_wb.field_102388_J
		// @086: iload #7
		// @088: iload #9
		// @08A: iadd
		// @08B: iaload
		// @08C: iload #13
		// @08E: ifne @0DB
		// @091: if_icmpne @09B
		// @094: goto @098
		// @097: athrow
		// @098: goto @0CD
		// @09B: iload #4
		// @09D: iload #8
		// @09F: if_icmple @0A6
		// @0A2: iload #8
		// @0A4: istore #4
		// @0A6: iload #9
		// @0A8: iload_3
		// @0A9: if_icmpge @0AF
		// @0AC: iload #9
		// @0AE: istore_3
		// @0AF: iload #8
		// @0B1: iload #5
		// @0B3: if_icmpgt @0BA
		// @0B6: goto @0BE
		// @0B9: athrow
		// @0BA: iload #8
		// @0BC: istore #5
		// @0BE: iload #9
		// @0C0: iload #6
		// @0C2: if_icmpgt @0C9
		// @0C5: goto @0CD
		// @0C8: athrow
		// @0C9: iload #9
		// @0CB: istore #6
		// @0CD: iinc #9 +1
		// @0D0: iload #13
		// @0D2: ifeq @074
		// @0D5: iload #7
		// @0D7: aload_1
		// @0D8: getfield int game.C_100037_wb.field_102341_y
		// @0DB: iadd
		// @0DC: istore #7
		// @0DE: iinc #8 +1
		// @0E1: iload #13
		// @0E3: ifeq @063
		// @0E6: iinc #5 +1
		// @0E9: iinc #6 +1
		// @0EC: new game.C_100153_be
		// @0EF: dup
		// @0F0: iload #6
		// @0F2: iload_3
		// @0F3: isub
		// @0F4: bipush -8 (0xF8)
		// @0F6: isub
		// @0F7: bipush 8 (0x08)
		// @0F9: iload #4
		// @0FB: ineg
		// @0FC: iload #5
		// @0FE: iadd
		// @0FF: iadd
		// @100: iconst_3
		// @101: invokespecial game.C_100153_be.<init>(int, int, int)void
		// @104: astore #8
		// @106: iload #4
		// @108: aload_1
		// @109: getfield int game.C_100037_wb.field_102341_y
		// @10C: imul
		// @10D: iload_3
		// @10E: ineg
		// @10F: isub
		// @110: istore #7
		// @112: aload #8
		// @114: getfield int[] game.C_100153_be.field_105320_t
		// @117: iconst_0
		// @118: iconst_0
		// @119: iastore
		// @11A: aload #8
		// @11C: getfield int[] game.C_100153_be.field_105320_t
		// @11F: iconst_2
		// @120: ldc_w 5789784 (0x585858)
		// @123: iastore
		// @124: aload #8
		// @126: getfield int[] game.C_100153_be.field_105320_t
		// @129: iconst_1
		// @12A: ldc_w 10790052 (0xa4a4a4)
		// @12D: iastore
		// @12E: bipush -111 (0x91)
		// @130: iload_0
		// @131: bipush -61 (0xC3)
		// @133: isub
		// @134: bipush 56 (0x38)
		// @136: idiv
		// @137: irem
		// @138: istore #10
		// @13A: iconst_4
		// @13B: aload #8
		// @13D: getfield int game.C_100153_be.field_105301_h
		// @140: imul
		// @141: bipush -4 (0xFC)
		// @143: isub
		// @144: istore #9
		// @146: iconst_0
		// @147: istore #11
		// @149: iload #5
		// @14B: iload #4
		// @14D: ineg
		// @14E: iadd
		// @14F: iload #11
		// @151: if_icmple @1B3
		// @154: iconst_0
		// @155: iload #13
		// @157: ifne @1C3
		// @15A: istore #12
		// @15C: iload #12
		// @15E: iconst_m1
		// @15F: ixor
		// @160: iload_3
		// @161: ineg
		// @162: iload #6
		// @164: iadd
		// @165: iconst_m1
		// @166: ixor
		// @167: if_icmple @198
		// @16A: aload_1
		// @16B: getfield int[] game.C_100037_wb.field_102388_J
		// @16E: iload #12
		// @170: iload #7
		// @172: iadd
		// @173: iaload
		// @174: iload #13
		// @176: ifne @1A9
		// @179: ifeq @190
		// @17C: goto @180
		// @17F: athrow
		// @180: aload #8
		// @182: getfield byte[] game.C_100153_be.field_105319_u
		// @185: iload #9
		// @187: iload #12
		// @189: iadd
		// @18A: iconst_1
		// @18B: bastore
		// @18C: goto @190
		// @18F: athrow
		// @190: iinc #12 +1
		// @193: iload #13
		// @195: ifeq @15C
		// @198: iload #9
		// @19A: aload #8
		// @19C: getfield int game.C_100153_be.field_105301_h
		// @19F: iadd
		// @1A0: istore #9
		// @1A2: iload #7
		// @1A4: aload_1
		// @1A5: getfield int game.C_100037_wb.field_102341_y
		// @1A8: iadd
		// @1A9: istore #7
		// @1AB: iinc #11 +1
		// @1AE: iload #13
		// @1B0: ifeq @149
		// @1B3: aload #8
		// @1B5: getfield int game.C_100153_be.field_105301_h
		// @1B8: iconst_m1
		// @1B9: aload #8
		// @1BB: getfield int game.C_100153_be.field_105303_s
		// @1BE: iadd
		// @1BF: imul
		// @1C0: istore #9
		// @1C2: iconst_0
		// @1C3: istore #11
		// @1C5: aload #8
		// @1C7: getfield int game.C_100153_be.field_105301_h
		// @1CA: iload #11
		// @1CC: if_icmple @1F5
		// @1CF: aload #8
		// @1D1: getfield byte[] game.C_100153_be.field_105319_u
		// @1D4: iload #11
		// @1D6: iconst_2
		// @1D7: bastore
		// @1D8: aload #8
		// @1DA: getfield byte[] game.C_100153_be.field_105319_u
		// @1DD: iload #11
		// @1DF: iload #9
		// @1E1: iadd
		// @1E2: iconst_2
		// @1E3: bastore
		// @1E4: iinc #11 +1
		// @1E7: iload #13
		// @1E9: ifne @1F8
		// @1EC: iload #13
		// @1EE: ifeq @1C5
		// @1F1: goto @1F5
		// @1F4: athrow
		// @1F5: iconst_0
		// @1F6: istore #9
		// @1F8: iconst_0
		// @1F9: istore #11
		// @1FB: iload #11
		// @1FD: aload #8
		// @1FF: getfield int game.C_100153_be.field_105303_s
		// @202: if_icmpge @23A
		// @205: aload #8
		// @207: getfield byte[] game.C_100153_be.field_105319_u
		// @20A: iload #9
		// @20C: iconst_0
		// @20D: iadd
		// @20E: iconst_2
		// @20F: bastore
		// @210: aload #8
		// @212: iload #13
		// @214: ifne @23C
		// @217: getfield byte[] game.C_100153_be.field_105319_u
		// @21A: iconst_m1
		// @21B: aload #8
		// @21D: getfield int game.C_100153_be.field_105301_h
		// @220: iadd
		// @221: iconst_0
		// @222: iload #9
		// @224: iadd
		// @225: iadd
		// @226: iconst_2
		// @227: bastore
		// @228: iload #9
		// @22A: aload #8
		// @22C: getfield int game.C_100153_be.field_105301_h
		// @22F: iadd
		// @230: istore #9
		// @232: iinc #11 +1
		// @235: iload #13
		// @237: ifeq @1FB
		// @23A: aload #8
		// @23C: areturn
		// @23D: astore_3
		// @23E: aload_3
		// @23F: new java.lang.StringBuilder
		// @242: dup
		// @243: invokespecial java.lang.StringBuilder.<init>()void
		// @246: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @249: iconst_0
		// @24A: aaload
		// @24B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @24E: iload_0
		// @24F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @252: bipush 44 (0x2C)
		// @254: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @257: aload_1
		// @258: ifnull @264
		// @25B: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @25E: iconst_2
		// @25F: aaload
		// @260: goto @269
		// @263: athrow
		// @264: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @267: iconst_1
		// @268: aaload
		// @269: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @26C: bipush 44 (0x2C)
		// @26E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @271: aload_2
		// @272: ifnull @27E
		// @275: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @278: iconst_2
		// @279: aaload
		// @27A: goto @283
		// @27D: athrow
		// @27E: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @281: iconst_1
		// @282: aaload
		// @283: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @286: bipush 41 (0x29)
		// @288: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @28B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @28E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @291: athrow
	}
	
	C_100271_mj(int arg0, int arg1, int arg2, int arg3, C_100336_im arg4, boolean arg5, int arg6, int arg7, C_100112_r arg8, int arg9, String arg10)
	{
		// @000: aload_0
		// @001: iload_1
		// @002: iload_2
		// @003: iload_3
		// @004: iload #4
		// @006: aconst_null
		// @007: aconst_null
		// @008: invokespecial game.C_100030_gm.<init>(int, int, int, int, game.C_100326_ic, game.C_100337_in)void
		// @00B: aload_0
		// @00C: aload #5
		// @00E: putfield game.C_100336_im game.C_100271_mj.field_103351_J
		// @011: aload_0
		// @012: aload #9
		// @014: putfield game.C_100112_r game.C_100271_mj.field_103436_Q
		// @017: aload_0
		// @018: iload #10
		// @01A: putfield int game.C_100271_mj.field_103435_V
		// @01D: aload_0
		// @01E: aload #11
		// @020: putfield java.lang.String game.C_100271_mj.field_103434_W
		// @023: aload_0
		// @024: iload #8
		// @026: putfield int game.C_100271_mj.field_103442_X
		// @029: aload_0
		// @02A: iload #7
		// @02C: putfield int game.C_100271_mj.field_103441_Y
		// @02F: aload_0
		// @030: iload #6
		// @032: putfield boolean game.C_100271_mj.field_103439_R
		// @035: aload_0
		// @036: getfield int game.C_100271_mj.field_103441_Y
		// @039: aload_0
		// @03A: getfield int game.C_100271_mj.field_103442_X
		// @03D: isub
		// @03E: istore #12
		// @040: aload_0
		// @041: getfield game.C_100112_r game.C_100271_mj.field_103436_Q
		// @044: aload #11
		// @046: iload #12
		// @048: aload_0
		// @049: getfield game.C_100112_r game.C_100271_mj.field_103436_Q
		// @04C: getfield int game.C_100112_r.field_101772_Q
		// @04F: invokevirtual game.C_100112_r.func_101734_a(java.lang.String, int, int)int
		// @052: iconst_2
		// @053: aload_0
		// @054: getfield int game.C_100271_mj.field_103442_X
		// @057: imul
		// @058: ineg
		// @059: isub
		// @05A: istore #13
		// @05C: iload #4
		// @05E: iload #13
		// @060: if_icmplt @06D
		// @063: iload #4
		// @065: istore #13
		// @067: getstatic int game.SteelSentinels.field_105275_O
		// @06A: ifeq @07C
		// @06D: aload_0
		// @06E: iload #13
		// @070: iload_2
		// @071: iload_1
		// @072: iload_3
		// @073: bipush 54 (0x36)
		// @075: invokevirtual game.C_100271_mj.func_102524_a(int, int, int, int, byte)void
		// @078: goto @07C
		// @07B: athrow
		// @07C: aload_0
		// @07D: getfield boolean game.C_100271_mj.field_103439_R
		// @080: ifeq @088
		// @083: iconst_0
		// @084: goto @093
		// @087: athrow
		// @088: aload_0
		// @089: getfield int game.C_100271_mj.field_103441_Y
		// @08C: aload_0
		// @08D: getfield int game.C_100271_mj.field_103442_X
		// @090: iconst_2
		// @091: imul
		// @092: iadd
		// @093: istore #14
		// @095: aload_0
		// @096: getfield game.C_100336_im game.C_100271_mj.field_103351_J
		// @099: iload #4
		// @09B: aload_0
		// @09C: getfield int game.C_100271_mj.field_103442_X
		// @09F: iconst_2
		// @0A0: imul
		// @0A1: isub
		// @0A2: iload #13
		// @0A4: iload #4
		// @0A6: isub
		// @0A7: ldc_w -600113791 (0xdc3afd81)
		// @0AA: ishr
		// @0AB: aload_0
		// @0AC: getfield int game.C_100271_mj.field_103442_X
		// @0AF: iadd
		// @0B0: iload #14
		// @0B2: aload_0
		// @0B3: getfield int game.C_100271_mj.field_103441_Y
		// @0B6: ineg
		// @0B7: iload_3
		// @0B8: iadd
		// @0B9: iconst_3
		// @0BA: aload_0
		// @0BB: getfield int game.C_100271_mj.field_103442_X
		// @0BE: imul
		// @0BF: isub
		// @0C0: bipush 59 (0x3B)
		// @0C2: invokevirtual game.C_100336_im.func_102524_a(int, int, int, int, byte)void
		// @0C5: goto @181
		// @0C8: astore #12
		// @0CA: aload #12
		// @0CC: new java.lang.StringBuilder
		// @0CF: dup
		// @0D0: invokespecial java.lang.StringBuilder.<init>()void
		// @0D3: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @0D6: bipush 24 (0x18)
		// @0D8: aaload
		// @0D9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0DC: iload_1
		// @0DD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E0: bipush 44 (0x2C)
		// @0E2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E5: iload_2
		// @0E6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E9: bipush 44 (0x2C)
		// @0EB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0EE: iload_3
		// @0EF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F2: bipush 44 (0x2C)
		// @0F4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F7: iload #4
		// @0F9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0FC: bipush 44 (0x2C)
		// @0FE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @101: aload #5
		// @103: ifnull @10F
		// @106: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @109: iconst_2
		// @10A: aaload
		// @10B: goto @114
		// @10E: athrow
		// @10F: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @112: iconst_1
		// @113: aaload
		// @114: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @117: bipush 44 (0x2C)
		// @119: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @11C: iload #6
		// @11E: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @121: bipush 44 (0x2C)
		// @123: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @126: iload #7
		// @128: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @12B: bipush 44 (0x2C)
		// @12D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @130: iload #8
		// @132: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @135: bipush 44 (0x2C)
		// @137: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13A: aload #9
		// @13C: ifnull @148
		// @13F: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @142: iconst_2
		// @143: aaload
		// @144: goto @14D
		// @147: athrow
		// @148: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @14B: iconst_1
		// @14C: aaload
		// @14D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @150: bipush 44 (0x2C)
		// @152: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @155: iload #10
		// @157: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @15A: bipush 44 (0x2C)
		// @15C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @15F: aload #11
		// @161: ifnull @16D
		// @164: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @167: iconst_2
		// @168: aaload
		// @169: goto @172
		// @16C: athrow
		// @16D: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @170: iconst_1
		// @171: aaload
		// @172: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @175: bipush 41 (0x29)
		// @177: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @17D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @180: athrow
		// @181: return
	}
	
	final void func_102528_a(int arg0, int arg1, int arg2, byte arg3)
	{
		// @00: iload_3
		// @01: aload_0
		// @02: getfield int game.C_100271_mj.field_102538_m
		// @05: iadd
		// @06: istore #5
		// @08: aload_0
		// @09: getfield int game.C_100271_mj.field_102541_w
		// @0C: iload_2
		// @0D: iadd
		// @0E: istore #6
		// @10: aload_0
		// @11: iload_1
		// @12: iload_2
		// @13: iload_3
		// @14: bipush -127 (0x81)
		// @16: invokespecial game.C_100030_gm.func_102528_a(int, int, int, byte)void
		// @19: iload_1
		// @1A: iconst_m1
		// @1B: ixor
		// @1C: iconst_m1
		// @1D: if_icmpne @24
		// @20: goto @25
		// @23: athrow
		// @24: return
		// @25: iload #4
		// @27: bipush -126 (0x82)
		// @29: if_icmple @37
		// @2C: aconst_null
		// @2D: checkcast game.C_100294_ki
		// @30: putstatic game.C_100294_ki game.C_100271_mj.field_103433_T
		// @33: goto @37
		// @36: athrow
		// @37: aload_0
		// @38: getfield boolean game.C_100271_mj.field_103439_R
		// @3B: ifne @43
		// @3E: iconst_0
		// @3F: goto @54
		// @42: athrow
		// @43: aload_0
		// @44: getfield int game.C_100271_mj.field_102537_l
		// @47: aload_0
		// @48: getfield int game.C_100271_mj.field_103441_Y
		// @4B: ineg
		// @4C: iadd
		// @4D: aload_0
		// @4E: getfield int game.C_100271_mj.field_103442_X
		// @51: iconst_2
		// @52: imul
		// @53: isub
		// @54: istore #7
		// @56: aload_0
		// @57: getfield game.C_100112_r game.C_100271_mj.field_103436_Q
		// @5A: aload_0
		// @5B: getfield java.lang.String game.C_100271_mj.field_103434_W
		// @5E: aload_0
		// @5F: getfield int game.C_100271_mj.field_103442_X
		// @62: iload #7
		// @64: iload #5
		// @66: iadd
		// @67: iadd
		// @68: iload #6
		// @6A: aload_0
		// @6B: getfield int game.C_100271_mj.field_103442_X
		// @6E: iadd
		// @6F: aload_0
		// @70: getfield int game.C_100271_mj.field_103441_Y
		// @73: aload_0
		// @74: getfield int game.C_100271_mj.field_103442_X
		// @77: ineg
		// @78: iadd
		// @79: aload_0
		// @7A: getfield int game.C_100271_mj.field_102544_t
		// @7D: aload_0
		// @7E: getfield int game.C_100271_mj.field_103442_X
		// @81: iconst_2
		// @82: imul
		// @83: isub
		// @84: aload_0
		// @85: getfield int game.C_100271_mj.field_103435_V
		// @88: iconst_m1
		// @89: aload_0
		// @8A: getfield boolean game.C_100271_mj.field_103439_R
		// @8D: ifeq @95
		// @90: iconst_0
		// @91: goto @96
		// @94: athrow
		// @95: iconst_2
		// @96: iconst_1
		// @97: aload_0
		// @98: getfield game.C_100112_r game.C_100271_mj.field_103436_Q
		// @9B: getfield int game.C_100112_r.field_101772_Q
		// @9E: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @A1: pop
		// @A2: goto @E4
		// @A5: astore #5
		// @A7: aload #5
		// @A9: new java.lang.StringBuilder
		// @AC: dup
		// @AD: invokespecial java.lang.StringBuilder.<init>()void
		// @B0: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @B3: iconst_3
		// @B4: aaload
		// @B5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B8: iload_1
		// @B9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BC: bipush 44 (0x2C)
		// @BE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C1: iload_2
		// @C2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C5: bipush 44 (0x2C)
		// @C7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CA: iload_3
		// @CB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CE: bipush 44 (0x2C)
		// @D0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D3: iload #4
		// @D5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D8: bipush 41 (0x29)
		// @DA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DD: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @E0: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @E3: athrow
		// @E4: return
	}
	
	public static void func_103426_a(boolean arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100208_qg game.C_100271_mj.field_103440_O
		// @04: aconst_null
		// @05: checkcast int[][]
		// @08: putstatic int[][] game.C_100271_mj.field_103438_S
		// @0B: iload_0
		// @0C: iconst_1
		// @0D: if_icmpeq @1E
		// @10: bipush -106 (0x96)
		// @12: aconst_null
		// @13: checkcast java.lang.CharSequence
		// @16: invokestatic game.C_100271_mj.func_103427_a(int, java.lang.CharSequence)long
		// @19: pop2
		// @1A: goto @1E
		// @1D: athrow
		// @1E: aconst_null
		// @1F: putstatic game.C_100294_ki game.C_100271_mj.field_103433_T
		// @22: goto @47
		// @25: astore_1
		// @26: aload_1
		// @27: new java.lang.StringBuilder
		// @2A: dup
		// @2B: invokespecial java.lang.StringBuilder.<init>()void
		// @2E: getstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @31: bipush 20 (0x14)
		// @33: aaload
		// @34: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @37: iload_0
		// @38: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @3B: bipush 41 (0x29)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @43: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @46: athrow
		// @47: return
	}
	
	static
	{
		// @000: bipush 25 (0x19)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc_w "\u001a/:\u0017\u0002"
		// @00A: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @00D: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @010: aastore
		// @011: dup
		// @012: iconst_1
		// @013: ldc "\u00190x:"
		// @015: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @018: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @01B: aastore
		// @01C: dup
		// @01D: iconst_2
		// @01E: ldc "\u000ck:xW"
		// @020: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @023: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @026: aastore
		// @027: dup
		// @028: iconst_3
		// @029: ldc_w "\u001a/:\u0015\u0002"
		// @02C: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @02F: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @032: aastore
		// @033: dup
		// @034: iconst_4
		// @035: ldc_w "\u001a/:\u0010\u0002"
		// @038: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @03B: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @03E: aastore
		// @03F: dup
		// @040: iconst_5
		// @041: ldc "$&f9F\u001b,z1\\\u001e c"
		// @043: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @046: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @049: aastore
		// @04A: dup
		// @04B: bipush 6 (0x06)
		// @04D: ldc "\u0012+s?D\u0012 f"
		// @04F: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @052: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @055: aastore
		// @056: dup
		// @057: bipush 7 (0x07)
		// @059: ldc "\u0015,z"
		// @05B: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @05E: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @061: aastore
		// @062: dup
		// @063: bipush 8 (0x08)
		// @065: ldc "K,y1\u0017A{"
		// @067: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @06A: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @06D: aastore
		// @06E: dup
		// @06F: bipush 9 (0x09)
		// @071: ldc "K,y1\u0017E{"
		// @073: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @076: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @079: aastore
		// @07A: dup
		// @07B: bipush 10 (0x0A)
		// @07D: ldc_w "\u001a/:\u001f\u0002"
		// @080: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @083: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @086: aastore
		// @087: dup
		// @088: bipush 11 (0x0B)
		// @08A: ldc ";,g\"Y\u0012)q5^\u0007$z3"
		// @08C: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @08F: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @092: aastore
		// @093: dup
		// @094: bipush 12 (0x0C)
		// @096: ldc_w "3$`7f\u001e6`\u0000C\u00122"
		// @099: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @09C: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @09F: aastore
		// @0A0: dup
		// @0A1: bipush 13 (0x0D)
		// @0A3: ldc ">1q;Z\u0016+q"
		// @0A5: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @0A8: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @0AB: aastore
		// @0AC: dup
		// @0AD: bipush 14 (0x0E)
		// @0AF: ldc "K,y1\u0017"
		// @0B1: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @0B4: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @0B7: aastore
		// @0B8: dup
		// @0B9: bipush 15 (0x0F)
		// @0BB: ldc_w "$&f9F\u001b,z1\\\u001e cd"
		// @0BE: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @0C1: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @0C4: aastore
		// @0C5: dup
		// @0C6: bipush 16 (0x10)
		// @0C8: ldc "3$`7\\\u001e c"
		// @0CA: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @0CD: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @0D0: aastore
		// @0D1: dup
		// @0D2: bipush 17 (0x11)
		// @0D4: ldc "K,y1\u0017D{"
		// @0D6: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @0D9: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @0DC: aastore
		// @0DD: dup
		// @0DE: bipush 18 (0x12)
		// @0E0: ldc "0\nP\u0003f2"
		// @0E2: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @0E5: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @0E8: aastore
		// @0E9: dup
		// @0EA: bipush 19 (0x13)
		// @0EC: ldc_w "\u001a/:\u0014\u0002"
		// @0EF: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @0F2: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @0F5: aastore
		// @0F6: dup
		// @0F7: bipush 20 (0x14)
		// @0F9: ldc_w "\u001a/:\u001e\u0002"
		// @0FC: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @0FF: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @102: aastore
		// @103: dup
		// @104: bipush 21 (0x15)
		// @106: ldc_w "\u001a/:\u0013\u0002"
		// @109: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @10C: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @10F: aastore
		// @110: dup
		// @111: bipush 22 (0x16)
		// @113: ldc_w "\u001a/:\u0012\u0002"
		// @116: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @119: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @11C: aastore
		// @11D: dup
		// @11E: bipush 23 (0x17)
		// @120: ldc "\u001a/:\u0011\u0002"
		// @122: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @125: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @128: aastore
		// @129: dup
		// @12A: bipush 24 (0x18)
		// @12C: ldc_w "\u001a/:jC\u0019,`h\u0002"
		// @12F: invokestatic game.C_100271_mj.func_103425_z(java.lang.String)char[]
		// @132: invokestatic game.C_100271_mj.func_103424_z(char[])java.lang.String
		// @135: aastore
		// @136: putstatic java.lang.String[] game.C_100271_mj.field_103443_Z
		// @139: bipush 8 (0x08)
		// @13B: anewarray int[]
		// @13E: dup
		// @13F: iconst_0
		// @140: iconst_4
		// @141: newarray int[]
		// @143: dup
		// @144: iconst_0
		// @145: iconst_2
		// @146: iastore
		// @147: dup
		// @148: iconst_1
		// @149: iconst_1
		// @14A: iastore
		// @14B: dup
		// @14C: iconst_2
		// @14D: iconst_1
		// @14E: iastore
		// @14F: dup
		// @150: iconst_3
		// @151: iconst_0
		// @152: iastore
		// @153: aastore
		// @154: dup
		// @155: iconst_1
		// @156: iconst_4
		// @157: newarray int[]
		// @159: dup
		// @15A: iconst_0
		// @15B: iconst_2
		// @15C: iastore
		// @15D: dup
		// @15E: iconst_1
		// @15F: iconst_2
		// @160: iastore
		// @161: dup
		// @162: iconst_2
		// @163: iconst_1
		// @164: iastore
		// @165: dup
		// @166: iconst_3
		// @167: iconst_0
		// @168: iastore
		// @169: aastore
		// @16A: dup
		// @16B: iconst_2
		// @16C: iconst_4
		// @16D: newarray int[]
		// @16F: dup
		// @170: iconst_0
		// @171: iconst_2
		// @172: iastore
		// @173: dup
		// @174: iconst_1
		// @175: iconst_3
		// @176: iastore
		// @177: dup
		// @178: iconst_2
		// @179: iconst_1
		// @17A: iastore
		// @17B: dup
		// @17C: iconst_3
		// @17D: iconst_0
		// @17E: iastore
		// @17F: aastore
		// @180: dup
		// @181: iconst_3
		// @182: iconst_4
		// @183: newarray int[]
		// @185: dup
		// @186: iconst_0
		// @187: iconst_2
		// @188: iastore
		// @189: dup
		// @18A: iconst_1
		// @18B: iconst_4
		// @18C: iastore
		// @18D: dup
		// @18E: iconst_2
		// @18F: iconst_1
		// @190: iastore
		// @191: dup
		// @192: iconst_3
		// @193: iconst_0
		// @194: iastore
		// @195: aastore
		// @196: dup
		// @197: iconst_4
		// @198: iconst_4
		// @199: newarray int[]
		// @19B: dup
		// @19C: iconst_0
		// @19D: iconst_2
		// @19E: iastore
		// @19F: dup
		// @1A0: iconst_1
		// @1A1: iconst_5
		// @1A2: iastore
		// @1A3: dup
		// @1A4: iconst_2
		// @1A5: iconst_1
		// @1A6: iastore
		// @1A7: dup
		// @1A8: iconst_3
		// @1A9: iconst_0
		// @1AA: iastore
		// @1AB: aastore
		// @1AC: dup
		// @1AD: iconst_5
		// @1AE: iconst_4
		// @1AF: newarray int[]
		// @1B1: dup
		// @1B2: iconst_0
		// @1B3: iconst_2
		// @1B4: iastore
		// @1B5: dup
		// @1B6: iconst_1
		// @1B7: iconst_3
		// @1B8: iastore
		// @1B9: dup
		// @1BA: iconst_2
		// @1BB: iconst_1
		// @1BC: iastore
		// @1BD: dup
		// @1BE: iconst_3
		// @1BF: iconst_1
		// @1C0: iastore
		// @1C1: aastore
		// @1C2: dup
		// @1C3: bipush 6 (0x06)
		// @1C5: iconst_4
		// @1C6: newarray int[]
		// @1C8: dup
		// @1C9: iconst_0
		// @1CA: iconst_2
		// @1CB: iastore
		// @1CC: dup
		// @1CD: iconst_1
		// @1CE: iconst_4
		// @1CF: iastore
		// @1D0: dup
		// @1D1: iconst_2
		// @1D2: iconst_1
		// @1D3: iastore
		// @1D4: dup
		// @1D5: iconst_3
		// @1D6: iconst_1
		// @1D7: iastore
		// @1D8: aastore
		// @1D9: dup
		// @1DA: bipush 7 (0x07)
		// @1DC: iconst_4
		// @1DD: newarray int[]
		// @1DF: dup
		// @1E0: iconst_0
		// @1E1: iconst_2
		// @1E2: iastore
		// @1E3: dup
		// @1E4: iconst_1
		// @1E5: iconst_5
		// @1E6: iastore
		// @1E7: dup
		// @1E8: iconst_2
		// @1E9: iconst_1
		// @1EA: iastore
		// @1EB: dup
		// @1EC: iconst_3
		// @1ED: iconst_1
		// @1EE: iastore
		// @1EF: aastore
		// @1F0: putstatic int[][] game.C_100271_mj.field_103438_S
		// @1F3: return
	}
	
	private static char[] func_103425_z(String arg0)
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
		// @0E: bipush 42 (0x2A)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103424_z(char[] arg0)
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
		// @30: bipush 119 (0x77)
		// @32: goto @46
		// @35: bipush 69 (0x45)
		// @37: goto @46
		// @3A: bipush 20 (0x14)
		// @3C: goto @46
		// @3F: bipush 86 (0x56)
		// @41: goto @46
		// @44: bipush 42 (0x2A)
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
