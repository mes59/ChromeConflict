package game;

final class C_100312_ld
{
	static C_100202_qi field_107159_h;
	static C_100037_wb field_107151_f;
	static int field_107153_d;
	static C_100153_be[] field_107157_a;
	static boolean field_107154_e;
	static int[] field_107156_c;
	static int field_107152_g;
	static C_100202_qi field_107155_b;
	private static final String[] field_107158_z;
	
	static long func_107144_a(long arg0, long arg1)
	{
		// @00: lload_0
		// @01: lload_2
		// @02: lxor
		// @03: lreturn
		// @04: astore #4
		// @06: aload #4
		// @08: new java.lang.StringBuilder
		// @0B: dup
		// @0C: invokespecial java.lang.StringBuilder.<init>()void
		// @0F: getstatic java.lang.String[] game.C_100312_ld.field_107158_z
		// @12: iconst_5
		// @13: aaload
		// @14: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @17: lload_0
		// @18: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @1B: bipush 44 (0x2C)
		// @1D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @20: lload_2
		// @21: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @24: bipush 41 (0x29)
		// @26: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @29: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2F: athrow
	}
	
	static final void func_107148_a(C_100002_gf arg0, int arg1, byte arg2, boolean arg3, int arg4)
	{
		// @00: iload_2
		// @01: bipush -87 (0xA9)
		// @03: if_icmplt @11
		// @06: aconst_null
		// @07: checkcast game.C_100037_wb
		// @0A: putstatic game.C_100037_wb game.C_100312_ld.field_107151_f
		// @0D: goto @11
		// @10: athrow
		// @11: getstatic game.C_100253_ph game.C_100203_ql.field_105927_f
		// @14: iload_1
		// @15: iconst_1
		// @16: iload #4
		// @18: aload_0
		// @19: ldc 1000000 (0xf4240)
		// @1B: iload_3
		// @1C: ifne @24
		// @1F: iconst_1
		// @20: goto @25
		// @23: athrow
		// @24: iconst_0
		// @25: invokevirtual game.C_100253_ph.func_101090_a(int, boolean, int, game.C_100002_gf, int, boolean)void
		// @28: goto @84
		// @2B: astore #5
		// @2D: aload #5
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100312_ld.field_107158_z
		// @39: iconst_4
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: aload_0
		// @3F: ifnull @4B
		// @42: getstatic java.lang.String[] game.C_100312_ld.field_107158_z
		// @45: iconst_1
		// @46: aaload
		// @47: goto @50
		// @4A: athrow
		// @4B: getstatic java.lang.String[] game.C_100312_ld.field_107158_z
		// @4E: iconst_2
		// @4F: aaload
		// @50: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @53: bipush 44 (0x2C)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: iload_1
		// @59: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5C: bipush 44 (0x2C)
		// @5E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @61: iload_2
		// @62: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @65: bipush 44 (0x2C)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: iload_3
		// @6B: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @6E: bipush 44 (0x2C)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: iload #4
		// @75: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @78: bipush 41 (0x29)
		// @7A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @80: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @83: athrow
		// @84: return
	}
	
	public static void func_107149_b(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic int[] game.C_100312_ld.field_107156_c
		// @04: aconst_null
		// @05: putstatic game.C_100037_wb game.C_100312_ld.field_107151_f
		// @08: iload_0
		// @09: bipush 11 (0x0B)
		// @0B: if_icmpge @20
		// @0E: aconst_null
		// @0F: checkcast game.C_100002_gf
		// @12: bipush -89 (0xA7)
		// @14: bipush 79 (0x4F)
		// @16: iconst_1
		// @17: bipush 119 (0x77)
		// @19: invokestatic game.C_100312_ld.func_107148_a(game.C_100002_gf, int, byte, boolean, int)void
		// @1C: goto @20
		// @1F: athrow
		// @20: aconst_null
		// @21: putstatic game.C_100202_qi game.C_100312_ld.field_107155_b
		// @24: aconst_null
		// @25: putstatic game.C_100202_qi game.C_100312_ld.field_107159_h
		// @28: aconst_null
		// @29: putstatic game.C_100153_be[] game.C_100312_ld.field_107157_a
		// @2C: goto @50
		// @2F: astore_1
		// @30: aload_1
		// @31: new java.lang.StringBuilder
		// @34: dup
		// @35: invokespecial java.lang.StringBuilder.<init>()void
		// @38: getstatic java.lang.String[] game.C_100312_ld.field_107158_z
		// @3B: iconst_3
		// @3C: aaload
		// @3D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @40: iload_0
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 41 (0x29)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4F: athrow
		// @50: return
	}
	
	static final void func_107146_a(byte arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: getstatic int game.C_100068_vc.field_104343_e
		// @008: iflt @01B
		// @00B: getstatic game.C_100067_vd[] game.C_100066_dl.field_101641_u
		// @00E: getstatic int game.C_100068_vc.field_104343_e
		// @011: aaload
		// @012: bipush 68 (0x44)
		// @014: invokevirtual game.C_100067_vd.func_104307_c(byte)void
		// @017: goto @01B
		// @01A: athrow
		// @01B: getstatic int game.C_100068_vc.field_104343_e
		// @01E: iconst_m1
		// @01F: ixor
		// @020: bipush -17 (0xEF)
		// @022: if_icmpne @02A
		// @025: iconst_m1
		// @026: putstatic int game.C_100068_vc.field_104343_e
		// @029: return
		// @02A: getstatic int game.C_100068_vc.field_104343_e
		// @02D: iconst_1
		// @02E: if_icmpeq @035
		// @031: goto @039
		// @034: athrow
		// @035: iconst_0
		// @036: putstatic int game.C_100338_jc.field_105363_f
		// @039: getstatic int game.C_100068_vc.field_104343_e
		// @03C: iconst_1
		// @03D: iadd
		// @03E: putstatic int game.C_100068_vc.field_104343_e
		// @041: bipush 12 (0x0C)
		// @043: getstatic int game.C_100068_vc.field_104343_e
		// @046: if_icmpeq @04D
		// @049: goto @0AA
		// @04C: athrow
		// @04D: iconst_0
		// @04E: istore_1
		// @04F: iconst_0
		// @050: istore_2
		// @051: iload_2
		// @052: bipush 35 (0x23)
		// @054: if_icmpge @09A
		// @057: iload_2
		// @058: getstatic int[] game.C_100075_uj.field_100655_u
		// @05B: bipush -99 (0x9D)
		// @05D: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @060: iload #5
		// @062: ifne @09B
		// @065: ifne @08E
		// @068: goto @06C
		// @06B: athrow
		// @06C: getstatic int[] game.C_100257_ln.field_106481_d
		// @06F: getstatic int[] game.C_100075_uj.field_100655_u
		// @072: iload_2
		// @073: getstatic int[] game.C_100066_dl.field_101632_G
		// @076: bipush 118 (0x76)
		// @078: bipush -126 (0x82)
		// @07A: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @07D: invokestatic game.C_100235_om.func_106281_a(int[], int[], int, int[], byte, boolean)boolean
		// @080: ifeq @08E
		// @083: goto @087
		// @086: athrow
		// @087: iconst_1
		// @088: istore_1
		// @089: iload #5
		// @08B: ifeq @09A
		// @08E: iinc #2 +1
		// @091: iload #5
		// @093: ifeq @051
		// @096: goto @09A
		// @099: athrow
		// @09A: iload_1
		// @09B: ifne @0AA
		// @09E: getstatic int game.C_100068_vc.field_104343_e
		// @0A1: iconst_1
		// @0A2: iadd
		// @0A3: putstatic int game.C_100068_vc.field_104343_e
		// @0A6: goto @0AA
		// @0A9: athrow
		// @0AA: bipush -16 (0xF0)
		// @0AC: getstatic int game.C_100068_vc.field_104343_e
		// @0AF: iconst_m1
		// @0B0: ixor
		// @0B1: if_icmpeq @0B8
		// @0B4: goto @120
		// @0B7: athrow
		// @0B8: iconst_0
		// @0B9: istore_1
		// @0BA: getstatic int[] game.C_100017_wj.field_103821_j
		// @0BD: astore_2
		// @0BE: iconst_0
		// @0BF: istore_3
		// @0C0: aload_2
		// @0C1: arraylength
		// @0C2: iload_3
		// @0C3: if_icmple @110
		// @0C6: aload_2
		// @0C7: iload_3
		// @0C8: iaload
		// @0C9: istore #4
		// @0CB: iload #4
		// @0CD: getstatic int[] game.C_100257_ln.field_106481_d
		// @0D0: iload_0
		// @0D1: sipush -187 (0xFF45)
		// @0D4: iadd
		// @0D5: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @0D8: iload #5
		// @0DA: ifne @111
		// @0DD: ifne @104
		// @0E0: goto @0E4
		// @0E3: athrow
		// @0E4: getstatic int[] game.C_100257_ln.field_106481_d
		// @0E7: bipush -37 (0xDB)
		// @0E9: getstatic int[] game.C_100066_dl.field_101632_G
		// @0EC: iload #4
		// @0EE: bipush -81 (0xAF)
		// @0F0: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @0F3: invokestatic game.C_100292_jk.func_101212_a(int[], byte, int[], int, boolean)boolean
		// @0F6: ifeq @104
		// @0F9: goto @0FD
		// @0FC: athrow
		// @0FD: iconst_1
		// @0FE: istore_1
		// @0FF: iload #5
		// @101: ifeq @110
		// @104: iinc #3 +1
		// @107: iload #5
		// @109: ifeq @0C0
		// @10C: goto @110
		// @10F: athrow
		// @110: iload_1
		// @111: ifne @120
		// @114: getstatic int game.C_100068_vc.field_104343_e
		// @117: iconst_1
		// @118: iadd
		// @119: putstatic int game.C_100068_vc.field_104343_e
		// @11C: goto @120
		// @11F: athrow
		// @120: bipush -13 (0xF3)
		// @122: getstatic int game.C_100068_vc.field_104343_e
		// @125: iconst_m1
		// @126: ixor
		// @127: if_icmpeq @12E
		// @12A: goto @1FA
		// @12D: athrow
		// @12E: aconst_null
		// @12F: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @132: if_acmpeq @1FA
		// @135: getstatic int game.C_100294_ki.field_106971_P
		// @138: ifge @143
		// @13B: goto @13F
		// @13E: athrow
		// @13F: goto @1FA
		// @142: athrow
		// @143: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @146: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @149: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @14C: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @14F: getfield int game.C_100302_ka.field_101880_Gb
		// @152: ineg
		// @153: getstatic int game.C_100294_ki.field_106971_P
		// @156: ineg
		// @157: iadd
		// @158: putfield int game.C_100302_ka.field_101843_Tb
		// @15B: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @15E: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @161: getfield int game.C_100302_ka.field_101843_Tb
		// @164: iconst_m1
		// @165: ixor
		// @166: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @169: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @16C: getfield int game.C_100302_ka.field_101880_Gb
		// @16F: ineg
		// @170: iconst_m1
		// @171: ixor
		// @172: if_icmpge @18C
		// @175: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @178: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @17B: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @17E: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @181: getfield int game.C_100302_ka.field_101880_Gb
		// @184: ineg
		// @185: putfield int game.C_100302_ka.field_101843_Tb
		// @188: goto @18C
		// @18B: athrow
		// @18C: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @18F: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @192: getfield int game.C_100302_ka.field_101880_Gb
		// @195: ineg
		// @196: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @199: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @19C: getfield int game.C_100302_ka.field_101848_lb
		// @19F: ineg
		// @1A0: iadd
		// @1A1: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @1A4: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @1A7: getfield int game.C_100302_ka.field_101832_tb
		// @1AA: isub
		// @1AB: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @1AE: getfield game.C_100302_ka game.C_100115_ej.field_102040_Zb
		// @1B1: getfield int game.C_100302_ka.field_101848_lb
		// @1B4: iadd
		// @1B5: iconst_m1
		// @1B6: ixor
		// @1B7: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @1BA: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @1BD: getfield int game.C_100302_ka.field_101843_Tb
		// @1C0: iconst_m1
		// @1C1: ixor
		// @1C2: if_icmpge @1FA
		// @1C5: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @1C8: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @1CB: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @1CE: getfield game.C_100302_ka game.C_100115_ej.field_102040_Zb
		// @1D1: getfield int game.C_100302_ka.field_101848_lb
		// @1D4: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @1D7: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @1DA: getfield int game.C_100302_ka.field_101848_lb
		// @1DD: ineg
		// @1DE: iadd
		// @1DF: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @1E2: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @1E5: getfield int game.C_100302_ka.field_101832_tb
		// @1E8: isub
		// @1E9: getstatic game.C_100115_ej game.C_100017_wj.field_103823_k
		// @1EC: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @1EF: getfield int game.C_100302_ka.field_101880_Gb
		// @1F2: isub
		// @1F3: putfield int game.C_100302_ka.field_101843_Tb
		// @1F6: goto @1FA
		// @1F9: athrow
		// @1FA: iload_0
		// @1FB: bipush 72 (0x48)
		// @1FD: if_icmpeq @20B
		// @200: aconst_null
		// @201: checkcast int[]
		// @204: putstatic int[] game.C_100312_ld.field_107156_c
		// @207: goto @20B
		// @20A: athrow
		// @20B: bipush -17 (0xEF)
		// @20D: getstatic int game.C_100068_vc.field_104343_e
		// @210: iconst_m1
		// @211: ixor
		// @212: if_icmpne @243
		// @215: bipush 8 (0x08)
		// @217: getstatic int game.C_100249_pc.field_102333_I
		// @21A: iand
		// @21B: iconst_m1
		// @21C: ixor
		// @21D: iconst_m1
		// @21E: if_icmpne @243
		// @221: goto @225
		// @224: athrow
		// @225: getstatic int game.C_100249_pc.field_102333_I
		// @228: bipush 8 (0x08)
		// @22A: ior
		// @22B: putstatic int game.C_100249_pc.field_102333_I
		// @22E: bipush -25 (0xE7)
		// @230: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @233: ifne @243
		// @236: goto @23A
		// @239: athrow
		// @23A: bipush 113 (0x71)
		// @23C: invokestatic game.C_100017_wj.func_103813_b(byte)void
		// @23F: goto @243
		// @242: athrow
		// @243: goto @268
		// @246: astore_1
		// @247: aload_1
		// @248: new java.lang.StringBuilder
		// @24B: dup
		// @24C: invokespecial java.lang.StringBuilder.<init>()void
		// @24F: getstatic java.lang.String[] game.C_100312_ld.field_107158_z
		// @252: bipush 6 (0x06)
		// @254: aaload
		// @255: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @258: iload_0
		// @259: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @25C: bipush 41 (0x29)
		// @25E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @261: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @264: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @267: athrow
		// @268: return
	}
	
	static final boolean func_107150_a(int arg0, String arg1)
	{
		// @00: getstatic boolean game.C_100230_of.field_106216_k
		// @03: ifeq @0A
		// @06: goto @0C
		// @09: athrow
		// @0A: iconst_0
		// @0B: ireturn
		// @0C: iload_0
		// @0D: getstatic int game.C_100113_ek.field_104880_b
		// @10: if_icmpne @34
		// @13: getstatic java.lang.String game.C_100243_pd.field_106355_f
		// @16: ifnull @34
		// @19: goto @1D
		// @1C: athrow
		// @1D: getstatic java.lang.String game.C_100243_pd.field_106355_f
		// @20: bipush -126 (0x82)
		// @22: aload_1
		// @23: invokestatic game.C_100106_ef.func_104742_a(byte, java.lang.CharSequence)java.lang.String
		// @26: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @29: ifeq @34
		// @2C: goto @30
		// @2F: athrow
		// @30: goto @36
		// @33: athrow
		// @34: iconst_0
		// @35: ireturn
		// @36: iconst_1
		// @37: ireturn
		// @38: astore_2
		// @39: aload_2
		// @3A: new java.lang.StringBuilder
		// @3D: dup
		// @3E: invokespecial java.lang.StringBuilder.<init>()void
		// @41: getstatic java.lang.String[] game.C_100312_ld.field_107158_z
		// @44: iconst_0
		// @45: aaload
		// @46: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @49: iload_0
		// @4A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4D: bipush 44 (0x2C)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: aload_1
		// @53: ifnull @5F
		// @56: getstatic java.lang.String[] game.C_100312_ld.field_107158_z
		// @59: iconst_1
		// @5A: aaload
		// @5B: goto @64
		// @5E: athrow
		// @5F: getstatic java.lang.String[] game.C_100312_ld.field_107158_z
		// @62: iconst_2
		// @63: aaload
		// @64: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @67: bipush 41 (0x29)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @72: athrow
	}
	
	static
	{
		// @00: bipush 7 (0x07)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "ok\u0019 ;"
		// @09: invokestatic game.C_100312_ld.func_107147_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100312_ld.func_107145_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "x!\u0019Jn"
		// @14: invokestatic game.C_100312_ld.func_107147_z(java.lang.String)char[]
		// @17: invokestatic game.C_100312_ld.func_107145_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "mz[\u0008"
		// @1F: invokestatic game.C_100312_ld.func_107147_z(java.lang.String)char[]
		// @22: invokestatic game.C_100312_ld.func_107145_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "ok\u0019!;"
		// @2A: invokestatic game.C_100312_ld.func_107147_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100312_ld.func_107145_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "ok\u0019%;"
		// @35: invokestatic game.C_100312_ld.func_107147_z(java.lang.String)char[]
		// @38: invokestatic game.C_100312_ld.func_107145_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "ok\u0019&;"
		// @40: invokestatic game.C_100312_ld.func_107147_z(java.lang.String)char[]
		// @43: invokestatic game.C_100312_ld.func_107145_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "ok\u0019';"
		// @4C: invokestatic game.C_100312_ld.func_107147_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100312_ld.func_107145_z(char[])java.lang.String
		// @52: aastore
		// @53: putstatic java.lang.String[] game.C_100312_ld.field_107158_z
		// @56: iconst_0
		// @57: putstatic int game.C_100312_ld.field_107153_d
		// @5A: new game.C_100202_qi
		// @5D: dup
		// @5E: invokespecial game.C_100202_qi.<init>()void
		// @61: putstatic game.C_100202_qi game.C_100312_ld.field_107159_h
		// @64: iconst_0
		// @65: putstatic boolean game.C_100312_ld.field_107154_e
		// @68: return
	}
	
	private static char[] func_107147_z(String arg0)
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
		// @0E: bipush 19 (0x13)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_107145_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @34, for 2: @39, for 3: @3E
		// @30: iconst_3
		// @31: goto @45
		// @34: bipush 15 (0x0F)
		// @36: goto @45
		// @39: bipush 55 (0x37)
		// @3B: goto @45
		// @3E: bipush 100 (0x64)
		// @40: goto @45
		// @43: bipush 19 (0x13)
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
