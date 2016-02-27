package game;

final class C_100170_cm extends RuntimeException
{
	static String field_105550_i;
	static C_100037_wb field_105549_h;
	static int[][] field_105546_m;
	static char[] field_105540_b;
	static String field_105538_d;
	static int field_105541_c;
	static boolean field_105539_e;
	static C_100105_eg field_105536_f;
	static C_100302_ka field_105545_l;
	static C_100302_ka field_105544_o;
	String field_105542_a;
	Throwable field_105548_k;
	static int field_105547_j;
	static String field_105537_g;
	static String field_105543_n;
	private static final String[] field_105551_z;
	
	public static void func_105530_b(boolean arg0)
	{
		// @00: aconst_null
		// @01: checkcast int[][]
		// @04: putstatic int[][] game.C_100170_cm.field_105546_m
		// @07: aconst_null
		// @08: putstatic game.C_100302_ka game.C_100170_cm.field_105544_o
		// @0B: aconst_null
		// @0C: putstatic game.C_100105_eg game.C_100170_cm.field_105536_f
		// @0F: aconst_null
		// @10: putstatic java.lang.String game.C_100170_cm.field_105550_i
		// @13: aconst_null
		// @14: putstatic char[] game.C_100170_cm.field_105540_b
		// @17: aconst_null
		// @18: putstatic java.lang.String game.C_100170_cm.field_105543_n
		// @1B: aconst_null
		// @1C: putstatic java.lang.String game.C_100170_cm.field_105537_g
		// @1F: aconst_null
		// @20: putstatic java.lang.String game.C_100170_cm.field_105538_d
		// @23: aconst_null
		// @24: putstatic game.C_100037_wb game.C_100170_cm.field_105549_h
		// @27: aconst_null
		// @28: putstatic game.C_100302_ka game.C_100170_cm.field_105545_l
		// @2B: iload_0
		// @2C: ifeq @39
		// @2F: aconst_null
		// @30: checkcast int[][]
		// @33: checkcast int[][]
		// @36: putstatic int[][] game.C_100170_cm.field_105546_m
		// @39: goto @3F
		// @3C: astore_1
		// @3D: aload_1
		// @3E: athrow
		// @3F: return
	}
	
	static final boolean func_105531_a(byte arg0)
	{
		// @00: bipush -52 (0xCC)
		// @02: iload_0
		// @03: bipush 89 (0x59)
		// @05: isub
		// @06: bipush 33 (0x21)
		// @08: idiv
		// @09: idiv
		// @0A: istore_1
		// @0B: aconst_null
		// @0C: getstatic game.C_100118_ub game.C_100038_wa.field_104073_n
		// @0F: if_acmpeq @25
		// @12: getstatic game.C_100118_ub game.C_100038_wa.field_104073_n
		// @15: iconst_2
		// @16: invokevirtual game.C_100118_ub.func_102050_m(int)boolean
		// @19: ifeq @25
		// @1C: goto @20
		// @1F: athrow
		// @20: iconst_1
		// @21: goto @26
		// @24: athrow
		// @25: iconst_0
		// @26: ireturn
		// @27: astore_1
		// @28: aload_1
		// @29: new java.lang.StringBuilder
		// @2C: dup
		// @2D: invokespecial java.lang.StringBuilder.<init>()void
		// @30: getstatic java.lang.String[] game.C_100170_cm.field_105551_z
		// @33: iconst_1
		// @34: aaload
		// @35: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @38: iload_0
		// @39: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3C: bipush 41 (0x29)
		// @3E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @41: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @44: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @47: athrow
	}
	
	static final void func_105534_a(boolean arg0)
	{
		// @00: iload_0
		// @01: ifeq @05
		// @04: return
		// @05: iconst_0
		// @06: getstatic int game.C_100115_ej.field_102037_Ub
		// @09: isub
		// @0A: iconst_m1
		// @0B: ixor
		// @0C: getstatic int game.C_100015_wh.field_103783_e
		// @0F: iconst_m1
		// @10: ixor
		// @11: if_icmpeq @29
		// @14: getstatic int game.C_100015_wh.field_103783_e
		// @17: iconst_m1
		// @18: ixor
		// @19: sipush 250 (0x00FA)
		// @1C: getstatic int game.C_100115_ej.field_102037_Ub
		// @1F: isub
		// @20: iconst_m1
		// @21: ixor
		// @22: if_icmpeq @29
		// @25: goto @29
		// @28: athrow
		// @29: getstatic int game.C_100015_wh.field_103783_e
		// @2C: iconst_1
		// @2D: iadd
		// @2E: putstatic int game.C_100015_wh.field_103783_e
		// @31: goto @55
		// @34: astore_1
		// @35: aload_1
		// @36: new java.lang.StringBuilder
		// @39: dup
		// @3A: invokespecial java.lang.StringBuilder.<init>()void
		// @3D: getstatic java.lang.String[] game.C_100170_cm.field_105551_z
		// @40: iconst_0
		// @41: aaload
		// @42: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @45: iload_0
		// @46: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @49: bipush 41 (0x29)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @51: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @54: athrow
		// @55: return
	}
	
	C_100170_cm(Throwable arg0, String arg1)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.RuntimeException.<init>()void
		// @04: aload_0
		// @05: aload_1
		// @06: putfield java.lang.Throwable game.C_100170_cm.field_105548_k
		// @09: aload_0
		// @0A: aload_2
		// @0B: putfield java.lang.String game.C_100170_cm.field_105542_a
		// @0E: goto @14
		// @11: astore_3
		// @12: aload_3
		// @13: athrow
		// @14: return
	}
	
	static final void func_105535_a(int arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: iconst_0
		// @006: istore_2
		// @007: getstatic int game.C_100015_wh.field_103783_e
		// @00A: istore_3
		// @00B: iconst_5
		// @00C: iload_3
		// @00D: if_icmple @021
		// @010: sipush 8192 (0x2000)
		// @013: iload_3
		// @014: iload_3
		// @015: imul
		// @016: imul
		// @017: sipush 1100 (0x044C)
		// @01A: idiv
		// @01B: istore_2
		// @01C: iload #6
		// @01E: ifeq @064
		// @021: iload_3
		// @022: iconst_m1
		// @023: ixor
		// @024: bipush -106 (0x96)
		// @026: if_icmpgt @057
		// @029: goto @02D
		// @02C: athrow
		// @02D: bipush 120 (0x78)
		// @02F: iload_3
		// @030: if_icmpgt @03B
		// @033: goto @037
		// @036: athrow
		// @037: goto @064
		// @03A: athrow
		// @03B: bipush 120 (0x78)
		// @03D: iload_3
		// @03E: ineg
		// @03F: iadd
		// @040: istore_3
		// @041: iload_3
		// @042: iload_3
		// @043: imul
		// @044: sipush 8192 (0x2000)
		// @047: imul
		// @048: sipush 3300 (0x0CE4)
		// @04B: idiv
		// @04C: ineg
		// @04D: sipush 8192 (0x2000)
		// @050: iadd
		// @051: istore_2
		// @052: iload #6
		// @054: ifeq @064
		// @057: ldc -40960 (0xffff6000)
		// @059: iload_3
		// @05A: sipush 16384 (0x4000)
		// @05D: imul
		// @05E: iadd
		// @05F: sipush 220 (0x00DC)
		// @062: idiv
		// @063: istore_2
		// @064: iconst_1
		// @065: istore #4
		// @067: iconst_0
		// @068: istore #5
		// @06A: bipush -4 (0xFC)
		// @06C: iload_0
		// @06D: iconst_m1
		// @06E: ixor
		// @06F: if_icmpeq @076
		// @072: goto @079
		// @075: athrow
		// @076: iconst_m1
		// @077: istore #4
		// @079: iconst_1
		// @07A: iload_0
		// @07B: if_icmpeq @082
		// @07E: goto @085
		// @081: athrow
		// @082: iconst_1
		// @083: istore #5
		// @085: iload_1
		// @086: sipush 1100 (0x044C)
		// @089: if_icmpeq @08D
		// @08C: return
		// @08D: bipush -5 (0xFB)
		// @08F: iload_0
		// @090: iconst_m1
		// @091: ixor
		// @092: if_icmpne @09B
		// @095: iconst_1
		// @096: istore #4
		// @098: iconst_1
		// @099: istore #5
		// @09B: bipush -6 (0xFA)
		// @09D: iload_0
		// @09E: iconst_m1
		// @09F: ixor
		// @0A0: if_icmpeq @0A7
		// @0A3: goto @0AD
		// @0A6: athrow
		// @0A7: iconst_m1
		// @0A8: istore #4
		// @0AA: iconst_1
		// @0AB: istore #5
		// @0AD: iload_0
		// @0AE: bipush 6 (0x06)
		// @0B0: if_icmpne @0B9
		// @0B3: iconst_1
		// @0B4: istore #4
		// @0B6: iconst_m1
		// @0B7: istore #5
		// @0B9: bipush -8 (0xF8)
		// @0BB: iload_0
		// @0BC: iconst_m1
		// @0BD: ixor
		// @0BE: if_icmpeq @0CD
		// @0C1: iload_0
		// @0C2: iconst_m1
		// @0C3: ixor
		// @0C4: bipush -9 (0xF7)
		// @0C6: if_icmpne @0D3
		// @0C9: goto @0CD
		// @0CC: athrow
		// @0CD: iconst_m1
		// @0CE: istore #4
		// @0D0: iconst_m1
		// @0D1: istore #5
		// @0D3: iload_0
		// @0D4: bipush 11 (0x0B)
		// @0D6: if_icmpne @0DC
		// @0D9: iconst_m1
		// @0DA: istore #4
		// @0DC: iload_0
		// @0DD: iconst_m1
		// @0DE: ixor
		// @0DF: bipush -13 (0xF3)
		// @0E1: if_icmpeq @0E8
		// @0E4: goto @0EE
		// @0E7: athrow
		// @0E8: iconst_m1
		// @0E9: istore #4
		// @0EB: iconst_m1
		// @0EC: istore #5
		// @0EE: iload_0
		// @0EF: iconst_m1
		// @0F0: ixor
		// @0F1: bipush -14 (0xF2)
		// @0F3: if_icmpeq @0FA
		// @0F6: goto @100
		// @0F9: athrow
		// @0FA: iconst_1
		// @0FB: istore #4
		// @0FD: iconst_m1
		// @0FE: istore #5
		// @100: iload_0
		// @101: iconst_m1
		// @102: ixor
		// @103: bipush -15 (0xF1)
		// @105: if_icmpeq @10C
		// @108: goto @112
		// @10B: athrow
		// @10C: iconst_1
		// @10D: istore #5
		// @10F: iconst_m1
		// @110: istore #4
		// @112: iload_0
		// @113: iconst_m1
		// @114: ixor
		// @115: bipush -16 (0xF0)
		// @117: if_icmpeq @11E
		// @11A: goto @124
		// @11D: athrow
		// @11E: iconst_1
		// @11F: istore #4
		// @121: iconst_1
		// @122: istore #5
		// @124: bipush 111 (0x6F)
		// @126: iload_2
		// @127: iload #5
		// @129: imul
		// @12A: iload_2
		// @12B: iload #4
		// @12D: imul
		// @12E: invokestatic game.C_100033_gj.func_101896_b(int, int, int)int[]
		// @131: putstatic int[] game.C_100052_eb.field_104230_e
		// @134: goto @161
		// @137: astore_2
		// @138: aload_2
		// @139: new java.lang.StringBuilder
		// @13C: dup
		// @13D: invokespecial java.lang.StringBuilder.<init>()void
		// @140: getstatic java.lang.String[] game.C_100170_cm.field_105551_z
		// @143: iconst_2
		// @144: aaload
		// @145: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @148: iload_0
		// @149: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @14C: bipush 44 (0x2C)
		// @14E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @151: iload_1
		// @152: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @155: bipush 41 (0x29)
		// @157: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @15A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @15D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @160: athrow
		// @161: return
	}
	
	static
	{
		// @000: iconst_3
		// @001: anewarray java.lang.String
		// @004: dup
		// @005: iconst_0
		// @006: ldc "*`\u0014d\u0005"
		// @008: invokestatic game.C_100170_cm.func_105533_z(java.lang.String)char[]
		// @00B: invokestatic game.C_100170_cm.func_105532_z(char[])java.lang.String
		// @00E: aastore
		// @00F: dup
		// @010: iconst_1
		// @011: ldc "*`\u0014g\u0005"
		// @013: invokestatic game.C_100170_cm.func_105533_z(java.lang.String)char[]
		// @016: invokestatic game.C_100170_cm.func_105532_z(char[])java.lang.String
		// @019: aastore
		// @01A: dup
		// @01B: iconst_2
		// @01C: ldc "*`\u0014f\u0005"
		// @01E: invokestatic game.C_100170_cm.func_105533_z(java.lang.String)char[]
		// @021: invokestatic game.C_100170_cm.func_105532_z(char[])java.lang.String
		// @024: aastore
		// @025: putstatic java.lang.String[] game.C_100170_cm.field_105551_z
		// @028: bipush 30 (0x1E)
		// @02A: anewarray int[]
		// @02D: dup
		// @02E: iconst_0
		// @02F: iconst_2
		// @030: newarray int[]
		// @032: dup
		// @033: iconst_0
		// @034: bipush 53 (0x35)
		// @036: iastore
		// @037: dup
		// @038: iconst_1
		// @039: bipush 29 (0x1D)
		// @03B: iastore
		// @03C: aastore
		// @03D: dup
		// @03E: iconst_1
		// @03F: iconst_2
		// @040: newarray int[]
		// @042: dup
		// @043: iconst_0
		// @044: bipush 56 (0x38)
		// @046: iastore
		// @047: dup
		// @048: iconst_1
		// @049: bipush 24 (0x18)
		// @04B: iastore
		// @04C: aastore
		// @04D: dup
		// @04E: iconst_2
		// @04F: iconst_2
		// @050: newarray int[]
		// @052: dup
		// @053: iconst_0
		// @054: bipush 54 (0x36)
		// @056: iastore
		// @057: dup
		// @058: iconst_1
		// @059: bipush 18 (0x12)
		// @05B: iastore
		// @05C: aastore
		// @05D: dup
		// @05E: iconst_3
		// @05F: iconst_2
		// @060: newarray int[]
		// @062: dup
		// @063: iconst_0
		// @064: bipush 59 (0x3B)
		// @066: iastore
		// @067: dup
		// @068: iconst_1
		// @069: bipush 21 (0x15)
		// @06B: iastore
		// @06C: aastore
		// @06D: dup
		// @06E: iconst_4
		// @06F: iconst_1
		// @070: newarray int[]
		// @072: dup
		// @073: iconst_0
		// @074: bipush 60 (0x3C)
		// @076: iastore
		// @077: aastore
		// @078: dup
		// @079: iconst_5
		// @07A: iconst_1
		// @07B: newarray int[]
		// @07D: dup
		// @07E: iconst_0
		// @07F: bipush 58 (0x3A)
		// @081: iastore
		// @082: aastore
		// @083: dup
		// @084: bipush 6 (0x06)
		// @086: iconst_1
		// @087: newarray int[]
		// @089: dup
		// @08A: iconst_0
		// @08B: bipush 23 (0x17)
		// @08D: iastore
		// @08E: aastore
		// @08F: dup
		// @090: bipush 7 (0x07)
		// @092: iconst_2
		// @093: newarray int[]
		// @095: dup
		// @096: iconst_0
		// @097: iconst_1
		// @098: iastore
		// @099: dup
		// @09A: iconst_1
		// @09B: bipush 30 (0x1E)
		// @09D: iastore
		// @09E: aastore
		// @09F: dup
		// @0A0: bipush 8 (0x08)
		// @0A2: iconst_2
		// @0A3: newarray int[]
		// @0A5: dup
		// @0A6: iconst_0
		// @0A7: iconst_2
		// @0A8: iastore
		// @0A9: dup
		// @0AA: iconst_1
		// @0AB: bipush 37 (0x25)
		// @0AD: iastore
		// @0AE: aastore
		// @0AF: dup
		// @0B0: bipush 9 (0x09)
		// @0B2: iconst_3
		// @0B3: newarray int[]
		// @0B5: dup
		// @0B6: iconst_0
		// @0B7: iconst_3
		// @0B8: iastore
		// @0B9: dup
		// @0BA: iconst_1
		// @0BB: bipush 26 (0x1A)
		// @0BD: iastore
		// @0BE: dup
		// @0BF: iconst_2
		// @0C0: bipush 17 (0x11)
		// @0C2: iastore
		// @0C3: aastore
		// @0C4: dup
		// @0C5: bipush 10 (0x0A)
		// @0C7: iconst_0
		// @0C8: newarray int[]
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 11 (0x0B)
		// @0CE: iconst_1
		// @0CF: newarray int[]
		// @0D1: dup
		// @0D2: iconst_0
		// @0D3: bipush 61 (0x3D)
		// @0D5: iastore
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 12 (0x0C)
		// @0DA: iconst_1
		// @0DB: newarray int[]
		// @0DD: dup
		// @0DE: iconst_0
		// @0DF: bipush 31 (0x1F)
		// @0E1: iastore
		// @0E2: aastore
		// @0E3: dup
		// @0E4: bipush 13 (0x0D)
		// @0E6: iconst_1
		// @0E7: newarray int[]
		// @0E9: dup
		// @0EA: iconst_0
		// @0EB: bipush 20 (0x14)
		// @0ED: iastore
		// @0EE: aastore
		// @0EF: dup
		// @0F0: bipush 14 (0x0E)
		// @0F2: iconst_1
		// @0F3: newarray int[]
		// @0F5: dup
		// @0F6: iconst_0
		// @0F7: bipush 64 (0x40)
		// @0F9: iastore
		// @0FA: aastore
		// @0FB: dup
		// @0FC: bipush 15 (0x0F)
		// @0FE: iconst_2
		// @0FF: newarray int[]
		// @101: dup
		// @102: iconst_0
		// @103: bipush 66 (0x42)
		// @105: iastore
		// @106: dup
		// @107: iconst_1
		// @108: bipush 32 (0x20)
		// @10A: iastore
		// @10B: aastore
		// @10C: dup
		// @10D: bipush 16 (0x10)
		// @10F: iconst_3
		// @110: newarray int[]
		// @112: dup
		// @113: iconst_0
		// @114: bipush 67 (0x43)
		// @116: iastore
		// @117: dup
		// @118: iconst_1
		// @119: bipush 22 (0x16)
		// @11B: iastore
		// @11C: dup
		// @11D: iconst_2
		// @11E: bipush 25 (0x19)
		// @120: iastore
		// @121: aastore
		// @122: dup
		// @123: bipush 17 (0x11)
		// @125: iconst_2
		// @126: newarray int[]
		// @128: dup
		// @129: iconst_0
		// @12A: bipush 68 (0x44)
		// @12C: iastore
		// @12D: dup
		// @12E: iconst_1
		// @12F: bipush 19 (0x13)
		// @131: iastore
		// @132: aastore
		// @133: dup
		// @134: bipush 18 (0x12)
		// @136: iconst_1
		// @137: newarray int[]
		// @139: dup
		// @13A: iconst_0
		// @13B: bipush 70 (0x46)
		// @13D: iastore
		// @13E: aastore
		// @13F: dup
		// @140: bipush 19 (0x13)
		// @142: iconst_2
		// @143: newarray int[]
		// @145: dup
		// @146: iconst_0
		// @147: bipush 71 (0x47)
		// @149: iastore
		// @14A: dup
		// @14B: iconst_1
		// @14C: bipush 33 (0x21)
		// @14E: iastore
		// @14F: aastore
		// @150: dup
		// @151: bipush 20 (0x14)
		// @153: iconst_0
		// @154: newarray int[]
		// @156: aastore
		// @157: dup
		// @158: bipush 21 (0x15)
		// @15A: iconst_1
		// @15B: newarray int[]
		// @15D: dup
		// @15E: iconst_0
		// @15F: bipush 73 (0x49)
		// @161: iastore
		// @162: aastore
		// @163: dup
		// @164: bipush 22 (0x16)
		// @166: iconst_1
		// @167: newarray int[]
		// @169: dup
		// @16A: iconst_0
		// @16B: bipush 74 (0x4A)
		// @16D: iastore
		// @16E: aastore
		// @16F: dup
		// @170: bipush 23 (0x17)
		// @172: iconst_1
		// @173: newarray int[]
		// @175: dup
		// @176: iconst_0
		// @177: bipush 34 (0x22)
		// @179: iastore
		// @17A: aastore
		// @17B: dup
		// @17C: bipush 24 (0x18)
		// @17E: iconst_2
		// @17F: newarray int[]
		// @181: dup
		// @182: iconst_0
		// @183: bipush 78 (0x4E)
		// @185: iastore
		// @186: dup
		// @187: iconst_1
		// @188: bipush 27 (0x1B)
		// @18A: iastore
		// @18B: aastore
		// @18C: dup
		// @18D: bipush 25 (0x19)
		// @18F: iconst_2
		// @190: newarray int[]
		// @192: dup
		// @193: iconst_0
		// @194: bipush 77 (0x4D)
		// @196: iastore
		// @197: dup
		// @198: iconst_1
		// @199: bipush 83 (0x53)
		// @19B: iastore
		// @19C: aastore
		// @19D: dup
		// @19E: bipush 26 (0x1A)
		// @1A0: iconst_2
		// @1A1: newarray int[]
		// @1A3: dup
		// @1A4: iconst_0
		// @1A5: bipush 76 (0x4C)
		// @1A7: iastore
		// @1A8: dup
		// @1A9: iconst_1
		// @1AA: bipush 28 (0x1C)
		// @1AC: iastore
		// @1AD: aastore
		// @1AE: dup
		// @1AF: bipush 27 (0x1B)
		// @1B1: iconst_1
		// @1B2: newarray int[]
		// @1B4: dup
		// @1B5: iconst_0
		// @1B6: bipush 81 (0x51)
		// @1B8: iastore
		// @1B9: aastore
		// @1BA: dup
		// @1BB: bipush 28 (0x1C)
		// @1BD: iconst_2
		// @1BE: newarray int[]
		// @1C0: dup
		// @1C1: iconst_0
		// @1C2: bipush 82 (0x52)
		// @1C4: iastore
		// @1C5: dup
		// @1C6: iconst_1
		// @1C7: bipush 36 (0x24)
		// @1C9: iastore
		// @1CA: aastore
		// @1CB: dup
		// @1CC: bipush 29 (0x1D)
		// @1CE: iconst_0
		// @1CF: newarray int[]
		// @1D1: aastore
		// @1D2: putstatic int[][] game.C_100170_cm.field_105546_m
		// @1D5: ldc "\u000bxCLC.-UW\r:hVID'j\u001aDCilYFB<cN"
		// @1D7: invokestatic game.C_100170_cm.func_105533_z(java.lang.String)char[]
		// @1DA: invokestatic game.C_100170_cm.func_105532_z(char[])java.lang.String
		// @1DD: putstatic java.lang.String game.C_100170_cm.field_105538_d
		// @1E0: bipush 37 (0x25)
		// @1E2: newarray char[]
		// @1E4: dup
		// @1E5: iconst_0
		// @1E6: bipush 95 (0x5F)
		// @1E8: castore
		// @1E9: dup
		// @1EA: iconst_1
		// @1EB: bipush 97 (0x61)
		// @1ED: castore
		// @1EE: dup
		// @1EF: iconst_2
		// @1F0: bipush 98 (0x62)
		// @1F2: castore
		// @1F3: dup
		// @1F4: iconst_3
		// @1F5: bipush 99 (0x63)
		// @1F7: castore
		// @1F8: dup
		// @1F9: iconst_4
		// @1FA: bipush 100 (0x64)
		// @1FC: castore
		// @1FD: dup
		// @1FE: iconst_5
		// @1FF: bipush 101 (0x65)
		// @201: castore
		// @202: dup
		// @203: bipush 6 (0x06)
		// @205: bipush 102 (0x66)
		// @207: castore
		// @208: dup
		// @209: bipush 7 (0x07)
		// @20B: bipush 103 (0x67)
		// @20D: castore
		// @20E: dup
		// @20F: bipush 8 (0x08)
		// @211: bipush 104 (0x68)
		// @213: castore
		// @214: dup
		// @215: bipush 9 (0x09)
		// @217: bipush 105 (0x69)
		// @219: castore
		// @21A: dup
		// @21B: bipush 10 (0x0A)
		// @21D: bipush 106 (0x6A)
		// @21F: castore
		// @220: dup
		// @221: bipush 11 (0x0B)
		// @223: bipush 107 (0x6B)
		// @225: castore
		// @226: dup
		// @227: bipush 12 (0x0C)
		// @229: bipush 108 (0x6C)
		// @22B: castore
		// @22C: dup
		// @22D: bipush 13 (0x0D)
		// @22F: bipush 109 (0x6D)
		// @231: castore
		// @232: dup
		// @233: bipush 14 (0x0E)
		// @235: bipush 110 (0x6E)
		// @237: castore
		// @238: dup
		// @239: bipush 15 (0x0F)
		// @23B: bipush 111 (0x6F)
		// @23D: castore
		// @23E: dup
		// @23F: bipush 16 (0x10)
		// @241: bipush 112 (0x70)
		// @243: castore
		// @244: dup
		// @245: bipush 17 (0x11)
		// @247: bipush 113 (0x71)
		// @249: castore
		// @24A: dup
		// @24B: bipush 18 (0x12)
		// @24D: bipush 114 (0x72)
		// @24F: castore
		// @250: dup
		// @251: bipush 19 (0x13)
		// @253: bipush 115 (0x73)
		// @255: castore
		// @256: dup
		// @257: bipush 20 (0x14)
		// @259: bipush 116 (0x74)
		// @25B: castore
		// @25C: dup
		// @25D: bipush 21 (0x15)
		// @25F: bipush 117 (0x75)
		// @261: castore
		// @262: dup
		// @263: bipush 22 (0x16)
		// @265: bipush 118 (0x76)
		// @267: castore
		// @268: dup
		// @269: bipush 23 (0x17)
		// @26B: bipush 119 (0x77)
		// @26D: castore
		// @26E: dup
		// @26F: bipush 24 (0x18)
		// @271: bipush 120 (0x78)
		// @273: castore
		// @274: dup
		// @275: bipush 25 (0x19)
		// @277: bipush 121 (0x79)
		// @279: castore
		// @27A: dup
		// @27B: bipush 26 (0x1A)
		// @27D: bipush 122 (0x7A)
		// @27F: castore
		// @280: dup
		// @281: bipush 27 (0x1B)
		// @283: bipush 48 (0x30)
		// @285: castore
		// @286: dup
		// @287: bipush 28 (0x1C)
		// @289: bipush 49 (0x31)
		// @28B: castore
		// @28C: dup
		// @28D: bipush 29 (0x1D)
		// @28F: bipush 50 (0x32)
		// @291: castore
		// @292: dup
		// @293: bipush 30 (0x1E)
		// @295: bipush 51 (0x33)
		// @297: castore
		// @298: dup
		// @299: bipush 31 (0x1F)
		// @29B: bipush 52 (0x34)
		// @29D: castore
		// @29E: dup
		// @29F: bipush 32 (0x20)
		// @2A1: bipush 53 (0x35)
		// @2A3: castore
		// @2A4: dup
		// @2A5: bipush 33 (0x21)
		// @2A7: bipush 54 (0x36)
		// @2A9: castore
		// @2AA: dup
		// @2AB: bipush 34 (0x22)
		// @2AD: bipush 55 (0x37)
		// @2AF: castore
		// @2B0: dup
		// @2B1: bipush 35 (0x23)
		// @2B3: bipush 56 (0x38)
		// @2B5: castore
		// @2B6: dup
		// @2B7: bipush 36 (0x24)
		// @2B9: bipush 57 (0x39)
		// @2BB: castore
		// @2BC: putstatic char[] game.C_100170_cm.field_105540_b
		// @2BF: bipush 9 (0x09)
		// @2C1: putstatic int game.C_100170_cm.field_105547_j
		// @2C4: ldc "\u001elSQD'j\u001aCB;-_]Y;l\u001aAL=l"
		// @2C6: invokestatic game.C_100170_cm.func_105533_z(java.lang.String)char[]
		// @2C9: invokestatic game.C_100170_cm.func_105532_z(char[])java.lang.String
		// @2CC: putstatic java.lang.String game.C_100170_cm.field_105550_i
		// @2CF: ldc "\u0000jTJ_,"
		// @2D1: invokestatic game.C_100170_cm.func_105533_z(java.lang.String)char[]
		// @2D4: invokestatic game.C_100170_cm.func_105532_z(char[])java.lang.String
		// @2D7: putstatic java.lang.String game.C_100170_cm.field_105537_g
		// @2DA: ldc "\u0010bO\u0005E({_\u0005O,hT\u0005_,`USH--\\WB$-\u0006\u0000\u001dw*I\u0005J(`_\u000b"
		// @2DC: invokestatic game.C_100170_cm.func_105533_z(java.lang.String)char[]
		// @2DF: invokestatic game.C_100170_cm.func_105532_z(char[])java.lang.String
		// @2E2: putstatic java.lang.String game.C_100170_cm.field_105543_n
		// @2E5: return
	}
	
	private static char[] func_105533_z(String arg0)
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
		// @0E: bipush 45 (0x2D)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105532_z(char[] arg0)
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
		// @30: bipush 73 (0x49)
		// @32: goto @46
		// @35: bipush 13 (0x0D)
		// @37: goto @46
		// @3A: bipush 58 (0x3A)
		// @3C: goto @46
		// @3F: bipush 37 (0x25)
		// @41: goto @46
		// @44: bipush 45 (0x2D)
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
