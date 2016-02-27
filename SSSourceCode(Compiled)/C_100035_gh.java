package game;

final class C_100035_gh
{
	static int[][] field_104051_b;
	private int[][][] field_104054_h;
	private static float field_104052_c;
	private static float[][] field_104048_g;
	static int field_104049_d;
	private int[][][] field_104053_a;
	int[] field_104047_f;
	private int[] field_104050_e;
	
	public static void func_104044_a()
	{
		// @0: aconst_null
		// @1: checkcast float[][]
		// @4: putstatic float[][] game.C_100035_gh.field_104048_g
		// @7: aconst_null
		// @8: checkcast int[][]
		// @B: putstatic int[][] game.C_100035_gh.field_104051_b
		// @E: return
	}
	
	private final float func_104043_b(int arg0, int arg1, float arg2)
	{
		// @00: aload_0
		// @01: getfield int[][][] game.C_100035_gh.field_104053_a
		// @04: iload_1
		// @05: aaload
		// @06: iconst_0
		// @07: aaload
		// @08: iload_2
		// @09: iaload
		// @0A: i2f
		// @0B: fload_3
		// @0C: aload_0
		// @0D: getfield int[][][] game.C_100035_gh.field_104053_a
		// @10: iload_1
		// @11: aaload
		// @12: iconst_1
		// @13: aaload
		// @14: iload_2
		// @15: iaload
		// @16: aload_0
		// @17: getfield int[][][] game.C_100035_gh.field_104053_a
		// @1A: iload_1
		// @1B: aaload
		// @1C: iconst_0
		// @1D: aaload
		// @1E: iload_2
		// @1F: iaload
		// @20: isub
		// @21: i2f
		// @22: fmul
		// @23: fadd
		// @24: fstore #4
		// @26: fload #4
		// @28: ldc 0.0015258789
		// @2A: fmul
		// @2B: fstore #4
		// @2D: fconst_1
		// @2E: ldc2_w 10.0
		// @31: fload #4
		// @33: fneg
		// @34: ldc 20.0
		// @36: fdiv
		// @37: f2d
		// @38: invokestatic java.lang.Math.pow(double, double)double
		// @3B: d2f
		// @3C: fsub
		// @3D: freturn
	}
	
	private final float func_104046_a(int arg0, int arg1, float arg2)
	{
		// @00: aload_0
		// @01: getfield int[][][] game.C_100035_gh.field_104054_h
		// @04: iload_1
		// @05: aaload
		// @06: iconst_0
		// @07: aaload
		// @08: iload_2
		// @09: iaload
		// @0A: i2f
		// @0B: fload_3
		// @0C: aload_0
		// @0D: getfield int[][][] game.C_100035_gh.field_104054_h
		// @10: iload_1
		// @11: aaload
		// @12: iconst_1
		// @13: aaload
		// @14: iload_2
		// @15: iaload
		// @16: aload_0
		// @17: getfield int[][][] game.C_100035_gh.field_104054_h
		// @1A: iload_1
		// @1B: aaload
		// @1C: iconst_0
		// @1D: aaload
		// @1E: iload_2
		// @1F: iaload
		// @20: isub
		// @21: i2f
		// @22: fmul
		// @23: fadd
		// @24: fstore #4
		// @26: fload #4
		// @28: ldc 1.2207031E-4
		// @2A: fmul
		// @2B: fstore #4
		// @2D: fload #4
		// @2F: invokestatic game.C_100035_gh.func_104042_a(float)float
		// @32: freturn
	}
	
	private static final float func_104042_a(float arg0)
	{
		// @00: ldc 32.703197
		// @02: ldc2_w 2.0
		// @05: fload_0
		// @06: f2d
		// @07: invokestatic java.lang.Math.pow(double, double)double
		// @0A: d2f
		// @0B: fmul
		// @0C: fstore_1
		// @0D: fload_1
		// @0E: ldc 3.1415927
		// @10: fmul
		// @11: ldc 11025.0
		// @13: fdiv
		// @14: freturn
	}
	
	final int func_104045_a(int arg0, float arg1)
	{
		// @000: iload_1
		// @001: ifne @03B
		// @004: aload_0
		// @005: getfield int[] game.C_100035_gh.field_104050_e
		// @008: iconst_0
		// @009: iaload
		// @00A: i2f
		// @00B: aload_0
		// @00C: getfield int[] game.C_100035_gh.field_104050_e
		// @00F: iconst_1
		// @010: iaload
		// @011: aload_0
		// @012: getfield int[] game.C_100035_gh.field_104050_e
		// @015: iconst_0
		// @016: iaload
		// @017: isub
		// @018: i2f
		// @019: fload_2
		// @01A: fmul
		// @01B: fadd
		// @01C: fstore_3
		// @01D: fload_3
		// @01E: ldc 0.0030517578
		// @020: fmul
		// @021: fstore_3
		// @022: ldc2_w 0.1
		// @025: fload_3
		// @026: ldc 20.0
		// @028: fdiv
		// @029: f2d
		// @02A: invokestatic java.lang.Math.pow(double, double)double
		// @02D: d2f
		// @02E: putstatic float game.C_100035_gh.field_104052_c
		// @031: getstatic float game.C_100035_gh.field_104052_c
		// @034: ldc 65536.0
		// @036: fmul
		// @037: f2i
		// @038: putstatic int game.C_100035_gh.field_104049_d
		// @03B: aload_0
		// @03C: getfield int[] game.C_100035_gh.field_104047_f
		// @03F: iload_1
		// @040: iaload
		// @041: ifne @046
		// @044: iconst_0
		// @045: ireturn
		// @046: aload_0
		// @047: iload_1
		// @048: iconst_0
		// @049: fload_2
		// @04A: invokespecial game.C_100035_gh.func_104043_b(int, int, float)float
		// @04D: fstore_3
		// @04E: getstatic float[][] game.C_100035_gh.field_104048_g
		// @051: iload_1
		// @052: aaload
		// @053: iconst_0
		// @054: ldc -2.0
		// @056: fload_3
		// @057: fmul
		// @058: aload_0
		// @059: iload_1
		// @05A: iconst_0
		// @05B: fload_2
		// @05C: invokespecial game.C_100035_gh.func_104046_a(int, int, float)float
		// @05F: f2d
		// @060: invokestatic java.lang.Math.cos(double)double
		// @063: d2f
		// @064: fmul
		// @065: fastore
		// @066: getstatic float[][] game.C_100035_gh.field_104048_g
		// @069: iload_1
		// @06A: aaload
		// @06B: iconst_1
		// @06C: fload_3
		// @06D: fload_3
		// @06E: fmul
		// @06F: fastore
		// @070: iconst_1
		// @071: istore #4
		// @073: iload #4
		// @075: aload_0
		// @076: getfield int[] game.C_100035_gh.field_104047_f
		// @079: iload_1
		// @07A: iaload
		// @07B: if_icmpge @147
		// @07E: aload_0
		// @07F: iload_1
		// @080: iload #4
		// @082: fload_2
		// @083: invokespecial game.C_100035_gh.func_104043_b(int, int, float)float
		// @086: fstore_3
		// @087: ldc -2.0
		// @089: fload_3
		// @08A: fmul
		// @08B: aload_0
		// @08C: iload_1
		// @08D: iload #4
		// @08F: fload_2
		// @090: invokespecial game.C_100035_gh.func_104046_a(int, int, float)float
		// @093: f2d
		// @094: invokestatic java.lang.Math.cos(double)double
		// @097: d2f
		// @098: fmul
		// @099: fstore #5
		// @09B: fload_3
		// @09C: fload_3
		// @09D: fmul
		// @09E: fstore #6
		// @0A0: getstatic float[][] game.C_100035_gh.field_104048_g
		// @0A3: iload_1
		// @0A4: aaload
		// @0A5: iload #4
		// @0A7: iconst_2
		// @0A8: imul
		// @0A9: iconst_1
		// @0AA: iadd
		// @0AB: getstatic float[][] game.C_100035_gh.field_104048_g
		// @0AE: iload_1
		// @0AF: aaload
		// @0B0: iload #4
		// @0B2: iconst_2
		// @0B3: imul
		// @0B4: iconst_1
		// @0B5: isub
		// @0B6: faload
		// @0B7: fload #6
		// @0B9: fmul
		// @0BA: fastore
		// @0BB: getstatic float[][] game.C_100035_gh.field_104048_g
		// @0BE: iload_1
		// @0BF: aaload
		// @0C0: iload #4
		// @0C2: iconst_2
		// @0C3: imul
		// @0C4: getstatic float[][] game.C_100035_gh.field_104048_g
		// @0C7: iload_1
		// @0C8: aaload
		// @0C9: iload #4
		// @0CB: iconst_2
		// @0CC: imul
		// @0CD: iconst_1
		// @0CE: isub
		// @0CF: faload
		// @0D0: fload #5
		// @0D2: fmul
		// @0D3: getstatic float[][] game.C_100035_gh.field_104048_g
		// @0D6: iload_1
		// @0D7: aaload
		// @0D8: iload #4
		// @0DA: iconst_2
		// @0DB: imul
		// @0DC: iconst_2
		// @0DD: isub
		// @0DE: faload
		// @0DF: fload #6
		// @0E1: fmul
		// @0E2: fadd
		// @0E3: fastore
		// @0E4: iload #4
		// @0E6: iconst_2
		// @0E7: imul
		// @0E8: iconst_1
		// @0E9: isub
		// @0EA: istore #7
		// @0EC: iload #7
		// @0EE: iconst_2
		// @0EF: if_icmplt @11E
		// @0F2: getstatic float[][] game.C_100035_gh.field_104048_g
		// @0F5: iload_1
		// @0F6: aaload
		// @0F7: iload #7
		// @0F9: dup2
		// @0FA: faload
		// @0FB: getstatic float[][] game.C_100035_gh.field_104048_g
		// @0FE: iload_1
		// @0FF: aaload
		// @100: iload #7
		// @102: iconst_1
		// @103: isub
		// @104: faload
		// @105: fload #5
		// @107: fmul
		// @108: getstatic float[][] game.C_100035_gh.field_104048_g
		// @10B: iload_1
		// @10C: aaload
		// @10D: iload #7
		// @10F: iconst_2
		// @110: isub
		// @111: faload
		// @112: fload #6
		// @114: fmul
		// @115: fadd
		// @116: fadd
		// @117: fastore
		// @118: iinc #7 +255
		// @11B: goto @0EC
		// @11E: getstatic float[][] game.C_100035_gh.field_104048_g
		// @121: iload_1
		// @122: aaload
		// @123: iconst_1
		// @124: dup2
		// @125: faload
		// @126: getstatic float[][] game.C_100035_gh.field_104048_g
		// @129: iload_1
		// @12A: aaload
		// @12B: iconst_0
		// @12C: faload
		// @12D: fload #5
		// @12F: fmul
		// @130: fload #6
		// @132: fadd
		// @133: fadd
		// @134: fastore
		// @135: getstatic float[][] game.C_100035_gh.field_104048_g
		// @138: iload_1
		// @139: aaload
		// @13A: iconst_0
		// @13B: dup2
		// @13C: faload
		// @13D: fload #5
		// @13F: fadd
		// @140: fastore
		// @141: iinc #4 +1
		// @144: goto @073
		// @147: iload_1
		// @148: ifne @16F
		// @14B: iconst_0
		// @14C: istore #4
		// @14E: iload #4
		// @150: aload_0
		// @151: getfield int[] game.C_100035_gh.field_104047_f
		// @154: iconst_0
		// @155: iaload
		// @156: iconst_2
		// @157: imul
		// @158: if_icmpge @16F
		// @15B: getstatic float[][] game.C_100035_gh.field_104048_g
		// @15E: iconst_0
		// @15F: aaload
		// @160: iload #4
		// @162: dup2
		// @163: faload
		// @164: getstatic float game.C_100035_gh.field_104052_c
		// @167: fmul
		// @168: fastore
		// @169: iinc #4 +1
		// @16C: goto @14E
		// @16F: iconst_0
		// @170: istore #4
		// @172: iload #4
		// @174: aload_0
		// @175: getfield int[] game.C_100035_gh.field_104047_f
		// @178: iload_1
		// @179: iaload
		// @17A: iconst_2
		// @17B: imul
		// @17C: if_icmpge @199
		// @17F: getstatic int[][] game.C_100035_gh.field_104051_b
		// @182: iload_1
		// @183: aaload
		// @184: iload #4
		// @186: getstatic float[][] game.C_100035_gh.field_104048_g
		// @189: iload_1
		// @18A: aaload
		// @18B: iload #4
		// @18D: faload
		// @18E: ldc 65536.0
		// @190: fmul
		// @191: f2i
		// @192: iastore
		// @193: iinc #4 +1
		// @196: goto @172
		// @199: aload_0
		// @19A: getfield int[] game.C_100035_gh.field_104047_f
		// @19D: iload_1
		// @19E: iaload
		// @19F: iconst_2
		// @1A0: imul
		// @1A1: ireturn
	}
	
	final void func_104041_a(C_100280_nf arg0, C_100150_bb arg1)
	{
		// @000: aload_1
		// @001: iconst_0
		// @002: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @005: istore_3
		// @006: aload_0
		// @007: getfield int[] game.C_100035_gh.field_104047_f
		// @00A: iconst_0
		// @00B: iload_3
		// @00C: iconst_4
		// @00D: ishr
		// @00E: iastore
		// @00F: aload_0
		// @010: getfield int[] game.C_100035_gh.field_104047_f
		// @013: iconst_1
		// @014: iload_3
		// @015: bipush 15 (0x0F)
		// @017: iand
		// @018: iastore
		// @019: iload_3
		// @01A: ifeq @12A
		// @01D: aload_0
		// @01E: getfield int[] game.C_100035_gh.field_104050_e
		// @021: iconst_0
		// @022: aload_1
		// @023: bipush -2 (0xFE)
		// @025: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @028: iastore
		// @029: aload_0
		// @02A: getfield int[] game.C_100035_gh.field_104050_e
		// @02D: iconst_1
		// @02E: aload_1
		// @02F: bipush -2 (0xFE)
		// @031: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @034: iastore
		// @035: aload_1
		// @036: iconst_0
		// @037: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @03A: istore #4
		// @03C: iconst_0
		// @03D: istore #5
		// @03F: iload #5
		// @041: iconst_2
		// @042: if_icmpge @084
		// @045: iconst_0
		// @046: istore #6
		// @048: iload #6
		// @04A: aload_0
		// @04B: getfield int[] game.C_100035_gh.field_104047_f
		// @04E: iload #5
		// @050: iaload
		// @051: if_icmpge @07E
		// @054: aload_0
		// @055: getfield int[][][] game.C_100035_gh.field_104054_h
		// @058: iload #5
		// @05A: aaload
		// @05B: iconst_0
		// @05C: aaload
		// @05D: iload #6
		// @05F: aload_1
		// @060: bipush -2 (0xFE)
		// @062: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @065: iastore
		// @066: aload_0
		// @067: getfield int[][][] game.C_100035_gh.field_104053_a
		// @06A: iload #5
		// @06C: aaload
		// @06D: iconst_0
		// @06E: aaload
		// @06F: iload #6
		// @071: aload_1
		// @072: bipush -2 (0xFE)
		// @074: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @077: iastore
		// @078: iinc #6 +1
		// @07B: goto @048
		// @07E: iinc #5 +1
		// @081: goto @03F
		// @084: iconst_0
		// @085: istore #5
		// @087: iload #5
		// @089: iconst_2
		// @08A: if_icmpge @10E
		// @08D: iconst_0
		// @08E: istore #6
		// @090: iload #6
		// @092: aload_0
		// @093: getfield int[] game.C_100035_gh.field_104047_f
		// @096: iload #5
		// @098: iaload
		// @099: if_icmpge @108
		// @09C: iload #4
		// @09E: iconst_1
		// @09F: iload #5
		// @0A1: iconst_4
		// @0A2: imul
		// @0A3: ishl
		// @0A4: iload #6
		// @0A6: ishl
		// @0A7: iand
		// @0A8: ifeq @0D2
		// @0AB: aload_0
		// @0AC: getfield int[][][] game.C_100035_gh.field_104054_h
		// @0AF: iload #5
		// @0B1: aaload
		// @0B2: iconst_1
		// @0B3: aaload
		// @0B4: iload #6
		// @0B6: aload_1
		// @0B7: bipush -2 (0xFE)
		// @0B9: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @0BC: iastore
		// @0BD: aload_0
		// @0BE: getfield int[][][] game.C_100035_gh.field_104053_a
		// @0C1: iload #5
		// @0C3: aaload
		// @0C4: iconst_1
		// @0C5: aaload
		// @0C6: iload #6
		// @0C8: aload_1
		// @0C9: bipush -2 (0xFE)
		// @0CB: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @0CE: iastore
		// @0CF: goto @102
		// @0D2: aload_0
		// @0D3: getfield int[][][] game.C_100035_gh.field_104054_h
		// @0D6: iload #5
		// @0D8: aaload
		// @0D9: iconst_1
		// @0DA: aaload
		// @0DB: iload #6
		// @0DD: aload_0
		// @0DE: getfield int[][][] game.C_100035_gh.field_104054_h
		// @0E1: iload #5
		// @0E3: aaload
		// @0E4: iconst_0
		// @0E5: aaload
		// @0E6: iload #6
		// @0E8: iaload
		// @0E9: iastore
		// @0EA: aload_0
		// @0EB: getfield int[][][] game.C_100035_gh.field_104053_a
		// @0EE: iload #5
		// @0F0: aaload
		// @0F1: iconst_1
		// @0F2: aaload
		// @0F3: iload #6
		// @0F5: aload_0
		// @0F6: getfield int[][][] game.C_100035_gh.field_104053_a
		// @0F9: iload #5
		// @0FB: aaload
		// @0FC: iconst_0
		// @0FD: aaload
		// @0FE: iload #6
		// @100: iaload
		// @101: iastore
		// @102: iinc #6 +1
		// @105: goto @090
		// @108: iinc #5 +1
		// @10B: goto @087
		// @10E: iload #4
		// @110: ifne @122
		// @113: aload_0
		// @114: getfield int[] game.C_100035_gh.field_104050_e
		// @117: iconst_1
		// @118: iaload
		// @119: aload_0
		// @11A: getfield int[] game.C_100035_gh.field_104050_e
		// @11D: iconst_0
		// @11E: iaload
		// @11F: if_icmpeq @127
		// @122: aload_2
		// @123: aload_1
		// @124: invokevirtual game.C_100150_bb.func_105163_a(game.C_100280_nf)void
		// @127: goto @13C
		// @12A: aload_0
		// @12B: getfield int[] game.C_100035_gh.field_104050_e
		// @12E: astore #4
		// @130: aload_0
		// @131: getfield int[] game.C_100035_gh.field_104050_e
		// @134: iconst_1
		// @135: iconst_0
		// @136: iastore
		// @137: aload #4
		// @139: iconst_0
		// @13A: iconst_0
		// @13B: iastore
		// @13C: return
	}
	
	C_100035_gh()
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iconst_2
		// @06: iconst_2
		// @07: iconst_4
		// @08: multianewarray int[][][] (init: 3)
		// @0C: putfield int[][][] game.C_100035_gh.field_104054_h
		// @0F: aload_0
		// @10: iconst_2
		// @11: newarray int[]
		// @13: putfield int[] game.C_100035_gh.field_104050_e
		// @16: aload_0
		// @17: iconst_2
		// @18: newarray int[]
		// @1A: putfield int[] game.C_100035_gh.field_104047_f
		// @1D: aload_0
		// @1E: iconst_2
		// @1F: iconst_2
		// @20: iconst_4
		// @21: multianewarray int[][][] (init: 3)
		// @25: putfield int[][][] game.C_100035_gh.field_104053_a
		// @28: return
	}
	
	static
	{
		// @00: iconst_2
		// @01: bipush 8 (0x08)
		// @03: multianewarray int[][] (init: 2)
		// @07: putstatic int[][] game.C_100035_gh.field_104051_b
		// @0A: iconst_2
		// @0B: bipush 8 (0x08)
		// @0D: multianewarray float[][] (init: 2)
		// @11: putstatic float[][] game.C_100035_gh.field_104048_g
		// @14: return
	}
}
