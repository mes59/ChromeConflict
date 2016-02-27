package game;

final class C_100124_tn
{
	static String[] field_104932_g;
	static int field_104934_e;
	static String field_104933_d;
	static C_100037_wb[] field_104936_c;
	static C_100331_ie field_104937_a;
	static int[] field_104931_f;
	static String[] field_104935_b;
	private static final String[] field_104938_z;
	
	static final void func_104928_a(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @008: astore_1
		// @009: iload_0
		// @00A: ifeq @00E
		// @00D: return
		// @00E: aload_1
		// @00F: iconst_0
		// @010: invokevirtual game.C_100278_nd.func_101156_c(boolean)int
		// @013: istore_2
		// @014: iconst_m1
		// @015: iload_2
		// @016: iconst_m1
		// @017: ixor
		// @018: if_icmpeq @0B7
		// @01B: iconst_1
		// @01C: iload_2
		// @01D: if_icmpeq @091
		// @020: goto @024
		// @023: athrow
		// @024: iload_2
		// @025: iconst_m1
		// @026: ixor
		// @027: bipush -3 (0xFD)
		// @029: if_icmpeq @05E
		// @02C: goto @030
		// @02F: athrow
		// @030: iconst_1
		// @031: new java.lang.StringBuilder
		// @034: dup
		// @035: invokespecial java.lang.StringBuilder.<init>()void
		// @038: getstatic java.lang.String[] game.C_100124_tn.field_104938_z
		// @03B: iconst_0
		// @03C: aaload
		// @03D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @040: bipush 82 (0x52)
		// @042: invokestatic game.C_100316_lc.func_102399_d(byte)java.lang.String
		// @045: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @048: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @04B: aconst_null
		// @04C: invokestatic game.C_100036_gg.func_103142_a(int, java.lang.String, java.lang.Throwable)void
		// @04F: sipush 13313 (0x3401)
		// @052: invokestatic game.C_100095_fe.func_103371_l(int)void
		// @055: iload #8
		// @057: ifeq @123
		// @05A: goto @05E
		// @05D: athrow
		// @05E: getstatic game.C_100202_qi game.C_100249_pc.field_102342_x
		// @061: bipush 59 (0x3B)
		// @063: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @066: checkcast game.C_100219_an
		// @069: astore_3
		// @06A: aload_3
		// @06B: ifnull @072
		// @06E: goto @079
		// @071: athrow
		// @072: sipush 13313 (0x3401)
		// @075: invokestatic game.C_100095_fe.func_103371_l(int)void
		// @078: return
		// @079: aload_3
		// @07A: iconst_2
		// @07B: invokestatic game.C_100015_wh.func_103779_b(int)int[]
		// @07E: putfield int[] game.C_100219_an.field_100881_k
		// @081: aload_3
		// @082: iconst_1
		// @083: putfield boolean game.C_100219_an.field_100879_j
		// @086: aload_3
		// @087: bipush 45 (0x2D)
		// @089: invokevirtual game.C_100219_an.func_100583_c(int)void
		// @08C: iload #8
		// @08E: ifeq @123
		// @091: getstatic game.C_100202_qi game.C_100133_tk.field_105000_c
		// @094: bipush 94 (0x5E)
		// @096: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @099: checkcast game.C_100075_uj
		// @09C: astore_3
		// @09D: aload_3
		// @09E: ifnull @0A5
		// @0A1: goto @0AC
		// @0A4: athrow
		// @0A5: sipush 13313 (0x3401)
		// @0A8: invokestatic game.C_100095_fe.func_103371_l(int)void
		// @0AB: return
		// @0AC: aload_3
		// @0AD: bipush 45 (0x2D)
		// @0AF: invokevirtual game.C_100075_uj.func_100583_c(int)void
		// @0B2: iload #8
		// @0B4: ifeq @123
		// @0B7: iconst_2
		// @0B8: invokestatic game.C_100015_wh.func_103779_b(int)int[]
		// @0BB: astore_3
		// @0BC: aload_3
		// @0BD: astore #4
		// @0BF: aload_1
		// @0C0: astore #5
		// @0C2: aload #5
		// @0C4: iconst_0
		// @0C5: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @0C8: istore #6
		// @0CA: iconst_0
		// @0CB: istore #7
		// @0CD: iload #6
		// @0CF: iload #7
		// @0D1: if_icmple @0F2
		// @0D4: aload #4
		// @0D6: iload #7
		// @0D8: aload #5
		// @0DA: sipush -1543 (0xF9F9)
		// @0DD: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @0E0: iastore
		// @0E1: iinc #7 +1
		// @0E4: iload #8
		// @0E6: ifne @123
		// @0E9: iload #8
		// @0EB: ifeq @0CD
		// @0EE: goto @0F2
		// @0F1: athrow
		// @0F2: getstatic game.C_100202_qi game.C_100249_pc.field_102342_x
		// @0F5: iload_0
		// @0F6: bipush 27 (0x1B)
		// @0F8: ixor
		// @0F9: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @0FC: checkcast game.C_100219_an
		// @0FF: astore #4
		// @101: aconst_null
		// @102: aload #4
		// @104: if_acmpne @110
		// @107: iload_0
		// @108: sipush 13313 (0x3401)
		// @10B: ixor
		// @10C: invokestatic game.C_100095_fe.func_103371_l(int)void
		// @10F: return
		// @110: aload #4
		// @112: aload_3
		// @113: putfield int[] game.C_100219_an.field_100881_k
		// @116: aload #4
		// @118: iconst_1
		// @119: putfield boolean game.C_100219_an.field_100879_j
		// @11C: aload #4
		// @11E: bipush 45 (0x2D)
		// @120: invokevirtual game.C_100219_an.func_100583_c(int)void
		// @123: goto @147
		// @126: astore_1
		// @127: aload_1
		// @128: new java.lang.StringBuilder
		// @12B: dup
		// @12C: invokespecial java.lang.StringBuilder.<init>()void
		// @12F: getstatic java.lang.String[] game.C_100124_tn.field_104938_z
		// @132: iconst_1
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
	
	public static void func_104927_b(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String[] game.C_100124_tn.field_104932_g
		// @04: iload_0
		// @05: iconst_m1
		// @06: if_icmpeq @0A
		// @09: return
		// @0A: aconst_null
		// @0B: putstatic java.lang.String game.C_100124_tn.field_104933_d
		// @0E: aconst_null
		// @0F: putstatic int[] game.C_100124_tn.field_104931_f
		// @12: aconst_null
		// @13: putstatic java.lang.String[] game.C_100124_tn.field_104935_b
		// @16: aconst_null
		// @17: putstatic game.C_100331_ie game.C_100124_tn.field_104937_a
		// @1A: aconst_null
		// @1B: putstatic game.C_100037_wb[] game.C_100124_tn.field_104936_c
		// @1E: goto @42
		// @21: astore_1
		// @22: aload_1
		// @23: new java.lang.StringBuilder
		// @26: dup
		// @27: invokespecial java.lang.StringBuilder.<init>()void
		// @2A: getstatic java.lang.String[] game.C_100124_tn.field_104938_z
		// @2D: iconst_2
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
		// @00: iconst_3
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "PUI]"
		// @08: invokestatic game.C_100124_tn.func_104930_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100124_tn.func_104929_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "e\n]?r"
		// @13: invokestatic game.C_100124_tn.func_104930_z(java.lang.String)char[]
		// @16: invokestatic game.C_100124_tn.func_104929_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "e\n]<r"
		// @1E: invokestatic game.C_100124_tn.func_104930_z(java.lang.String)char[]
		// @21: invokestatic game.C_100124_tn.func_104929_z(char[])java.lang.String
		// @24: aastore
		// @25: putstatic java.lang.String[] game.C_100124_tn.field_104938_z
		// @28: ldc "_\u0005\u001e\u0018)1\u0007\u0012\u0013z~\n\u001f\u0004zr\u000b\u001d\t;x\nS\u0011?e\u0010\u0016\u000f)=D\u001d\u00087s\u0001\u0001\u000ev1\u0017\u0003\u001c9t\u0017S\u001c4uD\u0006\u0013>t\u0016\u0000\u001e5c\u0001\u0000"
		// @2A: invokestatic game.C_100124_tn.func_104930_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100124_tn.func_104929_z(char[])java.lang.String
		// @30: putstatic java.lang.String game.C_100124_tn.field_104933_d
		// @33: sipush 8192 (0x2000)
		// @36: newarray int[]
		// @38: putstatic int[] game.C_100124_tn.field_104931_f
		// @3B: return
	}
	
	private static char[] func_104930_z(String arg0)
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
		// @0E: bipush 90 (0x5A)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104929_z(char[] arg0)
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
		// @30: bipush 17 (0x11)
		// @32: goto @46
		// @35: bipush 100 (0x64)
		// @37: goto @46
		// @3A: bipush 115 (0x73)
		// @3C: goto @46
		// @3F: bipush 125 (0x7D)
		// @41: goto @46
		// @44: bipush 90 (0x5A)
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
