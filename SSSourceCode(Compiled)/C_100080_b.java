package game;

import java.awt.Image;

abstract class C_100080_b
{
	static C_100217_ao field_104435_c;
	static C_100302_ka field_104431_f;
	static volatile boolean field_104436_a;
	static Image field_104434_b;
	static String field_104432_d;
	static String[] field_104433_e;
	private static final String[] field_104437_z;
	
	static final boolean func_104421_a(boolean arg0, int arg1, int arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #8
		// @05: iconst_0
		// @06: iload_2
		// @07: if_icmple @0C
		// @0A: iconst_0
		// @0B: ireturn
		// @0C: iload_0
		// @0D: ifeq @28
		// @10: bipush -28 (0xE4)
		// @12: iload_2
		// @13: iconst_m1
		// @14: ixor
		// @15: if_icmpeq @26
		// @18: goto @1C
		// @1B: athrow
		// @1C: iload_2
		// @1D: bipush 32 (0x20)
		// @1F: if_icmpne @28
		// @22: goto @26
		// @25: athrow
		// @26: iconst_0
		// @27: ireturn
		// @28: iload_1
		// @29: sipush -11145 (0xD477)
		// @2C: if_icmpeq @31
		// @2F: iconst_1
		// @30: ireturn
		// @31: iconst_0
		// @32: istore_3
		// @33: iload_3
		// @34: iconst_m1
		// @35: ixor
		// @36: bipush -7 (0xF9)
		// @38: if_icmple @A6
		// @3B: getstatic int[] game.C_100017_wj.field_103821_j
		// @3E: iload_3
		// @3F: iaload
		// @40: istore #4
		// @42: bipush 119 (0x77)
		// @44: iload #4
		// @46: invokestatic game.C_100042_we.func_104129_b(int, int)int[]
		// @49: astore #5
		// @4B: iload_0
		// @4C: iload #8
		// @4E: ifne @A7
		// @51: ifeq @62
		// @54: goto @58
		// @57: athrow
		// @58: aload #5
		// @5A: arraylength
		// @5B: bipush 8 (0x08)
		// @5D: isub
		// @5E: goto @63
		// @61: athrow
		// @62: iconst_0
		// @63: istore #6
		// @65: iload_0
		// @66: ifeq @70
		// @69: aload #5
		// @6B: arraylength
		// @6C: goto @76
		// @6F: athrow
		// @70: bipush -8 (0xF8)
		// @72: aload #5
		// @74: arraylength
		// @75: iadd
		// @76: istore #7
		// @78: iload #7
		// @7A: iconst_m1
		// @7B: ixor
		// @7C: iload #6
		// @7E: iconst_m1
		// @7F: ixor
		// @80: if_icmpge @9E
		// @83: iload_2
		// @84: aload #5
		// @86: iload #6
		// @88: iaload
		// @89: iload #8
		// @8B: ifne @38
		// @8E: if_icmpeq @94
		// @91: goto @96
		// @94: iconst_0
		// @95: ireturn
		// @96: iinc #6 +1
		// @99: iload #8
		// @9B: ifeq @78
		// @9E: iinc #3 +1
		// @A1: iload #8
		// @A3: ifeq @33
		// @A6: iconst_1
		// @A7: ireturn
		// @A8: astore_3
		// @A9: aload_3
		// @AA: new java.lang.StringBuilder
		// @AD: dup
		// @AE: invokespecial java.lang.StringBuilder.<init>()void
		// @B1: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @B4: bipush 12 (0x0C)
		// @B6: aaload
		// @B7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BA: iload_0
		// @BB: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @BE: bipush 44 (0x2C)
		// @C0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C3: iload_1
		// @C4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C7: bipush 44 (0x2C)
		// @C9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CC: iload_2
		// @CD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D0: bipush 41 (0x29)
		// @D2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @DB: athrow
	}
	
	abstract byte[] func_104425_a(int arg0, int arg1);
	
	abstract int func_104423_b(int arg0, int arg1);
	
	static final void func_104428_a(boolean arg0, int arg1)
	{
		// @00: getstatic int game.C_100260_mc.field_102234_jc
		// @03: sipush -640 (0xFD80)
		// @06: iadd
		// @07: iconst_2
		// @08: idiv
		// @09: istore_2
		// @0A: getstatic int game.C_100239_oi.field_102312_P
		// @0D: getstatic int game.C_100239_oi.field_102312_P
		// @10: imul
		// @11: istore_3
		// @12: iload_1
		// @13: iload_1
		// @14: imul
		// @15: ineg
		// @16: iload_3
		// @17: iadd
		// @18: istore #4
		// @1A: iload_0
		// @1B: ifeq @29
		// @1E: aconst_null
		// @1F: checkcast java.lang.String
		// @22: putstatic java.lang.String game.C_100080_b.field_104432_d
		// @25: goto @29
		// @28: athrow
		// @29: getstatic game.C_100302_ka game.C_100314_lf.field_101335_mc
		// @2C: iload #4
		// @2E: sipush 199 (0x00C7)
		// @31: imul
		// @32: iload_3
		// @33: idiv
		// @34: ineg
		// @35: iload_2
		// @36: iadd
		// @37: sipush -210 (0xFF2E)
		// @3A: getstatic int game.C_100196_rb.field_105821_c
		// @3D: iadd
		// @3E: iconst_4
		// @3F: isub
		// @40: iconst_m1
		// @41: bipush 90 (0x5A)
		// @43: sipush 199 (0x00C7)
		// @46: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @49: getstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @4C: iload #4
		// @4E: sipush 438 (0x01B6)
		// @51: imul
		// @52: iload_3
		// @53: idiv
		// @54: iload_2
		// @55: sipush -202 (0xFF36)
		// @58: isub
		// @59: iadd
		// @5A: bipush -4 (0xFC)
		// @5C: bipush -120 (0x88)
		// @5E: getstatic int game.C_100196_rb.field_105821_c
		// @61: iadd
		// @62: iadd
		// @63: iconst_m1
		// @64: iconst_0
		// @65: sipush 438 (0x01B6)
		// @68: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @6B: goto @98
		// @6E: astore_2
		// @6F: aload_2
		// @70: new java.lang.StringBuilder
		// @73: dup
		// @74: invokespecial java.lang.StringBuilder.<init>()void
		// @77: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @7A: iconst_1
		// @7B: aaload
		// @7C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7F: iload_0
		// @80: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @83: bipush 44 (0x2C)
		// @85: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @88: iload_1
		// @89: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8C: bipush 41 (0x29)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @94: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @97: athrow
		// @98: return
	}
	
	abstract C_100254_pi func_104430_a(int arg0);
	
	static final C_100302_ka func_104422_a(boolean arg0, boolean arg1, C_100327_ib arg2, int arg3, int arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #19
		// @005: getstatic int game.C_100233_oa.field_106250_h
		// @008: istore #5
		// @00A: bipush -25 (0xE7)
		// @00C: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @00F: ifne @01D
		// @012: iconst_0
		// @013: getstatic int game.C_100212_qc.field_105976_b
		// @016: if_icmplt @034
		// @019: goto @01D
		// @01C: athrow
		// @01D: iconst_0
		// @01E: sipush -11145 (0xD477)
		// @021: aload_2
		// @022: getfield int game.C_100327_ib.field_102494_P
		// @025: invokestatic game.C_100080_b.func_104421_a(boolean, int, int)boolean
		// @028: ifeq @034
		// @02B: goto @02F
		// @02E: athrow
		// @02F: iconst_1
		// @030: goto @035
		// @033: athrow
		// @034: iconst_0
		// @035: istore #6
		// @037: iconst_1
		// @038: aload_2
		// @039: getfield int game.C_100327_ib.field_102497_w
		// @03C: if_icmpeq @045
		// @03F: bipush 64 (0x40)
		// @041: goto @047
		// @044: athrow
		// @045: bipush 78 (0x4E)
		// @047: istore #7
		// @049: aload_2
		// @04A: getfield int game.C_100327_ib.field_102494_P
		// @04D: bipush 17 (0x11)
		// @04F: if_icmplt @065
		// @052: aload_2
		// @053: getfield int game.C_100327_ib.field_102494_P
		// @056: iconst_m1
		// @057: ixor
		// @058: bipush -54 (0xCA)
		// @05A: if_icmple @065
		// @05D: goto @061
		// @060: athrow
		// @061: bipush 36 (0x24)
		// @063: istore #7
		// @065: bipush -84 (0xAC)
		// @067: aload_2
		// @068: getfield int game.C_100327_ib.field_102494_P
		// @06B: iconst_m1
		// @06C: ixor
		// @06D: if_icmpeq @074
		// @070: goto @078
		// @073: athrow
		// @074: bipush 36 (0x24)
		// @076: istore #7
		// @078: new game.C_100302_ka
		// @07B: dup
		// @07C: aload_2
		// @07D: getfield int game.C_100327_ib.field_102494_P
		// @080: i2l
		// @081: getstatic game.C_100302_ka game.C_100042_we.field_104131_r
		// @084: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @087: astore #8
		// @089: getstatic game.C_100302_ka[] game.C_100063_dj.field_104290_f
		// @08C: aload_2
		// @08D: getfield int game.C_100327_ib.field_102494_P
		// @090: aload #8
		// @092: aastore
		// @093: aload #8
		// @095: iconst_m1
		// @096: iload #4
		// @098: iconst_m1
		// @099: ixor
		// @09A: if_icmpne @0A4
		// @09D: getstatic game.C_100037_wb[] game.C_100316_lc.field_102411_v
		// @0A0: goto @0A7
		// @0A3: athrow
		// @0A4: getstatic game.C_100037_wb[] game.C_100200_ba.field_105851_b
		// @0A7: putfield game.C_100037_wb[] game.C_100302_ka.field_101883_qb
		// @0AA: iload_3
		// @0AB: bipush -64 (0xC0)
		// @0AD: if_icmple @0B5
		// @0B0: aconst_null
		// @0B1: checkcast game.C_100302_ka
		// @0B4: areturn
		// @0B5: aload #8
		// @0B7: iload #4
		// @0B9: iconst_m1
		// @0BA: ixor
		// @0BB: iconst_m1
		// @0BC: if_icmpeq @0C6
		// @0BF: getstatic game.C_100037_wb[] game.C_100287_nm.field_106829_l
		// @0C2: goto @0C9
		// @0C5: athrow
		// @0C6: getstatic game.C_100037_wb[] game.C_100200_ba.field_105851_b
		// @0C9: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @0CC: getstatic int[] game.C_100242_oh.field_106342_g
		// @0CF: aload_2
		// @0D0: getfield int game.C_100327_ib.field_102494_P
		// @0D3: iaload
		// @0D4: istore #9
		// @0D6: iconst_0
		// @0D7: istore #10
		// @0D9: iconst_1
		// @0DA: aload_2
		// @0DB: getfield int game.C_100327_ib.field_102497_w
		// @0DE: if_icmpne @1C7
		// @0E1: iconst_0
		// @0E2: iload #4
		// @0E4: if_icmpne @0EF
		// @0E7: goto @0EB
		// @0EA: athrow
		// @0EB: goto @1C7
		// @0EE: athrow
		// @0EF: iconst_1
		// @0F0: aload_2
		// @0F1: getfield int game.C_100327_ib.field_102494_P
		// @0F4: invokestatic game.C_100233_oa.func_106233_a(boolean, int)int[]
		// @0F7: astore #11
		// @0F9: aload_2
		// @0FA: getfield int game.C_100327_ib.field_102494_P
		// @0FD: bipush -113 (0x8F)
		// @0FF: invokestatic game.C_100192_rf.func_101670_b(int, byte)int[]
		// @102: astore #12
		// @104: iconst_0
		// @105: istore #13
		// @107: iconst_0
		// @108: istore #14
		// @10A: aload #11
		// @10C: astore #15
		// @10E: iconst_0
		// @10F: istore #16
		// @111: aload #15
		// @113: arraylength
		// @114: iload #16
		// @116: if_icmple @154
		// @119: aload #15
		// @11B: iload #16
		// @11D: iaload
		// @11E: istore #17
		// @120: getstatic int[] game.C_100242_oh.field_106342_g
		// @123: iload #17
		// @125: iaload
		// @126: istore #18
		// @128: iload #17
		// @12A: getstatic int[] game.C_100257_ln.field_106481_d
		// @12D: bipush -112 (0x90)
		// @12F: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @132: iload #19
		// @134: ifne @159
		// @137: ifeq @145
		// @13A: goto @13E
		// @13D: athrow
		// @13E: iload #14
		// @140: iload #18
		// @142: iadd
		// @143: istore #14
		// @145: iload #13
		// @147: iload #18
		// @149: iadd
		// @14A: istore #13
		// @14C: iinc #16 +1
		// @14F: iload #19
		// @151: ifeq @111
		// @154: aload #12
		// @156: astore #15
		// @158: iconst_0
		// @159: istore #16
		// @15B: iload #16
		// @15D: iconst_m1
		// @15E: ixor
		// @15F: aload #15
		// @161: arraylength
		// @162: iconst_m1
		// @163: ixor
		// @164: if_icmple @1A2
		// @167: aload #15
		// @169: iload #16
		// @16B: iaload
		// @16C: istore #17
		// @16E: getstatic int[] game.C_100328_ia.field_107259_b
		// @171: iload #17
		// @173: iaload
		// @174: istore #18
		// @176: iload #13
		// @178: iload #18
		// @17A: iadd
		// @17B: istore #13
		// @17D: iload #17
		// @17F: getstatic int[] game.C_100075_uj.field_100655_u
		// @182: bipush -115 (0x8D)
		// @184: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @187: iload #19
		// @189: ifne @1B6
		// @18C: ifeq @19A
		// @18F: goto @193
		// @192: athrow
		// @193: iload #14
		// @195: iload #18
		// @197: iadd
		// @198: istore #14
		// @19A: iinc #16 +1
		// @19D: iload #19
		// @19F: ifeq @15B
		// @1A2: bipush 100 (0x64)
		// @1A4: iload #14
		// @1A6: imul
		// @1A7: iload #13
		// @1A9: idiv
		// @1AA: istore #10
		// @1AC: iload #14
		// @1AE: ineg
		// @1AF: iload #13
		// @1B1: iadd
		// @1B2: istore #9
		// @1B4: iload #9
		// @1B6: getstatic int game.C_100096_un.field_104563_d
		// @1B9: if_icmple @1C4
		// @1BC: iconst_2
		// @1BD: istore #4
		// @1BF: iload #19
		// @1C1: ifeq @1C7
		// @1C4: iconst_1
		// @1C5: istore #4
		// @1C7: bipush 66 (0x42)
		// @1C9: istore #11
		// @1CB: aload_2
		// @1CC: iconst_m1
		// @1CD: invokevirtual game.C_100327_ib.func_102474_m(int)java.lang.String
		// @1D0: astore #12
		// @1D2: new game.C_100302_ka
		// @1D5: dup
		// @1D6: aload_2
		// @1D7: getfield int game.C_100327_ib.field_102494_P
		// @1DA: i2l
		// @1DB: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @1DE: aload #12
		// @1E0: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @1E3: astore #13
		// @1E5: aload #13
		// @1E7: iload #11
		// @1E9: bipush -4 (0xFC)
		// @1EB: iadd
		// @1EC: bipush -15 (0xF1)
		// @1EE: iload #7
		// @1F0: bipush -4 (0xFC)
		// @1F2: iadd
		// @1F3: iadd
		// @1F4: iconst_m1
		// @1F5: iconst_2
		// @1F6: iload #11
		// @1F8: ineg
		// @1F9: iload #5
		// @1FB: iadd
		// @1FC: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1FF: aload #13
		// @201: bipush 10 (0x0A)
		// @203: putfield int game.C_100302_ka.field_101833_ob
		// @206: bipush -41 (0xD7)
		// @208: iload #7
		// @20A: iconst_m1
		// @20B: ixor
		// @20C: if_icmplt @213
		// @20F: goto @22F
		// @212: athrow
		// @213: aload #12
		// @215: aload #13
		// @217: getfield int game.C_100302_ka.field_101886_Kb
		// @21A: aload #13
		// @21C: getfield int game.C_100302_ka.field_101829_Db
		// @21F: iconst_2
		// @220: imul
		// @221: isub
		// @222: sipush -3598 (0xF1F2)
		// @225: aload #13
		// @227: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @22A: invokestatic game.C_100192_rf.func_101672_a(java.lang.String, int, int, game.C_100112_r)java.lang.String
		// @22D: astore #12
		// @22F: aload #13
		// @231: aload #12
		// @233: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @236: aload #13
		// @238: ldc 1995681 (0x1e73a1)
		// @23A: putfield int game.C_100302_ka.field_101830_gb
		// @23D: aload #8
		// @23F: bipush -90 (0xA6)
		// @241: aload #13
		// @243: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @246: bipush -18 (0xEE)
		// @248: aload_2
		// @249: getfield int game.C_100327_ib.field_102494_P
		// @24C: iconst_m1
		// @24D: ixor
		// @24E: if_icmplt @25E
		// @251: bipush 53 (0x35)
		// @253: aload_2
		// @254: getfield int game.C_100327_ib.field_102494_P
		// @257: if_icmpgt @548
		// @25A: goto @25E
		// @25D: athrow
		// @25E: bipush -84 (0xAC)
		// @260: aload_2
		// @261: getfield int game.C_100327_ib.field_102494_P
		// @264: iconst_m1
		// @265: ixor
		// @266: if_icmpeq @548
		// @269: goto @26D
		// @26C: athrow
		// @26D: bipush -2 (0xFE)
		// @26F: aload_2
		// @270: getfield int game.C_100327_ib.field_102497_w
		// @273: iconst_m1
		// @274: ixor
		// @275: if_icmpne @3E4
		// @278: goto @27C
		// @27B: athrow
		// @27C: aload #13
		// @27E: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @281: aload #13
		// @283: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @286: iconst_2
		// @287: aload #13
		// @289: getfield int game.C_100302_ka.field_101829_Db
		// @28C: imul
		// @28D: ineg
		// @28E: aload #13
		// @290: getfield int game.C_100302_ka.field_101886_Kb
		// @293: iadd
		// @294: aload #13
		// @296: getfield int game.C_100302_ka.field_101833_ob
		// @299: invokevirtual game.C_100112_r.func_101734_a(java.lang.String, int, int)int
		// @29C: bipush 6 (0x06)
		// @29E: iadd
		// @29F: istore #14
		// @2A1: sipush 2000 (0x07D0)
		// @2A4: iload #11
		// @2A6: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @2A9: iconst_4
		// @2AA: aaload
		// @2AB: getstatic int[] game.C_100064_ve.field_103015_v
		// @2AE: aload_2
		// @2AF: getfield int game.C_100327_ib.field_102494_P
		// @2B2: iaload
		// @2B3: iload #5
		// @2B5: aload #8
		// @2B7: aload_2
		// @2B8: getfield int game.C_100327_ib.field_102494_P
		// @2BB: iload #14
		// @2BD: sipush 3000 (0x0BB8)
		// @2C0: invokestatic game.C_100305_km.func_103225_a(int, int, java.lang.String, int, int, game.C_100302_ka, int, int, int)void
		// @2C3: iinc #14 +14
		// @2C6: sipush 2000 (0x07D0)
		// @2C9: iload #11
		// @2CB: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @2CE: bipush 8 (0x08)
		// @2D0: aaload
		// @2D1: aload_2
		// @2D2: iconst_0
		// @2D3: invokevirtual game.C_100327_ib.func_102447_l(int)int
		// @2D6: iload #5
		// @2D8: aload #8
		// @2DA: aload_2
		// @2DB: getfield int game.C_100327_ib.field_102494_P
		// @2DE: iload #14
		// @2E0: sipush 800 (0x0320)
		// @2E3: invokestatic game.C_100305_km.func_103225_a(int, int, java.lang.String, int, int, game.C_100302_ka, int, int, int)void
		// @2E6: iinc #14 +14
		// @2E9: iconst_m1
		// @2EA: aload_2
		// @2EB: bipush 104 (0x68)
		// @2ED: invokevirtual game.C_100327_ib.func_102445_j(int)int
		// @2F0: iconst_m1
		// @2F1: ixor
		// @2F2: if_icmple @329
		// @2F5: sipush 2000 (0x07D0)
		// @2F8: iload #11
		// @2FA: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @2FD: iconst_5
		// @2FE: aaload
		// @2FF: aload_2
		// @300: bipush 106 (0x6A)
		// @302: invokevirtual game.C_100327_ib.func_102445_j(int)int
		// @305: i2d
		// @306: aload_2
		// @307: iconst_0
		// @308: invokevirtual game.C_100327_ib.func_102447_l(int)int
		// @30B: i2d
		// @30C: invokestatic java.lang.Math.sqrt(double)double
		// @30F: ddiv
		// @310: d2i
		// @311: iload #5
		// @313: aload #8
		// @315: aload_2
		// @316: getfield int game.C_100327_ib.field_102494_P
		// @319: iload #14
		// @31B: bipush 27 (0x1B)
		// @31D: invokestatic game.C_100305_km.func_103225_a(int, int, java.lang.String, int, int, game.C_100302_ka, int, int, int)void
		// @320: iload #19
		// @322: ifeq @367
		// @325: goto @329
		// @328: athrow
		// @329: iconst_0
		// @32A: aload_2
		// @32B: bipush -94 (0xA2)
		// @32D: invokevirtual game.C_100327_ib.func_102466_i(int)int
		// @330: if_icmplt @33B
		// @333: goto @337
		// @336: athrow
		// @337: goto @367
		// @33A: athrow
		// @33B: sipush 2000 (0x07D0)
		// @33E: iload #11
		// @340: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @343: bipush 7 (0x07)
		// @345: aaload
		// @346: aload_2
		// @347: bipush -77 (0xB3)
		// @349: invokevirtual game.C_100327_ib.func_102466_i(int)int
		// @34C: i2d
		// @34D: aload_2
		// @34E: iconst_0
		// @34F: invokevirtual game.C_100327_ib.func_102447_l(int)int
		// @352: i2d
		// @353: invokestatic java.lang.Math.sqrt(double)double
		// @356: ddiv
		// @357: d2i
		// @358: iload #5
		// @35A: aload #8
		// @35C: aload_2
		// @35D: getfield int game.C_100327_ib.field_102494_P
		// @360: iload #14
		// @362: bipush 27 (0x1B)
		// @364: invokestatic game.C_100305_km.func_103225_a(int, int, java.lang.String, int, int, game.C_100302_ka, int, int, int)void
		// @367: iinc #14 +14
		// @36A: ldc ""
		// @36C: astore #16
		// @36E: iconst_0
		// @36F: istore #17
		// @371: aload_2
		// @372: sipush -3099 (0xF3E5)
		// @375: invokevirtual game.C_100327_ib.func_102460_q(int)int
		// @378: iconst_m1
		// @379: ixor
		// @37A: iload #17
		// @37C: iconst_m1
		// @37D: ixor
		// @37E: if_icmpge @3AC
		// @381: new java.lang.StringBuilder
		// @384: dup
		// @385: invokespecial java.lang.StringBuilder.<init>()void
		// @388: aload #16
		// @38A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @38D: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @390: bipush 11 (0x0B)
		// @392: aaload
		// @393: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @396: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @399: astore #16
		// @39B: iinc #17 +1
		// @39E: iload #19
		// @3A0: ifne @56E
		// @3A3: iload #19
		// @3A5: ifeq @371
		// @3A8: goto @3AC
		// @3AB: athrow
		// @3AC: new game.C_100302_ka
		// @3AF: dup
		// @3B0: aload_2
		// @3B1: getfield int game.C_100327_ib.field_102494_P
		// @3B4: i2l
		// @3B5: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @3B8: aload #16
		// @3BA: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @3BD: astore #15
		// @3BF: aload #15
		// @3C1: bipush -4 (0xFC)
		// @3C3: iload #11
		// @3C5: iadd
		// @3C6: bipush 20 (0x14)
		// @3C8: iconst_m1
		// @3C9: iload #14
		// @3CB: iload #5
		// @3CD: iload #11
		// @3CF: isub
		// @3D0: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @3D3: iinc #14 +14
		// @3D6: aload #8
		// @3D8: bipush -84 (0xAC)
		// @3DA: aload #15
		// @3DC: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @3DF: iload #19
		// @3E1: ifeq @56E
		// @3E4: aload #13
		// @3E6: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @3E9: aload #13
		// @3EB: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @3EE: aload #13
		// @3F0: getfield int game.C_100302_ka.field_101886_Kb
		// @3F3: aload #13
		// @3F5: getfield int game.C_100302_ka.field_101829_Db
		// @3F8: iconst_2
		// @3F9: imul
		// @3FA: ineg
		// @3FB: iadd
		// @3FC: aload #13
		// @3FE: getfield int game.C_100302_ka.field_101833_ob
		// @401: invokevirtual game.C_100112_r.func_101734_a(java.lang.String, int, int)int
		// @404: bipush 6 (0x06)
		// @406: iadd
		// @407: istore #14
		// @409: sipush 2000 (0x07D0)
		// @40C: iload #11
		// @40E: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @411: iconst_4
		// @412: aaload
		// @413: getstatic int[] game.C_100064_ve.field_103015_v
		// @416: aload_2
		// @417: getfield int game.C_100327_ib.field_102494_P
		// @41A: iaload
		// @41B: iload #5
		// @41D: aload #8
		// @41F: aload_2
		// @420: getfield int game.C_100327_ib.field_102494_P
		// @423: iload #14
		// @425: sipush 3000 (0x0BB8)
		// @428: invokestatic game.C_100305_km.func_103225_a(int, int, java.lang.String, int, int, game.C_100302_ka, int, int, int)void
		// @42B: iinc #14 +14
		// @42E: sipush 2000 (0x07D0)
		// @431: iload #11
		// @433: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @436: bipush 8 (0x08)
		// @438: aaload
		// @439: aload_2
		// @43A: iconst_0
		// @43B: invokevirtual game.C_100327_ib.func_102447_l(int)int
		// @43E: iload #5
		// @440: aload #8
		// @442: aload_2
		// @443: getfield int game.C_100327_ib.field_102494_P
		// @446: iload #14
		// @448: sipush 400 (0x0190)
		// @44B: invokestatic game.C_100305_km.func_103225_a(int, int, java.lang.String, int, int, game.C_100302_ka, int, int, int)void
		// @44E: iinc #14 +14
		// @451: aload_2
		// @452: sipush -3099 (0xF3E5)
		// @455: invokevirtual game.C_100327_ib.func_102460_q(int)int
		// @458: ifle @4CA
		// @45B: ldc ""
		// @45D: astore #16
		// @45F: iconst_0
		// @460: istore #17
		// @462: aload_2
		// @463: sipush -3099 (0xF3E5)
		// @466: invokevirtual game.C_100327_ib.func_102460_q(int)int
		// @469: iload #17
		// @46B: if_icmple @499
		// @46E: new java.lang.StringBuilder
		// @471: dup
		// @472: invokespecial java.lang.StringBuilder.<init>()void
		// @475: aload #16
		// @477: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @47A: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @47D: bipush 11 (0x0B)
		// @47F: aaload
		// @480: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @483: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @486: astore #16
		// @488: iinc #17 +1
		// @48B: iload #19
		// @48D: ifne @4CA
		// @490: iload #19
		// @492: ifeq @462
		// @495: goto @499
		// @498: athrow
		// @499: new game.C_100302_ka
		// @49C: dup
		// @49D: aload_2
		// @49E: getfield int game.C_100327_ib.field_102494_P
		// @4A1: i2l
		// @4A2: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @4A5: aload #16
		// @4A7: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @4AA: astore #15
		// @4AC: aload #15
		// @4AE: iload #11
		// @4B0: bipush -4 (0xFC)
		// @4B2: iadd
		// @4B3: bipush 20 (0x14)
		// @4B5: iconst_m1
		// @4B6: iload #14
		// @4B8: iload #5
		// @4BA: iload #11
		// @4BC: ineg
		// @4BD: iadd
		// @4BE: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @4C1: aload #8
		// @4C3: bipush -110 (0x92)
		// @4C5: aload #15
		// @4C7: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @4CA: iconst_0
		// @4CB: aload_2
		// @4CC: bipush 86 (0x56)
		// @4CE: invokevirtual game.C_100327_ib.func_102445_j(int)int
		// @4D1: if_icmpge @543
		// @4D4: bipush -60 (0xC4)
		// @4D6: aload_2
		// @4D7: getfield int game.C_100327_ib.field_102494_P
		// @4DA: iconst_m1
		// @4DB: ixor
		// @4DC: if_icmpeq @4F0
		// @4DF: goto @4E3
		// @4E2: athrow
		// @4E3: aload_2
		// @4E4: getfield int game.C_100327_ib.field_102494_P
		// @4E7: bipush 77 (0x4D)
		// @4E9: if_icmpne @4F5
		// @4EC: goto @4F0
		// @4EF: athrow
		// @4F0: iconst_1
		// @4F1: goto @4F6
		// @4F4: athrow
		// @4F5: iconst_0
		// @4F6: istore #16
		// @4F8: new game.C_100302_ka
		// @4FB: dup
		// @4FC: aload_2
		// @4FD: getfield int game.C_100327_ib.field_102494_P
		// @500: i2l
		// @501: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @504: iload #16
		// @506: ifne @512
		// @509: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @50C: iconst_5
		// @50D: aaload
		// @50E: goto @518
		// @511: athrow
		// @512: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @515: bipush 6 (0x06)
		// @517: aaload
		// @518: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @51B: astore #15
		// @51D: aload #15
		// @51F: iload #11
		// @521: bipush -4 (0xFC)
		// @523: iadd
		// @524: bipush 20 (0x14)
		// @526: iconst_m1
		// @527: iload #14
		// @529: iconst_5
		// @52A: iload #11
		// @52C: ineg
		// @52D: iadd
		// @52E: iload #5
		// @530: iadd
		// @531: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @534: aload #15
		// @536: iconst_2
		// @537: putfield int game.C_100302_ka.field_101850_Fb
		// @53A: aload #8
		// @53C: bipush -96 (0xA0)
		// @53E: aload #15
		// @540: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @543: iload #19
		// @545: ifeq @56E
		// @548: sipush 2000 (0x07D0)
		// @54B: iload #11
		// @54D: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @550: iconst_4
		// @551: aaload
		// @552: getstatic int[] game.C_100064_ve.field_103015_v
		// @555: aload_2
		// @556: getfield int game.C_100327_ib.field_102494_P
		// @559: iaload
		// @55A: iload #5
		// @55C: aload #8
		// @55E: aload_2
		// @55F: getfield int game.C_100327_ib.field_102494_P
		// @562: bipush 18 (0x12)
		// @564: sipush 500 (0x01F4)
		// @567: invokestatic game.C_100305_km.func_103225_a(int, int, java.lang.String, int, int, game.C_100302_ka, int, int, int)void
		// @56A: goto @56E
		// @56D: athrow
		// @56E: new game.C_100302_ka
		// @571: dup
		// @572: aload_2
		// @573: getfield int game.C_100327_ib.field_102494_P
		// @576: i2l
		// @577: aconst_null
		// @578: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @57B: astore #14
		// @57D: aload #14
		// @57F: iconst_2
		// @580: iload #7
		// @582: iconst_4
		// @583: isub
		// @584: iconst_m1
		// @585: iconst_2
		// @586: iload #11
		// @588: bipush -4 (0xFC)
		// @58A: iadd
		// @58B: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @58E: aload #14
		// @590: getstatic game.C_100037_wb[] game.C_100287_nm.field_106829_l
		// @593: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @596: aload_2
		// @597: getfield int game.C_100327_ib.field_102497_w
		// @59A: iconst_m1
		// @59B: ixor
		// @59C: bipush -2 (0xFE)
		// @59E: if_icmpne @614
		// @5A1: iconst_m1
		// @5A2: aload_2
		// @5A3: getfield int game.C_100327_ib.field_102494_P
		// @5A6: iconst_m1
		// @5A7: invokestatic game.C_100152_bd.func_105179_a(int, int)int
		// @5AA: iconst_m1
		// @5AB: ixor
		// @5AC: if_icmplt @614
		// @5AF: goto @5B3
		// @5B2: athrow
		// @5B3: aload_2
		// @5B4: getfield int game.C_100327_ib.field_102494_P
		// @5B7: iconst_m1
		// @5B8: invokestatic game.C_100152_bd.func_105179_a(int, int)int
		// @5BB: istore #15
		// @5BD: aload #14
		// @5BF: new game.C_100037_wb
		// @5C2: dup
		// @5C3: bipush 64 (0x40)
		// @5C5: iload #11
		// @5C7: bipush -4 (0xFC)
		// @5C9: iadd
		// @5CA: invokestatic java.lang.Math.min(int, int)int
		// @5CD: bipush 64 (0x40)
		// @5CF: bipush -4 (0xFC)
		// @5D1: iload #7
		// @5D3: iadd
		// @5D4: invokestatic java.lang.Math.min(int, int)int
		// @5D7: invokespecial game.C_100037_wb.<init>(int, int)void
		// @5DA: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @5DD: aload #14
		// @5DF: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @5E2: invokevirtual game.C_100037_wb.func_102379_d()void
		// @5E5: getstatic game.C_100037_wb[] game.C_100124_tn.field_104936_c
		// @5E8: iload #15
		// @5EA: aaload
		// @5EB: iconst_0
		// @5EC: iconst_0
		// @5ED: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @5F0: invokestatic game.C_100196_rb.func_105781_a()void
		// @5F3: getstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @5F6: bipush 120 (0x78)
		// @5F8: invokevirtual game.C_100185_rm.func_105476_a(byte)void
		// @5FB: getstatic game.C_100302_ka[] game.C_100123_uc.field_104925_a
		// @5FE: iload #15
		// @600: aload #14
		// @602: aastore
		// @603: aload #14
		// @605: iconst_1
		// @606: putfield int game.C_100302_ka.field_101850_Fb
		// @609: aload #14
		// @60B: iconst_1
		// @60C: putfield int game.C_100302_ka.field_101858_J
		// @60F: iload #19
		// @611: ifeq @62B
		// @614: bipush -4 (0xFC)
		// @616: iload #7
		// @618: iadd
		// @619: iconst_0
		// @61A: bipush 99 (0x63)
		// @61C: aload #14
		// @61E: aload_2
		// @61F: iload #11
		// @621: bipush -4 (0xFC)
		// @623: iadd
		// @624: invokestatic game.C_100208_qg.func_105944_a(int, boolean, int, game.C_100302_ka, game.C_100327_ib, int)void
		// @627: goto @62B
		// @62A: athrow
		// @62B: iload_0
		// @62C: ifeq @644
		// @62F: iload_1
		// @630: ifne @644
		// @633: goto @637
		// @636: athrow
		// @637: iload #6
		// @639: ifne @644
		// @63C: goto @640
		// @63F: athrow
		// @640: goto @6A5
		// @643: athrow
		// @644: aload #14
		// @646: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @649: invokevirtual game.C_100037_wb.func_102379_d()void
		// @64C: iconst_0
		// @64D: iconst_0
		// @64E: aload #14
		// @650: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @653: getfield int game.C_100037_wb.field_102339_s
		// @656: aload #14
		// @658: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @65B: getfield int game.C_100037_wb.field_102337_u
		// @65E: iconst_0
		// @65F: sipush 128 (0x0080)
		// @662: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @665: iload_1
		// @666: ifeq @69D
		// @669: iload #6
		// @66B: ifne @69D
		// @66E: goto @672
		// @671: athrow
		// @672: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @675: getstatic java.lang.String game.C_100215_ai.field_106020_j
		// @678: aload #14
		// @67A: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @67D: getfield int game.C_100037_wb.field_102339_s
		// @680: iconst_2
		// @681: idiv
		// @682: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @685: getfield int game.C_100193_re.field_101772_Q
		// @688: aload #14
		// @68A: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @68D: getfield int game.C_100037_wb.field_102337_u
		// @690: iadd
		// @691: iconst_2
		// @692: idiv
		// @693: ldc 12632256 (0xc0c0c0)
		// @695: iconst_0
		// @696: invokevirtual game.C_100193_re.func_101744_b(java.lang.String, int, int, int, int)void
		// @699: goto @69D
		// @69C: athrow
		// @69D: getstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @6A0: bipush 125 (0x7D)
		// @6A2: invokevirtual game.C_100185_rm.func_105476_a(byte)void
		// @6A5: aload #8
		// @6A7: bipush -87 (0xA9)
		// @6A9: aload #14
		// @6AB: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @6AE: iload #6
		// @6B0: ifne @7CB
		// @6B3: iconst_0
		// @6B4: iload #4
		// @6B6: if_icmpne @6C1
		// @6B9: goto @6BD
		// @6BC: athrow
		// @6BD: goto @823
		// @6C0: athrow
		// @6C1: bipush 28 (0x1C)
		// @6C3: istore #15
		// @6C5: bipush 28 (0x1C)
		// @6C7: istore #16
		// @6C9: aload_2
		// @6CA: getfield int game.C_100327_ib.field_102497_w
		// @6CD: iconst_1
		// @6CE: if_icmpeq @6D5
		// @6D1: goto @6D8
		// @6D4: athrow
		// @6D5: iinc #16 +14
		// @6D8: new game.C_100302_ka
		// @6DB: dup
		// @6DC: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @6DF: bipush 10 (0x0A)
		// @6E1: aaload
		// @6E2: aconst_null
		// @6E3: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @6E6: astore #17
		// @6E8: aload #17
		// @6EA: aload #14
		// @6EC: getfield int game.C_100302_ka.field_101841_Pb
		// @6EF: aload #14
		// @6F1: getfield int game.C_100302_ka.field_101886_Kb
		// @6F4: iload #15
		// @6F6: isub
		// @6F7: iconst_2
		// @6F8: idiv
		// @6F9: ineg
		// @6FA: isub
		// @6FB: iload #16
		// @6FD: iconst_m1
		// @6FE: aload #14
		// @700: getfield int game.C_100302_ka.field_101880_Gb
		// @703: aload #14
		// @705: getfield int game.C_100302_ka.field_101848_lb
		// @708: iload #15
		// @70A: isub
		// @70B: iconst_2
		// @70C: idiv
		// @70D: ineg
		// @70E: isub
		// @70F: iload #15
		// @711: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @714: aload #17
		// @716: iconst_2
		// @717: putfield int game.C_100302_ka.field_101846_Ib
		// @71A: aload #17
		// @71C: getstatic game.C_100037_wb[] game.C_100154_sl.field_105329_f
		// @71F: putfield game.C_100037_wb[] game.C_100302_ka.field_101883_qb
		// @722: aload #17
		// @724: getstatic game.C_100037_wb[] game.C_100321_hi.field_107228_h
		// @727: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @72A: aload #17
		// @72C: iconst_2
		// @72D: putfield int game.C_100302_ka.field_101875_X
		// @730: aload #17
		// @732: getstatic game.C_100037_wb[] game.C_100058_dg.field_101562_E
		// @735: iload #4
		// @737: aaload
		// @738: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @73B: aload #8
		// @73D: bipush -117 (0x8B)
		// @73F: aload #17
		// @741: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @744: bipush -59 (0xC5)
		// @746: aload_2
		// @747: getfield int game.C_100327_ib.field_102494_P
		// @74A: iconst_m1
		// @74B: ixor
		// @74C: if_icmpeq @74F
		// @74F: bipush -2 (0xFE)
		// @751: aload_2
		// @752: getfield int game.C_100327_ib.field_102497_w
		// @755: iconst_m1
		// @756: ixor
		// @757: if_icmpne @7C6
		// @75A: new game.C_100302_ka
		// @75D: dup
		// @75E: ldc2_w -1
		// @761: aconst_null
		// @762: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @765: astore #18
		// @767: aload #18
		// @769: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @76C: putfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @76F: aload #18
		// @771: iload #4
		// @773: iconst_1
		// @774: if_icmpne @77D
		// @777: ldc 65280 (0xff00)
		// @779: goto @77F
		// @77C: athrow
		// @77D: ldc 16711680 (0xff0000)
		// @77F: putfield int game.C_100302_ka.field_101830_gb
		// @782: aload #18
		// @784: new java.lang.StringBuilder
		// @787: dup
		// @788: invokespecial java.lang.StringBuilder.<init>()void
		// @78B: iload #10
		// @78D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @790: ldc "%"
		// @792: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @795: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @798: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @79B: aload #18
		// @79D: iconst_1
		// @79E: putfield int game.C_100302_ka.field_101858_J
		// @7A1: aload #18
		// @7A3: iconst_1
		// @7A4: putfield int game.C_100302_ka.field_101850_Fb
		// @7A7: aload #18
		// @7A9: iconst_0
		// @7AA: bipush 14 (0x0E)
		// @7AC: iconst_m1
		// @7AD: aload #17
		// @7AF: getfield int game.C_100302_ka.field_101848_lb
		// @7B2: bipush 14 (0x0E)
		// @7B4: isub
		// @7B5: aload #17
		// @7B7: getfield int game.C_100302_ka.field_101886_Kb
		// @7BA: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @7BD: aload #17
		// @7BF: bipush -75 (0xB5)
		// @7C1: aload #18
		// @7C3: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @7C6: iload #19
		// @7C8: ifeq @823
		// @7CB: getstatic game.C_100037_wb game.C_100244_pe.field_106376_e
		// @7CE: getfield int game.C_100037_wb.field_102339_s
		// @7D1: istore #15
		// @7D3: getstatic game.C_100037_wb game.C_100244_pe.field_106376_e
		// @7D6: getfield int game.C_100037_wb.field_102337_u
		// @7D9: istore #16
		// @7DB: new game.C_100302_ka
		// @7DE: dup
		// @7DF: ldc2_w -1
		// @7E2: aconst_null
		// @7E3: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @7E6: astore #17
		// @7E8: aload #17
		// @7EA: aload #14
		// @7EC: getfield int game.C_100302_ka.field_101841_Pb
		// @7EF: aload #14
		// @7F1: getfield int game.C_100302_ka.field_101886_Kb
		// @7F4: iload #15
		// @7F6: isub
		// @7F7: iconst_2
		// @7F8: idiv
		// @7F9: iadd
		// @7FA: iload #16
		// @7FC: iconst_m1
		// @7FD: aload #14
		// @7FF: getfield int game.C_100302_ka.field_101848_lb
		// @802: iload #15
		// @804: isub
		// @805: iconst_2
		// @806: idiv
		// @807: aload #14
		// @809: getfield int game.C_100302_ka.field_101880_Gb
		// @80C: iadd
		// @80D: iload #15
		// @80F: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @812: aload #17
		// @814: getstatic game.C_100037_wb game.C_100244_pe.field_106376_e
		// @817: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @81A: aload #8
		// @81C: bipush -110 (0x92)
		// @81E: aload #17
		// @820: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @823: aload_2
		// @824: getfield int game.C_100327_ib.field_102494_P
		// @827: iconst_m1
		// @828: ixor
		// @829: bipush -56 (0xC8)
		// @82B: if_icmpeq @832
		// @82E: goto @83C
		// @831: athrow
		// @832: getstatic game.C_100067_vd[] game.C_100066_dl.field_101641_u
		// @835: iconst_1
		// @836: aaload
		// @837: aload #8
		// @839: putfield game.C_100302_ka game.C_100067_vd.field_104319_l
		// @83C: bipush 18 (0x12)
		// @83E: aload_2
		// @83F: getfield int game.C_100327_ib.field_102494_P
		// @842: if_icmpne @854
		// @845: getstatic game.C_100067_vd[] game.C_100066_dl.field_101641_u
		// @848: bipush 7 (0x07)
		// @84A: aaload
		// @84B: aload #8
		// @84D: putfield game.C_100302_ka game.C_100067_vd.field_104319_l
		// @850: goto @854
		// @853: athrow
		// @854: aload #8
		// @856: areturn
		// @857: astore #5
		// @859: aload #5
		// @85B: new java.lang.StringBuilder
		// @85E: dup
		// @85F: invokespecial java.lang.StringBuilder.<init>()void
		// @862: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @865: iconst_2
		// @866: aaload
		// @867: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @86A: iload_0
		// @86B: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @86E: bipush 44 (0x2C)
		// @870: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @873: iload_1
		// @874: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @877: bipush 44 (0x2C)
		// @879: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @87C: aload_2
		// @87D: ifnull @88A
		// @880: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @883: bipush 9 (0x09)
		// @885: aaload
		// @886: goto @88F
		// @889: athrow
		// @88A: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @88D: iconst_3
		// @88E: aaload
		// @88F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @892: bipush 44 (0x2C)
		// @894: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @897: iload_3
		// @898: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @89B: bipush 44 (0x2C)
		// @89D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8A0: iload #4
		// @8A2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8A5: bipush 41 (0x29)
		// @8A7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8AA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8AD: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8B0: athrow
	}
	
	static final void func_104429_a(int arg0, boolean arg1)
	{
		// @00: iload_0
		// @01: sipush 743 (0x02E7)
		// @04: if_icmpeq @08
		// @07: return
		// @08: iload_1
		// @09: ifeq @1D
		// @0C: new game.C_100220_ac
		// @0F: dup
		// @10: getstatic java.lang.String game.C_100018_wk.field_101512_D
		// @13: getstatic game.C_100302_ka game.C_100149_bi.field_105157_c
		// @16: invokespecial game.C_100220_ac.<init>(java.lang.String, game.C_100302_ka)void
		// @19: goto @2A
		// @1C: athrow
		// @1D: new game.C_100220_ac
		// @20: dup
		// @21: getstatic java.lang.String game.C_100164_se.field_105450_d
		// @24: getstatic game.C_100302_ka game.C_100030_gm.field_103341_D
		// @27: invokespecial game.C_100220_ac.<init>(java.lang.String, game.C_100302_ka)void
		// @2A: putstatic game.C_100220_ac game.C_100091_m.field_104516_c
		// @2D: new game.C_100302_ka
		// @30: dup
		// @31: lconst_0
		// @32: aconst_null
		// @33: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @36: putstatic game.C_100302_ka game.C_100314_lf.field_101335_mc
		// @39: getstatic game.C_100302_ka game.C_100314_lf.field_101335_mc
		// @3C: bipush -101 (0x9B)
		// @3E: getstatic game.C_100220_ac game.C_100091_m.field_104516_c
		// @41: getfield game.C_100172_ck game.C_100220_ac.field_106059_a
		// @44: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @47: getstatic game.C_100302_ka game.C_100314_lf.field_101335_mc
		// @4A: bipush -113 (0x8F)
		// @4C: getstatic game.C_100302_ka game.C_100200_ba.field_105847_f
		// @4F: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @52: new game.C_100302_ka
		// @55: dup
		// @56: lconst_0
		// @57: getstatic game.C_100302_ka game.C_100097_k.field_104578_f
		// @5A: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @5D: putstatic game.C_100302_ka game.C_100159_sn.field_105402_b
		// @60: new game.C_100302_ka
		// @63: dup
		// @64: lconst_0
		// @65: aconst_null
		// @66: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @69: putstatic game.C_100302_ka game.C_100266_me.field_106649_g
		// @6C: getstatic game.C_100302_ka game.C_100159_sn.field_105402_b
		// @6F: bipush -106 (0x96)
		// @71: getstatic game.C_100302_ka game.C_100115_ej.field_102045_cc
		// @74: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @77: getstatic game.C_100302_ka game.C_100159_sn.field_105402_b
		// @7A: iload_0
		// @7B: sipush -849 (0xFCAF)
		// @7E: iadd
		// @7F: getstatic game.C_100302_ka game.C_100266_me.field_106649_g
		// @82: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @85: getstatic game.C_100302_ka game.C_100266_me.field_106649_g
		// @88: bipush -117 (0x8B)
		// @8A: getstatic game.C_100302_ka game.C_100099_fb.field_103050_z
		// @8D: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @90: getstatic game.C_100302_ka game.C_100266_me.field_106649_g
		// @93: bipush -103 (0x99)
		// @95: getstatic game.C_100302_ka game.C_100273_mm.field_106685_a
		// @98: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @9B: iconst_0
		// @9C: iload_1
		// @9D: invokestatic game.C_100239_oi.func_102291_a(int, boolean)void
		// @A0: goto @CD
		// @A3: astore_2
		// @A4: aload_2
		// @A5: new java.lang.StringBuilder
		// @A8: dup
		// @A9: invokespecial java.lang.StringBuilder.<init>()void
		// @AC: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @AF: iconst_0
		// @B0: aaload
		// @B1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B4: iload_0
		// @B5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B8: bipush 44 (0x2C)
		// @BA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BD: iload_1
		// @BE: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @C1: bipush 41 (0x29)
		// @C3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C9: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CC: athrow
		// @CD: return
	}
	
	public static void func_104427_a(boolean arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.awt.Image game.C_100080_b.field_104434_b
		// @04: aconst_null
		// @05: putstatic java.lang.String[] game.C_100080_b.field_104433_e
		// @08: iload_0
		// @09: iconst_1
		// @0A: if_icmpeq @18
		// @0D: aconst_null
		// @0E: checkcast game.C_100217_ao
		// @11: putstatic game.C_100217_ao game.C_100080_b.field_104435_c
		// @14: goto @18
		// @17: athrow
		// @18: aconst_null
		// @19: putstatic java.lang.String game.C_100080_b.field_104432_d
		// @1C: aconst_null
		// @1D: putstatic game.C_100302_ka game.C_100080_b.field_104431_f
		// @20: aconst_null
		// @21: putstatic game.C_100217_ao game.C_100080_b.field_104435_c
		// @24: goto @49
		// @27: astore_1
		// @28: aload_1
		// @29: new java.lang.StringBuilder
		// @2C: dup
		// @2D: invokespecial java.lang.StringBuilder.<init>()void
		// @30: getstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @33: bipush 13 (0x0D)
		// @35: aaload
		// @36: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @39: iload_0
		// @3A: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @3D: bipush 41 (0x29)
		// @3F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @42: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @45: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @48: athrow
		// @49: return
	}
	
	static
	{
		// @00: bipush 14 (0x0E)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "6E\"F"
		// @09: invokestatic game.C_100080_b.func_104426_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100080_b.func_104424_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "6E!F"
		// @14: invokestatic game.C_100080_b.func_104426_z(java.lang.String)char[]
		// @17: invokestatic game.C_100080_b.func_104424_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "6E&F"
		// @1F: invokestatic game.C_100080_b.func_104426_z(java.lang.String)char[]
		// @22: invokestatic game.C_100080_b.func_104424_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc ":\u001e\t\u0002"
		// @2A: invokestatic game.C_100080_b.func_104426_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100080_b.func_104424_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "h\u0002\u0008\t\neU"
		// @35: invokestatic game.C_100080_b.func_104426_z(java.lang.String)char[]
		// @38: invokestatic game.C_100080_b.func_104424_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "h\u0002\u0008\t\ngU"
		// @40: invokestatic game.C_100080_b.func_104426_z(java.lang.String)char[]
		// @43: invokestatic game.C_100080_b.func_104424_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "h\u0002\u0008\t\nfUY\u0007Z3VVP"
		// @4C: invokestatic game.C_100080_b.func_104426_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100080_b.func_104424_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "h\u0002\u0008\t\nfU"
		// @58: invokestatic game.C_100080_b.func_104426_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100080_b.func_104424_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "h\u0002\u0008\t\ndU"
		// @64: invokestatic game.C_100080_b.func_104426_z(java.lang.String)char[]
		// @67: invokestatic game.C_100080_b.func_104424_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "/EK@J"
		// @70: invokestatic game.C_100080_b.func_104426_z(java.lang.String)char[]
		// @73: invokestatic game.C_100080_b.func_104424_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "1\u0005\u0002\u0007Y1\u000e\u0017"
		// @7C: invokestatic game.C_100080_b.func_104426_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100080_b.func_104424_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "h\u0002\u0008\t\nbU"
		// @88: invokestatic game.C_100080_b.func_104426_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100080_b.func_104424_z(char[])java.lang.String
		// @8E: aastore
		// @8F: dup
		// @90: bipush 12 (0x0C)
		// @92: ldc "6E#F"
		// @94: invokestatic game.C_100080_b.func_104426_z(java.lang.String)char[]
		// @97: invokestatic game.C_100080_b.func_104424_z(char[])java.lang.String
		// @9A: aastore
		// @9B: dup
		// @9C: bipush 13 (0x0D)
		// @9E: ldc "6E$F"
		// @A0: invokestatic game.C_100080_b.func_104426_z(java.lang.String)char[]
		// @A3: invokestatic game.C_100080_b.func_104424_z(char[])java.lang.String
		// @A6: aastore
		// @A7: putstatic java.lang.String[] game.C_100080_b.field_104437_z
		// @AA: iconst_1
		// @AB: putstatic boolean game.C_100080_b.field_104436_a
		// @AE: new game.C_100217_ao
		// @B1: dup
		// @B2: iconst_2
		// @B3: iconst_4
		// @B4: iconst_4
		// @B5: iconst_0
		// @B6: invokespecial game.C_100217_ao.<init>(int, int, int, int)void
		// @B9: putstatic game.C_100217_ao game.C_100080_b.field_104435_c
		// @BC: ldc "\u0000\u0003\u0000\u001cRt\n\u0017\u000b\u0017:\u0004E\u0018V8\u0002\u0001NC-\u001b\u0000\u001d\u0017;\rE\tV9\u000eE\u001a_5\u001fE\u0003V \u0008\rNN;\u001e\u0017NG&\u000e\u0003\u000bE1\u0005\u0006\u000bDz"
		// @BE: invokestatic game.C_100080_b.func_104426_z(java.lang.String)char[]
		// @C1: invokestatic game.C_100080_b.func_104424_z(char[])java.lang.String
		// @C4: putstatic java.lang.String game.C_100080_b.field_104432_d
		// @C7: return
	}
	
	private static char[] func_104426_z(String arg0)
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
		// @0E: bipush 55 (0x37)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104424_z(char[] arg0)
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
		// @30: bipush 84 (0x54)
		// @32: goto @46
		// @35: bipush 107 (0x6B)
		// @37: goto @46
		// @3A: bipush 101 (0x65)
		// @3C: goto @46
		// @3F: bipush 110 (0x6E)
		// @41: goto @46
		// @44: bipush 55 (0x37)
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
