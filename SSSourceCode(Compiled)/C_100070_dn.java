package game;

final class C_100070_dn
{
	static int field_104372_a;
	private static int[] field_104366_f;
	private static int[] field_104369_e;
	static int field_104368_d;
	private static int[] field_104373_h;
	static int[] field_104374_i;
	static int field_104367_g;
	static int[] field_104370_b;
	static int field_104371_c;
	
	private static final void func_104362_a(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: iload_2
		// @01: iload_0
		// @02: isub
		// @03: putstatic int game.C_100070_dn.field_104372_a
		// @06: iload_3
		// @07: iload_1
		// @08: isub
		// @09: putstatic int game.C_100070_dn.field_104367_g
		// @0C: invokestatic game.C_100070_dn.func_104364_b()void
		// @0F: getstatic int[] game.C_100070_dn.field_104374_i
		// @12: arraylength
		// @13: getstatic int game.C_100070_dn.field_104367_g
		// @16: if_icmpge @25
		// @19: getstatic int game.C_100070_dn.field_104367_g
		// @1C: iconst_0
		// @1D: invokestatic game.C_100249_pc.func_102324_a(int, int)int
		// @20: newarray int[]
		// @22: putstatic int[] game.C_100070_dn.field_104374_i
		// @25: iload_1
		// @26: getstatic int game.C_100196_rb.field_105819_e
		// @29: imul
		// @2A: iload_0
		// @2B: iadd
		// @2C: istore #4
		// @2E: iconst_0
		// @2F: istore #5
		// @31: iload #5
		// @33: getstatic int game.C_100070_dn.field_104367_g
		// @36: if_icmpge @4F
		// @39: getstatic int[] game.C_100070_dn.field_104374_i
		// @3C: iload #5
		// @3E: iload #4
		// @40: iastore
		// @41: iload #4
		// @43: getstatic int game.C_100196_rb.field_105819_e
		// @46: iadd
		// @47: istore #4
		// @49: iinc #5 +1
		// @4C: goto @31
		// @4F: return
	}
	
	public static void func_104365_c()
	{
		// @00: aconst_null
		// @01: putstatic int[] game.C_100070_dn.field_104374_i
		// @04: aconst_null
		// @05: putstatic int[] game.C_100070_dn.field_104373_h
		// @08: aconst_null
		// @09: putstatic int[] game.C_100070_dn.field_104369_e
		// @0C: aconst_null
		// @0D: putstatic int[] game.C_100070_dn.field_104370_b
		// @10: aconst_null
		// @11: putstatic int[] game.C_100070_dn.field_104366_f
		// @14: return
	}
	
	static final void func_104363_a()
	{
		// @00: getstatic int game.C_100196_rb.field_105827_i
		// @03: getstatic int game.C_100196_rb.field_105816_f
		// @06: getstatic int game.C_100196_rb.field_105820_b
		// @09: getstatic int game.C_100196_rb.field_105823_l
		// @0C: invokestatic game.C_100070_dn.func_104362_a(int, int, int, int)void
		// @0F: return
	}
	
	private static final void func_104364_b()
	{
		// @00: getstatic int game.C_100070_dn.field_104372_a
		// @03: iconst_2
		// @04: idiv
		// @05: putstatic int game.C_100070_dn.field_104371_c
		// @08: getstatic int game.C_100070_dn.field_104367_g
		// @0B: iconst_2
		// @0C: idiv
		// @0D: putstatic int game.C_100070_dn.field_104368_d
		// @10: return
	}
	
	static
	{
		// @00: sipush 2048 (0x0800)
		// @03: newarray int[]
		// @05: putstatic int[] game.C_100070_dn.field_104366_f
		// @08: sipush 2048 (0x0800)
		// @0B: newarray int[]
		// @0D: putstatic int[] game.C_100070_dn.field_104369_e
		// @10: sipush 512 (0x0200)
		// @13: newarray int[]
		// @15: putstatic int[] game.C_100070_dn.field_104373_h
		// @18: sipush 1024 (0x0400)
		// @1B: newarray int[]
		// @1D: putstatic int[] game.C_100070_dn.field_104374_i
		// @20: sipush 2048 (0x0800)
		// @23: newarray int[]
		// @25: putstatic int[] game.C_100070_dn.field_104370_b
		// @28: iconst_1
		// @29: istore_0
		// @2A: iload_0
		// @2B: sipush 512 (0x0200)
		// @2E: if_icmpge @40
		// @31: getstatic int[] game.C_100070_dn.field_104373_h
		// @34: iload_0
		// @35: ldc 32768 (0x8000)
		// @37: iload_0
		// @38: idiv
		// @39: iastore
		// @3A: iinc #0 +1
		// @3D: goto @2A
		// @40: iconst_1
		// @41: istore_0
		// @42: iload_0
		// @43: sipush 2048 (0x0800)
		// @46: if_icmpge @58
		// @49: getstatic int[] game.C_100070_dn.field_104369_e
		// @4C: iload_0
		// @4D: ldc 65536 (0x10000)
		// @4F: iload_0
		// @50: idiv
		// @51: iastore
		// @52: iinc #0 +1
		// @55: goto @42
		// @58: iconst_0
		// @59: istore_0
		// @5A: iload_0
		// @5B: sipush 2048 (0x0800)
		// @5E: if_icmpge @8D
		// @61: getstatic int[] game.C_100070_dn.field_104370_b
		// @64: iload_0
		// @65: ldc2_w 65536.0
		// @68: iload_0
		// @69: i2d
		// @6A: ldc2_w 0.0030679615
		// @6D: dmul
		// @6E: invokestatic java.lang.Math.sin(double)double
		// @71: dmul
		// @72: d2i
		// @73: iastore
		// @74: getstatic int[] game.C_100070_dn.field_104366_f
		// @77: iload_0
		// @78: ldc2_w 65536.0
		// @7B: iload_0
		// @7C: i2d
		// @7D: ldc2_w 0.0030679615
		// @80: dmul
		// @81: invokestatic java.lang.Math.cos(double)double
		// @84: dmul
		// @85: d2i
		// @86: iastore
		// @87: iinc #0 +1
		// @8A: goto @5A
		// @8D: return
	}
}
