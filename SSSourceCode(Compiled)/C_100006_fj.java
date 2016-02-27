package game;

final class C_100006_fj
{
	static String field_103619_e;
	static C_100240_oj[] field_103617_g;
	static C_100153_be[] field_103620_b;
	static String field_103618_d;
	static boolean field_103621_c;
	static int field_103616_f;
	static String field_103622_a;
	private static final String[] field_103623_z;
	
	public static void func_103612_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100006_fj.field_103619_e
		// @08: aconst_null
		// @09: putstatic game.C_100240_oj[] game.C_100006_fj.field_103617_g
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100006_fj.field_103622_a
		// @10: aconst_null
		// @11: putstatic java.lang.String game.C_100006_fj.field_103618_d
		// @14: iload_0
		// @15: ifeq @21
		// @18: bipush -44 (0xD4)
		// @1A: iconst_1
		// @1B: bipush -36 (0xDC)
		// @1D: iconst_0
		// @1E: invokestatic game.C_100006_fj.func_103614_a(int, boolean, int, boolean)void
		// @21: goto @45
		// @24: astore_1
		// @25: aload_1
		// @26: new java.lang.StringBuilder
		// @29: dup
		// @2A: invokespecial java.lang.StringBuilder.<init>()void
		// @2D: getstatic java.lang.String[] game.C_100006_fj.field_103623_z
		// @30: iconst_2
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
	
	static final void func_103614_a(int arg0, boolean arg1, int arg2, boolean arg3)
	{
		// @000: bipush 99 (0x63)
		// @002: invokestatic game.C_100192_rf.func_101673_d(byte)void
		// @005: getstatic int game.C_100255_pj.field_105255_s
		// @008: iload_0
		// @009: if_icmpge @01D
		// @00C: getstatic game.C_100302_ka game.C_100297_kf.field_101240_l
		// @00F: aconst_null
		// @010: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @013: getstatic int game.SteelSentinels.field_105275_O
		// @016: ifeq @03D
		// @019: goto @01D
		// @01C: athrow
		// @01D: getstatic game.C_100302_ka game.C_100297_kf.field_101240_l
		// @020: sipush -30945 (0x871F)
		// @023: iconst_1
		// @024: anewarray java.lang.String
		// @027: dup
		// @028: iconst_0
		// @029: getstatic int game.C_100255_pj.field_105255_s
		// @02C: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @02F: aastore
		// @030: getstatic java.lang.String game.C_100329_ih.field_107269_d
		// @033: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @036: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @039: goto @03D
		// @03C: athrow
		// @03D: getstatic game.C_100302_ka game.C_100231_oc.field_102208_bc
		// @040: iload_1
		// @041: ifeq @071
		// @044: iload_3
		// @045: ifne @071
		// @048: goto @04C
		// @04B: athrow
		// @04C: getstatic boolean game.C_100188_rj.field_105735_f
		// @04F: ifne @071
		// @052: goto @056
		// @055: athrow
		// @056: aconst_null
		// @057: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @05A: if_acmpne @071
		// @05D: goto @061
		// @060: athrow
		// @061: aconst_null
		// @062: getstatic game.C_100211_qd game.SteelSentinels.field_105274_N
		// @065: if_acmpne @071
		// @068: goto @06C
		// @06B: athrow
		// @06C: iconst_1
		// @06D: goto @072
		// @070: athrow
		// @071: iconst_0
		// @072: bipush -114 (0x8E)
		// @074: invokevirtual game.C_100302_ka.func_101819_a(boolean, byte)void
		// @077: getstatic game.C_100302_ka game.C_100081_ue.field_100676_j
		// @07A: iload_1
		// @07B: ifeq @0AA
		// @07E: iload_3
		// @07F: ifne @0AA
		// @082: goto @086
		// @085: athrow
		// @086: getstatic boolean game.C_100188_rj.field_105735_f
		// @089: ifne @0AA
		// @08C: goto @090
		// @08F: athrow
		// @090: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @093: ifnonnull @0AA
		// @096: goto @09A
		// @099: athrow
		// @09A: aconst_null
		// @09B: getstatic game.C_100211_qd game.SteelSentinels.field_105274_N
		// @09E: if_acmpne @0AA
		// @0A1: goto @0A5
		// @0A4: athrow
		// @0A5: iconst_1
		// @0A6: goto @0AB
		// @0A9: athrow
		// @0AA: iconst_0
		// @0AB: bipush -109 (0x93)
		// @0AD: invokevirtual game.C_100302_ka.func_101819_a(boolean, byte)void
		// @0B0: getstatic game.C_100302_ka game.C_100053_vn.field_102842_Y
		// @0B3: iload_1
		// @0B4: ifeq @0CE
		// @0B7: iload_3
		// @0B8: ifne @0CE
		// @0BB: goto @0BF
		// @0BE: athrow
		// @0BF: getstatic boolean game.C_100188_rj.field_105735_f
		// @0C2: ifeq @0CE
		// @0C5: goto @0C9
		// @0C8: athrow
		// @0C9: iconst_1
		// @0CA: goto @0CF
		// @0CD: athrow
		// @0CE: iconst_0
		// @0CF: bipush 25 (0x19)
		// @0D1: invokevirtual game.C_100302_ka.func_101819_a(boolean, byte)void
		// @0D4: getstatic game.C_100220_ac game.C_100176_ci.field_105624_b
		// @0D7: getfield game.C_100172_ck game.C_100220_ac.field_106059_a
		// @0DA: iconst_0
		// @0DB: invokevirtual game.C_100172_ck.func_102099_b(boolean)void
		// @0DE: getstatic game.C_100302_ka game.C_100080_b.field_104431_f
		// @0E1: getfield int game.C_100302_ka.field_101854_N
		// @0E4: ifeq @0EF
		// @0E7: iconst_1
		// @0E8: putstatic boolean game.C_100288_jn.field_106842_e
		// @0EB: goto @0EF
		// @0EE: athrow
		// @0EF: iconst_0
		// @0F0: getstatic game.C_100302_ka game.C_100020_wm.field_103858_a
		// @0F3: getfield int game.C_100302_ka.field_101854_N
		// @0F6: if_icmpne @0FD
		// @0F9: goto @134
		// @0FC: athrow
		// @0FD: getstatic boolean game.C_100154_sl.field_105330_g
		// @100: ifne @12D
		// @103: iconst_0
		// @104: getstatic int game.C_100212_qc.field_105976_b
		// @107: if_icmplt @12D
		// @10A: goto @10E
		// @10D: athrow
		// @10E: getstatic int game.C_100107_u.field_104770_g
		// @111: iconst_m1
		// @112: ixor
		// @113: bipush -3 (0xFD)
		// @115: if_icmpgt @134
		// @118: goto @11C
		// @11B: athrow
		// @11C: getstatic boolean[] game.C_100309_lk.field_103258_hb
		// @11F: bipush 12 (0x0C)
		// @121: baload
		// @122: ifne @12D
		// @125: goto @129
		// @128: athrow
		// @129: goto @134
		// @12C: athrow
		// @12D: sipush 26780 (0x689C)
		// @130: iload_2
		// @131: invokestatic game.C_100252_pn.func_105501_a(int, int)void
		// @134: iconst_m1
		// @135: getstatic game.C_100302_ka game.C_100217_ao.field_106040_l
		// @138: getfield int game.C_100302_ka.field_101854_N
		// @13B: iconst_m1
		// @13C: ixor
		// @13D: if_icmpeq @17C
		// @140: getstatic int[] game.C_100126_cb.field_103060_v
		// @143: arraylength
		// @144: iconst_m1
		// @145: ixor
		// @146: bipush -2 (0xFE)
		// @148: if_icmpne @16E
		// @14B: goto @14F
		// @14E: athrow
		// @14F: getstatic int game.C_100338_jc.field_105365_d
		// @152: iconst_m1
		// @153: ixor
		// @154: getstatic int[] game.C_100126_cb.field_103060_v
		// @157: iconst_0
		// @158: iaload
		// @159: iconst_m1
		// @15A: ixor
		// @15B: if_icmpeq @16E
		// @15E: goto @162
		// @161: athrow
		// @162: getstatic int[] game.C_100126_cb.field_103060_v
		// @165: iconst_0
		// @166: iaload
		// @167: putstatic int game.C_100338_jc.field_105365_d
		// @16A: goto @16E
		// @16D: athrow
		// @16E: iconst_0
		// @16F: iconst_1
		// @170: getstatic int game.C_100338_jc.field_105365_d
		// @173: iload_2
		// @174: bipush -125 (0x83)
		// @176: getstatic byte[] game.C_100207_qh.field_102879_S
		// @179: invokestatic game.C_100008_fl.func_103637_a(int, boolean, int, int, byte, byte[])void
		// @17C: getstatic game.C_100302_ka game.C_100066_dl.field_101639_w
		// @17F: getfield int game.C_100302_ka.field_101854_N
		// @182: iconst_m1
		// @183: ixor
		// @184: iconst_m1
		// @185: if_icmpne @18C
		// @188: goto @190
		// @18B: athrow
		// @18C: iconst_0
		// @18D: putstatic boolean game.C_100188_rj.field_105735_f
		// @190: goto @1D1
		// @193: astore #4
		// @195: aload #4
		// @197: new java.lang.StringBuilder
		// @19A: dup
		// @19B: invokespecial java.lang.StringBuilder.<init>()void
		// @19E: getstatic java.lang.String[] game.C_100006_fj.field_103623_z
		// @1A1: iconst_1
		// @1A2: aaload
		// @1A3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1A6: iload_0
		// @1A7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1AA: bipush 44 (0x2C)
		// @1AC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1AF: iload_1
		// @1B0: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @1B3: bipush 44 (0x2C)
		// @1B5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1B8: iload_2
		// @1B9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1BC: bipush 44 (0x2C)
		// @1BE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1C1: iload_3
		// @1C2: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @1C5: bipush 41 (0x29)
		// @1C7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1CA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1CD: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1D0: athrow
		// @1D1: return
	}
	
	public final String toString()
	{
		// @00: new java.lang.IllegalStateException
		// @03: dup
		// @04: invokespecial java.lang.IllegalStateException.<init>()void
		// @07: athrow
		// @08: astore_1
		// @09: aload_1
		// @0A: getstatic java.lang.String[] game.C_100006_fj.field_103623_z
		// @0D: iconst_0
		// @0E: aaload
		// @0F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @12: athrow
	}
	
	static
	{
		// @00: iconst_3
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "DR\u001bl$qLGq%E\u0010\u001c"
		// @08: invokestatic game.C_100006_fj.func_103615_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100006_fj.func_103613_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "DR\u001bYc"
		// @13: invokestatic game.C_100006_fj.func_103615_z(java.lang.String)char[]
		// @16: invokestatic game.C_100006_fj.func_103613_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "DR\u001bZc"
		// @1E: invokestatic game.C_100006_fj.func_103615_z(java.lang.String)char[]
		// @21: invokestatic game.C_100006_fj.func_103613_z(char[])java.lang.String
		// @24: aastore
		// @25: putstatic java.lang.String[] game.C_100006_fj.field_103623_z
		// @28: ldc "{W@8*P]\u0015y/TQF}/\u0002LZ8(MUEt.V]\u0015l9CQ[q%E\u0018Xq8QQZvk\u001e\u001d\u0005&k@]Sw9G\u0018Tl?GUEl\"L_\u0015l#KK\u0015u\"QK\\w%\u000c"
		// @2A: invokestatic game.C_100006_fj.func_103615_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100006_fj.func_103613_z(char[])java.lang.String
		// @30: putstatic java.lang.String game.C_100006_fj.field_103619_e
		// @33: ldc "\u000e\u0018Tv/\u0002OTkkDQ[q8J]Q8$D^\u0015z2\u0002Y\u0015j$AS"
		// @35: invokestatic game.C_100006_fj.func_103615_z(java.lang.String)char[]
		// @38: invokestatic game.C_100006_fj.func_103613_z(char[])java.lang.String
		// @3B: putstatic java.lang.String game.C_100006_fj.field_103618_d
		// @3E: ldc "\u001e\u001d\u0004&kUYF8/GKAj$[]Q"
		// @40: invokestatic game.C_100006_fj.func_103615_z(java.lang.String)char[]
		// @43: invokestatic game.C_100006_fj.func_103613_z(char[])java.lang.String
		// @46: putstatic java.lang.String game.C_100006_fj.field_103622_a
		// @49: return
	}
	
	private static char[] func_103615_z(String arg0)
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
		// @0E: bipush 75 (0x4B)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103613_z(char[] arg0)
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
		// @30: bipush 34 (0x22)
		// @32: goto @46
		// @35: bipush 56 (0x38)
		// @37: goto @46
		// @3A: bipush 53 (0x35)
		// @3C: goto @46
		// @3F: bipush 24 (0x18)
		// @41: goto @46
		// @44: bipush 75 (0x4B)
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
