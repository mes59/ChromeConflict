package game;

final class C_100335_il
{
	static String field_107366_g;
	static String[] field_107373_h;
	static byte[][][] field_107365_f;
	static String field_107371_a;
	static String field_107367_d;
	static String field_107370_c;
	static C_100098_h field_107369_b;
	static C_100202_qi field_107368_e;
	private static final String[] field_107372_z;
	
	static final void func_107364_a(int arg0, int arg1, int arg2)
	{
		// @00: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @03: astore_3
		// @04: aload_3
		// @05: iload_2
		// @06: bipush 116 (0x74)
		// @08: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @0B: aload_3
		// @0C: sipush 7838 (0x1E9E)
		// @0F: iconst_3
		// @10: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @13: iload_1
		// @14: sipush -1999 (0xF831)
		// @17: if_icmpeq @25
		// @1A: aconst_null
		// @1B: checkcast java.lang.String
		// @1E: putstatic java.lang.String game.C_100335_il.field_107367_d
		// @21: goto @25
		// @24: athrow
		// @25: aload_3
		// @26: sipush 7838 (0x1E9E)
		// @29: bipush 10 (0x0A)
		// @2B: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @2E: aload_3
		// @2F: iload_0
		// @30: bipush 125 (0x7D)
		// @32: invokevirtual game.C_100278_nd.func_101141_d(int, byte)void
		// @35: goto @6B
		// @38: astore_3
		// @39: aload_3
		// @3A: new java.lang.StringBuilder
		// @3D: dup
		// @3E: invokespecial java.lang.StringBuilder.<init>()void
		// @41: getstatic java.lang.String[] game.C_100335_il.field_107372_z
		// @44: iconst_1
		// @45: aaload
		// @46: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @49: iload_0
		// @4A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4D: bipush 44 (0x2C)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: iload_1
		// @53: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @56: bipush 44 (0x2C)
		// @58: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B: iload_2
		// @5C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5F: bipush 41 (0x29)
		// @61: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @64: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @67: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6A: athrow
		// @6B: return
	}
	
	static final int func_107363_b(byte arg0)
	{
		// @00: iload_0
		// @01: bipush 123 (0x7B)
		// @03: if_icmpgt @09
		// @06: bipush -45 (0xD3)
		// @08: ireturn
		// @09: sipush 1900 (0x076C)
		// @0C: new java.util.Date
		// @0F: dup
		// @10: invokespecial java.util.Date.<init>()void
		// @13: invokevirtual java.util.Date.getYear()int
		// @16: iadd
		// @17: ireturn
		// @18: astore_1
		// @19: aload_1
		// @1A: new java.lang.StringBuilder
		// @1D: dup
		// @1E: invokespecial java.lang.StringBuilder.<init>()void
		// @21: getstatic java.lang.String[] game.C_100335_il.field_107372_z
		// @24: iconst_2
		// @25: aaload
		// @26: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @29: iload_0
		// @2A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2D: bipush 41 (0x29)
		// @2F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @32: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @35: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @38: athrow
	}
	
	static final void func_107359_b(int arg0)
	{
		// @00: iload_0
		// @01: iconst_3
		// @02: if_icmpeq @10
		// @05: aconst_null
		// @06: checkcast game.C_100098_h
		// @09: putstatic game.C_100098_h game.C_100335_il.field_107369_b
		// @0C: goto @10
		// @0F: athrow
		// @10: sipush 15874 (0x3E02)
		// @13: invokestatic game.C_100327_ib.func_102470_r(int)boolean
		// @16: ifeq @1D
		// @19: goto @1E
		// @1C: athrow
		// @1D: return
		// @1E: iconst_4
		// @1F: iload_0
		// @20: iconst_2
		// @21: ixor
		// @22: iconst_0
		// @23: invokestatic game.C_100053_vn.func_102818_a(int, int, boolean)void
		// @26: goto @4A
		// @29: astore_1
		// @2A: aload_1
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100335_il.field_107372_z
		// @35: iconst_3
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
	
	public static void func_107360_a(int arg0)
	{
		// @00: aconst_null
		// @01: checkcast byte[][][]
		// @04: putstatic byte[][][] game.C_100335_il.field_107365_f
		// @07: aconst_null
		// @08: putstatic java.lang.String game.C_100335_il.field_107367_d
		// @0B: aconst_null
		// @0C: putstatic java.lang.String game.C_100335_il.field_107370_c
		// @0F: aconst_null
		// @10: putstatic game.C_100098_h game.C_100335_il.field_107369_b
		// @13: aconst_null
		// @14: putstatic java.lang.String game.C_100335_il.field_107371_a
		// @17: aconst_null
		// @18: putstatic java.lang.String game.C_100335_il.field_107366_g
		// @1B: aconst_null
		// @1C: putstatic java.lang.String[] game.C_100335_il.field_107373_h
		// @1F: aconst_null
		// @20: putstatic game.C_100202_qi game.C_100335_il.field_107368_e
		// @23: iload_0
		// @24: iconst_3
		// @25: if_icmpgt @2D
		// @28: bipush 109 (0x6D)
		// @2A: invokestatic game.C_100335_il.func_107360_a(int)void
		// @2D: goto @51
		// @30: astore_1
		// @31: aload_1
		// @32: new java.lang.StringBuilder
		// @35: dup
		// @36: invokespecial java.lang.StringBuilder.<init>()void
		// @39: getstatic java.lang.String[] game.C_100335_il.field_107372_z
		// @3C: iconst_4
		// @3D: aaload
		// @3E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @41: iload_0
		// @42: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @45: bipush 41 (0x29)
		// @47: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @50: athrow
		// @51: return
	}
	
	static final boolean func_107358_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush 67 (0x43)
		// @03: if_icmpge @11
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: putstatic java.lang.String game.C_100335_il.field_107370_c
		// @0D: goto @11
		// @10: athrow
		// @11: iconst_1
		// @12: invokestatic game.C_100254_pi.func_106444_a(int)boolean
		// @15: ifeq @2D
		// @18: bipush 8 (0x08)
		// @1A: getstatic int game.C_100249_pc.field_102333_I
		// @1D: iand
		// @1E: iconst_m1
		// @1F: ixor
		// @20: iconst_m1
		// @21: if_icmpne @2D
		// @24: goto @28
		// @27: athrow
		// @28: iconst_1
		// @29: goto @2E
		// @2C: athrow
		// @2D: iconst_0
		// @2E: ireturn
		// @2F: astore_1
		// @30: aload_1
		// @31: new java.lang.StringBuilder
		// @34: dup
		// @35: invokespecial java.lang.StringBuilder.<init>()void
		// @38: getstatic java.lang.String[] game.C_100335_il.field_107372_z
		// @3B: iconst_0
		// @3C: aaload
		// @3D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @40: iload_0
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 41 (0x29)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4F: athrow
	}
	
	static
	{
		// @00: iconst_5
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "\u001e,C\u000e-"
		// @08: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "\u001e,C\u000f-"
		// @13: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @16: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "\u001e,C\t-"
		// @1E: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @21: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @24: aastore
		// @25: dup
		// @26: iconst_3
		// @27: ldc "\u001e,C\n-"
		// @29: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @2C: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @2F: aastore
		// @30: dup
		// @31: iconst_4
		// @32: ldc "\u001e,C\u0008-"
		// @34: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @37: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @3A: aastore
		// @3B: putstatic java.lang.String[] game.C_100335_il.field_107372_z
		// @3E: ldc "\"3\u0008kq\u001f)\u001ekd\u001b4\u00089k\u00164\u0004=`W!\u001ek|\u00185\u001fkd\u0014#\u0002>k\u0003`\u0003*h\u0012"
		// @40: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @43: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @46: putstatic java.lang.String game.C_100335_il.field_107366_g
		// @49: ldc "$4\u0008.iW\u0013\u0008%q\u001e.\u0008'v"
		// @4B: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @4E: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @51: putstatic java.lang.String game.C_100335_il.field_107367_d
		// @54: ldc "42\u0008*q\u001e.\nk|\u00185\u001fkd\u0014#\u0002>k\u0003"
		// @56: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @59: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @5C: putstatic java.lang.String game.C_100335_il.field_107370_c
		// @5F: bipush 12 (0x0C)
		// @61: anewarray java.lang.String
		// @64: dup
		// @65: iconst_0
		// @66: ldc "\u0005%\u000e9p\u001e4"
		// @68: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @6B: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @6E: aastore
		// @6F: dup
		// @70: iconst_1
		// @71: ldc "\u0014!\t.q"
		// @73: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @76: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @79: aastore
		// @7A: dup
		// @7B: iconst_2
		// @7C: ldc "\u0012.\u001e\"b\u0019"
		// @7E: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @81: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @84: aastore
		// @85: dup
		// @86: iconst_3
		// @87: ldc "\u0014/\u0000&d\u0019$\u00089"
		// @89: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @8C: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @8F: aastore
		// @90: dup
		// @91: iconst_4
		// @92: ldc "\u0014!\u001d?d\u001e."
		// @94: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @97: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @9A: aastore
		// @9B: dup
		// @9C: iconst_5
		// @9D: ldc "\u001a!\u0007$w"
		// @9F: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @A2: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @A5: aastore
		// @A6: dup
		// @A7: bipush 6 (0x06)
		// @A9: ldc "\u0014/\u0001$k\u0012,"
		// @AB: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @AE: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @B1: aastore
		// @B2: dup
		// @B3: bipush 7 (0x07)
		// @B5: ldc "\u00152\u0004,d\u0013)\u00089"
		// @B7: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @BA: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @BD: aastore
		// @BE: dup
		// @BF: bipush 8 (0x08)
		// @C1: ldc "\u0010%\u0003.w\u0016,"
		// @C3: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @C6: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @C9: aastore
		// @CA: dup
		// @CB: bipush 9 (0x09)
		// @CD: ldc "\u0016$\u0000\"w\u0016,"
		// @CF: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @D2: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @D5: aastore
		// @D6: dup
		// @D7: bipush 10 (0x0A)
		// @D9: ldc "\u0011)\u0008'aW-\u000c9v\u001f!\u0001"
		// @DB: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @DE: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @E1: aastore
		// @E2: dup
		// @E3: bipush 11 (0x0B)
		// @E5: ldc "\u000e/\u00189%\u001a!\u0007.v\u00039"
		// @E7: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @EA: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @ED: aastore
		// @EE: putstatic java.lang.String[] game.C_100335_il.field_107373_h
		// @F1: ldc "0!\u0000.%86\u00089"
		// @F3: invokestatic game.C_100335_il.func_107362_z(java.lang.String)char[]
		// @F6: invokestatic game.C_100335_il.func_107361_z(char[])java.lang.String
		// @F9: putstatic java.lang.String game.C_100335_il.field_107371_a
		// @FC: return
	}
	
	private static char[] func_107362_z(String arg0)
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
	
	private static String func_107361_z(char[] arg0)
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
		// @30: bipush 119 (0x77)
		// @32: goto @45
		// @35: bipush 64 (0x40)
		// @37: goto @45
		// @3A: bipush 109 (0x6D)
		// @3C: goto @45
		// @3F: bipush 75 (0x4B)
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
