package game;

final class C_100313_lg
{
	static C_100153_be[] field_107166_b;
	static String field_107168_a;
	static int field_107163_f;
	static String field_107167_c;
	static int field_107165_e;
	static C_100177_cj field_107164_d;
	private static final String field_107169_z;
	
	public static void func_107161_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100313_lg.field_107168_a
		// @08: bipush 99 (0x63)
		// @0A: bipush -12 (0xF4)
		// @0C: iload_0
		// @0D: isub
		// @0E: bipush 60 (0x3C)
		// @10: idiv
		// @11: idiv
		// @12: istore_1
		// @13: aconst_null
		// @14: putstatic java.lang.String game.C_100313_lg.field_107167_c
		// @17: aconst_null
		// @18: putstatic game.C_100177_cj game.C_100313_lg.field_107164_d
		// @1B: goto @3D
		// @1E: astore_1
		// @1F: aload_1
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String game.C_100313_lg.field_107169_z
		// @2A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D: iload_0
		// @2E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @31: bipush 41 (0x29)
		// @33: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @36: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @39: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3C: athrow
		// @3D: return
	}
	
	static
	{
		// @00: ldc "Bh<\u000c7"
		// @02: invokestatic game.C_100313_lg.func_107162_z(java.lang.String)char[]
		// @05: invokestatic game.C_100313_lg.func_107160_z(char[])java.lang.String
		// @08: putstatic java.lang.String game.C_100313_lg.field_107169_z
		// @0B: iconst_1
		// @0C: putstatic int game.C_100313_lg.field_107163_f
		// @0F: ldc "~cw,lK/w#kK}2,?Wjs??Ljf:zKa2q:\u001e12,qJ/.h.\u0010"
		// @11: invokestatic game.C_100313_lg.func_107162_z(java.lang.String)char[]
		// @14: invokestatic game.C_100313_lg.func_107160_z(char[])java.lang.String
		// @17: putstatic java.lang.String game.C_100313_lg.field_107168_a
		// @1A: sipush 640 (0x0280)
		// @1D: putstatic int game.C_100313_lg.field_107165_e
		// @20: ldc "|ja(~\\lzmv@{}m#M`~p/\u001eit+y\u0010J_\u001d?Yjs=p@|.b|Ac,mv]/|(zJjvm}Ki}?z\u000e{z(?\u0012*\"s?Mn|m}K/w#xGaw(mKk<"
		// @22: invokestatic game.C_100313_lg.func_107162_z(java.lang.String)char[]
		// @25: invokestatic game.C_100313_lg.func_107160_z(char[])java.lang.String
		// @28: putstatic java.lang.String game.C_100313_lg.field_107167_c
		// @2B: return
	}
	
	private static char[] func_107162_z(String arg0)
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
		// @0E: bipush 31 (0x1F)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_107160_z(char[] arg0)
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
		// @30: bipush 46 (0x2E)
		// @32: goto @46
		// @35: bipush 15 (0x0F)
		// @37: goto @46
		// @3A: bipush 18 (0x12)
		// @3C: goto @46
		// @3F: bipush 77 (0x4D)
		// @41: goto @46
		// @44: bipush 31 (0x1F)
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
