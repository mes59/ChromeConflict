package game;

abstract class C_100140_bj implements C_100308_lh
{
	private long field_102965_d;
	static String field_102969_a;
	static int field_102966_e;
	static int field_102963_f;
	static int field_102967_b;
	static int[] field_102968_c;
	static C_100037_wb field_102964_g;
	private static final String[] field_102970_z;
	
	static final void func_102953_a(int arg0, C_100112_r arg1, int arg2, int arg3, int arg4, C_100037_wb[] arg5, int arg6, int arg7, C_100037_wb[] arg8, C_100037_wb[] arg9, int arg10, int arg11, int arg12, int arg13, int arg14)
	{
		// @000: aload_1
		// @001: getfield int game.C_100112_r.field_101769_u
		// @004: aload_1
		// @005: getfield int game.C_100112_r.field_101763_H
		// @008: iadd
		// @009: istore #15
		// @00B: aload_1
		// @00C: getfield int game.C_100112_r.field_101769_u
		// @00F: istore #16
		// @011: iload #7
		// @013: sipush 13789 (0x35DD)
		// @016: if_icmpeq @02C
		// @019: bipush 94 (0x5E)
		// @01B: bipush 39 (0x27)
		// @01D: bipush 124 (0x7C)
		// @01F: bipush -67 (0xBD)
		// @021: bipush -59 (0xC5)
		// @023: bipush -66 (0xBE)
		// @025: invokestatic game.C_100140_bj.func_102962_a(int, int, int, int, int, int)void
		// @028: goto @02C
		// @02B: athrow
		// @02C: iconst_1
		// @02D: aload_1
		// @02E: iload_2
		// @02F: aload #5
		// @031: iload #6
		// @033: aload #8
		// @035: iload #10
		// @037: aload #9
		// @039: iload #15
		// @03B: iload #4
		// @03D: iload #12
		// @03F: iload #15
		// @041: sipush 480 (0x01E0)
		// @044: iload #14
		// @046: iload_0
		// @047: iload #13
		// @049: iload #16
		// @04B: iload_3
		// @04C: aload_1
		// @04D: iload #16
		// @04F: iload #11
		// @051: invokestatic game.C_100061_dh.func_101977_a(boolean, game.C_100112_r, int, game.C_100037_wb[], int, game.C_100037_wb[], int, game.C_100037_wb[], int, int, int, int, int, int, int, int, int, int, game.C_100112_r, int, int)void
		// @054: goto @148
		// @057: astore #15
		// @059: aload #15
		// @05B: new java.lang.StringBuilder
		// @05E: dup
		// @05F: invokespecial java.lang.StringBuilder.<init>()void
		// @062: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @065: bipush 9 (0x09)
		// @067: aaload
		// @068: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @06B: iload_0
		// @06C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @06F: bipush 44 (0x2C)
		// @071: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @074: aload_1
		// @075: ifnull @081
		// @078: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @07B: iconst_3
		// @07C: aaload
		// @07D: goto @086
		// @080: athrow
		// @081: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @084: iconst_2
		// @085: aaload
		// @086: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @089: bipush 44 (0x2C)
		// @08B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @08E: iload_2
		// @08F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @092: bipush 44 (0x2C)
		// @094: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @097: iload_3
		// @098: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @09B: bipush 44 (0x2C)
		// @09D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0A0: iload #4
		// @0A2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0A5: bipush 44 (0x2C)
		// @0A7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0AA: aload #5
		// @0AC: ifnull @0B8
		// @0AF: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @0B2: iconst_3
		// @0B3: aaload
		// @0B4: goto @0BD
		// @0B7: athrow
		// @0B8: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @0BB: iconst_2
		// @0BC: aaload
		// @0BD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0C0: bipush 44 (0x2C)
		// @0C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0C5: iload #6
		// @0C7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0CA: bipush 44 (0x2C)
		// @0CC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0CF: iload #7
		// @0D1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D4: bipush 44 (0x2C)
		// @0D6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D9: aload #8
		// @0DB: ifnull @0E7
		// @0DE: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @0E1: iconst_3
		// @0E2: aaload
		// @0E3: goto @0EC
		// @0E6: athrow
		// @0E7: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @0EA: iconst_2
		// @0EB: aaload
		// @0EC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0EF: bipush 44 (0x2C)
		// @0F1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F4: aload #9
		// @0F6: ifnull @102
		// @0F9: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @0FC: iconst_3
		// @0FD: aaload
		// @0FE: goto @107
		// @101: athrow
		// @102: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @105: iconst_2
		// @106: aaload
		// @107: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @10A: bipush 44 (0x2C)
		// @10C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10F: iload #10
		// @111: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @114: bipush 44 (0x2C)
		// @116: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @119: iload #11
		// @11B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @11E: bipush 44 (0x2C)
		// @120: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @123: iload #12
		// @125: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @128: bipush 44 (0x2C)
		// @12A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @12D: iload #13
		// @12F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @132: bipush 44 (0x2C)
		// @134: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @137: iload #14
		// @139: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @13C: bipush 41 (0x29)
		// @13E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @141: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @144: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @147: athrow
		// @148: return
	}
	
	abstract C_100133_tk func_102955_b(boolean arg0);
	
	public final String func_102949_c(int arg0)
	{
		// @00: aload_0
		// @01: bipush -90 (0xA6)
		// @03: invokevirtual game.C_100140_bj.func_102952_a(int)boolean
		// @06: ifne @0D
		// @09: goto @0F
		// @0C: athrow
		// @0D: aconst_null
		// @0E: areturn
		// @0F: iload_1
		// @10: bipush -105 (0x97)
		// @12: if_icmple @22
		// @15: aconst_null
		// @16: checkcast java.lang.String
		// @19: bipush 112 (0x70)
		// @1B: invokestatic game.C_100140_bj.func_102961_a(java.lang.String, int)void
		// @1E: goto @22
		// @21: athrow
		// @22: ldc2_w 350
		// @25: aload_0
		// @26: getfield long game.C_100140_bj.field_102965_d
		// @29: ladd
		// @2A: ldc2_w -1
		// @2D: lxor
		// @2E: bipush 85 (0x55)
		// @30: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @33: ldc2_w -1
		// @36: lxor
		// @37: lcmp
		// @38: ifge @3D
		// @3B: aconst_null
		// @3C: areturn
		// @3D: aload_0
		// @3E: sipush -29062 (0x8E7A)
		// @41: invokevirtual game.C_100140_bj.func_102957_d(int)java.lang.String
		// @44: areturn
		// @45: astore_2
		// @46: aload_2
		// @47: new java.lang.StringBuilder
		// @4A: dup
		// @4B: invokespecial java.lang.StringBuilder.<init>()void
		// @4E: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @51: bipush 7 (0x07)
		// @53: aaload
		// @54: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @57: iload_1
		// @58: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5B: bipush 41 (0x29)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @63: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @66: athrow
	}
	
	static final void func_102961_a(String arg0, int arg1)
	{
		// @00: iload_1
		// @01: bipush 6 (0x06)
		// @03: if_icmpeq @17
		// @06: bipush -87 (0xA9)
		// @08: bipush -10 (0xF6)
		// @0A: bipush 104 (0x68)
		// @0C: iconst_1
		// @0D: bipush -104 (0x98)
		// @0F: bipush 88 (0x58)
		// @11: bipush -22 (0xEA)
		// @13: invokestatic game.C_100140_bj.func_102959_a(int, int, int, boolean, int, int, int)boolean
		// @16: pop
		// @17: goto @55
		// @1A: astore_2
		// @1B: aload_2
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @26: iconst_4
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: aload_0
		// @2C: ifnull @38
		// @2F: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @32: iconst_3
		// @33: aaload
		// @34: goto @3D
		// @37: athrow
		// @38: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @3B: iconst_2
		// @3C: aaload
		// @3D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @40: bipush 44 (0x2C)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: iload_1
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 41 (0x29)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @51: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @54: athrow
		// @55: return
	}
	
	public final void func_102951_b(int arg0)
	{
		// @00: bipush -98 (0x9E)
		// @02: bipush 48 (0x30)
		// @04: iload_1
		// @05: isub
		// @06: bipush 36 (0x24)
		// @08: idiv
		// @09: irem
		// @0A: istore_2
		// @0B: aload_0
		// @0C: bipush -125 (0x83)
		// @0E: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @11: putfield long game.C_100140_bj.field_102965_d
		// @14: goto @39
		// @17: astore_2
		// @18: aload_2
		// @19: new java.lang.StringBuilder
		// @1C: dup
		// @1D: invokespecial java.lang.StringBuilder.<init>()void
		// @20: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @23: bipush 10 (0x0A)
		// @25: aaload
		// @26: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @29: iload_1
		// @2A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2D: bipush 41 (0x29)
		// @2F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @32: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @35: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @38: athrow
		// @39: return
	}
	
	static final void func_102960_a(boolean arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore_2
		// @004: getstatic int[] game.C_100046_vk.field_102765_ub
		// @007: iconst_1
		// @008: iconst_5
		// @009: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @00C: getstatic int[] game.C_100122_em.field_102077_Wb
		// @00F: iload_0
		// @010: ifne @018
		// @013: iconst_1
		// @014: goto @019
		// @017: athrow
		// @018: iconst_0
		// @019: bipush 6 (0x06)
		// @01B: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @01E: getstatic int[] game.C_100061_dh.field_101979_dc
		// @021: iconst_1
		// @022: bipush 8 (0x08)
		// @024: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @027: getstatic int[] game.C_100341_jd.field_102651_mb
		// @02A: iconst_1
		// @02B: bipush 13 (0x0D)
		// @02D: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @030: getstatic int[] game.C_100239_oi.field_102305_J
		// @033: iconst_1
		// @034: bipush 14 (0x0E)
		// @036: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @039: getstatic int[] game.C_100183_cd.field_103419_P
		// @03C: iconst_1
		// @03D: bipush 20 (0x14)
		// @03F: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @042: aconst_null
		// @043: putstatic game.C_100302_ka game.C_100145_ta.field_100429_j
		// @046: getstatic int game.C_100212_qc.field_105976_b
		// @049: iconst_m1
		// @04A: ixor
		// @04B: iconst_m1
		// @04C: if_icmplt @069
		// @04F: getstatic int[] game.C_100159_sn.field_105404_a
		// @052: iconst_1
		// @053: bipush 6 (0x06)
		// @055: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @058: getstatic int[] game.C_100106_ef.field_104750_f
		// @05B: iconst_1
		// @05C: bipush 8 (0x08)
		// @05E: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @061: iload_2
		// @062: ifeq @07F
		// @065: goto @069
		// @068: athrow
		// @069: getstatic int[] game.C_100122_em.field_102077_Wb
		// @06C: iconst_1
		// @06D: bipush 6 (0x06)
		// @06F: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @072: getstatic int[] game.C_100061_dh.field_101979_dc
		// @075: iconst_1
		// @076: bipush 8 (0x08)
		// @078: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @07B: goto @07F
		// @07E: athrow
		// @07F: getstatic int game.C_100212_qc.field_105976_b
		// @082: ifle @0A7
		// @085: getstatic int[] game.C_100310_lj.field_100546_B
		// @088: iconst_1
		// @089: iconst_0
		// @08A: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @08D: getstatic int[] game.C_100333_ij.field_107345_d
		// @090: iload_0
		// @091: ifne @09D
		// @094: goto @098
		// @097: athrow
		// @098: iconst_1
		// @099: goto @09E
		// @09C: athrow
		// @09D: iconst_0
		// @09E: bipush 19 (0x13)
		// @0A0: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @0A3: iload_2
		// @0A4: ifeq @0BD
		// @0A7: getstatic int[] game.C_100174_sb.field_105607_d
		// @0AA: iload_0
		// @0AB: ifne @0B7
		// @0AE: goto @0B2
		// @0B1: athrow
		// @0B2: iconst_1
		// @0B3: goto @0B8
		// @0B6: athrow
		// @0B7: iconst_0
		// @0B8: bipush 19 (0x13)
		// @0BA: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @0BD: bipush -50 (0xCE)
		// @0BF: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @0C2: ifne @0C9
		// @0C5: goto @0D2
		// @0C8: athrow
		// @0C9: getstatic java.lang.String[] game.C_100268_mk.field_106669_b
		// @0CC: bipush 34 (0x22)
		// @0CE: getstatic java.lang.String game.C_100242_oh.field_106345_b
		// @0D1: aastore
		// @0D2: iload_0
		// @0D3: ifeq @0D7
		// @0D6: return
		// @0D7: sipush -25065 (0x9E17)
		// @0DA: invokestatic game.C_100012_fh.func_100501_d(int)boolean
		// @0DD: ifeq @0E4
		// @0E0: goto @116
		// @0E3: athrow
		// @0E4: getstatic int[] game.C_100180_ce.field_104806_w
		// @0E7: iconst_1
		// @0E8: iconst_1
		// @0E9: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @0EC: getstatic int[] game.C_100015_wh.field_103788_o
		// @0EF: iconst_1
		// @0F0: iconst_2
		// @0F1: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @0F4: getstatic int[] game.C_100211_qd.field_102164_fc
		// @0F7: iload_0
		// @0F8: ifne @100
		// @0FB: iconst_1
		// @0FC: goto @101
		// @0FF: athrow
		// @100: iconst_0
		// @101: iconst_3
		// @102: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @105: getstatic int[] game.C_100226_ae.field_106150_b
		// @108: iload_0
		// @109: ifne @111
		// @10C: iconst_1
		// @10D: goto @112
		// @110: athrow
		// @111: iconst_0
		// @112: iconst_4
		// @113: invokestatic game.C_100102_w.func_104623_a(int[], boolean, int)void
		// @116: goto @13B
		// @119: astore_1
		// @11A: aload_1
		// @11B: new java.lang.StringBuilder
		// @11E: dup
		// @11F: invokespecial java.lang.StringBuilder.<init>()void
		// @122: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @125: bipush 8 (0x08)
		// @127: aaload
		// @128: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @12B: iload_0
		// @12C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @12F: bipush 41 (0x29)
		// @131: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @134: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @137: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @13A: athrow
		// @13B: return
	}
	
	public final C_100133_tk func_102950_a(byte arg0)
	{
		// @00: aload_0
		// @01: bipush -86 (0xAA)
		// @03: invokevirtual game.C_100140_bj.func_102952_a(int)boolean
		// @06: ifne @0D
		// @09: goto @11
		// @0C: athrow
		// @0D: getstatic game.C_100133_tk game.C_100034_gi.field_104034_l
		// @10: areturn
		// @11: aload_0
		// @12: getfield long game.C_100140_bj.field_102965_d
		// @15: ldc2_w -350
		// @18: lsub
		// @19: bipush -39 (0xD9)
		// @1B: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @1E: lcmp
		// @1F: ifgt @26
		// @22: goto @2A
		// @25: athrow
		// @26: getstatic game.C_100133_tk game.C_100297_kf.field_101234_s
		// @29: areturn
		// @2A: iload_1
		// @2B: bipush 77 (0x4D)
		// @2D: if_icmpeq @39
		// @30: bipush -99 (0x9D)
		// @32: putstatic int game.C_100140_bj.field_102967_b
		// @35: goto @39
		// @38: athrow
		// @39: aload_0
		// @3A: iconst_0
		// @3B: invokevirtual game.C_100140_bj.func_102955_b(boolean)game.C_100133_tk
		// @3E: areturn
		// @3F: astore_2
		// @40: aload_2
		// @41: new java.lang.StringBuilder
		// @44: dup
		// @45: invokespecial java.lang.StringBuilder.<init>()void
		// @48: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @4B: iconst_0
		// @4C: aaload
		// @4D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @50: iload_1
		// @51: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @54: bipush 41 (0x29)
		// @56: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @59: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5F: athrow
	}
	
	static final boolean func_102959_a(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6)
	{
		// @00: iload #5
		// @02: sipush -16671 (0xBEE1)
		// @05: if_icmpeq @0A
		// @08: iconst_0
		// @09: ireturn
		// @0A: iload #5
		// @0C: sipush -16735 (0xBEA1)
		// @0F: ixor
		// @10: invokestatic game.C_100087_n.func_100688_e(int)boolean
		// @13: ifeq @5C
		// @16: bipush -67 (0xBD)
		// @18: iload_0
		// @19: iload #6
		// @1B: iload_3
		// @1C: invokestatic game.C_100207_qh.func_102865_a(int, int, int, boolean)void
		// @1F: aconst_null
		// @20: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @23: if_acmpeq @49
		// @26: goto @2A
		// @29: athrow
		// @2A: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @2D: iload_3
		// @2E: iload #4
		// @30: bipush -99 (0x9D)
		// @32: iload_0
		// @33: iload_2
		// @34: invokevirtual game.C_100022_hf.func_103876_a(boolean, int, byte, int, int)boolean
		// @37: ifne @42
		// @3A: goto @3E
		// @3D: athrow
		// @3E: goto @49
		// @41: athrow
		// @42: bipush 46 (0x2E)
		// @44: invokestatic game.C_100290_jm.func_106853_a(byte)void
		// @47: iconst_0
		// @48: istore_3
		// @49: iload_3
		// @4A: iload_0
		// @4B: iload #5
		// @4D: sipush 16752 (0x4170)
		// @50: ixor
		// @51: invokestatic game.C_100171_cn.func_105554_a(boolean, int, int)void
		// @54: iconst_m1
		// @55: iload_3
		// @56: iload_1
		// @57: invokestatic game.C_100049_vf.func_104195_a(int, boolean, int)void
		// @5A: iconst_0
		// @5B: istore_3
		// @5C: iload_3
		// @5D: ireturn
		// @5E: astore #7
		// @60: aload #7
		// @62: new java.lang.StringBuilder
		// @65: dup
		// @66: invokespecial java.lang.StringBuilder.<init>()void
		// @69: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @6C: iconst_5
		// @6D: aaload
		// @6E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @71: iload_0
		// @72: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @75: bipush 44 (0x2C)
		// @77: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7A: iload_1
		// @7B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7E: bipush 44 (0x2C)
		// @80: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @83: iload_2
		// @84: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @87: bipush 44 (0x2C)
		// @89: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8C: iload_3
		// @8D: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @90: bipush 44 (0x2C)
		// @92: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @95: iload #4
		// @97: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9A: bipush 44 (0x2C)
		// @9C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9F: iload #5
		// @A1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A4: bipush 44 (0x2C)
		// @A6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A9: iload #6
		// @AB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AE: bipush 41 (0x29)
		// @B0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B6: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @B9: athrow
	}
	
	abstract String func_102957_d(int arg0);
	
	static final void func_102962_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #14
		// @005: iconst_2
		// @006: iload_3
		// @007: iadd
		// @008: sipush 493 (0x01ED)
		// @00B: iload #4
		// @00D: iadd
		// @00E: iadd
		// @00F: bipush -8 (0xF8)
		// @011: isub
		// @012: istore #6
		// @014: getstatic game.C_100302_ka game.C_100170_cm.field_105544_o
		// @017: iconst_3
		// @018: bipush -6 (0xFA)
		// @01A: getstatic game.C_100302_ka game.C_100265_mh.field_106621_l
		// @01D: getfield int game.C_100302_ka.field_101848_lb
		// @020: iadd
		// @021: iload #5
		// @023: sipush -7906 (0xE11E)
		// @026: ixor
		// @027: iconst_3
		// @028: bipush -6 (0xFA)
		// @02A: iload #6
		// @02C: iadd
		// @02D: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @030: getstatic game.C_100302_ka game.C_100170_cm.field_105544_o
		// @033: getfield int game.C_100302_ka.field_101848_lb
		// @036: iconst_5
		// @037: isub
		// @038: istore #7
		// @03A: getstatic game.C_100302_ka game.C_100019_wl.field_103844_b
		// @03D: iconst_5
		// @03E: iload_0
		// @03F: iconst_m1
		// @040: iload #7
		// @042: iload_0
		// @043: ineg
		// @044: iadd
		// @045: sipush 485 (0x01E5)
		// @048: iload_3
		// @049: iadd
		// @04A: bipush -2 (0xFE)
		// @04C: isub
		// @04D: iload #4
		// @04F: iadd
		// @050: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @053: getstatic game.C_100302_ka game.C_100235_om.field_106296_j
		// @056: iload_3
		// @057: iload_0
		// @058: iconst_m1
		// @059: iconst_0
		// @05A: getstatic game.C_100302_ka game.C_100127_tl.field_104946_d
		// @05D: getfield int game.C_100302_ka.field_101886_Kb
		// @060: ineg
		// @061: getstatic game.C_100302_ka game.C_100019_wl.field_103844_b
		// @064: getfield int game.C_100302_ka.field_101886_Kb
		// @067: iload_3
		// @068: ineg
		// @069: iadd
		// @06A: iadd
		// @06B: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @06E: iload #7
		// @070: iconst_2
		// @071: iload_0
		// @072: iadd
		// @073: isub
		// @074: istore #7
		// @076: getstatic game.C_100302_ka game.C_100127_tl.field_104946_d
		// @079: iload_3
		// @07A: getstatic game.C_100302_ka game.C_100235_om.field_106296_j
		// @07D: getfield int game.C_100302_ka.field_101886_Kb
		// @080: ineg
		// @081: isub
		// @082: iload_0
		// @083: iconst_m1
		// @084: iconst_0
		// @085: getstatic game.C_100302_ka game.C_100127_tl.field_104946_d
		// @088: getfield int game.C_100302_ka.field_101886_Kb
		// @08B: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @08E: getstatic game.C_100115_ej game.C_100081_ue.field_100670_q
		// @091: iconst_2
		// @092: bipush -5 (0xFB)
		// @094: iload #7
		// @096: iadd
		// @097: iconst_5
		// @098: iconst_0
		// @099: iload_3
		// @09A: sipush 485 (0x01E5)
		// @09D: iadd
		// @09E: iconst_2
		// @09F: iload #4
		// @0A1: ineg
		// @0A2: isub
		// @0A3: iadd
		// @0A4: iconst_5
		// @0A5: iload #4
		// @0A7: invokevirtual game.C_100115_ej.func_102030_a(int, int, int, int, int, int, int)void
		// @0AA: aconst_null
		// @0AB: getstatic game.C_100320_hh game.C_100047_vh.field_104150_d
		// @0AE: if_acmpeq @0D5
		// @0B1: getstatic game.C_100320_hh game.C_100047_vh.field_104150_d
		// @0B4: getstatic game.C_100115_ej game.C_100081_ue.field_100670_q
		// @0B7: getfield int game.C_100115_ej.field_101848_lb
		// @0BA: getstatic game.C_100115_ej game.C_100081_ue.field_100670_q
		// @0BD: getfield int game.C_100115_ej.field_101880_Gb
		// @0C0: getstatic game.C_100115_ej game.C_100081_ue.field_100670_q
		// @0C3: getfield int game.C_100115_ej.field_101841_Pb
		// @0C6: getstatic game.C_100115_ej game.C_100081_ue.field_100670_q
		// @0C9: getfield int game.C_100115_ej.field_101886_Kb
		// @0CC: bipush 47 (0x2F)
		// @0CE: invokevirtual game.C_100320_hh.func_102524_a(int, int, int, int, byte)void
		// @0D1: goto @0D5
		// @0D4: athrow
		// @0D5: iload #6
		// @0D7: ineg
		// @0D8: getstatic game.C_100302_ka game.C_100265_mh.field_106621_l
		// @0DB: getfield int game.C_100302_ka.field_101886_Kb
		// @0DE: iadd
		// @0DF: iload_3
		// @0E0: ineg
		// @0E1: iadd
		// @0E2: istore #8
		// @0E4: iload #8
		// @0E6: iconst_2
		// @0E7: idiv
		// @0E8: istore #9
		// @0EA: iload_3
		// @0EB: iload #9
		// @0ED: iadd
		// @0EE: iload_2
		// @0EF: ineg
		// @0F0: isub
		// @0F1: istore #10
		// @0F3: iload #5
		// @0F5: sipush 7905 (0x1EE1)
		// @0F8: if_icmpeq @108
		// @0FB: aconst_null
		// @0FC: checkcast java.lang.String
		// @0FF: bipush 102 (0x66)
		// @101: invokestatic game.C_100140_bj.func_102961_a(java.lang.String, int)void
		// @104: goto @108
		// @107: athrow
		// @108: iconst_0
		// @109: istore #11
		// @10B: iconst_0
		// @10C: istore #12
		// @10E: iload #12
		// @110: iconst_m1
		// @111: ixor
		// @112: bipush -7 (0xF9)
		// @114: if_icmple @200
		// @117: iload #14
		// @119: ifne @256
		// @11C: iload #12
		// @11E: iconst_m1
		// @11F: ixor
		// @120: bipush -6 (0xFA)
		// @122: if_icmple @13F
		// @125: goto @129
		// @128: athrow
		// @129: getstatic game.C_100302_ka[] game.C_100152_bd.field_105211_i
		// @12C: iload #12
		// @12E: aaload
		// @12F: ifnonnull @13F
		// @132: goto @136
		// @135: athrow
		// @136: iload #14
		// @138: ifeq @1F8
		// @13B: goto @13F
		// @13E: athrow
		// @13F: iconst_3
		// @140: bipush -6 (0xFA)
		// @142: getstatic game.C_100302_ka game.C_100265_mh.field_106621_l
		// @145: getfield int game.C_100302_ka.field_101848_lb
		// @148: iconst_2
		// @149: iadd
		// @14A: iadd
		// @14B: iload #11
		// @14D: imul
		// @14E: getstatic int game.C_100211_qd.field_102149_xc
		// @151: iconst_1
		// @152: iadd
		// @153: idiv
		// @154: iadd
		// @155: istore #13
		// @157: iinc #11 +1
		// @15A: iload #13
		// @15C: ineg
		// @15D: bipush -2 (0xFE)
		// @15F: iadd
		// @160: bipush -6 (0xFA)
		// @162: getstatic game.C_100302_ka game.C_100265_mh.field_106621_l
		// @165: getfield int game.C_100302_ka.field_101848_lb
		// @168: iconst_2
		// @169: iadd
		// @16A: iadd
		// @16B: iload #11
		// @16D: imul
		// @16E: iconst_1
		// @16F: getstatic int game.C_100211_qd.field_102149_xc
		// @172: iadd
		// @173: idiv
		// @174: iconst_3
		// @175: iadd
		// @176: iadd
		// @177: istore #7
		// @179: iconst_5
		// @17A: iload #12
		// @17C: if_icmpgt @197
		// @17F: getstatic game.C_100302_ka game.C_100031_gl.field_103963_g
		// @182: iload #6
		// @184: iload #7
		// @186: iconst_m1
		// @187: iload #13
		// @189: iload #8
		// @18B: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @18E: iload #14
		// @190: ifeq @1F8
		// @193: goto @197
		// @196: athrow
		// @197: getstatic game.C_100302_ka[] game.C_100152_bd.field_105211_i
		// @19A: iload #12
		// @19C: aaload
		// @19D: iload #6
		// @19F: iload #7
		// @1A1: iconst_m1
		// @1A2: iload #13
		// @1A4: iload #8
		// @1A6: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1A9: getstatic game.C_100302_ka[] game.C_100338_jc.field_105374_h
		// @1AC: iload #12
		// @1AE: aaload
		// @1AF: iload_3
		// @1B0: iload #7
		// @1B2: iconst_m1
		// @1B3: iconst_0
		// @1B4: iload #9
		// @1B6: iload_3
		// @1B7: ineg
		// @1B8: iadd
		// @1B9: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1BC: getstatic game.C_100302_ka[] game.C_100067_vd.field_104323_h
		// @1BF: iload #12
		// @1C1: aaload
		// @1C2: iload #9
		// @1C4: iload_1
		// @1C5: ineg
		// @1C6: iload #7
		// @1C8: iadd
		// @1C9: iload_1
		// @1CA: isub
		// @1CB: iload #5
		// @1CD: sipush -7906 (0xE11E)
		// @1D0: ixor
		// @1D1: iload_1
		// @1D2: iload_2
		// @1D3: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1D6: getstatic game.C_100302_ka[] game.C_100288_jn.field_106845_a
		// @1D9: iload #12
		// @1DB: aaload
		// @1DC: iload #10
		// @1DE: iload_1
		// @1DF: ineg
		// @1E0: iload_1
		// @1E1: ineg
		// @1E2: iload #7
		// @1E4: iadd
		// @1E5: iadd
		// @1E6: iconst_m1
		// @1E7: iload_1
		// @1E8: iload #10
		// @1EA: ineg
		// @1EB: iload_3
		// @1EC: ineg
		// @1ED: iadd
		// @1EE: iload #8
		// @1F0: iadd
		// @1F1: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1F4: goto @1F8
		// @1F7: athrow
		// @1F8: iinc #12 +1
		// @1FB: iload #14
		// @1FD: ifeq @10E
		// @200: goto @256
		// @203: astore #6
		// @205: aload #6
		// @207: new java.lang.StringBuilder
		// @20A: dup
		// @20B: invokespecial java.lang.StringBuilder.<init>()void
		// @20E: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @211: bipush 6 (0x06)
		// @213: aaload
		// @214: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @217: iload_0
		// @218: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @21B: bipush 44 (0x2C)
		// @21D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @220: iload_1
		// @221: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @224: bipush 44 (0x2C)
		// @226: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @229: iload_2
		// @22A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @22D: bipush 44 (0x2C)
		// @22F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @232: iload_3
		// @233: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @236: bipush 44 (0x2C)
		// @238: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @23B: iload #4
		// @23D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @240: bipush 44 (0x2C)
		// @242: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @245: iload #5
		// @247: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @24A: bipush 41 (0x29)
		// @24C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @24F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @252: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @255: athrow
		// @256: return
	}
	
	public static void func_102958_e(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100140_bj.field_102969_a
		// @04: aconst_null
		// @05: putstatic int[] game.C_100140_bj.field_102968_c
		// @08: iload_0
		// @09: sipush 485 (0x01E5)
		// @0C: if_icmpeq @1A
		// @0F: aconst_null
		// @10: checkcast game.C_100037_wb
		// @13: putstatic game.C_100037_wb game.C_100140_bj.field_102964_g
		// @16: goto @1A
		// @19: athrow
		// @1A: aconst_null
		// @1B: putstatic game.C_100037_wb game.C_100140_bj.field_102964_g
		// @1E: goto @42
		// @21: astore_1
		// @22: aload_1
		// @23: new java.lang.StringBuilder
		// @26: dup
		// @27: invokespecial java.lang.StringBuilder.<init>()void
		// @2A: getstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @2D: iconst_1
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
	
	static
	{
		// @00: bipush 11 (0x0B)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "=\u001b\u007fX\u007f"
		// @09: invokestatic game.C_100140_bj.func_102956_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100140_bj.func_102954_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "=\u001b\u007f^\u007f"
		// @14: invokestatic game.C_100140_bj.func_102956_z(java.lang.String)char[]
		// @17: invokestatic game.C_100140_bj.func_102954_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "1\u0004=}"
		// @1F: invokestatic game.C_100140_bj.func_102956_z(java.lang.String)char[]
		// @22: invokestatic game.C_100140_bj.func_102954_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "$_\u007f?*"
		// @2A: invokestatic game.C_100140_bj.func_102956_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100140_bj.func_102954_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "=\u001b\u007f_\u007f"
		// @35: invokestatic game.C_100140_bj.func_102956_z(java.lang.String)char[]
		// @38: invokestatic game.C_100140_bj.func_102954_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "=\u001b\u007f\\\u007f"
		// @40: invokestatic game.C_100140_bj.func_102956_z(java.lang.String)char[]
		// @43: invokestatic game.C_100140_bj.func_102954_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "=\u001b\u007fA\u007f"
		// @4C: invokestatic game.C_100140_bj.func_102956_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100140_bj.func_102954_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "=\u001b\u007fZ\u007f"
		// @58: invokestatic game.C_100140_bj.func_102956_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100140_bj.func_102954_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "=\u001b\u007f@\u007f"
		// @64: invokestatic game.C_100140_bj.func_102956_z(java.lang.String)char[]
		// @67: invokestatic game.C_100140_bj.func_102954_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "=\u001b\u007f]\u007f"
		// @70: invokestatic game.C_100140_bj.func_102956_z(java.lang.String)char[]
		// @73: invokestatic game.C_100140_bj.func_102954_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "=\u001b\u007f[\u007f"
		// @7C: invokestatic game.C_100140_bj.func_102956_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100140_bj.func_102954_z(char[])java.lang.String
		// @82: aastore
		// @83: putstatic java.lang.String[] game.C_100140_bj.field_102970_z
		// @86: ldc "\u000b\u00198bw0\u0001%x81Q2p91\u001e%15:Q2~:=\u0018?t3\u007f\u00068e?\u007f\u00059tw<\u0004#c21\u0005q6kzAo6w,\u0014%e>1\u0016\u007f"
		// @88: invokestatic game.C_100140_bj.func_102956_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100140_bj.func_102954_z(char[])java.lang.String
		// @8E: putstatic java.lang.String game.C_100140_bj.field_102969_a
		// @91: iconst_5
		// @92: newarray int[]
		// @94: putstatic int[] game.C_100140_bj.field_102968_c
		// @97: return
	}
	
	private static char[] func_102956_z(String arg0)
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
		// @0E: bipush 87 (0x57)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_102954_z(char[] arg0)
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
		// @30: bipush 95 (0x5F)
		// @32: goto @46
		// @35: bipush 113 (0x71)
		// @37: goto @46
		// @3A: bipush 81 (0x51)
		// @3C: goto @46
		// @3F: bipush 17 (0x11)
		// @41: goto @46
		// @44: bipush 87 (0x57)
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
