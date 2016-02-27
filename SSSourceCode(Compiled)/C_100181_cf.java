package game;

final class C_100181_cf
{
	static String field_105710_h;
	static int[][] field_105706_c;
	static String field_105707_a;
	static String field_105708_j;
	static int field_105705_b;
	static String field_105702_g;
	static String[] field_105703_d;
	static int field_105704_e;
	static String field_105711_i;
	static String field_105701_f;
	private static final String[] field_105709_z;
	
	static final C_100170_cm func_105695_a(Throwable arg0, String arg1)
	{
		// @00: aload_0
		// @01: instanceof game.C_100170_cm
		// @04: ifeq @2D
		// @07: aload_0
		// @08: checkcast game.C_100170_cm
		// @0B: astore_2
		// @0C: new java.lang.StringBuilder
		// @0F: dup
		// @10: invokespecial java.lang.StringBuilder.<init>()void
		// @13: aload_2
		// @14: dup_x1
		// @15: getfield java.lang.String game.C_100170_cm.field_105542_a
		// @18: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1B: bipush 32 (0x20)
		// @1D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @20: aload_1
		// @21: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @24: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @27: putfield java.lang.String game.C_100170_cm.field_105542_a
		// @2A: goto @37
		// @2D: new game.C_100170_cm
		// @30: dup
		// @31: aload_0
		// @32: aload_1
		// @33: invokespecial game.C_100170_cm.<init>(java.lang.Throwable, java.lang.String)void
		// @36: astore_2
		// @37: aload_2
		// @38: areturn
		// @39: astore_2
		// @3A: aload_2
		// @3B: athrow
	}
	
	public static void func_105698_a(boolean arg0)
	{
		// @00: iload_0
		// @01: ifeq @05
		// @04: return
		// @05: aconst_null
		// @06: putstatic java.lang.String game.C_100181_cf.field_105710_h
		// @09: aconst_null
		// @0A: putstatic java.lang.String game.C_100181_cf.field_105707_a
		// @0D: aconst_null
		// @0E: putstatic java.lang.String game.C_100181_cf.field_105708_j
		// @11: aconst_null
		// @12: putstatic java.lang.String game.C_100181_cf.field_105711_i
		// @15: aconst_null
		// @16: putstatic java.lang.String[] game.C_100181_cf.field_105703_d
		// @19: aconst_null
		// @1A: checkcast int[][]
		// @1D: putstatic int[][] game.C_100181_cf.field_105706_c
		// @20: aconst_null
		// @21: putstatic java.lang.String game.C_100181_cf.field_105702_g
		// @24: aconst_null
		// @25: putstatic java.lang.String game.C_100181_cf.field_105701_f
		// @28: goto @4C
		// @2B: astore_1
		// @2C: aload_1
		// @2D: new java.lang.StringBuilder
		// @30: dup
		// @31: invokespecial java.lang.StringBuilder.<init>()void
		// @34: getstatic java.lang.String[] game.C_100181_cf.field_105709_z
		// @37: iconst_1
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: iload_0
		// @3D: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @40: bipush 41 (0x29)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @48: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4B: athrow
		// @4C: return
	}
	
	static final boolean func_105700_a(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: aconst_null
		// @01: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @04: if_acmpeq @1D
		// @07: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @0A: bipush -118 (0x8A)
		// @0C: invokevirtual game.C_100022_hf.func_103890_a(int)boolean
		// @0F: ifeq @1D
		// @12: goto @16
		// @15: athrow
		// @16: bipush 46 (0x2E)
		// @18: invokestatic game.C_100290_jm.func_106853_a(byte)void
		// @1B: iconst_1
		// @1C: ireturn
		// @1D: iload_0
		// @1E: bipush 9 (0x09)
		// @20: if_icmpeq @33
		// @23: bipush 113 (0x71)
		// @25: bipush -90 (0xA6)
		// @27: bipush 55 (0x37)
		// @29: bipush -94 (0xA2)
		// @2B: invokestatic game.C_100181_cf.func_105700_a(int, int, int, int)boolean
		// @2E: pop
		// @2F: goto @33
		// @32: athrow
		// @33: aconst_null
		// @34: getstatic game.C_100260_mc game.C_100228_nn.field_106189_c
		// @37: if_acmpeq @57
		// @3A: getstatic game.C_100260_mc game.C_100228_nn.field_106189_c
		// @3D: iconst_1
		// @3E: invokevirtual game.C_100260_mc.func_102221_b(boolean)boolean
		// @41: ifne @4C
		// @44: goto @48
		// @47: athrow
		// @48: goto @57
		// @4B: athrow
		// @4C: aconst_null
		// @4D: putstatic game.C_100260_mc game.C_100228_nn.field_106189_c
		// @50: bipush 46 (0x2E)
		// @52: invokestatic game.C_100290_jm.func_106853_a(byte)void
		// @55: iconst_1
		// @56: ireturn
		// @57: bipush -117 (0x8B)
		// @59: invokestatic game.C_100170_cm.func_105531_a(byte)boolean
		// @5C: ifeq @61
		// @5F: iconst_1
		// @60: ireturn
		// @61: iload_1
		// @62: iload_3
		// @63: bipush 110 (0x6E)
		// @65: iload_2
		// @66: invokestatic game.C_100051_ea.func_103301_a(int, int, byte, int)boolean
		// @69: ifeq @6E
		// @6C: iconst_1
		// @6D: ireturn
		// @6E: iconst_0
		// @6F: ireturn
		// @70: astore #4
		// @72: aload #4
		// @74: new java.lang.StringBuilder
		// @77: dup
		// @78: invokespecial java.lang.StringBuilder.<init>()void
		// @7B: getstatic java.lang.String[] game.C_100181_cf.field_105709_z
		// @7E: iconst_2
		// @7F: aaload
		// @80: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @83: iload_0
		// @84: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @87: bipush 44 (0x2C)
		// @89: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8C: iload_1
		// @8D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @90: bipush 44 (0x2C)
		// @92: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @95: iload_2
		// @96: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @99: bipush 44 (0x2C)
		// @9B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9E: iload_3
		// @9F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A2: bipush 41 (0x29)
		// @A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @AA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AD: athrow
	}
	
	static final void func_105699_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #28
		// @005: iload_2
		// @006: ldc -2123300220 (0x81710284)
		// @008: ishl
		// @009: iload #4
		// @00B: isub
		// @00C: istore #15
		// @00E: iload_3
		// @00F: istore #16
		// @011: iload #9
		// @013: istore #17
		// @015: iload_1
		// @016: istore #18
		// @018: iload #13
		// @01A: istore #19
		// @01C: iload #6
		// @01E: iload #19
		// @020: if_icmple @135
		// @023: iload #14
		// @025: iload #17
		// @027: iload #28
		// @029: ifne @143
		// @02C: if_icmple @135
		// @02F: goto @033
		// @032: athrow
		// @033: iload #11
		// @035: ineg
		// @036: iload #19
		// @038: ldc 66164708 (0x3f197e4)
		// @03A: ishl
		// @03B: iadd
		// @03C: istore #20
		// @03E: iload #17
		// @040: iload #8
		// @042: ishl
		// @043: iload #5
		// @045: idiv
		// @046: istore #21
		// @048: iload #7
		// @04A: getstatic int[] game.C_100100_i.field_102020_Ub
		// @04D: iload #21
		// @04F: iaload
		// @050: imul
		// @051: ldc 1740889231 (0x67c3dc8f)
		// @053: ishr
		// @054: istore #22
		// @056: iload #19
		// @058: iload #20
		// @05A: iload #22
		// @05C: imul
		// @05D: ldc 131072 (0x20000)
		// @05F: iadd
		// @060: ldc 1482869554 (0x5862cb32)
		// @062: ishr
		// @063: ineg
		// @064: isub
		// @065: istore #23
		// @067: sipush 639 (0x027F)
		// @06A: iload #23
		// @06C: if_icmplt @073
		// @06F: goto @078
		// @072: athrow
		// @073: sipush 639 (0x027F)
		// @076: istore #23
		// @078: iload #15
		// @07A: iload #22
		// @07C: imul
		// @07D: ldc 131072 (0x20000)
		// @07F: iadd
		// @080: ldc 369606930 (0x1607c112)
		// @082: ishr
		// @083: iload_2
		// @084: iadd
		// @085: istore #24
		// @087: iload #24
		// @089: iconst_m1
		// @08A: ixor
		// @08B: sipush -480 (0xFE20)
		// @08E: if_icmpge @096
		// @091: sipush 479 (0x01DF)
		// @094: istore #24
		// @096: getstatic int[] game.C_100196_rb.field_105818_d
		// @099: iload #24
		// @09B: sipush 640 (0x0280)
		// @09E: imul
		// @09F: iload #23
		// @0A1: ineg
		// @0A2: isub
		// @0A3: iaload
		// @0A4: istore #25
		// @0A6: bipush 64 (0x40)
		// @0A8: getstatic int[] game.C_100100_i.field_102018_Wb
		// @0AB: iload #21
		// @0AD: iaload
		// @0AE: iload #7
		// @0B0: imul
		// @0B1: ldc -1913414415 (0x8df39cf1)
		// @0B3: ishr
		// @0B4: iadd
		// @0B5: istore #26
		// @0B7: iload #26
		// @0B9: iconst_m1
		// @0BA: ixor
		// @0BB: iconst_m1
		// @0BC: if_icmpgt @0C3
		// @0BF: goto @0CB
		// @0C2: athrow
		// @0C3: new java.lang.Error
		// @0C6: dup
		// @0C7: invokespecial java.lang.Error.<init>()void
		// @0CA: athrow
		// @0CB: iload #26
		// @0CD: iload #25
		// @0CF: ldc 16711935 (0xff00ff)
		// @0D1: iand
		// @0D2: imul
		// @0D3: istore #27
		// @0D5: ldc 65280 (0xff00)
		// @0D7: iload #25
		// @0D9: iand
		// @0DA: iload #26
		// @0DC: imul
		// @0DD: istore #26
		// @0DF: ldc 4177920 (0x3fc000)
		// @0E1: iload #26
		// @0E3: iand
		// @0E4: ldc 1069563840 (0x3fc03fc0)
		// @0E6: iload #27
		// @0E8: iand
		// @0E9: iadd
		// @0EA: istore #25
		// @0EC: iload #26
		// @0EE: ldc 12582912 (0xc00000)
		// @0F0: iand
		// @0F1: ldc -1073692672 (0xc000c000)
		// @0F3: iload #27
		// @0F5: iand
		// @0F6: iadd
		// @0F7: istore #27
		// @0F9: ldc 1077952512 (0x40404000)
		// @0FB: iload #27
		// @0FD: iload #27
		// @0FF: ldc -1728883775 (0x98f353c1)
		// @101: iushr
		// @102: ior
		// @103: iand
		// @104: istore #27
		// @106: getstatic int[] game.C_100196_rb.field_105818_d
		// @109: iload #16
		// @10B: iinc #16 +1
		// @10E: iload #25
		// @110: iload #27
		// @112: ldc -63811864 (0xfc324ee8)
		// @114: iushr
		// @115: ineg
		// @116: iload #27
		// @118: iadd
		// @119: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @11C: ldc -1709989434 (0x9a13a1c6)
		// @11E: iushr
		// @11F: iastore
		// @120: iload #17
		// @122: iload #18
		// @124: iadd
		// @125: istore #17
		// @127: iload #18
		// @129: iload_0
		// @12A: iadd
		// @12B: istore #18
		// @12D: iinc #19 +1
		// @130: iload #28
		// @132: ifeq @01C
		// @135: iload #9
		// @137: istore #17
		// @139: iload_3
		// @13A: istore #16
		// @13C: iload_1
		// @13D: istore #18
		// @13F: iload #10
		// @141: bipush 109 (0x6D)
		// @143: if_icmpgt @151
		// @146: aconst_null
		// @147: checkcast java.lang.String
		// @14A: putstatic java.lang.String game.C_100181_cf.field_105707_a
		// @14D: goto @151
		// @150: athrow
		// @151: iload #13
		// @153: iconst_m1
		// @154: iadd
		// @155: istore #19
		// @157: iload #19
		// @159: iload #12
		// @15B: if_icmplt @263
		// @15E: iload #18
		// @160: iload_0
		// @161: isub
		// @162: istore #18
		// @164: iload #17
		// @166: iload #18
		// @168: isub
		// @169: istore #17
		// @16B: iload #28
		// @16D: ifne @312
		// @170: iload #14
		// @172: iconst_m1
		// @173: ixor
		// @174: iload #17
		// @176: iconst_m1
		// @177: ixor
		// @178: if_icmpge @263
		// @17B: goto @17F
		// @17E: athrow
		// @17F: iload #19
		// @181: ldc 490800612 (0x1d4105e4)
		// @183: ishl
		// @184: iload #11
		// @186: isub
		// @187: istore #20
		// @189: iload #17
		// @18B: iload #8
		// @18D: ishl
		// @18E: iload #5
		// @190: idiv
		// @191: istore #21
		// @193: getstatic int[] game.C_100100_i.field_102020_Ub
		// @196: iload #21
		// @198: iaload
		// @199: iload #7
		// @19B: imul
		// @19C: ldc 1345118799 (0x502ce24f)
		// @19E: ishr
		// @19F: istore #22
		// @1A1: ldc 131072 (0x20000)
		// @1A3: iload #20
		// @1A5: iload #22
		// @1A7: imul
		// @1A8: iadd
		// @1A9: ldc 633620466 (0x25c447f2)
		// @1AB: ishr
		// @1AC: iload #19
		// @1AE: iadd
		// @1AF: istore #23
		// @1B1: iload #23
		// @1B3: ifge @1B9
		// @1B6: iconst_0
		// @1B7: istore #23
		// @1B9: iload #22
		// @1BB: iload #15
		// @1BD: imul
		// @1BE: ldc -131072 (0xfffe0000)
		// @1C0: isub
		// @1C1: ldc -1432759598 (0xaa99d2d2)
		// @1C3: ishr
		// @1C4: iload_2
		// @1C5: iadd
		// @1C6: istore #24
		// @1C8: iload #24
		// @1CA: iconst_m1
		// @1CB: ixor
		// @1CC: sipush -480 (0xFE20)
		// @1CF: if_icmplt @1D6
		// @1D2: goto @1DB
		// @1D5: athrow
		// @1D6: sipush 479 (0x01DF)
		// @1D9: istore #24
		// @1DB: getstatic int[] game.C_100196_rb.field_105818_d
		// @1DE: iload #23
		// @1E0: iload #24
		// @1E2: sipush 640 (0x0280)
		// @1E5: imul
		// @1E6: iadd
		// @1E7: iaload
		// @1E8: istore #25
		// @1EA: bipush 64 (0x40)
		// @1EC: getstatic int[] game.C_100100_i.field_102018_Wb
		// @1EF: iload #21
		// @1F1: iaload
		// @1F2: iload #7
		// @1F4: imul
		// @1F5: ldc -2065606191 (0x84e159d1)
		// @1F7: ishr
		// @1F8: iadd
		// @1F9: istore #26
		// @1FB: iconst_0
		// @1FC: iload #26
		// @1FE: if_icmple @206
		// @201: iload #26
		// @203: ineg
		// @204: istore #26
		// @206: iload #26
		// @208: ldc 16711935 (0xff00ff)
		// @20A: iload #25
		// @20C: iand
		// @20D: imul
		// @20E: istore #27
		// @210: ldc 65280 (0xff00)
		// @212: iload #25
		// @214: iand
		// @215: iload #26
		// @217: imul
		// @218: istore #26
		// @21A: iload #26
		// @21C: ldc 4177920 (0x3fc000)
		// @21E: iand
		// @21F: ldc 1069563840 (0x3fc03fc0)
		// @221: iload #27
		// @223: iand
		// @224: iadd
		// @225: istore #25
		// @227: iload #26
		// @229: ldc 12582912 (0xc00000)
		// @22B: iand
		// @22C: iload #27
		// @22E: ldc -1073692672 (0xc000c000)
		// @230: iand
		// @231: iadd
		// @232: istore #27
		// @234: iload #27
		// @236: ldc -1225877599 (0xb6ee97a1)
		// @238: iushr
		// @239: iload #27
		// @23B: ior
		// @23C: ldc 1077952512 (0x40404000)
		// @23E: iand
		// @23F: istore #27
		// @241: getstatic int[] game.C_100196_rb.field_105818_d
		// @244: iinc #16 +255
		// @247: iload #16
		// @249: iload #27
		// @24B: ldc -1872718584 (0x90609508)
		// @24D: iushr
		// @24E: ineg
		// @24F: iload #27
		// @251: iadd
		// @252: iload #25
		// @254: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @257: ldc 1538232486 (0x5baf90a6)
		// @259: iushr
		// @25A: iastore
		// @25B: iinc #19 +255
		// @25E: iload #28
		// @260: ifeq @157
		// @263: goto @312
		// @266: astore #15
		// @268: aload #15
		// @26A: new java.lang.StringBuilder
		// @26D: dup
		// @26E: invokespecial java.lang.StringBuilder.<init>()void
		// @271: getstatic java.lang.String[] game.C_100181_cf.field_105709_z
		// @274: iconst_0
		// @275: aaload
		// @276: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @279: iload_0
		// @27A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @27D: bipush 44 (0x2C)
		// @27F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @282: iload_1
		// @283: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @286: bipush 44 (0x2C)
		// @288: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @28B: iload_2
		// @28C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @28F: bipush 44 (0x2C)
		// @291: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @294: iload_3
		// @295: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @298: bipush 44 (0x2C)
		// @29A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @29D: iload #4
		// @29F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2A2: bipush 44 (0x2C)
		// @2A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2A7: iload #5
		// @2A9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2AC: bipush 44 (0x2C)
		// @2AE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2B1: iload #6
		// @2B3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2B6: bipush 44 (0x2C)
		// @2B8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2BB: iload #7
		// @2BD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2C0: bipush 44 (0x2C)
		// @2C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C5: iload #8
		// @2C7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2CA: bipush 44 (0x2C)
		// @2CC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2CF: iload #9
		// @2D1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2D4: bipush 44 (0x2C)
		// @2D6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2D9: iload #10
		// @2DB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2DE: bipush 44 (0x2C)
		// @2E0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E3: iload #11
		// @2E5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2E8: bipush 44 (0x2C)
		// @2EA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2ED: iload #12
		// @2EF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F2: bipush 44 (0x2C)
		// @2F4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2F7: iload #13
		// @2F9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2FC: bipush 44 (0x2C)
		// @2FE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @301: iload #14
		// @303: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @306: bipush 41 (0x29)
		// @308: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @30B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @30E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @311: athrow
		// @312: return
	}
	
	static
	{
		// @000: iconst_3
		// @001: anewarray java.lang.String
		// @004: dup
		// @005: iconst_0
		// @006: ldc "2Nr,%"
		// @008: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @00B: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @00E: aastore
		// @00F: dup
		// @010: iconst_1
		// @011: ldc "2Nr/%"
		// @013: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @016: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @019: aastore
		// @01A: dup
		// @01B: iconst_2
		// @01C: ldc "2Nr*%"
		// @01E: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @021: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @024: aastore
		// @025: putstatic java.lang.String[] game.C_100181_cf.field_105709_z
		// @028: bipush 42 (0x2A)
		// @02A: anewarray int[]
		// @02D: dup
		// @02E: iconst_0
		// @02F: iconst_3
		// @030: newarray int[]
		// @032: dup
		// @033: iconst_0
		// @034: iconst_0
		// @035: iastore
		// @036: dup
		// @037: iconst_1
		// @038: iconst_0
		// @039: iastore
		// @03A: dup
		// @03B: iconst_2
		// @03C: iconst_0
		// @03D: iastore
		// @03E: aastore
		// @03F: dup
		// @040: iconst_1
		// @041: iconst_4
		// @042: newarray int[]
		// @044: dup
		// @045: iconst_0
		// @046: iconst_1
		// @047: iastore
		// @048: dup
		// @049: iconst_1
		// @04A: iconst_0
		// @04B: iastore
		// @04C: dup
		// @04D: iconst_2
		// @04E: iconst_0
		// @04F: iastore
		// @050: dup
		// @051: iconst_3
		// @052: iconst_1
		// @053: iastore
		// @054: aastore
		// @055: dup
		// @056: iconst_2
		// @057: iconst_4
		// @058: newarray int[]
		// @05A: dup
		// @05B: iconst_0
		// @05C: bipush 8 (0x08)
		// @05E: iastore
		// @05F: dup
		// @060: iconst_1
		// @061: iconst_0
		// @062: iastore
		// @063: dup
		// @064: iconst_2
		// @065: iconst_0
		// @066: iastore
		// @067: dup
		// @068: iconst_3
		// @069: iconst_1
		// @06A: iastore
		// @06B: aastore
		// @06C: dup
		// @06D: iconst_3
		// @06E: iconst_3
		// @06F: newarray int[]
		// @071: dup
		// @072: iconst_0
		// @073: iconst_1
		// @074: iastore
		// @075: dup
		// @076: iconst_1
		// @077: bipush 9 (0x09)
		// @079: iastore
		// @07A: dup
		// @07B: iconst_2
		// @07C: iconst_1
		// @07D: iastore
		// @07E: aastore
		// @07F: dup
		// @080: iconst_4
		// @081: iconst_4
		// @082: newarray int[]
		// @084: dup
		// @085: iconst_0
		// @086: iconst_1
		// @087: iastore
		// @088: dup
		// @089: iconst_1
		// @08A: iconst_0
		// @08B: iastore
		// @08C: dup
		// @08D: iconst_2
		// @08E: iconst_0
		// @08F: iastore
		// @090: dup
		// @091: iconst_3
		// @092: bipush 8 (0x08)
		// @094: iastore
		// @095: aastore
		// @096: dup
		// @097: iconst_5
		// @098: iconst_3
		// @099: newarray int[]
		// @09B: dup
		// @09C: iconst_0
		// @09D: bipush 9 (0x09)
		// @09F: iastore
		// @0A0: dup
		// @0A1: iconst_1
		// @0A2: bipush 7 (0x07)
		// @0A4: iastore
		// @0A5: dup
		// @0A6: iconst_2
		// @0A7: bipush 9 (0x09)
		// @0A9: iastore
		// @0AA: aastore
		// @0AB: dup
		// @0AC: bipush 6 (0x06)
		// @0AE: iconst_3
		// @0AF: newarray int[]
		// @0B1: dup
		// @0B2: iconst_0
		// @0B3: bipush 7 (0x07)
		// @0B5: iastore
		// @0B6: dup
		// @0B7: iconst_1
		// @0B8: iconst_0
		// @0B9: iastore
		// @0BA: dup
		// @0BB: iconst_2
		// @0BC: bipush 7 (0x07)
		// @0BE: iastore
		// @0BF: aastore
		// @0C0: dup
		// @0C1: bipush 7 (0x07)
		// @0C3: iconst_5
		// @0C4: newarray int[]
		// @0C6: dup
		// @0C7: iconst_0
		// @0C8: iconst_3
		// @0C9: iastore
		// @0CA: dup
		// @0CB: iconst_1
		// @0CC: iconst_0
		// @0CD: iastore
		// @0CE: dup
		// @0CF: iconst_2
		// @0D0: bipush 7 (0x07)
		// @0D2: iastore
		// @0D3: dup
		// @0D4: iconst_3
		// @0D5: iconst_0
		// @0D6: iastore
		// @0D7: dup
		// @0D8: iconst_4
		// @0D9: iconst_3
		// @0DA: iastore
		// @0DB: aastore
		// @0DC: dup
		// @0DD: bipush 8 (0x08)
		// @0DF: iconst_5
		// @0E0: newarray int[]
		// @0E2: dup
		// @0E3: iconst_0
		// @0E4: bipush 20 (0x14)
		// @0E6: iastore
		// @0E7: dup
		// @0E8: iconst_1
		// @0E9: bipush 8 (0x08)
		// @0EB: iastore
		// @0EC: dup
		// @0ED: iconst_2
		// @0EE: iconst_1
		// @0EF: iastore
		// @0F0: dup
		// @0F1: iconst_3
		// @0F2: bipush 8 (0x08)
		// @0F4: iastore
		// @0F5: dup
		// @0F6: iconst_4
		// @0F7: bipush 20 (0x14)
		// @0F9: iastore
		// @0FA: aastore
		// @0FB: dup
		// @0FC: bipush 9 (0x09)
		// @0FE: iconst_3
		// @0FF: newarray int[]
		// @101: dup
		// @102: iconst_0
		// @103: bipush 10 (0x0A)
		// @105: iastore
		// @106: dup
		// @107: iconst_1
		// @108: iconst_0
		// @109: iastore
		// @10A: dup
		// @10B: iconst_2
		// @10C: bipush 10 (0x0A)
		// @10E: iastore
		// @10F: aastore
		// @110: dup
		// @111: bipush 10 (0x0A)
		// @113: iconst_3
		// @114: newarray int[]
		// @116: dup
		// @117: iconst_0
		// @118: iconst_3
		// @119: iastore
		// @11A: dup
		// @11B: iconst_1
		// @11C: bipush 7 (0x07)
		// @11E: iastore
		// @11F: dup
		// @120: iconst_2
		// @121: bipush 8 (0x08)
		// @123: iastore
		// @124: aastore
		// @125: dup
		// @126: bipush 11 (0x0B)
		// @128: iconst_3
		// @129: newarray int[]
		// @12B: dup
		// @12C: iconst_0
		// @12D: bipush 8 (0x08)
		// @12F: iastore
		// @130: dup
		// @131: iconst_1
		// @132: bipush 7 (0x07)
		// @134: iastore
		// @135: dup
		// @136: iconst_2
		// @137: iconst_3
		// @138: iastore
		// @139: aastore
		// @13A: dup
		// @13B: bipush 12 (0x0C)
		// @13D: iconst_4
		// @13E: newarray int[]
		// @140: dup
		// @141: iconst_0
		// @142: bipush 9 (0x09)
		// @144: iastore
		// @145: dup
		// @146: iconst_1
		// @147: bipush 9 (0x09)
		// @149: iastore
		// @14A: dup
		// @14B: iconst_2
		// @14C: bipush 9 (0x09)
		// @14E: iastore
		// @14F: dup
		// @150: iconst_3
		// @151: bipush 9 (0x09)
		// @153: iastore
		// @154: aastore
		// @155: dup
		// @156: bipush 13 (0x0D)
		// @158: iconst_2
		// @159: newarray int[]
		// @15B: dup
		// @15C: iconst_0
		// @15D: iconst_2
		// @15E: iastore
		// @15F: dup
		// @160: iconst_1
		// @161: iconst_2
		// @162: iastore
		// @163: aastore
		// @164: dup
		// @165: bipush 14 (0x0E)
		// @167: iconst_5
		// @168: newarray int[]
		// @16A: dup
		// @16B: iconst_0
		// @16C: bipush 8 (0x08)
		// @16E: iastore
		// @16F: dup
		// @170: iconst_1
		// @171: iconst_0
		// @172: iastore
		// @173: dup
		// @174: iconst_2
		// @175: iconst_3
		// @176: iastore
		// @177: dup
		// @178: iconst_3
		// @179: iconst_0
		// @17A: iastore
		// @17B: dup
		// @17C: iconst_4
		// @17D: bipush 8 (0x08)
		// @17F: iastore
		// @180: aastore
		// @181: dup
		// @182: bipush 15 (0x0F)
		// @184: iconst_5
		// @185: newarray int[]
		// @187: dup
		// @188: iconst_0
		// @189: bipush 10 (0x0A)
		// @18B: iastore
		// @18C: dup
		// @18D: iconst_1
		// @18E: iconst_0
		// @18F: iastore
		// @190: dup
		// @191: iconst_2
		// @192: iconst_3
		// @193: iastore
		// @194: dup
		// @195: iconst_3
		// @196: iconst_3
		// @197: iastore
		// @198: dup
		// @199: iconst_4
		// @19A: iconst_2
		// @19B: iastore
		// @19C: aastore
		// @19D: dup
		// @19E: bipush 16 (0x10)
		// @1A0: iconst_5
		// @1A1: newarray int[]
		// @1A3: dup
		// @1A4: iconst_0
		// @1A5: iconst_0
		// @1A6: iastore
		// @1A7: dup
		// @1A8: iconst_1
		// @1A9: iconst_0
		// @1AA: iastore
		// @1AB: dup
		// @1AC: iconst_2
		// @1AD: bipush 7 (0x07)
		// @1AF: iastore
		// @1B0: dup
		// @1B1: iconst_3
		// @1B2: iconst_0
		// @1B3: iastore
		// @1B4: dup
		// @1B5: iconst_4
		// @1B6: iconst_0
		// @1B7: iastore
		// @1B8: aastore
		// @1B9: dup
		// @1BA: bipush 17 (0x11)
		// @1BC: iconst_5
		// @1BD: newarray int[]
		// @1BF: dup
		// @1C0: iconst_0
		// @1C1: iconst_2
		// @1C2: iastore
		// @1C3: dup
		// @1C4: iconst_1
		// @1C5: iconst_3
		// @1C6: iastore
		// @1C7: dup
		// @1C8: iconst_2
		// @1C9: iconst_3
		// @1CA: iastore
		// @1CB: dup
		// @1CC: iconst_3
		// @1CD: iconst_0
		// @1CE: iastore
		// @1CF: dup
		// @1D0: iconst_4
		// @1D1: bipush 10 (0x0A)
		// @1D3: iastore
		// @1D4: aastore
		// @1D5: dup
		// @1D6: bipush 18 (0x12)
		// @1D8: iconst_4
		// @1D9: newarray int[]
		// @1DB: dup
		// @1DC: iconst_0
		// @1DD: iconst_1
		// @1DE: iastore
		// @1DF: dup
		// @1E0: iconst_1
		// @1E1: iconst_1
		// @1E2: iastore
		// @1E3: dup
		// @1E4: iconst_2
		// @1E5: iconst_1
		// @1E6: iastore
		// @1E7: dup
		// @1E8: iconst_3
		// @1E9: iconst_1
		// @1EA: iastore
		// @1EB: aastore
		// @1EC: dup
		// @1ED: bipush 19 (0x13)
		// @1EF: iconst_4
		// @1F0: newarray int[]
		// @1F2: dup
		// @1F3: iconst_0
		// @1F4: bipush 11 (0x0B)
		// @1F6: iastore
		// @1F7: dup
		// @1F8: iconst_1
		// @1F9: iconst_0
		// @1FA: iastore
		// @1FB: dup
		// @1FC: iconst_2
		// @1FD: iconst_0
		// @1FE: iastore
		// @1FF: dup
		// @200: iconst_3
		// @201: iconst_0
		// @202: iastore
		// @203: aastore
		// @204: dup
		// @205: bipush 20 (0x14)
		// @207: iconst_4
		// @208: newarray int[]
		// @20A: dup
		// @20B: iconst_0
		// @20C: iconst_0
		// @20D: iastore
		// @20E: dup
		// @20F: iconst_1
		// @210: iconst_0
		// @211: iastore
		// @212: dup
		// @213: iconst_2
		// @214: iconst_0
		// @215: iastore
		// @216: dup
		// @217: iconst_3
		// @218: bipush 11 (0x0B)
		// @21A: iastore
		// @21B: aastore
		// @21C: dup
		// @21D: bipush 21 (0x15)
		// @21F: iconst_2
		// @220: newarray int[]
		// @222: dup
		// @223: iconst_0
		// @224: bipush 12 (0x0C)
		// @226: iastore
		// @227: dup
		// @228: iconst_1
		// @229: bipush 12 (0x0C)
		// @22B: iastore
		// @22C: aastore
		// @22D: dup
		// @22E: bipush 22 (0x16)
		// @230: iconst_5
		// @231: newarray int[]
		// @233: dup
		// @234: iconst_0
		// @235: bipush 9 (0x09)
		// @237: iastore
		// @238: dup
		// @239: iconst_1
		// @23A: iconst_3
		// @23B: iastore
		// @23C: dup
		// @23D: iconst_2
		// @23E: bipush 24 (0x18)
		// @240: iastore
		// @241: dup
		// @242: iconst_3
		// @243: iconst_3
		// @244: iastore
		// @245: dup
		// @246: iconst_4
		// @247: bipush 9 (0x09)
		// @249: iastore
		// @24A: aastore
		// @24B: dup
		// @24C: bipush 23 (0x17)
		// @24E: iconst_1
		// @24F: newarray int[]
		// @251: dup
		// @252: iconst_0
		// @253: bipush 13 (0x0D)
		// @255: iastore
		// @256: aastore
		// @257: dup
		// @258: bipush 24 (0x18)
		// @25A: iconst_5
		// @25B: newarray int[]
		// @25D: dup
		// @25E: iconst_0
		// @25F: iconst_2
		// @260: iastore
		// @261: dup
		// @262: iconst_1
		// @263: iconst_2
		// @264: iastore
		// @265: dup
		// @266: iconst_2
		// @267: iconst_2
		// @268: iastore
		// @269: dup
		// @26A: iconst_3
		// @26B: iconst_2
		// @26C: iastore
		// @26D: dup
		// @26E: iconst_4
		// @26F: bipush 12 (0x0C)
		// @271: iastore
		// @272: aastore
		// @273: dup
		// @274: bipush 25 (0x19)
		// @276: iconst_5
		// @277: newarray int[]
		// @279: dup
		// @27A: iconst_0
		// @27B: bipush 12 (0x0C)
		// @27D: iastore
		// @27E: dup
		// @27F: iconst_1
		// @280: iconst_4
		// @281: iastore
		// @282: dup
		// @283: iconst_2
		// @284: iconst_3
		// @285: iastore
		// @286: dup
		// @287: iconst_3
		// @288: iconst_3
		// @289: iastore
		// @28A: dup
		// @28B: iconst_4
		// @28C: iconst_4
		// @28D: iastore
		// @28E: aastore
		// @28F: dup
		// @290: bipush 26 (0x1A)
		// @292: iconst_5
		// @293: newarray int[]
		// @295: dup
		// @296: iconst_0
		// @297: iconst_0
		// @298: iastore
		// @299: dup
		// @29A: iconst_1
		// @29B: iconst_0
		// @29C: iastore
		// @29D: dup
		// @29E: iconst_2
		// @29F: bipush 14 (0x0E)
		// @2A1: iastore
		// @2A2: dup
		// @2A3: iconst_3
		// @2A4: iconst_0
		// @2A5: iastore
		// @2A6: dup
		// @2A7: iconst_4
		// @2A8: iconst_0
		// @2A9: iastore
		// @2AA: aastore
		// @2AB: dup
		// @2AC: bipush 27 (0x1B)
		// @2AE: iconst_3
		// @2AF: newarray int[]
		// @2B1: dup
		// @2B2: iconst_0
		// @2B3: iconst_2
		// @2B4: iastore
		// @2B5: dup
		// @2B6: iconst_1
		// @2B7: bipush 13 (0x0D)
		// @2B9: iastore
		// @2BA: dup
		// @2BB: iconst_2
		// @2BC: iconst_2
		// @2BD: iastore
		// @2BE: aastore
		// @2BF: dup
		// @2C0: bipush 28 (0x1C)
		// @2C2: iconst_5
		// @2C3: newarray int[]
		// @2C5: dup
		// @2C6: iconst_0
		// @2C7: bipush 11 (0x0B)
		// @2C9: iastore
		// @2CA: dup
		// @2CB: iconst_1
		// @2CC: iconst_5
		// @2CD: iastore
		// @2CE: dup
		// @2CF: iconst_2
		// @2D0: iconst_5
		// @2D1: iastore
		// @2D2: dup
		// @2D3: iconst_3
		// @2D4: iconst_5
		// @2D5: iastore
		// @2D6: dup
		// @2D7: iconst_4
		// @2D8: bipush 11 (0x0B)
		// @2DA: iastore
		// @2DB: aastore
		// @2DC: dup
		// @2DD: bipush 29 (0x1D)
		// @2DF: iconst_5
		// @2E0: newarray int[]
		// @2E2: dup
		// @2E3: iconst_0
		// @2E4: bipush 10 (0x0A)
		// @2E6: iastore
		// @2E7: dup
		// @2E8: iconst_1
		// @2E9: iconst_1
		// @2EA: iastore
		// @2EB: dup
		// @2EC: iconst_2
		// @2ED: iconst_1
		// @2EE: iastore
		// @2EF: dup
		// @2F0: iconst_3
		// @2F1: bipush 12 (0x0C)
		// @2F3: iastore
		// @2F4: dup
		// @2F5: iconst_4
		// @2F6: bipush 12 (0x0C)
		// @2F8: iastore
		// @2F9: aastore
		// @2FA: dup
		// @2FB: bipush 30 (0x1E)
		// @2FD: iconst_5
		// @2FE: newarray int[]
		// @300: dup
		// @301: iconst_0
		// @302: bipush 12 (0x0C)
		// @304: iastore
		// @305: dup
		// @306: iconst_1
		// @307: bipush 12 (0x0C)
		// @309: iastore
		// @30A: dup
		// @30B: iconst_2
		// @30C: iconst_1
		// @30D: iastore
		// @30E: dup
		// @30F: iconst_3
		// @310: iconst_1
		// @311: iastore
		// @312: dup
		// @313: iconst_4
		// @314: bipush 10 (0x0A)
		// @316: iastore
		// @317: aastore
		// @318: dup
		// @319: bipush 31 (0x1F)
		// @31B: iconst_3
		// @31C: newarray int[]
		// @31E: dup
		// @31F: iconst_0
		// @320: iconst_3
		// @321: iastore
		// @322: dup
		// @323: iconst_1
		// @324: bipush 15 (0x0F)
		// @326: iastore
		// @327: dup
		// @328: iconst_2
		// @329: iconst_3
		// @32A: iastore
		// @32B: aastore
		// @32C: dup
		// @32D: bipush 32 (0x20)
		// @32F: bipush 6 (0x06)
		// @331: newarray int[]
		// @333: dup
		// @334: iconst_0
		// @335: bipush 8 (0x08)
		// @337: iastore
		// @338: dup
		// @339: iconst_1
		// @33A: bipush 6 (0x06)
		// @33C: iastore
		// @33D: dup
		// @33E: iconst_2
		// @33F: iconst_4
		// @340: iastore
		// @341: dup
		// @342: iconst_3
		// @343: iconst_4
		// @344: iastore
		// @345: dup
		// @346: iconst_4
		// @347: bipush 6 (0x06)
		// @349: iastore
		// @34A: dup
		// @34B: iconst_5
		// @34C: bipush 8 (0x08)
		// @34E: iastore
		// @34F: aastore
		// @350: dup
		// @351: bipush 33 (0x21)
		// @353: iconst_5
		// @354: newarray int[]
		// @356: dup
		// @357: iconst_0
		// @358: bipush 9 (0x09)
		// @35A: iastore
		// @35B: dup
		// @35C: iconst_1
		// @35D: bipush 9 (0x09)
		// @35F: iastore
		// @360: dup
		// @361: iconst_2
		// @362: iconst_4
		// @363: iastore
		// @364: dup
		// @365: iconst_3
		// @366: bipush 6 (0x06)
		// @368: iastore
		// @369: dup
		// @36A: iconst_4
		// @36B: bipush 14 (0x0E)
		// @36D: iastore
		// @36E: aastore
		// @36F: dup
		// @370: bipush 34 (0x22)
		// @372: iconst_5
		// @373: newarray int[]
		// @375: dup
		// @376: iconst_0
		// @377: bipush 14 (0x0E)
		// @379: iastore
		// @37A: dup
		// @37B: iconst_1
		// @37C: bipush 6 (0x06)
		// @37E: iastore
		// @37F: dup
		// @380: iconst_2
		// @381: iconst_4
		// @382: iastore
		// @383: dup
		// @384: iconst_3
		// @385: bipush 9 (0x09)
		// @387: iastore
		// @388: dup
		// @389: iconst_4
		// @38A: bipush 9 (0x09)
		// @38C: iastore
		// @38D: aastore
		// @38E: dup
		// @38F: bipush 35 (0x23)
		// @391: iconst_2
		// @392: newarray int[]
		// @394: dup
		// @395: iconst_0
		// @396: bipush 16 (0x10)
		// @398: iastore
		// @399: dup
		// @39A: iconst_1
		// @39B: bipush 16 (0x10)
		// @39D: iastore
		// @39E: aastore
		// @39F: dup
		// @3A0: bipush 36 (0x24)
		// @3A2: bipush 6 (0x06)
		// @3A4: newarray int[]
		// @3A6: dup
		// @3A7: iconst_0
		// @3A8: bipush 11 (0x0B)
		// @3AA: iastore
		// @3AB: dup
		// @3AC: iconst_1
		// @3AD: bipush 12 (0x0C)
		// @3AF: iastore
		// @3B0: dup
		// @3B1: iconst_2
		// @3B2: iconst_4
		// @3B3: iastore
		// @3B4: dup
		// @3B5: iconst_3
		// @3B6: iconst_4
		// @3B7: iastore
		// @3B8: dup
		// @3B9: iconst_4
		// @3BA: bipush 12 (0x0C)
		// @3BC: iastore
		// @3BD: dup
		// @3BE: iconst_5
		// @3BF: bipush 11 (0x0B)
		// @3C1: iastore
		// @3C2: aastore
		// @3C3: dup
		// @3C4: bipush 37 (0x25)
		// @3C6: iconst_3
		// @3C7: newarray int[]
		// @3C9: dup
		// @3CA: iconst_0
		// @3CB: bipush 13 (0x0D)
		// @3CD: iastore
		// @3CE: dup
		// @3CF: iconst_1
		// @3D0: bipush 24 (0x18)
		// @3D2: iastore
		// @3D3: dup
		// @3D4: iconst_2
		// @3D5: bipush 13 (0x0D)
		// @3D7: iastore
		// @3D8: aastore
		// @3D9: dup
		// @3DA: bipush 38 (0x26)
		// @3DC: iconst_5
		// @3DD: newarray int[]
		// @3DF: dup
		// @3E0: iconst_0
		// @3E1: bipush 12 (0x0C)
		// @3E3: iastore
		// @3E4: dup
		// @3E5: iconst_1
		// @3E6: bipush 8 (0x08)
		// @3E8: iastore
		// @3E9: dup
		// @3EA: iconst_2
		// @3EB: bipush 15 (0x0F)
		// @3ED: iastore
		// @3EE: dup
		// @3EF: iconst_3
		// @3F0: bipush 8 (0x08)
		// @3F2: iastore
		// @3F3: dup
		// @3F4: iconst_4
		// @3F5: bipush 12 (0x0C)
		// @3F7: iastore
		// @3F8: aastore
		// @3F9: dup
		// @3FA: bipush 39 (0x27)
		// @3FC: bipush 9 (0x09)
		// @3FE: newarray int[]
		// @400: dup
		// @401: iconst_0
		// @402: bipush 14 (0x0E)
		// @404: iastore
		// @405: dup
		// @406: iconst_1
		// @407: iconst_0
		// @408: iastore
		// @409: dup
		// @40A: iconst_2
		// @40B: iconst_0
		// @40C: iastore
		// @40D: dup
		// @40E: iconst_3
		// @40F: iconst_0
		// @410: iastore
		// @411: dup
		// @412: iconst_4
		// @413: bipush 17 (0x11)
		// @415: iastore
		// @416: dup
		// @417: iconst_5
		// @418: iconst_0
		// @419: iastore
		// @41A: dup
		// @41B: bipush 6 (0x06)
		// @41D: iconst_0
		// @41E: iastore
		// @41F: dup
		// @420: bipush 7 (0x07)
		// @422: iconst_0
		// @423: iastore
		// @424: dup
		// @425: bipush 8 (0x08)
		// @427: bipush 14 (0x0E)
		// @429: iastore
		// @42A: aastore
		// @42B: dup
		// @42C: bipush 40 (0x28)
		// @42E: bipush 7 (0x07)
		// @430: newarray int[]
		// @432: dup
		// @433: iconst_0
		// @434: bipush 9 (0x09)
		// @436: iastore
		// @437: dup
		// @438: iconst_1
		// @439: bipush 9 (0x09)
		// @43B: iastore
		// @43C: dup
		// @43D: iconst_2
		// @43E: bipush 6 (0x06)
		// @440: iastore
		// @441: dup
		// @442: iconst_3
		// @443: bipush 16 (0x10)
		// @445: iastore
		// @446: dup
		// @447: iconst_4
		// @448: bipush 6 (0x06)
		// @44A: iastore
		// @44B: dup
		// @44C: iconst_5
		// @44D: bipush 9 (0x09)
		// @44F: iastore
		// @450: dup
		// @451: bipush 6 (0x06)
		// @453: bipush 9 (0x09)
		// @455: iastore
		// @456: aastore
		// @457: dup
		// @458: bipush 41 (0x29)
		// @45A: iconst_1
		// @45B: newarray int[]
		// @45D: dup
		// @45E: iconst_0
		// @45F: bipush 18 (0x12)
		// @461: iastore
		// @462: aastore
		// @463: putstatic int[][] game.C_100181_cf.field_105706_c
		// @466: ldc "\u0017]0\u0002~2Z9\u000bc"
		// @468: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @46B: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @46E: putstatic java.lang.String game.C_100181_cf.field_105710_h
		// @471: ldc "\u001c]/\u0007nk\u0008"
		// @473: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @476: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @479: putstatic java.lang.String game.C_100181_cf.field_105702_g
		// @47C: ldc "\u0008G)Nn0F2\u0001yqB3\u0007cq\\4\u0007~qO=\u0003hq\u0005|\u0007yqA/Nd?\u0008,\u001cb6Z9\u001d~"
		// @47E: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @481: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @484: putstatic java.lang.String game.C_100181_cf.field_105711_i
		// @487: ldc "\u0005Z%Nn9I2\td?O|\u001ae4\u0008{R(a\u0016{N~4\\(\u0007c6\u0006"
		// @489: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @48C: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @48F: putstatic java.lang.String game.C_100181_cf.field_105707_a
		// @492: bipush 8 (0x08)
		// @494: anewarray java.lang.String
		// @497: dup
		// @498: iconst_0
		// @499: aconst_null
		// @49A: aastore
		// @49B: dup
		// @49C: iconst_1
		// @49D: ldc "\u0005G|\u001dy>Z9Nt>].N}#G;\u001ch\"[pNt>]|\u0003x\"\\|\u0002b6\u00085\u0000->Z|\r\u007f4I(\u000b-0\u0008:\u001ch4\u0008=\rn>]2\u001a#ri0\u001ah#F=\u001ad'M0\u0017!qK0\u0007n:\u0008`K=o\u0008(\u0001-5A/\rl#L|\u0007yqI2\n-2G2\u001ad?]9@"
		// @49F: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @4A2: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @4A5: aastore
		// @4A6: dup
		// @4A7: iconst_2
		// @4A8: ldc "\u0005G|\u001dy>Z9Nt>].N~2G.\u000b!qQ3\u001b-<]/\u001a-=G;Nd?\u00083\u001c-2Z9\u000fy4\u0008=Nk#M9Nl2K3\u001bc%\u0006\u007f/a%M.\u0000l%A*\u000ba(\u0004|\ra8K7N1t\u0018bNy>\u00088\u0007~2I.\n-8\\|\u000fc5\u0008?\u0001c%A2\u001bh\u007f"
		// @4AA: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @4AD: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @4B0: aastore
		// @4B1: dup
		// @4B2: iconst_3
		// @4B3: ldc "\u0005G|\u001dy>Z9Nt>].N~2G.\u000b-0F8N}#G;\u001ch\"[pNt>]|\u0003x\"\\|\u0002b6\u00085\u0000->Z|\r\u007f4I(\u000b-0\u0008:\u001ch4\u0008=\rn>]2\u001a#ri0\u001ah#F=\u001ad'M0\u0017!qK0\u0007n:\u0008`K=o\u0008(\u0001-5A/\rl#L|\u001ae4E|\u000fc5\u0008?\u0001c%A2\u001bh\u007f"
		// @4B5: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @4B8: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @4BB: aastore
		// @4BC: dup
		// @4BD: iconst_4
		// @4BE: ldc "\u0005G|\u001dy>Z9Nt>].Nl2@5\u000b{4E9\u0000y\"\u0004|\u0017b$\u00081\u001b~%\u00080\u0001jqA2Nb#\u0008?\u001ch0\\9NlqN.\u000bhqI?\rb$F(@.\u0010D(\u000b\u007f?I(\u0007{4D%B-2D5\rfq\u0014y^3q\\3Ni8[?\u000f\u007f5\u0008(\u0006h<\u0008=\u0000iqK3\u0000y8F)\u000b#"
		// @4C0: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @4C3: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @4C6: aastore
		// @4C7: dup
		// @4C8: iconst_5
		// @4C9: ldc "\u0005G|\u001dy>Z9Nt>].Nl2@5\u000b{4E9\u0000y\"\u0008=\u0000iqX.\u0001j#M/\u001d!qQ3\u001b-<]/\u001a-=G;Nd?\u00083\u001c-2Z9\u000fy4\u0008=Nk#M9Nl2K3\u001bc%\u0006\u007f/a%M.\u0000l%A*\u000ba(\u0004|\ra8K7N1t\u0018bNy>\u00088\u0007~2I.\n-%@9\u0003-0F8Nn>F(\u0007c$Mr"
		// @4CB: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @4CE: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @4D1: aastore
		// @4D2: dup
		// @4D3: bipush 6 (0x06)
		// @4D5: ldc "\u0005G|\u001dy>Z9Nt>].Nl2@5\u000b{4E9\u0000y\"\u0008=\u0000iq[?\u0001\u007f4\u0004|\u0017b$\u00081\u001b~%\u00080\u0001jqA2Nb#\u0008?\u001ch0\\9NlqN.\u000bhqI?\rb$F(@.\u0010D(\u000b\u007f?I(\u0007{4D%B-2D5\rfq\u0014y^3q\\3Ni8[?\u000f\u007f5\u0008(\u0006h<\u0008=\u0000iqK3\u0000y8F)\u000b#"
		// @4D7: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @4DA: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @4DD: aastore
		// @4DE: dup
		// @4DF: bipush 7 (0x07)
		// @4E1: ldc "\u0005G|\u001dy>Z9Nt>].Nl2@5\u000b{4E9\u0000y\"\u0004|\u001dn>Z9Nl?L|\u001e\u007f>O.\u000b~\"\u0004|\u0017b$\u00081\u001b~%\u00080\u0001jqA2Nb#\u0008?\u001ch0\\9NlqN.\u000bhqI?\rb$F(@.\u0010D(\u000b\u007f?I(\u0007{4D%B-2D5\rfq\u0014y^3q\\3Ni8[?\u000f\u007f5\u0008(\u0006h<\u0008=\u0000iqK3\u0000y8F)\u000b#"
		// @4E3: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @4E6: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @4E9: aastore
		// @4EA: putstatic java.lang.String[] game.C_100181_cf.field_105703_d
		// @4ED: ldc "\u0002}\u0018*H\u001f\u0008\u0018+L\u0005`}"
		// @4EF: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @4F2: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @4F5: putstatic java.lang.String game.C_100181_cf.field_105708_j
		// @4F8: ldc "\u0012d\u0019/_ql\u000e!C\u0014{"
		// @4FA: invokestatic game.C_100181_cf.func_105697_z(java.lang.String)char[]
		// @4FD: invokestatic game.C_100181_cf.func_105696_z(char[])java.lang.String
		// @500: putstatic java.lang.String game.C_100181_cf.field_105701_f
		// @503: return
	}
	
	private static char[] func_105697_z(String arg0)
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
		// @0E: bipush 13 (0x0D)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105696_z(char[] arg0)
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
		// @30: bipush 81 (0x51)
		// @32: goto @46
		// @35: bipush 40 (0x28)
		// @37: goto @46
		// @3A: bipush 92 (0x5C)
		// @3C: goto @46
		// @3F: bipush 110 (0x6E)
		// @41: goto @46
		// @44: bipush 13 (0x0D)
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
