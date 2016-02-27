package game;

final class C_100167_sj extends C_100158_da
{
	int[] field_100790_k;
	static String field_100801_x;
	int[] field_100787_l;
	static int field_100793_u;
	C_100331_ie[] field_100795_s;
	int[] field_100789_j;
	static String field_100791_w;
	static String[] field_100794_t;
	static C_100302_ka field_100797_q;
	byte[][][] field_100785_n;
	static String field_100786_o;
	int field_100792_v;
	C_100331_ie[] field_100798_p;
	int field_100800_y;
	static C_100037_wb[] field_100796_r;
	static int[][] field_100788_m;
	private static final String[] field_100799_z;
	
	static final void func_100780_a(C_100277_nc arg0, boolean arg1, int arg2, int arg3, byte arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #19
		// @005: iconst_3
		// @006: iload_2
		// @007: iload_3
		// @008: ineg
		// @009: iadd
		// @00A: imul
		// @00B: sipush 18986 (0x4A2A)
		// @00E: invokestatic game.C_100310_lj.func_100538_b(int, int)int
		// @011: istore #5
		// @013: iconst_3
		// @014: iload_3
		// @015: imul
		// @016: istore #6
		// @018: iload #5
		// @01A: bipush 10 (0x0A)
		// @01C: isub
		// @01D: istore #7
		// @01F: iload #4
		// @021: bipush -109 (0x93)
		// @023: if_icmple @027
		// @026: return
		// @027: iconst_0
		// @028: invokestatic game.C_100265_mh.func_106560_b(int)void
		// @02B: iconst_0
		// @02C: aload_0
		// @02D: getfield byte game.C_100277_nc.field_106729_l
		// @030: if_icmpge @046
		// @033: aload_0
		// @034: getfield byte[] game.C_100277_nc.field_106718_R
		// @037: ifnonnull @042
		// @03A: goto @03E
		// @03D: athrow
		// @03E: goto @046
		// @041: athrow
		// @042: iconst_0
		// @043: invokestatic game.C_100321_hi.func_107207_a(int)void
		// @046: iconst_0
		// @047: putstatic int game.C_100122_em.field_102080_ac
		// @04A: iconst_0
		// @04B: istore #8
		// @04D: iload #8
		// @04F: iconst_m1
		// @050: ixor
		// @051: aload_0
		// @052: getfield short game.C_100277_nc.field_106721_g
		// @055: iconst_m1
		// @056: ixor
		// @057: if_icmple @1D7
		// @05A: aload_0
		// @05B: getfield short[] game.C_100277_nc.field_106733_h
		// @05E: iload #8
		// @060: saload
		// @061: istore #9
		// @063: aload_0
		// @064: getfield short[] game.C_100277_nc.field_106717_S
		// @067: iload #8
		// @069: saload
		// @06A: istore #10
		// @06C: aload_0
		// @06D: getfield short[] game.C_100277_nc.field_106743_z
		// @070: iload #8
		// @072: saload
		// @073: istore #11
		// @075: iload_1
		// @076: iload #19
		// @078: ifne @1D8
		// @07B: ifeq @0D3
		// @07E: goto @082
		// @081: athrow
		// @082: getstatic int[] game.C_100017_wj.field_103824_h
		// @085: iload #9
		// @087: iaload
		// @088: istore #12
		// @08A: getstatic int[] game.C_100110_s.field_104845_e
		// @08D: iload #9
		// @08F: iaload
		// @090: istore #13
		// @092: iload #12
		// @094: ineg
		// @095: getstatic int[] game.C_100017_wj.field_103824_h
		// @098: iload #10
		// @09A: iaload
		// @09B: iadd
		// @09C: istore #14
		// @09E: iload #12
		// @0A0: ineg
		// @0A1: getstatic int[] game.C_100017_wj.field_103824_h
		// @0A4: iload #11
		// @0A6: iaload
		// @0A7: iadd
		// @0A8: istore #15
		// @0AA: iload #13
		// @0AC: ineg
		// @0AD: getstatic int[] game.C_100110_s.field_104845_e
		// @0B0: iload #10
		// @0B2: iaload
		// @0B3: iadd
		// @0B4: istore #16
		// @0B6: getstatic int[] game.C_100110_s.field_104845_e
		// @0B9: iload #11
		// @0BB: iaload
		// @0BC: iload #13
		// @0BE: ineg
		// @0BF: iadd
		// @0C0: istore #17
		// @0C2: iconst_m1
		// @0C3: iload #14
		// @0C5: iload #17
		// @0C7: imul
		// @0C8: iload #16
		// @0CA: iload #15
		// @0CC: imul
		// @0CD: isub
		// @0CE: iconst_m1
		// @0CF: ixor
		// @0D0: if_icmpge @1CF
		// @0D3: getstatic int[] game.C_100316_lc.field_102405_E
		// @0D6: iload #9
		// @0D8: iaload
		// @0D9: istore #12
		// @0DB: ldc -2147483648 (0x80000000)
		// @0DD: iload #12
		// @0DF: if_icmpeq @1CF
		// @0E2: getstatic int[] game.C_100316_lc.field_102405_E
		// @0E5: iload #10
		// @0E7: iaload
		// @0E8: istore #13
		// @0EA: iload #13
		// @0EC: ldc -2147483648 (0x80000000)
		// @0EE: if_icmpne @0FA
		// @0F1: iload #19
		// @0F3: ifeq @1CF
		// @0F6: goto @0FA
		// @0F9: athrow
		// @0FA: getstatic int[] game.C_100316_lc.field_102405_E
		// @0FD: iload #11
		// @0FF: iaload
		// @100: istore #14
		// @102: ldc 2147483647 (0x7fffffff)
		// @104: iload #14
		// @106: iconst_m1
		// @107: ixor
		// @108: if_icmpne @114
		// @10B: iload #19
		// @10D: ifeq @1CF
		// @110: goto @114
		// @113: athrow
		// @114: iload #6
		// @116: ineg
		// @117: iload #14
		// @119: iload #12
		// @11B: iadd
		// @11C: iadd
		// @11D: iload #13
		// @11F: ineg
		// @120: isub
		// @121: istore #15
		// @123: iconst_m1
		// @124: getstatic int[] game.C_100231_oc.field_102192_dc
		// @127: arraylength
		// @128: iload #7
		// @12A: iflt @136
		// @12D: iload #15
		// @12F: iload #7
		// @131: ishr
		// @132: goto @13C
		// @135: athrow
		// @136: iload #15
		// @138: iload #7
		// @13A: ineg
		// @13B: ishl
		// @13C: isub
		// @13D: iadd
		// @13E: istore #16
		// @140: getstatic int[] game.C_100231_oc.field_102192_dc
		// @143: iload #16
		// @145: iaload
		// @146: istore #17
		// @148: iconst_0
		// @149: iload #17
		// @14B: ldc 1263210692 (0x4b4b10c4)
		// @14D: ishr
		// @14E: if_icmpeq @185
		// @151: iinc #16 +255
		// @154: iconst_m1
		// @155: iload #16
		// @157: iconst_m1
		// @158: ixor
		// @159: iload #19
		// @15B: ifne @18C
		// @15E: if_icmplt @168
		// @161: goto @165
		// @164: athrow
		// @165: goto @178
		// @168: getstatic java.io.PrintStream java.lang.System.err
		// @16B: getstatic java.lang.String[] game.C_100167_sj.field_100799_z
		// @16E: iconst_5
		// @16F: aaload
		// @170: invokevirtual java.io.PrintStream.println(java.lang.String)void
		// @173: iload #19
		// @175: ifeq @1CF
		// @178: getstatic int[] game.C_100231_oc.field_102192_dc
		// @17B: iload #16
		// @17D: iaload
		// @17E: istore #17
		// @180: iload #19
		// @182: ifeq @148
		// @185: iload #17
		// @187: iload #16
		// @189: ldc 459821604 (0x1b685224)
		// @18B: ishl
		// @18C: iadd
		// @18D: istore #18
		// @18F: getstatic int[] game.C_100093_fd.field_102781_W
		// @192: iload #18
		// @194: iload #8
		// @196: iastore
		// @197: getstatic int[] game.C_100231_oc.field_102192_dc
		// @19A: iload #16
		// @19C: iconst_1
		// @19D: iload #17
		// @19F: iadd
		// @1A0: iastore
		// @1A1: iconst_0
		// @1A2: aload_0
		// @1A3: getfield byte game.C_100277_nc.field_106729_l
		// @1A6: if_icmpge @1C7
		// @1A9: aload_0
		// @1AA: getfield byte[] game.C_100277_nc.field_106718_R
		// @1AD: ifnonnull @1B8
		// @1B0: goto @1B4
		// @1B3: athrow
		// @1B4: goto @1C7
		// @1B7: athrow
		// @1B8: getstatic int[] game.C_100226_ae.field_106151_c
		// @1BB: aload_0
		// @1BC: getfield byte[] game.C_100277_nc.field_106718_R
		// @1BF: iload #8
		// @1C1: baload
		// @1C2: dup2
		// @1C3: iaload
		// @1C4: iconst_1
		// @1C5: iadd
		// @1C6: iastore
		// @1C7: getstatic int game.C_100122_em.field_102080_ac
		// @1CA: iconst_1
		// @1CB: iadd
		// @1CC: putstatic int game.C_100122_em.field_102080_ac
		// @1CF: iinc #8 +1
		// @1D2: iload #19
		// @1D4: ifeq @04D
		// @1D7: iconst_m1
		// @1D8: aload_0
		// @1D9: getfield byte game.C_100277_nc.field_106729_l
		// @1DC: iconst_m1
		// @1DD: ixor
		// @1DE: if_icmple @224
		// @1E1: aconst_null
		// @1E2: aload_0
		// @1E3: getfield byte[] game.C_100277_nc.field_106718_R
		// @1E6: if_acmpeq @224
		// @1E9: goto @1ED
		// @1EC: athrow
		// @1ED: iconst_0
		// @1EE: istore #8
		// @1F0: iconst_0
		// @1F1: istore #9
		// @1F3: iload #9
		// @1F5: getstatic int[] game.C_100226_ae.field_106151_c
		// @1F8: arraylength
		// @1F9: if_icmpge @224
		// @1FC: getstatic int[] game.C_100226_ae.field_106151_c
		// @1FF: iload #9
		// @201: iaload
		// @202: istore #10
		// @204: getstatic int[] game.C_100226_ae.field_106151_c
		// @207: iload #9
		// @209: iload #8
		// @20B: iastore
		// @20C: iload #8
		// @20E: iload #10
		// @210: iadd
		// @211: istore #8
		// @213: iinc #9 +1
		// @216: iload #19
		// @218: ifne @280
		// @21B: iload #19
		// @21D: ifeq @1F3
		// @220: goto @224
		// @223: athrow
		// @224: goto @280
		// @227: astore #5
		// @229: aload #5
		// @22B: new java.lang.StringBuilder
		// @22E: dup
		// @22F: invokespecial java.lang.StringBuilder.<init>()void
		// @232: getstatic java.lang.String[] game.C_100167_sj.field_100799_z
		// @235: iconst_3
		// @236: aaload
		// @237: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23A: aload_0
		// @23B: ifnull @247
		// @23E: getstatic java.lang.String[] game.C_100167_sj.field_100799_z
		// @241: iconst_2
		// @242: aaload
		// @243: goto @24C
		// @246: athrow
		// @247: getstatic java.lang.String[] game.C_100167_sj.field_100799_z
		// @24A: iconst_4
		// @24B: aaload
		// @24C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @24F: bipush 44 (0x2C)
		// @251: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @254: iload_1
		// @255: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @258: bipush 44 (0x2C)
		// @25A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @25D: iload_2
		// @25E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @261: bipush 44 (0x2C)
		// @263: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @266: iload_3
		// @267: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @26A: bipush 44 (0x2C)
		// @26C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @26F: iload #4
		// @271: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @274: bipush 41 (0x29)
		// @276: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @279: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @27C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @27F: athrow
		// @280: return
	}
	
	public static void func_100783_a(boolean arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String[] game.C_100167_sj.field_100794_t
		// @04: aconst_null
		// @05: putstatic game.C_100037_wb[] game.C_100167_sj.field_100796_r
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100167_sj.field_100791_w
		// @0C: iload_0
		// @0D: ifeq @11
		// @10: return
		// @11: aconst_null
		// @12: putstatic game.C_100302_ka game.C_100167_sj.field_100797_q
		// @15: aconst_null
		// @16: putstatic java.lang.String game.C_100167_sj.field_100786_o
		// @19: aconst_null
		// @1A: putstatic java.lang.String game.C_100167_sj.field_100801_x
		// @1D: aconst_null
		// @1E: checkcast int[][]
		// @21: putstatic int[][] game.C_100167_sj.field_100788_m
		// @24: goto @48
		// @27: astore_1
		// @28: aload_1
		// @29: new java.lang.StringBuilder
		// @2C: dup
		// @2D: invokespecial java.lang.StringBuilder.<init>()void
		// @30: getstatic java.lang.String[] game.C_100167_sj.field_100799_z
		// @33: iconst_1
		// @34: aaload
		// @35: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @38: iload_0
		// @39: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @3C: bipush 41 (0x29)
		// @3E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @41: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @44: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @47: athrow
		// @48: return
	}
	
	static final void func_100784_e(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: iload_0
		// @006: ldc 459821604 (0x1b685224)
		// @008: if_icmpeq @00C
		// @00B: return
		// @00C: getstatic int game.C_100197_ra.field_100866_s
		// @00F: ineg
		// @010: getstatic int game.C_100033_gj.field_101920_oc
		// @013: iadd
		// @014: istore_1
		// @015: getstatic int game.C_100101_fc.field_103406_X
		// @018: iload_1
		// @019: ldc 1891182209 (0x70b92681)
		// @01B: ishr
		// @01C: isub
		// @01D: putstatic int game.C_100197_ra.field_100866_s
		// @020: getstatic int game.C_100163_sf.field_105436_d
		// @023: getstatic int game.C_100093_fd.field_102785_S
		// @026: ldc -1690938655 (0x9b3652e1)
		// @028: ishr
		// @029: ineg
		// @02A: iadd
		// @02B: putstatic int game.C_100078_ul.field_103291_rb
		// @02E: getstatic int game.C_100197_ra.field_100866_s
		// @031: iload_1
		// @032: iadd
		// @033: putstatic int game.C_100033_gj.field_101920_oc
		// @036: getstatic int game.C_100078_ul.field_103291_rb
		// @039: istore_2
		// @03A: iconst_0
		// @03B: istore_3
		// @03C: getstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @03F: arraylength
		// @040: iconst_m1
		// @041: ixor
		// @042: iload_3
		// @043: iconst_m1
		// @044: ixor
		// @045: if_icmpge @15B
		// @048: getstatic int[] game.C_100338_jc.field_105364_g
		// @04B: iload_3
		// @04C: iaload
		// @04D: istore #4
		// @04F: iload #10
		// @051: ifne @17F
		// @054: iconst_0
		// @055: iload #4
		// @057: if_icmpgt @085
		// @05A: goto @05E
		// @05D: athrow
		// @05E: getstatic game.C_100333_ij game.C_100143_bl.field_105101_d
		// @061: getfield int game.C_100333_ij.field_107347_b
		// @064: iconst_m1
		// @065: ixor
		// @066: iload #4
		// @068: iconst_m1
		// @069: ixor
		// @06A: if_icmpne @07B
		// @06D: goto @071
		// @070: athrow
		// @071: getstatic int game.C_100185_rm.field_105490_h
		// @074: istore #5
		// @076: iload #10
		// @078: ifeq @08A
		// @07B: getstatic int game.C_100101_fc.field_103399_Q
		// @07E: istore #5
		// @080: iload #10
		// @082: ifeq @08A
		// @085: getstatic int game.C_100057_dd.field_104257_b
		// @088: istore #5
		// @08A: getstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @08D: iload_3
		// @08E: aaload
		// @08F: astore #6
		// @091: iconst_m1
		// @092: iload #4
		// @094: iconst_m1
		// @095: ixor
		// @096: if_icmplt @09E
		// @099: iconst_1
		// @09A: goto @09F
		// @09D: athrow
		// @09E: iconst_0
		// @09F: aload #6
		// @0A1: sipush 17493 (0x4455)
		// @0A4: invokestatic game.C_100223_ab.func_106097_a(boolean, java.lang.String, int)int
		// @0A7: istore #7
		// @0A9: iload #7
		// @0AB: ldc -2005078335 (0x887ceec1)
		// @0AD: ishr
		// @0AE: ineg
		// @0AF: getstatic int game.C_100101_fc.field_103406_X
		// @0B2: iadd
		// @0B3: istore #8
		// @0B5: iconst_0
		// @0B6: iload #4
		// @0B8: if_icmple @0BF
		// @0BB: goto @10E
		// @0BE: athrow
		// @0BF: iload_2
		// @0C0: getstatic int game.C_100283_ni.field_106755_f
		// @0C3: iadd
		// @0C4: istore_2
		// @0C5: getstatic game.C_100333_ij game.C_100143_bl.field_105101_d
		// @0C8: getfield int game.C_100333_ij.field_107347_b
		// @0CB: iload #4
		// @0CD: if_icmpeq @0D7
		// @0D0: getstatic game.C_100127_tl game.C_100311_le.field_104715_v
		// @0D3: goto @0DA
		// @0D6: athrow
		// @0D7: getstatic game.C_100127_tl game.C_100059_df.field_101614_t
		// @0DA: astore #9
		// @0DC: aload #9
		// @0DE: ifnull @108
		// @0E1: aload #9
		// @0E3: iload #8
		// @0E5: getstatic int game.C_100099_fb.field_103048_s
		// @0E8: ineg
		// @0E9: iadd
		// @0EA: getstatic int game.C_100003_ga.field_103539_s
		// @0ED: getstatic int game.C_100180_ce.field_104811_r
		// @0F0: ldc -781808319 (0xd1668d41)
		// @0F2: ishl
		// @0F3: ineg
		// @0F4: isub
		// @0F5: iload_2
		// @0F6: bipush 11 (0x0B)
		// @0F8: getstatic int game.C_100099_fb.field_103048_s
		// @0FB: ldc 1960239681 (0x74d6e241)
		// @0FD: ishl
		// @0FE: iload #7
		// @100: iadd
		// @101: invokevirtual game.C_100127_tl.func_104944_a(int, int, int, int, int)void
		// @104: goto @108
		// @107: athrow
		// @108: iload_2
		// @109: getstatic int game.C_100180_ce.field_104811_r
		// @10C: iadd
		// @10D: istore_2
		// @10E: iconst_m1
		// @10F: iload #4
		// @111: iconst_m1
		// @112: ixor
		// @113: if_icmpge @133
		// @116: getstatic game.C_100112_r game.C_100060_di.field_104269_d
		// @119: aload #6
		// @11B: iload #8
		// @11D: iload_2
		// @11E: getstatic int game.C_100097_k.field_104582_b
		// @121: iadd
		// @122: iload #5
		// @124: iconst_m1
		// @125: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @128: iload_2
		// @129: getstatic int game.C_100239_oi.field_102307_w
		// @12C: iadd
		// @12D: istore_2
		// @12E: iload #10
		// @130: ifeq @153
		// @133: getstatic game.C_100112_r game.C_100045_vj.field_100609_m
		// @136: aload #6
		// @138: iload #8
		// @13A: iload_2
		// @13B: getstatic int game.C_100110_s.field_104848_a
		// @13E: iadd
		// @13F: iload #5
		// @141: iconst_m1
		// @142: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @145: iload_2
		// @146: getstatic int game.C_100283_ni.field_106755_f
		// @149: getstatic int game.C_100180_ce.field_104811_r
		// @14C: iadd
		// @14D: getstatic int game.C_100003_ga.field_103539_s
		// @150: iadd
		// @151: iadd
		// @152: istore_2
		// @153: iinc #3 +1
		// @156: iload #10
		// @158: ifeq @03C
		// @15B: goto @17F
		// @15E: astore_1
		// @15F: aload_1
		// @160: new java.lang.StringBuilder
		// @163: dup
		// @164: invokespecial java.lang.StringBuilder.<init>()void
		// @167: getstatic java.lang.String[] game.C_100167_sj.field_100799_z
		// @16A: iconst_0
		// @16B: aaload
		// @16C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16F: iload_0
		// @170: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @173: bipush 41 (0x29)
		// @175: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @178: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @17B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @17E: athrow
		// @17F: return
	}
	
	static
	{
		// @000: bipush 6 (0x06)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "4X 51"
		// @009: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "4X 41"
		// @014: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @017: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "<\u001c Xd"
		// @01F: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @022: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "4X 71"
		// @02A: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc ")Gb\u001a"
		// @035: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @038: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "\u0008GzVv!\u0012|\u0017w W/"
		// @040: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @043: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @046: aastore
		// @047: putstatic java.lang.String[] game.C_100167_sj.field_100799_z
		// @04A: ldc "\u0012\\o\u0014u\"\u0012z\u00199#Wb\u0013m\"\u0012h\u0004p\"\\jV4gAw\u0005m\"_.\u0014l4K"
		// @04C: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @052: putstatic java.lang.String game.C_100167_sj.field_100801_x
		// @055: bipush 34 (0x22)
		// @057: anewarray java.lang.String
		// @05A: dup
		// @05B: iconst_0
		// @05C: ldc "\u000b[i\u001emg@k\u0017z3]|"
		// @05E: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @061: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @064: aastore
		// @065: dup
		// @066: iconst_1
		// @067: ldc "\u0004]|\u001395Wo\u0015m(@"
		// @069: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @06C: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @06F: aastore
		// @070: dup
		// @071: iconst_2
		// @072: ldc "\u0003Go\u001a95Wo\u0015m(@"
		// @074: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @077: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @07A: aastore
		// @07B: dup
		// @07C: iconst_3
		// @07D: ldc "\u000fWo\u0000`g@k\u0017z3]|"
		// @07F: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @082: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @085: aastore
		// @086: dup
		// @087: iconst_4
		// @088: ldc "\u0001G}\u001fv)\u0012|\u0013x$Fa\u0004"
		// @08A: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @08D: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @090: aastore
		// @091: dup
		// @092: iconst_5
		// @093: ldc "\u000b[i\u001emgQo\u0006x$[z\u0019k"
		// @095: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @098: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @09B: aastore
		// @09C: dup
		// @09D: bipush 6 (0x06)
		// @09F: ldc "\u0005S}\u00139$S~\u0017z.Fa\u0004"
		// @0A1: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @0A4: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @0A7: aastore
		// @0A8: dup
		// @0A9: bipush 7 (0x07)
		// @0AB: ldc "\u000fWo\u0000`gQo\u0006x$[z\u0019k"
		// @0AD: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @0B0: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @0B3: aastore
		// @0B4: dup
		// @0B5: bipush 8 (0x08)
		// @0B7: ldc "\u0015[`\u00119$S~\u0017z.Fa\u0004"
		// @0B9: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @0BC: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @0BF: aastore
		// @0C0: dup
		// @0C1: bipush 9 (0x09)
		// @0C3: ldc "\nSi\u0018v)\u0012m\u0017i&Qg\u0002v5"
		// @0C5: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @0C8: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @0CB: aastore
		// @0CC: dup
		// @0CD: bipush 10 (0x0A)
		// @0CF: ldc "\u000fSt\u00139\"\\k\u0004~>\u0012}\u001ep\"^j"
		// @0D1: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @0D4: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @0D7: aastore
		// @0D8: dup
		// @0D9: bipush 11 (0x0B)
		// @0DB: ldc "\u0002^k\u0015m5]`V|)W|\u0011`gAf\u001f|+V"
		// @0DD: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @0E0: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @0E3: aastore
		// @0E4: dup
		// @0E5: bipush 12 (0x0C)
		// @0E7: ldc "\u0017^o\u0005t&\u0012k\u0018|5UwVj/[k\u001a}"
		// @0E9: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @0EC: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @0EF: aastore
		// @0F0: dup
		// @0F1: bipush 13 (0x0D)
		// @0F3: ldc "\u0003@o\u0011v)\u0012k\u0018|5UwVj/[k\u001a}"
		// @0F5: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @0F8: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @0FB: aastore
		// @0FC: dup
		// @0FD: bipush 14 (0x0E)
		// @0FF: ldc "\u0014]b\u0017kgW`\u0013k K.\u0005q.Wb\u0012"
		// @101: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @104: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @107: aastore
		// @108: dup
		// @109: bipush 15 (0x0F)
		// @10B: ldc "\u0002\u007f^V{(_l"
		// @10D: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @110: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @113: aastore
		// @114: dup
		// @115: bipush 16 (0x10)
		// @117: ldc "\u0013S|\u0011|3W|"
		// @119: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @11C: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @11F: aastore
		// @120: dup
		// @121: bipush 17 (0x11)
		// @123: ldc "\u0006\u007fO$]\u0014"
		// @125: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @128: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @12B: aastore
		// @12C: dup
		// @12D: bipush 18 (0x12)
		// @12F: ldc "\n[}\u0005p+W.\u0005z5Sc\u0014u\"@"
		// @131: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @134: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @137: aastore
		// @138: dup
		// @139: bipush 19 (0x13)
		// @13B: ldc "\u0015W~\u0017p5\u0012}\u000fj3Wc"
		// @13D: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @140: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @143: aastore
		// @144: dup
		// @145: bipush 20 (0x14)
		// @147: ldc "\u0002J~\u0013k._k\u0018m&^.\u0004|&Qz\u0019k"
		// @149: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @14C: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @14F: aastore
		// @150: dup
		// @151: bipush 21 (0x15)
		// @153: ldc "\u0014Qo\u0018w\"@"
		// @155: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @158: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @15B: aastore
		// @15C: dup
		// @15D: bipush 22 (0x16)
		// @15F: ldc "\u0014Bk\u0013}g^a\u0017}\"@"
		// @161: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @164: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @167: aastore
		// @168: dup
		// @169: bipush 23 (0x17)
		// @16B: ldc "\u0004]a\u001ax)F.\u0017k5Sw"
		// @16D: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @170: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @173: aastore
		// @174: dup
		// @175: bipush 24 (0x18)
		// @177: ldc "\u0002_k\u0004~\"\\m\u000f9#[}\u0006u&Qk\u001b|)F.\u0012|7^a\u000ft\"\\z"
		// @179: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @17C: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @17F: aastore
		// @180: dup
		// @181: bipush 25 (0x19)
		// @183: ldc "\u000f[i\u001e4\"\\k\u0004~>\u0012o\u001bi+[h\u001f|5"
		// @185: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @188: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @18B: aastore
		// @18C: dup
		// @18D: bipush 26 (0x1A)
		// @18F: ldc "\u0002\\k\u0004~.Ak\u00129&@c\u0019l5"
		// @191: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @194: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @197: aastore
		// @198: dup
		// @199: bipush 27 (0x1B)
		// @19B: ldc "\u0002\u007f^Vq&@j\u0013w.\\i"
		// @19D: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @1A0: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @1A3: aastore
		// @1A4: dup
		// @1A5: bipush 28 (0x1C)
		// @1A7: ldc "\u0000@o\u0000p3K.\u0006v#A"
		// @1A9: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @1AC: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @1AF: aastore
		// @1B0: dup
		// @1B1: bipush 29 (0x1D)
		// @1B3: ldc "\u0006W|\u0003x,\u0012}\u0002x%[b\u001fj\"@}"
		// @1B5: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @1B8: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @1BB: aastore
		// @1BC: dup
		// @1BD: bipush 30 (0x1E)
		// @1BF: ldc "\u0010Sb\u0002v)\u0012c\u001fk&UkV}\"Dg\u0015|"
		// @1C1: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @1C4: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @1C7: aastore
		// @1C8: dup
		// @1C9: bipush 31 (0x1F)
		// @1CB: ldc "\u0014[k\u0011|gAz\u0017{.^g\u0005x3[a\u001894K}\u0002|*"
		// @1CD: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @1D0: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @1D3: aastore
		// @1D4: dup
		// @1D5: bipush 32 (0x20)
		// @1D7: ldc "\u0015Wg\u0018\u007f(@m\u0013}gS|\u001bv2@"
		// @1D9: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @1DC: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @1DF: aastore
		// @1E0: dup
		// @1E1: bipush 33 (0x21)
		// @1E3: ldc "\u0015Wo\u0015m.DkVx5_a\u0003k"
		// @1E5: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @1E8: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @1EB: aastore
		// @1EC: putstatic java.lang.String[] game.C_100167_sj.field_100794_t
		// @1EF: iconst_0
		// @1F0: putstatic int game.C_100167_sj.field_100793_u
		// @1F3: ldc "\u0010[z\u001e}5SyVk\"C{\u0013j3\u0012z\u00199-]g\u00189{\u0017>H>4\u0012i\u0017t\""
		// @1F5: invokestatic game.C_100167_sj.func_100782_z(java.lang.String)char[]
		// @1F8: invokestatic game.C_100167_sj.func_100781_z(char[])java.lang.String
		// @1FB: putstatic java.lang.String game.C_100167_sj.field_100786_o
		// @1FE: iconst_3
		// @1FF: anewarray int[]
		// @202: dup
		// @203: iconst_0
		// @204: aconst_null
		// @205: aastore
		// @206: dup
		// @207: iconst_1
		// @208: aconst_null
		// @209: aastore
		// @20A: dup
		// @20B: iconst_2
		// @20C: aconst_null
		// @20D: aastore
		// @20E: putstatic int[][] game.C_100167_sj.field_100788_m
		// @211: return
	}
	
	private static char[] func_100782_z(String arg0)
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
		// @0E: bipush 25 (0x19)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100781_z(char[] arg0)
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
		// @35: bipush 50 (0x32)
		// @37: goto @46
		// @3A: bipush 14 (0x0E)
		// @3C: goto @46
		// @3F: bipush 118 (0x76)
		// @41: goto @46
		// @44: bipush 25 (0x19)
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
