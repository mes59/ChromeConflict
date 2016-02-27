package game;

final class C_100327_ib extends C_100325_id
{
	static String field_102487_O;
	private int field_102496_R;
	int field_102491_K;
	int field_102480_G;
	int field_102485_M;
	static boolean field_102503_y;
	int field_102494_P;
	C_100153_be field_102484_L;
	static C_100037_wb field_102499_u;
	static String field_102486_N;
	static C_100153_be[] field_102482_B;
	int field_102500_t;
	int field_102478_E;
	private int field_102477_D;
	C_100153_be field_102489_I;
	C_100153_be field_102492_T;
	static int[] field_102490_J;
	private boolean field_102501_s;
	static int field_102483_C;
	int field_102488_H;
	static String field_102479_F;
	private C_100327_ib field_102495_S;
	int field_102502_z;
	private C_100049_vf[] field_102498_v;
	int field_102504_x;
	static String field_102493_Q;
	int field_102497_w;
	private static final String[] field_102481_A;
	
	static final boolean func_102449_a(byte arg0, C_100061_dh arg1, C_100061_dh arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iload_0
		// @06: bipush 24 (0x18)
		// @08: if_icmpge @16
		// @0B: aconst_null
		// @0C: checkcast java.lang.String
		// @0F: putstatic java.lang.String game.C_100327_ib.field_102479_F
		// @12: goto @16
		// @15: athrow
		// @16: aload_2
		// @17: getfield int game.C_100061_dh.field_101984_hc
		// @1A: aload_1
		// @1B: getfield int game.C_100061_dh.field_101984_hc
		// @1E: isub
		// @1F: istore_3
		// @20: getstatic java.lang.String game.C_100119_ua.field_104909_i
		// @23: aload_2
		// @24: getfield java.lang.String game.C_100061_dh.field_101996_kc
		// @27: if_acmpeq @45
		// @2A: aconst_null
		// @2B: aload_2
		// @2C: getfield java.lang.String game.C_100061_dh.field_101996_kc
		// @2F: if_acmpne @4F
		// @32: goto @36
		// @35: athrow
		// @36: wide (iinc) #3 +200
		// @3C: iload #4
		// @3E: ifeq @4F
		// @41: goto @45
		// @44: athrow
		// @45: wide (iinc) #3 +65336
		// @4B: goto @4F
		// @4E: athrow
		// @4F: aload_1
		// @50: getfield java.lang.String game.C_100061_dh.field_101996_kc
		// @53: getstatic java.lang.String game.C_100119_ua.field_104909_i
		// @56: if_acmpne @68
		// @59: wide (iinc) #3 +200
		// @5F: iload #4
		// @61: ifeq @7D
		// @64: goto @68
		// @67: athrow
		// @68: aload_1
		// @69: getfield java.lang.String game.C_100061_dh.field_101996_kc
		// @6C: ifnonnull @7D
		// @6F: goto @73
		// @72: athrow
		// @73: wide (iinc) #3 +65336
		// @79: goto @7D
		// @7C: athrow
		// @7D: iload_3
		// @7E: iconst_m1
		// @7F: ixor
		// @80: iconst_m1
		// @81: if_icmpge @89
		// @84: iconst_1
		// @85: goto @8A
		// @88: athrow
		// @89: iconst_0
		// @8A: ireturn
		// @8B: astore_3
		// @8C: aload_3
		// @8D: new java.lang.StringBuilder
		// @90: dup
		// @91: invokespecial java.lang.StringBuilder.<init>()void
		// @94: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @97: bipush 11 (0x0B)
		// @99: aaload
		// @9A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9D: iload_0
		// @9E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A1: bipush 44 (0x2C)
		// @A3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A6: aload_1
		// @A7: ifnull @B3
		// @AA: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @AD: iconst_4
		// @AE: aaload
		// @AF: goto @B8
		// @B2: athrow
		// @B3: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @B6: iconst_5
		// @B7: aaload
		// @B8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BB: bipush 44 (0x2C)
		// @BD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C0: aload_2
		// @C1: ifnull @CD
		// @C4: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @C7: iconst_4
		// @C8: aaload
		// @C9: goto @D2
		// @CC: athrow
		// @CD: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @D0: iconst_5
		// @D1: aaload
		// @D2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D5: bipush 41 (0x29)
		// @D7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @DD: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @E0: athrow
	}
	
	final C_100327_ib func_102472_a(int arg0, String arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: iload_1
		// @06: istore_3
		// @07: iload_3
		// @08: iconst_m1
		// @09: ixor
		// @0A: aload_0
		// @0B: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0E: arraylength
		// @0F: iconst_m1
		// @10: ixor
		// @11: if_icmple @73
		// @14: aload_0
		// @15: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @18: iload_3
		// @19: aaload
		// @1A: getfield java.lang.String game.C_100049_vf.field_104214_u
		// @1D: astore #4
		// @1F: aconst_null
		// @20: iload #6
		// @22: ifne @74
		// @25: aload #4
		// @27: if_acmpeq @3B
		// @2A: goto @2E
		// @2D: athrow
		// @2E: aload #4
		// @30: aload_2
		// @31: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @34: ifne @69
		// @37: goto @3B
		// @3A: athrow
		// @3B: aload_0
		// @3C: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @3F: iload_3
		// @40: aaload
		// @41: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @44: ifnull @6B
		// @47: goto @4B
		// @4A: athrow
		// @4B: aload_0
		// @4C: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @4F: iload_3
		// @50: aaload
		// @51: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @54: iconst_0
		// @55: aload_2
		// @56: invokevirtual game.C_100327_ib.func_102472_a(int, java.lang.String)game.C_100327_ib
		// @59: astore #5
		// @5B: aconst_null
		// @5C: aload #5
		// @5E: if_acmpeq @64
		// @61: aload #5
		// @63: areturn
		// @64: iload #6
		// @66: ifeq @6B
		// @69: aload_0
		// @6A: areturn
		// @6B: iinc #3 +1
		// @6E: iload #6
		// @70: ifeq @07
		// @73: aconst_null
		// @74: areturn
		// @75: astore_3
		// @76: aload_3
		// @77: new java.lang.StringBuilder
		// @7A: dup
		// @7B: invokespecial java.lang.StringBuilder.<init>()void
		// @7E: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @81: bipush 41 (0x29)
		// @83: aaload
		// @84: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @87: iload_1
		// @88: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8B: bipush 44 (0x2C)
		// @8D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @90: aload_2
		// @91: ifnull @9D
		// @94: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @97: iconst_4
		// @98: aaload
		// @99: goto @A2
		// @9C: athrow
		// @9D: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @A0: iconst_5
		// @A1: aaload
		// @A2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A5: bipush 41 (0x29)
		// @A7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @AD: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @B0: athrow
	}
	
	final void func_102473_a(byte arg0, int arg1, int arg2, int arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #13
		// @005: aload_0
		// @006: getfield boolean game.C_100327_ib.field_102501_s
		// @009: ifeq @013
		// @00C: getstatic int game.C_100270_mi.field_102270_jc
		// @00F: goto @019
		// @012: athrow
		// @013: getstatic int game.C_100270_mi.field_102270_jc
		// @016: ldc -919527102 (0xc9312142)
		// @018: ishl
		// @019: istore #5
		// @01B: aload_0
		// @01C: getfield boolean game.C_100327_ib.field_102501_s
		// @01F: ifeq @027
		// @022: iconst_4
		// @023: goto @028
		// @026: athrow
		// @027: iconst_2
		// @028: istore #6
		// @02A: aload_0
		// @02B: getfield int game.C_100327_ib.field_102485_M
		// @02E: istore #7
		// @030: iconst_0
		// @031: istore #8
		// @033: iload #8
		// @035: iconst_m1
		// @036: ixor
		// @037: aload_0
		// @038: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @03B: arraylength
		// @03C: iconst_m1
		// @03D: ixor
		// @03E: if_icmple @10F
		// @041: aload_0
		// @042: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @045: iload #8
		// @047: aaload
		// @048: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @04B: iload #13
		// @04D: ifne @121
		// @050: ifnull @107
		// @053: goto @057
		// @056: athrow
		// @057: aload_0
		// @058: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @05B: iload #8
		// @05D: aaload
		// @05E: getfield boolean game.C_100049_vf.field_104211_i
		// @061: ifeq @107
		// @064: goto @068
		// @067: athrow
		// @068: iconst_3
		// @069: iload #7
		// @06B: ineg
		// @06C: bipush 8 (0x08)
		// @06E: idiv
		// @06F: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @072: sipush 256 (0x0100)
		// @075: idiv
		// @076: istore #9
		// @078: iload #7
		// @07A: ineg
		// @07B: bipush 8 (0x08)
		// @07D: idiv
		// @07E: iconst_0
		// @07F: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @082: sipush 256 (0x0100)
		// @085: idiv
		// @086: istore #10
		// @088: iload_2
		// @089: iload #4
		// @08B: iload #10
		// @08D: aload_0
		// @08E: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @091: iload #8
		// @093: aaload
		// @094: getfield int game.C_100049_vf.field_104218_q
		// @097: aload_0
		// @098: getfield int game.C_100327_ib.field_102502_z
		// @09B: isub
		// @09C: imul
		// @09D: aload_0
		// @09E: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0A1: iload #8
		// @0A3: aaload
		// @0A4: getfield int game.C_100049_vf.field_104209_k
		// @0A7: aload_0
		// @0A8: getfield int game.C_100327_ib.field_102491_K
		// @0AB: ineg
		// @0AC: iadd
		// @0AD: iload #9
		// @0AF: imul
		// @0B0: ineg
		// @0B1: isub
		// @0B2: getstatic int game.C_100270_mi.field_102270_jc
		// @0B5: imul
		// @0B6: ldc -1925630540 (0x8d3935b4)
		// @0B8: ishr
		// @0B9: imul
		// @0BA: ineg
		// @0BB: isub
		// @0BC: istore #11
		// @0BE: iload_3
		// @0BF: iload #9
		// @0C1: aload_0
		// @0C2: getfield int game.C_100327_ib.field_102502_z
		// @0C5: ineg
		// @0C6: aload_0
		// @0C7: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0CA: iload #8
		// @0CC: aaload
		// @0CD: getfield int game.C_100049_vf.field_104218_q
		// @0D0: iadd
		// @0D1: imul
		// @0D2: ineg
		// @0D3: aload_0
		// @0D4: getfield int game.C_100327_ib.field_102491_K
		// @0D7: ineg
		// @0D8: aload_0
		// @0D9: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0DC: iload #8
		// @0DE: aaload
		// @0DF: getfield int game.C_100049_vf.field_104209_k
		// @0E2: iadd
		// @0E3: iload #10
		// @0E5: imul
		// @0E6: iadd
		// @0E7: getstatic int game.C_100270_mi.field_102270_jc
		// @0EA: imul
		// @0EB: ldc -329323404 (0xec5eec74)
		// @0ED: ishr
		// @0EE: ineg
		// @0EF: isub
		// @0F0: istore #12
		// @0F2: aload_0
		// @0F3: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0F6: iload #8
		// @0F8: aaload
		// @0F9: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0FC: bipush 110 (0x6E)
		// @0FE: iload #11
		// @100: iload #12
		// @102: iload #4
		// @104: invokevirtual game.C_100327_ib.func_102473_a(byte, int, int, int)void
		// @107: iinc #8 +1
		// @10A: iload #13
		// @10C: ifeq @033
		// @10F: iload_1
		// @110: bipush 102 (0x66)
		// @112: if_icmpgt @120
		// @115: aload_0
		// @116: bipush 49 (0x31)
		// @118: invokevirtual game.C_100327_ib.func_102445_j(int)int
		// @11B: pop
		// @11C: goto @120
		// @11F: athrow
		// @120: aload_0
		// @121: getfield int game.C_100327_ib.field_102494_P
		// @124: iconst_m1
		// @125: ixor
		// @126: bipush -109 (0x93)
		// @128: if_icmpne @1AB
		// @12B: getstatic boolean game.C_100007_fm.field_103629_d
		// @12E: ifeq @1AB
		// @131: goto @135
		// @134: athrow
		// @135: aload_0
		// @136: getfield int game.C_100327_ib.field_102478_E
		// @139: ifgt @169
		// @13C: goto @140
		// @13F: athrow
		// @140: aload_0
		// @141: getfield game.C_100153_be game.C_100327_ib.field_102489_I
		// @144: sipush 140 (0x008C)
		// @147: iload #6
		// @149: ishl
		// @14A: sipush 130 (0x0082)
		// @14D: iload #6
		// @14F: ishl
		// @150: iload_2
		// @151: ldc -559981564 (0xde9f5c04)
		// @153: ishl
		// @154: iload_3
		// @155: ldc 1073492516 (0x3ffc3224)
		// @157: ishl
		// @158: iload #7
		// @15A: ineg
		// @15B: iload #5
		// @15D: invokevirtual game.C_100153_be.func_105316_a(int, int, int, int, int, int)void
		// @160: iload #13
		// @162: ifeq @2D3
		// @165: goto @169
		// @168: athrow
		// @169: aload_0
		// @16A: getfield int game.C_100327_ib.field_102478_E
		// @16D: bipush 50 (0x32)
		// @16F: if_icmpgt @2D3
		// @172: goto @176
		// @175: athrow
		// @176: aload_0
		// @177: getfield game.C_100153_be game.C_100327_ib.field_102489_I
		// @17A: sipush 140 (0x008C)
		// @17D: iload #6
		// @17F: ishl
		// @180: sipush 130 (0x0082)
		// @183: iload #6
		// @185: ishl
		// @186: iload_2
		// @187: ldc -2136544476 (0x80a6eb24)
		// @189: ishl
		// @18A: iload_3
		// @18B: ldc -683894364 (0xd73c99a4)
		// @18D: ishl
		// @18E: iload #7
		// @190: ineg
		// @191: aload_0
		// @192: getfield int game.C_100327_ib.field_102478_E
		// @195: ineg
		// @196: bipush 50 (0x32)
		// @198: iadd
		// @199: iload #5
		// @19B: imul
		// @19C: bipush 50 (0x32)
		// @19E: idiv
		// @19F: invokevirtual game.C_100153_be.func_105316_a(int, int, int, int, int, int)void
		// @1A2: iload #13
		// @1A4: ifeq @2D3
		// @1A7: goto @1AB
		// @1AA: athrow
		// @1AB: iload #4
		// @1AD: iconst_m1
		// @1AE: ixor
		// @1AF: bipush -2 (0xFE)
		// @1B1: if_icmpne @1C3
		// @1B4: goto @1B8
		// @1B7: athrow
		// @1B8: aload_0
		// @1B9: getfield game.C_100153_be game.C_100327_ib.field_102489_I
		// @1BC: ifnonnull @25D
		// @1BF: goto @1C3
		// @1C2: athrow
		// @1C3: aconst_null
		// @1C4: aload_0
		// @1C5: getfield game.C_100153_be game.C_100327_ib.field_102484_L
		// @1C8: if_acmpeq @2D3
		// @1CB: goto @1CF
		// @1CE: athrow
		// @1CF: aload_0
		// @1D0: getfield int game.C_100327_ib.field_102478_E
		// @1D3: ifle @228
		// @1D6: goto @1DA
		// @1D9: athrow
		// @1DA: aload_0
		// @1DB: getfield int game.C_100327_ib.field_102478_E
		// @1DE: bipush 50 (0x32)
		// @1E0: if_icmple @1EB
		// @1E3: goto @1E7
		// @1E6: athrow
		// @1E7: goto @2D3
		// @1EA: athrow
		// @1EB: aload_0
		// @1EC: getfield game.C_100153_be game.C_100327_ib.field_102484_L
		// @1EF: aload_0
		// @1F0: getfield int game.C_100327_ib.field_102502_z
		// @1F3: ineg
		// @1F4: aload_0
		// @1F5: getfield game.C_100153_be game.C_100327_ib.field_102484_L
		// @1F8: getfield int game.C_100153_be.field_105301_h
		// @1FB: iconst_4
		// @1FC: imul
		// @1FD: iadd
		// @1FE: iload #6
		// @200: ishl
		// @201: aload_0
		// @202: getfield int game.C_100327_ib.field_102491_K
		// @205: iload #6
		// @207: ishl
		// @208: iload_2
		// @209: ldc -320675740 (0xece2e064)
		// @20B: ishl
		// @20C: iload_3
		// @20D: ldc -833579228 (0xce509724)
		// @20F: ishl
		// @210: iload #7
		// @212: iload #5
		// @214: bipush 50 (0x32)
		// @216: aload_0
		// @217: getfield int game.C_100327_ib.field_102478_E
		// @21A: ineg
		// @21B: iadd
		// @21C: imul
		// @21D: bipush 50 (0x32)
		// @21F: idiv
		// @220: invokevirtual game.C_100153_be.func_105316_a(int, int, int, int, int, int)void
		// @223: iload #13
		// @225: ifeq @2D3
		// @228: aload_0
		// @229: getfield game.C_100153_be game.C_100327_ib.field_102484_L
		// @22C: aload_0
		// @22D: getfield int game.C_100327_ib.field_102502_z
		// @230: ineg
		// @231: iconst_4
		// @232: aload_0
		// @233: getfield game.C_100153_be game.C_100327_ib.field_102484_L
		// @236: getfield int game.C_100153_be.field_105301_h
		// @239: imul
		// @23A: iadd
		// @23B: iload #6
		// @23D: ishl
		// @23E: aload_0
		// @23F: getfield int game.C_100327_ib.field_102491_K
		// @242: iload #6
		// @244: ishl
		// @245: iload_2
		// @246: ldc 1149491812 (0x4483da64)
		// @248: ishl
		// @249: iload_3
		// @24A: ldc 448561764 (0x1abc8264)
		// @24C: ishl
		// @24D: iload #7
		// @24F: iload #5
		// @251: invokevirtual game.C_100153_be.func_105316_a(int, int, int, int, int, int)void
		// @254: iload #13
		// @256: ifeq @2D3
		// @259: goto @25D
		// @25C: athrow
		// @25D: iconst_0
		// @25E: aload_0
		// @25F: getfield int game.C_100327_ib.field_102478_E
		// @262: if_icmpge @2AD
		// @265: goto @269
		// @268: athrow
		// @269: aload_0
		// @26A: getfield int game.C_100327_ib.field_102478_E
		// @26D: bipush 50 (0x32)
		// @26F: if_icmple @27A
		// @272: goto @276
		// @275: athrow
		// @276: goto @2D3
		// @279: athrow
		// @27A: aload_0
		// @27B: getfield game.C_100153_be game.C_100327_ib.field_102489_I
		// @27E: aload_0
		// @27F: getfield int game.C_100327_ib.field_102502_z
		// @282: iload #6
		// @284: ishl
		// @285: aload_0
		// @286: getfield int game.C_100327_ib.field_102491_K
		// @289: iload #6
		// @28B: ishl
		// @28C: iload_2
		// @28D: ldc 912338756 (0x36612f44)
		// @28F: ishl
		// @290: iload_3
		// @291: ldc -83079484 (0xfb0c4ec4)
		// @293: ishl
		// @294: iload #7
		// @296: ineg
		// @297: iload #5
		// @299: bipush 50 (0x32)
		// @29B: aload_0
		// @29C: getfield int game.C_100327_ib.field_102478_E
		// @29F: ineg
		// @2A0: iadd
		// @2A1: imul
		// @2A2: bipush 50 (0x32)
		// @2A4: idiv
		// @2A5: invokevirtual game.C_100153_be.func_105316_a(int, int, int, int, int, int)void
		// @2A8: iload #13
		// @2AA: ifeq @2D3
		// @2AD: aload_0
		// @2AE: getfield game.C_100153_be game.C_100327_ib.field_102489_I
		// @2B1: aload_0
		// @2B2: getfield int game.C_100327_ib.field_102502_z
		// @2B5: iload #6
		// @2B7: ishl
		// @2B8: aload_0
		// @2B9: getfield int game.C_100327_ib.field_102491_K
		// @2BC: iload #6
		// @2BE: ishl
		// @2BF: iload_2
		// @2C0: ldc 1223870948 (0x48f2c9e4)
		// @2C2: ishl
		// @2C3: iload_3
		// @2C4: ldc 1541838916 (0x5be69844)
		// @2C6: ishl
		// @2C7: iload #7
		// @2C9: ineg
		// @2CA: iload #5
		// @2CC: invokevirtual game.C_100153_be.func_105316_a(int, int, int, int, int, int)void
		// @2CF: goto @2D3
		// @2D2: athrow
		// @2D3: iconst_0
		// @2D4: istore #8
		// @2D6: iload #8
		// @2D8: iconst_m1
		// @2D9: ixor
		// @2DA: aload_0
		// @2DB: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @2DE: arraylength
		// @2DF: iconst_m1
		// @2E0: ixor
		// @2E1: if_icmple @3B4
		// @2E4: iload #13
		// @2E6: ifne @3F7
		// @2E9: aconst_null
		// @2EA: aload_0
		// @2EB: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @2EE: iload #8
		// @2F0: aaload
		// @2F1: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @2F4: if_acmpeq @3AC
		// @2F7: goto @2FB
		// @2FA: athrow
		// @2FB: aload_0
		// @2FC: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @2FF: iload #8
		// @301: aaload
		// @302: getfield boolean game.C_100049_vf.field_104211_i
		// @305: ifeq @310
		// @308: goto @30C
		// @30B: athrow
		// @30C: goto @3AC
		// @30F: athrow
		// @310: iconst_3
		// @311: iload #7
		// @313: ineg
		// @314: bipush 8 (0x08)
		// @316: idiv
		// @317: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @31A: sipush 256 (0x0100)
		// @31D: idiv
		// @31E: istore #9
		// @320: iload #7
		// @322: ineg
		// @323: bipush 8 (0x08)
		// @325: idiv
		// @326: iconst_0
		// @327: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @32A: sipush 256 (0x0100)
		// @32D: idiv
		// @32E: istore #10
		// @330: iload_2
		// @331: getstatic int game.C_100270_mi.field_102270_jc
		// @334: aload_0
		// @335: getfield int game.C_100327_ib.field_102491_K
		// @338: ineg
		// @339: aload_0
		// @33A: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @33D: iload #8
		// @33F: aaload
		// @340: getfield int game.C_100049_vf.field_104209_k
		// @343: iadd
		// @344: iload #9
		// @346: imul
		// @347: iload #10
		// @349: aload_0
		// @34A: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @34D: iload #8
		// @34F: aaload
		// @350: getfield int game.C_100049_vf.field_104218_q
		// @353: aload_0
		// @354: getfield int game.C_100327_ib.field_102502_z
		// @357: isub
		// @358: imul
		// @359: iadd
		// @35A: imul
		// @35B: ldc -1866155372 (0x90c4ba94)
		// @35D: ishr
		// @35E: iload #4
		// @360: imul
		// @361: iadd
		// @362: istore #11
		// @364: iload_3
		// @365: iload #10
		// @367: aload_0
		// @368: getfield int game.C_100327_ib.field_102491_K
		// @36B: ineg
		// @36C: aload_0
		// @36D: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @370: iload #8
		// @372: aaload
		// @373: getfield int game.C_100049_vf.field_104209_k
		// @376: iadd
		// @377: imul
		// @378: aload_0
		// @379: getfield int game.C_100327_ib.field_102502_z
		// @37C: ineg
		// @37D: aload_0
		// @37E: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @381: iload #8
		// @383: aaload
		// @384: getfield int game.C_100049_vf.field_104218_q
		// @387: iadd
		// @388: iload #9
		// @38A: imul
		// @38B: isub
		// @38C: getstatic int game.C_100270_mi.field_102270_jc
		// @38F: imul
		// @390: ldc 413725204 (0x18a8f214)
		// @392: ishr
		// @393: ineg
		// @394: isub
		// @395: istore #12
		// @397: aload_0
		// @398: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @39B: iload #8
		// @39D: aaload
		// @39E: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @3A1: bipush 121 (0x79)
		// @3A3: iload #11
		// @3A5: iload #12
		// @3A7: iload #4
		// @3A9: invokevirtual game.C_100327_ib.func_102473_a(byte, int, int, int)void
		// @3AC: iinc #8 +1
		// @3AF: iload #13
		// @3B1: ifeq @2D6
		// @3B4: goto @3F7
		// @3B7: astore #5
		// @3B9: aload #5
		// @3BB: new java.lang.StringBuilder
		// @3BE: dup
		// @3BF: invokespecial java.lang.StringBuilder.<init>()void
		// @3C2: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @3C5: bipush 16 (0x10)
		// @3C7: aaload
		// @3C8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3CB: iload_1
		// @3CC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3CF: bipush 44 (0x2C)
		// @3D1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D4: iload_2
		// @3D5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3D8: bipush 44 (0x2C)
		// @3DA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3DD: iload_3
		// @3DE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E1: bipush 44 (0x2C)
		// @3E3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3E6: iload #4
		// @3E8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3EB: bipush 41 (0x29)
		// @3ED: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F6: athrow
		// @3F7: return
	}
	
	public static void func_102451_k(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100327_ib.field_102479_F
		// @04: aconst_null
		// @05: putstatic game.C_100037_wb game.C_100327_ib.field_102499_u
		// @08: aconst_null
		// @09: putstatic game.C_100153_be[] game.C_100327_ib.field_102482_B
		// @0C: aconst_null
		// @0D: putstatic int[] game.C_100327_ib.field_102490_J
		// @10: aconst_null
		// @11: putstatic java.lang.String game.C_100327_ib.field_102487_O
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100327_ib.field_102486_N
		// @18: aconst_null
		// @19: putstatic java.lang.String game.C_100327_ib.field_102493_Q
		// @1C: iload_0
		// @1D: bipush 17 (0x11)
		// @1F: if_icmpeq @29
		// @22: aconst_null
		// @23: checkcast java.lang.String
		// @26: putstatic java.lang.String game.C_100327_ib.field_102487_O
		// @29: goto @4E
		// @2C: astore_1
		// @2D: aload_1
		// @2E: new java.lang.StringBuilder
		// @31: dup
		// @32: invokespecial java.lang.StringBuilder.<init>()void
		// @35: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @38: bipush 32 (0x20)
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: iload_0
		// @3F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @42: bipush 41 (0x29)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4D: athrow
		// @4E: return
	}
	
	final C_100327_ib func_102467_c(int arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: iconst_0
		// @06: istore_3
		// @07: iload_2
		// @08: bipush 108 (0x6C)
		// @0A: if_icmpge @12
		// @0D: aconst_null
		// @0E: checkcast game.C_100327_ib
		// @11: areturn
		// @12: aload_0
		// @13: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @16: arraylength
		// @17: iload_3
		// @18: if_icmple @64
		// @1B: aload_0
		// @1C: getfield int game.C_100327_ib.field_102494_P
		// @1F: iload_1
		// @20: if_icmpeq @5A
		// @23: aload_0
		// @24: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @27: iload_3
		// @28: aaload
		// @29: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @2C: ifnonnull @37
		// @2F: goto @33
		// @32: athrow
		// @33: goto @5C
		// @36: athrow
		// @37: aload_0
		// @38: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @3B: iload_3
		// @3C: aaload
		// @3D: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @40: iload_1
		// @41: bipush 124 (0x7C)
		// @43: invokevirtual game.C_100327_ib.func_102467_c(int, int)game.C_100327_ib
		// @46: astore #4
		// @48: aconst_null
		// @49: aload #4
		// @4B: if_acmpne @52
		// @4E: goto @55
		// @51: athrow
		// @52: aload #4
		// @54: areturn
		// @55: iload #5
		// @57: ifeq @5C
		// @5A: aload_0
		// @5B: areturn
		// @5C: iinc #3 +1
		// @5F: iload #5
		// @61: ifeq @12
		// @64: aconst_null
		// @65: areturn
		// @66: astore_3
		// @67: aload_3
		// @68: new java.lang.StringBuilder
		// @6B: dup
		// @6C: invokespecial java.lang.StringBuilder.<init>()void
		// @6F: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @72: bipush 15 (0x0F)
		// @74: aaload
		// @75: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @78: iload_1
		// @79: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7C: bipush 44 (0x2C)
		// @7E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @81: iload_2
		// @82: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @85: bipush 41 (0x29)
		// @87: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @90: athrow
	}
	
	final String func_102474_m(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: iload_1
		// @05: iconst_m1
		// @06: if_icmpeq @0E
		// @09: aconst_null
		// @0A: checkcast java.lang.String
		// @0D: areturn
		// @0E: aload_0
		// @0F: getfield int game.C_100327_ib.field_102494_P
		// @12: iflt @3D
		// @15: getstatic java.lang.String[] game.C_100176_ci.field_105623_e
		// @18: arraylength
		// @19: aload_0
		// @1A: getfield int game.C_100327_ib.field_102494_P
		// @1D: if_icmpgt @28
		// @20: goto @24
		// @23: athrow
		// @24: goto @3D
		// @27: athrow
		// @28: aconst_null
		// @29: getstatic java.lang.String[] game.C_100176_ci.field_105623_e
		// @2C: aload_0
		// @2D: getfield int game.C_100327_ib.field_102494_P
		// @30: aaload
		// @31: if_acmpeq @3D
		// @34: getstatic java.lang.String[] game.C_100176_ci.field_105623_e
		// @37: aload_0
		// @38: getfield int game.C_100327_ib.field_102494_P
		// @3B: aaload
		// @3C: areturn
		// @3D: iconst_0
		// @3E: istore_2
		// @3F: aload_0
		// @40: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @43: arraylength
		// @44: iload_2
		// @45: if_icmple @6E
		// @48: aconst_null
		// @49: iload_3
		// @4A: ifne @6F
		// @4D: aload_0
		// @4E: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @51: iload_2
		// @52: aaload
		// @53: getfield java.lang.String game.C_100049_vf.field_104214_u
		// @56: if_acmpeq @67
		// @59: goto @5D
		// @5C: athrow
		// @5D: aload_0
		// @5E: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @61: iload_2
		// @62: aaload
		// @63: getfield java.lang.String game.C_100049_vf.field_104214_u
		// @66: areturn
		// @67: iinc #2 +1
		// @6A: iload_3
		// @6B: ifeq @3F
		// @6E: aconst_null
		// @6F: areturn
		// @70: astore_2
		// @71: aload_2
		// @72: new java.lang.StringBuilder
		// @75: dup
		// @76: invokespecial java.lang.StringBuilder.<init>()void
		// @79: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @7C: bipush 6 (0x06)
		// @7E: aaload
		// @7F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @82: iload_1
		// @83: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @86: bipush 41 (0x29)
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @91: athrow
	}
	
	final C_100049_vf[] func_102462_a(int arg0, int arg1, C_100049_vf[] arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #7
		// @05: iload_2
		// @06: bipush -106 (0x96)
		// @08: if_icmplt @10
		// @0B: aconst_null
		// @0C: checkcast game.C_100049_vf[]
		// @0F: areturn
		// @10: iconst_0
		// @11: istore #4
		// @13: aload_0
		// @14: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @17: arraylength
		// @18: iload #4
		// @1A: if_icmple @A6
		// @1D: iconst_0
		// @1E: iload_1
		// @1F: aload_0
		// @20: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @23: iload #4
		// @25: aaload
		// @26: getfield int game.C_100049_vf.field_104203_a
		// @29: iand
		// @2A: if_icmpge @7F
		// @2D: iconst_m1
		// @2E: aload_0
		// @2F: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @32: iload #4
		// @34: aaload
		// @35: getfield int game.C_100049_vf.field_104203_a
		// @38: if_icmpeq @7F
		// @3B: goto @3F
		// @3E: athrow
		// @3F: aload_3
		// @40: arraylength
		// @41: iconst_m1
		// @42: isub
		// @43: anewarray game.C_100049_vf
		// @46: astore #5
		// @48: iconst_0
		// @49: istore #6
		// @4B: aload_3
		// @4C: arraylength
		// @4D: iconst_m1
		// @4E: ixor
		// @4F: iload #6
		// @51: iconst_m1
		// @52: ixor
		// @53: if_icmpge @70
		// @56: aload #5
		// @58: iload #6
		// @5A: aload_3
		// @5B: iload #6
		// @5D: aaload
		// @5E: aastore
		// @5F: iinc #6 +1
		// @62: iload #7
		// @64: ifne @7C
		// @67: iload #7
		// @69: ifeq @4B
		// @6C: goto @70
		// @6F: athrow
		// @70: aload #5
		// @72: aload_3
		// @73: arraylength
		// @74: aload_0
		// @75: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @78: iload #4
		// @7A: aaload
		// @7B: aastore
		// @7C: aload #5
		// @7E: astore_3
		// @7F: aload_0
		// @80: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @83: iload #4
		// @85: aaload
		// @86: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @89: ifnull @9E
		// @8C: aload_0
		// @8D: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @90: iload #4
		// @92: aaload
		// @93: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @96: iload_1
		// @97: bipush -126 (0x82)
		// @99: aload_3
		// @9A: invokevirtual game.C_100327_ib.func_102462_a(int, int, game.C_100049_vf[])game.C_100049_vf[]
		// @9D: astore_3
		// @9E: iinc #4 +1
		// @A1: iload #7
		// @A3: ifeq @13
		// @A6: aload_3
		// @A7: areturn
		// @A8: astore #4
		// @AA: aload #4
		// @AC: new java.lang.StringBuilder
		// @AF: dup
		// @B0: invokespecial java.lang.StringBuilder.<init>()void
		// @B3: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @B6: bipush 27 (0x1B)
		// @B8: aaload
		// @B9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BC: iload_1
		// @BD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C0: bipush 44 (0x2C)
		// @C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C5: iload_2
		// @C6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C9: bipush 44 (0x2C)
		// @CB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CE: aload_3
		// @CF: ifnull @DB
		// @D2: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @D5: iconst_4
		// @D6: aaload
		// @D7: goto @E0
		// @DA: athrow
		// @DB: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @DE: iconst_5
		// @DF: aaload
		// @E0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @E3: bipush 41 (0x29)
		// @E5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E8: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @EB: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @EE: athrow
	}
	
	static final boolean func_102470_r(int arg0)
	{
		// @00: iload_0
		// @01: sipush 15874 (0x3E02)
		// @04: if_icmpeq @09
		// @07: iconst_0
		// @08: ireturn
		// @09: getstatic boolean game.C_100225_ah.field_106133_i
		// @0C: ireturn
		// @0D: astore_1
		// @0E: aload_1
		// @0F: new java.lang.StringBuilder
		// @12: dup
		// @13: invokespecial java.lang.StringBuilder.<init>()void
		// @16: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
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
	
	private final void func_102469_a(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6)
	{
		// @00: iload_2
		// @01: iconst_1
		// @02: if_icmpeq @06
		// @05: return
		// @06: aload_0
		// @07: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0A: iload_1
		// @0B: aaload
		// @0C: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0F: iload #6
		// @11: aload_0
		// @12: getfield int game.C_100327_ib.field_102496_R
		// @15: iload_3
		// @16: aload_0
		// @17: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @1A: iload_1
		// @1B: aaload
		// @1C: getfield int game.C_100049_vf.field_104215_t
		// @1F: iadd
		// @20: iadd
		// @21: iload #4
		// @23: iload #7
		// @25: iload #5
		// @27: ldc 759988816 (0x2d4c8250)
		// @29: invokevirtual game.C_100327_ib.func_102437_a(int, int, boolean, int, int, int)void
		// @2C: goto @8D
		// @2F: astore #8
		// @31: aload #8
		// @33: new java.lang.StringBuilder
		// @36: dup
		// @37: invokespecial java.lang.StringBuilder.<init>()void
		// @3A: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @3D: bipush 9 (0x09)
		// @3F: aaload
		// @40: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @43: iload_1
		// @44: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @47: bipush 44 (0x2C)
		// @49: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C: iload_2
		// @4D: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @50: bipush 44 (0x2C)
		// @52: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @55: iload_3
		// @56: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @59: bipush 44 (0x2C)
		// @5B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5E: iload #4
		// @60: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @63: bipush 44 (0x2C)
		// @65: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @68: iload #5
		// @6A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6D: bipush 44 (0x2C)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: iload #6
		// @74: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @77: bipush 44 (0x2C)
		// @79: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7C: iload #7
		// @7E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @81: bipush 41 (0x29)
		// @83: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @86: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @89: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8C: athrow
		// @8D: return
	}
	
	final void func_102455_a(boolean arg0, boolean arg1, byte arg2)
	{
		// @00: iconst_m1
		// @01: aload_0
		// @02: getfield int game.C_100327_ib.field_102478_E
		// @05: iconst_m1
		// @06: ixor
		// @07: if_icmple @68
		// @0A: aload_0
		// @0B: dup
		// @0C: getfield int game.C_100327_ib.field_102478_E
		// @0F: iconst_1
		// @10: isub
		// @11: putfield int game.C_100327_ib.field_102478_E
		// @14: iload_1
		// @15: ifeq @2A
		// @18: goto @1C
		// @1B: athrow
		// @1C: sipush 128 (0x0080)
		// @1F: aload_0
		// @20: getfield int game.C_100327_ib.field_102497_w
		// @23: if_icmpeq @51
		// @26: goto @2A
		// @29: athrow
		// @2A: iload_2
		// @2B: ifeq @68
		// @2E: goto @32
		// @31: athrow
		// @32: aload_0
		// @33: getfield int game.C_100327_ib.field_102478_E
		// @36: ifle @68
		// @39: goto @3D
		// @3C: athrow
		// @3D: aload_0
		// @3E: dup
		// @3F: getfield int game.C_100327_ib.field_102478_E
		// @42: iconst_1
		// @43: isub
		// @44: putfield int game.C_100327_ib.field_102478_E
		// @47: getstatic int game.SteelSentinels.field_105275_O
		// @4A: ifeq @68
		// @4D: goto @51
		// @50: athrow
		// @51: aload_0
		// @52: getfield int game.C_100327_ib.field_102478_E
		// @55: bipush 75 (0x4B)
		// @57: if_icmple @68
		// @5A: goto @5E
		// @5D: athrow
		// @5E: aload_0
		// @5F: bipush 75 (0x4B)
		// @61: putfield int game.C_100327_ib.field_102478_E
		// @64: goto @68
		// @67: athrow
		// @68: iload_3
		// @69: bipush -17 (0xEF)
		// @6B: if_icmplt @7E
		// @6E: aload_0
		// @6F: bipush -15 (0xF1)
		// @71: bipush 112 (0x70)
		// @73: aconst_null
		// @74: checkcast int[]
		// @77: invokevirtual game.C_100327_ib.func_102446_b(int, int, int[])void
		// @7A: goto @7E
		// @7D: athrow
		// @7E: goto @B7
		// @81: astore #4
		// @83: aload #4
		// @85: new java.lang.StringBuilder
		// @88: dup
		// @89: invokespecial java.lang.StringBuilder.<init>()void
		// @8C: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @8F: bipush 34 (0x22)
		// @91: aaload
		// @92: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @95: iload_1
		// @96: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @99: bipush 44 (0x2C)
		// @9B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9E: iload_2
		// @9F: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @A2: bipush 44 (0x2C)
		// @A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A7: iload_3
		// @A8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AB: bipush 41 (0x29)
		// @AD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @B6: athrow
		// @B7: return
	}
	
	final C_100327_ib[] func_102448_a(C_100314_lf arg0, C_100327_ib[] arg1, int arg2, int arg3, int arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #9
		// @005: iload #5
		// @007: bipush -86 (0xAA)
		// @009: if_icmple @01B
		// @00C: aload_0
		// @00D: bipush -74 (0xB6)
		// @00F: aconst_null
		// @010: checkcast java.lang.String
		// @013: invokevirtual game.C_100327_ib.func_102472_a(int, java.lang.String)game.C_100327_ib
		// @016: pop
		// @017: goto @01B
		// @01A: athrow
		// @01B: iload #4
		// @01D: aload_0
		// @01E: getfield int game.C_100327_ib.field_102494_P
		// @021: sipush -8444 (0xDF04)
		// @024: invokestatic game.C_100021_wn.func_103867_a(int, int)int
		// @027: if_icmpne @041
		// @02A: iconst_0
		// @02B: aload_0
		// @02C: getfield int game.C_100327_ib.field_102497_w
		// @02F: if_icmpge @041
		// @032: goto @036
		// @035: athrow
		// @036: aload_0
		// @037: getfield int game.C_100327_ib.field_102478_E
		// @03A: ifle @08F
		// @03D: goto @041
		// @040: athrow
		// @041: iconst_0
		// @042: istore #6
		// @044: aload_0
		// @045: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @048: arraylength
		// @049: iconst_m1
		// @04A: ixor
		// @04B: iload #6
		// @04D: iconst_m1
		// @04E: ixor
		// @04F: if_icmpge @08A
		// @052: iload #9
		// @054: ifne @124
		// @057: aconst_null
		// @058: aload_0
		// @059: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @05C: iload #6
		// @05E: aaload
		// @05F: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @062: if_acmpne @06D
		// @065: goto @069
		// @068: athrow
		// @069: goto @082
		// @06C: athrow
		// @06D: aload_0
		// @06E: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @071: iload #6
		// @073: aaload
		// @074: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @077: aload_1
		// @078: aload_2
		// @079: iload_3
		// @07A: iload #4
		// @07C: bipush -106 (0x96)
		// @07E: invokevirtual game.C_100327_ib.func_102448_a(game.C_100314_lf, game.C_100327_ib[], int, int, int)game.C_100327_ib[]
		// @081: astore_2
		// @082: iinc #6 +1
		// @085: iload #9
		// @087: ifeq @044
		// @08A: iload #9
		// @08C: ifeq @124
		// @08F: aload_0
		// @090: getfield int game.C_100327_ib.field_102480_G
		// @093: iload_3
		// @094: if_icmpgt @0B0
		// @097: goto @09B
		// @09A: athrow
		// @09B: iload_3
		// @09C: iconst_m1
		// @09D: ixor
		// @09E: aload_0
		// @09F: getfield int game.C_100327_ib.field_102504_x
		// @0A2: iconst_m1
		// @0A3: ixor
		// @0A4: if_icmplt @0B0
		// @0A7: goto @0AB
		// @0AA: athrow
		// @0AB: iconst_1
		// @0AC: goto @0B1
		// @0AF: athrow
		// @0B0: iconst_0
		// @0B1: istore #6
		// @0B3: iload #6
		// @0B5: ifeq @0E9
		// @0B8: aload_1
		// @0B9: getfield boolean game.C_100314_lf.field_101307_pb
		// @0BC: ifeq @0E9
		// @0BF: goto @0C3
		// @0C2: athrow
		// @0C3: aload_0
		// @0C4: getfield int game.C_100327_ib.field_102494_P
		// @0C7: bipush -95 (0xA1)
		// @0C9: invokestatic game.C_100158_da.func_100581_a(int, byte)boolean
		// @0CC: ifeq @0E9
		// @0CF: goto @0D3
		// @0D2: athrow
		// @0D3: aload_1
		// @0D4: ldc 312774288 (0x12a48e90)
		// @0D6: bipush 31 (0x1F)
		// @0D8: invokevirtual game.C_100314_lf.func_101268_f(int, int)boolean
		// @0DB: ifeq @0E6
		// @0DE: goto @0E2
		// @0E1: athrow
		// @0E2: goto @0E9
		// @0E5: athrow
		// @0E6: iconst_0
		// @0E7: istore #6
		// @0E9: iload #6
		// @0EB: ifeq @124
		// @0EE: aload_2
		// @0EF: arraylength
		// @0F0: iconst_m1
		// @0F1: isub
		// @0F2: anewarray game.C_100327_ib
		// @0F5: astore #7
		// @0F7: iconst_0
		// @0F8: istore #8
		// @0FA: aload_2
		// @0FB: arraylength
		// @0FC: iload #8
		// @0FE: if_icmple @11B
		// @101: aload #7
		// @103: iload #8
		// @105: aload_2
		// @106: iload #8
		// @108: aaload
		// @109: aastore
		// @10A: iinc #8 +1
		// @10D: iload #9
		// @10F: ifne @121
		// @112: iload #9
		// @114: ifeq @0FA
		// @117: goto @11B
		// @11A: athrow
		// @11B: aload #7
		// @11D: aload_2
		// @11E: arraylength
		// @11F: aload_0
		// @120: aastore
		// @121: aload #7
		// @123: astore_2
		// @124: aload_2
		// @125: areturn
		// @126: astore #6
		// @128: aload #6
		// @12A: new java.lang.StringBuilder
		// @12D: dup
		// @12E: invokespecial java.lang.StringBuilder.<init>()void
		// @131: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @134: bipush 40 (0x28)
		// @136: aaload
		// @137: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @13A: aload_1
		// @13B: ifnull @147
		// @13E: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @141: iconst_4
		// @142: aaload
		// @143: goto @14C
		// @146: athrow
		// @147: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @14A: iconst_5
		// @14B: aaload
		// @14C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @14F: bipush 44 (0x2C)
		// @151: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @154: aload_2
		// @155: ifnull @161
		// @158: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @15B: iconst_4
		// @15C: aaload
		// @15D: goto @166
		// @160: athrow
		// @161: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @164: iconst_5
		// @165: aaload
		// @166: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @169: bipush 44 (0x2C)
		// @16B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16E: iload_3
		// @16F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @172: bipush 44 (0x2C)
		// @174: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @177: iload #4
		// @179: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @17C: bipush 44 (0x2C)
		// @17E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @181: iload #5
		// @183: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @186: bipush 41 (0x29)
		// @188: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @18B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @18E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @191: athrow
	}
	
	static final String func_102476_a(boolean arg0, boolean arg1, byte arg2, boolean arg3)
	{
		// @00: iload_2
		// @01: bipush 79 (0x4F)
		// @03: if_icmpge @12
		// @06: bipush 59 (0x3B)
		// @08: bipush 48 (0x30)
		// @0A: invokestatic game.C_100327_ib.func_102457_d(int, byte)int
		// @0D: pop
		// @0E: goto @12
		// @11: athrow
		// @12: iconst_0
		// @13: istore #4
		// @15: iload_1
		// @16: ifeq @20
		// @19: iinc #4 +4
		// @1C: goto @20
		// @1F: athrow
		// @20: iload_3
		// @21: ifeq @2B
		// @24: iinc #4 +2
		// @27: goto @2B
		// @2A: athrow
		// @2B: iload_0
		// @2C: ifeq @36
		// @2F: iinc #4 +1
		// @32: goto @36
		// @35: athrow
		// @36: getstatic java.lang.String[] game.C_100181_cf.field_105703_d
		// @39: iload #4
		// @3B: aaload
		// @3C: areturn
		// @3D: astore #4
		// @3F: aload #4
		// @41: new java.lang.StringBuilder
		// @44: dup
		// @45: invokespecial java.lang.StringBuilder.<init>()void
		// @48: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @4B: bipush 26 (0x1A)
		// @4D: aaload
		// @4E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @51: iload_0
		// @52: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @55: bipush 44 (0x2C)
		// @57: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5A: iload_1
		// @5B: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @5E: bipush 44 (0x2C)
		// @60: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @63: iload_2
		// @64: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @67: bipush 44 (0x2C)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: iload_3
		// @6D: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @70: bipush 41 (0x29)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @78: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7B: athrow
	}
	
	final void func_102459_a(byte arg0, int arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: aload_0
		// @006: aload_0
		// @007: getfield int game.C_100327_ib.field_102504_x
		// @00A: aload_0
		// @00B: getfield int game.C_100327_ib.field_102480_G
		// @00E: aload_0
		// @00F: getfield int game.C_100327_ib.field_102485_M
		// @012: bipush 8 (0x08)
		// @014: imul
		// @015: iadd
		// @016: iadd
		// @017: bipush 10 (0x0A)
		// @019: idiv
		// @01A: putfield int game.C_100327_ib.field_102485_M
		// @01D: aload_0
		// @01E: getfield int game.C_100327_ib.field_102494_P
		// @021: sipush -8444 (0xDF04)
		// @024: invokestatic game.C_100021_wn.func_103867_a(int, int)int
		// @027: iconst_m1
		// @028: ixor
		// @029: iload_3
		// @02A: iconst_m1
		// @02B: ixor
		// @02C: if_icmpne @1B4
		// @02F: aload_0
		// @030: getfield int game.C_100327_ib.field_102478_E
		// @033: ifgt @1B4
		// @036: goto @03A
		// @039: athrow
		// @03A: aload_0
		// @03B: getfield int game.C_100327_ib.field_102480_G
		// @03E: iconst_m1
		// @03F: ixor
		// @040: iload_2
		// @041: iconst_m1
		// @042: ixor
		// @043: if_icmplt @05A
		// @046: goto @04A
		// @049: athrow
		// @04A: aload_0
		// @04B: getfield int game.C_100327_ib.field_102504_x
		// @04E: iconst_m1
		// @04F: ixor
		// @050: iload_2
		// @051: iconst_m1
		// @052: ixor
		// @053: if_icmple @0F7
		// @056: goto @05A
		// @059: athrow
		// @05A: getstatic boolean game.C_100172_ck.field_102115_ec
		// @05D: ifeq @068
		// @060: goto @064
		// @063: athrow
		// @064: goto @0BA
		// @067: athrow
		// @068: getstatic int game.C_100146_bf.field_105139_t
		// @06B: getstatic int game.C_100124_tn.field_104934_e
		// @06E: if_icmpeq @0A8
		// @071: getstatic int game.C_100146_bf.field_105139_t
		// @074: aload_0
		// @075: getfield int game.C_100327_ib.field_102504_x
		// @078: if_icmpge @08A
		// @07B: goto @07F
		// @07E: athrow
		// @07F: aload_0
		// @080: getfield int game.C_100327_ib.field_102504_x
		// @083: putstatic int game.C_100146_bf.field_105139_t
		// @086: goto @08A
		// @089: athrow
		// @08A: aload_0
		// @08B: getfield int game.C_100327_ib.field_102480_G
		// @08E: iconst_m1
		// @08F: ixor
		// @090: getstatic int game.C_100124_tn.field_104934_e
		// @093: iconst_m1
		// @094: ixor
		// @095: if_icmple @0BA
		// @098: aload_0
		// @099: getfield int game.C_100327_ib.field_102480_G
		// @09C: putstatic int game.C_100124_tn.field_104934_e
		// @09F: iload #5
		// @0A1: ifeq @0BA
		// @0A4: goto @0A8
		// @0A7: athrow
		// @0A8: aload_0
		// @0A9: getfield int game.C_100327_ib.field_102504_x
		// @0AC: putstatic int game.C_100146_bf.field_105139_t
		// @0AF: aload_0
		// @0B0: getfield int game.C_100327_ib.field_102480_G
		// @0B3: putstatic int game.C_100124_tn.field_104934_e
		// @0B6: goto @0BA
		// @0B9: athrow
		// @0BA: aconst_null
		// @0BB: aload_0
		// @0BC: getfield game.C_100327_ib game.C_100327_ib.field_102495_S
		// @0BF: if_acmpeq @22E
		// @0C2: aload_0
		// @0C3: aload_0
		// @0C4: getfield game.C_100327_ib game.C_100327_ib.field_102495_S
		// @0C7: getfield int game.C_100327_ib.field_102480_G
		// @0CA: aload_0
		// @0CB: getfield game.C_100327_ib game.C_100327_ib.field_102495_S
		// @0CE: getfield int game.C_100327_ib.field_102504_x
		// @0D1: ineg
		// @0D2: isub
		// @0D3: iconst_2
		// @0D4: idiv
		// @0D5: ineg
		// @0D6: aload_0
		// @0D7: getfield game.C_100327_ib game.C_100327_ib.field_102495_S
		// @0DA: getfield int game.C_100327_ib.field_102485_M
		// @0DD: aload_0
		// @0DE: getfield int game.C_100327_ib.field_102480_G
		// @0E1: aload_0
		// @0E2: getfield int game.C_100327_ib.field_102504_x
		// @0E5: ineg
		// @0E6: isub
		// @0E7: iconst_2
		// @0E8: idiv
		// @0E9: iadd
		// @0EA: iadd
		// @0EB: putfield int game.C_100327_ib.field_102485_M
		// @0EE: iload #5
		// @0F0: ifeq @22E
		// @0F3: goto @0F7
		// @0F6: athrow
		// @0F7: iconst_1
		// @0F8: putstatic boolean game.C_100172_ck.field_102115_ec
		// @0FB: aload_0
		// @0FC: iload_2
		// @0FD: putfield int game.C_100327_ib.field_102485_M
		// @100: getstatic int game.C_100124_tn.field_104934_e
		// @103: getstatic int game.C_100146_bf.field_105139_t
		// @106: if_icmpne @124
		// @109: goto @10D
		// @10C: athrow
		// @10D: aload_0
		// @10E: getfield int game.C_100327_ib.field_102480_G
		// @111: putstatic int game.C_100124_tn.field_104934_e
		// @114: aload_0
		// @115: getfield int game.C_100327_ib.field_102504_x
		// @118: putstatic int game.C_100146_bf.field_105139_t
		// @11B: iload #5
		// @11D: ifeq @156
		// @120: goto @124
		// @123: athrow
		// @124: aload_0
		// @125: getfield int game.C_100327_ib.field_102480_G
		// @128: iconst_m1
		// @129: ixor
		// @12A: getstatic int game.C_100124_tn.field_104934_e
		// @12D: iconst_m1
		// @12E: ixor
		// @12F: if_icmple @141
		// @132: goto @136
		// @135: athrow
		// @136: aload_0
		// @137: getfield int game.C_100327_ib.field_102480_G
		// @13A: putstatic int game.C_100124_tn.field_104934_e
		// @13D: goto @141
		// @140: athrow
		// @141: aload_0
		// @142: getfield int game.C_100327_ib.field_102504_x
		// @145: getstatic int game.C_100146_bf.field_105139_t
		// @148: if_icmpgt @14F
		// @14B: goto @156
		// @14E: athrow
		// @14F: aload_0
		// @150: getfield int game.C_100327_ib.field_102504_x
		// @153: putstatic int game.C_100146_bf.field_105139_t
		// @156: aload_0
		// @157: getfield game.C_100327_ib game.C_100327_ib.field_102495_S
		// @15A: astore #4
		// @15C: aconst_null
		// @15D: aload #4
		// @15F: if_acmpeq @1AF
		// @162: aload_0
		// @163: getfield int game.C_100327_ib.field_102504_x
		// @166: aload_0
		// @167: getfield int game.C_100327_ib.field_102480_G
		// @16A: isub
		// @16B: iload #5
		// @16D: ifne @22F
		// @170: ifle @1A3
		// @173: goto @177
		// @176: athrow
		// @177: aload #4
		// @179: aload #4
		// @17B: getfield int game.C_100327_ib.field_102480_G
		// @17E: aload #4
		// @180: getfield int game.C_100327_ib.field_102504_x
		// @183: aload #4
		// @185: getfield int game.C_100327_ib.field_102480_G
		// @188: isub
		// @189: iload_2
		// @18A: aload_0
		// @18B: getfield int game.C_100327_ib.field_102480_G
		// @18E: isub
		// @18F: imul
		// @190: aload_0
		// @191: getfield int game.C_100327_ib.field_102480_G
		// @194: ineg
		// @195: aload_0
		// @196: getfield int game.C_100327_ib.field_102504_x
		// @199: iadd
		// @19A: idiv
		// @19B: iadd
		// @19C: putfield int game.C_100327_ib.field_102485_M
		// @19F: goto @1A3
		// @1A2: athrow
		// @1A3: aload #4
		// @1A5: getfield game.C_100327_ib game.C_100327_ib.field_102495_S
		// @1A8: astore #4
		// @1AA: iload #5
		// @1AC: ifeq @15C
		// @1AF: iload #5
		// @1B1: ifeq @22E
		// @1B4: aconst_null
		// @1B5: aload_0
		// @1B6: getfield game.C_100327_ib game.C_100327_ib.field_102495_S
		// @1B9: if_acmpne @1C4
		// @1BC: goto @1C0
		// @1BF: athrow
		// @1C0: goto @1ED
		// @1C3: athrow
		// @1C4: aload_0
		// @1C5: aload_0
		// @1C6: getfield int game.C_100327_ib.field_102504_x
		// @1C9: aload_0
		// @1CA: getfield int game.C_100327_ib.field_102480_G
		// @1CD: iadd
		// @1CE: iconst_2
		// @1CF: idiv
		// @1D0: aload_0
		// @1D1: getfield game.C_100327_ib game.C_100327_ib.field_102495_S
		// @1D4: getfield int game.C_100327_ib.field_102485_M
		// @1D7: aload_0
		// @1D8: getfield game.C_100327_ib game.C_100327_ib.field_102495_S
		// @1DB: getfield int game.C_100327_ib.field_102504_x
		// @1DE: aload_0
		// @1DF: getfield game.C_100327_ib game.C_100327_ib.field_102495_S
		// @1E2: getfield int game.C_100327_ib.field_102480_G
		// @1E5: iadd
		// @1E6: iconst_2
		// @1E7: idiv
		// @1E8: isub
		// @1E9: iadd
		// @1EA: putfield int game.C_100327_ib.field_102485_M
		// @1ED: iconst_0
		// @1EE: istore #4
		// @1F0: aload_0
		// @1F1: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @1F4: arraylength
		// @1F5: iload #4
		// @1F7: if_icmple @22E
		// @1FA: iload #5
		// @1FC: ifne @244
		// @1FF: aconst_null
		// @200: aload_0
		// @201: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @204: iload #4
		// @206: aaload
		// @207: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @20A: if_acmpeq @226
		// @20D: goto @211
		// @210: athrow
		// @211: aload_0
		// @212: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @215: iload #4
		// @217: aaload
		// @218: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @21B: bipush 127 (0x7F)
		// @21D: iload_2
		// @21E: iload_3
		// @21F: invokevirtual game.C_100327_ib.func_102459_a(byte, int, int)void
		// @222: goto @226
		// @225: athrow
		// @226: iinc #4 +1
		// @229: iload #5
		// @22B: ifeq @1F0
		// @22E: iload_1
		// @22F: bipush 125 (0x7D)
		// @231: if_icmpge @244
		// @234: aload_0
		// @235: bipush 101 (0x65)
		// @237: bipush -110 (0x92)
		// @239: aconst_null
		// @23A: checkcast int[]
		// @23D: invokevirtual game.C_100327_ib.func_102446_b(int, int, int[])void
		// @240: goto @244
		// @243: athrow
		// @244: goto @27C
		// @247: astore #4
		// @249: aload #4
		// @24B: new java.lang.StringBuilder
		// @24E: dup
		// @24F: invokespecial java.lang.StringBuilder.<init>()void
		// @252: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @255: iconst_1
		// @256: aaload
		// @257: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25A: iload_1
		// @25B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @25E: bipush 44 (0x2C)
		// @260: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @263: iload_2
		// @264: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @267: bipush 44 (0x2C)
		// @269: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @26C: iload_3
		// @26D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @270: bipush 41 (0x29)
		// @272: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @275: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @278: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @27B: athrow
		// @27C: return
	}
	
	private final int[] func_102439_a(int[] arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #9
		// @005: iload_2
		// @006: sipush 24931 (0x6163)
		// @009: if_icmpeq @017
		// @00C: aload_0
		// @00D: bipush 91 (0x5B)
		// @00F: iconst_m1
		// @010: invokevirtual game.C_100327_ib.func_102453_a(int, int)void
		// @013: goto @017
		// @016: athrow
		// @017: iconst_0
		// @018: istore_3
		// @019: iconst_0
		// @01A: aload_0
		// @01B: getfield int game.C_100327_ib.field_102497_w
		// @01E: sipush 1008 (0x03F0)
		// @021: iand
		// @022: if_icmpeq @034
		// @025: aload_0
		// @026: getfield int game.C_100327_ib.field_102494_P
		// @029: bipush 83 (0x53)
		// @02B: if_icmpeq @034
		// @02E: goto @032
		// @031: athrow
		// @032: iconst_1
		// @033: istore_3
		// @034: iconst_0
		// @035: istore #4
		// @037: aload_0
		// @038: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @03B: arraylength
		// @03C: iload #4
		// @03E: if_icmple @078
		// @041: iload #9
		// @043: ifne @140
		// @046: aconst_null
		// @047: aload_0
		// @048: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @04B: iload #4
		// @04D: aaload
		// @04E: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @051: if_acmpne @05C
		// @054: goto @058
		// @057: athrow
		// @058: goto @070
		// @05B: athrow
		// @05C: aload_0
		// @05D: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @060: iload #4
		// @062: aaload
		// @063: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @066: aload_1
		// @067: iload_2
		// @068: iconst_0
		// @069: ixor
		// @06A: invokespecial game.C_100327_ib.func_102439_a(int[], int)int[]
		// @06D: astore_1
		// @06E: iconst_0
		// @06F: istore_3
		// @070: iinc #4 +1
		// @073: iload #9
		// @075: ifeq @037
		// @078: iload_3
		// @079: ifeq @140
		// @07C: aload_0
		// @07D: getfield int game.C_100327_ib.field_102494_P
		// @080: iconst_m1
		// @081: ixor
		// @082: ifne @08D
		// @085: goto @089
		// @088: athrow
		// @089: goto @140
		// @08C: athrow
		// @08D: aload_1
		// @08E: arraylength
		// @08F: istore #4
		// @091: iconst_0
		// @092: istore #5
		// @094: iload #5
		// @096: iload #4
		// @098: if_icmpge @0C7
		// @09B: aload_1
		// @09C: iload #9
		// @09E: ifne @0C8
		// @0A1: iload #5
		// @0A3: iaload
		// @0A4: iconst_m1
		// @0A5: ixor
		// @0A6: aload_0
		// @0A7: getfield int game.C_100327_ib.field_102494_P
		// @0AA: sipush -8444 (0xDF04)
		// @0AD: invokestatic game.C_100021_wn.func_103867_a(int, int)int
		// @0B0: iconst_m1
		// @0B1: ixor
		// @0B2: if_icmpeq @0BD
		// @0B5: goto @0B9
		// @0B8: athrow
		// @0B9: goto @0BF
		// @0BC: athrow
		// @0BD: aload_1
		// @0BE: areturn
		// @0BF: iinc #5 +1
		// @0C2: iload #9
		// @0C4: ifeq @094
		// @0C7: aload_1
		// @0C8: astore #5
		// @0CA: iload #4
		// @0CC: iconst_m1
		// @0CD: isub
		// @0CE: newarray int[]
		// @0D0: astore_1
		// @0D1: aload_0
		// @0D2: getfield int game.C_100327_ib.field_102494_P
		// @0D5: sipush -8444 (0xDF04)
		// @0D8: invokestatic game.C_100021_wn.func_103867_a(int, int)int
		// @0DB: istore #6
		// @0DD: iconst_0
		// @0DE: istore #7
		// @0E0: iconst_0
		// @0E1: istore #8
		// @0E3: iload #4
		// @0E5: iconst_m1
		// @0E6: ixor
		// @0E7: iload #8
		// @0E9: iconst_m1
		// @0EA: ixor
		// @0EB: if_icmpge @12F
		// @0EE: iload #6
		// @0F0: iconst_m1
		// @0F1: iload #9
		// @0F3: ifne @132
		// @0F6: if_icmpeq @11B
		// @0F9: goto @0FD
		// @0FC: athrow
		// @0FD: iload #6
		// @0FF: aload #5
		// @101: iload #8
		// @103: iaload
		// @104: if_icmplt @10F
		// @107: goto @10B
		// @10A: athrow
		// @10B: goto @11B
		// @10E: athrow
		// @10F: aload_1
		// @110: iload #7
		// @112: iload #6
		// @114: iastore
		// @115: iinc #7 +1
		// @118: iconst_m1
		// @119: istore #6
		// @11B: aload_1
		// @11C: iload #7
		// @11E: aload #5
		// @120: iload #8
		// @122: iaload
		// @123: iastore
		// @124: iinc #7 +1
		// @127: iinc #8 +1
		// @12A: iload #9
		// @12C: ifeq @0E3
		// @12F: iload #6
		// @131: iconst_m1
		// @132: ixor
		// @133: ifne @13A
		// @136: goto @140
		// @139: athrow
		// @13A: aload_1
		// @13B: iload #4
		// @13D: iload #6
		// @13F: iastore
		// @140: aload_1
		// @141: areturn
		// @142: astore_3
		// @143: aload_3
		// @144: new java.lang.StringBuilder
		// @147: dup
		// @148: invokespecial java.lang.StringBuilder.<init>()void
		// @14B: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @14E: bipush 33 (0x21)
		// @150: aaload
		// @151: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @154: aload_1
		// @155: ifnull @161
		// @158: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @15B: iconst_4
		// @15C: aaload
		// @15D: goto @166
		// @160: athrow
		// @161: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @164: iconst_5
		// @165: aaload
		// @166: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @169: bipush 44 (0x2C)
		// @16B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16E: iload_2
		// @16F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @172: bipush 41 (0x29)
		// @174: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @177: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @17A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @17D: athrow
	}
	
	static final void func_102468_p(int arg0)
	{
		// @00: getstatic int game.C_100239_oi.field_102312_P
		// @03: getstatic int game.C_100239_oi.field_102312_P
		// @06: imul
		// @07: istore_1
		// @08: iload_0
		// @09: sipush 22547 (0x5813)
		// @0C: if_icmpeq @1A
		// @0F: aconst_null
		// @10: checkcast java.lang.String
		// @13: putstatic java.lang.String game.C_100327_ib.field_102487_O
		// @16: goto @1A
		// @19: athrow
		// @1A: iload_1
		// @1B: getstatic int game.C_100038_wa.field_104077_j
		// @1E: getstatic int game.C_100038_wa.field_104077_j
		// @21: imul
		// @22: ineg
		// @23: iadd
		// @24: istore_2
		// @25: getstatic int game.C_100280_nf.field_101173_s
		// @28: getstatic int game.C_100303_kk.field_104788_o
		// @2B: isub
		// @2C: iload_2
		// @2D: imul
		// @2E: iload_1
		// @2F: idiv
		// @30: getstatic int game.C_100303_kk.field_104788_o
		// @33: iadd
		// @34: istore_3
		// @35: getstatic game.C_100302_ka game.C_100265_mh.field_106621_l
		// @38: getstatic int game.C_100268_mk.field_106671_a
		// @3B: bipush 120 (0x78)
		// @3D: iconst_m1
		// @3E: iload_3
		// @3F: sipush 640 (0x0280)
		// @42: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @45: sipush 640 (0x0280)
		// @48: iconst_5
		// @49: getstatic int game.C_100280_nf.field_101173_s
		// @4C: bipush 24 (0x18)
		// @4E: isub
		// @4F: getstatic int game.C_100284_nj.field_106771_c
		// @52: iconst_0
		// @53: getstatic int game.C_100244_pe.field_106375_d
		// @56: iconst_0
		// @57: invokestatic game.C_100034_gi.func_103994_a(int, int, int, int, int, int, int)void
		// @5A: goto @7F
		// @5D: astore_1
		// @5E: aload_1
		// @5F: new java.lang.StringBuilder
		// @62: dup
		// @63: invokespecial java.lang.StringBuilder.<init>()void
		// @66: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @69: bipush 31 (0x1F)
		// @6B: aaload
		// @6C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6F: iload_0
		// @70: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @73: bipush 41 (0x29)
		// @75: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @78: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7E: athrow
		// @7F: return
	}
	
	static final int func_102457_d(int arg0, byte arg1)
	{
		// @00: iload_1
		// @01: bipush -50 (0xCE)
		// @03: if_icmple @11
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: putstatic java.lang.String game.C_100327_ib.field_102479_F
		// @0D: goto @11
		// @10: athrow
		// @11: iload_0
		// @12: iconst_m1
		// @13: ixor
		// @14: bipush -6 (0xFA)
		// @16: if_icmpgt @25
		// @19: bipush -10 (0xF6)
		// @1B: iload_0
		// @1C: iconst_m1
		// @1D: ixor
		// @1E: if_icmple @27
		// @21: goto @25
		// @24: athrow
		// @25: iconst_0
		// @26: ireturn
		// @27: iload_0
		// @28: iconst_1
		// @29: iadd
		// @2A: iconst_5
		// @2B: isub
		// @2C: ireturn
		// @2D: astore_2
		// @2E: aload_2
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @39: bipush 24 (0x18)
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: iload_0
		// @40: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @43: bipush 44 (0x2C)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: iload_1
		// @49: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4C: bipush 41 (0x29)
		// @4E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @51: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @54: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @57: athrow
	}
	
	private final C_100327_ib[] func_102464_a(int arg0, C_100327_ib[] arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #7
		// @05: iconst_0
		// @06: istore_3
		// @07: iconst_m1
		// @08: sipush 1008 (0x03F0)
		// @0B: aload_0
		// @0C: getfield int game.C_100327_ib.field_102497_w
		// @0F: iand
		// @10: iconst_m1
		// @11: ixor
		// @12: if_icmpeq @17
		// @15: iconst_1
		// @16: istore_3
		// @17: iconst_0
		// @18: istore #4
		// @1A: iload #4
		// @1C: iconst_m1
		// @1D: ixor
		// @1E: aload_0
		// @1F: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @22: arraylength
		// @23: iconst_m1
		// @24: ixor
		// @25: if_icmple @5E
		// @28: iload #7
		// @2A: ifne @6D
		// @2D: aconst_null
		// @2E: aload_0
		// @2F: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @32: iload #4
		// @34: aaload
		// @35: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @38: if_acmpne @43
		// @3B: goto @3F
		// @3E: athrow
		// @3F: goto @56
		// @42: athrow
		// @43: aload_0
		// @44: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @47: iload #4
		// @49: aaload
		// @4A: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @4D: bipush 121 (0x79)
		// @4F: aload_2
		// @50: invokespecial game.C_100327_ib.func_102464_a(int, game.C_100327_ib[])game.C_100327_ib[]
		// @53: astore_2
		// @54: iconst_0
		// @55: istore_3
		// @56: iinc #4 +1
		// @59: iload #7
		// @5B: ifeq @1A
		// @5E: iload_1
		// @5F: bipush 62 (0x3E)
		// @61: if_icmpgt @6D
		// @64: bipush 6 (0x06)
		// @66: invokestatic game.C_100327_ib.func_102451_k(int)void
		// @69: goto @6D
		// @6C: athrow
		// @6D: iload_3
		// @6E: ifeq @B6
		// @71: aload_0
		// @72: getfield int game.C_100327_ib.field_102494_P
		// @75: iconst_m1
		// @76: ixor
		// @77: ifeq @B6
		// @7A: goto @7E
		// @7D: athrow
		// @7E: aload_2
		// @7F: arraylength
		// @80: istore #4
		// @82: aload_2
		// @83: astore #5
		// @85: iload #4
		// @87: iconst_1
		// @88: iadd
		// @89: anewarray game.C_100327_ib
		// @8C: astore_2
		// @8D: iconst_0
		// @8E: istore #6
		// @90: iload #4
		// @92: iload #6
		// @94: if_icmple @B1
		// @97: aload_2
		// @98: iload #6
		// @9A: aload #5
		// @9C: iload #6
		// @9E: aaload
		// @9F: aastore
		// @A0: iinc #6 +1
		// @A3: iload #7
		// @A5: ifne @B6
		// @A8: iload #7
		// @AA: ifeq @90
		// @AD: goto @B1
		// @B0: athrow
		// @B1: aload_2
		// @B2: iload #4
		// @B4: aload_0
		// @B5: aastore
		// @B6: aload_2
		// @B7: areturn
		// @B8: astore_3
		// @B9: aload_3
		// @BA: new java.lang.StringBuilder
		// @BD: dup
		// @BE: invokespecial java.lang.StringBuilder.<init>()void
		// @C1: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @C4: iconst_3
		// @C5: aaload
		// @C6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C9: iload_1
		// @CA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CD: bipush 44 (0x2C)
		// @CF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D2: aload_2
		// @D3: ifnull @DF
		// @D6: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @D9: iconst_4
		// @DA: aaload
		// @DB: goto @E4
		// @DE: athrow
		// @DF: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @E2: iconst_5
		// @E3: aaload
		// @E4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @E7: bipush 41 (0x29)
		// @E9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @EC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @EF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @F2: athrow
	}
	
	static final String func_102456_a(CharSequence arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: aload_0
		// @06: invokeinterface java.lang.CharSequence.length()int
		// @0B: istore_2
		// @0C: iload_2
		// @0D: bipush 20 (0x14)
		// @0F: if_icmple @15
		// @12: bipush 20 (0x14)
		// @14: istore_2
		// @15: iload_2
		// @16: newarray char[]
		// @18: astore_3
		// @19: iload_1
		// @1A: sipush 8192 (0x2000)
		// @1D: if_icmpeq @29
		// @20: bipush 79 (0x4F)
		// @22: putstatic int game.C_100327_ib.field_102483_C
		// @25: goto @29
		// @28: athrow
		// @29: iconst_0
		// @2A: istore #4
		// @2C: iload #4
		// @2E: iconst_m1
		// @2F: ixor
		// @30: iload_2
		// @31: iconst_m1
		// @32: ixor
		// @33: if_icmple @B9
		// @36: aload_0
		// @37: iload #4
		// @39: invokeinterface java.lang.CharSequence.charAt(int)char
		// @3E: istore #5
		// @40: bipush -66 (0xBE)
		// @42: iload #5
		// @44: iconst_m1
		// @45: ixor
		// @46: if_icmplt @6A
		// @49: bipush 90 (0x5A)
		// @4B: iload #5
		// @4D: if_icmplt @6A
		// @50: goto @54
		// @53: athrow
		// @54: aload_3
		// @55: iload #4
		// @57: bipush -65 (0xBF)
		// @59: iload #5
		// @5B: bipush 97 (0x61)
		// @5D: iadd
		// @5E: iadd
		// @5F: i2c
		// @60: castore
		// @61: iload #6
		// @63: ifeq @B1
		// @66: goto @6A
		// @69: athrow
		// @6A: bipush 97 (0x61)
		// @6C: iload #5
		// @6E: if_icmpgt @82
		// @71: goto @75
		// @74: athrow
		// @75: iload #5
		// @77: iconst_m1
		// @78: ixor
		// @79: bipush -123 (0x85)
		// @7B: if_icmpge @98
		// @7E: goto @82
		// @81: athrow
		// @82: bipush 48 (0x30)
		// @84: iload #5
		// @86: if_icmpgt @A7
		// @89: goto @8D
		// @8C: athrow
		// @8D: iload #5
		// @8F: bipush 57 (0x39)
		// @91: if_icmpgt @A7
		// @94: goto @98
		// @97: athrow
		// @98: aload_3
		// @99: iload #4
		// @9B: iload #5
		// @9D: castore
		// @9E: iload #6
		// @A0: ifeq @B1
		// @A3: goto @A7
		// @A6: athrow
		// @A7: aload_3
		// @A8: iload #4
		// @AA: bipush 95 (0x5F)
		// @AC: castore
		// @AD: goto @B1
		// @B0: athrow
		// @B1: iinc #4 +1
		// @B4: iload #6
		// @B6: ifeq @2C
		// @B9: new java.lang.String
		// @BC: dup
		// @BD: aload_3
		// @BE: invokespecial java.lang.String.<init>(char[])void
		// @C1: areturn
		// @C2: astore_2
		// @C3: aload_2
		// @C4: new java.lang.StringBuilder
		// @C7: dup
		// @C8: invokespecial java.lang.StringBuilder.<init>()void
		// @CB: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @CE: bipush 7 (0x07)
		// @D0: aaload
		// @D1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D4: aload_0
		// @D5: ifnull @E1
		// @D8: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @DB: iconst_4
		// @DC: aaload
		// @DD: goto @E6
		// @E0: athrow
		// @E1: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @E4: iconst_5
		// @E5: aaload
		// @E6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @E9: bipush 44 (0x2C)
		// @EB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @EE: iload_1
		// @EF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @F2: bipush 41 (0x29)
		// @F4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @F7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @FA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @FD: athrow
	}
	
	final void func_102436_b(int arg0, int arg1, int arg2, int arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: iload_3
		// @006: aload_0
		// @007: getfield int game.C_100327_ib.field_102477_D
		// @00A: ineg
		// @00B: isub
		// @00C: istore #5
		// @00E: iload #4
		// @010: sipush -19050 (0xB596)
		// @013: if_icmpeq @020
		// @016: aload_0
		// @017: bipush -75 (0xB5)
		// @019: putfield int game.C_100327_ib.field_102497_w
		// @01C: goto @020
		// @01F: athrow
		// @020: aload_0
		// @021: iload #5
		// @023: putfield int game.C_100327_ib.field_102485_M
		// @026: aload_0
		// @027: aload_0
		// @028: getfield int game.C_100327_ib.field_102477_D
		// @02B: iload_2
		// @02C: iadd
		// @02D: aload_0
		// @02E: getfield int game.C_100327_ib.field_102496_R
		// @031: ineg
		// @032: iadd
		// @033: putfield int game.C_100327_ib.field_102480_G
		// @036: aload_0
		// @037: iload_1
		// @038: aload_0
		// @039: getfield int game.C_100327_ib.field_102496_R
		// @03C: iadd
		// @03D: aload_0
		// @03E: getfield int game.C_100327_ib.field_102477_D
		// @041: ineg
		// @042: isub
		// @043: putfield int game.C_100327_ib.field_102504_x
		// @046: iconst_0
		// @047: istore #6
		// @049: aload_0
		// @04A: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @04D: arraylength
		// @04E: iload #6
		// @050: if_icmple @0DC
		// @053: iload #8
		// @055: ifne @11F
		// @058: aconst_null
		// @059: aload_0
		// @05A: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @05D: iload #6
		// @05F: aaload
		// @060: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @063: if_acmpne @06E
		// @066: goto @06A
		// @069: athrow
		// @06A: goto @0D4
		// @06D: athrow
		// @06E: aload_0
		// @06F: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @072: iload #6
		// @074: aaload
		// @075: getfield int game.C_100049_vf.field_104198_g
		// @078: iload #5
		// @07A: iadd
		// @07B: istore #7
		// @07D: aload_0
		// @07E: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @081: iload #6
		// @083: aaload
		// @084: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @087: aload_0
		// @088: putfield game.C_100327_ib game.C_100327_ib.field_102495_S
		// @08B: aload_0
		// @08C: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @08F: iload #6
		// @091: aaload
		// @092: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @095: aload_0
		// @096: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @099: iload #6
		// @09B: aaload
		// @09C: getfield int game.C_100049_vf.field_104198_g
		// @09F: aload_0
		// @0A0: getfield int game.C_100327_ib.field_102504_x
		// @0A3: iadd
		// @0A4: aload_0
		// @0A5: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0A8: iload #6
		// @0AA: aaload
		// @0AB: getfield int game.C_100049_vf.field_104215_t
		// @0AE: ineg
		// @0AF: isub
		// @0B0: aload_0
		// @0B1: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0B4: iload #6
		// @0B6: aaload
		// @0B7: getfield int game.C_100049_vf.field_104198_g
		// @0BA: aload_0
		// @0BB: getfield int game.C_100327_ib.field_102480_G
		// @0BE: aload_0
		// @0BF: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0C2: iload #6
		// @0C4: aaload
		// @0C5: getfield int game.C_100049_vf.field_104215_t
		// @0C8: ineg
		// @0C9: iadd
		// @0CA: iadd
		// @0CB: iload #7
		// @0CD: iload #4
		// @0CF: iconst_0
		// @0D0: ixor
		// @0D1: invokevirtual game.C_100327_ib.func_102436_b(int, int, int, int)void
		// @0D4: iinc #6 +1
		// @0D7: iload #8
		// @0D9: ifeq @049
		// @0DC: goto @11F
		// @0DF: astore #5
		// @0E1: aload #5
		// @0E3: new java.lang.StringBuilder
		// @0E6: dup
		// @0E7: invokespecial java.lang.StringBuilder.<init>()void
		// @0EA: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @0ED: bipush 30 (0x1E)
		// @0EF: aaload
		// @0F0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F3: iload_1
		// @0F4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F7: bipush 44 (0x2C)
		// @0F9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FC: iload_2
		// @0FD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @100: bipush 44 (0x2C)
		// @102: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @105: iload_3
		// @106: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @109: bipush 44 (0x2C)
		// @10B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10E: iload #4
		// @110: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @113: bipush 41 (0x29)
		// @115: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @118: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @11B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @11E: athrow
		// @11F: return
	}
	
	private final void func_102454_a(C_100327_ib arg0, byte arg1, boolean arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: aload_0
		// @006: iload_3
		// @007: putfield boolean game.C_100327_ib.field_102501_s
		// @00A: iload_3
		// @00B: ifne @15C
		// @00E: aload_1
		// @00F: getfield game.C_100153_be game.C_100327_ib.field_102489_I
		// @012: ifnonnull @13F
		// @015: goto @019
		// @018: athrow
		// @019: aload_1
		// @01A: getfield game.C_100153_be game.C_100327_ib.field_102492_T
		// @01D: ifnonnull @028
		// @020: goto @024
		// @023: athrow
		// @024: goto @13F
		// @027: athrow
		// @028: new game.C_100037_wb
		// @02B: dup
		// @02C: aload_1
		// @02D: getfield game.C_100153_be game.C_100327_ib.field_102492_T
		// @030: getfield int game.C_100153_be.field_105301_h
		// @033: ldc 1844612834 (0x6df28ee2)
		// @035: ishr
		// @036: aload_1
		// @037: getfield game.C_100153_be game.C_100327_ib.field_102492_T
		// @03A: getfield int game.C_100153_be.field_105303_s
		// @03D: ldc -913596542 (0xc98b9f82)
		// @03F: ishr
		// @040: invokespecial game.C_100037_wb.<init>(int, int)void
		// @043: astore #4
		// @045: getstatic int[] game.C_100196_rb.field_105818_d
		// @048: astore #5
		// @04A: aload #4
		// @04C: invokevirtual game.C_100037_wb.func_102379_d()void
		// @04F: aload_1
		// @050: getfield game.C_100153_be game.C_100327_ib.field_102492_T
		// @053: iconst_0
		// @054: iconst_0
		// @055: invokevirtual game.C_100153_be.func_105312_b(int, int)void
		// @058: aload #5
		// @05A: sipush 640 (0x0280)
		// @05D: sipush 480 (0x01E0)
		// @060: invokestatic game.C_100196_rb.func_105808_a(int[], int, int)void
		// @063: aload_1
		// @064: new game.C_100153_be
		// @067: dup
		// @068: aload #4
		// @06A: getfield int game.C_100037_wb.field_102341_y
		// @06D: aload #4
		// @06F: getfield int game.C_100037_wb.field_102340_z
		// @072: sipush 129 (0x0081)
		// @075: invokespecial game.C_100153_be.<init>(int, int, int)void
		// @078: putfield game.C_100153_be game.C_100327_ib.field_102489_I
		// @07B: aload #4
		// @07D: getfield int[] game.C_100037_wb.field_102388_J
		// @080: arraylength
		// @081: iconst_m1
		// @082: iadd
		// @083: istore #6
		// @085: iload #6
		// @087: iflt @11C
		// @08A: aload #4
		// @08C: getfield int[] game.C_100037_wb.field_102388_J
		// @08F: iload #6
		// @091: iaload
		// @092: istore #7
		// @094: iconst_m1
		// @095: iload #8
		// @097: ifne @1A5
		// @09A: iload #7
		// @09C: iconst_m1
		// @09D: ixor
		// @09E: if_icmpeq @105
		// @0A1: goto @0A5
		// @0A4: athrow
		// @0A5: iload #7
		// @0A7: ldc -436806776 (0xe5f6db88)
		// @0A9: ishr
		// @0AA: iconst_m1
		// @0AB: ixor
		// @0AC: iload #7
		// @0AE: ldc 65535 (0xffff)
		// @0B0: iand
		// @0B1: iconst_m1
		// @0B2: ixor
		// @0B3: if_icmpeq @0E0
		// @0B6: goto @0BA
		// @0B9: athrow
		// @0BA: aload_1
		// @0BB: getfield game.C_100153_be game.C_100327_ib.field_102489_I
		// @0BE: getfield byte[] game.C_100153_be.field_105319_u
		// @0C1: iload #6
		// @0C3: bipush 65 (0x41)
		// @0C5: bipush 63 (0x3F)
		// @0C7: iload #7
		// @0C9: sipush 255 (0x00FF)
		// @0CC: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @0CF: imul
		// @0D0: sipush 255 (0x00FF)
		// @0D3: idiv
		// @0D4: iadd
		// @0D5: i2b
		// @0D6: bastore
		// @0D7: iload #8
		// @0D9: ifeq @114
		// @0DC: goto @0E0
		// @0DF: athrow
		// @0E0: aload_1
		// @0E1: getfield game.C_100153_be game.C_100327_ib.field_102489_I
		// @0E4: getfield byte[] game.C_100153_be.field_105319_u
		// @0E7: iload #6
		// @0E9: iconst_1
		// @0EA: iload #7
		// @0EC: sipush 255 (0x00FF)
		// @0EF: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @0F2: bipush 63 (0x3F)
		// @0F4: imul
		// @0F5: sipush 255 (0x00FF)
		// @0F8: idiv
		// @0F9: iadd
		// @0FA: i2b
		// @0FB: bastore
		// @0FC: iload #8
		// @0FE: ifeq @114
		// @101: goto @105
		// @104: athrow
		// @105: aload_1
		// @106: getfield game.C_100153_be game.C_100327_ib.field_102489_I
		// @109: getfield byte[] game.C_100153_be.field_105319_u
		// @10C: iload #6
		// @10E: iconst_0
		// @10F: bastore
		// @110: goto @114
		// @113: athrow
		// @114: iinc #6 +255
		// @117: iload #8
		// @119: ifeq @085
		// @11C: aload_1
		// @11D: getfield game.C_100153_be game.C_100327_ib.field_102489_I
		// @120: getstatic int[] game.C_100143_bl.field_105103_b
		// @123: putfield int[] game.C_100153_be.field_105320_t
		// @126: aload_1
		// @127: aload_1
		// @128: getfield game.C_100153_be game.C_100327_ib.field_102489_I
		// @12B: invokevirtual game.C_100153_be.func_105310_a()game.C_100153_be
		// @12E: putfield game.C_100153_be game.C_100327_ib.field_102484_L
		// @131: aload_1
		// @132: getfield game.C_100153_be game.C_100327_ib.field_102484_L
		// @135: aload_1
		// @136: getfield game.C_100153_be game.C_100327_ib.field_102489_I
		// @139: getfield int[] game.C_100153_be.field_105320_t
		// @13C: putfield int[] game.C_100153_be.field_105320_t
		// @13F: aload_0
		// @140: aload_1
		// @141: getfield game.C_100153_be game.C_100327_ib.field_102489_I
		// @144: putfield game.C_100153_be game.C_100327_ib.field_102489_I
		// @147: aload_0
		// @148: aload_1
		// @149: getfield game.C_100153_be game.C_100327_ib.field_102484_L
		// @14C: putfield game.C_100153_be game.C_100327_ib.field_102484_L
		// @14F: aload_0
		// @150: aload_1
		// @151: getfield game.C_100153_be game.C_100327_ib.field_102492_T
		// @154: putfield game.C_100153_be game.C_100327_ib.field_102492_T
		// @157: iload #8
		// @159: ifeq @168
		// @15C: aload_0
		// @15D: aload_1
		// @15E: getfield game.C_100153_be game.C_100327_ib.field_102492_T
		// @161: putfield game.C_100153_be game.C_100327_ib.field_102492_T
		// @164: goto @168
		// @167: athrow
		// @168: aload_0
		// @169: aload_1
		// @16A: getfield int game.C_100327_ib.field_102491_K
		// @16D: putfield int game.C_100327_ib.field_102491_K
		// @170: aload_0
		// @171: aload_1
		// @172: getfield int game.C_100327_ib.field_102477_D
		// @175: putfield int game.C_100327_ib.field_102477_D
		// @178: aload_0
		// @179: aload_1
		// @17A: getfield int game.C_100327_ib.field_102497_w
		// @17D: putfield int game.C_100327_ib.field_102497_w
		// @180: aload_0
		// @181: aload_1
		// @182: getfield int game.C_100327_ib.field_102502_z
		// @185: putfield int game.C_100327_ib.field_102502_z
		// @188: aload_0
		// @189: aload_1
		// @18A: getfield int game.C_100327_ib.field_102496_R
		// @18D: putfield int game.C_100327_ib.field_102496_R
		// @190: aload_0
		// @191: aload_1
		// @192: getfield int game.C_100327_ib.field_102494_P
		// @195: putfield int game.C_100327_ib.field_102494_P
		// @198: aload_0
		// @199: aload_1
		// @19A: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @19D: arraylength
		// @19E: anewarray game.C_100049_vf
		// @1A1: putfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @1A4: iconst_0
		// @1A5: istore #4
		// @1A7: aload_0
		// @1A8: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @1AB: arraylength
		// @1AC: iconst_m1
		// @1AD: ixor
		// @1AE: iload #4
		// @1B0: iconst_m1
		// @1B1: ixor
		// @1B2: if_icmpge @1DC
		// @1B5: aload_0
		// @1B6: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @1B9: iload #4
		// @1BB: new game.C_100049_vf
		// @1BE: dup
		// @1BF: aload_1
		// @1C0: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @1C3: iload #4
		// @1C5: aaload
		// @1C6: iload_3
		// @1C7: invokespecial game.C_100049_vf.<init>(game.C_100049_vf, boolean)void
		// @1CA: aastore
		// @1CB: iinc #4 +1
		// @1CE: iload #8
		// @1D0: ifne @1F4
		// @1D3: iload #8
		// @1D5: ifeq @1A7
		// @1D8: goto @1DC
		// @1DB: athrow
		// @1DC: aload_0
		// @1DD: aload_1
		// @1DE: getfield int game.C_100327_ib.field_102504_x
		// @1E1: putfield int game.C_100327_ib.field_102504_x
		// @1E4: aload_0
		// @1E5: aload_1
		// @1E6: getfield int game.C_100327_ib.field_102485_M
		// @1E9: putfield int game.C_100327_ib.field_102485_M
		// @1EC: aload_0
		// @1ED: aload_1
		// @1EE: getfield int game.C_100327_ib.field_102480_G
		// @1F1: putfield int game.C_100327_ib.field_102480_G
		// @1F4: iload_2
		// @1F5: bipush -19 (0xED)
		// @1F7: if_icmpeq @203
		// @1FA: iconst_2
		// @1FB: invokestatic game.C_100327_ib.func_102470_r(int)boolean
		// @1FE: pop
		// @1FF: goto @203
		// @202: athrow
		// @203: goto @24D
		// @206: astore #4
		// @208: aload #4
		// @20A: new java.lang.StringBuilder
		// @20D: dup
		// @20E: invokespecial java.lang.StringBuilder.<init>()void
		// @211: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @214: bipush 21 (0x15)
		// @216: aaload
		// @217: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @21A: aload_1
		// @21B: ifnull @227
		// @21E: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @221: iconst_4
		// @222: aaload
		// @223: goto @22C
		// @226: athrow
		// @227: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @22A: iconst_5
		// @22B: aaload
		// @22C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @22F: bipush 44 (0x2C)
		// @231: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @234: iload_2
		// @235: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @238: bipush 44 (0x2C)
		// @23A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @23D: iload_3
		// @23E: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @241: bipush 41 (0x29)
		// @243: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @246: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @249: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @24C: athrow
		// @24D: return
	}
	
	final int func_102460_q(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iconst_0
		// @06: istore_2
		// @07: iconst_0
		// @08: istore_3
		// @09: iload_1
		// @0A: sipush -3099 (0xF3E5)
		// @0D: if_icmpeq @1B
		// @10: aconst_null
		// @11: checkcast game.C_100037_wb
		// @14: putstatic game.C_100037_wb game.C_100327_ib.field_102499_u
		// @17: goto @1B
		// @1A: athrow
		// @1B: iload_3
		// @1C: aload_0
		// @1D: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @20: arraylength
		// @21: if_icmpge @5C
		// @24: iload_2
		// @25: aload_0
		// @26: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @29: iload_3
		// @2A: aaload
		// @2B: getfield int game.C_100049_vf.field_104213_v
		// @2E: iadd
		// @2F: iload #4
		// @31: ifne @5D
		// @34: istore_2
		// @35: aconst_null
		// @36: aload_0
		// @37: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @3A: iload_3
		// @3B: aaload
		// @3C: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @3F: if_acmpeq @54
		// @42: iload_2
		// @43: aload_0
		// @44: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @47: iload_3
		// @48: aaload
		// @49: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @4C: sipush -3099 (0xF3E5)
		// @4F: invokevirtual game.C_100327_ib.func_102460_q(int)int
		// @52: iadd
		// @53: istore_2
		// @54: iinc #3 +1
		// @57: iload #4
		// @59: ifeq @1B
		// @5C: iload_2
		// @5D: ireturn
		// @5E: astore_2
		// @5F: aload_2
		// @60: new java.lang.StringBuilder
		// @63: dup
		// @64: invokespecial java.lang.StringBuilder.<init>()void
		// @67: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @6A: iconst_2
		// @6B: aaload
		// @6C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6F: iload_1
		// @70: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @73: bipush 41 (0x29)
		// @75: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @78: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7E: athrow
	}
	
	final boolean func_102461_d(int arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iconst_0
		// @06: istore_3
		// @07: aload_0
		// @08: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0B: arraylength
		// @0C: iload_3
		// @0D: if_icmple @71
		// @10: iconst_m1
		// @11: aload_0
		// @12: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @15: iload_3
		// @16: aaload
		// @17: getfield int game.C_100049_vf.field_104203_a
		// @1A: iload_1
		// @1B: iand
		// @1C: iconst_m1
		// @1D: ixor
		// @1E: iload #4
		// @20: ifne @74
		// @23: if_icmple @41
		// @26: goto @2A
		// @29: athrow
		// @2A: iconst_m1
		// @2B: aload_0
		// @2C: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @2F: iload_3
		// @30: aaload
		// @31: getfield int game.C_100049_vf.field_104203_a
		// @34: if_icmpne @3F
		// @37: goto @3B
		// @3A: athrow
		// @3B: goto @41
		// @3E: athrow
		// @3F: iconst_1
		// @40: ireturn
		// @41: aload_0
		// @42: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @45: iload_3
		// @46: aaload
		// @47: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @4A: ifnull @69
		// @4D: aload_0
		// @4E: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @51: iload_3
		// @52: aaload
		// @53: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @56: iload_1
		// @57: ldc 65536 (0x10000)
		// @59: invokevirtual game.C_100327_ib.func_102461_d(int, int)boolean
		// @5C: ifne @67
		// @5F: goto @63
		// @62: athrow
		// @63: goto @69
		// @66: athrow
		// @67: iconst_1
		// @68: ireturn
		// @69: iinc #3 +1
		// @6C: iload #4
		// @6E: ifeq @07
		// @71: iload_2
		// @72: ldc 65536 (0x10000)
		// @74: if_icmpeq @82
		// @77: aconst_null
		// @78: checkcast java.lang.String
		// @7B: putstatic java.lang.String game.C_100327_ib.field_102487_O
		// @7E: goto @82
		// @81: athrow
		// @82: iconst_0
		// @83: ireturn
		// @84: astore_3
		// @85: aload_3
		// @86: new java.lang.StringBuilder
		// @89: dup
		// @8A: invokespecial java.lang.StringBuilder.<init>()void
		// @8D: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @90: bipush 18 (0x12)
		// @92: aaload
		// @93: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @96: iload_1
		// @97: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9A: bipush 44 (0x2C)
		// @9C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9F: iload_2
		// @A0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A3: bipush 41 (0x29)
		// @A5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A8: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @AB: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AE: athrow
	}
	
	final int func_102458_a(int arg0, int arg1, int[] arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: iload_1
		// @06: iconst_m1
		// @07: if_icmpeq @0D
		// @0A: bipush 74 (0x4A)
		// @0C: ireturn
		// @0D: aload_0
		// @0E: getfield int game.C_100327_ib.field_102494_P
		// @11: iconst_m1
		// @12: ixor
		// @13: ifne @1A
		// @16: goto @24
		// @19: athrow
		// @1A: aload_3
		// @1B: iload_2
		// @1C: iinc #2 +1
		// @1F: aload_0
		// @20: getfield int game.C_100327_ib.field_102494_P
		// @23: iastore
		// @24: iconst_0
		// @25: istore #4
		// @27: aload_0
		// @28: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @2B: arraylength
		// @2C: iconst_m1
		// @2D: ixor
		// @2E: iload #4
		// @30: iconst_m1
		// @31: ixor
		// @32: if_icmpge @80
		// @35: aconst_null
		// @36: aload_0
		// @37: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @3A: iload #4
		// @3C: aaload
		// @3D: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @40: if_acmpne @67
		// @43: iconst_0
		// @44: aload_0
		// @45: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @48: iload #4
		// @4A: aaload
		// @4B: getfield int game.C_100049_vf.field_104203_a
		// @4E: iconst_m1
		// @4F: ixor
		// @50: if_icmpeq @78
		// @53: goto @57
		// @56: athrow
		// @57: aload_3
		// @58: iload_2
		// @59: iinc #2 +1
		// @5C: iconst_m1
		// @5D: iastore
		// @5E: iload #5
		// @60: ifeq @78
		// @63: goto @67
		// @66: athrow
		// @67: aload_0
		// @68: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @6B: iload #4
		// @6D: aaload
		// @6E: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @71: iconst_m1
		// @72: iload_2
		// @73: aload_3
		// @74: invokevirtual game.C_100327_ib.func_102458_a(int, int, int[])int
		// @77: istore_2
		// @78: iinc #4 +1
		// @7B: iload #5
		// @7D: ifeq @27
		// @80: iload_2
		// @81: ireturn
		// @82: astore #4
		// @84: aload #4
		// @86: new java.lang.StringBuilder
		// @89: dup
		// @8A: invokespecial java.lang.StringBuilder.<init>()void
		// @8D: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @90: bipush 25 (0x19)
		// @92: aaload
		// @93: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @96: iload_1
		// @97: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9A: bipush 44 (0x2C)
		// @9C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9F: iload_2
		// @A0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A3: bipush 44 (0x2C)
		// @A5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A8: aload_3
		// @A9: ifnull @B5
		// @AC: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @AF: iconst_4
		// @B0: aaload
		// @B1: goto @BA
		// @B4: athrow
		// @B5: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @B8: iconst_5
		// @B9: aaload
		// @BA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BD: bipush 41 (0x29)
		// @BF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C5: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C8: athrow
	}
	
	final void func_102438_a(int arg0, int arg1, int arg2, int arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: aload_0
		// @006: iload_2
		// @007: putfield int game.C_100327_ib.field_102488_H
		// @00A: aload_0
		// @00B: iload_3
		// @00C: putfield int game.C_100327_ib.field_102500_t
		// @00F: iload_1
		// @010: bipush -30 (0xE2)
		// @012: if_icmplt @016
		// @015: return
		// @016: iconst_0
		// @017: istore #5
		// @019: aload_0
		// @01A: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @01D: arraylength
		// @01E: iconst_m1
		// @01F: ixor
		// @020: iload #5
		// @022: iconst_m1
		// @023: ixor
		// @024: if_icmpge @0E4
		// @027: iload #10
		// @029: ifne @127
		// @02C: aload_0
		// @02D: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @030: iload #5
		// @032: aaload
		// @033: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @036: ifnull @0DC
		// @039: goto @03D
		// @03C: athrow
		// @03D: iconst_3
		// @03E: aload_0
		// @03F: getfield int game.C_100327_ib.field_102485_M
		// @042: ineg
		// @043: sipush 8192 (0x2000)
		// @046: imul
		// @047: ldc 65536 (0x10000)
		// @049: idiv
		// @04A: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @04D: bipush 32 (0x20)
		// @04F: imul
		// @050: ldc 65536 (0x10000)
		// @052: idiv
		// @053: istore #6
		// @055: sipush 8192 (0x2000)
		// @058: aload_0
		// @059: getfield int game.C_100327_ib.field_102485_M
		// @05C: ineg
		// @05D: imul
		// @05E: ldc 65536 (0x10000)
		// @060: idiv
		// @061: iconst_0
		// @062: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @065: bipush 32 (0x20)
		// @067: imul
		// @068: ldc 65536 (0x10000)
		// @06A: idiv
		// @06B: istore #7
		// @06D: iload #6
		// @06F: aload_0
		// @070: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @073: iload #5
		// @075: aaload
		// @076: getfield int game.C_100049_vf.field_104209_k
		// @079: aload_0
		// @07A: getfield int game.C_100327_ib.field_102491_K
		// @07D: ineg
		// @07E: iadd
		// @07F: imul
		// @080: aload_0
		// @081: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @084: iload #5
		// @086: aaload
		// @087: getfield int game.C_100049_vf.field_104218_q
		// @08A: aload_0
		// @08B: getfield int game.C_100327_ib.field_102502_z
		// @08E: ineg
		// @08F: iadd
		// @090: iload #7
		// @092: imul
		// @093: iadd
		// @094: iload #4
		// @096: imul
		// @097: iload_2
		// @098: iadd
		// @099: istore #8
		// @09B: iload #6
		// @09D: aload_0
		// @09E: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0A1: iload #5
		// @0A3: aaload
		// @0A4: getfield int game.C_100049_vf.field_104218_q
		// @0A7: aload_0
		// @0A8: getfield int game.C_100327_ib.field_102502_z
		// @0AB: isub
		// @0AC: imul
		// @0AD: ineg
		// @0AE: iload #7
		// @0B0: aload_0
		// @0B1: getfield int game.C_100327_ib.field_102491_K
		// @0B4: ineg
		// @0B5: aload_0
		// @0B6: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0B9: iload #5
		// @0BB: aaload
		// @0BC: getfield int game.C_100049_vf.field_104209_k
		// @0BF: iadd
		// @0C0: imul
		// @0C1: ineg
		// @0C2: iload_3
		// @0C3: isub
		// @0C4: isub
		// @0C5: istore #9
		// @0C7: aload_0
		// @0C8: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0CB: iload #5
		// @0CD: aaload
		// @0CE: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0D1: bipush -40 (0xD8)
		// @0D3: iload #8
		// @0D5: iload #9
		// @0D7: iload #4
		// @0D9: invokevirtual game.C_100327_ib.func_102438_a(int, int, int, int)void
		// @0DC: iinc #5 +1
		// @0DF: iload #10
		// @0E1: ifeq @019
		// @0E4: goto @127
		// @0E7: astore #5
		// @0E9: aload #5
		// @0EB: new java.lang.StringBuilder
		// @0EE: dup
		// @0EF: invokespecial java.lang.StringBuilder.<init>()void
		// @0F2: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @0F5: bipush 19 (0x13)
		// @0F7: aaload
		// @0F8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0FB: iload_1
		// @0FC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0FF: bipush 44 (0x2C)
		// @101: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @104: iload_2
		// @105: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @108: bipush 44 (0x2C)
		// @10A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10D: iload_3
		// @10E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @111: bipush 44 (0x2C)
		// @113: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @116: iload #4
		// @118: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @11B: bipush 41 (0x29)
		// @11D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @120: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @123: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @126: athrow
		// @127: return
	}
	
	final int[] func_102441_n(int arg0)
	{
		// @00: iload_1
		// @01: iconst_m1
		// @02: if_icmpeq @10
		// @05: aconst_null
		// @06: checkcast game.C_100037_wb
		// @09: putstatic game.C_100037_wb game.C_100327_ib.field_102499_u
		// @0C: goto @10
		// @0F: athrow
		// @10: iconst_0
		// @11: newarray int[]
		// @13: astore_2
		// @14: aload_0
		// @15: aload_2
		// @16: sipush 24931 (0x6163)
		// @19: invokespecial game.C_100327_ib.func_102439_a(int[], int)int[]
		// @1C: areturn
		// @1D: astore_2
		// @1E: aload_2
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @29: bipush 29 (0x1D)
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_1
		// @30: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @33: bipush 41 (0x29)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3E: athrow
	}
	
	final void func_102453_a(int arg0, int arg1)
	{
		// @00: iconst_m1
		// @01: putstatic int game.C_100001_ge.field_100577_r
		// @04: iconst_0
		// @05: putstatic int game.C_100255_pj.field_105252_v
		// @08: iload_1
		// @09: putstatic int game.C_100148_bh.field_101806_z
		// @0C: aload_0
		// @0D: iload_2
		// @0E: bipush -41 (0xD7)
		// @10: invokespecial game.C_100327_ib.func_102475_b(int, byte)void
		// @13: goto @41
		// @16: astore_3
		// @17: aload_3
		// @18: new java.lang.StringBuilder
		// @1B: dup
		// @1C: invokespecial java.lang.StringBuilder.<init>()void
		// @1F: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @22: bipush 43 (0x2B)
		// @24: aaload
		// @25: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @28: iload_1
		// @29: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2C: bipush 44 (0x2C)
		// @2E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @31: iload_2
		// @32: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @35: bipush 41 (0x29)
		// @37: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @40: athrow
		// @41: return
	}
	
	final C_100049_vf func_102443_c(int arg0, byte arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: bipush 17 (0x11)
		// @07: bipush 25 (0x19)
		// @09: iload_2
		// @0A: isub
		// @0B: bipush 32 (0x20)
		// @0D: idiv
		// @0E: irem
		// @0F: istore #4
		// @11: iconst_0
		// @12: istore_3
		// @13: iload_3
		// @14: iconst_m1
		// @15: ixor
		// @16: aload_0
		// @17: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @1A: arraylength
		// @1B: iconst_m1
		// @1C: ixor
		// @1D: if_icmple @8F
		// @20: aconst_null
		// @21: iload #6
		// @23: ifne @90
		// @26: aload_0
		// @27: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @2A: iload_3
		// @2B: aaload
		// @2C: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @2F: if_acmpne @50
		// @32: goto @36
		// @35: athrow
		// @36: sipush 1024 (0x0400)
		// @39: aload_0
		// @3A: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @3D: iload_3
		// @3E: aaload
		// @3F: getfield int game.C_100049_vf.field_104203_a
		// @42: if_icmpne @87
		// @45: goto @49
		// @48: athrow
		// @49: aload_0
		// @4A: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @4D: iload_3
		// @4E: aaload
		// @4F: areturn
		// @50: aload_0
		// @51: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @54: iload_3
		// @55: aaload
		// @56: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @59: getfield int game.C_100327_ib.field_102497_w
		// @5C: sipush 1024 (0x0400)
		// @5F: if_icmpeq @66
		// @62: goto @6D
		// @65: athrow
		// @66: aload_0
		// @67: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @6A: iload_3
		// @6B: aaload
		// @6C: areturn
		// @6D: aload_0
		// @6E: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @71: iload_3
		// @72: aaload
		// @73: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @76: iload_1
		// @77: bipush 91 (0x5B)
		// @79: invokevirtual game.C_100327_ib.func_102443_c(int, byte)game.C_100049_vf
		// @7C: astore #5
		// @7E: aconst_null
		// @7F: aload #5
		// @81: if_acmpeq @87
		// @84: aload #5
		// @86: areturn
		// @87: iinc #3 +1
		// @8A: iload #6
		// @8C: ifeq @13
		// @8F: aconst_null
		// @90: areturn
		// @91: astore_3
		// @92: aload_3
		// @93: new java.lang.StringBuilder
		// @96: dup
		// @97: invokespecial java.lang.StringBuilder.<init>()void
		// @9A: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @9D: bipush 17 (0x11)
		// @9F: aaload
		// @A0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A3: iload_1
		// @A4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A7: bipush 44 (0x2C)
		// @A9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AC: iload_2
		// @AD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B0: bipush 41 (0x29)
		// @B2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @BB: athrow
	}
	
	final int func_102466_i(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iconst_0
		// @06: istore_2
		// @07: iload_1
		// @08: bipush -68 (0xBC)
		// @0A: if_icmple @17
		// @0D: aload_0
		// @0E: bipush -103 (0x99)
		// @10: putfield int game.C_100327_ib.field_102478_E
		// @13: goto @17
		// @16: athrow
		// @17: iconst_0
		// @18: istore_3
		// @19: iload_3
		// @1A: aload_0
		// @1B: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @1E: arraylength
		// @1F: if_icmpge @5D
		// @22: iload_2
		// @23: aload_0
		// @24: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @27: iload_3
		// @28: aaload
		// @29: getfield int game.C_100049_vf.field_104207_m
		// @2C: iadd
		// @2D: iload #4
		// @2F: ifne @5E
		// @32: istore_2
		// @33: aconst_null
		// @34: aload_0
		// @35: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @38: iload_3
		// @39: aaload
		// @3A: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @3D: if_acmpne @44
		// @40: goto @55
		// @43: athrow
		// @44: iload_2
		// @45: aload_0
		// @46: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @49: iload_3
		// @4A: aaload
		// @4B: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @4E: bipush -87 (0xA9)
		// @50: invokevirtual game.C_100327_ib.func_102466_i(int)int
		// @53: iadd
		// @54: istore_2
		// @55: iinc #3 +1
		// @58: iload #4
		// @5A: ifeq @19
		// @5D: iload_2
		// @5E: ireturn
		// @5F: astore_2
		// @60: aload_2
		// @61: new java.lang.StringBuilder
		// @64: dup
		// @65: invokespecial java.lang.StringBuilder.<init>()void
		// @68: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @6B: bipush 39 (0x27)
		// @6D: aaload
		// @6E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @71: iload_1
		// @72: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @75: bipush 41 (0x29)
		// @77: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @80: athrow
	}
	
	final int func_102447_l(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iconst_0
		// @06: istore_2
		// @07: iload_1
		// @08: istore_3
		// @09: aload_0
		// @0A: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0D: arraylength
		// @0E: iload_3
		// @0F: if_icmple @47
		// @12: iload_2
		// @13: aload_0
		// @14: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @17: iload_3
		// @18: aaload
		// @19: getfield int game.C_100049_vf.field_104208_j
		// @1C: iadd
		// @1D: iload #4
		// @1F: ifne @48
		// @22: istore_2
		// @23: aload_0
		// @24: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @27: iload_3
		// @28: aaload
		// @29: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @2C: ifnull @3F
		// @2F: iload_2
		// @30: aload_0
		// @31: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @34: iload_3
		// @35: aaload
		// @36: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @39: iconst_0
		// @3A: invokevirtual game.C_100327_ib.func_102447_l(int)int
		// @3D: iadd
		// @3E: istore_2
		// @3F: iinc #3 +1
		// @42: iload #4
		// @44: ifeq @09
		// @47: iload_2
		// @48: ireturn
		// @49: astore_2
		// @4A: aload_2
		// @4B: new java.lang.StringBuilder
		// @4E: dup
		// @4F: invokespecial java.lang.StringBuilder.<init>()void
		// @52: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @55: bipush 14 (0x0E)
		// @57: aaload
		// @58: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5B: iload_1
		// @5C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5F: bipush 41 (0x29)
		// @61: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @64: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @67: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6A: athrow
	}
	
	final int func_102450_a(boolean arg0, C_100049_vf arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #8
		// @05: aload_0
		// @06: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @09: astore_3
		// @0A: iconst_0
		// @0B: istore #4
		// @0D: iload_1
		// @0E: ifeq @20
		// @11: aload_0
		// @12: bipush -95 (0xA1)
		// @14: aconst_null
		// @15: checkcast game.C_100327_ib[]
		// @18: invokespecial game.C_100327_ib.func_102464_a(int, game.C_100327_ib[])game.C_100327_ib[]
		// @1B: pop
		// @1C: goto @20
		// @1F: athrow
		// @20: iload #4
		// @22: aload_3
		// @23: arraylength
		// @24: if_icmpge @9C
		// @27: aload_3
		// @28: iload #4
		// @2A: aaload
		// @2B: astore #5
		// @2D: aload #5
		// @2F: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @32: astore #6
		// @34: aconst_null
		// @35: aload #6
		// @37: if_acmpne @3E
		// @3A: goto @94
		// @3D: athrow
		// @3E: aload_2
		// @3F: getfield int game.C_100049_vf.field_104218_q
		// @42: iconst_m1
		// @43: ixor
		// @44: aload #5
		// @46: getfield int game.C_100049_vf.field_104218_q
		// @49: iconst_m1
		// @4A: ixor
		// @4B: if_icmpne @7C
		// @4E: aload #5
		// @50: getfield int game.C_100049_vf.field_104209_k
		// @53: aload_2
		// @54: getfield int game.C_100049_vf.field_104209_k
		// @57: if_icmpne @7C
		// @5A: goto @5E
		// @5D: athrow
		// @5E: aload #5
		// @60: getfield int game.C_100049_vf.field_104203_a
		// @63: iconst_m1
		// @64: ixor
		// @65: aload_2
		// @66: getfield int game.C_100049_vf.field_104203_a
		// @69: iconst_m1
		// @6A: ixor
		// @6B: if_icmpeq @76
		// @6E: goto @72
		// @71: athrow
		// @72: goto @7C
		// @75: athrow
		// @76: aload #6
		// @78: getfield int game.C_100327_ib.field_102494_P
		// @7B: ireturn
		// @7C: aload #6
		// @7E: iconst_0
		// @7F: aload_2
		// @80: invokevirtual game.C_100327_ib.func_102450_a(boolean, game.C_100049_vf)int
		// @83: istore #7
		// @85: iconst_m1
		// @86: iload #7
		// @88: iconst_m1
		// @89: ixor
		// @8A: if_icmpge @91
		// @8D: goto @94
		// @90: athrow
		// @91: iload #7
		// @93: ireturn
		// @94: iinc #4 +1
		// @97: iload #8
		// @99: ifeq @20
		// @9C: iconst_m1
		// @9D: ireturn
		// @9E: astore_3
		// @9F: aload_3
		// @A0: new java.lang.StringBuilder
		// @A3: dup
		// @A4: invokespecial java.lang.StringBuilder.<init>()void
		// @A7: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @AA: bipush 22 (0x16)
		// @AC: aaload
		// @AD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B0: iload_1
		// @B1: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @B4: bipush 44 (0x2C)
		// @B6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B9: aload_2
		// @BA: ifnull @C6
		// @BD: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @C0: iconst_4
		// @C1: aaload
		// @C2: goto @CB
		// @C5: athrow
		// @C6: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @C9: iconst_5
		// @CA: aaload
		// @CB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CE: bipush 41 (0x29)
		// @D0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D6: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D9: athrow
	}
	
	final int func_102471_o(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: aload_0
		// @06: getfield int game.C_100327_ib.field_102494_P
		// @09: iconst_m1
		// @0A: ixor
		// @0B: iconst_m1
		// @0C: if_icmpgt @2A
		// @0F: aload_0
		// @10: getfield int game.C_100327_ib.field_102494_P
		// @13: getstatic int[] game.C_100064_ve.field_103015_v
		// @16: arraylength
		// @17: if_icmpge @2A
		// @1A: goto @1E
		// @1D: athrow
		// @1E: getstatic int[] game.C_100064_ve.field_103015_v
		// @21: aload_0
		// @22: getfield int game.C_100327_ib.field_102494_P
		// @25: iaload
		// @26: goto @2B
		// @29: athrow
		// @2A: iconst_0
		// @2B: istore_2
		// @2C: iload_1
		// @2D: iconst_5
		// @2E: if_icmpgt @34
		// @31: bipush 15 (0x0F)
		// @33: ireturn
		// @34: iconst_0
		// @35: istore_3
		// @36: iload_3
		// @37: iconst_m1
		// @38: ixor
		// @39: aload_0
		// @3A: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @3D: arraylength
		// @3E: iconst_m1
		// @3F: ixor
		// @40: if_icmple @68
		// @43: aload_0
		// @44: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @47: iload_3
		// @48: aaload
		// @49: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @4C: ifnull @60
		// @4F: iload_2
		// @50: aload_0
		// @51: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @54: iload_3
		// @55: aaload
		// @56: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @59: bipush 34 (0x22)
		// @5B: invokevirtual game.C_100327_ib.func_102471_o(int)int
		// @5E: iadd
		// @5F: istore_2
		// @60: iinc #3 +1
		// @63: iload #4
		// @65: ifeq @36
		// @68: iload_2
		// @69: ireturn
		// @6A: astore_2
		// @6B: aload_2
		// @6C: new java.lang.StringBuilder
		// @6F: dup
		// @70: invokespecial java.lang.StringBuilder.<init>()void
		// @73: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @76: bipush 35 (0x23)
		// @78: aaload
		// @79: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7C: iload_1
		// @7D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @80: bipush 41 (0x29)
		// @82: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @85: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @88: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8B: athrow
	}
	
	final void func_102437_a(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #14
		// @005: iload #4
		// @007: aload_0
		// @008: getfield int game.C_100327_ib.field_102477_D
		// @00B: ineg
		// @00C: isub
		// @00D: istore #7
		// @00F: iload #6
		// @011: ldc 759988816 (0x2d4c8250)
		// @013: if_icmpeq @025
		// @016: aload_0
		// @017: bipush -16 (0xF0)
		// @019: bipush -122 (0x86)
		// @01B: iconst_0
		// @01C: bipush 84 (0x54)
		// @01E: invokevirtual game.C_100327_ib.func_102473_a(byte, int, int, int)void
		// @021: goto @025
		// @024: athrow
		// @025: iconst_0
		// @026: istore #8
		// @028: aload_0
		// @029: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @02C: arraylength
		// @02D: iconst_m1
		// @02E: ixor
		// @02F: iload #8
		// @031: iconst_m1
		// @032: ixor
		// @033: if_icmpge @16B
		// @036: aload_0
		// @037: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @03A: iload #8
		// @03C: aaload
		// @03D: aload_0
		// @03E: getfield int game.C_100327_ib.field_102496_R
		// @041: ineg
		// @042: aload_0
		// @043: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @046: iload #8
		// @048: aaload
		// @049: getfield int game.C_100049_vf.field_104215_t
		// @04C: ineg
		// @04D: iadd
		// @04E: aload_0
		// @04F: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @052: iload #8
		// @054: aaload
		// @055: getfield int game.C_100049_vf.field_104198_g
		// @058: iload #7
		// @05A: iadd
		// @05B: iload_2
		// @05C: ineg
		// @05D: iadd
		// @05E: iadd
		// @05F: putfield int game.C_100049_vf.field_104199_d
		// @062: aload_0
		// @063: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @066: iload #8
		// @068: aaload
		// @069: aload_0
		// @06A: getfield int game.C_100327_ib.field_102496_R
		// @06D: iload_2
		// @06E: iadd
		// @06F: aload_0
		// @070: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @073: iload #8
		// @075: aaload
		// @076: getfield int game.C_100049_vf.field_104215_t
		// @079: iload #7
		// @07B: iadd
		// @07C: aload_0
		// @07D: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @080: iload #8
		// @082: aaload
		// @083: getfield int game.C_100049_vf.field_104198_g
		// @086: iadd
		// @087: iadd
		// @088: putfield int game.C_100049_vf.field_104197_f
		// @08B: aload_0
		// @08C: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @08F: iload #8
		// @091: aaload
		// @092: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @095: iload #14
		// @097: ifne @16C
		// @09A: ifnull @163
		// @09D: goto @0A1
		// @0A0: athrow
		// @0A1: aload_0
		// @0A2: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0A5: iload #8
		// @0A7: aaload
		// @0A8: getfield boolean game.C_100049_vf.field_104211_i
		// @0AB: ifeq @163
		// @0AE: goto @0B2
		// @0B1: athrow
		// @0B2: iconst_3
		// @0B3: sipush 8192 (0x2000)
		// @0B6: iload #7
		// @0B8: ineg
		// @0B9: imul
		// @0BA: ldc 65536 (0x10000)
		// @0BC: idiv
		// @0BD: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @0C0: bipush 16 (0x10)
		// @0C2: imul
		// @0C3: ldc 65536 (0x10000)
		// @0C5: idiv
		// @0C6: istore #9
		// @0C8: bipush 16 (0x10)
		// @0CA: iload #7
		// @0CC: ineg
		// @0CD: sipush 8192 (0x2000)
		// @0D0: imul
		// @0D1: ldc 65536 (0x10000)
		// @0D3: idiv
		// @0D4: iconst_0
		// @0D5: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @0D8: imul
		// @0D9: ldc 65536 (0x10000)
		// @0DB: idiv
		// @0DC: istore #10
		// @0DE: iload_1
		// @0DF: iload #10
		// @0E1: aload_0
		// @0E2: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0E5: iload #8
		// @0E7: aaload
		// @0E8: getfield int game.C_100049_vf.field_104218_q
		// @0EB: aload_0
		// @0EC: getfield int game.C_100327_ib.field_102502_z
		// @0EF: isub
		// @0F0: imul
		// @0F1: aload_0
		// @0F2: getfield int game.C_100327_ib.field_102491_K
		// @0F5: ineg
		// @0F6: aload_0
		// @0F7: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0FA: iload #8
		// @0FC: aaload
		// @0FD: getfield int game.C_100049_vf.field_104209_k
		// @100: iadd
		// @101: iload #9
		// @103: imul
		// @104: ineg
		// @105: isub
		// @106: getstatic int game.C_100270_mi.field_102270_jc
		// @109: imul
		// @10A: ldc 759988816 (0x2d4c8250)
		// @10C: ishr
		// @10D: iadd
		// @10E: istore #11
		// @110: iload #5
		// @112: aload_0
		// @113: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @116: iload #8
		// @118: aaload
		// @119: getfield int game.C_100049_vf.field_104218_q
		// @11C: aload_0
		// @11D: getfield int game.C_100327_ib.field_102502_z
		// @120: ineg
		// @121: iadd
		// @122: iload #9
		// @124: imul
		// @125: ineg
		// @126: aload_0
		// @127: getfield int game.C_100327_ib.field_102491_K
		// @12A: ineg
		// @12B: aload_0
		// @12C: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @12F: iload #8
		// @131: aaload
		// @132: getfield int game.C_100049_vf.field_104209_k
		// @135: iadd
		// @136: iload #10
		// @138: imul
		// @139: iadd
		// @13A: getstatic int game.C_100270_mi.field_102270_jc
		// @13D: imul
		// @13E: ldc -99282480 (0xfa1511d0)
		// @140: ishr
		// @141: ineg
		// @142: isub
		// @143: istore #12
		// @145: iload #7
		// @147: aload_0
		// @148: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @14B: iload #8
		// @14D: aaload
		// @14E: getfield int game.C_100049_vf.field_104198_g
		// @151: iadd
		// @152: istore #13
		// @154: aload_0
		// @155: iload #8
		// @157: iconst_1
		// @158: iload_2
		// @159: iload_3
		// @15A: iload #12
		// @15C: iload #11
		// @15E: iload #13
		// @160: invokespecial game.C_100327_ib.func_102469_a(int, boolean, int, boolean, int, int, int)void
		// @163: iinc #8 +1
		// @166: iload #14
		// @168: ifeq @028
		// @16B: aload_0
		// @16C: getfield game.C_100153_be game.C_100327_ib.field_102492_T
		// @16F: ifnonnull @176
		// @172: goto @19A
		// @175: athrow
		// @176: aload_0
		// @177: getfield game.C_100153_be game.C_100327_ib.field_102492_T
		// @17A: aload_0
		// @17B: getfield int game.C_100327_ib.field_102502_z
		// @17E: ldc -744219420 (0xd3a41ce4)
		// @180: ishl
		// @181: aload_0
		// @182: getfield int game.C_100327_ib.field_102491_K
		// @185: ldc 1894917188 (0x70f22444)
		// @187: ishl
		// @188: iload_1
		// @189: ldc -1890976476 (0x8f49fd24)
		// @18B: ishl
		// @18C: iload #5
		// @18E: ldc 957032004 (0x390b2644)
		// @190: ishl
		// @191: iload #7
		// @193: ineg
		// @194: getstatic int game.C_100270_mi.field_102270_jc
		// @197: invokevirtual game.C_100153_be.func_105316_a(int, int, int, int, int, int)void
		// @19A: iload_3
		// @19B: ifne @1A2
		// @19E: goto @1BE
		// @1A1: athrow
		// @1A2: aload_0
		// @1A3: iload_2
		// @1A4: ineg
		// @1A5: iload #7
		// @1A7: aload_0
		// @1A8: getfield int game.C_100327_ib.field_102496_R
		// @1AB: ineg
		// @1AC: iadd
		// @1AD: iadd
		// @1AE: putfield int game.C_100327_ib.field_102480_G
		// @1B1: aload_0
		// @1B2: aload_0
		// @1B3: getfield int game.C_100327_ib.field_102496_R
		// @1B6: iload #7
		// @1B8: iadd
		// @1B9: iload_2
		// @1BA: iadd
		// @1BB: putfield int game.C_100327_ib.field_102504_x
		// @1BE: bipush 8 (0x08)
		// @1C0: getstatic int game.C_100270_mi.field_102270_jc
		// @1C3: imul
		// @1C4: sipush 4096 (0x1000)
		// @1C7: idiv
		// @1C8: istore #8
		// @1CA: iload #8
		// @1CC: ineg
		// @1CD: iload_1
		// @1CE: iadd
		// @1CF: iconst_m1
		// @1D0: ixor
		// @1D1: getstatic int game.C_100032_gk.field_103141_Z
		// @1D4: iconst_m1
		// @1D5: ixor
		// @1D6: if_icmpgt @1DD
		// @1D9: goto @1E5
		// @1DC: athrow
		// @1DD: iload_1
		// @1DE: iload #8
		// @1E0: ineg
		// @1E1: iadd
		// @1E2: putstatic int game.C_100032_gk.field_103141_Z
		// @1E5: getstatic int game.C_100321_hi.field_107219_b
		// @1E8: iconst_m1
		// @1E9: ixor
		// @1EA: iload #8
		// @1EC: iload_1
		// @1ED: iadd
		// @1EE: iconst_m1
		// @1EF: ixor
		// @1F0: if_icmpgt @1F7
		// @1F3: goto @1FE
		// @1F6: athrow
		// @1F7: iload_1
		// @1F8: iload #8
		// @1FA: iadd
		// @1FB: putstatic int game.C_100321_hi.field_107219_b
		// @1FE: getstatic int game.C_100137_bn.field_105036_c
		// @201: iconst_m1
		// @202: ixor
		// @203: iload #5
		// @205: iload #8
		// @207: isub
		// @208: iconst_m1
		// @209: ixor
		// @20A: if_icmpge @21A
		// @20D: iload #8
		// @20F: ineg
		// @210: iload #5
		// @212: iadd
		// @213: putstatic int game.C_100137_bn.field_105036_c
		// @216: goto @21A
		// @219: athrow
		// @21A: getstatic int game.C_100158_da.field_100592_d
		// @21D: iload #8
		// @21F: iload #5
		// @221: iadd
		// @222: if_icmplt @229
		// @225: goto @231
		// @228: athrow
		// @229: iload #8
		// @22B: iload #5
		// @22D: iadd
		// @22E: putstatic int game.C_100158_da.field_100592_d
		// @231: iconst_0
		// @232: istore #9
		// @234: iload #9
		// @236: iconst_m1
		// @237: ixor
		// @238: aload_0
		// @239: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @23C: arraylength
		// @23D: iconst_m1
		// @23E: ixor
		// @23F: if_icmple @4A3
		// @242: iload #14
		// @244: ifne @4FA
		// @247: iconst_0
		// @248: aload_0
		// @249: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @24C: iload #9
		// @24E: aaload
		// @24F: getfield int game.C_100049_vf.field_104203_a
		// @252: iconst_m1
		// @253: ixor
		// @254: if_icmpne @270
		// @257: goto @25B
		// @25A: athrow
		// @25B: aload_0
		// @25C: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @25F: iload #9
		// @261: aaload
		// @262: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @265: ifnonnull @270
		// @268: goto @26C
		// @26B: athrow
		// @26C: goto @49B
		// @26F: athrow
		// @270: iconst_3
		// @271: sipush 8192 (0x2000)
		// @274: iload #7
		// @276: ineg
		// @277: imul
		// @278: ldc 65536 (0x10000)
		// @27A: idiv
		// @27B: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @27E: bipush 16 (0x10)
		// @280: imul
		// @281: ldc 65536 (0x10000)
		// @283: idiv
		// @284: istore #10
		// @286: iload #7
		// @288: ineg
		// @289: sipush 8192 (0x2000)
		// @28C: imul
		// @28D: ldc 65536 (0x10000)
		// @28F: idiv
		// @290: iconst_0
		// @291: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @294: bipush 16 (0x10)
		// @296: imul
		// @297: ldc 65536 (0x10000)
		// @299: idiv
		// @29A: istore #11
		// @29C: aload_0
		// @29D: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @2A0: iload #9
		// @2A2: aaload
		// @2A3: iload_1
		// @2A4: getstatic int game.C_100270_mi.field_102270_jc
		// @2A7: iload #10
		// @2A9: aload_0
		// @2AA: getfield int game.C_100327_ib.field_102491_K
		// @2AD: ineg
		// @2AE: aload_0
		// @2AF: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @2B2: iload #9
		// @2B4: aaload
		// @2B5: getfield int game.C_100049_vf.field_104209_k
		// @2B8: iadd
		// @2B9: imul
		// @2BA: iload #11
		// @2BC: aload_0
		// @2BD: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @2C0: iload #9
		// @2C2: aaload
		// @2C3: getfield int game.C_100049_vf.field_104218_q
		// @2C6: aload_0
		// @2C7: getfield int game.C_100327_ib.field_102502_z
		// @2CA: ineg
		// @2CB: iadd
		// @2CC: imul
		// @2CD: iadd
		// @2CE: imul
		// @2CF: ldc -619029264 (0xdb1a5cf0)
		// @2D1: ishr
		// @2D2: iadd
		// @2D3: putfield int game.C_100049_vf.field_104202_c
		// @2D6: aload_0
		// @2D7: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @2DA: iload #9
		// @2DC: aaload
		// @2DD: getstatic int game.C_100270_mi.field_102270_jc
		// @2E0: iload #11
		// @2E2: aload_0
		// @2E3: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @2E6: iload #9
		// @2E8: aaload
		// @2E9: getfield int game.C_100049_vf.field_104209_k
		// @2EC: aload_0
		// @2ED: getfield int game.C_100327_ib.field_102491_K
		// @2F0: ineg
		// @2F1: iadd
		// @2F2: imul
		// @2F3: aload_0
		// @2F4: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @2F7: iload #9
		// @2F9: aaload
		// @2FA: getfield int game.C_100049_vf.field_104218_q
		// @2FD: aload_0
		// @2FE: getfield int game.C_100327_ib.field_102502_z
		// @301: ineg
		// @302: iadd
		// @303: iload #10
		// @305: imul
		// @306: isub
		// @307: imul
		// @308: ldc -356446512 (0xeac10ed0)
		// @30A: ishr
		// @30B: iload #5
		// @30D: iadd
		// @30E: putfield int game.C_100049_vf.field_104216_s
		// @311: aload_0
		// @312: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @315: iload #9
		// @317: aaload
		// @318: iload #7
		// @31A: aload_0
		// @31B: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @31E: iload #9
		// @320: aaload
		// @321: getfield int game.C_100049_vf.field_104198_g
		// @324: ineg
		// @325: isub
		// @326: putfield int game.C_100049_vf.field_104219_p
		// @329: aconst_null
		// @32A: aload_0
		// @32B: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @32E: iload #9
		// @330: aaload
		// @331: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @334: if_acmpeq @348
		// @337: aload_0
		// @338: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @33B: iload #9
		// @33D: aaload
		// @33E: getfield boolean game.C_100049_vf.field_104211_i
		// @341: ifeq @470
		// @344: goto @348
		// @347: athrow
		// @348: aload_0
		// @349: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @34C: iload #9
		// @34E: aaload
		// @34F: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @352: ifnonnull @49B
		// @355: goto @359
		// @358: athrow
		// @359: iconst_0
		// @35A: aload_0
		// @35B: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @35E: iload #9
		// @360: aaload
		// @361: getfield int game.C_100049_vf.field_104203_a
		// @364: iconst_m1
		// @365: ixor
		// @366: if_icmpeq @49B
		// @369: goto @36D
		// @36C: athrow
		// @36D: iload_3
		// @36E: ifeq @49B
		// @371: goto @375
		// @374: athrow
		// @375: sipush 1024 (0x0400)
		// @378: aload_0
		// @379: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @37C: iload #9
		// @37E: aaload
		// @37F: getfield int game.C_100049_vf.field_104203_a
		// @382: if_icmpeq @49B
		// @385: goto @389
		// @388: athrow
		// @389: aload_0
		// @38A: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @38D: iload #9
		// @38F: aaload
		// @390: getfield int game.C_100049_vf.field_104202_c
		// @393: iload #8
		// @395: ineg
		// @396: iadd
		// @397: getstatic int game.C_100032_gk.field_103141_Z
		// @39A: if_icmpge @3B6
		// @39D: goto @3A1
		// @3A0: athrow
		// @3A1: aload_0
		// @3A2: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @3A5: iload #9
		// @3A7: aaload
		// @3A8: getfield int game.C_100049_vf.field_104202_c
		// @3AB: iload #8
		// @3AD: ineg
		// @3AE: iadd
		// @3AF: putstatic int game.C_100032_gk.field_103141_Z
		// @3B2: goto @3B6
		// @3B5: athrow
		// @3B6: getstatic int game.C_100321_hi.field_107219_b
		// @3B9: iload #8
		// @3BB: aload_0
		// @3BC: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @3BF: iload #9
		// @3C1: aaload
		// @3C2: getfield int game.C_100049_vf.field_104202_c
		// @3C5: iadd
		// @3C6: if_icmplt @3CD
		// @3C9: goto @3DD
		// @3CC: athrow
		// @3CD: iload #8
		// @3CF: aload_0
		// @3D0: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @3D3: iload #9
		// @3D5: aaload
		// @3D6: getfield int game.C_100049_vf.field_104202_c
		// @3D9: iadd
		// @3DA: putstatic int game.C_100321_hi.field_107219_b
		// @3DD: iload #8
		// @3DF: ineg
		// @3E0: aload_0
		// @3E1: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @3E4: iload #9
		// @3E6: aaload
		// @3E7: getfield int game.C_100049_vf.field_104216_s
		// @3EA: iadd
		// @3EB: getstatic int game.C_100137_bn.field_105036_c
		// @3EE: if_icmpge @405
		// @3F1: aload_0
		// @3F2: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @3F5: iload #9
		// @3F7: aaload
		// @3F8: getfield int game.C_100049_vf.field_104216_s
		// @3FB: iload #8
		// @3FD: isub
		// @3FE: putstatic int game.C_100137_bn.field_105036_c
		// @401: goto @405
		// @404: athrow
		// @405: getstatic int game.C_100158_da.field_100592_d
		// @408: iconst_m1
		// @409: ixor
		// @40A: aload_0
		// @40B: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @40E: iload #9
		// @410: aaload
		// @411: getfield int game.C_100049_vf.field_104216_s
		// @414: iload #8
		// @416: ineg
		// @417: isub
		// @418: iconst_m1
		// @419: ixor
		// @41A: if_icmple @431
		// @41D: iload #8
		// @41F: aload_0
		// @420: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @423: iload #9
		// @425: aaload
		// @426: getfield int game.C_100049_vf.field_104216_s
		// @429: iadd
		// @42A: putstatic int game.C_100158_da.field_100592_d
		// @42D: goto @431
		// @430: athrow
		// @431: iconst_3
		// @432: aload_0
		// @433: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @436: iload #9
		// @438: aaload
		// @439: getfield int game.C_100049_vf.field_104219_p
		// @43C: sipush 8192 (0x2000)
		// @43F: imul
		// @440: ldc 65536 (0x10000)
		// @442: idiv
		// @443: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @446: bipush 16 (0x10)
		// @448: imul
		// @449: ldc 65536 (0x10000)
		// @44B: idiv
		// @44C: istore #10
		// @44E: sipush 8192 (0x2000)
		// @451: aload_0
		// @452: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @455: iload #9
		// @457: aaload
		// @458: getfield int game.C_100049_vf.field_104219_p
		// @45B: imul
		// @45C: ldc 65536 (0x10000)
		// @45E: idiv
		// @45F: iconst_0
		// @460: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @463: bipush 16 (0x10)
		// @465: imul
		// @466: ldc 65536 (0x10000)
		// @468: idiv
		// @469: istore #11
		// @46B: iload #14
		// @46D: ifeq @49B
		// @470: aload_0
		// @471: iload #9
		// @473: iconst_1
		// @474: iload_2
		// @475: iload_3
		// @476: aload_0
		// @477: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @47A: iload #9
		// @47C: aaload
		// @47D: getfield int game.C_100049_vf.field_104216_s
		// @480: aload_0
		// @481: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @484: iload #9
		// @486: aaload
		// @487: getfield int game.C_100049_vf.field_104202_c
		// @48A: aload_0
		// @48B: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @48E: iload #9
		// @490: aaload
		// @491: getfield int game.C_100049_vf.field_104219_p
		// @494: invokespecial game.C_100327_ib.func_102469_a(int, boolean, int, boolean, int, int, int)void
		// @497: goto @49B
		// @49A: athrow
		// @49B: iinc #9 +1
		// @49E: iload #14
		// @4A0: ifeq @234
		// @4A3: goto @4FA
		// @4A6: astore #7
		// @4A8: aload #7
		// @4AA: new java.lang.StringBuilder
		// @4AD: dup
		// @4AE: invokespecial java.lang.StringBuilder.<init>()void
		// @4B1: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @4B4: bipush 20 (0x14)
		// @4B6: aaload
		// @4B7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4BA: iload_1
		// @4BB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4BE: bipush 44 (0x2C)
		// @4C0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C3: iload_2
		// @4C4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4C7: bipush 44 (0x2C)
		// @4C9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4CC: iload_3
		// @4CD: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @4D0: bipush 44 (0x2C)
		// @4D2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D5: iload #4
		// @4D7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4DA: bipush 44 (0x2C)
		// @4DC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4DF: iload #5
		// @4E1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4E4: bipush 44 (0x2C)
		// @4E6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E9: iload #6
		// @4EB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4EE: bipush 41 (0x29)
		// @4F0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4F6: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4F9: athrow
		// @4FA: return
	}
	
	private final void func_102475_b(int arg0, byte arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iload_1
		// @06: iconst_m1
		// @07: ixor
		// @08: aload_0
		// @09: getfield int game.C_100327_ib.field_102494_P
		// @0C: iload_2
		// @0D: sipush 8403 (0x20D3)
		// @10: ixor
		// @11: invokestatic game.C_100021_wn.func_103867_a(int, int)int
		// @14: iconst_m1
		// @15: ixor
		// @16: if_icmpeq @1D
		// @19: goto @67
		// @1C: athrow
		// @1D: iconst_m1
		// @1E: aload_0
		// @1F: getfield int game.C_100327_ib.field_102478_E
		// @22: iconst_m1
		// @23: ixor
		// @24: if_icmpgt @38
		// @27: getstatic int game.C_100148_bh.field_101806_z
		// @2A: iconst_1
		// @2B: iadd
		// @2C: putstatic int game.C_100148_bh.field_101806_z
		// @2F: iload #4
		// @31: ifeq @5D
		// @34: goto @38
		// @37: athrow
		// @38: getstatic int game.C_100001_ge.field_100577_r
		// @3B: iconst_m1
		// @3C: ixor
		// @3D: ifeq @52
		// @40: goto @44
		// @43: athrow
		// @44: getstatic int game.C_100001_ge.field_100577_r
		// @47: aload_0
		// @48: getfield int game.C_100327_ib.field_102478_E
		// @4B: if_icmple @5D
		// @4E: goto @52
		// @51: athrow
		// @52: aload_0
		// @53: getfield int game.C_100327_ib.field_102478_E
		// @56: putstatic int game.C_100001_ge.field_100577_r
		// @59: goto @5D
		// @5C: athrow
		// @5D: aload_0
		// @5E: getfield int game.C_100327_ib.field_102494_P
		// @61: bipush 17 (0x11)
		// @63: isub
		// @64: putstatic int game.C_100255_pj.field_105252_v
		// @67: iload_2
		// @68: bipush -41 (0xD7)
		// @6A: if_icmpeq @6E
		// @6D: return
		// @6E: iconst_0
		// @6F: istore_3
		// @70: iload_3
		// @71: aload_0
		// @72: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @75: arraylength
		// @76: if_icmpge @A9
		// @79: iload #4
		// @7B: ifne @D7
		// @7E: aload_0
		// @7F: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @82: iload_3
		// @83: aaload
		// @84: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @87: ifnull @A1
		// @8A: goto @8E
		// @8D: athrow
		// @8E: aload_0
		// @8F: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @92: iload_3
		// @93: aaload
		// @94: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @97: iload_1
		// @98: bipush -41 (0xD7)
		// @9A: invokespecial game.C_100327_ib.func_102475_b(int, byte)void
		// @9D: goto @A1
		// @A0: athrow
		// @A1: iinc #3 +1
		// @A4: iload #4
		// @A6: ifeq @70
		// @A9: goto @D7
		// @AC: astore_3
		// @AD: aload_3
		// @AE: new java.lang.StringBuilder
		// @B1: dup
		// @B2: invokespecial java.lang.StringBuilder.<init>()void
		// @B5: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @B8: bipush 12 (0x0C)
		// @BA: aaload
		// @BB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BE: iload_1
		// @BF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C2: bipush 44 (0x2C)
		// @C4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C7: iload_2
		// @C8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CB: bipush 41 (0x29)
		// @CD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D6: athrow
		// @D7: return
	}
	
	final void func_102446_b(int arg0, int arg1, int[] arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: aload_0
		// @06: getfield int game.C_100327_ib.field_102494_P
		// @09: sipush -8444 (0xDF04)
		// @0C: invokestatic game.C_100021_wn.func_103867_a(int, int)int
		// @0F: iconst_m1
		// @10: ixor
		// @11: iload_2
		// @12: iconst_m1
		// @13: ixor
		// @14: if_icmpne @6A
		// @17: iconst_0
		// @18: aload_0
		// @19: getfield int game.C_100327_ib.field_102478_E
		// @1C: if_icmplt @6A
		// @1F: goto @23
		// @22: athrow
		// @23: aload_0
		// @24: getfield int game.C_100327_ib.field_102480_G
		// @27: istore #4
		// @29: iload #4
		// @2B: aload_0
		// @2C: getfield int game.C_100327_ib.field_102504_x
		// @2F: if_icmpge @6A
		// @32: iload #4
		// @34: iconst_m1
		// @35: ixor
		// @36: iconst_m1
		// @37: iload #6
		// @39: ifne @74
		// @3C: if_icmpge @5F
		// @3F: goto @43
		// @42: athrow
		// @43: ldc -32769 (0xffff7fff)
		// @45: iload #4
		// @47: iconst_m1
		// @48: ixor
		// @49: if_icmpge @5F
		// @4C: goto @50
		// @4F: athrow
		// @50: aload_3
		// @51: iload #4
		// @53: ldc 12138824 (0xb93948)
		// @55: ishr
		// @56: dup2
		// @57: iaload
		// @58: iconst_1
		// @59: iadd
		// @5A: iastore
		// @5B: goto @5F
		// @5E: athrow
		// @5F: wide (iinc) #4 +256
		// @65: iload #6
		// @67: ifeq @29
		// @6A: iconst_0
		// @6B: istore #4
		// @6D: iload #4
		// @6F: aload_0
		// @70: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @73: arraylength
		// @74: if_icmpge @A5
		// @77: aload_0
		// @78: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @7B: iload #4
		// @7D: aaload
		// @7E: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @81: ifnonnull @8C
		// @84: goto @88
		// @87: athrow
		// @88: goto @9D
		// @8B: athrow
		// @8C: aload_0
		// @8D: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @90: iload #4
		// @92: aaload
		// @93: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @96: bipush -11 (0xF5)
		// @98: iload_2
		// @99: aload_3
		// @9A: invokevirtual game.C_100327_ib.func_102446_b(int, int, int[])void
		// @9D: iinc #4 +1
		// @A0: iload #6
		// @A2: ifeq @6D
		// @A5: bipush -42 (0xD6)
		// @A7: bipush -45 (0xD3)
		// @A9: iload_1
		// @AA: isub
		// @AB: bipush 33 (0x21)
		// @AD: idiv
		// @AE: idiv
		// @AF: istore #5
		// @B1: goto @FB
		// @B4: astore #4
		// @B6: aload #4
		// @B8: new java.lang.StringBuilder
		// @BB: dup
		// @BC: invokespecial java.lang.StringBuilder.<init>()void
		// @BF: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @C2: bipush 23 (0x17)
		// @C4: aaload
		// @C5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C8: iload_1
		// @C9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CC: bipush 44 (0x2C)
		// @CE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D1: iload_2
		// @D2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D5: bipush 44 (0x2C)
		// @D7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DA: aload_3
		// @DB: ifnull @E7
		// @DE: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @E1: iconst_4
		// @E2: aaload
		// @E3: goto @EC
		// @E6: athrow
		// @E7: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @EA: iconst_5
		// @EB: aaload
		// @EC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @EF: bipush 41 (0x29)
		// @F1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @F4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @F7: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @FA: athrow
		// @FB: return
	}
	
	C_100327_ib(C_100327_ib arg0)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100325_id.<init>()void
		// @04: aload_0
		// @05: aload_1
		// @06: bipush -19 (0xED)
		// @08: iconst_1
		// @09: invokespecial game.C_100327_ib.func_102454_a(game.C_100327_ib, byte, boolean)void
		// @0C: goto @42
		// @0F: astore_2
		// @10: aload_2
		// @11: new java.lang.StringBuilder
		// @14: dup
		// @15: invokespecial java.lang.StringBuilder.<init>()void
		// @18: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @1B: bipush 10 (0x0A)
		// @1D: aaload
		// @1E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @21: aload_1
		// @22: ifnull @2E
		// @25: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @28: iconst_4
		// @29: aaload
		// @2A: goto @33
		// @2D: athrow
		// @2E: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @31: iconst_5
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: bipush 41 (0x29)
		// @38: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @41: athrow
		// @42: return
	}
	
	final int func_102445_j(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iconst_0
		// @06: istore_2
		// @07: iconst_0
		// @08: istore_3
		// @09: iload_3
		// @0A: iconst_m1
		// @0B: ixor
		// @0C: aload_0
		// @0D: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @10: arraylength
		// @11: iconst_m1
		// @12: ixor
		// @13: if_icmple @53
		// @16: iload_2
		// @17: aload_0
		// @18: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @1B: iload_3
		// @1C: aaload
		// @1D: getfield int game.C_100049_vf.field_104200_e
		// @20: iadd
		// @21: istore_2
		// @22: aload_0
		// @23: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @26: iload_3
		// @27: aaload
		// @28: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @2B: iload #4
		// @2D: ifne @5E
		// @30: ifnonnull @3A
		// @33: goto @37
		// @36: athrow
		// @37: goto @4B
		// @3A: iload_2
		// @3B: aload_0
		// @3C: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @3F: iload_3
		// @40: aaload
		// @41: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @44: bipush 30 (0x1E)
		// @46: invokevirtual game.C_100327_ib.func_102445_j(int)int
		// @49: iadd
		// @4A: istore_2
		// @4B: iinc #3 +1
		// @4E: iload #4
		// @50: ifeq @09
		// @53: iload_1
		// @54: bipush 9 (0x09)
		// @56: if_icmpge @6C
		// @59: aload_0
		// @5A: goto @5E
		// @5D: athrow
		// @5E: bipush 64 (0x40)
		// @60: iconst_1
		// @61: bipush 103 (0x67)
		// @63: iconst_0
		// @64: bipush 95 (0x5F)
		// @66: iconst_2
		// @67: bipush 86 (0x56)
		// @69: invokespecial game.C_100327_ib.func_102469_a(int, boolean, int, boolean, int, int, int)void
		// @6C: iload_2
		// @6D: ireturn
		// @6E: astore_2
		// @6F: aload_2
		// @70: new java.lang.StringBuilder
		// @73: dup
		// @74: invokespecial java.lang.StringBuilder.<init>()void
		// @77: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @7A: bipush 13 (0x0D)
		// @7C: aaload
		// @7D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @80: iload_1
		// @81: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @84: bipush 41 (0x29)
		// @86: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @89: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8F: athrow
	}
	
	final C_100049_vf func_102452_b(int arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #7
		// @05: aload_0
		// @06: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @09: astore_3
		// @0A: iload_2
		// @0B: sipush -12523 (0xCF15)
		// @0E: if_icmpeq @16
		// @11: aconst_null
		// @12: checkcast game.C_100049_vf
		// @15: areturn
		// @16: iconst_0
		// @17: istore #4
		// @19: aload_3
		// @1A: arraylength
		// @1B: iconst_m1
		// @1C: ixor
		// @1D: iload #4
		// @1F: iconst_m1
		// @20: ixor
		// @21: if_icmpge @80
		// @24: aload_3
		// @25: iload #4
		// @27: aaload
		// @28: astore #5
		// @2A: aload #5
		// @2C: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @2F: ifnull @5B
		// @32: iload_1
		// @33: aload #5
		// @35: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @38: getfield int game.C_100327_ib.field_102497_w
		// @3B: if_icmpne @45
		// @3E: goto @42
		// @41: athrow
		// @42: aload #5
		// @44: areturn
		// @45: aload #5
		// @47: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @4A: iload_1
		// @4B: sipush -12523 (0xCF15)
		// @4E: invokevirtual game.C_100327_ib.func_102452_b(int, int)game.C_100049_vf
		// @51: astore #6
		// @53: aload #6
		// @55: ifnull @5B
		// @58: aload #6
		// @5A: areturn
		// @5B: aload #5
		// @5D: getfield int game.C_100049_vf.field_104203_a
		// @60: iconst_m1
		// @61: if_icmpeq @78
		// @64: aload #5
		// @66: getfield int game.C_100049_vf.field_104203_a
		// @69: iload_1
		// @6A: iand
		// @6B: iconst_m1
		// @6C: ixor
		// @6D: iconst_m1
		// @6E: if_icmpeq @78
		// @71: goto @75
		// @74: athrow
		// @75: aload #5
		// @77: areturn
		// @78: iinc #4 +1
		// @7B: iload #7
		// @7D: ifeq @19
		// @80: aconst_null
		// @81: areturn
		// @82: astore_3
		// @83: aload_3
		// @84: new java.lang.StringBuilder
		// @87: dup
		// @88: invokespecial java.lang.StringBuilder.<init>()void
		// @8B: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @8E: iconst_0
		// @8F: aaload
		// @90: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @93: iload_1
		// @94: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @97: bipush 44 (0x2C)
		// @99: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9C: iload_2
		// @9D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A0: bipush 41 (0x29)
		// @A2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AB: athrow
	}
	
	final int func_102442_a(int[] arg0, int arg1, boolean arg2, int arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: iconst_0
		// @006: istore #5
		// @008: aload_0
		// @009: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @00C: arraylength
		// @00D: iload #5
		// @00F: if_icmple @129
		// @012: iload #8
		// @014: ifne @13B
		// @017: aconst_null
		// @018: aload_0
		// @019: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @01C: iload #5
		// @01E: aaload
		// @01F: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @022: if_acmpeq @043
		// @025: goto @029
		// @028: athrow
		// @029: aload_0
		// @02A: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @02D: iload #5
		// @02F: aaload
		// @030: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @033: aload_1
		// @034: bipush 16 (0x10)
		// @036: iload_3
		// @037: iload #4
		// @039: invokevirtual game.C_100327_ib.func_102442_a(int[], int, boolean, int)int
		// @03C: istore #4
		// @03E: iload #8
		// @040: ifeq @121
		// @043: aload_0
		// @044: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @047: iload #5
		// @049: aaload
		// @04A: getfield int game.C_100049_vf.field_104203_a
		// @04D: iconst_m1
		// @04E: if_icmpeq @121
		// @051: goto @055
		// @054: athrow
		// @055: aload_1
		// @056: iload #4
		// @058: iinc #4 +1
		// @05B: iaload
		// @05C: istore #6
		// @05E: iload #6
		// @060: iconst_m1
		// @061: if_icmpeq @121
		// @064: iload #6
		// @066: bipush -22 (0xEA)
		// @068: invokestatic game.C_100209_qb.func_102686_b(int, byte)game.C_100327_ib
		// @06B: astore #7
		// @06D: aload #7
		// @06F: ifnull @076
		// @072: goto @0A0
		// @075: athrow
		// @076: sipush -30945 (0x871F)
		// @079: iconst_2
		// @07A: anewarray java.lang.String
		// @07D: dup
		// @07E: iconst_0
		// @07F: iload #6
		// @081: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @084: aastore
		// @085: dup
		// @086: iconst_1
		// @087: iconst_m1
		// @088: iload #4
		// @08A: iadd
		// @08B: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @08E: aastore
		// @08F: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @092: bipush 36 (0x24)
		// @094: aaload
		// @095: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @098: bipush 6 (0x06)
		// @09A: invokestatic game.C_100140_bj.func_102961_a(java.lang.String, int)void
		// @09D: iload #4
		// @09F: ireturn
		// @0A0: iconst_0
		// @0A1: aload #7
		// @0A3: getfield int game.C_100327_ib.field_102497_w
		// @0A6: aload_0
		// @0A7: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0AA: iload #5
		// @0AC: aaload
		// @0AD: getfield int game.C_100049_vf.field_104203_a
		// @0B0: iand
		// @0B1: if_icmpeq @0B8
		// @0B4: goto @0F7
		// @0B7: athrow
		// @0B8: iload_2
		// @0B9: sipush -30961 (0x870F)
		// @0BC: ixor
		// @0BD: iconst_3
		// @0BE: anewarray java.lang.String
		// @0C1: dup
		// @0C2: iconst_0
		// @0C3: iload #6
		// @0C5: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @0C8: aastore
		// @0C9: dup
		// @0CA: iconst_1
		// @0CB: aload #7
		// @0CD: getfield int game.C_100327_ib.field_102497_w
		// @0D0: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @0D3: aastore
		// @0D4: dup
		// @0D5: iconst_2
		// @0D6: aload_0
		// @0D7: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0DA: iload #5
		// @0DC: aaload
		// @0DD: getfield int game.C_100049_vf.field_104203_a
		// @0E0: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @0E3: aastore
		// @0E4: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @0E7: bipush 37 (0x25)
		// @0E9: aaload
		// @0EA: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0ED: iload_2
		// @0EE: bipush -10 (0xF6)
		// @0F0: iadd
		// @0F1: invokestatic game.C_100140_bj.func_102961_a(java.lang.String, int)void
		// @0F4: iload #4
		// @0F6: ireturn
		// @0F7: aload_0
		// @0F8: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @0FB: iload #5
		// @0FD: aaload
		// @0FE: new game.C_100327_ib
		// @101: dup
		// @102: aload #7
		// @104: iload_3
		// @105: invokespecial game.C_100327_ib.<init>(game.C_100327_ib, boolean)void
		// @108: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @10B: aload_0
		// @10C: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @10F: iload #5
		// @111: aaload
		// @112: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @115: aload_1
		// @116: iload_2
		// @117: iconst_0
		// @118: iadd
		// @119: iload_3
		// @11A: iload #4
		// @11C: invokevirtual game.C_100327_ib.func_102442_a(int[], int, boolean, int)int
		// @11F: istore #4
		// @121: iinc #5 +1
		// @124: iload #8
		// @126: ifeq @008
		// @129: iload_2
		// @12A: bipush 16 (0x10)
		// @12C: if_icmpeq @13B
		// @12F: aload_0
		// @130: aconst_null
		// @131: checkcast game.C_100049_vf[]
		// @134: putfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @137: goto @13B
		// @13A: athrow
		// @13B: iload #4
		// @13D: ireturn
		// @13E: astore #5
		// @140: aload #5
		// @142: new java.lang.StringBuilder
		// @145: dup
		// @146: invokespecial java.lang.StringBuilder.<init>()void
		// @149: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @14C: bipush 38 (0x26)
		// @14E: aaload
		// @14F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @152: aload_1
		// @153: ifnull @15F
		// @156: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @159: iconst_4
		// @15A: aaload
		// @15B: goto @164
		// @15E: athrow
		// @15F: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @162: iconst_5
		// @163: aaload
		// @164: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @167: bipush 44 (0x2C)
		// @169: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16C: iload_2
		// @16D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @170: bipush 44 (0x2C)
		// @172: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @175: iload_3
		// @176: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @179: bipush 44 (0x2C)
		// @17B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17E: iload #4
		// @180: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @183: bipush 41 (0x29)
		// @185: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @188: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @18B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @18E: athrow
	}
	
	final C_100327_ib[] func_102444_s(int arg0)
	{
		// @00: iload_1
		// @01: bipush 48 (0x30)
		// @03: if_icmpgt @12
		// @06: aload_0
		// @07: aconst_null
		// @08: checkcast game.C_100153_be
		// @0B: putfield game.C_100153_be game.C_100327_ib.field_102484_L
		// @0E: goto @12
		// @11: athrow
		// @12: iconst_0
		// @13: anewarray game.C_100327_ib
		// @16: astore_2
		// @17: aload_0
		// @18: bipush 95 (0x5F)
		// @1A: aload_2
		// @1B: invokespecial game.C_100327_ib.func_102464_a(int, game.C_100327_ib[])game.C_100327_ib[]
		// @1E: areturn
		// @1F: astore_2
		// @20: aload_2
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @2B: bipush 42 (0x2A)
		// @2D: aaload
		// @2E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @31: iload_1
		// @32: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @35: bipush 41 (0x29)
		// @37: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @40: athrow
	}
	
	C_100327_ib(C_100327_ib arg0, boolean arg1)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100325_id.<init>()void
		// @04: aload_0
		// @05: aload_1
		// @06: bipush -19 (0xED)
		// @08: iload_2
		// @09: invokespecial game.C_100327_ib.func_102454_a(game.C_100327_ib, byte, boolean)void
		// @0C: goto @4B
		// @0F: astore_3
		// @10: aload_3
		// @11: new java.lang.StringBuilder
		// @14: dup
		// @15: invokespecial java.lang.StringBuilder.<init>()void
		// @18: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @1B: bipush 10 (0x0A)
		// @1D: aaload
		// @1E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @21: aload_1
		// @22: ifnull @2E
		// @25: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @28: iconst_4
		// @29: aaload
		// @2A: goto @33
		// @2D: athrow
		// @2E: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @31: iconst_5
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: bipush 44 (0x2C)
		// @38: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3B: iload_2
		// @3C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @3F: bipush 41 (0x29)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @47: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4A: athrow
		// @4B: return
	}
	
	C_100327_ib(C_100153_be arg0, int arg1, int arg2, int arg3, int arg4, int arg5, C_100049_vf[] arg6)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100325_id.<init>()void
		// @04: aload_0
		// @05: aload_1
		// @06: putfield game.C_100153_be game.C_100327_ib.field_102492_T
		// @09: aload_0
		// @0A: iconst_m1
		// @0B: putfield int game.C_100327_ib.field_102494_P
		// @0E: aload_0
		// @0F: iload #4
		// @11: putfield int game.C_100327_ib.field_102491_K
		// @14: aload_0
		// @15: iconst_1
		// @16: putfield boolean game.C_100327_ib.field_102501_s
		// @19: aload_0
		// @1A: iconst_0
		// @1B: putfield int game.C_100327_ib.field_102485_M
		// @1E: aload_0
		// @1F: iload #5
		// @21: putfield int game.C_100327_ib.field_102477_D
		// @24: aload_0
		// @25: iconst_0
		// @26: putfield int game.C_100327_ib.field_102504_x
		// @29: aload_0
		// @2A: iload_2
		// @2B: putfield int game.C_100327_ib.field_102497_w
		// @2E: aload_0
		// @2F: aload #7
		// @31: putfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @34: aload_0
		// @35: iconst_0
		// @36: putfield int game.C_100327_ib.field_102480_G
		// @39: aload_0
		// @3A: iload_3
		// @3B: putfield int game.C_100327_ib.field_102502_z
		// @3E: aload_0
		// @3F: iload #6
		// @41: putfield int game.C_100327_ib.field_102496_R
		// @44: goto @C7
		// @47: astore #8
		// @49: aload #8
		// @4B: new java.lang.StringBuilder
		// @4E: dup
		// @4F: invokespecial java.lang.StringBuilder.<init>()void
		// @52: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @55: bipush 10 (0x0A)
		// @57: aaload
		// @58: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5B: aload_1
		// @5C: ifnull @68
		// @5F: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @62: iconst_4
		// @63: aaload
		// @64: goto @6D
		// @67: athrow
		// @68: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @6B: iconst_5
		// @6C: aaload
		// @6D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @70: bipush 44 (0x2C)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: iload_2
		// @76: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @79: bipush 44 (0x2C)
		// @7B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7E: iload_3
		// @7F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @82: bipush 44 (0x2C)
		// @84: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @87: iload #4
		// @89: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8C: bipush 44 (0x2C)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: iload #5
		// @93: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @96: bipush 44 (0x2C)
		// @98: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9B: iload #6
		// @9D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A0: bipush 44 (0x2C)
		// @A2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A5: aload #7
		// @A7: ifnull @B3
		// @AA: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @AD: iconst_4
		// @AE: aaload
		// @AF: goto @B8
		// @B2: athrow
		// @B3: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @B6: iconst_5
		// @B7: aaload
		// @B8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BB: bipush 41 (0x29)
		// @BD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C6: athrow
		// @C7: return
	}
	
	C_100327_ib(C_100153_be arg0, int arg1, int arg2, C_100049_vf[] arg3)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100325_id.<init>()void
		// @04: aload_0
		// @05: iconst_0
		// @06: putfield int game.C_100327_ib.field_102485_M
		// @09: aload_0
		// @0A: iload_3
		// @0B: putfield int game.C_100327_ib.field_102491_K
		// @0E: aload_0
		// @0F: aload_1
		// @10: putfield game.C_100153_be game.C_100327_ib.field_102492_T
		// @13: aload_0
		// @14: iconst_0
		// @15: putfield int game.C_100327_ib.field_102480_G
		// @18: aload_0
		// @19: iconst_0
		// @1A: putfield int game.C_100327_ib.field_102477_D
		// @1D: aload_0
		// @1E: aload #4
		// @20: putfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @23: aload_0
		// @24: iconst_0
		// @25: putfield int game.C_100327_ib.field_102504_x
		// @28: aload_0
		// @29: iload_2
		// @2A: putfield int game.C_100327_ib.field_102502_z
		// @2D: aload_0
		// @2E: iconst_0
		// @2F: putfield int game.C_100327_ib.field_102496_R
		// @32: aload_0
		// @33: iconst_m1
		// @34: putfield int game.C_100327_ib.field_102494_P
		// @37: aload_0
		// @38: iconst_m1
		// @39: putfield int game.C_100327_ib.field_102497_w
		// @3C: aload_0
		// @3D: iconst_1
		// @3E: putfield boolean game.C_100327_ib.field_102501_s
		// @41: goto @A6
		// @44: astore #5
		// @46: aload #5
		// @48: new java.lang.StringBuilder
		// @4B: dup
		// @4C: invokespecial java.lang.StringBuilder.<init>()void
		// @4F: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @52: bipush 10 (0x0A)
		// @54: aaload
		// @55: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @58: aload_1
		// @59: ifnull @65
		// @5C: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @5F: iconst_4
		// @60: aaload
		// @61: goto @6A
		// @64: athrow
		// @65: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @68: iconst_5
		// @69: aaload
		// @6A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6D: bipush 44 (0x2C)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: iload_2
		// @73: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @76: bipush 44 (0x2C)
		// @78: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7B: iload_3
		// @7C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7F: bipush 44 (0x2C)
		// @81: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @84: aload #4
		// @86: ifnull @92
		// @89: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @8C: iconst_4
		// @8D: aaload
		// @8E: goto @97
		// @91: athrow
		// @92: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @95: iconst_5
		// @96: aaload
		// @97: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9A: bipush 41 (0x29)
		// @9C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A2: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A5: athrow
		// @A6: return
	}
	
	final void func_102465_a(byte arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iload_1
		// @06: bipush 46 (0x2E)
		// @08: if_icmpeq @1B
		// @0B: aload_0
		// @0C: bipush 125 (0x7D)
		// @0E: bipush 10 (0x0A)
		// @10: bipush -123 (0x85)
		// @12: bipush 102 (0x66)
		// @14: invokevirtual game.C_100327_ib.func_102436_b(int, int, int, int)void
		// @17: goto @1B
		// @1A: athrow
		// @1B: iconst_0
		// @1C: istore_3
		// @1D: iload_3
		// @1E: iconst_m1
		// @1F: ixor
		// @20: aload_0
		// @21: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @24: arraylength
		// @25: iconst_m1
		// @26: ixor
		// @27: if_icmple @5B
		// @2A: iload #4
		// @2C: ifne @89
		// @2F: aconst_null
		// @30: aload_0
		// @31: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @34: iload_3
		// @35: aaload
		// @36: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @39: if_acmpne @44
		// @3C: goto @40
		// @3F: athrow
		// @40: goto @53
		// @43: athrow
		// @44: aload_0
		// @45: getfield game.C_100049_vf[] game.C_100327_ib.field_102498_v
		// @48: iload_3
		// @49: aaload
		// @4A: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @4D: bipush 46 (0x2E)
		// @4F: iload_2
		// @50: invokevirtual game.C_100327_ib.func_102465_a(byte, int)void
		// @53: iinc #3 +1
		// @56: iload #4
		// @58: ifeq @1D
		// @5B: goto @89
		// @5E: astore_3
		// @5F: aload_3
		// @60: new java.lang.StringBuilder
		// @63: dup
		// @64: invokespecial java.lang.StringBuilder.<init>()void
		// @67: getstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @6A: bipush 28 (0x1C)
		// @6C: aaload
		// @6D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @70: iload_1
		// @71: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @74: bipush 44 (0x2C)
		// @76: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @79: iload_2
		// @7A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7D: bipush 41 (0x29)
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @85: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @88: athrow
		// @89: return
	}
	
	static
	{
		// @000: bipush 44 (0x2C)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "bF6\u001ez#"
		// @009: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "bF6\u0002y#"
		// @014: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @017: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "bF6\u0007z#"
		// @01F: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @022: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "bF6\u000ey#"
		// @02A: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "p\n6gF"
		// @035: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @038: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "eQt%"
		// @040: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @043: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "bF6\u0003y#"
		// @04C: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "bF6\u000f\u0013"
		// @058: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "bF6\u001az#"
		// @064: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @067: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "bF6\u001a\u0013"
		// @070: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @073: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "bF6uReMlw\u0013"
		// @07C: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "bF6\u0000\u0013"
		// @088: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "bF6\ny#"
		// @094: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @097: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "bF6\u001bz#"
		// @0A0: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "bF6\u000cy#"
		// @0AC: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: dup
		// @0B4: bipush 15 (0x0F)
		// @0B6: ldc "bF6\n\u0013"
		// @0B8: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: ldc "bF6\u0001y#"
		// @0C4: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @0C7: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 17 (0x11)
		// @0CE: ldc "bF6\u0008y#"
		// @0D0: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @0D3: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 18 (0x12)
		// @0DA: ldc "bF6\r\u0013"
		// @0DC: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @0DF: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @0E2: aastore
		// @0E3: dup
		// @0E4: bipush 19 (0x13)
		// @0E6: ldc "bF6\u0003z#"
		// @0E8: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @0EB: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @0EE: aastore
		// @0EF: dup
		// @0F0: bipush 20 (0x14)
		// @0F2: ldc "bF6\u001d\u0013"
		// @0F4: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @0F7: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @0FA: aastore
		// @0FB: dup
		// @0FC: bipush 21 (0x15)
		// @0FE: ldc "bF6\u0005z#"
		// @100: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @103: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @106: aastore
		// @107: dup
		// @108: bipush 22 (0x16)
		// @10A: ldc "bF6\u0002z#"
		// @10C: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @10F: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @112: aastore
		// @113: dup
		// @114: bipush 23 (0x17)
		// @116: ldc "bF6\u000c\u0013"
		// @118: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @11B: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @11E: aastore
		// @11F: dup
		// @120: bipush 24 (0x18)
		// @122: ldc "bF6\u000e\u0013"
		// @124: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @127: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @12A: aastore
		// @12B: dup
		// @12C: bipush 25 (0x19)
		// @12E: ldc "bF6\u001fz#"
		// @130: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @133: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @136: aastore
		// @137: dup
		// @138: bipush 26 (0x1A)
		// @13A: ldc "bF6\ry#"
		// @13C: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @13F: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @142: aastore
		// @143: dup
		// @144: bipush 27 (0x1B)
		// @146: ldc "bF6\u0006z#"
		// @148: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @14B: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @14E: aastore
		// @14F: dup
		// @150: bipush 28 (0x1C)
		// @152: ldc "bF6\u001b\u0013"
		// @154: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @157: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @15A: aastore
		// @15B: dup
		// @15C: bipush 29 (0x1D)
		// @15E: ldc "bF6\u000b\u0013"
		// @160: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @163: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @166: aastore
		// @167: dup
		// @168: bipush 30 (0x1E)
		// @16A: ldc "bF6\u000fy#"
		// @16C: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @16F: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @172: aastore
		// @173: dup
		// @174: bipush 31 (0x1F)
		// @176: ldc "bF6\u001cz#"
		// @178: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @17B: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @17E: aastore
		// @17F: dup
		// @180: bipush 32 (0x20)
		// @182: ldc "bF6\u000by#"
		// @184: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @187: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @18A: aastore
		// @18B: dup
		// @18C: bipush 33 (0x21)
		// @18E: ldc "bF6\u0004z#"
		// @190: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @193: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @196: aastore
		// @197: dup
		// @198: bipush 34 (0x22)
		// @19A: ldc "bF6\u001dz#"
		// @19C: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @19F: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @1A2: aastore
		// @1A3: dup
		// @1A4: bipush 35 (0x23)
		// @1A6: ldc "bF6\u0018\u0013"
		// @1A8: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @1AB: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @1AE: aastore
		// @1AF: dup
		// @1B0: bipush 36 (0x24)
		// @1B2: ldc "HKu9TeAv=\u001bB@8'T\u007f\u0004n(Wb@8\u0000\u007f6\u0018=y\u0005+@y=ZTTw:\u00067\u0001)w"
		// @1B4: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @1B7: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @1BA: aastore
		// @1BB: dup
		// @1BC: bipush 37 (0x25)
		// @1BE: ldc "HKu9TeAv=\u001beKliXdVj,X\u007f\u0004q-\u00067\u0001(w\u001b\u007f]h,\u00067\u0001(w\u001boAk In@%u\u001e:\u001a"
		// @1C0: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @1C3: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @1C6: aastore
		// @1C7: dup
		// @1C8: bipush 38 (0x26)
		// @1CA: ldc "bF6\u0008\u0013"
		// @1CC: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @1CF: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @1D2: aastore
		// @1D3: dup
		// @1D4: bipush 39 (0x27)
		// @1D6: ldc "bF6\u0019z#"
		// @1D8: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @1DB: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @1DE: aastore
		// @1DF: dup
		// @1E0: bipush 40 (0x28)
		// @1E2: ldc "bF6\u0001\u0013"
		// @1E4: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @1E7: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @1EA: aastore
		// @1EB: dup
		// @1EC: bipush 41 (0x29)
		// @1EE: ldc "bF6\u0018z#"
		// @1F0: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @1F3: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @1F6: aastore
		// @1F7: dup
		// @1F8: bipush 42 (0x2A)
		// @1FA: ldc "bF6\u0000z#"
		// @1FC: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @1FF: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @202: aastore
		// @203: dup
		// @204: bipush 43 (0x2B)
		// @206: ldc "bF6\u0000y#"
		// @208: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @20B: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @20E: aastore
		// @20F: putstatic java.lang.String[] game.C_100327_ib.field_102481_A
		// @212: ldc "BCv&In"
		// @214: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @217: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @21A: putstatic java.lang.String game.C_100327_ib.field_102487_O
		// @21D: ldc "YEv\"ReCk"
		// @21F: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @222: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @225: putstatic java.lang.String game.C_100327_ib.field_102486_N
		// @228: bipush 12 (0x0C)
		// @22A: newarray int[]
		// @22C: putstatic int[] game.C_100327_ib.field_102490_J
		// @22F: ldc "OMk;N{Pq?^+F}!Z}Mw<I"
		// @231: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @234: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @237: putstatic java.lang.String game.C_100327_ib.field_102493_Q
		// @23A: iconst_0
		// @23B: putstatic int game.C_100327_ib.field_102483_C
		// @23E: ldc "FQl,\u001b\u007fLq:\u001b{Hy0^y\u0004~&I+\u0010 iSdQj:"
		// @240: invokestatic game.C_100327_ib.func_102463_z(java.lang.String)char[]
		// @243: invokestatic game.C_100327_ib.func_102440_z(char[])java.lang.String
		// @246: putstatic java.lang.String game.C_100327_ib.field_102479_F
		// @249: return
	}
	
	private static char[] func_102463_z(String arg0)
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
		// @0E: bipush 59 (0x3B)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_102440_z(char[] arg0)
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
		// @30: bipush 11 (0x0B)
		// @32: goto @46
		// @35: bipush 36 (0x24)
		// @37: goto @46
		// @3A: bipush 24 (0x18)
		// @3C: goto @46
		// @3F: bipush 73 (0x49)
		// @41: goto @46
		// @44: bipush 59 (0x3B)
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
