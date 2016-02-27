package game;

import java.applet.Applet;

final class C_100183_cd extends C_100030_gm
{
	static int field_103415_U;
	static StringBuilder field_103422_O;
	int field_103418_Q;
	static int field_103420_S;
	static int[] field_103419_P;
	static String field_103416_T;
	static String field_103421_R;
	private static final String[] field_103417_V;
	
	public C_100183_cd()
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: iconst_0
		// @03: iconst_0
		// @04: iconst_0
		// @05: aconst_null
		// @06: aconst_null
		// @07: invokespecial game.C_100030_gm.<init>(int, int, int, int, game.C_100326_ic, game.C_100337_in)void
		// @0A: aload_0
		// @0B: sipush 256 (0x0100)
		// @0E: putfield int game.C_100183_cd.field_103418_Q
		// @11: goto @1F
		// @14: astore_1
		// @15: aload_1
		// @16: getstatic java.lang.String[] game.C_100183_cd.field_103417_V
		// @19: iconst_5
		// @1A: aaload
		// @1B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1E: athrow
		// @1F: return
	}
	
	C_100183_cd(C_100336_im arg0)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: getfield int game.C_100336_im.field_102538_m
		// @05: aload_1
		// @06: getfield int game.C_100336_im.field_102541_w
		// @09: aload_1
		// @0A: getfield int game.C_100336_im.field_102537_l
		// @0D: aload_1
		// @0E: getfield int game.C_100336_im.field_102544_t
		// @11: aconst_null
		// @12: aconst_null
		// @13: invokespecial game.C_100030_gm.<init>(int, int, int, int, game.C_100326_ic, game.C_100337_in)void
		// @16: aload_1
		// @17: aload_0
		// @18: getfield int game.C_100183_cd.field_102544_t
		// @1B: iconst_0
		// @1C: iconst_0
		// @1D: aload_0
		// @1E: getfield int game.C_100183_cd.field_102537_l
		// @21: bipush 72 (0x48)
		// @23: invokevirtual game.C_100336_im.func_102524_a(int, int, int, int, byte)void
		// @26: aload_0
		// @27: aload_1
		// @28: putfield game.C_100336_im game.C_100183_cd.field_103351_J
		// @2B: aload_0
		// @2C: sipush 256 (0x0100)
		// @2F: putfield int game.C_100183_cd.field_103418_Q
		// @32: goto @67
		// @35: astore_2
		// @36: aload_2
		// @37: new java.lang.StringBuilder
		// @3A: dup
		// @3B: invokespecial java.lang.StringBuilder.<init>()void
		// @3E: getstatic java.lang.String[] game.C_100183_cd.field_103417_V
		// @41: iconst_1
		// @42: aaload
		// @43: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @46: aload_1
		// @47: ifnull @53
		// @4A: getstatic java.lang.String[] game.C_100183_cd.field_103417_V
		// @4D: iconst_0
		// @4E: aaload
		// @4F: goto @58
		// @52: athrow
		// @53: getstatic java.lang.String[] game.C_100183_cd.field_103417_V
		// @56: iconst_2
		// @57: aaload
		// @58: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5B: bipush 41 (0x29)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @63: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @66: athrow
		// @67: return
	}
	
	public static void func_103411_k(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic int[] game.C_100183_cd.field_103419_P
		// @04: aconst_null
		// @05: putstatic java.lang.StringBuilder game.C_100183_cd.field_103422_O
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100183_cd.field_103416_T
		// @0C: iload_0
		// @0D: bipush 103 (0x67)
		// @0F: if_icmpgt @1E
		// @12: bipush -116 (0x8C)
		// @14: bipush 51 (0x33)
		// @16: invokestatic game.C_100183_cd.func_103412_a(int, char)char
		// @19: pop
		// @1A: goto @1E
		// @1D: athrow
		// @1E: aconst_null
		// @1F: putstatic java.lang.String game.C_100183_cd.field_103421_R
		// @22: goto @46
		// @25: astore_1
		// @26: aload_1
		// @27: new java.lang.StringBuilder
		// @2A: dup
		// @2B: invokespecial java.lang.StringBuilder.<init>()void
		// @2E: getstatic java.lang.String[] game.C_100183_cd.field_103417_V
		// @31: iconst_3
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: iload_0
		// @37: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3A: bipush 41 (0x29)
		// @3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @42: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @45: athrow
		// @46: return
	}
	
	static final int func_103414_b(int arg0, byte arg1)
	{
		// @00: iconst_m1
		// @01: iload_0
		// @02: iconst_m1
		// @03: ixor
		// @04: if_icmpne @09
		// @07: iconst_0
		// @08: ireturn
		// @09: bipush 55 (0x37)
		// @0B: iload_0
		// @0C: if_icmpne @11
		// @0F: iconst_1
		// @10: ireturn
		// @11: bipush 57 (0x39)
		// @13: iload_0
		// @14: if_icmpeq @1B
		// @17: goto @1D
		// @1A: athrow
		// @1B: iconst_2
		// @1C: ireturn
		// @1D: bipush -63 (0xC1)
		// @1F: iload_0
		// @20: iconst_m1
		// @21: ixor
		// @22: if_icmpne @27
		// @25: iconst_3
		// @26: ireturn
		// @27: iload_0
		// @28: iconst_m1
		// @29: ixor
		// @2A: bipush -66 (0xBE)
		// @2C: if_icmpne @31
		// @2F: iconst_4
		// @30: ireturn
		// @31: iload_1
		// @32: bipush 59 (0x3B)
		// @34: if_icmpeq @43
		// @37: bipush -10 (0xF6)
		// @39: bipush 91 (0x5B)
		// @3B: invokestatic game.C_100183_cd.func_103412_a(int, char)char
		// @3E: pop
		// @3F: goto @43
		// @42: athrow
		// @43: bipush -70 (0xBA)
		// @45: iload_0
		// @46: iconst_m1
		// @47: ixor
		// @48: if_icmpeq @4F
		// @4B: goto @51
		// @4E: athrow
		// @4F: iconst_5
		// @50: ireturn
		// @51: iload_0
		// @52: iconst_m1
		// @53: ixor
		// @54: bipush -73 (0xB7)
		// @56: if_icmpeq @5D
		// @59: goto @60
		// @5C: athrow
		// @5D: bipush 6 (0x06)
		// @5F: ireturn
		// @60: bipush -76 (0xB4)
		// @62: iload_0
		// @63: iconst_m1
		// @64: ixor
		// @65: if_icmpne @6B
		// @68: bipush 7 (0x07)
		// @6A: ireturn
		// @6B: bipush 79 (0x4F)
		// @6D: iload_0
		// @6E: if_icmpne @74
		// @71: bipush 8 (0x08)
		// @73: ireturn
		// @74: iload_0
		// @75: iconst_m1
		// @76: ixor
		// @77: bipush -85 (0xAB)
		// @79: if_icmpeq @80
		// @7C: goto @83
		// @7F: athrow
		// @80: bipush 9 (0x09)
		// @82: ireturn
		// @83: iload_0
		// @84: iconst_m1
		// @85: ixor
		// @86: bipush -89 (0xA7)
		// @88: if_icmpeq @8F
		// @8B: goto @92
		// @8E: athrow
		// @8F: bipush 10 (0x0A)
		// @91: ireturn
		// @92: bipush -93 (0xA3)
		// @94: iload_0
		// @95: iconst_m1
		// @96: ixor
		// @97: if_icmpeq @9E
		// @9A: goto @A1
		// @9D: athrow
		// @9E: bipush 11 (0x0B)
		// @A0: ireturn
		// @A1: bipush -110 (0x92)
		// @A3: iload_0
		// @A4: iconst_m1
		// @A5: ixor
		// @A6: if_icmpeq @AD
		// @A9: goto @B0
		// @AC: athrow
		// @AD: bipush 12 (0x0C)
		// @AF: ireturn
		// @B0: iload_0
		// @B1: iconst_m1
		// @B2: ixor
		// @B3: bipush -108 (0x94)
		// @B5: if_icmpne @BB
		// @B8: bipush 12 (0x0C)
		// @BA: ireturn
		// @BB: iload_0
		// @BC: bipush 108 (0x6C)
		// @BE: if_icmpeq @C5
		// @C1: goto @C8
		// @C4: athrow
		// @C5: bipush 12 (0x0C)
		// @C7: ireturn
		// @C8: iconst_m1
		// @C9: ireturn
		// @CA: astore_2
		// @CB: aload_2
		// @CC: new java.lang.StringBuilder
		// @CF: dup
		// @D0: invokespecial java.lang.StringBuilder.<init>()void
		// @D3: getstatic java.lang.String[] game.C_100183_cd.field_103417_V
		// @D6: iconst_4
		// @D7: aaload
		// @D8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @DB: iload_0
		// @DC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DF: bipush 44 (0x2C)
		// @E1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E4: iload_1
		// @E5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @E8: bipush 41 (0x29)
		// @EA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @ED: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @F0: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @F3: athrow
	}
	
	final void func_102528_a(int arg0, int arg1, int arg2, byte arg3)
	{
		// @00: iconst_m1
		// @01: iload_1
		// @02: iconst_m1
		// @03: ixor
		// @04: if_icmpeq @08
		// @07: return
		// @08: aload_0
		// @09: getfield game.C_100336_im game.C_100183_cd.field_103351_J
		// @0C: ifnonnull @10
		// @0F: return
		// @10: aload_0
		// @11: getfield int game.C_100183_cd.field_103418_Q
		// @14: ifeq @1A
		// @17: goto @1B
		// @1A: return
		// @1B: sipush -257 (0xFEFF)
		// @1E: aload_0
		// @1F: getfield int game.C_100183_cd.field_103418_Q
		// @22: iconst_m1
		// @23: ixor
		// @24: if_icmpne @3F
		// @27: aload_0
		// @28: getfield game.C_100336_im game.C_100183_cd.field_103351_J
		// @2B: iload_1
		// @2C: aload_0
		// @2D: getfield int game.C_100183_cd.field_102541_w
		// @30: iload_2
		// @31: iadd
		// @32: iload_3
		// @33: aload_0
		// @34: getfield int game.C_100183_cd.field_102538_m
		// @37: ineg
		// @38: isub
		// @39: bipush -127 (0x81)
		// @3B: invokevirtual game.C_100336_im.func_102528_a(int, int, int, byte)void
		// @3E: return
		// @3F: new game.C_100037_wb
		// @42: dup
		// @43: aload_0
		// @44: getfield game.C_100336_im game.C_100183_cd.field_103351_J
		// @47: getfield int game.C_100336_im.field_102537_l
		// @4A: aload_0
		// @4B: getfield game.C_100336_im game.C_100183_cd.field_103351_J
		// @4E: getfield int game.C_100336_im.field_102544_t
		// @51: invokespecial game.C_100037_wb.<init>(int, int)void
		// @54: astore #5
		// @56: iload #4
		// @58: bipush -126 (0x82)
		// @5A: if_icmple @6D
		// @5D: aload_0
		// @5E: bipush -38 (0xDA)
		// @60: bipush -112 (0x90)
		// @62: bipush -119 (0x89)
		// @64: bipush 18 (0x12)
		// @66: invokevirtual game.C_100183_cd.func_102528_a(int, int, int, byte)void
		// @69: goto @6D
		// @6C: athrow
		// @6D: aload #5
		// @6F: bipush -4 (0xFC)
		// @71: invokestatic game.C_100138_bo.func_100398_a(game.C_100037_wb, int)void
		// @74: aload_0
		// @75: getfield game.C_100336_im game.C_100183_cd.field_103351_J
		// @78: iload_1
		// @79: iconst_0
		// @7A: iconst_0
		// @7B: bipush -128 (0x80)
		// @7D: invokevirtual game.C_100336_im.func_102528_a(int, int, int, byte)void
		// @80: bipush -77 (0xB3)
		// @82: invokestatic game.C_100200_ba.func_105842_a(byte)void
		// @85: aload #5
		// @87: aload_0
		// @88: getfield int game.C_100183_cd.field_102538_m
		// @8B: iload_3
		// @8C: iadd
		// @8D: iload_2
		// @8E: aload_0
		// @8F: getfield int game.C_100183_cd.field_102541_w
		// @92: iadd
		// @93: aload_0
		// @94: getfield int game.C_100183_cd.field_103418_Q
		// @97: invokevirtual game.C_100037_wb.func_102376_d(int, int, int)void
		// @9A: goto @DD
		// @9D: astore #5
		// @9F: aload #5
		// @A1: new java.lang.StringBuilder
		// @A4: dup
		// @A5: invokespecial java.lang.StringBuilder.<init>()void
		// @A8: getstatic java.lang.String[] game.C_100183_cd.field_103417_V
		// @AB: bipush 10 (0x0A)
		// @AD: aaload
		// @AE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B1: iload_1
		// @B2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B5: bipush 44 (0x2C)
		// @B7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BA: iload_2
		// @BB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BE: bipush 44 (0x2C)
		// @C0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C3: iload_3
		// @C4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C7: bipush 44 (0x2C)
		// @C9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CC: iload #4
		// @CE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D1: bipush 41 (0x29)
		// @D3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D9: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @DC: athrow
		// @DD: return
	}
	
	static final void func_103413_f(byte arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #11
		// @005: getstatic int game.C_100336_im.field_102540_k
		// @008: istore_1
		// @009: iconst_0
		// @00A: istore_2
		// @00B: iconst_2
		// @00C: getstatic int game.C_100078_ul.field_103285_pb
		// @00F: if_icmpne @02E
		// @012: getstatic long game.C_100015_wh.field_103780_f
		// @015: lneg
		// @016: bipush 102 (0x66)
		// @018: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @01B: ladd
		// @01C: lstore_3
		// @01D: ldc2_w 10999
		// @020: lload_3
		// @021: lsub
		// @022: ldc2_w 1000
		// @025: ldiv
		// @026: l2i
		// @027: istore_2
		// @028: iload_2
		// @029: ifge @02E
		// @02C: iconst_0
		// @02D: istore_2
		// @02E: bipush -64 (0xC0)
		// @030: iload_0
		// @031: bipush -78 (0xB2)
		// @033: isub
		// @034: bipush 38 (0x26)
		// @036: idiv
		// @037: irem
		// @038: istore_3
		// @039: iconst_0
		// @03A: istore #4
		// @03C: iload #4
		// @03E: getstatic java.lang.String[] game.C_100217_ao.field_106041_m
		// @041: arraylength
		// @042: if_icmpge @242
		// @045: getstatic int[] game.C_100197_ra.field_100860_j
		// @048: iload #4
		// @04A: iaload
		// @04B: istore #5
		// @04D: iload #11
		// @04F: ifne @267
		// @052: iconst_0
		// @053: iload #5
		// @055: if_icmple @066
		// @058: goto @05C
		// @05B: athrow
		// @05C: getstatic int game.C_100050_vg.field_100636_r
		// @05F: istore #6
		// @061: iload #11
		// @063: ifeq @088
		// @066: getstatic game.C_100333_ij game.C_100102_w.field_104631_f
		// @069: getfield int game.C_100333_ij.field_107347_b
		// @06C: iconst_m1
		// @06D: ixor
		// @06E: iload #5
		// @070: iconst_m1
		// @071: ixor
		// @072: if_icmpne @083
		// @075: goto @079
		// @078: athrow
		// @079: getstatic int game.C_100137_bn.field_105037_a
		// @07C: istore #6
		// @07E: iload #11
		// @080: ifeq @088
		// @083: getstatic int game.C_100277_nc.field_106728_o
		// @086: istore #6
		// @088: getstatic java.lang.String[] game.C_100217_ao.field_106041_m
		// @08B: iload #4
		// @08D: aaload
		// @08E: astore #7
		// @090: getstatic int game.C_100078_ul.field_103285_pb
		// @093: iconst_2
		// @094: if_icmpne @16E
		// @097: iload_2
		// @098: iconst_1
		// @099: if_icmpeq @0A4
		// @09C: goto @0A0
		// @09F: athrow
		// @0A0: goto @16E
		// @0A3: athrow
		// @0A4: getstatic java.lang.String[] game.C_100341_jd.field_102648_ob
		// @0A7: arraylength
		// @0A8: getstatic java.lang.String[] game.C_100264_mg.field_106519_g
		// @0AB: arraylength
		// @0AC: if_icmple @0B7
		// @0AF: getstatic java.lang.String[] game.C_100341_jd.field_102648_ob
		// @0B2: arraylength
		// @0B3: goto @0BB
		// @0B6: athrow
		// @0B7: getstatic java.lang.String[] game.C_100264_mg.field_106519_g
		// @0BA: arraylength
		// @0BB: istore #8
		// @0BD: getstatic java.lang.String[] game.C_100342_jg.field_102723_Tb
		// @0C0: arraylength
		// @0C1: getstatic java.lang.String[] game.C_100080_b.field_104433_e
		// @0C4: arraylength
		// @0C5: if_icmple @0D0
		// @0C8: getstatic java.lang.String[] game.C_100342_jg.field_102723_Tb
		// @0CB: arraylength
		// @0CC: goto @0D4
		// @0CF: athrow
		// @0D0: getstatic java.lang.String[] game.C_100080_b.field_104433_e
		// @0D3: arraylength
		// @0D4: istore #9
		// @0D6: iload #4
		// @0D8: bipush 6 (0x06)
		// @0DA: if_icmplt @11E
		// @0DD: iload #4
		// @0DF: iconst_m1
		// @0E0: ixor
		// @0E1: iload #8
		// @0E3: bipush 6 (0x06)
		// @0E5: iadd
		// @0E6: iconst_m1
		// @0E7: ixor
		// @0E8: if_icmpgt @0F3
		// @0EB: goto @0EF
		// @0EE: athrow
		// @0EF: goto @11E
		// @0F2: athrow
		// @0F3: iconst_0
		// @0F4: getstatic java.lang.String[] game.C_100264_mg.field_106519_g
		// @0F7: arraylength
		// @0F8: iload #4
		// @0FA: bipush -6 (0xFA)
		// @0FC: iadd
		// @0FD: iadd
		// @0FE: iload #8
		// @100: isub
		// @101: if_icmpgt @11A
		// @104: getstatic java.lang.String[] game.C_100264_mg.field_106519_g
		// @107: iload #8
		// @109: ineg
		// @10A: bipush -6 (0xFA)
		// @10C: iload #4
		// @10E: iadd
		// @10F: getstatic java.lang.String[] game.C_100264_mg.field_106519_g
		// @112: arraylength
		// @113: iadd
		// @114: iadd
		// @115: aaload
		// @116: goto @11C
		// @119: athrow
		// @11A: ldc ""
		// @11C: astore #7
		// @11E: iload #4
		// @120: iconst_m1
		// @121: ixor
		// @122: iload #8
		// @124: bipush 7 (0x07)
		// @126: iadd
		// @127: iconst_m1
		// @128: ixor
		// @129: if_icmpgt @16E
		// @12C: iload #4
		// @12E: iconst_m1
		// @12F: ixor
		// @130: iload #9
		// @132: iload #8
		// @134: iadd
		// @135: bipush 7 (0x07)
		// @137: iadd
		// @138: iconst_m1
		// @139: ixor
		// @13A: if_icmple @16E
		// @13D: goto @141
		// @140: athrow
		// @141: getstatic java.lang.String[] game.C_100080_b.field_104433_e
		// @144: arraylength
		// @145: iconst_m1
		// @146: ixor
		// @147: iload #8
		// @149: ineg
		// @14A: iload #4
		// @14C: iadd
		// @14D: bipush -7 (0xF9)
		// @14F: iadd
		// @150: iconst_m1
		// @151: ixor
		// @152: if_icmpge @16A
		// @155: goto @159
		// @158: athrow
		// @159: getstatic java.lang.String[] game.C_100080_b.field_104433_e
		// @15C: bipush -7 (0xF9)
		// @15E: iload #4
		// @160: iadd
		// @161: iload #8
		// @163: ineg
		// @164: iadd
		// @165: aaload
		// @166: goto @16C
		// @169: athrow
		// @16A: ldc ""
		// @16C: astore #7
		// @16E: iload #5
		// @170: bipush -2 (0xFE)
		// @172: if_icmpne @17B
		// @175: iload_2
		// @176: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @179: astore #7
		// @17B: aload #7
		// @17D: iconst_0
		// @17E: iload #5
		// @180: if_icmpgt @188
		// @183: iconst_1
		// @184: goto @189
		// @187: athrow
		// @188: iconst_0
		// @189: iconst_1
		// @18A: invokestatic game.C_100294_ki.func_106909_a(java.lang.String, boolean, boolean)int
		// @18D: istore #8
		// @18F: iload #8
		// @191: ldc -508609887 (0xe1af3aa1)
		// @193: ishr
		// @194: ineg
		// @195: getstatic int game.C_100022_hf.field_103894_g
		// @198: iadd
		// @199: istore #9
		// @19B: iload #5
		// @19D: iflt @1F7
		// @1A0: iload #5
		// @1A2: iconst_m1
		// @1A3: ixor
		// @1A4: getstatic game.C_100333_ij game.C_100102_w.field_104631_f
		// @1A7: getfield int game.C_100333_ij.field_107347_b
		// @1AA: iconst_m1
		// @1AB: ixor
		// @1AC: if_icmpeq @1BA
		// @1AF: goto @1B3
		// @1B2: athrow
		// @1B3: getstatic game.C_100127_tl game.C_100197_ra.field_100856_n
		// @1B6: goto @1BD
		// @1B9: athrow
		// @1BA: getstatic game.C_100127_tl game.C_100160_sm.field_105415_b
		// @1BD: astore #10
		// @1BF: iload_1
		// @1C0: getstatic int game.C_100085_a.field_102575_J
		// @1C3: iadd
		// @1C4: istore_1
		// @1C5: aconst_null
		// @1C6: aload #10
		// @1C8: if_acmpne @1CF
		// @1CB: goto @1F1
		// @1CE: athrow
		// @1CF: aload #10
		// @1D1: iload #9
		// @1D3: getstatic int game.C_100314_lf.field_101381_bb
		// @1D6: ineg
		// @1D7: iadd
		// @1D8: getstatic int game.C_100200_ba.field_105850_e
		// @1DB: getstatic int game.C_100057_dd.field_104253_f
		// @1DE: ldc 390746497 (0x174a5181)
		// @1E0: ishl
		// @1E1: iadd
		// @1E2: iload_1
		// @1E3: bipush 11 (0x0B)
		// @1E5: getstatic int game.C_100314_lf.field_101381_bb
		// @1E8: ldc -1457147551 (0xa925b161)
		// @1EA: ishl
		// @1EB: iload #8
		// @1ED: iadd
		// @1EE: invokevirtual game.C_100127_tl.func_104944_a(int, int, int, int, int)void
		// @1F1: iload_1
		// @1F2: getstatic int game.C_100057_dd.field_104253_f
		// @1F5: iadd
		// @1F6: istore_1
		// @1F7: iload #5
		// @1F9: ifge @219
		// @1FC: getstatic game.C_100112_r game.C_100139_tb.field_100536_x
		// @1FF: aload #7
		// @201: iload #9
		// @203: iload_1
		// @204: getstatic int game.C_100312_ld.field_107152_g
		// @207: iadd
		// @208: iload #6
		// @20A: iconst_m1
		// @20B: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @20E: iload_1
		// @20F: getstatic int game.C_100098_h.field_104612_f
		// @212: iadd
		// @213: istore_1
		// @214: iload #11
		// @216: ifeq @23A
		// @219: getstatic game.C_100112_r game.C_100092_um.field_104531_e
		// @21C: aload #7
		// @21E: iload #9
		// @220: getstatic int game.C_100123_uc.field_104920_g
		// @223: iload_1
		// @224: iadd
		// @225: iload #6
		// @227: iconst_m1
		// @228: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @22B: iload_1
		// @22C: getstatic int game.C_100085_a.field_102575_J
		// @22F: getstatic int game.C_100057_dd.field_104253_f
		// @232: getstatic int game.C_100200_ba.field_105850_e
		// @235: ineg
		// @236: isub
		// @237: iadd
		// @238: iadd
		// @239: istore_1
		// @23A: iinc #4 +1
		// @23D: iload #11
		// @23F: ifeq @03C
		// @242: goto @267
		// @245: astore_1
		// @246: aload_1
		// @247: new java.lang.StringBuilder
		// @24A: dup
		// @24B: invokespecial java.lang.StringBuilder.<init>()void
		// @24E: getstatic java.lang.String[] game.C_100183_cd.field_103417_V
		// @251: bipush 11 (0x0B)
		// @253: aaload
		// @254: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @257: iload_0
		// @258: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @25B: bipush 41 (0x29)
		// @25D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @260: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @263: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @266: athrow
		// @267: return
	}
	
	static final void func_103408_a(byte arg0, Applet arg1)
	{
		// @00: iload_0
		// @01: bipush -126 (0x82)
		// @03: if_icmple @07
		// @06: return
		// @07: aload_1
		// @08: invokevirtual java.applet.Applet.getDocumentBase()java.net.URL
		// @0B: invokevirtual java.net.URL.getFile()java.lang.String
		// @0E: astore_2
		// @0F: aload_2
		// @10: bipush 63 (0x3F)
		// @12: invokevirtual java.lang.String.indexOf(int)int
		// @15: istore_3
		// @16: getstatic java.lang.String[] game.C_100183_cd.field_103417_V
		// @19: bipush 7 (0x07)
		// @1B: aaload
		// @1C: astore #4
		// @1E: iconst_m1
		// @1F: iload_3
		// @20: iconst_m1
		// @21: ixor
		// @22: if_icmpge @29
		// @25: goto @42
		// @28: athrow
		// @29: new java.lang.StringBuilder
		// @2C: dup
		// @2D: invokespecial java.lang.StringBuilder.<init>()void
		// @30: aload #4
		// @32: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35: aload_2
		// @36: iload_3
		// @37: invokevirtual java.lang.String.substring(int)java.lang.String
		// @3A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @40: astore #4
		// @42: new java.net.URL
		// @45: dup
		// @46: aload_1
		// @47: invokevirtual java.applet.Applet.getCodeBase()java.net.URL
		// @4A: aload #4
		// @4C: invokespecial java.net.URL.<init>(java.net.URL, java.lang.String)void
		// @4F: astore #5
		// @51: aload_1
		// @52: invokevirtual java.applet.Applet.getAppletContext()java.applet.AppletContext
		// @55: iconst_m1
		// @56: aload #5
		// @58: aload_1
		// @59: invokestatic game.C_100244_pe.func_106368_a(int, java.net.URL, java.applet.Applet)java.net.URL
		// @5C: getstatic java.lang.String[] game.C_100183_cd.field_103417_V
		// @5F: bipush 8 (0x08)
		// @61: aaload
		// @62: invokeinterface java.applet.AppletContext.showDocument(java.net.URL, java.lang.String)void
		// @67: goto @6F
		// @6A: astore_2
		// @6B: aload_2
		// @6C: invokevirtual java.lang.Exception.printStackTrace()void
		// @6F: goto @AE
		// @72: astore_2
		// @73: aload_2
		// @74: new java.lang.StringBuilder
		// @77: dup
		// @78: invokespecial java.lang.StringBuilder.<init>()void
		// @7B: getstatic java.lang.String[] game.C_100183_cd.field_103417_V
		// @7E: bipush 9 (0x09)
		// @80: aaload
		// @81: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @84: iload_0
		// @85: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @88: bipush 44 (0x2C)
		// @8A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8D: aload_1
		// @8E: ifnull @9A
		// @91: getstatic java.lang.String[] game.C_100183_cd.field_103417_V
		// @94: iconst_0
		// @95: aaload
		// @96: goto @9F
		// @99: athrow
		// @9A: getstatic java.lang.String[] game.C_100183_cd.field_103417_V
		// @9D: iconst_2
		// @9E: aaload
		// @9F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A2: bipush 41 (0x29)
		// @A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @AA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AD: athrow
		// @AE: return
	}
	
	static final char func_103412_a(int arg0, char arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore_3
		// @004: iload_0
		// @005: sipush 194 (0x00C2)
		// @008: if_icmpeq @014
		// @00B: bipush 29 (0x1D)
		// @00D: invokestatic game.C_100183_cd.func_103413_f(byte)void
		// @010: goto @014
		// @013: athrow
		// @014: iload_1
		// @015: istore_2
		// @016: iload_2
		// @017: bipush 32 (0x20)
		// @019: if_icmpne @024
		// @01C: iload_3
		// @01D: ifeq @3A6
		// @020: goto @024
		// @023: athrow
		// @024: iload_2
		// @025: iconst_m1
		// @026: ixor
		// @027: sipush -161 (0xFF5F)
		// @02A: if_icmpeq @3A6
		// @02D: goto @031
		// @030: athrow
		// @031: bipush 95 (0x5F)
		// @033: iload_2
		// @034: if_icmpeq @3A6
		// @037: goto @03B
		// @03A: athrow
		// @03B: iload_2
		// @03C: bipush 45 (0x2D)
		// @03E: if_icmpeq @3A6
		// @041: goto @045
		// @044: athrow
		// @045: bipush 91 (0x5B)
		// @047: iload_2
		// @048: if_icmpne @057
		// @04B: goto @04F
		// @04E: athrow
		// @04F: iload_3
		// @050: ifeq @3A9
		// @053: goto @057
		// @056: athrow
		// @057: bipush -94 (0xA2)
		// @059: iload_2
		// @05A: iconst_m1
		// @05B: ixor
		// @05C: if_icmpne @06B
		// @05F: goto @063
		// @062: athrow
		// @063: iload_3
		// @064: ifeq @3A9
		// @067: goto @06B
		// @06A: athrow
		// @06B: bipush -36 (0xDC)
		// @06D: iload_2
		// @06E: iconst_m1
		// @06F: ixor
		// @070: if_icmpeq @3A9
		// @073: goto @077
		// @076: athrow
		// @077: sipush -225 (0xFF1F)
		// @07A: iload_2
		// @07B: iconst_m1
		// @07C: ixor
		// @07D: if_icmpeq @3AB
		// @080: goto @084
		// @083: athrow
		// @084: iload_2
		// @085: sipush 225 (0x00E1)
		// @088: if_icmpne @097
		// @08B: goto @08F
		// @08E: athrow
		// @08F: iload_3
		// @090: ifeq @3AB
		// @093: goto @097
		// @096: athrow
		// @097: iload_2
		// @098: iconst_m1
		// @099: ixor
		// @09A: sipush -227 (0xFF1D)
		// @09D: if_icmpne @0AC
		// @0A0: goto @0A4
		// @0A3: athrow
		// @0A4: iload_3
		// @0A5: ifeq @3AB
		// @0A8: goto @0AC
		// @0AB: athrow
		// @0AC: iload_2
		// @0AD: sipush 228 (0x00E4)
		// @0B0: if_icmpne @0BF
		// @0B3: goto @0B7
		// @0B6: athrow
		// @0B7: iload_3
		// @0B8: ifeq @3AB
		// @0BB: goto @0BF
		// @0BE: athrow
		// @0BF: sipush -228 (0xFF1C)
		// @0C2: iload_2
		// @0C3: iconst_m1
		// @0C4: ixor
		// @0C5: if_icmpne @0D4
		// @0C8: goto @0CC
		// @0CB: athrow
		// @0CC: iload_3
		// @0CD: ifeq @3AB
		// @0D0: goto @0D4
		// @0D3: athrow
		// @0D4: sipush -193 (0xFF3F)
		// @0D7: iload_2
		// @0D8: iconst_m1
		// @0D9: ixor
		// @0DA: if_icmpne @0E9
		// @0DD: goto @0E1
		// @0E0: athrow
		// @0E1: iload_3
		// @0E2: ifeq @3AB
		// @0E5: goto @0E9
		// @0E8: athrow
		// @0E9: sipush -194 (0xFF3E)
		// @0EC: iload_2
		// @0ED: iconst_m1
		// @0EE: ixor
		// @0EF: if_icmpeq @3AB
		// @0F2: goto @0F6
		// @0F5: athrow
		// @0F6: iload_2
		// @0F7: sipush 194 (0x00C2)
		// @0FA: if_icmpne @109
		// @0FD: goto @101
		// @100: athrow
		// @101: iload_3
		// @102: ifeq @3AB
		// @105: goto @109
		// @108: athrow
		// @109: iload_2
		// @10A: sipush 196 (0x00C4)
		// @10D: if_icmpne @11C
		// @110: goto @114
		// @113: athrow
		// @114: iload_3
		// @115: ifeq @3AB
		// @118: goto @11C
		// @11B: athrow
		// @11C: sipush -196 (0xFF3C)
		// @11F: iload_2
		// @120: iconst_m1
		// @121: ixor
		// @122: if_icmpeq @3AB
		// @125: goto @129
		// @128: athrow
		// @129: iload_2
		// @12A: iconst_m1
		// @12B: ixor
		// @12C: sipush -233 (0xFF17)
		// @12F: if_icmpeq @3AE
		// @132: goto @136
		// @135: athrow
		// @136: iload_2
		// @137: iconst_m1
		// @138: ixor
		// @139: sipush -234 (0xFF16)
		// @13C: if_icmpeq @3AE
		// @13F: goto @143
		// @142: athrow
		// @143: sipush -235 (0xFF15)
		// @146: iload_2
		// @147: iconst_m1
		// @148: ixor
		// @149: if_icmpne @158
		// @14C: goto @150
		// @14F: athrow
		// @150: iload_3
		// @151: ifeq @3AE
		// @154: goto @158
		// @157: athrow
		// @158: iload_2
		// @159: iconst_m1
		// @15A: ixor
		// @15B: sipush -236 (0xFF14)
		// @15E: if_icmpne @16D
		// @161: goto @165
		// @164: athrow
		// @165: iload_3
		// @166: ifeq @3AE
		// @169: goto @16D
		// @16C: athrow
		// @16D: iload_2
		// @16E: sipush 200 (0x00C8)
		// @171: if_icmpeq @3AE
		// @174: goto @178
		// @177: athrow
		// @178: sipush 201 (0x00C9)
		// @17B: iload_2
		// @17C: if_icmpne @18B
		// @17F: goto @183
		// @182: athrow
		// @183: iload_3
		// @184: ifeq @3AE
		// @187: goto @18B
		// @18A: athrow
		// @18B: sipush 202 (0x00CA)
		// @18E: iload_2
		// @18F: if_icmpeq @3AE
		// @192: goto @196
		// @195: athrow
		// @196: iload_2
		// @197: sipush 203 (0x00CB)
		// @19A: if_icmpne @1A9
		// @19D: goto @1A1
		// @1A0: athrow
		// @1A1: iload_3
		// @1A2: ifeq @3AE
		// @1A5: goto @1A9
		// @1A8: athrow
		// @1A9: iload_2
		// @1AA: iconst_m1
		// @1AB: ixor
		// @1AC: sipush -238 (0xFF12)
		// @1AF: if_icmpeq @3B1
		// @1B2: goto @1B6
		// @1B5: athrow
		// @1B6: sipush -239 (0xFF11)
		// @1B9: iload_2
		// @1BA: iconst_m1
		// @1BB: ixor
		// @1BC: if_icmpeq @3B1
		// @1BF: goto @1C3
		// @1C2: athrow
		// @1C3: iload_2
		// @1C4: iconst_m1
		// @1C5: ixor
		// @1C6: sipush -240 (0xFF10)
		// @1C9: if_icmpeq @3B1
		// @1CC: goto @1D0
		// @1CF: athrow
		// @1D0: iload_2
		// @1D1: sipush 205 (0x00CD)
		// @1D4: if_icmpne @1E3
		// @1D7: goto @1DB
		// @1DA: athrow
		// @1DB: iload_3
		// @1DC: ifeq @3B1
		// @1DF: goto @1E3
		// @1E2: athrow
		// @1E3: sipush 206 (0x00CE)
		// @1E6: iload_2
		// @1E7: if_icmpeq @3B1
		// @1EA: goto @1EE
		// @1ED: athrow
		// @1EE: sipush 207 (0x00CF)
		// @1F1: iload_2
		// @1F2: if_icmpeq @3B1
		// @1F5: goto @1F9
		// @1F8: athrow
		// @1F9: iload_2
		// @1FA: sipush 242 (0x00F2)
		// @1FD: if_icmpne @20C
		// @200: goto @204
		// @203: athrow
		// @204: iload_3
		// @205: ifeq @3B4
		// @208: goto @20C
		// @20B: athrow
		// @20C: sipush -244 (0xFF0C)
		// @20F: iload_2
		// @210: iconst_m1
		// @211: ixor
		// @212: if_icmpeq @3B4
		// @215: goto @219
		// @218: athrow
		// @219: iload_2
		// @21A: iconst_m1
		// @21B: ixor
		// @21C: sipush -245 (0xFF0B)
		// @21F: if_icmpne @22E
		// @222: goto @226
		// @225: athrow
		// @226: iload_3
		// @227: ifeq @3B4
		// @22A: goto @22E
		// @22D: athrow
		// @22E: iload_2
		// @22F: iconst_m1
		// @230: ixor
		// @231: sipush -247 (0xFF09)
		// @234: if_icmpne @243
		// @237: goto @23B
		// @23A: athrow
		// @23B: iload_3
		// @23C: ifeq @3B4
		// @23F: goto @243
		// @242: athrow
		// @243: iload_2
		// @244: iconst_m1
		// @245: ixor
		// @246: sipush -246 (0xFF0A)
		// @249: if_icmpne @258
		// @24C: goto @250
		// @24F: athrow
		// @250: iload_3
		// @251: ifeq @3B4
		// @254: goto @258
		// @257: athrow
		// @258: sipush -211 (0xFF2D)
		// @25B: iload_2
		// @25C: iconst_m1
		// @25D: ixor
		// @25E: if_icmpne @26D
		// @261: goto @265
		// @264: athrow
		// @265: iload_3
		// @266: ifeq @3B4
		// @269: goto @26D
		// @26C: athrow
		// @26D: sipush 211 (0x00D3)
		// @270: iload_2
		// @271: if_icmpne @280
		// @274: goto @278
		// @277: athrow
		// @278: iload_3
		// @279: ifeq @3B4
		// @27C: goto @280
		// @27F: athrow
		// @280: iload_2
		// @281: iconst_m1
		// @282: ixor
		// @283: sipush -213 (0xFF2B)
		// @286: if_icmpeq @3B4
		// @289: goto @28D
		// @28C: athrow
		// @28D: sipush -215 (0xFF29)
		// @290: iload_2
		// @291: iconst_m1
		// @292: ixor
		// @293: if_icmpeq @3B4
		// @296: goto @29A
		// @299: athrow
		// @29A: sipush -214 (0xFF2A)
		// @29D: iload_2
		// @29E: iconst_m1
		// @29F: ixor
		// @2A0: if_icmpne @2AF
		// @2A3: goto @2A7
		// @2A6: athrow
		// @2A7: iload_3
		// @2A8: ifeq @3B4
		// @2AB: goto @2AF
		// @2AE: athrow
		// @2AF: sipush -250 (0xFF06)
		// @2B2: iload_2
		// @2B3: iconst_m1
		// @2B4: ixor
		// @2B5: if_icmpne @2C4
		// @2B8: goto @2BC
		// @2BB: athrow
		// @2BC: iload_3
		// @2BD: ifeq @3B7
		// @2C0: goto @2C4
		// @2C3: athrow
		// @2C4: iload_2
		// @2C5: iconst_m1
		// @2C6: ixor
		// @2C7: sipush -251 (0xFF05)
		// @2CA: if_icmpne @2D9
		// @2CD: goto @2D1
		// @2D0: athrow
		// @2D1: iload_3
		// @2D2: ifeq @3B7
		// @2D5: goto @2D9
		// @2D8: athrow
		// @2D9: iload_2
		// @2DA: sipush 251 (0x00FB)
		// @2DD: if_icmpne @2EC
		// @2E0: goto @2E4
		// @2E3: athrow
		// @2E4: iload_3
		// @2E5: ifeq @3B7
		// @2E8: goto @2EC
		// @2EB: athrow
		// @2EC: sipush -253 (0xFF03)
		// @2EF: iload_2
		// @2F0: iconst_m1
		// @2F1: ixor
		// @2F2: if_icmpeq @3B7
		// @2F5: goto @2F9
		// @2F8: athrow
		// @2F9: iload_2
		// @2FA: iconst_m1
		// @2FB: ixor
		// @2FC: sipush -218 (0xFF26)
		// @2FF: if_icmpeq @3B7
		// @302: goto @306
		// @305: athrow
		// @306: sipush 218 (0x00DA)
		// @309: iload_2
		// @30A: if_icmpeq @3B7
		// @30D: goto @311
		// @310: athrow
		// @311: sipush 219 (0x00DB)
		// @314: iload_2
		// @315: if_icmpne @324
		// @318: goto @31C
		// @31B: athrow
		// @31C: iload_3
		// @31D: ifeq @3B7
		// @320: goto @324
		// @323: athrow
		// @324: iload_2
		// @325: iconst_m1
		// @326: ixor
		// @327: sipush -221 (0xFF23)
		// @32A: if_icmpne @339
		// @32D: goto @331
		// @330: athrow
		// @331: iload_3
		// @332: ifeq @3B7
		// @335: goto @339
		// @338: athrow
		// @339: iload_2
		// @33A: iconst_m1
		// @33B: ixor
		// @33C: sipush -232 (0xFF18)
		// @33F: if_icmpeq @3BA
		// @342: goto @346
		// @345: athrow
		// @346: iload_2
		// @347: iconst_m1
		// @348: ixor
		// @349: sipush -200 (0xFF38)
		// @34C: if_icmpne @35B
		// @34F: goto @353
		// @352: athrow
		// @353: iload_3
		// @354: ifeq @3BA
		// @357: goto @35B
		// @35A: athrow
		// @35B: sipush -256 (0xFF00)
		// @35E: iload_2
		// @35F: iconst_m1
		// @360: ixor
		// @361: if_icmpeq @3BD
		// @364: goto @368
		// @367: athrow
		// @368: sipush -377 (0xFE87)
		// @36B: iload_2
		// @36C: iconst_m1
		// @36D: ixor
		// @36E: if_icmpeq @3BD
		// @371: goto @375
		// @374: athrow
		// @375: sipush 241 (0x00F1)
		// @378: iload_2
		// @379: if_icmpne @388
		// @37C: goto @380
		// @37F: athrow
		// @380: iload_3
		// @381: ifeq @3C0
		// @384: goto @388
		// @387: athrow
		// @388: iload_2
		// @389: sipush 209 (0x00D1)
		// @38C: if_icmpeq @3C0
		// @38F: goto @393
		// @392: athrow
		// @393: sipush 223 (0x00DF)
		// @396: iload_2
		// @397: if_icmpne @3C6
		// @39A: goto @39E
		// @39D: athrow
		// @39E: iload_3
		// @39F: ifeq @3C3
		// @3A2: goto @3A6
		// @3A5: athrow
		// @3A6: bipush 95 (0x5F)
		// @3A8: ireturn
		// @3A9: iload_1
		// @3AA: ireturn
		// @3AB: bipush 97 (0x61)
		// @3AD: ireturn
		// @3AE: bipush 101 (0x65)
		// @3B0: ireturn
		// @3B1: bipush 105 (0x69)
		// @3B3: ireturn
		// @3B4: bipush 111 (0x6F)
		// @3B6: ireturn
		// @3B7: bipush 117 (0x75)
		// @3B9: ireturn
		// @3BA: bipush 99 (0x63)
		// @3BC: ireturn
		// @3BD: bipush 121 (0x79)
		// @3BF: ireturn
		// @3C0: bipush 110 (0x6E)
		// @3C2: ireturn
		// @3C3: bipush 98 (0x62)
		// @3C5: ireturn
		// @3C6: iload_1
		// @3C7: invokestatic java.lang.Character.toLowerCase(char)char
		// @3CA: ireturn
		// @3CB: astore_2
		// @3CC: aload_2
		// @3CD: new java.lang.StringBuilder
		// @3D0: dup
		// @3D1: invokespecial java.lang.StringBuilder.<init>()void
		// @3D4: getstatic java.lang.String[] game.C_100183_cd.field_103417_V
		// @3D7: bipush 6 (0x06)
		// @3D9: aaload
		// @3DA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3DD: iload_0
		// @3DE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E1: bipush 44 (0x2C)
		// @3E3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3E6: iload_1
		// @3E7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3EA: bipush 41 (0x29)
		// @3EC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3EF: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F2: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F5: athrow
	}
	
	static
	{
		// @00: bipush 12 (0x0C)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "4XiWy"
		// @09: invokestatic game.C_100183_cd.func_103410_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100183_cd.func_103409_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc ",\u0012iEm!\u001f3G,"
		// @14: invokestatic game.C_100183_cd.func_103410_z(java.lang.String)char[]
		// @17: invokestatic game.C_100183_cd.func_103409_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "!\u0003+\u0015"
		// @1F: invokestatic game.C_100183_cd.func_103410_z(java.lang.String)char[]
		// @22: invokestatic game.C_100183_cd.func_103409_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc ",\u0012i;,"
		// @2A: invokestatic game.C_100183_cd.func_103410_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100183_cd.func_103409_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc ",\u0012i8,"
		// @35: invokestatic game.C_100183_cd.func_103410_z(java.lang.String)char[]
		// @38: invokestatic game.C_100183_cd.func_103409_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc ",\u0012iEm!\u001f3G,f"
		// @40: invokestatic game.C_100183_cd.func_103410_z(java.lang.String)char[]
		// @43: invokestatic game.C_100183_cd.func_103409_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc ",\u0012i<,"
		// @4C: invokestatic game.C_100183_cd.func_103410_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100183_cd.func_103409_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "=\u0013+\u0016e+X0\n"
		// @58: invokestatic game.C_100183_cd.func_103410_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100183_cd.func_103409_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "\u0010\u0005\"\u0015b"
		// @64: invokestatic game.C_100183_cd.func_103410_z(java.lang.String)char[]
		// @67: invokestatic game.C_100183_cd.func_103409_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc ",\u0012i=,"
		// @70: invokestatic game.C_100183_cd.func_103410_z(java.lang.String)char[]
		// @73: invokestatic game.C_100183_cd.func_103409_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc ",\u0012i:,"
		// @7C: invokestatic game.C_100183_cd.func_103410_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100183_cd.func_103409_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc ",\u0012i>,"
		// @88: invokestatic game.C_100183_cd.func_103410_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100183_cd.func_103409_z(char[])java.lang.String
		// @8E: aastore
		// @8F: putstatic java.lang.String[] game.C_100183_cd.field_103417_V
		// @92: new java.lang.StringBuilder
		// @95: dup
		// @96: bipush 80 (0x50)
		// @98: invokespecial java.lang.StringBuilder.<init>(int)void
		// @9B: putstatic java.lang.StringBuilder game.C_100183_cd.field_103422_O
		// @9E: iconst_2
		// @9F: putstatic int game.C_100183_cd.field_103420_S
		// @A2: bipush 7 (0x07)
		// @A4: newarray int[]
		// @A6: dup
		// @A7: iconst_0
		// @A8: bipush 25 (0x19)
		// @AA: iastore
		// @AB: dup
		// @AC: iconst_1
		// @AD: bipush 26 (0x1A)
		// @AF: iastore
		// @B0: dup
		// @B1: iconst_2
		// @B2: bipush 39 (0x27)
		// @B4: iastore
		// @B5: dup
		// @B6: iconst_3
		// @B7: iconst_0
		// @B8: iastore
		// @B9: dup
		// @BA: iconst_4
		// @BB: iconst_m1
		// @BC: iastore
		// @BD: dup
		// @BE: iconst_5
		// @BF: iconst_m1
		// @C0: iastore
		// @C1: dup
		// @C2: bipush 6 (0x06)
		// @C4: bipush 7 (0x07)
		// @C6: iastore
		// @C7: putstatic int[] game.C_100183_cd.field_103419_P
		// @CA: ldc "\u000c\u0017*\te&\u0011)C$s\u0015(\u00159)\u0010!\u001fb)H{\\4qJh\u001ak#H"
		// @CC: invokestatic game.C_100183_cd.func_103410_z(java.lang.String)char[]
		// @CF: invokestatic game.C_100183_cd.func_103409_z(char[])java.lang.String
		// @D2: putstatic java.lang.String game.C_100183_cd.field_103421_R
		// @D5: return
	}
	
	private static char[] func_103410_z(String arg0)
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
	
	private static String func_103409_z(char[] arg0)
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
		// @30: bipush 79 (0x4F)
		// @32: goto @45
		// @35: bipush 118 (0x76)
		// @37: goto @45
		// @3A: bipush 71 (0x47)
		// @3C: goto @45
		// @3F: bipush 121 (0x79)
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
