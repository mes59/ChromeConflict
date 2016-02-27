package game;

class C_100282_nh extends C_100079_e implements C_100334_ik
{
	static String field_102707_Pb;
	static String field_102710_Nb;
	private C_100281_ng field_102705_Kb;
	private C_100112_r field_102711_Lb;
	private boolean field_102708_Ib;
	private boolean field_102714_Ob;
	static C_100053_vn field_102713_Jb;
	private boolean field_102712_Mb;
	private boolean field_102709_Hb;
	private static final String[] field_102706_Qb;
	
	final void func_102697_a(int arg0, int arg1, String arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: aload_0
		// @006: getfield boolean game.C_100282_nh.field_102712_Mb
		// @009: ifeq @00D
		// @00C: return
		// @00D: aload_0
		// @00E: iconst_1
		// @00F: putfield boolean game.C_100282_nh.field_102712_Mb
		// @012: aload_0
		// @013: sipush 256 (0x0100)
		// @016: iload_1
		// @017: if_icmpne @01F
		// @01A: iconst_1
		// @01B: goto @020
		// @01E: athrow
		// @01F: iconst_0
		// @020: putfield boolean game.C_100282_nh.field_102714_Ob
		// @023: aload_0
		// @024: getfield game.C_100281_ng game.C_100282_nh.field_102705_Kb
		// @027: ldc 4210752 (0x404040)
		// @029: ldc 8405024 (0x804020)
		// @02B: ldc 16711935 (0xff00ff)
		// @02D: invokevirtual game.C_100281_ng.func_103453_b(int, int, int)void
		// @030: new game.C_100027_hc
		// @033: dup
		// @034: aload_0
		// @035: aload_0
		// @036: getfield game.C_100112_r game.C_100282_nh.field_102711_Lb
		// @039: aload_3
		// @03A: invokespecial game.C_100027_hc.<init>(game.C_100282_nh, game.C_100112_r, java.lang.String)void
		// @03D: astore #4
		// @03F: iload_1
		// @040: iconst_m1
		// @041: ixor
		// @042: bipush -6 (0xFA)
		// @044: if_icmpne @066
		// @047: aload #4
		// @049: iconst_0
		// @04A: getstatic java.lang.String game.C_100189_ri.field_105756_a
		// @04D: bipush 11 (0x0B)
		// @04F: invokevirtual game.C_100027_hc.func_102586_a(int, java.lang.String, int)void
		// @052: aload #4
		// @054: iconst_0
		// @055: getstatic java.lang.String game.C_100239_oi.field_102298_C
		// @058: bipush 17 (0x11)
		// @05A: invokevirtual game.C_100027_hc.func_102586_a(int, java.lang.String, int)void
		// @05D: iload #5
		// @05F: ifeq @0A4
		// @062: goto @066
		// @065: athrow
		// @066: iload_1
		// @067: iconst_m1
		// @068: ixor
		// @069: sipush -257 (0xFEFF)
		// @06C: if_icmpne @088
		// @06F: goto @073
		// @072: athrow
		// @073: aload #4
		// @075: aload_0
		// @076: bipush 102 (0x66)
		// @078: getstatic java.lang.String game.C_100027_hc.field_102601_bb
		// @07B: invokevirtual game.C_100027_hc.func_102588_a(game.C_100337_in, int, java.lang.String)game.C_100218_am
		// @07E: pop
		// @07F: iload #5
		// @081: ifeq @0A4
		// @084: goto @088
		// @087: athrow
		// @088: aload #4
		// @08A: iconst_0
		// @08B: aload_0
		// @08C: getfield boolean game.C_100282_nh.field_102709_Hb
		// @08F: ifne @09D
		// @092: goto @096
		// @095: athrow
		// @096: getstatic java.lang.String game.C_100245_pf.field_106390_a
		// @099: goto @0A0
		// @09C: athrow
		// @09D: getstatic java.lang.String game.C_100027_hc.field_102601_bb
		// @0A0: iconst_m1
		// @0A1: invokevirtual game.C_100027_hc.func_102586_a(int, java.lang.String, int)void
		// @0A4: iload_1
		// @0A5: iconst_3
		// @0A6: if_icmpeq @108
		// @0A9: bipush -5 (0xFB)
		// @0AB: iload_1
		// @0AC: iconst_m1
		// @0AD: ixor
		// @0AE: if_icmpeq @0F4
		// @0B1: goto @0B5
		// @0B4: athrow
		// @0B5: iload_1
		// @0B6: bipush 6 (0x06)
		// @0B8: if_icmpeq @0E0
		// @0BB: goto @0BF
		// @0BE: athrow
		// @0BF: bipush -10 (0xF6)
		// @0C1: iload_1
		// @0C2: iconst_m1
		// @0C3: ixor
		// @0C4: if_icmpeq @0CF
		// @0C7: goto @0CB
		// @0CA: athrow
		// @0CB: goto @117
		// @0CE: athrow
		// @0CF: aload #4
		// @0D1: aload_0
		// @0D2: bipush 88 (0x58)
		// @0D4: getstatic java.lang.String game.C_100114_q.field_100491_B
		// @0D7: invokevirtual game.C_100027_hc.func_102588_a(game.C_100337_in, int, java.lang.String)game.C_100218_am
		// @0DA: pop
		// @0DB: iload #5
		// @0DD: ifeq @117
		// @0E0: aload #4
		// @0E2: iconst_0
		// @0E3: getstatic java.lang.String game.C_100036_gg.field_103153_P
		// @0E6: bipush 9 (0x09)
		// @0E8: invokevirtual game.C_100027_hc.func_102586_a(int, java.lang.String, int)void
		// @0EB: iload #5
		// @0ED: ifeq @117
		// @0F0: goto @0F4
		// @0F3: athrow
		// @0F4: aload #4
		// @0F6: iconst_0
		// @0F7: getstatic java.lang.String game.C_100030_gm.field_103350_I
		// @0FA: bipush 8 (0x08)
		// @0FC: invokevirtual game.C_100027_hc.func_102586_a(int, java.lang.String, int)void
		// @0FF: iload #5
		// @101: ifeq @117
		// @104: goto @108
		// @107: athrow
		// @108: aload #4
		// @10A: iconst_0
		// @10B: getstatic java.lang.String game.C_100152_bd.field_105205_o
		// @10E: bipush 7 (0x07)
		// @110: invokevirtual game.C_100027_hc.func_102586_a(int, java.lang.String, int)void
		// @113: goto @117
		// @116: athrow
		// @117: aload_0
		// @118: aload #4
		// @11A: bipush 75 (0x4B)
		// @11C: invokevirtual game.C_100282_nh.func_102660_a(game.C_100336_im, byte)void
		// @11F: iload_2
		// @120: sipush 26371 (0x6703)
		// @123: if_icmpeq @12E
		// @126: iconst_0
		// @127: invokestatic game.C_100282_nh.func_102700_a(boolean)void
		// @12A: goto @12E
		// @12D: athrow
		// @12E: goto @178
		// @131: astore #4
		// @133: aload #4
		// @135: new java.lang.StringBuilder
		// @138: dup
		// @139: invokespecial java.lang.StringBuilder.<init>()void
		// @13C: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @13F: bipush 11 (0x0B)
		// @141: aaload
		// @142: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @145: iload_1
		// @146: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @149: bipush 44 (0x2C)
		// @14B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @14E: iload_2
		// @14F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @152: bipush 44 (0x2C)
		// @154: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @157: aload_3
		// @158: ifnull @164
		// @15B: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @15E: iconst_4
		// @15F: aaload
		// @160: goto @169
		// @163: athrow
		// @164: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @167: iconst_3
		// @168: aaload
		// @169: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16C: bipush 41 (0x29)
		// @16E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @171: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @174: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @177: athrow
		// @178: return
	}
	
	public void func_102581_a(int arg0, int arg1, byte arg2, C_100218_am arg3, int arg4)
	{
		// @00: bipush 114 (0x72)
		// @02: iload_3
		// @03: bipush -2 (0xFE)
		// @05: isub
		// @06: bipush 52 (0x34)
		// @08: idiv
		// @09: irem
		// @0A: istore #6
		// @0C: aload_0
		// @0D: getfield boolean game.C_100282_nh.field_102714_Ob
		// @10: ifne @2C
		// @13: bipush -7 (0xF9)
		// @15: iconst_0
		// @16: invokestatic game.C_100206_qe.func_105938_b(boolean)java.applet.Applet
		// @19: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @1C: bipush 10 (0x0A)
		// @1E: aaload
		// @1F: invokestatic game.C_100290_jm.func_106849_a(byte, java.applet.Applet, java.lang.String)void
		// @22: getstatic int game.SteelSentinels.field_105275_O
		// @25: ifeq @3B
		// @28: goto @2C
		// @2B: athrow
		// @2C: iconst_1
		// @2D: iconst_3
		// @2E: invokestatic game.C_100152_bd.func_105184_a(boolean, int)void
		// @31: aload_0
		// @32: bipush 91 (0x5B)
		// @34: invokevirtual game.C_100282_nh.func_102701_r(int)void
		// @37: goto @3B
		// @3A: athrow
		// @3B: goto @99
		// @3E: astore #6
		// @40: aload #6
		// @42: new java.lang.StringBuilder
		// @45: dup
		// @46: invokespecial java.lang.StringBuilder.<init>()void
		// @49: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @4C: bipush 9 (0x09)
		// @4E: aaload
		// @4F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @52: iload_1
		// @53: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @56: bipush 44 (0x2C)
		// @58: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B: iload_2
		// @5C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5F: bipush 44 (0x2C)
		// @61: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @64: iload_3
		// @65: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @68: bipush 44 (0x2C)
		// @6A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6D: aload #4
		// @6F: ifnull @7B
		// @72: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @75: iconst_4
		// @76: aaload
		// @77: goto @80
		// @7A: athrow
		// @7B: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @7E: iconst_3
		// @7F: aaload
		// @80: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @83: bipush 44 (0x2C)
		// @85: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @88: iload #5
		// @8A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8D: bipush 41 (0x29)
		// @8F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @92: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @95: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @98: athrow
		// @99: return
	}
	
	static final void func_102704_b(int arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: iconst_m1
		// @02: ixor
		// @03: getstatic int game.C_100079_e.field_102668_Eb
		// @06: iconst_m1
		// @07: ixor
		// @08: if_icmpeq @57
		// @0B: getstatic game.C_100105_eg game.C_100329_ih.field_107271_c
		// @0E: sipush -16397 (0xBFF3)
		// @11: getstatic int game.C_100079_e.field_102668_Eb
		// @14: i2l
		// @15: invokevirtual game.C_100105_eg.func_104724_a(int, long)game.C_100325_id
		// @18: checkcast game.C_100211_qd
		// @1B: astore_3
		// @1C: iload_1
		// @1D: putstatic int game.C_100079_e.field_102668_Eb
		// @20: aload_3
		// @21: ifnonnull @28
		// @24: goto @2D
		// @27: athrow
		// @28: aload_3
		// @29: aconst_null
		// @2A: putfield java.lang.String[] game.C_100211_qd.field_102171_lc
		// @2D: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @30: astore #4
		// @32: aload #4
		// @34: iload_2
		// @35: bipush 125 (0x7D)
		// @37: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @3A: aload #4
		// @3C: sipush 7838 (0x1E9E)
		// @3F: iconst_3
		// @40: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @43: aload #4
		// @45: iload_0
		// @46: sipush 7839 (0x1E9F)
		// @49: iadd
		// @4A: bipush 11 (0x0B)
		// @4C: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @4F: aload #4
		// @51: iload_1
		// @52: bipush 117 (0x75)
		// @54: invokevirtual game.C_100278_nd.func_101141_d(int, byte)void
		// @57: iload_0
		// @58: iconst_m1
		// @59: if_icmpeq @67
		// @5C: aconst_null
		// @5D: checkcast java.lang.String
		// @60: putstatic java.lang.String game.C_100282_nh.field_102710_Nb
		// @63: goto @67
		// @66: athrow
		// @67: goto @9D
		// @6A: astore_3
		// @6B: aload_3
		// @6C: new java.lang.StringBuilder
		// @6F: dup
		// @70: invokespecial java.lang.StringBuilder.<init>()void
		// @73: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @76: iconst_0
		// @77: aaload
		// @78: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7B: iload_0
		// @7C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7F: bipush 44 (0x2C)
		// @81: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @84: iload_1
		// @85: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @88: bipush 44 (0x2C)
		// @8A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8D: iload_2
		// @8E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @91: bipush 41 (0x29)
		// @93: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @96: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @99: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9C: athrow
		// @9D: return
	}
	
	public static void func_102700_a(boolean arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100282_nh.field_102710_Nb
		// @04: aconst_null
		// @05: putstatic game.C_100053_vn game.C_100282_nh.field_102713_Jb
		// @08: iload_0
		// @09: ifeq @17
		// @0C: aconst_null
		// @0D: checkcast game.C_100053_vn
		// @10: putstatic game.C_100053_vn game.C_100282_nh.field_102713_Jb
		// @13: goto @17
		// @16: athrow
		// @17: aconst_null
		// @18: putstatic java.lang.String game.C_100282_nh.field_102707_Pb
		// @1B: goto @40
		// @1E: astore_1
		// @1F: aload_1
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @2A: bipush 6 (0x06)
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: iload_0
		// @31: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @34: bipush 41 (0x29)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F: athrow
		// @40: return
	}
	
	C_100282_nh(C_100029_gn arg0, C_100112_r arg1, String arg2, boolean arg3, boolean arg4)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: new game.C_100027_hc
		// @05: dup
		// @06: aconst_null
		// @07: aload_2
		// @08: aload_3
		// @09: invokespecial game.C_100027_hc.<init>(game.C_100282_nh, game.C_100112_r, java.lang.String)void
		// @0C: bipush 77 (0x4D)
		// @0E: bipush 10 (0x0A)
		// @10: bipush 10 (0x0A)
		// @12: invokespecial game.C_100079_e.<init>(game.C_100029_gn, game.C_100336_im, int, int, int)void
		// @15: aload_0
		// @16: aload_2
		// @17: putfield game.C_100112_r game.C_100282_nh.field_102711_Lb
		// @1A: aload_0
		// @1B: iconst_0
		// @1C: putfield boolean game.C_100282_nh.field_102714_Ob
		// @1F: aload_0
		// @20: iconst_0
		// @21: putfield boolean game.C_100282_nh.field_102712_Mb
		// @24: aload_0
		// @25: iload #4
		// @27: putfield boolean game.C_100282_nh.field_102709_Hb
		// @2A: aload_0
		// @2B: iload #5
		// @2D: putfield boolean game.C_100282_nh.field_102708_Ib
		// @30: aload_0
		// @31: new game.C_100281_ng
		// @34: dup
		// @35: bipush 13 (0x0D)
		// @37: bipush 50 (0x32)
		// @39: sipush 274 (0x0112)
		// @3C: bipush 30 (0x1E)
		// @3E: bipush 15 (0x0F)
		// @40: ldc 2113632 (0x204060)
		// @42: ldc 4210752 (0x404040)
		// @44: invokespecial game.C_100281_ng.<init>(int, int, int, int, int, int, int)void
		// @47: putfield game.C_100281_ng game.C_100282_nh.field_102705_Kb
		// @4A: aload_0
		// @4B: getfield game.C_100281_ng game.C_100282_nh.field_102705_Kb
		// @4E: iconst_1
		// @4F: putfield boolean game.C_100281_ng.field_103471_P
		// @52: aload_0
		// @53: aload_0
		// @54: getfield game.C_100281_ng game.C_100282_nh.field_102705_Kb
		// @57: iconst_1
		// @58: invokevirtual game.C_100282_nh.func_102561_b(game.C_100336_im, int)void
		// @5B: goto @DA
		// @5E: astore #6
		// @60: aload #6
		// @62: new java.lang.StringBuilder
		// @65: dup
		// @66: invokespecial java.lang.StringBuilder.<init>()void
		// @69: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @6C: iconst_5
		// @6D: aaload
		// @6E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @71: aload_1
		// @72: ifnull @7E
		// @75: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @78: iconst_4
		// @79: aaload
		// @7A: goto @83
		// @7D: athrow
		// @7E: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @81: iconst_3
		// @82: aaload
		// @83: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @86: bipush 44 (0x2C)
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: aload_2
		// @8C: ifnull @98
		// @8F: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @92: iconst_4
		// @93: aaload
		// @94: goto @9D
		// @97: athrow
		// @98: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @9B: iconst_3
		// @9C: aaload
		// @9D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A0: bipush 44 (0x2C)
		// @A2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A5: aload_3
		// @A6: ifnull @B2
		// @A9: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @AC: iconst_4
		// @AD: aaload
		// @AE: goto @B7
		// @B1: athrow
		// @B2: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @B5: iconst_3
		// @B6: aaload
		// @B7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BA: bipush 44 (0x2C)
		// @BC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BF: iload #4
		// @C1: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @C4: bipush 44 (0x2C)
		// @C6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C9: iload #5
		// @CB: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @CE: bipush 41 (0x29)
		// @D0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D6: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D9: athrow
		// @DA: return
	}
	
	final boolean func_102506_a(char arg0, int arg1, int arg2, C_100336_im arg3)
	{
		// @00: iload_3
		// @01: sipush 22545 (0x5811)
		// @04: if_icmpeq @13
		// @07: aload_0
		// @08: aconst_null
		// @09: checkcast game.C_100281_ng
		// @0C: putfield game.C_100281_ng game.C_100282_nh.field_102705_Kb
		// @0F: goto @13
		// @12: athrow
		// @13: iload_2
		// @14: bipush 13 (0x0D)
		// @16: if_icmpeq @1D
		// @19: goto @25
		// @1C: athrow
		// @1D: aload_0
		// @1E: bipush 59 (0x3B)
		// @20: invokevirtual game.C_100282_nh.func_102701_r(int)void
		// @23: iconst_1
		// @24: ireturn
		// @25: aload_0
		// @26: iload_1
		// @27: iload_2
		// @28: sipush 22545 (0x5811)
		// @2B: aload #4
		// @2D: invokespecial game.C_100079_e.func_102506_a(char, int, int, game.C_100336_im)boolean
		// @30: ireturn
		// @31: astore #5
		// @33: aload #5
		// @35: new java.lang.StringBuilder
		// @38: dup
		// @39: invokespecial java.lang.StringBuilder.<init>()void
		// @3C: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @3F: bipush 8 (0x08)
		// @41: aaload
		// @42: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @45: iload_1
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: bipush 44 (0x2C)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: iload_2
		// @4F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @52: bipush 44 (0x2C)
		// @54: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @57: iload_3
		// @58: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5B: bipush 44 (0x2C)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: aload #4
		// @62: ifnull @6E
		// @65: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @68: iconst_4
		// @69: aaload
		// @6A: goto @73
		// @6D: athrow
		// @6E: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @71: iconst_3
		// @72: aaload
		// @73: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @76: bipush 41 (0x29)
		// @78: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @81: athrow
	}
	
	final void func_102701_r(int arg0)
	{
		// @00: aload_0
		// @01: getfield boolean game.C_100282_nh.field_102619_V
		// @04: ifne @08
		// @07: return
		// @08: aload_0
		// @09: iconst_0
		// @0A: putfield boolean game.C_100282_nh.field_102619_V
		// @0D: bipush 96 (0x60)
		// @0F: bipush -25 (0xE7)
		// @11: iload_1
		// @12: isub
		// @13: bipush 58 (0x3A)
		// @15: idiv
		// @16: idiv
		// @17: istore_2
		// @18: aload_0
		// @19: getfield boolean game.C_100282_nh.field_102709_Hb
		// @1C: ifne @39
		// @1F: aload_0
		// @20: getfield boolean game.C_100282_nh.field_102708_Ib
		// @23: ifeq @41
		// @26: goto @2A
		// @29: athrow
		// @2A: bipush 108 (0x6C)
		// @2C: invokestatic game.C_100247_pa.func_106411_a(byte)void
		// @2F: getstatic int game.SteelSentinels.field_105275_O
		// @32: ifeq @41
		// @35: goto @39
		// @38: athrow
		// @39: iconst_0
		// @3A: invokestatic game.C_100254_pi.func_106443_a(boolean)void
		// @3D: goto @41
		// @40: athrow
		// @41: goto @65
		// @44: astore_2
		// @45: aload_2
		// @46: new java.lang.StringBuilder
		// @49: dup
		// @4A: invokespecial java.lang.StringBuilder.<init>()void
		// @4D: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @50: iconst_1
		// @51: aaload
		// @52: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @55: iload_1
		// @56: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @59: bipush 41 (0x29)
		// @5B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @61: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @64: athrow
		// @65: return
	}
	
	final void func_102702_h(byte arg0)
	{
		// @00: aload_0
		// @01: getfield game.C_100281_ng game.C_100282_nh.field_102705_Kb
		// @04: ldc 4210752 (0x404040)
		// @06: ldc 2121792 (0x206040)
		// @08: ldc 16711935 (0xff00ff)
		// @0A: invokevirtual game.C_100281_ng.func_103453_b(int, int, int)void
		// @0D: new game.C_100027_hc
		// @10: dup
		// @11: aload_0
		// @12: aload_0
		// @13: getfield game.C_100112_r game.C_100282_nh.field_102711_Lb
		// @16: getstatic java.lang.String game.C_100052_eb.field_104229_d
		// @19: invokespecial game.C_100027_hc.<init>(game.C_100282_nh, game.C_100112_r, java.lang.String)void
		// @1C: astore_2
		// @1D: iload_1
		// @1E: bipush -98 (0x9E)
		// @20: if_icmpeq @2C
		// @23: aload_0
		// @24: iconst_0
		// @25: putfield boolean game.C_100282_nh.field_102709_Hb
		// @28: goto @2C
		// @2B: athrow
		// @2C: aload_2
		// @2D: iload_1
		// @2E: bipush -98 (0x9E)
		// @30: ixor
		// @31: getstatic java.lang.String game.C_100210_qa.field_101049_E
		// @34: bipush 15 (0x0F)
		// @36: invokevirtual game.C_100027_hc.func_102586_a(int, java.lang.String, int)void
		// @39: aload_0
		// @3A: aload_2
		// @3B: bipush 75 (0x4B)
		// @3D: invokevirtual game.C_100282_nh.func_102660_a(game.C_100336_im, byte)void
		// @40: goto @64
		// @43: astore_2
		// @44: aload_2
		// @45: new java.lang.StringBuilder
		// @48: dup
		// @49: invokespecial java.lang.StringBuilder.<init>()void
		// @4C: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @4F: iconst_2
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
	
	static final void func_102703_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #17
		// @005: iload #4
		// @007: bipush -5 (0xFB)
		// @009: if_icmpeq @017
		// @00C: aconst_null
		// @00D: checkcast java.lang.String
		// @010: putstatic java.lang.String game.C_100282_nh.field_102710_Nb
		// @013: goto @017
		// @016: athrow
		// @017: iload_0
		// @018: iconst_m1
		// @019: ixor
		// @01A: iload #10
		// @01C: iconst_m1
		// @01D: ixor
		// @01E: if_icmpge @0B7
		// @021: iload_0
		// @022: iload #6
		// @024: if_icmplt @08C
		// @027: goto @02B
		// @02A: athrow
		// @02B: iload #6
		// @02D: iload #10
		// @02F: if_icmpgt @061
		// @032: goto @036
		// @035: athrow
		// @036: getstatic int[] game.C_100196_rb.field_105818_d
		// @039: iload #6
		// @03B: iload #8
		// @03D: iload #12
		// @03F: iload #15
		// @041: iload_2
		// @042: bipush -31 (0xE1)
		// @044: iload #10
		// @046: iload_3
		// @047: iload #14
		// @049: iload_0
		// @04A: iload_1
		// @04B: iload #11
		// @04D: iload #13
		// @04F: iload #9
		// @051: iload #5
		// @053: iload #7
		// @055: invokestatic game.C_100330_ig.func_107276_a(int[], int, int, int, int, int, byte, int, int, int, int, int, int, int, int, int, int)void
		// @058: iload #17
		// @05A: ifeq @14C
		// @05D: goto @061
		// @060: athrow
		// @061: getstatic int[] game.C_100196_rb.field_105818_d
		// @064: iload #10
		// @066: iload #12
		// @068: iload #8
		// @06A: iload #15
		// @06C: iload #7
		// @06E: bipush -56 (0xC8)
		// @070: iload #6
		// @072: iload #9
		// @074: iload #14
		// @076: iload_0
		// @077: iload #13
		// @079: iload #11
		// @07B: iload_1
		// @07C: iload_3
		// @07D: iload #5
		// @07F: iload_2
		// @080: invokestatic game.C_100330_ig.func_107276_a(int[], int, int, int, int, int, byte, int, int, int, int, int, int, int, int, int, int)void
		// @083: iload #17
		// @085: ifeq @14C
		// @088: goto @08C
		// @08B: athrow
		// @08C: getstatic int[] game.C_100196_rb.field_105818_d
		// @08F: iload #10
		// @091: iload #11
		// @093: iload #8
		// @095: iload #9
		// @097: iload #7
		// @099: bipush 110 (0x6E)
		// @09B: iload_0
		// @09C: iload #15
		// @09E: iload_2
		// @09F: iload #6
		// @0A1: iload #5
		// @0A3: iload #12
		// @0A5: iload_1
		// @0A6: iload_3
		// @0A7: iload #13
		// @0A9: iload #14
		// @0AB: invokestatic game.C_100330_ig.func_107276_a(int[], int, int, int, int, int, byte, int, int, int, int, int, int, int, int, int, int)void
		// @0AE: iload #17
		// @0B0: ifeq @14C
		// @0B3: goto @0B7
		// @0B6: athrow
		// @0B7: iload #6
		// @0B9: iload #10
		// @0BB: if_icmple @0ED
		// @0BE: goto @0C2
		// @0C1: athrow
		// @0C2: getstatic int[] game.C_100196_rb.field_105818_d
		// @0C5: iload_0
		// @0C6: iload #8
		// @0C8: iload #11
		// @0CA: iload #9
		// @0CC: iload #14
		// @0CE: bipush 119 (0x77)
		// @0D0: iload #10
		// @0D2: iload_3
		// @0D3: iload_2
		// @0D4: iload #6
		// @0D6: iload_1
		// @0D7: iload #12
		// @0D9: iload #5
		// @0DB: iload #15
		// @0DD: iload #13
		// @0DF: iload #7
		// @0E1: invokestatic game.C_100330_ig.func_107276_a(int[], int, int, int, int, int, byte, int, int, int, int, int, int, int, int, int, int)void
		// @0E4: iload #17
		// @0E6: ifeq @14C
		// @0E9: goto @0ED
		// @0EC: athrow
		// @0ED: iload_0
		// @0EE: iconst_m1
		// @0EF: ixor
		// @0F0: iload #6
		// @0F2: iconst_m1
		// @0F3: ixor
		// @0F4: if_icmpgt @126
		// @0F7: goto @0FB
		// @0FA: athrow
		// @0FB: getstatic int[] game.C_100196_rb.field_105818_d
		// @0FE: iload #6
		// @100: iload #11
		// @102: iload #12
		// @104: iload_3
		// @105: iload_2
		// @106: bipush -32 (0xE0)
		// @108: iload_0
		// @109: iload #15
		// @10B: iload #7
		// @10D: iload #10
		// @10F: iload #5
		// @111: iload #8
		// @113: iload #13
		// @115: iload #9
		// @117: iload_1
		// @118: iload #14
		// @11A: invokestatic game.C_100330_ig.func_107276_a(int[], int, int, int, int, int, byte, int, int, int, int, int, int, int, int, int, int)void
		// @11D: iload #17
		// @11F: ifeq @14C
		// @122: goto @126
		// @125: athrow
		// @126: getstatic int[] game.C_100196_rb.field_105818_d
		// @129: iload_0
		// @12A: iload #12
		// @12C: iload #11
		// @12E: iload_3
		// @12F: iload #14
		// @131: bipush 113 (0x71)
		// @133: iload #6
		// @135: iload #9
		// @137: iload #7
		// @139: iload #10
		// @13B: iload #13
		// @13D: iload #8
		// @13F: iload #5
		// @141: iload #15
		// @143: iload_1
		// @144: iload_2
		// @145: invokestatic game.C_100330_ig.func_107276_a(int[], int, int, int, int, int, byte, int, int, int, int, int, int, int, int, int, int)void
		// @148: goto @14C
		// @14B: athrow
		// @14C: goto @206
		// @14F: astore #16
		// @151: aload #16
		// @153: new java.lang.StringBuilder
		// @156: dup
		// @157: invokespecial java.lang.StringBuilder.<init>()void
		// @15A: getstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @15D: bipush 7 (0x07)
		// @15F: aaload
		// @160: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @163: iload_0
		// @164: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @167: bipush 44 (0x2C)
		// @169: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16C: iload_1
		// @16D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @170: bipush 44 (0x2C)
		// @172: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @175: iload_2
		// @176: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @179: bipush 44 (0x2C)
		// @17B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17E: iload_3
		// @17F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @182: bipush 44 (0x2C)
		// @184: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @187: iload #4
		// @189: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @18C: bipush 44 (0x2C)
		// @18E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @191: iload #5
		// @193: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @196: bipush 44 (0x2C)
		// @198: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @19B: iload #6
		// @19D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1A0: bipush 44 (0x2C)
		// @1A2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1A5: iload #7
		// @1A7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1AA: bipush 44 (0x2C)
		// @1AC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1AF: iload #8
		// @1B1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1B4: bipush 44 (0x2C)
		// @1B6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1B9: iload #9
		// @1BB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1BE: bipush 44 (0x2C)
		// @1C0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1C3: iload #10
		// @1C5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1C8: bipush 44 (0x2C)
		// @1CA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1CD: iload #11
		// @1CF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1D2: bipush 44 (0x2C)
		// @1D4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D7: iload #12
		// @1D9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1DC: bipush 44 (0x2C)
		// @1DE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1E1: iload #13
		// @1E3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1E6: bipush 44 (0x2C)
		// @1E8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1EB: iload #14
		// @1ED: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1F0: bipush 44 (0x2C)
		// @1F2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F5: iload #15
		// @1F7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1FA: bipush 41 (0x29)
		// @1FC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1FF: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @202: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @205: athrow
		// @206: return
	}
	
	static
	{
		// @00: bipush 12 (0x0C)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\u0019 \u0015\u001f+_"
		// @09: invokestatic game.C_100282_nh.func_102699_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100282_nh.func_102698_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u0019 \u0015\u001e+_"
		// @14: invokestatic game.C_100282_nh.func_102699_z(java.lang.String)char[]
		// @17: invokestatic game.C_100282_nh.func_102698_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u0019 \u0015\u0013)_"
		// @1F: invokestatic game.C_100282_nh.func_102699_z(java.lang.String)char[]
		// @22: invokestatic game.C_100282_nh.func_102698_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\u0019=W1"
		// @2A: invokestatic game.C_100282_nh.func_102699_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100282_nh.func_102698_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\u000cf\u0015s\u0015"
		// @35: invokestatic game.C_100282_nh.func_102699_z(java.lang.String)char[]
		// @38: invokestatic game.C_100282_nh.func_102698_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\u0019 \u0015a\u0001\u0019!Oc@"
		// @40: invokestatic game.C_100282_nh.func_102699_z(java.lang.String)char[]
		// @43: invokestatic game.C_100282_nh.func_102698_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "\u0019 \u0015\u0010)_"
		// @4C: invokestatic game.C_100282_nh.func_102699_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100282_nh.func_102698_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "\u0019 \u0015\u001c+_"
		// @58: invokestatic game.C_100282_nh.func_102699_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100282_nh.func_102698_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "\u0019 \u0015\u001b)_"
		// @64: invokestatic game.C_100282_nh.func_102699_z(java.lang.String)char[]
		// @67: invokestatic game.C_100282_nh.func_102698_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "\u0019 \u0015\u0017)_"
		// @70: invokestatic game.C_100282_nh.func_102699_z(java.lang.String)char[]
		// @73: invokestatic game.C_100282_nh.func_102698_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "\u0003'X5\t\u0019/^9\u0001\u00048W<\u0011\u0019)V8F\u0000;"
		// @7C: invokestatic game.C_100282_nh.func_102699_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100282_nh.func_102698_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "\u0019 \u0015\u0012)_"
		// @88: invokestatic game.C_100282_nh.func_102699_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100282_nh.func_102698_z(char[])java.lang.String
		// @8E: aastore
		// @8F: putstatic java.lang.String[] game.C_100282_nh.field_102706_Qb
		// @92: ldc "88O4\u0007\u0019;\u001b\u0010\r\u0019="
		// @94: invokestatic game.C_100282_nh.func_102699_z(java.lang.String)char[]
		// @97: invokestatic game.C_100282_nh.func_102698_z(char[])java.lang.String
		// @9A: putstatic java.lang.String game.C_100282_nh.field_102710_Nb
		// @9D: ldc "$ T*H\u0016$W}\u000f\u0016%^}\u000b\u001f)O"
		// @9F: invokestatic game.C_100282_nh.func_102699_z(java.lang.String)char[]
		// @A2: invokestatic game.C_100282_nh.func_102698_z(char[])java.lang.String
		// @A5: putstatic java.lang.String game.C_100282_nh.field_102707_Pb
		// @A8: return
	}
	
	private static char[] func_102699_z(String arg0)
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
		// @0E: bipush 104 (0x68)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_102698_z(char[] arg0)
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
		// @30: bipush 119 (0x77)
		// @32: goto @46
		// @35: bipush 72 (0x48)
		// @37: goto @46
		// @3A: bipush 59 (0x3B)
		// @3C: goto @46
		// @3F: bipush 93 (0x5D)
		// @41: goto @46
		// @44: bipush 104 (0x68)
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
