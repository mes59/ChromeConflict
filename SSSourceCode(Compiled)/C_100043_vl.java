package game;

final class C_100043_vl extends C_100302_ka
{
	static C_100233_oa field_101945_cc;
	static int field_101937_Wb;
	static int[] field_101941_Zb;
	static C_100013_fn field_101944_bc;
	private C_100302_ka field_101939_Vb;
	static String field_101942_Xb;
	static int field_101943_Yb;
	static String field_101938_Ub;
	static String field_101940_ac;
	private static final String[] field_101936_dc;
	
	public static void func_101932_l(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100233_oa game.C_100043_vl.field_101945_cc
		// @04: aconst_null
		// @05: putstatic int[] game.C_100043_vl.field_101941_Zb
		// @08: aconst_null
		// @09: putstatic game.C_100013_fn game.C_100043_vl.field_101944_bc
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100043_vl.field_101938_Ub
		// @10: aconst_null
		// @11: putstatic java.lang.String game.C_100043_vl.field_101942_Xb
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100043_vl.field_101940_ac
		// @18: bipush 64 (0x40)
		// @1A: bipush -64 (0xC0)
		// @1C: iload_0
		// @1D: isub
		// @1E: bipush 58 (0x3A)
		// @20: idiv
		// @21: idiv
		// @22: istore_1
		// @23: goto @47
		// @26: astore_1
		// @27: aload_1
		// @28: new java.lang.StringBuilder
		// @2B: dup
		// @2C: invokespecial java.lang.StringBuilder.<init>()void
		// @2F: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @32: iconst_3
		// @33: aaload
		// @34: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @37: iload_0
		// @38: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3B: bipush 41 (0x29)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @43: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @46: athrow
		// @47: return
	}
	
	final boolean func_101933_a(int arg0, boolean arg1)
	{
		// @00: aload_0
		// @01: iconst_1
		// @02: bipush 104 (0x68)
		// @04: invokevirtual game.C_100043_vl.func_101819_a(boolean, byte)void
		// @07: iload_1
		// @08: sipush -8031 (0xE0A1)
		// @0B: if_icmpeq @10
		// @0E: iconst_1
		// @0F: ireturn
		// @10: iconst_m1
		// @11: getstatic int game.C_100102_w.field_104636_c
		// @14: iconst_m1
		// @15: ixor
		// @16: if_icmpeq @24
		// @19: aload_0
		// @1A: getfield int game.C_100043_vl.field_101854_N
		// @1D: ifeq @32
		// @20: goto @24
		// @23: athrow
		// @24: aload_0
		// @25: getfield game.C_100302_ka game.C_100043_vl.field_101939_Vb
		// @28: getfield int game.C_100302_ka.field_101854_N
		// @2B: ifeq @37
		// @2E: goto @32
		// @31: athrow
		// @32: iconst_1
		// @33: goto @38
		// @36: athrow
		// @37: iconst_0
		// @38: ireturn
		// @39: astore_3
		// @3A: aload_3
		// @3B: new java.lang.StringBuilder
		// @3E: dup
		// @3F: invokespecial java.lang.StringBuilder.<init>()void
		// @42: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @45: iconst_5
		// @46: aaload
		// @47: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4A: iload_1
		// @4B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4E: bipush 44 (0x2C)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: iload_2
		// @54: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @57: bipush 41 (0x29)
		// @59: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @62: athrow
	}
	
	static final int func_101931_a(int arg0, String arg1, C_100280_nf arg2)
	{
		// @00: aload_2
		// @01: getfield int game.C_100280_nf.field_101177_n
		// @04: istore_3
		// @05: iload_0
		// @06: sipush -26944 (0x96C0)
		// @09: if_icmpeq @0F
		// @0C: bipush 112 (0x70)
		// @0E: ireturn
		// @0F: iconst_0
		// @10: aload_1
		// @11: invokestatic game.C_100028_ha.func_103940_a(boolean, java.lang.CharSequence)byte[]
		// @14: astore #4
		// @16: aload_2
		// @17: aload #4
		// @19: arraylength
		// @1A: bipush -126 (0x82)
		// @1C: invokevirtual game.C_100280_nf.func_101153_c(int, int)void
		// @1F: aload_2
		// @20: dup
		// @21: getfield int game.C_100280_nf.field_101177_n
		// @24: getstatic game.C_100290_jm game.C_100038_wa.field_104069_e
		// @27: aload #4
		// @29: aload_2
		// @2A: getfield int game.C_100280_nf.field_101177_n
		// @2D: aload_2
		// @2E: getfield byte[] game.C_100280_nf.field_101179_l
		// @31: aload #4
		// @33: arraylength
		// @34: bipush 7 (0x07)
		// @36: iconst_0
		// @37: invokevirtual game.C_100290_jm.func_106855_a(byte[], int, byte[], int, int, int)int
		// @3A: iadd
		// @3B: putfield int game.C_100280_nf.field_101177_n
		// @3E: aload_2
		// @3F: getfield int game.C_100280_nf.field_101177_n
		// @42: iload_3
		// @43: isub
		// @44: ireturn
		// @45: astore_3
		// @46: aload_3
		// @47: new java.lang.StringBuilder
		// @4A: dup
		// @4B: invokespecial java.lang.StringBuilder.<init>()void
		// @4E: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @51: iconst_4
		// @52: aaload
		// @53: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @56: iload_0
		// @57: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5A: bipush 44 (0x2C)
		// @5C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5F: aload_1
		// @60: ifnull @6C
		// @63: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @66: iconst_2
		// @67: aaload
		// @68: goto @71
		// @6B: athrow
		// @6C: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @6F: iconst_1
		// @70: aaload
		// @71: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @74: bipush 44 (0x2C)
		// @76: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @79: aload_2
		// @7A: ifnull @86
		// @7D: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @80: iconst_2
		// @81: aaload
		// @82: goto @8B
		// @85: athrow
		// @86: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @89: iconst_1
		// @8A: aaload
		// @8B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8E: bipush 41 (0x29)
		// @90: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @93: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @96: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @99: athrow
	}
	
	C_100043_vl(C_100302_ka arg0, C_100302_ka arg1, C_100302_ka arg2, C_100302_ka arg3, C_100302_ka arg4, C_100302_ka arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #16
		// @005: aload_0
		// @006: invokespecial game.C_100302_ka.<init>()void
		// @009: new game.C_100302_ka
		// @00C: dup
		// @00D: lconst_0
		// @00E: aload_2
		// @00F: getstatic java.lang.String game.C_100111_el.field_104858_f
		// @012: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @015: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @018: astore #7
		// @01A: aload #7
		// @01C: iconst_1
		// @01D: putfield int game.C_100302_ka.field_101850_Fb
		// @020: aload_0
		// @021: new game.C_100302_ka
		// @024: dup
		// @025: lconst_0
		// @026: aload_3
		// @027: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @02A: putfield game.C_100302_ka game.C_100043_vl.field_101939_Vb
		// @02D: new game.C_100302_ka
		// @030: dup
		// @031: lconst_0
		// @032: aload #4
		// @034: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @037: astore #8
		// @039: new game.C_100302_ka
		// @03C: dup
		// @03D: lconst_0
		// @03E: aload #4
		// @040: getstatic java.lang.String game.C_100209_qb.field_102693_Lb
		// @043: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @046: astore #9
		// @048: aload #9
		// @04A: iconst_1
		// @04B: putfield int game.C_100302_ka.field_101850_Fb
		// @04E: bipush 50 (0x32)
		// @050: istore #10
		// @052: iconst_0
		// @053: istore #11
		// @055: iconst_0
		// @056: istore #12
		// @058: iload #12
		// @05A: getstatic java.lang.String[] game.C_100059_df.field_101601_N
		// @05D: arraylength
		// @05E: if_icmpge @0E6
		// @061: new game.C_100302_ka
		// @064: dup
		// @065: lconst_0
		// @066: aload #4
		// @068: getstatic java.lang.String[] game.C_100162_sc.field_102858_W
		// @06B: iload #12
		// @06D: aaload
		// @06E: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @071: astore #13
		// @073: new game.C_100302_ka
		// @076: dup
		// @077: lconst_0
		// @078: aload #4
		// @07A: getstatic java.lang.String[] game.C_100059_df.field_101601_N
		// @07D: iload #12
		// @07F: aaload
		// @080: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @083: astore #14
		// @085: aload #4
		// @087: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @08A: getstatic java.lang.String[] game.C_100059_df.field_101601_N
		// @08D: iload #12
		// @08F: aaload
		// @090: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @093: istore #15
		// @095: aload #13
		// @097: bipush 20 (0x14)
		// @099: bipush 15 (0x0F)
		// @09B: iconst_m1
		// @09C: iload #10
		// @09E: bipush 65 (0x41)
		// @0A0: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0A3: iload #15
		// @0A5: iload #11
		// @0A7: iload #16
		// @0A9: ifne @191
		// @0AC: if_icmpgt @0B6
		// @0AF: goto @0B3
		// @0B2: athrow
		// @0B3: goto @0BA
		// @0B6: iload #15
		// @0B8: istore #11
		// @0BA: aload #14
		// @0BC: bipush 90 (0x5A)
		// @0BE: bipush 15 (0x0F)
		// @0C0: iconst_m1
		// @0C1: iload #10
		// @0C3: sipush 640 (0x0280)
		// @0C6: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0C9: aload #8
		// @0CB: bipush -68 (0xBC)
		// @0CD: aload #13
		// @0CF: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @0D2: aload #8
		// @0D4: bipush -112 (0x90)
		// @0D6: aload #14
		// @0D8: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @0DB: iinc #10 +30
		// @0DE: iinc #12 +1
		// @0E1: iload #16
		// @0E3: ifeq @058
		// @0E6: aload #7
		// @0E8: iconst_0
		// @0E9: bipush 24 (0x18)
		// @0EB: iconst_m1
		// @0EC: iconst_0
		// @0ED: iload #11
		// @0EF: bipush -110 (0x92)
		// @0F1: isub
		// @0F2: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0F5: iinc #10 +15
		// @0F8: aload_0
		// @0F9: bipush 100 (0x64)
		// @0FB: aload #7
		// @0FD: getfield int game.C_100302_ka.field_101848_lb
		// @100: iload #10
		// @102: iadd
		// @103: iconst_m1
		// @104: bipush 100 (0x64)
		// @106: aload #7
		// @108: getfield int game.C_100302_ka.field_101886_Kb
		// @10B: invokevirtual game.C_100043_vl.func_101825_a(int, int, int, int, int)void
		// @10E: aload_0
		// @10F: getfield game.C_100302_ka game.C_100043_vl.field_101939_Vb
		// @112: aload #7
		// @114: getfield int game.C_100302_ka.field_101886_Kb
		// @117: bipush -20 (0xEC)
		// @119: iadd
		// @11A: bipush 15 (0x0F)
		// @11C: iconst_m1
		// @11D: iconst_5
		// @11E: bipush 15 (0x0F)
		// @120: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @123: aload #8
		// @125: iconst_0
		// @126: aload #7
		// @128: getfield int game.C_100302_ka.field_101848_lb
		// @12B: ineg
		// @12C: aload_0
		// @12D: getfield int game.C_100043_vl.field_101848_lb
		// @130: iadd
		// @131: iconst_m1
		// @132: aload #7
		// @134: getfield int game.C_100302_ka.field_101848_lb
		// @137: aload_0
		// @138: getfield int game.C_100043_vl.field_101886_Kb
		// @13B: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @13E: aload #9
		// @140: iconst_0
		// @141: bipush 15 (0x0F)
		// @143: iconst_m1
		// @144: bipush 20 (0x14)
		// @146: aload_0
		// @147: getfield int game.C_100043_vl.field_101886_Kb
		// @14A: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @14D: aload #8
		// @14F: ldc 11579568 (0xb0b0b0)
		// @151: iconst_1
		// @152: ldc 8421504 (0x808080)
		// @154: iconst_3
		// @155: ldc 2105376 (0x202020)
		// @157: aload #8
		// @159: getfield int game.C_100302_ka.field_101848_lb
		// @15C: invokestatic game.C_100265_mh.func_106563_a(int, boolean, int, int, int, int)game.C_100037_wb[]
		// @15F: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @162: aload #7
		// @164: bipush -114 (0x8E)
		// @166: aload_0
		// @167: getfield game.C_100302_ka game.C_100043_vl.field_101939_Vb
		// @16A: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @16D: aload #8
		// @16F: bipush -115 (0x8D)
		// @171: aload #9
		// @173: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @176: aload_0
		// @177: bipush -90 (0xA6)
		// @179: aload #7
		// @17B: invokevirtual game.C_100043_vl.func_101824_b(int, game.C_100302_ka)void
		// @17E: aload_0
		// @17F: bipush -115 (0x8D)
		// @181: aload #8
		// @183: invokevirtual game.C_100043_vl.func_101824_b(int, game.C_100302_ka)void
		// @186: sipush 240 (0x00F0)
		// @189: aload_0
		// @18A: getfield int game.C_100043_vl.field_101848_lb
		// @18D: ldc -517903487 (0xe1216b81)
		// @18F: ishr
		// @190: ineg
		// @191: iadd
		// @192: istore #10
		// @194: aload_0
		// @195: sipush 320 (0x0140)
		// @198: aload_0
		// @199: getfield int game.C_100043_vl.field_101886_Kb
		// @19C: ldc -1762632159 (0x96f05e21)
		// @19E: ishr
		// @19F: isub
		// @1A0: putfield int game.C_100043_vl.field_101841_Pb
		// @1A3: goto @25F
		// @1A6: astore #7
		// @1A8: aload #7
		// @1AA: new java.lang.StringBuilder
		// @1AD: dup
		// @1AE: invokespecial java.lang.StringBuilder.<init>()void
		// @1B1: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @1B4: iconst_0
		// @1B5: aaload
		// @1B6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1B9: aload_1
		// @1BA: ifnull @1C6
		// @1BD: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @1C0: iconst_2
		// @1C1: aaload
		// @1C2: goto @1CB
		// @1C5: athrow
		// @1C6: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @1C9: iconst_1
		// @1CA: aaload
		// @1CB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1CE: bipush 44 (0x2C)
		// @1D0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D3: aload_2
		// @1D4: ifnull @1E0
		// @1D7: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @1DA: iconst_2
		// @1DB: aaload
		// @1DC: goto @1E5
		// @1DF: athrow
		// @1E0: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @1E3: iconst_1
		// @1E4: aaload
		// @1E5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1E8: bipush 44 (0x2C)
		// @1EA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1ED: aload_3
		// @1EE: ifnull @1FA
		// @1F1: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @1F4: iconst_2
		// @1F5: aaload
		// @1F6: goto @1FF
		// @1F9: athrow
		// @1FA: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @1FD: iconst_1
		// @1FE: aaload
		// @1FF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @202: bipush 44 (0x2C)
		// @204: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @207: aload #4
		// @209: ifnull @215
		// @20C: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @20F: iconst_2
		// @210: aaload
		// @211: goto @21A
		// @214: athrow
		// @215: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @218: iconst_1
		// @219: aaload
		// @21A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @21D: bipush 44 (0x2C)
		// @21F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @222: aload #5
		// @224: ifnull @230
		// @227: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @22A: iconst_2
		// @22B: aaload
		// @22C: goto @235
		// @22F: athrow
		// @230: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @233: iconst_1
		// @234: aaload
		// @235: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @238: bipush 44 (0x2C)
		// @23A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @23D: aload #6
		// @23F: ifnull @24B
		// @242: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @245: iconst_2
		// @246: aaload
		// @247: goto @250
		// @24A: athrow
		// @24B: getstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @24E: iconst_1
		// @24F: aaload
		// @250: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @253: bipush 41 (0x29)
		// @255: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @258: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @25B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @25E: athrow
		// @25F: return
	}
	
	static
	{
		// @00: bipush 6 (0x06)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "`#\u000c@{x&VB:"
		// @09: invokestatic game.C_100043_vl.func_101935_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100043_vl.func_101934_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "x:N\u0010"
		// @14: invokestatic game.C_100043_vl.func_101935_z(java.lang.String)char[]
		// @17: invokestatic game.C_100043_vl.func_101934_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "ma\u000cRo"
		// @1F: invokestatic game.C_100043_vl.func_101935_z(java.lang.String)char[]
		// @22: invokestatic game.C_100043_vl.func_101934_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "`#\u000c?:"
		// @2A: invokestatic game.C_100043_vl.func_101935_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100043_vl.func_101934_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "`#\u000c>:"
		// @35: invokestatic game.C_100043_vl.func_101935_z(java.lang.String)char[]
		// @38: invokestatic game.C_100043_vl.func_101934_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "`#\u000c=:"
		// @40: invokestatic game.C_100043_vl.func_101935_z(java.lang.String)char[]
		// @43: invokestatic game.C_100043_vl.func_101934_z(char[])java.lang.String
		// @46: aastore
		// @47: putstatic java.lang.String[] game.C_100043_vl.field_101936_dc
		// @4A: iconst_0
		// @4B: putstatic int game.C_100043_vl.field_101937_Wb
		// @4E: ldc "u O\u000c}x*L\u0008a,s\r\u001f}zq"
		// @50: invokestatic game.C_100043_vl.func_101935_z(java.lang.String)char[]
		// @53: invokestatic game.C_100043_vl.func_101934_z(char[])java.lang.String
		// @56: putstatic java.lang.String game.C_100043_vl.field_101942_Xb
		// @59: iconst_1
		// @5A: newarray int[]
		// @5C: dup
		// @5D: iconst_0
		// @5E: iconst_4
		// @5F: iastore
		// @60: putstatic int[] game.C_100043_vl.field_101941_Zb
		// @63: iconst_0
		// @64: putstatic int game.C_100043_vl.field_101943_Yb
		// @67: new game.C_100013_fn
		// @6A: dup
		// @6B: iconst_0
		// @6C: invokespecial game.C_100013_fn.<init>(int)void
		// @6F: putstatic game.C_100013_fn game.C_100043_vl.field_101944_bc
		// @72: ldc "O W\\zw9G\\|yoQ\u0019|b&L\u0019~6;M\\qy!D\u0015uc=GR"
		// @74: invokestatic game.C_100043_vl.func_101935_z(java.lang.String)char[]
		// @77: invokestatic game.C_100043_vl.func_101934_z(char[])java.lang.String
		// @7A: putstatic java.lang.String game.C_100043_vl.field_101938_Ub
		// @7D: ldc "F#C\u0005wd"
		// @7F: invokestatic game.C_100043_vl.func_101935_z(java.lang.String)char[]
		// @82: invokestatic game.C_100043_vl.func_101934_z(char[])java.lang.String
		// @85: putstatic java.lang.String game.C_100043_vl.field_101940_ac
		// @88: return
	}
	
	private static char[] func_101935_z(String arg0)
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
		// @0E: bipush 18 (0x12)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_101934_z(char[] arg0)
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
		// @30: bipush 22 (0x16)
		// @32: goto @46
		// @35: bipush 79 (0x4F)
		// @37: goto @46
		// @3A: bipush 34 (0x22)
		// @3C: goto @46
		// @3F: bipush 124 (0x7C)
		// @41: goto @46
		// @44: bipush 18 (0x12)
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
