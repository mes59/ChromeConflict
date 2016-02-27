package game;

final class C_100025_he
{
	static C_100037_wb[] field_103935_c;
	static int field_103934_b;
	static String field_103936_a;
	private static final String[] field_103937_z;
	
	static final C_100302_ka func_103933_a(int arg0)
	{
		// @00: iload_0
		// @01: ifeq @09
		// @04: aconst_null
		// @05: checkcast game.C_100302_ka
		// @08: areturn
		// @09: bipush -65 (0xBF)
		// @0B: invokestatic game.C_100187_rk.func_100822_c(byte)game.C_100302_ka
		// @0E: areturn
		// @0F: astore_1
		// @10: aload_1
		// @11: new java.lang.StringBuilder
		// @14: dup
		// @15: invokespecial java.lang.StringBuilder.<init>()void
		// @18: getstatic java.lang.String[] game.C_100025_he.field_103937_z
		// @1B: iconst_1
		// @1C: aaload
		// @1D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @20: iload_0
		// @21: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @24: bipush 41 (0x29)
		// @26: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @29: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2F: athrow
	}
	
	static final void func_103930_a(C_100112_r arg0, String arg1, int arg2, C_100306_kn arg3, byte arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #9
		// @005: iconst_0
		// @006: istore #5
		// @008: iconst_m1
		// @009: istore #6
		// @00B: iload #4
		// @00D: bipush -9 (0xF7)
		// @00F: if_icmplt @01B
		// @012: bipush 16 (0x10)
		// @014: invokestatic game.C_100025_he.func_103929_b(int)void
		// @017: goto @01B
		// @01A: athrow
		// @01B: iconst_1
		// @01C: istore #7
		// @01E: iload #7
		// @020: iconst_m1
		// @021: ixor
		// @022: aload_1
		// @023: invokevirtual java.lang.String.length()int
		// @026: iconst_m1
		// @027: ixor
		// @028: if_icmple @0C8
		// @02B: aload_1
		// @02C: iload #7
		// @02E: invokevirtual java.lang.String.charAt(int)char
		// @031: istore #8
		// @033: iload #9
		// @035: ifne @146
		// @038: bipush -61 (0xC3)
		// @03A: iload #8
		// @03C: iconst_m1
		// @03D: ixor
		// @03E: if_icmpeq @049
		// @041: goto @045
		// @044: athrow
		// @045: goto @064
		// @048: athrow
		// @049: iload #5
		// @04B: ldc 748876552 (0x2ca2f308)
		// @04D: ishr
		// @04E: aload_3
		// @04F: getfield int[] game.C_100306_kn.field_107130_g
		// @052: iconst_0
		// @053: iaload
		// @054: ineg
		// @055: aload_0
		// @056: aload_1
		// @057: iconst_0
		// @058: iload #7
		// @05A: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @05D: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @060: isub
		// @061: isub
		// @062: istore #6
		// @064: iconst_m1
		// @065: iload #6
		// @067: if_icmpne @0A9
		// @06A: bipush 32 (0x20)
		// @06C: iload #8
		// @06E: if_icmpne @07B
		// @071: goto @075
		// @074: athrow
		// @075: iload #5
		// @077: iload_2
		// @078: iadd
		// @079: istore #5
		// @07B: aload_3
		// @07C: getfield int[] game.C_100306_kn.field_107130_g
		// @07F: iload #7
		// @081: aload_3
		// @082: getfield int[] game.C_100306_kn.field_107130_g
		// @085: iconst_0
		// @086: iaload
		// @087: iload #5
		// @089: ldc 549826888 (0x20c5b148)
		// @08B: ishr
		// @08C: iadd
		// @08D: aload_0
		// @08E: aload_1
		// @08F: iconst_0
		// @090: iload #7
		// @092: iconst_1
		// @093: iadd
		// @094: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @097: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @09A: ineg
		// @09B: isub
		// @09C: aload_0
		// @09D: iload #8
		// @09F: invokevirtual game.C_100112_r.func_101731_a(char)int
		// @0A2: isub
		// @0A3: iastore
		// @0A4: iload #9
		// @0A6: ifeq @0B6
		// @0A9: aload_3
		// @0AA: getfield int[] game.C_100306_kn.field_107130_g
		// @0AD: iload #7
		// @0AF: iload #6
		// @0B1: iastore
		// @0B2: goto @0B6
		// @0B5: athrow
		// @0B6: bipush 62 (0x3E)
		// @0B8: iload #8
		// @0BA: if_icmpne @0C0
		// @0BD: iconst_m1
		// @0BE: istore #6
		// @0C0: iinc #7 +1
		// @0C3: iload #9
		// @0C5: ifeq @01E
		// @0C8: goto @146
		// @0CB: astore #5
		// @0CD: aload #5
		// @0CF: new java.lang.StringBuilder
		// @0D2: dup
		// @0D3: invokespecial java.lang.StringBuilder.<init>()void
		// @0D6: getstatic java.lang.String[] game.C_100025_he.field_103937_z
		// @0D9: iconst_4
		// @0DA: aaload
		// @0DB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0DE: aload_0
		// @0DF: ifnull @0EB
		// @0E2: getstatic java.lang.String[] game.C_100025_he.field_103937_z
		// @0E5: iconst_2
		// @0E6: aaload
		// @0E7: goto @0F0
		// @0EA: athrow
		// @0EB: getstatic java.lang.String[] game.C_100025_he.field_103937_z
		// @0EE: iconst_3
		// @0EF: aaload
		// @0F0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F3: bipush 44 (0x2C)
		// @0F5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F8: aload_1
		// @0F9: ifnull @105
		// @0FC: getstatic java.lang.String[] game.C_100025_he.field_103937_z
		// @0FF: iconst_2
		// @100: aaload
		// @101: goto @10A
		// @104: athrow
		// @105: getstatic java.lang.String[] game.C_100025_he.field_103937_z
		// @108: iconst_3
		// @109: aaload
		// @10A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @10D: bipush 44 (0x2C)
		// @10F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @112: iload_2
		// @113: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @116: bipush 44 (0x2C)
		// @118: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @11B: aload_3
		// @11C: ifnull @128
		// @11F: getstatic java.lang.String[] game.C_100025_he.field_103937_z
		// @122: iconst_2
		// @123: aaload
		// @124: goto @12D
		// @127: athrow
		// @128: getstatic java.lang.String[] game.C_100025_he.field_103937_z
		// @12B: iconst_3
		// @12C: aaload
		// @12D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @130: bipush 44 (0x2C)
		// @132: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @135: iload #4
		// @137: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @13A: bipush 41 (0x29)
		// @13C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @142: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @145: athrow
		// @146: return
	}
	
	public static void func_103929_b(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100025_he.field_103936_a
		// @04: aconst_null
		// @05: putstatic game.C_100037_wb[] game.C_100025_he.field_103935_c
		// @08: iload_0
		// @09: sipush 25875 (0x6513)
		// @0C: if_icmpeq @22
		// @0F: aconst_null
		// @10: checkcast game.C_100112_r
		// @13: aconst_null
		// @14: checkcast java.lang.String
		// @17: bipush 106 (0x6A)
		// @19: aconst_null
		// @1A: checkcast game.C_100306_kn
		// @1D: bipush 86 (0x56)
		// @1F: invokestatic game.C_100025_he.func_103930_a(game.C_100112_r, java.lang.String, int, game.C_100306_kn, byte)void
		// @22: goto @46
		// @25: astore_1
		// @26: aload_1
		// @27: new java.lang.StringBuilder
		// @2A: dup
		// @2B: invokespecial java.lang.StringBuilder.<init>()void
		// @2E: getstatic java.lang.String[] game.C_100025_he.field_103937_z
		// @31: iconst_0
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: iload_0
		// @37: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3A: bipush 41 (0x29)
		// @3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @42: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @45: athrow
		// @46: return
	}
	
	static
	{
		// @00: iconst_5
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "L\u001e`G\u007f"
		// @08: invokestatic game.C_100025_he.func_103932_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100025_he.func_103931_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "L\u001e`F\u007f"
		// @13: invokestatic game.C_100025_he.func_103932_z(java.lang.String)char[]
		// @16: invokestatic game.C_100025_he.func_103931_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "_U`+*"
		// @1E: invokestatic game.C_100025_he.func_103932_z(java.lang.String)char[]
		// @21: invokestatic game.C_100025_he.func_103931_z(char[])java.lang.String
		// @24: aastore
		// @25: dup
		// @26: iconst_3
		// @27: ldc "J\u000e\"i"
		// @29: invokestatic game.C_100025_he.func_103932_z(java.lang.String)char[]
		// @2C: invokestatic game.C_100025_he.func_103931_z(char[])java.lang.String
		// @2F: aastore
		// @30: dup
		// @31: iconst_4
		// @32: ldc "L\u001e`D\u007f"
		// @34: invokestatic game.C_100025_he.func_103932_z(java.lang.String)char[]
		// @37: invokestatic game.C_100025_he.func_103931_z(char[])java.lang.String
		// @3A: aastore
		// @3B: putstatic java.lang.String[] game.C_100025_he.field_103937_z
		// @3E: ldc "w\u001e:%\"T[ ` \u0004\u001c/h2"
		// @40: invokestatic game.C_100025_he.func_103932_z(java.lang.String)char[]
		// @43: invokestatic game.C_100025_he.func_103931_z(char[])java.lang.String
		// @46: putstatic java.lang.String game.C_100025_he.field_103936_a
		// @49: return
	}
	
	private static char[] func_103932_z(String arg0)
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
	
	private static String func_103931_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @3A, for 3: @3F
		// @30: bipush 36 (0x24)
		// @32: goto @45
		// @35: bipush 123 (0x7B)
		// @37: goto @45
		// @3A: bipush 78 (0x4E)
		// @3C: goto @45
		// @3F: iconst_5
		// @40: goto @45
		// @43: bipush 87 (0x57)
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
