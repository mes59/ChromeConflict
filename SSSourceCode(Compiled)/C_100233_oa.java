package game;

final class C_100233_oa
{
	C_100326_ic field_106237_d;
	int field_106240_c;
	private boolean field_106258_q;
	static boolean[] field_106257_r;
	private int field_106259_p;
	static int field_106247_m;
	C_100326_ic field_106255_t;
	int field_106249_k;
	int field_106241_A;
	int field_106254_u;
	static int field_106250_h;
	C_100326_ic field_106260_z;
	static String field_106256_s;
	static String field_106261_y;
	static String field_106246_l;
	int field_106248_j;
	static String field_106235_f;
	C_100326_ic field_106252_w;
	C_100112_r field_106236_g;
	static int field_106262_x;
	static C_100037_wb field_106253_v;
	int field_106243_a;
	C_100326_ic field_106245_o;
	static String field_106238_e;
	static String[] field_106239_b;
	int field_106251_i;
	static String field_106244_n;
	private static final String[] field_106242_B;
	
	static final int[] func_106233_a(boolean arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: bipush 115 (0x73)
		// @007: iload_1
		// @008: invokestatic game.C_100042_we.func_104129_b(int, int)int[]
		// @00B: astore_2
		// @00C: aconst_null
		// @00D: aload_2
		// @00E: if_acmpeq @01F
		// @011: iconst_0
		// @012: aload_2
		// @013: arraylength
		// @014: if_icmpeq @01F
		// @017: goto @01B
		// @01A: athrow
		// @01B: goto @021
		// @01E: athrow
		// @01F: aconst_null
		// @020: areturn
		// @021: aload_2
		// @022: arraylength
		// @023: bipush -9 (0xF7)
		// @025: iadd
		// @026: newarray int[]
		// @028: astore_3
		// @029: aload_2
		// @02A: iconst_1
		// @02B: aload_3
		// @02C: iconst_0
		// @02D: aload_3
		// @02E: arraylength
		// @02F: invokestatic game.C_100120_en.func_104913_a(int[], int, int[], int, int)void
		// @032: iconst_0
		// @033: istore #4
		// @035: iconst_0
		// @036: istore #5
		// @038: iload #5
		// @03A: aload_3
		// @03B: arraylength
		// @03C: if_icmpge @0A1
		// @03F: iconst_m1
		// @040: iload #7
		// @042: ifne @0A3
		// @045: aload_3
		// @046: iload #5
		// @048: iaload
		// @049: bipush 89 (0x59)
		// @04B: invokestatic game.C_100186_rl.func_105719_a(int, int)int
		// @04E: iconst_m1
		// @04F: ixor
		// @050: if_icmpge @05B
		// @053: goto @057
		// @056: athrow
		// @057: goto @060
		// @05A: athrow
		// @05B: aload_3
		// @05C: iload #5
		// @05E: iconst_m1
		// @05F: iastore
		// @060: iconst_0
		// @061: aload_3
		// @062: iload #5
		// @064: iaload
		// @065: if_icmpgt @099
		// @068: iinc #4 +1
		// @06B: iconst_1
		// @06C: iload #5
		// @06E: iadd
		// @06F: istore #6
		// @071: aload_3
		// @072: arraylength
		// @073: iload #6
		// @075: if_icmple @099
		// @078: aload_3
		// @079: iload #5
		// @07B: iaload
		// @07C: aload_3
		// @07D: iload #6
		// @07F: iaload
		// @080: iload #7
		// @082: ifne @03C
		// @085: if_icmpne @091
		// @088: aload_3
		// @089: iload #6
		// @08B: iconst_m1
		// @08C: iastore
		// @08D: goto @091
		// @090: athrow
		// @091: iinc #6 +1
		// @094: iload #7
		// @096: ifeq @071
		// @099: iinc #5 +1
		// @09C: iload #7
		// @09E: ifeq @038
		// @0A1: iload #4
		// @0A3: newarray int[]
		// @0A5: astore #5
		// @0A7: iconst_0
		// @0A8: istore #4
		// @0AA: iconst_0
		// @0AB: istore #6
		// @0AD: iload #6
		// @0AF: aload_3
		// @0B0: arraylength
		// @0B1: if_icmpge @0DE
		// @0B4: iconst_0
		// @0B5: aload_3
		// @0B6: iload #6
		// @0B8: iaload
		// @0B9: iconst_m1
		// @0BA: ixor
		// @0BB: iload #7
		// @0BD: ifne @0E0
		// @0C0: if_icmpne @0CA
		// @0C3: goto @0C7
		// @0C6: athrow
		// @0C7: goto @0D6
		// @0CA: aload #5
		// @0CC: iload #4
		// @0CE: iinc #4 +1
		// @0D1: aload_3
		// @0D2: iload #6
		// @0D4: iaload
		// @0D5: iastore
		// @0D6: iinc #6 +1
		// @0D9: iload #7
		// @0DB: ifeq @0AD
		// @0DE: iload_0
		// @0DF: iconst_1
		// @0E0: if_icmpeq @0E8
		// @0E3: aconst_null
		// @0E4: checkcast int[]
		// @0E7: areturn
		// @0E8: aload #5
		// @0EA: areturn
		// @0EB: astore_2
		// @0EC: aload_2
		// @0ED: new java.lang.StringBuilder
		// @0F0: dup
		// @0F1: invokespecial java.lang.StringBuilder.<init>()void
		// @0F4: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @0F7: iconst_4
		// @0F8: aaload
		// @0F9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0FC: iload_0
		// @0FD: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @100: bipush 44 (0x2C)
		// @102: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @105: iload_1
		// @106: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @109: bipush 41 (0x29)
		// @10B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @111: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @114: athrow
	}
	
	static final boolean func_106225_a(boolean arg0)
	{
		// @00: iload_0
		// @01: ifeq @0D
		// @04: bipush -86 (0xAA)
		// @06: invokestatic game.C_100233_oa.func_106226_a(int)void
		// @09: goto @0D
		// @0C: athrow
		// @0D: getstatic game.C_100003_ga game.C_100100_i.field_102024_cc
		// @10: ifnull @28
		// @13: getstatic game.C_100003_ga game.C_100100_i.field_102024_cc
		// @16: sipush 13393 (0x3451)
		// @19: invokevirtual game.C_100003_ga.func_103515_c(int)boolean
		// @1C: ifeq @28
		// @1F: goto @23
		// @22: athrow
		// @23: iconst_1
		// @24: goto @29
		// @27: athrow
		// @28: iconst_0
		// @29: ireturn
		// @2A: astore_1
		// @2B: aload_1
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @36: bipush 11 (0x0B)
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: iload_0
		// @3D: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @40: bipush 41 (0x29)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @48: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4B: athrow
	}
	
	final void func_106230_a(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6)
	{
		// @00: iload #6
		// @02: bipush -99 (0x9D)
		// @04: if_icmple @10
		// @07: bipush 32 (0x20)
		// @09: putstatic int game.C_100233_oa.field_106262_x
		// @0C: goto @10
		// @0F: athrow
		// @10: iload_3
		// @11: iload_2
		// @12: iload_1
		// @13: iload #4
		// @15: iload #7
		// @17: iload #5
		// @19: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @1C: goto @7D
		// @1F: astore #8
		// @21: aload #8
		// @23: new java.lang.StringBuilder
		// @26: dup
		// @27: invokespecial java.lang.StringBuilder.<init>()void
		// @2A: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @2D: bipush 12 (0x0C)
		// @2F: aaload
		// @30: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @33: iload_1
		// @34: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @37: bipush 44 (0x2C)
		// @39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C: iload_2
		// @3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40: bipush 44 (0x2C)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: iload_3
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 44 (0x2C)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: iload #4
		// @50: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @53: bipush 44 (0x2C)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: iload #5
		// @5A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5D: bipush 44 (0x2C)
		// @5F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @62: iload #6
		// @64: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @67: bipush 44 (0x2C)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: iload #7
		// @6E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @71: bipush 41 (0x29)
		// @73: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @76: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @79: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7C: athrow
		// @7D: return
	}
	
	final void func_106232_a(int arg0, C_100112_r arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #15
		// @005: new game.C_100256_pk
		// @008: dup
		// @009: aload_2
		// @00A: iconst_2
		// @00B: iconst_2
		// @00C: ldc 2236962 (0x222222)
		// @00E: iconst_1
		// @00F: iconst_1
		// @010: iconst_1
		// @011: aload_2
		// @012: getfield int game.C_100112_r.field_101772_Q
		// @015: aload_2
		// @016: getfield int game.C_100112_r.field_101763_H
		// @019: bipush -2 (0xFE)
		// @01B: isub
		// @01C: iadd
		// @01D: invokespecial game.C_100256_pk.<init>(game.C_100112_r, int, int, int, int, int, int, int)void
		// @020: astore_3
		// @021: aload_3
		// @022: ldc 16777215 (0xffffff)
		// @024: putfield int game.C_100256_pk.field_100473_h
		// @027: aload_0
		// @028: aload_3
		// @029: putfield game.C_100326_ic game.C_100233_oa.field_106252_w
		// @02C: new game.C_100139_tb
		// @02F: dup
		// @030: invokespecial game.C_100139_tb.<init>()void
		// @033: astore #4
		// @035: aload_3
		// @036: aload #4
		// @038: iload_1
		// @039: bipush 61 (0x3D)
		// @03B: ixor
		// @03C: invokevirtual game.C_100256_pk.func_100454_a(game.C_100256_pk, int)void
		// @03F: aload_0
		// @040: iconst_m1
		// @041: putfield int game.C_100233_oa.field_106243_a
		// @044: aload_0
		// @045: iconst_3
		// @046: putfield int game.C_100233_oa.field_106241_A
		// @049: aload #4
		// @04B: ldc 11711154 (0xb2b2b2)
		// @04D: putfield int game.C_100139_tb.field_100476_t
		// @050: aload_0
		// @051: iconst_3
		// @052: putfield int game.C_100233_oa.field_106249_k
		// @055: aload_0
		// @056: aload_2
		// @057: putfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @05A: aload_0
		// @05B: ldc 15658734 (0xeeeeee)
		// @05D: putfield int game.C_100233_oa.field_106259_p
		// @060: aload_0
		// @061: ldc 5592405 (0x555555)
		// @063: putfield int game.C_100233_oa.field_106240_c
		// @066: aload_0
		// @067: iconst_3
		// @068: putfield int game.C_100233_oa.field_106248_j
		// @06B: aload_0
		// @06C: ldc 15658734 (0xeeeeee)
		// @06E: putfield int game.C_100233_oa.field_106251_i
		// @071: aload #4
		// @073: ldc 15658734 (0xeeeeee)
		// @075: putfield int game.C_100139_tb.field_100469_l
		// @078: aload_0
		// @079: iconst_3
		// @07A: putfield int game.C_100233_oa.field_106254_u
		// @07D: aload #4
		// @07F: iconst_0
		// @080: iconst_0
		// @081: invokevirtual game.C_100139_tb.func_100528_b(int, int)game.C_100225_ah
		// @084: bipush -108 (0x94)
		// @086: ldc 15658734 (0xeeeeee)
		// @088: invokevirtual game.C_100225_ah.func_106113_a(int, int)game.C_100225_ah
		// @08B: ldc 10066329 (0x999999)
		// @08D: ldc 8947848 (0x888888)
		// @08F: ldc 7829367 (0x777777)
		// @091: iconst_1
		// @092: invokestatic game.C_100036_gg.func_103143_b(int, int, int, int)game.C_100037_wb[]
		// @095: bipush -67 (0xBD)
		// @097: invokevirtual game.C_100225_ah.func_106104_a(game.C_100037_wb[], int)game.C_100225_ah
		// @09A: pop
		// @09B: aload #4
		// @09D: iconst_0
		// @09E: iconst_1
		// @09F: invokevirtual game.C_100139_tb.func_100528_b(int, int)game.C_100225_ah
		// @0A2: ldc 10066329 (0x999999)
		// @0A4: ldc 11184810 (0xaaaaaa)
		// @0A6: ldc 13421772 (0xcccccc)
		// @0A8: iconst_1
		// @0A9: invokestatic game.C_100036_gg.func_103143_b(int, int, int, int)game.C_100037_wb[]
		// @0AC: bipush -68 (0xBC)
		// @0AE: invokevirtual game.C_100225_ah.func_106104_a(game.C_100037_wb[], int)game.C_100225_ah
		// @0B1: pop
		// @0B2: aload #4
		// @0B4: iconst_0
		// @0B5: iconst_3
		// @0B6: invokevirtual game.C_100139_tb.func_100528_b(int, int)game.C_100225_ah
		// @0B9: ldc 7829367 (0x777777)
		// @0BB: ldc 8947848 (0x888888)
		// @0BD: ldc 10066329 (0x999999)
		// @0BF: iconst_1
		// @0C0: invokestatic game.C_100036_gg.func_103143_b(int, int, int, int)game.C_100037_wb[]
		// @0C3: bipush -107 (0x95)
		// @0C5: invokevirtual game.C_100225_ah.func_106104_a(game.C_100037_wb[], int)game.C_100225_ah
		// @0C8: iconst_1
		// @0C9: sipush -19529 (0xB3B7)
		// @0CC: invokevirtual game.C_100225_ah.func_106116_d(int, int)game.C_100225_ah
		// @0CF: iconst_1
		// @0D0: iconst_0
		// @0D1: invokevirtual game.C_100225_ah.func_106117_c(int, int)game.C_100225_ah
		// @0D4: pop
		// @0D5: bipush 9 (0x09)
		// @0D7: anewarray game.C_100037_wb
		// @0DA: astore #5
		// @0DC: new game.C_100251_pm
		// @0DF: dup
		// @0E0: bipush 32 (0x20)
		// @0E2: bipush 32 (0x20)
		// @0E4: invokespecial game.C_100251_pm.<init>(int, int)void
		// @0E7: astore #6
		// @0E9: iconst_0
		// @0EA: istore #7
		// @0EC: aload #6
		// @0EE: getfield int[] game.C_100251_pm.field_102388_J
		// @0F1: arraylength
		// @0F2: iconst_m1
		// @0F3: ixor
		// @0F4: iload #7
		// @0F6: iconst_m1
		// @0F7: ixor
		// @0F8: if_icmpge @116
		// @0FB: aload #6
		// @0FD: getfield int[] game.C_100251_pm.field_102388_J
		// @100: iload #7
		// @102: ldc 1077952576 (0x40404040)
		// @104: iastore
		// @105: iinc #7 +1
		// @108: iload #15
		// @10A: ifne @15C
		// @10D: iload #15
		// @10F: ifeq @0EC
		// @112: goto @116
		// @115: athrow
		// @116: aload #5
		// @118: iconst_4
		// @119: aload #6
		// @11B: aastore
		// @11C: aload #4
		// @11E: iload_1
		// @11F: iconst_m1
		// @120: ixor
		// @121: iconst_4
		// @122: invokevirtual game.C_100139_tb.func_100528_b(int, int)game.C_100225_ah
		// @125: iconst_1
		// @126: bipush 30 (0x1E)
		// @128: invokevirtual game.C_100225_ah.func_106112_a(boolean, int)game.C_100225_ah
		// @12B: aload #5
		// @12D: bipush -83 (0xAD)
		// @12F: invokevirtual game.C_100225_ah.func_106104_a(game.C_100037_wb[], int)game.C_100225_ah
		// @132: pop
		// @133: aload #4
		// @135: iconst_0
		// @136: iconst_5
		// @137: invokevirtual game.C_100139_tb.func_100528_b(int, int)game.C_100225_ah
		// @13A: iconst_0
		// @13B: ldc 65793 (0x10101)
		// @13D: iconst_0
		// @13E: bipush 14 (0x0E)
		// @140: iconst_0
		// @141: invokestatic game.C_100318_hj.func_107189_a(int, int, int, byte, int)game.C_100037_wb[]
		// @144: bipush -96 (0xA0)
		// @146: invokevirtual game.C_100225_ah.func_106104_a(game.C_100037_wb[], int)game.C_100225_ah
		// @149: iconst_1
		// @14A: bipush 50 (0x32)
		// @14C: invokevirtual game.C_100225_ah.func_106112_a(boolean, int)game.C_100225_ah
		// @14F: bipush -111 (0x91)
		// @151: iconst_m1
		// @152: invokevirtual game.C_100225_ah.func_106113_a(int, int)game.C_100225_ah
		// @155: pop
		// @156: aload_0
		// @157: aload #4
		// @159: putfield game.C_100326_ic game.C_100233_oa.field_106237_d
		// @15C: new game.C_100139_tb
		// @15F: dup
		// @160: aload #4
		// @162: iconst_1
		// @163: invokespecial game.C_100139_tb.<init>(game.C_100139_tb, boolean)void
		// @166: astore #6
		// @168: aload #6
		// @16A: iconst_0
		// @16B: putfield int game.C_100139_tb.field_100468_o
		// @16E: new game.C_100139_tb
		// @171: dup
		// @172: aload #4
		// @174: iconst_1
		// @175: invokespecial game.C_100139_tb.<init>(game.C_100139_tb, boolean)void
		// @178: astore #7
		// @17A: aload #7
		// @17C: iconst_0
		// @17D: putfield int game.C_100139_tb.field_100468_o
		// @180: aload #7
		// @182: bipush -66 (0xBE)
		// @184: ldc 8947848 (0x888888)
		// @186: bipush -2 (0xFE)
		// @188: invokestatic game.C_100189_ri.func_105745_a(int, int)game.C_100037_wb[]
		// @18B: invokevirtual game.C_100139_tb.func_100527_a(int, game.C_100037_wb[])void
		// @18E: aload #7
		// @190: iload_1
		// @191: iconst_m1
		// @192: ixor
		// @193: iconst_1
		// @194: invokevirtual game.C_100139_tb.func_100528_b(int, int)game.C_100225_ah
		// @197: ldc 11184810 (0xaaaaaa)
		// @199: bipush -2 (0xFE)
		// @19B: invokestatic game.C_100189_ri.func_105745_a(int, int)game.C_100037_wb[]
		// @19E: iload_1
		// @19F: bipush 101 (0x65)
		// @1A1: ixor
		// @1A2: invokevirtual game.C_100225_ah.func_106104_a(game.C_100037_wb[], int)game.C_100225_ah
		// @1A5: iload_1
		// @1A6: bipush 127 (0x7F)
		// @1A8: ixor
		// @1A9: ldc 2236962 (0x222222)
		// @1AB: invokevirtual game.C_100225_ah.func_106113_a(int, int)game.C_100225_ah
		// @1AE: pop
		// @1AF: aload_0
		// @1B0: new game.C_100001_ge
		// @1B3: dup
		// @1B4: aload_2
		// @1B5: iconst_2
		// @1B6: iconst_2
		// @1B7: ldc 16777215 (0xffffff)
		// @1B9: iconst_m1
		// @1BA: iconst_5
		// @1BB: iconst_5
		// @1BC: bipush 15 (0x0F)
		// @1BE: bipush 15 (0x0F)
		// @1C0: ldc 4473924 (0x444444)
		// @1C2: invokespecial game.C_100001_ge.<init>(game.C_100112_r, int, int, int, int, int, int, int, int, int)void
		// @1C5: putfield game.C_100326_ic game.C_100233_oa.field_106255_t
		// @1C8: new game.C_100145_ta
		// @1CB: dup
		// @1CC: aload_2
		// @1CD: iconst_2
		// @1CE: iconst_2
		// @1CF: ldc 16777215 (0xffffff)
		// @1D1: iconst_m1
		// @1D2: ldc 16777215 (0xffffff)
		// @1D4: ldc 16729156 (0xff4444)
		// @1D6: ldc 4473924 (0x444444)
		// @1D8: invokespecial game.C_100145_ta.<init>(game.C_100112_r, int, int, int, int, int, int, int)void
		// @1DB: pop
		// @1DC: new game.C_100138_bo
		// @1DF: dup
		// @1E0: aload_2
		// @1E1: ldc 16777215 (0xffffff)
		// @1E3: iload_1
		// @1E4: ldc 125269879 (0x7777777)
		// @1E6: ldc 4473924 (0x444444)
		// @1E8: iconst_3
		// @1E9: ldc 268435455 (0xfffffff)
		// @1EB: invokespecial game.C_100138_bo.<init>(game.C_100112_r, int, int, int, int, int, int)void
		// @1EE: pop
		// @1EF: new game.C_100139_tb
		// @1F2: dup
		// @1F3: invokespecial game.C_100139_tb.<init>()void
		// @1F6: astore #8
		// @1F8: aload_3
		// @1F9: aload #8
		// @1FB: bipush -62 (0xC2)
		// @1FD: invokevirtual game.C_100256_pk.func_100454_a(game.C_100256_pk, int)void
		// @200: aload #8
		// @202: iload_1
		// @203: iconst_1
		// @204: iadd
		// @205: iconst_0
		// @206: invokevirtual game.C_100139_tb.func_100528_b(int, int)game.C_100225_ah
		// @209: ldc 7829367 (0x777777)
		// @20B: ldc 15658734 (0xeeeeee)
		// @20D: ldc 10066329 (0x999999)
		// @20F: iconst_1
		// @210: invokestatic game.C_100036_gg.func_103143_b(int, int, int, int)game.C_100037_wb[]
		// @213: bipush -116 (0x8C)
		// @215: invokevirtual game.C_100225_ah.func_106104_a(game.C_100037_wb[], int)game.C_100225_ah
		// @218: bipush -113 (0x8F)
		// @21A: ldc 1118481 (0x111111)
		// @21C: invokevirtual game.C_100225_ah.func_106113_a(int, int)game.C_100225_ah
		// @21F: bipush -2 (0xFE)
		// @221: iconst_m1
		// @222: invokevirtual game.C_100225_ah.func_106111_b(int, int)game.C_100225_ah
		// @225: pop
		// @226: aload #8
		// @228: iconst_0
		// @229: iconst_4
		// @22A: invokevirtual game.C_100139_tb.func_100528_b(int, int)game.C_100225_ah
		// @22D: iconst_1
		// @22E: bipush 44 (0x2C)
		// @230: invokevirtual game.C_100225_ah.func_106112_a(boolean, int)game.C_100225_ah
		// @233: aload #5
		// @235: bipush -100 (0x9C)
		// @237: invokevirtual game.C_100225_ah.func_106104_a(game.C_100037_wb[], int)game.C_100225_ah
		// @23A: pop
		// @23B: aload_0
		// @23C: aload #8
		// @23E: putfield game.C_100326_ic game.C_100233_oa.field_106260_z
		// @241: bipush 9 (0x09)
		// @243: anewarray game.C_100037_wb
		// @246: astore #9
		// @248: aload #9
		// @24A: iconst_4
		// @24B: new game.C_100037_wb
		// @24E: dup
		// @24F: iconst_2
		// @250: iconst_1
		// @251: invokespecial game.C_100037_wb.<init>(int, int)void
		// @254: aastore
		// @255: bipush 9 (0x09)
		// @257: anewarray game.C_100037_wb
		// @25A: astore #10
		// @25C: aload #10
		// @25E: iconst_4
		// @25F: new game.C_100037_wb
		// @262: dup
		// @263: iconst_1
		// @264: iconst_2
		// @265: invokespecial game.C_100037_wb.<init>(int, int)void
		// @268: aastore
		// @269: aload #10
		// @26B: iconst_4
		// @26C: aaload
		// @26D: aload #9
		// @26F: iconst_4
		// @270: aaload
		// @271: iconst_2
		// @272: newarray int[]
		// @274: dup
		// @275: iconst_0
		// @276: ldc 6710886 (0x666666)
		// @278: iastore
		// @279: dup
		// @27A: iconst_1
		// @27B: ldc 7829367 (0x777777)
		// @27D: iastore
		// @27E: dup_x1
		// @27F: putfield int[] game.C_100037_wb.field_102388_J
		// @282: putfield int[] game.C_100037_wb.field_102388_J
		// @285: new game.C_100139_tb
		// @288: dup
		// @289: invokespecial game.C_100139_tb.<init>()void
		// @28C: astore #11
		// @28E: new game.C_100139_tb
		// @291: dup
		// @292: invokespecial game.C_100139_tb.<init>()void
		// @295: astore #12
		// @297: aload #11
		// @299: iconst_0
		// @29A: aload #9
		// @29C: iconst_0
		// @29D: invokevirtual game.C_100139_tb.func_100522_a(int, game.C_100037_wb[], boolean)void
		// @2A0: aload #12
		// @2A2: iconst_0
		// @2A3: aload #10
		// @2A5: iconst_0
		// @2A6: invokevirtual game.C_100139_tb.func_100522_a(int, game.C_100037_wb[], boolean)void
		// @2A9: new game.C_100037_wb
		// @2AC: dup
		// @2AD: bipush 7 (0x07)
		// @2AF: iconst_4
		// @2B0: invokespecial game.C_100037_wb.<init>(int, int)void
		// @2B3: astore #13
		// @2B5: aload #13
		// @2B7: bipush 28 (0x1C)
		// @2B9: newarray int[]
		// @2BB: dup
		// @2BC: iconst_0
		// @2BD: ldc 8947848 (0x888888)
		// @2BF: iastore
		// @2C0: dup
		// @2C1: iconst_1
		// @2C2: ldc 8947848 (0x888888)
		// @2C4: iastore
		// @2C5: dup
		// @2C6: iconst_2
		// @2C7: ldc 8947848 (0x888888)
		// @2C9: iastore
		// @2CA: dup
		// @2CB: iconst_3
		// @2CC: ldc 13421772 (0xcccccc)
		// @2CE: iastore
		// @2CF: dup
		// @2D0: iconst_4
		// @2D1: ldc 8947848 (0x888888)
		// @2D3: iastore
		// @2D4: dup
		// @2D5: iconst_5
		// @2D6: ldc 8947848 (0x888888)
		// @2D8: iastore
		// @2D9: dup
		// @2DA: bipush 6 (0x06)
		// @2DC: ldc 8947848 (0x888888)
		// @2DE: iastore
		// @2DF: dup
		// @2E0: bipush 7 (0x07)
		// @2E2: ldc 8947848 (0x888888)
		// @2E4: iastore
		// @2E5: dup
		// @2E6: bipush 8 (0x08)
		// @2E8: ldc 8947848 (0x888888)
		// @2EA: iastore
		// @2EB: dup
		// @2EC: bipush 9 (0x09)
		// @2EE: ldc 13421772 (0xcccccc)
		// @2F0: iastore
		// @2F1: dup
		// @2F2: bipush 10 (0x0A)
		// @2F4: ldc 13421772 (0xcccccc)
		// @2F6: iastore
		// @2F7: dup
		// @2F8: bipush 11 (0x0B)
		// @2FA: ldc 13421772 (0xcccccc)
		// @2FC: iastore
		// @2FD: dup
		// @2FE: bipush 12 (0x0C)
		// @300: ldc 8947848 (0x888888)
		// @302: iastore
		// @303: dup
		// @304: bipush 13 (0x0D)
		// @306: ldc 8947848 (0x888888)
		// @308: iastore
		// @309: dup
		// @30A: bipush 14 (0x0E)
		// @30C: ldc 8947848 (0x888888)
		// @30E: iastore
		// @30F: dup
		// @310: bipush 15 (0x0F)
		// @312: ldc 13421772 (0xcccccc)
		// @314: iastore
		// @315: dup
		// @316: bipush 16 (0x10)
		// @318: ldc 13421772 (0xcccccc)
		// @31A: iastore
		// @31B: dup
		// @31C: bipush 17 (0x11)
		// @31E: ldc 13421772 (0xcccccc)
		// @320: iastore
		// @321: dup
		// @322: bipush 18 (0x12)
		// @324: ldc 13421772 (0xcccccc)
		// @326: iastore
		// @327: dup
		// @328: bipush 19 (0x13)
		// @32A: ldc 13421772 (0xcccccc)
		// @32C: iastore
		// @32D: dup
		// @32E: bipush 20 (0x14)
		// @330: ldc 8947848 (0x888888)
		// @332: iastore
		// @333: dup
		// @334: bipush 21 (0x15)
		// @336: ldc 13421772 (0xcccccc)
		// @338: iastore
		// @339: dup
		// @33A: bipush 22 (0x16)
		// @33C: ldc 13421772 (0xcccccc)
		// @33E: iastore
		// @33F: dup
		// @340: bipush 23 (0x17)
		// @342: ldc 13421772 (0xcccccc)
		// @344: iastore
		// @345: dup
		// @346: bipush 24 (0x18)
		// @348: ldc 13421772 (0xcccccc)
		// @34A: iastore
		// @34B: dup
		// @34C: bipush 25 (0x19)
		// @34E: ldc 13421772 (0xcccccc)
		// @350: iastore
		// @351: dup
		// @352: bipush 26 (0x1A)
		// @354: ldc 13421772 (0xcccccc)
		// @356: iastore
		// @357: dup
		// @358: bipush 27 (0x1B)
		// @35A: ldc 13421772 (0xcccccc)
		// @35C: iastore
		// @35D: putfield int[] game.C_100037_wb.field_102388_J
		// @360: new game.C_100139_tb
		// @363: dup
		// @364: aload #4
		// @366: iconst_1
		// @367: invokespecial game.C_100139_tb.<init>(game.C_100139_tb, boolean)void
		// @36A: astore #14
		// @36C: aload #14
		// @36E: bipush -80 (0xB0)
		// @370: aload #13
		// @372: invokevirtual game.C_100037_wb.func_102381_e()game.C_100037_wb
		// @375: invokevirtual game.C_100139_tb.func_100521_a(int, game.C_100037_wb)void
		// @378: aload #13
		// @37A: invokevirtual game.C_100037_wb.func_102356_b()void
		// @37D: new game.C_100139_tb
		// @380: dup
		// @381: aload #4
		// @383: iconst_1
		// @384: invokespecial game.C_100139_tb.<init>(game.C_100139_tb, boolean)void
		// @387: astore #14
		// @389: aload #14
		// @38B: bipush 117 (0x75)
		// @38D: aload #13
		// @38F: invokevirtual game.C_100037_wb.func_102381_e()game.C_100037_wb
		// @392: invokevirtual game.C_100139_tb.func_100521_a(int, game.C_100037_wb)void
		// @395: aload #13
		// @397: invokevirtual game.C_100037_wb.func_102356_b()void
		// @39A: new game.C_100139_tb
		// @39D: dup
		// @39E: aload #4
		// @3A0: iconst_1
		// @3A1: invokespecial game.C_100139_tb.<init>(game.C_100139_tb, boolean)void
		// @3A4: astore #14
		// @3A6: aload #14
		// @3A8: bipush 64 (0x40)
		// @3AA: aload #13
		// @3AC: invokevirtual game.C_100037_wb.func_102381_e()game.C_100037_wb
		// @3AF: invokevirtual game.C_100139_tb.func_100521_a(int, game.C_100037_wb)void
		// @3B2: aload #13
		// @3B4: invokevirtual game.C_100037_wb.func_102356_b()void
		// @3B7: new game.C_100139_tb
		// @3BA: dup
		// @3BB: aload #4
		// @3BD: iconst_1
		// @3BE: invokespecial game.C_100139_tb.<init>(game.C_100139_tb, boolean)void
		// @3C1: astore #14
		// @3C3: aload #14
		// @3C5: bipush -79 (0xB1)
		// @3C7: aload #13
		// @3C9: invokevirtual game.C_100139_tb.func_100521_a(int, game.C_100037_wb)void
		// @3CC: goto @40A
		// @3CF: astore_3
		// @3D0: aload_3
		// @3D1: new java.lang.StringBuilder
		// @3D4: dup
		// @3D5: invokespecial java.lang.StringBuilder.<init>()void
		// @3D8: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @3DB: iconst_2
		// @3DC: aaload
		// @3DD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E0: iload_1
		// @3E1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E4: bipush 44 (0x2C)
		// @3E6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3E9: aload_2
		// @3EA: ifnull @3F6
		// @3ED: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @3F0: iconst_1
		// @3F1: aaload
		// @3F2: goto @3FB
		// @3F5: athrow
		// @3F6: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @3F9: iconst_0
		// @3FA: aaload
		// @3FB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3FE: bipush 41 (0x29)
		// @400: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @403: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @406: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @409: athrow
		// @40A: return
	}
	
	final void func_106224_a(String arg0, int arg1, int arg2, boolean arg3)
	{
		// @00: iload #4
		// @02: ifeq @17
		// @05: aload_0
		// @06: bipush 61 (0x3D)
		// @08: aconst_null
		// @09: checkcast java.lang.String
		// @0C: bipush -52 (0xCC)
		// @0E: bipush 62 (0x3E)
		// @10: invokespecial game.C_100233_oa.func_106229_a(int, java.lang.String, int, int)void
		// @13: goto @17
		// @16: athrow
		// @17: aload_0
		// @18: getfield boolean game.C_100233_oa.field_106258_q
		// @1B: ifne @2B
		// @1E: aload_0
		// @1F: iload_2
		// @20: ldc 10066329 (0x999999)
		// @22: aload_1
		// @23: iload_3
		// @24: invokespecial game.C_100233_oa.func_106234_a(int, int, java.lang.String, int)void
		// @27: goto @34
		// @2A: athrow
		// @2B: aload_0
		// @2C: iload_2
		// @2D: aload_1
		// @2E: iload_3
		// @2F: bipush 36 (0x24)
		// @31: invokespecial game.C_100233_oa.func_106229_a(int, java.lang.String, int, int)void
		// @34: goto @88
		// @37: astore #5
		// @39: aload #5
		// @3B: new java.lang.StringBuilder
		// @3E: dup
		// @3F: invokespecial java.lang.StringBuilder.<init>()void
		// @42: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @45: bipush 8 (0x08)
		// @47: aaload
		// @48: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4B: aload_1
		// @4C: ifnull @58
		// @4F: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @52: iconst_1
		// @53: aaload
		// @54: goto @5D
		// @57: athrow
		// @58: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @5B: iconst_0
		// @5C: aaload
		// @5D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @60: bipush 44 (0x2C)
		// @62: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @65: iload_2
		// @66: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @69: bipush 44 (0x2C)
		// @6B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6E: iload_3
		// @6F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @72: bipush 44 (0x2C)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: iload #4
		// @79: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @7C: bipush 41 (0x29)
		// @7E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @81: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @84: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @87: athrow
		// @88: return
	}
	
	public static void func_106226_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String[] game.C_100233_oa.field_106239_b
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100233_oa.field_106244_n
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100233_oa.field_106261_y
		// @0C: aconst_null
		// @0D: putstatic boolean[] game.C_100233_oa.field_106257_r
		// @10: aconst_null
		// @11: putstatic java.lang.String game.C_100233_oa.field_106256_s
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100233_oa.field_106246_l
		// @18: iload_0
		// @19: sipush 32159 (0x7D9F)
		// @1C: if_icmpeq @28
		// @1F: bipush 47 (0x2F)
		// @21: invokestatic game.C_100233_oa.func_106223_b(int)void
		// @24: goto @28
		// @27: athrow
		// @28: aconst_null
		// @29: putstatic game.C_100037_wb game.C_100233_oa.field_106253_v
		// @2C: aconst_null
		// @2D: putstatic java.lang.String game.C_100233_oa.field_106238_e
		// @30: aconst_null
		// @31: putstatic java.lang.String game.C_100233_oa.field_106235_f
		// @34: goto @59
		// @37: astore_1
		// @38: aload_1
		// @39: new java.lang.StringBuilder
		// @3C: dup
		// @3D: invokespecial java.lang.StringBuilder.<init>()void
		// @40: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @43: bipush 9 (0x09)
		// @45: aaload
		// @46: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @49: iload_0
		// @4A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4D: bipush 41 (0x29)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @55: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @58: athrow
		// @59: return
	}
	
	static final C_100154_sl func_106222_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush 86 (0x56)
		// @03: if_icmpge @0F
		// @06: bipush 41 (0x29)
		// @08: putstatic int game.C_100233_oa.field_106247_m
		// @0B: goto @0F
		// @0E: athrow
		// @0F: iconst_0
		// @10: invokestatic game.C_100111_el.func_104851_a(boolean)java.lang.String
		// @13: astore_1
		// @14: aconst_null
		// @15: aload_1
		// @16: if_acmpeq @30
		// @19: aload_1
		// @1A: bipush 64 (0x40)
		// @1C: invokevirtual java.lang.String.indexOf(int)int
		// @1F: iconst_m1
		// @20: ixor
		// @21: iconst_m1
		// @22: if_icmple @2D
		// @25: goto @29
		// @28: athrow
		// @29: goto @30
		// @2C: athrow
		// @2D: ldc ""
		// @2F: astore_1
		// @30: new game.C_100154_sl
		// @33: dup
		// @34: iconst_0
		// @35: invokestatic game.C_100111_el.func_104851_a(boolean)java.lang.String
		// @38: bipush 106 (0x6A)
		// @3A: invokestatic game.C_100249_pc.func_102317_d(byte)boolean
		// @3D: invokespecial game.C_100154_sl.<init>(java.lang.String, boolean)void
		// @40: areturn
		// @41: astore_1
		// @42: aload_1
		// @43: new java.lang.StringBuilder
		// @46: dup
		// @47: invokespecial java.lang.StringBuilder.<init>()void
		// @4A: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @4D: iconst_5
		// @4E: aaload
		// @4F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @52: iload_0
		// @53: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @56: bipush 41 (0x29)
		// @58: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @61: athrow
	}
	
	final void func_106231_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @00: iload_1
		// @01: bipush 85 (0x55)
		// @03: if_icmpge @07
		// @06: return
		// @07: iload #4
		// @09: iload #5
		// @0B: iload_2
		// @0C: iload #6
		// @0E: iload_3
		// @0F: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @12: goto @69
		// @15: astore #7
		// @17: aload #7
		// @19: new java.lang.StringBuilder
		// @1C: dup
		// @1D: invokespecial java.lang.StringBuilder.<init>()void
		// @20: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @23: bipush 13 (0x0D)
		// @25: aaload
		// @26: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @29: iload_1
		// @2A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2D: bipush 44 (0x2C)
		// @2F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @32: iload_2
		// @33: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @36: bipush 44 (0x2C)
		// @38: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3B: iload_3
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 44 (0x2C)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: iload #4
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 44 (0x2C)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: iload #5
		// @50: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @53: bipush 44 (0x2C)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: iload #6
		// @5A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5D: bipush 41 (0x29)
		// @5F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @62: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @65: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @68: athrow
		// @69: return
	}
	
	static final void func_106223_b(int arg0)
	{
		// @00: getstatic java.lang.StringBuilder game.C_100183_cd.field_103422_O
		// @03: iconst_0
		// @04: invokevirtual java.lang.StringBuilder.setLength(int)void
		// @07: bipush -66 (0xBE)
		// @09: iload_0
		// @0A: bipush -28 (0xE4)
		// @0C: isub
		// @0D: bipush 50 (0x32)
		// @0F: idiv
		// @10: irem
		// @11: istore_1
		// @12: iconst_0
		// @13: putstatic int game.C_100113_ek.field_104880_b
		// @16: goto @3A
		// @19: astore_1
		// @1A: aload_1
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @25: iconst_3
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: iload_0
		// @2B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2E: bipush 41 (0x29)
		// @30: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @33: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @36: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @39: athrow
		// @3A: return
	}
	
	private final void func_106234_a(int arg0, int arg1, String arg2, int arg3)
	{
		// @000: aload_0
		// @001: getfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @004: aload_3
		// @005: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @008: istore #5
		// @00A: aload_0
		// @00B: getfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @00E: getfield int game.C_100112_r.field_101763_H
		// @011: aload_0
		// @012: getfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @015: getfield int game.C_100112_r.field_101769_u
		// @018: iadd
		// @019: istore #6
		// @01B: iload_1
		// @01C: istore #7
		// @01E: getstatic int game.C_100196_rb.field_105819_e
		// @021: iconst_m1
		// @022: ixor
		// @023: iload #5
		// @025: iload #7
		// @027: bipush 6 (0x06)
		// @029: iadd
		// @02A: iadd
		// @02B: iconst_m1
		// @02C: ixor
		// @02D: if_icmple @03B
		// @030: bipush -6 (0xFA)
		// @032: getstatic int game.C_100196_rb.field_105819_e
		// @035: iload #5
		// @037: isub
		// @038: iadd
		// @039: istore #7
		// @03B: iload_2
		// @03C: ldc 10066329 (0x999999)
		// @03E: if_icmpeq @042
		// @041: return
		// @042: bipush 32 (0x20)
		// @044: iload #4
		// @046: iadd
		// @047: aload_0
		// @048: getfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @04B: getfield int game.C_100112_r.field_101769_u
		// @04E: ineg
		// @04F: iadd
		// @050: istore #8
		// @052: getstatic int game.C_100196_rb.field_105821_c
		// @055: iconst_m1
		// @056: ixor
		// @057: iload #8
		// @059: iload #6
		// @05B: bipush -6 (0xFA)
		// @05D: isub
		// @05E: iadd
		// @05F: iconst_m1
		// @060: ixor
		// @061: if_icmpgt @068
		// @064: goto @074
		// @067: athrow
		// @068: bipush -6 (0xFA)
		// @06A: iload #6
		// @06C: ineg
		// @06D: iadd
		// @06E: getstatic int game.C_100196_rb.field_105821_c
		// @071: iadd
		// @072: istore #8
		// @074: iload #7
		// @076: iload #8
		// @078: iload #5
		// @07A: bipush 6 (0x06)
		// @07C: iadd
		// @07D: bipush 6 (0x06)
		// @07F: iload #6
		// @081: iadd
		// @082: aload_0
		// @083: getfield int game.C_100233_oa.field_106259_p
		// @086: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @089: iload #7
		// @08B: iconst_m1
		// @08C: isub
		// @08D: iconst_1
		// @08E: iload #8
		// @090: iadd
		// @091: iload #5
		// @093: bipush -4 (0xFC)
		// @095: isub
		// @096: iconst_4
		// @097: iload #6
		// @099: iadd
		// @09A: aload_0
		// @09B: getfield int game.C_100233_oa.field_106240_c
		// @09E: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @0A1: aload_0
		// @0A2: getfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @0A5: aload_3
		// @0A6: iload #7
		// @0A8: iconst_3
		// @0A9: iadd
		// @0AA: aload_0
		// @0AB: getfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @0AE: getfield int game.C_100112_r.field_101769_u
		// @0B1: iload #8
		// @0B3: iadd
		// @0B4: iconst_3
		// @0B5: iadd
		// @0B6: aload_0
		// @0B7: getfield int game.C_100233_oa.field_106259_p
		// @0BA: iconst_m1
		// @0BB: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @0BE: goto @112
		// @0C1: astore #5
		// @0C3: aload #5
		// @0C5: new java.lang.StringBuilder
		// @0C8: dup
		// @0C9: invokespecial java.lang.StringBuilder.<init>()void
		// @0CC: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @0CF: bipush 10 (0x0A)
		// @0D1: aaload
		// @0D2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D5: iload_1
		// @0D6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D9: bipush 44 (0x2C)
		// @0DB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0DE: iload_2
		// @0DF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E2: bipush 44 (0x2C)
		// @0E4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E7: aload_3
		// @0E8: ifnull @0F4
		// @0EB: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @0EE: iconst_1
		// @0EF: aaload
		// @0F0: goto @0F9
		// @0F3: athrow
		// @0F4: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @0F7: iconst_0
		// @0F8: aaload
		// @0F9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0FC: bipush 44 (0x2C)
		// @0FE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @101: iload #4
		// @103: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @106: bipush 41 (0x29)
		// @108: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @10E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @111: athrow
		// @112: return
	}
	
	public C_100233_oa()
	{
		// @0: aload_0
		// @1: invokespecial java.lang.Object.<init>()void
		// @4: aload_0
		// @5: iconst_1
		// @6: putfield boolean game.C_100233_oa.field_106258_q
		// @9: return
	}
	
	private final void func_106229_a(int arg0, String arg1, int arg2, int arg3)
	{
		// @000: aload_0
		// @001: getfield int game.C_100233_oa.field_106254_u
		// @004: aload_0
		// @005: getfield int game.C_100233_oa.field_106248_j
		// @008: iadd
		// @009: istore #5
		// @00B: iload #4
		// @00D: ifgt @01A
		// @010: aload_0
		// @011: bipush 82 (0x52)
		// @013: putfield int game.C_100233_oa.field_106254_u
		// @016: goto @01A
		// @019: athrow
		// @01A: aload_0
		// @01B: getfield int game.C_100233_oa.field_106241_A
		// @01E: aload_0
		// @01F: getfield int game.C_100233_oa.field_106249_k
		// @022: iadd
		// @023: istore #6
		// @025: aload_0
		// @026: getfield int game.C_100233_oa.field_106243_a
		// @029: istore #7
		// @02B: iconst_m1
		// @02C: iload #7
		// @02E: if_icmpne @042
		// @031: aload_0
		// @032: getfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @035: getfield int game.C_100112_r.field_101763_H
		// @038: aload_0
		// @039: getfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @03C: getfield int game.C_100112_r.field_101772_Q
		// @03F: iadd
		// @040: istore #7
		// @042: getstatic int game.C_100196_rb.field_105819_e
		// @045: ldc 1106591106 (0x41f53d82)
		// @047: ishr
		// @048: istore #8
		// @04A: aload_0
		// @04B: getfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @04E: aload_2
		// @04F: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @052: istore #9
		// @054: aload_0
		// @055: getfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @058: getfield int game.C_100112_r.field_101763_H
		// @05B: aload_0
		// @05C: getfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @05F: getfield int game.C_100112_r.field_101772_Q
		// @062: iadd
		// @063: istore #10
		// @065: iconst_1
		// @066: istore #11
		// @068: iload #8
		// @06A: iload #9
		// @06C: if_icmplt @083
		// @06F: iconst_0
		// @070: aload_2
		// @071: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @074: bipush 6 (0x06)
		// @076: aaload
		// @077: invokevirtual java.lang.String.indexOf(java.lang.String)int
		// @07A: iconst_m1
		// @07B: ixor
		// @07C: if_icmpeq @115
		// @07F: goto @083
		// @082: athrow
		// @083: iload #9
		// @085: iload #8
		// @087: if_icmple @0AC
		// @08A: goto @08E
		// @08D: athrow
		// @08E: iload #9
		// @090: iload #8
		// @092: idiv
		// @093: istore #13
		// @095: iload #8
		// @097: iload #13
		// @099: iload #9
		// @09B: iload #8
		// @09D: irem
		// @09E: iconst_1
		// @09F: isub
		// @0A0: iadd
		// @0A1: iload #13
		// @0A3: idiv
		// @0A4: iconst_2
		// @0A5: imul
		// @0A6: iadd
		// @0A7: istore #12
		// @0A9: goto @0B0
		// @0AC: iload #8
		// @0AE: istore #12
		// @0B0: aconst_null
		// @0B1: getstatic java.lang.String[] game.C_100306_kn.field_107133_b
		// @0B4: if_acmpeq @0BB
		// @0B7: goto @0C3
		// @0BA: athrow
		// @0BB: bipush 16 (0x10)
		// @0BD: anewarray java.lang.String
		// @0C0: putstatic java.lang.String[] game.C_100306_kn.field_107133_b
		// @0C3: aload_0
		// @0C4: getfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @0C7: aload_2
		// @0C8: iconst_1
		// @0C9: newarray int[]
		// @0CB: dup
		// @0CC: iconst_0
		// @0CD: iload #12
		// @0CF: iastore
		// @0D0: getstatic java.lang.String[] game.C_100306_kn.field_107133_b
		// @0D3: invokevirtual game.C_100112_r.func_101730_a(java.lang.String, int[], java.lang.String[])int
		// @0D6: istore #11
		// @0D8: iconst_0
		// @0D9: istore #9
		// @0DB: iload #10
		// @0DD: iconst_m1
		// @0DE: iload #11
		// @0E0: iadd
		// @0E1: iload #7
		// @0E3: imul
		// @0E4: iadd
		// @0E5: istore #10
		// @0E7: iconst_0
		// @0E8: istore #13
		// @0EA: iload #13
		// @0EC: iconst_m1
		// @0ED: ixor
		// @0EE: iload #11
		// @0F0: iconst_m1
		// @0F1: ixor
		// @0F2: if_icmple @115
		// @0F5: aload_0
		// @0F6: getfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @0F9: getstatic java.lang.String[] game.C_100306_kn.field_107133_b
		// @0FC: iload #13
		// @0FE: aaload
		// @0FF: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @102: istore #14
		// @104: iload #9
		// @106: iload #14
		// @108: if_icmpge @10F
		// @10B: iload #14
		// @10D: istore #9
		// @10F: iinc #13 +1
		// @112: goto @0EA
		// @115: iload_1
		// @116: istore #12
		// @118: getstatic int game.C_100196_rb.field_105819_e
		// @11B: iload #9
		// @11D: iload #12
		// @11F: iadd
		// @120: iload #5
		// @122: ineg
		// @123: isub
		// @124: if_icmpge @133
		// @127: iload #5
		// @129: ineg
		// @12A: getstatic int game.C_100196_rb.field_105819_e
		// @12D: iload #9
		// @12F: isub
		// @130: iadd
		// @131: istore #12
		// @133: bipush 32 (0x20)
		// @135: iload_3
		// @136: aload_0
		// @137: getfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @13A: getfield int game.C_100112_r.field_101769_u
		// @13D: isub
		// @13E: iadd
		// @13F: istore #13
		// @141: getstatic int game.C_100196_rb.field_105821_c
		// @144: iconst_m1
		// @145: ixor
		// @146: iload #10
		// @148: iload #13
		// @14A: iload #6
		// @14C: iadd
		// @14D: iadd
		// @14E: iconst_m1
		// @14F: ixor
		// @150: if_icmple @15E
		// @153: iload #6
		// @155: ineg
		// @156: iload #10
		// @158: ineg
		// @159: iadd
		// @15A: iload_3
		// @15B: iadd
		// @15C: istore #13
		// @15E: iload #12
		// @160: iload #13
		// @162: iload #5
		// @164: iload #9
		// @166: iadd
		// @167: iload #10
		// @169: iload #6
		// @16B: iadd
		// @16C: aload_0
		// @16D: getfield int game.C_100233_oa.field_106251_i
		// @170: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @173: iconst_1
		// @174: iload #12
		// @176: iadd
		// @177: iload #13
		// @179: iconst_1
		// @17A: iadd
		// @17B: iload #9
		// @17D: iload #5
		// @17F: bipush -2 (0xFE)
		// @181: iadd
		// @182: iadd
		// @183: iload #6
		// @185: iload #10
		// @187: iadd
		// @188: iconst_2
		// @189: isub
		// @18A: aload_0
		// @18B: getfield int game.C_100233_oa.field_106240_c
		// @18E: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @191: aload_0
		// @192: getfield game.C_100112_r game.C_100233_oa.field_106236_g
		// @195: aload_2
		// @196: aload_0
		// @197: getfield int game.C_100233_oa.field_106248_j
		// @19A: iload #12
		// @19C: iadd
		// @19D: iload #13
		// @19F: aload_0
		// @1A0: getfield int game.C_100233_oa.field_106249_k
		// @1A3: ineg
		// @1A4: isub
		// @1A5: iload #9
		// @1A7: iload #10
		// @1A9: aload_0
		// @1AA: getfield int game.C_100233_oa.field_106259_p
		// @1AD: iconst_m1
		// @1AE: iconst_0
		// @1AF: iconst_0
		// @1B0: iload #7
		// @1B2: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @1B5: pop
		// @1B6: goto @20A
		// @1B9: astore #5
		// @1BB: aload #5
		// @1BD: new java.lang.StringBuilder
		// @1C0: dup
		// @1C1: invokespecial java.lang.StringBuilder.<init>()void
		// @1C4: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @1C7: bipush 7 (0x07)
		// @1C9: aaload
		// @1CA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1CD: iload_1
		// @1CE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1D1: bipush 44 (0x2C)
		// @1D3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D6: aload_2
		// @1D7: ifnull @1E3
		// @1DA: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @1DD: iconst_1
		// @1DE: aaload
		// @1DF: goto @1E8
		// @1E2: athrow
		// @1E3: getstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @1E6: iconst_0
		// @1E7: aaload
		// @1E8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1EB: bipush 44 (0x2C)
		// @1ED: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F0: iload_3
		// @1F1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1F4: bipush 44 (0x2C)
		// @1F6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F9: iload #4
		// @1FB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1FE: bipush 41 (0x29)
		// @200: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @203: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @206: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @209: athrow
		// @20A: return
	}
	
	static
	{
		// @00: bipush 14 (0x0E)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\u000c\"k\u0010"
		// @09: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u0019y)RO"
		// @14: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @17: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\r6)6\u001a"
		// @1F: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @22: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\r6)?\u001a"
		// @2A: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\r6)7\u001a"
		// @35: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @38: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\r6)9\u001a"
		// @40: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @43: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "^5uB"
		// @4C: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "\r6):\u001a"
		// @58: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "\r6)4\u001a"
		// @64: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @67: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "\r6)5\u001a"
		// @70: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @73: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "\r6);\u001a"
		// @7C: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "\r6)8\u001a"
		// @88: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @8E: aastore
		// @8F: dup
		// @90: bipush 12 (0x0C)
		// @92: ldc "\r6)=\u001a"
		// @94: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @97: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @9A: aastore
		// @9B: dup
		// @9C: bipush 13 (0x0D)
		// @9E: ldc "\r6)>\u001a"
		// @A0: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @A3: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @A6: aastore
		// @A7: putstatic java.lang.String[] game.C_100233_oa.field_106242_B
		// @AA: ldc "/8r\u000fWB8q\u0019@B6i\\[\u00018i\\T\r%'\u0018W\u00166n\u0010A"
		// @AC: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @AF: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @B2: putstatic java.lang.String game.C_100233_oa.field_106261_y
		// @B5: ldc "'9s\u0019@B9f\u0011WB8a\\B\u000e6~\u0019@B#h\\S\u00063'\u0008]B;n\u000fF"
		// @B7: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @BA: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @BD: putstatic java.lang.String game.C_100233_oa.field_106235_f
		// @C0: ldc ";8r\\S\u00102'\u0012]\u0015wd\u0010W\u0003%b\u0018\u0012\u00048u\\G\u00112'\u000b[\u0016?'\u0008Z\u0007wa\u0013^\u000e8p\u0015\\\u0005wn\u0008W\u000f$="
		// @C2: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @C5: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @C8: putstatic java.lang.String game.C_100233_oa.field_106256_s
		// @CB: bipush 16 (0x10)
		// @CD: anewarray java.lang.String
		// @D0: putstatic java.lang.String[] game.C_100233_oa.field_106239_b
		// @D3: ldc "&2a\u001dG\u000e#'\u0014W\u00033'\u001a]\u0010ws\u0014WBk\"L\u000cO4k\u001dA\u0011wt\u0019\\\u0016>i\u0019^L"
		// @D5: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @D8: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @DB: putstatic java.lang.String game.C_100233_oa.field_106246_l
		// @DE: iconst_4
		// @DF: putstatic int game.C_100233_oa.field_106247_m
		// @E2: bipush 33 (0x21)
		// @E4: putstatic int game.C_100233_oa.field_106262_x
		// @E7: ldc "12i\u0018\u0012\u0012%n\nS\u00162'\u0011W\u0011$f\u001bWB#h\\\u000eGg9"
		// @E9: invokestatic game.C_100233_oa.func_106228_z(java.lang.String)char[]
		// @EC: invokestatic game.C_100233_oa.func_106227_z(char[])java.lang.String
		// @EF: putstatic java.lang.String game.C_100233_oa.field_106238_e
		// @F2: ldc "W"
		// @F4: putstatic java.lang.String game.C_100233_oa.field_106244_n
		// @F7: return
	}
	
	private static char[] func_106228_z(String arg0)
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
		// @0E: bipush 50 (0x32)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_106227_z(char[] arg0)
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
		// @30: bipush 98 (0x62)
		// @32: goto @46
		// @35: bipush 87 (0x57)
		// @37: goto @46
		// @3A: bipush 7 (0x07)
		// @3C: goto @46
		// @3F: bipush 124 (0x7C)
		// @41: goto @46
		// @44: bipush 50 (0x32)
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
