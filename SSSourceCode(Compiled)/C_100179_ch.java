package game;

final class C_100179_ch extends C_100158_da
{
	static String field_100814_m;
	static String[] field_100813_l;
	static C_100115_ej field_100811_n;
	static int[][] field_100815_j;
	C_100117_p field_100808_r;
	static String field_100810_p;
	int field_100809_q;
	C_100158_da field_100817_k;
	static int field_100812_o;
	private static final String[] field_100816_z;
	
	static final void func_100803_a(String arg0, String arg1, int arg2)
	{
		// @00: iload_2
		// @01: bipush -33 (0xDF)
		// @03: if_icmple @0F
		// @06: bipush -57 (0xC7)
		// @08: invokestatic game.C_100179_ch.func_100805_a(byte)void
		// @0B: goto @0F
		// @0E: athrow
		// @0F: getstatic game.C_100282_nh game.C_100027_hc.field_102598_S
		// @12: ifnull @21
		// @15: getstatic game.C_100282_nh game.C_100027_hc.field_102598_S
		// @18: bipush 53 (0x35)
		// @1A: invokevirtual game.C_100282_nh.func_102701_r(int)void
		// @1D: goto @21
		// @20: athrow
		// @21: new game.C_100151_bc
		// @24: dup
		// @25: aload_0
		// @26: aload_1
		// @27: iconst_0
		// @28: iconst_1
		// @29: iconst_1
		// @2A: invokespecial game.C_100151_bc.<init>(java.lang.String, java.lang.String, boolean, boolean, boolean)void
		// @2D: putstatic game.C_100151_bc game.C_100099_fb.field_103039_E
		// @30: getstatic game.C_100209_qb game.C_100318_hj.field_107201_j
		// @33: getstatic game.C_100151_bc game.C_100099_fb.field_103039_E
		// @36: bipush 75 (0x4B)
		// @38: invokevirtual game.C_100209_qb.func_102660_a(game.C_100336_im, byte)void
		// @3B: goto @93
		// @3E: astore_3
		// @3F: aload_3
		// @40: new java.lang.StringBuilder
		// @43: dup
		// @44: invokespecial java.lang.StringBuilder.<init>()void
		// @47: getstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @4A: iconst_4
		// @4B: aaload
		// @4C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4F: aload_0
		// @50: ifnull @5C
		// @53: getstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @56: iconst_0
		// @57: aaload
		// @58: goto @61
		// @5B: athrow
		// @5C: getstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @5F: iconst_2
		// @60: aaload
		// @61: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @64: bipush 44 (0x2C)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: aload_1
		// @6A: ifnull @76
		// @6D: getstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @70: iconst_0
		// @71: aaload
		// @72: goto @7B
		// @75: athrow
		// @76: getstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @79: iconst_2
		// @7A: aaload
		// @7B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7E: bipush 44 (0x2C)
		// @80: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @83: iload_2
		// @84: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @87: bipush 41 (0x29)
		// @89: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @92: athrow
		// @93: return
	}
	
	static final C_100217_ao[] func_100802_e(int arg0)
	{
		// @00: iload_0
		// @01: sipush -28085 (0x924B)
		// @04: if_icmpeq @11
		// @07: bipush 121 (0x79)
		// @09: invokestatic game.C_100179_ch.func_100802_e(int)game.C_100217_ao[]
		// @0C: pop
		// @0D: goto @11
		// @10: athrow
		// @11: bipush 14 (0x0E)
		// @13: anewarray game.C_100217_ao
		// @16: dup
		// @17: iconst_0
		// @18: getstatic game.C_100217_ao game.C_100269_ml.field_101121_q
		// @1B: aastore
		// @1C: dup
		// @1D: iconst_1
		// @1E: getstatic game.C_100217_ao game.C_100172_ck.field_102110_dc
		// @21: aastore
		// @22: dup
		// @23: iconst_2
		// @24: getstatic game.C_100217_ao game.C_100080_b.field_104435_c
		// @27: aastore
		// @28: dup
		// @29: iconst_3
		// @2A: getstatic game.C_100217_ao game.C_100162_sc.field_102861_P
		// @2D: aastore
		// @2E: dup
		// @2F: iconst_4
		// @30: getstatic game.C_100217_ao game.C_100146_bf.field_105125_b
		// @33: aastore
		// @34: dup
		// @35: iconst_5
		// @36: getstatic game.C_100217_ao game.C_100273_mm.field_106681_d
		// @39: aastore
		// @3A: dup
		// @3B: bipush 6 (0x06)
		// @3D: getstatic game.C_100217_ao game.C_100189_ri.field_105751_f
		// @40: aastore
		// @41: dup
		// @42: bipush 7 (0x07)
		// @44: getstatic game.C_100217_ao game.C_100053_vn.field_102837_Q
		// @47: aastore
		// @48: dup
		// @49: bipush 8 (0x08)
		// @4B: getstatic game.C_100217_ao game.C_100114_q.field_100490_A
		// @4E: aastore
		// @4F: dup
		// @50: bipush 9 (0x09)
		// @52: getstatic game.C_100217_ao game.C_100134_tj.field_105007_d
		// @55: aastore
		// @56: dup
		// @57: bipush 10 (0x0A)
		// @59: getstatic game.C_100217_ao game.C_100176_ci.field_105625_c
		// @5C: aastore
		// @5D: dup
		// @5E: bipush 11 (0x0B)
		// @60: getstatic game.C_100217_ao game.C_100044_vm.field_100947_q
		// @63: aastore
		// @64: dup
		// @65: bipush 12 (0x0C)
		// @67: getstatic game.C_100217_ao game.C_100338_jc.field_105369_a
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 13 (0x0D)
		// @6E: getstatic game.C_100217_ao game.C_100081_ue.field_100672_n
		// @71: aastore
		// @72: areturn
		// @73: astore_1
		// @74: aload_1
		// @75: new java.lang.StringBuilder
		// @78: dup
		// @79: invokespecial java.lang.StringBuilder.<init>()void
		// @7C: getstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @7F: iconst_5
		// @80: aaload
		// @81: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @84: iload_0
		// @85: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @88: bipush 41 (0x29)
		// @8A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @90: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @93: athrow
	}
	
	public static void func_100805_a(byte arg0)
	{
		// @00: aconst_null
		// @01: checkcast int[][]
		// @04: putstatic int[][] game.C_100179_ch.field_100815_j
		// @07: aconst_null
		// @08: putstatic java.lang.String game.C_100179_ch.field_100810_p
		// @0B: aconst_null
		// @0C: putstatic java.lang.String game.C_100179_ch.field_100814_m
		// @0F: aconst_null
		// @10: putstatic game.C_100115_ej game.C_100179_ch.field_100811_n
		// @13: aconst_null
		// @14: putstatic java.lang.String[] game.C_100179_ch.field_100813_l
		// @17: iload_0
		// @18: bipush 95 (0x5F)
		// @1A: if_icmpgt @27
		// @1D: aconst_null
		// @1E: checkcast int[][]
		// @21: checkcast int[][]
		// @24: putstatic int[][] game.C_100179_ch.field_100815_j
		// @27: goto @4B
		// @2A: astore_1
		// @2B: aload_1
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @36: iconst_3
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_0
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 41 (0x29)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @47: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4A: athrow
		// @4B: return
	}
	
	static final int func_100807_a(boolean arg0, int arg1, C_100302_ka arg2, int arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #16
		// @005: getstatic int game.C_100200_ba.field_105852_c
		// @008: iconst_m1
		// @009: ixor
		// @00A: bipush -2 (0xFE)
		// @00C: if_icmpeq @01D
		// @00F: bipush 82 (0x52)
		// @011: invokestatic game.C_100044_vm.func_100933_a(byte)boolean
		// @014: ifne @01D
		// @017: goto @01B
		// @01A: athrow
		// @01B: iload_1
		// @01C: ireturn
		// @01D: iload_3
		// @01E: bipush 66 (0x42)
		// @020: if_icmpge @031
		// @023: aconst_null
		// @024: checkcast int[][]
		// @027: checkcast int[][]
		// @02A: putstatic int[][] game.C_100179_ch.field_100815_j
		// @02D: goto @031
		// @030: athrow
		// @031: iconst_1
		// @032: getstatic int game.C_100200_ba.field_105852_c
		// @035: if_icmpne @03E
		// @038: bipush 78 (0x4E)
		// @03A: goto @040
		// @03D: athrow
		// @03E: bipush 64 (0x40)
		// @040: istore #4
		// @042: iconst_0
		// @043: getstatic int game.C_100200_ba.field_105852_c
		// @046: sipush 1008 (0x03F0)
		// @049: iand
		// @04A: if_icmpne @051
		// @04D: goto @055
		// @050: athrow
		// @051: bipush 36 (0x24)
		// @053: istore #4
		// @055: getstatic int game.C_100233_oa.field_106250_h
		// @058: istore #5
		// @05A: iconst_1
		// @05B: istore #7
		// @05D: iconst_1
		// @05E: istore #8
		// @060: iconst_0
		// @061: istore #9
		// @063: iload #8
		// @065: iconst_m1
		// @066: ixor
		// @067: getstatic int game.C_100200_ba.field_105852_c
		// @06A: iconst_m1
		// @06B: ixor
		// @06C: if_icmplt @2E1
		// @06F: iload #8
		// @071: getstatic int game.C_100200_ba.field_105852_c
		// @074: iand
		// @075: iconst_m1
		// @076: ixor
		// @077: iload #16
		// @079: ifne @2E2
		// @07C: iconst_m1
		// @07D: if_icmpne @08D
		// @080: goto @084
		// @083: athrow
		// @084: iload #16
		// @086: ifeq @2D2
		// @089: goto @08D
		// @08C: athrow
		// @08D: iconst_1
		// @08E: istore #10
		// @090: iload #8
		// @092: iconst_m1
		// @093: ixor
		// @094: bipush -2 (0xFE)
		// @096: if_icmpne @09D
		// @099: goto @0A9
		// @09C: athrow
		// @09D: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0A0: iload #8
		// @0A2: ldc 65536 (0x10000)
		// @0A4: invokevirtual game.C_100327_ib.func_102461_d(int, int)boolean
		// @0A7: istore #10
		// @0A9: iconst_0
		// @0AA: istore #11
		// @0AC: bipush -2 (0xFE)
		// @0AE: iload #8
		// @0B0: iconst_m1
		// @0B1: ixor
		// @0B2: if_icmpne @0B8
		// @0B5: iconst_1
		// @0B6: istore #11
		// @0B8: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @0BB: bipush 111 (0x6F)
		// @0BD: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @0C0: checkcast game.C_100327_ib
		// @0C3: astore #12
		// @0C5: aload #12
		// @0C7: ifnull @2D2
		// @0CA: aload #12
		// @0CC: getfield int game.C_100327_ib.field_102497_w
		// @0CF: iload #8
		// @0D1: iand
		// @0D2: iconst_m1
		// @0D3: ixor
		// @0D4: iconst_m1
		// @0D5: iload #16
		// @0D7: ifne @2D9
		// @0DA: if_icmpne @0EA
		// @0DD: goto @0E1
		// @0E0: athrow
		// @0E1: iload #16
		// @0E3: ifeq @2C0
		// @0E6: goto @0EA
		// @0E9: athrow
		// @0EA: iconst_2
		// @0EB: istore #6
		// @0ED: aload #12
		// @0EF: getfield int game.C_100327_ib.field_102494_P
		// @0F2: getstatic int[] game.C_100257_ln.field_106481_d
		// @0F5: bipush -120 (0x88)
		// @0F7: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @0FA: ifne @101
		// @0FD: goto @104
		// @100: athrow
		// @101: iconst_0
		// @102: istore #6
		// @104: iload_0
		// @105: ifeq @11A
		// @108: iload #6
		// @10A: ifeq @17C
		// @10D: goto @111
		// @110: athrow
		// @111: iload #16
		// @113: ifeq @2C0
		// @116: goto @11A
		// @119: athrow
		// @11A: iconst_m1
		// @11B: iload #6
		// @11D: iconst_m1
		// @11E: ixor
		// @11F: if_icmpeq @2C0
		// @122: goto @126
		// @125: athrow
		// @126: bipush -2 (0xFE)
		// @128: aload #12
		// @12A: getfield int game.C_100327_ib.field_102497_w
		// @12D: iconst_m1
		// @12E: ixor
		// @12F: if_icmpeq @15B
		// @132: goto @136
		// @135: athrow
		// @136: getstatic int[] game.C_100257_ln.field_106481_d
		// @139: bipush -82 (0xAE)
		// @13B: getstatic int[] game.C_100066_dl.field_101632_G
		// @13E: aload #12
		// @140: getfield int game.C_100327_ib.field_102494_P
		// @143: bipush -55 (0xC9)
		// @145: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @148: invokestatic game.C_100292_jk.func_101212_a(int[], byte, int[], int, boolean)boolean
		// @14B: ifne @17C
		// @14E: goto @152
		// @151: athrow
		// @152: iload #16
		// @154: ifeq @2C0
		// @157: goto @15B
		// @15A: athrow
		// @15B: bipush -123 (0x85)
		// @15D: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @160: getstatic int[] game.C_100257_ln.field_106481_d
		// @163: aload #12
		// @165: getfield int game.C_100327_ib.field_102494_P
		// @168: iconst_0
		// @169: invokestatic game.C_100171_cn.func_105561_a(boolean, int[], int, boolean)boolean
		// @16C: ifne @17C
		// @16F: goto @173
		// @172: athrow
		// @173: iload #16
		// @175: ifeq @2C0
		// @178: goto @17C
		// @17B: athrow
		// @17C: bipush -3 (0xFD)
		// @17E: iload #6
		// @180: iconst_m1
		// @181: ixor
		// @182: if_icmpne @1A3
		// @185: goto @189
		// @188: athrow
		// @189: getstatic int[] game.C_100242_oh.field_106342_g
		// @18C: aload #12
		// @18E: getfield int game.C_100327_ib.field_102494_P
		// @191: iaload
		// @192: getstatic int game.C_100096_un.field_104563_d
		// @195: if_icmple @1A0
		// @198: goto @19C
		// @19B: athrow
		// @19C: goto @1A3
		// @19F: athrow
		// @1A0: iconst_1
		// @1A1: istore #6
		// @1A3: iload #7
		// @1A5: ifeq @23D
		// @1A8: iconst_0
		// @1A9: istore #7
		// @1AB: new game.C_100302_ka
		// @1AE: dup
		// @1AF: ldc2_w -1
		// @1B2: aconst_null
		// @1B3: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @1B6: astore #13
		// @1B8: aload #13
		// @1BA: getstatic game.C_100037_wb game.C_100223_ab.field_106101_c
		// @1BD: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @1C0: aload #13
		// @1C2: iconst_2
		// @1C3: putfield int game.C_100302_ka.field_101850_Fb
		// @1C6: aload #13
		// @1C8: iconst_0
		// @1C9: bipush 18 (0x12)
		// @1CB: iconst_m1
		// @1CC: iload_1
		// @1CD: iload #5
		// @1CF: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1D2: aload_2
		// @1D3: bipush -88 (0xA8)
		// @1D5: aload #13
		// @1D7: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @1DA: iload_0
		// @1DB: ifne @1E5
		// @1DE: getstatic java.lang.String game.C_100238_ol.field_101700_H
		// @1E1: goto @1E8
		// @1E4: athrow
		// @1E5: getstatic java.lang.String game.C_100304_kl.field_107115_c
		// @1E8: astore #14
		// @1EA: new game.C_100302_ka
		// @1ED: dup
		// @1EE: ldc2_w -1
		// @1F1: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @1F4: aload #14
		// @1F6: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @1F9: astore #15
		// @1FB: aload #15
		// @1FD: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @200: putfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @203: aload #15
		// @205: iconst_0
		// @206: putfield int game.C_100302_ka.field_101830_gb
		// @209: aload #15
		// @20B: iconst_0
		// @20C: bipush 18 (0x12)
		// @20E: iconst_m1
		// @20F: iload_1
		// @210: iload #5
		// @212: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @215: aload #15
		// @217: aconst_null
		// @218: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @21B: aload #15
		// @21D: iconst_1
		// @21E: putfield int game.C_100302_ka.field_101875_X
		// @221: aload #15
		// @223: iconst_1
		// @224: putfield int game.C_100302_ka.field_101858_J
		// @227: aload #15
		// @229: iconst_1
		// @22A: putfield int game.C_100302_ka.field_101850_Fb
		// @22D: aload_2
		// @22E: bipush -94 (0xA2)
		// @230: aload #15
		// @232: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @235: iload_1
		// @236: aload #15
		// @238: getfield int game.C_100302_ka.field_101848_lb
		// @23B: iadd
		// @23C: istore_1
		// @23D: iload #11
		// @23F: ifne @28D
		// @242: iconst_1
		// @243: istore #11
		// @245: getstatic java.lang.String[] game.C_100061_dh.field_101991_Ub
		// @248: iload #9
		// @24A: aaload
		// @24B: astore #13
		// @24D: new game.C_100302_ka
		// @250: dup
		// @251: ldc2_w -1
		// @254: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @257: aload #13
		// @259: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @25C: astore #14
		// @25E: aload #14
		// @260: iconst_1
		// @261: putfield int game.C_100302_ka.field_101850_Fb
		// @264: iinc #1 +2
		// @267: aload #14
		// @269: getstatic game.C_100037_wb[] game.C_100321_hi.field_107228_h
		// @26C: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @26F: aload #14
		// @271: ldc 11119017 (0xa9a9a9)
		// @273: putfield int game.C_100302_ka.field_101830_gb
		// @276: aload #14
		// @278: iconst_0
		// @279: bipush 15 (0x0F)
		// @27B: iconst_m1
		// @27C: iload_1
		// @27D: iload #5
		// @27F: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @282: iinc #1 +15
		// @285: aload_2
		// @286: bipush -85 (0xAB)
		// @288: aload #14
		// @28A: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @28D: iload_0
		// @28E: iload #10
		// @290: ifne @298
		// @293: iconst_1
		// @294: goto @299
		// @297: athrow
		// @298: iconst_0
		// @299: aload #12
		// @29B: bipush -118 (0x8A)
		// @29D: iload #6
		// @29F: invokestatic game.C_100080_b.func_104422_a(boolean, boolean, game.C_100327_ib, int, int)game.C_100302_ka
		// @2A2: astore #13
		// @2A4: iinc #1 +2
		// @2A7: aload #13
		// @2A9: iconst_0
		// @2AA: iload #4
		// @2AC: iconst_m1
		// @2AD: iload_1
		// @2AE: iload #5
		// @2B0: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @2B3: aload_2
		// @2B4: bipush -72 (0xB8)
		// @2B6: aload #13
		// @2B8: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @2BB: iload_1
		// @2BC: iload #4
		// @2BE: iadd
		// @2BF: istore_1
		// @2C0: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @2C3: bipush 113 (0x71)
		// @2C5: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @2C8: checkcast game.C_100327_ib
		// @2CB: astore #12
		// @2CD: iload #16
		// @2CF: ifeq @0C5
		// @2D2: iinc #9 +1
		// @2D5: iload #8
		// @2D7: ldc -2101209439 (0x82c216a1)
		// @2D9: ishl
		// @2DA: istore #8
		// @2DC: iload #16
		// @2DE: ifeq @063
		// @2E1: iload_1
		// @2E2: ireturn
		// @2E3: astore #4
		// @2E5: aload #4
		// @2E7: new java.lang.StringBuilder
		// @2EA: dup
		// @2EB: invokespecial java.lang.StringBuilder.<init>()void
		// @2EE: getstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @2F1: iconst_1
		// @2F2: aaload
		// @2F3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F6: iload_0
		// @2F7: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @2FA: bipush 44 (0x2C)
		// @2FC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2FF: iload_1
		// @300: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @303: bipush 44 (0x2C)
		// @305: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @308: aload_2
		// @309: ifnull @315
		// @30C: getstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @30F: iconst_0
		// @310: aaload
		// @311: goto @31A
		// @314: athrow
		// @315: getstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @318: iconst_2
		// @319: aaload
		// @31A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @31D: bipush 44 (0x2C)
		// @31F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @322: iload_3
		// @323: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @326: bipush 41 (0x29)
		// @328: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @32B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @32E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @331: athrow
	}
	
	C_100179_ch(C_100117_p arg0, C_100158_da arg1)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100158_da.<init>()void
		// @04: aload_0
		// @05: aload_1
		// @06: putfield game.C_100117_p game.C_100179_ch.field_100808_r
		// @09: aload_0
		// @0A: aload_1
		// @0B: invokevirtual game.C_100117_p.func_100988_j()int
		// @0E: putfield int game.C_100179_ch.field_100809_q
		// @11: aload_0
		// @12: aload_2
		// @13: putfield game.C_100158_da game.C_100179_ch.field_100817_k
		// @16: aload_0
		// @17: getfield game.C_100117_p game.C_100179_ch.field_100808_r
		// @1A: sipush 128 (0x0080)
		// @1D: aload_0
		// @1E: getfield int game.C_100179_ch.field_100809_q
		// @21: getstatic int game.C_100216_aj.field_104467_z
		// @24: imul
		// @25: iadd
		// @26: ldc 209634024 (0xc7ec2e8)
		// @28: ishr
		// @29: invokevirtual game.C_100117_p.func_100984_i(int)void
		// @2C: goto @7C
		// @2F: astore_3
		// @30: aload_3
		// @31: new java.lang.StringBuilder
		// @34: dup
		// @35: invokespecial java.lang.StringBuilder.<init>()void
		// @38: getstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @3B: bipush 6 (0x06)
		// @3D: aaload
		// @3E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @41: aload_1
		// @42: ifnull @4E
		// @45: getstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @48: iconst_0
		// @49: aaload
		// @4A: goto @53
		// @4D: athrow
		// @4E: getstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @51: iconst_2
		// @52: aaload
		// @53: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @56: bipush 44 (0x2C)
		// @58: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B: aload_2
		// @5C: ifnull @68
		// @5F: getstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @62: iconst_0
		// @63: aaload
		// @64: goto @6D
		// @67: athrow
		// @68: getstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @6B: iconst_2
		// @6C: aaload
		// @6D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @70: bipush 41 (0x29)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @78: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7B: athrow
		// @7C: return
	}
	
	static
	{
		// @000: bipush 7 (0x07)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "<1J X"
		// @009: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "$wJJ\r"
		// @014: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @017: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc ")j\u0008b"
		// @01F: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @022: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "$wJM\r"
		// @02A: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "$wJO\r"
		// @035: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @038: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "$wJL\r"
		// @040: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @043: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "$wJ2L)v\u00100\r"
		// @04C: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @052: aastore
		// @053: putstatic java.lang.String[] game.C_100179_ch.field_100816_z
		// @056: bipush 12 (0x0C)
		// @058: anewarray java.lang.String
		// @05B: dup
		// @05C: iconst_0
		// @05D: ldc "\u0000p\u0008kH"
		// @05F: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @062: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @065: aastore
		// @066: dup
		// @067: iconst_1
		// @068: ldc "\u0014s\u0005x@"
		// @06A: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @06D: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @070: aastore
		// @071: dup
		// @072: iconst_2
		// @073: ldc "\u0006n\u0011gI&"
		// @075: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @078: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @07B: aastore
		// @07C: dup
		// @07D: iconst_3
		// @07E: ldc "\u0013j\u0016zI\""
		// @080: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @083: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @086: aastore
		// @087: dup
		// @088: iconst_4
		// @089: ldc "\u0004p\tcD){\u000b"
		// @08B: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @08E: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @091: aastore
		// @092: dup
		// @093: iconst_5
		// @094: ldc "\u000fj\u0016|L$~\nk"
		// @096: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @099: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @09C: aastore
		// @09D: dup
		// @09E: bipush 6 (0x06)
		// @0A0: ldc "\u0014|\u000b|U.p\n"
		// @0A2: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @0A5: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @0A8: aastore
		// @0A9: dup
		// @0AA: bipush 7 (0x07)
		// @0AC: ldc "\u0004m\u0011}M\"m"
		// @0AE: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @0B1: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @0B4: aastore
		// @0B5: dup
		// @0B6: bipush 8 (0x08)
		// @0B8: ldc "\u0005z\u0016zM&"
		// @0BA: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @0BD: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @0C0: aastore
		// @0C1: dup
		// @0C2: bipush 9 (0x09)
		// @0C4: ldc "\u0008m\u0006gQ&s"
		// @0C6: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @0C9: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @0CC: aastore
		// @0CD: dup
		// @0CE: bipush 10 (0x0A)
		// @0D0: ldc "\u0011~\u0008fD+s\u0005"
		// @0D2: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @0D5: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @0D8: aastore
		// @0D9: dup
		// @0DA: bipush 11 (0x0B)
		// @0DC: ldc "\u0005~\u0006kI"
		// @0DE: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @0E1: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @0E4: aastore
		// @0E5: putstatic java.lang.String[] game.C_100179_ch.field_100813_l
		// @0E8: bipush 30 (0x1E)
		// @0EA: anewarray int[]
		// @0ED: dup
		// @0EE: iconst_0
		// @0EF: iconst_0
		// @0F0: newarray int[]
		// @0F2: aastore
		// @0F3: dup
		// @0F4: iconst_1
		// @0F5: iconst_0
		// @0F6: newarray int[]
		// @0F8: aastore
		// @0F9: dup
		// @0FA: iconst_2
		// @0FB: iconst_1
		// @0FC: newarray int[]
		// @0FE: dup
		// @0FF: iconst_0
		// @100: bipush 17 (0x11)
		// @102: iastore
		// @103: aastore
		// @104: dup
		// @105: iconst_3
		// @106: iconst_1
		// @107: newarray int[]
		// @109: dup
		// @10A: iconst_0
		// @10B: iconst_0
		// @10C: iastore
		// @10D: aastore
		// @10E: dup
		// @10F: iconst_4
		// @110: iconst_1
		// @111: newarray int[]
		// @113: dup
		// @114: iconst_0
		// @115: iconst_5
		// @116: iastore
		// @117: aastore
		// @118: dup
		// @119: iconst_5
		// @11A: iconst_1
		// @11B: newarray int[]
		// @11D: dup
		// @11E: iconst_0
		// @11F: bipush 16 (0x10)
		// @121: iastore
		// @122: aastore
		// @123: dup
		// @124: bipush 6 (0x06)
		// @126: iconst_1
		// @127: newarray int[]
		// @129: dup
		// @12A: iconst_0
		// @12B: bipush 10 (0x0A)
		// @12D: iastore
		// @12E: aastore
		// @12F: dup
		// @130: bipush 7 (0x07)
		// @132: iconst_1
		// @133: newarray int[]
		// @135: dup
		// @136: iconst_0
		// @137: bipush 21 (0x15)
		// @139: iastore
		// @13A: aastore
		// @13B: dup
		// @13C: bipush 8 (0x08)
		// @13E: iconst_0
		// @13F: newarray int[]
		// @141: aastore
		// @142: dup
		// @143: bipush 9 (0x09)
		// @145: iconst_1
		// @146: newarray int[]
		// @148: dup
		// @149: iconst_0
		// @14A: bipush 26 (0x1A)
		// @14C: iastore
		// @14D: aastore
		// @14E: dup
		// @14F: bipush 10 (0x0A)
		// @151: iconst_1
		// @152: newarray int[]
		// @154: dup
		// @155: iconst_0
		// @156: iconst_1
		// @157: iastore
		// @158: aastore
		// @159: dup
		// @15A: bipush 11 (0x0B)
		// @15C: iconst_1
		// @15D: newarray int[]
		// @15F: dup
		// @160: iconst_0
		// @161: bipush 6 (0x06)
		// @163: iastore
		// @164: aastore
		// @165: dup
		// @166: bipush 12 (0x0C)
		// @168: iconst_1
		// @169: newarray int[]
		// @16B: dup
		// @16C: iconst_0
		// @16D: bipush 22 (0x16)
		// @16F: iastore
		// @170: aastore
		// @171: dup
		// @172: bipush 13 (0x0D)
		// @174: iconst_1
		// @175: newarray int[]
		// @177: dup
		// @178: iconst_0
		// @179: bipush 33 (0x21)
		// @17B: iastore
		// @17C: aastore
		// @17D: dup
		// @17E: bipush 14 (0x0E)
		// @180: iconst_0
		// @181: newarray int[]
		// @183: aastore
		// @184: dup
		// @185: bipush 15 (0x0F)
		// @187: iconst_1
		// @188: newarray int[]
		// @18A: dup
		// @18B: iconst_0
		// @18C: bipush 11 (0x0B)
		// @18E: iastore
		// @18F: aastore
		// @190: dup
		// @191: bipush 16 (0x10)
		// @193: iconst_1
		// @194: newarray int[]
		// @196: dup
		// @197: iconst_0
		// @198: bipush 18 (0x12)
		// @19A: iastore
		// @19B: aastore
		// @19C: dup
		// @19D: bipush 17 (0x11)
		// @19F: iconst_0
		// @1A0: newarray int[]
		// @1A2: aastore
		// @1A3: dup
		// @1A4: bipush 18 (0x12)
		// @1A6: iconst_1
		// @1A7: newarray int[]
		// @1A9: dup
		// @1AA: iconst_0
		// @1AB: bipush 28 (0x1C)
		// @1AD: iastore
		// @1AE: aastore
		// @1AF: dup
		// @1B0: bipush 19 (0x13)
		// @1B2: iconst_3
		// @1B3: newarray int[]
		// @1B5: dup
		// @1B6: iconst_0
		// @1B7: bipush 27 (0x1B)
		// @1B9: iastore
		// @1BA: dup
		// @1BB: iconst_1
		// @1BC: bipush 32 (0x20)
		// @1BE: iastore
		// @1BF: dup
		// @1C0: iconst_2
		// @1C1: bipush 29 (0x1D)
		// @1C3: iastore
		// @1C4: aastore
		// @1C5: dup
		// @1C6: bipush 20 (0x14)
		// @1C8: iconst_1
		// @1C9: newarray int[]
		// @1CB: dup
		// @1CC: iconst_0
		// @1CD: bipush 7 (0x07)
		// @1CF: iastore
		// @1D0: aastore
		// @1D1: dup
		// @1D2: bipush 21 (0x15)
		// @1D4: iconst_1
		// @1D5: newarray int[]
		// @1D7: dup
		// @1D8: iconst_0
		// @1D9: iconst_2
		// @1DA: iastore
		// @1DB: aastore
		// @1DC: dup
		// @1DD: bipush 22 (0x16)
		// @1DF: iconst_0
		// @1E0: newarray int[]
		// @1E2: aastore
		// @1E3: dup
		// @1E4: bipush 23 (0x17)
		// @1E6: iconst_0
		// @1E7: newarray int[]
		// @1E9: aastore
		// @1EA: dup
		// @1EB: bipush 24 (0x18)
		// @1ED: iconst_1
		// @1EE: newarray int[]
		// @1F0: dup
		// @1F1: iconst_0
		// @1F2: bipush 12 (0x0C)
		// @1F4: iastore
		// @1F5: aastore
		// @1F6: dup
		// @1F7: bipush 25 (0x19)
		// @1F9: iconst_0
		// @1FA: newarray int[]
		// @1FC: aastore
		// @1FD: dup
		// @1FE: bipush 26 (0x1A)
		// @200: iconst_0
		// @201: newarray int[]
		// @203: aastore
		// @204: dup
		// @205: bipush 27 (0x1B)
		// @207: iconst_1
		// @208: newarray int[]
		// @20A: dup
		// @20B: iconst_0
		// @20C: bipush 19 (0x13)
		// @20E: iastore
		// @20F: aastore
		// @210: dup
		// @211: bipush 28 (0x1C)
		// @213: iconst_0
		// @214: newarray int[]
		// @216: aastore
		// @217: dup
		// @218: bipush 29 (0x1D)
		// @21A: iconst_1
		// @21B: newarray int[]
		// @21D: dup
		// @21E: iconst_0
		// @21F: bipush 30 (0x1E)
		// @221: iastore
		// @222: aastore
		// @223: putstatic int[][] game.C_100179_ch.field_100815_j
		// @226: ldc "\u000fZ%Bq\u000f"
		// @228: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @22B: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @22E: putstatic java.lang.String game.C_100179_ch.field_100814_m
		// @231: ldc "\u0012q\u0002aW3j\noQ\"s\u001d.\\(jDoW\"?\naQgz\u0008gB.}\u0008k\u00053pDmW\"~\u0010k\u0005&qDoF$p\u0011`Qi"
		// @233: invokestatic game.C_100179_ch.func_100806_z(java.lang.String)char[]
		// @236: invokestatic game.C_100179_ch.func_100804_z(char[])java.lang.String
		// @239: putstatic java.lang.String game.C_100179_ch.field_100810_p
		// @23C: return
	}
	
	private static char[] func_100806_z(String arg0)
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
	
	private static String func_100804_z(char[] arg0)
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
		// @30: bipush 71 (0x47)
		// @32: goto @46
		// @35: bipush 31 (0x1F)
		// @37: goto @46
		// @3A: bipush 100 (0x64)
		// @3C: goto @46
		// @3F: bipush 14 (0x0E)
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
