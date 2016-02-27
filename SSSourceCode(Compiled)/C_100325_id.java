package game;

import java.applet.Applet;

class C_100325_id extends C_100158_da
{
	static C_100098_h field_101482_p;
	static boolean field_101480_r;
	static String field_101481_q;
	static String field_101485_l;
	static int field_101487_j;
	C_100325_id field_101486_m;
	long field_101484_o;
	C_100325_id field_101483_n;
	static C_100302_ka field_101489_k;
	private static final String[] field_101488_z;
	
	final long func_101470_f(int arg0)
	{
		// @00: iload_1
		// @01: bipush 115 (0x73)
		// @03: if_icmpge @0A
		// @06: ldc2_w 127
		// @09: lreturn
		// @0A: aload_0
		// @0B: getfield long game.C_100325_id.field_101484_o
		// @0E: lreturn
		// @0F: astore_2
		// @10: aload_2
		// @11: new java.lang.StringBuilder
		// @14: dup
		// @15: invokespecial java.lang.StringBuilder.<init>()void
		// @18: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @1B: bipush 6 (0x06)
		// @1D: aaload
		// @1E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @21: iload_1
		// @22: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @25: bipush 41 (0x29)
		// @27: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @30: athrow
	}
	
	static final C_100302_ka func_101475_g(int arg0)
	{
		// @00: bipush -90 (0xA6)
		// @02: iload_0
		// @03: bipush -38 (0xDA)
		// @05: isub
		// @06: bipush 36 (0x24)
		// @08: idiv
		// @09: irem
		// @0A: istore_1
		// @0B: sipush -14277 (0xC83B)
		// @0E: invokestatic game.C_100169_co.func_105522_a(int)game.C_100302_ka
		// @11: areturn
		// @12: astore_1
		// @13: aload_1
		// @14: new java.lang.StringBuilder
		// @17: dup
		// @18: invokespecial java.lang.StringBuilder.<init>()void
		// @1B: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @1E: bipush 12 (0x0C)
		// @20: aaload
		// @21: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @24: iload_0
		// @25: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @28: bipush 41 (0x29)
		// @2A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @30: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @33: athrow
	}
	
	static final void func_101473_a(boolean arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: getstatic int[] game.C_100231_oc.field_102192_dc
		// @08: iconst_0
		// @09: iaload
		// @0A: istore_1
		// @0B: iload_0
		// @0C: iconst_1
		// @0D: if_icmpeq @1A
		// @10: bipush 78 (0x4E)
		// @12: invokestatic game.C_100325_id.func_101475_g(int)game.C_100302_ka
		// @15: pop
		// @16: goto @1A
		// @19: athrow
		// @1A: iconst_1
		// @1B: istore_2
		// @1C: iload_2
		// @1D: getstatic int[] game.C_100231_oc.field_102192_dc
		// @20: arraylength
		// @21: if_icmpge @4E
		// @24: getstatic int[] game.C_100231_oc.field_102192_dc
		// @27: iload_2
		// @28: iaload
		// @29: istore_3
		// @2A: getstatic int[] game.C_100093_fd.field_102781_W
		// @2D: iload_2
		// @2E: ldc 328673284 (0x13972804)
		// @30: ishl
		// @31: getstatic int[] game.C_100093_fd.field_102781_W
		// @34: iload_1
		// @35: iload_3
		// @36: invokestatic game.C_100120_en.func_104913_a(int[], int, int[], int, int)void
		// @39: iload_1
		// @3A: iload_3
		// @3B: iadd
		// @3C: istore_1
		// @3D: iinc #2 +1
		// @40: iload #4
		// @42: ifne @73
		// @45: iload #4
		// @47: ifeq @1C
		// @4A: goto @4E
		// @4D: athrow
		// @4E: goto @73
		// @51: astore_1
		// @52: aload_1
		// @53: new java.lang.StringBuilder
		// @56: dup
		// @57: invokespecial java.lang.StringBuilder.<init>()void
		// @5A: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @5D: bipush 7 (0x07)
		// @5F: aaload
		// @60: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @63: iload_0
		// @64: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @67: bipush 41 (0x29)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @72: athrow
		// @73: return
	}
	
	final void func_101479_c(byte arg0)
	{
		// @00: aconst_null
		// @01: aload_0
		// @02: getfield game.C_100325_id game.C_100325_id.field_101486_m
		// @05: if_acmpne @09
		// @08: return
		// @09: aload_0
		// @0A: getfield game.C_100325_id game.C_100325_id.field_101486_m
		// @0D: aload_0
		// @0E: getfield game.C_100325_id game.C_100325_id.field_101483_n
		// @11: putfield game.C_100325_id game.C_100325_id.field_101483_n
		// @14: aload_0
		// @15: getfield game.C_100325_id game.C_100325_id.field_101483_n
		// @18: aload_0
		// @19: getfield game.C_100325_id game.C_100325_id.field_101486_m
		// @1C: putfield game.C_100325_id game.C_100325_id.field_101486_m
		// @1F: aload_0
		// @20: aconst_null
		// @21: putfield game.C_100325_id game.C_100325_id.field_101486_m
		// @24: aload_0
		// @25: aconst_null
		// @26: putfield game.C_100325_id game.C_100325_id.field_101483_n
		// @29: iload_1
		// @2A: bipush 8 (0x08)
		// @2C: if_icmpeq @40
		// @2F: bipush -127 (0x81)
		// @31: aconst_null
		// @32: checkcast game.C_100037_wb[]
		// @35: bipush -4 (0xFC)
		// @37: bipush -128 (0x80)
		// @39: bipush -71 (0xB9)
		// @3B: bipush -33 (0xDF)
		// @3D: invokestatic game.C_100325_id.func_101474_a(byte, game.C_100037_wb[], int, int, int, int)void
		// @40: goto @64
		// @43: astore_2
		// @44: aload_2
		// @45: new java.lang.StringBuilder
		// @48: dup
		// @49: invokespecial java.lang.StringBuilder.<init>()void
		// @4C: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @4F: iconst_4
		// @50: aaload
		// @51: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @54: iload_1
		// @55: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @58: bipush 41 (0x29)
		// @5A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @60: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @63: athrow
		// @64: return
	}
	
	public static void func_101478_e(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100325_id.field_101481_q
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100325_id.field_101485_l
		// @08: aconst_null
		// @09: putstatic game.C_100098_h game.C_100325_id.field_101482_p
		// @0C: aconst_null
		// @0D: putstatic game.C_100302_ka game.C_100325_id.field_101489_k
		// @10: iload_0
		// @11: iconst_1
		// @12: if_icmpeq @1C
		// @15: aconst_null
		// @16: checkcast java.lang.String
		// @19: putstatic java.lang.String game.C_100325_id.field_101481_q
		// @1C: goto @41
		// @1F: astore_1
		// @20: aload_1
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @2B: bipush 11 (0x0B)
		// @2D: aaload
		// @2E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @31: iload_0
		// @32: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @35: bipush 41 (0x29)
		// @37: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @40: athrow
		// @41: return
	}
	
	final void func_101467_a(int arg0, long arg1)
	{
		// @00: aconst_null
		// @01: aload_0
		// @02: getfield game.C_100325_id game.C_100325_id.field_101486_m
		// @05: if_acmpeq @11
		// @08: new java.lang.RuntimeException
		// @0B: dup
		// @0C: invokespecial java.lang.RuntimeException.<init>()void
		// @0F: athrow
		// @10: athrow
		// @11: iload_1
		// @12: iconst_m1
		// @13: if_icmpeq @21
		// @16: aload_0
		// @17: bipush 51 (0x33)
		// @19: invokevirtual game.C_100325_id.func_101469_a(byte)boolean
		// @1C: pop
		// @1D: goto @21
		// @20: athrow
		// @21: aload_0
		// @22: lload_2
		// @23: putfield long game.C_100325_id.field_101484_o
		// @26: goto @55
		// @29: astore #4
		// @2B: aload #4
		// @2D: new java.lang.StringBuilder
		// @30: dup
		// @31: invokespecial java.lang.StringBuilder.<init>()void
		// @34: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @37: iconst_5
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: iload_1
		// @3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40: bipush 44 (0x2C)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: lload_2
		// @46: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @49: bipush 41 (0x29)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @51: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @54: athrow
		// @55: return
	}
	
	final boolean func_101469_a(byte arg0)
	{
		// @00: iload_1
		// @01: bipush -57 (0xC7)
		// @03: if_icmpeq @0F
		// @06: iconst_5
		// @07: invokestatic game.C_100325_id.func_101475_g(int)game.C_100302_ka
		// @0A: pop
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aconst_null
		// @10: aload_0
		// @11: getfield game.C_100325_id game.C_100325_id.field_101486_m
		// @14: if_acmpne @19
		// @17: iconst_0
		// @18: ireturn
		// @19: iconst_1
		// @1A: ireturn
		// @1B: astore_2
		// @1C: aload_2
		// @1D: new java.lang.StringBuilder
		// @20: dup
		// @21: invokespecial java.lang.StringBuilder.<init>()void
		// @24: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @27: bipush 8 (0x08)
		// @29: aaload
		// @2A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D: iload_1
		// @2E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @31: bipush 41 (0x29)
		// @33: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @36: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @39: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3C: athrow
	}
	
	static final void func_101474_a(byte arg0, C_100037_wb[] arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #11
		// @005: aload_1
		// @006: ifnull @00F
		// @009: iconst_0
		// @00A: iload #5
		// @00C: if_icmplt @010
		// @00F: return
		// @010: iload_0
		// @011: bipush 51 (0x33)
		// @013: if_icmpeq @021
		// @016: aconst_null
		// @017: checkcast game.C_100302_ka
		// @01A: putstatic game.C_100302_ka game.C_100325_id.field_101489_k
		// @01D: goto @021
		// @020: athrow
		// @021: aload_1
		// @022: iconst_0
		// @023: aaload
		// @024: getfield int game.C_100037_wb.field_102341_y
		// @027: istore #6
		// @029: aload_1
		// @02A: iconst_2
		// @02B: aaload
		// @02C: getfield int game.C_100037_wb.field_102341_y
		// @02F: istore #7
		// @031: aload_1
		// @032: iconst_1
		// @033: aaload
		// @034: getfield int game.C_100037_wb.field_102341_y
		// @037: istore #8
		// @039: aload_1
		// @03A: iconst_0
		// @03B: aaload
		// @03C: iload_3
		// @03D: iload #4
		// @03F: iload_2
		// @040: invokevirtual game.C_100037_wb.func_102348_e(int, int, int)void
		// @043: aload_1
		// @044: iconst_2
		// @045: aaload
		// @046: iload_3
		// @047: iload #5
		// @049: iload #7
		// @04B: isub
		// @04C: iadd
		// @04D: iload #4
		// @04F: iload_2
		// @050: invokevirtual game.C_100037_wb.func_102348_e(int, int, int)void
		// @053: getstatic int[] game.C_100069_vb.field_104360_a
		// @056: invokestatic game.C_100196_rb.func_105801_a(int[])void
		// @059: iload #6
		// @05B: iload_3
		// @05C: iadd
		// @05D: iload #4
		// @05F: iload #7
		// @061: ineg
		// @062: iload_3
		// @063: iadd
		// @064: iload #5
		// @066: ineg
		// @067: isub
		// @068: aload_1
		// @069: iconst_1
		// @06A: aaload
		// @06B: getfield int game.C_100037_wb.field_102340_z
		// @06E: iload #4
		// @070: iadd
		// @071: invokestatic game.C_100196_rb.func_105779_e(int, int, int, int)void
		// @074: iload #6
		// @076: iload_3
		// @077: iadd
		// @078: istore #9
		// @07A: iload_3
		// @07B: iload #5
		// @07D: iload #7
		// @07F: isub
		// @080: iadd
		// @081: istore #10
		// @083: iload #9
		// @085: istore_3
		// @086: iload #10
		// @088: iconst_m1
		// @089: ixor
		// @08A: iload_3
		// @08B: iconst_m1
		// @08C: ixor
		// @08D: if_icmpge @0AD
		// @090: aload_1
		// @091: iconst_1
		// @092: aaload
		// @093: iload_3
		// @094: iload #4
		// @096: iload_2
		// @097: invokevirtual game.C_100037_wb.func_102348_e(int, int, int)void
		// @09A: iload_3
		// @09B: iload #8
		// @09D: iadd
		// @09E: istore_3
		// @09F: iload #11
		// @0A1: ifne @0B3
		// @0A4: iload #11
		// @0A6: ifeq @086
		// @0A9: goto @0AD
		// @0AC: athrow
		// @0AD: getstatic int[] game.C_100069_vb.field_104360_a
		// @0B0: invokestatic game.C_100196_rb.func_105777_b(int[])void
		// @0B3: goto @11A
		// @0B6: astore #6
		// @0B8: aload #6
		// @0BA: new java.lang.StringBuilder
		// @0BD: dup
		// @0BE: invokespecial java.lang.StringBuilder.<init>()void
		// @0C1: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @0C4: bipush 13 (0x0D)
		// @0C6: aaload
		// @0C7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0CA: iload_0
		// @0CB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0CE: bipush 44 (0x2C)
		// @0D0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D3: aload_1
		// @0D4: ifnull @0E0
		// @0D7: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @0DA: iconst_3
		// @0DB: aaload
		// @0DC: goto @0E5
		// @0DF: athrow
		// @0E0: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @0E3: iconst_2
		// @0E4: aaload
		// @0E5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0E8: bipush 44 (0x2C)
		// @0EA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0ED: iload_2
		// @0EE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F1: bipush 44 (0x2C)
		// @0F3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F6: iload_3
		// @0F7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0FA: bipush 44 (0x2C)
		// @0FC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FF: iload #4
		// @101: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @104: bipush 44 (0x2C)
		// @106: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @109: iload #5
		// @10B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @10E: bipush 41 (0x29)
		// @110: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @113: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @116: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @119: athrow
		// @11A: return
	}
	
	static final String func_101468_a(String arg0, Applet arg1, int arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #7
		// @05: sipush 17228 (0x434C)
		// @08: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @0B: iconst_0
		// @0C: aaload
		// @0D: aload_1
		// @0E: invokestatic game.C_100175_cl.func_105614_a(int, java.lang.String, java.applet.Applet)java.lang.Object
		// @11: checkcast java.lang.String
		// @14: astore_3
		// @15: bipush -60 (0xC4)
		// @17: aload_3
		// @18: bipush 59 (0x3B)
		// @1A: invokestatic game.C_100087_n.func_100679_a(int, java.lang.String, char)java.lang.String[]
		// @1D: astore #4
		// @1F: iload_2
		// @20: istore #5
		// @22: iload #5
		// @24: iconst_m1
		// @25: ixor
		// @26: aload #4
		// @28: arraylength
		// @29: iconst_m1
		// @2A: ixor
		// @2B: if_icmple @7C
		// @2E: aload #4
		// @30: iload #5
		// @32: aaload
		// @33: bipush 61 (0x3D)
		// @35: invokevirtual java.lang.String.indexOf(int)int
		// @38: istore #6
		// @3A: iload #7
		// @3C: ifne @80
		// @3F: iload #6
		// @41: iconst_m1
		// @42: ixor
		// @43: iconst_m1
		// @44: if_icmpgt @74
		// @47: goto @4B
		// @4A: athrow
		// @4B: aload #4
		// @4D: iload #5
		// @4F: aaload
		// @50: iconst_0
		// @51: iload #6
		// @53: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @56: invokevirtual java.lang.String.trim()java.lang.String
		// @59: aload_0
		// @5A: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @5D: ifeq @74
		// @60: goto @64
		// @63: athrow
		// @64: aload #4
		// @66: iload #5
		// @68: aaload
		// @69: iconst_1
		// @6A: iload #6
		// @6C: iadd
		// @6D: invokevirtual java.lang.String.substring(int)java.lang.String
		// @70: invokevirtual java.lang.String.trim()java.lang.String
		// @73: areturn
		// @74: iinc #5 +1
		// @77: iload #7
		// @79: ifeq @22
		// @7C: goto @80
		// @7F: astore_3
		// @80: aconst_null
		// @81: areturn
		// @82: astore_3
		// @83: aload_3
		// @84: new java.lang.StringBuilder
		// @87: dup
		// @88: invokespecial java.lang.StringBuilder.<init>()void
		// @8B: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @8E: iconst_1
		// @8F: aaload
		// @90: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @93: aload_0
		// @94: ifnull @A0
		// @97: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @9A: iconst_3
		// @9B: aaload
		// @9C: goto @A5
		// @9F: athrow
		// @A0: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @A3: iconst_2
		// @A4: aaload
		// @A5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A8: bipush 44 (0x2C)
		// @AA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AD: aload_1
		// @AE: ifnull @BA
		// @B1: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @B4: iconst_3
		// @B5: aaload
		// @B6: goto @BF
		// @B9: athrow
		// @BA: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @BD: iconst_2
		// @BE: aaload
		// @BF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C2: bipush 44 (0x2C)
		// @C4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C7: iload_2
		// @C8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CB: bipush 41 (0x29)
		// @CD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D6: athrow
	}
	
	static final C_100130_tf func_101476_a(String arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #8
		// @05: iload_1
		// @06: iconst_m1
		// @07: if_icmpeq @12
		// @0A: iconst_0
		// @0B: putstatic boolean game.C_100325_id.field_101480_r
		// @0E: goto @12
		// @11: athrow
		// @12: aload_0
		// @13: invokevirtual java.lang.String.length()int
		// @16: istore_2
		// @17: iload_2
		// @18: ifeq @1F
		// @1B: goto @23
		// @1E: athrow
		// @1F: getstatic game.C_100130_tf game.C_100082_uf.field_100374_a
		// @22: areturn
		// @23: sipush 255 (0x00FF)
		// @26: iload_2
		// @27: if_icmplt @2E
		// @2A: goto @32
		// @2D: athrow
		// @2E: getstatic game.C_100130_tf game.C_100115_ej.field_102039_ac
		// @31: areturn
		// @32: bipush -49 (0xCF)
		// @34: aload_0
		// @35: bipush 46 (0x2E)
		// @37: invokestatic game.C_100087_n.func_100679_a(int, java.lang.String, char)java.lang.String[]
		// @3A: astore_3
		// @3B: aload_3
		// @3C: arraylength
		// @3D: iconst_m1
		// @3E: ixor
		// @3F: bipush -3 (0xFD)
		// @41: if_icmple @48
		// @44: getstatic game.C_100130_tf game.C_100082_uf.field_100374_a
		// @47: areturn
		// @48: aload_3
		// @49: astore #4
		// @4B: iconst_0
		// @4C: istore #5
		// @4E: aload #4
		// @50: arraylength
		// @51: iconst_m1
		// @52: ixor
		// @53: iload #5
		// @55: iconst_m1
		// @56: ixor
		// @57: if_icmpge @84
		// @5A: aload #4
		// @5C: iload #5
		// @5E: aaload
		// @5F: astore #6
		// @61: aload #6
		// @63: bipush -114 (0x8E)
		// @65: invokestatic game.C_100283_ni.func_106753_a(java.lang.String, int)game.C_100130_tf
		// @68: iload #8
		// @6A: ifne @92
		// @6D: astore #7
		// @6F: aconst_null
		// @70: aload #7
		// @72: if_acmpne @79
		// @75: goto @7C
		// @78: athrow
		// @79: aload #7
		// @7B: areturn
		// @7C: iinc #5 +1
		// @7F: iload #8
		// @81: ifeq @4E
		// @84: aload_3
		// @85: iconst_m1
		// @86: aload_3
		// @87: arraylength
		// @88: iadd
		// @89: aaload
		// @8A: iload_1
		// @8B: sipush -7873 (0xE13F)
		// @8E: ixor
		// @8F: invokestatic game.C_100085_a.func_102562_a(java.lang.String, int)game.C_100130_tf
		// @92: areturn
		// @93: astore_2
		// @94: aload_2
		// @95: new java.lang.StringBuilder
		// @98: dup
		// @99: invokespecial java.lang.StringBuilder.<init>()void
		// @9C: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @9F: bipush 10 (0x0A)
		// @A1: aaload
		// @A2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A5: aload_0
		// @A6: ifnull @B2
		// @A9: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @AC: iconst_3
		// @AD: aaload
		// @AE: goto @B7
		// @B1: athrow
		// @B2: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @B5: iconst_2
		// @B6: aaload
		// @B7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BA: bipush 44 (0x2C)
		// @BC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BF: iload_1
		// @C0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C3: bipush 41 (0x29)
		// @C5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C8: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CB: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CE: athrow
	}
	
	static final void func_101477_h(int arg0)
	{
		// @00: bipush -108 (0x94)
		// @02: invokestatic game.C_100194_rd.func_103069_b(byte)void
		// @05: iload_0
		// @06: bipush 79 (0x4F)
		// @08: if_icmpgt @1C
		// @0B: bipush -2 (0xFE)
		// @0D: aconst_null
		// @0E: checkcast game.C_100037_wb[]
		// @11: bipush -101 (0x9B)
		// @13: bipush -62 (0xC2)
		// @15: bipush -65 (0xBF)
		// @17: bipush -80 (0xB0)
		// @19: invokestatic game.C_100325_id.func_101474_a(byte, game.C_100037_wb[], int, int, int, int)void
		// @1C: goto @41
		// @1F: astore_1
		// @20: aload_1
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @2B: bipush 9 (0x09)
		// @2D: aaload
		// @2E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @31: iload_0
		// @32: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @35: bipush 41 (0x29)
		// @37: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @40: athrow
		// @41: return
	}
	
	static
	{
		// @00: bipush 14 (0x0E)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\u000f|-%a\u0007r0#}"
		// @09: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u0001}w\u0007O@"
		// @14: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @17: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u0006l5*"
		// @1F: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @22: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\u00137whs"
		// @2A: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\u0001}w\u0000O@"
		// @35: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @38: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\u0001}w\u0002O@"
		// @40: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @43: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "\u0001}w\u0003O@"
		// @4C: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "\u0001}w\u0004O@"
		// @58: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "\u0001}w\u0001O@"
		// @64: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @67: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "\u0001}w\u0011&"
		// @70: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @73: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "\u0001}w\u0005O@"
		// @7C: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "\u0001}w\u0010&"
		// @88: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @8E: aastore
		// @8F: dup
		// @90: bipush 12 (0x0C)
		// @92: ldc "\u0001}w\u000eO@"
		// @94: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @97: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @9A: aastore
		// @9B: dup
		// @9C: bipush 13 (0x0D)
		// @9E: ldc "\u0001}w\u0013&"
		// @A0: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @A3: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @A6: aastore
		// @A7: putstatic java.lang.String[] game.C_100325_id.field_101488_z
		// @AA: ldc "<|*2..p<*j"
		// @AC: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @AF: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @B2: putstatic java.lang.String game.C_100325_id.field_101481_q
		// @B5: iconst_0
		// @B6: putstatic boolean game.C_100325_id.field_101480_r
		// @B9: ldc "8u<'}\r95)iHp7fz\u000798%m\rj*fz\u0000p*fh\rx-3|\r7"
		// @BB: invokestatic game.C_100325_id.func_101472_z(java.lang.String)char[]
		// @BE: invokestatic game.C_100325_id.func_101471_z(char[])java.lang.String
		// @C1: putstatic java.lang.String game.C_100325_id.field_101485_l
		// @C4: return
	}
	
	private static char[] func_101472_z(String arg0)
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
		// @0E: bipush 14 (0x0E)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_101471_z(char[] arg0)
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
		// @30: bipush 104 (0x68)
		// @32: goto @46
		// @35: bipush 25 (0x19)
		// @37: goto @46
		// @3A: bipush 89 (0x59)
		// @3C: goto @46
		// @3F: bipush 70 (0x46)
		// @41: goto @46
		// @44: bipush 14 (0x0E)
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
