package game;

import java.io.IOException;

final class C_100301_kb
{
	private long field_107097_l;
	private long field_107099_j;
	static int field_107103_p;
	static boolean field_107100_k;
	static C_100338_jc field_107094_a;
	private long field_107098_m;
	static String field_107091_e;
	private long field_107088_f;
	private int field_107096_o;
	private byte[] field_107101_h;
	static int[] field_107089_g;
	private byte[] field_107092_b;
	private long field_107095_n;
	private C_100005_fk field_107090_d;
	private long field_107093_c;
	private int field_107102_i;
	private static final String[] field_107104_z;
	
	private final void func_107077_a(int arg0) throws IOException
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: aload_0
		// @006: getfield long game.C_100301_kb.field_107098_m
		// @009: ldc2_w -1
		// @00C: lcmp
		// @00D: ifeq @1BE
		// @010: aload_0
		// @011: getfield long game.C_100301_kb.field_107099_j
		// @014: ldc2_w -1
		// @017: lxor
		// @018: aload_0
		// @019: getfield long game.C_100301_kb.field_107098_m
		// @01C: ldc2_w -1
		// @01F: lxor
		// @020: lcmp
		// @021: ifne @02C
		// @024: goto @028
		// @027: athrow
		// @028: goto @041
		// @02B: athrow
		// @02C: aload_0
		// @02D: getfield game.C_100005_fk game.C_100301_kb.field_107090_d
		// @030: aload_0
		// @031: getfield long game.C_100301_kb.field_107098_m
		// @034: bipush -123 (0x85)
		// @036: invokevirtual game.C_100005_fk.func_103587_a(long, byte)void
		// @039: aload_0
		// @03A: aload_0
		// @03B: getfield long game.C_100301_kb.field_107098_m
		// @03E: putfield long game.C_100301_kb.field_107099_j
		// @041: aload_0
		// @042: getfield game.C_100005_fk game.C_100301_kb.field_107090_d
		// @045: iconst_0
		// @046: aload_0
		// @047: getfield byte[] game.C_100301_kb.field_107101_h
		// @04A: aload_0
		// @04B: getfield int game.C_100301_kb.field_107102_i
		// @04E: bipush -104 (0x98)
		// @050: invokevirtual game.C_100005_fk.func_103588_a(int, byte[], int, int)void
		// @053: aload_0
		// @054: dup
		// @055: getfield long game.C_100301_kb.field_107099_j
		// @058: aload_0
		// @059: getfield int game.C_100301_kb.field_107102_i
		// @05C: i2l
		// @05D: ladd
		// @05E: putfield long game.C_100301_kb.field_107099_j
		// @061: aload_0
		// @062: getfield long game.C_100301_kb.field_107097_l
		// @065: aload_0
		// @066: getfield long game.C_100301_kb.field_107099_j
		// @069: lcmp
		// @06A: iflt @071
		// @06D: goto @079
		// @070: athrow
		// @071: aload_0
		// @072: aload_0
		// @073: getfield long game.C_100301_kb.field_107099_j
		// @076: putfield long game.C_100301_kb.field_107097_l
		// @079: ldc2_w -1
		// @07C: lstore_2
		// @07D: ldc2_w -1
		// @080: lstore #4
		// @082: aload_0
		// @083: getfield long game.C_100301_kb.field_107098_m
		// @086: aload_0
		// @087: getfield long game.C_100301_kb.field_107095_n
		// @08A: lcmp
		// @08B: iflt @0A4
		// @08E: aload_0
		// @08F: getfield long game.C_100301_kb.field_107098_m
		// @092: aload_0
		// @093: getfield int game.C_100301_kb.field_107096_o
		// @096: i2l
		// @097: aload_0
		// @098: getfield long game.C_100301_kb.field_107095_n
		// @09B: ladd
		// @09C: lcmp
		// @09D: iflt @0E0
		// @0A0: goto @0A4
		// @0A3: athrow
		// @0A4: aload_0
		// @0A5: getfield long game.C_100301_kb.field_107095_n
		// @0A8: aload_0
		// @0A9: getfield long game.C_100301_kb.field_107098_m
		// @0AC: lcmp
		// @0AD: iflt @0E5
		// @0B0: goto @0B4
		// @0B3: athrow
		// @0B4: aload_0
		// @0B5: getfield long game.C_100301_kb.field_107095_n
		// @0B8: ldc2_w -1
		// @0BB: lxor
		// @0BC: aload_0
		// @0BD: getfield long game.C_100301_kb.field_107098_m
		// @0C0: aload_0
		// @0C1: getfield int game.C_100301_kb.field_107102_i
		// @0C4: i2l
		// @0C5: ladd
		// @0C6: ldc2_w -1
		// @0C9: lxor
		// @0CA: lcmp
		// @0CB: ifgt @0D6
		// @0CE: goto @0D2
		// @0D1: athrow
		// @0D2: goto @0E5
		// @0D5: athrow
		// @0D6: aload_0
		// @0D7: getfield long game.C_100301_kb.field_107095_n
		// @0DA: lstore_2
		// @0DB: iload #7
		// @0DD: ifeq @0E5
		// @0E0: aload_0
		// @0E1: getfield long game.C_100301_kb.field_107098_m
		// @0E4: lstore_2
		// @0E5: aload_0
		// @0E6: getfield int game.C_100301_kb.field_107102_i
		// @0E9: i2l
		// @0EA: aload_0
		// @0EB: getfield long game.C_100301_kb.field_107098_m
		// @0EE: ladd
		// @0EF: aload_0
		// @0F0: getfield long game.C_100301_kb.field_107095_n
		// @0F3: lcmp
		// @0F4: ifle @125
		// @0F7: aload_0
		// @0F8: getfield long game.C_100301_kb.field_107098_m
		// @0FB: aload_0
		// @0FC: getfield int game.C_100301_kb.field_107102_i
		// @0FF: i2l
		// @100: lneg
		// @101: lsub
		// @102: aload_0
		// @103: getfield long game.C_100301_kb.field_107095_n
		// @106: aload_0
		// @107: getfield int game.C_100301_kb.field_107096_o
		// @10A: i2l
		// @10B: ladd
		// @10C: lcmp
		// @10D: ifgt @125
		// @110: goto @114
		// @113: athrow
		// @114: aload_0
		// @115: getfield int game.C_100301_kb.field_107102_i
		// @118: i2l
		// @119: aload_0
		// @11A: getfield long game.C_100301_kb.field_107098_m
		// @11D: ladd
		// @11E: lstore #4
		// @120: iload #7
		// @122: ifeq @174
		// @125: aload_0
		// @126: getfield long game.C_100301_kb.field_107098_m
		// @129: ldc2_w -1
		// @12C: lxor
		// @12D: aload_0
		// @12E: getfield int game.C_100301_kb.field_107096_o
		// @131: i2l
		// @132: aload_0
		// @133: getfield long game.C_100301_kb.field_107095_n
		// @136: ladd
		// @137: ldc2_w -1
		// @13A: lxor
		// @13B: lcmp
		// @13C: ifle @174
		// @13F: goto @143
		// @142: athrow
		// @143: aload_0
		// @144: getfield long game.C_100301_kb.field_107095_n
		// @147: aload_0
		// @148: getfield int game.C_100301_kb.field_107096_o
		// @14B: i2l
		// @14C: lneg
		// @14D: lsub
		// @14E: ldc2_w -1
		// @151: lxor
		// @152: aload_0
		// @153: getfield int game.C_100301_kb.field_107102_i
		// @156: i2l
		// @157: aload_0
		// @158: getfield long game.C_100301_kb.field_107098_m
		// @15B: ladd
		// @15C: ldc2_w -1
		// @15F: lxor
		// @160: lcmp
		// @161: iflt @174
		// @164: goto @168
		// @167: athrow
		// @168: aload_0
		// @169: getfield int game.C_100301_kb.field_107096_o
		// @16C: i2l
		// @16D: aload_0
		// @16E: getfield long game.C_100301_kb.field_107095_n
		// @171: ladd
		// @172: lstore #4
		// @174: lconst_0
		// @175: lload_2
		// @176: ldc2_w -1
		// @179: lxor
		// @17A: lcmp
		// @17B: ifle @1B2
		// @17E: lload #4
		// @180: lload_2
		// @181: lcmp
		// @182: ifgt @18D
		// @185: goto @189
		// @188: athrow
		// @189: goto @1B2
		// @18C: athrow
		// @18D: lload #4
		// @18F: lload_2
		// @190: lneg
		// @191: ladd
		// @192: l2i
		// @193: istore #6
		// @195: aload_0
		// @196: getfield byte[] game.C_100301_kb.field_107101_h
		// @199: lload_2
		// @19A: aload_0
		// @19B: getfield long game.C_100301_kb.field_107098_m
		// @19E: lneg
		// @19F: ladd
		// @1A0: l2i
		// @1A1: aload_0
		// @1A2: getfield byte[] game.C_100301_kb.field_107092_b
		// @1A5: lload_2
		// @1A6: aload_0
		// @1A7: getfield long game.C_100301_kb.field_107095_n
		// @1AA: lneg
		// @1AB: ladd
		// @1AC: l2i
		// @1AD: iload #6
		// @1AF: invokestatic game.C_100120_en.func_104911_a(byte[], int, byte[], int, int)void
		// @1B2: aload_0
		// @1B3: iconst_0
		// @1B4: putfield int game.C_100301_kb.field_107102_i
		// @1B7: aload_0
		// @1B8: ldc2_w -1
		// @1BB: putfield long game.C_100301_kb.field_107098_m
		// @1BE: iload_1
		// @1BF: bipush -95 (0xA1)
		// @1C1: if_icmple @1CD
		// @1C4: bipush -25 (0xE7)
		// @1C6: putstatic int game.C_100301_kb.field_107103_p
		// @1C9: goto @1CD
		// @1CC: athrow
		// @1CD: goto @1F2
		// @1D0: astore_2
		// @1D1: aload_2
		// @1D2: new java.lang.StringBuilder
		// @1D5: dup
		// @1D6: invokespecial java.lang.StringBuilder.<init>()void
		// @1D9: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @1DC: bipush 11 (0x0B)
		// @1DE: aaload
		// @1DF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1E2: iload_1
		// @1E3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1E6: bipush 41 (0x29)
		// @1E8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1EB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1EE: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1F1: athrow
		// @1F2: return
	}
	
	static final String func_107076_b(byte arg0)
	{
		// @00: iload_0
		// @01: bipush 29 (0x1D)
		// @03: if_icmpge @11
		// @06: iconst_1
		// @07: bipush 99 (0x63)
		// @09: invokestatic game.C_100301_kb.func_107087_a(boolean, int)boolean
		// @0C: pop
		// @0D: goto @11
		// @10: athrow
		// @11: getstatic game.C_100068_vc game.C_100148_bh.field_101797_B
		// @14: getstatic game.C_100068_vc game.C_100222_aa.field_106086_a
		// @17: if_acmpne @1E
		// @1A: getstatic java.lang.String game.C_100257_ln.field_106485_a
		// @1D: areturn
		// @1E: getstatic game.C_100321_hi game.C_100106_ef.field_104753_e
		// @21: bipush -2 (0xFE)
		// @23: invokevirtual game.C_100321_hi.func_107211_b(int)boolean
		// @26: ifeq @2D
		// @29: goto @37
		// @2C: athrow
		// @2D: getstatic game.C_100321_hi game.C_100106_ef.field_104753_e
		// @30: sipush -23813 (0xA2FB)
		// @33: invokevirtual game.C_100321_hi.func_107206_c(int)java.lang.String
		// @36: areturn
		// @37: getstatic game.C_100068_vc game.C_100148_bh.field_101797_B
		// @3A: getstatic game.C_100068_vc game.C_100191_rg.field_100845_o
		// @3D: if_acmpeq @44
		// @40: goto @4E
		// @43: athrow
		// @44: getstatic game.C_100321_hi game.C_100106_ef.field_104753_e
		// @47: sipush -23813 (0xA2FB)
		// @4A: invokevirtual game.C_100321_hi.func_107206_c(int)java.lang.String
		// @4D: areturn
		// @4E: getstatic java.lang.String game.C_100322_hn.field_107239_c
		// @51: areturn
		// @52: astore_1
		// @53: aload_1
		// @54: new java.lang.StringBuilder
		// @57: dup
		// @58: invokespecial java.lang.StringBuilder.<init>()void
		// @5B: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @5E: bipush 9 (0x09)
		// @60: aaload
		// @61: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @64: iload_0
		// @65: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @68: bipush 41 (0x29)
		// @6A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @70: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @73: athrow
	}
	
	public static void func_107082_d(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100338_jc game.C_100301_kb.field_107094_a
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100301_kb.field_107091_e
		// @08: aconst_null
		// @09: putstatic int[] game.C_100301_kb.field_107089_g
		// @0C: iload_0
		// @0D: iconst_m1
		// @0E: if_icmpeq @1A
		// @11: iconst_0
		// @12: aconst_null
		// @13: checkcast game.C_100201_qj
		// @16: invokestatic game.C_100301_kb.func_107084_a(boolean, game.C_100201_qj)game.C_100285_nk[]
		// @19: pop
		// @1A: goto @3E
		// @1D: astore_1
		// @1E: aload_1
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @29: iconst_3
		// @2A: aaload
		// @2B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2E: iload_0
		// @2F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @32: bipush 41 (0x29)
		// @34: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @37: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3D: athrow
		// @3E: return
	}
	
	final void func_107083_a(byte arg0, byte[] arg1) throws IOException
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: bipush -109 (0x93)
		// @04: aload_2
		// @05: arraylength
		// @06: aload_2
		// @07: invokevirtual game.C_100301_kb.func_107085_a(int, byte, int, byte[])void
		// @0A: iload_1
		// @0B: bipush 53 (0x35)
		// @0D: if_icmpeq @18
		// @10: iconst_1
		// @11: putstatic boolean game.C_100301_kb.field_107100_k
		// @14: goto @18
		// @17: athrow
		// @18: goto @57
		// @1B: astore_3
		// @1C: aload_3
		// @1D: new java.lang.StringBuilder
		// @20: dup
		// @21: invokespecial java.lang.StringBuilder.<init>()void
		// @24: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @27: bipush 14 (0x0E)
		// @29: aaload
		// @2A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D: iload_1
		// @2E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @31: bipush 44 (0x2C)
		// @33: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @36: aload_2
		// @37: ifnull @43
		// @3A: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @3D: iconst_1
		// @3E: aaload
		// @3F: goto @48
		// @42: athrow
		// @43: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @46: iconst_0
		// @47: aaload
		// @48: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4B: bipush 41 (0x29)
		// @4D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @50: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @53: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @56: athrow
		// @57: return
	}
	
	static final C_100285_nk[] func_107084_a(boolean arg0, C_100201_qj arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: aload_1
		// @006: iload_0
		// @007: invokevirtual game.C_100201_qj.func_105867_a(boolean)boolean
		// @00A: ifne @012
		// @00D: iconst_0
		// @00E: anewarray game.C_100285_nk
		// @011: areturn
		// @012: aload_1
		// @013: iconst_0
		// @014: invokevirtual game.C_100201_qj.func_105865_a(int)game.C_100331_ie
		// @017: astore_2
		// @018: aload_2
		// @019: getfield int game.C_100331_ie.field_107293_f
		// @01C: ifne @035
		// @01F: ldc2_w 10
		// @022: bipush -123 (0x85)
		// @024: invokestatic game.C_100138_bo.func_100396_a(long, int)void
		// @027: iload #7
		// @029: ifne @045
		// @02C: iload #7
		// @02E: ifeq @018
		// @031: goto @035
		// @034: athrow
		// @035: bipush -3 (0xFD)
		// @037: aload_2
		// @038: getfield int game.C_100331_ie.field_107293_f
		// @03B: iconst_m1
		// @03C: ixor
		// @03D: if_icmpne @045
		// @040: iconst_0
		// @041: anewarray game.C_100285_nk
		// @044: areturn
		// @045: aload_2
		// @046: getfield java.lang.Object game.C_100331_ie.field_107294_g
		// @049: checkcast int[]
		// @04C: checkcast int[]
		// @04F: astore_3
		// @050: aload_3
		// @051: arraylength
		// @052: ldc -752249566 (0xd3299522)
		// @054: ishr
		// @055: anewarray game.C_100285_nk
		// @058: astore #4
		// @05A: iconst_0
		// @05B: istore #5
		// @05D: iload #5
		// @05F: iconst_m1
		// @060: ixor
		// @061: aload #4
		// @063: arraylength
		// @064: iconst_m1
		// @065: ixor
		// @066: if_icmple @0C1
		// @069: new game.C_100285_nk
		// @06C: dup
		// @06D: invokespecial game.C_100285_nk.<init>()void
		// @070: astore #6
		// @072: aload #4
		// @074: iload #7
		// @076: ifne @0C3
		// @079: iload #5
		// @07B: aload #6
		// @07D: aastore
		// @07E: aload #6
		// @080: aload_3
		// @081: iload #5
		// @083: ldc -917291966 (0xc9533c42)
		// @085: ishl
		// @086: iaload
		// @087: putfield int game.C_100285_nk.field_106780_g
		// @08A: aload #6
		// @08C: aload_3
		// @08D: iconst_1
		// @08E: iload #5
		// @090: ldc 633259010 (0x25bec402)
		// @092: ishl
		// @093: iadd
		// @094: iaload
		// @095: putfield int game.C_100285_nk.field_106789_i
		// @098: aload #6
		// @09A: aload_3
		// @09B: iload #5
		// @09D: ldc 1324961858 (0x4ef95042)
		// @09F: ishl
		// @0A0: bipush -2 (0xFE)
		// @0A2: isub
		// @0A3: iaload
		// @0A4: putfield int game.C_100285_nk.field_106785_a
		// @0A7: aload #6
		// @0A9: aload_3
		// @0AA: iconst_3
		// @0AB: iload #5
		// @0AD: ldc -229681054 (0xf24f5862)
		// @0AF: ishl
		// @0B0: iadd
		// @0B1: iaload
		// @0B2: putfield int game.C_100285_nk.field_106781_d
		// @0B5: iinc #5 +1
		// @0B8: iload #7
		// @0BA: ifeq @05D
		// @0BD: goto @0C1
		// @0C0: athrow
		// @0C1: aload #4
		// @0C3: areturn
		// @0C4: astore_2
		// @0C5: aload_2
		// @0C6: new java.lang.StringBuilder
		// @0C9: dup
		// @0CA: invokespecial java.lang.StringBuilder.<init>()void
		// @0CD: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @0D0: bipush 10 (0x0A)
		// @0D2: aaload
		// @0D3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D6: iload_0
		// @0D7: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @0DA: bipush 44 (0x2C)
		// @0DC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0DF: aload_1
		// @0E0: ifnull @0EC
		// @0E3: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @0E6: iconst_1
		// @0E7: aaload
		// @0E8: goto @0F1
		// @0EB: athrow
		// @0EC: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @0EF: iconst_0
		// @0F0: aaload
		// @0F1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F4: bipush 41 (0x29)
		// @0F6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0FC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @0FF: athrow
	}
	
	final void func_107086_a(long arg0, int arg1) throws IOException
	{
		// @00: ldc2_w -1
		// @03: lload_1
		// @04: ldc2_w -1
		// @07: lxor
		// @08: lcmp
		// @09: iflt @10
		// @0C: goto @18
		// @0F: athrow
		// @10: new java.io.IOException
		// @13: dup
		// @14: invokespecial java.io.IOException.<init>()void
		// @17: athrow
		// @18: bipush 9 (0x09)
		// @1A: iload_3
		// @1B: bipush -39 (0xD9)
		// @1D: isub
		// @1E: bipush 58 (0x3A)
		// @20: idiv
		// @21: idiv
		// @22: istore #4
		// @24: aload_0
		// @25: lload_1
		// @26: putfield long game.C_100301_kb.field_107093_c
		// @29: goto @58
		// @2C: astore #4
		// @2E: aload #4
		// @30: new java.lang.StringBuilder
		// @33: dup
		// @34: invokespecial java.lang.StringBuilder.<init>()void
		// @37: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @3A: iconst_4
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: lload_1
		// @40: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @43: bipush 44 (0x2C)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: iload_3
		// @49: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4C: bipush 41 (0x29)
		// @4E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @51: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @54: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @57: athrow
		// @58: return
	}
	
	final long func_107074_c(int arg0)
	{
		// @00: iload_1
		// @01: ifeq @0F
		// @04: aload_0
		// @05: ldc2_w 82
		// @08: putfield long game.C_100301_kb.field_107093_c
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aload_0
		// @10: getfield long game.C_100301_kb.field_107088_f
		// @13: lreturn
		// @14: astore_2
		// @15: aload_2
		// @16: new java.lang.StringBuilder
		// @19: dup
		// @1A: invokespecial java.lang.StringBuilder.<init>()void
		// @1D: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @20: bipush 8 (0x08)
		// @22: aaload
		// @23: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @26: iload_1
		// @27: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2A: bipush 41 (0x29)
		// @2C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @32: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @35: athrow
	}
	
	final void func_107075_b(int arg0) throws IOException
	{
		// @00: aload_0
		// @01: iload_1
		// @02: bipush -106 (0x96)
		// @04: iadd
		// @05: invokespecial game.C_100301_kb.func_107077_a(int)void
		// @08: aload_0
		// @09: getfield game.C_100005_fk game.C_100301_kb.field_107090_d
		// @0C: bipush 61 (0x3D)
		// @0E: invokevirtual game.C_100005_fk.func_103586_b(byte)void
		// @11: iload_1
		// @12: iconst_m1
		// @13: if_icmpeq @1F
		// @16: bipush -38 (0xDA)
		// @18: invokestatic game.C_100301_kb.func_107082_d(int)void
		// @1B: goto @1F
		// @1E: athrow
		// @1F: goto @44
		// @22: astore_2
		// @23: aload_2
		// @24: new java.lang.StringBuilder
		// @27: dup
		// @28: invokespecial java.lang.StringBuilder.<init>()void
		// @2B: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @2E: bipush 7 (0x07)
		// @30: aaload
		// @31: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @34: iload_1
		// @35: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @38: bipush 41 (0x29)
		// @3A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @40: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @43: athrow
		// @44: return
	}
	
	final void func_107079_a(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: iload #4
		// @007: bipush -77 (0xB3)
		// @009: if_icmplt @016
		// @00C: aload_0
		// @00D: bipush -45 (0xD3)
		// @00F: putfield int game.C_100301_kb.field_107102_i
		// @012: goto @016
		// @015: athrow
		// @016: aload_0
		// @017: getfield long game.C_100301_kb.field_107088_f
		// @01A: aload_0
		// @01B: getfield long game.C_100301_kb.field_107093_c
		// @01E: iload_2
		// @01F: i2l
		// @020: ladd
		// @021: lcmp
		// @022: ifge @034
		// @025: aload_0
		// @026: aload_0
		// @027: getfield long game.C_100301_kb.field_107093_c
		// @02A: iload_2
		// @02B: i2l
		// @02C: ladd
		// @02D: putfield long game.C_100301_kb.field_107088_f
		// @030: goto @034
		// @033: athrow
		// @034: ldc2_w -1
		// @037: aload_0
		// @038: getfield long game.C_100301_kb.field_107098_m
		// @03B: lcmp
		// @03C: ifeq @080
		// @03F: aload_0
		// @040: getfield long game.C_100301_kb.field_107098_m
		// @043: ldc2_w -1
		// @046: lxor
		// @047: aload_0
		// @048: getfield long game.C_100301_kb.field_107093_c
		// @04B: ldc2_w -1
		// @04E: lxor
		// @04F: lcmp
		// @050: iflt @07A
		// @053: goto @057
		// @056: athrow
		// @057: aload_0
		// @058: getfield long game.C_100301_kb.field_107098_m
		// @05B: aload_0
		// @05C: getfield int game.C_100301_kb.field_107102_i
		// @05F: i2l
		// @060: lneg
		// @061: lsub
		// @062: ldc2_w -1
		// @065: lxor
		// @066: aload_0
		// @067: getfield long game.C_100301_kb.field_107093_c
		// @06A: ldc2_w -1
		// @06D: lxor
		// @06E: lcmp
		// @06F: ifgt @07A
		// @072: goto @076
		// @075: athrow
		// @076: goto @080
		// @079: athrow
		// @07A: aload_0
		// @07B: bipush -105 (0x97)
		// @07D: invokespecial game.C_100301_kb.func_107077_a(int)void
		// @080: aload_0
		// @081: getfield long game.C_100301_kb.field_107098_m
		// @084: ldc2_w -1
		// @087: lcmp
		// @088: ifeq @0F8
		// @08B: aload_0
		// @08C: getfield byte[] game.C_100301_kb.field_107101_h
		// @08F: arraylength
		// @090: i2l
		// @091: aload_0
		// @092: getfield long game.C_100301_kb.field_107098_m
		// @095: ladd
		// @096: iload_2
		// @097: i2l
		// @098: aload_0
		// @099: getfield long game.C_100301_kb.field_107093_c
		// @09C: ladd
		// @09D: lcmp
		// @09E: iflt @0A9
		// @0A1: goto @0A5
		// @0A4: athrow
		// @0A5: goto @0F8
		// @0A8: athrow
		// @0A9: aload_0
		// @0AA: getfield long game.C_100301_kb.field_107098_m
		// @0AD: aload_0
		// @0AE: getfield long game.C_100301_kb.field_107093_c
		// @0B1: lneg
		// @0B2: ladd
		// @0B3: aload_0
		// @0B4: getfield byte[] game.C_100301_kb.field_107101_h
		// @0B7: arraylength
		// @0B8: i2l
		// @0B9: ladd
		// @0BA: l2i
		// @0BB: istore #5
		// @0BD: aload_1
		// @0BE: iload_3
		// @0BF: aload_0
		// @0C0: getfield byte[] game.C_100301_kb.field_107101_h
		// @0C3: aload_0
		// @0C4: getfield long game.C_100301_kb.field_107098_m
		// @0C7: lneg
		// @0C8: aload_0
		// @0C9: getfield long game.C_100301_kb.field_107093_c
		// @0CC: ladd
		// @0CD: l2i
		// @0CE: iload #5
		// @0D0: invokestatic game.C_100120_en.func_104911_a(byte[], int, byte[], int, int)void
		// @0D3: iload_3
		// @0D4: iload #5
		// @0D6: iadd
		// @0D7: istore_3
		// @0D8: aload_0
		// @0D9: dup
		// @0DA: getfield long game.C_100301_kb.field_107093_c
		// @0DD: iload #5
		// @0DF: i2l
		// @0E0: ladd
		// @0E1: putfield long game.C_100301_kb.field_107093_c
		// @0E4: iload_2
		// @0E5: iload #5
		// @0E7: isub
		// @0E8: istore_2
		// @0E9: aload_0
		// @0EA: aload_0
		// @0EB: getfield byte[] game.C_100301_kb.field_107101_h
		// @0EE: arraylength
		// @0EF: putfield int game.C_100301_kb.field_107102_i
		// @0F2: aload_0
		// @0F3: bipush -121 (0x87)
		// @0F5: invokespecial game.C_100301_kb.func_107077_a(int)void
		// @0F8: iload_2
		// @0F9: aload_0
		// @0FA: getfield byte[] game.C_100301_kb.field_107101_h
		// @0FD: arraylength
		// @0FE: if_icmple @29C
		// @101: aload_0
		// @102: getfield long game.C_100301_kb.field_107093_c
		// @105: aload_0
		// @106: getfield long game.C_100301_kb.field_107099_j
		// @109: lcmp
		// @10A: ifne @115
		// @10D: goto @111
		// @110: athrow
		// @111: goto @12A
		// @114: athrow
		// @115: aload_0
		// @116: getfield game.C_100005_fk game.C_100301_kb.field_107090_d
		// @119: aload_0
		// @11A: getfield long game.C_100301_kb.field_107093_c
		// @11D: bipush -125 (0x83)
		// @11F: invokevirtual game.C_100005_fk.func_103587_a(long, byte)void
		// @122: aload_0
		// @123: aload_0
		// @124: getfield long game.C_100301_kb.field_107093_c
		// @127: putfield long game.C_100301_kb.field_107099_j
		// @12A: aload_0
		// @12B: getfield game.C_100005_fk game.C_100301_kb.field_107090_d
		// @12E: iload_3
		// @12F: aload_1
		// @130: iload_2
		// @131: bipush 52 (0x34)
		// @133: invokevirtual game.C_100005_fk.func_103588_a(int, byte[], int, int)void
		// @136: aload_0
		// @137: dup
		// @138: getfield long game.C_100301_kb.field_107099_j
		// @13B: iload_2
		// @13C: i2l
		// @13D: ladd
		// @13E: putfield long game.C_100301_kb.field_107099_j
		// @141: aload_0
		// @142: getfield long game.C_100301_kb.field_107097_l
		// @145: ldc2_w -1
		// @148: lxor
		// @149: aload_0
		// @14A: getfield long game.C_100301_kb.field_107099_j
		// @14D: ldc2_w -1
		// @150: lxor
		// @151: lcmp
		// @152: ifgt @159
		// @155: goto @161
		// @158: athrow
		// @159: aload_0
		// @15A: aload_0
		// @15B: getfield long game.C_100301_kb.field_107099_j
		// @15E: putfield long game.C_100301_kb.field_107097_l
		// @161: ldc2_w -1
		// @164: lstore #5
		// @166: aload_0
		// @167: getfield long game.C_100301_kb.field_107093_c
		// @16A: aload_0
		// @16B: getfield long game.C_100301_kb.field_107095_n
		// @16E: lcmp
		// @16F: iflt @188
		// @172: aload_0
		// @173: getfield long game.C_100301_kb.field_107093_c
		// @176: aload_0
		// @177: getfield int game.C_100301_kb.field_107096_o
		// @17A: i2l
		// @17B: aload_0
		// @17C: getfield long game.C_100301_kb.field_107095_n
		// @17F: ladd
		// @180: lcmp
		// @181: iflt @1CB
		// @184: goto @188
		// @187: athrow
		// @188: aload_0
		// @189: getfield long game.C_100301_kb.field_107095_n
		// @18C: ldc2_w -1
		// @18F: lxor
		// @190: aload_0
		// @191: getfield long game.C_100301_kb.field_107093_c
		// @194: ldc2_w -1
		// @197: lxor
		// @198: lcmp
		// @199: ifgt @1D1
		// @19C: goto @1A0
		// @19F: athrow
		// @1A0: aload_0
		// @1A1: getfield long game.C_100301_kb.field_107095_n
		// @1A4: ldc2_w -1
		// @1A7: lxor
		// @1A8: aload_0
		// @1A9: getfield long game.C_100301_kb.field_107093_c
		// @1AC: iload_2
		// @1AD: i2l
		// @1AE: lneg
		// @1AF: lsub
		// @1B0: ldc2_w -1
		// @1B3: lxor
		// @1B4: lcmp
		// @1B5: ifgt @1C0
		// @1B8: goto @1BC
		// @1BB: athrow
		// @1BC: goto @1D1
		// @1BF: athrow
		// @1C0: aload_0
		// @1C1: getfield long game.C_100301_kb.field_107095_n
		// @1C4: lstore #5
		// @1C6: iload #10
		// @1C8: ifeq @1D1
		// @1CB: aload_0
		// @1CC: getfield long game.C_100301_kb.field_107093_c
		// @1CF: lstore #5
		// @1D1: ldc2_w -1
		// @1D4: lstore #7
		// @1D6: aload_0
		// @1D7: getfield long game.C_100301_kb.field_107093_c
		// @1DA: iload_2
		// @1DB: i2l
		// @1DC: ladd
		// @1DD: aload_0
		// @1DE: getfield long game.C_100301_kb.field_107095_n
		// @1E1: lcmp
		// @1E2: ifle @1FE
		// @1E5: aload_0
		// @1E6: getfield int game.C_100301_kb.field_107096_o
		// @1E9: i2l
		// @1EA: aload_0
		// @1EB: getfield long game.C_100301_kb.field_107095_n
		// @1EE: ladd
		// @1EF: iload_2
		// @1F0: i2l
		// @1F1: aload_0
		// @1F2: getfield long game.C_100301_kb.field_107093_c
		// @1F5: ladd
		// @1F6: lcmp
		// @1F7: ifge @24C
		// @1FA: goto @1FE
		// @1FD: athrow
		// @1FE: aload_0
		// @1FF: getfield long game.C_100301_kb.field_107095_n
		// @202: aload_0
		// @203: getfield int game.C_100301_kb.field_107096_o
		// @206: i2l
		// @207: lneg
		// @208: lsub
		// @209: aload_0
		// @20A: getfield long game.C_100301_kb.field_107093_c
		// @20D: lcmp
		// @20E: ifle @255
		// @211: goto @215
		// @214: athrow
		// @215: iload_2
		// @216: i2l
		// @217: aload_0
		// @218: getfield long game.C_100301_kb.field_107093_c
		// @21B: ladd
		// @21C: ldc2_w -1
		// @21F: lxor
		// @220: aload_0
		// @221: getfield int game.C_100301_kb.field_107096_o
		// @224: i2l
		// @225: aload_0
		// @226: getfield long game.C_100301_kb.field_107095_n
		// @229: ladd
		// @22A: ldc2_w -1
		// @22D: lxor
		// @22E: lcmp
		// @22F: ifle @23A
		// @232: goto @236
		// @235: athrow
		// @236: goto @255
		// @239: athrow
		// @23A: aload_0
		// @23B: getfield long game.C_100301_kb.field_107095_n
		// @23E: aload_0
		// @23F: getfield int game.C_100301_kb.field_107096_o
		// @242: i2l
		// @243: lneg
		// @244: lsub
		// @245: lstore #7
		// @247: iload #10
		// @249: ifeq @255
		// @24C: iload_2
		// @24D: i2l
		// @24E: aload_0
		// @24F: getfield long game.C_100301_kb.field_107093_c
		// @252: ladd
		// @253: lstore #7
		// @255: lload #5
		// @257: ldc2_w -1
		// @25A: lcmp
		// @25B: ifle @290
		// @25E: lload #5
		// @260: lload #7
		// @262: lcmp
		// @263: ifge @290
		// @266: goto @26A
		// @269: athrow
		// @26A: lload #7
		// @26C: lload #5
		// @26E: lsub
		// @26F: l2i
		// @270: istore #9
		// @272: aload_1
		// @273: lload #5
		// @275: iload_3
		// @276: i2l
		// @277: ladd
		// @278: aload_0
		// @279: getfield long game.C_100301_kb.field_107093_c
		// @27C: lsub
		// @27D: l2i
		// @27E: aload_0
		// @27F: getfield byte[] game.C_100301_kb.field_107092_b
		// @282: lload #5
		// @284: aload_0
		// @285: getfield long game.C_100301_kb.field_107095_n
		// @288: lneg
		// @289: ladd
		// @28A: l2i
		// @28B: iload #9
		// @28D: invokestatic game.C_100120_en.func_104911_a(byte[], int, byte[], int, int)void
		// @290: aload_0
		// @291: dup
		// @292: getfield long game.C_100301_kb.field_107093_c
		// @295: iload_2
		// @296: i2l
		// @297: ladd
		// @298: putfield long game.C_100301_kb.field_107093_c
		// @29B: return
		// @29C: iload_2
		// @29D: iconst_m1
		// @29E: ixor
		// @29F: iconst_m1
		// @2A0: if_icmplt @2A7
		// @2A3: goto @30A
		// @2A6: athrow
		// @2A7: aload_0
		// @2A8: getfield long game.C_100301_kb.field_107098_m
		// @2AB: ldc2_w -1
		// @2AE: lcmp
		// @2AF: ifeq @2B6
		// @2B2: goto @2BE
		// @2B5: athrow
		// @2B6: aload_0
		// @2B7: aload_0
		// @2B8: getfield long game.C_100301_kb.field_107093_c
		// @2BB: putfield long game.C_100301_kb.field_107098_m
		// @2BE: aload_1
		// @2BF: iload_3
		// @2C0: aload_0
		// @2C1: getfield byte[] game.C_100301_kb.field_107101_h
		// @2C4: aload_0
		// @2C5: getfield long game.C_100301_kb.field_107093_c
		// @2C8: aload_0
		// @2C9: getfield long game.C_100301_kb.field_107098_m
		// @2CC: lsub
		// @2CD: l2i
		// @2CE: iload_2
		// @2CF: invokestatic game.C_100120_en.func_104911_a(byte[], int, byte[], int, int)void
		// @2D2: aload_0
		// @2D3: dup
		// @2D4: getfield long game.C_100301_kb.field_107093_c
		// @2D7: iload_2
		// @2D8: i2l
		// @2D9: ladd
		// @2DA: putfield long game.C_100301_kb.field_107093_c
		// @2DD: aload_0
		// @2DE: getfield long game.C_100301_kb.field_107093_c
		// @2E1: aload_0
		// @2E2: getfield long game.C_100301_kb.field_107098_m
		// @2E5: lsub
		// @2E6: ldc2_w -1
		// @2E9: lxor
		// @2EA: aload_0
		// @2EB: getfield int game.C_100301_kb.field_107102_i
		// @2EE: i2l
		// @2EF: ldc2_w -1
		// @2F2: lxor
		// @2F3: lcmp
		// @2F4: ifge @309
		// @2F7: aload_0
		// @2F8: aload_0
		// @2F9: getfield long game.C_100301_kb.field_107093_c
		// @2FC: aload_0
		// @2FD: getfield long game.C_100301_kb.field_107098_m
		// @300: lsub
		// @301: l2i
		// @302: putfield int game.C_100301_kb.field_107102_i
		// @305: goto @309
		// @308: athrow
		// @309: return
		// @30A: goto @319
		// @30D: astore #5
		// @30F: aload_0
		// @310: ldc2_w -1
		// @313: putfield long game.C_100301_kb.field_107099_j
		// @316: aload #5
		// @318: athrow
		// @319: goto @36D
		// @31C: astore #5
		// @31E: aload #5
		// @320: new java.lang.StringBuilder
		// @323: dup
		// @324: invokespecial java.lang.StringBuilder.<init>()void
		// @327: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @32A: bipush 12 (0x0C)
		// @32C: aaload
		// @32D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @330: aload_1
		// @331: ifnull @33D
		// @334: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @337: iconst_1
		// @338: aaload
		// @339: goto @342
		// @33C: athrow
		// @33D: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @340: iconst_0
		// @341: aaload
		// @342: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @345: bipush 44 (0x2C)
		// @347: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34A: iload_2
		// @34B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34E: bipush 44 (0x2C)
		// @350: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @353: iload_3
		// @354: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @357: bipush 44 (0x2C)
		// @359: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @35C: iload #4
		// @35E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @361: bipush 41 (0x29)
		// @363: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @366: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @369: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @36C: athrow
		// @36D: return
	}
	
	private final void func_107080_a(byte arg0) throws IOException
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iload_1
		// @06: bipush -54 (0xCA)
		// @08: if_icmpeq @15
		// @0B: aload_0
		// @0C: bipush -73 (0xB7)
		// @0E: putfield int game.C_100301_kb.field_107096_o
		// @11: goto @15
		// @14: athrow
		// @15: aload_0
		// @16: iconst_0
		// @17: putfield int game.C_100301_kb.field_107096_o
		// @1A: aload_0
		// @1B: getfield long game.C_100301_kb.field_107093_c
		// @1E: ldc2_w -1
		// @21: lxor
		// @22: aload_0
		// @23: getfield long game.C_100301_kb.field_107099_j
		// @26: ldc2_w -1
		// @29: lxor
		// @2A: lcmp
		// @2B: ifeq @47
		// @2E: aload_0
		// @2F: getfield game.C_100005_fk game.C_100301_kb.field_107090_d
		// @32: aload_0
		// @33: getfield long game.C_100301_kb.field_107093_c
		// @36: bipush -122 (0x86)
		// @38: invokevirtual game.C_100005_fk.func_103587_a(long, byte)void
		// @3B: aload_0
		// @3C: aload_0
		// @3D: getfield long game.C_100301_kb.field_107093_c
		// @40: putfield long game.C_100301_kb.field_107099_j
		// @43: goto @47
		// @46: athrow
		// @47: aload_0
		// @48: aload_0
		// @49: getfield long game.C_100301_kb.field_107093_c
		// @4C: putfield long game.C_100301_kb.field_107095_n
		// @4F: aload_0
		// @50: getfield byte[] game.C_100301_kb.field_107092_b
		// @53: arraylength
		// @54: iconst_m1
		// @55: ixor
		// @56: aload_0
		// @57: getfield int game.C_100301_kb.field_107096_o
		// @5A: iconst_m1
		// @5B: ixor
		// @5C: if_icmpge @BE
		// @5F: aload_0
		// @60: getfield byte[] game.C_100301_kb.field_107092_b
		// @63: arraylength
		// @64: aload_0
		// @65: getfield int game.C_100301_kb.field_107096_o
		// @68: ineg
		// @69: iadd
		// @6A: istore_2
		// @6B: iload #4
		// @6D: ifne @E2
		// @70: iload_2
		// @71: iconst_m1
		// @72: ixor
		// @73: ldc -200000001 (0xf4143dff)
		// @75: if_icmpge @7F
		// @78: goto @7C
		// @7B: athrow
		// @7C: ldc 200000000 (0xbebc200)
		// @7E: istore_2
		// @7F: aload_0
		// @80: getfield game.C_100005_fk game.C_100301_kb.field_107090_d
		// @83: bipush -122 (0x86)
		// @85: iload_2
		// @86: aload_0
		// @87: getfield byte[] game.C_100301_kb.field_107092_b
		// @8A: aload_0
		// @8B: getfield int game.C_100301_kb.field_107096_o
		// @8E: invokevirtual game.C_100005_fk.func_103579_a(byte, int, byte[], int)int
		// @91: istore_3
		// @92: iconst_m1
		// @93: iload_3
		// @94: if_icmpne @A0
		// @97: iload #4
		// @99: ifeq @BE
		// @9C: goto @A0
		// @9F: athrow
		// @A0: aload_0
		// @A1: dup
		// @A2: getfield int game.C_100301_kb.field_107096_o
		// @A5: iload_3
		// @A6: iadd
		// @A7: putfield int game.C_100301_kb.field_107096_o
		// @AA: aload_0
		// @AB: dup
		// @AC: getfield long game.C_100301_kb.field_107099_j
		// @AF: iload_3
		// @B0: i2l
		// @B1: ladd
		// @B2: putfield long game.C_100301_kb.field_107099_j
		// @B5: iload #4
		// @B7: ifeq @4F
		// @BA: goto @BE
		// @BD: athrow
		// @BE: goto @E2
		// @C1: astore_2
		// @C2: aload_2
		// @C3: new java.lang.StringBuilder
		// @C6: dup
		// @C7: invokespecial java.lang.StringBuilder.<init>()void
		// @CA: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @CD: iconst_5
		// @CE: aaload
		// @CF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D2: iload_1
		// @D3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D6: bipush 41 (0x29)
		// @D8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @DE: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @E1: athrow
		// @E2: return
	}
	
	final void func_107085_a(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #14
		// @005: aload #4
		// @007: arraylength
		// @008: iload_3
		// @009: iload_1
		// @00A: iadd
		// @00B: if_icmplt @012
		// @00E: goto @021
		// @011: athrow
		// @012: new java.lang.ArrayIndexOutOfBoundsException
		// @015: dup
		// @016: iload_3
		// @017: iload_1
		// @018: iadd
		// @019: aload #4
		// @01B: arraylength
		// @01C: isub
		// @01D: invokespecial java.lang.ArrayIndexOutOfBoundsException.<init>(int)void
		// @020: athrow
		// @021: aload_0
		// @022: getfield long game.C_100301_kb.field_107098_m
		// @025: ldc2_w -1
		// @028: lxor
		// @029: lconst_0
		// @02A: lcmp
		// @02B: ifeq @081
		// @02E: aload_0
		// @02F: getfield long game.C_100301_kb.field_107093_c
		// @032: ldc2_w -1
		// @035: lxor
		// @036: aload_0
		// @037: getfield long game.C_100301_kb.field_107098_m
		// @03A: ldc2_w -1
		// @03D: lxor
		// @03E: lcmp
		// @03F: ifgt @081
		// @042: goto @046
		// @045: athrow
		// @046: aload_0
		// @047: getfield long game.C_100301_kb.field_107098_m
		// @04A: aload_0
		// @04B: getfield int game.C_100301_kb.field_107102_i
		// @04E: i2l
		// @04F: ladd
		// @050: aload_0
		// @051: getfield long game.C_100301_kb.field_107093_c
		// @054: iload_3
		// @055: i2l
		// @056: lneg
		// @057: lsub
		// @058: lcmp
		// @059: iflt @081
		// @05C: goto @060
		// @05F: athrow
		// @060: aload_0
		// @061: getfield byte[] game.C_100301_kb.field_107101_h
		// @064: aload_0
		// @065: getfield long game.C_100301_kb.field_107093_c
		// @068: aload_0
		// @069: getfield long game.C_100301_kb.field_107098_m
		// @06C: lsub
		// @06D: l2i
		// @06E: aload #4
		// @070: iload_1
		// @071: iload_3
		// @072: invokestatic game.C_100120_en.func_104911_a(byte[], int, byte[], int, int)void
		// @075: aload_0
		// @076: dup
		// @077: getfield long game.C_100301_kb.field_107093_c
		// @07A: iload_3
		// @07B: i2l
		// @07C: ladd
		// @07D: putfield long game.C_100301_kb.field_107093_c
		// @080: return
		// @081: iload_2
		// @082: bipush -90 (0xA6)
		// @084: if_icmplt @092
		// @087: iconst_1
		// @088: bipush -92 (0xA4)
		// @08A: invokestatic game.C_100301_kb.func_107087_a(boolean, int)boolean
		// @08D: pop
		// @08E: goto @092
		// @091: athrow
		// @092: aload_0
		// @093: getfield long game.C_100301_kb.field_107093_c
		// @096: lstore #5
		// @098: iload_1
		// @099: istore #7
		// @09B: iload_3
		// @09C: istore #8
		// @09E: aload_0
		// @09F: getfield long game.C_100301_kb.field_107095_n
		// @0A2: ldc2_w -1
		// @0A5: lxor
		// @0A6: aload_0
		// @0A7: getfield long game.C_100301_kb.field_107093_c
		// @0AA: ldc2_w -1
		// @0AD: lxor
		// @0AE: lcmp
		// @0AF: iflt @11D
		// @0B2: aload_0
		// @0B3: getfield long game.C_100301_kb.field_107095_n
		// @0B6: aload_0
		// @0B7: getfield int game.C_100301_kb.field_107096_o
		// @0BA: i2l
		// @0BB: ladd
		// @0BC: ldc2_w -1
		// @0BF: lxor
		// @0C0: aload_0
		// @0C1: getfield long game.C_100301_kb.field_107093_c
		// @0C4: ldc2_w -1
		// @0C7: lxor
		// @0C8: lcmp
		// @0C9: ifge @11D
		// @0CC: goto @0D0
		// @0CF: athrow
		// @0D0: aload_0
		// @0D1: getfield long game.C_100301_kb.field_107095_n
		// @0D4: aload_0
		// @0D5: getfield long game.C_100301_kb.field_107093_c
		// @0D8: lneg
		// @0D9: ladd
		// @0DA: aload_0
		// @0DB: getfield int game.C_100301_kb.field_107096_o
		// @0DE: i2l
		// @0DF: ladd
		// @0E0: l2i
		// @0E1: istore #9
		// @0E3: iload #9
		// @0E5: iconst_m1
		// @0E6: ixor
		// @0E7: iload_3
		// @0E8: iconst_m1
		// @0E9: ixor
		// @0EA: if_icmpge @0F0
		// @0ED: iload_3
		// @0EE: istore #9
		// @0F0: aload_0
		// @0F1: getfield byte[] game.C_100301_kb.field_107092_b
		// @0F4: aload_0
		// @0F5: getfield long game.C_100301_kb.field_107093_c
		// @0F8: aload_0
		// @0F9: getfield long game.C_100301_kb.field_107095_n
		// @0FC: lneg
		// @0FD: ladd
		// @0FE: l2i
		// @0FF: aload #4
		// @101: iload_1
		// @102: iload #9
		// @104: invokestatic game.C_100120_en.func_104911_a(byte[], int, byte[], int, int)void
		// @107: iload_3
		// @108: iload #9
		// @10A: isub
		// @10B: istore_3
		// @10C: iload_1
		// @10D: iload #9
		// @10F: iadd
		// @110: istore_1
		// @111: aload_0
		// @112: dup
		// @113: getfield long game.C_100301_kb.field_107093_c
		// @116: iload #9
		// @118: i2l
		// @119: ladd
		// @11A: putfield long game.C_100301_kb.field_107093_c
		// @11D: aload_0
		// @11E: getfield byte[] game.C_100301_kb.field_107092_b
		// @121: arraylength
		// @122: iconst_m1
		// @123: ixor
		// @124: iload_3
		// @125: iconst_m1
		// @126: ixor
		// @127: if_icmpgt @17B
		// @12A: iconst_0
		// @12B: iload_3
		// @12C: if_icmplt @137
		// @12F: goto @133
		// @132: athrow
		// @133: goto @1DE
		// @136: athrow
		// @137: aload_0
		// @138: bipush -54 (0xCA)
		// @13A: invokespecial game.C_100301_kb.func_107080_a(byte)void
		// @13D: iload_3
		// @13E: istore #9
		// @140: aload_0
		// @141: getfield int game.C_100301_kb.field_107096_o
		// @144: iconst_m1
		// @145: ixor
		// @146: iload #9
		// @148: iconst_m1
		// @149: ixor
		// @14A: if_icmple @153
		// @14D: aload_0
		// @14E: getfield int game.C_100301_kb.field_107096_o
		// @151: istore #9
		// @153: aload_0
		// @154: getfield byte[] game.C_100301_kb.field_107092_b
		// @157: iconst_0
		// @158: aload #4
		// @15A: iload_1
		// @15B: iload #9
		// @15D: invokestatic game.C_100120_en.func_104911_a(byte[], int, byte[], int, int)void
		// @160: iload_1
		// @161: iload #9
		// @163: iadd
		// @164: istore_1
		// @165: aload_0
		// @166: dup
		// @167: getfield long game.C_100301_kb.field_107093_c
		// @16A: iload #9
		// @16C: i2l
		// @16D: ladd
		// @16E: putfield long game.C_100301_kb.field_107093_c
		// @171: iload_3
		// @172: iload #9
		// @174: isub
		// @175: istore_3
		// @176: iload #14
		// @178: ifeq @1DE
		// @17B: aload_0
		// @17C: getfield game.C_100005_fk game.C_100301_kb.field_107090_d
		// @17F: aload_0
		// @180: getfield long game.C_100301_kb.field_107093_c
		// @183: bipush -126 (0x82)
		// @185: invokevirtual game.C_100005_fk.func_103587_a(long, byte)void
		// @188: aload_0
		// @189: aload_0
		// @18A: getfield long game.C_100301_kb.field_107093_c
		// @18D: putfield long game.C_100301_kb.field_107099_j
		// @190: goto @194
		// @193: athrow
		// @194: iload_3
		// @195: ifle @1DE
		// @198: aload_0
		// @199: getfield game.C_100005_fk game.C_100301_kb.field_107090_d
		// @19C: bipush -31 (0xE1)
		// @19E: iload_3
		// @19F: aload #4
		// @1A1: iload_1
		// @1A2: invokevirtual game.C_100005_fk.func_103579_a(byte, int, byte[], int)int
		// @1A5: istore #9
		// @1A7: iload #9
		// @1A9: iconst_m1
		// @1AA: ixor
		// @1AB: iload #14
		// @1AD: ifne @1E6
		// @1B0: ifeq @1DE
		// @1B3: goto @1B7
		// @1B6: athrow
		// @1B7: iload_1
		// @1B8: iload #9
		// @1BA: iadd
		// @1BB: istore_1
		// @1BC: iload_3
		// @1BD: iload #9
		// @1BF: isub
		// @1C0: istore_3
		// @1C1: aload_0
		// @1C2: dup
		// @1C3: getfield long game.C_100301_kb.field_107099_j
		// @1C6: iload #9
		// @1C8: i2l
		// @1C9: ladd
		// @1CA: putfield long game.C_100301_kb.field_107099_j
		// @1CD: aload_0
		// @1CE: dup
		// @1CF: getfield long game.C_100301_kb.field_107093_c
		// @1D2: iload #9
		// @1D4: i2l
		// @1D5: ladd
		// @1D6: putfield long game.C_100301_kb.field_107093_c
		// @1D9: iload #14
		// @1DB: ifeq @194
		// @1DE: aload_0
		// @1DF: getfield long game.C_100301_kb.field_107098_m
		// @1E2: ldc2_w -1
		// @1E5: lcmp
		// @1E6: ifne @1EC
		// @1E9: goto @398
		// @1EC: aload_0
		// @1ED: getfield long game.C_100301_kb.field_107098_m
		// @1F0: aload_0
		// @1F1: getfield long game.C_100301_kb.field_107093_c
		// @1F4: lcmp
		// @1F5: ifle @247
		// @1F8: iconst_m1
		// @1F9: iload_3
		// @1FA: iconst_m1
		// @1FB: ixor
		// @1FC: if_icmple @247
		// @1FF: goto @203
		// @202: athrow
		// @203: aload_0
		// @204: getfield long game.C_100301_kb.field_107098_m
		// @207: aload_0
		// @208: getfield long game.C_100301_kb.field_107093_c
		// @20B: lsub
		// @20C: l2i
		// @20D: iload_1
		// @20E: iadd
		// @20F: istore #9
		// @211: iload #9
		// @213: iload_3
		// @214: iload_1
		// @215: iadd
		// @216: if_icmple @21E
		// @219: iload_3
		// @21A: iload_1
		// @21B: iadd
		// @21C: istore #9
		// @21E: iload #9
		// @220: iload_1
		// @221: if_icmple @247
		// @224: iinc #3 +255
		// @227: aload #4
		// @229: iload_1
		// @22A: iinc #1 +1
		// @22D: iconst_0
		// @22E: bastore
		// @22F: aload_0
		// @230: dup
		// @231: getfield long game.C_100301_kb.field_107093_c
		// @234: lconst_1
		// @235: ladd
		// @236: putfield long game.C_100301_kb.field_107093_c
		// @239: iload #14
		// @23B: ifne @398
		// @23E: iload #14
		// @240: ifeq @21E
		// @243: goto @247
		// @246: athrow
		// @247: ldc2_w -1
		// @24A: lstore #9
		// @24C: aload_0
		// @24D: getfield long game.C_100301_kb.field_107098_m
		// @250: ldc2_w -1
		// @253: lxor
		// @254: lload #5
		// @256: ldc2_w -1
		// @259: lxor
		// @25A: lcmp
		// @25B: ifgt @27B
		// @25E: lload #5
		// @260: iload #8
		// @262: i2l
		// @263: ladd
		// @264: aload_0
		// @265: getfield long game.C_100301_kb.field_107098_m
		// @268: lcmp
		// @269: ifle @27B
		// @26C: goto @270
		// @26F: athrow
		// @270: aload_0
		// @271: getfield long game.C_100301_kb.field_107098_m
		// @274: lstore #9
		// @276: iload #14
		// @278: ifeq @2A5
		// @27B: lload #5
		// @27D: aload_0
		// @27E: getfield long game.C_100301_kb.field_107098_m
		// @281: lcmp
		// @282: iflt @2A5
		// @285: goto @289
		// @288: athrow
		// @289: lload #5
		// @28B: aload_0
		// @28C: getfield int game.C_100301_kb.field_107102_i
		// @28F: i2l
		// @290: aload_0
		// @291: getfield long game.C_100301_kb.field_107098_m
		// @294: ladd
		// @295: lcmp
		// @296: iflt @2A1
		// @299: goto @29D
		// @29C: athrow
		// @29D: goto @2A5
		// @2A0: athrow
		// @2A1: lload #5
		// @2A3: lstore #9
		// @2A5: ldc2_w -1
		// @2A8: lstore #11
		// @2AA: lload #5
		// @2AC: ldc2_w -1
		// @2AF: lxor
		// @2B0: aload_0
		// @2B1: getfield long game.C_100301_kb.field_107098_m
		// @2B4: aload_0
		// @2B5: getfield int game.C_100301_kb.field_107102_i
		// @2B8: i2l
		// @2B9: lneg
		// @2BA: lsub
		// @2BB: ldc2_w -1
		// @2BE: lxor
		// @2BF: lcmp
		// @2C0: ifle @2ED
		// @2C3: aload_0
		// @2C4: getfield long game.C_100301_kb.field_107098_m
		// @2C7: aload_0
		// @2C8: getfield int game.C_100301_kb.field_107102_i
		// @2CB: i2l
		// @2CC: lneg
		// @2CD: lsub
		// @2CE: iload #8
		// @2D0: i2l
		// @2D1: lload #5
		// @2D3: ladd
		// @2D4: lcmp
		// @2D5: ifgt @2ED
		// @2D8: goto @2DC
		// @2DB: athrow
		// @2DC: aload_0
		// @2DD: getfield long game.C_100301_kb.field_107098_m
		// @2E0: aload_0
		// @2E1: getfield int game.C_100301_kb.field_107102_i
		// @2E4: i2l
		// @2E5: ladd
		// @2E6: lstore #11
		// @2E8: iload #14
		// @2EA: ifeq @32C
		// @2ED: lload #5
		// @2EF: iload #8
		// @2F1: i2l
		// @2F2: ladd
		// @2F3: ldc2_w -1
		// @2F6: lxor
		// @2F7: aload_0
		// @2F8: getfield long game.C_100301_kb.field_107098_m
		// @2FB: ldc2_w -1
		// @2FE: lxor
		// @2FF: lcmp
		// @300: ifge @32C
		// @303: goto @307
		// @306: athrow
		// @307: aload_0
		// @308: getfield long game.C_100301_kb.field_107098_m
		// @30B: aload_0
		// @30C: getfield int game.C_100301_kb.field_107102_i
		// @30F: i2l
		// @310: lneg
		// @311: lsub
		// @312: iload #8
		// @314: i2l
		// @315: lload #5
		// @317: ladd
		// @318: lcmp
		// @319: ifge @324
		// @31C: goto @320
		// @31F: athrow
		// @320: goto @32C
		// @323: athrow
		// @324: lload #5
		// @326: iload #8
		// @328: i2l
		// @329: ladd
		// @32A: lstore #11
		// @32C: ldc2_w -1
		// @32F: lload #9
		// @331: lcmp
		// @332: ifge @398
		// @335: lload #9
		// @337: ldc2_w -1
		// @33A: lxor
		// @33B: lload #11
		// @33D: ldc2_w -1
		// @340: lxor
		// @341: lcmp
		// @342: ifle @398
		// @345: goto @349
		// @348: athrow
		// @349: lload #9
		// @34B: lneg
		// @34C: lload #11
		// @34E: ladd
		// @34F: l2i
		// @350: istore #13
		// @352: aload_0
		// @353: getfield byte[] game.C_100301_kb.field_107101_h
		// @356: lload #9
		// @358: aload_0
		// @359: getfield long game.C_100301_kb.field_107098_m
		// @35C: lsub
		// @35D: l2i
		// @35E: aload #4
		// @360: lload #5
		// @362: lneg
		// @363: lload #9
		// @365: ladd
		// @366: l2i
		// @367: iload #7
		// @369: iadd
		// @36A: iload #13
		// @36C: invokestatic game.C_100120_en.func_104911_a(byte[], int, byte[], int, int)void
		// @36F: lload #11
		// @371: ldc2_w -1
		// @374: lxor
		// @375: aload_0
		// @376: getfield long game.C_100301_kb.field_107093_c
		// @379: ldc2_w -1
		// @37C: lxor
		// @37D: lcmp
		// @37E: iflt @385
		// @381: goto @398
		// @384: athrow
		// @385: iload_3
		// @386: i2l
		// @387: lload #11
		// @389: aload_0
		// @38A: getfield long game.C_100301_kb.field_107093_c
		// @38D: lneg
		// @38E: ladd
		// @38F: lsub
		// @390: l2i
		// @391: istore_3
		// @392: aload_0
		// @393: lload #11
		// @395: putfield long game.C_100301_kb.field_107093_c
		// @398: goto @3A7
		// @39B: astore #5
		// @39D: aload_0
		// @39E: ldc2_w -1
		// @3A1: putfield long game.C_100301_kb.field_107099_j
		// @3A4: aload #5
		// @3A6: athrow
		// @3A7: iload_3
		// @3A8: iconst_m1
		// @3A9: ixor
		// @3AA: iconst_m1
		// @3AB: if_icmpge @3B7
		// @3AE: new java.io.EOFException
		// @3B1: dup
		// @3B2: invokespecial java.io.EOFException.<init>()void
		// @3B5: athrow
		// @3B6: athrow
		// @3B7: goto @40B
		// @3BA: astore #5
		// @3BC: aload #5
		// @3BE: new java.lang.StringBuilder
		// @3C1: dup
		// @3C2: invokespecial java.lang.StringBuilder.<init>()void
		// @3C5: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @3C8: bipush 6 (0x06)
		// @3CA: aaload
		// @3CB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3CE: iload_1
		// @3CF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3D2: bipush 44 (0x2C)
		// @3D4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D7: iload_2
		// @3D8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3DB: bipush 44 (0x2C)
		// @3DD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3E0: iload_3
		// @3E1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E4: bipush 44 (0x2C)
		// @3E6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3E9: aload #4
		// @3EB: ifnull @3F7
		// @3EE: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @3F1: iconst_1
		// @3F2: aaload
		// @3F3: goto @3FC
		// @3F6: athrow
		// @3F7: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @3FA: iconst_0
		// @3FB: aaload
		// @3FC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3FF: bipush 41 (0x29)
		// @401: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @404: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @407: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @40A: athrow
		// @40B: return
	}
	
	static final boolean func_107087_a(boolean arg0, int arg1)
	{
		// @00: iload_0
		// @01: iconst_1
		// @02: if_icmpeq @0E
		// @05: bipush -94 (0xA2)
		// @07: putstatic int game.C_100301_kb.field_107103_p
		// @0A: goto @0E
		// @0D: athrow
		// @0E: iload_1
		// @0F: iload_1
		// @10: ineg
		// @11: iload_1
		// @12: iand
		// @13: if_icmpne @1B
		// @16: iconst_1
		// @17: goto @1C
		// @1A: athrow
		// @1B: iconst_0
		// @1C: ireturn
		// @1D: astore_2
		// @1E: aload_2
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @29: bipush 13 (0x0D)
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_0
		// @30: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @33: bipush 44 (0x2C)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: iload_1
		// @39: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3C: bipush 41 (0x29)
		// @3E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @41: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @44: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @47: athrow
	}
	
	C_100301_kb(C_100005_fk arg0, int arg1, int arg2) throws IOException
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: ldc2_w -1
		// @08: putfield long game.C_100301_kb.field_107098_m
		// @0B: aload_0
		// @0C: ldc2_w -1
		// @0F: putfield long game.C_100301_kb.field_107095_n
		// @12: aload_0
		// @13: iconst_0
		// @14: putfield int game.C_100301_kb.field_107102_i
		// @17: aload_0
		// @18: aload_1
		// @19: putfield game.C_100005_fk game.C_100301_kb.field_107090_d
		// @1C: aload_0
		// @1D: aload_0
		// @1E: aload_1
		// @1F: bipush -119 (0x89)
		// @21: invokevirtual game.C_100005_fk.func_103585_a(int)long
		// @24: dup2_x1
		// @25: putfield long game.C_100301_kb.field_107097_l
		// @28: putfield long game.C_100301_kb.field_107088_f
		// @2B: aload_0
		// @2C: iload_3
		// @2D: newarray byte[]
		// @2F: putfield byte[] game.C_100301_kb.field_107101_h
		// @32: aload_0
		// @33: lconst_0
		// @34: putfield long game.C_100301_kb.field_107093_c
		// @37: aload_0
		// @38: iload_2
		// @39: newarray byte[]
		// @3B: putfield byte[] game.C_100301_kb.field_107092_b
		// @3E: goto @87
		// @41: astore #4
		// @43: aload #4
		// @45: new java.lang.StringBuilder
		// @48: dup
		// @49: invokespecial java.lang.StringBuilder.<init>()void
		// @4C: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @4F: iconst_2
		// @50: aaload
		// @51: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @54: aload_1
		// @55: ifnull @61
		// @58: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @5B: iconst_1
		// @5C: aaload
		// @5D: goto @66
		// @60: athrow
		// @61: getstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @64: iconst_0
		// @65: aaload
		// @66: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @69: bipush 44 (0x2C)
		// @6B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6E: iload_2
		// @6F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @72: bipush 44 (0x2C)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: iload_3
		// @78: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7B: bipush 41 (0x29)
		// @7D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @80: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @83: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @86: athrow
		// @87: return
	}
	
	static
	{
		// @00: bipush 15 (0x0F)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "Gd{\u000e"
		// @09: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "R?9L\u000e"
		// @14: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @17: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "Bs9^\u001aGxc\\["
		// @1F: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @22: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "Bs9&["
		// @2A: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "Bs9.["
		// @35: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @38: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "Bs9(["
		// @40: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @43: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "Bs9'["
		// @4C: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "Bs9)["
		// @58: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "Bs9#["
		// @64: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @67: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "Bs9%["
		// @70: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @73: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "Bs9!["
		// @7C: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "Bs9+["
		// @88: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @8E: aastore
		// @8F: dup
		// @90: bipush 12 (0x0C)
		// @92: ldc "Bs9*["
		// @94: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @97: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @9A: aastore
		// @9B: dup
		// @9C: bipush 13 (0x0D)
		// @9E: ldc "Bs9 ["
		// @A0: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @A3: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @A6: aastore
		// @A7: dup
		// @A8: bipush 14 (0x0E)
		// @AA: ldc "Bs9$["
		// @AC: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @AF: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @B2: aastore
		// @B3: putstatic java.lang.String[] game.C_100301_kb.field_107104_z
		// @B6: ldc "dT['6"
		// @B8: invokestatic game.C_100301_kb.func_107081_z(java.lang.String)char[]
		// @BB: invokestatic game.C_100301_kb.func_107078_z(char[])java.lang.String
		// @BE: putstatic java.lang.String game.C_100301_kb.field_107091_e
		// @C1: bipush 8 (0x08)
		// @C3: newarray int[]
		// @C5: dup
		// @C6: iconst_0
		// @C7: iconst_m1
		// @C8: iastore
		// @C9: dup
		// @CA: iconst_1
		// @CB: iconst_m1
		// @CC: iastore
		// @CD: dup
		// @CE: iconst_2
		// @CF: iconst_m1
		// @D0: iastore
		// @D1: dup
		// @D2: iconst_3
		// @D3: iconst_m1
		// @D4: iastore
		// @D5: dup
		// @D6: iconst_4
		// @D7: iconst_m1
		// @D8: iastore
		// @D9: dup
		// @DA: iconst_5
		// @DB: iconst_m1
		// @DC: iastore
		// @DD: dup
		// @DE: bipush 6 (0x06)
		// @E0: iconst_m1
		// @E1: iastore
		// @E2: dup
		// @E3: bipush 7 (0x07)
		// @E5: iconst_m1
		// @E6: iastore
		// @E7: putstatic int[] game.C_100301_kb.field_107089_g
		// @EA: return
	}
	
	private static char[] func_107081_z(String arg0)
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
		// @0E: bipush 115 (0x73)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_107078_z(char[] arg0)
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
		// @30: bipush 41 (0x29)
		// @32: goto @46
		// @35: bipush 17 (0x11)
		// @37: goto @46
		// @3A: bipush 23 (0x17)
		// @3C: goto @46
		// @3F: bipush 98 (0x62)
		// @41: goto @46
		// @44: bipush 115 (0x73)
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
