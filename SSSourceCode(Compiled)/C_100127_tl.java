package game;

final class C_100127_tl
{
	static C_100280_nf field_104945_f;
	static C_100037_wb[] field_104949_c;
	static C_100302_ka field_104946_d;
	static int field_104950_a;
	static C_100265_mh field_104948_b;
	private C_100037_wb[] field_104947_e;
	private static final String[] field_104951_z;
	
	public static void func_104941_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100265_mh game.C_100127_tl.field_104948_b
		// @04: aconst_null
		// @05: putstatic game.C_100037_wb[] game.C_100127_tl.field_104949_c
		// @08: aconst_null
		// @09: putstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @0C: aconst_null
		// @0D: putstatic game.C_100302_ka game.C_100127_tl.field_104946_d
		// @10: iload_0
		// @11: bipush 98 (0x62)
		// @13: if_icmpge @21
		// @16: aconst_null
		// @17: checkcast game.C_100302_ka
		// @1A: bipush 26 (0x1A)
		// @1C: bipush 66 (0x42)
		// @1E: invokestatic game.C_100127_tl.func_104940_a(game.C_100302_ka, int, int)void
		// @21: goto @45
		// @24: astore_1
		// @25: aload_1
		// @26: new java.lang.StringBuilder
		// @29: dup
		// @2A: invokespecial java.lang.StringBuilder.<init>()void
		// @2D: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @30: iconst_3
		// @31: aaload
		// @32: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35: iload_0
		// @36: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @39: bipush 41 (0x29)
		// @3B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @41: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @44: athrow
		// @45: return
	}
	
	static final void func_104940_a(C_100302_ka arg0, int arg1, int arg2)
	{
		// @000: aconst_null
		// @001: iload_2
		// @002: lconst_0
		// @003: bipush 68 (0x44)
		// @005: iconst_m1
		// @006: aconst_null
		// @007: aconst_null
		// @008: aload_0
		// @009: aconst_null
		// @00A: invokestatic game.C_100096_un.func_104559_a(java.lang.String, int, long, int, int, int[], java.lang.String, game.C_100302_ka, game.C_100115_ej)void
		// @00D: iconst_0
		// @00E: iload_2
		// @00F: if_icmpne @06F
		// @012: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @015: astore_3
		// @016: getstatic game.C_100037_wb[] game.C_100165_sh.field_100771_q
		// @019: iconst_0
		// @01A: aaload
		// @01B: astore #4
		// @01D: getstatic java.lang.String game.C_100069_vb.field_104359_c
		// @020: astore #5
		// @022: aload_3
		// @023: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @026: aload #4
		// @028: bipush -99 (0x9D)
		// @02A: bipush 11 (0x0B)
		// @02C: aload #5
		// @02E: invokevirtual game.C_100270_mi.func_102257_a(game.C_100037_wb, int, int, java.lang.String)void
		// @031: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @034: astore_3
		// @035: getstatic game.C_100037_wb[] game.C_100165_sh.field_100771_q
		// @038: iconst_1
		// @039: aaload
		// @03A: astore #4
		// @03C: getstatic java.lang.String game.C_100028_ha.field_103945_g
		// @03F: astore #5
		// @041: aload_3
		// @042: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @045: aload #4
		// @047: bipush -77 (0xB3)
		// @049: bipush 12 (0x0C)
		// @04B: aload #5
		// @04D: invokevirtual game.C_100270_mi.func_102257_a(game.C_100037_wb, int, int, java.lang.String)void
		// @050: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @053: astore_3
		// @054: getstatic game.C_100037_wb[] game.C_100165_sh.field_100771_q
		// @057: iconst_2
		// @058: aaload
		// @059: astore #4
		// @05B: getstatic java.lang.String game.C_100097_k.field_104580_d
		// @05E: astore #5
		// @060: aload_3
		// @061: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @064: aload #4
		// @066: bipush -116 (0x8C)
		// @068: bipush 13 (0x0D)
		// @06A: aload #5
		// @06C: invokevirtual game.C_100270_mi.func_102257_a(game.C_100037_wb, int, int, java.lang.String)void
		// @06F: iload_2
		// @070: iconst_m1
		// @071: ixor
		// @072: bipush -2 (0xFE)
		// @074: if_icmpne @0D4
		// @077: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @07A: astore_3
		// @07B: getstatic game.C_100037_wb[] game.C_100165_sh.field_100771_q
		// @07E: iconst_0
		// @07F: aaload
		// @080: astore #4
		// @082: getstatic java.lang.String game.C_100282_nh.field_102707_Pb
		// @085: astore #5
		// @087: aload_3
		// @088: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @08B: aload #4
		// @08D: bipush -93 (0xA3)
		// @08F: bipush 11 (0x0B)
		// @091: aload #5
		// @093: invokevirtual game.C_100270_mi.func_102257_a(game.C_100037_wb, int, int, java.lang.String)void
		// @096: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @099: astore_3
		// @09A: getstatic game.C_100037_wb[] game.C_100165_sh.field_100771_q
		// @09D: iconst_1
		// @09E: aaload
		// @09F: astore #4
		// @0A1: getstatic java.lang.String game.C_100017_wj.field_103825_i
		// @0A4: astore #5
		// @0A6: aload_3
		// @0A7: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @0AA: aload #4
		// @0AC: bipush -125 (0x83)
		// @0AE: bipush 12 (0x0C)
		// @0B0: aload #5
		// @0B2: invokevirtual game.C_100270_mi.func_102257_a(game.C_100037_wb, int, int, java.lang.String)void
		// @0B5: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @0B8: astore_3
		// @0B9: getstatic game.C_100037_wb[] game.C_100165_sh.field_100771_q
		// @0BC: iconst_2
		// @0BD: aaload
		// @0BE: astore #4
		// @0C0: getstatic java.lang.String game.C_100290_jm.field_106861_c
		// @0C3: astore #5
		// @0C5: aload_3
		// @0C6: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @0C9: aload #4
		// @0CB: bipush -108 (0x94)
		// @0CD: bipush 13 (0x0D)
		// @0CF: aload #5
		// @0D1: invokevirtual game.C_100270_mi.func_102257_a(game.C_100037_wb, int, int, java.lang.String)void
		// @0D4: iload_2
		// @0D5: iconst_m1
		// @0D6: ixor
		// @0D7: bipush -3 (0xFD)
		// @0D9: if_icmpne @139
		// @0DC: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @0DF: astore_3
		// @0E0: getstatic game.C_100037_wb[] game.C_100165_sh.field_100771_q
		// @0E3: iconst_0
		// @0E4: aaload
		// @0E5: astore #4
		// @0E7: getstatic java.lang.String game.C_100012_fh.field_100511_O
		// @0EA: astore #5
		// @0EC: aload_3
		// @0ED: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @0F0: aload #4
		// @0F2: bipush -48 (0xD0)
		// @0F4: bipush 11 (0x0B)
		// @0F6: aload #5
		// @0F8: invokevirtual game.C_100270_mi.func_102257_a(game.C_100037_wb, int, int, java.lang.String)void
		// @0FB: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @0FE: astore_3
		// @0FF: getstatic game.C_100037_wb[] game.C_100165_sh.field_100771_q
		// @102: iconst_1
		// @103: aaload
		// @104: astore #4
		// @106: getstatic java.lang.String game.C_100164_se.field_105451_e
		// @109: astore #5
		// @10B: aload_3
		// @10C: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @10F: aload #4
		// @111: bipush -56 (0xC8)
		// @113: bipush 12 (0x0C)
		// @115: aload #5
		// @117: invokevirtual game.C_100270_mi.func_102257_a(game.C_100037_wb, int, int, java.lang.String)void
		// @11A: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @11D: astore_3
		// @11E: getstatic game.C_100037_wb[] game.C_100165_sh.field_100771_q
		// @121: iconst_2
		// @122: aaload
		// @123: astore #4
		// @125: getstatic java.lang.String game.C_100268_mk.field_106668_e
		// @128: astore #5
		// @12A: aload_3
		// @12B: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @12E: aload #4
		// @130: bipush -116 (0x8C)
		// @132: bipush 13 (0x0D)
		// @134: aload #5
		// @136: invokevirtual game.C_100270_mi.func_102257_a(game.C_100037_wb, int, int, java.lang.String)void
		// @139: iload_1
		// @13A: bipush 55 (0x37)
		// @13C: if_icmpge @148
		// @13F: bipush -42 (0xD6)
		// @141: invokestatic game.C_100127_tl.func_104941_a(int)void
		// @144: goto @148
		// @147: athrow
		// @148: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @14B: astore_3
		// @14C: aload_0
		// @14D: getfield int game.C_100302_ka.field_101840_Eb
		// @150: istore #4
		// @152: aload_0
		// @153: getfield int game.C_100302_ka.field_101835_xb
		// @156: istore #5
		// @158: aload_0
		// @159: getfield int game.C_100302_ka.field_101886_Kb
		// @15C: istore #6
		// @15E: aload_0
		// @15F: getfield int game.C_100302_ka.field_101848_lb
		// @162: istore #7
		// @164: aload_3
		// @165: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @168: iload #4
		// @16A: iload #5
		// @16C: iload #7
		// @16E: bipush 99 (0x63)
		// @170: iload #6
		// @172: invokevirtual game.C_100270_mi.func_102261_b(int, int, int, int, int)void
		// @175: goto @1BC
		// @178: astore_3
		// @179: aload_3
		// @17A: new java.lang.StringBuilder
		// @17D: dup
		// @17E: invokespecial java.lang.StringBuilder.<init>()void
		// @181: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @184: iconst_4
		// @185: aaload
		// @186: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @189: aload_0
		// @18A: ifnull @196
		// @18D: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @190: iconst_1
		// @191: aaload
		// @192: goto @19B
		// @195: athrow
		// @196: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @199: iconst_0
		// @19A: aaload
		// @19B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @19E: bipush 44 (0x2C)
		// @1A0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1A3: iload_1
		// @1A4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1A7: bipush 44 (0x2C)
		// @1A9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1AC: iload_2
		// @1AD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1B0: bipush 41 (0x29)
		// @1B2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1B5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1B8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1BB: athrow
		// @1BC: return
	}
	
	static final C_100033_gj func_104939_a(C_100302_ka arg0, C_100073_f arg1, C_100302_ka arg2, int arg3, C_100302_ka arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #17
		// @005: aconst_null
		// @006: aload_1
		// @007: if_acmpne @00C
		// @00A: aconst_null
		// @00B: areturn
		// @00C: aload_1
		// @00D: getfield int[] game.C_100073_f.field_101713_v
		// @010: ifnonnull @018
		// @013: iconst_0
		// @014: goto @01D
		// @017: athrow
		// @018: aload_1
		// @019: getfield int[] game.C_100073_f.field_101713_v
		// @01C: arraylength
		// @01D: istore #5
		// @01F: iload_3
		// @020: sipush 20136 (0x4EA8)
		// @023: if_icmpeq @02F
		// @026: bipush -53 (0xCB)
		// @028: putstatic int game.C_100127_tl.field_104950_a
		// @02B: goto @02F
		// @02E: athrow
		// @02F: aconst_null
		// @030: aload_1
		// @031: getfield int[] game.C_100073_f.field_101721_y
		// @034: if_acmpne @03C
		// @037: iconst_0
		// @038: goto @041
		// @03B: athrow
		// @03C: aload_1
		// @03D: getfield int[] game.C_100073_f.field_101721_y
		// @040: arraylength
		// @041: istore #6
		// @043: iload #5
		// @045: iload #6
		// @047: iadd
		// @048: istore #7
		// @04A: iload #7
		// @04C: anewarray java.lang.String
		// @04F: astore #8
		// @051: iload #7
		// @053: newarray char[]
		// @055: astore #9
		// @057: iload #7
		// @059: newarray int[]
		// @05B: astore #10
		// @05D: iload #7
		// @05F: anewarray game.C_100033_gj
		// @062: astore #11
		// @064: aload_1
		// @065: getfield int[] game.C_100073_f.field_101713_v
		// @068: ifnonnull @06F
		// @06B: goto @0C7
		// @06E: athrow
		// @06F: iconst_0
		// @070: istore #12
		// @072: aload_1
		// @073: getfield int[] game.C_100073_f.field_101713_v
		// @076: arraylength
		// @077: iload #12
		// @079: if_icmple @0C7
		// @07C: getstatic game.C_100283_ni game.C_100027_hc.field_102603_X
		// @07F: aload_1
		// @080: getfield int[] game.C_100073_f.field_101713_v
		// @083: iload #12
		// @085: iaload
		// @086: bipush 6 (0x06)
		// @088: invokevirtual game.C_100283_ni.func_106754_a(int, int)game.C_100073_f
		// @08B: astore #13
		// @08D: aload #8
		// @08F: iload #12
		// @091: aload #13
		// @093: getfield java.lang.String game.C_100073_f.field_101714_u
		// @096: aastore
		// @097: aload #9
		// @099: iload #12
		// @09B: aload_1
		// @09C: getfield char[] game.C_100073_f.field_101722_x
		// @09F: iload #12
		// @0A1: caload
		// @0A2: castore
		// @0A3: aload #11
		// @0A5: iload #12
		// @0A7: aload_0
		// @0A8: aload #13
		// @0AA: aload_2
		// @0AB: iload_3
		// @0AC: iconst_0
		// @0AD: invokestatic game.C_100089_fa.func_103722_a(int, int)int
		// @0B0: aload #4
		// @0B2: invokestatic game.C_100127_tl.func_104939_a(game.C_100302_ka, game.C_100073_f, game.C_100302_ka, int, game.C_100302_ka)game.C_100033_gj
		// @0B5: aastore
		// @0B6: iinc #12 +1
		// @0B9: iload #17
		// @0BB: ifne @191
		// @0BE: iload #17
		// @0C0: ifeq @072
		// @0C3: goto @0C7
		// @0C6: athrow
		// @0C7: aconst_null
		// @0C8: aload_1
		// @0C9: getfield int[] game.C_100073_f.field_101721_y
		// @0CC: if_acmpeq @191
		// @0CF: iload #5
		// @0D1: istore #12
		// @0D3: bipush 49 (0x31)
		// @0D5: istore #13
		// @0D7: iconst_0
		// @0D8: istore #14
		// @0DA: aload_1
		// @0DB: getfield int[] game.C_100073_f.field_101721_y
		// @0DE: arraylength
		// @0DF: iconst_m1
		// @0E0: ixor
		// @0E1: iload #14
		// @0E3: iconst_m1
		// @0E4: ixor
		// @0E5: if_icmpge @191
		// @0E8: aload_1
		// @0E9: getfield int[] game.C_100073_f.field_101721_y
		// @0EC: iload #14
		// @0EE: iaload
		// @0EF: istore #15
		// @0F1: iconst_m1
		// @0F2: iload #15
		// @0F4: if_icmpeq @15C
		// @0F7: getstatic game.C_100137_bn game.C_100302_ka.field_101847_wb
		// @0FA: iload #15
		// @0FC: bipush 28 (0x1C)
		// @0FE: invokevirtual game.C_100137_bn.func_105026_a(int, byte)game.C_100066_dl
		// @101: astore #16
		// @103: aload #8
		// @105: iload #14
		// @107: iload #12
		// @109: iadd
		// @10A: aload #16
		// @10C: iload_3
		// @10D: sipush -20102 (0xB17A)
		// @110: iadd
		// @111: invokevirtual game.C_100066_dl.func_101620_k(int)java.lang.String
		// @114: aastore
		// @115: aload #9
		// @117: iload #14
		// @119: iload #12
		// @11B: iadd
		// @11C: aload_1
		// @11D: getfield char[] game.C_100073_f.field_101712_w
		// @120: iload #14
		// @122: caload
		// @123: castore
		// @124: iconst_m1
		// @125: aload #9
		// @127: iload #12
		// @129: iload #14
		// @12B: iadd
		// @12C: caload
		// @12D: iconst_m1
		// @12E: ixor
		// @12F: if_icmple @136
		// @132: goto @147
		// @135: athrow
		// @136: aload #9
		// @138: iload #14
		// @13A: iload #12
		// @13C: iadd
		// @13D: iload #13
		// @13F: iload #13
		// @141: iconst_1
		// @142: iadd
		// @143: i2c
		// @144: istore #13
		// @146: castore
		// @147: aload #10
		// @149: iload #12
		// @14B: iload #14
		// @14D: ineg
		// @14E: isub
		// @14F: aload_1
		// @150: getfield int[] game.C_100073_f.field_101721_y
		// @153: iload #14
		// @155: iaload
		// @156: iastore
		// @157: iload #17
		// @159: ifeq @189
		// @15C: aload #8
		// @15E: iload #14
		// @160: iload #12
		// @162: iadd
		// @163: getstatic java.lang.String game.C_100111_el.field_104858_f
		// @166: aastore
		// @167: aload #9
		// @169: iload #14
		// @16B: iload #12
		// @16D: iadd
		// @16E: aload_1
		// @16F: getfield char[] game.C_100073_f.field_101712_w
		// @172: iload #14
		// @174: caload
		// @175: castore
		// @176: aload #10
		// @178: iload #14
		// @17A: iload #12
		// @17C: iadd
		// @17D: aload_1
		// @17E: getfield int[] game.C_100073_f.field_101721_y
		// @181: iload #14
		// @183: iaload
		// @184: iastore
		// @185: goto @189
		// @188: athrow
		// @189: iinc #14 +1
		// @18C: iload #17
		// @18E: ifeq @0DA
		// @191: new game.C_100033_gj
		// @194: dup
		// @195: lconst_0
		// @196: aload #4
		// @198: aload_2
		// @199: aload_0
		// @19A: aload #11
		// @19C: aload #10
		// @19E: aload #8
		// @1A0: aload #9
		// @1A2: invokespecial game.C_100033_gj.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100033_gj[], int[], java.lang.String[], char[])void
		// @1A5: areturn
		// @1A6: astore #5
		// @1A8: aload #5
		// @1AA: new java.lang.StringBuilder
		// @1AD: dup
		// @1AE: invokespecial java.lang.StringBuilder.<init>()void
		// @1B1: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @1B4: iconst_5
		// @1B5: aaload
		// @1B6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1B9: aload_0
		// @1BA: ifnull @1C6
		// @1BD: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @1C0: iconst_1
		// @1C1: aaload
		// @1C2: goto @1CB
		// @1C5: athrow
		// @1C6: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @1C9: iconst_0
		// @1CA: aaload
		// @1CB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1CE: bipush 44 (0x2C)
		// @1D0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D3: aload_1
		// @1D4: ifnull @1E0
		// @1D7: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @1DA: iconst_1
		// @1DB: aaload
		// @1DC: goto @1E5
		// @1DF: athrow
		// @1E0: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @1E3: iconst_0
		// @1E4: aaload
		// @1E5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1E8: bipush 44 (0x2C)
		// @1EA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1ED: aload_2
		// @1EE: ifnull @1FA
		// @1F1: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @1F4: iconst_1
		// @1F5: aaload
		// @1F6: goto @1FF
		// @1F9: athrow
		// @1FA: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @1FD: iconst_0
		// @1FE: aaload
		// @1FF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @202: bipush 44 (0x2C)
		// @204: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @207: iload_3
		// @208: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @20B: bipush 44 (0x2C)
		// @20D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @210: aload #4
		// @212: ifnull @21E
		// @215: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @218: iconst_1
		// @219: aaload
		// @21A: goto @223
		// @21D: athrow
		// @21E: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @221: iconst_0
		// @222: aaload
		// @223: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @226: bipush 41 (0x29)
		// @228: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @22B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @22E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @231: athrow
	}
	
	C_100127_tl(C_100037_wb[] arg0)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: aload_1
		// @06: putfield game.C_100037_wb[] game.C_100127_tl.field_104947_e
		// @09: goto @3E
		// @0C: astore_2
		// @0D: aload_2
		// @0E: new java.lang.StringBuilder
		// @11: dup
		// @12: invokespecial java.lang.StringBuilder.<init>()void
		// @15: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @18: iconst_2
		// @19: aaload
		// @1A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D: aload_1
		// @1E: ifnull @2A
		// @21: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @24: iconst_1
		// @25: aaload
		// @26: goto @2F
		// @29: athrow
		// @2A: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @2D: iconst_0
		// @2E: aaload
		// @2F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @32: bipush 41 (0x29)
		// @34: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @37: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3D: athrow
		// @3E: return
	}
	
	final void func_104944_a(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: iload #4
		// @02: bipush 11 (0x0B)
		// @04: if_icmpeq @12
		// @07: aconst_null
		// @08: checkcast game.C_100037_wb[]
		// @0B: putstatic game.C_100037_wb[] game.C_100127_tl.field_104949_c
		// @0E: goto @12
		// @11: athrow
		// @12: iconst_m1
		// @13: iload #5
		// @15: aload_0
		// @16: getfield game.C_100037_wb[] game.C_100127_tl.field_104947_e
		// @19: iload_1
		// @1A: iload_2
		// @1B: iload_3
		// @1C: invokestatic game.C_100100_i.func_102009_a(int, int, game.C_100037_wb[], int, int, int)void
		// @1F: goto @6C
		// @22: astore #6
		// @24: aload #6
		// @26: new java.lang.StringBuilder
		// @29: dup
		// @2A: invokespecial java.lang.StringBuilder.<init>()void
		// @2D: getstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @30: bipush 6 (0x06)
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: iload_1
		// @37: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3A: bipush 44 (0x2C)
		// @3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F: iload_2
		// @40: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @43: bipush 44 (0x2C)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: iload_3
		// @49: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4C: bipush 44 (0x2C)
		// @4E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @51: iload #4
		// @53: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @56: bipush 44 (0x2C)
		// @58: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B: iload #5
		// @5D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @60: bipush 41 (0x29)
		// @62: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @65: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @68: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6B: athrow
		// @6C: return
	}
	
	static
	{
		// @00: bipush 7 (0x07)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\u0016\u0003CR"
		// @09: invokestatic game.C_100127_tl.func_104943_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100127_tl.func_104942_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u0003X\u0001\u0010X"
		// @14: invokestatic game.C_100127_tl.func_104943_z(java.lang.String)char[]
		// @17: invokestatic game.C_100127_tl.func_104942_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u000c\u001a\u0001\u0002L\u0016\u001f[\u0000\r"
		// @1F: invokestatic game.C_100127_tl.func_104943_z(java.lang.String)char[]
		// @22: invokestatic game.C_100127_tl.func_104942_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\u000c\u001a\u0001|\r"
		// @2A: invokestatic game.C_100127_tl.func_104943_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100127_tl.func_104942_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\u000c\u001a\u0001z\r"
		// @35: invokestatic game.C_100127_tl.func_104943_z(java.lang.String)char[]
		// @38: invokestatic game.C_100127_tl.func_104942_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\u000c\u001a\u0001}\r"
		// @40: invokestatic game.C_100127_tl.func_104943_z(java.lang.String)char[]
		// @43: invokestatic game.C_100127_tl.func_104942_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "\u000c\u001a\u0001\u007f\r"
		// @4C: invokestatic game.C_100127_tl.func_104943_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100127_tl.func_104942_z(char[])java.lang.String
		// @52: aastore
		// @53: putstatic java.lang.String[] game.C_100127_tl.field_104951_z
		// @56: new game.C_100280_nf
		// @59: dup
		// @5A: sipush 256 (0x0100)
		// @5D: invokespecial game.C_100280_nf.<init>(int)void
		// @60: putstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @63: return
	}
	
	private static char[] func_104943_z(String arg0)
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
		// @0E: bipush 37 (0x25)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104942_z(char[] arg0)
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
		// @30: bipush 120 (0x78)
		// @32: goto @46
		// @35: bipush 118 (0x76)
		// @37: goto @46
		// @3A: bipush 47 (0x2F)
		// @3C: goto @46
		// @3F: bipush 62 (0x3E)
		// @41: goto @46
		// @44: bipush 37 (0x25)
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
