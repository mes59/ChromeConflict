package game;

final class C_100342_jg extends C_100282_nh implements C_100334_ik
{
	static String field_102721_Rb;
	private boolean field_102730_Sb;
	static String field_102720_Wb;
	private C_100053_vn field_102728_Xb;
	static C_100317_lb field_102724_Vb;
	static String[] field_102723_Tb;
	static int field_102722_Ub;
	static int field_102725_Qb;
	private boolean field_102727_Zb;
	static int field_102729_Yb;
	private static final String[] field_102726_ac;
	
	private final void func_102715_a(C_100096_un arg0, int arg1, boolean arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: aload_0
		// @006: iconst_1
		// @007: putfield boolean game.C_100342_jg.field_102727_Zb
		// @00A: iload_2
		// @00B: bipush 70 (0x46)
		// @00D: if_icmpgt @024
		// @010: aload_0
		// @011: bipush 13 (0x0D)
		// @013: bipush 90 (0x5A)
		// @015: bipush 125 (0x7D)
		// @017: aconst_null
		// @018: checkcast game.C_100218_am
		// @01B: bipush -40 (0xD8)
		// @01D: invokevirtual game.C_100342_jg.func_102581_a(int, int, byte, game.C_100218_am, int)void
		// @020: goto @024
		// @023: athrow
		// @024: aload_1
		// @025: getfield boolean game.C_100096_un.field_104565_b
		// @028: ifeq @035
		// @02B: getstatic java.lang.String game.C_100079_e.field_102669_Cb
		// @02E: astore #4
		// @030: iload #6
		// @032: ifeq @089
		// @035: aload_1
		// @036: getfield java.lang.String[] game.C_100096_un.field_104571_i
		// @039: ifnonnull @070
		// @03C: goto @040
		// @03F: athrow
		// @040: aload_1
		// @041: getfield java.lang.String game.C_100096_un.field_104567_a
		// @044: astore #4
		// @046: sipush 248 (0x00F8)
		// @049: aload_1
		// @04A: getfield int game.C_100096_un.field_104564_e
		// @04D: if_icmpeq @054
		// @050: goto @089
		// @053: athrow
		// @054: iload_3
		// @055: ifne @061
		// @058: bipush -100 (0x9C)
		// @05A: invokestatic game.C_100017_wj.func_103811_a(byte)void
		// @05D: goto @061
		// @060: athrow
		// @061: aload_0
		// @062: iconst_1
		// @063: putfield boolean game.C_100342_jg.field_102730_Sb
		// @066: getstatic java.lang.String game.C_100179_ch.field_100810_p
		// @069: astore #4
		// @06B: iload #6
		// @06D: ifeq @089
		// @070: getstatic java.lang.String game.C_100100_i.field_102023_bc
		// @073: astore #4
		// @075: aload_0
		// @076: getfield game.C_100053_vn game.C_100342_jg.field_102728_Xb
		// @079: ifnull @089
		// @07C: aload_0
		// @07D: getfield game.C_100053_vn game.C_100342_jg.field_102728_Xb
		// @080: bipush 80 (0x50)
		// @082: invokevirtual game.C_100053_vn.func_102790_a(byte)void
		// @085: goto @089
		// @088: athrow
		// @089: new game.C_100027_hc
		// @08C: dup
		// @08D: aload_0
		// @08E: getstatic game.C_100112_r game.C_100185_rm.field_105484_d
		// @091: aload #4
		// @093: invokespecial game.C_100027_hc.<init>(game.C_100282_nh, game.C_100112_r, java.lang.String)void
		// @096: astore #5
		// @098: aload_1
		// @099: getfield boolean game.C_100096_un.field_104565_b
		// @09C: ifeq @0CE
		// @09F: aload_1
		// @0A0: getfield boolean game.C_100096_un.field_104568_j
		// @0A3: ifne @0AE
		// @0A6: goto @0AA
		// @0A9: athrow
		// @0AA: goto @0BD
		// @0AD: athrow
		// @0AE: aload_0
		// @0AF: new game.C_100093_fd
		// @0B2: dup
		// @0B3: aload_0
		// @0B4: invokespecial game.C_100093_fd.<init>(game.C_100342_jg)void
		// @0B7: bipush 75 (0x4B)
		// @0B9: invokevirtual game.C_100342_jg.func_102660_a(game.C_100336_im, byte)void
		// @0BC: return
		// @0BD: aload #5
		// @0BF: aload_0
		// @0C0: bipush 94 (0x5E)
		// @0C2: getstatic java.lang.String game.C_100272_mn.field_102429_M
		// @0C5: invokevirtual game.C_100027_hc.func_102588_a(game.C_100337_in, int, java.lang.String)game.C_100218_am
		// @0C8: pop
		// @0C9: iload #6
		// @0CB: ifeq @165
		// @0CE: aload_0
		// @0CF: getfield boolean game.C_100342_jg.field_102730_Sb
		// @0D2: ifeq @0EE
		// @0D5: goto @0D9
		// @0D8: athrow
		// @0D9: aload #5
		// @0DB: aload_0
		// @0DC: bipush 117 (0x75)
		// @0DE: getstatic java.lang.String game.C_100272_mn.field_102429_M
		// @0E1: invokevirtual game.C_100027_hc.func_102588_a(game.C_100337_in, int, java.lang.String)game.C_100218_am
		// @0E4: pop
		// @0E5: iload #6
		// @0E7: ifeq @12A
		// @0EA: goto @0EE
		// @0ED: athrow
		// @0EE: aload_1
		// @0EF: getfield int game.C_100096_un.field_104564_e
		// @0F2: iconst_m1
		// @0F3: ixor
		// @0F4: bipush -6 (0xFA)
		// @0F6: if_icmpne @11C
		// @0F9: goto @0FD
		// @0FC: athrow
		// @0FD: aload #5
		// @0FF: iconst_0
		// @100: getstatic java.lang.String game.C_100189_ri.field_105756_a
		// @103: bipush 11 (0x0B)
		// @105: invokevirtual game.C_100027_hc.func_102586_a(int, java.lang.String, int)void
		// @108: aload #5
		// @10A: iconst_0
		// @10B: getstatic java.lang.String game.C_100239_oi.field_102298_C
		// @10E: bipush 17 (0x11)
		// @110: invokevirtual game.C_100027_hc.func_102586_a(int, java.lang.String, int)void
		// @113: iload #6
		// @115: ifeq @12A
		// @118: goto @11C
		// @11B: athrow
		// @11C: aload #5
		// @11E: iconst_0
		// @11F: getstatic java.lang.String game.C_100245_pf.field_106390_a
		// @122: iconst_m1
		// @123: invokevirtual game.C_100027_hc.func_102586_a(int, java.lang.String, int)void
		// @126: goto @12A
		// @129: athrow
		// @12A: bipush -4 (0xFC)
		// @12C: aload_1
		// @12D: getfield int game.C_100096_un.field_104564_e
		// @130: iconst_m1
		// @131: ixor
		// @132: if_icmpne @149
		// @135: aload #5
		// @137: iconst_0
		// @138: getstatic java.lang.String game.C_100152_bd.field_105205_o
		// @13B: bipush 7 (0x07)
		// @13D: invokevirtual game.C_100027_hc.func_102586_a(int, java.lang.String, int)void
		// @140: iload #6
		// @142: ifeq @165
		// @145: goto @149
		// @148: athrow
		// @149: aload_1
		// @14A: getfield int game.C_100096_un.field_104564_e
		// @14D: bipush 6 (0x06)
		// @14F: if_icmpne @165
		// @152: goto @156
		// @155: athrow
		// @156: aload #5
		// @158: iconst_0
		// @159: getstatic java.lang.String game.C_100036_gg.field_103153_P
		// @15C: bipush 9 (0x09)
		// @15E: invokevirtual game.C_100027_hc.func_102586_a(int, java.lang.String, int)void
		// @161: goto @165
		// @164: athrow
		// @165: aload_0
		// @166: aload #5
		// @168: bipush 75 (0x4B)
		// @16A: invokevirtual game.C_100342_jg.func_102660_a(game.C_100336_im, byte)void
		// @16D: goto @1B7
		// @170: astore #4
		// @172: aload #4
		// @174: new java.lang.StringBuilder
		// @177: dup
		// @178: invokespecial java.lang.StringBuilder.<init>()void
		// @17B: getstatic java.lang.String[] game.C_100342_jg.field_102726_ac
		// @17E: bipush 6 (0x06)
		// @180: aaload
		// @181: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @184: aload_1
		// @185: ifnull @191
		// @188: getstatic java.lang.String[] game.C_100342_jg.field_102726_ac
		// @18B: iconst_3
		// @18C: aaload
		// @18D: goto @196
		// @190: athrow
		// @191: getstatic java.lang.String[] game.C_100342_jg.field_102726_ac
		// @194: iconst_2
		// @195: aaload
		// @196: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @199: bipush 44 (0x2C)
		// @19B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @19E: iload_2
		// @19F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1A2: bipush 44 (0x2C)
		// @1A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1A7: iload_3
		// @1A8: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @1AB: bipush 41 (0x29)
		// @1AD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1B0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1B3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1B6: athrow
		// @1B7: return
	}
	
	public static void func_102719_s(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String[] game.C_100342_jg.field_102723_Tb
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100342_jg.field_102720_Wb
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100342_jg.field_102721_Rb
		// @0C: iload_0
		// @0D: bipush 31 (0x1F)
		// @0F: if_icmpge @1D
		// @12: aconst_null
		// @13: checkcast java.lang.String[]
		// @16: putstatic java.lang.String[] game.C_100342_jg.field_102723_Tb
		// @19: goto @1D
		// @1C: athrow
		// @1D: aconst_null
		// @1E: putstatic game.C_100317_lb game.C_100342_jg.field_102724_Vb
		// @21: goto @45
		// @24: astore_1
		// @25: aload_1
		// @26: new java.lang.StringBuilder
		// @29: dup
		// @2A: invokespecial java.lang.StringBuilder.<init>()void
		// @2D: getstatic java.lang.String[] game.C_100342_jg.field_102726_ac
		// @30: iconst_5
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
	
	final boolean func_102613_k(int arg0)
	{
		// @00: aload_0
		// @01: getfield boolean game.C_100342_jg.field_102619_V
		// @04: ifeq @2C
		// @07: aload_0
		// @08: getfield boolean game.C_100342_jg.field_102727_Zb
		// @0B: ifeq @16
		// @0E: goto @12
		// @11: athrow
		// @12: goto @2C
		// @15: athrow
		// @16: bipush 126 (0x7E)
		// @18: invokestatic game.C_100038_wa.func_104065_b(byte)game.C_100096_un
		// @1B: astore_2
		// @1C: aload_2
		// @1D: ifnonnull @24
		// @20: goto @2C
		// @23: athrow
		// @24: aload_0
		// @25: aload_2
		// @26: bipush 85 (0x55)
		// @28: iconst_0
		// @29: invokespecial game.C_100342_jg.func_102715_a(game.C_100096_un, int, boolean)void
		// @2C: iload_1
		// @2D: sipush 248 (0x00F8)
		// @30: if_icmpeq @3C
		// @33: bipush -126 (0x82)
		// @35: invokestatic game.C_100342_jg.func_102719_s(int)void
		// @38: goto @3C
		// @3B: athrow
		// @3C: aload_0
		// @3D: sipush 248 (0x00F8)
		// @40: invokespecial game.C_100282_nh.func_102613_k(int)boolean
		// @43: ireturn
		// @44: astore_2
		// @45: aload_2
		// @46: new java.lang.StringBuilder
		// @49: dup
		// @4A: invokespecial java.lang.StringBuilder.<init>()void
		// @4D: getstatic java.lang.String[] game.C_100342_jg.field_102726_ac
		// @50: iconst_4
		// @51: aaload
		// @52: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @55: iload_1
		// @56: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @59: bipush 41 (0x29)
		// @5B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @61: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @64: athrow
	}
	
	public final void func_102581_a(int arg0, int arg1, byte arg2, C_100218_am arg3, int arg4)
	{
		// @00: aload_0
		// @01: getfield boolean game.C_100342_jg.field_102730_Sb
		// @04: ifne @0B
		// @07: goto @13
		// @0A: athrow
		// @0B: iconst_1
		// @0C: iconst_0
		// @0D: bipush -120 (0x88)
		// @0F: invokestatic game.C_100236_on.func_100894_a(boolean, boolean, byte)void
		// @12: return
		// @13: bipush -67 (0xBD)
		// @15: iload_3
		// @16: bipush -2 (0xFE)
		// @18: isub
		// @19: bipush 52 (0x34)
		// @1B: idiv
		// @1C: irem
		// @1D: istore #6
		// @1F: bipush -36 (0xDC)
		// @21: invokestatic game.C_100119_ua.func_104890_c(byte)void
		// @24: aload_0
		// @25: bipush 92 (0x5C)
		// @27: invokevirtual game.C_100342_jg.func_102701_r(int)void
		// @2A: goto @87
		// @2D: astore #6
		// @2F: aload #6
		// @31: new java.lang.StringBuilder
		// @34: dup
		// @35: invokespecial java.lang.StringBuilder.<init>()void
		// @38: getstatic java.lang.String[] game.C_100342_jg.field_102726_ac
		// @3B: iconst_1
		// @3C: aaload
		// @3D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @40: iload_1
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 44 (0x2C)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: iload_2
		// @4A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4D: bipush 44 (0x2C)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: iload_3
		// @53: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @56: bipush 44 (0x2C)
		// @58: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B: aload #4
		// @5D: ifnull @69
		// @60: getstatic java.lang.String[] game.C_100342_jg.field_102726_ac
		// @63: iconst_3
		// @64: aaload
		// @65: goto @6E
		// @68: athrow
		// @69: getstatic java.lang.String[] game.C_100342_jg.field_102726_ac
		// @6C: iconst_2
		// @6D: aaload
		// @6E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @71: bipush 44 (0x2C)
		// @73: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @76: iload #5
		// @78: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7B: bipush 41 (0x29)
		// @7D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @80: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @83: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @86: athrow
		// @87: return
	}
	
	C_100342_jg(C_100029_gn arg0, C_100053_vn arg1)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: getstatic game.C_100112_r game.C_100185_rm.field_105484_d
		// @05: getstatic java.lang.String game.C_100335_il.field_107370_c
		// @08: iconst_0
		// @09: iconst_0
		// @0A: invokespecial game.C_100282_nh.<init>(game.C_100029_gn, game.C_100112_r, java.lang.String, boolean, boolean)void
		// @0D: aload_0
		// @0E: aload_2
		// @0F: putfield game.C_100053_vn game.C_100342_jg.field_102728_Xb
		// @12: goto @62
		// @15: astore_3
		// @16: aload_3
		// @17: new java.lang.StringBuilder
		// @1A: dup
		// @1B: invokespecial java.lang.StringBuilder.<init>()void
		// @1E: getstatic java.lang.String[] game.C_100342_jg.field_102726_ac
		// @21: bipush 7 (0x07)
		// @23: aaload
		// @24: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27: aload_1
		// @28: ifnull @34
		// @2B: getstatic java.lang.String[] game.C_100342_jg.field_102726_ac
		// @2E: iconst_3
		// @2F: aaload
		// @30: goto @39
		// @33: athrow
		// @34: getstatic java.lang.String[] game.C_100342_jg.field_102726_ac
		// @37: iconst_2
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: bipush 44 (0x2C)
		// @3E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @41: aload_2
		// @42: ifnull @4E
		// @45: getstatic java.lang.String[] game.C_100342_jg.field_102726_ac
		// @48: iconst_3
		// @49: aaload
		// @4A: goto @53
		// @4D: athrow
		// @4E: getstatic java.lang.String[] game.C_100342_jg.field_102726_ac
		// @51: iconst_2
		// @52: aaload
		// @53: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @56: bipush 41 (0x29)
		// @58: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @61: athrow
		// @62: return
	}
	
	final void func_102718_i(byte arg0)
	{
		// @00: iload_1
		// @01: bipush 45 (0x2D)
		// @03: if_icmpeq @07
		// @06: return
		// @07: aload_0
		// @08: getstatic java.lang.String game.C_100179_ch.field_100810_p
		// @0B: iconst_0
		// @0C: sipush 248 (0x00F8)
		// @0F: invokestatic game.C_100111_el.func_104855_a(java.lang.String, boolean, int)game.C_100096_un
		// @12: bipush 106 (0x6A)
		// @14: iconst_1
		// @15: invokespecial game.C_100342_jg.func_102715_a(game.C_100096_un, int, boolean)void
		// @18: goto @3C
		// @1B: astore_2
		// @1C: aload_2
		// @1D: new java.lang.StringBuilder
		// @20: dup
		// @21: invokespecial java.lang.StringBuilder.<init>()void
		// @24: getstatic java.lang.String[] game.C_100342_jg.field_102726_ac
		// @27: iconst_0
		// @28: aaload
		// @29: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C: iload_1
		// @2D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @30: bipush 41 (0x29)
		// @32: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @35: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @38: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3B: athrow
		// @3C: return
	}
	
	static
	{
		// @00: bipush 8 (0x08)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\u001c%h07^"
		// @09: invokestatic game.C_100342_jg.func_102717_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100342_jg.func_102716_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u001c%h27^"
		// @14: invokestatic game.C_100342_jg.func_102717_z(java.lang.String)char[]
		// @17: invokestatic game.C_100342_jg.func_102716_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u00187*\u0014"
		// @1F: invokestatic game.C_100342_jg.func_102717_z(java.lang.String)char[]
		// @22: invokestatic game.C_100342_jg.func_102716_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\rlhV\u000b"
		// @2A: invokestatic game.C_100342_jg.func_102717_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100342_jg.func_102716_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\u001c%h,7^"
		// @35: invokestatic game.C_100342_jg.func_102717_z(java.lang.String)char[]
		// @38: invokestatic game.C_100342_jg.func_102716_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\u001c%h17^"
		// @40: invokestatic game.C_100342_jg.func_102717_z(java.lang.String)char[]
		// @43: invokestatic game.C_100342_jg.func_102716_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "\u001c%h?7^"
		// @4C: invokestatic game.C_100342_jg.func_102717_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100342_jg.func_102716_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "\u001c%hD\u001f\u0018+2F^"
		// @58: invokestatic game.C_100342_jg.func_102717_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100342_jg.func_102716_z(char[])java.lang.String
		// @5E: aastore
		// @5F: putstatic java.lang.String[] game.C_100342_jg.field_102726_ac
		// @62: ldc "7\u0006\u0010985\u0007\u0002"
		// @64: invokestatic game.C_100342_jg.func_102717_z(java.lang.String)char[]
		// @67: invokestatic game.C_100342_jg.func_102716_z(char[])java.lang.String
		// @6A: putstatic java.lang.String game.C_100342_jg.field_102720_Wb
		// @6D: sipush 200 (0x00C8)
		// @70: putstatic int game.C_100342_jg.field_102725_Qb
		// @73: iconst_0
		// @74: putstatic int game.C_100342_jg.field_102729_Yb
		// @77: getstatic int game.C_100342_jg.field_102729_Yb
		// @7A: putstatic int game.C_100342_jg.field_102722_Ub
		// @7D: return
	}
	
	private static char[] func_102717_z(String arg0)
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
		// @0E: bipush 118 (0x76)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_102716_z(char[] arg0)
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
		// @30: bipush 118 (0x76)
		// @32: goto @46
		// @35: bipush 66 (0x42)
		// @37: goto @46
		// @3A: bipush 70 (0x46)
		// @3C: goto @46
		// @3F: bipush 120 (0x78)
		// @41: goto @46
		// @44: bipush 118 (0x76)
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
