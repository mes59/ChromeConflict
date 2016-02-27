package game;

final class C_100094_j
{
	static C_100202_qi field_104551_a;
	static String field_104547_d;
	static C_100153_be[] field_104554_h;
	static int field_104549_b;
	static C_100153_be[] field_104548_e;
	static int field_104546_g;
	static String field_104550_c;
	static String[] field_104555_i;
	static C_100037_wb field_104545_f;
	static boolean field_104552_j;
	private static final String[] field_104553_z;
	
	static final void func_104544_a(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: iconst_m1
		// @02: if_icmpeq @10
		// @05: aconst_null
		// @06: checkcast game.C_100202_qi
		// @09: putstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @0C: goto @10
		// @0F: athrow
		// @10: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @13: astore_2
		// @14: aload_2
		// @15: iload_0
		// @16: bipush 126 (0x7E)
		// @18: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @1B: aload_2
		// @1C: iload_1
		// @1D: sipush -7839 (0xE161)
		// @20: ixor
		// @21: iconst_2
		// @22: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @25: aload_2
		// @26: sipush 7838 (0x1E9E)
		// @29: iconst_4
		// @2A: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @2D: aload_2
		// @2E: iload_1
		// @2F: sipush -7839 (0xE161)
		// @32: ixor
		// @33: bipush -100 (0x9C)
		// @35: invokestatic game.C_100095_fe.func_103375_f(byte)int
		// @38: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @3B: goto @68
		// @3E: astore_2
		// @3F: aload_2
		// @40: new java.lang.StringBuilder
		// @43: dup
		// @44: invokespecial java.lang.StringBuilder.<init>()void
		// @47: getstatic java.lang.String[] game.C_100094_j.field_104553_z
		// @4A: iconst_0
		// @4B: aaload
		// @4C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4F: iload_0
		// @50: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @53: bipush 44 (0x2C)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: iload_1
		// @59: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5C: bipush 41 (0x29)
		// @5E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @61: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @64: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @67: athrow
		// @68: return
	}
	
	public static void func_104543_a(boolean arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100094_j.field_104547_d
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100094_j.field_104550_c
		// @08: aconst_null
		// @09: putstatic game.C_100037_wb game.C_100094_j.field_104545_f
		// @0C: aconst_null
		// @0D: putstatic java.lang.String[] game.C_100094_j.field_104555_i
		// @10: aconst_null
		// @11: putstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @14: aconst_null
		// @15: putstatic game.C_100153_be[] game.C_100094_j.field_104548_e
		// @18: aconst_null
		// @19: putstatic game.C_100153_be[] game.C_100094_j.field_104554_h
		// @1C: iload_0
		// @1D: ifeq @27
		// @20: aconst_null
		// @21: checkcast java.lang.String
		// @24: putstatic java.lang.String game.C_100094_j.field_104547_d
		// @27: goto @4B
		// @2A: astore_1
		// @2B: aload_1
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100094_j.field_104553_z
		// @36: iconst_1
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_0
		// @3C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @3F: bipush 41 (0x29)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @47: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4A: athrow
		// @4B: return
	}
	
	static
	{
		// @00: iconst_2
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "i<\u000fP"
		// @08: invokestatic game.C_100094_j.func_104542_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100094_j.func_104541_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "i<\u000cP"
		// @13: invokestatic game.C_100094_j.func_104542_z(java.lang.String)char[]
		// @16: invokestatic game.C_100094_j.func_104541_z(char[])java.lang.String
		// @19: aastore
		// @1A: putstatic java.lang.String[] game.C_100094_j.field_104553_z
		// @1D: iconst_m1
		// @1E: putstatic int game.C_100094_j.field_104549_b
		// @21: ldc "?7~F2?7\u007fF<n"
		// @23: invokestatic game.C_100094_j.func_104542_z(java.lang.String)char[]
		// @26: invokestatic game.C_100094_j.func_104541_z(char[])java.lang.String
		// @29: putstatic java.lang.String game.C_100094_j.field_104547_d
		// @2C: ldc "V|/\u001apf2:\u0017<`} \u0016y`fn\u000cs#f&\u001d<gs:\u0019<pw<\u000eyq<n(pfs=\u001d<`z+\u001bw#s \u0001<e{<\u001dkb~\"Xelgn\u0019nf2;\u000bumu`"
		// @2E: invokestatic game.C_100094_j.func_104542_z(java.lang.String)char[]
		// @31: invokestatic game.C_100094_j.func_104541_z(char[])java.lang.String
		// @34: putstatic java.lang.String game.C_100094_j.field_104550_c
		// @37: iconst_0
		// @38: putstatic int game.C_100094_j.field_104546_g
		// @3B: iconst_0
		// @3C: putstatic boolean game.C_100094_j.field_104552_j
		// @3F: iconst_3
		// @40: anewarray java.lang.String
		// @43: dup
		// @44: iconst_0
		// @45: ldc "SG\u001c(PF2\u001a=]N"
		// @47: invokestatic game.C_100094_j.func_104542_z(java.lang.String)char[]
		// @4A: invokestatic game.C_100094_j.func_104541_z(char[])java.lang.String
		// @4D: aastore
		// @4E: dup
		// @4F: iconst_1
		// @50: ldc "L@\u000f6[F2\u001a=]N"
		// @52: invokestatic game.C_100094_j.func_104542_z(java.lang.String)char[]
		// @55: invokestatic game.C_100094_j.func_104541_z(char[])java.lang.String
		// @58: aastore
		// @59: dup
		// @5A: iconst_2
		// @5B: ldc "D@\u000b=R#F\u000b9Q"
		// @5D: invokestatic game.C_100094_j.func_104542_z(java.lang.String)char[]
		// @60: invokestatic game.C_100094_j.func_104541_z(char[])java.lang.String
		// @63: aastore
		// @64: putstatic java.lang.String[] game.C_100094_j.field_104555_i
		// @67: return
	}
	
	private static char[] func_104542_z(String arg0)
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
		// @0E: bipush 28 (0x1C)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104541_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @34, for 2: @39, for 3: @3E
		// @30: iconst_3
		// @31: goto @45
		// @34: bipush 18 (0x12)
		// @36: goto @45
		// @39: bipush 78 (0x4E)
		// @3B: goto @45
		// @3E: bipush 120 (0x78)
		// @40: goto @45
		// @43: bipush 28 (0x1C)
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
