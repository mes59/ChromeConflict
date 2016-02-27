package game;

final class C_100039_wd
{
	int field_104083_b;
	int[] field_104085_a;
	int[] field_104084_c;
	int field_104082_d;
	
	C_100039_wd()
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: bipush 16 (0x10)
		// @06: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @09: pop
		// @0A: aload_0
		// @0B: invokestatic game.C_100319_hk.func_101426_a()int
		// @0E: ifeq @1A
		// @11: iconst_4
		// @12: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @15: iconst_1
		// @16: iadd
		// @17: goto @1B
		// @1A: iconst_1
		// @1B: putfield int game.C_100039_wd.field_104083_b
		// @1E: invokestatic game.C_100319_hk.func_101426_a()int
		// @21: ifeq @2A
		// @24: bipush 8 (0x08)
		// @26: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @29: pop
		// @2A: iconst_2
		// @2B: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @2E: pop
		// @2F: aload_0
		// @30: getfield int game.C_100039_wd.field_104083_b
		// @33: iconst_1
		// @34: if_icmple @3F
		// @37: aload_0
		// @38: iconst_4
		// @39: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @3C: putfield int game.C_100039_wd.field_104082_d
		// @3F: aload_0
		// @40: aload_0
		// @41: getfield int game.C_100039_wd.field_104083_b
		// @44: newarray int[]
		// @46: putfield int[] game.C_100039_wd.field_104084_c
		// @49: aload_0
		// @4A: aload_0
		// @4B: getfield int game.C_100039_wd.field_104083_b
		// @4E: newarray int[]
		// @50: putfield int[] game.C_100039_wd.field_104085_a
		// @53: iconst_0
		// @54: istore_1
		// @55: iload_1
		// @56: aload_0
		// @57: getfield int game.C_100039_wd.field_104083_b
		// @5A: if_icmpge @7F
		// @5D: bipush 8 (0x08)
		// @5F: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @62: pop
		// @63: aload_0
		// @64: getfield int[] game.C_100039_wd.field_104084_c
		// @67: iload_1
		// @68: bipush 8 (0x08)
		// @6A: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @6D: iastore
		// @6E: aload_0
		// @6F: getfield int[] game.C_100039_wd.field_104085_a
		// @72: iload_1
		// @73: bipush 8 (0x08)
		// @75: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @78: iastore
		// @79: iinc #1 +1
		// @7C: goto @55
		// @7F: return
	}
}
