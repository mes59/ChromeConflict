package game;

final class C_100283_ni
{
	static int field_106760_c;
	static C_100002_gf field_106759_b;
	static String[] field_106756_g;
	private C_100098_h field_106757_d;
	private C_100098_h field_106761_a;
	static int field_106755_f;
	private C_100318_hj field_106758_e;
	private static final String[] field_106762_z;
	
	static final C_100130_tf func_106753_a(String arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: aload_0
		// @06: invokevirtual java.lang.String.length()int
		// @09: istore_2
		// @0A: iconst_m1
		// @0B: iload_2
		// @0C: iconst_m1
		// @0D: ixor
		// @0E: if_icmpeq @15
		// @11: goto @19
		// @14: athrow
		// @15: getstatic game.C_100130_tf game.C_100082_uf.field_100374_a
		// @18: areturn
		// @19: iload_2
		// @1A: iconst_m1
		// @1B: ixor
		// @1C: bipush -64 (0xC0)
		// @1E: if_icmpge @25
		// @21: getstatic game.C_100130_tf game.C_100115_ej.field_102039_ac
		// @24: areturn
		// @25: iconst_0
		// @26: istore_3
		// @27: iload_2
		// @28: iload_3
		// @29: if_icmple @79
		// @2C: aload_0
		// @2D: iload_3
		// @2E: invokevirtual java.lang.String.charAt(int)char
		// @31: istore #4
		// @33: bipush 45 (0x2D)
		// @35: iload #4
		// @37: iload #5
		// @39: ifne @82
		// @3C: if_icmpeq @46
		// @3F: goto @43
		// @42: athrow
		// @43: goto @60
		// @46: iload_3
		// @47: iconst_m1
		// @48: ixor
		// @49: iconst_m1
		// @4A: if_icmpeq @5C
		// @4D: iconst_m1
		// @4E: iload_2
		// @4F: iadd
		// @50: iconst_m1
		// @51: ixor
		// @52: iload_3
		// @53: iconst_m1
		// @54: ixor
		// @55: if_icmpne @71
		// @58: goto @5C
		// @5B: athrow
		// @5C: getstatic game.C_100130_tf game.C_100132_td.field_104975_c
		// @5F: areturn
		// @60: getstatic java.lang.String game.C_100260_mc.field_102237_Ub
		// @63: iload #4
		// @65: invokevirtual java.lang.String.indexOf(int)int
		// @68: iconst_m1
		// @69: ixor
		// @6A: ifne @71
		// @6D: getstatic game.C_100130_tf game.C_100132_td.field_104975_c
		// @70: areturn
		// @71: iinc #3 +1
		// @74: iload #5
		// @76: ifeq @27
		// @79: bipush -21 (0xEB)
		// @7B: iload_1
		// @7C: bipush -35 (0xDD)
		// @7E: isub
		// @7F: bipush 62 (0x3E)
		// @81: idiv
		// @82: irem
		// @83: istore #4
		// @85: aconst_null
		// @86: areturn
		// @87: astore_2
		// @88: aload_2
		// @89: new java.lang.StringBuilder
		// @8C: dup
		// @8D: invokespecial java.lang.StringBuilder.<init>()void
		// @90: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @93: bipush 6 (0x06)
		// @95: aaload
		// @96: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @99: aload_0
		// @9A: ifnull @A6
		// @9D: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @A0: iconst_3
		// @A1: aaload
		// @A2: goto @AB
		// @A5: athrow
		// @A6: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @A9: iconst_1
		// @AA: aaload
		// @AB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AE: bipush 44 (0x2C)
		// @B0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B3: iload_1
		// @B4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B7: bipush 41 (0x29)
		// @B9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @BF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C2: athrow
	}
	
	public static void func_106748_c(int arg0)
	{
		// @00: iload_0
		// @01: iconst_5
		// @02: if_icmpeq @1D
		// @05: iconst_1
		// @06: aconst_null
		// @07: checkcast int[]
		// @0A: iconst_1
		// @0B: bipush -91 (0xA5)
		// @0D: aconst_null
		// @0E: checkcast int[]
		// @11: aconst_null
		// @12: checkcast game.C_100277_nc
		// @15: iconst_0
		// @16: invokestatic game.C_100283_ni.func_106746_a(boolean, int[], boolean, int, int[], game.C_100277_nc, boolean)void
		// @19: goto @1D
		// @1C: athrow
		// @1D: aconst_null
		// @1E: putstatic java.lang.String[] game.C_100283_ni.field_106756_g
		// @21: aconst_null
		// @22: putstatic game.C_100002_gf game.C_100283_ni.field_106759_b
		// @25: goto @4A
		// @28: astore_1
		// @29: aload_1
		// @2A: new java.lang.StringBuilder
		// @2D: dup
		// @2E: invokespecial java.lang.StringBuilder.<init>()void
		// @31: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @34: bipush 8 (0x08)
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: iload_0
		// @3B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E: bipush 41 (0x29)
		// @40: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @46: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @49: athrow
		// @4A: return
	}
	
	static final void func_106746_a(boolean arg0, int[] arg1, boolean arg2, int arg3, int[] arg4, C_100277_nc arg5, boolean arg6)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #30
		// @005: ldc 2147483647 (0x7fffffff)
		// @007: istore #7
		// @009: ldc -2147483648 (0x80000000)
		// @00B: istore #8
		// @00D: aload_1
		// @00E: iconst_3
		// @00F: iaload
		// @010: ldc 1453649666 (0x56a4ef02)
		// @012: ishr
		// @013: istore #21
		// @015: aload_1
		// @016: iconst_4
		// @017: iaload
		// @018: ldc 1157165506 (0x44f8f1c2)
		// @01A: ishr
		// @01B: istore #22
		// @01D: aload_1
		// @01E: iconst_5
		// @01F: iaload
		// @020: ldc 1946541410 (0x7405dd62)
		// @022: ishr
		// @023: istore #23
		// @025: aload_1
		// @026: bipush 6 (0x06)
		// @028: iaload
		// @029: ldc 999513122 (0x3b935c22)
		// @02B: ishr
		// @02C: istore #24
		// @02E: aload_1
		// @02F: bipush 7 (0x07)
		// @031: iaload
		// @032: ldc -197315070 (0xf43d3602)
		// @034: ishr
		// @035: istore #25
		// @037: aload_1
		// @038: bipush 8 (0x08)
		// @03A: iaload
		// @03B: ldc -11396830 (0xff521922)
		// @03D: ishr
		// @03E: istore #26
		// @040: aload_1
		// @041: bipush 9 (0x09)
		// @043: iaload
		// @044: ldc 1118573794 (0x42ac14e2)
		// @046: ishr
		// @047: istore #27
		// @049: aload_1
		// @04A: bipush 10 (0x0A)
		// @04C: iaload
		// @04D: ldc -1792246366 (0x952c7da2)
		// @04F: ishr
		// @050: istore #28
		// @052: aload #4
		// @054: iconst_5
		// @055: iaload
		// @056: iload #26
		// @058: imul
		// @059: iload #24
		// @05B: aload #4
		// @05D: iconst_3
		// @05E: iaload
		// @05F: imul
		// @060: iload #25
		// @062: aload #4
		// @064: iconst_4
		// @065: iaload
		// @066: imul
		// @067: ineg
		// @068: isub
		// @069: iadd
		// @06A: ldc 2097948078 (0x7d0c25ae)
		// @06C: ishr
		// @06D: istore #13
		// @06F: aload #4
		// @071: iconst_3
		// @072: iaload
		// @073: iload #21
		// @075: imul
		// @076: aload #4
		// @078: iconst_4
		// @079: iaload
		// @07A: iload #22
		// @07C: imul
		// @07D: ineg
		// @07E: aload #4
		// @080: iconst_5
		// @081: iaload
		// @082: iload #23
		// @084: imul
		// @085: ineg
		// @086: iadd
		// @087: isub
		// @088: ldc -166820210 (0xf60e868e)
		// @08A: ishr
		// @08B: istore #12
		// @08D: aload_1
		// @08E: bipush 11 (0x0B)
		// @090: iaload
		// @091: ldc 1352185794 (0x5098b7c2)
		// @093: ishr
		// @094: istore #29
		// @096: aload #4
		// @098: bipush 6 (0x06)
		// @09A: iaload
		// @09B: iload #21
		// @09D: imul
		// @09E: iload #22
		// @0A0: aload #4
		// @0A2: bipush 7 (0x07)
		// @0A4: iaload
		// @0A5: imul
		// @0A6: ineg
		// @0A7: aload #4
		// @0A9: bipush 8 (0x08)
		// @0AB: iaload
		// @0AC: iload #23
		// @0AE: imul
		// @0AF: isub
		// @0B0: isub
		// @0B1: ldc -901211698 (0xca4899ce)
		// @0B3: ishr
		// @0B4: istore #15
		// @0B6: iload #29
		// @0B8: aload #4
		// @0BA: bipush 11 (0x0B)
		// @0BC: iaload
		// @0BD: imul
		// @0BE: iload #27
		// @0C0: aload #4
		// @0C2: bipush 9 (0x09)
		// @0C4: iaload
		// @0C5: imul
		// @0C6: iadd
		// @0C7: iload #28
		// @0C9: aload #4
		// @0CB: bipush 10 (0x0A)
		// @0CD: iaload
		// @0CE: imul
		// @0CF: ineg
		// @0D0: isub
		// @0D1: ldc -27931762 (0xfe55cb8e)
		// @0D3: ishr
		// @0D4: istore #20
		// @0D6: aload #4
		// @0D8: iconst_5
		// @0D9: iaload
		// @0DA: iload #29
		// @0DC: imul
		// @0DD: aload #4
		// @0DF: iconst_3
		// @0E0: iaload
		// @0E1: iload #27
		// @0E3: imul
		// @0E4: aload #4
		// @0E6: iconst_4
		// @0E7: iaload
		// @0E8: iload #28
		// @0EA: imul
		// @0EB: ineg
		// @0EC: isub
		// @0ED: iadd
		// @0EE: ldc -1252533938 (0xb557d94e)
		// @0F0: ishr
		// @0F1: istore #14
		// @0F3: aload #4
		// @0F5: bipush 6 (0x06)
		// @0F7: iaload
		// @0F8: iload #27
		// @0FA: imul
		// @0FB: aload #4
		// @0FD: bipush 7 (0x07)
		// @0FF: iaload
		// @100: iload #28
		// @102: imul
		// @103: ineg
		// @104: isub
		// @105: iload #29
		// @107: aload #4
		// @109: bipush 8 (0x08)
		// @10B: iaload
		// @10C: imul
		// @10D: ineg
		// @10E: isub
		// @10F: ldc 1628545838 (0x6111a32e)
		// @111: ishr
		// @112: istore #17
		// @114: aload #4
		// @116: bipush 11 (0x0B)
		// @118: iaload
		// @119: iload #26
		// @11B: imul
		// @11C: aload #4
		// @11E: bipush 9 (0x09)
		// @120: iaload
		// @121: iload #24
		// @123: imul
		// @124: iadd
		// @125: aload #4
		// @127: bipush 10 (0x0A)
		// @129: iaload
		// @12A: iload #25
		// @12C: imul
		// @12D: ineg
		// @12E: isub
		// @12F: ldc 96653422 (0x5c2d06e)
		// @131: ishr
		// @132: istore #19
		// @134: iload #24
		// @136: aload #4
		// @138: bipush 6 (0x06)
		// @13A: iaload
		// @13B: imul
		// @13C: iload #25
		// @13E: aload #4
		// @140: bipush 7 (0x07)
		// @142: iaload
		// @143: imul
		// @144: iload #26
		// @146: aload #4
		// @148: bipush 8 (0x08)
		// @14A: iaload
		// @14B: imul
		// @14C: ineg
		// @14D: isub
		// @14E: iadd
		// @14F: ldc 112289998 (0x6b168ce)
		// @151: ishr
		// @152: istore #16
		// @154: iload #23
		// @156: aload #4
		// @158: bipush 11 (0x0B)
		// @15A: iaload
		// @15B: imul
		// @15C: iload #21
		// @15E: aload #4
		// @160: bipush 9 (0x09)
		// @162: iaload
		// @163: imul
		// @164: aload #4
		// @166: bipush 10 (0x0A)
		// @168: iaload
		// @169: iload #22
		// @16B: imul
		// @16C: iadd
		// @16D: iadd
		// @16E: ldc -1427870354 (0xaae46d6e)
		// @170: ishr
		// @171: istore #18
		// @173: aload_1
		// @174: iconst_0
		// @175: iaload
		// @176: ineg
		// @177: aload #4
		// @179: iconst_0
		// @17A: iaload
		// @17B: iadd
		// @17C: istore #21
		// @17E: aload #4
		// @180: iconst_1
		// @181: iaload
		// @182: aload_1
		// @183: iconst_1
		// @184: iaload
		// @185: ineg
		// @186: iadd
		// @187: istore #22
		// @189: aload #4
		// @18B: iconst_2
		// @18C: iaload
		// @18D: aload_1
		// @18E: iconst_2
		// @18F: iaload
		// @190: ineg
		// @191: iadd
		// @192: istore #23
		// @194: aload_1
		// @195: iconst_5
		// @196: iaload
		// @197: iload #23
		// @199: imul
		// @19A: iload #21
		// @19C: aload_1
		// @19D: iconst_3
		// @19E: iaload
		// @19F: imul
		// @1A0: iload #22
		// @1A2: aload_1
		// @1A3: iconst_4
		// @1A4: iaload
		// @1A5: imul
		// @1A6: ineg
		// @1A7: isub
		// @1A8: iadd
		// @1A9: bipush 16 (0x10)
		// @1AB: getstatic int game.C_100170_cm.field_105547_j
		// @1AE: isub
		// @1AF: ishr
		// @1B0: istore #9
		// @1B2: iload #22
		// @1B4: aload_1
		// @1B5: bipush 10 (0x0A)
		// @1B7: iaload
		// @1B8: imul
		// @1B9: aload_1
		// @1BA: bipush 9 (0x09)
		// @1BC: iaload
		// @1BD: iload #21
		// @1BF: imul
		// @1C0: aload_1
		// @1C1: bipush 11 (0x0B)
		// @1C3: iaload
		// @1C4: iload #23
		// @1C6: imul
		// @1C7: ineg
		// @1C8: isub
		// @1C9: iadd
		// @1CA: ldc 1893144112 (0x70d71630)
		// @1CC: ishr
		// @1CD: istore #11
		// @1CF: aload_1
		// @1D0: iload_3
		// @1D1: iaload
		// @1D2: iload #22
		// @1D4: imul
		// @1D5: aload_1
		// @1D6: bipush 6 (0x06)
		// @1D8: iaload
		// @1D9: iload #21
		// @1DB: imul
		// @1DC: iadd
		// @1DD: iload #23
		// @1DF: aload_1
		// @1E0: bipush 8 (0x08)
		// @1E2: iaload
		// @1E3: imul
		// @1E4: iadd
		// @1E5: getstatic int game.C_100170_cm.field_105547_j
		// @1E8: ineg
		// @1E9: bipush 16 (0x10)
		// @1EB: iadd
		// @1EC: ishr
		// @1ED: istore #10
		// @1EF: getstatic int game.C_100070_dn.field_104371_c
		// @1F2: istore #21
		// @1F4: getstatic int game.C_100070_dn.field_104368_d
		// @1F7: istore #22
		// @1F9: iconst_0
		// @1FA: istore #23
		// @1FC: iload #23
		// @1FE: iconst_m1
		// @1FF: ixor
		// @200: aload #5
		// @202: getfield short game.C_100277_nc.field_106698_F
		// @205: iconst_m1
		// @206: ixor
		// @207: if_icmple @314
		// @20A: aload #5
		// @20C: getfield short[] game.C_100277_nc.field_106711_U
		// @20F: iload #23
		// @211: saload
		// @212: istore #24
		// @214: aload #5
		// @216: getfield short[] game.C_100277_nc.field_106724_b
		// @219: iload #23
		// @21B: saload
		// @21C: istore #25
		// @21E: aload #5
		// @220: getfield short[] game.C_100277_nc.field_106714_V
		// @223: iload #23
		// @225: saload
		// @226: istore #26
		// @228: iload #18
		// @22A: iload #26
		// @22C: imul
		// @22D: iload #24
		// @22F: iload #12
		// @231: imul
		// @232: iload #15
		// @234: iload #25
		// @236: imul
		// @237: ineg
		// @238: isub
		// @239: iadd
		// @23A: getstatic int game.C_100170_cm.field_105547_j
		// @23D: ineg
		// @23E: bipush 16 (0x10)
		// @240: iadd
		// @241: ishr
		// @242: iload #9
		// @244: iadd
		// @245: istore #27
		// @247: iload #10
		// @249: iload #19
		// @24B: iload #26
		// @24D: imul
		// @24E: iload #25
		// @250: iload #16
		// @252: imul
		// @253: iadd
		// @254: iload #24
		// @256: iload #13
		// @258: imul
		// @259: iadd
		// @25A: getstatic int game.C_100170_cm.field_105547_j
		// @25D: ineg
		// @25E: bipush 16 (0x10)
		// @260: iadd
		// @261: ishr
		// @262: ineg
		// @263: isub
		// @264: istore #28
		// @266: iload #20
		// @268: iload #26
		// @26A: imul
		// @26B: iload #25
		// @26D: iload #17
		// @26F: imul
		// @270: iload #14
		// @272: iload #24
		// @274: imul
		// @275: iadd
		// @276: iadd
		// @277: ldc 72317072 (0x44f7890)
		// @279: ishr
		// @27A: iload #11
		// @27C: iadd
		// @27D: istore #29
		// @27F: bipush -51 (0xCD)
		// @281: iload #29
		// @283: iconst_m1
		// @284: ixor
		// @285: iload #30
		// @287: ifne @55F
		// @28A: if_icmpge @2A2
		// @28D: goto @291
		// @290: athrow
		// @291: getstatic int[] game.C_100316_lc.field_102405_E
		// @294: iload #23
		// @296: ldc -2147483648 (0x80000000)
		// @298: iastore
		// @299: iload #30
		// @29B: ifeq @2E4
		// @29E: goto @2A2
		// @2A1: athrow
		// @2A2: getstatic int[] game.C_100017_wj.field_103824_h
		// @2A5: iload #23
		// @2A7: iload #27
		// @2A9: iload #29
		// @2AB: idiv
		// @2AC: iload #21
		// @2AE: iadd
		// @2AF: iastore
		// @2B0: getstatic int[] game.C_100110_s.field_104845_e
		// @2B3: iload #23
		// @2B5: iload #28
		// @2B7: iload #29
		// @2B9: idiv
		// @2BA: iload #22
		// @2BC: iadd
		// @2BD: iastore
		// @2BE: getstatic int[] game.C_100316_lc.field_102405_E
		// @2C1: iload #23
		// @2C3: iload #29
		// @2C5: iastore
		// @2C6: iload #7
		// @2C8: iload #29
		// @2CA: if_icmpgt @2D5
		// @2CD: goto @2D1
		// @2D0: athrow
		// @2D1: goto @2D9
		// @2D4: athrow
		// @2D5: iload #29
		// @2D7: istore #7
		// @2D9: iload #8
		// @2DB: iload #29
		// @2DD: if_icmpge @2E4
		// @2E0: iload #29
		// @2E2: istore #8
		// @2E4: iload_2
		// @2E5: ifne @2EC
		// @2E8: goto @30C
		// @2EB: athrow
		// @2EC: getstatic int[] game.C_100146_bf.field_105122_g
		// @2EF: iload #23
		// @2F1: iload #27
		// @2F3: getstatic int game.C_100170_cm.field_105547_j
		// @2F6: ishr
		// @2F7: iastore
		// @2F8: getstatic int[] game.C_100141_tc.field_105069_k
		// @2FB: iload #23
		// @2FD: iload #28
		// @2FF: getstatic int game.C_100170_cm.field_105547_j
		// @302: ishr
		// @303: iastore
		// @304: getstatic int[] game.C_100108_ee.field_100388_c
		// @307: iload #23
		// @309: iload #29
		// @30B: iastore
		// @30C: iinc #23 +1
		// @30F: iload #30
		// @311: ifeq @1FC
		// @314: aload #5
		// @316: getfield int[] game.C_100277_nc.field_106704_M
		// @319: ifnull @50C
		// @31C: aload #5
		// @31E: getfield int[] game.C_100277_nc.field_106701_B
		// @321: ifnull @50C
		// @324: goto @328
		// @327: athrow
		// @328: aconst_null
		// @329: aload #5
		// @32B: getfield int[] game.C_100277_nc.field_106712_T
		// @32E: if_acmpeq @50C
		// @331: goto @335
		// @334: athrow
		// @335: aconst_null
		// @336: aload #5
		// @338: getfield int[] game.C_100277_nc.field_106715_Q
		// @33B: if_acmpeq @50C
		// @33E: goto @342
		// @341: athrow
		// @342: aconst_null
		// @343: aload #5
		// @345: getfield int[] game.C_100277_nc.field_106741_q
		// @348: if_acmpeq @50C
		// @34B: goto @34F
		// @34E: athrow
		// @34F: aconst_null
		// @350: aload #5
		// @352: getfield int[] game.C_100277_nc.field_106732_k
		// @355: if_acmpeq @50C
		// @358: goto @35C
		// @35B: athrow
		// @35C: aconst_null
		// @35D: aload #5
		// @35F: getfield int[] game.C_100277_nc.field_106739_s
		// @362: if_acmpeq @50C
		// @365: goto @369
		// @368: athrow
		// @369: aconst_null
		// @36A: aload #5
		// @36C: getfield int[] game.C_100277_nc.field_106727_n
		// @36F: if_acmpeq @50C
		// @372: goto @376
		// @375: athrow
		// @376: aload #5
		// @378: getfield int[] game.C_100277_nc.field_106725_c
		// @37B: ifnonnull @386
		// @37E: goto @382
		// @381: athrow
		// @382: goto @50C
		// @385: athrow
		// @386: iconst_0
		// @387: istore #23
		// @389: aload #5
		// @38B: getfield short game.C_100277_nc.field_106721_g
		// @38E: iconst_m1
		// @38F: ixor
		// @390: iload #23
		// @392: iconst_m1
		// @393: ixor
		// @394: if_icmpge @50C
		// @397: aload #5
		// @399: getfield int[] game.C_100277_nc.field_106704_M
		// @39C: iload #23
		// @39E: iaload
		// @39F: istore #24
		// @3A1: aload #5
		// @3A3: getfield int[] game.C_100277_nc.field_106701_B
		// @3A6: iload #23
		// @3A8: iaload
		// @3A9: istore #25
		// @3AB: aload #5
		// @3AD: getfield int[] game.C_100277_nc.field_106712_T
		// @3B0: iload #23
		// @3B2: iaload
		// @3B3: istore #26
		// @3B5: getstatic int[] game.C_100223_ab.field_106099_d
		// @3B8: iload #23
		// @3BA: iload #9
		// @3BC: iload #18
		// @3BE: iload #26
		// @3C0: imul
		// @3C1: iload #12
		// @3C3: iload #24
		// @3C5: imul
		// @3C6: iadd
		// @3C7: iload #25
		// @3C9: iload #15
		// @3CB: imul
		// @3CC: iadd
		// @3CD: ldc -847596112 (0xcd7ab5b0)
		// @3CF: ishr
		// @3D0: iadd
		// @3D1: iastore
		// @3D2: getstatic int[] game.C_100212_qc.field_105972_f
		// @3D5: iload #23
		// @3D7: iload #19
		// @3D9: iload #26
		// @3DB: imul
		// @3DC: iload #13
		// @3DE: iload #24
		// @3E0: imul
		// @3E1: iadd
		// @3E2: iload #25
		// @3E4: iload #16
		// @3E6: imul
		// @3E7: iadd
		// @3E8: ldc 1718152496 (0x6668ed30)
		// @3EA: ishr
		// @3EB: iload #10
		// @3ED: iadd
		// @3EE: iastore
		// @3EF: getstatic int[] game.C_100073_f.field_101716_s
		// @3F2: iload #23
		// @3F4: iload #11
		// @3F6: iload #26
		// @3F8: iload #20
		// @3FA: imul
		// @3FB: iload #17
		// @3FD: iload #25
		// @3FF: imul
		// @400: iadd
		// @401: iload #14
		// @403: iload #24
		// @405: imul
		// @406: iadd
		// @407: ldc 148540784 (0x8da8d70)
		// @409: ishr
		// @40A: ineg
		// @40B: isub
		// @40C: iastore
		// @40D: aload #5
		// @40F: getfield int[] game.C_100277_nc.field_106715_Q
		// @412: iload #23
		// @414: iaload
		// @415: istore #24
		// @417: aload #5
		// @419: getfield int[] game.C_100277_nc.field_106741_q
		// @41C: iload #23
		// @41E: iaload
		// @41F: istore #25
		// @421: aload #5
		// @423: getfield int[] game.C_100277_nc.field_106732_k
		// @426: iload #23
		// @428: iaload
		// @429: istore #26
		// @42B: getstatic int[] game.C_100320_hh.field_102920_O
		// @42E: iload #23
		// @430: iload #9
		// @432: iload #26
		// @434: iload #18
		// @436: imul
		// @437: iload #25
		// @439: iload #15
		// @43B: imul
		// @43C: iadd
		// @43D: iload #24
		// @43F: iload #12
		// @441: imul
		// @442: iadd
		// @443: ldc 945325168 (0x38588470)
		// @445: ishr
		// @446: ineg
		// @447: isub
		// @448: iastore
		// @449: getstatic int[] game.C_100082_uf.field_100373_c
		// @44C: iload #23
		// @44E: iload #16
		// @450: iload #25
		// @452: imul
		// @453: iload #13
		// @455: iload #24
		// @457: imul
		// @458: iload #19
		// @45A: iload #26
		// @45C: imul
		// @45D: iadd
		// @45E: iadd
		// @45F: ldc 73954384 (0x4687450)
		// @461: ishr
		// @462: iload #10
		// @464: iadd
		// @465: iastore
		// @466: getstatic int[] game.C_100286_nl.field_106809_a
		// @469: iload #23
		// @46B: iload #11
		// @46D: iload #24
		// @46F: iload #14
		// @471: imul
		// @472: iload #25
		// @474: iload #17
		// @476: imul
		// @477: ineg
		// @478: isub
		// @479: iload #26
		// @47B: iload #20
		// @47D: imul
		// @47E: iadd
		// @47F: ldc -1994918768 (0x8917f490)
		// @481: ishr
		// @482: ineg
		// @483: isub
		// @484: iastore
		// @485: aload #5
		// @487: getfield int[] game.C_100277_nc.field_106739_s
		// @48A: iload #23
		// @48C: iaload
		// @48D: istore #24
		// @48F: aload #5
		// @491: getfield int[] game.C_100277_nc.field_106727_n
		// @494: iload #23
		// @496: iaload
		// @497: istore #25
		// @499: aload #5
		// @49B: getfield int[] game.C_100277_nc.field_106725_c
		// @49E: iload #23
		// @4A0: iaload
		// @4A1: istore #26
		// @4A3: getstatic int[] game.C_100228_nn.field_106190_a
		// @4A6: iload #23
		// @4A8: iload #9
		// @4AA: iload #12
		// @4AC: iload #24
		// @4AE: imul
		// @4AF: iload #15
		// @4B1: iload #25
		// @4B3: imul
		// @4B4: iload #26
		// @4B6: iload #18
		// @4B8: imul
		// @4B9: iadd
		// @4BA: iadd
		// @4BB: ldc -115072112 (0xf9242390)
		// @4BD: ishr
		// @4BE: iadd
		// @4BF: iastore
		// @4C0: getstatic int[] game.C_100339_jb.field_107390_k
		// @4C3: iload #23
		// @4C5: iload #10
		// @4C7: iload #25
		// @4C9: iload #16
		// @4CB: imul
		// @4CC: iload #24
		// @4CE: iload #13
		// @4D0: imul
		// @4D1: iadd
		// @4D2: iload #19
		// @4D4: iload #26
		// @4D6: imul
		// @4D7: iadd
		// @4D8: ldc 1481264176 (0x584a4c30)
		// @4DA: ishr
		// @4DB: ineg
		// @4DC: isub
		// @4DD: iastore
		// @4DE: getstatic int[] game.C_100148_bh.field_101795_G
		// @4E1: iload #23
		// @4E3: iload #17
		// @4E5: iload #25
		// @4E7: imul
		// @4E8: iload #24
		// @4EA: iload #14
		// @4EC: imul
		// @4ED: iload #20
		// @4EF: iload #26
		// @4F1: imul
		// @4F2: iadd
		// @4F3: iadd
		// @4F4: ldc 1641456688 (0x61d6a430)
		// @4F6: ishr
		// @4F7: iload #11
		// @4F9: iadd
		// @4FA: iastore
		// @4FB: iinc #23 +1
		// @4FE: iload #30
		// @500: ifne @551
		// @503: iload #30
		// @505: ifeq @389
		// @508: goto @50C
		// @50B: athrow
		// @50C: iload #6
		// @50E: ifne @515
		// @511: goto @5E4
		// @514: athrow
		// @515: aload #4
		// @517: iconst_3
		// @518: iaload
		// @519: istore #9
		// @51B: aload #4
		// @51D: iconst_4
		// @51E: iaload
		// @51F: istore #10
		// @521: aload #4
		// @523: iconst_5
		// @524: iaload
		// @525: istore #11
		// @527: aload #4
		// @529: bipush 6 (0x06)
		// @52B: iaload
		// @52C: istore #12
		// @52E: aload #4
		// @530: bipush 7 (0x07)
		// @532: iaload
		// @533: istore #13
		// @535: aload #4
		// @537: bipush 8 (0x08)
		// @539: iaload
		// @53A: istore #14
		// @53C: aload #4
		// @53E: bipush 9 (0x09)
		// @540: iaload
		// @541: istore #15
		// @543: aload #4
		// @545: bipush 10 (0x0A)
		// @547: iaload
		// @548: istore #16
		// @54A: aload #4
		// @54C: bipush 11 (0x0B)
		// @54E: iaload
		// @54F: istore #17
		// @551: iconst_0
		// @552: istore #18
		// @554: iload #18
		// @556: iconst_m1
		// @557: ixor
		// @558: aload #5
		// @55A: getfield short game.C_100277_nc.field_106735_w
		// @55D: iconst_m1
		// @55E: ixor
		// @55F: if_icmple @5E4
		// @562: iload #18
		// @564: getstatic int[] game.C_100124_tn.field_104931_f
		// @567: arraylength
		// @568: if_icmpge @5E4
		// @56B: goto @56F
		// @56E: athrow
		// @56F: aload #5
		// @571: getfield short[] game.C_100277_nc.field_106697_E
		// @574: iload #18
		// @576: saload
		// @577: istore #19
		// @579: aload #5
		// @57B: getfield short[] game.C_100277_nc.field_106708_I
		// @57E: iload #18
		// @580: saload
		// @581: istore #20
		// @583: aload #5
		// @585: getfield short[] game.C_100277_nc.field_106731_j
		// @588: iload #18
		// @58A: saload
		// @58B: istore #21
		// @58D: getstatic int[] game.C_100124_tn.field_104931_f
		// @590: iload #18
		// @592: iload #21
		// @594: iload #15
		// @596: imul
		// @597: iload #20
		// @599: iload #12
		// @59B: imul
		// @59C: iload #19
		// @59E: iload #9
		// @5A0: imul
		// @5A1: iadd
		// @5A2: iadd
		// @5A3: ldc 1411622192 (0x5423a530)
		// @5A5: ishr
		// @5A6: iastore
		// @5A7: getstatic int[] game.C_100133_tk.field_105001_a
		// @5AA: iload #18
		// @5AC: iload #19
		// @5AE: iload #10
		// @5B0: imul
		// @5B1: iload #13
		// @5B3: iload #20
		// @5B5: imul
		// @5B6: iload #21
		// @5B8: iload #16
		// @5BA: imul
		// @5BB: ineg
		// @5BC: isub
		// @5BD: iadd
		// @5BE: ldc -444570064 (0xe5806630)
		// @5C0: ishr
		// @5C1: iastore
		// @5C2: getstatic int[] game.C_100116_ei.field_104120_d
		// @5C5: iload #18
		// @5C7: iload #17
		// @5C9: iload #21
		// @5CB: imul
		// @5CC: iload #14
		// @5CE: iload #20
		// @5D0: imul
		// @5D1: iload #11
		// @5D3: iload #19
		// @5D5: imul
		// @5D6: iadd
		// @5D7: iadd
		// @5D8: ldc -1191268848 (0xb8feae10)
		// @5DA: ishr
		// @5DB: iastore
		// @5DC: iinc #18 +1
		// @5DF: iload #30
		// @5E1: ifeq @554
		// @5E4: aload #5
		// @5E6: iload_0
		// @5E7: iload #8
		// @5E9: iload #7
		// @5EB: bipush -118 (0x8A)
		// @5ED: invokestatic game.C_100167_sj.func_100780_a(game.C_100277_nc, boolean, int, int, byte)void
		// @5F0: goto @683
		// @5F3: astore #7
		// @5F5: aload #7
		// @5F7: new java.lang.StringBuilder
		// @5FA: dup
		// @5FB: invokespecial java.lang.StringBuilder.<init>()void
		// @5FE: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @601: bipush 9 (0x09)
		// @603: aaload
		// @604: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @607: iload_0
		// @608: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @60B: bipush 44 (0x2C)
		// @60D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @610: aload_1
		// @611: ifnull @61D
		// @614: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @617: iconst_3
		// @618: aaload
		// @619: goto @622
		// @61C: athrow
		// @61D: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @620: iconst_1
		// @621: aaload
		// @622: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @625: bipush 44 (0x2C)
		// @627: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @62A: iload_2
		// @62B: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @62E: bipush 44 (0x2C)
		// @630: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @633: iload_3
		// @634: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @637: bipush 44 (0x2C)
		// @639: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @63C: aload #4
		// @63E: ifnull @64A
		// @641: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @644: iconst_3
		// @645: aaload
		// @646: goto @64F
		// @649: athrow
		// @64A: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @64D: iconst_1
		// @64E: aaload
		// @64F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @652: bipush 44 (0x2C)
		// @654: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @657: aload #5
		// @659: ifnull @665
		// @65C: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @65F: iconst_3
		// @660: aaload
		// @661: goto @66A
		// @664: athrow
		// @665: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @668: iconst_1
		// @669: aaload
		// @66A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @66D: bipush 44 (0x2C)
		// @66F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @672: iload #6
		// @674: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @677: bipush 41 (0x29)
		// @679: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @67C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @67F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @682: athrow
		// @683: return
	}
	
	static final int func_106752_a(int arg0)
	{
		// @00: getstatic game.C_100029_gn game.C_100085_a.field_102576_K
		// @03: getstatic int game.SteelSentinels.field_105273_M
		// @06: iconst_1
		// @07: getstatic int game.C_100231_oc.field_102196_Yb
		// @0A: sipush -2408 (0xF698)
		// @0D: invokevirtual game.C_100029_gn.func_102529_a(int, boolean, int, int)boolean
		// @10: pop
		// @11: iload_0
		// @12: sipush -18874 (0xB646)
		// @15: if_icmpeq @1B
		// @18: bipush -113 (0x8F)
		// @1A: ireturn
		// @1B: getstatic game.C_100029_gn game.C_100085_a.field_102576_K
		// @1E: sipush -708 (0xFD3C)
		// @21: invokevirtual game.C_100029_gn.func_103358_m(int)void
		// @24: bipush 64 (0x40)
		// @26: invokestatic game.C_100189_ri.func_105748_a(int)boolean
		// @29: ifeq @3E
		// @2C: getstatic game.C_100029_gn game.C_100085_a.field_102576_K
		// @2F: getstatic int game.C_100293_kj.field_106890_c
		// @32: getstatic char game.C_100012_fh.field_100517_Q
		// @35: iconst_1
		// @36: invokevirtual game.C_100029_gn.func_102511_a(int, char, boolean)boolean
		// @39: pop
		// @3A: goto @24
		// @3D: athrow
		// @3E: getstatic int game.C_100148_bh.field_101798_C
		// @41: iconst_m1
		// @42: ixor
		// @43: ifne @4A
		// @46: goto @55
		// @49: athrow
		// @4A: getstatic int game.C_100148_bh.field_101798_C
		// @4D: istore_1
		// @4E: iconst_1
		// @4F: iconst_m1
		// @50: invokestatic game.C_100152_bd.func_105184_a(boolean, int)void
		// @53: iload_1
		// @54: ireturn
		// @55: getstatic boolean game.C_100198_qn.field_105834_b
		// @58: ifne @5F
		// @5B: goto @61
		// @5E: athrow
		// @5F: iconst_3
		// @60: ireturn
		// @61: getstatic game.C_100068_vc game.C_100148_bh.field_101797_B
		// @64: getstatic game.C_100068_vc game.C_100191_rg.field_100845_o
		// @67: if_acmpne @6C
		// @6A: iconst_1
		// @6B: ireturn
		// @6C: getstatic game.C_100321_hi game.C_100106_ef.field_104753_e
		// @6F: bipush -2 (0xFE)
		// @71: invokevirtual game.C_100321_hi.func_107211_b(int)boolean
		// @74: ifne @79
		// @77: iconst_1
		// @78: ireturn
		// @79: getstatic game.C_100068_vc game.C_100148_bh.field_101797_B
		// @7C: getstatic game.C_100068_vc game.C_100222_aa.field_106086_a
		// @7F: if_acmpne @84
		// @82: iconst_2
		// @83: ireturn
		// @84: iconst_m1
		// @85: ireturn
		// @86: astore_1
		// @87: aload_1
		// @88: new java.lang.StringBuilder
		// @8B: dup
		// @8C: invokespecial java.lang.StringBuilder.<init>()void
		// @8F: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @92: iconst_4
		// @93: aaload
		// @94: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @97: iload_0
		// @98: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9B: bipush 41 (0x29)
		// @9D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A6: athrow
	}
	
	static final void func_106751_a(int arg0, int arg1, C_100187_rk arg2)
	{
		// @00: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @03: astore_3
		// @04: aload_3
		// @05: iload_0
		// @06: bipush 108 (0x6C)
		// @08: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @0B: aload_3
		// @0C: iload_1
		// @0D: sipush 7835 (0x1E9B)
		// @10: ixor
		// @11: iload_1
		// @12: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @15: aload_3
		// @16: sipush 7838 (0x1E9E)
		// @19: iconst_0
		// @1A: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @1D: aload_3
		// @1E: aload_2
		// @1F: getfield int game.C_100187_rk.field_100831_u
		// @22: bipush 99 (0x63)
		// @24: invokevirtual game.C_100278_nd.func_101141_d(int, byte)void
		// @27: aload_3
		// @28: iload_1
		// @29: sipush 7835 (0x1E9B)
		// @2C: ixor
		// @2D: aload_2
		// @2E: getfield int game.C_100187_rk.field_100833_s
		// @31: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @34: aload_3
		// @35: sipush 7838 (0x1E9E)
		// @38: aload_2
		// @39: getfield int game.C_100187_rk.field_100826_o
		// @3C: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @3F: goto @86
		// @42: astore_3
		// @43: aload_3
		// @44: new java.lang.StringBuilder
		// @47: dup
		// @48: invokespecial java.lang.StringBuilder.<init>()void
		// @4B: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @4E: iconst_5
		// @4F: aaload
		// @50: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @53: iload_0
		// @54: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @57: bipush 44 (0x2C)
		// @59: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C: iload_1
		// @5D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @60: bipush 44 (0x2C)
		// @62: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @65: aload_2
		// @66: ifnull @72
		// @69: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @6C: iconst_3
		// @6D: aaload
		// @6E: goto @77
		// @71: athrow
		// @72: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @75: iconst_1
		// @76: aaload
		// @77: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7A: bipush 41 (0x29)
		// @7C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @82: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @85: athrow
		// @86: return
	}
	
	final C_100073_f func_106754_a(int arg0, int arg1)
	{
		// @00: iload_2
		// @01: bipush 6 (0x06)
		// @03: if_icmpeq @14
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: bipush -122 (0x86)
		// @0C: invokestatic game.C_100283_ni.func_106753_a(java.lang.String, int)game.C_100130_tf
		// @0F: pop
		// @10: goto @14
		// @13: athrow
		// @14: aload_0
		// @15: getfield game.C_100318_hj game.C_100283_ni.field_106758_e
		// @18: iload_1
		// @19: i2l
		// @1A: iconst_0
		// @1B: invokevirtual game.C_100318_hj.func_107190_a(long, int)java.lang.Object
		// @1E: checkcast game.C_100073_f
		// @21: astore_3
		// @22: aload_3
		// @23: ifnull @28
		// @26: aload_3
		// @27: areturn
		// @28: iload_1
		// @29: iconst_m1
		// @2A: ixor
		// @2B: ldc -32769 (0xffff7fff)
		// @2D: if_icmpgt @46
		// @30: aload_0
		// @31: getfield game.C_100098_h game.C_100283_ni.field_106761_a
		// @34: iconst_0
		// @35: iconst_0
		// @36: sipush 32767 (0x7FFF)
		// @39: iload_1
		// @3A: iand
		// @3B: invokevirtual game.C_100098_h.func_104610_b(int, int, int)byte[]
		// @3E: astore #4
		// @40: getstatic int game.SteelSentinels.field_105275_O
		// @43: ifeq @52
		// @46: aload_0
		// @47: getfield game.C_100098_h game.C_100283_ni.field_106757_d
		// @4A: iconst_0
		// @4B: iconst_0
		// @4C: iload_1
		// @4D: invokevirtual game.C_100098_h.func_104610_b(int, int, int)byte[]
		// @50: astore #4
		// @52: new game.C_100073_f
		// @55: dup
		// @56: invokespecial game.C_100073_f.<init>()void
		// @59: astore_3
		// @5A: aconst_null
		// @5B: aload #4
		// @5D: if_acmpeq @75
		// @60: aload_3
		// @61: iload_2
		// @62: bipush 105 (0x69)
		// @64: iadd
		// @65: new game.C_100280_nf
		// @68: dup
		// @69: aload #4
		// @6B: invokespecial game.C_100280_nf.<init>(byte[])void
		// @6E: invokevirtual game.C_100073_f.func_101706_a(int, game.C_100280_nf)void
		// @71: goto @75
		// @74: athrow
		// @75: ldc -32769 (0xffff7fff)
		// @77: iload_1
		// @78: iconst_m1
		// @79: ixor
		// @7A: if_icmplt @87
		// @7D: aload_3
		// @7E: bipush -107 (0x95)
		// @80: invokevirtual game.C_100073_f.func_101705_d(byte)void
		// @83: goto @87
		// @86: athrow
		// @87: aload_0
		// @88: getfield game.C_100318_hj game.C_100283_ni.field_106758_e
		// @8B: aload_3
		// @8C: iload_2
		// @8D: bipush -6 (0xFA)
		// @8F: iadd
		// @90: iload_1
		// @91: i2l
		// @92: invokevirtual game.C_100318_hj.func_107183_a(java.lang.Object, int, long)void
		// @95: aload_3
		// @96: areturn
		// @97: astore_3
		// @98: aload_3
		// @99: new java.lang.StringBuilder
		// @9C: dup
		// @9D: invokespecial java.lang.StringBuilder.<init>()void
		// @A0: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @A3: bipush 7 (0x07)
		// @A5: aaload
		// @A6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A9: iload_1
		// @AA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AD: bipush 44 (0x2C)
		// @AF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B2: iload_2
		// @B3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B6: bipush 41 (0x29)
		// @B8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @BE: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C1: athrow
	}
	
	C_100283_ni(int arg0, C_100098_h arg1, C_100098_h arg2)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: new game.C_100318_hj
		// @08: dup
		// @09: bipush 64 (0x40)
		// @0B: invokespecial game.C_100318_hj.<init>(int)void
		// @0E: putfield game.C_100318_hj game.C_100283_ni.field_106758_e
		// @11: aload_0
		// @12: aload_2
		// @13: putfield game.C_100098_h game.C_100283_ni.field_106757_d
		// @16: aload_0
		// @17: aload_3
		// @18: putfield game.C_100098_h game.C_100283_ni.field_106761_a
		// @1B: aconst_null
		// @1C: aload_0
		// @1D: getfield game.C_100098_h game.C_100283_ni.field_106757_d
		// @20: if_acmpeq @2E
		// @23: aload_0
		// @24: getfield game.C_100098_h game.C_100283_ni.field_106757_d
		// @27: bipush 55 (0x37)
		// @29: iconst_0
		// @2A: invokevirtual game.C_100098_h.func_104591_c(int, int)int
		// @2D: pop
		// @2E: aload_0
		// @2F: getfield game.C_100098_h game.C_100283_ni.field_106761_a
		// @32: ifnull @44
		// @35: aload_0
		// @36: getfield game.C_100098_h game.C_100283_ni.field_106761_a
		// @39: bipush 70 (0x46)
		// @3B: iconst_0
		// @3C: invokevirtual game.C_100098_h.func_104591_c(int, int)int
		// @3F: pop
		// @40: goto @44
		// @43: athrow
		// @44: goto @9E
		// @47: astore #4
		// @49: aload #4
		// @4B: new java.lang.StringBuilder
		// @4E: dup
		// @4F: invokespecial java.lang.StringBuilder.<init>()void
		// @52: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @55: iconst_2
		// @56: aaload
		// @57: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5A: iload_1
		// @5B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5E: bipush 44 (0x2C)
		// @60: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @63: aload_2
		// @64: ifnull @70
		// @67: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @6A: iconst_3
		// @6B: aaload
		// @6C: goto @75
		// @6F: athrow
		// @70: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @73: iconst_1
		// @74: aaload
		// @75: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @78: bipush 44 (0x2C)
		// @7A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7D: aload_3
		// @7E: ifnull @8A
		// @81: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @84: iconst_3
		// @85: aaload
		// @86: goto @8F
		// @89: athrow
		// @8A: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @8D: iconst_1
		// @8E: aaload
		// @8F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @92: bipush 41 (0x29)
		// @94: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @97: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9D: athrow
		// @9E: return
	}
	
	static final void func_106747_b(int arg0)
	{
		// @00: getstatic game.C_100202_qi game.C_100312_ld.field_107159_h
		// @03: bipush 44 (0x2C)
		// @05: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @08: checkcast game.C_100125_tm
		// @0B: astore_1
		// @0C: aload_1
		// @0D: ifnull @14
		// @10: goto @1B
		// @13: athrow
		// @14: sipush 13313 (0x3401)
		// @17: invokestatic game.C_100095_fe.func_103371_l(int)void
		// @1A: return
		// @1B: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @1E: astore_2
		// @1F: aload_2
		// @20: sipush -1543 (0xF9F9)
		// @23: invokevirtual game.C_100278_nd.func_101171_e(int)int
		// @26: pop
		// @27: aload_2
		// @28: sipush -1543 (0xF9F9)
		// @2B: invokevirtual game.C_100278_nd.func_101171_e(int)int
		// @2E: pop
		// @2F: aload_2
		// @30: sipush -1543 (0xF9F9)
		// @33: invokevirtual game.C_100278_nd.func_101171_e(int)int
		// @36: pop
		// @37: bipush -20 (0xEC)
		// @39: iconst_4
		// @3A: iload_0
		// @3B: isub
		// @3C: bipush 41 (0x29)
		// @3E: idiv
		// @3F: irem
		// @40: istore_3
		// @41: aload_2
		// @42: sipush -1543 (0xF9F9)
		// @45: invokevirtual game.C_100278_nd.func_101171_e(int)int
		// @48: pop
		// @49: aload_1
		// @4A: bipush 45 (0x2D)
		// @4C: invokevirtual game.C_100125_tm.func_100583_c(int)void
		// @4F: goto @73
		// @52: astore_1
		// @53: aload_1
		// @54: new java.lang.StringBuilder
		// @57: dup
		// @58: invokespecial java.lang.StringBuilder.<init>()void
		// @5B: getstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @5E: iconst_0
		// @5F: aaload
		// @60: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @63: iload_0
		// @64: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @67: bipush 41 (0x29)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @72: athrow
		// @73: return
	}
	
	static
	{
		// @00: bipush 10 (0x0A)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "0\u0010\\\u000f\u0011"
		// @09: invokestatic game.C_100283_ni.func_106750_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100283_ni.func_106749_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "0\u000c\u001e\""
		// @14: invokestatic game.C_100283_ni.func_106750_z(java.lang.String)char[]
		// @17: invokestatic game.C_100283_ni.func_106749_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "0\u0010\\rP0\u0010\u0006p\u0011"
		// @1F: invokestatic game.C_100283_ni.func_106750_z(java.lang.String)char[]
		// @22: invokestatic game.C_100283_ni.func_106749_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "%W\\`D"
		// @2A: invokestatic game.C_100283_ni.func_106750_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100283_ni.func_106749_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "0\u0010\\\u0008\u0011"
		// @35: invokestatic game.C_100283_ni.func_106750_z(java.lang.String)char[]
		// @38: invokestatic game.C_100283_ni.func_106749_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "0\u0010\\\r\u0011"
		// @40: invokestatic game.C_100283_ni.func_106750_z(java.lang.String)char[]
		// @43: invokestatic game.C_100283_ni.func_106749_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "0\u0010\\\t\u0011"
		// @4C: invokestatic game.C_100283_ni.func_106750_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100283_ni.func_106749_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "0\u0010\\\u000c\u0011"
		// @58: invokestatic game.C_100283_ni.func_106750_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100283_ni.func_106749_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "0\u0010\\\n\u0011"
		// @64: invokestatic game.C_100283_ni.func_106750_z(java.lang.String)char[]
		// @67: invokestatic game.C_100283_ni.func_106749_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "0\u0010\\\u000b\u0011"
		// @70: invokestatic game.C_100283_ni.func_106750_z(java.lang.String)char[]
		// @73: invokestatic game.C_100283_ni.func_106749_z(char[])java.lang.String
		// @76: aastore
		// @77: putstatic java.lang.String[] game.C_100283_ni.field_106762_z
		// @7A: iconst_3
		// @7B: anewarray java.lang.String
		// @7E: dup
		// @7F: iconst_0
		// @80: ldc "\u001f\u0015\u001enJ=\u0016\u0000+J"
		// @82: invokestatic game.C_100283_ni.func_106750_z(java.lang.String)char[]
		// @85: invokestatic game.C_100283_ni.func_106749_z(char[])java.lang.String
		// @88: aastore
		// @89: dup
		// @8A: iconst_1
		// @8B: ldc "\u0013\u0000R=Z1\u000b\u0017="
		// @8D: invokestatic game.C_100283_ni.func_106750_z(java.lang.String)char[]
		// @90: invokestatic game.C_100283_ni.func_106749_z(char[])java.lang.String
		// @93: aastore
		// @94: dup
		// @95: iconst_2
		// @96: ldc "\u001c\u001c\u0001:\u0019;\u0018\u0011&"
		// @98: invokestatic game.C_100283_ni.func_106750_z(java.lang.String)char[]
		// @9B: invokestatic game.C_100283_ni.func_106749_z(char[])java.lang.String
		// @9E: aastore
		// @9F: putstatic java.lang.String[] game.C_100283_ni.field_106756_g
		// @A2: return
	}
	
	private static char[] func_106750_z(String arg0)
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
		// @0E: bipush 57 (0x39)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_106749_z(char[] arg0)
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
		// @30: bipush 94 (0x5E)
		// @32: goto @46
		// @35: bipush 121 (0x79)
		// @37: goto @46
		// @3A: bipush 114 (0x72)
		// @3C: goto @46
		// @3F: bipush 78 (0x4E)
		// @41: goto @46
		// @44: bipush 57 (0x39)
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
