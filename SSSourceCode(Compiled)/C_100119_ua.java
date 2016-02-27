package game;

final class C_100119_ua
{
	static String field_104909_i;
	private int field_104908_h;
	private C_100158_da[] field_104899_g;
	static C_100122_em field_104902_b;
	static String field_104904_a;
	static String field_104898_f;
	static int field_104907_k;
	private int field_104900_d;
	private C_100158_da field_104903_c;
	static int field_104905_j;
	private C_100158_da field_104901_e;
	private static final String[] field_104906_z;
	
	final void func_104893_a(C_100158_da arg0, long arg1, boolean arg2)
	{
		// @00: aconst_null
		// @01: aload_1
		// @02: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @05: if_acmpne @0C
		// @08: goto @12
		// @0B: athrow
		// @0C: aload_1
		// @0D: bipush 45 (0x2D)
		// @0F: invokevirtual game.C_100158_da.func_100583_c(int)void
		// @12: aload_0
		// @13: getfield game.C_100158_da[] game.C_100119_ua.field_104899_g
		// @16: lload_2
		// @17: aload_0
		// @18: getfield int game.C_100119_ua.field_104900_d
		// @1B: iconst_m1
		// @1C: iadd
		// @1D: i2l
		// @1E: land
		// @1F: l2i
		// @20: aaload
		// @21: astore #5
		// @23: aload_1
		// @24: aload #5
		// @26: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @29: putfield game.C_100158_da game.C_100158_da.field_100599_i
		// @2C: aload_1
		// @2D: aload #5
		// @2F: putfield game.C_100158_da game.C_100158_da.field_100590_f
		// @32: aload_1
		// @33: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @36: aload_1
		// @37: putfield game.C_100158_da game.C_100158_da.field_100590_f
		// @3A: iload #4
		// @3C: iconst_1
		// @3D: if_icmpeq @49
		// @40: bipush 122 (0x7A)
		// @42: invokestatic game.C_100119_ua.func_104889_b(byte)void
		// @45: goto @49
		// @48: athrow
		// @49: aload_1
		// @4A: lload_2
		// @4B: putfield long game.C_100158_da.field_100595_c
		// @4E: aload_1
		// @4F: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @52: aload_1
		// @53: putfield game.C_100158_da game.C_100158_da.field_100599_i
		// @56: goto @A1
		// @59: astore #5
		// @5B: aload #5
		// @5D: new java.lang.StringBuilder
		// @60: dup
		// @61: invokespecial java.lang.StringBuilder.<init>()void
		// @64: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @67: bipush 13 (0x0D)
		// @69: aaload
		// @6A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6D: aload_1
		// @6E: ifnull @7A
		// @71: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @74: iconst_1
		// @75: aaload
		// @76: goto @7F
		// @79: athrow
		// @7A: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @7D: iconst_3
		// @7E: aaload
		// @7F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @82: bipush 44 (0x2C)
		// @84: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @87: lload_2
		// @88: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @8B: bipush 44 (0x2C)
		// @8D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @90: iload #4
		// @92: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @95: bipush 41 (0x29)
		// @97: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A0: athrow
		// @A1: return
	}
	
	public static void func_104889_b(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100122_em game.C_100119_ua.field_104902_b
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100119_ua.field_104898_f
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100119_ua.field_104904_a
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100119_ua.field_104909_i
		// @10: iload_0
		// @11: bipush 45 (0x2D)
		// @13: if_icmpgt @1D
		// @16: aconst_null
		// @17: checkcast java.lang.String
		// @1A: putstatic java.lang.String game.C_100119_ua.field_104909_i
		// @1D: goto @42
		// @20: astore_1
		// @21: aload_1
		// @22: new java.lang.StringBuilder
		// @25: dup
		// @26: invokespecial java.lang.StringBuilder.<init>()void
		// @29: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @2C: bipush 9 (0x09)
		// @2E: aaload
		// @2F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @32: iload_0
		// @33: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @36: bipush 41 (0x29)
		// @38: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @41: athrow
		// @42: return
	}
	
	final C_100158_da func_104894_a(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iconst_m1
		// @06: aload_0
		// @07: getfield int game.C_100119_ua.field_104908_h
		// @0A: iconst_m1
		// @0B: ixor
		// @0C: if_icmple @34
		// @0F: aload_0
		// @10: getfield game.C_100158_da game.C_100119_ua.field_104901_e
		// @13: aload_0
		// @14: getfield game.C_100158_da[] game.C_100119_ua.field_104899_g
		// @17: aload_0
		// @18: getfield int game.C_100119_ua.field_104908_h
		// @1B: iconst_1
		// @1C: isub
		// @1D: aaload
		// @1E: if_acmpeq @34
		// @21: goto @25
		// @24: athrow
		// @25: aload_0
		// @26: getfield game.C_100158_da game.C_100119_ua.field_104901_e
		// @29: astore_2
		// @2A: aload_0
		// @2B: aload_2
		// @2C: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @2F: putfield game.C_100158_da game.C_100119_ua.field_104901_e
		// @32: aload_2
		// @33: areturn
		// @34: bipush -9 (0xF7)
		// @36: iload_1
		// @37: bipush -84 (0xAC)
		// @39: isub
		// @3A: bipush 35 (0x23)
		// @3C: idiv
		// @3D: irem
		// @3E: istore_2
		// @3F: aload_0
		// @40: getfield int game.C_100119_ua.field_104900_d
		// @43: iconst_m1
		// @44: ixor
		// @45: aload_0
		// @46: getfield int game.C_100119_ua.field_104908_h
		// @49: iconst_m1
		// @4A: ixor
		// @4B: if_icmpge @80
		// @4E: aload_0
		// @4F: getfield game.C_100158_da[] game.C_100119_ua.field_104899_g
		// @52: aload_0
		// @53: dup
		// @54: getfield int game.C_100119_ua.field_104908_h
		// @57: dup_x1
		// @58: iconst_1
		// @59: iadd
		// @5A: putfield int game.C_100119_ua.field_104908_h
		// @5D: aaload
		// @5E: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @61: astore_3
		// @62: aload_3
		// @63: aload_0
		// @64: getfield game.C_100158_da[] game.C_100119_ua.field_104899_g
		// @67: iconst_m1
		// @68: aload_0
		// @69: getfield int game.C_100119_ua.field_104908_h
		// @6C: iadd
		// @6D: aaload
		// @6E: if_acmpeq @7B
		// @71: aload_0
		// @72: aload_3
		// @73: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @76: putfield game.C_100158_da game.C_100119_ua.field_104901_e
		// @79: aload_3
		// @7A: areturn
		// @7B: iload #4
		// @7D: ifeq @3F
		// @80: aconst_null
		// @81: areturn
		// @82: astore_2
		// @83: aload_2
		// @84: new java.lang.StringBuilder
		// @87: dup
		// @88: invokespecial java.lang.StringBuilder.<init>()void
		// @8B: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @8E: bipush 12 (0x0C)
		// @90: aaload
		// @91: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @94: iload_1
		// @95: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @98: bipush 41 (0x29)
		// @9A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A0: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A3: athrow
	}
	
	static final int func_104895_a(int arg0, int arg1, boolean arg2, C_100302_ka arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #13
		// @005: bipush 82 (0x52)
		// @007: invokestatic game.C_100044_vm.func_100933_a(byte)boolean
		// @00A: ifne @00F
		// @00D: iload_0
		// @00E: ireturn
		// @00F: iload_1
		// @010: bipush 15 (0x0F)
		// @012: if_icmpeq @020
		// @015: aconst_null
		// @016: checkcast game.C_100122_em
		// @019: putstatic game.C_100122_em game.C_100119_ua.field_104902_b
		// @01C: goto @020
		// @01F: athrow
		// @020: getstatic int game.C_100233_oa.field_106250_h
		// @023: istore #4
		// @025: iconst_1
		// @026: istore #6
		// @028: iconst_0
		// @029: istore #7
		// @02B: iload #7
		// @02D: iconst_m1
		// @02E: ixor
		// @02F: bipush -9 (0xF7)
		// @031: if_icmple @209
		// @034: iconst_0
		// @035: istore #8
		// @037: iconst_0
		// @038: iload #13
		// @03A: ifne @20A
		// @03D: istore #9
		// @03F: iload #9
		// @041: iconst_m1
		// @042: ixor
		// @043: bipush -36 (0xDC)
		// @045: if_icmple @201
		// @048: getstatic int[] game.C_100212_qc.field_105980_j
		// @04B: iload #9
		// @04D: iaload
		// @04E: iload #7
		// @050: iload #13
		// @052: ifne @031
		// @055: if_icmpeq @05B
		// @058: goto @1F9
		// @05B: iconst_2
		// @05C: istore #5
		// @05E: iload #9
		// @060: getstatic int[] game.C_100075_uj.field_100655_u
		// @063: bipush -105 (0x97)
		// @065: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @068: ifne @06F
		// @06B: goto @072
		// @06E: athrow
		// @06F: iconst_0
		// @070: istore #5
		// @072: iload_2
		// @073: ifne @0A7
		// @076: iconst_0
		// @077: iload #5
		// @079: if_icmpeq @1F9
		// @07C: goto @080
		// @07F: athrow
		// @080: getstatic int[] game.C_100257_ln.field_106481_d
		// @083: getstatic int[] game.C_100075_uj.field_100655_u
		// @086: iload #9
		// @088: getstatic int[] game.C_100066_dl.field_101632_G
		// @08B: bipush 116 (0x74)
		// @08D: iload_1
		// @08E: bipush -73 (0xB7)
		// @090: iadd
		// @091: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @094: invokestatic game.C_100235_om.func_106281_a(int[], int[], int, int[], byte, boolean)boolean
		// @097: ifne @0BC
		// @09A: goto @09E
		// @09D: athrow
		// @09E: iload #13
		// @0A0: ifeq @1F9
		// @0A3: goto @0A7
		// @0A6: athrow
		// @0A7: iload #5
		// @0A9: iconst_m1
		// @0AA: ixor
		// @0AB: iconst_m1
		// @0AC: if_icmpeq @0BC
		// @0AF: goto @0B3
		// @0B2: athrow
		// @0B3: iload #13
		// @0B5: ifeq @1F9
		// @0B8: goto @0BC
		// @0BB: athrow
		// @0BC: iload #5
		// @0BE: ifeq @0E0
		// @0C1: goto @0C5
		// @0C4: athrow
		// @0C5: getstatic int[] game.C_100328_ia.field_107259_b
		// @0C8: iload #9
		// @0CA: iaload
		// @0CB: iconst_m1
		// @0CC: ixor
		// @0CD: getstatic int game.C_100096_un.field_104563_d
		// @0D0: iconst_m1
		// @0D1: ixor
		// @0D2: if_icmpge @0DD
		// @0D5: goto @0D9
		// @0D8: athrow
		// @0D9: goto @0E0
		// @0DC: athrow
		// @0DD: iconst_1
		// @0DE: istore #5
		// @0E0: iload #6
		// @0E2: ifne @0E9
		// @0E5: goto @181
		// @0E8: athrow
		// @0E9: iconst_0
		// @0EA: istore #6
		// @0EC: new game.C_100302_ka
		// @0EF: dup
		// @0F0: ldc2_w -1
		// @0F3: aconst_null
		// @0F4: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @0F7: astore #10
		// @0F9: aload #10
		// @0FB: getstatic game.C_100037_wb game.C_100223_ab.field_106101_c
		// @0FE: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @101: aload #10
		// @103: iconst_2
		// @104: putfield int game.C_100302_ka.field_101850_Fb
		// @107: aload #10
		// @109: iconst_0
		// @10A: bipush 18 (0x12)
		// @10C: iload_1
		// @10D: bipush -16 (0xF0)
		// @10F: iadd
		// @110: iload_0
		// @111: iload #4
		// @113: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @116: aload_3
		// @117: bipush -123 (0x85)
		// @119: aload #10
		// @11B: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @11E: iload_2
		// @11F: ifne @129
		// @122: getstatic java.lang.String game.C_100238_ol.field_101700_H
		// @125: goto @12C
		// @128: athrow
		// @129: getstatic java.lang.String game.C_100304_kl.field_107115_c
		// @12C: astore #11
		// @12E: new game.C_100302_ka
		// @131: dup
		// @132: ldc2_w -1
		// @135: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @138: aload #11
		// @13A: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @13D: astore #12
		// @13F: aload #12
		// @141: iconst_0
		// @142: putfield int game.C_100302_ka.field_101830_gb
		// @145: aload #12
		// @147: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @14A: putfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @14D: aload #12
		// @14F: iconst_0
		// @150: bipush 18 (0x12)
		// @152: iconst_m1
		// @153: iload_0
		// @154: iload #4
		// @156: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @159: aload #12
		// @15B: aconst_null
		// @15C: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @15F: aload #12
		// @161: iconst_1
		// @162: putfield int game.C_100302_ka.field_101850_Fb
		// @165: aload #12
		// @167: iconst_1
		// @168: putfield int game.C_100302_ka.field_101875_X
		// @16B: aload #12
		// @16D: iconst_1
		// @16E: putfield int game.C_100302_ka.field_101858_J
		// @171: aload_3
		// @172: bipush -114 (0x8E)
		// @174: aload #12
		// @176: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @179: iload_0
		// @17A: aload #12
		// @17C: getfield int game.C_100302_ka.field_101848_lb
		// @17F: iadd
		// @180: istore_0
		// @181: iload #8
		// @183: ifne @1CD
		// @186: iconst_1
		// @187: istore #8
		// @189: new game.C_100302_ka
		// @18C: dup
		// @18D: ldc2_w -1
		// @190: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @193: getstatic java.lang.String[] game.C_100207_qh.field_102876_V
		// @196: iload #7
		// @198: aaload
		// @199: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @19C: astore #10
		// @19E: aload #10
		// @1A0: iconst_1
		// @1A1: putfield int game.C_100302_ka.field_101850_Fb
		// @1A4: iinc #0 +2
		// @1A7: aload #10
		// @1A9: ldc 11119017 (0xa9a9a9)
		// @1AB: putfield int game.C_100302_ka.field_101830_gb
		// @1AE: aload #10
		// @1B0: getstatic game.C_100037_wb[] game.C_100321_hi.field_107228_h
		// @1B3: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @1B6: aload #10
		// @1B8: iconst_0
		// @1B9: bipush 15 (0x0F)
		// @1BB: iconst_m1
		// @1BC: iload_0
		// @1BD: iload #4
		// @1BF: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1C2: iinc #0 +15
		// @1C5: aload_3
		// @1C6: bipush -101 (0x9B)
		// @1C8: aload #10
		// @1CA: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @1CD: iinc #0 +2
		// @1D0: iload #9
		// @1D2: iload #5
		// @1D4: bipush 49 (0x31)
		// @1D6: iload #4
		// @1D8: iload_2
		// @1D9: iload_1
		// @1DA: bipush 104 (0x68)
		// @1DC: iadd
		// @1DD: invokestatic game.C_100000_gd.func_100348_a(int, int, int, int, boolean, int)game.C_100302_ka
		// @1E0: astore #10
		// @1E2: aload #10
		// @1E4: iconst_0
		// @1E5: bipush 49 (0x31)
		// @1E7: iconst_m1
		// @1E8: iload_0
		// @1E9: iload #4
		// @1EB: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1EE: iinc #0 +49
		// @1F1: aload_3
		// @1F2: bipush -79 (0xB1)
		// @1F4: aload #10
		// @1F6: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @1F9: iinc #9 +1
		// @1FC: iload #13
		// @1FE: ifeq @03F
		// @201: iinc #7 +1
		// @204: iload #13
		// @206: ifeq @02B
		// @209: iload_0
		// @20A: ireturn
		// @20B: astore #4
		// @20D: aload #4
		// @20F: new java.lang.StringBuilder
		// @212: dup
		// @213: invokespecial java.lang.StringBuilder.<init>()void
		// @216: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @219: iconst_4
		// @21A: aaload
		// @21B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @21E: iload_0
		// @21F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @222: bipush 44 (0x2C)
		// @224: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @227: iload_1
		// @228: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @22B: bipush 44 (0x2C)
		// @22D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @230: iload_2
		// @231: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @234: bipush 44 (0x2C)
		// @236: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @239: aload_3
		// @23A: ifnull @246
		// @23D: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @240: iconst_1
		// @241: aaload
		// @242: goto @24B
		// @245: athrow
		// @246: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @249: iconst_3
		// @24A: aaload
		// @24B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @24E: bipush 41 (0x29)
		// @250: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @253: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @256: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @259: athrow
	}
	
	static final int func_104896_a(byte arg0, int arg1)
	{
		// @000: ldc2_w -65537
		// @003: iload_1
		// @004: i2l
		// @005: ldc2_w -1
		// @008: lxor
		// @009: lcmp
		// @00A: iflt @0C1
		// @00D: iload_1
		// @00E: i2l
		// @00F: ldc2_w -1
		// @012: lxor
		// @013: ldc2_w -16777217
		// @016: lcmp
		// @017: ifgt @06E
		// @01A: goto @01E
		// @01D: athrow
		// @01E: ldc2_w 268435456
		// @021: iload_1
		// @022: i2l
		// @023: lcmp
		// @024: ifgt @04D
		// @027: goto @02B
		// @02A: athrow
		// @02B: ldc2_w 1073741824
		// @02E: iload_1
		// @02F: i2l
		// @030: lcmp
		// @031: ifgt @041
		// @034: goto @038
		// @037: athrow
		// @038: getstatic int[] game.C_100202_qi.field_105916_b
		// @03B: iload_1
		// @03C: ldc -1657584808 (0x9d334358)
		// @03E: ishr
		// @03F: iaload
		// @040: ireturn
		// @041: getstatic int[] game.C_100202_qi.field_105916_b
		// @044: iload_1
		// @045: ldc 1202243862 (0x47a8c916)
		// @047: ishr
		// @048: iaload
		// @049: ldc 1350223713 (0x507ac761)
		// @04B: ishr
		// @04C: ireturn
		// @04D: iload_1
		// @04E: i2l
		// @04F: ldc2_w 67108864
		// @052: lcmp
		// @053: iflt @062
		// @056: getstatic int[] game.C_100202_qi.field_105916_b
		// @059: iload_1
		// @05A: ldc -1329969900 (0xb0ba4514)
		// @05C: ishr
		// @05D: iaload
		// @05E: ldc -1914604158 (0x8de17582)
		// @060: ishr
		// @061: ireturn
		// @062: getstatic int[] game.C_100202_qi.field_105916_b
		// @065: iload_1
		// @066: ldc -1828171566 (0x930850d2)
		// @068: ishr
		// @069: iaload
		// @06A: ldc 1925293187 (0x72c1a483)
		// @06C: ishr
		// @06D: ireturn
		// @06E: iload_1
		// @06F: i2l
		// @070: ldc2_w 1048576
		// @073: lcmp
		// @074: iflt @09C
		// @077: ldc2_w 4194304
		// @07A: iload_1
		// @07B: i2l
		// @07C: lcmp
		// @07D: ifle @090
		// @080: goto @084
		// @083: athrow
		// @084: getstatic int[] game.C_100202_qi.field_105916_b
		// @087: iload_1
		// @088: ldc 1841258222 (0x6dbf5eee)
		// @08A: ishr
		// @08B: iaload
		// @08C: ldc -362069787 (0xea6b40e5)
		// @08E: ishr
		// @08F: ireturn
		// @090: getstatic int[] game.C_100202_qi.field_105916_b
		// @093: iload_1
		// @094: ldc -1987963888 (0x89821410)
		// @096: ishr
		// @097: iaload
		// @098: ldc 1222524292 (0x48de3d84)
		// @09A: ishr
		// @09B: ireturn
		// @09C: ldc2_w -262145
		// @09F: iload_1
		// @0A0: i2l
		// @0A1: ldc2_w -1
		// @0A4: lxor
		// @0A5: lcmp
		// @0A6: ifge @0B5
		// @0A9: getstatic int[] game.C_100202_qi.field_105916_b
		// @0AC: iload_1
		// @0AD: ldc 1065178762 (0x3f7d568a)
		// @0AF: ishr
		// @0B0: iaload
		// @0B1: ldc 229575911 (0xdaf0ce7)
		// @0B3: ishr
		// @0B4: ireturn
		// @0B5: getstatic int[] game.C_100202_qi.field_105916_b
		// @0B8: iload_1
		// @0B9: ldc -1073032372 (0xc00ad34c)
		// @0BB: ishr
		// @0BC: iaload
		// @0BD: ldc 1555337414 (0x5cb490c6)
		// @0BF: ishr
		// @0C0: ireturn
		// @0C1: iload_1
		// @0C2: i2l
		// @0C3: ldc2_w 256
		// @0C6: lcmp
		// @0C7: iflt @121
		// @0CA: iload_1
		// @0CB: i2l
		// @0CC: ldc2_w 4096
		// @0CF: lcmp
		// @0D0: ifge @0FC
		// @0D3: goto @0D7
		// @0D6: athrow
		// @0D7: iload_1
		// @0D8: i2l
		// @0D9: ldc2_w 1024
		// @0DC: lcmp
		// @0DD: iflt @0F0
		// @0E0: goto @0E4
		// @0E3: athrow
		// @0E4: getstatic int[] game.C_100202_qi.field_105916_b
		// @0E7: iload_1
		// @0E8: ldc 1140859012 (0x44002084)
		// @0EA: ishr
		// @0EB: iaload
		// @0EC: ldc -99246486 (0xfa159e6a)
		// @0EE: ishr
		// @0EF: ireturn
		// @0F0: getstatic int[] game.C_100202_qi.field_105916_b
		// @0F3: iload_1
		// @0F4: ldc -827684158 (0xceaa8ac2)
		// @0F6: ishr
		// @0F7: iaload
		// @0F8: ldc 1801857515 (0x6b6629eb)
		// @0FA: ishr
		// @0FB: ireturn
		// @0FC: iload_1
		// @0FD: i2l
		// @0FE: ldc2_w -1
		// @101: lxor
		// @102: ldc2_w -16385
		// @105: lcmp
		// @106: ifgt @115
		// @109: getstatic int[] game.C_100202_qi.field_105916_b
		// @10C: iload_1
		// @10D: ldc 1454137576 (0x56ac60e8)
		// @10F: ishr
		// @110: iaload
		// @111: ldc 1397225096 (0x5347f688)
		// @113: ishr
		// @114: ireturn
		// @115: getstatic int[] game.C_100202_qi.field_105916_b
		// @118: iload_1
		// @119: ldc -1532484890 (0xa4a822e6)
		// @11B: ishr
		// @11C: iaload
		// @11D: ldc -1250784599 (0xb5728aa9)
		// @11F: ishr
		// @120: ireturn
		// @121: iconst_0
		// @122: iload_1
		// @123: if_icmple @12A
		// @126: goto @133
		// @129: athrow
		// @12A: getstatic int[] game.C_100202_qi.field_105916_b
		// @12D: iload_1
		// @12E: iaload
		// @12F: ldc 351069388 (0x14ece4cc)
		// @131: ishr
		// @132: ireturn
		// @133: bipush 9 (0x09)
		// @135: bipush 16 (0x10)
		// @137: iload_0
		// @138: isub
		// @139: bipush 44 (0x2C)
		// @13B: idiv
		// @13C: idiv
		// @13D: istore_2
		// @13E: iconst_m1
		// @13F: ireturn
		// @140: astore_2
		// @141: aload_2
		// @142: new java.lang.StringBuilder
		// @145: dup
		// @146: invokespecial java.lang.StringBuilder.<init>()void
		// @149: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @14C: bipush 11 (0x0B)
		// @14E: aaload
		// @14F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @152: iload_0
		// @153: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @156: bipush 44 (0x2C)
		// @158: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @15B: iload_1
		// @15C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @15F: bipush 41 (0x29)
		// @161: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @164: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @167: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @16A: athrow
	}
	
	static final void func_104887_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush 96 (0x60)
		// @03: if_icmpeq @07
		// @06: return
		// @07: bipush 87 (0x57)
		// @09: invokestatic game.C_100253_ph.func_101085_a(byte)void
		// @0C: iconst_1
		// @0D: putstatic boolean game.C_100057_dd.field_104259_a
		// @10: iconst_1
		// @11: putstatic boolean game.C_100186_rl.field_105720_f
		// @14: getstatic game.C_100029_gn game.C_100085_a.field_102576_K
		// @17: iconst_5
		// @18: invokevirtual game.C_100029_gn.func_103362_n(int)void
		// @1B: iload_0
		// @1C: bipush 77 (0x4D)
		// @1E: ixor
		// @1F: getstatic java.lang.String game.C_100305_km.field_103232_R
		// @22: iconst_0
		// @23: invokestatic game.C_100158_da.func_100589_a(int, java.lang.String, boolean)void
		// @26: goto @4A
		// @29: astore_1
		// @2A: aload_1
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @35: iconst_5
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: iload_0
		// @3B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E: bipush 41 (0x29)
		// @40: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @46: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @49: athrow
		// @4A: return
	}
	
	static final int func_104897_a(C_100302_ka arg0, int arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: iconst_1
		// @006: getstatic int game.C_100200_ba.field_105852_c
		// @009: if_icmpeq @012
		// @00C: bipush 64 (0x40)
		// @00E: goto @014
		// @011: athrow
		// @012: bipush 78 (0x4E)
		// @014: istore_3
		// @015: sipush 1008 (0x03F0)
		// @018: getstatic int game.C_100200_ba.field_105852_c
		// @01B: iand
		// @01C: iconst_m1
		// @01D: ixor
		// @01E: iconst_m1
		// @01F: if_icmpeq @025
		// @022: bipush 36 (0x24)
		// @024: istore_3
		// @025: getstatic int game.C_100233_oa.field_106250_h
		// @028: istore #4
		// @02A: new game.C_100302_ka
		// @02D: dup
		// @02E: ldc2_w -1
		// @031: aconst_null
		// @032: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @035: astore #5
		// @037: aload #5
		// @039: iconst_2
		// @03A: putfield int game.C_100302_ka.field_101850_Fb
		// @03D: aload #5
		// @03F: getstatic game.C_100037_wb game.C_100223_ab.field_106101_c
		// @042: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @045: aload #5
		// @047: iconst_0
		// @048: bipush 18 (0x12)
		// @04A: iconst_m1
		// @04B: iload_2
		// @04C: iload #4
		// @04E: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @051: aload_0
		// @052: bipush -87 (0xA9)
		// @054: aload #5
		// @056: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @059: getstatic java.lang.String game.C_100295_kh.field_105295_n
		// @05C: astore #6
		// @05E: new game.C_100302_ka
		// @061: dup
		// @062: ldc2_w -1
		// @065: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @068: aload #6
		// @06A: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @06D: astore #7
		// @06F: aload #7
		// @071: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @074: putfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @077: aload #7
		// @079: iconst_0
		// @07A: putfield int game.C_100302_ka.field_101830_gb
		// @07D: aload #7
		// @07F: iconst_0
		// @080: bipush 18 (0x12)
		// @082: iconst_m1
		// @083: iload_2
		// @084: iload #4
		// @086: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @089: aload #7
		// @08B: aconst_null
		// @08C: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @08F: iload_1
		// @090: bipush -96 (0xA0)
		// @092: if_icmplt @098
		// @095: bipush -13 (0xF3)
		// @097: ireturn
		// @098: aload #7
		// @09A: iconst_1
		// @09B: putfield int game.C_100302_ka.field_101850_Fb
		// @09E: aload #7
		// @0A0: iconst_1
		// @0A1: putfield int game.C_100302_ka.field_101858_J
		// @0A4: aload #7
		// @0A6: iconst_1
		// @0A7: putfield int game.C_100302_ka.field_101875_X
		// @0AA: aload_0
		// @0AB: bipush -114 (0x8E)
		// @0AD: aload #7
		// @0AF: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @0B2: iload_2
		// @0B3: aload #7
		// @0B5: getfield int game.C_100302_ka.field_101848_lb
		// @0B8: iadd
		// @0B9: istore_2
		// @0BA: iconst_0
		// @0BB: istore #8
		// @0BD: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @0C0: arraylength
		// @0C1: iload #8
		// @0C3: if_icmple @106
		// @0C6: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @0C9: iload #8
		// @0CB: aaload
		// @0CC: ifnonnull @0D3
		// @0CF: goto @0FE
		// @0D2: athrow
		// @0D3: iinc #2 +2
		// @0D6: bipush -42 (0xD6)
		// @0D8: iload #8
		// @0DA: iconst_1
		// @0DB: iadd
		// @0DC: getstatic int[][] game.C_100122_em.field_102073_Xb
		// @0DF: iload #8
		// @0E1: aaload
		// @0E2: invokestatic game.C_100012_fh.func_100496_a(int, int, int[])game.C_100302_ka
		// @0E5: astore #9
		// @0E7: aload #9
		// @0E9: iconst_0
		// @0EA: iload_3
		// @0EB: iconst_m1
		// @0EC: iload_2
		// @0ED: iload #4
		// @0EF: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0F2: iload_2
		// @0F3: iload_3
		// @0F4: iadd
		// @0F5: istore_2
		// @0F6: aload_0
		// @0F7: bipush -78 (0xB2)
		// @0F9: aload #9
		// @0FB: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @0FE: iinc #8 +1
		// @101: iload #10
		// @103: ifeq @0BD
		// @106: iload_2
		// @107: ireturn
		// @108: astore_3
		// @109: aload_3
		// @10A: new java.lang.StringBuilder
		// @10D: dup
		// @10E: invokespecial java.lang.StringBuilder.<init>()void
		// @111: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @114: iconst_2
		// @115: aaload
		// @116: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @119: aload_0
		// @11A: ifnull @126
		// @11D: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @120: iconst_1
		// @121: aaload
		// @122: goto @12B
		// @125: athrow
		// @126: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @129: iconst_3
		// @12A: aaload
		// @12B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @12E: bipush 44 (0x2C)
		// @130: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @133: iload_1
		// @134: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @137: bipush 44 (0x2C)
		// @139: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13C: iload_2
		// @13D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @140: bipush 41 (0x29)
		// @142: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @145: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @148: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @14B: athrow
	}
	
	final C_100158_da func_104885_d(byte arg0)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: putfield int game.C_100119_ua.field_104908_h
		// @05: bipush -41 (0xD7)
		// @07: bipush 74 (0x4A)
		// @09: iload_1
		// @0A: isub
		// @0B: bipush 34 (0x22)
		// @0D: idiv
		// @0E: idiv
		// @0F: istore_2
		// @10: aload_0
		// @11: bipush -120 (0x88)
		// @13: invokevirtual game.C_100119_ua.func_104894_a(int)game.C_100158_da
		// @16: areturn
		// @17: astore_2
		// @18: aload_2
		// @19: new java.lang.StringBuilder
		// @1C: dup
		// @1D: invokespecial java.lang.StringBuilder.<init>()void
		// @20: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @23: bipush 7 (0x07)
		// @25: aaload
		// @26: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @29: iload_1
		// @2A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2D: bipush 41 (0x29)
		// @2F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @32: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @35: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @38: athrow
	}
	
	static final int func_104892_a(int arg0, byte arg1, int arg2)
	{
		// @00: iload_1
		// @01: iconst_3
		// @02: if_icmpeq @0E
		// @05: bipush 39 (0x27)
		// @07: putstatic int game.C_100119_ua.field_104905_j
		// @0A: goto @0E
		// @0D: athrow
		// @0E: iload_0
		// @0F: iload_2
		// @10: if_icmplt @20
		// @13: sipush 2048 (0x0800)
		// @16: iload_2
		// @17: ldc 108551888 (0x6785ed0)
		// @19: ishl
		// @1A: iload_0
		// @1B: idiv
		// @1C: invokestatic game.C_100223_ab.func_106098_a(int, int)int
		// @1F: ireturn
		// @20: sipush 2048 (0x0800)
		// @23: iload_0
		// @24: ldc 1974191664 (0x75abc630)
		// @26: ishl
		// @27: iload_2
		// @28: idiv
		// @29: invokestatic game.C_100223_ab.func_106098_a(int, int)int
		// @2C: ineg
		// @2D: sipush 2048 (0x0800)
		// @30: iadd
		// @31: ireturn
		// @32: astore_3
		// @33: aload_3
		// @34: new java.lang.StringBuilder
		// @37: dup
		// @38: invokespecial java.lang.StringBuilder.<init>()void
		// @3B: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @3E: bipush 8 (0x08)
		// @40: aaload
		// @41: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @44: iload_0
		// @45: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @48: bipush 44 (0x2C)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: iload_1
		// @4E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @51: bipush 44 (0x2C)
		// @53: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56: iload_2
		// @57: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5A: bipush 41 (0x29)
		// @5C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @62: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @65: athrow
	}
	
	static final void func_104890_c(byte arg0)
	{
		// @00: iload_0
		// @01: bipush -36 (0xDC)
		// @03: if_icmpeq @11
		// @06: aconst_null
		// @07: checkcast game.C_100122_em
		// @0A: putstatic game.C_100122_em game.C_100119_ua.field_104902_b
		// @0D: goto @11
		// @10: athrow
		// @11: getstatic java.lang.String game.C_100062_dk.field_104282_e
		// @14: iconst_1
		// @15: getstatic java.lang.String game.C_100257_ln.field_106485_a
		// @18: iconst_0
		// @19: invokestatic game.C_100318_hj.func_107193_a(java.lang.String, boolean, java.lang.String, boolean)void
		// @1C: iconst_1
		// @1D: putstatic boolean game.C_100291_jj.field_106872_f
		// @20: goto @45
		// @23: astore_1
		// @24: aload_1
		// @25: new java.lang.StringBuilder
		// @28: dup
		// @29: invokespecial java.lang.StringBuilder.<init>()void
		// @2C: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @2F: bipush 10 (0x0A)
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
	
	final C_100158_da func_104891_a(long arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: aload_0
		// @06: getfield game.C_100158_da[] game.C_100119_ua.field_104899_g
		// @09: iconst_m1
		// @0A: aload_0
		// @0B: getfield int game.C_100119_ua.field_104900_d
		// @0E: iadd
		// @0F: i2l
		// @10: lload_1
		// @11: land
		// @12: l2i
		// @13: aaload
		// @14: astore #4
		// @16: iload_3
		// @17: bipush 18 (0x12)
		// @19: if_icmpgt @21
		// @1C: aconst_null
		// @1D: checkcast game.C_100158_da
		// @20: areturn
		// @21: aload_0
		// @22: aload #4
		// @24: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @27: putfield game.C_100158_da game.C_100119_ua.field_104903_c
		// @2A: aload_0
		// @2B: getfield game.C_100158_da game.C_100119_ua.field_104903_c
		// @2E: aload #4
		// @30: if_acmpeq @78
		// @33: aload_0
		// @34: iload #6
		// @36: ifne @79
		// @39: getfield game.C_100158_da game.C_100119_ua.field_104903_c
		// @3C: getfield long game.C_100158_da.field_100595_c
		// @3F: ldc2_w -1
		// @42: lxor
		// @43: lload_1
		// @44: ldc2_w -1
		// @47: lxor
		// @48: lcmp
		// @49: ifeq @54
		// @4C: goto @50
		// @4F: athrow
		// @50: goto @68
		// @53: athrow
		// @54: aload_0
		// @55: getfield game.C_100158_da game.C_100119_ua.field_104903_c
		// @58: astore #5
		// @5A: aload_0
		// @5B: aload_0
		// @5C: getfield game.C_100158_da game.C_100119_ua.field_104903_c
		// @5F: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @62: putfield game.C_100158_da game.C_100119_ua.field_104903_c
		// @65: aload #5
		// @67: areturn
		// @68: aload_0
		// @69: aload_0
		// @6A: getfield game.C_100158_da game.C_100119_ua.field_104903_c
		// @6D: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @70: putfield game.C_100158_da game.C_100119_ua.field_104903_c
		// @73: iload #6
		// @75: ifeq @2A
		// @78: aload_0
		// @79: aconst_null
		// @7A: putfield game.C_100158_da game.C_100119_ua.field_104903_c
		// @7D: aconst_null
		// @7E: areturn
		// @7F: astore #4
		// @81: aload #4
		// @83: new java.lang.StringBuilder
		// @86: dup
		// @87: invokespecial java.lang.StringBuilder.<init>()void
		// @8A: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @8D: iconst_0
		// @8E: aaload
		// @8F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @92: lload_1
		// @93: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @96: bipush 44 (0x2C)
		// @98: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9B: iload_3
		// @9C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9F: bipush 41 (0x29)
		// @A1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A7: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AA: athrow
	}
	
	C_100119_ua(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: aload_0
		// @06: invokespecial java.lang.Object.<init>()void
		// @09: aload_0
		// @0A: iconst_0
		// @0B: putfield int game.C_100119_ua.field_104908_h
		// @0E: aload_0
		// @0F: iload_1
		// @10: anewarray game.C_100158_da
		// @13: putfield game.C_100158_da[] game.C_100119_ua.field_104899_g
		// @16: aload_0
		// @17: iload_1
		// @18: putfield int game.C_100119_ua.field_104900_d
		// @1B: iconst_0
		// @1C: istore_2
		// @1D: iload_2
		// @1E: iload_1
		// @1F: if_icmpge @4C
		// @22: aload_0
		// @23: getfield game.C_100158_da[] game.C_100119_ua.field_104899_g
		// @26: iload_2
		// @27: new game.C_100158_da
		// @2A: dup
		// @2B: invokespecial game.C_100158_da.<init>()void
		// @2E: dup_x2
		// @2F: aastore
		// @30: astore_3
		// @31: aload_3
		// @32: aload_3
		// @33: putfield game.C_100158_da game.C_100158_da.field_100599_i
		// @36: aload_3
		// @37: aload_3
		// @38: putfield game.C_100158_da game.C_100158_da.field_100590_f
		// @3B: iinc #2 +1
		// @3E: iload #4
		// @40: ifne @71
		// @43: iload #4
		// @45: ifeq @1D
		// @48: goto @4C
		// @4B: athrow
		// @4C: goto @71
		// @4F: astore_2
		// @50: aload_2
		// @51: new java.lang.StringBuilder
		// @54: dup
		// @55: invokespecial java.lang.StringBuilder.<init>()void
		// @58: getstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @5B: bipush 6 (0x06)
		// @5D: aaload
		// @5E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @61: iload_1
		// @62: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @65: bipush 41 (0x29)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @70: athrow
		// @71: return
	}
	
	static
	{
		// @00: bipush 14 (0x0E)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\t&`{q"
		// @09: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u0007i`\u0011$"
		// @14: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @17: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\t&`zq"
		// @1F: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @22: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\u00122\"S"
		// @2A: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\t&`uq"
		// @35: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @38: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\t&`yq"
		// @40: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @43: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "\t&`\u00030\u0012.:\u0001q"
		// @4C: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "\t&`}q"
		// @58: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "\t&`~q"
		// @64: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @67: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "\t&`|q"
		// @70: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @73: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "\t&`vq"
		// @7C: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "\t&`xq"
		// @88: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @8E: aastore
		// @8F: dup
		// @90: bipush 12 (0x0C)
		// @92: ldc "\t&`wq"
		// @94: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @97: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @9A: aastore
		// @9B: dup
		// @9C: bipush 13 (0x0D)
		// @9E: ldc "\t&`tq"
		// @A0: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @A3: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @A6: aastore
		// @A7: putstatic java.lang.String[] game.C_100119_ua.field_104906_z
		// @AA: ldc "2(nP)\u0008.!Q*\\&8^0\u0010&,S<"
		// @AC: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @AF: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @B2: putstatic java.lang.String game.C_100119_ua.field_104904_a
		// @B5: iconst_m1
		// @B6: putstatic int game.C_100119_ua.field_104907_k
		// @B9: ldc "9*/V5\\&*[+\u00194=\u001f0\u000fg;Q8\n&'S8\u001e++"
		// @BB: invokestatic game.C_100119_ua.func_104888_z(java.lang.String)char[]
		// @BE: invokestatic game.C_100119_ua.func_104886_z(char[])java.lang.String
		// @C1: putstatic java.lang.String game.C_100119_ua.field_104898_f
		// @C4: iconst_1
		// @C5: putstatic int game.C_100119_ua.field_104905_j
		// @C8: return
	}
	
	private static char[] func_104888_z(String arg0)
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
		// @0E: bipush 89 (0x59)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104886_z(char[] arg0)
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
		// @30: bipush 124 (0x7C)
		// @32: goto @46
		// @35: bipush 71 (0x47)
		// @37: goto @46
		// @3A: bipush 78 (0x4E)
		// @3C: goto @46
		// @3F: bipush 63 (0x3F)
		// @41: goto @46
		// @44: bipush 89 (0x59)
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
