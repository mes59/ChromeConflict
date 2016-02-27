package game;

import java.awt.Frame;
import java.awt.Color;

final class C_100227_af
{
	static int field_106166_d;
	static String[] field_106164_f;
	static String field_106173_h;
	static Color field_106165_g;
	static String field_106171_j;
	static C_100182_cc field_106170_a;
	static String[] field_106174_i;
	static String field_106167_e;
	static Frame field_106168_b;
	static String field_106169_c;
	private static final String[] field_106172_z;
	
	static final void func_106159_a(C_100037_wb[] arg0, int arg1, int arg2, C_100037_wb[] arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, C_100112_r arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, C_100112_r arg17, int arg18, C_100037_wb[] arg19)
	{
		// @000: iload #5
		// @002: iload #16
		// @004: iload_1
		// @005: aload #10
		// @007: iload_2
		// @008: iload #11
		// @00A: iload #6
		// @00C: new game.C_100127_tl
		// @00F: dup
		// @010: aload_0
		// @011: invokespecial game.C_100127_tl.<init>(game.C_100037_wb[])void
		// @014: iload #12
		// @016: iload #7
		// @018: bipush 126 (0x7E)
		// @01A: ixor
		// @01B: iload #18
		// @01D: new game.C_100127_tl
		// @020: dup
		// @021: aload #19
		// @023: invokespecial game.C_100127_tl.<init>(game.C_100037_wb[])void
		// @026: iload #4
		// @028: iload #13
		// @02A: new game.C_100127_tl
		// @02D: dup
		// @02E: aload_3
		// @02F: invokespecial game.C_100127_tl.<init>(game.C_100037_wb[])void
		// @032: iload #14
		// @034: aload #17
		// @036: iload #15
		// @038: iload #8
		// @03A: iload #9
		// @03C: invokestatic game.C_100084_ug.func_104470_a(int, int, int, game.C_100112_r, int, int, int, game.C_100127_tl, int, int, int, game.C_100127_tl, int, int, game.C_100127_tl, int, game.C_100112_r, int, int, int)void
		// @03F: iload #7
		// @041: bipush -128 (0x80)
		// @043: if_icmpeq @04B
		// @046: bipush -27 (0xE5)
		// @048: putstatic int game.C_100227_af.field_106166_d
		// @04B: goto @181
		// @04E: astore #20
		// @050: aload #20
		// @052: new java.lang.StringBuilder
		// @055: dup
		// @056: invokespecial java.lang.StringBuilder.<init>()void
		// @059: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @05C: iconst_5
		// @05D: aaload
		// @05E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @061: aload_0
		// @062: ifnull @06E
		// @065: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @068: iconst_0
		// @069: aaload
		// @06A: goto @073
		// @06D: athrow
		// @06E: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @071: iconst_1
		// @072: aaload
		// @073: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @076: bipush 44 (0x2C)
		// @078: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @07B: iload_1
		// @07C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @07F: bipush 44 (0x2C)
		// @081: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @084: iload_2
		// @085: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @088: bipush 44 (0x2C)
		// @08A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @08D: aload_3
		// @08E: ifnull @09A
		// @091: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @094: iconst_0
		// @095: aaload
		// @096: goto @09F
		// @099: athrow
		// @09A: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @09D: iconst_1
		// @09E: aaload
		// @09F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0A2: bipush 44 (0x2C)
		// @0A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0A7: iload #4
		// @0A9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0AC: bipush 44 (0x2C)
		// @0AE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0B1: iload #5
		// @0B3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0B6: bipush 44 (0x2C)
		// @0B8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0BB: iload #6
		// @0BD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0C0: bipush 44 (0x2C)
		// @0C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0C5: iload #7
		// @0C7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0CA: bipush 44 (0x2C)
		// @0CC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0CF: iload #8
		// @0D1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D4: bipush 44 (0x2C)
		// @0D6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D9: iload #9
		// @0DB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0DE: bipush 44 (0x2C)
		// @0E0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E3: aload #10
		// @0E5: ifnull @0F1
		// @0E8: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @0EB: iconst_0
		// @0EC: aaload
		// @0ED: goto @0F6
		// @0F0: athrow
		// @0F1: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @0F4: iconst_1
		// @0F5: aaload
		// @0F6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F9: bipush 44 (0x2C)
		// @0FB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FE: iload #11
		// @100: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @103: bipush 44 (0x2C)
		// @105: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @108: iload #12
		// @10A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @10D: bipush 44 (0x2C)
		// @10F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @112: iload #13
		// @114: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @117: bipush 44 (0x2C)
		// @119: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @11C: iload #14
		// @11E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @121: bipush 44 (0x2C)
		// @123: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @126: iload #15
		// @128: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @12B: bipush 44 (0x2C)
		// @12D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @130: iload #16
		// @132: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @135: bipush 44 (0x2C)
		// @137: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13A: aload #17
		// @13C: ifnull @148
		// @13F: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @142: iconst_0
		// @143: aaload
		// @144: goto @14D
		// @147: athrow
		// @148: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @14B: iconst_1
		// @14C: aaload
		// @14D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @150: bipush 44 (0x2C)
		// @152: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @155: iload #18
		// @157: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @15A: bipush 44 (0x2C)
		// @15C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @15F: aload #19
		// @161: ifnull @16D
		// @164: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @167: iconst_0
		// @168: aaload
		// @169: goto @172
		// @16C: athrow
		// @16D: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @170: iconst_1
		// @171: aaload
		// @172: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @175: bipush 41 (0x29)
		// @177: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @17D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @180: athrow
		// @181: return
	}
	
	static final boolean func_106156_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush 43 (0x2B)
		// @03: if_icmpge @16
		// @06: bipush -17 (0xEF)
		// @08: aconst_null
		// @09: checkcast int[]
		// @0C: bipush 92 (0x5C)
		// @0E: invokestatic game.C_100227_af.func_106160_a(int, int[], int)int
		// @11: pop
		// @12: goto @16
		// @15: athrow
		// @16: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @19: getfield long game.C_100211_qd.field_102156_Gc
		// @1C: getstatic long game.C_100321_hi.field_107215_f
		// @1F: lcmp
		// @20: ifne @28
		// @23: iconst_1
		// @24: goto @29
		// @27: athrow
		// @28: iconst_0
		// @29: ireturn
		// @2A: astore_1
		// @2B: aload_1
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @36: bipush 6 (0x06)
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: iload_0
		// @3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40: bipush 41 (0x29)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @48: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4B: athrow
	}
	
	static final void func_106161_a(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #4
		// @005: iload_0
		// @006: sipush -30146 (0x8A3E)
		// @009: if_icmpeq @015
		// @00C: bipush 48 (0x30)
		// @00E: invokestatic game.C_100227_af.func_106161_a(int)void
		// @011: goto @015
		// @014: athrow
		// @015: getstatic boolean game.C_100284_nj.field_106772_a
		// @018: ifne @0BF
		// @01B: getstatic game.C_100219_an game.C_100264_mg.field_106518_f
		// @01E: ifnull @029
		// @021: goto @025
		// @024: athrow
		// @025: goto @032
		// @028: athrow
		// @029: iconst_4
		// @02A: bipush 56 (0x38)
		// @02C: invokestatic game.C_100121_ud.func_100708_b(int, byte)game.C_100219_an
		// @02F: putstatic game.C_100219_an game.C_100264_mg.field_106518_f
		// @032: getstatic game.C_100219_an game.C_100264_mg.field_106518_f
		// @035: getfield boolean game.C_100219_an.field_100879_j
		// @038: ifeq @0AC
		// @03B: getstatic int[] game.C_100066_dl.field_101632_G
		// @03E: astore_1
		// @03F: getstatic game.C_100219_an game.C_100264_mg.field_106518_f
		// @042: getfield int[] game.C_100219_an.field_100881_k
		// @045: astore_2
		// @046: iconst_0
		// @047: istore_3
		// @048: iload_3
		// @049: iconst_m1
		// @04A: ixor
		// @04B: bipush -9 (0xF7)
		// @04D: if_icmple @06D
		// @050: aload_1
		// @051: iload_3
		// @052: aload_1
		// @053: iload_3
		// @054: iaload
		// @055: aload_2
		// @056: iload_3
		// @057: iaload
		// @058: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @05B: iastore
		// @05C: iinc #3 +1
		// @05F: iload #4
		// @061: ifne @078
		// @064: iload #4
		// @066: ifeq @048
		// @069: goto @06D
		// @06C: athrow
		// @06D: getstatic int[] game.C_100139_tb.field_100529_w
		// @070: astore_1
		// @071: getstatic game.C_100219_an game.C_100264_mg.field_106518_f
		// @074: getfield int[] game.C_100219_an.field_100881_k
		// @077: astore_2
		// @078: iconst_0
		// @079: istore_3
		// @07A: iload_3
		// @07B: bipush 8 (0x08)
		// @07D: if_icmpge @09F
		// @080: aload_1
		// @081: iload_3
		// @082: aload_1
		// @083: iload_3
		// @084: iaload
		// @085: aload_2
		// @086: iload_3
		// @087: iaload
		// @088: iconst_m1
		// @089: ixor
		// @08A: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @08D: iastore
		// @08E: iinc #3 +1
		// @091: iload #4
		// @093: ifne @0A7
		// @096: iload #4
		// @098: ifeq @07A
		// @09B: goto @09F
		// @09E: athrow
		// @09F: iconst_1
		// @0A0: putstatic boolean game.C_100284_nj.field_106772_a
		// @0A3: aconst_null
		// @0A4: putstatic game.C_100219_an game.C_100264_mg.field_106518_f
		// @0A7: bipush 84 (0x54)
		// @0A9: invokestatic game.C_100086_uh.func_103026_g(int)void
		// @0AC: getstatic boolean game.C_100284_nj.field_106772_a
		// @0AF: ifne @0B6
		// @0B2: goto @0BF
		// @0B5: athrow
		// @0B6: bipush 96 (0x60)
		// @0B8: invokestatic game.C_100223_ab.func_106093_a(byte)void
		// @0BB: iconst_0
		// @0BC: invokestatic game.C_100140_bj.func_102960_a(boolean)void
		// @0BF: getstatic boolean game.C_100156_sk.field_105384_w
		// @0C2: ifne @123
		// @0C5: aconst_null
		// @0C6: getstatic game.C_100197_ra game.C_100093_fd.field_102782_V
		// @0C9: if_acmpeq @0D4
		// @0CC: goto @0D0
		// @0CF: athrow
		// @0D0: goto @0DE
		// @0D3: athrow
		// @0D4: bipush 6 (0x06)
		// @0D6: bipush -102 (0x9A)
		// @0D8: invokestatic game.C_100162_sc.func_102848_b(int, byte)game.C_100197_ra
		// @0DB: putstatic game.C_100197_ra game.C_100093_fd.field_102782_V
		// @0DE: getstatic game.C_100197_ra game.C_100093_fd.field_102782_V
		// @0E1: getfield boolean game.C_100197_ra.field_100863_v
		// @0E4: ifne @0EB
		// @0E7: goto @123
		// @0EA: athrow
		// @0EB: getstatic game.C_100197_ra game.C_100093_fd.field_102782_V
		// @0EE: getfield byte[] game.C_100197_ra.field_100868_q
		// @0F1: sipush 9837 (0x266D)
		// @0F4: invokestatic game.C_100030_gm.func_103329_a(byte[], int)void
		// @0F7: iconst_1
		// @0F8: putstatic boolean game.C_100156_sk.field_105384_w
		// @0FB: aconst_null
		// @0FC: putstatic game.C_100197_ra game.C_100093_fd.field_102782_V
		// @0FF: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @102: bipush 65 (0x41)
		// @104: iload_0
		// @105: sipush 30252 (0x762C)
		// @108: iadd
		// @109: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @10C: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @10F: bipush 68 (0x44)
		// @111: bipush 125 (0x7D)
		// @113: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @116: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @119: bipush 70 (0x46)
		// @11B: iload_0
		// @11C: sipush 30265 (0x7639)
		// @11F: iadd
		// @120: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @123: goto @147
		// @126: astore_1
		// @127: aload_1
		// @128: new java.lang.StringBuilder
		// @12B: dup
		// @12C: invokespecial java.lang.StringBuilder.<init>()void
		// @12F: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @132: iconst_3
		// @133: aaload
		// @134: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @137: iload_0
		// @138: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @13B: bipush 41 (0x29)
		// @13D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @140: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @143: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @146: athrow
		// @147: return
	}
	
	static final boolean func_106158_a(int arg0, boolean arg1)
	{
		// @00: iload_1
		// @01: ifeq @0F
		// @04: aconst_null
		// @05: checkcast java.lang.String
		// @08: putstatic java.lang.String game.C_100227_af.field_106167_e
		// @0B: goto @0F
		// @0E: athrow
		// @0F: iconst_m1
		// @10: iload_0
		// @11: iconst_m1
		// @12: ixor
		// @13: if_icmplt @1A
		// @16: goto @2A
		// @19: athrow
		// @1A: iconst_0
		// @1B: iload_0
		// @1C: iconst_m1
		// @1D: isub
		// @1E: iconst_4
		// @1F: irem
		// @20: if_icmpne @28
		// @23: iconst_1
		// @24: goto @29
		// @27: athrow
		// @28: iconst_0
		// @29: ireturn
		// @2A: sipush -1583 (0xF9D1)
		// @2D: iload_0
		// @2E: iconst_m1
		// @2F: ixor
		// @30: if_icmpge @44
		// @33: iload_0
		// @34: iconst_4
		// @35: irem
		// @36: ifne @42
		// @39: goto @3D
		// @3C: athrow
		// @3D: iconst_1
		// @3E: goto @43
		// @41: athrow
		// @42: iconst_0
		// @43: ireturn
		// @44: iload_0
		// @45: iconst_4
		// @46: irem
		// @47: ifeq @4C
		// @4A: iconst_0
		// @4B: ireturn
		// @4C: iload_0
		// @4D: bipush 100 (0x64)
		// @4F: irem
		// @50: iconst_m1
		// @51: ixor
		// @52: iconst_m1
		// @53: if_icmpeq @58
		// @56: iconst_1
		// @57: ireturn
		// @58: iconst_0
		// @59: iload_0
		// @5A: sipush 400 (0x0190)
		// @5D: irem
		// @5E: if_icmpne @65
		// @61: goto @67
		// @64: athrow
		// @65: iconst_0
		// @66: ireturn
		// @67: iconst_1
		// @68: ireturn
		// @69: astore_2
		// @6A: aload_2
		// @6B: new java.lang.StringBuilder
		// @6E: dup
		// @6F: invokespecial java.lang.StringBuilder.<init>()void
		// @72: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @75: iconst_4
		// @76: aaload
		// @77: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7A: iload_0
		// @7B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7E: bipush 44 (0x2C)
		// @80: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @83: iload_1
		// @84: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @87: bipush 41 (0x29)
		// @89: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @92: athrow
	}
	
	public static void func_106157_b(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100227_af.field_106167_e
		// @04: iload_0
		// @05: ifeq @12
		// @08: bipush -63 (0xC1)
		// @0A: invokestatic game.C_100227_af.func_106156_a(byte)boolean
		// @0D: pop
		// @0E: goto @12
		// @11: athrow
		// @12: aconst_null
		// @13: putstatic java.lang.String[] game.C_100227_af.field_106174_i
		// @16: aconst_null
		// @17: putstatic java.lang.String game.C_100227_af.field_106169_c
		// @1A: aconst_null
		// @1B: putstatic java.lang.String game.C_100227_af.field_106173_h
		// @1E: aconst_null
		// @1F: putstatic java.lang.String[] game.C_100227_af.field_106164_f
		// @22: aconst_null
		// @23: putstatic java.awt.Color game.C_100227_af.field_106165_g
		// @26: aconst_null
		// @27: putstatic java.awt.Frame game.C_100227_af.field_106168_b
		// @2A: aconst_null
		// @2B: putstatic game.C_100182_cc game.C_100227_af.field_106170_a
		// @2E: aconst_null
		// @2F: putstatic java.lang.String game.C_100227_af.field_106171_j
		// @32: goto @57
		// @35: astore_1
		// @36: aload_1
		// @37: new java.lang.StringBuilder
		// @3A: dup
		// @3B: invokespecial java.lang.StringBuilder.<init>()void
		// @3E: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @41: bipush 7 (0x07)
		// @43: aaload
		// @44: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @47: iload_0
		// @48: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4B: bipush 41 (0x29)
		// @4D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @50: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @53: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @56: athrow
		// @57: return
	}
	
	static final int func_106160_a(int arg0, int[] arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: iconst_0
		// @006: aload_1
		// @007: iconst_0
		// @008: iaload
		// @009: if_icmpeq @024
		// @00C: bipush 55 (0x37)
		// @00E: aload_1
		// @00F: iconst_0
		// @010: iaload
		// @011: if_icmpeq @024
		// @014: goto @018
		// @017: athrow
		// @018: bipush 57 (0x39)
		// @01A: aload_1
		// @01B: iconst_0
		// @01C: iaload
		// @01D: if_icmpne @029
		// @020: goto @024
		// @023: athrow
		// @024: iconst_1
		// @025: goto @02A
		// @028: athrow
		// @029: iconst_0
		// @02A: istore_3
		// @02B: iload_3
		// @02C: ifne @033
		// @02F: goto @08C
		// @032: athrow
		// @033: iload_0
		// @034: bipush 53 (0x35)
		// @036: iadd
		// @037: aload_1
		// @038: iconst_0
		// @039: iaload
		// @03A: invokestatic game.C_100042_we.func_104129_b(int, int)int[]
		// @03D: astore #4
		// @03F: aload #4
		// @041: arraylength
		// @042: iconst_m1
		// @043: ixor
		// @044: aload_1
		// @045: arraylength
		// @046: iconst_m1
		// @047: ixor
		// @048: if_icmpeq @052
		// @04B: iconst_0
		// @04C: istore_3
		// @04D: iload #7
		// @04F: ifeq @08C
		// @052: iconst_0
		// @053: istore #5
		// @055: aload_1
		// @056: arraylength
		// @057: iconst_m1
		// @058: ixor
		// @059: iload #5
		// @05B: iconst_m1
		// @05C: ixor
		// @05D: if_icmpge @08C
		// @060: aload_1
		// @061: iload #5
		// @063: iaload
		// @064: iconst_m1
		// @065: ixor
		// @066: iload #7
		// @068: ifne @092
		// @06B: aload #4
		// @06D: iload #5
		// @06F: iaload
		// @070: iconst_m1
		// @071: ixor
		// @072: if_icmpeq @080
		// @075: goto @079
		// @078: athrow
		// @079: iconst_0
		// @07A: istore_3
		// @07B: iload #7
		// @07D: ifeq @08C
		// @080: iinc #5 +1
		// @083: iload #7
		// @085: ifeq @055
		// @088: goto @08C
		// @08B: athrow
		// @08C: aload_1
		// @08D: bipush 109 (0x6D)
		// @08F: invokestatic game.C_100013_fn.func_103732_a(int[], byte)int
		// @092: istore #4
		// @094: iload #4
		// @096: iconst_m1
		// @097: ixor
		// @098: sipush -6101 (0xE82B)
		// @09B: if_icmplt @0A3
		// @09E: iconst_1
		// @09F: goto @0A4
		// @0A2: athrow
		// @0A3: iconst_0
		// @0A4: istore #5
		// @0A6: iload_0
		// @0A7: istore #6
		// @0A9: iload_3
		// @0AA: ifeq @0B3
		// @0AD: iload #6
		// @0AF: iconst_1
		// @0B0: ior
		// @0B1: istore #6
		// @0B3: iload #5
		// @0B5: ifeq @0BE
		// @0B8: iload #6
		// @0BA: iconst_2
		// @0BB: ior
		// @0BC: istore #6
		// @0BE: iload #6
		// @0C0: ireturn
		// @0C1: astore_3
		// @0C2: aload_3
		// @0C3: new java.lang.StringBuilder
		// @0C6: dup
		// @0C7: invokespecial java.lang.StringBuilder.<init>()void
		// @0CA: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @0CD: iconst_2
		// @0CE: aaload
		// @0CF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D2: iload_0
		// @0D3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D6: bipush 44 (0x2C)
		// @0D8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0DB: aload_1
		// @0DC: ifnull @0E8
		// @0DF: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @0E2: iconst_0
		// @0E3: aaload
		// @0E4: goto @0ED
		// @0E7: athrow
		// @0E8: getstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @0EB: iconst_1
		// @0EC: aaload
		// @0ED: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F0: bipush 44 (0x2C)
		// @0F2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F5: iload_2
		// @0F6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F9: bipush 41 (0x29)
		// @0FB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FE: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @101: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @104: athrow
	}
	
	static
	{
		// @00: bipush 8 (0x08)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "7\n\u00080q"
		// @09: invokestatic game.C_100227_af.func_106163_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100227_af.func_106162_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\"QJr"
		// @14: invokestatic game.C_100227_af.func_106163_z(java.lang.String)char[]
		// @17: invokestatic game.C_100227_af.func_106162_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "-B\u0008[$"
		// @1F: invokestatic game.C_100227_af.func_106163_z(java.lang.String)char[]
		// @22: invokestatic game.C_100227_af.func_106162_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "-B\u0008_$"
		// @2A: invokestatic game.C_100227_af.func_106163_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100227_af.func_106162_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "-B\u0008X$"
		// @35: invokestatic game.C_100227_af.func_106163_z(java.lang.String)char[]
		// @38: invokestatic game.C_100227_af.func_106162_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "-B\u0008\\$"
		// @40: invokestatic game.C_100227_af.func_106163_z(java.lang.String)char[]
		// @43: invokestatic game.C_100227_af.func_106162_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "-B\u0008]$"
		// @4C: invokestatic game.C_100227_af.func_106163_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100227_af.func_106162_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "-B\u0008Z$"
		// @58: invokestatic game.C_100227_af.func_106163_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100227_af.func_106162_z(char[])java.lang.String
		// @5E: aastore
		// @5F: putstatic java.lang.String[] game.C_100227_af.field_106172_z
		// @62: ldc "p\u0001\u0017 ,;EU>x#K\u0006}`#WC>x#\u0004G>n#ID>e\"PClo)TR{hlF_>0i\u0014\u0018"
		// @64: invokestatic game.C_100227_af.func_106163_z(java.lang.String)char[]
		// @67: invokestatic game.C_100227_af.func_106162_z(char[])java.lang.String
		// @6A: putstatic java.lang.String game.C_100227_af.field_106173_h
		// @6D: iconst_3
		// @6E: anewarray java.lang.String
		// @71: dup
		// @72: iconst_0
		// @73: ldc "\rHJ>c8LCl,!AK|i>\u0004Cf|-JUwc\"W"
		// @75: invokestatic game.C_100227_af.func_106163_z(java.lang.String)char[]
		// @78: invokestatic game.C_100227_af.func_106162_z(char[])java.lang.String
		// @7B: aastore
		// @7C: dup
		// @7D: iconst_1
		// @7E: ldc "\u0000KGz\u007flIIlileEve)RCsi\"PU"
		// @80: invokestatic game.C_100227_af.func_106163_z(java.lang.String)char[]
		// @83: invokestatic game.C_100227_af.func_106162_z(char[])java.lang.String
		// @86: aastore
		// @87: dup
		// @88: iconst_2
		// @89: ldc "\nQJr,/KKsy\"MRg,*AGjy>AU"
		// @8B: invokestatic game.C_100227_af.func_106163_z(java.lang.String)char[]
		// @8E: invokestatic game.C_100227_af.func_106162_z(char[])java.lang.String
		// @91: aastore
		// @92: putstatic java.lang.String[] game.C_100227_af.field_106164_f
		// @95: ldc "\u0005B\u0006gc9\u0004Bq,\"KRve\"C\u0006jd)\u0004A\u007fa)\u0004Qw` \u0004T{z)VR>x#\u0004Hq~!EJ>z%AQ>e\"\u0004\u001a;<r\u0004U{o#JBm\""
		// @97: invokestatic game.C_100227_af.func_106163_z(java.lang.String)char[]
		// @9A: invokestatic game.C_100227_af.func_106162_z(char[])java.lang.String
		// @9D: putstatic java.lang.String game.C_100227_af.field_106171_j
		// @A0: bipush 16 (0x10)
		// @A2: anewarray java.lang.String
		// @A5: putstatic java.lang.String[] game.C_100227_af.field_106174_i
		// @A8: iconst_0
		// @A9: putstatic int game.C_100227_af.field_106166_d
		// @AC: new java.awt.Color
		// @AF: dup
		// @B0: ldc 10040319 (0x9933ff)
		// @B2: invokespecial java.awt.Color.<init>(int)void
		// @B5: putstatic java.awt.Color game.C_100227_af.field_106165_g
		// @B8: ldc "\u0007MEu,p\u0001\u0016 ,*VIs,8LOm,+EK{"
		// @BA: invokestatic game.C_100227_af.func_106163_z(java.lang.String)char[]
		// @BD: invokestatic game.C_100227_af.func_106162_z(char[])java.lang.String
		// @C0: putstatic java.lang.String game.C_100227_af.field_106167_e
		// @C3: ldc "\u001fAHz,<VOhm8A\u0006Oy%GM>O$ER>x#\u0004\u001a;<r"
		// @C5: invokestatic game.C_100227_af.func_106163_z(java.lang.String)char[]
		// @C8: invokestatic game.C_100227_af.func_106162_z(char[])java.lang.String
		// @CB: putstatic java.lang.String game.C_100227_af.field_106169_c
		// @CE: return
	}
	
	private static char[] func_106163_z(String arg0)
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
		// @0E: bipush 12 (0x0C)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_106162_z(char[] arg0)
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
		// @30: bipush 76 (0x4C)
		// @32: goto @46
		// @35: bipush 36 (0x24)
		// @37: goto @46
		// @3A: bipush 38 (0x26)
		// @3C: goto @46
		// @3F: bipush 30 (0x1E)
		// @41: goto @46
		// @44: bipush 12 (0x0C)
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
