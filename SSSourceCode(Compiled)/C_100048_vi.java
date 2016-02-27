package game;

final class C_100048_vi
{
	static String field_104175_c;
	int field_104170_f;
	static int field_104186_q;
	int field_104177_n;
	private int field_104183_h;
	int field_104173_e;
	boolean field_104185_r;
	int field_104178_o;
	private int field_104180_m;
	static String field_104184_i;
	boolean field_104172_d;
	private boolean field_104181_j;
	private int field_104179_l;
	private int field_104171_g;
	int field_104176_a;
	private C_100314_lf field_104174_b;
	private int field_104182_k;
	private int field_104187_p;
	private static final String[] field_104188_z;
	
	private final void func_104163_a(int arg0, C_100087_n arg1)
	{
		// @000: aload_0
		// @001: getfield int game.C_100048_vi.field_104176_a
		// @004: ineg
		// @005: aload_2
		// @006: getfield int game.C_100087_n.field_100699_t
		// @009: iadd
		// @00A: ldc -1879034876 (0x90003404)
		// @00C: ishr
		// @00D: istore_3
		// @00E: aload_0
		// @00F: getfield int game.C_100048_vi.field_104178_o
		// @012: ineg
		// @013: aload_2
		// @014: getfield int game.C_100087_n.field_100698_u
		// @017: iadd
		// @018: ldc -561911484 (0xde81e944)
		// @01A: ishr
		// @01B: istore #4
		// @01D: bipush -84 (0xAC)
		// @01F: iload_3
		// @020: iload_3
		// @021: imul
		// @022: iload #4
		// @024: iload #4
		// @026: imul
		// @027: ineg
		// @028: isub
		// @029: invokestatic game.C_100119_ua.func_104896_a(byte, int)int
		// @02C: istore #5
		// @02E: iconst_0
		// @02F: iload #5
		// @031: if_icmpge @0F4
		// @034: bipush 32 (0x20)
		// @036: aload_0
		// @037: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @03A: getfield int game.C_100314_lf.field_101334_V
		// @03D: imul
		// @03E: istore #6
		// @040: aload_0
		// @041: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @044: getfield int game.C_100314_lf.field_101334_V
		// @047: iconst_m1
		// @048: ixor
		// @049: bipush -6 (0xFA)
		// @04B: if_icmple @05A
		// @04E: aload_0
		// @04F: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @052: getfield int game.C_100314_lf.field_101412_Kb
		// @055: bipush 16 (0x10)
		// @057: imul
		// @058: istore #6
		// @05A: sipush -641 (0xFD7F)
		// @05D: iload #6
		// @05F: iconst_m1
		// @060: ixor
		// @061: if_icmpgt @068
		// @064: goto @06D
		// @067: athrow
		// @068: sipush 640 (0x0280)
		// @06B: istore #6
		// @06D: aload_0
		// @06E: getfield boolean game.C_100048_vi.field_104185_r
		// @071: ifne @078
		// @074: goto @096
		// @077: athrow
		// @078: aload_0
		// @079: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @07C: getfield int game.C_100314_lf.field_101412_Kb
		// @07F: bipush 15 (0x0F)
		// @081: if_icmpge @08F
		// @084: aload_0
		// @085: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @088: getfield int game.C_100314_lf.field_101412_Kb
		// @08B: goto @091
		// @08E: athrow
		// @08F: bipush 15 (0x0F)
		// @091: bipush 32 (0x20)
		// @093: imul
		// @094: istore #6
		// @096: aload_0
		// @097: getfield boolean game.C_100048_vi.field_104172_d
		// @09A: ifne @0A1
		// @09D: goto @0C0
		// @0A0: athrow
		// @0A1: bipush 32 (0x20)
		// @0A3: aload_0
		// @0A4: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @0A7: getfield int game.C_100314_lf.field_101334_V
		// @0AA: imul
		// @0AB: iload #6
		// @0AD: if_icmpgt @0B4
		// @0B0: goto @0C0
		// @0B3: athrow
		// @0B4: bipush 32 (0x20)
		// @0B6: aload_0
		// @0B7: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @0BA: getfield int game.C_100314_lf.field_101334_V
		// @0BD: imul
		// @0BE: istore #6
		// @0C0: iload #5
		// @0C2: iconst_2
		// @0C3: idiv
		// @0C4: iload #6
		// @0C6: if_icmplt @0CD
		// @0C9: goto @0D3
		// @0CC: athrow
		// @0CD: iload #5
		// @0CF: iconst_2
		// @0D0: idiv
		// @0D1: istore #6
		// @0D3: aload_0
		// @0D4: iconst_0
		// @0D5: putfield int game.C_100048_vi.field_104187_p
		// @0D8: aload_0
		// @0D9: iload #4
		// @0DB: iload #6
		// @0DD: imul
		// @0DE: iload #5
		// @0E0: idiv
		// @0E1: putfield int game.C_100048_vi.field_104183_h
		// @0E4: aload_0
		// @0E5: iload_3
		// @0E6: iload #6
		// @0E8: imul
		// @0E9: iload #5
		// @0EB: idiv
		// @0EC: putfield int game.C_100048_vi.field_104182_k
		// @0EF: aload_0
		// @0F0: iconst_0
		// @0F1: putfield boolean game.C_100048_vi.field_104172_d
		// @0F4: iload_1
		// @0F5: sipush -5591 (0xEA29)
		// @0F8: if_icmpeq @105
		// @0FB: aload_0
		// @0FC: bipush -33 (0xDF)
		// @0FE: putfield int game.C_100048_vi.field_104173_e
		// @101: goto @105
		// @104: athrow
		// @105: goto @144
		// @108: astore_3
		// @109: aload_3
		// @10A: new java.lang.StringBuilder
		// @10D: dup
		// @10E: invokespecial java.lang.StringBuilder.<init>()void
		// @111: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @114: bipush 6 (0x06)
		// @116: aaload
		// @117: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @11A: iload_1
		// @11B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @11E: bipush 44 (0x2C)
		// @120: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @123: aload_2
		// @124: ifnull @130
		// @127: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @12A: iconst_0
		// @12B: aaload
		// @12C: goto @135
		// @12F: athrow
		// @130: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @133: iconst_2
		// @134: aaload
		// @135: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @138: bipush 41 (0x29)
		// @13A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @140: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @143: athrow
		// @144: return
	}
	
	static final int func_104160_a(int arg0)
	{
		// @00: iload_0
		// @01: bipush 121 (0x79)
		// @03: if_icmpge @09
		// @06: bipush 127 (0x7F)
		// @08: ireturn
		// @09: getstatic int game.C_100012_fh.field_100514_J
		// @0C: ireturn
		// @0D: astore_1
		// @0E: aload_1
		// @0F: new java.lang.StringBuilder
		// @12: dup
		// @13: invokespecial java.lang.StringBuilder.<init>()void
		// @16: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @19: bipush 8 (0x08)
		// @1B: aaload
		// @1C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1F: iload_0
		// @20: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @23: bipush 41 (0x29)
		// @25: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @28: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2E: athrow
	}
	
	final C_100018_wk func_104167_a(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #21
		// @005: iconst_2
		// @006: istore #8
		// @008: iload_2
		// @009: iconst_m1
		// @00A: ixor
		// @00B: bipush -19 (0xED)
		// @00D: if_icmpeq @050
		// @010: bipush -30 (0xE2)
		// @012: iload_2
		// @013: iconst_m1
		// @014: ixor
		// @015: if_icmpeq @050
		// @018: goto @01C
		// @01B: athrow
		// @01C: bipush -44 (0xD4)
		// @01E: iload_2
		// @01F: iconst_m1
		// @020: ixor
		// @021: if_icmpeq @050
		// @024: goto @028
		// @027: athrow
		// @028: iload_2
		// @029: bipush 21 (0x15)
		// @02B: if_icmpeq @050
		// @02E: goto @032
		// @031: athrow
		// @032: bipush 34 (0x22)
		// @034: iload_2
		// @035: if_icmpeq @050
		// @038: goto @03C
		// @03B: athrow
		// @03C: bipush 47 (0x2F)
		// @03E: iload_2
		// @03F: if_icmpeq @050
		// @042: goto @046
		// @045: athrow
		// @046: iload_2
		// @047: bipush 52 (0x34)
		// @049: if_icmpne @115
		// @04C: goto @050
		// @04F: athrow
		// @050: aconst_null
		// @051: aload_0
		// @052: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @055: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @058: if_acmpeq @115
		// @05B: goto @05F
		// @05E: athrow
		// @05F: aload_0
		// @060: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @063: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @066: getfield int game.C_100314_lf.field_101377_tc
		// @069: istore_1
		// @06A: aload_0
		// @06B: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @06E: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @071: getfield int game.C_100314_lf.field_101299_xc
		// @074: ldc -1889448317 (0x8f614e83)
		// @076: ishl
		// @077: ineg
		// @078: aload_0
		// @079: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @07C: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @07F: getfield int game.C_100314_lf.field_101395_rc
		// @082: iadd
		// @083: istore #4
		// @085: iload_1
		// @086: aload_0
		// @087: getfield int game.C_100048_vi.field_104176_a
		// @08A: isub
		// @08B: istore #9
		// @08D: iload #4
		// @08F: iload #5
		// @091: isub
		// @092: istore #10
		// @094: iconst_m1
		// @095: iload #9
		// @097: iconst_m1
		// @098: ixor
		// @099: if_icmpge @0AA
		// @09C: aload_0
		// @09D: iconst_m1
		// @09E: putfield int game.C_100048_vi.field_104170_f
		// @0A1: iload #21
		// @0A3: ifeq @0B3
		// @0A6: goto @0AA
		// @0A9: athrow
		// @0AA: aload_0
		// @0AB: iconst_1
		// @0AC: putfield int game.C_100048_vi.field_104170_f
		// @0AF: goto @0B3
		// @0B2: athrow
		// @0B3: aload_0
		// @0B4: getfield int game.C_100048_vi.field_104170_f
		// @0B7: iconst_m1
		// @0B8: ixor
		// @0B9: aload_0
		// @0BA: getfield int game.C_100048_vi.field_104187_p
		// @0BD: iconst_m1
		// @0BE: ixor
		// @0BF: if_icmpne @0C6
		// @0C2: goto @0CB
		// @0C5: athrow
		// @0C6: aload_0
		// @0C7: iconst_0
		// @0C8: putfield int game.C_100048_vi.field_104187_p
		// @0CB: iload #9
		// @0CD: i2d
		// @0CE: iload #10
		// @0D0: ineg
		// @0D1: i2d
		// @0D2: invokestatic java.lang.Math.atan2(double, double)double
		// @0D5: dstore #11
		// @0D7: ldc2_w 65536.0
		// @0DA: dload #11
		// @0DC: dmul
		// @0DD: ldc2_w 6.283185307179586
		// @0E0: ddiv
		// @0E1: d2i
		// @0E2: istore_3
		// @0E3: aload_0
		// @0E4: getfield int game.C_100048_vi.field_104170_f
		// @0E7: ifge @105
		// @0EA: iload_3
		// @0EB: iconst_m1
		// @0EC: ixor
		// @0ED: sipush -16385 (0xBFFF)
		// @0F0: if_icmplt @0FB
		// @0F3: goto @0F7
		// @0F6: athrow
		// @0F7: goto @115
		// @0FA: athrow
		// @0FB: iload_3
		// @0FC: ldc 65536 (0x10000)
		// @0FE: isub
		// @0FF: istore_3
		// @100: iload #21
		// @102: ifeq @115
		// @105: sipush -16384 (0xC000)
		// @108: iload_3
		// @109: if_icmple @115
		// @10C: goto @110
		// @10F: athrow
		// @110: iload_3
		// @111: ldc 65536 (0x10000)
		// @113: iadd
		// @114: istore_3
		// @115: iload_1
		// @116: aload_0
		// @117: getfield int game.C_100048_vi.field_104176_a
		// @11A: ineg
		// @11B: iadd
		// @11C: istore #9
		// @11E: aload_0
		// @11F: getfield int game.C_100048_vi.field_104178_o
		// @122: ineg
		// @123: iload #4
		// @125: iadd
		// @126: istore #10
		// @128: iconst_0
		// @129: iload #9
		// @12B: if_icmple @13C
		// @12E: aload_0
		// @12F: iconst_m1
		// @130: putfield int game.C_100048_vi.field_104170_f
		// @133: iload #21
		// @135: ifeq @145
		// @138: goto @13C
		// @13B: athrow
		// @13C: aload_0
		// @13D: iconst_1
		// @13E: putfield int game.C_100048_vi.field_104170_f
		// @141: goto @145
		// @144: athrow
		// @145: aload_0
		// @146: getfield int game.C_100048_vi.field_104170_f
		// @149: aload_0
		// @14A: getfield int game.C_100048_vi.field_104187_p
		// @14D: if_icmpeq @159
		// @150: aload_0
		// @151: iconst_0
		// @152: putfield int game.C_100048_vi.field_104187_p
		// @155: goto @159
		// @158: athrow
		// @159: iconst_0
		// @15A: istore #11
		// @15C: iload #7
		// @15E: istore #11
		// @160: iconst_0
		// @161: istore #12
		// @163: iload_2
		// @164: iconst_m1
		// @165: ixor
		// @166: bipush -18 (0xEE)
		// @168: if_icmpeq @16F
		// @16B: goto @172
		// @16E: athrow
		// @16F: iconst_5
		// @170: istore #8
		// @172: iload #5
		// @174: istore #12
		// @176: iload_2
		// @177: iconst_m1
		// @178: ixor
		// @179: bipush -19 (0xED)
		// @17B: if_icmpne @181
		// @17E: iconst_0
		// @17F: istore #8
		// @181: bipush -20 (0xEC)
		// @183: iload_2
		// @184: iconst_m1
		// @185: ixor
		// @186: if_icmpne @18C
		// @189: iconst_1
		// @18A: istore #8
		// @18C: bipush -21 (0xEB)
		// @18E: iload_2
		// @18F: iconst_m1
		// @190: ixor
		// @191: if_icmpne @198
		// @194: bipush 6 (0x06)
		// @196: istore #8
		// @198: bipush 21 (0x15)
		// @19A: iload_2
		// @19B: if_icmpeq @1A2
		// @19E: goto @1A5
		// @1A1: athrow
		// @1A2: iconst_4
		// @1A3: istore #8
		// @1A5: bipush 22 (0x16)
		// @1A7: iload_2
		// @1A8: if_icmpeq @1AF
		// @1AB: goto @1B3
		// @1AE: athrow
		// @1AF: bipush 7 (0x07)
		// @1B1: istore #8
		// @1B3: iload_2
		// @1B4: iconst_m1
		// @1B5: ixor
		// @1B6: bipush -24 (0xE8)
		// @1B8: if_icmpne @1BE
		// @1BB: iconst_3
		// @1BC: istore #8
		// @1BE: iload_2
		// @1BF: iconst_m1
		// @1C0: ixor
		// @1C1: bipush -25 (0xE7)
		// @1C3: if_icmpne @1C9
		// @1C6: iconst_2
		// @1C7: istore #8
		// @1C9: bipush -26 (0xE6)
		// @1CB: iload_2
		// @1CC: iconst_m1
		// @1CD: ixor
		// @1CE: if_icmpne @1D4
		// @1D1: iconst_2
		// @1D2: istore #8
		// @1D4: bipush -27 (0xE5)
		// @1D6: iload_2
		// @1D7: iconst_m1
		// @1D8: ixor
		// @1D9: if_icmpeq @1E0
		// @1DC: goto @1E3
		// @1DF: athrow
		// @1E0: iconst_2
		// @1E1: istore #8
		// @1E3: iload_2
		// @1E4: iconst_m1
		// @1E5: ixor
		// @1E6: bipush -28 (0xE4)
		// @1E8: if_icmpne @1EE
		// @1EB: iconst_4
		// @1EC: istore #8
		// @1EE: bipush -39 (0xD9)
		// @1F0: iload_2
		// @1F1: iconst_m1
		// @1F2: ixor
		// @1F3: if_icmpeq @1FA
		// @1F6: goto @1FD
		// @1F9: athrow
		// @1FA: iconst_4
		// @1FB: istore #8
		// @1FD: bipush 28 (0x1C)
		// @1FF: iload_2
		// @200: if_icmpne @206
		// @203: iconst_5
		// @204: istore #8
		// @206: iload_2
		// @207: bipush 29 (0x1D)
		// @209: if_icmpne @20F
		// @20C: iconst_0
		// @20D: istore #8
		// @20F: bipush -31 (0xE1)
		// @211: iload_2
		// @212: iconst_m1
		// @213: ixor
		// @214: if_icmpeq @21B
		// @217: goto @21E
		// @21A: athrow
		// @21B: iconst_1
		// @21C: istore #8
		// @21E: iload_2
		// @21F: bipush 31 (0x1F)
		// @221: if_icmpne @227
		// @224: iconst_1
		// @225: istore #8
		// @227: bipush 32 (0x20)
		// @229: iload_2
		// @22A: if_icmpeq @231
		// @22D: goto @234
		// @230: athrow
		// @231: iconst_1
		// @232: istore #8
		// @234: iload_2
		// @235: bipush 33 (0x21)
		// @237: if_icmpne @23E
		// @23A: bipush 6 (0x06)
		// @23C: istore #8
		// @23E: bipush -35 (0xDD)
		// @240: iload_2
		// @241: iconst_m1
		// @242: ixor
		// @243: if_icmpne @249
		// @246: iconst_4
		// @247: istore #8
		// @249: bipush 35 (0x23)
		// @24B: iload_2
		// @24C: if_icmpeq @253
		// @24F: goto @257
		// @252: athrow
		// @253: bipush 7 (0x07)
		// @255: istore #8
		// @257: iload_2
		// @258: bipush 36 (0x24)
		// @25A: if_icmpeq @261
		// @25D: goto @264
		// @260: athrow
		// @261: iconst_2
		// @262: istore #8
		// @264: bipush -38 (0xDA)
		// @266: iload_2
		// @267: iconst_m1
		// @268: ixor
		// @269: if_icmpeq @270
		// @26C: goto @273
		// @26F: athrow
		// @270: iconst_2
		// @271: istore #8
		// @273: iload_2
		// @274: bipush 46 (0x2E)
		// @276: if_icmpeq @27D
		// @279: goto @281
		// @27C: athrow
		// @27D: bipush 6 (0x06)
		// @27F: istore #8
		// @281: iload_2
		// @282: bipush 43 (0x2B)
		// @284: if_icmpeq @28B
		// @287: goto @28E
		// @28A: athrow
		// @28B: iconst_0
		// @28C: istore #8
		// @28E: bipush -45 (0xD3)
		// @290: iload_2
		// @291: iconst_m1
		// @292: ixor
		// @293: if_icmpne @299
		// @296: iconst_1
		// @297: istore #8
		// @299: bipush 47 (0x2F)
		// @29B: iload_2
		// @29C: if_icmpeq @2A3
		// @29F: goto @2A6
		// @2A2: athrow
		// @2A3: iconst_4
		// @2A4: istore #8
		// @2A6: bipush 45 (0x2D)
		// @2A8: iload_2
		// @2A9: if_icmpne @2AF
		// @2AC: iconst_1
		// @2AD: istore #8
		// @2AF: iload_2
		// @2B0: iconst_m1
		// @2B1: ixor
		// @2B2: bipush -49 (0xCF)
		// @2B4: if_icmpeq @2BB
		// @2B7: goto @2BF
		// @2BA: athrow
		// @2BB: bipush 7 (0x07)
		// @2BD: istore #8
		// @2BF: iload_2
		// @2C0: bipush 52 (0x34)
		// @2C2: if_icmpeq @2C9
		// @2C5: goto @2CC
		// @2C8: athrow
		// @2C9: iconst_4
		// @2CA: istore #8
		// @2CC: iload_2
		// @2CD: iconst_m1
		// @2CE: ixor
		// @2CF: bipush -52 (0xCC)
		// @2D1: if_icmpeq @2D8
		// @2D4: goto @2DB
		// @2D7: athrow
		// @2D8: iconst_3
		// @2D9: istore #8
		// @2DB: bipush -51 (0xCD)
		// @2DD: iload_2
		// @2DE: iconst_m1
		// @2DF: ixor
		// @2E0: if_icmpne @2E6
		// @2E3: iconst_2
		// @2E4: istore #8
		// @2E6: iload_2
		// @2E7: iconst_m1
		// @2E8: ixor
		// @2E9: bipush -50 (0xCE)
		// @2EB: if_icmpne @2F1
		// @2EE: iconst_2
		// @2EF: istore #8
		// @2F1: iload #10
		// @2F3: iload #10
		// @2F5: bipush 100 (0x64)
		// @2F7: idiv
		// @2F8: imul
		// @2F9: iload #9
		// @2FB: iload #9
		// @2FD: bipush 100 (0x64)
		// @2FF: idiv
		// @300: imul
		// @301: iadd
		// @302: i2d
		// @303: invokestatic java.lang.Math.sqrt(double)double
		// @306: ldc2_w 10.0
		// @309: dmul
		// @30A: d2i
		// @30B: istore #13
		// @30D: sipush 192 (0x00C0)
		// @310: istore #14
		// @312: iconst_0
		// @313: istore #15
		// @315: iconst_4
		// @316: istore #16
		// @318: bipush 45 (0x2D)
		// @31A: istore #17
		// @31C: bipush -19 (0xED)
		// @31E: iload_2
		// @31F: iconst_m1
		// @320: ixor
		// @321: if_icmpne @32B
		// @324: iinc #17 +236
		// @327: goto @32B
		// @32A: athrow
		// @32B: bipush -30 (0xE2)
		// @32D: iload_2
		// @32E: iconst_m1
		// @32F: ixor
		// @330: if_icmpne @33A
		// @333: iinc #17 +246
		// @336: goto @33A
		// @339: athrow
		// @33A: iload_2
		// @33B: bipush 43 (0x2B)
		// @33D: if_icmpne @347
		// @340: iinc #17 +251
		// @343: goto @347
		// @346: athrow
		// @347: bipush -6 (0xFA)
		// @349: iload #8
		// @34B: iconst_m1
		// @34C: ixor
		// @34D: if_icmpne @358
		// @350: bipush 45 (0x2D)
		// @352: istore #17
		// @354: bipush 7 (0x07)
		// @356: istore #15
		// @358: iconst_1
		// @359: istore #18
		// @35B: iload #8
		// @35D: iconst_1
		// @35E: if_icmpne @3A7
		// @361: sipush 256 (0x0100)
		// @364: istore #14
		// @366: iconst_1
		// @367: istore #15
		// @369: iconst_0
		// @36A: istore #16
		// @36C: iload_2
		// @36D: iconst_m1
		// @36E: ixor
		// @36F: bipush -20 (0xEC)
		// @371: if_icmpeq @39A
		// @374: iload_2
		// @375: bipush 31 (0x1F)
		// @377: if_icmpeq @38E
		// @37A: goto @37E
		// @37D: athrow
		// @37E: bipush -46 (0xD2)
		// @380: iload_2
		// @381: iconst_m1
		// @382: ixor
		// @383: if_icmpeq @38E
		// @386: goto @38A
		// @389: athrow
		// @38A: goto @39E
		// @38D: athrow
		// @38E: iconst_m1
		// @38F: iload_3
		// @390: invokestatic game.C_100200_ba.func_105846_a(int, int)int
		// @393: istore #14
		// @395: iload #21
		// @397: ifeq @39E
		// @39A: bipush 20 (0x14)
		// @39C: istore #15
		// @39E: bipush 32 (0x20)
		// @3A0: istore #18
		// @3A2: sipush 5000 (0x1388)
		// @3A5: istore #17
		// @3A7: bipush 7 (0x07)
		// @3A9: iload #8
		// @3AB: if_icmpne @3C4
		// @3AE: sipush 5000 (0x1388)
		// @3B1: istore #17
		// @3B3: sipush 192 (0x00C0)
		// @3B6: istore #14
		// @3B8: sipush 250 (0x00FA)
		// @3BB: istore #18
		// @3BD: bipush 6 (0x06)
		// @3BF: istore #15
		// @3C1: iconst_0
		// @3C2: istore #16
		// @3C4: iload #8
		// @3C6: iconst_m1
		// @3C7: ixor
		// @3C8: bipush -3 (0xFD)
		// @3CA: if_icmpeq @3D1
		// @3CD: goto @3E5
		// @3D0: athrow
		// @3D1: iconst_2
		// @3D2: istore #15
		// @3D4: sipush 250 (0x00FA)
		// @3D7: istore #18
		// @3D9: iconst_0
		// @3DA: istore #16
		// @3DC: bipush 16 (0x10)
		// @3DE: istore #14
		// @3E0: sipush 5000 (0x1388)
		// @3E3: istore #17
		// @3E5: iload #8
		// @3E7: iconst_3
		// @3E8: if_icmpne @400
		// @3EB: iconst_3
		// @3EC: istore #15
		// @3EE: bipush 20 (0x14)
		// @3F0: istore #16
		// @3F2: sipush 250 (0x00FA)
		// @3F5: istore #18
		// @3F7: sipush 5000 (0x1388)
		// @3FA: istore #17
		// @3FC: bipush 16 (0x10)
		// @3FE: istore #14
		// @400: bipush -5 (0xFB)
		// @402: iload #8
		// @404: iconst_m1
		// @405: ixor
		// @406: if_icmpne @41B
		// @409: iconst_4
		// @40A: istore #15
		// @40C: iconst_5
		// @40D: istore #17
		// @40F: sipush 256 (0x0100)
		// @412: istore #14
		// @414: bipush 32 (0x20)
		// @416: istore #16
		// @418: iconst_1
		// @419: istore #18
		// @41B: bipush 100 (0x64)
		// @41D: iconst_3
		// @41E: iload_3
		// @41F: ldc -847334077 (0xcd7eb543)
		// @421: ishr
		// @422: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @425: imul
		// @426: ldc -1334367984 (0xb0772910)
		// @428: ishr
		// @429: istore #9
		// @42B: iload #8
		// @42D: bipush 6 (0x06)
		// @42F: if_icmpne @444
		// @432: bipush 32 (0x20)
		// @434: istore #16
		// @436: iconst_1
		// @437: istore #18
		// @439: sipush 512 (0x0200)
		// @43C: istore #14
		// @43E: iconst_5
		// @43F: istore #17
		// @441: iconst_5
		// @442: istore #15
		// @444: iload #13
		// @446: iconst_m1
		// @447: ixor
		// @448: bipush -2 (0xFE)
		// @44A: if_icmpgt @451
		// @44D: goto @454
		// @450: athrow
		// @451: iconst_1
		// @452: istore #13
		// @454: bipush 100 (0x64)
		// @456: iload_3
		// @457: ldc 1588521539 (0x5eaeea43)
		// @459: ishr
		// @45A: iconst_0
		// @45B: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @45E: ineg
		// @45F: imul
		// @460: ldc -1750686832 (0x97a6a390)
		// @462: ishr
		// @463: istore #10
		// @465: bipush 100 (0x64)
		// @467: istore #13
		// @469: getstatic int[][] game.C_100137_bn.field_105040_j
		// @46C: bipush -17 (0xEF)
		// @46E: iload_2
		// @46F: iadd
		// @470: aaload
		// @471: ifnonnull @478
		// @474: goto @4DA
		// @477: athrow
		// @478: getstatic int[][] game.C_100137_bn.field_105040_j
		// @47B: iload_2
		// @47C: bipush -17 (0xEF)
		// @47E: iadd
		// @47F: aaload
		// @480: iconst_0
		// @481: iaload
		// @482: istore #19
		// @484: getstatic int[][] game.C_100137_bn.field_105040_j
		// @487: bipush -17 (0xEF)
		// @489: iload_2
		// @48A: iadd
		// @48B: aaload
		// @48C: iconst_1
		// @48D: iaload
		// @48E: istore #20
		// @490: iload #12
		// @492: iload #10
		// @494: iload #20
		// @496: bipush 32 (0x20)
		// @498: imul
		// @499: imul
		// @49A: iload #13
		// @49C: idiv
		// @49D: isub
		// @49E: istore #12
		// @4A0: iload #11
		// @4A2: iload #20
		// @4A4: iload #9
		// @4A6: imul
		// @4A7: bipush 32 (0x20)
		// @4A9: imul
		// @4AA: iload #13
		// @4AC: idiv
		// @4AD: isub
		// @4AE: istore #11
		// @4B0: iload #11
		// @4B2: aload_0
		// @4B3: getfield int game.C_100048_vi.field_104170_f
		// @4B6: iload #19
		// @4B8: iload #10
		// @4BA: bipush 32 (0x20)
		// @4BC: imul
		// @4BD: imul
		// @4BE: imul
		// @4BF: iload #13
		// @4C1: idiv
		// @4C2: isub
		// @4C3: istore #11
		// @4C5: iload #12
		// @4C7: aload_0
		// @4C8: getfield int game.C_100048_vi.field_104170_f
		// @4CB: iload #9
		// @4CD: iload #19
		// @4CF: bipush 32 (0x20)
		// @4D1: imul
		// @4D2: imul
		// @4D3: imul
		// @4D4: iload #13
		// @4D6: idiv
		// @4D7: iadd
		// @4D8: istore #12
		// @4DA: new game.C_100018_wk
		// @4DD: dup
		// @4DE: iload #11
		// @4E0: iload #12
		// @4E2: iload #14
		// @4E4: iload #9
		// @4E6: imul
		// @4E7: iload #13
		// @4E9: idiv
		// @4EA: iload #10
		// @4EC: iload #14
		// @4EE: imul
		// @4EF: iload #13
		// @4F1: idiv
		// @4F2: iload #17
		// @4F4: iload #16
		// @4F6: iload #15
		// @4F8: aload_0
		// @4F9: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @4FC: getfield game.C_100294_ki game.C_100314_lf.field_101350_l
		// @4FF: aload_0
		// @500: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @503: iconst_0
		// @504: iload #18
		// @506: iload_2
		// @507: bipush -17 (0xEF)
		// @509: iadd
		// @50A: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @50D: astore #19
		// @50F: aload #19
		// @511: iload #12
		// @513: bipush 100 (0x64)
		// @515: iload #10
		// @517: imul
		// @518: iadd
		// @519: putfield int game.C_100018_wk.field_101537_S
		// @51C: aload #19
		// @51E: iload #11
		// @520: iload #9
		// @522: bipush 100 (0x64)
		// @524: imul
		// @525: iadd
		// @526: putfield int game.C_100018_wk.field_101548_u
		// @529: aload #19
		// @52B: iconst_1
		// @52C: putfield boolean game.C_100018_wk.field_101513_E
		// @52F: iload #8
		// @531: iconst_m1
		// @532: ixor
		// @533: bipush -4 (0xFC)
		// @535: if_icmpne @549
		// @538: aload #19
		// @53A: iload #4
		// @53C: putfield int game.C_100018_wk.field_101537_S
		// @53F: aload #19
		// @541: iload_1
		// @542: putfield int game.C_100018_wk.field_101548_u
		// @545: goto @549
		// @548: athrow
		// @549: aload #19
		// @54B: iload #6
		// @54D: putfield boolean game.C_100018_wk.field_101547_v
		// @550: aload #19
		// @552: aconst_null
		// @553: putfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @556: aload #19
		// @558: aload #19
		// @55A: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @55D: ifnonnull @565
		// @560: aconst_null
		// @561: goto @56D
		// @564: athrow
		// @565: aload #19
		// @567: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @56A: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @56D: putfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @570: aload #19
		// @572: areturn
		// @573: astore #8
		// @575: aload #8
		// @577: new java.lang.StringBuilder
		// @57A: dup
		// @57B: invokespecial java.lang.StringBuilder.<init>()void
		// @57E: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @581: bipush 14 (0x0E)
		// @583: aaload
		// @584: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @587: iload_1
		// @588: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @58B: bipush 44 (0x2C)
		// @58D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @590: iload_2
		// @591: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @594: bipush 44 (0x2C)
		// @596: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @599: iload_3
		// @59A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @59D: bipush 44 (0x2C)
		// @59F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5A2: iload #4
		// @5A4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5A7: bipush 44 (0x2C)
		// @5A9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5AC: iload #5
		// @5AE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5B1: bipush 44 (0x2C)
		// @5B3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B6: iload #6
		// @5B8: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @5BB: bipush 44 (0x2C)
		// @5BD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C0: iload #7
		// @5C2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5C5: bipush 41 (0x29)
		// @5C7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5CA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5CD: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5D0: athrow
	}
	
	private final void func_104156_a(byte arg0, C_100327_ib arg1, C_100087_n arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #17
		// @005: iconst_2
		// @006: istore #4
		// @008: aload_2
		// @009: getfield int game.C_100327_ib.field_102494_P
		// @00C: iconst_m1
		// @00D: ixor
		// @00E: bipush -19 (0xED)
		// @010: if_icmpeq @063
		// @013: bipush -30 (0xE2)
		// @015: aload_2
		// @016: getfield int game.C_100327_ib.field_102494_P
		// @019: iconst_m1
		// @01A: ixor
		// @01B: if_icmpeq @063
		// @01E: goto @022
		// @021: athrow
		// @022: bipush 43 (0x2B)
		// @024: aload_2
		// @025: getfield int game.C_100327_ib.field_102494_P
		// @028: if_icmpeq @063
		// @02B: goto @02F
		// @02E: athrow
		// @02F: bipush 21 (0x15)
		// @031: aload_2
		// @032: getfield int game.C_100327_ib.field_102494_P
		// @035: if_icmpeq @063
		// @038: goto @03C
		// @03B: athrow
		// @03C: aload_2
		// @03D: getfield int game.C_100327_ib.field_102494_P
		// @040: bipush 34 (0x22)
		// @042: if_icmpeq @063
		// @045: goto @049
		// @048: athrow
		// @049: aload_2
		// @04A: getfield int game.C_100327_ib.field_102494_P
		// @04D: bipush 47 (0x2F)
		// @04F: if_icmpeq @063
		// @052: goto @056
		// @055: athrow
		// @056: aload_2
		// @057: getfield int game.C_100327_ib.field_102494_P
		// @05A: bipush 52 (0x34)
		// @05C: if_icmpne @197
		// @05F: goto @063
		// @062: athrow
		// @063: aload_0
		// @064: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @067: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @06A: ifnonnull @075
		// @06D: goto @071
		// @070: athrow
		// @071: goto @197
		// @074: athrow
		// @075: aload_3
		// @076: aload_0
		// @077: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @07A: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @07D: getfield int game.C_100314_lf.field_101377_tc
		// @080: putfield int game.C_100087_n.field_100699_t
		// @083: aload_3
		// @084: aload_0
		// @085: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @088: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @08B: getfield int game.C_100314_lf.field_101299_xc
		// @08E: ldc -1044697085 (0xc1bb3003)
		// @090: ishl
		// @091: ineg
		// @092: aload_0
		// @093: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @096: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @099: getfield int game.C_100314_lf.field_101395_rc
		// @09C: iadd
		// @09D: putfield int game.C_100087_n.field_100698_u
		// @0A0: aload_3
		// @0A1: getfield int game.C_100087_n.field_100699_t
		// @0A4: aload_0
		// @0A5: getfield int game.C_100048_vi.field_104176_a
		// @0A8: isub
		// @0A9: istore #5
		// @0AB: iconst_m1
		// @0AC: iload #5
		// @0AE: iconst_m1
		// @0AF: ixor
		// @0B0: if_icmpge @0C1
		// @0B3: aload_0
		// @0B4: iconst_m1
		// @0B5: putfield int game.C_100048_vi.field_104170_f
		// @0B8: iload #17
		// @0BA: ifeq @0CA
		// @0BD: goto @0C1
		// @0C0: athrow
		// @0C1: aload_0
		// @0C2: iconst_1
		// @0C3: putfield int game.C_100048_vi.field_104170_f
		// @0C6: goto @0CA
		// @0C9: athrow
		// @0CA: aload_3
		// @0CB: getfield int game.C_100087_n.field_100698_u
		// @0CE: aload_2
		// @0CF: getfield int game.C_100327_ib.field_102500_t
		// @0D2: isub
		// @0D3: istore #6
		// @0D5: aload_0
		// @0D6: getfield int game.C_100048_vi.field_104170_f
		// @0D9: iconst_m1
		// @0DA: ixor
		// @0DB: aload_0
		// @0DC: getfield int game.C_100048_vi.field_104187_p
		// @0DF: iconst_m1
		// @0E0: ixor
		// @0E1: if_icmpeq @0ED
		// @0E4: aload_0
		// @0E5: iconst_0
		// @0E6: putfield int game.C_100048_vi.field_104187_p
		// @0E9: goto @0ED
		// @0EC: athrow
		// @0ED: iload #5
		// @0EF: i2d
		// @0F0: iload #6
		// @0F2: ineg
		// @0F3: i2d
		// @0F4: invokestatic java.lang.Math.atan2(double, double)double
		// @0F7: dstore #7
		// @0F9: aload_3
		// @0FA: dload #7
		// @0FC: ldc2_w 65536.0
		// @0FF: dmul
		// @100: ldc2_w 6.283185307179586
		// @103: ddiv
		// @104: d2i
		// @105: putfield int game.C_100087_n.field_100693_m
		// @108: aload_0
		// @109: getfield int game.C_100048_vi.field_104170_f
		// @10C: iconst_m1
		// @10D: ixor
		// @10E: iconst_m1
		// @10F: if_icmple @134
		// @112: sipush 16384 (0x4000)
		// @115: aload_3
		// @116: getfield int game.C_100087_n.field_100693_m
		// @119: if_icmplt @124
		// @11C: goto @120
		// @11F: athrow
		// @120: goto @151
		// @123: athrow
		// @124: aload_3
		// @125: dup
		// @126: getfield int game.C_100087_n.field_100693_m
		// @129: ldc 65536 (0x10000)
		// @12B: isub
		// @12C: putfield int game.C_100087_n.field_100693_m
		// @12F: iload #17
		// @131: ifeq @151
		// @134: sipush -16384 (0xC000)
		// @137: aload_3
		// @138: getfield int game.C_100087_n.field_100693_m
		// @13B: if_icmpgt @146
		// @13E: goto @142
		// @141: athrow
		// @142: goto @151
		// @145: athrow
		// @146: aload_3
		// @147: dup
		// @148: getfield int game.C_100087_n.field_100693_m
		// @14B: ldc 65536 (0x10000)
		// @14D: iadd
		// @14E: putfield int game.C_100087_n.field_100693_m
		// @151: aload_0
		// @152: getfield int game.C_100048_vi.field_104170_f
		// @155: aload_3
		// @156: getfield int game.C_100087_n.field_100693_m
		// @159: imul
		// @15A: aload_2
		// @15B: getfield int game.C_100327_ib.field_102480_G
		// @15E: if_icmpge @172
		// @161: aload_3
		// @162: aload_2
		// @163: getfield int game.C_100327_ib.field_102480_G
		// @166: aload_0
		// @167: getfield int game.C_100048_vi.field_104170_f
		// @16A: imul
		// @16B: putfield int game.C_100087_n.field_100693_m
		// @16E: goto @172
		// @171: athrow
		// @172: aload_2
		// @173: getfield int game.C_100327_ib.field_102504_x
		// @176: iconst_m1
		// @177: ixor
		// @178: aload_3
		// @179: getfield int game.C_100087_n.field_100693_m
		// @17C: aload_0
		// @17D: getfield int game.C_100048_vi.field_104170_f
		// @180: imul
		// @181: iconst_m1
		// @182: ixor
		// @183: if_icmpgt @18A
		// @186: goto @197
		// @189: athrow
		// @18A: aload_3
		// @18B: aload_0
		// @18C: getfield int game.C_100048_vi.field_104170_f
		// @18F: aload_2
		// @190: getfield int game.C_100327_ib.field_102504_x
		// @193: imul
		// @194: putfield int game.C_100087_n.field_100693_m
		// @197: aload_3
		// @198: getfield int game.C_100087_n.field_100699_t
		// @19B: aload_0
		// @19C: getfield int game.C_100048_vi.field_104176_a
		// @19F: ineg
		// @1A0: iadd
		// @1A1: istore #5
		// @1A3: aload_0
		// @1A4: getfield int game.C_100048_vi.field_104178_o
		// @1A7: ineg
		// @1A8: aload_3
		// @1A9: getfield int game.C_100087_n.field_100698_u
		// @1AC: iadd
		// @1AD: istore #6
		// @1AF: iconst_m1
		// @1B0: iload #5
		// @1B2: iconst_m1
		// @1B3: ixor
		// @1B4: if_icmplt @1C5
		// @1B7: aload_0
		// @1B8: iconst_1
		// @1B9: putfield int game.C_100048_vi.field_104170_f
		// @1BC: iload #17
		// @1BE: ifeq @1CE
		// @1C1: goto @1C5
		// @1C4: athrow
		// @1C5: aload_0
		// @1C6: iconst_m1
		// @1C7: putfield int game.C_100048_vi.field_104170_f
		// @1CA: goto @1CE
		// @1CD: athrow
		// @1CE: aload_0
		// @1CF: getfield int game.C_100048_vi.field_104187_p
		// @1D2: iconst_m1
		// @1D3: ixor
		// @1D4: aload_0
		// @1D5: getfield int game.C_100048_vi.field_104170_f
		// @1D8: iconst_m1
		// @1D9: ixor
		// @1DA: if_icmpeq @1E6
		// @1DD: aload_0
		// @1DE: iconst_0
		// @1DF: putfield int game.C_100048_vi.field_104187_p
		// @1E2: goto @1E6
		// @1E5: athrow
		// @1E6: iconst_0
		// @1E7: istore #7
		// @1E9: iconst_0
		// @1EA: istore #8
		// @1EC: aload_2
		// @1ED: ifnonnull @1F1
		// @1F0: return
		// @1F1: aload_2
		// @1F2: getfield int game.C_100327_ib.field_102500_t
		// @1F5: istore #8
		// @1F7: aload_2
		// @1F8: getfield int game.C_100327_ib.field_102488_H
		// @1FB: istore #7
		// @1FD: aload_2
		// @1FE: getfield int game.C_100327_ib.field_102494_P
		// @201: bipush 17 (0x11)
		// @203: if_icmpeq @20A
		// @206: goto @20D
		// @209: athrow
		// @20A: iconst_5
		// @20B: istore #4
		// @20D: bipush -19 (0xED)
		// @20F: aload_2
		// @210: getfield int game.C_100327_ib.field_102494_P
		// @213: iconst_m1
		// @214: ixor
		// @215: if_icmpne @21B
		// @218: iconst_0
		// @219: istore #4
		// @21B: bipush 19 (0x13)
		// @21D: aload_2
		// @21E: getfield int game.C_100327_ib.field_102494_P
		// @221: if_icmpeq @228
		// @224: goto @22B
		// @227: athrow
		// @228: iconst_1
		// @229: istore #4
		// @22B: aload_2
		// @22C: getfield int game.C_100327_ib.field_102494_P
		// @22F: bipush 20 (0x14)
		// @231: if_icmpne @238
		// @234: bipush 6 (0x06)
		// @236: istore #4
		// @238: bipush 21 (0x15)
		// @23A: aload_2
		// @23B: getfield int game.C_100327_ib.field_102494_P
		// @23E: if_icmpne @244
		// @241: iconst_4
		// @242: istore #4
		// @244: aload_2
		// @245: getfield int game.C_100327_ib.field_102494_P
		// @248: bipush 22 (0x16)
		// @24A: if_icmpeq @251
		// @24D: goto @255
		// @250: athrow
		// @251: bipush 7 (0x07)
		// @253: istore #4
		// @255: bipush 23 (0x17)
		// @257: aload_2
		// @258: getfield int game.C_100327_ib.field_102494_P
		// @25B: if_icmpeq @262
		// @25E: goto @265
		// @261: athrow
		// @262: iconst_3
		// @263: istore #4
		// @265: aload_2
		// @266: getfield int game.C_100327_ib.field_102494_P
		// @269: iconst_m1
		// @26A: ixor
		// @26B: bipush -25 (0xE7)
		// @26D: if_icmpeq @274
		// @270: goto @277
		// @273: athrow
		// @274: iconst_2
		// @275: istore #4
		// @277: bipush 25 (0x19)
		// @279: aload_2
		// @27A: getfield int game.C_100327_ib.field_102494_P
		// @27D: if_icmpeq @284
		// @280: goto @287
		// @283: athrow
		// @284: iconst_2
		// @285: istore #4
		// @287: aload_2
		// @288: getfield int game.C_100327_ib.field_102494_P
		// @28B: iconst_m1
		// @28C: ixor
		// @28D: bipush -27 (0xE5)
		// @28F: if_icmpeq @296
		// @292: goto @299
		// @295: athrow
		// @296: iconst_2
		// @297: istore #4
		// @299: bipush -28 (0xE4)
		// @29B: aload_2
		// @29C: getfield int game.C_100327_ib.field_102494_P
		// @29F: iconst_m1
		// @2A0: ixor
		// @2A1: if_icmpeq @2A8
		// @2A4: goto @2AB
		// @2A7: athrow
		// @2A8: iconst_4
		// @2A9: istore #4
		// @2AB: aload_2
		// @2AC: getfield int game.C_100327_ib.field_102494_P
		// @2AF: bipush 38 (0x26)
		// @2B1: if_icmpeq @2B8
		// @2B4: goto @2BB
		// @2B7: athrow
		// @2B8: iconst_4
		// @2B9: istore #4
		// @2BB: aload_2
		// @2BC: getfield int game.C_100327_ib.field_102494_P
		// @2BF: iconst_m1
		// @2C0: ixor
		// @2C1: bipush -29 (0xE3)
		// @2C3: if_icmpne @2C9
		// @2C6: iconst_5
		// @2C7: istore #4
		// @2C9: aload_2
		// @2CA: getfield int game.C_100327_ib.field_102494_P
		// @2CD: bipush 29 (0x1D)
		// @2CF: if_icmpeq @2D6
		// @2D2: goto @2D9
		// @2D5: athrow
		// @2D6: iconst_0
		// @2D7: istore #4
		// @2D9: aload_2
		// @2DA: getfield int game.C_100327_ib.field_102494_P
		// @2DD: bipush 30 (0x1E)
		// @2DF: if_icmpne @2E5
		// @2E2: iconst_1
		// @2E3: istore #4
		// @2E5: iload_1
		// @2E6: bipush -18 (0xEE)
		// @2E8: if_icmpeq @2F5
		// @2EB: bipush -30 (0xE2)
		// @2ED: invokestatic game.C_100048_vi.func_104160_a(int)int
		// @2F0: pop
		// @2F1: goto @2F5
		// @2F4: athrow
		// @2F5: bipush -32 (0xE0)
		// @2F7: aload_2
		// @2F8: getfield int game.C_100327_ib.field_102494_P
		// @2FB: iconst_m1
		// @2FC: ixor
		// @2FD: if_icmpne @303
		// @300: iconst_1
		// @301: istore #4
		// @303: bipush 32 (0x20)
		// @305: aload_2
		// @306: getfield int game.C_100327_ib.field_102494_P
		// @309: if_icmpne @30F
		// @30C: iconst_1
		// @30D: istore #4
		// @30F: bipush -34 (0xDE)
		// @311: aload_2
		// @312: getfield int game.C_100327_ib.field_102494_P
		// @315: iconst_m1
		// @316: ixor
		// @317: if_icmpeq @31E
		// @31A: goto @322
		// @31D: athrow
		// @31E: bipush 6 (0x06)
		// @320: istore #4
		// @322: aload_2
		// @323: getfield int game.C_100327_ib.field_102494_P
		// @326: bipush 34 (0x22)
		// @328: if_icmpne @32E
		// @32B: iconst_4
		// @32C: istore #4
		// @32E: aload_2
		// @32F: getfield int game.C_100327_ib.field_102494_P
		// @332: iconst_m1
		// @333: ixor
		// @334: bipush -36 (0xDC)
		// @336: if_icmpne @33D
		// @339: bipush 7 (0x07)
		// @33B: istore #4
		// @33D: bipush -37 (0xDB)
		// @33F: aload_2
		// @340: getfield int game.C_100327_ib.field_102494_P
		// @343: iconst_m1
		// @344: ixor
		// @345: if_icmpeq @34C
		// @348: goto @34F
		// @34B: athrow
		// @34C: iconst_2
		// @34D: istore #4
		// @34F: bipush -38 (0xDA)
		// @351: aload_2
		// @352: getfield int game.C_100327_ib.field_102494_P
		// @355: iconst_m1
		// @356: ixor
		// @357: if_icmpne @35D
		// @35A: iconst_2
		// @35B: istore #4
		// @35D: bipush 46 (0x2E)
		// @35F: aload_2
		// @360: getfield int game.C_100327_ib.field_102494_P
		// @363: if_icmpeq @36A
		// @366: goto @36E
		// @369: athrow
		// @36A: bipush 6 (0x06)
		// @36C: istore #4
		// @36E: bipush -44 (0xD4)
		// @370: aload_2
		// @371: getfield int game.C_100327_ib.field_102494_P
		// @374: iconst_m1
		// @375: ixor
		// @376: if_icmpeq @37D
		// @379: goto @380
		// @37C: athrow
		// @37D: iconst_0
		// @37E: istore #4
		// @380: aload_2
		// @381: getfield int game.C_100327_ib.field_102494_P
		// @384: bipush 44 (0x2C)
		// @386: if_icmpeq @38D
		// @389: goto @390
		// @38C: athrow
		// @38D: iconst_1
		// @38E: istore #4
		// @390: aload_2
		// @391: getfield int game.C_100327_ib.field_102494_P
		// @394: iconst_m1
		// @395: ixor
		// @396: bipush -48 (0xD0)
		// @398: if_icmpne @39E
		// @39B: iconst_4
		// @39C: istore #4
		// @39E: bipush 45 (0x2D)
		// @3A0: aload_2
		// @3A1: getfield int game.C_100327_ib.field_102494_P
		// @3A4: if_icmpne @3AA
		// @3A7: iconst_1
		// @3A8: istore #4
		// @3AA: aload_2
		// @3AB: getfield int game.C_100327_ib.field_102494_P
		// @3AE: iconst_m1
		// @3AF: ixor
		// @3B0: bipush -49 (0xCF)
		// @3B2: if_icmpeq @3B9
		// @3B5: goto @3BD
		// @3B8: athrow
		// @3B9: bipush 7 (0x07)
		// @3BB: istore #4
		// @3BD: bipush 52 (0x34)
		// @3BF: aload_2
		// @3C0: getfield int game.C_100327_ib.field_102494_P
		// @3C3: if_icmpne @3C9
		// @3C6: iconst_4
		// @3C7: istore #4
		// @3C9: aload_2
		// @3CA: getfield int game.C_100327_ib.field_102494_P
		// @3CD: bipush 51 (0x33)
		// @3CF: if_icmpeq @3D6
		// @3D2: goto @3D9
		// @3D5: athrow
		// @3D6: iconst_3
		// @3D7: istore #4
		// @3D9: bipush 50 (0x32)
		// @3DB: aload_2
		// @3DC: getfield int game.C_100327_ib.field_102494_P
		// @3DF: if_icmpeq @3E6
		// @3E2: goto @3E9
		// @3E5: athrow
		// @3E6: iconst_2
		// @3E7: istore #4
		// @3E9: aload_2
		// @3EA: getfield int game.C_100327_ib.field_102494_P
		// @3ED: iconst_m1
		// @3EE: ixor
		// @3EF: bipush -50 (0xCE)
		// @3F1: if_icmpne @3F7
		// @3F4: iconst_2
		// @3F5: istore #4
		// @3F7: iload #6
		// @3F9: bipush 100 (0x64)
		// @3FB: idiv
		// @3FC: iload #6
		// @3FE: imul
		// @3FF: iload #5
		// @401: bipush 100 (0x64)
		// @403: idiv
		// @404: iload #5
		// @406: imul
		// @407: iadd
		// @408: i2d
		// @409: invokestatic java.lang.Math.sqrt(double)double
		// @40C: d2i
		// @40D: bipush 10 (0x0A)
		// @40F: imul
		// @410: istore #9
		// @412: sipush 192 (0x00C0)
		// @415: istore #10
		// @417: iconst_0
		// @418: istore #11
		// @41A: iconst_4
		// @41B: istore #12
		// @41D: bipush 45 (0x2D)
		// @41F: istore #13
		// @421: bipush 18 (0x12)
		// @423: aload_2
		// @424: getfield int game.C_100327_ib.field_102494_P
		// @427: if_icmpne @431
		// @42A: iinc #13 +236
		// @42D: goto @431
		// @430: athrow
		// @431: bipush 29 (0x1D)
		// @433: aload_2
		// @434: getfield int game.C_100327_ib.field_102494_P
		// @437: if_icmpne @441
		// @43A: iinc #13 +246
		// @43D: goto @441
		// @440: athrow
		// @441: bipush -44 (0xD4)
		// @443: aload_2
		// @444: getfield int game.C_100327_ib.field_102494_P
		// @447: iconst_m1
		// @448: ixor
		// @449: if_icmpne @453
		// @44C: iinc #13 +251
		// @44F: goto @453
		// @452: athrow
		// @453: iconst_1
		// @454: istore #14
		// @456: iconst_5
		// @457: iload #4
		// @459: if_icmpne @464
		// @45C: bipush 7 (0x07)
		// @45E: istore #11
		// @460: bipush 45 (0x2D)
		// @462: istore #13
		// @464: bipush -2 (0xFE)
		// @466: iload #4
		// @468: iconst_m1
		// @469: ixor
		// @46A: if_icmpne @4BD
		// @46D: sipush 256 (0x0100)
		// @470: istore #10
		// @472: iconst_1
		// @473: istore #11
		// @475: sipush 5000 (0x1388)
		// @478: istore #13
		// @47A: iconst_0
		// @47B: istore #12
		// @47D: bipush 32 (0x20)
		// @47F: istore #14
		// @481: aload_2
		// @482: getfield int game.C_100327_ib.field_102494_P
		// @485: iconst_m1
		// @486: ixor
		// @487: bipush -20 (0xEC)
		// @489: if_icmpeq @4B9
		// @48C: aload_2
		// @48D: getfield int game.C_100327_ib.field_102494_P
		// @490: iconst_m1
		// @491: ixor
		// @492: bipush -32 (0xE0)
		// @494: if_icmpeq @4AA
		// @497: goto @49B
		// @49A: athrow
		// @49B: aload_2
		// @49C: getfield int game.C_100327_ib.field_102494_P
		// @49F: iconst_m1
		// @4A0: ixor
		// @4A1: bipush -46 (0xD2)
		// @4A3: if_icmpne @4BD
		// @4A6: goto @4AA
		// @4A9: athrow
		// @4AA: iconst_m1
		// @4AB: aload_3
		// @4AC: getfield int game.C_100087_n.field_100693_m
		// @4AF: invokestatic game.C_100200_ba.func_105846_a(int, int)int
		// @4B2: istore #10
		// @4B4: iload #17
		// @4B6: ifeq @4BD
		// @4B9: bipush 20 (0x14)
		// @4BB: istore #11
		// @4BD: bipush -8 (0xF8)
		// @4BF: iload #4
		// @4C1: iconst_m1
		// @4C2: ixor
		// @4C3: if_icmpne @4DC
		// @4C6: iconst_0
		// @4C7: istore #12
		// @4C9: bipush 6 (0x06)
		// @4CB: istore #11
		// @4CD: sipush 192 (0x00C0)
		// @4D0: istore #10
		// @4D2: sipush 5000 (0x1388)
		// @4D5: istore #13
		// @4D7: sipush 250 (0x00FA)
		// @4DA: istore #14
		// @4DC: iload #4
		// @4DE: iconst_2
		// @4DF: if_icmpeq @4E6
		// @4E2: goto @4FA
		// @4E5: athrow
		// @4E6: iconst_2
		// @4E7: istore #11
		// @4E9: sipush 5000 (0x1388)
		// @4EC: istore #13
		// @4EE: iconst_0
		// @4EF: istore #12
		// @4F1: bipush 16 (0x10)
		// @4F3: istore #10
		// @4F5: sipush 250 (0x00FA)
		// @4F8: istore #14
		// @4FA: iload #4
		// @4FC: iconst_m1
		// @4FD: ixor
		// @4FE: bipush -4 (0xFC)
		// @500: if_icmpne @518
		// @503: bipush 16 (0x10)
		// @505: istore #10
		// @507: bipush 20 (0x14)
		// @509: istore #12
		// @50B: iconst_3
		// @50C: istore #11
		// @50E: sipush 5000 (0x1388)
		// @511: istore #13
		// @513: sipush 250 (0x00FA)
		// @516: istore #14
		// @518: iload #4
		// @51A: iconst_4
		// @51B: if_icmpne @530
		// @51E: iconst_5
		// @51F: istore #13
		// @521: bipush 32 (0x20)
		// @523: istore #12
		// @525: iconst_4
		// @526: istore #11
		// @528: sipush 256 (0x0100)
		// @52B: istore #10
		// @52D: iconst_1
		// @52E: istore #14
		// @530: iconst_3
		// @531: aload_3
		// @532: getfield int game.C_100087_n.field_100693_m
		// @535: ldc -414951101 (0xe7445943)
		// @537: ishr
		// @538: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @53B: bipush 100 (0x64)
		// @53D: imul
		// @53E: ldc 263064560 (0xfae0bf0)
		// @540: ishr
		// @541: istore #5
		// @543: bipush 6 (0x06)
		// @545: iload #4
		// @547: if_icmpne @55C
		// @54A: iconst_5
		// @54B: istore #13
		// @54D: sipush 512 (0x0200)
		// @550: istore #10
		// @552: bipush 32 (0x20)
		// @554: istore #12
		// @556: iconst_5
		// @557: istore #11
		// @559: iconst_1
		// @55A: istore #14
		// @55C: iconst_1
		// @55D: iload #9
		// @55F: if_icmpgt @566
		// @562: goto @569
		// @565: athrow
		// @566: iconst_1
		// @567: istore #9
		// @569: bipush 100 (0x64)
		// @56B: aload_3
		// @56C: getfield int game.C_100087_n.field_100693_m
		// @56F: ldc -1028550461 (0xc2b190c3)
		// @571: ishr
		// @572: iconst_0
		// @573: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @576: ineg
		// @577: imul
		// @578: ldc -236225808 (0xf1eb7af0)
		// @57A: ishr
		// @57B: istore #6
		// @57D: bipush 100 (0x64)
		// @57F: istore #9
		// @581: aconst_null
		// @582: getstatic int[][] game.C_100137_bn.field_105040_j
		// @585: aload_2
		// @586: getfield int game.C_100327_ib.field_102494_P
		// @589: bipush 17 (0x11)
		// @58B: isub
		// @58C: aaload
		// @58D: if_acmpeq @604
		// @590: getstatic int[][] game.C_100137_bn.field_105040_j
		// @593: aload_2
		// @594: getfield int game.C_100327_ib.field_102494_P
		// @597: bipush -17 (0xEF)
		// @599: iadd
		// @59A: aaload
		// @59B: iconst_0
		// @59C: iaload
		// @59D: aload_2
		// @59E: getfield int game.C_100327_ib.field_102502_z
		// @5A1: ineg
		// @5A2: iadd
		// @5A3: istore #15
		// @5A5: aload_2
		// @5A6: getfield int game.C_100327_ib.field_102491_K
		// @5A9: ineg
		// @5AA: getstatic int[][] game.C_100137_bn.field_105040_j
		// @5AD: bipush -17 (0xEF)
		// @5AF: aload_2
		// @5B0: getfield int game.C_100327_ib.field_102494_P
		// @5B3: iadd
		// @5B4: aaload
		// @5B5: iconst_1
		// @5B6: iaload
		// @5B7: iadd
		// @5B8: istore #16
		// @5BA: iload #7
		// @5BC: iload #16
		// @5BE: iload #5
		// @5C0: bipush 32 (0x20)
		// @5C2: imul
		// @5C3: imul
		// @5C4: iload #9
		// @5C6: idiv
		// @5C7: isub
		// @5C8: istore #7
		// @5CA: iload #8
		// @5CC: bipush 32 (0x20)
		// @5CE: iload #6
		// @5D0: imul
		// @5D1: iload #16
		// @5D3: imul
		// @5D4: iload #9
		// @5D6: idiv
		// @5D7: isub
		// @5D8: istore #8
		// @5DA: iload #8
		// @5DC: iload #5
		// @5DE: iload #15
		// @5E0: aload_0
		// @5E1: getfield int game.C_100048_vi.field_104170_f
		// @5E4: imul
		// @5E5: bipush 32 (0x20)
		// @5E7: imul
		// @5E8: imul
		// @5E9: iload #9
		// @5EB: idiv
		// @5EC: iadd
		// @5ED: istore #8
		// @5EF: iload #7
		// @5F1: bipush 32 (0x20)
		// @5F3: iload #15
		// @5F5: imul
		// @5F6: iload #6
		// @5F8: aload_0
		// @5F9: getfield int game.C_100048_vi.field_104170_f
		// @5FC: imul
		// @5FD: imul
		// @5FE: iload #9
		// @600: idiv
		// @601: isub
		// @602: istore #7
		// @604: new game.C_100018_wk
		// @607: dup
		// @608: iload #7
		// @60A: iload #8
		// @60C: iload #5
		// @60E: iload #10
		// @610: imul
		// @611: iload #9
		// @613: idiv
		// @614: iload #6
		// @616: iload #10
		// @618: imul
		// @619: iload #9
		// @61B: idiv
		// @61C: iload #13
		// @61E: iload #12
		// @620: iload #11
		// @622: aload_0
		// @623: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @626: getfield game.C_100294_ki game.C_100314_lf.field_101350_l
		// @629: aload_0
		// @62A: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @62D: iconst_0
		// @62E: iload #14
		// @630: aload_2
		// @631: getfield int game.C_100327_ib.field_102494_P
		// @634: bipush 17 (0x11)
		// @636: isub
		// @637: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @63A: astore #15
		// @63C: aload #15
		// @63E: iload #6
		// @640: bipush 100 (0x64)
		// @642: imul
		// @643: iload #8
		// @645: iadd
		// @646: putfield int game.C_100018_wk.field_101537_S
		// @649: aload #15
		// @64B: iload #7
		// @64D: bipush 100 (0x64)
		// @64F: iload #5
		// @651: imul
		// @652: iadd
		// @653: putfield int game.C_100018_wk.field_101548_u
		// @656: aload #15
		// @658: iconst_1
		// @659: putfield boolean game.C_100018_wk.field_101513_E
		// @65C: aload #15
		// @65E: aconst_null
		// @65F: aload #15
		// @661: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @664: if_acmpeq @673
		// @667: aload #15
		// @669: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @66C: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @66F: goto @674
		// @672: athrow
		// @673: aconst_null
		// @674: putfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @677: bipush -4 (0xFC)
		// @679: iload #4
		// @67B: iconst_m1
		// @67C: ixor
		// @67D: if_icmpne @696
		// @680: aload #15
		// @682: aload_3
		// @683: getfield int game.C_100087_n.field_100698_u
		// @686: putfield int game.C_100018_wk.field_101537_S
		// @689: aload #15
		// @68B: aload_3
		// @68C: getfield int game.C_100087_n.field_100699_t
		// @68F: putfield int game.C_100018_wk.field_101548_u
		// @692: goto @696
		// @695: athrow
		// @696: aload #15
		// @698: aconst_null
		// @699: putfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @69C: getstatic game.C_100202_qi game.C_100265_mh.field_106586_D
		// @69F: bipush 126 (0x7E)
		// @6A1: aload #15
		// @6A3: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @6A6: aload_0
		// @6A7: getfield int game.C_100048_vi.field_104176_a
		// @6AA: ineg
		// @6AB: aload #15
		// @6AD: getfield int game.C_100018_wk.field_101514_F
		// @6B0: iadd
		// @6B1: putstatic int game.C_100238_ol.field_101691_E
		// @6B4: aload_0
		// @6B5: getfield int game.C_100048_vi.field_104178_o
		// @6B8: ineg
		// @6B9: aload #15
		// @6BB: getfield int game.C_100018_wk.field_101545_fb
		// @6BE: iadd
		// @6BF: putstatic int game.C_100249_pc.field_102326_E
		// @6C2: goto @71D
		// @6C5: astore #4
		// @6C7: aload #4
		// @6C9: new java.lang.StringBuilder
		// @6CC: dup
		// @6CD: invokespecial java.lang.StringBuilder.<init>()void
		// @6D0: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @6D3: bipush 16 (0x10)
		// @6D5: aaload
		// @6D6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6D9: iload_1
		// @6DA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6DD: bipush 44 (0x2C)
		// @6DF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6E2: aload_2
		// @6E3: ifnull @6EF
		// @6E6: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @6E9: iconst_0
		// @6EA: aaload
		// @6EB: goto @6F4
		// @6EE: athrow
		// @6EF: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @6F2: iconst_2
		// @6F3: aaload
		// @6F4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6F7: bipush 44 (0x2C)
		// @6F9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6FC: aload_3
		// @6FD: ifnull @709
		// @700: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @703: iconst_0
		// @704: aaload
		// @705: goto @70E
		// @708: athrow
		// @709: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @70C: iconst_2
		// @70D: aaload
		// @70E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @711: bipush 41 (0x29)
		// @713: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @716: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @719: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @71C: athrow
		// @71D: return
	}
	
	final void func_104165_a(byte arg0, int arg1, int arg2, C_100087_n arg3, int arg4)
	{
		// @00: iload_1
		// @01: bipush -18 (0xEE)
		// @03: if_icmpeq @14
		// @06: aload_0
		// @07: bipush -99 (0x9D)
		// @09: aconst_null
		// @0A: checkcast game.C_100327_ib
		// @0D: aconst_null
		// @0E: checkcast game.C_100087_n
		// @11: invokespecial game.C_100048_vi.func_104156_a(byte, game.C_100327_ib, game.C_100087_n)void
		// @14: goto @72
		// @17: astore #6
		// @19: aload #6
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @25: bipush 7 (0x07)
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: iload_1
		// @2C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F: bipush 44 (0x2C)
		// @31: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34: iload_2
		// @35: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @38: bipush 44 (0x2C)
		// @3A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D: iload_3
		// @3E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @41: bipush 44 (0x2C)
		// @43: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @46: aload #4
		// @48: ifnull @54
		// @4B: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @4E: iconst_0
		// @4F: aaload
		// @50: goto @59
		// @53: athrow
		// @54: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @57: iconst_2
		// @58: aaload
		// @59: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5C: bipush 44 (0x2C)
		// @5E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @61: iload #5
		// @63: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @66: bipush 41 (0x29)
		// @68: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @71: athrow
		// @72: return
	}
	
	static final C_100338_jc func_104169_a(byte arg0)
	{
		// @00: iload_0
		// @01: iconst_2
		// @02: if_icmpeq @0D
		// @05: iconst_1
		// @06: invokestatic game.C_100048_vi.func_104168_a(boolean)void
		// @09: goto @0D
		// @0C: athrow
		// @0D: new game.C_100156_sk
		// @10: dup
		// @11: invokespecial game.C_100156_sk.<init>()void
		// @14: areturn
		// @15: astore_1
		// @16: aload_1
		// @17: new java.lang.StringBuilder
		// @1A: dup
		// @1B: invokespecial java.lang.StringBuilder.<init>()void
		// @1E: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @21: bipush 12 (0x0C)
		// @23: aaload
		// @24: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27: iload_0
		// @28: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2B: bipush 41 (0x29)
		// @2D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @30: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @33: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @36: athrow
	}
	
	final void func_104162_a(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5)
	{
		// @000: iload #5
		// @002: aload_0
		// @003: getfield int game.C_100048_vi.field_104176_a
		// @006: ldc 730399912 (0x2b8904a8)
		// @008: ishr
		// @009: iadd
		// @00A: istore #7
		// @00C: iload_2
		// @00D: bipush -47 (0xD1)
		// @00F: if_icmple @013
		// @012: return
		// @013: aload_0
		// @014: dup
		// @015: getfield int game.C_100048_vi.field_104173_e
		// @018: iconst_1
		// @019: iadd
		// @01A: putfield int game.C_100048_vi.field_104173_e
		// @01D: aload_0
		// @01E: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @021: getfield int game.C_100314_lf.field_101299_xc
		// @024: bipush 8 (0x08)
		// @026: imul
		// @027: ineg
		// @028: aload_0
		// @029: getfield int game.C_100048_vi.field_104178_o
		// @02C: iadd
		// @02D: ldc 324260104 (0x1353d108)
		// @02F: ishr
		// @030: iload_3
		// @031: iadd
		// @032: istore #8
		// @034: bipush -17 (0xEF)
		// @036: aload_0
		// @037: getfield int game.C_100048_vi.field_104173_e
		// @03A: iconst_m1
		// @03B: ixor
		// @03C: if_icmplt @0C9
		// @03F: aload_0
		// @040: dup
		// @041: getfield int game.C_100048_vi.field_104173_e
		// @044: bipush 16 (0x10)
		// @046: isub
		// @047: putfield int game.C_100048_vi.field_104173_e
		// @04A: getstatic int[] game.C_100235_om.field_106286_f
		// @04D: astore #9
		// @04F: ldc 16772442 (0xffed5a)
		// @051: aload_0
		// @052: getfield int game.C_100048_vi.field_104177_n
		// @055: iand
		// @056: ldc 804370288 (0x2ff1b770)
		// @058: ishr
		// @059: aload_0
		// @05A: getfield int game.C_100048_vi.field_104177_n
		// @05D: sipush 255 (0x00FF)
		// @060: iand
		// @061: if_icmpgt @068
		// @064: goto @083
		// @067: athrow
		// @068: getstatic int[] game.C_100235_om.field_106299_i
		// @06B: astore #9
		// @06D: aload_0
		// @06E: getfield int game.C_100048_vi.field_104177_n
		// @071: ldc 1732340976 (0x67416cf0)
		// @073: ishr
		// @074: aload_0
		// @075: getfield int game.C_100048_vi.field_104177_n
		// @078: ldc 1155668456 (0x44e219e8)
		// @07A: ishr
		// @07B: if_icmpne @083
		// @07E: getstatic int[] game.C_100235_om.field_106297_k
		// @081: astore #9
		// @083: iload #7
		// @085: ldc 658698628 (0x2742f184)
		// @087: ishl
		// @088: iload #8
		// @08A: ldc -137412764 (0xf7cf3f64)
		// @08C: ishl
		// @08D: iload_1
		// @08E: iconst_m1
		// @08F: aload #9
		// @091: arraylength
		// @092: iadd
		// @093: aload #9
		// @095: invokestatic game.C_100196_rb.func_105787_a(int, int, int, int, int[])void
		// @098: iload #4
		// @09A: ifeq @0C9
		// @09D: getstatic int game.C_100004_gb.field_103573_l
		// @0A0: getstatic int[] game.C_100033_gj.field_101918_Wb
		// @0A3: arraylength
		// @0A4: if_icmplt @0AF
		// @0A7: goto @0AB
		// @0AA: athrow
		// @0AB: goto @0C9
		// @0AE: athrow
		// @0AF: getstatic int[] game.C_100033_gj.field_101918_Wb
		// @0B2: getstatic int game.C_100004_gb.field_103573_l
		// @0B5: iload #7
		// @0B7: iastore
		// @0B8: getstatic int[] game.C_100209_qb.field_102696_Ob
		// @0BB: getstatic int game.C_100004_gb.field_103573_l
		// @0BE: iload #8
		// @0C0: iastore
		// @0C1: getstatic int game.C_100004_gb.field_103573_l
		// @0C4: iconst_1
		// @0C5: iadd
		// @0C6: putstatic int game.C_100004_gb.field_103573_l
		// @0C9: goto @120
		// @0CC: astore #7
		// @0CE: aload #7
		// @0D0: new java.lang.StringBuilder
		// @0D3: dup
		// @0D4: invokespecial java.lang.StringBuilder.<init>()void
		// @0D7: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @0DA: bipush 15 (0x0F)
		// @0DC: aaload
		// @0DD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0E0: iload_1
		// @0E1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E4: bipush 44 (0x2C)
		// @0E6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E9: iload_2
		// @0EA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0ED: bipush 44 (0x2C)
		// @0EF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F2: iload_3
		// @0F3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F6: bipush 44 (0x2C)
		// @0F8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FB: iload #4
		// @0FD: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @100: bipush 44 (0x2C)
		// @102: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @105: iload #5
		// @107: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @10A: bipush 44 (0x2C)
		// @10C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10F: iload #6
		// @111: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @114: bipush 41 (0x29)
		// @116: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @119: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @11C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @11F: athrow
		// @120: return
	}
	
	final C_100087_n func_104166_a(int arg0, C_100087_n arg1, byte arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #19
		// @005: ldc -120000 (0xfffe2b40)
		// @007: aload_0
		// @008: getfield int game.C_100048_vi.field_104178_o
		// @00B: if_icmple @02E
		// @00E: aload_0
		// @00F: getfield int game.C_100048_vi.field_104183_h
		// @012: iconst_m1
		// @013: ixor
		// @014: iconst_m1
		// @015: if_icmpgt @020
		// @018: goto @01C
		// @01B: athrow
		// @01C: goto @02E
		// @01F: athrow
		// @020: aload_0
		// @021: bipush 15 (0x0F)
		// @023: aload_0
		// @024: getfield int game.C_100048_vi.field_104183_h
		// @027: imul
		// @028: bipush 16 (0x10)
		// @02A: idiv
		// @02B: putfield int game.C_100048_vi.field_104183_h
		// @02E: aconst_null
		// @02F: astore #4
		// @031: aload_0
		// @032: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @035: getfield game.C_100294_ki game.C_100314_lf.field_101350_l
		// @038: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @03B: sipush 26294 (0x66B6)
		// @03E: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @041: iconst_m1
		// @042: ixor
		// @043: bipush -5 (0xFB)
		// @045: if_icmpne @05B
		// @048: aload_0
		// @049: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @04C: getfield game.C_100294_ki game.C_100314_lf.field_101350_l
		// @04F: getfield int game.C_100294_ki.field_106951_E
		// @052: iconst_1
		// @053: iand
		// @054: ifne @075
		// @057: goto @05B
		// @05A: athrow
		// @05B: iconst_0
		// @05C: aload_0
		// @05D: getfield int game.C_100048_vi.field_104171_g
		// @060: if_icmpgt @075
		// @063: goto @067
		// @066: athrow
		// @067: aload_0
		// @068: dup
		// @069: getfield int game.C_100048_vi.field_104171_g
		// @06C: iconst_1
		// @06D: iadd
		// @06E: putfield int game.C_100048_vi.field_104171_g
		// @071: goto @075
		// @074: athrow
		// @075: aload_0
		// @076: getfield int game.C_100048_vi.field_104176_a
		// @079: istore #5
		// @07B: aload_0
		// @07C: dup
		// @07D: getfield int game.C_100048_vi.field_104176_a
		// @080: aload_0
		// @081: getfield int game.C_100048_vi.field_104182_k
		// @084: iadd
		// @085: putfield int game.C_100048_vi.field_104176_a
		// @088: aload_0
		// @089: dup
		// @08A: getfield int game.C_100048_vi.field_104178_o
		// @08D: aload_0
		// @08E: getfield int game.C_100048_vi.field_104183_h
		// @091: iadd
		// @092: putfield int game.C_100048_vi.field_104178_o
		// @095: aload_0
		// @096: getfield boolean game.C_100048_vi.field_104172_d
		// @099: ifeq @0B1
		// @09C: iconst_0
		// @09D: aload_0
		// @09E: getfield int game.C_100048_vi.field_104183_h
		// @0A1: if_icmple @0B1
		// @0A4: goto @0A8
		// @0A7: athrow
		// @0A8: aload_0
		// @0A9: iconst_0
		// @0AA: putfield int game.C_100048_vi.field_104183_h
		// @0AD: goto @0B1
		// @0B0: athrow
		// @0B1: aload_0
		// @0B2: getfield boolean game.C_100048_vi.field_104172_d
		// @0B5: ifeq @14C
		// @0B8: bipush -5 (0xFB)
		// @0BA: aload_0
		// @0BB: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @0BE: getfield game.C_100294_ki game.C_100314_lf.field_101350_l
		// @0C1: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0C4: sipush 26294 (0x66B6)
		// @0C7: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @0CA: iconst_m1
		// @0CB: ixor
		// @0CC: if_icmpne @0D7
		// @0CF: goto @0D3
		// @0D2: athrow
		// @0D3: goto @14C
		// @0D6: athrow
		// @0D7: aload_0
		// @0D8: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @0DB: getfield game.C_100294_ki game.C_100314_lf.field_101350_l
		// @0DE: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0E1: sipush -25357 (0x9CF3)
		// @0E4: aload_0
		// @0E5: getfield int game.C_100048_vi.field_104176_a
		// @0E8: ldc -1065552636 (0xc07cf504)
		// @0EA: ishr
		// @0EB: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @0EE: ineg
		// @0EF: ldc -503436636 (0xe1fe2aa4)
		// @0F1: ishl
		// @0F2: ldc 50000 (0xc350)
		// @0F4: isub
		// @0F5: istore #6
		// @0F7: aload_0
		// @0F8: getfield int game.C_100048_vi.field_104178_o
		// @0FB: iconst_m1
		// @0FC: ixor
		// @0FD: iload #6
		// @0FF: iconst_m1
		// @100: ixor
		// @101: if_icmpge @14C
		// @104: aload_0
		// @105: getfield int game.C_100048_vi.field_104183_h
		// @108: bipush 100 (0x64)
		// @10A: if_icmpgt @115
		// @10D: goto @111
		// @110: athrow
		// @111: goto @14C
		// @114: athrow
		// @115: aload_0
		// @116: dup
		// @117: getfield int game.C_100048_vi.field_104183_h
		// @11A: bipush 25 (0x19)
		// @11C: isub
		// @11D: putfield int game.C_100048_vi.field_104183_h
		// @120: iconst_0
		// @121: aload_0
		// @122: getfield int game.C_100048_vi.field_104171_g
		// @125: if_icmpge @135
		// @128: aload_0
		// @129: aload_0
		// @12A: getfield int game.C_100048_vi.field_104171_g
		// @12D: ineg
		// @12E: putfield int game.C_100048_vi.field_104171_g
		// @131: goto @135
		// @134: athrow
		// @135: sipush -501 (0xFE0B)
		// @138: aload_0
		// @139: getfield int game.C_100048_vi.field_104183_h
		// @13C: iconst_m1
		// @13D: ixor
		// @13E: if_icmpge @14C
		// @141: aload_0
		// @142: sipush 500 (0x01F4)
		// @145: putfield int game.C_100048_vi.field_104183_h
		// @148: goto @14C
		// @14B: athrow
		// @14C: aload_0
		// @14D: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @150: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @153: bipush 101 (0x65)
		// @155: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @158: checkcast game.C_100087_n
		// @15B: astore #6
		// @15D: aconst_null
		// @15E: aload #6
		// @160: if_acmpeq @343
		// @163: aload_0
		// @164: getfield boolean game.C_100048_vi.field_104172_d
		// @167: iload #19
		// @169: ifne @549
		// @16C: ifeq @1A5
		// @16F: goto @173
		// @172: athrow
		// @173: bipush 6 (0x06)
		// @175: aload #6
		// @177: getfield int game.C_100087_n.field_100695_k
		// @17A: if_icmpeq @1A5
		// @17D: goto @181
		// @180: athrow
		// @181: aload_0
		// @182: getfield boolean game.C_100048_vi.field_104172_d
		// @185: ifeq @2C6
		// @188: goto @18C
		// @18B: athrow
		// @18C: iconst_3
		// @18D: aload #6
		// @18F: getfield int game.C_100087_n.field_100695_k
		// @192: if_icmpne @2C6
		// @195: goto @199
		// @198: athrow
		// @199: iconst_0
		// @19A: aload_0
		// @19B: getfield int game.C_100048_vi.field_104171_g
		// @19E: if_icmple @2C6
		// @1A1: goto @1A5
		// @1A4: athrow
		// @1A5: aload #6
		// @1A7: getfield int game.C_100087_n.field_100706_x
		// @1AA: iload_1
		// @1AB: if_icmpne @2C6
		// @1AE: goto @1B2
		// @1B1: athrow
		// @1B2: aload #6
		// @1B4: getfield int game.C_100087_n.field_100695_k
		// @1B7: iconst_3
		// @1B8: if_icmpne @227
		// @1BB: goto @1BF
		// @1BE: athrow
		// @1BF: aload #6
		// @1C1: astore #4
		// @1C3: aload_0
		// @1C4: getfield boolean game.C_100048_vi.field_104185_r
		// @1C7: ifeq @1F7
		// @1CA: iconst_m1
		// @1CB: aload_0
		// @1CC: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @1CF: getfield int game.C_100314_lf.field_101412_Kb
		// @1D2: iconst_m1
		// @1D3: ixor
		// @1D4: if_icmpgt @1F7
		// @1D7: goto @1DB
		// @1DA: athrow
		// @1DB: aload_0
		// @1DC: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @1DF: getfield int game.C_100314_lf.field_101334_V
		// @1E2: iconst_m1
		// @1E3: ixor
		// @1E4: iconst_m1
		// @1E5: if_icmpge @32D
		// @1E8: goto @1EC
		// @1EB: athrow
		// @1EC: aload_0
		// @1ED: getfield boolean game.C_100048_vi.field_104172_d
		// @1F0: ifeq @32D
		// @1F3: goto @1F7
		// @1F6: athrow
		// @1F7: aload_0
		// @1F8: getfield boolean game.C_100048_vi.field_104185_r
		// @1FB: ifne @210
		// @1FE: goto @202
		// @201: athrow
		// @202: aload_0
		// @203: iconst_0
		// @204: putfield int game.C_100048_vi.field_104187_p
		// @207: iload #19
		// @209: ifeq @32D
		// @20C: goto @210
		// @20F: athrow
		// @210: aload_0
		// @211: sipush -5591 (0xEA29)
		// @214: aload #6
		// @216: invokespecial game.C_100048_vi.func_104163_a(int, game.C_100087_n)void
		// @219: aload_0
		// @21A: iconst_0
		// @21B: putfield boolean game.C_100048_vi.field_104172_d
		// @21E: iload #19
		// @220: ifeq @32D
		// @223: goto @227
		// @226: athrow
		// @227: iconst_0
		// @228: aload #6
		// @22A: getfield int game.C_100087_n.field_100695_k
		// @22D: if_icmpeq @292
		// @230: goto @234
		// @233: athrow
		// @234: aload #6
		// @236: getfield int game.C_100087_n.field_100695_k
		// @239: iconst_m1
		// @23A: ixor
		// @23B: bipush -7 (0xF9)
		// @23D: if_icmpeq @248
		// @240: goto @244
		// @243: athrow
		// @244: goto @32D
		// @247: athrow
		// @248: aload_0
		// @249: getfield int game.C_100048_vi.field_104187_p
		// @24C: istore #7
		// @24E: aload_0
		// @24F: aload #6
		// @251: getfield int game.C_100087_n.field_100704_z
		// @254: putfield int game.C_100048_vi.field_104187_p
		// @257: iconst_0
		// @258: aload_0
		// @259: getfield int game.C_100048_vi.field_104187_p
		// @25C: if_icmpgt @272
		// @25F: aload_0
		// @260: getfield int game.C_100048_vi.field_104187_p
		// @263: iconst_m1
		// @264: ixor
		// @265: bipush -2 (0xFE)
		// @267: if_icmplt @272
		// @26A: goto @26E
		// @26D: athrow
		// @26E: goto @277
		// @271: athrow
		// @272: aload_0
		// @273: iconst_m1
		// @274: putfield int game.C_100048_vi.field_104187_p
		// @277: aload_0
		// @278: getfield int game.C_100048_vi.field_104187_p
		// @27B: iconst_m1
		// @27C: ixor
		// @27D: iload #7
		// @27F: iconst_m1
		// @280: ixor
		// @281: if_icmpne @288
		// @284: goto @28D
		// @287: athrow
		// @288: aload_0
		// @289: iconst_0
		// @28A: putfield int game.C_100048_vi.field_104179_l
		// @28D: iload #19
		// @28F: ifeq @32D
		// @292: aload #6
		// @294: getfield int game.C_100087_n.field_100699_t
		// @297: iconst_m1
		// @298: ixor
		// @299: aload_0
		// @29A: getfield int game.C_100048_vi.field_104176_a
		// @29D: iconst_m1
		// @29E: ixor
		// @29F: if_icmpge @2B4
		// @2A2: goto @2A6
		// @2A5: athrow
		// @2A6: aload_0
		// @2A7: iconst_1
		// @2A8: putfield int game.C_100048_vi.field_104170_f
		// @2AB: iload #19
		// @2AD: ifeq @2BD
		// @2B0: goto @2B4
		// @2B3: athrow
		// @2B4: aload_0
		// @2B5: iconst_m1
		// @2B6: putfield int game.C_100048_vi.field_104170_f
		// @2B9: goto @2BD
		// @2BC: athrow
		// @2BD: aload #6
		// @2BF: astore #4
		// @2C1: iload #19
		// @2C3: ifeq @32D
		// @2C6: aload_0
		// @2C7: getfield boolean game.C_100048_vi.field_104172_d
		// @2CA: ifne @32D
		// @2CD: goto @2D1
		// @2D0: athrow
		// @2D1: bipush -100 (0x9C)
		// @2D3: aload #6
		// @2D5: getfield int game.C_100087_n.field_100690_n
		// @2D8: iadd
		// @2D9: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @2DC: aload_0
		// @2DD: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @2E0: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @2E3: getfield int game.C_100327_ib.field_102494_P
		// @2E6: bipush 59 (0x3B)
		// @2E8: invokestatic game.C_100183_cd.func_103414_b(int, byte)int
		// @2EB: aaload
		// @2EC: bipush 25 (0x19)
		// @2EE: aaload
		// @2EF: iconst_2
		// @2F0: iaload
		// @2F1: iadd
		// @2F2: iconst_m1
		// @2F3: ixor
		// @2F4: iload_1
		// @2F5: iconst_1
		// @2F6: isub
		// @2F7: iconst_m1
		// @2F8: ixor
		// @2F9: if_icmpeq @304
		// @2FC: goto @300
		// @2FF: athrow
		// @300: goto @32D
		// @303: athrow
		// @304: bipush -4 (0xFC)
		// @306: aload #6
		// @308: getfield int game.C_100087_n.field_100695_k
		// @30B: iconst_m1
		// @30C: ixor
		// @30D: if_icmpne @32D
		// @310: aload_0
		// @311: getfield boolean game.C_100048_vi.field_104185_r
		// @314: ifne @32D
		// @317: goto @31B
		// @31A: athrow
		// @31B: aload_0
		// @31C: iconst_0
		// @31D: putfield int game.C_100048_vi.field_104179_l
		// @320: aload_0
		// @321: sipush -5591 (0xEA29)
		// @324: aload #6
		// @326: invokespecial game.C_100048_vi.func_104163_a(int, game.C_100087_n)void
		// @329: goto @32D
		// @32C: athrow
		// @32D: aload_0
		// @32E: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @331: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @334: bipush 68 (0x44)
		// @336: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @339: checkcast game.C_100087_n
		// @33C: astore #6
		// @33E: iload #19
		// @340: ifeq @15D
		// @343: aload_0
		// @344: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @347: getfield game.C_100202_qi game.C_100314_lf.field_101324_H
		// @34A: bipush 89 (0x59)
		// @34C: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @34F: checkcast game.C_100087_n
		// @352: astore #6
		// @354: aload #6
		// @356: ifnull @49F
		// @359: aload_0
		// @35A: getfield boolean game.C_100048_vi.field_104172_d
		// @35D: iload #19
		// @35F: ifne @549
		// @362: ifne @428
		// @365: goto @369
		// @368: athrow
		// @369: aload #6
		// @36B: getfield int game.C_100087_n.field_100706_x
		// @36E: iload_1
		// @36F: if_icmpne @428
		// @372: goto @376
		// @375: athrow
		// @376: iconst_3
		// @377: aload #6
		// @379: getfield int game.C_100087_n.field_100695_k
		// @37C: if_icmpne @3CE
		// @37F: goto @383
		// @382: athrow
		// @383: aload_0
		// @384: getfield boolean game.C_100048_vi.field_104185_r
		// @387: ifeq @3A3
		// @38A: goto @38E
		// @38D: athrow
		// @38E: iconst_m1
		// @38F: aload_0
		// @390: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @393: getfield int game.C_100314_lf.field_101412_Kb
		// @396: iconst_m1
		// @397: ixor
		// @398: if_icmpgt @3A3
		// @39B: goto @39F
		// @39E: athrow
		// @39F: goto @3C5
		// @3A2: athrow
		// @3A3: aload_0
		// @3A4: getfield boolean game.C_100048_vi.field_104185_r
		// @3A7: ifne @3B8
		// @3AA: aload_0
		// @3AB: iconst_0
		// @3AC: putfield int game.C_100048_vi.field_104187_p
		// @3AF: iload #19
		// @3B1: ifeq @3C5
		// @3B4: goto @3B8
		// @3B7: athrow
		// @3B8: aload_0
		// @3B9: sipush -5591 (0xEA29)
		// @3BC: aload #6
		// @3BE: invokespecial game.C_100048_vi.func_104163_a(int, game.C_100087_n)void
		// @3C1: goto @3C5
		// @3C4: athrow
		// @3C5: aload #6
		// @3C7: astore #4
		// @3C9: iload #19
		// @3CB: ifeq @489
		// @3CE: aload #6
		// @3D0: getfield int game.C_100087_n.field_100695_k
		// @3D3: ifne @406
		// @3D6: goto @3DA
		// @3D9: athrow
		// @3DA: aload #6
		// @3DC: astore #4
		// @3DE: aload #6
		// @3E0: getfield int game.C_100087_n.field_100699_t
		// @3E3: aload_0
		// @3E4: getfield int game.C_100048_vi.field_104176_a
		// @3E7: if_icmpgt @3F8
		// @3EA: aload_0
		// @3EB: iconst_m1
		// @3EC: putfield int game.C_100048_vi.field_104170_f
		// @3EF: iload #19
		// @3F1: ifeq @489
		// @3F4: goto @3F8
		// @3F7: athrow
		// @3F8: aload_0
		// @3F9: iconst_1
		// @3FA: putfield int game.C_100048_vi.field_104170_f
		// @3FD: iload #19
		// @3FF: ifeq @489
		// @402: goto @406
		// @405: athrow
		// @406: aload #6
		// @408: getfield int game.C_100087_n.field_100695_k
		// @40B: iconst_m1
		// @40C: ixor
		// @40D: bipush -7 (0xF9)
		// @40F: if_icmpne @489
		// @412: goto @416
		// @415: athrow
		// @416: aload_0
		// @417: aload #6
		// @419: getfield int game.C_100087_n.field_100704_z
		// @41C: putfield int game.C_100048_vi.field_104187_p
		// @41F: iload #19
		// @421: ifeq @489
		// @424: goto @428
		// @427: athrow
		// @428: aload_0
		// @429: getfield boolean game.C_100048_vi.field_104172_d
		// @42C: ifne @489
		// @42F: goto @433
		// @432: athrow
		// @433: iconst_m1
		// @434: iload_1
		// @435: iadd
		// @436: aload #6
		// @438: getfield int game.C_100087_n.field_100690_n
		// @43B: bipush -100 (0x9C)
		// @43D: iadd
		// @43E: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @441: aload_0
		// @442: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @445: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @448: getfield int game.C_100327_ib.field_102494_P
		// @44B: bipush 59 (0x3B)
		// @44D: invokestatic game.C_100183_cd.func_103414_b(int, byte)int
		// @450: aaload
		// @451: bipush 25 (0x19)
		// @453: aaload
		// @454: iconst_2
		// @455: iaload
		// @456: ineg
		// @457: isub
		// @458: if_icmpeq @463
		// @45B: goto @45F
		// @45E: athrow
		// @45F: goto @489
		// @462: athrow
		// @463: aload #6
		// @465: getfield int game.C_100087_n.field_100695_k
		// @468: iconst_3
		// @469: if_icmpeq @470
		// @46C: goto @489
		// @46F: athrow
		// @470: aload_0
		// @471: getfield boolean game.C_100048_vi.field_104185_r
		// @474: ifeq @47B
		// @477: goto @489
		// @47A: athrow
		// @47B: aload_0
		// @47C: iconst_0
		// @47D: putfield int game.C_100048_vi.field_104179_l
		// @480: aload_0
		// @481: sipush -5591 (0xEA29)
		// @484: aload #6
		// @486: invokespecial game.C_100048_vi.func_104163_a(int, game.C_100087_n)void
		// @489: aload_0
		// @48A: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @48D: getfield game.C_100202_qi game.C_100314_lf.field_101324_H
		// @490: bipush 101 (0x65)
		// @492: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @495: checkcast game.C_100087_n
		// @498: astore #6
		// @49A: iload #19
		// @49C: ifeq @354
		// @49F: aload_0
		// @4A0: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @4A3: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @4A6: bipush 116 (0x74)
		// @4A8: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @4AB: checkcast game.C_100087_n
		// @4AE: astore #6
		// @4B0: aload #6
		// @4B2: ifnull @53D
		// @4B5: iload_1
		// @4B6: iconst_m1
		// @4B7: ixor
		// @4B8: aload #6
		// @4BA: getfield int game.C_100087_n.field_100706_x
		// @4BD: iconst_m1
		// @4BE: ixor
		// @4BF: iload #19
		// @4C1: ifne @54F
		// @4C4: if_icmpne @527
		// @4C7: goto @4CB
		// @4CA: athrow
		// @4CB: iconst_m1
		// @4CC: aload #6
		// @4CE: getfield int game.C_100087_n.field_100695_k
		// @4D1: iconst_m1
		// @4D2: ixor
		// @4D3: if_icmpne @527
		// @4D6: goto @4DA
		// @4D9: athrow
		// @4DA: aload #6
		// @4DC: getfield int game.C_100087_n.field_100699_t
		// @4DF: iconst_m1
		// @4E0: ixor
		// @4E1: aload_0
		// @4E2: getfield int game.C_100048_vi.field_104176_a
		// @4E5: iconst_m1
		// @4E6: ixor
		// @4E7: if_icmplt @4FC
		// @4EA: goto @4EE
		// @4ED: athrow
		// @4EE: aload_0
		// @4EF: iconst_m1
		// @4F0: putfield int game.C_100048_vi.field_104170_f
		// @4F3: iload #19
		// @4F5: ifeq @505
		// @4F8: goto @4FC
		// @4FB: athrow
		// @4FC: aload_0
		// @4FD: iconst_1
		// @4FE: putfield int game.C_100048_vi.field_104170_f
		// @501: goto @505
		// @504: athrow
		// @505: iconst_m1
		// @506: aload_0
		// @507: getfield int game.C_100048_vi.field_104187_p
		// @50A: iconst_m1
		// @50B: ixor
		// @50C: if_icmpeq @527
		// @50F: aload_0
		// @510: getfield int game.C_100048_vi.field_104187_p
		// @513: aload_0
		// @514: getfield int game.C_100048_vi.field_104170_f
		// @517: if_icmpeq @527
		// @51A: goto @51E
		// @51D: athrow
		// @51E: aload_0
		// @51F: iconst_0
		// @520: putfield int game.C_100048_vi.field_104187_p
		// @523: goto @527
		// @526: athrow
		// @527: aload_0
		// @528: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @52B: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @52E: bipush 45 (0x2D)
		// @530: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @533: checkcast game.C_100087_n
		// @536: astore #6
		// @538: iload #19
		// @53A: ifeq @4B0
		// @53D: aconst_null
		// @53E: aload_2
		// @53F: if_acmpeq @649
		// @542: iload_1
		// @543: iconst_m1
		// @544: ixor
		// @545: goto @549
		// @548: athrow
		// @549: aload_2
		// @54A: getfield int game.C_100087_n.field_100706_x
		// @54D: iconst_m1
		// @54E: ixor
		// @54F: if_icmpeq @555
		// @552: goto @649
		// @555: bipush -4 (0xFC)
		// @557: aload_2
		// @558: getfield int game.C_100087_n.field_100695_k
		// @55B: iconst_m1
		// @55C: ixor
		// @55D: if_icmpne @598
		// @560: aload_0
		// @561: getfield boolean game.C_100048_vi.field_104185_r
		// @564: ifeq @587
		// @567: goto @56B
		// @56A: athrow
		// @56B: iconst_m1
		// @56C: aload_0
		// @56D: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @570: getfield int game.C_100314_lf.field_101412_Kb
		// @573: iconst_m1
		// @574: ixor
		// @575: if_icmpgt @587
		// @578: goto @57C
		// @57B: athrow
		// @57C: aload_0
		// @57D: getfield boolean game.C_100048_vi.field_104172_d
		// @580: ifeq @646
		// @583: goto @587
		// @586: athrow
		// @587: aload_0
		// @588: sipush -5591 (0xEA29)
		// @58B: aload_2
		// @58C: invokespecial game.C_100048_vi.func_104163_a(int, game.C_100087_n)void
		// @58F: iload #19
		// @591: ifeq @646
		// @594: goto @598
		// @597: athrow
		// @598: iconst_0
		// @599: aload_2
		// @59A: getfield int game.C_100087_n.field_100695_k
		// @59D: if_icmpeq @600
		// @5A0: goto @5A4
		// @5A3: athrow
		// @5A4: iconst_0
		// @5A5: aload_2
		// @5A6: getfield int game.C_100087_n.field_100695_k
		// @5A9: if_icmpeq @5C1
		// @5AC: goto @5B0
		// @5AF: athrow
		// @5B0: iconst_m1
		// @5B1: putstatic int game.C_100238_ol.field_101691_E
		// @5B4: iconst_m1
		// @5B5: putstatic int game.C_100249_pc.field_102326_E
		// @5B8: iload #19
		// @5BA: ifeq @646
		// @5BD: goto @5C1
		// @5C0: athrow
		// @5C1: aload_2
		// @5C2: astore #4
		// @5C4: aload_2
		// @5C5: getfield int game.C_100087_n.field_100699_t
		// @5C8: aload_0
		// @5C9: getfield int game.C_100048_vi.field_104176_a
		// @5CC: if_icmpgt @5DD
		// @5CF: aload_0
		// @5D0: iconst_m1
		// @5D1: putfield int game.C_100048_vi.field_104170_f
		// @5D4: iload #19
		// @5D6: ifeq @5E6
		// @5D9: goto @5DD
		// @5DC: athrow
		// @5DD: aload_0
		// @5DE: iconst_1
		// @5DF: putfield int game.C_100048_vi.field_104170_f
		// @5E2: goto @5E6
		// @5E5: athrow
		// @5E6: getstatic boolean game.C_100028_ha.field_103947_e
		// @5E9: ifeq @646
		// @5EC: iconst_0
		// @5ED: putstatic boolean game.C_100028_ha.field_103947_e
		// @5F0: aload_0
		// @5F1: bipush -11 (0xF5)
		// @5F3: aload_2
		// @5F4: invokespecial game.C_100048_vi.func_104161_a(byte, game.C_100087_n)void
		// @5F7: iload #19
		// @5F9: ifeq @646
		// @5FC: goto @600
		// @5FF: athrow
		// @600: aload_2
		// @601: astore #4
		// @603: aload_0
		// @604: getfield int game.C_100048_vi.field_104176_a
		// @607: iconst_m1
		// @608: ixor
		// @609: aload_2
		// @60A: getfield int game.C_100087_n.field_100699_t
		// @60D: iconst_m1
		// @60E: ixor
		// @60F: if_icmple @620
		// @612: aload_0
		// @613: iconst_1
		// @614: putfield int game.C_100048_vi.field_104170_f
		// @617: iload #19
		// @619: ifeq @629
		// @61C: goto @620
		// @61F: athrow
		// @620: aload_0
		// @621: iconst_m1
		// @622: putfield int game.C_100048_vi.field_104170_f
		// @625: goto @629
		// @628: athrow
		// @629: getstatic boolean game.C_100028_ha.field_103947_e
		// @62C: ifeq @646
		// @62F: iconst_0
		// @630: putstatic boolean game.C_100028_ha.field_103947_e
		// @633: getstatic game.C_100202_qi game.C_100265_mh.field_106586_D
		// @636: bipush -105 (0x97)
		// @638: invokevirtual game.C_100202_qi.func_105905_b(byte)void
		// @63B: aload_0
		// @63C: bipush -11 (0xF5)
		// @63E: aload_2
		// @63F: invokespecial game.C_100048_vi.func_104161_a(byte, game.C_100087_n)void
		// @642: goto @646
		// @645: athrow
		// @646: aload_2
		// @647: astore #4
		// @649: aload_0
		// @64A: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @64D: getfield game.C_100294_ki game.C_100314_lf.field_101350_l
		// @650: astore #6
		// @652: aload #6
		// @654: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @657: bipush 99 (0x63)
		// @659: aload_0
		// @65A: getfield int game.C_100048_vi.field_104176_a
		// @65D: ldc 954414084 (0x38e33404)
		// @65F: ishr
		// @660: invokevirtual game.C_100171_cn.func_105560_c(int, int)int
		// @663: ldc -185561852 (0xf4f08d04)
		// @665: ishl
		// @666: istore #7
		// @668: bipush 97 (0x61)
		// @66A: bipush 71 (0x47)
		// @66C: iload_3
		// @66D: isub
		// @66E: bipush 41 (0x29)
		// @670: idiv
		// @671: idiv
		// @672: istore #9
		// @674: aload #6
		// @676: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @679: sipush -25357 (0x9CF3)
		// @67C: aload_0
		// @67D: getfield int game.C_100048_vi.field_104176_a
		// @680: ldc 2005375300 (0x77879944)
		// @682: ishr
		// @683: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @686: ldc 535614276 (0x1fecd344)
		// @688: ishl
		// @689: istore #8
		// @68B: aload #6
		// @68D: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @690: ldc 830205956 (0x317bf004)
		// @692: aload_0
		// @693: getfield int game.C_100048_vi.field_104176_a
		// @696: ldc -641738332 (0xd9bfd9a4)
		// @698: ishr
		// @699: invokevirtual game.C_100171_cn.func_105563_a(int, int)int
		// @69C: ldc -1547544668 (0xa3c257a4)
		// @69E: ishl
		// @69F: istore #10
		// @6A1: iload #7
		// @6A3: istore #11
		// @6A5: aload_0
		// @6A6: getfield boolean game.C_100048_vi.field_104181_j
		// @6A9: ifne @6BB
		// @6AC: iload #8
		// @6AE: iload #10
		// @6B0: if_icmpeq @6BB
		// @6B3: goto @6B7
		// @6B6: athrow
		// @6B7: iload #8
		// @6B9: istore #11
		// @6BB: aload_0
		// @6BC: getfield int game.C_100048_vi.field_104178_o
		// @6BF: ineg
		// @6C0: istore #12
		// @6C2: iconst_m1
		// @6C3: aload_0
		// @6C4: getfield int game.C_100048_vi.field_104183_h
		// @6C7: iconst_m1
		// @6C8: ixor
		// @6C9: if_icmplt @6DC
		// @6CC: iload #11
		// @6CE: iload #12
		// @6D0: if_icmplt @6DC
		// @6D3: goto @6D7
		// @6D6: athrow
		// @6D7: iconst_1
		// @6D8: goto @6DD
		// @6DB: athrow
		// @6DC: iconst_0
		// @6DD: istore #13
		// @6DF: iload #12
		// @6E1: sipush 4000 (0x0FA0)
		// @6E4: iadd
		// @6E5: iload #11
		// @6E7: if_icmpge @704
		// @6EA: aload_0
		// @6EB: getfield boolean game.C_100048_vi.field_104181_j
		// @6EE: ifeq @6F9
		// @6F1: goto @6F5
		// @6F4: athrow
		// @6F5: goto @704
		// @6F8: athrow
		// @6F9: aload_0
		// @6FA: iconst_0
		// @6FB: putfield int game.C_100048_vi.field_104182_k
		// @6FE: aload_0
		// @6FF: iload #5
		// @701: putfield int game.C_100048_vi.field_104176_a
		// @704: iload #13
		// @706: ifne @907
		// @709: aload_0
		// @70A: dup
		// @70B: getfield int game.C_100048_vi.field_104183_h
		// @70E: aload #6
		// @710: getfield int game.C_100294_ki.field_106964_J
		// @713: iadd
		// @714: putfield int game.C_100048_vi.field_104183_h
		// @717: aload_0
		// @718: getfield boolean game.C_100048_vi.field_104172_d
		// @71B: ifne @726
		// @71E: goto @722
		// @721: athrow
		// @722: goto @738
		// @725: athrow
		// @726: aload_0
		// @727: dup
		// @728: getfield int game.C_100048_vi.field_104183_h
		// @72B: aload #6
		// @72D: getfield int game.C_100294_ki.field_106964_J
		// @730: iconst_3
		// @731: imul
		// @732: iconst_4
		// @733: idiv
		// @734: isub
		// @735: putfield int game.C_100048_vi.field_104183_h
		// @738: aload_0
		// @739: iconst_1
		// @73A: putfield boolean game.C_100048_vi.field_104185_r
		// @73D: aload_0
		// @73E: iconst_0
		// @73F: putfield int game.C_100048_vi.field_104179_l
		// @742: aload #6
		// @744: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @747: bipush -110 (0x92)
		// @749: aload_0
		// @74A: getfield int game.C_100048_vi.field_104176_a
		// @74D: ldc -1923794172 (0x8d553b04)
		// @74F: ishr
		// @750: invokevirtual game.C_100171_cn.func_105560_c(int, int)int
		// @753: ineg
		// @754: ldc 911187012 (0x364f9c44)
		// @756: ishl
		// @757: istore #14
		// @759: aload #6
		// @75B: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @75E: sipush -25357 (0x9CF3)
		// @761: aload_0
		// @762: getfield int game.C_100048_vi.field_104176_a
		// @765: ldc -87106844 (0xfacedae4)
		// @767: ishr
		// @768: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @76B: ineg
		// @76C: ldc -152337436 (0xf6eb83e4)
		// @76E: ishl
		// @76F: istore #15
		// @771: aload #6
		// @773: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @776: ldc 830205956 (0x317bf004)
		// @778: aload_0
		// @779: getfield int game.C_100048_vi.field_104176_a
		// @77C: ldc 923002084 (0x3703e4e4)
		// @77E: ishr
		// @77F: invokevirtual game.C_100171_cn.func_105563_a(int, int)int
		// @782: ineg
		// @783: ldc 467801668 (0x1be21644)
		// @785: ishl
		// @786: istore #16
		// @788: aload_0
		// @789: iload #14
		// @78B: iload #15
		// @78D: if_icmpeq @7A6
		// @790: aload_0
		// @791: getfield int game.C_100048_vi.field_104178_o
		// @794: iconst_m1
		// @795: ixor
		// @796: iload #15
		// @798: iconst_m1
		// @799: ixor
		// @79A: if_icmpge @7A6
		// @79D: goto @7A1
		// @7A0: athrow
		// @7A1: iconst_1
		// @7A2: goto @7A7
		// @7A5: athrow
		// @7A6: iconst_0
		// @7A7: putfield boolean game.C_100048_vi.field_104181_j
		// @7AA: aload_0
		// @7AB: getfield boolean game.C_100048_vi.field_104181_j
		// @7AE: ifne @824
		// @7B1: iload #15
		// @7B3: iload #16
		// @7B5: if_icmpne @7F0
		// @7B8: goto @7BC
		// @7BB: athrow
		// @7BC: aload_0
		// @7BD: getfield int game.C_100048_vi.field_104178_o
		// @7C0: iconst_m1
		// @7C1: ixor
		// @7C2: iload #14
		// @7C4: iconst_m1
		// @7C5: ixor
		// @7C6: if_icmpge @902
		// @7C9: goto @7CD
		// @7CC: athrow
		// @7CD: aload_0
		// @7CE: dup
		// @7CF: getfield int game.C_100048_vi.field_104183_h
		// @7D2: iconst_5
		// @7D3: isub
		// @7D4: putfield int game.C_100048_vi.field_104183_h
		// @7D7: aload_0
		// @7D8: dup
		// @7D9: getfield int game.C_100048_vi.field_104182_k
		// @7DC: iconst_2
		// @7DD: idiv
		// @7DE: putfield int game.C_100048_vi.field_104182_k
		// @7E1: aload_0
		// @7E2: iload #14
		// @7E4: putfield int game.C_100048_vi.field_104178_o
		// @7E7: iload #19
		// @7E9: ifeq @902
		// @7EC: goto @7F0
		// @7EF: athrow
		// @7F0: aload_0
		// @7F1: getfield int game.C_100048_vi.field_104178_o
		// @7F4: iconst_m1
		// @7F5: ixor
		// @7F6: iload #15
		// @7F8: iconst_m1
		// @7F9: ixor
		// @7FA: if_icmplt @805
		// @7FD: goto @801
		// @800: athrow
		// @801: goto @902
		// @804: athrow
		// @805: aload_0
		// @806: iload #15
		// @808: putfield int game.C_100048_vi.field_104178_o
		// @80B: aload_0
		// @80C: dup
		// @80D: getfield int game.C_100048_vi.field_104182_k
		// @810: iconst_2
		// @811: idiv
		// @812: putfield int game.C_100048_vi.field_104182_k
		// @815: aload_0
		// @816: dup
		// @817: getfield int game.C_100048_vi.field_104183_h
		// @81A: iconst_5
		// @81B: isub
		// @81C: putfield int game.C_100048_vi.field_104183_h
		// @81F: iload #19
		// @821: ifeq @902
		// @824: iload #16
		// @826: iload #15
		// @828: if_icmpne @833
		// @82B: goto @82F
		// @82E: athrow
		// @82F: goto @8EB
		// @832: athrow
		// @833: iload #16
		// @835: aload_0
		// @836: getfield int game.C_100048_vi.field_104178_o
		// @839: if_icmpgt @8DC
		// @83C: iload #16
		// @83E: aload_0
		// @83F: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @842: getfield int game.C_100314_lf.field_101299_xc
		// @845: ldc -1325380732 (0xb1004b84)
		// @847: ishl
		// @848: iadd
		// @849: istore #16
		// @84B: iload #16
		// @84D: iconst_m1
		// @84E: ixor
		// @84F: aload_0
		// @850: getfield int game.C_100048_vi.field_104178_o
		// @853: iconst_m1
		// @854: ixor
		// @855: if_icmpge @8EB
		// @858: aload #6
		// @85A: aload_0
		// @85B: getfield int game.C_100048_vi.field_104176_a
		// @85E: bipush -94 (0xA2)
		// @860: invokevirtual game.C_100294_ki.func_106929_c(int, byte)boolean
		// @863: ifne @86E
		// @866: goto @86A
		// @869: athrow
		// @86A: goto @8EB
		// @86D: athrow
		// @86E: aload #6
		// @870: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @873: sipush -25357 (0x9CF3)
		// @876: iload #5
		// @878: ldc -1677931708 (0x9bfccb44)
		// @87A: ishr
		// @87B: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @87E: aload #6
		// @880: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @883: ldc 830205956 (0x317bf004)
		// @885: iload #5
		// @887: ldc 2127998212 (0x7ed6ad04)
		// @889: ishr
		// @88A: invokevirtual game.C_100171_cn.func_105563_a(int, int)int
		// @88D: if_icmpeq @8B8
		// @890: aload_0
		// @891: iload #16
		// @893: putfield int game.C_100048_vi.field_104178_o
		// @896: iconst_m1
		// @897: aload_0
		// @898: getfield int game.C_100048_vi.field_104183_h
		// @89B: iconst_m1
		// @89C: ixor
		// @89D: if_icmpge @8EB
		// @8A0: goto @8A4
		// @8A3: athrow
		// @8A4: aload_0
		// @8A5: aload_0
		// @8A6: getfield int game.C_100048_vi.field_104183_h
		// @8A9: ineg
		// @8AA: iconst_2
		// @8AB: idiv
		// @8AC: putfield int game.C_100048_vi.field_104183_h
		// @8AF: iload #19
		// @8B1: ifeq @8EB
		// @8B4: goto @8B8
		// @8B7: athrow
		// @8B8: aload_0
		// @8B9: aload_0
		// @8BA: getfield int game.C_100048_vi.field_104182_k
		// @8BD: ineg
		// @8BE: iconst_2
		// @8BF: idiv
		// @8C0: putfield int game.C_100048_vi.field_104182_k
		// @8C3: aload_0
		// @8C4: dup
		// @8C5: getfield int game.C_100048_vi.field_104183_h
		// @8C8: iconst_2
		// @8C9: idiv
		// @8CA: putfield int game.C_100048_vi.field_104183_h
		// @8CD: aload_0
		// @8CE: iload #5
		// @8D0: putfield int game.C_100048_vi.field_104176_a
		// @8D3: iload #19
		// @8D5: ifeq @8EB
		// @8D8: goto @8DC
		// @8DB: athrow
		// @8DC: aload_0
		// @8DD: iload #15
		// @8DF: putfield int game.C_100048_vi.field_104178_o
		// @8E2: aload_0
		// @8E3: iconst_0
		// @8E4: putfield boolean game.C_100048_vi.field_104181_j
		// @8E7: goto @8EB
		// @8EA: athrow
		// @8EB: iload #14
		// @8ED: iconst_m1
		// @8EE: ixor
		// @8EF: aload_0
		// @8F0: getfield int game.C_100048_vi.field_104178_o
		// @8F3: iconst_m1
		// @8F4: ixor
		// @8F5: if_icmpgt @8FC
		// @8F8: goto @902
		// @8FB: athrow
		// @8FC: aload_0
		// @8FD: iload #14
		// @8FF: putfield int game.C_100048_vi.field_104178_o
		// @902: iload #19
		// @904: ifeq @C02
		// @907: aload_0
		// @908: getfield int game.C_100048_vi.field_104183_h
		// @90B: invokestatic java.lang.Math.abs(int)int
		// @90E: aload_0
		// @90F: getfield int game.C_100048_vi.field_104182_k
		// @912: invokestatic java.lang.Math.abs(int)int
		// @915: if_icmpgt @988
		// @918: goto @91C
		// @91B: athrow
		// @91C: aload_0
		// @91D: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @920: ldc 312774288 (0x12a48e90)
		// @922: bipush 28 (0x1C)
		// @924: invokevirtual game.C_100314_lf.func_101268_f(int, int)boolean
		// @927: ifne @971
		// @92A: goto @92E
		// @92D: athrow
		// @92E: aload_0
		// @92F: getfield int game.C_100048_vi.field_104182_k
		// @932: iconst_m1
		// @933: ixor
		// @934: iconst_m1
		// @935: if_icmple @950
		// @938: goto @93C
		// @93B: athrow
		// @93C: aload_0
		// @93D: aload_0
		// @93E: getfield int game.C_100048_vi.field_104182_k
		// @941: ineg
		// @942: bipush 9 (0x09)
		// @944: imul
		// @945: bipush 10 (0x0A)
		// @947: idiv
		// @948: ineg
		// @949: putfield int game.C_100048_vi.field_104182_k
		// @94C: goto @950
		// @94F: athrow
		// @950: iconst_m1
		// @951: aload_0
		// @952: getfield int game.C_100048_vi.field_104182_k
		// @955: iconst_m1
		// @956: ixor
		// @957: if_icmple @991
		// @95A: aload_0
		// @95B: aload_0
		// @95C: getfield int game.C_100048_vi.field_104182_k
		// @95F: bipush 9 (0x09)
		// @961: imul
		// @962: bipush 10 (0x0A)
		// @964: idiv
		// @965: putfield int game.C_100048_vi.field_104182_k
		// @968: iload #19
		// @96A: ifeq @991
		// @96D: goto @971
		// @970: athrow
		// @971: aload_0
		// @972: bipush 7 (0x07)
		// @974: aload_0
		// @975: getfield int game.C_100048_vi.field_104182_k
		// @978: imul
		// @979: bipush 10 (0x0A)
		// @97B: idiv
		// @97C: putfield int game.C_100048_vi.field_104182_k
		// @97F: iload #19
		// @981: ifeq @991
		// @984: goto @988
		// @987: athrow
		// @988: aload_0
		// @989: iconst_0
		// @98A: putfield int game.C_100048_vi.field_104182_k
		// @98D: goto @991
		// @990: athrow
		// @991: aload #6
		// @993: getfield boolean game.C_100294_ki.field_106963_eb
		// @996: ifeq @99D
		// @999: goto @AF4
		// @99C: athrow
		// @99D: iconst_0
		// @99E: aload_0
		// @99F: getfield int game.C_100048_vi.field_104187_p
		// @9A2: if_icmpeq @9E5
		// @9A5: aload_0
		// @9A6: getfield boolean game.C_100048_vi.field_104181_j
		// @9A9: ifne @9E5
		// @9AC: goto @9B0
		// @9AF: athrow
		// @9B0: sipush 250 (0x00FA)
		// @9B3: aload #6
		// @9B5: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @9B8: sipush -25357 (0x9CF3)
		// @9BB: aload_0
		// @9BC: getfield int game.C_100048_vi.field_104176_a
		// @9BF: ldc 1150600612 (0x4494c5a4)
		// @9C1: ishr
		// @9C2: aload_0
		// @9C3: getfield int game.C_100048_vi.field_104187_p
		// @9C6: bipush 10 (0x0A)
		// @9C8: imul
		// @9C9: iadd
		// @9CA: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @9CD: aload_0
		// @9CE: getfield int game.C_100048_vi.field_104178_o
		// @9D1: ldc -95354652 (0xfa5100e4)
		// @9D3: ishr
		// @9D4: iadd
		// @9D5: if_icmpge @9E5
		// @9D8: goto @9DC
		// @9DB: athrow
		// @9DC: aload_0
		// @9DD: iconst_0
		// @9DE: putfield int game.C_100048_vi.field_104187_p
		// @9E1: goto @9E5
		// @9E4: athrow
		// @9E5: aload_0
		// @9E6: getfield int game.C_100048_vi.field_104187_p
		// @9E9: iconst_m1
		// @9EA: ixor
		// @9EB: iconst_m1
		// @9EC: if_icmpeq @AF4
		// @9EF: aload_0
		// @9F0: aload_0
		// @9F1: getfield int game.C_100048_vi.field_104187_p
		// @9F4: putfield int game.C_100048_vi.field_104170_f
		// @9F7: iconst_0
		// @9F8: aload_0
		// @9F9: getfield int game.C_100048_vi.field_104179_l
		// @9FC: if_icmplt @A07
		// @9FF: goto @A03
		// @A02: athrow
		// @A03: goto @A11
		// @A06: athrow
		// @A07: aload_0
		// @A08: dup
		// @A09: getfield int game.C_100048_vi.field_104179_l
		// @A0C: iconst_1
		// @A0D: isub
		// @A0E: putfield int game.C_100048_vi.field_104179_l
		// @A11: aload_0
		// @A12: getfield boolean game.C_100048_vi.field_104181_j
		// @A15: ifeq @A56
		// @A18: aload_0
		// @A19: aload #6
		// @A1B: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @A1E: bipush 67 (0x43)
		// @A20: aload_0
		// @A21: getfield int game.C_100048_vi.field_104170_f
		// @A24: bipush 10 (0x0A)
		// @A26: imul
		// @A27: aload_0
		// @A28: getfield int game.C_100048_vi.field_104176_a
		// @A2B: ldc -1801095964 (0x94a574e4)
		// @A2D: ishr
		// @A2E: iadd
		// @A2F: invokevirtual game.C_100171_cn.func_105560_c(int, int)int
		// @A32: aload_0
		// @A33: getfield int game.C_100048_vi.field_104178_o
		// @A36: ineg
		// @A37: ldc -434701212 (0xe616fc64)
		// @A39: ishr
		// @A3A: bipush -5 (0xFB)
		// @A3C: isub
		// @A3D: if_icmple @A4A
		// @A40: goto @A44
		// @A43: athrow
		// @A44: bipush 50 (0x32)
		// @A46: goto @A4E
		// @A49: athrow
		// @A4A: aload_0
		// @A4B: getfield int game.C_100048_vi.field_104179_l
		// @A4E: putfield int game.C_100048_vi.field_104179_l
		// @A51: iload #19
		// @A53: ifeq @A93
		// @A56: aload_0
		// @A57: aload #6
		// @A59: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @A5C: sipush -25357 (0x9CF3)
		// @A5F: aload_0
		// @A60: getfield int game.C_100048_vi.field_104176_a
		// @A63: ldc 281108996 (0x10c16204)
		// @A65: ishr
		// @A66: aload_0
		// @A67: getfield int game.C_100048_vi.field_104170_f
		// @A6A: bipush 10 (0x0A)
		// @A6C: imul
		// @A6D: iadd
		// @A6E: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @A71: iconst_m1
		// @A72: ixor
		// @A73: iconst_5
		// @A74: aload_0
		// @A75: getfield int game.C_100048_vi.field_104178_o
		// @A78: ineg
		// @A79: ldc 630413092 (0x25935724)
		// @A7B: ishr
		// @A7C: iadd
		// @A7D: iconst_m1
		// @A7E: ixor
		// @A7F: if_icmpge @A8C
		// @A82: goto @A86
		// @A85: athrow
		// @A86: bipush 50 (0x32)
		// @A88: goto @A90
		// @A8B: athrow
		// @A8C: aload_0
		// @A8D: getfield int game.C_100048_vi.field_104179_l
		// @A90: putfield int game.C_100048_vi.field_104179_l
		// @A93: bipush 39 (0x27)
		// @A95: aload_0
		// @A96: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @A99: getfield int game.C_100314_lf.field_101343_vb
		// @A9C: if_icmpne @AB9
		// @A9F: aload_0
		// @AA0: dup
		// @AA1: getfield int game.C_100048_vi.field_104176_a
		// @AA4: aload_0
		// @AA5: getfield int game.C_100048_vi.field_104170_f
		// @AA8: sipush 500 (0x01F4)
		// @AAB: imul
		// @AAC: iadd
		// @AAD: putfield int game.C_100048_vi.field_104176_a
		// @AB0: iload #19
		// @AB2: ifeq @AF4
		// @AB5: goto @AB9
		// @AB8: athrow
		// @AB9: aload_0
		// @ABA: dup
		// @ABB: getfield int game.C_100048_vi.field_104176_a
		// @ABE: aload_0
		// @ABF: getfield int game.C_100048_vi.field_104170_f
		// @AC2: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @AC5: aload_0
		// @AC6: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @AC9: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @ACC: getfield int game.C_100327_ib.field_102494_P
		// @ACF: bipush 59 (0x3B)
		// @AD1: invokestatic game.C_100183_cd.func_103414_b(int, byte)int
		// @AD4: aaload
		// @AD5: bipush 25 (0x19)
		// @AD7: aaload
		// @AD8: aload_0
		// @AD9: getfield int game.C_100048_vi.field_104179_l
		// @ADC: iconst_m1
		// @ADD: ixor
		// @ADE: iconst_m1
		// @ADF: if_icmpne @AEB
		// @AE2: goto @AE6
		// @AE5: athrow
		// @AE6: iconst_0
		// @AE7: goto @AEC
		// @AEA: athrow
		// @AEB: iconst_5
		// @AEC: iaload
		// @AED: iconst_3
		// @AEE: imul
		// @AEF: imul
		// @AF0: iadd
		// @AF1: putfield int game.C_100048_vi.field_104176_a
		// @AF4: aload #6
		// @AF6: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @AF9: bipush 63 (0x3F)
		// @AFB: aload_0
		// @AFC: getfield int game.C_100048_vi.field_104176_a
		// @AFF: ldc 1512510052 (0x5a271264)
		// @B01: ishr
		// @B02: invokevirtual game.C_100171_cn.func_105560_c(int, int)int
		// @B05: ineg
		// @B06: ldc -672078940 (0xd7f0e3a4)
		// @B08: ishl
		// @B09: istore #14
		// @B0B: aload #6
		// @B0D: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @B10: ldc 830205956 (0x317bf004)
		// @B12: aload_0
		// @B13: getfield int game.C_100048_vi.field_104176_a
		// @B16: ldc 205760804 (0xc43a924)
		// @B18: ishr
		// @B19: invokevirtual game.C_100171_cn.func_105563_a(int, int)int
		// @B1C: ineg
		// @B1D: ldc 162129348 (0x9a9e5c4)
		// @B1F: ishl
		// @B20: istore #15
		// @B22: aload #6
		// @B24: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @B27: sipush -25357 (0x9CF3)
		// @B2A: aload_0
		// @B2B: getfield int game.C_100048_vi.field_104176_a
		// @B2E: ldc 610236612 (0x245f78c4)
		// @B30: ishr
		// @B31: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @B34: ineg
		// @B35: ldc 1421223652 (0x54b626e4)
		// @B37: ishl
		// @B38: istore #16
		// @B3A: iload #14
		// @B3C: istore #17
		// @B3E: aload_0
		// @B3F: getfield boolean game.C_100048_vi.field_104181_j
		// @B42: ifne @B58
		// @B45: iload #15
		// @B47: iload #16
		// @B49: if_icmpne @B54
		// @B4C: goto @B50
		// @B4F: athrow
		// @B50: goto @B58
		// @B53: athrow
		// @B54: iload #16
		// @B56: istore #17
		// @B58: sipush 1024 (0x0400)
		// @B5B: istore #18
		// @B5D: iconst_0
		// @B5E: istore #13
		// @B60: aload_0
		// @B61: getfield int game.C_100048_vi.field_104178_o
		// @B64: iload #17
		// @B66: ineg
		// @B67: iadd
		// @B68: sipush 4000 (0x0FA0)
		// @B6B: if_icmple @B82
		// @B6E: aload_0
		// @B6F: iload #5
		// @B71: putfield int game.C_100048_vi.field_104176_a
		// @B74: aload_0
		// @B75: iconst_0
		// @B76: putfield int game.C_100048_vi.field_104182_k
		// @B79: iload #19
		// @B7B: ifeq @BA0
		// @B7E: goto @B82
		// @B81: athrow
		// @B82: aload_0
		// @B83: getfield int game.C_100048_vi.field_104178_o
		// @B86: iconst_m1
		// @B87: ixor
		// @B88: iload #17
		// @B8A: iload #18
		// @B8C: ineg
		// @B8D: iadd
		// @B8E: iconst_m1
		// @B8F: ixor
		// @B90: if_icmpgt @BA0
		// @B93: goto @B97
		// @B96: athrow
		// @B97: aload_0
		// @B98: iload #17
		// @B9A: putfield int game.C_100048_vi.field_104178_o
		// @B9D: iconst_1
		// @B9E: istore #13
		// @BA0: aload_0
		// @BA1: iconst_0
		// @BA2: putfield boolean game.C_100048_vi.field_104185_r
		// @BA5: aload_0
		// @BA6: iload #16
		// @BA8: iconst_m1
		// @BA9: ixor
		// @BAA: iload #14
		// @BAC: iconst_m1
		// @BAD: ixor
		// @BAE: if_icmpeq @BC7
		// @BB1: aload_0
		// @BB2: getfield int game.C_100048_vi.field_104178_o
		// @BB5: iconst_m1
		// @BB6: ixor
		// @BB7: iload #16
		// @BB9: iconst_m1
		// @BBA: ixor
		// @BBB: if_icmpge @BC7
		// @BBE: goto @BC2
		// @BC1: athrow
		// @BC2: iconst_1
		// @BC3: goto @BC8
		// @BC6: athrow
		// @BC7: iconst_0
		// @BC8: putfield boolean game.C_100048_vi.field_104181_j
		// @BCB: aload_0
		// @BCC: iconst_0
		// @BCD: putfield boolean game.C_100048_vi.field_104172_d
		// @BD0: iload #13
		// @BD2: ifne @BF9
		// @BD5: aload_0
		// @BD6: aload_0
		// @BD7: getfield int game.C_100048_vi.field_104180_m
		// @BDA: aload_0
		// @BDB: getfield int game.C_100048_vi.field_104170_f
		// @BDE: imul
		// @BDF: putfield int game.C_100048_vi.field_104182_k
		// @BE2: aload_0
		// @BE3: dup
		// @BE4: getfield int game.C_100048_vi.field_104183_h
		// @BE7: aload #6
		// @BE9: getfield int game.C_100294_ki.field_106964_J
		// @BEC: iadd
		// @BED: putfield int game.C_100048_vi.field_104183_h
		// @BF0: iload #19
		// @BF2: ifeq @C02
		// @BF5: goto @BF9
		// @BF8: athrow
		// @BF9: aload_0
		// @BFA: iconst_0
		// @BFB: putfield int game.C_100048_vi.field_104183_h
		// @BFE: goto @C02
		// @C01: athrow
		// @C02: aload #4
		// @C04: areturn
		// @C05: astore #4
		// @C07: aload #4
		// @C09: new java.lang.StringBuilder
		// @C0C: dup
		// @C0D: invokespecial java.lang.StringBuilder.<init>()void
		// @C10: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @C13: bipush 13 (0x0D)
		// @C15: aaload
		// @C16: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C19: iload_1
		// @C1A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C1D: bipush 44 (0x2C)
		// @C1F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C22: aload_2
		// @C23: ifnull @C2F
		// @C26: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @C29: iconst_0
		// @C2A: aaload
		// @C2B: goto @C34
		// @C2E: athrow
		// @C2F: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @C32: iconst_2
		// @C33: aaload
		// @C34: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C37: bipush 44 (0x2C)
		// @C39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C3C: iload_3
		// @C3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C40: bipush 41 (0x29)
		// @C42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C45: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C48: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C4B: athrow
	}
	
	public static void func_104168_a(boolean arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100048_vi.field_104184_i
		// @04: iload_0
		// @05: ifeq @11
		// @08: bipush 22 (0x16)
		// @0A: putstatic int game.C_100048_vi.field_104186_q
		// @0D: goto @11
		// @10: athrow
		// @11: aconst_null
		// @12: putstatic java.lang.String game.C_100048_vi.field_104175_c
		// @15: goto @3A
		// @18: astore_1
		// @19: aload_1
		// @1A: new java.lang.StringBuilder
		// @1D: dup
		// @1E: invokespecial java.lang.StringBuilder.<init>()void
		// @21: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @24: bipush 10 (0x0A)
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: iload_0
		// @2B: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @2E: bipush 41 (0x29)
		// @30: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @33: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @36: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @39: athrow
		// @3A: return
	}
	
	private final void func_104161_a(byte arg0, C_100087_n arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: aload_2
		// @006: getfield int game.C_100087_n.field_100699_t
		// @009: aload_0
		// @00A: getfield int game.C_100048_vi.field_104176_a
		// @00D: if_icmpgt @01E
		// @010: aload_0
		// @011: iconst_m1
		// @012: putfield int game.C_100048_vi.field_104170_f
		// @015: iload #5
		// @017: ifeq @027
		// @01A: goto @01E
		// @01D: athrow
		// @01E: aload_0
		// @01F: iconst_1
		// @020: putfield int game.C_100048_vi.field_104170_f
		// @023: goto @027
		// @026: athrow
		// @027: aconst_null
		// @028: aload_0
		// @029: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @02C: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @02F: if_acmpeq @036
		// @032: goto @037
		// @035: athrow
		// @036: return
		// @037: aload_0
		// @038: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @03B: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @03E: aload_0
		// @03F: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @042: iconst_0
		// @043: anewarray game.C_100327_ib
		// @046: aload_2
		// @047: getfield int game.C_100087_n.field_100693_m
		// @04A: aload_0
		// @04B: getfield int game.C_100048_vi.field_104170_f
		// @04E: imul
		// @04F: aload_2
		// @050: getfield int game.C_100087_n.field_100704_z
		// @053: bipush -128 (0x80)
		// @055: invokevirtual game.C_100327_ib.func_102448_a(game.C_100314_lf, game.C_100327_ib[], int, int, int)game.C_100327_ib[]
		// @058: astore_3
		// @059: aload_0
		// @05A: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @05D: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @060: bipush 126 (0x7E)
		// @062: aload_2
		// @063: getfield int game.C_100087_n.field_100693_m
		// @066: aload_0
		// @067: getfield int game.C_100048_vi.field_104170_f
		// @06A: imul
		// @06B: aload_2
		// @06C: getfield int game.C_100087_n.field_100704_z
		// @06F: invokevirtual game.C_100327_ib.func_102459_a(byte, int, int)void
		// @072: aload_0
		// @073: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @076: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @079: bipush -112 (0x90)
		// @07B: aload_0
		// @07C: getfield int game.C_100048_vi.field_104176_a
		// @07F: aload_0
		// @080: getfield int game.C_100048_vi.field_104178_o
		// @083: aload_0
		// @084: getfield int game.C_100048_vi.field_104170_f
		// @087: invokevirtual game.C_100327_ib.func_102438_a(int, int, int, int)void
		// @08A: iload_1
		// @08B: bipush -11 (0xF5)
		// @08D: if_icmpeq @099
		// @090: aload_0
		// @091: iconst_0
		// @092: putfield boolean game.C_100048_vi.field_104181_j
		// @095: goto @099
		// @098: athrow
		// @099: iconst_0
		// @09A: istore #4
		// @09C: iload #4
		// @09E: iconst_m1
		// @09F: ixor
		// @0A0: aload_3
		// @0A1: arraylength
		// @0A2: iconst_m1
		// @0A3: ixor
		// @0A4: if_icmple @0C4
		// @0A7: aload_0
		// @0A8: bipush -18 (0xEE)
		// @0AA: aload_3
		// @0AB: iload #4
		// @0AD: aaload
		// @0AE: aload_2
		// @0AF: invokespecial game.C_100048_vi.func_104156_a(byte, game.C_100327_ib, game.C_100087_n)void
		// @0B2: aload_3
		// @0B3: arraylength
		// @0B4: istore #4
		// @0B6: iload #5
		// @0B8: ifne @103
		// @0BB: iload #5
		// @0BD: ifeq @09C
		// @0C0: goto @0C4
		// @0C3: athrow
		// @0C4: goto @103
		// @0C7: astore_3
		// @0C8: aload_3
		// @0C9: new java.lang.StringBuilder
		// @0CC: dup
		// @0CD: invokespecial java.lang.StringBuilder.<init>()void
		// @0D0: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @0D3: bipush 11 (0x0B)
		// @0D5: aaload
		// @0D6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D9: iload_1
		// @0DA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0DD: bipush 44 (0x2C)
		// @0DF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E2: aload_2
		// @0E3: ifnull @0EF
		// @0E6: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @0E9: iconst_0
		// @0EA: aaload
		// @0EB: goto @0F4
		// @0EE: athrow
		// @0EF: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @0F2: iconst_2
		// @0F3: aaload
		// @0F4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F7: bipush 41 (0x29)
		// @0F9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0FF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @102: athrow
		// @103: return
	}
	
	static final C_100153_be[] func_104164_a(int arg0, int arg1, C_100098_h arg2, int arg3)
	{
		// @00: iload_1
		// @01: iconst_1
		// @02: aload_2
		// @03: iload_0
		// @04: invokestatic game.C_100333_ij.func_107341_a(int, boolean, game.C_100098_h, int)boolean
		// @07: ifeq @0E
		// @0A: goto @10
		// @0D: athrow
		// @0E: aconst_null
		// @0F: areturn
		// @10: iload_3
		// @11: bipush 43 (0x2B)
		// @13: if_icmpeq @28
		// @16: bipush -31 (0xE1)
		// @18: bipush 111 (0x6F)
		// @1A: aconst_null
		// @1B: checkcast game.C_100098_h
		// @1E: bipush -43 (0xD5)
		// @20: invokestatic game.C_100048_vi.func_104164_a(int, int, game.C_100098_h, int)game.C_100153_be[]
		// @23: pop
		// @24: goto @28
		// @27: athrow
		// @28: iconst_1
		// @29: invokestatic game.C_100176_ci.func_105616_a(int)game.C_100153_be[]
		// @2C: areturn
		// @2D: astore #4
		// @2F: aload #4
		// @31: new java.lang.StringBuilder
		// @34: dup
		// @35: invokespecial java.lang.StringBuilder.<init>()void
		// @38: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @3B: iconst_5
		// @3C: aaload
		// @3D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @40: iload_0
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 44 (0x2C)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: iload_1
		// @4A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4D: bipush 44 (0x2C)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: aload_2
		// @53: ifnull @5F
		// @56: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @59: iconst_0
		// @5A: aaload
		// @5B: goto @64
		// @5E: athrow
		// @5F: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @62: iconst_2
		// @63: aaload
		// @64: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @67: bipush 44 (0x2C)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: iload_3
		// @6D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @70: bipush 41 (0x29)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @78: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7B: athrow
	}
	
	static final int func_104159_a(int arg0, boolean arg1, boolean arg2, String arg3, String arg4, byte arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #9
		// @005: aconst_null
		// @006: getstatic game.C_100286_nl game.C_100318_hj.field_107194_f
		// @009: if_acmpne @022
		// @00C: iload_1
		// @00D: iload #5
		// @00F: bipush -116 (0x8C)
		// @011: iadd
		// @012: invokestatic game.C_100051_ea.func_103302_a(boolean, int)boolean
		// @015: istore #6
		// @017: iload #6
		// @019: ifeq @020
		// @01C: goto @022
		// @01F: athrow
		// @020: iconst_m1
		// @021: ireturn
		// @022: getstatic game.C_100268_mk game.C_100066_dl.field_101642_t
		// @025: getstatic game.C_100268_mk game.C_100293_kj.field_106891_a
		// @028: if_acmpeq @02F
		// @02B: goto @08C
		// @02E: athrow
		// @02F: iload_1
		// @030: ifeq @04B
		// @033: aload #4
		// @035: getstatic long game.C_100299_kd.field_107029_g
		// @038: aconst_null
		// @039: bipush -87 (0xA9)
		// @03B: iconst_0
		// @03C: invokestatic game.C_100113_ek.func_104869_a(java.lang.String, long, java.lang.String, byte, boolean)game.C_100107_u
		// @03F: putstatic game.C_100107_u game.C_100074_g.field_104412_c
		// @042: iload #9
		// @044: ifeq @05B
		// @047: goto @04B
		// @04A: athrow
		// @04B: aload #4
		// @04D: iconst_0
		// @04E: aload_3
		// @04F: bipush 125 (0x7D)
		// @051: invokestatic game.C_100003_ga.func_103506_a(java.lang.String, boolean, java.lang.String, int)game.C_100107_u
		// @054: putstatic game.C_100107_u game.C_100074_g.field_104412_c
		// @057: goto @05B
		// @05A: athrow
		// @05B: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @05E: iconst_0
		// @05F: putfield int game.C_100278_nd.field_101177_n
		// @062: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @065: sipush 7838 (0x1E9E)
		// @068: bipush 14 (0x0E)
		// @06A: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @06D: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @070: sipush 7838 (0x1E9E)
		// @073: getstatic game.C_100107_u game.C_100074_g.field_104412_c
		// @076: iconst_0
		// @077: invokevirtual game.C_100107_u.func_104766_b(int)game.C_100013_fn
		// @07A: getfield int game.C_100013_fn.field_103740_e
		// @07D: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @080: iconst_m1
		// @081: bipush -106 (0x96)
		// @083: invokestatic game.C_100306_kn.func_107128_a(int, byte)void
		// @086: getstatic game.C_100268_mk game.C_100223_ab.field_106102_a
		// @089: putstatic game.C_100268_mk game.C_100066_dl.field_101642_t
		// @08C: getstatic game.C_100268_mk game.C_100066_dl.field_101642_t
		// @08F: getstatic game.C_100268_mk game.C_100223_ab.field_106102_a
		// @092: if_acmpeq @099
		// @095: goto @0DD
		// @098: athrow
		// @099: iconst_1
		// @09A: bipush 51 (0x33)
		// @09C: invokestatic game.C_100114_q.func_100483_a(int, byte)boolean
		// @09F: ifne @0A6
		// @0A2: goto @0DD
		// @0A5: athrow
		// @0A6: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @0A9: iconst_0
		// @0AA: invokevirtual game.C_100278_nd.func_101156_c(boolean)int
		// @0AD: istore #6
		// @0AF: iload #6
		// @0B1: ifeq @0CC
		// @0B4: iconst_m1
		// @0B5: putstatic int game.C_100056_de.field_103194_Y
		// @0B8: getstatic game.C_100268_mk game.C_100099_fb.field_103049_r
		// @0BB: putstatic game.C_100268_mk game.C_100066_dl.field_101642_t
		// @0BE: iload #6
		// @0C0: putstatic int game.C_100299_kd.field_107051_z
		// @0C3: iload #9
		// @0C5: ifeq @0D6
		// @0C8: goto @0CC
		// @0CB: athrow
		// @0CC: getstatic game.C_100268_mk game.C_100290_jm.field_106856_f
		// @0CF: putstatic game.C_100268_mk game.C_100066_dl.field_101642_t
		// @0D2: goto @0D6
		// @0D5: athrow
		// @0D6: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @0D9: iconst_0
		// @0DA: putfield int game.C_100278_nd.field_101177_n
		// @0DD: getstatic game.C_100268_mk game.C_100290_jm.field_106856_f
		// @0E0: getstatic game.C_100268_mk game.C_100066_dl.field_101642_t
		// @0E3: if_acmpeq @0EA
		// @0E6: goto @11C
		// @0E9: athrow
		// @0EA: bipush 8 (0x08)
		// @0EC: bipush 51 (0x33)
		// @0EE: invokestatic game.C_100114_q.func_100483_a(int, byte)boolean
		// @0F1: ifeq @11C
		// @0F4: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @0F7: sipush -16142 (0xC0F2)
		// @0FA: invokevirtual game.C_100278_nd.func_101161_i(int)long
		// @0FD: putstatic long game.C_100295_kh.field_105305_q
		// @100: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @103: iconst_0
		// @104: putfield int game.C_100278_nd.field_101177_n
		// @107: iload_2
		// @108: ldc 79790160 (0x4c18050)
		// @10A: iload_0
		// @10B: getstatic game.C_100107_u game.C_100074_g.field_104412_c
		// @10E: iload_1
		// @10F: invokestatic game.C_100330_ig.func_107279_a(boolean, int, int, game.C_100107_u, boolean)void
		// @112: getstatic game.C_100268_mk game.C_100205_qf.field_103679_e
		// @115: putstatic game.C_100268_mk game.C_100066_dl.field_101642_t
		// @118: goto @11C
		// @11B: athrow
		// @11C: getstatic game.C_100268_mk game.C_100205_qf.field_103679_e
		// @11F: getstatic game.C_100268_mk game.C_100066_dl.field_101642_t
		// @122: if_acmpeq @129
		// @125: goto @19D
		// @128: athrow
		// @129: iconst_1
		// @12A: bipush 51 (0x33)
		// @12C: invokestatic game.C_100114_q.func_100483_a(int, byte)boolean
		// @12F: ifeq @19D
		// @132: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @135: iconst_0
		// @136: invokevirtual game.C_100278_nd.func_101156_c(boolean)int
		// @139: istore #6
		// @13B: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @13E: iconst_0
		// @13F: putfield int game.C_100278_nd.field_101177_n
		// @142: aconst_null
		// @143: putstatic java.lang.String game.C_100253_ph.field_101097_G
		// @146: iload #6
		// @148: putstatic int game.C_100299_kd.field_107051_z
		// @14B: iconst_m1
		// @14C: iload #6
		// @14E: iconst_m1
		// @14F: ixor
		// @150: if_icmpeq @15D
		// @153: iload #6
		// @155: iconst_1
		// @156: if_icmpne @170
		// @159: goto @15D
		// @15C: athrow
		// @15D: getstatic game.C_100268_mk game.C_100315_la.field_107179_c
		// @160: putstatic game.C_100268_mk game.C_100066_dl.field_101642_t
		// @163: iconst_m1
		// @164: putstatic int game.C_100056_de.field_103194_Y
		// @167: iload #9
		// @169: ifeq @19D
		// @16C: goto @170
		// @16F: athrow
		// @170: bipush -9 (0xF7)
		// @172: iload #6
		// @174: iconst_m1
		// @175: ixor
		// @176: if_icmpeq @190
		// @179: goto @17D
		// @17C: athrow
		// @17D: iconst_m1
		// @17E: putstatic int game.C_100056_de.field_103194_Y
		// @181: getstatic game.C_100268_mk game.C_100099_fb.field_103049_r
		// @184: putstatic game.C_100268_mk game.C_100066_dl.field_101642_t
		// @187: iload #9
		// @189: ifeq @19D
		// @18C: goto @190
		// @18F: athrow
		// @190: sipush 13313 (0x3401)
		// @193: invokestatic game.C_100095_fe.func_103371_l(int)void
		// @196: iconst_0
		// @197: putstatic boolean game.C_100208_qg.field_105957_e
		// @19A: iload #6
		// @19C: ireturn
		// @19D: getstatic game.C_100268_mk game.C_100315_la.field_107179_c
		// @1A0: getstatic game.C_100268_mk game.C_100066_dl.field_101642_t
		// @1A3: if_acmpeq @1AA
		// @1A6: goto @3F0
		// @1A9: athrow
		// @1AA: iconst_0
		// @1AB: invokestatic game.C_100149_bi.func_105150_b(int)boolean
		// @1AE: ifeq @3F0
		// @1B1: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @1B4: sipush -16142 (0xC0F2)
		// @1B7: invokevirtual game.C_100278_nd.func_101161_i(int)long
		// @1BA: putstatic long game.C_100299_kd.field_107029_g
		// @1BD: aload #4
		// @1BF: putstatic java.lang.String game.C_100137_bn.field_105033_d
		// @1C2: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @1C5: iconst_0
		// @1C6: invokevirtual game.C_100278_nd.func_101156_c(boolean)int
		// @1C9: putstatic int game.C_100107_u.field_104770_g
		// @1CC: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @1CF: iconst_0
		// @1D0: invokevirtual game.C_100278_nd.func_101156_c(boolean)int
		// @1D3: putstatic int game.C_100244_pe.field_106379_a
		// @1D6: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @1D9: iload #5
		// @1DB: bipush -118 (0x8A)
		// @1DD: ixor
		// @1DE: invokevirtual game.C_100278_nd.func_101143_l(int)int
		// @1E1: putstatic int game.C_100212_qc.field_105976_b
		// @1E4: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @1E7: iload #5
		// @1E9: bipush -8 (0xF8)
		// @1EB: ixor
		// @1EC: invokevirtual game.C_100278_nd.func_101163_j(int)java.lang.String
		// @1EF: astore #6
		// @1F1: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @1F4: iconst_0
		// @1F5: invokevirtual game.C_100278_nd.func_101156_c(boolean)int
		// @1F8: istore #7
		// @1FA: iconst_m1
		// @1FB: iconst_1
		// @1FC: iload #7
		// @1FE: iand
		// @1FF: iconst_m1
		// @200: ixor
		// @201: if_icmpeq @20D
		// @204: ldc 1394585825 (0x531fb0e1)
		// @206: invokestatic game.C_100001_ge.func_100554_a(int)void
		// @209: goto @20D
		// @20C: athrow
		// @20D: iload #7
		// @20F: bipush 16 (0x10)
		// @211: iand
		// @212: ifeq @21A
		// @215: iconst_1
		// @216: goto @21B
		// @219: athrow
		// @21A: iconst_0
		// @21B: putstatic boolean game.C_100195_rc.field_105773_c
		// @21E: iload_1
		// @21F: ifeq @226
		// @222: goto @26E
		// @225: athrow
		// @226: iconst_2
		// @227: iload #7
		// @229: iand
		// @22A: iconst_m1
		// @22B: ixor
		// @22C: iconst_m1
		// @22D: if_icmpeq @235
		// @230: iconst_1
		// @231: goto @236
		// @234: athrow
		// @235: iconst_0
		// @236: putstatic boolean game.C_100164_se.field_105449_g
		// @239: iload #7
		// @23B: iconst_4
		// @23C: iand
		// @23D: iconst_m1
		// @23E: ixor
		// @23F: iconst_m1
		// @240: if_icmpeq @248
		// @243: iconst_1
		// @244: goto @249
		// @247: athrow
		// @248: iconst_0
		// @249: putstatic boolean game.C_100165_sh.field_100772_p
		// @24C: iload #7
		// @24E: bipush 8 (0x08)
		// @250: iand
		// @251: iconst_m1
		// @252: ixor
		// @253: iconst_m1
		// @254: if_icmpeq @25C
		// @257: iconst_1
		// @258: goto @25D
		// @25B: athrow
		// @25C: iconst_0
		// @25D: putstatic boolean game.C_100272_mn.field_102435_K
		// @260: getstatic boolean game.C_100272_mn.field_102435_K
		// @263: ifne @26A
		// @266: goto @26E
		// @269: athrow
		// @26A: iconst_1
		// @26B: putstatic boolean game.C_100164_se.field_105449_g
		// @26E: getstatic boolean game.C_100225_ah.field_106131_k
		// @271: ifeq @2CF
		// @274: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @277: iconst_0
		// @278: invokevirtual game.C_100278_nd.func_101156_c(boolean)int
		// @27B: pop
		// @27C: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @27F: iconst_0
		// @280: invokevirtual game.C_100278_nd.func_101156_c(boolean)int
		// @283: pop
		// @284: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @287: sipush -1543 (0xF9F9)
		// @28A: invokevirtual game.C_100278_nd.func_101171_e(int)int
		// @28D: pop
		// @28E: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @291: bipush -2 (0xFE)
		// @293: invokevirtual game.C_100278_nd.func_101143_l(int)int
		// @296: putstatic int game.C_100245_pf.field_106395_i
		// @299: getstatic int game.C_100245_pf.field_106395_i
		// @29C: newarray byte[]
		// @29E: putstatic byte[] game.C_100131_te.field_100763_j
		// @2A1: iconst_0
		// @2A2: istore #8
		// @2A4: iload #8
		// @2A6: iconst_m1
		// @2A7: ixor
		// @2A8: getstatic int game.C_100245_pf.field_106395_i
		// @2AB: iconst_m1
		// @2AC: ixor
		// @2AD: if_icmple @2CF
		// @2B0: getstatic byte[] game.C_100131_te.field_100763_j
		// @2B3: iload #8
		// @2B5: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @2B8: bipush -122 (0x86)
		// @2BA: invokevirtual game.C_100278_nd.func_101146_c(byte)byte
		// @2BD: bastore
		// @2BE: iinc #8 +1
		// @2C1: iload #9
		// @2C3: ifne @2F6
		// @2C6: iload #9
		// @2C8: ifeq @2A4
		// @2CB: goto @2CF
		// @2CE: athrow
		// @2CF: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @2D2: sipush 9692 (0x25DC)
		// @2D5: invokevirtual game.C_100278_nd.func_101164_f(int)java.lang.String
		// @2D8: putstatic java.lang.String game.C_100339_jb.field_107391_h
		// @2DB: bipush 99 (0x63)
		// @2DD: getstatic java.lang.String game.C_100339_jb.field_107391_h
		// @2E0: invokestatic game.C_100106_ef.func_104742_a(byte, java.lang.CharSequence)java.lang.String
		// @2E3: putstatic java.lang.String game.C_100285_nk.field_106782_e
		// @2E6: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @2E9: iconst_0
		// @2EA: invokevirtual game.C_100278_nd.func_101156_c(boolean)int
		// @2ED: putstatic int game.C_100300_kc.field_107071_c
		// @2F0: getstatic game.C_100268_mk game.C_100046_vk.field_102763_sb
		// @2F3: putstatic game.C_100268_mk game.C_100066_dl.field_101642_t
		// @2F6: getstatic game.C_100107_u game.C_100074_g.field_104412_c
		// @2F9: iconst_0
		// @2FA: invokevirtual game.C_100107_u.func_104766_b(int)game.C_100013_fn
		// @2FD: getstatic game.C_100013_fn game.C_100060_di.field_104273_a
		// @300: if_acmpeq @329
		// @303: getstatic game.C_100107_u game.C_100074_g.field_104412_c
		// @306: iconst_0
		// @307: invokevirtual game.C_100107_u.func_104766_b(int)game.C_100013_fn
		// @30A: getstatic game.C_100013_fn game.C_100250_pl.field_106433_f
		// @30D: if_acmpeq @318
		// @310: goto @314
		// @313: athrow
		// @314: goto @339
		// @317: athrow
		// @318: getstatic game.C_100113_ek game.C_100280_nf.field_101181_j
		// @31B: iconst_0
		// @31C: invokestatic game.C_100206_qe.func_105938_b(boolean)java.applet.Applet
		// @31F: bipush -83 (0xAD)
		// @321: invokevirtual game.C_100113_ek.func_104874_a(java.applet.Applet, byte)void
		// @324: iload #9
		// @326: ifeq @339
		// @329: getstatic game.C_100113_ek game.C_100121_ud.field_100715_F
		// @32C: iconst_0
		// @32D: invokestatic game.C_100206_qe.func_105938_b(boolean)java.applet.Applet
		// @330: bipush 116 (0x74)
		// @332: invokevirtual game.C_100113_ek.func_104874_a(java.applet.Applet, byte)void
		// @335: goto @339
		// @338: athrow
		// @339: iconst_0
		// @33A: putstatic boolean game.C_100208_qg.field_105957_e
		// @33D: aconst_null
		// @33E: aload #6
		// @340: if_acmpne @347
		// @343: goto @352
		// @346: athrow
		// @347: bipush -29 (0xE3)
		// @349: aload #6
		// @34B: iconst_0
		// @34C: invokestatic game.C_100206_qe.func_105938_b(boolean)java.applet.Applet
		// @34F: invokestatic game.C_100298_ke.func_103206_a(int, java.lang.String, java.applet.Applet)void
		// @352: iconst_m1
		// @353: getstatic int game.C_100212_qc.field_105976_b
		// @356: iconst_m1
		// @357: ixor
		// @358: if_icmpgt @37F
		// @35B: getstatic boolean game.C_100165_sh.field_100772_p
		// @35E: ifne @37F
		// @361: goto @365
		// @364: athrow
		// @365: sipush 17228 (0x434C)
		// @368: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @36B: iconst_1
		// @36C: aaload
		// @36D: iconst_0
		// @36E: invokestatic game.C_100206_qe.func_105938_b(boolean)java.applet.Applet
		// @371: invokestatic game.C_100175_cl.func_105614_a(int, java.lang.String, java.applet.Applet)java.lang.Object
		// @374: pop
		// @375: goto @3A2
		// @378: astore #8
		// @37A: iload #9
		// @37C: ifeq @3A2
		// @37F: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @382: iconst_3
		// @383: aaload
		// @384: iconst_0
		// @385: invokestatic game.C_100206_qe.func_105938_b(boolean)java.applet.Applet
		// @388: bipush -110 (0x92)
		// @38A: iconst_1
		// @38B: anewarray java.lang.Object
		// @38E: dup
		// @38F: iconst_0
		// @390: bipush -74 (0xB6)
		// @392: getstatic long game.C_100299_kd.field_107029_g
		// @395: invokestatic game.C_100248_pb.func_106423_a(int, long)java.lang.String
		// @398: aastore
		// @399: invokestatic game.C_100175_cl.func_105613_a(java.lang.String, java.applet.Applet, byte, java.lang.Object[])java.lang.Object
		// @39C: pop
		// @39D: goto @3A2
		// @3A0: astore #8
		// @3A2: iconst_m1
		// @3A3: getstatic int game.C_100212_qc.field_105976_b
		// @3A6: iconst_m1
		// @3A7: ixor
		// @3A8: if_icmple @3B3
		// @3AB: iconst_1
		// @3AC: putstatic boolean game.C_100287_nm.field_106832_h
		// @3AF: goto @3B3
		// @3B2: athrow
		// @3B3: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @3B6: getstatic int[] game.C_100034_gi.field_104027_f
		// @3B9: iconst_0
		// @3BA: invokevirtual game.C_100278_nd.func_101184_a(int[], boolean)void
		// @3BD: iconst_0
		// @3BE: istore #8
		// @3C0: iconst_4
		// @3C1: iload #8
		// @3C3: if_icmple @3E2
		// @3C6: getstatic int[] game.C_100034_gi.field_104027_f
		// @3C9: iload #8
		// @3CB: dup2
		// @3CC: iaload
		// @3CD: bipush 50 (0x32)
		// @3CF: iadd
		// @3D0: iastore
		// @3D1: iinc #8 +1
		// @3D4: iload #9
		// @3D6: ifne @3EC
		// @3D9: iload #9
		// @3DB: ifeq @3C0
		// @3DE: goto @3E2
		// @3E1: athrow
		// @3E2: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @3E5: getstatic int[] game.C_100034_gi.field_104027_f
		// @3E8: iconst_0
		// @3E9: invokevirtual game.C_100278_nd.func_101184_a(int[], boolean)void
		// @3EC: getstatic int game.C_100299_kd.field_107051_z
		// @3EF: ireturn
		// @3F0: getstatic game.C_100268_mk game.C_100066_dl.field_101642_t
		// @3F3: getstatic game.C_100268_mk game.C_100099_fb.field_103049_r
		// @3F6: if_acmpeq @3FD
		// @3F9: goto @44F
		// @3FC: athrow
		// @3FD: iconst_0
		// @3FE: invokestatic game.C_100149_bi.func_105150_b(int)boolean
		// @401: ifeq @44F
		// @404: sipush 13313 (0x3401)
		// @407: invokestatic game.C_100095_fe.func_103371_l(int)void
		// @40A: getstatic int game.C_100299_kd.field_107051_z
		// @40D: iconst_m1
		// @40E: ixor
		// @40F: bipush -8 (0xF8)
		// @411: if_icmpne @428
		// @414: goto @418
		// @417: athrow
		// @418: getstatic boolean game.C_100208_qg.field_105957_e
		// @41B: ifne @428
		// @41E: goto @422
		// @421: athrow
		// @422: iconst_1
		// @423: putstatic boolean game.C_100208_qg.field_105957_e
		// @426: iconst_m1
		// @427: ireturn
		// @428: bipush 7 (0x07)
		// @42A: getstatic int game.C_100299_kd.field_107051_z
		// @42D: if_icmpeq @434
		// @430: goto @438
		// @433: athrow
		// @434: iconst_3
		// @435: putstatic int game.C_100299_kd.field_107051_z
		// @438: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @43B: iload #5
		// @43D: sipush 9576 (0x2568)
		// @440: iadd
		// @441: invokevirtual game.C_100278_nd.func_101164_f(int)java.lang.String
		// @444: putstatic java.lang.String game.C_100167_sj.field_100791_w
		// @447: iconst_0
		// @448: putstatic boolean game.C_100208_qg.field_105957_e
		// @44B: getstatic int game.C_100299_kd.field_107051_z
		// @44E: ireturn
		// @44F: iload #5
		// @451: bipush 116 (0x74)
		// @453: if_icmpeq @459
		// @456: bipush -61 (0xC3)
		// @458: ireturn
		// @459: aconst_null
		// @45A: getstatic game.C_100286_nl game.C_100318_hj.field_107194_f
		// @45D: if_acmpne @4B6
		// @460: getstatic boolean game.C_100208_qg.field_105957_e
		// @463: ifne @483
		// @466: goto @46A
		// @469: athrow
		// @46A: getstatic int game.C_100180_ce.field_104810_s
		// @46D: istore #6
		// @46F: getstatic int game.C_100163_sf.field_105434_f
		// @472: putstatic int game.C_100180_ce.field_104810_s
		// @475: iload #6
		// @477: putstatic int game.C_100163_sf.field_105434_f
		// @47A: iconst_1
		// @47B: putstatic boolean game.C_100208_qg.field_105957_e
		// @47E: iload #9
		// @480: ifeq @4B6
		// @483: bipush 46 (0x2E)
		// @485: invokestatic game.C_100133_tk.func_104988_c(int)long
		// @488: ldc2_w -1
		// @48B: lxor
		// @48C: ldc2_w -30001
		// @48F: lcmp
		// @490: iflt @4A6
		// @493: goto @497
		// @496: athrow
		// @497: getstatic java.lang.String game.C_100155_dc.field_105350_e
		// @49A: putstatic java.lang.String game.C_100167_sj.field_100791_w
		// @49D: iload #9
		// @49F: ifeq @4B0
		// @4A2: goto @4A6
		// @4A5: athrow
		// @4A6: getstatic java.lang.String game.C_100321_hi.field_107227_k
		// @4A9: putstatic java.lang.String game.C_100167_sj.field_100791_w
		// @4AC: goto @4B0
		// @4AF: athrow
		// @4B0: iconst_0
		// @4B1: putstatic boolean game.C_100208_qg.field_105957_e
		// @4B4: iconst_3
		// @4B5: ireturn
		// @4B6: iconst_m1
		// @4B7: ireturn
		// @4B8: astore #6
		// @4BA: aload #6
		// @4BC: new java.lang.StringBuilder
		// @4BF: dup
		// @4C0: invokespecial java.lang.StringBuilder.<init>()void
		// @4C3: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @4C6: iconst_4
		// @4C7: aaload
		// @4C8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4CB: iload_0
		// @4CC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4CF: bipush 44 (0x2C)
		// @4D1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D4: iload_1
		// @4D5: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @4D8: bipush 44 (0x2C)
		// @4DA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4DD: iload_2
		// @4DE: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @4E1: bipush 44 (0x2C)
		// @4E3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E6: aload_3
		// @4E7: ifnull @4F3
		// @4EA: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @4ED: iconst_0
		// @4EE: aaload
		// @4EF: goto @4F8
		// @4F2: athrow
		// @4F3: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @4F6: iconst_2
		// @4F7: aaload
		// @4F8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4FB: bipush 44 (0x2C)
		// @4FD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @500: aload #4
		// @502: ifnull @50E
		// @505: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @508: iconst_0
		// @509: aaload
		// @50A: goto @513
		// @50D: athrow
		// @50E: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @511: iconst_2
		// @512: aaload
		// @513: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @516: bipush 44 (0x2C)
		// @518: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @51B: iload #5
		// @51D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @520: bipush 41 (0x29)
		// @522: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @525: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @528: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @52B: athrow
	}
	
	C_100048_vi(C_100314_lf arg0)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: aload_1
		// @06: putfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @09: aload_0
		// @0A: aload_0
		// @0B: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @0E: getfield int game.C_100314_lf.field_101395_rc
		// @11: putfield int game.C_100048_vi.field_104178_o
		// @14: aload_0
		// @15: aload_0
		// @16: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @19: getfield int game.C_100314_lf.field_101397_ic
		// @1C: putfield int game.C_100048_vi.field_104171_g
		// @1F: aload_0
		// @20: aload_0
		// @21: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @24: getfield int game.C_100314_lf.field_101377_tc
		// @27: putfield int game.C_100048_vi.field_104176_a
		// @2A: aload_0
		// @2B: aload_0
		// @2C: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @2F: getfield int game.C_100314_lf.field_101344_Y
		// @32: putfield int game.C_100048_vi.field_104182_k
		// @35: aload_0
		// @36: aload_0
		// @37: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @3A: getfield int game.C_100314_lf.field_101294_gc
		// @3D: putfield int game.C_100048_vi.field_104183_h
		// @40: aload_0
		// @41: aload_0
		// @42: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @45: getfield boolean game.C_100314_lf.field_101403_Rb
		// @48: putfield boolean game.C_100048_vi.field_104172_d
		// @4B: aload_0
		// @4C: aload_0
		// @4D: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @50: getfield int game.C_100314_lf.field_101392_cc
		// @53: putfield int game.C_100048_vi.field_104170_f
		// @56: aload_0
		// @57: aload_0
		// @58: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @5B: getfield boolean game.C_100314_lf.field_101307_pb
		// @5E: putfield boolean game.C_100048_vi.field_104185_r
		// @61: aload_0
		// @62: ldc_w 16777215 (0xffffff)
		// @65: putfield int game.C_100048_vi.field_104177_n
		// @68: aload_0
		// @69: aload_0
		// @6A: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @6D: getfield int game.C_100314_lf.field_101396_rb
		// @70: putfield int game.C_100048_vi.field_104179_l
		// @73: aload_0
		// @74: aload_0
		// @75: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @78: getfield boolean game.C_100314_lf.field_101391_lb
		// @7B: putfield boolean game.C_100048_vi.field_104181_j
		// @7E: aload_0
		// @7F: aload_0
		// @80: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @83: getfield int game.C_100314_lf.field_101309_wb
		// @86: putfield int game.C_100048_vi.field_104187_p
		// @89: aload_0
		// @8A: getstatic int[][][] game.C_100165_sh.field_100774_o
		// @8D: aload_0
		// @8E: getfield game.C_100314_lf game.C_100048_vi.field_104174_b
		// @91: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @94: getfield int game.C_100327_ib.field_102494_P
		// @97: bipush 59 (0x3B)
		// @99: invokestatic game.C_100183_cd.func_103414_b(int, byte)int
		// @9C: aaload
		// @9D: bipush 25 (0x19)
		// @9F: aaload
		// @A0: iconst_0
		// @A1: iaload
		// @A2: putfield int game.C_100048_vi.field_104180_m
		// @A5: goto @DB
		// @A8: astore_2
		// @A9: aload_2
		// @AA: new java.lang.StringBuilder
		// @AD: dup
		// @AE: invokespecial java.lang.StringBuilder.<init>()void
		// @B1: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @B4: bipush 9 (0x09)
		// @B6: aaload
		// @B7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BA: aload_1
		// @BB: ifnull @C7
		// @BE: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @C1: iconst_0
		// @C2: aaload
		// @C3: goto @CC
		// @C6: athrow
		// @C7: getstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @CA: iconst_2
		// @CB: aaload
		// @CC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CF: bipush 41 (0x29)
		// @D1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D7: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @DA: athrow
		// @DB: return
	}
	
	static
	{
		// @00: bipush 17 (0x11)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc ",*\u0016$\u000c"
		// @09: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\"jBk\u0001"
		// @14: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @17: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "9qTf"
		// @1F: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @22: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "-eH"
		// @2A: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc_w "!m\u0016BY"
		// @36: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @39: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @3C: aastore
		// @3D: dup
		// @3E: iconst_5
		// @3F: ldc "!m\u0016LY"
		// @41: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @44: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @47: aastore
		// @48: dup
		// @49: bipush 6 (0x06)
		// @4B: ldc "!m\u0016CY"
		// @4D: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @50: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @53: aastore
		// @54: dup
		// @55: bipush 7 (0x07)
		// @57: ldc "!m\u0016KY"
		// @59: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @5C: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @5F: aastore
		// @60: dup
		// @61: bipush 8 (0x08)
		// @63: ldc "!m\u0016AY"
		// @65: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @68: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @6B: aastore
		// @6C: dup
		// @6D: bipush 9 (0x09)
		// @6F: ldc_w "!m\u00166\u00189mL4Y"
		// @72: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @75: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @78: aastore
		// @79: dup
		// @7A: bipush 10 (0x0A)
		// @7C: ldc "!m\u0016IY"
		// @7E: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @81: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @84: aastore
		// @85: dup
		// @86: bipush 11 (0x0B)
		// @88: ldc "!m\u0016HY"
		// @8A: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @8D: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @90: aastore
		// @91: dup
		// @92: bipush 12 (0x0C)
		// @94: ldc "!m\u0016MY"
		// @96: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @99: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @9C: aastore
		// @9D: dup
		// @9E: bipush 13 (0x0D)
		// @A0: ldc "!m\u0016NY"
		// @A2: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @A5: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @A8: aastore
		// @A9: dup
		// @AA: bipush 14 (0x0E)
		// @AC: ldc "!m\u0016FY"
		// @AE: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @B1: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @B4: aastore
		// @B5: dup
		// @B6: bipush 15 (0x0F)
		// @B8: ldc "!m\u0016@Y"
		// @BA: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @BD: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @C0: aastore
		// @C1: dup
		// @C2: bipush 16 (0x10)
		// @C4: ldc "!m\u0016OY"
		// @C6: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @C9: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @CC: aastore
		// @CD: putstatic java.lang.String[] game.C_100048_vi.field_104188_z
		// @D0: iconst_3
		// @D1: putstatic int game.C_100048_vi.field_104186_q
		// @D4: ldc_w "k!\u00084Q eV~\u0002wpW*\u001b8mV"
		// @D7: invokestatic game.C_100048_vi.func_104158_z(java.lang.String)char[]
		// @DA: invokestatic game.C_100048_vi.func_104157_z(char[])java.lang.String
		// @DD: putstatic java.lang.String game.C_100048_vi.field_104184_i
		// @E0: return
	}
	
	private static char[] func_104158_z(String arg0)
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
		// @0E: bipush 113 (0x71)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104157_z(char[] arg0)
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
		// @30: bipush 87 (0x57)
		// @32: goto @45
		// @35: iconst_4
		// @36: goto @45
		// @39: bipush 56 (0x38)
		// @3B: goto @45
		// @3E: bipush 10 (0x0A)
		// @40: goto @45
		// @43: bipush 113 (0x71)
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
