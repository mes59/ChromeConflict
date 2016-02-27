package game;

final class C_100294_ki
{
	C_100202_qi field_106977_f;
	static String field_106973_R;
	static String[] field_106983_a;
	private int[] field_106945_cb;
	private int field_106998_r;
	private int field_107003_y;
	C_100314_lf field_106958_M;
	int field_106990_h;
	private C_100222_aa field_106946_gb;
	int field_106955_B;
	C_100202_qi field_106979_d;
	int field_106954_A;
	C_100171_cn field_106995_u;
	static int field_106971_P;
	int field_106966_U;
	C_100202_qi field_106997_s;
	private int field_106948_db;
	int field_106964_J;
	int field_106975_X;
	int field_106968_ib;
	int field_106972_S;
	C_100202_qi field_106978_g;
	private int[] field_106962_I;
	int field_106993_w;
	boolean field_106953_G;
	private int field_106956_C;
	String[] field_106974_Y;
	int field_106996_t;
	int field_106985_o;
	C_100300_kc field_106950_D;
	C_100038_wa field_106988_j;
	int field_106984_n;
	int field_106957_L;
	int field_107004_x;
	boolean field_106963_eb;
	int field_106961_H;
	boolean field_106969_V;
	boolean field_106947_bb;
	C_100202_qi field_106986_l;
	boolean field_107001_ab;
	int field_106960_O;
	C_100202_qi field_106991_fb;
	int field_107000_p;
	C_100202_qi field_106949_hb;
	int field_106987_m;
	int field_107002_z;
	int field_106965_K;
	int field_106994_v;
	int field_106980_e;
	C_100202_qi field_106981_b;
	private int field_106952_F;
	int field_106999_q;
	int field_106959_N;
	int field_106982_c;
	int field_106951_E;
	int field_106989_k;
	private int field_106967_W;
	int field_106992_i;
	boolean field_106976_Z;
	private static final String[] field_106970_Q;
	
	final String func_106904_a(int arg0, byte arg1)
	{
		// @00: iload_1
		// @01: iconst_m1
		// @02: ixor
		// @03: iconst_m1
		// @04: if_icmpgt @0B
		// @07: goto @0D
		// @0A: athrow
		// @0B: aconst_null
		// @0C: areturn
		// @0D: iload_2
		// @0E: bipush -27 (0xE5)
		// @10: if_icmpeq @1F
		// @13: aload_0
		// @14: aconst_null
		// @15: checkcast game.C_100202_qi
		// @18: putfield game.C_100202_qi game.C_100294_ki.field_106978_g
		// @1B: goto @1F
		// @1E: athrow
		// @1F: aload_0
		// @20: getfield int game.C_100294_ki.field_106999_q
		// @23: iload_1
		// @24: if_icmple @2E
		// @27: aload_0
		// @28: getfield java.lang.String[] game.C_100294_ki.field_106974_Y
		// @2B: iload_1
		// @2C: aaload
		// @2D: areturn
		// @2E: iload_1
		// @2F: aload_0
		// @30: getfield int game.C_100294_ki.field_106999_q
		// @33: ineg
		// @34: iadd
		// @35: iconst_m1
		// @36: ixor
		// @37: aload_0
		// @38: getfield int game.C_100294_ki.field_106990_h
		// @3B: iconst_m1
		// @3C: ixor
		// @3D: if_icmple @5D
		// @40: new java.lang.StringBuilder
		// @43: dup
		// @44: invokespecial java.lang.StringBuilder.<init>()void
		// @47: getstatic java.lang.String game.C_100257_ln.field_106479_f
		// @4A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4D: iload_1
		// @4E: aload_0
		// @4F: getfield int game.C_100294_ki.field_106999_q
		// @52: ineg
		// @53: iadd
		// @54: iconst_m1
		// @55: isub
		// @56: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @59: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5C: areturn
		// @5D: getstatic java.lang.String game.C_100320_hh.field_102918_M
		// @60: areturn
		// @61: astore_3
		// @62: aload_3
		// @63: new java.lang.StringBuilder
		// @66: dup
		// @67: invokespecial java.lang.StringBuilder.<init>()void
		// @6A: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @6D: bipush 7 (0x07)
		// @6F: aaload
		// @70: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @73: iload_1
		// @74: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @77: bipush 44 (0x2C)
		// @79: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7C: iload_2
		// @7D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @80: bipush 41 (0x29)
		// @82: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @85: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @88: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8B: athrow
	}
	
	private final int[] func_106940_a(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #20
		// @005: iload_2
		// @006: iconst_m1
		// @007: ixor
		// @008: iconst_m1
		// @009: if_icmpne @066
		// @00C: iload_3
		// @00D: i2d
		// @00E: iload #5
		// @010: ineg
		// @011: i2d
		// @012: invokestatic java.lang.Math.atan2(double, double)double
		// @015: dstore #7
		// @017: ldc2_w 65536.0
		// @01A: dload #7
		// @01C: dmul
		// @01D: ldc2_w 6.283185307179586
		// @020: ddiv
		// @021: d2i
		// @022: istore #9
		// @024: iconst_0
		// @025: iload_1
		// @026: if_icmple @041
		// @029: iload #9
		// @02B: sipush 16384 (0x4000)
		// @02E: if_icmple @058
		// @031: goto @035
		// @034: athrow
		// @035: iload #9
		// @037: ldc 65536 (0x10000)
		// @039: isub
		// @03A: istore #9
		// @03C: iload #20
		// @03E: ifeq @058
		// @041: sipush -16384 (0xC000)
		// @044: iload #9
		// @046: if_icmpgt @051
		// @049: goto @04D
		// @04C: athrow
		// @04D: goto @058
		// @050: athrow
		// @051: iload #9
		// @053: ldc 65536 (0x10000)
		// @055: iadd
		// @056: istore #9
		// @058: iconst_2
		// @059: newarray int[]
		// @05B: dup
		// @05C: iconst_0
		// @05D: iload #9
		// @05F: iastore
		// @060: dup
		// @061: iconst_1
		// @062: iload #9
		// @064: iastore
		// @065: areturn
		// @066: iload #4
		// @068: bipush 60 (0x3C)
		// @06A: if_icmpeq @077
		// @06D: aload_0
		// @06E: bipush 118 (0x76)
		// @070: putfield int game.C_100294_ki.field_106965_K
		// @073: goto @077
		// @076: athrow
		// @077: dconst_0
		// @078: dstore #7
		// @07A: dconst_0
		// @07B: dstore #9
		// @07D: iload #5
		// @07F: ineg
		// @080: i2d
		// @081: iload_3
		// @082: i2d
		// @083: ldc2_w 0.5
		// @086: iload_2
		// @087: ldc -969294109 (0xc639bee3)
		// @089: ishl
		// @08A: i2d
		// @08B: dmul
		// @08C: dmul
		// @08D: iload_3
		// @08E: i2d
		// @08F: dmul
		// @090: iload #6
		// @092: iload #6
		// @094: imul
		// @095: i2d
		// @096: ddiv
		// @097: dadd
		// @098: dstore #11
		// @09A: iload_3
		// @09B: i2d
		// @09C: dstore #13
		// @09E: iload_3
		// @09F: i2d
		// @0A0: ldc2_w 0.5
		// @0A3: iload_2
		// @0A4: ldc -901705885 (0xca410f63)
		// @0A6: ishl
		// @0A7: i2d
		// @0A8: dmul
		// @0A9: dmul
		// @0AA: iload_3
		// @0AB: i2d
		// @0AC: dmul
		// @0AD: iload #6
		// @0AF: iload #6
		// @0B1: imul
		// @0B2: i2d
		// @0B3: ddiv
		// @0B4: dstore #15
		// @0B6: dload #13
		// @0B8: dload #13
		// @0BA: dmul
		// @0BB: dload #15
		// @0BD: dload #11
		// @0BF: ldc2_w 4.0
		// @0C2: dmul
		// @0C3: dmul
		// @0C4: dsub
		// @0C5: dconst_0
		// @0C6: dcmpl
		// @0C7: ifle @124
		// @0CA: dload #11
		// @0CC: dconst_0
		// @0CD: dcmpl
		// @0CE: ifne @0E1
		// @0D1: goto @0D5
		// @0D4: athrow
		// @0D5: iconst_m1
		// @0D6: iload #6
		// @0D8: iconst_m1
		// @0D9: ixor
		// @0DA: if_icmpeq @124
		// @0DD: goto @0E1
		// @0E0: athrow
		// @0E1: dload #13
		// @0E3: dload #13
		// @0E5: dmul
		// @0E6: dload #11
		// @0E8: ldc2_w 4.0
		// @0EB: dmul
		// @0EC: dload #15
		// @0EE: dmul
		// @0EF: dsub
		// @0F0: invokestatic java.lang.Math.sqrt(double)double
		// @0F3: dload #13
		// @0F5: dneg
		// @0F6: dadd
		// @0F7: ldc2_w 2.0
		// @0FA: dload #11
		// @0FC: dmul
		// @0FD: invokestatic java.lang.Math.atan2(double, double)double
		// @100: dstore #7
		// @102: dload #13
		// @104: dload #13
		// @106: dmul
		// @107: dload #15
		// @109: ldc2_w 4.0
		// @10C: dload #11
		// @10E: dmul
		// @10F: dmul
		// @110: dsub
		// @111: invokestatic java.lang.Math.sqrt(double)double
		// @114: dneg
		// @115: dload #13
		// @117: dneg
		// @118: dadd
		// @119: ldc2_w 2.0
		// @11C: dload #11
		// @11E: dmul
		// @11F: invokestatic java.lang.Math.atan2(double, double)double
		// @122: dstore #9
		// @124: iconst_0
		// @125: istore #17
		// @127: ldc2_w 65536.0
		// @12A: dload #7
		// @12C: dmul
		// @12D: ldc2_w 6.283185307179586
		// @130: ddiv
		// @131: d2i
		// @132: istore #17
		// @134: iconst_0
		// @135: istore #18
		// @137: dload #9
		// @139: ldc2_w 65536.0
		// @13C: dmul
		// @13D: ldc2_w 6.283185307179586
		// @140: ddiv
		// @141: d2i
		// @142: istore #18
		// @144: iconst_0
		// @145: iload #17
		// @147: if_icmpeq @15D
		// @14A: iload #17
		// @14C: aload_0
		// @14D: getfield int game.C_100294_ki.field_106951_E
		// @150: bipush 31 (0x1F)
		// @152: iand
		// @153: bipush 16 (0x10)
		// @155: imul
		// @156: sipush 256 (0x0100)
		// @159: isub
		// @15A: iadd
		// @15B: istore #17
		// @15D: iload #18
		// @15F: ifeq @175
		// @162: iload #18
		// @164: sipush -256 (0xFF00)
		// @167: bipush 16 (0x10)
		// @169: aload_0
		// @16A: getfield int game.C_100294_ki.field_106951_E
		// @16D: bipush 31 (0x1F)
		// @16F: iand
		// @170: imul
		// @171: iadd
		// @172: iadd
		// @173: istore #18
		// @175: sipush -32768 (0x8000)
		// @178: iload #17
		// @17A: if_icmpgt @181
		// @17D: goto @188
		// @180: athrow
		// @181: iload #17
		// @183: ldc 65536 (0x10000)
		// @185: iadd
		// @186: istore #17
		// @188: sipush 32767 (0x7FFF)
		// @18B: iload #18
		// @18D: iconst_m1
		// @18E: ixor
		// @18F: if_icmplt @196
		// @192: goto @19D
		// @195: athrow
		// @196: iload #18
		// @198: ldc 65536 (0x10000)
		// @19A: iadd
		// @19B: istore #18
		// @19D: ldc -32769 (0xffff7fff)
		// @19F: iload #17
		// @1A1: iconst_m1
		// @1A2: ixor
		// @1A3: if_icmple @1AD
		// @1A6: iload #17
		// @1A8: ldc 65536 (0x10000)
		// @1AA: isub
		// @1AB: istore #17
		// @1AD: ldc -32769 (0xffff7fff)
		// @1AF: iload #18
		// @1B1: iconst_m1
		// @1B2: ixor
		// @1B3: if_icmple @1BD
		// @1B6: iload #18
		// @1B8: ldc 65536 (0x10000)
		// @1BA: isub
		// @1BB: istore #18
		// @1BD: iconst_m1
		// @1BE: iload_1
		// @1BF: iconst_m1
		// @1C0: ixor
		// @1C1: if_icmplt @1E8
		// @1C4: iload #17
		// @1C6: ifge @1D2
		// @1C9: goto @1CD
		// @1CC: athrow
		// @1CD: iload #17
		// @1CF: ineg
		// @1D0: istore #17
		// @1D2: iconst_m1
		// @1D3: iload #18
		// @1D5: iconst_m1
		// @1D6: ixor
		// @1D7: if_icmplt @1DE
		// @1DA: goto @201
		// @1DD: athrow
		// @1DE: iload #18
		// @1E0: ineg
		// @1E1: istore #18
		// @1E3: iload #20
		// @1E5: ifeq @201
		// @1E8: iconst_0
		// @1E9: iload #18
		// @1EB: if_icmpge @1F7
		// @1EE: goto @1F2
		// @1F1: athrow
		// @1F2: iload #18
		// @1F4: ineg
		// @1F5: istore #18
		// @1F7: iload #17
		// @1F9: ifle @201
		// @1FC: iload #17
		// @1FE: ineg
		// @1FF: istore #17
		// @201: iload_1
		// @202: iload #18
		// @204: imul
		// @205: iconst_m1
		// @206: ixor
		// @207: iload_1
		// @208: iload #17
		// @20A: imul
		// @20B: iconst_m1
		// @20C: ixor
		// @20D: if_icmpgt @214
		// @210: goto @220
		// @213: athrow
		// @214: iload #18
		// @216: istore #19
		// @218: iload #17
		// @21A: istore #18
		// @21C: iload #19
		// @21E: istore #17
		// @220: iconst_2
		// @221: newarray int[]
		// @223: dup
		// @224: iconst_0
		// @225: iload #17
		// @227: iastore
		// @228: dup
		// @229: iconst_1
		// @22A: iload #18
		// @22C: iastore
		// @22D: areturn
		// @22E: astore #7
		// @230: aload #7
		// @232: new java.lang.StringBuilder
		// @235: dup
		// @236: invokespecial java.lang.StringBuilder.<init>()void
		// @239: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @23C: bipush 21 (0x15)
		// @23E: aaload
		// @23F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @242: iload_1
		// @243: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @246: bipush 44 (0x2C)
		// @248: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @24B: iload_2
		// @24C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @24F: bipush 44 (0x2C)
		// @251: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @254: iload_3
		// @255: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @258: bipush 44 (0x2C)
		// @25A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @25D: iload #4
		// @25F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @262: bipush 44 (0x2C)
		// @264: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @267: iload #5
		// @269: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @26C: bipush 44 (0x2C)
		// @26E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @271: iload #6
		// @273: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @276: bipush 41 (0x29)
		// @278: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @27B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @27E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @281: athrow
	}
	
	final boolean func_106929_c(int arg0, byte arg1)
	{
		// @00: bipush -5 (0xFB)
		// @02: aload_0
		// @03: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @06: sipush 26294 (0x66B6)
		// @09: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @0C: iconst_m1
		// @0D: ixor
		// @0E: if_icmpeq @13
		// @11: iconst_1
		// @12: ireturn
		// @13: iload_2
		// @14: bipush -94 (0xA2)
		// @16: if_icmpeq @23
		// @19: aload_0
		// @1A: bipush 98 (0x62)
		// @1C: putfield int game.C_100294_ki.field_106998_r
		// @1F: goto @23
		// @22: athrow
		// @23: aload_0
		// @24: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @27: getfield int[] game.C_100171_cn.field_105580_p
		// @2A: iconst_0
		// @2B: iaload
		// @2C: sipush 5000 (0x1388)
		// @2F: isub
		// @30: iconst_m1
		// @31: ixor
		// @32: iload_1
		// @33: ldc -1414309564 (0xabb35944)
		// @35: ishr
		// @36: iconst_m1
		// @37: ixor
		// @38: if_icmpgt @57
		// @3B: iload_1
		// @3C: ldc -1183409724 (0xb97699c4)
		// @3E: ishr
		// @3F: iconst_m1
		// @40: ixor
		// @41: aload_0
		// @42: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @45: getfield int[] game.C_100171_cn.field_105580_p
		// @48: iconst_1
		// @49: iaload
		// @4A: sipush -5000 (0xEC78)
		// @4D: isub
		// @4E: iconst_m1
		// @4F: ixor
		// @50: if_icmple @59
		// @53: goto @57
		// @56: athrow
		// @57: iconst_0
		// @58: ireturn
		// @59: iconst_1
		// @5A: ireturn
		// @5B: astore_3
		// @5C: aload_3
		// @5D: new java.lang.StringBuilder
		// @60: dup
		// @61: invokespecial java.lang.StringBuilder.<init>()void
		// @64: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @67: bipush 42 (0x2A)
		// @69: aaload
		// @6A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6D: iload_1
		// @6E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @71: bipush 44 (0x2C)
		// @73: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @76: iload_2
		// @77: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7A: bipush 41 (0x29)
		// @7C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @82: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @85: athrow
	}
	
	private final void func_106906_a(int arg0, C_100314_lf arg1, byte arg2, C_100314_lf arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #14
		// @005: iconst_0
		// @006: istore #7
		// @008: bipush -106 (0x96)
		// @00A: iload_3
		// @00B: bipush -61 (0xC3)
		// @00D: isub
		// @00E: bipush 63 (0x3F)
		// @010: idiv
		// @011: irem
		// @012: istore #9
		// @014: iconst_m1
		// @015: iload_1
		// @016: iconst_m1
		// @017: ixor
		// @018: if_icmpge @037
		// @01B: aload_0
		// @01C: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @01F: sipush 23156 (0x5A74)
		// @022: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @025: ldc 464786628 (0x1bb414c4)
		// @027: ishl
		// @028: bipush -128 (0x80)
		// @02A: iadd
		// @02B: aload_2
		// @02C: getfield int game.C_100314_lf.field_101377_tc
		// @02F: isub
		// @030: istore #7
		// @032: iload #14
		// @034: ifeq @040
		// @037: bipush -128 (0x80)
		// @039: aload_2
		// @03A: getfield int game.C_100314_lf.field_101377_tc
		// @03D: iadd
		// @03E: istore #7
		// @040: aconst_null
		// @041: astore #8
		// @043: aload #4
		// @045: getfield int game.C_100314_lf.field_101362_nc
		// @048: iconst_m1
		// @049: ixor
		// @04A: iconst_m1
		// @04B: if_icmple @052
		// @04E: goto @07A
		// @051: athrow
		// @052: aload_0
		// @053: aload #4
		// @055: getfield int game.C_100314_lf.field_101362_nc
		// @058: bipush -105 (0x97)
		// @05A: invokevirtual game.C_100294_ki.func_106913_c(int, int)game.C_100314_lf
		// @05D: astore #8
		// @05F: aconst_null
		// @060: aload #8
		// @062: if_acmpeq @071
		// @065: aload #8
		// @067: getfield boolean game.C_100314_lf.field_101326_I
		// @06A: ifeq @07A
		// @06D: goto @071
		// @070: athrow
		// @071: aload #4
		// @073: iconst_m1
		// @074: putfield int game.C_100314_lf.field_101362_nc
		// @077: aconst_null
		// @078: astore #8
		// @07A: aconst_null
		// @07B: aload #8
		// @07D: if_acmpne @43D
		// @080: aload #4
		// @082: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @085: ifnull @09A
		// @088: goto @08C
		// @08B: athrow
		// @08C: ldc 90000 (0x15f90)
		// @08E: iload #6
		// @090: invokestatic java.lang.Math.abs(int)int
		// @093: if_icmple @36D
		// @096: goto @09A
		// @099: athrow
		// @09A: aconst_null
		// @09B: aload #4
		// @09D: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @0A0: if_acmpne @256
		// @0A3: goto @0A7
		// @0A6: athrow
		// @0A7: iconst_m1
		// @0A8: aload #4
		// @0AA: getfield int game.C_100314_lf.field_101369_z
		// @0AD: iconst_m1
		// @0AE: ixor
		// @0AF: if_icmple @0FD
		// @0B2: goto @0B6
		// @0B5: athrow
		// @0B6: new game.C_100087_n
		// @0B9: dup
		// @0BA: bipush 6 (0x06)
		// @0BC: aload #4
		// @0BE: getfield int game.C_100314_lf.field_101377_tc
		// @0C1: ldc 1728034180 (0x66ffb584)
		// @0C3: ishr
		// @0C4: iconst_m1
		// @0C5: ixor
		// @0C6: aload #4
		// @0C8: getfield int game.C_100314_lf.field_101369_z
		// @0CB: iconst_m1
		// @0CC: ixor
		// @0CD: if_icmpgt @0D9
		// @0D0: goto @0D4
		// @0D3: athrow
		// @0D4: iconst_m1
		// @0D5: goto @0DA
		// @0D8: athrow
		// @0D9: iconst_1
		// @0DA: aload_0
		// @0DB: getfield int game.C_100294_ki.field_106951_E
		// @0DE: bipush -2 (0xFE)
		// @0E0: isub
		// @0E1: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @0E4: astore #10
		// @0E6: aload #10
		// @0E8: iconst_1
		// @0E9: putfield boolean game.C_100087_n.field_100703_p
		// @0EC: aload #4
		// @0EE: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0F1: bipush 123 (0x7B)
		// @0F3: aload #10
		// @0F5: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0F8: iload #14
		// @0FA: ifeq @186
		// @0FD: iload #6
		// @0FF: invokestatic java.lang.Math.abs(int)int
		// @102: sipush 30000 (0x7530)
		// @105: if_icmpge @141
		// @108: goto @10C
		// @10B: athrow
		// @10C: iload #7
		// @10E: ldc 50000 (0xc350)
		// @110: if_icmple @141
		// @113: goto @117
		// @116: athrow
		// @117: new game.C_100087_n
		// @11A: dup
		// @11B: bipush 6 (0x06)
		// @11D: iload_1
		// @11E: ineg
		// @11F: iconst_2
		// @120: aload_0
		// @121: getfield int game.C_100294_ki.field_106951_E
		// @124: iadd
		// @125: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @128: astore #10
		// @12A: aload #10
		// @12C: iconst_1
		// @12D: putfield boolean game.C_100087_n.field_100703_p
		// @130: aload #4
		// @132: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @135: bipush 127 (0x7F)
		// @137: aload #10
		// @139: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @13C: iload #14
		// @13E: ifeq @186
		// @141: iload #6
		// @143: invokestatic java.lang.Math.abs(int)int
		// @146: iconst_m1
		// @147: ixor
		// @148: ldc -60001 (0xffff159f)
		// @14A: if_icmplt @162
		// @14D: goto @151
		// @150: athrow
		// @151: iconst_0
		// @152: aload #4
		// @154: getfield int game.C_100314_lf.field_101309_wb
		// @157: if_icmpeq @162
		// @15A: goto @15E
		// @15D: athrow
		// @15E: goto @186
		// @161: athrow
		// @162: new game.C_100087_n
		// @165: dup
		// @166: bipush 6 (0x06)
		// @168: iload_1
		// @169: iconst_2
		// @16A: aload_0
		// @16B: getfield int game.C_100294_ki.field_106951_E
		// @16E: iadd
		// @16F: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @172: astore #10
		// @174: aload #10
		// @176: iconst_1
		// @177: putfield boolean game.C_100087_n.field_100703_p
		// @17A: aload #4
		// @17C: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @17F: bipush 123 (0x7B)
		// @181: aload #10
		// @183: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @186: bipush -2 (0xFE)
		// @188: aload #4
		// @18A: getfield int game.C_100314_lf.field_101310_Mb
		// @18D: iconst_m1
		// @18E: ixor
		// @18F: if_icmpge @215
		// @192: iload #6
		// @194: invokestatic java.lang.Math.abs(int)int
		// @197: iconst_m1
		// @198: ixor
		// @199: ldc -60001 (0xffff159f)
		// @19B: if_icmpgt @1A6
		// @19E: goto @1A2
		// @1A1: athrow
		// @1A2: goto @825
		// @1A5: athrow
		// @1A6: new game.C_100087_n
		// @1A9: dup
		// @1AA: iconst_0
		// @1AB: aload #4
		// @1AD: getfield int[] game.C_100314_lf.field_101416_ab
		// @1B0: iconst_0
		// @1B1: iaload
		// @1B2: aload #4
		// @1B4: getfield int game.C_100314_lf.field_101377_tc
		// @1B7: aload_2
		// @1B8: getfield int game.C_100314_lf.field_101377_tc
		// @1BB: aload_0
		// @1BC: getfield int game.C_100294_ki.field_106951_E
		// @1BF: iadd
		// @1C0: iadd
		// @1C1: bipush 100 (0x64)
		// @1C3: irem
		// @1C4: aload_0
		// @1C5: getfield int game.C_100294_ki.field_106951_E
		// @1C8: iadd
		// @1C9: iconst_4
		// @1CA: iadd
		// @1CB: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @1CE: astore #10
		// @1D0: aload #10
		// @1D2: aload_2
		// @1D3: getfield int game.C_100314_lf.field_101377_tc
		// @1D6: putfield int game.C_100087_n.field_100699_t
		// @1D9: aload #10
		// @1DB: aload_2
		// @1DC: getfield int game.C_100314_lf.field_101395_rc
		// @1DF: putfield int game.C_100087_n.field_100698_u
		// @1E2: iload #6
		// @1E4: i2d
		// @1E5: iload #5
		// @1E7: ineg
		// @1E8: i2d
		// @1E9: invokestatic java.lang.Math.atan2(double, double)double
		// @1EC: dstore #11
		// @1EE: aload #10
		// @1F0: iconst_1
		// @1F1: putfield boolean game.C_100087_n.field_100703_p
		// @1F4: aload #10
		// @1F6: ldc2_w 65536.0
		// @1F9: dload #11
		// @1FB: dmul
		// @1FC: ldc2_w 6.283185307179586
		// @1FF: ddiv
		// @200: d2i
		// @201: putfield int game.C_100087_n.field_100693_m
		// @204: aload #4
		// @206: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @209: bipush 127 (0x7F)
		// @20B: aload #10
		// @20D: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @210: iload #14
		// @212: ifeq @825
		// @215: new game.C_100087_n
		// @218: dup
		// @219: iconst_5
		// @21A: aload_2
		// @21B: getfield int game.C_100314_lf.field_101347_Gb
		// @21E: aload_0
		// @21F: getfield int game.C_100294_ki.field_106951_E
		// @222: iconst_4
		// @223: iadd
		// @224: aload #4
		// @226: getfield int game.C_100314_lf.field_101377_tc
		// @229: aload_0
		// @22A: getfield int game.C_100294_ki.field_106951_E
		// @22D: aload_2
		// @22E: getfield int game.C_100314_lf.field_101377_tc
		// @231: ineg
		// @232: isub
		// @233: iadd
		// @234: sipush 500 (0x01F4)
		// @237: irem
		// @238: ineg
		// @239: isub
		// @23A: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @23D: astore #10
		// @23F: aload #10
		// @241: iconst_1
		// @242: putfield boolean game.C_100087_n.field_100703_p
		// @245: aload #4
		// @247: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @24A: bipush 123 (0x7B)
		// @24C: aload #10
		// @24E: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @251: iload #14
		// @253: ifeq @825
		// @256: iload_1
		// @257: ineg
		// @258: istore #10
		// @25A: ldc 90000 (0x15f90)
		// @25C: iload #7
		// @25E: if_icmpgt @265
		// @261: goto @268
		// @264: athrow
		// @265: iload_1
		// @266: istore #10
		// @268: aload #4
		// @26A: getfield int game.C_100314_lf.field_101369_z
		// @26D: iconst_m1
		// @26E: ixor
		// @26F: iconst_m1
		// @270: if_icmplt @2AB
		// @273: aload #4
		// @275: getfield int game.C_100314_lf.field_101309_wb
		// @278: iload #10
		// @27A: if_icmpeq @2EC
		// @27D: goto @281
		// @280: athrow
		// @281: new game.C_100087_n
		// @284: dup
		// @285: bipush 6 (0x06)
		// @287: iload #10
		// @289: aload_0
		// @28A: getfield int game.C_100294_ki.field_106951_E
		// @28D: iconst_2
		// @28E: iadd
		// @28F: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @292: astore #11
		// @294: aload #11
		// @296: iconst_1
		// @297: putfield boolean game.C_100087_n.field_100703_p
		// @29A: aload #4
		// @29C: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @29F: bipush 127 (0x7F)
		// @2A1: aload #11
		// @2A3: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2A6: iload #14
		// @2A8: ifeq @2EC
		// @2AB: new game.C_100087_n
		// @2AE: dup
		// @2AF: bipush 6 (0x06)
		// @2B1: aload #4
		// @2B3: getfield int game.C_100314_lf.field_101369_z
		// @2B6: iconst_m1
		// @2B7: ixor
		// @2B8: aload #4
		// @2BA: getfield int game.C_100314_lf.field_101377_tc
		// @2BD: ldc 1402792324 (0x539ce984)
		// @2BF: ishr
		// @2C0: iconst_m1
		// @2C1: ixor
		// @2C2: if_icmplt @2CE
		// @2C5: goto @2C9
		// @2C8: athrow
		// @2C9: iconst_m1
		// @2CA: goto @2CF
		// @2CD: athrow
		// @2CE: iconst_1
		// @2CF: aload_0
		// @2D0: getfield int game.C_100294_ki.field_106951_E
		// @2D3: iconst_2
		// @2D4: iadd
		// @2D5: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @2D8: astore #11
		// @2DA: aload #11
		// @2DC: iconst_1
		// @2DD: putfield boolean game.C_100087_n.field_100703_p
		// @2E0: aload #4
		// @2E2: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @2E5: bipush 126 (0x7E)
		// @2E7: aload #11
		// @2E9: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2EC: iload #6
		// @2EE: invokestatic java.lang.Math.abs(int)int
		// @2F1: iconst_m1
		// @2F2: ixor
		// @2F3: sipush -30001 (0x8ACF)
		// @2F6: if_icmpgt @2FD
		// @2F9: goto @368
		// @2FC: athrow
		// @2FD: new game.C_100087_n
		// @300: dup
		// @301: iconst_0
		// @302: aload #4
		// @304: getfield int[] game.C_100314_lf.field_101416_ab
		// @307: iconst_0
		// @308: iaload
		// @309: aload #4
		// @30B: getfield int game.C_100314_lf.field_101377_tc
		// @30E: aload_0
		// @30F: getfield int game.C_100294_ki.field_106951_E
		// @312: iadd
		// @313: aload_2
		// @314: getfield int game.C_100314_lf.field_101377_tc
		// @317: iadd
		// @318: bipush 100 (0x64)
		// @31A: irem
		// @31B: aload_0
		// @31C: getfield int game.C_100294_ki.field_106951_E
		// @31F: bipush -4 (0xFC)
		// @321: isub
		// @322: iadd
		// @323: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @326: astore #11
		// @328: aload #11
		// @32A: aload_2
		// @32B: getfield int game.C_100314_lf.field_101395_rc
		// @32E: putfield int game.C_100087_n.field_100698_u
		// @331: aload #11
		// @333: aload_2
		// @334: getfield int game.C_100314_lf.field_101377_tc
		// @337: putfield int game.C_100087_n.field_100699_t
		// @33A: iload #6
		// @33C: i2d
		// @33D: iload #5
		// @33F: ineg
		// @340: i2d
		// @341: invokestatic java.lang.Math.atan2(double, double)double
		// @344: dstore #12
		// @346: aload #11
		// @348: ldc2_w 65536.0
		// @34B: dload #12
		// @34D: dmul
		// @34E: ldc2_w 6.283185307179586
		// @351: ddiv
		// @352: d2i
		// @353: putfield int game.C_100087_n.field_100693_m
		// @356: aload #11
		// @358: iconst_1
		// @359: putfield boolean game.C_100087_n.field_100703_p
		// @35C: aload #4
		// @35E: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @361: bipush 123 (0x7B)
		// @363: aload #11
		// @365: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @368: iload #14
		// @36A: ifeq @825
		// @36D: aload #4
		// @36F: getfield int game.C_100314_lf.field_101369_z
		// @372: ifgt @391
		// @375: goto @379
		// @378: athrow
		// @379: new game.C_100087_n
		// @37C: dup
		// @37D: bipush 6 (0x06)
		// @37F: iload_1
		// @380: aload_0
		// @381: getfield int game.C_100294_ki.field_106951_E
		// @384: bipush -2 (0xFE)
		// @386: isub
		// @387: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @38A: astore #10
		// @38C: iload #14
		// @38E: ifeq @3C0
		// @391: new game.C_100087_n
		// @394: dup
		// @395: bipush 6 (0x06)
		// @397: aload #4
		// @399: getfield int game.C_100314_lf.field_101377_tc
		// @39C: ldc 1533179332 (0x5b6275c4)
		// @39E: ishr
		// @39F: iconst_m1
		// @3A0: ixor
		// @3A1: aload #4
		// @3A3: getfield int game.C_100314_lf.field_101369_z
		// @3A6: iconst_m1
		// @3A7: ixor
		// @3A8: if_icmple @3B4
		// @3AB: goto @3AF
		// @3AE: athrow
		// @3AF: iconst_1
		// @3B0: goto @3B5
		// @3B3: athrow
		// @3B4: iconst_m1
		// @3B5: aload_0
		// @3B6: getfield int game.C_100294_ki.field_106951_E
		// @3B9: iconst_2
		// @3BA: iadd
		// @3BB: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @3BE: astore #10
		// @3C0: aload #10
		// @3C2: iconst_1
		// @3C3: putfield boolean game.C_100087_n.field_100703_p
		// @3C6: aload #4
		// @3C8: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @3CB: bipush 126 (0x7E)
		// @3CD: aload #10
		// @3CF: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3D2: new game.C_100087_n
		// @3D5: dup
		// @3D6: iconst_0
		// @3D7: aload #4
		// @3D9: getfield int[] game.C_100314_lf.field_101416_ab
		// @3DC: iconst_1
		// @3DD: iaload
		// @3DE: aload_0
		// @3DF: getfield int game.C_100294_ki.field_106951_E
		// @3E2: iconst_4
		// @3E3: iadd
		// @3E4: aload #4
		// @3E6: getfield int game.C_100314_lf.field_101377_tc
		// @3E9: aload_2
		// @3EA: getfield int game.C_100314_lf.field_101377_tc
		// @3ED: aload_0
		// @3EE: getfield int game.C_100294_ki.field_106951_E
		// @3F1: iadd
		// @3F2: iadd
		// @3F3: sipush 500 (0x01F4)
		// @3F6: irem
		// @3F7: ineg
		// @3F8: isub
		// @3F9: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @3FC: astore #10
		// @3FE: aload #10
		// @400: iload_1
		// @401: sipush 4096 (0x1000)
		// @404: imul
		// @405: putfield int game.C_100087_n.field_100693_m
		// @408: aload #10
		// @40A: sipush -25000 (0x9E58)
		// @40D: aload #4
		// @40F: getfield int game.C_100314_lf.field_101395_rc
		// @412: iadd
		// @413: putfield int game.C_100087_n.field_100698_u
		// @416: aload #10
		// @418: iload_1
		// @419: sipush 25000 (0x61A8)
		// @41C: imul
		// @41D: aload #4
		// @41F: getfield int game.C_100314_lf.field_101377_tc
		// @422: iadd
		// @423: putfield int game.C_100087_n.field_100699_t
		// @426: aload #10
		// @428: iconst_1
		// @429: putfield boolean game.C_100087_n.field_100703_p
		// @42C: aload #4
		// @42E: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @431: bipush 124 (0x7C)
		// @433: aload #10
		// @435: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @438: iload #14
		// @43A: ifeq @825
		// @43D: aload #4
		// @43F: aload #8
		// @441: if_acmpne @647
		// @444: goto @448
		// @447: athrow
		// @448: iconst_0
		// @449: aload #4
		// @44B: getfield int game.C_100314_lf.field_101369_z
		// @44E: if_icmpge @496
		// @451: goto @455
		// @454: athrow
		// @455: new game.C_100087_n
		// @458: dup
		// @459: bipush 6 (0x06)
		// @45B: aload #4
		// @45D: getfield int game.C_100314_lf.field_101377_tc
		// @460: ldc 1514628644 (0x5a476624)
		// @462: ishr
		// @463: iconst_m1
		// @464: ixor
		// @465: aload #4
		// @467: getfield int game.C_100314_lf.field_101369_z
		// @46A: iconst_m1
		// @46B: ixor
		// @46C: if_icmple @478
		// @46F: goto @473
		// @472: athrow
		// @473: iconst_1
		// @474: goto @479
		// @477: athrow
		// @478: iconst_m1
		// @479: aload_0
		// @47A: getfield int game.C_100294_ki.field_106951_E
		// @47D: iconst_2
		// @47E: iadd
		// @47F: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @482: astore #10
		// @484: aload #10
		// @486: iconst_1
		// @487: putfield boolean game.C_100087_n.field_100703_p
		// @48A: aload #4
		// @48C: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @48F: bipush 123 (0x7B)
		// @491: aload #10
		// @493: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @496: aload #4
		// @498: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @49B: ifnull @54D
		// @49E: ldc 90000 (0x15f90)
		// @4A0: iload #6
		// @4A2: invokestatic java.lang.Math.abs(int)int
		// @4A5: if_icmpgt @54D
		// @4A8: goto @4AC
		// @4AB: athrow
		// @4AC: iconst_m1
		// @4AD: aload #4
		// @4AF: getfield int game.C_100314_lf.field_101369_z
		// @4B2: iconst_m1
		// @4B3: ixor
		// @4B4: if_icmpne @4DF
		// @4B7: goto @4BB
		// @4BA: athrow
		// @4BB: new game.C_100087_n
		// @4BE: dup
		// @4BF: bipush 6 (0x06)
		// @4C1: iload_1
		// @4C2: iconst_2
		// @4C3: aload_0
		// @4C4: getfield int game.C_100294_ki.field_106951_E
		// @4C7: iadd
		// @4C8: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @4CB: astore #10
		// @4CD: aload #10
		// @4CF: iconst_1
		// @4D0: putfield boolean game.C_100087_n.field_100703_p
		// @4D3: aload #4
		// @4D5: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @4D8: bipush 123 (0x7B)
		// @4DA: aload #10
		// @4DC: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @4DF: new game.C_100087_n
		// @4E2: dup
		// @4E3: iconst_0
		// @4E4: aload #4
		// @4E6: getfield int[] game.C_100314_lf.field_101416_ab
		// @4E9: iconst_1
		// @4EA: iaload
		// @4EB: iconst_4
		// @4EC: aload_0
		// @4ED: getfield int game.C_100294_ki.field_106951_E
		// @4F0: iadd
		// @4F1: aload_0
		// @4F2: getfield int game.C_100294_ki.field_106951_E
		// @4F5: aload_2
		// @4F6: getfield int game.C_100314_lf.field_101377_tc
		// @4F9: ineg
		// @4FA: isub
		// @4FB: aload #4
		// @4FD: getfield int game.C_100314_lf.field_101377_tc
		// @500: ineg
		// @501: isub
		// @502: sipush 500 (0x01F4)
		// @505: irem
		// @506: ineg
		// @507: isub
		// @508: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @50B: astore #10
		// @50D: aload #10
		// @50F: aload #4
		// @511: getfield int game.C_100314_lf.field_101377_tc
		// @514: sipush 25000 (0x61A8)
		// @517: iload_1
		// @518: imul
		// @519: ineg
		// @51A: isub
		// @51B: putfield int game.C_100087_n.field_100699_t
		// @51E: aload #10
		// @520: sipush 4096 (0x1000)
		// @523: iload_1
		// @524: imul
		// @525: putfield int game.C_100087_n.field_100693_m
		// @528: aload #10
		// @52A: aload #4
		// @52C: getfield int game.C_100314_lf.field_101395_rc
		// @52F: sipush -25000 (0x9E58)
		// @532: iadd
		// @533: putfield int game.C_100087_n.field_100698_u
		// @536: aload #10
		// @538: iconst_1
		// @539: putfield boolean game.C_100087_n.field_100703_p
		// @53C: aload #4
		// @53E: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @541: bipush 126 (0x7E)
		// @543: aload #10
		// @545: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @548: iload #14
		// @54A: ifeq @5EA
		// @54D: aload #4
		// @54F: getfield int game.C_100314_lf.field_101369_z
		// @552: iconst_m1
		// @553: ixor
		// @554: iconst_m1
		// @555: if_icmpge @560
		// @558: goto @55C
		// @55B: athrow
		// @55C: goto @5EA
		// @55F: athrow
		// @560: ldc 120000 (0x1d4c0)
		// @562: iload #6
		// @564: invokestatic java.lang.Math.abs(int)int
		// @567: if_icmplt @5C6
		// @56A: ldc -60001 (0xffff159f)
		// @56C: iload #6
		// @56E: invokestatic java.lang.Math.abs(int)int
		// @571: iconst_m1
		// @572: ixor
		// @573: if_icmplt @589
		// @576: goto @57A
		// @579: athrow
		// @57A: aload #4
		// @57C: getfield int game.C_100314_lf.field_101309_wb
		// @57F: iconst_m1
		// @580: ixor
		// @581: iconst_m1
		// @582: if_icmpne @5EA
		// @585: goto @589
		// @588: athrow
		// @589: new game.C_100087_n
		// @58C: dup
		// @58D: bipush 6 (0x06)
		// @58F: iload #7
		// @591: iconst_m1
		// @592: ixor
		// @593: ldc -120001 (0xfffe2b3f)
		// @595: if_icmple @5A1
		// @598: goto @59C
		// @59B: athrow
		// @59C: iload_1
		// @59D: goto @5A3
		// @5A0: athrow
		// @5A1: iload_1
		// @5A2: ineg
		// @5A3: aload_0
		// @5A4: getfield int game.C_100294_ki.field_106951_E
		// @5A7: bipush -2 (0xFE)
		// @5A9: isub
		// @5AA: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @5AD: astore #10
		// @5AF: aload #10
		// @5B1: iconst_1
		// @5B2: putfield boolean game.C_100087_n.field_100703_p
		// @5B5: aload #4
		// @5B7: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @5BA: bipush 125 (0x7D)
		// @5BC: aload #10
		// @5BE: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @5C1: iload #14
		// @5C3: ifeq @5EA
		// @5C6: new game.C_100087_n
		// @5C9: dup
		// @5CA: bipush 6 (0x06)
		// @5CC: iload_1
		// @5CD: iconst_2
		// @5CE: aload_0
		// @5CF: getfield int game.C_100294_ki.field_106951_E
		// @5D2: iadd
		// @5D3: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @5D6: astore #10
		// @5D8: aload #10
		// @5DA: iconst_1
		// @5DB: putfield boolean game.C_100087_n.field_100703_p
		// @5DE: aload #4
		// @5E0: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @5E3: bipush 123 (0x7B)
		// @5E5: aload #10
		// @5E7: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @5EA: bipush -2 (0xFE)
		// @5EC: aload #4
		// @5EE: getfield int game.C_100314_lf.field_101310_Mb
		// @5F1: iconst_m1
		// @5F2: ixor
		// @5F3: if_icmplt @825
		// @5F6: aconst_null
		// @5F7: aload #4
		// @5F9: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @5FC: if_acmpeq @607
		// @5FF: goto @603
		// @602: athrow
		// @603: goto @825
		// @606: athrow
		// @607: new game.C_100087_n
		// @60A: dup
		// @60B: iconst_5
		// @60C: aload_2
		// @60D: getfield int game.C_100314_lf.field_101347_Gb
		// @610: aload_0
		// @611: getfield int game.C_100294_ki.field_106951_E
		// @614: iconst_4
		// @615: iadd
		// @616: aload #4
		// @618: getfield int game.C_100314_lf.field_101377_tc
		// @61B: aload_0
		// @61C: getfield int game.C_100294_ki.field_106951_E
		// @61F: iadd
		// @620: aload_2
		// @621: getfield int game.C_100314_lf.field_101377_tc
		// @624: ineg
		// @625: isub
		// @626: sipush 500 (0x01F4)
		// @629: irem
		// @62A: iadd
		// @62B: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @62E: astore #10
		// @630: aload #10
		// @632: iconst_1
		// @633: putfield boolean game.C_100087_n.field_100703_p
		// @636: aload #4
		// @638: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @63B: bipush 123 (0x7B)
		// @63D: aload #10
		// @63F: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @642: iload #14
		// @644: ifeq @825
		// @647: aload #4
		// @649: getfield int game.C_100314_lf.field_101377_tc
		// @64C: iconst_m1
		// @64D: ixor
		// @64E: sipush -1000 (0xFC18)
		// @651: aload #8
		// @653: getfield int game.C_100314_lf.field_101377_tc
		// @656: aload #4
		// @658: getfield int game.C_100314_lf.field_101304_hb
		// @65B: iadd
		// @65C: iadd
		// @65D: iconst_m1
		// @65E: ixor
		// @65F: if_icmple @68F
		// @662: goto @666
		// @665: athrow
		// @666: new game.C_100087_n
		// @669: dup
		// @66A: bipush 6 (0x06)
		// @66C: iconst_1
		// @66D: iconst_2
		// @66E: aload_0
		// @66F: getfield int game.C_100294_ki.field_106951_E
		// @672: iadd
		// @673: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @676: astore #10
		// @678: aload #10
		// @67A: iconst_1
		// @67B: putfield boolean game.C_100087_n.field_100703_p
		// @67E: aload #4
		// @680: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @683: bipush 124 (0x7C)
		// @685: aload #10
		// @687: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @68A: iload #14
		// @68C: ifeq @719
		// @68F: aload #8
		// @691: getfield int game.C_100314_lf.field_101377_tc
		// @694: aload #4
		// @696: getfield int game.C_100314_lf.field_101304_hb
		// @699: ineg
		// @69A: sipush -1000 (0xFC18)
		// @69D: iadd
		// @69E: isub
		// @69F: iconst_m1
		// @6A0: ixor
		// @6A1: aload #4
		// @6A3: getfield int game.C_100314_lf.field_101377_tc
		// @6A6: iconst_m1
		// @6A7: ixor
		// @6A8: if_icmple @6D8
		// @6AB: goto @6AF
		// @6AE: athrow
		// @6AF: new game.C_100087_n
		// @6B2: dup
		// @6B3: bipush 6 (0x06)
		// @6B5: iconst_m1
		// @6B6: aload_0
		// @6B7: getfield int game.C_100294_ki.field_106951_E
		// @6BA: iconst_2
		// @6BB: iadd
		// @6BC: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @6BF: astore #10
		// @6C1: aload #10
		// @6C3: iconst_1
		// @6C4: putfield boolean game.C_100087_n.field_100703_p
		// @6C7: aload #4
		// @6C9: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @6CC: bipush 125 (0x7D)
		// @6CE: aload #10
		// @6D0: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @6D3: iload #14
		// @6D5: ifeq @719
		// @6D8: aload #4
		// @6DA: getfield int game.C_100314_lf.field_101309_wb
		// @6DD: iconst_m1
		// @6DE: ixor
		// @6DF: aload #8
		// @6E1: getfield int game.C_100314_lf.field_101309_wb
		// @6E4: iconst_m1
		// @6E5: ixor
		// @6E6: if_icmpne @6F1
		// @6E9: goto @6ED
		// @6EC: athrow
		// @6ED: goto @719
		// @6F0: athrow
		// @6F1: new game.C_100087_n
		// @6F4: dup
		// @6F5: bipush 6 (0x06)
		// @6F7: aload #8
		// @6F9: getfield int game.C_100314_lf.field_101309_wb
		// @6FC: iconst_2
		// @6FD: aload_0
		// @6FE: getfield int game.C_100294_ki.field_106951_E
		// @701: iadd
		// @702: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @705: astore #10
		// @707: aload #10
		// @709: iconst_1
		// @70A: putfield boolean game.C_100087_n.field_100703_p
		// @70D: aload #4
		// @70F: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @712: bipush 124 (0x7C)
		// @714: aload #10
		// @716: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @719: aload #4
		// @71B: aload #8
		// @71D: getfield int game.C_100314_lf.field_101364_r
		// @720: putfield int game.C_100314_lf.field_101364_r
		// @723: aload #4
		// @725: aload #8
		// @727: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @72A: putfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @72D: aconst_null
		// @72E: aload #4
		// @730: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @733: if_acmpeq @7A9
		// @736: iload #6
		// @738: invokestatic java.lang.Math.abs(int)int
		// @73B: ldc 90000 (0x15f90)
		// @73D: if_icmplt @7A9
		// @740: goto @744
		// @743: athrow
		// @744: new game.C_100087_n
		// @747: dup
		// @748: iconst_0
		// @749: aload #4
		// @74B: getfield int[] game.C_100314_lf.field_101416_ab
		// @74E: iconst_1
		// @74F: iaload
		// @750: iconst_4
		// @751: aload_0
		// @752: getfield int game.C_100294_ki.field_106951_E
		// @755: aload #4
		// @757: getfield int game.C_100314_lf.field_101377_tc
		// @75A: aload_2
		// @75B: getfield int game.C_100314_lf.field_101377_tc
		// @75E: aload_0
		// @75F: getfield int game.C_100294_ki.field_106951_E
		// @762: iadd
		// @763: iadd
		// @764: sipush 500 (0x01F4)
		// @767: irem
		// @768: iadd
		// @769: iadd
		// @76A: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @76D: astore #10
		// @76F: aload #10
		// @771: aload #4
		// @773: getfield int game.C_100314_lf.field_101395_rc
		// @776: sipush 25000 (0x61A8)
		// @779: isub
		// @77A: putfield int game.C_100087_n.field_100698_u
		// @77D: aload #10
		// @77F: iload_1
		// @780: sipush 4096 (0x1000)
		// @783: imul
		// @784: putfield int game.C_100087_n.field_100693_m
		// @787: aload #10
		// @789: iconst_1
		// @78A: putfield boolean game.C_100087_n.field_100703_p
		// @78D: aload #10
		// @78F: aload #4
		// @791: getfield int game.C_100314_lf.field_101377_tc
		// @794: sipush 25000 (0x61A8)
		// @797: iload_1
		// @798: imul
		// @799: iadd
		// @79A: putfield int game.C_100087_n.field_100699_t
		// @79D: aload #4
		// @79F: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @7A2: bipush 125 (0x7D)
		// @7A4: aload #10
		// @7A6: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @7A9: sipush 10000 (0x2710)
		// @7AC: iload #6
		// @7AE: invokestatic java.lang.Math.abs(int)int
		// @7B1: if_icmpgt @7B8
		// @7B4: goto @825
		// @7B7: athrow
		// @7B8: new game.C_100087_n
		// @7BB: dup
		// @7BC: iconst_0
		// @7BD: aload #4
		// @7BF: getfield int[] game.C_100314_lf.field_101416_ab
		// @7C2: iconst_0
		// @7C3: iaload
		// @7C4: aload_0
		// @7C5: getfield int game.C_100294_ki.field_106951_E
		// @7C8: bipush -4 (0xFC)
		// @7CA: aload #4
		// @7CC: getfield int game.C_100314_lf.field_101377_tc
		// @7CF: aload_0
		// @7D0: getfield int game.C_100294_ki.field_106951_E
		// @7D3: iadd
		// @7D4: aload_2
		// @7D5: getfield int game.C_100314_lf.field_101377_tc
		// @7D8: ineg
		// @7D9: isub
		// @7DA: bipush 100 (0x64)
		// @7DC: irem
		// @7DD: ineg
		// @7DE: iadd
		// @7DF: isub
		// @7E0: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @7E3: astore #10
		// @7E5: aload #10
		// @7E7: aload_2
		// @7E8: getfield int game.C_100314_lf.field_101395_rc
		// @7EB: putfield int game.C_100087_n.field_100698_u
		// @7EE: aload #10
		// @7F0: aload_2
		// @7F1: getfield int game.C_100314_lf.field_101377_tc
		// @7F4: putfield int game.C_100087_n.field_100699_t
		// @7F7: iload #6
		// @7F9: i2d
		// @7FA: iload #5
		// @7FC: ineg
		// @7FD: i2d
		// @7FE: invokestatic java.lang.Math.atan2(double, double)double
		// @801: dstore #11
		// @803: aload #10
		// @805: iconst_1
		// @806: putfield boolean game.C_100087_n.field_100703_p
		// @809: aload #10
		// @80B: dload #11
		// @80D: ldc2_w 65536.0
		// @810: dmul
		// @811: ldc2_w 6.283185307179586
		// @814: ddiv
		// @815: d2i
		// @816: putfield int game.C_100087_n.field_100693_m
		// @819: aload #4
		// @81B: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @81E: bipush 126 (0x7E)
		// @820: aload #10
		// @822: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @825: goto @89E
		// @828: astore #7
		// @82A: aload #7
		// @82C: new java.lang.StringBuilder
		// @82F: dup
		// @830: invokespecial java.lang.StringBuilder.<init>()void
		// @833: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @836: bipush 24 (0x18)
		// @838: aaload
		// @839: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @83C: iload_1
		// @83D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @840: bipush 44 (0x2C)
		// @842: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @845: aload_2
		// @846: ifnull @852
		// @849: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @84C: iconst_1
		// @84D: aaload
		// @84E: goto @857
		// @851: athrow
		// @852: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @855: iconst_4
		// @856: aaload
		// @857: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @85A: bipush 44 (0x2C)
		// @85C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @85F: iload_3
		// @860: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @863: bipush 44 (0x2C)
		// @865: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @868: aload #4
		// @86A: ifnull @876
		// @86D: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @870: iconst_1
		// @871: aaload
		// @872: goto @87B
		// @875: athrow
		// @876: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @879: iconst_4
		// @87A: aaload
		// @87B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @87E: bipush 44 (0x2C)
		// @880: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @883: iload #5
		// @885: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @888: bipush 44 (0x2C)
		// @88A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @88D: iload #6
		// @88F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @892: bipush 41 (0x29)
		// @894: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @897: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @89A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @89D: athrow
		// @89E: return
	}
	
	private final void func_106912_b(byte arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #13
		// @005: aload_0
		// @006: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @009: iload_1
		// @00A: bipush -13 (0xF3)
		// @00C: ixor
		// @00D: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @010: checkcast game.C_100314_lf
		// @013: astore_2
		// @014: aload_2
		// @015: ifnonnull @01D
		// @018: aconst_null
		// @019: goto @026
		// @01C: athrow
		// @01D: aload_0
		// @01E: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @021: bipush 76 (0x4C)
		// @023: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @026: checkcast game.C_100314_lf
		// @029: checkcast game.C_100314_lf
		// @02C: astore_3
		// @02D: aload_3
		// @02E: ifnull @040
		// @031: aload_2
		// @032: getfield int game.C_100314_lf.field_101346_Z
		// @035: aload_3
		// @036: getfield int game.C_100314_lf.field_101346_Z
		// @039: if_icmpeq @047
		// @03C: goto @040
		// @03F: athrow
		// @040: aload_2
		// @041: astore_3
		// @042: iload #13
		// @044: ifeq @073
		// @047: aload_3
		// @048: getfield int game.C_100314_lf.field_101356_w
		// @04B: iconst_m1
		// @04C: ixor
		// @04D: aload_2
		// @04E: getfield int game.C_100314_lf.field_101356_w
		// @051: iconst_m1
		// @052: ixor
		// @053: if_icmplt @05E
		// @056: goto @05A
		// @059: athrow
		// @05A: goto @066
		// @05D: athrow
		// @05E: aload_3
		// @05F: astore #4
		// @061: aload_2
		// @062: astore_3
		// @063: aload #4
		// @065: astore_2
		// @066: aload_3
		// @067: getfield boolean game.C_100314_lf.field_101403_Rb
		// @06A: ifne @071
		// @06D: goto @073
		// @070: athrow
		// @071: aload_2
		// @072: astore_3
		// @073: aconst_null
		// @074: aload_2
		// @075: if_acmpeq @084
		// @078: aload_2
		// @079: iconst_0
		// @07A: invokevirtual game.C_100314_lf.func_101254_a(boolean)boolean
		// @07D: ifeq @0AC
		// @080: goto @084
		// @083: athrow
		// @084: aconst_null
		// @085: aload_3
		// @086: if_acmpeq @099
		// @089: goto @08D
		// @08C: athrow
		// @08D: aload_3
		// @08E: iconst_0
		// @08F: invokevirtual game.C_100314_lf.func_101254_a(boolean)boolean
		// @092: ifeq @0AC
		// @095: goto @099
		// @098: athrow
		// @099: aload_0
		// @09A: dup
		// @09B: getfield int game.C_100294_ki.field_106998_r
		// @09E: iconst_1
		// @09F: iadd
		// @0A0: putfield int game.C_100294_ki.field_106998_r
		// @0A3: iload #13
		// @0A5: ifeq @0B5
		// @0A8: goto @0AC
		// @0AB: athrow
		// @0AC: aload_0
		// @0AD: iconst_0
		// @0AE: putfield int game.C_100294_ki.field_106998_r
		// @0B1: goto @0B5
		// @0B4: athrow
		// @0B5: iconst_0
		// @0B6: istore #4
		// @0B8: iload_1
		// @0B9: bipush -120 (0x88)
		// @0BB: if_icmpeq @0BF
		// @0BE: return
		// @0BF: aload_0
		// @0C0: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @0C3: bipush 13 (0x0D)
		// @0C5: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @0C8: checkcast game.C_100314_lf
		// @0CB: astore #6
		// @0CD: aconst_null
		// @0CE: aload #6
		// @0D0: if_acmpeq @B0A
		// @0D3: aload_2
		// @0D4: astore #7
		// @0D6: iload #13
		// @0D8: ifne @B2F
		// @0DB: aload #6
		// @0DD: getfield int game.C_100314_lf.field_101387_Xb
		// @0E0: iconst_m1
		// @0E1: ixor
		// @0E2: bipush -9 (0xF7)
		// @0E4: if_icmpeq @280
		// @0E7: goto @0EB
		// @0EA: athrow
		// @0EB: aload #6
		// @0ED: getfield int game.C_100314_lf.field_101387_Xb
		// @0F0: bipush 11 (0x0B)
		// @0F2: if_icmpeq @280
		// @0F5: goto @0F9
		// @0F8: athrow
		// @0F9: aload #6
		// @0FB: getfield int game.C_100314_lf.field_101387_Xb
		// @0FE: iconst_m1
		// @0FF: ixor
		// @100: bipush -11 (0xF5)
		// @102: if_icmpne @1BE
		// @105: goto @109
		// @108: athrow
		// @109: aconst_null
		// @10A: astore #7
		// @10C: ldc 2147483647 (0x7fffffff)
		// @10E: istore #8
		// @110: new game.C_100019_wl
		// @113: dup
		// @114: aload_0
		// @115: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @118: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @11B: astore #9
		// @11D: aload #9
		// @11F: bipush -128 (0x80)
		// @121: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @124: checkcast game.C_100314_lf
		// @127: astore #10
		// @129: aconst_null
		// @12A: aload #10
		// @12C: if_acmpeq @1B9
		// @12F: aconst_null
		// @130: aload #10
		// @132: iload #13
		// @134: ifne @0D0
		// @137: if_acmpeq @1A5
		// @13A: aload #10
		// @13C: getfield boolean game.C_100314_lf.field_101326_I
		// @13F: ifne @1A5
		// @142: goto @146
		// @145: athrow
		// @146: iconst_m1
		// @147: aload #10
		// @149: getfield int game.C_100314_lf.field_101387_Xb
		// @14C: iconst_m1
		// @14D: ixor
		// @14E: if_icmpeq @1A5
		// @151: goto @155
		// @154: athrow
		// @155: aload #6
		// @157: getfield int game.C_100314_lf.field_101346_Z
		// @15A: aload #10
		// @15C: getfield int game.C_100314_lf.field_101346_Z
		// @15F: if_icmpeq @1A5
		// @162: goto @166
		// @165: athrow
		// @166: aload #10
		// @168: getfield int game.C_100314_lf.field_101377_tc
		// @16B: aload #6
		// @16D: getfield int game.C_100314_lf.field_101377_tc
		// @170: isub
		// @171: istore #11
		// @173: aload #10
		// @175: getfield int game.C_100314_lf.field_101395_rc
		// @178: aload #6
		// @17A: getfield int game.C_100314_lf.field_101395_rc
		// @17D: ineg
		// @17E: iadd
		// @17F: istore #12
		// @181: iload #12
		// @183: iload #12
		// @185: imul
		// @186: iload #11
		// @188: iload #11
		// @18A: imul
		// @18B: iadd
		// @18C: istore #12
		// @18E: iload #12
		// @190: iconst_m1
		// @191: ixor
		// @192: iload #8
		// @194: iconst_m1
		// @195: ixor
		// @196: if_icmpgt @19D
		// @199: goto @1A5
		// @19C: athrow
		// @19D: aload #10
		// @19F: astore #7
		// @1A1: iload #12
		// @1A3: istore #8
		// @1A5: aload #9
		// @1A7: iload_1
		// @1A8: sipush 30740 (0x7814)
		// @1AB: ixor
		// @1AC: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @1AF: checkcast game.C_100314_lf
		// @1B2: astore #10
		// @1B4: iload #13
		// @1B6: ifeq @129
		// @1B9: iload #13
		// @1BB: ifeq @3F2
		// @1BE: iinc #4 +1
		// @1C1: aload_2
		// @1C2: ifnull @1EE
		// @1C5: goto @1C9
		// @1C8: athrow
		// @1C9: aload_2
		// @1CA: aload #6
		// @1CC: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @1CF: if_acmpeq @1EE
		// @1D2: goto @1D6
		// @1D5: athrow
		// @1D6: aload_2
		// @1D7: iconst_0
		// @1D8: invokevirtual game.C_100314_lf.func_101254_a(boolean)boolean
		// @1DB: ifeq @1EE
		// @1DE: goto @1E2
		// @1E1: athrow
		// @1E2: aload_3
		// @1E3: iconst_0
		// @1E4: invokevirtual game.C_100314_lf.func_101254_a(boolean)boolean
		// @1E7: ifeq @21B
		// @1EA: goto @1EE
		// @1ED: athrow
		// @1EE: aload_3
		// @1EF: ifnull @21E
		// @1F2: goto @1F6
		// @1F5: athrow
		// @1F6: iload #4
		// @1F8: iconst_3
		// @1F9: if_icmplt @21E
		// @1FC: goto @200
		// @1FF: athrow
		// @200: aload_3
		// @201: iconst_0
		// @202: invokevirtual game.C_100314_lf.func_101254_a(boolean)boolean
		// @205: ifeq @210
		// @208: goto @20C
		// @20B: athrow
		// @20C: goto @21E
		// @20F: athrow
		// @210: iconst_0
		// @211: istore #4
		// @213: aload_3
		// @214: astore #7
		// @216: iload #13
		// @218: ifeq @21E
		// @21B: aload_3
		// @21C: astore #7
		// @21E: aload #7
		// @220: ifnull @259
		// @223: aload #6
		// @225: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @228: aload #7
		// @22A: goto @22E
		// @22D: athrow
		// @22E: if_acmpeq @259
		// @231: aload #7
		// @233: iconst_0
		// @234: invokevirtual game.C_100314_lf.func_101254_a(boolean)boolean
		// @237: ifeq @259
		// @23A: goto @23E
		// @23D: athrow
		// @23E: aload #6
		// @240: getfield int game.C_100314_lf.field_101347_Gb
		// @243: sipush 200 (0x00C8)
		// @246: imul
		// @247: iconst_m1
		// @248: ixor
		// @249: aload_0
		// @24A: getfield int game.C_100294_ki.field_106998_r
		// @24D: iconst_m1
		// @24E: ixor
		// @24F: if_icmpge @259
		// @252: goto @256
		// @255: athrow
		// @256: aconst_null
		// @257: astore #7
		// @259: aload #6
		// @25B: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @25E: ifnull @3F2
		// @261: aload #6
		// @263: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @266: getfield boolean game.C_100314_lf.field_101326_I
		// @269: ifeq @274
		// @26C: goto @270
		// @26F: athrow
		// @270: goto @3F2
		// @273: athrow
		// @274: aload #6
		// @276: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @279: astore #7
		// @27B: iload #13
		// @27D: ifeq @3F2
		// @280: ldc 2147483647 (0x7fffffff)
		// @282: istore #8
		// @284: aload #6
		// @286: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @289: astore #7
		// @28B: aconst_null
		// @28C: aload #7
		// @28E: if_acmpeq @2B0
		// @291: aload #7
		// @293: getfield boolean game.C_100314_lf.field_101403_Rb
		// @296: ifne @2AD
		// @299: goto @29D
		// @29C: athrow
		// @29D: aload #7
		// @29F: getfield boolean game.C_100314_lf.field_101326_I
		// @2A2: ifne @2AD
		// @2A5: goto @2A9
		// @2A8: athrow
		// @2A9: goto @2B0
		// @2AC: athrow
		// @2AD: aconst_null
		// @2AE: astore #7
		// @2B0: aconst_null
		// @2B1: aload #7
		// @2B3: if_acmpeq @2BA
		// @2B6: goto @3F2
		// @2B9: athrow
		// @2BA: new game.C_100019_wl
		// @2BD: dup
		// @2BE: aload_0
		// @2BF: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @2C2: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @2C5: astore #9
		// @2C7: aload #9
		// @2C9: bipush -128 (0x80)
		// @2CB: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @2CE: checkcast game.C_100314_lf
		// @2D1: astore #10
		// @2D3: aload #10
		// @2D5: ifnull @3F2
		// @2D8: aload_0
		// @2D9: getfield game.C_100314_lf game.C_100294_ki.field_106958_M
		// @2DC: aload #10
		// @2DE: iload #13
		// @2E0: ifne @22E
		// @2E3: if_acmpne @2EF
		// @2E6: iload #13
		// @2E8: ifeq @3E0
		// @2EB: goto @2EF
		// @2EE: athrow
		// @2EF: aconst_null
		// @2F0: aload #10
		// @2F2: if_acmpeq @3E0
		// @2F5: goto @2F9
		// @2F8: athrow
		// @2F9: aload #10
		// @2FB: getfield boolean game.C_100314_lf.field_101326_I
		// @2FE: ifne @3E0
		// @301: goto @305
		// @304: athrow
		// @305: aload #10
		// @307: getfield boolean game.C_100314_lf.field_101403_Rb
		// @30A: ifne @3E0
		// @30D: goto @311
		// @310: athrow
		// @311: aload #10
		// @313: iconst_0
		// @314: invokevirtual game.C_100314_lf.func_101254_a(boolean)boolean
		// @317: ifne @3E0
		// @31A: goto @31E
		// @31D: athrow
		// @31E: aload #10
		// @320: getfield int game.C_100314_lf.field_101346_Z
		// @323: iconst_m1
		// @324: ixor
		// @325: aload #6
		// @327: getfield int game.C_100314_lf.field_101346_Z
		// @32A: iconst_m1
		// @32B: ixor
		// @32C: if_icmpne @33C
		// @32F: goto @333
		// @332: athrow
		// @333: iload #13
		// @335: ifeq @3E0
		// @338: goto @33C
		// @33B: athrow
		// @33C: aconst_null
		// @33D: aload #7
		// @33F: if_acmpeq @36E
		// @342: goto @346
		// @345: athrow
		// @346: aload #7
		// @348: getfield int game.C_100314_lf.field_101347_Gb
		// @34B: iconst_m1
		// @34C: ixor
		// @34D: aload_0
		// @34E: getfield int game.C_100294_ki.field_106999_q
		// @351: iconst_m1
		// @352: ixor
		// @353: if_icmple @36E
		// @356: goto @35A
		// @359: athrow
		// @35A: aload_0
		// @35B: getfield int game.C_100294_ki.field_106999_q
		// @35E: iconst_m1
		// @35F: ixor
		// @360: aload #10
		// @362: getfield int game.C_100314_lf.field_101347_Gb
		// @365: iconst_m1
		// @366: ixor
		// @367: if_icmpge @3E0
		// @36A: goto @36E
		// @36D: athrow
		// @36E: aload #10
		// @370: getfield int game.C_100314_lf.field_101377_tc
		// @373: aload #6
		// @375: getfield int game.C_100314_lf.field_101377_tc
		// @378: isub
		// @379: ldc 705429892 (0x2a0c0184)
		// @37B: ishr
		// @37C: istore #11
		// @37E: aload #10
		// @380: getfield int game.C_100314_lf.field_101395_rc
		// @383: aload #6
		// @385: getfield int game.C_100314_lf.field_101395_rc
		// @388: ineg
		// @389: iadd
		// @38A: ldc -1456467036 (0xa93013a4)
		// @38C: ishr
		// @38D: istore #12
		// @38F: iload #12
		// @391: iload #12
		// @393: imul
		// @394: iload #11
		// @396: iload #11
		// @398: imul
		// @399: iadd
		// @39A: istore #12
		// @39C: iload #8
		// @39E: iconst_m1
		// @39F: ixor
		// @3A0: iload #12
		// @3A2: iconst_m1
		// @3A3: ixor
		// @3A4: if_icmplt @3D8
		// @3A7: aload #7
		// @3A9: ifnull @3E0
		// @3AC: goto @3B0
		// @3AF: athrow
		// @3B0: aload #7
		// @3B2: getfield int game.C_100314_lf.field_101347_Gb
		// @3B5: aload_0
		// @3B6: getfield int game.C_100294_ki.field_106999_q
		// @3B9: if_icmplt @3E0
		// @3BC: goto @3C0
		// @3BF: athrow
		// @3C0: aload #10
		// @3C2: getfield int game.C_100314_lf.field_101347_Gb
		// @3C5: iconst_m1
		// @3C6: ixor
		// @3C7: aload_0
		// @3C8: getfield int game.C_100294_ki.field_106999_q
		// @3CB: iconst_m1
		// @3CC: ixor
		// @3CD: if_icmpgt @3D8
		// @3D0: goto @3D4
		// @3D3: athrow
		// @3D4: goto @3E0
		// @3D7: athrow
		// @3D8: iload #12
		// @3DA: istore #8
		// @3DC: aload #10
		// @3DE: astore #7
		// @3E0: aload #9
		// @3E2: sipush -30820 (0x879C)
		// @3E5: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @3E8: checkcast game.C_100314_lf
		// @3EB: astore #10
		// @3ED: iload #13
		// @3EF: ifeq @2D3
		// @3F2: aload #6
		// @3F4: getfield int game.C_100314_lf.field_101387_Xb
		// @3F7: iconst_m1
		// @3F8: ixor
		// @3F9: bipush -8 (0xF8)
		// @3FB: if_icmpeq @428
		// @3FE: bipush 8 (0x08)
		// @400: aload #6
		// @402: getfield int game.C_100314_lf.field_101387_Xb
		// @405: if_icmpeq @428
		// @408: goto @40C
		// @40B: athrow
		// @40C: bipush 11 (0x0B)
		// @40E: aload #6
		// @410: getfield int game.C_100314_lf.field_101387_Xb
		// @413: if_icmpeq @428
		// @416: goto @41A
		// @419: athrow
		// @41A: aload #6
		// @41C: getfield int game.C_100314_lf.field_101387_Xb
		// @41F: bipush 10 (0x0A)
		// @421: if_icmpne @AF7
		// @424: goto @428
		// @427: athrow
		// @428: aload #7
		// @42A: ifnull @AF7
		// @42D: goto @431
		// @430: athrow
		// @431: aload #6
		// @433: getfield boolean game.C_100314_lf.field_101403_Rb
		// @436: ifeq @441
		// @439: goto @43D
		// @43C: athrow
		// @43D: goto @AF7
		// @440: athrow
		// @441: sipush 750 (0x02EE)
		// @444: aload #6
		// @446: getfield int game.C_100314_lf.field_101384_db
		// @449: if_icmpgt @811
		// @44C: aload #6
		// @44E: iconst_0
		// @44F: putfield int game.C_100314_lf.field_101369_z
		// @452: aload #6
		// @454: iconst_0
		// @455: putfield int game.C_100314_lf.field_101384_db
		// @458: aload_0
		// @459: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @45C: sipush 26294 (0x66B6)
		// @45F: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @462: istore #8
		// @464: iload #8
		// @466: iconst_m1
		// @467: ixor
		// @468: bipush -4 (0xFC)
		// @46A: if_icmpne @476
		// @46D: iload #13
		// @46F: ifeq @49F
		// @472: goto @476
		// @475: athrow
		// @476: iconst_2
		// @477: iload #8
		// @479: if_icmpeq @63C
		// @47C: goto @480
		// @47F: athrow
		// @480: iconst_m1
		// @481: iload #8
		// @483: iconst_m1
		// @484: ixor
		// @485: if_icmpeq @73C
		// @488: goto @48C
		// @48B: athrow
		// @48C: iload #8
		// @48E: iconst_1
		// @48F: if_icmpne @811
		// @492: goto @496
		// @495: athrow
		// @496: iload #13
		// @498: ifeq @73C
		// @49B: goto @49F
		// @49E: athrow
		// @49F: aload_0
		// @4A0: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @4A3: sipush 23156 (0x5A74)
		// @4A6: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @4A9: iconst_2
		// @4AA: idiv
		// @4AB: istore #8
		// @4AD: aload #6
		// @4AF: getfield boolean game.C_100314_lf.field_101331_Wb
		// @4B2: ifne @5BF
		// @4B5: aload #7
		// @4B7: getfield boolean game.C_100314_lf.field_101331_Wb
		// @4BA: ifne @5BF
		// @4BD: goto @4C1
		// @4C0: athrow
		// @4C1: aload #7
		// @4C3: getfield int game.C_100314_lf.field_101377_tc
		// @4C6: ldc -70730300 (0xfbc8bdc4)
		// @4C8: ishr
		// @4C9: iload #8
		// @4CB: if_icmplt @4D7
		// @4CE: goto @4D2
		// @4D1: athrow
		// @4D2: iconst_1
		// @4D3: goto @4D8
		// @4D6: athrow
		// @4D7: iconst_0
		// @4D8: iload #8
		// @4DA: aload #6
		// @4DC: getfield int game.C_100314_lf.field_101377_tc
		// @4DF: ldc -142114748 (0xf7878044)
		// @4E1: ishr
		// @4E2: if_icmpgt @4EA
		// @4E5: iconst_1
		// @4E6: goto @4EB
		// @4E9: athrow
		// @4EA: iconst_0
		// @4EB: if_icmpne @5BF
		// @4EE: aload #7
		// @4F0: getfield boolean game.C_100314_lf.field_101391_lb
		// @4F3: aload #6
		// @4F5: getfield boolean game.C_100314_lf.field_101391_lb
		// @4F8: if_icmpeq @5A9
		// @4FB: goto @4FF
		// @4FE: athrow
		// @4FF: aload #6
		// @501: getfield boolean game.C_100314_lf.field_101391_lb
		// @504: ifeq @55A
		// @507: goto @50B
		// @50A: athrow
		// @50B: aload_0
		// @50C: aload #6
		// @50E: getfield int game.C_100314_lf.field_101377_tc
		// @511: ldc 1723535108 (0x66bb0f04)
		// @513: ishr
		// @514: aload #7
		// @516: getfield int game.C_100314_lf.field_101377_tc
		// @519: ldc -820375356 (0xcf1a10c4)
		// @51B: ishr
		// @51C: bipush 57 (0x39)
		// @51E: invokespecial game.C_100294_ki.func_106897_a(int, int, byte)boolean
		// @521: ifne @53E
		// @524: goto @528
		// @527: athrow
		// @528: aload #6
		// @52A: aload #7
		// @52C: getfield int game.C_100314_lf.field_101377_tc
		// @52F: ldc -428754332 (0xe671ba64)
		// @531: ishr
		// @532: putfield int game.C_100314_lf.field_101369_z
		// @535: iload #13
		// @537: ifeq @637
		// @53A: goto @53E
		// @53D: athrow
		// @53E: aload #6
		// @540: aload_0
		// @541: bipush -49 (0xCF)
		// @543: aload #6
		// @545: getfield int game.C_100314_lf.field_101377_tc
		// @548: ldc 1913604676 (0x720f4a44)
		// @54A: ishr
		// @54B: invokespecial game.C_100294_ki.func_106932_b(byte, int)int
		// @54E: putfield int game.C_100314_lf.field_101369_z
		// @551: iload #13
		// @553: ifeq @637
		// @556: goto @55A
		// @559: athrow
		// @55A: aload_0
		// @55B: aload #7
		// @55D: getfield int game.C_100314_lf.field_101377_tc
		// @560: ldc -1726943676 (0x9910ee44)
		// @562: ishr
		// @563: aload #6
		// @565: getfield int game.C_100314_lf.field_101377_tc
		// @568: ldc 1614598116 (0x603ccfe4)
		// @56A: ishr
		// @56B: bipush 74 (0x4A)
		// @56D: invokespecial game.C_100294_ki.func_106897_a(int, int, byte)boolean
		// @570: ifne @58D
		// @573: goto @577
		// @576: athrow
		// @577: aload #6
		// @579: aload #7
		// @57B: getfield int game.C_100314_lf.field_101377_tc
		// @57E: ldc -1166324252 (0xba7b4de4)
		// @580: ishr
		// @581: putfield int game.C_100314_lf.field_101369_z
		// @584: iload #13
		// @586: ifeq @637
		// @589: goto @58D
		// @58C: athrow
		// @58D: aload #6
		// @58F: aload_0
		// @590: bipush -11 (0xF5)
		// @592: aload #6
		// @594: getfield int game.C_100314_lf.field_101377_tc
		// @597: ldc -130544220 (0xf8380da4)
		// @599: ishr
		// @59A: invokespecial game.C_100294_ki.func_106932_b(byte, int)int
		// @59D: putfield int game.C_100314_lf.field_101369_z
		// @5A0: iload #13
		// @5A2: ifeq @637
		// @5A5: goto @5A9
		// @5A8: athrow
		// @5A9: aload #6
		// @5AB: aload #7
		// @5AD: getfield int game.C_100314_lf.field_101377_tc
		// @5B0: ldc 817338084 (0x30b796e4)
		// @5B2: ishr
		// @5B3: putfield int game.C_100314_lf.field_101369_z
		// @5B6: iload #13
		// @5B8: ifeq @637
		// @5BB: goto @5BF
		// @5BE: athrow
		// @5BF: aload #6
		// @5C1: getfield boolean game.C_100314_lf.field_101331_Wb
		// @5C4: ifeq @62C
		// @5C7: goto @5CB
		// @5CA: athrow
		// @5CB: aload #7
		// @5CD: getfield boolean game.C_100314_lf.field_101331_Wb
		// @5D0: ifne @616
		// @5D3: goto @5D7
		// @5D6: athrow
		// @5D7: aload #6
		// @5D9: getfield int game.C_100314_lf.field_101377_tc
		// @5DC: aload #7
		// @5DE: getfield int game.C_100314_lf.field_101377_tc
		// @5E1: if_icmpgt @5FF
		// @5E4: goto @5E8
		// @5E7: athrow
		// @5E8: aload #6
		// @5EA: iload #8
		// @5EC: sipush -5120 (0xEC00)
		// @5EF: isub
		// @5F0: bipush -100 (0x9C)
		// @5F2: isub
		// @5F3: putfield int game.C_100314_lf.field_101369_z
		// @5F6: iload #13
		// @5F8: ifeq @637
		// @5FB: goto @5FF
		// @5FE: athrow
		// @5FF: aload #6
		// @601: bipush -100 (0x9C)
		// @603: iload #8
		// @605: sipush 5120 (0x1400)
		// @608: isub
		// @609: iadd
		// @60A: putfield int game.C_100314_lf.field_101369_z
		// @60D: iload #13
		// @60F: ifeq @637
		// @612: goto @616
		// @615: athrow
		// @616: aload #6
		// @618: aload #7
		// @61A: getfield int game.C_100314_lf.field_101377_tc
		// @61D: ldc 798933988 (0x2f9ec3e4)
		// @61F: ishr
		// @620: putfield int game.C_100314_lf.field_101369_z
		// @623: iload #13
		// @625: ifeq @637
		// @628: goto @62C
		// @62B: athrow
		// @62C: aload #6
		// @62E: iload #8
		// @630: putfield int game.C_100314_lf.field_101369_z
		// @633: goto @637
		// @636: athrow
		// @637: iload #13
		// @639: ifeq @811
		// @63C: aload #6
		// @63E: getfield boolean game.C_100314_lf.field_101391_lb
		// @641: ifne @65E
		// @644: goto @648
		// @647: athrow
		// @648: aload_0
		// @649: aload #6
		// @64B: getfield int game.C_100314_lf.field_101377_tc
		// @64E: ldc 1203500868 (0x47bbf744)
		// @650: ishr
		// @651: sipush -9577 (0xDA97)
		// @654: invokespecial game.C_100294_ki.func_106917_b(int, int)boolean
		// @657: ifne @6A3
		// @65A: goto @65E
		// @65D: athrow
		// @65E: aload #6
		// @660: getfield boolean game.C_100314_lf.field_101391_lb
		// @663: ifeq @811
		// @666: goto @66A
		// @669: athrow
		// @66A: aload_0
		// @66B: aload #6
		// @66D: getfield int game.C_100314_lf.field_101377_tc
		// @670: ldc 1274982916 (0x4bfeb204)
		// @672: ishr
		// @673: aload #7
		// @675: getfield int game.C_100314_lf.field_101377_tc
		// @678: ldc 799402148 (0x2fa5e8a4)
		// @67A: ishr
		// @67B: bipush 79 (0x4F)
		// @67D: invokespecial game.C_100294_ki.func_106897_a(int, int, byte)boolean
		// @680: ifeq @811
		// @683: goto @687
		// @686: athrow
		// @687: aload #6
		// @689: aload_0
		// @68A: bipush -29 (0xE3)
		// @68C: aload #6
		// @68E: getfield int game.C_100314_lf.field_101377_tc
		// @691: ldc -733794236 (0xd4433044)
		// @693: ishr
		// @694: invokespecial game.C_100294_ki.func_106932_b(byte, int)int
		// @697: putfield int game.C_100314_lf.field_101369_z
		// @69A: iload #13
		// @69C: ifeq @811
		// @69F: goto @6A3
		// @6A2: athrow
		// @6A3: aload #6
		// @6A5: getfield int game.C_100314_lf.field_101377_tc
		// @6A8: aload #7
		// @6AA: getfield int game.C_100314_lf.field_101377_tc
		// @6AD: if_icmple @6F8
		// @6B0: goto @6B4
		// @6B3: athrow
		// @6B4: aload_0
		// @6B5: iconst_5
		// @6B6: aload #6
		// @6B8: getfield int game.C_100314_lf.field_101377_tc
		// @6BB: ldc 787068644 (0x2ee9b6e4)
		// @6BD: ishr
		// @6BE: invokespecial game.C_100294_ki.func_106937_a(byte, int)boolean
		// @6C1: ifeq @6E2
		// @6C4: goto @6C8
		// @6C7: athrow
		// @6C8: aload #6
		// @6CA: aload #6
		// @6CC: getfield int game.C_100314_lf.field_101377_tc
		// @6CF: ldc -1397936604 (0xacad2e24)
		// @6D1: ishr
		// @6D2: sipush 1500 (0x05DC)
		// @6D5: iadd
		// @6D6: putfield int game.C_100314_lf.field_101369_z
		// @6D9: iload #13
		// @6DB: ifeq @811
		// @6DE: goto @6E2
		// @6E1: athrow
		// @6E2: aload #6
		// @6E4: aload #7
		// @6E6: getfield int game.C_100314_lf.field_101377_tc
		// @6E9: ldc 1543391140 (0x5bfe47a4)
		// @6EB: ishr
		// @6EC: putfield int game.C_100314_lf.field_101369_z
		// @6EF: iload #13
		// @6F1: ifeq @811
		// @6F4: goto @6F8
		// @6F7: athrow
		// @6F8: aload_0
		// @6F9: aload #6
		// @6FB: getfield int game.C_100314_lf.field_101377_tc
		// @6FE: ldc -396590940 (0xe85c80a4)
		// @700: ishr
		// @701: iconst_0
		// @702: invokespecial game.C_100294_ki.func_106933_a(int, boolean)boolean
		// @705: ifne @722
		// @708: goto @70C
		// @70B: athrow
		// @70C: aload #6
		// @70E: aload #7
		// @710: getfield int game.C_100314_lf.field_101377_tc
		// @713: ldc 1372583556 (0x51cff684)
		// @715: ishr
		// @716: putfield int game.C_100314_lf.field_101369_z
		// @719: iload #13
		// @71B: ifeq @811
		// @71E: goto @722
		// @721: athrow
		// @722: aload #6
		// @724: sipush -1500 (0xFA24)
		// @727: aload #6
		// @729: getfield int game.C_100314_lf.field_101377_tc
		// @72C: ldc -1842213468 (0x92320da4)
		// @72E: ishr
		// @72F: iadd
		// @730: putfield int game.C_100314_lf.field_101369_z
		// @733: iload #13
		// @735: ifeq @811
		// @738: goto @73C
		// @73B: athrow
		// @73C: aload #7
		// @73E: getfield boolean game.C_100314_lf.field_101391_lb
		// @741: aload #6
		// @743: getfield boolean game.C_100314_lf.field_101391_lb
		// @746: ifne @752
		// @749: goto @74D
		// @74C: athrow
		// @74D: iconst_1
		// @74E: goto @753
		// @751: athrow
		// @752: iconst_0
		// @753: if_icmpeq @76C
		// @756: aload #6
		// @758: aload #7
		// @75A: getfield int game.C_100314_lf.field_101377_tc
		// @75D: ldc -390170588 (0xe8be7824)
		// @75F: ishr
		// @760: putfield int game.C_100314_lf.field_101369_z
		// @763: iload #13
		// @765: ifeq @811
		// @768: goto @76C
		// @76B: athrow
		// @76C: aload #6
		// @76E: getfield boolean game.C_100314_lf.field_101391_lb
		// @771: ifne @7C7
		// @774: goto @778
		// @777: athrow
		// @778: aload_0
		// @779: aload #7
		// @77B: getfield int game.C_100314_lf.field_101377_tc
		// @77E: ldc -454238556 (0xe4ecdea4)
		// @780: ishr
		// @781: aload #6
		// @783: getfield int game.C_100314_lf.field_101377_tc
		// @786: ldc -1952600188 (0x8b9daf84)
		// @788: ishr
		// @789: bipush -98 (0x9E)
		// @78B: invokespecial game.C_100294_ki.func_106897_a(int, int, byte)boolean
		// @78E: ifeq @7B1
		// @791: goto @795
		// @794: athrow
		// @795: aload #6
		// @797: aload_0
		// @798: bipush -120 (0x88)
		// @79A: aload #6
		// @79C: getfield int game.C_100314_lf.field_101377_tc
		// @79F: ldc 808601508 (0x303247a4)
		// @7A1: ishr
		// @7A2: invokespecial game.C_100294_ki.func_106932_b(byte, int)int
		// @7A5: putfield int game.C_100314_lf.field_101369_z
		// @7A8: iload #13
		// @7AA: ifeq @811
		// @7AD: goto @7B1
		// @7B0: athrow
		// @7B1: aload #6
		// @7B3: aload #7
		// @7B5: getfield int game.C_100314_lf.field_101377_tc
		// @7B8: ldc 2098945860 (0x7d1b5f44)
		// @7BA: ishr
		// @7BB: putfield int game.C_100314_lf.field_101369_z
		// @7BE: iload #13
		// @7C0: ifeq @811
		// @7C3: goto @7C7
		// @7C6: athrow
		// @7C7: aload_0
		// @7C8: aload #6
		// @7CA: getfield int game.C_100314_lf.field_101377_tc
		// @7CD: ldc 185980324 (0xb15d5a4)
		// @7CF: ishr
		// @7D0: aload #7
		// @7D2: getfield int game.C_100314_lf.field_101377_tc
		// @7D5: ldc -290464188 (0xeeafde44)
		// @7D7: ishr
		// @7D8: bipush -71 (0xB9)
		// @7DA: invokespecial game.C_100294_ki.func_106897_a(int, int, byte)boolean
		// @7DD: ifeq @800
		// @7E0: goto @7E4
		// @7E3: athrow
		// @7E4: aload #6
		// @7E6: aload_0
		// @7E7: bipush -84 (0xAC)
		// @7E9: aload #6
		// @7EB: getfield int game.C_100314_lf.field_101377_tc
		// @7EE: ldc -1010614236 (0xc3c34024)
		// @7F0: ishr
		// @7F1: invokespecial game.C_100294_ki.func_106932_b(byte, int)int
		// @7F4: putfield int game.C_100314_lf.field_101369_z
		// @7F7: iload #13
		// @7F9: ifeq @811
		// @7FC: goto @800
		// @7FF: athrow
		// @800: aload #6
		// @802: aload #7
		// @804: getfield int game.C_100314_lf.field_101377_tc
		// @807: ldc -1797914524 (0x94d60064)
		// @809: ishr
		// @80A: putfield int game.C_100314_lf.field_101369_z
		// @80D: goto @811
		// @810: athrow
		// @811: aload #6
		// @813: getfield int game.C_100314_lf.field_101369_z
		// @816: ifle @845
		// @819: aload #6
		// @81B: getfield int game.C_100314_lf.field_101369_z
		// @81E: ineg
		// @81F: aload #6
		// @821: getfield int game.C_100314_lf.field_101377_tc
		// @824: ldc 373218628 (0x163edd44)
		// @826: ishr
		// @827: iadd
		// @828: invokestatic java.lang.Math.abs(int)int
		// @82B: sipush 200 (0x00C8)
		// @82E: if_icmpge @845
		// @831: goto @835
		// @834: athrow
		// @835: aload #6
		// @837: iconst_0
		// @838: putfield int game.C_100314_lf.field_101369_z
		// @83B: aload #6
		// @83D: iconst_0
		// @83E: putfield int game.C_100314_lf.field_101384_db
		// @841: goto @845
		// @844: athrow
		// @845: iconst_0
		// @846: aload #6
		// @848: getfield int game.C_100314_lf.field_101369_z
		// @84B: if_icmpge @86A
		// @84E: aload #7
		// @850: getfield boolean game.C_100314_lf.field_101403_Rb
		// @853: ifeq @86A
		// @856: goto @85A
		// @859: athrow
		// @85A: aload #6
		// @85C: iconst_0
		// @85D: putfield int game.C_100314_lf.field_101369_z
		// @860: aload #6
		// @862: iconst_0
		// @863: putfield int game.C_100314_lf.field_101384_db
		// @866: goto @86A
		// @869: athrow
		// @86A: iconst_0
		// @86B: aload #6
		// @86D: getfield int game.C_100314_lf.field_101369_z
		// @870: if_icmpge @8B1
		// @873: bipush 24 (0x18)
		// @875: aload #6
		// @877: getfield int game.C_100314_lf.field_101343_vb
		// @87A: if_icmpne @8B1
		// @87D: goto @881
		// @880: athrow
		// @881: aload #6
		// @883: iconst_0
		// @884: putfield int game.C_100314_lf.field_101384_db
		// @887: aload #6
		// @889: iconst_0
		// @88A: putfield int game.C_100314_lf.field_101369_z
		// @88D: new game.C_100087_n
		// @890: dup
		// @891: bipush 11 (0x0B)
		// @893: iconst_0
		// @894: iconst_2
		// @895: aload_0
		// @896: getfield int game.C_100294_ki.field_106951_E
		// @899: iadd
		// @89A: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @89D: astore #8
		// @89F: aload #8
		// @8A1: iconst_1
		// @8A2: putfield boolean game.C_100087_n.field_100703_p
		// @8A5: aload #6
		// @8A7: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @8AA: bipush 123 (0x7B)
		// @8AC: aload #8
		// @8AE: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @8B1: aload #6
		// @8B3: getfield int game.C_100314_lf.field_101369_z
		// @8B6: ifle @8F9
		// @8B9: bipush -16 (0xF0)
		// @8BB: aload #6
		// @8BD: getfield int game.C_100314_lf.field_101343_vb
		// @8C0: iconst_m1
		// @8C1: ixor
		// @8C2: if_icmpne @8F9
		// @8C5: goto @8C9
		// @8C8: athrow
		// @8C9: aload #6
		// @8CB: iconst_0
		// @8CC: putfield int game.C_100314_lf.field_101384_db
		// @8CF: aload #6
		// @8D1: iconst_0
		// @8D2: putfield int game.C_100314_lf.field_101369_z
		// @8D5: new game.C_100087_n
		// @8D8: dup
		// @8D9: bipush 8 (0x08)
		// @8DB: iconst_0
		// @8DC: iconst_2
		// @8DD: aload_0
		// @8DE: getfield int game.C_100294_ki.field_106951_E
		// @8E1: iadd
		// @8E2: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @8E5: astore #8
		// @8E7: aload #8
		// @8E9: iconst_1
		// @8EA: putfield boolean game.C_100087_n.field_100703_p
		// @8ED: aload #6
		// @8EF: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @8F2: bipush 125 (0x7D)
		// @8F4: aload #8
		// @8F6: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @8F9: aload #6
		// @8FB: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @8FE: getfield int game.C_100327_ib.field_102494_P
		// @901: istore #8
		// @903: aload #6
		// @905: getfield int game.C_100314_lf.field_101377_tc
		// @908: ineg
		// @909: aload #7
		// @90B: getfield int game.C_100314_lf.field_101377_tc
		// @90E: iadd
		// @90F: istore #9
		// @911: aload #6
		// @913: getfield int game.C_100314_lf.field_101395_rc
		// @916: ineg
		// @917: aload #7
		// @919: getfield int game.C_100314_lf.field_101395_rc
		// @91C: iadd
		// @91D: istore #10
		// @91F: iconst_0
		// @920: iload #9
		// @922: if_icmpgt @92D
		// @925: iconst_1
		// @926: istore #5
		// @928: iload #13
		// @92A: ifeq @930
		// @92D: iconst_m1
		// @92E: istore #5
		// @930: aload #6
		// @932: getfield game.C_100202_qi game.C_100314_lf.field_101324_H
		// @935: bipush 81 (0x51)
		// @937: invokevirtual game.C_100202_qi.func_105895_d(byte)boolean
		// @93A: ifeq @AF7
		// @93D: aload #6
		// @93F: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @942: bipush 57 (0x39)
		// @944: invokevirtual game.C_100202_qi.func_105895_d(byte)boolean
		// @947: ifeq @AF7
		// @94A: goto @94E
		// @94D: athrow
		// @94E: iload #8
		// @950: iconst_m1
		// @951: ixor
		// @952: bipush -110 (0x92)
		// @954: if_icmpne @96F
		// @957: goto @95B
		// @95A: athrow
		// @95B: aload_0
		// @95C: iload #5
		// @95E: aload #7
		// @960: bipush 110 (0x6E)
		// @962: aload #6
		// @964: iload #10
		// @966: iload #9
		// @968: invokespecial game.C_100294_ki.func_106906_a(int, game.C_100314_lf, byte, game.C_100314_lf, int, int)void
		// @96B: goto @96F
		// @96E: athrow
		// @96F: iload #8
		// @971: bipush 107 (0x6B)
		// @973: if_icmpne @98B
		// @976: aload_0
		// @977: aload #7
		// @979: aload #6
		// @97B: iload #5
		// @97D: sipush -27916 (0x92F4)
		// @980: iload #9
		// @982: iload #10
		// @984: invokespecial game.C_100294_ki.func_106943_a(game.C_100314_lf, game.C_100314_lf, int, int, int, int)void
		// @987: goto @98B
		// @98A: athrow
		// @98B: bipush -109 (0x93)
		// @98D: iload #8
		// @98F: iconst_m1
		// @990: ixor
		// @991: if_icmpne @9A7
		// @994: aload_0
		// @995: aload #7
		// @997: iload #9
		// @999: iload #5
		// @99B: aload #6
		// @99D: iload #10
		// @99F: sipush 11460 (0x2CC4)
		// @9A2: invokespecial game.C_100294_ki.func_106896_a(game.C_100314_lf, int, int, game.C_100314_lf, int, int)int
		// @9A5: istore #10
		// @9A7: iload #8
		// @9A9: iconst_m1
		// @9AA: ixor
		// @9AB: iconst_m1
		// @9AC: if_icmpeq @9B3
		// @9AF: goto @9C4
		// @9B2: athrow
		// @9B3: aload_0
		// @9B4: sipush -17900 (0xBA14)
		// @9B7: iload #9
		// @9B9: aload #7
		// @9BB: iload #5
		// @9BD: iload #10
		// @9BF: aload #6
		// @9C1: invokespecial game.C_100294_ki.func_106923_a(int, int, game.C_100314_lf, int, int, game.C_100314_lf)void
		// @9C4: bipush 55 (0x37)
		// @9C6: iload #8
		// @9C8: if_icmpne @9DF
		// @9CB: aload_0
		// @9CC: iload #10
		// @9CE: iload #5
		// @9D0: iload #9
		// @9D2: aload #6
		// @9D4: bipush 109 (0x6D)
		// @9D6: aload #7
		// @9D8: invokespecial game.C_100294_ki.func_106914_a(int, int, int, game.C_100314_lf, int, game.C_100314_lf)void
		// @9DB: goto @9DF
		// @9DE: athrow
		// @9DF: bipush -58 (0xC6)
		// @9E1: iload #8
		// @9E3: iconst_m1
		// @9E4: ixor
		// @9E5: if_icmpne @9FB
		// @9E8: aload_0
		// @9E9: aload #7
		// @9EB: iconst_1
		// @9EC: iload #9
		// @9EE: iload #5
		// @9F0: aload #6
		// @9F2: iload #10
		// @9F4: invokespecial game.C_100294_ki.func_106908_a(game.C_100314_lf, boolean, int, int, game.C_100314_lf, int)void
		// @9F7: goto @9FB
		// @9FA: athrow
		// @9FB: bipush -63 (0xC1)
		// @9FD: iload #8
		// @9FF: iconst_m1
		// @A00: ixor
		// @A01: if_icmpeq @A08
		// @A04: goto @A18
		// @A07: athrow
		// @A08: aload_0
		// @A09: iload #9
		// @A0B: iload #5
		// @A0D: bipush 98 (0x62)
		// @A0F: iload #10
		// @A11: aload #6
		// @A13: aload #7
		// @A15: invokespecial game.C_100294_ki.func_106911_a(int, int, byte, int, game.C_100314_lf, game.C_100314_lf)void
		// @A18: bipush 65 (0x41)
		// @A1A: iload #8
		// @A1C: if_icmpeq @A23
		// @A1F: goto @A35
		// @A22: athrow
		// @A23: aload_0
		// @A24: iload_1
		// @A25: bipush -115 (0x8D)
		// @A27: ixor
		// @A28: iload #10
		// @A2A: aload #7
		// @A2C: iload #5
		// @A2E: aload #6
		// @A30: iload #9
		// @A32: invokespecial game.C_100294_ki.func_106944_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int)void
		// @A35: iload #8
		// @A37: bipush 69 (0x45)
		// @A39: if_icmpne @A4E
		// @A3C: aload_0
		// @A3D: aload #6
		// @A3F: aload #7
		// @A41: bipush -28 (0xE4)
		// @A43: iload #9
		// @A45: iload #5
		// @A47: invokespecial game.C_100294_ki.func_106903_a(game.C_100314_lf, game.C_100314_lf, int, int, int)void
		// @A4A: goto @A4E
		// @A4D: athrow
		// @A4E: bipush -73 (0xB7)
		// @A50: iload #8
		// @A52: iconst_m1
		// @A53: ixor
		// @A54: if_icmpeq @A5B
		// @A57: goto @A69
		// @A5A: athrow
		// @A5B: aload_0
		// @A5C: bipush -5 (0xFB)
		// @A5E: aload #6
		// @A60: iload #5
		// @A62: aload #7
		// @A64: iload #9
		// @A66: invokespecial game.C_100294_ki.func_106916_a(int, game.C_100314_lf, int, game.C_100314_lf, int)void
		// @A69: iload #8
		// @A6B: iconst_m1
		// @A6C: ixor
		// @A6D: bipush -76 (0xB4)
		// @A6F: if_icmpeq @A76
		// @A72: goto @A85
		// @A75: athrow
		// @A76: aload_0
		// @A77: iload #10
		// @A79: iload #5
		// @A7B: aload #7
		// @A7D: iload #9
		// @A7F: iconst_0
		// @A80: aload #6
		// @A82: invokespecial game.C_100294_ki.func_106919_a(int, int, game.C_100314_lf, int, boolean, game.C_100314_lf)void
		// @A85: bipush -80 (0xB0)
		// @A87: iload #8
		// @A89: iconst_m1
		// @A8A: ixor
		// @A8B: if_icmpeq @A92
		// @A8E: goto @AA2
		// @A91: athrow
		// @A92: aload_0
		// @A93: bipush -120 (0x88)
		// @A95: aload #7
		// @A97: iload #10
		// @A99: iload #5
		// @A9B: aload #6
		// @A9D: iload #9
		// @A9F: invokespecial game.C_100294_ki.func_106931_a(byte, game.C_100314_lf, int, int, game.C_100314_lf, int)void
		// @AA2: iload #8
		// @AA4: bipush 84 (0x54)
		// @AA6: if_icmpeq @AAD
		// @AA9: goto @ABD
		// @AAC: athrow
		// @AAD: aload_0
		// @AAE: bipush 115 (0x73)
		// @AB0: aload #6
		// @AB2: iload #9
		// @AB4: aload #7
		// @AB6: iload #5
		// @AB8: iload #10
		// @ABA: invokespecial game.C_100294_ki.func_106895_a(byte, game.C_100314_lf, int, game.C_100314_lf, int, int)void
		// @ABD: bipush 88 (0x58)
		// @ABF: iload #8
		// @AC1: if_icmpne @ADA
		// @AC4: aload_0
		// @AC5: iload #10
		// @AC7: iload #9
		// @AC9: iload #5
		// @ACB: aload #6
		// @ACD: aload #7
		// @ACF: iload_1
		// @AD0: bipush -10 (0xF6)
		// @AD2: ixor
		// @AD3: invokespecial game.C_100294_ki.func_106938_a(int, int, int, game.C_100314_lf, game.C_100314_lf, int)void
		// @AD6: goto @ADA
		// @AD9: athrow
		// @ADA: iload #8
		// @ADC: iconst_m1
		// @ADD: ixor
		// @ADE: bipush -93 (0xA3)
		// @AE0: if_icmpeq @AE7
		// @AE3: goto @AF7
		// @AE6: athrow
		// @AE7: aload_0
		// @AE8: aload #7
		// @AEA: iload #5
		// @AEC: aload #6
		// @AEE: iload_1
		// @AEF: bipush -120 (0x88)
		// @AF1: ixor
		// @AF2: iload #9
		// @AF4: invokespecial game.C_100294_ki.func_106893_a(game.C_100314_lf, int, game.C_100314_lf, int, int)void
		// @AF7: aload_0
		// @AF8: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @AFB: bipush 124 (0x7C)
		// @AFD: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @B00: checkcast game.C_100314_lf
		// @B03: astore #6
		// @B05: iload #13
		// @B07: ifeq @0CD
		// @B0A: goto @B2F
		// @B0D: astore_2
		// @B0E: aload_2
		// @B0F: new java.lang.StringBuilder
		// @B12: dup
		// @B13: invokespecial java.lang.StringBuilder.<init>()void
		// @B16: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @B19: bipush 26 (0x1A)
		// @B1B: aaload
		// @B1C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B1F: iload_1
		// @B20: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B23: bipush 41 (0x29)
		// @B25: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B28: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B2B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @B2E: athrow
		// @B2F: return
	}
	
	private final void func_106931_a(byte arg0, C_100314_lf arg1, int arg2, int arg3, C_100314_lf arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #9
		// @005: aconst_null
		// @006: aload #5
		// @008: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @00B: if_acmpne @053
		// @00E: aload #5
		// @010: getfield int game.C_100314_lf.field_101310_Mb
		// @013: ifle @053
		// @016: goto @01A
		// @019: athrow
		// @01A: aload_2
		// @01B: ldc 312774288 (0x12a48e90)
		// @01D: bipush 18 (0x12)
		// @01F: invokevirtual game.C_100314_lf.func_101268_f(int, int)boolean
		// @022: ifeq @02D
		// @025: goto @029
		// @028: athrow
		// @029: goto @053
		// @02C: athrow
		// @02D: new game.C_100087_n
		// @030: dup
		// @031: iconst_5
		// @032: aload_2
		// @033: getfield int game.C_100314_lf.field_101347_Gb
		// @036: aload_0
		// @037: getfield int game.C_100294_ki.field_106951_E
		// @03A: iconst_m1
		// @03B: isub
		// @03C: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @03F: astore #7
		// @041: aload #7
		// @043: iconst_1
		// @044: putfield boolean game.C_100087_n.field_100703_p
		// @047: aload #5
		// @049: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @04C: bipush 125 (0x7D)
		// @04E: aload #7
		// @050: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @053: bipush 80 (0x50)
		// @055: bipush -35 (0xDD)
		// @057: iload_1
		// @058: isub
		// @059: bipush 56 (0x38)
		// @05B: idiv
		// @05C: irem
		// @05D: istore #7
		// @05F: aload #5
		// @061: getfield int game.C_100314_lf.field_101369_z
		// @064: iconst_m1
		// @065: ixor
		// @066: iconst_m1
		// @067: if_icmpge @0B0
		// @06A: new game.C_100087_n
		// @06D: dup
		// @06E: bipush 6 (0x06)
		// @070: aload #5
		// @072: getfield int game.C_100314_lf.field_101377_tc
		// @075: ldc 1484220932 (0x58776a04)
		// @077: ishr
		// @078: iconst_m1
		// @079: ixor
		// @07A: aload #5
		// @07C: getfield int game.C_100314_lf.field_101369_z
		// @07F: iconst_m1
		// @080: ixor
		// @081: if_icmpgt @08D
		// @084: goto @088
		// @087: athrow
		// @088: iconst_m1
		// @089: goto @08E
		// @08C: athrow
		// @08D: iconst_1
		// @08E: iconst_2
		// @08F: aload_0
		// @090: getfield int game.C_100294_ki.field_106951_E
		// @093: iadd
		// @094: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @097: astore #8
		// @099: aload #8
		// @09B: iconst_1
		// @09C: putfield boolean game.C_100087_n.field_100703_p
		// @09F: aload #5
		// @0A1: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0A4: bipush 125 (0x7D)
		// @0A6: aload #8
		// @0A8: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0AB: iload #9
		// @0AD: ifeq @165
		// @0B0: ldc -70001 (0xfffeee8f)
		// @0B2: iload #6
		// @0B4: invokestatic java.lang.Math.abs(int)int
		// @0B7: iconst_m1
		// @0B8: ixor
		// @0B9: if_icmpge @140
		// @0BC: goto @0C0
		// @0BF: athrow
		// @0C0: aload #5
		// @0C2: getfield int game.C_100314_lf.field_101309_wb
		// @0C5: iconst_m1
		// @0C6: ixor
		// @0C7: iconst_m1
		// @0C8: if_icmpeq @140
		// @0CB: goto @0CF
		// @0CE: athrow
		// @0CF: iload #6
		// @0D1: invokestatic java.lang.Math.abs(int)int
		// @0D4: sipush 20000 (0x4E20)
		// @0D7: if_icmpge @109
		// @0DA: goto @0DE
		// @0DD: athrow
		// @0DE: new game.C_100087_n
		// @0E1: dup
		// @0E2: bipush 6 (0x06)
		// @0E4: iload #4
		// @0E6: ineg
		// @0E7: aload_0
		// @0E8: getfield int game.C_100294_ki.field_106951_E
		// @0EB: iconst_2
		// @0EC: iadd
		// @0ED: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @0F0: astore #8
		// @0F2: aload #8
		// @0F4: iconst_1
		// @0F5: putfield boolean game.C_100087_n.field_100703_p
		// @0F8: aload #5
		// @0FA: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0FD: bipush 124 (0x7C)
		// @0FF: aload #8
		// @101: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @104: iload #9
		// @106: ifeq @165
		// @109: ldc 50000 (0xc350)
		// @10B: iload #6
		// @10D: invokestatic java.lang.Math.abs(int)int
		// @110: if_icmple @165
		// @113: goto @117
		// @116: athrow
		// @117: new game.C_100087_n
		// @11A: dup
		// @11B: bipush 6 (0x06)
		// @11D: iconst_0
		// @11E: aload_0
		// @11F: getfield int game.C_100294_ki.field_106951_E
		// @122: iconst_2
		// @123: iadd
		// @124: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @127: astore #8
		// @129: aload #8
		// @12B: iconst_1
		// @12C: putfield boolean game.C_100087_n.field_100703_p
		// @12F: aload #5
		// @131: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @134: bipush 123 (0x7B)
		// @136: aload #8
		// @138: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @13B: iload #9
		// @13D: ifeq @165
		// @140: new game.C_100087_n
		// @143: dup
		// @144: bipush 6 (0x06)
		// @146: iload #4
		// @148: aload_0
		// @149: getfield int game.C_100294_ki.field_106951_E
		// @14C: iconst_2
		// @14D: iadd
		// @14E: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @151: astore #8
		// @153: aload #8
		// @155: iconst_1
		// @156: putfield boolean game.C_100087_n.field_100703_p
		// @159: aload #5
		// @15B: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @15E: bipush 127 (0x7F)
		// @160: aload #8
		// @162: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @165: aconst_null
		// @166: aload #5
		// @168: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @16B: if_acmpne @172
		// @16E: goto @1B8
		// @171: athrow
		// @172: new game.C_100087_n
		// @175: dup
		// @176: iconst_0
		// @177: aload #5
		// @179: getfield int[] game.C_100314_lf.field_101416_ab
		// @17C: iconst_2
		// @17D: iaload
		// @17E: iconst_5
		// @17F: aload_0
		// @180: getfield int game.C_100294_ki.field_106951_E
		// @183: iadd
		// @184: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @187: astore #8
		// @189: aload #8
		// @18B: iconst_1
		// @18C: putfield boolean game.C_100087_n.field_100703_p
		// @18F: aload #8
		// @191: sipush 7192 (0x1C18)
		// @194: iload #4
		// @196: imul
		// @197: putfield int game.C_100087_n.field_100693_m
		// @19A: aload #8
		// @19C: aload_2
		// @19D: getfield int game.C_100314_lf.field_101377_tc
		// @1A0: putfield int game.C_100087_n.field_100699_t
		// @1A3: aload #8
		// @1A5: aload_2
		// @1A6: getfield int game.C_100314_lf.field_101395_rc
		// @1A9: putfield int game.C_100087_n.field_100698_u
		// @1AC: aload #5
		// @1AE: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @1B1: bipush 127 (0x7F)
		// @1B3: aload #8
		// @1B5: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1B8: aload_0
		// @1B9: iconst_4
		// @1BA: bipush -81 (0xAF)
		// @1BC: aload_2
		// @1BD: aload_0
		// @1BE: getfield int game.C_100294_ki.field_106964_J
		// @1C1: aload #5
		// @1C3: bipush 15 (0x0F)
		// @1C5: aload_0
		// @1C6: getfield int game.C_100294_ki.field_106951_E
		// @1C9: iadd
		// @1CA: sipush 2600 (0x0A28)
		// @1CD: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @1D0: ifeq @1D7
		// @1D3: goto @29B
		// @1D6: athrow
		// @1D7: aload_0
		// @1D8: iconst_3
		// @1D9: bipush -85 (0xAB)
		// @1DB: aload_2
		// @1DC: aload_0
		// @1DD: getfield int game.C_100294_ki.field_106964_J
		// @1E0: aload #5
		// @1E2: aload_0
		// @1E3: getfield int game.C_100294_ki.field_106951_E
		// @1E6: bipush -15 (0xF1)
		// @1E8: isub
		// @1E9: sipush 2600 (0x0A28)
		// @1EC: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @1EF: ifne @29B
		// @1F2: iconst_m1
		// @1F3: aload #5
		// @1F5: getfield int game.C_100314_lf.field_101310_Mb
		// @1F8: iconst_m1
		// @1F9: ixor
		// @1FA: if_icmple @252
		// @1FD: goto @201
		// @200: athrow
		// @201: bipush 50 (0x32)
		// @203: aload_2
		// @204: getfield int game.C_100314_lf.field_101413_Bb
		// @207: if_icmpge @252
		// @20A: goto @20E
		// @20D: athrow
		// @20E: aload_0
		// @20F: iconst_1
		// @210: bipush -69 (0xBB)
		// @212: aload_2
		// @213: iconst_4
		// @214: aload_0
		// @215: getfield int game.C_100294_ki.field_106964_J
		// @218: imul
		// @219: aload #5
		// @21B: aload_0
		// @21C: getfield int game.C_100294_ki.field_106951_E
		// @21F: bipush -15 (0xF1)
		// @221: isub
		// @222: sipush 8448 (0x2100)
		// @225: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @228: ifne @29B
		// @22B: goto @22F
		// @22E: athrow
		// @22F: aload_0
		// @230: iconst_0
		// @231: bipush -108 (0x94)
		// @233: aload_2
		// @234: aload_0
		// @235: getfield int game.C_100294_ki.field_106964_J
		// @238: aload #5
		// @23A: aload_0
		// @23B: getfield int game.C_100294_ki.field_106951_E
		// @23E: bipush -25 (0xE7)
		// @240: isub
		// @241: sipush 2304 (0x0900)
		// @244: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @247: ifeq @29B
		// @24A: goto @24E
		// @24D: athrow
		// @24E: goto @29B
		// @251: athrow
		// @252: aload_0
		// @253: iconst_0
		// @254: bipush -60 (0xC4)
		// @256: aload_2
		// @257: aload_0
		// @258: getfield int game.C_100294_ki.field_106964_J
		// @25B: aload #5
		// @25D: bipush 25 (0x19)
		// @25F: aload_0
		// @260: getfield int game.C_100294_ki.field_106951_E
		// @263: iadd
		// @264: sipush 2304 (0x0900)
		// @267: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @26A: ifeq @271
		// @26D: goto @29B
		// @270: athrow
		// @271: iconst_m1
		// @272: aload #5
		// @274: getfield int game.C_100314_lf.field_101310_Mb
		// @277: iconst_m1
		// @278: ixor
		// @279: if_icmpgt @280
		// @27C: goto @29B
		// @27F: athrow
		// @280: aload_0
		// @281: iconst_1
		// @282: bipush -84 (0xAC)
		// @284: aload_2
		// @285: aload_0
		// @286: getfield int game.C_100294_ki.field_106964_J
		// @289: aload #5
		// @28B: bipush 15 (0x0F)
		// @28D: aload_0
		// @28E: getfield int game.C_100294_ki.field_106951_E
		// @291: iadd
		// @292: sipush 1728 (0x06C0)
		// @295: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @298: ifne @29B
		// @29B: goto @314
		// @29E: astore #7
		// @2A0: aload #7
		// @2A2: new java.lang.StringBuilder
		// @2A5: dup
		// @2A6: invokespecial java.lang.StringBuilder.<init>()void
		// @2A9: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2AC: bipush 10 (0x0A)
		// @2AE: aaload
		// @2AF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B2: iload_1
		// @2B3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2B6: bipush 44 (0x2C)
		// @2B8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2BB: aload_2
		// @2BC: ifnull @2C8
		// @2BF: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2C2: iconst_1
		// @2C3: aaload
		// @2C4: goto @2CD
		// @2C7: athrow
		// @2C8: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2CB: iconst_4
		// @2CC: aaload
		// @2CD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D0: bipush 44 (0x2C)
		// @2D2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2D5: iload_3
		// @2D6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2D9: bipush 44 (0x2C)
		// @2DB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2DE: iload #4
		// @2E0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2E3: bipush 44 (0x2C)
		// @2E5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E8: aload #5
		// @2EA: ifnull @2F6
		// @2ED: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2F0: iconst_1
		// @2F1: aaload
		// @2F2: goto @2FB
		// @2F5: athrow
		// @2F6: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2F9: iconst_4
		// @2FA: aaload
		// @2FB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2FE: bipush 44 (0x2C)
		// @300: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @303: iload #6
		// @305: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @308: bipush 41 (0x29)
		// @30A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @30D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @310: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @313: athrow
		// @314: return
	}
	
	final int func_106920_e(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: sipush 200 (0x00C8)
		// @08: newarray boolean[]
		// @0A: astore_2
		// @0B: aload_0
		// @0C: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @0F: bipush 42 (0x2A)
		// @11: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @14: checkcast game.C_100314_lf
		// @17: astore #4
		// @19: aload #4
		// @1B: ifnull @5F
		// @1E: aload #4
		// @20: getfield int game.C_100314_lf.field_101347_Gb
		// @23: aload_0
		// @24: getfield int game.C_100294_ki.field_106999_q
		// @27: isub
		// @28: istore_3
		// @29: iload_3
		// @2A: iload #5
		// @2C: ifne @60
		// @2F: iflt @4C
		// @32: goto @36
		// @35: athrow
		// @36: aload_2
		// @37: arraylength
		// @38: iconst_m1
		// @39: ixor
		// @3A: iload_3
		// @3B: iconst_m1
		// @3C: ixor
		// @3D: if_icmpge @4C
		// @40: goto @44
		// @43: athrow
		// @44: aload_2
		// @45: iload_3
		// @46: iconst_1
		// @47: bastore
		// @48: goto @4C
		// @4B: athrow
		// @4C: aload_0
		// @4D: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @50: bipush 125 (0x7D)
		// @52: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @55: checkcast game.C_100314_lf
		// @58: astore #4
		// @5A: iload #5
		// @5C: ifeq @19
		// @5F: iload_1
		// @60: istore #4
		// @62: iload #4
		// @64: aload_2
		// @65: arraylength
		// @66: if_icmpge @89
		// @69: aload_2
		// @6A: iload #4
		// @6C: baload
		// @6D: iload #5
		// @6F: ifne @8A
		// @72: ifne @81
		// @75: goto @79
		// @78: athrow
		// @79: iload #4
		// @7B: aload_0
		// @7C: getfield int game.C_100294_ki.field_106999_q
		// @7F: iadd
		// @80: ireturn
		// @81: iinc #4 +1
		// @84: iload #5
		// @86: ifeq @62
		// @89: iconst_m1
		// @8A: ireturn
		// @8B: astore_2
		// @8C: aload_2
		// @8D: new java.lang.StringBuilder
		// @90: dup
		// @91: invokespecial java.lang.StringBuilder.<init>()void
		// @94: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @97: bipush 8 (0x08)
		// @99: aaload
		// @9A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9D: iload_1
		// @9E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A1: bipush 41 (0x29)
		// @A3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A9: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AC: athrow
	}
	
	private final int func_106932_b(byte arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iload_1
		// @06: bipush -10 (0xF6)
		// @08: if_icmplt @21
		// @0B: aload_0
		// @0C: aconst_null
		// @0D: checkcast game.C_100314_lf
		// @10: bipush 8 (0x08)
		// @12: aconst_null
		// @13: checkcast game.C_100314_lf
		// @16: bipush -98 (0x9E)
		// @18: bipush -48 (0xD0)
		// @1A: invokespecial game.C_100294_ki.func_106893_a(game.C_100314_lf, int, game.C_100314_lf, int, int)void
		// @1D: goto @21
		// @20: athrow
		// @21: iconst_0
		// @22: istore_3
		// @23: aload_0
		// @24: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @27: sipush 23156 (0x5A74)
		// @2A: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @2D: iconst_2
		// @2E: idiv
		// @2F: iload_2
		// @30: if_icmple @77
		// @33: aload_0
		// @34: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @37: sipush 23156 (0x5A74)
		// @3A: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @3D: iconst_m1
		// @3E: ixor
		// @3F: iload_2
		// @40: iconst_m1
		// @41: ixor
		// @42: if_icmpge @B4
		// @45: goto @49
		// @48: athrow
		// @49: aload_0
		// @4A: iload_2
		// @4B: sipush -9577 (0xDA97)
		// @4E: invokespecial game.C_100294_ki.func_106917_b(int, int)boolean
		// @51: iload #4
		// @53: ifne @CB
		// @56: ifeq @60
		// @59: goto @5D
		// @5C: athrow
		// @5D: goto @6B
		// @60: sipush 800 (0x0320)
		// @63: iload_2
		// @64: iadd
		// @65: istore_3
		// @66: iload #4
		// @68: ifeq @B4
		// @6B: iinc #2 +1
		// @6E: iload #4
		// @70: ifeq @33
		// @73: goto @77
		// @76: athrow
		// @77: aload_0
		// @78: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @7B: sipush 23156 (0x5A74)
		// @7E: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @81: istore_3
		// @82: iload_2
		// @83: ifle @B4
		// @86: aload_0
		// @87: iload_2
		// @88: sipush -9577 (0xDA97)
		// @8B: invokespecial game.C_100294_ki.func_106917_b(int, int)boolean
		// @8E: iload #4
		// @90: ifne @CB
		// @93: ifeq @9D
		// @96: goto @9A
		// @99: athrow
		// @9A: goto @A8
		// @9D: iload_2
		// @9E: sipush 800 (0x0320)
		// @A1: isub
		// @A2: istore_3
		// @A3: iload #4
		// @A5: ifeq @B4
		// @A8: iinc #2 +255
		// @AB: iload #4
		// @AD: ifeq @82
		// @B0: goto @B4
		// @B3: athrow
		// @B4: sipush 128 (0x0080)
		// @B7: bipush -128 (0x80)
		// @B9: aload_0
		// @BA: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @BD: sipush 23156 (0x5A74)
		// @C0: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @C3: iadd
		// @C4: iload_3
		// @C5: invokestatic java.lang.Math.min(int, int)int
		// @C8: invokestatic java.lang.Math.max(int, int)int
		// @CB: ireturn
		// @CC: astore_3
		// @CD: aload_3
		// @CE: new java.lang.StringBuilder
		// @D1: dup
		// @D2: invokespecial java.lang.StringBuilder.<init>()void
		// @D5: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @D8: bipush 25 (0x19)
		// @DA: aaload
		// @DB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @DE: iload_1
		// @DF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @E2: bipush 44 (0x2C)
		// @E4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E7: iload_2
		// @E8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @EB: bipush 41 (0x29)
		// @ED: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @F0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @F3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @F6: athrow
	}
	
	private final void func_106939_g(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #15
		// @005: iload_1
		// @006: iconst_2
		// @007: if_icmpeq @022
		// @00A: aload_0
		// @00B: aconst_null
		// @00C: checkcast game.C_100314_lf
		// @00F: aconst_null
		// @010: checkcast game.C_100314_lf
		// @013: bipush 123 (0x7B)
		// @015: bipush 58 (0x3A)
		// @017: bipush 84 (0x54)
		// @019: bipush 16 (0x10)
		// @01B: invokespecial game.C_100294_ki.func_106943_a(game.C_100314_lf, game.C_100314_lf, int, int, int, int)void
		// @01E: goto @022
		// @021: athrow
		// @022: aload_0
		// @023: getfield int game.C_100294_ki.field_106972_S
		// @026: iconst_m1
		// @027: ixor
		// @028: iconst_m1
		// @029: if_icmpne @043
		// @02C: aload_0
		// @02D: getfield int game.C_100294_ki.field_106987_m
		// @030: bipush 48 (0x30)
		// @032: iand
		// @033: ifeq @043
		// @036: goto @03A
		// @039: athrow
		// @03A: aload_0
		// @03B: iconst_1
		// @03C: putfield int game.C_100294_ki.field_106972_S
		// @03F: goto @043
		// @042: athrow
		// @043: iconst_0
		// @044: aload_0
		// @045: getfield int game.C_100294_ki.field_106972_S
		// @048: if_icmplt @729
		// @04B: aload_0
		// @04C: getfield int game.C_100294_ki.field_106972_S
		// @04F: ifeq @05A
		// @052: goto @056
		// @055: athrow
		// @056: goto @7DA
		// @059: athrow
		// @05A: aload_0
		// @05B: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @05E: getfield int[] game.C_100171_cn.field_105580_p
		// @061: iconst_0
		// @062: iaload
		// @063: aload_0
		// @064: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @067: getfield int[] game.C_100171_cn.field_105580_p
		// @06A: iconst_1
		// @06B: iaload
		// @06C: isub
		// @06D: istore_2
		// @06E: iload_2
		// @06F: iconst_m1
		// @070: ixor
		// @071: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @074: iconst_4
		// @075: aaload
		// @076: iconst_0
		// @077: aaload
		// @078: getfield int game.C_100037_wb.field_102341_y
		// @07B: ldc -1675372763 (0x9c23d725)
		// @07D: ishl
		// @07E: iconst_m1
		// @07F: ixor
		// @080: if_icmple @159
		// @083: iconst_0
		// @084: istore_3
		// @085: aload_0
		// @086: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @089: iload_1
		// @08A: bipush 66 (0x42)
		// @08C: iadd
		// @08D: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @090: checkcast game.C_100314_lf
		// @093: astore #4
		// @095: aload #4
		// @097: ifnull @0FE
		// @09A: iconst_m1
		// @09B: iload #15
		// @09D: ifne @0FF
		// @0A0: aload #4
		// @0A2: getfield int game.C_100314_lf.field_101346_Z
		// @0A5: iconst_m1
		// @0A6: ixor
		// @0A7: if_icmpne @0C9
		// @0AA: goto @0AE
		// @0AD: athrow
		// @0AE: aload #4
		// @0B0: getfield int game.C_100314_lf.field_101316_G
		// @0B3: iconst_m1
		// @0B4: ixor
		// @0B5: iconst_m1
		// @0B6: if_icmplt @0C1
		// @0B9: goto @0BD
		// @0BC: athrow
		// @0BD: goto @0C9
		// @0C0: athrow
		// @0C1: iload_3
		// @0C2: aload #4
		// @0C4: getfield int game.C_100314_lf.field_101316_G
		// @0C7: iadd
		// @0C8: istore_3
		// @0C9: aload #4
		// @0CB: getfield int game.C_100314_lf.field_101346_Z
		// @0CE: iconst_1
		// @0CF: if_icmpne @0EB
		// @0D2: iconst_0
		// @0D3: aload #4
		// @0D5: getfield int game.C_100314_lf.field_101316_G
		// @0D8: if_icmplt @0E3
		// @0DB: goto @0DF
		// @0DE: athrow
		// @0DF: goto @0EB
		// @0E2: athrow
		// @0E3: iload_3
		// @0E4: aload #4
		// @0E6: getfield int game.C_100314_lf.field_101316_G
		// @0E9: isub
		// @0EA: istore_3
		// @0EB: aload_0
		// @0EC: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @0EF: bipush 71 (0x47)
		// @0F1: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @0F4: checkcast game.C_100314_lf
		// @0F7: astore #4
		// @0F9: iload #15
		// @0FB: ifeq @095
		// @0FE: iconst_m1
		// @0FF: istore #4
		// @101: iconst_0
		// @102: iload_3
		// @103: if_icmplt @10E
		// @106: iconst_1
		// @107: istore #4
		// @109: iload #15
		// @10B: ifeq @111
		// @10E: iconst_0
		// @10F: istore #4
		// @111: aload_0
		// @112: iconst_1
		// @113: putfield int game.C_100294_ki.field_106972_S
		// @116: iload #4
		// @118: iconst_m1
		// @119: ixor
		// @11A: bipush -2 (0xFE)
		// @11C: if_icmpne @12A
		// @11F: aload_0
		// @120: sipush 501 (0x01F5)
		// @123: putfield int game.C_100294_ki.field_106972_S
		// @126: goto @12A
		// @129: athrow
		// @12A: iload #4
		// @12C: iconst_m1
		// @12D: ixor
		// @12E: ifeq @154
		// @131: iconst_m1
		// @132: iconst_1
		// @133: iconst_4
		// @134: iload #4
		// @136: iadd
		// @137: ishl
		// @138: aload_0
		// @139: getfield int game.C_100294_ki.field_106987_m
		// @13C: iand
		// @13D: iconst_m1
		// @13E: ixor
		// @13F: if_icmpeq @14A
		// @142: goto @146
		// @145: athrow
		// @146: goto @154
		// @149: athrow
		// @14A: aload_0
		// @14B: aconst_null
		// @14C: sipush 7689 (0x1E09)
		// @14F: iload #4
		// @151: invokevirtual game.C_100294_ki.func_106907_a(game.C_100314_lf, int, int)void
		// @154: iload #15
		// @156: ifeq @724
		// @159: iconst_m1
		// @15A: aload_0
		// @15B: getfield int game.C_100294_ki.field_106951_E
		// @15E: iconst_3
		// @15F: iand
		// @160: iconst_m1
		// @161: ixor
		// @162: if_icmpeq @442
		// @165: goto @169
		// @168: athrow
		// @169: aload_0
		// @16A: getfield int game.C_100294_ki.field_106951_E
		// @16D: iconst_3
		// @16E: iand
		// @16F: iconst_2
		// @170: if_icmpne @724
		// @173: goto @177
		// @176: athrow
		// @177: aload_0
		// @178: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @17B: getfield int[] game.C_100171_cn.field_105580_p
		// @17E: iconst_1
		// @17F: iaload
		// @180: istore_3
		// @181: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @184: iconst_4
		// @185: aaload
		// @186: iconst_0
		// @187: aaload
		// @188: getfield int game.C_100037_wb.field_102341_y
		// @18B: ldc 791665988 (0x2f2fdd44)
		// @18D: ishl
		// @18E: istore #4
		// @190: iload #4
		// @192: iconst_2
		// @193: idiv
		// @194: ineg
		// @195: iload_3
		// @196: iadd
		// @197: istore #5
		// @199: iload #4
		// @19B: iconst_2
		// @19C: idiv
		// @19D: iload_3
		// @19E: iadd
		// @19F: istore #6
		// @1A1: iload #6
		// @1A3: istore #7
		// @1A5: iload #7
		// @1A7: iconst_m1
		// @1A8: ixor
		// @1A9: iload #5
		// @1AB: iconst_m1
		// @1AC: ixor
		// @1AD: if_icmpge @203
		// @1B0: aload_0
		// @1B1: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1B4: getfield int[] game.C_100171_cn.field_105574_m
		// @1B7: iload #7
		// @1B9: aload_0
		// @1BA: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1BD: getfield int[] game.C_100171_cn.field_105574_m
		// @1C0: iload #7
		// @1C2: iconst_m1
		// @1C3: iadd
		// @1C4: iaload
		// @1C5: iastore
		// @1C6: aload_0
		// @1C7: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1CA: getfield int[] game.C_100171_cn.field_105567_e
		// @1CD: iload #7
		// @1CF: aload_0
		// @1D0: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1D3: getfield int[] game.C_100171_cn.field_105567_e
		// @1D6: iconst_m1
		// @1D7: iload #7
		// @1D9: iadd
		// @1DA: iaload
		// @1DB: iastore
		// @1DC: aload_0
		// @1DD: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1E0: getfield int[] game.C_100171_cn.field_105575_j
		// @1E3: iload #7
		// @1E5: aload_0
		// @1E6: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1E9: getfield int[] game.C_100171_cn.field_105575_j
		// @1EC: iconst_m1
		// @1ED: iload #7
		// @1EF: iadd
		// @1F0: iaload
		// @1F1: iastore
		// @1F2: iinc #7 +255
		// @1F5: iload #15
		// @1F7: ifne @24F
		// @1FA: iload #15
		// @1FC: ifeq @1A5
		// @1FF: goto @203
		// @202: athrow
		// @203: aload_0
		// @204: getfield int game.C_100294_ki.field_106951_E
		// @207: iconst_m1
		// @208: ixor
		// @209: bipush -7 (0xF9)
		// @20B: if_icmpne @24F
		// @20E: iload #5
		// @210: istore #7
		// @212: iconst_0
		// @213: iload #7
		// @215: if_icmpgt @24A
		// @218: aload_0
		// @219: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @21C: getfield int[] game.C_100171_cn.field_105574_m
		// @21F: iload #7
		// @221: iconst_0
		// @222: iastore
		// @223: aload_0
		// @224: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @227: getfield int[] game.C_100171_cn.field_105567_e
		// @22A: iload #7
		// @22C: iconst_0
		// @22D: iastore
		// @22E: aload_0
		// @22F: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @232: getfield int[] game.C_100171_cn.field_105575_j
		// @235: iload #7
		// @237: iconst_0
		// @238: iastore
		// @239: iinc #7 +255
		// @23C: iload #15
		// @23E: ifne @27C
		// @241: iload #15
		// @243: ifeq @212
		// @246: goto @24A
		// @249: athrow
		// @24A: iload #15
		// @24C: ifeq @27C
		// @24F: iconst_m1
		// @250: iload #5
		// @252: iconst_m1
		// @253: ixor
		// @254: if_icmplt @27C
		// @257: aload_0
		// @258: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @25B: getfield int[] game.C_100171_cn.field_105574_m
		// @25E: iload #5
		// @260: iconst_0
		// @261: iastore
		// @262: aload_0
		// @263: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @266: getfield int[] game.C_100171_cn.field_105567_e
		// @269: iload #5
		// @26B: iconst_0
		// @26C: iastore
		// @26D: aload_0
		// @26E: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @271: getfield int[] game.C_100171_cn.field_105575_j
		// @274: iload #5
		// @276: iconst_0
		// @277: iastore
		// @278: goto @27C
		// @27B: athrow
		// @27C: aload_0
		// @27D: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @280: bipush 59 (0x3B)
		// @282: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @285: checkcast game.C_100314_lf
		// @288: astore #7
		// @28A: aload #7
		// @28C: ifnull @2F5
		// @28F: aload #7
		// @291: getfield boolean game.C_100314_lf.field_101307_pb
		// @294: iload #15
		// @296: ifne @303
		// @299: ifeq @2AC
		// @29C: goto @2A0
		// @29F: athrow
		// @2A0: aload #7
		// @2A2: getfield boolean game.C_100314_lf.field_101403_Rb
		// @2A5: ifeq @2E2
		// @2A8: goto @2AC
		// @2AB: athrow
		// @2AC: iload #5
		// @2AE: aload #7
		// @2B0: getfield int game.C_100314_lf.field_101377_tc
		// @2B3: ldc 1063625572 (0x3f65a364)
		// @2B5: ishr
		// @2B6: if_icmpgt @2E2
		// @2B9: goto @2BD
		// @2BC: athrow
		// @2BD: iload #6
		// @2BF: iconst_m1
		// @2C0: ixor
		// @2C1: aload #7
		// @2C3: getfield int game.C_100314_lf.field_101377_tc
		// @2C6: ldc 1569229028 (0x5d8888e4)
		// @2C8: ishr
		// @2C9: iconst_m1
		// @2CA: ixor
		// @2CB: if_icmple @2D6
		// @2CE: goto @2D2
		// @2D1: athrow
		// @2D2: goto @2E2
		// @2D5: athrow
		// @2D6: aload #7
		// @2D8: dup
		// @2D9: getfield int game.C_100314_lf.field_101377_tc
		// @2DC: bipush 16 (0x10)
		// @2DE: iadd
		// @2DF: putfield int game.C_100314_lf.field_101377_tc
		// @2E2: aload_0
		// @2E3: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @2E6: bipush 115 (0x73)
		// @2E8: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @2EB: checkcast game.C_100314_lf
		// @2EE: astore #7
		// @2F0: iload #15
		// @2F2: ifeq @28A
		// @2F5: aload_0
		// @2F6: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @2F9: getfield int[] game.C_100171_cn.field_105580_p
		// @2FC: iconst_1
		// @2FD: dup2
		// @2FE: iaload
		// @2FF: iconst_1
		// @300: iadd
		// @301: iastore
		// @302: iconst_2
		// @303: istore #7
		// @305: iload #7
		// @307: aload_0
		// @308: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @30B: getfield int game.C_100171_cn.field_105569_c
		// @30E: if_icmpge @43D
		// @311: iload #15
		// @313: ifne @724
		// @316: iconst_0
		// @317: aload_0
		// @318: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @31B: getfield int[] game.C_100171_cn.field_105578_i
		// @31E: iload #7
		// @320: iaload
		// @321: iconst_m1
		// @322: ixor
		// @323: if_icmpeq @435
		// @326: goto @32A
		// @329: athrow
		// @32A: aload_0
		// @32B: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @32E: getfield int[] game.C_100171_cn.field_105580_p
		// @331: iload #7
		// @333: iaload
		// @334: sipush -6000 (0xE890)
		// @337: iadd
		// @338: iload_3
		// @339: if_icmpge @435
		// @33C: goto @340
		// @33F: athrow
		// @340: new game.C_100018_wk
		// @343: dup
		// @344: aload_0
		// @345: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @348: getfield int[] game.C_100171_cn.field_105580_p
		// @34B: iload #7
		// @34D: iaload
		// @34E: ldc -296253212 (0xee5788e4)
		// @350: ishl
		// @351: aload_0
		// @352: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @355: getfield int[] game.C_100171_cn.field_105567_e
		// @358: aload_0
		// @359: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @35C: getfield int[] game.C_100171_cn.field_105580_p
		// @35F: iload #7
		// @361: iaload
		// @362: iaload
		// @363: ineg
		// @364: ldc 1859130724 (0x6ed01564)
		// @366: ishl
		// @367: iconst_0
		// @368: iconst_0
		// @369: iconst_0
		// @36A: iconst_0
		// @36B: iconst_0
		// @36C: aload_0
		// @36D: aconst_null
		// @36E: sipush 500 (0x01F4)
		// @371: iconst_0
		// @372: iconst_m1
		// @373: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @376: astore #8
		// @378: aload #8
		// @37A: sipush 500 (0x01F4)
		// @37D: putfield int game.C_100018_wk.field_101546_w
		// @380: aload #8
		// @382: iconst_0
		// @383: putfield boolean game.C_100018_wk.field_101534_V
		// @386: new game.C_100058_dg
		// @389: dup
		// @38A: aload #8
		// @38C: getfield int game.C_100018_wk.field_101514_F
		// @38F: aload #8
		// @391: getfield int game.C_100018_wk.field_101545_fb
		// @394: iconst_0
		// @395: iconst_0
		// @396: bipush 20 (0x14)
		// @398: aload_0
		// @399: aload #8
		// @39B: getfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @39E: aload #8
		// @3A0: invokespecial game.C_100058_dg.<init>(int, int, int, int, int, game.C_100294_ki, game.C_100314_lf[], game.C_100018_wk)void
		// @3A3: astore #9
		// @3A5: aload #9
		// @3A7: iconst_0
		// @3A8: putfield int game.C_100058_dg.field_101571_O
		// @3AB: aload #9
		// @3AD: bipush 100 (0x64)
		// @3AF: putfield int game.C_100058_dg.field_101576_w
		// @3B2: aload #9
		// @3B4: sipush 1500 (0x05DC)
		// @3B7: putfield int game.C_100058_dg.field_101565_A
		// @3BA: aload_0
		// @3BB: getfield game.C_100202_qi game.C_100294_ki.field_106991_fb
		// @3BE: bipush 123 (0x7B)
		// @3C0: aload #9
		// @3C2: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3C5: aload_0
		// @3C6: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @3C9: getfield int[] game.C_100171_cn.field_105578_i
		// @3CC: iload #7
		// @3CE: iconst_m1
		// @3CF: iastore
		// @3D0: aload_0
		// @3D1: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @3D4: getfield int[] game.C_100171_cn.field_105580_p
		// @3D7: iload #7
		// @3D9: iaload
		// @3DA: sipush -1075 (0xFBCD)
		// @3DD: iadd
		// @3DE: istore #10
		// @3E0: sipush 1075 (0x0433)
		// @3E3: aload_0
		// @3E4: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @3E7: getfield int[] game.C_100171_cn.field_105580_p
		// @3EA: iload #7
		// @3EC: iaload
		// @3ED: iadd
		// @3EE: iload #10
		// @3F0: if_icmple @435
		// @3F3: aload_0
		// @3F4: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @3F7: getfield int[] game.C_100171_cn.field_105574_m
		// @3FA: astore #11
		// @3FC: iload #10
		// @3FE: istore #12
		// @400: aload_0
		// @401: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @404: getfield int[] game.C_100171_cn.field_105567_e
		// @407: astore #13
		// @409: iload #10
		// @40B: istore #14
		// @40D: aload_0
		// @40E: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @411: getfield int[] game.C_100171_cn.field_105575_j
		// @414: iload #10
		// @416: iconst_0
		// @417: iastore
		// @418: aload #13
		// @41A: iload #14
		// @41C: iconst_0
		// @41D: iastore
		// @41E: aload #11
		// @420: iload #12
		// @422: iconst_0
		// @423: iastore
		// @424: iinc #10 +1
		// @427: iload #15
		// @429: ifne @438
		// @42C: iload #15
		// @42E: ifeq @3E0
		// @431: goto @435
		// @434: athrow
		// @435: iinc #7 +1
		// @438: iload #15
		// @43A: ifeq @305
		// @43D: iload #15
		// @43F: ifeq @724
		// @442: aload_0
		// @443: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @446: getfield int[] game.C_100171_cn.field_105580_p
		// @449: iconst_0
		// @44A: iaload
		// @44B: istore_3
		// @44C: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @44F: iconst_4
		// @450: aaload
		// @451: iconst_0
		// @452: aaload
		// @453: getfield int game.C_100037_wb.field_102341_y
		// @456: ldc 1489486404 (0x58c7c244)
		// @458: ishl
		// @459: istore #4
		// @45B: iload_3
		// @45C: iload #4
		// @45E: iconst_2
		// @45F: idiv
		// @460: ineg
		// @461: iadd
		// @462: istore #5
		// @464: iload #4
		// @466: iconst_2
		// @467: idiv
		// @468: iload_3
		// @469: iadd
		// @46A: istore #6
		// @46C: iload #5
		// @46E: istore #7
		// @470: iload #7
		// @472: iload #6
		// @474: if_icmpge @4CA
		// @477: aload_0
		// @478: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @47B: getfield int[] game.C_100171_cn.field_105574_m
		// @47E: iload #7
		// @480: aload_0
		// @481: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @484: getfield int[] game.C_100171_cn.field_105574_m
		// @487: iconst_1
		// @488: iload #7
		// @48A: iadd
		// @48B: iaload
		// @48C: iastore
		// @48D: aload_0
		// @48E: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @491: getfield int[] game.C_100171_cn.field_105567_e
		// @494: iload #7
		// @496: aload_0
		// @497: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @49A: getfield int[] game.C_100171_cn.field_105567_e
		// @49D: iconst_1
		// @49E: iload #7
		// @4A0: iadd
		// @4A1: iaload
		// @4A2: iastore
		// @4A3: aload_0
		// @4A4: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @4A7: getfield int[] game.C_100171_cn.field_105575_j
		// @4AA: iload #7
		// @4AC: aload_0
		// @4AD: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @4B0: getfield int[] game.C_100171_cn.field_105575_j
		// @4B3: iload #7
		// @4B5: iconst_m1
		// @4B6: isub
		// @4B7: iaload
		// @4B8: iastore
		// @4B9: iinc #7 +1
		// @4BC: iload #15
		// @4BE: ifne @511
		// @4C1: iload #15
		// @4C3: ifeq @470
		// @4C6: goto @4CA
		// @4C9: athrow
		// @4CA: aload_0
		// @4CB: getfield int game.C_100294_ki.field_106951_E
		// @4CE: iconst_4
		// @4CF: if_icmpeq @511
		// @4D2: iload #6
		// @4D4: iconst_m1
		// @4D5: ixor
		// @4D6: aload_0
		// @4D7: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @4DA: getfield int[] game.C_100171_cn.field_105574_m
		// @4DD: arraylength
		// @4DE: iconst_m1
		// @4DF: ixor
		// @4E0: if_icmple @554
		// @4E3: goto @4E7
		// @4E6: athrow
		// @4E7: aload_0
		// @4E8: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @4EB: getfield int[] game.C_100171_cn.field_105574_m
		// @4EE: iload #6
		// @4F0: iconst_0
		// @4F1: iastore
		// @4F2: aload_0
		// @4F3: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @4F6: getfield int[] game.C_100171_cn.field_105567_e
		// @4F9: iload #6
		// @4FB: iconst_0
		// @4FC: iastore
		// @4FD: aload_0
		// @4FE: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @501: getfield int[] game.C_100171_cn.field_105575_j
		// @504: iload #6
		// @506: iconst_0
		// @507: iastore
		// @508: iload #15
		// @50A: ifeq @554
		// @50D: goto @511
		// @510: athrow
		// @511: iload #6
		// @513: istore #7
		// @515: iload #7
		// @517: aload_0
		// @518: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @51B: getfield int[] game.C_100171_cn.field_105574_m
		// @51E: arraylength
		// @51F: if_icmpge @554
		// @522: aload_0
		// @523: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @526: getfield int[] game.C_100171_cn.field_105574_m
		// @529: iload #7
		// @52B: iconst_0
		// @52C: iastore
		// @52D: aload_0
		// @52E: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @531: getfield int[] game.C_100171_cn.field_105567_e
		// @534: iload #7
		// @536: iconst_0
		// @537: iastore
		// @538: aload_0
		// @539: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @53C: getfield int[] game.C_100171_cn.field_105575_j
		// @53F: iload #7
		// @541: iconst_0
		// @542: iastore
		// @543: iinc #7 +1
		// @546: iload #15
		// @548: ifne @5E1
		// @54B: iload #15
		// @54D: ifeq @515
		// @550: goto @554
		// @553: athrow
		// @554: aload_0
		// @555: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @558: bipush 34 (0x22)
		// @55A: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @55D: checkcast game.C_100314_lf
		// @560: astore #7
		// @562: aload #7
		// @564: ifnull @5D1
		// @567: aload #7
		// @569: getfield boolean game.C_100314_lf.field_101307_pb
		// @56C: iload #15
		// @56E: ifne @5DF
		// @571: ifeq @584
		// @574: goto @578
		// @577: athrow
		// @578: aload #7
		// @57A: getfield boolean game.C_100314_lf.field_101403_Rb
		// @57D: ifeq @5BE
		// @580: goto @584
		// @583: athrow
		// @584: aload #7
		// @586: getfield int game.C_100314_lf.field_101377_tc
		// @589: ldc -726852604 (0xd4ad1c04)
		// @58B: ishr
		// @58C: iconst_m1
		// @58D: ixor
		// @58E: iload #5
		// @590: iconst_m1
		// @591: ixor
		// @592: if_icmpgt @5BE
		// @595: goto @599
		// @598: athrow
		// @599: iload #6
		// @59B: iconst_m1
		// @59C: ixor
		// @59D: aload #7
		// @59F: getfield int game.C_100314_lf.field_101377_tc
		// @5A2: ldc 80667300 (0x4cee2a4)
		// @5A4: ishr
		// @5A5: iconst_m1
		// @5A6: ixor
		// @5A7: if_icmple @5B2
		// @5AA: goto @5AE
		// @5AD: athrow
		// @5AE: goto @5BE
		// @5B1: athrow
		// @5B2: aload #7
		// @5B4: dup
		// @5B5: getfield int game.C_100314_lf.field_101377_tc
		// @5B8: bipush 16 (0x10)
		// @5BA: isub
		// @5BB: putfield int game.C_100314_lf.field_101377_tc
		// @5BE: aload_0
		// @5BF: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @5C2: bipush 33 (0x21)
		// @5C4: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @5C7: checkcast game.C_100314_lf
		// @5CA: astore #7
		// @5CC: iload #15
		// @5CE: ifeq @562
		// @5D1: aload_0
		// @5D2: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @5D5: getfield int[] game.C_100171_cn.field_105580_p
		// @5D8: iconst_0
		// @5D9: dup2
		// @5DA: iaload
		// @5DB: iconst_1
		// @5DC: isub
		// @5DD: iastore
		// @5DE: iconst_2
		// @5DF: istore #7
		// @5E1: aload_0
		// @5E2: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @5E5: getfield int game.C_100171_cn.field_105569_c
		// @5E8: iconst_m1
		// @5E9: ixor
		// @5EA: iload #7
		// @5EC: iconst_m1
		// @5ED: ixor
		// @5EE: if_icmpge @724
		// @5F1: iload #15
		// @5F3: ifne @7DA
		// @5F6: goto @5FA
		// @5F9: athrow
		// @5FA: aload_0
		// @5FB: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @5FE: getfield int[] game.C_100171_cn.field_105578_i
		// @601: iload #7
		// @603: iaload
		// @604: iconst_m1
		// @605: ixor
		// @606: ifeq @71C
		// @609: goto @60D
		// @60C: athrow
		// @60D: iload_3
		// @60E: aload_0
		// @60F: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @612: getfield int[] game.C_100171_cn.field_105580_p
		// @615: iload #7
		// @617: iaload
		// @618: sipush 6000 (0x1770)
		// @61B: iadd
		// @61C: if_icmplt @627
		// @61F: goto @623
		// @622: athrow
		// @623: goto @71C
		// @626: athrow
		// @627: new game.C_100018_wk
		// @62A: dup
		// @62B: aload_0
		// @62C: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @62F: getfield int[] game.C_100171_cn.field_105580_p
		// @632: iload #7
		// @634: iaload
		// @635: ldc 1726196420 (0x66e3aac4)
		// @637: ishl
		// @638: aload_0
		// @639: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @63C: getfield int[] game.C_100171_cn.field_105567_e
		// @63F: aload_0
		// @640: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @643: getfield int[] game.C_100171_cn.field_105580_p
		// @646: iload #7
		// @648: iaload
		// @649: iaload
		// @64A: ineg
		// @64B: ldc -30332636 (0xfe312924)
		// @64D: ishl
		// @64E: iconst_0
		// @64F: iconst_0
		// @650: iconst_0
		// @651: iconst_0
		// @652: iconst_0
		// @653: aload_0
		// @654: aconst_null
		// @655: sipush 500 (0x01F4)
		// @658: iconst_0
		// @659: iconst_m1
		// @65A: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @65D: astore #8
		// @65F: aload #8
		// @661: iconst_0
		// @662: putfield boolean game.C_100018_wk.field_101534_V
		// @665: aload #8
		// @667: sipush 500 (0x01F4)
		// @66A: putfield int game.C_100018_wk.field_101546_w
		// @66D: new game.C_100058_dg
		// @670: dup
		// @671: aload #8
		// @673: getfield int game.C_100018_wk.field_101514_F
		// @676: aload #8
		// @678: getfield int game.C_100018_wk.field_101545_fb
		// @67B: iconst_0
		// @67C: iconst_0
		// @67D: bipush 20 (0x14)
		// @67F: aload_0
		// @680: aload #8
		// @682: getfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @685: aload #8
		// @687: invokespecial game.C_100058_dg.<init>(int, int, int, int, int, game.C_100294_ki, game.C_100314_lf[], game.C_100018_wk)void
		// @68A: astore #9
		// @68C: aload #9
		// @68E: iconst_0
		// @68F: putfield int game.C_100058_dg.field_101571_O
		// @692: aload #9
		// @694: bipush 100 (0x64)
		// @696: putfield int game.C_100058_dg.field_101576_w
		// @699: aload #9
		// @69B: sipush 1500 (0x05DC)
		// @69E: putfield int game.C_100058_dg.field_101565_A
		// @6A1: aload_0
		// @6A2: getfield game.C_100202_qi game.C_100294_ki.field_106991_fb
		// @6A5: bipush 124 (0x7C)
		// @6A7: aload #9
		// @6A9: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @6AC: aload_0
		// @6AD: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @6B0: getfield int[] game.C_100171_cn.field_105578_i
		// @6B3: iload #7
		// @6B5: iconst_m1
		// @6B6: iastore
		// @6B7: aload_0
		// @6B8: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @6BB: getfield int[] game.C_100171_cn.field_105580_p
		// @6BE: iload #7
		// @6C0: iaload
		// @6C1: sipush 1075 (0x0433)
		// @6C4: isub
		// @6C5: istore #10
		// @6C7: aload_0
		// @6C8: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @6CB: getfield int[] game.C_100171_cn.field_105580_p
		// @6CE: iload #7
		// @6D0: iaload
		// @6D1: sipush 1075 (0x0433)
		// @6D4: iadd
		// @6D5: iload #10
		// @6D7: if_icmple @71C
		// @6DA: aload_0
		// @6DB: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @6DE: getfield int[] game.C_100171_cn.field_105574_m
		// @6E1: astore #11
		// @6E3: iload #10
		// @6E5: istore #12
		// @6E7: aload_0
		// @6E8: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @6EB: getfield int[] game.C_100171_cn.field_105567_e
		// @6EE: astore #13
		// @6F0: iload #10
		// @6F2: istore #14
		// @6F4: aload_0
		// @6F5: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @6F8: getfield int[] game.C_100171_cn.field_105575_j
		// @6FB: iload #10
		// @6FD: iconst_0
		// @6FE: iastore
		// @6FF: aload #13
		// @701: iload #14
		// @703: iconst_0
		// @704: iastore
		// @705: aload #11
		// @707: iload #12
		// @709: iconst_0
		// @70A: iastore
		// @70B: iinc #10 +1
		// @70E: iload #15
		// @710: ifne @71F
		// @713: iload #15
		// @715: ifeq @6C7
		// @718: goto @71C
		// @71B: athrow
		// @71C: iinc #7 +1
		// @71F: iload #15
		// @721: ifeq @5E1
		// @724: iload #15
		// @726: ifeq @7DA
		// @729: aload_0
		// @72A: getfield int game.C_100294_ki.field_106972_S
		// @72D: sipush 1000 (0x03E8)
		// @730: irem
		// @731: iconst_m1
		// @732: ixor
		// @733: iconst_m1
		// @734: if_icmpeq @796
		// @737: goto @73B
		// @73A: athrow
		// @73B: sipush 500 (0x01F4)
		// @73E: aload_0
		// @73F: getfield int game.C_100294_ki.field_106972_S
		// @742: sipush 1000 (0x03E8)
		// @745: irem
		// @746: if_icmpne @7DA
		// @749: goto @74D
		// @74C: athrow
		// @74D: iconst_1
		// @74E: istore_2
		// @74F: aload_0
		// @750: getfield int game.C_100294_ki.field_106987_m
		// @753: iconst_1
		// @754: iload_2
		// @755: iconst_4
		// @756: iadd
		// @757: ishl
		// @758: iand
		// @759: ifne @791
		// @75C: aload_0
		// @75D: getfield int game.C_100294_ki.field_106987_m
		// @760: iconst_1
		// @761: iload_2
		// @762: ineg
		// @763: iconst_1
		// @764: iadd
		// @765: bipush -4 (0xFC)
		// @767: isub
		// @768: ishl
		// @769: iand
		// @76A: iconst_m1
		// @76B: ixor
		// @76C: iconst_m1
		// @76D: if_icmpeq @784
		// @770: goto @774
		// @773: athrow
		// @774: aload_0
		// @775: iload_2
		// @776: bipush 121 (0x79)
		// @778: invokespecial game.C_100294_ki.func_106902_a(int, int)void
		// @77B: iload #15
		// @77D: ifeq @791
		// @780: goto @784
		// @783: athrow
		// @784: aload_0
		// @785: aconst_null
		// @786: sipush 7689 (0x1E09)
		// @789: iload_2
		// @78A: invokevirtual game.C_100294_ki.func_106907_a(game.C_100314_lf, int, int)void
		// @78D: goto @791
		// @790: athrow
		// @791: iload #15
		// @793: ifeq @7DA
		// @796: iconst_0
		// @797: istore_2
		// @798: iconst_1
		// @799: iload_2
		// @79A: bipush -4 (0xFC)
		// @79C: isub
		// @79D: ishl
		// @79E: aload_0
		// @79F: getfield int game.C_100294_ki.field_106987_m
		// @7A2: iand
		// @7A3: ifeq @7AA
		// @7A6: goto @7DA
		// @7A9: athrow
		// @7AA: iconst_m1
		// @7AB: iconst_1
		// @7AC: iconst_1
		// @7AD: iload_2
		// @7AE: ineg
		// @7AF: iconst_4
		// @7B0: iadd
		// @7B1: iadd
		// @7B2: ishl
		// @7B3: aload_0
		// @7B4: getfield int game.C_100294_ki.field_106987_m
		// @7B7: iand
		// @7B8: iconst_m1
		// @7B9: ixor
		// @7BA: if_icmpeq @7CD
		// @7BD: aload_0
		// @7BE: iload_2
		// @7BF: bipush 60 (0x3C)
		// @7C1: invokespecial game.C_100294_ki.func_106902_a(int, int)void
		// @7C4: iload #15
		// @7C6: ifeq @7DA
		// @7C9: goto @7CD
		// @7CC: athrow
		// @7CD: aload_0
		// @7CE: aconst_null
		// @7CF: sipush 7689 (0x1E09)
		// @7D2: iload_2
		// @7D3: invokevirtual game.C_100294_ki.func_106907_a(game.C_100314_lf, int, int)void
		// @7D6: goto @7DA
		// @7D9: athrow
		// @7DA: goto @7FF
		// @7DD: astore_2
		// @7DE: aload_2
		// @7DF: new java.lang.StringBuilder
		// @7E2: dup
		// @7E3: invokespecial java.lang.StringBuilder.<init>()void
		// @7E6: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @7E9: bipush 13 (0x0D)
		// @7EB: aaload
		// @7EC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7EF: iload_1
		// @7F0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7F3: bipush 41 (0x29)
		// @7F5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7F8: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7FB: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7FE: athrow
		// @7FF: return
	}
	
	private final boolean func_106897_a(int arg0, int arg1, byte arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: aload_0
		// @06: iload_2
		// @07: sipush -9577 (0xDA97)
		// @0A: invokespecial game.C_100294_ki.func_106917_b(int, int)boolean
		// @0D: ifeq @23
		// @10: aload_0
		// @11: iload_1
		// @12: sipush -9577 (0xDA97)
		// @15: invokespecial game.C_100294_ki.func_106917_b(int, int)boolean
		// @18: ifeq @23
		// @1B: goto @1F
		// @1E: athrow
		// @1F: goto @25
		// @22: athrow
		// @23: iconst_0
		// @24: ireturn
		// @25: iload_2
		// @26: iload_1
		// @27: if_icmple @32
		// @2A: iload_2
		// @2B: istore #4
		// @2D: iload_1
		// @2E: istore_2
		// @2F: iload #4
		// @31: istore_1
		// @32: iinc #2 +1
		// @35: bipush -79 (0xB1)
		// @37: iload_3
		// @38: bipush -15 (0xF1)
		// @3A: isub
		// @3B: bipush 55 (0x37)
		// @3D: idiv
		// @3E: irem
		// @3F: istore #4
		// @41: iload_1
		// @42: iload_2
		// @43: if_icmple @67
		// @46: aload_0
		// @47: iload_2
		// @48: sipush -9577 (0xDA97)
		// @4B: invokespecial game.C_100294_ki.func_106917_b(int, int)boolean
		// @4E: iload #5
		// @50: ifne @68
		// @53: ifeq @5D
		// @56: goto @5A
		// @59: athrow
		// @5A: goto @5F
		// @5D: iconst_0
		// @5E: ireturn
		// @5F: iinc #2 +1
		// @62: iload #5
		// @64: ifeq @41
		// @67: iconst_1
		// @68: ireturn
		// @69: astore #4
		// @6B: aload #4
		// @6D: new java.lang.StringBuilder
		// @70: dup
		// @71: invokespecial java.lang.StringBuilder.<init>()void
		// @74: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @77: bipush 6 (0x06)
		// @79: aaload
		// @7A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7D: iload_1
		// @7E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @81: bipush 44 (0x2C)
		// @83: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @86: iload_2
		// @87: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8A: bipush 44 (0x2C)
		// @8C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8F: iload_3
		// @90: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @93: bipush 41 (0x29)
		// @95: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @98: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9E: athrow
	}
	
	private final void func_106934_a(int[] arg0, byte arg1)
	{
		// @00: iconst_m1
		// @01: aload_0
		// @02: getfield int game.C_100294_ki.field_106999_q
		// @05: iconst_m1
		// @06: ixor
		// @07: if_icmpeq @0D
		// @0A: goto @0E
		// @0D: return
		// @0E: bipush -84 (0xAC)
		// @10: bipush 17 (0x11)
		// @12: iload_2
		// @13: isub
		// @14: bipush 35 (0x23)
		// @16: idiv
		// @17: idiv
		// @18: istore_3
		// @19: aload_0
		// @1A: aload_1
		// @1B: putfield int[] game.C_100294_ki.field_106962_I
		// @1E: aload_0
		// @1F: iconst_1
		// @20: putfield boolean game.C_100294_ki.field_106963_eb
		// @23: aload_0
		// @24: getfield int game.C_100294_ki.field_106975_X
		// @27: iflt @34
		// @2A: aload_0
		// @2B: bipush -29 (0xE3)
		// @2D: invokespecial game.C_100294_ki.func_106941_c(int)void
		// @30: goto @34
		// @33: athrow
		// @34: goto @73
		// @37: astore_3
		// @38: aload_3
		// @39: new java.lang.StringBuilder
		// @3C: dup
		// @3D: invokespecial java.lang.StringBuilder.<init>()void
		// @40: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @43: bipush 30 (0x1E)
		// @45: aaload
		// @46: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @49: aload_1
		// @4A: ifnull @56
		// @4D: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @50: iconst_1
		// @51: aaload
		// @52: goto @5B
		// @55: athrow
		// @56: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @59: iconst_4
		// @5A: aaload
		// @5B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5E: bipush 44 (0x2C)
		// @60: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @63: iload_2
		// @64: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @67: bipush 41 (0x29)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @72: athrow
		// @73: return
	}
	
	final int func_106899_d(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iload_1
		// @06: bipush 19 (0x13)
		// @08: if_icmpeq @16
		// @0B: aload_0
		// @0C: bipush -18 (0xEE)
		// @0E: invokevirtual game.C_100294_ki.func_106942_h(int)boolean
		// @11: pop
		// @12: goto @16
		// @15: athrow
		// @16: iconst_0
		// @17: istore_2
		// @18: aload_0
		// @19: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @1C: bipush 35 (0x23)
		// @1E: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @21: checkcast game.C_100314_lf
		// @24: astore_3
		// @25: aconst_null
		// @26: aload_3
		// @27: if_acmpeq @9E
		// @2A: iload_2
		// @2B: ldc 65535 (0xffff)
		// @2D: aload_3
		// @2E: getfield int game.C_100314_lf.field_101377_tc
		// @31: iconst_2
		// @32: imul
		// @33: iconst_3
		// @34: aload_3
		// @35: getfield int game.C_100314_lf.field_101395_rc
		// @38: imul
		// @39: iadd
		// @3A: iand
		// @3B: iadd
		// @3C: istore_2
		// @3D: iload_2
		// @3E: aload_3
		// @3F: getfield int game.C_100314_lf.field_101344_Y
		// @42: ldc 65535 (0xffff)
		// @44: iand
		// @45: iadd
		// @46: istore_2
		// @47: iload_2
		// @48: ldc 65535 (0xffff)
		// @4A: aload_3
		// @4B: getfield int game.C_100314_lf.field_101294_gc
		// @4E: iand
		// @4F: ldc -1360214512 (0xaeecc610)
		// @51: ishl
		// @52: iadd
		// @53: istore_2
		// @54: iload_2
		// @55: aload_3
		// @56: getfield int game.C_100314_lf.field_101310_Mb
		// @59: bipush 7 (0x07)
		// @5B: imul
		// @5C: bipush 11 (0x0B)
		// @5E: aload_3
		// @5F: getfield int game.C_100314_lf.field_101323_O
		// @62: imul
		// @63: ineg
		// @64: isub
		// @65: ldc 65535 (0xffff)
		// @67: iand
		// @68: iadd
		// @69: istore_2
		// @6A: iload_2
		// @6B: aload_3
		// @6C: getfield int game.C_100314_lf.field_101316_G
		// @6F: ldc 65535 (0xffff)
		// @71: iand
		// @72: ldc -311700144 (0xed6bd550)
		// @74: ishl
		// @75: iadd
		// @76: istore_2
		// @77: iload_2
		// @78: ldc 65535 (0xffff)
		// @7A: aload_3
		// @7B: getfield int game.C_100314_lf.field_101356_w
		// @7E: iconst_5
		// @7F: imul
		// @80: iand
		// @81: iadd
		// @82: istore_2
		// @83: aload_0
		// @84: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @87: bipush 92 (0x5C)
		// @89: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @8C: checkcast game.C_100314_lf
		// @8F: astore_3
		// @90: iload #4
		// @92: ifne @BD
		// @95: iload #4
		// @97: ifeq @25
		// @9A: goto @9E
		// @9D: athrow
		// @9E: iload_2
		// @9F: aload_0
		// @A0: getfield int game.C_100294_ki.field_106951_E
		// @A3: iadd
		// @A4: istore_2
		// @A5: iload_2
		// @A6: aload_0
		// @A7: getfield int game.C_100294_ki.field_106955_B
		// @AA: aload_0
		// @AB: getfield int game.C_100294_ki.field_106996_t
		// @AE: iadd
		// @AF: aload_0
		// @B0: getfield int game.C_100294_ki.field_106959_N
		// @B3: ineg
		// @B4: isub
		// @B5: ldc 1449878960 (0x566b65b0)
		// @B7: ishl
		// @B8: ldc -65536 (0xffff0000)
		// @BA: iand
		// @BB: iadd
		// @BC: istore_2
		// @BD: iload_2
		// @BE: ireturn
		// @BF: astore_2
		// @C0: aload_2
		// @C1: new java.lang.StringBuilder
		// @C4: dup
		// @C5: invokespecial java.lang.StringBuilder.<init>()void
		// @C8: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @CB: bipush 39 (0x27)
		// @CD: aaload
		// @CE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D1: iload_1
		// @D2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D5: bipush 41 (0x29)
		// @D7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @DD: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @E0: athrow
	}
	
	private final void func_106893_a(C_100314_lf arg0, int arg1, C_100314_lf arg2, int arg3, int arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: aload_3
		// @006: getfield int game.C_100314_lf.field_101369_z
		// @009: iload #4
		// @00B: if_icmpgt @0A7
		// @00E: sipush -30001 (0x8ACF)
		// @011: iload #5
		// @013: invokestatic java.lang.Math.abs(int)int
		// @016: iconst_m1
		// @017: ixor
		// @018: if_icmplt @05A
		// @01B: goto @01F
		// @01E: athrow
		// @01F: aload_3
		// @020: getfield int game.C_100314_lf.field_101310_Mb
		// @023: iconst_m1
		// @024: ixor
		// @025: bipush -6 (0xFA)
		// @027: if_icmpge @05A
		// @02A: goto @02E
		// @02D: athrow
		// @02E: new game.C_100087_n
		// @031: dup
		// @032: bipush 6 (0x06)
		// @034: iload_2
		// @035: aload_0
		// @036: getfield int game.C_100294_ki.field_106951_E
		// @039: bipush -2 (0xFE)
		// @03B: isub
		// @03C: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @03F: astore #6
		// @041: aload #6
		// @043: iconst_1
		// @044: putfield boolean game.C_100087_n.field_100703_p
		// @047: aload_3
		// @048: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @04B: iload #4
		// @04D: bipush 127 (0x7F)
		// @04F: ixor
		// @050: aload #6
		// @052: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @055: iload #7
		// @057: ifeq @0F1
		// @05A: iconst_m1
		// @05B: aload_3
		// @05C: getfield int game.C_100314_lf.field_101309_wb
		// @05F: iconst_m1
		// @060: ixor
		// @061: if_icmpeq @07B
		// @064: goto @068
		// @067: athrow
		// @068: bipush -2 (0xFE)
		// @06A: aload_3
		// @06B: getfield int game.C_100314_lf.field_101310_Mb
		// @06E: iconst_m1
		// @06F: ixor
		// @070: if_icmple @07B
		// @073: goto @077
		// @076: athrow
		// @077: goto @0F1
		// @07A: athrow
		// @07B: new game.C_100087_n
		// @07E: dup
		// @07F: bipush 6 (0x06)
		// @081: iload_2
		// @082: ineg
		// @083: iconst_2
		// @084: aload_0
		// @085: getfield int game.C_100294_ki.field_106951_E
		// @088: iadd
		// @089: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @08C: astore #6
		// @08E: aload #6
		// @090: iconst_1
		// @091: putfield boolean game.C_100087_n.field_100703_p
		// @094: aload_3
		// @095: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @098: iload #4
		// @09A: bipush 124 (0x7C)
		// @09C: iadd
		// @09D: aload #6
		// @09F: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0A2: iload #7
		// @0A4: ifeq @0F1
		// @0A7: aconst_null
		// @0A8: astore #6
		// @0AA: aload_3
		// @0AB: getfield int game.C_100314_lf.field_101377_tc
		// @0AE: ldc 1488025700 (0x58b17864)
		// @0B0: ishr
		// @0B1: aload_3
		// @0B2: getfield int game.C_100314_lf.field_101369_z
		// @0B5: if_icmple @0CE
		// @0B8: new game.C_100087_n
		// @0BB: dup
		// @0BC: bipush 6 (0x06)
		// @0BE: iconst_m1
		// @0BF: aload_0
		// @0C0: getfield int game.C_100294_ki.field_106951_E
		// @0C3: bipush -2 (0xFE)
		// @0C5: isub
		// @0C6: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @0C9: astore #6
		// @0CB: goto @0E0
		// @0CE: new game.C_100087_n
		// @0D1: dup
		// @0D2: bipush 6 (0x06)
		// @0D4: iconst_1
		// @0D5: aload_0
		// @0D6: getfield int game.C_100294_ki.field_106951_E
		// @0D9: iconst_2
		// @0DA: iadd
		// @0DB: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @0DE: astore #6
		// @0E0: aload #6
		// @0E2: iconst_1
		// @0E3: putfield boolean game.C_100087_n.field_100703_p
		// @0E6: aload_3
		// @0E7: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0EA: bipush 123 (0x7B)
		// @0EC: aload #6
		// @0EE: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0F1: aload_1
		// @0F2: dup
		// @0F3: getfield int game.C_100314_lf.field_101395_rc
		// @0F6: aload_3
		// @0F7: getfield int game.C_100314_lf.field_101299_xc
		// @0FA: ldc 1578650307 (0x5e184ac3)
		// @0FC: ishl
		// @0FD: iadd
		// @0FE: putfield int game.C_100314_lf.field_101395_rc
		// @101: aload_3
		// @102: getfield boolean game.C_100314_lf.field_101307_pb
		// @105: ifne @116
		// @108: iconst_m1
		// @109: aload_3
		// @10A: getfield int game.C_100314_lf.field_101295_gb
		// @10D: iconst_m1
		// @10E: ixor
		// @10F: if_icmple @137
		// @112: goto @116
		// @115: athrow
		// @116: aload_0
		// @117: iconst_3
		// @118: iload #4
		// @11A: bipush -94 (0xA2)
		// @11C: iadd
		// @11D: aload_1
		// @11E: aload_0
		// @11F: getfield int game.C_100294_ki.field_106964_J
		// @122: aload_3
		// @123: aload_0
		// @124: getfield int game.C_100294_ki.field_106951_E
		// @127: bipush 15 (0x0F)
		// @129: iadd
		// @12A: sipush 2600 (0x0A28)
		// @12D: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @130: ifeq @137
		// @133: goto @137
		// @136: athrow
		// @137: aload_0
		// @138: iconst_2
		// @139: bipush -85 (0xAB)
		// @13B: aload_1
		// @13C: aload_0
		// @13D: getfield int game.C_100294_ki.field_106964_J
		// @140: aload_3
		// @141: aload_0
		// @142: getfield int game.C_100294_ki.field_106951_E
		// @145: bipush 15 (0x0F)
		// @147: iadd
		// @148: sipush 2600 (0x0A28)
		// @14B: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @14E: ifne @253
		// @151: aload_3
		// @152: getfield int game.C_100314_lf.field_101310_Mb
		// @155: iconst_1
		// @156: if_icmpgt @1C3
		// @159: goto @15D
		// @15C: athrow
		// @15D: iconst_0
		// @15E: aload_3
		// @15F: getfield int game.C_100314_lf.field_101369_z
		// @162: if_icmpne @253
		// @165: goto @169
		// @168: athrow
		// @169: aload_3
		// @16A: getfield int game.C_100314_lf.field_101310_Mb
		// @16D: iconst_m1
		// @16E: ixor
		// @16F: iconst_m1
		// @170: if_icmpge @253
		// @173: goto @177
		// @176: athrow
		// @177: new game.C_100087_n
		// @17A: dup
		// @17B: iconst_3
		// @17C: iconst_0
		// @17D: bipush 30 (0x1E)
		// @17F: aload_0
		// @180: getfield int game.C_100294_ki.field_106951_E
		// @183: iadd
		// @184: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @187: astore #6
		// @189: aload #6
		// @18B: iconst_1
		// @18C: putfield boolean game.C_100087_n.field_100703_p
		// @18F: aload #6
		// @191: aload_3
		// @192: getfield int game.C_100314_lf.field_101395_rc
		// @195: sipush 20000 (0x4E20)
		// @198: isub
		// @199: putfield int game.C_100087_n.field_100698_u
		// @19C: aload #6
		// @19E: sipush 20000 (0x4E20)
		// @1A1: iload_2
		// @1A2: imul
		// @1A3: ineg
		// @1A4: aload_3
		// @1A5: getfield int game.C_100314_lf.field_101377_tc
		// @1A8: iadd
		// @1A9: putfield int game.C_100087_n.field_100699_t
		// @1AC: aload_3
		// @1AD: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @1B0: bipush 125 (0x7D)
		// @1B2: aload #6
		// @1B4: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1B7: aload_3
		// @1B8: sipush 128 (0x0080)
		// @1BB: invokevirtual game.C_100314_lf.func_101278_g(int)void
		// @1BE: iload #7
		// @1C0: ifeq @253
		// @1C3: aload_0
		// @1C4: iconst_1
		// @1C5: bipush -124 (0x84)
		// @1C7: aload_1
		// @1C8: aload_0
		// @1C9: getfield int game.C_100294_ki.field_106964_J
		// @1CC: aload_3
		// @1CD: bipush 25 (0x19)
		// @1CF: aload_0
		// @1D0: getfield int game.C_100294_ki.field_106951_E
		// @1D3: iadd
		// @1D4: sipush 1728 (0x06C0)
		// @1D7: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @1DA: ifeq @1E5
		// @1DD: goto @1E1
		// @1E0: athrow
		// @1E1: goto @253
		// @1E4: athrow
		// @1E5: aload_0
		// @1E6: iconst_0
		// @1E7: bipush -65 (0xBF)
		// @1E9: aload_1
		// @1EA: iconst_0
		// @1EB: aload_3
		// @1EC: bipush 25 (0x19)
		// @1EE: aload_0
		// @1EF: getfield int game.C_100294_ki.field_106951_E
		// @1F2: iadd
		// @1F3: sipush 4608 (0x1200)
		// @1F6: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @1F9: ifne @200
		// @1FC: goto @253
		// @1FF: athrow
		// @200: iconst_m1
		// @201: aload_3
		// @202: getfield int game.C_100314_lf.field_101369_z
		// @205: iconst_m1
		// @206: ixor
		// @207: if_icmpeq @20E
		// @20A: goto @253
		// @20D: athrow
		// @20E: new game.C_100087_n
		// @211: dup
		// @212: iconst_3
		// @213: iconst_0
		// @214: aload_0
		// @215: getfield int game.C_100294_ki.field_106951_E
		// @218: iconst_3
		// @219: iadd
		// @21A: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @21D: astore #6
		// @21F: aload #6
		// @221: iconst_1
		// @222: putfield boolean game.C_100087_n.field_100703_p
		// @225: aload #6
		// @227: aload_3
		// @228: getfield int game.C_100314_lf.field_101395_rc
		// @22B: sipush 20000 (0x4E20)
		// @22E: isub
		// @22F: putfield int game.C_100087_n.field_100698_u
		// @232: aload #6
		// @234: aload_3
		// @235: getfield int game.C_100314_lf.field_101377_tc
		// @238: sipush 10000 (0x2710)
		// @23B: iload_2
		// @23C: imul
		// @23D: iadd
		// @23E: putfield int game.C_100087_n.field_100699_t
		// @241: aload_3
		// @242: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @245: bipush 126 (0x7E)
		// @247: aload #6
		// @249: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @24C: aload_3
		// @24D: sipush 128 (0x0080)
		// @250: invokevirtual game.C_100314_lf.func_101278_g(int)void
		// @253: aload_1
		// @254: dup
		// @255: getfield int game.C_100314_lf.field_101395_rc
		// @258: aload_3
		// @259: getfield int game.C_100314_lf.field_101299_xc
		// @25C: ldc -578399485 (0xdd865303)
		// @25E: ishl
		// @25F: isub
		// @260: putfield int game.C_100314_lf.field_101395_rc
		// @263: goto @2D2
		// @266: astore #6
		// @268: aload #6
		// @26A: new java.lang.StringBuilder
		// @26D: dup
		// @26E: invokespecial java.lang.StringBuilder.<init>()void
		// @271: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @274: bipush 20 (0x14)
		// @276: aaload
		// @277: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27A: aload_1
		// @27B: ifnull @287
		// @27E: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @281: iconst_1
		// @282: aaload
		// @283: goto @28C
		// @286: athrow
		// @287: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @28A: iconst_4
		// @28B: aaload
		// @28C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @28F: bipush 44 (0x2C)
		// @291: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @294: iload_2
		// @295: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @298: bipush 44 (0x2C)
		// @29A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @29D: aload_3
		// @29E: ifnull @2AA
		// @2A1: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2A4: iconst_1
		// @2A5: aaload
		// @2A6: goto @2AF
		// @2A9: athrow
		// @2AA: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2AD: iconst_4
		// @2AE: aaload
		// @2AF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B2: bipush 44 (0x2C)
		// @2B4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2B7: iload #4
		// @2B9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2BC: bipush 44 (0x2C)
		// @2BE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C1: iload #5
		// @2C3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2C6: bipush 41 (0x29)
		// @2C8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2CB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2CE: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2D1: athrow
		// @2D2: return
	}
	
	private final int func_106926_b(int arg0, byte arg1)
	{
		// @00: bipush 7 (0x07)
		// @02: newarray int[]
		// @04: dup
		// @05: iconst_0
		// @06: iconst_0
		// @07: iastore
		// @08: dup
		// @09: iconst_1
		// @0A: bipush 6 (0x06)
		// @0C: iastore
		// @0D: dup
		// @0E: iconst_2
		// @0F: bipush 12 (0x0C)
		// @11: iastore
		// @12: dup
		// @13: iconst_3
		// @14: bipush 18 (0x12)
		// @16: iastore
		// @17: dup
		// @18: iconst_4
		// @19: bipush 23 (0x17)
		// @1B: iastore
		// @1C: dup
		// @1D: iconst_5
		// @1E: bipush 29 (0x1D)
		// @20: iastore
		// @21: dup
		// @22: bipush 6 (0x06)
		// @24: getstatic int[] game.C_100166_sg.field_105470_h
		// @27: arraylength
		// @28: iastore
		// @29: astore_3
		// @2A: iload_2
		// @2B: bipush -55 (0xC9)
		// @2D: if_icmplt @33
		// @30: bipush 107 (0x6B)
		// @32: ireturn
		// @33: aload_3
		// @34: iload_1
		// @35: iaload
		// @36: aload_0
		// @37: getfield game.C_100038_wa game.C_100294_ki.field_106988_j
		// @3A: bipush -4 (0xFC)
		// @3C: aload_3
		// @3D: iload_1
		// @3E: iconst_m1
		// @3F: isub
		// @40: iaload
		// @41: aload_3
		// @42: iload_1
		// @43: iaload
		// @44: ineg
		// @45: iadd
		// @46: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @49: iadd
		// @4A: istore #4
		// @4C: getstatic int[] game.C_100166_sg.field_105470_h
		// @4F: iload #4
		// @51: iaload
		// @52: ireturn
		// @53: astore_3
		// @54: aload_3
		// @55: new java.lang.StringBuilder
		// @58: dup
		// @59: invokespecial java.lang.StringBuilder.<init>()void
		// @5C: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @5F: bipush 17 (0x11)
		// @61: aaload
		// @62: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @65: iload_1
		// @66: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @69: bipush 44 (0x2C)
		// @6B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6E: iload_2
		// @6F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @72: bipush 41 (0x29)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7D: athrow
	}
	
	private final boolean func_106937_a(byte arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: aload_0
		// @06: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @09: sipush 26294 (0x66B6)
		// @0C: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @0F: iconst_m1
		// @10: ixor
		// @11: bipush -3 (0xFD)
		// @13: if_icmpeq @18
		// @16: iconst_0
		// @17: ireturn
		// @18: aload_0
		// @19: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1C: sipush -25357 (0x9CF3)
		// @1F: iload_2
		// @20: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @23: sipush 3000 (0x0BB8)
		// @26: if_icmple @2B
		// @29: iconst_0
		// @2A: ireturn
		// @2B: aload_0
		// @2C: iload_2
		// @2D: sipush -9577 (0xDA97)
		// @30: invokespecial game.C_100294_ki.func_106917_b(int, int)boolean
		// @33: ifne @38
		// @36: iconst_0
		// @37: ireturn
		// @38: iinc #2 +255
		// @3B: iload_2
		// @3C: iconst_m1
		// @3D: ixor
		// @3E: iconst_m1
		// @3F: if_icmpge @75
		// @42: aload_0
		// @43: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @46: iload_1
		// @47: sipush -25354 (0x9CF6)
		// @4A: ixor
		// @4B: iload_2
		// @4C: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @4F: sipush 3000 (0x0BB8)
		// @52: iload #4
		// @54: ifne @77
		// @57: if_icmple @60
		// @5A: goto @5E
		// @5D: athrow
		// @5E: iconst_1
		// @5F: ireturn
		// @60: aload_0
		// @61: iload_2
		// @62: sipush -9577 (0xDA97)
		// @65: invokespecial game.C_100294_ki.func_106917_b(int, int)boolean
		// @68: ifne @6D
		// @6B: iconst_0
		// @6C: ireturn
		// @6D: iinc #2 +255
		// @70: iload #4
		// @72: ifeq @3B
		// @75: iload_1
		// @76: iconst_5
		// @77: if_icmpeq @84
		// @7A: aload_0
		// @7B: bipush -86 (0xAA)
		// @7D: putfield int game.C_100294_ki.field_106965_K
		// @80: goto @84
		// @83: athrow
		// @84: iconst_0
		// @85: ireturn
		// @86: astore_3
		// @87: aload_3
		// @88: new java.lang.StringBuilder
		// @8B: dup
		// @8C: invokespecial java.lang.StringBuilder.<init>()void
		// @8F: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @92: iconst_0
		// @93: aaload
		// @94: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @97: iload_1
		// @98: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9B: bipush 44 (0x2C)
		// @9D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A0: iload_2
		// @A1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A4: bipush 41 (0x29)
		// @A6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @AC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AF: athrow
	}
	
	final void func_106928_a(int[] arg0, C_100314_lf[] arg1, int[] arg2, int[] arg3, int[] arg4, byte arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #14
		// @005: aload_1
		// @006: bipush 8 (0x08)
		// @008: iconst_1
		// @009: iastore
		// @00A: iconst_m1
		// @00B: aload_0
		// @00C: getfield int game.C_100294_ki.field_106975_X
		// @00F: iconst_m1
		// @010: ixor
		// @011: if_icmplt @01C
		// @014: aload_0
		// @015: getfield game.C_100314_lf game.C_100294_ki.field_106958_M
		// @018: goto @01D
		// @01B: athrow
		// @01C: aconst_null
		// @01D: astore #7
		// @01F: aload_1
		// @020: iconst_0
		// @021: iconst_2
		// @022: iastore
		// @023: aconst_null
		// @024: aload #7
		// @026: if_acmpne @02D
		// @029: goto @039
		// @02C: athrow
		// @02D: aload_1
		// @02E: bipush 8 (0x08)
		// @030: aload #7
		// @032: getfield int game.C_100314_lf.field_101316_G
		// @035: bipush 100 (0x64)
		// @037: idiv
		// @038: iastore
		// @039: aload_1
		// @03A: bipush 9 (0x09)
		// @03C: iconst_1
		// @03D: iastore
		// @03E: aload_1
		// @03F: bipush 10 (0x0A)
		// @041: iconst_2
		// @042: iastore
		// @043: aload_1
		// @044: iconst_4
		// @045: ldc 2147483647 (0x7fffffff)
		// @047: iastore
		// @048: iconst_0
		// @049: istore #8
		// @04B: aload_1
		// @04C: bipush 11 (0x0B)
		// @04E: iconst_1
		// @04F: iastore
		// @050: aload_1
		// @051: bipush 7 (0x07)
		// @053: bipush 10 (0x0A)
		// @055: iastore
		// @056: aload_1
		// @057: iconst_1
		// @058: sipush 2000 (0x07D0)
		// @05B: iastore
		// @05C: aload_1
		// @05D: iconst_2
		// @05E: iconst_2
		// @05F: iastore
		// @060: iconst_0
		// @061: istore #9
		// @063: bipush -8 (0xF8)
		// @065: iload #9
		// @067: iconst_m1
		// @068: ixor
		// @069: if_icmpgt @085
		// @06C: aload_1
		// @06D: iload #9
		// @06F: bipush 12 (0x0C)
		// @071: iadd
		// @072: iconst_1
		// @073: iastore
		// @074: iinc #9 +1
		// @077: iload #14
		// @079: ifne @0BC
		// @07C: iload #14
		// @07E: ifeq @063
		// @081: goto @085
		// @084: athrow
		// @085: aload_1
		// @086: bipush 22 (0x16)
		// @088: iconst_1
		// @089: iastore
		// @08A: aload_1
		// @08B: bipush 21 (0x15)
		// @08D: iconst_1
		// @08E: iastore
		// @08F: aload_1
		// @090: bipush 31 (0x1F)
		// @092: iconst_1
		// @093: iastore
		// @094: aload_1
		// @095: bipush 20 (0x14)
		// @097: iconst_1
		// @098: iastore
		// @099: aload_1
		// @09A: bipush 19 (0x13)
		// @09C: iconst_1
		// @09D: iastore
		// @09E: aload_1
		// @09F: bipush 26 (0x1A)
		// @0A1: iconst_1
		// @0A2: iastore
		// @0A3: aload_1
		// @0A4: bipush 29 (0x1D)
		// @0A6: iconst_1
		// @0A7: iastore
		// @0A8: aload_1
		// @0A9: bipush 27 (0x1B)
		// @0AB: bipush 50 (0x32)
		// @0AD: iastore
		// @0AE: aload_1
		// @0AF: bipush 23 (0x17)
		// @0B1: iconst_1
		// @0B2: iastore
		// @0B3: aload_1
		// @0B4: iconst_3
		// @0B5: iconst_1
		// @0B6: iastore
		// @0B7: aload_1
		// @0B8: bipush 30 (0x1E)
		// @0BA: iconst_1
		// @0BB: iastore
		// @0BC: iload #6
		// @0BE: bipush -52 (0xCC)
		// @0C0: if_icmplt @0C4
		// @0C3: return
		// @0C4: aload_1
		// @0C5: bipush 24 (0x18)
		// @0C7: iconst_1
		// @0C8: iastore
		// @0C9: aload_1
		// @0CA: bipush 28 (0x1C)
		// @0CC: iconst_1
		// @0CD: iastore
		// @0CE: aload_2
		// @0CF: astore #9
		// @0D1: iconst_0
		// @0D2: istore #10
		// @0D4: aload #9
		// @0D6: arraylength
		// @0D7: iload #10
		// @0D9: if_icmple @1CF
		// @0DC: aload #9
		// @0DE: iload #10
		// @0E0: aaload
		// @0E1: astore #11
		// @0E3: iload #14
		// @0E5: ifne @1FC
		// @0E8: aload #11
		// @0EA: aload #7
		// @0EC: if_acmpeq @1C7
		// @0EF: goto @0F3
		// @0F2: athrow
		// @0F3: iconst_0
		// @0F4: istore #13
		// @0F6: iload #13
		// @0F8: iconst_m1
		// @0F9: ixor
		// @0FA: bipush -33 (0xDF)
		// @0FC: if_icmple @19E
		// @0FF: iload #13
		// @101: iconst_3
		// @102: iload #14
		// @104: ifne @0D9
		// @107: if_icmpeq @196
		// @10A: iload #13
		// @10C: iconst_m1
		// @10D: ixor
		// @10E: bipush -21 (0xEB)
		// @110: if_icmpeq @196
		// @113: goto @117
		// @116: athrow
		// @117: bipush -23 (0xE9)
		// @119: iload #13
		// @11B: iconst_m1
		// @11C: ixor
		// @11D: if_icmpeq @196
		// @120: goto @124
		// @123: athrow
		// @124: bipush -7 (0xF9)
		// @126: iload #13
		// @128: iconst_m1
		// @129: ixor
		// @12A: if_icmpeq @196
		// @12D: goto @131
		// @130: athrow
		// @131: iconst_5
		// @132: iload #13
		// @134: if_icmpeq @196
		// @137: goto @13B
		// @13A: athrow
		// @13B: bipush -26 (0xE6)
		// @13D: iload #13
		// @13F: iconst_m1
		// @140: ixor
		// @141: if_icmpne @14C
		// @144: goto @148
		// @147: athrow
		// @148: goto @196
		// @14B: athrow
		// @14C: aload #11
		// @14E: iconst_2
		// @14F: iload #13
		// @151: invokevirtual game.C_100314_lf.func_101249_h(int, int)int
		// @154: istore #12
		// @156: iload #13
		// @158: iconst_m1
		// @159: ixor
		// @15A: bipush -5 (0xFB)
		// @15C: if_icmpne @17F
		// @15F: aload_1
		// @160: iload #13
		// @162: iaload
		// @163: iconst_m1
		// @164: ixor
		// @165: iload #12
		// @167: iconst_m1
		// @168: ixor
		// @169: if_icmpge @196
		// @16C: goto @170
		// @16F: athrow
		// @170: aload_1
		// @171: iload #13
		// @173: iload #12
		// @175: iastore
		// @176: iload #14
		// @178: ifeq @196
		// @17B: goto @17F
		// @17E: athrow
		// @17F: aload_1
		// @180: iload #13
		// @182: iaload
		// @183: iload #12
		// @185: if_icmpge @196
		// @188: goto @18C
		// @18B: athrow
		// @18C: aload_1
		// @18D: iload #13
		// @18F: iload #12
		// @191: iastore
		// @192: goto @196
		// @195: athrow
		// @196: iinc #13 +1
		// @199: iload #14
		// @19B: ifeq @0F6
		// @19E: aconst_null
		// @19F: aload #4
		// @1A1: if_acmpne @1A8
		// @1A4: goto @1B8
		// @1A7: athrow
		// @1A8: aload #4
		// @1AA: aload #11
		// @1AC: getfield int game.C_100314_lf.field_101346_Z
		// @1AF: dup2
		// @1B0: iaload
		// @1B1: aload #11
		// @1B3: getfield int game.C_100314_lf.field_101316_G
		// @1B6: iadd
		// @1B7: iastore
		// @1B8: aload #11
		// @1BA: getfield boolean game.C_100314_lf.field_101326_I
		// @1BD: ifeq @1C4
		// @1C0: goto @1C7
		// @1C3: athrow
		// @1C4: iinc #8 +1
		// @1C7: iinc #10 +1
		// @1CA: iload #14
		// @1CC: ifeq @0D4
		// @1CF: aconst_null
		// @1D0: aload #7
		// @1D2: if_acmpne @1FC
		// @1D5: iconst_1
		// @1D6: iload #8
		// @1D8: if_icmpne @1FC
		// @1DB: goto @1DF
		// @1DE: athrow
		// @1DF: bipush -2 (0xFE)
		// @1E1: aload_0
		// @1E2: getfield int game.C_100294_ki.field_106999_q
		// @1E5: iconst_m1
		// @1E6: ixor
		// @1E7: if_icmple @1FC
		// @1EA: goto @1EE
		// @1ED: athrow
		// @1EE: aload_1
		// @1EF: bipush 6 (0x06)
		// @1F1: iconst_1
		// @1F2: iastore
		// @1F3: iload #14
		// @1F5: ifeq @201
		// @1F8: goto @1FC
		// @1FB: athrow
		// @1FC: aload_1
		// @1FD: bipush 6 (0x06)
		// @1FF: iconst_2
		// @200: iastore
		// @201: aconst_null
		// @202: aload #4
		// @204: if_acmpeq @215
		// @207: aload #4
		// @209: arraylength
		// @20A: aload_2
		// @20B: arraylength
		// @20C: iconst_m1
		// @20D: iadd
		// @20E: if_icmplt @223
		// @211: goto @215
		// @214: athrow
		// @215: aload_1
		// @216: bipush 25 (0x19)
		// @218: iconst_0
		// @219: iastore
		// @21A: iload #14
		// @21C: ifeq @26F
		// @21F: goto @223
		// @222: athrow
		// @223: aload_1
		// @224: bipush 25 (0x19)
		// @226: iconst_1
		// @227: iastore
		// @228: iconst_0
		// @229: istore #9
		// @22B: aload #4
		// @22D: arraylength
		// @22E: iconst_m1
		// @22F: ixor
		// @230: iload #9
		// @232: iconst_m1
		// @233: ixor
		// @234: if_icmpge @26F
		// @237: aload #4
		// @239: iload #9
		// @23B: dup2
		// @23C: iaload
		// @23D: bipush 100 (0x64)
		// @23F: idiv
		// @240: iastore
		// @241: aload_1
		// @242: bipush 25 (0x19)
		// @244: iaload
		// @245: iconst_m1
		// @246: ixor
		// @247: aload #4
		// @249: iload #9
		// @24B: iaload
		// @24C: iconst_m1
		// @24D: ixor
		// @24E: iload #14
		// @250: ifne @27B
		// @253: if_icmple @267
		// @256: goto @25A
		// @259: athrow
		// @25A: aload_1
		// @25B: bipush 25 (0x19)
		// @25D: aload #4
		// @25F: iload #9
		// @261: iaload
		// @262: iastore
		// @263: goto @267
		// @266: athrow
		// @267: iinc #9 +1
		// @26A: iload #14
		// @26C: ifeq @22B
		// @26F: iconst_0
		// @270: istore #9
		// @272: aload #5
		// @274: arraylength
		// @275: iconst_m1
		// @276: ixor
		// @277: iload #9
		// @279: iconst_m1
		// @27A: ixor
		// @27B: if_icmpge @3F3
		// @27E: iload #14
		// @280: ifne @401
		// @283: aconst_null
		// @284: aload_3
		// @285: if_acmpne @290
		// @288: goto @28C
		// @28B: athrow
		// @28C: goto @29B
		// @28F: athrow
		// @290: aload_3
		// @291: iload #9
		// @293: aload_2
		// @294: iload #9
		// @296: aaload
		// @297: getfield int game.C_100314_lf.field_101316_G
		// @29A: iastore
		// @29B: iconst_0
		// @29C: istore #10
		// @29E: aload_2
		// @29F: iload #9
		// @2A1: aaload
		// @2A2: astore #11
		// @2A4: aload #7
		// @2A6: aload #11
		// @2A8: if_acmpne @2B4
		// @2AB: iload #14
		// @2AD: ifeq @3EB
		// @2B0: goto @2B4
		// @2B3: athrow
		// @2B4: iconst_1
		// @2B5: aload #11
		// @2B7: getfield int game.C_100314_lf.field_101347_Gb
		// @2BA: ishl
		// @2BB: aload_0
		// @2BC: getfield int game.C_100294_ki.field_106980_e
		// @2BF: iand
		// @2C0: iconst_m1
		// @2C1: ixor
		// @2C2: iconst_m1
		// @2C3: if_icmpeq @2D9
		// @2C6: goto @2CA
		// @2C9: athrow
		// @2CA: aload #5
		// @2CC: iload #9
		// @2CE: iconst_m1
		// @2CF: iastore
		// @2D0: iload #14
		// @2D2: ifeq @3EB
		// @2D5: goto @2D9
		// @2D8: athrow
		// @2D9: iconst_0
		// @2DA: istore #13
		// @2DC: iload #13
		// @2DE: bipush 32 (0x20)
		// @2E0: if_icmpge @3E4
		// @2E3: iload #13
		// @2E5: iconst_4
		// @2E6: iload #14
		// @2E8: ifne @27B
		// @2EB: if_icmpne @369
		// @2EE: aload #11
		// @2F0: iconst_2
		// @2F1: iload #13
		// @2F3: invokevirtual game.C_100314_lf.func_101249_h(int, int)int
		// @2F6: istore #12
		// @2F8: iconst_m1
		// @2F9: iload #12
		// @2FB: iconst_m1
		// @2FC: ixor
		// @2FD: if_icmpne @331
		// @300: aload #11
		// @302: getfield int game.C_100314_lf.field_101329_K
		// @305: ifle @331
		// @308: goto @30C
		// @30B: athrow
		// @30C: aload #11
		// @30E: getfield int game.C_100314_lf.field_101341_Nb
		// @311: iconst_m1
		// @312: ixor
		// @313: iconst_m1
		// @314: if_icmpne @331
		// @317: goto @31B
		// @31A: athrow
		// @31B: aload_0
		// @31C: getfield int game.C_100294_ki.field_106972_S
		// @31F: ifne @35D
		// @322: goto @326
		// @325: athrow
		// @326: aload_0
		// @327: getfield boolean game.C_100294_ki.field_106953_G
		// @32A: ifne @35D
		// @32D: goto @331
		// @330: athrow
		// @331: aload_0
		// @332: getfield int game.C_100294_ki.field_106999_q
		// @335: iconst_m1
		// @336: ixor
		// @337: bipush -2 (0xFE)
		// @339: if_icmpge @3DC
		// @33C: goto @340
		// @33F: athrow
		// @340: iload #12
		// @342: iconst_m1
		// @343: ixor
		// @344: aload_1
		// @345: iload #13
		// @347: iaload
		// @348: iconst_m1
		// @349: ixor
		// @34A: if_icmpne @3DC
		// @34D: goto @351
		// @350: athrow
		// @351: iload #10
		// @353: bipush 16 (0x10)
		// @355: ior
		// @356: istore #10
		// @358: iload #14
		// @35A: ifeq @3DC
		// @35D: iload #10
		// @35F: bipush 32 (0x20)
		// @361: ior
		// @362: istore #10
		// @364: iload #14
		// @366: ifeq @3DC
		// @369: bipush 25 (0x19)
		// @36B: iload #13
		// @36D: if_icmpeq @3A3
		// @370: goto @374
		// @373: athrow
		// @374: iconst_5
		// @375: iload #13
		// @377: if_icmpeq @3DC
		// @37A: goto @37E
		// @37D: athrow
		// @37E: aload #11
		// @380: iconst_2
		// @381: iload #13
		// @383: invokevirtual game.C_100314_lf.func_101249_h(int, int)int
		// @386: istore #12
		// @388: iload #12
		// @38A: aload_1
		// @38B: iload #13
		// @38D: iaload
		// @38E: if_icmpeq @395
		// @391: goto @3DC
		// @394: athrow
		// @395: iload #10
		// @397: iconst_1
		// @398: iload #13
		// @39A: ishl
		// @39B: ior
		// @39C: istore #10
		// @39E: iload #14
		// @3A0: ifeq @3DC
		// @3A3: iconst_0
		// @3A4: aload_1
		// @3A5: bipush 25 (0x19)
		// @3A7: iaload
		// @3A8: if_icmpge @3DC
		// @3AB: goto @3AF
		// @3AE: athrow
		// @3AF: aload #4
		// @3B1: ifnull @3DC
		// @3B4: goto @3B8
		// @3B7: athrow
		// @3B8: aload #4
		// @3BA: aload #11
		// @3BC: getfield int game.C_100314_lf.field_101346_Z
		// @3BF: iaload
		// @3C0: iconst_m1
		// @3C1: ixor
		// @3C2: aload_1
		// @3C3: iload #13
		// @3C5: iaload
		// @3C6: iconst_m1
		// @3C7: ixor
		// @3C8: if_icmpeq @3D3
		// @3CB: goto @3CF
		// @3CE: athrow
		// @3CF: goto @3DC
		// @3D2: athrow
		// @3D3: iload #10
		// @3D5: iconst_1
		// @3D6: iload #13
		// @3D8: ishl
		// @3D9: ior
		// @3DA: istore #10
		// @3DC: iinc #13 +1
		// @3DF: iload #14
		// @3E1: ifeq @2DC
		// @3E4: aload #5
		// @3E6: iload #9
		// @3E8: iload #10
		// @3EA: iastore
		// @3EB: iinc #9 +1
		// @3EE: iload #14
		// @3F0: ifeq @272
		// @3F3: aload_0
		// @3F4: getfield boolean game.C_100294_ki.field_106953_G
		// @3F7: ifeq @3FE
		// @3FA: goto @4BF
		// @3FD: athrow
		// @3FE: iconst_0
		// @3FF: istore #9
		// @401: iconst_0
		// @402: istore #10
		// @404: aload #5
		// @406: arraylength
		// @407: iload #10
		// @409: if_icmple @43F
		// @40C: iconst_0
		// @40D: aload #5
		// @40F: iload #10
		// @411: iaload
		// @412: iconst_m1
		// @413: ixor
		// @414: iload #14
		// @416: ifne @444
		// @419: if_icmpeq @437
		// @41C: goto @420
		// @41F: athrow
		// @420: iconst_0
		// @421: aload #5
		// @423: iload #10
		// @425: iaload
		// @426: bipush 32 (0x20)
		// @428: iand
		// @429: if_icmpne @434
		// @42C: goto @430
		// @42F: athrow
		// @430: goto @437
		// @433: athrow
		// @434: iinc #9 +1
		// @437: iinc #10 +1
		// @43A: iload #14
		// @43C: ifeq @404
		// @43F: aload #5
		// @441: arraylength
		// @442: iload #9
		// @444: if_icmpeq @464
		// @447: iconst_2
		// @448: aload #5
		// @44A: arraylength
		// @44B: if_icmpge @4BF
		// @44E: goto @452
		// @451: athrow
		// @452: aload #5
		// @454: arraylength
		// @455: iconst_m1
		// @456: ixor
		// @457: iload #9
		// @459: iconst_2
		// @45A: imul
		// @45B: iconst_m1
		// @45C: ixor
		// @45D: if_icmplt @4BF
		// @460: goto @464
		// @463: athrow
		// @464: iconst_0
		// @465: istore #10
		// @467: aload #5
		// @469: arraylength
		// @46A: iconst_m1
		// @46B: ixor
		// @46C: iload #10
		// @46E: iconst_m1
		// @46F: ixor
		// @470: if_icmpge @4BF
		// @473: iload #14
		// @475: ifne @4C5
		// @478: iconst_m1
		// @479: aload #5
		// @47B: iload #10
		// @47D: iaload
		// @47E: if_icmpeq @4B7
		// @481: goto @485
		// @484: athrow
		// @485: iconst_0
		// @486: bipush 32 (0x20)
		// @488: aload #5
		// @48A: iload #10
		// @48C: iaload
		// @48D: iand
		// @48E: if_icmpeq @4B7
		// @491: goto @495
		// @494: athrow
		// @495: aload #5
		// @497: iload #10
		// @499: aload #5
		// @49B: iload #10
		// @49D: iaload
		// @49E: bipush -33 (0xDF)
		// @4A0: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @4A3: iastore
		// @4A4: aload #5
		// @4A6: iload #10
		// @4A8: aload #5
		// @4AA: iload #10
		// @4AC: iaload
		// @4AD: bipush 16 (0x10)
		// @4AF: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @4B2: iastore
		// @4B3: goto @4B7
		// @4B6: athrow
		// @4B7: iinc #10 +1
		// @4BA: iload #14
		// @4BC: ifeq @467
		// @4BF: aload_1
		// @4C0: iconst_5
		// @4C1: aload_1
		// @4C2: iconst_4
		// @4C3: iaload
		// @4C4: iastore
		// @4C5: goto @571
		// @4C8: astore #7
		// @4CA: aload #7
		// @4CC: new java.lang.StringBuilder
		// @4CF: dup
		// @4D0: invokespecial java.lang.StringBuilder.<init>()void
		// @4D3: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @4D6: bipush 11 (0x0B)
		// @4D8: aaload
		// @4D9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4DC: aload_1
		// @4DD: ifnull @4E9
		// @4E0: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @4E3: iconst_1
		// @4E4: aaload
		// @4E5: goto @4EE
		// @4E8: athrow
		// @4E9: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @4EC: iconst_4
		// @4ED: aaload
		// @4EE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4F1: bipush 44 (0x2C)
		// @4F3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F6: aload_2
		// @4F7: ifnull @503
		// @4FA: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @4FD: iconst_1
		// @4FE: aaload
		// @4FF: goto @508
		// @502: athrow
		// @503: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @506: iconst_4
		// @507: aaload
		// @508: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @50B: bipush 44 (0x2C)
		// @50D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @510: aload_3
		// @511: ifnull @51D
		// @514: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @517: iconst_1
		// @518: aaload
		// @519: goto @522
		// @51C: athrow
		// @51D: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @520: iconst_4
		// @521: aaload
		// @522: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @525: bipush 44 (0x2C)
		// @527: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52A: aload #4
		// @52C: ifnull @538
		// @52F: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @532: iconst_1
		// @533: aaload
		// @534: goto @53D
		// @537: athrow
		// @538: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @53B: iconst_4
		// @53C: aaload
		// @53D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @540: bipush 44 (0x2C)
		// @542: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @545: aload #5
		// @547: ifnull @553
		// @54A: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @54D: iconst_1
		// @54E: aaload
		// @54F: goto @558
		// @552: athrow
		// @553: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @556: iconst_4
		// @557: aaload
		// @558: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @55B: bipush 44 (0x2C)
		// @55D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @560: iload #6
		// @562: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @565: bipush 41 (0x29)
		// @567: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @56D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @570: athrow
		// @571: return
	}
	
	private final void func_106925_a(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, C_100087_n arg7, int arg8)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #17
		// @005: aload #8
		// @007: iload #9
		// @009: putfield int game.C_100087_n.field_100693_m
		// @00C: iconst_m1
		// @00D: istore #10
		// @00F: iload #9
		// @011: istore #11
		// @013: iload #11
		// @015: iconst_m1
		// @016: ixor
		// @017: iload_3
		// @018: iconst_m1
		// @019: ixor
		// @01A: if_icmple @0CF
		// @01D: iconst_3
		// @01E: iload_1
		// @01F: iload #11
		// @021: ldc 898537155 (0x358e96c3)
		// @023: ishr
		// @024: imul
		// @025: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @028: iload #6
		// @02A: imul
		// @02B: ldc -1302768784 (0xb2595370)
		// @02D: ishr
		// @02E: istore #12
		// @030: iload #6
		// @032: ineg
		// @033: iload #11
		// @035: ldc 157474659 (0x962df63)
		// @037: ishr
		// @038: iload_1
		// @039: imul
		// @03A: iload #17
		// @03C: ifne @0D1
		// @03F: iload_2
		// @040: ifne @04C
		// @043: goto @047
		// @046: athrow
		// @047: iconst_1
		// @048: goto @04D
		// @04B: athrow
		// @04C: iconst_0
		// @04D: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @050: imul
		// @051: ldc 1626727888 (0x60f5e5d0)
		// @053: ishr
		// @054: istore #13
		// @056: iconst_0
		// @057: iload #12
		// @059: if_icmpeq @0C4
		// @05C: iconst_m1
		// @05D: iload #13
		// @05F: iconst_m1
		// @060: ixor
		// @061: if_icmpne @06C
		// @064: goto @068
		// @067: athrow
		// @068: goto @0C4
		// @06B: athrow
		// @06C: iload #4
		// @06E: iload #12
		// @070: idiv
		// @071: istore #14
		// @073: iload #7
		// @075: ifeq @089
		// @078: iload #13
		// @07A: ineg
		// @07B: iload #7
		// @07D: idiv
		// @07E: iload #5
		// @080: iload #13
		// @082: idiv
		// @083: ineg
		// @084: iadd
		// @085: goto @08E
		// @088: athrow
		// @089: iload #5
		// @08B: iload #13
		// @08D: idiv
		// @08E: istore #15
		// @090: iload #14
		// @092: iload #15
		// @094: isub
		// @095: invokestatic java.lang.Math.abs(int)int
		// @098: istore #16
		// @09A: iload #16
		// @09C: invokestatic java.lang.Math.abs(int)int
		// @09F: iconst_m1
		// @0A0: ixor
		// @0A1: iload #10
		// @0A3: iconst_m1
		// @0A4: ixor
		// @0A5: if_icmpgt @0B4
		// @0A8: iconst_0
		// @0A9: iload #10
		// @0AB: iconst_m1
		// @0AC: ixor
		// @0AD: if_icmpne @0C4
		// @0B0: goto @0B4
		// @0B3: athrow
		// @0B4: iload #16
		// @0B6: invokestatic java.lang.Math.abs(int)int
		// @0B9: istore #10
		// @0BB: aload #8
		// @0BD: iload #11
		// @0BF: iload_1
		// @0C0: imul
		// @0C1: putfield int game.C_100087_n.field_100693_m
		// @0C4: wide (iinc) #11 +128
		// @0CA: iload #17
		// @0CC: ifeq @013
		// @0CF: iload_2
		// @0D0: iconst_1
		// @0D1: if_icmpeq @0DE
		// @0D4: aload_0
		// @0D5: bipush -113 (0x8F)
		// @0D7: putfield int game.C_100294_ki.field_106952_F
		// @0DA: goto @0DE
		// @0DD: athrow
		// @0DE: goto @164
		// @0E1: astore #10
		// @0E3: aload #10
		// @0E5: new java.lang.StringBuilder
		// @0E8: dup
		// @0E9: invokespecial java.lang.StringBuilder.<init>()void
		// @0EC: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @0EF: bipush 34 (0x22)
		// @0F1: aaload
		// @0F2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F5: iload_1
		// @0F6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F9: bipush 44 (0x2C)
		// @0FB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FE: iload_2
		// @0FF: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @102: bipush 44 (0x2C)
		// @104: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @107: iload_3
		// @108: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @10B: bipush 44 (0x2C)
		// @10D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @110: iload #4
		// @112: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @115: bipush 44 (0x2C)
		// @117: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @11A: iload #5
		// @11C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @11F: bipush 44 (0x2C)
		// @121: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @124: iload #6
		// @126: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @129: bipush 44 (0x2C)
		// @12B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @12E: iload #7
		// @130: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @133: bipush 44 (0x2C)
		// @135: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @138: aload #8
		// @13A: ifnull @146
		// @13D: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @140: iconst_1
		// @141: aaload
		// @142: goto @14B
		// @145: athrow
		// @146: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @149: iconst_4
		// @14A: aaload
		// @14B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @14E: bipush 44 (0x2C)
		// @150: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @153: iload #9
		// @155: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @158: bipush 41 (0x29)
		// @15A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @15D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @160: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @163: athrow
		// @164: return
	}
	
	private final boolean func_106927_a(boolean arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: ifeq @10
		// @04: aload_0
		// @05: aconst_null
		// @06: checkcast int[]
		// @09: putfield int[] game.C_100294_ki.field_106945_cb
		// @0C: goto @10
		// @0F: athrow
		// @10: iload_2
		// @11: ineg
		// @12: istore_2
		// @13: aload_0
		// @14: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @17: sipush -25357 (0x9CF3)
		// @1A: iload_3
		// @1B: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @1E: iconst_m1
		// @1F: ixor
		// @20: iload_2
		// @21: iconst_m1
		// @22: ixor
		// @23: if_icmpge @54
		// @26: iload_2
		// @27: iconst_m1
		// @28: ixor
		// @29: aload_0
		// @2A: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @2D: bipush 80 (0x50)
		// @2F: iload_3
		// @30: invokevirtual game.C_100171_cn.func_105560_c(int, int)int
		// @33: iconst_m1
		// @34: ixor
		// @35: if_icmpgt @4F
		// @38: goto @3C
		// @3B: athrow
		// @3C: iload_2
		// @3D: aload_0
		// @3E: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @41: ldc_w 830205956 (0x317bf004)
		// @44: iload_3
		// @45: invokevirtual game.C_100171_cn.func_105563_a(int, int)int
		// @48: if_icmple @54
		// @4B: goto @4F
		// @4E: athrow
		// @4F: iconst_1
		// @50: goto @55
		// @53: athrow
		// @54: iconst_0
		// @55: ireturn
		// @56: astore #4
		// @58: aload #4
		// @5A: new java.lang.StringBuilder
		// @5D: dup
		// @5E: invokespecial java.lang.StringBuilder.<init>()void
		// @61: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @64: bipush 23 (0x17)
		// @66: aaload
		// @67: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6A: iload_1
		// @6B: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
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
	
	static final void func_106936_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush 34 (0x22)
		// @03: if_icmpge @0F
		// @06: bipush 117 (0x75)
		// @08: putstatic int game.C_100294_ki.field_106971_P
		// @0B: goto @0F
		// @0E: athrow
		// @0F: getstatic boolean game.C_100021_wn.field_103871_b
		// @12: ifne @19
		// @15: goto @39
		// @18: athrow
		// @19: getstatic int game.C_100196_rb.field_105827_i
		// @1C: getstatic int game.C_100196_rb.field_105816_f
		// @1F: getstatic int game.C_100196_rb.field_105820_b
		// @22: getstatic int game.C_100196_rb.field_105827_i
		// @25: isub
		// @26: getstatic int game.C_100196_rb.field_105823_l
		// @29: getstatic int game.C_100196_rb.field_105816_f
		// @2C: isub
		// @2D: invokestatic game.C_100196_rb.func_105809_f(int, int, int, int)void
		// @30: getstatic game.C_100302_ka game.C_100245_pf.field_106388_b
		// @33: bipush -127 (0x81)
		// @35: iconst_0
		// @36: invokevirtual game.C_100302_ka.func_101809_a(byte, boolean)void
		// @39: goto @5E
		// @3C: astore_1
		// @3D: aload_1
		// @3E: new java.lang.StringBuilder
		// @41: dup
		// @42: invokespecial java.lang.StringBuilder.<init>()void
		// @45: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @48: bipush 46 (0x2E)
		// @4A: aaload
		// @4B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4E: iload_0
		// @4F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @52: bipush 41 (0x29)
		// @54: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @57: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5D: athrow
		// @5E: return
	}
	
	final void func_106905_d(int arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: iconst_m1
		// @006: aload_0
		// @007: getfield int game.C_100294_ki.field_106961_H
		// @00A: iconst_m1
		// @00B: ixor
		// @00C: if_icmpne @01D
		// @00F: aload_0
		// @010: iconst_1
		// @011: putfield int game.C_100294_ki.field_106961_H
		// @014: iload #8
		// @016: ifeq @034
		// @019: goto @01D
		// @01C: athrow
		// @01D: aload_0
		// @01E: getfield int game.C_100294_ki.field_106961_H
		// @021: bipush 50 (0x32)
		// @023: if_icmpge @02E
		// @026: goto @02A
		// @029: athrow
		// @02A: goto @034
		// @02D: athrow
		// @02E: aload_0
		// @02F: bipush 49 (0x31)
		// @031: putfield int game.C_100294_ki.field_106961_H
		// @034: aload_0
		// @035: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @038: getfield int[] game.C_100171_cn.field_105580_p
		// @03B: iload_1
		// @03C: iaload
		// @03D: istore_3
		// @03E: getstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @041: iconst_4
		// @042: aaload
		// @043: iconst_0
		// @044: aaload
		// @045: getfield int game.C_100037_wb.field_102341_y
		// @048: ldc_w 1034627844 (0x3dab2b04)
		// @04B: ishl
		// @04C: istore #4
		// @04E: iload_2
		// @04F: sipush 256 (0x0100)
		// @052: if_icmpeq @05E
		// @055: aload_0
		// @056: iconst_1
		// @057: putfield int game.C_100294_ki.field_106955_B
		// @05A: goto @05E
		// @05D: athrow
		// @05E: iload #4
		// @060: iconst_2
		// @061: idiv
		// @062: ineg
		// @063: iload_3
		// @064: iadd
		// @065: istore #5
		// @067: iload_3
		// @068: iload #4
		// @06A: iconst_2
		// @06B: idiv
		// @06C: ineg
		// @06D: isub
		// @06E: istore #6
		// @070: iload #5
		// @072: istore #7
		// @074: iload #7
		// @076: iconst_m1
		// @077: ixor
		// @078: iload #6
		// @07A: iconst_m1
		// @07B: ixor
		// @07C: if_icmple @0B1
		// @07F: aload_0
		// @080: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @083: getfield int[] game.C_100171_cn.field_105574_m
		// @086: iload #7
		// @088: iconst_0
		// @089: iastore
		// @08A: aload_0
		// @08B: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @08E: getfield int[] game.C_100171_cn.field_105567_e
		// @091: iload #7
		// @093: iconst_0
		// @094: iastore
		// @095: aload_0
		// @096: iload #8
		// @098: ifne @0B2
		// @09B: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @09E: getfield int[] game.C_100171_cn.field_105575_j
		// @0A1: iload #7
		// @0A3: iconst_0
		// @0A4: iastore
		// @0A5: iinc #7 +1
		// @0A8: iload #8
		// @0AA: ifeq @074
		// @0AD: goto @0B1
		// @0B0: athrow
		// @0B1: aload_0
		// @0B2: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @0B5: iload_2
		// @0B6: sipush -164 (0xFF5C)
		// @0B9: iadd
		// @0BA: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @0BD: checkcast game.C_100314_lf
		// @0C0: astore #7
		// @0C2: aconst_null
		// @0C3: aload #7
		// @0C5: if_acmpeq @169
		// @0C8: iload #8
		// @0CA: ifne @197
		// @0CD: iload_1
		// @0CE: aload #7
		// @0D0: getfield int game.C_100314_lf.field_101346_Z
		// @0D3: if_icmpne @0FD
		// @0D6: goto @0DA
		// @0D9: athrow
		// @0DA: iconst_0
		// @0DB: aload #7
		// @0DD: getfield int game.C_100314_lf.field_101297_Ub
		// @0E0: if_icmplt @0EB
		// @0E3: goto @0E7
		// @0E6: athrow
		// @0E7: goto @0FD
		// @0EA: athrow
		// @0EB: aload #7
		// @0ED: iconst_0
		// @0EE: putfield int game.C_100314_lf.field_101356_w
		// @0F1: aload #7
		// @0F3: iconst_0
		// @0F4: putfield boolean game.C_100314_lf.field_101403_Rb
		// @0F7: aload #7
		// @0F9: iconst_0
		// @0FA: putfield int game.C_100314_lf.field_101297_Ub
		// @0FD: iload_1
		// @0FE: iconst_m1
		// @0FF: ixor
		// @100: aload #7
		// @102: getfield int game.C_100314_lf.field_101346_Z
		// @105: iconst_m1
		// @106: ixor
		// @107: if_icmpeq @140
		// @10A: aload #7
		// @10C: getfield boolean game.C_100314_lf.field_101326_I
		// @10F: ifne @140
		// @112: goto @116
		// @115: athrow
		// @116: aload #7
		// @118: bipush 50 (0x32)
		// @11A: putfield int game.C_100314_lf.field_101349_o
		// @11D: aload #7
		// @11F: dup
		// @120: getfield int game.C_100314_lf.field_101348_n
		// @123: ldc_w 100000 (0x186a0)
		// @126: iadd
		// @127: putfield int game.C_100314_lf.field_101348_n
		// @12A: aload #7
		// @12C: dup
		// @12D: getfield int game.C_100314_lf.field_101316_G
		// @130: ldc_w 100000 (0x186a0)
		// @133: iadd
		// @134: putfield int game.C_100314_lf.field_101316_G
		// @137: iload #8
		// @139: ifeq @156
		// @13C: goto @140
		// @13F: athrow
		// @140: aload #7
		// @142: getfield boolean game.C_100314_lf.field_101326_I
		// @145: ifeq @150
		// @148: goto @14C
		// @14B: athrow
		// @14C: goto @156
		// @14F: athrow
		// @150: aload #7
		// @152: iconst_0
		// @153: putfield boolean game.C_100314_lf.field_101331_Wb
		// @156: aload_0
		// @157: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @15A: bipush 69 (0x45)
		// @15C: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @15F: checkcast game.C_100314_lf
		// @162: astore #7
		// @164: iload #8
		// @166: ifeq @0C2
		// @169: goto @197
		// @16C: astore_3
		// @16D: aload_3
		// @16E: new java.lang.StringBuilder
		// @171: dup
		// @172: invokespecial java.lang.StringBuilder.<init>()void
		// @175: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @178: bipush 38 (0x26)
		// @17A: aaload
		// @17B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @17E: iload_1
		// @17F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @182: bipush 44 (0x2C)
		// @184: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @187: iload_2
		// @188: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @18B: bipush 41 (0x29)
		// @18D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @190: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @193: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @196: athrow
		// @197: return
	}
	
	static final int func_106900_a(int arg0, C_100038_wa arg1, byte arg2)
	{
		// @00: iconst_m1
		// @01: iload_0
		// @02: iconst_m1
		// @03: ixor
		// @04: if_icmpgt @10
		// @07: new java.lang.IllegalArgumentException
		// @0A: dup
		// @0B: invokespecial java.lang.IllegalArgumentException.<init>()void
		// @0E: athrow
		// @0F: athrow
		// @10: iconst_1
		// @11: iload_0
		// @12: invokestatic game.C_100301_kb.func_107087_a(boolean, int)boolean
		// @15: ifne @1C
		// @18: goto @31
		// @1B: athrow
		// @1C: iload_0
		// @1D: i2l
		// @1E: aload_1
		// @1F: sipush 256 (0x0100)
		// @22: invokevirtual game.C_100038_wa.func_104061_a(int)int
		// @25: i2l
		// @26: ldc2_w 4294967295
		// @29: land
		// @2A: lmul
		// @2B: ldc_w 1676600288 (0x63eee3e0)
		// @2E: lshr
		// @2F: l2i
		// @30: ireturn
		// @31: ldc_w -2147483648 (0x80000000)
		// @34: ldc2_w 4294967296
		// @37: iload_0
		// @38: i2l
		// @39: lrem
		// @3A: l2i
		// @3B: ineg
		// @3C: iadd
		// @3D: istore_3
		// @3E: iload_2
		// @3F: bipush -68 (0xBC)
		// @41: if_icmplt @53
		// @44: bipush -122 (0x86)
		// @46: aconst_null
		// @47: checkcast game.C_100038_wa
		// @4A: iconst_4
		// @4B: invokestatic game.C_100294_ki.func_106900_a(int, game.C_100038_wa, byte)int
		// @4E: pop
		// @4F: goto @53
		// @52: athrow
		// @53: aload_1
		// @54: sipush 256 (0x0100)
		// @57: invokevirtual game.C_100038_wa.func_104061_a(int)int
		// @5A: istore #4
		// @5C: iload_3
		// @5D: iload #4
		// @5F: if_icmpgt @66
		// @62: goto @53
		// @65: athrow
		// @66: iload #4
		// @68: bipush 71 (0x47)
		// @6A: iload_0
		// @6B: invokestatic game.C_100019_wl.func_103826_a(int, int, int)int
		// @6E: ireturn
		// @6F: astore_3
		// @70: aload_3
		// @71: new java.lang.StringBuilder
		// @74: dup
		// @75: invokespecial java.lang.StringBuilder.<init>()void
		// @78: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @7B: iconst_5
		// @7C: aaload
		// @7D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @80: iload_0
		// @81: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @84: bipush 44 (0x2C)
		// @86: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @89: aload_1
		// @8A: ifnull @96
		// @8D: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @90: iconst_1
		// @91: aaload
		// @92: goto @9B
		// @95: athrow
		// @96: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @99: iconst_4
		// @9A: aaload
		// @9B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9E: bipush 44 (0x2C)
		// @A0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A3: iload_2
		// @A4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A7: bipush 41 (0x29)
		// @A9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @AF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @B2: athrow
	}
	
	final void func_106894_a(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: getstatic int game.C_100218_am.field_103115_N
		// @008: iconst_m1
		// @009: ixor
		// @00A: iconst_m1
		// @00B: if_icmpgt @013
		// @00E: iconst_1
		// @00F: goto @014
		// @012: athrow
		// @013: iconst_0
		// @014: istore_2
		// @015: iconst_0
		// @016: istore_3
		// @017: iconst_0
		// @018: istore #4
		// @01A: iload_1
		// @01B: bipush -109 (0x93)
		// @01D: if_icmple @029
		// @020: aload_0
		// @021: iconst_0
		// @022: putfield boolean game.C_100294_ki.field_107001_ab
		// @025: goto @029
		// @028: athrow
		// @029: iconst_0
		// @02A: istore #5
		// @02C: aload_0
		// @02D: getfield int game.C_100294_ki.field_106990_h
		// @030: aload_0
		// @031: getfield int game.C_100294_ki.field_106999_q
		// @034: iadd
		// @035: newarray int[]
		// @037: astore #6
		// @039: aload_0
		// @03A: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @03D: bipush 18 (0x12)
		// @03F: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @042: checkcast game.C_100314_lf
		// @045: astore #7
		// @047: aload #7
		// @049: ifnull @0F9
		// @04C: aload #7
		// @04E: getfield int game.C_100314_lf.field_101347_Gb
		// @051: iconst_m1
		// @052: ixor
		// @053: iconst_m1
		// @054: iload #8
		// @056: ifne @110
		// @059: if_icmpgt @0E6
		// @05C: goto @060
		// @05F: athrow
		// @060: aload_0
		// @061: getfield int game.C_100294_ki.field_106999_q
		// @064: aload_0
		// @065: getfield int game.C_100294_ki.field_106990_h
		// @068: ineg
		// @069: isub
		// @06A: aload #7
		// @06C: getfield int game.C_100314_lf.field_101347_Gb
		// @06F: if_icmple @0E6
		// @072: goto @076
		// @075: athrow
		// @076: aload #7
		// @078: getfield boolean game.C_100314_lf.field_101390_lc
		// @07B: ifeq @086
		// @07E: goto @082
		// @081: athrow
		// @082: goto @0E6
		// @085: athrow
		// @086: aload #7
		// @088: getfield boolean game.C_100314_lf.field_101326_I
		// @08B: ifne @0C0
		// @08E: iload #4
		// @090: iconst_1
		// @091: aload #7
		// @093: getfield int game.C_100314_lf.field_101347_Gb
		// @096: ishl
		// @097: ior
		// @098: istore #4
		// @09A: iload_3
		// @09B: iconst_1
		// @09C: aload #7
		// @09E: getfield int game.C_100314_lf.field_101346_Z
		// @0A1: ishl
		// @0A2: ior
		// @0A3: istore_3
		// @0A4: aload_0
		// @0A5: getfield int game.C_100294_ki.field_106999_q
		// @0A8: iconst_m1
		// @0A9: ixor
		// @0AA: aload #7
		// @0AC: getfield int game.C_100314_lf.field_101347_Gb
		// @0AF: iconst_m1
		// @0B0: ixor
		// @0B1: if_icmpge @0C0
		// @0B4: iload #5
		// @0B6: iconst_1
		// @0B7: aload #7
		// @0B9: getfield int game.C_100314_lf.field_101347_Gb
		// @0BC: ishl
		// @0BD: ior
		// @0BE: istore #5
		// @0C0: aload #6
		// @0C2: aload #7
		// @0C4: getfield int game.C_100314_lf.field_101347_Gb
		// @0C7: aload #7
		// @0C9: getfield int game.C_100314_lf.field_101316_G
		// @0CC: iastore
		// @0CD: iconst_0
		// @0CE: aload #6
		// @0D0: aload #7
		// @0D2: getfield int game.C_100314_lf.field_101347_Gb
		// @0D5: iaload
		// @0D6: if_icmplt @0E6
		// @0D9: aload #6
		// @0DB: aload #7
		// @0DD: getfield int game.C_100314_lf.field_101347_Gb
		// @0E0: iconst_1
		// @0E1: iastore
		// @0E2: goto @0E6
		// @0E5: athrow
		// @0E6: aload_0
		// @0E7: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @0EA: bipush 64 (0x40)
		// @0EC: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @0EF: checkcast game.C_100314_lf
		// @0F2: astore #7
		// @0F4: iload #8
		// @0F6: ifeq @047
		// @0F9: aload_0
		// @0FA: getfield boolean game.C_100294_ki.field_106953_G
		// @0FD: ifne @108
		// @100: iload_2
		// @101: ifeq @127
		// @104: goto @108
		// @107: athrow
		// @108: iload #4
		// @10A: bipush 73 (0x49)
		// @10C: goto @110
		// @10F: athrow
		// @110: invokestatic game.C_100303_kk.func_104778_a(int, byte)int
		// @113: ifle @11A
		// @116: goto @14D
		// @119: athrow
		// @11A: aload_0
		// @11B: aload #6
		// @11D: bipush -86 (0xAA)
		// @11F: invokespecial game.C_100294_ki.func_106934_a(int[], byte)void
		// @122: iload #8
		// @124: ifeq @14D
		// @127: iload_3
		// @128: bipush -95 (0xA1)
		// @12A: invokestatic game.C_100303_kk.func_104778_a(int, byte)int
		// @12D: iconst_1
		// @12E: if_icmple @145
		// @131: goto @135
		// @134: athrow
		// @135: iconst_m1
		// @136: iload #5
		// @138: iconst_m1
		// @139: ixor
		// @13A: if_icmpeq @145
		// @13D: goto @141
		// @140: athrow
		// @141: goto @14D
		// @144: athrow
		// @145: aload_0
		// @146: aload #6
		// @148: bipush 107 (0x6B)
		// @14A: invokespecial game.C_100294_ki.func_106934_a(int[], byte)void
		// @14D: goto @172
		// @150: astore_2
		// @151: aload_2
		// @152: new java.lang.StringBuilder
		// @155: dup
		// @156: invokespecial java.lang.StringBuilder.<init>()void
		// @159: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @15C: bipush 16 (0x10)
		// @15E: aaload
		// @15F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @162: iload_1
		// @163: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @166: bipush 41 (0x29)
		// @168: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @16E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @171: athrow
		// @172: return
	}
	
	private final void func_106941_c(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: aload_0
		// @06: getfield game.C_100314_lf game.C_100294_ki.field_106958_M
		// @09: ifnonnull @12
		// @0C: aload_0
		// @0D: iconst_0
		// @0E: putfield boolean game.C_100294_ki.field_107001_ab
		// @11: return
		// @12: aload_0
		// @13: iconst_1
		// @14: putfield boolean game.C_100294_ki.field_107001_ab
		// @17: bipush 97 (0x61)
		// @19: bipush 48 (0x30)
		// @1B: iload_1
		// @1C: isub
		// @1D: bipush 59 (0x3B)
		// @1F: idiv
		// @20: irem
		// @21: istore_2
		// @22: iconst_0
		// @23: istore_3
		// @24: aload_0
		// @25: getfield int[] game.C_100294_ki.field_106962_I
		// @28: arraylength
		// @29: iconst_m1
		// @2A: ixor
		// @2B: iload_3
		// @2C: iconst_m1
		// @2D: ixor
		// @2E: if_icmpge @61
		// @31: aload_0
		// @32: getfield boolean game.C_100294_ki.field_107001_ab
		// @35: ifeq @61
		// @38: aload_0
		// @39: getfield int[] game.C_100294_ki.field_106962_I
		// @3C: iload_3
		// @3D: iaload
		// @3E: iconst_m1
		// @3F: ixor
		// @40: aload_0
		// @41: getfield game.C_100314_lf game.C_100294_ki.field_106958_M
		// @44: getfield int game.C_100314_lf.field_101316_G
		// @47: iconst_m1
		// @48: ixor
		// @49: if_icmpgt @59
		// @4C: goto @50
		// @4F: athrow
		// @50: aload_0
		// @51: iconst_0
		// @52: putfield boolean game.C_100294_ki.field_107001_ab
		// @55: goto @59
		// @58: athrow
		// @59: iinc #3 +1
		// @5C: iload #4
		// @5E: ifeq @24
		// @61: goto @86
		// @64: astore_2
		// @65: aload_2
		// @66: new java.lang.StringBuilder
		// @69: dup
		// @6A: invokespecial java.lang.StringBuilder.<init>()void
		// @6D: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @70: bipush 27 (0x1B)
		// @72: aaload
		// @73: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @76: iload_1
		// @77: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7A: bipush 41 (0x29)
		// @7C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @82: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @85: athrow
		// @86: return
	}
	
	private final boolean func_106917_b(int arg0, int arg1)
	{
		// @00: iload_2
		// @01: sipush -9577 (0xDA97)
		// @04: if_icmpeq @09
		// @07: iconst_0
		// @08: ireturn
		// @09: aload_0
		// @0A: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0D: ldc_w 830205956 (0x317bf004)
		// @10: iload_1
		// @11: invokevirtual game.C_100171_cn.func_105563_a(int, int)int
		// @14: aload_0
		// @15: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @18: iload_2
		// @19: sipush -9524 (0xDACC)
		// @1C: ixor
		// @1D: iload_1
		// @1E: invokevirtual game.C_100171_cn.func_105560_c(int, int)int
		// @21: if_icmpeq @29
		// @24: iconst_1
		// @25: goto @2A
		// @28: athrow
		// @29: iconst_0
		// @2A: ireturn
		// @2B: astore_3
		// @2C: aload_3
		// @2D: new java.lang.StringBuilder
		// @30: dup
		// @31: invokespecial java.lang.StringBuilder.<init>()void
		// @34: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @37: bipush 12 (0x0C)
		// @39: aaload
		// @3A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3D: iload_1
		// @3E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @41: bipush 44 (0x2C)
		// @43: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @46: iload_2
		// @47: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4A: bipush 41 (0x29)
		// @4C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @52: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @55: athrow
	}
	
	static final void func_106935_d(byte arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iconst_1
		// @06: istore_1
		// @07: iload_0
		// @08: bipush -30 (0xE2)
		// @0A: if_icmpeq @0E
		// @0D: return
		// @0E: iconst_0
		// @0F: istore_2
		// @10: iload_2
		// @11: iconst_m1
		// @12: ixor
		// @13: bipush -31 (0xE1)
		// @15: if_icmple @A3
		// @18: iconst_0
		// @19: iload #4
		// @1B: ifne @A4
		// @1E: getstatic int game.C_100205_qf.field_103678_d
		// @21: iload_1
		// @22: iand
		// @23: if_icmpne @2E
		// @26: goto @2A
		// @29: athrow
		// @2A: goto @95
		// @2D: athrow
		// @2E: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @31: bipush 71 (0x47)
		// @33: bipush 106 (0x6A)
		// @35: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @38: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @3B: sipush 7838 (0x1E9E)
		// @3E: iload_2
		// @3F: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @42: bipush 10 (0x0A)
		// @44: iload_2
		// @45: if_icmple @5A
		// @48: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @4B: iconst_0
		// @4C: bipush -101 (0x9B)
		// @4E: invokevirtual game.C_100278_nd.func_101141_d(int, byte)void
		// @51: iload #4
		// @53: ifeq @6E
		// @56: goto @5A
		// @59: athrow
		// @5A: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @5D: getstatic int[] game.C_100164_se.field_105454_a
		// @60: bipush -10 (0xF6)
		// @62: iload_2
		// @63: iadd
		// @64: iaload
		// @65: bipush -90 (0xA6)
		// @67: invokevirtual game.C_100278_nd.func_101141_d(int, byte)void
		// @6A: goto @6E
		// @6D: athrow
		// @6E: iconst_0
		// @6F: istore_3
		// @70: iload_3
		// @71: iconst_m1
		// @72: ixor
		// @73: bipush -5 (0xFB)
		// @75: if_icmple @95
		// @78: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @7B: iconst_0
		// @7C: iload_0
		// @7D: sipush 128 (0x0080)
		// @80: iadd
		// @81: invokevirtual game.C_100278_nd.func_101154_d(int, int)void
		// @84: iinc #3 +1
		// @87: iload #4
		// @89: ifne @9E
		// @8C: iload #4
		// @8E: ifeq @70
		// @91: goto @95
		// @94: athrow
		// @95: iload_1
		// @96: ldc_w 552610977 (0x20f02ca1)
		// @99: ishl
		// @9A: istore_1
		// @9B: iinc #2 +1
		// @9E: iload #4
		// @A0: ifeq @10
		// @A3: iconst_0
		// @A4: putstatic int game.C_100205_qf.field_103678_d
		// @A7: goto @CC
		// @AA: astore_1
		// @AB: aload_1
		// @AC: new java.lang.StringBuilder
		// @AF: dup
		// @B0: invokespecial java.lang.StringBuilder.<init>()void
		// @B3: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @B6: bipush 33 (0x21)
		// @B8: aaload
		// @B9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BC: iload_0
		// @BD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C0: bipush 41 (0x29)
		// @C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CB: athrow
		// @CC: return
	}
	
	final boolean func_106930_a(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #11
		// @005: bipush 44 (0x2C)
		// @007: iload_3
		// @008: bipush 28 (0x1C)
		// @00A: isub
		// @00B: bipush 38 (0x26)
		// @00D: idiv
		// @00E: irem
		// @00F: istore #8
		// @011: iload #6
		// @013: invokestatic java.lang.Math.abs(int)int
		// @016: iconst_m1
		// @017: ixor
		// @018: iload_2
		// @019: invokestatic java.lang.Math.abs(int)int
		// @01C: iconst_m1
		// @01D: ixor
		// @01E: if_icmple @0AF
		// @021: iload_1
		// @022: iconst_m1
		// @023: ixor
		// @024: iload #7
		// @026: iconst_m1
		// @027: ixor
		// @028: if_icmpgt @073
		// @02B: goto @02F
		// @02E: athrow
		// @02F: iload_1
		// @030: istore #9
		// @032: iload #9
		// @034: iconst_m1
		// @035: ixor
		// @036: iload #7
		// @038: iconst_m1
		// @039: ixor
		// @03A: if_icmpge @06E
		// @03D: iload_1
		// @03E: ineg
		// @03F: iload #9
		// @041: iadd
		// @042: iload #6
		// @044: imul
		// @045: iload_2
		// @046: idiv
		// @047: iload #4
		// @049: iadd
		// @04A: istore #10
		// @04C: aload_0
		// @04D: iconst_0
		// @04E: iload #10
		// @050: iload #9
		// @052: invokespecial game.C_100294_ki.func_106927_a(boolean, int, int)boolean
		// @055: iload #11
		// @057: ifne @13A
		// @05A: ifne @064
		// @05D: goto @061
		// @060: athrow
		// @061: goto @066
		// @064: iconst_1
		// @065: ireturn
		// @066: iinc #9 +248
		// @069: iload #11
		// @06B: ifeq @032
		// @06E: iload #11
		// @070: ifeq @139
		// @073: iload_1
		// @074: istore #9
		// @076: iload #9
		// @078: iload #7
		// @07A: if_icmpge @0AA
		// @07D: iload #4
		// @07F: iload #9
		// @081: iload_1
		// @082: isub
		// @083: iload #6
		// @085: imul
		// @086: iload_2
		// @087: idiv
		// @088: iadd
		// @089: istore #10
		// @08B: aload_0
		// @08C: iconst_0
		// @08D: iload #10
		// @08F: iload #9
		// @091: invokespecial game.C_100294_ki.func_106927_a(boolean, int, int)boolean
		// @094: iload #11
		// @096: ifne @13A
		// @099: ifeq @0A2
		// @09C: goto @0A0
		// @09F: athrow
		// @0A0: iconst_1
		// @0A1: ireturn
		// @0A2: iinc #9 +8
		// @0A5: iload #11
		// @0A7: ifeq @076
		// @0AA: iload #11
		// @0AC: ifeq @139
		// @0AF: iload #4
		// @0B1: iload #5
		// @0B3: if_icmpge @0FC
		// @0B6: goto @0BA
		// @0B9: athrow
		// @0BA: iload #4
		// @0BC: istore #9
		// @0BE: iload #5
		// @0C0: iload #9
		// @0C2: if_icmple @0F7
		// @0C5: iload_1
		// @0C6: iload #4
		// @0C8: ineg
		// @0C9: iload #9
		// @0CB: iadd
		// @0CC: iload_2
		// @0CD: imul
		// @0CE: iload #6
		// @0D0: idiv
		// @0D1: ineg
		// @0D2: isub
		// @0D3: istore #10
		// @0D5: aload_0
		// @0D6: iconst_0
		// @0D7: iload #9
		// @0D9: iload #10
		// @0DB: invokespecial game.C_100294_ki.func_106927_a(boolean, int, int)boolean
		// @0DE: iload #11
		// @0E0: ifne @13A
		// @0E3: ifne @0ED
		// @0E6: goto @0EA
		// @0E9: athrow
		// @0EA: goto @0EF
		// @0ED: iconst_1
		// @0EE: ireturn
		// @0EF: iinc #9 +8
		// @0F2: iload #11
		// @0F4: ifeq @0BE
		// @0F7: iload #11
		// @0F9: ifeq @139
		// @0FC: iload #4
		// @0FE: istore #9
		// @100: iload #9
		// @102: iconst_m1
		// @103: ixor
		// @104: iload #5
		// @106: iconst_m1
		// @107: ixor
		// @108: if_icmpge @139
		// @10B: iload_2
		// @10C: iload #9
		// @10E: iload #4
		// @110: ineg
		// @111: iadd
		// @112: imul
		// @113: iload #6
		// @115: idiv
		// @116: iload_1
		// @117: iadd
		// @118: istore #10
		// @11A: aload_0
		// @11B: iconst_0
		// @11C: iload #9
		// @11E: iload #10
		// @120: invokespecial game.C_100294_ki.func_106927_a(boolean, int, int)boolean
		// @123: iload #11
		// @125: ifne @13A
		// @128: ifeq @131
		// @12B: goto @12F
		// @12E: athrow
		// @12F: iconst_1
		// @130: ireturn
		// @131: iinc #9 +248
		// @134: iload #11
		// @136: ifeq @100
		// @139: iconst_0
		// @13A: ireturn
		// @13B: astore #8
		// @13D: aload #8
		// @13F: new java.lang.StringBuilder
		// @142: dup
		// @143: invokespecial java.lang.StringBuilder.<init>()void
		// @146: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @149: bipush 51 (0x33)
		// @14B: aaload
		// @14C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @14F: iload_1
		// @150: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @153: bipush 44 (0x2C)
		// @155: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @158: iload_2
		// @159: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @15C: bipush 44 (0x2C)
		// @15E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @161: iload_3
		// @162: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @165: bipush 44 (0x2C)
		// @167: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16A: iload #4
		// @16C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @16F: bipush 44 (0x2C)
		// @171: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @174: iload #5
		// @176: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @179: bipush 44 (0x2C)
		// @17B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17E: iload #6
		// @180: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @183: bipush 44 (0x2C)
		// @185: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @188: iload #7
		// @18A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @18D: bipush 41 (0x29)
		// @18F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @192: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @195: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @198: athrow
	}
	
	public static void func_106921_b(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100294_ki.field_106973_R
		// @04: aconst_null
		// @05: putstatic java.lang.String[] game.C_100294_ki.field_106983_a
		// @08: iload_0
		// @09: sipush 22240 (0x56E0)
		// @0C: if_icmpeq @14
		// @0F: bipush -123 (0x85)
		// @11: putstatic int game.C_100294_ki.field_106971_P
		// @14: goto @39
		// @17: astore_1
		// @18: aload_1
		// @19: new java.lang.StringBuilder
		// @1C: dup
		// @1D: invokespecial java.lang.StringBuilder.<init>()void
		// @20: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @23: bipush 45 (0x2D)
		// @25: aaload
		// @26: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @29: iload_0
		// @2A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2D: bipush 41 (0x29)
		// @2F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @32: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @35: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @38: athrow
		// @39: return
	}
	
	final C_100314_lf func_106913_c(int arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: new game.C_100019_wl
		// @08: dup
		// @09: aload_0
		// @0A: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @0D: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @10: astore_3
		// @11: iload_2
		// @12: bipush -93 (0xA3)
		// @14: if_icmplt @1C
		// @17: aconst_null
		// @18: checkcast game.C_100314_lf
		// @1B: areturn
		// @1C: aload_3
		// @1D: bipush -128 (0x80)
		// @1F: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @22: checkcast game.C_100314_lf
		// @25: astore #4
		// @27: aload #4
		// @29: ifnull @4D
		// @2C: aload #4
		// @2E: getfield int game.C_100314_lf.field_101347_Gb
		// @31: iload_1
		// @32: if_icmpeq @39
		// @35: goto @3C
		// @38: athrow
		// @39: aload #4
		// @3B: areturn
		// @3C: aload_3
		// @3D: sipush -30820 (0x879C)
		// @40: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @43: checkcast game.C_100314_lf
		// @46: astore #4
		// @48: iload #5
		// @4A: ifeq @27
		// @4D: aconst_null
		// @4E: areturn
		// @4F: astore_3
		// @50: aload_3
		// @51: new java.lang.StringBuilder
		// @54: dup
		// @55: invokespecial java.lang.StringBuilder.<init>()void
		// @58: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @5B: bipush 54 (0x36)
		// @5D: aaload
		// @5E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @61: iload_1
		// @62: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @65: bipush 44 (0x2C)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: iload_2
		// @6B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6E: bipush 41 (0x29)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @76: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @79: athrow
	}
	
	private final void func_106903_a(C_100314_lf arg0, C_100314_lf arg1, int arg2, int arg3, int arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #9
		// @005: aconst_null
		// @006: astore #6
		// @008: iconst_0
		// @009: aload_1
		// @00A: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @00D: aload_1
		// @00E: iconst_0
		// @00F: anewarray game.C_100327_ib
		// @012: ldc_w 32768 (0x8000)
		// @015: aload_1
		// @016: getfield int[] game.C_100314_lf.field_101416_ab
		// @019: iconst_2
		// @01A: iaload
		// @01B: bipush -88 (0xA8)
		// @01D: invokevirtual game.C_100327_ib.func_102448_a(game.C_100314_lf, game.C_100327_ib[], int, int, int)game.C_100327_ib[]
		// @020: arraylength
		// @021: if_icmpge @029
		// @024: iconst_1
		// @025: goto @02A
		// @028: athrow
		// @029: iconst_0
		// @02A: istore #7
		// @02C: aload_1
		// @02D: getfield int game.C_100314_lf.field_101369_z
		// @030: iconst_m1
		// @031: ixor
		// @032: iconst_m1
		// @033: if_icmplt @1B0
		// @036: ldc_w -80001 (0xfffec77f)
		// @039: iload #4
		// @03B: invokestatic java.lang.Math.abs(int)int
		// @03E: iconst_m1
		// @03F: ixor
		// @040: if_icmple @0B2
		// @043: goto @047
		// @046: athrow
		// @047: new game.C_100087_n
		// @04A: dup
		// @04B: bipush 6 (0x06)
		// @04D: iload #5
		// @04F: aload_0
		// @050: getfield int game.C_100294_ki.field_106951_E
		// @053: iconst_2
		// @054: iadd
		// @055: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @058: astore #8
		// @05A: aload #8
		// @05C: iconst_1
		// @05D: putfield boolean game.C_100087_n.field_100703_p
		// @060: aload_1
		// @061: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @064: bipush 125 (0x7D)
		// @066: aload #8
		// @068: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @06B: iload #7
		// @06D: ifne @074
		// @070: goto @0AF
		// @073: athrow
		// @074: new game.C_100087_n
		// @077: dup
		// @078: iconst_3
		// @079: iconst_0
		// @07A: aload_1
		// @07B: getfield boolean game.C_100314_lf.field_101307_pb
		// @07E: ifeq @087
		// @081: bipush 32 (0x20)
		// @083: goto @089
		// @086: athrow
		// @087: bipush 60 (0x3C)
		// @089: aload_0
		// @08A: getfield int game.C_100294_ki.field_106951_E
		// @08D: iadd
		// @08E: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @091: astore #6
		// @093: aload #6
		// @095: iconst_1
		// @096: putfield boolean game.C_100087_n.field_100703_p
		// @099: aload #6
		// @09B: aload_2
		// @09C: getfield int game.C_100314_lf.field_101377_tc
		// @09F: putfield int game.C_100087_n.field_100699_t
		// @0A2: aload #6
		// @0A4: sipush -20000 (0xB1E0)
		// @0A7: aload_1
		// @0A8: getfield int game.C_100314_lf.field_101395_rc
		// @0AB: iadd
		// @0AC: putfield int game.C_100087_n.field_100698_u
		// @0AF: goto @1E7
		// @0B2: iload #4
		// @0B4: invokestatic java.lang.Math.abs(int)int
		// @0B7: iconst_m1
		// @0B8: ixor
		// @0B9: ldc -60001 (0xffff159f)
		// @0BB: if_icmpgt @13C
		// @0BE: aload_1
		// @0BF: getfield int game.C_100314_lf.field_101309_wb
		// @0C2: ifeq @113
		// @0C5: goto @0C9
		// @0C8: athrow
		// @0C9: new game.C_100087_n
		// @0CC: dup
		// @0CD: iconst_3
		// @0CE: iconst_0
		// @0CF: aload_0
		// @0D0: getfield int game.C_100294_ki.field_106951_E
		// @0D3: aload_1
		// @0D4: getfield boolean game.C_100314_lf.field_101307_pb
		// @0D7: ifeq @0E4
		// @0DA: goto @0DE
		// @0DD: athrow
		// @0DE: bipush 32 (0x20)
		// @0E0: goto @0E6
		// @0E3: athrow
		// @0E4: bipush 60 (0x3C)
		// @0E6: iadd
		// @0E7: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @0EA: astore #6
		// @0EC: aload #6
		// @0EE: aload_1
		// @0EF: getfield int game.C_100314_lf.field_101395_rc
		// @0F2: sipush 20000 (0x4E20)
		// @0F5: isub
		// @0F6: putfield int game.C_100087_n.field_100698_u
		// @0F9: aload #6
		// @0FB: iconst_1
		// @0FC: putfield boolean game.C_100087_n.field_100703_p
		// @0FF: aload #6
		// @101: aload_1
		// @102: getfield int game.C_100314_lf.field_101377_tc
		// @105: sipush 5000 (0x1388)
		// @108: iload #5
		// @10A: imul
		// @10B: ineg
		// @10C: isub
		// @10D: putfield int game.C_100087_n.field_100699_t
		// @110: goto @1E7
		// @113: new game.C_100087_n
		// @116: dup
		// @117: bipush 6 (0x06)
		// @119: iload #5
		// @11B: iconst_2
		// @11C: aload_0
		// @11D: getfield int game.C_100294_ki.field_106951_E
		// @120: iadd
		// @121: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @124: astore #8
		// @126: aload #8
		// @128: iconst_1
		// @129: putfield boolean game.C_100087_n.field_100703_p
		// @12C: aload_1
		// @12D: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @130: bipush 123 (0x7B)
		// @132: aload #8
		// @134: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @137: iload #9
		// @139: ifeq @1E7
		// @13C: new game.C_100087_n
		// @13F: dup
		// @140: bipush 6 (0x06)
		// @142: iload #5
		// @144: ineg
		// @145: aload_0
		// @146: getfield int game.C_100294_ki.field_106951_E
		// @149: iconst_2
		// @14A: iadd
		// @14B: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @14E: astore #8
		// @150: aload #8
		// @152: iconst_1
		// @153: putfield boolean game.C_100087_n.field_100703_p
		// @156: aload_1
		// @157: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @15A: bipush 123 (0x7B)
		// @15C: aload #8
		// @15E: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @161: iload #7
		// @163: ifne @16A
		// @166: goto @1AD
		// @169: athrow
		// @16A: new game.C_100087_n
		// @16D: dup
		// @16E: iconst_3
		// @16F: iconst_0
		// @170: aload_1
		// @171: getfield boolean game.C_100314_lf.field_101307_pb
		// @174: ifne @17D
		// @177: bipush 60 (0x3C)
		// @179: goto @17F
		// @17C: athrow
		// @17D: bipush 32 (0x20)
		// @17F: aload_0
		// @180: getfield int game.C_100294_ki.field_106951_E
		// @183: iadd
		// @184: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @187: astore #6
		// @189: aload #6
		// @18B: iconst_1
		// @18C: putfield boolean game.C_100087_n.field_100703_p
		// @18F: aload #6
		// @191: sipush -20000 (0xB1E0)
		// @194: aload_1
		// @195: getfield int game.C_100314_lf.field_101395_rc
		// @198: iadd
		// @199: putfield int game.C_100087_n.field_100698_u
		// @19C: aload #6
		// @19E: aload_1
		// @19F: getfield int game.C_100314_lf.field_101377_tc
		// @1A2: iload #5
		// @1A4: sipush 20000 (0x4E20)
		// @1A7: imul
		// @1A8: ineg
		// @1A9: iadd
		// @1AA: putfield int game.C_100087_n.field_100699_t
		// @1AD: goto @1E7
		// @1B0: new game.C_100087_n
		// @1B3: dup
		// @1B4: bipush 6 (0x06)
		// @1B6: aload_1
		// @1B7: getfield int game.C_100314_lf.field_101377_tc
		// @1BA: ldc_w 1241300580 (0x49fcbe64)
		// @1BD: ishr
		// @1BE: aload_1
		// @1BF: getfield int game.C_100314_lf.field_101369_z
		// @1C2: if_icmpge @1CA
		// @1C5: iconst_1
		// @1C6: goto @1CB
		// @1C9: athrow
		// @1CA: iconst_m1
		// @1CB: iconst_2
		// @1CC: aload_0
		// @1CD: getfield int game.C_100294_ki.field_106951_E
		// @1D0: iadd
		// @1D1: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @1D4: astore #8
		// @1D6: aload #8
		// @1D8: iconst_1
		// @1D9: putfield boolean game.C_100087_n.field_100703_p
		// @1DC: aload_1
		// @1DD: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @1E0: bipush 127 (0x7F)
		// @1E2: aload #8
		// @1E4: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1E7: aload_1
		// @1E8: getfield boolean game.C_100314_lf.field_101307_pb
		// @1EB: ifeq @20B
		// @1EE: aload_0
		// @1EF: iconst_2
		// @1F0: bipush -106 (0x96)
		// @1F2: aload_2
		// @1F3: aload_0
		// @1F4: getfield int game.C_100294_ki.field_106964_J
		// @1F7: aload_1
		// @1F8: iconst_3
		// @1F9: aload_0
		// @1FA: getfield int game.C_100294_ki.field_106951_E
		// @1FD: iadd
		// @1FE: sipush 2600 (0x0A28)
		// @201: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @204: ifne @2F3
		// @207: goto @20B
		// @20A: athrow
		// @20B: bipush -2 (0xFE)
		// @20D: aload_1
		// @20E: getfield int game.C_100314_lf.field_101310_Mb
		// @211: iconst_m1
		// @212: ixor
		// @213: if_icmple @2AA
		// @216: goto @21A
		// @219: athrow
		// @21A: aload_0
		// @21B: iconst_1
		// @21C: bipush -112 (0x90)
		// @21E: aload_2
		// @21F: aload_0
		// @220: getfield int game.C_100294_ki.field_106964_J
		// @223: aload_1
		// @224: iconst_3
		// @225: aload_0
		// @226: getfield int game.C_100294_ki.field_106951_E
		// @229: iadd
		// @22A: sipush 4608 (0x1200)
		// @22D: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @230: ifne @27F
		// @233: goto @237
		// @236: athrow
		// @237: aload_0
		// @238: iconst_0
		// @239: bipush -58 (0xC6)
		// @23B: aload_2
		// @23C: aload_0
		// @23D: getfield int game.C_100294_ki.field_106964_J
		// @240: aload_1
		// @241: iconst_3
		// @242: aload_0
		// @243: getfield int game.C_100294_ki.field_106951_E
		// @246: iadd
		// @247: sipush 1280 (0x0500)
		// @24A: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @24D: ifeq @331
		// @250: goto @254
		// @253: athrow
		// @254: new game.C_100087_n
		// @257: dup
		// @258: bipush 6 (0x06)
		// @25A: iload #5
		// @25C: ineg
		// @25D: bipush 50 (0x32)
		// @25F: aload_0
		// @260: getfield int game.C_100294_ki.field_106951_E
		// @263: iadd
		// @264: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @267: astore #8
		// @269: aload #8
		// @26B: iconst_1
		// @26C: putfield boolean game.C_100087_n.field_100703_p
		// @26F: aload_1
		// @270: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @273: bipush 127 (0x7F)
		// @275: aload #8
		// @277: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @27A: iload #9
		// @27C: ifeq @331
		// @27F: new game.C_100087_n
		// @282: dup
		// @283: bipush 6 (0x06)
		// @285: iload #5
		// @287: ineg
		// @288: aload_0
		// @289: getfield int game.C_100294_ki.field_106951_E
		// @28C: bipush 25 (0x19)
		// @28E: iadd
		// @28F: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @292: astore #8
		// @294: aload #8
		// @296: iconst_1
		// @297: putfield boolean game.C_100087_n.field_100703_p
		// @29A: aload_1
		// @29B: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @29E: bipush 126 (0x7E)
		// @2A0: aload #8
		// @2A2: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2A5: iload #9
		// @2A7: ifeq @331
		// @2AA: aload_0
		// @2AB: iconst_0
		// @2AC: bipush -75 (0xB5)
		// @2AE: aload_2
		// @2AF: aload_0
		// @2B0: getfield int game.C_100294_ki.field_106964_J
		// @2B3: aload_1
		// @2B4: aload_0
		// @2B5: getfield int game.C_100294_ki.field_106951_E
		// @2B8: bipush -3 (0xFD)
		// @2BA: isub
		// @2BB: sipush 1280 (0x0500)
		// @2BE: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @2C1: ifeq @331
		// @2C4: goto @2C8
		// @2C7: athrow
		// @2C8: new game.C_100087_n
		// @2CB: dup
		// @2CC: bipush 6 (0x06)
		// @2CE: iload #5
		// @2D0: ineg
		// @2D1: aload_0
		// @2D2: getfield int game.C_100294_ki.field_106951_E
		// @2D5: bipush -50 (0xCE)
		// @2D7: isub
		// @2D8: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @2DB: astore #8
		// @2DD: aload #8
		// @2DF: iconst_1
		// @2E0: putfield boolean game.C_100087_n.field_100703_p
		// @2E3: aload_1
		// @2E4: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @2E7: bipush 123 (0x7B)
		// @2E9: aload #8
		// @2EB: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2EE: iload #9
		// @2F0: ifeq @331
		// @2F3: aload_0
		// @2F4: iconst_2
		// @2F5: bipush -102 (0x9A)
		// @2F7: aload_2
		// @2F8: aload_0
		// @2F9: getfield int game.C_100294_ki.field_106964_J
		// @2FC: aload_1
		// @2FD: bipush 15 (0x0F)
		// @2FF: aload_0
		// @300: getfield int game.C_100294_ki.field_106951_E
		// @303: iadd
		// @304: sipush 2600 (0x0A28)
		// @307: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @30A: pop
		// @30B: new game.C_100087_n
		// @30E: dup
		// @30F: bipush 6 (0x06)
		// @311: iload #5
		// @313: ineg
		// @314: aload_0
		// @315: getfield int game.C_100294_ki.field_106951_E
		// @318: bipush -30 (0xE2)
		// @31A: isub
		// @31B: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @31E: astore #8
		// @320: aload #8
		// @322: iconst_1
		// @323: putfield boolean game.C_100087_n.field_100703_p
		// @326: aload_1
		// @327: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @32A: bipush 123 (0x7B)
		// @32C: aload #8
		// @32E: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @331: iload_3
		// @332: bipush -15 (0xF1)
		// @334: if_icmple @341
		// @337: aload_0
		// @338: bipush -106 (0x96)
		// @33A: putfield int game.C_100294_ki.field_106985_o
		// @33D: goto @341
		// @340: athrow
		// @341: aload #6
		// @343: ifnull @360
		// @346: aload_1
		// @347: getfield int game.C_100314_lf.field_101310_Mb
		// @34A: ifle @360
		// @34D: goto @351
		// @350: athrow
		// @351: aload_1
		// @352: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @355: bipush 125 (0x7D)
		// @357: aload #6
		// @359: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @35C: goto @360
		// @35F: athrow
		// @360: goto @3CF
		// @363: astore #6
		// @365: aload #6
		// @367: new java.lang.StringBuilder
		// @36A: dup
		// @36B: invokespecial java.lang.StringBuilder.<init>()void
		// @36E: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @371: bipush 47 (0x2F)
		// @373: aaload
		// @374: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @377: aload_1
		// @378: ifnull @384
		// @37B: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @37E: iconst_1
		// @37F: aaload
		// @380: goto @389
		// @383: athrow
		// @384: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @387: iconst_4
		// @388: aaload
		// @389: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @38C: bipush 44 (0x2C)
		// @38E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @391: aload_2
		// @392: ifnull @39E
		// @395: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @398: iconst_1
		// @399: aaload
		// @39A: goto @3A3
		// @39D: athrow
		// @39E: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @3A1: iconst_4
		// @3A2: aaload
		// @3A3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A6: bipush 44 (0x2C)
		// @3A8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3AB: iload_3
		// @3AC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3AF: bipush 44 (0x2C)
		// @3B1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3B4: iload #4
		// @3B6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3B9: bipush 44 (0x2C)
		// @3BB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3BE: iload #5
		// @3C0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3C3: bipush 41 (0x29)
		// @3C5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C8: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3CB: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3CE: athrow
		// @3CF: return
	}
	
	private final void func_106938_a(int arg0, int arg1, int arg2, C_100314_lf arg3, C_100314_lf arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: aload #4
		// @007: getfield int game.C_100314_lf.field_101318_B
		// @00A: iconst_m1
		// @00B: ixor
		// @00C: iconst_m1
		// @00D: if_icmpne @0DE
		// @010: aload #5
		// @012: getfield int game.C_100314_lf.field_101399_Ab
		// @015: iconst_m1
		// @016: ixor
		// @017: iconst_m1
		// @018: if_icmplt @0DE
		// @01B: goto @01F
		// @01E: athrow
		// @01F: iconst_m1
		// @020: aload #5
		// @022: getfield int game.C_100314_lf.field_101413_Bb
		// @025: iconst_m1
		// @026: ixor
		// @027: if_icmple @0DE
		// @02A: goto @02E
		// @02D: athrow
		// @02E: sipush 30000 (0x7530)
		// @031: iload_2
		// @032: invokestatic java.lang.Math.abs(int)int
		// @035: if_icmple @0DE
		// @038: goto @03C
		// @03B: athrow
		// @03C: aload #4
		// @03E: bipush 10 (0x0A)
		// @040: putfield int game.C_100314_lf.field_101310_Mb
		// @043: new game.C_100087_n
		// @046: dup
		// @047: bipush 8 (0x08)
		// @049: iload_3
		// @04A: iconst_2
		// @04B: aload_0
		// @04C: getfield int game.C_100294_ki.field_106951_E
		// @04F: iadd
		// @050: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @053: astore #7
		// @055: aload #7
		// @057: iconst_1
		// @058: putfield boolean game.C_100087_n.field_100703_p
		// @05B: aload #4
		// @05D: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @060: bipush 124 (0x7C)
		// @062: aload #7
		// @064: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @067: new game.C_100087_n
		// @06A: dup
		// @06B: bipush 6 (0x06)
		// @06D: iload_3
		// @06E: aload_0
		// @06F: getfield int game.C_100294_ki.field_106951_E
		// @072: bipush -4 (0xFC)
		// @074: isub
		// @075: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @078: astore #7
		// @07A: aload #7
		// @07C: iconst_1
		// @07D: putfield boolean game.C_100087_n.field_100703_p
		// @080: aload #4
		// @082: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @085: bipush 123 (0x7B)
		// @087: aload #7
		// @089: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @08C: new game.C_100087_n
		// @08F: dup
		// @090: iconst_3
		// @091: iconst_0
		// @092: bipush 100 (0x64)
		// @094: aload_0
		// @095: getfield int game.C_100294_ki.field_106951_E
		// @098: iadd
		// @099: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @09C: astore #7
		// @09E: aload #7
		// @0A0: aload #4
		// @0A2: getfield int game.C_100314_lf.field_101377_tc
		// @0A5: iload_3
		// @0A6: sipush 20000 (0x4E20)
		// @0A9: imul
		// @0AA: ineg
		// @0AB: isub
		// @0AC: putfield int game.C_100087_n.field_100699_t
		// @0AF: aload #7
		// @0B1: aload #4
		// @0B3: getfield int game.C_100314_lf.field_101395_rc
		// @0B6: sipush -20000 (0xB1E0)
		// @0B9: iadd
		// @0BA: putfield int game.C_100087_n.field_100698_u
		// @0BD: aload #7
		// @0BF: iconst_1
		// @0C0: putfield boolean game.C_100087_n.field_100703_p
		// @0C3: aload #4
		// @0C5: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0C8: bipush 126 (0x7E)
		// @0CA: aload #7
		// @0CC: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0CF: aload #4
		// @0D1: aload #4
		// @0D3: getfield int game.C_100314_lf.field_101373_cb
		// @0D6: putfield int game.C_100314_lf.field_101310_Mb
		// @0D9: iload #8
		// @0DB: ifeq @285
		// @0DE: iconst_0
		// @0DF: aload #4
		// @0E1: getfield int game.C_100314_lf.field_101369_z
		// @0E4: if_icmpge @132
		// @0E7: goto @0EB
		// @0EA: athrow
		// @0EB: new game.C_100087_n
		// @0EE: dup
		// @0EF: bipush 6 (0x06)
		// @0F1: aload #4
		// @0F3: getfield int game.C_100314_lf.field_101369_z
		// @0F6: iconst_m1
		// @0F7: ixor
		// @0F8: aload #4
		// @0FA: getfield int game.C_100314_lf.field_101377_tc
		// @0FD: ldc_w -595249820 (0xdc853564)
		// @100: ishr
		// @101: iconst_m1
		// @102: ixor
		// @103: if_icmplt @10F
		// @106: goto @10A
		// @109: athrow
		// @10A: iconst_m1
		// @10B: goto @110
		// @10E: athrow
		// @10F: iconst_1
		// @110: iconst_2
		// @111: aload_0
		// @112: getfield int game.C_100294_ki.field_106951_E
		// @115: iadd
		// @116: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @119: astore #7
		// @11B: aload #7
		// @11D: iconst_1
		// @11E: putfield boolean game.C_100087_n.field_100703_p
		// @121: aload #4
		// @123: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @126: bipush 123 (0x7B)
		// @128: aload #7
		// @12A: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @12D: iload #8
		// @12F: ifeq @285
		// @132: sipush -15001 (0xC567)
		// @135: iload_2
		// @136: invokestatic java.lang.Math.abs(int)int
		// @139: iconst_m1
		// @13A: ixor
		// @13B: if_icmplt @186
		// @13E: goto @142
		// @141: athrow
		// @142: aload #4
		// @144: getfield int game.C_100314_lf.field_101310_Mb
		// @147: iconst_5
		// @148: if_icmpge @15D
		// @14B: goto @14F
		// @14E: athrow
		// @14F: iload_2
		// @150: invokestatic java.lang.Math.abs(int)int
		// @153: sipush 30000 (0x7530)
		// @156: if_icmplt @186
		// @159: goto @15D
		// @15C: athrow
		// @15D: new game.C_100087_n
		// @160: dup
		// @161: bipush 6 (0x06)
		// @163: iload_3
		// @164: iconst_2
		// @165: aload_0
		// @166: getfield int game.C_100294_ki.field_106951_E
		// @169: iadd
		// @16A: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @16D: astore #7
		// @16F: aload #7
		// @171: iconst_1
		// @172: putfield boolean game.C_100087_n.field_100703_p
		// @175: aload #4
		// @177: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @17A: bipush 123 (0x7B)
		// @17C: aload #7
		// @17E: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @181: iload #8
		// @183: ifeq @285
		// @186: sipush -15001 (0xC567)
		// @189: iload_2
		// @18A: invokestatic java.lang.Math.abs(int)int
		// @18D: iconst_m1
		// @18E: ixor
		// @18F: if_icmpge @1A6
		// @192: goto @196
		// @195: athrow
		// @196: iload_1
		// @197: invokestatic java.lang.Math.abs(int)int
		// @19A: iconst_m1
		// @19B: ixor
		// @19C: sipush -10001 (0xD8EF)
		// @19F: if_icmpgt @1E4
		// @1A2: goto @1A6
		// @1A5: athrow
		// @1A6: sipush -10001 (0xD8EF)
		// @1A9: iload_2
		// @1AA: invokestatic java.lang.Math.abs(int)int
		// @1AD: iconst_m1
		// @1AE: ixor
		// @1AF: if_icmplt @1BA
		// @1B2: goto @1B6
		// @1B5: athrow
		// @1B6: goto @285
		// @1B9: athrow
		// @1BA: new game.C_100087_n
		// @1BD: dup
		// @1BE: bipush 6 (0x06)
		// @1C0: iload_3
		// @1C1: ineg
		// @1C2: iconst_2
		// @1C3: aload_0
		// @1C4: getfield int game.C_100294_ki.field_106951_E
		// @1C7: iadd
		// @1C8: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @1CB: astore #7
		// @1CD: aload #7
		// @1CF: iconst_1
		// @1D0: putfield boolean game.C_100087_n.field_100703_p
		// @1D3: aload #4
		// @1D5: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @1D8: bipush 123 (0x7B)
		// @1DA: aload #7
		// @1DC: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1DF: iload #8
		// @1E1: ifeq @285
		// @1E4: aload #4
		// @1E6: bipush 10 (0x0A)
		// @1E8: putfield int game.C_100314_lf.field_101310_Mb
		// @1EB: new game.C_100087_n
		// @1EE: dup
		// @1EF: bipush 6 (0x06)
		// @1F1: iload_3
		// @1F2: iconst_2
		// @1F3: aload_0
		// @1F4: getfield int game.C_100294_ki.field_106951_E
		// @1F7: iadd
		// @1F8: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @1FB: astore #7
		// @1FD: aload #7
		// @1FF: iconst_1
		// @200: putfield boolean game.C_100087_n.field_100703_p
		// @203: aload #4
		// @205: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @208: bipush 124 (0x7C)
		// @20A: aload #7
		// @20C: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @20F: new game.C_100087_n
		// @212: dup
		// @213: bipush 7 (0x07)
		// @215: iload_3
		// @216: aload_0
		// @217: getfield int game.C_100294_ki.field_106951_E
		// @21A: bipush -4 (0xFC)
		// @21C: isub
		// @21D: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @220: astore #7
		// @222: aload #7
		// @224: iconst_1
		// @225: putfield boolean game.C_100087_n.field_100703_p
		// @228: aload #4
		// @22A: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @22D: bipush 127 (0x7F)
		// @22F: aload #7
		// @231: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @234: new game.C_100087_n
		// @237: dup
		// @238: bipush 6 (0x06)
		// @23A: iload_3
		// @23B: ineg
		// @23C: bipush 25 (0x19)
		// @23E: iconst_4
		// @23F: aload_0
		// @240: getfield int game.C_100294_ki.field_106951_E
		// @243: iadd
		// @244: iadd
		// @245: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @248: astore #7
		// @24A: aload #7
		// @24C: iconst_1
		// @24D: putfield boolean game.C_100087_n.field_100703_p
		// @250: aload #4
		// @252: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @255: bipush 126 (0x7E)
		// @257: aload #7
		// @259: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @25C: new game.C_100087_n
		// @25F: dup
		// @260: bipush 6 (0x06)
		// @262: iconst_0
		// @263: sipush 250 (0x00FA)
		// @266: aload_0
		// @267: getfield int game.C_100294_ki.field_106951_E
		// @26A: iadd
		// @26B: iconst_4
		// @26C: iadd
		// @26D: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @270: astore #7
		// @272: aload #7
		// @274: iconst_1
		// @275: putfield boolean game.C_100087_n.field_100703_p
		// @278: aload #4
		// @27A: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @27D: bipush 124 (0x7C)
		// @27F: aload #7
		// @281: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @284: return
		// @285: ldc_w -50001 (0xffff3caf)
		// @288: iload_2
		// @289: invokestatic java.lang.Math.abs(int)int
		// @28C: iconst_m1
		// @28D: ixor
		// @28E: if_icmple @2B1
		// @291: aload_0
		// @292: iconst_3
		// @293: bipush -98 (0x9E)
		// @295: aload #5
		// @297: aload_0
		// @298: getfield int game.C_100294_ki.field_106964_J
		// @29B: aload #4
		// @29D: bipush 15 (0x0F)
		// @29F: aload_0
		// @2A0: getfield int game.C_100294_ki.field_106951_E
		// @2A3: iadd
		// @2A4: sipush 2600 (0x0A28)
		// @2A7: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @2AA: ifne @2B1
		// @2AD: goto @2B1
		// @2B0: athrow
		// @2B1: iload #6
		// @2B3: bipush 123 (0x7B)
		// @2B5: if_icmpge @2C5
		// @2B8: aload_0
		// @2B9: bipush 68 (0x44)
		// @2BB: bipush 122 (0x7A)
		// @2BD: invokevirtual game.C_100294_ki.func_106929_c(int, byte)boolean
		// @2C0: pop
		// @2C1: goto @2C5
		// @2C4: athrow
		// @2C5: aload_0
		// @2C6: iconst_2
		// @2C7: bipush -128 (0x80)
		// @2C9: aload #5
		// @2CB: aload_0
		// @2CC: getfield int game.C_100294_ki.field_106964_J
		// @2CF: aload #4
		// @2D1: bipush 15 (0x0F)
		// @2D3: aload_0
		// @2D4: getfield int game.C_100294_ki.field_106951_E
		// @2D7: iadd
		// @2D8: sipush 2600 (0x0A28)
		// @2DB: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @2DE: ifeq @2E5
		// @2E1: goto @39F
		// @2E4: athrow
		// @2E5: bipush -2 (0xFE)
		// @2E7: aload #4
		// @2E9: getfield int game.C_100314_lf.field_101310_Mb
		// @2EC: iconst_m1
		// @2ED: ixor
		// @2EE: if_icmpgt @35F
		// @2F1: ldc_w 80000 (0x13880)
		// @2F4: iload_2
		// @2F5: invokestatic java.lang.Math.abs(int)int
		// @2F8: if_icmpge @39F
		// @2FB: goto @2FF
		// @2FE: athrow
		// @2FF: aload #4
		// @301: getfield int game.C_100314_lf.field_101310_Mb
		// @304: iconst_m1
		// @305: ixor
		// @306: iconst_m1
		// @307: if_icmpge @39F
		// @30A: goto @30E
		// @30D: athrow
		// @30E: new game.C_100087_n
		// @311: dup
		// @312: iconst_3
		// @313: iconst_0
		// @314: bipush 30 (0x1E)
		// @316: aload_0
		// @317: getfield int game.C_100294_ki.field_106951_E
		// @31A: iadd
		// @31B: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @31E: astore #7
		// @320: aload #7
		// @322: sipush 20000 (0x4E20)
		// @325: iload_3
		// @326: imul
		// @327: aload #4
		// @329: getfield int game.C_100314_lf.field_101377_tc
		// @32C: iadd
		// @32D: putfield int game.C_100087_n.field_100699_t
		// @330: aload #7
		// @332: iconst_1
		// @333: putfield boolean game.C_100087_n.field_100703_p
		// @336: aload #7
		// @338: aload #4
		// @33A: getfield int game.C_100314_lf.field_101395_rc
		// @33D: sipush 20000 (0x4E20)
		// @340: isub
		// @341: putfield int game.C_100087_n.field_100698_u
		// @344: aload #4
		// @346: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @349: bipush 125 (0x7D)
		// @34B: aload #7
		// @34D: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @350: aload #4
		// @352: aload #4
		// @354: getfield int game.C_100314_lf.field_101373_cb
		// @357: putfield int game.C_100314_lf.field_101310_Mb
		// @35A: iload #8
		// @35C: ifeq @39F
		// @35F: aload_0
		// @360: iconst_1
		// @361: bipush -75 (0xB5)
		// @363: aload #5
		// @365: aload_0
		// @366: getfield int game.C_100294_ki.field_106964_J
		// @369: aload #4
		// @36B: bipush 25 (0x19)
		// @36D: aload_0
		// @36E: getfield int game.C_100294_ki.field_106951_E
		// @371: iadd
		// @372: sipush 1728 (0x06C0)
		// @375: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @378: ifne @39F
		// @37B: goto @37F
		// @37E: athrow
		// @37F: aload_0
		// @380: iconst_0
		// @381: bipush -93 (0xA3)
		// @383: aload #5
		// @385: aload_0
		// @386: getfield int game.C_100294_ki.field_106964_J
		// @389: aload #4
		// @38B: aload_0
		// @38C: getfield int game.C_100294_ki.field_106951_E
		// @38F: bipush 25 (0x19)
		// @391: iadd
		// @392: sipush 4608 (0x1200)
		// @395: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @398: ifne @39F
		// @39B: goto @39F
		// @39E: athrow
		// @39F: goto @418
		// @3A2: astore #7
		// @3A4: aload #7
		// @3A6: new java.lang.StringBuilder
		// @3A9: dup
		// @3AA: invokespecial java.lang.StringBuilder.<init>()void
		// @3AD: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @3B0: bipush 40 (0x28)
		// @3B2: aaload
		// @3B3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B6: iload_1
		// @3B7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3BA: bipush 44 (0x2C)
		// @3BC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3BF: iload_2
		// @3C0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3C3: bipush 44 (0x2C)
		// @3C5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C8: iload_3
		// @3C9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3CC: bipush 44 (0x2C)
		// @3CE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D1: aload #4
		// @3D3: ifnull @3DF
		// @3D6: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @3D9: iconst_1
		// @3DA: aaload
		// @3DB: goto @3E4
		// @3DE: athrow
		// @3DF: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @3E2: iconst_4
		// @3E3: aaload
		// @3E4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E7: bipush 44 (0x2C)
		// @3E9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3EC: aload #5
		// @3EE: ifnull @3FA
		// @3F1: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @3F4: iconst_1
		// @3F5: aaload
		// @3F6: goto @3FF
		// @3F9: athrow
		// @3FA: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @3FD: iconst_4
		// @3FE: aaload
		// @3FF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @402: bipush 44 (0x2C)
		// @404: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @407: iload #6
		// @409: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40C: bipush 41 (0x29)
		// @40E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @411: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @414: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @417: athrow
		// @418: return
	}
	
	private final void func_106914_a(int arg0, int arg1, int arg2, C_100314_lf arg3, int arg4, C_100314_lf arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #11
		// @005: aload #4
		// @007: getfield int game.C_100314_lf.field_101377_tc
		// @00A: iconst_m1
		// @00B: ixor
		// @00C: aload #6
		// @00E: getfield int game.C_100314_lf.field_101377_tc
		// @011: iconst_m1
		// @012: ixor
		// @013: if_icmpne @075
		// @016: aload #4
		// @018: getfield int game.C_100314_lf.field_101309_wb
		// @01B: iconst_m1
		// @01C: ixor
		// @01D: iconst_m1
		// @01E: if_icmpne @075
		// @021: goto @025
		// @024: athrow
		// @025: aload #4
		// @027: getfield int game.C_100314_lf.field_101369_z
		// @02A: ifgt @075
		// @02D: goto @031
		// @030: athrow
		// @031: aload #4
		// @033: getfield boolean game.C_100314_lf.field_101307_pb
		// @036: ifeq @041
		// @039: goto @03D
		// @03C: athrow
		// @03D: goto @075
		// @040: athrow
		// @041: aload #4
		// @043: getfield int game.C_100314_lf.field_101377_tc
		// @046: sipush 4096 (0x1000)
		// @049: if_icmplt @063
		// @04C: aload #4
		// @04E: aload #4
		// @050: getfield int game.C_100314_lf.field_101377_tc
		// @053: sipush 1024 (0x0400)
		// @056: isub
		// @057: putfield int game.C_100314_lf.field_101369_z
		// @05A: iload #11
		// @05C: ifeq @075
		// @05F: goto @063
		// @062: athrow
		// @063: aload #4
		// @065: sipush 1024 (0x0400)
		// @068: aload #4
		// @06A: getfield int game.C_100314_lf.field_101377_tc
		// @06D: iadd
		// @06E: putfield int game.C_100314_lf.field_101369_z
		// @071: goto @075
		// @074: athrow
		// @075: aload #4
		// @077: getfield int game.C_100314_lf.field_101369_z
		// @07A: ifgt @141
		// @07D: sipush -30001 (0x8ACF)
		// @080: iload_3
		// @081: invokestatic java.lang.Math.abs(int)int
		// @084: iconst_m1
		// @085: ixor
		// @086: if_icmplt @115
		// @089: goto @08D
		// @08C: athrow
		// @08D: new game.C_100087_n
		// @090: dup
		// @091: bipush 6 (0x06)
		// @093: iload_2
		// @094: iconst_2
		// @095: aload_0
		// @096: getfield int game.C_100294_ki.field_106951_E
		// @099: iadd
		// @09A: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @09D: astore #7
		// @09F: aload #7
		// @0A1: iconst_1
		// @0A2: putfield boolean game.C_100087_n.field_100703_p
		// @0A5: aload #4
		// @0A7: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0AA: bipush 125 (0x7D)
		// @0AC: aload #7
		// @0AE: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0B1: new game.C_100087_n
		// @0B4: dup
		// @0B5: iconst_3
		// @0B6: iconst_0
		// @0B7: bipush 100 (0x64)
		// @0B9: aload_0
		// @0BA: getfield int game.C_100294_ki.field_106951_E
		// @0BD: iadd
		// @0BE: bipush -4 (0xFC)
		// @0C0: aload #6
		// @0C2: getfield int game.C_100314_lf.field_101377_tc
		// @0C5: aload_0
		// @0C6: getfield int game.C_100294_ki.field_106951_E
		// @0C9: iadd
		// @0CA: aload #4
		// @0CC: getfield int game.C_100314_lf.field_101377_tc
		// @0CF: ineg
		// @0D0: isub
		// @0D1: bipush 100 (0x64)
		// @0D3: irem
		// @0D4: ineg
		// @0D5: iadd
		// @0D6: isub
		// @0D7: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @0DA: astore #7
		// @0DC: aload #7
		// @0DE: iconst_1
		// @0DF: putfield boolean game.C_100087_n.field_100703_p
		// @0E2: aload #7
		// @0E4: aload #4
		// @0E6: getfield int game.C_100314_lf.field_101395_rc
		// @0E9: sipush -20000 (0xB1E0)
		// @0EC: iadd
		// @0ED: putfield int game.C_100087_n.field_100698_u
		// @0F0: aload #7
		// @0F2: aload #6
		// @0F4: getfield int game.C_100314_lf.field_101377_tc
		// @0F7: putfield int game.C_100087_n.field_100699_t
		// @0FA: aload #4
		// @0FC: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0FF: bipush 125 (0x7D)
		// @101: aload #7
		// @103: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @106: aload #4
		// @108: aload #4
		// @10A: getfield int game.C_100314_lf.field_101373_cb
		// @10D: putfield int game.C_100314_lf.field_101310_Mb
		// @110: iload #11
		// @112: ifeq @17F
		// @115: iload_3
		// @116: invokestatic java.lang.Math.abs(int)int
		// @119: sipush 30000 (0x7530)
		// @11C: if_icmpge @17F
		// @11F: goto @123
		// @122: athrow
		// @123: new game.C_100087_n
		// @126: dup
		// @127: bipush 6 (0x06)
		// @129: iload_2
		// @12A: ineg
		// @12B: iconst_2
		// @12C: aload_0
		// @12D: getfield int game.C_100294_ki.field_106951_E
		// @130: iadd
		// @131: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @134: astore #7
		// @136: aload #7
		// @138: iconst_1
		// @139: putfield boolean game.C_100087_n.field_100703_p
		// @13C: iload #11
		// @13E: ifeq @17F
		// @141: new game.C_100087_n
		// @144: dup
		// @145: bipush 6 (0x06)
		// @147: aload #4
		// @149: getfield int game.C_100314_lf.field_101377_tc
		// @14C: ldc_w 1047451428 (0x3e6ed724)
		// @14F: ishr
		// @150: aload #4
		// @152: getfield int game.C_100314_lf.field_101369_z
		// @155: if_icmpge @161
		// @158: goto @15C
		// @15B: athrow
		// @15C: iconst_1
		// @15D: goto @162
		// @160: athrow
		// @161: iconst_m1
		// @162: aload_0
		// @163: getfield int game.C_100294_ki.field_106951_E
		// @166: iconst_2
		// @167: iadd
		// @168: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @16B: astore #7
		// @16D: aload #7
		// @16F: iconst_1
		// @170: putfield boolean game.C_100087_n.field_100703_p
		// @173: aload #4
		// @175: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @178: bipush 124 (0x7C)
		// @17A: aload #7
		// @17C: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @17F: iconst_m1
		// @180: istore #7
		// @182: iload #5
		// @184: bipush 101 (0x65)
		// @186: if_icmpgt @18A
		// @189: return
		// @18A: iconst_0
		// @18B: istore #8
		// @18D: iload #8
		// @18F: aload #4
		// @191: getfield int[] game.C_100314_lf.field_101416_ab
		// @194: arraylength
		// @195: if_icmpge @1C8
		// @198: bipush -14 (0xF2)
		// @19A: aload #4
		// @19C: getfield int[] game.C_100314_lf.field_101416_ab
		// @19F: iload #8
		// @1A1: iaload
		// @1A2: iconst_m1
		// @1A3: ixor
		// @1A4: iload #11
		// @1A6: ifne @1CD
		// @1A9: if_icmpeq @1B3
		// @1AC: goto @1B0
		// @1AF: athrow
		// @1B0: goto @1BC
		// @1B3: iload #8
		// @1B5: istore #7
		// @1B7: iload #11
		// @1B9: ifeq @1C8
		// @1BC: iinc #8 +1
		// @1BF: iload #11
		// @1C1: ifeq @18D
		// @1C4: goto @1C8
		// @1C7: athrow
		// @1C8: iload #7
		// @1CA: iconst_m1
		// @1CB: ixor
		// @1CC: iconst_m1
		// @1CD: if_icmpgt @209
		// @1D0: aload_0
		// @1D1: iload #7
		// @1D3: bipush -119 (0x89)
		// @1D5: aload #6
		// @1D7: aload_0
		// @1D8: getfield int game.C_100294_ki.field_106964_J
		// @1DB: aload #4
		// @1DD: aload_0
		// @1DE: getfield int game.C_100294_ki.field_106951_E
		// @1E1: iconst_5
		// @1E2: iadd
		// @1E3: aload #6
		// @1E5: getfield int game.C_100314_lf.field_101377_tc
		// @1E8: aload_0
		// @1E9: getfield int game.C_100294_ki.field_106951_E
		// @1EC: iadd
		// @1ED: aload #4
		// @1EF: getfield int game.C_100314_lf.field_101377_tc
		// @1F2: ineg
		// @1F3: isub
		// @1F4: bipush 100 (0x64)
		// @1F6: irem
		// @1F7: iadd
		// @1F8: sipush 2600 (0x0A28)
		// @1FB: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @1FE: ifeq @209
		// @201: goto @205
		// @204: athrow
		// @205: goto @2C7
		// @208: athrow
		// @209: iload_3
		// @20A: invokestatic java.lang.Math.abs(int)int
		// @20D: ldc_w 40000 (0x9c40)
		// @210: if_icmplt @217
		// @213: goto @2C7
		// @216: athrow
		// @217: new game.C_100087_n
		// @21A: dup
		// @21B: iconst_0
		// @21C: iconst_0
		// @21D: aload_0
		// @21E: getfield int game.C_100294_ki.field_106951_E
		// @221: iconst_5
		// @222: aload #6
		// @224: getfield int game.C_100314_lf.field_101377_tc
		// @227: aload_0
		// @228: getfield int game.C_100294_ki.field_106951_E
		// @22B: aload #4
		// @22D: getfield int game.C_100314_lf.field_101377_tc
		// @230: iadd
		// @231: iadd
		// @232: bipush 100 (0x64)
		// @234: irem
		// @235: ineg
		// @236: isub
		// @237: iadd
		// @238: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @23B: astore #8
		// @23D: aload #8
		// @23F: aload #6
		// @241: getfield int game.C_100314_lf.field_101377_tc
		// @244: putfield int game.C_100087_n.field_100699_t
		// @247: aload #8
		// @249: aload #6
		// @24B: getfield int game.C_100314_lf.field_101395_rc
		// @24E: putfield int game.C_100087_n.field_100698_u
		// @251: iload_3
		// @252: i2d
		// @253: iload_1
		// @254: ineg
		// @255: i2d
		// @256: invokestatic java.lang.Math.atan2(double, double)double
		// @259: dstore #9
		// @25B: aload #8
		// @25D: ldc2_w 65536.0
		// @260: dload #9
		// @262: dmul
		// @263: ldc2_w 6.283185307179586
		// @266: ddiv
		// @267: d2i
		// @268: putfield int game.C_100087_n.field_100693_m
		// @26B: aload #8
		// @26D: iconst_1
		// @26E: putfield boolean game.C_100087_n.field_100703_p
		// @271: iconst_0
		// @272: iload_2
		// @273: if_icmpgt @29A
		// @276: sipush -16384 (0xC000)
		// @279: aload #8
		// @27B: getfield int game.C_100087_n.field_100693_m
		// @27E: if_icmple @2BB
		// @281: goto @285
		// @284: athrow
		// @285: aload #8
		// @287: dup
		// @288: getfield int game.C_100087_n.field_100693_m
		// @28B: ldc 65536 (0x10000)
		// @28D: iadd
		// @28E: putfield int game.C_100087_n.field_100693_m
		// @291: iload #11
		// @293: ifeq @2BB
		// @296: goto @29A
		// @299: athrow
		// @29A: aload #8
		// @29C: getfield int game.C_100087_n.field_100693_m
		// @29F: iconst_m1
		// @2A0: ixor
		// @2A1: sipush -16385 (0xBFFF)
		// @2A4: if_icmpge @2BB
		// @2A7: goto @2AB
		// @2AA: athrow
		// @2AB: aload #8
		// @2AD: dup
		// @2AE: getfield int game.C_100087_n.field_100693_m
		// @2B1: ldc 65536 (0x10000)
		// @2B3: isub
		// @2B4: putfield int game.C_100087_n.field_100693_m
		// @2B7: goto @2BB
		// @2BA: athrow
		// @2BB: aload #4
		// @2BD: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @2C0: bipush 123 (0x7B)
		// @2C2: aload #8
		// @2C4: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2C7: goto @340
		// @2CA: astore #7
		// @2CC: aload #7
		// @2CE: new java.lang.StringBuilder
		// @2D1: dup
		// @2D2: invokespecial java.lang.StringBuilder.<init>()void
		// @2D5: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2D8: bipush 49 (0x31)
		// @2DA: aaload
		// @2DB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2DE: iload_1
		// @2DF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2E2: bipush 44 (0x2C)
		// @2E4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E7: iload_2
		// @2E8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2EB: bipush 44 (0x2C)
		// @2ED: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2F0: iload_3
		// @2F1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F4: bipush 44 (0x2C)
		// @2F6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2F9: aload #4
		// @2FB: ifnull @307
		// @2FE: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @301: iconst_1
		// @302: aaload
		// @303: goto @30C
		// @306: athrow
		// @307: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @30A: iconst_4
		// @30B: aaload
		// @30C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30F: bipush 44 (0x2C)
		// @311: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @314: iload #5
		// @316: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @319: bipush 44 (0x2C)
		// @31B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @31E: aload #6
		// @320: ifnull @32C
		// @323: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @326: iconst_1
		// @327: aaload
		// @328: goto @331
		// @32B: athrow
		// @32C: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @32F: iconst_4
		// @330: aaload
		// @331: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @334: bipush 41 (0x29)
		// @336: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @339: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @33C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @33F: athrow
		// @340: return
	}
	
	private final int func_106896_a(C_100314_lf arg0, int arg1, int arg2, C_100314_lf arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #16
		// @005: getstatic int game.C_100218_am.field_103115_N
		// @008: iconst_m1
		// @009: ixor
		// @00A: bipush -11 (0xF5)
		// @00C: if_icmpne @021
		// @00F: iconst_m1
		// @010: getstatic int game.C_100194_rd.field_103072_v
		// @013: iconst_m1
		// @014: ixor
		// @015: if_icmpne @021
		// @018: goto @01C
		// @01B: athrow
		// @01C: iconst_1
		// @01D: goto @022
		// @020: athrow
		// @021: iconst_0
		// @022: istore #7
		// @024: iload #6
		// @026: sipush 11460 (0x2CC4)
		// @029: if_icmpeq @036
		// @02C: aload_0
		// @02D: bipush -5 (0xFB)
		// @02F: putfield int game.C_100294_ki.field_106987_m
		// @032: goto @036
		// @035: athrow
		// @036: aload #4
		// @038: getfield int game.C_100314_lf.field_101395_rc
		// @03B: ldc_w -55000 (0xffff2928)
		// @03E: if_icmpgt @077
		// @041: aload_0
		// @042: getfield boolean game.C_100294_ki.field_106976_Z
		// @045: ifeq @528
		// @048: goto @04C
		// @04B: athrow
		// @04C: aload_0
		// @04D: getfield boolean game.C_100294_ki.field_106963_eb
		// @050: ifeq @528
		// @053: goto @057
		// @056: athrow
		// @057: aload #4
		// @059: getfield int game.C_100314_lf.field_101395_rc
		// @05C: iconst_m1
		// @05D: ixor
		// @05E: ldc_w 199999 (0x30d3f)
		// @061: if_icmpge @528
		// @064: goto @068
		// @067: athrow
		// @068: iconst_0
		// @069: aload_0
		// @06A: getfield int game.C_100294_ki.field_106951_E
		// @06D: bipush 15 (0x0F)
		// @06F: iand
		// @070: if_icmpne @528
		// @073: goto @077
		// @076: athrow
		// @077: aload #4
		// @079: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @07C: bipush 93 (0x5D)
		// @07E: invokevirtual game.C_100202_qi.func_105895_d(byte)boolean
		// @081: ifne @08C
		// @084: goto @088
		// @087: athrow
		// @088: goto @528
		// @08B: athrow
		// @08C: new game.C_100087_n
		// @08F: dup
		// @090: iconst_3
		// @091: iconst_0
		// @092: bipush 10 (0x0A)
		// @094: aload_0
		// @095: getfield int game.C_100294_ki.field_106951_E
		// @098: iadd
		// @099: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @09C: astore #8
		// @09E: aload #8
		// @0A0: aload_0
		// @0A1: getfield int game.C_100294_ki.field_106951_E
		// @0A4: bipush 77 (0x4D)
		// @0A6: imul
		// @0A7: aload_0
		// @0A8: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0AB: iload #6
		// @0AD: sipush 30384 (0x76B0)
		// @0B0: ixor
		// @0B1: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @0B4: iconst_4
		// @0B5: idiv
		// @0B6: irem
		// @0B7: aload_0
		// @0B8: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0BB: iload #6
		// @0BD: sipush 11696 (0x2DB0)
		// @0C0: iadd
		// @0C1: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @0C4: bipush 8 (0x08)
		// @0C6: idiv
		// @0C7: isub
		// @0C8: ldc_w -619637436 (0xdb111544)
		// @0CB: ishl
		// @0CC: aload_1
		// @0CD: getfield int game.C_100314_lf.field_101377_tc
		// @0D0: ineg
		// @0D1: isub
		// @0D2: putfield int game.C_100087_n.field_100699_t
		// @0D5: sipush 5000 (0x1388)
		// @0D8: istore #9
		// @0DA: iconst_1
		// @0DB: istore #10
		// @0DD: iload #7
		// @0DF: ifne @220
		// @0E2: iconst_m1
		// @0E3: aload #4
		// @0E5: getfield int[] game.C_100314_lf.field_101416_ab
		// @0E8: arraylength
		// @0E9: iconst_m1
		// @0EA: ixor
		// @0EB: if_icmpne @104
		// @0EE: goto @0F2
		// @0F1: athrow
		// @0F2: aload #4
		// @0F4: getfield int[] game.C_100314_lf.field_101416_ab
		// @0F7: iconst_0
		// @0F8: iaload
		// @0F9: iconst_m1
		// @0FA: ixor
		// @0FB: bipush -2 (0xFE)
		// @0FD: if_icmpeq @173
		// @100: goto @104
		// @103: athrow
		// @104: aload #8
		// @106: getfield int game.C_100087_n.field_100699_t
		// @109: iconst_m1
		// @10A: ixor
		// @10B: aload #4
		// @10D: getfield int game.C_100314_lf.field_101377_tc
		// @110: iload #9
		// @112: isub
		// @113: iconst_m1
		// @114: ixor
		// @115: if_icmpgt @120
		// @118: goto @11C
		// @11B: athrow
		// @11C: goto @12D
		// @11F: athrow
		// @120: aload #8
		// @122: aload #4
		// @124: getfield int game.C_100314_lf.field_101377_tc
		// @127: iload #9
		// @129: isub
		// @12A: putfield int game.C_100087_n.field_100699_t
		// @12D: iload #9
		// @12F: aload #4
		// @131: getfield int game.C_100314_lf.field_101377_tc
		// @134: iadd
		// @135: aload #8
		// @137: getfield int game.C_100087_n.field_100699_t
		// @13A: if_icmplt @141
		// @13D: goto @14E
		// @140: athrow
		// @141: aload #8
		// @143: iload #9
		// @145: aload #4
		// @147: getfield int game.C_100314_lf.field_101377_tc
		// @14A: iadd
		// @14B: putfield int game.C_100087_n.field_100699_t
		// @14E: aload #8
		// @150: aload_1
		// @151: getfield int game.C_100314_lf.field_101395_rc
		// @154: sipush 30000 (0x7530)
		// @157: isub
		// @158: putfield int game.C_100087_n.field_100698_u
		// @15B: iload_2
		// @15C: invokestatic java.lang.Math.abs(int)int
		// @15F: iconst_m1
		// @160: ixor
		// @161: ldc_w -80001 (0xfffec77f)
		// @164: if_icmplt @16B
		// @167: goto @2CE
		// @16A: athrow
		// @16B: iconst_0
		// @16C: istore #10
		// @16E: iload #16
		// @170: ifeq @2CE
		// @173: ldc_w 100000 (0x186a0)
		// @176: istore #9
		// @178: aload #4
		// @17A: getfield int game.C_100314_lf.field_101377_tc
		// @17D: iconst_m1
		// @17E: ixor
		// @17F: aload_1
		// @180: getfield int game.C_100314_lf.field_101377_tc
		// @183: iconst_m1
		// @184: ixor
		// @185: if_icmpgt @1D7
		// @188: aload #8
		// @18A: getfield int game.C_100087_n.field_100699_t
		// @18D: iload #9
		// @18F: aload_1
		// @190: getfield int game.C_100314_lf.field_101377_tc
		// @193: iadd
		// @194: if_icmplt @19F
		// @197: goto @19B
		// @19A: athrow
		// @19B: goto @1AB
		// @19E: athrow
		// @19F: aload #8
		// @1A1: iload #9
		// @1A3: aload_1
		// @1A4: getfield int game.C_100314_lf.field_101377_tc
		// @1A7: iadd
		// @1A8: putfield int game.C_100087_n.field_100699_t
		// @1AB: aload #8
		// @1AD: getfield int game.C_100087_n.field_100699_t
		// @1B0: aload_0
		// @1B1: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1B4: sipush 23156 (0x5A74)
		// @1B7: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @1BA: ldc_w -1567063708 (0xa2988164)
		// @1BD: ishl
		// @1BE: if_icmpgt @1C5
		// @1C1: goto @213
		// @1C4: athrow
		// @1C5: aload #8
		// @1C7: iload #9
		// @1C9: ineg
		// @1CA: aload_1
		// @1CB: getfield int game.C_100314_lf.field_101377_tc
		// @1CE: iadd
		// @1CF: putfield int game.C_100087_n.field_100699_t
		// @1D2: iload #16
		// @1D4: ifeq @213
		// @1D7: aload #8
		// @1D9: getfield int game.C_100087_n.field_100699_t
		// @1DC: aload_1
		// @1DD: getfield int game.C_100314_lf.field_101377_tc
		// @1E0: iload #9
		// @1E2: ineg
		// @1E3: iadd
		// @1E4: if_icmple @1FB
		// @1E7: goto @1EB
		// @1EA: athrow
		// @1EB: aload #8
		// @1ED: aload_1
		// @1EE: getfield int game.C_100314_lf.field_101377_tc
		// @1F1: iload #9
		// @1F3: isub
		// @1F4: putfield int game.C_100087_n.field_100699_t
		// @1F7: goto @1FB
		// @1FA: athrow
		// @1FB: aload #8
		// @1FD: getfield int game.C_100087_n.field_100699_t
		// @200: ifge @213
		// @203: aload #8
		// @205: iload #9
		// @207: aload_1
		// @208: getfield int game.C_100314_lf.field_101377_tc
		// @20B: iadd
		// @20C: putfield int game.C_100087_n.field_100699_t
		// @20F: goto @213
		// @212: athrow
		// @213: aload #8
		// @215: ldc_w -60000 (0xffff15a0)
		// @218: putfield int game.C_100087_n.field_100698_u
		// @21B: iload #16
		// @21D: ifeq @2CE
		// @220: ldc 50000 (0xc350)
		// @222: istore #9
		// @224: aload #4
		// @226: getfield int game.C_100314_lf.field_101377_tc
		// @229: aload_1
		// @22A: getfield int game.C_100314_lf.field_101377_tc
		// @22D: if_icmpge @274
		// @230: aload_1
		// @231: getfield int game.C_100314_lf.field_101377_tc
		// @234: iload #9
		// @236: isub
		// @237: aload #8
		// @239: getfield int game.C_100087_n.field_100699_t
		// @23C: if_icmpge @254
		// @23F: goto @243
		// @242: athrow
		// @243: aload #8
		// @245: aload_1
		// @246: getfield int game.C_100314_lf.field_101377_tc
		// @249: iload #9
		// @24B: ineg
		// @24C: iadd
		// @24D: putfield int game.C_100087_n.field_100699_t
		// @250: goto @254
		// @253: athrow
		// @254: aload #8
		// @256: getfield int game.C_100087_n.field_100699_t
		// @259: iconst_m1
		// @25A: ixor
		// @25B: iconst_m1
		// @25C: if_icmpgt @263
		// @25F: goto @2C6
		// @262: athrow
		// @263: aload #8
		// @265: iload #9
		// @267: aload_1
		// @268: getfield int game.C_100314_lf.field_101377_tc
		// @26B: iadd
		// @26C: putfield int game.C_100087_n.field_100699_t
		// @26F: iload #16
		// @271: ifeq @2C6
		// @274: aload_1
		// @275: getfield int game.C_100314_lf.field_101377_tc
		// @278: iload #9
		// @27A: ineg
		// @27B: isub
		// @27C: iconst_m1
		// @27D: ixor
		// @27E: aload #8
		// @280: getfield int game.C_100087_n.field_100699_t
		// @283: iconst_m1
		// @284: ixor
		// @285: if_icmpge @29C
		// @288: goto @28C
		// @28B: athrow
		// @28C: aload #8
		// @28E: iload #9
		// @290: aload_1
		// @291: getfield int game.C_100314_lf.field_101377_tc
		// @294: iadd
		// @295: putfield int game.C_100087_n.field_100699_t
		// @298: goto @29C
		// @29B: athrow
		// @29C: aload #8
		// @29E: getfield int game.C_100087_n.field_100699_t
		// @2A1: iconst_m1
		// @2A2: ixor
		// @2A3: aload_0
		// @2A4: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @2A7: sipush 23156 (0x5A74)
		// @2AA: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @2AD: ldc_w 1276342340 (0x4c137044)
		// @2B0: ishl
		// @2B1: iconst_m1
		// @2B2: ixor
		// @2B3: if_icmpge @2C6
		// @2B6: aload #8
		// @2B8: aload_1
		// @2B9: getfield int game.C_100314_lf.field_101377_tc
		// @2BC: iload #9
		// @2BE: isub
		// @2BF: putfield int game.C_100087_n.field_100699_t
		// @2C2: goto @2C6
		// @2C5: athrow
		// @2C6: aload #8
		// @2C8: ldc_w -60000 (0xffff15a0)
		// @2CB: putfield int game.C_100087_n.field_100698_u
		// @2CE: aload_0
		// @2CF: getfield boolean game.C_100294_ki.field_106976_Z
		// @2D2: ifeq @335
		// @2D5: aload_0
		// @2D6: getfield boolean game.C_100294_ki.field_106963_eb
		// @2D9: ifne @2E4
		// @2DC: goto @2E0
		// @2DF: athrow
		// @2E0: goto @335
		// @2E3: athrow
		// @2E4: aload #8
		// @2E6: sipush -5000 (0xEC78)
		// @2E9: aload #4
		// @2EB: getfield int game.C_100314_lf.field_101395_rc
		// @2EE: iadd
		// @2EF: putfield int game.C_100087_n.field_100698_u
		// @2F2: ldc_w 198999 (0x30957)
		// @2F5: aload #4
		// @2F7: getfield int game.C_100314_lf.field_101395_rc
		// @2FA: iconst_m1
		// @2FB: ixor
		// @2FC: if_icmplt @303
		// @2FF: goto @335
		// @302: athrow
		// @303: aload #4
		// @305: iconst_1
		// @306: putfield boolean game.C_100314_lf.field_101326_I
		// @309: aload #4
		// @30B: iload #6
		// @30D: sipush -11415 (0xD369)
		// @310: iadd
		// @311: invokevirtual game.C_100314_lf.func_100583_c(int)void
		// @314: getstatic java.io.PrintStream java.lang.System.out
		// @317: new java.lang.StringBuilder
		// @31A: dup
		// @31B: invokespecial java.lang.StringBuilder.<init>()void
		// @31E: aload #4
		// @320: getfield int game.C_100314_lf.field_101347_Gb
		// @323: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @326: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @329: bipush 29 (0x1D)
		// @32B: aaload
		// @32C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @32F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @332: invokevirtual java.io.PrintStream.println(java.lang.String)void
		// @335: aload #8
		// @337: iconst_1
		// @338: putfield boolean game.C_100087_n.field_100703_p
		// @33B: aload #4
		// @33D: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @340: bipush 125 (0x7D)
		// @342: aload #8
		// @344: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @347: aload #4
		// @349: aload #4
		// @34B: getfield int game.C_100314_lf.field_101373_cb
		// @34E: putfield int game.C_100314_lf.field_101310_Mb
		// @351: aload #4
		// @353: getfield int[] game.C_100314_lf.field_101416_ab
		// @356: arraylength
		// @357: iconst_m1
		// @358: ixor
		// @359: iconst_m1
		// @35A: if_icmpge @37A
		// @35D: new game.C_100087_n
		// @360: dup
		// @361: iconst_0
		// @362: aload #4
		// @364: getfield int[] game.C_100314_lf.field_101416_ab
		// @367: iconst_0
		// @368: iaload
		// @369: bipush 20 (0x14)
		// @36B: aload_0
		// @36C: getfield int game.C_100294_ki.field_106951_E
		// @36F: iadd
		// @370: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @373: astore #8
		// @375: iload #16
		// @377: ifeq @37D
		// @37A: iconst_0
		// @37B: istore #10
		// @37D: iload #10
		// @37F: ifne @386
		// @382: goto @528
		// @385: athrow
		// @386: iconst_1
		// @387: aload #4
		// @389: getfield int[] game.C_100314_lf.field_101416_ab
		// @38C: iconst_0
		// @38D: iaload
		// @38E: if_icmpeq @4B1
		// @391: iload_2
		// @392: i2d
		// @393: iload #5
		// @395: ineg
		// @396: i2d
		// @397: invokestatic java.lang.Math.atan2(double, double)double
		// @39A: dstore #11
		// @39C: aload #8
		// @39E: ldc2_w 65536.0
		// @3A1: dload #11
		// @3A3: dmul
		// @3A4: ldc2_w 6.283185307179586
		// @3A7: ddiv
		// @3A8: d2i
		// @3A9: putfield int game.C_100087_n.field_100693_m
		// @3AC: aload #4
		// @3AE: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @3B1: aload #4
		// @3B3: iconst_0
		// @3B4: anewarray game.C_100327_ib
		// @3B7: aload #8
		// @3B9: getfield int game.C_100087_n.field_100693_m
		// @3BC: iload_3
		// @3BD: imul
		// @3BE: aload #4
		// @3C0: getfield int[] game.C_100314_lf.field_101416_ab
		// @3C3: iconst_0
		// @3C4: iaload
		// @3C5: bipush -121 (0x87)
		// @3C7: invokevirtual game.C_100327_ib.func_102448_a(game.C_100314_lf, game.C_100327_ib[], int, int, int)game.C_100327_ib[]
		// @3CA: astore #13
		// @3CC: aload #4
		// @3CE: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @3D1: iload #6
		// @3D3: sipush -11414 (0xD36A)
		// @3D6: ixor
		// @3D7: iconst_0
		// @3D8: iconst_0
		// @3D9: iload_3
		// @3DA: invokevirtual game.C_100327_ib.func_102438_a(int, int, int, int)void
		// @3DD: iconst_0
		// @3DE: istore #14
		// @3E0: iconst_0
		// @3E1: istore #15
		// @3E3: aload #13
		// @3E5: arraylength
		// @3E6: iload #15
		// @3E8: if_icmple @409
		// @3EB: iload #14
		// @3ED: aload #13
		// @3EF: iload #15
		// @3F1: aaload
		// @3F2: getfield int game.C_100327_ib.field_102500_t
		// @3F5: iadd
		// @3F6: istore #14
		// @3F8: iinc #15 +1
		// @3FB: iload #16
		// @3FD: ifne @414
		// @400: iload #16
		// @402: ifeq @3E3
		// @405: goto @409
		// @408: athrow
		// @409: iconst_0
		// @40A: aload #13
		// @40C: arraylength
		// @40D: if_icmplt @414
		// @410: goto @41F
		// @413: athrow
		// @414: iload #5
		// @416: iload #14
		// @418: aload #13
		// @41A: arraylength
		// @41B: idiv
		// @41C: isub
		// @41D: istore #5
		// @41F: iload_2
		// @420: i2d
		// @421: iload #5
		// @423: ineg
		// @424: i2d
		// @425: invokestatic java.lang.Math.atan2(double, double)double
		// @428: dstore #11
		// @42A: aload #8
		// @42C: ldc2_w 65536.0
		// @42F: dload #11
		// @431: dmul
		// @432: ldc2_w 6.283185307179586
		// @435: ddiv
		// @436: d2i
		// @437: putfield int game.C_100087_n.field_100693_m
		// @43A: iconst_0
		// @43B: iload_3
		// @43C: if_icmple @465
		// @43F: sipush -16385 (0xBFFF)
		// @442: aload #8
		// @444: getfield int game.C_100087_n.field_100693_m
		// @447: iconst_m1
		// @448: ixor
		// @449: if_icmple @484
		// @44C: goto @450
		// @44F: athrow
		// @450: aload #8
		// @452: dup
		// @453: getfield int game.C_100087_n.field_100693_m
		// @456: ldc 65536 (0x10000)
		// @458: isub
		// @459: putfield int game.C_100087_n.field_100693_m
		// @45C: iload #16
		// @45E: ifeq @484
		// @461: goto @465
		// @464: athrow
		// @465: aload #8
		// @467: getfield int game.C_100087_n.field_100693_m
		// @46A: sipush -16384 (0xC000)
		// @46D: if_icmplt @478
		// @470: goto @474
		// @473: athrow
		// @474: goto @484
		// @477: athrow
		// @478: aload #8
		// @47A: dup
		// @47B: getfield int game.C_100087_n.field_100693_m
		// @47E: ldc 65536 (0x10000)
		// @480: iadd
		// @481: putfield int game.C_100087_n.field_100693_m
		// @484: aload #8
		// @486: aload_1
		// @487: getfield int game.C_100314_lf.field_101395_rc
		// @48A: putfield int game.C_100087_n.field_100698_u
		// @48D: aload #8
		// @48F: aload_1
		// @490: getfield int game.C_100314_lf.field_101377_tc
		// @493: putfield int game.C_100087_n.field_100699_t
		// @496: aload #8
		// @498: iconst_1
		// @499: putfield boolean game.C_100087_n.field_100703_p
		// @49C: aload #4
		// @49E: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @4A1: iload #6
		// @4A3: sipush -11334 (0xD3BA)
		// @4A6: iadd
		// @4A7: aload #8
		// @4A9: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @4AC: iload #16
		// @4AE: ifeq @528
		// @4B1: new game.C_100087_n
		// @4B4: dup
		// @4B5: iconst_0
		// @4B6: aload #4
		// @4B8: getfield int[] game.C_100314_lf.field_101416_ab
		// @4BB: iconst_1
		// @4BC: iaload
		// @4BD: bipush 25 (0x19)
		// @4BF: aload_0
		// @4C0: getfield int game.C_100294_ki.field_106951_E
		// @4C3: aload_1
		// @4C4: getfield int game.C_100314_lf.field_101377_tc
		// @4C7: aload #4
		// @4C9: getfield int game.C_100314_lf.field_101377_tc
		// @4CC: ineg
		// @4CD: isub
		// @4CE: iadd
		// @4CF: bipush 50 (0x32)
		// @4D1: irem
		// @4D2: iconst_4
		// @4D3: iadd
		// @4D4: aload_0
		// @4D5: getfield int game.C_100294_ki.field_106951_E
		// @4D8: iadd
		// @4D9: iadd
		// @4DA: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @4DD: astore #8
		// @4DF: aload #8
		// @4E1: aload_1
		// @4E2: getfield int game.C_100314_lf.field_101395_rc
		// @4E5: putfield int game.C_100087_n.field_100698_u
		// @4E8: aload #8
		// @4EA: aload_1
		// @4EB: getfield int game.C_100314_lf.field_101377_tc
		// @4EE: putfield int game.C_100087_n.field_100699_t
		// @4F1: sipush 2500 (0x09C4)
		// @4F4: istore #11
		// @4F6: iconst_0
		// @4F7: istore #12
		// @4F9: sipush 8192 (0x2000)
		// @4FC: istore #13
		// @4FE: ldc_w 32768 (0x8000)
		// @501: istore #14
		// @503: aload_0
		// @504: iload_3
		// @505: iconst_1
		// @506: iload #14
		// @508: iload_2
		// @509: iload #5
		// @50B: iload #11
		// @50D: iload #12
		// @50F: aload #8
		// @511: iload #13
		// @513: invokespecial game.C_100294_ki.func_106925_a(int, boolean, int, int, int, int, int, game.C_100087_n, int)void
		// @516: aload #8
		// @518: iconst_1
		// @519: putfield boolean game.C_100087_n.field_100703_p
		// @51C: aload #4
		// @51E: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @521: bipush 124 (0x7C)
		// @523: aload #8
		// @525: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @528: iload #5
		// @52A: ireturn
		// @52B: astore #7
		// @52D: aload #7
		// @52F: new java.lang.StringBuilder
		// @532: dup
		// @533: invokespecial java.lang.StringBuilder.<init>()void
		// @536: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @539: bipush 28 (0x1C)
		// @53B: aaload
		// @53C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @53F: aload_1
		// @540: ifnull @54C
		// @543: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @546: iconst_1
		// @547: aaload
		// @548: goto @551
		// @54B: athrow
		// @54C: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @54F: iconst_4
		// @550: aaload
		// @551: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @554: bipush 44 (0x2C)
		// @556: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @559: iload_2
		// @55A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @55D: bipush 44 (0x2C)
		// @55F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @562: iload_3
		// @563: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @566: bipush 44 (0x2C)
		// @568: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56B: aload #4
		// @56D: ifnull @579
		// @570: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @573: iconst_1
		// @574: aaload
		// @575: goto @57E
		// @578: athrow
		// @579: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @57C: iconst_4
		// @57D: aaload
		// @57E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @581: bipush 44 (0x2C)
		// @583: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @586: iload #5
		// @588: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @58B: bipush 44 (0x2C)
		// @58D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @590: iload #6
		// @592: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @595: bipush 41 (0x29)
		// @597: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @59A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @59D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5A0: athrow
	}
	
	private final void func_106919_a(int arg0, int arg1, C_100314_lf arg2, int arg3, boolean arg4, C_100314_lf arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: iload #5
		// @007: ifeq @01B
		// @00A: iconst_0
		// @00B: bipush 92 (0x5C)
		// @00D: bipush -36 (0xDC)
		// @00F: bipush 121 (0x79)
		// @011: bipush 29 (0x1D)
		// @013: invokestatic game.C_100294_ki.func_106898_a(int, int, int, int, int)game.C_100187_rk
		// @016: pop
		// @017: goto @01B
		// @01A: athrow
		// @01B: iconst_0
		// @01C: aload #6
		// @01E: getfield int game.C_100314_lf.field_101369_z
		// @021: if_icmplt @19F
		// @024: iload #4
		// @026: invokestatic java.lang.Math.abs(int)int
		// @029: ldc_w 40000 (0x9c40)
		// @02C: if_icmplt @09B
		// @02F: goto @033
		// @032: athrow
		// @033: ldc_w -50001 (0xffff3caf)
		// @036: iload #4
		// @038: invokestatic java.lang.Math.abs(int)int
		// @03B: iconst_m1
		// @03C: ixor
		// @03D: if_icmpge @09B
		// @040: goto @044
		// @043: athrow
		// @044: aload #6
		// @046: getfield int game.C_100314_lf.field_101310_Mb
		// @049: iconst_m1
		// @04A: ixor
		// @04B: iconst_m1
		// @04C: if_icmpge @09B
		// @04F: goto @053
		// @052: athrow
		// @053: new game.C_100087_n
		// @056: dup
		// @057: iconst_3
		// @058: iconst_0
		// @059: aload_0
		// @05A: getfield int game.C_100294_ki.field_106951_E
		// @05D: bipush -15 (0xF1)
		// @05F: isub
		// @060: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @063: astore #7
		// @065: aload #7
		// @067: sipush -20000 (0xB1E0)
		// @06A: aload #6
		// @06C: getfield int game.C_100314_lf.field_101395_rc
		// @06F: iadd
		// @070: putfield int game.C_100087_n.field_100698_u
		// @073: aload #7
		// @075: iconst_1
		// @076: putfield boolean game.C_100087_n.field_100703_p
		// @079: aload #7
		// @07B: iload_2
		// @07C: sipush 20000 (0x4E20)
		// @07F: imul
		// @080: ineg
		// @081: aload #6
		// @083: getfield int game.C_100314_lf.field_101377_tc
		// @086: iadd
		// @087: putfield int game.C_100087_n.field_100699_t
		// @08A: aload #6
		// @08C: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @08F: bipush 123 (0x7B)
		// @091: aload #7
		// @093: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @096: iload #8
		// @098: ifeq @1D9
		// @09B: iload #4
		// @09D: invokestatic java.lang.Math.abs(int)int
		// @0A0: iconst_m1
		// @0A1: ixor
		// @0A2: sipush -10001 (0xD8EF)
		// @0A5: if_icmpgt @0F1
		// @0A8: goto @0AC
		// @0AB: athrow
		// @0AC: aload_3
		// @0AD: getfield boolean game.C_100314_lf.field_101307_pb
		// @0B0: ifeq @0C8
		// @0B3: goto @0B7
		// @0B6: athrow
		// @0B7: ldc_w -40001 (0xffff63bf)
		// @0BA: iload #4
		// @0BC: invokestatic java.lang.Math.abs(int)int
		// @0BF: iconst_m1
		// @0C0: ixor
		// @0C1: if_icmplt @0F1
		// @0C4: goto @0C8
		// @0C7: athrow
		// @0C8: new game.C_100087_n
		// @0CB: dup
		// @0CC: bipush 6 (0x06)
		// @0CE: iload_2
		// @0CF: aload_0
		// @0D0: getfield int game.C_100294_ki.field_106951_E
		// @0D3: iconst_2
		// @0D4: iadd
		// @0D5: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @0D8: astore #7
		// @0DA: aload #7
		// @0DC: iconst_1
		// @0DD: putfield boolean game.C_100087_n.field_100703_p
		// @0E0: aload #6
		// @0E2: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0E5: bipush 126 (0x7E)
		// @0E7: aload #7
		// @0E9: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0EC: iload #8
		// @0EE: ifeq @1D9
		// @0F1: iload #4
		// @0F3: invokestatic java.lang.Math.abs(int)int
		// @0F6: sipush 10000 (0x2710)
		// @0F9: if_icmpge @1D9
		// @0FC: goto @100
		// @0FF: athrow
		// @100: aload_3
		// @101: getfield boolean game.C_100314_lf.field_101307_pb
		// @104: ifne @1D9
		// @107: goto @10B
		// @10A: athrow
		// @10B: aload #6
		// @10D: getfield boolean game.C_100314_lf.field_101391_lb
		// @110: ifne @11C
		// @113: goto @117
		// @116: athrow
		// @117: iconst_1
		// @118: goto @11D
		// @11B: athrow
		// @11C: iconst_0
		// @11D: aload_3
		// @11E: getfield boolean game.C_100314_lf.field_101391_lb
		// @121: if_icmpeq @1D9
		// @124: aload #6
		// @126: dup
		// @127: getfield int game.C_100314_lf.field_101310_Mb
		// @12A: iconst_2
		// @12B: iadd
		// @12C: putfield int game.C_100314_lf.field_101310_Mb
		// @12F: new game.C_100087_n
		// @132: dup
		// @133: bipush 6 (0x06)
		// @135: iload_2
		// @136: aload_0
		// @137: getfield int game.C_100294_ki.field_106951_E
		// @13A: iconst_2
		// @13B: iadd
		// @13C: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @13F: astore #7
		// @141: aload #7
		// @143: iconst_1
		// @144: putfield boolean game.C_100087_n.field_100703_p
		// @147: aload #6
		// @149: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @14C: bipush 124 (0x7C)
		// @14E: aload #7
		// @150: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @153: new game.C_100087_n
		// @156: dup
		// @157: bipush 7 (0x07)
		// @159: iload_2
		// @15A: aload_0
		// @15B: getfield int game.C_100294_ki.field_106951_E
		// @15E: iconst_4
		// @15F: iadd
		// @160: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @163: astore #7
		// @165: aload #7
		// @167: iconst_1
		// @168: putfield boolean game.C_100087_n.field_100703_p
		// @16B: aload #6
		// @16D: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @170: bipush 123 (0x7B)
		// @172: aload #7
		// @174: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @177: new game.C_100087_n
		// @17A: dup
		// @17B: bipush 6 (0x06)
		// @17D: iload_2
		// @17E: iconst_4
		// @17F: aload_0
		// @180: getfield int game.C_100294_ki.field_106951_E
		// @183: bipush 25 (0x19)
		// @185: iadd
		// @186: iadd
		// @187: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @18A: astore #7
		// @18C: aload #7
		// @18E: iconst_1
		// @18F: putfield boolean game.C_100087_n.field_100703_p
		// @192: aload #6
		// @194: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @197: bipush 127 (0x7F)
		// @199: aload #7
		// @19B: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @19E: return
		// @19F: new game.C_100087_n
		// @1A2: dup
		// @1A3: bipush 6 (0x06)
		// @1A5: aload #6
		// @1A7: getfield int game.C_100314_lf.field_101369_z
		// @1AA: aload #6
		// @1AC: getfield int game.C_100314_lf.field_101377_tc
		// @1AF: ldc_w 932381924 (0x379304e4)
		// @1B2: ishr
		// @1B3: if_icmpgt @1BB
		// @1B6: iconst_m1
		// @1B7: goto @1BC
		// @1BA: athrow
		// @1BB: iconst_1
		// @1BC: iconst_2
		// @1BD: aload_0
		// @1BE: getfield int game.C_100294_ki.field_106951_E
		// @1C1: iadd
		// @1C2: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @1C5: astore #7
		// @1C7: aload #7
		// @1C9: iconst_1
		// @1CA: putfield boolean game.C_100087_n.field_100703_p
		// @1CD: aload #6
		// @1CF: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @1D2: bipush 126 (0x7E)
		// @1D4: aload #7
		// @1D6: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1D9: aload_0
		// @1DA: iconst_3
		// @1DB: bipush -55 (0xC9)
		// @1DD: aload_3
		// @1DE: aload_0
		// @1DF: getfield int game.C_100294_ki.field_106964_J
		// @1E2: aload #6
		// @1E4: bipush 15 (0x0F)
		// @1E6: aload_0
		// @1E7: getfield int game.C_100294_ki.field_106951_E
		// @1EA: iadd
		// @1EB: sipush 2600 (0x0A28)
		// @1EE: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @1F1: ifeq @1F8
		// @1F4: goto @29B
		// @1F7: athrow
		// @1F8: iconst_0
		// @1F9: aload #6
		// @1FB: getfield int game.C_100314_lf.field_101310_Mb
		// @1FE: if_icmpge @254
		// @201: bipush -51 (0xCD)
		// @203: aload_3
		// @204: getfield int game.C_100314_lf.field_101413_Bb
		// @207: iconst_m1
		// @208: ixor
		// @209: if_icmple @254
		// @20C: goto @210
		// @20F: athrow
		// @210: aload_0
		// @211: iconst_2
		// @212: bipush -93 (0xA3)
		// @214: aload_3
		// @215: iconst_4
		// @216: aload_0
		// @217: getfield int game.C_100294_ki.field_106964_J
		// @21A: imul
		// @21B: aload #6
		// @21D: aload_0
		// @21E: getfield int game.C_100294_ki.field_106951_E
		// @221: bipush 25 (0x19)
		// @223: iadd
		// @224: sipush 8448 (0x2100)
		// @227: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @22A: ifne @29B
		// @22D: goto @231
		// @230: athrow
		// @231: aload_0
		// @232: iconst_1
		// @233: bipush -66 (0xBE)
		// @235: aload_3
		// @236: aload_0
		// @237: getfield int game.C_100294_ki.field_106964_J
		// @23A: aload #6
		// @23C: aload_0
		// @23D: getfield int game.C_100294_ki.field_106951_E
		// @240: bipush 50 (0x32)
		// @242: iadd
		// @243: sipush 3072 (0x0C00)
		// @246: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @249: ifeq @29B
		// @24C: goto @250
		// @24F: athrow
		// @250: goto @29B
		// @253: athrow
		// @254: aload_0
		// @255: iconst_1
		// @256: bipush -83 (0xAD)
		// @258: aload_3
		// @259: aload_0
		// @25A: getfield int game.C_100294_ki.field_106964_J
		// @25D: aload #6
		// @25F: aload_0
		// @260: getfield int game.C_100294_ki.field_106951_E
		// @263: bipush 50 (0x32)
		// @265: iadd
		// @266: sipush 3072 (0x0C00)
		// @269: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @26C: ifeq @273
		// @26F: goto @29B
		// @272: athrow
		// @273: iconst_0
		// @274: aload #6
		// @276: getfield int game.C_100314_lf.field_101310_Mb
		// @279: if_icmpge @29B
		// @27C: aload_0
		// @27D: iconst_2
		// @27E: bipush -116 (0x8C)
		// @280: aload_3
		// @281: aload_0
		// @282: getfield int game.C_100294_ki.field_106964_J
		// @285: aload #6
		// @287: bipush 25 (0x19)
		// @289: aload_0
		// @28A: getfield int game.C_100294_ki.field_106951_E
		// @28D: iadd
		// @28E: sipush 8448 (0x2100)
		// @291: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @294: ifne @29B
		// @297: goto @29B
		// @29A: athrow
		// @29B: goto @314
		// @29E: astore #7
		// @2A0: aload #7
		// @2A2: new java.lang.StringBuilder
		// @2A5: dup
		// @2A6: invokespecial java.lang.StringBuilder.<init>()void
		// @2A9: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2AC: bipush 44 (0x2C)
		// @2AE: aaload
		// @2AF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B2: iload_1
		// @2B3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2B6: bipush 44 (0x2C)
		// @2B8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2BB: iload_2
		// @2BC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2BF: bipush 44 (0x2C)
		// @2C1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C4: aload_3
		// @2C5: ifnull @2D1
		// @2C8: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2CB: iconst_1
		// @2CC: aaload
		// @2CD: goto @2D6
		// @2D0: athrow
		// @2D1: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2D4: iconst_4
		// @2D5: aaload
		// @2D6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D9: bipush 44 (0x2C)
		// @2DB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2DE: iload #4
		// @2E0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2E3: bipush 44 (0x2C)
		// @2E5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E8: iload #5
		// @2EA: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @2ED: bipush 44 (0x2C)
		// @2EF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2F2: aload #6
		// @2F4: ifnull @300
		// @2F7: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2FA: iconst_1
		// @2FB: aaload
		// @2FC: goto @305
		// @2FF: athrow
		// @300: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @303: iconst_4
		// @304: aaload
		// @305: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @308: bipush 41 (0x29)
		// @30A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @30D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @310: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @313: athrow
		// @314: return
	}
	
	private final void func_106902_a(int arg0, int arg1)
	{
		// @00: ldc_w -75000 (0xfffedb08)
		// @03: iload_1
		// @04: ldc_w 150000 (0x249f0)
		// @07: imul
		// @08: ineg
		// @09: isub
		// @0A: aload_0
		// @0B: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0E: getfield int[] game.C_100171_cn.field_105580_p
		// @11: iload_1
		// @12: iaload
		// @13: ldc_w -585928636 (0xdd137044)
		// @16: ishl
		// @17: iadd
		// @18: istore_3
		// @19: aload_0
		// @1A: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1D: getfield int[] game.C_100171_cn.field_105580_p
		// @20: iconst_1
		// @21: iload_1
		// @22: isub
		// @23: iaload
		// @24: ldc_w 1738432484 (0x679e5fe4)
		// @27: ishl
		// @28: istore #4
		// @2A: sipush -30000 (0x8AD0)
		// @2D: istore #5
		// @2F: iload_2
		// @30: bipush 54 (0x36)
		// @32: if_icmpge @3E
		// @35: aload_0
		// @36: iconst_1
		// @37: putfield boolean game.C_100294_ki.field_106963_eb
		// @3A: goto @3E
		// @3D: athrow
		// @3E: new game.C_100018_wk
		// @41: dup
		// @42: iload_3
		// @43: iload #5
		// @45: iconst_m1
		// @46: iconst_2
		// @47: iload_1
		// @48: imul
		// @49: iadd
		// @4A: iconst_0
		// @4B: bipush 50 (0x32)
		// @4D: iconst_1
		// @4E: bipush 17 (0x11)
		// @50: aload_0
		// @51: aconst_null
		// @52: sipush 1000 (0x03E8)
		// @55: aload_0
		// @56: getfield int game.C_100294_ki.field_106972_S
		// @59: iadd
		// @5A: iload #4
		// @5C: bipush 30 (0x1E)
		// @5E: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @61: astore #6
		// @63: aload_0
		// @64: getfield game.C_100202_qi game.C_100294_ki.field_106977_f
		// @67: bipush 124 (0x7C)
		// @69: aload #6
		// @6B: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @6E: goto @9C
		// @71: astore_3
		// @72: aload_3
		// @73: new java.lang.StringBuilder
		// @76: dup
		// @77: invokespecial java.lang.StringBuilder.<init>()void
		// @7A: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @7D: bipush 35 (0x23)
		// @7F: aaload
		// @80: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @83: iload_1
		// @84: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @87: bipush 44 (0x2C)
		// @89: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8C: iload_2
		// @8D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @90: bipush 41 (0x29)
		// @92: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @95: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @98: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9B: athrow
		// @9C: return
	}
	
	private final void func_106908_a(C_100314_lf arg0, boolean arg1, int arg2, int arg3, C_100314_lf arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: aconst_null
		// @006: aload #5
		// @008: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @00B: if_acmpne @043
		// @00E: iconst_m1
		// @00F: aload #5
		// @011: getfield int game.C_100314_lf.field_101310_Mb
		// @014: iconst_m1
		// @015: ixor
		// @016: if_icmple @043
		// @019: goto @01D
		// @01C: athrow
		// @01D: new game.C_100087_n
		// @020: dup
		// @021: iconst_5
		// @022: aload_1
		// @023: getfield int game.C_100314_lf.field_101347_Gb
		// @026: aload_0
		// @027: getfield int game.C_100294_ki.field_106951_E
		// @02A: iconst_m1
		// @02B: isub
		// @02C: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @02F: astore #7
		// @031: aload #7
		// @033: iconst_1
		// @034: putfield boolean game.C_100087_n.field_100703_p
		// @037: aload #5
		// @039: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @03C: bipush 124 (0x7C)
		// @03E: aload #7
		// @040: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @043: aload #5
		// @045: getfield int game.C_100314_lf.field_101369_z
		// @048: iconst_m1
		// @049: ixor
		// @04A: iconst_m1
		// @04B: if_icmplt @1AC
		// @04E: iload_3
		// @04F: invokestatic java.lang.Math.abs(int)int
		// @052: ldc_w 80000 (0x13880)
		// @055: if_icmple @0E2
		// @058: goto @05C
		// @05B: athrow
		// @05C: new game.C_100087_n
		// @05F: dup
		// @060: bipush 6 (0x06)
		// @062: iload #4
		// @064: iconst_2
		// @065: aload_0
		// @066: getfield int game.C_100294_ki.field_106951_E
		// @069: iadd
		// @06A: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @06D: astore #7
		// @06F: aload #7
		// @071: iconst_1
		// @072: putfield boolean game.C_100087_n.field_100703_p
		// @075: aload #5
		// @077: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @07A: bipush 126 (0x7E)
		// @07C: aload #7
		// @07E: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @081: new game.C_100087_n
		// @084: dup
		// @085: iconst_3
		// @086: iconst_0
		// @087: aload_0
		// @088: getfield int game.C_100294_ki.field_106951_E
		// @08B: bipush -4 (0xFC)
		// @08D: aload #5
		// @08F: getfield int game.C_100314_lf.field_101377_tc
		// @092: aload_1
		// @093: getfield int game.C_100314_lf.field_101377_tc
		// @096: iadd
		// @097: aload_0
		// @098: getfield int game.C_100294_ki.field_106951_E
		// @09B: iadd
		// @09C: bipush 100 (0x64)
		// @09E: irem
		// @09F: ineg
		// @0A0: iadd
		// @0A1: bipush -100 (0x9C)
		// @0A3: iadd
		// @0A4: isub
		// @0A5: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @0A8: astore #7
		// @0AA: aload #7
		// @0AC: iconst_1
		// @0AD: putfield boolean game.C_100087_n.field_100703_p
		// @0B0: aload #7
		// @0B2: aload_1
		// @0B3: getfield int game.C_100314_lf.field_101377_tc
		// @0B6: putfield int game.C_100087_n.field_100699_t
		// @0B9: aload #7
		// @0BB: aload #5
		// @0BD: getfield int game.C_100314_lf.field_101395_rc
		// @0C0: sipush 20000 (0x4E20)
		// @0C3: isub
		// @0C4: putfield int game.C_100087_n.field_100698_u
		// @0C7: aload #5
		// @0C9: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0CC: bipush 123 (0x7B)
		// @0CE: aload #7
		// @0D0: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0D3: aload #5
		// @0D5: aload #5
		// @0D7: getfield int game.C_100314_lf.field_101373_cb
		// @0DA: putfield int game.C_100314_lf.field_101310_Mb
		// @0DD: iload #10
		// @0DF: ifeq @1EA
		// @0E2: new game.C_100087_n
		// @0E5: dup
		// @0E6: iconst_3
		// @0E7: iconst_0
		// @0E8: aload #5
		// @0EA: getfield int game.C_100314_lf.field_101377_tc
		// @0ED: aload_1
		// @0EE: getfield int game.C_100314_lf.field_101377_tc
		// @0F1: aload_0
		// @0F2: getfield int game.C_100294_ki.field_106951_E
		// @0F5: iadd
		// @0F6: iadd
		// @0F7: bipush 100 (0x64)
		// @0F9: irem
		// @0FA: iconst_4
		// @0FB: iadd
		// @0FC: aload_0
		// @0FD: getfield int game.C_100294_ki.field_106951_E
		// @100: bipush -100 (0x9C)
		// @102: isub
		// @103: iadd
		// @104: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @107: astore #7
		// @109: aload #7
		// @10B: aload #5
		// @10D: getfield int game.C_100314_lf.field_101395_rc
		// @110: sipush -20000 (0xB1E0)
		// @113: iadd
		// @114: putfield int game.C_100087_n.field_100698_u
		// @117: aload #7
		// @119: iconst_1
		// @11A: putfield boolean game.C_100087_n.field_100703_p
		// @11D: aload #7
		// @11F: iload #4
		// @121: sipush 20000 (0x4E20)
		// @124: imul
		// @125: ineg
		// @126: aload #5
		// @128: getfield int game.C_100314_lf.field_101377_tc
		// @12B: iadd
		// @12C: putfield int game.C_100087_n.field_100699_t
		// @12F: aload #5
		// @131: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @134: bipush 126 (0x7E)
		// @136: aload #7
		// @138: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @13B: aload #5
		// @13D: aload #5
		// @13F: getfield int game.C_100314_lf.field_101373_cb
		// @142: putfield int game.C_100314_lf.field_101310_Mb
		// @145: aload #5
		// @147: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @14A: ifnull @1A7
		// @14D: new game.C_100087_n
		// @150: dup
		// @151: iconst_0
		// @152: bipush 11 (0x0B)
		// @154: aload_0
		// @155: getfield int game.C_100294_ki.field_106951_E
		// @158: aload_1
		// @159: getfield int game.C_100314_lf.field_101377_tc
		// @15C: ineg
		// @15D: isub
		// @15E: aload #5
		// @160: getfield int game.C_100314_lf.field_101377_tc
		// @163: iadd
		// @164: bipush 100 (0x64)
		// @166: irem
		// @167: aload_0
		// @168: getfield int game.C_100294_ki.field_106951_E
		// @16B: bipush -4 (0xFC)
		// @16D: isub
		// @16E: sipush 150 (0x0096)
		// @171: iadd
		// @172: iadd
		// @173: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @176: astore #7
		// @178: aload #7
		// @17A: aload_1
		// @17B: getfield int game.C_100314_lf.field_101377_tc
		// @17E: putfield int game.C_100087_n.field_100699_t
		// @181: aload #7
		// @183: iconst_1
		// @184: putfield boolean game.C_100087_n.field_100703_p
		// @187: aload #7
		// @189: iload #4
		// @18B: sipush 16384 (0x4000)
		// @18E: imul
		// @18F: putfield int game.C_100087_n.field_100693_m
		// @192: aload #7
		// @194: aload_1
		// @195: getfield int game.C_100314_lf.field_101395_rc
		// @198: putfield int game.C_100087_n.field_100698_u
		// @19B: aload #5
		// @19D: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @1A0: bipush 123 (0x7B)
		// @1A2: aload #7
		// @1A4: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1A7: iload #10
		// @1A9: ifeq @1EA
		// @1AC: new game.C_100087_n
		// @1AF: dup
		// @1B0: bipush 6 (0x06)
		// @1B2: aload #5
		// @1B4: getfield int game.C_100314_lf.field_101369_z
		// @1B7: aload #5
		// @1B9: getfield int game.C_100314_lf.field_101377_tc
		// @1BC: ldc_w 47323876 (0x2d21ae4)
		// @1BF: ishr
		// @1C0: if_icmpgt @1CC
		// @1C3: goto @1C7
		// @1C6: athrow
		// @1C7: iconst_m1
		// @1C8: goto @1CD
		// @1CB: athrow
		// @1CC: iconst_1
		// @1CD: iconst_2
		// @1CE: aload_0
		// @1CF: getfield int game.C_100294_ki.field_106951_E
		// @1D2: iadd
		// @1D3: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @1D6: astore #7
		// @1D8: aload #7
		// @1DA: iconst_1
		// @1DB: putfield boolean game.C_100087_n.field_100703_p
		// @1DE: aload #5
		// @1E0: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @1E3: bipush 127 (0x7F)
		// @1E5: aload #7
		// @1E7: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1EA: iload_3
		// @1EB: invokestatic java.lang.Math.abs(int)int
		// @1EE: ldc_w 100000 (0x186a0)
		// @1F1: if_icmpge @2B9
		// @1F4: aload #5
		// @1F6: getfield int game.C_100314_lf.field_101310_Mb
		// @1F9: iconst_1
		// @1FA: if_icmpge @205
		// @1FD: goto @201
		// @200: athrow
		// @201: goto @2B9
		// @204: athrow
		// @205: new game.C_100087_n
		// @208: dup
		// @209: iconst_0
		// @20A: bipush 7 (0x07)
		// @20C: aload_0
		// @20D: getfield int game.C_100294_ki.field_106951_E
		// @210: iconst_4
		// @211: iadd
		// @212: aload #5
		// @214: getfield int game.C_100314_lf.field_101377_tc
		// @217: aload_1
		// @218: getfield int game.C_100314_lf.field_101377_tc
		// @21B: iadd
		// @21C: aload_0
		// @21D: getfield int game.C_100294_ki.field_106951_E
		// @220: iadd
		// @221: bipush 100 (0x64)
		// @223: irem
		// @224: ineg
		// @225: sipush 175 (0x00AF)
		// @228: isub
		// @229: isub
		// @22A: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @22D: astore #7
		// @22F: aload #7
		// @231: aload_1
		// @232: getfield int game.C_100314_lf.field_101377_tc
		// @235: putfield int game.C_100087_n.field_100699_t
		// @238: aload #7
		// @23A: aload_1
		// @23B: getfield int game.C_100314_lf.field_101395_rc
		// @23E: putfield int game.C_100087_n.field_100698_u
		// @241: iload_3
		// @242: i2d
		// @243: iload #6
		// @245: ineg
		// @246: i2d
		// @247: invokestatic java.lang.Math.atan2(double, double)double
		// @24A: dstore #8
		// @24C: aload #7
		// @24E: dload #8
		// @250: ldc2_w 65536.0
		// @253: dmul
		// @254: ldc2_w 6.283185307179586
		// @257: ddiv
		// @258: d2i
		// @259: putfield int game.C_100087_n.field_100693_m
		// @25C: iconst_m1
		// @25D: iload #4
		// @25F: iconst_m1
		// @260: ixor
		// @261: if_icmpge @288
		// @264: sipush 16384 (0x4000)
		// @267: aload #7
		// @269: getfield int game.C_100087_n.field_100693_m
		// @26C: if_icmpge @2A7
		// @26F: goto @273
		// @272: athrow
		// @273: aload #7
		// @275: dup
		// @276: getfield int game.C_100087_n.field_100693_m
		// @279: ldc 65536 (0x10000)
		// @27B: isub
		// @27C: putfield int game.C_100087_n.field_100693_m
		// @27F: iload #10
		// @281: ifeq @2A7
		// @284: goto @288
		// @287: athrow
		// @288: aload #7
		// @28A: getfield int game.C_100087_n.field_100693_m
		// @28D: sipush -16384 (0xC000)
		// @290: if_icmpge @2A7
		// @293: goto @297
		// @296: athrow
		// @297: aload #7
		// @299: dup
		// @29A: getfield int game.C_100087_n.field_100693_m
		// @29D: ldc 65536 (0x10000)
		// @29F: iadd
		// @2A0: putfield int game.C_100087_n.field_100693_m
		// @2A3: goto @2A7
		// @2A6: athrow
		// @2A7: aload #7
		// @2A9: iconst_1
		// @2AA: putfield boolean game.C_100087_n.field_100703_p
		// @2AD: aload #5
		// @2AF: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @2B2: bipush 124 (0x7C)
		// @2B4: aload #7
		// @2B6: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2B9: iload_2
		// @2BA: iconst_1
		// @2BB: if_icmpeq @2C9
		// @2BE: aconst_null
		// @2BF: checkcast java.lang.String
		// @2C2: putstatic java.lang.String game.C_100294_ki.field_106973_R
		// @2C5: goto @2C9
		// @2C8: athrow
		// @2C9: goto @342
		// @2CC: astore #7
		// @2CE: aload #7
		// @2D0: new java.lang.StringBuilder
		// @2D3: dup
		// @2D4: invokespecial java.lang.StringBuilder.<init>()void
		// @2D7: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2DA: bipush 43 (0x2B)
		// @2DC: aaload
		// @2DD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2E0: aload_1
		// @2E1: ifnull @2ED
		// @2E4: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2E7: iconst_1
		// @2E8: aaload
		// @2E9: goto @2F2
		// @2EC: athrow
		// @2ED: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2F0: iconst_4
		// @2F1: aaload
		// @2F2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F5: bipush 44 (0x2C)
		// @2F7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2FA: iload_2
		// @2FB: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @2FE: bipush 44 (0x2C)
		// @300: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @303: iload_3
		// @304: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @307: bipush 44 (0x2C)
		// @309: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @30C: iload #4
		// @30E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @311: bipush 44 (0x2C)
		// @313: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @316: aload #5
		// @318: ifnull @324
		// @31B: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @31E: iconst_1
		// @31F: aaload
		// @320: goto @329
		// @323: athrow
		// @324: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @327: iconst_4
		// @328: aaload
		// @329: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @32C: bipush 44 (0x2C)
		// @32E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @331: iload #6
		// @333: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @336: bipush 41 (0x29)
		// @338: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @33B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @33E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @341: athrow
		// @342: return
	}
	
	private final void func_106895_a(byte arg0, C_100314_lf arg1, int arg2, C_100314_lf arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: aload_2
		// @006: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @009: ifnonnull @042
		// @00C: iconst_0
		// @00D: aload_2
		// @00E: getfield int game.C_100314_lf.field_101310_Mb
		// @011: if_icmplt @01C
		// @014: goto @018
		// @017: athrow
		// @018: goto @042
		// @01B: athrow
		// @01C: new game.C_100087_n
		// @01F: dup
		// @020: iconst_5
		// @021: aload #4
		// @023: getfield int game.C_100314_lf.field_101347_Gb
		// @026: aload_0
		// @027: getfield int game.C_100294_ki.field_106951_E
		// @02A: iconst_1
		// @02B: iadd
		// @02C: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @02F: astore #7
		// @031: aload #7
		// @033: iconst_1
		// @034: putfield boolean game.C_100087_n.field_100703_p
		// @037: aload_2
		// @038: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @03B: bipush 125 (0x7D)
		// @03D: aload #7
		// @03F: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @042: aload_2
		// @043: getfield boolean game.C_100314_lf.field_101307_pb
		// @046: ifne @055
		// @049: iconst_5
		// @04A: aload_2
		// @04B: getfield int game.C_100314_lf.field_101310_Mb
		// @04E: if_icmpgt @15F
		// @051: goto @055
		// @054: athrow
		// @055: iconst_1
		// @056: aload_2
		// @057: getfield int game.C_100314_lf.field_101310_Mb
		// @05A: if_icmpgt @15F
		// @05D: goto @061
		// @060: athrow
		// @061: iload_3
		// @062: invokestatic java.lang.Math.abs(int)int
		// @065: ldc 50000 (0xc350)
		// @067: if_icmple @10A
		// @06A: goto @06E
		// @06D: athrow
		// @06E: new game.C_100087_n
		// @071: dup
		// @072: iconst_3
		// @073: iconst_0
		// @074: bipush 50 (0x32)
		// @076: aload_0
		// @077: getfield int game.C_100294_ki.field_106951_E
		// @07A: iadd
		// @07B: bipush -4 (0xFC)
		// @07D: aload_2
		// @07E: getfield int game.C_100314_lf.field_101377_tc
		// @081: aload_0
		// @082: getfield int game.C_100294_ki.field_106951_E
		// @085: iadd
		// @086: aload #4
		// @088: getfield int game.C_100314_lf.field_101377_tc
		// @08B: iadd
		// @08C: bipush 100 (0x64)
		// @08E: irem
		// @08F: ineg
		// @090: iadd
		// @091: isub
		// @092: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @095: astore #7
		// @097: aload #7
		// @099: aload #4
		// @09B: getfield int game.C_100314_lf.field_101377_tc
		// @09E: putfield int game.C_100087_n.field_100699_t
		// @0A1: aload #7
		// @0A3: getfield int game.C_100087_n.field_100699_t
		// @0A6: iconst_m1
		// @0A7: ixor
		// @0A8: sipush 10000 (0x2710)
		// @0AB: aload_2
		// @0AC: getfield int game.C_100314_lf.field_101377_tc
		// @0AF: iadd
		// @0B0: iconst_m1
		// @0B1: ixor
		// @0B2: if_icmpge @0C6
		// @0B5: aload #7
		// @0B7: sipush 10000 (0x2710)
		// @0BA: aload_2
		// @0BB: getfield int game.C_100314_lf.field_101377_tc
		// @0BE: iadd
		// @0BF: putfield int game.C_100087_n.field_100699_t
		// @0C2: goto @0C6
		// @0C5: athrow
		// @0C6: aload #7
		// @0C8: aload_2
		// @0C9: getfield int game.C_100314_lf.field_101395_rc
		// @0CC: sipush 20000 (0x4E20)
		// @0CF: isub
		// @0D0: putfield int game.C_100087_n.field_100698_u
		// @0D3: aload #7
		// @0D5: getfield int game.C_100087_n.field_100699_t
		// @0D8: aload_2
		// @0D9: getfield int game.C_100314_lf.field_101377_tc
		// @0DC: sipush 10000 (0x2710)
		// @0DF: isub
		// @0E0: if_icmplt @0E7
		// @0E3: goto @0F4
		// @0E6: athrow
		// @0E7: aload #7
		// @0E9: sipush -10000 (0xD8F0)
		// @0EC: aload_2
		// @0ED: getfield int game.C_100314_lf.field_101377_tc
		// @0F0: iadd
		// @0F1: putfield int game.C_100087_n.field_100699_t
		// @0F4: aload #7
		// @0F6: iconst_1
		// @0F7: putfield boolean game.C_100087_n.field_100703_p
		// @0FA: aload_2
		// @0FB: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0FE: bipush 125 (0x7D)
		// @100: aload #7
		// @102: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @105: iload #10
		// @107: ifeq @15F
		// @10A: new game.C_100087_n
		// @10D: dup
		// @10E: iconst_3
		// @10F: iconst_0
		// @110: iconst_5
		// @111: aload_2
		// @112: getfield int game.C_100314_lf.field_101377_tc
		// @115: aload #4
		// @117: getfield int game.C_100314_lf.field_101377_tc
		// @11A: iadd
		// @11B: aload_0
		// @11C: getfield int game.C_100294_ki.field_106951_E
		// @11F: iadd
		// @120: bipush 100 (0x64)
		// @122: irem
		// @123: iadd
		// @124: aload_0
		// @125: getfield int game.C_100294_ki.field_106951_E
		// @128: iconst_4
		// @129: iadd
		// @12A: iadd
		// @12B: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @12E: astore #7
		// @130: aload #7
		// @132: aload_2
		// @133: getfield int game.C_100314_lf.field_101377_tc
		// @136: iload #5
		// @138: sipush 20000 (0x4E20)
		// @13B: imul
		// @13C: ineg
		// @13D: iadd
		// @13E: putfield int game.C_100087_n.field_100699_t
		// @141: aload #7
		// @143: iconst_1
		// @144: putfield boolean game.C_100087_n.field_100703_p
		// @147: aload #7
		// @149: sipush -20000 (0xB1E0)
		// @14C: aload_2
		// @14D: getfield int game.C_100314_lf.field_101395_rc
		// @150: iadd
		// @151: putfield int game.C_100087_n.field_100698_u
		// @154: aload_2
		// @155: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @158: bipush 127 (0x7F)
		// @15A: aload #7
		// @15C: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @15F: iload_3
		// @160: invokestatic java.lang.Math.abs(int)int
		// @163: ldc 50000 (0xc350)
		// @165: if_icmpgt @179
		// @168: sipush -30001 (0x8ACF)
		// @16B: iload #6
		// @16D: invokestatic java.lang.Math.abs(int)int
		// @170: iconst_m1
		// @171: ixor
		// @172: if_icmple @185
		// @175: goto @179
		// @178: athrow
		// @179: iconst_1
		// @17A: aload_2
		// @17B: getfield int game.C_100314_lf.field_101310_Mb
		// @17E: if_icmple @24F
		// @181: goto @185
		// @184: athrow
		// @185: aload_2
		// @186: ldc 312774288 (0x12a48e90)
		// @188: bipush 30 (0x1E)
		// @18A: invokevirtual game.C_100314_lf.func_101268_f(int, int)boolean
		// @18D: ifne @35A
		// @190: goto @194
		// @193: athrow
		// @194: new game.C_100087_n
		// @197: dup
		// @198: iconst_0
		// @199: iconst_0
		// @19A: bipush 60 (0x3C)
		// @19C: iconst_4
		// @19D: aload_0
		// @19E: getfield int game.C_100294_ki.field_106951_E
		// @1A1: aload #4
		// @1A3: getfield int game.C_100314_lf.field_101377_tc
		// @1A6: aload_0
		// @1A7: getfield int game.C_100294_ki.field_106951_E
		// @1AA: iadd
		// @1AB: aload_2
		// @1AC: getfield int game.C_100314_lf.field_101377_tc
		// @1AF: ineg
		// @1B0: isub
		// @1B1: bipush 100 (0x64)
		// @1B3: irem
		// @1B4: ineg
		// @1B5: isub
		// @1B6: iadd
		// @1B7: iadd
		// @1B8: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @1BB: astore #7
		// @1BD: aload #7
		// @1BF: aload #4
		// @1C1: getfield int game.C_100314_lf.field_101395_rc
		// @1C4: putfield int game.C_100087_n.field_100698_u
		// @1C7: aload #7
		// @1C9: aload #4
		// @1CB: getfield int game.C_100314_lf.field_101377_tc
		// @1CE: putfield int game.C_100087_n.field_100699_t
		// @1D1: iload_3
		// @1D2: i2d
		// @1D3: iload #6
		// @1D5: ineg
		// @1D6: i2d
		// @1D7: invokestatic java.lang.Math.atan2(double, double)double
		// @1DA: dstore #8
		// @1DC: aload #7
		// @1DE: dload #8
		// @1E0: ldc2_w 65536.0
		// @1E3: dmul
		// @1E4: ldc2_w 6.283185307179586
		// @1E7: ddiv
		// @1E8: d2i
		// @1E9: putfield int game.C_100087_n.field_100693_m
		// @1EC: aload #7
		// @1EE: iconst_1
		// @1EF: putfield boolean game.C_100087_n.field_100703_p
		// @1F2: iconst_m1
		// @1F3: iload #5
		// @1F5: iconst_m1
		// @1F6: ixor
		// @1F7: if_icmplt @220
		// @1FA: aload #7
		// @1FC: getfield int game.C_100087_n.field_100693_m
		// @1FF: iconst_m1
		// @200: ixor
		// @201: sipush 16383 (0x3FFF)
		// @204: if_icmpgt @20F
		// @207: goto @20B
		// @20A: athrow
		// @20B: goto @23F
		// @20E: athrow
		// @20F: aload #7
		// @211: dup
		// @212: getfield int game.C_100087_n.field_100693_m
		// @215: ldc 65536 (0x10000)
		// @217: iadd
		// @218: putfield int game.C_100087_n.field_100693_m
		// @21B: iload #10
		// @21D: ifeq @23F
		// @220: sipush 16384 (0x4000)
		// @223: aload #7
		// @225: getfield int game.C_100087_n.field_100693_m
		// @228: if_icmpge @23F
		// @22B: goto @22F
		// @22E: athrow
		// @22F: aload #7
		// @231: dup
		// @232: getfield int game.C_100087_n.field_100693_m
		// @235: ldc 65536 (0x10000)
		// @237: isub
		// @238: putfield int game.C_100087_n.field_100693_m
		// @23B: goto @23F
		// @23E: athrow
		// @23F: aload_2
		// @240: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @243: bipush 123 (0x7B)
		// @245: aload #7
		// @247: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @24A: iload #10
		// @24C: ifeq @35A
		// @24F: new game.C_100087_n
		// @252: dup
		// @253: iconst_0
		// @254: bipush 8 (0x08)
		// @256: bipush 64 (0x40)
		// @258: aload_0
		// @259: getfield int game.C_100294_ki.field_106951_E
		// @25C: aload_2
		// @25D: getfield int game.C_100314_lf.field_101377_tc
		// @260: aload_0
		// @261: getfield int game.C_100294_ki.field_106951_E
		// @264: aload #4
		// @266: getfield int game.C_100314_lf.field_101377_tc
		// @269: ineg
		// @26A: isub
		// @26B: iadd
		// @26C: bipush 100 (0x64)
		// @26E: irem
		// @26F: ineg
		// @270: isub
		// @271: iadd
		// @272: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @275: astore #7
		// @277: aload #7
		// @279: aload #4
		// @27B: getfield int game.C_100314_lf.field_101377_tc
		// @27E: putfield int game.C_100087_n.field_100699_t
		// @281: aload #7
		// @283: aload #4
		// @285: getfield int game.C_100314_lf.field_101395_rc
		// @288: putfield int game.C_100087_n.field_100698_u
		// @28B: iload_3
		// @28C: i2d
		// @28D: iload #6
		// @28F: ineg
		// @290: i2d
		// @291: invokestatic java.lang.Math.atan2(double, double)double
		// @294: dstore #8
		// @296: aload #7
		// @298: ldc2_w 65536.0
		// @29B: dload #8
		// @29D: dmul
		// @29E: ldc2_w 6.283185307179586
		// @2A1: ddiv
		// @2A2: d2i
		// @2A3: putfield int game.C_100087_n.field_100693_m
		// @2A6: aload #7
		// @2A8: iconst_1
		// @2A9: putfield boolean game.C_100087_n.field_100703_p
		// @2AC: iconst_m1
		// @2AD: iload #5
		// @2AF: iconst_m1
		// @2B0: ixor
		// @2B1: if_icmplt @2D8
		// @2B4: sipush -16384 (0xC000)
		// @2B7: aload #7
		// @2B9: getfield int game.C_100087_n.field_100693_m
		// @2BC: if_icmple @2F9
		// @2BF: goto @2C3
		// @2C2: athrow
		// @2C3: aload #7
		// @2C5: dup
		// @2C6: getfield int game.C_100087_n.field_100693_m
		// @2C9: ldc 65536 (0x10000)
		// @2CB: iadd
		// @2CC: putfield int game.C_100087_n.field_100693_m
		// @2CF: iload #10
		// @2D1: ifeq @2F9
		// @2D4: goto @2D8
		// @2D7: athrow
		// @2D8: sipush -16385 (0xBFFF)
		// @2DB: aload #7
		// @2DD: getfield int game.C_100087_n.field_100693_m
		// @2E0: iconst_m1
		// @2E1: ixor
		// @2E2: if_icmple @2F9
		// @2E5: goto @2E9
		// @2E8: athrow
		// @2E9: aload #7
		// @2EB: dup
		// @2EC: getfield int game.C_100087_n.field_100693_m
		// @2EF: ldc 65536 (0x10000)
		// @2F1: isub
		// @2F2: putfield int game.C_100087_n.field_100693_m
		// @2F5: goto @2F9
		// @2F8: athrow
		// @2F9: aload_2
		// @2FA: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @2FD: bipush 124 (0x7C)
		// @2FF: aload #7
		// @301: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @304: new game.C_100087_n
		// @307: dup
		// @308: iconst_3
		// @309: iconst_0
		// @30A: aload_0
		// @30B: getfield int game.C_100294_ki.field_106951_E
		// @30E: aload #4
		// @310: getfield int game.C_100314_lf.field_101377_tc
		// @313: ineg
		// @314: aload_2
		// @315: getfield int game.C_100314_lf.field_101377_tc
		// @318: isub
		// @319: isub
		// @31A: bipush 100 (0x64)
		// @31C: irem
		// @31D: iconst_4
		// @31E: aload_0
		// @31F: getfield int game.C_100294_ki.field_106951_E
		// @322: iadd
		// @323: bipush -5 (0xFB)
		// @325: isub
		// @326: iadd
		// @327: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @32A: astore #7
		// @32C: aload #7
		// @32E: aload_2
		// @32F: getfield int game.C_100314_lf.field_101377_tc
		// @332: sipush 5000 (0x1388)
		// @335: iload #5
		// @337: imul
		// @338: iadd
		// @339: putfield int game.C_100087_n.field_100699_t
		// @33C: aload #7
		// @33E: iconst_1
		// @33F: putfield boolean game.C_100087_n.field_100703_p
		// @342: aload #7
		// @344: sipush -20000 (0xB1E0)
		// @347: aload_2
		// @348: getfield int game.C_100314_lf.field_101395_rc
		// @34B: iadd
		// @34C: putfield int game.C_100087_n.field_100698_u
		// @34F: aload_2
		// @350: getfield game.C_100202_qi game.C_100314_lf.field_101324_H
		// @353: bipush 125 (0x7D)
		// @355: aload #7
		// @357: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @35A: iload_1
		// @35B: bipush 108 (0x6C)
		// @35D: if_icmpge @36C
		// @360: aload_0
		// @361: aconst_null
		// @362: checkcast game.C_100202_qi
		// @365: putfield game.C_100202_qi game.C_100294_ki.field_106978_g
		// @368: goto @36C
		// @36B: athrow
		// @36C: goto @3E5
		// @36F: astore #7
		// @371: aload #7
		// @373: new java.lang.StringBuilder
		// @376: dup
		// @377: invokespecial java.lang.StringBuilder.<init>()void
		// @37A: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @37D: bipush 41 (0x29)
		// @37F: aaload
		// @380: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @383: iload_1
		// @384: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @387: bipush 44 (0x2C)
		// @389: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38C: aload_2
		// @38D: ifnull @399
		// @390: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @393: iconst_1
		// @394: aaload
		// @395: goto @39E
		// @398: athrow
		// @399: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @39C: iconst_4
		// @39D: aaload
		// @39E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A1: bipush 44 (0x2C)
		// @3A3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3A6: iload_3
		// @3A7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3AA: bipush 44 (0x2C)
		// @3AC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3AF: aload #4
		// @3B1: ifnull @3BD
		// @3B4: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @3B7: iconst_1
		// @3B8: aaload
		// @3B9: goto @3C2
		// @3BC: athrow
		// @3BD: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @3C0: iconst_4
		// @3C1: aaload
		// @3C2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C5: bipush 44 (0x2C)
		// @3C7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3CA: iload #5
		// @3CC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3CF: bipush 44 (0x2C)
		// @3D1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D4: iload #6
		// @3D6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3D9: bipush 41 (0x29)
		// @3DB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3DE: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3E1: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3E4: athrow
		// @3E5: return
	}
	
	private final boolean func_106933_a(int arg0, boolean arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iconst_2
		// @06: aload_0
		// @07: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0A: sipush 26294 (0x66B6)
		// @0D: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @10: if_icmpne @17
		// @13: goto @19
		// @16: athrow
		// @17: iconst_0
		// @18: ireturn
		// @19: aload_0
		// @1A: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1D: sipush -25357 (0x9CF3)
		// @20: iload_1
		// @21: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @24: iconst_m1
		// @25: ixor
		// @26: sipush -3001 (0xF447)
		// @29: if_icmpge @2E
		// @2C: iconst_0
		// @2D: ireturn
		// @2E: iload_2
		// @2F: ifeq @34
		// @32: iconst_0
		// @33: ireturn
		// @34: aload_0
		// @35: iload_1
		// @36: sipush -9577 (0xDA97)
		// @39: invokespecial game.C_100294_ki.func_106917_b(int, int)boolean
		// @3C: ifne @41
		// @3F: iconst_0
		// @40: ireturn
		// @41: iinc #1 +1
		// @44: aload_0
		// @45: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @48: getfield int game.C_100171_cn.field_105576_k
		// @4B: iload_1
		// @4C: if_icmple @84
		// @4F: aload_0
		// @50: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @53: sipush -25357 (0x9CF3)
		// @56: iload_1
		// @57: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @5A: iload #4
		// @5C: ifne @85
		// @5F: sipush 3000 (0x0BB8)
		// @62: if_icmpgt @6D
		// @65: goto @69
		// @68: athrow
		// @69: goto @6F
		// @6C: athrow
		// @6D: iconst_1
		// @6E: ireturn
		// @6F: aload_0
		// @70: iload_1
		// @71: sipush -9577 (0xDA97)
		// @74: invokespecial game.C_100294_ki.func_106917_b(int, int)boolean
		// @77: ifne @7C
		// @7A: iconst_0
		// @7B: ireturn
		// @7C: iinc #1 +1
		// @7F: iload #4
		// @81: ifeq @44
		// @84: iconst_0
		// @85: ireturn
		// @86: astore_3
		// @87: aload_3
		// @88: new java.lang.StringBuilder
		// @8B: dup
		// @8C: invokespecial java.lang.StringBuilder.<init>()void
		// @8F: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @92: bipush 52 (0x34)
		// @94: aaload
		// @95: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @98: iload_1
		// @99: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9C: bipush 44 (0x2C)
		// @9E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A1: iload_2
		// @A2: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @A5: bipush 41 (0x29)
		// @A7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @AD: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @B0: athrow
	}
	
	final void func_106907_a(C_100314_lf arg0, int arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: ldc_w -75000 (0xfffedb08)
		// @008: iload_3
		// @009: ldc_w 150000 (0x249f0)
		// @00C: imul
		// @00D: ineg
		// @00E: isub
		// @00F: aload_0
		// @010: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @013: getfield int[] game.C_100171_cn.field_105580_p
		// @016: iload_3
		// @017: iaload
		// @018: ldc_w -1673092444 (0x9c46a2a4)
		// @01B: ishl
		// @01C: iadd
		// @01D: istore #4
		// @01F: aload_0
		// @020: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @023: getfield int[] game.C_100171_cn.field_105580_p
		// @026: iload_3
		// @027: ineg
		// @028: iconst_1
		// @029: iadd
		// @02A: iaload
		// @02B: ldc_w 43261764 (0x2941f44)
		// @02E: ishl
		// @02F: istore #5
		// @031: sipush -30000 (0x8AD0)
		// @034: istore #6
		// @036: new game.C_100018_wk
		// @039: dup
		// @03A: iload #4
		// @03C: iload #6
		// @03E: iconst_m1
		// @03F: iload_3
		// @040: iconst_2
		// @041: imul
		// @042: iadd
		// @043: iconst_0
		// @044: bipush 50 (0x32)
		// @046: iconst_1
		// @047: bipush 11 (0x0B)
		// @049: aload_0
		// @04A: aload_1
		// @04B: sipush 1000 (0x03E8)
		// @04E: iload #5
		// @050: bipush 30 (0x1E)
		// @052: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @055: astore #7
		// @057: iload_2
		// @058: sipush 7689 (0x1E09)
		// @05B: if_icmpeq @074
		// @05E: aload_0
		// @05F: aconst_null
		// @060: checkcast game.C_100314_lf
		// @063: bipush -45 (0xD3)
		// @065: aconst_null
		// @066: checkcast game.C_100314_lf
		// @069: bipush 94 (0x5E)
		// @06B: bipush 83 (0x53)
		// @06D: invokespecial game.C_100294_ki.func_106893_a(game.C_100314_lf, int, game.C_100314_lf, int, int)void
		// @070: goto @074
		// @073: athrow
		// @074: aload_0
		// @075: getfield game.C_100202_qi game.C_100294_ki.field_106977_f
		// @078: bipush 123 (0x7B)
		// @07A: aload #7
		// @07C: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @07F: new game.C_100019_wl
		// @082: dup
		// @083: aload_0
		// @084: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @087: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @08A: astore #8
		// @08C: aload #8
		// @08E: bipush -128 (0x80)
		// @090: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @093: checkcast game.C_100314_lf
		// @096: astore #9
		// @098: aconst_null
		// @099: aload #9
		// @09B: if_acmpeq @0DA
		// @09E: iload #10
		// @0A0: ifne @124
		// @0A3: iload_3
		// @0A4: aload #9
		// @0A6: getfield int game.C_100314_lf.field_101346_Z
		// @0A9: if_icmpne @0C6
		// @0AC: goto @0B0
		// @0AF: athrow
		// @0B0: aload #9
		// @0B2: getfield boolean game.C_100314_lf.field_101331_Wb
		// @0B5: ifeq @0C6
		// @0B8: goto @0BC
		// @0BB: athrow
		// @0BC: aload #9
		// @0BE: iconst_0
		// @0BF: putfield boolean game.C_100314_lf.field_101331_Wb
		// @0C2: goto @0C6
		// @0C5: athrow
		// @0C6: aload #8
		// @0C8: iload_2
		// @0C9: sipush -26219 (0x9995)
		// @0CC: ixor
		// @0CD: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @0D0: checkcast game.C_100314_lf
		// @0D3: astore #9
		// @0D5: iload #10
		// @0D7: ifeq @098
		// @0DA: goto @124
		// @0DD: astore #4
		// @0DF: aload #4
		// @0E1: new java.lang.StringBuilder
		// @0E4: dup
		// @0E5: invokespecial java.lang.StringBuilder.<init>()void
		// @0E8: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @0EB: bipush 9 (0x09)
		// @0ED: aaload
		// @0EE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F1: aload_1
		// @0F2: ifnull @0FE
		// @0F5: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @0F8: iconst_1
		// @0F9: aaload
		// @0FA: goto @103
		// @0FD: athrow
		// @0FE: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @101: iconst_4
		// @102: aaload
		// @103: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @106: bipush 44 (0x2C)
		// @108: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10B: iload_2
		// @10C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @10F: bipush 44 (0x2C)
		// @111: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @114: iload_3
		// @115: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @118: bipush 41 (0x29)
		// @11A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @11D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @120: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @123: athrow
		// @124: return
	}
	
	private final void func_106944_a(int arg0, int arg1, C_100314_lf arg2, int arg3, C_100314_lf arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #9
		// @005: aload #5
		// @007: getfield int game.C_100314_lf.field_101369_z
		// @00A: iconst_m1
		// @00B: ixor
		// @00C: iconst_m1
		// @00D: if_icmpge @057
		// @010: new game.C_100087_n
		// @013: dup
		// @014: bipush 6 (0x06)
		// @016: aload #5
		// @018: getfield int game.C_100314_lf.field_101377_tc
		// @01B: ldc_w 1449253540 (0x5661daa4)
		// @01E: ishr
		// @01F: iconst_m1
		// @020: ixor
		// @021: aload #5
		// @023: getfield int game.C_100314_lf.field_101369_z
		// @026: iconst_m1
		// @027: ixor
		// @028: if_icmple @034
		// @02B: goto @02F
		// @02E: athrow
		// @02F: iconst_1
		// @030: goto @035
		// @033: athrow
		// @034: iconst_m1
		// @035: iconst_2
		// @036: aload_0
		// @037: getfield int game.C_100294_ki.field_106951_E
		// @03A: iadd
		// @03B: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @03E: astore #7
		// @040: aload #7
		// @042: iconst_1
		// @043: putfield boolean game.C_100087_n.field_100703_p
		// @046: aload #5
		// @048: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @04B: bipush 124 (0x7C)
		// @04D: aload #7
		// @04F: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @052: iload #9
		// @054: ifeq @196
		// @057: sipush 15000 (0x3A98)
		// @05A: iload #6
		// @05C: invokestatic java.lang.Math.abs(int)int
		// @05F: if_icmpgt @0AC
		// @062: goto @066
		// @065: athrow
		// @066: aload_3
		// @067: getfield int game.C_100314_lf.field_101399_Ab
		// @06A: ifle @082
		// @06D: goto @071
		// @070: athrow
		// @071: iload #6
		// @073: invokestatic java.lang.Math.abs(int)int
		// @076: iconst_m1
		// @077: ixor
		// @078: ldc_w -40001 (0xffff63bf)
		// @07B: if_icmpgt @0AC
		// @07E: goto @082
		// @081: athrow
		// @082: new game.C_100087_n
		// @085: dup
		// @086: bipush 6 (0x06)
		// @088: iload #4
		// @08A: iconst_2
		// @08B: aload_0
		// @08C: getfield int game.C_100294_ki.field_106951_E
		// @08F: iadd
		// @090: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @093: astore #7
		// @095: aload #7
		// @097: iconst_1
		// @098: putfield boolean game.C_100087_n.field_100703_p
		// @09B: aload #5
		// @09D: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0A0: bipush 124 (0x7C)
		// @0A2: aload #7
		// @0A4: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0A7: iload #9
		// @0A9: ifeq @196
		// @0AC: iload #6
		// @0AE: invokestatic java.lang.Math.abs(int)int
		// @0B1: sipush 15000 (0x3A98)
		// @0B4: if_icmpge @14A
		// @0B7: goto @0BB
		// @0BA: athrow
		// @0BB: iload_2
		// @0BC: invokestatic java.lang.Math.abs(int)int
		// @0BF: sipush 10000 (0x2710)
		// @0C2: if_icmpge @14A
		// @0C5: goto @0C9
		// @0C8: athrow
		// @0C9: iconst_1
		// @0CA: aload #5
		// @0CC: getfield int game.C_100314_lf.field_101310_Mb
		// @0CF: if_icmpge @14A
		// @0D2: goto @0D6
		// @0D5: athrow
		// @0D6: new game.C_100087_n
		// @0D9: dup
		// @0DA: bipush 6 (0x06)
		// @0DC: iload #4
		// @0DE: iconst_2
		// @0DF: aload_0
		// @0E0: getfield int game.C_100294_ki.field_106951_E
		// @0E3: iadd
		// @0E4: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @0E7: astore #7
		// @0E9: aload #7
		// @0EB: iconst_1
		// @0EC: putfield boolean game.C_100087_n.field_100703_p
		// @0EF: aload #5
		// @0F1: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0F4: bipush 127 (0x7F)
		// @0F6: aload #7
		// @0F8: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0FB: new game.C_100087_n
		// @0FE: dup
		// @0FF: bipush 7 (0x07)
		// @101: iload #4
		// @103: iconst_4
		// @104: aload_0
		// @105: getfield int game.C_100294_ki.field_106951_E
		// @108: iadd
		// @109: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @10C: astore #7
		// @10E: aload #7
		// @110: iconst_1
		// @111: putfield boolean game.C_100087_n.field_100703_p
		// @114: aload #5
		// @116: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @119: bipush 126 (0x7E)
		// @11B: aload #7
		// @11D: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @120: new game.C_100087_n
		// @123: dup
		// @124: bipush 6 (0x06)
		// @126: iload #4
		// @128: bipush 25 (0x19)
		// @12A: aload_0
		// @12B: getfield int game.C_100294_ki.field_106951_E
		// @12E: iadd
		// @12F: bipush -4 (0xFC)
		// @131: isub
		// @132: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @135: astore #7
		// @137: aload #7
		// @139: iconst_1
		// @13A: putfield boolean game.C_100087_n.field_100703_p
		// @13D: aload #5
		// @13F: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @142: bipush 127 (0x7F)
		// @144: aload #7
		// @146: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @149: return
		// @14A: sipush 20000 (0x4E20)
		// @14D: iload #6
		// @14F: invokestatic java.lang.Math.abs(int)int
		// @152: if_icmple @196
		// @155: iconst_1
		// @156: aload_3
		// @157: getfield int game.C_100314_lf.field_101399_Ab
		// @15A: if_icmplt @170
		// @15D: goto @161
		// @160: athrow
		// @161: iload #6
		// @163: invokestatic java.lang.Math.abs(int)int
		// @166: sipush 10000 (0x2710)
		// @169: if_icmpge @196
		// @16C: goto @170
		// @16F: athrow
		// @170: new game.C_100087_n
		// @173: dup
		// @174: bipush 6 (0x06)
		// @176: iload #4
		// @178: ineg
		// @179: iconst_2
		// @17A: aload_0
		// @17B: getfield int game.C_100294_ki.field_106951_E
		// @17E: iadd
		// @17F: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @182: astore #7
		// @184: aload #7
		// @186: iconst_1
		// @187: putfield boolean game.C_100087_n.field_100703_p
		// @18A: aload #5
		// @18C: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @18F: bipush 123 (0x7B)
		// @191: aload #7
		// @193: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @196: bipush -96 (0xA0)
		// @198: bipush -51 (0xCD)
		// @19A: iload_1
		// @19B: isub
		// @19C: bipush 53 (0x35)
		// @19E: idiv
		// @19F: idiv
		// @1A0: istore #7
		// @1A2: iload #6
		// @1A4: invokestatic java.lang.Math.abs(int)int
		// @1A7: iconst_m1
		// @1A8: ixor
		// @1A9: ldc_w -50001 (0xffff3caf)
		// @1AC: if_icmpge @1CE
		// @1AF: aload_0
		// @1B0: iconst_2
		// @1B1: bipush -98 (0x9E)
		// @1B3: aload_3
		// @1B4: aload_0
		// @1B5: getfield int game.C_100294_ki.field_106964_J
		// @1B8: aload #5
		// @1BA: aload_0
		// @1BB: getfield int game.C_100294_ki.field_106951_E
		// @1BE: bipush 15 (0x0F)
		// @1C0: iadd
		// @1C1: sipush 2600 (0x0A28)
		// @1C4: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @1C7: ifne @29B
		// @1CA: goto @1CE
		// @1CD: athrow
		// @1CE: iconst_1
		// @1CF: aload #5
		// @1D1: getfield int game.C_100314_lf.field_101310_Mb
		// @1D4: if_icmplt @25D
		// @1D7: goto @1DB
		// @1DA: athrow
		// @1DB: aload_0
		// @1DC: iconst_0
		// @1DD: bipush -99 (0x9D)
		// @1DF: aload_3
		// @1E0: aload_0
		// @1E1: getfield int game.C_100294_ki.field_106964_J
		// @1E4: aload #5
		// @1E6: bipush 25 (0x19)
		// @1E8: aload_0
		// @1E9: getfield int game.C_100294_ki.field_106951_E
		// @1EC: iadd
		// @1ED: sipush 4352 (0x1100)
		// @1F0: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @1F3: ifne @1FE
		// @1F6: goto @1FA
		// @1F9: athrow
		// @1FA: goto @29B
		// @1FD: athrow
		// @1FE: ldc_w 80000 (0x13880)
		// @201: iload #6
		// @203: invokestatic java.lang.Math.abs(int)int
		// @206: if_icmpge @29B
		// @209: aload #5
		// @20B: getfield int game.C_100314_lf.field_101310_Mb
		// @20E: ifle @29B
		// @211: goto @215
		// @214: athrow
		// @215: new game.C_100087_n
		// @218: dup
		// @219: iconst_3
		// @21A: iconst_0
		// @21B: aload_0
		// @21C: getfield int game.C_100294_ki.field_106951_E
		// @21F: bipush -30 (0xE2)
		// @221: isub
		// @222: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @225: astore #8
		// @227: aload #8
		// @229: iload #4
		// @22B: sipush 20000 (0x4E20)
		// @22E: imul
		// @22F: aload #5
		// @231: getfield int game.C_100314_lf.field_101377_tc
		// @234: iadd
		// @235: putfield int game.C_100087_n.field_100699_t
		// @238: aload #8
		// @23A: iconst_1
		// @23B: putfield boolean game.C_100087_n.field_100703_p
		// @23E: aload #8
		// @240: aload #5
		// @242: getfield int game.C_100314_lf.field_101395_rc
		// @245: sipush -20000 (0xB1E0)
		// @248: iadd
		// @249: putfield int game.C_100087_n.field_100698_u
		// @24C: aload #5
		// @24E: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @251: bipush 127 (0x7F)
		// @253: aload #8
		// @255: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @258: iload #9
		// @25A: ifeq @29B
		// @25D: aload_0
		// @25E: iconst_1
		// @25F: bipush -113 (0x8F)
		// @261: aload_3
		// @262: aload_0
		// @263: getfield int game.C_100294_ki.field_106964_J
		// @266: aload #5
		// @268: aload_0
		// @269: getfield int game.C_100294_ki.field_106951_E
		// @26C: bipush -25 (0xE7)
		// @26E: isub
		// @26F: sipush 1728 (0x06C0)
		// @272: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @275: ifne @29B
		// @278: goto @27C
		// @27B: athrow
		// @27C: aload_0
		// @27D: iconst_0
		// @27E: bipush -100 (0x9C)
		// @280: aload_3
		// @281: aload_0
		// @282: getfield int game.C_100294_ki.field_106964_J
		// @285: aload #5
		// @287: bipush 25 (0x19)
		// @289: aload_0
		// @28A: getfield int game.C_100294_ki.field_106951_E
		// @28D: iadd
		// @28E: sipush 4352 (0x1100)
		// @291: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @294: ifeq @29B
		// @297: goto @29B
		// @29A: athrow
		// @29B: goto @314
		// @29E: astore #7
		// @2A0: aload #7
		// @2A2: new java.lang.StringBuilder
		// @2A5: dup
		// @2A6: invokespecial java.lang.StringBuilder.<init>()void
		// @2A9: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2AC: bipush 32 (0x20)
		// @2AE: aaload
		// @2AF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B2: iload_1
		// @2B3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2B6: bipush 44 (0x2C)
		// @2B8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2BB: iload_2
		// @2BC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2BF: bipush 44 (0x2C)
		// @2C1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C4: aload_3
		// @2C5: ifnull @2D1
		// @2C8: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2CB: iconst_1
		// @2CC: aaload
		// @2CD: goto @2D6
		// @2D0: athrow
		// @2D1: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2D4: iconst_4
		// @2D5: aaload
		// @2D6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D9: bipush 44 (0x2C)
		// @2DB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2DE: iload #4
		// @2E0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2E3: bipush 44 (0x2C)
		// @2E5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E8: aload #5
		// @2EA: ifnull @2F6
		// @2ED: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2F0: iconst_1
		// @2F1: aaload
		// @2F2: goto @2FB
		// @2F5: athrow
		// @2F6: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2F9: iconst_4
		// @2FA: aaload
		// @2FB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2FE: bipush 44 (0x2C)
		// @300: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @303: iload #6
		// @305: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @308: bipush 41 (0x29)
		// @30A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @30D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @310: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @313: athrow
		// @314: return
	}
	
	private final void func_106923_a(int arg0, int arg1, C_100314_lf arg2, int arg3, int arg4, C_100314_lf arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: iconst_1
		// @006: istore #7
		// @008: iconst_0
		// @009: istore #8
		// @00B: iload #7
		// @00D: ifeq @014
		// @010: goto @015
		// @013: athrow
		// @014: return
		// @015: aload #6
		// @017: getfield int[] game.C_100314_lf.field_101416_ab
		// @01A: iconst_4
		// @01B: iaload
		// @01C: iconst_m1
		// @01D: ixor
		// @01E: bipush -20 (0xEC)
		// @020: if_icmpne @052
		// @023: aload #6
		// @025: getfield boolean game.C_100314_lf.field_101391_lb
		// @028: ifne @07A
		// @02B: goto @02F
		// @02E: athrow
		// @02F: aload_0
		// @030: iconst_4
		// @031: bipush -121 (0x87)
		// @033: aload_3
		// @034: aload_0
		// @035: getfield int game.C_100294_ki.field_106964_J
		// @038: iconst_2
		// @039: idiv
		// @03A: aload #6
		// @03C: iconst_5
		// @03D: aload_0
		// @03E: getfield int game.C_100294_ki.field_106951_E
		// @041: iadd
		// @042: sipush 2600 (0x0A28)
		// @045: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @048: pop
		// @049: iload #10
		// @04B: ifeq @07A
		// @04E: goto @052
		// @051: athrow
		// @052: aload #6
		// @054: getfield boolean game.C_100314_lf.field_101391_lb
		// @057: ifne @07A
		// @05A: goto @05E
		// @05D: athrow
		// @05E: aload_0
		// @05F: iconst_4
		// @060: bipush -85 (0xAB)
		// @062: aload_3
		// @063: aload_0
		// @064: getfield int game.C_100294_ki.field_106964_J
		// @067: aload #6
		// @069: iconst_5
		// @06A: aload_0
		// @06B: getfield int game.C_100294_ki.field_106951_E
		// @06E: iadd
		// @06F: sipush 2600 (0x0A28)
		// @072: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @075: pop
		// @076: goto @07A
		// @079: athrow
		// @07A: iload_1
		// @07B: sipush -17900 (0xBA14)
		// @07E: if_icmpeq @08B
		// @081: aload_0
		// @082: bipush -61 (0xC3)
		// @084: putfield int game.C_100294_ki.field_106961_H
		// @087: goto @08B
		// @08A: athrow
		// @08B: iload #8
		// @08D: ifne @0FA
		// @090: aload_0
		// @091: iconst_2
		// @092: bipush -73 (0xB7)
		// @094: aload_3
		// @095: aload_0
		// @096: getfield int game.C_100294_ki.field_106964_J
		// @099: aload #6
		// @09B: aload_0
		// @09C: getfield int game.C_100294_ki.field_106951_E
		// @09F: bipush -25 (0xE7)
		// @0A1: isub
		// @0A2: sipush 2304 (0x0900)
		// @0A5: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @0A8: ifeq @0FA
		// @0AB: goto @0AF
		// @0AE: athrow
		// @0AF: aload #6
		// @0B1: getfield int game.C_100314_lf.field_101369_z
		// @0B4: iconst_m1
		// @0B5: ixor
		// @0B6: iconst_m1
		// @0B7: if_icmpne @15E
		// @0BA: goto @0BE
		// @0BD: athrow
		// @0BE: iload_2
		// @0BF: invokestatic java.lang.Math.abs(int)int
		// @0C2: sipush 30000 (0x7530)
		// @0C5: if_icmplt @15E
		// @0C8: goto @0CC
		// @0CB: athrow
		// @0CC: new game.C_100087_n
		// @0CF: dup
		// @0D0: bipush 6 (0x06)
		// @0D2: iload #4
		// @0D4: aload_0
		// @0D5: getfield int game.C_100294_ki.field_106951_E
		// @0D8: bipush 27 (0x1B)
		// @0DA: iadd
		// @0DB: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @0DE: astore #9
		// @0E0: aload #9
		// @0E2: iconst_1
		// @0E3: putfield boolean game.C_100087_n.field_100703_p
		// @0E6: aload #6
		// @0E8: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0EB: iload_1
		// @0EC: sipush 18027 (0x466B)
		// @0EF: iadd
		// @0F0: aload #9
		// @0F2: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0F5: iload #10
		// @0F7: ifeq @15E
		// @0FA: iload_2
		// @0FB: invokestatic java.lang.Math.abs(int)int
		// @0FE: ldc_w 60000 (0xea60)
		// @101: if_icmpgt @115
		// @104: goto @108
		// @107: athrow
		// @108: iconst_0
		// @109: aload #6
		// @10B: getfield int game.C_100314_lf.field_101309_wb
		// @10E: if_icmpne @13A
		// @111: goto @115
		// @114: athrow
		// @115: new game.C_100087_n
		// @118: dup
		// @119: bipush 6 (0x06)
		// @11B: iload #4
		// @11D: iconst_2
		// @11E: aload_0
		// @11F: getfield int game.C_100294_ki.field_106951_E
		// @122: iadd
		// @123: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @126: astore #9
		// @128: aload #9
		// @12A: iconst_1
		// @12B: putfield boolean game.C_100087_n.field_100703_p
		// @12E: aload #6
		// @130: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @133: bipush 126 (0x7E)
		// @135: aload #9
		// @137: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @13A: ldc_w 100000 (0x186a0)
		// @13D: iload_2
		// @13E: invokestatic java.lang.Math.abs(int)int
		// @141: if_icmple @15E
		// @144: aload_0
		// @145: iconst_0
		// @146: bipush -84 (0xAC)
		// @148: aload_3
		// @149: iconst_0
		// @14A: aload #6
		// @14C: bipush 25 (0x19)
		// @14E: aload_0
		// @14F: getfield int game.C_100294_ki.field_106951_E
		// @152: iadd
		// @153: sipush 2304 (0x0900)
		// @156: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @159: pop
		// @15A: goto @15E
		// @15D: athrow
		// @15E: iconst_0
		// @15F: aload #6
		// @161: getfield int game.C_100314_lf.field_101369_z
		// @164: if_icmpge @1AA
		// @167: new game.C_100087_n
		// @16A: dup
		// @16B: bipush 6 (0x06)
		// @16D: aload #6
		// @16F: getfield int game.C_100314_lf.field_101369_z
		// @172: aload #6
		// @174: getfield int game.C_100314_lf.field_101377_tc
		// @177: ldc_w 1030681252 (0x3d6ef2a4)
		// @17A: ishr
		// @17B: if_icmple @187
		// @17E: goto @182
		// @181: athrow
		// @182: iconst_1
		// @183: goto @188
		// @186: athrow
		// @187: iconst_m1
		// @188: iconst_2
		// @189: aload_0
		// @18A: getfield int game.C_100294_ki.field_106951_E
		// @18D: iadd
		// @18E: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @191: astore #9
		// @193: aload #9
		// @195: iconst_1
		// @196: putfield boolean game.C_100087_n.field_100703_p
		// @199: aload #6
		// @19B: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @19E: bipush 127 (0x7F)
		// @1A0: aload #9
		// @1A2: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1A5: iload #10
		// @1A7: ifeq @1E5
		// @1AA: sipush -30001 (0x8ACF)
		// @1AD: iload_2
		// @1AE: invokestatic java.lang.Math.abs(int)int
		// @1B1: iconst_m1
		// @1B2: ixor
		// @1B3: if_icmplt @1BE
		// @1B6: goto @1BA
		// @1B9: athrow
		// @1BA: goto @1E5
		// @1BD: athrow
		// @1BE: new game.C_100087_n
		// @1C1: dup
		// @1C2: bipush 6 (0x06)
		// @1C4: iload #4
		// @1C6: ineg
		// @1C7: aload_0
		// @1C8: getfield int game.C_100294_ki.field_106951_E
		// @1CB: bipush -29 (0xE3)
		// @1CD: isub
		// @1CE: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @1D1: astore #9
		// @1D3: aload #9
		// @1D5: iconst_1
		// @1D6: putfield boolean game.C_100087_n.field_100703_p
		// @1D9: aload #6
		// @1DB: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @1DE: bipush 127 (0x7F)
		// @1E0: aload #9
		// @1E2: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1E5: goto @25E
		// @1E8: astore #7
		// @1EA: aload #7
		// @1EC: new java.lang.StringBuilder
		// @1EF: dup
		// @1F0: invokespecial java.lang.StringBuilder.<init>()void
		// @1F3: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @1F6: bipush 50 (0x32)
		// @1F8: aaload
		// @1F9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1FC: iload_1
		// @1FD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @200: bipush 44 (0x2C)
		// @202: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @205: iload_2
		// @206: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @209: bipush 44 (0x2C)
		// @20B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @20E: aload_3
		// @20F: ifnull @21B
		// @212: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @215: iconst_1
		// @216: aaload
		// @217: goto @220
		// @21A: athrow
		// @21B: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @21E: iconst_4
		// @21F: aaload
		// @220: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @223: bipush 44 (0x2C)
		// @225: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @228: iload #4
		// @22A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @22D: bipush 44 (0x2C)
		// @22F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @232: iload #5
		// @234: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @237: bipush 44 (0x2C)
		// @239: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @23C: aload #6
		// @23E: ifnull @24A
		// @241: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @244: iconst_1
		// @245: aaload
		// @246: goto @24F
		// @249: athrow
		// @24A: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @24D: iconst_4
		// @24E: aaload
		// @24F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @252: bipush 41 (0x29)
		// @254: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @257: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @25A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @25D: athrow
		// @25E: return
	}
	
	private final boolean func_106924_a(int arg0, int arg1, C_100314_lf arg2, int arg3, C_100314_lf arg4, int arg5, int arg6)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #30
		// @005: bipush 11 (0x0B)
		// @007: aload #5
		// @009: getfield int game.C_100314_lf.field_101387_Xb
		// @00C: if_icmpeq @033
		// @00F: getstatic int game.C_100218_am.field_103115_N
		// @012: iconst_m1
		// @013: ixor
		// @014: bipush -11 (0xF5)
		// @016: if_icmpne @044
		// @019: goto @01D
		// @01C: athrow
		// @01D: iconst_1
		// @01E: getstatic int game.C_100194_rd.field_103072_v
		// @021: if_icmpne @044
		// @024: goto @028
		// @027: athrow
		// @028: iconst_2
		// @029: getstatic int game.C_100197_ra.field_100867_r
		// @02C: if_icmplt @044
		// @02F: goto @033
		// @032: athrow
		// @033: iconst_0
		// @034: aload #5
		// @036: getfield int[] game.C_100314_lf.field_101394_zc
		// @039: iload_1
		// @03A: iaload
		// @03B: if_icmpge @044
		// @03E: goto @042
		// @041: athrow
		// @042: iconst_0
		// @043: ireturn
		// @044: new game.C_100087_n
		// @047: dup
		// @048: iconst_0
		// @049: aload #5
		// @04B: getfield int[] game.C_100314_lf.field_101416_ab
		// @04E: iload_1
		// @04F: iaload
		// @050: iload #6
		// @052: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @055: astore #8
		// @057: aload #8
		// @059: aload_3
		// @05A: getfield int game.C_100314_lf.field_101395_rc
		// @05D: putfield int game.C_100087_n.field_100698_u
		// @060: aload #8
		// @062: aload_3
		// @063: getfield int game.C_100314_lf.field_101377_tc
		// @066: putfield int game.C_100087_n.field_100699_t
		// @069: aload #5
		// @06B: getfield int game.C_100314_lf.field_101377_tc
		// @06E: aload_3
		// @06F: getfield int game.C_100314_lf.field_101377_tc
		// @072: if_icmpge @07A
		// @075: iconst_1
		// @076: goto @07B
		// @079: athrow
		// @07A: iconst_m1
		// @07B: istore #9
		// @07D: aload #5
		// @07F: getfield boolean game.C_100314_lf.field_101391_lb
		// @082: ifne @090
		// @085: aload_3
		// @086: getfield boolean game.C_100314_lf.field_101391_lb
		// @089: ifeq @095
		// @08C: goto @090
		// @08F: athrow
		// @090: iconst_1
		// @091: goto @096
		// @094: athrow
		// @095: iconst_0
		// @096: istore #10
		// @098: aload #5
		// @09A: getfield int game.C_100314_lf.field_101347_Gb
		// @09D: iconst_1
		// @09E: iand
		// @09F: sipush 256 (0x0100)
		// @0A2: imul
		// @0A3: aload_0
		// @0A4: getfield int game.C_100294_ki.field_106951_E
		// @0A7: aload #5
		// @0A9: getfield int game.C_100314_lf.field_101347_Gb
		// @0AC: bipush 15 (0x0F)
		// @0AE: imul
		// @0AF: iadd
		// @0B0: sipush 256 (0x0100)
		// @0B3: iand
		// @0B4: iadd
		// @0B5: ifeq @0BC
		// @0B8: goto @0C9
		// @0BB: athrow
		// @0BC: iload #10
		// @0BE: ifne @0C6
		// @0C1: iconst_1
		// @0C2: goto @0C7
		// @0C5: athrow
		// @0C6: iconst_0
		// @0C7: istore #10
		// @0C9: aload_0
		// @0CA: iload #9
		// @0CC: iload #4
		// @0CE: aload_3
		// @0CF: getfield int game.C_100314_lf.field_101377_tc
		// @0D2: aload #5
		// @0D4: getfield int game.C_100314_lf.field_101377_tc
		// @0D7: isub
		// @0D8: bipush 60 (0x3C)
		// @0DA: aload #5
		// @0DC: getfield int game.C_100314_lf.field_101395_rc
		// @0DF: ineg
		// @0E0: aload_3
		// @0E1: getfield int game.C_100314_lf.field_101395_rc
		// @0E4: iadd
		// @0E5: iload #7
		// @0E7: invokespecial game.C_100294_ki.func_106940_a(int, int, int, byte, int, int)int[]
		// @0EA: astore #11
		// @0EC: aload #5
		// @0EE: getfield int[] game.C_100314_lf.field_101416_ab
		// @0F1: iload_1
		// @0F2: iaload
		// @0F3: iconst_m1
		// @0F4: ixor
		// @0F5: bipush -7 (0xF9)
		// @0F7: if_icmpeq @0FE
		// @0FA: goto @101
		// @0FD: athrow
		// @0FE: iconst_1
		// @0FF: istore #10
		// @101: iconst_2
		// @102: newarray long[]
		// @104: dup
		// @105: iconst_0
		// @106: lconst_0
		// @107: lastore
		// @108: dup
		// @109: iconst_1
		// @10A: lconst_0
		// @10B: lastore
		// @10C: astore #12
		// @10E: iconst_0
		// @10F: istore #13
		// @111: iload_2
		// @112: bipush -54 (0xCA)
		// @114: if_icmple @12F
		// @117: aload_0
		// @118: bipush 57 (0x39)
		// @11A: bipush -11 (0xF5)
		// @11C: bipush 42 (0x2A)
		// @11E: aconst_null
		// @11F: checkcast game.C_100314_lf
		// @122: bipush -81 (0xAF)
		// @124: aconst_null
		// @125: checkcast game.C_100314_lf
		// @128: invokespecial game.C_100294_ki.func_106914_a(int, int, int, game.C_100314_lf, int, game.C_100314_lf)void
		// @12B: goto @12F
		// @12E: athrow
		// @12F: aload #5
		// @131: getfield game.C_100327_ib[] game.C_100314_lf.field_101305_hc
		// @134: arraylength
		// @135: istore #14
		// @137: aload #5
		// @139: getfield boolean game.C_100314_lf.field_101307_pb
		// @13C: ifeq @14F
		// @13F: aload #5
		// @141: ldc 312774288 (0x12a48e90)
		// @143: bipush 31 (0x1F)
		// @145: invokevirtual game.C_100314_lf.func_101268_f(int, int)boolean
		// @148: ifeq @154
		// @14B: goto @14F
		// @14E: athrow
		// @14F: iconst_1
		// @150: goto @155
		// @153: athrow
		// @154: iconst_0
		// @155: istore #16
		// @157: iconst_0
		// @158: istore #17
		// @15A: iload #14
		// @15C: iload #17
		// @15E: if_icmple @257
		// @161: aload #5
		// @163: getfield game.C_100327_ib[] game.C_100314_lf.field_101305_hc
		// @166: iload #17
		// @168: aaload
		// @169: astore #15
		// @16B: aload #15
		// @16D: getfield int game.C_100327_ib.field_102494_P
		// @170: sipush -8444 (0xDF04)
		// @173: invokestatic game.C_100021_wn.func_103867_a(int, int)int
		// @176: iload #30
		// @178: ifne @259
		// @17B: aload #8
		// @17D: getfield int game.C_100087_n.field_100704_z
		// @180: if_icmpne @24F
		// @183: goto @187
		// @186: athrow
		// @187: aload #15
		// @189: getfield int game.C_100327_ib.field_102478_E
		// @18C: iconst_m1
		// @18D: ixor
		// @18E: iconst_m1
		// @18F: if_icmplt @24F
		// @192: goto @196
		// @195: athrow
		// @196: aload #11
		// @198: iconst_0
		// @199: iaload
		// @19A: invokestatic java.lang.Math.abs(int)int
		// @19D: iconst_m1
		// @19E: ixor
		// @19F: aload #15
		// @1A1: getfield int game.C_100327_ib.field_102480_G
		// @1A4: iconst_m1
		// @1A5: ixor
		// @1A6: if_icmpgt @1F1
		// @1A9: goto @1AD
		// @1AC: athrow
		// @1AD: aload #11
		// @1AF: iconst_0
		// @1B0: iaload
		// @1B1: invokestatic java.lang.Math.abs(int)int
		// @1B4: iconst_m1
		// @1B5: ixor
		// @1B6: aload #15
		// @1B8: getfield int game.C_100327_ib.field_102504_x
		// @1BB: iconst_m1
		// @1BC: ixor
		// @1BD: if_icmplt @1F1
		// @1C0: goto @1C4
		// @1C3: athrow
		// @1C4: iload #16
		// @1C6: ifne @1DE
		// @1C9: goto @1CD
		// @1CC: athrow
		// @1CD: aload #15
		// @1CF: getfield int game.C_100327_ib.field_102494_P
		// @1D2: bipush 123 (0x7B)
		// @1D4: invokestatic game.C_100158_da.func_100581_a(int, byte)boolean
		// @1D7: ifne @1F1
		// @1DA: goto @1DE
		// @1DD: athrow
		// @1DE: aload #12
		// @1E0: iconst_0
		// @1E1: aload #12
		// @1E3: iconst_0
		// @1E4: laload
		// @1E5: lconst_1
		// @1E6: iload #17
		// @1E8: lshl
		// @1E9: invokestatic game.C_100009_fg.func_103650_a(long, long)long
		// @1EC: lastore
		// @1ED: goto @1F1
		// @1F0: athrow
		// @1F1: aload #11
		// @1F3: iconst_1
		// @1F4: iaload
		// @1F5: invokestatic java.lang.Math.abs(int)int
		// @1F8: iconst_m1
		// @1F9: ixor
		// @1FA: aload #15
		// @1FC: getfield int game.C_100327_ib.field_102480_G
		// @1FF: iconst_m1
		// @200: ixor
		// @201: if_icmpgt @248
		// @204: aload #11
		// @206: iconst_1
		// @207: iaload
		// @208: invokestatic java.lang.Math.abs(int)int
		// @20B: iconst_m1
		// @20C: ixor
		// @20D: aload #15
		// @20F: getfield int game.C_100327_ib.field_102504_x
		// @212: iconst_m1
		// @213: ixor
		// @214: if_icmplt @248
		// @217: goto @21B
		// @21A: athrow
		// @21B: iload #16
		// @21D: ifne @239
		// @220: goto @224
		// @223: athrow
		// @224: aload #15
		// @226: getfield int game.C_100327_ib.field_102494_P
		// @229: bipush 110 (0x6E)
		// @22B: invokestatic game.C_100158_da.func_100581_a(int, byte)boolean
		// @22E: ifeq @239
		// @231: goto @235
		// @234: athrow
		// @235: goto @248
		// @238: athrow
		// @239: aload #12
		// @23B: iconst_1
		// @23C: aload #12
		// @23E: iconst_1
		// @23F: laload
		// @240: lconst_1
		// @241: iload #17
		// @243: lshl
		// @244: invokestatic game.C_100009_fg.func_103650_a(long, long)long
		// @247: lastore
		// @248: aload #15
		// @24A: getfield int game.C_100327_ib.field_102494_P
		// @24D: istore #13
		// @24F: iinc #17 +1
		// @252: iload #30
		// @254: ifeq @15A
		// @257: iload #10
		// @259: ifne @261
		// @25C: iconst_0
		// @25D: goto @262
		// @260: athrow
		// @261: iconst_1
		// @262: istore #17
		// @264: aload #12
		// @266: iload #17
		// @268: laload
		// @269: lstore #18
		// @26B: aload #8
		// @26D: aload #11
		// @26F: iload #17
		// @271: iaload
		// @272: putfield int game.C_100087_n.field_100693_m
		// @275: lload #18
		// @277: lconst_0
		// @278: lcmp
		// @279: ifeq @288
		// @27C: aload #8
		// @27E: getfield int game.C_100087_n.field_100693_m
		// @281: ifne @2A0
		// @284: goto @288
		// @287: athrow
		// @288: iconst_1
		// @289: iload #17
		// @28B: ineg
		// @28C: iadd
		// @28D: istore #17
		// @28F: aload #8
		// @291: aload #11
		// @293: iload #17
		// @295: iaload
		// @296: putfield int game.C_100087_n.field_100693_m
		// @299: aload #12
		// @29B: iload #17
		// @29D: laload
		// @29E: lstore #18
		// @2A0: ldc2_w -1
		// @2A3: lload #18
		// @2A5: ldc2_w -1
		// @2A8: lxor
		// @2A9: lcmp
		// @2AA: ifeq @4C0
		// @2AD: aload #8
		// @2AF: getfield int game.C_100087_n.field_100693_m
		// @2B2: iconst_m1
		// @2B3: ixor
		// @2B4: iconst_m1
		// @2B5: if_icmpeq @4C0
		// @2B8: goto @2BC
		// @2BB: athrow
		// @2BC: new game.C_100048_vi
		// @2BF: dup
		// @2C0: aload #5
		// @2C2: invokespecial game.C_100048_vi.<init>(game.C_100314_lf)void
		// @2C5: astore #20
		// @2C7: aload #20
		// @2C9: iload #9
		// @2CB: putfield int game.C_100048_vi.field_104170_f
		// @2CE: aload #5
		// @2D0: getfield int game.C_100314_lf.field_101377_tc
		// @2D3: istore #21
		// @2D5: aload #5
		// @2D7: getfield int game.C_100314_lf.field_101299_xc
		// @2DA: ldc_w -1685301629 (0x9b8c5683)
		// @2DD: ishl
		// @2DE: ineg
		// @2DF: aload #5
		// @2E1: getfield int game.C_100314_lf.field_101395_rc
		// @2E4: iadd
		// @2E5: istore #22
		// @2E7: aload #20
		// @2E9: aload #8
		// @2EB: getfield int game.C_100087_n.field_100699_t
		// @2EE: iload #13
		// @2F0: aload #8
		// @2F2: getfield int game.C_100087_n.field_100693_m
		// @2F5: aload #8
		// @2F7: getfield int game.C_100087_n.field_100698_u
		// @2FA: iload #22
		// @2FC: iconst_1
		// @2FD: iload #21
		// @2FF: invokevirtual game.C_100048_vi.func_104167_a(int, int, int, int, int, boolean, int)game.C_100018_wk
		// @302: astore #23
		// @304: aload #23
		// @306: iconst_1
		// @307: putfield boolean game.C_100018_wk.field_101547_v
		// @30A: aconst_null
		// @30B: aload #23
		// @30D: if_acmpeq @3FD
		// @310: iconst_0
		// @311: istore #24
		// @313: iconst_0
		// @314: istore #25
		// @316: iconst_0
		// @317: istore #28
		// @319: iconst_0
		// @31A: istore #29
		// @31C: iload #29
		// @31E: bipush 50 (0x32)
		// @320: if_icmpge @3E5
		// @323: aload #23
		// @325: getfield boolean game.C_100018_wk.field_101523_O
		// @328: iload #30
		// @32A: ifne @3E7
		// @32D: ifne @3E5
		// @330: goto @334
		// @333: athrow
		// @334: aload #23
		// @336: bipush 126 (0x7E)
		// @338: invokevirtual game.C_100018_wk.func_101507_i(int)void
		// @33B: aload_3
		// @33C: getfield int game.C_100314_lf.field_101377_tc
		// @33F: ineg
		// @340: aload #23
		// @342: getfield int game.C_100018_wk.field_101514_F
		// @345: iadd
		// @346: invokestatic java.lang.Math.abs(int)int
		// @349: ldc_w -1848450492 (0x91d2e244)
		// @34C: ishr
		// @34D: istore #26
		// @34F: aload_3
		// @350: getfield int game.C_100314_lf.field_101395_rc
		// @353: ineg
		// @354: aload #23
		// @356: getfield int game.C_100018_wk.field_101545_fb
		// @359: iadd
		// @35A: invokestatic java.lang.Math.abs(int)int
		// @35D: ldc_w -135319356 (0xf7ef30c4)
		// @360: ishr
		// @361: istore #27
		// @363: iload #26
		// @365: iload #26
		// @367: imul
		// @368: iload #27
		// @36A: iload #27
		// @36C: imul
		// @36D: iadd
		// @36E: istore #24
		// @370: aload #20
		// @372: getfield int game.C_100048_vi.field_104176_a
		// @375: ineg
		// @376: aload #23
		// @378: getfield int game.C_100018_wk.field_101514_F
		// @37B: iadd
		// @37C: invokestatic java.lang.Math.abs(int)int
		// @37F: ldc_w 863543972 (0x3378a2a4)
		// @382: ishr
		// @383: istore #26
		// @385: iload #24
		// @387: iconst_m1
		// @388: ixor
		// @389: iconst_m1
		// @38A: if_icmpgt @391
		// @38D: goto @395
		// @390: athrow
		// @391: ldc 2147483647 (0x7fffffff)
		// @393: istore #24
		// @395: aload #23
		// @397: getfield int game.C_100018_wk.field_101545_fb
		// @39A: aload #20
		// @39C: getfield int game.C_100048_vi.field_104178_o
		// @39F: isub
		// @3A0: invokestatic java.lang.Math.abs(int)int
		// @3A3: ldc_w -663344828 (0xd8762944)
		// @3A6: ishr
		// @3A7: istore #27
		// @3A9: iload #27
		// @3AB: iload #27
		// @3AD: imul
		// @3AE: iload #26
		// @3B0: iload #26
		// @3B2: imul
		// @3B3: iadd
		// @3B4: istore #25
		// @3B6: iload #25
		// @3B8: iconst_m1
		// @3B9: ixor
		// @3BA: iconst_m1
		// @3BB: if_icmpgt @3D1
		// @3BE: iload #24
		// @3C0: iconst_m1
		// @3C1: ixor
		// @3C2: iload #25
		// @3C4: iconst_m1
		// @3C5: ixor
		// @3C6: if_icmpgt @3D1
		// @3C9: goto @3CD
		// @3CC: athrow
		// @3CD: goto @3D9
		// @3D0: athrow
		// @3D1: iconst_1
		// @3D2: istore #28
		// @3D4: iload #30
		// @3D6: ifeq @3E5
		// @3D9: iinc #29 +1
		// @3DC: iload #30
		// @3DE: ifeq @31C
		// @3E1: goto @3E5
		// @3E4: athrow
		// @3E5: iload #28
		// @3E7: ifne @3FD
		// @3EA: iload #29
		// @3EC: iconst_m1
		// @3ED: ixor
		// @3EE: bipush -51 (0xCD)
		// @3F0: if_icmpgt @3FB
		// @3F3: goto @3F7
		// @3F6: athrow
		// @3F7: goto @3FD
		// @3FA: athrow
		// @3FB: iconst_0
		// @3FC: ireturn
		// @3FD: ldc2_w -1
		// @400: lload #18
		// @402: ldc2_w -1
		// @405: lxor
		// @406: lcmp
		// @407: ifle @4C0
		// @40A: bipush -14 (0xF2)
		// @40C: aload #5
		// @40E: getfield int[] game.C_100314_lf.field_101416_ab
		// @411: iload_1
		// @412: iaload
		// @413: iconst_m1
		// @414: ixor
		// @415: if_icmpeq @4AC
		// @418: goto @41C
		// @41B: athrow
		// @41C: bipush 11 (0x0B)
		// @41E: aload #5
		// @420: getfield int[] game.C_100314_lf.field_101416_ab
		// @423: iload_1
		// @424: iaload
		// @425: if_icmpeq @4AC
		// @428: goto @42C
		// @42B: athrow
		// @42C: aload #5
		// @42E: getfield int[] game.C_100314_lf.field_101416_ab
		// @431: iload_1
		// @432: iaload
		// @433: bipush 12 (0x0C)
		// @435: if_icmpeq @4AC
		// @438: goto @43C
		// @43B: athrow
		// @43C: bipush 15 (0x0F)
		// @43E: aload #5
		// @440: getfield int[] game.C_100314_lf.field_101416_ab
		// @443: iload_1
		// @444: iaload
		// @445: if_icmpeq @4AC
		// @448: goto @44C
		// @44B: athrow
		// @44C: aload #5
		// @44E: getfield int[] game.C_100314_lf.field_101416_ab
		// @451: iload_1
		// @452: iaload
		// @453: bipush 17 (0x11)
		// @455: if_icmpeq @4AC
		// @458: goto @45C
		// @45B: athrow
		// @45C: aload #5
		// @45E: getfield int[] game.C_100314_lf.field_101416_ab
		// @461: iload_1
		// @462: iaload
		// @463: iconst_m1
		// @464: ixor
		// @465: bipush -19 (0xED)
		// @467: if_icmpeq @4AC
		// @46A: goto @46E
		// @46D: athrow
		// @46E: aload #5
		// @470: getfield int[] game.C_100314_lf.field_101416_ab
		// @473: iload_1
		// @474: iaload
		// @475: iconst_m1
		// @476: ixor
		// @477: bipush -15 (0xF1)
		// @479: if_icmpeq @4AC
		// @47C: goto @480
		// @47F: athrow
		// @480: bipush -17 (0xEF)
		// @482: aload #5
		// @484: getfield int[] game.C_100314_lf.field_101416_ab
		// @487: iload_1
		// @488: iaload
		// @489: iconst_m1
		// @48A: ixor
		// @48B: if_icmpeq @4AC
		// @48E: goto @492
		// @491: athrow
		// @492: aload #5
		// @494: getfield int[] game.C_100314_lf.field_101394_zc
		// @497: iload_1
		// @498: dup2
		// @499: iaload
		// @49A: aload #8
		// @49C: getfield int game.C_100087_n.field_100690_n
		// @49F: aload #8
		// @4A1: getfield int game.C_100087_n.field_100706_x
		// @4A4: ineg
		// @4A5: iadd
		// @4A6: iadd
		// @4A7: iastore
		// @4A8: goto @4AC
		// @4AB: athrow
		// @4AC: aload #8
		// @4AE: iconst_1
		// @4AF: putfield boolean game.C_100087_n.field_100703_p
		// @4B2: aload #5
		// @4B4: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @4B7: bipush 125 (0x7D)
		// @4B9: aload #8
		// @4BB: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @4BE: iconst_1
		// @4BF: ireturn
		// @4C0: iconst_0
		// @4C1: ireturn
		// @4C2: astore #8
		// @4C4: aload #8
		// @4C6: new java.lang.StringBuilder
		// @4C9: dup
		// @4CA: invokespecial java.lang.StringBuilder.<init>()void
		// @4CD: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @4D0: bipush 36 (0x24)
		// @4D2: aaload
		// @4D3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4D6: iload_1
		// @4D7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4DA: bipush 44 (0x2C)
		// @4DC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4DF: iload_2
		// @4E0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4E3: bipush 44 (0x2C)
		// @4E5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E8: aload_3
		// @4E9: ifnull @4F5
		// @4EC: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @4EF: iconst_1
		// @4F0: aaload
		// @4F1: goto @4FA
		// @4F4: athrow
		// @4F5: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @4F8: iconst_4
		// @4F9: aaload
		// @4FA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4FD: bipush 44 (0x2C)
		// @4FF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @502: iload #4
		// @504: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @507: bipush 44 (0x2C)
		// @509: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @50C: aload #5
		// @50E: ifnull @51A
		// @511: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @514: iconst_1
		// @515: aaload
		// @516: goto @51F
		// @519: athrow
		// @51A: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @51D: iconst_4
		// @51E: aaload
		// @51F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @522: bipush 44 (0x2C)
		// @524: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @527: iload #6
		// @529: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @52C: bipush 44 (0x2C)
		// @52E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @531: iload #7
		// @533: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @536: bipush 41 (0x29)
		// @538: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @53E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @541: athrow
	}
	
	private final void func_106916_a(int arg0, C_100314_lf arg1, int arg2, C_100314_lf arg3, int arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: aconst_null
		// @006: aload_2
		// @007: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @00A: if_acmpne @045
		// @00D: iconst_m1
		// @00E: aload_2
		// @00F: getfield int game.C_100314_lf.field_101310_Mb
		// @012: iconst_m1
		// @013: ixor
		// @014: if_icmpgt @01F
		// @017: goto @01B
		// @01A: athrow
		// @01B: goto @045
		// @01E: athrow
		// @01F: new game.C_100087_n
		// @022: dup
		// @023: iconst_5
		// @024: aload #4
		// @026: getfield int game.C_100314_lf.field_101347_Gb
		// @029: aload_0
		// @02A: getfield int game.C_100294_ki.field_106951_E
		// @02D: iconst_m1
		// @02E: isub
		// @02F: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @032: astore #6
		// @034: aload #6
		// @036: iconst_1
		// @037: putfield boolean game.C_100087_n.field_100703_p
		// @03A: aload_2
		// @03B: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @03E: bipush 125 (0x7D)
		// @040: aload #6
		// @042: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @045: aload_2
		// @046: getfield int game.C_100314_lf.field_101369_z
		// @049: iconst_m1
		// @04A: ixor
		// @04B: iconst_m1
		// @04C: if_icmplt @08C
		// @04F: iload #5
		// @051: invokestatic java.lang.Math.abs(int)int
		// @054: iconst_m1
		// @055: ixor
		// @056: ldc_w -80001 (0xfffec77f)
		// @059: if_icmplt @064
		// @05C: goto @060
		// @05F: athrow
		// @060: goto @0CC
		// @063: athrow
		// @064: new game.C_100087_n
		// @067: dup
		// @068: bipush 6 (0x06)
		// @06A: iload_3
		// @06B: iconst_2
		// @06C: aload_0
		// @06D: getfield int game.C_100294_ki.field_106951_E
		// @070: iadd
		// @071: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @074: astore #6
		// @076: aload #6
		// @078: iconst_1
		// @079: putfield boolean game.C_100087_n.field_100703_p
		// @07C: aload_2
		// @07D: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @080: bipush 124 (0x7C)
		// @082: aload #6
		// @084: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @087: iload #7
		// @089: ifeq @0CC
		// @08C: new game.C_100087_n
		// @08F: dup
		// @090: bipush 6 (0x06)
		// @092: aload_2
		// @093: getfield int game.C_100314_lf.field_101377_tc
		// @096: ldc_w 2030358596 (0x7904d044)
		// @099: ishr
		// @09A: iconst_m1
		// @09B: ixor
		// @09C: aload_2
		// @09D: getfield int game.C_100314_lf.field_101369_z
		// @0A0: iconst_m1
		// @0A1: ixor
		// @0A2: if_icmple @0AE
		// @0A5: goto @0A9
		// @0A8: athrow
		// @0A9: iconst_1
		// @0AA: goto @0AF
		// @0AD: athrow
		// @0AE: iconst_m1
		// @0AF: aload_0
		// @0B0: getfield int game.C_100294_ki.field_106951_E
		// @0B3: bipush -2 (0xFE)
		// @0B5: isub
		// @0B6: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @0B9: astore #6
		// @0BB: aload #6
		// @0BD: iconst_1
		// @0BE: putfield boolean game.C_100087_n.field_100703_p
		// @0C1: aload_2
		// @0C2: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0C5: bipush 126 (0x7E)
		// @0C7: aload #6
		// @0C9: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0CC: iload_1
		// @0CD: bipush -5 (0xFB)
		// @0CF: if_icmpeq @0DB
		// @0D2: bipush 94 (0x5E)
		// @0D4: putstatic int game.C_100294_ki.field_106971_P
		// @0D7: goto @0DB
		// @0DA: athrow
		// @0DB: new game.C_100087_n
		// @0DE: dup
		// @0DF: iconst_0
		// @0E0: aload_2
		// @0E1: getfield int[] game.C_100314_lf.field_101416_ab
		// @0E4: iconst_2
		// @0E5: iaload
		// @0E6: aload_0
		// @0E7: getfield int game.C_100294_ki.field_106951_E
		// @0EA: bipush -3 (0xFD)
		// @0EC: isub
		// @0ED: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @0F0: astore #6
		// @0F2: aload #6
		// @0F4: iconst_1
		// @0F5: putfield boolean game.C_100087_n.field_100703_p
		// @0F8: aload #6
		// @0FA: aload #4
		// @0FC: getfield int game.C_100314_lf.field_101395_rc
		// @0FF: putfield int game.C_100087_n.field_100698_u
		// @102: aload #6
		// @104: sipush 13384 (0x3448)
		// @107: aload_2
		// @108: getfield int game.C_100314_lf.field_101392_cc
		// @10B: imul
		// @10C: putfield int game.C_100087_n.field_100693_m
		// @10F: aload #6
		// @111: aload #4
		// @113: getfield int game.C_100314_lf.field_101377_tc
		// @116: putfield int game.C_100087_n.field_100699_t
		// @119: aload_2
		// @11A: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @11D: bipush 125 (0x7D)
		// @11F: aload #6
		// @121: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @124: iconst_m1
		// @125: aload_2
		// @126: getfield int game.C_100314_lf.field_101310_Mb
		// @129: iconst_m1
		// @12A: ixor
		// @12B: if_icmple @142
		// @12E: aload_2
		// @12F: getfield int game.C_100314_lf.field_101395_rc
		// @132: iconst_m1
		// @133: ixor
		// @134: aload #4
		// @136: getfield int game.C_100314_lf.field_101395_rc
		// @139: iconst_m1
		// @13A: ixor
		// @13B: if_icmplt @1AF
		// @13E: goto @142
		// @141: athrow
		// @142: aconst_null
		// @143: aload_2
		// @144: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @147: if_acmpeq @21A
		// @14A: goto @14E
		// @14D: athrow
		// @14E: new game.C_100087_n
		// @151: dup
		// @152: iconst_0
		// @153: aload_2
		// @154: getfield int[] game.C_100314_lf.field_101416_ab
		// @157: iconst_0
		// @158: iaload
		// @159: bipush 50 (0x32)
		// @15B: aload_0
		// @15C: getfield int game.C_100294_ki.field_106951_E
		// @15F: bipush -4 (0xFC)
		// @161: aload_2
		// @162: getfield int game.C_100314_lf.field_101377_tc
		// @165: aload #4
		// @167: getfield int game.C_100314_lf.field_101377_tc
		// @16A: aload_0
		// @16B: getfield int game.C_100294_ki.field_106951_E
		// @16E: iadd
		// @16F: iadd
		// @170: bipush 100 (0x64)
		// @172: irem
		// @173: isub
		// @174: isub
		// @175: iadd
		// @176: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @179: astore #6
		// @17B: aload #6
		// @17D: iconst_1
		// @17E: putfield boolean game.C_100087_n.field_100703_p
		// @181: aload #6
		// @183: aload #4
		// @185: getfield int game.C_100314_lf.field_101377_tc
		// @188: putfield int game.C_100087_n.field_100699_t
		// @18B: aload #6
		// @18D: aload #4
		// @18F: getfield int game.C_100314_lf.field_101395_rc
		// @192: putfield int game.C_100087_n.field_100698_u
		// @195: aload #6
		// @197: sipush 16384 (0x4000)
		// @19A: iload_3
		// @19B: imul
		// @19C: putfield int game.C_100087_n.field_100693_m
		// @19F: aload_2
		// @1A0: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @1A3: bipush 125 (0x7D)
		// @1A5: aload #6
		// @1A7: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1AA: iload #7
		// @1AC: ifeq @21A
		// @1AF: aconst_null
		// @1B0: aload_2
		// @1B1: getfield game.C_100314_lf game.C_100314_lf.field_101301_Cc
		// @1B4: if_acmpne @1BF
		// @1B7: goto @1BB
		// @1BA: athrow
		// @1BB: goto @21A
		// @1BE: athrow
		// @1BF: new game.C_100087_n
		// @1C2: dup
		// @1C3: iconst_0
		// @1C4: aload_2
		// @1C5: getfield int[] game.C_100314_lf.field_101416_ab
		// @1C8: iconst_1
		// @1C9: iaload
		// @1CA: bipush 25 (0x19)
		// @1CC: aload #4
		// @1CE: getfield int game.C_100314_lf.field_101377_tc
		// @1D1: aload_0
		// @1D2: getfield int game.C_100294_ki.field_106951_E
		// @1D5: aload_2
		// @1D6: getfield int game.C_100314_lf.field_101377_tc
		// @1D9: iadd
		// @1DA: iadd
		// @1DB: bipush 100 (0x64)
		// @1DD: irem
		// @1DE: aload_0
		// @1DF: getfield int game.C_100294_ki.field_106951_E
		// @1E2: iconst_4
		// @1E3: iadd
		// @1E4: iadd
		// @1E5: iadd
		// @1E6: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @1E9: astore #6
		// @1EB: aload #6
		// @1ED: aload #4
		// @1EF: getfield int game.C_100314_lf.field_101377_tc
		// @1F2: putfield int game.C_100087_n.field_100699_t
		// @1F5: aload #6
		// @1F7: iload_3
		// @1F8: sipush 15384 (0x3C18)
		// @1FB: imul
		// @1FC: putfield int game.C_100087_n.field_100693_m
		// @1FF: aload #6
		// @201: aload #4
		// @203: getfield int game.C_100314_lf.field_101395_rc
		// @206: putfield int game.C_100087_n.field_100698_u
		// @209: aload #6
		// @20B: iconst_1
		// @20C: putfield boolean game.C_100087_n.field_100703_p
		// @20F: aload_2
		// @210: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @213: bipush 125 (0x7D)
		// @215: aload #6
		// @217: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @21A: goto @289
		// @21D: astore #6
		// @21F: aload #6
		// @221: new java.lang.StringBuilder
		// @224: dup
		// @225: invokespecial java.lang.StringBuilder.<init>()void
		// @228: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @22B: bipush 37 (0x25)
		// @22D: aaload
		// @22E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @231: iload_1
		// @232: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @235: bipush 44 (0x2C)
		// @237: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @23A: aload_2
		// @23B: ifnull @247
		// @23E: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @241: iconst_1
		// @242: aaload
		// @243: goto @24C
		// @246: athrow
		// @247: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @24A: iconst_4
		// @24B: aaload
		// @24C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @24F: bipush 44 (0x2C)
		// @251: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @254: iload_3
		// @255: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @258: bipush 44 (0x2C)
		// @25A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @25D: aload #4
		// @25F: ifnull @26B
		// @262: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @265: iconst_1
		// @266: aaload
		// @267: goto @270
		// @26A: athrow
		// @26B: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @26E: iconst_4
		// @26F: aaload
		// @270: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @273: bipush 44 (0x2C)
		// @275: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @278: iload #5
		// @27A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @27D: bipush 41 (0x29)
		// @27F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @282: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @285: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @288: athrow
		// @289: return
	}
	
	private final void func_106911_a(int arg0, int arg1, byte arg2, int arg3, C_100314_lf arg4, C_100314_lf arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: iconst_m1
		// @006: aload #5
		// @008: getfield int game.C_100314_lf.field_101369_z
		// @00B: iconst_m1
		// @00C: ixor
		// @00D: if_icmple @057
		// @010: new game.C_100087_n
		// @013: dup
		// @014: bipush 6 (0x06)
		// @016: aload #5
		// @018: getfield int game.C_100314_lf.field_101377_tc
		// @01B: ldc_w 746210116 (0x2c7a4344)
		// @01E: ishr
		// @01F: iconst_m1
		// @020: ixor
		// @021: aload #5
		// @023: getfield int game.C_100314_lf.field_101369_z
		// @026: iconst_m1
		// @027: ixor
		// @028: if_icmple @034
		// @02B: goto @02F
		// @02E: athrow
		// @02F: iconst_1
		// @030: goto @035
		// @033: athrow
		// @034: iconst_m1
		// @035: iconst_2
		// @036: aload_0
		// @037: getfield int game.C_100294_ki.field_106951_E
		// @03A: iadd
		// @03B: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @03E: astore #7
		// @040: aload #7
		// @042: iconst_1
		// @043: putfield boolean game.C_100087_n.field_100703_p
		// @046: aload #5
		// @048: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @04B: bipush 127 (0x7F)
		// @04D: aload #7
		// @04F: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @052: iload #8
		// @054: ifeq @0D3
		// @057: ldc_w -40001 (0xffff63bf)
		// @05A: iload_1
		// @05B: invokestatic java.lang.Math.abs(int)int
		// @05E: iconst_m1
		// @05F: ixor
		// @060: if_icmplt @074
		// @063: goto @067
		// @066: athrow
		// @067: iload_2
		// @068: aload #5
		// @06A: getfield int game.C_100314_lf.field_101309_wb
		// @06D: if_icmpne @0AF
		// @070: goto @074
		// @073: athrow
		// @074: sipush -30001 (0x8ACF)
		// @077: iload_1
		// @078: invokestatic java.lang.Math.abs(int)int
		// @07B: iconst_m1
		// @07C: ixor
		// @07D: if_icmpge @0D3
		// @080: goto @084
		// @083: athrow
		// @084: new game.C_100087_n
		// @087: dup
		// @088: bipush 6 (0x06)
		// @08A: iload_2
		// @08B: ineg
		// @08C: aload_0
		// @08D: getfield int game.C_100294_ki.field_106951_E
		// @090: bipush -2 (0xFE)
		// @092: isub
		// @093: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @096: astore #7
		// @098: aload #7
		// @09A: iconst_1
		// @09B: putfield boolean game.C_100087_n.field_100703_p
		// @09E: aload #5
		// @0A0: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0A3: bipush 123 (0x7B)
		// @0A5: aload #7
		// @0A7: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0AA: iload #8
		// @0AC: ifeq @0D3
		// @0AF: new game.C_100087_n
		// @0B2: dup
		// @0B3: bipush 6 (0x06)
		// @0B5: iload_2
		// @0B6: aload_0
		// @0B7: getfield int game.C_100294_ki.field_106951_E
		// @0BA: iconst_2
		// @0BB: iadd
		// @0BC: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @0BF: astore #7
		// @0C1: aload #7
		// @0C3: iconst_1
		// @0C4: putfield boolean game.C_100087_n.field_100703_p
		// @0C7: aload #5
		// @0C9: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0CC: bipush 123 (0x7B)
		// @0CE: aload #7
		// @0D0: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0D3: aload_0
		// @0D4: iconst_3
		// @0D5: bipush -90 (0xA6)
		// @0D7: aload #6
		// @0D9: aload_0
		// @0DA: getfield int game.C_100294_ki.field_106964_J
		// @0DD: aload #5
		// @0DF: bipush 15 (0x0F)
		// @0E1: aload_0
		// @0E2: getfield int game.C_100294_ki.field_106951_E
		// @0E5: iadd
		// @0E6: sipush 2600 (0x0A28)
		// @0E9: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @0EC: ifne @189
		// @0EF: aload_0
		// @0F0: iconst_2
		// @0F1: bipush -111 (0x91)
		// @0F3: aload #6
		// @0F5: aload_0
		// @0F6: getfield int game.C_100294_ki.field_106964_J
		// @0F9: aload #5
		// @0FB: aload_0
		// @0FC: getfield int game.C_100294_ki.field_106951_E
		// @0FF: bipush 15 (0x0F)
		// @101: iadd
		// @102: sipush 2600 (0x0A28)
		// @105: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @108: ifne @189
		// @10B: goto @10F
		// @10E: athrow
		// @10F: ldc_w -80001 (0xfffec77f)
		// @112: iload_1
		// @113: invokestatic java.lang.Math.abs(int)int
		// @116: iconst_m1
		// @117: ixor
		// @118: if_icmpge @14B
		// @11B: goto @11F
		// @11E: athrow
		// @11F: aload #5
		// @121: getfield int game.C_100314_lf.field_101310_Mb
		// @124: ifle @14B
		// @127: goto @12B
		// @12A: athrow
		// @12B: aload_0
		// @12C: iconst_1
		// @12D: bipush -63 (0xC1)
		// @12F: aload #6
		// @131: aload_0
		// @132: getfield int game.C_100294_ki.field_106964_J
		// @135: aload #5
		// @137: aload_0
		// @138: getfield int game.C_100294_ki.field_106951_E
		// @13B: bipush -25 (0xE7)
		// @13D: isub
		// @13E: sipush 4608 (0x1200)
		// @141: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @144: ifne @16F
		// @147: goto @14B
		// @14A: athrow
		// @14B: aload_0
		// @14C: iconst_0
		// @14D: bipush -80 (0xB0)
		// @14F: aload #6
		// @151: aload_0
		// @152: getfield int game.C_100294_ki.field_106964_J
		// @155: aload #5
		// @157: aload_0
		// @158: getfield int game.C_100294_ki.field_106951_E
		// @15B: bipush 50 (0x32)
		// @15D: iadd
		// @15E: sipush 3072 (0x0C00)
		// @161: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @164: ifne @189
		// @167: goto @16B
		// @16A: athrow
		// @16B: goto @189
		// @16E: athrow
		// @16F: aload_0
		// @170: iconst_0
		// @171: bipush -98 (0x9E)
		// @173: aload #6
		// @175: aload_0
		// @176: getfield int game.C_100294_ki.field_106964_J
		// @179: aload #5
		// @17B: bipush 75 (0x4B)
		// @17D: aload_0
		// @17E: getfield int game.C_100294_ki.field_106951_E
		// @181: iadd
		// @182: sipush 2304 (0x0900)
		// @185: invokespecial game.C_100294_ki.func_106924_a(int, int, game.C_100314_lf, int, game.C_100314_lf, int, int)boolean
		// @188: pop
		// @189: iload_3
		// @18A: bipush 60 (0x3C)
		// @18C: if_icmpge @199
		// @18F: aload_0
		// @190: bipush -73 (0xB7)
		// @192: putfield int game.C_100294_ki.field_106999_q
		// @195: goto @199
		// @198: athrow
		// @199: goto @212
		// @19C: astore #7
		// @19E: aload #7
		// @1A0: new java.lang.StringBuilder
		// @1A3: dup
		// @1A4: invokespecial java.lang.StringBuilder.<init>()void
		// @1A7: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @1AA: bipush 53 (0x35)
		// @1AC: aaload
		// @1AD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1B0: iload_1
		// @1B1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1B4: bipush 44 (0x2C)
		// @1B6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1B9: iload_2
		// @1BA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1BD: bipush 44 (0x2C)
		// @1BF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1C2: iload_3
		// @1C3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1C6: bipush 44 (0x2C)
		// @1C8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1CB: iload #4
		// @1CD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1D0: bipush 44 (0x2C)
		// @1D2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D5: aload #5
		// @1D7: ifnull @1E3
		// @1DA: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @1DD: iconst_1
		// @1DE: aaload
		// @1DF: goto @1E8
		// @1E2: athrow
		// @1E3: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @1E6: iconst_4
		// @1E7: aaload
		// @1E8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1EB: bipush 44 (0x2C)
		// @1ED: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F0: aload #6
		// @1F2: ifnull @1FE
		// @1F5: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @1F8: iconst_1
		// @1F9: aaload
		// @1FA: goto @203
		// @1FD: athrow
		// @1FE: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @201: iconst_4
		// @202: aaload
		// @203: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @206: bipush 41 (0x29)
		// @208: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @20B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @20E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @211: athrow
		// @212: return
	}
	
	static final C_100187_rk func_106898_a(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: iload #4
		// @07: sipush 29717 (0x7415)
		// @0A: if_icmpeq @16
		// @0D: bipush -17 (0xEF)
		// @0F: invokestatic game.C_100294_ki.func_106936_a(byte)void
		// @12: goto @16
		// @15: athrow
		// @16: getstatic game.C_100202_qi game.C_100143_bl.field_105100_g
		// @19: bipush 112 (0x70)
		// @1B: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @1E: checkcast game.C_100187_rk
		// @21: astore #5
		// @23: aload #5
		// @25: ifnull @56
		// @28: aload #5
		// @2A: getfield int game.C_100187_rk.field_100831_u
		// @2D: iconst_m1
		// @2E: ixor
		// @2F: iload_2
		// @30: iconst_m1
		// @31: ixor
		// @32: iload #6
		// @34: ifne @81
		// @37: if_icmpeq @41
		// @3A: goto @3E
		// @3D: athrow
		// @3E: goto @44
		// @41: aload #5
		// @43: areturn
		// @44: getstatic game.C_100202_qi game.C_100143_bl.field_105100_g
		// @47: bipush 119 (0x77)
		// @49: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @4C: checkcast game.C_100187_rk
		// @4F: astore #5
		// @51: iload #6
		// @53: ifeq @23
		// @56: new game.C_100187_rk
		// @59: dup
		// @5A: invokespecial game.C_100187_rk.<init>()void
		// @5D: astore #5
		// @5F: aload #5
		// @61: iload_2
		// @62: putfield int game.C_100187_rk.field_100831_u
		// @65: aload #5
		// @67: iload_1
		// @68: putfield int game.C_100187_rk.field_100833_s
		// @6B: aload #5
		// @6D: iload_0
		// @6E: putfield int game.C_100187_rk.field_100826_o
		// @71: getstatic game.C_100202_qi game.C_100143_bl.field_105100_g
		// @74: iload #4
		// @76: sipush 29800 (0x7468)
		// @79: ixor
		// @7A: aload #5
		// @7C: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @7F: iload_3
		// @80: iconst_5
		// @81: aload #5
		// @83: invokestatic game.C_100283_ni.func_106751_a(int, int, game.C_100187_rk)void
		// @86: aload #5
		// @88: areturn
		// @89: astore #5
		// @8B: aload #5
		// @8D: new java.lang.StringBuilder
		// @90: dup
		// @91: invokespecial java.lang.StringBuilder.<init>()void
		// @94: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @97: bipush 22 (0x16)
		// @99: aaload
		// @9A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9D: iload_0
		// @9E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A1: bipush 44 (0x2C)
		// @A3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A6: iload_1
		// @A7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AA: bipush 44 (0x2C)
		// @AC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AF: iload_2
		// @B0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B3: bipush 44 (0x2C)
		// @B5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B8: iload_3
		// @B9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BC: bipush 44 (0x2C)
		// @BE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C1: iload #4
		// @C3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C6: bipush 41 (0x29)
		// @C8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CE: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D1: athrow
	}
	
	final void func_106915_a(int arg0, int arg1, int arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: bipush 105 (0x69)
		// @07: iload_2
		// @08: bipush -88 (0xA8)
		// @0A: isub
		// @0B: bipush 38 (0x26)
		// @0D: idiv
		// @0E: irem
		// @0F: istore #4
		// @11: aload_0
		// @12: iload_1
		// @13: bipush -118 (0x8A)
		// @15: invokevirtual game.C_100294_ki.func_106913_c(int, int)game.C_100314_lf
		// @18: astore #5
		// @1A: aconst_null
		// @1B: aload #5
		// @1D: if_acmpne @24
		// @20: goto @C3
		// @23: athrow
		// @24: aload #5
		// @26: getfield game.C_100202_qi game.C_100314_lf.field_101324_H
		// @29: bipush 96 (0x60)
		// @2B: invokevirtual game.C_100202_qi.func_105895_d(byte)boolean
		// @2E: ifne @6A
		// @31: iload_3
		// @32: iconst_m1
		// @33: ixor
		// @34: aload #5
		// @36: getfield game.C_100202_qi game.C_100314_lf.field_101324_H
		// @39: bipush -77 (0xB3)
		// @3B: invokevirtual game.C_100202_qi.func_105906_b(int)game.C_100158_da
		// @3E: checkcast game.C_100087_n
		// @41: getfield int game.C_100087_n.field_100706_x
		// @44: iconst_m1
		// @45: ixor
		// @46: iload #6
		// @48: ifne @95
		// @4B: if_icmplt @6A
		// @4E: goto @52
		// @51: athrow
		// @52: aload #5
		// @54: getfield game.C_100202_qi game.C_100314_lf.field_101324_H
		// @57: bipush -111 (0x91)
		// @59: invokevirtual game.C_100202_qi.func_105906_b(int)game.C_100158_da
		// @5C: bipush 45 (0x2D)
		// @5E: invokevirtual game.C_100158_da.func_100583_c(int)void
		// @61: iload #6
		// @63: ifeq @24
		// @66: goto @6A
		// @69: athrow
		// @6A: aload #5
		// @6C: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @6F: bipush 77 (0x4D)
		// @71: invokevirtual game.C_100202_qi.func_105895_d(byte)boolean
		// @74: ifne @B0
		// @77: aload #5
		// @79: iload #6
		// @7B: ifne @B2
		// @7E: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @81: bipush -88 (0xA8)
		// @83: invokevirtual game.C_100202_qi.func_105906_b(int)game.C_100158_da
		// @86: checkcast game.C_100087_n
		// @89: getfield int game.C_100087_n.field_100706_x
		// @8C: iconst_m1
		// @8D: ixor
		// @8E: iload_3
		// @8F: iconst_m1
		// @90: ixor
		// @91: goto @95
		// @94: athrow
		// @95: if_icmpgt @B0
		// @98: aload #5
		// @9A: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @9D: bipush -78 (0xB2)
		// @9F: invokevirtual game.C_100202_qi.func_105906_b(int)game.C_100158_da
		// @A2: bipush 45 (0x2D)
		// @A4: invokevirtual game.C_100158_da.func_100583_c(int)void
		// @A7: iload #6
		// @A9: ifeq @6A
		// @AC: goto @B0
		// @AF: athrow
		// @B0: aload #5
		// @B2: sipush 6083 (0x17C3)
		// @B5: new game.C_100087_n
		// @B8: dup
		// @B9: bipush 10 (0x0A)
		// @BB: iconst_0
		// @BC: iload_3
		// @BD: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @C0: invokevirtual game.C_100314_lf.func_101281_a(int, game.C_100087_n)void
		// @C3: goto @FC
		// @C6: astore #4
		// @C8: aload #4
		// @CA: new java.lang.StringBuilder
		// @CD: dup
		// @CE: invokespecial java.lang.StringBuilder.<init>()void
		// @D1: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @D4: bipush 48 (0x30)
		// @D6: aaload
		// @D7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @DA: iload_1
		// @DB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DE: bipush 44 (0x2C)
		// @E0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E3: iload_2
		// @E4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @E7: bipush 44 (0x2C)
		// @E9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @EC: iload_3
		// @ED: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @F0: bipush 41 (0x29)
		// @F2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @F5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @F8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @FB: athrow
		// @FC: return
	}
	
	static final int func_106909_a(String arg0, boolean arg1, boolean arg2)
	{
		// @00: iload_2
		// @01: iconst_1
		// @02: if_icmpeq @0E
		// @05: bipush -43 (0xD5)
		// @07: putstatic int game.C_100294_ki.field_106971_P
		// @0A: goto @0E
		// @0D: athrow
		// @0E: iload_1
		// @0F: ifne @1A
		// @12: getstatic game.C_100112_r game.C_100139_tb.field_100536_x
		// @15: aload_0
		// @16: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @19: ireturn
		// @1A: getstatic game.C_100112_r game.C_100092_um.field_104531_e
		// @1D: aload_0
		// @1E: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @21: ireturn
		// @22: astore_3
		// @23: aload_3
		// @24: new java.lang.StringBuilder
		// @27: dup
		// @28: invokespecial java.lang.StringBuilder.<init>()void
		// @2B: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2E: bipush 31 (0x1F)
		// @30: aaload
		// @31: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @34: aload_0
		// @35: ifnull @41
		// @38: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @3B: iconst_1
		// @3C: aaload
		// @3D: goto @46
		// @40: athrow
		// @41: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @44: iconst_4
		// @45: aaload
		// @46: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @49: bipush 44 (0x2C)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: iload_1
		// @4F: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @52: bipush 44 (0x2C)
		// @54: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @57: iload_2
		// @58: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @5B: bipush 41 (0x29)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @63: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @66: athrow
	}
	
	final void func_106918_f(int arg0)
	{
		// @0000: getstatic int game.SteelSentinels.field_105275_O
		// @0003: istore #15
		// @0005: aload_0
		// @0006: dup
		// @0007: getfield int game.C_100294_ki.field_106966_U
		// @000A: iconst_2
		// @000B: getstatic int game.C_100015_wh.field_103781_g
		// @000E: imul
		// @000F: iadd
		// @0010: putfield int game.C_100294_ki.field_106966_U
		// @0013: bipush 16 (0x10)
		// @0015: aload_0
		// @0016: getfield int game.C_100294_ki.field_106987_m
		// @0019: iand
		// @001A: iconst_m1
		// @001B: ixor
		// @001C: iconst_m1
		// @001D: if_icmpeq @004E
		// @0020: sipush 6000 (0x1770)
		// @0023: aload_0
		// @0024: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0027: getfield int[] game.C_100171_cn.field_105577_h
		// @002A: iconst_0
		// @002B: iaload
		// @002C: if_icmpeq @0033
		// @002F: goto @0033
		// @0032: athrow
		// @0033: aload_0
		// @0034: getfield int game.C_100294_ki.field_106961_H
		// @0037: iconst_m1
		// @0038: ixor
		// @0039: bipush -51 (0xCD)
		// @003B: if_icmpne @004E
		// @003E: aload_0
		// @003F: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0042: getfield int[] game.C_100171_cn.field_105577_h
		// @0045: iconst_0
		// @0046: sipush -10000 (0xD8F0)
		// @0049: iastore
		// @004A: goto @004E
		// @004D: athrow
		// @004E: aload_0
		// @004F: dup
		// @0050: getfield int game.C_100294_ki.field_106982_c
		// @0053: getstatic int game.C_100015_wh.field_103781_g
		// @0056: isub
		// @0057: putfield int game.C_100294_ki.field_106982_c
		// @005A: aload_0
		// @005B: getfield int game.C_100294_ki.field_106987_m
		// @005E: bipush 32 (0x20)
		// @0060: iand
		// @0061: iconst_m1
		// @0062: ixor
		// @0063: iconst_m1
		// @0064: if_icmpne @006B
		// @0067: goto @0097
		// @006A: athrow
		// @006B: aload_0
		// @006C: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @006F: getfield int[] game.C_100171_cn.field_105577_h
		// @0072: iconst_1
		// @0073: iaload
		// @0074: iconst_m1
		// @0075: ixor
		// @0076: sipush -6001 (0xE88F)
		// @0079: if_icmpeq @007C
		// @007C: bipush -51 (0xCD)
		// @007E: aload_0
		// @007F: getfield int game.C_100294_ki.field_106961_H
		// @0082: iconst_m1
		// @0083: ixor
		// @0084: if_icmpeq @008B
		// @0087: goto @0097
		// @008A: athrow
		// @008B: aload_0
		// @008C: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @008F: getfield int[] game.C_100171_cn.field_105577_h
		// @0092: iconst_1
		// @0093: sipush -10000 (0xD8F0)
		// @0096: iastore
		// @0097: aload_0
		// @0098: dup
		// @0099: getfield int game.C_100294_ki.field_107002_z
		// @009C: getstatic int game.C_100338_jc.field_105370_l
		// @009F: iadd
		// @00A0: putfield int game.C_100294_ki.field_107002_z
		// @00A3: aload_0
		// @00A4: dup
		// @00A5: getfield int game.C_100294_ki.field_106954_A
		// @00A8: getstatic int game.C_100338_jc.field_105370_l
		// @00AB: isub
		// @00AC: putfield int game.C_100294_ki.field_106954_A
		// @00AF: aload_0
		// @00B0: getfield boolean game.C_100294_ki.field_106963_eb
		// @00B3: ifeq @00C6
		// @00B6: aload_0
		// @00B7: getfield boolean game.C_100294_ki.field_106969_V
		// @00BA: ifne @00C5
		// @00BD: goto @00C1
		// @00C0: athrow
		// @00C1: goto @00C6
		// @00C4: athrow
		// @00C5: return
		// @00C6: iconst_m1
		// @00C7: getstatic int game.C_100218_am.field_103115_N
		// @00CA: iconst_m1
		// @00CB: ixor
		// @00CC: if_icmplt @00D4
		// @00CF: iconst_1
		// @00D0: goto @00D5
		// @00D3: athrow
		// @00D4: iconst_0
		// @00D5: istore_2
		// @00D6: aload_0
		// @00D7: getfield boolean game.C_100294_ki.field_106963_eb
		// @00DA: ifne @09A1
		// @00DD: getstatic int game.C_100218_am.field_103115_N
		// @00E0: bipush 10 (0x0A)
		// @00E2: if_icmpne @09A1
		// @00E5: goto @00E9
		// @00E8: athrow
		// @00E9: iconst_0
		// @00EA: getstatic int game.C_100181_cf.field_105704_e
		// @00ED: if_icmpge @09A1
		// @00F0: goto @00F4
		// @00F3: athrow
		// @00F4: aload_0
		// @00F5: iconst_3
		// @00F6: invokevirtual game.C_100294_ki.func_106942_h(int)boolean
		// @00F9: ifne @0104
		// @00FC: goto @0100
		// @00FF: athrow
		// @0100: goto @09A1
		// @0103: athrow
		// @0104: getstatic int[][][] game.C_100005_fk.field_103595_a
		// @0107: getstatic int game.C_100194_rd.field_103072_v
		// @010A: bipush 10 (0x0A)
		// @010C: imul
		// @010D: getstatic int game.C_100197_ra.field_100867_r
		// @0110: ineg
		// @0111: isub
		// @0112: aaload
		// @0113: astore_3
		// @0114: aload_0
		// @0115: getfield int game.C_100294_ki.field_107004_x
		// @0118: iconst_m1
		// @0119: isub
		// @011A: iconst_m1
		// @011B: ixor
		// @011C: aload_3
		// @011D: arraylength
		// @011E: iconst_m1
		// @011F: ixor
		// @0120: if_icmple @089A
		// @0123: aload_0
		// @0124: dup
		// @0125: getfield int game.C_100294_ki.field_107004_x
		// @0128: iconst_1
		// @0129: iadd
		// @012A: putfield int game.C_100294_ki.field_107004_x
		// @012D: iconst_0
		// @012E: aload_0
		// @012F: getfield int game.C_100294_ki.field_107004_x
		// @0132: if_icmpge @014B
		// @0135: goto @0139
		// @0138: athrow
		// @0139: iconst_m1
		// @013A: getstatic int game.C_100194_rd.field_103072_v
		// @013D: iconst_m1
		// @013E: ixor
		// @013F: if_icmple @014B
		// @0142: goto @0146
		// @0145: athrow
		// @0146: iconst_1
		// @0147: goto @014C
		// @014A: athrow
		// @014B: iconst_0
		// @014C: istore #4
		// @014E: aload_3
		// @014F: aload_0
		// @0150: getfield int game.C_100294_ki.field_107004_x
		// @0153: aaload
		// @0154: astore #5
		// @0156: aload #5
		// @0158: arraylength
		// @0159: istore #6
		// @015B: iconst_0
		// @015C: istore #7
		// @015E: iload #6
		// @0160: iconst_m1
		// @0161: ixor
		// @0162: iload #7
		// @0164: iconst_m1
		// @0165: ixor
		// @0166: if_icmpge @0895
		// @0169: aconst_null
		// @016A: astore #8
		// @016C: aload #5
		// @016E: iload #7
		// @0170: iaload
		// @0171: iconst_m1
		// @0172: ixor
		// @0173: iconst_m1
		// @0174: iload #15
		// @0176: ifne @11B8
		// @0179: if_icmpne @0185
		// @017C: goto @0180
		// @017F: athrow
		// @0180: getstatic int[] game.C_100242_oh.field_106346_c
		// @0183: astore #8
		// @0185: bipush -2 (0xFE)
		// @0187: aload #5
		// @0189: iload #7
		// @018B: iaload
		// @018C: iconst_m1
		// @018D: ixor
		// @018E: if_icmpeq @0195
		// @0191: goto @019A
		// @0194: athrow
		// @0195: getstatic int[] game.C_100104_v.field_104701_i
		// @0198: astore #8
		// @019A: bipush -3 (0xFD)
		// @019C: aload #5
		// @019E: iload #7
		// @01A0: iaload
		// @01A1: iconst_m1
		// @01A2: ixor
		// @01A3: if_icmpne @01AB
		// @01A6: getstatic int[] game.C_100059_df.field_101600_M
		// @01A9: astore #8
		// @01AB: aload #5
		// @01AD: iload #7
		// @01AF: iaload
		// @01B0: iconst_m1
		// @01B1: ixor
		// @01B2: bipush -4 (0xFC)
		// @01B4: if_icmpeq @01BB
		// @01B7: goto @01C0
		// @01BA: athrow
		// @01BB: getstatic int[] game.C_100066_dl.field_101635_C
		// @01BE: astore #8
		// @01C0: bipush -5 (0xFB)
		// @01C2: aload #5
		// @01C4: iload #7
		// @01C6: iaload
		// @01C7: iconst_m1
		// @01C8: ixor
		// @01C9: if_icmpeq @01D0
		// @01CC: goto @01D5
		// @01CF: athrow
		// @01D0: getstatic int[] game.C_100194_rd.field_103076_r
		// @01D3: astore #8
		// @01D5: iconst_5
		// @01D6: aload #5
		// @01D8: iload #7
		// @01DA: iaload
		// @01DB: if_icmpne @01E3
		// @01DE: getstatic int[] game.C_100228_nn.field_106191_l
		// @01E1: astore #8
		// @01E3: aload #5
		// @01E5: iload #7
		// @01E7: iaload
		// @01E8: bipush 6 (0x06)
		// @01EA: if_icmpeq @01F1
		// @01ED: goto @01F6
		// @01F0: athrow
		// @01F1: getstatic int[] game.C_100197_ra.field_100859_m
		// @01F4: astore #8
		// @01F6: bipush -8 (0xF8)
		// @01F8: aload #5
		// @01FA: iload #7
		// @01FC: iaload
		// @01FD: iconst_m1
		// @01FE: ixor
		// @01FF: if_icmpeq @0206
		// @0202: goto @020B
		// @0205: athrow
		// @0206: getstatic int[] game.C_100005_fk.field_103604_v
		// @0209: astore #8
		// @020B: bipush 8 (0x08)
		// @020D: aload #5
		// @020F: iload #7
		// @0211: iaload
		// @0212: if_icmpne @021A
		// @0215: getstatic int[] game.C_100005_fk.field_103605_u
		// @0218: astore #8
		// @021A: bipush 9 (0x09)
		// @021C: aload #5
		// @021E: iload #7
		// @0220: iaload
		// @0221: if_icmpeq @0228
		// @0224: goto @022D
		// @0227: athrow
		// @0228: getstatic int[] game.C_100005_fk.field_103607_s
		// @022B: astore #8
		// @022D: aload #5
		// @022F: iload #7
		// @0231: iaload
		// @0232: bipush 10 (0x0A)
		// @0234: if_icmpeq @023B
		// @0237: goto @0240
		// @023A: athrow
		// @023B: getstatic int[] game.C_100005_fk.field_103606_t
		// @023E: astore #8
		// @0240: aload #5
		// @0242: iload #7
		// @0244: iaload
		// @0245: iconst_m1
		// @0246: ixor
		// @0247: bipush -12 (0xF4)
		// @0249: if_icmpne @0251
		// @024C: getstatic int[] game.C_100005_fk.field_103602_h
		// @024F: astore #8
		// @0251: bipush -13 (0xF3)
		// @0253: aload #5
		// @0255: iload #7
		// @0257: iaload
		// @0258: iconst_m1
		// @0259: ixor
		// @025A: if_icmpne @0262
		// @025D: getstatic int[] game.C_100005_fk.field_103610_p
		// @0260: astore #8
		// @0262: bipush 13 (0x0D)
		// @0264: aload #5
		// @0266: iload #7
		// @0268: iaload
		// @0269: if_icmpne @0271
		// @026C: getstatic int[] game.C_100005_fk.field_103597_o
		// @026F: astore #8
		// @0271: bipush -15 (0xF1)
		// @0273: aload #5
		// @0275: iload #7
		// @0277: iaload
		// @0278: iconst_m1
		// @0279: ixor
		// @027A: if_icmpeq @0281
		// @027D: goto @0286
		// @0280: athrow
		// @0281: getstatic int[] game.C_100005_fk.field_103592_e
		// @0284: astore #8
		// @0286: bipush 15 (0x0F)
		// @0288: aload #5
		// @028A: iload #7
		// @028C: iaload
		// @028D: if_icmpne @0295
		// @0290: getstatic int[] game.C_100005_fk.field_103600_j
		// @0293: astore #8
		// @0295: bipush -17 (0xEF)
		// @0297: aload #5
		// @0299: iload #7
		// @029B: iaload
		// @029C: iconst_m1
		// @029D: ixor
		// @029E: if_icmpne @02A6
		// @02A1: getstatic int[] game.C_100061_dh.field_102000_cc
		// @02A4: astore #8
		// @02A6: bipush 17 (0x11)
		// @02A8: aload #5
		// @02AA: iload #7
		// @02AC: iaload
		// @02AD: if_icmpne @02B5
		// @02B0: getstatic int[] game.C_100346_ja.field_103488_k
		// @02B3: astore #8
		// @02B5: aload #5
		// @02B7: iload #7
		// @02B9: iaload
		// @02BA: bipush 18 (0x12)
		// @02BC: if_icmpeq @02C3
		// @02BF: goto @02C8
		// @02C2: athrow
		// @02C3: getstatic int[] game.C_100032_gk.field_103139_bb
		// @02C6: astore #8
		// @02C8: bipush -21 (0xEB)
		// @02CA: aload #5
		// @02CC: iload #7
		// @02CE: iaload
		// @02CF: iconst_m1
		// @02D0: ixor
		// @02D1: if_icmpne @02D9
		// @02D4: getstatic int[] game.C_100016_wi.field_103804_b
		// @02D7: astore #8
		// @02D9: aload #5
		// @02DB: iload #7
		// @02DD: iaload
		// @02DE: bipush 21 (0x15)
		// @02E0: if_icmpeq @02E7
		// @02E3: goto @02EC
		// @02E6: athrow
		// @02E7: getstatic int[] game.C_100213_ak.field_106001_i
		// @02EA: astore #8
		// @02EC: aload #5
		// @02EE: iload #7
		// @02F0: iaload
		// @02F1: iconst_m1
		// @02F2: ixor
		// @02F3: bipush -23 (0xE9)
		// @02F5: if_icmpeq @02FC
		// @02F8: goto @0301
		// @02FB: athrow
		// @02FC: getstatic int[] game.C_100209_qb.field_102692_Nb
		// @02FF: astore #8
		// @0301: bipush 23 (0x17)
		// @0303: aload #5
		// @0305: iload #7
		// @0307: iaload
		// @0308: if_icmpne @0310
		// @030B: getstatic int[] game.C_100099_fb.field_103051_y
		// @030E: astore #8
		// @0310: bipush -25 (0xE7)
		// @0312: aload #5
		// @0314: iload #7
		// @0316: iaload
		// @0317: iconst_m1
		// @0318: ixor
		// @0319: if_icmpeq @0320
		// @031C: goto @0325
		// @031F: athrow
		// @0320: getstatic int[] game.C_100235_om.field_106290_b
		// @0323: astore #8
		// @0325: iconst_m1
		// @0326: istore #9
		// @0328: iconst_1
		// @0329: getstatic int game.C_100194_rd.field_103072_v
		// @032C: if_icmpne @03EC
		// @032F: getstatic int game.C_100197_ra.field_100867_r
		// @0332: iconst_m1
		// @0333: ixor
		// @0334: bipush -10 (0xF6)
		// @0336: if_icmpeq @0341
		// @0339: goto @033D
		// @033C: athrow
		// @033D: goto @03EC
		// @0340: athrow
		// @0341: aload_0
		// @0342: getfield int game.C_100294_ki.field_107004_x
		// @0345: istore #10
		// @0347: iload #10
		// @0349: iconst_m1
		// @034A: ixor
		// @034B: iconst_m1
		// @034C: if_icmpne @0358
		// @034F: iload #15
		// @0351: ifeq @0393
		// @0354: goto @0358
		// @0357: athrow
		// @0358: iload #10
		// @035A: iconst_1
		// @035B: if_icmpeq @03A8
		// @035E: goto @0362
		// @0361: athrow
		// @0362: bipush -3 (0xFD)
		// @0364: iload #10
		// @0366: iconst_m1
		// @0367: ixor
		// @0368: if_icmpeq @03BD
		// @036B: goto @036F
		// @036E: athrow
		// @036F: bipush -4 (0xFC)
		// @0371: iload #10
		// @0373: iconst_m1
		// @0374: ixor
		// @0375: if_icmpne @0385
		// @0378: goto @037C
		// @037B: athrow
		// @037C: iload #15
		// @037E: ifeq @03D2
		// @0381: goto @0385
		// @0384: athrow
		// @0385: iload #10
		// @0387: iconst_4
		// @0388: if_icmpeq @03E8
		// @038B: goto @038F
		// @038E: athrow
		// @038F: goto @03EC
		// @0392: athrow
		// @0393: iconst_m1
		// @0394: iload #7
		// @0396: iconst_m1
		// @0397: ixor
		// @0398: if_icmpeq @039F
		// @039B: goto @03EC
		// @039E: athrow
		// @039F: bipush 36 (0x24)
		// @03A1: istore #9
		// @03A3: iload #15
		// @03A5: ifeq @03EC
		// @03A8: iconst_m1
		// @03A9: iload #7
		// @03AB: iconst_m1
		// @03AC: ixor
		// @03AD: if_icmpne @03EC
		// @03B0: goto @03B4
		// @03B3: athrow
		// @03B4: bipush 15 (0x0F)
		// @03B6: istore #9
		// @03B8: iload #15
		// @03BA: ifeq @03EC
		// @03BD: iload #7
		// @03BF: iconst_m1
		// @03C0: ixor
		// @03C1: iconst_m1
		// @03C2: if_icmpne @03EC
		// @03C5: goto @03C9
		// @03C8: athrow
		// @03C9: bipush 35 (0x23)
		// @03CB: istore #9
		// @03CD: iload #15
		// @03CF: ifeq @03EC
		// @03D2: iload #7
		// @03D4: ifeq @03DF
		// @03D7: goto @03DB
		// @03DA: athrow
		// @03DB: goto @03EC
		// @03DE: athrow
		// @03DF: bipush 45 (0x2D)
		// @03E1: istore #9
		// @03E3: iload #15
		// @03E5: ifeq @03EC
		// @03E8: bipush 41 (0x29)
		// @03EA: istore #9
		// @03EC: iconst_1
		// @03ED: getstatic int game.C_100194_rd.field_103072_v
		// @03F0: if_icmpne @043F
		// @03F3: getstatic int game.C_100197_ra.field_100867_r
		// @03F6: bipush 6 (0x06)
		// @03F8: if_icmpne @043F
		// @03FB: goto @03FF
		// @03FE: athrow
		// @03FF: iload #7
		// @0401: ifeq @040C
		// @0404: goto @0408
		// @0407: athrow
		// @0408: goto @043F
		// @040B: athrow
		// @040C: aload_0
		// @040D: getfield int game.C_100294_ki.field_107004_x
		// @0410: istore #10
		// @0412: iconst_m1
		// @0413: iload #10
		// @0415: iconst_m1
		// @0416: ixor
		// @0417: if_icmpeq @043B
		// @041A: iconst_2
		// @041B: iload #10
		// @041D: if_icmpne @042D
		// @0420: goto @0424
		// @0423: athrow
		// @0424: iload #15
		// @0426: ifeq @043B
		// @0429: goto @042D
		// @042C: athrow
		// @042D: iload #10
		// @042F: iconst_4
		// @0430: if_icmpne @043F
		// @0433: goto @0437
		// @0436: athrow
		// @0437: goto @043B
		// @043A: athrow
		// @043B: bipush 33 (0x21)
		// @043D: istore #9
		// @043F: getstatic int game.C_100194_rd.field_103072_v
		// @0442: iconst_1
		// @0443: if_icmpne @048C
		// @0446: iconst_1
		// @0447: getstatic int game.C_100197_ra.field_100867_r
		// @044A: if_icmpne @048C
		// @044D: goto @0451
		// @0450: athrow
		// @0451: bipush -3 (0xFD)
		// @0453: aload_0
		// @0454: getfield int game.C_100294_ki.field_107004_x
		// @0457: iconst_m1
		// @0458: ixor
		// @0459: if_icmpne @0471
		// @045C: goto @0460
		// @045F: athrow
		// @0460: iload #7
		// @0462: ifeq @046D
		// @0465: goto @0469
		// @0468: athrow
		// @0469: goto @0471
		// @046C: athrow
		// @046D: bipush 45 (0x2D)
		// @046F: istore #9
		// @0471: bipush -5 (0xFB)
		// @0473: aload_0
		// @0474: getfield int game.C_100294_ki.field_107004_x
		// @0477: iconst_m1
		// @0478: ixor
		// @0479: if_icmpne @048C
		// @047C: iload #7
		// @047E: iconst_m1
		// @047F: ixor
		// @0480: iconst_m1
		// @0481: if_icmpne @048C
		// @0484: goto @0488
		// @0487: athrow
		// @0488: bipush 45 (0x2D)
		// @048A: istore #9
		// @048C: getstatic int game.C_100194_rd.field_103072_v
		// @048F: iconst_2
		// @0490: if_icmpne @04BE
		// @0493: iconst_3
		// @0494: getstatic int game.C_100197_ra.field_100867_r
		// @0497: if_icmpne @04BE
		// @049A: goto @049E
		// @049D: athrow
		// @049E: iconst_3
		// @049F: aload_0
		// @04A0: getfield int game.C_100294_ki.field_107004_x
		// @04A3: if_icmpne @04BE
		// @04A6: goto @04AA
		// @04A9: athrow
		// @04AA: iload #7
		// @04AC: iconst_m1
		// @04AD: ixor
		// @04AE: iconst_m1
		// @04AF: if_icmpeq @04BA
		// @04B2: goto @04B6
		// @04B5: athrow
		// @04B6: goto @04BE
		// @04B9: athrow
		// @04BA: bipush 45 (0x2D)
		// @04BC: istore #9
		// @04BE: bipush -3 (0xFD)
		// @04C0: getstatic int game.C_100194_rd.field_103072_v
		// @04C3: iconst_m1
		// @04C4: ixor
		// @04C5: if_icmpne @04E7
		// @04C8: getstatic int game.C_100197_ra.field_100867_r
		// @04CB: iconst_1
		// @04CC: if_icmpne @04E7
		// @04CF: goto @04D3
		// @04D2: athrow
		// @04D3: aload #5
		// @04D5: iload #7
		// @04D7: iaload
		// @04D8: iconst_m1
		// @04D9: ixor
		// @04DA: bipush -10 (0xF6)
		// @04DC: if_icmpne @04E7
		// @04DF: goto @04E3
		// @04E2: athrow
		// @04E3: bipush 36 (0x24)
		// @04E5: istore #9
		// @04E7: getstatic int game.C_100194_rd.field_103072_v
		// @04EA: iconst_m1
		// @04EB: ixor
		// @04EC: bipush -3 (0xFD)
		// @04EE: if_icmpne @0515
		// @04F1: iconst_2
		// @04F2: getstatic int game.C_100197_ra.field_100867_r
		// @04F5: if_icmpne @0515
		// @04F8: goto @04FC
		// @04FB: athrow
		// @04FC: iload #7
		// @04FE: ifne @0515
		// @0501: goto @0505
		// @0504: athrow
		// @0505: iconst_2
		// @0506: aload_0
		// @0507: getfield int game.C_100294_ki.field_107004_x
		// @050A: if_icmpne @0515
		// @050D: goto @0511
		// @0510: athrow
		// @0511: bipush 18 (0x12)
		// @0513: istore #9
		// @0515: bipush 36 (0x24)
		// @0517: istore #10
		// @0519: iconst_2
		// @051A: getstatic int game.C_100194_rd.field_103072_v
		// @051D: if_icmpne @05A9
		// @0520: getstatic int game.C_100197_ra.field_100867_r
		// @0523: iconst_m1
		// @0524: ixor
		// @0525: bipush -10 (0xF6)
		// @0527: if_icmpeq @0532
		// @052A: goto @052E
		// @052D: athrow
		// @052E: goto @05A9
		// @0531: athrow
		// @0532: iload #7
		// @0534: iconst_m1
		// @0535: ixor
		// @0536: iconst_m1
		// @0537: if_icmpne @055D
		// @053A: aload_0
		// @053B: getfield int game.C_100294_ki.field_107004_x
		// @053E: iconst_m1
		// @053F: ixor
		// @0540: bipush -2 (0xFE)
		// @0542: if_icmpeq @0559
		// @0545: goto @0549
		// @0548: athrow
		// @0549: aload_0
		// @054A: getfield int game.C_100294_ki.field_107004_x
		// @054D: iconst_3
		// @054E: if_icmpeq @0559
		// @0551: goto @0555
		// @0554: athrow
		// @0555: goto @055D
		// @0558: athrow
		// @0559: bipush 45 (0x2D)
		// @055B: istore #9
		// @055D: aload_0
		// @055E: getfield int game.C_100294_ki.field_107004_x
		// @0561: iconst_m1
		// @0562: aload_3
		// @0563: arraylength
		// @0564: iadd
		// @0565: if_icmpne @05A5
		// @0568: iload #7
		// @056A: istore #11
		// @056C: iload #11
		// @056E: ifeq @058F
		// @0571: bipush -2 (0xFE)
		// @0573: iload #11
		// @0575: iconst_m1
		// @0576: ixor
		// @0577: if_icmpeq @0598
		// @057A: goto @057E
		// @057D: athrow
		// @057E: bipush -3 (0xFD)
		// @0580: iload #11
		// @0582: iconst_m1
		// @0583: ixor
		// @0584: if_icmpeq @05A1
		// @0587: goto @058B
		// @058A: athrow
		// @058B: goto @05A5
		// @058E: athrow
		// @058F: bipush 37 (0x25)
		// @0591: istore #9
		// @0593: iload #15
		// @0595: ifeq @05A5
		// @0598: bipush 14 (0x0E)
		// @059A: istore #9
		// @059C: iload #15
		// @059E: ifeq @05A5
		// @05A1: bipush 15 (0x0F)
		// @05A3: istore #9
		// @05A5: bipush 38 (0x26)
		// @05A7: istore #10
		// @05A9: iconst_1
		// @05AA: getstatic int game.C_100194_rd.field_103072_v
		// @05AD: if_icmpne @05F6
		// @05B0: bipush -9 (0xF7)
		// @05B2: getstatic int game.C_100197_ra.field_100867_r
		// @05B5: iconst_m1
		// @05B6: ixor
		// @05B7: if_icmpne @05F6
		// @05BA: goto @05BE
		// @05BD: athrow
		// @05BE: iconst_2
		// @05BF: aload_0
		// @05C0: getfield int game.C_100294_ki.field_107004_x
		// @05C3: if_icmpne @05DA
		// @05C6: goto @05CA
		// @05C9: athrow
		// @05CA: iconst_m1
		// @05CB: iload #7
		// @05CD: iconst_m1
		// @05CE: ixor
		// @05CF: if_icmpne @05DA
		// @05D2: goto @05D6
		// @05D5: athrow
		// @05D6: bipush 15 (0x0F)
		// @05D8: istore #9
		// @05DA: iconst_3
		// @05DB: aload_0
		// @05DC: getfield int game.C_100294_ki.field_107004_x
		// @05DF: if_icmpne @05F6
		// @05E2: iload #7
		// @05E4: iconst_m1
		// @05E5: ixor
		// @05E6: iconst_m1
		// @05E7: if_icmpeq @05F2
		// @05EA: goto @05EE
		// @05ED: athrow
		// @05EE: goto @05F6
		// @05F1: athrow
		// @05F2: bipush 9 (0x09)
		// @05F4: istore #9
		// @05F6: getstatic int game.C_100194_rd.field_103072_v
		// @05F9: iconst_m1
		// @05FA: ixor
		// @05FB: bipush -2 (0xFE)
		// @05FD: if_icmpne @0649
		// @0600: bipush -8 (0xF8)
		// @0602: getstatic int game.C_100197_ra.field_100867_r
		// @0605: iconst_m1
		// @0606: ixor
		// @0607: if_icmpne @0649
		// @060A: goto @060E
		// @060D: athrow
		// @060E: bipush -4 (0xFC)
		// @0610: aload_0
		// @0611: getfield int game.C_100294_ki.field_107004_x
		// @0614: iconst_m1
		// @0615: ixor
		// @0616: if_icmpne @062B
		// @0619: goto @061D
		// @061C: athrow
		// @061D: iconst_0
		// @061E: iload #7
		// @0620: if_icmpne @062B
		// @0623: goto @0627
		// @0626: athrow
		// @0627: bipush 39 (0x27)
		// @0629: istore #9
		// @062B: aload_0
		// @062C: getfield int game.C_100294_ki.field_107004_x
		// @062F: iconst_5
		// @0630: if_icmpne @0649
		// @0633: bipush 9 (0x09)
		// @0635: aload #5
		// @0637: iload #7
		// @0639: iaload
		// @063A: if_icmpeq @0645
		// @063D: goto @0641
		// @0640: athrow
		// @0641: goto @0649
		// @0644: athrow
		// @0645: bipush 22 (0x16)
		// @0647: istore #9
		// @0649: getstatic int game.C_100194_rd.field_103072_v
		// @064C: iconst_m1
		// @064D: ixor
		// @064E: bipush -3 (0xFD)
		// @0650: if_icmpne @06B1
		// @0653: bipush -6 (0xFA)
		// @0655: getstatic int game.C_100197_ra.field_100867_r
		// @0658: iconst_m1
		// @0659: ixor
		// @065A: if_icmpne @06B1
		// @065D: goto @0661
		// @0660: athrow
		// @0661: iconst_m1
		// @0662: iload #7
		// @0664: iconst_m1
		// @0665: ixor
		// @0666: if_icmpne @0680
		// @0669: goto @066D
		// @066C: athrow
		// @066D: aload_0
		// @066E: getfield int game.C_100294_ki.field_107004_x
		// @0671: ifeq @067C
		// @0674: goto @0678
		// @0677: athrow
		// @0678: goto @0680
		// @067B: athrow
		// @067C: bipush 36 (0x24)
		// @067E: istore #9
		// @0680: iload #7
		// @0682: iconst_m1
		// @0683: ixor
		// @0684: iconst_m1
		// @0685: if_icmpne @0698
		// @0688: iconst_2
		// @0689: aload_0
		// @068A: getfield int game.C_100294_ki.field_107004_x
		// @068D: if_icmpne @0698
		// @0690: goto @0694
		// @0693: athrow
		// @0694: bipush 37 (0x25)
		// @0696: istore #9
		// @0698: iload #7
		// @069A: ifne @06B1
		// @069D: iconst_3
		// @069E: aload_0
		// @069F: getfield int game.C_100294_ki.field_107004_x
		// @06A2: if_icmpeq @06AD
		// @06A5: goto @06A9
		// @06A8: athrow
		// @06A9: goto @06B1
		// @06AC: athrow
		// @06AD: bipush 42 (0x2A)
		// @06AF: istore #9
		// @06B1: getstatic int game.C_100194_rd.field_103072_v
		// @06B4: iconst_m1
		// @06B5: ixor
		// @06B6: bipush -3 (0xFD)
		// @06B8: if_icmpne @06E3
		// @06BB: getstatic int game.C_100197_ra.field_100867_r
		// @06BE: iconst_m1
		// @06BF: ixor
		// @06C0: bipush -8 (0xF8)
		// @06C2: if_icmpne @06E3
		// @06C5: goto @06C9
		// @06C8: athrow
		// @06C9: iconst_1
		// @06CA: iload #7
		// @06CC: if_icmpne @06E3
		// @06CF: goto @06D3
		// @06D2: athrow
		// @06D3: iconst_2
		// @06D4: aload_0
		// @06D5: getfield int game.C_100294_ki.field_107004_x
		// @06D8: if_icmpne @06E3
		// @06DB: goto @06DF
		// @06DE: athrow
		// @06DF: bipush 33 (0x21)
		// @06E1: istore #9
		// @06E3: aload #8
		// @06E5: ifnonnull @06EC
		// @06E8: goto @088D
		// @06EB: athrow
		// @06EC: aload #5
		// @06EE: iload #7
		// @06F0: iaload
		// @06F1: iconst_m1
		// @06F2: ixor
		// @06F3: iconst_m1
		// @06F4: if_icmpeq @077E
		// @06F7: new game.C_100314_lf
		// @06FA: dup
		// @06FB: iconst_0
		// @06FC: iconst_0
		// @06FD: aload_0
		// @06FE: invokespecial game.C_100314_lf.<init>(int, int, game.C_100294_ki)void
		// @0701: astore #11
		// @0703: aload #11
		// @0705: aload #8
		// @0707: iconst_1
		// @0708: bipush 61 (0x3D)
		// @070A: iconst_m1
		// @070B: iconst_0
		// @070C: invokevirtual game.C_100314_lf.func_101263_a(int[], int, byte, int, boolean)void
		// @070F: aload #11
		// @0711: bipush 7 (0x07)
		// @0713: putfield int game.C_100314_lf.field_101387_Xb
		// @0716: iload #9
		// @0718: iconst_m1
		// @0719: ixor
		// @071A: ifeq @072D
		// @071D: aload #11
		// @071F: iload #9
		// @0721: putfield int game.C_100314_lf.field_101409_qc
		// @0724: iload #15
		// @0726: ifeq @0740
		// @0729: goto @072D
		// @072C: athrow
		// @072D: iload #4
		// @072F: ifeq @0740
		// @0732: goto @0736
		// @0735: athrow
		// @0736: iconst_0
		// @0737: istore #4
		// @0739: aload #11
		// @073B: iload #10
		// @073D: putfield int game.C_100314_lf.field_101409_qc
		// @0740: aload_0
		// @0741: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @0744: bipush 127 (0x7F)
		// @0746: aload #11
		// @0748: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @074B: aload #11
		// @074D: iconst_1
		// @074E: invokevirtual game.C_100314_lf.func_101287_i(int)void
		// @0751: aload #11
		// @0753: ldc_w -320000 (0xfffb1e00)
		// @0756: putfield int game.C_100314_lf.field_101395_rc
		// @0759: aload #11
		// @075B: aload #11
		// @075D: getfield int game.C_100314_lf.field_101395_rc
		// @0760: putfield int game.C_100314_lf.field_101360_nb
		// @0763: aload #11
		// @0765: sipush 150 (0x0096)
		// @0768: putfield int game.C_100314_lf.field_101397_ic
		// @076B: aload #11
		// @076D: sipush 8000 (0x1F40)
		// @0770: putfield int game.C_100314_lf.field_101294_gc
		// @0773: aload #11
		// @0775: iconst_0
		// @0776: putfield int game.C_100314_lf.field_101344_Y
		// @0779: iload #15
		// @077B: ifeq @088D
		// @077E: new game.C_100314_lf
		// @0781: dup
		// @0782: iconst_0
		// @0783: iconst_0
		// @0784: aload_0
		// @0785: invokespecial game.C_100314_lf.<init>(int, int, game.C_100294_ki)void
		// @0788: astore #11
		// @078A: aload #11
		// @078C: iconst_1
		// @078D: iconst_m1
		// @078E: iconst_1
		// @078F: aload #8
		// @0791: invokevirtual game.C_100314_lf.func_101255_a(int, int, byte, int[])void
		// @0794: aload #11
		// @0796: bipush 7 (0x07)
		// @0798: putfield int game.C_100314_lf.field_101387_Xb
		// @079B: aload #11
		// @079D: iload_1
		// @079E: sipush 3001 (0x0BB9)
		// @07A1: ixor
		// @07A2: invokevirtual game.C_100314_lf.func_101287_i(int)void
		// @07A5: aload #11
		// @07A7: getfield int game.C_100314_lf.field_101347_Gb
		// @07AA: istore #12
		// @07AC: aload #11
		// @07AE: ldc_w -320000 (0xfffb1e00)
		// @07B1: putfield int game.C_100314_lf.field_101395_rc
		// @07B4: aload #11
		// @07B6: getfield int game.C_100314_lf.field_101377_tc
		// @07B9: istore #13
		// @07BB: aload #11
		// @07BD: iconst_0
		// @07BE: putfield int game.C_100314_lf.field_101344_Y
		// @07C1: aload #11
		// @07C3: sipush 1000 (0x03E8)
		// @07C6: putfield int game.C_100314_lf.field_101294_gc
		// @07C9: aload #11
		// @07CB: sipush 150 (0x0096)
		// @07CE: putfield int game.C_100314_lf.field_101397_ic
		// @07D1: aload #11
		// @07D3: aload #11
		// @07D5: getfield int game.C_100314_lf.field_101395_rc
		// @07D8: putfield int game.C_100314_lf.field_101360_nb
		// @07DB: aload_0
		// @07DC: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @07DF: bipush 127 (0x7F)
		// @07E1: aload #11
		// @07E3: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @07E6: aload #11
		// @07E8: iload #12
		// @07EA: putfield int game.C_100314_lf.field_101362_nc
		// @07ED: bipush -4 (0xFC)
		// @07EF: istore #14
		// @07F1: iload #14
		// @07F3: iconst_m1
		// @07F4: ixor
		// @07F5: bipush -5 (0xFB)
		// @07F7: if_icmplt @088D
		// @07FA: iload #14
		// @07FC: iload #15
		// @07FE: ifne @0162
		// @0801: ifne @0807
		// @0804: goto @0885
		// @0807: new game.C_100314_lf
		// @080A: dup
		// @080B: iconst_0
		// @080C: iconst_0
		// @080D: aload_0
		// @080E: invokespecial game.C_100314_lf.<init>(int, int, game.C_100294_ki)void
		// @0811: astore #11
		// @0813: aload #11
		// @0815: iconst_1
		// @0816: iconst_m1
		// @0817: iconst_1
		// @0818: aload #8
		// @081A: invokevirtual game.C_100314_lf.func_101255_a(int, int, byte, int[])void
		// @081D: aload #11
		// @081F: bipush 7 (0x07)
		// @0821: putfield int game.C_100314_lf.field_101387_Xb
		// @0824: aload_0
		// @0825: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @0828: bipush 123 (0x7B)
		// @082A: aload #11
		// @082C: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @082F: aload #11
		// @0831: ldc_w -320000 (0xfffb1e00)
		// @0834: putfield int game.C_100314_lf.field_101395_rc
		// @0837: aload #11
		// @0839: iload #13
		// @083B: putfield int game.C_100314_lf.field_101377_tc
		// @083E: aload #11
		// @0840: iload #12
		// @0842: putfield int game.C_100314_lf.field_101362_nc
		// @0845: aload #11
		// @0847: sipush 3000 (0x0BB8)
		// @084A: iload #14
		// @084C: imul
		// @084D: putfield int game.C_100314_lf.field_101304_hb
		// @0850: aload #11
		// @0852: iconst_0
		// @0853: putfield int game.C_100314_lf.field_101344_Y
		// @0856: aload #11
		// @0858: aload #11
		// @085A: getfield int game.C_100314_lf.field_101395_rc
		// @085D: putfield int game.C_100314_lf.field_101360_nb
		// @0860: aload #11
		// @0862: iconst_0
		// @0863: iload #14
		// @0865: if_icmpge @086F
		// @0868: sipush 500 (0x01F4)
		// @086B: goto @0870
		// @086E: athrow
		// @086F: iconst_0
		// @0870: sipush 1000 (0x03E8)
		// @0873: iload #14
		// @0875: invokestatic java.lang.Math.abs(int)int
		// @0878: imul
		// @0879: iadd
		// @087A: putfield int game.C_100314_lf.field_101294_gc
		// @087D: aload #11
		// @087F: sipush 150 (0x0096)
		// @0882: putfield int game.C_100314_lf.field_101397_ic
		// @0885: iinc #14 +1
		// @0888: iload #15
		// @088A: ifeq @07F1
		// @088D: iinc #7 +1
		// @0890: iload #15
		// @0892: ifeq @015E
		// @0895: iload #15
		// @0897: ifeq @09A1
		// @089A: aload_0
		// @089B: getfield boolean game.C_100294_ki.field_106963_eb
		// @089E: ifne @09A1
		// @08A1: goto @08A5
		// @08A4: athrow
		// @08A5: aload_0
		// @08A6: iconst_1
		// @08A7: putfield boolean game.C_100294_ki.field_106963_eb
		// @08AA: aload_0
		// @08AB: getfield int game.C_100294_ki.field_106951_E
		// @08AE: bipush 50 (0x32)
		// @08B0: idiv
		// @08B1: putstatic int game.C_100061_dh.field_101987_Wb
		// @08B4: getstatic boolean game.C_100137_bn.field_105032_g
		// @08B7: ifne @08C2
		// @08BA: goto @08BE
		// @08BD: athrow
		// @08BE: goto @08CC
		// @08C1: athrow
		// @08C2: getstatic int game.C_100061_dh.field_101987_Wb
		// @08C5: sipush 600 (0x0258)
		// @08C8: iadd
		// @08C9: putstatic int game.C_100061_dh.field_101987_Wb
		// @08CC: iconst_0
		// @08CD: istore #4
		// @08CF: new game.C_100019_wl
		// @08D2: dup
		// @08D3: aload_0
		// @08D4: getfield game.C_100202_qi game.C_100294_ki.field_106997_s
		// @08D7: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @08DA: astore #5
		// @08DC: aload #5
		// @08DE: bipush -128 (0x80)
		// @08E0: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @08E3: checkcast game.C_100239_oi
		// @08E6: astore #6
		// @08E8: aconst_null
		// @08E9: aload #6
		// @08EB: if_acmpeq @0913
		// @08EE: iload #4
		// @08F0: aload #6
		// @08F2: getfield int game.C_100239_oi.field_102302_O
		// @08F5: iadd
		// @08F6: istore #4
		// @08F8: aload #5
		// @08FA: sipush -30820 (0x879C)
		// @08FD: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @0900: checkcast game.C_100239_oi
		// @0903: astore #6
		// @0905: iload #15
		// @0907: ifne @09A1
		// @090A: iload #15
		// @090C: ifeq @08E8
		// @090F: goto @0913
		// @0912: athrow
		// @0913: iconst_0
		// @0914: istore #6
		// @0916: iconst_0
		// @0917: istore #7
		// @0919: iconst_0
		// @091A: istore #8
		// @091C: iconst_0
		// @091D: istore #9
		// @091F: aload_0
		// @0920: iconst_0
		// @0921: bipush -108 (0x94)
		// @0923: invokevirtual game.C_100294_ki.func_106913_c(int, int)game.C_100314_lf
		// @0926: astore #10
		// @0928: aload #10
		// @092A: ifnonnull @0931
		// @092D: goto @0958
		// @0930: athrow
		// @0931: aload #10
		// @0933: getfield int game.C_100314_lf.field_101332_T
		// @0936: istore #7
		// @0938: aload #10
		// @093A: getfield int game.C_100314_lf.field_101310_Mb
		// @093D: istore #8
		// @093F: aload #10
		// @0941: getfield int game.C_100314_lf.field_101356_w
		// @0944: istore #6
		// @0946: aload #10
		// @0948: getfield int game.C_100314_lf.field_101373_cb
		// @094B: aload #10
		// @094D: getfield int game.C_100314_lf.field_101343_vb
		// @0950: bipush -83 (0xAD)
		// @0952: invokestatic game.C_100327_ib.func_102457_d(int, byte)int
		// @0955: isub
		// @0956: istore #9
		// @0958: getstatic int game.C_100061_dh.field_101987_Wb
		// @095B: getstatic int game.C_100197_ra.field_100867_r
		// @095E: aload_0
		// @095F: getfield int game.C_100294_ki.field_107002_z
		// @0962: iload #7
		// @0964: ldc_w 60000 (0xea60)
		// @0967: imul
		// @0968: ineg
		// @0969: sipush 128 (0x0080)
		// @096C: iload #6
		// @096E: imul
		// @096F: ineg
		// @0970: iadd
		// @0971: aload_0
		// @0972: getfield int game.C_100294_ki.field_106954_A
		// @0975: iadd
		// @0976: getstatic int game.C_100194_rd.field_103072_v
		// @0979: sipush 256 (0x0100)
		// @097C: iload #8
		// @097E: imul
		// @097F: ineg
		// @0980: aload_0
		// @0981: getfield int game.C_100294_ki.field_106966_U
		// @0984: iadd
		// @0985: bipush 100 (0x64)
		// @0987: iload #4
		// @0989: imul
		// @098A: ineg
		// @098B: iadd
		// @098C: bipush -119 (0x89)
		// @098E: aload_0
		// @098F: getfield int game.C_100294_ki.field_106996_t
		// @0992: aload_0
		// @0993: getfield int game.C_100294_ki.field_106982_c
		// @0996: iload #9
		// @0998: ldc 50000 (0xc350)
		// @099A: imul
		// @099B: ineg
		// @099C: iadd
		// @099D: iadd
		// @099E: invokestatic game.C_100305_km.func_103228_a(int, int, int, int, int, int, int, int)void
		// @09A1: aload_0
		// @09A2: getfield boolean game.C_100294_ki.field_106953_G
		// @09A5: ifeq @117D
		// @09A8: aload_0
		// @09A9: getfield java.lang.String[] game.C_100294_ki.field_106974_Y
		// @09AC: arraylength
		// @09AD: istore_3
		// @09AE: iconst_m1
		// @09AF: aload_0
		// @09B0: getfield int game.C_100294_ki.field_106967_W
		// @09B3: iconst_m1
		// @09B4: ixor
		// @09B5: if_icmple @09EA
		// @09B8: aload_0
		// @09B9: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @09BC: sipush -14829 (0xC613)
		// @09BF: invokevirtual game.C_100202_qi.func_105912_d(int)int
		// @09C2: iconst_m1
		// @09C3: ixor
		// @09C4: bipush -31 (0xE1)
		// @09C6: if_icmple @09EA
		// @09C9: goto @09CD
		// @09CC: athrow
		// @09CD: bipush -42 (0xD6)
		// @09CF: aload_0
		// @09D0: getfield int game.C_100294_ki.field_107004_x
		// @09D3: iconst_m1
		// @09D4: ixor
		// @09D5: if_icmplt @09E0
		// @09D8: goto @09DC
		// @09DB: athrow
		// @09DC: goto @09EA
		// @09DF: athrow
		// @09E0: aload_0
		// @09E1: dup
		// @09E2: getfield int game.C_100294_ki.field_106967_W
		// @09E5: iconst_1
		// @09E6: isub
		// @09E7: putfield int game.C_100294_ki.field_106967_W
		// @09EA: aload_0
		// @09EB: getfield boolean game.C_100294_ki.field_106963_eb
		// @09EE: ifne @117D
		// @09F1: aload_0
		// @09F2: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @09F5: sipush -14829 (0xC613)
		// @09F8: invokevirtual game.C_100202_qi.func_105912_d(int)int
		// @09FB: iload_3
		// @09FC: if_icmple @0A11
		// @09FF: goto @0A03
		// @0A02: athrow
		// @0A03: aload_0
		// @0A04: getfield int game.C_100294_ki.field_106967_W
		// @0A07: iconst_m1
		// @0A08: ixor
		// @0A09: iconst_m1
		// @0A0A: if_icmplt @117D
		// @0A0D: goto @0A11
		// @0A10: athrow
		// @0A11: aload_0
		// @0A12: sipush 3000 (0x0BB8)
		// @0A15: putfield int game.C_100294_ki.field_106967_W
		// @0A18: aload_0
		// @0A19: getfield int game.C_100294_ki.field_107004_x
		// @0A1C: getstatic int[][] game.C_100181_cf.field_105706_c
		// @0A1F: arraylength
		// @0A20: if_icmpge @10E8
		// @0A23: goto @0A27
		// @0A26: athrow
		// @0A27: iconst_m1
		// @0A28: aload_0
		// @0A29: getfield int game.C_100294_ki.field_107004_x
		// @0A2C: iconst_m1
		// @0A2D: ixor
		// @0A2E: if_icmplt @10E8
		// @0A31: goto @0A35
		// @0A34: athrow
		// @0A35: getstatic int[][] game.C_100181_cf.field_105706_c
		// @0A38: aload_0
		// @0A39: getfield int game.C_100294_ki.field_107004_x
		// @0A3C: aaload
		// @0A3D: astore #4
		// @0A3F: aload #4
		// @0A41: arraylength
		// @0A42: istore #5
		// @0A44: iconst_0
		// @0A45: istore #6
		// @0A47: iload #5
		// @0A49: iload #6
		// @0A4B: if_icmple @10E8
		// @0A4E: aload_0
		// @0A4F: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0A52: sipush 23156 (0x5A74)
		// @0A55: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @0A58: iload #6
		// @0A5A: iconst_1
		// @0A5B: iadd
		// @0A5C: imul
		// @0A5D: iconst_1
		// @0A5E: iload #5
		// @0A60: iadd
		// @0A61: idiv
		// @0A62: ldc_w 1008097060 (0x3c165724)
		// @0A65: ishl
		// @0A66: istore #7
		// @0A68: ldc_w -100000 (0xfffe7960)
		// @0A6B: istore #8
		// @0A6D: aconst_null
		// @0A6E: astore #9
		// @0A70: iconst_m1
		// @0A71: aload #4
		// @0A73: iload #6
		// @0A75: iaload
		// @0A76: iconst_m1
		// @0A77: ixor
		// @0A78: iload #15
		// @0A7A: ifne @10EE
		// @0A7D: if_icmpne @0A89
		// @0A80: goto @0A84
		// @0A83: athrow
		// @0A84: getstatic int[] game.C_100242_oh.field_106346_c
		// @0A87: astore #9
		// @0A89: aload #4
		// @0A8B: iload #6
		// @0A8D: iaload
		// @0A8E: iconst_m1
		// @0A8F: ixor
		// @0A90: bipush -2 (0xFE)
		// @0A92: if_icmpne @0A9A
		// @0A95: getstatic int[] game.C_100104_v.field_104701_i
		// @0A98: astore #9
		// @0A9A: aload #4
		// @0A9C: iload #6
		// @0A9E: iaload
		// @0A9F: iconst_m1
		// @0AA0: ixor
		// @0AA1: bipush -3 (0xFD)
		// @0AA3: if_icmpeq @0AAA
		// @0AA6: goto @0AAF
		// @0AA9: athrow
		// @0AAA: getstatic int[] game.C_100059_df.field_101600_M
		// @0AAD: astore #9
		// @0AAF: aload #4
		// @0AB1: iload #6
		// @0AB3: iaload
		// @0AB4: iconst_3
		// @0AB5: if_icmpeq @0ABC
		// @0AB8: goto @0AC1
		// @0ABB: athrow
		// @0ABC: getstatic int[] game.C_100066_dl.field_101635_C
		// @0ABF: astore #9
		// @0AC1: aload #4
		// @0AC3: iload #6
		// @0AC5: iaload
		// @0AC6: iconst_m1
		// @0AC7: ixor
		// @0AC8: bipush -5 (0xFB)
		// @0ACA: if_icmpeq @0AD1
		// @0ACD: goto @0AD6
		// @0AD0: athrow
		// @0AD1: getstatic int[] game.C_100194_rd.field_103076_r
		// @0AD4: astore #9
		// @0AD6: iconst_5
		// @0AD7: aload #4
		// @0AD9: iload #6
		// @0ADB: iaload
		// @0ADC: if_icmpeq @0AE3
		// @0ADF: goto @0AE8
		// @0AE2: athrow
		// @0AE3: getstatic int[] game.C_100228_nn.field_106191_l
		// @0AE6: astore #9
		// @0AE8: bipush -7 (0xF9)
		// @0AEA: aload #4
		// @0AEC: iload #6
		// @0AEE: iaload
		// @0AEF: iconst_m1
		// @0AF0: ixor
		// @0AF1: if_icmpeq @0AF8
		// @0AF4: goto @0AFD
		// @0AF7: athrow
		// @0AF8: getstatic int[] game.C_100197_ra.field_100859_m
		// @0AFB: astore #9
		// @0AFD: aload #4
		// @0AFF: iload #6
		// @0B01: iaload
		// @0B02: bipush 7 (0x07)
		// @0B04: if_icmpeq @0B0B
		// @0B07: goto @0B10
		// @0B0A: athrow
		// @0B0B: getstatic int[] game.C_100005_fk.field_103604_v
		// @0B0E: astore #9
		// @0B10: bipush -9 (0xF7)
		// @0B12: aload #4
		// @0B14: iload #6
		// @0B16: iaload
		// @0B17: iconst_m1
		// @0B18: ixor
		// @0B19: if_icmpne @0B21
		// @0B1C: getstatic int[] game.C_100005_fk.field_103605_u
		// @0B1F: astore #9
		// @0B21: bipush -10 (0xF6)
		// @0B23: aload #4
		// @0B25: iload #6
		// @0B27: iaload
		// @0B28: iconst_m1
		// @0B29: ixor
		// @0B2A: if_icmpeq @0B31
		// @0B2D: goto @0B36
		// @0B30: athrow
		// @0B31: getstatic int[] game.C_100005_fk.field_103607_s
		// @0B34: astore #9
		// @0B36: aload #4
		// @0B38: iload #6
		// @0B3A: iaload
		// @0B3B: bipush 10 (0x0A)
		// @0B3D: if_icmpne @0B45
		// @0B40: getstatic int[] game.C_100005_fk.field_103606_t
		// @0B43: astore #9
		// @0B45: aload #4
		// @0B47: iload #6
		// @0B49: iaload
		// @0B4A: bipush 11 (0x0B)
		// @0B4C: if_icmpeq @0B53
		// @0B4F: goto @0B58
		// @0B52: athrow
		// @0B53: getstatic int[] game.C_100005_fk.field_103602_h
		// @0B56: astore #9
		// @0B58: bipush -13 (0xF3)
		// @0B5A: aload #4
		// @0B5C: iload #6
		// @0B5E: iaload
		// @0B5F: iconst_m1
		// @0B60: ixor
		// @0B61: if_icmpne @0B69
		// @0B64: getstatic int[] game.C_100005_fk.field_103610_p
		// @0B67: astore #9
		// @0B69: aload #4
		// @0B6B: iload #6
		// @0B6D: iaload
		// @0B6E: iconst_m1
		// @0B6F: ixor
		// @0B70: bipush -14 (0xF2)
		// @0B72: if_icmpne @0B7A
		// @0B75: getstatic int[] game.C_100005_fk.field_103597_o
		// @0B78: astore #9
		// @0B7A: bipush -15 (0xF1)
		// @0B7C: aload #4
		// @0B7E: iload #6
		// @0B80: iaload
		// @0B81: iconst_m1
		// @0B82: ixor
		// @0B83: if_icmpeq @0B8A
		// @0B86: goto @0B8F
		// @0B89: athrow
		// @0B8A: getstatic int[] game.C_100005_fk.field_103592_e
		// @0B8D: astore #9
		// @0B8F: aload #4
		// @0B91: iload #6
		// @0B93: iaload
		// @0B94: iconst_m1
		// @0B95: ixor
		// @0B96: bipush -16 (0xF0)
		// @0B98: if_icmpeq @0B9F
		// @0B9B: goto @0BA4
		// @0B9E: athrow
		// @0B9F: getstatic int[] game.C_100005_fk.field_103600_j
		// @0BA2: astore #9
		// @0BA4: aload #4
		// @0BA6: iload #6
		// @0BA8: iaload
		// @0BA9: iconst_m1
		// @0BAA: ixor
		// @0BAB: bipush -17 (0xEF)
		// @0BAD: if_icmpne @0BB5
		// @0BB0: getstatic int[] game.C_100061_dh.field_102000_cc
		// @0BB3: astore #9
		// @0BB5: bipush 17 (0x11)
		// @0BB7: aload #4
		// @0BB9: iload #6
		// @0BBB: iaload
		// @0BBC: if_icmpne @0BC4
		// @0BBF: getstatic int[] game.C_100346_ja.field_103488_k
		// @0BC2: astore #9
		// @0BC4: aload #4
		// @0BC6: iload #6
		// @0BC8: iaload
		// @0BC9: iconst_m1
		// @0BCA: ixor
		// @0BCB: bipush -19 (0xED)
		// @0BCD: if_icmpne @0BD5
		// @0BD0: getstatic int[] game.C_100032_gk.field_103139_bb
		// @0BD3: astore #9
		// @0BD5: aconst_null
		// @0BD6: aload #9
		// @0BD8: if_acmpeq @10E0
		// @0BDB: aload #4
		// @0BDD: iload #6
		// @0BDF: iaload
		// @0BE0: ifeq @1085
		// @0BE3: goto @0BE7
		// @0BE6: athrow
		// @0BE7: new game.C_100314_lf
		// @0BEA: dup
		// @0BEB: iload #7
		// @0BED: iload #8
		// @0BEF: aload_0
		// @0BF0: invokespecial game.C_100314_lf.<init>(int, int, game.C_100294_ki)void
		// @0BF3: astore #10
		// @0BF5: aload #4
		// @0BF7: iload #6
		// @0BF9: iaload
		// @0BFA: istore #11
		// @0BFC: bipush 7 (0x07)
		// @0BFE: iload #11
		// @0C00: if_icmpne @0C0C
		// @0C03: iload #15
		// @0C05: ifeq @0CFC
		// @0C08: goto @0C0C
		// @0C0B: athrow
		// @0C0C: bipush -9 (0xF7)
		// @0C0E: iload #11
		// @0C10: iconst_m1
		// @0C11: ixor
		// @0C12: if_icmpeq @0D26
		// @0C15: goto @0C19
		// @0C18: athrow
		// @0C19: iload #11
		// @0C1B: iconst_m1
		// @0C1C: ixor
		// @0C1D: bipush -10 (0xF6)
		// @0C1F: if_icmpne @0C2F
		// @0C22: goto @0C26
		// @0C25: athrow
		// @0C26: iload #15
		// @0C28: ifeq @0D50
		// @0C2B: goto @0C2F
		// @0C2E: athrow
		// @0C2F: bipush 11 (0x0B)
		// @0C31: iload #11
		// @0C33: if_icmpne @0C43
		// @0C36: goto @0C3A
		// @0C39: athrow
		// @0C3A: iload #15
		// @0C3C: ifeq @0D7C
		// @0C3F: goto @0C43
		// @0C42: athrow
		// @0C43: iload #11
		// @0C45: bipush 10 (0x0A)
		// @0C47: if_icmpne @0C57
		// @0C4A: goto @0C4E
		// @0C4D: athrow
		// @0C4E: iload #15
		// @0C50: ifeq @0DA8
		// @0C53: goto @0C57
		// @0C56: athrow
		// @0C57: iload #11
		// @0C59: bipush 12 (0x0C)
		// @0C5B: if_icmpeq @0DD4
		// @0C5E: goto @0C62
		// @0C61: athrow
		// @0C62: iload #11
		// @0C64: iconst_m1
		// @0C65: ixor
		// @0C66: bipush -14 (0xF2)
		// @0C68: if_icmpeq @0E00
		// @0C6B: goto @0C6F
		// @0C6E: athrow
		// @0C6F: bipush -15 (0xF1)
		// @0C71: iload #11
		// @0C73: iconst_m1
		// @0C74: ixor
		// @0C75: if_icmpne @0C85
		// @0C78: goto @0C7C
		// @0C7B: athrow
		// @0C7C: iload #15
		// @0C7E: ifeq @0E2C
		// @0C81: goto @0C85
		// @0C84: athrow
		// @0C85: bipush -16 (0xF0)
		// @0C87: iload #11
		// @0C89: iconst_m1
		// @0C8A: ixor
		// @0C8B: if_icmpeq @0E5A
		// @0C8E: goto @0C92
		// @0C91: athrow
		// @0C92: bipush 16 (0x10)
		// @0C94: iload #11
		// @0C96: if_icmpne @0CA6
		// @0C99: goto @0C9D
		// @0C9C: athrow
		// @0C9D: iload #15
		// @0C9F: ifeq @0E88
		// @0CA2: goto @0CA6
		// @0CA5: athrow
		// @0CA6: bipush -18 (0xEE)
		// @0CA8: iload #11
		// @0CAA: iconst_m1
		// @0CAB: ixor
		// @0CAC: if_icmpeq @0EB4
		// @0CAF: goto @0CB3
		// @0CB2: athrow
		// @0CB3: iload #11
		// @0CB5: iconst_1
		// @0CB6: if_icmpeq @0EE0
		// @0CB9: goto @0CBD
		// @0CBC: athrow
		// @0CBD: iconst_3
		// @0CBE: iload #11
		// @0CC0: if_icmpeq @0EE0
		// @0CC3: goto @0CC7
		// @0CC6: athrow
		// @0CC7: iload #11
		// @0CC9: iconst_5
		// @0CCA: if_icmpeq @0EE0
		// @0CCD: goto @0CD1
		// @0CD0: athrow
		// @0CD1: bipush -3 (0xFD)
		// @0CD3: iload #11
		// @0CD5: iconst_m1
		// @0CD6: ixor
		// @0CD7: if_icmpeq @0FAD
		// @0CDA: goto @0CDE
		// @0CDD: athrow
		// @0CDE: iconst_4
		// @0CDF: iload #11
		// @0CE1: if_icmpeq @0FAD
		// @0CE4: goto @0CE8
		// @0CE7: athrow
		// @0CE8: iload #11
		// @0CEA: bipush 6 (0x06)
		// @0CEC: if_icmpne @1062
		// @0CEF: goto @0CF3
		// @0CF2: athrow
		// @0CF3: iload #15
		// @0CF5: ifeq @0FAD
		// @0CF8: goto @0CFC
		// @0CFB: athrow
		// @0CFC: aload_0
		// @0CFD: getfield int game.C_100294_ki.field_107003_y
		// @0D00: iconst_1
		// @0D01: iand
		// @0D02: iconst_m1
		// @0D03: ixor
		// @0D04: iconst_m1
		// @0D05: if_icmpeq @0D10
		// @0D08: goto @0D0C
		// @0D0B: athrow
		// @0D0C: goto @1062
		// @0D0F: athrow
		// @0D10: aload #10
		// @0D12: bipush 21 (0x15)
		// @0D14: putfield int game.C_100314_lf.field_101409_qc
		// @0D17: aload_0
		// @0D18: dup
		// @0D19: getfield int game.C_100294_ki.field_107003_y
		// @0D1C: iconst_1
		// @0D1D: ior
		// @0D1E: putfield int game.C_100294_ki.field_107003_y
		// @0D21: iload #15
		// @0D23: ifeq @1062
		// @0D26: iconst_m1
		// @0D27: aload_0
		// @0D28: getfield int game.C_100294_ki.field_107003_y
		// @0D2B: iconst_2
		// @0D2C: iand
		// @0D2D: iconst_m1
		// @0D2E: ixor
		// @0D2F: if_icmpeq @0D3A
		// @0D32: goto @0D36
		// @0D35: athrow
		// @0D36: goto @1062
		// @0D39: athrow
		// @0D3A: aload_0
		// @0D3B: dup
		// @0D3C: getfield int game.C_100294_ki.field_107003_y
		// @0D3F: iconst_2
		// @0D40: ior
		// @0D41: putfield int game.C_100294_ki.field_107003_y
		// @0D44: aload #10
		// @0D46: bipush 28 (0x1C)
		// @0D48: putfield int game.C_100314_lf.field_101409_qc
		// @0D4B: iload #15
		// @0D4D: ifeq @1062
		// @0D50: iconst_m1
		// @0D51: bipush 8 (0x08)
		// @0D53: aload_0
		// @0D54: getfield int game.C_100294_ki.field_107003_y
		// @0D57: iand
		// @0D58: iconst_m1
		// @0D59: ixor
		// @0D5A: if_icmpne @1062
		// @0D5D: goto @0D61
		// @0D60: athrow
		// @0D61: aload #10
		// @0D63: bipush 14 (0x0E)
		// @0D65: putfield int game.C_100314_lf.field_101409_qc
		// @0D68: aload_0
		// @0D69: dup
		// @0D6A: getfield int game.C_100294_ki.field_107003_y
		// @0D6D: bipush 8 (0x08)
		// @0D6F: ior
		// @0D70: putfield int game.C_100294_ki.field_107003_y
		// @0D73: iload #15
		// @0D75: ifeq @1062
		// @0D78: goto @0D7C
		// @0D7B: athrow
		// @0D7C: iconst_m1
		// @0D7D: aload_0
		// @0D7E: getfield int game.C_100294_ki.field_107003_y
		// @0D81: bipush 16 (0x10)
		// @0D83: iand
		// @0D84: iconst_m1
		// @0D85: ixor
		// @0D86: if_icmpeq @0D91
		// @0D89: goto @0D8D
		// @0D8C: athrow
		// @0D8D: goto @1062
		// @0D90: athrow
		// @0D91: aload #10
		// @0D93: bipush 39 (0x27)
		// @0D95: putfield int game.C_100314_lf.field_101409_qc
		// @0D98: aload_0
		// @0D99: dup
		// @0D9A: getfield int game.C_100294_ki.field_107003_y
		// @0D9D: bipush 16 (0x10)
		// @0D9F: ior
		// @0DA0: putfield int game.C_100294_ki.field_107003_y
		// @0DA3: iload #15
		// @0DA5: ifeq @1062
		// @0DA8: aload_0
		// @0DA9: getfield int game.C_100294_ki.field_107003_y
		// @0DAC: bipush 32 (0x20)
		// @0DAE: iand
		// @0DAF: iconst_m1
		// @0DB0: ixor
		// @0DB1: iconst_m1
		// @0DB2: if_icmpne @1062
		// @0DB5: goto @0DB9
		// @0DB8: athrow
		// @0DB9: aload #10
		// @0DBB: bipush 24 (0x18)
		// @0DBD: putfield int game.C_100314_lf.field_101409_qc
		// @0DC0: aload_0
		// @0DC1: dup
		// @0DC2: getfield int game.C_100294_ki.field_107003_y
		// @0DC5: bipush 32 (0x20)
		// @0DC7: ior
		// @0DC8: putfield int game.C_100294_ki.field_107003_y
		// @0DCB: iload #15
		// @0DCD: ifeq @1062
		// @0DD0: goto @0DD4
		// @0DD3: athrow
		// @0DD4: bipush 64 (0x40)
		// @0DD6: aload_0
		// @0DD7: getfield int game.C_100294_ki.field_107003_y
		// @0DDA: iand
		// @0DDB: iconst_m1
		// @0DDC: ixor
		// @0DDD: iconst_m1
		// @0DDE: if_icmpeq @0DE9
		// @0DE1: goto @0DE5
		// @0DE4: athrow
		// @0DE5: goto @1062
		// @0DE8: athrow
		// @0DE9: aload_0
		// @0DEA: dup
		// @0DEB: getfield int game.C_100294_ki.field_107003_y
		// @0DEE: bipush 64 (0x40)
		// @0DF0: ior
		// @0DF1: putfield int game.C_100294_ki.field_107003_y
		// @0DF4: aload #10
		// @0DF6: bipush 35 (0x23)
		// @0DF8: putfield int game.C_100314_lf.field_101409_qc
		// @0DFB: iload #15
		// @0DFD: ifeq @1062
		// @0E00: iconst_0
		// @0E01: sipush 128 (0x0080)
		// @0E04: aload_0
		// @0E05: getfield int game.C_100294_ki.field_107003_y
		// @0E08: iand
		// @0E09: if_icmpne @1062
		// @0E0C: goto @0E10
		// @0E0F: athrow
		// @0E10: aload_0
		// @0E11: dup
		// @0E12: getfield int game.C_100294_ki.field_107003_y
		// @0E15: sipush 128 (0x0080)
		// @0E18: ior
		// @0E19: putfield int game.C_100294_ki.field_107003_y
		// @0E1C: aload #10
		// @0E1E: bipush 44 (0x2C)
		// @0E20: putfield int game.C_100314_lf.field_101409_qc
		// @0E23: iload #15
		// @0E25: ifeq @1062
		// @0E28: goto @0E2C
		// @0E2B: athrow
		// @0E2C: aload_0
		// @0E2D: getfield int game.C_100294_ki.field_107003_y
		// @0E30: sipush 256 (0x0100)
		// @0E33: iand
		// @0E34: iconst_m1
		// @0E35: ixor
		// @0E36: iconst_m1
		// @0E37: if_icmpeq @0E42
		// @0E3A: goto @0E3E
		// @0E3D: athrow
		// @0E3E: goto @1062
		// @0E41: athrow
		// @0E42: aload #10
		// @0E44: bipush 15 (0x0F)
		// @0E46: putfield int game.C_100314_lf.field_101409_qc
		// @0E49: aload_0
		// @0E4A: dup
		// @0E4B: getfield int game.C_100294_ki.field_107003_y
		// @0E4E: sipush 256 (0x0100)
		// @0E51: ior
		// @0E52: putfield int game.C_100294_ki.field_107003_y
		// @0E55: iload #15
		// @0E57: ifeq @1062
		// @0E5A: iconst_m1
		// @0E5B: aload_0
		// @0E5C: getfield int game.C_100294_ki.field_107003_y
		// @0E5F: sipush 512 (0x0200)
		// @0E62: iand
		// @0E63: iconst_m1
		// @0E64: ixor
		// @0E65: if_icmpne @1062
		// @0E68: goto @0E6C
		// @0E6B: athrow
		// @0E6C: aload #10
		// @0E6E: bipush 38 (0x26)
		// @0E70: putfield int game.C_100314_lf.field_101409_qc
		// @0E73: aload_0
		// @0E74: dup
		// @0E75: getfield int game.C_100294_ki.field_107003_y
		// @0E78: sipush 512 (0x0200)
		// @0E7B: ior
		// @0E7C: putfield int game.C_100294_ki.field_107003_y
		// @0E7F: iload #15
		// @0E81: ifeq @1062
		// @0E84: goto @0E88
		// @0E87: athrow
		// @0E88: iconst_0
		// @0E89: sipush 1024 (0x0400)
		// @0E8C: aload_0
		// @0E8D: getfield int game.C_100294_ki.field_107003_y
		// @0E90: iand
		// @0E91: if_icmpne @1062
		// @0E94: goto @0E98
		// @0E97: athrow
		// @0E98: aload #10
		// @0E9A: bipush 37 (0x25)
		// @0E9C: putfield int game.C_100314_lf.field_101409_qc
		// @0E9F: aload_0
		// @0EA0: dup
		// @0EA1: getfield int game.C_100294_ki.field_107003_y
		// @0EA4: sipush 1024 (0x0400)
		// @0EA7: ior
		// @0EA8: putfield int game.C_100294_ki.field_107003_y
		// @0EAB: iload #15
		// @0EAD: ifeq @1062
		// @0EB0: goto @0EB4
		// @0EB3: athrow
		// @0EB4: iconst_0
		// @0EB5: sipush 2048 (0x0800)
		// @0EB8: aload_0
		// @0EB9: getfield int game.C_100294_ki.field_107003_y
		// @0EBC: iand
		// @0EBD: if_icmpeq @0EC8
		// @0EC0: goto @0EC4
		// @0EC3: athrow
		// @0EC4: goto @1062
		// @0EC7: athrow
		// @0EC8: aload_0
		// @0EC9: dup
		// @0ECA: getfield int game.C_100294_ki.field_107003_y
		// @0ECD: sipush 2048 (0x0800)
		// @0ED0: ior
		// @0ED1: putfield int game.C_100294_ki.field_107003_y
		// @0ED4: aload #10
		// @0ED6: bipush 30 (0x1E)
		// @0ED8: putfield int game.C_100314_lf.field_101409_qc
		// @0EDB: iload #15
		// @0EDD: ifeq @1062
		// @0EE0: iconst_0
		// @0EE1: aload_0
		// @0EE2: getfield int game.C_100294_ki.field_106948_db
		// @0EE5: iconst_1
		// @0EE6: aload_0
		// @0EE7: getfield int game.C_100294_ki.field_107004_x
		// @0EEA: iconst_2
		// @0EEB: idiv
		// @0EEC: ishl
		// @0EED: iand
		// @0EEE: if_icmpeq @0EF9
		// @0EF1: goto @0EF5
		// @0EF4: athrow
		// @0EF5: goto @1062
		// @0EF8: athrow
		// @0EF9: aload_0
		// @0EFA: dup
		// @0EFB: getfield int game.C_100294_ki.field_106948_db
		// @0EFE: iconst_1
		// @0EFF: aload_0
		// @0F00: getfield int game.C_100294_ki.field_107004_x
		// @0F03: iconst_2
		// @0F04: idiv
		// @0F05: ishl
		// @0F06: ior
		// @0F07: putfield int game.C_100294_ki.field_106948_db
		// @0F0A: aload_0
		// @0F0B: getfield int game.C_100294_ki.field_107004_x
		// @0F0E: bipush 8 (0x08)
		// @0F10: idiv
		// @0F11: istore #11
		// @0F13: iconst_m1
		// @0F14: iload #11
		// @0F16: iconst_m1
		// @0F17: ixor
		// @0F18: if_icmpeq @0F5E
		// @0F1B: iload #11
		// @0F1D: iconst_m1
		// @0F1E: ixor
		// @0F1F: bipush -2 (0xFE)
		// @0F21: if_icmpeq @0F6D
		// @0F24: goto @0F28
		// @0F27: athrow
		// @0F28: iload #11
		// @0F2A: iconst_m1
		// @0F2B: ixor
		// @0F2C: bipush -3 (0xFD)
		// @0F2E: if_icmpne @0F3E
		// @0F31: goto @0F35
		// @0F34: athrow
		// @0F35: iload #15
		// @0F37: ifeq @0F7D
		// @0F3A: goto @0F3E
		// @0F3D: athrow
		// @0F3E: iload #11
		// @0F40: iconst_3
		// @0F41: if_icmpeq @0F8D
		// @0F44: goto @0F48
		// @0F47: athrow
		// @0F48: iload #11
		// @0F4A: iconst_m1
		// @0F4B: ixor
		// @0F4C: bipush -5 (0xFB)
		// @0F4E: if_icmpne @1062
		// @0F51: goto @0F55
		// @0F54: athrow
		// @0F55: iload #15
		// @0F57: ifeq @0F9D
		// @0F5A: goto @0F5E
		// @0F5D: athrow
		// @0F5E: aload #10
		// @0F60: iconst_5
		// @0F61: putfield int game.C_100314_lf.field_101409_qc
		// @0F64: iload #15
		// @0F66: ifeq @1062
		// @0F69: goto @0F6D
		// @0F6C: athrow
		// @0F6D: aload #10
		// @0F6F: bipush 6 (0x06)
		// @0F71: putfield int game.C_100314_lf.field_101409_qc
		// @0F74: iload #15
		// @0F76: ifeq @1062
		// @0F79: goto @0F7D
		// @0F7C: athrow
		// @0F7D: aload #10
		// @0F7F: bipush 7 (0x07)
		// @0F81: putfield int game.C_100314_lf.field_101409_qc
		// @0F84: iload #15
		// @0F86: ifeq @1062
		// @0F89: goto @0F8D
		// @0F8C: athrow
		// @0F8D: aload #10
		// @0F8F: bipush 8 (0x08)
		// @0F91: putfield int game.C_100314_lf.field_101409_qc
		// @0F94: iload #15
		// @0F96: ifeq @1062
		// @0F99: goto @0F9D
		// @0F9C: athrow
		// @0F9D: aload #10
		// @0F9F: bipush 9 (0x09)
		// @0FA1: putfield int game.C_100314_lf.field_101409_qc
		// @0FA4: iload #15
		// @0FA6: ifeq @1062
		// @0FA9: goto @0FAD
		// @0FAC: athrow
		// @0FAD: iconst_0
		// @0FAE: aload_0
		// @0FAF: getfield int game.C_100294_ki.field_106952_F
		// @0FB2: iconst_1
		// @0FB3: aload_0
		// @0FB4: getfield int game.C_100294_ki.field_107004_x
		// @0FB7: iconst_2
		// @0FB8: idiv
		// @0FB9: ishl
		// @0FBA: iand
		// @0FBB: if_icmpeq @0FC6
		// @0FBE: goto @0FC2
		// @0FC1: athrow
		// @0FC2: goto @1062
		// @0FC5: athrow
		// @0FC6: aload_0
		// @0FC7: dup
		// @0FC8: getfield int game.C_100294_ki.field_106952_F
		// @0FCB: iconst_1
		// @0FCC: aload_0
		// @0FCD: getfield int game.C_100294_ki.field_107004_x
		// @0FD0: iconst_2
		// @0FD1: idiv
		// @0FD2: ishl
		// @0FD3: ior
		// @0FD4: putfield int game.C_100294_ki.field_106952_F
		// @0FD7: aload_0
		// @0FD8: getfield int game.C_100294_ki.field_107004_x
		// @0FDB: bipush 8 (0x08)
		// @0FDD: idiv
		// @0FDE: istore #11
		// @0FE0: iconst_m1
		// @0FE1: iload #11
		// @0FE3: iconst_m1
		// @0FE4: ixor
		// @0FE5: if_icmpeq @1020
		// @0FE8: iload #11
		// @0FEA: iconst_1
		// @0FEB: if_icmpeq @102B
		// @0FEE: goto @0FF2
		// @0FF1: athrow
		// @0FF2: iload #11
		// @0FF4: iconst_2
		// @0FF5: if_icmpeq @103A
		// @0FF8: goto @0FFC
		// @0FFB: athrow
		// @0FFC: bipush -4 (0xFC)
		// @0FFE: iload #11
		// @1000: iconst_m1
		// @1001: ixor
		// @1002: if_icmpne @1012
		// @1005: goto @1009
		// @1008: athrow
		// @1009: iload #15
		// @100B: ifeq @1049
		// @100E: goto @1012
		// @1011: athrow
		// @1012: iconst_4
		// @1013: iload #11
		// @1015: if_icmpeq @1058
		// @1018: goto @101C
		// @101B: athrow
		// @101C: goto @1062
		// @101F: athrow
		// @1020: aload #10
		// @1022: iconst_0
		// @1023: putfield int game.C_100314_lf.field_101409_qc
		// @1026: iload #15
		// @1028: ifeq @1062
		// @102B: aload #10
		// @102D: iconst_1
		// @102E: putfield int game.C_100314_lf.field_101409_qc
		// @1031: iload #15
		// @1033: ifeq @1062
		// @1036: goto @103A
		// @1039: athrow
		// @103A: aload #10
		// @103C: iconst_2
		// @103D: putfield int game.C_100314_lf.field_101409_qc
		// @1040: iload #15
		// @1042: ifeq @1062
		// @1045: goto @1049
		// @1048: athrow
		// @1049: aload #10
		// @104B: iconst_3
		// @104C: putfield int game.C_100314_lf.field_101409_qc
		// @104F: iload #15
		// @1051: ifeq @1062
		// @1054: goto @1058
		// @1057: athrow
		// @1058: aload #10
		// @105A: iconst_4
		// @105B: putfield int game.C_100314_lf.field_101409_qc
		// @105E: goto @1062
		// @1061: athrow
		// @1062: aload #10
		// @1064: aload #9
		// @1066: iconst_1
		// @1067: bipush 61 (0x3D)
		// @1069: iconst_m1
		// @106A: iconst_0
		// @106B: invokevirtual game.C_100314_lf.func_101263_a(int[], int, byte, int, boolean)void
		// @106E: aload #10
		// @1070: bipush 7 (0x07)
		// @1072: putfield int game.C_100314_lf.field_101387_Xb
		// @1075: aload_0
		// @1076: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @1079: bipush 123 (0x7B)
		// @107B: aload #10
		// @107D: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1080: iload #15
		// @1082: ifeq @10E0
		// @1085: bipush -4 (0xFC)
		// @1087: istore #10
		// @1089: bipush -5 (0xFB)
		// @108B: iload #10
		// @108D: iconst_m1
		// @108E: ixor
		// @108F: if_icmpgt @10E0
		// @1092: new game.C_100314_lf
		// @1095: dup
		// @1096: iload #7
		// @1098: iload #10
		// @109A: sipush 3000 (0x0BB8)
		// @109D: imul
		// @109E: ineg
		// @109F: isub
		// @10A0: iload #8
		// @10A2: aload_0
		// @10A3: invokespecial game.C_100314_lf.<init>(int, int, game.C_100294_ki)void
		// @10A6: astore #11
		// @10A8: aload #11
		// @10AA: aload #9
		// @10AC: iconst_1
		// @10AD: bipush 61 (0x3D)
		// @10AF: iconst_m1
		// @10B0: iconst_0
		// @10B1: invokevirtual game.C_100314_lf.func_101263_a(int[], int, byte, int, boolean)void
		// @10B4: aload #11
		// @10B6: iload #10
		// @10B8: iconst_5
		// @10B9: imul
		// @10BA: putfield int game.C_100314_lf.field_101294_gc
		// @10BD: aload #11
		// @10BF: bipush 7 (0x07)
		// @10C1: putfield int game.C_100314_lf.field_101387_Xb
		// @10C4: aload_0
		// @10C5: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @10C8: bipush 127 (0x7F)
		// @10CA: aload #11
		// @10CC: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @10CF: iinc #10 +1
		// @10D2: iload #15
		// @10D4: ifne @10E3
		// @10D7: iload #15
		// @10D9: ifeq @1089
		// @10DC: goto @10E0
		// @10DF: athrow
		// @10E0: iinc #6 +1
		// @10E3: iload #15
		// @10E5: ifeq @0A47
		// @10E8: bipush 42 (0x2A)
		// @10EA: aload_0
		// @10EB: getfield int game.C_100294_ki.field_107004_x
		// @10EE: if_icmple @110C
		// @10F1: aload_0
		// @10F2: getfield int game.C_100294_ki.field_107004_x
		// @10F5: iconst_m1
		// @10F6: ixor
		// @10F7: bipush -41 (0xD7)
		// @10F9: if_icmpgt @113D
		// @10FC: goto @1100
		// @10FF: athrow
		// @1100: aload_0
		// @1101: getfield int game.C_100294_ki.field_106999_q
		// @1104: iconst_1
		// @1105: if_icmpgt @113D
		// @1108: goto @110C
		// @110B: athrow
		// @110C: aload_0
		// @110D: getfield boolean game.C_100294_ki.field_106963_eb
		// @1110: ifeq @111B
		// @1113: goto @1117
		// @1116: athrow
		// @1117: goto @117D
		// @111A: athrow
		// @111B: iload_3
		// @111C: aload_0
		// @111D: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @1120: sipush -14829 (0xC613)
		// @1123: invokevirtual game.C_100202_qi.func_105912_d(int)int
		// @1126: if_icmplt @117D
		// @1129: aload_0
		// @112A: iconst_1
		// @112B: putfield boolean game.C_100294_ki.field_106963_eb
		// @112E: aload_0
		// @112F: bipush 43 (0x2B)
		// @1131: putfield int game.C_100294_ki.field_107004_x
		// @1134: iload #15
		// @1136: ifeq @117D
		// @1139: goto @113D
		// @113C: athrow
		// @113D: aload_0
		// @113E: dup
		// @113F: getfield int game.C_100294_ki.field_107004_x
		// @1142: iconst_1
		// @1143: iadd
		// @1144: putfield int game.C_100294_ki.field_107004_x
		// @1147: aload_0
		// @1148: aload_0
		// @1149: getfield int game.C_100294_ki.field_107004_x
		// @114C: putfield int game.C_100294_ki.field_106994_v
		// @114F: aload_0
		// @1150: getfield int game.C_100294_ki.field_107004_x
		// @1153: iconst_m1
		// @1154: ixor
		// @1155: bipush -42 (0xD6)
		// @1157: if_icmpeq @1162
		// @115A: goto @115E
		// @115D: athrow
		// @115E: goto @1168
		// @1161: athrow
		// @1162: aload_0
		// @1163: bipush 50 (0x32)
		// @1165: putfield int game.C_100294_ki.field_106994_v
		// @1168: aload_0
		// @1169: getfield int game.C_100294_ki.field_107004_x
		// @116C: iconst_m1
		// @116D: ixor
		// @116E: bipush -43 (0xD5)
		// @1170: if_icmpne @117D
		// @1173: aload_0
		// @1174: bipush 100 (0x64)
		// @1176: putfield int game.C_100294_ki.field_106994_v
		// @1179: goto @117D
		// @117C: athrow
		// @117D: aload_0
		// @117E: bipush -120 (0x88)
		// @1180: invokespecial game.C_100294_ki.func_106912_b(byte)void
		// @1183: aload_0
		// @1184: dup
		// @1185: getfield int game.C_100294_ki.field_106951_E
		// @1188: iconst_1
		// @1189: iadd
		// @118A: putfield int game.C_100294_ki.field_106951_E
		// @118D: aload_0
		// @118E: getfield boolean game.C_100294_ki.field_106963_eb
		// @1191: ifeq @11AA
		// @1194: bipush 7 (0x07)
		// @1196: aload_0
		// @1197: getfield int game.C_100294_ki.field_106951_E
		// @119A: iand
		// @119B: iconst_m1
		// @119C: ixor
		// @119D: iconst_m1
		// @119E: if_icmpne @11A9
		// @11A1: goto @11A5
		// @11A4: athrow
		// @11A5: goto @11AA
		// @11A8: athrow
		// @11A9: return
		// @11AA: bipush -5 (0xFB)
		// @11AC: aload_0
		// @11AD: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @11B0: sipush 26294 (0x66B6)
		// @11B3: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @11B6: iconst_m1
		// @11B7: ixor
		// @11B8: if_icmpeq @11BE
		// @11BB: goto @11C7
		// @11BE: aload_0
		// @11BF: iload_1
		// @11C0: sipush 3002 (0x0BBA)
		// @11C3: ixor
		// @11C4: invokespecial game.C_100294_ki.func_106939_g(int)void
		// @11C7: aload_0
		// @11C8: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @11CB: iload_1
		// @11CC: sipush 27918 (0x6D0E)
		// @11CF: ixor
		// @11D0: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @11D3: iconst_m1
		// @11D4: ixor
		// @11D5: bipush -2 (0xFE)
		// @11D7: if_icmpne @1319
		// @11DA: iconst_0
		// @11DB: getstatic int game.C_100218_am.field_103115_N
		// @11DE: iconst_m1
		// @11DF: ixor
		// @11E0: if_icmpne @1319
		// @11E3: goto @11E7
		// @11E6: athrow
		// @11E7: iconst_1
		// @11E8: istore_3
		// @11E9: iconst_0
		// @11EA: istore #4
		// @11EC: aload_0
		// @11ED: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @11F0: iload_1
		// @11F1: sipush -2949 (0xF47B)
		// @11F4: iadd
		// @11F5: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @11F8: checkcast game.C_100314_lf
		// @11FB: astore #5
		// @11FD: aload #5
		// @11FF: ifnull @1247
		// @1202: iconst_0
		// @1203: aload #5
		// @1205: getfield int game.C_100314_lf.field_101346_Z
		// @1208: iload #15
		// @120A: ifne @124A
		// @120D: if_icmpeq @1217
		// @1210: goto @1214
		// @1213: athrow
		// @1214: goto @1221
		// @1217: iload #4
		// @1219: aload #5
		// @121B: getfield int game.C_100314_lf.field_101316_G
		// @121E: iadd
		// @121F: istore #4
		// @1221: aload #5
		// @1223: getfield int game.C_100314_lf.field_101346_Z
		// @1226: iconst_1
		// @1227: if_icmpne @1234
		// @122A: iload #4
		// @122C: aload #5
		// @122E: getfield int game.C_100314_lf.field_101316_G
		// @1231: isub
		// @1232: istore #4
		// @1234: aload_0
		// @1235: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @1238: bipush 37 (0x25)
		// @123A: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @123D: checkcast game.C_100314_lf
		// @1240: astore #5
		// @1242: iload #15
		// @1244: ifeq @11FD
		// @1247: iconst_0
		// @1248: iload #4
		// @124A: if_icmpgt @1250
		// @124D: goto @1252
		// @1250: iconst_m1
		// @1251: istore_3
		// @1252: aload_0
		// @1253: getfield int game.C_100294_ki.field_106951_E
		// @1256: sipush 12000 (0x2EE0)
		// @1259: if_icmpne @1280
		// @125C: new game.C_100018_wk
		// @125F: dup
		// @1260: iconst_0
		// @1261: iconst_0
		// @1262: iload_3
		// @1263: iconst_0
		// @1264: iconst_0
		// @1265: iconst_1
		// @1266: bipush 12 (0x0C)
		// @1268: aload_0
		// @1269: aconst_null
		// @126A: iconst_0
		// @126B: iconst_0
		// @126C: iconst_0
		// @126D: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @1270: astore #5
		// @1272: aload_0
		// @1273: getfield game.C_100202_qi game.C_100294_ki.field_106977_f
		// @1276: iload_1
		// @1277: sipush -2876 (0xF4C4)
		// @127A: iadd
		// @127B: aload #5
		// @127D: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1280: aload_0
		// @1281: getfield int game.C_100294_ki.field_106951_E
		// @1284: iconst_m1
		// @1285: ixor
		// @1286: sipush -18001 (0xB9AF)
		// @1289: if_icmpne @12B0
		// @128C: new game.C_100018_wk
		// @128F: dup
		// @1290: iconst_0
		// @1291: iconst_0
		// @1292: iload_3
		// @1293: iconst_0
		// @1294: iconst_0
		// @1295: iconst_1
		// @1296: bipush 12 (0x0C)
		// @1298: aload_0
		// @1299: aconst_null
		// @129A: iconst_0
		// @129B: iconst_0
		// @129C: iconst_0
		// @129D: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @12A0: astore #5
		// @12A2: aload_0
		// @12A3: getfield game.C_100202_qi game.C_100294_ki.field_106977_f
		// @12A6: iload_1
		// @12A7: sipush -2877 (0xF4C3)
		// @12AA: iadd
		// @12AB: aload #5
		// @12AD: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @12B0: aload_0
		// @12B1: getfield int game.C_100294_ki.field_106951_E
		// @12B4: sipush 24000 (0x5DC0)
		// @12B7: if_icmpeq @12BE
		// @12BA: goto @12E3
		// @12BD: athrow
		// @12BE: new game.C_100018_wk
		// @12C1: dup
		// @12C2: iconst_0
		// @12C3: iconst_0
		// @12C4: iload_3
		// @12C5: ineg
		// @12C6: iconst_0
		// @12C7: iconst_0
		// @12C8: iconst_1
		// @12C9: bipush 14 (0x0E)
		// @12CB: aload_0
		// @12CC: aconst_null
		// @12CD: iconst_0
		// @12CE: iconst_0
		// @12CF: iconst_0
		// @12D0: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @12D3: astore #5
		// @12D5: aload_0
		// @12D6: getfield game.C_100202_qi game.C_100294_ki.field_106977_f
		// @12D9: iload_1
		// @12DA: sipush -2875 (0xF4C5)
		// @12DD: iadd
		// @12DE: aload #5
		// @12E0: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @12E3: sipush 29750 (0x7436)
		// @12E6: aload_0
		// @12E7: getfield int game.C_100294_ki.field_106951_E
		// @12EA: if_icmpne @1319
		// @12ED: aload_0
		// @12EE: iconst_1
		// @12EF: putfield int game.C_100294_ki.field_106972_S
		// @12F2: new game.C_100018_wk
		// @12F5: dup
		// @12F6: iconst_0
		// @12F7: iconst_0
		// @12F8: iload_3
		// @12F9: ineg
		// @12FA: iconst_0
		// @12FB: iconst_0
		// @12FC: iconst_1
		// @12FD: bipush 16 (0x10)
		// @12FF: aload_0
		// @1300: aconst_null
		// @1301: iconst_0
		// @1302: iconst_0
		// @1303: iconst_0
		// @1304: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @1307: astore #5
		// @1309: aload #5
		// @130B: putstatic game.C_100018_wk game.C_100145_ta.field_100426_n
		// @130E: aload_0
		// @130F: getfield game.C_100202_qi game.C_100294_ki.field_106977_f
		// @1312: bipush 125 (0x7D)
		// @1314: aload #5
		// @1316: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1319: iconst_0
		// @131A: aload_0
		// @131B: getfield int game.C_100294_ki.field_106961_H
		// @131E: if_icmplt @1325
		// @1321: goto @1342
		// @1324: athrow
		// @1325: aload_0
		// @1326: dup
		// @1327: getfield int game.C_100294_ki.field_106961_H
		// @132A: iconst_1
		// @132B: iadd
		// @132C: putfield int game.C_100294_ki.field_106961_H
		// @132F: sipush 550 (0x0226)
		// @1332: aload_0
		// @1333: getfield int game.C_100294_ki.field_106961_H
		// @1336: if_icmplt @133D
		// @1339: goto @1342
		// @133C: athrow
		// @133D: aload_0
		// @133E: iconst_0
		// @133F: putfield int game.C_100294_ki.field_106961_H
		// @1342: iconst_m1
		// @1343: istore_3
		// @1344: iconst_0
		// @1345: istore #4
		// @1347: aload_0
		// @1348: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @134B: sipush 26294 (0x66B6)
		// @134E: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @1351: iconst_m1
		// @1352: ixor
		// @1353: bipush -2 (0xFE)
		// @1355: if_icmpne @135D
		// @1358: iconst_1
		// @1359: goto @135E
		// @135C: athrow
		// @135D: iconst_0
		// @135E: istore #5
		// @1360: aload_0
		// @1361: getfield int game.C_100294_ki.field_106999_q
		// @1364: aload_0
		// @1365: getfield int game.C_100294_ki.field_106990_h
		// @1368: ineg
		// @1369: isub
		// @136A: newarray int[]
		// @136C: astore #6
		// @136E: iconst_0
		// @136F: istore #7
		// @1371: aload_0
		// @1372: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @1375: iload_1
		// @1376: sipush 3049 (0x0BE9)
		// @1379: ixor
		// @137A: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @137D: checkcast game.C_100314_lf
		// @1380: astore #8
		// @1382: aload #8
		// @1384: ifnull @1492
		// @1387: aload #8
		// @1389: aload_0
		// @138A: getfield int game.C_100294_ki.field_106951_E
		// @138D: iload_1
		// @138E: sipush -2908 (0xF4A4)
		// @1391: iadd
		// @1392: invokevirtual game.C_100314_lf.func_101282_b(int, int)void
		// @1395: iconst_0
		// @1396: aload #8
		// @1398: getfield int game.C_100314_lf.field_101347_Gb
		// @139B: iload #15
		// @139D: ifne @1499
		// @13A0: if_icmpgt @147F
		// @13A3: goto @13A7
		// @13A6: athrow
		// @13A7: iconst_m1
		// @13A8: aload #8
		// @13AA: getfield int game.C_100314_lf.field_101347_Gb
		// @13AD: iconst_m1
		// @13AE: ixor
		// @13AF: if_icmplt @147F
		// @13B2: goto @13B6
		// @13B5: athrow
		// @13B6: aload_0
		// @13B7: getfield int game.C_100294_ki.field_106999_q
		// @13BA: aload_0
		// @13BB: getfield int game.C_100294_ki.field_106990_h
		// @13BE: iadd
		// @13BF: aload #8
		// @13C1: getfield int game.C_100314_lf.field_101347_Gb
		// @13C4: if_icmple @147F
		// @13C7: goto @13CB
		// @13CA: athrow
		// @13CB: aload #8
		// @13CD: getfield boolean game.C_100314_lf.field_101390_lc
		// @13D0: ifne @147F
		// @13D3: goto @13D7
		// @13D6: athrow
		// @13D7: aload #8
		// @13D9: getfield boolean game.C_100314_lf.field_101326_I
		// @13DC: ifne @13EF
		// @13DF: goto @13E3
		// @13E2: athrow
		// @13E3: iload #7
		// @13E5: iconst_1
		// @13E6: aload #8
		// @13E8: getfield int game.C_100314_lf.field_101346_Z
		// @13EB: ishl
		// @13EC: ior
		// @13ED: istore #7
		// @13EF: aload #6
		// @13F1: aload #8
		// @13F3: getfield int game.C_100314_lf.field_101347_Gb
		// @13F6: aload #8
		// @13F8: getfield int game.C_100314_lf.field_101316_G
		// @13FB: iastore
		// @13FC: aload #6
		// @13FE: aload #8
		// @1400: getfield int game.C_100314_lf.field_101347_Gb
		// @1403: iaload
		// @1404: ifle @140B
		// @1407: goto @1414
		// @140A: athrow
		// @140B: aload #6
		// @140D: aload #8
		// @140F: getfield int game.C_100314_lf.field_101347_Gb
		// @1412: iconst_1
		// @1413: iastore
		// @1414: aload #8
		// @1416: getfield int game.C_100314_lf.field_101316_G
		// @1419: aload_0
		// @141A: getfield int game.C_100294_ki.field_106994_v
		// @141D: ldc_w 100000 (0x186a0)
		// @1420: imul
		// @1421: if_icmplt @142D
		// @1424: iload #5
		// @1426: ifeq @144F
		// @1429: goto @142D
		// @142C: athrow
		// @142D: iload #4
		// @142F: iconst_m1
		// @1430: ixor
		// @1431: aload #8
		// @1433: getfield int game.C_100314_lf.field_101316_G
		// @1436: iconst_m1
		// @1437: ixor
		// @1438: if_icmpgt @1443
		// @143B: goto @143F
		// @143E: athrow
		// @143F: goto @147F
		// @1442: athrow
		// @1443: aload #8
		// @1445: getfield int game.C_100314_lf.field_101316_G
		// @1448: istore #4
		// @144A: iload #15
		// @144C: ifeq @147F
		// @144F: aload #8
		// @1451: getfield int game.C_100314_lf.field_101316_G
		// @1454: iload #4
		// @1456: if_icmpne @1464
		// @1459: goto @145D
		// @145C: athrow
		// @145D: iconst_m1
		// @145E: istore_3
		// @145F: iload #15
		// @1461: ifeq @147F
		// @1464: aload #8
		// @1466: getfield int game.C_100314_lf.field_101316_G
		// @1469: iload #4
		// @146B: if_icmple @147F
		// @146E: goto @1472
		// @1471: athrow
		// @1472: aload #8
		// @1474: getfield int game.C_100314_lf.field_101347_Gb
		// @1477: istore_3
		// @1478: aload #8
		// @147A: getfield int game.C_100314_lf.field_101316_G
		// @147D: istore #4
		// @147F: aload_0
		// @1480: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @1483: bipush 85 (0x55)
		// @1485: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @1488: checkcast game.C_100314_lf
		// @148B: astore #8
		// @148D: iload #15
		// @148F: ifeq @1382
		// @1492: iconst_m1
		// @1493: aload_0
		// @1494: getfield int game.C_100294_ki.field_106972_S
		// @1497: iconst_m1
		// @1498: ixor
		// @1499: if_icmpne @14DA
		// @149C: iload_3
		// @149D: iconst_m1
		// @149E: ixor
		// @149F: iconst_m1
		// @14A0: if_icmple @14DA
		// @14A3: goto @14A7
		// @14A6: athrow
		// @14A7: aload_0
		// @14A8: getfield int game.C_100294_ki.field_106975_X
		// @14AB: iconst_m1
		// @14AC: ixor
		// @14AD: iconst_m1
		// @14AE: if_icmpge @14DA
		// @14B1: goto @14B5
		// @14B4: athrow
		// @14B5: aload_0
		// @14B6: getfield game.C_100314_lf game.C_100294_ki.field_106958_M
		// @14B9: ifnull @14DA
		// @14BC: goto @14C0
		// @14BF: athrow
		// @14C0: aload_0
		// @14C1: getfield game.C_100314_lf game.C_100294_ki.field_106958_M
		// @14C4: getfield int game.C_100314_lf.field_101316_G
		// @14C7: ldc_w 200000 (0x30d40)
		// @14CA: if_icmplt @14DA
		// @14CD: goto @14D1
		// @14D0: athrow
		// @14D1: aload_0
		// @14D2: iconst_1
		// @14D3: putfield int game.C_100294_ki.field_106972_S
		// @14D6: goto @14DA
		// @14D9: athrow
		// @14DA: ldc 50000 (0xc350)
		// @14DC: aload_0
		// @14DD: getfield int game.C_100294_ki.field_106994_v
		// @14E0: imul
		// @14E1: iconst_m1
		// @14E2: ixor
		// @14E3: iload #4
		// @14E5: iconst_m1
		// @14E6: ixor
		// @14E7: if_icmplt @157E
		// @14EA: aload_0
		// @14EB: getfield boolean game.C_100294_ki.field_106947_bb
		// @14EE: ifne @14F9
		// @14F1: goto @14F5
		// @14F4: athrow
		// @14F5: goto @157E
		// @14F8: athrow
		// @14F9: aload_0
		// @14FA: iconst_0
		// @14FB: putfield boolean game.C_100294_ki.field_106947_bb
		// @14FE: aload_0
		// @14FF: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1502: iload_1
		// @1503: sipush 20940 (0x51CC)
		// @1506: ixor
		// @1507: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @150A: ldc_w 1499694723 (0x59638683)
		// @150D: ishl
		// @150E: istore #8
		// @1510: ldc_w -500000 (0xfff85ee0)
		// @1513: istore #9
		// @1515: new game.C_100314_lf
		// @1518: dup
		// @1519: iload #8
		// @151B: iload #9
		// @151D: aload_0
		// @151E: invokespecial game.C_100314_lf.<init>(int, int, game.C_100294_ki)void
		// @1521: astore #10
		// @1523: aload #10
		// @1525: iconst_1
		// @1526: putfield boolean game.C_100314_lf.field_101308_pc
		// @1529: aload #10
		// @152B: getstatic int[] game.C_100194_rd.field_103075_s
		// @152E: aload_0
		// @152F: getfield int game.C_100294_ki.field_106999_q
		// @1532: aload_0
		// @1533: getfield int game.C_100294_ki.field_106990_h
		// @1536: iadd
		// @1537: bipush 61 (0x3D)
		// @1539: iconst_m1
		// @153A: iconst_0
		// @153B: invokevirtual game.C_100314_lf.func_101263_a(int[], int, byte, int, boolean)void
		// @153E: aload_0
		// @153F: aload #10
		// @1541: putfield game.C_100314_lf game.C_100294_ki.field_106958_M
		// @1544: aload #10
		// @1546: bipush 11 (0x0B)
		// @1548: putfield int game.C_100314_lf.field_101387_Xb
		// @154B: aload_0
		// @154C: aload #10
		// @154E: getfield int game.C_100314_lf.field_101347_Gb
		// @1551: putfield int game.C_100294_ki.field_106975_X
		// @1554: aload #10
		// @1556: bipush 121 (0x79)
		// @1558: invokevirtual game.C_100314_lf.func_101290_h(int)void
		// @155B: aload #10
		// @155D: ldc_w 131585 (0x20201)
		// @1560: putfield int game.C_100314_lf.field_101336_Q
		// @1563: aload #10
		// @1565: sipush 1000 (0x03E8)
		// @1568: putfield int game.C_100314_lf.field_101294_gc
		// @156B: aload #10
		// @156D: sipush 250 (0x00FA)
		// @1570: putfield int game.C_100314_lf.field_101397_ic
		// @1573: aload_0
		// @1574: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @1577: bipush 123 (0x7B)
		// @1579: aload #10
		// @157B: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @157E: aload_0
		// @157F: getfield boolean game.C_100294_ki.field_106976_Z
		// @1582: ifeq @15D2
		// @1585: aload_0
		// @1586: getfield boolean game.C_100294_ki.field_106953_G
		// @1589: ifne @15D2
		// @158C: goto @1590
		// @158F: athrow
		// @1590: aload_0
		// @1591: getfield int game.C_100294_ki.field_106951_E
		// @1594: sipush 1200 (0x04B0)
		// @1597: irem
		// @1598: iconst_m1
		// @1599: ixor
		// @159A: iconst_m1
		// @159B: if_icmpeq @15BD
		// @159E: goto @15A2
		// @15A1: athrow
		// @15A2: sipush -151 (0xFF69)
		// @15A5: aload_0
		// @15A6: getfield int game.C_100294_ki.field_106972_S
		// @15A9: iconst_m1
		// @15AA: ixor
		// @15AB: if_icmple @15D2
		// @15AE: goto @15B2
		// @15B1: athrow
		// @15B2: aload_0
		// @15B3: getfield boolean game.C_100294_ki.field_106963_eb
		// @15B6: ifne @15D2
		// @15B9: goto @15BD
		// @15BC: athrow
		// @15BD: aload_0
		// @15BE: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @15C1: iload_1
		// @15C2: sipush -17829 (0xBA5B)
		// @15C5: iadd
		// @15C6: invokevirtual game.C_100202_qi.func_105912_d(int)int
		// @15C9: bipush 16 (0x10)
		// @15CB: if_icmplt @17C6
		// @15CE: goto @15D2
		// @15D1: athrow
		// @15D2: aload_0
		// @15D3: getfield boolean game.C_100294_ki.field_106953_G
		// @15D6: ifne @18CB
		// @15D9: goto @15DD
		// @15DC: athrow
		// @15DD: aload_0
		// @15DE: getfield boolean game.C_100294_ki.field_106976_Z
		// @15E1: ifne @18CB
		// @15E4: goto @15E8
		// @15E7: athrow
		// @15E8: iload_2
		// @15E9: ifne @18CB
		// @15EC: goto @15F0
		// @15EF: athrow
		// @15F0: aload_0
		// @15F1: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @15F4: sipush 26294 (0x66B6)
		// @15F7: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @15FA: iconst_m1
		// @15FB: ixor
		// @15FC: iconst_m1
		// @15FD: if_icmpne @18CB
		// @1600: goto @1604
		// @1603: athrow
		// @1604: iconst_m1
		// @1605: aload_0
		// @1606: getfield int game.C_100294_ki.field_106956_C
		// @1609: iconst_m1
		// @160A: ixor
		// @160B: if_icmple @18CB
		// @160E: goto @1612
		// @1611: athrow
		// @1612: iconst_m1
		// @1613: aload_0
		// @1614: getfield int game.C_100294_ki.field_106972_S
		// @1617: iconst_m1
		// @1618: ixor
		// @1619: if_icmpne @18CB
		// @161C: goto @1620
		// @161F: athrow
		// @1620: aload_0
		// @1621: getfield int game.C_100294_ki.field_106951_E
		// @1624: ifle @18CB
		// @1627: goto @162B
		// @162A: athrow
		// @162B: iconst_m1
		// @162C: aload_0
		// @162D: getfield int game.C_100294_ki.field_106951_E
		// @1630: sipush 3000 (0x0BB8)
		// @1633: irem
		// @1634: iconst_m1
		// @1635: ixor
		// @1636: if_icmpne @18CB
		// @1639: goto @163D
		// @163C: athrow
		// @163D: bipush -3 (0xFD)
		// @163F: aload_0
		// @1640: bipush -98 (0x9E)
		// @1642: invokespecial game.C_100294_ki.func_106901_c(byte)int
		// @1645: iconst_m1
		// @1646: ixor
		// @1647: if_icmpge @18CB
		// @164A: goto @164E
		// @164D: athrow
		// @164E: aconst_null
		// @164F: astore #8
		// @1651: iconst_m1
		// @1652: aload_0
		// @1653: getfield int game.C_100294_ki.field_106951_E
		// @1656: sipush 3000 (0x0BB8)
		// @1659: idiv
		// @165A: iadd
		// @165B: istore #9
		// @165D: iconst_1
		// @165E: aload_0
		// @165F: getfield int game.C_100294_ki.field_106956_C
		// @1662: if_icmplt @1686
		// @1665: iload #9
		// @1667: iconst_3
		// @1668: if_icmpgt @1673
		// @166B: goto @166F
		// @166E: athrow
		// @166F: goto @16A5
		// @1672: athrow
		// @1673: aload_0
		// @1674: getfield game.C_100038_wa game.C_100294_ki.field_106988_j
		// @1677: bipush -4 (0xFC)
		// @1679: iconst_2
		// @167A: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @167D: iconst_2
		// @167E: iadd
		// @167F: istore #9
		// @1681: iload #15
		// @1683: ifeq @16A5
		// @1686: iload #9
		// @1688: iconst_m1
		// @1689: ixor
		// @168A: bipush -6 (0xFA)
		// @168C: if_icmplt @1697
		// @168F: goto @1693
		// @1692: athrow
		// @1693: goto @16A5
		// @1696: athrow
		// @1697: aload_0
		// @1698: getfield game.C_100038_wa game.C_100294_ki.field_106988_j
		// @169B: bipush -4 (0xFC)
		// @169D: iconst_2
		// @169E: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @16A1: iconst_4
		// @16A2: iadd
		// @16A3: istore #9
		// @16A5: iload #9
		// @16A7: istore #10
		// @16A9: iconst_0
		// @16AA: iload #10
		// @16AC: if_icmpeq @1709
		// @16AF: iload #10
		// @16B1: iconst_1
		// @16B2: if_icmpne @16C2
		// @16B5: goto @16B9
		// @16B8: athrow
		// @16B9: iload #15
		// @16BB: ifeq @1711
		// @16BE: goto @16C2
		// @16C1: athrow
		// @16C2: bipush -3 (0xFD)
		// @16C4: iload #10
		// @16C6: iconst_m1
		// @16C7: ixor
		// @16C8: if_icmpne @16D8
		// @16CB: goto @16CF
		// @16CE: athrow
		// @16CF: iload #15
		// @16D1: ifeq @1719
		// @16D4: goto @16D8
		// @16D7: athrow
		// @16D8: iload #10
		// @16DA: iconst_m1
		// @16DB: ixor
		// @16DC: bipush -4 (0xFC)
		// @16DE: if_icmpeq @1721
		// @16E1: goto @16E5
		// @16E4: athrow
		// @16E5: iload #10
		// @16E7: iconst_4
		// @16E8: if_icmpne @16F8
		// @16EB: goto @16EF
		// @16EE: athrow
		// @16EF: iload #15
		// @16F1: ifeq @1729
		// @16F4: goto @16F8
		// @16F7: athrow
		// @16F8: iload #10
		// @16FA: iconst_m1
		// @16FB: ixor
		// @16FC: bipush -6 (0xFA)
		// @16FE: if_icmpeq @1731
		// @1701: goto @1705
		// @1704: athrow
		// @1705: goto @1736
		// @1708: athrow
		// @1709: getstatic int[] game.C_100104_v.field_104701_i
		// @170C: astore #8
		// @170E: goto @1736
		// @1711: getstatic int[] game.C_100066_dl.field_101635_C
		// @1714: astore #8
		// @1716: goto @1736
		// @1719: getstatic int[] game.C_100059_df.field_101600_M
		// @171C: astore #8
		// @171E: goto @1736
		// @1721: getstatic int[] game.C_100194_rd.field_103076_r
		// @1724: astore #8
		// @1726: goto @1736
		// @1729: getstatic int[] game.C_100228_nn.field_106191_l
		// @172C: astore #8
		// @172E: goto @1736
		// @1731: getstatic int[] game.C_100197_ra.field_100859_m
		// @1734: astore #8
		// @1736: iconst_0
		// @1737: istore #10
		// @1739: iload #10
		// @173B: iconst_m1
		// @173C: ixor
		// @173D: bipush -3 (0xFD)
		// @173F: if_icmple @17C1
		// @1742: new game.C_100314_lf
		// @1745: dup
		// @1746: iconst_0
		// @1747: iconst_0
		// @1748: aload_0
		// @1749: invokespecial game.C_100314_lf.<init>(int, int, game.C_100294_ki)void
		// @174C: astore #11
		// @174E: aload #11
		// @1750: aload #8
		// @1752: bipush 12 (0x0C)
		// @1754: bipush 61 (0x3D)
		// @1756: iconst_m1
		// @1757: iconst_0
		// @1758: invokevirtual game.C_100314_lf.func_101263_a(int[], int, byte, int, boolean)void
		// @175B: aload #11
		// @175D: aload_0
		// @175E: iload #9
		// @1760: bipush -120 (0x88)
		// @1762: invokespecial game.C_100294_ki.func_106926_b(int, byte)int
		// @1765: putfield int game.C_100314_lf.field_101409_qc
		// @1768: aload #11
		// @176A: bipush 8 (0x08)
		// @176C: putfield int game.C_100314_lf.field_101387_Xb
		// @176F: aload_0
		// @1770: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @1773: bipush 124 (0x7C)
		// @1775: aload #11
		// @1777: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @177A: aload #11
		// @177C: bipush -128 (0x80)
		// @177E: putfield int game.C_100314_lf.field_101377_tc
		// @1781: iconst_1
		// @1782: iload #10
		// @1784: iand
		// @1785: iload #15
		// @1787: ifne @18CF
		// @178A: ifeq @1794
		// @178D: goto @1791
		// @1790: athrow
		// @1791: goto @17AD
		// @1794: aload #11
		// @1796: aload_0
		// @1797: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @179A: sipush 23156 (0x5A74)
		// @179D: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @17A0: ldc_w -1799263420 (0x94c16b44)
		// @17A3: ishl
		// @17A4: aload #11
		// @17A6: getfield int game.C_100314_lf.field_101377_tc
		// @17A9: isub
		// @17AA: putfield int game.C_100314_lf.field_101377_tc
		// @17AD: aload #11
		// @17AF: iconst_1
		// @17B0: putfield int game.C_100314_lf.field_101395_rc
		// @17B3: aload #11
		// @17B5: iconst_0
		// @17B6: putfield boolean game.C_100314_lf.field_101403_Rb
		// @17B9: iinc #10 +1
		// @17BC: iload #15
		// @17BE: ifeq @1739
		// @17C1: iload #15
		// @17C3: ifeq @18CB
		// @17C6: aconst_null
		// @17C7: astore #8
		// @17C9: iconst_m1
		// @17CA: aload_0
		// @17CB: getfield int game.C_100294_ki.field_106951_E
		// @17CE: sipush 1200 (0x04B0)
		// @17D1: idiv
		// @17D2: iadd
		// @17D3: istore #9
		// @17D5: iload #9
		// @17D7: iconst_2
		// @17D8: if_icmpgt @17DF
		// @17DB: goto @17F0
		// @17DE: athrow
		// @17DF: aload_0
		// @17E0: getfield game.C_100038_wa game.C_100294_ki.field_106988_j
		// @17E3: bipush -4 (0xFC)
		// @17E5: aload_0
		// @17E6: getfield int game.C_100294_ki.field_106956_C
		// @17E9: iconst_1
		// @17EA: iadd
		// @17EB: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @17EE: istore #9
		// @17F0: iload #9
		// @17F2: istore #10
		// @17F4: iconst_m1
		// @17F5: iload #10
		// @17F7: iconst_m1
		// @17F8: ixor
		// @17F9: if_icmpne @1805
		// @17FC: iload #15
		// @17FE: ifeq @181D
		// @1801: goto @1805
		// @1804: athrow
		// @1805: iconst_1
		// @1806: iload #10
		// @1808: if_icmpeq @1825
		// @180B: goto @180F
		// @180E: athrow
		// @180F: iconst_2
		// @1810: iload #10
		// @1812: if_icmpeq @182D
		// @1815: goto @1819
		// @1818: athrow
		// @1819: goto @1832
		// @181C: athrow
		// @181D: getstatic int[] game.C_100059_df.field_101600_M
		// @1820: astore #8
		// @1822: goto @1832
		// @1825: getstatic int[] game.C_100194_rd.field_103076_r
		// @1828: astore #8
		// @182A: goto @1832
		// @182D: getstatic int[] game.C_100197_ra.field_100859_m
		// @1830: astore #8
		// @1832: iconst_0
		// @1833: istore #10
		// @1835: bipush -3 (0xFD)
		// @1837: iload #10
		// @1839: iconst_m1
		// @183A: ixor
		// @183B: if_icmpge @18CB
		// @183E: new game.C_100314_lf
		// @1841: dup
		// @1842: iconst_0
		// @1843: iconst_0
		// @1844: aload_0
		// @1845: invokespecial game.C_100314_lf.<init>(int, int, game.C_100294_ki)void
		// @1848: astore #11
		// @184A: aload #11
		// @184C: aload #8
		// @184E: bipush 12 (0x0C)
		// @1850: bipush 61 (0x3D)
		// @1852: iconst_m1
		// @1853: iconst_0
		// @1854: invokevirtual game.C_100314_lf.func_101263_a(int[], int, byte, int, boolean)void
		// @1857: aload #11
		// @1859: aload_0
		// @185A: iload #9
		// @185C: bipush -66 (0xBE)
		// @185E: invokespecial game.C_100294_ki.func_106926_b(int, byte)int
		// @1861: putfield int game.C_100314_lf.field_101409_qc
		// @1864: aload #11
		// @1866: bipush 8 (0x08)
		// @1868: putfield int game.C_100314_lf.field_101387_Xb
		// @186B: aload_0
		// @186C: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @186F: bipush 124 (0x7C)
		// @1871: aload #11
		// @1873: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1876: aload #11
		// @1878: aload_0
		// @1879: getfield game.C_100038_wa game.C_100294_ki.field_106988_j
		// @187C: bipush -4 (0xFC)
		// @187E: aload_0
		// @187F: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1882: sipush 23156 (0x5A74)
		// @1885: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @1888: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @188B: ldc_w -1969937084 (0x8a952544)
		// @188E: ishl
		// @188F: putfield int game.C_100314_lf.field_101377_tc
		// @1892: aload #11
		// @1894: iconst_0
		// @1895: putfield boolean game.C_100314_lf.field_101403_Rb
		// @1898: aload #11
		// @189A: sipush -16000 (0xC180)
		// @189D: aload_0
		// @189E: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @18A1: iload_1
		// @18A2: sipush -28357 (0x913B)
		// @18A5: iadd
		// @18A6: aload #11
		// @18A8: getfield int game.C_100314_lf.field_101377_tc
		// @18AB: ldc_w -2117665500 (0x81c6fd24)
		// @18AE: ishr
		// @18AF: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @18B2: iadd
		// @18B3: ldc_w -699129788 (0xd6542044)
		// @18B6: ishl
		// @18B7: putfield int game.C_100314_lf.field_101395_rc
		// @18BA: iinc #10 +1
		// @18BD: iload #15
		// @18BF: ifne @19AD
		// @18C2: iload #15
		// @18C4: ifeq @1835
		// @18C7: goto @18CB
		// @18CA: athrow
		// @18CB: aload_0
		// @18CC: getfield boolean game.C_100294_ki.field_106953_G
		// @18CF: ifne @19AD
		// @18D2: iload_2
		// @18D3: ifne @19AD
		// @18D6: goto @18DA
		// @18D9: athrow
		// @18DA: iconst_3
		// @18DB: aload_0
		// @18DC: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @18DF: sipush 26294 (0x66B6)
		// @18E2: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @18E5: if_icmpeq @1900
		// @18E8: goto @18EC
		// @18EB: athrow
		// @18EC: iconst_1
		// @18ED: aload_0
		// @18EE: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @18F1: iload_1
		// @18F2: sipush 27918 (0x6D0E)
		// @18F5: ixor
		// @18F6: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @18F9: if_icmpne @19AD
		// @18FC: goto @1900
		// @18FF: athrow
		// @1900: iconst_m1
		// @1901: aload_0
		// @1902: getfield int game.C_100294_ki.field_106972_S
		// @1905: iconst_m1
		// @1906: ixor
		// @1907: if_icmpne @19AD
		// @190A: goto @190E
		// @190D: athrow
		// @190E: aload_0
		// @190F: getfield int game.C_100294_ki.field_106951_E
		// @1912: sipush 1500 (0x05DC)
		// @1915: irem
		// @1916: iconst_m1
		// @1917: ixor
		// @1918: iconst_m1
		// @1919: if_icmpne @19AD
		// @191C: goto @1920
		// @191F: athrow
		// @1920: aload_0
		// @1921: getfield int game.C_100294_ki.field_106951_E
		// @1924: sipush 3000 (0x0BB8)
		// @1927: idiv
		// @1928: istore #8
		// @192A: iconst_0
		// @192B: aload_0
		// @192C: getfield int game.C_100294_ki.field_106956_C
		// @192F: if_icmplt @1951
		// @1932: iconst_4
		// @1933: iload #8
		// @1935: if_icmplt @1940
		// @1938: goto @193C
		// @193B: athrow
		// @193C: goto @196C
		// @193F: athrow
		// @1940: aload_0
		// @1941: getfield game.C_100038_wa game.C_100294_ki.field_106988_j
		// @1944: bipush -4 (0xFC)
		// @1946: iconst_5
		// @1947: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @194A: istore #8
		// @194C: iload #15
		// @194E: ifeq @196C
		// @1951: bipush -6 (0xFA)
		// @1953: iload #8
		// @1955: iconst_m1
		// @1956: ixor
		// @1957: if_icmple @196C
		// @195A: goto @195E
		// @195D: athrow
		// @195E: aload_0
		// @195F: getfield game.C_100038_wa game.C_100294_ki.field_106988_j
		// @1962: bipush -4 (0xFC)
		// @1964: iconst_2
		// @1965: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @1968: iconst_4
		// @1969: iadd
		// @196A: istore #8
		// @196C: new game.C_100239_oi
		// @196F: dup
		// @1970: aload_0
		// @1971: aload_0
		// @1972: iload #8
		// @1974: bipush -120 (0x88)
		// @1976: invokespecial game.C_100294_ki.func_106926_b(int, byte)int
		// @1979: invokespecial game.C_100239_oi.<init>(game.C_100294_ki, int)void
		// @197C: astore #9
		// @197E: aload #9
		// @1980: aload_0
		// @1981: getfield game.C_100038_wa game.C_100294_ki.field_106988_j
		// @1984: bipush -4 (0xFC)
		// @1986: aload_0
		// @1987: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @198A: sipush 23156 (0x5A74)
		// @198D: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @1990: ldc_w -1565796892 (0xa2abd5e4)
		// @1993: ishl
		// @1994: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @1997: putfield int game.C_100239_oi.field_102296_A
		// @199A: aload #9
		// @199C: ldc_w -180000 (0xfffd40e0)
		// @199F: putfield int game.C_100239_oi.field_102301_N
		// @19A2: aload_0
		// @19A3: getfield game.C_100202_qi game.C_100294_ki.field_106997_s
		// @19A6: bipush 123 (0x7B)
		// @19A8: aload #9
		// @19AA: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @19AD: aload_0
		// @19AE: getfield game.C_100202_qi game.C_100294_ki.field_106997_s
		// @19B1: iload_1
		// @19B2: sipush -2894 (0xF4B2)
		// @19B5: iadd
		// @19B6: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @19B9: checkcast game.C_100239_oi
		// @19BC: astore #8
		// @19BE: aconst_null
		// @19BF: aload #8
		// @19C1: if_acmpeq @1A1E
		// @19C4: aload #8
		// @19C6: bipush -13 (0xF3)
		// @19C8: invokevirtual game.C_100239_oi.func_102289_e(byte)void
		// @19CB: iload #15
		// @19CD: ifne @1BE4
		// @19D0: aconst_null
		// @19D1: aload #8
		// @19D3: getfield game.C_100314_lf game.C_100239_oi.field_102294_F
		// @19D6: if_acmpne @19F0
		// @19D9: goto @19DD
		// @19DC: athrow
		// @19DD: iconst_m1
		// @19DE: aload #8
		// @19E0: getfield int game.C_100239_oi.field_102300_M
		// @19E3: iconst_m1
		// @19E4: ixor
		// @19E5: if_icmple @19F0
		// @19E8: goto @19EC
		// @19EB: athrow
		// @19EC: goto @1A0B
		// @19EF: athrow
		// @19F0: aload #8
		// @19F2: iload_1
		// @19F3: sipush -2955 (0xF475)
		// @19F6: iadd
		// @19F7: invokevirtual game.C_100239_oi.func_100583_c(int)void
		// @19FA: aload_0
		// @19FB: dup
		// @19FC: getfield int game.C_100294_ki.field_106982_c
		// @19FF: aload #8
		// @1A01: getfield int game.C_100239_oi.field_102302_O
		// @1A04: bipush 50 (0x32)
		// @1A06: imul
		// @1A07: isub
		// @1A08: putfield int game.C_100294_ki.field_106982_c
		// @1A0B: aload_0
		// @1A0C: getfield game.C_100202_qi game.C_100294_ki.field_106997_s
		// @1A0F: bipush 31 (0x1F)
		// @1A11: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @1A14: checkcast game.C_100239_oi
		// @1A17: astore #8
		// @1A19: iload #15
		// @1A1B: ifeq @19BE
		// @1A1E: aload_0
		// @1A1F: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @1A22: iload_1
		// @1A23: sipush -2925 (0xF493)
		// @1A26: iadd
		// @1A27: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @1A2A: checkcast game.C_100314_lf
		// @1A2D: astore #8
		// @1A2F: aconst_null
		// @1A30: aload #8
		// @1A32: if_acmpeq @1A64
		// @1A35: aload #8
		// @1A37: getfield boolean game.C_100314_lf.field_101298_ob
		// @1A3A: iload #15
		// @1A3C: ifne @1A65
		// @1A3F: ifeq @1A51
		// @1A42: goto @1A46
		// @1A45: athrow
		// @1A46: aload #8
		// @1A48: bipush 45 (0x2D)
		// @1A4A: invokevirtual game.C_100314_lf.func_100583_c(int)void
		// @1A4D: goto @1A51
		// @1A50: athrow
		// @1A51: aload_0
		// @1A52: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @1A55: bipush 63 (0x3F)
		// @1A57: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @1A5A: checkcast game.C_100314_lf
		// @1A5D: astore #8
		// @1A5F: iload #15
		// @1A61: ifeq @1A2F
		// @1A64: iload_2
		// @1A65: ifeq @1AA4
		// @1A68: aload_0
		// @1A69: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1A6C: sipush 26294 (0x66B6)
		// @1A6F: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @1A72: iconst_m1
		// @1A73: ixor
		// @1A74: bipush -5 (0xFB)
		// @1A76: if_icmpeq @1A81
		// @1A79: goto @1A7D
		// @1A7C: athrow
		// @1A7D: goto @1AA4
		// @1A80: athrow
		// @1A81: aload_0
		// @1A82: getfield int game.C_100294_ki.field_106972_S
		// @1A85: ifgt @1A8C
		// @1A88: goto @1AA4
		// @1A8B: athrow
		// @1A8C: aload_0
		// @1A8D: dup
		// @1A8E: getfield int game.C_100294_ki.field_106972_S
		// @1A91: iconst_1
		// @1A92: iadd
		// @1A93: putfield int game.C_100294_ki.field_106972_S
		// @1A96: aload_0
		// @1A97: aload_0
		// @1A98: getfield int game.C_100294_ki.field_106956_C
		// @1A9B: iconst_1
		// @1A9C: iadd
		// @1A9D: iconst_2
		// @1A9E: invokestatic java.lang.Math.max(int, int)int
		// @1AA1: putfield int game.C_100294_ki.field_106994_v
		// @1AA4: aload_0
		// @1AA5: getfield boolean game.C_100294_ki.field_106953_G
		// @1AA8: ifne @1BE4
		// @1AAB: iload_2
		// @1AAC: ifeq @1AB7
		// @1AAF: goto @1AB3
		// @1AB2: athrow
		// @1AB3: goto @1BE4
		// @1AB6: athrow
		// @1AB7: iload_3
		// @1AB8: iconst_m1
		// @1AB9: if_icmpeq @1AD1
		// @1ABC: aload_0
		// @1ABD: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1AC0: sipush 26294 (0x66B6)
		// @1AC3: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @1AC6: iconst_m1
		// @1AC7: ixor
		// @1AC8: bipush -5 (0xFB)
		// @1ACA: if_icmpne @1ADF
		// @1ACD: goto @1AD1
		// @1AD0: athrow
		// @1AD1: iconst_m1
		// @1AD2: aload_0
		// @1AD3: getfield int game.C_100294_ki.field_106972_S
		// @1AD6: iconst_m1
		// @1AD7: ixor
		// @1AD8: if_icmple @1AFB
		// @1ADB: goto @1ADF
		// @1ADE: athrow
		// @1ADF: aload_0
		// @1AE0: dup
		// @1AE1: getfield int game.C_100294_ki.field_106972_S
		// @1AE4: iconst_1
		// @1AE5: iadd
		// @1AE6: putfield int game.C_100294_ki.field_106972_S
		// @1AE9: aload_0
		// @1AEA: aload_0
		// @1AEB: getfield int game.C_100294_ki.field_106956_C
		// @1AEE: iconst_m1
		// @1AEF: isub
		// @1AF0: iconst_2
		// @1AF1: invokestatic java.lang.Math.max(int, int)int
		// @1AF4: putfield int game.C_100294_ki.field_106994_v
		// @1AF7: goto @1AFB
		// @1AFA: athrow
		// @1AFB: iload #5
		// @1AFD: ifeq @1B27
		// @1B00: iconst_m1
		// @1B01: aload_0
		// @1B02: getfield int game.C_100294_ki.field_106972_S
		// @1B05: iconst_m1
		// @1B06: ixor
		// @1B07: if_icmpne @1B27
		// @1B0A: goto @1B0E
		// @1B0D: athrow
		// @1B0E: sipush -29851 (0x8B65)
		// @1B11: aload_0
		// @1B12: getfield int game.C_100294_ki.field_106951_E
		// @1B15: iconst_m1
		// @1B16: ixor
		// @1B17: if_icmple @1B27
		// @1B1A: goto @1B1E
		// @1B1D: athrow
		// @1B1E: aload_0
		// @1B1F: iconst_1
		// @1B20: putfield int game.C_100294_ki.field_106972_S
		// @1B23: goto @1B27
		// @1B26: athrow
		// @1B27: aload_0
		// @1B28: getfield int game.C_100294_ki.field_106972_S
		// @1B2B: iconst_1
		// @1B2C: if_icmpne @1B97
		// @1B2F: aload_0
		// @1B30: getfield java.lang.String[] game.C_100294_ki.field_106974_Y
		// @1B33: arraylength
		// @1B34: iconst_2
		// @1B35: if_icmpne @1B97
		// @1B38: goto @1B3C
		// @1B3B: athrow
		// @1B3C: iconst_0
		// @1B3D: istore #8
		// @1B3F: aload_0
		// @1B40: iconst_0
		// @1B41: bipush -127 (0x81)
		// @1B43: invokevirtual game.C_100294_ki.func_106913_c(int, int)game.C_100314_lf
		// @1B46: astore #9
		// @1B48: aconst_null
		// @1B49: aload #9
		// @1B4B: if_acmpeq @1B61
		// @1B4E: aload #9
		// @1B50: getfield int game.C_100314_lf.field_101316_G
		// @1B53: ifle @1B61
		// @1B56: goto @1B5A
		// @1B59: athrow
		// @1B5A: aload #9
		// @1B5C: getfield int game.C_100314_lf.field_101316_G
		// @1B5F: istore #8
		// @1B61: aload_0
		// @1B62: iconst_1
		// @1B63: bipush -126 (0x82)
		// @1B65: invokevirtual game.C_100294_ki.func_106913_c(int, int)game.C_100314_lf
		// @1B68: astore #9
		// @1B6A: aconst_null
		// @1B6B: aload #9
		// @1B6D: if_acmpeq @1B97
		// @1B70: aload #9
		// @1B72: getfield int game.C_100314_lf.field_101316_G
		// @1B75: iconst_m1
		// @1B76: ixor
		// @1B77: iload #8
		// @1B79: iconst_m1
		// @1B7A: ixor
		// @1B7B: if_icmpgt @1B86
		// @1B7E: goto @1B82
		// @1B81: athrow
		// @1B82: goto @1B97
		// @1B85: athrow
		// @1B86: aload #9
		// @1B88: getfield int game.C_100314_lf.field_101316_G
		// @1B8B: iload #8
		// @1B8D: if_icmpeq @1B90
		// @1B90: aload #9
		// @1B92: getfield int game.C_100314_lf.field_101316_G
		// @1B95: istore #8
		// @1B97: sipush -1651 (0xF98D)
		// @1B9A: aload_0
		// @1B9B: getfield int game.C_100294_ki.field_106972_S
		// @1B9E: iconst_m1
		// @1B9F: ixor
		// @1BA0: if_icmpne @1BC6
		// @1BA3: aload_0
		// @1BA4: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1BA7: sipush 26294 (0x66B6)
		// @1BAA: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @1BAD: iconst_4
		// @1BAE: if_icmpeq @1BC6
		// @1BB1: goto @1BB5
		// @1BB4: athrow
		// @1BB5: aload_0
		// @1BB6: aload #6
		// @1BB8: bipush -101 (0x9B)
		// @1BBA: invokespecial game.C_100294_ki.func_106934_a(int[], byte)void
		// @1BBD: iload #15
		// @1BBF: ifeq @1BE4
		// @1BC2: goto @1BC6
		// @1BC5: athrow
		// @1BC6: bipush -2 (0xFE)
		// @1BC8: iload #7
		// @1BCA: bipush 57 (0x39)
		// @1BCC: invokestatic game.C_100303_kk.func_104778_a(int, byte)int
		// @1BCF: iconst_m1
		// @1BD0: ixor
		// @1BD1: if_icmpgt @1BE4
		// @1BD4: goto @1BD8
		// @1BD7: athrow
		// @1BD8: aload_0
		// @1BD9: aload #6
		// @1BDB: bipush -36 (0xDC)
		// @1BDD: invokespecial game.C_100294_ki.func_106934_a(int[], byte)void
		// @1BE0: goto @1BE4
		// @1BE3: athrow
		// @1BE4: aload_0
		// @1BE5: getfield game.C_100202_qi game.C_100294_ki.field_106981_b
		// @1BE8: bipush 16 (0x10)
		// @1BEA: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @1BED: checkcast game.C_100018_wk
		// @1BF0: astore #8
		// @1BF2: aconst_null
		// @1BF3: aload #8
		// @1BF5: if_acmpeq @1C1B
		// @1BF8: aload #8
		// @1BFA: bipush 126 (0x7E)
		// @1BFC: invokevirtual game.C_100018_wk.func_101507_i(int)void
		// @1BFF: aload_0
		// @1C00: getfield game.C_100202_qi game.C_100294_ki.field_106981_b
		// @1C03: bipush 51 (0x33)
		// @1C05: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @1C08: checkcast game.C_100018_wk
		// @1C0B: astore #8
		// @1C0D: iload #15
		// @1C0F: ifne @1C27
		// @1C12: iload #15
		// @1C14: ifeq @1BF2
		// @1C17: goto @1C1B
		// @1C1A: athrow
		// @1C1B: aload_0
		// @1C1C: getfield game.C_100202_qi game.C_100294_ki.field_106991_fb
		// @1C1F: iconst_0
		// @1C20: aload_0
		// @1C21: getfield game.C_100202_qi game.C_100294_ki.field_106986_l
		// @1C24: invokevirtual game.C_100202_qi.func_105902_a(boolean, game.C_100202_qi)void
		// @1C27: iload_1
		// @1C28: sipush 3000 (0x0BB8)
		// @1C2B: if_icmpeq @1C38
		// @1C2E: aload_0
		// @1C2F: bipush -88 (0xA8)
		// @1C31: putfield int game.C_100294_ki.field_106989_k
		// @1C34: goto @1C38
		// @1C37: athrow
		// @1C38: aload_0
		// @1C39: getfield game.C_100202_qi game.C_100294_ki.field_106986_l
		// @1C3C: bipush 74 (0x4A)
		// @1C3E: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @1C41: checkcast game.C_100058_dg
		// @1C44: astore #8
		// @1C46: aconst_null
		// @1C47: aload #8
		// @1C49: if_acmpeq @1C6F
		// @1C4C: aload #8
		// @1C4E: bipush 110 (0x6E)
		// @1C50: invokevirtual game.C_100058_dg.func_101555_d(byte)void
		// @1C53: aload_0
		// @1C54: getfield game.C_100202_qi game.C_100294_ki.field_106986_l
		// @1C57: bipush 80 (0x50)
		// @1C59: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @1C5C: checkcast game.C_100058_dg
		// @1C5F: astore #8
		// @1C61: iload #15
		// @1C63: ifne @1CB8
		// @1C66: iload #15
		// @1C68: ifeq @1C46
		// @1C6B: goto @1C6F
		// @1C6E: athrow
		// @1C6F: aconst_null
		// @1C70: aload_0
		// @1C71: getfield game.C_100202_qi game.C_100294_ki.field_106978_g
		// @1C74: if_acmpeq @1CB8
		// @1C77: aload_0
		// @1C78: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @1C7B: iconst_0
		// @1C7C: aload_0
		// @1C7D: getfield game.C_100202_qi game.C_100294_ki.field_106978_g
		// @1C80: invokevirtual game.C_100202_qi.func_105902_a(boolean, game.C_100202_qi)void
		// @1C83: aload_0
		// @1C84: getfield game.C_100202_qi game.C_100294_ki.field_106978_g
		// @1C87: bipush 99 (0x63)
		// @1C89: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @1C8C: checkcast game.C_100059_df
		// @1C8F: astore #8
		// @1C91: aload #8
		// @1C93: ifnull @1CB8
		// @1C96: aload #8
		// @1C98: iconst_0
		// @1C99: invokevirtual game.C_100059_df.func_101585_b(boolean)void
		// @1C9C: aload_0
		// @1C9D: getfield game.C_100202_qi game.C_100294_ki.field_106978_g
		// @1CA0: bipush 62 (0x3E)
		// @1CA2: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @1CA5: checkcast game.C_100059_df
		// @1CA8: astore #8
		// @1CAA: iload #15
		// @1CAC: ifne @1CC4
		// @1CAF: iload #15
		// @1CB1: ifeq @1C91
		// @1CB4: goto @1CB8
		// @1CB7: athrow
		// @1CB8: aload_0
		// @1CB9: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @1CBC: sipush -9190 (0xDC1A)
		// @1CBF: invokevirtual game.C_100300_kc.func_107065_a(int)game.C_100325_id
		// @1CC2: astore #8
		// @1CC4: aload #8
		// @1CC6: ifnull @1CEB
		// @1CC9: aload #8
		// @1CCB: iload_1
		// @1CCC: sipush 2965 (0x0B95)
		// @1CCF: ixor
		// @1CD0: invokevirtual game.C_100325_id.func_100583_c(int)void
		// @1CD3: aload_0
		// @1CD4: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @1CD7: iconst_0
		// @1CD8: invokevirtual game.C_100300_kc.func_107063_c(int)game.C_100325_id
		// @1CDB: astore #8
		// @1CDD: iload #15
		// @1CDF: ifne @1D00
		// @1CE2: iload #15
		// @1CE4: ifeq @1CC4
		// @1CE7: goto @1CEB
		// @1CEA: athrow
		// @1CEB: aload_0
		// @1CEC: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @1CEF: bipush -126 (0x82)
		// @1CF1: invokevirtual game.C_100300_kc.func_107054_b(int)void
		// @1CF4: aload_0
		// @1CF5: getfield game.C_100202_qi game.C_100294_ki.field_106977_f
		// @1CF8: iconst_0
		// @1CF9: aload_0
		// @1CFA: getfield game.C_100202_qi game.C_100294_ki.field_106981_b
		// @1CFD: invokevirtual game.C_100202_qi.func_105902_a(boolean, game.C_100202_qi)void
		// @1D00: goto @1D25
		// @1D03: astore_2
		// @1D04: aload_2
		// @1D05: new java.lang.StringBuilder
		// @1D08: dup
		// @1D09: invokespecial java.lang.StringBuilder.<init>()void
		// @1D0C: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @1D0F: bipush 19 (0x13)
		// @1D11: aaload
		// @1D12: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D15: iload_1
		// @1D16: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1D19: bipush 41 (0x29)
		// @1D1B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D1E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1D21: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1D24: athrow
		// @1D25: return
	}
	
	private final int func_106901_c(byte arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iconst_0
		// @06: istore_2
		// @07: iload_1
		// @08: bipush -98 (0x9E)
		// @0A: if_icmpeq @10
		// @0D: bipush 81 (0x51)
		// @0F: ireturn
		// @10: aload_0
		// @11: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @14: bipush 104 (0x68)
		// @16: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @19: checkcast game.C_100314_lf
		// @1C: astore_3
		// @1D: aconst_null
		// @1E: aload_3
		// @1F: if_acmpeq @4D
		// @22: bipush 8 (0x08)
		// @24: iload #4
		// @26: ifne @4E
		// @29: aload_3
		// @2A: getfield int game.C_100314_lf.field_101387_Xb
		// @2D: if_icmpne @3B
		// @30: goto @34
		// @33: athrow
		// @34: iinc #2 +1
		// @37: goto @3B
		// @3A: athrow
		// @3B: aload_0
		// @3C: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @3F: bipush 124 (0x7C)
		// @41: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @44: checkcast game.C_100314_lf
		// @47: astore_3
		// @48: iload #4
		// @4A: ifeq @1D
		// @4D: iload_2
		// @4E: ireturn
		// @4F: astore_2
		// @50: aload_2
		// @51: new java.lang.StringBuilder
		// @54: dup
		// @55: invokespecial java.lang.StringBuilder.<init>()void
		// @58: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @5B: bipush 15 (0x0F)
		// @5D: aaload
		// @5E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @61: iload_1
		// @62: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @65: bipush 41 (0x29)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @70: athrow
	}
	
	private final void func_106943_a(C_100314_lf arg0, C_100314_lf arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #12
		// @005: iconst_0
		// @006: aload_2
		// @007: getfield int game.C_100314_lf.field_101369_z
		// @00A: if_icmplt @084
		// @00D: ldc_w -80001 (0xfffec77f)
		// @010: iload #5
		// @012: invokestatic java.lang.Math.abs(int)int
		// @015: iconst_m1
		// @016: ixor
		// @017: if_icmpgt @05C
		// @01A: goto @01E
		// @01D: athrow
		// @01E: sipush -30001 (0x8ACF)
		// @021: iload #5
		// @023: invokestatic java.lang.Math.abs(int)int
		// @026: iconst_m1
		// @027: ixor
		// @028: if_icmplt @033
		// @02B: goto @02F
		// @02E: athrow
		// @02F: goto @0BF
		// @032: athrow
		// @033: new game.C_100087_n
		// @036: dup
		// @037: bipush 6 (0x06)
		// @039: iload_3
		// @03A: ineg
		// @03B: iconst_2
		// @03C: aload_0
		// @03D: getfield int game.C_100294_ki.field_106951_E
		// @040: iadd
		// @041: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @044: astore #7
		// @046: aload #7
		// @048: iconst_1
		// @049: putfield boolean game.C_100087_n.field_100703_p
		// @04C: aload_2
		// @04D: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @050: bipush 126 (0x7E)
		// @052: aload #7
		// @054: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @057: iload #12
		// @059: ifeq @0BF
		// @05C: new game.C_100087_n
		// @05F: dup
		// @060: bipush 6 (0x06)
		// @062: iload_3
		// @063: iconst_2
		// @064: aload_0
		// @065: getfield int game.C_100294_ki.field_106951_E
		// @068: iadd
		// @069: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @06C: astore #7
		// @06E: aload #7
		// @070: iconst_1
		// @071: putfield boolean game.C_100087_n.field_100703_p
		// @074: aload_2
		// @075: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @078: bipush 125 (0x7D)
		// @07A: aload #7
		// @07C: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @07F: iload #12
		// @081: ifeq @0BF
		// @084: new game.C_100087_n
		// @087: dup
		// @088: bipush 6 (0x06)
		// @08A: aload_2
		// @08B: getfield int game.C_100314_lf.field_101377_tc
		// @08E: ldc_w -825691772 (0xcec8f184)
		// @091: ishr
		// @092: aload_2
		// @093: getfield int game.C_100314_lf.field_101369_z
		// @096: if_icmpge @0A2
		// @099: goto @09D
		// @09C: athrow
		// @09D: iconst_1
		// @09E: goto @0A3
		// @0A1: athrow
		// @0A2: iconst_m1
		// @0A3: iconst_2
		// @0A4: aload_0
		// @0A5: getfield int game.C_100294_ki.field_106951_E
		// @0A8: iadd
		// @0A9: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @0AC: astore #7
		// @0AE: aload #7
		// @0B0: iconst_1
		// @0B1: putfield boolean game.C_100087_n.field_100703_p
		// @0B4: aload_2
		// @0B5: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @0B8: bipush 124 (0x7C)
		// @0BA: aload #7
		// @0BC: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0BF: iload #4
		// @0C1: sipush -27916 (0x92F4)
		// @0C4: if_icmpeq @0D2
		// @0C7: aload_0
		// @0C8: bipush -52 (0xCC)
		// @0CA: invokevirtual game.C_100294_ki.func_106920_e(int)int
		// @0CD: pop
		// @0CE: goto @0D2
		// @0D1: athrow
		// @0D2: ldc_w 60000 (0xea60)
		// @0D5: iload #5
		// @0D7: invokestatic java.lang.Math.abs(int)int
		// @0DA: if_icmple @217
		// @0DD: bipush 9 (0x09)
		// @0DF: aload_2
		// @0E0: getfield int[] game.C_100314_lf.field_101416_ab
		// @0E3: iconst_0
		// @0E4: iaload
		// @0E5: if_icmpne @163
		// @0E8: goto @0EC
		// @0EB: athrow
		// @0EC: new game.C_100087_n
		// @0EF: dup
		// @0F0: iconst_0
		// @0F1: aload_2
		// @0F2: getfield int[] game.C_100314_lf.field_101416_ab
		// @0F5: iconst_0
		// @0F6: iaload
		// @0F7: aload_2
		// @0F8: getfield int game.C_100314_lf.field_101377_tc
		// @0FB: aload_1
		// @0FC: getfield int game.C_100314_lf.field_101377_tc
		// @0FF: aload_0
		// @100: getfield int game.C_100294_ki.field_106951_E
		// @103: iadd
		// @104: iadd
		// @105: bipush 100 (0x64)
		// @107: irem
		// @108: iconst_4
		// @109: iadd
		// @10A: aload_0
		// @10B: getfield int game.C_100294_ki.field_106951_E
		// @10E: iadd
		// @10F: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @112: astore #7
		// @114: aload #7
		// @116: aload_1
		// @117: getfield int game.C_100314_lf.field_101395_rc
		// @11A: putfield int game.C_100087_n.field_100698_u
		// @11D: aload #7
		// @11F: aload_1
		// @120: getfield int game.C_100314_lf.field_101377_tc
		// @123: putfield int game.C_100087_n.field_100699_t
		// @126: sipush 900 (0x0384)
		// @129: istore #8
		// @12B: aload_0
		// @12C: getfield int game.C_100294_ki.field_106964_J
		// @12F: istore #9
		// @131: iconst_0
		// @132: istore #10
		// @134: sipush 10922 (0x2AAA)
		// @137: istore #11
		// @139: aload_0
		// @13A: iload_3
		// @13B: iconst_1
		// @13C: iload #11
		// @13E: iload #5
		// @140: iload #6
		// @142: iload #8
		// @144: iload #9
		// @146: aload #7
		// @148: iload #10
		// @14A: invokespecial game.C_100294_ki.func_106925_a(int, boolean, int, int, int, int, int, game.C_100087_n, int)void
		// @14D: aload #7
		// @14F: iconst_1
		// @150: putfield boolean game.C_100087_n.field_100703_p
		// @153: aload_2
		// @154: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @157: bipush 126 (0x7E)
		// @159: aload #7
		// @15B: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @15E: iload #12
		// @160: ifeq @217
		// @163: new game.C_100087_n
		// @166: dup
		// @167: iconst_0
		// @168: aload_2
		// @169: getfield int[] game.C_100314_lf.field_101416_ab
		// @16C: iconst_0
		// @16D: iaload
		// @16E: aload_2
		// @16F: getfield int game.C_100314_lf.field_101377_tc
		// @172: aload_0
		// @173: getfield int game.C_100294_ki.field_106951_E
		// @176: iadd
		// @177: aload_1
		// @178: getfield int game.C_100314_lf.field_101377_tc
		// @17B: ineg
		// @17C: isub
		// @17D: bipush 100 (0x64)
		// @17F: irem
		// @180: aload_0
		// @181: getfield int game.C_100294_ki.field_106951_E
		// @184: iadd
		// @185: iconst_4
		// @186: iadd
		// @187: invokespecial game.C_100087_n.<init>(int, int, int)void
		// @18A: astore #7
		// @18C: aload #7
		// @18E: aload_1
		// @18F: getfield int game.C_100314_lf.field_101377_tc
		// @192: putfield int game.C_100087_n.field_100699_t
		// @195: aload #7
		// @197: aload_1
		// @198: getfield int game.C_100314_lf.field_101395_rc
		// @19B: putfield int game.C_100087_n.field_100698_u
		// @19E: iload #5
		// @1A0: i2d
		// @1A1: iload #6
		// @1A3: ineg
		// @1A4: i2d
		// @1A5: invokestatic java.lang.Math.atan2(double, double)double
		// @1A8: dstore #8
		// @1AA: aload #7
		// @1AC: dload #8
		// @1AE: ldc2_w 65536.0
		// @1B1: dmul
		// @1B2: ldc2_w 6.283185307179586
		// @1B5: ddiv
		// @1B6: d2i
		// @1B7: putfield int game.C_100087_n.field_100693_m
		// @1BA: iconst_0
		// @1BB: iload_3
		// @1BC: if_icmple @1E5
		// @1BF: sipush -16385 (0xBFFF)
		// @1C2: aload #7
		// @1C4: getfield int game.C_100087_n.field_100693_m
		// @1C7: iconst_m1
		// @1C8: ixor
		// @1C9: if_icmpgt @1D4
		// @1CC: goto @1D0
		// @1CF: athrow
		// @1D0: goto @206
		// @1D3: athrow
		// @1D4: aload #7
		// @1D6: dup
		// @1D7: getfield int game.C_100087_n.field_100693_m
		// @1DA: ldc 65536 (0x10000)
		// @1DC: isub
		// @1DD: putfield int game.C_100087_n.field_100693_m
		// @1E0: iload #12
		// @1E2: ifeq @206
		// @1E5: aload #7
		// @1E7: getfield int game.C_100087_n.field_100693_m
		// @1EA: iconst_m1
		// @1EB: ixor
		// @1EC: sipush 16383 (0x3FFF)
		// @1EF: if_icmple @206
		// @1F2: goto @1F6
		// @1F5: athrow
		// @1F6: aload #7
		// @1F8: dup
		// @1F9: getfield int game.C_100087_n.field_100693_m
		// @1FC: ldc 65536 (0x10000)
		// @1FE: iadd
		// @1FF: putfield int game.C_100087_n.field_100693_m
		// @202: goto @206
		// @205: athrow
		// @206: aload #7
		// @208: iconst_1
		// @209: putfield boolean game.C_100087_n.field_100703_p
		// @20C: aload_2
		// @20D: getfield game.C_100202_qi game.C_100314_lf.field_101339_R
		// @210: bipush 126 (0x7E)
		// @212: aload #7
		// @214: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @217: goto @290
		// @21A: astore #7
		// @21C: aload #7
		// @21E: new java.lang.StringBuilder
		// @221: dup
		// @222: invokespecial java.lang.StringBuilder.<init>()void
		// @225: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @228: bipush 18 (0x12)
		// @22A: aaload
		// @22B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @22E: aload_1
		// @22F: ifnull @23B
		// @232: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @235: iconst_1
		// @236: aaload
		// @237: goto @240
		// @23A: athrow
		// @23B: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @23E: iconst_4
		// @23F: aaload
		// @240: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @243: bipush 44 (0x2C)
		// @245: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @248: aload_2
		// @249: ifnull @255
		// @24C: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @24F: iconst_1
		// @250: aaload
		// @251: goto @25A
		// @254: athrow
		// @255: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @258: iconst_4
		// @259: aaload
		// @25A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25D: bipush 44 (0x2C)
		// @25F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @262: iload_3
		// @263: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @266: bipush 44 (0x2C)
		// @268: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @26B: iload #4
		// @26D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @270: bipush 44 (0x2C)
		// @272: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @275: iload #5
		// @277: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @27A: bipush 44 (0x2C)
		// @27C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @27F: iload #6
		// @281: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @284: bipush 41 (0x29)
		// @286: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @289: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @28C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @28F: athrow
		// @290: return
	}
	
	final boolean func_106942_h(int arg0)
	{
		// @00: iload_1
		// @01: iconst_3
		// @02: if_icmpeq @0E
		// @05: aload_0
		// @06: iconst_1
		// @07: putfield boolean game.C_100294_ki.field_106969_V
		// @0A: goto @0E
		// @0D: athrow
		// @0E: aload_0
		// @0F: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @12: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @15: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @18: aload_0
		// @19: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @1C: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @1F: getfield game.C_100158_da game.C_100158_da.field_100599_i
		// @22: if_acmpne @2A
		// @25: iconst_1
		// @26: goto @2B
		// @29: athrow
		// @2A: iconst_0
		// @2B: ireturn
		// @2C: astore_2
		// @2D: aload_2
		// @2E: new java.lang.StringBuilder
		// @31: dup
		// @32: invokespecial java.lang.StringBuilder.<init>()void
		// @35: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @38: bipush 14 (0x0E)
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: iload_1
		// @3F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @42: bipush 41 (0x29)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4D: athrow
	}
	
	C_100294_ki(int arg0, int arg1, String[] arg2, int[][] arg3, boolean arg4, int arg5, int arg6, int arg7, boolean arg8, boolean arg9)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #19
		// @005: aload_0
		// @006: invokespecial java.lang.Object.<init>()void
		// @009: aload_0
		// @00A: iconst_m1
		// @00B: putfield int game.C_100294_ki.field_106975_X
		// @00E: aload_0
		// @00F: iconst_0
		// @010: putfield int game.C_100294_ki.field_106998_r
		// @013: aload_0
		// @014: iconst_0
		// @015: putfield int game.C_100294_ki.field_106948_db
		// @018: aload_0
		// @019: aconst_null
		// @01A: putfield game.C_100038_wa game.C_100294_ki.field_106988_j
		// @01D: aload_0
		// @01E: iconst_0
		// @01F: putfield int game.C_100294_ki.field_107003_y
		// @022: aload_0
		// @023: iconst_m1
		// @024: putfield int game.C_100294_ki.field_106993_w
		// @027: aload_0
		// @028: iconst_0
		// @029: putfield boolean game.C_100294_ki.field_107001_ab
		// @02C: aload_0
		// @02D: iconst_m1
		// @02E: putfield int game.C_100294_ki.field_106965_K
		// @031: aload_0
		// @032: iconst_0
		// @033: putfield int game.C_100294_ki.field_106952_F
		// @036: aload_0
		// @037: iconst_m1
		// @038: putfield int game.C_100294_ki.field_106992_i
		// @03B: aload_0
		// @03C: iload #5
		// @03E: putfield boolean game.C_100294_ki.field_106969_V
		// @041: aload_0
		// @042: iload #8
		// @044: putfield int game.C_100294_ki.field_106956_C
		// @047: aload_0
		// @048: iload_2
		// @049: putfield int game.C_100294_ki.field_106960_O
		// @04C: aload_0
		// @04D: iload_1
		// @04E: putfield int game.C_100294_ki.field_107000_p
		// @051: aload_0
		// @052: iload #6
		// @054: putfield int game.C_100294_ki.field_106968_ib
		// @057: aload_0
		// @058: new game.C_100038_wa
		// @05B: dup
		// @05C: iconst_1
		// @05D: newarray int[]
		// @05F: dup
		// @060: iconst_0
		// @061: aload_0
		// @062: getfield int game.C_100294_ki.field_107000_p
		// @065: iastore
		// @066: invokespecial game.C_100038_wa.<init>(int[])void
		// @069: putfield game.C_100038_wa game.C_100294_ki.field_106988_j
		// @06C: aload_0
		// @06D: aload_3
		// @06E: arraylength
		// @06F: putfield int game.C_100294_ki.field_106999_q
		// @072: aload_0
		// @073: ldc_w 269488144 (0x10101010)
		// @076: putfield int game.C_100294_ki.field_106982_c
		// @079: aload_0
		// @07A: ldc_w 621164641 (0x25063861)
		// @07D: putfield int game.C_100294_ki.field_106966_U
		// @080: aload_0
		// @081: iconst_0
		// @082: putfield int game.C_100294_ki.field_106954_A
		// @085: aload_0
		// @086: aload_3
		// @087: putfield java.lang.String[] game.C_100294_ki.field_106974_Y
		// @08A: aload_0
		// @08B: getfield int game.C_100294_ki.field_107000_p
		// @08E: bipush 8 (0x08)
		// @090: irem
		// @091: iconst_m1
		// @092: ixor
		// @093: iconst_m1
		// @094: if_icmpeq @0A6
		// @097: iconst_m1
		// @098: aload_0
		// @099: getfield int game.C_100294_ki.field_107000_p
		// @09C: if_icmpne @0A3
		// @09F: goto @0A6
		// @0A2: athrow
		// @0A3: iconst_0
		// @0A4: istore #7
		// @0A6: aload_0
		// @0A7: iconst_0
		// @0A8: putfield int game.C_100294_ki.field_107002_z
		// @0AB: aload_0
		// @0AC: iload #7
		// @0AE: putfield int game.C_100294_ki.field_106990_h
		// @0B1: aload_0
		// @0B2: new game.C_100171_cn
		// @0B5: dup
		// @0B6: aload_0
		// @0B7: getfield int game.C_100294_ki.field_107000_p
		// @0BA: iload #7
		// @0BC: aload_0
		// @0BD: getfield int game.C_100294_ki.field_106999_q
		// @0C0: iadd
		// @0C1: invokespecial game.C_100171_cn.<init>(int, int)void
		// @0C4: putfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0C7: aload_0
		// @0C8: aload_0
		// @0C9: getfield int game.C_100294_ki.field_106956_C
		// @0CC: iconst_1
		// @0CD: invokestatic java.lang.Math.max(int, int)int
		// @0D0: putfield int game.C_100294_ki.field_106994_v
		// @0D3: aload_0
		// @0D4: iconst_0
		// @0D5: putfield int game.C_100294_ki.field_106989_k
		// @0D8: aload_0
		// @0D9: iconst_0
		// @0DA: putfield int game.C_100294_ki.field_106957_L
		// @0DD: aload_0
		// @0DE: iconst_0
		// @0DF: putfield int game.C_100294_ki.field_106951_E
		// @0E2: aload_0
		// @0E3: iconst_0
		// @0E4: putfield int game.C_100294_ki.field_106967_W
		// @0E7: aload_0
		// @0E8: new game.C_100202_qi
		// @0EB: dup
		// @0EC: invokespecial game.C_100202_qi.<init>()void
		// @0EF: putfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @0F2: aload_0
		// @0F3: iload #7
		// @0F5: aload_0
		// @0F6: getfield int game.C_100294_ki.field_106999_q
		// @0F9: iadd
		// @0FA: newarray int[]
		// @0FC: putfield int[] game.C_100294_ki.field_106945_cb
		// @0FF: aload_0
		// @100: iload #10
		// @102: putfield boolean game.C_100294_ki.field_106976_Z
		// @105: aload_0
		// @106: iload #9
		// @108: putfield boolean game.C_100294_ki.field_106947_bb
		// @10B: aload_0
		// @10C: aload_0
		// @10D: getfield int game.C_100294_ki.field_106968_ib
		// @110: iconst_3
		// @111: if_icmpne @119
		// @114: iconst_1
		// @115: goto @11A
		// @118: athrow
		// @119: iconst_0
		// @11A: putfield boolean game.C_100294_ki.field_106953_G
		// @11D: bipush 9 (0x09)
		// @11F: anewarray int[]
		// @122: dup
		// @123: iconst_0
		// @124: getstatic int[] game.C_100005_fk.field_103604_v
		// @127: aastore
		// @128: dup
		// @129: iconst_1
		// @12A: getstatic int[] game.C_100005_fk.field_103605_u
		// @12D: aastore
		// @12E: dup
		// @12F: iconst_2
		// @130: getstatic int[] game.C_100005_fk.field_103607_s
		// @133: aastore
		// @134: dup
		// @135: iconst_3
		// @136: getstatic int[] game.C_100005_fk.field_103606_t
		// @139: aastore
		// @13A: dup
		// @13B: iconst_4
		// @13C: getstatic int[] game.C_100005_fk.field_103602_h
		// @13F: aastore
		// @140: dup
		// @141: iconst_5
		// @142: getstatic int[] game.C_100005_fk.field_103610_p
		// @145: aastore
		// @146: dup
		// @147: bipush 6 (0x06)
		// @149: getstatic int[] game.C_100005_fk.field_103597_o
		// @14C: aastore
		// @14D: dup
		// @14E: bipush 7 (0x07)
		// @150: getstatic int[] game.C_100005_fk.field_103592_e
		// @153: aastore
		// @154: dup
		// @155: bipush 8 (0x08)
		// @157: getstatic int[] game.C_100005_fk.field_103600_j
		// @15A: aastore
		// @15B: astore #12
		// @15D: iconst_0
		// @15E: istore #13
		// @160: iload #13
		// @162: iconst_m1
		// @163: ixor
		// @164: iload #7
		// @166: aload_0
		// @167: getfield int game.C_100294_ki.field_106999_q
		// @16A: iadd
		// @16B: iconst_m1
		// @16C: ixor
		// @16D: if_icmple @4D5
		// @170: new game.C_100314_lf
		// @173: dup
		// @174: aload_0
		// @175: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @178: sipush 23156 (0x5A74)
		// @17B: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @17E: ldc_w -1347866972 (0xafa92ea4)
		// @181: ishl
		// @182: iconst_1
		// @183: iload #13
		// @185: iadd
		// @186: imul
		// @187: iload #7
		// @189: iconst_1
		// @18A: aload_0
		// @18B: getfield int game.C_100294_ki.field_106999_q
		// @18E: iadd
		// @18F: iadd
		// @190: idiv
		// @191: ldc_w -320000 (0xfffb1e00)
		// @194: aload_0
		// @195: invokespecial game.C_100314_lf.<init>(int, int, game.C_100294_ki)void
		// @198: astore #11
		// @19A: iload #13
		// @19C: istore #14
		// @19E: iload #7
		// @1A0: iconst_m1
		// @1A1: ixor
		// @1A2: iconst_m1
		// @1A3: iload #19
		// @1A5: ifne @4E5
		// @1A8: if_icmplt @1BF
		// @1AB: goto @1AF
		// @1AE: athrow
		// @1AF: aload_0
		// @1B0: getfield int game.C_100294_ki.field_106999_q
		// @1B3: iconst_m1
		// @1B4: iadd
		// @1B5: iload #14
		// @1B7: isub
		// @1B8: istore #14
		// @1BA: iload #19
		// @1BC: ifeq @232
		// @1BF: iload #13
		// @1C1: iconst_m1
		// @1C2: ixor
		// @1C3: aload_0
		// @1C4: getfield int game.C_100294_ki.field_106999_q
		// @1C7: iconst_2
		// @1C8: idiv
		// @1C9: iconst_m1
		// @1CA: ixor
		// @1CB: if_icmpgt @1E4
		// @1CE: goto @1D2
		// @1D1: athrow
		// @1D2: iload #13
		// @1D4: iload #7
		// @1D6: aload_0
		// @1D7: getfield int game.C_100294_ki.field_106999_q
		// @1DA: iconst_2
		// @1DB: idiv
		// @1DC: iadd
		// @1DD: if_icmplt @221
		// @1E0: goto @1E4
		// @1E3: athrow
		// @1E4: aload_0
		// @1E5: getfield int game.C_100294_ki.field_106999_q
		// @1E8: iconst_2
		// @1E9: idiv
		// @1EA: iload #7
		// @1EC: iadd
		// @1ED: iconst_m1
		// @1EE: ixor
		// @1EF: iload #13
		// @1F1: iconst_m1
		// @1F2: ixor
		// @1F3: if_icmpge @20A
		// @1F6: goto @1FA
		// @1F9: athrow
		// @1FA: iconst_m1
		// @1FB: aload_0
		// @1FC: getfield int game.C_100294_ki.field_106999_q
		// @1FF: iadd
		// @200: iload #14
		// @202: isub
		// @203: istore #14
		// @205: iload #19
		// @207: ifeq @232
		// @20A: iload #14
		// @20C: iload #7
		// @20E: isub
		// @20F: istore #14
		// @211: aload_0
		// @212: getfield int game.C_100294_ki.field_106999_q
		// @215: iconst_1
		// @216: isub
		// @217: iload #14
		// @219: isub
		// @21A: istore #14
		// @21C: iload #19
		// @21E: ifeq @232
		// @221: aload_0
		// @222: getfield int game.C_100294_ki.field_106999_q
		// @225: iconst_2
		// @226: idiv
		// @227: ineg
		// @228: iload #13
		// @22A: aload_0
		// @22B: getfield int game.C_100294_ki.field_106999_q
		// @22E: iadd
		// @22F: iadd
		// @230: istore #14
		// @232: iload #14
		// @234: istore #15
		// @236: aload_0
		// @237: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @23A: sipush 26294 (0x66B6)
		// @23D: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @240: iconst_1
		// @241: if_icmpeq @25D
		// @244: bipush -5 (0xFB)
		// @246: aload_0
		// @247: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @24A: sipush 26294 (0x66B6)
		// @24D: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @250: iconst_m1
		// @251: ixor
		// @252: if_icmpeq @25D
		// @255: goto @259
		// @258: athrow
		// @259: goto @27D
		// @25C: athrow
		// @25D: iload #14
		// @25F: iconst_2
		// @260: imul
		// @261: aload_0
		// @262: getfield int game.C_100294_ki.field_106999_q
		// @265: idiv
		// @266: istore #15
		// @268: bipush -2 (0xFE)
		// @26A: iload #15
		// @26C: iconst_m1
		// @26D: ixor
		// @26E: if_icmpeq @275
		// @271: goto @27D
		// @274: athrow
		// @275: aload #11
		// @277: ldc_w 65793 (0x10101)
		// @27A: putfield int game.C_100314_lf.field_101336_Q
		// @27D: bipush -4 (0xFC)
		// @27F: aload_0
		// @280: getfield int game.C_100294_ki.field_106968_ib
		// @283: iconst_m1
		// @284: ixor
		// @285: if_icmpne @28B
		// @288: iconst_0
		// @289: istore #15
		// @28B: iload #14
		// @28D: iconst_m1
		// @28E: ixor
		// @28F: aload_0
		// @290: getfield int game.C_100294_ki.field_106999_q
		// @293: iconst_m1
		// @294: ixor
		// @295: if_icmple @3E2
		// @298: aconst_null
		// @299: aload #4
		// @29B: iload #14
		// @29D: aaload
		// @29E: if_acmpne @2A9
		// @2A1: goto @2A5
		// @2A4: athrow
		// @2A5: goto @444
		// @2A8: athrow
		// @2A9: iconst_0
		// @2AA: aload_0
		// @2AB: getfield int game.C_100294_ki.field_106956_C
		// @2AE: if_icmpeq @2B5
		// @2B1: goto @315
		// @2B4: athrow
		// @2B5: iconst_m1
		// @2B6: istore #16
		// @2B8: aload #4
		// @2BA: iload #14
		// @2BC: aaload
		// @2BD: iconst_0
		// @2BE: iaload
		// @2BF: istore #17
		// @2C1: iload #17
		// @2C3: iconst_m1
		// @2C4: ixor
		// @2C5: iconst_m1
		// @2C6: if_icmpne @2D2
		// @2C9: iload #19
		// @2CB: ifeq @2F0
		// @2CE: goto @2D2
		// @2D1: athrow
		// @2D2: bipush -56 (0xC8)
		// @2D4: iload #17
		// @2D6: iconst_m1
		// @2D7: ixor
		// @2D8: if_icmpeq @2F8
		// @2DB: goto @2DF
		// @2DE: athrow
		// @2DF: bipush -58 (0xC6)
		// @2E1: iload #17
		// @2E3: iconst_m1
		// @2E4: ixor
		// @2E5: if_icmpeq @300
		// @2E8: goto @2EC
		// @2EB: athrow
		// @2EC: goto @308
		// @2EF: athrow
		// @2F0: iconst_0
		// @2F1: istore #16
		// @2F3: iload #19
		// @2F5: ifeq @30B
		// @2F8: iconst_1
		// @2F9: istore #16
		// @2FB: iload #19
		// @2FD: ifeq @30B
		// @300: iconst_2
		// @301: istore #16
		// @303: iload #19
		// @305: ifeq @30B
		// @308: iconst_1
		// @309: istore #16
		// @30B: aload #4
		// @30D: iload #14
		// @30F: aload #12
		// @311: iload #16
		// @313: aaload
		// @314: aastore
		// @315: aload #11
		// @317: aconst_null
		// @318: aload_0
		// @319: getfield java.lang.String[] game.C_100294_ki.field_106974_Y
		// @31C: if_acmpeq @367
		// @31F: iload #14
		// @321: iflt @367
		// @324: goto @328
		// @327: athrow
		// @328: aload_0
		// @329: getfield java.lang.String[] game.C_100294_ki.field_106974_Y
		// @32C: arraylength
		// @32D: iconst_m1
		// @32E: ixor
		// @32F: iload #14
		// @331: iconst_m1
		// @332: ixor
		// @333: if_icmpge @367
		// @336: goto @33A
		// @339: athrow
		// @33A: aconst_null
		// @33B: aload_0
		// @33C: getfield java.lang.String[] game.C_100294_ki.field_106974_Y
		// @33F: iload #14
		// @341: aaload
		// @342: if_acmpeq @367
		// @345: goto @349
		// @348: athrow
		// @349: aload_0
		// @34A: getfield java.lang.String[] game.C_100294_ki.field_106974_Y
		// @34D: iload #14
		// @34F: aaload
		// @350: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @353: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @356: iconst_2
		// @357: aaload
		// @358: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @35B: ifeq @367
		// @35E: goto @362
		// @361: athrow
		// @362: iconst_1
		// @363: goto @368
		// @366: athrow
		// @367: iconst_0
		// @368: putfield boolean game.C_100314_lf.field_101308_pc
		// @36B: aload #11
		// @36D: aload #4
		// @36F: iload #14
		// @371: aaload
		// @372: iload #15
		// @374: bipush 61 (0x3D)
		// @376: iload #14
		// @378: iconst_0
		// @379: invokevirtual game.C_100314_lf.func_101263_a(int[], int, byte, int, boolean)void
		// @37C: aload_0
		// @37D: getfield int game.C_100294_ki.field_106956_C
		// @380: iconst_1
		// @381: if_icmpeq @388
		// @384: goto @3B2
		// @387: athrow
		// @388: sipush -6101 (0xE82B)
		// @38B: aload #11
		// @38D: getfield int[] game.C_100314_lf.field_101407_Zb
		// @390: aload #11
		// @392: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @395: bipush 80 (0x50)
		// @397: invokestatic game.C_100238_ol.func_101690_a(int[], game.C_100327_ib, byte)int
		// @39A: iconst_m1
		// @39B: ixor
		// @39C: if_icmpgt @3A3
		// @39F: goto @3B2
		// @3A2: athrow
		// @3A3: aload #11
		// @3A5: getstatic int[] game.C_100005_fk.field_103605_u
		// @3A8: iload #15
		// @3AA: bipush 61 (0x3D)
		// @3AC: iload #14
		// @3AE: iconst_0
		// @3AF: invokevirtual game.C_100314_lf.func_101263_a(int[], int, byte, int, boolean)void
		// @3B2: aconst_null
		// @3B3: aload_0
		// @3B4: getfield game.C_100222_aa game.C_100294_ki.field_106946_gb
		// @3B7: if_acmpne @3BE
		// @3BA: goto @3D1
		// @3BD: athrow
		// @3BE: aload_0
		// @3BF: getfield game.C_100222_aa game.C_100294_ki.field_106946_gb
		// @3C2: iconst_0
		// @3C3: aload #11
		// @3C5: getfield int game.C_100314_lf.field_101345_X
		// @3C8: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @3CB: iload #14
		// @3CD: iconst_0
		// @3CE: invokevirtual game.C_100222_aa.func_106078_a(int, java.lang.String, int, int)void
		// @3D1: aload_0
		// @3D2: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @3D5: sipush 15828 (0x3DD4)
		// @3D8: aload #11
		// @3DA: invokevirtual game.C_100202_qi.func_105903_b(int, game.C_100158_da)void
		// @3DD: iload #19
		// @3DF: ifeq @444
		// @3E2: iconst_0
		// @3E3: istore #16
		// @3E5: iconst_3
		// @3E6: istore #17
		// @3E8: aload_0
		// @3E9: getfield int game.C_100294_ki.field_106956_C
		// @3EC: iconst_1
		// @3ED: if_icmpge @3F4
		// @3F0: goto @3F8
		// @3F3: athrow
		// @3F4: bipush 6 (0x06)
		// @3F6: istore #17
		// @3F8: bipush -3 (0xFD)
		// @3FA: aload_0
		// @3FB: getfield int game.C_100294_ki.field_106956_C
		// @3FE: iconst_m1
		// @3FF: ixor
		// @400: if_icmpge @407
		// @403: goto @40E
		// @406: athrow
		// @407: iconst_3
		// @408: istore #16
		// @40A: bipush 9 (0x09)
		// @40C: istore #17
		// @40E: aload_0
		// @40F: getfield game.C_100038_wa game.C_100294_ki.field_106988_j
		// @412: bipush -4 (0xFC)
		// @414: iload #17
		// @416: iload #16
		// @418: isub
		// @419: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @41C: iload #16
		// @41E: iadd
		// @41F: istore #18
		// @421: aload #11
		// @423: aload #12
		// @425: iload #18
		// @427: aaload
		// @428: iload #15
		// @42A: bipush 61 (0x3D)
		// @42C: iload #14
		// @42E: iconst_0
		// @42F: invokevirtual game.C_100314_lf.func_101263_a(int[], int, byte, int, boolean)void
		// @432: aload #11
		// @434: bipush 11 (0x0B)
		// @436: putfield int game.C_100314_lf.field_101387_Xb
		// @439: aload_0
		// @43A: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @43D: bipush 123 (0x7B)
		// @43F: aload #11
		// @441: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @444: bipush -5 (0xFB)
		// @446: aload_0
		// @447: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @44A: sipush 26294 (0x66B6)
		// @44D: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @450: iconst_m1
		// @451: ixor
		// @452: if_icmpne @4BD
		// @455: aload #11
		// @457: iconst_1
		// @458: invokevirtual game.C_100314_lf.func_101287_i(int)void
		// @45B: aload #11
		// @45D: ldc_w -320000 (0xfffb1e00)
		// @460: putfield int game.C_100314_lf.field_101395_rc
		// @463: aload #11
		// @465: aload #11
		// @467: getfield int game.C_100314_lf.field_101395_rc
		// @46A: putfield int game.C_100314_lf.field_101360_nb
		// @46D: aload #11
		// @46F: iconst_1
		// @470: putfield boolean game.C_100314_lf.field_101307_pb
		// @473: aload #11
		// @475: sipush 1000 (0x03E8)
		// @478: putfield int game.C_100314_lf.field_101294_gc
		// @47B: aload #11
		// @47D: iconst_0
		// @47E: putfield int game.C_100314_lf.field_101344_Y
		// @481: aload #11
		// @483: iconst_1
		// @484: putfield boolean game.C_100314_lf.field_101391_lb
		// @487: aload #11
		// @489: aload_0
		// @48A: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @48D: bipush 64 (0x40)
		// @48F: aload #11
		// @491: getfield int game.C_100314_lf.field_101377_tc
		// @494: ldc_w 1826165476 (0x6cd912e4)
		// @497: ishr
		// @498: invokevirtual game.C_100171_cn.func_105560_c(int, int)int
		// @49B: ldc_w 733584612 (0x2bb99ce4)
		// @49E: ishl
		// @49F: ineg
		// @4A0: sipush -500 (0xFE0C)
		// @4A3: iadd
		// @4A4: putfield int game.C_100314_lf.field_101395_rc
		// @4A7: aload #11
		// @4A9: aload #11
		// @4AB: getfield int game.C_100314_lf.field_101395_rc
		// @4AE: putfield int game.C_100314_lf.field_101360_nb
		// @4B1: aload #11
		// @4B3: sipush 500 (0x01F4)
		// @4B6: putfield int game.C_100314_lf.field_101297_Ub
		// @4B9: goto @4BD
		// @4BC: athrow
		// @4BD: aload #11
		// @4BF: bipush 120 (0x78)
		// @4C1: invokevirtual game.C_100314_lf.func_101290_h(int)void
		// @4C4: aload_0
		// @4C5: getfield int[] game.C_100294_ki.field_106945_cb
		// @4C8: iload #13
		// @4CA: bipush 50 (0x32)
		// @4CC: iastore
		// @4CD: iinc #13 +1
		// @4D0: iload #19
		// @4D2: ifeq @160
		// @4D5: aload_0
		// @4D6: iconst_4
		// @4D7: putfield int game.C_100294_ki.field_106964_J
		// @4DA: iconst_4
		// @4DB: aload_0
		// @4DC: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @4DF: sipush 26294 (0x66B6)
		// @4E2: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @4E5: if_icmpne @4F1
		// @4E8: aload_0
		// @4E9: iconst_2
		// @4EA: putfield int game.C_100294_ki.field_106964_J
		// @4ED: goto @4F1
		// @4F0: athrow
		// @4F1: aload_0
		// @4F2: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @4F5: sipush 26294 (0x66B6)
		// @4F8: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @4FB: iconst_m1
		// @4FC: ixor
		// @4FD: bipush -4 (0xFC)
		// @4FF: if_icmpeq @506
		// @502: goto @50B
		// @505: athrow
		// @506: aload_0
		// @507: iconst_3
		// @508: putfield int game.C_100294_ki.field_106964_J
		// @50B: aload_0
		// @50C: new game.C_100202_qi
		// @50F: dup
		// @510: invokespecial game.C_100202_qi.<init>()void
		// @513: putfield game.C_100202_qi game.C_100294_ki.field_106986_l
		// @516: aload_0
		// @517: new game.C_100202_qi
		// @51A: dup
		// @51B: invokespecial game.C_100202_qi.<init>()void
		// @51E: putfield game.C_100202_qi game.C_100294_ki.field_106991_fb
		// @521: aload_0
		// @522: new game.C_100202_qi
		// @525: dup
		// @526: invokespecial game.C_100202_qi.<init>()void
		// @529: putfield game.C_100202_qi game.C_100294_ki.field_106981_b
		// @52C: aload_0
		// @52D: new game.C_100202_qi
		// @530: dup
		// @531: invokespecial game.C_100202_qi.<init>()void
		// @534: putfield game.C_100202_qi game.C_100294_ki.field_106977_f
		// @537: aload_0
		// @538: getfield boolean game.C_100294_ki.field_106969_V
		// @53B: ifne @55D
		// @53E: aload_0
		// @53F: new game.C_100202_qi
		// @542: dup
		// @543: invokespecial game.C_100202_qi.<init>()void
		// @546: putfield game.C_100202_qi game.C_100294_ki.field_106978_g
		// @549: aload_0
		// @54A: new game.C_100202_qi
		// @54D: dup
		// @54E: invokespecial game.C_100202_qi.<init>()void
		// @551: putfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @554: iload #19
		// @556: ifeq @56B
		// @559: goto @55D
		// @55C: athrow
		// @55D: aload_0
		// @55E: aconst_null
		// @55F: putfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @562: aload_0
		// @563: aconst_null
		// @564: putfield game.C_100202_qi game.C_100294_ki.field_106978_g
		// @567: goto @56B
		// @56A: athrow
		// @56B: aload_0
		// @56C: new game.C_100202_qi
		// @56F: dup
		// @570: invokespecial game.C_100202_qi.<init>()void
		// @573: putfield game.C_100202_qi game.C_100294_ki.field_106997_s
		// @576: aload_0
		// @577: new game.C_100300_kc
		// @57A: dup
		// @57B: invokespecial game.C_100300_kc.<init>()void
		// @57E: putfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @581: aload_0
		// @582: getfield boolean game.C_100294_ki.field_106953_G
		// @585: ifne @58C
		// @588: goto @59D
		// @58B: athrow
		// @58C: aload_0
		// @58D: iconst_3
		// @58E: putfield int game.C_100294_ki.field_106996_t
		// @591: aload_0
		// @592: iconst_0
		// @593: putfield int game.C_100294_ki.field_106959_N
		// @596: aload_0
		// @597: ldc_w 100000 (0x186a0)
		// @59A: putfield int game.C_100294_ki.field_106955_B
		// @59D: aload_0
		// @59E: iconst_m1
		// @59F: putfield int game.C_100294_ki.field_107004_x
		// @5A2: iconst_2
		// @5A3: aload_0
		// @5A4: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @5A7: sipush 26294 (0x66B6)
		// @5AA: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @5AD: if_icmpne @5EB
		// @5B0: bipush -2 (0xFE)
		// @5B2: aload_0
		// @5B3: getfield int game.C_100294_ki.field_106999_q
		// @5B6: iconst_m1
		// @5B7: ixor
		// @5B8: if_icmple @5EB
		// @5BB: goto @5BF
		// @5BE: athrow
		// @5BF: new game.C_100239_oi
		// @5C2: dup
		// @5C3: aload_0
		// @5C4: bipush 43 (0x2B)
		// @5C6: invokespecial game.C_100239_oi.<init>(game.C_100294_ki, int)void
		// @5C9: astore #13
		// @5CB: aload #13
		// @5CD: aload_0
		// @5CE: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @5D1: sipush 23156 (0x5A74)
		// @5D4: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @5D7: ldc_w 123289444 (0x7593f64)
		// @5DA: ishl
		// @5DB: iconst_2
		// @5DC: idiv
		// @5DD: putfield int game.C_100239_oi.field_102296_A
		// @5E0: aload_0
		// @5E1: getfield game.C_100202_qi game.C_100294_ki.field_106997_s
		// @5E4: bipush 126 (0x7E)
		// @5E6: aload #13
		// @5E8: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @5EB: goto @68B
		// @5EE: astore #11
		// @5F0: aload #11
		// @5F2: new java.lang.StringBuilder
		// @5F5: dup
		// @5F6: invokespecial java.lang.StringBuilder.<init>()void
		// @5F9: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @5FC: iconst_3
		// @5FD: aaload
		// @5FE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @601: iload_1
		// @602: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @605: bipush 44 (0x2C)
		// @607: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60A: iload_2
		// @60B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @60E: bipush 44 (0x2C)
		// @610: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @613: aload_3
		// @614: ifnull @620
		// @617: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @61A: iconst_1
		// @61B: aaload
		// @61C: goto @625
		// @61F: athrow
		// @620: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @623: iconst_4
		// @624: aaload
		// @625: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @628: bipush 44 (0x2C)
		// @62A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @62D: aload #4
		// @62F: ifnull @63B
		// @632: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @635: iconst_1
		// @636: aaload
		// @637: goto @640
		// @63A: athrow
		// @63B: getstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @63E: iconst_4
		// @63F: aaload
		// @640: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @643: bipush 44 (0x2C)
		// @645: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @648: iload #5
		// @64A: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @64D: bipush 44 (0x2C)
		// @64F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @652: iload #6
		// @654: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @657: bipush 44 (0x2C)
		// @659: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @65C: iload #7
		// @65E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @661: bipush 44 (0x2C)
		// @663: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @666: iload #8
		// @668: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @66B: bipush 44 (0x2C)
		// @66D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @670: iload #9
		// @672: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @675: bipush 44 (0x2C)
		// @677: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @67A: iload #10
		// @67C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @67F: bipush 41 (0x29)
		// @681: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @684: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @687: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @68A: athrow
		// @68B: return
	}
	
	static
	{
		// @000: bipush 55 (0x37)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "IPr/D"
		// @009: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "Y\u0017rR\u0011"
		// @014: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @017: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc_w "OV8"
		// @020: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @023: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @026: aastore
		// @027: dup
		// @028: iconst_3
		// @029: ldc_w "IPr@\u0005LP(BD"
		// @02C: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @02F: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @032: aastore
		// @033: dup
		// @034: iconst_4
		// @035: ldc "LL0\u0010"
		// @037: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @03A: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @03D: aastore
		// @03E: dup
		// @03F: iconst_5
		// @040: ldc_w "IPr?.\n"
		// @043: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @046: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @049: aastore
		// @04A: dup
		// @04B: bipush 6 (0x06)
		// @04D: ldc "IPr;-\n"
		// @04F: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @052: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @055: aastore
		// @056: dup
		// @057: bipush 7 (0x07)
		// @059: ldc "IPr--\n"
		// @05B: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @05E: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @061: aastore
		// @062: dup
		// @063: bipush 8 (0x08)
		// @065: ldc "IPr.D"
		// @067: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @06A: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @06D: aastore
		// @06E: dup
		// @06F: bipush 9 (0x09)
		// @071: ldc_w "IPr,-\n"
		// @074: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @077: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @07A: aastore
		// @07B: dup
		// @07C: bipush 10 (0x0A)
		// @07E: ldc "IPr4-\n"
		// @080: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @083: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @086: aastore
		// @087: dup
		// @088: bipush 11 (0x0B)
		// @08A: ldc "IPr6D"
		// @08C: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @08F: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @092: aastore
		// @093: dup
		// @094: bipush 12 (0x0C)
		// @096: ldc_w "IPr>-\n"
		// @099: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @09C: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @09F: aastore
		// @0A0: dup
		// @0A1: bipush 13 (0x0D)
		// @0A3: ldc "IPr(-\n"
		// @0A5: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @0A8: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @0AB: aastore
		// @0AC: dup
		// @0AD: bipush 14 (0x0E)
		// @0AF: ldc_w "IPr2D"
		// @0B2: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @0B5: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @0B8: aastore
		// @0B9: dup
		// @0BA: bipush 15 (0x0F)
		// @0BC: ldc_w "IPr6-\n"
		// @0BF: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @0C2: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @0C5: aastore
		// @0C6: dup
		// @0C7: bipush 16 (0x10)
		// @0C9: ldc_w "IPr9-\n"
		// @0CC: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @0CF: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @0D2: aastore
		// @0D3: dup
		// @0D4: bipush 17 (0x11)
		// @0D6: ldc "IPr=-\n"
		// @0D8: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @0DB: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @0DE: aastore
		// @0DF: dup
		// @0E0: bipush 18 (0x12)
		// @0E2: ldc_w "IPr+D"
		// @0E5: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @0E8: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @0EB: aastore
		// @0EC: dup
		// @0ED: bipush 19 (0x13)
		// @0EF: ldc_w "IPr=.\n"
		// @0F2: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @0F5: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @0F8: aastore
		// @0F9: dup
		// @0FA: bipush 20 (0x14)
		// @0FC: ldc "IPr8.\n"
		// @0FE: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @101: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @104: aastore
		// @105: dup
		// @106: bipush 21 (0x15)
		// @108: ldc "IPr7-\n"
		// @10A: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @10D: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @110: aastore
		// @111: dup
		// @112: bipush 22 (0x16)
		// @114: ldc_w "IPr)D"
		// @117: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @11A: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @11D: aastore
		// @11E: dup
		// @11F: bipush 23 (0x17)
		// @121: ldc_w "IPr0-\n"
		// @124: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @127: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @12A: aastore
		// @12B: dup
		// @12C: bipush 24 (0x18)
		// @12E: ldc "IPr:D"
		// @130: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @133: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @136: aastore
		// @137: dup
		// @138: bipush 25 (0x19)
		// @13A: ldc "IPr1D"
		// @13C: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @13F: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @142: aastore
		// @143: dup
		// @144: bipush 26 (0x1A)
		// @146: ldc "IPr9D"
		// @148: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @14B: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @14E: aastore
		// @14F: dup
		// @150: bipush 27 (0x1B)
		// @152: ldc_w "IPr1-\n"
		// @155: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @158: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @15B: aastore
		// @15C: dup
		// @15D: bipush 28 (0x1C)
		// @15F: ldc_w "IPr*-\n"
		// @162: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @165: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @168: aastore
		// @169: dup
		// @16A: bipush 29 (0x1D)
		// @16C: ldc_w "\u0002L2\u0010\u0005LR9\u0018"
		// @16F: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @172: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @175: aastore
		// @176: dup
		// @177: bipush 30 (0x1E)
		// @179: ldc "IPr0D"
		// @17B: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @17E: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @181: aastore
		// @182: dup
		// @183: bipush 31 (0x1F)
		// @185: ldc_w "IPr*D"
		// @188: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @18B: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @18E: aastore
		// @18F: dup
		// @190: bipush 32 (0x20)
		// @192: ldc_w "IPr;D"
		// @195: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @198: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @19B: aastore
		// @19C: dup
		// @19D: bipush 33 (0x21)
		// @19F: ldc_w "IPr+-\n"
		// @1A2: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @1A5: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @1A8: aastore
		// @1A9: dup
		// @1AA: bipush 34 (0x22)
		// @1AC: ldc "IPr-D"
		// @1AE: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @1B1: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @1B4: aastore
		// @1B5: dup
		// @1B6: bipush 35 (0x23)
		// @1B8: ldc_w "IPr>D"
		// @1BB: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @1BE: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @1C1: aastore
		// @1C2: dup
		// @1C3: bipush 36 (0x24)
		// @1C5: ldc_w "IPr>.\n"
		// @1C8: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @1CB: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @1CE: aastore
		// @1CF: dup
		// @1D0: bipush 37 (0x25)
		// @1D2: ldc_w "IPr7D"
		// @1D5: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @1D8: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @1DB: aastore
		// @1DC: dup
		// @1DD: bipush 38 (0x26)
		// @1DF: ldc_w "IPr(D"
		// @1E2: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @1E5: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @1E8: aastore
		// @1E9: dup
		// @1EA: bipush 39 (0x27)
		// @1EC: ldc "IPr:-\n"
		// @1EE: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @1F1: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @1F4: aastore
		// @1F5: dup
		// @1F6: bipush 40 (0x28)
		// @1F8: ldc_w "IPr)-\n"
		// @1FB: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @1FE: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @201: aastore
		// @202: dup
		// @203: bipush 41 (0x29)
		// @205: ldc_w "IPr3D"
		// @208: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @20B: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @20E: aastore
		// @20F: dup
		// @210: bipush 42 (0x2A)
		// @212: ldc "IPr3-\n"
		// @214: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @217: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @21A: aastore
		// @21B: dup
		// @21C: bipush 43 (0x2B)
		// @21E: ldc_w "IPr/-\n"
		// @221: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @224: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @227: aastore
		// @228: dup
		// @229: bipush 44 (0x2C)
		// @22B: ldc_w "IPr8-\n"
		// @22E: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @231: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @234: aastore
		// @235: dup
		// @236: bipush 45 (0x2D)
		// @238: ldc_w "IPr=D"
		// @23B: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @23E: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @241: aastore
		// @242: dup
		// @243: bipush 46 (0x2E)
		// @245: ldc_w "IPr5D"
		// @248: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @24B: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @24E: aastore
		// @24F: dup
		// @250: bipush 47 (0x2F)
		// @252: ldc_w "IPr?D"
		// @255: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @258: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @25B: aastore
		// @25C: dup
		// @25D: bipush 48 (0x30)
		// @25F: ldc_w "IPr?-\n"
		// @262: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @265: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @268: aastore
		// @269: dup
		// @26A: bipush 49 (0x31)
		// @26C: ldc_w "IPr8D"
		// @26F: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @272: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @275: aastore
		// @276: dup
		// @277: bipush 50 (0x32)
		// @279: ldc_w "IPr2-\n"
		// @27C: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @27F: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @282: aastore
		// @283: dup
		// @284: bipush 51 (0x33)
		// @286: ldc_w "IPr,D"
		// @289: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @28C: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @28F: aastore
		// @290: dup
		// @291: bipush 52 (0x34)
		// @293: ldc_w "IPr.-\n"
		// @296: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @299: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @29C: aastore
		// @29D: dup
		// @29E: bipush 53 (0x35)
		// @2A0: ldc_w "IPr4D"
		// @2A3: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @2A6: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @2A9: aastore
		// @2AA: dup
		// @2AB: bipush 54 (0x36)
		// @2AD: ldc_w "IPr5-\n"
		// @2B0: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @2B3: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @2B6: aastore
		// @2B7: putstatic java.lang.String[] game.C_100294_ki.field_106970_Q
		// @2BA: ldc_w "\u001eZ3\u0010Q\u0013\u000cjLT\u0012\u0007\u000f3 ck\u0015()\u0002z\t>)q\u0003|@CAV0B"
		// @2BD: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @2C0: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @2C3: putstatic java.lang.String game.C_100294_ki.field_106973_R
		// @2C6: iconst_m1
		// @2C7: putstatic int game.C_100294_ki.field_106971_P
		// @2CA: iconst_4
		// @2CB: anewarray java.lang.String
		// @2CE: dup
		// @2CF: iconst_0
		// @2D0: ldc_w "gO9\u000e\u0015MW9\\\u0005Q\u0019%\u0013\u0019P\u00199\u0012\tO@r"
		// @2D3: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @2D6: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @2D9: aastore
		// @2DA: dup
		// @2DB: iconst_1
		// @2DC: ldc_w "f\\/\u0008\u001eM@|\u0008\u0004G\u00199\u0012\tOP9\u000f@\u0002[)\u0008LFV2[\u0018\u0002X(\u0008\rAR|\u0005\u0003WK|\u0013\u001bL\u0019(\u0019\rO\u0017"
		// @2DF: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @2E2: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @2E5: aastore
		// @2E6: dup
		// @2E7: iconst_2
		// @2E8: ldc_w "f\\/\u0008\u001eM@|\u001d\u001f\u0002T=\u0012\u0015\u0002N=\n\tQ\u00193\u001aLGW9\u0011\u0005GJ|\u001d\u001f\u0002@3\tLAX2R"
		// @2EB: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @2EE: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @2F1: aastore
		// @2F2: dup
		// @2F3: iconst_3
		// @2F4: ldc_w "aV3\u000c\tPX(\u0019LUP(\u0014L[V)\u000eLCU0\u0005LVV|\u0018\tQM.\u0013\u0015\u0002X/\\\u0001CW%\\\u001bCO9\u000fLM_|\u0019\u0002GT5\u0019\u001f\u0002X/\\\u0015ML|\u001f\rL\u0017"
		// @2F7: invokestatic game.C_100294_ki.func_106910_z(java.lang.String)char[]
		// @2FA: invokestatic game.C_100294_ki.func_106922_z(char[])java.lang.String
		// @2FD: aastore
		// @2FE: putstatic java.lang.String[] game.C_100294_ki.field_106983_a
		// @301: return
	}
	
	private static char[] func_106910_z(String arg0)
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
		// @0E: bipush 108 (0x6C)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_106922_z(char[] arg0)
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
		// @35: bipush 57 (0x39)
		// @37: goto @46
		// @3A: bipush 92 (0x5C)
		// @3C: goto @46
		// @3F: bipush 124 (0x7C)
		// @41: goto @46
		// @44: bipush 108 (0x6C)
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
