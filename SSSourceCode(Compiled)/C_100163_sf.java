package game;

final class C_100163_sf
{
	static C_100302_ka field_105437_e;
	static C_100037_wb[] field_105435_g;
	static String field_105442_h;
	static int field_105434_f;
	static String field_105440_a;
	static C_100178_cg field_105439_c;
	static int field_105436_d;
	static String field_105438_b;
	private static final String[] field_105441_z;
	
	public static void func_105430_a(int arg0)
	{
		// @00: iload_0
		// @01: sipush 9755 (0x261B)
		// @04: if_icmpeq @08
		// @07: return
		// @08: aconst_null
		// @09: putstatic game.C_100037_wb[] game.C_100163_sf.field_105435_g
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100163_sf.field_105438_b
		// @10: aconst_null
		// @11: putstatic game.C_100178_cg game.C_100163_sf.field_105439_c
		// @14: aconst_null
		// @15: putstatic game.C_100302_ka game.C_100163_sf.field_105437_e
		// @18: aconst_null
		// @19: putstatic java.lang.String game.C_100163_sf.field_105442_h
		// @1C: aconst_null
		// @1D: putstatic java.lang.String game.C_100163_sf.field_105440_a
		// @20: goto @44
		// @23: astore_1
		// @24: aload_1
		// @25: new java.lang.StringBuilder
		// @28: dup
		// @29: invokespecial java.lang.StringBuilder.<init>()void
		// @2C: getstatic java.lang.String[] game.C_100163_sf.field_105441_z
		// @2F: iconst_3
		// @30: aaload
		// @31: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @34: iload_0
		// @35: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @38: bipush 41 (0x29)
		// @3A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @40: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @43: athrow
		// @44: return
	}
	
	static final C_100037_wb[] func_105433_a(C_100098_h arg0, String arg1, String arg2, byte arg3)
	{
		// @00: aload_0
		// @01: sipush -10719 (0xD621)
		// @04: aload_2
		// @05: invokevirtual game.C_100098_h.func_104601_b(int, java.lang.String)int
		// @08: istore #4
		// @0A: iload_3
		// @0B: bipush -86 (0xAA)
		// @0D: if_icmplt @1B
		// @10: aconst_null
		// @11: checkcast java.lang.String
		// @14: putstatic java.lang.String game.C_100163_sf.field_105440_a
		// @17: goto @1B
		// @1A: athrow
		// @1B: aload_0
		// @1C: aload_1
		// @1D: iload #4
		// @1F: iconst_0
		// @20: invokevirtual game.C_100098_h.func_104600_a(java.lang.String, int, int)int
		// @23: istore #5
		// @25: aload_0
		// @26: iload #4
		// @28: iload #5
		// @2A: bipush -85 (0xAB)
		// @2C: invokestatic game.C_100330_ig.func_107274_a(game.C_100098_h, int, int, int)game.C_100037_wb[]
		// @2F: areturn
		// @30: astore #4
		// @32: aload #4
		// @34: new java.lang.StringBuilder
		// @37: dup
		// @38: invokespecial java.lang.StringBuilder.<init>()void
		// @3B: getstatic java.lang.String[] game.C_100163_sf.field_105441_z
		// @3E: iconst_1
		// @3F: aaload
		// @40: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @43: aload_0
		// @44: ifnull @50
		// @47: getstatic java.lang.String[] game.C_100163_sf.field_105441_z
		// @4A: iconst_2
		// @4B: aaload
		// @4C: goto @55
		// @4F: athrow
		// @50: getstatic java.lang.String[] game.C_100163_sf.field_105441_z
		// @53: iconst_0
		// @54: aaload
		// @55: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @58: bipush 44 (0x2C)
		// @5A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5D: aload_1
		// @5E: ifnull @6A
		// @61: getstatic java.lang.String[] game.C_100163_sf.field_105441_z
		// @64: iconst_2
		// @65: aaload
		// @66: goto @6F
		// @69: athrow
		// @6A: getstatic java.lang.String[] game.C_100163_sf.field_105441_z
		// @6D: iconst_0
		// @6E: aaload
		// @6F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @72: bipush 44 (0x2C)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: aload_2
		// @78: ifnull @84
		// @7B: getstatic java.lang.String[] game.C_100163_sf.field_105441_z
		// @7E: iconst_2
		// @7F: aaload
		// @80: goto @89
		// @83: athrow
		// @84: getstatic java.lang.String[] game.C_100163_sf.field_105441_z
		// @87: iconst_0
		// @88: aaload
		// @89: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8C: bipush 44 (0x2C)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: iload_3
		// @92: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @95: bipush 41 (0x29)
		// @97: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A0: athrow
	}
	
	static
	{
		// @00: iconst_4
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "\u00191V("
		// @08: invokestatic game.C_100163_sf.func_105432_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100163_sf.func_105431_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "\u0004\"\u0014\u0006u"
		// @13: invokestatic game.C_100163_sf.func_105432_z(java.lang.String)char[]
		// @16: invokestatic game.C_100163_sf.func_105431_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "\u000cj\u0014j "
		// @1E: invokestatic game.C_100163_sf.func_105432_z(java.lang.String)char[]
		// @21: invokestatic game.C_100163_sf.func_105431_z(char[])java.lang.String
		// @24: aastore
		// @25: dup
		// @26: iconst_3
		// @27: ldc "\u0004\"\u0014\u0005u"
		// @29: invokestatic game.C_100163_sf.func_105432_z(java.lang.String)char[]
		// @2C: invokestatic game.C_100163_sf.func_105431_z(char[])java.lang.String
		// @2F: aastore
		// @30: putstatic java.lang.String[] game.C_100163_sf.field_105441_z
		// @33: ldc ".+Od5\u00162_d>\u0018)J(8\u0003!^d)\u001f!\u001a0/\u0016-T-3\u0010dW-.\u0004-U*.Ydv+:W-Td2\u0005dY68\u00160_d<W\"H!8W%Y'2\u0002*Nd)\u0018dJ(<\u000edW11\u0003-J(<\u000e!Hd:\u0016)_7}\u00186\u001a02W&_#4\u0019dN,8W7S*:\u001b!\u001a41\u0016=_6}\u0014%W4<\u001e#Tj"
		// @35: invokestatic game.C_100163_sf.func_105432_z(java.lang.String)char[]
		// @38: invokestatic game.C_100163_sf.func_105431_z(char[])java.lang.String
		// @3B: putstatic java.lang.String game.C_100163_sf.field_105442_h
		// @3E: ldc "[d[*9W3[7}\u0011-T-.\u001f!^d2\u0011\"\u001a&$W%\u001a /\u0018*_"
		// @40: invokestatic game.C_100163_sf.func_105432_z(java.lang.String)char[]
		// @43: invokestatic game.C_100163_sf.func_105431_z(char[])java.lang.String
		// @46: putstatic java.lang.String game.C_100163_sf.field_105440_a
		// @49: ldc "'6S2<\u0003!"
		// @4B: invokestatic game.C_100163_sf.func_105432_z(java.lang.String)char[]
		// @4E: invokestatic game.C_100163_sf.func_105431_z(char[])java.lang.String
		// @51: putstatic java.lang.String game.C_100163_sf.field_105438_b
		// @54: return
	}
	
	private static char[] func_105432_z(String arg0)
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
		// @0E: bipush 93 (0x5D)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105431_z(char[] arg0)
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
		// @30: bipush 119 (0x77)
		// @32: goto @46
		// @35: bipush 68 (0x44)
		// @37: goto @46
		// @3A: bipush 58 (0x3A)
		// @3C: goto @46
		// @3F: bipush 68 (0x44)
		// @41: goto @46
		// @44: bipush 93 (0x5D)
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
