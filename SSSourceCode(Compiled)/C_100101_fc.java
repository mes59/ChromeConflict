package game;

import java.util.Hashtable;

final class C_100101_fc extends C_100030_gm
{
	private boolean field_103400_P;
	private int field_103394_O;
	static C_100037_wb[] field_103405_Y;
	private int field_103398_V;
	static int field_103401_S;
	static int field_103399_Q;
	static int field_103406_X;
	static boolean field_103407_Z;
	private boolean field_103397_W;
	private int field_103403_ab;
	static C_100302_ka field_103395_U;
	private int field_103402_R;
	static boolean field_103396_T;
	private static final String[] field_103404_bb;
	
	final boolean func_102520_a(int arg0, C_100336_im arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		// @00: bipush -52 (0xCC)
		// @02: iload_3
		// @03: bipush 32 (0x20)
		// @05: isub
		// @06: bipush 52 (0x34)
		// @08: idiv
		// @09: idiv
		// @0A: istore #9
		// @0C: aload_0
		// @0D: iload_1
		// @0E: aload_2
		// @0F: bipush -49 (0xCF)
		// @11: iload #4
		// @13: iload #5
		// @15: iload #6
		// @17: iload #7
		// @19: invokespecial game.C_100030_gm.func_102520_a(int, game.C_100336_im, int, int, int, int, int)boolean
		// @1C: istore #8
		// @1E: iload #8
		// @20: ifeq @2E
		// @23: aload_0
		// @24: getfield boolean game.C_100101_fc.field_103397_W
		// @27: ifne @7B
		// @2A: goto @2E
		// @2D: athrow
		// @2E: aload_0
		// @2F: bipush -128 (0x80)
		// @31: iload_1
		// @32: iload #6
		// @34: iload #5
		// @36: iload #4
		// @38: invokevirtual game.C_100101_fc.func_102508_a(int, int, int, int, int)boolean
		// @3B: ifne @45
		// @3E: goto @42
		// @41: athrow
		// @42: iload #8
		// @44: ireturn
		// @45: bipush -2 (0xFE)
		// @47: iload #7
		// @49: iconst_m1
		// @4A: ixor
		// @4B: if_icmpne @73
		// @4E: aload_0
		// @4F: iload_1
		// @50: aload_0
		// @51: getfield int game.C_100101_fc.field_102538_m
		// @54: isub
		// @55: iload #6
		// @57: isub
		// @58: putfield int game.C_100101_fc.field_103403_ab
		// @5B: aload_0
		// @5C: iload #5
		// @5E: ineg
		// @5F: aload_0
		// @60: getfield int game.C_100101_fc.field_102541_w
		// @63: ineg
		// @64: iadd
		// @65: iload #4
		// @67: iadd
		// @68: putfield int game.C_100101_fc.field_103402_R
		// @6B: aload_0
		// @6C: putstatic game.C_100101_fc game.C_100125_tm.field_100747_o
		// @6F: goto @73
		// @72: athrow
		// @73: aload_0
		// @74: iload #7
		// @76: putfield int game.C_100101_fc.field_102532_A
		// @79: iconst_1
		// @7A: ireturn
		// @7B: iconst_1
		// @7C: ireturn
		// @7D: astore #8
		// @7F: aload #8
		// @81: new java.lang.StringBuilder
		// @84: dup
		// @85: invokespecial java.lang.StringBuilder.<init>()void
		// @88: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @8B: bipush 10 (0x0A)
		// @8D: aaload
		// @8E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @91: iload_1
		// @92: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @95: bipush 44 (0x2C)
		// @97: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9A: aload_2
		// @9B: ifnull @A7
		// @9E: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @A1: iconst_1
		// @A2: aaload
		// @A3: goto @AC
		// @A6: athrow
		// @A7: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @AA: iconst_0
		// @AB: aaload
		// @AC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AF: bipush 44 (0x2C)
		// @B1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B4: iload_3
		// @B5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B8: bipush 44 (0x2C)
		// @BA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BD: iload #4
		// @BF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C2: bipush 44 (0x2C)
		// @C4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C7: iload #5
		// @C9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CC: bipush 44 (0x2C)
		// @CE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D1: iload #6
		// @D3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D6: bipush 44 (0x2C)
		// @D8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DB: iload #7
		// @DD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @E0: bipush 41 (0x29)
		// @E2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @E8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @EB: athrow
	}
	
	public static void func_103391_a(boolean arg0)
	{
		// @00: iload_0
		// @01: iconst_1
		// @02: if_icmpeq @12
		// @05: aconst_null
		// @06: checkcast java.lang.String
		// @09: bipush -62 (0xC2)
		// @0B: invokestatic game.C_100101_fc.func_103392_a(java.lang.String, int)void
		// @0E: goto @12
		// @11: athrow
		// @12: aconst_null
		// @13: putstatic game.C_100302_ka game.C_100101_fc.field_103395_U
		// @16: aconst_null
		// @17: putstatic game.C_100037_wb[] game.C_100101_fc.field_103405_Y
		// @1A: goto @3E
		// @1D: astore_1
		// @1E: aload_1
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @29: iconst_4
		// @2A: aaload
		// @2B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2E: iload_0
		// @2F: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @32: bipush 41 (0x29)
		// @34: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @37: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3D: athrow
		// @3E: return
	}
	
	final void func_103340_h(int arg0)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: invokespecial game.C_100030_gm.func_103340_h(int)void
		// @05: aload_0
		// @06: getfield game.C_100336_im game.C_100101_fc.field_103351_J
		// @09: aload_0
		// @0A: getfield int game.C_100101_fc.field_102544_t
		// @0D: iconst_0
		// @0E: iconst_0
		// @0F: aload_0
		// @10: getfield int game.C_100101_fc.field_102537_l
		// @13: bipush -73 (0xB7)
		// @15: invokevirtual game.C_100336_im.func_102524_a(int, int, int, int, byte)void
		// @18: aload_0
		// @19: aload_0
		// @1A: getfield int game.C_100101_fc.field_102541_w
		// @1D: putfield int game.C_100101_fc.field_103394_O
		// @20: aload_0
		// @21: aload_0
		// @22: getfield int game.C_100101_fc.field_102538_m
		// @25: putfield int game.C_100101_fc.field_103398_V
		// @28: goto @4D
		// @2B: astore_2
		// @2C: aload_2
		// @2D: new java.lang.StringBuilder
		// @30: dup
		// @31: invokespecial java.lang.StringBuilder.<init>()void
		// @34: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @37: bipush 13 (0x0D)
		// @39: aaload
		// @3A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3D: iload_1
		// @3E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @41: bipush 41 (0x29)
		// @43: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @46: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @49: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4C: athrow
		// @4D: return
	}
	
	final StringBuilder func_102510_a(int arg0, byte arg1, StringBuilder arg2, Hashtable arg3)
	{
		// @00: bipush 59 (0x3B)
		// @02: bipush -42 (0xD6)
		// @04: iload_2
		// @05: isub
		// @06: bipush 63 (0x3F)
		// @08: idiv
		// @09: irem
		// @0A: istore #5
		// @0C: aload_0
		// @0D: aload #4
		// @0F: iload_1
		// @10: aload_3
		// @11: bipush -76 (0xB4)
		// @13: invokevirtual game.C_100101_fc.func_102516_a(java.util.Hashtable, int, java.lang.StringBuilder, byte)boolean
		// @16: ifeq @79
		// @19: aload_0
		// @1A: bipush -123 (0x85)
		// @1C: aload_3
		// @1D: iload_1
		// @1E: aload #4
		// @20: invokevirtual game.C_100101_fc.func_102518_a(byte, java.lang.StringBuilder, int, java.util.Hashtable)void
		// @23: aload_0
		// @24: aload #4
		// @26: iconst_1
		// @27: iload_1
		// @28: aload_3
		// @29: invokevirtual game.C_100101_fc.func_103333_a(java.util.Hashtable, int, int, java.lang.StringBuilder)void
		// @2C: aload_3
		// @2D: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @30: iconst_5
		// @31: aaload
		// @32: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35: aload_0
		// @36: getfield boolean game.C_100101_fc.field_103400_P
		// @39: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @3C: pop
		// @3D: ldc 2147483647 (0x7fffffff)
		// @3F: aload_0
		// @40: getfield int game.C_100101_fc.field_103398_V
		// @43: if_icmpeq @79
		// @46: goto @4A
		// @49: athrow
		// @4A: aload_0
		// @4B: getfield int game.C_100101_fc.field_103394_O
		// @4E: ldc 2147483647 (0x7fffffff)
		// @50: if_icmpne @5B
		// @53: goto @57
		// @56: athrow
		// @57: goto @79
		// @5A: athrow
		// @5B: aload_3
		// @5C: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @5F: bipush 6 (0x06)
		// @61: aaload
		// @62: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @65: aload_0
		// @66: getfield int game.C_100101_fc.field_103398_V
		// @69: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6C: bipush 44 (0x2C)
		// @6E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @71: aload_0
		// @72: getfield int game.C_100101_fc.field_103394_O
		// @75: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @78: pop
		// @79: aload_3
		// @7A: areturn
		// @7B: astore #5
		// @7D: aload #5
		// @7F: new java.lang.StringBuilder
		// @82: dup
		// @83: invokespecial java.lang.StringBuilder.<init>()void
		// @86: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @89: bipush 7 (0x07)
		// @8B: aaload
		// @8C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8F: iload_1
		// @90: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @93: bipush 44 (0x2C)
		// @95: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @98: iload_2
		// @99: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9C: bipush 44 (0x2C)
		// @9E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A1: aload_3
		// @A2: ifnull @AE
		// @A5: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @A8: iconst_1
		// @A9: aaload
		// @AA: goto @B3
		// @AD: athrow
		// @AE: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @B1: iconst_0
		// @B2: aaload
		// @B3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B6: bipush 44 (0x2C)
		// @B8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BB: aload #4
		// @BD: ifnull @C9
		// @C0: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @C3: iconst_1
		// @C4: aaload
		// @C5: goto @CE
		// @C8: athrow
		// @C9: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @CC: iconst_0
		// @CD: aaload
		// @CE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D1: bipush 41 (0x29)
		// @D3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D9: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @DC: athrow
	}
	
	private C_100101_fc(int arg0, int arg1, int arg2, int arg3, C_100326_ic arg4, C_100337_in arg5, C_100336_im arg6, boolean arg7, boolean arg8)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iload_2
		// @03: iload_3
		// @04: iload #4
		// @06: aload #5
		// @08: aload #6
		// @0A: invokespecial game.C_100030_gm.<init>(int, int, int, int, game.C_100326_ic, game.C_100337_in)void
		// @0D: aload_0
		// @0E: ldc 2147483647 (0x7fffffff)
		// @10: putfield int game.C_100101_fc.field_103398_V
		// @13: aload_0
		// @14: ldc 2147483647 (0x7fffffff)
		// @16: putfield int game.C_100101_fc.field_103394_O
		// @19: aload_0
		// @1A: iload #8
		// @1C: putfield boolean game.C_100101_fc.field_103400_P
		// @1F: aload_0
		// @20: iload #9
		// @22: putfield boolean game.C_100101_fc.field_103397_W
		// @25: aload_0
		// @26: aload #7
		// @28: putfield game.C_100336_im game.C_100101_fc.field_103351_J
		// @2B: goto @D2
		// @2E: astore #10
		// @30: aload #10
		// @32: new java.lang.StringBuilder
		// @35: dup
		// @36: invokespecial java.lang.StringBuilder.<init>()void
		// @39: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @3C: iconst_2
		// @3D: aaload
		// @3E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @41: iload_1
		// @42: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @45: bipush 44 (0x2C)
		// @47: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4A: iload_2
		// @4B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4E: bipush 44 (0x2C)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: iload_3
		// @54: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @57: bipush 44 (0x2C)
		// @59: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C: iload #4
		// @5E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @61: bipush 44 (0x2C)
		// @63: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @66: aload #5
		// @68: ifnull @74
		// @6B: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @6E: iconst_1
		// @6F: aaload
		// @70: goto @79
		// @73: athrow
		// @74: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @77: iconst_0
		// @78: aaload
		// @79: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7C: bipush 44 (0x2C)
		// @7E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @81: aload #6
		// @83: ifnull @8F
		// @86: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @89: iconst_1
		// @8A: aaload
		// @8B: goto @94
		// @8E: athrow
		// @8F: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @92: iconst_0
		// @93: aaload
		// @94: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @97: bipush 44 (0x2C)
		// @99: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9C: aload #7
		// @9E: ifnull @AA
		// @A1: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @A4: iconst_1
		// @A5: aaload
		// @A6: goto @AF
		// @A9: athrow
		// @AA: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @AD: iconst_0
		// @AE: aaload
		// @AF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B2: bipush 44 (0x2C)
		// @B4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B7: iload #8
		// @B9: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @BC: bipush 44 (0x2C)
		// @BE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C1: iload #9
		// @C3: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @C6: bipush 41 (0x29)
		// @C8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CE: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D1: athrow
		// @D2: return
	}
	
	final void func_102519_a(byte arg0, int arg1, int arg2, int arg3, C_100336_im arg4, int arg5)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iload_2
		// @03: iload_3
		// @04: iload #4
		// @06: aload #5
		// @08: iload #6
		// @0A: invokespecial game.C_100030_gm.func_102519_a(byte, int, int, int, game.C_100336_im, int)void
		// @0D: aload_0
		// @0E: iconst_0
		// @0F: putfield int game.C_100101_fc.field_102532_A
		// @12: goto @7A
		// @15: astore #7
		// @17: aload #7
		// @19: new java.lang.StringBuilder
		// @1C: dup
		// @1D: invokespecial java.lang.StringBuilder.<init>()void
		// @20: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @23: bipush 12 (0x0C)
		// @25: aaload
		// @26: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @29: iload_1
		// @2A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2D: bipush 44 (0x2C)
		// @2F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @32: iload_2
		// @33: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @36: bipush 44 (0x2C)
		// @38: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3B: iload_3
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 44 (0x2C)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: iload #4
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 44 (0x2C)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: aload #5
		// @50: ifnull @5C
		// @53: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @56: iconst_1
		// @57: aaload
		// @58: goto @61
		// @5B: athrow
		// @5C: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @5F: iconst_0
		// @60: aaload
		// @61: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @64: bipush 44 (0x2C)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: iload #6
		// @6B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6E: bipush 41 (0x29)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @76: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @79: athrow
		// @7A: return
	}
	
	final void func_102513_a(C_100336_im arg0, int arg1, int arg2, int arg3)
	{
		// @000: aload_0
		// @001: getfield game.C_100336_im game.C_100101_fc.field_103351_J
		// @004: instanceof game.C_100218_am
		// @007: ifeq @01B
		// @00A: aload_0
		// @00B: getfield game.C_100336_im game.C_100101_fc.field_103351_J
		// @00E: checkcast game.C_100218_am
		// @011: getfield boolean game.C_100218_am.field_103113_L
		// @014: ifeq @094
		// @017: goto @01B
		// @01A: athrow
		// @01B: aload_0
		// @01C: getfield int game.C_100101_fc.field_102532_A
		// @01F: iconst_1
		// @020: if_icmpne @094
		// @023: goto @027
		// @026: athrow
		// @027: aload_0
		// @028: getfield int game.C_100101_fc.field_103403_ab
		// @02B: ineg
		// @02C: getstatic int game.C_100015_wh.field_103781_g
		// @02F: iadd
		// @030: iload #4
		// @032: isub
		// @033: istore #5
		// @035: iload_2
		// @036: ineg
		// @037: getstatic int game.C_100338_jc.field_105370_l
		// @03A: iadd
		// @03B: aload_0
		// @03C: getfield int game.C_100101_fc.field_103402_R
		// @03F: ineg
		// @040: iadd
		// @041: istore #6
		// @043: iload #5
		// @045: iconst_m1
		// @046: ixor
		// @047: aload_0
		// @048: getfield int game.C_100101_fc.field_102538_m
		// @04B: iconst_m1
		// @04C: ixor
		// @04D: if_icmpne @05D
		// @050: iload #6
		// @052: aload_0
		// @053: getfield int game.C_100101_fc.field_102541_w
		// @056: if_icmpeq @08E
		// @059: goto @05D
		// @05C: athrow
		// @05D: aload_0
		// @05E: iload #6
		// @060: putfield int game.C_100101_fc.field_102541_w
		// @063: aload_0
		// @064: iload #5
		// @066: putfield int game.C_100101_fc.field_102538_m
		// @069: aload_0
		// @06A: getfield game.C_100337_in game.C_100101_fc.field_102543_u
		// @06D: instanceof game.C_100262_ma
		// @070: ifne @07B
		// @073: goto @077
		// @076: athrow
		// @077: goto @08E
		// @07A: athrow
		// @07B: aload_0
		// @07C: getfield game.C_100337_in game.C_100101_fc.field_102543_u
		// @07F: checkcast game.C_100262_ma
		// @082: aload_0
		// @083: iload_2
		// @084: sipush -5727 (0xE9A1)
		// @087: iload #4
		// @089: invokeinterface game.C_100262_ma.func_103098_a(game.C_100101_fc, int, int, int)void
		// @08E: getstatic int game.SteelSentinels.field_105275_O
		// @091: ifeq @136
		// @094: aload_0
		// @095: getfield boolean game.C_100101_fc.field_103400_P
		// @098: ifne @0A3
		// @09B: goto @09F
		// @09E: athrow
		// @09F: goto @136
		// @0A2: athrow
		// @0A3: aload_0
		// @0A4: getfield int game.C_100101_fc.field_102538_m
		// @0A7: aload_0
		// @0A8: getfield int game.C_100101_fc.field_103398_V
		// @0AB: if_icmpeq @0E9
		// @0AE: aload_0
		// @0AF: getfield int game.C_100101_fc.field_102538_m
		// @0B2: ineg
		// @0B3: aload_0
		// @0B4: getfield int game.C_100101_fc.field_103398_V
		// @0B7: iadd
		// @0B8: istore #5
		// @0BA: aload_0
		// @0BB: dup
		// @0BC: getfield int game.C_100101_fc.field_102538_m
		// @0BF: iload #5
		// @0C1: invokestatic java.lang.Math.abs(int)int
		// @0C4: iconst_m1
		// @0C5: ixor
		// @0C6: bipush -3 (0xFD)
		// @0C8: if_icmplt @0E0
		// @0CB: iload #5
		// @0CD: iconst_m1
		// @0CE: ixor
		// @0CF: iconst_m1
		// @0D0: if_icmplt @0DC
		// @0D3: goto @0D7
		// @0D6: athrow
		// @0D7: iconst_m1
		// @0D8: goto @0E5
		// @0DB: athrow
		// @0DC: iconst_1
		// @0DD: goto @0E5
		// @0E0: iload #5
		// @0E2: ldc 710274561 (0x2a55ee01)
		// @0E4: ishr
		// @0E5: iadd
		// @0E6: putfield int game.C_100101_fc.field_102538_m
		// @0E9: aload_0
		// @0EA: getfield int game.C_100101_fc.field_103394_O
		// @0ED: iconst_m1
		// @0EE: ixor
		// @0EF: aload_0
		// @0F0: getfield int game.C_100101_fc.field_102541_w
		// @0F3: iconst_m1
		// @0F4: ixor
		// @0F5: if_icmpne @0FC
		// @0F8: goto @136
		// @0FB: athrow
		// @0FC: aload_0
		// @0FD: getfield int game.C_100101_fc.field_103394_O
		// @100: aload_0
		// @101: getfield int game.C_100101_fc.field_102541_w
		// @104: isub
		// @105: istore #5
		// @107: aload_0
		// @108: dup
		// @109: getfield int game.C_100101_fc.field_102541_w
		// @10C: iload #5
		// @10E: invokestatic java.lang.Math.abs(int)int
		// @111: iconst_m1
		// @112: ixor
		// @113: bipush -3 (0xFD)
		// @115: if_icmplt @12D
		// @118: iconst_m1
		// @119: iload #5
		// @11B: iconst_m1
		// @11C: ixor
		// @11D: if_icmple @129
		// @120: goto @124
		// @123: athrow
		// @124: iconst_1
		// @125: goto @132
		// @128: athrow
		// @129: iconst_m1
		// @12A: goto @132
		// @12D: iload #5
		// @12F: ldc -1745422047 (0x97f6f921)
		// @131: ishr
		// @132: iadd
		// @133: putfield int game.C_100101_fc.field_102541_w
		// @136: aload_0
		// @137: aload_1
		// @138: iload_2
		// @139: iload_3
		// @13A: iload #4
		// @13C: invokespecial game.C_100030_gm.func_102513_a(game.C_100336_im, int, int, int)void
		// @13F: goto @193
		// @142: astore #5
		// @144: aload #5
		// @146: new java.lang.StringBuilder
		// @149: dup
		// @14A: invokespecial java.lang.StringBuilder.<init>()void
		// @14D: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @150: bipush 11 (0x0B)
		// @152: aaload
		// @153: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @156: aload_1
		// @157: ifnull @163
		// @15A: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @15D: iconst_1
		// @15E: aaload
		// @15F: goto @168
		// @162: athrow
		// @163: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @166: iconst_0
		// @167: aaload
		// @168: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16B: bipush 44 (0x2C)
		// @16D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @170: iload_2
		// @171: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @174: bipush 44 (0x2C)
		// @176: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @179: iload_3
		// @17A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @17D: bipush 44 (0x2C)
		// @17F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @182: iload #4
		// @184: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @187: bipush 41 (0x29)
		// @189: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @18C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @18F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @192: athrow
		// @193: return
	}
	
	static final void func_103389_a(C_100240_oj arg0, int arg1)
	{
		// @000: aload_0
		// @001: getfield java.lang.String game.C_100240_oj.field_106321_m
		// @004: aload_0
		// @005: getfield int game.C_100240_oj.field_106317_a
		// @008: aload_0
		// @009: getfield long game.C_100240_oj.field_106316_c
		// @00C: bipush 109 (0x6D)
		// @00E: bipush -2 (0xFE)
		// @010: aload_0
		// @011: getfield int game.C_100240_oj.field_106317_a
		// @014: iconst_m1
		// @015: ixor
		// @016: if_icmpeq @01E
		// @019: iconst_0
		// @01A: goto @022
		// @01D: athrow
		// @01E: aload_0
		// @01F: getfield int game.C_100240_oj.field_106324_h
		// @022: aconst_null
		// @023: aload_0
		// @024: getfield java.lang.String game.C_100240_oj.field_106313_d
		// @027: aload_0
		// @028: getfield game.C_100302_ka game.C_100240_oj.field_106314_e
		// @02B: aconst_null
		// @02C: invokestatic game.C_100096_un.func_104559_a(java.lang.String, int, long, int, int, int[], java.lang.String, game.C_100302_ka, game.C_100115_ej)void
		// @02F: iconst_0
		// @030: aload_0
		// @031: getfield int game.C_100240_oj.field_106317_a
		// @034: if_icmpne @08E
		// @037: iconst_1
		// @038: invokestatic game.C_100338_jc.func_105360_a(int)boolean
		// @03B: ifne @08E
		// @03E: goto @042
		// @041: athrow
		// @042: aconst_null
		// @043: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @046: if_acmpne @08E
		// @049: goto @04D
		// @04C: athrow
		// @04D: aconst_null
		// @04E: getstatic game.C_100211_qd game.SteelSentinels.field_105274_N
		// @051: if_acmpeq @05C
		// @054: goto @058
		// @057: athrow
		// @058: goto @08E
		// @05B: athrow
		// @05C: getstatic boolean game.C_100164_se.field_105449_g
		// @05F: ifeq @066
		// @062: goto @07A
		// @065: athrow
		// @066: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @069: astore_2
		// @06A: getstatic java.lang.String game.C_100017_wj.field_103819_c
		// @06D: astore_3
		// @06E: aload_2
		// @06F: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @072: bipush 87 (0x57)
		// @074: bipush 14 (0x0E)
		// @076: aload_3
		// @077: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @07A: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @07D: astore_2
		// @07E: getstatic java.lang.String game.C_100131_te.field_100757_q
		// @081: astore_3
		// @082: aload_2
		// @083: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @086: bipush 104 (0x68)
		// @088: bipush 20 (0x14)
		// @08A: aload_3
		// @08B: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @08E: bipush -2 (0xFE)
		// @090: aload_0
		// @091: getfield int game.C_100240_oj.field_106317_a
		// @094: iconst_m1
		// @095: ixor
		// @096: if_icmpne @0FB
		// @099: iconst_1
		// @09A: invokestatic game.C_100338_jc.func_105360_a(int)boolean
		// @09D: ifne @0FB
		// @0A0: goto @0A4
		// @0A3: athrow
		// @0A4: aconst_null
		// @0A5: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @0A8: if_acmpeq @0FB
		// @0AB: goto @0AF
		// @0AE: athrow
		// @0AF: aload_0
		// @0B0: getfield int game.C_100240_oj.field_106324_h
		// @0B3: iconst_m1
		// @0B4: ixor
		// @0B5: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @0B8: iconst_1
		// @0B9: invokevirtual game.C_100211_qd.func_102127_b(boolean)int
		// @0BC: iconst_m1
		// @0BD: ixor
		// @0BE: if_icmpne @0FB
		// @0C1: goto @0C5
		// @0C4: athrow
		// @0C5: getstatic boolean game.C_100164_se.field_105449_g
		// @0C8: ifeq @0D3
		// @0CB: goto @0CF
		// @0CE: athrow
		// @0CF: goto @0E7
		// @0D2: athrow
		// @0D3: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @0D6: astore_2
		// @0D7: getstatic java.lang.String game.C_100090_l.field_104498_a
		// @0DA: astore_3
		// @0DB: aload_2
		// @0DC: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @0DF: bipush 96 (0x60)
		// @0E1: bipush 14 (0x0E)
		// @0E3: aload_3
		// @0E4: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @0E7: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @0EA: astore_2
		// @0EB: getstatic java.lang.String game.C_100234_ob.field_106279_a
		// @0EE: astore_3
		// @0EF: aload_2
		// @0F0: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @0F3: bipush 97 (0x61)
		// @0F5: bipush 20 (0x14)
		// @0F7: aload_3
		// @0F8: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @0FB: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @0FE: iconst_m1
		// @0FF: invokevirtual game.C_100022_hf.func_103888_c(int)void
		// @102: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @105: iconst_0
		// @106: iconst_0
		// @107: invokevirtual game.C_100022_hf.func_103884_a(boolean, boolean)void
		// @10A: iload_1
		// @10B: bipush 119 (0x77)
		// @10D: if_icmpgt @111
		// @110: return
		// @111: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @114: aload_0
		// @115: getfield int game.C_100240_oj.field_106317_a
		// @118: aload_0
		// @119: getfield int[] game.C_100240_oj.field_106326_p
		// @11C: iconst_1
		// @11D: invokevirtual game.C_100022_hf.func_103883_a(int, int[], boolean)void
		// @120: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @123: bipush 8 (0x08)
		// @125: invokevirtual game.C_100022_hf.func_103875_b(int)void
		// @128: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @12B: aload_0
		// @12C: bipush 13 (0x0D)
		// @12E: invokevirtual game.C_100022_hf.func_103878_a(game.C_100240_oj, int)void
		// @131: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @134: astore_2
		// @135: getstatic int game.C_100340_je.field_102981_m
		// @138: istore_3
		// @139: getstatic int game.C_100125_tm.field_100745_p
		// @13C: istore #4
		// @13E: aload_2
		// @13F: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @142: iload_3
		// @143: iload #4
		// @145: iconst_0
		// @146: bipush 76 (0x4C)
		// @148: iconst_0
		// @149: invokevirtual game.C_100270_mi.func_102261_b(int, int, int, int, int)void
		// @14C: goto @18A
		// @14F: astore_2
		// @150: aload_2
		// @151: new java.lang.StringBuilder
		// @154: dup
		// @155: invokespecial java.lang.StringBuilder.<init>()void
		// @158: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @15B: iconst_3
		// @15C: aaload
		// @15D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @160: aload_0
		// @161: ifnull @16D
		// @164: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @167: iconst_1
		// @168: aaload
		// @169: goto @172
		// @16C: athrow
		// @16D: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @170: iconst_0
		// @171: aaload
		// @172: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @175: bipush 44 (0x2C)
		// @177: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17A: iload_1
		// @17B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @17E: bipush 41 (0x29)
		// @180: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @183: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @186: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @189: athrow
		// @18A: return
	}
	
	static final String func_103393_a(byte arg0, char arg1)
	{
		// @00: iload_0
		// @01: bipush 17 (0x11)
		// @03: if_icmpgt @0E
		// @06: iconst_1
		// @07: putstatic boolean game.C_100101_fc.field_103396_T
		// @0A: goto @0E
		// @0D: athrow
		// @0E: iload_1
		// @0F: invokestatic java.lang.String.valueOf(char)java.lang.String
		// @12: areturn
		// @13: astore_2
		// @14: aload_2
		// @15: new java.lang.StringBuilder
		// @18: dup
		// @19: invokespecial java.lang.StringBuilder.<init>()void
		// @1C: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @1F: bipush 9 (0x09)
		// @21: aaload
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: iload_0
		// @26: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @29: bipush 44 (0x2C)
		// @2B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E: iload_1
		// @2F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @32: bipush 41 (0x29)
		// @34: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @37: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3D: athrow
	}
	
	static final void func_103392_a(String arg0, int arg1)
	{
		// @00: aload_0
		// @01: putstatic java.lang.String game.C_100216_aj.field_104449_B
		// @04: iconst_1
		// @05: bipush 12 (0x0C)
		// @07: invokestatic game.C_100152_bd.func_105184_a(boolean, int)void
		// @0A: iload_1
		// @0B: bipush -47 (0xD1)
		// @0D: if_icmple @15
		// @10: bipush -95 (0xA1)
		// @12: putstatic int game.C_100101_fc.field_103401_S
		// @15: goto @54
		// @18: astore_2
		// @19: aload_2
		// @1A: new java.lang.StringBuilder
		// @1D: dup
		// @1E: invokespecial java.lang.StringBuilder.<init>()void
		// @21: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @24: bipush 8 (0x08)
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: aload_0
		// @2B: ifnull @37
		// @2E: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @31: iconst_1
		// @32: aaload
		// @33: goto @3C
		// @36: athrow
		// @37: getstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @3A: iconst_0
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: bipush 44 (0x2C)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: iload_1
		// @45: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @48: bipush 41 (0x29)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @50: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @53: athrow
		// @54: return
	}
	
	static
	{
		// @00: bipush 14 (0x0E)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\u0008nGj"
		// @09: invokestatic game.C_100101_fc.func_103390_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100101_fc.func_103388_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u001d5\u0005(\u0002"
		// @14: invokestatic game.C_100101_fc.func_103390_z(java.lang.String)char[]
		// @17: invokestatic game.C_100101_fc.func_103388_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u0000x\u0005:\u0016\u0008r_8W"
		// @1F: invokestatic game.C_100101_fc.func_103390_z(java.lang.String)char[]
		// @22: invokestatic game.C_100101_fc.func_103388_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\u0000x\u0005GW"
		// @2A: invokestatic game.C_100101_fc.func_103390_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100101_fc.func_103388_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\u0000x\u0005CW"
		// @35: invokestatic game.C_100101_fc.func_103390_z(java.lang.String)char[]
		// @38: invokestatic game.C_100101_fc.func_103388_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "FiNp\u001a\u0014o\u0016"
		// @40: invokestatic game.C_100101_fc.func_103390_z(java.lang.String)char[]
		// @43: invokestatic game.C_100101_fc.func_103388_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "FoD&"
		// @4C: invokestatic game.C_100101_fc.func_103390_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100101_fc.func_103388_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "\u0000x\u0005G>N"
		// @58: invokestatic game.C_100101_fc.func_103390_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100101_fc.func_103388_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "\u0000x\u0005DW"
		// @64: invokestatic game.C_100101_fc.func_103390_z(java.lang.String)char[]
		// @67: invokestatic game.C_100101_fc.func_103388_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "\u0000x\u0005BW"
		// @70: invokestatic game.C_100101_fc.func_103390_z(java.lang.String)char[]
		// @73: invokestatic game.C_100101_fc.func_103388_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "\u0000x\u0005SW"
		// @7C: invokestatic game.C_100101_fc.func_103390_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100101_fc.func_103388_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "\u0000x\u0005WW"
		// @88: invokestatic game.C_100101_fc.func_103390_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100101_fc.func_103388_z(char[])java.lang.String
		// @8E: aastore
		// @8F: dup
		// @90: bipush 12 (0x0C)
		// @92: ldc "\u0000x\u0005RW"
		// @94: invokestatic game.C_100101_fc.func_103390_z(java.lang.String)char[]
		// @97: invokestatic game.C_100101_fc.func_103388_z(char[])java.lang.String
		// @9A: aastore
		// @9B: dup
		// @9C: bipush 13 (0x0D)
		// @9E: ldc "\u0000x\u0005M>N"
		// @A0: invokestatic game.C_100101_fc.func_103390_z(java.lang.String)char[]
		// @A3: invokestatic game.C_100101_fc.func_103388_z(char[])java.lang.String
		// @A6: aastore
		// @A7: putstatic java.lang.String[] game.C_100101_fc.field_103404_bb
		// @AA: iconst_0
		// @AB: putstatic boolean game.C_100101_fc.field_103407_Z
		// @AE: iconst_1
		// @AF: putstatic boolean game.C_100101_fc.field_103396_T
		// @B2: return
	}
	
	private static char[] func_103390_z(String arg0)
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
		// @0E: bipush 127 (0x7F)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103388_z(char[] arg0)
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
		// @30: bipush 102 (0x66)
		// @32: goto @46
		// @35: bipush 27 (0x1B)
		// @37: goto @46
		// @3A: bipush 43 (0x2B)
		// @3C: goto @46
		// @3F: bipush 6 (0x06)
		// @41: goto @46
		// @44: bipush 127 (0x7F)
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
