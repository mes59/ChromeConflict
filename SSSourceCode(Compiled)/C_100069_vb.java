package game;

final class C_100069_vb
{
	static String field_104359_c;
	static String field_104354_f;
	static int[] field_104360_a;
	static String field_104358_b;
	static int field_104357_e;
	static boolean field_104355_g;
	static boolean field_104356_d;
	private static final String[] field_104361_z;
	
	public static void func_104351_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100069_vb.field_104354_f
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100069_vb.field_104359_c
		// @08: aconst_null
		// @09: putstatic int[] game.C_100069_vb.field_104360_a
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100069_vb.field_104358_b
		// @10: iload_0
		// @11: sipush 13046 (0x32F6)
		// @14: if_icmpeq @1D
		// @17: bipush 121 (0x79)
		// @19: invokestatic game.C_100069_vb.func_104350_a(byte)boolean
		// @1C: pop
		// @1D: goto @41
		// @20: astore_1
		// @21: aload_1
		// @22: new java.lang.StringBuilder
		// @25: dup
		// @26: invokespecial java.lang.StringBuilder.<init>()void
		// @29: getstatic java.lang.String[] game.C_100069_vb.field_104361_z
		// @2C: iconst_0
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
	
	static final boolean func_104350_a(byte arg0)
	{
		// @00: bipush -12 (0xF4)
		// @02: iload_0
		// @03: bipush -28 (0xE4)
		// @05: isub
		// @06: bipush 56 (0x38)
		// @08: idiv
		// @09: irem
		// @0A: istore_1
		// @0B: iconst_1
		// @0C: ireturn
		// @0D: astore_1
		// @0E: aload_1
		// @0F: new java.lang.StringBuilder
		// @12: dup
		// @13: invokespecial java.lang.StringBuilder.<init>()void
		// @16: getstatic java.lang.String[] game.C_100069_vb.field_104361_z
		// @19: iconst_1
		// @1A: aaload
		// @1B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1E: iload_0
		// @1F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @22: bipush 41 (0x29)
		// @24: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @27: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2D: athrow
	}
	
	static
	{
		// @00: iconst_2
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "W\u0012_TF"
		// @08: invokestatic game.C_100069_vb.func_104353_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100069_vb.func_104352_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "W\u0012_WF"
		// @13: invokestatic game.C_100069_vb.func_104353_z(java.lang.String)char[]
		// @16: invokestatic game.C_100069_vb.func_104352_z(char[])java.lang.String
		// @19: aastore
		// @1A: putstatic java.lang.String[] game.C_100069_vb.field_104361_z
		// @1D: ldc "r\u0018\u001eaN@\u001c\u001d6\u0002N\u0012\u0013oNB\u0018\u0010b"
		// @1F: invokestatic game.C_100069_vb.func_104353_z(java.lang.String)char[]
		// @22: invokestatic game.C_100069_vb.func_104352_z(char[])java.lang.String
		// @25: putstatic java.lang.String game.C_100069_vb.field_104359_c
		// @28: aconst_null
		// @29: putstatic java.lang.String game.C_100069_vb.field_104358_b
		// @2C: iconst_4
		// @2D: newarray int[]
		// @2F: putstatic int[] game.C_100069_vb.field_104360_a
		// @32: ldc "\u001dUA(NH\u0003Qx\u0001UP\u001exNX\u001f\u0004dNH\u0017\u001fy\u001cDP\u001d\u007f\u001dU^"
		// @34: invokestatic game.C_100069_vb.func_104353_z(java.lang.String)char[]
		// @37: invokestatic game.C_100069_vb.func_104352_z(char[])java.lang.String
		// @3A: putstatic java.lang.String game.C_100069_vb.field_104354_f
		// @3D: iconst_0
		// @3E: putstatic boolean game.C_100069_vb.field_104355_g
		// @41: iconst_0
		// @42: putstatic boolean game.C_100069_vb.field_104356_d
		// @45: return
	}
	
	private static char[] func_104353_z(String arg0)
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
		// @0E: bipush 110 (0x6E)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104352_z(char[] arg0)
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
		// @30: bipush 33 (0x21)
		// @32: goto @46
		// @35: bipush 112 (0x70)
		// @37: goto @46
		// @3A: bipush 113 (0x71)
		// @3C: goto @46
		// @3F: bipush 22 (0x16)
		// @41: goto @46
		// @44: bipush 110 (0x6E)
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
