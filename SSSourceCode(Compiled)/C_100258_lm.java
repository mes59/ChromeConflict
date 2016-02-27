package game;

final class C_100258_lm
{
	private int[] field_106493_e;
	private int[] field_106492_d;
	private int field_106496_a;
	private int[] field_106491_f;
	private float[][] field_106494_b;
	int field_106495_c;
	
	private final void func_106489_b()
	{
		// @000: aload_0
		// @001: getfield int game.C_100258_lm.field_106496_a
		// @004: newarray int[]
		// @006: astore_1
		// @007: bipush 33 (0x21)
		// @009: newarray int[]
		// @00B: astore_2
		// @00C: iconst_0
		// @00D: istore_3
		// @00E: iload_3
		// @00F: aload_0
		// @010: getfield int game.C_100258_lm.field_106496_a
		// @013: if_icmpge @0CC
		// @016: aload_0
		// @017: getfield int[] game.C_100258_lm.field_106492_d
		// @01A: iload_3
		// @01B: iaload
		// @01C: istore #4
		// @01E: iload #4
		// @020: ifne @026
		// @023: goto @0C6
		// @026: iconst_1
		// @027: bipush 32 (0x20)
		// @029: iload #4
		// @02B: isub
		// @02C: ishl
		// @02D: istore #5
		// @02F: aload_2
		// @030: iload #4
		// @032: iaload
		// @033: istore #6
		// @035: aload_1
		// @036: iload_3
		// @037: iload #6
		// @039: iastore
		// @03A: iload #6
		// @03C: iload #5
		// @03E: iand
		// @03F: ifeq @04D
		// @042: aload_2
		// @043: iload #4
		// @045: iconst_1
		// @046: isub
		// @047: iaload
		// @048: istore #7
		// @04A: goto @09A
		// @04D: iload #6
		// @04F: iload #5
		// @051: ior
		// @052: istore #7
		// @054: iload #4
		// @056: iconst_1
		// @057: isub
		// @058: istore #8
		// @05A: iload #8
		// @05C: iconst_1
		// @05D: if_icmplt @09A
		// @060: aload_2
		// @061: iload #8
		// @063: iaload
		// @064: istore #9
		// @066: iload #9
		// @068: iload #6
		// @06A: if_icmpne @09A
		// @06D: iconst_1
		// @06E: bipush 32 (0x20)
		// @070: iload #8
		// @072: isub
		// @073: ishl
		// @074: istore #10
		// @076: iload #9
		// @078: iload #10
		// @07A: iand
		// @07B: ifeq @08B
		// @07E: aload_2
		// @07F: iload #8
		// @081: aload_2
		// @082: iload #8
		// @084: iconst_1
		// @085: isub
		// @086: iaload
		// @087: iastore
		// @088: goto @09A
		// @08B: aload_2
		// @08C: iload #8
		// @08E: iload #9
		// @090: iload #10
		// @092: ior
		// @093: iastore
		// @094: iinc #8 +255
		// @097: goto @05A
		// @09A: aload_2
		// @09B: iload #4
		// @09D: iload #7
		// @09F: iastore
		// @0A0: iload #4
		// @0A2: iconst_1
		// @0A3: iadd
		// @0A4: istore #8
		// @0A6: iload #8
		// @0A8: bipush 32 (0x20)
		// @0AA: if_icmpgt @0C6
		// @0AD: aload_2
		// @0AE: iload #8
		// @0B0: iaload
		// @0B1: istore #9
		// @0B3: iload #9
		// @0B5: iload #6
		// @0B7: if_icmpne @0C0
		// @0BA: aload_2
		// @0BB: iload #8
		// @0BD: iload #7
		// @0BF: iastore
		// @0C0: iinc #8 +1
		// @0C3: goto @0A6
		// @0C6: iinc #3 +1
		// @0C9: goto @00E
		// @0CC: aload_0
		// @0CD: bipush 8 (0x08)
		// @0CF: newarray int[]
		// @0D1: putfield int[] game.C_100258_lm.field_106493_e
		// @0D4: iconst_0
		// @0D5: istore_2
		// @0D6: iconst_0
		// @0D7: istore_3
		// @0D8: iload_3
		// @0D9: aload_0
		// @0DA: getfield int game.C_100258_lm.field_106496_a
		// @0DD: if_icmpge @193
		// @0E0: aload_0
		// @0E1: getfield int[] game.C_100258_lm.field_106492_d
		// @0E4: iload_3
		// @0E5: iaload
		// @0E6: istore #4
		// @0E8: iload #4
		// @0EA: ifne @0F0
		// @0ED: goto @18D
		// @0F0: aload_1
		// @0F1: iload_3
		// @0F2: iaload
		// @0F3: istore #5
		// @0F5: iconst_0
		// @0F6: istore #6
		// @0F8: iconst_0
		// @0F9: istore #7
		// @0FB: iload #7
		// @0FD: iload #4
		// @0FF: if_icmpge @178
		// @102: ldc -2147483648 (0x80000000)
		// @104: iload #7
		// @106: iushr
		// @107: istore #8
		// @109: iload #5
		// @10B: iload #8
		// @10D: iand
		// @10E: ifeq @12F
		// @111: aload_0
		// @112: getfield int[] game.C_100258_lm.field_106493_e
		// @115: iload #6
		// @117: iaload
		// @118: ifne @123
		// @11B: aload_0
		// @11C: getfield int[] game.C_100258_lm.field_106493_e
		// @11F: iload #6
		// @121: iload_2
		// @122: iastore
		// @123: aload_0
		// @124: getfield int[] game.C_100258_lm.field_106493_e
		// @127: iload #6
		// @129: iaload
		// @12A: istore #6
		// @12C: goto @132
		// @12F: iinc #6 +1
		// @132: iload #6
		// @134: aload_0
		// @135: getfield int[] game.C_100258_lm.field_106493_e
		// @138: arraylength
		// @139: if_icmplt @16C
		// @13C: aload_0
		// @13D: getfield int[] game.C_100258_lm.field_106493_e
		// @140: arraylength
		// @141: iconst_2
		// @142: imul
		// @143: newarray int[]
		// @145: astore #9
		// @147: iconst_0
		// @148: istore #10
		// @14A: iload #10
		// @14C: aload_0
		// @14D: getfield int[] game.C_100258_lm.field_106493_e
		// @150: arraylength
		// @151: if_icmpge @166
		// @154: aload #9
		// @156: iload #10
		// @158: aload_0
		// @159: getfield int[] game.C_100258_lm.field_106493_e
		// @15C: iload #10
		// @15E: iaload
		// @15F: iastore
		// @160: iinc #10 +1
		// @163: goto @14A
		// @166: aload_0
		// @167: aload #9
		// @169: putfield int[] game.C_100258_lm.field_106493_e
		// @16C: iload #8
		// @16E: iconst_1
		// @16F: iushr
		// @170: istore #8
		// @172: iinc #7 +1
		// @175: goto @0FB
		// @178: aload_0
		// @179: getfield int[] game.C_100258_lm.field_106493_e
		// @17C: iload #6
		// @17E: iload_3
		// @17F: iconst_m1
		// @180: ixor
		// @181: iastore
		// @182: iload #6
		// @184: iload_2
		// @185: if_icmplt @18D
		// @188: iload #6
		// @18A: iconst_1
		// @18B: iadd
		// @18C: istore_2
		// @18D: iinc #3 +1
		// @190: goto @0D8
		// @193: return
	}
	
	final float[] func_106487_c()
	{
		// @0: aload_0
		// @1: getfield float[][] game.C_100258_lm.field_106494_b
		// @4: aload_0
		// @5: invokevirtual game.C_100258_lm.func_106488_a()int
		// @8: aaload
		// @9: areturn
	}
	
	final int func_106488_a()
	{
		// @00: iconst_0
		// @01: istore_1
		// @02: aload_0
		// @03: getfield int[] game.C_100258_lm.field_106493_e
		// @06: iload_1
		// @07: iaload
		// @08: iflt @21
		// @0B: invokestatic game.C_100319_hk.func_101426_a()int
		// @0E: ifeq @1A
		// @11: aload_0
		// @12: getfield int[] game.C_100258_lm.field_106493_e
		// @15: iload_1
		// @16: iaload
		// @17: goto @1D
		// @1A: iload_1
		// @1B: iconst_1
		// @1C: iadd
		// @1D: istore_1
		// @1E: goto @02
		// @21: aload_0
		// @22: getfield int[] game.C_100258_lm.field_106493_e
		// @25: iload_1
		// @26: iaload
		// @27: iconst_m1
		// @28: ixor
		// @29: ireturn
	}
	
	private static final int func_106490_a(int arg0, int arg1)
	{
		// @00: iload_0
		// @01: i2d
		// @02: dconst_1
		// @03: iload_1
		// @04: i2d
		// @05: ddiv
		// @06: invokestatic java.lang.Math.pow(double, double)double
		// @09: d2i
		// @0A: iconst_1
		// @0B: iadd
		// @0C: istore_2
		// @0D: bipush 62 (0x3E)
		// @0F: iload_1
		// @10: iload_2
		// @11: invokestatic game.C_100100_i.func_102001_a(byte, int, int)int
		// @14: iload_0
		// @15: if_icmple @1E
		// @18: iinc #2 +255
		// @1B: goto @0D
		// @1E: iload_2
		// @1F: ireturn
	}
	
	C_100258_lm()
	{
		// @000: aload_0
		// @001: invokespecial java.lang.Object.<init>()void
		// @004: bipush 24 (0x18)
		// @006: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @009: pop
		// @00A: aload_0
		// @00B: bipush 16 (0x10)
		// @00D: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @010: putfield int game.C_100258_lm.field_106495_c
		// @013: aload_0
		// @014: bipush 24 (0x18)
		// @016: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @019: putfield int game.C_100258_lm.field_106496_a
		// @01C: aload_0
		// @01D: aload_0
		// @01E: getfield int game.C_100258_lm.field_106496_a
		// @021: newarray int[]
		// @023: putfield int[] game.C_100258_lm.field_106492_d
		// @026: invokestatic game.C_100319_hk.func_101426_a()int
		// @029: ifeq @030
		// @02C: iconst_1
		// @02D: goto @031
		// @030: iconst_0
		// @031: istore_1
		// @032: iload_1
		// @033: ifeq @07B
		// @036: iconst_0
		// @037: istore_2
		// @038: iconst_5
		// @039: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @03C: iconst_1
		// @03D: iadd
		// @03E: istore_3
		// @03F: iload_2
		// @040: aload_0
		// @041: getfield int game.C_100258_lm.field_106496_a
		// @044: if_icmpge @078
		// @047: aload_0
		// @048: getfield int game.C_100258_lm.field_106496_a
		// @04B: iload_2
		// @04C: isub
		// @04D: sipush 18986 (0x4A2A)
		// @050: invokestatic game.C_100310_lj.func_100538_b(int, int)int
		// @053: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @056: istore #4
		// @058: iconst_0
		// @059: istore #5
		// @05B: iload #5
		// @05D: iload #4
		// @05F: if_icmpge @072
		// @062: aload_0
		// @063: getfield int[] game.C_100258_lm.field_106492_d
		// @066: iload_2
		// @067: iinc #2 +1
		// @06A: iload_3
		// @06B: iastore
		// @06C: iinc #5 +1
		// @06F: goto @05B
		// @072: iinc #3 +1
		// @075: goto @03F
		// @078: goto @0B7
		// @07B: invokestatic game.C_100319_hk.func_101426_a()int
		// @07E: ifeq @085
		// @081: iconst_1
		// @082: goto @086
		// @085: iconst_0
		// @086: istore_2
		// @087: iconst_0
		// @088: istore_3
		// @089: iload_3
		// @08A: aload_0
		// @08B: getfield int game.C_100258_lm.field_106496_a
		// @08E: if_icmpge @0B7
		// @091: iload_2
		// @092: ifeq @0A5
		// @095: invokestatic game.C_100319_hk.func_101426_a()int
		// @098: ifne @0A5
		// @09B: aload_0
		// @09C: getfield int[] game.C_100258_lm.field_106492_d
		// @09F: iload_3
		// @0A0: iconst_0
		// @0A1: iastore
		// @0A2: goto @0B1
		// @0A5: aload_0
		// @0A6: getfield int[] game.C_100258_lm.field_106492_d
		// @0A9: iload_3
		// @0AA: iconst_5
		// @0AB: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @0AE: iconst_1
		// @0AF: iadd
		// @0B0: iastore
		// @0B1: iinc #3 +1
		// @0B4: goto @089
		// @0B7: aload_0
		// @0B8: invokespecial game.C_100258_lm.func_106489_b()void
		// @0BB: iconst_4
		// @0BC: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @0BF: istore_2
		// @0C0: iload_2
		// @0C1: ifle @204
		// @0C4: bipush 32 (0x20)
		// @0C6: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @0C9: invokestatic game.C_100319_hk.func_101428_e(int)float
		// @0CC: fstore_3
		// @0CD: bipush 32 (0x20)
		// @0CF: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @0D2: invokestatic game.C_100319_hk.func_101428_e(int)float
		// @0D5: fstore #4
		// @0D7: iconst_4
		// @0D8: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @0DB: iconst_1
		// @0DC: iadd
		// @0DD: istore #5
		// @0DF: invokestatic game.C_100319_hk.func_101426_a()int
		// @0E2: ifeq @0E9
		// @0E5: iconst_1
		// @0E6: goto @0EA
		// @0E9: iconst_0
		// @0EA: istore #6
		// @0EC: iload_2
		// @0ED: iconst_1
		// @0EE: if_icmpne @101
		// @0F1: aload_0
		// @0F2: getfield int game.C_100258_lm.field_106496_a
		// @0F5: aload_0
		// @0F6: getfield int game.C_100258_lm.field_106495_c
		// @0F9: invokestatic game.C_100258_lm.func_106490_a(int, int)int
		// @0FC: istore #7
		// @0FE: goto @10C
		// @101: aload_0
		// @102: getfield int game.C_100258_lm.field_106496_a
		// @105: aload_0
		// @106: getfield int game.C_100258_lm.field_106495_c
		// @109: imul
		// @10A: istore #7
		// @10C: aload_0
		// @10D: iload #7
		// @10F: newarray int[]
		// @111: putfield int[] game.C_100258_lm.field_106491_f
		// @114: iconst_0
		// @115: istore #8
		// @117: iload #8
		// @119: iload #7
		// @11B: if_icmpge @130
		// @11E: aload_0
		// @11F: getfield int[] game.C_100258_lm.field_106491_f
		// @122: iload #8
		// @124: iload #5
		// @126: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @129: iastore
		// @12A: iinc #8 +1
		// @12D: goto @117
		// @130: aload_0
		// @131: aload_0
		// @132: getfield int game.C_100258_lm.field_106496_a
		// @135: aload_0
		// @136: getfield int game.C_100258_lm.field_106495_c
		// @139: multianewarray float[][] (init: 2)
		// @13D: putfield float[][] game.C_100258_lm.field_106494_b
		// @140: iload_2
		// @141: iconst_1
		// @142: if_icmpne @1AA
		// @145: iconst_0
		// @146: istore #8
		// @148: iload #8
		// @14A: aload_0
		// @14B: getfield int game.C_100258_lm.field_106496_a
		// @14E: if_icmpge @1A7
		// @151: fconst_0
		// @152: fstore #9
		// @154: iconst_1
		// @155: istore #10
		// @157: iconst_0
		// @158: istore #11
		// @15A: iload #11
		// @15C: aload_0
		// @15D: getfield int game.C_100258_lm.field_106495_c
		// @160: if_icmpge @1A1
		// @163: iload #8
		// @165: iload #10
		// @167: idiv
		// @168: iload #7
		// @16A: irem
		// @16B: istore #12
		// @16D: aload_0
		// @16E: getfield int[] game.C_100258_lm.field_106491_f
		// @171: iload #12
		// @173: iaload
		// @174: i2f
		// @175: fload #4
		// @177: fmul
		// @178: fload_3
		// @179: fadd
		// @17A: fload #9
		// @17C: fadd
		// @17D: fstore #13
		// @17F: aload_0
		// @180: getfield float[][] game.C_100258_lm.field_106494_b
		// @183: iload #8
		// @185: aaload
		// @186: iload #11
		// @188: fload #13
		// @18A: fastore
		// @18B: iload #6
		// @18D: ifeq @194
		// @190: fload #13
		// @192: fstore #9
		// @194: iload #10
		// @196: iload #7
		// @198: imul
		// @199: istore #10
		// @19B: iinc #11 +1
		// @19E: goto @15A
		// @1A1: iinc #8 +1
		// @1A4: goto @148
		// @1A7: goto @204
		// @1AA: iconst_0
		// @1AB: istore #8
		// @1AD: iload #8
		// @1AF: aload_0
		// @1B0: getfield int game.C_100258_lm.field_106496_a
		// @1B3: if_icmpge @204
		// @1B6: fconst_0
		// @1B7: fstore #9
		// @1B9: iload #8
		// @1BB: aload_0
		// @1BC: getfield int game.C_100258_lm.field_106495_c
		// @1BF: imul
		// @1C0: istore #10
		// @1C2: iconst_0
		// @1C3: istore #11
		// @1C5: iload #11
		// @1C7: aload_0
		// @1C8: getfield int game.C_100258_lm.field_106495_c
		// @1CB: if_icmpge @1FE
		// @1CE: aload_0
		// @1CF: getfield int[] game.C_100258_lm.field_106491_f
		// @1D2: iload #10
		// @1D4: iaload
		// @1D5: i2f
		// @1D6: fload #4
		// @1D8: fmul
		// @1D9: fload_3
		// @1DA: fadd
		// @1DB: fload #9
		// @1DD: fadd
		// @1DE: fstore #12
		// @1E0: aload_0
		// @1E1: getfield float[][] game.C_100258_lm.field_106494_b
		// @1E4: iload #8
		// @1E6: aaload
		// @1E7: iload #11
		// @1E9: fload #12
		// @1EB: fastore
		// @1EC: iload #6
		// @1EE: ifeq @1F5
		// @1F1: fload #12
		// @1F3: fstore #9
		// @1F5: iinc #10 +1
		// @1F8: iinc #11 +1
		// @1FB: goto @1C5
		// @1FE: iinc #8 +1
		// @201: goto @1AD
		// @204: return
	}
}
