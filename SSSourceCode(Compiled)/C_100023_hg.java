package game;

final class C_100023_hg
{
	static String field_103921_g;
	static int field_103922_d;
	static String field_103928_h;
	private int field_103926_a;
	private int field_103923_e;
	static String field_103925_c;
	private int[] field_103924_b;
	private boolean field_103920_f;
	private static final String[] field_103927_z;
	
	final void func_103916_a(byte arg0, int arg1)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: iload_2
		// @03: aload_0
		// @04: getfield int game.C_100023_hg.field_103923_e
		// @07: iconst_1
		// @08: iadd
		// @09: invokespecial game.C_100023_hg.func_103918_a(int, int, int)void
		// @0C: iload_1
		// @0D: bipush -100 (0x9C)
		// @0F: if_icmpeq @1A
		// @12: aload_0
		// @13: aconst_null
		// @14: checkcast int[]
		// @17: putfield int[] game.C_100023_hg.field_103924_b
		// @1A: goto @48
		// @1D: astore_3
		// @1E: aload_3
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100023_hg.field_103927_z
		// @29: bipush 8 (0x08)
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_1
		// @30: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @33: bipush 44 (0x2C)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: iload_2
		// @39: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3C: bipush 41 (0x29)
		// @3E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @41: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @44: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @47: athrow
		// @48: return
	}
	
	final int func_103911_a(int arg0, byte arg1)
	{
		// @00: aload_0
		// @01: getfield int game.C_100023_hg.field_103923_e
		// @04: iconst_m1
		// @05: ixor
		// @06: iload_1
		// @07: iconst_m1
		// @08: ixor
		// @09: if_icmpgt @10
		// @0C: goto @19
		// @0F: athrow
		// @10: new java.lang.ArrayIndexOutOfBoundsException
		// @13: dup
		// @14: iload_1
		// @15: invokespecial java.lang.ArrayIndexOutOfBoundsException.<init>(int)void
		// @18: athrow
		// @19: bipush -36 (0xDC)
		// @1B: iload_2
		// @1C: bipush 55 (0x37)
		// @1E: isub
		// @1F: bipush 62 (0x3E)
		// @21: idiv
		// @22: idiv
		// @23: istore_3
		// @24: aload_0
		// @25: getfield int[] game.C_100023_hg.field_103924_b
		// @28: iload_1
		// @29: iaload
		// @2A: ireturn
		// @2B: astore_3
		// @2C: aload_3
		// @2D: new java.lang.StringBuilder
		// @30: dup
		// @31: invokespecial java.lang.StringBuilder.<init>()void
		// @34: getstatic java.lang.String[] game.C_100023_hg.field_103927_z
		// @37: iconst_5
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: iload_1
		// @3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40: bipush 44 (0x2C)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: iload_2
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 41 (0x29)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @51: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @54: athrow
	}
	
	public static void func_103913_a(int arg0)
	{
		// @00: bipush 123 (0x7B)
		// @02: iload_0
		// @03: bipush 76 (0x4C)
		// @05: isub
		// @06: bipush 42 (0x2A)
		// @08: idiv
		// @09: irem
		// @0A: istore_1
		// @0B: aconst_null
		// @0C: putstatic java.lang.String game.C_100023_hg.field_103928_h
		// @0F: aconst_null
		// @10: putstatic java.lang.String game.C_100023_hg.field_103921_g
		// @13: aconst_null
		// @14: putstatic java.lang.String game.C_100023_hg.field_103925_c
		// @17: goto @3C
		// @1A: astore_1
		// @1B: aload_1
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String[] game.C_100023_hg.field_103927_z
		// @26: bipush 9 (0x09)
		// @28: aaload
		// @29: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C: iload_0
		// @2D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @30: bipush 41 (0x29)
		// @32: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @35: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @38: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3B: athrow
		// @3C: return
	}
	
	static final boolean func_103909_c(int arg0)
	{
		// @00: iload_0
		// @01: sipush -29936 (0x8B10)
		// @04: if_icmpeq @12
		// @07: aconst_null
		// @08: checkcast java.lang.String
		// @0B: putstatic java.lang.String game.C_100023_hg.field_103925_c
		// @0E: goto @12
		// @11: athrow
		// @12: getstatic int game.C_100087_n.field_100697_v
		// @15: iconst_m1
		// @16: ixor
		// @17: bipush -11 (0xF5)
		// @19: if_icmpgt @2F
		// @1C: bipush -14 (0xF2)
		// @1E: getstatic int game.C_100283_ni.field_106760_c
		// @21: iconst_m1
		// @22: ixor
		// @23: if_icmplt @2F
		// @26: goto @2A
		// @29: athrow
		// @2A: iconst_1
		// @2B: goto @30
		// @2E: athrow
		// @2F: iconst_0
		// @30: ireturn
		// @31: astore_1
		// @32: aload_1
		// @33: new java.lang.StringBuilder
		// @36: dup
		// @37: invokespecial java.lang.StringBuilder.<init>()void
		// @3A: getstatic java.lang.String[] game.C_100023_hg.field_103927_z
		// @3D: iconst_2
		// @3E: aaload
		// @3F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @42: iload_0
		// @43: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @46: bipush 41 (0x29)
		// @48: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @51: athrow
	}
	
	private final void func_103918_a(int arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: ifeq @11
		// @04: aload_0
		// @05: bipush -120 (0x88)
		// @07: bipush -126 (0x82)
		// @09: invokespecial game.C_100023_hg.func_103912_b(int, int)int
		// @0C: pop
		// @0D: goto @11
		// @10: athrow
		// @11: iload_3
		// @12: aload_0
		// @13: getfield int game.C_100023_hg.field_103923_e
		// @16: if_icmple @22
		// @19: aload_0
		// @1A: iload_3
		// @1B: putfield int game.C_100023_hg.field_103923_e
		// @1E: goto @22
		// @21: athrow
		// @22: aload_0
		// @23: getfield int[] game.C_100023_hg.field_103924_b
		// @26: arraylength
		// @27: iload_3
		// @28: if_icmpgt @35
		// @2B: aload_0
		// @2C: iconst_1
		// @2D: iload_3
		// @2E: invokespecial game.C_100023_hg.func_103919_c(int, int)void
		// @31: goto @35
		// @34: athrow
		// @35: aload_0
		// @36: getfield int[] game.C_100023_hg.field_103924_b
		// @39: iload_3
		// @3A: iload_2
		// @3B: iastore
		// @3C: goto @74
		// @3F: astore #4
		// @41: aload #4
		// @43: new java.lang.StringBuilder
		// @46: dup
		// @47: invokespecial java.lang.StringBuilder.<init>()void
		// @4A: getstatic java.lang.String[] game.C_100023_hg.field_103927_z
		// @4D: iconst_4
		// @4E: aaload
		// @4F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @52: iload_1
		// @53: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @56: bipush 44 (0x2C)
		// @58: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B: iload_2
		// @5C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5F: bipush 44 (0x2C)
		// @61: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @64: iload_3
		// @65: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @68: bipush 41 (0x29)
		// @6A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @70: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @73: athrow
		// @74: return
	}
	
	final void func_103917_a(int arg0, int arg1)
	{
		// @00: iload_2
		// @01: iload_1
		// @02: iconst_m1
		// @03: ixor
		// @04: if_icmplt @13
		// @07: aload_0
		// @08: getfield int game.C_100023_hg.field_103923_e
		// @0B: iload_1
		// @0C: if_icmpge @1D
		// @0F: goto @13
		// @12: athrow
		// @13: new java.lang.ArrayIndexOutOfBoundsException
		// @16: dup
		// @17: iload_1
		// @18: invokespecial java.lang.ArrayIndexOutOfBoundsException.<init>(int)void
		// @1B: athrow
		// @1C: athrow
		// @1D: aload_0
		// @1E: getfield int game.C_100023_hg.field_103923_e
		// @21: iconst_m1
		// @22: ixor
		// @23: iload_1
		// @24: iconst_m1
		// @25: ixor
		// @26: if_icmpne @2D
		// @29: goto @43
		// @2C: athrow
		// @2D: aload_0
		// @2E: getfield int[] game.C_100023_hg.field_103924_b
		// @31: iload_1
		// @32: iconst_1
		// @33: iadd
		// @34: aload_0
		// @35: getfield int[] game.C_100023_hg.field_103924_b
		// @38: iload_1
		// @39: iload_1
		// @3A: ineg
		// @3B: aload_0
		// @3C: getfield int game.C_100023_hg.field_103923_e
		// @3F: iadd
		// @40: invokestatic game.C_100120_en.func_104913_a(int[], int, int[], int, int)void
		// @43: aload_0
		// @44: dup
		// @45: getfield int game.C_100023_hg.field_103923_e
		// @48: iconst_1
		// @49: isub
		// @4A: putfield int game.C_100023_hg.field_103923_e
		// @4D: goto @7A
		// @50: astore_3
		// @51: aload_3
		// @52: new java.lang.StringBuilder
		// @55: dup
		// @56: invokespecial java.lang.StringBuilder.<init>()void
		// @59: getstatic java.lang.String[] game.C_100023_hg.field_103927_z
		// @5C: iconst_1
		// @5D: aaload
		// @5E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @61: iload_1
		// @62: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @65: bipush 44 (0x2C)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: iload_2
		// @6B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6E: bipush 41 (0x29)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @76: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @79: athrow
		// @7A: return
	}
	
	private final int func_103912_b(int arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: aload_0
		// @06: getfield int[] game.C_100023_hg.field_103924_b
		// @09: arraylength
		// @0A: istore_3
		// @0B: bipush -61 (0xC3)
		// @0D: bipush -42 (0xD6)
		// @0F: iload_2
		// @10: isub
		// @11: bipush 43 (0x2B)
		// @13: idiv
		// @14: idiv
		// @15: istore #4
		// @17: iload_1
		// @18: iconst_m1
		// @19: ixor
		// @1A: iload_3
		// @1B: iconst_m1
		// @1C: ixor
		// @1D: if_icmpgt @57
		// @20: aload_0
		// @21: getfield boolean game.C_100023_hg.field_103920_f
		// @24: iload #5
		// @26: ifne @58
		// @29: ifeq @4B
		// @2C: goto @30
		// @2F: athrow
		// @30: iload_3
		// @31: ifne @3F
		// @34: goto @38
		// @37: athrow
		// @38: iconst_1
		// @39: istore_3
		// @3A: iload #5
		// @3C: ifeq @17
		// @3F: iload_3
		// @40: aload_0
		// @41: getfield int game.C_100023_hg.field_103926_a
		// @44: imul
		// @45: istore_3
		// @46: iload #5
		// @48: ifeq @17
		// @4B: iload_3
		// @4C: aload_0
		// @4D: getfield int game.C_100023_hg.field_103926_a
		// @50: iadd
		// @51: istore_3
		// @52: iload #5
		// @54: ifeq @17
		// @57: iload_3
		// @58: ireturn
		// @59: astore_3
		// @5A: aload_3
		// @5B: new java.lang.StringBuilder
		// @5E: dup
		// @5F: invokespecial java.lang.StringBuilder.<init>()void
		// @62: getstatic java.lang.String[] game.C_100023_hg.field_103927_z
		// @65: bipush 7 (0x07)
		// @67: aaload
		// @68: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6B: iload_1
		// @6C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6F: bipush 44 (0x2C)
		// @71: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @74: iload_2
		// @75: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @78: bipush 41 (0x29)
		// @7A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @80: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @83: athrow
	}
	
	private C_100023_hg() throws Throwable
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: new java.lang.Error
		// @07: dup
		// @08: invokespecial java.lang.Error.<init>()void
		// @0B: athrow
		// @0C: astore_1
		// @0D: aload_1
		// @0E: getstatic java.lang.String[] game.C_100023_hg.field_103927_z
		// @11: iconst_0
		// @12: aaload
		// @13: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @16: athrow
	}
	
	final int func_103910_b(int arg0)
	{
		// @00: iload_1
		// @01: ifeq @07
		// @04: bipush -63 (0xC1)
		// @06: ireturn
		// @07: aload_0
		// @08: getfield int game.C_100023_hg.field_103923_e
		// @0B: iconst_m1
		// @0C: isub
		// @0D: ireturn
		// @0E: astore_2
		// @0F: aload_2
		// @10: new java.lang.StringBuilder
		// @13: dup
		// @14: invokespecial java.lang.StringBuilder.<init>()void
		// @17: getstatic java.lang.String[] game.C_100023_hg.field_103927_z
		// @1A: bipush 6 (0x06)
		// @1C: aaload
		// @1D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @20: iload_1
		// @21: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @24: bipush 41 (0x29)
		// @26: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @29: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2F: athrow
	}
	
	private final void func_103919_c(int arg0, int arg1)
	{
		// @00: aload_0
		// @01: iload_2
		// @02: bipush 69 (0x45)
		// @04: invokespecial game.C_100023_hg.func_103912_b(int, int)int
		// @07: newarray int[]
		// @09: astore_3
		// @0A: aload_0
		// @0B: getfield int[] game.C_100023_hg.field_103924_b
		// @0E: iconst_0
		// @0F: aload_3
		// @10: iconst_0
		// @11: aload_0
		// @12: getfield int[] game.C_100023_hg.field_103924_b
		// @15: arraylength
		// @16: invokestatic game.C_100120_en.func_104913_a(int[], int, int[], int, int)void
		// @19: aload_0
		// @1A: aload_3
		// @1B: putfield int[] game.C_100023_hg.field_103924_b
		// @1E: iload_1
		// @1F: iconst_1
		// @20: if_icmpeq @2C
		// @23: bipush -120 (0x88)
		// @25: putstatic int game.C_100023_hg.field_103922_d
		// @28: goto @2C
		// @2B: athrow
		// @2C: goto @59
		// @2F: astore_3
		// @30: aload_3
		// @31: new java.lang.StringBuilder
		// @34: dup
		// @35: invokespecial java.lang.StringBuilder.<init>()void
		// @38: getstatic java.lang.String[] game.C_100023_hg.field_103927_z
		// @3B: iconst_3
		// @3C: aaload
		// @3D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @40: iload_1
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 44 (0x2C)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: iload_2
		// @4A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4D: bipush 41 (0x29)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @55: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @58: athrow
		// @59: return
	}
	
	static
	{
		// @00: bipush 10 (0x0A)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "W2Q\u00163Q<\u000b\u0014r\u0016"
		// @09: invokestatic game.C_100023_hg.func_103915_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100023_hg.func_103914_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "W2Qor"
		// @14: invokestatic game.C_100023_hg.func_103915_z(java.lang.String)char[]
		// @17: invokestatic game.C_100023_hg.func_103914_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "W2Qmr"
		// @1F: invokestatic game.C_100023_hg.func_103915_z(java.lang.String)char[]
		// @22: invokestatic game.C_100023_hg.func_103914_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "W2Qlr"
		// @2A: invokestatic game.C_100023_hg.func_103915_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100023_hg.func_103914_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "W2Qir"
		// @35: invokestatic game.C_100023_hg.func_103915_z(java.lang.String)char[]
		// @38: invokestatic game.C_100023_hg.func_103914_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "W2Qkr"
		// @40: invokestatic game.C_100023_hg.func_103915_z(java.lang.String)char[]
		// @43: invokestatic game.C_100023_hg.func_103914_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "W2Qnr"
		// @4C: invokestatic game.C_100023_hg.func_103915_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100023_hg.func_103914_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "W2Qhr"
		// @58: invokestatic game.C_100023_hg.func_103915_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100023_hg.func_103914_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "W2Qbr"
		// @64: invokestatic game.C_100023_hg.func_103915_z(java.lang.String)char[]
		// @67: invokestatic game.C_100023_hg.func_103914_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "W2Qcr"
		// @70: invokestatic game.C_100023_hg.func_103915_z(java.lang.String)char[]
		// @73: invokestatic game.C_100023_hg.func_103914_z(char[])java.lang.String
		// @76: aastore
		// @77: putstatic java.lang.String[] game.C_100023_hg.field_103927_z
		// @7A: ldc "v;\tK6V1_N;K0"
		// @7C: invokestatic game.C_100023_hg.func_103915_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100023_hg.func_103914_z(char[])java.lang.String
		// @82: putstatic java.lang.String game.C_100023_hg.field_103928_h
		// @85: ldc "\u0003pN\u0014z\\:\nF>Qr\u000b\n<V;\u001b\n9P#\u001aXzV;_^3R0"
		// @87: invokestatic game.C_100023_hg.func_103915_z(java.lang.String)char[]
		// @8A: invokestatic game.C_100023_hg.func_103914_z(char[])java.lang.String
		// @8D: putstatic java.lang.String game.C_100023_hg.field_103921_g
		// @90: ldc "\u0003pO\u0014zX:\u000b\n9^'\u001aF?L&"
		// @92: invokestatic game.C_100023_hg.func_103915_z(java.lang.String)char[]
		// @95: invokestatic game.C_100023_hg.func_103914_z(char[])java.lang.String
		// @98: putstatic java.lang.String game.C_100023_hg.field_103925_c
		// @9B: return
	}
	
	private static char[] func_103915_z(String arg0)
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
	
	private static String func_103914_z(char[] arg0)
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
		// @30: bipush 63 (0x3F)
		// @32: goto @46
		// @35: bipush 85 (0x55)
		// @37: goto @46
		// @3A: bipush 127 (0x7F)
		// @3C: goto @46
		// @3F: bipush 42 (0x2A)
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
