package game;

import java.awt.Component;

final class C_100251_pm extends C_100037_wb
{
	final void func_102365_c(int arg0, int arg1)
	{
		// @000: iload_1
		// @001: aload_0
		// @002: getfield int game.C_100251_pm.field_102335_w
		// @005: iadd
		// @006: istore_1
		// @007: iload_2
		// @008: aload_0
		// @009: getfield int game.C_100251_pm.field_102340_z
		// @00C: aload_0
		// @00D: getfield int game.C_100251_pm.field_102337_u
		// @010: isub
		// @011: aload_0
		// @012: getfield int game.C_100251_pm.field_102332_H
		// @015: isub
		// @016: iadd
		// @017: istore_2
		// @018: iload_1
		// @019: iload_2
		// @01A: aload_0
		// @01B: getfield int game.C_100251_pm.field_102337_u
		// @01E: iadd
		// @01F: iconst_1
		// @020: isub
		// @021: getstatic int game.C_100196_rb.field_105819_e
		// @024: imul
		// @025: iadd
		// @026: istore_3
		// @027: iconst_0
		// @028: istore #4
		// @02A: aload_0
		// @02B: getfield int game.C_100251_pm.field_102337_u
		// @02E: istore #5
		// @030: aload_0
		// @031: getfield int game.C_100251_pm.field_102339_s
		// @034: istore #6
		// @036: getstatic int game.C_100196_rb.field_105819_e
		// @039: ineg
		// @03A: iload #6
		// @03C: isub
		// @03D: istore #7
		// @03F: iconst_0
		// @040: istore #8
		// @042: iload_2
		// @043: getstatic int game.C_100196_rb.field_105816_f
		// @046: if_icmpge @057
		// @049: iload #5
		// @04B: getstatic int game.C_100196_rb.field_105816_f
		// @04E: iload_2
		// @04F: isub
		// @050: isub
		// @051: istore #5
		// @053: getstatic int game.C_100196_rb.field_105816_f
		// @056: istore_2
		// @057: iload_2
		// @058: iload #5
		// @05A: iadd
		// @05B: getstatic int game.C_100196_rb.field_105823_l
		// @05E: if_icmple @085
		// @061: iload_2
		// @062: iload #5
		// @064: iadd
		// @065: getstatic int game.C_100196_rb.field_105823_l
		// @068: isub
		// @069: istore #9
		// @06B: iload #5
		// @06D: iload #9
		// @06F: isub
		// @070: istore #5
		// @072: iload_3
		// @073: iload #9
		// @075: getstatic int game.C_100196_rb.field_105819_e
		// @078: imul
		// @079: isub
		// @07A: istore_3
		// @07B: iload #4
		// @07D: iload #9
		// @07F: iload #6
		// @081: imul
		// @082: iadd
		// @083: istore #4
		// @085: iload_1
		// @086: getstatic int game.C_100196_rb.field_105827_i
		// @089: if_icmpge @0B8
		// @08C: getstatic int game.C_100196_rb.field_105827_i
		// @08F: iload_1
		// @090: isub
		// @091: istore #9
		// @093: iload #6
		// @095: iload #9
		// @097: isub
		// @098: istore #6
		// @09A: getstatic int game.C_100196_rb.field_105827_i
		// @09D: istore_1
		// @09E: iload #4
		// @0A0: iload #9
		// @0A2: iadd
		// @0A3: istore #4
		// @0A5: iload_3
		// @0A6: iload #9
		// @0A8: iadd
		// @0A9: istore_3
		// @0AA: iload #8
		// @0AC: iload #9
		// @0AE: iadd
		// @0AF: istore #8
		// @0B1: iload #7
		// @0B3: iload #9
		// @0B5: iadd
		// @0B6: istore #7
		// @0B8: iload_1
		// @0B9: iload #6
		// @0BB: iadd
		// @0BC: getstatic int game.C_100196_rb.field_105820_b
		// @0BF: if_icmple @0E1
		// @0C2: iload_1
		// @0C3: iload #6
		// @0C5: iadd
		// @0C6: getstatic int game.C_100196_rb.field_105820_b
		// @0C9: isub
		// @0CA: istore #9
		// @0CC: iload #6
		// @0CE: iload #9
		// @0D0: isub
		// @0D1: istore #6
		// @0D3: iload #8
		// @0D5: iload #9
		// @0D7: iadd
		// @0D8: istore #8
		// @0DA: iload #7
		// @0DC: iload #9
		// @0DE: iadd
		// @0DF: istore #7
		// @0E1: iload #6
		// @0E3: ifle @0EB
		// @0E6: iload #5
		// @0E8: ifgt @0EC
		// @0EB: return
		// @0EC: getstatic int[] game.C_100196_rb.field_105818_d
		// @0EF: aload_0
		// @0F0: getfield int[] game.C_100251_pm.field_102388_J
		// @0F3: iconst_0
		// @0F4: iload #4
		// @0F6: iload_3
		// @0F7: iload #6
		// @0F9: iload #5
		// @0FB: iload #7
		// @0FD: iload #8
		// @0FF: invokestatic game.C_100251_pm.func_102391_e(int[], int[], int, int, int, int, int, int, int)void
		// @102: return
	}
	
	final void func_102383_f(int arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100251_pm.field_102335_w
		// @05: iadd
		// @06: istore_1
		// @07: iload_2
		// @08: aload_0
		// @09: getfield int game.C_100251_pm.field_102332_H
		// @0C: iadd
		// @0D: istore_2
		// @0E: iload_1
		// @0F: iload_2
		// @10: getstatic int game.C_100196_rb.field_105819_e
		// @13: imul
		// @14: iadd
		// @15: istore #4
		// @17: iconst_0
		// @18: istore #5
		// @1A: aload_0
		// @1B: getfield int game.C_100251_pm.field_102337_u
		// @1E: istore #6
		// @20: aload_0
		// @21: getfield int game.C_100251_pm.field_102339_s
		// @24: istore #7
		// @26: getstatic int game.C_100196_rb.field_105819_e
		// @29: iload #7
		// @2B: isub
		// @2C: istore #8
		// @2E: iconst_0
		// @2F: istore #9
		// @31: iload_2
		// @32: getstatic int game.C_100196_rb.field_105816_f
		// @35: if_icmpge @5F
		// @38: getstatic int game.C_100196_rb.field_105816_f
		// @3B: iload_2
		// @3C: isub
		// @3D: istore #10
		// @3F: iload #6
		// @41: iload #10
		// @43: isub
		// @44: istore #6
		// @46: getstatic int game.C_100196_rb.field_105816_f
		// @49: istore_2
		// @4A: iload #5
		// @4C: iload #10
		// @4E: iload #7
		// @50: imul
		// @51: iadd
		// @52: istore #5
		// @54: iload #4
		// @56: iload #10
		// @58: getstatic int game.C_100196_rb.field_105819_e
		// @5B: imul
		// @5C: iadd
		// @5D: istore #4
		// @5F: iload_2
		// @60: iload #6
		// @62: iadd
		// @63: getstatic int game.C_100196_rb.field_105823_l
		// @66: if_icmple @76
		// @69: iload #6
		// @6B: iload_2
		// @6C: iload #6
		// @6E: iadd
		// @6F: getstatic int game.C_100196_rb.field_105823_l
		// @72: isub
		// @73: isub
		// @74: istore #6
		// @76: iload_1
		// @77: getstatic int game.C_100196_rb.field_105827_i
		// @7A: if_icmpge @AB
		// @7D: getstatic int game.C_100196_rb.field_105827_i
		// @80: iload_1
		// @81: isub
		// @82: istore #10
		// @84: iload #7
		// @86: iload #10
		// @88: isub
		// @89: istore #7
		// @8B: getstatic int game.C_100196_rb.field_105827_i
		// @8E: istore_1
		// @8F: iload #5
		// @91: iload #10
		// @93: iadd
		// @94: istore #5
		// @96: iload #4
		// @98: iload #10
		// @9A: iadd
		// @9B: istore #4
		// @9D: iload #9
		// @9F: iload #10
		// @A1: iadd
		// @A2: istore #9
		// @A4: iload #8
		// @A6: iload #10
		// @A8: iadd
		// @A9: istore #8
		// @AB: iload_1
		// @AC: iload #7
		// @AE: iadd
		// @AF: getstatic int game.C_100196_rb.field_105820_b
		// @B2: if_icmple @D4
		// @B5: iload_1
		// @B6: iload #7
		// @B8: iadd
		// @B9: getstatic int game.C_100196_rb.field_105820_b
		// @BC: isub
		// @BD: istore #10
		// @BF: iload #7
		// @C1: iload #10
		// @C3: isub
		// @C4: istore #7
		// @C6: iload #9
		// @C8: iload #10
		// @CA: iadd
		// @CB: istore #9
		// @CD: iload #8
		// @CF: iload #10
		// @D1: iadd
		// @D2: istore #8
		// @D4: iload #7
		// @D6: ifle @DE
		// @D9: iload #6
		// @DB: ifgt @DF
		// @DE: return
		// @DF: getstatic int[] game.C_100196_rb.field_105818_d
		// @E2: aload_0
		// @E3: getfield int[] game.C_100251_pm.field_102388_J
		// @E6: iconst_0
		// @E7: iload #5
		// @E9: iload #4
		// @EB: iconst_0
		// @EC: iconst_0
		// @ED: iload #7
		// @EF: iload #6
		// @F1: iload #8
		// @F3: iload #9
		// @F5: iload_3
		// @F6: invokestatic game.C_100251_pm.func_102393_d(int[], int[], int, int, int, int, int, int, int, int, int, int)void
		// @F9: return
	}
	
	C_100251_pm(byte[] arg0, Component arg1)
	{
		// @0: aload_0
		// @1: aload_1
		// @2: aload_2
		// @3: invokespecial game.C_100037_wb.<init>(byte[], java.awt.Component)void
		// @6: return
	}
	
	final void func_102378_b(int arg0, int arg1)
	{
		// @000: aload_0
		// @001: getfield int game.C_100251_pm.field_102339_s
		// @004: iconst_2
		// @005: ishr
		// @006: istore_3
		// @007: aload_0
		// @008: getfield int game.C_100251_pm.field_102337_u
		// @00B: iconst_2
		// @00C: ishr
		// @00D: istore #4
		// @00F: iload_1
		// @010: aload_0
		// @011: getfield int game.C_100251_pm.field_102335_w
		// @014: iconst_4
		// @015: idiv
		// @016: iadd
		// @017: istore_1
		// @018: iload_2
		// @019: aload_0
		// @01A: getfield int game.C_100251_pm.field_102332_H
		// @01D: iconst_4
		// @01E: idiv
		// @01F: iadd
		// @020: istore_2
		// @021: iload_1
		// @022: getstatic int game.C_100196_rb.field_105827_i
		// @025: if_icmpge @032
		// @028: getstatic int game.C_100196_rb.field_105827_i
		// @02B: iload_1
		// @02C: isub
		// @02D: iconst_2
		// @02E: ishl
		// @02F: goto @033
		// @032: iconst_0
		// @033: istore #5
		// @035: iload_1
		// @036: iload_3
		// @037: iadd
		// @038: getstatic int game.C_100196_rb.field_105820_b
		// @03B: if_icmple @04A
		// @03E: getstatic int game.C_100196_rb.field_105820_b
		// @041: iload_1
		// @042: isub
		// @043: iconst_2
		// @044: ishl
		// @045: iconst_4
		// @046: isub
		// @047: goto @050
		// @04A: aload_0
		// @04B: getfield int game.C_100251_pm.field_102339_s
		// @04E: iconst_4
		// @04F: isub
		// @050: istore #6
		// @052: iload_2
		// @053: getstatic int game.C_100196_rb.field_105816_f
		// @056: if_icmpge @063
		// @059: getstatic int game.C_100196_rb.field_105816_f
		// @05C: iload_2
		// @05D: isub
		// @05E: iconst_2
		// @05F: ishl
		// @060: goto @064
		// @063: iconst_0
		// @064: istore #7
		// @066: iload_2
		// @067: iload #4
		// @069: iadd
		// @06A: getstatic int game.C_100196_rb.field_105823_l
		// @06D: if_icmple @07C
		// @070: getstatic int game.C_100196_rb.field_105823_l
		// @073: iload_2
		// @074: isub
		// @075: iconst_2
		// @076: ishl
		// @077: iconst_4
		// @078: isub
		// @079: goto @082
		// @07C: aload_0
		// @07D: getfield int game.C_100251_pm.field_102337_u
		// @080: iconst_4
		// @081: isub
		// @082: istore #8
		// @084: bipush 16 (0x10)
		// @086: newarray int[]
		// @088: astore #9
		// @08A: iload #7
		// @08C: istore #10
		// @08E: iload #10
		// @090: iload #8
		// @092: if_icmpgt @1CF
		// @095: iload #5
		// @097: istore #11
		// @099: iload #11
		// @09B: iload #6
		// @09D: if_icmpgt @1C9
		// @0A0: iload #10
		// @0A2: aload_0
		// @0A3: getfield int game.C_100251_pm.field_102339_s
		// @0A6: imul
		// @0A7: iload #11
		// @0A9: iadd
		// @0AA: istore #12
		// @0AC: iload_2
		// @0AD: iload #10
		// @0AF: iconst_2
		// @0B0: ishr
		// @0B1: iadd
		// @0B2: getstatic int game.C_100196_rb.field_105819_e
		// @0B5: imul
		// @0B6: iload_1
		// @0B7: iload #11
		// @0B9: iconst_2
		// @0BA: ishr
		// @0BB: iadd
		// @0BC: iadd
		// @0BD: istore #13
		// @0BF: iconst_0
		// @0C0: istore #14
		// @0C2: iload #14
		// @0C4: iconst_4
		// @0C5: if_icmpge @0F9
		// @0C8: iconst_0
		// @0C9: istore #15
		// @0CB: iload #15
		// @0CD: iconst_4
		// @0CE: if_icmpge @0F3
		// @0D1: aload #9
		// @0D3: iload #14
		// @0D5: iconst_2
		// @0D6: ishl
		// @0D7: iload #15
		// @0D9: iadd
		// @0DA: aload_0
		// @0DB: getfield int[] game.C_100251_pm.field_102388_J
		// @0DE: iload #12
		// @0E0: iload #14
		// @0E2: aload_0
		// @0E3: getfield int game.C_100251_pm.field_102339_s
		// @0E6: imul
		// @0E7: iadd
		// @0E8: iload #15
		// @0EA: iadd
		// @0EB: iaload
		// @0EC: iastore
		// @0ED: iinc #15 +1
		// @0F0: goto @0CB
		// @0F3: iinc #14 +1
		// @0F6: goto @0C2
		// @0F9: iconst_0
		// @0FA: istore #14
		// @0FC: iconst_0
		// @0FD: istore #15
		// @0FF: iconst_0
		// @100: istore #16
		// @102: iconst_0
		// @103: istore #17
		// @105: iconst_0
		// @106: istore #18
		// @108: iconst_0
		// @109: istore #19
		// @10B: iload #19
		// @10D: bipush 16 (0x10)
		// @10F: if_icmpge @162
		// @112: aload #9
		// @114: iload #19
		// @116: iaload
		// @117: bipush 24 (0x18)
		// @119: iushr
		// @11A: istore #14
		// @11C: iload #15
		// @11E: iload #14
		// @120: iadd
		// @121: istore #15
		// @123: iload #16
		// @125: iload #14
		// @127: aload #9
		// @129: iload #19
		// @12B: iaload
		// @12C: bipush 16 (0x10)
		// @12E: ishr
		// @12F: sipush 255 (0x00FF)
		// @132: iand
		// @133: imul
		// @134: iadd
		// @135: istore #16
		// @137: iload #17
		// @139: iload #14
		// @13B: aload #9
		// @13D: iload #19
		// @13F: iaload
		// @140: bipush 8 (0x08)
		// @142: ishr
		// @143: sipush 255 (0x00FF)
		// @146: iand
		// @147: imul
		// @148: iadd
		// @149: istore #17
		// @14B: iload #18
		// @14D: iload #14
		// @14F: aload #9
		// @151: iload #19
		// @153: iaload
		// @154: sipush 255 (0x00FF)
		// @157: iand
		// @158: imul
		// @159: iadd
		// @15A: istore #18
		// @15C: iinc #19 +1
		// @15F: goto @10B
		// @162: iload #15
		// @164: ifeq @1C3
		// @167: iload #16
		// @169: iload #15
		// @16B: idiv
		// @16C: bipush 16 (0x10)
		// @16E: ishl
		// @16F: iload #18
		// @171: iload #15
		// @173: idiv
		// @174: iadd
		// @175: istore #16
		// @177: iload #17
		// @179: iload #15
		// @17B: idiv
		// @17C: bipush 8 (0x08)
		// @17E: ishl
		// @17F: istore #17
		// @181: iload #15
		// @183: iconst_4
		// @184: ishr
		// @185: istore #19
		// @187: sipush 256 (0x0100)
		// @18A: iload #19
		// @18C: isub
		// @18D: istore #20
		// @18F: getstatic int[] game.C_100196_rb.field_105818_d
		// @192: iload #13
		// @194: iaload
		// @195: istore #21
		// @197: getstatic int[] game.C_100196_rb.field_105818_d
		// @19A: iload #13
		// @19C: iload #19
		// @19E: iload #16
		// @1A0: imul
		// @1A1: iload #20
		// @1A3: iload #21
		// @1A5: ldc 16711935 (0xff00ff)
		// @1A7: iand
		// @1A8: imul
		// @1A9: iadd
		// @1AA: ldc -16711936 (0xff00ff00)
		// @1AC: iand
		// @1AD: iload #19
		// @1AF: iload #17
		// @1B1: imul
		// @1B2: iload #20
		// @1B4: iload #21
		// @1B6: ldc 65280 (0xff00)
		// @1B8: iand
		// @1B9: imul
		// @1BA: iadd
		// @1BB: ldc 16711680 (0xff0000)
		// @1BD: iand
		// @1BE: iadd
		// @1BF: bipush 8 (0x08)
		// @1C1: iushr
		// @1C2: iastore
		// @1C3: iinc #11 +4
		// @1C6: goto @099
		// @1C9: iinc #10 +4
		// @1CC: goto @08E
		// @1CF: return
	}
	
	final void func_102364_d(int arg0, int arg1, int arg2, int arg3)
	{
		// @000: iload_3
		// @001: ifle @009
		// @004: iload #4
		// @006: ifgt @00A
		// @009: return
		// @00A: aload_0
		// @00B: getfield int game.C_100251_pm.field_102339_s
		// @00E: istore #5
		// @010: aload_0
		// @011: getfield int game.C_100251_pm.field_102337_u
		// @014: istore #6
		// @016: iconst_0
		// @017: istore #7
		// @019: iconst_0
		// @01A: istore #8
		// @01C: aload_0
		// @01D: getfield int game.C_100251_pm.field_102341_y
		// @020: istore #9
		// @022: aload_0
		// @023: getfield int game.C_100251_pm.field_102340_z
		// @026: istore #10
		// @028: iload #9
		// @02A: bipush 16 (0x10)
		// @02C: ishl
		// @02D: iload_3
		// @02E: idiv
		// @02F: istore #11
		// @031: iload #10
		// @033: bipush 16 (0x10)
		// @035: ishl
		// @036: iload #4
		// @038: idiv
		// @039: istore #12
		// @03B: aload_0
		// @03C: getfield int game.C_100251_pm.field_102335_w
		// @03F: ifle @06A
		// @042: aload_0
		// @043: getfield int game.C_100251_pm.field_102335_w
		// @046: bipush 16 (0x10)
		// @048: ishl
		// @049: iload #11
		// @04B: iadd
		// @04C: iconst_1
		// @04D: isub
		// @04E: iload #11
		// @050: idiv
		// @051: istore #13
		// @053: iload_1
		// @054: iload #13
		// @056: iadd
		// @057: istore_1
		// @058: iload #7
		// @05A: iload #13
		// @05C: iload #11
		// @05E: imul
		// @05F: aload_0
		// @060: getfield int game.C_100251_pm.field_102335_w
		// @063: bipush 16 (0x10)
		// @065: ishl
		// @066: isub
		// @067: iadd
		// @068: istore #7
		// @06A: aload_0
		// @06B: getfield int game.C_100251_pm.field_102332_H
		// @06E: ifle @099
		// @071: aload_0
		// @072: getfield int game.C_100251_pm.field_102332_H
		// @075: bipush 16 (0x10)
		// @077: ishl
		// @078: iload #12
		// @07A: iadd
		// @07B: iconst_1
		// @07C: isub
		// @07D: iload #12
		// @07F: idiv
		// @080: istore #13
		// @082: iload_2
		// @083: iload #13
		// @085: iadd
		// @086: istore_2
		// @087: iload #8
		// @089: iload #13
		// @08B: iload #12
		// @08D: imul
		// @08E: aload_0
		// @08F: getfield int game.C_100251_pm.field_102332_H
		// @092: bipush 16 (0x10)
		// @094: ishl
		// @095: isub
		// @096: iadd
		// @097: istore #8
		// @099: iload #5
		// @09B: iload #9
		// @09D: if_icmpge @0B1
		// @0A0: iload #5
		// @0A2: bipush 16 (0x10)
		// @0A4: ishl
		// @0A5: iload #7
		// @0A7: isub
		// @0A8: iload #11
		// @0AA: iadd
		// @0AB: iconst_1
		// @0AC: isub
		// @0AD: iload #11
		// @0AF: idiv
		// @0B0: istore_3
		// @0B1: iload #6
		// @0B3: iload #10
		// @0B5: if_icmpge @0CA
		// @0B8: iload #6
		// @0BA: bipush 16 (0x10)
		// @0BC: ishl
		// @0BD: iload #8
		// @0BF: isub
		// @0C0: iload #12
		// @0C2: iadd
		// @0C3: iconst_1
		// @0C4: isub
		// @0C5: iload #12
		// @0C7: idiv
		// @0C8: istore #4
		// @0CA: iload_1
		// @0CB: iload_2
		// @0CC: getstatic int game.C_100196_rb.field_105819_e
		// @0CF: imul
		// @0D0: iadd
		// @0D1: istore #13
		// @0D3: getstatic int game.C_100196_rb.field_105819_e
		// @0D6: iload_3
		// @0D7: isub
		// @0D8: istore #14
		// @0DA: iload_2
		// @0DB: iload #4
		// @0DD: iadd
		// @0DE: getstatic int game.C_100196_rb.field_105823_l
		// @0E1: if_icmple @0F1
		// @0E4: iload #4
		// @0E6: iload_2
		// @0E7: iload #4
		// @0E9: iadd
		// @0EA: getstatic int game.C_100196_rb.field_105823_l
		// @0ED: isub
		// @0EE: isub
		// @0EF: istore #4
		// @0F1: iload_2
		// @0F2: getstatic int game.C_100196_rb.field_105816_f
		// @0F5: if_icmpge @11B
		// @0F8: getstatic int game.C_100196_rb.field_105816_f
		// @0FB: iload_2
		// @0FC: isub
		// @0FD: istore #15
		// @0FF: iload #4
		// @101: iload #15
		// @103: isub
		// @104: istore #4
		// @106: iload #13
		// @108: iload #15
		// @10A: getstatic int game.C_100196_rb.field_105819_e
		// @10D: imul
		// @10E: iadd
		// @10F: istore #13
		// @111: iload #8
		// @113: iload #12
		// @115: iload #15
		// @117: imul
		// @118: iadd
		// @119: istore #8
		// @11B: iload_1
		// @11C: iload_3
		// @11D: iadd
		// @11E: getstatic int game.C_100196_rb.field_105820_b
		// @121: if_icmple @139
		// @124: iload_1
		// @125: iload_3
		// @126: iadd
		// @127: getstatic int game.C_100196_rb.field_105820_b
		// @12A: isub
		// @12B: istore #15
		// @12D: iload_3
		// @12E: iload #15
		// @130: isub
		// @131: istore_3
		// @132: iload #14
		// @134: iload #15
		// @136: iadd
		// @137: istore #14
		// @139: iload_1
		// @13A: getstatic int game.C_100196_rb.field_105827_i
		// @13D: if_icmpge @164
		// @140: getstatic int game.C_100196_rb.field_105827_i
		// @143: iload_1
		// @144: isub
		// @145: istore #15
		// @147: iload_3
		// @148: iload #15
		// @14A: isub
		// @14B: istore_3
		// @14C: iload #13
		// @14E: iload #15
		// @150: iadd
		// @151: istore #13
		// @153: iload #7
		// @155: iload #11
		// @157: iload #15
		// @159: imul
		// @15A: iadd
		// @15B: istore #7
		// @15D: iload #14
		// @15F: iload #15
		// @161: iadd
		// @162: istore #14
		// @164: getstatic int[] game.C_100196_rb.field_105818_d
		// @167: aload_0
		// @168: getfield int[] game.C_100251_pm.field_102388_J
		// @16B: iconst_0
		// @16C: iload #7
		// @16E: iload #8
		// @170: iload #13
		// @172: iload #14
		// @174: iload_3
		// @175: iload #4
		// @177: iload #11
		// @179: iload #12
		// @17B: iload #5
		// @17D: invokestatic game.C_100251_pm.func_102395_c(int[], int[], int, int, int, int, int, int, int, int, int, int)void
		// @180: return
	}
	
	private static final void func_102390_c(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12)
	{
		// @00: iload_3
		// @01: istore #13
		// @03: iload #8
		// @05: ineg
		// @06: istore #14
		// @08: iload #14
		// @0A: ifge @9C
		// @0D: iload #4
		// @0F: bipush 16 (0x10)
		// @11: ishr
		// @12: iload #11
		// @14: imul
		// @15: istore #15
		// @17: iload #7
		// @19: ineg
		// @1A: istore #16
		// @1C: iload #16
		// @1E: ifge @85
		// @21: aload_1
		// @22: iload_3
		// @23: bipush 16 (0x10)
		// @25: ishr
		// @26: iload #15
		// @28: iadd
		// @29: iaload
		// @2A: istore #17
		// @2C: aload_0
		// @2D: iload #5
		// @2F: iaload
		// @30: istore #18
		// @32: iload #17
		// @34: bipush 24 (0x18)
		// @36: iushr
		// @37: iload #12
		// @39: imul
		// @3A: bipush 8 (0x08)
		// @3C: ishr
		// @3D: istore #19
		// @3F: sipush 256 (0x0100)
		// @42: iload #19
		// @44: isub
		// @45: istore #20
		// @47: aload_0
		// @48: iload #5
		// @4A: iinc #5 +1
		// @4D: iload #17
		// @4F: ldc 16711935 (0xff00ff)
		// @51: iand
		// @52: iload #19
		// @54: imul
		// @55: iload #18
		// @57: ldc 16711935 (0xff00ff)
		// @59: iand
		// @5A: iload #20
		// @5C: imul
		// @5D: iadd
		// @5E: ldc -16711936 (0xff00ff00)
		// @60: iand
		// @61: iload #17
		// @63: ldc 65280 (0xff00)
		// @65: iand
		// @66: iload #19
		// @68: imul
		// @69: iload #18
		// @6B: ldc 65280 (0xff00)
		// @6D: iand
		// @6E: iload #20
		// @70: imul
		// @71: iadd
		// @72: ldc 16711680 (0xff0000)
		// @74: iand
		// @75: iadd
		// @76: bipush 8 (0x08)
		// @78: iushr
		// @79: iastore
		// @7A: iload_3
		// @7B: iload #9
		// @7D: iadd
		// @7E: istore_3
		// @7F: iinc #16 +1
		// @82: goto @1C
		// @85: iload #4
		// @87: iload #10
		// @89: iadd
		// @8A: istore #4
		// @8C: iload #13
		// @8E: istore_3
		// @8F: iload #5
		// @91: iload #6
		// @93: iadd
		// @94: istore #5
		// @96: iinc #14 +1
		// @99: goto @08
		// @9C: return
	}
	
	private static final void func_102396_c(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9)
	{
		// @000: iload #9
		// @002: bipush 16 (0x10)
		// @004: ishr
		// @005: sipush 255 (0x00FF)
		// @008: iand
		// @009: istore #10
		// @00B: iload #9
		// @00D: bipush 8 (0x08)
		// @00F: ishr
		// @010: sipush 255 (0x00FF)
		// @013: iand
		// @014: istore #11
		// @016: iload #9
		// @018: sipush 255 (0x00FF)
		// @01B: iand
		// @01C: istore #12
		// @01E: iload #5
		// @020: iconst_2
		// @021: ishr
		// @022: ineg
		// @023: istore #13
		// @025: iload #5
		// @027: iconst_3
		// @028: iand
		// @029: ineg
		// @02A: istore #5
		// @02C: iload #13
		// @02E: iload #13
		// @030: iadd
		// @031: iload #13
		// @033: iadd
		// @034: iload #13
		// @036: iadd
		// @037: iload #5
		// @039: iadd
		// @03A: istore #14
		// @03C: iload #6
		// @03E: ineg
		// @03F: istore #15
		// @041: iload #15
		// @043: ifge @16B
		// @046: iload #14
		// @048: istore #16
		// @04A: iload #16
		// @04C: ifge @159
		// @04F: aload_1
		// @050: iload_3
		// @051: iinc #3 +1
		// @054: iaload
		// @055: istore_2
		// @056: iload_2
		// @057: bipush 24 (0x18)
		// @059: iushr
		// @05A: istore #17
		// @05C: iload #17
		// @05E: ifeq @150
		// @061: iload_2
		// @062: bipush 16 (0x10)
		// @064: ishr
		// @065: sipush 255 (0x00FF)
		// @068: iand
		// @069: istore #19
		// @06B: iload_2
		// @06C: bipush 8 (0x08)
		// @06E: ishr
		// @06F: sipush 255 (0x00FF)
		// @072: iand
		// @073: istore #20
		// @075: iload_2
		// @076: sipush 255 (0x00FF)
		// @079: iand
		// @07A: istore #21
		// @07C: iload #19
		// @07E: iload #20
		// @080: if_icmpne @109
		// @083: iload #20
		// @085: iload #21
		// @087: if_icmpne @109
		// @08A: iload #19
		// @08C: sipush 128 (0x0080)
		// @08F: if_icmpgt @0B7
		// @092: iload #19
		// @094: iload #10
		// @096: imul
		// @097: bipush 7 (0x07)
		// @099: ishr
		// @09A: bipush 16 (0x10)
		// @09C: ishl
		// @09D: iload #20
		// @09F: iload #11
		// @0A1: imul
		// @0A2: bipush 7 (0x07)
		// @0A4: ishr
		// @0A5: bipush 8 (0x08)
		// @0A7: ishl
		// @0A8: iadd
		// @0A9: iload #21
		// @0AB: iload #12
		// @0AD: imul
		// @0AE: bipush 7 (0x07)
		// @0B0: ishr
		// @0B1: iadd
		// @0B2: istore #18
		// @0B4: goto @10C
		// @0B7: iload #10
		// @0B9: sipush 256 (0x0100)
		// @0BC: iload #19
		// @0BE: isub
		// @0BF: imul
		// @0C0: sipush 255 (0x00FF)
		// @0C3: iload #19
		// @0C5: sipush 128 (0x0080)
		// @0C8: isub
		// @0C9: imul
		// @0CA: iadd
		// @0CB: bipush 7 (0x07)
		// @0CD: ishr
		// @0CE: bipush 16 (0x10)
		// @0D0: ishl
		// @0D1: iload #11
		// @0D3: sipush 256 (0x0100)
		// @0D6: iload #20
		// @0D8: isub
		// @0D9: imul
		// @0DA: sipush 255 (0x00FF)
		// @0DD: iload #20
		// @0DF: sipush 128 (0x0080)
		// @0E2: isub
		// @0E3: imul
		// @0E4: iadd
		// @0E5: bipush 7 (0x07)
		// @0E7: ishr
		// @0E8: bipush 8 (0x08)
		// @0EA: ishl
		// @0EB: iadd
		// @0EC: iload #12
		// @0EE: sipush 256 (0x0100)
		// @0F1: iload #21
		// @0F3: isub
		// @0F4: imul
		// @0F5: sipush 255 (0x00FF)
		// @0F8: iload #21
		// @0FA: sipush 128 (0x0080)
		// @0FD: isub
		// @0FE: imul
		// @0FF: iadd
		// @100: bipush 7 (0x07)
		// @102: ishr
		// @103: iadd
		// @104: istore #18
		// @106: goto @10C
		// @109: iload_2
		// @10A: istore #18
		// @10C: sipush 256 (0x0100)
		// @10F: iload #17
		// @111: isub
		// @112: istore #22
		// @114: aload_0
		// @115: iload #4
		// @117: iaload
		// @118: istore #23
		// @11A: aload_0
		// @11B: iload #4
		// @11D: iinc #4 +1
		// @120: iload #18
		// @122: ldc 16711935 (0xff00ff)
		// @124: iand
		// @125: iload #17
		// @127: imul
		// @128: iload #23
		// @12A: ldc 16711935 (0xff00ff)
		// @12C: iand
		// @12D: iload #22
		// @12F: imul
		// @130: iadd
		// @131: ldc -16711936 (0xff00ff00)
		// @133: iand
		// @134: iload #18
		// @136: ldc 65280 (0xff00)
		// @138: iand
		// @139: iload #17
		// @13B: imul
		// @13C: iload #23
		// @13E: ldc 65280 (0xff00)
		// @140: iand
		// @141: iload #22
		// @143: imul
		// @144: iadd
		// @145: ldc 16711680 (0xff0000)
		// @147: iand
		// @148: iadd
		// @149: bipush 8 (0x08)
		// @14B: iushr
		// @14C: iastore
		// @14D: goto @153
		// @150: iinc #4 +1
		// @153: iinc #16 +1
		// @156: goto @04A
		// @159: iload #4
		// @15B: iload #7
		// @15D: iadd
		// @15E: istore #4
		// @160: iload_3
		// @161: iload #8
		// @163: iadd
		// @164: istore_3
		// @165: iinc #15 +1
		// @168: goto @041
		// @16B: return
	}
	
	final void func_102346_e(int arg0, int arg1, int arg2, int arg3)
	{
		// @000: aload_0
		// @001: getfield int game.C_100251_pm.field_102337_u
		// @004: ifne @008
		// @007: return
		// @008: aload_0
		// @009: getfield int game.C_100251_pm.field_102337_u
		// @00C: istore #5
		// @00E: aload_0
		// @00F: getfield int game.C_100251_pm.field_102339_s
		// @012: istore #6
		// @014: iload_3
		// @015: bipush 8 (0x08)
		// @017: ishl
		// @018: istore #7
		// @01A: iload #4
		// @01C: iload_3
		// @01D: isub
		// @01E: bipush 8 (0x08)
		// @020: ishl
		// @021: iload #5
		// @023: idiv
		// @024: istore #8
		// @026: iconst_0
		// @027: istore #9
		// @029: iload_1
		// @02A: getstatic int game.C_100196_rb.field_105827_i
		// @02D: if_icmpge @048
		// @030: iload #6
		// @032: getstatic int game.C_100196_rb.field_105827_i
		// @035: iload_1
		// @036: isub
		// @037: isub
		// @038: istore #6
		// @03A: iload #9
		// @03C: getstatic int game.C_100196_rb.field_105827_i
		// @03F: iload_1
		// @040: isub
		// @041: iadd
		// @042: istore #9
		// @044: getstatic int game.C_100196_rb.field_105827_i
		// @047: istore_1
		// @048: iload_2
		// @049: getstatic int game.C_100196_rb.field_105816_f
		// @04C: if_icmpge @078
		// @04F: iload #7
		// @051: getstatic int game.C_100196_rb.field_105816_f
		// @054: iload_2
		// @055: isub
		// @056: iload #8
		// @058: imul
		// @059: iadd
		// @05A: istore #7
		// @05C: iload #5
		// @05E: getstatic int game.C_100196_rb.field_105816_f
		// @061: iload_2
		// @062: isub
		// @063: isub
		// @064: istore #5
		// @066: iload #9
		// @068: getstatic int game.C_100196_rb.field_105816_f
		// @06B: iload_2
		// @06C: isub
		// @06D: getstatic int game.C_100196_rb.field_105819_e
		// @070: imul
		// @071: iadd
		// @072: istore #9
		// @074: getstatic int game.C_100196_rb.field_105816_f
		// @077: istore_2
		// @078: iload_1
		// @079: iload #6
		// @07B: iadd
		// @07C: getstatic int game.C_100196_rb.field_105820_b
		// @07F: if_icmple @089
		// @082: getstatic int game.C_100196_rb.field_105820_b
		// @085: iload_1
		// @086: isub
		// @087: istore #6
		// @089: iload_2
		// @08A: iload #5
		// @08C: iadd
		// @08D: getstatic int game.C_100196_rb.field_105823_l
		// @090: if_icmple @09A
		// @093: getstatic int game.C_100196_rb.field_105823_l
		// @096: iload_2
		// @097: isub
		// @098: istore #5
		// @09A: getstatic int game.C_100196_rb.field_105819_e
		// @09D: iload #6
		// @09F: isub
		// @0A0: istore #10
		// @0A2: aload_0
		// @0A3: getfield int game.C_100251_pm.field_102339_s
		// @0A6: iload #6
		// @0A8: isub
		// @0A9: istore #11
		// @0AB: iload_1
		// @0AC: iload_2
		// @0AD: getstatic int game.C_100196_rb.field_105819_e
		// @0B0: imul
		// @0B1: iadd
		// @0B2: istore #12
		// @0B4: iload #5
		// @0B6: ineg
		// @0B7: istore_2
		// @0B8: iload_2
		// @0B9: ifge @157
		// @0BC: iload #7
		// @0BE: bipush 8 (0x08)
		// @0C0: ishr
		// @0C1: istore #13
		// @0C3: iload #13
		// @0C5: ifge @0CB
		// @0C8: goto @151
		// @0CB: iload #6
		// @0CD: ineg
		// @0CE: istore_1
		// @0CF: iload_1
		// @0D0: ifge @13C
		// @0D3: aload_0
		// @0D4: getfield int[] game.C_100251_pm.field_102388_J
		// @0D7: iload #9
		// @0D9: iaload
		// @0DA: bipush 24 (0x18)
		// @0DC: iushr
		// @0DD: iload #13
		// @0DF: imul
		// @0E0: bipush 8 (0x08)
		// @0E2: ishr
		// @0E3: istore #14
		// @0E5: sipush 256 (0x0100)
		// @0E8: iload #14
		// @0EA: isub
		// @0EB: istore #15
		// @0ED: aload_0
		// @0EE: getfield int[] game.C_100251_pm.field_102388_J
		// @0F1: iload #9
		// @0F3: iinc #9 +1
		// @0F6: iaload
		// @0F7: istore #16
		// @0F9: getstatic int[] game.C_100196_rb.field_105818_d
		// @0FC: iload #12
		// @0FE: iaload
		// @0FF: istore #17
		// @101: getstatic int[] game.C_100196_rb.field_105818_d
		// @104: iload #12
		// @106: iinc #12 +1
		// @109: iload #16
		// @10B: ldc 16711935 (0xff00ff)
		// @10D: iand
		// @10E: iload #14
		// @110: imul
		// @111: iload #17
		// @113: ldc 16711935 (0xff00ff)
		// @115: iand
		// @116: iload #15
		// @118: imul
		// @119: iadd
		// @11A: ldc -16711936 (0xff00ff00)
		// @11C: iand
		// @11D: iload #16
		// @11F: ldc 65280 (0xff00)
		// @121: iand
		// @122: iload #14
		// @124: imul
		// @125: iload #17
		// @127: ldc 65280 (0xff00)
		// @129: iand
		// @12A: iload #15
		// @12C: imul
		// @12D: iadd
		// @12E: ldc 16711680 (0xff0000)
		// @130: iand
		// @131: iadd
		// @132: bipush 8 (0x08)
		// @134: iushr
		// @135: iastore
		// @136: iinc #1 +1
		// @139: goto @0CF
		// @13C: iload #12
		// @13E: iload #10
		// @140: iadd
		// @141: istore #12
		// @143: iload #9
		// @145: iload #11
		// @147: iadd
		// @148: istore #9
		// @14A: iload #7
		// @14C: iload #8
		// @14E: iadd
		// @14F: istore #7
		// @151: iinc #2 +1
		// @154: goto @0B8
		// @157: return
	}
	
	final void func_102360_g(int arg0, int arg1)
	{
		// @000: aload_0
		// @001: getfield int game.C_100251_pm.field_102339_s
		// @004: iconst_1
		// @005: ishr
		// @006: istore_3
		// @007: aload_0
		// @008: getfield int game.C_100251_pm.field_102337_u
		// @00B: iconst_1
		// @00C: ishr
		// @00D: istore #4
		// @00F: iload_1
		// @010: aload_0
		// @011: getfield int game.C_100251_pm.field_102335_w
		// @014: iconst_2
		// @015: idiv
		// @016: iadd
		// @017: istore_1
		// @018: iload_2
		// @019: aload_0
		// @01A: getfield int game.C_100251_pm.field_102332_H
		// @01D: iconst_2
		// @01E: idiv
		// @01F: iadd
		// @020: istore_2
		// @021: iload_1
		// @022: getstatic int game.C_100196_rb.field_105827_i
		// @025: if_icmpge @032
		// @028: getstatic int game.C_100196_rb.field_105827_i
		// @02B: iload_1
		// @02C: isub
		// @02D: iconst_1
		// @02E: ishl
		// @02F: goto @033
		// @032: iconst_0
		// @033: istore #5
		// @035: iload_1
		// @036: iload_3
		// @037: iadd
		// @038: getstatic int game.C_100196_rb.field_105820_b
		// @03B: if_icmple @04A
		// @03E: getstatic int game.C_100196_rb.field_105820_b
		// @041: iload_1
		// @042: isub
		// @043: iconst_1
		// @044: ishl
		// @045: iconst_2
		// @046: isub
		// @047: goto @050
		// @04A: aload_0
		// @04B: getfield int game.C_100251_pm.field_102339_s
		// @04E: iconst_2
		// @04F: isub
		// @050: istore #6
		// @052: iload_2
		// @053: getstatic int game.C_100196_rb.field_105816_f
		// @056: if_icmpge @063
		// @059: getstatic int game.C_100196_rb.field_105816_f
		// @05C: iload_2
		// @05D: isub
		// @05E: iconst_1
		// @05F: ishl
		// @060: goto @064
		// @063: iconst_0
		// @064: istore #7
		// @066: iload_2
		// @067: iload #4
		// @069: iadd
		// @06A: getstatic int game.C_100196_rb.field_105823_l
		// @06D: if_icmple @07C
		// @070: getstatic int game.C_100196_rb.field_105823_l
		// @073: iload_2
		// @074: isub
		// @075: iconst_1
		// @076: ishl
		// @077: iconst_2
		// @078: isub
		// @079: goto @082
		// @07C: aload_0
		// @07D: getfield int game.C_100251_pm.field_102337_u
		// @080: iconst_2
		// @081: isub
		// @082: istore #8
		// @084: iload #7
		// @086: istore #9
		// @088: iload #9
		// @08A: iload #8
		// @08C: if_icmpgt @1A9
		// @08F: iload #9
		// @091: aload_0
		// @092: getfield int game.C_100251_pm.field_102339_s
		// @095: imul
		// @096: iload #5
		// @098: iadd
		// @099: istore #10
		// @09B: iload_2
		// @09C: iload #9
		// @09E: iconst_1
		// @09F: ishr
		// @0A0: iadd
		// @0A1: getstatic int game.C_100196_rb.field_105819_e
		// @0A4: imul
		// @0A5: iload_1
		// @0A6: iload #5
		// @0A8: iconst_1
		// @0A9: ishr
		// @0AA: iadd
		// @0AB: iadd
		// @0AC: istore #11
		// @0AE: iload #5
		// @0B0: istore #12
		// @0B2: iload #12
		// @0B4: iload #6
		// @0B6: if_icmpgt @1A3
		// @0B9: iconst_0
		// @0BA: istore #13
		// @0BC: iconst_0
		// @0BD: istore #14
		// @0BF: iconst_0
		// @0C0: istore #15
		// @0C2: iconst_0
		// @0C3: istore #16
		// @0C5: iconst_0
		// @0C6: istore #17
		// @0C8: iconst_0
		// @0C9: istore #18
		// @0CB: iconst_0
		// @0CC: istore #19
		// @0CE: iload #19
		// @0D0: iconst_4
		// @0D1: if_icmpge @136
		// @0D4: aload_0
		// @0D5: getfield int[] game.C_100251_pm.field_102388_J
		// @0D8: iload #10
		// @0DA: iload #19
		// @0DC: iconst_1
		// @0DD: iand
		// @0DE: iadd
		// @0DF: iload #19
		// @0E1: iconst_2
		// @0E2: iand
		// @0E3: ifne @0ED
		// @0E6: aload_0
		// @0E7: getfield int game.C_100251_pm.field_102339_s
		// @0EA: goto @0EE
		// @0ED: iconst_0
		// @0EE: iadd
		// @0EF: iaload
		// @0F0: istore #13
		// @0F2: iload #13
		// @0F4: bipush 24 (0x18)
		// @0F6: iushr
		// @0F7: istore #14
		// @0F9: iload #18
		// @0FB: iload #14
		// @0FD: iadd
		// @0FE: istore #18
		// @100: iload #15
		// @102: iload #14
		// @104: iload #13
		// @106: bipush 16 (0x10)
		// @108: ishr
		// @109: sipush 255 (0x00FF)
		// @10C: iand
		// @10D: imul
		// @10E: iadd
		// @10F: istore #15
		// @111: iload #16
		// @113: iload #14
		// @115: iload #13
		// @117: bipush 8 (0x08)
		// @119: ishr
		// @11A: sipush 255 (0x00FF)
		// @11D: iand
		// @11E: imul
		// @11F: iadd
		// @120: istore #16
		// @122: iload #17
		// @124: iload #14
		// @126: iload #13
		// @128: sipush 255 (0x00FF)
		// @12B: iand
		// @12C: imul
		// @12D: iadd
		// @12E: istore #17
		// @130: iinc #19 +1
		// @133: goto @0CE
		// @136: iload #18
		// @138: ifeq @197
		// @13B: iload #15
		// @13D: iload #18
		// @13F: idiv
		// @140: bipush 16 (0x10)
		// @142: ishl
		// @143: iload #17
		// @145: iload #18
		// @147: idiv
		// @148: iadd
		// @149: istore #15
		// @14B: iload #16
		// @14D: iload #18
		// @14F: idiv
		// @150: bipush 8 (0x08)
		// @152: ishl
		// @153: istore #16
		// @155: iload #18
		// @157: iconst_2
		// @158: ishr
		// @159: istore #19
		// @15B: sipush 256 (0x0100)
		// @15E: iload #19
		// @160: isub
		// @161: istore #20
		// @163: getstatic int[] game.C_100196_rb.field_105818_d
		// @166: iload #11
		// @168: iaload
		// @169: istore #21
		// @16B: getstatic int[] game.C_100196_rb.field_105818_d
		// @16E: iload #11
		// @170: iload #19
		// @172: iload #15
		// @174: imul
		// @175: iload #20
		// @177: iload #21
		// @179: ldc 16711935 (0xff00ff)
		// @17B: iand
		// @17C: imul
		// @17D: iadd
		// @17E: ldc -16711936 (0xff00ff00)
		// @180: iand
		// @181: iload #19
		// @183: iload #16
		// @185: imul
		// @186: iload #20
		// @188: iload #21
		// @18A: ldc 65280 (0xff00)
		// @18C: iand
		// @18D: imul
		// @18E: iadd
		// @18F: ldc 16711680 (0xff0000)
		// @191: iand
		// @192: iadd
		// @193: bipush 8 (0x08)
		// @195: iushr
		// @196: iastore
		// @197: iinc #12 +2
		// @19A: iinc #11 +1
		// @19D: iinc #10 +2
		// @1A0: goto @0B2
		// @1A3: iinc #9 +2
		// @1A6: goto @088
		// @1A9: return
	}
	
	final void func_102351_e(int arg0, int arg1)
	{
		// @000: iload_1
		// @001: aload_0
		// @002: getfield int game.C_100251_pm.field_102341_y
		// @005: aload_0
		// @006: getfield int game.C_100251_pm.field_102339_s
		// @009: isub
		// @00A: aload_0
		// @00B: getfield int game.C_100251_pm.field_102335_w
		// @00E: isub
		// @00F: iadd
		// @010: istore_1
		// @011: iload_2
		// @012: aload_0
		// @013: getfield int game.C_100251_pm.field_102332_H
		// @016: iadd
		// @017: istore_2
		// @018: iload_1
		// @019: iload_2
		// @01A: getstatic int game.C_100196_rb.field_105819_e
		// @01D: imul
		// @01E: iadd
		// @01F: istore_3
		// @020: aload_0
		// @021: getfield int game.C_100251_pm.field_102339_s
		// @024: iconst_1
		// @025: isub
		// @026: istore #4
		// @028: aload_0
		// @029: getfield int game.C_100251_pm.field_102337_u
		// @02C: istore #5
		// @02E: aload_0
		// @02F: getfield int game.C_100251_pm.field_102339_s
		// @032: istore #6
		// @034: getstatic int game.C_100196_rb.field_105819_e
		// @037: iload #6
		// @039: isub
		// @03A: istore #7
		// @03C: iload #6
		// @03E: iload #6
		// @040: iadd
		// @041: istore #8
		// @043: iload_2
		// @044: getstatic int game.C_100196_rb.field_105816_f
		// @047: if_icmpge @06F
		// @04A: getstatic int game.C_100196_rb.field_105816_f
		// @04D: iload_2
		// @04E: isub
		// @04F: istore #9
		// @051: iload #5
		// @053: iload #9
		// @055: isub
		// @056: istore #5
		// @058: getstatic int game.C_100196_rb.field_105816_f
		// @05B: istore_2
		// @05C: iload #4
		// @05E: iload #9
		// @060: iload #6
		// @062: imul
		// @063: iadd
		// @064: istore #4
		// @066: iload_3
		// @067: iload #9
		// @069: getstatic int game.C_100196_rb.field_105819_e
		// @06C: imul
		// @06D: iadd
		// @06E: istore_3
		// @06F: iload_2
		// @070: iload #5
		// @072: iadd
		// @073: getstatic int game.C_100196_rb.field_105823_l
		// @076: if_icmple @086
		// @079: iload #5
		// @07B: iload_2
		// @07C: iload #5
		// @07E: iadd
		// @07F: getstatic int game.C_100196_rb.field_105823_l
		// @082: isub
		// @083: isub
		// @084: istore #5
		// @086: iload_1
		// @087: getstatic int game.C_100196_rb.field_105827_i
		// @08A: if_icmpge @0B9
		// @08D: getstatic int game.C_100196_rb.field_105827_i
		// @090: iload_1
		// @091: isub
		// @092: istore #9
		// @094: iload #6
		// @096: iload #9
		// @098: isub
		// @099: istore #6
		// @09B: getstatic int game.C_100196_rb.field_105827_i
		// @09E: istore_1
		// @09F: iload #4
		// @0A1: iload #9
		// @0A3: isub
		// @0A4: istore #4
		// @0A6: iload_3
		// @0A7: iload #9
		// @0A9: iadd
		// @0AA: istore_3
		// @0AB: iload #8
		// @0AD: iload #9
		// @0AF: isub
		// @0B0: istore #8
		// @0B2: iload #7
		// @0B4: iload #9
		// @0B6: iadd
		// @0B7: istore #7
		// @0B9: iload_1
		// @0BA: iload #6
		// @0BC: iadd
		// @0BD: getstatic int game.C_100196_rb.field_105820_b
		// @0C0: if_icmple @0E2
		// @0C3: iload_1
		// @0C4: iload #6
		// @0C6: iadd
		// @0C7: getstatic int game.C_100196_rb.field_105820_b
		// @0CA: isub
		// @0CB: istore #9
		// @0CD: iload #6
		// @0CF: iload #9
		// @0D1: isub
		// @0D2: istore #6
		// @0D4: iload #8
		// @0D6: iload #9
		// @0D8: isub
		// @0D9: istore #8
		// @0DB: iload #7
		// @0DD: iload #9
		// @0DF: iadd
		// @0E0: istore #7
		// @0E2: iload #6
		// @0E4: ifle @0EC
		// @0E7: iload #5
		// @0E9: ifgt @0ED
		// @0EC: return
		// @0ED: getstatic int[] game.C_100196_rb.field_105818_d
		// @0F0: aload_0
		// @0F1: getfield int[] game.C_100251_pm.field_102388_J
		// @0F4: iconst_0
		// @0F5: iload #4
		// @0F7: iload_3
		// @0F8: iload #6
		// @0FA: iload #5
		// @0FC: iload #7
		// @0FE: iload #8
		// @100: invokestatic game.C_100251_pm.func_102394_d(int[], int[], int, int, int, int, int, int, int)void
		// @103: return
	}
	
	private static final void func_102391_e(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8)
	{
		// @00: iload #5
		// @02: ineg
		// @03: istore #9
		// @05: iload #6
		// @07: ineg
		// @08: istore #10
		// @0A: iload #10
		// @0C: ifge @87
		// @0F: iload #9
		// @11: istore #11
		// @13: iload #11
		// @15: ifge @75
		// @18: aload_1
		// @19: iload_3
		// @1A: iinc #3 +1
		// @1D: iaload
		// @1E: istore_2
		// @1F: iload_2
		// @20: bipush 24 (0x18)
		// @22: iushr
		// @23: istore #12
		// @25: iload #12
		// @27: ifeq @6C
		// @2A: sipush 256 (0x0100)
		// @2D: iload #12
		// @2F: isub
		// @30: istore #13
		// @32: aload_0
		// @33: iload #4
		// @35: iaload
		// @36: istore #14
		// @38: aload_0
		// @39: iload #4
		// @3B: iinc #4 +1
		// @3E: iload_2
		// @3F: ldc 16711935 (0xff00ff)
		// @41: iand
		// @42: iload #12
		// @44: imul
		// @45: iload #14
		// @47: ldc 16711935 (0xff00ff)
		// @49: iand
		// @4A: iload #13
		// @4C: imul
		// @4D: iadd
		// @4E: ldc -16711936 (0xff00ff00)
		// @50: iand
		// @51: iload_2
		// @52: ldc 65280 (0xff00)
		// @54: iand
		// @55: iload #12
		// @57: imul
		// @58: iload #14
		// @5A: ldc 65280 (0xff00)
		// @5C: iand
		// @5D: iload #13
		// @5F: imul
		// @60: iadd
		// @61: ldc 16711680 (0xff0000)
		// @63: iand
		// @64: iadd
		// @65: bipush 8 (0x08)
		// @67: iushr
		// @68: iastore
		// @69: goto @6F
		// @6C: iinc #4 +1
		// @6F: iinc #11 +1
		// @72: goto @13
		// @75: iload #4
		// @77: iload #7
		// @79: iadd
		// @7A: istore #4
		// @7C: iload_3
		// @7D: iload #8
		// @7F: iadd
		// @80: istore_3
		// @81: iinc #10 +1
		// @84: goto @0A
		// @87: return
	}
	
	final void func_102353_h(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100251_pm.field_102335_w
		// @05: iadd
		// @06: istore_1
		// @07: iload_2
		// @08: aload_0
		// @09: getfield int game.C_100251_pm.field_102332_H
		// @0C: iadd
		// @0D: istore_2
		// @0E: iload_1
		// @0F: iload_2
		// @10: getstatic int game.C_100196_rb.field_105819_e
		// @13: imul
		// @14: iadd
		// @15: istore_3
		// @16: iconst_0
		// @17: istore #4
		// @19: aload_0
		// @1A: getfield int game.C_100251_pm.field_102337_u
		// @1D: istore #5
		// @1F: aload_0
		// @20: getfield int game.C_100251_pm.field_102339_s
		// @23: istore #6
		// @25: getstatic int game.C_100196_rb.field_105819_e
		// @28: iload #6
		// @2A: isub
		// @2B: istore #7
		// @2D: iconst_0
		// @2E: istore #8
		// @30: iload_2
		// @31: getstatic int game.C_100196_rb.field_105816_f
		// @34: if_icmpge @5C
		// @37: getstatic int game.C_100196_rb.field_105816_f
		// @3A: iload_2
		// @3B: isub
		// @3C: istore #9
		// @3E: iload #5
		// @40: iload #9
		// @42: isub
		// @43: istore #5
		// @45: getstatic int game.C_100196_rb.field_105816_f
		// @48: istore_2
		// @49: iload #4
		// @4B: iload #9
		// @4D: iload #6
		// @4F: imul
		// @50: iadd
		// @51: istore #4
		// @53: iload_3
		// @54: iload #9
		// @56: getstatic int game.C_100196_rb.field_105819_e
		// @59: imul
		// @5A: iadd
		// @5B: istore_3
		// @5C: iload_2
		// @5D: iload #5
		// @5F: iadd
		// @60: getstatic int game.C_100196_rb.field_105823_l
		// @63: if_icmple @73
		// @66: iload #5
		// @68: iload_2
		// @69: iload #5
		// @6B: iadd
		// @6C: getstatic int game.C_100196_rb.field_105823_l
		// @6F: isub
		// @70: isub
		// @71: istore #5
		// @73: iload_1
		// @74: getstatic int game.C_100196_rb.field_105827_i
		// @77: if_icmpge @A6
		// @7A: getstatic int game.C_100196_rb.field_105827_i
		// @7D: iload_1
		// @7E: isub
		// @7F: istore #9
		// @81: iload #6
		// @83: iload #9
		// @85: isub
		// @86: istore #6
		// @88: getstatic int game.C_100196_rb.field_105827_i
		// @8B: istore_1
		// @8C: iload #4
		// @8E: iload #9
		// @90: iadd
		// @91: istore #4
		// @93: iload_3
		// @94: iload #9
		// @96: iadd
		// @97: istore_3
		// @98: iload #8
		// @9A: iload #9
		// @9C: iadd
		// @9D: istore #8
		// @9F: iload #7
		// @A1: iload #9
		// @A3: iadd
		// @A4: istore #7
		// @A6: iload_1
		// @A7: iload #6
		// @A9: iadd
		// @AA: getstatic int game.C_100196_rb.field_105820_b
		// @AD: if_icmple @CF
		// @B0: iload_1
		// @B1: iload #6
		// @B3: iadd
		// @B4: getstatic int game.C_100196_rb.field_105820_b
		// @B7: isub
		// @B8: istore #9
		// @BA: iload #6
		// @BC: iload #9
		// @BE: isub
		// @BF: istore #6
		// @C1: iload #8
		// @C3: iload #9
		// @C5: iadd
		// @C6: istore #8
		// @C8: iload #7
		// @CA: iload #9
		// @CC: iadd
		// @CD: istore #7
		// @CF: iload #6
		// @D1: ifle @D9
		// @D4: iload #5
		// @D6: ifgt @DA
		// @D9: return
		// @DA: getstatic int[] game.C_100196_rb.field_105818_d
		// @DD: aload_0
		// @DE: getfield int[] game.C_100251_pm.field_102388_J
		// @E1: iconst_0
		// @E2: iload #4
		// @E4: iload_3
		// @E5: iload #6
		// @E7: iload #5
		// @E9: iload #7
		// @EB: iload #8
		// @ED: invokestatic game.C_100251_pm.func_102391_e(int[], int[], int, int, int, int, int, int, int)void
		// @F0: return
	}
	
	final void func_102376_d(int arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100251_pm.field_102335_w
		// @05: iadd
		// @06: istore_1
		// @07: iload_2
		// @08: aload_0
		// @09: getfield int game.C_100251_pm.field_102332_H
		// @0C: iadd
		// @0D: istore_2
		// @0E: iload_1
		// @0F: iload_2
		// @10: getstatic int game.C_100196_rb.field_105819_e
		// @13: imul
		// @14: iadd
		// @15: istore #4
		// @17: iconst_0
		// @18: istore #5
		// @1A: aload_0
		// @1B: getfield int game.C_100251_pm.field_102337_u
		// @1E: istore #6
		// @20: aload_0
		// @21: getfield int game.C_100251_pm.field_102339_s
		// @24: istore #7
		// @26: getstatic int game.C_100196_rb.field_105819_e
		// @29: iload #7
		// @2B: isub
		// @2C: istore #8
		// @2E: iconst_0
		// @2F: istore #9
		// @31: iload_2
		// @32: getstatic int game.C_100196_rb.field_105816_f
		// @35: if_icmpge @5F
		// @38: getstatic int game.C_100196_rb.field_105816_f
		// @3B: iload_2
		// @3C: isub
		// @3D: istore #10
		// @3F: iload #6
		// @41: iload #10
		// @43: isub
		// @44: istore #6
		// @46: getstatic int game.C_100196_rb.field_105816_f
		// @49: istore_2
		// @4A: iload #5
		// @4C: iload #10
		// @4E: iload #7
		// @50: imul
		// @51: iadd
		// @52: istore #5
		// @54: iload #4
		// @56: iload #10
		// @58: getstatic int game.C_100196_rb.field_105819_e
		// @5B: imul
		// @5C: iadd
		// @5D: istore #4
		// @5F: iload_2
		// @60: iload #6
		// @62: iadd
		// @63: getstatic int game.C_100196_rb.field_105823_l
		// @66: if_icmple @76
		// @69: iload #6
		// @6B: iload_2
		// @6C: iload #6
		// @6E: iadd
		// @6F: getstatic int game.C_100196_rb.field_105823_l
		// @72: isub
		// @73: isub
		// @74: istore #6
		// @76: iload_1
		// @77: getstatic int game.C_100196_rb.field_105827_i
		// @7A: if_icmpge @AB
		// @7D: getstatic int game.C_100196_rb.field_105827_i
		// @80: iload_1
		// @81: isub
		// @82: istore #10
		// @84: iload #7
		// @86: iload #10
		// @88: isub
		// @89: istore #7
		// @8B: getstatic int game.C_100196_rb.field_105827_i
		// @8E: istore_1
		// @8F: iload #5
		// @91: iload #10
		// @93: iadd
		// @94: istore #5
		// @96: iload #4
		// @98: iload #10
		// @9A: iadd
		// @9B: istore #4
		// @9D: iload #9
		// @9F: iload #10
		// @A1: iadd
		// @A2: istore #9
		// @A4: iload #8
		// @A6: iload #10
		// @A8: iadd
		// @A9: istore #8
		// @AB: iload_1
		// @AC: iload #7
		// @AE: iadd
		// @AF: getstatic int game.C_100196_rb.field_105820_b
		// @B2: if_icmple @D4
		// @B5: iload_1
		// @B6: iload #7
		// @B8: iadd
		// @B9: getstatic int game.C_100196_rb.field_105820_b
		// @BC: isub
		// @BD: istore #10
		// @BF: iload #7
		// @C1: iload #10
		// @C3: isub
		// @C4: istore #7
		// @C6: iload #9
		// @C8: iload #10
		// @CA: iadd
		// @CB: istore #9
		// @CD: iload #8
		// @CF: iload #10
		// @D1: iadd
		// @D2: istore #8
		// @D4: iload #7
		// @D6: ifle @DE
		// @D9: iload #6
		// @DB: ifgt @DF
		// @DE: return
		// @DF: getstatic int[] game.C_100196_rb.field_105818_d
		// @E2: aload_0
		// @E3: getfield int[] game.C_100251_pm.field_102388_J
		// @E6: iconst_0
		// @E7: iload #5
		// @E9: iload #4
		// @EB: iload #7
		// @ED: iload #6
		// @EF: iload #8
		// @F1: iload #9
		// @F3: iload_3
		// @F4: invokestatic game.C_100251_pm.func_102389_d(int[], int[], int, int, int, int, int, int, int, int)void
		// @F7: return
	}
	
	final void func_102367_c(int arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100251_pm.field_102335_w
		// @05: iadd
		// @06: istore_1
		// @07: iload_2
		// @08: aload_0
		// @09: getfield int game.C_100251_pm.field_102332_H
		// @0C: iadd
		// @0D: istore_2
		// @0E: iload_1
		// @0F: iload_2
		// @10: getstatic int game.C_100196_rb.field_105819_e
		// @13: imul
		// @14: iadd
		// @15: istore #4
		// @17: iconst_0
		// @18: istore #5
		// @1A: aload_0
		// @1B: getfield int game.C_100251_pm.field_102337_u
		// @1E: istore #6
		// @20: aload_0
		// @21: getfield int game.C_100251_pm.field_102339_s
		// @24: istore #7
		// @26: getstatic int game.C_100196_rb.field_105819_e
		// @29: iload #7
		// @2B: isub
		// @2C: istore #8
		// @2E: iconst_0
		// @2F: istore #9
		// @31: iload_2
		// @32: getstatic int game.C_100196_rb.field_105816_f
		// @35: if_icmpge @5F
		// @38: getstatic int game.C_100196_rb.field_105816_f
		// @3B: iload_2
		// @3C: isub
		// @3D: istore #10
		// @3F: iload #6
		// @41: iload #10
		// @43: isub
		// @44: istore #6
		// @46: getstatic int game.C_100196_rb.field_105816_f
		// @49: istore_2
		// @4A: iload #5
		// @4C: iload #10
		// @4E: iload #7
		// @50: imul
		// @51: iadd
		// @52: istore #5
		// @54: iload #4
		// @56: iload #10
		// @58: getstatic int game.C_100196_rb.field_105819_e
		// @5B: imul
		// @5C: iadd
		// @5D: istore #4
		// @5F: iload_2
		// @60: iload #6
		// @62: iadd
		// @63: getstatic int game.C_100196_rb.field_105823_l
		// @66: if_icmple @76
		// @69: iload #6
		// @6B: iload_2
		// @6C: iload #6
		// @6E: iadd
		// @6F: getstatic int game.C_100196_rb.field_105823_l
		// @72: isub
		// @73: isub
		// @74: istore #6
		// @76: iload_1
		// @77: getstatic int game.C_100196_rb.field_105827_i
		// @7A: if_icmpge @AB
		// @7D: getstatic int game.C_100196_rb.field_105827_i
		// @80: iload_1
		// @81: isub
		// @82: istore #10
		// @84: iload #7
		// @86: iload #10
		// @88: isub
		// @89: istore #7
		// @8B: getstatic int game.C_100196_rb.field_105827_i
		// @8E: istore_1
		// @8F: iload #5
		// @91: iload #10
		// @93: iadd
		// @94: istore #5
		// @96: iload #4
		// @98: iload #10
		// @9A: iadd
		// @9B: istore #4
		// @9D: iload #9
		// @9F: iload #10
		// @A1: iadd
		// @A2: istore #9
		// @A4: iload #8
		// @A6: iload #10
		// @A8: iadd
		// @A9: istore #8
		// @AB: iload_1
		// @AC: iload #7
		// @AE: iadd
		// @AF: getstatic int game.C_100196_rb.field_105820_b
		// @B2: if_icmple @D4
		// @B5: iload_1
		// @B6: iload #7
		// @B8: iadd
		// @B9: getstatic int game.C_100196_rb.field_105820_b
		// @BC: isub
		// @BD: istore #10
		// @BF: iload #7
		// @C1: iload #10
		// @C3: isub
		// @C4: istore #7
		// @C6: iload #9
		// @C8: iload #10
		// @CA: iadd
		// @CB: istore #9
		// @CD: iload #8
		// @CF: iload #10
		// @D1: iadd
		// @D2: istore #8
		// @D4: iload #7
		// @D6: ifle @DE
		// @D9: iload #6
		// @DB: ifgt @DF
		// @DE: return
		// @DF: iconst_0
		// @E0: iconst_0
		// @E1: iconst_0
		// @E2: getstatic int[] game.C_100196_rb.field_105818_d
		// @E5: aload_0
		// @E6: getfield int[] game.C_100251_pm.field_102388_J
		// @E9: iload #5
		// @EB: iconst_0
		// @EC: iload #4
		// @EE: iconst_0
		// @EF: iload #7
		// @F1: iload #6
		// @F3: iload #8
		// @F5: iload #9
		// @F7: iload_3
		// @F8: invokestatic game.C_100251_pm.func_102392_b(int, int, int, int[], int[], int, int, int, int, int, int, int, int, int)void
		// @FB: return
	}
	
	private static final void func_102393_d(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11)
	{
		// @00: iload #11
		// @02: ldc 16711935 (0xff00ff)
		// @04: iand
		// @05: istore #12
		// @07: iload #11
		// @09: bipush 8 (0x08)
		// @0B: ishr
		// @0C: sipush 255 (0x00FF)
		// @0F: iand
		// @10: istore #13
		// @12: iload #8
		// @14: ineg
		// @15: istore #6
		// @17: iload #6
		// @19: ifge @CC
		// @1C: iload #7
		// @1E: ineg
		// @1F: istore #5
		// @21: iload #5
		// @23: ifge @BA
		// @26: aload_1
		// @27: iload_3
		// @28: iinc #3 +1
		// @2B: iaload
		// @2C: istore_2
		// @2D: iload_2
		// @2E: bipush 24 (0x18)
		// @30: iushr
		// @31: istore #14
		// @33: iload_2
		// @34: ldc 16777215 (0xffffff)
		// @36: iand
		// @37: istore_2
		// @38: iload #14
		// @3A: ifeq @B1
		// @3D: iconst_0
		// @3E: istore #15
		// @40: iload_2
		// @41: bipush 8 (0x08)
		// @43: ishr
		// @44: iload_2
		// @45: ldc 65535 (0xffff)
		// @47: iand
		// @48: if_icmpne @6A
		// @4B: iload_2
		// @4C: sipush 255 (0x00FF)
		// @4F: iand
		// @50: istore_2
		// @51: iload_2
		// @52: iload #12
		// @54: imul
		// @55: bipush 8 (0x08)
		// @57: ishr
		// @58: ldc 16711934 (0xff00fe)
		// @5A: iand
		// @5B: iload_2
		// @5C: iload #13
		// @5E: imul
		// @5F: ldc 65280 (0xff00)
		// @61: iand
		// @62: iadd
		// @63: iconst_1
		// @64: iadd
		// @65: istore #15
		// @67: goto @6D
		// @6A: iload_2
		// @6B: istore #15
		// @6D: sipush 256 (0x0100)
		// @70: iload #14
		// @72: isub
		// @73: istore #16
		// @75: aload_0
		// @76: iload #4
		// @78: iaload
		// @79: istore #17
		// @7B: aload_0
		// @7C: iload #4
		// @7E: iinc #4 +1
		// @81: iload #15
		// @83: ldc 16711935 (0xff00ff)
		// @85: iand
		// @86: iload #14
		// @88: imul
		// @89: iload #17
		// @8B: ldc 16711935 (0xff00ff)
		// @8D: iand
		// @8E: iload #16
		// @90: imul
		// @91: iadd
		// @92: ldc -16711936 (0xff00ff00)
		// @94: iand
		// @95: iload #15
		// @97: ldc 65280 (0xff00)
		// @99: iand
		// @9A: iload #14
		// @9C: imul
		// @9D: iload #17
		// @9F: ldc 65280 (0xff00)
		// @A1: iand
		// @A2: iload #16
		// @A4: imul
		// @A5: iadd
		// @A6: ldc 16711680 (0xff0000)
		// @A8: iand
		// @A9: iadd
		// @AA: bipush 8 (0x08)
		// @AC: iushr
		// @AD: iastore
		// @AE: goto @B4
		// @B1: iinc #4 +1
		// @B4: iinc #5 +1
		// @B7: goto @21
		// @BA: iload #4
		// @BC: iload #9
		// @BE: iadd
		// @BF: istore #4
		// @C1: iload_3
		// @C2: iload #10
		// @C4: iadd
		// @C5: istore_3
		// @C6: iinc #6 +1
		// @C9: goto @17
		// @CC: return
	}
	
	final void func_102359_a(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @000: iload_3
		// @001: ifle @009
		// @004: iload #4
		// @006: ifgt @00A
		// @009: return
		// @00A: aload_0
		// @00B: getfield int game.C_100251_pm.field_102339_s
		// @00E: istore #6
		// @010: aload_0
		// @011: getfield int game.C_100251_pm.field_102337_u
		// @014: istore #7
		// @016: iconst_0
		// @017: istore #8
		// @019: iconst_0
		// @01A: istore #9
		// @01C: aload_0
		// @01D: getfield int game.C_100251_pm.field_102341_y
		// @020: istore #10
		// @022: aload_0
		// @023: getfield int game.C_100251_pm.field_102340_z
		// @026: istore #11
		// @028: iload #10
		// @02A: bipush 16 (0x10)
		// @02C: ishl
		// @02D: iload_3
		// @02E: idiv
		// @02F: istore #12
		// @031: iload #11
		// @033: bipush 16 (0x10)
		// @035: ishl
		// @036: iload #4
		// @038: idiv
		// @039: istore #13
		// @03B: aload_0
		// @03C: getfield int game.C_100251_pm.field_102335_w
		// @03F: ifle @06A
		// @042: aload_0
		// @043: getfield int game.C_100251_pm.field_102335_w
		// @046: bipush 16 (0x10)
		// @048: ishl
		// @049: iload #12
		// @04B: iadd
		// @04C: iconst_1
		// @04D: isub
		// @04E: iload #12
		// @050: idiv
		// @051: istore #14
		// @053: iload_1
		// @054: iload #14
		// @056: iadd
		// @057: istore_1
		// @058: iload #8
		// @05A: iload #14
		// @05C: iload #12
		// @05E: imul
		// @05F: aload_0
		// @060: getfield int game.C_100251_pm.field_102335_w
		// @063: bipush 16 (0x10)
		// @065: ishl
		// @066: isub
		// @067: iadd
		// @068: istore #8
		// @06A: aload_0
		// @06B: getfield int game.C_100251_pm.field_102332_H
		// @06E: ifle @099
		// @071: aload_0
		// @072: getfield int game.C_100251_pm.field_102332_H
		// @075: bipush 16 (0x10)
		// @077: ishl
		// @078: iload #13
		// @07A: iadd
		// @07B: iconst_1
		// @07C: isub
		// @07D: iload #13
		// @07F: idiv
		// @080: istore #14
		// @082: iload_2
		// @083: iload #14
		// @085: iadd
		// @086: istore_2
		// @087: iload #9
		// @089: iload #14
		// @08B: iload #13
		// @08D: imul
		// @08E: aload_0
		// @08F: getfield int game.C_100251_pm.field_102332_H
		// @092: bipush 16 (0x10)
		// @094: ishl
		// @095: isub
		// @096: iadd
		// @097: istore #9
		// @099: iload #6
		// @09B: iload #10
		// @09D: if_icmpge @0B1
		// @0A0: iload #6
		// @0A2: bipush 16 (0x10)
		// @0A4: ishl
		// @0A5: iload #8
		// @0A7: isub
		// @0A8: iload #12
		// @0AA: iadd
		// @0AB: iconst_1
		// @0AC: isub
		// @0AD: iload #12
		// @0AF: idiv
		// @0B0: istore_3
		// @0B1: iload #7
		// @0B3: iload #11
		// @0B5: if_icmpge @0CA
		// @0B8: iload #7
		// @0BA: bipush 16 (0x10)
		// @0BC: ishl
		// @0BD: iload #9
		// @0BF: isub
		// @0C0: iload #13
		// @0C2: iadd
		// @0C3: iconst_1
		// @0C4: isub
		// @0C5: iload #13
		// @0C7: idiv
		// @0C8: istore #4
		// @0CA: iload_1
		// @0CB: iload_2
		// @0CC: getstatic int game.C_100196_rb.field_105819_e
		// @0CF: imul
		// @0D0: iadd
		// @0D1: istore #14
		// @0D3: getstatic int game.C_100196_rb.field_105819_e
		// @0D6: iload_3
		// @0D7: isub
		// @0D8: istore #15
		// @0DA: iload_2
		// @0DB: iload #4
		// @0DD: iadd
		// @0DE: getstatic int game.C_100196_rb.field_105823_l
		// @0E1: if_icmple @0F1
		// @0E4: iload #4
		// @0E6: iload_2
		// @0E7: iload #4
		// @0E9: iadd
		// @0EA: getstatic int game.C_100196_rb.field_105823_l
		// @0ED: isub
		// @0EE: isub
		// @0EF: istore #4
		// @0F1: iload_2
		// @0F2: getstatic int game.C_100196_rb.field_105816_f
		// @0F5: if_icmpge @11B
		// @0F8: getstatic int game.C_100196_rb.field_105816_f
		// @0FB: iload_2
		// @0FC: isub
		// @0FD: istore #16
		// @0FF: iload #4
		// @101: iload #16
		// @103: isub
		// @104: istore #4
		// @106: iload #14
		// @108: iload #16
		// @10A: getstatic int game.C_100196_rb.field_105819_e
		// @10D: imul
		// @10E: iadd
		// @10F: istore #14
		// @111: iload #9
		// @113: iload #13
		// @115: iload #16
		// @117: imul
		// @118: iadd
		// @119: istore #9
		// @11B: iload_1
		// @11C: iload_3
		// @11D: iadd
		// @11E: getstatic int game.C_100196_rb.field_105820_b
		// @121: if_icmple @139
		// @124: iload_1
		// @125: iload_3
		// @126: iadd
		// @127: getstatic int game.C_100196_rb.field_105820_b
		// @12A: isub
		// @12B: istore #16
		// @12D: iload_3
		// @12E: iload #16
		// @130: isub
		// @131: istore_3
		// @132: iload #15
		// @134: iload #16
		// @136: iadd
		// @137: istore #15
		// @139: iload_1
		// @13A: getstatic int game.C_100196_rb.field_105827_i
		// @13D: if_icmpge @164
		// @140: getstatic int game.C_100196_rb.field_105827_i
		// @143: iload_1
		// @144: isub
		// @145: istore #16
		// @147: iload_3
		// @148: iload #16
		// @14A: isub
		// @14B: istore_3
		// @14C: iload #14
		// @14E: iload #16
		// @150: iadd
		// @151: istore #14
		// @153: iload #8
		// @155: iload #12
		// @157: iload #16
		// @159: imul
		// @15A: iadd
		// @15B: istore #8
		// @15D: iload #15
		// @15F: iload #16
		// @161: iadd
		// @162: istore #15
		// @164: getstatic int[] game.C_100196_rb.field_105818_d
		// @167: aload_0
		// @168: getfield int[] game.C_100251_pm.field_102388_J
		// @16B: iconst_0
		// @16C: iload #8
		// @16E: iload #9
		// @170: iload #14
		// @172: iload #15
		// @174: iload_3
		// @175: iload #4
		// @177: iload #12
		// @179: iload #13
		// @17B: iload #6
		// @17D: iload #5
		// @17F: invokestatic game.C_100251_pm.func_102390_c(int[], int[], int, int, int, int, int, int, int, int, int, int, int)void
		// @182: return
	}
	
	private static final void func_102392_b(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13)
	{
		// @00: iload #10
		// @02: ineg
		// @03: istore #8
		// @05: iload #8
		// @07: ifge @9B
		// @0A: iload #9
		// @0C: ineg
		// @0D: istore #6
		// @0F: iload #6
		// @11: ifge @87
		// @14: aload #4
		// @16: iload #5
		// @18: iinc #5 +1
		// @1B: iaload
		// @1C: istore_0
		// @1D: iload_0
		// @1E: ifeq @7E
		// @21: iload #13
		// @23: iload_0
		// @24: bipush 24 (0x18)
		// @26: iushr
		// @27: imul
		// @28: bipush 8 (0x08)
		// @2A: ishr
		// @2B: sipush 255 (0x00FF)
		// @2E: iand
		// @2F: istore #14
		// @31: iload_0
		// @32: ldc 16711935 (0xff00ff)
		// @34: iand
		// @35: iload #14
		// @37: imul
		// @38: istore_1
		// @39: iload_1
		// @3A: ldc -16711936 (0xff00ff00)
		// @3C: iand
		// @3D: iload_0
		// @3E: iload #14
		// @40: imul
		// @41: iload_1
		// @42: isub
		// @43: ldc 16711680 (0xff0000)
		// @45: iand
		// @46: iadd
		// @47: bipush 8 (0x08)
		// @49: iushr
		// @4A: istore_0
		// @4B: aload_3
		// @4C: iload #7
		// @4E: iaload
		// @4F: istore_1
		// @50: iload_0
		// @51: iload_1
		// @52: iadd
		// @53: istore_2
		// @54: iload_0
		// @55: ldc 16711935 (0xff00ff)
		// @57: iand
		// @58: iload_1
		// @59: ldc 16711935 (0xff00ff)
		// @5B: iand
		// @5C: iadd
		// @5D: istore_0
		// @5E: iload_0
		// @5F: ldc 16777472 (0x1000100)
		// @61: iand
		// @62: iload_2
		// @63: iload_0
		// @64: isub
		// @65: ldc 65536 (0x10000)
		// @67: iand
		// @68: iadd
		// @69: istore_1
		// @6A: aload_3
		// @6B: iload #7
		// @6D: iinc #7 +1
		// @70: iload_2
		// @71: iload_1
		// @72: isub
		// @73: iload_1
		// @74: iload_1
		// @75: bipush 8 (0x08)
		// @77: iushr
		// @78: isub
		// @79: ior
		// @7A: iastore
		// @7B: goto @81
		// @7E: iinc #7 +1
		// @81: iinc #6 +1
		// @84: goto @0F
		// @87: iload #7
		// @89: iload #11
		// @8B: iadd
		// @8C: istore #7
		// @8E: iload #5
		// @90: iload #12
		// @92: iadd
		// @93: istore #5
		// @95: iinc #8 +1
		// @98: goto @05
		// @9B: return
	}
	
	final void func_102386_f(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100251_pm.field_102335_w
		// @05: iadd
		// @06: istore_1
		// @07: iload_2
		// @08: aload_0
		// @09: getfield int game.C_100251_pm.field_102332_H
		// @0C: iadd
		// @0D: istore_2
		// @0E: iload_1
		// @0F: iload_2
		// @10: getstatic int game.C_100196_rb.field_105819_e
		// @13: imul
		// @14: iadd
		// @15: istore_3
		// @16: iconst_0
		// @17: istore #4
		// @19: aload_0
		// @1A: getfield int game.C_100251_pm.field_102337_u
		// @1D: istore #5
		// @1F: aload_0
		// @20: getfield int game.C_100251_pm.field_102339_s
		// @23: istore #6
		// @25: getstatic int game.C_100196_rb.field_105819_e
		// @28: iload #6
		// @2A: isub
		// @2B: istore #7
		// @2D: iconst_0
		// @2E: istore #8
		// @30: iload_2
		// @31: getstatic int game.C_100196_rb.field_105816_f
		// @34: if_icmpge @5C
		// @37: getstatic int game.C_100196_rb.field_105816_f
		// @3A: iload_2
		// @3B: isub
		// @3C: istore #9
		// @3E: iload #5
		// @40: iload #9
		// @42: isub
		// @43: istore #5
		// @45: getstatic int game.C_100196_rb.field_105816_f
		// @48: istore_2
		// @49: iload #4
		// @4B: iload #9
		// @4D: iload #6
		// @4F: imul
		// @50: iadd
		// @51: istore #4
		// @53: iload_3
		// @54: iload #9
		// @56: getstatic int game.C_100196_rb.field_105819_e
		// @59: imul
		// @5A: iadd
		// @5B: istore_3
		// @5C: iload_2
		// @5D: iload #5
		// @5F: iadd
		// @60: getstatic int game.C_100196_rb.field_105823_l
		// @63: if_icmple @73
		// @66: iload #5
		// @68: iload_2
		// @69: iload #5
		// @6B: iadd
		// @6C: getstatic int game.C_100196_rb.field_105823_l
		// @6F: isub
		// @70: isub
		// @71: istore #5
		// @73: iload_1
		// @74: getstatic int game.C_100196_rb.field_105827_i
		// @77: if_icmpge @A6
		// @7A: getstatic int game.C_100196_rb.field_105827_i
		// @7D: iload_1
		// @7E: isub
		// @7F: istore #9
		// @81: iload #6
		// @83: iload #9
		// @85: isub
		// @86: istore #6
		// @88: getstatic int game.C_100196_rb.field_105827_i
		// @8B: istore_1
		// @8C: iload #4
		// @8E: iload #9
		// @90: iadd
		// @91: istore #4
		// @93: iload_3
		// @94: iload #9
		// @96: iadd
		// @97: istore_3
		// @98: iload #8
		// @9A: iload #9
		// @9C: iadd
		// @9D: istore #8
		// @9F: iload #7
		// @A1: iload #9
		// @A3: iadd
		// @A4: istore #7
		// @A6: iload_1
		// @A7: iload #6
		// @A9: iadd
		// @AA: getstatic int game.C_100196_rb.field_105820_b
		// @AD: if_icmple @CF
		// @B0: iload_1
		// @B1: iload #6
		// @B3: iadd
		// @B4: getstatic int game.C_100196_rb.field_105820_b
		// @B7: isub
		// @B8: istore #9
		// @BA: iload #6
		// @BC: iload #9
		// @BE: isub
		// @BF: istore #6
		// @C1: iload #8
		// @C3: iload #9
		// @C5: iadd
		// @C6: istore #8
		// @C8: iload #7
		// @CA: iload #9
		// @CC: iadd
		// @CD: istore #7
		// @CF: iload #6
		// @D1: ifle @D9
		// @D4: iload #5
		// @D6: ifgt @DA
		// @D9: return
		// @DA: getstatic int[] game.C_100196_rb.field_105818_d
		// @DD: aload_0
		// @DE: getfield int[] game.C_100251_pm.field_102388_J
		// @E1: iconst_0
		// @E2: iload #4
		// @E4: iload_3
		// @E5: iload #6
		// @E7: iload #5
		// @E9: iload #7
		// @EB: iload #8
		// @ED: invokestatic game.C_100251_pm.func_102391_e(int[], int[], int, int, int, int, int, int, int)void
		// @F0: return
	}
	
	C_100251_pm(int arg0, int arg1)
	{
		// @0: aload_0
		// @1: iload_1
		// @2: iload_2
		// @3: invokespecial game.C_100037_wb.<init>(int, int)void
		// @6: return
	}
	
	C_100251_pm(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iload_2
		// @03: iload_3
		// @04: iload #4
		// @06: iload #5
		// @08: iload #6
		// @0A: aload #7
		// @0C: invokespecial game.C_100037_wb.<init>(int, int, int, int, int, int, int[])void
		// @0F: return
	}
	
	private static final void func_102394_d(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8)
	{
		// @00: iload #5
		// @02: ineg
		// @03: istore #9
		// @05: iload #6
		// @07: ineg
		// @08: istore #10
		// @0A: iload #10
		// @0C: ifge @87
		// @0F: iload #9
		// @11: istore #11
		// @13: iload #11
		// @15: ifge @75
		// @18: aload_1
		// @19: iload_3
		// @1A: iinc #3 +255
		// @1D: iaload
		// @1E: istore_2
		// @1F: iload_2
		// @20: bipush 24 (0x18)
		// @22: iushr
		// @23: istore #12
		// @25: iload #12
		// @27: ifeq @6C
		// @2A: sipush 256 (0x0100)
		// @2D: iload #12
		// @2F: isub
		// @30: istore #13
		// @32: aload_0
		// @33: iload #4
		// @35: iaload
		// @36: istore #14
		// @38: aload_0
		// @39: iload #4
		// @3B: iinc #4 +1
		// @3E: iload_2
		// @3F: ldc 16711935 (0xff00ff)
		// @41: iand
		// @42: iload #12
		// @44: imul
		// @45: iload #14
		// @47: ldc 16711935 (0xff00ff)
		// @49: iand
		// @4A: iload #13
		// @4C: imul
		// @4D: iadd
		// @4E: ldc -16711936 (0xff00ff00)
		// @50: iand
		// @51: iload_2
		// @52: ldc 65280 (0xff00)
		// @54: iand
		// @55: iload #12
		// @57: imul
		// @58: iload #14
		// @5A: ldc 65280 (0xff00)
		// @5C: iand
		// @5D: iload #13
		// @5F: imul
		// @60: iadd
		// @61: ldc 16711680 (0xff0000)
		// @63: iand
		// @64: iadd
		// @65: bipush 8 (0x08)
		// @67: iushr
		// @68: iastore
		// @69: goto @6F
		// @6C: iinc #4 +1
		// @6F: iinc #11 +1
		// @72: goto @13
		// @75: iload #4
		// @77: iload #7
		// @79: iadd
		// @7A: istore #4
		// @7C: iload_3
		// @7D: iload #8
		// @7F: iadd
		// @80: istore_3
		// @81: iinc #10 +1
		// @84: goto @0A
		// @87: return
	}
	
	final void func_102348_e(int arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100251_pm.field_102335_w
		// @05: iadd
		// @06: istore_1
		// @07: iload_2
		// @08: aload_0
		// @09: getfield int game.C_100251_pm.field_102332_H
		// @0C: iadd
		// @0D: istore_2
		// @0E: iload_1
		// @0F: iload_2
		// @10: getstatic int game.C_100196_rb.field_105819_e
		// @13: imul
		// @14: iadd
		// @15: istore #4
		// @17: iconst_0
		// @18: istore #5
		// @1A: aload_0
		// @1B: getfield int game.C_100251_pm.field_102337_u
		// @1E: istore #6
		// @20: aload_0
		// @21: getfield int game.C_100251_pm.field_102339_s
		// @24: istore #7
		// @26: getstatic int game.C_100196_rb.field_105819_e
		// @29: iload #7
		// @2B: isub
		// @2C: istore #8
		// @2E: iconst_0
		// @2F: istore #9
		// @31: iload_2
		// @32: getstatic int game.C_100196_rb.field_105816_f
		// @35: if_icmpge @5F
		// @38: getstatic int game.C_100196_rb.field_105816_f
		// @3B: iload_2
		// @3C: isub
		// @3D: istore #10
		// @3F: iload #6
		// @41: iload #10
		// @43: isub
		// @44: istore #6
		// @46: getstatic int game.C_100196_rb.field_105816_f
		// @49: istore_2
		// @4A: iload #5
		// @4C: iload #10
		// @4E: iload #7
		// @50: imul
		// @51: iadd
		// @52: istore #5
		// @54: iload #4
		// @56: iload #10
		// @58: getstatic int game.C_100196_rb.field_105819_e
		// @5B: imul
		// @5C: iadd
		// @5D: istore #4
		// @5F: iload_2
		// @60: iload #6
		// @62: iadd
		// @63: getstatic int game.C_100196_rb.field_105823_l
		// @66: if_icmple @76
		// @69: iload #6
		// @6B: iload_2
		// @6C: iload #6
		// @6E: iadd
		// @6F: getstatic int game.C_100196_rb.field_105823_l
		// @72: isub
		// @73: isub
		// @74: istore #6
		// @76: iload_1
		// @77: getstatic int game.C_100196_rb.field_105827_i
		// @7A: if_icmpge @AB
		// @7D: getstatic int game.C_100196_rb.field_105827_i
		// @80: iload_1
		// @81: isub
		// @82: istore #10
		// @84: iload #7
		// @86: iload #10
		// @88: isub
		// @89: istore #7
		// @8B: getstatic int game.C_100196_rb.field_105827_i
		// @8E: istore_1
		// @8F: iload #5
		// @91: iload #10
		// @93: iadd
		// @94: istore #5
		// @96: iload #4
		// @98: iload #10
		// @9A: iadd
		// @9B: istore #4
		// @9D: iload #9
		// @9F: iload #10
		// @A1: iadd
		// @A2: istore #9
		// @A4: iload #8
		// @A6: iload #10
		// @A8: iadd
		// @A9: istore #8
		// @AB: iload_1
		// @AC: iload #7
		// @AE: iadd
		// @AF: getstatic int game.C_100196_rb.field_105820_b
		// @B2: if_icmple @D4
		// @B5: iload_1
		// @B6: iload #7
		// @B8: iadd
		// @B9: getstatic int game.C_100196_rb.field_105820_b
		// @BC: isub
		// @BD: istore #10
		// @BF: iload #7
		// @C1: iload #10
		// @C3: isub
		// @C4: istore #7
		// @C6: iload #9
		// @C8: iload #10
		// @CA: iadd
		// @CB: istore #9
		// @CD: iload #8
		// @CF: iload #10
		// @D1: iadd
		// @D2: istore #8
		// @D4: iload #7
		// @D6: ifle @DE
		// @D9: iload #6
		// @DB: ifgt @DF
		// @DE: return
		// @DF: getstatic int[] game.C_100196_rb.field_105818_d
		// @E2: aload_0
		// @E3: getfield int[] game.C_100251_pm.field_102388_J
		// @E6: iconst_0
		// @E7: iload #5
		// @E9: iload #4
		// @EB: iload #7
		// @ED: iload #6
		// @EF: iload #8
		// @F1: iload #9
		// @F3: iload_3
		// @F4: invokestatic game.C_100251_pm.func_102396_c(int[], int[], int, int, int, int, int, int, int, int)void
		// @F7: return
	}
	
	private static final void func_102389_d(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9)
	{
		// @00: iload #6
		// @02: ineg
		// @03: istore #10
		// @05: iload #10
		// @07: ifge @83
		// @0A: iload #5
		// @0C: ineg
		// @0D: istore #11
		// @0F: iload #11
		// @11: ifge @71
		// @14: aload_1
		// @15: iload_3
		// @16: iaload
		// @17: bipush 24 (0x18)
		// @19: iushr
		// @1A: iload #9
		// @1C: imul
		// @1D: bipush 8 (0x08)
		// @1F: ishr
		// @20: istore #12
		// @22: sipush 256 (0x0100)
		// @25: iload #12
		// @27: isub
		// @28: istore #13
		// @2A: aload_1
		// @2B: iload_3
		// @2C: iinc #3 +1
		// @2F: iaload
		// @30: istore #14
		// @32: aload_0
		// @33: iload #4
		// @35: iaload
		// @36: istore #15
		// @38: aload_0
		// @39: iload #4
		// @3B: iinc #4 +1
		// @3E: iload #14
		// @40: ldc 16711935 (0xff00ff)
		// @42: iand
		// @43: iload #12
		// @45: imul
		// @46: iload #15
		// @48: ldc 16711935 (0xff00ff)
		// @4A: iand
		// @4B: iload #13
		// @4D: imul
		// @4E: iadd
		// @4F: ldc -16711936 (0xff00ff00)
		// @51: iand
		// @52: iload #14
		// @54: ldc 65280 (0xff00)
		// @56: iand
		// @57: iload #12
		// @59: imul
		// @5A: iload #15
		// @5C: ldc 65280 (0xff00)
		// @5E: iand
		// @5F: iload #13
		// @61: imul
		// @62: iadd
		// @63: ldc 16711680 (0xff0000)
		// @65: iand
		// @66: iadd
		// @67: bipush 8 (0x08)
		// @69: iushr
		// @6A: iastore
		// @6B: iinc #11 +1
		// @6E: goto @0F
		// @71: iload #4
		// @73: iload #7
		// @75: iadd
		// @76: istore #4
		// @78: iload_3
		// @79: iload #8
		// @7B: iadd
		// @7C: istore_3
		// @7D: iinc #10 +1
		// @80: goto @05
		// @83: return
	}
	
	private static final void func_102395_c(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11)
	{
		// @00: iload_3
		// @01: istore #12
		// @03: iload #8
		// @05: ineg
		// @06: istore #13
		// @08: iload #13
		// @0A: ifge @9D
		// @0D: iload #4
		// @0F: bipush 16 (0x10)
		// @11: ishr
		// @12: iload #11
		// @14: imul
		// @15: istore #14
		// @17: iload #7
		// @19: ineg
		// @1A: istore #15
		// @1C: iload #15
		// @1E: ifge @86
		// @21: aload_1
		// @22: iload_3
		// @23: bipush 16 (0x10)
		// @25: ishr
		// @26: iload #14
		// @28: iadd
		// @29: iaload
		// @2A: istore_2
		// @2B: iload_2
		// @2C: bipush 24 (0x18)
		// @2E: iushr
		// @2F: istore #16
		// @31: iload #16
		// @33: ifeq @78
		// @36: sipush 256 (0x0100)
		// @39: iload #16
		// @3B: isub
		// @3C: istore #17
		// @3E: aload_0
		// @3F: iload #5
		// @41: iaload
		// @42: istore #18
		// @44: aload_0
		// @45: iload #5
		// @47: iinc #5 +1
		// @4A: iload_2
		// @4B: ldc 16711935 (0xff00ff)
		// @4D: iand
		// @4E: iload #16
		// @50: imul
		// @51: iload #18
		// @53: ldc 16711935 (0xff00ff)
		// @55: iand
		// @56: iload #17
		// @58: imul
		// @59: iadd
		// @5A: ldc -16711936 (0xff00ff00)
		// @5C: iand
		// @5D: iload_2
		// @5E: ldc 65280 (0xff00)
		// @60: iand
		// @61: iload #16
		// @63: imul
		// @64: iload #18
		// @66: ldc 65280 (0xff00)
		// @68: iand
		// @69: iload #17
		// @6B: imul
		// @6C: iadd
		// @6D: ldc 16711680 (0xff0000)
		// @6F: iand
		// @70: iadd
		// @71: bipush 8 (0x08)
		// @73: iushr
		// @74: iastore
		// @75: goto @7B
		// @78: iinc #5 +1
		// @7B: iload_3
		// @7C: iload #9
		// @7E: iadd
		// @7F: istore_3
		// @80: iinc #15 +1
		// @83: goto @1C
		// @86: iload #4
		// @88: iload #10
		// @8A: iadd
		// @8B: istore #4
		// @8D: iload #12
		// @8F: istore_3
		// @90: iload #5
		// @92: iload #6
		// @94: iadd
		// @95: istore #5
		// @97: iinc #13 +1
		// @9A: goto @08
		// @9D: return
	}
}
