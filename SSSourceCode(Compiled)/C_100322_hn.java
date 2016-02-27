package game;

final class C_100322_hn
{
	static int field_107238_b;
	static String field_107235_f;
	static String field_107240_a;
	static String field_107237_e;
	static String field_107236_d;
	static String field_107239_c;
	private static final String[] field_107241_z;
	
	public static void func_107234_a(boolean arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100322_hn.field_107237_e
		// @04: iload_0
		// @05: iconst_1
		// @06: if_icmpeq @1B
		// @09: aconst_null
		// @0A: checkcast java.lang.String
		// @0D: bipush 47 (0x2F)
		// @0F: aconst_null
		// @10: checkcast java.lang.String
		// @13: invokestatic game.C_100322_hn.func_107231_a(java.lang.String, int, java.lang.String)boolean
		// @16: pop
		// @17: goto @1B
		// @1A: athrow
		// @1B: aconst_null
		// @1C: putstatic java.lang.String game.C_100322_hn.field_107236_d
		// @1F: aconst_null
		// @20: putstatic java.lang.String game.C_100322_hn.field_107239_c
		// @23: aconst_null
		// @24: putstatic java.lang.String game.C_100322_hn.field_107235_f
		// @27: aconst_null
		// @28: putstatic java.lang.String game.C_100322_hn.field_107240_a
		// @2B: goto @4F
		// @2E: astore_1
		// @2F: aload_1
		// @30: new java.lang.StringBuilder
		// @33: dup
		// @34: invokespecial java.lang.StringBuilder.<init>()void
		// @37: getstatic java.lang.String[] game.C_100322_hn.field_107241_z
		// @3A: iconst_0
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: iload_0
		// @40: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @43: bipush 41 (0x29)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4E: athrow
		// @4F: return
	}
	
	static final boolean func_107231_a(String arg0, int arg1, String arg2)
	{
		// @00: iload_1
		// @01: iconst_m1
		// @02: ixor
		// @03: aload_0
		// @04: invokestatic game.C_100155_dc.func_105342_a(int, java.lang.String)java.lang.String
		// @07: astore_3
		// @08: iload_1
		// @09: aload_2
		// @0A: aload_0
		// @0B: invokevirtual java.lang.String.indexOf(java.lang.String)int
		// @0E: if_icmpne @22
		// @11: iconst_m1
		// @12: aload_2
		// @13: aload_3
		// @14: invokevirtual java.lang.String.indexOf(java.lang.String)int
		// @17: if_icmpne @22
		// @1A: goto @1E
		// @1D: athrow
		// @1E: goto @24
		// @21: athrow
		// @22: iconst_1
		// @23: ireturn
		// @24: aload_2
		// @25: aload_0
		// @26: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @29: ifne @50
		// @2C: aload_2
		// @2D: aload_3
		// @2E: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @31: ifne @50
		// @34: goto @38
		// @37: athrow
		// @38: aload_2
		// @39: aload_0
		// @3A: invokevirtual java.lang.String.endsWith(java.lang.String)boolean
		// @3D: ifne @50
		// @40: goto @44
		// @43: athrow
		// @44: aload_2
		// @45: aload_3
		// @46: invokevirtual java.lang.String.endsWith(java.lang.String)boolean
		// @49: ifeq @55
		// @4C: goto @50
		// @4F: athrow
		// @50: iconst_1
		// @51: goto @56
		// @54: athrow
		// @55: iconst_0
		// @56: ireturn
		// @57: astore_3
		// @58: aload_3
		// @59: new java.lang.StringBuilder
		// @5C: dup
		// @5D: invokespecial java.lang.StringBuilder.<init>()void
		// @60: getstatic java.lang.String[] game.C_100322_hn.field_107241_z
		// @63: iconst_3
		// @64: aaload
		// @65: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @68: aload_0
		// @69: ifnull @75
		// @6C: getstatic java.lang.String[] game.C_100322_hn.field_107241_z
		// @6F: iconst_1
		// @70: aaload
		// @71: goto @7A
		// @74: athrow
		// @75: getstatic java.lang.String[] game.C_100322_hn.field_107241_z
		// @78: iconst_2
		// @79: aaload
		// @7A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7D: bipush 44 (0x2C)
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: iload_1
		// @83: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @86: bipush 44 (0x2C)
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: aload_2
		// @8C: ifnull @98
		// @8F: getstatic java.lang.String[] game.C_100322_hn.field_107241_z
		// @92: iconst_1
		// @93: aaload
		// @94: goto @9D
		// @97: athrow
		// @98: getstatic java.lang.String[] game.C_100322_hn.field_107241_z
		// @9B: iconst_2
		// @9C: aaload
		// @9D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A0: bipush 41 (0x29)
		// @A2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AB: athrow
	}
	
	static
	{
		// @00: iconst_4
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "k5|\u0016\u0018"
		// @08: invokestatic game.C_100322_hn.func_107233_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100322_hn.func_107232_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "xu|yM"
		// @13: invokestatic game.C_100322_hn.func_107233_z(java.lang.String)char[]
		// @16: invokestatic game.C_100322_hn.func_107232_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "m.>;"
		// @1E: invokestatic game.C_100322_hn.func_107233_z(java.lang.String)char[]
		// @21: invokestatic game.C_100322_hn.func_107232_z(char[])java.lang.String
		// @24: aastore
		// @25: dup
		// @26: iconst_3
		// @27: ldc "k5|\u0015\u0018"
		// @29: invokestatic game.C_100322_hn.func_107233_z(java.lang.String)char[]
		// @2C: invokestatic game.C_100322_hn.func_107232_z(char[])java.lang.String
		// @2F: aastore
		// @30: putstatic java.lang.String[] game.C_100322_hn.field_107241_z
		// @33: iconst_0
		// @34: putstatic int game.C_100322_hn.field_107238_b
		// @37: ldc "N\u0014\u0016\u0002|F\u0008h"
		// @39: invokestatic game.C_100322_hn.func_107233_z(java.lang.String)char[]
		// @3C: invokestatic game.C_100322_hn.func_107232_z(char[])java.lang.String
		// @3F: putstatic java.lang.String game.C_100322_hn.field_107236_d
		// @42: ldc "M>%wwb67"
		// @44: invokestatic game.C_100322_hn.func_107233_z(java.lang.String)char[]
		// @47: invokestatic game.C_100322_hn.func_107232_z(char[])java.lang.String
		// @4A: putstatic java.lang.String game.C_100322_hn.field_107240_a
		// @4D: ldc "D:?2\u0010l+&>_m(r4Xb552T#snr\u0000=r"
		// @4F: invokestatic game.C_100322_hn.func_107233_z(java.lang.String)char[]
		// @52: invokestatic game.C_100322_hn.func_107232_z(char[])java.lang.String
		// @55: putstatic java.lang.String game.C_100322_hn.field_107237_e
		// @58: ldc "?~bi\u0010k:!wUm/7%Ug{3wWb67y"
		// @5A: invokestatic game.C_100322_hn.func_107233_z(java.lang.String)char[]
		// @5D: invokestatic game.C_100322_hn.func_107232_z(char[])java.lang.String
		// @60: putstatic java.lang.String game.C_100322_hn.field_107235_f
		// @63: return
	}
	
	private static char[] func_107233_z(String arg0)
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
		// @0E: bipush 48 (0x30)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_107232_z(char[] arg0)
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
		// @34: bipush 91 (0x5B)
		// @36: goto @45
		// @39: bipush 82 (0x52)
		// @3B: goto @45
		// @3E: bipush 87 (0x57)
		// @40: goto @45
		// @43: bipush 48 (0x30)
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
