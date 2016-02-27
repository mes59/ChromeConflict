package game;

final class C_100223_ab
{
	static int[] field_106099_d;
	static int field_106100_b;
	static C_100268_mk field_106102_a;
	static C_100037_wb field_106101_c;
	private static final String[] field_106103_z;
	
	static final int func_106098_a(int arg0, int arg1)
	{
		// @00: iload_0
		// @01: sipush 2048 (0x0800)
		// @04: if_icmpeq @12
		// @07: aconst_null
		// @08: checkcast int[]
		// @0B: putstatic int[] game.C_100223_ab.field_106099_d
		// @0E: goto @12
		// @11: athrow
		// @12: iload_1
		// @13: ifge @39
		// @16: ldc -65536 (0xffff0000)
		// @18: iload_1
		// @19: if_icmpgt @2B
		// @1C: goto @20
		// @1F: athrow
		// @20: getstatic int[] game.C_100311_le.field_104722_y
		// @23: iload_1
		// @24: ineg
		// @25: ldc -1810265179 (0x94198ba5)
		// @27: ishr
		// @28: iaload
		// @29: ineg
		// @2A: ireturn
		// @2B: getstatic int[] game.C_100311_le.field_104722_y
		// @2E: ldc 134217728 (0x8000000)
		// @30: iload_1
		// @31: ineg
		// @32: idiv
		// @33: iaload
		// @34: sipush 2048 (0x0800)
		// @37: isub
		// @38: ireturn
		// @39: ldc 65536 (0x10000)
		// @3B: iload_1
		// @3C: if_icmpge @4D
		// @3F: sipush 2048 (0x0800)
		// @42: getstatic int[] game.C_100311_le.field_104722_y
		// @45: ldc 134217728 (0x8000000)
		// @47: iload_1
		// @48: idiv
		// @49: iaload
		// @4A: ineg
		// @4B: iadd
		// @4C: ireturn
		// @4D: getstatic int[] game.C_100311_le.field_104722_y
		// @50: iload_1
		// @51: ldc 1741228261 (0x67c908e5)
		// @53: ishr
		// @54: iaload
		// @55: ireturn
		// @56: astore_2
		// @57: aload_2
		// @58: new java.lang.StringBuilder
		// @5B: dup
		// @5C: invokespecial java.lang.StringBuilder.<init>()void
		// @5F: getstatic java.lang.String[] game.C_100223_ab.field_106103_z
		// @62: iconst_0
		// @63: aaload
		// @64: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @67: iload_0
		// @68: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6B: bipush 44 (0x2C)
		// @6D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @70: iload_1
		// @71: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @74: bipush 41 (0x29)
		// @76: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @79: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7F: athrow
	}
	
	static final C_100302_ka func_106095_b(byte arg0)
	{
		// @00: iload_0
		// @01: bipush -21 (0xEB)
		// @03: if_icmpeq @11
		// @06: aconst_null
		// @07: checkcast int[]
		// @0A: putstatic int[] game.C_100223_ab.field_106099_d
		// @0D: goto @11
		// @10: athrow
		// @11: getstatic game.C_100115_ej game.C_100009_fg.field_103654_g
		// @14: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @17: areturn
		// @18: astore_1
		// @19: aload_1
		// @1A: new java.lang.StringBuilder
		// @1D: dup
		// @1E: invokespecial java.lang.StringBuilder.<init>()void
		// @21: getstatic java.lang.String[] game.C_100223_ab.field_106103_z
		// @24: iconst_1
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
	
	static final void func_106093_a(byte arg0)
	{
		// @00: iconst_4
		// @01: iload_0
		// @02: bipush 20 (0x14)
		// @04: isub
		// @05: bipush 54 (0x36)
		// @07: idiv
		// @08: irem
		// @09: istore_1
		// @0A: bipush 71 (0x47)
		// @0C: invokestatic game.C_100001_ge.func_100556_a(byte)void
		// @0F: goto @33
		// @12: astore_1
		// @13: aload_1
		// @14: new java.lang.StringBuilder
		// @17: dup
		// @18: invokespecial java.lang.StringBuilder.<init>()void
		// @1B: getstatic java.lang.String[] game.C_100223_ab.field_106103_z
		// @1E: iconst_2
		// @1F: aaload
		// @20: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23: iload_0
		// @24: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @27: bipush 41 (0x29)
		// @29: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @32: athrow
		// @33: return
	}
	
	static final int func_106097_a(boolean arg0, String arg1, int arg2)
	{
		// @00: iload_2
		// @01: sipush 17493 (0x4455)
		// @04: if_icmpeq @11
		// @07: bipush -12 (0xF4)
		// @09: invokestatic game.C_100223_ab.func_106095_b(byte)game.C_100302_ka
		// @0C: pop
		// @0D: goto @11
		// @10: athrow
		// @11: iload_0
		// @12: ifne @1D
		// @15: getstatic game.C_100112_r game.C_100060_di.field_104269_d
		// @18: aload_1
		// @19: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @1C: ireturn
		// @1D: getstatic game.C_100112_r game.C_100045_vj.field_100609_m
		// @20: aload_1
		// @21: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @24: ireturn
		// @25: astore_3
		// @26: aload_3
		// @27: new java.lang.StringBuilder
		// @2A: dup
		// @2B: invokespecial java.lang.StringBuilder.<init>()void
		// @2E: getstatic java.lang.String[] game.C_100223_ab.field_106103_z
		// @31: iconst_4
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: iload_0
		// @37: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @3A: bipush 44 (0x2C)
		// @3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F: aload_1
		// @40: ifnull @4C
		// @43: getstatic java.lang.String[] game.C_100223_ab.field_106103_z
		// @46: iconst_3
		// @47: aaload
		// @48: goto @51
		// @4B: athrow
		// @4C: getstatic java.lang.String[] game.C_100223_ab.field_106103_z
		// @4F: iconst_5
		// @50: aaload
		// @51: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @54: bipush 44 (0x2C)
		// @56: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @59: iload_2
		// @5A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5D: bipush 41 (0x29)
		// @5F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @62: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @65: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @68: athrow
	}
	
	public static void func_106096_c(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100268_mk game.C_100223_ab.field_106102_a
		// @04: aconst_null
		// @05: putstatic int[] game.C_100223_ab.field_106099_d
		// @08: aconst_null
		// @09: putstatic game.C_100037_wb game.C_100223_ab.field_106101_c
		// @0C: iload_0
		// @0D: bipush 104 (0x68)
		// @0F: if_icmpgt @17
		// @12: bipush 17 (0x11)
		// @14: invokestatic game.C_100223_ab.func_106096_c(byte)void
		// @17: goto @3C
		// @1A: astore_1
		// @1B: aload_1
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String[] game.C_100223_ab.field_106103_z
		// @26: bipush 6 (0x06)
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
	
	static
	{
		// @00: bipush 7 (0x07)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "=|)\u0000h"
		// @09: invokestatic game.C_100223_ab.func_106094_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100223_ab.func_106092_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "=|)\u0001h"
		// @14: invokestatic game.C_100223_ab.func_106094_z(java.lang.String)char[]
		// @17: invokestatic game.C_100223_ab.func_106092_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "=|)\u0007h"
		// @1F: invokestatic game.C_100223_ab.func_106094_z(java.lang.String)char[]
		// @22: invokestatic game.C_100223_ab.func_106092_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "'0)l="
		// @2A: invokestatic game.C_100223_ab.func_106094_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100223_ab.func_106092_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "=|)\u0006h"
		// @35: invokestatic game.C_100223_ab.func_106094_z(java.lang.String)char[]
		// @38: invokestatic game.C_100223_ab.func_106092_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "2kk."
		// @40: invokestatic game.C_100223_ab.func_106094_z(java.lang.String)char[]
		// @43: invokestatic game.C_100223_ab.func_106092_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "=|)\u0003h"
		// @4C: invokestatic game.C_100223_ab.func_106094_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100223_ab.func_106092_z(char[])java.lang.String
		// @52: aastore
		// @53: putstatic java.lang.String[] game.C_100223_ab.field_106103_z
		// @56: iconst_0
		// @57: putstatic int game.C_100223_ab.field_106100_b
		// @5A: sipush 8192 (0x2000)
		// @5D: newarray int[]
		// @5F: putstatic int[] game.C_100223_ab.field_106099_d
		// @62: new game.C_100268_mk
		// @65: dup
		// @66: invokespecial game.C_100268_mk.<init>()void
		// @69: putstatic game.C_100268_mk game.C_100223_ab.field_106102_a
		// @6C: return
	}
	
	private static char[] func_106094_z(String arg0)
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
		// @0E: bipush 64 (0x40)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_106092_z(char[] arg0)
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
		// @30: bipush 92 (0x5C)
		// @32: goto @46
		// @35: bipush 30 (0x1E)
		// @37: goto @46
		// @3A: bipush 7 (0x07)
		// @3C: goto @46
		// @3F: bipush 66 (0x42)
		// @41: goto @46
		// @44: bipush 64 (0x40)
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
