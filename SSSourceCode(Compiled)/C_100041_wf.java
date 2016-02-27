package game;

final class C_100041_wf
{
	static C_100037_wb[] field_104108_a;
	static String[] field_104102_f;
	static String field_104106_b;
	static String field_104103_g;
	static int field_104104_d;
	static int field_104107_c;
	static String field_104105_e;
	private static final String[] field_104109_z;
	
	static final void func_104097_a(int arg0, int arg1, int arg2, int arg3, int arg4, C_100037_wb arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #11
		// @005: iload #4
		// @007: sipush 255 (0x00FF)
		// @00A: iand
		// @00B: istore #4
		// @00D: iload_1
		// @00E: sipush 255 (0x00FF)
		// @011: iand
		// @012: istore_1
		// @013: aload #5
		// @015: getfield int game.C_100037_wb.field_102341_y
		// @018: istore #6
		// @01A: iload_0
		// @01B: iload #6
		// @01D: imul
		// @01E: istore #7
		// @020: iload_0
		// @021: istore #10
		// @023: iload_3
		// @024: ifeq @030
		// @027: bipush 80 (0x50)
		// @029: invokestatic game.C_100041_wf.func_104098_a(int)void
		// @02C: goto @030
		// @02F: athrow
		// @030: iload_2
		// @031: iconst_m1
		// @032: ixor
		// @033: iload #10
		// @035: iconst_m1
		// @036: ixor
		// @037: if_icmpge @0A6
		// @03A: iload_1
		// @03B: iload_0
		// @03C: ineg
		// @03D: iload #10
		// @03F: iadd
		// @040: imul
		// @041: iload #4
		// @043: iload_2
		// @044: iload #10
		// @046: ineg
		// @047: iadd
		// @048: imul
		// @049: iadd
		// @04A: iload_2
		// @04B: iload_0
		// @04C: isub
		// @04D: idiv
		// @04E: istore #8
		// @050: iload #8
		// @052: ldc 65793 (0x10101)
		// @054: imul
		// @055: istore #8
		// @057: iload #11
		// @059: ifne @10C
		// @05C: iconst_0
		// @05D: istore #9
		// @05F: iload #6
		// @061: iload #9
		// @063: if_icmple @097
		// @066: aload #5
		// @068: getfield int[] game.C_100037_wb.field_102388_J
		// @06B: iload #9
		// @06D: iload #7
		// @06F: iadd
		// @070: iaload
		// @071: iload #11
		// @073: ifne @09C
		// @076: ifeq @08F
		// @079: goto @07D
		// @07C: athrow
		// @07D: aload #5
		// @07F: getfield int[] game.C_100037_wb.field_102388_J
		// @082: iload #7
		// @084: iload #9
		// @086: ineg
		// @087: isub
		// @088: iload #8
		// @08A: iastore
		// @08B: goto @08F
		// @08E: athrow
		// @08F: iinc #9 +1
		// @092: iload #11
		// @094: ifeq @05F
		// @097: iload #7
		// @099: iload #6
		// @09B: iadd
		// @09C: istore #7
		// @09E: iinc #10 +1
		// @0A1: iload #11
		// @0A3: ifeq @030
		// @0A6: goto @10C
		// @0A9: astore #6
		// @0AB: aload #6
		// @0AD: new java.lang.StringBuilder
		// @0B0: dup
		// @0B1: invokespecial java.lang.StringBuilder.<init>()void
		// @0B4: getstatic java.lang.String[] game.C_100041_wf.field_104109_z
		// @0B7: iconst_2
		// @0B8: aaload
		// @0B9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0BC: iload_0
		// @0BD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0C0: bipush 44 (0x2C)
		// @0C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0C5: iload_1
		// @0C6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0C9: bipush 44 (0x2C)
		// @0CB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0CE: iload_2
		// @0CF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D2: bipush 44 (0x2C)
		// @0D4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D7: iload_3
		// @0D8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0DB: bipush 44 (0x2C)
		// @0DD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E0: iload #4
		// @0E2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E5: bipush 44 (0x2C)
		// @0E7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0EA: aload #5
		// @0EC: ifnull @0F8
		// @0EF: getstatic java.lang.String[] game.C_100041_wf.field_104109_z
		// @0F2: iconst_0
		// @0F3: aaload
		// @0F4: goto @0FD
		// @0F7: athrow
		// @0F8: getstatic java.lang.String[] game.C_100041_wf.field_104109_z
		// @0FB: iconst_1
		// @0FC: aaload
		// @0FD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @100: bipush 41 (0x29)
		// @102: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @105: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @108: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @10B: athrow
		// @10C: return
	}
	
	static final int func_104101_a(boolean arg0)
	{
		// @00: iload_0
		// @01: iconst_1
		// @02: if_icmpeq @08
		// @05: bipush 108 (0x6C)
		// @07: ireturn
		// @08: getstatic int game.C_100138_bo.field_100401_f
		// @0B: ineg
		// @0C: getstatic int game.C_100057_dd.field_104258_c
		// @0F: iadd
		// @10: ireturn
		// @11: astore_1
		// @12: aload_1
		// @13: new java.lang.StringBuilder
		// @16: dup
		// @17: invokespecial java.lang.StringBuilder.<init>()void
		// @1A: getstatic java.lang.String[] game.C_100041_wf.field_104109_z
		// @1D: iconst_3
		// @1E: aaload
		// @1F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @22: iload_0
		// @23: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @26: bipush 41 (0x29)
		// @28: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @31: athrow
	}
	
	public static void func_104098_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String[] game.C_100041_wf.field_104102_f
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100041_wf.field_104103_g
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100041_wf.field_104106_b
		// @0C: aconst_null
		// @0D: putstatic game.C_100037_wb[] game.C_100041_wf.field_104108_a
		// @10: iload_0
		// @11: bipush -63 (0xC1)
		// @13: if_icmplt @17
		// @16: return
		// @17: aconst_null
		// @18: putstatic java.lang.String game.C_100041_wf.field_104105_e
		// @1B: goto @3F
		// @1E: astore_1
		// @1F: aload_1
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100041_wf.field_104109_z
		// @2A: iconst_4
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_0
		// @30: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @33: bipush 41 (0x29)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3E: athrow
		// @3F: return
	}
	
	static
	{
		// @00: iconst_5
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "W1r E"
		// @08: invokestatic game.C_100041_wf.func_104100_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100041_wf.func_104099_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "Bj0b"
		// @13: invokestatic game.C_100041_wf.func_104100_z(java.lang.String)char[]
		// @16: invokestatic game.C_100041_wf.func_104099_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "[yrL\u0010"
		// @1E: invokestatic game.C_100041_wf.func_104100_z(java.lang.String)char[]
		// @21: invokestatic game.C_100041_wf.func_104099_z(char[])java.lang.String
		// @24: aastore
		// @25: dup
		// @26: iconst_3
		// @27: ldc "[yrM\u0010"
		// @29: invokestatic game.C_100041_wf.func_104100_z(java.lang.String)char[]
		// @2C: invokestatic game.C_100041_wf.func_104099_z(char[])java.lang.String
		// @2F: aastore
		// @30: dup
		// @31: iconst_4
		// @32: ldc "[yrO\u0010"
		// @34: invokestatic game.C_100041_wf.func_104100_z(java.lang.String)char[]
		// @37: invokestatic game.C_100041_wf.func_104099_z(char[])java.lang.String
		// @3A: aastore
		// @3B: putstatic java.lang.String[] game.C_100041_wf.field_104109_z
		// @3E: ldc "xw5}\u0018K~1k\u0018Co(gWB?5}\u0018Cq0w\u0018Mi=gTM}0k\u0018Xp|c]A}9|K\u0002"
		// @40: invokestatic game.C_100041_wf.func_104100_z(java.lang.String)char[]
		// @43: invokestatic game.C_100041_wf.func_104099_z(char[])java.lang.String
		// @46: putstatic java.lang.String game.C_100041_wf.field_104106_b
		// @49: bipush 50 (0x32)
		// @4B: putstatic int game.C_100041_wf.field_104104_d
		// @4E: ldc "Xp||]Xj.`\u0018Xp|zPI?2aJA~0.NEz+ "
		// @50: invokestatic game.C_100041_wf.func_104100_z(java.lang.String)char[]
		// @53: invokestatic game.C_100041_wf.func_104099_z(char[])java.lang.String
		// @56: putstatic java.lang.String game.C_100041_wf.field_104103_g
		// @59: ldc "o~1kJM?)~\u0017Hp+`\u0002\u000cV2x]^k9j"
		// @5B: invokestatic game.C_100041_wf.func_104100_z(java.lang.String)char[]
		// @5E: invokestatic game.C_100041_wf.func_104099_z(char[])java.lang.String
		// @61: putstatic java.lang.String game.C_100041_wf.field_104105_e
		// @64: iconst_m1
		// @65: putstatic int game.C_100041_wf.field_104107_c
		// @68: return
	}
	
	private static char[] func_104100_z(String arg0)
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
		// @0E: bipush 56 (0x38)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104099_z(char[] arg0)
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
		// @30: bipush 44 (0x2C)
		// @32: goto @46
		// @35: bipush 31 (0x1F)
		// @37: goto @46
		// @3A: bipush 92 (0x5C)
		// @3C: goto @46
		// @3F: bipush 14 (0x0E)
		// @41: goto @46
		// @44: bipush 56 (0x38)
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
