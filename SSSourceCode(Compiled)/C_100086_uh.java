package game;

final class C_100086_uh extends C_100340_je
{
	static C_100002_gf field_103027_v;
	static String[][] field_103031_r;
	static C_100098_h field_103028_u;
	static String field_103030_s;
	static C_100037_wb[][] field_103029_t;
	private static final String[] field_103032_z;
	
	public static void func_103025_b(byte arg0)
	{
		// @00: aconst_null
		// @01: checkcast java.lang.String[][]
		// @04: putstatic java.lang.String[][] game.C_100086_uh.field_103031_r
		// @07: aconst_null
		// @08: checkcast game.C_100037_wb[][]
		// @0B: putstatic game.C_100037_wb[][] game.C_100086_uh.field_103029_t
		// @0E: aconst_null
		// @0F: putstatic game.C_100002_gf game.C_100086_uh.field_103027_v
		// @12: aconst_null
		// @13: putstatic java.lang.String game.C_100086_uh.field_103030_s
		// @16: bipush -57 (0xC7)
		// @18: bipush -64 (0xC0)
		// @1A: iload_0
		// @1B: isub
		// @1C: bipush 51 (0x33)
		// @1E: idiv
		// @1F: idiv
		// @20: istore_1
		// @21: aconst_null
		// @22: putstatic game.C_100098_h game.C_100086_uh.field_103028_u
		// @25: goto @49
		// @28: astore_1
		// @29: aload_1
		// @2A: new java.lang.StringBuilder
		// @2D: dup
		// @2E: invokespecial java.lang.StringBuilder.<init>()void
		// @31: getstatic java.lang.String[] game.C_100086_uh.field_103032_z
		// @34: iconst_1
		// @35: aaload
		// @36: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @39: iload_0
		// @3A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3D: bipush 41 (0x29)
		// @3F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @42: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @45: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @48: athrow
		// @49: return
	}
	
	final C_100133_tk func_102974_b(String arg0, int arg1)
	{
		// @00: iconst_1
		// @01: aload_1
		// @02: invokestatic game.C_100298_ke.func_103205_a(boolean, java.lang.CharSequence)boolean
		// @05: ifne @0C
		// @08: getstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @0B: areturn
		// @0C: aload_1
		// @0D: bipush -114 (0x8E)
		// @0F: invokestatic game.C_100001_ge.func_100552_a(java.lang.CharSequence, int)int
		// @12: istore_3
		// @13: iload_2
		// @14: ifeq @20
		// @17: bipush 70 (0x46)
		// @19: invokestatic game.C_100086_uh.func_103026_g(int)void
		// @1C: goto @20
		// @1F: athrow
		// @20: iload_3
		// @21: iconst_m1
		// @22: ixor
		// @23: iconst_m1
		// @24: if_icmpge @34
		// @27: iload_3
		// @28: iconst_m1
		// @29: ixor
		// @2A: sipush -131 (0xFF7D)
		// @2D: if_icmpge @38
		// @30: goto @34
		// @33: athrow
		// @34: getstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @37: areturn
		// @38: getstatic game.C_100133_tk game.C_100079_e.field_102670_tb
		// @3B: areturn
		// @3C: astore_3
		// @3D: aload_3
		// @3E: new java.lang.StringBuilder
		// @41: dup
		// @42: invokespecial java.lang.StringBuilder.<init>()void
		// @45: getstatic java.lang.String[] game.C_100086_uh.field_103032_z
		// @48: iconst_4
		// @49: aaload
		// @4A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4D: aload_1
		// @4E: ifnull @5A
		// @51: getstatic java.lang.String[] game.C_100086_uh.field_103032_z
		// @54: iconst_3
		// @55: aaload
		// @56: goto @5F
		// @59: athrow
		// @5A: getstatic java.lang.String[] game.C_100086_uh.field_103032_z
		// @5D: iconst_2
		// @5E: aaload
		// @5F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @62: bipush 44 (0x2C)
		// @64: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @67: iload_2
		// @68: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6B: bipush 41 (0x29)
		// @6D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @70: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @73: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @76: athrow
	}
	
	C_100086_uh(C_100309_lk arg0)
	{
		// @0: aload_0
		// @1: aload_1
		// @2: invokespecial game.C_100340_je.<init>(game.C_100309_lk)void
		// @5: return
	}
	
	static final void func_103026_g(int arg0)
	{
		// @00: iconst_0
		// @01: bipush -90 (0xA6)
		// @03: invokestatic game.C_100253_ph.func_101092_c(int, int)boolean
		// @06: ifeq @2D
		// @09: getstatic int[] game.C_100275_na.field_103092_i
		// @0C: astore_1
		// @0D: aload_1
		// @0E: iconst_1
		// @0F: aload_1
		// @10: iconst_1
		// @11: iaload
		// @12: bipush 64 (0x40)
		// @14: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @17: iastore
		// @18: getstatic int[] game.C_100275_na.field_103095_q
		// @1B: astore_1
		// @1C: aload_1
		// @1D: iconst_1
		// @1E: aload_1
		// @1F: iconst_1
		// @20: iaload
		// @21: bipush -65 (0xBF)
		// @23: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @26: iastore
		// @27: getstatic int game.SteelSentinels.field_105275_O
		// @2A: ifeq @4B
		// @2D: getstatic int[] game.C_100275_na.field_103092_i
		// @30: astore_1
		// @31: aload_1
		// @32: iconst_1
		// @33: aload_1
		// @34: iconst_1
		// @35: iaload
		// @36: bipush -65 (0xBF)
		// @38: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @3B: iastore
		// @3C: getstatic int[] game.C_100275_na.field_103095_q
		// @3F: astore_1
		// @40: aload_1
		// @41: iconst_1
		// @42: aload_1
		// @43: iconst_1
		// @44: iaload
		// @45: bipush 64 (0x40)
		// @47: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @4A: iastore
		// @4B: iload_0
		// @4C: bipush 53 (0x35)
		// @4E: if_icmpgt @5A
		// @51: bipush -119 (0x89)
		// @53: invokestatic game.C_100086_uh.func_103025_b(byte)void
		// @56: goto @5A
		// @59: athrow
		// @5A: goto @7E
		// @5D: astore_1
		// @5E: aload_1
		// @5F: new java.lang.StringBuilder
		// @62: dup
		// @63: invokespecial java.lang.StringBuilder.<init>()void
		// @66: getstatic java.lang.String[] game.C_100086_uh.field_103032_z
		// @69: iconst_0
		// @6A: aaload
		// @6B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6E: iload_0
		// @6F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @72: bipush 41 (0x29)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7D: athrow
		// @7E: return
	}
	
	final String func_102975_a(byte arg0, String arg1)
	{
		// @00: aload_0
		// @01: aload_2
		// @02: iload_1
		// @03: bipush 16 (0x10)
		// @05: ixor
		// @06: invokevirtual game.C_100086_uh.func_102974_b(java.lang.String, int)game.C_100133_tk
		// @09: getstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @0C: if_acmpne @13
		// @0F: getstatic java.lang.String game.C_100056_de.field_103181_cb
		// @12: areturn
		// @13: iload_1
		// @14: bipush 16 (0x10)
		// @16: if_icmpeq @22
		// @19: bipush 41 (0x29)
		// @1B: invokestatic game.C_100086_uh.func_103026_g(int)void
		// @1E: goto @22
		// @21: athrow
		// @22: aconst_null
		// @23: areturn
		// @24: astore_3
		// @25: aload_3
		// @26: new java.lang.StringBuilder
		// @29: dup
		// @2A: invokespecial java.lang.StringBuilder.<init>()void
		// @2D: getstatic java.lang.String[] game.C_100086_uh.field_103032_z
		// @30: iconst_5
		// @31: aaload
		// @32: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35: iload_1
		// @36: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @39: bipush 44 (0x2C)
		// @3B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3E: aload_2
		// @3F: ifnull @4B
		// @42: getstatic java.lang.String[] game.C_100086_uh.field_103032_z
		// @45: iconst_3
		// @46: aaload
		// @47: goto @50
		// @4A: athrow
		// @4B: getstatic java.lang.String[] game.C_100086_uh.field_103032_z
		// @4E: iconst_2
		// @4F: aaload
		// @50: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @53: bipush 41 (0x29)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5E: athrow
	}
	
	static
	{
		// @00: bipush 6 (0x06)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "Wcvx\u0013"
		// @09: invokestatic game.C_100086_uh.func_103024_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100086_uh.func_103023_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "Wcvz\u0013"
		// @14: invokestatic game.C_100086_uh.func_103024_z(java.lang.String)char[]
		// @17: invokestatic game.C_100086_uh.func_103023_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "L~4U"
		// @1F: invokestatic game.C_100086_uh.func_103024_z(java.lang.String)char[]
		// @22: invokestatic game.C_100086_uh.func_103023_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "Y%v\u0017F"
		// @2A: invokestatic game.C_100086_uh.func_103024_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100086_uh.func_103023_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "Wcv\u007f\u0013"
		// @35: invokestatic game.C_100086_uh.func_103024_z(java.lang.String)char[]
		// @38: invokestatic game.C_100086_uh.func_103023_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "Wcv{\u0013"
		// @40: invokestatic game.C_100086_uh.func_103024_z(java.lang.String)char[]
		// @43: invokestatic game.C_100086_uh.func_103023_z(char[])java.lang.String
		// @46: aastore
		// @47: putstatic java.lang.String[] game.C_100086_uh.field_103032_z
		// @4A: ldc "rg=XHG+,KB\u0002j?XRL+1W\u001bC+>\\L\u0002f1WNVn+\u0017"
		// @4C: invokestatic game.C_100086_uh.func_103024_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100086_uh.func_103023_z(char[])java.lang.String
		// @52: putstatic java.lang.String game.C_100086_uh.field_103030_s
		// @55: return
	}
	
	private static char[] func_103024_z(String arg0)
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
	
	private static String func_103023_z(char[] arg0)
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
		// @30: bipush 34 (0x22)
		// @32: goto @46
		// @35: bipush 11 (0x0B)
		// @37: goto @46
		// @3A: bipush 88 (0x58)
		// @3C: goto @46
		// @3F: bipush 57 (0x39)
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
