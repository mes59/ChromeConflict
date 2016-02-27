package game;

import java.awt.Component;

class C_100037_wb extends C_100249_pc
{
	int[] field_102388_J;
	
	final void func_102343_b(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: iconst_0
		// @01: istore #5
		// @03: iload #5
		// @05: iload #4
		// @07: if_icmpge @36
		// @0A: iconst_0
		// @0B: istore #6
		// @0D: iload #6
		// @0F: iload_3
		// @10: if_icmpge @30
		// @13: aload_0
		// @14: iload_1
		// @15: iload #6
		// @17: aload_0
		// @18: getfield int game.C_100037_wb.field_102341_y
		// @1B: imul
		// @1C: iadd
		// @1D: iload_2
		// @1E: iload #5
		// @20: aload_0
		// @21: getfield int game.C_100037_wb.field_102340_z
		// @24: imul
		// @25: iadd
		// @26: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @29: iinc #6 +1
		// @2C: goto @0D
		// @2F: athrow
		// @30: iinc #5 +1
		// @33: goto @03
		// @36: return
	}
	
	void func_102359_a(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @000: iload_3
		// @001: ifle @00D
		// @004: iload #4
		// @006: ifgt @00F
		// @009: goto @00D
		// @00C: athrow
		// @00D: return
		// @00E: athrow
		// @00F: aload_0
		// @010: getfield int game.C_100037_wb.field_102339_s
		// @013: istore #6
		// @015: aload_0
		// @016: getfield int game.C_100037_wb.field_102337_u
		// @019: istore #7
		// @01B: iconst_0
		// @01C: istore #8
		// @01E: iconst_0
		// @01F: istore #9
		// @021: aload_0
		// @022: getfield int game.C_100037_wb.field_102341_y
		// @025: istore #10
		// @027: aload_0
		// @028: getfield int game.C_100037_wb.field_102340_z
		// @02B: istore #11
		// @02D: iload #10
		// @02F: bipush 16 (0x10)
		// @031: ishl
		// @032: iload_3
		// @033: idiv
		// @034: istore #12
		// @036: iload #11
		// @038: bipush 16 (0x10)
		// @03A: ishl
		// @03B: iload #4
		// @03D: idiv
		// @03E: istore #13
		// @040: aload_0
		// @041: getfield int game.C_100037_wb.field_102335_w
		// @044: ifle @06F
		// @047: aload_0
		// @048: getfield int game.C_100037_wb.field_102335_w
		// @04B: bipush 16 (0x10)
		// @04D: ishl
		// @04E: iload #12
		// @050: iadd
		// @051: iconst_1
		// @052: isub
		// @053: iload #12
		// @055: idiv
		// @056: istore #14
		// @058: iload_1
		// @059: iload #14
		// @05B: iadd
		// @05C: istore_1
		// @05D: iload #8
		// @05F: iload #14
		// @061: iload #12
		// @063: imul
		// @064: aload_0
		// @065: getfield int game.C_100037_wb.field_102335_w
		// @068: bipush 16 (0x10)
		// @06A: ishl
		// @06B: isub
		// @06C: iadd
		// @06D: istore #8
		// @06F: aload_0
		// @070: getfield int game.C_100037_wb.field_102332_H
		// @073: ifle @09E
		// @076: aload_0
		// @077: getfield int game.C_100037_wb.field_102332_H
		// @07A: bipush 16 (0x10)
		// @07C: ishl
		// @07D: iload #13
		// @07F: iadd
		// @080: iconst_1
		// @081: isub
		// @082: iload #13
		// @084: idiv
		// @085: istore #14
		// @087: iload_2
		// @088: iload #14
		// @08A: iadd
		// @08B: istore_2
		// @08C: iload #9
		// @08E: iload #14
		// @090: iload #13
		// @092: imul
		// @093: aload_0
		// @094: getfield int game.C_100037_wb.field_102332_H
		// @097: bipush 16 (0x10)
		// @099: ishl
		// @09A: isub
		// @09B: iadd
		// @09C: istore #9
		// @09E: iload #6
		// @0A0: iload #10
		// @0A2: if_icmpge @0B6
		// @0A5: iload #6
		// @0A7: bipush 16 (0x10)
		// @0A9: ishl
		// @0AA: iload #8
		// @0AC: isub
		// @0AD: iload #12
		// @0AF: iadd
		// @0B0: iconst_1
		// @0B1: isub
		// @0B2: iload #12
		// @0B4: idiv
		// @0B5: istore_3
		// @0B6: iload #7
		// @0B8: iload #11
		// @0BA: if_icmpge @0CF
		// @0BD: iload #7
		// @0BF: bipush 16 (0x10)
		// @0C1: ishl
		// @0C2: iload #9
		// @0C4: isub
		// @0C5: iload #13
		// @0C7: iadd
		// @0C8: iconst_1
		// @0C9: isub
		// @0CA: iload #13
		// @0CC: idiv
		// @0CD: istore #4
		// @0CF: iload_1
		// @0D0: iload_2
		// @0D1: getstatic int game.C_100196_rb.field_105819_e
		// @0D4: imul
		// @0D5: iadd
		// @0D6: istore #14
		// @0D8: getstatic int game.C_100196_rb.field_105819_e
		// @0DB: iload_3
		// @0DC: isub
		// @0DD: istore #15
		// @0DF: iload_2
		// @0E0: iload #4
		// @0E2: iadd
		// @0E3: getstatic int game.C_100196_rb.field_105823_l
		// @0E6: if_icmple @0F6
		// @0E9: iload #4
		// @0EB: iload_2
		// @0EC: iload #4
		// @0EE: iadd
		// @0EF: getstatic int game.C_100196_rb.field_105823_l
		// @0F2: isub
		// @0F3: isub
		// @0F4: istore #4
		// @0F6: iload_2
		// @0F7: getstatic int game.C_100196_rb.field_105816_f
		// @0FA: if_icmpge @120
		// @0FD: getstatic int game.C_100196_rb.field_105816_f
		// @100: iload_2
		// @101: isub
		// @102: istore #16
		// @104: iload #4
		// @106: iload #16
		// @108: isub
		// @109: istore #4
		// @10B: iload #14
		// @10D: iload #16
		// @10F: getstatic int game.C_100196_rb.field_105819_e
		// @112: imul
		// @113: iadd
		// @114: istore #14
		// @116: iload #9
		// @118: iload #13
		// @11A: iload #16
		// @11C: imul
		// @11D: iadd
		// @11E: istore #9
		// @120: iload_1
		// @121: iload_3
		// @122: iadd
		// @123: getstatic int game.C_100196_rb.field_105820_b
		// @126: if_icmple @13E
		// @129: iload_1
		// @12A: iload_3
		// @12B: iadd
		// @12C: getstatic int game.C_100196_rb.field_105820_b
		// @12F: isub
		// @130: istore #16
		// @132: iload_3
		// @133: iload #16
		// @135: isub
		// @136: istore_3
		// @137: iload #15
		// @139: iload #16
		// @13B: iadd
		// @13C: istore #15
		// @13E: iload_1
		// @13F: getstatic int game.C_100196_rb.field_105827_i
		// @142: if_icmpge @169
		// @145: getstatic int game.C_100196_rb.field_105827_i
		// @148: iload_1
		// @149: isub
		// @14A: istore #16
		// @14C: iload_3
		// @14D: iload #16
		// @14F: isub
		// @150: istore_3
		// @151: iload #14
		// @153: iload #16
		// @155: iadd
		// @156: istore #14
		// @158: iload #8
		// @15A: iload #12
		// @15C: iload #16
		// @15E: imul
		// @15F: iadd
		// @160: istore #8
		// @162: iload #15
		// @164: iload #16
		// @166: iadd
		// @167: istore #15
		// @169: getstatic int[] game.C_100196_rb.field_105818_d
		// @16C: aload_0
		// @16D: getfield int[] game.C_100037_wb.field_102388_J
		// @170: iconst_0
		// @171: iload #8
		// @173: iload #9
		// @175: iload #14
		// @177: iload #15
		// @179: iload_3
		// @17A: iload #4
		// @17C: iload #12
		// @17E: iload #13
		// @180: iload #6
		// @182: iload #5
		// @184: invokestatic game.C_100037_wb.func_102355_b(int[], int[], int, int, int, int, int, int, int, int, int, int, int)void
		// @187: return
	}
	
	private static final void func_102358_a(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12)
	{
		// @00: iload #10
		// @02: ineg
		// @03: istore #8
		// @05: iload #8
		// @07: ifge @71
		// @0A: iload #9
		// @0C: ineg
		// @0D: istore #6
		// @0F: iload #6
		// @11: ifge @5D
		// @14: aload #4
		// @16: iload #5
		// @18: iinc #5 +1
		// @1B: iaload
		// @1C: istore_0
		// @1D: iload_0
		// @1E: ifeq @54
		// @21: aload_3
		// @22: iload #7
		// @24: iaload
		// @25: istore_1
		// @26: iload_0
		// @27: iload_1
		// @28: iadd
		// @29: istore_2
		// @2A: iload_0
		// @2B: ldc 16711935 (0xff00ff)
		// @2D: iand
		// @2E: iload_1
		// @2F: ldc 16711935 (0xff00ff)
		// @31: iand
		// @32: iadd
		// @33: istore_0
		// @34: iload_0
		// @35: ldc 16777472 (0x1000100)
		// @37: iand
		// @38: iload_2
		// @39: iload_0
		// @3A: isub
		// @3B: ldc 65536 (0x10000)
		// @3D: iand
		// @3E: iadd
		// @3F: istore_1
		// @40: aload_3
		// @41: iload #7
		// @43: iinc #7 +1
		// @46: iload_2
		// @47: iload_1
		// @48: isub
		// @49: iload_1
		// @4A: iload_1
		// @4B: bipush 8 (0x08)
		// @4D: iushr
		// @4E: isub
		// @4F: ior
		// @50: iastore
		// @51: goto @57
		// @54: iinc #7 +1
		// @57: iinc #6 +1
		// @5A: goto @0F
		// @5D: iload #7
		// @5F: iload #11
		// @61: iadd
		// @62: istore #7
		// @64: iload #5
		// @66: iload #12
		// @68: iadd
		// @69: istore #5
		// @6B: iinc #8 +1
		// @6E: goto @05
		// @71: return
	}
	
	void func_102378_b(int arg0, int arg1)
	{
		// @000: aload_0
		// @001: getfield int game.C_100037_wb.field_102339_s
		// @004: iconst_2
		// @005: ishr
		// @006: istore_3
		// @007: aload_0
		// @008: getfield int game.C_100037_wb.field_102337_u
		// @00B: iconst_2
		// @00C: ishr
		// @00D: istore #4
		// @00F: iload_1
		// @010: aload_0
		// @011: getfield int game.C_100037_wb.field_102335_w
		// @014: iconst_4
		// @015: idiv
		// @016: iadd
		// @017: istore_1
		// @018: iload_2
		// @019: aload_0
		// @01A: getfield int game.C_100037_wb.field_102332_H
		// @01D: iconst_4
		// @01E: idiv
		// @01F: iadd
		// @020: istore_2
		// @021: iload_1
		// @022: getstatic int game.C_100196_rb.field_105827_i
		// @025: if_icmpge @033
		// @028: getstatic int game.C_100196_rb.field_105827_i
		// @02B: iload_1
		// @02C: isub
		// @02D: iconst_2
		// @02E: ishl
		// @02F: goto @034
		// @032: athrow
		// @033: iconst_0
		// @034: istore #5
		// @036: iload_1
		// @037: iload_3
		// @038: iadd
		// @039: getstatic int game.C_100196_rb.field_105820_b
		// @03C: if_icmple @04C
		// @03F: getstatic int game.C_100196_rb.field_105820_b
		// @042: iload_1
		// @043: isub
		// @044: iconst_2
		// @045: ishl
		// @046: iconst_4
		// @047: isub
		// @048: goto @052
		// @04B: athrow
		// @04C: aload_0
		// @04D: getfield int game.C_100037_wb.field_102339_s
		// @050: iconst_4
		// @051: isub
		// @052: istore #6
		// @054: iload_2
		// @055: getstatic int game.C_100196_rb.field_105816_f
		// @058: if_icmpge @066
		// @05B: getstatic int game.C_100196_rb.field_105816_f
		// @05E: iload_2
		// @05F: isub
		// @060: iconst_2
		// @061: ishl
		// @062: goto @067
		// @065: athrow
		// @066: iconst_0
		// @067: istore #7
		// @069: iload_2
		// @06A: iload #4
		// @06C: iadd
		// @06D: getstatic int game.C_100196_rb.field_105823_l
		// @070: if_icmple @080
		// @073: getstatic int game.C_100196_rb.field_105823_l
		// @076: iload_2
		// @077: isub
		// @078: iconst_2
		// @079: ishl
		// @07A: iconst_4
		// @07B: isub
		// @07C: goto @086
		// @07F: athrow
		// @080: aload_0
		// @081: getfield int game.C_100037_wb.field_102337_u
		// @084: iconst_4
		// @085: isub
		// @086: istore #8
		// @088: iload #7
		// @08A: istore #9
		// @08C: iload #9
		// @08E: iload #8
		// @090: if_icmpgt @13E
		// @093: iload #9
		// @095: aload_0
		// @096: getfield int game.C_100037_wb.field_102339_s
		// @099: imul
		// @09A: iload #5
		// @09C: iadd
		// @09D: istore #10
		// @09F: iload_2
		// @0A0: iload #9
		// @0A2: iconst_2
		// @0A3: ishr
		// @0A4: iadd
		// @0A5: getstatic int game.C_100196_rb.field_105819_e
		// @0A8: imul
		// @0A9: iload_1
		// @0AA: iload #5
		// @0AC: iconst_2
		// @0AD: ishr
		// @0AE: iadd
		// @0AF: iadd
		// @0B0: istore #11
		// @0B2: iload #5
		// @0B4: istore #12
		// @0B6: iload #12
		// @0B8: iload #6
		// @0BA: if_icmpgt @138
		// @0BD: iconst_0
		// @0BE: istore #13
		// @0C0: iconst_0
		// @0C1: istore #14
		// @0C3: iconst_0
		// @0C4: istore #15
		// @0C6: iconst_0
		// @0C7: istore #16
		// @0C9: iload #16
		// @0CB: iconst_4
		// @0CC: if_icmpge @119
		// @0CF: iconst_0
		// @0D0: istore #17
		// @0D2: iload #17
		// @0D4: iconst_4
		// @0D5: if_icmpge @113
		// @0D8: aload_0
		// @0D9: getfield int[] game.C_100037_wb.field_102388_J
		// @0DC: iload #10
		// @0DE: iload #16
		// @0E0: aload_0
		// @0E1: getfield int game.C_100037_wb.field_102339_s
		// @0E4: imul
		// @0E5: iadd
		// @0E6: iload #17
		// @0E8: iadd
		// @0E9: iaload
		// @0EA: istore #13
		// @0EC: iload #13
		// @0EE: ifne @0F9
		// @0F1: getstatic int[] game.C_100196_rb.field_105818_d
		// @0F4: iload #11
		// @0F6: iaload
		// @0F7: istore #13
		// @0F9: iload #14
		// @0FB: iload #13
		// @0FD: ldc 16711935 (0xff00ff)
		// @0FF: iand
		// @100: iadd
		// @101: istore #14
		// @103: iload #15
		// @105: iload #13
		// @107: ldc 65280 (0xff00)
		// @109: iand
		// @10A: iadd
		// @10B: istore #15
		// @10D: iinc #17 +1
		// @110: goto @0D2
		// @113: iinc #16 +1
		// @116: goto @0C9
		// @119: getstatic int[] game.C_100196_rb.field_105818_d
		// @11C: iload #11
		// @11E: iload #14
		// @120: ldc 267390960 (0xff00ff0)
		// @122: iand
		// @123: iload #15
		// @125: ldc 1044480 (0xff000)
		// @127: iand
		// @128: ior
		// @129: iconst_4
		// @12A: ishr
		// @12B: iastore
		// @12C: iinc #12 +4
		// @12F: iinc #10 +4
		// @132: iinc #11 +1
		// @135: goto @0B6
		// @138: iinc #9 +4
		// @13B: goto @08C
		// @13E: return
	}
	
	private static final void func_102355_b(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12)
	{
		// @00: sipush 256 (0x0100)
		// @03: iload #12
		// @05: isub
		// @06: istore #13
		// @08: iload_3
		// @09: istore #14
		// @0B: iload #8
		// @0D: ineg
		// @0E: istore #15
		// @10: iload #15
		// @12: ifge @96
		// @15: iload #4
		// @17: bipush 16 (0x10)
		// @19: ishr
		// @1A: iload #11
		// @1C: imul
		// @1D: istore #16
		// @1F: iload #7
		// @21: ineg
		// @22: istore #17
		// @24: iload #17
		// @26: ifge @7F
		// @29: aload_1
		// @2A: iload_3
		// @2B: bipush 16 (0x10)
		// @2D: ishr
		// @2E: iload #16
		// @30: iadd
		// @31: iaload
		// @32: istore_2
		// @33: iload_2
		// @34: ifeq @71
		// @37: aload_0
		// @38: iload #5
		// @3A: iaload
		// @3B: istore #18
		// @3D: aload_0
		// @3E: iload #5
		// @40: iinc #5 +1
		// @43: iload_2
		// @44: ldc 16711935 (0xff00ff)
		// @46: iand
		// @47: iload #12
		// @49: imul
		// @4A: iload #18
		// @4C: ldc 16711935 (0xff00ff)
		// @4E: iand
		// @4F: iload #13
		// @51: imul
		// @52: iadd
		// @53: ldc -16711936 (0xff00ff00)
		// @55: iand
		// @56: iload_2
		// @57: ldc 65280 (0xff00)
		// @59: iand
		// @5A: iload #12
		// @5C: imul
		// @5D: iload #18
		// @5F: ldc 65280 (0xff00)
		// @61: iand
		// @62: iload #13
		// @64: imul
		// @65: iadd
		// @66: ldc 16711680 (0xff0000)
		// @68: iand
		// @69: iadd
		// @6A: bipush 8 (0x08)
		// @6C: ishr
		// @6D: iastore
		// @6E: goto @74
		// @71: iinc #5 +1
		// @74: iload_3
		// @75: iload #9
		// @77: iadd
		// @78: istore_3
		// @79: iinc #17 +1
		// @7C: goto @24
		// @7F: iload #4
		// @81: iload #10
		// @83: iadd
		// @84: istore #4
		// @86: iload #14
		// @88: istore_3
		// @89: iload #5
		// @8B: iload #6
		// @8D: iadd
		// @8E: istore #5
		// @90: iinc #15 +1
		// @93: goto @10
		// @96: return
	}
	
	void func_102353_h(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100037_wb.field_102335_w
		// @05: iadd
		// @06: istore_1
		// @07: iload_2
		// @08: aload_0
		// @09: getfield int game.C_100037_wb.field_102332_H
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
		// @1A: getfield int game.C_100037_wb.field_102337_u
		// @1D: istore #5
		// @1F: aload_0
		// @20: getfield int game.C_100037_wb.field_102339_s
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
		// @D1: ifle @DD
		// @D4: iload #5
		// @D6: ifgt @DF
		// @D9: goto @DD
		// @DC: athrow
		// @DD: return
		// @DE: athrow
		// @DF: getstatic int[] game.C_100196_rb.field_105818_d
		// @E2: aload_0
		// @E3: getfield int[] game.C_100037_wb.field_102388_J
		// @E6: iconst_0
		// @E7: iload #4
		// @E9: iload_3
		// @EA: iload #6
		// @EC: iload #5
		// @EE: iload #7
		// @F0: iload #8
		// @F2: invokestatic game.C_100037_wb.func_102362_c(int[], int[], int, int, int, int, int, int, int)void
		// @F5: return
	}
	
	final void func_102357_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @000: iload #6
		// @002: ifne @007
		// @005: return
		// @006: athrow
		// @007: iload_1
		// @008: aload_0
		// @009: getfield int game.C_100037_wb.field_102335_w
		// @00C: iconst_4
		// @00D: ishl
		// @00E: isub
		// @00F: istore_1
		// @010: iload_2
		// @011: aload_0
		// @012: getfield int game.C_100037_wb.field_102332_H
		// @015: iconst_4
		// @016: ishl
		// @017: isub
		// @018: istore_2
		// @019: iload #5
		// @01B: ldc 65535 (0xffff)
		// @01D: iand
		// @01E: i2d
		// @01F: ldc2_w 9.587379924285257E-5
		// @022: dmul
		// @023: dstore #7
		// @025: dload #7
		// @027: invokestatic java.lang.Math.sin(double)double
		// @02A: iload #6
		// @02C: i2d
		// @02D: dmul
		// @02E: ldc2_w 0.5
		// @031: dadd
		// @032: invokestatic java.lang.Math.floor(double)double
		// @035: d2i
		// @036: istore #9
		// @038: dload #7
		// @03A: invokestatic java.lang.Math.cos(double)double
		// @03D: iload #6
		// @03F: i2d
		// @040: dmul
		// @041: ldc2_w 0.5
		// @044: dadd
		// @045: invokestatic java.lang.Math.floor(double)double
		// @048: d2i
		// @049: istore #10
		// @04B: iload_1
		// @04C: ineg
		// @04D: iload #10
		// @04F: imul
		// @050: iload_2
		// @051: ineg
		// @052: iload #9
		// @054: imul
		// @055: iadd
		// @056: istore #11
		// @058: iload_1
		// @059: ineg
		// @05A: ineg
		// @05B: iload #9
		// @05D: imul
		// @05E: iload_2
		// @05F: ineg
		// @060: iload #10
		// @062: imul
		// @063: iadd
		// @064: istore #12
		// @066: aload_0
		// @067: getfield int game.C_100037_wb.field_102339_s
		// @06A: iconst_4
		// @06B: ishl
		// @06C: iload_1
		// @06D: isub
		// @06E: iload #10
		// @070: imul
		// @071: iload_2
		// @072: ineg
		// @073: iload #9
		// @075: imul
		// @076: iadd
		// @077: istore #13
		// @079: aload_0
		// @07A: getfield int game.C_100037_wb.field_102339_s
		// @07D: iconst_4
		// @07E: ishl
		// @07F: iload_1
		// @080: isub
		// @081: ineg
		// @082: iload #9
		// @084: imul
		// @085: iload_2
		// @086: ineg
		// @087: iload #10
		// @089: imul
		// @08A: iadd
		// @08B: istore #14
		// @08D: iload_1
		// @08E: ineg
		// @08F: iload #10
		// @091: imul
		// @092: aload_0
		// @093: getfield int game.C_100037_wb.field_102337_u
		// @096: iconst_4
		// @097: ishl
		// @098: iload_2
		// @099: isub
		// @09A: iload #9
		// @09C: imul
		// @09D: iadd
		// @09E: istore #15
		// @0A0: iload_1
		// @0A1: ineg
		// @0A2: ineg
		// @0A3: iload #9
		// @0A5: imul
		// @0A6: aload_0
		// @0A7: getfield int game.C_100037_wb.field_102337_u
		// @0AA: iconst_4
		// @0AB: ishl
		// @0AC: iload_2
		// @0AD: isub
		// @0AE: iload #10
		// @0B0: imul
		// @0B1: iadd
		// @0B2: istore #16
		// @0B4: aload_0
		// @0B5: getfield int game.C_100037_wb.field_102339_s
		// @0B8: iconst_4
		// @0B9: ishl
		// @0BA: iload_1
		// @0BB: isub
		// @0BC: iload #10
		// @0BE: imul
		// @0BF: aload_0
		// @0C0: getfield int game.C_100037_wb.field_102337_u
		// @0C3: iconst_4
		// @0C4: ishl
		// @0C5: iload_2
		// @0C6: isub
		// @0C7: iload #9
		// @0C9: imul
		// @0CA: iadd
		// @0CB: istore #17
		// @0CD: aload_0
		// @0CE: getfield int game.C_100037_wb.field_102339_s
		// @0D1: iconst_4
		// @0D2: ishl
		// @0D3: iload_1
		// @0D4: isub
		// @0D5: ineg
		// @0D6: iload #9
		// @0D8: imul
		// @0D9: aload_0
		// @0DA: getfield int game.C_100037_wb.field_102337_u
		// @0DD: iconst_4
		// @0DE: ishl
		// @0DF: iload_2
		// @0E0: isub
		// @0E1: iload #10
		// @0E3: imul
		// @0E4: iadd
		// @0E5: istore #18
		// @0E7: iload #11
		// @0E9: iload #13
		// @0EB: if_icmpge @0F9
		// @0EE: iload #11
		// @0F0: istore #19
		// @0F2: iload #13
		// @0F4: istore #20
		// @0F6: goto @101
		// @0F9: iload #13
		// @0FB: istore #19
		// @0FD: iload #11
		// @0FF: istore #20
		// @101: iload #15
		// @103: iload #19
		// @105: if_icmpge @10C
		// @108: iload #15
		// @10A: istore #19
		// @10C: iload #17
		// @10E: iload #19
		// @110: if_icmpge @117
		// @113: iload #17
		// @115: istore #19
		// @117: iload #15
		// @119: iload #20
		// @11B: if_icmple @122
		// @11E: iload #15
		// @120: istore #20
		// @122: iload #17
		// @124: iload #20
		// @126: if_icmple @12D
		// @129: iload #17
		// @12B: istore #20
		// @12D: iload #12
		// @12F: iload #14
		// @131: if_icmpge @13F
		// @134: iload #12
		// @136: istore #21
		// @138: iload #14
		// @13A: istore #22
		// @13C: goto @147
		// @13F: iload #14
		// @141: istore #21
		// @143: iload #12
		// @145: istore #22
		// @147: iload #16
		// @149: iload #21
		// @14B: if_icmpge @152
		// @14E: iload #16
		// @150: istore #21
		// @152: iload #18
		// @154: iload #21
		// @156: if_icmpge @15D
		// @159: iload #18
		// @15B: istore #21
		// @15D: iload #16
		// @15F: iload #22
		// @161: if_icmple @168
		// @164: iload #16
		// @166: istore #22
		// @168: iload #18
		// @16A: iload #22
		// @16C: if_icmple @173
		// @16F: iload #18
		// @171: istore #22
		// @173: iload #19
		// @175: bipush 12 (0x0C)
		// @177: ishr
		// @178: istore #19
		// @17A: iload #20
		// @17C: sipush 4095 (0x0FFF)
		// @17F: iadd
		// @180: bipush 12 (0x0C)
		// @182: ishr
		// @183: istore #20
		// @185: iload #21
		// @187: bipush 12 (0x0C)
		// @189: ishr
		// @18A: istore #21
		// @18C: iload #22
		// @18E: sipush 4095 (0x0FFF)
		// @191: iadd
		// @192: bipush 12 (0x0C)
		// @194: ishr
		// @195: istore #22
		// @197: iload #19
		// @199: iload_3
		// @19A: iadd
		// @19B: istore #19
		// @19D: iload #20
		// @19F: iload_3
		// @1A0: iadd
		// @1A1: istore #20
		// @1A3: iload #21
		// @1A5: iload #4
		// @1A7: iadd
		// @1A8: istore #21
		// @1AA: iload #22
		// @1AC: iload #4
		// @1AE: iadd
		// @1AF: istore #22
		// @1B1: iload #19
		// @1B3: iconst_4
		// @1B4: ishr
		// @1B5: istore #19
		// @1B7: iload #20
		// @1B9: bipush 15 (0x0F)
		// @1BB: iadd
		// @1BC: iconst_4
		// @1BD: ishr
		// @1BE: istore #20
		// @1C0: iload #21
		// @1C2: iconst_4
		// @1C3: ishr
		// @1C4: istore #21
		// @1C6: iload #22
		// @1C8: bipush 15 (0x0F)
		// @1CA: iadd
		// @1CB: iconst_4
		// @1CC: ishr
		// @1CD: istore #22
		// @1CF: iload #19
		// @1D1: getstatic int game.C_100196_rb.field_105827_i
		// @1D4: if_icmpge @1DC
		// @1D7: getstatic int game.C_100196_rb.field_105827_i
		// @1DA: istore #19
		// @1DC: iload #20
		// @1DE: getstatic int game.C_100196_rb.field_105820_b
		// @1E1: if_icmple @1E9
		// @1E4: getstatic int game.C_100196_rb.field_105820_b
		// @1E7: istore #20
		// @1E9: iload #21
		// @1EB: getstatic int game.C_100196_rb.field_105816_f
		// @1EE: if_icmpge @1F6
		// @1F1: getstatic int game.C_100196_rb.field_105816_f
		// @1F4: istore #21
		// @1F6: iload #22
		// @1F8: getstatic int game.C_100196_rb.field_105823_l
		// @1FB: if_icmple @203
		// @1FE: getstatic int game.C_100196_rb.field_105823_l
		// @201: istore #22
		// @203: iload #19
		// @205: iload #20
		// @207: isub
		// @208: istore #20
		// @20A: iload #20
		// @20C: iflt @211
		// @20F: return
		// @210: athrow
		// @211: iload #21
		// @213: iload #22
		// @215: isub
		// @216: istore #22
		// @218: iload #22
		// @21A: iflt @21F
		// @21D: return
		// @21E: athrow
		// @21F: iload #21
		// @221: getstatic int game.C_100196_rb.field_105819_e
		// @224: imul
		// @225: iload #19
		// @227: iadd
		// @228: istore #23
		// @22A: getstatic int game.C_100196_rb.field_105819_e
		// @22D: iload #20
		// @22F: iadd
		// @230: istore #24
		// @232: ldc2_w 1.6777216E7
		// @235: iload #6
		// @237: i2d
		// @238: ddiv
		// @239: dstore #25
		// @23B: dload #7
		// @23D: invokestatic java.lang.Math.sin(double)double
		// @240: dload #25
		// @242: dmul
		// @243: ldc2_w 0.5
		// @246: dadd
		// @247: invokestatic java.lang.Math.floor(double)double
		// @24A: d2i
		// @24B: istore #27
		// @24D: dload #7
		// @24F: invokestatic java.lang.Math.cos(double)double
		// @252: dload #25
		// @254: dmul
		// @255: ldc2_w 0.5
		// @258: dadd
		// @259: invokestatic java.lang.Math.floor(double)double
		// @25C: d2i
		// @25D: istore #28
		// @25F: iload #19
		// @261: iconst_4
		// @262: ishl
		// @263: bipush 8 (0x08)
		// @265: iadd
		// @266: iload_3
		// @267: isub
		// @268: istore #29
		// @26A: iload #21
		// @26C: iconst_4
		// @26D: ishl
		// @26E: bipush 8 (0x08)
		// @270: iadd
		// @271: iload #4
		// @273: isub
		// @274: istore #30
		// @276: iload_1
		// @277: bipush 8 (0x08)
		// @279: ishl
		// @27A: sipush 2048 (0x0800)
		// @27D: isub
		// @27E: iload #30
		// @280: iload #27
		// @282: imul
		// @283: iconst_4
		// @284: ishr
		// @285: isub
		// @286: istore #31
		// @288: iload_2
		// @289: bipush 8 (0x08)
		// @28B: ishl
		// @28C: sipush 2048 (0x0800)
		// @28F: isub
		// @290: iload #30
		// @292: iload #28
		// @294: imul
		// @295: iconst_4
		// @296: ishr
		// @297: iadd
		// @298: istore #32
		// @29A: iload #28
		// @29C: ifge @51A
		// @29F: iload #27
		// @2A1: ifge @3E4
		// @2A4: goto @2A8
		// @2A7: athrow
		// @2A8: iload #22
		// @2AA: istore #36
		// @2AC: iload #36
		// @2AE: ifge @3E1
		// @2B1: iload #31
		// @2B3: iload #29
		// @2B5: iload #28
		// @2B7: imul
		// @2B8: iconst_4
		// @2B9: ishr
		// @2BA: iadd
		// @2BB: istore #37
		// @2BD: iload #32
		// @2BF: iload #29
		// @2C1: iload #27
		// @2C3: imul
		// @2C4: iconst_4
		// @2C5: ishr
		// @2C6: iadd
		// @2C7: istore #38
		// @2C9: iload #20
		// @2CB: istore #39
		// @2CD: iload #37
		// @2CF: aload_0
		// @2D0: getfield int game.C_100037_wb.field_102339_s
		// @2D3: bipush 12 (0x0C)
		// @2D5: ishl
		// @2D6: isub
		// @2D7: dup
		// @2D8: istore #35
		// @2DA: iflt @31C
		// @2DD: iload #28
		// @2DF: ifne @2F0
		// @2E2: goto @2E6
		// @2E5: athrow
		// @2E6: iload #23
		// @2E8: iload #39
		// @2EA: isub
		// @2EB: istore #23
		// @2ED: goto @3C6
		// @2F0: iload #28
		// @2F2: iload #35
		// @2F4: isub
		// @2F5: iload #28
		// @2F7: idiv
		// @2F8: istore #35
		// @2FA: iload #39
		// @2FC: iload #35
		// @2FE: iadd
		// @2FF: istore #39
		// @301: iload #37
		// @303: iload #28
		// @305: iload #35
		// @307: imul
		// @308: iadd
		// @309: istore #37
		// @30B: iload #38
		// @30D: iload #27
		// @30F: iload #35
		// @311: imul
		// @312: iadd
		// @313: istore #38
		// @315: iload #23
		// @317: iload #35
		// @319: iadd
		// @31A: istore #23
		// @31C: iload #38
		// @31E: aload_0
		// @31F: getfield int game.C_100037_wb.field_102337_u
		// @322: bipush 12 (0x0C)
		// @324: ishl
		// @325: isub
		// @326: dup
		// @327: istore #35
		// @329: iflt @36B
		// @32C: iload #27
		// @32E: ifne @33F
		// @331: goto @335
		// @334: athrow
		// @335: iload #23
		// @337: iload #39
		// @339: isub
		// @33A: istore #23
		// @33C: goto @3C6
		// @33F: iload #27
		// @341: iload #35
		// @343: isub
		// @344: iload #27
		// @346: idiv
		// @347: istore #35
		// @349: iload #39
		// @34B: iload #35
		// @34D: iadd
		// @34E: istore #39
		// @350: iload #37
		// @352: iload #28
		// @354: iload #35
		// @356: imul
		// @357: iadd
		// @358: istore #37
		// @35A: iload #38
		// @35C: iload #27
		// @35E: iload #35
		// @360: imul
		// @361: iadd
		// @362: istore #38
		// @364: iload #23
		// @366: iload #35
		// @368: iadd
		// @369: istore #23
		// @36B: iload #39
		// @36D: ifge @3BF
		// @370: iload #37
		// @372: sipush -4096 (0xF000)
		// @375: if_icmplt @3BF
		// @378: goto @37C
		// @37B: athrow
		// @37C: iload #38
		// @37E: sipush -4096 (0xF000)
		// @381: if_icmpge @38C
		// @384: goto @388
		// @387: athrow
		// @388: goto @3BF
		// @38B: athrow
		// @38C: iload #37
		// @38E: bipush 12 (0x0C)
		// @390: ishr
		// @391: istore #33
		// @393: iload #38
		// @395: bipush 12 (0x0C)
		// @397: ishr
		// @398: istore #34
		// @39A: aload_0
		// @39B: iload #23
		// @39D: iload #33
		// @39F: iload #34
		// @3A1: iload #37
		// @3A3: iload #38
		// @3A5: invokespecial game.C_100037_wb.func_102354_d(int, int, int, int, int)void
		// @3A8: iinc #39 +1
		// @3AB: iload #37
		// @3AD: iload #28
		// @3AF: iadd
		// @3B0: istore #37
		// @3B2: iload #38
		// @3B4: iload #27
		// @3B6: iadd
		// @3B7: istore #38
		// @3B9: iinc #23 +1
		// @3BC: goto @36B
		// @3BF: iload #23
		// @3C1: iload #39
		// @3C3: isub
		// @3C4: istore #23
		// @3C6: iinc #36 +1
		// @3C9: iload #31
		// @3CB: iload #27
		// @3CD: isub
		// @3CE: istore #31
		// @3D0: iload #32
		// @3D2: iload #28
		// @3D4: iadd
		// @3D5: istore #32
		// @3D7: iload #23
		// @3D9: iload #24
		// @3DB: iadd
		// @3DC: istore #23
		// @3DE: goto @2AC
		// @3E1: goto @782
		// @3E4: iload #22
		// @3E6: istore #36
		// @3E8: iload #36
		// @3EA: ifge @517
		// @3ED: iload #31
		// @3EF: iload #29
		// @3F1: iload #28
		// @3F3: imul
		// @3F4: iconst_4
		// @3F5: ishr
		// @3F6: iadd
		// @3F7: istore #37
		// @3F9: iload #32
		// @3FB: iload #29
		// @3FD: iload #27
		// @3FF: imul
		// @400: iconst_4
		// @401: ishr
		// @402: iadd
		// @403: istore #38
		// @405: iload #20
		// @407: istore #39
		// @409: iload #37
		// @40B: aload_0
		// @40C: getfield int game.C_100037_wb.field_102339_s
		// @40F: bipush 12 (0x0C)
		// @411: ishl
		// @412: isub
		// @413: dup
		// @414: istore #35
		// @416: iflt @458
		// @419: iload #28
		// @41B: ifne @42C
		// @41E: goto @422
		// @421: athrow
		// @422: iload #23
		// @424: iload #39
		// @426: isub
		// @427: istore #23
		// @429: goto @4FC
		// @42C: iload #28
		// @42E: iload #35
		// @430: isub
		// @431: iload #28
		// @433: idiv
		// @434: istore #35
		// @436: iload #39
		// @438: iload #35
		// @43A: iadd
		// @43B: istore #39
		// @43D: iload #37
		// @43F: iload #28
		// @441: iload #35
		// @443: imul
		// @444: iadd
		// @445: istore #37
		// @447: iload #38
		// @449: iload #27
		// @44B: iload #35
		// @44D: imul
		// @44E: iadd
		// @44F: istore #38
		// @451: iload #23
		// @453: iload #35
		// @455: iadd
		// @456: istore #23
		// @458: iload #38
		// @45A: sipush 4096 (0x1000)
		// @45D: iadd
		// @45E: dup
		// @45F: istore #35
		// @461: ifge @4A5
		// @464: iload #27
		// @466: ifne @477
		// @469: goto @46D
		// @46C: athrow
		// @46D: iload #23
		// @46F: iload #39
		// @471: isub
		// @472: istore #23
		// @474: goto @4FC
		// @477: iload #27
		// @479: iconst_1
		// @47A: isub
		// @47B: iload #35
		// @47D: isub
		// @47E: iload #27
		// @480: idiv
		// @481: istore #35
		// @483: iload #39
		// @485: iload #35
		// @487: iadd
		// @488: istore #39
		// @48A: iload #37
		// @48C: iload #28
		// @48E: iload #35
		// @490: imul
		// @491: iadd
		// @492: istore #37
		// @494: iload #38
		// @496: iload #27
		// @498: iload #35
		// @49A: imul
		// @49B: iadd
		// @49C: istore #38
		// @49E: iload #23
		// @4A0: iload #35
		// @4A2: iadd
		// @4A3: istore #23
		// @4A5: iload #39
		// @4A7: ifge @4F5
		// @4AA: iload #37
		// @4AC: sipush -4096 (0xF000)
		// @4AF: if_icmplt @4F5
		// @4B2: goto @4B6
		// @4B5: athrow
		// @4B6: iload #38
		// @4B8: bipush 12 (0x0C)
		// @4BA: ishr
		// @4BB: dup
		// @4BC: istore #34
		// @4BE: aload_0
		// @4BF: getfield int game.C_100037_wb.field_102337_u
		// @4C2: if_icmplt @4C9
		// @4C5: goto @4F5
		// @4C8: athrow
		// @4C9: iload #37
		// @4CB: bipush 12 (0x0C)
		// @4CD: ishr
		// @4CE: istore #33
		// @4D0: aload_0
		// @4D1: iload #23
		// @4D3: iload #33
		// @4D5: iload #34
		// @4D7: iload #37
		// @4D9: iload #38
		// @4DB: invokespecial game.C_100037_wb.func_102354_d(int, int, int, int, int)void
		// @4DE: iinc #39 +1
		// @4E1: iload #37
		// @4E3: iload #28
		// @4E5: iadd
		// @4E6: istore #37
		// @4E8: iload #38
		// @4EA: iload #27
		// @4EC: iadd
		// @4ED: istore #38
		// @4EF: iinc #23 +1
		// @4F2: goto @4A5
		// @4F5: iload #23
		// @4F7: iload #39
		// @4F9: isub
		// @4FA: istore #23
		// @4FC: iinc #36 +1
		// @4FF: iload #31
		// @501: iload #27
		// @503: isub
		// @504: istore #31
		// @506: iload #32
		// @508: iload #28
		// @50A: iadd
		// @50B: istore #32
		// @50D: iload #23
		// @50F: iload #24
		// @511: iadd
		// @512: istore #23
		// @514: goto @3E8
		// @517: goto @782
		// @51A: iload #27
		// @51C: ifge @655
		// @51F: iload #22
		// @521: istore #36
		// @523: iload #36
		// @525: ifge @652
		// @528: iload #31
		// @52A: iload #29
		// @52C: iload #28
		// @52E: imul
		// @52F: iconst_4
		// @530: ishr
		// @531: iadd
		// @532: istore #37
		// @534: iload #32
		// @536: iload #29
		// @538: iload #27
		// @53A: imul
		// @53B: iconst_4
		// @53C: ishr
		// @53D: iadd
		// @53E: istore #38
		// @540: iload #20
		// @542: istore #39
		// @544: iload #37
		// @546: sipush 4096 (0x1000)
		// @549: iadd
		// @54A: dup
		// @54B: istore #35
		// @54D: ifge @591
		// @550: iload #28
		// @552: ifne @563
		// @555: goto @559
		// @558: athrow
		// @559: iload #23
		// @55B: iload #39
		// @55D: isub
		// @55E: istore #23
		// @560: goto @637
		// @563: iload #28
		// @565: iconst_1
		// @566: isub
		// @567: iload #35
		// @569: isub
		// @56A: iload #28
		// @56C: idiv
		// @56D: istore #35
		// @56F: iload #39
		// @571: iload #35
		// @573: iadd
		// @574: istore #39
		// @576: iload #37
		// @578: iload #28
		// @57A: iload #35
		// @57C: imul
		// @57D: iadd
		// @57E: istore #37
		// @580: iload #38
		// @582: iload #27
		// @584: iload #35
		// @586: imul
		// @587: iadd
		// @588: istore #38
		// @58A: iload #23
		// @58C: iload #35
		// @58E: iadd
		// @58F: istore #23
		// @591: iload #38
		// @593: aload_0
		// @594: getfield int game.C_100037_wb.field_102337_u
		// @597: bipush 12 (0x0C)
		// @599: ishl
		// @59A: isub
		// @59B: dup
		// @59C: istore #35
		// @59E: iflt @5E0
		// @5A1: iload #27
		// @5A3: ifne @5B4
		// @5A6: goto @5AA
		// @5A9: athrow
		// @5AA: iload #23
		// @5AC: iload #39
		// @5AE: isub
		// @5AF: istore #23
		// @5B1: goto @637
		// @5B4: iload #27
		// @5B6: iload #35
		// @5B8: isub
		// @5B9: iload #27
		// @5BB: idiv
		// @5BC: istore #35
		// @5BE: iload #39
		// @5C0: iload #35
		// @5C2: iadd
		// @5C3: istore #39
		// @5C5: iload #37
		// @5C7: iload #28
		// @5C9: iload #35
		// @5CB: imul
		// @5CC: iadd
		// @5CD: istore #37
		// @5CF: iload #38
		// @5D1: iload #27
		// @5D3: iload #35
		// @5D5: imul
		// @5D6: iadd
		// @5D7: istore #38
		// @5D9: iload #23
		// @5DB: iload #35
		// @5DD: iadd
		// @5DE: istore #23
		// @5E0: iload #39
		// @5E2: ifge @630
		// @5E5: iload #38
		// @5E7: sipush -4096 (0xF000)
		// @5EA: if_icmplt @630
		// @5ED: goto @5F1
		// @5F0: athrow
		// @5F1: iload #37
		// @5F3: bipush 12 (0x0C)
		// @5F5: ishr
		// @5F6: dup
		// @5F7: istore #33
		// @5F9: aload_0
		// @5FA: getfield int game.C_100037_wb.field_102339_s
		// @5FD: if_icmplt @604
		// @600: goto @630
		// @603: athrow
		// @604: iload #38
		// @606: bipush 12 (0x0C)
		// @608: ishr
		// @609: istore #34
		// @60B: aload_0
		// @60C: iload #23
		// @60E: iload #33
		// @610: iload #34
		// @612: iload #37
		// @614: iload #38
		// @616: invokespecial game.C_100037_wb.func_102354_d(int, int, int, int, int)void
		// @619: iinc #39 +1
		// @61C: iload #37
		// @61E: iload #28
		// @620: iadd
		// @621: istore #37
		// @623: iload #38
		// @625: iload #27
		// @627: iadd
		// @628: istore #38
		// @62A: iinc #23 +1
		// @62D: goto @5E0
		// @630: iload #23
		// @632: iload #39
		// @634: isub
		// @635: istore #23
		// @637: iinc #36 +1
		// @63A: iload #31
		// @63C: iload #27
		// @63E: isub
		// @63F: istore #31
		// @641: iload #32
		// @643: iload #28
		// @645: iadd
		// @646: istore #32
		// @648: iload #23
		// @64A: iload #24
		// @64C: iadd
		// @64D: istore #23
		// @64F: goto @523
		// @652: goto @782
		// @655: iload #22
		// @657: istore #36
		// @659: iload #36
		// @65B: ifge @782
		// @65E: iload #31
		// @660: iload #29
		// @662: iload #28
		// @664: imul
		// @665: iconst_4
		// @666: ishr
		// @667: iadd
		// @668: istore #37
		// @66A: iload #32
		// @66C: iload #29
		// @66E: iload #27
		// @670: imul
		// @671: iconst_4
		// @672: ishr
		// @673: iadd
		// @674: istore #38
		// @676: iload #20
		// @678: istore #39
		// @67A: iload #37
		// @67C: sipush 4096 (0x1000)
		// @67F: iadd
		// @680: dup
		// @681: istore #35
		// @683: ifge @6C7
		// @686: iload #28
		// @688: ifne @699
		// @68B: goto @68F
		// @68E: athrow
		// @68F: iload #23
		// @691: iload #39
		// @693: isub
		// @694: istore #23
		// @696: goto @767
		// @699: iload #28
		// @69B: iconst_1
		// @69C: isub
		// @69D: iload #35
		// @69F: isub
		// @6A0: iload #28
		// @6A2: idiv
		// @6A3: istore #35
		// @6A5: iload #39
		// @6A7: iload #35
		// @6A9: iadd
		// @6AA: istore #39
		// @6AC: iload #37
		// @6AE: iload #28
		// @6B0: iload #35
		// @6B2: imul
		// @6B3: iadd
		// @6B4: istore #37
		// @6B6: iload #38
		// @6B8: iload #27
		// @6BA: iload #35
		// @6BC: imul
		// @6BD: iadd
		// @6BE: istore #38
		// @6C0: iload #23
		// @6C2: iload #35
		// @6C4: iadd
		// @6C5: istore #23
		// @6C7: iload #38
		// @6C9: sipush 4096 (0x1000)
		// @6CC: iadd
		// @6CD: dup
		// @6CE: istore #35
		// @6D0: ifge @714
		// @6D3: iload #27
		// @6D5: ifne @6E6
		// @6D8: goto @6DC
		// @6DB: athrow
		// @6DC: iload #23
		// @6DE: iload #39
		// @6E0: isub
		// @6E1: istore #23
		// @6E3: goto @767
		// @6E6: iload #27
		// @6E8: iconst_1
		// @6E9: isub
		// @6EA: iload #35
		// @6EC: isub
		// @6ED: iload #27
		// @6EF: idiv
		// @6F0: istore #35
		// @6F2: iload #39
		// @6F4: iload #35
		// @6F6: iadd
		// @6F7: istore #39
		// @6F9: iload #37
		// @6FB: iload #28
		// @6FD: iload #35
		// @6FF: imul
		// @700: iadd
		// @701: istore #37
		// @703: iload #38
		// @705: iload #27
		// @707: iload #35
		// @709: imul
		// @70A: iadd
		// @70B: istore #38
		// @70D: iload #23
		// @70F: iload #35
		// @711: iadd
		// @712: istore #23
		// @714: iload #39
		// @716: ifge @760
		// @719: iload #37
		// @71B: bipush 12 (0x0C)
		// @71D: ishr
		// @71E: dup
		// @71F: istore #33
		// @721: aload_0
		// @722: getfield int game.C_100037_wb.field_102339_s
		// @725: if_icmpge @760
		// @728: iload #38
		// @72A: bipush 12 (0x0C)
		// @72C: ishr
		// @72D: dup
		// @72E: istore #34
		// @730: aload_0
		// @731: getfield int game.C_100037_wb.field_102337_u
		// @734: if_icmplt @73B
		// @737: goto @760
		// @73A: athrow
		// @73B: aload_0
		// @73C: iload #23
		// @73E: iload #33
		// @740: iload #34
		// @742: iload #37
		// @744: iload #38
		// @746: invokespecial game.C_100037_wb.func_102354_d(int, int, int, int, int)void
		// @749: iinc #39 +1
		// @74C: iload #37
		// @74E: iload #28
		// @750: iadd
		// @751: istore #37
		// @753: iload #38
		// @755: iload #27
		// @757: iadd
		// @758: istore #38
		// @75A: iinc #23 +1
		// @75D: goto @714
		// @760: iload #23
		// @762: iload #39
		// @764: isub
		// @765: istore #23
		// @767: iinc #36 +1
		// @76A: iload #31
		// @76C: iload #27
		// @76E: isub
		// @76F: istore #31
		// @771: iload #32
		// @773: iload #28
		// @775: iadd
		// @776: istore #32
		// @778: iload #23
		// @77A: iload #24
		// @77C: iadd
		// @77D: istore #23
		// @77F: goto @659
		// @782: return
	}
	
	private static final void func_102362_c(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8)
	{
		// @00: iload #5
		// @02: iconst_2
		// @03: ishr
		// @04: ineg
		// @05: istore #9
		// @07: iload #5
		// @09: iconst_3
		// @0A: iand
		// @0B: ineg
		// @0C: istore #5
		// @0E: iload #6
		// @10: ineg
		// @11: istore #10
		// @13: iload #10
		// @15: ifge @CA
		// @18: iload #9
		// @1A: istore #11
		// @1C: iload #11
		// @1E: ifge @8F
		// @21: aload_1
		// @22: iload_3
		// @23: iinc #3 +1
		// @26: iaload
		// @27: istore_2
		// @28: iload_2
		// @29: ifeq @38
		// @2C: aload_0
		// @2D: iload #4
		// @2F: iinc #4 +1
		// @32: iload_2
		// @33: iastore
		// @34: goto @3B
		// @37: athrow
		// @38: iinc #4 +1
		// @3B: aload_1
		// @3C: iload_3
		// @3D: iinc #3 +1
		// @40: iaload
		// @41: istore_2
		// @42: iload_2
		// @43: ifeq @52
		// @46: aload_0
		// @47: iload #4
		// @49: iinc #4 +1
		// @4C: iload_2
		// @4D: iastore
		// @4E: goto @55
		// @51: athrow
		// @52: iinc #4 +1
		// @55: aload_1
		// @56: iload_3
		// @57: iinc #3 +1
		// @5A: iaload
		// @5B: istore_2
		// @5C: iload_2
		// @5D: ifeq @6C
		// @60: aload_0
		// @61: iload #4
		// @63: iinc #4 +1
		// @66: iload_2
		// @67: iastore
		// @68: goto @6F
		// @6B: athrow
		// @6C: iinc #4 +1
		// @6F: aload_1
		// @70: iload_3
		// @71: iinc #3 +1
		// @74: iaload
		// @75: istore_2
		// @76: iload_2
		// @77: ifeq @86
		// @7A: aload_0
		// @7B: iload #4
		// @7D: iinc #4 +1
		// @80: iload_2
		// @81: iastore
		// @82: goto @89
		// @85: athrow
		// @86: iinc #4 +1
		// @89: iinc #11 +1
		// @8C: goto @1C
		// @8F: iload #5
		// @91: istore #11
		// @93: iload #11
		// @95: ifge @B8
		// @98: aload_1
		// @99: iload_3
		// @9A: iinc #3 +1
		// @9D: iaload
		// @9E: istore_2
		// @9F: iload_2
		// @A0: ifeq @AF
		// @A3: aload_0
		// @A4: iload #4
		// @A6: iinc #4 +1
		// @A9: iload_2
		// @AA: iastore
		// @AB: goto @B2
		// @AE: athrow
		// @AF: iinc #4 +1
		// @B2: iinc #11 +1
		// @B5: goto @93
		// @B8: iload #4
		// @BA: iload #7
		// @BC: iadd
		// @BD: istore #4
		// @BF: iload_3
		// @C0: iload #8
		// @C2: iadd
		// @C3: istore_3
		// @C4: iinc #10 +1
		// @C7: goto @13
		// @CA: return
	}
	
	final void func_102345_a(int arg0, int arg1, int arg2, int arg3)
	{
		// @000: iload_3
		// @001: aload_0
		// @002: getfield int game.C_100037_wb.field_102341_y
		// @005: if_icmpgt @015
		// @008: iload #4
		// @00A: aload_0
		// @00B: getfield int game.C_100037_wb.field_102340_z
		// @00E: if_icmple @01E
		// @011: goto @015
		// @014: athrow
		// @015: new java.lang.IllegalArgumentException
		// @018: dup
		// @019: invokespecial java.lang.IllegalArgumentException.<init>()void
		// @01C: athrow
		// @01D: athrow
		// @01E: iload_1
		// @01F: aload_0
		// @020: getfield int game.C_100037_wb.field_102335_w
		// @023: iload_3
		// @024: imul
		// @025: aload_0
		// @026: getfield int game.C_100037_wb.field_102341_y
		// @029: idiv
		// @02A: iadd
		// @02B: istore #5
		// @02D: iload_1
		// @02E: aload_0
		// @02F: getfield int game.C_100037_wb.field_102335_w
		// @032: aload_0
		// @033: getfield int game.C_100037_wb.field_102339_s
		// @036: iadd
		// @037: iload_3
		// @038: imul
		// @039: aload_0
		// @03A: getfield int game.C_100037_wb.field_102341_y
		// @03D: iadd
		// @03E: iconst_1
		// @03F: isub
		// @040: aload_0
		// @041: getfield int game.C_100037_wb.field_102341_y
		// @044: idiv
		// @045: iadd
		// @046: istore #6
		// @048: iload_2
		// @049: aload_0
		// @04A: getfield int game.C_100037_wb.field_102332_H
		// @04D: iload #4
		// @04F: imul
		// @050: aload_0
		// @051: getfield int game.C_100037_wb.field_102340_z
		// @054: idiv
		// @055: iadd
		// @056: istore #7
		// @058: iload_2
		// @059: aload_0
		// @05A: getfield int game.C_100037_wb.field_102332_H
		// @05D: aload_0
		// @05E: getfield int game.C_100037_wb.field_102337_u
		// @061: iadd
		// @062: iload #4
		// @064: imul
		// @065: aload_0
		// @066: getfield int game.C_100037_wb.field_102340_z
		// @069: iadd
		// @06A: iconst_1
		// @06B: isub
		// @06C: aload_0
		// @06D: getfield int game.C_100037_wb.field_102340_z
		// @070: idiv
		// @071: iadd
		// @072: istore #8
		// @074: iload #5
		// @076: getstatic int game.C_100196_rb.field_105827_i
		// @079: if_icmpge @081
		// @07C: getstatic int game.C_100196_rb.field_105827_i
		// @07F: istore #5
		// @081: iload #6
		// @083: getstatic int game.C_100196_rb.field_105820_b
		// @086: if_icmple @08E
		// @089: getstatic int game.C_100196_rb.field_105820_b
		// @08C: istore #6
		// @08E: iload #7
		// @090: getstatic int game.C_100196_rb.field_105816_f
		// @093: if_icmpge @09B
		// @096: getstatic int game.C_100196_rb.field_105816_f
		// @099: istore #7
		// @09B: iload #8
		// @09D: getstatic int game.C_100196_rb.field_105823_l
		// @0A0: if_icmple @0A8
		// @0A3: getstatic int game.C_100196_rb.field_105823_l
		// @0A6: istore #8
		// @0A8: iload #5
		// @0AA: iload #6
		// @0AC: if_icmpge @0BA
		// @0AF: iload #7
		// @0B1: iload #8
		// @0B3: if_icmplt @0BC
		// @0B6: goto @0BA
		// @0B9: athrow
		// @0BA: return
		// @0BB: athrow
		// @0BC: iload #7
		// @0BE: getstatic int game.C_100196_rb.field_105819_e
		// @0C1: imul
		// @0C2: iload #5
		// @0C4: iadd
		// @0C5: istore #9
		// @0C7: getstatic int game.C_100196_rb.field_105819_e
		// @0CA: iload #6
		// @0CC: iload #5
		// @0CE: isub
		// @0CF: isub
		// @0D0: istore #10
		// @0D2: iload #7
		// @0D4: istore #11
		// @0D6: iload #11
		// @0D8: iload #8
		// @0DA: if_icmpge @2E1
		// @0DD: iload #5
		// @0DF: istore #12
		// @0E1: iload #12
		// @0E3: iload #6
		// @0E5: if_icmpge @2D4
		// @0E8: iload #12
		// @0EA: iload_1
		// @0EB: isub
		// @0EC: iconst_4
		// @0ED: ishl
		// @0EE: istore #13
		// @0F0: iload #11
		// @0F2: iload_2
		// @0F3: isub
		// @0F4: iconst_4
		// @0F5: ishl
		// @0F6: istore #14
		// @0F8: iload #13
		// @0FA: aload_0
		// @0FB: getfield int game.C_100037_wb.field_102341_y
		// @0FE: imul
		// @0FF: iload_3
		// @100: idiv
		// @101: aload_0
		// @102: getfield int game.C_100037_wb.field_102335_w
		// @105: iconst_4
		// @106: ishl
		// @107: isub
		// @108: istore #15
		// @10A: iload #13
		// @10C: bipush 16 (0x10)
		// @10E: iadd
		// @10F: aload_0
		// @110: getfield int game.C_100037_wb.field_102341_y
		// @113: imul
		// @114: iload_3
		// @115: idiv
		// @116: aload_0
		// @117: getfield int game.C_100037_wb.field_102335_w
		// @11A: iconst_4
		// @11B: ishl
		// @11C: isub
		// @11D: istore #16
		// @11F: iload #14
		// @121: aload_0
		// @122: getfield int game.C_100037_wb.field_102340_z
		// @125: imul
		// @126: iload #4
		// @128: idiv
		// @129: aload_0
		// @12A: getfield int game.C_100037_wb.field_102332_H
		// @12D: iconst_4
		// @12E: ishl
		// @12F: isub
		// @130: istore #17
		// @132: iload #14
		// @134: bipush 16 (0x10)
		// @136: iadd
		// @137: aload_0
		// @138: getfield int game.C_100037_wb.field_102340_z
		// @13B: imul
		// @13C: iload #4
		// @13E: idiv
		// @13F: aload_0
		// @140: getfield int game.C_100037_wb.field_102332_H
		// @143: iconst_4
		// @144: ishl
		// @145: isub
		// @146: istore #18
		// @148: iload #16
		// @14A: iload #15
		// @14C: isub
		// @14D: iload #18
		// @14F: iload #17
		// @151: isub
		// @152: imul
		// @153: iconst_1
		// @154: ishr
		// @155: istore #19
		// @157: iload #19
		// @159: ifne @160
		// @15C: goto @2CE
		// @15F: athrow
		// @160: iload #15
		// @162: ifge @168
		// @165: iconst_0
		// @166: istore #15
		// @168: iload #16
		// @16A: aload_0
		// @16B: getfield int game.C_100037_wb.field_102339_s
		// @16E: iconst_4
		// @16F: ishl
		// @170: if_icmple @17B
		// @173: aload_0
		// @174: getfield int game.C_100037_wb.field_102339_s
		// @177: iconst_4
		// @178: ishl
		// @179: istore #16
		// @17B: iload #17
		// @17D: ifge @183
		// @180: iconst_0
		// @181: istore #17
		// @183: iload #18
		// @185: aload_0
		// @186: getfield int game.C_100037_wb.field_102337_u
		// @189: iconst_4
		// @18A: ishl
		// @18B: if_icmple @196
		// @18E: aload_0
		// @18F: getfield int game.C_100037_wb.field_102337_u
		// @192: iconst_4
		// @193: ishl
		// @194: istore #18
		// @196: iinc #16 +255
		// @199: iinc #18 +255
		// @19C: bipush 16 (0x10)
		// @19E: iload #15
		// @1A0: bipush 15 (0x0F)
		// @1A2: iand
		// @1A3: isub
		// @1A4: istore #20
		// @1A6: iload #16
		// @1A8: bipush 15 (0x0F)
		// @1AA: iand
		// @1AB: iconst_1
		// @1AC: iadd
		// @1AD: istore #21
		// @1AF: bipush 16 (0x10)
		// @1B1: iload #17
		// @1B3: bipush 15 (0x0F)
		// @1B5: iand
		// @1B6: isub
		// @1B7: istore #22
		// @1B9: iload #18
		// @1BB: bipush 15 (0x0F)
		// @1BD: iand
		// @1BE: iconst_1
		// @1BF: iadd
		// @1C0: istore #23
		// @1C2: iload #15
		// @1C4: iconst_4
		// @1C5: ishr
		// @1C6: istore #15
		// @1C8: iload #16
		// @1CA: iconst_4
		// @1CB: ishr
		// @1CC: istore #16
		// @1CE: iload #17
		// @1D0: iconst_4
		// @1D1: ishr
		// @1D2: istore #17
		// @1D4: iload #18
		// @1D6: iconst_4
		// @1D7: ishr
		// @1D8: istore #18
		// @1DA: iconst_0
		// @1DB: istore #24
		// @1DD: iconst_0
		// @1DE: istore #25
		// @1E0: iconst_0
		// @1E1: istore #26
		// @1E3: iconst_0
		// @1E4: istore #27
		// @1E6: iload #17
		// @1E8: istore #28
		// @1EA: iload #28
		// @1EC: iload #18
		// @1EE: if_icmpgt @29B
		// @1F1: bipush 16 (0x10)
		// @1F3: istore #29
		// @1F5: iload #28
		// @1F7: iload #17
		// @1F9: if_icmpne @200
		// @1FC: iload #22
		// @1FE: istore #29
		// @200: iload #28
		// @202: iload #18
		// @204: if_icmpne @20B
		// @207: iload #23
		// @209: istore #29
		// @20B: iload #15
		// @20D: istore #30
		// @20F: iload #30
		// @211: iload #16
		// @213: if_icmpgt @295
		// @216: aload_0
		// @217: getfield int[] game.C_100037_wb.field_102388_J
		// @21A: iload #28
		// @21C: aload_0
		// @21D: getfield int game.C_100037_wb.field_102339_s
		// @220: imul
		// @221: iload #30
		// @223: iadd
		// @224: iaload
		// @225: istore #31
		// @227: iload #31
		// @229: ifeq @28F
		// @22C: iload #29
		// @22E: istore #32
		// @230: iload #30
		// @232: iload #15
		// @234: if_icmpne @241
		// @237: iload #32
		// @239: iload #20
		// @23B: imul
		// @23C: istore #32
		// @23E: goto @258
		// @241: iload #30
		// @243: iload #16
		// @245: if_icmpne @252
		// @248: iload #32
		// @24A: iload #21
		// @24C: imul
		// @24D: istore #32
		// @24F: goto @258
		// @252: iload #32
		// @254: iconst_4
		// @255: ishl
		// @256: istore #32
		// @258: iload #27
		// @25A: iload #32
		// @25C: iadd
		// @25D: istore #27
		// @25F: iload #24
		// @261: iload #31
		// @263: bipush 16 (0x10)
		// @265: ishr
		// @266: sipush 255 (0x00FF)
		// @269: iand
		// @26A: iload #32
		// @26C: imul
		// @26D: iadd
		// @26E: istore #24
		// @270: iload #25
		// @272: iload #31
		// @274: bipush 8 (0x08)
		// @276: ishr
		// @277: sipush 255 (0x00FF)
		// @27A: iand
		// @27B: iload #32
		// @27D: imul
		// @27E: iadd
		// @27F: istore #25
		// @281: iload #26
		// @283: iload #31
		// @285: sipush 255 (0x00FF)
		// @288: iand
		// @289: iload #32
		// @28B: imul
		// @28C: iadd
		// @28D: istore #26
		// @28F: iinc #30 +1
		// @292: goto @20F
		// @295: iinc #28 +1
		// @298: goto @1EA
		// @29B: iload #27
		// @29D: iload #19
		// @29F: if_icmplt @2CB
		// @2A2: iload #24
		// @2A4: iload #27
		// @2A6: idiv
		// @2A7: bipush 16 (0x10)
		// @2A9: ishl
		// @2AA: iload #25
		// @2AC: iload #27
		// @2AE: idiv
		// @2AF: bipush 8 (0x08)
		// @2B1: ishl
		// @2B2: iadd
		// @2B3: iload #26
		// @2B5: iload #27
		// @2B7: idiv
		// @2B8: iadd
		// @2B9: istore #28
		// @2BB: iload #28
		// @2BD: ifne @2C3
		// @2C0: iconst_1
		// @2C1: istore #28
		// @2C3: getstatic int[] game.C_100196_rb.field_105818_d
		// @2C6: iload #9
		// @2C8: iload #28
		// @2CA: iastore
		// @2CB: iinc #9 +1
		// @2CE: iinc #12 +1
		// @2D1: goto @0E1
		// @2D4: iload #9
		// @2D6: iload #10
		// @2D8: iadd
		// @2D9: istore #9
		// @2DB: iinc #11 +1
		// @2DE: goto @0D6
		// @2E1: return
	}
	
	private static final void func_102372_b(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11)
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
		// @19: ifge @8A
		// @1C: iload #7
		// @1E: ineg
		// @1F: istore #5
		// @21: iload #5
		// @23: ifge @78
		// @26: aload_1
		// @27: iload_3
		// @28: iinc #3 +1
		// @2B: iaload
		// @2C: istore_2
		// @2D: iload_2
		// @2E: ifeq @6F
		// @31: iload_2
		// @32: bipush 8 (0x08)
		// @34: ishr
		// @35: iload_2
		// @36: ldc 65535 (0xffff)
		// @38: iand
		// @39: if_icmpne @64
		// @3C: goto @40
		// @3F: athrow
		// @40: iload_2
		// @41: sipush 255 (0x00FF)
		// @44: iand
		// @45: istore_2
		// @46: aload_0
		// @47: iload #4
		// @49: iinc #4 +1
		// @4C: iload_2
		// @4D: iload #12
		// @4F: imul
		// @50: bipush 8 (0x08)
		// @52: ishr
		// @53: ldc 16711934 (0xff00fe)
		// @55: iand
		// @56: iload_2
		// @57: iload #13
		// @59: imul
		// @5A: ldc 65280 (0xff00)
		// @5C: iand
		// @5D: iadd
		// @5E: iconst_1
		// @5F: iadd
		// @60: iastore
		// @61: goto @72
		// @64: aload_0
		// @65: iload #4
		// @67: iinc #4 +1
		// @6A: iload_2
		// @6B: iastore
		// @6C: goto @72
		// @6F: iinc #4 +1
		// @72: iinc #5 +1
		// @75: goto @21
		// @78: iload #4
		// @7A: iload #9
		// @7C: iadd
		// @7D: istore #4
		// @7F: iload_3
		// @80: iload #10
		// @82: iadd
		// @83: istore_3
		// @84: iinc #6 +1
		// @87: goto @17
		// @8A: return
	}
	
	final void func_102349_a()
	{
		// @00: aload_0
		// @01: getfield int game.C_100037_wb.field_102339_s
		// @04: aload_0
		// @05: getfield int game.C_100037_wb.field_102341_y
		// @08: if_icmpne @1C
		// @0B: aload_0
		// @0C: getfield int game.C_100037_wb.field_102337_u
		// @0F: aload_0
		// @10: getfield int game.C_100037_wb.field_102340_z
		// @13: if_icmpne @1C
		// @16: goto @1A
		// @19: athrow
		// @1A: return
		// @1B: athrow
		// @1C: aload_0
		// @1D: getfield int game.C_100037_wb.field_102341_y
		// @20: aload_0
		// @21: getfield int game.C_100037_wb.field_102340_z
		// @24: imul
		// @25: newarray int[]
		// @27: astore_1
		// @28: iconst_0
		// @29: istore_2
		// @2A: iload_2
		// @2B: aload_0
		// @2C: getfield int game.C_100037_wb.field_102337_u
		// @2F: if_icmpge @6A
		// @32: iconst_0
		// @33: istore_3
		// @34: iload_3
		// @35: aload_0
		// @36: getfield int game.C_100037_wb.field_102339_s
		// @39: if_icmpge @64
		// @3C: aload_1
		// @3D: iload_2
		// @3E: aload_0
		// @3F: getfield int game.C_100037_wb.field_102332_H
		// @42: iadd
		// @43: aload_0
		// @44: getfield int game.C_100037_wb.field_102341_y
		// @47: imul
		// @48: iload_3
		// @49: aload_0
		// @4A: getfield int game.C_100037_wb.field_102335_w
		// @4D: iadd
		// @4E: iadd
		// @4F: aload_0
		// @50: getfield int[] game.C_100037_wb.field_102388_J
		// @53: iload_2
		// @54: aload_0
		// @55: getfield int game.C_100037_wb.field_102339_s
		// @58: imul
		// @59: iload_3
		// @5A: iadd
		// @5B: iaload
		// @5C: iastore
		// @5D: iinc #3 +1
		// @60: goto @34
		// @63: athrow
		// @64: iinc #2 +1
		// @67: goto @2A
		// @6A: aload_0
		// @6B: aload_1
		// @6C: putfield int[] game.C_100037_wb.field_102388_J
		// @6F: aload_0
		// @70: aload_0
		// @71: getfield int game.C_100037_wb.field_102341_y
		// @74: putfield int game.C_100037_wb.field_102339_s
		// @77: aload_0
		// @78: aload_0
		// @79: getfield int game.C_100037_wb.field_102340_z
		// @7C: putfield int game.C_100037_wb.field_102337_u
		// @7F: aload_0
		// @80: iconst_0
		// @81: putfield int game.C_100037_wb.field_102335_w
		// @84: aload_0
		// @85: iconst_0
		// @86: putfield int game.C_100037_wb.field_102332_H
		// @89: return
	}
	
	private static final void func_102375_a(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8)
	{
		// @00: iload #5
		// @02: iconst_2
		// @03: ishr
		// @04: ineg
		// @05: istore #9
		// @07: iload #5
		// @09: iconst_3
		// @0A: iand
		// @0B: ineg
		// @0C: istore #5
		// @0E: iload #6
		// @10: ineg
		// @11: istore #10
		// @13: iload #10
		// @15: ifge @C8
		// @18: iload #9
		// @1A: istore #11
		// @1C: iload #11
		// @1E: ifge @8B
		// @21: aload_1
		// @22: iload_3
		// @23: iinc #3 +1
		// @26: iaload
		// @27: ifeq @3A
		// @2A: goto @2E
		// @2D: athrow
		// @2E: aload_0
		// @2F: iload #4
		// @31: iinc #4 +1
		// @34: iload_2
		// @35: iastore
		// @36: goto @3D
		// @39: athrow
		// @3A: iinc #4 +1
		// @3D: aload_1
		// @3E: iload_3
		// @3F: iinc #3 +1
		// @42: iaload
		// @43: ifeq @52
		// @46: aload_0
		// @47: iload #4
		// @49: iinc #4 +1
		// @4C: iload_2
		// @4D: iastore
		// @4E: goto @55
		// @51: athrow
		// @52: iinc #4 +1
		// @55: aload_1
		// @56: iload_3
		// @57: iinc #3 +1
		// @5A: iaload
		// @5B: ifeq @6A
		// @5E: aload_0
		// @5F: iload #4
		// @61: iinc #4 +1
		// @64: iload_2
		// @65: iastore
		// @66: goto @6D
		// @69: athrow
		// @6A: iinc #4 +1
		// @6D: aload_1
		// @6E: iload_3
		// @6F: iinc #3 +1
		// @72: iaload
		// @73: ifeq @82
		// @76: aload_0
		// @77: iload #4
		// @79: iinc #4 +1
		// @7C: iload_2
		// @7D: iastore
		// @7E: goto @85
		// @81: athrow
		// @82: iinc #4 +1
		// @85: iinc #11 +1
		// @88: goto @1C
		// @8B: iload #5
		// @8D: istore #11
		// @8F: iload #11
		// @91: ifge @B6
		// @94: aload_1
		// @95: iload_3
		// @96: iinc #3 +1
		// @99: iaload
		// @9A: ifeq @AD
		// @9D: goto @A1
		// @A0: athrow
		// @A1: aload_0
		// @A2: iload #4
		// @A4: iinc #4 +1
		// @A7: iload_2
		// @A8: iastore
		// @A9: goto @B0
		// @AC: athrow
		// @AD: iinc #4 +1
		// @B0: iinc #11 +1
		// @B3: goto @8F
		// @B6: iload #4
		// @B8: iload #7
		// @BA: iadd
		// @BB: istore #4
		// @BD: iload_3
		// @BE: iload #8
		// @C0: iadd
		// @C1: istore_3
		// @C2: iinc #10 +1
		// @C5: goto @13
		// @C8: return
	}
	
	final void func_102373_c(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: aload_0
		// @01: getfield int game.C_100037_wb.field_102341_y
		// @04: iconst_3
		// @05: ishl
		// @06: istore #5
		// @08: aload_0
		// @09: getfield int game.C_100037_wb.field_102340_z
		// @0C: iconst_3
		// @0D: ishl
		// @0E: istore #6
		// @10: iload_1
		// @11: iconst_4
		// @12: ishl
		// @13: iload #5
		// @15: bipush 15 (0x0F)
		// @17: iand
		// @18: iadd
		// @19: istore_1
		// @1A: iload_2
		// @1B: iconst_4
		// @1C: ishl
		// @1D: iload #6
		// @1F: bipush 15 (0x0F)
		// @21: iand
		// @22: iadd
		// @23: istore_2
		// @24: aload_0
		// @25: iload #5
		// @27: iload #6
		// @29: iload_1
		// @2A: iload_2
		// @2B: iload_3
		// @2C: iload #4
		// @2E: invokevirtual game.C_100037_wb.func_102357_a(int, int, int, int, int, int)void
		// @31: return
	}
	
	final void func_102366_b(int arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100037_wb.field_102335_w
		// @05: iadd
		// @06: istore_1
		// @07: iload_2
		// @08: aload_0
		// @09: getfield int game.C_100037_wb.field_102332_H
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
		// @1B: getfield int game.C_100037_wb.field_102337_u
		// @1E: istore #6
		// @20: aload_0
		// @21: getfield int game.C_100037_wb.field_102339_s
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
		// @D6: ifle @E2
		// @D9: iload #6
		// @DB: ifgt @E4
		// @DE: goto @E2
		// @E1: athrow
		// @E2: return
		// @E3: athrow
		// @E4: getstatic int[] game.C_100196_rb.field_105818_d
		// @E7: aload_0
		// @E8: getfield int[] game.C_100037_wb.field_102388_J
		// @EB: iload_3
		// @EC: iload #5
		// @EE: iload #4
		// @F0: iload #7
		// @F2: iload #6
		// @F4: iload #8
		// @F6: iload #9
		// @F8: invokestatic game.C_100037_wb.func_102375_a(int[], int[], int, int, int, int, int, int, int)void
		// @FB: return
	}
	
	void func_102346_e(int arg0, int arg1, int arg2, int arg3)
	{
		// @000: aload_0
		// @001: getfield int game.C_100037_wb.field_102337_u
		// @004: ifne @009
		// @007: return
		// @008: athrow
		// @009: iload_1
		// @00A: aload_0
		// @00B: getfield int game.C_100037_wb.field_102335_w
		// @00E: iadd
		// @00F: istore_1
		// @010: iload_2
		// @011: aload_0
		// @012: getfield int game.C_100037_wb.field_102332_H
		// @015: iadd
		// @016: istore_2
		// @017: aload_0
		// @018: getfield int game.C_100037_wb.field_102337_u
		// @01B: istore #5
		// @01D: aload_0
		// @01E: getfield int game.C_100037_wb.field_102339_s
		// @021: istore #6
		// @023: iload_3
		// @024: bipush 8 (0x08)
		// @026: ishl
		// @027: istore #7
		// @029: iload #4
		// @02B: iload_3
		// @02C: isub
		// @02D: bipush 8 (0x08)
		// @02F: ishl
		// @030: iload #5
		// @032: idiv
		// @033: istore #8
		// @035: iconst_0
		// @036: istore #9
		// @038: iload_1
		// @039: getstatic int game.C_100196_rb.field_105827_i
		// @03C: if_icmpge @057
		// @03F: iload #6
		// @041: getstatic int game.C_100196_rb.field_105827_i
		// @044: iload_1
		// @045: isub
		// @046: isub
		// @047: istore #6
		// @049: iload #9
		// @04B: getstatic int game.C_100196_rb.field_105827_i
		// @04E: iload_1
		// @04F: isub
		// @050: iadd
		// @051: istore #9
		// @053: getstatic int game.C_100196_rb.field_105827_i
		// @056: istore_1
		// @057: iload_2
		// @058: getstatic int game.C_100196_rb.field_105816_f
		// @05B: if_icmpge @088
		// @05E: iload #7
		// @060: getstatic int game.C_100196_rb.field_105816_f
		// @063: iload_2
		// @064: isub
		// @065: iload #8
		// @067: imul
		// @068: iadd
		// @069: istore #7
		// @06B: iload #5
		// @06D: getstatic int game.C_100196_rb.field_105816_f
		// @070: iload_2
		// @071: isub
		// @072: isub
		// @073: istore #5
		// @075: iload #9
		// @077: getstatic int game.C_100196_rb.field_105816_f
		// @07A: iload_2
		// @07B: isub
		// @07C: aload_0
		// @07D: getfield int game.C_100037_wb.field_102339_s
		// @080: imul
		// @081: iadd
		// @082: istore #9
		// @084: getstatic int game.C_100196_rb.field_105816_f
		// @087: istore_2
		// @088: iload_1
		// @089: iload #6
		// @08B: iadd
		// @08C: getstatic int game.C_100196_rb.field_105820_b
		// @08F: if_icmple @099
		// @092: getstatic int game.C_100196_rb.field_105820_b
		// @095: iload_1
		// @096: isub
		// @097: istore #6
		// @099: iload_2
		// @09A: iload #5
		// @09C: iadd
		// @09D: getstatic int game.C_100196_rb.field_105823_l
		// @0A0: if_icmple @0AA
		// @0A3: getstatic int game.C_100196_rb.field_105823_l
		// @0A6: iload_2
		// @0A7: isub
		// @0A8: istore #5
		// @0AA: getstatic int game.C_100196_rb.field_105819_e
		// @0AD: iload #6
		// @0AF: isub
		// @0B0: istore #10
		// @0B2: aload_0
		// @0B3: getfield int game.C_100037_wb.field_102339_s
		// @0B6: iload #6
		// @0B8: isub
		// @0B9: istore #11
		// @0BB: iload_1
		// @0BC: iload_2
		// @0BD: getstatic int game.C_100196_rb.field_105819_e
		// @0C0: imul
		// @0C1: iadd
		// @0C2: istore #12
		// @0C4: iload #5
		// @0C6: ineg
		// @0C7: istore_2
		// @0C8: iload_2
		// @0C9: ifge @1A1
		// @0CC: iload #7
		// @0CE: bipush 8 (0x08)
		// @0D0: ishr
		// @0D1: istore #13
		// @0D3: sipush 256 (0x0100)
		// @0D6: iload #13
		// @0D8: isub
		// @0D9: istore #14
		// @0DB: iload #13
		// @0DD: ifge @0E4
		// @0E0: goto @19B
		// @0E3: athrow
		// @0E4: iload #13
		// @0E6: sipush 255 (0x00FF)
		// @0E9: if_icmple @11D
		// @0EC: iload #6
		// @0EE: ineg
		// @0EF: istore_1
		// @0F0: iload_1
		// @0F1: ifge @186
		// @0F4: aload_0
		// @0F5: getfield int[] game.C_100037_wb.field_102388_J
		// @0F8: iload #9
		// @0FA: iinc #9 +1
		// @0FD: iaload
		// @0FE: istore #15
		// @100: iload #15
		// @102: ifeq @114
		// @105: getstatic int[] game.C_100196_rb.field_105818_d
		// @108: iload #12
		// @10A: iinc #12 +1
		// @10D: iload #15
		// @10F: iastore
		// @110: goto @117
		// @113: athrow
		// @114: iinc #12 +1
		// @117: iinc #1 +1
		// @11A: goto @0F0
		// @11D: iload #6
		// @11F: ineg
		// @120: istore_1
		// @121: iload_1
		// @122: ifge @186
		// @125: aload_0
		// @126: getfield int[] game.C_100037_wb.field_102388_J
		// @129: iload #9
		// @12B: iinc #9 +1
		// @12E: iaload
		// @12F: istore #15
		// @131: iload #15
		// @133: ifeq @17D
		// @136: getstatic int[] game.C_100196_rb.field_105818_d
		// @139: iload #12
		// @13B: iaload
		// @13C: istore #16
		// @13E: iload #16
		// @140: ldc 16711935 (0xff00ff)
		// @142: iand
		// @143: iload #14
		// @145: imul
		// @146: iload #15
		// @148: ldc 16711935 (0xff00ff)
		// @14A: iand
		// @14B: iload #13
		// @14D: imul
		// @14E: iadd
		// @14F: bipush 8 (0x08)
		// @151: ishr
		// @152: ldc 16711935 (0xff00ff)
		// @154: iand
		// @155: istore #17
		// @157: getstatic int[] game.C_100196_rb.field_105818_d
		// @15A: iload #12
		// @15C: iinc #12 +1
		// @15F: iload #17
		// @161: iload #16
		// @163: ldc 65280 (0xff00)
		// @165: iand
		// @166: iload #14
		// @168: imul
		// @169: iload #15
		// @16B: ldc 65280 (0xff00)
		// @16D: iand
		// @16E: iload #13
		// @170: imul
		// @171: iadd
		// @172: bipush 8 (0x08)
		// @174: ishr
		// @175: ldc 65280 (0xff00)
		// @177: iand
		// @178: iadd
		// @179: iastore
		// @17A: goto @180
		// @17D: iinc #12 +1
		// @180: iinc #1 +1
		// @183: goto @121
		// @186: iload #12
		// @188: iload #10
		// @18A: iadd
		// @18B: istore #12
		// @18D: iload #9
		// @18F: iload #11
		// @191: iadd
		// @192: istore #9
		// @194: iload #7
		// @196: iload #8
		// @198: iadd
		// @199: istore #7
		// @19B: iinc #2 +1
		// @19E: goto @0C8
		// @1A1: return
	}
	
	final void func_102377_b(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @000: iload_3
		// @001: ifle @00D
		// @004: iload #4
		// @006: ifgt @00F
		// @009: goto @00D
		// @00C: athrow
		// @00D: return
		// @00E: athrow
		// @00F: aload_0
		// @010: getfield int game.C_100037_wb.field_102339_s
		// @013: istore #6
		// @015: aload_0
		// @016: getfield int game.C_100037_wb.field_102337_u
		// @019: istore #7
		// @01B: iconst_0
		// @01C: istore #8
		// @01E: iconst_0
		// @01F: istore #9
		// @021: aload_0
		// @022: getfield int game.C_100037_wb.field_102341_y
		// @025: istore #10
		// @027: aload_0
		// @028: getfield int game.C_100037_wb.field_102340_z
		// @02B: istore #11
		// @02D: iload #10
		// @02F: bipush 16 (0x10)
		// @031: ishl
		// @032: iload_3
		// @033: idiv
		// @034: istore #12
		// @036: iload #11
		// @038: bipush 16 (0x10)
		// @03A: ishl
		// @03B: iload #4
		// @03D: idiv
		// @03E: istore #13
		// @040: aload_0
		// @041: getfield int game.C_100037_wb.field_102335_w
		// @044: ifle @06F
		// @047: aload_0
		// @048: getfield int game.C_100037_wb.field_102335_w
		// @04B: bipush 16 (0x10)
		// @04D: ishl
		// @04E: iload #12
		// @050: iadd
		// @051: iconst_1
		// @052: isub
		// @053: iload #12
		// @055: idiv
		// @056: istore #14
		// @058: iload_1
		// @059: iload #14
		// @05B: iadd
		// @05C: istore_1
		// @05D: iload #8
		// @05F: iload #14
		// @061: iload #12
		// @063: imul
		// @064: aload_0
		// @065: getfield int game.C_100037_wb.field_102335_w
		// @068: bipush 16 (0x10)
		// @06A: ishl
		// @06B: isub
		// @06C: iadd
		// @06D: istore #8
		// @06F: aload_0
		// @070: getfield int game.C_100037_wb.field_102332_H
		// @073: ifle @09E
		// @076: aload_0
		// @077: getfield int game.C_100037_wb.field_102332_H
		// @07A: bipush 16 (0x10)
		// @07C: ishl
		// @07D: iload #13
		// @07F: iadd
		// @080: iconst_1
		// @081: isub
		// @082: iload #13
		// @084: idiv
		// @085: istore #14
		// @087: iload_2
		// @088: iload #14
		// @08A: iadd
		// @08B: istore_2
		// @08C: iload #9
		// @08E: iload #14
		// @090: iload #13
		// @092: imul
		// @093: aload_0
		// @094: getfield int game.C_100037_wb.field_102332_H
		// @097: bipush 16 (0x10)
		// @099: ishl
		// @09A: isub
		// @09B: iadd
		// @09C: istore #9
		// @09E: iload #6
		// @0A0: iload #10
		// @0A2: if_icmpge @0B6
		// @0A5: iload #6
		// @0A7: bipush 16 (0x10)
		// @0A9: ishl
		// @0AA: iload #8
		// @0AC: isub
		// @0AD: iload #12
		// @0AF: iadd
		// @0B0: iconst_1
		// @0B1: isub
		// @0B2: iload #12
		// @0B4: idiv
		// @0B5: istore_3
		// @0B6: iload #7
		// @0B8: iload #11
		// @0BA: if_icmpge @0CF
		// @0BD: iload #7
		// @0BF: bipush 16 (0x10)
		// @0C1: ishl
		// @0C2: iload #9
		// @0C4: isub
		// @0C5: iload #13
		// @0C7: iadd
		// @0C8: iconst_1
		// @0C9: isub
		// @0CA: iload #13
		// @0CC: idiv
		// @0CD: istore #4
		// @0CF: iload_1
		// @0D0: iload_2
		// @0D1: getstatic int game.C_100196_rb.field_105819_e
		// @0D4: imul
		// @0D5: iadd
		// @0D6: istore #14
		// @0D8: getstatic int game.C_100196_rb.field_105819_e
		// @0DB: iload_3
		// @0DC: isub
		// @0DD: istore #15
		// @0DF: iload_2
		// @0E0: iload #4
		// @0E2: iadd
		// @0E3: getstatic int game.C_100196_rb.field_105823_l
		// @0E6: if_icmple @0F6
		// @0E9: iload #4
		// @0EB: iload_2
		// @0EC: iload #4
		// @0EE: iadd
		// @0EF: getstatic int game.C_100196_rb.field_105823_l
		// @0F2: isub
		// @0F3: isub
		// @0F4: istore #4
		// @0F6: iload_2
		// @0F7: getstatic int game.C_100196_rb.field_105816_f
		// @0FA: if_icmpge @120
		// @0FD: getstatic int game.C_100196_rb.field_105816_f
		// @100: iload_2
		// @101: isub
		// @102: istore #16
		// @104: iload #4
		// @106: iload #16
		// @108: isub
		// @109: istore #4
		// @10B: iload #14
		// @10D: iload #16
		// @10F: getstatic int game.C_100196_rb.field_105819_e
		// @112: imul
		// @113: iadd
		// @114: istore #14
		// @116: iload #9
		// @118: iload #13
		// @11A: iload #16
		// @11C: imul
		// @11D: iadd
		// @11E: istore #9
		// @120: iload_1
		// @121: iload_3
		// @122: iadd
		// @123: getstatic int game.C_100196_rb.field_105820_b
		// @126: if_icmple @13E
		// @129: iload_1
		// @12A: iload_3
		// @12B: iadd
		// @12C: getstatic int game.C_100196_rb.field_105820_b
		// @12F: isub
		// @130: istore #16
		// @132: iload_3
		// @133: iload #16
		// @135: isub
		// @136: istore_3
		// @137: iload #15
		// @139: iload #16
		// @13B: iadd
		// @13C: istore #15
		// @13E: iload_1
		// @13F: getstatic int game.C_100196_rb.field_105827_i
		// @142: if_icmpge @169
		// @145: getstatic int game.C_100196_rb.field_105827_i
		// @148: iload_1
		// @149: isub
		// @14A: istore #16
		// @14C: iload_3
		// @14D: iload #16
		// @14F: isub
		// @150: istore_3
		// @151: iload #14
		// @153: iload #16
		// @155: iadd
		// @156: istore #14
		// @158: iload #8
		// @15A: iload #12
		// @15C: iload #16
		// @15E: imul
		// @15F: iadd
		// @160: istore #8
		// @162: iload #15
		// @164: iload #16
		// @166: iadd
		// @167: istore #15
		// @169: iload #5
		// @16B: sipush 256 (0x0100)
		// @16E: if_icmpne @196
		// @171: iconst_0
		// @172: iconst_0
		// @173: iconst_0
		// @174: iload #8
		// @176: aload_0
		// @177: getfield int[] game.C_100037_wb.field_102388_J
		// @17A: getstatic int[] game.C_100196_rb.field_105818_d
		// @17D: iconst_0
		// @17E: iconst_0
		// @17F: iload #4
		// @181: ineg
		// @182: iload #9
		// @184: iload #14
		// @186: iload #15
		// @188: iload_3
		// @189: iload #12
		// @18B: iload #13
		// @18D: iload #6
		// @18F: invokestatic game.C_100037_wb.func_102370_a(int, int, int, int, int[], int[], int, int, int, int, int, int, int, int, int, int)void
		// @192: goto @1B9
		// @195: athrow
		// @196: iconst_0
		// @197: iconst_0
		// @198: iconst_0
		// @199: iload #8
		// @19B: aload_0
		// @19C: getfield int[] game.C_100037_wb.field_102388_J
		// @19F: getstatic int[] game.C_100196_rb.field_105818_d
		// @1A2: iconst_0
		// @1A3: iconst_0
		// @1A4: iload #4
		// @1A6: ineg
		// @1A7: iload #9
		// @1A9: iload #14
		// @1AB: iload #15
		// @1AD: iload_3
		// @1AE: iload #12
		// @1B0: iload #13
		// @1B2: iload #6
		// @1B4: iload #5
		// @1B6: invokestatic game.C_100037_wb.func_102387_a(int, int, int, int, int[], int[], int, int, int, int, int, int, int, int, int, int, int)void
		// @1B9: return
	}
	
	private static final void func_102387_a(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16)
	{
		// @00: iload_3
		// @01: istore #17
		// @03: iload #8
		// @05: ifge @9F
		// @08: iload #9
		// @0A: bipush 16 (0x10)
		// @0C: ishr
		// @0D: iload #15
		// @0F: imul
		// @10: istore #7
		// @12: iload #12
		// @14: ineg
		// @15: istore #6
		// @17: iload #6
		// @19: ifge @88
		// @1C: aload #4
		// @1E: iload_3
		// @1F: bipush 16 (0x10)
		// @21: ishr
		// @22: iload #7
		// @24: iadd
		// @25: iaload
		// @26: istore_0
		// @27: iload_0
		// @28: ifeq @7A
		// @2B: iload_0
		// @2C: ldc 16711935 (0xff00ff)
		// @2E: iand
		// @2F: iload #16
		// @31: imul
		// @32: istore_1
		// @33: iload_1
		// @34: ldc -16711936 (0xff00ff00)
		// @36: iand
		// @37: iload_0
		// @38: iload #16
		// @3A: imul
		// @3B: iload_1
		// @3C: isub
		// @3D: ldc 16711680 (0xff0000)
		// @3F: iand
		// @40: iadd
		// @41: bipush 8 (0x08)
		// @43: iushr
		// @44: istore_0
		// @45: aload #5
		// @47: iload #10
		// @49: iaload
		// @4A: istore_1
		// @4B: iload_0
		// @4C: iload_1
		// @4D: iadd
		// @4E: istore_2
		// @4F: iload_0
		// @50: ldc 16711935 (0xff00ff)
		// @52: iand
		// @53: iload_1
		// @54: ldc 16711935 (0xff00ff)
		// @56: iand
		// @57: iadd
		// @58: istore_0
		// @59: iload_0
		// @5A: ldc 16777472 (0x1000100)
		// @5C: iand
		// @5D: iload_2
		// @5E: iload_0
		// @5F: isub
		// @60: ldc 65536 (0x10000)
		// @62: iand
		// @63: iadd
		// @64: istore_1
		// @65: aload #5
		// @67: iload #10
		// @69: iinc #10 +1
		// @6C: iload_2
		// @6D: iload_1
		// @6E: isub
		// @6F: iload_1
		// @70: iload_1
		// @71: bipush 8 (0x08)
		// @73: iushr
		// @74: isub
		// @75: ior
		// @76: iastore
		// @77: goto @7D
		// @7A: iinc #10 +1
		// @7D: iload_3
		// @7E: iload #13
		// @80: iadd
		// @81: istore_3
		// @82: iinc #6 +1
		// @85: goto @17
		// @88: iload #9
		// @8A: iload #14
		// @8C: iadd
		// @8D: istore #9
		// @8F: iload #17
		// @91: istore_3
		// @92: iload #10
		// @94: iload #11
		// @96: iadd
		// @97: istore #10
		// @99: iinc #8 +1
		// @9C: goto @03
		// @9F: return
	}
	
	private static final void func_102370_a(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15)
	{
		// @00: iload_3
		// @01: istore #16
		// @03: iload #8
		// @05: ifge @85
		// @08: iload #9
		// @0A: bipush 16 (0x10)
		// @0C: ishr
		// @0D: iload #15
		// @0F: imul
		// @10: istore #7
		// @12: iload #12
		// @14: ineg
		// @15: istore #6
		// @17: iload #6
		// @19: ifge @6E
		// @1C: aload #4
		// @1E: iload_3
		// @1F: bipush 16 (0x10)
		// @21: ishr
		// @22: iload #7
		// @24: iadd
		// @25: iaload
		// @26: istore_0
		// @27: iload_0
		// @28: ifeq @60
		// @2B: aload #5
		// @2D: iload #10
		// @2F: iaload
		// @30: istore_1
		// @31: iload_0
		// @32: iload_1
		// @33: iadd
		// @34: istore_2
		// @35: iload_0
		// @36: ldc 16711935 (0xff00ff)
		// @38: iand
		// @39: iload_1
		// @3A: ldc 16711935 (0xff00ff)
		// @3C: iand
		// @3D: iadd
		// @3E: istore_0
		// @3F: iload_0
		// @40: ldc 16777472 (0x1000100)
		// @42: iand
		// @43: iload_2
		// @44: iload_0
		// @45: isub
		// @46: ldc 65536 (0x10000)
		// @48: iand
		// @49: iadd
		// @4A: istore_1
		// @4B: aload #5
		// @4D: iload #10
		// @4F: iinc #10 +1
		// @52: iload_2
		// @53: iload_1
		// @54: isub
		// @55: iload_1
		// @56: iload_1
		// @57: bipush 8 (0x08)
		// @59: iushr
		// @5A: isub
		// @5B: ior
		// @5C: iastore
		// @5D: goto @63
		// @60: iinc #10 +1
		// @63: iload_3
		// @64: iload #13
		// @66: iadd
		// @67: istore_3
		// @68: iinc #6 +1
		// @6B: goto @17
		// @6E: iload #9
		// @70: iload #14
		// @72: iadd
		// @73: istore #9
		// @75: iload #16
		// @77: istore_3
		// @78: iload #10
		// @7A: iload #11
		// @7C: iadd
		// @7D: istore #10
		// @7F: iinc #8 +1
		// @82: goto @03
		// @85: return
	}
	
	void func_102376_d(int arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100037_wb.field_102335_w
		// @05: iadd
		// @06: istore_1
		// @07: iload_2
		// @08: aload_0
		// @09: getfield int game.C_100037_wb.field_102332_H
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
		// @1B: getfield int game.C_100037_wb.field_102337_u
		// @1E: istore #6
		// @20: aload_0
		// @21: getfield int game.C_100037_wb.field_102339_s
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
		// @D6: ifle @E2
		// @D9: iload #6
		// @DB: ifgt @E4
		// @DE: goto @E2
		// @E1: athrow
		// @E2: return
		// @E3: athrow
		// @E4: getstatic int[] game.C_100196_rb.field_105818_d
		// @E7: aload_0
		// @E8: getfield int[] game.C_100037_wb.field_102388_J
		// @EB: iconst_0
		// @EC: iload #5
		// @EE: iload #4
		// @F0: iload #7
		// @F2: iload #6
		// @F4: iload #8
		// @F6: iload #9
		// @F8: iload_3
		// @F9: invokestatic game.C_100037_wb.func_102344_b(int[], int[], int, int, int, int, int, int, int, int)void
		// @FC: return
	}
	
	private static final void func_102350_a(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7)
	{
		// @000: iconst_0
		// @001: istore #8
		// @003: iload #8
		// @005: iload #7
		// @007: if_icmpge @11D
		// @00A: iconst_0
		// @00B: istore #9
		// @00D: iload #9
		// @00F: iload #6
		// @011: if_icmpge @10E
		// @014: getstatic int[] game.C_100196_rb.field_105818_d
		// @017: iload_2
		// @018: iaload
		// @019: ldc 16711935 (0xff00ff)
		// @01B: iand
		// @01C: istore #11
		// @01E: getstatic int[] game.C_100196_rb.field_105818_d
		// @021: iload_2
		// @022: iaload
		// @023: ldc 65280 (0xff00)
		// @025: iand
		// @026: istore #12
		// @028: iconst_0
		// @029: istore #13
		// @02B: iconst_0
		// @02C: istore #14
		// @02E: aload_0
		// @02F: iload_1
		// @030: iaload
		// @031: dup
		// @032: istore #10
		// @034: ifne @048
		// @037: iload #13
		// @039: iload #11
		// @03B: iadd
		// @03C: istore #13
		// @03E: iload #14
		// @040: iload #12
		// @042: iadd
		// @043: istore #14
		// @045: goto @05C
		// @048: iload #13
		// @04A: iload #10
		// @04C: ldc 16711935 (0xff00ff)
		// @04E: iand
		// @04F: iadd
		// @050: istore #13
		// @052: iload #14
		// @054: iload #10
		// @056: ldc 65280 (0xff00)
		// @058: iand
		// @059: iadd
		// @05A: istore #14
		// @05C: aload_0
		// @05D: iload_1
		// @05E: iconst_1
		// @05F: iadd
		// @060: iaload
		// @061: dup
		// @062: istore #10
		// @064: ifne @078
		// @067: iload #13
		// @069: iload #11
		// @06B: iadd
		// @06C: istore #13
		// @06E: iload #14
		// @070: iload #12
		// @072: iadd
		// @073: istore #14
		// @075: goto @08C
		// @078: iload #13
		// @07A: iload #10
		// @07C: ldc 16711935 (0xff00ff)
		// @07E: iand
		// @07F: iadd
		// @080: istore #13
		// @082: iload #14
		// @084: iload #10
		// @086: ldc 65280 (0xff00)
		// @088: iand
		// @089: iadd
		// @08A: istore #14
		// @08C: aload_0
		// @08D: iload_1
		// @08E: iload #5
		// @090: iadd
		// @091: iaload
		// @092: dup
		// @093: istore #10
		// @095: ifne @0A9
		// @098: iload #13
		// @09A: iload #11
		// @09C: iadd
		// @09D: istore #13
		// @09F: iload #14
		// @0A1: iload #12
		// @0A3: iadd
		// @0A4: istore #14
		// @0A6: goto @0BD
		// @0A9: iload #13
		// @0AB: iload #10
		// @0AD: ldc 16711935 (0xff00ff)
		// @0AF: iand
		// @0B0: iadd
		// @0B1: istore #13
		// @0B3: iload #14
		// @0B5: iload #10
		// @0B7: ldc 65280 (0xff00)
		// @0B9: iand
		// @0BA: iadd
		// @0BB: istore #14
		// @0BD: aload_0
		// @0BE: iload_1
		// @0BF: iload #5
		// @0C1: iadd
		// @0C2: iconst_1
		// @0C3: iadd
		// @0C4: iaload
		// @0C5: dup
		// @0C6: istore #10
		// @0C8: ifne @0DC
		// @0CB: iload #13
		// @0CD: iload #11
		// @0CF: iadd
		// @0D0: istore #13
		// @0D2: iload #14
		// @0D4: iload #12
		// @0D6: iadd
		// @0D7: istore #14
		// @0D9: goto @0F0
		// @0DC: iload #13
		// @0DE: iload #10
		// @0E0: ldc 16711935 (0xff00ff)
		// @0E2: iand
		// @0E3: iadd
		// @0E4: istore #13
		// @0E6: iload #14
		// @0E8: iload #10
		// @0EA: ldc 65280 (0xff00)
		// @0EC: iand
		// @0ED: iadd
		// @0EE: istore #14
		// @0F0: getstatic int[] game.C_100196_rb.field_105818_d
		// @0F3: iload_2
		// @0F4: iinc #2 +1
		// @0F7: iload #13
		// @0F9: ldc 66847740 (0x3fc03fc)
		// @0FB: iand
		// @0FC: iload #14
		// @0FE: ldc 261120 (0x3fc00)
		// @100: iand
		// @101: ior
		// @102: iconst_2
		// @103: ishr
		// @104: iastore
		// @105: iinc #9 +1
		// @108: iinc #1 +2
		// @10B: goto @00D
		// @10E: iinc #8 +1
		// @111: iload_1
		// @112: iload_3
		// @113: iadd
		// @114: istore_1
		// @115: iload_2
		// @116: iload #4
		// @118: iadd
		// @119: istore_2
		// @11A: goto @003
		// @11D: return
	}
	
	final void func_102385_c()
	{
		// @000: aload_0
		// @001: getfield int game.C_100037_wb.field_102337_u
		// @004: iconst_1
		// @005: isub
		// @006: istore_1
		// @007: iload_1
		// @008: iflt @03B
		// @00B: iload_1
		// @00C: aload_0
		// @00D: getfield int game.C_100037_wb.field_102339_s
		// @010: imul
		// @011: istore_2
		// @012: iconst_0
		// @013: istore_3
		// @014: iload_3
		// @015: aload_0
		// @016: getfield int game.C_100037_wb.field_102339_s
		// @019: if_icmpge @035
		// @01C: aload_0
		// @01D: getfield int[] game.C_100037_wb.field_102388_J
		// @020: iload_2
		// @021: iload_3
		// @022: iadd
		// @023: iaload
		// @024: ifeq @02F
		// @027: goto @02B
		// @02A: athrow
		// @02B: goto @03B
		// @02E: athrow
		// @02F: iinc #3 +1
		// @032: goto @014
		// @035: iinc #1 +255
		// @038: goto @007
		// @03B: iconst_0
		// @03C: istore_2
		// @03D: iload_2
		// @03E: iload_1
		// @03F: if_icmpge @075
		// @042: iload_2
		// @043: aload_0
		// @044: getfield int game.C_100037_wb.field_102339_s
		// @047: imul
		// @048: istore_3
		// @049: iconst_0
		// @04A: istore #4
		// @04C: iload #4
		// @04E: aload_0
		// @04F: getfield int game.C_100037_wb.field_102339_s
		// @052: if_icmpge @06F
		// @055: aload_0
		// @056: getfield int[] game.C_100037_wb.field_102388_J
		// @059: iload_3
		// @05A: iload #4
		// @05C: iadd
		// @05D: iaload
		// @05E: ifeq @069
		// @061: goto @065
		// @064: athrow
		// @065: goto @075
		// @068: athrow
		// @069: iinc #4 +1
		// @06C: goto @04C
		// @06F: iinc #2 +1
		// @072: goto @03D
		// @075: aload_0
		// @076: getfield int game.C_100037_wb.field_102339_s
		// @079: iconst_1
		// @07A: isub
		// @07B: istore_3
		// @07C: iload_3
		// @07D: iflt @0AE
		// @080: iload_2
		// @081: istore #4
		// @083: iload #4
		// @085: iload_1
		// @086: if_icmpgt @0A8
		// @089: aload_0
		// @08A: getfield int[] game.C_100037_wb.field_102388_J
		// @08D: iload #4
		// @08F: aload_0
		// @090: getfield int game.C_100037_wb.field_102339_s
		// @093: imul
		// @094: iload_3
		// @095: iadd
		// @096: iaload
		// @097: ifeq @0A2
		// @09A: goto @09E
		// @09D: athrow
		// @09E: goto @0AE
		// @0A1: athrow
		// @0A2: iinc #4 +1
		// @0A5: goto @083
		// @0A8: iinc #3 +255
		// @0AB: goto @07C
		// @0AE: iconst_0
		// @0AF: istore #4
		// @0B1: iload #4
		// @0B3: iload_3
		// @0B4: if_icmpge @0E6
		// @0B7: iload_2
		// @0B8: istore #5
		// @0BA: iload #5
		// @0BC: iload_1
		// @0BD: if_icmpgt @0E0
		// @0C0: aload_0
		// @0C1: getfield int[] game.C_100037_wb.field_102388_J
		// @0C4: iload #5
		// @0C6: aload_0
		// @0C7: getfield int game.C_100037_wb.field_102339_s
		// @0CA: imul
		// @0CB: iload #4
		// @0CD: iadd
		// @0CE: iaload
		// @0CF: ifeq @0DA
		// @0D2: goto @0D6
		// @0D5: athrow
		// @0D6: goto @0E6
		// @0D9: athrow
		// @0DA: iinc #5 +1
		// @0DD: goto @0BA
		// @0E0: iinc #4 +1
		// @0E3: goto @0B1
		// @0E6: iload #4
		// @0E8: ifne @111
		// @0EB: iload_3
		// @0EC: aload_0
		// @0ED: getfield int game.C_100037_wb.field_102339_s
		// @0F0: iconst_1
		// @0F1: isub
		// @0F2: if_icmpne @111
		// @0F5: goto @0F9
		// @0F8: athrow
		// @0F9: iload_2
		// @0FA: ifne @111
		// @0FD: goto @101
		// @100: athrow
		// @101: iload_1
		// @102: aload_0
		// @103: getfield int game.C_100037_wb.field_102337_u
		// @106: iconst_1
		// @107: isub
		// @108: if_icmpne @111
		// @10B: goto @10F
		// @10E: athrow
		// @10F: return
		// @110: athrow
		// @111: iload_3
		// @112: iconst_1
		// @113: iadd
		// @114: iload #4
		// @116: isub
		// @117: istore #5
		// @119: iload_1
		// @11A: iconst_1
		// @11B: iadd
		// @11C: iload_2
		// @11D: isub
		// @11E: istore #6
		// @120: iload #5
		// @122: iload #6
		// @124: imul
		// @125: newarray int[]
		// @127: astore #7
		// @129: iconst_0
		// @12A: istore #8
		// @12C: iload #8
		// @12E: iload #6
		// @130: if_icmpge @169
		// @133: iconst_0
		// @134: istore #9
		// @136: iload #9
		// @138: iload #5
		// @13A: if_icmpge @163
		// @13D: aload #7
		// @13F: iload #8
		// @141: iload #5
		// @143: imul
		// @144: iload #9
		// @146: iadd
		// @147: aload_0
		// @148: getfield int[] game.C_100037_wb.field_102388_J
		// @14B: iload #8
		// @14D: iload_2
		// @14E: iadd
		// @14F: aload_0
		// @150: getfield int game.C_100037_wb.field_102339_s
		// @153: imul
		// @154: iload #9
		// @156: iload #4
		// @158: iadd
		// @159: iadd
		// @15A: iaload
		// @15B: iastore
		// @15C: iinc #9 +1
		// @15F: goto @136
		// @162: athrow
		// @163: iinc #8 +1
		// @166: goto @12C
		// @169: aload_0
		// @16A: aload #7
		// @16C: putfield int[] game.C_100037_wb.field_102388_J
		// @16F: aload_0
		// @170: iload #5
		// @172: putfield int game.C_100037_wb.field_102339_s
		// @175: aload_0
		// @176: iload #6
		// @178: putfield int game.C_100037_wb.field_102337_u
		// @17B: aload_0
		// @17C: dup
		// @17D: getfield int game.C_100037_wb.field_102335_w
		// @180: iload #4
		// @182: iadd
		// @183: putfield int game.C_100037_wb.field_102335_w
		// @186: aload_0
		// @187: dup
		// @188: getfield int game.C_100037_wb.field_102332_H
		// @18B: iload_2
		// @18C: iadd
		// @18D: putfield int game.C_100037_wb.field_102332_H
		// @190: return
	}
	
	private static final void func_102384_a(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12)
	{
		// @00: iload #12
		// @02: bipush 16 (0x10)
		// @04: ishr
		// @05: sipush 255 (0x00FF)
		// @08: iand
		// @09: istore #13
		// @0B: iload #12
		// @0D: bipush 8 (0x08)
		// @0F: ishr
		// @10: sipush 255 (0x00FF)
		// @13: iand
		// @14: istore #14
		// @16: iload #12
		// @18: sipush 255 (0x00FF)
		// @1B: iand
		// @1C: istore #15
		// @1E: iload_3
		// @1F: istore #16
		// @21: iload #8
		// @23: ineg
		// @24: istore #17
		// @26: iload #17
		// @28: ifge @D5
		// @2B: iload #4
		// @2D: bipush 16 (0x10)
		// @2F: ishr
		// @30: iload #11
		// @32: imul
		// @33: istore #18
		// @35: iload #7
		// @37: ineg
		// @38: istore #19
		// @3A: iload #19
		// @3C: ifge @BE
		// @3F: aload_1
		// @40: iload_3
		// @41: bipush 16 (0x10)
		// @43: ishr
		// @44: iload #18
		// @46: iadd
		// @47: iaload
		// @48: istore_2
		// @49: iload_2
		// @4A: ifeq @B0
		// @4D: iload_2
		// @4E: bipush 16 (0x10)
		// @50: ishr
		// @51: sipush 255 (0x00FF)
		// @54: iand
		// @55: istore #20
		// @57: iload_2
		// @58: bipush 8 (0x08)
		// @5A: ishr
		// @5B: sipush 255 (0x00FF)
		// @5E: iand
		// @5F: istore #21
		// @61: iload_2
		// @62: sipush 255 (0x00FF)
		// @65: iand
		// @66: istore #22
		// @68: iload #20
		// @6A: iload #21
		// @6C: if_icmpne @A5
		// @6F: iload #21
		// @71: iload #22
		// @73: if_icmpne @A5
		// @76: goto @7A
		// @79: athrow
		// @7A: aload_0
		// @7B: iload #5
		// @7D: iinc #5 +1
		// @80: iload #20
		// @82: iload #13
		// @84: imul
		// @85: bipush 8 (0x08)
		// @87: ishr
		// @88: bipush 16 (0x10)
		// @8A: ishl
		// @8B: iload #21
		// @8D: iload #14
		// @8F: imul
		// @90: bipush 8 (0x08)
		// @92: ishr
		// @93: bipush 8 (0x08)
		// @95: ishl
		// @96: iadd
		// @97: iload #22
		// @99: iload #15
		// @9B: imul
		// @9C: bipush 8 (0x08)
		// @9E: ishr
		// @9F: iadd
		// @A0: iastore
		// @A1: goto @AD
		// @A4: athrow
		// @A5: aload_0
		// @A6: iload #5
		// @A8: iinc #5 +1
		// @AB: iload_2
		// @AC: iastore
		// @AD: goto @B3
		// @B0: iinc #5 +1
		// @B3: iload_3
		// @B4: iload #9
		// @B6: iadd
		// @B7: istore_3
		// @B8: iinc #19 +1
		// @BB: goto @3A
		// @BE: iload #4
		// @C0: iload #10
		// @C2: iadd
		// @C3: istore #4
		// @C5: iload #16
		// @C7: istore_3
		// @C8: iload #5
		// @CA: iload #6
		// @CC: iadd
		// @CD: istore #5
		// @CF: iinc #17 +1
		// @D2: goto @26
		// @D5: return
	}
	
	final void func_102356_b()
	{
		// @00: aload_0
		// @01: getfield int game.C_100037_wb.field_102339_s
		// @04: aload_0
		// @05: getfield int game.C_100037_wb.field_102337_u
		// @08: imul
		// @09: newarray int[]
		// @0B: astore_1
		// @0C: iconst_0
		// @0D: istore_2
		// @0E: iconst_0
		// @0F: istore_3
		// @10: iload_3
		// @11: aload_0
		// @12: getfield int game.C_100037_wb.field_102339_s
		// @15: if_icmpge @46
		// @18: aload_0
		// @19: getfield int game.C_100037_wb.field_102337_u
		// @1C: iconst_1
		// @1D: isub
		// @1E: istore #4
		// @20: iload #4
		// @22: iflt @40
		// @25: aload_1
		// @26: iload_2
		// @27: iinc #2 +1
		// @2A: aload_0
		// @2B: getfield int[] game.C_100037_wb.field_102388_J
		// @2E: iload_3
		// @2F: iload #4
		// @31: aload_0
		// @32: getfield int game.C_100037_wb.field_102339_s
		// @35: imul
		// @36: iadd
		// @37: iaload
		// @38: iastore
		// @39: iinc #4 +255
		// @3C: goto @20
		// @3F: athrow
		// @40: iinc #3 +1
		// @43: goto @10
		// @46: aload_0
		// @47: aload_1
		// @48: putfield int[] game.C_100037_wb.field_102388_J
		// @4B: aload_0
		// @4C: getfield int game.C_100037_wb.field_102332_H
		// @4F: istore_3
		// @50: aload_0
		// @51: aload_0
		// @52: getfield int game.C_100037_wb.field_102335_w
		// @55: putfield int game.C_100037_wb.field_102332_H
		// @58: aload_0
		// @59: aload_0
		// @5A: getfield int game.C_100037_wb.field_102340_z
		// @5D: aload_0
		// @5E: getfield int game.C_100037_wb.field_102337_u
		// @61: isub
		// @62: iload_3
		// @63: isub
		// @64: putfield int game.C_100037_wb.field_102335_w
		// @67: aload_0
		// @68: getfield int game.C_100037_wb.field_102337_u
		// @6B: istore_3
		// @6C: aload_0
		// @6D: aload_0
		// @6E: getfield int game.C_100037_wb.field_102339_s
		// @71: putfield int game.C_100037_wb.field_102337_u
		// @74: aload_0
		// @75: iload_3
		// @76: putfield int game.C_100037_wb.field_102339_s
		// @79: aload_0
		// @7A: getfield int game.C_100037_wb.field_102340_z
		// @7D: istore_3
		// @7E: aload_0
		// @7F: aload_0
		// @80: getfield int game.C_100037_wb.field_102341_y
		// @83: putfield int game.C_100037_wb.field_102340_z
		// @86: aload_0
		// @87: iload_3
		// @88: putfield int game.C_100037_wb.field_102341_y
		// @8B: return
	}
	
	private static final void func_102382_a(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11)
	{
		// @00: iload_3
		// @01: istore #12
		// @03: iload #8
		// @05: ineg
		// @06: istore #13
		// @08: iload #13
		// @0A: ifge @60
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
		// @1E: ifge @49
		// @21: aload_1
		// @22: iload_3
		// @23: bipush 16 (0x10)
		// @25: ishr
		// @26: iload #14
		// @28: iadd
		// @29: iaload
		// @2A: istore_2
		// @2B: iload_2
		// @2C: ifeq @3B
		// @2F: aload_0
		// @30: iload #5
		// @32: iinc #5 +1
		// @35: iload_2
		// @36: iastore
		// @37: goto @3E
		// @3A: athrow
		// @3B: iinc #5 +1
		// @3E: iload_3
		// @3F: iload #9
		// @41: iadd
		// @42: istore_3
		// @43: iinc #15 +1
		// @46: goto @1C
		// @49: iload #4
		// @4B: iload #10
		// @4D: iadd
		// @4E: istore #4
		// @50: iload #12
		// @52: istore_3
		// @53: iload #5
		// @55: iload #6
		// @57: iadd
		// @58: istore #5
		// @5A: iinc #13 +1
		// @5D: goto @08
		// @60: return
	}
	
	private final void func_102354_d(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @000: iload_3
		// @001: aload_0
		// @002: getfield int game.C_100037_wb.field_102339_s
		// @005: imul
		// @006: iload_2
		// @007: iadd
		// @008: istore #6
		// @00A: iload #4
		// @00C: sipush 4095 (0x0FFF)
		// @00F: iand
		// @010: istore #4
		// @012: iload #5
		// @014: sipush 4095 (0x0FFF)
		// @017: iand
		// @018: istore #5
		// @01A: iload_3
		// @01B: iflt @087
		// @01E: iload_2
		// @01F: iflt @04B
		// @022: goto @026
		// @025: athrow
		// @026: aload_0
		// @027: getfield int[] game.C_100037_wb.field_102388_J
		// @02A: iload #6
		// @02C: iaload
		// @02D: istore #7
		// @02F: iload #7
		// @031: ifeq @045
		// @034: sipush 4096 (0x1000)
		// @037: iload #4
		// @039: isub
		// @03A: sipush 4096 (0x1000)
		// @03D: iload #5
		// @03F: isub
		// @040: imul
		// @041: goto @046
		// @044: athrow
		// @045: iconst_0
		// @046: istore #11
		// @048: goto @051
		// @04B: iconst_0
		// @04C: istore #11
		// @04E: iconst_0
		// @04F: istore #7
		// @051: iload_2
		// @052: aload_0
		// @053: getfield int game.C_100037_wb.field_102339_s
		// @056: iconst_1
		// @057: isub
		// @058: if_icmpge @07E
		// @05B: aload_0
		// @05C: getfield int[] game.C_100037_wb.field_102388_J
		// @05F: iload #6
		// @061: iconst_1
		// @062: iadd
		// @063: iaload
		// @064: istore #8
		// @066: iload #8
		// @068: ifeq @078
		// @06B: iload #4
		// @06D: sipush 4096 (0x1000)
		// @070: iload #5
		// @072: isub
		// @073: imul
		// @074: goto @079
		// @077: athrow
		// @078: iconst_0
		// @079: istore #12
		// @07B: goto @093
		// @07E: iconst_0
		// @07F: istore #12
		// @081: iconst_0
		// @082: istore #8
		// @084: goto @093
		// @087: iconst_0
		// @088: istore #12
		// @08A: iconst_0
		// @08B: istore #11
		// @08D: iconst_0
		// @08E: istore #8
		// @090: iconst_0
		// @091: istore #7
		// @093: iload_3
		// @094: aload_0
		// @095: getfield int game.C_100037_wb.field_102337_u
		// @098: iconst_1
		// @099: isub
		// @09A: if_icmpge @108
		// @09D: iload_2
		// @09E: iflt @0CB
		// @0A1: goto @0A5
		// @0A4: athrow
		// @0A5: aload_0
		// @0A6: getfield int[] game.C_100037_wb.field_102388_J
		// @0A9: iload #6
		// @0AB: aload_0
		// @0AC: getfield int game.C_100037_wb.field_102339_s
		// @0AF: iadd
		// @0B0: iaload
		// @0B1: istore #9
		// @0B3: iload #9
		// @0B5: ifeq @0C5
		// @0B8: sipush 4096 (0x1000)
		// @0BB: iload #4
		// @0BD: isub
		// @0BE: iload #5
		// @0C0: imul
		// @0C1: goto @0C6
		// @0C4: athrow
		// @0C5: iconst_0
		// @0C6: istore #13
		// @0C8: goto @0D1
		// @0CB: iconst_0
		// @0CC: istore #13
		// @0CE: iconst_0
		// @0CF: istore #9
		// @0D1: iload_2
		// @0D2: aload_0
		// @0D3: getfield int game.C_100037_wb.field_102339_s
		// @0D6: iconst_1
		// @0D7: isub
		// @0D8: if_icmpge @0FF
		// @0DB: aload_0
		// @0DC: getfield int[] game.C_100037_wb.field_102388_J
		// @0DF: iload #6
		// @0E1: aload_0
		// @0E2: getfield int game.C_100037_wb.field_102339_s
		// @0E5: iadd
		// @0E6: iconst_1
		// @0E7: iadd
		// @0E8: iaload
		// @0E9: istore #10
		// @0EB: iload #10
		// @0ED: ifeq @0F9
		// @0F0: iload #4
		// @0F2: iload #5
		// @0F4: imul
		// @0F5: goto @0FA
		// @0F8: athrow
		// @0F9: iconst_0
		// @0FA: istore #14
		// @0FC: goto @114
		// @0FF: iconst_0
		// @100: istore #14
		// @102: iconst_0
		// @103: istore #10
		// @105: goto @114
		// @108: iconst_0
		// @109: istore #14
		// @10B: iconst_0
		// @10C: istore #13
		// @10E: iconst_0
		// @10F: istore #10
		// @111: iconst_0
		// @112: istore #9
		// @114: iload #11
		// @116: bipush 16 (0x10)
		// @118: ishr
		// @119: istore #11
		// @11B: iload #12
		// @11D: bipush 16 (0x10)
		// @11F: ishr
		// @120: istore #12
		// @122: iload #13
		// @124: bipush 16 (0x10)
		// @126: ishr
		// @127: istore #13
		// @129: iload #14
		// @12B: bipush 16 (0x10)
		// @12D: ishr
		// @12E: istore #14
		// @130: iload #11
		// @132: iload #12
		// @134: iadd
		// @135: iload #13
		// @137: iadd
		// @138: iload #14
		// @13A: iadd
		// @13B: istore #15
		// @13D: iload #15
		// @13F: sipush 256 (0x0100)
		// @142: if_icmplt @1BC
		// @145: iload #7
		// @147: ldc 16711935 (0xff00ff)
		// @149: iand
		// @14A: iload #11
		// @14C: imul
		// @14D: iload #8
		// @14F: ldc 16711935 (0xff00ff)
		// @151: iand
		// @152: iload #12
		// @154: imul
		// @155: iadd
		// @156: istore #16
		// @158: iload #16
		// @15A: iload #9
		// @15C: ldc 16711935 (0xff00ff)
		// @15E: iand
		// @15F: iload #13
		// @161: imul
		// @162: iload #10
		// @164: ldc 16711935 (0xff00ff)
		// @166: iand
		// @167: iload #14
		// @169: imul
		// @16A: iadd
		// @16B: iadd
		// @16C: istore #16
		// @16E: iload #7
		// @170: ldc 65280 (0xff00)
		// @172: iand
		// @173: iload #11
		// @175: imul
		// @176: iload #8
		// @178: ldc 65280 (0xff00)
		// @17A: iand
		// @17B: iload #12
		// @17D: imul
		// @17E: iadd
		// @17F: istore #17
		// @181: iload #17
		// @183: iload #9
		// @185: ldc 65280 (0xff00)
		// @187: iand
		// @188: iload #13
		// @18A: imul
		// @18B: iload #10
		// @18D: ldc 65280 (0xff00)
		// @18F: iand
		// @190: iload #14
		// @192: imul
		// @193: iadd
		// @194: iadd
		// @195: istore #17
		// @197: iload #16
		// @199: bipush 8 (0x08)
		// @19B: iushr
		// @19C: ldc 16711935 (0xff00ff)
		// @19E: iand
		// @19F: iload #17
		// @1A1: bipush 8 (0x08)
		// @1A3: iushr
		// @1A4: ldc 65280 (0xff00)
		// @1A6: iand
		// @1A7: iadd
		// @1A8: istore #18
		// @1AA: iload #18
		// @1AC: ifne @1B2
		// @1AF: iconst_1
		// @1B0: istore #18
		// @1B2: getstatic int[] game.C_100196_rb.field_105818_d
		// @1B5: iload_1
		// @1B6: iload #18
		// @1B8: iastore
		// @1B9: goto @244
		// @1BC: iload #15
		// @1BE: sipush 128 (0x0080)
		// @1C1: if_icmplt @244
		// @1C4: iload #7
		// @1C6: ldc 16711935 (0xff00ff)
		// @1C8: iand
		// @1C9: iload #11
		// @1CB: imul
		// @1CC: iload #8
		// @1CE: ldc 16711935 (0xff00ff)
		// @1D0: iand
		// @1D1: iload #12
		// @1D3: imul
		// @1D4: iadd
		// @1D5: istore #16
		// @1D7: iload #16
		// @1D9: iload #9
		// @1DB: ldc 16711935 (0xff00ff)
		// @1DD: iand
		// @1DE: iload #13
		// @1E0: imul
		// @1E1: iload #10
		// @1E3: ldc 16711935 (0xff00ff)
		// @1E5: iand
		// @1E6: iload #14
		// @1E8: imul
		// @1E9: iadd
		// @1EA: iadd
		// @1EB: istore #16
		// @1ED: iload #7
		// @1EF: ldc 65280 (0xff00)
		// @1F1: iand
		// @1F2: iload #11
		// @1F4: imul
		// @1F5: iload #8
		// @1F7: ldc 65280 (0xff00)
		// @1F9: iand
		// @1FA: iload #12
		// @1FC: imul
		// @1FD: iadd
		// @1FE: istore #17
		// @200: iload #17
		// @202: iload #9
		// @204: ldc 65280 (0xff00)
		// @206: iand
		// @207: iload #13
		// @209: imul
		// @20A: iload #10
		// @20C: ldc 65280 (0xff00)
		// @20E: iand
		// @20F: iload #14
		// @211: imul
		// @212: iadd
		// @213: iadd
		// @214: istore #17
		// @216: iload #16
		// @218: bipush 16 (0x10)
		// @21A: iushr
		// @21B: iload #15
		// @21D: idiv
		// @21E: bipush 16 (0x10)
		// @220: ishl
		// @221: iload #17
		// @223: iload #15
		// @225: idiv
		// @226: ldc 65280 (0xff00)
		// @228: iand
		// @229: iadd
		// @22A: iload #16
		// @22C: ldc 65535 (0xffff)
		// @22E: iand
		// @22F: iload #15
		// @231: idiv
		// @232: iadd
		// @233: istore #18
		// @235: iload #18
		// @237: ifne @23D
		// @23A: iconst_1
		// @23B: istore #18
		// @23D: getstatic int[] game.C_100196_rb.field_105818_d
		// @240: iload_1
		// @241: iload #18
		// @243: iastore
		// @244: return
	}
	
	private static final void func_102361_a(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9)
	{
		// @00: iload #7
		// @02: ineg
		// @03: istore #10
		// @05: iload #10
		// @07: ifge @96
		// @0A: iload #6
		// @0C: ineg
		// @0D: istore #11
		// @0F: iload #11
		// @11: ifge @82
		// @14: aload_2
		// @15: iload #4
		// @17: iinc #4 +1
		// @1A: iaload
		// @1B: istore_3
		// @1C: iload_3
		// @1D: ifeq @79
		// @20: aload_1
		// @21: iload #5
		// @23: iaload
		// @24: istore_0
		// @25: iload_0
		// @26: ifeq @73
		// @29: iload_3
		// @2A: ldc 16711680 (0xff0000)
		// @2C: iand
		// @2D: bipush 16 (0x10)
		// @2F: iushr
		// @30: iload_0
		// @31: ldc 16711680 (0xff0000)
		// @33: iand
		// @34: bipush 16 (0x10)
		// @36: iushr
		// @37: imul
		// @38: bipush 8 (0x08)
		// @3A: iushr
		// @3B: istore #12
		// @3D: iload_3
		// @3E: ldc 65280 (0xff00)
		// @40: iand
		// @41: iload_0
		// @42: ldc 65280 (0xff00)
		// @44: iand
		// @45: imul
		// @46: bipush 24 (0x18)
		// @48: iushr
		// @49: istore #13
		// @4B: iload_3
		// @4C: sipush 255 (0x00FF)
		// @4F: iand
		// @50: iload_0
		// @51: sipush 255 (0x00FF)
		// @54: iand
		// @55: imul
		// @56: bipush 8 (0x08)
		// @58: iushr
		// @59: istore #14
		// @5B: aload_1
		// @5C: iload #5
		// @5E: iinc #5 +1
		// @61: iload #12
		// @63: bipush 16 (0x10)
		// @65: ishl
		// @66: iload #13
		// @68: bipush 8 (0x08)
		// @6A: ishl
		// @6B: iadd
		// @6C: iload #14
		// @6E: iadd
		// @6F: iastore
		// @70: goto @7C
		// @73: iinc #5 +1
		// @76: goto @7C
		// @79: iinc #5 +1
		// @7C: iinc #11 +1
		// @7F: goto @0F
		// @82: iload #5
		// @84: iload #8
		// @86: iadd
		// @87: istore #5
		// @89: iload #4
		// @8B: iload #9
		// @8D: iadd
		// @8E: istore #4
		// @90: iinc #10 +1
		// @93: goto @05
		// @96: return
	}
	
	void func_102348_e(int arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100037_wb.field_102335_w
		// @05: iadd
		// @06: istore_1
		// @07: iload_2
		// @08: aload_0
		// @09: getfield int game.C_100037_wb.field_102332_H
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
		// @1B: getfield int game.C_100037_wb.field_102337_u
		// @1E: istore #6
		// @20: aload_0
		// @21: getfield int game.C_100037_wb.field_102339_s
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
		// @D6: ifle @E2
		// @D9: iload #6
		// @DB: ifgt @E4
		// @DE: goto @E2
		// @E1: athrow
		// @E2: return
		// @E3: athrow
		// @E4: getstatic int[] game.C_100196_rb.field_105818_d
		// @E7: aload_0
		// @E8: getfield int[] game.C_100037_wb.field_102388_J
		// @EB: iconst_0
		// @EC: iload #5
		// @EE: iload #4
		// @F0: iload #7
		// @F2: iload #6
		// @F4: iload #8
		// @F6: iload #9
		// @F8: iload_3
		// @F9: invokestatic game.C_100037_wb.func_102352_a(int[], int[], int, int, int, int, int, int, int, int)void
		// @FC: return
	}
	
	final void func_102368_d(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100037_wb.field_102335_w
		// @05: iadd
		// @06: istore_1
		// @07: iload_2
		// @08: aload_0
		// @09: getfield int game.C_100037_wb.field_102332_H
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
		// @1A: getfield int game.C_100037_wb.field_102337_u
		// @1D: istore #5
		// @1F: aload_0
		// @20: getfield int game.C_100037_wb.field_102339_s
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
		// @D1: ifle @DD
		// @D4: iload #5
		// @D6: ifgt @DF
		// @D9: goto @DD
		// @DC: athrow
		// @DD: return
		// @DE: athrow
		// @DF: iconst_0
		// @E0: getstatic int[] game.C_100196_rb.field_105818_d
		// @E3: aload_0
		// @E4: getfield int[] game.C_100037_wb.field_102388_J
		// @E7: iconst_0
		// @E8: iload #4
		// @EA: iload_3
		// @EB: iload #6
		// @ED: iload #5
		// @EF: iload #7
		// @F1: iload #8
		// @F3: invokestatic game.C_100037_wb.func_102361_a(int, int[], int[], int, int, int, int, int, int, int)void
		// @F6: return
	}
	
	void func_102365_c(int arg0, int arg1)
	{
		// @000: iload_1
		// @001: aload_0
		// @002: getfield int game.C_100037_wb.field_102335_w
		// @005: iadd
		// @006: istore_1
		// @007: iload_2
		// @008: aload_0
		// @009: getfield int game.C_100037_wb.field_102340_z
		// @00C: aload_0
		// @00D: getfield int game.C_100037_wb.field_102337_u
		// @010: isub
		// @011: aload_0
		// @012: getfield int game.C_100037_wb.field_102332_H
		// @015: isub
		// @016: iadd
		// @017: istore_2
		// @018: iload_1
		// @019: iload_2
		// @01A: aload_0
		// @01B: getfield int game.C_100037_wb.field_102337_u
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
		// @02B: getfield int game.C_100037_wb.field_102337_u
		// @02E: istore #5
		// @030: aload_0
		// @031: getfield int game.C_100037_wb.field_102339_s
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
		// @0E3: ifle @0EF
		// @0E6: iload #5
		// @0E8: ifgt @0F1
		// @0EB: goto @0EF
		// @0EE: athrow
		// @0EF: return
		// @0F0: athrow
		// @0F1: getstatic int[] game.C_100196_rb.field_105818_d
		// @0F4: aload_0
		// @0F5: getfield int[] game.C_100037_wb.field_102388_J
		// @0F8: iconst_0
		// @0F9: iload #4
		// @0FB: iload_3
		// @0FC: iload #6
		// @0FE: iload #5
		// @100: iload #7
		// @102: iload #8
		// @104: invokestatic game.C_100037_wb.func_102362_c(int[], int[], int, int, int, int, int, int, int)void
		// @107: return
	}
	
	final C_100037_wb func_102371_f()
	{
		// @00: new game.C_100037_wb
		// @03: dup
		// @04: aload_0
		// @05: getfield int game.C_100037_wb.field_102339_s
		// @08: aload_0
		// @09: getfield int game.C_100037_wb.field_102337_u
		// @0C: invokespecial game.C_100037_wb.<init>(int, int)void
		// @0F: astore_1
		// @10: aload_1
		// @11: aload_0
		// @12: getfield int game.C_100037_wb.field_102341_y
		// @15: putfield int game.C_100037_wb.field_102341_y
		// @18: aload_1
		// @19: aload_0
		// @1A: getfield int game.C_100037_wb.field_102340_z
		// @1D: putfield int game.C_100037_wb.field_102340_z
		// @20: aload_1
		// @21: aload_0
		// @22: getfield int game.C_100037_wb.field_102341_y
		// @25: aload_0
		// @26: getfield int game.C_100037_wb.field_102339_s
		// @29: isub
		// @2A: aload_0
		// @2B: getfield int game.C_100037_wb.field_102335_w
		// @2E: isub
		// @2F: putfield int game.C_100037_wb.field_102335_w
		// @32: aload_1
		// @33: aload_0
		// @34: getfield int game.C_100037_wb.field_102332_H
		// @37: putfield int game.C_100037_wb.field_102332_H
		// @3A: iconst_0
		// @3B: istore_2
		// @3C: iload_2
		// @3D: aload_0
		// @3E: getfield int game.C_100037_wb.field_102337_u
		// @41: if_icmpge @7C
		// @44: iconst_0
		// @45: istore_3
		// @46: iload_3
		// @47: aload_0
		// @48: getfield int game.C_100037_wb.field_102339_s
		// @4B: if_icmpge @76
		// @4E: aload_1
		// @4F: getfield int[] game.C_100037_wb.field_102388_J
		// @52: iload_2
		// @53: aload_0
		// @54: getfield int game.C_100037_wb.field_102339_s
		// @57: imul
		// @58: iload_3
		// @59: iadd
		// @5A: aload_0
		// @5B: getfield int[] game.C_100037_wb.field_102388_J
		// @5E: iload_2
		// @5F: aload_0
		// @60: getfield int game.C_100037_wb.field_102339_s
		// @63: imul
		// @64: aload_0
		// @65: getfield int game.C_100037_wb.field_102339_s
		// @68: iadd
		// @69: iconst_1
		// @6A: isub
		// @6B: iload_3
		// @6C: isub
		// @6D: iaload
		// @6E: iastore
		// @6F: iinc #3 +1
		// @72: goto @46
		// @75: athrow
		// @76: iinc #2 +1
		// @79: goto @3C
		// @7C: aload_1
		// @7D: areturn
	}
	
	private static final void func_102369_b(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8)
	{
		// @00: iload #5
		// @02: iconst_2
		// @03: ishr
		// @04: ineg
		// @05: istore #9
		// @07: iload #5
		// @09: iconst_3
		// @0A: iand
		// @0B: ineg
		// @0C: istore #5
		// @0E: iload #6
		// @10: ineg
		// @11: istore #10
		// @13: iload #10
		// @15: ifge @CA
		// @18: iload #9
		// @1A: istore #11
		// @1C: iload #11
		// @1E: ifge @8F
		// @21: aload_1
		// @22: iload_3
		// @23: iinc #3 +255
		// @26: iaload
		// @27: istore_2
		// @28: iload_2
		// @29: ifeq @38
		// @2C: aload_0
		// @2D: iload #4
		// @2F: iinc #4 +1
		// @32: iload_2
		// @33: iastore
		// @34: goto @3B
		// @37: athrow
		// @38: iinc #4 +1
		// @3B: aload_1
		// @3C: iload_3
		// @3D: iinc #3 +255
		// @40: iaload
		// @41: istore_2
		// @42: iload_2
		// @43: ifeq @52
		// @46: aload_0
		// @47: iload #4
		// @49: iinc #4 +1
		// @4C: iload_2
		// @4D: iastore
		// @4E: goto @55
		// @51: athrow
		// @52: iinc #4 +1
		// @55: aload_1
		// @56: iload_3
		// @57: iinc #3 +255
		// @5A: iaload
		// @5B: istore_2
		// @5C: iload_2
		// @5D: ifeq @6C
		// @60: aload_0
		// @61: iload #4
		// @63: iinc #4 +1
		// @66: iload_2
		// @67: iastore
		// @68: goto @6F
		// @6B: athrow
		// @6C: iinc #4 +1
		// @6F: aload_1
		// @70: iload_3
		// @71: iinc #3 +255
		// @74: iaload
		// @75: istore_2
		// @76: iload_2
		// @77: ifeq @86
		// @7A: aload_0
		// @7B: iload #4
		// @7D: iinc #4 +1
		// @80: iload_2
		// @81: iastore
		// @82: goto @89
		// @85: athrow
		// @86: iinc #4 +1
		// @89: iinc #11 +1
		// @8C: goto @1C
		// @8F: iload #5
		// @91: istore #11
		// @93: iload #11
		// @95: ifge @B8
		// @98: aload_1
		// @99: iload_3
		// @9A: iinc #3 +255
		// @9D: iaload
		// @9E: istore_2
		// @9F: iload_2
		// @A0: ifeq @AF
		// @A3: aload_0
		// @A4: iload #4
		// @A6: iinc #4 +1
		// @A9: iload_2
		// @AA: iastore
		// @AB: goto @B2
		// @AE: athrow
		// @AF: iinc #4 +1
		// @B2: iinc #11 +1
		// @B5: goto @93
		// @B8: iload #4
		// @BA: iload #7
		// @BC: iadd
		// @BD: istore #4
		// @BF: iload_3
		// @C0: iload #8
		// @C2: iadd
		// @C3: istore_3
		// @C4: iinc #10 +1
		// @C7: goto @13
		// @CA: return
	}
	
	private static final void func_102374_a(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13)
	{
		// @00: iload #10
		// @02: ineg
		// @03: istore #8
		// @05: iload #8
		// @07: ifge @8B
		// @0A: iload #9
		// @0C: ineg
		// @0D: istore #6
		// @0F: iload #6
		// @11: ifge @77
		// @14: aload #4
		// @16: iload #5
		// @18: iinc #5 +1
		// @1B: iaload
		// @1C: istore_0
		// @1D: iload_0
		// @1E: ifeq @6E
		// @21: iload_0
		// @22: ldc 16711935 (0xff00ff)
		// @24: iand
		// @25: iload #13
		// @27: imul
		// @28: istore_1
		// @29: iload_1
		// @2A: ldc -16711936 (0xff00ff00)
		// @2C: iand
		// @2D: iload_0
		// @2E: iload #13
		// @30: imul
		// @31: iload_1
		// @32: isub
		// @33: ldc 16711680 (0xff0000)
		// @35: iand
		// @36: iadd
		// @37: bipush 8 (0x08)
		// @39: iushr
		// @3A: istore_0
		// @3B: aload_3
		// @3C: iload #7
		// @3E: iaload
		// @3F: istore_1
		// @40: iload_0
		// @41: iload_1
		// @42: iadd
		// @43: istore_2
		// @44: iload_0
		// @45: ldc 16711935 (0xff00ff)
		// @47: iand
		// @48: iload_1
		// @49: ldc 16711935 (0xff00ff)
		// @4B: iand
		// @4C: iadd
		// @4D: istore_0
		// @4E: iload_0
		// @4F: ldc 16777472 (0x1000100)
		// @51: iand
		// @52: iload_2
		// @53: iload_0
		// @54: isub
		// @55: ldc 65536 (0x10000)
		// @57: iand
		// @58: iadd
		// @59: istore_1
		// @5A: aload_3
		// @5B: iload #7
		// @5D: iinc #7 +1
		// @60: iload_2
		// @61: iload_1
		// @62: isub
		// @63: iload_1
		// @64: iload_1
		// @65: bipush 8 (0x08)
		// @67: iushr
		// @68: isub
		// @69: ior
		// @6A: iastore
		// @6B: goto @71
		// @6E: iinc #7 +1
		// @71: iinc #6 +1
		// @74: goto @0F
		// @77: iload #7
		// @79: iload #11
		// @7B: iadd
		// @7C: istore #7
		// @7E: iload #5
		// @80: iload #12
		// @82: iadd
		// @83: istore #5
		// @85: iinc #8 +1
		// @88: goto @05
		// @8B: return
	}
	
	final C_100037_wb func_102381_e()
	{
		// @00: new game.C_100037_wb
		// @03: dup
		// @04: aload_0
		// @05: getfield int game.C_100037_wb.field_102339_s
		// @08: aload_0
		// @09: getfield int game.C_100037_wb.field_102337_u
		// @0C: invokespecial game.C_100037_wb.<init>(int, int)void
		// @0F: astore_1
		// @10: aload_1
		// @11: aload_0
		// @12: getfield int game.C_100037_wb.field_102341_y
		// @15: putfield int game.C_100037_wb.field_102341_y
		// @18: aload_1
		// @19: aload_0
		// @1A: getfield int game.C_100037_wb.field_102340_z
		// @1D: putfield int game.C_100037_wb.field_102340_z
		// @20: aload_1
		// @21: aload_0
		// @22: getfield int game.C_100037_wb.field_102335_w
		// @25: putfield int game.C_100037_wb.field_102335_w
		// @28: aload_1
		// @29: aload_0
		// @2A: getfield int game.C_100037_wb.field_102332_H
		// @2D: putfield int game.C_100037_wb.field_102332_H
		// @30: aload_0
		// @31: getfield int[] game.C_100037_wb.field_102388_J
		// @34: arraylength
		// @35: istore_2
		// @36: iconst_0
		// @37: istore_3
		// @38: iload_3
		// @39: iload_2
		// @3A: if_icmpge @50
		// @3D: aload_1
		// @3E: getfield int[] game.C_100037_wb.field_102388_J
		// @41: iload_3
		// @42: aload_0
		// @43: getfield int[] game.C_100037_wb.field_102388_J
		// @46: iload_3
		// @47: iaload
		// @48: iastore
		// @49: iinc #3 +1
		// @4C: goto @38
		// @4F: athrow
		// @50: aload_1
		// @51: areturn
	}
	
	private static final void func_102352_a(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9)
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
		// @043: ifge @13B
		// @046: iload #14
		// @048: istore #16
		// @04A: iload #16
		// @04C: ifge @129
		// @04F: aload_1
		// @050: iload_3
		// @051: iinc #3 +1
		// @054: iaload
		// @055: istore_2
		// @056: iload_2
		// @057: ifeq @120
		// @05A: iload_2
		// @05B: bipush 16 (0x10)
		// @05D: ishr
		// @05E: sipush 255 (0x00FF)
		// @061: iand
		// @062: istore #17
		// @064: iload_2
		// @065: bipush 8 (0x08)
		// @067: ishr
		// @068: sipush 255 (0x00FF)
		// @06B: iand
		// @06C: istore #18
		// @06E: iload_2
		// @06F: sipush 255 (0x00FF)
		// @072: iand
		// @073: istore #19
		// @075: iload #17
		// @077: iload #18
		// @079: if_icmpne @115
		// @07C: iload #18
		// @07E: iload #19
		// @080: if_icmpne @115
		// @083: goto @087
		// @086: athrow
		// @087: iload #17
		// @089: sipush 128 (0x0080)
		// @08C: if_icmpgt @0BE
		// @08F: goto @093
		// @092: athrow
		// @093: aload_0
		// @094: iload #4
		// @096: iinc #4 +1
		// @099: iload #17
		// @09B: iload #10
		// @09D: imul
		// @09E: bipush 7 (0x07)
		// @0A0: ishr
		// @0A1: bipush 16 (0x10)
		// @0A3: ishl
		// @0A4: iload #18
		// @0A6: iload #11
		// @0A8: imul
		// @0A9: bipush 7 (0x07)
		// @0AB: ishr
		// @0AC: bipush 8 (0x08)
		// @0AE: ishl
		// @0AF: iadd
		// @0B0: iload #19
		// @0B2: iload #12
		// @0B4: imul
		// @0B5: bipush 7 (0x07)
		// @0B7: ishr
		// @0B8: iadd
		// @0B9: iastore
		// @0BA: goto @11D
		// @0BD: athrow
		// @0BE: aload_0
		// @0BF: iload #4
		// @0C1: iinc #4 +1
		// @0C4: iload #10
		// @0C6: sipush 256 (0x0100)
		// @0C9: iload #17
		// @0CB: isub
		// @0CC: imul
		// @0CD: sipush 255 (0x00FF)
		// @0D0: iload #17
		// @0D2: sipush 128 (0x0080)
		// @0D5: isub
		// @0D6: imul
		// @0D7: iadd
		// @0D8: bipush 7 (0x07)
		// @0DA: ishr
		// @0DB: bipush 16 (0x10)
		// @0DD: ishl
		// @0DE: iload #11
		// @0E0: sipush 256 (0x0100)
		// @0E3: iload #18
		// @0E5: isub
		// @0E6: imul
		// @0E7: sipush 255 (0x00FF)
		// @0EA: iload #18
		// @0EC: sipush 128 (0x0080)
		// @0EF: isub
		// @0F0: imul
		// @0F1: iadd
		// @0F2: bipush 7 (0x07)
		// @0F4: ishr
		// @0F5: bipush 8 (0x08)
		// @0F7: ishl
		// @0F8: iadd
		// @0F9: iload #12
		// @0FB: sipush 256 (0x0100)
		// @0FE: iload #19
		// @100: isub
		// @101: imul
		// @102: sipush 255 (0x00FF)
		// @105: iload #19
		// @107: sipush 128 (0x0080)
		// @10A: isub
		// @10B: imul
		// @10C: iadd
		// @10D: bipush 7 (0x07)
		// @10F: ishr
		// @110: iadd
		// @111: iastore
		// @112: goto @11D
		// @115: aload_0
		// @116: iload #4
		// @118: iinc #4 +1
		// @11B: iload_2
		// @11C: iastore
		// @11D: goto @123
		// @120: iinc #4 +1
		// @123: iinc #16 +1
		// @126: goto @04A
		// @129: iload #4
		// @12B: iload #7
		// @12D: iadd
		// @12E: istore #4
		// @130: iload_3
		// @131: iload #8
		// @133: iadd
		// @134: istore_3
		// @135: iinc #15 +1
		// @138: goto @041
		// @13B: return
	}
	
	final void func_102380_g()
	{
		// @00: aload_0
		// @01: getfield int[] game.C_100037_wb.field_102388_J
		// @04: astore_1
		// @05: aload_0
		// @06: getfield int game.C_100037_wb.field_102337_u
		// @09: iconst_1
		// @0A: isub
		// @0B: istore_2
		// @0C: iload_2
		// @0D: iflt @48
		// @10: iload_2
		// @11: aload_0
		// @12: getfield int game.C_100037_wb.field_102339_s
		// @15: imul
		// @16: istore_3
		// @17: iload_2
		// @18: iconst_1
		// @19: iadd
		// @1A: aload_0
		// @1B: getfield int game.C_100037_wb.field_102339_s
		// @1E: imul
		// @1F: istore #4
		// @21: iload_3
		// @22: iload #4
		// @24: if_icmpge @42
		// @27: iinc #4 +255
		// @2A: aload_1
		// @2B: iload_3
		// @2C: iaload
		// @2D: istore #5
		// @2F: aload_1
		// @30: iload_3
		// @31: aload_1
		// @32: iload #4
		// @34: iaload
		// @35: iastore
		// @36: aload_1
		// @37: iload #4
		// @39: iload #5
		// @3B: iastore
		// @3C: iinc #3 +1
		// @3F: goto @21
		// @42: iinc #2 +255
		// @45: goto @0C
		// @48: aload_0
		// @49: aload_0
		// @4A: getfield int game.C_100037_wb.field_102341_y
		// @4D: aload_0
		// @4E: getfield int game.C_100037_wb.field_102339_s
		// @51: isub
		// @52: aload_0
		// @53: getfield int game.C_100037_wb.field_102335_w
		// @56: isub
		// @57: putfield int game.C_100037_wb.field_102335_w
		// @5A: return
	}
	
	void func_102383_f(int arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100037_wb.field_102335_w
		// @05: iadd
		// @06: istore_1
		// @07: iload_2
		// @08: aload_0
		// @09: getfield int game.C_100037_wb.field_102332_H
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
		// @1B: getfield int game.C_100037_wb.field_102337_u
		// @1E: istore #6
		// @20: aload_0
		// @21: getfield int game.C_100037_wb.field_102339_s
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
		// @D6: ifle @E2
		// @D9: iload #6
		// @DB: ifgt @E4
		// @DE: goto @E2
		// @E1: athrow
		// @E2: return
		// @E3: athrow
		// @E4: getstatic int[] game.C_100196_rb.field_105818_d
		// @E7: aload_0
		// @E8: getfield int[] game.C_100037_wb.field_102388_J
		// @EB: iconst_0
		// @EC: iload #5
		// @EE: iload #4
		// @F0: iconst_0
		// @F1: iconst_0
		// @F2: iload #7
		// @F4: iload #6
		// @F6: iload #8
		// @F8: iload #9
		// @FA: iload_3
		// @FB: invokestatic game.C_100037_wb.func_102372_b(int[], int[], int, int, int, int, int, int, int, int, int, int)void
		// @FE: return
	}
	
	void func_102367_c(int arg0, int arg1, int arg2)
	{
		// @000: iload_1
		// @001: aload_0
		// @002: getfield int game.C_100037_wb.field_102335_w
		// @005: iadd
		// @006: istore_1
		// @007: iload_2
		// @008: aload_0
		// @009: getfield int game.C_100037_wb.field_102332_H
		// @00C: iadd
		// @00D: istore_2
		// @00E: iload_1
		// @00F: iload_2
		// @010: getstatic int game.C_100196_rb.field_105819_e
		// @013: imul
		// @014: iadd
		// @015: istore #4
		// @017: iconst_0
		// @018: istore #5
		// @01A: aload_0
		// @01B: getfield int game.C_100037_wb.field_102337_u
		// @01E: istore #6
		// @020: aload_0
		// @021: getfield int game.C_100037_wb.field_102339_s
		// @024: istore #7
		// @026: getstatic int game.C_100196_rb.field_105819_e
		// @029: iload #7
		// @02B: isub
		// @02C: istore #8
		// @02E: iconst_0
		// @02F: istore #9
		// @031: iload_2
		// @032: getstatic int game.C_100196_rb.field_105816_f
		// @035: if_icmpge @05F
		// @038: getstatic int game.C_100196_rb.field_105816_f
		// @03B: iload_2
		// @03C: isub
		// @03D: istore #10
		// @03F: iload #6
		// @041: iload #10
		// @043: isub
		// @044: istore #6
		// @046: getstatic int game.C_100196_rb.field_105816_f
		// @049: istore_2
		// @04A: iload #5
		// @04C: iload #10
		// @04E: iload #7
		// @050: imul
		// @051: iadd
		// @052: istore #5
		// @054: iload #4
		// @056: iload #10
		// @058: getstatic int game.C_100196_rb.field_105819_e
		// @05B: imul
		// @05C: iadd
		// @05D: istore #4
		// @05F: iload_2
		// @060: iload #6
		// @062: iadd
		// @063: getstatic int game.C_100196_rb.field_105823_l
		// @066: if_icmple @076
		// @069: iload #6
		// @06B: iload_2
		// @06C: iload #6
		// @06E: iadd
		// @06F: getstatic int game.C_100196_rb.field_105823_l
		// @072: isub
		// @073: isub
		// @074: istore #6
		// @076: iload_1
		// @077: getstatic int game.C_100196_rb.field_105827_i
		// @07A: if_icmpge @0AB
		// @07D: getstatic int game.C_100196_rb.field_105827_i
		// @080: iload_1
		// @081: isub
		// @082: istore #10
		// @084: iload #7
		// @086: iload #10
		// @088: isub
		// @089: istore #7
		// @08B: getstatic int game.C_100196_rb.field_105827_i
		// @08E: istore_1
		// @08F: iload #5
		// @091: iload #10
		// @093: iadd
		// @094: istore #5
		// @096: iload #4
		// @098: iload #10
		// @09A: iadd
		// @09B: istore #4
		// @09D: iload #9
		// @09F: iload #10
		// @0A1: iadd
		// @0A2: istore #9
		// @0A4: iload #8
		// @0A6: iload #10
		// @0A8: iadd
		// @0A9: istore #8
		// @0AB: iload_1
		// @0AC: iload #7
		// @0AE: iadd
		// @0AF: getstatic int game.C_100196_rb.field_105820_b
		// @0B2: if_icmple @0D4
		// @0B5: iload_1
		// @0B6: iload #7
		// @0B8: iadd
		// @0B9: getstatic int game.C_100196_rb.field_105820_b
		// @0BC: isub
		// @0BD: istore #10
		// @0BF: iload #7
		// @0C1: iload #10
		// @0C3: isub
		// @0C4: istore #7
		// @0C6: iload #9
		// @0C8: iload #10
		// @0CA: iadd
		// @0CB: istore #9
		// @0CD: iload #8
		// @0CF: iload #10
		// @0D1: iadd
		// @0D2: istore #8
		// @0D4: iload #7
		// @0D6: ifle @0E2
		// @0D9: iload #6
		// @0DB: ifgt @0E4
		// @0DE: goto @0E2
		// @0E1: athrow
		// @0E2: return
		// @0E3: athrow
		// @0E4: iload_3
		// @0E5: sipush 256 (0x0100)
		// @0E8: if_icmpne @10A
		// @0EB: iconst_0
		// @0EC: iconst_0
		// @0ED: iconst_0
		// @0EE: getstatic int[] game.C_100196_rb.field_105818_d
		// @0F1: aload_0
		// @0F2: getfield int[] game.C_100037_wb.field_102388_J
		// @0F5: iload #5
		// @0F7: iconst_0
		// @0F8: iload #4
		// @0FA: iconst_0
		// @0FB: iload #7
		// @0FD: iload #6
		// @0FF: iload #8
		// @101: iload #9
		// @103: invokestatic game.C_100037_wb.func_102358_a(int, int, int, int[], int[], int, int, int, int, int, int, int, int)void
		// @106: goto @126
		// @109: athrow
		// @10A: iconst_0
		// @10B: iconst_0
		// @10C: iconst_0
		// @10D: getstatic int[] game.C_100196_rb.field_105818_d
		// @110: aload_0
		// @111: getfield int[] game.C_100037_wb.field_102388_J
		// @114: iload #5
		// @116: iconst_0
		// @117: iload #4
		// @119: iconst_0
		// @11A: iload #7
		// @11C: iload #6
		// @11E: iload #8
		// @120: iload #9
		// @122: iload_3
		// @123: invokestatic game.C_100037_wb.func_102374_a(int, int, int, int[], int[], int, int, int, int, int, int, int, int, int)void
		// @126: return
	}
	
	void func_102351_e(int arg0, int arg1)
	{
		// @000: iload_1
		// @001: aload_0
		// @002: getfield int game.C_100037_wb.field_102341_y
		// @005: aload_0
		// @006: getfield int game.C_100037_wb.field_102339_s
		// @009: isub
		// @00A: aload_0
		// @00B: getfield int game.C_100037_wb.field_102335_w
		// @00E: isub
		// @00F: iadd
		// @010: istore_1
		// @011: iload_2
		// @012: aload_0
		// @013: getfield int game.C_100037_wb.field_102332_H
		// @016: iadd
		// @017: istore_2
		// @018: iload_1
		// @019: iload_2
		// @01A: getstatic int game.C_100196_rb.field_105819_e
		// @01D: imul
		// @01E: iadd
		// @01F: istore_3
		// @020: aload_0
		// @021: getfield int game.C_100037_wb.field_102339_s
		// @024: iconst_1
		// @025: isub
		// @026: istore #4
		// @028: aload_0
		// @029: getfield int game.C_100037_wb.field_102337_u
		// @02C: istore #5
		// @02E: aload_0
		// @02F: getfield int game.C_100037_wb.field_102339_s
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
		// @0E4: ifle @0F0
		// @0E7: iload #5
		// @0E9: ifgt @0F2
		// @0EC: goto @0F0
		// @0EF: athrow
		// @0F0: return
		// @0F1: athrow
		// @0F2: getstatic int[] game.C_100196_rb.field_105818_d
		// @0F5: aload_0
		// @0F6: getfield int[] game.C_100037_wb.field_102388_J
		// @0F9: iconst_0
		// @0FA: iload #4
		// @0FC: iload_3
		// @0FD: iload #6
		// @0FF: iload #5
		// @101: iload #7
		// @103: iload #8
		// @105: invokestatic game.C_100037_wb.func_102369_b(int[], int[], int, int, int, int, int, int, int)void
		// @108: return
	}
	
	void func_102386_f(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100037_wb.field_102335_w
		// @05: iadd
		// @06: istore_1
		// @07: iload_2
		// @08: aload_0
		// @09: getfield int game.C_100037_wb.field_102332_H
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
		// @1A: getfield int game.C_100037_wb.field_102337_u
		// @1D: istore #5
		// @1F: aload_0
		// @20: getfield int game.C_100037_wb.field_102339_s
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
		// @D1: ifle @DD
		// @D4: iload #5
		// @D6: ifgt @DF
		// @D9: goto @DD
		// @DC: athrow
		// @DD: return
		// @DE: athrow
		// @DF: getstatic int[] game.C_100196_rb.field_105818_d
		// @E2: aload_0
		// @E3: getfield int[] game.C_100037_wb.field_102388_J
		// @E6: iload #4
		// @E8: iload_3
		// @E9: iload #6
		// @EB: iload #5
		// @ED: iload #7
		// @EF: iload #8
		// @F1: invokestatic game.C_100037_wb.func_102347_a(int[], int[], int, int, int, int, int, int)void
		// @F4: return
	}
	
	C_100037_wb(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100249_pc.<init>()void
		// @04: aload_0
		// @05: iload_1
		// @06: putfield int game.C_100037_wb.field_102341_y
		// @09: aload_0
		// @0A: iload_2
		// @0B: putfield int game.C_100037_wb.field_102340_z
		// @0E: aload_0
		// @0F: iload_3
		// @10: putfield int game.C_100037_wb.field_102335_w
		// @13: aload_0
		// @14: iload #4
		// @16: putfield int game.C_100037_wb.field_102332_H
		// @19: aload_0
		// @1A: iload #5
		// @1C: putfield int game.C_100037_wb.field_102339_s
		// @1F: aload_0
		// @20: iload #6
		// @22: putfield int game.C_100037_wb.field_102337_u
		// @25: aload_0
		// @26: aload #7
		// @28: putfield int[] game.C_100037_wb.field_102388_J
		// @2B: return
	}
	
	void func_102360_g(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100037_wb.field_102335_w
		// @05: iconst_1
		// @06: ishr
		// @07: iadd
		// @08: istore_1
		// @09: iload_2
		// @0A: aload_0
		// @0B: getfield int game.C_100037_wb.field_102332_H
		// @0E: iconst_1
		// @0F: ishr
		// @10: iadd
		// @11: istore_2
		// @12: iload_1
		// @13: getstatic int game.C_100196_rb.field_105827_i
		// @16: if_icmpge @24
		// @19: getstatic int game.C_100196_rb.field_105827_i
		// @1C: iload_1
		// @1D: isub
		// @1E: iconst_1
		// @1F: ishl
		// @20: goto @25
		// @23: athrow
		// @24: iconst_0
		// @25: istore_3
		// @26: iload_1
		// @27: aload_0
		// @28: getfield int game.C_100037_wb.field_102339_s
		// @2B: iconst_1
		// @2C: ishr
		// @2D: iadd
		// @2E: getstatic int game.C_100196_rb.field_105820_b
		// @31: if_icmple @3F
		// @34: getstatic int game.C_100196_rb.field_105820_b
		// @37: iload_1
		// @38: isub
		// @39: iconst_1
		// @3A: ishl
		// @3B: goto @43
		// @3E: athrow
		// @3F: aload_0
		// @40: getfield int game.C_100037_wb.field_102339_s
		// @43: istore #4
		// @45: iload_2
		// @46: getstatic int game.C_100196_rb.field_105816_f
		// @49: if_icmpge @57
		// @4C: getstatic int game.C_100196_rb.field_105816_f
		// @4F: iload_2
		// @50: isub
		// @51: iconst_1
		// @52: ishl
		// @53: goto @58
		// @56: athrow
		// @57: iconst_0
		// @58: istore #5
		// @5A: iload_2
		// @5B: aload_0
		// @5C: getfield int game.C_100037_wb.field_102337_u
		// @5F: iconst_1
		// @60: ishr
		// @61: iadd
		// @62: getstatic int game.C_100196_rb.field_105823_l
		// @65: if_icmple @73
		// @68: getstatic int game.C_100196_rb.field_105823_l
		// @6B: iload_2
		// @6C: isub
		// @6D: iconst_1
		// @6E: ishl
		// @6F: goto @77
		// @72: athrow
		// @73: aload_0
		// @74: getfield int game.C_100037_wb.field_102337_u
		// @77: istore #6
		// @79: aload_0
		// @7A: getfield int[] game.C_100037_wb.field_102388_J
		// @7D: iload #5
		// @7F: aload_0
		// @80: getfield int game.C_100037_wb.field_102339_s
		// @83: imul
		// @84: iload_3
		// @85: iadd
		// @86: iload_2
		// @87: iload #5
		// @89: iconst_1
		// @8A: ishr
		// @8B: iadd
		// @8C: getstatic int game.C_100196_rb.field_105819_e
		// @8F: imul
		// @90: iload_1
		// @91: iload_3
		// @92: iconst_1
		// @93: ishr
		// @94: iadd
		// @95: iadd
		// @96: aload_0
		// @97: getfield int game.C_100037_wb.field_102339_s
		// @9A: iconst_1
		// @9B: ishl
		// @9C: iload #4
		// @9E: iload_3
		// @9F: isub
		// @A0: isub
		// @A1: aload_0
		// @A2: getfield int game.C_100037_wb.field_102339_s
		// @A5: iconst_1
		// @A6: iand
		// @A7: iadd
		// @A8: getstatic int game.C_100196_rb.field_105819_e
		// @AB: iload #4
		// @AD: iload_3
		// @AE: isub
		// @AF: iconst_1
		// @B0: ishr
		// @B1: isub
		// @B2: aload_0
		// @B3: getfield int game.C_100037_wb.field_102339_s
		// @B6: iload #4
		// @B8: iload_3
		// @B9: isub
		// @BA: iconst_1
		// @BB: ishr
		// @BC: iload #6
		// @BE: iload #5
		// @C0: isub
		// @C1: iconst_1
		// @C2: ishr
		// @C3: invokestatic game.C_100037_wb.func_102350_a(int[], int, int, int, int, int, int, int)void
		// @C6: return
	}
	
	final void func_102379_d()
	{
		// @00: aload_0
		// @01: getfield int[] game.C_100037_wb.field_102388_J
		// @04: aload_0
		// @05: getfield int game.C_100037_wb.field_102339_s
		// @08: aload_0
		// @09: getfield int game.C_100037_wb.field_102337_u
		// @0C: invokestatic game.C_100196_rb.func_105808_a(int[], int, int)void
		// @0F: return
	}
	
	void func_102364_d(int arg0, int arg1, int arg2, int arg3)
	{
		// @000: iload_3
		// @001: ifle @00D
		// @004: iload #4
		// @006: ifgt @00F
		// @009: goto @00D
		// @00C: athrow
		// @00D: return
		// @00E: athrow
		// @00F: aload_0
		// @010: getfield int game.C_100037_wb.field_102339_s
		// @013: istore #5
		// @015: aload_0
		// @016: getfield int game.C_100037_wb.field_102337_u
		// @019: istore #6
		// @01B: iconst_0
		// @01C: istore #7
		// @01E: iconst_0
		// @01F: istore #8
		// @021: aload_0
		// @022: getfield int game.C_100037_wb.field_102341_y
		// @025: istore #9
		// @027: aload_0
		// @028: getfield int game.C_100037_wb.field_102340_z
		// @02B: istore #10
		// @02D: iload #9
		// @02F: bipush 16 (0x10)
		// @031: ishl
		// @032: iload_3
		// @033: idiv
		// @034: istore #11
		// @036: iload #10
		// @038: bipush 16 (0x10)
		// @03A: ishl
		// @03B: iload #4
		// @03D: idiv
		// @03E: istore #12
		// @040: aload_0
		// @041: getfield int game.C_100037_wb.field_102335_w
		// @044: ifle @06F
		// @047: aload_0
		// @048: getfield int game.C_100037_wb.field_102335_w
		// @04B: bipush 16 (0x10)
		// @04D: ishl
		// @04E: iload #11
		// @050: iadd
		// @051: iconst_1
		// @052: isub
		// @053: iload #11
		// @055: idiv
		// @056: istore #13
		// @058: iload_1
		// @059: iload #13
		// @05B: iadd
		// @05C: istore_1
		// @05D: iload #7
		// @05F: iload #13
		// @061: iload #11
		// @063: imul
		// @064: aload_0
		// @065: getfield int game.C_100037_wb.field_102335_w
		// @068: bipush 16 (0x10)
		// @06A: ishl
		// @06B: isub
		// @06C: iadd
		// @06D: istore #7
		// @06F: aload_0
		// @070: getfield int game.C_100037_wb.field_102332_H
		// @073: ifle @09E
		// @076: aload_0
		// @077: getfield int game.C_100037_wb.field_102332_H
		// @07A: bipush 16 (0x10)
		// @07C: ishl
		// @07D: iload #12
		// @07F: iadd
		// @080: iconst_1
		// @081: isub
		// @082: iload #12
		// @084: idiv
		// @085: istore #13
		// @087: iload_2
		// @088: iload #13
		// @08A: iadd
		// @08B: istore_2
		// @08C: iload #8
		// @08E: iload #13
		// @090: iload #12
		// @092: imul
		// @093: aload_0
		// @094: getfield int game.C_100037_wb.field_102332_H
		// @097: bipush 16 (0x10)
		// @099: ishl
		// @09A: isub
		// @09B: iadd
		// @09C: istore #8
		// @09E: iload #5
		// @0A0: iload #9
		// @0A2: if_icmpge @0B6
		// @0A5: iload #5
		// @0A7: bipush 16 (0x10)
		// @0A9: ishl
		// @0AA: iload #7
		// @0AC: isub
		// @0AD: iload #11
		// @0AF: iadd
		// @0B0: iconst_1
		// @0B1: isub
		// @0B2: iload #11
		// @0B4: idiv
		// @0B5: istore_3
		// @0B6: iload #6
		// @0B8: iload #10
		// @0BA: if_icmpge @0CF
		// @0BD: iload #6
		// @0BF: bipush 16 (0x10)
		// @0C1: ishl
		// @0C2: iload #8
		// @0C4: isub
		// @0C5: iload #12
		// @0C7: iadd
		// @0C8: iconst_1
		// @0C9: isub
		// @0CA: iload #12
		// @0CC: idiv
		// @0CD: istore #4
		// @0CF: iload_1
		// @0D0: iload_2
		// @0D1: getstatic int game.C_100196_rb.field_105819_e
		// @0D4: imul
		// @0D5: iadd
		// @0D6: istore #13
		// @0D8: getstatic int game.C_100196_rb.field_105819_e
		// @0DB: iload_3
		// @0DC: isub
		// @0DD: istore #14
		// @0DF: iload_2
		// @0E0: iload #4
		// @0E2: iadd
		// @0E3: getstatic int game.C_100196_rb.field_105823_l
		// @0E6: if_icmple @0F6
		// @0E9: iload #4
		// @0EB: iload_2
		// @0EC: iload #4
		// @0EE: iadd
		// @0EF: getstatic int game.C_100196_rb.field_105823_l
		// @0F2: isub
		// @0F3: isub
		// @0F4: istore #4
		// @0F6: iload_2
		// @0F7: getstatic int game.C_100196_rb.field_105816_f
		// @0FA: if_icmpge @120
		// @0FD: getstatic int game.C_100196_rb.field_105816_f
		// @100: iload_2
		// @101: isub
		// @102: istore #15
		// @104: iload #4
		// @106: iload #15
		// @108: isub
		// @109: istore #4
		// @10B: iload #13
		// @10D: iload #15
		// @10F: getstatic int game.C_100196_rb.field_105819_e
		// @112: imul
		// @113: iadd
		// @114: istore #13
		// @116: iload #8
		// @118: iload #12
		// @11A: iload #15
		// @11C: imul
		// @11D: iadd
		// @11E: istore #8
		// @120: iload_1
		// @121: iload_3
		// @122: iadd
		// @123: getstatic int game.C_100196_rb.field_105820_b
		// @126: if_icmple @13E
		// @129: iload_1
		// @12A: iload_3
		// @12B: iadd
		// @12C: getstatic int game.C_100196_rb.field_105820_b
		// @12F: isub
		// @130: istore #15
		// @132: iload_3
		// @133: iload #15
		// @135: isub
		// @136: istore_3
		// @137: iload #14
		// @139: iload #15
		// @13B: iadd
		// @13C: istore #14
		// @13E: iload_1
		// @13F: getstatic int game.C_100196_rb.field_105827_i
		// @142: if_icmpge @169
		// @145: getstatic int game.C_100196_rb.field_105827_i
		// @148: iload_1
		// @149: isub
		// @14A: istore #15
		// @14C: iload_3
		// @14D: iload #15
		// @14F: isub
		// @150: istore_3
		// @151: iload #13
		// @153: iload #15
		// @155: iadd
		// @156: istore #13
		// @158: iload #7
		// @15A: iload #11
		// @15C: iload #15
		// @15E: imul
		// @15F: iadd
		// @160: istore #7
		// @162: iload #14
		// @164: iload #15
		// @166: iadd
		// @167: istore #14
		// @169: getstatic int[] game.C_100196_rb.field_105818_d
		// @16C: aload_0
		// @16D: getfield int[] game.C_100037_wb.field_102388_J
		// @170: iconst_0
		// @171: iload #7
		// @173: iload #8
		// @175: iload #13
		// @177: iload #14
		// @179: iload_3
		// @17A: iload #4
		// @17C: iload #11
		// @17E: iload #12
		// @180: iload #5
		// @182: invokestatic game.C_100037_wb.func_102382_a(int[], int[], int, int, int, int, int, int, int, int, int, int)void
		// @185: return
	}
	
	private static final void func_102344_b(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9)
	{
		// @00: sipush 256 (0x0100)
		// @03: iload #9
		// @05: isub
		// @06: istore #10
		// @08: iload #6
		// @0A: ineg
		// @0B: istore #11
		// @0D: iload #11
		// @0F: ifge @7C
		// @12: iload #5
		// @14: ineg
		// @15: istore #12
		// @17: iload #12
		// @19: ifge @6A
		// @1C: aload_1
		// @1D: iload_3
		// @1E: iinc #3 +1
		// @21: iaload
		// @22: istore_2
		// @23: iload_2
		// @24: ifeq @61
		// @27: aload_0
		// @28: iload #4
		// @2A: iaload
		// @2B: istore #13
		// @2D: aload_0
		// @2E: iload #4
		// @30: iinc #4 +1
		// @33: iload_2
		// @34: ldc 16711935 (0xff00ff)
		// @36: iand
		// @37: iload #9
		// @39: imul
		// @3A: iload #13
		// @3C: ldc 16711935 (0xff00ff)
		// @3E: iand
		// @3F: iload #10
		// @41: imul
		// @42: iadd
		// @43: ldc -16711936 (0xff00ff00)
		// @45: iand
		// @46: iload_2
		// @47: ldc 65280 (0xff00)
		// @49: iand
		// @4A: iload #9
		// @4C: imul
		// @4D: iload #13
		// @4F: ldc 65280 (0xff00)
		// @51: iand
		// @52: iload #10
		// @54: imul
		// @55: iadd
		// @56: ldc 16711680 (0xff0000)
		// @58: iand
		// @59: iadd
		// @5A: bipush 8 (0x08)
		// @5C: ishr
		// @5D: iastore
		// @5E: goto @64
		// @61: iinc #4 +1
		// @64: iinc #12 +1
		// @67: goto @17
		// @6A: iload #4
		// @6C: iload #7
		// @6E: iadd
		// @6F: istore #4
		// @71: iload_3
		// @72: iload #8
		// @74: iadd
		// @75: istore_3
		// @76: iinc #11 +1
		// @79: goto @0D
		// @7C: return
	}
	
	C_100037_wb(int arg0, int arg1)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100249_pc.<init>()void
		// @04: aload_0
		// @05: iload_1
		// @06: iload_2
		// @07: imul
		// @08: newarray int[]
		// @0A: putfield int[] game.C_100037_wb.field_102388_J
		// @0D: aload_0
		// @0E: aload_0
		// @0F: iload_1
		// @10: dup_x1
		// @11: putfield int game.C_100037_wb.field_102341_y
		// @14: putfield int game.C_100037_wb.field_102339_s
		// @17: aload_0
		// @18: aload_0
		// @19: iload_2
		// @1A: dup_x1
		// @1B: putfield int game.C_100037_wb.field_102340_z
		// @1E: putfield int game.C_100037_wb.field_102337_u
		// @21: aload_0
		// @22: iconst_0
		// @23: putfield int game.C_100037_wb.field_102332_H
		// @26: aload_0
		// @27: iconst_0
		// @28: putfield int game.C_100037_wb.field_102335_w
		// @2B: return
	}
	
	C_100037_wb(byte[] arg0, Component arg1)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100249_pc.<init>()void
		// @04: invokestatic java.awt.Toolkit.getDefaultToolkit()java.awt.Toolkit
		// @07: aload_1
		// @08: invokevirtual java.awt.Toolkit.createImage(byte[])java.awt.Image
		// @0B: astore_3
		// @0C: new java.awt.MediaTracker
		// @0F: dup
		// @10: aload_2
		// @11: invokespecial java.awt.MediaTracker.<init>(java.awt.Component)void
		// @14: astore #4
		// @16: aload #4
		// @18: aload_3
		// @19: iconst_0
		// @1A: invokevirtual java.awt.MediaTracker.addImage(java.awt.Image, int)void
		// @1D: aload #4
		// @1F: invokevirtual java.awt.MediaTracker.waitForAll()void
		// @22: aload_0
		// @23: aload_3
		// @24: aload_2
		// @25: invokevirtual java.awt.Image.getWidth(java.awt.image.ImageObserver)int
		// @28: putfield int game.C_100037_wb.field_102339_s
		// @2B: aload_0
		// @2C: aload_3
		// @2D: aload_2
		// @2E: invokevirtual java.awt.Image.getHeight(java.awt.image.ImageObserver)int
		// @31: putfield int game.C_100037_wb.field_102337_u
		// @34: aload_0
		// @35: aload_0
		// @36: getfield int game.C_100037_wb.field_102339_s
		// @39: putfield int game.C_100037_wb.field_102341_y
		// @3C: aload_0
		// @3D: aload_0
		// @3E: getfield int game.C_100037_wb.field_102337_u
		// @41: putfield int game.C_100037_wb.field_102340_z
		// @44: aload_0
		// @45: iconst_0
		// @46: putfield int game.C_100037_wb.field_102335_w
		// @49: aload_0
		// @4A: iconst_0
		// @4B: putfield int game.C_100037_wb.field_102332_H
		// @4E: aload_0
		// @4F: aload_0
		// @50: getfield int game.C_100037_wb.field_102339_s
		// @53: aload_0
		// @54: getfield int game.C_100037_wb.field_102337_u
		// @57: imul
		// @58: newarray int[]
		// @5A: putfield int[] game.C_100037_wb.field_102388_J
		// @5D: new java.awt.image.PixelGrabber
		// @60: dup
		// @61: aload_3
		// @62: iconst_0
		// @63: iconst_0
		// @64: aload_0
		// @65: getfield int game.C_100037_wb.field_102339_s
		// @68: aload_0
		// @69: getfield int game.C_100037_wb.field_102337_u
		// @6C: aload_0
		// @6D: getfield int[] game.C_100037_wb.field_102388_J
		// @70: iconst_0
		// @71: aload_0
		// @72: getfield int game.C_100037_wb.field_102339_s
		// @75: invokespecial java.awt.image.PixelGrabber.<init>(java.awt.Image, int, int, int, int, int[], int, int)void
		// @78: astore #5
		// @7A: aload #5
		// @7C: invokevirtual java.awt.image.PixelGrabber.grabPixels()boolean
		// @7F: pop
		// @80: goto @84
		// @83: astore_3
		// @84: return
	}
	
	final void func_102363_c(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @000: iload_3
		// @001: ifle @00D
		// @004: iload #4
		// @006: ifgt @00F
		// @009: goto @00D
		// @00C: athrow
		// @00D: return
		// @00E: athrow
		// @00F: aload_0
		// @010: getfield int game.C_100037_wb.field_102339_s
		// @013: istore #6
		// @015: aload_0
		// @016: getfield int game.C_100037_wb.field_102337_u
		// @019: istore #7
		// @01B: iconst_0
		// @01C: istore #8
		// @01E: iconst_0
		// @01F: istore #9
		// @021: aload_0
		// @022: getfield int game.C_100037_wb.field_102341_y
		// @025: istore #10
		// @027: aload_0
		// @028: getfield int game.C_100037_wb.field_102340_z
		// @02B: istore #11
		// @02D: iload #10
		// @02F: bipush 16 (0x10)
		// @031: ishl
		// @032: iload_3
		// @033: idiv
		// @034: istore #12
		// @036: iload #11
		// @038: bipush 16 (0x10)
		// @03A: ishl
		// @03B: iload #4
		// @03D: idiv
		// @03E: istore #13
		// @040: aload_0
		// @041: getfield int game.C_100037_wb.field_102335_w
		// @044: ifle @06F
		// @047: aload_0
		// @048: getfield int game.C_100037_wb.field_102335_w
		// @04B: bipush 16 (0x10)
		// @04D: ishl
		// @04E: iload #12
		// @050: iadd
		// @051: iconst_1
		// @052: isub
		// @053: iload #12
		// @055: idiv
		// @056: istore #14
		// @058: iload_1
		// @059: iload #14
		// @05B: iadd
		// @05C: istore_1
		// @05D: iload #8
		// @05F: iload #14
		// @061: iload #12
		// @063: imul
		// @064: aload_0
		// @065: getfield int game.C_100037_wb.field_102335_w
		// @068: bipush 16 (0x10)
		// @06A: ishl
		// @06B: isub
		// @06C: iadd
		// @06D: istore #8
		// @06F: aload_0
		// @070: getfield int game.C_100037_wb.field_102332_H
		// @073: ifle @09E
		// @076: aload_0
		// @077: getfield int game.C_100037_wb.field_102332_H
		// @07A: bipush 16 (0x10)
		// @07C: ishl
		// @07D: iload #13
		// @07F: iadd
		// @080: iconst_1
		// @081: isub
		// @082: iload #13
		// @084: idiv
		// @085: istore #14
		// @087: iload_2
		// @088: iload #14
		// @08A: iadd
		// @08B: istore_2
		// @08C: iload #9
		// @08E: iload #14
		// @090: iload #13
		// @092: imul
		// @093: aload_0
		// @094: getfield int game.C_100037_wb.field_102332_H
		// @097: bipush 16 (0x10)
		// @099: ishl
		// @09A: isub
		// @09B: iadd
		// @09C: istore #9
		// @09E: iload #6
		// @0A0: iload #10
		// @0A2: if_icmpge @0B6
		// @0A5: iload #6
		// @0A7: bipush 16 (0x10)
		// @0A9: ishl
		// @0AA: iload #8
		// @0AC: isub
		// @0AD: iload #12
		// @0AF: iadd
		// @0B0: iconst_1
		// @0B1: isub
		// @0B2: iload #12
		// @0B4: idiv
		// @0B5: istore_3
		// @0B6: iload #7
		// @0B8: iload #11
		// @0BA: if_icmpge @0CF
		// @0BD: iload #7
		// @0BF: bipush 16 (0x10)
		// @0C1: ishl
		// @0C2: iload #9
		// @0C4: isub
		// @0C5: iload #13
		// @0C7: iadd
		// @0C8: iconst_1
		// @0C9: isub
		// @0CA: iload #13
		// @0CC: idiv
		// @0CD: istore #4
		// @0CF: iload_1
		// @0D0: iload_2
		// @0D1: getstatic int game.C_100196_rb.field_105819_e
		// @0D4: imul
		// @0D5: iadd
		// @0D6: istore #14
		// @0D8: getstatic int game.C_100196_rb.field_105819_e
		// @0DB: iload_3
		// @0DC: isub
		// @0DD: istore #15
		// @0DF: iload_2
		// @0E0: iload #4
		// @0E2: iadd
		// @0E3: getstatic int game.C_100196_rb.field_105823_l
		// @0E6: if_icmple @0F6
		// @0E9: iload #4
		// @0EB: iload_2
		// @0EC: iload #4
		// @0EE: iadd
		// @0EF: getstatic int game.C_100196_rb.field_105823_l
		// @0F2: isub
		// @0F3: isub
		// @0F4: istore #4
		// @0F6: iload_2
		// @0F7: getstatic int game.C_100196_rb.field_105816_f
		// @0FA: if_icmpge @120
		// @0FD: getstatic int game.C_100196_rb.field_105816_f
		// @100: iload_2
		// @101: isub
		// @102: istore #16
		// @104: iload #4
		// @106: iload #16
		// @108: isub
		// @109: istore #4
		// @10B: iload #14
		// @10D: iload #16
		// @10F: getstatic int game.C_100196_rb.field_105819_e
		// @112: imul
		// @113: iadd
		// @114: istore #14
		// @116: iload #9
		// @118: iload #13
		// @11A: iload #16
		// @11C: imul
		// @11D: iadd
		// @11E: istore #9
		// @120: iload_1
		// @121: iload_3
		// @122: iadd
		// @123: getstatic int game.C_100196_rb.field_105820_b
		// @126: if_icmple @13E
		// @129: iload_1
		// @12A: iload_3
		// @12B: iadd
		// @12C: getstatic int game.C_100196_rb.field_105820_b
		// @12F: isub
		// @130: istore #16
		// @132: iload_3
		// @133: iload #16
		// @135: isub
		// @136: istore_3
		// @137: iload #15
		// @139: iload #16
		// @13B: iadd
		// @13C: istore #15
		// @13E: iload_1
		// @13F: getstatic int game.C_100196_rb.field_105827_i
		// @142: if_icmpge @169
		// @145: getstatic int game.C_100196_rb.field_105827_i
		// @148: iload_1
		// @149: isub
		// @14A: istore #16
		// @14C: iload_3
		// @14D: iload #16
		// @14F: isub
		// @150: istore_3
		// @151: iload #14
		// @153: iload #16
		// @155: iadd
		// @156: istore #14
		// @158: iload #8
		// @15A: iload #12
		// @15C: iload #16
		// @15E: imul
		// @15F: iadd
		// @160: istore #8
		// @162: iload #15
		// @164: iload #16
		// @166: iadd
		// @167: istore #15
		// @169: getstatic int[] game.C_100196_rb.field_105818_d
		// @16C: aload_0
		// @16D: getfield int[] game.C_100037_wb.field_102388_J
		// @170: iconst_0
		// @171: iload #8
		// @173: iload #9
		// @175: iload #14
		// @177: iload #15
		// @179: iload_3
		// @17A: iload #4
		// @17C: iload #12
		// @17E: iload #13
		// @180: iload #6
		// @182: iload #5
		// @184: invokestatic game.C_100037_wb.func_102384_a(int[], int[], int, int, int, int, int, int, int, int, int, int, int)void
		// @187: return
	}
	
	private static final void func_102347_a(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7)
	{
		// @00: iload #5
		// @02: ineg
		// @03: istore #8
		// @05: iload #8
		// @07: ifge @75
		// @0A: iload_3
		// @0B: iload #4
		// @0D: iadd
		// @0E: iconst_3
		// @0F: isub
		// @10: istore #9
		// @12: iload_3
		// @13: iload #9
		// @15: if_icmpge @4C
		// @18: aload_0
		// @19: iload_3
		// @1A: iinc #3 +1
		// @1D: aload_1
		// @1E: iload_2
		// @1F: iinc #2 +1
		// @22: iaload
		// @23: iastore
		// @24: aload_0
		// @25: iload_3
		// @26: iinc #3 +1
		// @29: aload_1
		// @2A: iload_2
		// @2B: iinc #2 +1
		// @2E: iaload
		// @2F: iastore
		// @30: aload_0
		// @31: iload_3
		// @32: iinc #3 +1
		// @35: aload_1
		// @36: iload_2
		// @37: iinc #2 +1
		// @3A: iaload
		// @3B: iastore
		// @3C: aload_0
		// @3D: iload_3
		// @3E: iinc #3 +1
		// @41: aload_1
		// @42: iload_2
		// @43: iinc #2 +1
		// @46: iaload
		// @47: iastore
		// @48: goto @12
		// @4B: athrow
		// @4C: iinc #9 +3
		// @4F: iload_3
		// @50: iload #9
		// @52: if_icmpge @65
		// @55: aload_0
		// @56: iload_3
		// @57: iinc #3 +1
		// @5A: aload_1
		// @5B: iload_2
		// @5C: iinc #2 +1
		// @5F: iaload
		// @60: iastore
		// @61: goto @4F
		// @64: athrow
		// @65: iload_3
		// @66: iload #6
		// @68: iadd
		// @69: istore_3
		// @6A: iload_2
		// @6B: iload #7
		// @6D: iadd
		// @6E: istore_2
		// @6F: iinc #8 +1
		// @72: goto @05
		// @75: return
	}
}
