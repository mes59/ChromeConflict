package game;

final class C_100150_bb
{
	private int field_105165_g;
	private int field_105168_b;
	int field_105167_e;
	private int field_105170_a;
	private int field_105173_h;
	private int[] field_105166_d;
	private int field_105164_f;
	private int[] field_105172_k;
	int field_105169_c;
	private int field_105174_i;
	int field_105171_j;
	
	final void func_105162_b(C_100280_nf arg0)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: iconst_0
		// @03: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @06: putfield int game.C_100150_bb.field_105169_c
		// @09: aload_0
		// @0A: aload_1
		// @0B: sipush -1543 (0xF9F9)
		// @0E: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @11: putfield int game.C_100150_bb.field_105171_j
		// @14: aload_0
		// @15: aload_1
		// @16: sipush -1543 (0xF9F9)
		// @19: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @1C: putfield int game.C_100150_bb.field_105167_e
		// @1F: aload_0
		// @20: aload_1
		// @21: invokevirtual game.C_100150_bb.func_105163_a(game.C_100280_nf)void
		// @24: return
	}
	
	final void func_105163_a(C_100280_nf arg0)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: iconst_0
		// @03: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @06: putfield int game.C_100150_bb.field_105168_b
		// @09: aload_0
		// @0A: aload_0
		// @0B: getfield int game.C_100150_bb.field_105168_b
		// @0E: newarray int[]
		// @10: putfield int[] game.C_100150_bb.field_105172_k
		// @13: aload_0
		// @14: aload_0
		// @15: getfield int game.C_100150_bb.field_105168_b
		// @18: newarray int[]
		// @1A: putfield int[] game.C_100150_bb.field_105166_d
		// @1D: iconst_0
		// @1E: istore_2
		// @1F: iload_2
		// @20: aload_0
		// @21: getfield int game.C_100150_bb.field_105168_b
		// @24: if_icmpge @45
		// @27: aload_0
		// @28: getfield int[] game.C_100150_bb.field_105172_k
		// @2B: iload_2
		// @2C: aload_1
		// @2D: bipush -2 (0xFE)
		// @2F: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @32: iastore
		// @33: aload_0
		// @34: getfield int[] game.C_100150_bb.field_105166_d
		// @37: iload_2
		// @38: aload_1
		// @39: bipush -2 (0xFE)
		// @3B: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @3E: iastore
		// @3F: iinc #2 +1
		// @42: goto @1F
		// @45: return
	}
	
	final void func_105160_a()
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: putfield int game.C_100150_bb.field_105173_h
		// @05: aload_0
		// @06: iconst_0
		// @07: putfield int game.C_100150_bb.field_105164_f
		// @0A: aload_0
		// @0B: iconst_0
		// @0C: putfield int game.C_100150_bb.field_105170_a
		// @0F: aload_0
		// @10: iconst_0
		// @11: putfield int game.C_100150_bb.field_105174_i
		// @14: aload_0
		// @15: iconst_0
		// @16: putfield int game.C_100150_bb.field_105165_g
		// @19: return
	}
	
	final int func_105161_a(int arg0)
	{
		// @00: aload_0
		// @01: getfield int game.C_100150_bb.field_105165_g
		// @04: aload_0
		// @05: getfield int game.C_100150_bb.field_105173_h
		// @08: if_icmplt @77
		// @0B: aload_0
		// @0C: aload_0
		// @0D: getfield int[] game.C_100150_bb.field_105166_d
		// @10: aload_0
		// @11: dup
		// @12: getfield int game.C_100150_bb.field_105164_f
		// @15: dup_x1
		// @16: iconst_1
		// @17: iadd
		// @18: putfield int game.C_100150_bb.field_105164_f
		// @1B: iaload
		// @1C: bipush 15 (0x0F)
		// @1E: ishl
		// @1F: putfield int game.C_100150_bb.field_105174_i
		// @22: aload_0
		// @23: getfield int game.C_100150_bb.field_105164_f
		// @26: aload_0
		// @27: getfield int game.C_100150_bb.field_105168_b
		// @2A: if_icmplt @37
		// @2D: aload_0
		// @2E: aload_0
		// @2F: getfield int game.C_100150_bb.field_105168_b
		// @32: iconst_1
		// @33: isub
		// @34: putfield int game.C_100150_bb.field_105164_f
		// @37: aload_0
		// @38: aload_0
		// @39: getfield int[] game.C_100150_bb.field_105172_k
		// @3C: aload_0
		// @3D: getfield int game.C_100150_bb.field_105164_f
		// @40: iaload
		// @41: i2d
		// @42: ldc2_w 65536.0
		// @45: ddiv
		// @46: iload_1
		// @47: i2d
		// @48: dmul
		// @49: d2i
		// @4A: putfield int game.C_100150_bb.field_105173_h
		// @4D: aload_0
		// @4E: getfield int game.C_100150_bb.field_105173_h
		// @51: aload_0
		// @52: getfield int game.C_100150_bb.field_105165_g
		// @55: if_icmple @77
		// @58: aload_0
		// @59: aload_0
		// @5A: getfield int[] game.C_100150_bb.field_105166_d
		// @5D: aload_0
		// @5E: getfield int game.C_100150_bb.field_105164_f
		// @61: iaload
		// @62: bipush 15 (0x0F)
		// @64: ishl
		// @65: aload_0
		// @66: getfield int game.C_100150_bb.field_105174_i
		// @69: isub
		// @6A: aload_0
		// @6B: getfield int game.C_100150_bb.field_105173_h
		// @6E: aload_0
		// @6F: getfield int game.C_100150_bb.field_105165_g
		// @72: isub
		// @73: idiv
		// @74: putfield int game.C_100150_bb.field_105170_a
		// @77: aload_0
		// @78: dup
		// @79: getfield int game.C_100150_bb.field_105174_i
		// @7C: aload_0
		// @7D: getfield int game.C_100150_bb.field_105170_a
		// @80: iadd
		// @81: putfield int game.C_100150_bb.field_105174_i
		// @84: aload_0
		// @85: dup
		// @86: getfield int game.C_100150_bb.field_105165_g
		// @89: iconst_1
		// @8A: iadd
		// @8B: putfield int game.C_100150_bb.field_105165_g
		// @8E: aload_0
		// @8F: getfield int game.C_100150_bb.field_105174_i
		// @92: aload_0
		// @93: getfield int game.C_100150_bb.field_105170_a
		// @96: isub
		// @97: bipush 15 (0x0F)
		// @99: ishr
		// @9A: ireturn
	}
	
	C_100150_bb()
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iconst_2
		// @06: putfield int game.C_100150_bb.field_105168_b
		// @09: aload_0
		// @0A: iconst_2
		// @0B: newarray int[]
		// @0D: putfield int[] game.C_100150_bb.field_105172_k
		// @10: aload_0
		// @11: iconst_2
		// @12: newarray int[]
		// @14: putfield int[] game.C_100150_bb.field_105166_d
		// @17: aload_0
		// @18: getfield int[] game.C_100150_bb.field_105172_k
		// @1B: iconst_0
		// @1C: iconst_0
		// @1D: iastore
		// @1E: aload_0
		// @1F: getfield int[] game.C_100150_bb.field_105172_k
		// @22: iconst_1
		// @23: ldc 65535 (0xffff)
		// @25: iastore
		// @26: aload_0
		// @27: getfield int[] game.C_100150_bb.field_105166_d
		// @2A: iconst_0
		// @2B: iconst_0
		// @2C: iastore
		// @2D: aload_0
		// @2E: getfield int[] game.C_100150_bb.field_105166_d
		// @31: iconst_1
		// @32: ldc 65535 (0xffff)
		// @34: iastore
		// @35: return
	}
}
