package game;

abstract class C_100340_je extends C_100140_bj implements C_100224_ag
{
	private C_100309_lk field_102979_o;
	static int[] field_102976_q;
	static int field_102980_l;
	static String field_102985_h;
	static int field_102984_k;
	static int field_102978_n;
	static long field_102977_p;
	static String field_102982_j;
	static String field_102986_i;
	static int field_102981_m;
	private static final String[] field_102983_z;
	
	abstract C_100133_tk func_102974_b(String arg0, int arg1);
	
	final C_100133_tk func_102955_b(boolean arg0)
	{
		// @00: iload_1
		// @01: ifeq @12
		// @04: aload_0
		// @05: bipush 15 (0x0F)
		// @07: aconst_null
		// @08: checkcast game.C_100309_lk
		// @0B: invokevirtual game.C_100340_je.func_102580_a(byte, game.C_100309_lk)void
		// @0E: goto @12
		// @11: athrow
		// @12: aload_0
		// @13: aload_0
		// @14: getfield game.C_100309_lk game.C_100340_je.field_102979_o
		// @17: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @1A: iconst_0
		// @1B: invokevirtual game.C_100340_je.func_102974_b(java.lang.String, int)game.C_100133_tk
		// @1E: areturn
		// @1F: astore_2
		// @20: aload_2
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100340_je.field_102983_z
		// @2B: iconst_3
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: iload_1
		// @31: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @34: bipush 41 (0x29)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F: athrow
	}
	
	public static void func_102973_f(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100340_je.field_102982_j
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100340_je.field_102985_h
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100340_je.field_102986_i
		// @0C: aconst_null
		// @0D: putstatic int[] game.C_100340_je.field_102976_q
		// @10: iload_0
		// @11: sipush 26089 (0x65E9)
		// @14: if_icmpeq @1C
		// @17: bipush -88 (0xA8)
		// @19: putstatic int game.C_100340_je.field_102981_m
		// @1C: goto @41
		// @1F: astore_1
		// @20: aload_1
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100340_je.field_102983_z
		// @2B: bipush 8 (0x08)
		// @2D: aaload
		// @2E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @31: iload_0
		// @32: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @35: bipush 41 (0x29)
		// @37: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @40: athrow
		// @41: return
	}
	
	abstract String func_102975_a(byte arg0, String arg1);
	
	public final void func_102579_a(int arg0, C_100309_lk arg1)
	{
		// @00: iload_1
		// @01: bipush 20 (0x14)
		// @03: if_icmpeq @0B
		// @06: bipush -106 (0x96)
		// @08: putstatic int game.C_100340_je.field_102980_l
		// @0B: goto @49
		// @0E: astore_3
		// @0F: aload_3
		// @10: new java.lang.StringBuilder
		// @13: dup
		// @14: invokespecial java.lang.StringBuilder.<init>()void
		// @17: getstatic java.lang.String[] game.C_100340_je.field_102983_z
		// @1A: iconst_5
		// @1B: aaload
		// @1C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1F: iload_1
		// @20: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @23: bipush 44 (0x2C)
		// @25: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @28: aload_2
		// @29: ifnull @35
		// @2C: getstatic java.lang.String[] game.C_100340_je.field_102983_z
		// @2F: iconst_1
		// @30: aaload
		// @31: goto @3A
		// @34: athrow
		// @35: getstatic java.lang.String[] game.C_100340_je.field_102983_z
		// @38: iconst_0
		// @39: aaload
		// @3A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3D: bipush 41 (0x29)
		// @3F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @42: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @45: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @48: athrow
		// @49: return
	}
	
	public final void func_102580_a(byte arg0, C_100309_lk arg1)
	{
		// @00: aload_0
		// @01: bipush 97 (0x61)
		// @03: invokevirtual game.C_100340_je.func_102951_b(int)void
		// @06: iload_1
		// @07: bipush 79 (0x4F)
		// @09: if_icmpgt @11
		// @0C: bipush 68 (0x44)
		// @0E: putstatic int game.C_100340_je.field_102984_k
		// @11: goto @4F
		// @14: astore_3
		// @15: aload_3
		// @16: new java.lang.StringBuilder
		// @19: dup
		// @1A: invokespecial java.lang.StringBuilder.<init>()void
		// @1D: getstatic java.lang.String[] game.C_100340_je.field_102983_z
		// @20: iconst_2
		// @21: aaload
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: iload_1
		// @26: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @29: bipush 44 (0x2C)
		// @2B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E: aload_2
		// @2F: ifnull @3B
		// @32: getstatic java.lang.String[] game.C_100340_je.field_102983_z
		// @35: iconst_1
		// @36: aaload
		// @37: goto @40
		// @3A: athrow
		// @3B: getstatic java.lang.String[] game.C_100340_je.field_102983_z
		// @3E: iconst_0
		// @3F: aaload
		// @40: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @43: bipush 41 (0x29)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4E: athrow
		// @4F: return
	}
	
	C_100340_je(C_100309_lk arg0)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100140_bj.<init>()void
		// @04: aload_0
		// @05: aload_1
		// @06: putfield game.C_100309_lk game.C_100340_je.field_102979_o
		// @09: goto @3F
		// @0C: astore_2
		// @0D: aload_2
		// @0E: new java.lang.StringBuilder
		// @11: dup
		// @12: invokespecial java.lang.StringBuilder.<init>()void
		// @15: getstatic java.lang.String[] game.C_100340_je.field_102983_z
		// @18: bipush 6 (0x06)
		// @1A: aaload
		// @1B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1E: aload_1
		// @1F: ifnull @2B
		// @22: getstatic java.lang.String[] game.C_100340_je.field_102983_z
		// @25: iconst_1
		// @26: aaload
		// @27: goto @30
		// @2A: athrow
		// @2B: getstatic java.lang.String[] game.C_100340_je.field_102983_z
		// @2E: iconst_0
		// @2F: aaload
		// @30: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @33: bipush 41 (0x29)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3E: athrow
		// @3F: return
	}
	
	final String func_102957_d(int arg0)
	{
		// @00: iload_1
		// @01: sipush -29062 (0x8E7A)
		// @04: if_icmpeq @0C
		// @07: aconst_null
		// @08: checkcast java.lang.String
		// @0B: areturn
		// @0C: aload_0
		// @0D: bipush 16 (0x10)
		// @0F: aload_0
		// @10: getfield game.C_100309_lk game.C_100340_je.field_102979_o
		// @13: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @16: invokevirtual game.C_100340_je.func_102975_a(byte, java.lang.String)java.lang.String
		// @19: areturn
		// @1A: astore_2
		// @1B: aload_2
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String[] game.C_100340_je.field_102983_z
		// @26: bipush 7 (0x07)
		// @28: aaload
		// @29: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C: iload_1
		// @2D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @30: bipush 41 (0x29)
		// @32: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @35: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @38: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3B: athrow
	}
	
	public final boolean func_102952_a(int arg0)
	{
		// @00: iload_1
		// @01: bipush -50 (0xCE)
		// @03: if_icmple @11
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: putstatic java.lang.String game.C_100340_je.field_102986_i
		// @0D: goto @11
		// @10: athrow
		// @11: aload_0
		// @12: getfield game.C_100309_lk game.C_100340_je.field_102979_o
		// @15: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @18: ifnull @2F
		// @1B: iconst_m1
		// @1C: aload_0
		// @1D: getfield game.C_100309_lk game.C_100340_je.field_102979_o
		// @20: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @23: invokevirtual java.lang.String.length()int
		// @26: iconst_m1
		// @27: ixor
		// @28: if_icmpne @34
		// @2B: goto @2F
		// @2E: athrow
		// @2F: iconst_1
		// @30: goto @35
		// @33: athrow
		// @34: iconst_0
		// @35: ireturn
		// @36: astore_2
		// @37: aload_2
		// @38: new java.lang.StringBuilder
		// @3B: dup
		// @3C: invokespecial java.lang.StringBuilder.<init>()void
		// @3F: getstatic java.lang.String[] game.C_100340_je.field_102983_z
		// @42: iconst_4
		// @43: aaload
		// @44: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @47: iload_1
		// @48: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4B: bipush 41 (0x29)
		// @4D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @50: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @53: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @56: athrow
	}
	
	static
	{
		// @00: bipush 9 (0x09)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\u0008L\u0011#"
		// @09: invokestatic game.C_100340_je.func_102972_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100340_je.func_102971_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u001d\u0017Sax"
		// @14: invokestatic game.C_100340_je.func_102972_z(java.lang.String)char[]
		// @17: invokestatic game.C_100340_je.func_102971_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u000c\\S\u0004DN"
		// @1F: invokestatic game.C_100340_je.func_102972_z(java.lang.String)char[]
		// @22: invokestatic game.C_100340_je.func_102971_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\u000c\\S\u0008DN"
		// @2A: invokestatic game.C_100340_je.func_102972_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100340_je.func_102971_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\u000c\\S\u0001DN"
		// @35: invokestatic game.C_100340_je.func_102972_z(java.lang.String)char[]
		// @38: invokestatic game.C_100340_je.func_102971_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\u000c\\S\u0006DN"
		// @40: invokestatic game.C_100340_je.func_102972_z(java.lang.String)char[]
		// @43: invokestatic game.C_100340_je.func_102971_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "\u000c\\Ssl\u0008P\tq-"
		// @4C: invokestatic game.C_100340_je.func_102972_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100340_je.func_102971_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "\u000c\\S\u0000DN"
		// @58: invokestatic game.C_100340_je.func_102972_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100340_je.func_102971_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "\u000c\\S\u001d-"
		// @64: invokestatic game.C_100340_je.func_102972_z(java.lang.String)char[]
		// @67: invokestatic game.C_100340_je.func_102971_z(char[])java.lang.String
		// @6A: aastore
		// @6B: putstatic java.lang.String[] game.C_100340_je.field_102983_z
		// @6E: sipush 256 (0x0100)
		// @71: newarray int[]
		// @73: putstatic int[] game.C_100340_je.field_102976_q
		// @76: ldc "!X\u0010*%\tI\t&j\u0008J"
		// @78: invokestatic game.C_100340_je.func_102972_z(java.lang.String)char[]
		// @7B: invokestatic game.C_100340_je.func_102971_z(char[])java.lang.String
		// @7E: putstatic java.lang.String game.C_100340_je.field_102985_h
		// @81: iconst_0
		// @82: istore_1
		// @83: sipush 256 (0x0100)
		// @86: iload_1
		// @87: if_icmple @C0
		// @8A: iload_1
		// @8B: istore_0
		// @8C: iconst_0
		// @8D: istore_2
		// @8E: iload_2
		// @8F: bipush 8 (0x08)
		// @91: if_icmpge @B4
		// @94: iconst_1
		// @95: iload_0
		// @96: iand
		// @97: iconst_1
		// @98: if_icmpeq @A6
		// @9B: goto @9F
		// @9E: athrow
		// @9F: iload_0
		// @A0: iconst_1
		// @A1: iushr
		// @A2: istore_0
		// @A3: goto @AE
		// @A6: ldc -306674912 (0xedb88320)
		// @A8: iload_0
		// @A9: ldc -1112063007 (0xbdb743e1)
		// @AB: iushr
		// @AC: ixor
		// @AD: istore_0
		// @AE: iinc #2 +1
		// @B1: goto @8E
		// @B4: getstatic int[] game.C_100340_je.field_102976_q
		// @B7: iload_1
		// @B8: iload_0
		// @B9: iastore
		// @BA: iinc #1 +1
		// @BD: goto @83
		// @C0: sipush 480 (0x01E0)
		// @C3: putstatic int game.C_100340_je.field_102984_k
		// @C6: sipush 360 (0x0168)
		// @C9: putstatic int game.C_100340_je.field_102978_n
		// @CC: ldc "$K\u0018.n\u000fW\u001aow\u0003X\u0011br\tK\u0011+%\nX\n<"
		// @CE: invokestatic game.C_100340_je.func_102972_z(java.lang.String)char[]
		// @D1: invokestatic game.C_100340_je.func_102971_z(char[])java.lang.String
		// @D4: putstatic java.lang.String game.C_100340_je.field_102982_j
		// @D7: ldc "?V\u0008om\u0007O\u0018or\u000fM\u0015+w\u0007N\u0013o|\tL\u000fow\u0003H\u0008*v\u0012\u0019\t %\u000cV\u0014!+"
		// @D9: invokestatic game.C_100340_je.func_102972_z(java.lang.String)char[]
		// @DC: invokestatic game.C_100340_je.func_102971_z(char[])java.lang.String
		// @DF: putstatic java.lang.String game.C_100340_je.field_102986_i
		// @E2: iconst_0
		// @E3: putstatic int game.C_100340_je.field_102981_m
		// @E6: return
	}
	
	private static char[] func_102972_z(String arg0)
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
		// @0E: iconst_5
		// @0F: ixor
		// @10: i2c
		// @11: castore
		// @12: areturn
	}
	
	private static String func_102971_z(char[] arg0)
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
		// @30: bipush 102 (0x66)
		// @32: goto @45
		// @35: bipush 57 (0x39)
		// @37: goto @45
		// @3A: bipush 125 (0x7D)
		// @3C: goto @45
		// @3F: bipush 79 (0x4F)
		// @41: goto @45
		// @44: iconst_5
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
