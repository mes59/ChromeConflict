package game;

final class C_100097_k
{
	static C_100037_wb[] field_104584_a;
	static int field_104581_e;
	static int field_104582_b;
	static String field_104583_c;
	static String field_104579_g;
	static String field_104580_d;
	static C_100302_ka field_104578_f;
	private static final String[] field_104585_z;
	
	static final void func_104574_a(C_100037_wb arg0, byte arg1)
	{
		// @00: iload_1
		// @01: bipush 72 (0x48)
		// @03: if_icmpeq @07
		// @06: return
		// @07: aload_0
		// @08: putstatic game.C_100037_wb game.C_100104_v.field_104696_l
		// @0B: goto @49
		// @0E: astore_2
		// @0F: aload_2
		// @10: new java.lang.StringBuilder
		// @13: dup
		// @14: invokespecial java.lang.StringBuilder.<init>()void
		// @17: getstatic java.lang.String[] game.C_100097_k.field_104585_z
		// @1A: iconst_4
		// @1B: aaload
		// @1C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1F: aload_0
		// @20: ifnull @2C
		// @23: getstatic java.lang.String[] game.C_100097_k.field_104585_z
		// @26: iconst_1
		// @27: aaload
		// @28: goto @31
		// @2B: athrow
		// @2C: getstatic java.lang.String[] game.C_100097_k.field_104585_z
		// @2F: iconst_2
		// @30: aaload
		// @31: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @34: bipush 44 (0x2C)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: iload_1
		// @3A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3D: bipush 41 (0x29)
		// @3F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @42: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @45: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @48: athrow
		// @49: return
	}
	
	static final boolean func_104572_a(int arg0, int[] arg1, int arg2)
	{
		// @00: iload_2
		// @01: bipush -93 (0xA3)
		// @03: if_icmplt @08
		// @06: iconst_1
		// @07: ireturn
		// @08: aload_1
		// @09: iload_0
		// @0A: ldc -437603643 (0xe5eab2c5)
		// @0C: ishr
		// @0D: iaload
		// @0E: iconst_1
		// @0F: bipush 31 (0x1F)
		// @11: iload_0
		// @12: iand
		// @13: ishl
		// @14: iand
		// @15: iconst_m1
		// @16: ixor
		// @17: iconst_m1
		// @18: if_icmpeq @20
		// @1B: iconst_1
		// @1C: goto @21
		// @1F: athrow
		// @20: iconst_0
		// @21: ireturn
		// @22: astore_3
		// @23: aload_3
		// @24: new java.lang.StringBuilder
		// @27: dup
		// @28: invokespecial java.lang.StringBuilder.<init>()void
		// @2B: getstatic java.lang.String[] game.C_100097_k.field_104585_z
		// @2E: iconst_3
		// @2F: aaload
		// @30: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @33: iload_0
		// @34: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @37: bipush 44 (0x2C)
		// @39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C: aload_1
		// @3D: ifnull @49
		// @40: getstatic java.lang.String[] game.C_100097_k.field_104585_z
		// @43: iconst_1
		// @44: aaload
		// @45: goto @4E
		// @48: athrow
		// @49: getstatic java.lang.String[] game.C_100097_k.field_104585_z
		// @4C: iconst_2
		// @4D: aaload
		// @4E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @51: bipush 44 (0x2C)
		// @53: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56: iload_2
		// @57: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5A: bipush 41 (0x29)
		// @5C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @62: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @65: athrow
	}
	
	public static void func_104573_b(int arg0)
	{
		// @00: iload_0
		// @01: sipush -18973 (0xB5E3)
		// @04: if_icmpeq @12
		// @07: aconst_null
		// @08: checkcast game.C_100037_wb[]
		// @0B: putstatic game.C_100037_wb[] game.C_100097_k.field_104584_a
		// @0E: goto @12
		// @11: athrow
		// @12: aconst_null
		// @13: putstatic game.C_100037_wb[] game.C_100097_k.field_104584_a
		// @16: aconst_null
		// @17: putstatic java.lang.String game.C_100097_k.field_104580_d
		// @1A: aconst_null
		// @1B: putstatic java.lang.String game.C_100097_k.field_104579_g
		// @1E: aconst_null
		// @1F: putstatic java.lang.String game.C_100097_k.field_104583_c
		// @22: aconst_null
		// @23: putstatic game.C_100302_ka game.C_100097_k.field_104578_f
		// @26: goto @4A
		// @29: astore_1
		// @2A: aload_1
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100097_k.field_104585_z
		// @35: iconst_5
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
	
	static final boolean func_104577_a(int arg0)
	{
		// @00: iload_0
		// @01: bipush -106 (0x96)
		// @03: if_icmplt @08
		// @06: iconst_0
		// @07: ireturn
		// @08: getstatic boolean game.C_100341_jd.field_102647_nb
		// @0B: ireturn
		// @0C: astore_1
		// @0D: aload_1
		// @0E: new java.lang.StringBuilder
		// @11: dup
		// @12: invokespecial java.lang.StringBuilder.<init>()void
		// @15: getstatic java.lang.String[] game.C_100097_k.field_104585_z
		// @18: iconst_0
		// @19: aaload
		// @1A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D: iload_0
		// @1E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @21: bipush 41 (0x29)
		// @23: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @26: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @29: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2C: athrow
	}
	
	static
	{
		// @00: bipush 6 (0x06)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\u0016_{\n"
		// @09: invokestatic game.C_100097_k.func_104576_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100097_k.func_104575_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u0006_\u0011\u000cV"
		// @14: invokestatic game.C_100097_k.func_104576_z(java.lang.String)char[]
		// @17: invokestatic game.C_100097_k.func_104575_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u0013\u0004SN"
		// @1F: invokestatic game.C_100097_k.func_104576_z(java.lang.String)char[]
		// @22: invokestatic game.C_100097_k.func_104575_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\u0016_|\n"
		// @2A: invokestatic game.C_100097_k.func_104576_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100097_k.func_104575_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\u0016_}\n"
		// @35: invokestatic game.C_100097_k.func_104576_z(java.lang.String)char[]
		// @38: invokestatic game.C_100097_k.func_104575_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\u0016_~\n"
		// @40: invokestatic game.C_100097_k.func_104576_z(java.lang.String)char[]
		// @43: invokestatic game.C_100097_k.func_104575_z(char[])java.lang.String
		// @46: aastore
		// @47: putstatic java.lang.String[] game.C_100097_k.field_104585_z
		// @4A: ldc "-\u001d^[N\u000f\u0002"
		// @4C: invokestatic game.C_100097_k.func_104576_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100097_k.func_104575_z(char[])java.lang.String
		// @52: putstatic java.lang.String game.C_100097_k.field_104583_c
		// @55: ldc "5\u0018[G\u000b\u0011\u001e]@R]\u0012WC_"
		// @57: invokestatic game.C_100097_k.func_104576_z(java.lang.String)char[]
		// @5A: invokestatic game.C_100097_k.func_104575_z(char[])java.lang.String
		// @5D: putstatic java.lang.String game.C_100097_k.field_104580_d
		// @60: iconst_0
		// @61: putstatic int game.C_100097_k.field_104581_e
		// @64: ldc ";\u0003ZG\u0006\u001b\u001eM\u000fJ\u0011\u001d"
		// @66: invokestatic game.C_100097_k.func_104576_z(java.lang.String)char[]
		// @69: invokestatic game.C_100097_k.func_104575_z(char[])java.lang.String
		// @6C: putstatic java.lang.String game.C_100097_k.field_104579_g
		// @6F: return
	}
	
	private static char[] func_104576_z(String arg0)
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
		// @0E: bipush 43 (0x2B)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104575_z(char[] arg0)
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
		// @30: bipush 125 (0x7D)
		// @32: goto @46
		// @35: bipush 113 (0x71)
		// @37: goto @46
		// @3A: bipush 63 (0x3F)
		// @3C: goto @46
		// @3F: bipush 34 (0x22)
		// @41: goto @46
		// @44: bipush 43 (0x2B)
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
