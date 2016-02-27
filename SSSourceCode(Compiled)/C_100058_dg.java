package game;

final class C_100058_dg extends C_100325_id
{
	static int field_101580_s;
	private C_100294_ki field_101575_K;
	private boolean field_101566_B;
	private C_100018_wk field_101573_I;
	private int field_101579_t;
	static C_100037_wb[] field_101562_E;
	int field_101576_w;
	int field_101583_y;
	private int field_101584_x;
	int field_101577_v;
	static byte[][] field_101578_u;
	int field_101563_F;
	private int field_101570_N;
	int field_101572_H;
	int field_101571_O;
	int field_101565_A;
	private int field_101582_z;
	static int field_101574_J;
	private C_100314_lf[] field_101561_D;
	int field_101568_L;
	static C_100037_wb[][] field_101564_G;
	boolean field_101567_C;
	static String field_101569_M;
	private static final String[] field_101581_P;
	
	final void func_101560_a(int arg0, int arg1, int arg2)
	{
		// @000: iload_1
		// @001: ldc -647207196 (0xd96c66e4)
		// @003: if_icmpeq @010
		// @006: aload_0
		// @007: bipush -72 (0xB8)
		// @009: invokevirtual game.C_100058_dg.func_101555_d(byte)void
		// @00C: goto @010
		// @00F: athrow
		// @010: getstatic boolean game.C_100050_vg.field_100637_q
		// @013: ifne @017
		// @016: return
		// @017: iload_3
		// @018: aload_0
		// @019: getfield int game.C_100058_dg.field_101583_y
		// @01C: ldc -1500794840 (0xa68bb028)
		// @01E: ishr
		// @01F: ineg
		// @020: isub
		// @021: istore #4
		// @023: iload_2
		// @024: aload_0
		// @025: getfield int game.C_100058_dg.field_101572_H
		// @028: ldc 11162312 (0xaa52c8)
		// @02A: ishr
		// @02B: iadd
		// @02C: istore #5
		// @02E: aload_0
		// @02F: getfield int game.C_100058_dg.field_101565_A
		// @032: aload_0
		// @033: getfield int game.C_100058_dg.field_101579_t
		// @036: ineg
		// @037: aload_0
		// @038: getfield int game.C_100058_dg.field_101570_N
		// @03B: iadd
		// @03C: iconst_4
		// @03D: idiv
		// @03E: aload_0
		// @03F: getfield int game.C_100058_dg.field_101579_t
		// @042: ineg
		// @043: isub
		// @044: imul
		// @045: aload_0
		// @046: getfield int game.C_100058_dg.field_101570_N
		// @049: idiv
		// @04A: istore #6
		// @04C: iload #6
		// @04E: ldc 1390567460 (0x52e26024)
		// @050: ishr
		// @051: istore #7
		// @053: aload_0
		// @054: getfield int game.C_100058_dg.field_101570_N
		// @057: iconst_2
		// @058: idiv
		// @059: istore #8
		// @05B: sipush 2500 (0x09C4)
		// @05E: istore #9
		// @060: aload_0
		// @061: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @064: ifnonnull @06B
		// @067: goto @084
		// @06A: athrow
		// @06B: bipush 25 (0x19)
		// @06D: aload_0
		// @06E: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @071: getfield int game.C_100018_wk.field_101546_w
		// @074: imul
		// @075: istore #9
		// @077: iload #9
		// @079: sipush 2500 (0x09C4)
		// @07C: if_icmple @084
		// @07F: sipush 2500 (0x09C4)
		// @082: istore #9
		// @084: iload #7
		// @086: ifle @11E
		// @089: aconst_null
		// @08A: aload_0
		// @08B: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @08E: if_acmpeq @11E
		// @091: goto @095
		// @094: athrow
		// @095: sipush -301 (0xFED3)
		// @098: aload_0
		// @099: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @09C: getfield int game.C_100018_wk.field_101546_w
		// @09F: iconst_m1
		// @0A0: ixor
		// @0A1: if_icmpgt @0AC
		// @0A4: goto @0A8
		// @0A7: athrow
		// @0A8: goto @11E
		// @0AB: athrow
		// @0AC: aload_0
		// @0AD: getfield int game.C_100058_dg.field_101579_t
		// @0B0: iconst_m1
		// @0B1: ixor
		// @0B2: iload #8
		// @0B4: iconst_m1
		// @0B5: ixor
		// @0B6: if_icmple @0E4
		// @0B9: bipush 10 (0x0A)
		// @0BB: iload #9
		// @0BD: aload_0
		// @0BE: getfield int game.C_100058_dg.field_101579_t
		// @0C1: imul
		// @0C2: imul
		// @0C3: iload #8
		// @0C5: idiv
		// @0C6: iload #5
		// @0C8: ldc 1112541188 (0x42500804)
		// @0CA: ishl
		// @0CB: iload #4
		// @0CD: ldc 1691167044 (0x64cd2944)
		// @0CF: ishl
		// @0D0: bipush 127 (0x7F)
		// @0D2: iload #7
		// @0D4: ldc -547346460 (0xdf6027e4)
		// @0D6: ishl
		// @0D7: invokestatic game.C_100222_aa.func_106075_a(int, int, int, byte, int)void
		// @0DA: getstatic int game.SteelSentinels.field_105275_O
		// @0DD: ifeq @11E
		// @0E0: goto @0E4
		// @0E3: athrow
		// @0E4: aload_0
		// @0E5: getfield int game.C_100058_dg.field_101579_t
		// @0E8: iload #8
		// @0EA: iconst_2
		// @0EB: imul
		// @0EC: if_icmpge @11E
		// @0EF: goto @0F3
		// @0F2: athrow
		// @0F3: bipush 10 (0x0A)
		// @0F5: aload_0
		// @0F6: getfield int game.C_100058_dg.field_101579_t
		// @0F9: ineg
		// @0FA: iconst_2
		// @0FB: iload #8
		// @0FD: imul
		// @0FE: iadd
		// @0FF: iload #9
		// @101: imul
		// @102: imul
		// @103: iload #8
		// @105: idiv
		// @106: iload #5
		// @108: ldc -795206268 (0xd09a1d84)
		// @10A: ishl
		// @10B: iload #4
		// @10D: ldc -1481040284 (0xa7b91e64)
		// @10F: ishl
		// @110: bipush 127 (0x7F)
		// @112: iload #7
		// @114: ldc -647207196 (0xd96c66e4)
		// @116: ishl
		// @117: invokestatic game.C_100222_aa.func_106075_a(int, int, int, byte, int)void
		// @11A: goto @11E
		// @11D: athrow
		// @11E: goto @156
		// @121: astore #4
		// @123: aload #4
		// @125: new java.lang.StringBuilder
		// @128: dup
		// @129: invokespecial java.lang.StringBuilder.<init>()void
		// @12C: getstatic java.lang.String[] game.C_100058_dg.field_101581_P
		// @12F: iconst_1
		// @130: aaload
		// @131: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @134: iload_1
		// @135: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @138: bipush 44 (0x2C)
		// @13A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13D: iload_2
		// @13E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @141: bipush 44 (0x2C)
		// @143: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @146: iload_3
		// @147: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @14A: bipush 41 (0x29)
		// @14C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @14F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @152: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @155: athrow
		// @156: return
	}
	
	public static void func_101556_i(int arg0)
	{
		// @00: aconst_null
		// @01: checkcast game.C_100037_wb[][]
		// @04: putstatic game.C_100037_wb[][] game.C_100058_dg.field_101564_G
		// @07: bipush 70 (0x46)
		// @09: bipush -64 (0xC0)
		// @0B: iload_0
		// @0C: isub
		// @0D: bipush 43 (0x2B)
		// @0F: idiv
		// @10: idiv
		// @11: istore_1
		// @12: aconst_null
		// @13: putstatic game.C_100037_wb[] game.C_100058_dg.field_101562_E
		// @16: aconst_null
		// @17: putstatic java.lang.String game.C_100058_dg.field_101569_M
		// @1A: aconst_null
		// @1B: checkcast byte[][]
		// @1E: putstatic byte[][] game.C_100058_dg.field_101578_u
		// @21: goto @45
		// @24: astore_1
		// @25: aload_1
		// @26: new java.lang.StringBuilder
		// @29: dup
		// @2A: invokespecial java.lang.StringBuilder.<init>()void
		// @2D: getstatic java.lang.String[] game.C_100058_dg.field_101581_P
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
	
	static final void func_101559_j(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore_3
		// @004: getstatic int game.C_100252_pn.field_105503_o
		// @007: iconst_m1
		// @008: ixor
		// @009: getstatic int game.C_100050_vg.field_100632_k
		// @00C: iconst_m1
		// @00D: ixor
		// @00E: if_icmpne @012
		// @011: return
		// @012: iconst_0
		// @013: getstatic int game.C_100252_pn.field_105503_o
		// @016: invokestatic game.C_100176_ci.func_105620_a(boolean, int)boolean
		// @019: ifne @020
		// @01C: goto @02C
		// @01F: athrow
		// @020: getstatic game.C_100034_gi[] game.C_100295_kh.field_105293_c
		// @023: getstatic int game.C_100252_pn.field_105503_o
		// @026: aaload
		// @027: bipush 93 (0x5D)
		// @029: invokevirtual game.C_100034_gi.func_104009_e(byte)void
		// @02C: getstatic int game.C_100252_pn.field_105503_o
		// @02F: iconst_m1
		// @030: ixor
		// @031: bipush -15 (0xF1)
		// @033: if_icmpne @03F
		// @036: bipush 112 (0x70)
		// @038: invokestatic game.C_100017_wj.func_103813_b(byte)void
		// @03B: goto @03F
		// @03E: athrow
		// @03F: iload_0
		// @040: bipush 32 (0x20)
		// @042: if_icmpge @050
		// @045: aconst_null
		// @046: checkcast game.C_100037_wb[]
		// @049: putstatic game.C_100037_wb[] game.C_100058_dg.field_101562_E
		// @04C: goto @050
		// @04F: athrow
		// @050: getstatic int game.C_100050_vg.field_100632_k
		// @053: putstatic int game.C_100252_pn.field_105503_o
		// @056: getstatic boolean game.C_100174_sb.field_105611_a
		// @059: putstatic boolean game.C_100125_tm.field_100748_l
		// @05C: iconst_0
		// @05D: putstatic int game.C_100052_eb.field_104231_b
		// @060: getstatic int game.C_100252_pn.field_105503_o
		// @063: iconst_m1
		// @064: ixor
		// @065: iconst_2
		// @066: if_icmpne @071
		// @069: iconst_0
		// @06A: putstatic boolean game.C_100289_jl.field_102901_L
		// @06D: goto @071
		// @070: athrow
		// @071: getstatic boolean game.C_100126_cb.field_103061_u
		// @074: ifne @07B
		// @077: goto @0C4
		// @07A: athrow
		// @07B: getstatic game.C_100002_gf game.C_100086_uh.field_103027_v
		// @07E: getstatic game.C_100002_gf game.C_100235_om.field_106292_a
		// @081: if_acmpne @088
		// @084: goto @094
		// @087: athrow
		// @088: sipush 200 (0x00C8)
		// @08B: ldc 1048576 (0x100000)
		// @08D: getstatic game.C_100002_gf game.C_100086_uh.field_103027_v
		// @090: iconst_1
		// @091: invokestatic game.C_100154_sl.func_105327_a(int, int, game.C_100002_gf, boolean)void
		// @094: getstatic game.C_100265_mh game.C_100127_tl.field_104948_b
		// @097: ifnonnull @09E
		// @09A: goto @0A6
		// @09D: athrow
		// @09E: getstatic game.C_100265_mh game.C_100127_tl.field_104948_b
		// @0A1: bipush -23 (0xE9)
		// @0A3: invokevirtual game.C_100265_mh.func_106573_c(byte)void
		// @0A6: getstatic game.C_100265_mh game.C_100021_wn.field_103868_f
		// @0A9: ifnonnull @0B0
		// @0AC: goto @0B8
		// @0AF: athrow
		// @0B0: getstatic game.C_100265_mh game.C_100021_wn.field_103868_f
		// @0B3: bipush -23 (0xE9)
		// @0B5: invokevirtual game.C_100265_mh.func_106573_c(byte)void
		// @0B8: aconst_null
		// @0B9: putstatic game.C_100265_mh game.C_100127_tl.field_104948_b
		// @0BC: aconst_null
		// @0BD: putstatic game.C_100265_mh game.C_100021_wn.field_103868_f
		// @0C0: iconst_0
		// @0C1: putstatic boolean game.C_100126_cb.field_103061_u
		// @0C4: getstatic boolean game.C_100095_fe.field_103387_O
		// @0C7: ifeq @11C
		// @0CA: aconst_null
		// @0CB: putstatic game.C_100292_jk game.C_100067_vd.field_104315_c
		// @0CE: new game.C_100202_qi
		// @0D1: dup
		// @0D2: invokespecial game.C_100202_qi.<init>()void
		// @0D5: putstatic game.C_100202_qi game.C_100231_oc.field_102193_gc
		// @0D8: getstatic int[] game.C_100066_dl.field_101632_G
		// @0DB: astore_1
		// @0DC: iconst_0
		// @0DD: istore_2
		// @0DE: iload_2
		// @0DF: bipush 8 (0x08)
		// @0E1: if_icmpge @0F7
		// @0E4: aload_1
		// @0E5: iload_2
		// @0E6: iconst_0
		// @0E7: iastore
		// @0E8: iinc #2 +1
		// @0EB: iload_3
		// @0EC: ifne @0FB
		// @0EF: iload_3
		// @0F0: ifeq @0DE
		// @0F3: goto @0F7
		// @0F6: athrow
		// @0F7: getstatic int[] game.C_100139_tb.field_100529_w
		// @0FA: astore_1
		// @0FB: iconst_0
		// @0FC: istore_2
		// @0FD: bipush -9 (0xF7)
		// @0FF: iload_2
		// @100: iconst_m1
		// @101: ixor
		// @102: if_icmpge @118
		// @105: aload_1
		// @106: iload_2
		// @107: iconst_0
		// @108: iastore
		// @109: iinc #2 +1
		// @10C: iload_3
		// @10D: ifne @11C
		// @110: iload_3
		// @111: ifeq @0FD
		// @114: goto @118
		// @117: athrow
		// @118: iconst_0
		// @119: putstatic boolean game.C_100095_fe.field_103387_O
		// @11C: getstatic boolean game.C_100082_uf.field_100376_h
		// @11F: ifeq @13A
		// @122: bipush -118 (0x8A)
		// @124: invokestatic game.C_100195_rc.func_105766_a(int)void
		// @127: bipush 124 (0x7C)
		// @129: invokestatic game.C_100108_ee.func_100378_b(int)void
		// @12C: sipush -31849 (0x8397)
		// @12F: invokestatic game.C_100205_qf.func_103672_d(int)void
		// @132: iconst_0
		// @133: putstatic boolean game.C_100082_uf.field_100376_h
		// @136: goto @13A
		// @139: athrow
		// @13A: goto @15E
		// @13D: astore_1
		// @13E: aload_1
		// @13F: new java.lang.StringBuilder
		// @142: dup
		// @143: invokespecial java.lang.StringBuilder.<init>()void
		// @146: getstatic java.lang.String[] game.C_100058_dg.field_101581_P
		// @149: iconst_0
		// @14A: aaload
		// @14B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @14E: iload_0
		// @14F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @152: bipush 41 (0x29)
		// @154: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @157: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @15A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @15D: athrow
		// @15E: return
	}
	
	final void func_101555_d(byte arg0)
	{
		// @0000: getstatic int game.SteelSentinels.field_105275_O
		// @0003: istore #13
		// @0005: iload_1
		// @0006: bipush 110 (0x6E)
		// @0008: if_icmpeq @0017
		// @000B: aload_0
		// @000C: aconst_null
		// @000D: checkcast game.C_100314_lf[]
		// @0010: putfield game.C_100314_lf[] game.C_100058_dg.field_101561_D
		// @0013: goto @0017
		// @0016: athrow
		// @0017: iconst_0
		// @0018: istore_2
		// @0019: aload_0
		// @001A: getfield int game.C_100058_dg.field_101584_x
		// @001D: iload_2
		// @001E: if_icmplt @0957
		// @0021: aload_0
		// @0022: dup
		// @0023: getfield int game.C_100058_dg.field_101572_H
		// @0026: aload_0
		// @0027: getfield int game.C_100058_dg.field_101577_v
		// @002A: iadd
		// @002B: putfield int game.C_100058_dg.field_101572_H
		// @002E: aload_0
		// @002F: dup
		// @0030: getfield int game.C_100058_dg.field_101583_y
		// @0033: aload_0
		// @0034: getfield int game.C_100058_dg.field_101568_L
		// @0037: iadd
		// @0038: putfield int game.C_100058_dg.field_101583_y
		// @003B: aload_0
		// @003C: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @003F: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0042: bipush 96 (0x60)
		// @0044: aload_0
		// @0045: getfield int game.C_100058_dg.field_101583_y
		// @0048: ldc 2016648324 (0x78339c84)
		// @004A: ishr
		// @004B: invokevirtual game.C_100171_cn.func_105560_c(int, int)int
		// @004E: iconst_m1
		// @004F: ixor
		// @0050: aload_0
		// @0051: getfield int game.C_100058_dg.field_101572_H
		// @0054: ldc -481786300 (0xe3488644)
		// @0056: ishr
		// @0057: ineg
		// @0058: iconst_m1
		// @0059: ixor
		// @005A: iload #13
		// @005C: ifne @13B8
		// @005F: if_icmplt @0069
		// @0062: goto @0066
		// @0065: athrow
		// @0066: goto @0084
		// @0069: aload_0
		// @006A: aload_0
		// @006B: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @006E: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0071: bipush -128 (0x80)
		// @0073: aload_0
		// @0074: getfield int game.C_100058_dg.field_101583_y
		// @0077: ldc 1738455556 (0x679eba04)
		// @0079: ishr
		// @007A: invokevirtual game.C_100171_cn.func_105560_c(int, int)int
		// @007D: ldc 2140001284 (0x7f8dd404)
		// @007F: ishl
		// @0080: ineg
		// @0081: putfield int game.C_100058_dg.field_101572_H
		// @0084: aload_0
		// @0085: getfield int game.C_100058_dg.field_101579_t
		// @0088: aload_0
		// @0089: getfield int game.C_100058_dg.field_101576_w
		// @008C: imul
		// @008D: aload_0
		// @008E: getfield int game.C_100058_dg.field_101570_N
		// @0091: iconst_2
		// @0092: imul
		// @0093: idiv
		// @0094: istore_3
		// @0095: iload_3
		// @0096: ifne @00AD
		// @0099: aload_0
		// @009A: getfield int game.C_100058_dg.field_101579_t
		// @009D: iconst_m1
		// @009E: ixor
		// @009F: iconst_m1
		// @00A0: if_icmplt @00AB
		// @00A3: goto @00A7
		// @00A6: athrow
		// @00A7: goto @00AD
		// @00AA: athrow
		// @00AB: iconst_1
		// @00AC: istore_3
		// @00AD: aload_0
		// @00AE: dup
		// @00AF: getfield int game.C_100058_dg.field_101579_t
		// @00B2: iconst_1
		// @00B3: iadd
		// @00B4: putfield int game.C_100058_dg.field_101579_t
		// @00B7: aload_0
		// @00B8: getfield int game.C_100058_dg.field_101579_t
		// @00BB: aload_0
		// @00BC: getfield int game.C_100058_dg.field_101576_w
		// @00BF: imul
		// @00C0: aload_0
		// @00C1: getfield int game.C_100058_dg.field_101570_N
		// @00C4: iconst_2
		// @00C5: imul
		// @00C6: idiv
		// @00C7: istore #4
		// @00C9: iconst_0
		// @00CA: iload #4
		// @00CC: if_icmpne @00D2
		// @00CF: iconst_1
		// @00D0: istore #4
		// @00D2: aconst_null
		// @00D3: aload_0
		// @00D4: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @00D7: if_acmpeq @01BF
		// @00DA: aload_0
		// @00DB: getfield game.C_100314_lf[] game.C_100058_dg.field_101561_D
		// @00DE: ifnull @01BF
		// @00E1: goto @00E5
		// @00E4: athrow
		// @00E5: aload_0
		// @00E6: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @00E9: getfield int game.C_100018_wk.field_101539_Y
		// @00EC: bipush 7 (0x07)
		// @00EE: if_icmpeq @0105
		// @00F1: goto @00F5
		// @00F4: athrow
		// @00F5: bipush 9 (0x09)
		// @00F7: aload_0
		// @00F8: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @00FB: getfield int game.C_100018_wk.field_101541_X
		// @00FE: if_icmpne @01BF
		// @0101: goto @0105
		// @0104: athrow
		// @0105: bipush 63 (0x3F)
		// @0107: aload_0
		// @0108: getfield int game.C_100058_dg.field_101579_t
		// @010B: iand
		// @010C: ifne @01BF
		// @010F: goto @0113
		// @0112: athrow
		// @0113: new game.C_100019_wl
		// @0116: dup
		// @0117: aload_0
		// @0118: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @011B: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @011E: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @0121: astore #5
		// @0123: iconst_0
		// @0124: istore #6
		// @0126: aload #5
		// @0128: bipush -128 (0x80)
		// @012A: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @012D: checkcast game.C_100314_lf
		// @0130: astore #7
		// @0132: aconst_null
		// @0133: aload #7
		// @0135: if_acmpeq @0194
		// @0138: iload #6
		// @013A: iconst_m1
		// @013B: ixor
		// @013C: aload_0
		// @013D: getfield game.C_100314_lf[] game.C_100058_dg.field_101561_D
		// @0140: arraylength
		// @0141: iconst_m1
		// @0142: ixor
		// @0143: iload #13
		// @0145: ifne @019F
		// @0148: if_icmpne @0176
		// @014B: goto @014F
		// @014E: athrow
		// @014F: aload_0
		// @0150: getfield game.C_100314_lf[] game.C_100058_dg.field_101561_D
		// @0153: astore #8
		// @0155: aload_0
		// @0156: aload_0
		// @0157: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @015A: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @015D: sipush -14829 (0xC613)
		// @0160: invokevirtual game.C_100202_qi.func_105912_d(int)int
		// @0163: anewarray game.C_100314_lf
		// @0166: putfield game.C_100314_lf[] game.C_100058_dg.field_101561_D
		// @0169: aload #8
		// @016B: iconst_0
		// @016C: aload_0
		// @016D: getfield game.C_100314_lf[] game.C_100058_dg.field_101561_D
		// @0170: iconst_0
		// @0171: iload #6
		// @0173: invokestatic game.C_100120_en.func_104912_a(java.lang.Object[], int, java.lang.Object[], int, int)void
		// @0176: aload_0
		// @0177: getfield game.C_100314_lf[] game.C_100058_dg.field_101561_D
		// @017A: iload #6
		// @017C: aload #7
		// @017E: aastore
		// @017F: iinc #6 +1
		// @0182: aload #5
		// @0184: sipush -30820 (0x879C)
		// @0187: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @018A: checkcast game.C_100314_lf
		// @018D: astore #7
		// @018F: iload #13
		// @0191: ifeq @0132
		// @0194: aload_0
		// @0195: getfield game.C_100314_lf[] game.C_100058_dg.field_101561_D
		// @0198: arraylength
		// @0199: iconst_m1
		// @019A: ixor
		// @019B: iload #6
		// @019D: iconst_m1
		// @019E: ixor
		// @019F: if_icmpge @01BF
		// @01A2: aload_0
		// @01A3: getfield game.C_100314_lf[] game.C_100058_dg.field_101561_D
		// @01A6: iload #6
		// @01A8: aconst_null
		// @01A9: aastore
		// @01AA: iinc #6 +1
		// @01AD: iload #13
		// @01AF: ifne @0952
		// @01B2: goto @01B6
		// @01B5: athrow
		// @01B6: iload #13
		// @01B8: ifeq @0194
		// @01BB: goto @01BF
		// @01BE: athrow
		// @01BF: aload_0
		// @01C0: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @01C3: getfield boolean game.C_100294_ki.field_106969_V
		// @01C6: ifne @094F
		// @01C9: iload #4
		// @01CB: iload_3
		// @01CC: if_icmple @094F
		// @01CF: goto @01D3
		// @01D2: athrow
		// @01D3: ldc2_w 2.0
		// @01D6: invokestatic java.lang.Math.random()double
		// @01D9: ldc2_w 3.141592653589793
		// @01DC: dmul
		// @01DD: dmul
		// @01DE: dstore #5
		// @01E0: aconst_null
		// @01E1: astore #7
		// @01E3: iconst_m1
		// @01E4: aload_0
		// @01E5: getfield int game.C_100058_dg.field_101571_O
		// @01E8: iconst_m1
		// @01E9: ixor
		// @01EA: iload #13
		// @01EC: ifne @001E
		// @01EF: if_icmpne @0318
		// @01F2: invokestatic java.lang.Math.random()double
		// @01F5: aload_0
		// @01F6: getfield int game.C_100058_dg.field_101570_N
		// @01F9: aload_0
		// @01FA: getfield int game.C_100058_dg.field_101579_t
		// @01FD: ineg
		// @01FE: iadd
		// @01FF: i2d
		// @0200: dmul
		// @0201: ldc2_w 4.0
		// @0204: ddiv
		// @0205: aload_0
		// @0206: getfield int game.C_100058_dg.field_101579_t
		// @0209: i2d
		// @020A: dadd
		// @020B: aload_0
		// @020C: getfield int game.C_100058_dg.field_101565_A
		// @020F: i2d
		// @0210: dmul
		// @0211: aload_0
		// @0212: getfield int game.C_100058_dg.field_101570_N
		// @0215: i2d
		// @0216: ddiv
		// @0217: dconst_1
		// @0218: dadd
		// @0219: dstore #8
		// @021B: dload #8
		// @021D: dload #5
		// @021F: invokestatic java.lang.Math.sin(double)double
		// @0222: dmul
		// @0223: d2i
		// @0224: ldc -1828760060 (0x92ff5604)
		// @0226: ishl
		// @0227: istore #10
		// @0229: dload #5
		// @022B: invokestatic java.lang.Math.cos(double)double
		// @022E: dload #8
		// @0230: dmul
		// @0231: d2i
		// @0232: ldc -503883164 (0xe1f75a64)
		// @0234: ishl
		// @0235: istore #11
		// @0237: aload_0
		// @0238: getfield int game.C_100058_dg.field_101582_z
		// @023B: iconst_0
		// @023C: aload_0
		// @023D: getfield boolean game.C_100058_dg.field_101566_B
		// @0240: aload_0
		// @0241: getfield int game.C_100058_dg.field_101572_H
		// @0244: iload #11
		// @0246: iconst_2
		// @0247: idiv
		// @0248: ineg
		// @0249: isub
		// @024A: iconst_0
		// @024B: aload_0
		// @024C: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @024F: bipush -124 (0x84)
		// @0251: iload #10
		// @0253: iconst_2
		// @0254: idiv
		// @0255: aload_0
		// @0256: getfield int game.C_100058_dg.field_101583_y
		// @0259: iadd
		// @025A: iconst_1
		// @025B: sipush 150 (0x0096)
		// @025E: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0261: astore #7
		// @0263: aload_0
		// @0264: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0267: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @026A: bipush 123 (0x7B)
		// @026C: aload #7
		// @026E: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0271: aload_0
		// @0272: getfield int game.C_100058_dg.field_101579_t
		// @0275: iconst_m1
		// @0276: ixor
		// @0277: bipush -11 (0xF5)
		// @0279: if_icmple @02C9
		// @027C: bipush 25 (0x19)
		// @027E: istore #12
		// @0280: aload_0
		// @0281: getfield int game.C_100058_dg.field_101582_z
		// @0284: iload #10
		// @0286: iload #12
		// @0288: imul
		// @0289: i2d
		// @028A: dload #8
		// @028C: ddiv
		// @028D: d2i
		// @028E: aload_0
		// @028F: getfield boolean game.C_100058_dg.field_101566_B
		// @0292: aload_0
		// @0293: getfield int game.C_100058_dg.field_101572_H
		// @0296: iload #11
		// @0298: iadd
		// @0299: iload #12
		// @029B: iload #11
		// @029D: imul
		// @029E: i2d
		// @029F: dload #8
		// @02A1: ddiv
		// @02A2: d2i
		// @02A3: aload_0
		// @02A4: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @02A7: bipush -124 (0x84)
		// @02A9: iload #10
		// @02AB: aload_0
		// @02AC: getfield int game.C_100058_dg.field_101583_y
		// @02AF: iadd
		// @02B0: bipush 10 (0x0A)
		// @02B2: bipush 100 (0x64)
		// @02B4: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @02B7: astore #7
		// @02B9: aload_0
		// @02BA: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @02BD: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @02C0: iload_1
		// @02C1: bipush 14 (0x0E)
		// @02C3: iadd
		// @02C4: aload #7
		// @02C6: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @02C9: aload_0
		// @02CA: getfield int game.C_100058_dg.field_101582_z
		// @02CD: iload #10
		// @02CF: ldc 1167372836 (0x4594b224)
		// @02D1: ishr
		// @02D2: aload_0
		// @02D3: getfield boolean game.C_100058_dg.field_101566_B
		// @02D6: iload #11
		// @02D8: iconst_2
		// @02D9: idiv
		// @02DA: aload_0
		// @02DB: getfield int game.C_100058_dg.field_101572_H
		// @02DE: iadd
		// @02DF: iload #11
		// @02E1: ldc 956731396 (0x39069004)
		// @02E3: ishr
		// @02E4: aload_0
		// @02E5: getfield int game.C_100058_dg.field_101579_t
		// @02E8: bipush 10 (0x0A)
		// @02EA: imul
		// @02EB: ineg
		// @02EC: iadd
		// @02ED: aload_0
		// @02EE: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @02F1: bipush -124 (0x84)
		// @02F3: iload #10
		// @02F5: iconst_2
		// @02F6: idiv
		// @02F7: aload_0
		// @02F8: getfield int game.C_100058_dg.field_101583_y
		// @02FB: iadd
		// @02FC: iconst_0
		// @02FD: sipush 300 (0x012C)
		// @0300: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0303: astore #7
		// @0305: aload_0
		// @0306: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0309: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @030C: iload_1
		// @030D: bipush 21 (0x15)
		// @030F: ixor
		// @0310: aload #7
		// @0312: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0315: goto @0947
		// @0318: bipush -2 (0xFE)
		// @031A: aload_0
		// @031B: getfield int game.C_100058_dg.field_101571_O
		// @031E: iconst_m1
		// @031F: ixor
		// @0320: if_icmpne @039A
		// @0323: invokestatic java.lang.Math.random()double
		// @0326: aload_0
		// @0327: getfield int game.C_100058_dg.field_101579_t
		// @032A: ineg
		// @032B: aload_0
		// @032C: getfield int game.C_100058_dg.field_101570_N
		// @032F: iadd
		// @0330: iconst_4
		// @0331: idiv
		// @0332: aload_0
		// @0333: getfield int game.C_100058_dg.field_101579_t
		// @0336: iadd
		// @0337: i2d
		// @0338: dmul
		// @0339: aload_0
		// @033A: getfield int game.C_100058_dg.field_101565_A
		// @033D: i2d
		// @033E: dmul
		// @033F: aload_0
		// @0340: getfield int game.C_100058_dg.field_101570_N
		// @0343: i2d
		// @0344: ddiv
		// @0345: dstore #8
		// @0347: dload #8
		// @0349: dload #5
		// @034B: invokestatic java.lang.Math.sin(double)double
		// @034E: dmul
		// @034F: d2i
		// @0350: ldc -2032946556 (0x86d3b284)
		// @0352: ishl
		// @0353: istore #10
		// @0355: dload #5
		// @0357: invokestatic java.lang.Math.cos(double)double
		// @035A: dload #8
		// @035C: dmul
		// @035D: d2i
		// @035E: ldc 1817574724 (0x6c55fd44)
		// @0360: ishl
		// @0361: istore #11
		// @0363: aload_0
		// @0364: getfield int game.C_100058_dg.field_101582_z
		// @0367: iconst_0
		// @0368: aload_0
		// @0369: getfield boolean game.C_100058_dg.field_101566_B
		// @036C: iload #11
		// @036E: aload_0
		// @036F: getfield int game.C_100058_dg.field_101572_H
		// @0372: iadd
		// @0373: iconst_0
		// @0374: aload_0
		// @0375: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0378: bipush -124 (0x84)
		// @037A: aload_0
		// @037B: getfield int game.C_100058_dg.field_101583_y
		// @037E: iload #10
		// @0380: iadd
		// @0381: iconst_3
		// @0382: bipush 50 (0x32)
		// @0384: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0387: astore #7
		// @0389: aload_0
		// @038A: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @038D: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0390: bipush 123 (0x7B)
		// @0392: aload #7
		// @0394: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0397: goto @0947
		// @039A: iconst_2
		// @039B: aload_0
		// @039C: getfield int game.C_100058_dg.field_101571_O
		// @039F: if_icmpne @04C4
		// @03A2: invokestatic java.lang.Math.random()double
		// @03A5: aload_0
		// @03A6: getfield int game.C_100058_dg.field_101579_t
		// @03A9: ineg
		// @03AA: aload_0
		// @03AB: getfield int game.C_100058_dg.field_101570_N
		// @03AE: iadd
		// @03AF: i2d
		// @03B0: dmul
		// @03B1: ldc2_w 4.0
		// @03B4: ddiv
		// @03B5: aload_0
		// @03B6: getfield int game.C_100058_dg.field_101579_t
		// @03B9: i2d
		// @03BA: dadd
		// @03BB: aload_0
		// @03BC: getfield int game.C_100058_dg.field_101565_A
		// @03BF: i2d
		// @03C0: dmul
		// @03C1: aload_0
		// @03C2: getfield int game.C_100058_dg.field_101570_N
		// @03C5: i2d
		// @03C6: ddiv
		// @03C7: dstore #8
		// @03C9: dload #8
		// @03CB: dload #5
		// @03CD: invokestatic java.lang.Math.sin(double)double
		// @03D0: dmul
		// @03D1: d2i
		// @03D2: ldc -1563038300 (0xa2d5eda4)
		// @03D4: ishl
		// @03D5: istore #10
		// @03D7: dload #5
		// @03D9: invokestatic java.lang.Math.cos(double)double
		// @03DC: dload #8
		// @03DE: dmul
		// @03DF: d2i
		// @03E0: ldc 888318116 (0x34f2a8a4)
		// @03E2: ishl
		// @03E3: istore #11
		// @03E5: aload_0
		// @03E6: getfield int game.C_100058_dg.field_101582_z
		// @03E9: iconst_0
		// @03EA: aload_0
		// @03EB: getfield boolean game.C_100058_dg.field_101566_B
		// @03EE: iload #11
		// @03F0: iconst_2
		// @03F1: idiv
		// @03F2: aload_0
		// @03F3: getfield int game.C_100058_dg.field_101572_H
		// @03F6: iadd
		// @03F7: iconst_0
		// @03F8: aload_0
		// @03F9: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @03FC: bipush -124 (0x84)
		// @03FE: iload #10
		// @0400: iconst_2
		// @0401: idiv
		// @0402: aload_0
		// @0403: getfield int game.C_100058_dg.field_101583_y
		// @0406: iadd
		// @0407: iconst_1
		// @0408: bipush 50 (0x32)
		// @040A: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @040D: astore #7
		// @040F: aload_0
		// @0410: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0413: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0416: bipush 126 (0x7E)
		// @0418: aload #7
		// @041A: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @041D: iconst_0
		// @041E: istore #12
		// @0420: iload #12
		// @0422: iconst_5
		// @0423: if_icmpge @0485
		// @0426: aload_0
		// @0427: getfield int game.C_100058_dg.field_101582_z
		// @042A: iload #10
		// @042C: ldc 1621302245 (0x60a31be5)
		// @042E: ishr
		// @042F: invokestatic java.lang.Math.random()double
		// @0432: ldc2_w 128.0
		// @0435: dmul
		// @0436: ldc2_w 64.0
		// @0439: dsub
		// @043A: d2i
		// @043B: iadd
		// @043C: aload_0
		// @043D: getfield boolean game.C_100058_dg.field_101566_B
		// @0440: aload_0
		// @0441: getfield int game.C_100058_dg.field_101572_H
		// @0444: iload #11
		// @0446: iconst_2
		// @0447: idiv
		// @0448: ineg
		// @0449: isub
		// @044A: iload #11
		// @044C: ldc -1257015867 (0xb51375c5)
		// @044E: ishr
		// @044F: ldc2_w 128.0
		// @0452: invokestatic java.lang.Math.random()double
		// @0455: dmul
		// @0456: ldc2_w 64.0
		// @0459: dsub
		// @045A: d2i
		// @045B: iadd
		// @045C: aload_0
		// @045D: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0460: bipush -124 (0x84)
		// @0462: iload #10
		// @0464: iconst_2
		// @0465: idiv
		// @0466: aload_0
		// @0467: getfield int game.C_100058_dg.field_101583_y
		// @046A: iadd
		// @046B: iconst_0
		// @046C: sipush 200 (0x00C8)
		// @046F: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0472: astore #7
		// @0474: iinc #12 +1
		// @0477: iload #13
		// @0479: ifne @04C1
		// @047C: iload #13
		// @047E: ifeq @0420
		// @0481: goto @0485
		// @0484: athrow
		// @0485: aload_0
		// @0486: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0489: getfield int game.C_100018_wk.field_101541_X
		// @048C: iconst_m1
		// @048D: ixor
		// @048E: bipush -33 (0xDF)
		// @0490: if_icmpeq @04B3
		// @0493: iconst_1
		// @0494: aload_0
		// @0495: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0498: getfield int game.C_100018_wk.field_101541_X
		// @049B: iconst_m1
		// @049C: ixor
		// @049D: if_icmpne @04A8
		// @04A0: goto @04A4
		// @04A3: athrow
		// @04A4: goto @04B3
		// @04A7: athrow
		// @04A8: aload_0
		// @04A9: getfield int game.C_100058_dg.field_101583_y
		// @04AC: bipush 91 (0x5B)
		// @04AE: iconst_1
		// @04AF: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @04B2: pop
		// @04B3: aload_0
		// @04B4: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @04B7: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @04BA: bipush 125 (0x7D)
		// @04BC: aload #7
		// @04BE: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @04C1: goto @0947
		// @04C4: iconst_3
		// @04C5: aload_0
		// @04C6: getfield int game.C_100058_dg.field_101571_O
		// @04C9: if_icmpeq @08D3
		// @04CC: bipush -5 (0xFB)
		// @04CE: aload_0
		// @04CF: getfield int game.C_100058_dg.field_101571_O
		// @04D2: iconst_m1
		// @04D3: ixor
		// @04D4: if_icmpeq @0811
		// @04D7: goto @04DB
		// @04DA: athrow
		// @04DB: iconst_5
		// @04DC: aload_0
		// @04DD: getfield int game.C_100058_dg.field_101571_O
		// @04E0: if_icmpeq @0732
		// @04E3: goto @04E7
		// @04E6: athrow
		// @04E7: aload_0
		// @04E8: getfield int game.C_100058_dg.field_101571_O
		// @04EB: iconst_m1
		// @04EC: ixor
		// @04ED: bipush -7 (0xF9)
		// @04EF: if_icmpeq @06AC
		// @04F2: goto @04F6
		// @04F5: athrow
		// @04F6: aload_0
		// @04F7: getfield int game.C_100058_dg.field_101571_O
		// @04FA: iconst_m1
		// @04FB: ixor
		// @04FC: bipush -8 (0xF8)
		// @04FE: if_icmpne @057F
		// @0501: goto @0505
		// @0504: athrow
		// @0505: invokestatic java.lang.Math.random()double
		// @0508: aload_0
		// @0509: getfield int game.C_100058_dg.field_101579_t
		// @050C: ineg
		// @050D: aload_0
		// @050E: getfield int game.C_100058_dg.field_101570_N
		// @0511: iadd
		// @0512: iconst_4
		// @0513: idiv
		// @0514: aload_0
		// @0515: getfield int game.C_100058_dg.field_101579_t
		// @0518: ineg
		// @0519: isub
		// @051A: i2d
		// @051B: dmul
		// @051C: aload_0
		// @051D: getfield int game.C_100058_dg.field_101565_A
		// @0520: i2d
		// @0521: dmul
		// @0522: aload_0
		// @0523: getfield int game.C_100058_dg.field_101570_N
		// @0526: i2d
		// @0527: ddiv
		// @0528: dstore #8
		// @052A: dload #8
		// @052C: dload #5
		// @052E: invokestatic java.lang.Math.sin(double)double
		// @0531: dmul
		// @0532: d2i
		// @0533: ldc 209595908 (0xc7e2e04)
		// @0535: ishl
		// @0536: istore #10
		// @0538: dload #5
		// @053A: invokestatic java.lang.Math.cos(double)double
		// @053D: dload #8
		// @053F: dmul
		// @0540: d2i
		// @0541: ldc -805872060 (0xcff75e44)
		// @0543: ishl
		// @0544: istore #11
		// @0546: aload_0
		// @0547: getfield int game.C_100058_dg.field_101582_z
		// @054A: iconst_0
		// @054B: aload_0
		// @054C: getfield boolean game.C_100058_dg.field_101566_B
		// @054F: aload_0
		// @0550: getfield int game.C_100058_dg.field_101572_H
		// @0553: iload #11
		// @0555: iadd
		// @0556: iconst_0
		// @0557: aload_0
		// @0558: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @055B: bipush -124 (0x84)
		// @055D: aload_0
		// @055E: getfield int game.C_100058_dg.field_101583_y
		// @0561: iload #10
		// @0563: iadd
		// @0564: iconst_4
		// @0565: bipush 100 (0x64)
		// @0567: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @056A: astore #7
		// @056C: aload_0
		// @056D: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0570: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0573: iload_1
		// @0574: bipush 14 (0x0E)
		// @0576: iadd
		// @0577: aload #7
		// @0579: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @057C: goto @0947
		// @057F: bipush -9 (0xF7)
		// @0581: aload_0
		// @0582: getfield int game.C_100058_dg.field_101571_O
		// @0585: iconst_m1
		// @0586: ixor
		// @0587: if_icmpeq @060A
		// @058A: aload_0
		// @058B: getfield int game.C_100058_dg.field_101571_O
		// @058E: bipush 9 (0x09)
		// @0590: if_icmpeq @059B
		// @0593: goto @0597
		// @0596: athrow
		// @0597: goto @0947
		// @059A: athrow
		// @059B: invokestatic java.lang.Math.random()double
		// @059E: aload_0
		// @059F: getfield int game.C_100058_dg.field_101579_t
		// @05A2: ineg
		// @05A3: aload_0
		// @05A4: getfield int game.C_100058_dg.field_101570_N
		// @05A7: iadd
		// @05A8: iconst_4
		// @05A9: idiv
		// @05AA: aload_0
		// @05AB: getfield int game.C_100058_dg.field_101579_t
		// @05AE: iadd
		// @05AF: i2d
		// @05B0: dmul
		// @05B1: aload_0
		// @05B2: getfield int game.C_100058_dg.field_101565_A
		// @05B5: i2d
		// @05B6: dmul
		// @05B7: aload_0
		// @05B8: getfield int game.C_100058_dg.field_101570_N
		// @05BB: i2d
		// @05BC: ddiv
		// @05BD: dstore #8
		// @05BF: dload #5
		// @05C1: invokestatic java.lang.Math.sin(double)double
		// @05C4: dconst_0
		// @05C5: dcmpg
		// @05C6: ifge @05CE
		// @05C9: iconst_m1
		// @05CA: goto @05CF
		// @05CD: athrow
		// @05CE: iconst_1
		// @05CF: i2d
		// @05D0: dload #8
		// @05D2: dmul
		// @05D3: d2i
		// @05D4: ldc -498157436 (0xe24eb884)
		// @05D6: ishl
		// @05D7: istore #10
		// @05D9: aload_0
		// @05DA: getfield int game.C_100058_dg.field_101582_z
		// @05DD: iconst_0
		// @05DE: aload_0
		// @05DF: getfield boolean game.C_100058_dg.field_101566_B
		// @05E2: iconst_0
		// @05E3: iconst_0
		// @05E4: aload_0
		// @05E5: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @05E8: bipush -124 (0x84)
		// @05EA: iload #10
		// @05EC: aload_0
		// @05ED: getfield int game.C_100058_dg.field_101583_y
		// @05F0: iadd
		// @05F1: iconst_0
		// @05F2: bipush 50 (0x32)
		// @05F4: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @05F7: astore #7
		// @05F9: aload_0
		// @05FA: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @05FD: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0600: bipush 127 (0x7F)
		// @0602: aload #7
		// @0604: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0607: goto @0947
		// @060A: aload_0
		// @060B: getfield int game.C_100058_dg.field_101565_A
		// @060E: aload_0
		// @060F: getfield int game.C_100058_dg.field_101579_t
		// @0612: imul
		// @0613: aload_0
		// @0614: getfield int game.C_100058_dg.field_101570_N
		// @0617: idiv
		// @0618: i2d
		// @0619: dstore #8
		// @061B: dload #8
		// @061D: ldc2_w 0.2
		// @0620: iload_3
		// @0621: i2d
		// @0622: dmul
		// @0623: invokestatic java.lang.Math.sin(double)double
		// @0626: dmul
		// @0627: d2i
		// @0628: ldc 591255908 (0x233dd964)
		// @062A: ishl
		// @062B: istore #10
		// @062D: dload #8
		// @062F: ldc2_w 0.2
		// @0632: iload_3
		// @0633: i2d
		// @0634: dmul
		// @0635: invokestatic java.lang.Math.cos(double)double
		// @0638: dmul
		// @0639: d2i
		// @063A: ldc -1655315452 (0x9d55e404)
		// @063C: ishl
		// @063D: istore #11
		// @063F: aload_0
		// @0640: getfield int game.C_100058_dg.field_101582_z
		// @0643: iconst_0
		// @0644: aload_0
		// @0645: getfield boolean game.C_100058_dg.field_101566_B
		// @0648: aload_0
		// @0649: getfield int game.C_100058_dg.field_101572_H
		// @064C: iload #11
		// @064E: iadd
		// @064F: iconst_0
		// @0650: aload_0
		// @0651: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0654: bipush -124 (0x84)
		// @0656: aload_0
		// @0657: getfield int game.C_100058_dg.field_101583_y
		// @065A: iload #10
		// @065C: ineg
		// @065D: isub
		// @065E: iconst_5
		// @065F: bipush 100 (0x64)
		// @0661: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0664: astore #7
		// @0666: aload_0
		// @0667: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @066A: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @066D: bipush 125 (0x7D)
		// @066F: aload #7
		// @0671: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0674: aload_0
		// @0675: getfield int game.C_100058_dg.field_101582_z
		// @0678: iconst_0
		// @0679: aload_0
		// @067A: getfield boolean game.C_100058_dg.field_101566_B
		// @067D: aload_0
		// @067E: getfield int game.C_100058_dg.field_101572_H
		// @0681: iload #11
		// @0683: isub
		// @0684: iconst_0
		// @0685: aload_0
		// @0686: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0689: bipush -124 (0x84)
		// @068B: iload #10
		// @068D: ineg
		// @068E: aload_0
		// @068F: getfield int game.C_100058_dg.field_101583_y
		// @0692: iadd
		// @0693: iconst_5
		// @0694: bipush 100 (0x64)
		// @0696: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0699: astore #7
		// @069B: aload_0
		// @069C: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @069F: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @06A2: bipush 127 (0x7F)
		// @06A4: aload #7
		// @06A6: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @06A9: goto @0947
		// @06AC: invokestatic java.lang.Math.random()double
		// @06AF: aload_0
		// @06B0: getfield int game.C_100058_dg.field_101579_t
		// @06B3: aload_0
		// @06B4: getfield int game.C_100058_dg.field_101579_t
		// @06B7: ineg
		// @06B8: aload_0
		// @06B9: getfield int game.C_100058_dg.field_101570_N
		// @06BC: iadd
		// @06BD: iconst_4
		// @06BE: idiv
		// @06BF: iadd
		// @06C0: i2d
		// @06C1: dmul
		// @06C2: aload_0
		// @06C3: getfield int game.C_100058_dg.field_101565_A
		// @06C6: i2d
		// @06C7: dmul
		// @06C8: aload_0
		// @06C9: getfield int game.C_100058_dg.field_101570_N
		// @06CC: i2d
		// @06CD: ddiv
		// @06CE: dstore #8
		// @06D0: dload #8
		// @06D2: dload #5
		// @06D4: invokestatic java.lang.Math.sin(double)double
		// @06D7: dmul
		// @06D8: d2i
		// @06D9: ldc 18242148 (0x1165a64)
		// @06DB: ishl
		// @06DC: istore #10
		// @06DE: dload #8
		// @06E0: dload #5
		// @06E2: invokestatic java.lang.Math.cos(double)double
		// @06E5: dmul
		// @06E6: d2i
		// @06E7: ldc -1588166428 (0xa15680e4)
		// @06E9: ishl
		// @06EA: istore #11
		// @06EC: aload_0
		// @06ED: getfield int game.C_100058_dg.field_101582_z
		// @06F0: iconst_0
		// @06F1: aload_0
		// @06F2: getfield boolean game.C_100058_dg.field_101566_B
		// @06F5: aload_0
		// @06F6: getfield int game.C_100058_dg.field_101572_H
		// @06F9: iload #11
		// @06FB: iadd
		// @06FC: iconst_0
		// @06FD: aload_0
		// @06FE: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0701: bipush -124 (0x84)
		// @0703: aload_0
		// @0704: getfield int game.C_100058_dg.field_101583_y
		// @0707: iload #10
		// @0709: ineg
		// @070A: isub
		// @070B: iconst_0
		// @070C: bipush 100 (0x64)
		// @070E: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0711: astore #7
		// @0713: aload #7
		// @0715: ldc2_w 2000.0
		// @0718: invokestatic java.lang.Math.random()double
		// @071B: dneg
		// @071C: dmul
		// @071D: d2i
		// @071E: putfield int game.C_100059_df.field_101607_Q
		// @0721: aload_0
		// @0722: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0725: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0728: bipush 125 (0x7D)
		// @072A: aload #7
		// @072C: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @072F: goto @0947
		// @0732: invokestatic java.lang.Math.random()double
		// @0735: aload_0
		// @0736: getfield int game.C_100058_dg.field_101579_t
		// @0739: ineg
		// @073A: aload_0
		// @073B: getfield int game.C_100058_dg.field_101570_N
		// @073E: iadd
		// @073F: iconst_4
		// @0740: idiv
		// @0741: aload_0
		// @0742: getfield int game.C_100058_dg.field_101579_t
		// @0745: ineg
		// @0746: isub
		// @0747: i2d
		// @0748: dmul
		// @0749: aload_0
		// @074A: getfield int game.C_100058_dg.field_101565_A
		// @074D: i2d
		// @074E: dmul
		// @074F: aload_0
		// @0750: getfield int game.C_100058_dg.field_101570_N
		// @0753: i2d
		// @0754: ddiv
		// @0755: dstore #8
		// @0757: dload #8
		// @0759: dload #5
		// @075B: invokestatic java.lang.Math.sin(double)double
		// @075E: dmul
		// @075F: d2i
		// @0760: ldc 1094484676 (0x413c82c4)
		// @0762: ishl
		// @0763: istore #10
		// @0765: dload #8
		// @0767: dload #5
		// @0769: invokestatic java.lang.Math.cos(double)double
		// @076C: dmul
		// @076D: d2i
		// @076E: ldc -329608252 (0xec5a93c4)
		// @0770: ishl
		// @0771: istore #11
		// @0773: aload_0
		// @0774: getfield int game.C_100058_dg.field_101582_z
		// @0777: iconst_0
		// @0778: aload_0
		// @0779: getfield boolean game.C_100058_dg.field_101566_B
		// @077C: sipush -3584 (0xF200)
		// @077F: aload_0
		// @0780: getfield int game.C_100058_dg.field_101572_H
		// @0783: iload #11
		// @0785: sipush 256 (0x0100)
		// @0788: idiv
		// @0789: iadd
		// @078A: iadd
		// @078B: iconst_0
		// @078C: aload_0
		// @078D: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0790: bipush -124 (0x84)
		// @0792: iload #10
		// @0794: sipush 256 (0x0100)
		// @0797: idiv
		// @0798: aload_0
		// @0799: getfield int game.C_100058_dg.field_101583_y
		// @079C: iadd
		// @079D: iconst_5
		// @079E: bipush 100 (0x64)
		// @07A0: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @07A3: astore #7
		// @07A5: aload_0
		// @07A6: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @07A9: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @07AC: iload_1
		// @07AD: bipush 16 (0x10)
		// @07AF: iadd
		// @07B0: aload #7
		// @07B2: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @07B5: dload #8
		// @07B7: iload_3
		// @07B8: i2d
		// @07B9: ldc2_w 0.2
		// @07BC: dmul
		// @07BD: invokestatic java.lang.Math.sin(double)double
		// @07C0: dmul
		// @07C1: d2i
		// @07C2: ldc -1209883164 (0xb7e2a5e4)
		// @07C4: ishl
		// @07C5: istore #10
		// @07C7: dload #8
		// @07C9: iload_3
		// @07CA: i2d
		// @07CB: ldc2_w 0.2
		// @07CE: dmul
		// @07CF: invokestatic java.lang.Math.cos(double)double
		// @07D2: dmul
		// @07D3: d2i
		// @07D4: ldc 1928547300 (0x72f34be4)
		// @07D6: ishl
		// @07D7: istore #11
		// @07D9: aload_0
		// @07DA: getfield int game.C_100058_dg.field_101582_z
		// @07DD: iconst_0
		// @07DE: aload_0
		// @07DF: getfield boolean game.C_100058_dg.field_101566_B
		// @07E2: aload_0
		// @07E3: getfield int game.C_100058_dg.field_101572_H
		// @07E6: iload #11
		// @07E8: ineg
		// @07E9: isub
		// @07EA: iconst_0
		// @07EB: aload_0
		// @07EC: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @07EF: bipush -124 (0x84)
		// @07F1: aload_0
		// @07F2: getfield int game.C_100058_dg.field_101583_y
		// @07F5: iload #10
		// @07F7: iadd
		// @07F8: iconst_5
		// @07F9: bipush 100 (0x64)
		// @07FB: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @07FE: astore #7
		// @0800: aload_0
		// @0801: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0804: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0807: bipush 123 (0x7B)
		// @0809: aload #7
		// @080B: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @080E: goto @0947
		// @0811: invokestatic java.lang.Math.random()double
		// @0814: aload_0
		// @0815: getfield int game.C_100058_dg.field_101579_t
		// @0818: ineg
		// @0819: aload_0
		// @081A: getfield int game.C_100058_dg.field_101570_N
		// @081D: iadd
		// @081E: i2d
		// @081F: dmul
		// @0820: ldc2_w 4.0
		// @0823: ddiv
		// @0824: aload_0
		// @0825: getfield int game.C_100058_dg.field_101579_t
		// @0828: i2d
		// @0829: dadd
		// @082A: aload_0
		// @082B: getfield int game.C_100058_dg.field_101565_A
		// @082E: i2d
		// @082F: dmul
		// @0830: aload_0
		// @0831: getfield int game.C_100058_dg.field_101570_N
		// @0834: i2d
		// @0835: ddiv
		// @0836: dstore #8
		// @0838: dload #8
		// @083A: dload #5
		// @083C: invokestatic java.lang.Math.sin(double)double
		// @083F: dmul
		// @0840: d2i
		// @0841: ldc 1869483396 (0x6f6e0d84)
		// @0843: ishl
		// @0844: istore #10
		// @0846: dload #8
		// @0848: dload #5
		// @084A: invokestatic java.lang.Math.cos(double)double
		// @084D: dmul
		// @084E: d2i
		// @084F: ldc 7237636 (0x6e7004)
		// @0851: ishl
		// @0852: istore #11
		// @0854: aload_0
		// @0855: getfield int game.C_100058_dg.field_101582_z
		// @0858: iconst_0
		// @0859: aload_0
		// @085A: getfield boolean game.C_100058_dg.field_101566_B
		// @085D: aload_0
		// @085E: getfield int game.C_100058_dg.field_101572_H
		// @0861: iload #11
		// @0863: ineg
		// @0864: isub
		// @0865: iconst_0
		// @0866: aload_0
		// @0867: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @086A: bipush -124 (0x84)
		// @086C: aload_0
		// @086D: getfield int game.C_100058_dg.field_101583_y
		// @0870: iload #10
		// @0872: ineg
		// @0873: isub
		// @0874: iconst_1
		// @0875: sipush 150 (0x0096)
		// @0878: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @087B: astore #7
		// @087D: aload_0
		// @087E: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0881: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0884: bipush 127 (0x7F)
		// @0886: aload #7
		// @0888: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @088B: aload_0
		// @088C: getfield int game.C_100058_dg.field_101582_z
		// @088F: iload #10
		// @0891: ldc 417338757 (0x18e01585)
		// @0893: ishr
		// @0894: aload_0
		// @0895: getfield boolean game.C_100058_dg.field_101566_B
		// @0898: aload_0
		// @0899: getfield int game.C_100058_dg.field_101572_H
		// @089C: iload #11
		// @089E: iconst_2
		// @089F: idiv
		// @08A0: ineg
		// @08A1: isub
		// @08A2: iload #11
		// @08A4: ldc -173079643 (0xf5af03a5)
		// @08A6: ishr
		// @08A7: aload_0
		// @08A8: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @08AB: bipush -124 (0x84)
		// @08AD: aload_0
		// @08AE: getfield int game.C_100058_dg.field_101583_y
		// @08B1: iload #10
		// @08B3: iconst_2
		// @08B4: idiv
		// @08B5: ineg
		// @08B6: isub
		// @08B7: iconst_0
		// @08B8: sipush 300 (0x012C)
		// @08BB: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @08BE: astore #7
		// @08C0: aload_0
		// @08C1: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @08C4: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @08C7: iload_1
		// @08C8: bipush 15 (0x0F)
		// @08CA: iadd
		// @08CB: aload #7
		// @08CD: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @08D0: goto @0947
		// @08D3: invokestatic java.lang.Math.random()double
		// @08D6: aload_0
		// @08D7: getfield int game.C_100058_dg.field_101579_t
		// @08DA: ineg
		// @08DB: aload_0
		// @08DC: getfield int game.C_100058_dg.field_101570_N
		// @08DF: iadd
		// @08E0: iconst_4
		// @08E1: idiv
		// @08E2: aload_0
		// @08E3: getfield int game.C_100058_dg.field_101579_t
		// @08E6: iadd
		// @08E7: i2d
		// @08E8: dmul
		// @08E9: aload_0
		// @08EA: getfield int game.C_100058_dg.field_101565_A
		// @08ED: i2d
		// @08EE: dmul
		// @08EF: aload_0
		// @08F0: getfield int game.C_100058_dg.field_101570_N
		// @08F3: i2d
		// @08F4: ddiv
		// @08F5: dstore #8
		// @08F7: dload #8
		// @08F9: dload #5
		// @08FB: invokestatic java.lang.Math.sin(double)double
		// @08FE: dmul
		// @08FF: d2i
		// @0900: ldc -1219281628 (0xb7533d24)
		// @0902: ishl
		// @0903: istore #10
		// @0905: dload #5
		// @0907: invokestatic java.lang.Math.cos(double)double
		// @090A: dload #8
		// @090C: dmul
		// @090D: d2i
		// @090E: ldc -1154981692 (0xbb2860c4)
		// @0910: ishl
		// @0911: istore #11
		// @0913: aload_0
		// @0914: getfield int game.C_100058_dg.field_101582_z
		// @0917: iconst_0
		// @0918: aload_0
		// @0919: getfield boolean game.C_100058_dg.field_101566_B
		// @091C: iload #11
		// @091E: aload_0
		// @091F: getfield int game.C_100058_dg.field_101572_H
		// @0922: iadd
		// @0923: iconst_0
		// @0924: aload_0
		// @0925: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0928: bipush -124 (0x84)
		// @092A: aload_0
		// @092B: getfield int game.C_100058_dg.field_101583_y
		// @092E: iload #10
		// @0930: iadd
		// @0931: iconst_4
		// @0932: bipush 100 (0x64)
		// @0934: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0937: astore #7
		// @0939: aload_0
		// @093A: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @093D: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0940: bipush 126 (0x7E)
		// @0942: aload #7
		// @0944: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0947: iinc #3 +1
		// @094A: iload #13
		// @094C: ifeq @01C9
		// @094F: iinc #2 +1
		// @0952: iload #13
		// @0954: ifeq @0019
		// @0957: aload_0
		// @0958: aload_0
		// @0959: getfield int game.C_100058_dg.field_101565_A
		// @095C: aload_0
		// @095D: getfield int game.C_100058_dg.field_101579_t
		// @0960: ineg
		// @0961: aload_0
		// @0962: getfield int game.C_100058_dg.field_101570_N
		// @0965: iadd
		// @0966: iconst_4
		// @0967: idiv
		// @0968: aload_0
		// @0969: getfield int game.C_100058_dg.field_101579_t
		// @096C: iadd
		// @096D: imul
		// @096E: aload_0
		// @096F: getfield int game.C_100058_dg.field_101570_N
		// @0972: idiv
		// @0973: putfield int game.C_100058_dg.field_101563_F
		// @0976: aload_0
		// @0977: getfield boolean game.C_100058_dg.field_101567_C
		// @097A: ifeq @0B22
		// @097D: aload_0
		// @097E: getfield int game.C_100058_dg.field_101563_F
		// @0981: aload_0
		// @0982: getfield int game.C_100058_dg.field_101563_F
		// @0985: imul
		// @0986: istore_2
		// @0987: new game.C_100038_wa
		// @098A: dup
		// @098B: iconst_3
		// @098C: newarray int[]
		// @098E: dup
		// @098F: iconst_0
		// @0990: aload_0
		// @0991: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0994: getfield int game.C_100294_ki.field_106951_E
		// @0997: iastore
		// @0998: dup
		// @0999: iconst_1
		// @099A: aload_0
		// @099B: getfield int game.C_100058_dg.field_101583_y
		// @099E: iastore
		// @099F: dup
		// @09A0: iconst_2
		// @09A1: aload_0
		// @09A2: getfield int game.C_100058_dg.field_101572_H
		// @09A5: iastore
		// @09A6: invokespecial game.C_100038_wa.<init>(int[])void
		// @09A9: astore_3
		// @09AA: new game.C_100019_wl
		// @09AD: dup
		// @09AE: aload_0
		// @09AF: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @09B2: getfield game.C_100202_qi game.C_100294_ki.field_106981_b
		// @09B5: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @09B8: astore #4
		// @09BA: aload #4
		// @09BC: bipush -128 (0x80)
		// @09BE: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @09C1: checkcast game.C_100018_wk
		// @09C4: astore #5
		// @09C6: aload #5
		// @09C8: ifnull @0B22
		// @09CB: aload_0
		// @09CC: getfield int game.C_100058_dg.field_101583_y
		// @09CF: aload #5
		// @09D1: getfield int game.C_100018_wk.field_101514_F
		// @09D4: ineg
		// @09D5: iadd
		// @09D6: ldc 346300260 (0x14a41f64)
		// @09D8: ishr
		// @09D9: istore #6
		// @09DB: aload #5
		// @09DD: getfield int game.C_100018_wk.field_101545_fb
		// @09E0: ineg
		// @09E1: aload_0
		// @09E2: getfield int game.C_100058_dg.field_101572_H
		// @09E5: iadd
		// @09E6: ldc 353195844 (0x150d5744)
		// @09E8: ishr
		// @09E9: istore #7
		// @09EB: bipush -3 (0xFD)
		// @09ED: aload #5
		// @09EF: getfield int game.C_100018_wk.field_101539_Y
		// @09F2: iconst_m1
		// @09F3: ixor
		// @09F4: iload #13
		// @09F6: ifne @13B8
		// @09F9: if_icmpeq @0A1D
		// @09FC: goto @0A00
		// @09FF: athrow
		// @0A00: aload #5
		// @0A02: getfield int game.C_100018_wk.field_101539_Y
		// @0A05: iconst_3
		// @0A06: if_icmpeq @0A1D
		// @0A09: goto @0A0D
		// @0A0C: athrow
		// @0A0D: aload #5
		// @0A0F: getfield int game.C_100018_wk.field_101539_Y
		// @0A12: iconst_m1
		// @0A13: ixor
		// @0A14: bipush -21 (0xEB)
		// @0A16: if_icmpne @0A9B
		// @0A19: goto @0A1D
		// @0A1C: athrow
		// @0A1D: aload #5
		// @0A1F: getfield int game.C_100018_wk.field_101541_X
		// @0A22: iconst_m1
		// @0A23: ixor
		// @0A24: bipush -33 (0xDF)
		// @0A26: if_icmpeq @0A9B
		// @0A29: goto @0A2D
		// @0A2C: athrow
		// @0A2D: iload #7
		// @0A2F: iload #7
		// @0A31: imul
		// @0A32: iload #6
		// @0A34: iload #6
		// @0A36: imul
		// @0A37: iadd
		// @0A38: iload_2
		// @0A39: if_icmple @0A44
		// @0A3C: goto @0A40
		// @0A3F: athrow
		// @0A40: goto @0A9B
		// @0A43: athrow
		// @0A44: bipush -21 (0xEB)
		// @0A46: aload #5
		// @0A48: getfield int game.C_100018_wk.field_101539_Y
		// @0A4B: iconst_m1
		// @0A4C: ixor
		// @0A4D: if_icmpeq @0A5A
		// @0A50: aload #5
		// @0A52: iconst_1
		// @0A53: putfield boolean game.C_100018_wk.field_101523_O
		// @0A56: goto @0A5A
		// @0A59: athrow
		// @0A5A: aload #5
		// @0A5C: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0A5F: ifnull @0A89
		// @0A62: aload #5
		// @0A64: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0A67: aload_0
		// @0A68: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0A6B: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0A6E: if_acmpeq @0A89
		// @0A71: goto @0A75
		// @0A74: athrow
		// @0A75: aload_0
		// @0A76: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0A79: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0A7C: dup
		// @0A7D: getfield int game.C_100314_lf.field_101340_mb
		// @0A80: iconst_1
		// @0A81: iadd
		// @0A82: putfield int game.C_100314_lf.field_101340_mb
		// @0A85: goto @0A89
		// @0A88: athrow
		// @0A89: aload #5
		// @0A8B: iconst_1
		// @0A8C: putfield boolean game.C_100018_wk.field_101522_N
		// @0A8F: aload #5
		// @0A91: aload_0
		// @0A92: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0A95: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0A98: putfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0A9B: aload #5
		// @0A9D: getfield int game.C_100018_wk.field_101539_Y
		// @0AA0: iconst_m1
		// @0AA1: ixor
		// @0AA2: bipush -9 (0xF7)
		// @0AA4: if_icmpne @0B10
		// @0AA7: iload #6
		// @0AA9: iload #6
		// @0AAB: imul
		// @0AAC: iload #7
		// @0AAE: iload #7
		// @0AB0: imul
		// @0AB1: iadd
		// @0AB2: iload_2
		// @0AB3: if_icmpgt @0B10
		// @0AB6: goto @0ABA
		// @0AB9: athrow
		// @0ABA: aload_3
		// @0ABB: bipush -4 (0xFC)
		// @0ABD: bipush 100 (0x64)
		// @0ABF: invokevirtual game.C_100038_wa.func_104063_a(byte, int)int
		// @0AC2: bipush 8 (0x08)
		// @0AC4: if_icmple @0ACF
		// @0AC7: goto @0ACB
		// @0ACA: athrow
		// @0ACB: goto @0B10
		// @0ACE: athrow
		// @0ACF: aload #5
		// @0AD1: iconst_1
		// @0AD2: putfield boolean game.C_100018_wk.field_101522_N
		// @0AD5: aload #5
		// @0AD7: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0ADA: ifnull @0B04
		// @0ADD: aload #5
		// @0ADF: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0AE2: aload_0
		// @0AE3: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0AE6: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0AE9: if_acmpeq @0B04
		// @0AEC: goto @0AF0
		// @0AEF: athrow
		// @0AF0: aload_0
		// @0AF1: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0AF4: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0AF7: dup
		// @0AF8: getfield int game.C_100314_lf.field_101340_mb
		// @0AFB: iconst_1
		// @0AFC: iadd
		// @0AFD: putfield int game.C_100314_lf.field_101340_mb
		// @0B00: goto @0B04
		// @0B03: athrow
		// @0B04: aload #5
		// @0B06: aload_0
		// @0B07: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0B0A: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0B0D: putfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0B10: aload #4
		// @0B12: sipush -30820 (0x879C)
		// @0B15: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @0B18: checkcast game.C_100018_wk
		// @0B1B: astore #5
		// @0B1D: iload #13
		// @0B1F: ifeq @09C6
		// @0B22: aload_0
		// @0B23: getfield game.C_100314_lf[] game.C_100058_dg.field_101561_D
		// @0B26: ifnull @13B3
		// @0B29: aload_0
		// @0B2A: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0B2D: getfield int game.C_100018_wk.field_101546_w
		// @0B30: iconst_m1
		// @0B31: ixor
		// @0B32: iconst_m1
		// @0B33: if_icmplt @0B3E
		// @0B36: goto @0B3A
		// @0B39: athrow
		// @0B3A: goto @13B3
		// @0B3D: athrow
		// @0B3E: iconst_0
		// @0B3F: istore_2
		// @0B40: aload_0
		// @0B41: getfield game.C_100314_lf[] game.C_100058_dg.field_101561_D
		// @0B44: arraylength
		// @0B45: iconst_m1
		// @0B46: ixor
		// @0B47: iload_2
		// @0B48: iconst_m1
		// @0B49: ixor
		// @0B4A: if_icmpge @13B3
		// @0B4D: aload_0
		// @0B4E: getfield game.C_100314_lf[] game.C_100058_dg.field_101561_D
		// @0B51: iload_2
		// @0B52: aaload
		// @0B53: astore_3
		// @0B54: iload #13
		// @0B56: ifne @13BE
		// @0B59: aload_3
		// @0B5A: ifnull @13AB
		// @0B5D: goto @0B61
		// @0B60: athrow
		// @0B61: aload_3
		// @0B62: getfield boolean game.C_100314_lf.field_101391_lb
		// @0B65: ifne @0B71
		// @0B68: goto @0B6C
		// @0B6B: athrow
		// @0B6C: iconst_1
		// @0B6D: goto @0B72
		// @0B70: athrow
		// @0B71: iconst_0
		// @0B72: aload_0
		// @0B73: getfield boolean game.C_100058_dg.field_101566_B
		// @0B76: if_icmpne @0BAD
		// @0B79: aload_0
		// @0B7A: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0B7D: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0B80: ldc 830205956 (0x317bf004)
		// @0B82: aload_3
		// @0B83: getfield int game.C_100314_lf.field_101377_tc
		// @0B86: ldc -1328261692 (0xb0d455c4)
		// @0B88: ishr
		// @0B89: invokevirtual game.C_100171_cn.func_105563_a(int, int)int
		// @0B8C: iconst_m1
		// @0B8D: ixor
		// @0B8E: aload_0
		// @0B8F: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0B92: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0B95: iload_1
		// @0B96: sipush -25443 (0x9C9D)
		// @0B99: ixor
		// @0B9A: aload_3
		// @0B9B: getfield int game.C_100314_lf.field_101377_tc
		// @0B9E: ldc -134861020 (0xf7f62f24)
		// @0BA0: ishr
		// @0BA1: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @0BA4: iconst_m1
		// @0BA5: ixor
		// @0BA6: if_icmpne @13AB
		// @0BA9: goto @0BAD
		// @0BAC: athrow
		// @0BAD: aload_3
		// @0BAE: getfield int game.C_100314_lf.field_101352_j
		// @0BB1: iconst_m1
		// @0BB2: if_icmpeq @0BD8
		// @0BB5: goto @0BB9
		// @0BB8: athrow
		// @0BB9: aload_3
		// @0BBA: getfield int game.C_100314_lf.field_101352_j
		// @0BBD: iconst_m1
		// @0BBE: ixor
		// @0BBF: aload_0
		// @0BC0: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0BC3: getfield int game.C_100018_wk.field_101541_X
		// @0BC6: iconst_m1
		// @0BC7: ixor
		// @0BC8: if_icmpeq @0BD8
		// @0BCB: goto @0BCF
		// @0BCE: athrow
		// @0BCF: iload #13
		// @0BD1: ifeq @13AB
		// @0BD4: goto @0BD8
		// @0BD7: athrow
		// @0BD8: aload_0
		// @0BD9: getfield int game.C_100058_dg.field_101583_y
		// @0BDC: aload_3
		// @0BDD: getfield int game.C_100314_lf.field_101377_tc
		// @0BE0: isub
		// @0BE1: ldc -395088636 (0xe8736d04)
		// @0BE3: ishr
		// @0BE4: istore #4
		// @0BE6: sipush 768 (0x0300)
		// @0BE9: aload_3
		// @0BEA: getfield int game.C_100314_lf.field_101395_rc
		// @0BED: ineg
		// @0BEE: iadd
		// @0BEF: aload_0
		// @0BF0: getfield int game.C_100058_dg.field_101572_H
		// @0BF3: iadd
		// @0BF4: ldc 874716452 (0x34231d24)
		// @0BF6: ishr
		// @0BF7: istore #5
		// @0BF9: iload #4
		// @0BFB: invokestatic java.lang.Math.abs(int)int
		// @0BFE: aload_0
		// @0BFF: getfield int game.C_100058_dg.field_101563_F
		// @0C02: if_icmpgt @13AB
		// @0C05: iload #4
		// @0C07: iload #4
		// @0C09: imul
		// @0C0A: iload #5
		// @0C0C: iload #5
		// @0C0E: imul
		// @0C0F: iadd
		// @0C10: aload_0
		// @0C11: getfield int game.C_100058_dg.field_101563_F
		// @0C14: aload_0
		// @0C15: getfield int game.C_100058_dg.field_101563_F
		// @0C18: imul
		// @0C19: if_icmpgt @13AB
		// @0C1C: goto @0C20
		// @0C1F: athrow
		// @0C20: aload_0
		// @0C21: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0C24: getfield int game.C_100018_wk.field_101539_Y
		// @0C27: iconst_m1
		// @0C28: ixor
		// @0C29: bipush -10 (0xF6)
		// @0C2B: if_icmpne @0D31
		// @0C2E: goto @0C32
		// @0C31: athrow
		// @0C32: aload_0
		// @0C33: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0C36: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0C39: ifnull @0D31
		// @0C3C: goto @0C40
		// @0C3F: athrow
		// @0C40: iconst_1
		// @0C41: aload_0
		// @0C42: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0C45: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0C48: getfield int game.C_100314_lf.field_101414_Bc
		// @0C4B: if_icmpeq @0C56
		// @0C4E: goto @0C52
		// @0C51: athrow
		// @0C52: goto @0C81
		// @0C55: athrow
		// @0C56: aload_3
		// @0C57: dup
		// @0C58: getfield int game.C_100314_lf.field_101344_Y
		// @0C5B: ldc 400000 (0x61a80)
		// @0C5D: aload_0
		// @0C5E: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0C61: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0C64: getfield int game.C_100314_lf.field_101392_cc
		// @0C67: imul
		// @0C68: aload_3
		// @0C69: getfield int game.C_100314_lf.field_101332_T
		// @0C6C: idiv
		// @0C6D: iadd
		// @0C6E: putfield int game.C_100314_lf.field_101344_Y
		// @0C71: aload_3
		// @0C72: dup
		// @0C73: getfield int game.C_100314_lf.field_101294_gc
		// @0C76: ldc 80000 (0x13880)
		// @0C78: aload_3
		// @0C79: getfield int game.C_100314_lf.field_101332_T
		// @0C7C: idiv
		// @0C7D: isub
		// @0C7E: putfield int game.C_100314_lf.field_101294_gc
		// @0C81: iconst_2
		// @0C82: aload_0
		// @0C83: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0C86: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0C89: getfield int game.C_100314_lf.field_101414_Bc
		// @0C8C: if_icmpeq @0C93
		// @0C8F: goto @0CF1
		// @0C92: athrow
		// @0C93: aload_0
		// @0C94: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0C97: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0C9A: getfield int game.C_100314_lf.field_101377_tc
		// @0C9D: aload_3
		// @0C9E: getfield int game.C_100314_lf.field_101377_tc
		// @0CA1: if_icmple @0CA8
		// @0CA4: goto @0CB8
		// @0CA7: athrow
		// @0CA8: aload_3
		// @0CA9: dup
		// @0CAA: getfield int game.C_100314_lf.field_101344_Y
		// @0CAD: ldc 200000 (0x30d40)
		// @0CAF: aload_3
		// @0CB0: getfield int game.C_100314_lf.field_101332_T
		// @0CB3: idiv
		// @0CB4: iadd
		// @0CB5: putfield int game.C_100314_lf.field_101344_Y
		// @0CB8: aload_3
		// @0CB9: dup
		// @0CBA: getfield int game.C_100314_lf.field_101294_gc
		// @0CBD: ldc 200000 (0x30d40)
		// @0CBF: aload_3
		// @0CC0: getfield int game.C_100314_lf.field_101332_T
		// @0CC3: idiv
		// @0CC4: isub
		// @0CC5: putfield int game.C_100314_lf.field_101294_gc
		// @0CC8: aload_0
		// @0CC9: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0CCC: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0CCF: getfield int game.C_100314_lf.field_101377_tc
		// @0CD2: iconst_m1
		// @0CD3: ixor
		// @0CD4: aload_3
		// @0CD5: getfield int game.C_100314_lf.field_101377_tc
		// @0CD8: iconst_m1
		// @0CD9: ixor
		// @0CDA: if_icmpge @0CF1
		// @0CDD: aload_3
		// @0CDE: dup
		// @0CDF: getfield int game.C_100314_lf.field_101344_Y
		// @0CE2: ldc 200000 (0x30d40)
		// @0CE4: aload_3
		// @0CE5: getfield int game.C_100314_lf.field_101332_T
		// @0CE8: idiv
		// @0CE9: isub
		// @0CEA: putfield int game.C_100314_lf.field_101344_Y
		// @0CED: goto @0CF1
		// @0CF0: athrow
		// @0CF1: bipush -4 (0xFC)
		// @0CF3: aload_0
		// @0CF4: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0CF7: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0CFA: getfield int game.C_100314_lf.field_101414_Bc
		// @0CFD: iconst_m1
		// @0CFE: ixor
		// @0CFF: if_icmpne @0D31
		// @0D02: aload_3
		// @0D03: dup
		// @0D04: getfield int game.C_100314_lf.field_101294_gc
		// @0D07: ldc 160000 (0x27100)
		// @0D09: aload_3
		// @0D0A: getfield int game.C_100314_lf.field_101332_T
		// @0D0D: idiv
		// @0D0E: isub
		// @0D0F: putfield int game.C_100314_lf.field_101294_gc
		// @0D12: aload_3
		// @0D13: dup
		// @0D14: getfield int game.C_100314_lf.field_101344_Y
		// @0D17: ldc 80000 (0x13880)
		// @0D19: aload_0
		// @0D1A: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0D1D: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0D20: getfield int game.C_100314_lf.field_101392_cc
		// @0D23: imul
		// @0D24: aload_3
		// @0D25: getfield int game.C_100314_lf.field_101332_T
		// @0D28: idiv
		// @0D29: iadd
		// @0D2A: putfield int game.C_100314_lf.field_101344_Y
		// @0D2D: goto @0D31
		// @0D30: athrow
		// @0D31: aload_0
		// @0D32: getfield game.C_100314_lf[] game.C_100058_dg.field_101561_D
		// @0D35: iload_2
		// @0D36: aconst_null
		// @0D37: aastore
		// @0D38: bipush -87 (0xA9)
		// @0D3A: iload #4
		// @0D3C: iload #4
		// @0D3E: imul
		// @0D3F: iload #5
		// @0D41: iload #5
		// @0D43: imul
		// @0D44: ineg
		// @0D45: isub
		// @0D46: invokestatic game.C_100119_ua.func_104896_a(byte, int)int
		// @0D49: istore #6
		// @0D4B: iload #6
		// @0D4D: aload_0
		// @0D4E: getfield int game.C_100058_dg.field_101565_A
		// @0D51: iconst_2
		// @0D52: idiv
		// @0D53: if_icmple @0D68
		// @0D56: bipush -10 (0xF6)
		// @0D58: aload_0
		// @0D59: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0D5C: getfield int game.C_100018_wk.field_101539_Y
		// @0D5F: iconst_m1
		// @0D60: ixor
		// @0D61: if_icmpne @0D76
		// @0D64: goto @0D68
		// @0D67: athrow
		// @0D68: aload_0
		// @0D69: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0D6C: getfield int game.C_100018_wk.field_101546_w
		// @0D6F: istore #7
		// @0D71: iload #13
		// @0D73: ifeq @0D9F
		// @0D76: aload_0
		// @0D77: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0D7A: getfield int game.C_100018_wk.field_101546_w
		// @0D7D: iload #6
		// @0D7F: ineg
		// @0D80: aload_0
		// @0D81: getfield int game.C_100058_dg.field_101565_A
		// @0D84: iadd
		// @0D85: imul
		// @0D86: aload_0
		// @0D87: getfield int game.C_100058_dg.field_101565_A
		// @0D8A: iconst_2
		// @0D8B: idiv
		// @0D8C: idiv
		// @0D8D: istore #7
		// @0D8F: iload #7
		// @0D91: iconst_m1
		// @0D92: ixor
		// @0D93: bipush -2 (0xFE)
		// @0D95: if_icmpgt @0D9C
		// @0D98: goto @0D9F
		// @0D9B: athrow
		// @0D9C: iconst_1
		// @0D9D: istore #7
		// @0D9F: bipush 9 (0x09)
		// @0DA1: aload_0
		// @0DA2: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0DA5: getfield int game.C_100018_wk.field_101539_Y
		// @0DA8: if_icmpeq @11C3
		// @0DAB: aload_3
		// @0DAC: dup
		// @0DAD: getfield int game.C_100314_lf.field_101413_Bb
		// @0DB0: iload #7
		// @0DB2: aload_0
		// @0DB3: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0DB6: getfield int game.C_100018_wk.field_101543_db
		// @0DB9: imul
		// @0DBA: aload_0
		// @0DBB: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0DBE: getfield int game.C_100018_wk.field_101546_w
		// @0DC1: idiv
		// @0DC2: isub
		// @0DC3: putfield int game.C_100314_lf.field_101413_Bb
		// @0DC6: aload_3
		// @0DC7: getfield int game.C_100314_lf.field_101413_Bb
		// @0DCA: iflt @0DD5
		// @0DCD: goto @0DD1
		// @0DD0: athrow
		// @0DD1: goto @0DDA
		// @0DD4: athrow
		// @0DD5: aload_3
		// @0DD6: iconst_0
		// @0DD7: putfield int game.C_100314_lf.field_101413_Bb
		// @0DDA: iconst_0
		// @0DDB: aload_3
		// @0DDC: getfield int game.C_100314_lf.field_101413_Bb
		// @0DDF: if_icmpge @0DF1
		// @0DE2: aload_0
		// @0DE3: getfield int game.C_100058_dg.field_101583_y
		// @0DE6: bipush 27 (0x1B)
		// @0DE8: iconst_1
		// @0DE9: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @0DEC: pop
		// @0DED: goto @0DF1
		// @0DF0: athrow
		// @0DF1: aload_3
		// @0DF2: dup
		// @0DF3: getfield int game.C_100314_lf.field_101413_Bb
		// @0DF6: iload #7
		// @0DF8: isub
		// @0DF9: putfield int game.C_100314_lf.field_101413_Bb
		// @0DFC: aload_3
		// @0DFD: bipush 100 (0x64)
		// @0DFF: putfield int game.C_100314_lf.field_101401_Sb
		// @0E02: iconst_0
		// @0E03: aload_3
		// @0E04: getfield int game.C_100314_lf.field_101413_Bb
		// @0E07: if_icmpgt @0E0E
		// @0E0A: goto @13AB
		// @0E0D: athrow
		// @0E0E: bipush -2 (0xFE)
		// @0E10: aload_0
		// @0E11: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0E14: getfield int game.C_100018_wk.field_101539_Y
		// @0E17: iconst_m1
		// @0E18: ixor
		// @0E19: if_icmpeq @0E63
		// @0E1C: aload_0
		// @0E1D: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0E20: getfield int game.C_100018_wk.field_101539_Y
		// @0E23: iconst_m1
		// @0E24: ixor
		// @0E25: bipush -3 (0xFD)
		// @0E27: if_icmpeq @0E63
		// @0E2A: goto @0E2E
		// @0E2D: athrow
		// @0E2E: iconst_3
		// @0E2F: aload_0
		// @0E30: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0E33: getfield int game.C_100018_wk.field_101539_Y
		// @0E36: if_icmpeq @0E63
		// @0E39: goto @0E3D
		// @0E3C: athrow
		// @0E3D: aload_0
		// @0E3E: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0E41: getfield int game.C_100018_wk.field_101539_Y
		// @0E44: iconst_m1
		// @0E45: ixor
		// @0E46: bipush -21 (0xEB)
		// @0E48: if_icmpeq @0E63
		// @0E4B: goto @0E4F
		// @0E4E: athrow
		// @0E4F: aload_0
		// @0E50: getfield int game.C_100058_dg.field_101583_y
		// @0E53: bipush 55 (0x37)
		// @0E55: iconst_1
		// @0E56: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @0E59: pop
		// @0E5A: iload #13
		// @0E5C: ifeq @0E83
		// @0E5F: goto @0E63
		// @0E62: athrow
		// @0E63: aload_0
		// @0E64: getfield int game.C_100058_dg.field_101583_y
		// @0E67: bipush 51 (0x33)
		// @0E69: iconst_1
		// @0E6A: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @0E6D: pop
		// @0E6E: aload_3
		// @0E6F: bipush 33 (0x21)
		// @0E71: bipush 33 (0x21)
		// @0E73: invokevirtual game.C_100314_lf.func_101288_i(int, int)int
		// @0E76: istore #8
		// @0E78: aload_3
		// @0E79: aload_3
		// @0E7A: getfield int game.C_100314_lf.field_101413_Bb
		// @0E7D: iload #8
		// @0E7F: ishr
		// @0E80: putfield int game.C_100314_lf.field_101413_Bb
		// @0E83: iconst_m1
		// @0E84: aload_3
		// @0E85: getfield int game.C_100314_lf.field_101356_w
		// @0E88: iconst_m1
		// @0E89: ixor
		// @0E8A: if_icmple @0E9B
		// @0E8D: aload_3
		// @0E8E: bipush -125 (0x83)
		// @0E90: aload_0
		// @0E91: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0E94: invokevirtual game.C_100314_lf.func_101276_a(byte, game.C_100018_wk)void
		// @0E97: goto @0E9B
		// @0E9A: athrow
		// @0E9B: aload_3
		// @0E9C: getfield int game.C_100314_lf.field_101356_w
		// @0E9F: ifle @0EB0
		// @0EA2: aload_0
		// @0EA3: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0EA6: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0EA9: ifnonnull @0EEA
		// @0EAC: goto @0EB0
		// @0EAF: athrow
		// @0EB0: iconst_0
		// @0EB1: aload_3
		// @0EB2: getfield int game.C_100314_lf.field_101356_w
		// @0EB5: if_icmpge @10B6
		// @0EB8: goto @0EBC
		// @0EBB: athrow
		// @0EBC: aload_0
		// @0EBD: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0EC0: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0EC3: ifnonnull @10B6
		// @0EC6: goto @0ECA
		// @0EC9: athrow
		// @0ECA: iconst_0
		// @0ECB: aload_3
		// @0ECC: getfield int game.C_100314_lf.field_101297_Ub
		// @0ECF: if_icmpge @0EDA
		// @0ED2: goto @0ED6
		// @0ED5: athrow
		// @0ED6: goto @10B6
		// @0ED9: athrow
		// @0EDA: aload_3
		// @0EDB: aload_3
		// @0EDC: getfield int game.C_100314_lf.field_101413_Bb
		// @0EDF: ineg
		// @0EE0: bipush 30 (0x1E)
		// @0EE2: invokevirtual game.C_100314_lf.func_101262_a(int, int)void
		// @0EE5: iload #13
		// @0EE7: ifeq @10B6
		// @0EEA: aload_0
		// @0EEB: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0EEE: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0EF1: astore #8
		// @0EF3: aload_0
		// @0EF4: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0EF7: getfield game.C_100314_lf game.C_100018_wk.field_101517_A
		// @0EFA: aload_0
		// @0EFB: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0EFE: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0F01: if_acmpeq @0F5E
		// @0F04: aload_0
		// @0F05: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0F08: getfield game.C_100314_lf game.C_100018_wk.field_101517_A
		// @0F0B: ifnull @0F5E
		// @0F0E: goto @0F12
		// @0F11: athrow
		// @0F12: aload_0
		// @0F13: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0F16: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0F19: getfield int game.C_100314_lf.field_101346_Z
		// @0F1C: aload_0
		// @0F1D: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0F20: getfield game.C_100314_lf game.C_100018_wk.field_101517_A
		// @0F23: getfield int game.C_100314_lf.field_101346_Z
		// @0F26: if_icmpeq @0F42
		// @0F29: goto @0F2D
		// @0F2C: athrow
		// @0F2D: aload_0
		// @0F2E: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0F31: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0F34: getfield int game.C_100314_lf.field_101346_Z
		// @0F37: aload_3
		// @0F38: getfield int game.C_100314_lf.field_101346_Z
		// @0F3B: if_icmpeq @0F55
		// @0F3E: goto @0F42
		// @0F41: athrow
		// @0F42: aload_3
		// @0F43: aload_0
		// @0F44: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0F47: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0F4A: if_acmpeq @0F55
		// @0F4D: goto @0F51
		// @0F50: athrow
		// @0F51: goto @0F5E
		// @0F54: athrow
		// @0F55: aload_0
		// @0F56: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @0F59: getfield game.C_100314_lf game.C_100018_wk.field_101517_A
		// @0F5C: astore #8
		// @0F5E: aload_3
		// @0F5F: getfield int game.C_100314_lf.field_101413_Bb
		// @0F62: ineg
		// @0F63: istore #9
		// @0F65: iload #9
		// @0F67: aload_3
		// @0F68: getfield int game.C_100314_lf.field_101356_w
		// @0F6B: if_icmpgt @0F72
		// @0F6E: goto @0F78
		// @0F71: athrow
		// @0F72: aload_3
		// @0F73: getfield int game.C_100314_lf.field_101356_w
		// @0F76: istore #9
		// @0F78: iload #9
		// @0F7A: iconst_m1
		// @0F7B: ixor
		// @0F7C: iconst_m1
		// @0F7D: if_icmple @0F83
		// @0F80: iconst_0
		// @0F81: istore #9
		// @0F83: aload_3
		// @0F84: getfield int game.C_100314_lf.field_101387_Xb
		// @0F87: bipush 8 (0x08)
		// @0F89: if_icmpne @0F90
		// @0F8C: goto @1004
		// @0F8F: athrow
		// @0F90: iconst_0
		// @0F91: aload_3
		// @0F92: getfield int game.C_100314_lf.field_101297_Ub
		// @0F95: if_icmplt @1004
		// @0F98: aload #8
		// @0F9A: getfield int game.C_100314_lf.field_101346_Z
		// @0F9D: aload_3
		// @0F9E: getfield int game.C_100314_lf.field_101346_Z
		// @0FA1: if_icmpeq @0FD8
		// @0FA4: goto @0FA8
		// @0FA7: athrow
		// @0FA8: aload #8
		// @0FAA: bipush 10 (0x0A)
		// @0FAC: aload_0
		// @0FAD: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0FB0: getfield int game.C_100294_ki.field_106994_v
		// @0FB3: aload_3
		// @0FB4: getfield int game.C_100314_lf.field_101345_X
		// @0FB7: iload #9
		// @0FB9: imul
		// @0FBA: aload_3
		// @0FBB: getfield int game.C_100314_lf.field_101332_T
		// @0FBE: idiv
		// @0FBF: imul
		// @0FC0: invokevirtual game.C_100314_lf.func_101264_g(int, int)void
		// @0FC3: aload #8
		// @0FC5: dup
		// @0FC6: getfield int game.C_100314_lf.field_101385_Pb
		// @0FC9: iload #9
		// @0FCB: iadd
		// @0FCC: putfield int game.C_100314_lf.field_101385_Pb
		// @0FCF: iload #13
		// @0FD1: ifeq @1004
		// @0FD4: goto @0FD8
		// @0FD7: athrow
		// @0FD8: aload_3
		// @0FD9: aload #8
		// @0FDB: if_acmpeq @1004
		// @0FDE: goto @0FE2
		// @0FE1: athrow
		// @0FE2: aload #8
		// @0FE4: iload_1
		// @0FE5: bipush -100 (0x9C)
		// @0FE7: iadd
		// @0FE8: aload_3
		// @0FE9: getfield int game.C_100314_lf.field_101345_X
		// @0FEC: iload #9
		// @0FEE: imul
		// @0FEF: aload_3
		// @0FF0: getfield int game.C_100314_lf.field_101332_T
		// @0FF3: idiv
		// @0FF4: aload_0
		// @0FF5: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @0FF8: getfield int game.C_100294_ki.field_106994_v
		// @0FFB: imul
		// @0FFC: ineg
		// @0FFD: invokevirtual game.C_100314_lf.func_101264_g(int, int)void
		// @1000: goto @1004
		// @1003: athrow
		// @1004: aload_3
		// @1005: getfield int game.C_100314_lf.field_101297_Ub
		// @1008: iconst_m1
		// @1009: ixor
		// @100A: iconst_m1
		// @100B: if_icmpge @1012
		// @100E: goto @10B6
		// @1011: athrow
		// @1012: aload_3
		// @1013: aload_3
		// @1014: getfield int game.C_100314_lf.field_101413_Bb
		// @1017: ineg
		// @1018: bipush 30 (0x1E)
		// @101A: invokevirtual game.C_100314_lf.func_101262_a(int, int)void
		// @101D: iconst_0
		// @101E: aload_3
		// @101F: getfield int game.C_100314_lf.field_101356_w
		// @1022: if_icmplt @1071
		// @1025: iconst_0
		// @1026: aload_3
		// @1027: getfield int game.C_100314_lf.field_101387_Xb
		// @102A: if_icmpeq @1040
		// @102D: goto @1031
		// @1030: athrow
		// @1031: aload_3
		// @1032: getfield int game.C_100314_lf.field_101387_Xb
		// @1035: iconst_m1
		// @1036: ixor
		// @1037: bipush -12 (0xF4)
		// @1039: if_icmpne @1071
		// @103C: goto @1040
		// @103F: athrow
		// @1040: bipush -33 (0xDF)
		// @1042: aload_0
		// @1043: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @1046: getfield int game.C_100018_wk.field_101541_X
		// @1049: iconst_m1
		// @104A: ixor
		// @104B: if_icmpne @1071
		// @104E: goto @1052
		// @1051: athrow
		// @1052: aload_0
		// @1053: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @1056: getfield game.C_100314_lf game.C_100018_wk.field_101517_A
		// @1059: aload #8
		// @105B: if_acmpne @1071
		// @105E: goto @1062
		// @1061: athrow
		// @1062: aload #8
		// @1064: dup
		// @1065: getfield int game.C_100314_lf.field_101325_eb
		// @1068: iconst_1
		// @1069: iadd
		// @106A: putfield int game.C_100314_lf.field_101325_eb
		// @106D: goto @1071
		// @1070: athrow
		// @1071: aload_3
		// @1072: getfield int game.C_100314_lf.field_101356_w
		// @1075: iconst_m1
		// @1076: ixor
		// @1077: iconst_m1
		// @1078: if_icmplt @10B6
		// @107B: aload_3
		// @107C: getfield int game.C_100314_lf.field_101387_Xb
		// @107F: bipush 8 (0x08)
		// @1081: if_icmpeq @10B6
		// @1084: goto @1088
		// @1087: athrow
		// @1088: aload_0
		// @1089: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @108C: getfield boolean game.C_100018_wk.field_101522_N
		// @108F: ifeq @10B6
		// @1092: goto @1096
		// @1095: athrow
		// @1096: aload #8
		// @1098: aload_0
		// @1099: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @109C: getfield game.C_100314_lf game.C_100018_wk.field_101517_A
		// @109F: if_acmpeq @10B6
		// @10A2: goto @10A6
		// @10A5: athrow
		// @10A6: aload_3
		// @10A7: getfield int game.C_100314_lf.field_101346_Z
		// @10AA: aload #8
		// @10AC: getfield int game.C_100314_lf.field_101346_Z
		// @10AF: if_icmpeq @10B6
		// @10B2: goto @10B6
		// @10B5: athrow
		// @10B6: aload_3
		// @10B7: iload_1
		// @10B8: bipush -79 (0xB1)
		// @10BA: iadd
		// @10BB: invokevirtual game.C_100314_lf.func_101279_e(int)boolean
		// @10BE: ifeq @10FC
		// @10C1: aload_0
		// @10C2: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @10C5: getfield int game.C_100018_wk.field_101543_db
		// @10C8: iload #7
		// @10CA: imul
		// @10CB: aload_0
		// @10CC: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @10CF: getfield int game.C_100018_wk.field_101546_w
		// @10D2: idiv
		// @10D3: iconst_m1
		// @10D4: ixor
		// @10D5: aload_3
		// @10D6: getfield int game.C_100314_lf.field_101399_Ab
		// @10D9: iconst_m1
		// @10DA: ixor
		// @10DB: if_icmplt @10E6
		// @10DE: goto @10E2
		// @10E1: athrow
		// @10E2: goto @10FC
		// @10E5: athrow
		// @10E6: aload_3
		// @10E7: aload_0
		// @10E8: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @10EB: getfield int game.C_100018_wk.field_101543_db
		// @10EE: iload #7
		// @10F0: imul
		// @10F1: aload_0
		// @10F2: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @10F5: getfield int game.C_100018_wk.field_101546_w
		// @10F8: idiv
		// @10F9: putfield int game.C_100314_lf.field_101399_Ab
		// @10FC: iconst_0
		// @10FD: iload #7
		// @10FF: aload_0
		// @1100: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @1103: getfield int game.C_100018_wk.field_101543_db
		// @1106: imul
		// @1107: aload_0
		// @1108: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @110B: getfield int game.C_100018_wk.field_101546_w
		// @110E: idiv
		// @110F: if_icmpge @1150
		// @1112: aload_3
		// @1113: getfield int game.C_100314_lf.field_101310_Mb
		// @1116: ifle @1150
		// @1119: goto @111D
		// @111C: athrow
		// @111D: aload_3
		// @111E: bipush 38 (0x26)
		// @1120: invokevirtual game.C_100314_lf.func_101279_e(int)boolean
		// @1123: ifeq @1150
		// @1126: goto @112A
		// @1129: athrow
		// @112A: aload_3
		// @112B: bipush 37 (0x25)
		// @112D: aload_3
		// @112E: getfield int game.C_100314_lf.field_101310_Mb
		// @1131: iload #7
		// @1133: aload_0
		// @1134: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @1137: getfield int game.C_100018_wk.field_101543_db
		// @113A: imul
		// @113B: aload_0
		// @113C: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @113F: getfield int game.C_100018_wk.field_101546_w
		// @1142: idiv
		// @1143: bipush 50 (0x32)
		// @1145: idiv
		// @1146: invokestatic java.lang.Math.min(int, int)int
		// @1149: invokevirtual game.C_100314_lf.func_101260_j(int, int)void
		// @114C: goto @1150
		// @114F: athrow
		// @1150: aload_3
		// @1151: iload_1
		// @1152: ldc 312774178 (0x12a48e22)
		// @1154: iadd
		// @1155: bipush 26 (0x1A)
		// @1157: invokevirtual game.C_100314_lf.func_101268_f(int, int)boolean
		// @115A: ifeq @1184
		// @115D: aload_3
		// @115E: getfield int game.C_100314_lf.field_101413_Bb
		// @1161: iconst_m1
		// @1162: ixor
		// @1163: iconst_m1
		// @1164: if_icmple @1184
		// @1167: goto @116B
		// @116A: athrow
		// @116B: aload_3
		// @116C: aload_3
		// @116D: getfield int game.C_100314_lf.field_101413_Bb
		// @1170: ineg
		// @1171: aload_3
		// @1172: getfield int game.C_100314_lf.field_101358_u
		// @1175: invokestatic java.lang.Math.min(int, int)int
		// @1178: putfield int game.C_100314_lf.field_101413_Bb
		// @117B: iload #13
		// @117D: ifeq @118D
		// @1180: goto @1184
		// @1183: athrow
		// @1184: aload_3
		// @1185: iconst_0
		// @1186: putfield int game.C_100314_lf.field_101413_Bb
		// @1189: goto @118D
		// @118C: athrow
		// @118D: aload_3
		// @118E: getfield boolean game.C_100314_lf.field_101307_pb
		// @1191: ifeq @13AB
		// @1194: aload_3
		// @1195: iload_1
		// @1196: ldc 312774178 (0x12a48e22)
		// @1198: iadd
		// @1199: bipush 29 (0x1D)
		// @119B: invokevirtual game.C_100314_lf.func_101268_f(int, int)boolean
		// @119E: ifne @13AB
		// @11A1: goto @11A5
		// @11A4: athrow
		// @11A5: bipush -4 (0xFC)
		// @11A7: getstatic int game.C_100218_am.field_103115_N
		// @11AA: iconst_m1
		// @11AB: ixor
		// @11AC: if_icmpeq @13AB
		// @11AF: goto @11B3
		// @11B2: athrow
		// @11B3: aload_3
		// @11B4: sipush 200 (0x00C8)
		// @11B7: putfield int game.C_100314_lf.field_101402_Jb
		// @11BA: iload #13
		// @11BC: ifeq @13AB
		// @11BF: goto @11C3
		// @11C2: athrow
		// @11C3: aload_0
		// @11C4: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @11C7: getfield int game.C_100018_wk.field_101546_w
		// @11CA: istore #7
		// @11CC: aload_3
		// @11CD: dup
		// @11CE: getfield int game.C_100314_lf.field_101413_Bb
		// @11D1: aload_0
		// @11D2: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @11D5: getfield int game.C_100018_wk.field_101543_db
		// @11D8: isub
		// @11D9: putfield int game.C_100314_lf.field_101413_Bb
		// @11DC: aload_3
		// @11DD: getfield int game.C_100314_lf.field_101399_Ab
		// @11E0: aload_0
		// @11E1: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @11E4: getfield int game.C_100018_wk.field_101543_db
		// @11E7: if_icmpge @1206
		// @11EA: aload_3
		// @11EB: bipush 58 (0x3A)
		// @11ED: invokevirtual game.C_100314_lf.func_101279_e(int)boolean
		// @11F0: ifeq @1206
		// @11F3: goto @11F7
		// @11F6: athrow
		// @11F7: aload_3
		// @11F8: aload_0
		// @11F9: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @11FC: getfield int game.C_100018_wk.field_101543_db
		// @11FF: putfield int game.C_100314_lf.field_101399_Ab
		// @1202: goto @1206
		// @1205: athrow
		// @1206: iconst_0
		// @1207: aload_0
		// @1208: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @120B: getfield int game.C_100018_wk.field_101543_db
		// @120E: if_icmpge @1244
		// @1211: aload_3
		// @1212: getfield int game.C_100314_lf.field_101310_Mb
		// @1215: ifle @1244
		// @1218: goto @121C
		// @121B: athrow
		// @121C: aload_3
		// @121D: bipush 105 (0x69)
		// @121F: invokevirtual game.C_100314_lf.func_101279_e(int)boolean
		// @1222: ifeq @1244
		// @1225: goto @1229
		// @1228: athrow
		// @1229: aload_3
		// @122A: bipush 37 (0x25)
		// @122C: aload_3
		// @122D: getfield int game.C_100314_lf.field_101310_Mb
		// @1230: aload_0
		// @1231: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @1234: getfield int game.C_100018_wk.field_101543_db
		// @1237: bipush 50 (0x32)
		// @1239: idiv
		// @123A: invokestatic java.lang.Math.min(int, int)int
		// @123D: invokevirtual game.C_100314_lf.func_101260_j(int, int)void
		// @1240: goto @1244
		// @1243: athrow
		// @1244: iconst_m1
		// @1245: aload_3
		// @1246: getfield int game.C_100314_lf.field_101413_Bb
		// @1249: iconst_m1
		// @124A: ixor
		// @124B: if_icmpge @1257
		// @124E: aload_3
		// @124F: iconst_0
		// @1250: putfield int game.C_100314_lf.field_101413_Bb
		// @1253: goto @1257
		// @1256: athrow
		// @1257: aload_3
		// @1258: getfield int game.C_100314_lf.field_101356_w
		// @125B: iconst_m1
		// @125C: ixor
		// @125D: iconst_m1
		// @125E: if_icmplt @1265
		// @1261: goto @126F
		// @1264: athrow
		// @1265: aload_3
		// @1266: bipush -94 (0xA2)
		// @1268: aload_0
		// @1269: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @126C: invokevirtual game.C_100314_lf.func_101276_a(byte, game.C_100018_wk)void
		// @126F: iconst_0
		// @1270: aload_3
		// @1271: getfield int game.C_100314_lf.field_101356_w
		// @1274: if_icmpge @1359
		// @1277: aconst_null
		// @1278: aload_0
		// @1279: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @127C: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @127F: if_acmpeq @1359
		// @1282: goto @1286
		// @1285: athrow
		// @1286: iload #7
		// @1288: istore #8
		// @128A: iload #8
		// @128C: aload_3
		// @128D: getfield int game.C_100314_lf.field_101356_w
		// @1290: if_icmple @1299
		// @1293: aload_3
		// @1294: getfield int game.C_100314_lf.field_101356_w
		// @1297: istore #8
		// @1299: iconst_m1
		// @129A: iload #8
		// @129C: iconst_m1
		// @129D: ixor
		// @129E: if_icmpge @12A4
		// @12A1: iconst_0
		// @12A2: istore #8
		// @12A4: aload_3
		// @12A5: getfield int game.C_100314_lf.field_101387_Xb
		// @12A8: iconst_m1
		// @12A9: ixor
		// @12AA: bipush -9 (0xF7)
		// @12AC: if_icmpne @12B3
		// @12AF: goto @133E
		// @12B2: athrow
		// @12B3: iconst_0
		// @12B4: aload_3
		// @12B5: getfield int game.C_100314_lf.field_101297_Ub
		// @12B8: if_icmplt @133E
		// @12BB: aload_3
		// @12BC: getfield int game.C_100314_lf.field_101346_Z
		// @12BF: aload_0
		// @12C0: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @12C3: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @12C6: getfield int game.C_100314_lf.field_101346_Z
		// @12C9: if_icmpeq @130A
		// @12CC: goto @12D0
		// @12CF: athrow
		// @12D0: aload_0
		// @12D1: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @12D4: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @12D7: bipush 10 (0x0A)
		// @12D9: iload #8
		// @12DB: aload_3
		// @12DC: getfield int game.C_100314_lf.field_101345_X
		// @12DF: imul
		// @12E0: aload_3
		// @12E1: getfield int game.C_100314_lf.field_101332_T
		// @12E4: idiv
		// @12E5: aload_0
		// @12E6: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @12E9: getfield int game.C_100294_ki.field_106994_v
		// @12EC: imul
		// @12ED: invokevirtual game.C_100314_lf.func_101264_g(int, int)void
		// @12F0: aload_0
		// @12F1: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @12F4: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @12F7: dup
		// @12F8: getfield int game.C_100314_lf.field_101385_Pb
		// @12FB: iload #8
		// @12FD: iadd
		// @12FE: putfield int game.C_100314_lf.field_101385_Pb
		// @1301: iload #13
		// @1303: ifeq @133E
		// @1306: goto @130A
		// @1309: athrow
		// @130A: aload_0
		// @130B: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @130E: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1311: aload_3
		// @1312: if_acmpeq @133E
		// @1315: goto @1319
		// @1318: athrow
		// @1319: aload_0
		// @131A: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @131D: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1320: bipush 10 (0x0A)
		// @1322: aload_0
		// @1323: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @1326: getfield int game.C_100294_ki.field_106994_v
		// @1329: iload #8
		// @132B: aload_3
		// @132C: getfield int game.C_100314_lf.field_101345_X
		// @132F: imul
		// @1330: aload_3
		// @1331: getfield int game.C_100314_lf.field_101332_T
		// @1334: idiv
		// @1335: imul
		// @1336: ineg
		// @1337: invokevirtual game.C_100314_lf.func_101264_g(int, int)void
		// @133A: goto @133E
		// @133D: athrow
		// @133E: aload_3
		// @133F: getfield int game.C_100314_lf.field_101297_Ub
		// @1342: iconst_m1
		// @1343: ixor
		// @1344: iconst_m1
		// @1345: if_icmpge @134C
		// @1348: goto @1354
		// @134B: athrow
		// @134C: aload_3
		// @134D: iload #7
		// @134F: bipush 30 (0x1E)
		// @1351: invokevirtual game.C_100314_lf.func_101262_a(int, int)void
		// @1354: iload #13
		// @1356: ifeq @138A
		// @1359: aload_3
		// @135A: getfield int game.C_100314_lf.field_101356_w
		// @135D: ifle @138A
		// @1360: goto @1364
		// @1363: athrow
		// @1364: aconst_null
		// @1365: aload_0
		// @1366: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @1369: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @136C: if_acmpne @138A
		// @136F: goto @1373
		// @1372: athrow
		// @1373: aload_3
		// @1374: getfield int game.C_100314_lf.field_101297_Ub
		// @1377: ifgt @138A
		// @137A: goto @137E
		// @137D: athrow
		// @137E: aload_3
		// @137F: iload #7
		// @1381: bipush 30 (0x1E)
		// @1383: invokevirtual game.C_100314_lf.func_101262_a(int, int)void
		// @1386: goto @138A
		// @1389: athrow
		// @138A: aload_3
		// @138B: getfield boolean game.C_100314_lf.field_101307_pb
		// @138E: ifne @1395
		// @1391: goto @13AB
		// @1394: athrow
		// @1395: aload_3
		// @1396: ldc 312774288 (0x12a48e90)
		// @1398: bipush 29 (0x1D)
		// @139A: invokevirtual game.C_100314_lf.func_101268_f(int, int)boolean
		// @139D: ifeq @13A4
		// @13A0: goto @13AB
		// @13A3: athrow
		// @13A4: aload_3
		// @13A5: sipush 200 (0x00C8)
		// @13A8: putfield int game.C_100314_lf.field_101402_Jb
		// @13AB: iinc #2 +1
		// @13AE: iload #13
		// @13B0: ifeq @0B40
		// @13B3: iconst_0
		// @13B4: aload_0
		// @13B5: getfield int game.C_100058_dg.field_101584_x
		// @13B8: if_icmplt @13BE
		// @13BB: goto @13C8
		// @13BE: aload_0
		// @13BF: dup
		// @13C0: getfield int game.C_100058_dg.field_101584_x
		// @13C3: iconst_1
		// @13C4: isub
		// @13C5: putfield int game.C_100058_dg.field_101584_x
		// @13C8: aload_0
		// @13C9: getfield int game.C_100058_dg.field_101570_N
		// @13CC: aload_0
		// @13CD: getfield int game.C_100058_dg.field_101579_t
		// @13D0: if_icmplt @13D7
		// @13D3: goto @13E4
		// @13D6: athrow
		// @13D7: aload_0
		// @13D8: getfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @13DB: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @13DE: bipush 124 (0x7C)
		// @13E0: aload_0
		// @13E1: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @13E4: goto @1409
		// @13E7: astore_2
		// @13E8: aload_2
		// @13E9: new java.lang.StringBuilder
		// @13EC: dup
		// @13ED: invokespecial java.lang.StringBuilder.<init>()void
		// @13F0: getstatic java.lang.String[] game.C_100058_dg.field_101581_P
		// @13F3: bipush 6 (0x06)
		// @13F5: aaload
		// @13F6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @13F9: iload_1
		// @13FA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @13FD: bipush 41 (0x29)
		// @13FF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1402: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1405: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1408: athrow
		// @1409: return
	}
	
	C_100058_dg(int arg0, int arg1, int arg2, int arg3, int arg4, C_100294_ki arg5, C_100314_lf[] arg6, C_100018_wk arg7)
	{
		// @000: aload_0
		// @001: invokespecial game.C_100325_id.<init>()void
		// @004: aload_0
		// @005: iload_3
		// @006: putfield int game.C_100058_dg.field_101568_L
		// @009: aload_0
		// @00A: aload #8
		// @00C: putfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @00F: aload_0
		// @010: iconst_0
		// @011: putfield int game.C_100058_dg.field_101579_t
		// @014: aload_0
		// @015: iload_1
		// @016: putfield int game.C_100058_dg.field_101583_y
		// @019: aload_0
		// @01A: iload #4
		// @01C: putfield int game.C_100058_dg.field_101577_v
		// @01F: aload_0
		// @020: aload #6
		// @022: putfield game.C_100294_ki game.C_100058_dg.field_101575_K
		// @025: aload_0
		// @026: aload #7
		// @028: putfield game.C_100314_lf[] game.C_100058_dg.field_101561_D
		// @02B: aload_0
		// @02C: iload_2
		// @02D: putfield int game.C_100058_dg.field_101572_H
		// @030: aload_0
		// @031: iload #5
		// @033: putfield int game.C_100058_dg.field_101570_N
		// @036: aload_0
		// @037: iconst_0
		// @038: putfield int game.C_100058_dg.field_101571_O
		// @03B: iconst_1
		// @03C: aload_0
		// @03D: getfield int game.C_100058_dg.field_101570_N
		// @040: if_icmple @048
		// @043: aload_0
		// @044: iconst_1
		// @045: putfield int game.C_100058_dg.field_101570_N
		// @048: aconst_null
		// @049: aload_0
		// @04A: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @04D: if_acmpne @054
		// @050: goto @05F
		// @053: athrow
		// @054: aload_0
		// @055: aload_0
		// @056: getfield game.C_100018_wk game.C_100058_dg.field_101573_I
		// @059: getfield boolean game.C_100018_wk.field_101534_V
		// @05C: putfield boolean game.C_100058_dg.field_101566_B
		// @05F: aload_0
		// @060: aload_0
		// @061: getfield int game.C_100058_dg.field_101583_y
		// @064: putfield int game.C_100058_dg.field_101582_z
		// @067: aload_0
		// @068: iconst_5
		// @069: putfield int game.C_100058_dg.field_101576_w
		// @06C: aload_0
		// @06D: bipush 64 (0x40)
		// @06F: putfield int game.C_100058_dg.field_101565_A
		// @072: aload_0
		// @073: iconst_5
		// @074: putfield int game.C_100058_dg.field_101584_x
		// @077: aload_0
		// @078: aload_0
		// @079: getfield int game.C_100058_dg.field_101579_t
		// @07C: ineg
		// @07D: aload_0
		// @07E: getfield int game.C_100058_dg.field_101570_N
		// @081: iadd
		// @082: iconst_4
		// @083: idiv
		// @084: aload_0
		// @085: getfield int game.C_100058_dg.field_101579_t
		// @088: iadd
		// @089: aload_0
		// @08A: getfield int game.C_100058_dg.field_101565_A
		// @08D: imul
		// @08E: aload_0
		// @08F: getfield int game.C_100058_dg.field_101570_N
		// @092: idiv
		// @093: putfield int game.C_100058_dg.field_101563_F
		// @096: goto @133
		// @099: astore #9
		// @09B: aload #9
		// @09D: new java.lang.StringBuilder
		// @0A0: dup
		// @0A1: invokespecial java.lang.StringBuilder.<init>()void
		// @0A4: getstatic java.lang.String[] game.C_100058_dg.field_101581_P
		// @0A7: iconst_3
		// @0A8: aaload
		// @0A9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0AC: iload_1
		// @0AD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0B0: bipush 44 (0x2C)
		// @0B2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0B5: iload_2
		// @0B6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0B9: bipush 44 (0x2C)
		// @0BB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0BE: iload_3
		// @0BF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0C2: bipush 44 (0x2C)
		// @0C4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0C7: iload #4
		// @0C9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0CC: bipush 44 (0x2C)
		// @0CE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D1: iload #5
		// @0D3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D6: bipush 44 (0x2C)
		// @0D8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0DB: aload #6
		// @0DD: ifnull @0E9
		// @0E0: getstatic java.lang.String[] game.C_100058_dg.field_101581_P
		// @0E3: iconst_4
		// @0E4: aaload
		// @0E5: goto @0EE
		// @0E8: athrow
		// @0E9: getstatic java.lang.String[] game.C_100058_dg.field_101581_P
		// @0EC: iconst_5
		// @0ED: aaload
		// @0EE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F1: bipush 44 (0x2C)
		// @0F3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F6: aload #7
		// @0F8: ifnull @104
		// @0FB: getstatic java.lang.String[] game.C_100058_dg.field_101581_P
		// @0FE: iconst_4
		// @0FF: aaload
		// @100: goto @109
		// @103: athrow
		// @104: getstatic java.lang.String[] game.C_100058_dg.field_101581_P
		// @107: iconst_5
		// @108: aaload
		// @109: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @10C: bipush 44 (0x2C)
		// @10E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @111: aload #8
		// @113: ifnull @11F
		// @116: getstatic java.lang.String[] game.C_100058_dg.field_101581_P
		// @119: iconst_4
		// @11A: aaload
		// @11B: goto @124
		// @11E: athrow
		// @11F: getstatic java.lang.String[] game.C_100058_dg.field_101581_P
		// @122: iconst_5
		// @123: aaload
		// @124: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @127: bipush 41 (0x29)
		// @129: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @12C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @12F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @132: athrow
		// @133: return
	}
	
	static
	{
		// @00: bipush 7 (0x07)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "h\u0003<=*"
		// @09: invokestatic game.C_100058_dg.func_101558_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100058_dg.func_101557_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "h\u0003<?*"
		// @14: invokestatic game.C_100058_dg.func_101558_z(java.lang.String)char[]
		// @17: invokestatic game.C_100058_dg.func_101557_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "h\u0003<>*"
		// @1F: invokestatic game.C_100058_dg.func_101558_z(java.lang.String)char[]
		// @22: invokestatic game.C_100058_dg.func_101557_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "h\u0003<@kb\rfB*"
		// @2A: invokestatic game.C_100058_dg.func_101558_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100058_dg.func_101557_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "wJ<R\u007f"
		// @35: invokestatic game.C_100058_dg.func_101558_z(java.lang.String)char[]
		// @38: invokestatic game.C_100058_dg.func_101557_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "b\u0011~\u0010"
		// @40: invokestatic game.C_100058_dg.func_101558_z(java.lang.String)char[]
		// @43: invokestatic game.C_100058_dg.func_101557_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "h\u0003<8*"
		// @4C: invokestatic game.C_100058_dg.func_101558_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100058_dg.func_101557_z(char[])java.lang.String
		// @52: aastore
		// @53: putstatic java.lang.String[] game.C_100058_dg.field_101581_P
		// @56: iconst_3
		// @57: anewarray game.C_100037_wb
		// @5A: putstatic game.C_100037_wb[] game.C_100058_dg.field_101562_E
		// @5D: iconst_0
		// @5E: putstatic int game.C_100058_dg.field_101580_s
		// @61: sipush 1000 (0x03E8)
		// @64: anewarray byte[]
		// @67: putstatic byte[][] game.C_100058_dg.field_101578_u
		// @6A: iconst_0
		// @6B: putstatic int game.C_100058_dg.field_101574_J
		// @6E: ldc "m\u0017v"
		// @70: invokestatic game.C_100058_dg.func_101558_z(java.lang.String)char[]
		// @73: invokestatic game.C_100058_dg.func_101557_z(char[])java.lang.String
		// @76: putstatic java.lang.String game.C_100058_dg.field_101569_M
		// @79: return
	}
	
	private static char[] func_101558_z(String arg0)
	{
		// @00: aload_0
		// @01: invokevirtual java.lang.String.toCharArray()char[]
		// @04: dup
		// @05: arraylength
		// @06: iconst_2
		// @07: if_icmpge @12
		// @0A: dup
		// @0B: iconst_0
		// @0C: dup2
		// @0D: caload
		// @0E: iconst_2
		// @0F: ixor
		// @10: i2c
		// @11: castore
		// @12: areturn
	}
	
	private static String func_101557_z(char[] arg0)
	{
		// @00: aload_0
		// @01: dup
		// @02: arraylength
		// @03: swap
		// @04: iconst_0
		// @05: istore_1
		// @06: goto @4B
		// @09: dup
		// @0A: iload_1
		// @0B: dup2
		// @0C: caload
		// @0D: iload_1
		// @0E: iconst_5
		// @0F: irem
		// @10: tableswitch def: @44, for 0: @30, for 1: @35, for 2: @3A, for 3: @3F
		// @30: bipush 12 (0x0C)
		// @32: goto @45
		// @35: bipush 100 (0x64)
		// @37: goto @45
		// @3A: bipush 18 (0x12)
		// @3C: goto @45
		// @3F: bipush 124 (0x7C)
		// @41: goto @45
		// @44: iconst_2
		// @45: ixor
		// @46: i2c
		// @47: castore
		// @48: iinc #1 +1
		// @4B: swap
		// @4C: dup_x1
		// @4D: iload_1
		// @4E: if_icmpgt @09
		// @51: new java.lang.String
		// @54: dup_x1
		// @55: swap
		// @56: invokespecial java.lang.String.<init>(char[])void
		// @59: invokevirtual java.lang.String.intern()java.lang.String
		// @5C: areturn
	}
}
