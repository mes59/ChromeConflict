package game;

abstract class C_100116_ei
{
	static String field_104118_f;
	static String field_104124_a;
	static int field_104121_e;
	static String field_104122_b;
	static int[] field_104120_d;
	static String field_104123_c;
	static int[] field_104119_g;
	private static final String[] field_104125_z;
	
	public static void func_104110_b(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100116_ei.field_104123_c
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100116_ei.field_104124_a
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100116_ei.field_104118_f
		// @0C: aconst_null
		// @0D: putstatic int[] game.C_100116_ei.field_104120_d
		// @10: aconst_null
		// @11: putstatic int[] game.C_100116_ei.field_104119_g
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100116_ei.field_104122_b
		// @18: iload_0
		// @19: sipush 18840 (0x4998)
		// @1C: if_icmpeq @26
		// @1F: aconst_null
		// @20: checkcast java.lang.String
		// @23: putstatic java.lang.String game.C_100116_ei.field_104122_b
		// @26: goto @4A
		// @29: astore_1
		// @2A: aload_1
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100116_ei.field_104125_z
		// @35: iconst_4
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
	
	static int func_104117_a(int arg0, int arg1)
	{
		// @00: iload_0
		// @01: iload_1
		// @02: ior
		// @03: ireturn
		// @04: astore_2
		// @05: aload_2
		// @06: new java.lang.StringBuilder
		// @09: dup
		// @0A: invokespecial java.lang.StringBuilder.<init>()void
		// @0D: getstatic java.lang.String[] game.C_100116_ei.field_104125_z
		// @10: iconst_3
		// @11: aaload
		// @12: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @15: iload_0
		// @16: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @19: bipush 44 (0x2C)
		// @1B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1E: iload_1
		// @1F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @22: bipush 41 (0x29)
		// @24: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @27: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2D: athrow
	}
	
	abstract byte[] func_104115_a(int arg0);
	
	abstract void func_104114_a(byte[] arg0, byte arg1);
	
	static final int func_104111_a(int arg0, int[] arg1, C_100327_ib arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: iconst_0
		// @006: istore_3
		// @007: iload_0
		// @008: sipush 15999 (0x3E7F)
		// @00B: if_icmpeq @01B
		// @00E: aconst_null
		// @00F: checkcast game.C_100033_gj
		// @012: bipush 80 (0x50)
		// @014: invokestatic game.C_100116_ei.func_104116_a(game.C_100033_gj, int)void
		// @017: goto @01B
		// @01A: athrow
		// @01B: aload_2
		// @01C: sipush -3099 (0xF3E5)
		// @01F: invokevirtual game.C_100327_ib.func_102460_q(int)int
		// @022: istore #4
		// @024: iconst_0
		// @025: istore #5
		// @027: iconst_0
		// @028: istore #6
		// @02A: iload #6
		// @02C: iload #4
		// @02E: if_icmpge @0AA
		// @031: bipush 10 (0x0A)
		// @033: iload #7
		// @035: ifne @0AC
		// @038: aload_1
		// @039: iload #6
		// @03B: iaload
		// @03C: if_icmpeq @047
		// @03F: goto @043
		// @042: athrow
		// @043: goto @04A
		// @046: athrow
		// @047: iinc #3 +100
		// @04A: aload_1
		// @04B: iload #6
		// @04D: iaload
		// @04E: bipush 11 (0x0B)
		// @050: if_icmpeq @057
		// @053: goto @05D
		// @056: athrow
		// @057: wide (iinc) #3 +200
		// @05D: bipush 12 (0x0C)
		// @05F: aload_1
		// @060: iload #6
		// @062: iaload
		// @063: if_icmpeq @06A
		// @066: goto @070
		// @069: athrow
		// @06A: wide (iinc) #3 +500
		// @070: aload_1
		// @071: iload #6
		// @073: iaload
		// @074: bipush 13 (0x0D)
		// @076: if_icmpne @083
		// @079: wide (iinc) #3 +1000
		// @07F: goto @083
		// @082: athrow
		// @083: aload_1
		// @084: iload #6
		// @086: iaload
		// @087: bipush 14 (0x0E)
		// @089: if_icmpne @096
		// @08C: wide (iinc) #3 +2000
		// @092: goto @096
		// @095: athrow
		// @096: aload_1
		// @097: iload #6
		// @099: iaload
		// @09A: bipush 34 (0x22)
		// @09C: if_icmpne @0A2
		// @09F: iconst_1
		// @0A0: istore #5
		// @0A2: iinc #6 +1
		// @0A5: iload #7
		// @0A7: ifeq @02A
		// @0AA: iload #5
		// @0AC: ifeq @0B5
		// @0AF: wide (iinc) #3 +3800
		// @0B5: iload_3
		// @0B6: ireturn
		// @0B7: astore_3
		// @0B8: aload_3
		// @0B9: new java.lang.StringBuilder
		// @0BC: dup
		// @0BD: invokespecial java.lang.StringBuilder.<init>()void
		// @0C0: getstatic java.lang.String[] game.C_100116_ei.field_104125_z
		// @0C3: iconst_5
		// @0C4: aaload
		// @0C5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0C8: iload_0
		// @0C9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0CC: bipush 44 (0x2C)
		// @0CE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D1: aload_1
		// @0D2: ifnull @0DE
		// @0D5: getstatic java.lang.String[] game.C_100116_ei.field_104125_z
		// @0D8: iconst_0
		// @0D9: aaload
		// @0DA: goto @0E3
		// @0DD: athrow
		// @0DE: getstatic java.lang.String[] game.C_100116_ei.field_104125_z
		// @0E1: iconst_1
		// @0E2: aaload
		// @0E3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0E6: bipush 44 (0x2C)
		// @0E8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0EB: aload_2
		// @0EC: ifnull @0F8
		// @0EF: getstatic java.lang.String[] game.C_100116_ei.field_104125_z
		// @0F2: iconst_0
		// @0F3: aaload
		// @0F4: goto @0FD
		// @0F7: athrow
		// @0F8: getstatic java.lang.String[] game.C_100116_ei.field_104125_z
		// @0FB: iconst_1
		// @0FC: aaload
		// @0FD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @100: bipush 41 (0x29)
		// @102: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @105: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @108: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @10B: athrow
	}
	
	static final void func_104116_a(C_100033_gj arg0, int arg1)
	{
		// @00: iload_1
		// @01: bipush -76 (0xB4)
		// @03: if_icmplt @0F
		// @06: bipush 45 (0x2D)
		// @08: invokestatic game.C_100116_ei.func_104110_b(int)void
		// @0B: goto @0F
		// @0E: athrow
		// @0F: getstatic game.C_100302_ka game.C_100245_pf.field_106388_b
		// @12: bipush -100 (0x9C)
		// @14: aload_0
		// @15: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @18: goto @56
		// @1B: astore_2
		// @1C: aload_2
		// @1D: new java.lang.StringBuilder
		// @20: dup
		// @21: invokespecial java.lang.StringBuilder.<init>()void
		// @24: getstatic java.lang.String[] game.C_100116_ei.field_104125_z
		// @27: iconst_2
		// @28: aaload
		// @29: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C: aload_0
		// @2D: ifnull @39
		// @30: getstatic java.lang.String[] game.C_100116_ei.field_104125_z
		// @33: iconst_0
		// @34: aaload
		// @35: goto @3E
		// @38: athrow
		// @39: getstatic java.lang.String[] game.C_100116_ei.field_104125_z
		// @3C: iconst_1
		// @3D: aaload
		// @3E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @41: bipush 44 (0x2C)
		// @43: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @46: iload_1
		// @47: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4A: bipush 41 (0x29)
		// @4C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @52: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @55: athrow
		// @56: return
	}
	
	static
	{
		// @00: bipush 6 (0x06)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "9sX\u001fF"
		// @09: invokestatic game.C_100116_ei.func_104113_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100116_ei.func_104112_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc ",(\u001a]"
		// @14: invokestatic game.C_100116_ei.func_104113_z(java.lang.String)char[]
		// @17: invokestatic game.C_100116_ei.func_104112_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "'4Xw\u0013"
		// @1F: invokestatic game.C_100116_ei.func_104113_z(java.lang.String)char[]
		// @22: invokestatic game.C_100116_ei.func_104112_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "'4Xu\u0013"
		// @2A: invokestatic game.C_100116_ei.func_104113_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100116_ei.func_104112_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "'4Xr\u0013"
		// @35: invokestatic game.C_100116_ei.func_104113_z(java.lang.String)char[]
		// @38: invokestatic game.C_100116_ei.func_104112_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "'4Xs\u0013"
		// @40: invokestatic game.C_100116_ei.func_104113_z(java.lang.String)char[]
		// @43: invokestatic game.C_100116_ei.func_104112_z(char[])java.lang.String
		// @46: aastore
		// @47: putstatic java.lang.String[] game.C_100116_ei.field_104125_z
		// @4A: ldc "\n4\u0018E\u0001b)\u0019\u0011H6<\u0004E\u001b3(\u001fRP.$Z\u0011X*2\u0019B^bz2^Ue)V\\R,9Q\u0011]-/VPHb0\u0017_Bb2\u0006ER-3\u0005\u0011Z1}\u000f^Nb>\u0017_\u001a"
		// @4C: invokestatic game.C_100116_ei.func_104113_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100116_ei.func_104112_z(char[])java.lang.String
		// @52: putstatic java.lang.String game.C_100116_ei.field_104118_f
		// @55: ldc "\u00121\u0013PH'}\u0004TV-+\u0013\u0011\u0007gmH\u0011]02\u001b\u0011B-(\u0004\u0011R%3\u0019C^b1\u001fBOb;\u001fCH6s"
		// @57: invokestatic game.C_100116_ei.func_104113_z(java.lang.String)char[]
		// @5A: invokestatic game.C_100116_ei.func_104112_z(char[])java.lang.String
		// @5D: putstatic java.lang.String game.C_100116_ei.field_104124_a
		// @60: sipush 1024 (0x0400)
		// @63: putstatic int game.C_100116_ei.field_104121_e
		// @66: ldc "\u0001<\u001bTI#}\u0010^W.2\u0001B\u001b18\u0018ER,8\u001a\u000b\u001b\r;\u0010"
		// @68: invokestatic game.C_100116_ei.func_104113_z(java.lang.String)char[]
		// @6B: invokestatic game.C_100116_ei.func_104112_z(char[])java.lang.String
		// @6E: putstatic java.lang.String game.C_100116_ei.field_104122_b
		// @71: sipush 8192 (0x2000)
		// @74: newarray int[]
		// @76: putstatic int[] game.C_100116_ei.field_104120_d
		// @79: iconst_2
		// @7A: newarray int[]
		// @7C: dup
		// @7D: iconst_0
		// @7E: bipush 50 (0x32)
		// @80: iastore
		// @81: dup
		// @82: iconst_1
		// @83: bipush 50 (0x32)
		// @85: iastore
		// @86: putstatic int[] game.C_100116_ei.field_104119_g
		// @89: ldc "~xF\u000f\u001b+.V_T6}\u0017\u0011V'0\u0014TIn}\u0017__b>\u0017_U-)VAW#$VFR65VES'}\u0015DI08\u0018E\u001b--\u0002XT,.X"
		// @8B: invokestatic game.C_100116_ei.func_104113_z(java.lang.String)char[]
		// @8E: invokestatic game.C_100116_ei.func_104112_z(char[])java.lang.String
		// @91: putstatic java.lang.String game.C_100116_ei.field_104123_c
		// @94: return
	}
	
	private static char[] func_104113_z(String arg0)
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
		// @0E: bipush 59 (0x3B)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104112_z(char[] arg0)
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
		// @30: bipush 66 (0x42)
		// @32: goto @46
		// @35: bipush 93 (0x5D)
		// @37: goto @46
		// @3A: bipush 118 (0x76)
		// @3C: goto @46
		// @3F: bipush 49 (0x31)
		// @41: goto @46
		// @44: bipush 59 (0x3B)
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
