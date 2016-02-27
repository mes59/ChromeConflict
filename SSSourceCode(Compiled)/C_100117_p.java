package game;

final class C_100117_p extends C_100261_md
{
	private int field_101002_s;
	private int field_101005_p;
	private int field_100994_A;
	private int field_100996_n;
	private int field_101007_y;
	private int field_101000_u;
	private int field_101006_z;
	private int field_100995_B;
	private boolean field_100999_v;
	private int field_101004_q;
	private int field_100997_o;
	private int field_100998_w;
	private int field_101008_x;
	private int field_101001_t;
	private int field_101003_r;
	
	final synchronized void func_100984_i(int arg0)
	{
		// @0: aload_0
		// @1: iload_1
		// @2: aload_0
		// @3: invokevirtual game.C_100117_p.func_100969_i()int
		// @6: invokespecial game.C_100117_p.func_100967_c(int, int)void
		// @9: return
	}
	
	private static final int func_100980_b(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, C_100117_p arg10, int arg11, int arg12)
	{
		// @00: iload #11
		// @02: ifeq @1F
		// @05: iload #5
		// @07: iload #9
		// @09: iload #4
		// @0B: isub
		// @0C: iload #11
		// @0E: iadd
		// @0F: sipush 257 (0x0101)
		// @12: isub
		// @13: iload #11
		// @15: idiv
		// @16: iadd
		// @17: dup
		// @18: istore #7
		// @1A: iload #8
		// @1C: if_icmple @23
		// @1F: iload #8
		// @21: istore #7
		// @23: iload #5
		// @25: iload #7
		// @27: if_icmpge @61
		// @2A: iload #4
		// @2C: bipush 8 (0x08)
		// @2E: ishr
		// @2F: istore_1
		// @30: aload_2
		// @31: iload_1
		// @32: baload
		// @33: istore_0
		// @34: aload_3
		// @35: iload #5
		// @37: iinc #5 +1
		// @3A: dup2
		// @3B: iaload
		// @3C: iload_0
		// @3D: bipush 8 (0x08)
		// @3F: ishl
		// @40: aload_2
		// @41: iload_1
		// @42: iconst_1
		// @43: iadd
		// @44: baload
		// @45: iload_0
		// @46: isub
		// @47: iload #4
		// @49: sipush 255 (0x00FF)
		// @4C: iand
		// @4D: imul
		// @4E: iadd
		// @4F: iload #6
		// @51: imul
		// @52: bipush 6 (0x06)
		// @54: ishr
		// @55: iadd
		// @56: iastore
		// @57: iload #4
		// @59: iload #11
		// @5B: iadd
		// @5C: istore #4
		// @5E: goto @23
		// @61: iload #11
		// @63: ifeq @7E
		// @66: iload #5
		// @68: iload #9
		// @6A: iload #4
		// @6C: isub
		// @6D: iload #11
		// @6F: iadd
		// @70: iconst_1
		// @71: isub
		// @72: iload #11
		// @74: idiv
		// @75: iadd
		// @76: dup
		// @77: istore #7
		// @79: iload #8
		// @7B: if_icmple @82
		// @7E: iload #8
		// @80: istore #7
		// @82: iload #12
		// @84: istore_1
		// @85: iload #5
		// @87: iload #7
		// @89: if_icmpge @BD
		// @8C: aload_2
		// @8D: iload #4
		// @8F: bipush 8 (0x08)
		// @91: ishr
		// @92: baload
		// @93: istore_0
		// @94: aload_3
		// @95: iload #5
		// @97: iinc #5 +1
		// @9A: dup2
		// @9B: iaload
		// @9C: iload_0
		// @9D: bipush 8 (0x08)
		// @9F: ishl
		// @A0: iload_1
		// @A1: iload_0
		// @A2: isub
		// @A3: iload #4
		// @A5: sipush 255 (0x00FF)
		// @A8: iand
		// @A9: imul
		// @AA: iadd
		// @AB: iload #6
		// @AD: imul
		// @AE: bipush 6 (0x06)
		// @B0: ishr
		// @B1: iadd
		// @B2: iastore
		// @B3: iload #4
		// @B5: iload #11
		// @B7: iadd
		// @B8: istore #4
		// @BA: goto @85
		// @BD: aload #10
		// @BF: iload #4
		// @C1: putfield int game.C_100117_p.field_101005_p
		// @C4: iload #5
		// @C6: ireturn
	}
	
	private final synchronized void func_100967_c(int arg0, int arg1)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: putfield int game.C_100117_p.field_101001_t
		// @05: aload_0
		// @06: iload_2
		// @07: putfield int game.C_100117_p.field_100996_n
		// @0A: aload_0
		// @0B: iconst_0
		// @0C: putfield int game.C_100117_p.field_100997_o
		// @0F: aload_0
		// @10: invokespecial game.C_100117_p.func_100975_g()void
		// @13: return
	}
	
	final synchronized void func_100910_a(int[] arg0, int arg1, int arg2)
	{
		// @000: aload_0
		// @001: getfield int game.C_100117_p.field_101001_t
		// @004: ifne @014
		// @007: aload_0
		// @008: getfield int game.C_100117_p.field_100997_o
		// @00B: ifne @014
		// @00E: aload_0
		// @00F: iload_3
		// @010: invokevirtual game.C_100117_p.func_100914_e(int)void
		// @013: return
		// @014: aload_0
		// @015: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @018: checkcast game.C_100214_al
		// @01B: astore #4
		// @01D: aload_0
		// @01E: getfield int game.C_100117_p.field_101003_r
		// @021: bipush 8 (0x08)
		// @023: ishl
		// @024: istore #5
		// @026: aload_0
		// @027: getfield int game.C_100117_p.field_101004_q
		// @02A: bipush 8 (0x08)
		// @02C: ishl
		// @02D: istore #6
		// @02F: aload #4
		// @031: getfield byte[] game.C_100214_al.field_100885_l
		// @034: arraylength
		// @035: bipush 8 (0x08)
		// @037: ishl
		// @038: istore #7
		// @03A: iload #6
		// @03C: iload #5
		// @03E: isub
		// @03F: istore #8
		// @041: iload #8
		// @043: ifgt @04B
		// @046: aload_0
		// @047: iconst_0
		// @048: putfield int game.C_100117_p.field_100998_w
		// @04B: iload_2
		// @04C: istore #9
		// @04E: iload_3
		// @04F: iload_2
		// @050: iadd
		// @051: istore_3
		// @052: aload_0
		// @053: getfield int game.C_100117_p.field_101005_p
		// @056: ifge @073
		// @059: aload_0
		// @05A: getfield int game.C_100117_p.field_101002_s
		// @05D: ifle @068
		// @060: aload_0
		// @061: iconst_0
		// @062: putfield int game.C_100117_p.field_101005_p
		// @065: goto @073
		// @068: aload_0
		// @069: invokespecial game.C_100117_p.func_100992_h()void
		// @06C: aload_0
		// @06D: bipush 45 (0x2D)
		// @06F: invokevirtual game.C_100117_p.func_100583_c(int)void
		// @072: return
		// @073: aload_0
		// @074: getfield int game.C_100117_p.field_101005_p
		// @077: iload #7
		// @079: if_icmplt @099
		// @07C: aload_0
		// @07D: getfield int game.C_100117_p.field_101002_s
		// @080: ifge @08E
		// @083: aload_0
		// @084: iload #7
		// @086: iconst_1
		// @087: isub
		// @088: putfield int game.C_100117_p.field_101005_p
		// @08B: goto @099
		// @08E: aload_0
		// @08F: invokespecial game.C_100117_p.func_100992_h()void
		// @092: aload_0
		// @093: bipush 45 (0x2D)
		// @095: invokevirtual game.C_100117_p.func_100583_c(int)void
		// @098: return
		// @099: aload_0
		// @09A: getfield int game.C_100117_p.field_100998_w
		// @09D: ifge @1D3
		// @0A0: aload_0
		// @0A1: getfield boolean game.C_100117_p.field_100999_v
		// @0A4: ifeq @15E
		// @0A7: aload_0
		// @0A8: getfield int game.C_100117_p.field_101002_s
		// @0AB: ifge @0E7
		// @0AE: aload_0
		// @0AF: aload_1
		// @0B0: iload #9
		// @0B2: iload #5
		// @0B4: iload_3
		// @0B5: aload #4
		// @0B7: getfield byte[] game.C_100214_al.field_100885_l
		// @0BA: aload_0
		// @0BB: getfield int game.C_100117_p.field_101003_r
		// @0BE: baload
		// @0BF: invokespecial game.C_100117_p.func_100985_a(int[], int, int, int, int)int
		// @0C2: istore #9
		// @0C4: aload_0
		// @0C5: getfield int game.C_100117_p.field_101005_p
		// @0C8: iload #5
		// @0CA: if_icmplt @0CE
		// @0CD: return
		// @0CE: aload_0
		// @0CF: iload #5
		// @0D1: iload #5
		// @0D3: iadd
		// @0D4: iconst_1
		// @0D5: isub
		// @0D6: aload_0
		// @0D7: getfield int game.C_100117_p.field_101005_p
		// @0DA: isub
		// @0DB: putfield int game.C_100117_p.field_101005_p
		// @0DE: aload_0
		// @0DF: aload_0
		// @0E0: getfield int game.C_100117_p.field_101002_s
		// @0E3: ineg
		// @0E4: putfield int game.C_100117_p.field_101002_s
		// @0E7: aload_0
		// @0E8: aload_1
		// @0E9: iload #9
		// @0EB: iload #6
		// @0ED: iload_3
		// @0EE: aload #4
		// @0F0: getfield byte[] game.C_100214_al.field_100885_l
		// @0F3: aload_0
		// @0F4: getfield int game.C_100117_p.field_101004_q
		// @0F7: iconst_1
		// @0F8: isub
		// @0F9: baload
		// @0FA: invokespecial game.C_100117_p.func_100986_b(int[], int, int, int, int)int
		// @0FD: istore #9
		// @0FF: aload_0
		// @100: getfield int game.C_100117_p.field_101005_p
		// @103: iload #6
		// @105: if_icmpge @109
		// @108: return
		// @109: aload_0
		// @10A: iload #6
		// @10C: iload #6
		// @10E: iadd
		// @10F: iconst_1
		// @110: isub
		// @111: aload_0
		// @112: getfield int game.C_100117_p.field_101005_p
		// @115: isub
		// @116: putfield int game.C_100117_p.field_101005_p
		// @119: aload_0
		// @11A: aload_0
		// @11B: getfield int game.C_100117_p.field_101002_s
		// @11E: ineg
		// @11F: putfield int game.C_100117_p.field_101002_s
		// @122: aload_0
		// @123: aload_1
		// @124: iload #9
		// @126: iload #5
		// @128: iload_3
		// @129: aload #4
		// @12B: getfield byte[] game.C_100214_al.field_100885_l
		// @12E: aload_0
		// @12F: getfield int game.C_100117_p.field_101003_r
		// @132: baload
		// @133: invokespecial game.C_100117_p.func_100985_a(int[], int, int, int, int)int
		// @136: istore #9
		// @138: aload_0
		// @139: getfield int game.C_100117_p.field_101005_p
		// @13C: iload #5
		// @13E: if_icmplt @142
		// @141: return
		// @142: aload_0
		// @143: iload #5
		// @145: iload #5
		// @147: iadd
		// @148: iconst_1
		// @149: isub
		// @14A: aload_0
		// @14B: getfield int game.C_100117_p.field_101005_p
		// @14E: isub
		// @14F: putfield int game.C_100117_p.field_101005_p
		// @152: aload_0
		// @153: aload_0
		// @154: getfield int game.C_100117_p.field_101002_s
		// @157: ineg
		// @158: putfield int game.C_100117_p.field_101002_s
		// @15B: goto @0E7
		// @15E: aload_0
		// @15F: getfield int game.C_100117_p.field_101002_s
		// @162: ifge @19F
		// @165: aload_0
		// @166: aload_1
		// @167: iload #9
		// @169: iload #5
		// @16B: iload_3
		// @16C: aload #4
		// @16E: getfield byte[] game.C_100214_al.field_100885_l
		// @171: aload_0
		// @172: getfield int game.C_100117_p.field_101004_q
		// @175: iconst_1
		// @176: isub
		// @177: baload
		// @178: invokespecial game.C_100117_p.func_100985_a(int[], int, int, int, int)int
		// @17B: istore #9
		// @17D: aload_0
		// @17E: getfield int game.C_100117_p.field_101005_p
		// @181: iload #5
		// @183: if_icmplt @187
		// @186: return
		// @187: aload_0
		// @188: iload #6
		// @18A: iconst_1
		// @18B: isub
		// @18C: iload #6
		// @18E: iconst_1
		// @18F: isub
		// @190: aload_0
		// @191: getfield int game.C_100117_p.field_101005_p
		// @194: isub
		// @195: iload #8
		// @197: irem
		// @198: isub
		// @199: putfield int game.C_100117_p.field_101005_p
		// @19C: goto @165
		// @19F: aload_0
		// @1A0: aload_1
		// @1A1: iload #9
		// @1A3: iload #6
		// @1A5: iload_3
		// @1A6: aload #4
		// @1A8: getfield byte[] game.C_100214_al.field_100885_l
		// @1AB: aload_0
		// @1AC: getfield int game.C_100117_p.field_101003_r
		// @1AF: baload
		// @1B0: invokespecial game.C_100117_p.func_100986_b(int[], int, int, int, int)int
		// @1B3: istore #9
		// @1B5: aload_0
		// @1B6: getfield int game.C_100117_p.field_101005_p
		// @1B9: iload #6
		// @1BB: if_icmpge @1BF
		// @1BE: return
		// @1BF: aload_0
		// @1C0: iload #5
		// @1C2: aload_0
		// @1C3: getfield int game.C_100117_p.field_101005_p
		// @1C6: iload #5
		// @1C8: isub
		// @1C9: iload #8
		// @1CB: irem
		// @1CC: iadd
		// @1CD: putfield int game.C_100117_p.field_101005_p
		// @1D0: goto @19F
		// @1D3: aload_0
		// @1D4: getfield int game.C_100117_p.field_100998_w
		// @1D7: ifle @3A5
		// @1DA: aload_0
		// @1DB: getfield boolean game.C_100117_p.field_100999_v
		// @1DE: ifeq @2C8
		// @1E1: aload_0
		// @1E2: getfield int game.C_100117_p.field_101002_s
		// @1E5: ifge @232
		// @1E8: aload_0
		// @1E9: aload_1
		// @1EA: iload #9
		// @1EC: iload #5
		// @1EE: iload_3
		// @1EF: aload #4
		// @1F1: getfield byte[] game.C_100214_al.field_100885_l
		// @1F4: aload_0
		// @1F5: getfield int game.C_100117_p.field_101003_r
		// @1F8: baload
		// @1F9: invokespecial game.C_100117_p.func_100985_a(int[], int, int, int, int)int
		// @1FC: istore #9
		// @1FE: aload_0
		// @1FF: getfield int game.C_100117_p.field_101005_p
		// @202: iload #5
		// @204: if_icmplt @208
		// @207: return
		// @208: aload_0
		// @209: iload #5
		// @20B: iload #5
		// @20D: iadd
		// @20E: iconst_1
		// @20F: isub
		// @210: aload_0
		// @211: getfield int game.C_100117_p.field_101005_p
		// @214: isub
		// @215: putfield int game.C_100117_p.field_101005_p
		// @218: aload_0
		// @219: aload_0
		// @21A: getfield int game.C_100117_p.field_101002_s
		// @21D: ineg
		// @21E: putfield int game.C_100117_p.field_101002_s
		// @221: aload_0
		// @222: dup
		// @223: getfield int game.C_100117_p.field_100998_w
		// @226: iconst_1
		// @227: isub
		// @228: dup_x1
		// @229: putfield int game.C_100117_p.field_100998_w
		// @22C: ifne @232
		// @22F: goto @3A5
		// @232: aload_0
		// @233: aload_1
		// @234: iload #9
		// @236: iload #6
		// @238: iload_3
		// @239: aload #4
		// @23B: getfield byte[] game.C_100214_al.field_100885_l
		// @23E: aload_0
		// @23F: getfield int game.C_100117_p.field_101004_q
		// @242: iconst_1
		// @243: isub
		// @244: baload
		// @245: invokespecial game.C_100117_p.func_100986_b(int[], int, int, int, int)int
		// @248: istore #9
		// @24A: aload_0
		// @24B: getfield int game.C_100117_p.field_101005_p
		// @24E: iload #6
		// @250: if_icmpge @254
		// @253: return
		// @254: aload_0
		// @255: iload #6
		// @257: iload #6
		// @259: iadd
		// @25A: iconst_1
		// @25B: isub
		// @25C: aload_0
		// @25D: getfield int game.C_100117_p.field_101005_p
		// @260: isub
		// @261: putfield int game.C_100117_p.field_101005_p
		// @264: aload_0
		// @265: aload_0
		// @266: getfield int game.C_100117_p.field_101002_s
		// @269: ineg
		// @26A: putfield int game.C_100117_p.field_101002_s
		// @26D: aload_0
		// @26E: dup
		// @26F: getfield int game.C_100117_p.field_100998_w
		// @272: iconst_1
		// @273: isub
		// @274: dup_x1
		// @275: putfield int game.C_100117_p.field_100998_w
		// @278: ifne @27E
		// @27B: goto @3A5
		// @27E: aload_0
		// @27F: aload_1
		// @280: iload #9
		// @282: iload #5
		// @284: iload_3
		// @285: aload #4
		// @287: getfield byte[] game.C_100214_al.field_100885_l
		// @28A: aload_0
		// @28B: getfield int game.C_100117_p.field_101003_r
		// @28E: baload
		// @28F: invokespecial game.C_100117_p.func_100985_a(int[], int, int, int, int)int
		// @292: istore #9
		// @294: aload_0
		// @295: getfield int game.C_100117_p.field_101005_p
		// @298: iload #5
		// @29A: if_icmplt @29E
		// @29D: return
		// @29E: aload_0
		// @29F: iload #5
		// @2A1: iload #5
		// @2A3: iadd
		// @2A4: iconst_1
		// @2A5: isub
		// @2A6: aload_0
		// @2A7: getfield int game.C_100117_p.field_101005_p
		// @2AA: isub
		// @2AB: putfield int game.C_100117_p.field_101005_p
		// @2AE: aload_0
		// @2AF: aload_0
		// @2B0: getfield int game.C_100117_p.field_101002_s
		// @2B3: ineg
		// @2B4: putfield int game.C_100117_p.field_101002_s
		// @2B7: aload_0
		// @2B8: dup
		// @2B9: getfield int game.C_100117_p.field_100998_w
		// @2BC: iconst_1
		// @2BD: isub
		// @2BE: dup_x1
		// @2BF: putfield int game.C_100117_p.field_100998_w
		// @2C2: ifne @232
		// @2C5: goto @3A5
		// @2C8: aload_0
		// @2C9: getfield int game.C_100117_p.field_101002_s
		// @2CC: ifge @33C
		// @2CF: aload_0
		// @2D0: aload_1
		// @2D1: iload #9
		// @2D3: iload #5
		// @2D5: iload_3
		// @2D6: aload #4
		// @2D8: getfield byte[] game.C_100214_al.field_100885_l
		// @2DB: aload_0
		// @2DC: getfield int game.C_100117_p.field_101004_q
		// @2DF: iconst_1
		// @2E0: isub
		// @2E1: baload
		// @2E2: invokespecial game.C_100117_p.func_100985_a(int[], int, int, int, int)int
		// @2E5: istore #9
		// @2E7: aload_0
		// @2E8: getfield int game.C_100117_p.field_101005_p
		// @2EB: iload #5
		// @2ED: if_icmplt @2F1
		// @2F0: return
		// @2F1: iload #6
		// @2F3: iconst_1
		// @2F4: isub
		// @2F5: aload_0
		// @2F6: getfield int game.C_100117_p.field_101005_p
		// @2F9: isub
		// @2FA: iload #8
		// @2FC: idiv
		// @2FD: istore #10
		// @2FF: iload #10
		// @301: aload_0
		// @302: getfield int game.C_100117_p.field_100998_w
		// @305: if_icmplt @320
		// @308: aload_0
		// @309: dup
		// @30A: getfield int game.C_100117_p.field_101005_p
		// @30D: iload #8
		// @30F: aload_0
		// @310: getfield int game.C_100117_p.field_100998_w
		// @313: imul
		// @314: iadd
		// @315: putfield int game.C_100117_p.field_101005_p
		// @318: aload_0
		// @319: iconst_0
		// @31A: putfield int game.C_100117_p.field_100998_w
		// @31D: goto @3A5
		// @320: aload_0
		// @321: dup
		// @322: getfield int game.C_100117_p.field_101005_p
		// @325: iload #8
		// @327: iload #10
		// @329: imul
		// @32A: iadd
		// @32B: putfield int game.C_100117_p.field_101005_p
		// @32E: aload_0
		// @32F: dup
		// @330: getfield int game.C_100117_p.field_100998_w
		// @333: iload #10
		// @335: isub
		// @336: putfield int game.C_100117_p.field_100998_w
		// @339: goto @2CF
		// @33C: aload_0
		// @33D: aload_1
		// @33E: iload #9
		// @340: iload #6
		// @342: iload_3
		// @343: aload #4
		// @345: getfield byte[] game.C_100214_al.field_100885_l
		// @348: aload_0
		// @349: getfield int game.C_100117_p.field_101003_r
		// @34C: baload
		// @34D: invokespecial game.C_100117_p.func_100986_b(int[], int, int, int, int)int
		// @350: istore #9
		// @352: aload_0
		// @353: getfield int game.C_100117_p.field_101005_p
		// @356: iload #6
		// @358: if_icmpge @35C
		// @35B: return
		// @35C: aload_0
		// @35D: getfield int game.C_100117_p.field_101005_p
		// @360: iload #5
		// @362: isub
		// @363: iload #8
		// @365: idiv
		// @366: istore #10
		// @368: iload #10
		// @36A: aload_0
		// @36B: getfield int game.C_100117_p.field_100998_w
		// @36E: if_icmplt @389
		// @371: aload_0
		// @372: dup
		// @373: getfield int game.C_100117_p.field_101005_p
		// @376: iload #8
		// @378: aload_0
		// @379: getfield int game.C_100117_p.field_100998_w
		// @37C: imul
		// @37D: isub
		// @37E: putfield int game.C_100117_p.field_101005_p
		// @381: aload_0
		// @382: iconst_0
		// @383: putfield int game.C_100117_p.field_100998_w
		// @386: goto @3A5
		// @389: aload_0
		// @38A: dup
		// @38B: getfield int game.C_100117_p.field_101005_p
		// @38E: iload #8
		// @390: iload #10
		// @392: imul
		// @393: isub
		// @394: putfield int game.C_100117_p.field_101005_p
		// @397: aload_0
		// @398: dup
		// @399: getfield int game.C_100117_p.field_100998_w
		// @39C: iload #10
		// @39E: isub
		// @39F: putfield int game.C_100117_p.field_100998_w
		// @3A2: goto @33C
		// @3A5: aload_0
		// @3A6: getfield int game.C_100117_p.field_101002_s
		// @3A9: ifge @3D0
		// @3AC: aload_0
		// @3AD: aload_1
		// @3AE: iload #9
		// @3B0: iconst_0
		// @3B1: iload_3
		// @3B2: iconst_0
		// @3B3: invokespecial game.C_100117_p.func_100985_a(int[], int, int, int, int)int
		// @3B6: pop
		// @3B7: aload_0
		// @3B8: getfield int game.C_100117_p.field_101005_p
		// @3BB: ifge @3F5
		// @3BE: aload_0
		// @3BF: iconst_m1
		// @3C0: putfield int game.C_100117_p.field_101005_p
		// @3C3: aload_0
		// @3C4: invokespecial game.C_100117_p.func_100992_h()void
		// @3C7: aload_0
		// @3C8: bipush 45 (0x2D)
		// @3CA: invokevirtual game.C_100117_p.func_100583_c(int)void
		// @3CD: goto @3F5
		// @3D0: aload_0
		// @3D1: aload_1
		// @3D2: iload #9
		// @3D4: iload #7
		// @3D6: iload_3
		// @3D7: iconst_0
		// @3D8: invokespecial game.C_100117_p.func_100986_b(int[], int, int, int, int)int
		// @3DB: pop
		// @3DC: aload_0
		// @3DD: getfield int game.C_100117_p.field_101005_p
		// @3E0: iload #7
		// @3E2: if_icmplt @3F5
		// @3E5: aload_0
		// @3E6: iload #7
		// @3E8: putfield int game.C_100117_p.field_101005_p
		// @3EB: aload_0
		// @3EC: invokespecial game.C_100117_p.func_100992_h()void
		// @3EF: aload_0
		// @3F0: bipush 45 (0x2D)
		// @3F2: invokevirtual game.C_100117_p.func_100583_c(int)void
		// @3F5: return
	}
	
	private final void func_100992_h()
	{
		// @00: aload_0
		// @01: getfield int game.C_100117_p.field_100997_o
		// @04: ifeq @1E
		// @07: aload_0
		// @08: getfield int game.C_100117_p.field_101001_t
		// @0B: ldc -2147483648 (0x80000000)
		// @0D: if_icmpne @15
		// @10: aload_0
		// @11: iconst_0
		// @12: putfield int game.C_100117_p.field_101001_t
		// @15: aload_0
		// @16: iconst_0
		// @17: putfield int game.C_100117_p.field_100997_o
		// @1A: aload_0
		// @1B: invokespecial game.C_100117_p.func_100975_g()void
		// @1E: return
	}
	
	private final int func_100985_a(int[] arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @000: aload_0
		// @001: getfield int game.C_100117_p.field_100997_o
		// @004: ifle @113
		// @007: iload_2
		// @008: aload_0
		// @009: getfield int game.C_100117_p.field_100997_o
		// @00C: iadd
		// @00D: istore #6
		// @00F: iload #6
		// @011: iload #4
		// @013: if_icmple @01A
		// @016: iload #4
		// @018: istore #6
		// @01A: aload_0
		// @01B: dup
		// @01C: getfield int game.C_100117_p.field_100997_o
		// @01F: iload_2
		// @020: iadd
		// @021: putfield int game.C_100117_p.field_100997_o
		// @024: aload_0
		// @025: getfield int game.C_100117_p.field_101002_s
		// @028: sipush -256 (0xFF00)
		// @02B: if_icmpne @090
		// @02E: aload_0
		// @02F: getfield int game.C_100117_p.field_101005_p
		// @032: sipush 255 (0x00FF)
		// @035: iand
		// @036: ifne @090
		// @039: getstatic boolean game.C_100177_cj.field_105646_g
		// @03C: ifeq @06C
		// @03F: iconst_0
		// @040: aload_0
		// @041: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @044: checkcast game.C_100214_al
		// @047: getfield byte[] game.C_100214_al.field_100885_l
		// @04A: aload_1
		// @04B: aload_0
		// @04C: getfield int game.C_100117_p.field_101005_p
		// @04F: iload_2
		// @050: aload_0
		// @051: getfield int game.C_100117_p.field_101006_z
		// @054: aload_0
		// @055: getfield int game.C_100117_p.field_101008_x
		// @058: aload_0
		// @059: getfield int game.C_100117_p.field_101007_y
		// @05C: aload_0
		// @05D: getfield int game.C_100117_p.field_101000_u
		// @060: iconst_0
		// @061: iload #6
		// @063: iload_3
		// @064: aload_0
		// @065: invokestatic game.C_100117_p.func_100957_a(int, byte[], int[], int, int, int, int, int, int, int, int, int, game.C_100117_p)int
		// @068: istore_2
		// @069: goto @0F3
		// @06C: aload_0
		// @06D: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @070: checkcast game.C_100214_al
		// @073: getfield byte[] game.C_100214_al.field_100885_l
		// @076: aload_1
		// @077: aload_0
		// @078: getfield int game.C_100117_p.field_101005_p
		// @07B: iload_2
		// @07C: aload_0
		// @07D: getfield int game.C_100117_p.field_100994_A
		// @080: aload_0
		// @081: getfield int game.C_100117_p.field_100995_B
		// @084: iconst_0
		// @085: iload #6
		// @087: iload_3
		// @088: aload_0
		// @089: invokestatic game.C_100117_p.func_100976_b(byte[], int[], int, int, int, int, int, int, int, game.C_100117_p)int
		// @08C: istore_2
		// @08D: goto @0F3
		// @090: getstatic boolean game.C_100177_cj.field_105646_g
		// @093: ifeq @0CA
		// @096: iconst_0
		// @097: iconst_0
		// @098: aload_0
		// @099: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @09C: checkcast game.C_100214_al
		// @09F: getfield byte[] game.C_100214_al.field_100885_l
		// @0A2: aload_1
		// @0A3: aload_0
		// @0A4: getfield int game.C_100117_p.field_101005_p
		// @0A7: iload_2
		// @0A8: aload_0
		// @0A9: getfield int game.C_100117_p.field_101006_z
		// @0AC: aload_0
		// @0AD: getfield int game.C_100117_p.field_101008_x
		// @0B0: aload_0
		// @0B1: getfield int game.C_100117_p.field_101007_y
		// @0B4: aload_0
		// @0B5: getfield int game.C_100117_p.field_101000_u
		// @0B8: iconst_0
		// @0B9: iload #6
		// @0BB: iload_3
		// @0BC: aload_0
		// @0BD: aload_0
		// @0BE: getfield int game.C_100117_p.field_101002_s
		// @0C1: iload #5
		// @0C3: invokestatic game.C_100117_p.func_100958_b(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, game.C_100117_p, int, int)int
		// @0C6: istore_2
		// @0C7: goto @0F3
		// @0CA: iconst_0
		// @0CB: iconst_0
		// @0CC: aload_0
		// @0CD: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @0D0: checkcast game.C_100214_al
		// @0D3: getfield byte[] game.C_100214_al.field_100885_l
		// @0D6: aload_1
		// @0D7: aload_0
		// @0D8: getfield int game.C_100117_p.field_101005_p
		// @0DB: iload_2
		// @0DC: aload_0
		// @0DD: getfield int game.C_100117_p.field_100994_A
		// @0E0: aload_0
		// @0E1: getfield int game.C_100117_p.field_100995_B
		// @0E4: iconst_0
		// @0E5: iload #6
		// @0E7: iload_3
		// @0E8: aload_0
		// @0E9: aload_0
		// @0EA: getfield int game.C_100117_p.field_101002_s
		// @0ED: iload #5
		// @0EF: invokestatic game.C_100117_p.func_100954_a(int, int, byte[], int[], int, int, int, int, int, int, int, game.C_100117_p, int, int)int
		// @0F2: istore_2
		// @0F3: aload_0
		// @0F4: dup
		// @0F5: getfield int game.C_100117_p.field_100997_o
		// @0F8: iload_2
		// @0F9: isub
		// @0FA: putfield int game.C_100117_p.field_100997_o
		// @0FD: aload_0
		// @0FE: getfield int game.C_100117_p.field_100997_o
		// @101: ifeq @106
		// @104: iload_2
		// @105: ireturn
		// @106: aload_0
		// @107: invokespecial game.C_100117_p.func_100991_l()boolean
		// @10A: ifeq @110
		// @10D: iload #4
		// @10F: ireturn
		// @110: goto @000
		// @113: aload_0
		// @114: getfield int game.C_100117_p.field_101002_s
		// @117: sipush -256 (0xFF00)
		// @11A: if_icmpne @16D
		// @11D: aload_0
		// @11E: getfield int game.C_100117_p.field_101005_p
		// @121: sipush 255 (0x00FF)
		// @124: iand
		// @125: ifne @16D
		// @128: getstatic boolean game.C_100177_cj.field_105646_g
		// @12B: ifeq @150
		// @12E: iconst_0
		// @12F: aload_0
		// @130: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @133: checkcast game.C_100214_al
		// @136: getfield byte[] game.C_100214_al.field_100885_l
		// @139: aload_1
		// @13A: aload_0
		// @13B: getfield int game.C_100117_p.field_101005_p
		// @13E: iload_2
		// @13F: aload_0
		// @140: getfield int game.C_100117_p.field_101006_z
		// @143: aload_0
		// @144: getfield int game.C_100117_p.field_101008_x
		// @147: iconst_0
		// @148: iload #4
		// @14A: iload_3
		// @14B: aload_0
		// @14C: invokestatic game.C_100117_p.func_100970_a(int, byte[], int[], int, int, int, int, int, int, int, game.C_100117_p)int
		// @14F: ireturn
		// @150: aload_0
		// @151: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @154: checkcast game.C_100214_al
		// @157: getfield byte[] game.C_100214_al.field_100885_l
		// @15A: aload_1
		// @15B: aload_0
		// @15C: getfield int game.C_100117_p.field_101005_p
		// @15F: iload_2
		// @160: aload_0
		// @161: getfield int game.C_100117_p.field_100994_A
		// @164: iconst_0
		// @165: iload #4
		// @167: iload_3
		// @168: aload_0
		// @169: invokestatic game.C_100117_p.func_100961_a(byte[], int[], int, int, int, int, int, int, game.C_100117_p)int
		// @16C: ireturn
		// @16D: getstatic boolean game.C_100177_cj.field_105646_g
		// @170: ifeq @19C
		// @173: iconst_0
		// @174: iconst_0
		// @175: aload_0
		// @176: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @179: checkcast game.C_100214_al
		// @17C: getfield byte[] game.C_100214_al.field_100885_l
		// @17F: aload_1
		// @180: aload_0
		// @181: getfield int game.C_100117_p.field_101005_p
		// @184: iload_2
		// @185: aload_0
		// @186: getfield int game.C_100117_p.field_101006_z
		// @189: aload_0
		// @18A: getfield int game.C_100117_p.field_101008_x
		// @18D: iconst_0
		// @18E: iload #4
		// @190: iload_3
		// @191: aload_0
		// @192: aload_0
		// @193: getfield int game.C_100117_p.field_101002_s
		// @196: iload #5
		// @198: invokestatic game.C_100117_p.func_100981_d(int, int, byte[], int[], int, int, int, int, int, int, int, game.C_100117_p, int, int)int
		// @19B: ireturn
		// @19C: iconst_0
		// @19D: iconst_0
		// @19E: aload_0
		// @19F: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @1A2: checkcast game.C_100214_al
		// @1A5: getfield byte[] game.C_100214_al.field_100885_l
		// @1A8: aload_1
		// @1A9: aload_0
		// @1AA: getfield int game.C_100117_p.field_101005_p
		// @1AD: iload_2
		// @1AE: aload_0
		// @1AF: getfield int game.C_100117_p.field_100994_A
		// @1B2: iconst_0
		// @1B3: iload #4
		// @1B5: iload_3
		// @1B6: aload_0
		// @1B7: aload_0
		// @1B8: getfield int game.C_100117_p.field_101002_s
		// @1BB: iload #5
		// @1BD: invokestatic game.C_100117_p.func_100956_a(int, int, byte[], int[], int, int, int, int, int, int, game.C_100117_p, int, int)int
		// @1C0: ireturn
	}
	
	final synchronized void func_100974_a(int arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: ifne @0B
		// @04: aload_0
		// @05: iload_2
		// @06: iload_3
		// @07: invokespecial game.C_100117_p.func_100967_c(int, int)void
		// @0A: return
		// @0B: iload_2
		// @0C: iload_3
		// @0D: invokestatic game.C_100117_p.func_100968_b(int, int)int
		// @10: istore #4
		// @12: iload_2
		// @13: iload_3
		// @14: invokestatic game.C_100117_p.func_100982_d(int, int)int
		// @17: istore #5
		// @19: aload_0
		// @1A: getfield int game.C_100117_p.field_101006_z
		// @1D: iload #4
		// @1F: if_icmpne @31
		// @22: aload_0
		// @23: getfield int game.C_100117_p.field_101008_x
		// @26: iload #5
		// @28: if_icmpne @31
		// @2B: aload_0
		// @2C: iconst_0
		// @2D: putfield int game.C_100117_p.field_100997_o
		// @30: return
		// @31: iload_2
		// @32: aload_0
		// @33: getfield int game.C_100117_p.field_100994_A
		// @36: isub
		// @37: istore #6
		// @39: aload_0
		// @3A: getfield int game.C_100117_p.field_100994_A
		// @3D: iload_2
		// @3E: isub
		// @3F: iload #6
		// @41: if_icmple @4C
		// @44: aload_0
		// @45: getfield int game.C_100117_p.field_100994_A
		// @48: iload_2
		// @49: isub
		// @4A: istore #6
		// @4C: iload #4
		// @4E: aload_0
		// @4F: getfield int game.C_100117_p.field_101006_z
		// @52: isub
		// @53: iload #6
		// @55: if_icmple @61
		// @58: iload #4
		// @5A: aload_0
		// @5B: getfield int game.C_100117_p.field_101006_z
		// @5E: isub
		// @5F: istore #6
		// @61: aload_0
		// @62: getfield int game.C_100117_p.field_101006_z
		// @65: iload #4
		// @67: isub
		// @68: iload #6
		// @6A: if_icmple @76
		// @6D: aload_0
		// @6E: getfield int game.C_100117_p.field_101006_z
		// @71: iload #4
		// @73: isub
		// @74: istore #6
		// @76: iload #5
		// @78: aload_0
		// @79: getfield int game.C_100117_p.field_101008_x
		// @7C: isub
		// @7D: iload #6
		// @7F: if_icmple @8B
		// @82: iload #5
		// @84: aload_0
		// @85: getfield int game.C_100117_p.field_101008_x
		// @88: isub
		// @89: istore #6
		// @8B: aload_0
		// @8C: getfield int game.C_100117_p.field_101008_x
		// @8F: iload #5
		// @91: isub
		// @92: iload #6
		// @94: if_icmple @A0
		// @97: aload_0
		// @98: getfield int game.C_100117_p.field_101008_x
		// @9B: iload #5
		// @9D: isub
		// @9E: istore #6
		// @A0: iload_1
		// @A1: iload #6
		// @A3: if_icmple @A9
		// @A6: iload #6
		// @A8: istore_1
		// @A9: aload_0
		// @AA: iload_1
		// @AB: putfield int game.C_100117_p.field_100997_o
		// @AE: aload_0
		// @AF: iload_2
		// @B0: putfield int game.C_100117_p.field_101001_t
		// @B3: aload_0
		// @B4: iload_3
		// @B5: putfield int game.C_100117_p.field_100996_n
		// @B8: aload_0
		// @B9: iload_2
		// @BA: aload_0
		// @BB: getfield int game.C_100117_p.field_100994_A
		// @BE: isub
		// @BF: iload_1
		// @C0: idiv
		// @C1: putfield int game.C_100117_p.field_100995_B
		// @C4: aload_0
		// @C5: iload #4
		// @C7: aload_0
		// @C8: getfield int game.C_100117_p.field_101006_z
		// @CB: isub
		// @CC: iload_1
		// @CD: idiv
		// @CE: putfield int game.C_100117_p.field_101007_y
		// @D1: aload_0
		// @D2: iload #5
		// @D4: aload_0
		// @D5: getfield int game.C_100117_p.field_101008_x
		// @D8: isub
		// @D9: iload_1
		// @DA: idiv
		// @DB: putfield int game.C_100117_p.field_101000_u
		// @DE: return
	}
	
	private static final int func_100961_a(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, C_100117_p arg8)
	{
		// @00: iload_2
		// @01: bipush 8 (0x08)
		// @03: ishr
		// @04: istore_2
		// @05: iload #7
		// @07: bipush 8 (0x08)
		// @09: ishr
		// @0A: istore #7
		// @0C: iload #4
		// @0E: iconst_2
		// @0F: ishl
		// @10: istore #4
		// @12: iload_3
		// @13: iload_2
		// @14: iadd
		// @15: iload #7
		// @17: iconst_1
		// @18: isub
		// @19: isub
		// @1A: dup
		// @1B: istore #5
		// @1D: iload #6
		// @1F: if_icmple @26
		// @22: iload #6
		// @24: istore #5
		// @26: iinc #5 +253
		// @29: iload_3
		// @2A: iload #5
		// @2C: if_icmpge @7A
		// @2F: aload_1
		// @30: iload_3
		// @31: iinc #3 +1
		// @34: dup2
		// @35: iaload
		// @36: aload_0
		// @37: iload_2
		// @38: iinc #2 +255
		// @3B: baload
		// @3C: iload #4
		// @3E: imul
		// @3F: iadd
		// @40: iastore
		// @41: aload_1
		// @42: iload_3
		// @43: iinc #3 +1
		// @46: dup2
		// @47: iaload
		// @48: aload_0
		// @49: iload_2
		// @4A: iinc #2 +255
		// @4D: baload
		// @4E: iload #4
		// @50: imul
		// @51: iadd
		// @52: iastore
		// @53: aload_1
		// @54: iload_3
		// @55: iinc #3 +1
		// @58: dup2
		// @59: iaload
		// @5A: aload_0
		// @5B: iload_2
		// @5C: iinc #2 +255
		// @5F: baload
		// @60: iload #4
		// @62: imul
		// @63: iadd
		// @64: iastore
		// @65: aload_1
		// @66: iload_3
		// @67: iinc #3 +1
		// @6A: dup2
		// @6B: iaload
		// @6C: aload_0
		// @6D: iload_2
		// @6E: iinc #2 +255
		// @71: baload
		// @72: iload #4
		// @74: imul
		// @75: iadd
		// @76: iastore
		// @77: goto @29
		// @7A: iinc #5 +3
		// @7D: iload_3
		// @7E: iload #5
		// @80: if_icmpge @98
		// @83: aload_1
		// @84: iload_3
		// @85: iinc #3 +1
		// @88: dup2
		// @89: iaload
		// @8A: aload_0
		// @8B: iload_2
		// @8C: iinc #2 +255
		// @8F: baload
		// @90: iload #4
		// @92: imul
		// @93: iadd
		// @94: iastore
		// @95: goto @7D
		// @98: aload #8
		// @9A: iload_2
		// @9B: bipush 8 (0x08)
		// @9D: ishl
		// @9E: putfield int game.C_100117_p.field_101005_p
		// @A1: iload_3
		// @A2: ireturn
	}
	
	static final C_100117_p func_100978_a(C_100214_al arg0, int arg1, int arg2, int arg3)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100214_al.field_100885_l
		// @04: ifnull @0F
		// @07: aload_0
		// @08: getfield byte[] game.C_100214_al.field_100885_l
		// @0B: arraylength
		// @0C: ifne @11
		// @0F: aconst_null
		// @10: areturn
		// @11: new game.C_100117_p
		// @14: dup
		// @15: aload_0
		// @16: iload_1
		// @17: iload_2
		// @18: iload_3
		// @19: invokespecial game.C_100117_p.<init>(game.C_100214_al, int, int, int)void
		// @1C: areturn
	}
	
	final int func_100913_a()
	{
		// @00: aload_0
		// @01: getfield int game.C_100117_p.field_101001_t
		// @04: ifne @10
		// @07: aload_0
		// @08: getfield int game.C_100117_p.field_100997_o
		// @0B: ifne @10
		// @0E: iconst_0
		// @0F: ireturn
		// @10: iconst_1
		// @11: ireturn
	}
	
	final synchronized boolean func_100979_e()
	{
		// @0: aload_0
		// @1: getfield int game.C_100117_p.field_100997_o
		// @4: ifeq @B
		// @7: iconst_1
		// @8: goto @C
		// @B: iconst_0
		// @C: ireturn
	}
	
	private static final int func_100962_b(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, C_100117_p arg10)
	{
		// @000: iload_3
		// @001: bipush 8 (0x08)
		// @003: ishr
		// @004: istore_3
		// @005: iload #9
		// @007: bipush 8 (0x08)
		// @009: ishr
		// @00A: istore #9
		// @00C: iload #5
		// @00E: iconst_2
		// @00F: ishl
		// @010: istore #5
		// @012: iload #6
		// @014: iconst_2
		// @015: ishl
		// @016: istore #6
		// @018: iload #4
		// @01A: iload #9
		// @01C: iadd
		// @01D: iload_3
		// @01E: isub
		// @01F: dup
		// @020: istore #7
		// @022: iload #8
		// @024: if_icmple @02B
		// @027: iload #8
		// @029: istore #7
		// @02B: iload #4
		// @02D: iconst_1
		// @02E: ishl
		// @02F: istore #4
		// @031: iload #7
		// @033: iconst_1
		// @034: ishl
		// @035: istore #7
		// @037: iinc #7 +250
		// @03A: iload #4
		// @03C: iload #7
		// @03E: if_icmpge @0D0
		// @041: aload_1
		// @042: iload_3
		// @043: iinc #3 +1
		// @046: baload
		// @047: istore_0
		// @048: aload_2
		// @049: iload #4
		// @04B: iinc #4 +1
		// @04E: dup2
		// @04F: iaload
		// @050: iload_0
		// @051: iload #5
		// @053: imul
		// @054: iadd
		// @055: iastore
		// @056: aload_2
		// @057: iload #4
		// @059: iinc #4 +1
		// @05C: dup2
		// @05D: iaload
		// @05E: iload_0
		// @05F: iload #6
		// @061: imul
		// @062: iadd
		// @063: iastore
		// @064: aload_1
		// @065: iload_3
		// @066: iinc #3 +1
		// @069: baload
		// @06A: istore_0
		// @06B: aload_2
		// @06C: iload #4
		// @06E: iinc #4 +1
		// @071: dup2
		// @072: iaload
		// @073: iload_0
		// @074: iload #5
		// @076: imul
		// @077: iadd
		// @078: iastore
		// @079: aload_2
		// @07A: iload #4
		// @07C: iinc #4 +1
		// @07F: dup2
		// @080: iaload
		// @081: iload_0
		// @082: iload #6
		// @084: imul
		// @085: iadd
		// @086: iastore
		// @087: aload_1
		// @088: iload_3
		// @089: iinc #3 +1
		// @08C: baload
		// @08D: istore_0
		// @08E: aload_2
		// @08F: iload #4
		// @091: iinc #4 +1
		// @094: dup2
		// @095: iaload
		// @096: iload_0
		// @097: iload #5
		// @099: imul
		// @09A: iadd
		// @09B: iastore
		// @09C: aload_2
		// @09D: iload #4
		// @09F: iinc #4 +1
		// @0A2: dup2
		// @0A3: iaload
		// @0A4: iload_0
		// @0A5: iload #6
		// @0A7: imul
		// @0A8: iadd
		// @0A9: iastore
		// @0AA: aload_1
		// @0AB: iload_3
		// @0AC: iinc #3 +1
		// @0AF: baload
		// @0B0: istore_0
		// @0B1: aload_2
		// @0B2: iload #4
		// @0B4: iinc #4 +1
		// @0B7: dup2
		// @0B8: iaload
		// @0B9: iload_0
		// @0BA: iload #5
		// @0BC: imul
		// @0BD: iadd
		// @0BE: iastore
		// @0BF: aload_2
		// @0C0: iload #4
		// @0C2: iinc #4 +1
		// @0C5: dup2
		// @0C6: iaload
		// @0C7: iload_0
		// @0C8: iload #6
		// @0CA: imul
		// @0CB: iadd
		// @0CC: iastore
		// @0CD: goto @03A
		// @0D0: iinc #7 +6
		// @0D3: iload #4
		// @0D5: iload #7
		// @0D7: if_icmpge @100
		// @0DA: aload_1
		// @0DB: iload_3
		// @0DC: iinc #3 +1
		// @0DF: baload
		// @0E0: istore_0
		// @0E1: aload_2
		// @0E2: iload #4
		// @0E4: iinc #4 +1
		// @0E7: dup2
		// @0E8: iaload
		// @0E9: iload_0
		// @0EA: iload #5
		// @0EC: imul
		// @0ED: iadd
		// @0EE: iastore
		// @0EF: aload_2
		// @0F0: iload #4
		// @0F2: iinc #4 +1
		// @0F5: dup2
		// @0F6: iaload
		// @0F7: iload_0
		// @0F8: iload #6
		// @0FA: imul
		// @0FB: iadd
		// @0FC: iastore
		// @0FD: goto @0D3
		// @100: aload #10
		// @102: iload_3
		// @103: bipush 8 (0x08)
		// @105: ishl
		// @106: putfield int game.C_100117_p.field_101005_p
		// @109: iload #4
		// @10B: iconst_1
		// @10C: ishr
		// @10D: ireturn
	}
	
	final synchronized void func_100965_a(int arg0, int arg1)
	{
		// @0: aload_0
		// @1: iload_1
		// @2: iload_2
		// @3: aload_0
		// @4: invokevirtual game.C_100117_p.func_100969_i()int
		// @7: invokevirtual game.C_100117_p.func_100974_a(int, int, int)void
		// @A: return
	}
	
	private static final int func_100957_a(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, C_100117_p arg12)
	{
		// @000: iload_3
		// @001: bipush 8 (0x08)
		// @003: ishr
		// @004: istore_3
		// @005: iload #11
		// @007: bipush 8 (0x08)
		// @009: ishr
		// @00A: istore #11
		// @00C: iload #5
		// @00E: iconst_2
		// @00F: ishl
		// @010: istore #5
		// @012: iload #6
		// @014: iconst_2
		// @015: ishl
		// @016: istore #6
		// @018: iload #7
		// @01A: iconst_2
		// @01B: ishl
		// @01C: istore #7
		// @01E: iload #8
		// @020: iconst_2
		// @021: ishl
		// @022: istore #8
		// @024: iload #4
		// @026: iload_3
		// @027: iadd
		// @028: iload #11
		// @02A: iconst_1
		// @02B: isub
		// @02C: isub
		// @02D: dup
		// @02E: istore #9
		// @030: iload #10
		// @032: if_icmple @039
		// @035: iload #10
		// @037: istore #9
		// @039: aload #12
		// @03B: dup
		// @03C: getfield int game.C_100117_p.field_100994_A
		// @03F: aload #12
		// @041: getfield int game.C_100117_p.field_100995_B
		// @044: iload #9
		// @046: iload #4
		// @048: isub
		// @049: imul
		// @04A: iadd
		// @04B: putfield int game.C_100117_p.field_100994_A
		// @04E: iload #4
		// @050: iconst_1
		// @051: ishl
		// @052: istore #4
		// @054: iload #9
		// @056: iconst_1
		// @057: ishl
		// @058: istore #9
		// @05A: iinc #9 +250
		// @05D: iload #4
		// @05F: iload #9
		// @061: if_icmpge @12B
		// @064: aload_1
		// @065: iload_3
		// @066: iinc #3 +255
		// @069: baload
		// @06A: istore_0
		// @06B: aload_2
		// @06C: iload #4
		// @06E: iinc #4 +1
		// @071: dup2
		// @072: iaload
		// @073: iload_0
		// @074: iload #5
		// @076: imul
		// @077: iadd
		// @078: iastore
		// @079: iload #5
		// @07B: iload #7
		// @07D: iadd
		// @07E: istore #5
		// @080: aload_2
		// @081: iload #4
		// @083: iinc #4 +1
		// @086: dup2
		// @087: iaload
		// @088: iload_0
		// @089: iload #6
		// @08B: imul
		// @08C: iadd
		// @08D: iastore
		// @08E: iload #6
		// @090: iload #8
		// @092: iadd
		// @093: istore #6
		// @095: aload_1
		// @096: iload_3
		// @097: iinc #3 +255
		// @09A: baload
		// @09B: istore_0
		// @09C: aload_2
		// @09D: iload #4
		// @09F: iinc #4 +1
		// @0A2: dup2
		// @0A3: iaload
		// @0A4: iload_0
		// @0A5: iload #5
		// @0A7: imul
		// @0A8: iadd
		// @0A9: iastore
		// @0AA: iload #5
		// @0AC: iload #7
		// @0AE: iadd
		// @0AF: istore #5
		// @0B1: aload_2
		// @0B2: iload #4
		// @0B4: iinc #4 +1
		// @0B7: dup2
		// @0B8: iaload
		// @0B9: iload_0
		// @0BA: iload #6
		// @0BC: imul
		// @0BD: iadd
		// @0BE: iastore
		// @0BF: iload #6
		// @0C1: iload #8
		// @0C3: iadd
		// @0C4: istore #6
		// @0C6: aload_1
		// @0C7: iload_3
		// @0C8: iinc #3 +255
		// @0CB: baload
		// @0CC: istore_0
		// @0CD: aload_2
		// @0CE: iload #4
		// @0D0: iinc #4 +1
		// @0D3: dup2
		// @0D4: iaload
		// @0D5: iload_0
		// @0D6: iload #5
		// @0D8: imul
		// @0D9: iadd
		// @0DA: iastore
		// @0DB: iload #5
		// @0DD: iload #7
		// @0DF: iadd
		// @0E0: istore #5
		// @0E2: aload_2
		// @0E3: iload #4
		// @0E5: iinc #4 +1
		// @0E8: dup2
		// @0E9: iaload
		// @0EA: iload_0
		// @0EB: iload #6
		// @0ED: imul
		// @0EE: iadd
		// @0EF: iastore
		// @0F0: iload #6
		// @0F2: iload #8
		// @0F4: iadd
		// @0F5: istore #6
		// @0F7: aload_1
		// @0F8: iload_3
		// @0F9: iinc #3 +255
		// @0FC: baload
		// @0FD: istore_0
		// @0FE: aload_2
		// @0FF: iload #4
		// @101: iinc #4 +1
		// @104: dup2
		// @105: iaload
		// @106: iload_0
		// @107: iload #5
		// @109: imul
		// @10A: iadd
		// @10B: iastore
		// @10C: iload #5
		// @10E: iload #7
		// @110: iadd
		// @111: istore #5
		// @113: aload_2
		// @114: iload #4
		// @116: iinc #4 +1
		// @119: dup2
		// @11A: iaload
		// @11B: iload_0
		// @11C: iload #6
		// @11E: imul
		// @11F: iadd
		// @120: iastore
		// @121: iload #6
		// @123: iload #8
		// @125: iadd
		// @126: istore #6
		// @128: goto @05D
		// @12B: iinc #9 +6
		// @12E: iload #4
		// @130: iload #9
		// @132: if_icmpge @169
		// @135: aload_1
		// @136: iload_3
		// @137: iinc #3 +255
		// @13A: baload
		// @13B: istore_0
		// @13C: aload_2
		// @13D: iload #4
		// @13F: iinc #4 +1
		// @142: dup2
		// @143: iaload
		// @144: iload_0
		// @145: iload #5
		// @147: imul
		// @148: iadd
		// @149: iastore
		// @14A: iload #5
		// @14C: iload #7
		// @14E: iadd
		// @14F: istore #5
		// @151: aload_2
		// @152: iload #4
		// @154: iinc #4 +1
		// @157: dup2
		// @158: iaload
		// @159: iload_0
		// @15A: iload #6
		// @15C: imul
		// @15D: iadd
		// @15E: iastore
		// @15F: iload #6
		// @161: iload #8
		// @163: iadd
		// @164: istore #6
		// @166: goto @12E
		// @169: aload #12
		// @16B: iload #5
		// @16D: iconst_2
		// @16E: ishr
		// @16F: putfield int game.C_100117_p.field_101006_z
		// @172: aload #12
		// @174: iload #6
		// @176: iconst_2
		// @177: ishr
		// @178: putfield int game.C_100117_p.field_101008_x
		// @17B: aload #12
		// @17D: iload_3
		// @17E: bipush 8 (0x08)
		// @180: ishl
		// @181: putfield int game.C_100117_p.field_101005_p
		// @184: iload #4
		// @186: iconst_1
		// @187: ishr
		// @188: ireturn
	}
	
	final synchronized void func_100966_j(int arg0)
	{
		// @0: aload_0
		// @1: iload_1
		// @2: putfield int game.C_100117_p.field_100998_w
		// @5: return
	}
	
	private static final int func_100958_b(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, C_100117_p arg13, int arg14, int arg15)
	{
		// @000: aload #13
		// @002: dup
		// @003: getfield int game.C_100117_p.field_100994_A
		// @006: aload #13
		// @008: getfield int game.C_100117_p.field_100995_B
		// @00B: iload #5
		// @00D: imul
		// @00E: isub
		// @00F: putfield int game.C_100117_p.field_100994_A
		// @012: iload #14
		// @014: ifeq @031
		// @017: iload #5
		// @019: iload #12
		// @01B: sipush 256 (0x0100)
		// @01E: iadd
		// @01F: iload #4
		// @021: isub
		// @022: iload #14
		// @024: iadd
		// @025: iload #14
		// @027: idiv
		// @028: iadd
		// @029: dup
		// @02A: istore #10
		// @02C: iload #11
		// @02E: if_icmple @035
		// @031: iload #11
		// @033: istore #10
		// @035: iload #5
		// @037: iconst_1
		// @038: ishl
		// @039: istore #5
		// @03B: iload #10
		// @03D: iconst_1
		// @03E: ishl
		// @03F: istore #10
		// @041: iload #5
		// @043: iload #10
		// @045: if_icmpge @0A0
		// @048: iload #4
		// @04A: bipush 8 (0x08)
		// @04C: ishr
		// @04D: istore_1
		// @04E: aload_2
		// @04F: iload_1
		// @050: iconst_1
		// @051: isub
		// @052: baload
		// @053: istore_0
		// @054: iload_0
		// @055: bipush 8 (0x08)
		// @057: ishl
		// @058: aload_2
		// @059: iload_1
		// @05A: baload
		// @05B: iload_0
		// @05C: isub
		// @05D: iload #4
		// @05F: sipush 255 (0x00FF)
		// @062: iand
		// @063: imul
		// @064: iadd
		// @065: istore_0
		// @066: aload_3
		// @067: iload #5
		// @069: iinc #5 +1
		// @06C: dup2
		// @06D: iaload
		// @06E: iload_0
		// @06F: iload #6
		// @071: imul
		// @072: bipush 6 (0x06)
		// @074: ishr
		// @075: iadd
		// @076: iastore
		// @077: iload #6
		// @079: iload #8
		// @07B: iadd
		// @07C: istore #6
		// @07E: aload_3
		// @07F: iload #5
		// @081: iinc #5 +1
		// @084: dup2
		// @085: iaload
		// @086: iload_0
		// @087: iload #7
		// @089: imul
		// @08A: bipush 6 (0x06)
		// @08C: ishr
		// @08D: iadd
		// @08E: iastore
		// @08F: iload #7
		// @091: iload #9
		// @093: iadd
		// @094: istore #7
		// @096: iload #4
		// @098: iload #14
		// @09A: iadd
		// @09B: istore #4
		// @09D: goto @041
		// @0A0: iload #14
		// @0A2: ifeq @0BD
		// @0A5: iload #5
		// @0A7: iconst_1
		// @0A8: ishr
		// @0A9: iload #12
		// @0AB: iload #4
		// @0AD: isub
		// @0AE: iload #14
		// @0B0: iadd
		// @0B1: iload #14
		// @0B3: idiv
		// @0B4: iadd
		// @0B5: dup
		// @0B6: istore #10
		// @0B8: iload #11
		// @0BA: if_icmple @0C1
		// @0BD: iload #11
		// @0BF: istore #10
		// @0C1: iload #10
		// @0C3: iconst_1
		// @0C4: ishl
		// @0C5: istore #10
		// @0C7: iload #15
		// @0C9: istore_1
		// @0CA: iload #5
		// @0CC: iload #10
		// @0CE: if_icmpge @121
		// @0D1: iload_1
		// @0D2: bipush 8 (0x08)
		// @0D4: ishl
		// @0D5: aload_2
		// @0D6: iload #4
		// @0D8: bipush 8 (0x08)
		// @0DA: ishr
		// @0DB: baload
		// @0DC: iload_1
		// @0DD: isub
		// @0DE: iload #4
		// @0E0: sipush 255 (0x00FF)
		// @0E3: iand
		// @0E4: imul
		// @0E5: iadd
		// @0E6: istore_0
		// @0E7: aload_3
		// @0E8: iload #5
		// @0EA: iinc #5 +1
		// @0ED: dup2
		// @0EE: iaload
		// @0EF: iload_0
		// @0F0: iload #6
		// @0F2: imul
		// @0F3: bipush 6 (0x06)
		// @0F5: ishr
		// @0F6: iadd
		// @0F7: iastore
		// @0F8: iload #6
		// @0FA: iload #8
		// @0FC: iadd
		// @0FD: istore #6
		// @0FF: aload_3
		// @100: iload #5
		// @102: iinc #5 +1
		// @105: dup2
		// @106: iaload
		// @107: iload_0
		// @108: iload #7
		// @10A: imul
		// @10B: bipush 6 (0x06)
		// @10D: ishr
		// @10E: iadd
		// @10F: iastore
		// @110: iload #7
		// @112: iload #9
		// @114: iadd
		// @115: istore #7
		// @117: iload #4
		// @119: iload #14
		// @11B: iadd
		// @11C: istore #4
		// @11E: goto @0CA
		// @121: iload #5
		// @123: iconst_1
		// @124: ishr
		// @125: istore #5
		// @127: aload #13
		// @129: dup
		// @12A: getfield int game.C_100117_p.field_100994_A
		// @12D: aload #13
		// @12F: getfield int game.C_100117_p.field_100995_B
		// @132: iload #5
		// @134: imul
		// @135: iadd
		// @136: putfield int game.C_100117_p.field_100994_A
		// @139: aload #13
		// @13B: iload #6
		// @13D: putfield int game.C_100117_p.field_101006_z
		// @140: aload #13
		// @142: iload #7
		// @144: putfield int game.C_100117_p.field_101008_x
		// @147: aload #13
		// @149: iload #4
		// @14B: putfield int game.C_100117_p.field_101005_p
		// @14E: iload #5
		// @150: ireturn
	}
	
	private static final int func_100976_b(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, C_100117_p arg9)
	{
		// @00: iload_2
		// @01: bipush 8 (0x08)
		// @03: ishr
		// @04: istore_2
		// @05: iload #8
		// @07: bipush 8 (0x08)
		// @09: ishr
		// @0A: istore #8
		// @0C: iload #4
		// @0E: iconst_2
		// @0F: ishl
		// @10: istore #4
		// @12: iload #5
		// @14: iconst_2
		// @15: ishl
		// @16: istore #5
		// @18: iload_3
		// @19: iload_2
		// @1A: iadd
		// @1B: iload #8
		// @1D: iconst_1
		// @1E: isub
		// @1F: isub
		// @20: dup
		// @21: istore #6
		// @23: iload #7
		// @25: if_icmple @2C
		// @28: iload #7
		// @2A: istore #6
		// @2C: aload #9
		// @2E: dup
		// @2F: getfield int game.C_100117_p.field_101006_z
		// @32: aload #9
		// @34: getfield int game.C_100117_p.field_101007_y
		// @37: iload #6
		// @39: iload_3
		// @3A: isub
		// @3B: imul
		// @3C: iadd
		// @3D: putfield int game.C_100117_p.field_101006_z
		// @40: aload #9
		// @42: dup
		// @43: getfield int game.C_100117_p.field_101008_x
		// @46: aload #9
		// @48: getfield int game.C_100117_p.field_101000_u
		// @4B: iload #6
		// @4D: iload_3
		// @4E: isub
		// @4F: imul
		// @50: iadd
		// @51: putfield int game.C_100117_p.field_101008_x
		// @54: iinc #6 +253
		// @57: iload_3
		// @58: iload #6
		// @5A: if_icmpge @C4
		// @5D: aload_1
		// @5E: iload_3
		// @5F: iinc #3 +1
		// @62: dup2
		// @63: iaload
		// @64: aload_0
		// @65: iload_2
		// @66: iinc #2 +255
		// @69: baload
		// @6A: iload #4
		// @6C: imul
		// @6D: iadd
		// @6E: iastore
		// @6F: iload #4
		// @71: iload #5
		// @73: iadd
		// @74: istore #4
		// @76: aload_1
		// @77: iload_3
		// @78: iinc #3 +1
		// @7B: dup2
		// @7C: iaload
		// @7D: aload_0
		// @7E: iload_2
		// @7F: iinc #2 +255
		// @82: baload
		// @83: iload #4
		// @85: imul
		// @86: iadd
		// @87: iastore
		// @88: iload #4
		// @8A: iload #5
		// @8C: iadd
		// @8D: istore #4
		// @8F: aload_1
		// @90: iload_3
		// @91: iinc #3 +1
		// @94: dup2
		// @95: iaload
		// @96: aload_0
		// @97: iload_2
		// @98: iinc #2 +255
		// @9B: baload
		// @9C: iload #4
		// @9E: imul
		// @9F: iadd
		// @A0: iastore
		// @A1: iload #4
		// @A3: iload #5
		// @A5: iadd
		// @A6: istore #4
		// @A8: aload_1
		// @A9: iload_3
		// @AA: iinc #3 +1
		// @AD: dup2
		// @AE: iaload
		// @AF: aload_0
		// @B0: iload_2
		// @B1: iinc #2 +255
		// @B4: baload
		// @B5: iload #4
		// @B7: imul
		// @B8: iadd
		// @B9: iastore
		// @BA: iload #4
		// @BC: iload #5
		// @BE: iadd
		// @BF: istore #4
		// @C1: goto @57
		// @C4: iinc #6 +3
		// @C7: iload_3
		// @C8: iload #6
		// @CA: if_icmpge @E9
		// @CD: aload_1
		// @CE: iload_3
		// @CF: iinc #3 +1
		// @D2: dup2
		// @D3: iaload
		// @D4: aload_0
		// @D5: iload_2
		// @D6: iinc #2 +255
		// @D9: baload
		// @DA: iload #4
		// @DC: imul
		// @DD: iadd
		// @DE: iastore
		// @DF: iload #4
		// @E1: iload #5
		// @E3: iadd
		// @E4: istore #4
		// @E6: goto @C7
		// @E9: aload #9
		// @EB: iload #4
		// @ED: iconst_2
		// @EE: ishr
		// @EF: putfield int game.C_100117_p.field_100994_A
		// @F2: aload #9
		// @F4: iload_2
		// @F5: bipush 8 (0x08)
		// @F7: ishl
		// @F8: putfield int game.C_100117_p.field_101005_p
		// @FB: iload_3
		// @FC: ireturn
	}
	
	final synchronized void func_100963_a(boolean arg0)
	{
		// @00: aload_0
		// @01: aload_0
		// @02: getfield int game.C_100117_p.field_101002_s
		// @05: aload_0
		// @06: getfield int game.C_100117_p.field_101002_s
		// @09: bipush 31 (0x1F)
		// @0B: ishr
		// @0C: ixor
		// @0D: aload_0
		// @0E: getfield int game.C_100117_p.field_101002_s
		// @11: bipush 31 (0x1F)
		// @13: iushr
		// @14: iadd
		// @15: putfield int game.C_100117_p.field_101002_s
		// @18: iload_1
		// @19: ifeq @25
		// @1C: aload_0
		// @1D: aload_0
		// @1E: getfield int game.C_100117_p.field_101002_s
		// @21: ineg
		// @22: putfield int game.C_100117_p.field_101002_s
		// @25: return
	}
	
	private static final int func_100993_b(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, C_100117_p arg12)
	{
		// @000: iload_3
		// @001: bipush 8 (0x08)
		// @003: ishr
		// @004: istore_3
		// @005: iload #11
		// @007: bipush 8 (0x08)
		// @009: ishr
		// @00A: istore #11
		// @00C: iload #5
		// @00E: iconst_2
		// @00F: ishl
		// @010: istore #5
		// @012: iload #6
		// @014: iconst_2
		// @015: ishl
		// @016: istore #6
		// @018: iload #7
		// @01A: iconst_2
		// @01B: ishl
		// @01C: istore #7
		// @01E: iload #8
		// @020: iconst_2
		// @021: ishl
		// @022: istore #8
		// @024: iload #4
		// @026: iload #11
		// @028: iadd
		// @029: iload_3
		// @02A: isub
		// @02B: dup
		// @02C: istore #9
		// @02E: iload #10
		// @030: if_icmple @037
		// @033: iload #10
		// @035: istore #9
		// @037: aload #12
		// @039: dup
		// @03A: getfield int game.C_100117_p.field_100994_A
		// @03D: aload #12
		// @03F: getfield int game.C_100117_p.field_100995_B
		// @042: iload #9
		// @044: iload #4
		// @046: isub
		// @047: imul
		// @048: iadd
		// @049: putfield int game.C_100117_p.field_100994_A
		// @04C: iload #4
		// @04E: iconst_1
		// @04F: ishl
		// @050: istore #4
		// @052: iload #9
		// @054: iconst_1
		// @055: ishl
		// @056: istore #9
		// @058: iinc #9 +250
		// @05B: iload #4
		// @05D: iload #9
		// @05F: if_icmpge @129
		// @062: aload_1
		// @063: iload_3
		// @064: iinc #3 +1
		// @067: baload
		// @068: istore_0
		// @069: aload_2
		// @06A: iload #4
		// @06C: iinc #4 +1
		// @06F: dup2
		// @070: iaload
		// @071: iload_0
		// @072: iload #5
		// @074: imul
		// @075: iadd
		// @076: iastore
		// @077: iload #5
		// @079: iload #7
		// @07B: iadd
		// @07C: istore #5
		// @07E: aload_2
		// @07F: iload #4
		// @081: iinc #4 +1
		// @084: dup2
		// @085: iaload
		// @086: iload_0
		// @087: iload #6
		// @089: imul
		// @08A: iadd
		// @08B: iastore
		// @08C: iload #6
		// @08E: iload #8
		// @090: iadd
		// @091: istore #6
		// @093: aload_1
		// @094: iload_3
		// @095: iinc #3 +1
		// @098: baload
		// @099: istore_0
		// @09A: aload_2
		// @09B: iload #4
		// @09D: iinc #4 +1
		// @0A0: dup2
		// @0A1: iaload
		// @0A2: iload_0
		// @0A3: iload #5
		// @0A5: imul
		// @0A6: iadd
		// @0A7: iastore
		// @0A8: iload #5
		// @0AA: iload #7
		// @0AC: iadd
		// @0AD: istore #5
		// @0AF: aload_2
		// @0B0: iload #4
		// @0B2: iinc #4 +1
		// @0B5: dup2
		// @0B6: iaload
		// @0B7: iload_0
		// @0B8: iload #6
		// @0BA: imul
		// @0BB: iadd
		// @0BC: iastore
		// @0BD: iload #6
		// @0BF: iload #8
		// @0C1: iadd
		// @0C2: istore #6
		// @0C4: aload_1
		// @0C5: iload_3
		// @0C6: iinc #3 +1
		// @0C9: baload
		// @0CA: istore_0
		// @0CB: aload_2
		// @0CC: iload #4
		// @0CE: iinc #4 +1
		// @0D1: dup2
		// @0D2: iaload
		// @0D3: iload_0
		// @0D4: iload #5
		// @0D6: imul
		// @0D7: iadd
		// @0D8: iastore
		// @0D9: iload #5
		// @0DB: iload #7
		// @0DD: iadd
		// @0DE: istore #5
		// @0E0: aload_2
		// @0E1: iload #4
		// @0E3: iinc #4 +1
		// @0E6: dup2
		// @0E7: iaload
		// @0E8: iload_0
		// @0E9: iload #6
		// @0EB: imul
		// @0EC: iadd
		// @0ED: iastore
		// @0EE: iload #6
		// @0F0: iload #8
		// @0F2: iadd
		// @0F3: istore #6
		// @0F5: aload_1
		// @0F6: iload_3
		// @0F7: iinc #3 +1
		// @0FA: baload
		// @0FB: istore_0
		// @0FC: aload_2
		// @0FD: iload #4
		// @0FF: iinc #4 +1
		// @102: dup2
		// @103: iaload
		// @104: iload_0
		// @105: iload #5
		// @107: imul
		// @108: iadd
		// @109: iastore
		// @10A: iload #5
		// @10C: iload #7
		// @10E: iadd
		// @10F: istore #5
		// @111: aload_2
		// @112: iload #4
		// @114: iinc #4 +1
		// @117: dup2
		// @118: iaload
		// @119: iload_0
		// @11A: iload #6
		// @11C: imul
		// @11D: iadd
		// @11E: iastore
		// @11F: iload #6
		// @121: iload #8
		// @123: iadd
		// @124: istore #6
		// @126: goto @05B
		// @129: iinc #9 +6
		// @12C: iload #4
		// @12E: iload #9
		// @130: if_icmpge @167
		// @133: aload_1
		// @134: iload_3
		// @135: iinc #3 +1
		// @138: baload
		// @139: istore_0
		// @13A: aload_2
		// @13B: iload #4
		// @13D: iinc #4 +1
		// @140: dup2
		// @141: iaload
		// @142: iload_0
		// @143: iload #5
		// @145: imul
		// @146: iadd
		// @147: iastore
		// @148: iload #5
		// @14A: iload #7
		// @14C: iadd
		// @14D: istore #5
		// @14F: aload_2
		// @150: iload #4
		// @152: iinc #4 +1
		// @155: dup2
		// @156: iaload
		// @157: iload_0
		// @158: iload #6
		// @15A: imul
		// @15B: iadd
		// @15C: iastore
		// @15D: iload #6
		// @15F: iload #8
		// @161: iadd
		// @162: istore #6
		// @164: goto @12C
		// @167: aload #12
		// @169: iload #5
		// @16B: iconst_2
		// @16C: ishr
		// @16D: putfield int game.C_100117_p.field_101006_z
		// @170: aload #12
		// @172: iload #6
		// @174: iconst_2
		// @175: ishr
		// @176: putfield int game.C_100117_p.field_101008_x
		// @179: aload #12
		// @17B: iload_3
		// @17C: bipush 8 (0x08)
		// @17E: ishl
		// @17F: putfield int game.C_100117_p.field_101005_p
		// @182: iload #4
		// @184: iconst_1
		// @185: ishr
		// @186: ireturn
	}
	
	static final C_100117_p func_100959_a(C_100214_al arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100214_al.field_100885_l
		// @04: ifnull @0F
		// @07: aload_0
		// @08: getfield byte[] game.C_100214_al.field_100885_l
		// @0B: arraylength
		// @0C: ifne @11
		// @0F: aconst_null
		// @10: areturn
		// @11: new game.C_100117_p
		// @14: dup
		// @15: aload_0
		// @16: aload_0
		// @17: getfield int game.C_100214_al.field_100884_o
		// @1A: i2l
		// @1B: ldc2_w 256
		// @1E: lmul
		// @1F: iload_1
		// @20: i2l
		// @21: lmul
		// @22: bipush 100 (0x64)
		// @24: getstatic int game.C_100177_cj.field_105660_u
		// @27: imul
		// @28: i2l
		// @29: ldiv
		// @2A: l2i
		// @2B: iload_2
		// @2C: bipush 6 (0x06)
		// @2E: ishl
		// @2F: invokespecial game.C_100117_p.<init>(game.C_100214_al, int, int)void
		// @32: areturn
	}
	
	final C_100261_md func_100916_d()
	{
		// @0: aconst_null
		// @1: areturn
	}
	
	final C_100261_md func_100912_c()
	{
		// @0: aconst_null
		// @1: areturn
	}
	
	private final int func_100986_b(int[] arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @000: aload_0
		// @001: getfield int game.C_100117_p.field_100997_o
		// @004: ifle @113
		// @007: iload_2
		// @008: aload_0
		// @009: getfield int game.C_100117_p.field_100997_o
		// @00C: iadd
		// @00D: istore #6
		// @00F: iload #6
		// @011: iload #4
		// @013: if_icmple @01A
		// @016: iload #4
		// @018: istore #6
		// @01A: aload_0
		// @01B: dup
		// @01C: getfield int game.C_100117_p.field_100997_o
		// @01F: iload_2
		// @020: iadd
		// @021: putfield int game.C_100117_p.field_100997_o
		// @024: aload_0
		// @025: getfield int game.C_100117_p.field_101002_s
		// @028: sipush 256 (0x0100)
		// @02B: if_icmpne @090
		// @02E: aload_0
		// @02F: getfield int game.C_100117_p.field_101005_p
		// @032: sipush 255 (0x00FF)
		// @035: iand
		// @036: ifne @090
		// @039: getstatic boolean game.C_100177_cj.field_105646_g
		// @03C: ifeq @06C
		// @03F: iconst_0
		// @040: aload_0
		// @041: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @044: checkcast game.C_100214_al
		// @047: getfield byte[] game.C_100214_al.field_100885_l
		// @04A: aload_1
		// @04B: aload_0
		// @04C: getfield int game.C_100117_p.field_101005_p
		// @04F: iload_2
		// @050: aload_0
		// @051: getfield int game.C_100117_p.field_101006_z
		// @054: aload_0
		// @055: getfield int game.C_100117_p.field_101008_x
		// @058: aload_0
		// @059: getfield int game.C_100117_p.field_101007_y
		// @05C: aload_0
		// @05D: getfield int game.C_100117_p.field_101000_u
		// @060: iconst_0
		// @061: iload #6
		// @063: iload_3
		// @064: aload_0
		// @065: invokestatic game.C_100117_p.func_100993_b(int, byte[], int[], int, int, int, int, int, int, int, int, int, game.C_100117_p)int
		// @068: istore_2
		// @069: goto @0F3
		// @06C: aload_0
		// @06D: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @070: checkcast game.C_100214_al
		// @073: getfield byte[] game.C_100214_al.field_100885_l
		// @076: aload_1
		// @077: aload_0
		// @078: getfield int game.C_100117_p.field_101005_p
		// @07B: iload_2
		// @07C: aload_0
		// @07D: getfield int game.C_100117_p.field_100994_A
		// @080: aload_0
		// @081: getfield int game.C_100117_p.field_100995_B
		// @084: iconst_0
		// @085: iload #6
		// @087: iload_3
		// @088: aload_0
		// @089: invokestatic game.C_100117_p.func_100960_a(byte[], int[], int, int, int, int, int, int, int, game.C_100117_p)int
		// @08C: istore_2
		// @08D: goto @0F3
		// @090: getstatic boolean game.C_100177_cj.field_105646_g
		// @093: ifeq @0CA
		// @096: iconst_0
		// @097: iconst_0
		// @098: aload_0
		// @099: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @09C: checkcast game.C_100214_al
		// @09F: getfield byte[] game.C_100214_al.field_100885_l
		// @0A2: aload_1
		// @0A3: aload_0
		// @0A4: getfield int game.C_100117_p.field_101005_p
		// @0A7: iload_2
		// @0A8: aload_0
		// @0A9: getfield int game.C_100117_p.field_101006_z
		// @0AC: aload_0
		// @0AD: getfield int game.C_100117_p.field_101008_x
		// @0B0: aload_0
		// @0B1: getfield int game.C_100117_p.field_101007_y
		// @0B4: aload_0
		// @0B5: getfield int game.C_100117_p.field_101000_u
		// @0B8: iconst_0
		// @0B9: iload #6
		// @0BB: iload_3
		// @0BC: aload_0
		// @0BD: aload_0
		// @0BE: getfield int game.C_100117_p.field_101002_s
		// @0C1: iload #5
		// @0C3: invokestatic game.C_100117_p.func_100990_a(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, game.C_100117_p, int, int)int
		// @0C6: istore_2
		// @0C7: goto @0F3
		// @0CA: iconst_0
		// @0CB: iconst_0
		// @0CC: aload_0
		// @0CD: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @0D0: checkcast game.C_100214_al
		// @0D3: getfield byte[] game.C_100214_al.field_100885_l
		// @0D6: aload_1
		// @0D7: aload_0
		// @0D8: getfield int game.C_100117_p.field_101005_p
		// @0DB: iload_2
		// @0DC: aload_0
		// @0DD: getfield int game.C_100117_p.field_100994_A
		// @0E0: aload_0
		// @0E1: getfield int game.C_100117_p.field_100995_B
		// @0E4: iconst_0
		// @0E5: iload #6
		// @0E7: iload_3
		// @0E8: aload_0
		// @0E9: aload_0
		// @0EA: getfield int game.C_100117_p.field_101002_s
		// @0ED: iload #5
		// @0EF: invokestatic game.C_100117_p.func_100971_b(int, int, byte[], int[], int, int, int, int, int, int, int, game.C_100117_p, int, int)int
		// @0F2: istore_2
		// @0F3: aload_0
		// @0F4: dup
		// @0F5: getfield int game.C_100117_p.field_100997_o
		// @0F8: iload_2
		// @0F9: isub
		// @0FA: putfield int game.C_100117_p.field_100997_o
		// @0FD: aload_0
		// @0FE: getfield int game.C_100117_p.field_100997_o
		// @101: ifeq @106
		// @104: iload_2
		// @105: ireturn
		// @106: aload_0
		// @107: invokespecial game.C_100117_p.func_100991_l()boolean
		// @10A: ifeq @110
		// @10D: iload #4
		// @10F: ireturn
		// @110: goto @000
		// @113: aload_0
		// @114: getfield int game.C_100117_p.field_101002_s
		// @117: sipush 256 (0x0100)
		// @11A: if_icmpne @16D
		// @11D: aload_0
		// @11E: getfield int game.C_100117_p.field_101005_p
		// @121: sipush 255 (0x00FF)
		// @124: iand
		// @125: ifne @16D
		// @128: getstatic boolean game.C_100177_cj.field_105646_g
		// @12B: ifeq @150
		// @12E: iconst_0
		// @12F: aload_0
		// @130: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @133: checkcast game.C_100214_al
		// @136: getfield byte[] game.C_100214_al.field_100885_l
		// @139: aload_1
		// @13A: aload_0
		// @13B: getfield int game.C_100117_p.field_101005_p
		// @13E: iload_2
		// @13F: aload_0
		// @140: getfield int game.C_100117_p.field_101006_z
		// @143: aload_0
		// @144: getfield int game.C_100117_p.field_101008_x
		// @147: iconst_0
		// @148: iload #4
		// @14A: iload_3
		// @14B: aload_0
		// @14C: invokestatic game.C_100117_p.func_100962_b(int, byte[], int[], int, int, int, int, int, int, int, game.C_100117_p)int
		// @14F: ireturn
		// @150: aload_0
		// @151: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @154: checkcast game.C_100214_al
		// @157: getfield byte[] game.C_100214_al.field_100885_l
		// @15A: aload_1
		// @15B: aload_0
		// @15C: getfield int game.C_100117_p.field_101005_p
		// @15F: iload_2
		// @160: aload_0
		// @161: getfield int game.C_100117_p.field_100994_A
		// @164: iconst_0
		// @165: iload #4
		// @167: iload_3
		// @168: aload_0
		// @169: invokestatic game.C_100117_p.func_100973_b(byte[], int[], int, int, int, int, int, int, game.C_100117_p)int
		// @16C: ireturn
		// @16D: getstatic boolean game.C_100177_cj.field_105646_g
		// @170: ifeq @19C
		// @173: iconst_0
		// @174: iconst_0
		// @175: aload_0
		// @176: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @179: checkcast game.C_100214_al
		// @17C: getfield byte[] game.C_100214_al.field_100885_l
		// @17F: aload_1
		// @180: aload_0
		// @181: getfield int game.C_100117_p.field_101005_p
		// @184: iload_2
		// @185: aload_0
		// @186: getfield int game.C_100117_p.field_101006_z
		// @189: aload_0
		// @18A: getfield int game.C_100117_p.field_101008_x
		// @18D: iconst_0
		// @18E: iload #4
		// @190: iload_3
		// @191: aload_0
		// @192: aload_0
		// @193: getfield int game.C_100117_p.field_101002_s
		// @196: iload #5
		// @198: invokestatic game.C_100117_p.func_100964_c(int, int, byte[], int[], int, int, int, int, int, int, int, game.C_100117_p, int, int)int
		// @19B: ireturn
		// @19C: iconst_0
		// @19D: iconst_0
		// @19E: aload_0
		// @19F: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @1A2: checkcast game.C_100214_al
		// @1A5: getfield byte[] game.C_100214_al.field_100885_l
		// @1A8: aload_1
		// @1A9: aload_0
		// @1AA: getfield int game.C_100117_p.field_101005_p
		// @1AD: iload_2
		// @1AE: aload_0
		// @1AF: getfield int game.C_100117_p.field_100994_A
		// @1B2: iconst_0
		// @1B3: iload #4
		// @1B5: iload_3
		// @1B6: aload_0
		// @1B7: aload_0
		// @1B8: getfield int game.C_100117_p.field_101002_s
		// @1BB: iload #5
		// @1BD: invokestatic game.C_100117_p.func_100980_b(int, int, byte[], int[], int, int, int, int, int, int, game.C_100117_p, int, int)int
		// @1C0: ireturn
	}
	
	final synchronized void func_100987_f(int arg0)
	{
		// @00: aload_0
		// @01: getfield int game.C_100117_p.field_101002_s
		// @04: ifge @10
		// @07: aload_0
		// @08: iload_1
		// @09: ineg
		// @0A: putfield int game.C_100117_p.field_101002_s
		// @0D: goto @15
		// @10: aload_0
		// @11: iload_1
		// @12: putfield int game.C_100117_p.field_101002_s
		// @15: return
	}
	
	final synchronized void func_100914_e(int arg0)
	{
		// @000: aload_0
		// @001: getfield int game.C_100117_p.field_100997_o
		// @004: ifle @07A
		// @007: iload_1
		// @008: aload_0
		// @009: getfield int game.C_100117_p.field_100997_o
		// @00C: if_icmplt @043
		// @00F: aload_0
		// @010: getfield int game.C_100117_p.field_101001_t
		// @013: ldc -2147483648 (0x80000000)
		// @015: if_icmpne @037
		// @018: aload_0
		// @019: iconst_0
		// @01A: putfield int game.C_100117_p.field_101001_t
		// @01D: aload_0
		// @01E: iconst_0
		// @01F: putfield int game.C_100117_p.field_101008_x
		// @022: aload_0
		// @023: iconst_0
		// @024: putfield int game.C_100117_p.field_101006_z
		// @027: aload_0
		// @028: iconst_0
		// @029: putfield int game.C_100117_p.field_100994_A
		// @02C: aload_0
		// @02D: bipush 45 (0x2D)
		// @02F: invokevirtual game.C_100117_p.func_100583_c(int)void
		// @032: aload_0
		// @033: getfield int game.C_100117_p.field_100997_o
		// @036: istore_1
		// @037: aload_0
		// @038: iconst_0
		// @039: putfield int game.C_100117_p.field_100997_o
		// @03C: aload_0
		// @03D: invokespecial game.C_100117_p.func_100975_g()void
		// @040: goto @07A
		// @043: aload_0
		// @044: dup
		// @045: getfield int game.C_100117_p.field_100994_A
		// @048: aload_0
		// @049: getfield int game.C_100117_p.field_100995_B
		// @04C: iload_1
		// @04D: imul
		// @04E: iadd
		// @04F: putfield int game.C_100117_p.field_100994_A
		// @052: aload_0
		// @053: dup
		// @054: getfield int game.C_100117_p.field_101006_z
		// @057: aload_0
		// @058: getfield int game.C_100117_p.field_101007_y
		// @05B: iload_1
		// @05C: imul
		// @05D: iadd
		// @05E: putfield int game.C_100117_p.field_101006_z
		// @061: aload_0
		// @062: dup
		// @063: getfield int game.C_100117_p.field_101008_x
		// @066: aload_0
		// @067: getfield int game.C_100117_p.field_101000_u
		// @06A: iload_1
		// @06B: imul
		// @06C: iadd
		// @06D: putfield int game.C_100117_p.field_101008_x
		// @070: aload_0
		// @071: dup
		// @072: getfield int game.C_100117_p.field_100997_o
		// @075: iload_1
		// @076: isub
		// @077: putfield int game.C_100117_p.field_100997_o
		// @07A: aload_0
		// @07B: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @07E: checkcast game.C_100214_al
		// @081: astore_2
		// @082: aload_0
		// @083: getfield int game.C_100117_p.field_101003_r
		// @086: bipush 8 (0x08)
		// @088: ishl
		// @089: istore_3
		// @08A: aload_0
		// @08B: getfield int game.C_100117_p.field_101004_q
		// @08E: bipush 8 (0x08)
		// @090: ishl
		// @091: istore #4
		// @093: aload_2
		// @094: getfield byte[] game.C_100214_al.field_100885_l
		// @097: arraylength
		// @098: bipush 8 (0x08)
		// @09A: ishl
		// @09B: istore #5
		// @09D: iload #4
		// @09F: iload_3
		// @0A0: isub
		// @0A1: istore #6
		// @0A3: iload #6
		// @0A5: ifgt @0AD
		// @0A8: aload_0
		// @0A9: iconst_0
		// @0AA: putfield int game.C_100117_p.field_100998_w
		// @0AD: aload_0
		// @0AE: getfield int game.C_100117_p.field_101005_p
		// @0B1: ifge @0CE
		// @0B4: aload_0
		// @0B5: getfield int game.C_100117_p.field_101002_s
		// @0B8: ifle @0C3
		// @0BB: aload_0
		// @0BC: iconst_0
		// @0BD: putfield int game.C_100117_p.field_101005_p
		// @0C0: goto @0CE
		// @0C3: aload_0
		// @0C4: invokespecial game.C_100117_p.func_100992_h()void
		// @0C7: aload_0
		// @0C8: bipush 45 (0x2D)
		// @0CA: invokevirtual game.C_100117_p.func_100583_c(int)void
		// @0CD: return
		// @0CE: aload_0
		// @0CF: getfield int game.C_100117_p.field_101005_p
		// @0D2: iload #5
		// @0D4: if_icmplt @0F4
		// @0D7: aload_0
		// @0D8: getfield int game.C_100117_p.field_101002_s
		// @0DB: ifge @0E9
		// @0DE: aload_0
		// @0DF: iload #5
		// @0E1: iconst_1
		// @0E2: isub
		// @0E3: putfield int game.C_100117_p.field_101005_p
		// @0E6: goto @0F4
		// @0E9: aload_0
		// @0EA: invokespecial game.C_100117_p.func_100992_h()void
		// @0ED: aload_0
		// @0EE: bipush 45 (0x2D)
		// @0F0: invokevirtual game.C_100117_p.func_100583_c(int)void
		// @0F3: return
		// @0F4: aload_0
		// @0F5: dup
		// @0F6: getfield int game.C_100117_p.field_101005_p
		// @0F9: aload_0
		// @0FA: getfield int game.C_100117_p.field_101002_s
		// @0FD: iload_1
		// @0FE: imul
		// @0FF: iadd
		// @100: putfield int game.C_100117_p.field_101005_p
		// @103: aload_0
		// @104: getfield int game.C_100117_p.field_100998_w
		// @107: ifge @1C0
		// @10A: aload_0
		// @10B: getfield boolean game.C_100117_p.field_100999_v
		// @10E: ifeq @17E
		// @111: aload_0
		// @112: getfield int game.C_100117_p.field_101002_s
		// @115: ifge @138
		// @118: aload_0
		// @119: getfield int game.C_100117_p.field_101005_p
		// @11C: iload_3
		// @11D: if_icmplt @121
		// @120: return
		// @121: aload_0
		// @122: iload_3
		// @123: iload_3
		// @124: iadd
		// @125: iconst_1
		// @126: isub
		// @127: aload_0
		// @128: getfield int game.C_100117_p.field_101005_p
		// @12B: isub
		// @12C: putfield int game.C_100117_p.field_101005_p
		// @12F: aload_0
		// @130: aload_0
		// @131: getfield int game.C_100117_p.field_101002_s
		// @134: ineg
		// @135: putfield int game.C_100117_p.field_101002_s
		// @138: aload_0
		// @139: getfield int game.C_100117_p.field_101005_p
		// @13C: iload #4
		// @13E: if_icmpge @142
		// @141: return
		// @142: aload_0
		// @143: iload #4
		// @145: iload #4
		// @147: iadd
		// @148: iconst_1
		// @149: isub
		// @14A: aload_0
		// @14B: getfield int game.C_100117_p.field_101005_p
		// @14E: isub
		// @14F: putfield int game.C_100117_p.field_101005_p
		// @152: aload_0
		// @153: aload_0
		// @154: getfield int game.C_100117_p.field_101002_s
		// @157: ineg
		// @158: putfield int game.C_100117_p.field_101002_s
		// @15B: aload_0
		// @15C: getfield int game.C_100117_p.field_101005_p
		// @15F: iload_3
		// @160: if_icmplt @164
		// @163: return
		// @164: aload_0
		// @165: iload_3
		// @166: iload_3
		// @167: iadd
		// @168: iconst_1
		// @169: isub
		// @16A: aload_0
		// @16B: getfield int game.C_100117_p.field_101005_p
		// @16E: isub
		// @16F: putfield int game.C_100117_p.field_101005_p
		// @172: aload_0
		// @173: aload_0
		// @174: getfield int game.C_100117_p.field_101002_s
		// @177: ineg
		// @178: putfield int game.C_100117_p.field_101002_s
		// @17B: goto @138
		// @17E: aload_0
		// @17F: getfield int game.C_100117_p.field_101002_s
		// @182: ifge @1A6
		// @185: aload_0
		// @186: getfield int game.C_100117_p.field_101005_p
		// @189: iload_3
		// @18A: if_icmplt @18E
		// @18D: return
		// @18E: aload_0
		// @18F: iload #4
		// @191: iconst_1
		// @192: isub
		// @193: iload #4
		// @195: iconst_1
		// @196: isub
		// @197: aload_0
		// @198: getfield int game.C_100117_p.field_101005_p
		// @19B: isub
		// @19C: iload #6
		// @19E: irem
		// @19F: isub
		// @1A0: putfield int game.C_100117_p.field_101005_p
		// @1A3: goto @1BF
		// @1A6: aload_0
		// @1A7: getfield int game.C_100117_p.field_101005_p
		// @1AA: iload #4
		// @1AC: if_icmpge @1B0
		// @1AF: return
		// @1B0: aload_0
		// @1B1: iload_3
		// @1B2: aload_0
		// @1B3: getfield int game.C_100117_p.field_101005_p
		// @1B6: iload_3
		// @1B7: isub
		// @1B8: iload #6
		// @1BA: irem
		// @1BB: iadd
		// @1BC: putfield int game.C_100117_p.field_101005_p
		// @1BF: return
		// @1C0: aload_0
		// @1C1: getfield int game.C_100117_p.field_100998_w
		// @1C4: ifle @316
		// @1C7: aload_0
		// @1C8: getfield boolean game.C_100117_p.field_100999_v
		// @1CB: ifeq @26B
		// @1CE: aload_0
		// @1CF: getfield int game.C_100117_p.field_101002_s
		// @1D2: ifge @206
		// @1D5: aload_0
		// @1D6: getfield int game.C_100117_p.field_101005_p
		// @1D9: iload_3
		// @1DA: if_icmplt @1DE
		// @1DD: return
		// @1DE: aload_0
		// @1DF: iload_3
		// @1E0: iload_3
		// @1E1: iadd
		// @1E2: iconst_1
		// @1E3: isub
		// @1E4: aload_0
		// @1E5: getfield int game.C_100117_p.field_101005_p
		// @1E8: isub
		// @1E9: putfield int game.C_100117_p.field_101005_p
		// @1EC: aload_0
		// @1ED: aload_0
		// @1EE: getfield int game.C_100117_p.field_101002_s
		// @1F1: ineg
		// @1F2: putfield int game.C_100117_p.field_101002_s
		// @1F5: aload_0
		// @1F6: dup
		// @1F7: getfield int game.C_100117_p.field_100998_w
		// @1FA: iconst_1
		// @1FB: isub
		// @1FC: dup_x1
		// @1FD: putfield int game.C_100117_p.field_100998_w
		// @200: ifne @206
		// @203: goto @316
		// @206: aload_0
		// @207: getfield int game.C_100117_p.field_101005_p
		// @20A: iload #4
		// @20C: if_icmpge @210
		// @20F: return
		// @210: aload_0
		// @211: iload #4
		// @213: iload #4
		// @215: iadd
		// @216: iconst_1
		// @217: isub
		// @218: aload_0
		// @219: getfield int game.C_100117_p.field_101005_p
		// @21C: isub
		// @21D: putfield int game.C_100117_p.field_101005_p
		// @220: aload_0
		// @221: aload_0
		// @222: getfield int game.C_100117_p.field_101002_s
		// @225: ineg
		// @226: putfield int game.C_100117_p.field_101002_s
		// @229: aload_0
		// @22A: dup
		// @22B: getfield int game.C_100117_p.field_100998_w
		// @22E: iconst_1
		// @22F: isub
		// @230: dup_x1
		// @231: putfield int game.C_100117_p.field_100998_w
		// @234: ifne @23A
		// @237: goto @316
		// @23A: aload_0
		// @23B: getfield int game.C_100117_p.field_101005_p
		// @23E: iload_3
		// @23F: if_icmplt @243
		// @242: return
		// @243: aload_0
		// @244: iload_3
		// @245: iload_3
		// @246: iadd
		// @247: iconst_1
		// @248: isub
		// @249: aload_0
		// @24A: getfield int game.C_100117_p.field_101005_p
		// @24D: isub
		// @24E: putfield int game.C_100117_p.field_101005_p
		// @251: aload_0
		// @252: aload_0
		// @253: getfield int game.C_100117_p.field_101002_s
		// @256: ineg
		// @257: putfield int game.C_100117_p.field_101002_s
		// @25A: aload_0
		// @25B: dup
		// @25C: getfield int game.C_100117_p.field_100998_w
		// @25F: iconst_1
		// @260: isub
		// @261: dup_x1
		// @262: putfield int game.C_100117_p.field_100998_w
		// @265: ifne @206
		// @268: goto @316
		// @26B: aload_0
		// @26C: getfield int game.C_100117_p.field_101002_s
		// @26F: ifge @2C6
		// @272: aload_0
		// @273: getfield int game.C_100117_p.field_101005_p
		// @276: iload_3
		// @277: if_icmplt @27B
		// @27A: return
		// @27B: iload #4
		// @27D: iconst_1
		// @27E: isub
		// @27F: aload_0
		// @280: getfield int game.C_100117_p.field_101005_p
		// @283: isub
		// @284: iload #6
		// @286: idiv
		// @287: istore #7
		// @289: iload #7
		// @28B: aload_0
		// @28C: getfield int game.C_100117_p.field_100998_w
		// @28F: if_icmplt @2AA
		// @292: aload_0
		// @293: dup
		// @294: getfield int game.C_100117_p.field_101005_p
		// @297: iload #6
		// @299: aload_0
		// @29A: getfield int game.C_100117_p.field_100998_w
		// @29D: imul
		// @29E: iadd
		// @29F: putfield int game.C_100117_p.field_101005_p
		// @2A2: aload_0
		// @2A3: iconst_0
		// @2A4: putfield int game.C_100117_p.field_100998_w
		// @2A7: goto @316
		// @2AA: aload_0
		// @2AB: dup
		// @2AC: getfield int game.C_100117_p.field_101005_p
		// @2AF: iload #6
		// @2B1: iload #7
		// @2B3: imul
		// @2B4: iadd
		// @2B5: putfield int game.C_100117_p.field_101005_p
		// @2B8: aload_0
		// @2B9: dup
		// @2BA: getfield int game.C_100117_p.field_100998_w
		// @2BD: iload #7
		// @2BF: isub
		// @2C0: putfield int game.C_100117_p.field_100998_w
		// @2C3: goto @315
		// @2C6: aload_0
		// @2C7: getfield int game.C_100117_p.field_101005_p
		// @2CA: iload #4
		// @2CC: if_icmpge @2D0
		// @2CF: return
		// @2D0: aload_0
		// @2D1: getfield int game.C_100117_p.field_101005_p
		// @2D4: iload_3
		// @2D5: isub
		// @2D6: iload #6
		// @2D8: idiv
		// @2D9: istore #7
		// @2DB: iload #7
		// @2DD: aload_0
		// @2DE: getfield int game.C_100117_p.field_100998_w
		// @2E1: if_icmplt @2FC
		// @2E4: aload_0
		// @2E5: dup
		// @2E6: getfield int game.C_100117_p.field_101005_p
		// @2E9: iload #6
		// @2EB: aload_0
		// @2EC: getfield int game.C_100117_p.field_100998_w
		// @2EF: imul
		// @2F0: isub
		// @2F1: putfield int game.C_100117_p.field_101005_p
		// @2F4: aload_0
		// @2F5: iconst_0
		// @2F6: putfield int game.C_100117_p.field_100998_w
		// @2F9: goto @316
		// @2FC: aload_0
		// @2FD: dup
		// @2FE: getfield int game.C_100117_p.field_101005_p
		// @301: iload #6
		// @303: iload #7
		// @305: imul
		// @306: isub
		// @307: putfield int game.C_100117_p.field_101005_p
		// @30A: aload_0
		// @30B: dup
		// @30C: getfield int game.C_100117_p.field_100998_w
		// @30F: iload #7
		// @311: isub
		// @312: putfield int game.C_100117_p.field_100998_w
		// @315: return
		// @316: aload_0
		// @317: getfield int game.C_100117_p.field_101002_s
		// @31A: ifge @336
		// @31D: aload_0
		// @31E: getfield int game.C_100117_p.field_101005_p
		// @321: ifge @34F
		// @324: aload_0
		// @325: iconst_m1
		// @326: putfield int game.C_100117_p.field_101005_p
		// @329: aload_0
		// @32A: invokespecial game.C_100117_p.func_100992_h()void
		// @32D: aload_0
		// @32E: bipush 45 (0x2D)
		// @330: invokevirtual game.C_100117_p.func_100583_c(int)void
		// @333: goto @34F
		// @336: aload_0
		// @337: getfield int game.C_100117_p.field_101005_p
		// @33A: iload #5
		// @33C: if_icmplt @34F
		// @33F: aload_0
		// @340: iload #5
		// @342: putfield int game.C_100117_p.field_101005_p
		// @345: aload_0
		// @346: invokespecial game.C_100117_p.func_100992_h()void
		// @349: aload_0
		// @34A: bipush 45 (0x2D)
		// @34C: invokevirtual game.C_100117_p.func_100583_c(int)void
		// @34F: return
	}
	
	private static final int func_100968_b(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: ifge @08
		// @04: iload_0
		// @05: goto @1D
		// @08: iload_0
		// @09: i2d
		// @0A: sipush 16384 (0x4000)
		// @0D: iload_1
		// @0E: isub
		// @0F: i2d
		// @10: ldc2_w 1.220703125E-4
		// @13: dmul
		// @14: invokestatic java.lang.Math.sqrt(double)double
		// @17: dmul
		// @18: ldc2_w 0.5
		// @1B: dadd
		// @1C: d2i
		// @1D: ireturn
	}
	
	private static final int func_100981_d(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, C_100117_p arg11, int arg12, int arg13)
	{
		// @00: iload #12
		// @02: ifeq @1F
		// @05: iload #5
		// @07: iload #10
		// @09: sipush 256 (0x0100)
		// @0C: iadd
		// @0D: iload #4
		// @0F: isub
		// @10: iload #12
		// @12: iadd
		// @13: iload #12
		// @15: idiv
		// @16: iadd
		// @17: dup
		// @18: istore #8
		// @1A: iload #9
		// @1C: if_icmple @23
		// @1F: iload #9
		// @21: istore #8
		// @23: iload #5
		// @25: iconst_1
		// @26: ishl
		// @27: istore #5
		// @29: iload #8
		// @2B: iconst_1
		// @2C: ishl
		// @2D: istore #8
		// @2F: iload #5
		// @31: iload #8
		// @33: if_icmpge @80
		// @36: iload #4
		// @38: bipush 8 (0x08)
		// @3A: ishr
		// @3B: istore_1
		// @3C: aload_2
		// @3D: iload_1
		// @3E: iconst_1
		// @3F: isub
		// @40: baload
		// @41: istore_0
		// @42: iload_0
		// @43: bipush 8 (0x08)
		// @45: ishl
		// @46: aload_2
		// @47: iload_1
		// @48: baload
		// @49: iload_0
		// @4A: isub
		// @4B: iload #4
		// @4D: sipush 255 (0x00FF)
		// @50: iand
		// @51: imul
		// @52: iadd
		// @53: istore_0
		// @54: aload_3
		// @55: iload #5
		// @57: iinc #5 +1
		// @5A: dup2
		// @5B: iaload
		// @5C: iload_0
		// @5D: iload #6
		// @5F: imul
		// @60: bipush 6 (0x06)
		// @62: ishr
		// @63: iadd
		// @64: iastore
		// @65: aload_3
		// @66: iload #5
		// @68: iinc #5 +1
		// @6B: dup2
		// @6C: iaload
		// @6D: iload_0
		// @6E: iload #7
		// @70: imul
		// @71: bipush 6 (0x06)
		// @73: ishr
		// @74: iadd
		// @75: iastore
		// @76: iload #4
		// @78: iload #12
		// @7A: iadd
		// @7B: istore #4
		// @7D: goto @2F
		// @80: iload #12
		// @82: ifeq @9D
		// @85: iload #5
		// @87: iconst_1
		// @88: ishr
		// @89: iload #10
		// @8B: iload #4
		// @8D: isub
		// @8E: iload #12
		// @90: iadd
		// @91: iload #12
		// @93: idiv
		// @94: iadd
		// @95: dup
		// @96: istore #8
		// @98: iload #9
		// @9A: if_icmple @A1
		// @9D: iload #9
		// @9F: istore #8
		// @A1: iload #8
		// @A3: iconst_1
		// @A4: ishl
		// @A5: istore #8
		// @A7: iload #13
		// @A9: istore_1
		// @AA: iload #5
		// @AC: iload #8
		// @AE: if_icmpge @F3
		// @B1: iload_1
		// @B2: bipush 8 (0x08)
		// @B4: ishl
		// @B5: aload_2
		// @B6: iload #4
		// @B8: bipush 8 (0x08)
		// @BA: ishr
		// @BB: baload
		// @BC: iload_1
		// @BD: isub
		// @BE: iload #4
		// @C0: sipush 255 (0x00FF)
		// @C3: iand
		// @C4: imul
		// @C5: iadd
		// @C6: istore_0
		// @C7: aload_3
		// @C8: iload #5
		// @CA: iinc #5 +1
		// @CD: dup2
		// @CE: iaload
		// @CF: iload_0
		// @D0: iload #6
		// @D2: imul
		// @D3: bipush 6 (0x06)
		// @D5: ishr
		// @D6: iadd
		// @D7: iastore
		// @D8: aload_3
		// @D9: iload #5
		// @DB: iinc #5 +1
		// @DE: dup2
		// @DF: iaload
		// @E0: iload_0
		// @E1: iload #7
		// @E3: imul
		// @E4: bipush 6 (0x06)
		// @E6: ishr
		// @E7: iadd
		// @E8: iastore
		// @E9: iload #4
		// @EB: iload #12
		// @ED: iadd
		// @EE: istore #4
		// @F0: goto @AA
		// @F3: aload #11
		// @F5: iload #4
		// @F7: putfield int game.C_100117_p.field_101005_p
		// @FA: iload #5
		// @FC: iconst_1
		// @FD: ishr
		// @FE: ireturn
	}
	
	private static final int func_100970_a(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, C_100117_p arg10)
	{
		// @000: iload_3
		// @001: bipush 8 (0x08)
		// @003: ishr
		// @004: istore_3
		// @005: iload #9
		// @007: bipush 8 (0x08)
		// @009: ishr
		// @00A: istore #9
		// @00C: iload #5
		// @00E: iconst_2
		// @00F: ishl
		// @010: istore #5
		// @012: iload #6
		// @014: iconst_2
		// @015: ishl
		// @016: istore #6
		// @018: iload #4
		// @01A: iload_3
		// @01B: iadd
		// @01C: iload #9
		// @01E: iconst_1
		// @01F: isub
		// @020: isub
		// @021: dup
		// @022: istore #7
		// @024: iload #8
		// @026: if_icmple @02D
		// @029: iload #8
		// @02B: istore #7
		// @02D: iload #4
		// @02F: iconst_1
		// @030: ishl
		// @031: istore #4
		// @033: iload #7
		// @035: iconst_1
		// @036: ishl
		// @037: istore #7
		// @039: iinc #7 +250
		// @03C: iload #4
		// @03E: iload #7
		// @040: if_icmpge @0D2
		// @043: aload_1
		// @044: iload_3
		// @045: iinc #3 +255
		// @048: baload
		// @049: istore_0
		// @04A: aload_2
		// @04B: iload #4
		// @04D: iinc #4 +1
		// @050: dup2
		// @051: iaload
		// @052: iload_0
		// @053: iload #5
		// @055: imul
		// @056: iadd
		// @057: iastore
		// @058: aload_2
		// @059: iload #4
		// @05B: iinc #4 +1
		// @05E: dup2
		// @05F: iaload
		// @060: iload_0
		// @061: iload #6
		// @063: imul
		// @064: iadd
		// @065: iastore
		// @066: aload_1
		// @067: iload_3
		// @068: iinc #3 +255
		// @06B: baload
		// @06C: istore_0
		// @06D: aload_2
		// @06E: iload #4
		// @070: iinc #4 +1
		// @073: dup2
		// @074: iaload
		// @075: iload_0
		// @076: iload #5
		// @078: imul
		// @079: iadd
		// @07A: iastore
		// @07B: aload_2
		// @07C: iload #4
		// @07E: iinc #4 +1
		// @081: dup2
		// @082: iaload
		// @083: iload_0
		// @084: iload #6
		// @086: imul
		// @087: iadd
		// @088: iastore
		// @089: aload_1
		// @08A: iload_3
		// @08B: iinc #3 +255
		// @08E: baload
		// @08F: istore_0
		// @090: aload_2
		// @091: iload #4
		// @093: iinc #4 +1
		// @096: dup2
		// @097: iaload
		// @098: iload_0
		// @099: iload #5
		// @09B: imul
		// @09C: iadd
		// @09D: iastore
		// @09E: aload_2
		// @09F: iload #4
		// @0A1: iinc #4 +1
		// @0A4: dup2
		// @0A5: iaload
		// @0A6: iload_0
		// @0A7: iload #6
		// @0A9: imul
		// @0AA: iadd
		// @0AB: iastore
		// @0AC: aload_1
		// @0AD: iload_3
		// @0AE: iinc #3 +255
		// @0B1: baload
		// @0B2: istore_0
		// @0B3: aload_2
		// @0B4: iload #4
		// @0B6: iinc #4 +1
		// @0B9: dup2
		// @0BA: iaload
		// @0BB: iload_0
		// @0BC: iload #5
		// @0BE: imul
		// @0BF: iadd
		// @0C0: iastore
		// @0C1: aload_2
		// @0C2: iload #4
		// @0C4: iinc #4 +1
		// @0C7: dup2
		// @0C8: iaload
		// @0C9: iload_0
		// @0CA: iload #6
		// @0CC: imul
		// @0CD: iadd
		// @0CE: iastore
		// @0CF: goto @03C
		// @0D2: iinc #7 +6
		// @0D5: iload #4
		// @0D7: iload #7
		// @0D9: if_icmpge @102
		// @0DC: aload_1
		// @0DD: iload_3
		// @0DE: iinc #3 +255
		// @0E1: baload
		// @0E2: istore_0
		// @0E3: aload_2
		// @0E4: iload #4
		// @0E6: iinc #4 +1
		// @0E9: dup2
		// @0EA: iaload
		// @0EB: iload_0
		// @0EC: iload #5
		// @0EE: imul
		// @0EF: iadd
		// @0F0: iastore
		// @0F1: aload_2
		// @0F2: iload #4
		// @0F4: iinc #4 +1
		// @0F7: dup2
		// @0F8: iaload
		// @0F9: iload_0
		// @0FA: iload #6
		// @0FC: imul
		// @0FD: iadd
		// @0FE: iastore
		// @0FF: goto @0D5
		// @102: aload #10
		// @104: iload_3
		// @105: bipush 8 (0x08)
		// @107: ishl
		// @108: putfield int game.C_100117_p.field_101005_p
		// @10B: iload #4
		// @10D: iconst_1
		// @10E: ishr
		// @10F: ireturn
	}
	
	final synchronized int func_100969_i()
	{
		// @00: aload_0
		// @01: getfield int game.C_100117_p.field_100996_n
		// @04: ifge @0B
		// @07: iconst_m1
		// @08: goto @0F
		// @0B: aload_0
		// @0C: getfield int game.C_100117_p.field_100996_n
		// @0F: ireturn
	}
	
	private static final int func_100973_b(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, C_100117_p arg8)
	{
		// @00: iload_2
		// @01: bipush 8 (0x08)
		// @03: ishr
		// @04: istore_2
		// @05: iload #7
		// @07: bipush 8 (0x08)
		// @09: ishr
		// @0A: istore #7
		// @0C: iload #4
		// @0E: iconst_2
		// @0F: ishl
		// @10: istore #4
		// @12: iload_3
		// @13: iload #7
		// @15: iadd
		// @16: iload_2
		// @17: isub
		// @18: dup
		// @19: istore #5
		// @1B: iload #6
		// @1D: if_icmple @24
		// @20: iload #6
		// @22: istore #5
		// @24: iinc #5 +253
		// @27: iload_3
		// @28: iload #5
		// @2A: if_icmpge @78
		// @2D: aload_1
		// @2E: iload_3
		// @2F: iinc #3 +1
		// @32: dup2
		// @33: iaload
		// @34: aload_0
		// @35: iload_2
		// @36: iinc #2 +1
		// @39: baload
		// @3A: iload #4
		// @3C: imul
		// @3D: iadd
		// @3E: iastore
		// @3F: aload_1
		// @40: iload_3
		// @41: iinc #3 +1
		// @44: dup2
		// @45: iaload
		// @46: aload_0
		// @47: iload_2
		// @48: iinc #2 +1
		// @4B: baload
		// @4C: iload #4
		// @4E: imul
		// @4F: iadd
		// @50: iastore
		// @51: aload_1
		// @52: iload_3
		// @53: iinc #3 +1
		// @56: dup2
		// @57: iaload
		// @58: aload_0
		// @59: iload_2
		// @5A: iinc #2 +1
		// @5D: baload
		// @5E: iload #4
		// @60: imul
		// @61: iadd
		// @62: iastore
		// @63: aload_1
		// @64: iload_3
		// @65: iinc #3 +1
		// @68: dup2
		// @69: iaload
		// @6A: aload_0
		// @6B: iload_2
		// @6C: iinc #2 +1
		// @6F: baload
		// @70: iload #4
		// @72: imul
		// @73: iadd
		// @74: iastore
		// @75: goto @27
		// @78: iinc #5 +3
		// @7B: iload_3
		// @7C: iload #5
		// @7E: if_icmpge @96
		// @81: aload_1
		// @82: iload_3
		// @83: iinc #3 +1
		// @86: dup2
		// @87: iaload
		// @88: aload_0
		// @89: iload_2
		// @8A: iinc #2 +1
		// @8D: baload
		// @8E: iload #4
		// @90: imul
		// @91: iadd
		// @92: iastore
		// @93: goto @7B
		// @96: aload #8
		// @98: iload_2
		// @99: bipush 8 (0x08)
		// @9B: ishl
		// @9C: putfield int game.C_100117_p.field_101005_p
		// @9F: iload_3
		// @A0: ireturn
	}
	
	private static final int func_100960_a(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, C_100117_p arg9)
	{
		// @00: iload_2
		// @01: bipush 8 (0x08)
		// @03: ishr
		// @04: istore_2
		// @05: iload #8
		// @07: bipush 8 (0x08)
		// @09: ishr
		// @0A: istore #8
		// @0C: iload #4
		// @0E: iconst_2
		// @0F: ishl
		// @10: istore #4
		// @12: iload #5
		// @14: iconst_2
		// @15: ishl
		// @16: istore #5
		// @18: iload_3
		// @19: iload #8
		// @1B: iadd
		// @1C: iload_2
		// @1D: isub
		// @1E: dup
		// @1F: istore #6
		// @21: iload #7
		// @23: if_icmple @2A
		// @26: iload #7
		// @28: istore #6
		// @2A: aload #9
		// @2C: dup
		// @2D: getfield int game.C_100117_p.field_101006_z
		// @30: aload #9
		// @32: getfield int game.C_100117_p.field_101007_y
		// @35: iload #6
		// @37: iload_3
		// @38: isub
		// @39: imul
		// @3A: iadd
		// @3B: putfield int game.C_100117_p.field_101006_z
		// @3E: aload #9
		// @40: dup
		// @41: getfield int game.C_100117_p.field_101008_x
		// @44: aload #9
		// @46: getfield int game.C_100117_p.field_101000_u
		// @49: iload #6
		// @4B: iload_3
		// @4C: isub
		// @4D: imul
		// @4E: iadd
		// @4F: putfield int game.C_100117_p.field_101008_x
		// @52: iinc #6 +253
		// @55: iload_3
		// @56: iload #6
		// @58: if_icmpge @C2
		// @5B: aload_1
		// @5C: iload_3
		// @5D: iinc #3 +1
		// @60: dup2
		// @61: iaload
		// @62: aload_0
		// @63: iload_2
		// @64: iinc #2 +1
		// @67: baload
		// @68: iload #4
		// @6A: imul
		// @6B: iadd
		// @6C: iastore
		// @6D: iload #4
		// @6F: iload #5
		// @71: iadd
		// @72: istore #4
		// @74: aload_1
		// @75: iload_3
		// @76: iinc #3 +1
		// @79: dup2
		// @7A: iaload
		// @7B: aload_0
		// @7C: iload_2
		// @7D: iinc #2 +1
		// @80: baload
		// @81: iload #4
		// @83: imul
		// @84: iadd
		// @85: iastore
		// @86: iload #4
		// @88: iload #5
		// @8A: iadd
		// @8B: istore #4
		// @8D: aload_1
		// @8E: iload_3
		// @8F: iinc #3 +1
		// @92: dup2
		// @93: iaload
		// @94: aload_0
		// @95: iload_2
		// @96: iinc #2 +1
		// @99: baload
		// @9A: iload #4
		// @9C: imul
		// @9D: iadd
		// @9E: iastore
		// @9F: iload #4
		// @A1: iload #5
		// @A3: iadd
		// @A4: istore #4
		// @A6: aload_1
		// @A7: iload_3
		// @A8: iinc #3 +1
		// @AB: dup2
		// @AC: iaload
		// @AD: aload_0
		// @AE: iload_2
		// @AF: iinc #2 +1
		// @B2: baload
		// @B3: iload #4
		// @B5: imul
		// @B6: iadd
		// @B7: iastore
		// @B8: iload #4
		// @BA: iload #5
		// @BC: iadd
		// @BD: istore #4
		// @BF: goto @55
		// @C2: iinc #6 +3
		// @C5: iload_3
		// @C6: iload #6
		// @C8: if_icmpge @E7
		// @CB: aload_1
		// @CC: iload_3
		// @CD: iinc #3 +1
		// @D0: dup2
		// @D1: iaload
		// @D2: aload_0
		// @D3: iload_2
		// @D4: iinc #2 +1
		// @D7: baload
		// @D8: iload #4
		// @DA: imul
		// @DB: iadd
		// @DC: iastore
		// @DD: iload #4
		// @DF: iload #5
		// @E1: iadd
		// @E2: istore #4
		// @E4: goto @C5
		// @E7: aload #9
		// @E9: iload #4
		// @EB: iconst_2
		// @EC: ishr
		// @ED: putfield int game.C_100117_p.field_100994_A
		// @F0: aload #9
		// @F2: iload_2
		// @F3: bipush 8 (0x08)
		// @F5: ishl
		// @F6: putfield int game.C_100117_p.field_101005_p
		// @F9: iload_3
		// @FA: ireturn
	}
	
	final synchronized int func_100983_k()
	{
		// @00: aload_0
		// @01: getfield int game.C_100117_p.field_101002_s
		// @04: ifge @0F
		// @07: aload_0
		// @08: getfield int game.C_100117_p.field_101002_s
		// @0B: ineg
		// @0C: goto @13
		// @0F: aload_0
		// @10: getfield int game.C_100117_p.field_101002_s
		// @13: ireturn
	}
	
	static final C_100117_p func_100955_b(C_100214_al arg0, int arg1, int arg2, int arg3)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100214_al.field_100885_l
		// @04: ifnull @0F
		// @07: aload_0
		// @08: getfield byte[] game.C_100214_al.field_100885_l
		// @0B: arraylength
		// @0C: ifne @11
		// @0F: aconst_null
		// @10: areturn
		// @11: new game.C_100117_p
		// @14: dup
		// @15: aload_0
		// @16: aload_0
		// @17: getfield int game.C_100214_al.field_100884_o
		// @1A: i2l
		// @1B: ldc2_w 256
		// @1E: lmul
		// @1F: iload_1
		// @20: i2l
		// @21: lmul
		// @22: bipush 100 (0x64)
		// @24: getstatic int game.C_100177_cj.field_105660_u
		// @27: imul
		// @28: i2l
		// @29: ldiv
		// @2A: l2i
		// @2B: iload_2
		// @2C: bipush 6 (0x06)
		// @2E: ishl
		// @2F: iload_3
		// @30: bipush 6 (0x06)
		// @32: ishl
		// @33: invokespecial game.C_100117_p.<init>(game.C_100214_al, int, int, int)void
		// @36: areturn
	}
	
	private static final int func_100971_b(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, C_100117_p arg11, int arg12, int arg13)
	{
		// @000: aload #11
		// @002: dup
		// @003: getfield int game.C_100117_p.field_101006_z
		// @006: aload #11
		// @008: getfield int game.C_100117_p.field_101007_y
		// @00B: iload #5
		// @00D: imul
		// @00E: isub
		// @00F: putfield int game.C_100117_p.field_101006_z
		// @012: aload #11
		// @014: dup
		// @015: getfield int game.C_100117_p.field_101008_x
		// @018: aload #11
		// @01A: getfield int game.C_100117_p.field_101000_u
		// @01D: iload #5
		// @01F: imul
		// @020: isub
		// @021: putfield int game.C_100117_p.field_101008_x
		// @024: iload #12
		// @026: ifeq @043
		// @029: iload #5
		// @02B: iload #10
		// @02D: iload #4
		// @02F: isub
		// @030: iload #12
		// @032: iadd
		// @033: sipush 257 (0x0101)
		// @036: isub
		// @037: iload #12
		// @039: idiv
		// @03A: iadd
		// @03B: dup
		// @03C: istore #8
		// @03E: iload #9
		// @040: if_icmple @047
		// @043: iload #9
		// @045: istore #8
		// @047: iload #5
		// @049: iload #8
		// @04B: if_icmpge @08C
		// @04E: iload #4
		// @050: bipush 8 (0x08)
		// @052: ishr
		// @053: istore_1
		// @054: aload_2
		// @055: iload_1
		// @056: baload
		// @057: istore_0
		// @058: aload_3
		// @059: iload #5
		// @05B: iinc #5 +1
		// @05E: dup2
		// @05F: iaload
		// @060: iload_0
		// @061: bipush 8 (0x08)
		// @063: ishl
		// @064: aload_2
		// @065: iload_1
		// @066: iconst_1
		// @067: iadd
		// @068: baload
		// @069: iload_0
		// @06A: isub
		// @06B: iload #4
		// @06D: sipush 255 (0x00FF)
		// @070: iand
		// @071: imul
		// @072: iadd
		// @073: iload #6
		// @075: imul
		// @076: bipush 6 (0x06)
		// @078: ishr
		// @079: iadd
		// @07A: iastore
		// @07B: iload #6
		// @07D: iload #7
		// @07F: iadd
		// @080: istore #6
		// @082: iload #4
		// @084: iload #12
		// @086: iadd
		// @087: istore #4
		// @089: goto @047
		// @08C: iload #12
		// @08E: ifeq @0A9
		// @091: iload #5
		// @093: iload #10
		// @095: iload #4
		// @097: isub
		// @098: iload #12
		// @09A: iadd
		// @09B: iconst_1
		// @09C: isub
		// @09D: iload #12
		// @09F: idiv
		// @0A0: iadd
		// @0A1: dup
		// @0A2: istore #8
		// @0A4: iload #9
		// @0A6: if_icmple @0AD
		// @0A9: iload #9
		// @0AB: istore #8
		// @0AD: iload #13
		// @0AF: istore_1
		// @0B0: iload #5
		// @0B2: iload #8
		// @0B4: if_icmpge @0EF
		// @0B7: aload_2
		// @0B8: iload #4
		// @0BA: bipush 8 (0x08)
		// @0BC: ishr
		// @0BD: baload
		// @0BE: istore_0
		// @0BF: aload_3
		// @0C0: iload #5
		// @0C2: iinc #5 +1
		// @0C5: dup2
		// @0C6: iaload
		// @0C7: iload_0
		// @0C8: bipush 8 (0x08)
		// @0CA: ishl
		// @0CB: iload_1
		// @0CC: iload_0
		// @0CD: isub
		// @0CE: iload #4
		// @0D0: sipush 255 (0x00FF)
		// @0D3: iand
		// @0D4: imul
		// @0D5: iadd
		// @0D6: iload #6
		// @0D8: imul
		// @0D9: bipush 6 (0x06)
		// @0DB: ishr
		// @0DC: iadd
		// @0DD: iastore
		// @0DE: iload #6
		// @0E0: iload #7
		// @0E2: iadd
		// @0E3: istore #6
		// @0E5: iload #4
		// @0E7: iload #12
		// @0E9: iadd
		// @0EA: istore #4
		// @0EC: goto @0B0
		// @0EF: aload #11
		// @0F1: dup
		// @0F2: getfield int game.C_100117_p.field_101006_z
		// @0F5: aload #11
		// @0F7: getfield int game.C_100117_p.field_101007_y
		// @0FA: iload #5
		// @0FC: imul
		// @0FD: iadd
		// @0FE: putfield int game.C_100117_p.field_101006_z
		// @101: aload #11
		// @103: dup
		// @104: getfield int game.C_100117_p.field_101008_x
		// @107: aload #11
		// @109: getfield int game.C_100117_p.field_101000_u
		// @10C: iload #5
		// @10E: imul
		// @10F: iadd
		// @110: putfield int game.C_100117_p.field_101008_x
		// @113: aload #11
		// @115: iload #6
		// @117: putfield int game.C_100117_p.field_100994_A
		// @11A: aload #11
		// @11C: iload #4
		// @11E: putfield int game.C_100117_p.field_101005_p
		// @121: iload #5
		// @123: ireturn
	}
	
	final int func_100915_b()
	{
		// @00: aload_0
		// @01: getfield int game.C_100117_p.field_100994_A
		// @04: iconst_3
		// @05: imul
		// @06: bipush 6 (0x06)
		// @08: ishr
		// @09: istore_1
		// @0A: iload_1
		// @0B: iload_1
		// @0C: bipush 31 (0x1F)
		// @0E: ishr
		// @0F: ixor
		// @10: iload_1
		// @11: bipush 31 (0x1F)
		// @13: iushr
		// @14: iadd
		// @15: istore_1
		// @16: aload_0
		// @17: getfield int game.C_100117_p.field_100998_w
		// @1A: ifne @38
		// @1D: iload_1
		// @1E: iload_1
		// @1F: aload_0
		// @20: getfield int game.C_100117_p.field_101005_p
		// @23: imul
		// @24: aload_0
		// @25: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @28: checkcast game.C_100214_al
		// @2B: getfield byte[] game.C_100214_al.field_100885_l
		// @2E: arraylength
		// @2F: bipush 8 (0x08)
		// @31: ishl
		// @32: idiv
		// @33: isub
		// @34: istore_1
		// @35: goto @54
		// @38: aload_0
		// @39: getfield int game.C_100117_p.field_100998_w
		// @3C: iflt @54
		// @3F: iload_1
		// @40: iload_1
		// @41: aload_0
		// @42: getfield int game.C_100117_p.field_101003_r
		// @45: imul
		// @46: aload_0
		// @47: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @4A: checkcast game.C_100214_al
		// @4D: getfield byte[] game.C_100214_al.field_100885_l
		// @50: arraylength
		// @51: idiv
		// @52: isub
		// @53: istore_1
		// @54: iload_1
		// @55: sipush 255 (0x00FF)
		// @58: if_icmple @61
		// @5B: sipush 255 (0x00FF)
		// @5E: goto @62
		// @61: iload_1
		// @62: ireturn
	}
	
	final synchronized void func_100989_h(int arg0)
	{
		// @00: aload_0
		// @01: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @04: checkcast game.C_100214_al
		// @07: getfield byte[] game.C_100214_al.field_100885_l
		// @0A: arraylength
		// @0B: bipush 8 (0x08)
		// @0D: ishl
		// @0E: istore_2
		// @0F: iload_1
		// @10: iconst_m1
		// @11: if_icmpge @16
		// @14: iconst_m1
		// @15: istore_1
		// @16: iload_1
		// @17: iload_2
		// @18: if_icmple @1D
		// @1B: iload_2
		// @1C: istore_1
		// @1D: aload_0
		// @1E: iload_1
		// @1F: putfield int game.C_100117_p.field_101005_p
		// @22: return
	}
	
	private final boolean func_100991_l()
	{
		// @000: aload_0
		// @001: getfield int game.C_100117_p.field_101001_t
		// @004: istore_1
		// @005: iload_1
		// @006: ldc -2147483648 (0x80000000)
		// @008: if_icmpne @014
		// @00B: iconst_0
		// @00C: istore_3
		// @00D: iconst_0
		// @00E: istore_2
		// @00F: iconst_0
		// @010: istore_1
		// @011: goto @026
		// @014: iload_1
		// @015: aload_0
		// @016: getfield int game.C_100117_p.field_100996_n
		// @019: invokestatic game.C_100117_p.func_100968_b(int, int)int
		// @01C: istore_2
		// @01D: iload_1
		// @01E: aload_0
		// @01F: getfield int game.C_100117_p.field_100996_n
		// @022: invokestatic game.C_100117_p.func_100982_d(int, int)int
		// @025: istore_3
		// @026: aload_0
		// @027: getfield int game.C_100117_p.field_100994_A
		// @02A: iload_1
		// @02B: if_icmpne @03E
		// @02E: aload_0
		// @02F: getfield int game.C_100117_p.field_101006_z
		// @032: iload_2
		// @033: if_icmpne @03E
		// @036: aload_0
		// @037: getfield int game.C_100117_p.field_101008_x
		// @03A: iload_3
		// @03B: if_icmpeq @13B
		// @03E: aload_0
		// @03F: getfield int game.C_100117_p.field_100994_A
		// @042: iload_1
		// @043: if_icmpge @058
		// @046: aload_0
		// @047: iconst_1
		// @048: putfield int game.C_100117_p.field_100995_B
		// @04B: aload_0
		// @04C: iload_1
		// @04D: aload_0
		// @04E: getfield int game.C_100117_p.field_100994_A
		// @051: isub
		// @052: putfield int game.C_100117_p.field_100997_o
		// @055: goto @077
		// @058: aload_0
		// @059: getfield int game.C_100117_p.field_100994_A
		// @05C: iload_1
		// @05D: if_icmple @072
		// @060: aload_0
		// @061: iconst_m1
		// @062: putfield int game.C_100117_p.field_100995_B
		// @065: aload_0
		// @066: aload_0
		// @067: getfield int game.C_100117_p.field_100994_A
		// @06A: iload_1
		// @06B: isub
		// @06C: putfield int game.C_100117_p.field_100997_o
		// @06F: goto @077
		// @072: aload_0
		// @073: iconst_0
		// @074: putfield int game.C_100117_p.field_100995_B
		// @077: aload_0
		// @078: getfield int game.C_100117_p.field_101006_z
		// @07B: iload_2
		// @07C: if_icmpge @0A5
		// @07F: aload_0
		// @080: iconst_1
		// @081: putfield int game.C_100117_p.field_101007_y
		// @084: aload_0
		// @085: getfield int game.C_100117_p.field_100997_o
		// @088: ifeq @098
		// @08B: aload_0
		// @08C: getfield int game.C_100117_p.field_100997_o
		// @08F: iload_2
		// @090: aload_0
		// @091: getfield int game.C_100117_p.field_101006_z
		// @094: isub
		// @095: if_icmple @0D8
		// @098: aload_0
		// @099: iload_2
		// @09A: aload_0
		// @09B: getfield int game.C_100117_p.field_101006_z
		// @09E: isub
		// @09F: putfield int game.C_100117_p.field_100997_o
		// @0A2: goto @0D8
		// @0A5: aload_0
		// @0A6: getfield int game.C_100117_p.field_101006_z
		// @0A9: iload_2
		// @0AA: if_icmple @0D3
		// @0AD: aload_0
		// @0AE: iconst_m1
		// @0AF: putfield int game.C_100117_p.field_101007_y
		// @0B2: aload_0
		// @0B3: getfield int game.C_100117_p.field_100997_o
		// @0B6: ifeq @0C6
		// @0B9: aload_0
		// @0BA: getfield int game.C_100117_p.field_100997_o
		// @0BD: aload_0
		// @0BE: getfield int game.C_100117_p.field_101006_z
		// @0C1: iload_2
		// @0C2: isub
		// @0C3: if_icmple @0D8
		// @0C6: aload_0
		// @0C7: aload_0
		// @0C8: getfield int game.C_100117_p.field_101006_z
		// @0CB: iload_2
		// @0CC: isub
		// @0CD: putfield int game.C_100117_p.field_100997_o
		// @0D0: goto @0D8
		// @0D3: aload_0
		// @0D4: iconst_0
		// @0D5: putfield int game.C_100117_p.field_101007_y
		// @0D8: aload_0
		// @0D9: getfield int game.C_100117_p.field_101008_x
		// @0DC: iload_3
		// @0DD: if_icmpge @106
		// @0E0: aload_0
		// @0E1: iconst_1
		// @0E2: putfield int game.C_100117_p.field_101000_u
		// @0E5: aload_0
		// @0E6: getfield int game.C_100117_p.field_100997_o
		// @0E9: ifeq @0F9
		// @0EC: aload_0
		// @0ED: getfield int game.C_100117_p.field_100997_o
		// @0F0: iload_3
		// @0F1: aload_0
		// @0F2: getfield int game.C_100117_p.field_101008_x
		// @0F5: isub
		// @0F6: if_icmple @139
		// @0F9: aload_0
		// @0FA: iload_3
		// @0FB: aload_0
		// @0FC: getfield int game.C_100117_p.field_101008_x
		// @0FF: isub
		// @100: putfield int game.C_100117_p.field_100997_o
		// @103: goto @139
		// @106: aload_0
		// @107: getfield int game.C_100117_p.field_101008_x
		// @10A: iload_3
		// @10B: if_icmple @134
		// @10E: aload_0
		// @10F: iconst_m1
		// @110: putfield int game.C_100117_p.field_101000_u
		// @113: aload_0
		// @114: getfield int game.C_100117_p.field_100997_o
		// @117: ifeq @127
		// @11A: aload_0
		// @11B: getfield int game.C_100117_p.field_100997_o
		// @11E: aload_0
		// @11F: getfield int game.C_100117_p.field_101008_x
		// @122: iload_3
		// @123: isub
		// @124: if_icmple @139
		// @127: aload_0
		// @128: aload_0
		// @129: getfield int game.C_100117_p.field_101008_x
		// @12C: iload_3
		// @12D: isub
		// @12E: putfield int game.C_100117_p.field_100997_o
		// @131: goto @139
		// @134: aload_0
		// @135: iconst_0
		// @136: putfield int game.C_100117_p.field_101000_u
		// @139: iconst_0
		// @13A: ireturn
		// @13B: aload_0
		// @13C: getfield int game.C_100117_p.field_101001_t
		// @13F: ldc -2147483648 (0x80000000)
		// @141: if_icmpne @160
		// @144: aload_0
		// @145: iconst_0
		// @146: putfield int game.C_100117_p.field_101001_t
		// @149: aload_0
		// @14A: iconst_0
		// @14B: putfield int game.C_100117_p.field_101008_x
		// @14E: aload_0
		// @14F: iconst_0
		// @150: putfield int game.C_100117_p.field_101006_z
		// @153: aload_0
		// @154: iconst_0
		// @155: putfield int game.C_100117_p.field_100994_A
		// @158: aload_0
		// @159: bipush 45 (0x2D)
		// @15B: invokevirtual game.C_100117_p.func_100583_c(int)void
		// @15E: iconst_1
		// @15F: ireturn
		// @160: aload_0
		// @161: invokespecial game.C_100117_p.func_100975_g()void
		// @164: iconst_0
		// @165: ireturn
	}
	
	private static final int func_100990_a(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, C_100117_p arg13, int arg14, int arg15)
	{
		// @000: aload #13
		// @002: dup
		// @003: getfield int game.C_100117_p.field_100994_A
		// @006: aload #13
		// @008: getfield int game.C_100117_p.field_100995_B
		// @00B: iload #5
		// @00D: imul
		// @00E: isub
		// @00F: putfield int game.C_100117_p.field_100994_A
		// @012: iload #14
		// @014: ifeq @031
		// @017: iload #5
		// @019: iload #12
		// @01B: iload #4
		// @01D: isub
		// @01E: iload #14
		// @020: iadd
		// @021: sipush 257 (0x0101)
		// @024: isub
		// @025: iload #14
		// @027: idiv
		// @028: iadd
		// @029: dup
		// @02A: istore #10
		// @02C: iload #11
		// @02E: if_icmple @035
		// @031: iload #11
		// @033: istore #10
		// @035: iload #5
		// @037: iconst_1
		// @038: ishl
		// @039: istore #5
		// @03B: iload #10
		// @03D: iconst_1
		// @03E: ishl
		// @03F: istore #10
		// @041: iload #5
		// @043: iload #10
		// @045: if_icmpge @0A0
		// @048: iload #4
		// @04A: bipush 8 (0x08)
		// @04C: ishr
		// @04D: istore_1
		// @04E: aload_2
		// @04F: iload_1
		// @050: baload
		// @051: istore_0
		// @052: iload_0
		// @053: bipush 8 (0x08)
		// @055: ishl
		// @056: aload_2
		// @057: iload_1
		// @058: iconst_1
		// @059: iadd
		// @05A: baload
		// @05B: iload_0
		// @05C: isub
		// @05D: iload #4
		// @05F: sipush 255 (0x00FF)
		// @062: iand
		// @063: imul
		// @064: iadd
		// @065: istore_0
		// @066: aload_3
		// @067: iload #5
		// @069: iinc #5 +1
		// @06C: dup2
		// @06D: iaload
		// @06E: iload_0
		// @06F: iload #6
		// @071: imul
		// @072: bipush 6 (0x06)
		// @074: ishr
		// @075: iadd
		// @076: iastore
		// @077: iload #6
		// @079: iload #8
		// @07B: iadd
		// @07C: istore #6
		// @07E: aload_3
		// @07F: iload #5
		// @081: iinc #5 +1
		// @084: dup2
		// @085: iaload
		// @086: iload_0
		// @087: iload #7
		// @089: imul
		// @08A: bipush 6 (0x06)
		// @08C: ishr
		// @08D: iadd
		// @08E: iastore
		// @08F: iload #7
		// @091: iload #9
		// @093: iadd
		// @094: istore #7
		// @096: iload #4
		// @098: iload #14
		// @09A: iadd
		// @09B: istore #4
		// @09D: goto @041
		// @0A0: iload #14
		// @0A2: ifeq @0BF
		// @0A5: iload #5
		// @0A7: iconst_1
		// @0A8: ishr
		// @0A9: iload #12
		// @0AB: iload #4
		// @0AD: isub
		// @0AE: iload #14
		// @0B0: iadd
		// @0B1: iconst_1
		// @0B2: isub
		// @0B3: iload #14
		// @0B5: idiv
		// @0B6: iadd
		// @0B7: dup
		// @0B8: istore #10
		// @0BA: iload #11
		// @0BC: if_icmple @0C3
		// @0BF: iload #11
		// @0C1: istore #10
		// @0C3: iload #10
		// @0C5: iconst_1
		// @0C6: ishl
		// @0C7: istore #10
		// @0C9: iload #15
		// @0CB: istore_1
		// @0CC: iload #5
		// @0CE: iload #10
		// @0D0: if_icmpge @125
		// @0D3: aload_2
		// @0D4: iload #4
		// @0D6: bipush 8 (0x08)
		// @0D8: ishr
		// @0D9: baload
		// @0DA: istore_0
		// @0DB: iload_0
		// @0DC: bipush 8 (0x08)
		// @0DE: ishl
		// @0DF: iload_1
		// @0E0: iload_0
		// @0E1: isub
		// @0E2: iload #4
		// @0E4: sipush 255 (0x00FF)
		// @0E7: iand
		// @0E8: imul
		// @0E9: iadd
		// @0EA: istore_0
		// @0EB: aload_3
		// @0EC: iload #5
		// @0EE: iinc #5 +1
		// @0F1: dup2
		// @0F2: iaload
		// @0F3: iload_0
		// @0F4: iload #6
		// @0F6: imul
		// @0F7: bipush 6 (0x06)
		// @0F9: ishr
		// @0FA: iadd
		// @0FB: iastore
		// @0FC: iload #6
		// @0FE: iload #8
		// @100: iadd
		// @101: istore #6
		// @103: aload_3
		// @104: iload #5
		// @106: iinc #5 +1
		// @109: dup2
		// @10A: iaload
		// @10B: iload_0
		// @10C: iload #7
		// @10E: imul
		// @10F: bipush 6 (0x06)
		// @111: ishr
		// @112: iadd
		// @113: iastore
		// @114: iload #7
		// @116: iload #9
		// @118: iadd
		// @119: istore #7
		// @11B: iload #4
		// @11D: iload #14
		// @11F: iadd
		// @120: istore #4
		// @122: goto @0CC
		// @125: iload #5
		// @127: iconst_1
		// @128: ishr
		// @129: istore #5
		// @12B: aload #13
		// @12D: dup
		// @12E: getfield int game.C_100117_p.field_100994_A
		// @131: aload #13
		// @133: getfield int game.C_100117_p.field_100995_B
		// @136: iload #5
		// @138: imul
		// @139: iadd
		// @13A: putfield int game.C_100117_p.field_100994_A
		// @13D: aload #13
		// @13F: iload #6
		// @141: putfield int game.C_100117_p.field_101006_z
		// @144: aload #13
		// @146: iload #7
		// @148: putfield int game.C_100117_p.field_101008_x
		// @14B: aload #13
		// @14D: iload #4
		// @14F: putfield int game.C_100117_p.field_101005_p
		// @152: iload #5
		// @154: ireturn
	}
	
	private C_100117_p(C_100214_al arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100261_md.<init>()void
		// @04: aload_0
		// @05: aload_1
		// @06: putfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @09: aload_0
		// @0A: aload_1
		// @0B: getfield int game.C_100214_al.field_100887_k
		// @0E: putfield int game.C_100117_p.field_101003_r
		// @11: aload_0
		// @12: aload_1
		// @13: getfield int game.C_100214_al.field_100883_n
		// @16: putfield int game.C_100117_p.field_101004_q
		// @19: aload_0
		// @1A: aload_1
		// @1B: getfield boolean game.C_100214_al.field_100886_m
		// @1E: putfield boolean game.C_100117_p.field_100999_v
		// @21: aload_0
		// @22: iload_2
		// @23: putfield int game.C_100117_p.field_101002_s
		// @26: aload_0
		// @27: iload_3
		// @28: putfield int game.C_100117_p.field_101001_t
		// @2B: aload_0
		// @2C: sipush 8192 (0x2000)
		// @2F: putfield int game.C_100117_p.field_100996_n
		// @32: aload_0
		// @33: iconst_0
		// @34: putfield int game.C_100117_p.field_101005_p
		// @37: aload_0
		// @38: invokespecial game.C_100117_p.func_100975_g()void
		// @3B: return
	}
	
	final synchronized void func_100972_g(int arg0)
	{
		// @00: iload_1
		// @01: ifne @10
		// @04: aload_0
		// @05: iconst_0
		// @06: invokevirtual game.C_100117_p.func_100984_i(int)void
		// @09: aload_0
		// @0A: bipush 45 (0x2D)
		// @0C: invokevirtual game.C_100117_p.func_100583_c(int)void
		// @0F: return
		// @10: aload_0
		// @11: getfield int game.C_100117_p.field_101006_z
		// @14: ifne @34
		// @17: aload_0
		// @18: getfield int game.C_100117_p.field_101008_x
		// @1B: ifne @34
		// @1E: aload_0
		// @1F: iconst_0
		// @20: putfield int game.C_100117_p.field_100997_o
		// @23: aload_0
		// @24: iconst_0
		// @25: putfield int game.C_100117_p.field_101001_t
		// @28: aload_0
		// @29: iconst_0
		// @2A: putfield int game.C_100117_p.field_100994_A
		// @2D: aload_0
		// @2E: bipush 45 (0x2D)
		// @30: invokevirtual game.C_100117_p.func_100583_c(int)void
		// @33: return
		// @34: aload_0
		// @35: getfield int game.C_100117_p.field_100994_A
		// @38: ineg
		// @39: istore_2
		// @3A: aload_0
		// @3B: getfield int game.C_100117_p.field_100994_A
		// @3E: iload_2
		// @3F: if_icmple @47
		// @42: aload_0
		// @43: getfield int game.C_100117_p.field_100994_A
		// @46: istore_2
		// @47: aload_0
		// @48: getfield int game.C_100117_p.field_101006_z
		// @4B: ineg
		// @4C: iload_2
		// @4D: if_icmple @56
		// @50: aload_0
		// @51: getfield int game.C_100117_p.field_101006_z
		// @54: ineg
		// @55: istore_2
		// @56: aload_0
		// @57: getfield int game.C_100117_p.field_101006_z
		// @5A: iload_2
		// @5B: if_icmple @63
		// @5E: aload_0
		// @5F: getfield int game.C_100117_p.field_101006_z
		// @62: istore_2
		// @63: aload_0
		// @64: getfield int game.C_100117_p.field_101008_x
		// @67: ineg
		// @68: iload_2
		// @69: if_icmple @72
		// @6C: aload_0
		// @6D: getfield int game.C_100117_p.field_101008_x
		// @70: ineg
		// @71: istore_2
		// @72: aload_0
		// @73: getfield int game.C_100117_p.field_101008_x
		// @76: iload_2
		// @77: if_icmple @7F
		// @7A: aload_0
		// @7B: getfield int game.C_100117_p.field_101008_x
		// @7E: istore_2
		// @7F: iload_1
		// @80: iload_2
		// @81: if_icmple @86
		// @84: iload_2
		// @85: istore_1
		// @86: aload_0
		// @87: iload_1
		// @88: putfield int game.C_100117_p.field_100997_o
		// @8B: aload_0
		// @8C: ldc -2147483648 (0x80000000)
		// @8E: putfield int game.C_100117_p.field_101001_t
		// @91: aload_0
		// @92: aload_0
		// @93: getfield int game.C_100117_p.field_100994_A
		// @96: ineg
		// @97: iload_1
		// @98: idiv
		// @99: putfield int game.C_100117_p.field_100995_B
		// @9C: aload_0
		// @9D: aload_0
		// @9E: getfield int game.C_100117_p.field_101006_z
		// @A1: ineg
		// @A2: iload_1
		// @A3: idiv
		// @A4: putfield int game.C_100117_p.field_101007_y
		// @A7: aload_0
		// @A8: aload_0
		// @A9: getfield int game.C_100117_p.field_101008_x
		// @AC: ineg
		// @AD: iload_1
		// @AE: idiv
		// @AF: putfield int game.C_100117_p.field_101000_u
		// @B2: return
	}
	
	private C_100117_p(C_100214_al arg0, int arg1, int arg2, int arg3)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100261_md.<init>()void
		// @04: aload_0
		// @05: aload_1
		// @06: putfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @09: aload_0
		// @0A: aload_1
		// @0B: getfield int game.C_100214_al.field_100887_k
		// @0E: putfield int game.C_100117_p.field_101003_r
		// @11: aload_0
		// @12: aload_1
		// @13: getfield int game.C_100214_al.field_100883_n
		// @16: putfield int game.C_100117_p.field_101004_q
		// @19: aload_0
		// @1A: aload_1
		// @1B: getfield boolean game.C_100214_al.field_100886_m
		// @1E: putfield boolean game.C_100117_p.field_100999_v
		// @21: aload_0
		// @22: iload_2
		// @23: putfield int game.C_100117_p.field_101002_s
		// @26: aload_0
		// @27: iload_3
		// @28: putfield int game.C_100117_p.field_101001_t
		// @2B: aload_0
		// @2C: iload #4
		// @2E: putfield int game.C_100117_p.field_100996_n
		// @31: aload_0
		// @32: iconst_0
		// @33: putfield int game.C_100117_p.field_101005_p
		// @36: aload_0
		// @37: invokespecial game.C_100117_p.func_100975_g()void
		// @3A: return
	}
	
	private static final int func_100964_c(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, C_100117_p arg11, int arg12, int arg13)
	{
		// @000: iload #12
		// @002: ifeq @01F
		// @005: iload #5
		// @007: iload #10
		// @009: iload #4
		// @00B: isub
		// @00C: iload #12
		// @00E: iadd
		// @00F: sipush 257 (0x0101)
		// @012: isub
		// @013: iload #12
		// @015: idiv
		// @016: iadd
		// @017: dup
		// @018: istore #8
		// @01A: iload #9
		// @01C: if_icmple @023
		// @01F: iload #9
		// @021: istore #8
		// @023: iload #5
		// @025: iconst_1
		// @026: ishl
		// @027: istore #5
		// @029: iload #8
		// @02B: iconst_1
		// @02C: ishl
		// @02D: istore #8
		// @02F: iload #5
		// @031: iload #8
		// @033: if_icmpge @080
		// @036: iload #4
		// @038: bipush 8 (0x08)
		// @03A: ishr
		// @03B: istore_1
		// @03C: aload_2
		// @03D: iload_1
		// @03E: baload
		// @03F: istore_0
		// @040: iload_0
		// @041: bipush 8 (0x08)
		// @043: ishl
		// @044: aload_2
		// @045: iload_1
		// @046: iconst_1
		// @047: iadd
		// @048: baload
		// @049: iload_0
		// @04A: isub
		// @04B: iload #4
		// @04D: sipush 255 (0x00FF)
		// @050: iand
		// @051: imul
		// @052: iadd
		// @053: istore_0
		// @054: aload_3
		// @055: iload #5
		// @057: iinc #5 +1
		// @05A: dup2
		// @05B: iaload
		// @05C: iload_0
		// @05D: iload #6
		// @05F: imul
		// @060: bipush 6 (0x06)
		// @062: ishr
		// @063: iadd
		// @064: iastore
		// @065: aload_3
		// @066: iload #5
		// @068: iinc #5 +1
		// @06B: dup2
		// @06C: iaload
		// @06D: iload_0
		// @06E: iload #7
		// @070: imul
		// @071: bipush 6 (0x06)
		// @073: ishr
		// @074: iadd
		// @075: iastore
		// @076: iload #4
		// @078: iload #12
		// @07A: iadd
		// @07B: istore #4
		// @07D: goto @02F
		// @080: iload #12
		// @082: ifeq @09F
		// @085: iload #5
		// @087: iconst_1
		// @088: ishr
		// @089: iload #10
		// @08B: iload #4
		// @08D: isub
		// @08E: iload #12
		// @090: iadd
		// @091: iconst_1
		// @092: isub
		// @093: iload #12
		// @095: idiv
		// @096: iadd
		// @097: dup
		// @098: istore #8
		// @09A: iload #9
		// @09C: if_icmple @0A3
		// @09F: iload #9
		// @0A1: istore #8
		// @0A3: iload #8
		// @0A5: iconst_1
		// @0A6: ishl
		// @0A7: istore #8
		// @0A9: iload #13
		// @0AB: istore_1
		// @0AC: iload #5
		// @0AE: iload #8
		// @0B0: if_icmpge @0F7
		// @0B3: aload_2
		// @0B4: iload #4
		// @0B6: bipush 8 (0x08)
		// @0B8: ishr
		// @0B9: baload
		// @0BA: istore_0
		// @0BB: iload_0
		// @0BC: bipush 8 (0x08)
		// @0BE: ishl
		// @0BF: iload_1
		// @0C0: iload_0
		// @0C1: isub
		// @0C2: iload #4
		// @0C4: sipush 255 (0x00FF)
		// @0C7: iand
		// @0C8: imul
		// @0C9: iadd
		// @0CA: istore_0
		// @0CB: aload_3
		// @0CC: iload #5
		// @0CE: iinc #5 +1
		// @0D1: dup2
		// @0D2: iaload
		// @0D3: iload_0
		// @0D4: iload #6
		// @0D6: imul
		// @0D7: bipush 6 (0x06)
		// @0D9: ishr
		// @0DA: iadd
		// @0DB: iastore
		// @0DC: aload_3
		// @0DD: iload #5
		// @0DF: iinc #5 +1
		// @0E2: dup2
		// @0E3: iaload
		// @0E4: iload_0
		// @0E5: iload #7
		// @0E7: imul
		// @0E8: bipush 6 (0x06)
		// @0EA: ishr
		// @0EB: iadd
		// @0EC: iastore
		// @0ED: iload #4
		// @0EF: iload #12
		// @0F1: iadd
		// @0F2: istore #4
		// @0F4: goto @0AC
		// @0F7: aload #11
		// @0F9: iload #4
		// @0FB: putfield int game.C_100117_p.field_101005_p
		// @0FE: iload #5
		// @100: iconst_1
		// @101: ishr
		// @102: ireturn
	}
	
	private final void func_100975_g()
	{
		// @00: aload_0
		// @01: aload_0
		// @02: getfield int game.C_100117_p.field_101001_t
		// @05: putfield int game.C_100117_p.field_100994_A
		// @08: aload_0
		// @09: aload_0
		// @0A: getfield int game.C_100117_p.field_101001_t
		// @0D: aload_0
		// @0E: getfield int game.C_100117_p.field_100996_n
		// @11: invokestatic game.C_100117_p.func_100968_b(int, int)int
		// @14: putfield int game.C_100117_p.field_101006_z
		// @17: aload_0
		// @18: aload_0
		// @19: getfield int game.C_100117_p.field_101001_t
		// @1C: aload_0
		// @1D: getfield int game.C_100117_p.field_100996_n
		// @20: invokestatic game.C_100117_p.func_100982_d(int, int)int
		// @23: putfield int game.C_100117_p.field_101008_x
		// @26: return
	}
	
	private static final int func_100956_a(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, C_100117_p arg10, int arg11, int arg12)
	{
		// @00: iload #11
		// @02: ifeq @1F
		// @05: iload #5
		// @07: iload #9
		// @09: sipush 256 (0x0100)
		// @0C: iadd
		// @0D: iload #4
		// @0F: isub
		// @10: iload #11
		// @12: iadd
		// @13: iload #11
		// @15: idiv
		// @16: iadd
		// @17: dup
		// @18: istore #7
		// @1A: iload #8
		// @1C: if_icmple @23
		// @1F: iload #8
		// @21: istore #7
		// @23: iload #5
		// @25: iload #7
		// @27: if_icmpge @61
		// @2A: iload #4
		// @2C: bipush 8 (0x08)
		// @2E: ishr
		// @2F: istore_1
		// @30: aload_2
		// @31: iload_1
		// @32: iconst_1
		// @33: isub
		// @34: baload
		// @35: istore_0
		// @36: aload_3
		// @37: iload #5
		// @39: iinc #5 +1
		// @3C: dup2
		// @3D: iaload
		// @3E: iload_0
		// @3F: bipush 8 (0x08)
		// @41: ishl
		// @42: aload_2
		// @43: iload_1
		// @44: baload
		// @45: iload_0
		// @46: isub
		// @47: iload #4
		// @49: sipush 255 (0x00FF)
		// @4C: iand
		// @4D: imul
		// @4E: iadd
		// @4F: iload #6
		// @51: imul
		// @52: bipush 6 (0x06)
		// @54: ishr
		// @55: iadd
		// @56: iastore
		// @57: iload #4
		// @59: iload #11
		// @5B: iadd
		// @5C: istore #4
		// @5E: goto @23
		// @61: iload #11
		// @63: ifeq @7C
		// @66: iload #5
		// @68: iload #9
		// @6A: iload #4
		// @6C: isub
		// @6D: iload #11
		// @6F: iadd
		// @70: iload #11
		// @72: idiv
		// @73: iadd
		// @74: dup
		// @75: istore #7
		// @77: iload #8
		// @79: if_icmple @80
		// @7C: iload #8
		// @7E: istore #7
		// @80: iload #12
		// @82: istore_0
		// @83: iload #11
		// @85: istore_1
		// @86: iload #5
		// @88: iload #7
		// @8A: if_icmpge @BB
		// @8D: aload_3
		// @8E: iload #5
		// @90: iinc #5 +1
		// @93: dup2
		// @94: iaload
		// @95: iload_0
		// @96: bipush 8 (0x08)
		// @98: ishl
		// @99: aload_2
		// @9A: iload #4
		// @9C: bipush 8 (0x08)
		// @9E: ishr
		// @9F: baload
		// @A0: iload_0
		// @A1: isub
		// @A2: iload #4
		// @A4: sipush 255 (0x00FF)
		// @A7: iand
		// @A8: imul
		// @A9: iadd
		// @AA: iload #6
		// @AC: imul
		// @AD: bipush 6 (0x06)
		// @AF: ishr
		// @B0: iadd
		// @B1: iastore
		// @B2: iload #4
		// @B4: iload_1
		// @B5: iadd
		// @B6: istore #4
		// @B8: goto @86
		// @BB: aload #10
		// @BD: iload #4
		// @BF: putfield int game.C_100117_p.field_101005_p
		// @C2: iload #5
		// @C4: ireturn
	}
	
	private static final int func_100954_a(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, C_100117_p arg11, int arg12, int arg13)
	{
		// @000: aload #11
		// @002: dup
		// @003: getfield int game.C_100117_p.field_101006_z
		// @006: aload #11
		// @008: getfield int game.C_100117_p.field_101007_y
		// @00B: iload #5
		// @00D: imul
		// @00E: isub
		// @00F: putfield int game.C_100117_p.field_101006_z
		// @012: aload #11
		// @014: dup
		// @015: getfield int game.C_100117_p.field_101008_x
		// @018: aload #11
		// @01A: getfield int game.C_100117_p.field_101000_u
		// @01D: iload #5
		// @01F: imul
		// @020: isub
		// @021: putfield int game.C_100117_p.field_101008_x
		// @024: iload #12
		// @026: ifeq @043
		// @029: iload #5
		// @02B: iload #10
		// @02D: sipush 256 (0x0100)
		// @030: iadd
		// @031: iload #4
		// @033: isub
		// @034: iload #12
		// @036: iadd
		// @037: iload #12
		// @039: idiv
		// @03A: iadd
		// @03B: dup
		// @03C: istore #8
		// @03E: iload #9
		// @040: if_icmple @047
		// @043: iload #9
		// @045: istore #8
		// @047: iload #5
		// @049: iload #8
		// @04B: if_icmpge @08C
		// @04E: iload #4
		// @050: bipush 8 (0x08)
		// @052: ishr
		// @053: istore_1
		// @054: aload_2
		// @055: iload_1
		// @056: iconst_1
		// @057: isub
		// @058: baload
		// @059: istore_0
		// @05A: aload_3
		// @05B: iload #5
		// @05D: iinc #5 +1
		// @060: dup2
		// @061: iaload
		// @062: iload_0
		// @063: bipush 8 (0x08)
		// @065: ishl
		// @066: aload_2
		// @067: iload_1
		// @068: baload
		// @069: iload_0
		// @06A: isub
		// @06B: iload #4
		// @06D: sipush 255 (0x00FF)
		// @070: iand
		// @071: imul
		// @072: iadd
		// @073: iload #6
		// @075: imul
		// @076: bipush 6 (0x06)
		// @078: ishr
		// @079: iadd
		// @07A: iastore
		// @07B: iload #6
		// @07D: iload #7
		// @07F: iadd
		// @080: istore #6
		// @082: iload #4
		// @084: iload #12
		// @086: iadd
		// @087: istore #4
		// @089: goto @047
		// @08C: iload #12
		// @08E: ifeq @0A7
		// @091: iload #5
		// @093: iload #10
		// @095: iload #4
		// @097: isub
		// @098: iload #12
		// @09A: iadd
		// @09B: iload #12
		// @09D: idiv
		// @09E: iadd
		// @09F: dup
		// @0A0: istore #8
		// @0A2: iload #9
		// @0A4: if_icmple @0AB
		// @0A7: iload #9
		// @0A9: istore #8
		// @0AB: iload #13
		// @0AD: istore_0
		// @0AE: iload #12
		// @0B0: istore_1
		// @0B1: iload #5
		// @0B3: iload #8
		// @0B5: if_icmpge @0ED
		// @0B8: aload_3
		// @0B9: iload #5
		// @0BB: iinc #5 +1
		// @0BE: dup2
		// @0BF: iaload
		// @0C0: iload_0
		// @0C1: bipush 8 (0x08)
		// @0C3: ishl
		// @0C4: aload_2
		// @0C5: iload #4
		// @0C7: bipush 8 (0x08)
		// @0C9: ishr
		// @0CA: baload
		// @0CB: iload_0
		// @0CC: isub
		// @0CD: iload #4
		// @0CF: sipush 255 (0x00FF)
		// @0D2: iand
		// @0D3: imul
		// @0D4: iadd
		// @0D5: iload #6
		// @0D7: imul
		// @0D8: bipush 6 (0x06)
		// @0DA: ishr
		// @0DB: iadd
		// @0DC: iastore
		// @0DD: iload #6
		// @0DF: iload #7
		// @0E1: iadd
		// @0E2: istore #6
		// @0E4: iload #4
		// @0E6: iload_1
		// @0E7: iadd
		// @0E8: istore #4
		// @0EA: goto @0B1
		// @0ED: aload #11
		// @0EF: dup
		// @0F0: getfield int game.C_100117_p.field_101006_z
		// @0F3: aload #11
		// @0F5: getfield int game.C_100117_p.field_101007_y
		// @0F8: iload #5
		// @0FA: imul
		// @0FB: iadd
		// @0FC: putfield int game.C_100117_p.field_101006_z
		// @0FF: aload #11
		// @101: dup
		// @102: getfield int game.C_100117_p.field_101008_x
		// @105: aload #11
		// @107: getfield int game.C_100117_p.field_101000_u
		// @10A: iload #5
		// @10C: imul
		// @10D: iadd
		// @10E: putfield int game.C_100117_p.field_101008_x
		// @111: aload #11
		// @113: iload #6
		// @115: putfield int game.C_100117_p.field_100994_A
		// @118: aload #11
		// @11A: iload #4
		// @11C: putfield int game.C_100117_p.field_101005_p
		// @11F: iload #5
		// @121: ireturn
	}
	
	final synchronized int func_100988_j()
	{
		// @00: aload_0
		// @01: getfield int game.C_100117_p.field_101001_t
		// @04: ldc -2147483648 (0x80000000)
		// @06: if_icmpne @0D
		// @09: iconst_0
		// @0A: goto @11
		// @0D: aload_0
		// @0E: getfield int game.C_100117_p.field_101001_t
		// @11: ireturn
	}
	
	private static final int func_100982_d(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: ifge @09
		// @04: iload_0
		// @05: ineg
		// @06: goto @1A
		// @09: iload_0
		// @0A: i2d
		// @0B: iload_1
		// @0C: i2d
		// @0D: ldc2_w 1.220703125E-4
		// @10: dmul
		// @11: invokestatic java.lang.Math.sqrt(double)double
		// @14: dmul
		// @15: ldc2_w 0.5
		// @18: dadd
		// @19: d2i
		// @1A: ireturn
	}
	
	final synchronized boolean func_100977_f()
	{
		// @00: aload_0
		// @01: getfield int game.C_100117_p.field_101005_p
		// @04: iflt @1C
		// @07: aload_0
		// @08: getfield int game.C_100117_p.field_101005_p
		// @0B: aload_0
		// @0C: getfield game.C_100229_oe game.C_100117_p.field_100918_m
		// @0F: checkcast game.C_100214_al
		// @12: getfield byte[] game.C_100214_al.field_100885_l
		// @15: arraylength
		// @16: bipush 8 (0x08)
		// @18: ishl
		// @19: if_icmplt @20
		// @1C: iconst_1
		// @1D: goto @21
		// @20: iconst_0
		// @21: ireturn
	}
}
