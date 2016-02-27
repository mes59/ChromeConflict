package game;

final class C_100074_g
{
	static C_100037_wb[] field_104411_b;
	static int[] field_104410_e;
	static C_100107_u field_104412_c;
	static C_100037_wb[][] field_104413_a;
	static String field_104409_d;
	private static final String[] field_104414_z;
	
	static final C_100182_cc func_104404_a(int arg0, int arg1, C_100098_h arg2, C_100098_h arg3, int arg4)
	{
		// @00: iload_0
		// @01: iconst_1
		// @02: aload_2
		// @03: iload #4
		// @05: invokestatic game.C_100333_ij.func_107341_a(int, boolean, game.C_100098_h, int)boolean
		// @08: ifne @0D
		// @0B: aconst_null
		// @0C: areturn
		// @0D: iload_1
		// @0E: sipush -30001 (0x8ACF)
		// @11: if_icmpeq @19
		// @14: aconst_null
		// @15: checkcast game.C_100182_cc
		// @18: areturn
		// @19: bipush -103 (0x99)
		// @1B: aload_3
		// @1C: iload #4
		// @1E: iload_1
		// @1F: sipush -30001 (0x8ACF)
		// @22: ixor
		// @23: iload_0
		// @24: invokevirtual game.C_100098_h.func_104610_b(int, int, int)byte[]
		// @27: invokestatic game.C_100020_wm.func_103848_a(byte, byte[])game.C_100182_cc
		// @2A: areturn
		// @2B: astore #5
		// @2D: aload #5
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100074_g.field_104414_z
		// @39: iconst_4
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: iload_0
		// @3F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @42: bipush 44 (0x2C)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: iload_1
		// @48: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4B: bipush 44 (0x2C)
		// @4D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @50: aload_2
		// @51: ifnull @5D
		// @54: getstatic java.lang.String[] game.C_100074_g.field_104414_z
		// @57: iconst_3
		// @58: aaload
		// @59: goto @62
		// @5C: athrow
		// @5D: getstatic java.lang.String[] game.C_100074_g.field_104414_z
		// @60: iconst_2
		// @61: aaload
		// @62: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @65: bipush 44 (0x2C)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: aload_3
		// @6B: ifnull @77
		// @6E: getstatic java.lang.String[] game.C_100074_g.field_104414_z
		// @71: iconst_3
		// @72: aaload
		// @73: goto @7C
		// @76: athrow
		// @77: getstatic java.lang.String[] game.C_100074_g.field_104414_z
		// @7A: iconst_2
		// @7B: aaload
		// @7C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7F: bipush 44 (0x2C)
		// @81: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @84: iload #4
		// @86: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @89: bipush 41 (0x29)
		// @8B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @91: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @94: athrow
	}
	
	public static void func_104407_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic int[] game.C_100074_g.field_104410_e
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100074_g.field_104409_d
		// @08: aconst_null
		// @09: putstatic game.C_100037_wb[] game.C_100074_g.field_104411_b
		// @0C: aconst_null
		// @0D: checkcast game.C_100037_wb[][]
		// @10: putstatic game.C_100037_wb[][] game.C_100074_g.field_104413_a
		// @13: iload_0
		// @14: bipush 9 (0x09)
		// @16: if_icmpge @27
		// @19: aconst_null
		// @1A: checkcast game.C_100037_wb[][]
		// @1D: checkcast game.C_100037_wb[][]
		// @20: putstatic game.C_100037_wb[][] game.C_100074_g.field_104413_a
		// @23: goto @27
		// @26: athrow
		// @27: aconst_null
		// @28: putstatic game.C_100107_u game.C_100074_g.field_104412_c
		// @2B: goto @4F
		// @2E: astore_1
		// @2F: aload_1
		// @30: new java.lang.StringBuilder
		// @33: dup
		// @34: invokespecial java.lang.StringBuilder.<init>()void
		// @37: getstatic java.lang.String[] game.C_100074_g.field_104414_z
		// @3A: iconst_1
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: iload_0
		// @40: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @43: bipush 41 (0x29)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4E: athrow
		// @4F: return
	}
	
	static final synchronized byte[] func_104406_a(int arg0, int arg1)
	{
		// @000: bipush -59 (0xC5)
		// @002: bipush -34 (0xDE)
		// @004: iload_0
		// @005: isub
		// @006: bipush 56 (0x38)
		// @008: idiv
		// @009: idiv
		// @00A: istore_2
		// @00B: bipush -101 (0x9B)
		// @00D: iload_1
		// @00E: iconst_m1
		// @00F: ixor
		// @010: if_icmpne @03C
		// @013: getstatic int game.C_100094_j.field_104546_g
		// @016: iconst_m1
		// @017: ixor
		// @018: iconst_m1
		// @019: if_icmplt @024
		// @01C: goto @020
		// @01F: athrow
		// @020: goto @03C
		// @023: athrow
		// @024: getstatic byte[][] game.C_100058_dg.field_101578_u
		// @027: getstatic int game.C_100094_j.field_104546_g
		// @02A: iconst_1
		// @02B: isub
		// @02C: dup
		// @02D: putstatic int game.C_100094_j.field_104546_g
		// @030: aaload
		// @031: astore_3
		// @032: getstatic byte[][] game.C_100058_dg.field_101578_u
		// @035: getstatic int game.C_100094_j.field_104546_g
		// @038: aconst_null
		// @039: aastore
		// @03A: aload_3
		// @03B: areturn
		// @03C: iload_1
		// @03D: iconst_m1
		// @03E: ixor
		// @03F: sipush -5001 (0xEC77)
		// @042: if_icmpne @06E
		// @045: iconst_m1
		// @046: getstatic int game.C_100290_jm.field_106860_b
		// @049: iconst_m1
		// @04A: ixor
		// @04B: if_icmpgt @056
		// @04E: goto @052
		// @051: athrow
		// @052: goto @06E
		// @055: athrow
		// @056: getstatic byte[][] game.C_100263_mb.field_106507_d
		// @059: getstatic int game.C_100290_jm.field_106860_b
		// @05C: iconst_1
		// @05D: isub
		// @05E: dup
		// @05F: putstatic int game.C_100290_jm.field_106860_b
		// @062: aaload
		// @063: astore_3
		// @064: getstatic byte[][] game.C_100263_mb.field_106507_d
		// @067: getstatic int game.C_100290_jm.field_106860_b
		// @06A: aconst_null
		// @06B: aastore
		// @06C: aload_3
		// @06D: areturn
		// @06E: iload_1
		// @06F: iconst_m1
		// @070: ixor
		// @071: sipush -30001 (0x8ACF)
		// @074: if_icmpne @09D
		// @077: getstatic int game.C_100327_ib.field_102483_C
		// @07A: ifgt @085
		// @07D: goto @081
		// @080: athrow
		// @081: goto @09D
		// @084: athrow
		// @085: getstatic byte[][] game.C_100066_dl.field_101629_D
		// @088: getstatic int game.C_100327_ib.field_102483_C
		// @08B: iconst_1
		// @08C: isub
		// @08D: dup
		// @08E: putstatic int game.C_100327_ib.field_102483_C
		// @091: aaload
		// @092: astore_3
		// @093: getstatic byte[][] game.C_100066_dl.field_101629_D
		// @096: getstatic int game.C_100327_ib.field_102483_C
		// @099: aconst_null
		// @09A: aastore
		// @09B: aload_3
		// @09C: areturn
		// @09D: getstatic byte[][][] game.C_100335_il.field_107365_f
		// @0A0: ifnonnull @0A7
		// @0A3: goto @0FC
		// @0A6: athrow
		// @0A7: iconst_0
		// @0A8: istore_3
		// @0A9: iload_3
		// @0AA: iconst_m1
		// @0AB: ixor
		// @0AC: getstatic int[] game.C_100304_kl.field_107112_d
		// @0AF: arraylength
		// @0B0: iconst_m1
		// @0B1: ixor
		// @0B2: if_icmple @0FC
		// @0B5: getstatic int[] game.C_100304_kl.field_107112_d
		// @0B8: iload_3
		// @0B9: iaload
		// @0BA: iload_1
		// @0BB: if_icmpne @0F6
		// @0BE: goto @0C2
		// @0C1: athrow
		// @0C2: getstatic int[] game.C_100323_hl.field_107248_a
		// @0C5: iload_3
		// @0C6: iaload
		// @0C7: iconst_m1
		// @0C8: ixor
		// @0C9: iconst_m1
		// @0CA: if_icmplt @0D5
		// @0CD: goto @0D1
		// @0D0: athrow
		// @0D1: goto @0F6
		// @0D4: athrow
		// @0D5: getstatic byte[][][] game.C_100335_il.field_107365_f
		// @0D8: iload_3
		// @0D9: aaload
		// @0DA: getstatic int[] game.C_100323_hl.field_107248_a
		// @0DD: iload_3
		// @0DE: dup2
		// @0DF: iaload
		// @0E0: iconst_1
		// @0E1: isub
		// @0E2: dup_x2
		// @0E3: iastore
		// @0E4: aaload
		// @0E5: astore #4
		// @0E7: getstatic byte[][][] game.C_100335_il.field_107365_f
		// @0EA: iload_3
		// @0EB: aaload
		// @0EC: getstatic int[] game.C_100323_hl.field_107248_a
		// @0EF: iload_3
		// @0F0: iaload
		// @0F1: aconst_null
		// @0F2: aastore
		// @0F3: aload #4
		// @0F5: areturn
		// @0F6: iinc #3 +1
		// @0F9: goto @0A9
		// @0FC: iload_1
		// @0FD: newarray byte[]
		// @0FF: areturn
		// @100: astore_2
		// @101: aload_2
		// @102: new java.lang.StringBuilder
		// @105: dup
		// @106: invokespecial java.lang.StringBuilder.<init>()void
		// @109: getstatic java.lang.String[] game.C_100074_g.field_104414_z
		// @10C: iconst_0
		// @10D: aaload
		// @10E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @111: iload_0
		// @112: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @115: bipush 44 (0x2C)
		// @117: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @11A: iload_1
		// @11B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @11E: bipush 41 (0x29)
		// @120: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @123: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @126: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @129: athrow
	}
	
	static
	{
		// @00: iconst_5
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc ">;n."
		// @08: invokestatic game.C_100074_g.func_104408_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100074_g.func_104405_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc ">;m."
		// @13: invokestatic game.C_100074_g.func_104408_z(java.lang.String)char[]
		// @16: invokestatic game.C_100074_g.func_104405_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "7`@j"
		// @1E: invokestatic game.C_100074_g.func_104408_z(java.lang.String)char[]
		// @21: invokestatic game.C_100074_g.func_104405_z(char[])java.lang.String
		// @24: aastore
		// @25: dup
		// @26: iconst_3
		// @27: ldc "\";\u0002(\u000f"
		// @29: invokestatic game.C_100074_g.func_104408_z(java.lang.String)char[]
		// @2C: invokestatic game.C_100074_g.func_104405_z(char[])java.lang.String
		// @2F: aastore
		// @30: dup
		// @31: iconst_4
		// @32: ldc ">;o."
		// @34: invokestatic game.C_100074_g.func_104408_z(java.lang.String)char[]
		// @37: invokestatic game.C_100074_g.func_104405_z(char[])java.lang.String
		// @3A: aastore
		// @3B: putstatic java.lang.String[] game.C_100074_g.field_104414_z
		// @3E: iconst_4
		// @3F: newarray int[]
		// @41: putstatic int[] game.C_100074_g.field_104410_e
		// @44: aconst_null
		// @45: putstatic game.C_100107_u game.C_100074_g.field_104412_c
		// @48: ldc "\u000c{Ji\u0000-`Bg\u0006<yU&\u0005<5Mt\u0017y`Bg\u00105p\u000cr\u001dyv^c\u0013-p\u000cg\u001cytOe\u001d,{X&\u00146g\u000c\u007f\u001d,5MrR-}EuR-|Ac\\"
		// @4A: invokestatic game.C_100074_g.func_104408_z(java.lang.String)char[]
		// @4D: invokestatic game.C_100074_g.func_104405_z(char[])java.lang.String
		// @50: putstatic java.lang.String game.C_100074_g.field_104409_d
		// @53: return
	}
	
	private static char[] func_104408_z(String arg0)
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
		// @0E: bipush 114 (0x72)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104405_z(char[] arg0)
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
		// @30: bipush 89 (0x59)
		// @32: goto @46
		// @35: bipush 21 (0x15)
		// @37: goto @46
		// @3A: bipush 44 (0x2C)
		// @3C: goto @46
		// @3F: bipush 6 (0x06)
		// @41: goto @46
		// @44: bipush 114 (0x72)
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
