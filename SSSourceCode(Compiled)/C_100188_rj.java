package game;

final class C_100188_rj
{
	static String field_105740_a;
	static int field_105737_e;
	static String field_105739_c;
	static boolean field_105735_f;
	static volatile boolean field_105736_d;
	static int[] field_105738_b;
	private static final String[] field_105741_z;
	
	static final C_100037_wb[] func_105731_a(String arg0, C_100098_h arg1, int arg2, String arg3)
	{
		// @00: iload_2
		// @01: bipush 73 (0x49)
		// @03: if_icmpgt @0E
		// @06: iconst_1
		// @07: putstatic boolean game.C_100188_rj.field_105735_f
		// @0A: goto @0E
		// @0D: athrow
		// @0E: aload_1
		// @0F: sipush -10719 (0xD621)
		// @12: aload_0
		// @13: invokevirtual game.C_100098_h.func_104601_b(int, java.lang.String)int
		// @16: istore #4
		// @18: aload_1
		// @19: aload_3
		// @1A: iload #4
		// @1C: iconst_0
		// @1D: invokevirtual game.C_100098_h.func_104600_a(java.lang.String, int, int)int
		// @20: istore #5
		// @22: iload #4
		// @24: iconst_0
		// @25: iload #5
		// @27: aload_1
		// @28: invokestatic game.C_100100_i.func_102007_a(int, boolean, int, game.C_100098_h)game.C_100037_wb[]
		// @2B: areturn
		// @2C: astore #4
		// @2E: aload #4
		// @30: new java.lang.StringBuilder
		// @33: dup
		// @34: invokespecial java.lang.StringBuilder.<init>()void
		// @37: getstatic java.lang.String[] game.C_100188_rj.field_105741_z
		// @3A: iconst_1
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: aload_0
		// @40: ifnull @4C
		// @43: getstatic java.lang.String[] game.C_100188_rj.field_105741_z
		// @46: iconst_2
		// @47: aaload
		// @48: goto @51
		// @4B: athrow
		// @4C: getstatic java.lang.String[] game.C_100188_rj.field_105741_z
		// @4F: iconst_0
		// @50: aaload
		// @51: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @54: bipush 44 (0x2C)
		// @56: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @59: aload_1
		// @5A: ifnull @66
		// @5D: getstatic java.lang.String[] game.C_100188_rj.field_105741_z
		// @60: iconst_2
		// @61: aaload
		// @62: goto @6B
		// @65: athrow
		// @66: getstatic java.lang.String[] game.C_100188_rj.field_105741_z
		// @69: iconst_0
		// @6A: aaload
		// @6B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6E: bipush 44 (0x2C)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: iload_2
		// @74: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @77: bipush 44 (0x2C)
		// @79: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7C: aload_3
		// @7D: ifnull @89
		// @80: getstatic java.lang.String[] game.C_100188_rj.field_105741_z
		// @83: iconst_2
		// @84: aaload
		// @85: goto @8E
		// @88: athrow
		// @89: getstatic java.lang.String[] game.C_100188_rj.field_105741_z
		// @8C: iconst_0
		// @8D: aaloadoh boy'
		// @8E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @91: bipush 41 (0x29)
		// @93: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @96: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @99: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9C: athrow
	}
	
	public static void func_105732_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic int[] game.C_100188_rj.field_105738_b
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100188_rj.field_105739_c
		// @08: iload_0
		// @09: sipush -29109 (0x8E4B)
		// @0C: if_icmpeq @1A
		// @0F: aconst_null
		// @10: checkcast java.lang.String
		// @13: putstatic java.lang.String game.C_100188_rj.field_105739_c
		// @16: goto @1A
		// @19: athrow
		// @1A: aconst_null
		// @1B: putstatic java.lang.String game.C_100188_rj.field_105740_a
		// @1E: goto @42
		// @21: astore_1
		// @22: aload_1
		// @23: new java.lang.StringBuilder
		// @26: dup
		// @27: invokespecial java.lang.StringBuilder.<init>()void
		// @2A: getstatic java.lang.String[] game.C_100188_rj.field_105741_z
		// @2D: iconst_3
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
		// @00: iconst_4
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "Y|-\t"
		// @08: invokestatic game.C_100188_rj.func_105734_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100188_rj.func_105733_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "Eco'>"
		// @13: invokestatic game.C_100188_rj.func_105734_z(java.lang.String)char[]
		// @16: invokestatic game.C_100188_rj.func_105733_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "L'oKk"
		// @1E: invokestatic game.C_100188_rj.func_105734_z(java.lang.String)char[]
		// @21: invokestatic game.C_100188_rj.func_105733_z(char[])java.lang.String
		// @24: aastore
		// @25: dup
		// @26: iconst_3
		// @27: ldc "Eco$>"
		// @29: invokestatic game.C_100188_rj.func_105734_z(java.lang.String)char[]
		// @2C: invokestatic game.C_100188_rj.func_105733_z(char[])java.lang.String
		// @2F: aastore
		// @30: putstatic java.lang.String[] game.C_100188_rj.field_105741_z
		// @33: ldc "bg'\ndC|/\u0004bRe8EoX|3EuXg'\u000cqB{ \u0011\u007fXga\u0001yRz/Bb\u0017z4\u0015fX{5EpBe-\u0016uEl$\u000b6Zf%\u00008\u0017P.\u00106Tf4\tr\u0017}3\u001c6El2\u0011wE}(\u000bq\u0017p.\u0010d\u0017k3\naDl3EwYma\u0010e^g&Eb_la\u0016\u007fPg$\u00016Vy1\tsC'"
		// @35: invokestatic game.C_100188_rj.func_105734_z(java.lang.String)char[]
		// @38: invokestatic game.C_100188_rj.func_105733_z(char[])java.lang.String
		// @3B: putstatic java.lang.String game.C_100188_rj.field_105740_a
		// @3E: ldc "nf4EuVga\u000fy^ga\u0011~^za\u0002wZl"
		// @40: invokestatic game.C_100188_rj.func_105734_z(java.lang.String)char[]
		// @43: invokestatic game.C_100188_rj.func_105733_z(char[])java.lang.String
		// @46: putstatic java.lang.String game.C_100188_rj.field_105739_c
		// @49: iconst_0
		// @4A: putstatic boolean game.C_100188_rj.field_105736_d
		// @4D: return
	}
	
	private static char[] func_105734_z(String arg0)
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
		// @0E: bipush 22 (0x16)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105733_z(char[] arg0)
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
		// @30: bipush 55 (0x37)
		// @32: goto @46
		// @35: bipush 9 (0x09)
		// @37: goto @46
		// @3A: bipush 65 (0x41)
		// @3C: goto @46
		// @3F: bipush 101 (0x65)
		// @41: goto @46
		// @44: bipush 22 (0x16)
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
