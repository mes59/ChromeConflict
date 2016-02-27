package game;

final class C_100022_hf
{
	private String field_103905_k;
	private long field_103902_l;
	private int[] field_103896_e;
	static int field_103893_f;
	static int field_103899_a;
	C_100302_ka field_103897_b;
	int field_103895_d;
	C_100270_mi field_103903_m;
	static boolean field_103904_j;
	static int field_103894_g;
	static String field_103900_n;
	String field_103901_o;
	static String field_103898_c;
	private int field_103906_h;
	static String field_103907_i;
	private static final String[] field_103908_z;
	
	static final boolean func_103889_a(String arg0, String arg1, boolean arg2)
	{
		// @00: aload_1
		// @01: sipush -17560 (0xBB68)
		// @04: invokestatic game.C_100052_eb.func_104223_a(java.lang.String, int)boolean
		// @07: ifne @0E
		// @0A: goto @10
		// @0D: athrow
		// @0E: iconst_0
		// @0F: ireturn
		// @10: aload_1
		// @11: sipush 27048 (0x69A8)
		// @14: invokestatic game.C_100092_um.func_104523_a(java.lang.String, int)boolean
		// @17: ifne @1E
		// @1A: goto @20
		// @1D: athrow
		// @1E: iconst_0
		// @1F: ireturn
		// @20: iload_2
		// @21: iconst_1
		// @22: if_icmpeq @27
		// @25: iconst_1
		// @26: ireturn
		// @27: aload_1
		// @28: bipush 122 (0x7A)
		// @2A: invokestatic game.C_100079_e.func_102661_a(java.lang.String, byte)boolean
		// @2D: ifne @34
		// @30: goto @36
		// @33: athrow
		// @34: iconst_0
		// @35: ireturn
		// @36: aload_0
		// @37: invokevirtual java.lang.String.length()int
		// @3A: ifeq @41
		// @3D: goto @43
		// @40: athrow
		// @41: iconst_1
		// @42: ireturn
		// @43: aload_0
		// @44: iconst_m1
		// @45: aload_1
		// @46: invokestatic game.C_100322_hn.func_107231_a(java.lang.String, int, java.lang.String)boolean
		// @49: ifne @50
		// @4C: goto @52
		// @4F: athrow
		// @50: iconst_0
		// @51: ireturn
		// @52: sipush -4787 (0xED4D)
		// @55: aload_1
		// @56: aload_0
		// @57: invokestatic game.C_100089_fa.func_103713_a(int, java.lang.String, java.lang.String)boolean
		// @5A: ifeq @5F
		// @5D: iconst_0
		// @5E: ireturn
		// @5F: aload_1
		// @60: aload_0
		// @61: iconst_0
		// @62: invokestatic game.C_100087_n.func_100680_a(java.lang.String, java.lang.String, int)boolean
		// @65: ifeq @6A
		// @68: iconst_0
		// @69: ireturn
		// @6A: iconst_1
		// @6B: ireturn
		// @6C: astore_3
		// @6D: aload_3
		// @6E: new java.lang.StringBuilder
		// @71: dup
		// @72: invokespecial java.lang.StringBuilder.<init>()void
		// @75: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @78: bipush 14 (0x0E)
		// @7A: aaload
		// @7B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7E: aload_0
		// @7F: ifnull @8B
		// @82: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @85: iconst_1
		// @86: aaload
		// @87: goto @90
		// @8A: athrow
		// @8B: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @8E: iconst_2
		// @8F: aaload
		// @90: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @93: bipush 44 (0x2C)
		// @95: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @98: aload_1
		// @99: ifnull @A5
		// @9C: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @9F: iconst_1
		// @A0: aaload
		// @A1: goto @AA
		// @A4: athrow
		// @A5: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @A8: iconst_2
		// @A9: aaload
		// @AA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AD: bipush 44 (0x2C)
		// @AF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B2: iload_2
		// @B3: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @B6: bipush 41 (0x29)
		// @B8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @BE: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C1: athrow
	}
	
	final void func_103888_c(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #4
		// @005: aconst_null
		// @006: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @009: if_acmpne @111
		// @00C: iconst_1
		// @00D: aload_0
		// @00E: getfield int game.C_100022_hf.field_103895_d
		// @011: invokestatic game.C_100203_ql.func_105926_a(boolean, int)game.C_100211_qd
		// @014: astore_2
		// @015: aconst_null
		// @016: aload_2
		// @017: if_acmpne @01E
		// @01A: goto @111
		// @01D: athrow
		// @01E: aload_2
		// @01F: getfield java.lang.String game.C_100211_qd.field_102155_dc
		// @022: astore_3
		// @023: aload_2
		// @024: getfield boolean game.C_100211_qd.field_102153_Lc
		// @027: ifne @0D5
		// @02A: aload_2
		// @02B: getfield boolean game.C_100211_qd.field_102167_nc
		// @02E: ifeq @059
		// @031: goto @035
		// @034: athrow
		// @035: aload_0
		// @036: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @039: bipush 56 (0x38)
		// @03B: iconst_2
		// @03C: sipush -30945 (0x871F)
		// @03F: iconst_1
		// @040: anewarray java.lang.String
		// @043: dup
		// @044: iconst_0
		// @045: aload_3
		// @046: aastore
		// @047: getstatic java.lang.String game.C_100311_le.field_104716_u
		// @04A: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @04D: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @050: iload #4
		// @052: ifeq @0A6
		// @055: goto @059
		// @058: athrow
		// @059: aload_2
		// @05A: getfield boolean game.C_100211_qd.field_102150_Cc
		// @05D: ifne @0A6
		// @060: goto @064
		// @063: athrow
		// @064: aload_2
		// @065: getfield boolean game.C_100211_qd.field_102135_Dc
		// @068: ifeq @0A6
		// @06B: goto @06F
		// @06E: athrow
		// @06F: aload_2
		// @070: getfield boolean game.C_100211_qd.field_102173_Ic
		// @073: ifeq @085
		// @076: goto @07A
		// @079: athrow
		// @07A: aload_2
		// @07B: getfield boolean game.C_100211_qd.field_102167_nc
		// @07E: ifeq @0A6
		// @081: goto @085
		// @084: athrow
		// @085: aload_0
		// @086: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @089: bipush 127 (0x7F)
		// @08B: iconst_2
		// @08C: iload_1
		// @08D: sipush 30944 (0x78E0)
		// @090: ixor
		// @091: iconst_1
		// @092: anewarray java.lang.String
		// @095: dup
		// @096: iconst_0
		// @097: aload_3
		// @098: aastore
		// @099: getstatic java.lang.String game.C_100246_pg.field_106408_h
		// @09C: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @09F: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @0A2: goto @0A6
		// @0A5: athrow
		// @0A6: aload_2
		// @0A7: getfield boolean game.C_100211_qd.field_102150_Cc
		// @0AA: ifeq @111
		// @0AD: aload_0
		// @0AE: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @0B1: iload_1
		// @0B2: bipush -128 (0x80)
		// @0B4: ixor
		// @0B5: iconst_3
		// @0B6: iload_1
		// @0B7: sipush 30944 (0x78E0)
		// @0BA: ixor
		// @0BB: iconst_1
		// @0BC: anewarray java.lang.String
		// @0BF: dup
		// @0C0: iconst_0
		// @0C1: aload_3
		// @0C2: aastore
		// @0C3: getstatic java.lang.String game.C_100167_sj.field_100786_o
		// @0C6: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0C9: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @0CC: iload #4
		// @0CE: ifeq @111
		// @0D1: goto @0D5
		// @0D4: athrow
		// @0D5: aload_0
		// @0D6: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @0D9: bipush 126 (0x7E)
		// @0DB: iconst_2
		// @0DC: iload_1
		// @0DD: sipush 30944 (0x78E0)
		// @0E0: ixor
		// @0E1: iconst_1
		// @0E2: anewarray java.lang.String
		// @0E5: dup
		// @0E6: iconst_0
		// @0E7: aload_3
		// @0E8: aastore
		// @0E9: getstatic java.lang.String game.C_100050_vg.field_100634_t
		// @0EC: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0EF: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @0F2: aload_0
		// @0F3: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @0F6: bipush 68 (0x44)
		// @0F8: iconst_3
		// @0F9: sipush -30945 (0x871F)
		// @0FC: iconst_1
		// @0FD: anewarray java.lang.String
		// @100: dup
		// @101: iconst_0
		// @102: aload_3
		// @103: aastore
		// @104: getstatic java.lang.String game.C_100328_ia.field_107256_g
		// @107: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @10A: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @10D: goto @111
		// @110: athrow
		// @111: iload_1
		// @112: iconst_m1
		// @113: if_icmpeq @120
		// @116: aload_0
		// @117: bipush -92 (0xA4)
		// @119: putfield int game.C_100022_hf.field_103906_h
		// @11C: goto @120
		// @11F: athrow
		// @120: goto @145
		// @123: astore_2
		// @124: aload_2
		// @125: new java.lang.StringBuilder
		// @128: dup
		// @129: invokespecial java.lang.StringBuilder.<init>()void
		// @12C: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @12F: bipush 13 (0x0D)
		// @131: aaload
		// @132: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @135: iload_1
		// @136: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @139: bipush 41 (0x29)
		// @13B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @141: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @144: athrow
		// @145: return
	}
	
	final void func_103875_b(int arg0)
	{
		// @00: aconst_null
		// @01: aload_0
		// @02: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @05: if_acmpeq @48
		// @08: getstatic long game.C_100321_hi.field_107215_f
		// @0B: ldc2_w -1
		// @0E: lxor
		// @0F: aload_0
		// @10: getfield long game.C_100022_hf.field_103902_l
		// @13: ldc2_w -1
		// @16: lxor
		// @17: lcmp
		// @18: ifne @23
		// @1B: goto @1F
		// @1E: athrow
		// @1F: goto @48
		// @22: athrow
		// @23: aload_0
		// @24: bipush -113 (0x8F)
		// @26: invokespecial game.C_100022_hf.func_103881_a(byte)java.lang.String
		// @29: astore_2
		// @2A: aload_0
		// @2B: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @2E: bipush 84 (0x54)
		// @30: bipush 17 (0x11)
		// @32: iload_1
		// @33: sipush -30953 (0x8717)
		// @36: ixor
		// @37: iconst_1
		// @38: anewarray java.lang.String
		// @3B: dup
		// @3C: iconst_0
		// @3D: aload_2
		// @3E: aastore
		// @3F: getstatic java.lang.String game.C_100180_ce.field_104815_x
		// @42: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @45: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @48: iload_1
		// @49: bipush 8 (0x08)
		// @4B: if_icmpeq @57
		// @4E: bipush 71 (0x47)
		// @50: putstatic int game.C_100022_hf.field_103893_f
		// @53: goto @57
		// @56: athrow
		// @57: goto @7C
		// @5A: astore_2
		// @5B: aload_2
		// @5C: new java.lang.StringBuilder
		// @5F: dup
		// @60: invokespecial java.lang.StringBuilder.<init>()void
		// @63: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @66: bipush 15 (0x0F)
		// @68: aaload
		// @69: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6C: iload_1
		// @6D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @70: bipush 41 (0x29)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @78: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7B: athrow
		// @7C: return
	}
	
	private final boolean func_103892_b(int arg0, int arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: bipush -9 (0xF7)
		// @007: iload_1
		// @008: iconst_m1
		// @009: ixor
		// @00A: if_icmpeq @0E1
		// @00D: iload_1
		// @00E: bipush 18 (0x12)
		// @010: if_icmpne @02D
		// @013: goto @017
		// @016: athrow
		// @017: bipush 70 (0x46)
		// @019: aload_0
		// @01A: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @01D: aload_0
		// @01E: getfield long game.C_100022_hf.field_103902_l
		// @021: invokestatic game.C_100257_ln.func_106477_a(byte, java.lang.String, long)void
		// @024: iload #5
		// @026: ifeq @0F2
		// @029: goto @02D
		// @02C: athrow
		// @02D: bipush -12 (0xF4)
		// @02F: iload_1
		// @030: iconst_m1
		// @031: ixor
		// @032: if_icmpeq @0CD
		// @035: goto @039
		// @038: athrow
		// @039: bipush 12 (0x0C)
		// @03B: iload_1
		// @03C: if_icmpeq @0B9
		// @03F: goto @043
		// @042: athrow
		// @043: iload_1
		// @044: bipush 13 (0x0D)
		// @046: if_icmpne @061
		// @049: goto @04D
		// @04C: athrow
		// @04D: aload_0
		// @04E: getfield int game.C_100022_hf.field_103906_h
		// @051: bipush -126 (0x82)
		// @053: iconst_2
		// @054: iload_2
		// @055: invokestatic game.C_100290_jm.func_106850_a(int, int, int, int)void
		// @058: iload #5
		// @05A: ifeq @0F2
		// @05D: goto @061
		// @060: athrow
		// @061: bipush 14 (0x0E)
		// @063: iload_1
		// @064: if_icmpeq @0AB
		// @067: goto @06B
		// @06A: athrow
		// @06B: iload_1
		// @06C: iconst_m1
		// @06D: ixor
		// @06E: bipush -21 (0xEB)
		// @070: if_icmpeq @09E
		// @073: goto @077
		// @076: athrow
		// @077: bipush 19 (0x13)
		// @079: iload_1
		// @07A: if_icmpeq @083
		// @07D: goto @081
		// @080: athrow
		// @081: iconst_0
		// @082: ireturn
		// @083: bipush -128 (0x80)
		// @085: aload_0
		// @086: getfield int[] game.C_100022_hf.field_103896_e
		// @089: aload_0
		// @08A: getfield long game.C_100022_hf.field_103902_l
		// @08D: aload_0
		// @08E: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @091: aload_0
		// @092: getfield int game.C_100022_hf.field_103906_h
		// @095: invokestatic game.C_100297_kf.func_101227_a(byte, int[], long, java.lang.String, int)boolean
		// @098: pop
		// @099: iload #5
		// @09B: ifeq @0F2
		// @09E: iconst_0
		// @09F: invokestatic game.C_100078_ul.func_103276_f(boolean)void
		// @0A2: iload #5
		// @0A4: ifeq @0F2
		// @0A7: goto @0AB
		// @0AA: athrow
		// @0AB: bipush -120 (0x88)
		// @0AD: invokestatic game.C_100108_ee.func_100379_a(int)void
		// @0B0: iload #5
		// @0B2: ifeq @0F2
		// @0B5: goto @0B9
		// @0B8: athrow
		// @0B9: aload_0
		// @0BA: getfield int game.C_100022_hf.field_103906_h
		// @0BD: bipush -126 (0x82)
		// @0BF: iconst_1
		// @0C0: iload_2
		// @0C1: invokestatic game.C_100290_jm.func_106850_a(int, int, int, int)void
		// @0C4: iload #5
		// @0C6: ifeq @0F2
		// @0C9: goto @0CD
		// @0CC: athrow
		// @0CD: aload_0
		// @0CE: getfield int game.C_100022_hf.field_103906_h
		// @0D1: bipush 74 (0x4A)
		// @0D3: iconst_0
		// @0D4: iload_2
		// @0D5: invokestatic game.C_100290_jm.func_106850_a(int, int, int, int)void
		// @0D8: iload #5
		// @0DA: ifeq @0F2
		// @0DD: goto @0E1
		// @0E0: athrow
		// @0E1: bipush -127 (0x81)
		// @0E3: aload_0
		// @0E4: getfield long game.C_100022_hf.field_103902_l
		// @0E7: aload_0
		// @0E8: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @0EB: invokestatic game.C_100136_th.func_102610_a(int, long, java.lang.String)void
		// @0EE: goto @0F2
		// @0F1: athrow
		// @0F2: iload_3
		// @0F3: sipush -3383 (0xF2C9)
		// @0F6: if_icmpeq @0FB
		// @0F9: iconst_1
		// @0FA: ireturn
		// @0FB: iconst_1
		// @0FC: ireturn
		// @0FD: astore #4
		// @0FF: aload #4
		// @101: new java.lang.StringBuilder
		// @104: dup
		// @105: invokespecial java.lang.StringBuilder.<init>()void
		// @108: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @10B: bipush 12 (0x0C)
		// @10D: aaload
		// @10E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @111: iload_1
		// @112: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @115: bipush 44 (0x2C)
		// @117: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @11A: iload_2
		// @11B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @11E: bipush 44 (0x2C)
		// @120: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @123: iload_3
		// @124: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @127: bipush 41 (0x29)
		// @129: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @12C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @12F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @132: athrow
	}
	
	final boolean func_103876_a(boolean arg0, int arg1, byte arg2, int arg3, int arg4)
	{
		// @00: aload_0
		// @01: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @04: iload_3
		// @05: sipush 26239 (0x667F)
		// @08: ixor
		// @09: iload_1
		// @0A: invokevirtual game.C_100270_mi.func_102248_a(int, boolean)int
		// @0D: istore #6
		// @0F: iload_3
		// @10: bipush -99 (0x9D)
		// @12: if_icmpeq @1E
		// @15: bipush 121 (0x79)
		// @17: putstatic int game.C_100022_hf.field_103894_g
		// @1A: goto @1E
		// @1D: athrow
		// @1E: iload #6
		// @20: iconst_m1
		// @21: ixor
		// @22: iconst_1
		// @23: if_icmpne @28
		// @26: iconst_0
		// @27: ireturn
		// @28: aload_0
		// @29: bipush 49 (0x31)
		// @2B: iload #6
		// @2D: iload #5
		// @2F: invokespecial game.C_100022_hf.func_103891_b(byte, int, int)boolean
		// @32: pop
		// @33: aload_0
		// @34: bipush -104 (0x98)
		// @36: iload #4
		// @38: iload #6
		// @3A: invokespecial game.C_100022_hf.func_103880_a(byte, int, int)boolean
		// @3D: pop
		// @3E: aload_0
		// @3F: iload #6
		// @41: iload #4
		// @43: iload_3
		// @44: sipush 3412 (0x0D54)
		// @47: ixor
		// @48: invokespecial game.C_100022_hf.func_103892_b(int, int, int)boolean
		// @4B: pop
		// @4C: aload_0
		// @4D: iload_2
		// @4E: iload #6
		// @50: sipush 14087 (0x3707)
		// @53: invokespecial game.C_100022_hf.func_103887_a(int, int, int)boolean
		// @56: pop
		// @57: iconst_1
		// @58: ireturn
		// @59: astore #6
		// @5B: aload #6
		// @5D: new java.lang.StringBuilder
		// @60: dup
		// @61: invokespecial java.lang.StringBuilder.<init>()void
		// @64: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @67: iconst_5
		// @68: aaload
		// @69: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6C: iload_1
		// @6D: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @70: bipush 44 (0x2C)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: iload_2
		// @76: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @79: bipush 44 (0x2C)
		// @7B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7E: iload_3
		// @7F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @82: bipush 44 (0x2C)
		// @84: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @87: iload #4
		// @89: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8C: bipush 44 (0x2C)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: iload #5
		// @93: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @96: bipush 41 (0x29)
		// @98: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A1: athrow
	}
	
	final boolean func_103890_a(int arg0)
	{
		// @00: iload_1
		// @01: bipush -116 (0x8C)
		// @03: if_icmplt @11
		// @06: aload_0
		// @07: ldc2_w -91
		// @0A: putfield long game.C_100022_hf.field_103902_l
		// @0D: goto @11
		// @10: athrow
		// @11: aload_0
		// @12: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @15: ifnull @2C
		// @18: aload_0
		// @19: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @1C: iconst_0
		// @1D: invokevirtual game.C_100270_mi.func_102258_m(int)boolean
		// @20: ifeq @2C
		// @23: goto @27
		// @26: athrow
		// @27: iconst_1
		// @28: goto @2D
		// @2B: athrow
		// @2C: iconst_0
		// @2D: ireturn
		// @2E: astore_2
		// @2F: aload_2
		// @30: new java.lang.StringBuilder
		// @33: dup
		// @34: invokespecial java.lang.StringBuilder.<init>()void
		// @37: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @3A: iconst_0
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: iload_1
		// @40: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @43: bipush 41 (0x29)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4E: athrow
	}
	
	static final void func_103886_a(int arg0, int arg1, int arg2, int arg3, byte arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: iload_3
		// @006: iload_1
		// @007: iconst_1
		// @008: iload_0
		// @009: iadd
		// @00A: ldc 10000536 (0x989898)
		// @00C: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @00F: iload_3
		// @010: iload_2
		// @011: iload_1
		// @012: iadd
		// @013: iconst_1
		// @014: iload_0
		// @015: iadd
		// @016: ldc 12105912 (0xb8b8b8)
		// @018: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @01B: iconst_1
		// @01C: istore #5
		// @01E: iload_1
		// @01F: iload #5
		// @021: iadd
		// @022: getstatic int game.C_100196_rb.field_105816_f
		// @025: if_icmplt @02C
		// @028: goto @034
		// @02B: athrow
		// @02C: iload_1
		// @02D: ineg
		// @02E: getstatic int game.C_100196_rb.field_105816_f
		// @031: iadd
		// @032: istore #5
		// @034: iload_2
		// @035: istore #6
		// @037: iload #4
		// @039: bipush -94 (0xA2)
		// @03B: if_icmple @047
		// @03E: bipush 122 (0x7A)
		// @040: invokestatic game.C_100022_hf.func_103882_b(byte)void
		// @043: goto @047
		// @046: athrow
		// @047: iload_1
		// @048: iload #6
		// @04A: iadd
		// @04B: getstatic int game.C_100196_rb.field_105823_l
		// @04E: if_icmple @058
		// @051: getstatic int game.C_100196_rb.field_105823_l
		// @054: iload_1
		// @055: isub
		// @056: istore #6
		// @058: iload #5
		// @05A: istore #7
		// @05C: iload #6
		// @05E: iload #7
		// @060: if_icmple @0B8
		// @063: sipush 152 (0x0098)
		// @066: iload #7
		// @068: bipush 48 (0x30)
		// @06A: imul
		// @06B: iload_2
		// @06C: idiv
		// @06D: ineg
		// @06E: isub
		// @06F: istore #8
		// @071: iload #8
		// @073: ldc -525406616 (0xe0aeee68)
		// @075: ishl
		// @076: iload #8
		// @078: ldc 550406192 (0x20ce8830)
		// @07A: ishl
		// @07B: ior
		// @07C: iload #8
		// @07E: ior
		// @07F: istore #9
		// @081: getstatic int[] game.C_100196_rb.field_105818_d
		// @084: iload_1
		// @085: iload #7
		// @087: ineg
		// @088: isub
		// @089: getstatic int game.C_100196_rb.field_105819_e
		// @08C: imul
		// @08D: iload_3
		// @08E: ineg
		// @08F: isub
		// @090: iload #9
		// @092: iastore
		// @093: getstatic int[] game.C_100196_rb.field_105818_d
		// @096: iload_0
		// @097: iload_1
		// @098: iload #7
		// @09A: ineg
		// @09B: isub
		// @09C: getstatic int game.C_100196_rb.field_105819_e
		// @09F: imul
		// @0A0: iadd
		// @0A1: iload_3
		// @0A2: ineg
		// @0A3: isub
		// @0A4: iload #9
		// @0A6: iastore
		// @0A7: iinc #7 +1
		// @0AA: iload #10
		// @0AC: ifne @104
		// @0AF: iload #10
		// @0B1: ifeq @05C
		// @0B4: goto @0B8
		// @0B7: athrow
		// @0B8: goto @104
		// @0BB: astore #5
		// @0BD: aload #5
		// @0BF: new java.lang.StringBuilder
		// @0C2: dup
		// @0C3: invokespecial java.lang.StringBuilder.<init>()void
		// @0C6: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @0C9: bipush 6 (0x06)
		// @0CB: aaload
		// @0CC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0CF: iload_0
		// @0D0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D3: bipush 44 (0x2C)
		// @0D5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D8: iload_1
		// @0D9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0DC: bipush 44 (0x2C)
		// @0DE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E1: iload_2
		// @0E2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E5: bipush 44 (0x2C)
		// @0E7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0EA: iload_3
		// @0EB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0EE: bipush 44 (0x2C)
		// @0F0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F3: iload #4
		// @0F5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F8: bipush 41 (0x29)
		// @0FA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FD: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @100: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @103: athrow
		// @104: return
	}
	
	final void func_103878_a(C_100240_oj arg0, int arg1)
	{
		// @000: aload_1
		// @001: getfield boolean game.C_100240_oj.field_106311_f
		// @004: ifne @00A
		// @007: goto @00B
		// @00A: return
		// @00B: aload_0
		// @00C: aload_1
		// @00D: getfield int game.C_100240_oj.field_106317_a
		// @010: putfield int game.C_100022_hf.field_103906_h
		// @013: iconst_m1
		// @014: aload_1
		// @015: getfield int game.C_100240_oj.field_106317_a
		// @018: iconst_m1
		// @019: ixor
		// @01A: if_icmpne @04A
		// @01D: iconst_m1
		// @01E: getstatic int game.C_100053_vn.field_102830_fb
		// @021: iconst_m1
		// @022: ixor
		// @023: if_icmpne @03C
		// @026: goto @02A
		// @029: athrow
		// @02A: aload_0
		// @02B: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @02E: bipush 118 (0x76)
		// @030: bipush 12 (0x0C)
		// @032: getstatic java.lang.String game.C_100099_fb.field_103045_v
		// @035: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @038: goto @03C
		// @03B: athrow
		// @03C: aload_0
		// @03D: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @040: bipush 91 (0x5B)
		// @042: bipush 13 (0x0D)
		// @044: getstatic java.lang.String game.C_100097_k.field_104580_d
		// @047: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @04A: bipush -2 (0xFE)
		// @04C: aload_1
		// @04D: getfield int game.C_100240_oj.field_106317_a
		// @050: iconst_m1
		// @051: ixor
		// @052: if_icmpeq @059
		// @055: goto @086
		// @058: athrow
		// @059: iconst_m1
		// @05A: getstatic int game.C_100220_ac.field_106065_i
		// @05D: iconst_m1
		// @05E: ixor
		// @05F: if_icmpne @076
		// @062: aload_0
		// @063: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @066: iload_2
		// @067: bipush 63 (0x3F)
		// @069: iadd
		// @06A: bipush 12 (0x0C)
		// @06C: getstatic java.lang.String game.C_100161_sd.field_105425_d
		// @06F: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @072: goto @076
		// @075: athrow
		// @076: aload_0
		// @077: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @07A: iload_2
		// @07B: bipush 104 (0x68)
		// @07D: ixor
		// @07E: bipush 13 (0x0D)
		// @080: getstatic java.lang.String game.C_100290_jm.field_106861_c
		// @083: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @086: bipush -3 (0xFD)
		// @088: aload_1
		// @089: getfield int game.C_100240_oj.field_106317_a
		// @08C: iconst_m1
		// @08D: ixor
		// @08E: if_icmpne @0BB
		// @091: getstatic int game.C_100162_sc.field_102860_Q
		// @094: ifne @0AD
		// @097: goto @09B
		// @09A: athrow
		// @09B: aload_0
		// @09C: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @09F: bipush 64 (0x40)
		// @0A1: bipush 12 (0x0C)
		// @0A3: getstatic java.lang.String game.C_100194_rd.field_103073_u
		// @0A6: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @0A9: goto @0AD
		// @0AC: athrow
		// @0AD: aload_0
		// @0AE: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @0B1: bipush 53 (0x35)
		// @0B3: bipush 13 (0x0D)
		// @0B5: getstatic java.lang.String game.C_100268_mk.field_106668_e
		// @0B8: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @0BB: iload_2
		// @0BC: bipush 13 (0x0D)
		// @0BE: if_icmpeq @0CD
		// @0C1: aload_0
		// @0C2: aconst_null
		// @0C3: checkcast int[]
		// @0C6: putfield int[] game.C_100022_hf.field_103896_e
		// @0C9: goto @0CD
		// @0CC: athrow
		// @0CD: goto @10B
		// @0D0: astore_3
		// @0D1: aload_3
		// @0D2: new java.lang.StringBuilder
		// @0D5: dup
		// @0D6: invokespecial java.lang.StringBuilder.<init>()void
		// @0D9: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @0DC: iconst_3
		// @0DD: aaload
		// @0DE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0E1: aload_1
		// @0E2: ifnull @0EE
		// @0E5: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @0E8: iconst_1
		// @0E9: aaload
		// @0EA: goto @0F3
		// @0ED: athrow
		// @0EE: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @0F1: iconst_2
		// @0F2: aaload
		// @0F3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F6: bipush 44 (0x2C)
		// @0F8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FB: iload_2
		// @0FC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0FF: bipush 41 (0x29)
		// @101: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @104: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @107: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @10A: athrow
		// @10B: return
	}
	
	private final boolean func_103887_a(int arg0, int arg1, int arg2)
	{
		// @00: iload_3
		// @01: sipush 14087 (0x3707)
		// @04: if_icmpeq @09
		// @07: iconst_0
		// @08: ireturn
		// @09: bipush -18 (0xEE)
		// @0B: iload_2
		// @0C: iconst_m1
		// @0D: ixor
		// @0E: if_icmpne @54
		// @11: new game.C_100260_mc
		// @14: dup
		// @15: aload_0
		// @16: getfield game.C_100302_ka game.C_100022_hf.field_103897_b
		// @19: getfield int game.C_100302_ka.field_101840_Eb
		// @1C: aload_0
		// @1D: getfield game.C_100302_ka game.C_100022_hf.field_103897_b
		// @20: getfield int game.C_100302_ka.field_101835_xb
		// @23: aload_0
		// @24: getfield game.C_100302_ka game.C_100022_hf.field_103897_b
		// @27: getfield int game.C_100302_ka.field_101886_Kb
		// @2A: aload_0
		// @2B: getfield game.C_100302_ka game.C_100022_hf.field_103897_b
		// @2E: getfield int game.C_100302_ka.field_101848_lb
		// @31: iload_1
		// @32: getstatic game.C_100302_ka game.C_100097_k.field_104578_f
		// @35: getstatic game.C_100302_ka game.C_100151_bc.field_102932_cb
		// @38: getstatic game.C_100302_ka game.C_100164_se.field_105456_h
		// @3B: getstatic game.C_100302_ka game.C_100129_tg.field_102750_sb
		// @3E: getstatic game.C_100122_em game.C_100119_ua.field_104902_b
		// @41: getstatic game.C_100302_ka game.C_100236_on.field_100906_r
		// @44: aload_0
		// @45: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @48: aload_0
		// @49: getfield long game.C_100022_hf.field_103902_l
		// @4C: invokespecial game.C_100260_mc.<init>(int, int, int, int, int, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100122_em, game.C_100302_ka, java.lang.String, long)void
		// @4F: putstatic game.C_100260_mc game.C_100228_nn.field_106189_c
		// @52: iconst_1
		// @53: ireturn
		// @54: iconst_0
		// @55: ireturn
		// @56: astore #4
		// @58: aload #4
		// @5A: new java.lang.StringBuilder
		// @5D: dup
		// @5E: invokespecial java.lang.StringBuilder.<init>()void
		// @61: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @64: bipush 8 (0x08)
		// @66: aaload
		// @67: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6A: iload_1
		// @6B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6E: bipush 44 (0x2C)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: iload_2
		// @74: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @77: bipush 44 (0x2C)
		// @79: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7C: iload_3
		// @7D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @80: bipush 41 (0x29)
		// @82: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @85: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @88: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8B: athrow
	}
	
	public static void func_103882_b(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100022_hf.field_103907_i
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100022_hf.field_103898_c
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100022_hf.field_103900_n
		// @0C: bipush 27 (0x1B)
		// @0E: iload_0
		// @0F: bipush 11 (0x0B)
		// @11: isub
		// @12: bipush 49 (0x31)
		// @14: idiv
		// @15: idiv
		// @16: istore_1
		// @17: goto @3B
		// @1A: astore_1
		// @1B: aload_1
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @26: iconst_4
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: iload_0
		// @2C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F: bipush 41 (0x29)
		// @31: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @37: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3A: athrow
		// @3B: return
	}
	
	private final String func_103881_a(byte arg0)
	{
		// @00: iload_1
		// @01: bipush -77 (0xB3)
		// @03: if_icmplt @0F
		// @06: bipush -43 (0xD5)
		// @08: putstatic int game.C_100022_hf.field_103894_g
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aconst_null
		// @10: aload_0
		// @11: getfield java.lang.String game.C_100022_hf.field_103905_k
		// @14: if_acmpeq @22
		// @17: aload_0
		// @18: getfield java.lang.String game.C_100022_hf.field_103905_k
		// @1B: astore_2
		// @1C: getstatic int game.SteelSentinels.field_105275_O
		// @1F: ifeq @27
		// @22: aload_0
		// @23: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @26: astore_2
		// @27: aload_2
		// @28: areturn
		// @29: astore_2
		// @2A: aload_2
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @35: bipush 18 (0x12)
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_1
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 41 (0x29)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @47: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4A: athrow
	}
	
	final void func_103883_a(int arg0, int[] arg1, boolean arg2)
	{
		// @000: iload_3
		// @001: iconst_1
		// @002: if_icmpeq @010
		// @005: aload_0
		// @006: bipush -89 (0xA7)
		// @008: invokespecial game.C_100022_hf.func_103881_a(byte)java.lang.String
		// @00B: pop
		// @00C: goto @010
		// @00F: athrow
		// @010: aload_0
		// @011: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @014: ifnull @1BE
		// @017: aload_0
		// @018: getfield long game.C_100022_hf.field_103902_l
		// @01B: ldc2_w -1
		// @01E: lxor
		// @01F: getstatic long game.C_100321_hi.field_107215_f
		// @022: ldc2_w -1
		// @025: lxor
		// @026: lcmp
		// @027: ifne @037
		// @02A: goto @02E
		// @02D: athrow
		// @02E: iload_1
		// @02F: iconst_2
		// @030: if_icmpne @1BE
		// @033: goto @037
		// @036: athrow
		// @037: bipush -3 (0xFD)
		// @039: getstatic int game.C_100062_dk.field_104281_d
		// @03C: iconst_m1
		// @03D: ixor
		// @03E: if_icmpne @1BE
		// @041: goto @045
		// @044: athrow
		// @045: aload_0
		// @046: bipush -96 (0xA0)
		// @048: invokespecial game.C_100022_hf.func_103881_a(byte)java.lang.String
		// @04B: astore #4
		// @04D: aload_0
		// @04E: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @051: bipush -102 (0x9A)
		// @053: invokestatic game.C_100278_nd.func_101197_b(java.lang.String, int)game.C_100061_dh
		// @056: astore #5
		// @058: aload_0
		// @059: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @05C: bipush -45 (0xD3)
		// @05E: invokestatic game.C_100032_gk.func_103125_a(java.lang.String, byte)boolean
		// @061: istore #6
		// @063: aload #5
		// @065: ifnonnull @0EB
		// @068: iload #6
		// @06A: ifne @0EB
		// @06D: goto @071
		// @070: athrow
		// @071: aload_0
		// @072: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @075: bipush 101 (0x65)
		// @077: iconst_4
		// @078: sipush -30945 (0x871F)
		// @07B: iconst_1
		// @07C: anewarray java.lang.String
		// @07F: dup
		// @080: iconst_0
		// @081: aload #4
		// @083: aastore
		// @084: getstatic java.lang.String game.C_100220_ac.field_106061_m
		// @087: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @08A: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @08D: aload_0
		// @08E: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @091: bipush 110 (0x6E)
		// @093: bipush 6 (0x06)
		// @095: sipush -30945 (0x871F)
		// @098: iconst_1
		// @099: anewarray java.lang.String
		// @09C: dup
		// @09D: iconst_0
		// @09E: aload #4
		// @0A0: aastore
		// @0A1: getstatic java.lang.String game.C_100285_nk.field_106779_f
		// @0A4: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0A7: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @0AA: aload_2
		// @0AB: ifnull @0EB
		// @0AE: goto @0B2
		// @0B1: athrow
		// @0B2: iconst_2
		// @0B3: iload_1
		// @0B4: if_icmpeq @0EB
		// @0B7: goto @0BB
		// @0BA: athrow
		// @0BB: getstatic boolean game.C_100272_mn.field_102435_K
		// @0BE: ifeq @0C9
		// @0C1: goto @0C5
		// @0C4: athrow
		// @0C5: goto @0EB
		// @0C8: athrow
		// @0C9: aload_0
		// @0CA: aload_2
		// @0CB: putfield int[] game.C_100022_hf.field_103896_e
		// @0CE: aload_0
		// @0CF: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @0D2: bipush 66 (0x42)
		// @0D4: bipush 19 (0x13)
		// @0D6: sipush -30945 (0x871F)
		// @0D9: iconst_1
		// @0DA: anewarray java.lang.String
		// @0DD: dup
		// @0DE: iconst_0
		// @0DF: aload #4
		// @0E1: aastore
		// @0E2: getstatic java.lang.String game.C_100136_th.field_102622_S
		// @0E5: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0E8: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @0EB: aload #5
		// @0ED: ifnonnull @0F4
		// @0F0: goto @198
		// @0F3: athrow
		// @0F4: iconst_2
		// @0F5: aload_0
		// @0F6: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @0F9: invokestatic game.C_100312_ld.func_107150_a(int, java.lang.String)boolean
		// @0FC: ifne @17C
		// @0FF: getstatic boolean game.C_100272_mn.field_102435_K
		// @102: ifeq @10D
		// @105: goto @109
		// @108: athrow
		// @109: goto @17C
		// @10C: athrow
		// @10D: getstatic boolean game.C_100164_se.field_105449_g
		// @110: ifeq @117
		// @113: goto @134
		// @116: athrow
		// @117: aload_0
		// @118: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @11B: bipush 61 (0x3D)
		// @11D: bipush 8 (0x08)
		// @11F: sipush -30945 (0x871F)
		// @122: iconst_1
		// @123: anewarray java.lang.String
		// @126: dup
		// @127: iconst_0
		// @128: aload #4
		// @12A: aastore
		// @12B: getstatic java.lang.String game.C_100233_oa.field_106238_e
		// @12E: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @131: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @134: aload_0
		// @135: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @138: bipush 126 (0x7E)
		// @13A: bipush 18 (0x12)
		// @13C: sipush -30945 (0x871F)
		// @13F: iconst_1
		// @140: anewarray java.lang.String
		// @143: dup
		// @144: iconst_0
		// @145: aload #4
		// @147: aastore
		// @148: getstatic java.lang.String game.C_100227_af.field_106169_c
		// @14B: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @14E: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @151: aconst_null
		// @152: aload_2
		// @153: if_acmpne @15A
		// @156: goto @17C
		// @159: athrow
		// @15A: aload_0
		// @15B: aload_2
		// @15C: putfield int[] game.C_100022_hf.field_103896_e
		// @15F: aload_0
		// @160: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @163: bipush 114 (0x72)
		// @165: bipush 19 (0x13)
		// @167: sipush -30945 (0x871F)
		// @16A: iconst_1
		// @16B: anewarray java.lang.String
		// @16E: dup
		// @16F: iconst_0
		// @170: aload #4
		// @172: aastore
		// @173: getstatic java.lang.String game.C_100136_th.field_102622_S
		// @176: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @179: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @17C: aload_0
		// @17D: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @180: bipush 58 (0x3A)
		// @182: iconst_5
		// @183: sipush -30945 (0x871F)
		// @186: iconst_1
		// @187: anewarray java.lang.String
		// @18A: dup
		// @18B: iconst_0
		// @18C: aload #4
		// @18E: aastore
		// @18F: getstatic java.lang.String game.C_100111_el.field_104863_c
		// @192: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @195: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @198: iload #6
		// @19A: ifne @1A1
		// @19D: goto @1BE
		// @1A0: athrow
		// @1A1: aload_0
		// @1A2: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @1A5: bipush 127 (0x7F)
		// @1A7: bipush 7 (0x07)
		// @1A9: sipush -30945 (0x871F)
		// @1AC: iconst_1
		// @1AD: anewarray java.lang.String
		// @1B0: dup
		// @1B1: iconst_0
		// @1B2: aload #4
		// @1B4: aastore
		// @1B5: getstatic java.lang.String game.C_100063_dj.field_104293_e
		// @1B8: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @1BB: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @1BE: goto @208
		// @1C1: astore #4
		// @1C3: aload #4
		// @1C5: new java.lang.StringBuilder
		// @1C8: dup
		// @1C9: invokespecial java.lang.StringBuilder.<init>()void
		// @1CC: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @1CF: bipush 16 (0x10)
		// @1D1: aaload
		// @1D2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D5: iload_1
		// @1D6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1D9: bipush 44 (0x2C)
		// @1DB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1DE: aload_2
		// @1DF: ifnull @1EB
		// @1E2: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @1E5: iconst_1
		// @1E6: aaload
		// @1E7: goto @1F0
		// @1EA: athrow
		// @1EB: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @1EE: iconst_2
		// @1EF: aaload
		// @1F0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1F3: bipush 44 (0x2C)
		// @1F5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F8: iload_3
		// @1F9: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @1FC: bipush 41 (0x29)
		// @1FE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @201: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @204: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @207: athrow
		// @208: return
	}
	
	private final boolean func_103880_a(byte arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: bipush -104 (0x98)
		// @03: if_icmpeq @11
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: putstatic java.lang.String game.C_100022_hf.field_103900_n
		// @0D: goto @11
		// @10: athrow
		// @11: aconst_null
		// @12: astore #4
		// @14: bipush -5 (0xFB)
		// @16: iload_3
		// @17: iconst_m1
		// @18: ixor
		// @19: if_icmpne @2C
		// @1C: iload_2
		// @1D: aload_0
		// @1E: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @21: sipush -1064 (0xFBD8)
		// @24: invokestatic game.C_100240_oj.func_106303_a(int, java.lang.String, int)java.lang.String
		// @27: astore #4
		// @29: goto @74
		// @2C: iload_3
		// @2D: iconst_m1
		// @2E: ixor
		// @2F: bipush -6 (0xFA)
		// @31: if_icmpne @42
		// @34: aload_0
		// @35: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @38: iconst_0
		// @39: iload_2
		// @3A: invokestatic game.C_100215_ai.func_106008_a(java.lang.String, boolean, int)java.lang.String
		// @3D: astore #4
		// @3F: goto @74
		// @42: bipush 6 (0x06)
		// @44: iload_3
		// @45: if_icmpne @57
		// @48: bipush 125 (0x7D)
		// @4A: aload_0
		// @4B: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @4E: iload_2
		// @4F: invokestatic game.C_100207_qh.func_102866_a(byte, java.lang.String, int)java.lang.String
		// @52: astore #4
		// @54: goto @74
		// @57: bipush -8 (0xF8)
		// @59: iload_3
		// @5A: iconst_m1
		// @5B: ixor
		// @5C: if_icmpne @72
		// @5F: iload_2
		// @60: aload_0
		// @61: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @64: aload_0
		// @65: getfield java.lang.String game.C_100022_hf.field_103905_k
		// @68: bipush 88 (0x58)
		// @6A: invokestatic game.C_100269_ml.func_101119_a(int, java.lang.String, java.lang.String, int)java.lang.String
		// @6D: astore #4
		// @6F: goto @74
		// @72: iconst_0
		// @73: ireturn
		// @74: aconst_null
		// @75: aload #4
		// @77: if_acmpne @7E
		// @7A: goto @8C
		// @7D: athrow
		// @7E: aconst_null
		// @7F: ldc -1221466785 (0xb731e55f)
		// @81: iconst_0
		// @82: iconst_2
		// @83: aload_0
		// @84: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @87: aload #4
		// @89: invokestatic game.C_100019_wl.func_103834_a(java.lang.String, int, int, int, java.lang.String, java.lang.String)void
		// @8C: iconst_1
		// @8D: ireturn
		// @8E: astore #4
		// @90: aload #4
		// @92: new java.lang.StringBuilder
		// @95: dup
		// @96: invokespecial java.lang.StringBuilder.<init>()void
		// @99: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @9C: bipush 7 (0x07)
		// @9E: aaload
		// @9F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A2: iload_1
		// @A3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A6: bipush 44 (0x2C)
		// @A8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AB: iload_2
		// @AC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AF: bipush 44 (0x2C)
		// @B1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B4: iload_3
		// @B5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B8: bipush 41 (0x29)
		// @BA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BD: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C0: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C3: athrow
	}
	
	final void func_103885_a(int arg0, boolean arg1)
	{
		// @00: aload_0
		// @01: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @04: bipush -127 (0x81)
		// @06: iload_2
		// @07: invokevirtual game.C_100270_mi.func_101809_a(byte, boolean)void
		// @0A: iload_1
		// @0B: sipush 9324 (0x246C)
		// @0E: if_icmpeq @16
		// @11: bipush 116 (0x74)
		// @13: putstatic int game.C_100022_hf.field_103893_f
		// @16: goto @44
		// @19: astore_3
		// @1A: aload_3
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @25: bipush 10 (0x0A)
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: iload_1
		// @2C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F: bipush 44 (0x2C)
		// @31: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34: iload_2
		// @35: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @38: bipush 41 (0x29)
		// @3A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @40: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @43: athrow
		// @44: return
	}
	
	final void func_103884_a(boolean arg0, boolean arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: iload_2
		// @006: ifeq @011
		// @009: iconst_0
		// @00A: putstatic boolean game.C_100022_hf.field_103904_j
		// @00D: goto @011
		// @010: athrow
		// @011: aload_0
		// @012: getfield java.lang.String game.C_100022_hf.field_103901_o
		// @015: ifnull @175
		// @018: getstatic long game.C_100321_hi.field_107215_f
		// @01B: ldc2_w -1
		// @01E: lxor
		// @01F: aload_0
		// @020: getfield long game.C_100022_hf.field_103902_l
		// @023: ldc2_w -1
		// @026: lxor
		// @027: lcmp
		// @028: ifeq @175
		// @02B: goto @02F
		// @02E: athrow
		// @02F: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @032: ifnull @175
		// @035: goto @039
		// @038: athrow
		// @039: bipush 107 (0x6B)
		// @03B: invokestatic game.C_100227_af.func_106156_a(byte)boolean
		// @03E: ifeq @175
		// @041: goto @045
		// @044: athrow
		// @045: iconst_0
		// @046: aload_0
		// @047: getfield long game.C_100022_hf.field_103902_l
		// @04A: invokestatic game.C_100107_u.func_104768_a(int, long)game.C_100054_ec
		// @04D: astore_3
		// @04E: bipush 16 (0x10)
		// @050: aload_0
		// @051: getfield long game.C_100022_hf.field_103902_l
		// @054: invokestatic game.C_100194_rd.func_103068_a(int, long)game.C_100054_ec
		// @057: astore #4
		// @059: aload_0
		// @05A: bipush -84 (0xAC)
		// @05C: invokespecial game.C_100022_hf.func_103881_a(byte)java.lang.String
		// @05F: astore #5
		// @061: aload #4
		// @063: ifnull @0A8
		// @066: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @069: getfield boolean game.C_100211_qd.field_102173_Ic
		// @06C: ifeq @087
		// @06F: goto @073
		// @072: athrow
		// @073: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @076: getfield int game.C_100211_qd.field_102157_Ec
		// @079: iconst_m1
		// @07A: ixor
		// @07B: iconst_m1
		// @07C: if_icmple @087
		// @07F: goto @083
		// @082: athrow
		// @083: goto @175
		// @086: athrow
		// @087: aload_0
		// @088: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @08B: bipush 106 (0x6A)
		// @08D: iconst_1
		// @08E: sipush -30945 (0x871F)
		// @091: iconst_1
		// @092: anewarray java.lang.String
		// @095: dup
		// @096: iconst_0
		// @097: aload #5
		// @099: aastore
		// @09A: getstatic java.lang.String game.C_100227_af.field_106167_e
		// @09D: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0A0: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @0A3: iload #6
		// @0A5: ifeq @175
		// @0A8: aconst_null
		// @0A9: aload_3
		// @0AA: if_acmpeq @175
		// @0AD: goto @0B1
		// @0B0: athrow
		// @0B1: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @0B4: getfield boolean game.C_100211_qd.field_102135_Dc
		// @0B7: ifeq @175
		// @0BA: goto @0BE
		// @0BD: athrow
		// @0BE: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @0C1: getfield int game.C_100211_qd.field_102160_Zb
		// @0C4: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @0C7: getfield int game.C_100211_qd.field_102138_ec
		// @0CA: if_icmple @175
		// @0CD: goto @0D1
		// @0D0: athrow
		// @0D1: aload_3
		// @0D2: getfield boolean game.C_100054_ec.field_101971_bc
		// @0D5: ifeq @101
		// @0D8: goto @0DC
		// @0DB: athrow
		// @0DC: aload_0
		// @0DD: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @0E0: bipush 91 (0x5B)
		// @0E2: iconst_1
		// @0E3: sipush -30945 (0x871F)
		// @0E6: iconst_1
		// @0E7: anewarray java.lang.String
		// @0EA: dup
		// @0EB: iconst_0
		// @0EC: aload #5
		// @0EE: aastore
		// @0EF: getstatic java.lang.String game.C_100122_em.field_102076_fc
		// @0F2: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0F5: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @0F8: iload #6
		// @0FA: ifeq @175
		// @0FD: goto @101
		// @100: athrow
		// @101: iload_1
		// @102: ifeq @155
		// @105: goto @109
		// @108: athrow
		// @109: aload_3
		// @10A: getfield boolean game.C_100054_ec.field_101961_jc
		// @10D: ifeq @155
		// @110: goto @114
		// @113: athrow
		// @114: aload_0
		// @115: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @118: bipush 84 (0x54)
		// @11A: iconst_0
		// @11B: sipush -30945 (0x871F)
		// @11E: iconst_1
		// @11F: anewarray java.lang.String
		// @122: dup
		// @123: iconst_0
		// @124: aload #5
		// @126: aastore
		// @127: getstatic java.lang.String game.C_100215_ai.field_106023_i
		// @12A: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @12D: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @130: aload_0
		// @131: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @134: bipush 119 (0x77)
		// @136: iconst_1
		// @137: sipush -30945 (0x871F)
		// @13A: iconst_1
		// @13B: anewarray java.lang.String
		// @13E: dup
		// @13F: iconst_0
		// @140: aload #5
		// @142: aastore
		// @143: getstatic java.lang.String game.C_100075_uj.field_100650_m
		// @146: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @149: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @14C: iload #6
		// @14E: ifeq @175
		// @151: goto @155
		// @154: athrow
		// @155: aload_0
		// @156: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @159: bipush 108 (0x6C)
		// @15B: iconst_0
		// @15C: sipush -30945 (0x871F)
		// @15F: iconst_1
		// @160: anewarray java.lang.String
		// @163: dup
		// @164: iconst_0
		// @165: aload #5
		// @167: aastore
		// @168: getstatic java.lang.String game.C_100108_ee.field_100385_d
		// @16B: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @16E: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @171: goto @175
		// @174: athrow
		// @175: goto @1A3
		// @178: astore_3
		// @179: aload_3
		// @17A: new java.lang.StringBuilder
		// @17D: dup
		// @17E: invokespecial java.lang.StringBuilder.<init>()void
		// @181: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @184: bipush 9 (0x09)
		// @186: aaload
		// @187: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @18A: iload_1
		// @18B: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @18E: bipush 44 (0x2C)
		// @190: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @193: iload_2
		// @194: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @197: bipush 41 (0x29)
		// @199: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @19C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @19F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1A2: athrow
		// @1A3: return
	}
	
	private final boolean func_103891_b(byte arg0, int arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: iload_1
		// @006: bipush 32 (0x20)
		// @008: if_icmpge @00D
		// @00B: iconst_0
		// @00C: ireturn
		// @00D: iload_2
		// @00E: iconst_m1
		// @00F: ixor
		// @010: iconst_m1
		// @011: if_icmpeq @0BD
		// @014: iconst_1
		// @015: iload_2
		// @016: if_icmpne @030
		// @019: goto @01D
		// @01C: athrow
		// @01D: bipush 27 (0x1B)
		// @01F: iload_3
		// @020: aload_0
		// @021: getfield long game.C_100022_hf.field_103902_l
		// @024: invokestatic game.C_100133_tk.func_104989_a(byte, int, long)void
		// @027: iload #5
		// @029: ifeq @0CC
		// @02C: goto @030
		// @02F: athrow
		// @030: iload_2
		// @031: iconst_2
		// @032: if_icmpeq @0AB
		// @035: goto @039
		// @038: athrow
		// @039: bipush -4 (0xFC)
		// @03B: iload_2
		// @03C: iconst_m1
		// @03D: ixor
		// @03E: if_icmpeq @098
		// @041: goto @045
		// @044: athrow
		// @045: bipush 10 (0x0A)
		// @047: iload_2
		// @048: if_icmpne @063
		// @04B: goto @04F
		// @04E: athrow
		// @04F: aload_0
		// @050: getfield int game.C_100022_hf.field_103895_d
		// @053: sipush -1999 (0xF831)
		// @056: iload_3
		// @057: invokestatic game.C_100335_il.func_107364_a(int, int, int)void
		// @05A: iload #5
		// @05C: ifeq @0CC
		// @05F: goto @063
		// @062: athrow
		// @063: bipush 15 (0x0F)
		// @065: iload_2
		// @066: if_icmpeq @086
		// @069: goto @06D
		// @06C: athrow
		// @06D: iload_2
		// @06E: iconst_m1
		// @06F: ixor
		// @070: bipush -17 (0xEF)
		// @072: if_icmpeq @07B
		// @075: goto @079
		// @078: athrow
		// @079: iconst_0
		// @07A: ireturn
		// @07B: iconst_m1
		// @07C: iconst_0
		// @07D: iload_3
		// @07E: invokestatic game.C_100282_nh.func_102704_b(int, int, int)void
		// @081: iload #5
		// @083: ifeq @0CC
		// @086: iconst_m1
		// @087: aload_0
		// @088: getfield int game.C_100022_hf.field_103895_d
		// @08B: iload_3
		// @08C: invokestatic game.C_100282_nh.func_102704_b(int, int, int)void
		// @08F: iload #5
		// @091: ifeq @0CC
		// @094: goto @098
		// @097: athrow
		// @098: iload_3
		// @099: bipush -64 (0xC0)
		// @09B: aload_0
		// @09C: getfield int game.C_100022_hf.field_103895_d
		// @09F: invokestatic game.C_100066_dl.func_101622_a(int, byte, int)void
		// @0A2: iload #5
		// @0A4: ifeq @0CC
		// @0A7: goto @0AB
		// @0AA: athrow
		// @0AB: aload_0
		// @0AC: getfield int game.C_100022_hf.field_103895_d
		// @0AF: iconst_3
		// @0B0: iload_3
		// @0B1: invokestatic game.C_100277_nc.func_106695_a(int, int, int)void
		// @0B4: iload #5
		// @0B6: ifeq @0CC
		// @0B9: goto @0BD
		// @0BC: athrow
		// @0BD: sipush -1181 (0xFB63)
		// @0C0: aload_0
		// @0C1: getfield long game.C_100022_hf.field_103902_l
		// @0C4: iload_3
		// @0C5: invokestatic game.C_100212_qc.func_105967_a(int, long, int)void
		// @0C8: goto @0CC
		// @0CB: athrow
		// @0CC: iconst_1
		// @0CD: ireturn
		// @0CE: astore #4
		// @0D0: aload #4
		// @0D2: new java.lang.StringBuilder
		// @0D5: dup
		// @0D6: invokespecial java.lang.StringBuilder.<init>()void
		// @0D9: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @0DC: bipush 17 (0x11)
		// @0DE: aaload
		// @0DF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0E2: iload_1
		// @0E3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E6: bipush 44 (0x2C)
		// @0E8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0EB: iload_2
		// @0EC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0EF: bipush 44 (0x2C)
		// @0F1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F4: iload_3
		// @0F5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F8: bipush 41 (0x29)
		// @0FA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FD: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @100: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @103: athrow
	}
	
	C_100022_hf(C_100302_ka arg0, long arg1, String arg2, String arg3, int arg4, int arg5, int[] arg6)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: new game.C_100270_mi
		// @08: dup
		// @09: getstatic game.C_100270_mi game.C_100138_bo.field_100412_k
		// @0C: invokespecial game.C_100270_mi.<init>(game.C_100270_mi)void
		// @0F: putfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @12: aload_0
		// @13: aload_1
		// @14: putfield game.C_100302_ka game.C_100022_hf.field_103897_b
		// @17: aload_0
		// @18: aload #4
		// @1A: putfield java.lang.String game.C_100022_hf.field_103901_o
		// @1D: aload_0
		// @1E: iload #7
		// @20: putfield int game.C_100022_hf.field_103906_h
		// @23: aload_1
		// @24: iconst_1
		// @25: putfield boolean game.C_100302_ka.field_101861_U
		// @28: aload_0
		// @29: lload_2
		// @2A: putfield long game.C_100022_hf.field_103902_l
		// @2D: aload_0
		// @2E: aload #8
		// @30: putfield int[] game.C_100022_hf.field_103896_e
		// @33: aload_0
		// @34: iload #6
		// @36: putfield int game.C_100022_hf.field_103895_d
		// @39: aload_0
		// @3A: aload #5
		// @3C: putfield java.lang.String game.C_100022_hf.field_103905_k
		// @3F: goto @E5
		// @42: astore #9
		// @44: aload #9
		// @46: new java.lang.StringBuilder
		// @49: dup
		// @4A: invokespecial java.lang.StringBuilder.<init>()void
		// @4D: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @50: bipush 11 (0x0B)
		// @52: aaload
		// @53: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @56: aload_1
		// @57: ifnull @63
		// @5A: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @5D: iconst_1
		// @5E: aaload
		// @5F: goto @68
		// @62: athrow
		// @63: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @66: iconst_2
		// @67: aaload
		// @68: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6B: bipush 44 (0x2C)
		// @6D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @70: lload_2
		// @71: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @74: bipush 44 (0x2C)
		// @76: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @79: aload #4
		// @7B: ifnull @87
		// @7E: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @81: iconst_1
		// @82: aaload
		// @83: goto @8C
		// @86: athrow
		// @87: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @8A: iconst_2
		// @8B: aaload
		// @8C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8F: bipush 44 (0x2C)
		// @91: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @94: aload #5
		// @96: ifnull @A2
		// @99: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @9C: iconst_1
		// @9D: aaload
		// @9E: goto @A7
		// @A1: athrow
		// @A2: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @A5: iconst_2
		// @A6: aaload
		// @A7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AA: bipush 44 (0x2C)
		// @AC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AF: iload #6
		// @B1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B4: bipush 44 (0x2C)
		// @B6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B9: iload #7
		// @BB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BE: bipush 44 (0x2C)
		// @C0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C3: aload #8
		// @C5: ifnull @D1
		// @C8: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @CB: iconst_1
		// @CC: aaload
		// @CD: goto @D6
		// @D0: athrow
		// @D1: getstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @D4: iconst_2
		// @D5: aaload
		// @D6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D9: bipush 41 (0x29)
		// @DB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DE: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @E1: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @E4: athrow
		// @E5: return
	}
	
	static
	{
		// @000: bipush 19 (0x13)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "\u00012qR\u0000"
		// @009: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "\u0012zq0U"
		// @014: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @017: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "\u0007!3r"
		// @01F: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @022: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "\u00012q[\u0000"
		// @02A: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "\u00012qV\u0000"
		// @035: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @038: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "\u00012qZ\u0000"
		// @040: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @043: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "\u00012q\\\u0000"
		// @04C: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "\u00012qN\u0000"
		// @058: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "\u00012q]\u0000"
		// @064: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @067: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "\u00012qT\u0000"
		// @070: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @073: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "\u00012qX\u0000"
		// @07C: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "\u00012q\"A\u0007=+ \u0000"
		// @088: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "\u00012qQ\u0000"
		// @094: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @097: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "\u00012qS\u0000"
		// @0A0: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "\u00012qP\u0000"
		// @0AC: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: dup
		// @0B4: bipush 15 (0x0F)
		// @0B6: ldc "\u00012q_\u0000"
		// @0B8: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: ldc "\u00012qY\u0000"
		// @0C4: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @0C7: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 17 (0x11)
		// @0CE: ldc "\u00012qW\u0000"
		// @0D0: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @0D3: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 18 (0x12)
		// @0DA: ldc "\u00012qU\u0000"
		// @0DC: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @0DF: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @0E2: aastore
		// @0E3: putstatic java.lang.String[] game.C_100022_hf.field_103908_z
		// @0E6: iconst_0
		// @0E7: putstatic boolean game.C_100022_hf.field_103904_j
		// @0EA: ldc "/=1z\u0008\u0006$/qF\u000c:+"
		// @0EC: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @0EF: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @0F2: putstatic java.lang.String game.C_100022_hf.field_103900_n
		// @0F5: ldc "=<6m\u0008\u00195,m_\u0006&;>A\u001at/\u007fZ\u001dt0x\u0008\u0010;*l\u000898>gM\u001bt\u0011\u007fE\u000cx\u007f\u007fF\rt(q]\u00050\u007f|MI1>mQI 0>O\u001c1,m"
		// @0F7: invokestatic game.C_100022_hf.func_103879_z(java.lang.String)char[]
		// @0FA: invokestatic game.C_100022_hf.func_103877_z(char[])java.lang.String
		// @0FD: putstatic java.lang.String game.C_100022_hf.field_103898_c
		// @100: return
	}
	
	private static char[] func_103879_z(String arg0)
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
		// @0E: bipush 40 (0x28)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103877_z(char[] arg0)
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
		// @30: bipush 105 (0x69)
		// @32: goto @46
		// @35: bipush 84 (0x54)
		// @37: goto @46
		// @3A: bipush 95 (0x5F)
		// @3C: goto @46
		// @3F: bipush 30 (0x1E)
		// @41: goto @46
		// @44: bipush 40 (0x28)
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
