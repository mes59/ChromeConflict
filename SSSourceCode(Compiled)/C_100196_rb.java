package game;

final class C_100196_rb
{
	static int field_105827_i;
	private static int[] field_105817_g;
	static int field_105823_l;
	private static int[] field_105826_h;
	static int field_105821_c;
	static int[] field_105818_d;
	static int[] field_105824_j;
	static int[] field_105825_k;
	private static int[] field_105822_a;
	static int field_105820_b;
	static int field_105819_e;
	static int field_105816_f;
	
	static final void func_105790_d(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @00: getstatic int[] game.C_100196_rb.field_105818_d
		// @03: iconst_0
		// @04: iload_2
		// @05: iload_3
		// @06: getstatic int game.C_100196_rb.field_105819_e
		// @09: imul
		// @0A: iadd
		// @0B: iload_0
		// @0C: iload_2
		// @0D: iload #4
		// @0F: getstatic int game.C_100196_rb.field_105819_e
		// @12: iload #4
		// @14: isub
		// @15: iload #5
		// @17: invokestatic game.C_100196_rb.func_105786_a(int[], int, int, int, int, int, int, int)void
		// @1A: getstatic int[] game.C_100196_rb.field_105818_d
		// @1D: iconst_0
		// @1E: iload_2
		// @1F: iload_3
		// @20: getstatic int game.C_100196_rb.field_105819_e
		// @23: imul
		// @24: iadd
		// @25: iload_1
		// @26: iload_3
		// @27: iload #5
		// @29: getstatic int game.C_100196_rb.field_105819_e
		// @2C: iload #4
		// @2E: isub
		// @2F: iload_2
		// @30: iload #4
		// @32: invokestatic game.C_100196_rb.func_105789_a(int[], int, int, int, int, int, int, int, int)void
		// @35: return
	}
	
	static final void func_105799_c(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: iload_0
		// @01: getstatic int game.C_100196_rb.field_105827_i
		// @04: if_icmpge @13
		// @07: iload_2
		// @08: getstatic int game.C_100196_rb.field_105827_i
		// @0B: iload_0
		// @0C: isub
		// @0D: isub
		// @0E: istore_2
		// @0F: getstatic int game.C_100196_rb.field_105827_i
		// @12: istore_0
		// @13: iload_0
		// @14: iload_2
		// @15: iadd
		// @16: getstatic int game.C_100196_rb.field_105820_b
		// @19: if_icmple @22
		// @1C: getstatic int game.C_100196_rb.field_105820_b
		// @1F: iload_0
		// @20: isub
		// @21: istore_2
		// @22: iload_1
		// @23: getstatic int game.C_100196_rb.field_105816_f
		// @26: if_icmpge @35
		// @29: iload_3
		// @2A: getstatic int game.C_100196_rb.field_105816_f
		// @2D: iload_1
		// @2E: isub
		// @2F: isub
		// @30: istore_3
		// @31: getstatic int game.C_100196_rb.field_105816_f
		// @34: istore_1
		// @35: iload_1
		// @36: iload_3
		// @37: iadd
		// @38: getstatic int game.C_100196_rb.field_105823_l
		// @3B: if_icmple @44
		// @3E: getstatic int game.C_100196_rb.field_105823_l
		// @41: iload_1
		// @42: isub
		// @43: istore_3
		// @44: iload_0
		// @45: iload_1
		// @46: getstatic int game.C_100196_rb.field_105819_e
		// @49: imul
		// @4A: iadd
		// @4B: istore #4
		// @4D: iload_2
		// @4E: ifle @55
		// @51: iload_3
		// @52: ifgt @56
		// @55: return
		// @56: iconst_0
		// @57: istore #5
		// @59: iload #5
		// @5B: iload_3
		// @5C: if_icmpge @C9
		// @5F: iconst_0
		// @60: istore #6
		// @62: iload #6
		// @64: iload_2
		// @65: if_icmpge @B9
		// @68: getstatic int[] game.C_100196_rb.field_105818_d
		// @6B: iload #4
		// @6D: iaload
		// @6E: istore #7
		// @70: iload #7
		// @72: bipush 15 (0x0F)
		// @74: ishr
		// @75: sipush 510 (0x01FE)
		// @78: iand
		// @79: istore #8
		// @7B: iload #7
		// @7D: bipush 8 (0x08)
		// @7F: ishr
		// @80: sipush 255 (0x00FF)
		// @83: iand
		// @84: istore #9
		// @86: iload #7
		// @88: sipush 255 (0x00FF)
		// @8B: iand
		// @8C: istore #10
		// @8E: iload #10
		// @90: iload #8
		// @92: iadd
		// @93: iconst_3
		// @94: idiv
		// @95: iload #9
		// @97: iadd
		// @98: iconst_1
		// @99: ishr
		// @9A: istore #11
		// @9C: getstatic int[] game.C_100196_rb.field_105818_d
		// @9F: iload #4
		// @A1: iinc #4 +1
		// @A4: iload #11
		// @A6: bipush 16 (0x10)
		// @A8: ishl
		// @A9: iload #11
		// @AB: bipush 8 (0x08)
		// @AD: ishl
		// @AE: iadd
		// @AF: iload #11
		// @B1: iadd
		// @B2: iastore
		// @B3: iinc #6 +1
		// @B6: goto @62
		// @B9: iload #4
		// @BB: getstatic int game.C_100196_rb.field_105819_e
		// @BE: iload_2
		// @BF: isub
		// @C0: iadd
		// @C1: istore #4
		// @C3: iinc #5 +1
		// @C6: goto @59
		// @C9: return
	}
	
	static final void func_105811_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		// @000: iload #6
		// @002: sipush 256 (0x0100)
		// @005: if_icmpne @014
		// @008: iload_0
		// @009: iload_1
		// @00A: iload_2
		// @00B: iload_3
		// @00C: iload #4
		// @00E: iload #5
		// @010: invokestatic game.C_100196_rb.func_105793_a(int, int, int, int, int, int)void
		// @013: return
		// @014: iload #4
		// @016: ifne @025
		// @019: iload_0
		// @01A: iload_1
		// @01B: iload_2
		// @01C: iload_3
		// @01D: iload #5
		// @01F: iload #6
		// @021: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @024: return
		// @025: sipush 256 (0x0100)
		// @028: iload #6
		// @02A: isub
		// @02B: istore #7
		// @02D: iload #5
		// @02F: ldc 16711935 (0xff00ff)
		// @031: iand
		// @032: iload #6
		// @034: imul
		// @035: bipush 8 (0x08)
		// @037: ishr
		// @038: ldc 16711935 (0xff00ff)
		// @03A: iand
		// @03B: iload #5
		// @03D: ldc 65280 (0xff00)
		// @03F: iand
		// @040: iload #6
		// @042: imul
		// @043: bipush 8 (0x08)
		// @045: ishr
		// @046: ldc 65280 (0xff00)
		// @048: iand
		// @049: iadd
		// @04A: istore #5
		// @04C: iload #4
		// @04E: ifge @056
		// @051: iload #4
		// @053: ineg
		// @054: istore #4
		// @056: iload_0
		// @057: iload #4
		// @059: iadd
		// @05A: istore #8
		// @05C: iload_1
		// @05D: iload #4
		// @05F: iadd
		// @060: istore #9
		// @062: iload_1
		// @063: istore #10
		// @065: iload #10
		// @067: getstatic int game.C_100196_rb.field_105816_f
		// @06A: if_icmpge @072
		// @06D: getstatic int game.C_100196_rb.field_105816_f
		// @070: istore #10
		// @072: iload_1
		// @073: iload_3
		// @074: iadd
		// @075: istore #11
		// @077: iload #11
		// @079: getstatic int game.C_100196_rb.field_105823_l
		// @07C: if_icmple @084
		// @07F: getstatic int game.C_100196_rb.field_105823_l
		// @082: istore #11
		// @084: iload_2
		// @085: iload #4
		// @087: isub
		// @088: iload #4
		// @08A: isub
		// @08B: iconst_1
		// @08C: isub
		// @08D: istore #12
		// @08F: iload #10
		// @091: istore #13
		// @093: iload #4
		// @095: iload #4
		// @097: imul
		// @098: istore #14
		// @09A: iconst_0
		// @09B: istore #15
		// @09D: iload #9
		// @09F: iload #13
		// @0A1: isub
		// @0A2: istore #16
		// @0A4: iload #16
		// @0A6: iload #16
		// @0A8: imul
		// @0A9: istore #17
		// @0AB: iload #17
		// @0AD: iload #16
		// @0AF: isub
		// @0B0: istore #18
		// @0B2: iload #9
		// @0B4: iload #11
		// @0B6: if_icmple @0BD
		// @0B9: iload #11
		// @0BB: istore #9
		// @0BD: iload #13
		// @0BF: iload #9
		// @0C1: if_icmpge @187
		// @0C4: iload #18
		// @0C6: iload #14
		// @0C8: if_icmple @0D2
		// @0CB: iload #17
		// @0CD: iload #14
		// @0CF: if_icmpgt @0EC
		// @0D2: iload #17
		// @0D4: iload #15
		// @0D6: iload #15
		// @0D8: iadd
		// @0D9: iadd
		// @0DA: istore #17
		// @0DC: iload #18
		// @0DE: iload #15
		// @0E0: iinc #15 +1
		// @0E3: iload #15
		// @0E5: iadd
		// @0E6: iadd
		// @0E7: istore #18
		// @0E9: goto @0C4
		// @0EC: iload #8
		// @0EE: iload #15
		// @0F0: isub
		// @0F1: iconst_1
		// @0F2: iadd
		// @0F3: istore #19
		// @0F5: iload #19
		// @0F7: getstatic int game.C_100196_rb.field_105827_i
		// @0FA: if_icmpge @102
		// @0FD: getstatic int game.C_100196_rb.field_105827_i
		// @100: istore #19
		// @102: iload #8
		// @104: iload #12
		// @106: iadd
		// @107: iload #15
		// @109: iadd
		// @10A: istore #20
		// @10C: iload #20
		// @10E: getstatic int game.C_100196_rb.field_105820_b
		// @111: if_icmple @119
		// @114: getstatic int game.C_100196_rb.field_105820_b
		// @117: istore #20
		// @119: iload #19
		// @11B: iload #13
		// @11D: getstatic int game.C_100196_rb.field_105819_e
		// @120: imul
		// @121: iadd
		// @122: istore #21
		// @124: iload #19
		// @126: istore #22
		// @128: iload #22
		// @12A: iload #20
		// @12C: if_icmpge @16A
		// @12F: getstatic int[] game.C_100196_rb.field_105818_d
		// @132: iload #21
		// @134: iaload
		// @135: istore #23
		// @137: iload #23
		// @139: ldc 16711935 (0xff00ff)
		// @13B: iand
		// @13C: iload #7
		// @13E: imul
		// @13F: bipush 8 (0x08)
		// @141: ishr
		// @142: ldc 16711935 (0xff00ff)
		// @144: iand
		// @145: iload #23
		// @147: ldc 65280 (0xff00)
		// @149: iand
		// @14A: iload #7
		// @14C: imul
		// @14D: bipush 8 (0x08)
		// @14F: ishr
		// @150: ldc 65280 (0xff00)
		// @152: iand
		// @153: iadd
		// @154: istore #23
		// @156: getstatic int[] game.C_100196_rb.field_105818_d
		// @159: iload #21
		// @15B: iinc #21 +1
		// @15E: iload #5
		// @160: iload #23
		// @162: iadd
		// @163: iastore
		// @164: iinc #22 +1
		// @167: goto @128
		// @16A: iinc #13 +1
		// @16D: iload #17
		// @16F: iload #16
		// @171: iinc #16 +255
		// @174: iload #16
		// @176: iadd
		// @177: isub
		// @178: istore #17
		// @17A: iload #18
		// @17C: iload #16
		// @17E: iload #16
		// @180: iadd
		// @181: isub
		// @182: istore #18
		// @184: goto @0BD
		// @187: iload #13
		// @189: iload #9
		// @18B: isub
		// @18C: istore #16
		// @18E: iload_0
		// @18F: istore #19
		// @191: iload #19
		// @193: getstatic int game.C_100196_rb.field_105827_i
		// @196: if_icmpge @19E
		// @199: getstatic int game.C_100196_rb.field_105827_i
		// @19C: istore #19
		// @19E: iload_0
		// @19F: iload_2
		// @1A0: iadd
		// @1A1: istore #20
		// @1A3: iload #20
		// @1A5: getstatic int game.C_100196_rb.field_105820_b
		// @1A8: if_icmple @1B0
		// @1AB: getstatic int game.C_100196_rb.field_105820_b
		// @1AE: istore #20
		// @1B0: iload #19
		// @1B2: iload #13
		// @1B4: getstatic int game.C_100196_rb.field_105819_e
		// @1B7: imul
		// @1B8: iadd
		// @1B9: istore #21
		// @1BB: getstatic int game.C_100196_rb.field_105819_e
		// @1BE: iload #19
		// @1C0: iadd
		// @1C1: iload #20
		// @1C3: isub
		// @1C4: istore #22
		// @1C6: iload_1
		// @1C7: iload_3
		// @1C8: iadd
		// @1C9: iload #4
		// @1CB: isub
		// @1CC: iconst_1
		// @1CD: isub
		// @1CE: istore #23
		// @1D0: iload #23
		// @1D2: getstatic int game.C_100196_rb.field_105823_l
		// @1D5: if_icmple @1DD
		// @1D8: getstatic int game.C_100196_rb.field_105823_l
		// @1DB: istore #23
		// @1DD: iload #13
		// @1DF: iload #23
		// @1E1: if_icmpge @237
		// @1E4: iload #19
		// @1E6: istore #24
		// @1E8: iload #24
		// @1EA: iload #20
		// @1EC: if_icmpge @22A
		// @1EF: getstatic int[] game.C_100196_rb.field_105818_d
		// @1F2: iload #21
		// @1F4: iaload
		// @1F5: istore #25
		// @1F7: iload #25
		// @1F9: ldc 16711935 (0xff00ff)
		// @1FB: iand
		// @1FC: iload #7
		// @1FE: imul
		// @1FF: bipush 8 (0x08)
		// @201: ishr
		// @202: ldc 16711935 (0xff00ff)
		// @204: iand
		// @205: iload #25
		// @207: ldc 65280 (0xff00)
		// @209: iand
		// @20A: iload #7
		// @20C: imul
		// @20D: bipush 8 (0x08)
		// @20F: ishr
		// @210: ldc 65280 (0xff00)
		// @212: iand
		// @213: iadd
		// @214: istore #25
		// @216: getstatic int[] game.C_100196_rb.field_105818_d
		// @219: iload #21
		// @21B: iinc #21 +1
		// @21E: iload #5
		// @220: iload #25
		// @222: iadd
		// @223: iastore
		// @224: iinc #24 +1
		// @227: goto @1E8
		// @22A: iinc #13 +1
		// @22D: iload #21
		// @22F: iload #22
		// @231: iadd
		// @232: istore #21
		// @234: goto @1DD
		// @237: iconst_0
		// @238: istore #16
		// @23A: iload #4
		// @23C: istore #15
		// @23E: iload #16
		// @240: iload #16
		// @242: imul
		// @243: iload #14
		// @245: iadd
		// @246: istore #18
		// @248: iload #18
		// @24A: iload #15
		// @24C: isub
		// @24D: istore #17
		// @24F: iload #18
		// @251: iload #16
		// @253: isub
		// @254: istore #18
		// @256: iload #13
		// @258: iload #11
		// @25A: if_icmpge @322
		// @25D: iload #18
		// @25F: iload #14
		// @261: if_icmple @285
		// @264: iload #17
		// @266: iload #14
		// @268: if_icmple @285
		// @26B: iload #18
		// @26D: iload #15
		// @26F: iinc #15 +255
		// @272: iload #15
		// @274: iadd
		// @275: isub
		// @276: istore #18
		// @278: iload #17
		// @27A: iload #15
		// @27C: iload #15
		// @27E: iadd
		// @27F: isub
		// @280: istore #17
		// @282: goto @25D
		// @285: iload #8
		// @287: iload #15
		// @289: isub
		// @28A: istore #19
		// @28C: iload #19
		// @28E: getstatic int game.C_100196_rb.field_105827_i
		// @291: if_icmpge @299
		// @294: getstatic int game.C_100196_rb.field_105827_i
		// @297: istore #19
		// @299: iload #8
		// @29B: iload #12
		// @29D: iadd
		// @29E: iload #15
		// @2A0: iadd
		// @2A1: istore #20
		// @2A3: iload #20
		// @2A5: getstatic int game.C_100196_rb.field_105820_b
		// @2A8: iconst_1
		// @2A9: isub
		// @2AA: if_icmple @2B4
		// @2AD: getstatic int game.C_100196_rb.field_105820_b
		// @2B0: iconst_1
		// @2B1: isub
		// @2B2: istore #20
		// @2B4: iload #19
		// @2B6: iload #13
		// @2B8: getstatic int game.C_100196_rb.field_105819_e
		// @2BB: imul
		// @2BC: iadd
		// @2BD: istore #21
		// @2BF: iload #19
		// @2C1: istore #22
		// @2C3: iload #22
		// @2C5: iload #20
		// @2C7: if_icmpgt @305
		// @2CA: getstatic int[] game.C_100196_rb.field_105818_d
		// @2CD: iload #21
		// @2CF: iaload
		// @2D0: istore #23
		// @2D2: iload #23
		// @2D4: ldc 16711935 (0xff00ff)
		// @2D6: iand
		// @2D7: iload #7
		// @2D9: imul
		// @2DA: bipush 8 (0x08)
		// @2DC: ishr
		// @2DD: ldc 16711935 (0xff00ff)
		// @2DF: iand
		// @2E0: iload #23
		// @2E2: ldc 65280 (0xff00)
		// @2E4: iand
		// @2E5: iload #7
		// @2E7: imul
		// @2E8: bipush 8 (0x08)
		// @2EA: ishr
		// @2EB: ldc 65280 (0xff00)
		// @2ED: iand
		// @2EE: iadd
		// @2EF: istore #23
		// @2F1: getstatic int[] game.C_100196_rb.field_105818_d
		// @2F4: iload #21
		// @2F6: iinc #21 +1
		// @2F9: iload #5
		// @2FB: iload #23
		// @2FD: iadd
		// @2FE: iastore
		// @2FF: iinc #22 +1
		// @302: goto @2C3
		// @305: iinc #13 +1
		// @308: iload #18
		// @30A: iload #16
		// @30C: iload #16
		// @30E: iadd
		// @30F: iadd
		// @310: istore #18
		// @312: iload #17
		// @314: iload #16
		// @316: iinc #16 +1
		// @319: iload #16
		// @31B: iadd
		// @31C: iadd
		// @31D: istore #17
		// @31F: goto @256
		// @322: return
	}
	
	private static final void func_105786_a(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7)
	{
		// @000: sipush 16384 (0x4000)
		// @003: iconst_2
		// @004: iload_3
		// @005: imul
		// @006: iconst_1
		// @007: iadd
		// @008: idiv
		// @009: istore #8
		// @00B: iconst_1
		// @00C: iload_3
		// @00D: iadd
		// @00E: iload #5
		// @010: isub
		// @011: iload #4
		// @013: isub
		// @014: istore #9
		// @016: iconst_0
		// @017: iload #9
		// @019: if_icmpge @01F
		// @01C: iconst_0
		// @01D: istore #9
		// @01F: getstatic int game.C_100196_rb.field_105819_e
		// @022: iload #4
		// @024: isub
		// @025: iload #5
		// @027: isub
		// @028: iload_3
		// @029: isub
		// @02A: istore #10
		// @02C: iconst_0
		// @02D: iload #10
		// @02F: if_icmpge @035
		// @032: iconst_0
		// @033: istore #10
		// @035: iconst_0
		// @036: istore #11
		// @038: iload #4
		// @03A: iload_3
		// @03B: iadd
		// @03C: iconst_1
		// @03D: iadd
		// @03E: istore #12
		// @040: getstatic int game.C_100196_rb.field_105819_e
		// @043: iload #12
		// @045: if_icmpge @055
		// @048: iload #12
		// @04A: getstatic int game.C_100196_rb.field_105819_e
		// @04D: isub
		// @04E: istore #11
		// @050: getstatic int game.C_100196_rb.field_105819_e
		// @053: istore #12
		// @055: iload #7
		// @057: ineg
		// @058: istore #13
		// @05A: iload #13
		// @05C: ifge @304
		// @05F: iconst_0
		// @060: istore #14
		// @062: iconst_0
		// @063: istore #15
		// @065: iconst_0
		// @066: istore #16
		// @068: iload_2
		// @069: iload_3
		// @06A: isub
		// @06B: istore #17
		// @06D: iload #17
		// @06F: iload_3
		// @070: iconst_1
		// @071: ishl
		// @072: isub
		// @073: iconst_1
		// @074: isub
		// @075: istore #18
		// @077: iload #4
		// @079: iload_3
		// @07A: isub
		// @07B: istore #19
		// @07D: iload #19
		// @07F: ifge @093
		// @082: iload #17
		// @084: iload #19
		// @086: isub
		// @087: istore #17
		// @089: iload #18
		// @08B: iload #19
		// @08D: isub
		// @08E: istore #18
		// @090: iconst_0
		// @091: istore #19
		// @093: iload #12
		// @095: iload #19
		// @097: isub
		// @098: istore #20
		// @09A: iload #19
		// @09C: iload #12
		// @09E: if_icmpge @0D6
		// @0A1: aload_0
		// @0A2: iload #17
		// @0A4: iaload
		// @0A5: istore_1
		// @0A6: iload #14
		// @0A8: iload_1
		// @0A9: bipush 16 (0x10)
		// @0AB: ishr
		// @0AC: sipush 255 (0x00FF)
		// @0AF: iand
		// @0B0: iadd
		// @0B1: istore #14
		// @0B3: iload #15
		// @0B5: iload_1
		// @0B6: bipush 8 (0x08)
		// @0B8: ishr
		// @0B9: sipush 255 (0x00FF)
		// @0BC: iand
		// @0BD: iadd
		// @0BE: istore #15
		// @0C0: iload #16
		// @0C2: iload_1
		// @0C3: sipush 255 (0x00FF)
		// @0C6: iand
		// @0C7: iadd
		// @0C8: istore #16
		// @0CA: iinc #17 +1
		// @0CD: iinc #18 +1
		// @0D0: iinc #19 +1
		// @0D3: goto @09A
		// @0D6: iload #18
		// @0D8: iload #11
		// @0DA: iadd
		// @0DB: istore #18
		// @0DD: aload_0
		// @0DE: iload_2
		// @0DF: iinc #2 +1
		// @0E2: iload #14
		// @0E4: iload #20
		// @0E6: idiv
		// @0E7: bipush 16 (0x10)
		// @0E9: ishl
		// @0EA: iload #15
		// @0EC: iload #20
		// @0EE: idiv
		// @0EF: bipush 8 (0x08)
		// @0F1: ishl
		// @0F2: iadd
		// @0F3: iload #16
		// @0F5: iload #20
		// @0F7: idiv
		// @0F8: iadd
		// @0F9: iastore
		// @0FA: iconst_1
		// @0FB: iload #5
		// @0FD: isub
		// @0FE: istore #19
		// @100: iload #19
		// @102: iload #9
		// @104: if_icmpge @178
		// @107: iinc #18 +1
		// @10A: iload #4
		// @10C: iload #5
		// @10E: iadd
		// @10F: iload #19
		// @111: iadd
		// @112: iload_3
		// @113: iadd
		// @114: getstatic int game.C_100196_rb.field_105820_b
		// @117: if_icmpge @149
		// @11A: aload_0
		// @11B: iload #17
		// @11D: iaload
		// @11E: istore_1
		// @11F: iinc #17 +1
		// @122: iload #14
		// @124: iload_1
		// @125: bipush 16 (0x10)
		// @127: ishr
		// @128: sipush 255 (0x00FF)
		// @12B: iand
		// @12C: iadd
		// @12D: istore #14
		// @12F: iload #15
		// @131: iload_1
		// @132: bipush 8 (0x08)
		// @134: ishr
		// @135: sipush 255 (0x00FF)
		// @138: iand
		// @139: iadd
		// @13A: istore #15
		// @13C: iload #16
		// @13E: iload_1
		// @13F: sipush 255 (0x00FF)
		// @142: iand
		// @143: iadd
		// @144: istore #16
		// @146: iinc #20 +1
		// @149: iload #14
		// @14B: iload #20
		// @14D: idiv
		// @14E: istore #21
		// @150: iload #15
		// @152: iload #20
		// @154: idiv
		// @155: istore #22
		// @157: iload #16
		// @159: iload #20
		// @15B: idiv
		// @15C: istore #23
		// @15E: aload_0
		// @15F: iload_2
		// @160: iinc #2 +1
		// @163: iload #21
		// @165: bipush 16 (0x10)
		// @167: ishl
		// @168: iload #22
		// @16A: bipush 8 (0x08)
		// @16C: ishl
		// @16D: iadd
		// @16E: iload #23
		// @170: iadd
		// @171: iastore
		// @172: iinc #19 +1
		// @175: goto @100
		// @178: iload #19
		// @17A: iload #10
		// @17C: if_icmpge @24E
		// @17F: aload_0
		// @180: iload #18
		// @182: iinc #18 +1
		// @185: iaload
		// @186: istore_1
		// @187: iload #14
		// @189: iload_1
		// @18A: bipush 16 (0x10)
		// @18C: ishr
		// @18D: sipush 255 (0x00FF)
		// @190: iand
		// @191: isub
		// @192: istore #14
		// @194: iload #14
		// @196: ifge @19C
		// @199: iconst_0
		// @19A: istore #14
		// @19C: iload #15
		// @19E: iload_1
		// @19F: bipush 8 (0x08)
		// @1A1: ishr
		// @1A2: sipush 255 (0x00FF)
		// @1A5: iand
		// @1A6: isub
		// @1A7: istore #15
		// @1A9: iload #15
		// @1AB: ifge @1B1
		// @1AE: iconst_0
		// @1AF: istore #15
		// @1B1: iload #16
		// @1B3: iload_1
		// @1B4: sipush 255 (0x00FF)
		// @1B7: iand
		// @1B8: isub
		// @1B9: istore #16
		// @1BB: iload #16
		// @1BD: ifge @1C3
		// @1C0: iconst_0
		// @1C1: istore #16
		// @1C3: aload_0
		// @1C4: iload #17
		// @1C6: iaload
		// @1C7: istore_1
		// @1C8: iinc #17 +1
		// @1CB: iload #14
		// @1CD: iload_1
		// @1CE: bipush 16 (0x10)
		// @1D0: ishr
		// @1D1: sipush 255 (0x00FF)
		// @1D4: iand
		// @1D5: iadd
		// @1D6: istore #14
		// @1D8: iload #15
		// @1DA: iload_1
		// @1DB: bipush 8 (0x08)
		// @1DD: ishr
		// @1DE: sipush 255 (0x00FF)
		// @1E1: iand
		// @1E2: iadd
		// @1E3: istore #15
		// @1E5: iload #16
		// @1E7: iload_1
		// @1E8: sipush 255 (0x00FF)
		// @1EB: iand
		// @1EC: iadd
		// @1ED: istore #16
		// @1EF: iload #14
		// @1F1: iload #8
		// @1F3: imul
		// @1F4: bipush 14 (0x0E)
		// @1F6: ishr
		// @1F7: istore #21
		// @1F9: iload #15
		// @1FB: iload #8
		// @1FD: imul
		// @1FE: bipush 14 (0x0E)
		// @200: ishr
		// @201: istore #22
		// @203: iload #16
		// @205: iload #8
		// @207: imul
		// @208: bipush 14 (0x0E)
		// @20A: ishr
		// @20B: istore #23
		// @20D: iload #21
		// @20F: sipush 255 (0x00FF)
		// @212: if_icmple @21A
		// @215: sipush 255 (0x00FF)
		// @218: istore #21
		// @21A: iload #22
		// @21C: sipush 255 (0x00FF)
		// @21F: if_icmple @227
		// @222: sipush 255 (0x00FF)
		// @225: istore #22
		// @227: iload #23
		// @229: sipush 255 (0x00FF)
		// @22C: if_icmple @234
		// @22F: sipush 255 (0x00FF)
		// @232: istore #23
		// @234: aload_0
		// @235: iload_2
		// @236: iinc #2 +1
		// @239: iload #21
		// @23B: bipush 16 (0x10)
		// @23D: ishl
		// @23E: iload #22
		// @240: bipush 8 (0x08)
		// @242: ishl
		// @243: iadd
		// @244: iload #23
		// @246: iadd
		// @247: iastore
		// @248: iinc #19 +1
		// @24B: goto @178
		// @24E: iload #19
		// @250: ifge @2F9
		// @253: aload_0
		// @254: iload #18
		// @256: iinc #18 +1
		// @259: iaload
		// @25A: istore_1
		// @25B: iload #14
		// @25D: iload_1
		// @25E: bipush 16 (0x10)
		// @260: ishr
		// @261: sipush 255 (0x00FF)
		// @264: iand
		// @265: isub
		// @266: istore #14
		// @268: iload #15
		// @26A: iload_1
		// @26B: bipush 8 (0x08)
		// @26D: ishr
		// @26E: sipush 255 (0x00FF)
		// @271: iand
		// @272: isub
		// @273: istore #15
		// @275: iload #16
		// @277: iload_1
		// @278: sipush 255 (0x00FF)
		// @27B: iand
		// @27C: isub
		// @27D: istore #16
		// @27F: iinc #20 +255
		// @282: iload #14
		// @284: iload #20
		// @286: idiv
		// @287: istore #21
		// @289: iload #15
		// @28B: iload #20
		// @28D: idiv
		// @28E: istore #22
		// @290: iload #16
		// @292: iload #20
		// @294: idiv
		// @295: istore #23
		// @297: iload #21
		// @299: ifge @2A2
		// @29C: iconst_0
		// @29D: istore #21
		// @29F: goto @2AF
		// @2A2: iload #21
		// @2A4: sipush 255 (0x00FF)
		// @2A7: if_icmple @2AF
		// @2AA: sipush 255 (0x00FF)
		// @2AD: istore #21
		// @2AF: iload #22
		// @2B1: ifge @2BA
		// @2B4: iconst_0
		// @2B5: istore #22
		// @2B7: goto @2C7
		// @2BA: iload #22
		// @2BC: sipush 255 (0x00FF)
		// @2BF: if_icmple @2C7
		// @2C2: sipush 255 (0x00FF)
		// @2C5: istore #22
		// @2C7: iload #23
		// @2C9: ifge @2D2
		// @2CC: iconst_0
		// @2CD: istore #23
		// @2CF: goto @2DF
		// @2D2: iload #23
		// @2D4: sipush 255 (0x00FF)
		// @2D7: if_icmple @2DF
		// @2DA: sipush 255 (0x00FF)
		// @2DD: istore #23
		// @2DF: aload_0
		// @2E0: iload_2
		// @2E1: iinc #2 +1
		// @2E4: iload #21
		// @2E6: bipush 16 (0x10)
		// @2E8: ishl
		// @2E9: iload #22
		// @2EB: bipush 8 (0x08)
		// @2ED: ishl
		// @2EE: iadd
		// @2EF: iload #23
		// @2F1: iadd
		// @2F2: iastore
		// @2F3: iinc #19 +1
		// @2F6: goto @24E
		// @2F9: iload_2
		// @2FA: iload #6
		// @2FC: iadd
		// @2FD: istore_2
		// @2FE: iinc #13 +1
		// @301: goto @05A
		// @304: return
	}
	
	static final void func_105808_a(int[] arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: putstatic int[] game.C_100196_rb.field_105818_d
		// @04: iload_1
		// @05: putstatic int game.C_100196_rb.field_105819_e
		// @08: iload_2
		// @09: putstatic int game.C_100196_rb.field_105821_c
		// @0C: iconst_0
		// @0D: iconst_0
		// @0E: iload_1
		// @0F: iload_2
		// @10: invokestatic game.C_100196_rb.func_105815_h(int, int, int, int)void
		// @13: return
	}
	
	static final void func_105795_d(int arg0, int arg1, int arg2, int arg3)
	{
		// @000: iload_2
		// @001: ifne @00B
		// @004: iload_0
		// @005: iload_1
		// @006: iload_3
		// @007: invokestatic game.C_100196_rb.func_105797_b(int, int, int)void
		// @00A: return
		// @00B: iload_2
		// @00C: ifge @012
		// @00F: iload_2
		// @010: ineg
		// @011: istore_2
		// @012: iload_1
		// @013: iload_2
		// @014: isub
		// @015: istore #4
		// @017: iload #4
		// @019: getstatic int game.C_100196_rb.field_105816_f
		// @01C: if_icmpge @024
		// @01F: getstatic int game.C_100196_rb.field_105816_f
		// @022: istore #4
		// @024: iload_1
		// @025: iload_2
		// @026: iadd
		// @027: iconst_1
		// @028: iadd
		// @029: istore #5
		// @02B: iload #5
		// @02D: getstatic int game.C_100196_rb.field_105823_l
		// @030: if_icmple @038
		// @033: getstatic int game.C_100196_rb.field_105823_l
		// @036: istore #5
		// @038: iload #4
		// @03A: istore #6
		// @03C: iload_2
		// @03D: iload_2
		// @03E: imul
		// @03F: istore #7
		// @041: iconst_0
		// @042: istore #8
		// @044: iload_1
		// @045: iload #6
		// @047: isub
		// @048: istore #9
		// @04A: iload #9
		// @04C: iload #9
		// @04E: imul
		// @04F: istore #10
		// @051: iload #10
		// @053: iload #9
		// @055: isub
		// @056: istore #11
		// @058: iload_1
		// @059: iload #5
		// @05B: if_icmple @061
		// @05E: iload #5
		// @060: istore_1
		// @061: iload #6
		// @063: iload_1
		// @064: if_icmpge @0FA
		// @067: iload #11
		// @069: iload #7
		// @06B: if_icmple @075
		// @06E: iload #10
		// @070: iload #7
		// @072: if_icmpgt @08F
		// @075: iload #10
		// @077: iload #8
		// @079: iload #8
		// @07B: iadd
		// @07C: iadd
		// @07D: istore #10
		// @07F: iload #11
		// @081: iload #8
		// @083: iinc #8 +1
		// @086: iload #8
		// @088: iadd
		// @089: iadd
		// @08A: istore #11
		// @08C: goto @067
		// @08F: iload_0
		// @090: iload #8
		// @092: isub
		// @093: iconst_1
		// @094: iadd
		// @095: istore #12
		// @097: iload #12
		// @099: getstatic int game.C_100196_rb.field_105827_i
		// @09C: if_icmpge @0A4
		// @09F: getstatic int game.C_100196_rb.field_105827_i
		// @0A2: istore #12
		// @0A4: iload_0
		// @0A5: iload #8
		// @0A7: iadd
		// @0A8: istore #13
		// @0AA: iload #13
		// @0AC: getstatic int game.C_100196_rb.field_105820_b
		// @0AF: if_icmple @0B7
		// @0B2: getstatic int game.C_100196_rb.field_105820_b
		// @0B5: istore #13
		// @0B7: iload #12
		// @0B9: iload #6
		// @0BB: getstatic int game.C_100196_rb.field_105819_e
		// @0BE: imul
		// @0BF: iadd
		// @0C0: istore #14
		// @0C2: iload #12
		// @0C4: istore #15
		// @0C6: iload #15
		// @0C8: iload #13
		// @0CA: if_icmpge @0DD
		// @0CD: getstatic int[] game.C_100196_rb.field_105818_d
		// @0D0: iload #14
		// @0D2: iinc #14 +1
		// @0D5: iload_3
		// @0D6: iastore
		// @0D7: iinc #15 +1
		// @0DA: goto @0C6
		// @0DD: iinc #6 +1
		// @0E0: iload #10
		// @0E2: iload #9
		// @0E4: iinc #9 +255
		// @0E7: iload #9
		// @0E9: iadd
		// @0EA: isub
		// @0EB: istore #10
		// @0ED: iload #11
		// @0EF: iload #9
		// @0F1: iload #9
		// @0F3: iadd
		// @0F4: isub
		// @0F5: istore #11
		// @0F7: goto @061
		// @0FA: iload_2
		// @0FB: istore #8
		// @0FD: iload #6
		// @0FF: iload_1
		// @100: isub
		// @101: istore #9
		// @103: iload #9
		// @105: iload #9
		// @107: imul
		// @108: iload #7
		// @10A: iadd
		// @10B: istore #11
		// @10D: iload #11
		// @10F: iload #8
		// @111: isub
		// @112: istore #10
		// @114: iload #11
		// @116: iload #9
		// @118: isub
		// @119: istore #11
		// @11B: iload #6
		// @11D: iload #5
		// @11F: if_icmpge @1B7
		// @122: iload #11
		// @124: iload #7
		// @126: if_icmple @14A
		// @129: iload #10
		// @12B: iload #7
		// @12D: if_icmple @14A
		// @130: iload #11
		// @132: iload #8
		// @134: iinc #8 +255
		// @137: iload #8
		// @139: iadd
		// @13A: isub
		// @13B: istore #11
		// @13D: iload #10
		// @13F: iload #8
		// @141: iload #8
		// @143: iadd
		// @144: isub
		// @145: istore #10
		// @147: goto @122
		// @14A: iload_0
		// @14B: iload #8
		// @14D: isub
		// @14E: istore #12
		// @150: iload #12
		// @152: getstatic int game.C_100196_rb.field_105827_i
		// @155: if_icmpge @15D
		// @158: getstatic int game.C_100196_rb.field_105827_i
		// @15B: istore #12
		// @15D: iload_0
		// @15E: iload #8
		// @160: iadd
		// @161: istore #13
		// @163: iload #13
		// @165: getstatic int game.C_100196_rb.field_105820_b
		// @168: iconst_1
		// @169: isub
		// @16A: if_icmple @174
		// @16D: getstatic int game.C_100196_rb.field_105820_b
		// @170: iconst_1
		// @171: isub
		// @172: istore #13
		// @174: iload #12
		// @176: iload #6
		// @178: getstatic int game.C_100196_rb.field_105819_e
		// @17B: imul
		// @17C: iadd
		// @17D: istore #14
		// @17F: iload #12
		// @181: istore #15
		// @183: iload #15
		// @185: iload #13
		// @187: if_icmpgt @19A
		// @18A: getstatic int[] game.C_100196_rb.field_105818_d
		// @18D: iload #14
		// @18F: iinc #14 +1
		// @192: iload_3
		// @193: iastore
		// @194: iinc #15 +1
		// @197: goto @183
		// @19A: iinc #6 +1
		// @19D: iload #11
		// @19F: iload #9
		// @1A1: iload #9
		// @1A3: iadd
		// @1A4: iadd
		// @1A5: istore #11
		// @1A7: iload #10
		// @1A9: iload #9
		// @1AB: iinc #9 +1
		// @1AE: iload #9
		// @1B0: iadd
		// @1B1: iadd
		// @1B2: istore #10
		// @1B4: goto @11B
		// @1B7: return
	}
	
	private static final void func_105812_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int[] arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17)
	{
		// @00: iload #17
		// @02: ifge @88
		// @05: iload #14
		// @07: istore_3
		// @08: iload #12
		// @0A: istore #4
		// @0C: iload #13
		// @0E: istore #18
		// @10: iload #18
		// @12: ifge @6D
		// @15: iload_3
		// @16: iload #6
		// @18: if_icmpge @58
		// @1B: aload #10
		// @1D: iload #6
		// @1F: iload_3
		// @20: isub
		// @21: iload #9
		// @23: imul
		// @24: iload #6
		// @26: idiv
		// @27: iaload
		// @28: istore_0
		// @29: aload #8
		// @2B: iload #7
		// @2D: iaload
		// @2E: istore_1
		// @2F: iload_0
		// @30: iload_1
		// @31: iadd
		// @32: istore_2
		// @33: iload_0
		// @34: ldc 16711935 (0xff00ff)
		// @36: iand
		// @37: iload_1
		// @38: ldc 16711935 (0xff00ff)
		// @3A: iand
		// @3B: iadd
		// @3C: istore_0
		// @3D: iload_0
		// @3E: ldc 16777472 (0x1000100)
		// @40: iand
		// @41: iload_2
		// @42: iload_0
		// @43: isub
		// @44: ldc 65536 (0x10000)
		// @46: iand
		// @47: iadd
		// @48: istore_1
		// @49: aload #8
		// @4B: iload #7
		// @4D: iload_2
		// @4E: iload_1
		// @4F: isub
		// @50: iload_1
		// @51: iload_1
		// @52: bipush 8 (0x08)
		// @54: iushr
		// @55: isub
		// @56: ior
		// @57: iastore
		// @58: iinc #7 +1
		// @5B: iload_3
		// @5C: iload #4
		// @5E: iadd
		// @5F: istore_3
		// @60: iload #4
		// @62: iload #5
		// @64: iadd
		// @65: istore #4
		// @67: iinc #18 +1
		// @6A: goto @10
		// @6D: iload #7
		// @6F: iload #11
		// @71: iadd
		// @72: istore #7
		// @74: iload #14
		// @76: iload #15
		// @78: iadd
		// @79: istore #14
		// @7B: iload #15
		// @7D: iload #16
		// @7F: iadd
		// @80: istore #15
		// @82: iinc #17 +1
		// @85: goto @00
		// @88: return
	}
	
	public static void func_105806_d()
	{
		// @00: aconst_null
		// @01: putstatic int[] game.C_100196_rb.field_105818_d
		// @04: aconst_null
		// @05: putstatic int[] game.C_100196_rb.field_105825_k
		// @08: aconst_null
		// @09: putstatic int[] game.C_100196_rb.field_105824_j
		// @0C: aconst_null
		// @0D: putstatic int[] game.C_100196_rb.field_105822_a
		// @10: aconst_null
		// @11: putstatic int[] game.C_100196_rb.field_105817_g
		// @14: aconst_null
		// @15: putstatic int[] game.C_100196_rb.field_105826_h
		// @18: return
	}
	
	static final void func_105800_f(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: iload_1
		// @01: getstatic int game.C_100196_rb.field_105816_f
		// @04: if_icmplt @0E
		// @07: iload_1
		// @08: getstatic int game.C_100196_rb.field_105823_l
		// @0B: if_icmplt @0F
		// @0E: return
		// @0F: iload_0
		// @10: getstatic int game.C_100196_rb.field_105827_i
		// @13: if_icmpge @22
		// @16: iload_2
		// @17: getstatic int game.C_100196_rb.field_105827_i
		// @1A: iload_0
		// @1B: isub
		// @1C: isub
		// @1D: istore_2
		// @1E: getstatic int game.C_100196_rb.field_105827_i
		// @21: istore_0
		// @22: iload_0
		// @23: iload_2
		// @24: iadd
		// @25: getstatic int game.C_100196_rb.field_105820_b
		// @28: if_icmple @31
		// @2B: getstatic int game.C_100196_rb.field_105820_b
		// @2E: iload_0
		// @2F: isub
		// @30: istore_2
		// @31: sipush 256 (0x0100)
		// @34: iload #4
		// @36: isub
		// @37: istore #5
		// @39: iload_3
		// @3A: bipush 16 (0x10)
		// @3C: ishr
		// @3D: sipush 255 (0x00FF)
		// @40: iand
		// @41: iload #4
		// @43: imul
		// @44: istore #6
		// @46: iload_3
		// @47: bipush 8 (0x08)
		// @49: ishr
		// @4A: sipush 255 (0x00FF)
		// @4D: iand
		// @4E: iload #4
		// @50: imul
		// @51: istore #7
		// @53: iload_3
		// @54: sipush 255 (0x00FF)
		// @57: iand
		// @58: iload #4
		// @5A: imul
		// @5B: istore #8
		// @5D: iload_0
		// @5E: iload_1
		// @5F: getstatic int game.C_100196_rb.field_105819_e
		// @62: imul
		// @63: iadd
		// @64: istore #12
		// @66: iconst_0
		// @67: istore #13
		// @69: iload #13
		// @6B: iload_2
		// @6C: if_icmpge @D5
		// @6F: getstatic int[] game.C_100196_rb.field_105818_d
		// @72: iload #12
		// @74: iaload
		// @75: bipush 16 (0x10)
		// @77: ishr
		// @78: sipush 255 (0x00FF)
		// @7B: iand
		// @7C: iload #5
		// @7E: imul
		// @7F: istore #9
		// @81: getstatic int[] game.C_100196_rb.field_105818_d
		// @84: iload #12
		// @86: iaload
		// @87: bipush 8 (0x08)
		// @89: ishr
		// @8A: sipush 255 (0x00FF)
		// @8D: iand
		// @8E: iload #5
		// @90: imul
		// @91: istore #10
		// @93: getstatic int[] game.C_100196_rb.field_105818_d
		// @96: iload #12
		// @98: iaload
		// @99: sipush 255 (0x00FF)
		// @9C: iand
		// @9D: iload #5
		// @9F: imul
		// @A0: istore #11
		// @A2: iload #6
		// @A4: iload #9
		// @A6: iadd
		// @A7: bipush 8 (0x08)
		// @A9: ishr
		// @AA: bipush 16 (0x10)
		// @AC: ishl
		// @AD: iload #7
		// @AF: iload #10
		// @B1: iadd
		// @B2: bipush 8 (0x08)
		// @B4: ishr
		// @B5: bipush 8 (0x08)
		// @B7: ishl
		// @B8: iadd
		// @B9: iload #8
		// @BB: iload #11
		// @BD: iadd
		// @BE: bipush 8 (0x08)
		// @C0: ishr
		// @C1: iadd
		// @C2: istore #14
		// @C4: getstatic int[] game.C_100196_rb.field_105818_d
		// @C7: iload #12
		// @C9: iinc #12 +1
		// @CC: iload #14
		// @CE: iastore
		// @CF: iinc #13 +1
		// @D2: goto @69
		// @D5: return
	}
	
	static final void func_105783_g(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: iconst_0
		// @01: istore #6
		// @03: iload #6
		// @05: iconst_4
		// @06: if_icmpge @3F
		// @09: sipush 128 (0x0080)
		// @0C: iload #6
		// @0E: iconst_5
		// @0F: ishl
		// @10: isub
		// @11: istore #5
		// @13: iload_0
		// @14: iload #6
		// @16: iadd
		// @17: iload_1
		// @18: iload_3
		// @19: iadd
		// @1A: iload #6
		// @1C: iadd
		// @1D: iload_2
		// @1E: iload #4
		// @20: iload #5
		// @22: invokestatic game.C_100196_rb.func_105800_f(int, int, int, int, int)void
		// @25: iload_0
		// @26: iload_2
		// @27: iadd
		// @28: iload #6
		// @2A: iadd
		// @2B: iload_1
		// @2C: iload #6
		// @2E: iadd
		// @2F: iload_3
		// @30: iconst_1
		// @31: iadd
		// @32: iload #4
		// @34: iload #5
		// @36: invokestatic game.C_100196_rb.func_105805_b(int, int, int, int, int)void
		// @39: iinc #6 +1
		// @3C: goto @03
		// @3F: return
	}
	
	static final void func_105777_b(int[] arg0)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: iaload
		// @03: putstatic int game.C_100196_rb.field_105827_i
		// @06: aload_0
		// @07: iconst_1
		// @08: iaload
		// @09: putstatic int game.C_100196_rb.field_105816_f
		// @0C: aload_0
		// @0D: iconst_2
		// @0E: iaload
		// @0F: putstatic int game.C_100196_rb.field_105820_b
		// @12: aload_0
		// @13: iconst_3
		// @14: iaload
		// @15: putstatic int game.C_100196_rb.field_105823_l
		// @18: invokestatic game.C_100196_rb.func_105814_c()void
		// @1B: return
	}
	
	static final void func_105779_e(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: getstatic int game.C_100196_rb.field_105827_i
		// @03: iload_0
		// @04: if_icmpge @0B
		// @07: iload_0
		// @08: putstatic int game.C_100196_rb.field_105827_i
		// @0B: getstatic int game.C_100196_rb.field_105816_f
		// @0E: iload_1
		// @0F: if_icmpge @16
		// @12: iload_1
		// @13: putstatic int game.C_100196_rb.field_105816_f
		// @16: getstatic int game.C_100196_rb.field_105820_b
		// @19: iload_2
		// @1A: if_icmple @21
		// @1D: iload_2
		// @1E: putstatic int game.C_100196_rb.field_105820_b
		// @21: getstatic int game.C_100196_rb.field_105823_l
		// @24: iload_3
		// @25: if_icmple @2C
		// @28: iload_3
		// @29: putstatic int game.C_100196_rb.field_105823_l
		// @2C: invokestatic game.C_100196_rb.func_105814_c()void
		// @2F: return
	}
	
	private static final void func_105814_c()
	{
		// @0: aconst_null
		// @1: putstatic int[] game.C_100196_rb.field_105825_k
		// @4: aconst_null
		// @5: putstatic int[] game.C_100196_rb.field_105824_j
		// @8: return
	}
	
	static final void func_105785_e(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @000: iload_2
		// @001: iload_0
		// @002: isub
		// @003: istore_2
		// @004: iload_3
		// @005: iload_1
		// @006: isub
		// @007: istore_3
		// @008: iload_3
		// @009: ifne @02D
		// @00C: iload_2
		// @00D: iflt @01D
		// @010: iload_0
		// @011: iload_1
		// @012: iload_2
		// @013: iload #4
		// @015: iload #5
		// @017: invokestatic game.C_100196_rb.func_105800_f(int, int, int, int, int)void
		// @01A: goto @02C
		// @01D: iload_0
		// @01E: iload_2
		// @01F: iadd
		// @020: iconst_1
		// @021: iadd
		// @022: iload_1
		// @023: iload_2
		// @024: ineg
		// @025: iload #4
		// @027: iload #5
		// @029: invokestatic game.C_100196_rb.func_105800_f(int, int, int, int, int)void
		// @02C: return
		// @02D: iload_2
		// @02E: ifne @052
		// @031: iload_3
		// @032: iflt @042
		// @035: iload_0
		// @036: iload_1
		// @037: iload_3
		// @038: iload #4
		// @03A: iload #5
		// @03C: invokestatic game.C_100196_rb.func_105805_b(int, int, int, int, int)void
		// @03F: goto @051
		// @042: iload_0
		// @043: iload_1
		// @044: iload_3
		// @045: iadd
		// @046: iconst_1
		// @047: iadd
		// @048: iload_3
		// @049: ineg
		// @04A: iload #4
		// @04C: iload #5
		// @04E: invokestatic game.C_100196_rb.func_105805_b(int, int, int, int, int)void
		// @051: return
		// @052: iconst_0
		// @053: istore #6
		// @055: iload_2
		// @056: iload_3
		// @057: iadd
		// @058: ifge @06C
		// @05B: iload_0
		// @05C: iload_2
		// @05D: iadd
		// @05E: istore_0
		// @05F: iload_2
		// @060: ineg
		// @061: istore_2
		// @062: iload_1
		// @063: iload_3
		// @064: iadd
		// @065: istore_1
		// @066: iload_3
		// @067: ineg
		// @068: istore_3
		// @069: iconst_1
		// @06A: istore #6
		// @06C: sipush 256 (0x0100)
		// @06F: iload #5
		// @071: isub
		// @072: istore #7
		// @074: iload #4
		// @076: bipush 16 (0x10)
		// @078: ishr
		// @079: sipush 255 (0x00FF)
		// @07C: iand
		// @07D: iload #5
		// @07F: imul
		// @080: istore #8
		// @082: iload #4
		// @084: bipush 8 (0x08)
		// @086: ishr
		// @087: sipush 255 (0x00FF)
		// @08A: iand
		// @08B: iload #5
		// @08D: imul
		// @08E: istore #9
		// @090: iload #4
		// @092: sipush 255 (0x00FF)
		// @095: iand
		// @096: iload #5
		// @098: imul
		// @099: istore #10
		// @09B: iload_2
		// @09C: iload_3
		// @09D: if_icmple @18A
		// @0A0: iload_1
		// @0A1: bipush 16 (0x10)
		// @0A3: ishl
		// @0A4: istore_1
		// @0A5: iload_1
		// @0A6: ldc 32768 (0x8000)
		// @0A8: iadd
		// @0A9: istore_1
		// @0AA: iload_3
		// @0AB: bipush 16 (0x10)
		// @0AD: ishl
		// @0AE: istore_3
		// @0AF: iload_3
		// @0B0: i2d
		// @0B1: iload_2
		// @0B2: i2d
		// @0B3: ddiv
		// @0B4: ldc2_w 0.5
		// @0B7: dadd
		// @0B8: invokestatic java.lang.Math.floor(double)double
		// @0BB: d2i
		// @0BC: istore #11
		// @0BE: iload_2
		// @0BF: iload_0
		// @0C0: iadd
		// @0C1: istore_2
		// @0C2: iload #6
		// @0C4: ifeq @0CF
		// @0C7: iload_1
		// @0C8: iload #11
		// @0CA: iadd
		// @0CB: istore_1
		// @0CC: iinc #0 +1
		// @0CF: iload_0
		// @0D0: getstatic int game.C_100196_rb.field_105827_i
		// @0D3: if_icmpge @0E5
		// @0D6: iload_1
		// @0D7: iload #11
		// @0D9: getstatic int game.C_100196_rb.field_105827_i
		// @0DC: iload_0
		// @0DD: isub
		// @0DE: imul
		// @0DF: iadd
		// @0E0: istore_1
		// @0E1: getstatic int game.C_100196_rb.field_105827_i
		// @0E4: istore_0
		// @0E5: iload_2
		// @0E6: getstatic int game.C_100196_rb.field_105820_b
		// @0E9: if_icmplt @0F2
		// @0EC: getstatic int game.C_100196_rb.field_105820_b
		// @0EF: iconst_1
		// @0F0: isub
		// @0F1: istore_2
		// @0F2: iload #6
		// @0F4: ifne @0FA
		// @0F7: iinc #2 +255
		// @0FA: iload_0
		// @0FB: iload_2
		// @0FC: if_icmpgt @187
		// @0FF: iload_1
		// @100: bipush 16 (0x10)
		// @102: ishr
		// @103: istore #12
		// @105: iload #12
		// @107: getstatic int game.C_100196_rb.field_105816_f
		// @10A: if_icmplt @17C
		// @10D: iload #12
		// @10F: getstatic int game.C_100196_rb.field_105823_l
		// @112: if_icmpge @17C
		// @115: iload_0
		// @116: iload #12
		// @118: getstatic int game.C_100196_rb.field_105819_e
		// @11B: imul
		// @11C: iadd
		// @11D: istore #13
		// @11F: getstatic int[] game.C_100196_rb.field_105818_d
		// @122: iload #13
		// @124: iaload
		// @125: bipush 16 (0x10)
		// @127: ishr
		// @128: sipush 255 (0x00FF)
		// @12B: iand
		// @12C: iload #7
		// @12E: imul
		// @12F: istore #14
		// @131: getstatic int[] game.C_100196_rb.field_105818_d
		// @134: iload #13
		// @136: iaload
		// @137: bipush 8 (0x08)
		// @139: ishr
		// @13A: sipush 255 (0x00FF)
		// @13D: iand
		// @13E: iload #7
		// @140: imul
		// @141: istore #15
		// @143: getstatic int[] game.C_100196_rb.field_105818_d
		// @146: iload #13
		// @148: iaload
		// @149: sipush 255 (0x00FF)
		// @14C: iand
		// @14D: iload #7
		// @14F: imul
		// @150: istore #16
		// @152: iload #8
		// @154: iload #14
		// @156: iadd
		// @157: bipush 8 (0x08)
		// @159: ishr
		// @15A: bipush 16 (0x10)
		// @15C: ishl
		// @15D: iload #9
		// @15F: iload #15
		// @161: iadd
		// @162: bipush 8 (0x08)
		// @164: ishr
		// @165: bipush 8 (0x08)
		// @167: ishl
		// @168: iadd
		// @169: iload #10
		// @16B: iload #16
		// @16D: iadd
		// @16E: bipush 8 (0x08)
		// @170: ishr
		// @171: iadd
		// @172: istore #17
		// @174: getstatic int[] game.C_100196_rb.field_105818_d
		// @177: iload #13
		// @179: iload #17
		// @17B: iastore
		// @17C: iload_1
		// @17D: iload #11
		// @17F: iadd
		// @180: istore_1
		// @181: iinc #0 +1
		// @184: goto @0FA
		// @187: goto @271
		// @18A: iload_0
		// @18B: bipush 16 (0x10)
		// @18D: ishl
		// @18E: istore_0
		// @18F: iload_0
		// @190: ldc 32768 (0x8000)
		// @192: iadd
		// @193: istore_0
		// @194: iload_2
		// @195: bipush 16 (0x10)
		// @197: ishl
		// @198: istore_2
		// @199: iload_2
		// @19A: i2d
		// @19B: iload_3
		// @19C: i2d
		// @19D: ddiv
		// @19E: ldc2_w 0.5
		// @1A1: dadd
		// @1A2: invokestatic java.lang.Math.floor(double)double
		// @1A5: d2i
		// @1A6: istore #11
		// @1A8: iload_3
		// @1A9: iload_1
		// @1AA: iadd
		// @1AB: istore_3
		// @1AC: iload #6
		// @1AE: ifeq @1B9
		// @1B1: iload_0
		// @1B2: iload #11
		// @1B4: iadd
		// @1B5: istore_0
		// @1B6: iinc #1 +1
		// @1B9: iload_1
		// @1BA: getstatic int game.C_100196_rb.field_105816_f
		// @1BD: if_icmpge @1CF
		// @1C0: iload_0
		// @1C1: iload #11
		// @1C3: getstatic int game.C_100196_rb.field_105816_f
		// @1C6: iload_1
		// @1C7: isub
		// @1C8: imul
		// @1C9: iadd
		// @1CA: istore_0
		// @1CB: getstatic int game.C_100196_rb.field_105816_f
		// @1CE: istore_1
		// @1CF: iload_3
		// @1D0: getstatic int game.C_100196_rb.field_105823_l
		// @1D3: if_icmplt @1DC
		// @1D6: getstatic int game.C_100196_rb.field_105823_l
		// @1D9: iconst_1
		// @1DA: isub
		// @1DB: istore_3
		// @1DC: iload #6
		// @1DE: ifne @1E4
		// @1E1: iinc #3 +255
		// @1E4: iload_1
		// @1E5: iload_3
		// @1E6: if_icmpgt @271
		// @1E9: iload_0
		// @1EA: bipush 16 (0x10)
		// @1EC: ishr
		// @1ED: istore #12
		// @1EF: iload #12
		// @1F1: getstatic int game.C_100196_rb.field_105827_i
		// @1F4: if_icmplt @266
		// @1F7: iload #12
		// @1F9: getstatic int game.C_100196_rb.field_105820_b
		// @1FC: if_icmpge @266
		// @1FF: iload #12
		// @201: iload_1
		// @202: getstatic int game.C_100196_rb.field_105819_e
		// @205: imul
		// @206: iadd
		// @207: istore #13
		// @209: getstatic int[] game.C_100196_rb.field_105818_d
		// @20C: iload #13
		// @20E: iaload
		// @20F: bipush 16 (0x10)
		// @211: ishr
		// @212: sipush 255 (0x00FF)
		// @215: iand
		// @216: iload #7
		// @218: imul
		// @219: istore #14
		// @21B: getstatic int[] game.C_100196_rb.field_105818_d
		// @21E: iload #13
		// @220: iaload
		// @221: bipush 8 (0x08)
		// @223: ishr
		// @224: sipush 255 (0x00FF)
		// @227: iand
		// @228: iload #7
		// @22A: imul
		// @22B: istore #15
		// @22D: getstatic int[] game.C_100196_rb.field_105818_d
		// @230: iload #13
		// @232: iaload
		// @233: sipush 255 (0x00FF)
		// @236: iand
		// @237: iload #7
		// @239: imul
		// @23A: istore #16
		// @23C: iload #8
		// @23E: iload #14
		// @240: iadd
		// @241: bipush 8 (0x08)
		// @243: ishr
		// @244: bipush 16 (0x10)
		// @246: ishl
		// @247: iload #9
		// @249: iload #15
		// @24B: iadd
		// @24C: bipush 8 (0x08)
		// @24E: ishr
		// @24F: bipush 8 (0x08)
		// @251: ishl
		// @252: iadd
		// @253: iload #10
		// @255: iload #16
		// @257: iadd
		// @258: bipush 8 (0x08)
		// @25A: ishr
		// @25B: iadd
		// @25C: istore #17
		// @25E: getstatic int[] game.C_100196_rb.field_105818_d
		// @261: iload #13
		// @263: iload #17
		// @265: iastore
		// @266: iload_0
		// @267: iload #11
		// @269: iadd
		// @26A: istore_0
		// @26B: iinc #1 +1
		// @26E: goto @1E4
		// @271: return
	}
	
	static final void func_105792_b()
	{
		// @00: iconst_0
		// @01: istore_0
		// @02: getstatic int game.C_100196_rb.field_105819_e
		// @05: getstatic int game.C_100196_rb.field_105821_c
		// @08: imul
		// @09: bipush 7 (0x07)
		// @0B: isub
		// @0C: istore_1
		// @0D: iload_0
		// @0E: iload_1
		// @0F: if_icmpge @5D
		// @12: getstatic int[] game.C_100196_rb.field_105818_d
		// @15: iload_0
		// @16: iinc #0 +1
		// @19: iconst_0
		// @1A: iastore
		// @1B: getstatic int[] game.C_100196_rb.field_105818_d
		// @1E: iload_0
		// @1F: iinc #0 +1
		// @22: iconst_0
		// @23: iastore
		// @24: getstatic int[] game.C_100196_rb.field_105818_d
		// @27: iload_0
		// @28: iinc #0 +1
		// @2B: iconst_0
		// @2C: iastore
		// @2D: getstatic int[] game.C_100196_rb.field_105818_d
		// @30: iload_0
		// @31: iinc #0 +1
		// @34: iconst_0
		// @35: iastore
		// @36: getstatic int[] game.C_100196_rb.field_105818_d
		// @39: iload_0
		// @3A: iinc #0 +1
		// @3D: iconst_0
		// @3E: iastore
		// @3F: getstatic int[] game.C_100196_rb.field_105818_d
		// @42: iload_0
		// @43: iinc #0 +1
		// @46: iconst_0
		// @47: iastore
		// @48: getstatic int[] game.C_100196_rb.field_105818_d
		// @4B: iload_0
		// @4C: iinc #0 +1
		// @4F: iconst_0
		// @50: iastore
		// @51: getstatic int[] game.C_100196_rb.field_105818_d
		// @54: iload_0
		// @55: iinc #0 +1
		// @58: iconst_0
		// @59: iastore
		// @5A: goto @0D
		// @5D: iinc #1 +7
		// @60: iload_0
		// @61: iload_1
		// @62: if_icmpge @71
		// @65: getstatic int[] game.C_100196_rb.field_105818_d
		// @68: iload_0
		// @69: iinc #0 +1
		// @6C: iconst_0
		// @6D: iastore
		// @6E: goto @60
		// @71: return
	}
	
	private static final void func_105791_d(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: iload_0
		// @01: getstatic int game.C_100196_rb.field_105827_i
		// @04: if_icmplt @0E
		// @07: iload_0
		// @08: getstatic int game.C_100196_rb.field_105820_b
		// @0B: if_icmplt @0F
		// @0E: return
		// @0F: iload_1
		// @10: getstatic int game.C_100196_rb.field_105816_f
		// @13: if_icmpge @22
		// @16: iload_2
		// @17: getstatic int game.C_100196_rb.field_105816_f
		// @1A: iload_1
		// @1B: isub
		// @1C: isub
		// @1D: istore_2
		// @1E: getstatic int game.C_100196_rb.field_105816_f
		// @21: istore_1
		// @22: iload_1
		// @23: iload_2
		// @24: iadd
		// @25: getstatic int game.C_100196_rb.field_105823_l
		// @28: if_icmple @31
		// @2B: getstatic int game.C_100196_rb.field_105823_l
		// @2E: iload_1
		// @2F: isub
		// @30: istore_2
		// @31: iload_0
		// @32: iload_1
		// @33: getstatic int game.C_100196_rb.field_105819_e
		// @36: imul
		// @37: iadd
		// @38: istore #5
		// @3A: iload_3
		// @3B: ldc 16711935 (0xff00ff)
		// @3D: iand
		// @3E: iload #4
		// @40: imul
		// @41: istore #6
		// @43: iload #6
		// @45: ldc -16711936 (0xff00ff00)
		// @47: iand
		// @48: iload_3
		// @49: iload #4
		// @4B: imul
		// @4C: iload #6
		// @4E: isub
		// @4F: ldc 16711680 (0xff0000)
		// @51: iand
		// @52: iadd
		// @53: bipush 8 (0x08)
		// @55: iushr
		// @56: istore_3
		// @57: iconst_0
		// @58: istore #7
		// @5A: iload #7
		// @5C: iload_2
		// @5D: if_icmpge @AC
		// @60: getstatic int[] game.C_100196_rb.field_105818_d
		// @63: iload #5
		// @65: iaload
		// @66: istore #6
		// @68: iload_3
		// @69: iload #6
		// @6B: iadd
		// @6C: istore #8
		// @6E: iload_3
		// @6F: ldc 16711935 (0xff00ff)
		// @71: iand
		// @72: iload #6
		// @74: ldc 16711935 (0xff00ff)
		// @76: iand
		// @77: iadd
		// @78: istore #9
		// @7A: iload #9
		// @7C: ldc 16777472 (0x1000100)
		// @7E: iand
		// @7F: iload #8
		// @81: iload #9
		// @83: isub
		// @84: ldc 65536 (0x10000)
		// @86: iand
		// @87: iadd
		// @88: istore #6
		// @8A: getstatic int[] game.C_100196_rb.field_105818_d
		// @8D: iload #5
		// @8F: iload #8
		// @91: iload #6
		// @93: isub
		// @94: iload #6
		// @96: iload #6
		// @98: bipush 8 (0x08)
		// @9A: iushr
		// @9B: isub
		// @9C: ior
		// @9D: iastore
		// @9E: iload #5
		// @A0: getstatic int game.C_100196_rb.field_105819_e
		// @A3: iadd
		// @A4: istore #5
		// @A6: iinc #7 +1
		// @A9: goto @5A
		// @AC: return
	}
	
	private static final void func_105794_a(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: iload_1
		// @01: getstatic int game.C_100196_rb.field_105816_f
		// @04: if_icmplt @0E
		// @07: iload_1
		// @08: getstatic int game.C_100196_rb.field_105823_l
		// @0B: if_icmplt @0F
		// @0E: return
		// @0F: iload_0
		// @10: getstatic int game.C_100196_rb.field_105827_i
		// @13: if_icmpge @22
		// @16: iload_2
		// @17: getstatic int game.C_100196_rb.field_105827_i
		// @1A: iload_0
		// @1B: isub
		// @1C: isub
		// @1D: istore_2
		// @1E: getstatic int game.C_100196_rb.field_105827_i
		// @21: istore_0
		// @22: iload_0
		// @23: iload_2
		// @24: iadd
		// @25: getstatic int game.C_100196_rb.field_105820_b
		// @28: if_icmple @31
		// @2B: getstatic int game.C_100196_rb.field_105820_b
		// @2E: iload_0
		// @2F: isub
		// @30: istore_2
		// @31: iload_0
		// @32: iload_1
		// @33: getstatic int game.C_100196_rb.field_105819_e
		// @36: imul
		// @37: iadd
		// @38: istore #5
		// @3A: iload_3
		// @3B: ldc 16711935 (0xff00ff)
		// @3D: iand
		// @3E: iload #4
		// @40: imul
		// @41: istore #6
		// @43: iload #6
		// @45: ldc -16711936 (0xff00ff00)
		// @47: iand
		// @48: iload_3
		// @49: iload #4
		// @4B: imul
		// @4C: iload #6
		// @4E: isub
		// @4F: ldc 16711680 (0xff0000)
		// @51: iand
		// @52: iadd
		// @53: bipush 8 (0x08)
		// @55: iushr
		// @56: istore_3
		// @57: iconst_0
		// @58: istore #7
		// @5A: iload #7
		// @5C: iload_2
		// @5D: if_icmpge @A7
		// @60: getstatic int[] game.C_100196_rb.field_105818_d
		// @63: iload #5
		// @65: iaload
		// @66: istore #6
		// @68: iload_3
		// @69: iload #6
		// @6B: iadd
		// @6C: istore #8
		// @6E: iload_3
		// @6F: ldc 16711935 (0xff00ff)
		// @71: iand
		// @72: iload #6
		// @74: ldc 16711935 (0xff00ff)
		// @76: iand
		// @77: iadd
		// @78: istore #6
		// @7A: iload #6
		// @7C: ldc 16777472 (0x1000100)
		// @7E: iand
		// @7F: iload #8
		// @81: iload #6
		// @83: isub
		// @84: ldc 65536 (0x10000)
		// @86: iand
		// @87: iadd
		// @88: istore #6
		// @8A: getstatic int[] game.C_100196_rb.field_105818_d
		// @8D: iload #5
		// @8F: iinc #5 +1
		// @92: iload #8
		// @94: iload #6
		// @96: isub
		// @97: iload #6
		// @99: iload #6
		// @9B: bipush 8 (0x08)
		// @9D: iushr
		// @9E: isub
		// @9F: ior
		// @A0: iastore
		// @A1: iinc #7 +1
		// @A4: goto @5A
		// @A7: return
	}
	
	static final void func_105802_e(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @000: iload_2
		// @001: iload_0
		// @002: isub
		// @003: istore_2
		// @004: iload_3
		// @005: iload_1
		// @006: isub
		// @007: istore_3
		// @008: iload_3
		// @009: ifne @02B
		// @00C: iload_2
		// @00D: iflt @01D
		// @010: iload_0
		// @011: iload_1
		// @012: iload_2
		// @013: iconst_1
		// @014: iadd
		// @015: iload #4
		// @017: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @01A: goto @02A
		// @01D: iload_0
		// @01E: iload_2
		// @01F: iadd
		// @020: iload_1
		// @021: iload_2
		// @022: ineg
		// @023: iconst_1
		// @024: iadd
		// @025: iload #4
		// @027: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @02A: return
		// @02B: iload_2
		// @02C: ifne @04E
		// @02F: iload_3
		// @030: iflt @040
		// @033: iload_0
		// @034: iload_1
		// @035: iload_3
		// @036: iconst_1
		// @037: iadd
		// @038: iload #4
		// @03A: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @03D: goto @04D
		// @040: iload_0
		// @041: iload_1
		// @042: iload_3
		// @043: iadd
		// @044: iload_3
		// @045: ineg
		// @046: iconst_1
		// @047: iadd
		// @048: iload #4
		// @04A: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @04D: return
		// @04E: iload_2
		// @04F: iload_3
		// @050: iadd
		// @051: ifge @062
		// @054: iload_0
		// @055: iload_2
		// @056: iadd
		// @057: istore_0
		// @058: iload_2
		// @059: ineg
		// @05A: istore_2
		// @05B: iload_1
		// @05C: iload_3
		// @05D: iadd
		// @05E: istore_1
		// @05F: iload_3
		// @060: ineg
		// @061: istore_3
		// @062: iload_2
		// @063: iload_3
		// @064: if_icmple @0E3
		// @067: iload_1
		// @068: bipush 16 (0x10)
		// @06A: ishl
		// @06B: istore_1
		// @06C: iload_1
		// @06D: ldc 32768 (0x8000)
		// @06F: iadd
		// @070: istore_1
		// @071: iload_3
		// @072: bipush 16 (0x10)
		// @074: ishl
		// @075: istore_3
		// @076: iload_3
		// @077: i2d
		// @078: iload_2
		// @079: i2d
		// @07A: ddiv
		// @07B: ldc2_w 0.5
		// @07E: dadd
		// @07F: invokestatic java.lang.Math.floor(double)double
		// @082: d2i
		// @083: istore #5
		// @085: iload_2
		// @086: iload_0
		// @087: iadd
		// @088: istore_2
		// @089: iload_0
		// @08A: getstatic int game.C_100196_rb.field_105827_i
		// @08D: if_icmpge @09F
		// @090: iload_1
		// @091: iload #5
		// @093: getstatic int game.C_100196_rb.field_105827_i
		// @096: iload_0
		// @097: isub
		// @098: imul
		// @099: iadd
		// @09A: istore_1
		// @09B: getstatic int game.C_100196_rb.field_105827_i
		// @09E: istore_0
		// @09F: iload_2
		// @0A0: getstatic int game.C_100196_rb.field_105820_b
		// @0A3: if_icmplt @0AC
		// @0A6: getstatic int game.C_100196_rb.field_105820_b
		// @0A9: iconst_1
		// @0AA: isub
		// @0AB: istore_2
		// @0AC: iload_0
		// @0AD: iload_2
		// @0AE: if_icmpgt @0E0
		// @0B1: iload_1
		// @0B2: bipush 16 (0x10)
		// @0B4: ishr
		// @0B5: istore #6
		// @0B7: iload #6
		// @0B9: getstatic int game.C_100196_rb.field_105816_f
		// @0BC: if_icmplt @0D5
		// @0BF: iload #6
		// @0C1: getstatic int game.C_100196_rb.field_105823_l
		// @0C4: if_icmpge @0D5
		// @0C7: getstatic int[] game.C_100196_rb.field_105818_d
		// @0CA: iload_0
		// @0CB: iload #6
		// @0CD: getstatic int game.C_100196_rb.field_105819_e
		// @0D0: imul
		// @0D1: iadd
		// @0D2: iload #4
		// @0D4: iastore
		// @0D5: iload_1
		// @0D6: iload #5
		// @0D8: iadd
		// @0D9: istore_1
		// @0DA: iinc #0 +1
		// @0DD: goto @0AC
		// @0E0: goto @15C
		// @0E3: iload_0
		// @0E4: bipush 16 (0x10)
		// @0E6: ishl
		// @0E7: istore_0
		// @0E8: iload_0
		// @0E9: ldc 32768 (0x8000)
		// @0EB: iadd
		// @0EC: istore_0
		// @0ED: iload_2
		// @0EE: bipush 16 (0x10)
		// @0F0: ishl
		// @0F1: istore_2
		// @0F2: iload_2
		// @0F3: i2d
		// @0F4: iload_3
		// @0F5: i2d
		// @0F6: ddiv
		// @0F7: ldc2_w 0.5
		// @0FA: dadd
		// @0FB: invokestatic java.lang.Math.floor(double)double
		// @0FE: d2i
		// @0FF: istore #5
		// @101: iload_3
		// @102: iload_1
		// @103: iadd
		// @104: istore_3
		// @105: iload_1
		// @106: getstatic int game.C_100196_rb.field_105816_f
		// @109: if_icmpge @11B
		// @10C: iload_0
		// @10D: iload #5
		// @10F: getstatic int game.C_100196_rb.field_105816_f
		// @112: iload_1
		// @113: isub
		// @114: imul
		// @115: iadd
		// @116: istore_0
		// @117: getstatic int game.C_100196_rb.field_105816_f
		// @11A: istore_1
		// @11B: iload_3
		// @11C: getstatic int game.C_100196_rb.field_105823_l
		// @11F: if_icmplt @128
		// @122: getstatic int game.C_100196_rb.field_105823_l
		// @125: iconst_1
		// @126: isub
		// @127: istore_3
		// @128: iload_1
		// @129: iload_3
		// @12A: if_icmpgt @15C
		// @12D: iload_0
		// @12E: bipush 16 (0x10)
		// @130: ishr
		// @131: istore #6
		// @133: iload #6
		// @135: getstatic int game.C_100196_rb.field_105827_i
		// @138: if_icmplt @151
		// @13B: iload #6
		// @13D: getstatic int game.C_100196_rb.field_105820_b
		// @140: if_icmpge @151
		// @143: getstatic int[] game.C_100196_rb.field_105818_d
		// @146: iload #6
		// @148: iload_1
		// @149: getstatic int game.C_100196_rb.field_105819_e
		// @14C: imul
		// @14D: iadd
		// @14E: iload #4
		// @150: iastore
		// @151: iload_0
		// @152: iload #5
		// @154: iadd
		// @155: istore_0
		// @156: iinc #1 +1
		// @159: goto @128
		// @15C: return
	}
	
	static final void func_105796_c(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @000: iload #4
		// @002: ifne @006
		// @005: return
		// @006: iload #4
		// @008: sipush 256 (0x0100)
		// @00B: if_icmpne @016
		// @00E: iload_0
		// @00F: iload_1
		// @010: iload_2
		// @011: iload_3
		// @012: invokestatic game.C_100196_rb.func_105795_d(int, int, int, int)void
		// @015: return
		// @016: iload_2
		// @017: ifge @01D
		// @01A: iload_2
		// @01B: ineg
		// @01C: istore_2
		// @01D: sipush 256 (0x0100)
		// @020: iload #4
		// @022: isub
		// @023: istore #5
		// @025: iload_3
		// @026: bipush 16 (0x10)
		// @028: ishr
		// @029: sipush 255 (0x00FF)
		// @02C: iand
		// @02D: iload #4
		// @02F: imul
		// @030: istore #6
		// @032: iload_3
		// @033: bipush 8 (0x08)
		// @035: ishr
		// @036: sipush 255 (0x00FF)
		// @039: iand
		// @03A: iload #4
		// @03C: imul
		// @03D: istore #7
		// @03F: iload_3
		// @040: sipush 255 (0x00FF)
		// @043: iand
		// @044: iload #4
		// @046: imul
		// @047: istore #8
		// @049: iload_1
		// @04A: iload_2
		// @04B: isub
		// @04C: istore #12
		// @04E: iload #12
		// @050: getstatic int game.C_100196_rb.field_105816_f
		// @053: if_icmpge @05B
		// @056: getstatic int game.C_100196_rb.field_105816_f
		// @059: istore #12
		// @05B: iload_1
		// @05C: iload_2
		// @05D: iadd
		// @05E: iconst_1
		// @05F: iadd
		// @060: istore #13
		// @062: iload #13
		// @064: getstatic int game.C_100196_rb.field_105823_l
		// @067: if_icmple @06F
		// @06A: getstatic int game.C_100196_rb.field_105823_l
		// @06D: istore #13
		// @06F: iload #12
		// @071: istore #14
		// @073: iload_2
		// @074: iload_2
		// @075: imul
		// @076: istore #15
		// @078: iconst_0
		// @079: istore #16
		// @07B: iload_1
		// @07C: iload #14
		// @07E: isub
		// @07F: istore #17
		// @081: iload #17
		// @083: iload #17
		// @085: imul
		// @086: istore #18
		// @088: iload #18
		// @08A: iload #17
		// @08C: isub
		// @08D: istore #19
		// @08F: iload_1
		// @090: iload #13
		// @092: if_icmple @098
		// @095: iload #13
		// @097: istore_1
		// @098: iload #14
		// @09A: iload_1
		// @09B: if_icmpge @187
		// @09E: iload #19
		// @0A0: iload #15
		// @0A2: if_icmple @0AC
		// @0A5: iload #18
		// @0A7: iload #15
		// @0A9: if_icmpgt @0C6
		// @0AC: iload #18
		// @0AE: iload #16
		// @0B0: iload #16
		// @0B2: iadd
		// @0B3: iadd
		// @0B4: istore #18
		// @0B6: iload #19
		// @0B8: iload #16
		// @0BA: iinc #16 +1
		// @0BD: iload #16
		// @0BF: iadd
		// @0C0: iadd
		// @0C1: istore #19
		// @0C3: goto @09E
		// @0C6: iload_0
		// @0C7: iload #16
		// @0C9: isub
		// @0CA: iconst_1
		// @0CB: iadd
		// @0CC: istore #20
		// @0CE: iload #20
		// @0D0: getstatic int game.C_100196_rb.field_105827_i
		// @0D3: if_icmpge @0DB
		// @0D6: getstatic int game.C_100196_rb.field_105827_i
		// @0D9: istore #20
		// @0DB: iload_0
		// @0DC: iload #16
		// @0DE: iadd
		// @0DF: istore #21
		// @0E1: iload #21
		// @0E3: getstatic int game.C_100196_rb.field_105820_b
		// @0E6: if_icmple @0EE
		// @0E9: getstatic int game.C_100196_rb.field_105820_b
		// @0EC: istore #21
		// @0EE: iload #20
		// @0F0: iload #14
		// @0F2: getstatic int game.C_100196_rb.field_105819_e
		// @0F5: imul
		// @0F6: iadd
		// @0F7: istore #22
		// @0F9: iload #20
		// @0FB: istore #23
		// @0FD: iload #23
		// @0FF: iload #21
		// @101: if_icmpge @16A
		// @104: getstatic int[] game.C_100196_rb.field_105818_d
		// @107: iload #22
		// @109: iaload
		// @10A: bipush 16 (0x10)
		// @10C: ishr
		// @10D: sipush 255 (0x00FF)
		// @110: iand
		// @111: iload #5
		// @113: imul
		// @114: istore #9
		// @116: getstatic int[] game.C_100196_rb.field_105818_d
		// @119: iload #22
		// @11B: iaload
		// @11C: bipush 8 (0x08)
		// @11E: ishr
		// @11F: sipush 255 (0x00FF)
		// @122: iand
		// @123: iload #5
		// @125: imul
		// @126: istore #10
		// @128: getstatic int[] game.C_100196_rb.field_105818_d
		// @12B: iload #22
		// @12D: iaload
		// @12E: sipush 255 (0x00FF)
		// @131: iand
		// @132: iload #5
		// @134: imul
		// @135: istore #11
		// @137: iload #6
		// @139: iload #9
		// @13B: iadd
		// @13C: bipush 8 (0x08)
		// @13E: ishr
		// @13F: bipush 16 (0x10)
		// @141: ishl
		// @142: iload #7
		// @144: iload #10
		// @146: iadd
		// @147: bipush 8 (0x08)
		// @149: ishr
		// @14A: bipush 8 (0x08)
		// @14C: ishl
		// @14D: iadd
		// @14E: iload #8
		// @150: iload #11
		// @152: iadd
		// @153: bipush 8 (0x08)
		// @155: ishr
		// @156: iadd
		// @157: istore #24
		// @159: getstatic int[] game.C_100196_rb.field_105818_d
		// @15C: iload #22
		// @15E: iinc #22 +1
		// @161: iload #24
		// @163: iastore
		// @164: iinc #23 +1
		// @167: goto @0FD
		// @16A: iinc #14 +1
		// @16D: iload #18
		// @16F: iload #17
		// @171: iinc #17 +255
		// @174: iload #17
		// @176: iadd
		// @177: isub
		// @178: istore #18
		// @17A: iload #19
		// @17C: iload #17
		// @17E: iload #17
		// @180: iadd
		// @181: isub
		// @182: istore #19
		// @184: goto @098
		// @187: iload_2
		// @188: istore #16
		// @18A: iload #17
		// @18C: ineg
		// @18D: istore #17
		// @18F: iload #17
		// @191: iload #17
		// @193: imul
		// @194: iload #15
		// @196: iadd
		// @197: istore #19
		// @199: iload #19
		// @19B: iload #16
		// @19D: isub
		// @19E: istore #18
		// @1A0: iload #19
		// @1A2: iload #17
		// @1A4: isub
		// @1A5: istore #19
		// @1A7: iload #14
		// @1A9: iload #13
		// @1AB: if_icmpge @299
		// @1AE: iload #19
		// @1B0: iload #15
		// @1B2: if_icmple @1D6
		// @1B5: iload #18
		// @1B7: iload #15
		// @1B9: if_icmple @1D6
		// @1BC: iload #19
		// @1BE: iload #16
		// @1C0: iinc #16 +255
		// @1C3: iload #16
		// @1C5: iadd
		// @1C6: isub
		// @1C7: istore #19
		// @1C9: iload #18
		// @1CB: iload #16
		// @1CD: iload #16
		// @1CF: iadd
		// @1D0: isub
		// @1D1: istore #18
		// @1D3: goto @1AE
		// @1D6: iload_0
		// @1D7: iload #16
		// @1D9: isub
		// @1DA: istore #20
		// @1DC: iload #20
		// @1DE: getstatic int game.C_100196_rb.field_105827_i
		// @1E1: if_icmpge @1E9
		// @1E4: getstatic int game.C_100196_rb.field_105827_i
		// @1E7: istore #20
		// @1E9: iload_0
		// @1EA: iload #16
		// @1EC: iadd
		// @1ED: istore #21
		// @1EF: iload #21
		// @1F1: getstatic int game.C_100196_rb.field_105820_b
		// @1F4: iconst_1
		// @1F5: isub
		// @1F6: if_icmple @200
		// @1F9: getstatic int game.C_100196_rb.field_105820_b
		// @1FC: iconst_1
		// @1FD: isub
		// @1FE: istore #21
		// @200: iload #20
		// @202: iload #14
		// @204: getstatic int game.C_100196_rb.field_105819_e
		// @207: imul
		// @208: iadd
		// @209: istore #22
		// @20B: iload #20
		// @20D: istore #23
		// @20F: iload #23
		// @211: iload #21
		// @213: if_icmpgt @27C
		// @216: getstatic int[] game.C_100196_rb.field_105818_d
		// @219: iload #22
		// @21B: iaload
		// @21C: bipush 16 (0x10)
		// @21E: ishr
		// @21F: sipush 255 (0x00FF)
		// @222: iand
		// @223: iload #5
		// @225: imul
		// @226: istore #9
		// @228: getstatic int[] game.C_100196_rb.field_105818_d
		// @22B: iload #22
		// @22D: iaload
		// @22E: bipush 8 (0x08)
		// @230: ishr
		// @231: sipush 255 (0x00FF)
		// @234: iand
		// @235: iload #5
		// @237: imul
		// @238: istore #10
		// @23A: getstatic int[] game.C_100196_rb.field_105818_d
		// @23D: iload #22
		// @23F: iaload
		// @240: sipush 255 (0x00FF)
		// @243: iand
		// @244: iload #5
		// @246: imul
		// @247: istore #11
		// @249: iload #6
		// @24B: iload #9
		// @24D: iadd
		// @24E: bipush 8 (0x08)
		// @250: ishr
		// @251: bipush 16 (0x10)
		// @253: ishl
		// @254: iload #7
		// @256: iload #10
		// @258: iadd
		// @259: bipush 8 (0x08)
		// @25B: ishr
		// @25C: bipush 8 (0x08)
		// @25E: ishl
		// @25F: iadd
		// @260: iload #8
		// @262: iload #11
		// @264: iadd
		// @265: bipush 8 (0x08)
		// @267: ishr
		// @268: iadd
		// @269: istore #24
		// @26B: getstatic int[] game.C_100196_rb.field_105818_d
		// @26E: iload #22
		// @270: iinc #22 +1
		// @273: iload #24
		// @275: iastore
		// @276: iinc #23 +1
		// @279: goto @20F
		// @27C: iinc #14 +1
		// @27F: iload #19
		// @281: iload #17
		// @283: iload #17
		// @285: iadd
		// @286: iadd
		// @287: istore #19
		// @289: iload #18
		// @28B: iload #17
		// @28D: iinc #17 +1
		// @290: iload #17
		// @292: iadd
		// @293: iadd
		// @294: istore #18
		// @296: goto @1A7
		// @299: return
	}
	
	static final void func_105809_f(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: iload_0
		// @01: getstatic int game.C_100196_rb.field_105827_i
		// @04: if_icmpge @13
		// @07: iload_2
		// @08: getstatic int game.C_100196_rb.field_105827_i
		// @0B: iload_0
		// @0C: isub
		// @0D: isub
		// @0E: istore_2
		// @0F: getstatic int game.C_100196_rb.field_105827_i
		// @12: istore_0
		// @13: iload_1
		// @14: getstatic int game.C_100196_rb.field_105816_f
		// @17: if_icmpge @26
		// @1A: iload_3
		// @1B: getstatic int game.C_100196_rb.field_105816_f
		// @1E: iload_1
		// @1F: isub
		// @20: isub
		// @21: istore_3
		// @22: getstatic int game.C_100196_rb.field_105816_f
		// @25: istore_1
		// @26: iload_0
		// @27: iload_2
		// @28: iadd
		// @29: getstatic int game.C_100196_rb.field_105820_b
		// @2C: if_icmple @35
		// @2F: getstatic int game.C_100196_rb.field_105820_b
		// @32: iload_0
		// @33: isub
		// @34: istore_2
		// @35: iload_1
		// @36: iload_3
		// @37: iadd
		// @38: getstatic int game.C_100196_rb.field_105823_l
		// @3B: if_icmple @44
		// @3E: getstatic int game.C_100196_rb.field_105823_l
		// @41: iload_1
		// @42: isub
		// @43: istore_3
		// @44: getstatic int game.C_100196_rb.field_105819_e
		// @47: iload_2
		// @48: isub
		// @49: istore #4
		// @4B: iload_0
		// @4C: iload_1
		// @4D: getstatic int game.C_100196_rb.field_105819_e
		// @50: imul
		// @51: iadd
		// @52: istore #5
		// @54: iload #5
		// @56: getstatic int[] game.C_100196_rb.field_105818_d
		// @59: iconst_0
		// @5A: iload_2
		// @5B: iload_3
		// @5C: ineg
		// @5D: iload #4
		// @5F: invokestatic game.C_100196_rb.func_105780_a(int, int[], int, int, int, int)void
		// @62: return
	}
	
	static final void func_105797_b(int arg0, int arg1, int arg2)
	{
		// @00: iload_0
		// @01: getstatic int game.C_100196_rb.field_105827_i
		// @04: if_icmplt @1C
		// @07: iload_1
		// @08: getstatic int game.C_100196_rb.field_105816_f
		// @0B: if_icmplt @1C
		// @0E: iload_0
		// @0F: getstatic int game.C_100196_rb.field_105820_b
		// @12: if_icmpge @1C
		// @15: iload_1
		// @16: getstatic int game.C_100196_rb.field_105823_l
		// @19: if_icmplt @1D
		// @1C: return
		// @1D: getstatic int[] game.C_100196_rb.field_105818_d
		// @20: iload_0
		// @21: iload_1
		// @22: getstatic int game.C_100196_rb.field_105819_e
		// @25: imul
		// @26: iadd
		// @27: iload_2
		// @28: iastore
		// @29: return
	}
	
	private static final void func_105780_a(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @00: iload #4
		// @02: ifge @A8
		// @05: iload_0
		// @06: iload_3
		// @07: iadd
		// @08: bipush 7 (0x07)
		// @0A: isub
		// @0B: istore_2
		// @0C: iload_0
		// @0D: iload_2
		// @0E: if_icmpge @84
		// @11: aload_1
		// @12: iload_0
		// @13: aload_1
		// @14: iload_0
		// @15: iaload
		// @16: ldc 16711422 (0xfefefe)
		// @18: iand
		// @19: iconst_1
		// @1A: ishr
		// @1B: iastore
		// @1C: iinc #0 +1
		// @1F: aload_1
		// @20: iload_0
		// @21: aload_1
		// @22: iload_0
		// @23: iaload
		// @24: ldc 16711422 (0xfefefe)
		// @26: iand
		// @27: iconst_1
		// @28: ishr
		// @29: iastore
		// @2A: iinc #0 +1
		// @2D: aload_1
		// @2E: iload_0
		// @2F: aload_1
		// @30: iload_0
		// @31: iaload
		// @32: ldc 16711422 (0xfefefe)
		// @34: iand
		// @35: iconst_1
		// @36: ishr
		// @37: iastore
		// @38: iinc #0 +1
		// @3B: aload_1
		// @3C: iload_0
		// @3D: aload_1
		// @3E: iload_0
		// @3F: iaload
		// @40: ldc 16711422 (0xfefefe)
		// @42: iand
		// @43: iconst_1
		// @44: ishr
		// @45: iastore
		// @46: iinc #0 +1
		// @49: aload_1
		// @4A: iload_0
		// @4B: aload_1
		// @4C: iload_0
		// @4D: iaload
		// @4E: ldc 16711422 (0xfefefe)
		// @50: iand
		// @51: iconst_1
		// @52: ishr
		// @53: iastore
		// @54: iinc #0 +1
		// @57: aload_1
		// @58: iload_0
		// @59: aload_1
		// @5A: iload_0
		// @5B: iaload
		// @5C: ldc 16711422 (0xfefefe)
		// @5E: iand
		// @5F: iconst_1
		// @60: ishr
		// @61: iastore
		// @62: iinc #0 +1
		// @65: aload_1
		// @66: iload_0
		// @67: aload_1
		// @68: iload_0
		// @69: iaload
		// @6A: ldc 16711422 (0xfefefe)
		// @6C: iand
		// @6D: iconst_1
		// @6E: ishr
		// @6F: iastore
		// @70: iinc #0 +1
		// @73: aload_1
		// @74: iload_0
		// @75: aload_1
		// @76: iload_0
		// @77: iaload
		// @78: ldc 16711422 (0xfefefe)
		// @7A: iand
		// @7B: iconst_1
		// @7C: ishr
		// @7D: iastore
		// @7E: iinc #0 +1
		// @81: goto @0C
		// @84: iinc #2 +7
		// @87: iload_0
		// @88: iload_2
		// @89: if_icmpge @9D
		// @8C: aload_1
		// @8D: iload_0
		// @8E: aload_1
		// @8F: iload_0
		// @90: iaload
		// @91: ldc 16711422 (0xfefefe)
		// @93: iand
		// @94: iconst_1
		// @95: ishr
		// @96: iastore
		// @97: iinc #0 +1
		// @9A: goto @87
		// @9D: iload_0
		// @9E: iload #5
		// @A0: iadd
		// @A1: istore_0
		// @A2: iinc #4 +1
		// @A5: goto @00
		// @A8: return
	}
	
	static final void func_105810_f(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @00: iload_0
		// @01: iload_1
		// @02: iload_2
		// @03: iload #4
		// @05: iload #5
		// @07: invokestatic game.C_100196_rb.func_105800_f(int, int, int, int, int)void
		// @0A: iload_0
		// @0B: iload_1
		// @0C: iload_3
		// @0D: iadd
		// @0E: iconst_1
		// @0F: isub
		// @10: iload_2
		// @11: iload #4
		// @13: iload #5
		// @15: invokestatic game.C_100196_rb.func_105800_f(int, int, int, int, int)void
		// @18: iload_3
		// @19: iconst_3
		// @1A: if_icmplt @3D
		// @1D: iload_0
		// @1E: iload_1
		// @1F: iconst_1
		// @20: iadd
		// @21: iload_3
		// @22: iconst_2
		// @23: isub
		// @24: iload #4
		// @26: iload #5
		// @28: invokestatic game.C_100196_rb.func_105805_b(int, int, int, int, int)void
		// @2B: iload_0
		// @2C: iload_2
		// @2D: iadd
		// @2E: iconst_1
		// @2F: isub
		// @30: iload_1
		// @31: iconst_1
		// @32: iadd
		// @33: iload_3
		// @34: iconst_2
		// @35: isub
		// @36: iload #4
		// @38: iload #5
		// @3A: invokestatic game.C_100196_rb.func_105805_b(int, int, int, int, int)void
		// @3D: return
	}
	
	static final void func_105805_b(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: iload_0
		// @01: getstatic int game.C_100196_rb.field_105827_i
		// @04: if_icmplt @0E
		// @07: iload_0
		// @08: getstatic int game.C_100196_rb.field_105820_b
		// @0B: if_icmplt @0F
		// @0E: return
		// @0F: iload_1
		// @10: getstatic int game.C_100196_rb.field_105816_f
		// @13: if_icmpge @22
		// @16: iload_2
		// @17: getstatic int game.C_100196_rb.field_105816_f
		// @1A: iload_1
		// @1B: isub
		// @1C: isub
		// @1D: istore_2
		// @1E: getstatic int game.C_100196_rb.field_105816_f
		// @21: istore_1
		// @22: iload_1
		// @23: iload_2
		// @24: iadd
		// @25: getstatic int game.C_100196_rb.field_105823_l
		// @28: if_icmple @31
		// @2B: getstatic int game.C_100196_rb.field_105823_l
		// @2E: iload_1
		// @2F: isub
		// @30: istore_2
		// @31: sipush 256 (0x0100)
		// @34: iload #4
		// @36: isub
		// @37: istore #5
		// @39: iload_3
		// @3A: bipush 16 (0x10)
		// @3C: ishr
		// @3D: sipush 255 (0x00FF)
		// @40: iand
		// @41: iload #4
		// @43: imul
		// @44: istore #6
		// @46: iload_3
		// @47: bipush 8 (0x08)
		// @49: ishr
		// @4A: sipush 255 (0x00FF)
		// @4D: iand
		// @4E: iload #4
		// @50: imul
		// @51: istore #7
		// @53: iload_3
		// @54: sipush 255 (0x00FF)
		// @57: iand
		// @58: iload #4
		// @5A: imul
		// @5B: istore #8
		// @5D: iload_0
		// @5E: iload_1
		// @5F: getstatic int game.C_100196_rb.field_105819_e
		// @62: imul
		// @63: iadd
		// @64: istore #12
		// @66: iconst_0
		// @67: istore #13
		// @69: iload #13
		// @6B: iload_2
		// @6C: if_icmpge @DA
		// @6F: getstatic int[] game.C_100196_rb.field_105818_d
		// @72: iload #12
		// @74: iaload
		// @75: bipush 16 (0x10)
		// @77: ishr
		// @78: sipush 255 (0x00FF)
		// @7B: iand
		// @7C: iload #5
		// @7E: imul
		// @7F: istore #9
		// @81: getstatic int[] game.C_100196_rb.field_105818_d
		// @84: iload #12
		// @86: iaload
		// @87: bipush 8 (0x08)
		// @89: ishr
		// @8A: sipush 255 (0x00FF)
		// @8D: iand
		// @8E: iload #5
		// @90: imul
		// @91: istore #10
		// @93: getstatic int[] game.C_100196_rb.field_105818_d
		// @96: iload #12
		// @98: iaload
		// @99: sipush 255 (0x00FF)
		// @9C: iand
		// @9D: iload #5
		// @9F: imul
		// @A0: istore #11
		// @A2: iload #6
		// @A4: iload #9
		// @A6: iadd
		// @A7: bipush 8 (0x08)
		// @A9: ishr
		// @AA: bipush 16 (0x10)
		// @AC: ishl
		// @AD: iload #7
		// @AF: iload #10
		// @B1: iadd
		// @B2: bipush 8 (0x08)
		// @B4: ishr
		// @B5: bipush 8 (0x08)
		// @B7: ishl
		// @B8: iadd
		// @B9: iload #8
		// @BB: iload #11
		// @BD: iadd
		// @BE: bipush 8 (0x08)
		// @C0: ishr
		// @C1: iadd
		// @C2: istore #14
		// @C4: getstatic int[] game.C_100196_rb.field_105818_d
		// @C7: iload #12
		// @C9: iload #14
		// @CB: iastore
		// @CC: iload #12
		// @CE: getstatic int game.C_100196_rb.field_105819_e
		// @D1: iadd
		// @D2: istore #12
		// @D4: iinc #13 +1
		// @D7: goto @69
		// @DA: return
	}
	
	static final void func_105801_a(int[] arg0)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: getstatic int game.C_100196_rb.field_105827_i
		// @05: iastore
		// @06: aload_0
		// @07: iconst_1
		// @08: getstatic int game.C_100196_rb.field_105816_f
		// @0B: iastore
		// @0C: aload_0
		// @0D: iconst_2
		// @0E: getstatic int game.C_100196_rb.field_105820_b
		// @11: iastore
		// @12: aload_0
		// @13: iconst_3
		// @14: getstatic int game.C_100196_rb.field_105823_l
		// @17: iastore
		// @18: return
	}
	
	static final void func_105788_c(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @000: iload_2
		// @001: iload_0
		// @002: isub
		// @003: istore_2
		// @004: iload_3
		// @005: iload_1
		// @006: isub
		// @007: istore_3
		// @008: iload_3
		// @009: ifne @02F
		// @00C: iload_2
		// @00D: iflt @01F
		// @010: iload_0
		// @011: iload_1
		// @012: iload_2
		// @013: iconst_1
		// @014: iadd
		// @015: iload #4
		// @017: iload #5
		// @019: invokestatic game.C_100196_rb.func_105800_f(int, int, int, int, int)void
		// @01C: goto @02E
		// @01F: iload_0
		// @020: iload_2
		// @021: iadd
		// @022: iload_1
		// @023: iload_2
		// @024: ineg
		// @025: iconst_1
		// @026: iadd
		// @027: iload #4
		// @029: iload #5
		// @02B: invokestatic game.C_100196_rb.func_105800_f(int, int, int, int, int)void
		// @02E: return
		// @02F: iload_2
		// @030: ifne @056
		// @033: iload_3
		// @034: iflt @046
		// @037: iload_0
		// @038: iload_1
		// @039: iload_3
		// @03A: iconst_1
		// @03B: iadd
		// @03C: iload #4
		// @03E: iload #5
		// @040: invokestatic game.C_100196_rb.func_105805_b(int, int, int, int, int)void
		// @043: goto @055
		// @046: iload_0
		// @047: iload_1
		// @048: iload_3
		// @049: iadd
		// @04A: iload_3
		// @04B: ineg
		// @04C: iconst_1
		// @04D: iadd
		// @04E: iload #4
		// @050: iload #5
		// @052: invokestatic game.C_100196_rb.func_105805_b(int, int, int, int, int)void
		// @055: return
		// @056: iload_2
		// @057: iload_3
		// @058: iadd
		// @059: ifge @06A
		// @05C: iload_0
		// @05D: iload_2
		// @05E: iadd
		// @05F: istore_0
		// @060: iload_2
		// @061: ineg
		// @062: istore_2
		// @063: iload_1
		// @064: iload_3
		// @065: iadd
		// @066: istore_1
		// @067: iload_3
		// @068: ineg
		// @069: istore_3
		// @06A: sipush 256 (0x0100)
		// @06D: iload #5
		// @06F: isub
		// @070: istore #6
		// @072: iload #4
		// @074: bipush 16 (0x10)
		// @076: ishr
		// @077: sipush 255 (0x00FF)
		// @07A: iand
		// @07B: iload #5
		// @07D: imul
		// @07E: istore #7
		// @080: iload #4
		// @082: bipush 8 (0x08)
		// @084: ishr
		// @085: sipush 255 (0x00FF)
		// @088: iand
		// @089: iload #5
		// @08B: imul
		// @08C: istore #8
		// @08E: iload #4
		// @090: sipush 255 (0x00FF)
		// @093: iand
		// @094: iload #5
		// @096: imul
		// @097: istore #9
		// @099: iload_2
		// @09A: iload_3
		// @09B: if_icmple @173
		// @09E: iload_1
		// @09F: bipush 16 (0x10)
		// @0A1: ishl
		// @0A2: istore_1
		// @0A3: iload_1
		// @0A4: ldc 32768 (0x8000)
		// @0A6: iadd
		// @0A7: istore_1
		// @0A8: iload_3
		// @0A9: bipush 16 (0x10)
		// @0AB: ishl
		// @0AC: istore_3
		// @0AD: iload_3
		// @0AE: i2d
		// @0AF: iload_2
		// @0B0: i2d
		// @0B1: ddiv
		// @0B2: ldc2_w 0.5
		// @0B5: dadd
		// @0B6: invokestatic java.lang.Math.floor(double)double
		// @0B9: d2i
		// @0BA: istore #10
		// @0BC: iload_2
		// @0BD: iload_0
		// @0BE: iadd
		// @0BF: istore_2
		// @0C0: iload_0
		// @0C1: getstatic int game.C_100196_rb.field_105827_i
		// @0C4: if_icmpge @0D6
		// @0C7: iload_1
		// @0C8: iload #10
		// @0CA: getstatic int game.C_100196_rb.field_105827_i
		// @0CD: iload_0
		// @0CE: isub
		// @0CF: imul
		// @0D0: iadd
		// @0D1: istore_1
		// @0D2: getstatic int game.C_100196_rb.field_105827_i
		// @0D5: istore_0
		// @0D6: iload_2
		// @0D7: getstatic int game.C_100196_rb.field_105820_b
		// @0DA: if_icmplt @0E3
		// @0DD: getstatic int game.C_100196_rb.field_105820_b
		// @0E0: iconst_1
		// @0E1: isub
		// @0E2: istore_2
		// @0E3: iload_0
		// @0E4: iload_2
		// @0E5: if_icmpgt @170
		// @0E8: iload_1
		// @0E9: bipush 16 (0x10)
		// @0EB: ishr
		// @0EC: istore #11
		// @0EE: iload #11
		// @0F0: getstatic int game.C_100196_rb.field_105816_f
		// @0F3: if_icmplt @165
		// @0F6: iload #11
		// @0F8: getstatic int game.C_100196_rb.field_105823_l
		// @0FB: if_icmpge @165
		// @0FE: iload_0
		// @0FF: iload #11
		// @101: getstatic int game.C_100196_rb.field_105819_e
		// @104: imul
		// @105: iadd
		// @106: istore #12
		// @108: getstatic int[] game.C_100196_rb.field_105818_d
		// @10B: iload #12
		// @10D: iaload
		// @10E: bipush 16 (0x10)
		// @110: ishr
		// @111: sipush 255 (0x00FF)
		// @114: iand
		// @115: iload #6
		// @117: imul
		// @118: istore #13
		// @11A: getstatic int[] game.C_100196_rb.field_105818_d
		// @11D: iload #12
		// @11F: iaload
		// @120: bipush 8 (0x08)
		// @122: ishr
		// @123: sipush 255 (0x00FF)
		// @126: iand
		// @127: iload #6
		// @129: imul
		// @12A: istore #14
		// @12C: getstatic int[] game.C_100196_rb.field_105818_d
		// @12F: iload #12
		// @131: iaload
		// @132: sipush 255 (0x00FF)
		// @135: iand
		// @136: iload #6
		// @138: imul
		// @139: istore #15
		// @13B: iload #7
		// @13D: iload #13
		// @13F: iadd
		// @140: bipush 8 (0x08)
		// @142: ishr
		// @143: bipush 16 (0x10)
		// @145: ishl
		// @146: iload #8
		// @148: iload #14
		// @14A: iadd
		// @14B: bipush 8 (0x08)
		// @14D: ishr
		// @14E: bipush 8 (0x08)
		// @150: ishl
		// @151: iadd
		// @152: iload #9
		// @154: iload #15
		// @156: iadd
		// @157: bipush 8 (0x08)
		// @159: ishr
		// @15A: iadd
		// @15B: istore #16
		// @15D: getstatic int[] game.C_100196_rb.field_105818_d
		// @160: iload #12
		// @162: iload #16
		// @164: iastore
		// @165: iload_1
		// @166: iload #10
		// @168: iadd
		// @169: istore_1
		// @16A: iinc #0 +1
		// @16D: goto @0E3
		// @170: goto @245
		// @173: iload_0
		// @174: bipush 16 (0x10)
		// @176: ishl
		// @177: istore_0
		// @178: iload_0
		// @179: ldc 32768 (0x8000)
		// @17B: iadd
		// @17C: istore_0
		// @17D: iload_2
		// @17E: bipush 16 (0x10)
		// @180: ishl
		// @181: istore_2
		// @182: iload_2
		// @183: i2d
		// @184: iload_3
		// @185: i2d
		// @186: ddiv
		// @187: ldc2_w 0.5
		// @18A: dadd
		// @18B: invokestatic java.lang.Math.floor(double)double
		// @18E: d2i
		// @18F: istore #10
		// @191: iload_3
		// @192: iload_1
		// @193: iadd
		// @194: istore_3
		// @195: iload_1
		// @196: getstatic int game.C_100196_rb.field_105816_f
		// @199: if_icmpge @1AB
		// @19C: iload_0
		// @19D: iload #10
		// @19F: getstatic int game.C_100196_rb.field_105816_f
		// @1A2: iload_1
		// @1A3: isub
		// @1A4: imul
		// @1A5: iadd
		// @1A6: istore_0
		// @1A7: getstatic int game.C_100196_rb.field_105816_f
		// @1AA: istore_1
		// @1AB: iload_3
		// @1AC: getstatic int game.C_100196_rb.field_105823_l
		// @1AF: if_icmplt @1B8
		// @1B2: getstatic int game.C_100196_rb.field_105823_l
		// @1B5: iconst_1
		// @1B6: isub
		// @1B7: istore_3
		// @1B8: iload_1
		// @1B9: iload_3
		// @1BA: if_icmpgt @245
		// @1BD: iload_0
		// @1BE: bipush 16 (0x10)
		// @1C0: ishr
		// @1C1: istore #11
		// @1C3: iload #11
		// @1C5: getstatic int game.C_100196_rb.field_105827_i
		// @1C8: if_icmplt @23A
		// @1CB: iload #11
		// @1CD: getstatic int game.C_100196_rb.field_105820_b
		// @1D0: if_icmpge @23A
		// @1D3: iload #11
		// @1D5: iload_1
		// @1D6: getstatic int game.C_100196_rb.field_105819_e
		// @1D9: imul
		// @1DA: iadd
		// @1DB: istore #12
		// @1DD: getstatic int[] game.C_100196_rb.field_105818_d
		// @1E0: iload #12
		// @1E2: iaload
		// @1E3: bipush 16 (0x10)
		// @1E5: ishr
		// @1E6: sipush 255 (0x00FF)
		// @1E9: iand
		// @1EA: iload #6
		// @1EC: imul
		// @1ED: istore #13
		// @1EF: getstatic int[] game.C_100196_rb.field_105818_d
		// @1F2: iload #12
		// @1F4: iaload
		// @1F5: bipush 8 (0x08)
		// @1F7: ishr
		// @1F8: sipush 255 (0x00FF)
		// @1FB: iand
		// @1FC: iload #6
		// @1FE: imul
		// @1FF: istore #14
		// @201: getstatic int[] game.C_100196_rb.field_105818_d
		// @204: iload #12
		// @206: iaload
		// @207: sipush 255 (0x00FF)
		// @20A: iand
		// @20B: iload #6
		// @20D: imul
		// @20E: istore #15
		// @210: iload #7
		// @212: iload #13
		// @214: iadd
		// @215: bipush 8 (0x08)
		// @217: ishr
		// @218: bipush 16 (0x10)
		// @21A: ishl
		// @21B: iload #8
		// @21D: iload #14
		// @21F: iadd
		// @220: bipush 8 (0x08)
		// @222: ishr
		// @223: bipush 8 (0x08)
		// @225: ishl
		// @226: iadd
		// @227: iload #9
		// @229: iload #15
		// @22B: iadd
		// @22C: bipush 8 (0x08)
		// @22E: ishr
		// @22F: iadd
		// @230: istore #16
		// @232: getstatic int[] game.C_100196_rb.field_105818_d
		// @235: iload #12
		// @237: iload #16
		// @239: iastore
		// @23A: iload_0
		// @23B: iload #10
		// @23D: iadd
		// @23E: istore_0
		// @23F: iinc #1 +1
		// @242: goto @1B8
		// @245: return
	}
	
	static final void func_105807_g(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: iload_1
		// @01: getstatic int game.C_100196_rb.field_105816_f
		// @04: if_icmplt @0E
		// @07: iload_1
		// @08: getstatic int game.C_100196_rb.field_105823_l
		// @0B: if_icmplt @0F
		// @0E: return
		// @0F: iload_0
		// @10: getstatic int game.C_100196_rb.field_105827_i
		// @13: if_icmpge @22
		// @16: iload_2
		// @17: getstatic int game.C_100196_rb.field_105827_i
		// @1A: iload_0
		// @1B: isub
		// @1C: isub
		// @1D: istore_2
		// @1E: getstatic int game.C_100196_rb.field_105827_i
		// @21: istore_0
		// @22: iload_0
		// @23: iload_2
		// @24: iadd
		// @25: getstatic int game.C_100196_rb.field_105820_b
		// @28: if_icmple @31
		// @2B: getstatic int game.C_100196_rb.field_105820_b
		// @2E: iload_0
		// @2F: isub
		// @30: istore_2
		// @31: iload_0
		// @32: iload_1
		// @33: getstatic int game.C_100196_rb.field_105819_e
		// @36: imul
		// @37: iadd
		// @38: istore #4
		// @3A: iconst_0
		// @3B: istore #5
		// @3D: iload #5
		// @3F: iload_2
		// @40: if_icmpge @53
		// @43: getstatic int[] game.C_100196_rb.field_105818_d
		// @46: iload #4
		// @48: iload #5
		// @4A: iadd
		// @4B: iload_3
		// @4C: iastore
		// @4D: iinc #5 +1
		// @50: goto @3D
		// @53: return
	}
	
	static final void func_105804_g(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @00: iload_0
		// @01: getstatic int game.C_100196_rb.field_105827_i
		// @04: if_icmpge @13
		// @07: iload_2
		// @08: getstatic int game.C_100196_rb.field_105827_i
		// @0B: iload_0
		// @0C: isub
		// @0D: isub
		// @0E: istore_2
		// @0F: getstatic int game.C_100196_rb.field_105827_i
		// @12: istore_0
		// @13: iload_1
		// @14: getstatic int game.C_100196_rb.field_105816_f
		// @17: if_icmpge @26
		// @1A: iload_3
		// @1B: getstatic int game.C_100196_rb.field_105816_f
		// @1E: iload_1
		// @1F: isub
		// @20: isub
		// @21: istore_3
		// @22: getstatic int game.C_100196_rb.field_105816_f
		// @25: istore_1
		// @26: iload_0
		// @27: iload_2
		// @28: iadd
		// @29: getstatic int game.C_100196_rb.field_105820_b
		// @2C: if_icmple @35
		// @2F: getstatic int game.C_100196_rb.field_105820_b
		// @32: iload_0
		// @33: isub
		// @34: istore_2
		// @35: iload_1
		// @36: iload_3
		// @37: iadd
		// @38: getstatic int game.C_100196_rb.field_105823_l
		// @3B: if_icmple @44
		// @3E: getstatic int game.C_100196_rb.field_105823_l
		// @41: iload_1
		// @42: isub
		// @43: istore_3
		// @44: iload #4
		// @46: ldc 16711935 (0xff00ff)
		// @48: iand
		// @49: iload #5
		// @4B: imul
		// @4C: bipush 8 (0x08)
		// @4E: ishr
		// @4F: ldc 16711935 (0xff00ff)
		// @51: iand
		// @52: iload #4
		// @54: ldc 65280 (0xff00)
		// @56: iand
		// @57: iload #5
		// @59: imul
		// @5A: bipush 8 (0x08)
		// @5C: ishr
		// @5D: ldc 65280 (0xff00)
		// @5F: iand
		// @60: iadd
		// @61: istore #4
		// @63: sipush 256 (0x0100)
		// @66: iload #5
		// @68: isub
		// @69: istore #6
		// @6B: getstatic int game.C_100196_rb.field_105819_e
		// @6E: iload_2
		// @6F: isub
		// @70: istore #7
		// @72: iload_0
		// @73: iload_1
		// @74: getstatic int game.C_100196_rb.field_105819_e
		// @77: imul
		// @78: iadd
		// @79: istore #8
		// @7B: iconst_0
		// @7C: istore #9
		// @7E: iload #9
		// @80: iload_3
		// @81: if_icmpge @D5
		// @84: iload_2
		// @85: ineg
		// @86: istore #10
		// @88: iload #10
		// @8A: ifge @C8
		// @8D: getstatic int[] game.C_100196_rb.field_105818_d
		// @90: iload #8
		// @92: iaload
		// @93: istore #11
		// @95: iload #11
		// @97: ldc 16711935 (0xff00ff)
		// @99: iand
		// @9A: iload #6
		// @9C: imul
		// @9D: bipush 8 (0x08)
		// @9F: ishr
		// @A0: ldc 16711935 (0xff00ff)
		// @A2: iand
		// @A3: iload #11
		// @A5: ldc 65280 (0xff00)
		// @A7: iand
		// @A8: iload #6
		// @AA: imul
		// @AB: bipush 8 (0x08)
		// @AD: ishr
		// @AE: ldc 65280 (0xff00)
		// @B0: iand
		// @B1: iadd
		// @B2: istore #11
		// @B4: getstatic int[] game.C_100196_rb.field_105818_d
		// @B7: iload #8
		// @B9: iinc #8 +1
		// @BC: iload #4
		// @BE: iload #11
		// @C0: iadd
		// @C1: iastore
		// @C2: iinc #10 +1
		// @C5: goto @88
		// @C8: iload #8
		// @CA: iload #7
		// @CC: iadd
		// @CD: istore #8
		// @CF: iinc #9 +1
		// @D2: goto @7E
		// @D5: return
	}
	
	static final void func_105813_h(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @000: iload_2
		// @001: iload_0
		// @002: isub
		// @003: istore_2
		// @004: iload_3
		// @005: iload_1
		// @006: isub
		// @007: istore_3
		// @008: iload_3
		// @009: ifne @02F
		// @00C: iload_2
		// @00D: iflt @01F
		// @010: iload_0
		// @011: iload_1
		// @012: iload_2
		// @013: iconst_1
		// @014: iadd
		// @015: iload #4
		// @017: iload #5
		// @019: invokestatic game.C_100196_rb.func_105794_a(int, int, int, int, int)void
		// @01C: goto @02E
		// @01F: iload_0
		// @020: iload_2
		// @021: iadd
		// @022: iload_1
		// @023: iload_2
		// @024: ineg
		// @025: iconst_1
		// @026: iadd
		// @027: iload #4
		// @029: iload #5
		// @02B: invokestatic game.C_100196_rb.func_105794_a(int, int, int, int, int)void
		// @02E: return
		// @02F: iload_2
		// @030: ifne @056
		// @033: iload_3
		// @034: iflt @046
		// @037: iload_0
		// @038: iload_1
		// @039: iload_3
		// @03A: iconst_1
		// @03B: iadd
		// @03C: iload #4
		// @03E: iload #5
		// @040: invokestatic game.C_100196_rb.func_105791_d(int, int, int, int, int)void
		// @043: goto @055
		// @046: iload_0
		// @047: iload_1
		// @048: iload_3
		// @049: iadd
		// @04A: iload_3
		// @04B: ineg
		// @04C: iconst_1
		// @04D: iadd
		// @04E: iload #4
		// @050: iload #5
		// @052: invokestatic game.C_100196_rb.func_105791_d(int, int, int, int, int)void
		// @055: return
		// @056: iload #4
		// @058: ldc 16711935 (0xff00ff)
		// @05A: iand
		// @05B: iload #5
		// @05D: imul
		// @05E: istore #6
		// @060: iload #6
		// @062: ldc -16711936 (0xff00ff00)
		// @064: iand
		// @065: iload #4
		// @067: iload #5
		// @069: imul
		// @06A: iload #6
		// @06C: isub
		// @06D: ldc 16711680 (0xff0000)
		// @06F: iand
		// @070: iadd
		// @071: bipush 8 (0x08)
		// @073: iushr
		// @074: istore #4
		// @076: iload_2
		// @077: iload_3
		// @078: iadd
		// @079: ifge @08A
		// @07C: iload_0
		// @07D: iload_2
		// @07E: iadd
		// @07F: istore_0
		// @080: iload_2
		// @081: ineg
		// @082: istore_2
		// @083: iload_1
		// @084: iload_3
		// @085: iadd
		// @086: istore_1
		// @087: iload_3
		// @088: ineg
		// @089: istore_3
		// @08A: iload_2
		// @08B: iload_3
		// @08C: if_icmple @147
		// @08F: iload_1
		// @090: bipush 16 (0x10)
		// @092: ishl
		// @093: istore_1
		// @094: iload_1
		// @095: ldc 32768 (0x8000)
		// @097: iadd
		// @098: istore_1
		// @099: iload_3
		// @09A: bipush 16 (0x10)
		// @09C: ishl
		// @09D: istore_3
		// @09E: iload_3
		// @09F: i2d
		// @0A0: iload_2
		// @0A1: i2d
		// @0A2: ddiv
		// @0A3: ldc2_w 0.5
		// @0A6: dadd
		// @0A7: invokestatic java.lang.Math.floor(double)double
		// @0AA: d2i
		// @0AB: istore #9
		// @0AD: iload_2
		// @0AE: iload_0
		// @0AF: iadd
		// @0B0: istore_2
		// @0B1: iload_0
		// @0B2: getstatic int game.C_100196_rb.field_105827_i
		// @0B5: if_icmpge @0C7
		// @0B8: iload_1
		// @0B9: iload #9
		// @0BB: getstatic int game.C_100196_rb.field_105827_i
		// @0BE: iload_0
		// @0BF: isub
		// @0C0: imul
		// @0C1: iadd
		// @0C2: istore_1
		// @0C3: getstatic int game.C_100196_rb.field_105827_i
		// @0C6: istore_0
		// @0C7: iload_2
		// @0C8: getstatic int game.C_100196_rb.field_105820_b
		// @0CB: if_icmplt @0D4
		// @0CE: getstatic int game.C_100196_rb.field_105820_b
		// @0D1: iconst_1
		// @0D2: isub
		// @0D3: istore_2
		// @0D4: iload_0
		// @0D5: iload_2
		// @0D6: if_icmpgt @144
		// @0D9: iload_1
		// @0DA: bipush 16 (0x10)
		// @0DC: ishr
		// @0DD: istore #10
		// @0DF: iload #10
		// @0E1: getstatic int game.C_100196_rb.field_105816_f
		// @0E4: if_icmplt @139
		// @0E7: iload #10
		// @0E9: getstatic int game.C_100196_rb.field_105823_l
		// @0EC: if_icmpge @139
		// @0EF: iload_0
		// @0F0: iload #10
		// @0F2: getstatic int game.C_100196_rb.field_105819_e
		// @0F5: imul
		// @0F6: iadd
		// @0F7: istore #8
		// @0F9: getstatic int[] game.C_100196_rb.field_105818_d
		// @0FC: iload #8
		// @0FE: iaload
		// @0FF: istore #6
		// @101: iload #4
		// @103: iload #6
		// @105: iadd
		// @106: istore #7
		// @108: iload #4
		// @10A: ldc 16711935 (0xff00ff)
		// @10C: iand
		// @10D: iload #6
		// @10F: ldc 16711935 (0xff00ff)
		// @111: iand
		// @112: iadd
		// @113: istore #11
		// @115: iload #11
		// @117: ldc 16777472 (0x1000100)
		// @119: iand
		// @11A: iload #7
		// @11C: iload #11
		// @11E: isub
		// @11F: ldc 65536 (0x10000)
		// @121: iand
		// @122: iadd
		// @123: istore #6
		// @125: getstatic int[] game.C_100196_rb.field_105818_d
		// @128: iload #8
		// @12A: iload #7
		// @12C: iload #6
		// @12E: isub
		// @12F: iload #6
		// @131: iload #6
		// @133: bipush 8 (0x08)
		// @135: iushr
		// @136: isub
		// @137: ior
		// @138: iastore
		// @139: iload_1
		// @13A: iload #9
		// @13C: iadd
		// @13D: istore_1
		// @13E: iinc #0 +1
		// @141: goto @0D4
		// @144: goto @1FC
		// @147: iload_0
		// @148: bipush 16 (0x10)
		// @14A: ishl
		// @14B: istore_0
		// @14C: iload_0
		// @14D: ldc 32768 (0x8000)
		// @14F: iadd
		// @150: istore_0
		// @151: iload_2
		// @152: bipush 16 (0x10)
		// @154: ishl
		// @155: istore_2
		// @156: iload_2
		// @157: i2d
		// @158: iload_3
		// @159: i2d
		// @15A: ddiv
		// @15B: ldc2_w 0.5
		// @15E: dadd
		// @15F: invokestatic java.lang.Math.floor(double)double
		// @162: d2i
		// @163: istore #9
		// @165: iload_3
		// @166: iload_1
		// @167: iadd
		// @168: istore_3
		// @169: iload_1
		// @16A: getstatic int game.C_100196_rb.field_105816_f
		// @16D: if_icmpge @17F
		// @170: iload_0
		// @171: iload #9
		// @173: getstatic int game.C_100196_rb.field_105816_f
		// @176: iload_1
		// @177: isub
		// @178: imul
		// @179: iadd
		// @17A: istore_0
		// @17B: getstatic int game.C_100196_rb.field_105816_f
		// @17E: istore_1
		// @17F: iload_3
		// @180: getstatic int game.C_100196_rb.field_105823_l
		// @183: if_icmplt @18C
		// @186: getstatic int game.C_100196_rb.field_105823_l
		// @189: iconst_1
		// @18A: isub
		// @18B: istore_3
		// @18C: iload_1
		// @18D: iload_3
		// @18E: if_icmpgt @1FC
		// @191: iload_0
		// @192: bipush 16 (0x10)
		// @194: ishr
		// @195: istore #10
		// @197: iload #10
		// @199: getstatic int game.C_100196_rb.field_105827_i
		// @19C: if_icmplt @1F1
		// @19F: iload #10
		// @1A1: getstatic int game.C_100196_rb.field_105820_b
		// @1A4: if_icmpge @1F1
		// @1A7: iload #10
		// @1A9: iload_1
		// @1AA: getstatic int game.C_100196_rb.field_105819_e
		// @1AD: imul
		// @1AE: iadd
		// @1AF: istore #8
		// @1B1: getstatic int[] game.C_100196_rb.field_105818_d
		// @1B4: iload #8
		// @1B6: iaload
		// @1B7: istore #6
		// @1B9: iload #4
		// @1BB: iload #6
		// @1BD: iadd
		// @1BE: istore #7
		// @1C0: iload #4
		// @1C2: ldc 16711935 (0xff00ff)
		// @1C4: iand
		// @1C5: iload #6
		// @1C7: ldc 16711935 (0xff00ff)
		// @1C9: iand
		// @1CA: iadd
		// @1CB: istore #11
		// @1CD: iload #11
		// @1CF: ldc 16777472 (0x1000100)
		// @1D1: iand
		// @1D2: iload #7
		// @1D4: iload #11
		// @1D6: isub
		// @1D7: ldc 65536 (0x10000)
		// @1D9: iand
		// @1DA: iadd
		// @1DB: istore #6
		// @1DD: getstatic int[] game.C_100196_rb.field_105818_d
		// @1E0: iload #8
		// @1E2: iload #7
		// @1E4: iload #6
		// @1E6: isub
		// @1E7: iload #6
		// @1E9: iload #6
		// @1EB: bipush 8 (0x08)
		// @1ED: iushr
		// @1EE: isub
		// @1EF: ior
		// @1F0: iastore
		// @1F1: iload_0
		// @1F2: iload #9
		// @1F4: iadd
		// @1F5: istore_0
		// @1F6: iinc #1 +1
		// @1F9: goto @18C
		// @1FC: return
	}
	
	static final void func_105776_b(int arg0, int arg1, int arg2, int arg3)
	{
		// @000: iload_2
		// @001: ifne @00B
		// @004: iload_0
		// @005: iload_1
		// @006: iload_3
		// @007: invokestatic game.C_100196_rb.func_105797_b(int, int, int)void
		// @00A: return
		// @00B: iload_2
		// @00C: ifge @012
		// @00F: iload_2
		// @010: ineg
		// @011: istore_2
		// @012: getstatic int game.C_100196_rb.field_105820_b
		// @015: getstatic int game.C_100196_rb.field_105827_i
		// @018: if_icmple @024
		// @01B: getstatic int game.C_100196_rb.field_105823_l
		// @01E: getstatic int game.C_100196_rb.field_105816_f
		// @021: if_icmpgt @025
		// @024: return
		// @025: iload_0
		// @026: iload_2
		// @027: iadd
		// @028: getstatic int game.C_100196_rb.field_105827_i
		// @02B: if_icmplt @049
		// @02E: iload_0
		// @02F: iload_2
		// @030: isub
		// @031: getstatic int game.C_100196_rb.field_105820_b
		// @034: if_icmpge @049
		// @037: iload_1
		// @038: iload_2
		// @039: iadd
		// @03A: getstatic int game.C_100196_rb.field_105816_f
		// @03D: if_icmplt @049
		// @040: iload_1
		// @041: iload_2
		// @042: isub
		// @043: getstatic int game.C_100196_rb.field_105823_l
		// @046: if_icmplt @04A
		// @049: return
		// @04A: iload_0
		// @04B: iload_1
		// @04C: getstatic int game.C_100196_rb.field_105819_e
		// @04F: imul
		// @050: iadd
		// @051: istore #4
		// @053: iload #4
		// @055: istore #5
		// @057: iload #4
		// @059: iload_2
		// @05A: getstatic int game.C_100196_rb.field_105819_e
		// @05D: imul
		// @05E: isub
		// @05F: istore #6
		// @061: iload #4
		// @063: iload_2
		// @064: getstatic int game.C_100196_rb.field_105819_e
		// @067: imul
		// @068: iadd
		// @069: istore #7
		// @06B: iload_2
		// @06C: istore #8
		// @06E: iconst_0
		// @06F: istore #9
		// @071: iload_2
		// @072: iload_2
		// @073: imul
		// @074: istore_2
		// @075: iload_2
		// @076: iload #8
		// @078: isub
		// @079: istore #10
		// @07B: iload_0
		// @07C: iload #8
		// @07E: isub
		// @07F: getstatic int game.C_100196_rb.field_105827_i
		// @082: if_icmplt @0A3
		// @085: iload_0
		// @086: iload #8
		// @088: iadd
		// @089: getstatic int game.C_100196_rb.field_105820_b
		// @08C: if_icmpge @0A3
		// @08F: iload_1
		// @090: iload #8
		// @092: isub
		// @093: getstatic int game.C_100196_rb.field_105816_f
		// @096: if_icmplt @0A3
		// @099: iload_1
		// @09A: iload #8
		// @09C: iadd
		// @09D: getstatic int game.C_100196_rb.field_105823_l
		// @0A0: if_icmplt @2B2
		// @0A3: iload_0
		// @0A4: iload #8
		// @0A6: isub
		// @0A7: getstatic int game.C_100196_rb.field_105827_i
		// @0AA: if_icmplt @0C5
		// @0AD: iload_1
		// @0AE: getstatic int game.C_100196_rb.field_105816_f
		// @0B1: if_icmplt @0C5
		// @0B4: iload_1
		// @0B5: getstatic int game.C_100196_rb.field_105823_l
		// @0B8: if_icmpge @0C5
		// @0BB: getstatic int[] game.C_100196_rb.field_105818_d
		// @0BE: iload #4
		// @0C0: iload #8
		// @0C2: isub
		// @0C3: iload_3
		// @0C4: iastore
		// @0C5: iload_0
		// @0C6: iload #8
		// @0C8: iadd
		// @0C9: getstatic int game.C_100196_rb.field_105820_b
		// @0CC: if_icmpge @0E7
		// @0CF: iload_1
		// @0D0: getstatic int game.C_100196_rb.field_105816_f
		// @0D3: if_icmplt @0E7
		// @0D6: iload_1
		// @0D7: getstatic int game.C_100196_rb.field_105823_l
		// @0DA: if_icmpge @0E7
		// @0DD: getstatic int[] game.C_100196_rb.field_105818_d
		// @0E0: iload #4
		// @0E2: iload #8
		// @0E4: iadd
		// @0E5: iload_3
		// @0E6: iastore
		// @0E7: iload_1
		// @0E8: iload #8
		// @0EA: isub
		// @0EB: getstatic int game.C_100196_rb.field_105816_f
		// @0EE: if_icmplt @106
		// @0F1: iload_0
		// @0F2: getstatic int game.C_100196_rb.field_105827_i
		// @0F5: if_icmplt @106
		// @0F8: iload_0
		// @0F9: getstatic int game.C_100196_rb.field_105820_b
		// @0FC: if_icmpge @106
		// @0FF: getstatic int[] game.C_100196_rb.field_105818_d
		// @102: iload #6
		// @104: iload_3
		// @105: iastore
		// @106: iload_1
		// @107: iload #8
		// @109: iadd
		// @10A: getstatic int game.C_100196_rb.field_105823_l
		// @10D: if_icmpge @125
		// @110: iload_0
		// @111: getstatic int game.C_100196_rb.field_105827_i
		// @114: if_icmplt @125
		// @117: iload_0
		// @118: getstatic int game.C_100196_rb.field_105820_b
		// @11B: if_icmpge @125
		// @11E: getstatic int[] game.C_100196_rb.field_105818_d
		// @121: iload #7
		// @123: iload_3
		// @124: iastore
		// @125: iload #10
		// @127: iload #9
		// @129: iinc #9 +1
		// @12C: iload #9
		// @12E: iadd
		// @12F: iadd
		// @130: istore #10
		// @132: iload #4
		// @134: getstatic int game.C_100196_rb.field_105819_e
		// @137: isub
		// @138: istore #4
		// @13A: iload #5
		// @13C: getstatic int game.C_100196_rb.field_105819_e
		// @13F: iadd
		// @140: istore #5
		// @142: iload #10
		// @144: iload_2
		// @145: if_icmple @165
		// @148: iload #10
		// @14A: iinc #8 +255
		// @14D: iload #8
		// @14F: iload #8
		// @151: iadd
		// @152: isub
		// @153: istore #10
		// @155: iload #6
		// @157: getstatic int game.C_100196_rb.field_105819_e
		// @15A: iadd
		// @15B: istore #6
		// @15D: iload #7
		// @15F: getstatic int game.C_100196_rb.field_105819_e
		// @162: isub
		// @163: istore #7
		// @165: iload #8
		// @167: iload #9
		// @169: if_icmpge @16F
		// @16C: goto @371
		// @16F: iload_1
		// @170: iload #8
		// @172: isub
		// @173: getstatic int game.C_100196_rb.field_105816_f
		// @176: if_icmplt @1BF
		// @179: iload_1
		// @17A: iload #8
		// @17C: isub
		// @17D: getstatic int game.C_100196_rb.field_105823_l
		// @180: if_icmpge @1BF
		// @183: iload_0
		// @184: iload #9
		// @186: isub
		// @187: getstatic int game.C_100196_rb.field_105827_i
		// @18A: if_icmplt @1A1
		// @18D: iload_0
		// @18E: iload #9
		// @190: isub
		// @191: getstatic int game.C_100196_rb.field_105820_b
		// @194: if_icmpge @1A1
		// @197: getstatic int[] game.C_100196_rb.field_105818_d
		// @19A: iload #6
		// @19C: iload #9
		// @19E: isub
		// @19F: iload_3
		// @1A0: iastore
		// @1A1: iload_0
		// @1A2: iload #9
		// @1A4: iadd
		// @1A5: getstatic int game.C_100196_rb.field_105827_i
		// @1A8: if_icmplt @1BF
		// @1AB: iload_0
		// @1AC: iload #9
		// @1AE: iadd
		// @1AF: getstatic int game.C_100196_rb.field_105820_b
		// @1B2: if_icmpge @1BF
		// @1B5: getstatic int[] game.C_100196_rb.field_105818_d
		// @1B8: iload #6
		// @1BA: iload #9
		// @1BC: iadd
		// @1BD: iload_3
		// @1BE: iastore
		// @1BF: iload_1
		// @1C0: iload #9
		// @1C2: isub
		// @1C3: getstatic int game.C_100196_rb.field_105816_f
		// @1C6: if_icmplt @20F
		// @1C9: iload_1
		// @1CA: iload #9
		// @1CC: isub
		// @1CD: getstatic int game.C_100196_rb.field_105823_l
		// @1D0: if_icmpge @20F
		// @1D3: iload_0
		// @1D4: iload #8
		// @1D6: isub
		// @1D7: getstatic int game.C_100196_rb.field_105827_i
		// @1DA: if_icmplt @1F1
		// @1DD: iload_0
		// @1DE: iload #8
		// @1E0: isub
		// @1E1: getstatic int game.C_100196_rb.field_105820_b
		// @1E4: if_icmpge @1F1
		// @1E7: getstatic int[] game.C_100196_rb.field_105818_d
		// @1EA: iload #4
		// @1EC: iload #8
		// @1EE: isub
		// @1EF: iload_3
		// @1F0: iastore
		// @1F1: iload_0
		// @1F2: iload #8
		// @1F4: iadd
		// @1F5: getstatic int game.C_100196_rb.field_105827_i
		// @1F8: if_icmplt @20F
		// @1FB: iload_0
		// @1FC: iload #8
		// @1FE: iadd
		// @1FF: getstatic int game.C_100196_rb.field_105820_b
		// @202: if_icmpge @20F
		// @205: getstatic int[] game.C_100196_rb.field_105818_d
		// @208: iload #4
		// @20A: iload #8
		// @20C: iadd
		// @20D: iload_3
		// @20E: iastore
		// @20F: iload_1
		// @210: iload #9
		// @212: iadd
		// @213: getstatic int game.C_100196_rb.field_105816_f
		// @216: if_icmplt @25F
		// @219: iload_1
		// @21A: iload #9
		// @21C: iadd
		// @21D: getstatic int game.C_100196_rb.field_105823_l
		// @220: if_icmpge @25F
		// @223: iload_0
		// @224: iload #8
		// @226: isub
		// @227: getstatic int game.C_100196_rb.field_105827_i
		// @22A: if_icmplt @241
		// @22D: iload_0
		// @22E: iload #8
		// @230: isub
		// @231: getstatic int game.C_100196_rb.field_105820_b
		// @234: if_icmpge @241
		// @237: getstatic int[] game.C_100196_rb.field_105818_d
		// @23A: iload #5
		// @23C: iload #8
		// @23E: isub
		// @23F: iload_3
		// @240: iastore
		// @241: iload_0
		// @242: iload #8
		// @244: iadd
		// @245: getstatic int game.C_100196_rb.field_105827_i
		// @248: if_icmplt @25F
		// @24B: iload_0
		// @24C: iload #8
		// @24E: iadd
		// @24F: getstatic int game.C_100196_rb.field_105820_b
		// @252: if_icmpge @25F
		// @255: getstatic int[] game.C_100196_rb.field_105818_d
		// @258: iload #5
		// @25A: iload #8
		// @25C: iadd
		// @25D: iload_3
		// @25E: iastore
		// @25F: iload_1
		// @260: iload #8
		// @262: iadd
		// @263: getstatic int game.C_100196_rb.field_105816_f
		// @266: if_icmplt @125
		// @269: iload_1
		// @26A: iload #8
		// @26C: iadd
		// @26D: getstatic int game.C_100196_rb.field_105823_l
		// @270: if_icmpge @125
		// @273: iload_0
		// @274: iload #9
		// @276: isub
		// @277: getstatic int game.C_100196_rb.field_105827_i
		// @27A: if_icmplt @291
		// @27D: iload_0
		// @27E: iload #9
		// @280: isub
		// @281: getstatic int game.C_100196_rb.field_105820_b
		// @284: if_icmpge @291
		// @287: getstatic int[] game.C_100196_rb.field_105818_d
		// @28A: iload #7
		// @28C: iload #9
		// @28E: isub
		// @28F: iload_3
		// @290: iastore
		// @291: iload_0
		// @292: iload #9
		// @294: iadd
		// @295: getstatic int game.C_100196_rb.field_105827_i
		// @298: if_icmplt @125
		// @29B: iload_0
		// @29C: iload #9
		// @29E: iadd
		// @29F: getstatic int game.C_100196_rb.field_105820_b
		// @2A2: if_icmpge @125
		// @2A5: getstatic int[] game.C_100196_rb.field_105818_d
		// @2A8: iload #7
		// @2AA: iload #9
		// @2AC: iadd
		// @2AD: iload_3
		// @2AE: iastore
		// @2AF: goto @125
		// @2B2: getstatic int[] game.C_100196_rb.field_105818_d
		// @2B5: iload #4
		// @2B7: iload #8
		// @2B9: isub
		// @2BA: iload_3
		// @2BB: iastore
		// @2BC: getstatic int[] game.C_100196_rb.field_105818_d
		// @2BF: iload #4
		// @2C1: iload #8
		// @2C3: iadd
		// @2C4: iload_3
		// @2C5: iastore
		// @2C6: getstatic int[] game.C_100196_rb.field_105818_d
		// @2C9: iload #6
		// @2CB: iload_3
		// @2CC: iastore
		// @2CD: getstatic int[] game.C_100196_rb.field_105818_d
		// @2D0: iload #7
		// @2D2: iload_3
		// @2D3: iastore
		// @2D4: iload #10
		// @2D6: iload #9
		// @2D8: iinc #9 +1
		// @2DB: iload #9
		// @2DD: iadd
		// @2DE: iadd
		// @2DF: istore #10
		// @2E1: iload #4
		// @2E3: getstatic int game.C_100196_rb.field_105819_e
		// @2E6: isub
		// @2E7: istore #4
		// @2E9: iload #5
		// @2EB: getstatic int game.C_100196_rb.field_105819_e
		// @2EE: iadd
		// @2EF: istore #5
		// @2F1: iload #10
		// @2F3: iload_2
		// @2F4: if_icmple @314
		// @2F7: iload #10
		// @2F9: iinc #8 +255
		// @2FC: iload #8
		// @2FE: iload #8
		// @300: iadd
		// @301: isub
		// @302: istore #10
		// @304: iload #6
		// @306: getstatic int game.C_100196_rb.field_105819_e
		// @309: iadd
		// @30A: istore #6
		// @30C: iload #7
		// @30E: getstatic int game.C_100196_rb.field_105819_e
		// @311: isub
		// @312: istore #7
		// @314: iload #8
		// @316: iload #9
		// @318: if_icmpge @31E
		// @31B: goto @371
		// @31E: getstatic int[] game.C_100196_rb.field_105818_d
		// @321: iload #6
		// @323: iload #9
		// @325: isub
		// @326: iload_3
		// @327: iastore
		// @328: getstatic int[] game.C_100196_rb.field_105818_d
		// @32B: iload #6
		// @32D: iload #9
		// @32F: iadd
		// @330: iload_3
		// @331: iastore
		// @332: getstatic int[] game.C_100196_rb.field_105818_d
		// @335: iload #4
		// @337: iload #8
		// @339: isub
		// @33A: iload_3
		// @33B: iastore
		// @33C: getstatic int[] game.C_100196_rb.field_105818_d
		// @33F: iload #4
		// @341: iload #8
		// @343: iadd
		// @344: iload_3
		// @345: iastore
		// @346: getstatic int[] game.C_100196_rb.field_105818_d
		// @349: iload #5
		// @34B: iload #8
		// @34D: isub
		// @34E: iload_3
		// @34F: iastore
		// @350: getstatic int[] game.C_100196_rb.field_105818_d
		// @353: iload #5
		// @355: iload #8
		// @357: iadd
		// @358: iload_3
		// @359: iastore
		// @35A: getstatic int[] game.C_100196_rb.field_105818_d
		// @35D: iload #7
		// @35F: iload #9
		// @361: isub
		// @362: iload_3
		// @363: iastore
		// @364: getstatic int[] game.C_100196_rb.field_105818_d
		// @367: iload #7
		// @369: iload #9
		// @36B: iadd
		// @36C: iload_3
		// @36D: iastore
		// @36E: goto @2D4
		// @371: return
	}
	
	private static final void func_105789_a(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8)
	{
		// @000: getstatic int[] game.C_100196_rb.field_105822_a
		// @003: ifnull @00F
		// @006: getstatic int[] game.C_100196_rb.field_105822_a
		// @009: arraylength
		// @00A: iload #8
		// @00C: if_icmpge @024
		// @00F: iload #8
		// @011: newarray int[]
		// @013: putstatic int[] game.C_100196_rb.field_105822_a
		// @016: iload #8
		// @018: newarray int[]
		// @01A: putstatic int[] game.C_100196_rb.field_105817_g
		// @01D: iload #8
		// @01F: newarray int[]
		// @021: putstatic int[] game.C_100196_rb.field_105826_h
		// @024: getstatic int[] game.C_100196_rb.field_105822_a
		// @027: astore #9
		// @029: getstatic int[] game.C_100196_rb.field_105817_g
		// @02C: astore #10
		// @02E: getstatic int[] game.C_100196_rb.field_105826_h
		// @031: astore #11
		// @033: aload #9
		// @035: iconst_0
		// @036: iload #8
		// @038: invokestatic game.C_100120_en.func_104910_a(int[], int, int)void
		// @03B: aload #10
		// @03D: iconst_0
		// @03E: iload #8
		// @040: invokestatic game.C_100120_en.func_104910_a(int[], int, int)void
		// @043: aload #11
		// @045: iconst_0
		// @046: iload #8
		// @048: invokestatic game.C_100120_en.func_104910_a(int[], int, int)void
		// @04B: sipush 16384 (0x4000)
		// @04E: iconst_2
		// @04F: iload_3
		// @050: imul
		// @051: iconst_1
		// @052: iadd
		// @053: idiv
		// @054: istore #12
		// @056: iload #4
		// @058: iload_3
		// @059: isub
		// @05A: istore #13
		// @05C: iload #13
		// @05E: ifge @064
		// @061: iconst_0
		// @062: istore #13
		// @064: iload #7
		// @066: iload #13
		// @068: getstatic int game.C_100196_rb.field_105819_e
		// @06B: imul
		// @06C: iadd
		// @06D: istore #14
		// @06F: iload #4
		// @071: iload_3
		// @072: iadd
		// @073: istore #15
		// @075: iconst_0
		// @076: istore #16
		// @078: iload #15
		// @07A: getstatic int game.C_100196_rb.field_105821_c
		// @07D: if_icmplt @091
		// @080: iload #15
		// @082: getstatic int game.C_100196_rb.field_105821_c
		// @085: isub
		// @086: iconst_1
		// @087: iadd
		// @088: istore #16
		// @08A: getstatic int game.C_100196_rb.field_105821_c
		// @08D: iconst_1
		// @08E: isub
		// @08F: istore #15
		// @091: iload #15
		// @093: iload #13
		// @095: isub
		// @096: iconst_1
		// @097: iadd
		// @098: istore #17
		// @09A: iload #13
		// @09C: iload #15
		// @09E: if_icmpgt @0F3
		// @0A1: iconst_0
		// @0A2: istore #18
		// @0A4: iload #18
		// @0A6: iload #8
		// @0A8: if_icmpge @0E6
		// @0AB: aload_0
		// @0AC: iload #14
		// @0AE: iinc #14 +1
		// @0B1: iaload
		// @0B2: istore_1
		// @0B3: aload #9
		// @0B5: iload #18
		// @0B7: dup2
		// @0B8: iaload
		// @0B9: iload_1
		// @0BA: bipush 16 (0x10)
		// @0BC: ishr
		// @0BD: sipush 255 (0x00FF)
		// @0C0: iand
		// @0C1: iadd
		// @0C2: iastore
		// @0C3: aload #10
		// @0C5: iload #18
		// @0C7: dup2
		// @0C8: iaload
		// @0C9: iload_1
		// @0CA: bipush 8 (0x08)
		// @0CC: ishr
		// @0CD: sipush 255 (0x00FF)
		// @0D0: iand
		// @0D1: iadd
		// @0D2: iastore
		// @0D3: aload #11
		// @0D5: iload #18
		// @0D7: dup2
		// @0D8: iaload
		// @0D9: iload_1
		// @0DA: sipush 255 (0x00FF)
		// @0DD: iand
		// @0DE: iadd
		// @0DF: iastore
		// @0E0: iinc #18 +1
		// @0E3: goto @0A4
		// @0E6: iload #14
		// @0E8: iload #6
		// @0EA: iadd
		// @0EB: istore #14
		// @0ED: iinc #13 +1
		// @0F0: goto @09A
		// @0F3: iload #14
		// @0F5: iload #16
		// @0F7: getstatic int game.C_100196_rb.field_105819_e
		// @0FA: imul
		// @0FB: iadd
		// @0FC: istore #14
		// @0FE: iconst_0
		// @0FF: istore #18
		// @101: iload #18
		// @103: iload #8
		// @105: if_icmpge @134
		// @108: aload_0
		// @109: iload_2
		// @10A: iinc #2 +1
		// @10D: aload #9
		// @10F: iload #18
		// @111: iaload
		// @112: iload #17
		// @114: idiv
		// @115: bipush 16 (0x10)
		// @117: ishl
		// @118: aload #10
		// @11A: iload #18
		// @11C: iaload
		// @11D: iload #17
		// @11F: idiv
		// @120: bipush 8 (0x08)
		// @122: ishl
		// @123: iadd
		// @124: aload #11
		// @126: iload #18
		// @128: iaload
		// @129: iload #17
		// @12B: idiv
		// @12C: iadd
		// @12D: iastore
		// @12E: iinc #18 +1
		// @131: goto @101
		// @134: iload_2
		// @135: iload #6
		// @137: iadd
		// @138: istore_2
		// @139: iconst_1
		// @13A: iload #5
		// @13C: isub
		// @13D: istore #13
		// @13F: iconst_1
		// @140: iload_3
		// @141: iadd
		// @142: iload #5
		// @144: isub
		// @145: iload #4
		// @147: isub
		// @148: istore #18
		// @14A: iconst_0
		// @14B: iload #18
		// @14D: if_icmpge @153
		// @150: iconst_0
		// @151: istore #18
		// @153: iload #7
		// @155: iload #4
		// @157: iload_3
		// @158: isub
		// @159: getstatic int game.C_100196_rb.field_105819_e
		// @15C: imul
		// @15D: iadd
		// @15E: istore #19
		// @160: iload #13
		// @162: iload #18
		// @164: if_icmpge @175
		// @167: iload #19
		// @169: iload #18
		// @16B: iload #13
		// @16D: isub
		// @16E: getstatic int game.C_100196_rb.field_105819_e
		// @171: imul
		// @172: iadd
		// @173: istore #19
		// @175: iload #13
		// @177: iload #18
		// @179: if_icmpge @233
		// @17C: iload #13
		// @17E: iload #4
		// @180: iadd
		// @181: iload #5
		// @183: iadd
		// @184: iload_3
		// @185: iadd
		// @186: getstatic int game.C_100196_rb.field_105823_l
		// @189: if_icmpge @1DE
		// @18C: iconst_0
		// @18D: istore #20
		// @18F: iload #20
		// @191: iload #8
		// @193: if_icmpge @1D1
		// @196: aload_0
		// @197: iload #14
		// @199: iinc #14 +1
		// @19C: iaload
		// @19D: istore_1
		// @19E: aload #9
		// @1A0: iload #20
		// @1A2: dup2
		// @1A3: iaload
		// @1A4: iload_1
		// @1A5: bipush 16 (0x10)
		// @1A7: ishr
		// @1A8: sipush 255 (0x00FF)
		// @1AB: iand
		// @1AC: iadd
		// @1AD: iastore
		// @1AE: aload #10
		// @1B0: iload #20
		// @1B2: dup2
		// @1B3: iaload
		// @1B4: iload_1
		// @1B5: bipush 8 (0x08)
		// @1B7: ishr
		// @1B8: sipush 255 (0x00FF)
		// @1BB: iand
		// @1BC: iadd
		// @1BD: iastore
		// @1BE: aload #11
		// @1C0: iload #20
		// @1C2: dup2
		// @1C3: iaload
		// @1C4: iload_1
		// @1C5: sipush 255 (0x00FF)
		// @1C8: iand
		// @1C9: iadd
		// @1CA: iastore
		// @1CB: iinc #20 +1
		// @1CE: goto @18F
		// @1D1: iload #14
		// @1D3: iload #6
		// @1D5: iadd
		// @1D6: istore #14
		// @1D8: iinc #17 +1
		// @1DB: goto @1E6
		// @1DE: iload #14
		// @1E0: getstatic int game.C_100196_rb.field_105819_e
		// @1E3: iadd
		// @1E4: istore #14
		// @1E6: iconst_0
		// @1E7: istore #20
		// @1E9: iload #20
		// @1EB: iload #8
		// @1ED: if_icmpge @228
		// @1F0: aload #9
		// @1F2: iload #20
		// @1F4: iaload
		// @1F5: iload #17
		// @1F7: idiv
		// @1F8: istore #21
		// @1FA: aload #10
		// @1FC: iload #20
		// @1FE: iaload
		// @1FF: iload #17
		// @201: idiv
		// @202: istore #22
		// @204: aload #11
		// @206: iload #20
		// @208: iaload
		// @209: iload #17
		// @20B: idiv
		// @20C: istore #23
		// @20E: aload_0
		// @20F: iload_2
		// @210: iinc #2 +1
		// @213: iload #21
		// @215: bipush 16 (0x10)
		// @217: ishl
		// @218: iload #22
		// @21A: bipush 8 (0x08)
		// @21C: ishl
		// @21D: iadd
		// @21E: iload #23
		// @220: iadd
		// @221: iastore
		// @222: iinc #20 +1
		// @225: goto @1E9
		// @228: iload_2
		// @229: iload #6
		// @22B: iadd
		// @22C: istore_2
		// @22D: iinc #13 +1
		// @230: goto @175
		// @233: getstatic int game.C_100196_rb.field_105821_c
		// @236: iload #4
		// @238: isub
		// @239: iload #5
		// @23B: isub
		// @23C: iload_3
		// @23D: isub
		// @23E: istore #18
		// @240: iconst_0
		// @241: iload #18
		// @243: if_icmpge @249
		// @246: iconst_0
		// @247: istore #18
		// @249: iload #13
		// @24B: iload #18
		// @24D: if_icmpge @395
		// @250: iconst_0
		// @251: istore #20
		// @253: iload #20
		// @255: iload #8
		// @257: if_icmpge @2C5
		// @25A: aload_0
		// @25B: iload #19
		// @25D: iinc #19 +1
		// @260: iaload
		// @261: istore_1
		// @262: aload #9
		// @264: iload #20
		// @266: iaload
		// @267: iload_1
		// @268: bipush 16 (0x10)
		// @26A: ishr
		// @26B: sipush 255 (0x00FF)
		// @26E: iand
		// @26F: isub
		// @270: istore #21
		// @272: aload #9
		// @274: iload #20
		// @276: iload #21
		// @278: ifge @27F
		// @27B: iconst_0
		// @27C: goto @281
		// @27F: iload #21
		// @281: iastore
		// @282: aload #10
		// @284: iload #20
		// @286: iaload
		// @287: iload_1
		// @288: bipush 8 (0x08)
		// @28A: ishr
		// @28B: sipush 255 (0x00FF)
		// @28E: iand
		// @28F: isub
		// @290: istore #21
		// @292: aload #10
		// @294: iload #20
		// @296: iload #21
		// @298: ifge @29F
		// @29B: iconst_0
		// @29C: goto @2A1
		// @29F: iload #21
		// @2A1: iastore
		// @2A2: aload #11
		// @2A4: iload #20
		// @2A6: iaload
		// @2A7: iload_1
		// @2A8: sipush 255 (0x00FF)
		// @2AB: iand
		// @2AC: isub
		// @2AD: istore #21
		// @2AF: aload #11
		// @2B1: iload #20
		// @2B3: iload #21
		// @2B5: ifge @2BC
		// @2B8: iconst_0
		// @2B9: goto @2BE
		// @2BC: iload #21
		// @2BE: iastore
		// @2BF: iinc #20 +1
		// @2C2: goto @253
		// @2C5: iload #19
		// @2C7: iload #6
		// @2C9: iadd
		// @2CA: istore #19
		// @2CC: iconst_0
		// @2CD: istore #20
		// @2CF: iload #20
		// @2D1: iload #8
		// @2D3: if_icmpge @311
		// @2D6: aload_0
		// @2D7: iload #14
		// @2D9: iinc #14 +1
		// @2DC: iaload
		// @2DD: istore_1
		// @2DE: aload #9
		// @2E0: iload #20
		// @2E2: dup2
		// @2E3: iaload
		// @2E4: iload_1
		// @2E5: bipush 16 (0x10)
		// @2E7: ishr
		// @2E8: sipush 255 (0x00FF)
		// @2EB: iand
		// @2EC: iadd
		// @2ED: iastore
		// @2EE: aload #10
		// @2F0: iload #20
		// @2F2: dup2
		// @2F3: iaload
		// @2F4: iload_1
		// @2F5: bipush 8 (0x08)
		// @2F7: ishr
		// @2F8: sipush 255 (0x00FF)
		// @2FB: iand
		// @2FC: iadd
		// @2FD: iastore
		// @2FE: aload #11
		// @300: iload #20
		// @302: dup2
		// @303: iaload
		// @304: iload_1
		// @305: sipush 255 (0x00FF)
		// @308: iand
		// @309: iadd
		// @30A: iastore
		// @30B: iinc #20 +1
		// @30E: goto @2CF
		// @311: iload #14
		// @313: iload #6
		// @315: iadd
		// @316: istore #14
		// @318: iconst_0
		// @319: istore #20
		// @31B: iload #20
		// @31D: iload #8
		// @31F: if_icmpge @38A
		// @322: aload #9
		// @324: iload #20
		// @326: iaload
		// @327: iload #12
		// @329: imul
		// @32A: bipush 14 (0x0E)
		// @32C: ishr
		// @32D: istore #21
		// @32F: aload #10
		// @331: iload #20
		// @333: iaload
		// @334: iload #12
		// @336: imul
		// @337: bipush 14 (0x0E)
		// @339: ishr
		// @33A: istore #22
		// @33C: aload #11
		// @33E: iload #20
		// @340: iaload
		// @341: iload #12
		// @343: imul
		// @344: bipush 14 (0x0E)
		// @346: ishr
		// @347: istore #23
		// @349: iload #21
		// @34B: sipush 255 (0x00FF)
		// @34E: if_icmple @356
		// @351: sipush 255 (0x00FF)
		// @354: istore #21
		// @356: iload #22
		// @358: sipush 255 (0x00FF)
		// @35B: if_icmple @363
		// @35E: sipush 255 (0x00FF)
		// @361: istore #22
		// @363: iload #23
		// @365: sipush 255 (0x00FF)
		// @368: if_icmple @370
		// @36B: sipush 255 (0x00FF)
		// @36E: istore #23
		// @370: aload_0
		// @371: iload_2
		// @372: iinc #2 +1
		// @375: iload #21
		// @377: bipush 16 (0x10)
		// @379: ishl
		// @37A: iload #22
		// @37C: bipush 8 (0x08)
		// @37E: ishl
		// @37F: iadd
		// @380: iload #23
		// @382: iadd
		// @383: iastore
		// @384: iinc #20 +1
		// @387: goto @31B
		// @38A: iload_2
		// @38B: iload #6
		// @38D: iadd
		// @38E: istore_2
		// @38F: iinc #13 +1
		// @392: goto @249
		// @395: iload #13
		// @397: ifge @47E
		// @39A: iconst_0
		// @39B: istore #20
		// @39D: iload #20
		// @39F: iload #8
		// @3A1: if_icmpge @3DF
		// @3A4: aload_0
		// @3A5: iload #19
		// @3A7: iinc #19 +1
		// @3AA: iaload
		// @3AB: istore_1
		// @3AC: aload #9
		// @3AE: iload #20
		// @3B0: dup2
		// @3B1: iaload
		// @3B2: iload_1
		// @3B3: bipush 16 (0x10)
		// @3B5: ishr
		// @3B6: sipush 255 (0x00FF)
		// @3B9: iand
		// @3BA: isub
		// @3BB: iastore
		// @3BC: aload #10
		// @3BE: iload #20
		// @3C0: dup2
		// @3C1: iaload
		// @3C2: iload_1
		// @3C3: bipush 8 (0x08)
		// @3C5: ishr
		// @3C6: sipush 255 (0x00FF)
		// @3C9: iand
		// @3CA: isub
		// @3CB: iastore
		// @3CC: aload #11
		// @3CE: iload #20
		// @3D0: dup2
		// @3D1: iaload
		// @3D2: iload_1
		// @3D3: sipush 255 (0x00FF)
		// @3D6: iand
		// @3D7: isub
		// @3D8: iastore
		// @3D9: iinc #20 +1
		// @3DC: goto @39D
		// @3DF: iload #19
		// @3E1: iload #6
		// @3E3: iadd
		// @3E4: istore #19
		// @3E6: iinc #17 +255
		// @3E9: iconst_0
		// @3EA: istore #20
		// @3EC: iload #20
		// @3EE: iload #8
		// @3F0: if_icmpge @473
		// @3F3: aload #9
		// @3F5: iload #20
		// @3F7: iaload
		// @3F8: iload #17
		// @3FA: idiv
		// @3FB: istore #21
		// @3FD: aload #10
		// @3FF: iload #20
		// @401: iaload
		// @402: iload #17
		// @404: idiv
		// @405: istore #22
		// @407: aload #11
		// @409: iload #20
		// @40B: iaload
		// @40C: iload #17
		// @40E: idiv
		// @40F: istore #23
		// @411: iload #21
		// @413: ifge @41C
		// @416: iconst_0
		// @417: istore #21
		// @419: goto @429
		// @41C: iload #21
		// @41E: sipush 255 (0x00FF)
		// @421: if_icmple @429
		// @424: sipush 255 (0x00FF)
		// @427: istore #21
		// @429: iload #22
		// @42B: ifge @434
		// @42E: iconst_0
		// @42F: istore #22
		// @431: goto @441
		// @434: iload #22
		// @436: sipush 255 (0x00FF)
		// @439: if_icmple @441
		// @43C: sipush 255 (0x00FF)
		// @43F: istore #22
		// @441: iload #23
		// @443: ifge @44C
		// @446: iconst_0
		// @447: istore #23
		// @449: goto @459
		// @44C: iload #23
		// @44E: sipush 255 (0x00FF)
		// @451: if_icmple @459
		// @454: sipush 255 (0x00FF)
		// @457: istore #23
		// @459: aload_0
		// @45A: iload_2
		// @45B: iinc #2 +1
		// @45E: iload #21
		// @460: bipush 16 (0x10)
		// @462: ishl
		// @463: iload #22
		// @465: bipush 8 (0x08)
		// @467: ishl
		// @468: iadd
		// @469: iload #23
		// @46B: iadd
		// @46C: iastore
		// @46D: iinc #20 +1
		// @470: goto @3EC
		// @473: iload_2
		// @474: iload #6
		// @476: iadd
		// @477: istore_2
		// @478: iinc #13 +1
		// @47B: goto @395
		// @47E: return
	}
	
	static final void func_105787_a(int arg0, int arg1, int arg2, int arg3, int[] arg4)
	{
		// @000: iload_2
		// @001: iload_2
		// @002: imul
		// @003: istore #5
		// @005: iload_0
		// @006: iload_2
		// @007: isub
		// @008: iconst_4
		// @009: ishr
		// @00A: istore #6
		// @00C: iload_0
		// @00D: iload_2
		// @00E: iadd
		// @00F: bipush 15 (0x0F)
		// @011: iadd
		// @012: iconst_4
		// @013: ishr
		// @014: istore #7
		// @016: iload_1
		// @017: iload_2
		// @018: isub
		// @019: iconst_4
		// @01A: ishr
		// @01B: istore #8
		// @01D: iload_1
		// @01E: iload_2
		// @01F: iadd
		// @020: bipush 15 (0x0F)
		// @022: iadd
		// @023: iconst_4
		// @024: ishr
		// @025: istore #9
		// @027: iload #6
		// @029: getstatic int game.C_100196_rb.field_105827_i
		// @02C: if_icmpge @034
		// @02F: getstatic int game.C_100196_rb.field_105827_i
		// @032: istore #6
		// @034: iload #7
		// @036: getstatic int game.C_100196_rb.field_105820_b
		// @039: if_icmple @041
		// @03C: getstatic int game.C_100196_rb.field_105820_b
		// @03F: istore #7
		// @041: iload #8
		// @043: getstatic int game.C_100196_rb.field_105816_f
		// @046: if_icmpge @04E
		// @049: getstatic int game.C_100196_rb.field_105816_f
		// @04C: istore #8
		// @04E: iload #9
		// @050: getstatic int game.C_100196_rb.field_105823_l
		// @053: if_icmple @05B
		// @056: getstatic int game.C_100196_rb.field_105823_l
		// @059: istore #9
		// @05B: iload #6
		// @05D: iconst_4
		// @05E: ishl
		// @05F: iload_0
		// @060: isub
		// @061: istore #10
		// @063: iload #10
		// @065: iload #10
		// @067: imul
		// @068: istore #10
		// @06A: iload #6
		// @06C: iconst_1
		// @06D: iadd
		// @06E: iconst_4
		// @06F: ishl
		// @070: iload_0
		// @071: isub
		// @072: istore #11
		// @074: iload #11
		// @076: iload #11
		// @078: imul
		// @079: istore #11
		// @07B: iload #6
		// @07D: iconst_2
		// @07E: iadd
		// @07F: iconst_4
		// @080: ishl
		// @081: iload_0
		// @082: isub
		// @083: istore #12
		// @085: iload #12
		// @087: iload #12
		// @089: imul
		// @08A: istore #12
		// @08C: iload #11
		// @08E: iload #10
		// @090: isub
		// @091: istore #13
		// @093: iload #12
		// @095: iload #11
		// @097: isub
		// @098: istore #14
		// @09A: iload #14
		// @09C: iload #13
		// @09E: isub
		// @09F: istore #15
		// @0A1: iload #8
		// @0A3: iconst_4
		// @0A4: ishl
		// @0A5: iload_1
		// @0A6: isub
		// @0A7: istore #16
		// @0A9: iload #16
		// @0AB: iload #16
		// @0AD: imul
		// @0AE: istore #16
		// @0B0: iload #8
		// @0B2: iconst_1
		// @0B3: iadd
		// @0B4: iconst_4
		// @0B5: ishl
		// @0B6: iload_1
		// @0B7: isub
		// @0B8: istore #17
		// @0BA: iload #17
		// @0BC: iload #17
		// @0BE: imul
		// @0BF: istore #17
		// @0C1: iload #8
		// @0C3: iconst_2
		// @0C4: iadd
		// @0C5: iconst_4
		// @0C6: ishl
		// @0C7: iload_1
		// @0C8: isub
		// @0C9: istore #18
		// @0CB: iload #18
		// @0CD: iload #18
		// @0CF: imul
		// @0D0: istore #18
		// @0D2: iload #17
		// @0D4: iload #16
		// @0D6: isub
		// @0D7: istore #19
		// @0D9: iload #18
		// @0DB: iload #17
		// @0DD: isub
		// @0DE: istore #20
		// @0E0: iload #20
		// @0E2: iload #19
		// @0E4: isub
		// @0E5: istore #21
		// @0E7: iload #6
		// @0E9: iload #8
		// @0EB: getstatic int game.C_100196_rb.field_105819_e
		// @0EE: imul
		// @0EF: iadd
		// @0F0: istore #22
		// @0F2: getstatic int game.C_100196_rb.field_105819_e
		// @0F5: iload #6
		// @0F7: iadd
		// @0F8: iload #7
		// @0FA: isub
		// @0FB: istore #23
		// @0FD: iconst_0
		// @0FE: iconst_0
		// @0FF: iconst_0
		// @100: iconst_0
		// @101: iconst_0
		// @102: iload #15
		// @104: iload #5
		// @106: iload #22
		// @108: getstatic int[] game.C_100196_rb.field_105818_d
		// @10B: iload_3
		// @10C: aload #4
		// @10E: iload #23
		// @110: iload #13
		// @112: iload #6
		// @114: iload #7
		// @116: isub
		// @117: iload #16
		// @119: iload #10
		// @11B: iadd
		// @11C: iload #19
		// @11E: iload #21
		// @120: iload #8
		// @122: iload #9
		// @124: isub
		// @125: invokestatic game.C_100196_rb.func_105812_a(int, int, int, int, int, int, int, int, int[], int, int[], int, int, int, int, int, int, int)void
		// @128: return
	}
	
	static final void func_105798_b(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @00: iconst_0
		// @01: istore #6
		// @03: ldc 65536 (0x10000)
		// @05: iload_3
		// @06: idiv
		// @07: istore #7
		// @09: iload_0
		// @0A: getstatic int game.C_100196_rb.field_105827_i
		// @0D: if_icmpge @1C
		// @10: iload_2
		// @11: getstatic int game.C_100196_rb.field_105827_i
		// @14: iload_0
		// @15: isub
		// @16: isub
		// @17: istore_2
		// @18: getstatic int game.C_100196_rb.field_105827_i
		// @1B: istore_0
		// @1C: iload_1
		// @1D: getstatic int game.C_100196_rb.field_105816_f
		// @20: if_icmpge @3C
		// @23: iload #6
		// @25: getstatic int game.C_100196_rb.field_105816_f
		// @28: iload_1
		// @29: isub
		// @2A: iload #7
		// @2C: imul
		// @2D: iadd
		// @2E: istore #6
		// @30: iload_3
		// @31: getstatic int game.C_100196_rb.field_105816_f
		// @34: iload_1
		// @35: isub
		// @36: isub
		// @37: istore_3
		// @38: getstatic int game.C_100196_rb.field_105816_f
		// @3B: istore_1
		// @3C: iload_0
		// @3D: iload_2
		// @3E: iadd
		// @3F: getstatic int game.C_100196_rb.field_105820_b
		// @42: if_icmple @4B
		// @45: getstatic int game.C_100196_rb.field_105820_b
		// @48: iload_0
		// @49: isub
		// @4A: istore_2
		// @4B: iload_1
		// @4C: iload_3
		// @4D: iadd
		// @4E: getstatic int game.C_100196_rb.field_105823_l
		// @51: if_icmple @5A
		// @54: getstatic int game.C_100196_rb.field_105823_l
		// @57: iload_1
		// @58: isub
		// @59: istore_3
		// @5A: getstatic int game.C_100196_rb.field_105819_e
		// @5D: iload_2
		// @5E: isub
		// @5F: istore #8
		// @61: iload_0
		// @62: iload_1
		// @63: getstatic int game.C_100196_rb.field_105819_e
		// @66: imul
		// @67: iadd
		// @68: istore #9
		// @6A: iload_3
		// @6B: ineg
		// @6C: istore #10
		// @6E: iload #10
		// @70: ifge @E0
		// @73: ldc 65536 (0x10000)
		// @75: iload #6
		// @77: isub
		// @78: bipush 8 (0x08)
		// @7A: ishr
		// @7B: istore #11
		// @7D: iload #6
		// @7F: bipush 8 (0x08)
		// @81: ishr
		// @82: istore #12
		// @84: iload #4
		// @86: ldc 16711935 (0xff00ff)
		// @88: iand
		// @89: iload #11
		// @8B: imul
		// @8C: iload #5
		// @8E: ldc 16711935 (0xff00ff)
		// @90: iand
		// @91: iload #12
		// @93: imul
		// @94: iadd
		// @95: ldc -16711936 (0xff00ff00)
		// @97: iand
		// @98: iload #4
		// @9A: ldc 65280 (0xff00)
		// @9C: iand
		// @9D: iload #11
		// @9F: imul
		// @A0: iload #5
		// @A2: ldc 65280 (0xff00)
		// @A4: iand
		// @A5: iload #12
		// @A7: imul
		// @A8: iadd
		// @A9: ldc 16711680 (0xff0000)
		// @AB: iand
		// @AC: iadd
		// @AD: bipush 8 (0x08)
		// @AF: iushr
		// @B0: istore #13
		// @B2: iload_2
		// @B3: ineg
		// @B4: istore #14
		// @B6: iload #14
		// @B8: ifge @CC
		// @BB: getstatic int[] game.C_100196_rb.field_105818_d
		// @BE: iload #9
		// @C0: iinc #9 +1
		// @C3: iload #13
		// @C5: iastore
		// @C6: iinc #14 +1
		// @C9: goto @B6
		// @CC: iload #9
		// @CE: iload #8
		// @D0: iadd
		// @D1: istore #9
		// @D3: iload #6
		// @D5: iload #7
		// @D7: iadd
		// @D8: istore #6
		// @DA: iinc #10 +1
		// @DD: goto @6E
		// @E0: return
	}
	
	static final void func_105815_h(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: iload_0
		// @01: ifge @06
		// @04: iconst_0
		// @05: istore_0
		// @06: iload_1
		// @07: ifge @0C
		// @0A: iconst_0
		// @0B: istore_1
		// @0C: iload_2
		// @0D: getstatic int game.C_100196_rb.field_105819_e
		// @10: if_icmple @17
		// @13: getstatic int game.C_100196_rb.field_105819_e
		// @16: istore_2
		// @17: iload_3
		// @18: getstatic int game.C_100196_rb.field_105821_c
		// @1B: if_icmple @22
		// @1E: getstatic int game.C_100196_rb.field_105821_c
		// @21: istore_3
		// @22: iload_0
		// @23: putstatic int game.C_100196_rb.field_105827_i
		// @26: iload_1
		// @27: putstatic int game.C_100196_rb.field_105816_f
		// @2A: iload_2
		// @2B: putstatic int game.C_100196_rb.field_105820_b
		// @2E: iload_3
		// @2F: putstatic int game.C_100196_rb.field_105823_l
		// @32: invokestatic game.C_100196_rb.func_105814_c()void
		// @35: return
	}
	
	static final void func_105793_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @000: iload #4
		// @002: ifne @00F
		// @005: iload_0
		// @006: iload_1
		// @007: iload_2
		// @008: iload_3
		// @009: iload #5
		// @00B: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @00E: return
		// @00F: iload #4
		// @011: ifge @019
		// @014: iload #4
		// @016: ineg
		// @017: istore #4
		// @019: iload_0
		// @01A: iload #4
		// @01C: iadd
		// @01D: istore #6
		// @01F: iload_1
		// @020: iload #4
		// @022: iadd
		// @023: istore #7
		// @025: iload_1
		// @026: istore #8
		// @028: iload #8
		// @02A: getstatic int game.C_100196_rb.field_105816_f
		// @02D: if_icmpge @035
		// @030: getstatic int game.C_100196_rb.field_105816_f
		// @033: istore #8
		// @035: iload_1
		// @036: iload_3
		// @037: iadd
		// @038: istore #9
		// @03A: iload #9
		// @03C: getstatic int game.C_100196_rb.field_105823_l
		// @03F: if_icmple @047
		// @042: getstatic int game.C_100196_rb.field_105823_l
		// @045: istore #9
		// @047: iload_2
		// @048: iload #4
		// @04A: isub
		// @04B: iload #4
		// @04D: isub
		// @04E: iconst_1
		// @04F: isub
		// @050: istore #10
		// @052: iload #8
		// @054: istore #11
		// @056: iload #4
		// @058: iload #4
		// @05A: imul
		// @05B: istore #12
		// @05D: iconst_0
		// @05E: istore #13
		// @060: iload #7
		// @062: iload #11
		// @064: isub
		// @065: istore #14
		// @067: iload #14
		// @069: iload #14
		// @06B: imul
		// @06C: istore #15
		// @06E: iload #15
		// @070: iload #14
		// @072: isub
		// @073: istore #16
		// @075: iload #7
		// @077: iload #9
		// @079: if_icmple @080
		// @07C: iload #9
		// @07E: istore #7
		// @080: iload #11
		// @082: iload #7
		// @084: if_icmpge @120
		// @087: iload #16
		// @089: iload #12
		// @08B: if_icmple @095
		// @08E: iload #15
		// @090: iload #12
		// @092: if_icmpgt @0AF
		// @095: iload #15
		// @097: iload #13
		// @099: iload #13
		// @09B: iadd
		// @09C: iadd
		// @09D: istore #15
		// @09F: iload #16
		// @0A1: iload #13
		// @0A3: iinc #13 +1
		// @0A6: iload #13
		// @0A8: iadd
		// @0A9: iadd
		// @0AA: istore #16
		// @0AC: goto @087
		// @0AF: iload #6
		// @0B1: iload #13
		// @0B3: isub
		// @0B4: iconst_1
		// @0B5: iadd
		// @0B6: istore #17
		// @0B8: iload #17
		// @0BA: getstatic int game.C_100196_rb.field_105827_i
		// @0BD: if_icmpge @0C5
		// @0C0: getstatic int game.C_100196_rb.field_105827_i
		// @0C3: istore #17
		// @0C5: iload #6
		// @0C7: iload #10
		// @0C9: iadd
		// @0CA: iload #13
		// @0CC: iadd
		// @0CD: istore #18
		// @0CF: iload #18
		// @0D1: getstatic int game.C_100196_rb.field_105820_b
		// @0D4: if_icmple @0DC
		// @0D7: getstatic int game.C_100196_rb.field_105820_b
		// @0DA: istore #18
		// @0DC: iload #17
		// @0DE: iload #11
		// @0E0: getstatic int game.C_100196_rb.field_105819_e
		// @0E3: imul
		// @0E4: iadd
		// @0E5: istore #19
		// @0E7: iload #17
		// @0E9: istore #20
		// @0EB: iload #20
		// @0ED: iload #18
		// @0EF: if_icmpge @103
		// @0F2: getstatic int[] game.C_100196_rb.field_105818_d
		// @0F5: iload #19
		// @0F7: iinc #19 +1
		// @0FA: iload #5
		// @0FC: iastore
		// @0FD: iinc #20 +1
		// @100: goto @0EB
		// @103: iinc #11 +1
		// @106: iload #15
		// @108: iload #14
		// @10A: iinc #14 +255
		// @10D: iload #14
		// @10F: iadd
		// @110: isub
		// @111: istore #15
		// @113: iload #16
		// @115: iload #14
		// @117: iload #14
		// @119: iadd
		// @11A: isub
		// @11B: istore #16
		// @11D: goto @080
		// @120: iload #11
		// @122: iload #7
		// @124: isub
		// @125: istore #14
		// @127: iload_0
		// @128: istore #17
		// @12A: iload #17
		// @12C: getstatic int game.C_100196_rb.field_105827_i
		// @12F: if_icmpge @137
		// @132: getstatic int game.C_100196_rb.field_105827_i
		// @135: istore #17
		// @137: iload_0
		// @138: iload_2
		// @139: iadd
		// @13A: istore #18
		// @13C: iload #18
		// @13E: getstatic int game.C_100196_rb.field_105820_b
		// @141: if_icmple @149
		// @144: getstatic int game.C_100196_rb.field_105820_b
		// @147: istore #18
		// @149: iload #17
		// @14B: iload #11
		// @14D: getstatic int game.C_100196_rb.field_105819_e
		// @150: imul
		// @151: iadd
		// @152: istore #19
		// @154: getstatic int game.C_100196_rb.field_105819_e
		// @157: iload #17
		// @159: iadd
		// @15A: iload #18
		// @15C: isub
		// @15D: istore #20
		// @15F: iload_1
		// @160: iload_3
		// @161: iadd
		// @162: iload #4
		// @164: isub
		// @165: iconst_1
		// @166: isub
		// @167: istore #21
		// @169: iload #21
		// @16B: getstatic int game.C_100196_rb.field_105823_l
		// @16E: if_icmple @176
		// @171: getstatic int game.C_100196_rb.field_105823_l
		// @174: istore #21
		// @176: iload #11
		// @178: iload #21
		// @17A: if_icmpge @1A6
		// @17D: iload #17
		// @17F: istore #22
		// @181: iload #22
		// @183: iload #18
		// @185: if_icmpge @199
		// @188: getstatic int[] game.C_100196_rb.field_105818_d
		// @18B: iload #19
		// @18D: iinc #19 +1
		// @190: iload #5
		// @192: iastore
		// @193: iinc #22 +1
		// @196: goto @181
		// @199: iinc #11 +1
		// @19C: iload #19
		// @19E: iload #20
		// @1A0: iadd
		// @1A1: istore #19
		// @1A3: goto @176
		// @1A6: iconst_0
		// @1A7: istore #14
		// @1A9: iload #4
		// @1AB: istore #13
		// @1AD: iload #14
		// @1AF: iload #14
		// @1B1: imul
		// @1B2: iload #12
		// @1B4: iadd
		// @1B5: istore #16
		// @1B7: iload #16
		// @1B9: iload #13
		// @1BB: isub
		// @1BC: istore #15
		// @1BE: iload #16
		// @1C0: iload #14
		// @1C2: isub
		// @1C3: istore #16
		// @1C5: iload #11
		// @1C7: iload #9
		// @1C9: if_icmpge @267
		// @1CC: iload #16
		// @1CE: iload #12
		// @1D0: if_icmple @1F4
		// @1D3: iload #15
		// @1D5: iload #12
		// @1D7: if_icmple @1F4
		// @1DA: iload #16
		// @1DC: iload #13
		// @1DE: iinc #13 +255
		// @1E1: iload #13
		// @1E3: iadd
		// @1E4: isub
		// @1E5: istore #16
		// @1E7: iload #15
		// @1E9: iload #13
		// @1EB: iload #13
		// @1ED: iadd
		// @1EE: isub
		// @1EF: istore #15
		// @1F1: goto @1CC
		// @1F4: iload #6
		// @1F6: iload #13
		// @1F8: isub
		// @1F9: istore #17
		// @1FB: iload #17
		// @1FD: getstatic int game.C_100196_rb.field_105827_i
		// @200: if_icmpge @208
		// @203: getstatic int game.C_100196_rb.field_105827_i
		// @206: istore #17
		// @208: iload #6
		// @20A: iload #10
		// @20C: iadd
		// @20D: iload #13
		// @20F: iadd
		// @210: istore #18
		// @212: iload #18
		// @214: getstatic int game.C_100196_rb.field_105820_b
		// @217: iconst_1
		// @218: isub
		// @219: if_icmple @223
		// @21C: getstatic int game.C_100196_rb.field_105820_b
		// @21F: iconst_1
		// @220: isub
		// @221: istore #18
		// @223: iload #17
		// @225: iload #11
		// @227: getstatic int game.C_100196_rb.field_105819_e
		// @22A: imul
		// @22B: iadd
		// @22C: istore #19
		// @22E: iload #17
		// @230: istore #20
		// @232: iload #20
		// @234: iload #18
		// @236: if_icmpgt @24A
		// @239: getstatic int[] game.C_100196_rb.field_105818_d
		// @23C: iload #19
		// @23E: iinc #19 +1
		// @241: iload #5
		// @243: iastore
		// @244: iinc #20 +1
		// @247: goto @232
		// @24A: iinc #11 +1
		// @24D: iload #16
		// @24F: iload #14
		// @251: iload #14
		// @253: iadd
		// @254: iadd
		// @255: istore #16
		// @257: iload #15
		// @259: iload #14
		// @25B: iinc #14 +1
		// @25E: iload #14
		// @260: iadd
		// @261: iadd
		// @262: istore #15
		// @264: goto @1C5
		// @267: return
	}
	
	static final void func_105778_a(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: iload_0
		// @01: getstatic int game.C_100196_rb.field_105827_i
		// @04: if_icmplt @0E
		// @07: iload_0
		// @08: getstatic int game.C_100196_rb.field_105820_b
		// @0B: if_icmplt @0F
		// @0E: return
		// @0F: iload_1
		// @10: getstatic int game.C_100196_rb.field_105816_f
		// @13: if_icmpge @22
		// @16: iload_2
		// @17: getstatic int game.C_100196_rb.field_105816_f
		// @1A: iload_1
		// @1B: isub
		// @1C: isub
		// @1D: istore_2
		// @1E: getstatic int game.C_100196_rb.field_105816_f
		// @21: istore_1
		// @22: iload_1
		// @23: iload_2
		// @24: iadd
		// @25: getstatic int game.C_100196_rb.field_105823_l
		// @28: if_icmple @31
		// @2B: getstatic int game.C_100196_rb.field_105823_l
		// @2E: iload_1
		// @2F: isub
		// @30: istore_2
		// @31: iload_0
		// @32: iload_1
		// @33: getstatic int game.C_100196_rb.field_105819_e
		// @36: imul
		// @37: iadd
		// @38: istore #4
		// @3A: iconst_0
		// @3B: istore #5
		// @3D: iload #5
		// @3F: iload_2
		// @40: if_icmpge @58
		// @43: getstatic int[] game.C_100196_rb.field_105818_d
		// @46: iload #4
		// @48: iload_3
		// @49: iastore
		// @4A: iinc #5 +1
		// @4D: iload #4
		// @4F: getstatic int game.C_100196_rb.field_105819_e
		// @52: iadd
		// @53: istore #4
		// @55: goto @3D
		// @58: return
	}
	
	static final void func_105782_i(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: iload_0
		// @01: getstatic int game.C_100196_rb.field_105827_i
		// @04: if_icmpge @13
		// @07: iload_2
		// @08: getstatic int game.C_100196_rb.field_105827_i
		// @0B: iload_0
		// @0C: isub
		// @0D: isub
		// @0E: istore_2
		// @0F: getstatic int game.C_100196_rb.field_105827_i
		// @12: istore_0
		// @13: iload_1
		// @14: getstatic int game.C_100196_rb.field_105816_f
		// @17: if_icmpge @26
		// @1A: iload_3
		// @1B: getstatic int game.C_100196_rb.field_105816_f
		// @1E: iload_1
		// @1F: isub
		// @20: isub
		// @21: istore_3
		// @22: getstatic int game.C_100196_rb.field_105816_f
		// @25: istore_1
		// @26: iload_0
		// @27: iload_2
		// @28: iadd
		// @29: getstatic int game.C_100196_rb.field_105820_b
		// @2C: if_icmple @35
		// @2F: getstatic int game.C_100196_rb.field_105820_b
		// @32: iload_0
		// @33: isub
		// @34: istore_2
		// @35: iload_1
		// @36: iload_3
		// @37: iadd
		// @38: getstatic int game.C_100196_rb.field_105823_l
		// @3B: if_icmple @44
		// @3E: getstatic int game.C_100196_rb.field_105823_l
		// @41: iload_1
		// @42: isub
		// @43: istore_3
		// @44: getstatic int game.C_100196_rb.field_105819_e
		// @47: iload_2
		// @48: isub
		// @49: istore #5
		// @4B: iload_0
		// @4C: iload_1
		// @4D: getstatic int game.C_100196_rb.field_105819_e
		// @50: imul
		// @51: iadd
		// @52: istore #6
		// @54: iload_3
		// @55: ineg
		// @56: istore #7
		// @58: iload #7
		// @5A: ifge @84
		// @5D: iload_2
		// @5E: ineg
		// @5F: istore #8
		// @61: iload #8
		// @63: ifge @77
		// @66: getstatic int[] game.C_100196_rb.field_105818_d
		// @69: iload #6
		// @6B: iinc #6 +1
		// @6E: iload #4
		// @70: iastore
		// @71: iinc #8 +1
		// @74: goto @61
		// @77: iload #6
		// @79: iload #5
		// @7B: iadd
		// @7C: istore #6
		// @7E: iinc #7 +1
		// @81: goto @58
		// @84: return
	}
	
	static final void func_105781_a()
	{
		// @00: iconst_0
		// @01: putstatic int game.C_100196_rb.field_105827_i
		// @04: iconst_0
		// @05: putstatic int game.C_100196_rb.field_105816_f
		// @08: getstatic int game.C_100196_rb.field_105819_e
		// @0B: putstatic int game.C_100196_rb.field_105820_b
		// @0E: getstatic int game.C_100196_rb.field_105821_c
		// @11: putstatic int game.C_100196_rb.field_105823_l
		// @14: invokestatic game.C_100196_rb.func_105814_c()void
		// @17: return
	}
	
	static final void func_105784_h(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: iload_0
		// @01: iload_1
		// @02: iload_2
		// @03: iload #4
		// @05: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @08: iload_0
		// @09: iload_1
		// @0A: iload_3
		// @0B: iadd
		// @0C: iconst_1
		// @0D: isub
		// @0E: iload_2
		// @0F: iload #4
		// @11: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @14: iload_0
		// @15: iload_1
		// @16: iload_3
		// @17: iload #4
		// @19: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @1C: iload_0
		// @1D: iload_2
		// @1E: iadd
		// @1F: iconst_1
		// @20: isub
		// @21: iload_1
		// @22: iload_3
		// @23: iload #4
		// @25: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @28: return
	}
	
	static final void func_105803_a(int arg0, int arg1, int arg2)
	{
		// @00: iload_0
		// @01: getstatic int game.C_100196_rb.field_105827_i
		// @04: if_icmplt @1C
		// @07: iload_1
		// @08: getstatic int game.C_100196_rb.field_105816_f
		// @0B: if_icmplt @1C
		// @0E: iload_0
		// @0F: getstatic int game.C_100196_rb.field_105820_b
		// @12: if_icmpge @1C
		// @15: iload_1
		// @16: getstatic int game.C_100196_rb.field_105823_l
		// @19: if_icmplt @1D
		// @1C: return
		// @1D: iload_0
		// @1E: iload_1
		// @1F: getstatic int game.C_100196_rb.field_105819_e
		// @22: imul
		// @23: iadd
		// @24: istore_3
		// @25: getstatic int[] game.C_100196_rb.field_105818_d
		// @28: iload_3
		// @29: iaload
		// @2A: istore #4
		// @2C: iload_2
		// @2D: iload #4
		// @2F: iadd
		// @30: istore #5
		// @32: iload_2
		// @33: ldc 16711935 (0xff00ff)
		// @35: iand
		// @36: iload #4
		// @38: ldc 16711935 (0xff00ff)
		// @3A: iand
		// @3B: iadd
		// @3C: istore_2
		// @3D: iload_2
		// @3E: ldc 16777472 (0x1000100)
		// @40: iand
		// @41: iload #5
		// @43: iload_2
		// @44: isub
		// @45: ldc 65536 (0x10000)
		// @47: iand
		// @48: iadd
		// @49: istore #4
		// @4B: getstatic int[] game.C_100196_rb.field_105818_d
		// @4E: iload_3
		// @4F: iload #5
		// @51: iload #4
		// @53: isub
		// @54: iload #4
		// @56: iload #4
		// @58: bipush 8 (0x08)
		// @5A: iushr
		// @5B: isub
		// @5C: ior
		// @5D: iastore
		// @5E: return
	}
	
	static
	{
		// @00: iconst_0
		// @01: putstatic int game.C_100196_rb.field_105823_l
		// @04: iconst_0
		// @05: putstatic int game.C_100196_rb.field_105827_i
		// @08: iconst_0
		// @09: putstatic int game.C_100196_rb.field_105820_b
		// @0C: iconst_0
		// @0D: putstatic int game.C_100196_rb.field_105816_f
		// @10: return
	}
}
