package game;

final class C_100330_ig
{
	static C_100037_wb[] field_107285_d;
	static String[] field_107292_i;
	static int field_107291_h;
	static C_100214_al[] field_107287_b;
	static byte[] field_107283_f;
	static String field_107289_a;
	static String field_107284_g;
	static String[] field_107286_e;
	static C_100098_h field_107288_c;
	private static final String[] field_107290_z;
	
	static final C_100037_wb[] func_107274_a(C_100098_h arg0, int arg1, int arg2, int arg3)
	{
		// @00: iload_2
		// @01: iconst_1
		// @02: aload_0
		// @03: iload_1
		// @04: invokestatic game.C_100333_ij.func_107341_a(int, boolean, game.C_100098_h, int)boolean
		// @07: ifne @0C
		// @0A: aconst_null
		// @0B: areturn
		// @0C: iload_3
		// @0D: bipush -74 (0xB6)
		// @0F: if_icmple @24
		// @12: bipush -6 (0xFA)
		// @14: aconst_null
		// @15: checkcast java.lang.String
		// @18: iconst_1
		// @19: aconst_null
		// @1A: checkcast game.C_100211_qd
		// @1D: invokestatic game.C_100330_ig.func_107275_a(int, java.lang.String, boolean, game.C_100211_qd)void
		// @20: goto @24
		// @23: athrow
		// @24: iconst_1
		// @25: invokestatic game.C_100230_of.func_106201_a(boolean)game.C_100037_wb[]
		// @28: areturn
		// @29: astore #4
		// @2B: aload #4
		// @2D: new java.lang.StringBuilder
		// @30: dup
		// @31: invokespecial java.lang.StringBuilder.<init>()void
		// @34: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @37: iconst_5
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: aload_0
		// @3D: ifnull @49
		// @40: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @43: iconst_0
		// @44: aaload
		// @45: goto @4E
		// @48: athrow
		// @49: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @4C: iconst_2
		// @4D: aaload
		// @4E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @51: bipush 44 (0x2C)
		// @53: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56: iload_1
		// @57: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5A: bipush 44 (0x2C)
		// @5C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5F: iload_2
		// @60: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @63: bipush 44 (0x2C)
		// @65: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @68: iload_3
		// @69: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6C: bipush 41 (0x29)
		// @6E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @71: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @74: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @77: athrow
	}
	
	public static void func_107282_a(boolean arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100037_wb[] game.C_100330_ig.field_107285_d
		// @04: aconst_null
		// @05: putstatic java.lang.String[] game.C_100330_ig.field_107286_e
		// @08: iload_0
		// @09: ifeq @14
		// @0C: iconst_1
		// @0D: invokestatic game.C_100330_ig.func_107282_a(boolean)void
		// @10: goto @14
		// @13: athrow
		// @14: aconst_null
		// @15: putstatic byte[] game.C_100330_ig.field_107283_f
		// @18: aconst_null
		// @19: putstatic java.lang.String game.C_100330_ig.field_107284_g
		// @1C: aconst_null
		// @1D: putstatic game.C_100214_al[] game.C_100330_ig.field_107287_b
		// @20: aconst_null
		// @21: putstatic game.C_100098_h game.C_100330_ig.field_107288_c
		// @24: aconst_null
		// @25: putstatic java.lang.String game.C_100330_ig.field_107289_a
		// @28: aconst_null
		// @29: putstatic java.lang.String[] game.C_100330_ig.field_107292_i
		// @2C: goto @51
		// @2F: astore_1
		// @30: aload_1
		// @31: new java.lang.StringBuilder
		// @34: dup
		// @35: invokespecial java.lang.StringBuilder.<init>()void
		// @38: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @3B: bipush 6 (0x06)
		// @3D: aaload
		// @3E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @41: iload_0
		// @42: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @45: bipush 41 (0x29)
		// @47: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @50: athrow
		// @51: return
	}
	
	static final void func_107277_a(int arg0)
	{
		// @00: sipush 22547 (0x5813)
		// @03: invokestatic game.C_100327_ib.func_102468_p(int)void
		// @06: getstatic int game.C_100033_gj.field_101917_jc
		// @09: getstatic int game.C_100245_pf.field_106389_c
		// @0C: getstatic game.C_100037_wb[] game.C_100165_sh.field_100771_q
		// @0F: iconst_0
		// @10: aaload
		// @11: getfield int game.C_100037_wb.field_102341_y
		// @14: getstatic int game.C_100244_pe.field_106375_d
		// @17: getstatic int game.C_100099_fb.field_103046_u
		// @1A: sipush 7905 (0x1EE1)
		// @1D: invokestatic game.C_100140_bj.func_102962_a(int, int, int, int, int, int)void
		// @20: iload_0
		// @21: bipush -28 (0xE4)
		// @23: if_icmplt @4B
		// @26: aconst_null
		// @27: checkcast int[]
		// @2A: bipush 45 (0x2D)
		// @2C: iconst_2
		// @2D: bipush 116 (0x74)
		// @2F: bipush 52 (0x34)
		// @31: bipush 23 (0x17)
		// @33: bipush -40 (0xD8)
		// @35: bipush -71 (0xB9)
		// @37: bipush 24 (0x18)
		// @39: bipush 48 (0x30)
		// @3B: bipush -94 (0xA2)
		// @3D: bipush 120 (0x78)
		// @3F: bipush -66 (0xBE)
		// @41: bipush -23 (0xE9)
		// @43: bipush -94 (0xA2)
		// @45: bipush -84 (0xAC)
		// @47: iconst_4
		// @48: invokestatic game.C_100330_ig.func_107276_a(int[], int, int, int, int, int, byte, int, int, int, int, int, int, int, int, int, int)void
		// @4B: goto @70
		// @4E: astore_1
		// @4F: aload_1
		// @50: new java.lang.StringBuilder
		// @53: dup
		// @54: invokespecial java.lang.StringBuilder.<init>()void
		// @57: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @5A: bipush 7 (0x07)
		// @5C: aaload
		// @5D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @60: iload_0
		// @61: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @64: bipush 41 (0x29)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6F: athrow
		// @70: return
	}
	
	static final void func_107280_a(byte arg0)
	{
		// @00: iconst_m1
		// @01: putstatic int game.C_100260_mc.field_102228_Yb
		// @04: iload_0
		// @05: bipush -31 (0xE1)
		// @07: if_icmple @13
		// @0A: bipush 77 (0x4D)
		// @0C: invokestatic game.C_100330_ig.func_107280_a(byte)void
		// @0F: goto @13
		// @12: athrow
		// @13: iconst_0
		// @14: putstatic int game.C_100010_ff.field_103699_j
		// @17: iconst_m1
		// @18: putstatic int game.C_100055_ed.field_104244_c
		// @1B: iconst_0
		// @1C: putstatic boolean game.C_100009_fg.field_103662_i
		// @1F: aconst_null
		// @20: putstatic java.lang.String game.C_100123_uc.field_104922_e
		// @23: goto @47
		// @26: astore_1
		// @27: aload_1
		// @28: new java.lang.StringBuilder
		// @2B: dup
		// @2C: invokespecial java.lang.StringBuilder.<init>()void
		// @2F: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @32: iconst_4
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
	
	static final void func_107279_a(boolean arg0, int arg1, int arg2, C_100107_u arg3, boolean arg4)
	{
		// @000: getstatic int[] game.C_100034_gi.field_104027_f
		// @003: iconst_0
		// @004: getstatic java.util.Random game.C_100067_vd.field_104322_k
		// @007: invokevirtual java.util.Random.nextInt()int
		// @00A: iastore
		// @00B: getstatic int[] game.C_100034_gi.field_104027_f
		// @00E: iconst_1
		// @00F: getstatic java.util.Random game.C_100067_vd.field_104322_k
		// @012: invokevirtual java.util.Random.nextInt()int
		// @015: iastore
		// @016: getstatic int[] game.C_100034_gi.field_104027_f
		// @019: iconst_3
		// @01A: getstatic long game.C_100295_kh.field_105305_q
		// @01D: l2i
		// @01E: iastore
		// @01F: iload_1
		// @020: ldc 79790160 (0x4c18050)
		// @022: if_icmpeq @026
		// @025: return
		// @026: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @029: iconst_0
		// @02A: putfield int game.C_100280_nf.field_101177_n
		// @02D: getstatic int[] game.C_100034_gi.field_104027_f
		// @030: iconst_2
		// @031: getstatic long game.C_100295_kh.field_105305_q
		// @034: ldc 1745569632 (0x680b4760)
		// @036: lshr
		// @037: l2i
		// @038: iastore
		// @039: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @03C: getstatic int[] game.C_100034_gi.field_104027_f
		// @03F: iconst_0
		// @040: iaload
		// @041: bipush -128 (0x80)
		// @043: invokevirtual game.C_100280_nf.func_101154_d(int, int)void
		// @046: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @049: getstatic int[] game.C_100034_gi.field_104027_f
		// @04C: iconst_1
		// @04D: iaload
		// @04E: bipush 26 (0x1A)
		// @050: invokevirtual game.C_100280_nf.func_101154_d(int, int)void
		// @053: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @056: getstatic int[] game.C_100034_gi.field_104027_f
		// @059: iconst_2
		// @05A: iaload
		// @05B: bipush -124 (0x84)
		// @05D: invokevirtual game.C_100280_nf.func_101154_d(int, int)void
		// @060: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @063: getstatic int[] game.C_100034_gi.field_104027_f
		// @066: iconst_3
		// @067: iaload
		// @068: bipush -127 (0x81)
		// @06A: invokevirtual game.C_100280_nf.func_101154_d(int, int)void
		// @06D: bipush 15 (0x0F)
		// @06F: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @072: invokestatic game.C_100009_fg.func_103643_a(int, game.C_100280_nf)void
		// @075: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @078: iload_2
		// @079: bipush 112 (0x70)
		// @07B: invokevirtual game.C_100280_nf.func_101141_d(int, byte)void
		// @07E: aload_3
		// @07F: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @082: bipush -75 (0xB5)
		// @084: invokevirtual game.C_100107_u.func_104763_a(game.C_100280_nf, int)void
		// @087: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @08A: iconst_0
		// @08B: putfield int game.C_100278_nd.field_101177_n
		// @08E: iload #4
		// @090: ifeq @0A8
		// @093: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @096: sipush 7838 (0x1E9E)
		// @099: bipush 18 (0x12)
		// @09B: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @09E: getstatic int game.SteelSentinels.field_105275_O
		// @0A1: ifeq @0B7
		// @0A4: goto @0A8
		// @0A7: athrow
		// @0A8: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @0AB: sipush 7838 (0x1E9E)
		// @0AE: bipush 16 (0x10)
		// @0B0: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @0B3: goto @0B7
		// @0B6: athrow
		// @0B7: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @0BA: dup
		// @0BB: getfield int game.C_100278_nd.field_101177_n
		// @0BE: iconst_2
		// @0BF: iadd
		// @0C0: putfield int game.C_100278_nd.field_101177_n
		// @0C3: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @0C6: getfield int game.C_100278_nd.field_101177_n
		// @0C9: istore #5
		// @0CB: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @0CE: getstatic int game.C_100341_jd.field_102654_bb
		// @0D1: bipush 54 (0x36)
		// @0D3: invokevirtual game.C_100278_nd.func_101154_d(int, int)void
		// @0D6: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @0D9: iconst_0
		// @0DA: getstatic long game.C_100034_gi.field_104038_h
		// @0DD: invokevirtual game.C_100278_nd.func_101131_a(int, long)void
		// @0E0: iconst_0
		// @0E1: istore #6
		// @0E3: getstatic boolean game.C_100287_nm.field_106832_h
		// @0E6: ifne @0ED
		// @0E9: goto @0F3
		// @0EC: athrow
		// @0ED: iload #6
		// @0EF: iconst_1
		// @0F0: ior
		// @0F1: istore #6
		// @0F3: getstatic boolean game.C_100225_ah.field_106131_k
		// @0F6: ifeq @0FF
		// @0F9: iload #6
		// @0FB: iconst_4
		// @0FC: ior
		// @0FD: istore #6
		// @0FF: iload_0
		// @100: ifeq @10A
		// @103: iload #6
		// @105: bipush 8 (0x08)
		// @107: ior
		// @108: istore #6
		// @10A: getstatic java.lang.String game.C_100253_ph.field_101097_G
		// @10D: ifnonnull @114
		// @110: goto @11B
		// @113: athrow
		// @114: iload #6
		// @116: bipush 16 (0x10)
		// @118: ior
		// @119: istore #6
		// @11B: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @11E: sipush 7838 (0x1E9E)
		// @121: iload #6
		// @123: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @126: iconst_0
		// @127: invokestatic game.C_100206_qe.func_105938_b(boolean)java.applet.Applet
		// @12A: bipush 61 (0x3D)
		// @12C: invokestatic game.C_100253_ph.func_101084_a(java.applet.Applet, int)java.lang.String
		// @12F: astore #7
		// @131: aload #7
		// @133: ifnonnull @13A
		// @136: ldc ""
		// @138: astore #7
		// @13A: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @13D: sipush -28365 (0x9133)
		// @140: aload #7
		// @142: invokevirtual game.C_100278_nd.func_101167_a(int, java.lang.String)void
		// @145: getstatic java.lang.String game.C_100253_ph.field_101097_G
		// @148: ifnonnull @14F
		// @14B: goto @15A
		// @14E: athrow
		// @14F: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @152: getstatic java.lang.String game.C_100253_ph.field_101097_G
		// @155: bipush -59 (0xC5)
		// @157: invokevirtual game.C_100278_nd.func_101155_a(java.lang.String, byte)void
		// @15A: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @15D: getstatic java.math.BigInteger game.C_100287_nm.field_106831_k
		// @160: bipush -23 (0xE9)
		// @162: getstatic java.math.BigInteger game.C_100084_ug.field_104488_h
		// @165: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @168: invokestatic game.C_100255_pj.func_105219_a(game.C_100280_nf, java.math.BigInteger, int, java.math.BigInteger, game.C_100280_nf)void
		// @16B: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @16E: iload #5
		// @170: ineg
		// @171: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @174: getfield int game.C_100278_nd.field_101177_n
		// @177: iadd
		// @178: iconst_0
		// @179: invokevirtual game.C_100278_nd.func_101162_a(int, boolean)void
		// @17C: iconst_m1
		// @17D: bipush -81 (0xAF)
		// @17F: invokestatic game.C_100306_kn.func_107128_a(int, byte)void
		// @182: goto @1DF
		// @185: astore #5
		// @187: aload #5
		// @189: new java.lang.StringBuilder
		// @18C: dup
		// @18D: invokespecial java.lang.StringBuilder.<init>()void
		// @190: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @193: bipush 8 (0x08)
		// @195: aaload
		// @196: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @199: iload_0
		// @19A: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @19D: bipush 44 (0x2C)
		// @19F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1A2: iload_1
		// @1A3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1A6: bipush 44 (0x2C)
		// @1A8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1AB: iload_2
		// @1AC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1AF: bipush 44 (0x2C)
		// @1B1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1B4: aload_3
		// @1B5: ifnull @1C1
		// @1B8: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @1BB: iconst_0
		// @1BC: aaload
		// @1BD: goto @1C6
		// @1C0: athrow
		// @1C1: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @1C4: iconst_2
		// @1C5: aaload
		// @1C6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1C9: bipush 44 (0x2C)
		// @1CB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1CE: iload #4
		// @1D0: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @1D3: bipush 41 (0x29)
		// @1D5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D8: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1DB: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1DE: athrow
		// @1DF: return
	}
	
	static final void func_107275_a(int arg0, String arg1, boolean arg2, C_100211_qd arg3)
	{
		// @000: aconst_null
		// @001: iconst_m1
		// @002: lconst_0
		// @003: bipush -118 (0x8A)
		// @005: aload_3
		// @006: iconst_1
		// @007: invokevirtual game.C_100211_qd.func_102127_b(boolean)int
		// @00A: aconst_null
		// @00B: aconst_null
		// @00C: aload_3
		// @00D: getstatic game.C_100115_ej game.C_100156_sk.field_105389_r
		// @010: invokestatic game.C_100096_un.func_104559_a(java.lang.String, int, long, int, int, int[], java.lang.String, game.C_100302_ka, game.C_100115_ej)void
		// @013: aload_3
		// @014: getfield boolean game.C_100211_qd.field_102173_Ic
		// @017: ifeq @05D
		// @01A: bipush -3 (0xFD)
		// @01C: aload_3
		// @01D: getfield int game.C_100211_qd.field_102133_Fc
		// @020: iconst_m1
		// @021: ixor
		// @022: if_icmpeq @037
		// @025: goto @029
		// @028: athrow
		// @029: bipush -3 (0xFD)
		// @02B: getstatic int game.C_100107_u.field_104770_g
		// @02E: iconst_m1
		// @02F: ixor
		// @030: if_icmplt @05D
		// @033: goto @037
		// @036: athrow
		// @037: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @03A: astore #4
		// @03C: sipush -30945 (0x871F)
		// @03F: iconst_1
		// @040: anewarray java.lang.String
		// @043: dup
		// @044: iconst_0
		// @045: aload_1
		// @046: aastore
		// @047: getstatic java.lang.String game.C_100044_vm.field_100942_v
		// @04A: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @04D: astore #5
		// @04F: aload #4
		// @051: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @054: bipush 103 (0x67)
		// @056: bipush 10 (0x0A)
		// @058: aload #5
		// @05A: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @05D: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @060: iconst_m1
		// @061: invokevirtual game.C_100022_hf.func_103888_c(int)void
		// @064: iload_2
		// @065: ifeq @0CA
		// @068: getstatic int game.C_100079_e.field_102668_Eb
		// @06B: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @06E: getfield int game.C_100022_hf.field_103895_d
		// @071: if_icmpeq @0A4
		// @074: goto @078
		// @077: athrow
		// @078: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @07B: astore #4
		// @07D: sipush -30945 (0x871F)
		// @080: iconst_1
		// @081: anewarray java.lang.String
		// @084: dup
		// @085: iconst_0
		// @086: aload_1
		// @087: aastore
		// @088: getstatic java.lang.String game.C_100256_pk.field_100477_s
		// @08B: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @08E: astore #5
		// @090: aload #4
		// @092: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @095: bipush 105 (0x69)
		// @097: bipush 15 (0x0F)
		// @099: aload #5
		// @09B: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @09E: getstatic int game.SteelSentinels.field_105275_O
		// @0A1: ifeq @0CA
		// @0A4: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @0A7: astore #4
		// @0A9: sipush -30945 (0x871F)
		// @0AC: iconst_1
		// @0AD: anewarray java.lang.String
		// @0B0: dup
		// @0B1: iconst_0
		// @0B2: aload_1
		// @0B3: aastore
		// @0B4: getstatic java.lang.String game.C_100018_wk.field_101536_P
		// @0B7: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0BA: astore #5
		// @0BC: aload #4
		// @0BE: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @0C1: bipush 108 (0x6C)
		// @0C3: bipush 16 (0x10)
		// @0C5: aload #5
		// @0C7: invokevirtual game.C_100270_mi.func_102250_a(int, int, java.lang.String)void
		// @0CA: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @0CD: astore #4
		// @0CF: getstatic int game.C_100340_je.field_102981_m
		// @0D2: istore #5
		// @0D4: iload_0
		// @0D5: iconst_3
		// @0D6: if_icmpgt @0E4
		// @0D9: aconst_null
		// @0DA: checkcast game.C_100214_al[]
		// @0DD: putstatic game.C_100214_al[] game.C_100330_ig.field_107287_b
		// @0E0: goto @0E4
		// @0E3: athrow
		// @0E4: getstatic int game.C_100125_tm.field_100745_p
		// @0E7: istore #6
		// @0E9: aload #4
		// @0EB: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @0EE: iload #5
		// @0F0: iload #6
		// @0F2: iconst_0
		// @0F3: bipush 103 (0x67)
		// @0F5: iconst_0
		// @0F6: invokevirtual game.C_100270_mi.func_102261_b(int, int, int, int, int)void
		// @0F9: goto @15C
		// @0FC: astore #4
		// @0FE: aload #4
		// @100: new java.lang.StringBuilder
		// @103: dup
		// @104: invokespecial java.lang.StringBuilder.<init>()void
		// @107: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @10A: iconst_1
		// @10B: aaload
		// @10C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @10F: iload_0
		// @110: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @113: bipush 44 (0x2C)
		// @115: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @118: aload_1
		// @119: ifnull @125
		// @11C: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @11F: iconst_0
		// @120: aaload
		// @121: goto @12A
		// @124: athrow
		// @125: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @128: iconst_2
		// @129: aaload
		// @12A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @12D: bipush 44 (0x2C)
		// @12F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @132: iload_2
		// @133: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @136: bipush 44 (0x2C)
		// @138: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13B: aload_3
		// @13C: ifnull @148
		// @13F: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @142: iconst_0
		// @143: aaload
		// @144: goto @14D
		// @147: athrow
		// @148: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @14B: iconst_2
		// @14C: aaload
		// @14D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @150: bipush 41 (0x29)
		// @152: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @155: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @158: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @15B: athrow
		// @15C: return
	}
	
	static final void func_107276_a(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #43
		// @005: iload #10
		// @007: iconst_m1
		// @008: ixor
		// @009: iconst_m1
		// @00A: if_icmpgt @018
		// @00D: iload_1
		// @00E: iconst_m1
		// @00F: ixor
		// @010: getstatic int game.C_100070_dn.field_104367_g
		// @013: iconst_m1
		// @014: ixor
		// @015: if_icmpgt @019
		// @018: return
		// @019: iconst_m1
		// @01A: iload #13
		// @01C: iconst_m1
		// @01D: ixor
		// @01E: if_icmpge @038
		// @021: iconst_0
		// @022: iload #11
		// @024: if_icmple @038
		// @027: goto @02B
		// @02A: athrow
		// @02B: iconst_m1
		// @02C: iload #15
		// @02E: iconst_m1
		// @02F: ixor
		// @030: if_icmpge @038
		// @033: goto @037
		// @036: athrow
		// @037: return
		// @038: getstatic int game.C_100070_dn.field_104372_a
		// @03B: iload #13
		// @03D: if_icmpgt @05D
		// @040: iload #11
		// @042: getstatic int game.C_100070_dn.field_104372_a
		// @045: if_icmplt @05D
		// @048: goto @04C
		// @04B: athrow
		// @04C: getstatic int game.C_100070_dn.field_104372_a
		// @04F: iconst_m1
		// @050: ixor
		// @051: iload #15
		// @053: iconst_m1
		// @054: ixor
		// @055: if_icmplt @05D
		// @058: goto @05C
		// @05B: athrow
		// @05C: return
		// @05D: bipush -40 (0xD8)
		// @05F: iload #6
		// @061: bipush 63 (0x3F)
		// @063: isub
		// @064: bipush 34 (0x22)
		// @066: idiv
		// @067: idiv
		// @068: istore #27
		// @06A: iload #10
		// @06C: iload_1
		// @06D: isub
		// @06E: istore #35
		// @070: iload #7
		// @072: iload_1
		// @073: if_icmpne @288
		// @076: iload #10
		// @078: iconst_m1
		// @079: ixor
		// @07A: iload_1
		// @07B: iconst_m1
		// @07C: ixor
		// @07D: if_icmpne @0C5
		// @080: goto @084
		// @083: athrow
		// @084: iload_3
		// @085: istore #21
		// @087: iload #5
		// @089: istore #25
		// @08B: iload #13
		// @08D: ldc 1650118128 (0x625acdf0)
		// @08F: ishl
		// @090: istore #17
		// @092: iload #8
		// @094: istore #31
		// @096: iload_2
		// @097: istore #22
		// @099: iconst_0
		// @09A: istore #20
		// @09C: iconst_0
		// @09D: istore #32
		// @09F: iconst_0
		// @0A0: istore #24
		// @0A2: iload #16
		// @0A4: istore #26
		// @0A6: iload #11
		// @0A8: ldc 1700736848 (0x655f2f50)
		// @0AA: ishl
		// @0AB: istore #18
		// @0AD: iload #14
		// @0AF: istore #30
		// @0B1: iconst_0
		// @0B2: istore #28
		// @0B4: iconst_0
		// @0B5: istore #23
		// @0B7: iconst_0
		// @0B8: istore #19
		// @0BA: iconst_0
		// @0BB: istore #29
		// @0BD: iconst_0
		// @0BE: istore #33
		// @0C0: iload #43
		// @0C2: ifeq @220
		// @0C5: iload #10
		// @0C7: iload #7
		// @0C9: isub
		// @0CA: istore #36
		// @0CC: iload #11
		// @0CE: iconst_m1
		// @0CF: ixor
		// @0D0: iload #13
		// @0D2: iconst_m1
		// @0D3: ixor
		// @0D4: if_icmplt @17F
		// @0D7: iload #5
		// @0D9: ldc 292223056 (0x116af850)
		// @0DB: ishl
		// @0DC: istore #26
		// @0DE: iload #9
		// @0E0: iload #16
		// @0E2: ineg
		// @0E3: iadd
		// @0E4: ldc 1150050384 (0x448c6050)
		// @0E6: ishl
		// @0E7: iload #36
		// @0E9: idiv
		// @0EA: istore #28
		// @0EC: iload #4
		// @0EE: iload #8
		// @0F0: ineg
		// @0F1: iadd
		// @0F2: ldc 73431184 (0x4607890)
		// @0F4: ishl
		// @0F5: iload #36
		// @0F7: idiv
		// @0F8: istore #32
		// @0FA: iload_3
		// @0FB: ldc 685803632 (0x28e08870)
		// @0FD: ishl
		// @0FE: istore #22
		// @100: iload #16
		// @102: ldc 1290412464 (0x4cea21b0)
		// @104: ishl
		// @105: istore #25
		// @107: iload #12
		// @109: iload_2
		// @10A: ineg
		// @10B: iadd
		// @10C: ldc 411735632 (0x188a9650)
		// @10E: ishl
		// @10F: iload #36
		// @111: idiv
		// @112: istore #23
		// @114: iload #14
		// @116: ineg
		// @117: iload #4
		// @119: iadd
		// @11A: ldc 92360624 (0x5814fb0)
		// @11C: ishl
		// @11D: iload #35
		// @11F: idiv
		// @120: istore #33
		// @122: iload #12
		// @124: iload_3
		// @125: isub
		// @126: ldc 1572140208 (0x5db4f4b0)
		// @128: ishl
		// @129: iload #35
		// @12B: idiv
		// @12C: istore #24
		// @12E: iload #11
		// @130: ineg
		// @131: iload #15
		// @133: iadd
		// @134: ldc -2081799984 (0x83ea40d0)
		// @136: ishl
		// @137: iload #36
		// @139: idiv
		// @13A: istore #19
		// @13C: iload #14
		// @13E: ldc 1978786928 (0x75f1e470)
		// @140: ishl
		// @141: istore #31
		// @143: iload_2
		// @144: ldc 1488692304 (0x58bba450)
		// @146: ishl
		// @147: istore #21
		// @149: iload #15
		// @14B: iload #13
		// @14D: ineg
		// @14E: iadd
		// @14F: ldc -1530464624 (0xa4c6f690)
		// @151: ishl
		// @152: iload #35
		// @154: idiv
		// @155: istore #20
		// @157: iload #11
		// @159: ldc 1178702352 (0x46419210)
		// @15B: ishl
		// @15C: istore #17
		// @15E: iload #13
		// @160: ldc 200574704 (0xbf486f0)
		// @162: ishl
		// @163: istore #18
		// @165: iload #8
		// @167: ldc 1955944592 (0x74955890)
		// @169: ishl
		// @16A: istore #30
		// @16C: iload #5
		// @16E: ineg
		// @16F: iload #9
		// @171: iadd
		// @172: ldc -2146853520 (0x80099d70)
		// @174: ishl
		// @175: iload #35
		// @177: idiv
		// @178: istore #29
		// @17A: iload #43
		// @17C: ifeq @220
		// @17F: iload #13
		// @181: ldc 433004624 (0x19cf2050)
		// @183: ishl
		// @184: istore #17
		// @186: iload #11
		// @188: ldc 620140688 (0x24f69890)
		// @18A: ishl
		// @18B: istore #18
		// @18D: iload #5
		// @18F: ldc 2050169744 (0x7a331b90)
		// @191: ishl
		// @192: istore #25
		// @194: iload #11
		// @196: ineg
		// @197: iload #15
		// @199: iadd
		// @19A: ldc -730804432 (0xd470cf30)
		// @19C: ishl
		// @19D: iload #36
		// @19F: idiv
		// @1A0: istore #20
		// @1A2: iload_2
		// @1A3: ldc -1914018960 (0x8dea6370)
		// @1A5: ishl
		// @1A6: istore #22
		// @1A8: iload #9
		// @1AA: iload #5
		// @1AC: ineg
		// @1AD: iadd
		// @1AE: ldc 79790160 (0x4c18050)
		// @1B0: ishl
		// @1B1: iload #35
		// @1B3: idiv
		// @1B4: istore #28
		// @1B6: iload #4
		// @1B8: iload #8
		// @1BA: isub
		// @1BB: ldc 1741916432 (0x67d38910)
		// @1BD: ishl
		// @1BE: iload #36
		// @1C0: idiv
		// @1C1: istore #33
		// @1C3: iload #12
		// @1C5: iload_3
		// @1C6: ineg
		// @1C7: iadd
		// @1C8: ldc 1196722096 (0x475487b0)
		// @1CA: ishl
		// @1CB: iload #35
		// @1CD: idiv
		// @1CE: istore #23
		// @1D0: iload #14
		// @1D2: ldc -372679952 (0xe9c95af0)
		// @1D4: ishl
		// @1D5: istore #30
		// @1D7: iload #8
		// @1D9: ldc -224069840 (0xf2a4f730)
		// @1DB: ishl
		// @1DC: istore #31
		// @1DE: iload #16
		// @1E0: ldc 1881043760 (0x701e7330)
		// @1E2: ishl
		// @1E3: istore #26
		// @1E5: iload #4
		// @1E7: iload #14
		// @1E9: isub
		// @1EA: ldc -1648205008 (0x9dc26330)
		// @1EC: ishl
		// @1ED: iload #35
		// @1EF: idiv
		// @1F0: istore #32
		// @1F2: iload #13
		// @1F4: ineg
		// @1F5: iload #15
		// @1F7: iadd
		// @1F8: ldc 976326640 (0x3a318ff0)
		// @1FA: ishl
		// @1FB: iload #35
		// @1FD: idiv
		// @1FE: istore #19
		// @200: iload #9
		// @202: iload #16
		// @204: isub
		// @205: ldc -1044484688 (0xc1be6db0)
		// @207: ishl
		// @208: iload #36
		// @20A: idiv
		// @20B: istore #29
		// @20D: iload_2
		// @20E: ineg
		// @20F: iload #12
		// @211: iadd
		// @212: ldc 1419003728 (0x54944750)
		// @214: ishl
		// @215: iload #36
		// @217: idiv
		// @218: istore #24
		// @21A: iload_3
		// @21B: ldc 1334068720 (0x4f8445f0)
		// @21D: ishl
		// @21E: istore #21
		// @220: iconst_m1
		// @221: iload_1
		// @222: iconst_m1
		// @223: ixor
		// @224: if_icmplt @22B
		// @227: goto @280
		// @22A: athrow
		// @22B: iload_1
		// @22C: ineg
		// @22D: iload #7
		// @22F: iload_1
		// @230: ineg
		// @231: iadd
		// @232: invokestatic java.lang.Math.min(int, int)int
		// @235: istore_1
		// @236: iload #18
		// @238: iload #20
		// @23A: iload_1
		// @23B: imul
		// @23C: iadd
		// @23D: istore #18
		// @23F: iload #31
		// @241: iload_1
		// @242: iload #33
		// @244: imul
		// @245: iadd
		// @246: istore #31
		// @248: iload #25
		// @24A: iload_1
		// @24B: iload #28
		// @24D: imul
		// @24E: iadd
		// @24F: istore #25
		// @251: iload #30
		// @253: iload_1
		// @254: iload #32
		// @256: imul
		// @257: iadd
		// @258: istore #30
		// @25A: iload #21
		// @25C: iload_1
		// @25D: iload #23
		// @25F: imul
		// @260: iadd
		// @261: istore #21
		// @263: iload #26
		// @265: iload #29
		// @267: iload_1
		// @268: imul
		// @269: iadd
		// @26A: istore #26
		// @26C: iload #22
		// @26E: iload_1
		// @26F: iload #24
		// @271: imul
		// @272: iadd
		// @273: istore #22
		// @275: iload #17
		// @277: iload_1
		// @278: iload #19
		// @27A: imul
		// @27B: iadd
		// @27C: istore #17
		// @27E: iconst_0
		// @27F: istore_1
		// @280: iconst_0
		// @281: istore #34
		// @283: iload #43
		// @285: ifeq @685
		// @288: iload #14
		// @28A: ldc 143544784 (0x88e51d0)
		// @28C: ishl
		// @28D: dup
		// @28E: istore #31
		// @290: istore #30
		// @292: iload_3
		// @293: ldc -1525151760 (0xa51807f0)
		// @295: ishl
		// @296: dup
		// @297: istore #22
		// @299: istore #21
		// @29B: iload #13
		// @29D: ldc 1881923856 (0x702be110)
		// @29F: ishl
		// @2A0: dup
		// @2A1: istore #18
		// @2A3: istore #17
		// @2A5: iload #5
		// @2A7: ldc 1177335536 (0x462cb6f0)
		// @2A9: ishl
		// @2AA: dup
		// @2AB: istore #26
		// @2AD: istore #25
		// @2AF: iload_1
		// @2B0: ineg
		// @2B1: iload #7
		// @2B3: iadd
		// @2B4: istore #36
		// @2B6: iload #13
		// @2B8: ineg
		// @2B9: iload #15
		// @2BB: iadd
		// @2BC: ldc 1304046384 (0x4dba2b30)
		// @2BE: ishl
		// @2BF: iload #35
		// @2C1: idiv
		// @2C2: istore #20
		// @2C4: iload #11
		// @2C6: iload #13
		// @2C8: isub
		// @2C9: ldc 1828994864 (0x6d043f30)
		// @2CB: ishl
		// @2CC: iload #36
		// @2CE: idiv
		// @2CF: istore #19
		// @2D1: iload #20
		// @2D3: iload #19
		// @2D5: if_icmple @330
		// @2D8: iload #14
		// @2DA: ineg
		// @2DB: iload #4
		// @2DD: iadd
		// @2DE: ldc 390409232 (0x17452c10)
		// @2E0: ishl
		// @2E1: iload #35
		// @2E3: idiv
		// @2E4: istore #33
		// @2E6: iload #12
		// @2E8: iload_3
		// @2E9: ineg
		// @2EA: iadd
		// @2EB: ldc -2114163600 (0x81fc6c70)
		// @2ED: ishl
		// @2EE: iload #35
		// @2F0: idiv
		// @2F1: istore #24
		// @2F3: iload_3
		// @2F4: ineg
		// @2F5: iload_2
		// @2F6: iadd
		// @2F7: ldc -572056464 (0xdde71c70)
		// @2F9: ishl
		// @2FA: iload #36
		// @2FC: idiv
		// @2FD: istore #23
		// @2FF: iconst_0
		// @300: istore #34
		// @302: iload #9
		// @304: iload #5
		// @306: ineg
		// @307: iadd
		// @308: ldc 1999500528 (0x772df4f0)
		// @30A: ishl
		// @30B: iload #35
		// @30D: idiv
		// @30E: istore #29
		// @310: iload #14
		// @312: ineg
		// @313: iload #8
		// @315: iadd
		// @316: ldc -464051024 (0xe45724b0)
		// @318: ishl
		// @319: iload #36
		// @31B: idiv
		// @31C: istore #32
		// @31E: iload #16
		// @320: iload #5
		// @322: isub
		// @323: ldc -1849467696 (0x91c35cd0)
		// @325: ishl
		// @326: iload #36
		// @328: idiv
		// @329: istore #28
		// @32B: iload #43
		// @32D: ifeq @38E
		// @330: iload #16
		// @332: iload #5
		// @334: ineg
		// @335: iadd
		// @336: ldc -1094468112 (0xbec3bdf0)
		// @338: ishl
		// @339: iload #36
		// @33B: idiv
		// @33C: istore #29
		// @33E: iload #12
		// @340: iload_3
		// @341: isub
		// @342: ldc -581224112 (0xdd5b3950)
		// @344: ishl
		// @345: iload #35
		// @347: idiv
		// @348: istore #23
		// @34A: iload_3
		// @34B: ineg
		// @34C: iload_2
		// @34D: iadd
		// @34E: ldc 718078512 (0x2acd0230)
		// @350: ishl
		// @351: iload #36
		// @353: idiv
		// @354: istore #24
		// @356: iload #19
		// @358: istore #37
		// @35A: iload #20
		// @35C: istore #19
		// @35E: iload #37
		// @360: istore #20
		// @362: iconst_1
		// @363: istore #34
		// @365: iload #4
		// @367: iload #14
		// @369: ineg
		// @36A: iadd
		// @36B: ldc -1185874032 (0xb950ff90)
		// @36D: ishl
		// @36E: iload #35
		// @370: idiv
		// @371: istore #32
		// @373: iload #5
		// @375: ineg
		// @376: iload #9
		// @378: iadd
		// @379: ldc -1198081296 (0xb896baf0)
		// @37B: ishl
		// @37C: iload #35
		// @37E: idiv
		// @37F: istore #28
		// @381: iload #8
		// @383: iload #14
		// @385: isub
		// @386: ldc -567637648 (0xde2a8970)
		// @388: ishl
		// @389: iload #36
		// @38B: idiv
		// @38C: istore #33
		// @38E: iconst_0
		// @38F: iload_1
		// @390: if_icmpgt @397
		// @393: goto @440
		// @396: athrow
		// @397: iconst_0
		// @398: iload #7
		// @39A: if_icmple @3F3
		// @39D: iload_1
		// @39E: ineg
		// @39F: iload #7
		// @3A1: iadd
		// @3A2: istore_1
		// @3A3: iload #30
		// @3A5: iload #32
		// @3A7: iload_1
		// @3A8: imul
		// @3A9: iadd
		// @3AA: istore #30
		// @3AC: iload #21
		// @3AE: iload_1
		// @3AF: iload #23
		// @3B1: imul
		// @3B2: iadd
		// @3B3: istore #21
		// @3B5: iload #25
		// @3B7: iload_1
		// @3B8: iload #28
		// @3BA: imul
		// @3BB: iadd
		// @3BC: istore #25
		// @3BE: iload #31
		// @3C0: iload #33
		// @3C2: iload_1
		// @3C3: imul
		// @3C4: iadd
		// @3C5: istore #31
		// @3C7: iload #18
		// @3C9: iload_1
		// @3CA: iload #20
		// @3CC: imul
		// @3CD: iadd
		// @3CE: istore #18
		// @3D0: iload #22
		// @3D2: iload #24
		// @3D4: iload_1
		// @3D5: imul
		// @3D6: iadd
		// @3D7: istore #22
		// @3D9: iload #17
		// @3DB: iload #19
		// @3DD: iload_1
		// @3DE: imul
		// @3DF: iadd
		// @3E0: istore #17
		// @3E2: iload #26
		// @3E4: iload #29
		// @3E6: iload_1
		// @3E7: imul
		// @3E8: iadd
		// @3E9: istore #26
		// @3EB: iload #7
		// @3ED: istore_1
		// @3EE: iload #43
		// @3F0: ifeq @5A7
		// @3F3: iload_1
		// @3F4: ineg
		// @3F5: istore_1
		// @3F6: iload #17
		// @3F8: iload_1
		// @3F9: iload #19
		// @3FB: imul
		// @3FC: iadd
		// @3FD: istore #17
		// @3FF: iload #26
		// @401: iload #29
		// @403: iload_1
		// @404: imul
		// @405: iadd
		// @406: istore #26
		// @408: iload #25
		// @40A: iload #28
		// @40C: iload_1
		// @40D: imul
		// @40E: iadd
		// @40F: istore #25
		// @411: iload #18
		// @413: iload #20
		// @415: iload_1
		// @416: imul
		// @417: iadd
		// @418: istore #18
		// @41A: iload #30
		// @41C: iload_1
		// @41D: iload #32
		// @41F: imul
		// @420: iadd
		// @421: istore #30
		// @423: iload #22
		// @425: iload #24
		// @427: iload_1
		// @428: imul
		// @429: iadd
		// @42A: istore #22
		// @42C: iload #21
		// @42E: iload #23
		// @430: iload_1
		// @431: imul
		// @432: iadd
		// @433: istore #21
		// @435: iload #31
		// @437: iload #33
		// @439: iload_1
		// @43A: imul
		// @43B: iadd
		// @43C: istore #31
		// @43E: iconst_0
		// @43F: istore_1
		// @440: getstatic int[] game.C_100070_dn.field_104374_i
		// @443: iload_1
		// @444: iaload
		// @445: istore #37
		// @447: iload #7
		// @449: iconst_m1
		// @44A: ixor
		// @44B: iload_1
		// @44C: iconst_m1
		// @44D: ixor
		// @44E: if_icmpge @5A7
		// @451: iload #17
		// @453: ldc 1487895984 (0x58af7db0)
		// @455: ishr
		// @456: istore #38
		// @458: iload #38
		// @45A: iconst_m1
		// @45B: ixor
		// @45C: getstatic int game.C_100070_dn.field_104372_a
		// @45F: iconst_m1
		// @460: ixor
		// @461: iload #43
		// @463: ifne @5B3
		// @466: if_icmple @557
		// @469: goto @46D
		// @46C: athrow
		// @46D: iload #18
		// @46F: ldc -1844951536 (0x92084610)
		// @471: ishr
		// @472: iload #17
		// @474: ldc -311833360 (0xed69ccf0)
		// @476: ishr
		// @477: ineg
		// @478: iadd
		// @479: istore #39
		// @47B: iconst_0
		// @47C: iload #39
		// @47E: if_icmpeq @520
		// @481: iload #21
		// @483: ineg
		// @484: iload #22
		// @486: iadd
		// @487: iload #39
		// @489: idiv
		// @48A: istore #40
		// @48C: iload #26
		// @48E: iload #25
		// @490: isub
		// @491: iload #39
		// @493: idiv
		// @494: istore #41
		// @496: iload #31
		// @498: iload #30
		// @49A: isub
		// @49B: iload #39
		// @49D: idiv
		// @49E: istore #42
		// @4A0: getstatic int game.C_100070_dn.field_104372_a
		// @4A3: iconst_m1
		// @4A4: ixor
		// @4A5: iload #38
		// @4A7: iload #39
		// @4A9: ineg
		// @4AA: isub
		// @4AB: iconst_m1
		// @4AC: ixor
		// @4AD: if_icmpge @4B4
		// @4B0: goto @4BF
		// @4B3: athrow
		// @4B4: iload #38
		// @4B6: ineg
		// @4B7: getstatic int game.C_100070_dn.field_104372_a
		// @4BA: iadd
		// @4BB: iconst_m1
		// @4BC: iadd
		// @4BD: istore #39
		// @4BF: iconst_m1
		// @4C0: iload #38
		// @4C2: iconst_m1
		// @4C3: ixor
		// @4C4: if_icmplt @4E9
		// @4C7: iload #41
		// @4C9: aload_0
		// @4CA: ldc -1266953279 (0xb47bd3c1)
		// @4CC: iload #42
		// @4CE: iload #38
		// @4D0: iload #37
		// @4D2: iadd
		// @4D3: iload #39
		// @4D5: iload #25
		// @4D7: iload #30
		// @4D9: iload #21
		// @4DB: iload #40
		// @4DD: invokestatic game.C_100066_dl.func_101627_a(int, int[], int, int, int, int, int, int, int, int)void
		// @4E0: iload #43
		// @4E2: ifeq @51B
		// @4E5: goto @4E9
		// @4E8: athrow
		// @4E9: iload #41
		// @4EB: aload_0
		// @4EC: ldc -1266953279 (0xb47bd3c1)
		// @4EE: iload #42
		// @4F0: iload #37
		// @4F2: iload #39
		// @4F4: iload #38
		// @4F6: ineg
		// @4F7: isub
		// @4F8: iload #25
		// @4FA: iload #38
		// @4FC: iload #41
		// @4FE: imul
		// @4FF: isub
		// @500: iload #30
		// @502: iload #42
		// @504: iload #38
		// @506: imul
		// @507: ineg
		// @508: iadd
		// @509: iload #40
		// @50B: iload #38
		// @50D: imul
		// @50E: ineg
		// @50F: iload #21
		// @511: iadd
		// @512: iload #40
		// @514: invokestatic game.C_100066_dl.func_101627_a(int, int[], int, int, int, int, int, int, int, int)void
		// @517: goto @51B
		// @51A: athrow
		// @51B: iload #43
		// @51D: ifeq @557
		// @520: iload #38
		// @522: iconst_m1
		// @523: ixor
		// @524: iconst_m1
		// @525: if_icmpgt @557
		// @528: goto @52C
		// @52B: athrow
		// @52C: getstatic int game.C_100070_dn.field_104372_a
		// @52F: iconst_m1
		// @530: ixor
		// @531: iload #38
		// @533: iconst_m1
		// @534: ixor
		// @535: if_icmplt @540
		// @538: goto @53C
		// @53B: athrow
		// @53C: goto @557
		// @53F: athrow
		// @540: iconst_0
		// @541: aload_0
		// @542: ldc -1266953279 (0xb47bd3c1)
		// @544: iconst_0
		// @545: iload #38
		// @547: iload #37
		// @549: ineg
		// @54A: isub
		// @54B: iload #39
		// @54D: iload #25
		// @54F: iload #30
		// @551: iload #21
		// @553: iconst_0
		// @554: invokestatic game.C_100066_dl.func_101627_a(int, int[], int, int, int, int, int, int, int, int)void
		// @557: iinc #1 +1
		// @55A: iload_1
		// @55B: getstatic int game.C_100070_dn.field_104367_g
		// @55E: if_icmplt @562
		// @561: return
		// @562: iload #18
		// @564: iload #20
		// @566: iadd
		// @567: istore #18
		// @569: iload #37
		// @56B: getstatic int game.C_100196_rb.field_105819_e
		// @56E: iadd
		// @56F: istore #37
		// @571: iload #31
		// @573: iload #33
		// @575: iadd
		// @576: istore #31
		// @578: iload #26
		// @57A: iload #29
		// @57C: iadd
		// @57D: istore #26
		// @57F: iload #21
		// @581: iload #23
		// @583: iadd
		// @584: istore #21
		// @586: iload #17
		// @588: iload #19
		// @58A: iadd
		// @58B: istore #17
		// @58D: iload #30
		// @58F: iload #32
		// @591: iadd
		// @592: istore #30
		// @594: iload #22
		// @596: iload #24
		// @598: iadd
		// @599: istore #22
		// @59B: iload #25
		// @59D: iload #28
		// @59F: iadd
		// @5A0: istore #25
		// @5A2: iload #43
		// @5A4: ifeq @447
		// @5A7: iload #10
		// @5A9: iload #7
		// @5AB: isub
		// @5AC: istore #37
		// @5AE: iload #37
		// @5B0: iconst_m1
		// @5B1: ixor
		// @5B2: iconst_m1
		// @5B3: if_icmpeq @66D
		// @5B6: iload #15
		// @5B8: ldc -2034224240 (0x86c03390)
		// @5BA: ishl
		// @5BB: istore #38
		// @5BD: iload #12
		// @5BF: ldc 1859597072 (0x6ed73310)
		// @5C1: ishl
		// @5C2: istore #39
		// @5C4: iload #9
		// @5C6: ldc -937441040 (0xc81fc8f0)
		// @5C8: ishl
		// @5C9: istore #40
		// @5CB: iload #34
		// @5CD: ifne @5F0
		// @5D0: iload_2
		// @5D1: ldc -1008163088 (0xc3e8a6f0)
		// @5D3: ishl
		// @5D4: istore #21
		// @5D6: iload #8
		// @5D8: ldc 1419213040 (0x549778f0)
		// @5DA: ishl
		// @5DB: istore #30
		// @5DD: iload #16
		// @5DF: ldc 2112000336 (0x7de29150)
		// @5E1: ishl
		// @5E2: istore #25
		// @5E4: iload #11
		// @5E6: ldc -1282678608 (0xb38be0b0)
		// @5E8: ishl
		// @5E9: istore #17
		// @5EB: iload #43
		// @5ED: ifeq @60B
		// @5F0: iload #16
		// @5F2: ldc 1425592816 (0x54f8d1f0)
		// @5F4: ishl
		// @5F5: istore #26
		// @5F7: iload_2
		// @5F8: ldc -1814949744 (0x93d21090)
		// @5FA: ishl
		// @5FB: istore #22
		// @5FD: iload #11
		// @5FF: ldc -68351856 (0xfbed0890)
		// @601: ishl
		// @602: istore #18
		// @604: iload #8
		// @606: ldc -1743485872 (0x98148450)
		// @608: ishl
		// @609: istore #31
		// @60B: iload #4
		// @60D: ldc 168117264 (0xa054410)
		// @60F: ishl
		// @610: istore #41
		// @612: iload #40
		// @614: iload #25
		// @616: ineg
		// @617: iadd
		// @618: iload #37
		// @61A: idiv
		// @61B: istore #28
		// @61D: iload #39
		// @61F: iload #21
		// @621: isub
		// @622: iload #37
		// @624: idiv
		// @625: istore #23
		// @627: iload #22
		// @629: ineg
		// @62A: iload #39
		// @62C: iadd
		// @62D: iload #37
		// @62F: idiv
		// @630: istore #24
		// @632: iload #41
		// @634: iload #31
		// @636: ineg
		// @637: iadd
		// @638: iload #37
		// @63A: idiv
		// @63B: istore #33
		// @63D: iload #17
		// @63F: ineg
		// @640: iload #38
		// @642: iadd
		// @643: iload #37
		// @645: idiv
		// @646: istore #19
		// @648: iload #40
		// @64A: iload #26
		// @64C: isub
		// @64D: iload #37
		// @64F: idiv
		// @650: istore #29
		// @652: iload #30
		// @654: ineg
		// @655: iload #41
		// @657: iadd
		// @658: iload #37
		// @65A: idiv
		// @65B: istore #32
		// @65D: iload #18
		// @65F: ineg
		// @660: iload #38
		// @662: iadd
		// @663: iload #37
		// @665: idiv
		// @666: istore #20
		// @668: iload #43
		// @66A: ifeq @685
		// @66D: iconst_0
		// @66E: istore #24
		// @670: iconst_0
		// @671: istore #28
		// @673: iconst_0
		// @674: istore #19
		// @676: iconst_0
		// @677: istore #29
		// @679: iconst_0
		// @67A: istore #33
		// @67C: iconst_0
		// @67D: istore #23
		// @67F: iconst_0
		// @680: istore #20
		// @682: iconst_0
		// @683: istore #32
		// @685: iload_1
		// @686: ifge @6D6
		// @689: iload_1
		// @68A: ineg
		// @68B: istore_1
		// @68C: iload #21
		// @68E: iload_1
		// @68F: iload #23
		// @691: imul
		// @692: iadd
		// @693: istore #21
		// @695: iload #22
		// @697: iload #24
		// @699: iload_1
		// @69A: imul
		// @69B: iadd
		// @69C: istore #22
		// @69E: iload #17
		// @6A0: iload_1
		// @6A1: iload #19
		// @6A3: imul
		// @6A4: iadd
		// @6A5: istore #17
		// @6A7: iload #30
		// @6A9: iload_1
		// @6AA: iload #32
		// @6AC: imul
		// @6AD: iadd
		// @6AE: istore #30
		// @6B0: iload #31
		// @6B2: iload #33
		// @6B4: iload_1
		// @6B5: imul
		// @6B6: iadd
		// @6B7: istore #31
		// @6B9: iload #26
		// @6BB: iload_1
		// @6BC: iload #29
		// @6BE: imul
		// @6BF: iadd
		// @6C0: istore #26
		// @6C2: iload #18
		// @6C4: iload #20
		// @6C6: iload_1
		// @6C7: imul
		// @6C8: iadd
		// @6C9: istore #18
		// @6CB: iload #25
		// @6CD: iload_1
		// @6CE: iload #28
		// @6D0: imul
		// @6D1: iadd
		// @6D2: istore #25
		// @6D4: iconst_0
		// @6D5: istore_1
		// @6D6: getstatic int[] game.C_100070_dn.field_104374_i
		// @6D9: iload_1
		// @6DA: iaload
		// @6DB: istore #36
		// @6DD: iload_1
		// @6DE: iconst_m1
		// @6DF: ixor
		// @6E0: iload #10
		// @6E2: iconst_m1
		// @6E3: ixor
		// @6E4: if_icmple @83E
		// @6E7: iload #17
		// @6E9: ldc 1175042160 (0x4609b870)
		// @6EB: ishr
		// @6EC: istore #37
		// @6EE: iload #43
		// @6F0: ifne @912
		// @6F3: getstatic int game.C_100070_dn.field_104372_a
		// @6F6: iconst_m1
		// @6F7: ixor
		// @6F8: iload #37
		// @6FA: iconst_m1
		// @6FB: ixor
		// @6FC: if_icmplt @707
		// @6FF: goto @703
		// @702: athrow
		// @703: goto @7EA
		// @706: athrow
		// @707: iload #17
		// @709: ldc -612051248 (0xdb84d6d0)
		// @70B: ishr
		// @70C: ineg
		// @70D: iload #18
		// @70F: ldc 288519792 (0x11327670)
		// @711: ishr
		// @712: iadd
		// @713: istore #38
		// @715: iconst_m1
		// @716: iload #38
		// @718: iconst_m1
		// @719: ixor
		// @71A: if_icmpne @752
		// @71D: iconst_0
		// @71E: iload #37
		// @720: if_icmpgt @7EA
		// @723: goto @727
		// @726: athrow
		// @727: getstatic int game.C_100070_dn.field_104372_a
		// @72A: iload #37
		// @72C: if_icmple @7EA
		// @72F: goto @733
		// @732: athrow
		// @733: iconst_0
		// @734: aload_0
		// @735: ldc -1266953279 (0xb47bd3c1)
		// @737: iconst_0
		// @738: iload #37
		// @73A: iload #36
		// @73C: iadd
		// @73D: iload #38
		// @73F: iload #25
		// @741: iload #30
		// @743: iload #21
		// @745: iconst_0
		// @746: invokestatic game.C_100066_dl.func_101627_a(int, int[], int, int, int, int, int, int, int, int)void
		// @749: iload #43
		// @74B: ifeq @7EA
		// @74E: goto @752
		// @751: athrow
		// @752: iload #22
		// @754: iload #21
		// @756: isub
		// @757: iload #38
		// @759: idiv
		// @75A: istore #39
		// @75C: iload #25
		// @75E: ineg
		// @75F: iload #26
		// @761: iadd
		// @762: iload #38
		// @764: idiv
		// @765: istore #40
		// @767: iload #30
		// @769: ineg
		// @76A: iload #31
		// @76C: iadd
		// @76D: iload #38
		// @76F: idiv
		// @770: istore #41
		// @772: iload #37
		// @774: iload #38
		// @776: iadd
		// @777: iconst_m1
		// @778: ixor
		// @779: getstatic int game.C_100070_dn.field_104372_a
		// @77C: iconst_m1
		// @77D: ixor
		// @77E: if_icmple @785
		// @781: goto @790
		// @784: athrow
		// @785: iconst_m1
		// @786: iload #37
		// @788: ineg
		// @789: iadd
		// @78A: getstatic int game.C_100070_dn.field_104372_a
		// @78D: iadd
		// @78E: istore #38
		// @790: iconst_0
		// @791: iload #37
		// @793: if_icmple @7CC
		// @796: iload #40
		// @798: aload_0
		// @799: ldc -1266953279 (0xb47bd3c1)
		// @79B: iload #41
		// @79D: iload #36
		// @79F: iload #38
		// @7A1: iload #37
		// @7A3: iadd
		// @7A4: iload #25
		// @7A6: iload #37
		// @7A8: iload #40
		// @7AA: imul
		// @7AB: ineg
		// @7AC: iadd
		// @7AD: iload #30
		// @7AF: iload #37
		// @7B1: iload #41
		// @7B3: imul
		// @7B4: ineg
		// @7B5: iadd
		// @7B6: iload #21
		// @7B8: iload #37
		// @7BA: iload #39
		// @7BC: imul
		// @7BD: isub
		// @7BE: iload #39
		// @7C0: invokestatic game.C_100066_dl.func_101627_a(int, int[], int, int, int, int, int, int, int, int)void
		// @7C3: iload #43
		// @7C5: ifeq @7EA
		// @7C8: goto @7CC
		// @7CB: athrow
		// @7CC: iload #40
		// @7CE: aload_0
		// @7CF: ldc -1266953279 (0xb47bd3c1)
		// @7D1: iload #41
		// @7D3: iload #37
		// @7D5: iload #36
		// @7D7: ineg
		// @7D8: isub
		// @7D9: iload #38
		// @7DB: iload #25
		// @7DD: iload #30
		// @7DF: iload #21
		// @7E1: iload #39
		// @7E3: invokestatic game.C_100066_dl.func_101627_a(int, int[], int, int, int, int, int, int, int, int)void
		// @7E6: goto @7EA
		// @7E9: athrow
		// @7EA: getstatic int game.C_100070_dn.field_104367_g
		// @7ED: iinc #1 +1
		// @7F0: iload_1
		// @7F1: if_icmple @7F8
		// @7F4: goto @7F9
		// @7F7: athrow
		// @7F8: return
		// @7F9: iload #18
		// @7FB: iload #20
		// @7FD: iadd
		// @7FE: istore #18
		// @800: iload #17
		// @802: iload #19
		// @804: iadd
		// @805: istore #17
		// @807: iload #25
		// @809: iload #28
		// @80B: iadd
		// @80C: istore #25
		// @80E: iload #31
		// @810: iload #33
		// @812: iadd
		// @813: istore #31
		// @815: iload #26
		// @817: iload #29
		// @819: iadd
		// @81A: istore #26
		// @81C: iload #21
		// @81E: iload #23
		// @820: iadd
		// @821: istore #21
		// @823: iload #36
		// @825: getstatic int game.C_100196_rb.field_105819_e
		// @828: iadd
		// @829: istore #36
		// @82B: iload #22
		// @82D: iload #24
		// @82F: iadd
		// @830: istore #22
		// @832: iload #30
		// @834: iload #32
		// @836: iadd
		// @837: istore #30
		// @839: iload #43
		// @83B: ifeq @6DD
		// @83E: goto @912
		// @841: astore #17
		// @843: aload #17
		// @845: new java.lang.StringBuilder
		// @848: dup
		// @849: invokespecial java.lang.StringBuilder.<init>()void
		// @84C: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @84F: iconst_3
		// @850: aaload
		// @851: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @854: aload_0
		// @855: ifnull @861
		// @858: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @85B: iconst_0
		// @85C: aaload
		// @85D: goto @866
		// @860: athrow
		// @861: getstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @864: iconst_2
		// @865: aaload
		// @866: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @869: bipush 44 (0x2C)
		// @86B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @86E: iload_1
		// @86F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @872: bipush 44 (0x2C)
		// @874: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @877: iload_2
		// @878: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @87B: bipush 44 (0x2C)
		// @87D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @880: iload_3
		// @881: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @884: bipush 44 (0x2C)
		// @886: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @889: iload #4
		// @88B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @88E: bipush 44 (0x2C)
		// @890: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @893: iload #5
		// @895: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @898: bipush 44 (0x2C)
		// @89A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @89D: iload #6
		// @89F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8A2: bipush 44 (0x2C)
		// @8A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8A7: iload #7
		// @8A9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8AC: bipush 44 (0x2C)
		// @8AE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B1: iload #8
		// @8B3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8B6: bipush 44 (0x2C)
		// @8B8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8BB: iload #9
		// @8BD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8C0: bipush 44 (0x2C)
		// @8C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8C5: iload #10
		// @8C7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8CA: bipush 44 (0x2C)
		// @8CC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8CF: iload #11
		// @8D1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8D4: bipush 44 (0x2C)
		// @8D6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8D9: iload #12
		// @8DB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8DE: bipush 44 (0x2C)
		// @8E0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8E3: iload #13
		// @8E5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8E8: bipush 44 (0x2C)
		// @8EA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8ED: iload #14
		// @8EF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8F2: bipush 44 (0x2C)
		// @8F4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8F7: iload #15
		// @8F9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8FC: bipush 44 (0x2C)
		// @8FE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @901: iload #16
		// @903: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @906: bipush 41 (0x29)
		// @908: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @90B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @90E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @911: athrow
		// @912: return
	}
	
	static
	{
		// @000: bipush 9 (0x09)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "V)\u001fO\u0016"
		// @009: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "D`\u001f'C"
		// @014: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @017: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "Cr]\r"
		// @01F: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @022: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "D`\u001f&C"
		// @02A: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "D`\u001f$C"
		// @035: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @038: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "D`\u001f#C"
		// @040: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @043: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "D`\u001f C"
		// @04C: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "D`\u001f\"C"
		// @058: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "D`\u001f%C"
		// @064: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @067: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @06A: aastore
		// @06B: putstatic java.lang.String[] game.C_100330_ig.field_107290_z
		// @06E: sipush 500 (0x01F4)
		// @071: putstatic int game.C_100330_ig.field_107291_h
		// @074: iconst_3
		// @075: anewarray java.lang.String
		// @078: dup
		// @079: iconst_0
		// @07A: ldc "`hC\u0004K^b_\u0015\u0002Cb]\u0012KLiUA\u001cHfA\u000e\u0005^"
		// @07C: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: iconst_1
		// @085: ldc "`hC\u0004KOfE\u0015\u0007HaX\u0004\u0007It"
		// @087: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @08A: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @08D: aastore
		// @08E: dup
		// @08F: iconst_2
		// @090: ldc "`hC\u0004K@nB\u0012\u0002BiB"
		// @092: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @095: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @098: aastore
		// @099: putstatic java.lang.String[] game.C_100330_ig.field_107292_i
		// @09C: ldc "h\u007fA\r\u0004DsX\u000f\u000c\rf\u0011\u0003\u001eJ"
		// @09E: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @0A1: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @0A4: putstatic java.lang.String game.C_100330_ig.field_107289_a
		// @0A7: iconst_3
		// @0A8: newarray byte[]
		// @0AA: dup
		// @0AB: iconst_0
		// @0AC: iconst_1
		// @0AD: bastore
		// @0AE: dup
		// @0AF: iconst_1
		// @0B0: iconst_0
		// @0B1: bastore
		// @0B2: dup
		// @0B3: iconst_2
		// @0B4: iconst_0
		// @0B5: bastore
		// @0B6: putstatic byte[] game.C_100330_ig.field_107283_f
		// @0B9: bipush 105 (0x69)
		// @0BB: anewarray game.C_100214_al
		// @0BE: putstatic game.C_100214_al[] game.C_100330_ig.field_107287_b
		// @0C1: bipush 17 (0x11)
		// @0C3: anewarray java.lang.String
		// @0C6: dup
		// @0C7: iconst_0
		// @0C8: ldc "zb]\u0002\u0004@b\u0011\u0015\u0004\rtT\u000f\u001fDiT\rKNh_\u0007\u0002JrC\u0000\u001fDh_OKebC\u0004KThDA\u0008Li\u0011\u0012\u000eAbR\u0015KLiUA\u0008XtE\u000e\u0006DtTA\u001fEb\u0011\u0005\u000e^nV\u000fKBa\u0011\u0015\u0003H'B\u0004\u0005Yn_\u0004\u0007\rsY\u0000\u001f\r~^\u0014KZn]\rKYfZ\u0004KBrEA\u0002C'\\\u0014\u0007YnA\r\nTbCA\u0008BjA\u0004\u001fDsX\u000e\u0005\u0003'h\u000e\u001e\rdP\u000fKLkB\u000eKHiV\u0008\u0005HbCA\u0005Hp\u0011\u0008\u001fHjBA\u001fB'S\u0014\u0002Ac\u0011\u000f\u000eZ'P\u000f\u000f\rn\\\u0011\u0019BqT\u0005K^b_\u0015\u0002Cb]\u0012E\u0011eC_WOu\u000f5\u0003Dt\u0011\u0003\u0019DbWA\u001f_fX\u000f\u0002C`\u0011\u0011\u0019B`C\u0000\u0006\rpX\r\u0007\r`D\u0008\u000fH'H\u000e\u001e\rsY\u0013\u0004X`YA\u001fEb\u0011\u0011\u0019BdT\u0012\u0018\u0003;S\u0013U\u0011eC_;_bB\u0012\u0002C`\u0011F.~D\u0016A\u001cDk]A\u000eUnEA\u001fEb\u0011\u0011\u0019B`C\u0000\u0006\u0003"
		// @0CA: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @0CD: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @0D0: aastore
		// @0D1: dup
		// @0D2: iconst_1
		// @0D3: ldc "yoTA\u0007DtEA\u0004C'E\t\u000e\rkT\u0007\u001f\rtY\u000e\u001c^'E\t\u000e\rdY\u0000\u0018^nBA\n[fX\r\nOkTA\rBu\u0011\u0018\u0004X'E\u000eKXtTOWOu\u000f]\t_9r\r\u0002Nl\u0011\u000e\u0005\rsY\u0004K~kP\u0017\u000e\rdY\u0000\u0018^nBA\u001fB'S\u0004\u000cDi\u0011\u0003\u001eDkU\u0008\u0005J'H\u000e\u001e_'B\u0004\u0005Yn_\u0004\u0007\u0003"
		// @0D5: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @0D8: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @0DB: aastore
		// @0DC: dup
		// @0DD: iconst_2
		// @0DE: ldc "thDA\u0003LqTA\u0007BfU\u0004\u000f\rsY\u0004KIbW\u0000\u001eAs\u00112\u0007LqTOKyoTA\u0019D`Y\u0015FEf_\u0005K]f_\u0004K^o^\u0016\u0018\r~^\u0014\u0019\rdD\u0013\u0019HiEA\u0018HiE\u0008\u0005Hk\u0011\u0000\u0005I'E\t\u000e\reP\u0013\u0018\rr_\u0005\u000e_iT\u0000\u001fE'B\t\u0004Z'X\u0015\u0018\rtE\u0000\u001f^)\u00115\u0003H'b\r\n[b\u0011\u0008\u0018\rpT\r\u0007\u0000fC\u000c\u0004XuT\u0005KLiUA\u0003Lt\u0011\u0011\n_sX\u0002\u001eAfC\r\u0012\r`^\u000e\u000f\rmD\u000c\u001bDiVA\nOn]\u0008\u001fT)\r\u0003\u0019\u0013;S\u0013U}hX\u000f\u001f\rsY\u0004K@hD\u0012\u000e\rfEA\u001fEb\u0011\u0012\u001fLsBA\u001fB'B\u0004\u000e\rpY\u0000\u001f\rsY\u0004\u0012\rjT\u0000\u0005\u0003"
		// @0E0: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @0E3: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @0E6: aastore
		// @0E7: dup
		// @0E8: iconst_3
		// @0E9: ldc "nkX\u0002\u0000\rh_A\u001fEb\u0011\"\u0004@w^\u000f\u000eCsBA\u001fLe\u001f"
		// @0EB: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @0EE: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @0F1: aastore
		// @0F2: dup
		// @0F3: iconst_4
		// @0F4: ldc "yoX\u0012K^dC\u0004\u000eC']\u0008\u0018Yt\u0011\u0015\u0003H'R\u000e\u0006]h_\u0004\u0005Yt\u0011\u0000\u001fYfR\t\u000eI'E\u000eKThD\u0013K~kP\u0017\u000e\rdY\u0000\u0018^nBOKyoTA8AfG\u0004L^'R\u000e\u0006]h_\u0004\u0005Yt\u0011\u0000\u0019H'E\t\u000e\rtY\u0008\u000eAc\u0011\t\u000eLc\u001dA\u001fEb\u0011\u0000\u0019@hD\u0013\u000eI'P\u0013\u0006\rf_\u0005KYoTA\u0003HfG\u0018K@hD\u000f\u001fDiVOKhqT\u0013\u0012\rd^\u000c\u001bBiT\u000f\u001f\rfU\u0005\u0018\rf\u0011\u0002\u000e_sP\u0008\u0005\rf\\\u000e\u001eCs\u0011\u000e\r\rfC\u000c\u0004Xu\u0011\u0015\u0004\r~^\u0014\u0019\rtT\u000f\u001fDiT\rG\rf_\u0005K@f_\u0018KEfG\u0004K^k^\u0015\u0018\ra^\u0013KZbP\u0011\u0004Ct\u001fA;Bn_\u0015KYoTA\u0006BrB\u0004KLs\u0011\u0000\u0005T'X\u0015\u000e@'X\u000fKYoTA(bJa.%hIe2KAnB\u0015KYh\u0011\u0017\u0002Hp\u0011\u0008\u001f^'X\u000f\rBu\\\u0000\u001fDh_O"
		// @0F6: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @0F9: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @0FC: aastore
		// @0FD: dup
		// @0FE: iconst_5
		// @0FF: ldc "chFA\u0008AnR\nKBi\u0011\u0015\u0003H'f\u0004\n]h_\u0012KYfSO"
		// @101: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @104: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @107: aastore
		// @108: dup
		// @109: bipush 6 (0x06)
		// @10B: ldc "bi\u0011\u0015\u0003H'C\u0008\u000cEs\u0011\u0000\u0019H'E\t\u000e\rpT\u0000\u001bBiBA\u0008XuC\u0004\u0005YkHA\u000e\\rX\u0011\u001bHc\u0011\u000e\u0005\r~^\u0014\u0019\rtT\u000f\u001fDiT\rE\rSY\u0004KAnB\u0015KBi\u0011\u0015\u0003H']\u0004\rY'B\t\u0004Zt\u0011\u0000\u0007A'E\t\u000e\rpT\u0000\u001bBiBA\n[fX\r\nOkTA\u001fB'S\u0004KKnE\u0015\u000eI'E\u000eKThD\u0013K^b_\u0015\u0002Cb]OK}hX\u000f\u001f\rsY\u0004K@hD\u0012\u000e\rfEA\nC~\u0011\u0016\u000eLw^\u000fKYh\u0011\u0017\u0002Hp\u0011\u0008\u001f^'X\u000f\rBu\\\u0000\u001fDh_O"
		// @10D: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @110: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @113: aastore
		// @114: dup
		// @115: bipush 7 (0x07)
		// @117: ldc "nkX\u0002\u0000\rh_A\u001fEb\u0011\u000c\u0002CnV\u0014\u0005\rn_A\u001fEb\u0011\r\u0002^s\u0011\u000e\u0005\rsY\u0004KAbW\u0015E"
		// @119: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @11C: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @11F: aastore
		// @120: dup
		// @121: bipush 8 (0x08)
		// @123: ldc "zbP\u0011\u0004C'B\r\u0004Yt\u0011\u0002\nC'^\u000f\u0007T'Y\u000e\u0007I'B\u0014\u0002YfS\r\u000e\rpT\u0000\u001bBiBOKkhCA\u0002CtE\u0000\u0005Nb\u001dA\u0018BjTA\u0008Li\u0011\t\u0004Ac\u0011\u000e\u0005A~\u0011\t\u000eLqHA\u001cHfA\u000e\u0005^'P\u000f\u000f\rt^\u000c\u000e\rdP\u000fKEh]\u0005KBi]\u0018K_hR\n\u000eYt\u001f]\t_9h\u000e\u001e\rfC\u0004KEh]\u0005\u0002C`\u0011\u0015\u0003H'\\\u0008\u0005D`D\u000fG\rpY\u0008\u0008E'X\u0012KL']\u0008\u000cEs\u0011\u0016\u000eLw^\u000fE\rT]\u000e\u001f^'X\u000fKYoTA\u0007DtEA\u0004C'E\t\u000e\ruX\u0006\u0003Y'F\t\u000e_b\u0011\r\u0002JoEA\u001cHfA\u000e\u0005^'R\u0000\u0005\reTA\u001bAfR\u0004\u000f\rfC\u0004KChFA\u0004Xs]\u0008\u0005Hc\u0011\u0008\u0005\re]\u0014\u000e\u0003'r\r\u0002Nl\u0011\u000e\u0005\rbP\u0002\u0003\rhWA\u001fEb\\A\u001fB'A\r\nNb\u0011\u0000K@n_\u0008\u000cXi\u0011\u0008\u0005\rsY\u000e\u0018H'B\r\u0004Yt\u001f"
		// @125: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @128: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @12B: aastore
		// @12C: dup
		// @12D: bipush 9 (0x09)
		// @12F: ldc "lt\u0011\u0018\u0004X'C\u0004\u001bAfR\u0004KYoTA\u000fHaP\u0014\u0007Y'X\u0015\u000e@'X\u000fKL'B\r\u0004Y'F\u0008\u001fE'P\u000fKDsT\u000cKNo^\u0012\u000eC'H\u000e\u001e_tT\r\r\u0001'PAWNh]\\[\u001daW\u0007\r\u0013C\rN\u0008Bk\u000fA\u001cDk]A\n]wT\u0000\u0019\rn_A\u001fEb\u0011\u0002\u0004_iT\u0013KBa\u0011\u0015\u0003H'B\r\u0004Y+\u0011\u0008\u0005InR\u0000\u001fDiVA\u001fEfEA\u001fEbC\u0004KDt\u0011\u0000KInW\u0007\u000e_b_\u0015KIbW\u0000\u001eAs\u0011\u0008\u001fHj\u0011\u0007\u0004_'E\t\u0002^'B\r\u0004Y'\u0019\u0016\u0003DdYA\u0008Li\u0011\r\nYbCA\tH'C\u0004\u0018YhC\u0004\u000f\reHA\u0003BkU\u0008\u0005J'\u00162#dAeFKLiUA\u0008AnR\n\u0002C`\u0011\u000e\u0005\rsY\u0004K^k^\u0015B\u0003;S\u0013U\u0011eC_2Br\u0011\t\n[b\u0011\u000f\u0004Z'\\\u0000\u000fH'PA\u000cXi\u00112\u0007LqTMKLu\\\u0004\u000f\rpX\u0015\u0003\rtT\u0017\u000eC'V\u0014\u0005^'P\u000f\u000f\ri^A\u0019BdZ\u0004\u001f^)\u00115\u0003Dt\u0011\u0016\u0002Ak\u0011\u0003\u000e\rj^\u0013\u000e\rcT\u0012\u001f_rR\u0015\u0002[b\u0011\u0000\u001f\rd]\u000e\u0018H'C\u0000\u0005Jb\u001dA\tXs\u0011\u0016\u0002Yo^\u0014\u001f\rsY\u0004K[bC\u0012\nYn]\u0008\u001fT'^\u0007KYoTA\u000fHaP\u0014\u0007Y'b\r\n[b\u001f"
		// @131: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @134: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @137: aastore
		// @138: dup
		// @139: bipush 10 (0x0A)
		// @13B: ldc "chFA\u0008AnR\nKBi\u0011\u0015\u0003H'|\u000e\u000fXkT\u0012KYfSO"
		// @13D: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @140: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @143: aastore
		// @144: dup
		// @145: bipush 11 (0x0B)
		// @147: ldc "`hU\u0014\u0007Ht\u0011\u0011\u0019BqX\u0005\u000e\rcX\u0007\rHuT\u000f\u001f\rfS\u0008\u0007DsX\u0004\u0018\ra^\u0013KL'B\u0004\u0005Yn_\u0004\u0007\rhCA\u0002@wC\u000e\u001dH'X\u0015\u0018\rtE\u0000\u001f^)\u00115\u0003H'U\u0004\rLr]\u0015K~kP\u0017\u000e\nt\u0011\u000c\u0004Ir]\u0004KDt\u0011 &lUu2G\rpY\u0008\u0008E'X\u0012KYoTA\u0018TtE\u0004\u0006\rsY\u0000\u001f\rb_\u0000\tAbBA\nXs^\u000c\nYnRA\u0006DtB\u0008\u0007H'U\u0004\rHiR\u0004\u0018\u0003'~\u0015\u0003Hu\u0011\u000c\u0004Ir]\u0004\u0018\rn_\u0002\u0007XcTA\u000eCbC\u0006\u0012\rtY\u0008\u000eAcBMKYfC\u0006\u000eYn_\u0006K^~B\u0015\u000e@t\u0011\u0000\u0005I'P\u0013\u0006BrCA\u001bAfE\u0008\u0005J)\r\u0003\u0019\u0013;S\u0013U}hX\u000f\u001f\rsY\u0004K@hD\u0012\u000e\rfEA\nC~\u0011\u000c\u0004Ir]\u0004KYh\u0011\u0017\u0002Hp\u0011\u0008\u001f^'X\u000f\rBu\\\u0000\u001fDh_O"
		// @149: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @14C: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @14F: aastore
		// @150: dup
		// @151: bipush 12 (0x0C)
		// @153: ldc "ahF\u0004\u0019\rn_A\u001fEb\u0011\u000c\u0004Ir]\u0004KAnB\u0015KBi\u0011\u0015\u0003H']\u0004\rY'P\u0013\u000e\rsY\u0004K@hU\u0014\u0007Ht\u0011\u0015\u0003Ls\u0011\u0018\u0004X'Y\u0000\u001dH'H\u0004\u001f\rs^A\u000eC`X\u000f\u000eHu\u001fA&BuTA\u0006BcD\r\u000e^'F\u0008\u0007A'P\u0011\u001bHfCA\u0002C'E\t\u0002^']\u0008\u0018Y'P\u0012KThDA\u001b_hV\u0013\u000e^t\u0011\u0015\u000eNo_\u000e\u0007B`X\u0002\nAkHOKzoT\u000fKThDA\u000eC`X\u000f\u000eHu\u0011\u0000K@hU\u0014\u0007H+\u0011\u0002\u0004@w^\u000f\u000eCs\u0011\u000e\u0019\rpT\u0000\u001bBi\u001dA\u0002Y'F\u0008\u0007A'S\u0004K@hG\u0004\u000f\rs^A\u001fEb\u0011$%jN\u007f$.\u007fBuA\u0007DtEMK^h\u0011\u0018\u0004X'R\u0000\u0005\rb@\u0014\u0002]'X\u0015E\u0011eC_WOu\u000f\"\u0007DdZA\u0004C'E\t\u000e\rb_\u0006\u0002CbT\u0013KOrE\u0015\u0004C'^\u000fKLiHA\u0006BcD\r\u000e\u0003"
		// @155: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @158: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @15B: aastore
		// @15C: dup
		// @15D: bipush 13 (0x0D)
		// @15F: ldc "hiV\u0008\u0005HbC\u0008\u0005J'P\u000f\u0012\rd^\u000c\u001bBiT\u000f\u001f\u0001'F\u0004\n]h_A\u0004_'\\\u000e\u000fXkTA\u000eUwT\u000f\u000f^'B\u000e\u0007LuX\u0015\u000e\u0003'b\u000e\u0007LuX\u0015\u000e\rdP\u000fKOb\u0011\u0004\n_iT\u0005KKu^\u000cK]kP\u0018\u0002C`\u0011\u000c\u001eAsX\u0011\u0007L~T\u0013KJf\\\u0004\u0018\u0003;S\u0013U\u0011eC_&LiHA\u0002Yb\\\u0012KNf_A\nAt^A\tH'D\u000f\u0007BdZ\u0004\u000f\reTA\u0008BjA\r\u000eYn_\u0006K@nB\u0012\u0002BiBA\u0002C'R\u0000\u0006]fX\u0006\u0005\rj^\u0005\u000e\u0003"
		// @161: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @164: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @167: aastore
		// @168: dup
		// @169: bipush 14 (0x0E)
		// @16B: ldc "chFA\u000cB'S\u0000\u0008F'E\u000eKYoTA(EfB\u0012\u0002^'E\u0000\t\u0003"
		// @16D: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @170: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @173: aastore
		// @174: dup
		// @175: bipush 15 (0x0F)
		// @177: ldc "hiV\u0008\u0005HbC\u0008\u0005J'E\t\u000e\ruX\u0006\u0003Y'B\u0004\u001f\rhWA\u0008BjA\u000e\u0005HiE\u0012KLiUA\u0006BcD\r\u000e^'F\u0008\u0007A'D\u000f\u0007BdZA\n\riT\u0016KNoP\u0012\u0018Dt\u001fA;Bn_\u0015KYoTA\u0006BrB\u0004KLs\u0011\u0015\u0003H'T\u000f\u000cDiT\u0004\u0019\reD\u0015\u001fBi\u0011\u000e\r\rf\u0011\r\u0004NlT\u0005KNoP\u0012\u0018Dt\u0011\u0015\u0004\rtT\u0004KYoTA\u0007DtEA\u0004K'C\u0004\u001aXnC\u0004\u000f\rnE\u0004\u0006^)"
		// @179: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @17C: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @17F: aastore
		// @180: dup
		// @181: bipush 16 (0x10)
		// @183: ldc "yoX\u0012KNh_\u0002\u0007XcT\u0012KYoTA\u0008BiW\u0008\u000cXuP\u0015\u0002Bi\u0011\u0015\u0019Ln_\u0008\u0005J'A\u0013\u0004JuP\u000cE\r^^\u0014KNf_A\u0005Bp\u0011\u0003\u001eDkUA\u0012BrCA\u0018HiE\u0008\u0005Hk\u0011\u0015\u0004\r~^\u0014\u0019\rhF\u000fK^wT\u0002\u0002KnR\u0000\u001fDh_\u0012E\rF]\u0012\u0004\u0001'H\u000e\u001e\rjP\u0018KZf_\u0015KYh\u0011\u0017\u0002^nEA\u001fEb\u00115\u000e^s\u0011'\u0002HkUA\u001fB'E\u0013\u0012\rhD\u0015KThD\u0013K^b_\u0015\u0002Cb]OWOu\u000f]\t_9e\u000eK_bA\u0004\nY'R\u000e\u0005KnV\u0014\u0019LsX\u000e\u0005\rsC\u0000\u0002Cn_\u0006KDi\u0011\u0015\u0003H'W\u0014\u001fXuTMK]uT\u0012\u0018\rsY\u0004KeB}1KOrE\u0015\u0004C)"
		// @185: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @188: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @18B: aastore
		// @18C: putstatic java.lang.String[] game.C_100330_ig.field_107286_e
		// @18F: ldc "\u0011\"\u0000_KZfBA\u001fBh\u0011\u0002\u0007BtTA\u001fB'PA\u0006DtB\u0008\u0007H'X\u000f\u001fHuR\u0004\u001bYbUA\tT'\rD[\u0013"
		// @191: invokestatic game.C_100330_ig.func_107281_z(java.lang.String)char[]
		// @194: invokestatic game.C_100330_ig.func_107278_z(char[])java.lang.String
		// @197: putstatic java.lang.String game.C_100330_ig.field_107284_g
		// @19A: return
	}
	
	private static char[] func_107281_z(String arg0)
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
		// @0E: bipush 107 (0x6B)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_107278_z(char[] arg0)
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
		// @30: bipush 45 (0x2D)
		// @32: goto @46
		// @35: bipush 7 (0x07)
		// @37: goto @46
		// @3A: bipush 49 (0x31)
		// @3C: goto @46
		// @3F: bipush 97 (0x61)
		// @41: goto @46
		// @44: bipush 107 (0x6B)
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
