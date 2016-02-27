package game;

final class C_100164_se
{
	static C_100302_ka field_105456_h;
	static String field_105448_f;
	static boolean field_105449_g;
	static String field_105453_c;
	static int[] field_105454_a;
	static String field_105452_b;
	static String field_105451_e;
	static String field_105450_d;
	private static final String[] field_105455_z;
	
	static final void func_105445_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush -59 (0xC5)
		// @03: if_icmplt @07
		// @06: return
		// @07: sipush 200 (0x00C8)
		// @0A: invokestatic game.C_100021_wn.func_103862_a(int)void
		// @0D: goto @31
		// @10: astore_1
		// @11: aload_1
		// @12: new java.lang.StringBuilder
		// @15: dup
		// @16: invokespecial java.lang.StringBuilder.<init>()void
		// @19: getstatic java.lang.String[] game.C_100164_se.field_105455_z
		// @1C: iconst_0
		// @1D: aaload
		// @1E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @21: iload_0
		// @22: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @25: bipush 41 (0x29)
		// @27: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @30: athrow
		// @31: return
	}
	
	static final boolean func_105447_a(int arg0, boolean arg1, int arg2)
	{
		// @00: iload_1
		// @01: iconst_1
		// @02: if_icmpeq @10
		// @05: aconst_null
		// @06: checkcast int[]
		// @09: putstatic int[] game.C_100164_se.field_105454_a
		// @0C: goto @10
		// @0F: athrow
		// @10: getstatic int game.C_100293_kj.field_106890_c
		// @13: bipush 13 (0x0D)
		// @15: if_icmpne @20
		// @18: sipush -24528 (0xA030)
		// @1B: invokestatic game.C_100285_nk.func_106775_c(int)void
		// @1E: iconst_1
		// @1F: ireturn
		// @20: getstatic int game.C_100293_kj.field_106890_c
		// @23: bipush 102 (0x66)
		// @25: if_icmpne @33
		// @28: getstatic game.C_100033_gj game.C_100159_sn.field_105401_e
		// @2B: sipush -21723 (0xAB25)
		// @2E: invokevirtual game.C_100033_gj.func_101904_o(int)void
		// @31: iconst_1
		// @32: ireturn
		// @33: getstatic game.C_100033_gj game.C_100159_sn.field_105401_e
		// @36: ifnull @4F
		// @39: getstatic game.C_100033_gj game.C_100159_sn.field_105401_e
		// @3C: iload_2
		// @3D: bipush -97 (0x9F)
		// @3F: iload_0
		// @40: invokevirtual game.C_100033_gj.func_101893_c(int, int, int)boolean
		// @43: ifeq @4F
		// @46: goto @4A
		// @49: athrow
		// @4A: iconst_1
		// @4B: goto @50
		// @4E: athrow
		// @4F: iconst_0
		// @50: ireturn
		// @51: astore_3
		// @52: aload_3
		// @53: new java.lang.StringBuilder
		// @56: dup
		// @57: invokespecial java.lang.StringBuilder.<init>()void
		// @5A: getstatic java.lang.String[] game.C_100164_se.field_105455_z
		// @5D: iconst_1
		// @5E: aaload
		// @5F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @62: iload_0
		// @63: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @66: bipush 44 (0x2C)
		// @68: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6B: iload_1
		// @6C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
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
	
	public static void func_105443_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100164_se.field_105451_e
		// @04: iload_0
		// @05: sipush 27376 (0x6AF0)
		// @08: if_icmpeq @0C
		// @0B: return
		// @0C: aconst_null
		// @0D: putstatic int[] game.C_100164_se.field_105454_a
		// @10: aconst_null
		// @11: putstatic java.lang.String game.C_100164_se.field_105450_d
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100164_se.field_105448_f
		// @18: aconst_null
		// @19: putstatic java.lang.String game.C_100164_se.field_105452_b
		// @1C: aconst_null
		// @1D: putstatic game.C_100302_ka game.C_100164_se.field_105456_h
		// @20: aconst_null
		// @21: putstatic java.lang.String game.C_100164_se.field_105453_c
		// @24: goto @48
		// @27: astore_1
		// @28: aload_1
		// @29: new java.lang.StringBuilder
		// @2C: dup
		// @2D: invokespecial java.lang.StringBuilder.<init>()void
		// @30: getstatic java.lang.String[] game.C_100164_se.field_105455_z
		// @33: iconst_2
		// @34: aaload
		// @35: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @38: iload_0
		// @39: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3C: bipush 41 (0x29)
		// @3E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @41: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @44: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @47: athrow
		// @48: return
	}
	
	static
	{
		// @00: iconst_3
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "{p\u0007)k"
		// @08: invokestatic game.C_100164_se.func_105446_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100164_se.func_105444_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "{p\u0007*k"
		// @13: invokestatic game.C_100164_se.func_105446_z(java.lang.String)char[]
		// @16: invokestatic game.C_100164_se.func_105444_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "{p\u0007(k"
		// @1E: invokestatic game.C_100164_se.func_105446_z(java.lang.String)char[]
		// @21: invokestatic game.C_100164_se.func_105444_z(char[])java.lang.String
		// @24: aastore
		// @25: putstatic java.lang.String[] game.C_100164_se.field_105455_z
		// @28: ldc "ZXkK\u007faxNVq>+\u0013K\u0010kgF\u0007/(c@\u000e4"
		// @2A: invokestatic game.C_100164_se.func_105446_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100164_se.func_105444_z(char[])java.lang.String
		// @30: putstatic java.lang.String game.C_100164_se.field_105453_c
		// @33: ldc "As\t\u0012,}5E\u000e\"~p\t\u0005,\u007f9\t\u0012,}g\t\u001b1gr[\u000e0{5^\u0002/d5K\u000ecdzZ\u001fm4w[U\u000fgr\t\u0002-(z[K zpH\u001f&(t\t\r1mp\t\n kz\\\u00057(aFK0icLK:g`[K3zzN\u0019&{f\u0007"
		// @35: invokestatic game.C_100164_se.func_105446_z(java.lang.String)char[]
		// @38: invokestatic game.C_100164_se.func_105444_z(char[])java.lang.String
		// @3B: putstatic java.lang.String game.C_100164_se.field_105448_f
		// @3E: ldc "DzH\u000f*fr\t\r,faZ"
		// @40: invokestatic game.C_100164_se.func_105446_z(java.lang.String)char[]
		// @43: invokestatic game.C_100164_se.func_105444_z(char[])java.lang.String
		// @46: putstatic java.lang.String game.C_100164_se.field_105452_b
		// @49: ldc "[}F\u001ccxg@\u001d\"|p\t\u0008+ia\t\r1gx\t\u0006:(s[\u0002&fqZK\"fq\t\u00043xzG\u000e-|f"
		// @4B: invokestatic game.C_100164_se.func_105446_z(java.lang.String)char[]
		// @4E: invokestatic game.C_100164_se.func_105444_z(char[])java.lang.String
		// @51: putstatic java.lang.String game.C_100164_se.field_105451_e
		// @54: ldc "OtD\u000e"
		// @56: invokestatic game.C_100164_se.func_105446_z(java.lang.String)char[]
		// @59: invokestatic game.C_100164_se.func_105444_z(char[])java.lang.String
		// @5C: putstatic java.lang.String game.C_100164_se.field_105450_d
		// @5F: bipush 20 (0x14)
		// @61: newarray int[]
		// @63: putstatic int[] game.C_100164_se.field_105454_a
		// @66: iconst_0
		// @67: istore_0
		// @68: getstatic int[] game.C_100164_se.field_105454_a
		// @6B: arraylength
		// @6C: iload_0
		// @6D: if_icmple @7F
		// @70: getstatic int[] game.C_100164_se.field_105454_a
		// @73: iload_0
		// @74: sipush 1200 (0x04B0)
		// @77: iastore
		// @78: iinc #0 +1
		// @7B: goto @68
		// @7E: athrow
		// @7F: return
	}
	
	private static char[] func_105446_z(String arg0)
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
		// @0E: bipush 67 (0x43)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105444_z(char[] arg0)
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
		// @30: bipush 8 (0x08)
		// @32: goto @46
		// @35: bipush 21 (0x15)
		// @37: goto @46
		// @3A: bipush 41 (0x29)
		// @3C: goto @46
		// @3F: bipush 107 (0x6B)
		// @41: goto @46
		// @44: bipush 67 (0x43)
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
