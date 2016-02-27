package game;

abstract class C_100338_jc
{
	static C_100302_ka[] field_105374_h;
	static C_100217_ao field_105369_a;
	static String field_105368_c;
	static int[] field_105372_j;
	static int field_105365_d;
	static int field_105363_f;
	static C_100302_ka field_105375_i;
	static int field_105367_b;
	static int field_105370_l;
	static int field_105371_m;
	static int field_105366_e;
	static int[] field_105364_g;
	static int field_105373_k;
	private static final String[] field_105376_z;
	
	static final boolean func_105360_a(int arg0)
	{
		// @00: getstatic boolean game.C_100230_of.field_106216_k
		// @03: ifeq @0A
		// @06: goto @0C
		// @09: athrow
		// @0A: iconst_0
		// @0B: ireturn
		// @0C: getstatic int game.C_100113_ek.field_104880_b
		// @0F: ifne @16
		// @12: goto @18
		// @15: athrow
		// @16: iconst_0
		// @17: ireturn
		// @18: iload_0
		// @19: iconst_1
		// @1A: if_icmpeq @27
		// @1D: bipush 95 (0x5F)
		// @1F: invokestatic game.C_100338_jc.func_105360_a(int)boolean
		// @22: pop
		// @23: goto @27
		// @26: athrow
		// @27: iconst_1
		// @28: ireturn
		// @29: astore_1
		// @2A: aload_1
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100338_jc.field_105376_z
		// @35: iconst_2
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: iload_0
		// @3B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E: bipush 41 (0x29)
		// @40: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @46: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @49: athrow
	}
	
	final int func_105362_a(long arg0, byte arg1)
	{
		// @00: aload_0
		// @01: bipush -23 (0xE9)
		// @03: invokevirtual game.C_100338_jc.func_105357_a(byte)long
		// @06: lstore #4
		// @08: ldc2_w -1
		// @0B: lload #4
		// @0D: ldc2_w -1
		// @10: lxor
		// @11: lcmp
		// @12: ifgt @19
		// @15: goto @20
		// @18: athrow
		// @19: lload #4
		// @1B: bipush -125 (0x83)
		// @1D: invokestatic game.C_100138_bo.func_100396_a(long, int)void
		// @20: iload_3
		// @21: bipush 79 (0x4F)
		// @23: if_icmpeq @31
		// @26: aconst_null
		// @27: checkcast java.lang.String
		// @2A: putstatic java.lang.String game.C_100338_jc.field_105368_c
		// @2D: goto @31
		// @30: athrow
		// @31: aload_0
		// @32: iload_3
		// @33: bipush -38 (0xDA)
		// @35: iadd
		// @36: lload_1
		// @37: invokevirtual game.C_100338_jc.func_105361_a(int, long)int
		// @3A: ireturn
		// @3B: astore #4
		// @3D: aload #4
		// @3F: new java.lang.StringBuilder
		// @42: dup
		// @43: invokespecial java.lang.StringBuilder.<init>()void
		// @46: getstatic java.lang.String[] game.C_100338_jc.field_105376_z
		// @49: iconst_0
		// @4A: aaload
		// @4B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4E: lload_1
		// @4F: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @52: bipush 44 (0x2C)
		// @54: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @57: iload_3
		// @58: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5B: bipush 41 (0x29)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @63: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @66: athrow
	}
	
	abstract long func_105357_a(byte arg0);
	
	abstract int func_105361_a(int arg0, long arg1);
	
	public static void func_105355_b(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100302_ka game.C_100338_jc.field_105375_i
		// @04: bipush 91 (0x5B)
		// @06: bipush -58 (0xC6)
		// @08: iload_0
		// @09: isub
		// @0A: bipush 34 (0x22)
		// @0C: idiv
		// @0D: idiv
		// @0E: istore_1
		// @0F: aconst_null
		// @10: putstatic game.C_100302_ka[] game.C_100338_jc.field_105374_h
		// @13: aconst_null
		// @14: putstatic game.C_100217_ao game.C_100338_jc.field_105369_a
		// @17: aconst_null
		// @18: putstatic int[] game.C_100338_jc.field_105372_j
		// @1B: aconst_null
		// @1C: putstatic java.lang.String game.C_100338_jc.field_105368_c
		// @1F: aconst_null
		// @20: putstatic int[] game.C_100338_jc.field_105364_g
		// @23: goto @47
		// @26: astore_1
		// @27: aload_1
		// @28: new java.lang.StringBuilder
		// @2B: dup
		// @2C: invokespecial java.lang.StringBuilder.<init>()void
		// @2F: getstatic java.lang.String[] game.C_100338_jc.field_105376_z
		// @32: iconst_1
		// @33: aaload
		// @34: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @37: iload_0
		// @38: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3B: bipush 41 (0x29)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @43: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @46: athrow
		// @47: return
	}
	
	abstract void func_105356_c(int arg0);
	
	static
	{
		// @00: iconst_3
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "I\u000fo\u001fj"
		// @08: invokestatic game.C_100338_jc.func_105359_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100338_jc.func_105358_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "I\u000fo\u001ej"
		// @13: invokestatic game.C_100338_jc.func_105359_z(java.lang.String)char[]
		// @16: invokestatic game.C_100338_jc.func_105358_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "I\u000fo\u001cj"
		// @1E: invokestatic game.C_100338_jc.func_105359_z(java.lang.String)char[]
		// @21: invokestatic game.C_100338_jc.func_105358_z(char[])java.lang.String
		// @24: aastore
		// @25: putstatic java.lang.String[] game.C_100338_jc.field_105376_z
		// @28: ldc "n\u0003%/.FL26-W\u001f{z~\u0006\\\u007f"
		// @2A: invokestatic game.C_100338_jc.func_105359_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100338_jc.func_105358_z(char[])java.lang.String
		// @30: putstatic java.lang.String game.C_100338_jc.field_105368_c
		// @33: sipush 128 (0x0080)
		// @36: newarray int[]
		// @38: putstatic int[] game.C_100338_jc.field_105372_j
		// @3B: bipush 62 (0x3E)
		// @3D: putstatic int game.C_100338_jc.field_105363_f
		// @40: new game.C_100217_ao
		// @43: dup
		// @44: bipush 14 (0x0E)
		// @46: iconst_0
		// @47: iconst_4
		// @48: iconst_1
		// @49: invokespecial game.C_100217_ao.<init>(int, int, int, int)void
		// @4C: putstatic game.C_100217_ao game.C_100338_jc.field_105369_a
		// @4F: iconst_0
		// @50: putstatic int game.C_100338_jc.field_105370_l
		// @53: bipush 32 (0x20)
		// @55: bipush 50 (0x32)
		// @57: invokestatic game.C_100084_ug.func_104477_a(int, int)void
		// @5A: return
	}
	
	private static char[] func_105359_z(String arg0)
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
		// @0E: bipush 66 (0x42)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105358_z(char[] arg0)
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
		// @30: bipush 35 (0x23)
		// @32: goto @46
		// @35: bipush 108 (0x6C)
		// @37: goto @46
		// @3A: bipush 65 (0x41)
		// @3C: goto @46
		// @3F: bipush 90 (0x5A)
		// @41: goto @46
		// @44: bipush 66 (0x42)
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
