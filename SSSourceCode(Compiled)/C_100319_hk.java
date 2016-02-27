package game;

import java.io.IOException;

final class C_100319_hk extends C_100158_da
{
	private static float[] field_101448_o;
	private boolean field_101441_H;
	private static int[] field_101439_N;
	private static float[] field_101445_Q;
	private int field_101438_M;
	private byte[][] field_101456_t;
	private int field_101459_q;
	private static C_100173_sa[] field_101460_p;
	private static int[] field_101442_I;
	static C_100258_lm[] field_101450_m;
	private int field_101458_r;
	private static float[] field_101463_x;
	private static float[] field_101447_n;
	private int field_101452_k;
	private static int[] field_101433_G;
	private static int field_101453_w;
	private static boolean[] field_101432_F;
	private static C_100039_wd[] field_101437_L;
	private int field_101454_v;
	private float[] field_101462_y;
	private static int field_101451_j;
	private static float[] field_101431_E;
	private static C_100241_og[] field_101457_s;
	private static float[] field_101440_O;
	private byte[] field_101434_A;
	private static int field_101430_D;
	private boolean field_101435_B;
	private int field_101449_l;
	private int field_101443_J;
	private static int field_101461_z;
	private static boolean field_101455_u;
	private static byte[] field_101444_K;
	private static float[] field_101446_P;
	private int field_101436_C;
	
	static final void func_101421_a(byte[] arg0)
	{
		// @000: aload_0
		// @001: iconst_0
		// @002: invokestatic game.C_100319_hk.func_101418_a(byte[], int)void
		// @005: iconst_1
		// @006: iconst_4
		// @007: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @00A: ishl
		// @00B: putstatic int game.C_100319_hk.field_101451_j
		// @00E: iconst_1
		// @00F: iconst_4
		// @010: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @013: ishl
		// @014: putstatic int game.C_100319_hk.field_101430_D
		// @017: getstatic int game.C_100319_hk.field_101430_D
		// @01A: newarray float[]
		// @01C: putstatic float[] game.C_100319_hk.field_101463_x
		// @01F: iconst_0
		// @020: istore_1
		// @021: iload_1
		// @022: iconst_2
		// @023: if_icmpge @185
		// @026: iload_1
		// @027: ifeq @030
		// @02A: getstatic int game.C_100319_hk.field_101430_D
		// @02D: goto @033
		// @030: getstatic int game.C_100319_hk.field_101451_j
		// @033: istore_2
		// @034: iload_2
		// @035: iconst_1
		// @036: ishr
		// @037: istore_3
		// @038: iload_2
		// @039: iconst_2
		// @03A: ishr
		// @03B: istore #4
		// @03D: iload_2
		// @03E: iconst_3
		// @03F: ishr
		// @040: istore #5
		// @042: iload_3
		// @043: newarray float[]
		// @045: astore #6
		// @047: iconst_0
		// @048: istore #7
		// @04A: iload #7
		// @04C: iload #4
		// @04E: if_icmpge @088
		// @051: aload #6
		// @053: iconst_2
		// @054: iload #7
		// @056: imul
		// @057: iconst_4
		// @058: iload #7
		// @05A: imul
		// @05B: i2d
		// @05C: ldc2_w 3.141592653589793
		// @05F: dmul
		// @060: iload_2
		// @061: i2d
		// @062: ddiv
		// @063: invokestatic java.lang.Math.cos(double)double
		// @066: d2f
		// @067: fastore
		// @068: aload #6
		// @06A: iconst_2
		// @06B: iload #7
		// @06D: imul
		// @06E: iconst_1
		// @06F: iadd
		// @070: iconst_4
		// @071: iload #7
		// @073: imul
		// @074: i2d
		// @075: ldc2_w 3.141592653589793
		// @078: dmul
		// @079: iload_2
		// @07A: i2d
		// @07B: ddiv
		// @07C: invokestatic java.lang.Math.sin(double)double
		// @07F: d2f
		// @080: fneg
		// @081: fastore
		// @082: iinc #7 +1
		// @085: goto @04A
		// @088: iload_3
		// @089: newarray float[]
		// @08B: astore #7
		// @08D: iconst_0
		// @08E: istore #8
		// @090: iload #8
		// @092: iload #4
		// @094: if_icmpge @0D5
		// @097: aload #7
		// @099: iconst_2
		// @09A: iload #8
		// @09C: imul
		// @09D: iconst_2
		// @09E: iload #8
		// @0A0: imul
		// @0A1: iconst_1
		// @0A2: iadd
		// @0A3: i2d
		// @0A4: ldc2_w 3.141592653589793
		// @0A7: dmul
		// @0A8: iconst_2
		// @0A9: iload_2
		// @0AA: imul
		// @0AB: i2d
		// @0AC: ddiv
		// @0AD: invokestatic java.lang.Math.cos(double)double
		// @0B0: d2f
		// @0B1: fastore
		// @0B2: aload #7
		// @0B4: iconst_2
		// @0B5: iload #8
		// @0B7: imul
		// @0B8: iconst_1
		// @0B9: iadd
		// @0BA: iconst_2
		// @0BB: iload #8
		// @0BD: imul
		// @0BE: iconst_1
		// @0BF: iadd
		// @0C0: i2d
		// @0C1: ldc2_w 3.141592653589793
		// @0C4: dmul
		// @0C5: iconst_2
		// @0C6: iload_2
		// @0C7: imul
		// @0C8: i2d
		// @0C9: ddiv
		// @0CA: invokestatic java.lang.Math.sin(double)double
		// @0CD: d2f
		// @0CE: fastore
		// @0CF: iinc #8 +1
		// @0D2: goto @090
		// @0D5: iload #4
		// @0D7: newarray float[]
		// @0D9: astore #8
		// @0DB: iconst_0
		// @0DC: istore #9
		// @0DE: iload #9
		// @0E0: iload #5
		// @0E2: if_icmpge @120
		// @0E5: aload #8
		// @0E7: iconst_2
		// @0E8: iload #9
		// @0EA: imul
		// @0EB: iconst_4
		// @0EC: iload #9
		// @0EE: imul
		// @0EF: iconst_2
		// @0F0: iadd
		// @0F1: i2d
		// @0F2: ldc2_w 3.141592653589793
		// @0F5: dmul
		// @0F6: iload_2
		// @0F7: i2d
		// @0F8: ddiv
		// @0F9: invokestatic java.lang.Math.cos(double)double
		// @0FC: d2f
		// @0FD: fastore
		// @0FE: aload #8
		// @100: iconst_2
		// @101: iload #9
		// @103: imul
		// @104: iconst_1
		// @105: iadd
		// @106: iconst_4
		// @107: iload #9
		// @109: imul
		// @10A: iconst_2
		// @10B: iadd
		// @10C: i2d
		// @10D: ldc2_w 3.141592653589793
		// @110: dmul
		// @111: iload_2
		// @112: i2d
		// @113: ddiv
		// @114: invokestatic java.lang.Math.sin(double)double
		// @117: d2f
		// @118: fneg
		// @119: fastore
		// @11A: iinc #9 +1
		// @11D: goto @0DE
		// @120: iload #5
		// @122: newarray int[]
		// @124: astore #9
		// @126: iload #5
		// @128: iconst_1
		// @129: isub
		// @12A: sipush 18986 (0x4A2A)
		// @12D: invokestatic game.C_100310_lj.func_100538_b(int, int)int
		// @130: istore #10
		// @132: iconst_0
		// @133: istore #11
		// @135: iload #11
		// @137: iload #5
		// @139: if_icmpge @150
		// @13C: aload #9
		// @13E: iload #11
		// @140: iload #10
		// @142: ldc 1711582056 (0x6604ab68)
		// @144: iload #11
		// @146: invokestatic game.C_100249_pc.func_102318_a(int, int, int)int
		// @149: iastore
		// @14A: iinc #11 +1
		// @14D: goto @135
		// @150: iload_1
		// @151: ifeq @16B
		// @154: aload #6
		// @156: putstatic float[] game.C_100319_hk.field_101431_E
		// @159: aload #7
		// @15B: putstatic float[] game.C_100319_hk.field_101448_o
		// @15E: aload #8
		// @160: putstatic float[] game.C_100319_hk.field_101446_P
		// @163: aload #9
		// @165: putstatic int[] game.C_100319_hk.field_101442_I
		// @168: goto @17F
		// @16B: aload #6
		// @16D: putstatic float[] game.C_100319_hk.field_101447_n
		// @170: aload #7
		// @172: putstatic float[] game.C_100319_hk.field_101445_Q
		// @175: aload #8
		// @177: putstatic float[] game.C_100319_hk.field_101440_O
		// @17A: aload #9
		// @17C: putstatic int[] game.C_100319_hk.field_101433_G
		// @17F: iinc #1 +1
		// @182: goto @021
		// @185: bipush 8 (0x08)
		// @187: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @18A: iconst_1
		// @18B: iadd
		// @18C: istore_1
		// @18D: iload_1
		// @18E: anewarray game.C_100258_lm
		// @191: putstatic game.C_100258_lm[] game.C_100319_hk.field_101450_m
		// @194: iconst_0
		// @195: istore_2
		// @196: iload_2
		// @197: iload_1
		// @198: if_icmpge @1AD
		// @19B: getstatic game.C_100258_lm[] game.C_100319_hk.field_101450_m
		// @19E: iload_2
		// @19F: new game.C_100258_lm
		// @1A2: dup
		// @1A3: invokespecial game.C_100258_lm.<init>()void
		// @1A6: aastore
		// @1A7: iinc #2 +1
		// @1AA: goto @196
		// @1AD: bipush 6 (0x06)
		// @1AF: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @1B2: iconst_1
		// @1B3: iadd
		// @1B4: istore_2
		// @1B5: iconst_0
		// @1B6: istore_3
		// @1B7: iload_3
		// @1B8: iload_2
		// @1B9: if_icmpge @1C8
		// @1BC: bipush 16 (0x10)
		// @1BE: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @1C1: pop
		// @1C2: iinc #3 +1
		// @1C5: goto @1B7
		// @1C8: bipush 6 (0x06)
		// @1CA: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @1CD: iconst_1
		// @1CE: iadd
		// @1CF: istore_2
		// @1D0: iload_2
		// @1D1: anewarray game.C_100173_sa
		// @1D4: putstatic game.C_100173_sa[] game.C_100319_hk.field_101460_p
		// @1D7: iconst_0
		// @1D8: istore_3
		// @1D9: iload_3
		// @1DA: iload_2
		// @1DB: if_icmpge @1F0
		// @1DE: getstatic game.C_100173_sa[] game.C_100319_hk.field_101460_p
		// @1E1: iload_3
		// @1E2: new game.C_100173_sa
		// @1E5: dup
		// @1E6: invokespecial game.C_100173_sa.<init>()void
		// @1E9: aastore
		// @1EA: iinc #3 +1
		// @1ED: goto @1D9
		// @1F0: bipush 6 (0x06)
		// @1F2: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @1F5: iconst_1
		// @1F6: iadd
		// @1F7: istore_3
		// @1F8: iload_3
		// @1F9: anewarray game.C_100241_og
		// @1FC: putstatic game.C_100241_og[] game.C_100319_hk.field_101457_s
		// @1FF: iconst_0
		// @200: istore #4
		// @202: iload #4
		// @204: iload_3
		// @205: if_icmpge @21B
		// @208: getstatic game.C_100241_og[] game.C_100319_hk.field_101457_s
		// @20B: iload #4
		// @20D: new game.C_100241_og
		// @210: dup
		// @211: invokespecial game.C_100241_og.<init>()void
		// @214: aastore
		// @215: iinc #4 +1
		// @218: goto @202
		// @21B: bipush 6 (0x06)
		// @21D: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @220: iconst_1
		// @221: iadd
		// @222: istore #4
		// @224: iload #4
		// @226: anewarray game.C_100039_wd
		// @229: putstatic game.C_100039_wd[] game.C_100319_hk.field_101437_L
		// @22C: iconst_0
		// @22D: istore #5
		// @22F: iload #5
		// @231: iload #4
		// @233: if_icmpge @249
		// @236: getstatic game.C_100039_wd[] game.C_100319_hk.field_101437_L
		// @239: iload #5
		// @23B: new game.C_100039_wd
		// @23E: dup
		// @23F: invokespecial game.C_100039_wd.<init>()void
		// @242: aastore
		// @243: iinc #5 +1
		// @246: goto @22F
		// @249: bipush 6 (0x06)
		// @24B: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @24E: iconst_1
		// @24F: iadd
		// @250: istore #5
		// @252: iload #5
		// @254: newarray boolean[]
		// @256: putstatic boolean[] game.C_100319_hk.field_101432_F
		// @259: iload #5
		// @25B: newarray int[]
		// @25D: putstatic int[] game.C_100319_hk.field_101439_N
		// @260: iconst_0
		// @261: istore #6
		// @263: iload #6
		// @265: iload #5
		// @267: if_icmpge @298
		// @26A: getstatic boolean[] game.C_100319_hk.field_101432_F
		// @26D: iload #6
		// @26F: invokestatic game.C_100319_hk.func_101426_a()int
		// @272: ifeq @279
		// @275: iconst_1
		// @276: goto @27A
		// @279: iconst_0
		// @27A: bastore
		// @27B: bipush 16 (0x10)
		// @27D: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @280: pop
		// @281: bipush 16 (0x10)
		// @283: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @286: pop
		// @287: getstatic int[] game.C_100319_hk.field_101439_N
		// @28A: iload #6
		// @28C: bipush 8 (0x08)
		// @28E: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @291: iastore
		// @292: iinc #6 +1
		// @295: goto @263
		// @298: iconst_1
		// @299: putstatic boolean game.C_100319_hk.field_101455_u
		// @29C: return
	}
	
	static final float func_101428_e(int arg0)
	{
		// @00: iload_0
		// @01: ldc 2097151 (0x1fffff)
		// @03: iand
		// @04: istore_1
		// @05: iload_0
		// @06: ldc -2147483648 (0x80000000)
		// @08: iand
		// @09: istore_2
		// @0A: iload_0
		// @0B: ldc 2145386496 (0x7fe00000)
		// @0D: iand
		// @0E: bipush 21 (0x15)
		// @10: ishr
		// @11: istore_3
		// @12: iload_2
		// @13: ifeq @19
		// @16: iload_1
		// @17: ineg
		// @18: istore_1
		// @19: iload_1
		// @1A: i2d
		// @1B: ldc2_w 2.0
		// @1E: iload_3
		// @1F: sipush 788 (0x0314)
		// @22: isub
		// @23: i2d
		// @24: invokestatic java.lang.Math.pow(double, double)double
		// @27: dmul
		// @28: d2f
		// @29: freturn
	}
	
	final C_100214_al func_101424_c()
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: putfield int game.C_100319_hk.field_101438_M
		// @05: aload_0
		// @06: getstatic int game.C_100319_hk.field_101430_D
		// @09: newarray float[]
		// @0B: putfield float[] game.C_100319_hk.field_101462_y
		// @0E: aload_0
		// @0F: getfield int game.C_100319_hk.field_101454_v
		// @12: newarray byte[]
		// @14: astore_1
		// @15: iconst_0
		// @16: istore_2
		// @17: iconst_0
		// @18: istore_3
		// @19: iload_3
		// @1A: aload_0
		// @1B: getfield byte[][] game.C_100319_hk.field_101456_t
		// @1E: arraylength
		// @1F: if_icmpge @89
		// @22: aload_0
		// @23: iload_3
		// @24: invokespecial game.C_100319_hk.func_101425_g(int)float[]
		// @27: astore #4
		// @29: aload #4
		// @2B: ifnull @83
		// @2E: aload #4
		// @30: arraylength
		// @31: istore #5
		// @33: iload #5
		// @35: aload_0
		// @36: getfield int game.C_100319_hk.field_101454_v
		// @39: iload_2
		// @3A: isub
		// @3B: if_icmple @46
		// @3E: aload_0
		// @3F: getfield int game.C_100319_hk.field_101454_v
		// @42: iload_2
		// @43: isub
		// @44: istore #5
		// @46: iconst_0
		// @47: istore #6
		// @49: iload #6
		// @4B: iload #5
		// @4D: if_icmpge @83
		// @50: ldc 128.0
		// @52: aload #4
		// @54: iload #6
		// @56: faload
		// @57: ldc 128.0
		// @59: fmul
		// @5A: fadd
		// @5B: f2i
		// @5C: istore #7
		// @5E: iload #7
		// @60: sipush -256 (0xFF00)
		// @63: iand
		// @64: ifeq @70
		// @67: iload #7
		// @69: iconst_m1
		// @6A: ixor
		// @6B: bipush 31 (0x1F)
		// @6D: ishr
		// @6E: istore #7
		// @70: aload_1
		// @71: iload_2
		// @72: iinc #2 +1
		// @75: iload #7
		// @77: sipush 128 (0x0080)
		// @7A: isub
		// @7B: i2b
		// @7C: bastore
		// @7D: iinc #6 +1
		// @80: goto @49
		// @83: iinc #3 +1
		// @86: goto @19
		// @89: aload_0
		// @8A: aconst_null
		// @8B: putfield float[] game.C_100319_hk.field_101462_y
		// @8E: new game.C_100214_al
		// @91: dup
		// @92: aload_0
		// @93: getfield int game.C_100319_hk.field_101436_C
		// @96: aload_1
		// @97: aload_0
		// @98: getfield int game.C_100319_hk.field_101459_q
		// @9B: aload_0
		// @9C: getfield int game.C_100319_hk.field_101458_r
		// @9F: aload_0
		// @A0: getfield boolean game.C_100319_hk.field_101441_H
		// @A3: invokespecial game.C_100214_al.<init>(int, byte[], int, int, boolean)void
		// @A6: areturn
	}
	
	final C_100214_al func_101419_a(int[] arg0)
	{
		// @00: aload_1
		// @01: ifnull @0C
		// @04: aload_1
		// @05: iconst_0
		// @06: iaload
		// @07: ifgt @0C
		// @0A: aconst_null
		// @0B: areturn
		// @0C: aload_0
		// @0D: getfield byte[] game.C_100319_hk.field_101434_A
		// @10: ifnonnull @35
		// @13: aload_0
		// @14: iconst_0
		// @15: putfield int game.C_100319_hk.field_101438_M
		// @18: aload_0
		// @19: getstatic int game.C_100319_hk.field_101430_D
		// @1C: newarray float[]
		// @1E: putfield float[] game.C_100319_hk.field_101462_y
		// @21: aload_0
		// @22: aload_0
		// @23: getfield int game.C_100319_hk.field_101454_v
		// @26: newarray byte[]
		// @28: putfield byte[] game.C_100319_hk.field_101434_A
		// @2B: aload_0
		// @2C: iconst_0
		// @2D: putfield int game.C_100319_hk.field_101449_l
		// @30: aload_0
		// @31: iconst_0
		// @32: putfield int game.C_100319_hk.field_101452_k
		// @35: aload_0
		// @36: getfield int game.C_100319_hk.field_101452_k
		// @39: aload_0
		// @3A: getfield byte[][] game.C_100319_hk.field_101456_t
		// @3D: arraylength
		// @3E: if_icmpge @D7
		// @41: aload_1
		// @42: ifnull @4D
		// @45: aload_1
		// @46: iconst_0
		// @47: iaload
		// @48: ifgt @4D
		// @4B: aconst_null
		// @4C: areturn
		// @4D: aload_0
		// @4E: aload_0
		// @4F: getfield int game.C_100319_hk.field_101452_k
		// @52: invokespecial game.C_100319_hk.func_101425_g(int)float[]
		// @55: astore_2
		// @56: aload_2
		// @57: ifnull @CA
		// @5A: aload_0
		// @5B: getfield int game.C_100319_hk.field_101449_l
		// @5E: istore_3
		// @5F: aload_2
		// @60: arraylength
		// @61: istore #4
		// @63: iload #4
		// @65: aload_0
		// @66: getfield int game.C_100319_hk.field_101454_v
		// @69: iload_3
		// @6A: isub
		// @6B: if_icmple @76
		// @6E: aload_0
		// @6F: getfield int game.C_100319_hk.field_101454_v
		// @72: iload_3
		// @73: isub
		// @74: istore #4
		// @76: iconst_0
		// @77: istore #5
		// @79: iload #5
		// @7B: iload #4
		// @7D: if_icmpge @B5
		// @80: ldc 128.0
		// @82: aload_2
		// @83: iload #5
		// @85: faload
		// @86: ldc 128.0
		// @88: fmul
		// @89: fadd
		// @8A: f2i
		// @8B: istore #6
		// @8D: iload #6
		// @8F: sipush -256 (0xFF00)
		// @92: iand
		// @93: ifeq @9F
		// @96: iload #6
		// @98: iconst_m1
		// @99: ixor
		// @9A: bipush 31 (0x1F)
		// @9C: ishr
		// @9D: istore #6
		// @9F: aload_0
		// @A0: getfield byte[] game.C_100319_hk.field_101434_A
		// @A3: iload_3
		// @A4: iinc #3 +1
		// @A7: iload #6
		// @A9: sipush 128 (0x0080)
		// @AC: isub
		// @AD: i2b
		// @AE: bastore
		// @AF: iinc #5 +1
		// @B2: goto @79
		// @B5: aload_1
		// @B6: ifnull @C5
		// @B9: aload_1
		// @BA: iconst_0
		// @BB: dup2
		// @BC: iaload
		// @BD: iload_3
		// @BE: aload_0
		// @BF: getfield int game.C_100319_hk.field_101449_l
		// @C2: isub
		// @C3: isub
		// @C4: iastore
		// @C5: aload_0
		// @C6: iload_3
		// @C7: putfield int game.C_100319_hk.field_101449_l
		// @CA: aload_0
		// @CB: dup
		// @CC: getfield int game.C_100319_hk.field_101452_k
		// @CF: iconst_1
		// @D0: iadd
		// @D1: putfield int game.C_100319_hk.field_101452_k
		// @D4: goto @35
		// @D7: aload_0
		// @D8: aconst_null
		// @D9: putfield float[] game.C_100319_hk.field_101462_y
		// @DC: aload_0
		// @DD: getfield byte[] game.C_100319_hk.field_101434_A
		// @E0: astore_2
		// @E1: aload_0
		// @E2: aconst_null
		// @E3: putfield byte[] game.C_100319_hk.field_101434_A
		// @E6: new game.C_100214_al
		// @E9: dup
		// @EA: aload_0
		// @EB: getfield int game.C_100319_hk.field_101436_C
		// @EE: aload_2
		// @EF: aload_0
		// @F0: getfield int game.C_100319_hk.field_101459_q
		// @F3: aload_0
		// @F4: getfield int game.C_100319_hk.field_101458_r
		// @F7: aload_0
		// @F8: getfield boolean game.C_100319_hk.field_101441_H
		// @FB: invokespecial game.C_100214_al.<init>(int, byte[], int, int, boolean)void
		// @FE: areturn
	}
	
	static final int func_101422_f(int arg0)
	{
		// @00: iconst_0
		// @01: istore_1
		// @02: iconst_0
		// @03: istore_2
		// @04: iload_0
		// @05: bipush 8 (0x08)
		// @07: getstatic int game.C_100319_hk.field_101461_z
		// @0A: isub
		// @0B: if_icmplt @46
		// @0E: bipush 8 (0x08)
		// @10: getstatic int game.C_100319_hk.field_101461_z
		// @13: isub
		// @14: istore_3
		// @15: iconst_1
		// @16: iload_3
		// @17: ishl
		// @18: iconst_1
		// @19: isub
		// @1A: istore #4
		// @1C: iload_1
		// @1D: getstatic byte[] game.C_100319_hk.field_101444_K
		// @20: getstatic int game.C_100319_hk.field_101453_w
		// @23: baload
		// @24: getstatic int game.C_100319_hk.field_101461_z
		// @27: ishr
		// @28: iload #4
		// @2A: iand
		// @2B: iload_2
		// @2C: ishl
		// @2D: iadd
		// @2E: istore_1
		// @2F: iconst_0
		// @30: putstatic int game.C_100319_hk.field_101461_z
		// @33: getstatic int game.C_100319_hk.field_101453_w
		// @36: iconst_1
		// @37: iadd
		// @38: putstatic int game.C_100319_hk.field_101453_w
		// @3B: iload_2
		// @3C: iload_3
		// @3D: iadd
		// @3E: istore_2
		// @3F: iload_0
		// @40: iload_3
		// @41: isub
		// @42: istore_0
		// @43: goto @04
		// @46: iload_0
		// @47: ifle @6A
		// @4A: iconst_1
		// @4B: iload_0
		// @4C: ishl
		// @4D: iconst_1
		// @4E: isub
		// @4F: istore_3
		// @50: iload_1
		// @51: getstatic byte[] game.C_100319_hk.field_101444_K
		// @54: getstatic int game.C_100319_hk.field_101453_w
		// @57: baload
		// @58: getstatic int game.C_100319_hk.field_101461_z
		// @5B: ishr
		// @5C: iload_3
		// @5D: iand
		// @5E: iload_2
		// @5F: ishl
		// @60: iadd
		// @61: istore_1
		// @62: getstatic int game.C_100319_hk.field_101461_z
		// @65: iload_0
		// @66: iadd
		// @67: putstatic int game.C_100319_hk.field_101461_z
		// @6A: iload_1
		// @6B: ireturn
	}
	
	private final float[] func_101425_g(int arg0)
	{
		// @000: aload_0
		// @001: getfield byte[][] game.C_100319_hk.field_101456_t
		// @004: iload_1
		// @005: aaload
		// @006: iconst_0
		// @007: invokestatic game.C_100319_hk.func_101418_a(byte[], int)void
		// @00A: invokestatic game.C_100319_hk.func_101426_a()int
		// @00D: pop
		// @00E: getstatic int[] game.C_100319_hk.field_101439_N
		// @011: arraylength
		// @012: iconst_1
		// @013: isub
		// @014: sipush 18986 (0x4A2A)
		// @017: invokestatic game.C_100310_lj.func_100538_b(int, int)int
		// @01A: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @01D: istore_2
		// @01E: getstatic boolean[] game.C_100319_hk.field_101432_F
		// @021: iload_2
		// @022: baload
		// @023: istore_3
		// @024: iload_3
		// @025: ifeq @02E
		// @028: getstatic int game.C_100319_hk.field_101430_D
		// @02B: goto @031
		// @02E: getstatic int game.C_100319_hk.field_101451_j
		// @031: istore #4
		// @033: iconst_0
		// @034: istore #5
		// @036: iconst_0
		// @037: istore #6
		// @039: iload_3
		// @03A: ifeq @057
		// @03D: invokestatic game.C_100319_hk.func_101426_a()int
		// @040: ifeq @047
		// @043: iconst_1
		// @044: goto @048
		// @047: iconst_0
		// @048: istore #5
		// @04A: invokestatic game.C_100319_hk.func_101426_a()int
		// @04D: ifeq @054
		// @050: iconst_1
		// @051: goto @055
		// @054: iconst_0
		// @055: istore #6
		// @057: iload #4
		// @059: iconst_1
		// @05A: ishr
		// @05B: istore #7
		// @05D: iload_3
		// @05E: ifeq @088
		// @061: iload #5
		// @063: ifne @088
		// @066: iload #4
		// @068: iconst_2
		// @069: ishr
		// @06A: getstatic int game.C_100319_hk.field_101451_j
		// @06D: iconst_2
		// @06E: ishr
		// @06F: isub
		// @070: istore #8
		// @072: iload #4
		// @074: iconst_2
		// @075: ishr
		// @076: getstatic int game.C_100319_hk.field_101451_j
		// @079: iconst_2
		// @07A: ishr
		// @07B: iadd
		// @07C: istore #9
		// @07E: getstatic int game.C_100319_hk.field_101451_j
		// @081: iconst_1
		// @082: ishr
		// @083: istore #10
		// @085: goto @095
		// @088: iconst_0
		// @089: istore #8
		// @08B: iload #7
		// @08D: istore #9
		// @08F: iload #4
		// @091: iconst_1
		// @092: ishr
		// @093: istore #10
		// @095: iload_3
		// @096: ifeq @0C6
		// @099: iload #6
		// @09B: ifne @0C6
		// @09E: iload #4
		// @0A0: iload #4
		// @0A2: iconst_2
		// @0A3: ishr
		// @0A4: isub
		// @0A5: getstatic int game.C_100319_hk.field_101451_j
		// @0A8: iconst_2
		// @0A9: ishr
		// @0AA: isub
		// @0AB: istore #11
		// @0AD: iload #4
		// @0AF: iload #4
		// @0B1: iconst_2
		// @0B2: ishr
		// @0B3: isub
		// @0B4: getstatic int game.C_100319_hk.field_101451_j
		// @0B7: iconst_2
		// @0B8: ishr
		// @0B9: iadd
		// @0BA: istore #12
		// @0BC: getstatic int game.C_100319_hk.field_101451_j
		// @0BF: iconst_1
		// @0C0: ishr
		// @0C1: istore #13
		// @0C3: goto @0D4
		// @0C6: iload #7
		// @0C8: istore #11
		// @0CA: iload #4
		// @0CC: istore #12
		// @0CE: iload #4
		// @0D0: iconst_1
		// @0D1: ishr
		// @0D2: istore #13
		// @0D4: getstatic game.C_100039_wd[] game.C_100319_hk.field_101437_L
		// @0D7: getstatic int[] game.C_100319_hk.field_101439_N
		// @0DA: iload_2
		// @0DB: iaload
		// @0DC: aaload
		// @0DD: astore #14
		// @0DF: aload #14
		// @0E1: getfield int game.C_100039_wd.field_104082_d
		// @0E4: istore #16
		// @0E6: aload #14
		// @0E8: getfield int[] game.C_100039_wd.field_104084_c
		// @0EB: iload #16
		// @0ED: iaload
		// @0EE: istore #17
		// @0F0: getstatic game.C_100173_sa[] game.C_100319_hk.field_101460_p
		// @0F3: iload #17
		// @0F5: aaload
		// @0F6: invokevirtual game.C_100173_sa.func_105588_a()boolean
		// @0F9: ifne @100
		// @0FC: iconst_1
		// @0FD: goto @101
		// @100: iconst_0
		// @101: istore #15
		// @103: iload #15
		// @105: istore #16
		// @107: iconst_0
		// @108: istore #17
		// @10A: iload #17
		// @10C: aload #14
		// @10E: getfield int game.C_100039_wd.field_104083_b
		// @111: if_icmpge @13A
		// @114: getstatic game.C_100241_og[] game.C_100319_hk.field_101457_s
		// @117: aload #14
		// @119: getfield int[] game.C_100039_wd.field_104085_a
		// @11C: iload #17
		// @11E: iaload
		// @11F: aaload
		// @120: astore #18
		// @122: getstatic float[] game.C_100319_hk.field_101463_x
		// @125: astore #19
		// @127: aload #18
		// @129: aload #19
		// @12B: iload #4
		// @12D: iconst_1
		// @12E: ishr
		// @12F: iload #16
		// @131: invokevirtual game.C_100241_og.func_106328_a(float[], int, boolean)void
		// @134: iinc #17 +1
		// @137: goto @10A
		// @13A: iload #15
		// @13C: ifne @160
		// @13F: aload #14
		// @141: getfield int game.C_100039_wd.field_104082_d
		// @144: istore #17
		// @146: aload #14
		// @148: getfield int[] game.C_100039_wd.field_104084_c
		// @14B: iload #17
		// @14D: iaload
		// @14E: istore #18
		// @150: getstatic game.C_100173_sa[] game.C_100319_hk.field_101460_p
		// @153: iload #18
		// @155: aaload
		// @156: getstatic float[] game.C_100319_hk.field_101463_x
		// @159: iload #4
		// @15B: iconst_1
		// @15C: ishr
		// @15D: invokevirtual game.C_100173_sa.func_105584_a(float[], int)void
		// @160: iload #15
		// @162: ifeq @182
		// @165: iload #4
		// @167: iconst_1
		// @168: ishr
		// @169: istore #17
		// @16B: iload #17
		// @16D: iload #4
		// @16F: if_icmpge @17F
		// @172: getstatic float[] game.C_100319_hk.field_101463_x
		// @175: iload #17
		// @177: fconst_0
		// @178: fastore
		// @179: iinc #17 +1
		// @17C: goto @16B
		// @17F: goto @7E8
		// @182: iload #4
		// @184: iconst_1
		// @185: ishr
		// @186: istore #17
		// @188: iload #4
		// @18A: iconst_2
		// @18B: ishr
		// @18C: istore #18
		// @18E: iload #4
		// @190: iconst_3
		// @191: ishr
		// @192: istore #19
		// @194: getstatic float[] game.C_100319_hk.field_101463_x
		// @197: astore #20
		// @199: iconst_0
		// @19A: istore #21
		// @19C: iload #21
		// @19E: iload #17
		// @1A0: if_icmpge @1B3
		// @1A3: aload #20
		// @1A5: iload #21
		// @1A7: dup2
		// @1A8: faload
		// @1A9: ldc 0.5
		// @1AB: fmul
		// @1AC: fastore
		// @1AD: iinc #21 +1
		// @1B0: goto @19C
		// @1B3: iload #17
		// @1B5: istore #21
		// @1B7: iload #21
		// @1B9: iload #4
		// @1BB: if_icmpge @1D4
		// @1BE: aload #20
		// @1C0: iload #21
		// @1C2: aload #20
		// @1C4: iload #4
		// @1C6: iload #21
		// @1C8: isub
		// @1C9: iconst_1
		// @1CA: isub
		// @1CB: faload
		// @1CC: fneg
		// @1CD: fastore
		// @1CE: iinc #21 +1
		// @1D1: goto @1B7
		// @1D4: iload_3
		// @1D5: ifeq @1DE
		// @1D8: getstatic float[] game.C_100319_hk.field_101431_E
		// @1DB: goto @1E1
		// @1DE: getstatic float[] game.C_100319_hk.field_101447_n
		// @1E1: astore #21
		// @1E3: iload_3
		// @1E4: ifeq @1ED
		// @1E7: getstatic float[] game.C_100319_hk.field_101448_o
		// @1EA: goto @1F0
		// @1ED: getstatic float[] game.C_100319_hk.field_101445_Q
		// @1F0: astore #22
		// @1F2: iload_3
		// @1F3: ifeq @1FC
		// @1F6: getstatic float[] game.C_100319_hk.field_101446_P
		// @1F9: goto @1FF
		// @1FC: getstatic float[] game.C_100319_hk.field_101440_O
		// @1FF: astore #23
		// @201: iload_3
		// @202: ifeq @20B
		// @205: getstatic int[] game.C_100319_hk.field_101442_I
		// @208: goto @20E
		// @20B: getstatic int[] game.C_100319_hk.field_101433_G
		// @20E: astore #24
		// @210: iconst_0
		// @211: istore #25
		// @213: iload #25
		// @215: iload #18
		// @217: if_icmpge @290
		// @21A: aload #20
		// @21C: iconst_4
		// @21D: iload #25
		// @21F: imul
		// @220: faload
		// @221: aload #20
		// @223: iload #4
		// @225: iconst_4
		// @226: iload #25
		// @228: imul
		// @229: isub
		// @22A: iconst_1
		// @22B: isub
		// @22C: faload
		// @22D: fsub
		// @22E: fstore #26
		// @230: aload #20
		// @232: iconst_4
		// @233: iload #25
		// @235: imul
		// @236: iconst_2
		// @237: iadd
		// @238: faload
		// @239: aload #20
		// @23B: iload #4
		// @23D: iconst_4
		// @23E: iload #25
		// @240: imul
		// @241: isub
		// @242: iconst_3
		// @243: isub
		// @244: faload
		// @245: fsub
		// @246: fstore #27
		// @248: aload #21
		// @24A: iconst_2
		// @24B: iload #25
		// @24D: imul
		// @24E: faload
		// @24F: fstore #28
		// @251: aload #21
		// @253: iconst_2
		// @254: iload #25
		// @256: imul
		// @257: iconst_1
		// @258: iadd
		// @259: faload
		// @25A: fstore #29
		// @25C: aload #20
		// @25E: iload #4
		// @260: iconst_4
		// @261: iload #25
		// @263: imul
		// @264: isub
		// @265: iconst_1
		// @266: isub
		// @267: fload #26
		// @269: fload #28
		// @26B: fmul
		// @26C: fload #27
		// @26E: fload #29
		// @270: fmul
		// @271: fsub
		// @272: fastore
		// @273: aload #20
		// @275: iload #4
		// @277: iconst_4
		// @278: iload #25
		// @27A: imul
		// @27B: isub
		// @27C: iconst_3
		// @27D: isub
		// @27E: fload #26
		// @280: fload #29
		// @282: fmul
		// @283: fload #27
		// @285: fload #28
		// @287: fmul
		// @288: fadd
		// @289: fastore
		// @28A: iinc #25 +1
		// @28D: goto @213
		// @290: iconst_0
		// @291: istore #25
		// @293: iload #25
		// @295: iload #19
		// @297: if_icmpge @344
		// @29A: aload #20
		// @29C: iload #17
		// @29E: iconst_3
		// @29F: iadd
		// @2A0: iconst_4
		// @2A1: iload #25
		// @2A3: imul
		// @2A4: iadd
		// @2A5: faload
		// @2A6: fstore #26
		// @2A8: aload #20
		// @2AA: iload #17
		// @2AC: iconst_1
		// @2AD: iadd
		// @2AE: iconst_4
		// @2AF: iload #25
		// @2B1: imul
		// @2B2: iadd
		// @2B3: faload
		// @2B4: fstore #27
		// @2B6: aload #20
		// @2B8: iconst_4
		// @2B9: iload #25
		// @2BB: imul
		// @2BC: iconst_3
		// @2BD: iadd
		// @2BE: faload
		// @2BF: fstore #28
		// @2C1: aload #20
		// @2C3: iconst_4
		// @2C4: iload #25
		// @2C6: imul
		// @2C7: iconst_1
		// @2C8: iadd
		// @2C9: faload
		// @2CA: fstore #29
		// @2CC: aload #20
		// @2CE: iload #17
		// @2D0: iconst_3
		// @2D1: iadd
		// @2D2: iconst_4
		// @2D3: iload #25
		// @2D5: imul
		// @2D6: iadd
		// @2D7: fload #26
		// @2D9: fload #28
		// @2DB: fadd
		// @2DC: fastore
		// @2DD: aload #20
		// @2DF: iload #17
		// @2E1: iconst_1
		// @2E2: iadd
		// @2E3: iconst_4
		// @2E4: iload #25
		// @2E6: imul
		// @2E7: iadd
		// @2E8: fload #27
		// @2EA: fload #29
		// @2EC: fadd
		// @2ED: fastore
		// @2EE: aload #21
		// @2F0: iload #17
		// @2F2: iconst_4
		// @2F3: isub
		// @2F4: iconst_4
		// @2F5: iload #25
		// @2F7: imul
		// @2F8: isub
		// @2F9: faload
		// @2FA: fstore #30
		// @2FC: aload #21
		// @2FE: iload #17
		// @300: iconst_3
		// @301: isub
		// @302: iconst_4
		// @303: iload #25
		// @305: imul
		// @306: isub
		// @307: faload
		// @308: fstore #31
		// @30A: aload #20
		// @30C: iconst_4
		// @30D: iload #25
		// @30F: imul
		// @310: iconst_3
		// @311: iadd
		// @312: fload #26
		// @314: fload #28
		// @316: fsub
		// @317: fload #30
		// @319: fmul
		// @31A: fload #27
		// @31C: fload #29
		// @31E: fsub
		// @31F: fload #31
		// @321: fmul
		// @322: fsub
		// @323: fastore
		// @324: aload #20
		// @326: iconst_4
		// @327: iload #25
		// @329: imul
		// @32A: iconst_1
		// @32B: iadd
		// @32C: fload #27
		// @32E: fload #29
		// @330: fsub
		// @331: fload #30
		// @333: fmul
		// @334: fload #26
		// @336: fload #28
		// @338: fsub
		// @339: fload #31
		// @33B: fmul
		// @33C: fadd
		// @33D: fastore
		// @33E: iinc #25 +1
		// @341: goto @293
		// @344: iload #4
		// @346: iconst_1
		// @347: isub
		// @348: sipush 18986 (0x4A2A)
		// @34B: invokestatic game.C_100310_lj.func_100538_b(int, int)int
		// @34E: istore #25
		// @350: iconst_0
		// @351: istore #26
		// @353: iload #26
		// @355: iload #25
		// @357: iconst_3
		// @358: isub
		// @359: if_icmpge @453
		// @35C: iload #4
		// @35E: iload #26
		// @360: iconst_2
		// @361: iadd
		// @362: ishr
		// @363: istore #27
		// @365: bipush 8 (0x08)
		// @367: iload #26
		// @369: ishl
		// @36A: istore #28
		// @36C: iconst_0
		// @36D: istore #29
		// @36F: iload #29
		// @371: iconst_2
		// @372: iload #26
		// @374: ishl
		// @375: if_icmpge @44D
		// @378: iload #4
		// @37A: iload #27
		// @37C: iconst_2
		// @37D: imul
		// @37E: iload #29
		// @380: imul
		// @381: isub
		// @382: istore #30
		// @384: iload #4
		// @386: iload #27
		// @388: iconst_2
		// @389: iload #29
		// @38B: imul
		// @38C: iconst_1
		// @38D: iadd
		// @38E: imul
		// @38F: isub
		// @390: istore #31
		// @392: iconst_0
		// @393: istore #32
		// @395: iload #32
		// @397: iload #4
		// @399: iload #26
		// @39B: iconst_4
		// @39C: iadd
		// @39D: ishr
		// @39E: if_icmpge @447
		// @3A1: iconst_4
		// @3A2: iload #32
		// @3A4: imul
		// @3A5: istore #33
		// @3A7: aload #20
		// @3A9: iload #30
		// @3AB: iconst_1
		// @3AC: isub
		// @3AD: iload #33
		// @3AF: isub
		// @3B0: faload
		// @3B1: fstore #34
		// @3B3: aload #20
		// @3B5: iload #30
		// @3B7: iconst_3
		// @3B8: isub
		// @3B9: iload #33
		// @3BB: isub
		// @3BC: faload
		// @3BD: fstore #35
		// @3BF: aload #20
		// @3C1: iload #31
		// @3C3: iconst_1
		// @3C4: isub
		// @3C5: iload #33
		// @3C7: isub
		// @3C8: faload
		// @3C9: fstore #36
		// @3CB: aload #20
		// @3CD: iload #31
		// @3CF: iconst_3
		// @3D0: isub
		// @3D1: iload #33
		// @3D3: isub
		// @3D4: faload
		// @3D5: fstore #37
		// @3D7: aload #20
		// @3D9: iload #30
		// @3DB: iconst_1
		// @3DC: isub
		// @3DD: iload #33
		// @3DF: isub
		// @3E0: fload #34
		// @3E2: fload #36
		// @3E4: fadd
		// @3E5: fastore
		// @3E6: aload #20
		// @3E8: iload #30
		// @3EA: iconst_3
		// @3EB: isub
		// @3EC: iload #33
		// @3EE: isub
		// @3EF: fload #35
		// @3F1: fload #37
		// @3F3: fadd
		// @3F4: fastore
		// @3F5: aload #21
		// @3F7: iload #32
		// @3F9: iload #28
		// @3FB: imul
		// @3FC: faload
		// @3FD: fstore #38
		// @3FF: aload #21
		// @401: iload #32
		// @403: iload #28
		// @405: imul
		// @406: iconst_1
		// @407: iadd
		// @408: faload
		// @409: fstore #39
		// @40B: aload #20
		// @40D: iload #31
		// @40F: iconst_1
		// @410: isub
		// @411: iload #33
		// @413: isub
		// @414: fload #34
		// @416: fload #36
		// @418: fsub
		// @419: fload #38
		// @41B: fmul
		// @41C: fload #35
		// @41E: fload #37
		// @420: fsub
		// @421: fload #39
		// @423: fmul
		// @424: fsub
		// @425: fastore
		// @426: aload #20
		// @428: iload #31
		// @42A: iconst_3
		// @42B: isub
		// @42C: iload #33
		// @42E: isub
		// @42F: fload #35
		// @431: fload #37
		// @433: fsub
		// @434: fload #38
		// @436: fmul
		// @437: fload #34
		// @439: fload #36
		// @43B: fsub
		// @43C: fload #39
		// @43E: fmul
		// @43F: fadd
		// @440: fastore
		// @441: iinc #32 +1
		// @444: goto @395
		// @447: iinc #29 +1
		// @44A: goto @36F
		// @44D: iinc #26 +1
		// @450: goto @353
		// @453: iconst_1
		// @454: istore #26
		// @456: iload #26
		// @458: iload #19
		// @45A: iconst_1
		// @45B: isub
		// @45C: if_icmpge @505
		// @45F: aload #24
		// @461: iload #26
		// @463: iaload
		// @464: istore #27
		// @466: iload #26
		// @468: iload #27
		// @46A: if_icmpge @4FF
		// @46D: bipush 8 (0x08)
		// @46F: iload #26
		// @471: imul
		// @472: istore #28
		// @474: bipush 8 (0x08)
		// @476: iload #27
		// @478: imul
		// @479: istore #29
		// @47B: aload #20
		// @47D: iload #28
		// @47F: iconst_1
		// @480: iadd
		// @481: faload
		// @482: fstore #30
		// @484: aload #20
		// @486: iload #28
		// @488: iconst_1
		// @489: iadd
		// @48A: aload #20
		// @48C: iload #29
		// @48E: iconst_1
		// @48F: iadd
		// @490: faload
		// @491: fastore
		// @492: aload #20
		// @494: iload #29
		// @496: iconst_1
		// @497: iadd
		// @498: fload #30
		// @49A: fastore
		// @49B: aload #20
		// @49D: iload #28
		// @49F: iconst_3
		// @4A0: iadd
		// @4A1: faload
		// @4A2: fstore #30
		// @4A4: aload #20
		// @4A6: iload #28
		// @4A8: iconst_3
		// @4A9: iadd
		// @4AA: aload #20
		// @4AC: iload #29
		// @4AE: iconst_3
		// @4AF: iadd
		// @4B0: faload
		// @4B1: fastore
		// @4B2: aload #20
		// @4B4: iload #29
		// @4B6: iconst_3
		// @4B7: iadd
		// @4B8: fload #30
		// @4BA: fastore
		// @4BB: aload #20
		// @4BD: iload #28
		// @4BF: iconst_5
		// @4C0: iadd
		// @4C1: faload
		// @4C2: fstore #30
		// @4C4: aload #20
		// @4C6: iload #28
		// @4C8: iconst_5
		// @4C9: iadd
		// @4CA: aload #20
		// @4CC: iload #29
		// @4CE: iconst_5
		// @4CF: iadd
		// @4D0: faload
		// @4D1: fastore
		// @4D2: aload #20
		// @4D4: iload #29
		// @4D6: iconst_5
		// @4D7: iadd
		// @4D8: fload #30
		// @4DA: fastore
		// @4DB: aload #20
		// @4DD: iload #28
		// @4DF: bipush 7 (0x07)
		// @4E1: iadd
		// @4E2: faload
		// @4E3: fstore #30
		// @4E5: aload #20
		// @4E7: iload #28
		// @4E9: bipush 7 (0x07)
		// @4EB: iadd
		// @4EC: aload #20
		// @4EE: iload #29
		// @4F0: bipush 7 (0x07)
		// @4F2: iadd
		// @4F3: faload
		// @4F4: fastore
		// @4F5: aload #20
		// @4F7: iload #29
		// @4F9: bipush 7 (0x07)
		// @4FB: iadd
		// @4FC: fload #30
		// @4FE: fastore
		// @4FF: iinc #26 +1
		// @502: goto @456
		// @505: iconst_0
		// @506: istore #26
		// @508: iload #26
		// @50A: iload #17
		// @50C: if_icmpge @523
		// @50F: aload #20
		// @511: iload #26
		// @513: aload #20
		// @515: iconst_2
		// @516: iload #26
		// @518: imul
		// @519: iconst_1
		// @51A: iadd
		// @51B: faload
		// @51C: fastore
		// @51D: iinc #26 +1
		// @520: goto @508
		// @523: iconst_0
		// @524: istore #26
		// @526: iload #26
		// @528: iload #19
		// @52A: if_icmpge @58B
		// @52D: aload #20
		// @52F: iload #4
		// @531: iconst_1
		// @532: isub
		// @533: iconst_2
		// @534: iload #26
		// @536: imul
		// @537: isub
		// @538: aload #20
		// @53A: iconst_4
		// @53B: iload #26
		// @53D: imul
		// @53E: faload
		// @53F: fastore
		// @540: aload #20
		// @542: iload #4
		// @544: iconst_2
		// @545: isub
		// @546: iconst_2
		// @547: iload #26
		// @549: imul
		// @54A: isub
		// @54B: aload #20
		// @54D: iconst_4
		// @54E: iload #26
		// @550: imul
		// @551: iconst_1
		// @552: iadd
		// @553: faload
		// @554: fastore
		// @555: aload #20
		// @557: iload #4
		// @559: iload #18
		// @55B: isub
		// @55C: iconst_1
		// @55D: isub
		// @55E: iconst_2
		// @55F: iload #26
		// @561: imul
		// @562: isub
		// @563: aload #20
		// @565: iconst_4
		// @566: iload #26
		// @568: imul
		// @569: iconst_2
		// @56A: iadd
		// @56B: faload
		// @56C: fastore
		// @56D: aload #20
		// @56F: iload #4
		// @571: iload #18
		// @573: isub
		// @574: iconst_2
		// @575: isub
		// @576: iconst_2
		// @577: iload #26
		// @579: imul
		// @57A: isub
		// @57B: aload #20
		// @57D: iconst_4
		// @57E: iload #26
		// @580: imul
		// @581: iconst_3
		// @582: iadd
		// @583: faload
		// @584: fastore
		// @585: iinc #26 +1
		// @588: goto @526
		// @58B: iconst_0
		// @58C: istore #26
		// @58E: iload #26
		// @590: iload #19
		// @592: if_icmpge @666
		// @595: aload #23
		// @597: iconst_2
		// @598: iload #26
		// @59A: imul
		// @59B: faload
		// @59C: fstore #27
		// @59E: aload #23
		// @5A0: iconst_2
		// @5A1: iload #26
		// @5A3: imul
		// @5A4: iconst_1
		// @5A5: iadd
		// @5A6: faload
		// @5A7: fstore #28
		// @5A9: aload #20
		// @5AB: iload #17
		// @5AD: iconst_2
		// @5AE: iload #26
		// @5B0: imul
		// @5B1: iadd
		// @5B2: faload
		// @5B3: fstore #29
		// @5B5: aload #20
		// @5B7: iload #17
		// @5B9: iconst_2
		// @5BA: iload #26
		// @5BC: imul
		// @5BD: iadd
		// @5BE: iconst_1
		// @5BF: iadd
		// @5C0: faload
		// @5C1: fstore #30
		// @5C3: aload #20
		// @5C5: iload #4
		// @5C7: iconst_2
		// @5C8: isub
		// @5C9: iconst_2
		// @5CA: iload #26
		// @5CC: imul
		// @5CD: isub
		// @5CE: faload
		// @5CF: fstore #31
		// @5D1: aload #20
		// @5D3: iload #4
		// @5D5: iconst_1
		// @5D6: isub
		// @5D7: iconst_2
		// @5D8: iload #26
		// @5DA: imul
		// @5DB: isub
		// @5DC: faload
		// @5DD: fstore #32
		// @5DF: fload #28
		// @5E1: fload #29
		// @5E3: fload #31
		// @5E5: fsub
		// @5E6: fmul
		// @5E7: fload #27
		// @5E9: fload #30
		// @5EB: fload #32
		// @5ED: fadd
		// @5EE: fmul
		// @5EF: fadd
		// @5F0: fstore #33
		// @5F2: aload #20
		// @5F4: iload #17
		// @5F6: iconst_2
		// @5F7: iload #26
		// @5F9: imul
		// @5FA: iadd
		// @5FB: fload #29
		// @5FD: fload #31
		// @5FF: fadd
		// @600: fload #33
		// @602: fadd
		// @603: ldc 0.5
		// @605: fmul
		// @606: fastore
		// @607: aload #20
		// @609: iload #4
		// @60B: iconst_2
		// @60C: isub
		// @60D: iconst_2
		// @60E: iload #26
		// @610: imul
		// @611: isub
		// @612: fload #29
		// @614: fload #31
		// @616: fadd
		// @617: fload #33
		// @619: fsub
		// @61A: ldc 0.5
		// @61C: fmul
		// @61D: fastore
		// @61E: fload #28
		// @620: fload #30
		// @622: fload #32
		// @624: fadd
		// @625: fmul
		// @626: fload #27
		// @628: fload #29
		// @62A: fload #31
		// @62C: fsub
		// @62D: fmul
		// @62E: fsub
		// @62F: fstore #33
		// @631: aload #20
		// @633: iload #17
		// @635: iconst_2
		// @636: iload #26
		// @638: imul
		// @639: iadd
		// @63A: iconst_1
		// @63B: iadd
		// @63C: fload #30
		// @63E: fload #32
		// @640: fsub
		// @641: fload #33
		// @643: fadd
		// @644: ldc 0.5
		// @646: fmul
		// @647: fastore
		// @648: aload #20
		// @64A: iload #4
		// @64C: iconst_1
		// @64D: isub
		// @64E: iconst_2
		// @64F: iload #26
		// @651: imul
		// @652: isub
		// @653: fload #30
		// @655: fneg
		// @656: fload #32
		// @658: fadd
		// @659: fload #33
		// @65B: fadd
		// @65C: ldc 0.5
		// @65E: fmul
		// @65F: fastore
		// @660: iinc #26 +1
		// @663: goto @58E
		// @666: iconst_0
		// @667: istore #26
		// @669: iload #26
		// @66B: iload #18
		// @66D: if_icmpge @6D7
		// @670: aload #20
		// @672: iload #26
		// @674: aload #20
		// @676: iconst_2
		// @677: iload #26
		// @679: imul
		// @67A: iload #17
		// @67C: iadd
		// @67D: faload
		// @67E: aload #22
		// @680: iconst_2
		// @681: iload #26
		// @683: imul
		// @684: faload
		// @685: fmul
		// @686: aload #20
		// @688: iconst_2
		// @689: iload #26
		// @68B: imul
		// @68C: iconst_1
		// @68D: iadd
		// @68E: iload #17
		// @690: iadd
		// @691: faload
		// @692: aload #22
		// @694: iconst_2
		// @695: iload #26
		// @697: imul
		// @698: iconst_1
		// @699: iadd
		// @69A: faload
		// @69B: fmul
		// @69C: fadd
		// @69D: fastore
		// @69E: aload #20
		// @6A0: iload #17
		// @6A2: iconst_1
		// @6A3: isub
		// @6A4: iload #26
		// @6A6: isub
		// @6A7: aload #20
		// @6A9: iconst_2
		// @6AA: iload #26
		// @6AC: imul
		// @6AD: iload #17
		// @6AF: iadd
		// @6B0: faload
		// @6B1: aload #22
		// @6B3: iconst_2
		// @6B4: iload #26
		// @6B6: imul
		// @6B7: iconst_1
		// @6B8: iadd
		// @6B9: faload
		// @6BA: fmul
		// @6BB: aload #20
		// @6BD: iconst_2
		// @6BE: iload #26
		// @6C0: imul
		// @6C1: iconst_1
		// @6C2: iadd
		// @6C3: iload #17
		// @6C5: iadd
		// @6C6: faload
		// @6C7: aload #22
		// @6C9: iconst_2
		// @6CA: iload #26
		// @6CC: imul
		// @6CD: faload
		// @6CE: fmul
		// @6CF: fsub
		// @6D0: fastore
		// @6D1: iinc #26 +1
		// @6D4: goto @669
		// @6D7: iconst_0
		// @6D8: istore #26
		// @6DA: iload #26
		// @6DC: iload #18
		// @6DE: if_icmpge @6F8
		// @6E1: aload #20
		// @6E3: iload #4
		// @6E5: iload #18
		// @6E7: isub
		// @6E8: iload #26
		// @6EA: iadd
		// @6EB: aload #20
		// @6ED: iload #26
		// @6EF: faload
		// @6F0: fneg
		// @6F1: fastore
		// @6F2: iinc #26 +1
		// @6F5: goto @6DA
		// @6F8: iconst_0
		// @6F9: istore #26
		// @6FB: iload #26
		// @6FD: iload #18
		// @6FF: if_icmpge @715
		// @702: aload #20
		// @704: iload #26
		// @706: aload #20
		// @708: iload #18
		// @70A: iload #26
		// @70C: iadd
		// @70D: faload
		// @70E: fastore
		// @70F: iinc #26 +1
		// @712: goto @6FB
		// @715: iconst_0
		// @716: istore #26
		// @718: iload #26
		// @71A: iload #18
		// @71C: if_icmpge @738
		// @71F: aload #20
		// @721: iload #18
		// @723: iload #26
		// @725: iadd
		// @726: aload #20
		// @728: iload #18
		// @72A: iload #26
		// @72C: isub
		// @72D: iconst_1
		// @72E: isub
		// @72F: faload
		// @730: fneg
		// @731: fastore
		// @732: iinc #26 +1
		// @735: goto @718
		// @738: iconst_0
		// @739: istore #26
		// @73B: iload #26
		// @73D: iload #18
		// @73F: if_icmpge @75A
		// @742: aload #20
		// @744: iload #17
		// @746: iload #26
		// @748: iadd
		// @749: aload #20
		// @74B: iload #4
		// @74D: iload #26
		// @74F: isub
		// @750: iconst_1
		// @751: isub
		// @752: faload
		// @753: fastore
		// @754: iinc #26 +1
		// @757: goto @73B
		// @75A: iload #8
		// @75C: istore #26
		// @75E: iload #26
		// @760: iload #9
		// @762: if_icmpge @79F
		// @765: iload #26
		// @767: iload #8
		// @769: isub
		// @76A: i2d
		// @76B: ldc2_w 0.5
		// @76E: dadd
		// @76F: iload #10
		// @771: i2d
		// @772: ddiv
		// @773: ldc2_w 0.5
		// @776: dmul
		// @777: ldc2_w 3.141592653589793
		// @77A: dmul
		// @77B: invokestatic java.lang.Math.sin(double)double
		// @77E: d2f
		// @77F: fstore #27
		// @781: getstatic float[] game.C_100319_hk.field_101463_x
		// @784: iload #26
		// @786: dup2
		// @787: faload
		// @788: ldc2_w 1.5707963267948966
		// @78B: fload #27
		// @78D: f2d
		// @78E: dmul
		// @78F: fload #27
		// @791: f2d
		// @792: dmul
		// @793: invokestatic java.lang.Math.sin(double)double
		// @796: d2f
		// @797: fmul
		// @798: fastore
		// @799: iinc #26 +1
		// @79C: goto @75E
		// @79F: iload #11
		// @7A1: istore #26
		// @7A3: iload #26
		// @7A5: iload #12
		// @7A7: if_icmpge @7E8
		// @7AA: iload #26
		// @7AC: iload #11
		// @7AE: isub
		// @7AF: i2d
		// @7B0: ldc2_w 0.5
		// @7B3: dadd
		// @7B4: iload #13
		// @7B6: i2d
		// @7B7: ddiv
		// @7B8: ldc2_w 0.5
		// @7BB: dmul
		// @7BC: ldc2_w 3.141592653589793
		// @7BF: dmul
		// @7C0: ldc2_w 1.5707963267948966
		// @7C3: dadd
		// @7C4: invokestatic java.lang.Math.sin(double)double
		// @7C7: d2f
		// @7C8: fstore #27
		// @7CA: getstatic float[] game.C_100319_hk.field_101463_x
		// @7CD: iload #26
		// @7CF: dup2
		// @7D0: faload
		// @7D1: ldc2_w 1.5707963267948966
		// @7D4: fload #27
		// @7D6: f2d
		// @7D7: dmul
		// @7D8: fload #27
		// @7DA: f2d
		// @7DB: dmul
		// @7DC: invokestatic java.lang.Math.sin(double)double
		// @7DF: d2f
		// @7E0: fmul
		// @7E1: fastore
		// @7E2: iinc #26 +1
		// @7E5: goto @7A3
		// @7E8: aconst_null
		// @7E9: astore #17
		// @7EB: aload_0
		// @7EC: getfield int game.C_100319_hk.field_101438_M
		// @7EF: ifle @869
		// @7F2: aload_0
		// @7F3: getfield int game.C_100319_hk.field_101438_M
		// @7F6: iload #4
		// @7F8: iadd
		// @7F9: iconst_2
		// @7FA: ishr
		// @7FB: istore #18
		// @7FD: iload #18
		// @7FF: newarray float[]
		// @801: astore #17
		// @803: aload_0
		// @804: getfield boolean game.C_100319_hk.field_101435_B
		// @807: ifne @836
		// @80A: iconst_0
		// @80B: istore #19
		// @80D: iload #19
		// @80F: aload_0
		// @810: getfield int game.C_100319_hk.field_101443_J
		// @813: if_icmpge @836
		// @816: aload_0
		// @817: getfield int game.C_100319_hk.field_101438_M
		// @81A: iconst_1
		// @81B: ishr
		// @81C: iload #19
		// @81E: iadd
		// @81F: istore #20
		// @821: aload #17
		// @823: iload #19
		// @825: dup2
		// @826: faload
		// @827: aload_0
		// @828: getfield float[] game.C_100319_hk.field_101462_y
		// @82B: iload #20
		// @82D: faload
		// @82E: fadd
		// @82F: fastore
		// @830: iinc #19 +1
		// @833: goto @80D
		// @836: iload #15
		// @838: ifne @869
		// @83B: iload #8
		// @83D: istore #19
		// @83F: iload #19
		// @841: iload #4
		// @843: iconst_1
		// @844: ishr
		// @845: if_icmpge @869
		// @848: aload #17
		// @84A: arraylength
		// @84B: iload #4
		// @84D: iconst_1
		// @84E: ishr
		// @84F: isub
		// @850: iload #19
		// @852: iadd
		// @853: istore #20
		// @855: aload #17
		// @857: iload #20
		// @859: dup2
		// @85A: faload
		// @85B: getstatic float[] game.C_100319_hk.field_101463_x
		// @85E: iload #19
		// @860: faload
		// @861: fadd
		// @862: fastore
		// @863: iinc #19 +1
		// @866: goto @83F
		// @869: aload_0
		// @86A: getfield float[] game.C_100319_hk.field_101462_y
		// @86D: astore #18
		// @86F: aload_0
		// @870: getstatic float[] game.C_100319_hk.field_101463_x
		// @873: putfield float[] game.C_100319_hk.field_101462_y
		// @876: aload #18
		// @878: putstatic float[] game.C_100319_hk.field_101463_x
		// @87B: aload_0
		// @87C: iload #4
		// @87E: putfield int game.C_100319_hk.field_101438_M
		// @881: aload_0
		// @882: iload #12
		// @884: iload #4
		// @886: iconst_1
		// @887: ishr
		// @888: isub
		// @889: putfield int game.C_100319_hk.field_101443_J
		// @88C: aload_0
		// @88D: iload #15
		// @88F: putfield boolean game.C_100319_hk.field_101435_B
		// @892: aload #17
		// @894: areturn
	}
	
	static final C_100319_hk func_101423_a(C_100098_h arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: invokestatic game.C_100319_hk.func_101429_a(game.C_100098_h)boolean
		// @04: ifne @14
		// @07: aload_0
		// @08: sipush 10894 (0x2A8E)
		// @0B: iload_2
		// @0C: iload_1
		// @0D: invokevirtual game.C_100098_h.func_104604_c(int, int, int)boolean
		// @10: pop
		// @11: aconst_null
		// @12: areturn
		// @13: athrow
		// @14: aload_0
		// @15: iload_1
		// @16: iconst_0
		// @17: iload_2
		// @18: invokevirtual game.C_100098_h.func_104610_b(int, int, int)byte[]
		// @1B: astore_3
		// @1C: aload_3
		// @1D: ifnonnull @23
		// @20: aconst_null
		// @21: areturn
		// @22: athrow
		// @23: aconst_null
		// @24: astore #4
		// @26: new game.C_100319_hk
		// @29: dup
		// @2A: aload_3
		// @2B: invokespecial game.C_100319_hk.<init>(byte[])void
		// @2E: astore #4
		// @30: goto @3A
		// @33: astore #5
		// @35: aload #5
		// @37: invokevirtual java.io.IOException.printStackTrace()void
		// @3A: aload #4
		// @3C: areturn
	}
	
	private static final void func_101418_a(byte[] arg0, int arg1)
	{
		// @0: aload_0
		// @1: putstatic byte[] game.C_100319_hk.field_101444_K
		// @4: iload_1
		// @5: putstatic int game.C_100319_hk.field_101453_w
		// @8: iconst_0
		// @9: putstatic int game.C_100319_hk.field_101461_z
		// @C: return
	}
	
	static final C_100319_hk func_101420_a(C_100098_h arg0, String arg1, String arg2)
	{
		// @00: aload_0
		// @01: invokestatic game.C_100319_hk.func_101429_a(game.C_100098_h)boolean
		// @04: ifne @13
		// @07: aload_0
		// @08: aload_2
		// @09: bipush -66 (0xBE)
		// @0B: aload_1
		// @0C: invokevirtual game.C_100098_h.func_104588_a(java.lang.String, int, java.lang.String)boolean
		// @0F: pop
		// @10: aconst_null
		// @11: areturn
		// @12: athrow
		// @13: aload_0
		// @14: aload_2
		// @15: aload_1
		// @16: bipush -60 (0xC4)
		// @18: invokevirtual game.C_100098_h.func_104608_a(java.lang.String, java.lang.String, int)byte[]
		// @1B: astore_3
		// @1C: aload_3
		// @1D: ifnonnull @23
		// @20: aconst_null
		// @21: areturn
		// @22: athrow
		// @23: aconst_null
		// @24: astore #4
		// @26: new game.C_100319_hk
		// @29: dup
		// @2A: aload_3
		// @2B: invokespecial game.C_100319_hk.<init>(byte[])void
		// @2E: astore #4
		// @30: goto @3A
		// @33: astore #5
		// @35: aload #5
		// @37: invokevirtual java.io.IOException.printStackTrace()void
		// @3A: aload #4
		// @3C: areturn
	}
	
	private final void func_101417_b(byte[] arg0) throws IOException
	{
		// @00: new game.C_100280_nf
		// @03: dup
		// @04: aload_1
		// @05: invokespecial game.C_100280_nf.<init>(byte[])void
		// @08: astore_2
		// @09: aload_0
		// @0A: aload_2
		// @0B: sipush -1543 (0xF9F9)
		// @0E: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @11: putfield int game.C_100319_hk.field_101436_C
		// @14: aload_0
		// @15: aload_2
		// @16: sipush -1543 (0xF9F9)
		// @19: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @1C: putfield int game.C_100319_hk.field_101454_v
		// @1F: aload_0
		// @20: aload_2
		// @21: sipush -1543 (0xF9F9)
		// @24: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @27: putfield int game.C_100319_hk.field_101459_q
		// @2A: aload_0
		// @2B: aload_2
		// @2C: sipush -1543 (0xF9F9)
		// @2F: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @32: putfield int game.C_100319_hk.field_101458_r
		// @35: aload_0
		// @36: getfield int game.C_100319_hk.field_101458_r
		// @39: ifge @4F
		// @3C: aload_0
		// @3D: aload_0
		// @3E: getfield int game.C_100319_hk.field_101458_r
		// @41: iconst_m1
		// @42: ixor
		// @43: putfield int game.C_100319_hk.field_101458_r
		// @46: aload_0
		// @47: iconst_1
		// @48: putfield boolean game.C_100319_hk.field_101441_H
		// @4B: goto @4F
		// @4E: athrow
		// @4F: aload_2
		// @50: sipush -1543 (0xF9F9)
		// @53: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @56: istore_3
		// @57: iload_3
		// @58: ifge @64
		// @5B: new java.io.IOException
		// @5E: dup
		// @5F: invokespecial java.io.IOException.<init>()void
		// @62: athrow
		// @63: athrow
		// @64: aload_0
		// @65: iload_3
		// @66: anewarray byte[]
		// @69: putfield byte[][] game.C_100319_hk.field_101456_t
		// @6C: iconst_0
		// @6D: istore #4
		// @6F: iload #4
		// @71: iload_3
		// @72: if_icmpge @B6
		// @75: iconst_0
		// @76: istore #5
		// @78: aload_2
		// @79: iconst_0
		// @7A: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @7D: istore #6
		// @7F: iload #5
		// @81: iload #6
		// @83: iadd
		// @84: istore #5
		// @86: iload #6
		// @88: sipush 255 (0x00FF)
		// @8B: if_icmpge @92
		// @8E: goto @95
		// @91: athrow
		// @92: goto @78
		// @95: iload #5
		// @97: newarray byte[]
		// @99: astore #6
		// @9B: aload_2
		// @9C: aload #6
		// @9E: iload #5
		// @A0: iconst_0
		// @A1: sipush -7623 (0xE239)
		// @A4: invokevirtual game.C_100280_nf.func_101149_a(byte[], int, int, int)void
		// @A7: aload_0
		// @A8: getfield byte[][] game.C_100319_hk.field_101456_t
		// @AB: iload #4
		// @AD: aload #6
		// @AF: aastore
		// @B0: iinc #4 +1
		// @B3: goto @6F
		// @B6: return
	}
	
	public static void func_101427_b()
	{
		// @00: aconst_null
		// @01: putstatic byte[] game.C_100319_hk.field_101444_K
		// @04: aconst_null
		// @05: putstatic game.C_100258_lm[] game.C_100319_hk.field_101450_m
		// @08: aconst_null
		// @09: putstatic game.C_100173_sa[] game.C_100319_hk.field_101460_p
		// @0C: aconst_null
		// @0D: putstatic game.C_100241_og[] game.C_100319_hk.field_101457_s
		// @10: aconst_null
		// @11: putstatic game.C_100039_wd[] game.C_100319_hk.field_101437_L
		// @14: aconst_null
		// @15: putstatic boolean[] game.C_100319_hk.field_101432_F
		// @18: aconst_null
		// @19: putstatic int[] game.C_100319_hk.field_101439_N
		// @1C: aconst_null
		// @1D: putstatic float[] game.C_100319_hk.field_101463_x
		// @20: aconst_null
		// @21: putstatic float[] game.C_100319_hk.field_101447_n
		// @24: aconst_null
		// @25: putstatic float[] game.C_100319_hk.field_101445_Q
		// @28: aconst_null
		// @29: putstatic float[] game.C_100319_hk.field_101440_O
		// @2C: aconst_null
		// @2D: putstatic float[] game.C_100319_hk.field_101431_E
		// @30: aconst_null
		// @31: putstatic float[] game.C_100319_hk.field_101448_o
		// @34: aconst_null
		// @35: putstatic float[] game.C_100319_hk.field_101446_P
		// @38: aconst_null
		// @39: putstatic int[] game.C_100319_hk.field_101433_G
		// @3C: aconst_null
		// @3D: putstatic int[] game.C_100319_hk.field_101442_I
		// @40: return
	}
	
	private static final boolean func_101429_a(C_100098_h arg0)
	{
		// @00: getstatic boolean game.C_100319_hk.field_101455_u
		// @03: ifne @18
		// @06: aload_0
		// @07: iconst_0
		// @08: iconst_0
		// @09: iconst_0
		// @0A: invokevirtual game.C_100098_h.func_104610_b(int, int, int)byte[]
		// @0D: astore_1
		// @0E: aload_1
		// @0F: ifnonnull @14
		// @12: iconst_0
		// @13: ireturn
		// @14: aload_1
		// @15: invokestatic game.C_100319_hk.func_101421_a(byte[])void
		// @18: iconst_1
		// @19: ireturn
	}
	
	static final int func_101426_a()
	{
		// @00: getstatic byte[] game.C_100319_hk.field_101444_K
		// @03: getstatic int game.C_100319_hk.field_101453_w
		// @06: baload
		// @07: getstatic int game.C_100319_hk.field_101461_z
		// @0A: ishr
		// @0B: iconst_1
		// @0C: iand
		// @0D: istore_0
		// @0E: getstatic int game.C_100319_hk.field_101461_z
		// @11: iconst_1
		// @12: iadd
		// @13: putstatic int game.C_100319_hk.field_101461_z
		// @16: getstatic int game.C_100319_hk.field_101453_w
		// @19: getstatic int game.C_100319_hk.field_101461_z
		// @1C: iconst_3
		// @1D: ishr
		// @1E: iadd
		// @1F: putstatic int game.C_100319_hk.field_101453_w
		// @22: getstatic int game.C_100319_hk.field_101461_z
		// @25: bipush 7 (0x07)
		// @27: iand
		// @28: putstatic int game.C_100319_hk.field_101461_z
		// @2B: iload_0
		// @2C: ireturn
	}
	
	private C_100319_hk(byte[] arg0) throws IOException
	{
		// @0: aload_0
		// @1: invokespecial game.C_100158_da.<init>()void
		// @4: aload_0
		// @5: aload_1
		// @6: invokespecial game.C_100319_hk.func_101417_b(byte[])void
		// @9: return
	}
	
	static
	{
		// @0: iconst_0
		// @1: putstatic boolean game.C_100319_hk.field_101455_u
		// @4: return
	}
}
