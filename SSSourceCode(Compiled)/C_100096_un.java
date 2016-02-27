package game;

final class C_100096_un
{
	int field_104564_e;
	static String field_104562_g;
	boolean field_104565_b;
	static int field_104563_d;
	static int field_104566_c;
	static int field_104570_h;
	static int field_104561_f;
	String field_104567_a;
	String[] field_104571_i;
	boolean field_104568_j;
	private static final String[] field_104569_z;
	
	static final String func_104560_a(String arg0, boolean arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: aconst_null
		// @06: aload_0
		// @07: if_acmpeq @12
		// @0A: aload_0
		// @0B: invokevirtual java.lang.String.length()int
		// @0E: goto @13
		// @11: athrow
		// @12: iconst_0
		// @13: istore_2
		// @14: iconst_0
		// @15: iload_2
		// @16: if_icmpne @1B
		// @19: aload_0
		// @1A: areturn
		// @1B: iload_2
		// @1C: newarray char[]
		// @1E: astore_3
		// @1F: iconst_0
		// @20: istore #4
		// @22: iconst_0
		// @23: istore #5
		// @25: iload_1
		// @26: ifeq @32
		// @29: bipush -69 (0xBB)
		// @2B: putstatic int game.C_100096_un.field_104566_c
		// @2E: goto @32
		// @31: athrow
		// @32: iload_2
		// @33: iload #5
		// @35: if_icmple @99
		// @38: aload_3
		// @39: iload #5
		// @3B: aload_0
		// @3C: iload #5
		// @3E: invokevirtual java.lang.String.charAt(int)char
		// @41: castore
		// @42: bipush 60 (0x3C)
		// @44: aload_3
		// @45: iload #5
		// @47: caload
		// @48: if_icmpne @57
		// @4B: iinc #4 +1
		// @4E: iload #6
		// @50: ifeq @91
		// @53: goto @57
		// @56: athrow
		// @57: aload_3
		// @58: iload #5
		// @5A: caload
		// @5B: bipush 62 (0x3E)
		// @5D: if_icmpne @79
		// @60: goto @64
		// @63: athrow
		// @64: iload #4
		// @66: ifle @79
		// @69: goto @6D
		// @6C: athrow
		// @6D: iinc #4 +255
		// @70: iload #6
		// @72: ifeq @91
		// @75: goto @79
		// @78: athrow
		// @79: iload #4
		// @7B: ifne @91
		// @7E: goto @82
		// @81: athrow
		// @82: aload_3
		// @83: iload #5
		// @85: aload_3
		// @86: iload #5
		// @88: caload
		// @89: invokestatic java.lang.Character.toUpperCase(char)char
		// @8C: castore
		// @8D: goto @91
		// @90: athrow
		// @91: iinc #5 +1
		// @94: iload #6
		// @96: ifeq @32
		// @99: new java.lang.String
		// @9C: dup
		// @9D: aload_3
		// @9E: invokespecial java.lang.String.<init>(char[])void
		// @A1: areturn
		// @A2: astore_2
		// @A3: aload_2
		// @A4: new java.lang.StringBuilder
		// @A7: dup
		// @A8: invokespecial java.lang.StringBuilder.<init>()void
		// @AB: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @AE: iconst_0
		// @AF: aaload
		// @B0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B3: aload_0
		// @B4: ifnull @C0
		// @B7: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @BA: iconst_1
		// @BB: aaload
		// @BC: goto @C5
		// @BF: athrow
		// @C0: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @C3: iconst_2
		// @C4: aaload
		// @C5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C8: bipush 44 (0x2C)
		// @CA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CD: iload_1
		// @CE: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @D1: bipush 41 (0x29)
		// @D3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D9: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @DC: athrow
	}
	
	static final void func_104559_a(String arg0, int arg1, long arg2, int arg3, int arg4, int[] arg5, String arg6, C_100302_ka arg7, C_100115_ej arg8)
	{
		// @00: aload #9
		// @02: putstatic game.C_100115_ej game.C_100346_ja.field_103486_m
		// @05: bipush 97 (0x61)
		// @07: iload #4
		// @09: bipush -8 (0xF8)
		// @0B: isub
		// @0C: bipush 53 (0x35)
		// @0E: idiv
		// @0F: irem
		// @10: istore #10
		// @12: new game.C_100022_hf
		// @15: dup
		// @16: aload #8
		// @18: lload_2
		// @19: aload #7
		// @1B: aload_0
		// @1C: iload #5
		// @1E: iload_1
		// @1F: aload #6
		// @21: invokespecial game.C_100022_hf.<init>(game.C_100302_ka, long, java.lang.String, java.lang.String, int, int, int[])void
		// @24: putstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @27: goto @F0
		// @2A: astore #10
		// @2C: aload #10
		// @2E: new java.lang.StringBuilder
		// @31: dup
		// @32: invokespecial java.lang.StringBuilder.<init>()void
		// @35: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @38: iconst_5
		// @39: aaload
		// @3A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3D: aload_0
		// @3E: ifnull @4A
		// @41: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @44: iconst_1
		// @45: aaload
		// @46: goto @4F
		// @49: athrow
		// @4A: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @4D: iconst_2
		// @4E: aaload
		// @4F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @52: bipush 44 (0x2C)
		// @54: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @57: iload_1
		// @58: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5B: bipush 44 (0x2C)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: lload_2
		// @61: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @64: bipush 44 (0x2C)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: iload #4
		// @6B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6E: bipush 44 (0x2C)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: iload #5
		// @75: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @78: bipush 44 (0x2C)
		// @7A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7D: aload #6
		// @7F: ifnull @8B
		// @82: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @85: iconst_1
		// @86: aaload
		// @87: goto @90
		// @8A: athrow
		// @8B: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @8E: iconst_2
		// @8F: aaload
		// @90: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @93: bipush 44 (0x2C)
		// @95: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @98: aload #7
		// @9A: ifnull @A6
		// @9D: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @A0: iconst_1
		// @A1: aaload
		// @A2: goto @AB
		// @A5: athrow
		// @A6: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @A9: iconst_2
		// @AA: aaload
		// @AB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AE: bipush 44 (0x2C)
		// @B0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B3: aload #8
		// @B5: ifnull @C1
		// @B8: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @BB: iconst_1
		// @BC: aaload
		// @BD: goto @C6
		// @C0: athrow
		// @C1: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @C4: iconst_2
		// @C5: aaload
		// @C6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C9: bipush 44 (0x2C)
		// @CB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CE: aload #9
		// @D0: ifnull @DC
		// @D3: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @D6: iconst_1
		// @D7: aaload
		// @D8: goto @E1
		// @DB: athrow
		// @DC: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @DF: iconst_2
		// @E0: aaload
		// @E1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @E4: bipush 41 (0x29)
		// @E6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @EC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @EF: athrow
		// @F0: return
	}
	
	public static void func_104557_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush -101 (0x9B)
		// @03: if_icmplt @13
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: iconst_0
		// @0B: invokestatic game.C_100096_un.func_104560_a(java.lang.String, boolean)java.lang.String
		// @0E: pop
		// @0F: goto @13
		// @12: athrow
		// @13: aconst_null
		// @14: putstatic java.lang.String game.C_100096_un.field_104562_g
		// @17: goto @3B
		// @1A: astore_1
		// @1B: aload_1
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @26: iconst_3
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: iload_0
		// @2C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F: bipush 41 (0x29)
		// @31: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @37: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3A: athrow
		// @3B: return
	}
	
	C_100096_un(boolean arg0)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iload_1
		// @06: putfield boolean game.C_100096_un.field_104565_b
		// @09: goto @2D
		// @0C: astore_2
		// @0D: aload_2
		// @0E: new java.lang.StringBuilder
		// @11: dup
		// @12: invokespecial java.lang.StringBuilder.<init>()void
		// @15: getstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @18: iconst_4
		// @19: aaload
		// @1A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D: iload_1
		// @1E: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @21: bipush 41 (0x29)
		// @23: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @26: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @29: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2C: athrow
		// @2D: return
	}
	
	static
	{
		// @00: bipush 6 (0x06)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "HL\u001e\u000fT"
		// @09: invokestatic game.C_100096_un.func_104558_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100096_un.func_104556_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "F\u000c\u001eb\u0001"
		// @14: invokestatic game.C_100096_un.func_104558_z(java.lang.String)char[]
		// @17: invokestatic game.C_100096_un.func_104556_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "SW\\ "
		// @1F: invokestatic game.C_100096_un.func_104558_z(java.lang.String)char[]
		// @22: invokestatic game.C_100096_un.func_104556_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "HL\u001e\u000eT"
		// @2A: invokestatic game.C_100096_un.func_104558_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100096_un.func_104556_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "HL\u001ep\u0015SKDrT"
		// @35: invokestatic game.C_100096_un.func_104558_z(java.lang.String)char[]
		// @38: invokestatic game.C_100096_un.func_104556_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "HL\u001e\rT"
		// @40: invokestatic game.C_100096_un.func_104558_z(java.lang.String)char[]
		// @43: invokestatic game.C_100096_un.func_104556_z(char[])java.lang.String
		// @46: aastore
		// @47: putstatic java.lang.String[] game.C_100096_un.field_104569_z
		// @4A: bipush 100 (0x64)
		// @4C: putstatic int game.C_100096_un.field_104570_h
		// @4F: ldc "oG]#\nX\u0002V>\u0015XLT"
		// @51: invokestatic game.C_100096_un.func_104558_z(java.lang.String)char[]
		// @54: invokestatic game.C_100096_un.func_104556_z(char[])java.lang.String
		// @57: putstatic java.lang.String game.C_100096_un.field_104562_g
		// @5A: return
	}
	
	private static char[] func_104558_z(String arg0)
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
		// @0E: bipush 124 (0x7C)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104556_z(char[] arg0)
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
		// @30: bipush 61 (0x3D)
		// @32: goto @46
		// @35: bipush 34 (0x22)
		// @37: goto @46
		// @3A: bipush 48 (0x30)
		// @3C: goto @46
		// @3F: bipush 76 (0x4C)
		// @41: goto @46
		// @44: bipush 124 (0x7C)
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
